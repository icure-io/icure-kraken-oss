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


package org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20130710.be.fgov.ehealth.standards.kmehr.schema.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20130710.be.fgov.ehealth.standards.kmehr.cd.v1.CDCARENETPERSONALPART;
import org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20130710.be.fgov.ehealth.standards.kmehr.cd.v1.CDCARENETTHIRDPAYERCONTRACT;
import org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20130710.be.fgov.ehealth.standards.kmehr.id.v1.IDINSURANCE;
import org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20130710.be.fgov.ehealth.standards.kmehr.id.v1.IDKMEHR;


/**
 * <p>Java class for insuranceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="insuranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.ehealth.fgov.be/standards/kmehr/id/v1}ID-INSURANCE"/>
 *         &lt;element name="membership" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siscard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="begindate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialfranchiseperiod1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialfranchiseperiod2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalpart" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.ehealth.fgov.be/standards/kmehr/id/v1}ID-KMEHR"/>
 *                   &lt;element name="cd" type="{http://www.ehealth.fgov.be/standards/kmehr/cd/v1}CD-CARENET-PERSONAL-PART"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="thirdpayercontract" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cd" type="{http://www.ehealth.fgov.be/standards/kmehr/cd/v1}CD-CARENET-THIRDPAYER-CONTRACT"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="begindatepayment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="approvalnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceType", propOrder = {
    "id",
    "membership",
    "siscard",
    "begindate",
    "enddate",
    "cg1",
    "cg2",
    "socialfranchiseperiod1",
    "socialfranchiseperiod2",
    "personalparts",
    "thirdpayercontract",
    "begindatepayment",
    "approvalnumber"
})
public class InsuranceType
    implements Serializable
{

    private final static long serialVersionUID = 20130710L;
    @XmlElement(required = true)
    protected IDINSURANCE id;
    @XmlElement(required = true)
    protected String membership;
    protected String siscard;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar begindate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddate;
    protected String cg1;
    protected String cg2;
    protected String socialfranchiseperiod1;
    protected String socialfranchiseperiod2;
    @XmlElement(name = "personalpart")
    protected List<InsuranceType.Personalpart> personalparts;
    protected InsuranceType.Thirdpayercontract thirdpayercontract;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar begindatepayment;
    protected String approvalnumber;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link IDINSURANCE }
     *
     */
    public IDINSURANCE getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link IDINSURANCE }
     *
     */
    public void setId(IDINSURANCE value) {
        this.id = value;
    }

    /**
     * Gets the value of the membership property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMembership(String value) {
        this.membership = value;
    }

    /**
     * Gets the value of the siscard property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSiscard() {
        return siscard;
    }

    /**
     * Sets the value of the siscard property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSiscard(String value) {
        this.siscard = value;
    }

    /**
     * Gets the value of the begindate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBegindate() {
        return begindate;
    }

    /**
     * Sets the value of the begindate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBegindate(XMLGregorianCalendar value) {
        this.begindate = value;
    }

    /**
     * Gets the value of the enddate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setEnddate(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the cg1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCg1() {
        return cg1;
    }

    /**
     * Sets the value of the cg1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCg1(String value) {
        this.cg1 = value;
    }

    /**
     * Gets the value of the cg2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCg2() {
        return cg2;
    }

    /**
     * Sets the value of the cg2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCg2(String value) {
        this.cg2 = value;
    }

    /**
     * Gets the value of the socialfranchiseperiod1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSocialfranchiseperiod1() {
        return socialfranchiseperiod1;
    }

    /**
     * Sets the value of the socialfranchiseperiod1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSocialfranchiseperiod1(String value) {
        this.socialfranchiseperiod1 = value;
    }

    /**
     * Gets the value of the socialfranchiseperiod2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSocialfranchiseperiod2() {
        return socialfranchiseperiod2;
    }

    /**
     * Sets the value of the socialfranchiseperiod2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSocialfranchiseperiod2(String value) {
        this.socialfranchiseperiod2 = value;
    }

    /**
     * Gets the value of the personalparts property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalparts property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalparts().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceType.Personalpart }
     *
     *
     */
    public List<InsuranceType.Personalpart> getPersonalparts() {
        if (personalparts == null) {
            personalparts = new ArrayList<InsuranceType.Personalpart>();
        }
        return this.personalparts;
    }

    /**
     * Gets the value of the thirdpayercontract property.
     *
     * @return
     *     possible object is
     *     {@link InsuranceType.Thirdpayercontract }
     *
     */
    public InsuranceType.Thirdpayercontract getThirdpayercontract() {
        return thirdpayercontract;
    }

    /**
     * Sets the value of the thirdpayercontract property.
     *
     * @param value
     *     allowed object is
     *     {@link InsuranceType.Thirdpayercontract }
     *
     */
    public void setThirdpayercontract(InsuranceType.Thirdpayercontract value) {
        this.thirdpayercontract = value;
    }

    /**
     * Gets the value of the begindatepayment property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBegindatepayment() {
        return begindatepayment;
    }

    /**
     * Sets the value of the begindatepayment property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBegindatepayment(XMLGregorianCalendar value) {
        this.begindatepayment = value;
    }

    /**
     * Gets the value of the approvalnumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApprovalnumber() {
        return approvalnumber;
    }

    /**
     * Sets the value of the approvalnumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApprovalnumber(String value) {
        this.approvalnumber = value;
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
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.ehealth.fgov.be/standards/kmehr/id/v1}ID-KMEHR"/>
     *         &lt;element name="cd" type="{http://www.ehealth.fgov.be/standards/kmehr/cd/v1}CD-CARENET-PERSONAL-PART"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
        "id",
        "cd",
        "date",
        "time"
    })
    public static class Personalpart
        implements Serializable
    {

        private final static long serialVersionUID = 20130710L;
        @XmlElement(required = true)
        protected IDKMEHR id;
        @XmlElement(required = true)
        protected CDCARENETPERSONALPART cd;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar time;

        /**
         * Gets the value of the id property.
         *
         * @return
         *     possible object is
         *     {@link IDKMEHR }
         *
         */
        public IDKMEHR getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value
         *     allowed object is
         *     {@link IDKMEHR }
         *
         */
        public void setId(IDKMEHR value) {
            this.id = value;
        }

        /**
         * Gets the value of the cd property.
         *
         * @return
         *     possible object is
         *     {@link CDCARENETPERSONALPART }
         *
         */
        public CDCARENETPERSONALPART getCd() {
            return cd;
        }

        /**
         * Sets the value of the cd property.
         *
         * @param value
         *     allowed object is
         *     {@link CDCARENETPERSONALPART }
         *
         */
        public void setCd(CDCARENETPERSONALPART value) {
            this.cd = value;
        }

        /**
         * Gets the value of the date property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the time property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="cd" type="{http://www.ehealth.fgov.be/standards/kmehr/cd/v1}CD-CARENET-THIRDPAYER-CONTRACT"/>
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
        "cd"
    })
    public static class Thirdpayercontract
        implements Serializable
    {

        private final static long serialVersionUID = 20130710L;
        @XmlElement(required = true)
        protected CDCARENETTHIRDPAYERCONTRACT cd;

        /**
         * Gets the value of the cd property.
         *
         * @return
         *     possible object is
         *     {@link CDCARENETTHIRDPAYERCONTRACT }
         *
         */
        public CDCARENETTHIRDPAYERCONTRACT getCd() {
            return cd;
        }

        /**
         * Sets the value of the cd property.
         *
         * @param value
         *     allowed object is
         *     {@link CDCARENETTHIRDPAYERCONTRACT }
         *
         */
        public void setCd(CDCARENETTHIRDPAYERCONTRACT value) {
            this.cd = value;
        }

    }

}
