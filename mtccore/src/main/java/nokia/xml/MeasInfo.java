//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.18 at 04:44:40 PM PDT 
//


package nokia.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.3gpp.org/ftp/specs/latest/rel-5/32_series/32401-540.zip#measCollec}granPeriod"/>
 *         &lt;element ref="{http://www.3gpp.org/ftp/specs/latest/rel-5/32_series/32401-540.zip#measCollec}measType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.3gpp.org/ftp/specs/latest/rel-5/32_series/32401-540.zip#measCollec}measValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "granPeriod",
    "measType",
    "measValue"
})
@XmlRootElement(name = "measInfo")
public class MeasInfo {

    @XmlElement(required = true)
    protected GranPeriod granPeriod;
    @XmlElement(required = true)
    protected List<MeasType> measType;
    @XmlElement(required = true)
    protected List<MeasValue> measValue;

    /**
     * Gets the value of the granPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link GranPeriod }
     *     
     */
    public GranPeriod getGranPeriod() {
        return granPeriod;
    }

    /**
     * Sets the value of the granPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link GranPeriod }
     *     
     */
    public void setGranPeriod(GranPeriod value) {
        this.granPeriod = value;
    }

    /**
     * Gets the value of the measType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasType }
     * 
     * 
     */
    public List<MeasType> getMeasType() {
        if (measType == null) {
            measType = new ArrayList<MeasType>();
        }
        return this.measType;
    }

    /**
     * Gets the value of the measValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasValue }
     * 
     * 
     */
    public List<MeasValue> getMeasValue() {
        if (measValue == null) {
            measValue = new ArrayList<MeasValue>();
        }
        return this.measValue;
    }

}