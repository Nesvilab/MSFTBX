/* 
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.fileio.filetypes.mzxml;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;import java.util.TreeMap;
import javax.xml.bind.JAXBException;
import javolution.xml.internal.stream.XMLStreamReaderImpl;
import org.apache.commons.pool2.ObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import umich.ms.datatypes.LCMSDataSubset;
import umich.ms.datatypes.lcmsrun.LCMSRunInfo;
import umich.ms.datatypes.scan.IScan;
import umich.ms.datatypes.scan.StorageStrategy;
import umich.ms.datatypes.scancollection.IScanCollection;
import umich.ms.datatypes.scancollection.impl.ScanCollectionDefault;
import umich.ms.datatypes.spectrum.ISpectrum;
import umich.ms.fileio.exceptions.FileParsingException;
import umich.ms.fileio.filetypes.xmlbased.AbstractXMLBasedDataSource;
import umich.ms.fileio.filetypes.xmlbased.IndexBuilder;

import static umich.ms.logging.LogHelper.configureJavaUtilLogging;

import umich.ms.fileio.util.FileListing;
import umich.ms.util.DoubleRange;
import umich.ms.util.Interval1D;
import umich.ms.util.IntervalST;

/**
 * @author Dmitry Avtonomov
 */
public class MZXMLFile extends AbstractXMLBasedDataSource<MZXMLIndexElement, MZXMLIndex> {
    private MZXMLIndex index;

    /**
     *
     * @param path Path to the file
     */
    public MZXMLFile(String path) {
        super(path);
    }

    /**
     * MzXML file constructor.
     * @param path path to the original file.
     * @param excludeEmptyScans if true, will enable the use of advanced memory handling features.
     */
    public MZXMLFile(String path, boolean excludeEmptyScans) {
        super(path);
        this.excludeEmptyScans = excludeEmptyScans;
    }

    public ObjectPool<XMLStreamReaderImpl> getReaderPool() {
        return readerPool;
    }

    @Override
    public MZXMLIndex getIndex() {
        return index;
    }

    @Override
    public MZXMLIndex parseIndex() throws FileParsingException {
        MZXMLIndexParser parser = new MZXMLIndexParser(this);
        return parser.parse();
    }

    @Override
    public MZXMLIndex fetchIndex() throws FileParsingException {
        MZXMLIndex tmp = index;
        if (tmp == null) {
            synchronized (this) {
                tmp = getIndex();
                if (tmp == null) {
                    tmp = parseIndex();
                    index = tmp;
                }
            }
        }
        return tmp;
    }


    @Override
    public LCMSRunInfo parseRunInfo() throws FileParsingException {
        MZXMLRunHeaderParser parser = new MZXMLRunHeaderParser(this);
        return parser.parse();
    }

    @Override
    protected void releaseResources() {
        index = null;
    }

    @Override
    public MZXMLMultiSpectraParser getSpectraParser(InputStream inputStream,
            LCMSDataSubset subset, ObjectPool<XMLStreamReaderImpl> readerPool, Integer numSpectra) {
        MZXMLMultiSpectraParser parser;
        try {
            parser = new MZXMLMultiSpectraParser(inputStream, subset, this);
        } catch (FileParsingException ex) {
            throw new IllegalStateException(ex);
        }
        parser.setNumScansToProcess(numSpectra);
        parser.setReaderPool(readerPool);
        return parser;
    }

    @Override
    public IndexBuilder<MZXMLIndexElement> getIndexBuilder(IndexBuilder.Info info) {
        return new MZXMLIndexBuilder(info, getReaderPool());
    }

    @Override
    protected MZXMLIndex fixIndex(MZXMLIndex idx) {
        super.fixIndex(idx);
        int curInternalNum = 1;
        MZXMLIndexElement eOld, eNew;
        MZXMLIndex newIndex = new MZXMLIndex();
        Set<Map.Entry<Integer, MZXMLIndexElement>> entries = idx.getMapByNum().entrySet();
        for (Map.Entry<Integer, MZXMLIndexElement> entry : entries) {
            eOld = entry.getValue();
            eNew = new MZXMLIndexElement(curInternalNum, eOld.getRawNumber(), eOld.getOffsetLength());
            newIndex.add(eNew);
            curInternalNum += 1;
        }
        return newIndex;
    }

    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    //////////                                             //////////
    //////////                 MAIN                        //////////
    //////////                                             //////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /**
     * Use this for testing only
     * @param args
     * @throws umich.ms.fileio.exceptions.FileParsingException
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws FileParsingException, JAXBException {
        configureJavaUtilLogging();
        Logger logger = LoggerFactory.getLogger(MZXMLFile.class);
        // check arguments
        if (args.length == 0) {
            System.out.println("Give me a dollar. And a list of mzXML files. E.g.: " + "\n\tjava -jar msftbx.jar ./*.mzXML");
            System.exit(0);
        }

        // aggregate paths found on the command line
        String[] filenames = args;
        Integer numThreads = null;
        Integer numSpectraPerThread = 50;
        List<Path> paths = new ArrayList<>();
        for (int i=0; i < filenames.length; i++) {
            String filename = filenames[i];
            if (i == 0) {
                try {
                    int numThreadsParsed = Integer.parseInt(filename);
                    numThreads = numThreadsParsed;
                    System.out.printf("Setting number of threads to: %d\n", numThreadsParsed);
                    continue;
                } catch (NumberFormatException e) {
                    // no worries, it's ok
                }
            }
            if (i == 1) {
                try {
                    int numSpectraPerThreadParsed = Integer.parseInt(filename);
                    numSpectraPerThread = numSpectraPerThreadParsed;
                    System.out.printf("Setting number of spectra per thread to: %d\n", numSpectraPerThreadParsed);
                    continue;
                } catch (NumberFormatException e) {
                    // it's ok
                }
            }

            Path path = Paths.get(filename).toAbsolutePath();
            if (!Files.exists(path)) {
                System.err.println("File does not exist: " + path.toString());
                System.exit(1);
            }
            if (Files.isRegularFile(path)) {
                paths.add(path);
            } else if (Files.isDirectory(path)) {
                FileListing fileListing = new FileListing(path, ".*\\.mzXML");
                fileListing.setFollowLinks(false);
                fileListing.setRecursive(false);
                paths.addAll(fileListing.findFiles());
            }
        }
        // iterate over the files, parsing them
        IScanCollection scanCollection;
        for (Path path : paths) {
            double fileSize = path.toFile().length() / (1024 * 1024);
            System.out.printf("File: %s (%.2fMb)\n", path.toString(), fileSize);
            MZXMLFile mzxml = new MZXMLFile(path.toString(), false);
            mzxml.setNumThreadsForParsing(numThreads);
            mzxml.setTasksPerCpuPerBatch(numSpectraPerThread);
            mzxml.setParsingTimeout(30 * 1000);
            long startTime = System.nanoTime();
            // parse index
            MZXMLIndex idx = mzxml.fetchIndex();
            if (idx.size() > 0) {
                MZXMLIndexElement byNum = idx.getByNum(1);
                MZXMLIndexElement byRawNum = idx.getByRawNum(byNum.getRawNumber());
                MZXMLIndexElement byId = idx.getById(byNum.getId());
            } else {
                System.err.println("Parsed index was empty!");
            }

            NavigableMap<Integer, MZXMLIndexElement> index = mzxml.fetchIndex().getMapByNum();
            double timeSpentParsingIndex = (System.nanoTime() - startTime) / 1e9;
            System.out.printf("It took: %.2f seconds to parse index (%d spectra)\n", timeSpentParsingIndex, index.size());
            LCMSRunInfo lcmsRunInfo = mzxml.fetchRunInfo();
            scanCollection = null;
            boolean parseList = false;
            if (parseList) {
                // parse structure
                startTime = System.nanoTime();
                mzxml.time_reading = 0;
                //                List<Integer> integers = Arrays.asList(index.subMap(0, 100).keySet().toArray(new Integer[0]));
                List<Integer> integers = Arrays.asList(index.keySet().toArray(new Integer[0]));
                List<IScan> parsedScans = mzxml.parse(integers);
                scanCollection = new ScanCollectionDefault(false);
                for (IScan parsedScan : parsedScans) {
                    scanCollection.addScan(parsedScan);
                }
                double timeSpentParsingStructure = (System.nanoTime() - startTime) / 1e9;
                int numSpectraStructure = scanCollection.getScanCount();
                System.out.printf("It took: %.2f seconds to parse structure of all scans (%d spectra, %.2f spec/s, %.2f Mb/s)\n", timeSpentParsingStructure, numSpectraStructure, numSpectraStructure / timeSpentParsingStructure, fileSize / timeSpentParsingStructure);
                mzxml.time_reading = 0;
            } else {
                // parse the scans
                startTime = System.nanoTime();
                mzxml.time_reading = 0;
                LCMSDataSubset subset = LCMSDataSubset.WHOLE_RUN;
                scanCollection = new ScanCollectionDefault(false);
                scanCollection.setDataSource(mzxml);
                scanCollection.loadData(subset, StorageStrategy.STRONG);
                boolean loadMs2 = false;
                if (loadMs2) {
                    HashSet<Integer> msLvl2 = new HashSet<>();
                    msLvl2.add(2);
                    IntervalST<Double, TreeMap<Integer, IScan>> ms2ranges = scanCollection.getMapMsLevel2rangeGroups().get(2);
                    if (ms2ranges != null) {
                        Iterator<IntervalST.Node<Double, TreeMap<Integer, IScan>>> ms2RangesIter = ms2ranges.iterator();
                        IntervalST.Node<Double, TreeMap<Integer, IScan>> firstNode = ms2RangesIter.next();
                        Interval1D<Double> interval = firstNode.getInterval();
                        DoubleRange doubleRange = DoubleRange.fromInterval1D(interval);
                        ArrayList<DoubleRange> doubleRanges = new ArrayList<>(1);
                        doubleRanges.add(doubleRange);
                        List<IScan> listMS2ScansFirstGroup = mzxml.parse(new LCMSDataSubset(null, null, msLvl2, doubleRanges));
                        int a = 1;
                        IntervalST.Node<Double, TreeMap<Integer, IScan>> secondGroup = ms2RangesIter.next();
                        List<Integer> scanNumsInSecondGroup = Arrays.asList(secondGroup.getValue().keySet().toArray(new Integer[0]));
                        List<IScan> listMS2ScansSecondGroup = mzxml.parse(scanNumsInSecondGroup);
                        a = 2;
                    }
                    // TODO: the parsing method for LCMSDataProvider.parse(List<Integer>) to LCMSDataProvider.parse(Iterable<Integer>)
                }
                double timeSpentParsingSpectra = (System.nanoTime() - startTime) / 1e9;
                int numSpectra = scanCollection.getScanCount();
                System.out.printf("It took: %.2f seconds to parse all scans (%d spectra, %.2f spec/s, %.2f Mb/s)\n", timeSpentParsingSpectra, numSpectra, numSpectra / timeSpentParsingSpectra, fileSize / timeSpentParsingSpectra);
                double timeIO = mzxml.time_reading / 1e9;
                System.out.printf("Out of which %.2fs were spent on IO (%.2fMb/s).\n", timeIO, fileSize / timeIO);
                mzxml.time_reading = 0;
            }
            // print a part of the first spectrumRef
            if (!scanCollection.getMapNum2scan().isEmpty()) {
                IScan scan = scanCollection.getMapNum2scan().firstEntry().getValue();
                ISpectrum spectrum = scan.getSpectrum();
                if (spectrum != null) {
                    double[] mzs = spectrum.getMZs();
                    System.out.print("First ten valus of m/z array of the 1st scan:\n\t");
                    for (int i = 0; i < mzs.length && i < 10; i++) {
                        System.out.printf("%.3f ", mzs[i]);
                    }
                    System.out.println();
                } else {
                    System.out.println("The first scan is there, but the spectrum has not been parsed.");
                }
            }
            // do count the total number of peaks in the file
            TreeMap<Integer, IScan> num2scanMap = scanCollection.getMapNum2scan();
            Set<Map.Entry<Integer, IScan>> num2scanEntries = num2scanMap.entrySet();
            int counterMzIntPairs = 0;
            for (Map.Entry<Integer, IScan> next : num2scanEntries) {
                IScan scan = next.getValue();
                if (scan.getSpectrum() != null) {
                    counterMzIntPairs += scan.getSpectrum().getMZs().length;
                }
            }
            System.out.printf("Total number of mz-intensity pairs: %d\n", counterMzIntPairs);
            DecimalFormat formatter = new DecimalFormat("0.##E0");
            double doubleArraysSizeMb = ((double) counterMzIntPairs * 2 * 8) / (double) (1024 * 1024);
            System.out.printf("Thas is: %s (%.2fMB in doubles)\n", formatter.format(counterMzIntPairs), doubleArraysSizeMb);
            // iterate over precursor windows, printing MS1 ranges and MSn precursor window groups
            TreeMap<Integer, IntervalST<Double, TreeMap<Integer, IScan>>> mapMsLevel2rangeGroups = scanCollection.getMapMsLevel2rangeGroups();
            Set<Map.Entry<Integer, IntervalST<Double, TreeMap<Integer, IScan>>>> entries = mapMsLevel2rangeGroups.entrySet();
            for (Map.Entry<Integer, IntervalST<Double, TreeMap<Integer, IScan>>> next : entries) {
                Integer msLevel = next.getKey();
                IntervalST<Double, TreeMap<Integer, IScan>> mzRangesAtMsLevel = next.getValue();
                System.out.printf("Tree at MS level: %d\n", msLevel);
                Iterator<IntervalST.Node<Double, TreeMap<Integer, IScan>>> iterIntervalTree = mzRangesAtMsLevel.iterator();
                while (iterIntervalTree.hasNext()) {
                    IntervalST.Node<Double, TreeMap<Integer, IScan>> range = iterIntervalTree.next();
                    System.out.printf("Interval: %s contains %d scans\n", range.getInterval().toString(), range.getValue().size());
                }
                System.out.println("=================");
                System.out.println();
            }
        }
    }

}
