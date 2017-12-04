
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
 *         &lt;element name="nsp_information">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nsp_distribution" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="bin_no" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="nsp_lower_bound_incl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="nsp_upper_bound_excl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="nsp_lower_bound_excl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="nsp_upper_bound_incl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="pos_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="neg_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="pos_to_neg_ratio" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="alt_pos_to_neg_ratio" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="neighboring_bin_smoothing" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fpkm_information" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fpkm_distribution" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="bin_no" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="fpkm_lower_bound_incl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="fpkm_upper_bound_excl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fpkm_lower_bound_excl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="fpkm_upper_bound_incl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="pos_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="neg_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="pos_to_neg_ratio" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="alt_pos_to_neg_ratio" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="neighboring_bin_smoothing" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ni_information" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ni_distribution" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="bin_no" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="ni_lower_bound_incl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="ni_upper_bound_excl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ni_lower_bound_excl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="ni_upper_bound_incl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="pos_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="neg_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="pos_to_neg_ratio" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="alt_pos_to_neg_ratio" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="protein_summary_data_filter" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="min_probability" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="sensitivity" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="false_positive_error_rate" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="predicted_num_correct" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="predicted_num_incorrect" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="error_point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="error" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="min_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="num_corr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="num_incorr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="occam_flag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groups_flag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="degen_flag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nsp_flag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fpkm_flag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initial_peptide_wt_iters" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nsp_distribution_iters" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="final_peptide_wt_iters" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="run_options" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nspInformation",
    "fpkmInformation",
    "niInformation",
    "proteinSummaryDataFilter",
    "errorPoint"
})
@XmlRootElement(name = "proteinprophet_details")
public class ProteinprophetDetails {

    @XmlElement(name = "nsp_information", required = true)
    protected NspInformation nspInformation;
    @XmlElement(name = "fpkm_information")
    protected List<FpkmInformation> fpkmInformation;
    @XmlElement(name = "ni_information")
    protected List<NiInformation> niInformation;
    @XmlElement(name = "protein_summary_data_filter", required = true)
    protected List<ProteinSummaryDataFilter> proteinSummaryDataFilter;
    @XmlElement(name = "error_point")
    protected List<ErrorPoint> errorPoint;
    @XmlAttribute(name = "occam_flag", required = true)
    protected String occamFlag;
    @XmlAttribute(name = "groups_flag", required = true)
    protected String groupsFlag;
    @XmlAttribute(name = "degen_flag", required = true)
    protected String degenFlag;
    @XmlAttribute(name = "nsp_flag", required = true)
    protected String nspFlag;
    @XmlAttribute(name = "fpkm_flag", required = true)
    protected String fpkmFlag;
    @XmlAttribute(name = "initial_peptide_wt_iters", required = true)
    protected String initialPeptideWtIters;
    @XmlAttribute(name = "nsp_distribution_iters", required = true)
    protected String nspDistributionIters;
    @XmlAttribute(name = "final_peptide_wt_iters", required = true)
    protected String finalPeptideWtIters;
    @XmlAttribute(name = "run_options")
    protected String runOptions;

    /**
     * Gets the value of the nspInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NspInformation }
     *     
     */
    public NspInformation getNspInformation() {
        return nspInformation;
    }

    /**
     * Sets the value of the nspInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NspInformation }
     *     
     */
    public void setNspInformation(NspInformation value) {
        this.nspInformation = value;
    }

    /**
     * Gets the value of the fpkmInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fpkmInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFpkmInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FpkmInformation }
     * 
     * 
     */
    public List<FpkmInformation> getFpkmInformation() {
        if (fpkmInformation == null) {
            fpkmInformation = new ArrayList<FpkmInformation>(1);
        }
        return this.fpkmInformation;
    }

    /**
     * Gets the value of the niInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the niInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNiInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NiInformation }
     * 
     * 
     */
    public List<NiInformation> getNiInformation() {
        if (niInformation == null) {
            niInformation = new ArrayList<NiInformation>(1);
        }
        return this.niInformation;
    }

    /**
     * Gets the value of the proteinSummaryDataFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proteinSummaryDataFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProteinSummaryDataFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinSummaryDataFilter }
     * 
     * 
     */
    public List<ProteinSummaryDataFilter> getProteinSummaryDataFilter() {
        if (proteinSummaryDataFilter == null) {
            proteinSummaryDataFilter = new ArrayList<ProteinSummaryDataFilter>(1);
        }
        return this.proteinSummaryDataFilter;
    }

    /**
     * Gets the value of the errorPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorPoint }
     * 
     * 
     */
    public List<ErrorPoint> getErrorPoint() {
        if (errorPoint == null) {
            errorPoint = new ArrayList<ErrorPoint>(1);
        }
        return this.errorPoint;
    }

    /**
     * Gets the value of the occamFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccamFlag() {
        return occamFlag;
    }

    /**
     * Sets the value of the occamFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccamFlag(String value) {
        this.occamFlag = value;
    }

    /**
     * Gets the value of the groupsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupsFlag() {
        return groupsFlag;
    }

    /**
     * Sets the value of the groupsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupsFlag(String value) {
        this.groupsFlag = value;
    }

    /**
     * Gets the value of the degenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegenFlag() {
        return degenFlag;
    }

    /**
     * Sets the value of the degenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegenFlag(String value) {
        this.degenFlag = value;
    }

    /**
     * Gets the value of the nspFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNspFlag() {
        return nspFlag;
    }

    /**
     * Sets the value of the nspFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNspFlag(String value) {
        this.nspFlag = value;
    }

    /**
     * Gets the value of the fpkmFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkmFlag() {
        return fpkmFlag;
    }

    /**
     * Sets the value of the fpkmFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkmFlag(String value) {
        this.fpkmFlag = value;
    }

    /**
     * Gets the value of the initialPeptideWtIters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialPeptideWtIters() {
        return initialPeptideWtIters;
    }

    /**
     * Sets the value of the initialPeptideWtIters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialPeptideWtIters(String value) {
        this.initialPeptideWtIters = value;
    }

    /**
     * Gets the value of the nspDistributionIters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNspDistributionIters() {
        return nspDistributionIters;
    }

    /**
     * Sets the value of the nspDistributionIters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNspDistributionIters(String value) {
        this.nspDistributionIters = value;
    }

    /**
     * Gets the value of the finalPeptideWtIters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalPeptideWtIters() {
        return finalPeptideWtIters;
    }

    /**
     * Sets the value of the finalPeptideWtIters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalPeptideWtIters(String value) {
        this.finalPeptideWtIters = value;
    }

    /**
     * Gets the value of the runOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunOptions() {
        return runOptions;
    }

    /**
     * Sets the value of the runOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunOptions(String value) {
        this.runOptions = value;
    }

}
