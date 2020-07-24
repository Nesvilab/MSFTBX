
/*
 * Copyright (c) 2018 Dmitry Avtonomov
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

package umich.ms.fileio.filetypes.agilent.cef.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}Location"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}CompoundScores"/>
 *           &lt;element ref="{}Results"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Spectrum"/>
 *       &lt;/sequence>
 *       &lt;attribute name="algo" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "compoundScores",
    "results",
    "spectrum"
})
@XmlRootElement(name = "Compound")
public class Compound {

  @XmlElement(name = "Location", required = true)
  protected Location location;
  @XmlElement(name = "CompoundScores")
  protected CompoundScores compoundScores;
  @XmlElement(name = "Results")
  protected Results results;
  @XmlElement(name = "Spectrum", required = true)
  protected Spectrum spectrum;
  @XmlAttribute(name = "algo", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NCName")
  protected String algo;

  /**
   * Gets the value of the location property.
   *
   * @return possible object is {@link Location }
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Sets the value of the location property.
   *
   * @param value allowed object is {@link Location }
   */
  public void setLocation(Location value) {
    this.location = value;
  }

  /**
   * Gets the value of the compoundScores property.
   *
   * @return possible object is {@link CompoundScores }
   */
  public CompoundScores getCompoundScores() {
    return compoundScores;
  }

  /**
   * Sets the value of the compoundScores property.
   *
   * @param value allowed object is {@link CompoundScores }
   */
  public void setCompoundScores(CompoundScores value) {
    this.compoundScores = value;
  }

  /**
   * Gets the value of the results property.
   *
   * @return possible object is {@link Results }
   */
  public Results getResults() {
    return results;
  }

  /**
   * Sets the value of the results property.
   *
   * @param value allowed object is {@link Results }
   */
  public void setResults(Results value) {
    this.results = value;
  }

  /**
   * Gets the value of the spectrum property.
   *
   * @return possible object is {@link Spectrum }
   */
  public Spectrum getSpectrum() {
    return spectrum;
  }

  /**
   * Sets the value of the spectrum property.
   *
   * @param value allowed object is {@link Spectrum }
   */
  public void setSpectrum(Spectrum value) {
    this.spectrum = value;
  }

  /**
   * Gets the value of the algo property.
   *
   * @return possible object is {@link String }
   */
  public String getAlgo() {
    return algo;
  }

  /**
   * Sets the value of the algo property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAlgo(String value) {
    this.algo = value;
  }

}
