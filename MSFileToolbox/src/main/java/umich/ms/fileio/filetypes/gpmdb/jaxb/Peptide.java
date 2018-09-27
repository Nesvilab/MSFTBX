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
 *         &lt;element ref="{}domain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
//    "content",
    "domain"
})
@XmlRootElement(name = "peptide")
public class Peptide {

//    @XmlElementWrapper(name = "contacts")
//    @XmlElements({
//            @XmlElement(name = "phone-number", type = Phone.class, required = true),
//            @XmlElement(name = "home-address", type = Address.class, required = true)
//    })

  @XmlElement(required = true)
  protected Domain domain;

  //    @XmlElementRef(name = "domain", type = Domain.class, required = false)
//    @XmlMixed
//    protected List<Object> content;
  @XmlAttribute(name = "end", required = true)
  protected Integer end;
  @XmlAttribute(name = "start", required = true)
  protected Integer start;

//    /**
//     * Gets the value of the content property.
//     *
//     * <p>
//     * This accessor method returns a reference to the live list,
//     * not a snapshot. Therefore any modification you make to the
//     * returned list will be present inside the JAXB object.
//     * This is why there is not a <CODE>set</CODE> method for the content property.
//     *
//     * <p>
//     * For example, to add a new item, do as follows:
//     * <pre>
//     *    getContent().add(newItem);
//     * </pre>
//     *
//     *
//     * <p>
//     * Objects of the following type(s) are allowed in the list
//     * {@link String }
//     * {@link Domain }
//     *
//     *
//     */
//    public List<Object> getContent() {
//        if (content == null) {
//            content = new ArrayList<Object>();
//        }
//        return this.content;
//    }

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


  public Domain getDomain() {
    return domain;
  }

  public void setDomain(Domain domain) {
    this.domain = domain;
  }
}
