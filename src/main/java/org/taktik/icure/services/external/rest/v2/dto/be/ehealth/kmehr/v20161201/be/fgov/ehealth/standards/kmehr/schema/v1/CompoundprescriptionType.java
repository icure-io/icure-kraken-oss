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
// Generated on: 2019.06.14 at 03:49:54 PM CEST
//


package org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.schema.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.dt.v1.TextType;


/**
 *
 *         a magistral preparation can be prescribed as a (coded)
 *         reference to a preparation in a reference book (formularyreference), or as a
 *         (coded) list of individual compounds (compoundlist), or as free text
 *         (magistraltext)
 *
 *
 * <p>Java class for compoundprescriptionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="compoundprescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="compound" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}compoundType" maxOccurs="unbounded"/>
 *           &lt;element name="formularyreference" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}formularyreferenceType"/>
 *           &lt;element name="magistraltext" type="{http://www.ehealth.fgov.be/standards/kmehr/dt/v1}textType"/>
 *         &lt;/choice>
 *         &lt;element name="galenicform" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}galenicformType" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}quantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="L" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compoundprescriptionType", propOrder = {
    "content"
})
public class CompoundprescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 20161201L;
    @XmlElementRefs({
        @XmlElementRef(name = "magistraltext", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "compound", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formularyreference", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "galenicform", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quantity", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "L")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String l;

    /**
     *
     *         a magistral preparation can be prescribed as a (coded)
     *         reference to a preparation in a reference book (formularyreference), or as a
     *         (coded) list of individual compounds (compoundlist), or as free text
     *         (magistraltext)
     *       Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundType }{@code >}
     * {@link JAXBElement }{@code <}{@link FormularyreferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GalenicformType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link QuantityType }{@code >}
     *
     *
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the l property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setL(String value) {
        this.l = value;
    }

}
