package org.taktik.icure.services.external.rest.v2.dto.security

import java.io.Serializable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import org.taktik.icure.services.external.rest.v2.dto.filter.predicate.Predicate
import org.taktik.icure.services.external.rest.v2.handlers.JacksonPermissionItemDeserializer

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = JacksonPermissionItemDeserializer::class)
interface PermissionItemDto : Cloneable, Serializable {
	val type: PermissionTypeDto
	val predicate: Predicate
}
