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
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2017.03.08 à 06:26:06 PM CET
//


package org.w3._2000._09.xmldsig_;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour X509IssuerSerialType complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="X509IssuerSerialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509IssuerSerialType", propOrder = {
    "x509IssuerName",
    "x509SerialNumber"
})
public class X509IssuerSerialType
    implements Serializable
{

    private final static long serialVersionUID = 20161201L;
    @XmlElement(name = "X509IssuerName", required = true)
    protected String x509IssuerName;
    @XmlElement(name = "X509SerialNumber", required = true)
    protected BigInteger x509SerialNumber;

    /**
     * Obtient la valeur de la propriété x509IssuerName.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getX509IssuerName() {
        return x509IssuerName;
    }

    /**
     * Définit la valeur de la propriété x509IssuerName.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setX509IssuerName(String value) {
        this.x509IssuerName = value;
    }

    /**
     * Obtient la valeur de la propriété x509SerialNumber.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getX509SerialNumber() {
        return x509SerialNumber;
    }

    /**
     * Définit la valeur de la propriété x509SerialNumber.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setX509SerialNumber(BigInteger value) {
        this.x509SerialNumber = value;
    }

}
