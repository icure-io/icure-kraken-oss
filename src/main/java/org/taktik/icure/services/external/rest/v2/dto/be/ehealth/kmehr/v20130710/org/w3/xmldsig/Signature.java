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
// Generated on: 2019.06.14 at 03:50:02 PM CEST
//


package org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20130710.org.w3.xmldsig;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SignatureType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignedInfo"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureValue"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
    "signedInfo",
    "signatureValue",
    "keyInfo",
    "objects"
})
@XmlRootElement(name = "Signature")
public class Signature
    implements Serializable
{

    private final static long serialVersionUID = 20130710L;
    @XmlElement(name = "SignedInfo", required = true)
    protected SignedInfo signedInfo;
    @XmlElement(name = "SignatureValue", required = true)
    protected SignatureValue signatureValue;
    @XmlElement(name = "KeyInfo")
    protected KeyInfo keyInfo;
    @XmlElement(name = "Object")
    protected List<Object> objects;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the signedInfo property.
     *
     * @return
     *     possible object is
     *     {@link SignedInfo }
     *
     */
    public SignedInfo getSignedInfo() {
        return signedInfo;
    }

    /**
     * Sets the value of the signedInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link SignedInfo }
     *
     */
    public void setSignedInfo(SignedInfo value) {
        this.signedInfo = value;
    }

    /**
     * Gets the value of the signatureValue property.
     *
     * @return
     *     possible object is
     *     {@link SignatureValue }
     *
     */
    public SignatureValue getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     *
     * @param value
     *     allowed object is
     *     {@link SignatureValue }
     *
     */
    public void setSignatureValue(SignatureValue value) {
        this.signatureValue = value;
    }

    /**
     * Gets the value of the keyInfo property.
     *
     * @return
     *     possible object is
     *     {@link KeyInfo }
     *
     */
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the value of the keyInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link KeyInfo }
     *
     */
    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

    /**
     * Gets the value of the objects property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objects property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjects().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     *
     *
     */
    public List<Object> getObjects() {
        if (objects == null) {
            objects = new ArrayList<Object>();
        }
        return this.objects;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

}
