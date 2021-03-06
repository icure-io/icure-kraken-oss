/*
 *  iCure Data Stack. Copyright (c) 2020 Taktik SA
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public
 *     License along with this program.  If not, see
 *     <https://www.gnu.org/licenses/>.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.05.22 at 08:11:32 PM CEST
//


package org.taktik.icure.be.ehealth.samws.v2.actual.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.taktik.icure.be.ehealth.samws.v2.core.Text255Type;
import org.taktik.icure.be.ehealth.samws.v2.core.TextType;


/**
 * <p>Java class for AmppBcpiType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AmppBcpiType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:samws:v2:actual:common}AmppKeyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:be:fgov:ehealth:samws:v2:actual:common}AmppBcpiFields"/>
 *         &lt;group ref="{urn:be:fgov:ehealth:samws:v2:actual:common}AmppBcpiReferences"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmppBcpiType", propOrder = {
    "singleUse",
    "speciallyRegulated",
    "abbreviatedName",
    "prescriptionName",
    "note",
    "posologyNote",
    "crmLink",
    "noGenericPrescriptionReasonCodes"
})
@XmlSeeAlso({
    AddAmppBcpiType.class
})
public class AmppBcpiType
    extends AmppKeyType
    implements Serializable
{

    private final static long serialVersionUID = 2L;
    @XmlElement(name = "SingleUse")
    protected Boolean singleUse;
    @XmlElement(name = "SpeciallyRegulated")
    @XmlSchemaType(name = "integer")
    protected Integer speciallyRegulated;
    @XmlElement(name = "AbbreviatedName", required = true)
    protected Text255Type abbreviatedName;
    @XmlElement(name = "PrescriptionName", required = true)
    protected Text255Type prescriptionName;
    @XmlElement(name = "Note")
    protected TextType note;
    @XmlElement(name = "PosologyNote")
    protected TextType posologyNote;
    @XmlElement(name = "CrmLink")
    protected Text255Type crmLink;
    @XmlElement(name = "NoGenericPrescriptionReasonCode")
    protected List<String> noGenericPrescriptionReasonCodes;

    /**
     * Gets the value of the singleUse property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSingleUse() {
        return singleUse;
    }

    /**
     * Sets the value of the singleUse property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSingleUse(Boolean value) {
        this.singleUse = value;
    }

    /**
     * Gets the value of the speciallyRegulated property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSpeciallyRegulated() {
        return speciallyRegulated;
    }

    /**
     * Sets the value of the speciallyRegulated property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSpeciallyRegulated(Integer value) {
        this.speciallyRegulated = value;
    }

    /**
     * Gets the value of the abbreviatedName property.
     *
     * @return
     *     possible object is
     *     {@link Text255Type }
     *
     */
    public Text255Type getAbbreviatedName() {
        return abbreviatedName;
    }

    /**
     * Sets the value of the abbreviatedName property.
     *
     * @param value
     *     allowed object is
     *     {@link Text255Type }
     *
     */
    public void setAbbreviatedName(Text255Type value) {
        this.abbreviatedName = value;
    }

    /**
     * Gets the value of the prescriptionName property.
     *
     * @return
     *     possible object is
     *     {@link Text255Type }
     *
     */
    public Text255Type getPrescriptionName() {
        return prescriptionName;
    }

    /**
     * Sets the value of the prescriptionName property.
     *
     * @param value
     *     allowed object is
     *     {@link Text255Type }
     *
     */
    public void setPrescriptionName(Text255Type value) {
        this.prescriptionName = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setNote(TextType value) {
        this.note = value;
    }

    /**
     * Gets the value of the posologyNote property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getPosologyNote() {
        return posologyNote;
    }

    /**
     * Sets the value of the posologyNote property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setPosologyNote(TextType value) {
        this.posologyNote = value;
    }

    /**
     * Gets the value of the crmLink property.
     *
     * @return
     *     possible object is
     *     {@link Text255Type }
     *
     */
    public Text255Type getCrmLink() {
        return crmLink;
    }

    /**
     * Sets the value of the crmLink property.
     *
     * @param value
     *     allowed object is
     *     {@link Text255Type }
     *
     */
    public void setCrmLink(Text255Type value) {
        this.crmLink = value;
    }

    /**
     * Gets the value of the noGenericPrescriptionReasonCodes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noGenericPrescriptionReasonCodes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoGenericPrescriptionReasonCodes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getNoGenericPrescriptionReasonCodes() {
        if (noGenericPrescriptionReasonCodes == null) {
            noGenericPrescriptionReasonCodes = new ArrayList<String>();
        }
        return this.noGenericPrescriptionReasonCodes;
    }

}
