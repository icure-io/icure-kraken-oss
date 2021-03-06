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

package org.taktik.icure.dto.be.mikrono;

import org.taktik.icure.dto.common.MimeAttachment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aduchate on 12/07/2017.
 */
public class EmailOrSmsMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<MimeAttachment> attachments = new ArrayList<>();

	private String destination; //email or phone number (international format)
	private boolean destinationIsNotPatient; //Messages is sent to other patient's doctor but should appear in patient emails list and be highlighted.
	private String destinationName; // Case of a doc.

	private boolean sendCopyToSender;

	private String senderName;
	private String replyToEmail;

	private String content;

	private String messageId;
	private String patientId;
	private String senderId;

	private String subject;

	private Type type;

	public List<MimeAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<MimeAttachment> attachments) {
		this.attachments = attachments;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean isDestinationIsNotPatient() {
		return destinationIsNotPatient;
	}

	public void setDestinationIsNotPatient(boolean destinationIsNotPatient) {
		this.destinationIsNotPatient = destinationIsNotPatient;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public boolean isSendCopyToSender() {
		return sendCopyToSender;
	}

	public void setSendCopyToSender(boolean sendCopyToSender) {
		this.sendCopyToSender = sendCopyToSender;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getReplyToEmail() {
		return replyToEmail;
	}

	public void setReplyToEmail(String replyToEmail) {
		this.replyToEmail = replyToEmail;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
