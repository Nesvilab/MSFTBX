
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
 *       &lt;attribute name="bin_no" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ni_lower_bound_incl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ni_upper_bound_excl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ni_lower_bound_excl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ni_upper_bound_incl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pos_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="neg_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="pos_to_neg_ratio" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="alt_pos_to_neg_ratio" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class NiDistribution {

  @XmlAttribute(name = "bin_no", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "integer")
  protected Integer binNo;
  @XmlAttribute(name = "ni_lower_bound_incl")
  protected Double niLowerBoundIncl;
  @XmlAttribute(name = "ni_upper_bound_excl")
  protected String niUpperBoundExcl;
  @XmlAttribute(name = "ni_lower_bound_excl")
  protected Double niLowerBoundExcl;
  @XmlAttribute(name = "ni_upper_bound_incl")
  protected String niUpperBoundIncl;
  @XmlAttribute(name = "pos_freq", required = true)
  protected double posFreq;
  @XmlAttribute(name = "neg_freq", required = true)
  protected double negFreq;
  @XmlAttribute(name = "pos_to_neg_ratio", required = true)
  protected double posToNegRatio;
  @XmlAttribute(name = "alt_pos_to_neg_ratio")
  protected Double altPosToNegRatio;

  /**
   * Gets the value of the binNo property.
   *
   * @return possible object is {@link String }
   */
  public Integer getBinNo() {
    return binNo;
  }

  /**
   * Sets the value of the binNo property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBinNo(Integer value) {
    this.binNo = value;
  }

  /**
   * Gets the value of the niLowerBoundIncl property.
   *
   * @return possible object is {@link Double }
   */
  public Double getNiLowerBoundIncl() {
    return niLowerBoundIncl;
  }

  /**
   * Sets the value of the niLowerBoundIncl property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setNiLowerBoundIncl(Double value) {
    this.niLowerBoundIncl = value;
  }

  /**
   * Gets the value of the niUpperBoundExcl property.
   *
   * @return possible object is {@link String }
   */
  public String getNiUpperBoundExcl() {
    return niUpperBoundExcl;
  }

  /**
   * Sets the value of the niUpperBoundExcl property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNiUpperBoundExcl(String value) {
    this.niUpperBoundExcl = value;
  }

  /**
   * Gets the value of the niLowerBoundExcl property.
   *
   * @return possible object is {@link Double }
   */
  public Double getNiLowerBoundExcl() {
    return niLowerBoundExcl;
  }

  /**
   * Sets the value of the niLowerBoundExcl property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setNiLowerBoundExcl(Double value) {
    this.niLowerBoundExcl = value;
  }

  /**
   * Gets the value of the niUpperBoundIncl property.
   *
   * @return possible object is {@link String }
   */
  public String getNiUpperBoundIncl() {
    return niUpperBoundIncl;
  }

  /**
   * Sets the value of the niUpperBoundIncl property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNiUpperBoundIncl(String value) {
    this.niUpperBoundIncl = value;
  }

  /**
   * Gets the value of the posFreq property.
   */
  public double getPosFreq() {
    return posFreq;
  }

  /**
   * Sets the value of the posFreq property.
   */
  public void setPosFreq(double value) {
    this.posFreq = value;
  }

  /**
   * Gets the value of the negFreq property.
   */
  public double getNegFreq() {
    return negFreq;
  }

  /**
   * Sets the value of the negFreq property.
   */
  public void setNegFreq(double value) {
    this.negFreq = value;
  }

  /**
   * Gets the value of the posToNegRatio property.
   */
  public double getPosToNegRatio() {
    return posToNegRatio;
  }

  /**
   * Sets the value of the posToNegRatio property.
   */
  public void setPosToNegRatio(double value) {
    this.posToNegRatio = value;
  }

  /**
   * Gets the value of the altPosToNegRatio property.
   *
   * @return possible object is {@link Double }
   */
  public Double getAltPosToNegRatio() {
    return altPosToNegRatio;
  }

  /**
   * Sets the value of the altPosToNegRatio property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setAltPosToNegRatio(Double value) {
    this.altPosToNegRatio = value;
  }

}
