//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.19 at 05:41:02 PM EDT 
//


package umich.ms.fileio.filetypes.pepxml.jaxb;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="intensity" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="channel" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                 &lt;attribute name="target_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="absolute" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="normalized" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="is_rejected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intensity"
})
@XmlRootElement(name = "libra_result")
public class LibraResult {

    @XmlElement(required = true)
    protected List<Intensity> intensity;
    @XmlAttribute(name = "is_rejected")
    protected Boolean isRejected;

    /**
     * Gets the value of the intensity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intensity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intensity }
     * 
     * 
     */
    public List<Intensity> getIntensity() {
        if (intensity == null) {
            intensity = new ArrayList<Intensity>(1);
        }
        return this.intensity;
    }

    /**
     * Gets the value of the isRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsRejected() {
        if (isRejected == null) {
            return false;
        } else {
            return isRejected;
        }
    }

    /**
     * Sets the value of the isRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRejected(Boolean value) {
        this.isRejected = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="channel" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
     *       &lt;attribute name="target_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="absolute" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="normalized" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Intensity {

        @XmlAttribute(name = "channel", required = true)
        protected long channel;
        @XmlAttribute(name = "target_mass", required = true)
        protected float targetMass;
        @XmlAttribute(name = "absolute", required = true)
        protected float absolute;
        @XmlAttribute(name = "normalized", required = true)
        protected float normalized;
        @XmlAttribute(name = "reject")
        protected Boolean reject;

        /**
         * Gets the value of the channel property.
         * 
         */
        public long getChannel() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         * 
         */
        public void setChannel(long value) {
            this.channel = value;
        }

        /**
         * Gets the value of the targetMass property.
         * 
         */
        public float getTargetMass() {
            return targetMass;
        }

        /**
         * Sets the value of the targetMass property.
         * 
         */
        public void setTargetMass(float value) {
            this.targetMass = value;
        }

        /**
         * Gets the value of the absolute property.
         * 
         */
        public float getAbsolute() {
            return absolute;
        }

        /**
         * Sets the value of the absolute property.
         * 
         */
        public void setAbsolute(float value) {
            this.absolute = value;
        }

        /**
         * Gets the value of the normalized property.
         * 
         */
        public float getNormalized() {
            return normalized;
        }

        /**
         * Sets the value of the normalized property.
         * 
         */
        public void setNormalized(float value) {
            this.normalized = value;
        }

        /**
         * Gets the value of the reject property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isReject() {
            if (reject == null) {
                return false;
            } else {
                return reject;
            }
        }

        /**
         * Sets the value of the reject property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReject(Boolean value) {
            this.reject = value;
        }

    }

}
