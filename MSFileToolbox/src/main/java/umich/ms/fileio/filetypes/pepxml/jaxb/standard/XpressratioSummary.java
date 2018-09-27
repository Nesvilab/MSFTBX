
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

package umich.ms.fileio.filetypes.pepxml.jaxb.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="author" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="same_scan_range" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="labeled_residues" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="xpress_light" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="masstol" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ppmtol" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="min_num_chromatogram_points" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="min_num_isotope_peaks" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "xpressratio_summary")
public class XpressratioSummary {

  @XmlAttribute(name = "version", required = true)
  protected String version;
  @XmlAttribute(name = "author", required = true)
  protected String author;
  @XmlAttribute(name = "same_scan_range", required = true)
  protected String sameScanRange;
  @XmlAttribute(name = "labeled_residues", required = true)
  protected String labeledResidues;
  @XmlAttribute(name = "xpress_light", required = true)
  @XmlSchemaType(name = "unsignedInt")
  protected long xpressLight;
  @XmlAttribute(name = "massdiff", required = true)
  protected double massdiff;
  @XmlAttribute(name = "masstol", required = true)
  protected double masstol;
  @XmlAttribute(name = "ppmtol", required = true)
  protected double ppmtol;
  @XmlAttribute(name = "min_num_chromatogram_points", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer minNumChromatogramPoints;
  @XmlAttribute(name = "min_num_isotope_peaks", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer minNumIsotopePeaks;

  /**
   * Gets the value of the version property.
   *
   * @return possible object is {@link String }
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the value of the version property.
   *
   * @param value allowed object is {@link String }
   */
  public void setVersion(String value) {
    this.version = value;
  }

  /**
   * Gets the value of the author property.
   *
   * @return possible object is {@link String }
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Sets the value of the author property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAuthor(String value) {
    this.author = value;
  }

  /**
   * Gets the value of the sameScanRange property.
   *
   * @return possible object is {@link String }
   */
  public String getSameScanRange() {
    return sameScanRange;
  }

  /**
   * Sets the value of the sameScanRange property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSameScanRange(String value) {
    this.sameScanRange = value;
  }

  /**
   * Gets the value of the labeledResidues property.
   *
   * @return possible object is {@link String }
   */
  public String getLabeledResidues() {
    return labeledResidues;
  }

  /**
   * Sets the value of the labeledResidues property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLabeledResidues(String value) {
    this.labeledResidues = value;
  }

  /**
   * Gets the value of the xpressLight property.
   */
  public long getXpressLight() {
    return xpressLight;
  }

  /**
   * Sets the value of the xpressLight property.
   */
  public void setXpressLight(long value) {
    this.xpressLight = value;
  }

  /**
   * Gets the value of the massdiff property.
   */
  public double getMassdiff() {
    return massdiff;
  }

  /**
   * Sets the value of the massdiff property.
   */
  public void setMassdiff(double value) {
    this.massdiff = value;
  }

  /**
   * Gets the value of the masstol property.
   */
  public double getMasstol() {
    return masstol;
  }

  /**
   * Sets the value of the masstol property.
   */
  public void setMasstol(double value) {
    this.masstol = value;
  }

  /**
   * Gets the value of the ppmtol property.
   */
  public double getPpmtol() {
    return ppmtol;
  }

  /**
   * Sets the value of the ppmtol property.
   */
  public void setPpmtol(double value) {
    this.ppmtol = value;
  }

  /**
   * Gets the value of the minNumChromatogramPoints property.
   *
   * @return possible object is {@link String }
   */
  public Integer getMinNumChromatogramPoints() {
    return minNumChromatogramPoints;
  }

  /**
   * Sets the value of the minNumChromatogramPoints property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMinNumChromatogramPoints(Integer value) {
    this.minNumChromatogramPoints = value;
  }

  /**
   * Gets the value of the minNumIsotopePeaks property.
   *
   * @return possible object is {@link String }
   */
  public Integer getMinNumIsotopePeaks() {
    return minNumIsotopePeaks;
  }

  /**
   * Sets the value of the minNumIsotopePeaks property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMinNumIsotopePeaks(Integer value) {
    this.minNumIsotopePeaks = value;
  }

}
