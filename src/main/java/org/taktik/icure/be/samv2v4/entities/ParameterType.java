//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.12 at 04:36:37 PM CEST 
//


package org.taktik.icure.be.samv2v4.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:samws:v2:refdata}ParameterKeyType">
 *       &lt;sequence>
 *         &lt;element name="UnitType" type="{urn:be:fgov:ehealth:samws:v2:refdata}UnitTypeType"/>
 *         &lt;element name="Domain" type="{urn:be:fgov:ehealth:samws:v2:refdata}DomainType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterType", namespace = "urn:be:fgov:ehealth:samws:v2:refdata", propOrder = {
    "unitType",
    "domain"
})
public class ParameterType
    extends ParameterKeyType
{

    @XmlElement(name = "UnitType", required = true)
    @XmlSchemaType(name = "string")
    protected UnitTypeType unitType;
    @XmlElement(name = "Domain")
    protected List<DomainType> domain;

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitTypeType }
     *     
     */
    public UnitTypeType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitTypeType }
     *     
     */
    public void setUnitType(UnitTypeType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainType }
     * 
     * 
     */
    public List<DomainType> getDomain() {
        if (domain == null) {
            domain = new ArrayList<DomainType>();
        }
        return this.domain;
    }

}
