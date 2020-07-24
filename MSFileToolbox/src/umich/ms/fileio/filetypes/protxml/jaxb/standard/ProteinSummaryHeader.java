
/*
 * Copyright (c) 2017 Dmitry Avtonomov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package umich.ms.fileio.filetypes.protxml.jaxb.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="program_details">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="reference_database" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="win-cyg_reference_database" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="residue_substitution_list" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="organism" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source_files" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source_files_alt" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="win-cyg_source_files" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source_file_xtn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min_peptide_probability" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="min_peptide_weight" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="num_predicted_correct_prots" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="num_input_1_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="num_input_2_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="num_input_3_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="num_input_4_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="num_input_5_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="initial_min_peptide_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="total_no_spectrum_ids" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="sample_enzyme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "programDetails"
})
public class ProteinSummaryHeader {

  @XmlElement(name = "program_details", required = true)
  protected ProgramDetails programDetails;
  @XmlAttribute(name = "reference_database", required = true)
  protected String referenceDatabase;
  @XmlAttribute(name = "win-cyg_reference_database")
  protected String winCygReferenceDatabase;
  @XmlAttribute(name = "residue_substitution_list")
  protected String residueSubstitutionList;
  @XmlAttribute(name = "organism")
  protected String organism;
  @XmlAttribute(name = "source_files", required = true)
  protected String sourceFiles;
  @XmlAttribute(name = "source_files_alt", required = true)
  protected String sourceFilesAlt;
  @XmlAttribute(name = "win-cyg_source_files")
  protected String winCygSourceFiles;
  @XmlAttribute(name = "source_file_xtn")
  protected String sourceFileXtn;
  @XmlAttribute(name = "min_peptide_probability", required = true)
  protected double minPeptideProbability;
  @XmlAttribute(name = "min_peptide_weight", required = true)
  protected double minPeptideWeight;
  @XmlAttribute(name = "num_predicted_correct_prots", required = true)
  protected double numPredictedCorrectProts;
  @XmlAttribute(name = "num_input_1_spectra", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer numInput1Spectra;
  @XmlAttribute(name = "num_input_2_spectra", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer numInput2Spectra;
  @XmlAttribute(name = "num_input_3_spectra", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer numInput3Spectra;
  @XmlAttribute(name = "num_input_4_spectra", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer numInput4Spectra;
  @XmlAttribute(name = "num_input_5_spectra", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer numInput5Spectra;
  @XmlAttribute(name = "initial_min_peptide_prob", required = true)
  protected double initialMinPeptideProb;
  @XmlAttribute(name = "total_no_spectrum_ids")
  protected Double totalNoSpectrumIds;
  @XmlAttribute(name = "sample_enzyme", required = true)
  protected String sampleEnzyme;

  /**
   * Gets the value of the programDetails property.
   *
   * @return possible object is {@link ProgramDetails }
   */
  public ProgramDetails getProgramDetails() {
    return programDetails;
  }

  /**
   * Sets the value of the programDetails property.
   *
   * @param value allowed object is {@link ProgramDetails }
   */
  public void setProgramDetails(ProgramDetails value) {
    this.programDetails = value;
  }

  /**
   * Gets the value of the referenceDatabase property.
   *
   * @return possible object is {@link String }
   */
  public String getReferenceDatabase() {
    return referenceDatabase;
  }

  /**
   * Sets the value of the referenceDatabase property.
   *
   * @param value allowed object is {@link String }
   */
  public void setReferenceDatabase(String value) {
    this.referenceDatabase = value;
  }

  /**
   * Gets the value of the winCygReferenceDatabase property.
   *
   * @return possible object is {@link String }
   */
  public String getWinCygReferenceDatabase() {
    return winCygReferenceDatabase;
  }

  /**
   * Sets the value of the winCygReferenceDatabase property.
   *
   * @param value allowed object is {@link String }
   */
  public void setWinCygReferenceDatabase(String value) {
    this.winCygReferenceDatabase = value;
  }

  /**
   * Gets the value of the residueSubstitutionList property.
   *
   * @return possible object is {@link String }
   */
  public String getResidueSubstitutionList() {
    return residueSubstitutionList;
  }

  /**
   * Sets the value of the residueSubstitutionList property.
   *
   * @param value allowed object is {@link String }
   */
  public void setResidueSubstitutionList(String value) {
    this.residueSubstitutionList = value;
  }

  /**
   * Gets the value of the organism property.
   *
   * @return possible object is {@link String }
   */
  public String getOrganism() {
    return organism;
  }

  /**
   * Sets the value of the organism property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOrganism(String value) {
    this.organism = value;
  }

  /**
   * Gets the value of the sourceFiles property.
   *
   * @return possible object is {@link String }
   */
  public String getSourceFiles() {
    return sourceFiles;
  }

  /**
   * Sets the value of the sourceFiles property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSourceFiles(String value) {
    this.sourceFiles = value;
  }

  /**
   * Gets the value of the sourceFilesAlt property.
   *
   * @return possible object is {@link String }
   */
  public String getSourceFilesAlt() {
    return sourceFilesAlt;
  }

  /**
   * Sets the value of the sourceFilesAlt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSourceFilesAlt(String value) {
    this.sourceFilesAlt = value;
  }

  /**
   * Gets the value of the winCygSourceFiles property.
   *
   * @return possible object is {@link String }
   */
  public String getWinCygSourceFiles() {
    return winCygSourceFiles;
  }

  /**
   * Sets the value of the winCygSourceFiles property.
   *
   * @param value allowed object is {@link String }
   */
  public void setWinCygSourceFiles(String value) {
    this.winCygSourceFiles = value;
  }

  /**
   * Gets the value of the sourceFileXtn property.
   *
   * @return possible object is {@link String }
   */
  public String getSourceFileXtn() {
    return sourceFileXtn;
  }

  /**
   * Sets the value of the sourceFileXtn property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSourceFileXtn(String value) {
    this.sourceFileXtn = value;
  }

  /**
   * Gets the value of the minPeptideProbability property.
   */
  public double getMinPeptideProbability() {
    return minPeptideProbability;
  }

  /**
   * Sets the value of the minPeptideProbability property.
   */
  public void setMinPeptideProbability(double value) {
    this.minPeptideProbability = value;
  }

  /**
   * Gets the value of the minPeptideWeight property.
   */
  public double getMinPeptideWeight() {
    return minPeptideWeight;
  }

  /**
   * Sets the value of the minPeptideWeight property.
   */
  public void setMinPeptideWeight(double value) {
    this.minPeptideWeight = value;
  }

  /**
   * Gets the value of the numPredictedCorrectProts property.
   */
  public double getNumPredictedCorrectProts() {
    return numPredictedCorrectProts;
  }

  /**
   * Sets the value of the numPredictedCorrectProts property.
   */
  public void setNumPredictedCorrectProts(double value) {
    this.numPredictedCorrectProts = value;
  }

  /**
   * Gets the value of the numInput1Spectra property.
   *
   * @return possible object is {@link String }
   */
  public Integer getNumInput1Spectra() {
    return numInput1Spectra;
  }

  /**
   * Sets the value of the numInput1Spectra property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNumInput1Spectra(Integer value) {
    this.numInput1Spectra = value;
  }

  /**
   * Gets the value of the numInput2Spectra property.
   *
   * @return possible object is {@link String }
   */
  public Integer getNumInput2Spectra() {
    return numInput2Spectra;
  }

  /**
   * Sets the value of the numInput2Spectra property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNumInput2Spectra(Integer value) {
    this.numInput2Spectra = value;
  }

  /**
   * Gets the value of the numInput3Spectra property.
   *
   * @return possible object is {@link String }
   */
  public Integer getNumInput3Spectra() {
    return numInput3Spectra;
  }

  /**
   * Sets the value of the numInput3Spectra property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNumInput3Spectra(Integer value) {
    this.numInput3Spectra = value;
  }

  /**
   * Gets the value of the numInput4Spectra property.
   *
   * @return possible object is {@link String }
   */
  public Integer getNumInput4Spectra() {
    return numInput4Spectra;
  }

  /**
   * Sets the value of the numInput4Spectra property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNumInput4Spectra(Integer value) {
    this.numInput4Spectra = value;
  }

  /**
   * Gets the value of the numInput5Spectra property.
   *
   * @return possible object is {@link String }
   */
  public Integer getNumInput5Spectra() {
    return numInput5Spectra;
  }

  /**
   * Sets the value of the numInput5Spectra property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNumInput5Spectra(Integer value) {
    this.numInput5Spectra = value;
  }

  /**
   * Gets the value of the initialMinPeptideProb property.
   */
  public double getInitialMinPeptideProb() {
    return initialMinPeptideProb;
  }

  /**
   * Sets the value of the initialMinPeptideProb property.
   */
  public void setInitialMinPeptideProb(double value) {
    this.initialMinPeptideProb = value;
  }

  /**
   * Gets the value of the totalNoSpectrumIds property.
   *
   * @return possible object is {@link Double }
   */
  public Double getTotalNoSpectrumIds() {
    return totalNoSpectrumIds;
  }

  /**
   * Sets the value of the totalNoSpectrumIds property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setTotalNoSpectrumIds(Double value) {
    this.totalNoSpectrumIds = value;
  }

  /**
   * Gets the value of the sampleEnzyme property.
   *
   * @return possible object is {@link String }
   */
  public String getSampleEnzyme() {
    return sampleEnzyme;
  }

  /**
   * Sets the value of the sampleEnzyme property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSampleEnzyme(String value) {
    this.sampleEnzyme = value;
  }

}
