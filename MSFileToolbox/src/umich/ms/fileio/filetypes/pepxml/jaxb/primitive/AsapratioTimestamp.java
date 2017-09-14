
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

package umich.ms.fileio.filetypes.pepxml.jaxb.primitive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="quant_label_masses" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="static_quant_label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "asapratio_timestamp")
public class AsapratioTimestamp {

    @XmlAttribute(name = "quant_label_masses")
    protected String quantLabelMasses;
    @XmlAttribute(name = "static_quant_label")
    protected String staticQuantLabel;

    /**
     * Gets the value of the quantLabelMasses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantLabelMasses() {
        return quantLabelMasses;
    }

    /**
     * Sets the value of the quantLabelMasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantLabelMasses(String value) {
        this.quantLabelMasses = value;
    }

    /**
     * Gets the value of the staticQuantLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticQuantLabel() {
        return staticQuantLabel;
    }

    /**
     * Sets the value of the staticQuantLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticQuantLabel(String value) {
        this.staticQuantLabel = value;
    }

}
