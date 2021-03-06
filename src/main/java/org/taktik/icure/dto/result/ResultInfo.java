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

package org.taktik.icure.dto.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.taktik.icure.entities.base.Code;
import org.taktik.icure.entities.base.CodeStub;
import org.taktik.icure.entities.embed.Service;

public class ResultInfo implements Serializable {
	private String ssin;
	private String lastName;
	private String firstName;
	private Long   dateOfBirth;
	private String sex;

	private String documentId;
	private String protocol;
	private Boolean complete;
	private Long   demandDate;
	private String labo;
	private String engine;

	private List<CodeStub> codes = new ArrayList<>();
	private List<Service> services;

	public String getSsin() {
		return ssin;
	}

	public void setSsin(String ssin) {
		this.ssin = ssin;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	public Long getDemandDate() {
		return demandDate;
	}

	public void setDemandDate(Long demandDate) {
		this.demandDate = demandDate;
	}

	public void setLabo(String labo) {
		this.labo = labo;
	}

	public String getLabo() {
		return labo;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public List<CodeStub> getCodes() {
		return codes;
	}

	public void setCodes(List<CodeStub> codes) {
		this.codes = codes;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
}
