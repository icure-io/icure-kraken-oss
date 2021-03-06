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
package org.taktik.icure.entities.embed

import java.io.Serializable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.github.pozo.KotlinBuilder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@KotlinBuilder
data class Partnership(
	val type: PartnershipType? = null, //codes are from CD-CONTACT-PERSON
	val status: PartnershipStatus? = null,
	val partnerId: String? = null, //Person: can either be a patient or a hcp
	@Deprecated("use type instead")
	val meToOtherRelationshipDescription: String? = null, //son if partnerId is my son - codes are from CD-CONTACT-PERSON
	@Deprecated("use type instead")
	val otherToMeRelationshipDescription: String? = null //father/mother if partnerId is my son
) : Serializable
