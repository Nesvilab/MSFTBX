//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 01:49:48 AM EDT 
//


package umich.ms.fileio.filetypes.pepxml.jaxb.old;

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
 *       &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="masstol" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ppmtol" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
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
    protected String massdiff;
    @XmlAttribute(name = "masstol", required = true)
    protected float masstol;
    @XmlAttribute(name = "ppmtol", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Integer ppmtol;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the sameScanRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSameScanRange() {
        return sameScanRange;
    }

    /**
     * Sets the value of the sameScanRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSameScanRange(String value) {
        this.sameScanRange = value;
    }

    /**
     * Gets the value of the labeledResidues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabeledResidues() {
        return labeledResidues;
    }

    /**
     * Sets the value of the labeledResidues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabeledResidues(String value) {
        this.labeledResidues = value;
    }

    /**
     * Gets the value of the xpressLight property.
     * 
     */
    public long getXpressLight() {
        return xpressLight;
    }

    /**
     * Sets the value of the xpressLight property.
     * 
     */
    public void setXpressLight(long value) {
        this.xpressLight = value;
    }

    /**
     * Gets the value of the massdiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassdiff() {
        return massdiff;
    }

    /**
     * Sets the value of the massdiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassdiff(String value) {
        this.massdiff = value;
    }

    /**
     * Gets the value of the masstol property.
     * 
     */
    public float getMasstol() {
        return masstol;
    }

    /**
     * Sets the value of the masstol property.
     * 
     */
    public void setMasstol(float value) {
        this.masstol = value;
    }

    /**
     * Gets the value of the ppmtol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getPpmtol() {
        return ppmtol;
    }

    /**
     * Sets the value of the ppmtol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpmtol(Integer value) {
        this.ppmtol = value;
    }

}