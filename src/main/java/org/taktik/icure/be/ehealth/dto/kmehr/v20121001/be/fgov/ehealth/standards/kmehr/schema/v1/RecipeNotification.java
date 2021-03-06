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

package org.taktik.icure.be.ehealth.dto.kmehr.v20121001.be.fgov.ehealth.standards.kmehr.schema.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationType", propOrder = {"text", "kmehrmessage"})
@XmlRootElement(name = "notification")
public class RecipeNotification {
	@XmlSchemaType(name = "text")
	String text;
	@XmlSchemaType(name = "kmehrmessage")
	Kmehrmessage kmehrmessage;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Kmehrmessage getKmehrmessage() {
		return kmehrmessage;
	}

	public void setKmehrmessage(Kmehrmessage kmehrmessage) {
		this.kmehrmessage = kmehrmessage;
	}
}
