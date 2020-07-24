
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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/protXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://regis-web.systemsbiology.net/protXML}protein_annotation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="protein_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parameter",
    "annotation"
})
public class IndistinguishableProtein {

  protected List<NameValueType> parameter;
  protected ProteinAnnotation annotation;
  @XmlAttribute(name = "protein_name", required = true)
  protected String proteinName;

  /**
   * Gets the value of the parameter property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the parameter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getParameter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link NameValueType }
   */
  public List<NameValueType> getParameter() {
    if (parameter == null) {
      parameter = new ArrayList<NameValueType>(1);
    }
    return this.parameter;
  }

  /**
   * Gets the value of the annotation property.
   *
   * @return possible object is {@link ProteinAnnotation }
   */
  public ProteinAnnotation getAnnotation() {
    return annotation;
  }

  /**
   * Sets the value of the annotation property.
   *
   * @param value allowed object is {@link ProteinAnnotation }
   */
  public void setAnnotation(ProteinAnnotation value) {
    this.annotation = value;
  }

  /**
   * Gets the value of the proteinName property.
   *
   * @return possible object is {@link String }
   */
  public String getProteinName() {
    return proteinName;
  }

  /**
   * Sets the value of the proteinName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setProteinName(String value) {
    this.proteinName = value;
  }

}
