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
// Generated on: 2019.06.14 at 03:48:49 PM CEST
//


package org.taktik.icure.services.external.rest.v2.dto.be.ehealth.kmehr.v20120701.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD-STENT-LESIONTYPEvalues.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-STENT-LESIONTYPEvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="multi-segment"/>
 *     &lt;enumeration value="aorto-ostiale"/>
 *     &lt;enumeration value="bifurcation"/>
 *     &lt;enumeration value="occlusionchroniquetotplus3m"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "CD-STENT-LESIONTYPEvalues")
@XmlEnum
public enum CDSTENTLESIONTYPEvalues {

    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("multi-segment")
    MULTI_SEGMENT("multi-segment"),
    @XmlEnumValue("aorto-ostiale")
    AORTO_OSTIALE("aorto-ostiale"),
    @XmlEnumValue("bifurcation")
    BIFURCATION("bifurcation"),
    @XmlEnumValue("occlusionchroniquetotplus3m")
    OCCLUSIONCHRONIQUETOTPLUS_3_M("occlusionchroniquetotplus3m");
    private final String value;

    CDSTENTLESIONTYPEvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDSTENTLESIONTYPEvalues fromValue(String v) {
        for (CDSTENTLESIONTYPEvalues c: CDSTENTLESIONTYPEvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
