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


package org.taktik.icure.be.ehealth.samws.v2.consultation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.taktik.icure.be.ehealth.samws.v2.core.AnomalyType;


/**
 * <p>Java class for FindCompoundingFormulaResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FindCompoundingFormulaResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CompoundingFormula" type="{urn:be:fgov:ehealth:samws:v2:consultation}ConsultCompoundingFormulaType" maxOccurs="unbounded"/>
 *         &lt;element name="Anomaly" type="{urn:be:fgov:ehealth:samws:v2:core}AnomalyType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="searchDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompoundingFormulaResponseType", propOrder = {
    "anomalies",
    "compoundingFormulas"
})
@XmlRootElement(name = "FindCompoundingFormulaResponse")
public class FindCompoundingFormulaResponse
    implements Serializable
{

    private final static long serialVersionUID = 2L;
    @XmlElement(name = "Anomaly")
    protected List<AnomalyType> anomalies;
    @XmlElement(name = "CompoundingFormula")
    protected List<ConsultCompoundingFormulaType> compoundingFormulas;
    @XmlAttribute(name = "searchDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar searchDate;

    /**
     * Gets the value of the anomalies property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anomalies property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnomalies().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnomalyType }
     *
     *
     */
    public List<AnomalyType> getAnomalies() {
        if (anomalies == null) {
            anomalies = new ArrayList<AnomalyType>();
        }
        return this.anomalies;
    }

    /**
     * Gets the value of the compoundingFormulas property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compoundingFormulas property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompoundingFormulas().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultCompoundingFormulaType }
     *
     *
     */
    public List<ConsultCompoundingFormulaType> getCompoundingFormulas() {
        if (compoundingFormulas == null) {
            compoundingFormulas = new ArrayList<ConsultCompoundingFormulaType>();
        }
        return this.compoundingFormulas;
    }

    /**
     * Gets the value of the searchDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSearchDate() {
        return searchDate;
    }

    /**
     * Sets the value of the searchDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSearchDate(XMLGregorianCalendar value) {
        this.searchDate = value;
    }

}
