/*
 * Copyright (c) 2020. Taktik SA, All rights reserved.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.10.15 at 03:32:18 PM CEST
//


package org.taktik.icure.be.samv2v5.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionKeyType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExclusionKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ExclusionType" use="required" type="{urn:be:fgov:ehealth:samws:v2:core}CharacterType" />
 *       &lt;attribute name="IdentifierNum" use="required" type="{urn:be:fgov:ehealth:samws:v2:core}String10Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionKeyType", namespace = "urn:be:fgov:ehealth:samws:v2:chapteriv:submit")
@XmlSeeAlso({
    ExclusionFullDataType.class,
    ExclusionType.class
})
public class ExclusionKeyType {

    @XmlAttribute(name = "ExclusionType", required = true)
    protected String exclusionType;
    @XmlAttribute(name = "IdentifierNum", required = true)
    protected String identifierNum;

    /**
     * Gets the value of the exclusionType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExclusionType() {
        return exclusionType;
    }

    /**
     * Sets the value of the exclusionType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExclusionType(String value) {
        this.exclusionType = value;
    }

    /**
     * Gets the value of the identifierNum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentifierNum() {
        return identifierNum;
    }

    /**
     * Sets the value of the identifierNum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentifierNum(String value) {
        this.identifierNum = value;
    }

}
