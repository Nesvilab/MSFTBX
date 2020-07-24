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
package umich.ms.fileio.filetypes.gpmdb.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *         &lt;element ref="{}aa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="b_ions" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="b_score" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="delta" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="expect" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="hyperscore" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="mh" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="missed_cleavages" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="nextscore" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="post" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="pre" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="y_ions" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="y_score" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aa"
})
@XmlRootElement(name = "domain")
public class Domain {

  protected List<Aa> aa;
  @XmlAttribute(name = "b_ions", required = true)
  protected Integer bIons;
  @XmlAttribute(name = "b_score", required = true)
  protected Double bScore;
  @XmlAttribute(name = "delta", required = true)
  protected Double delta;
  @XmlAttribute(name = "end", required = true)
  protected Integer end;
  @XmlAttribute(name = "expect", required = true)
  protected double expect;
  @XmlAttribute(name = "hyperscore", required = true)
  protected Double hyperscore;
  @XmlAttribute(name = "id", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NMTOKEN")
  protected String id;
  @XmlAttribute(name = "mh", required = true)
  protected Double mh;
  @XmlAttribute(name = "missed_cleavages", required = true)
  protected Integer missedCleavages;
  @XmlAttribute(name = "nextscore", required = true)
  protected Double nextscore;
  @XmlAttribute(name = "post", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String post;
  @XmlAttribute(name = "pre", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String pre;
  @XmlAttribute(name = "seq", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String seq;
  @XmlAttribute(name = "start", required = true)
  protected Integer start;
  @XmlAttribute(name = "y_ions", required = true)
  protected Integer yIons;
  @XmlAttribute(name = "y_score", required = true)
  protected Double yScore;

  /**
   * Gets the value of the aa property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the aa property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAa().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Aa }
   */
  public List<Aa> getAa() {
    if (aa == null) {
      aa = new ArrayList<Aa>();
    }
    return this.aa;
  }

  /**
   * Gets the value of the bIons property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getBIons() {
    return bIons;
  }

  /**
   * Sets the value of the bIons property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setBIons(Integer value) {
    this.bIons = value;
  }

  /**
   * Gets the value of the bScore property.
   *
   * @return possible object is {@link Double }
   */
  public Double getBScore() {
    return bScore;
  }

  /**
   * Sets the value of the bScore property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setBScore(Double value) {
    this.bScore = value;
  }

  /**
   * Gets the value of the delta property.
   *
   * @return possible object is {@link Double }
   */
  public Double getDelta() {
    return delta;
  }

  /**
   * Sets the value of the delta property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setDelta(Double value) {
    this.delta = value;
  }

  /**
   * Gets the value of the end property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getEnd() {
    return end;
  }

  /**
   * Sets the value of the end property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setEnd(Integer value) {
    this.end = value;
  }

  /**
   * Gets the value of the expect property.
   */
  public double getExpect() {
    return expect;
  }

  /**
   * Sets the value of the expect property.
   */
  public void setExpect(double value) {
    this.expect = value;
  }

  /**
   * Gets the value of the hyperscore property.
   *
   * @return possible object is {@link Double }
   */
  public Double getHyperscore() {
    return hyperscore;
  }

  /**
   * Sets the value of the hyperscore property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setHyperscore(Double value) {
    this.hyperscore = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the mh property.
   *
   * @return possible object is {@link Double }
   */
  public Double getMh() {
    return mh;
  }

  /**
   * Sets the value of the mh property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setMh(Double value) {
    this.mh = value;
  }

  /**
   * Gets the value of the missedCleavages property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getMissedCleavages() {
    return missedCleavages;
  }

  /**
   * Sets the value of the missedCleavages property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setMissedCleavages(Integer value) {
    this.missedCleavages = value;
  }

  /**
   * Gets the value of the nextscore property.
   *
   * @return possible object is {@link Double }
   */
  public Double getNextscore() {
    return nextscore;
  }

  /**
   * Sets the value of the nextscore property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setNextscore(Double value) {
    this.nextscore = value;
  }

  /**
   * Gets the value of the post property.
   *
   * @return possible object is {@link String }
   */
  public String getPost() {
    return post;
  }

  /**
   * Sets the value of the post property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPost(String value) {
    this.post = value;
  }

  /**
   * Gets the value of the pre property.
   *
   * @return possible object is {@link String }
   */
  public String getPre() {
    return pre;
  }

  /**
   * Sets the value of the pre property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPre(String value) {
    this.pre = value;
  }

  /**
   * Gets the value of the seq property.
   *
   * @return possible object is {@link String }
   */
  public String getSeq() {
    return seq;
  }

  /**
   * Sets the value of the seq property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSeq(String value) {
    this.seq = value;
  }

  /**
   * Gets the value of the start property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getStart() {
    return start;
  }

  /**
   * Sets the value of the start property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setStart(Integer value) {
    this.start = value;
  }

  /**
   * Gets the value of the yIons property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getYIons() {
    return yIons;
  }

  /**
   * Sets the value of the yIons property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setYIons(Integer value) {
    this.yIons = value;
  }

  /**
   * Gets the value of the yScore property.
   *
   * @return possible object is {@link Double }
   */
  public Double getYScore() {
    return yScore;
  }

  /**
   * Sets the value of the yScore property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setYScore(Double value) {
    this.yScore = value;
  }

}
