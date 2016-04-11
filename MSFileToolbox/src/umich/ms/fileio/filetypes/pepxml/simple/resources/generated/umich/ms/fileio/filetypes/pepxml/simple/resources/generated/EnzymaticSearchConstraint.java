//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.10 at 07:43:19 PM EDT 
//


package umich.ms.fileio.filetypes.pepxml.simple.resources.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="enzyme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="max_num_internal_cleavages" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="min_number_termini" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class EnzymaticSearchConstraint {

    @XmlAttribute(name = "enzyme", required = true)
    protected String enzyme;
    @XmlAttribute(name = "max_num_internal_cleavages", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumInternalCleavages;
    @XmlAttribute(name = "min_number_termini", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minNumberTermini;

    /**
     * Gets the value of the enzyme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnzyme() {
        return enzyme;
    }

    /**
     * Sets the value of the enzyme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnzyme(String value) {
        this.enzyme = value;
    }

    /**
     * Gets the value of the maxNumInternalCleavages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumInternalCleavages() {
        return maxNumInternalCleavages;
    }

    /**
     * Sets the value of the maxNumInternalCleavages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumInternalCleavages(BigInteger value) {
        this.maxNumInternalCleavages = value;
    }

    /**
     * Gets the value of the minNumberTermini property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumberTermini() {
        return minNumberTermini;
    }

    /**
     * Sets the value of the minNumberTermini property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumberTermini(BigInteger value) {
        this.minNumberTermini = value;
    }

}
