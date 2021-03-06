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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultCommentedClassificationTreeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultCommentedClassificationTreeType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:samws:v2:consultation}ConsultCommentedClassificationType">
 *       &lt;sequence>
 *         &lt;element name="CommentedClassification" type="{urn:be:fgov:ehealth:samws:v2:consultation}ConsultCommentedClassificationTreeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultCommentedClassificationTreeType", propOrder = {
    "commentedClassifications"
})
public class ConsultCommentedClassificationTreeType
    extends ConsultCommentedClassificationType
    implements Serializable
{

    private final static long serialVersionUID = 2L;
    @XmlElement(name = "CommentedClassification")
    protected List<ConsultCommentedClassificationTreeType> commentedClassifications;

    /**
     * Gets the value of the commentedClassifications property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentedClassifications property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentedClassifications().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultCommentedClassificationTreeType }
     *
     *
     */
    public List<ConsultCommentedClassificationTreeType> getCommentedClassifications() {
        if (commentedClassifications == null) {
            commentedClassifications = new ArrayList<ConsultCommentedClassificationTreeType>();
        }
        return this.commentedClassifications;
    }

}
