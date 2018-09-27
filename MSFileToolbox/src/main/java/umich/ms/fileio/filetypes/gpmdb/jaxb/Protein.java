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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}note"/>
 *         &lt;element ref="{}file"/>
 *         &lt;element ref="{}peptide"/>
 *       &lt;/sequence>
 *       &lt;attribute name="annotation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="expect" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="sumI" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "note",
    "file",
    "peptide"
})
@XmlRootElement(name = "protein")
public class Protein {

  @XmlElement(required = true)
  protected Note note;
  @XmlElement(required = true)
  protected File file;
  @XmlElement(required = true)
  protected Peptide peptide;
  @XmlAttribute(name = "annotation")
  @XmlSchemaType(name = "anySimpleType")
  protected String annotation;
  @XmlAttribute(name = "expect", required = true)
  protected Double expect;
  @XmlAttribute(name = "id", required = true)
  protected Double id;
  @XmlAttribute(name = "label", required = true)
  @XmlSchemaType(name = "anySimpleType")
  protected String label;
  @XmlAttribute(name = "sumI", required = true)
  protected Double sumI;
  @XmlAttribute(name = "uid", required = true)
  protected Integer uid;

  /**
   * Gets the value of the note property.
   *
   * @return possible object is {@link Note }
   */
  public Note getNote() {
    return note;
  }

  /**
   * Sets the value of the note property.
   *
   * @param value allowed object is {@link Note }
   */
  public void setNote(Note value) {
    this.note = value;
  }

  /**
   * Gets the value of the file property.
   *
   * @return possible object is {@link File }
   */
  public File getFile() {
    return file;
  }

  /**
   * Sets the value of the file property.
   *
   * @param value allowed object is {@link File }
   */
  public void setFile(File value) {
    this.file = value;
  }

  /**
   * Gets the value of the peptide property.
   *
   * @return possible object is {@link Peptide }
   */
  public Peptide getPeptide() {
    return peptide;
  }

  /**
   * Sets the value of the peptide property.
   *
   * @param value allowed object is {@link Peptide }
   */
  public void setPeptide(Peptide value) {
    this.peptide = value;
  }

  /**
   * Gets the value of the annotation property.
   *
   * @return possible object is {@link String }
   */
  public String getAnnotation() {
    return annotation;
  }

  /**
   * Sets the value of the annotation property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAnnotation(String value) {
    this.annotation = value;
  }

  /**
   * Gets the value of the expect property.
   *
   * @return possible object is {@link Double }
   */
  public Double getExpect() {
    return expect;
  }

  /**
   * Sets the value of the expect property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setExpect(Double value) {
    this.expect = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link Double }
   */
  public Double getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setId(Double value) {
    this.id = value;
  }

  /**
   * Gets the value of the label property.
   *
   * @return possible object is {@link String }
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets the value of the label property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLabel(String value) {
    this.label = value;
  }

  /**
   * Gets the value of the sumI property.
   *
   * @return possible object is {@link Double }
   */
  public Double getSumI() {
    return sumI;
  }

  /**
   * Sets the value of the sumI property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setSumI(Double value) {
    this.sumI = value;
  }

  /**
   * Gets the value of the uid property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getUid() {
    return uid;
  }

  /**
   * Sets the value of the uid property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setUid(Integer value) {
    this.uid = value;
  }

}
