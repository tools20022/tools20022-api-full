/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the meta data associated with a netting cut off report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmMessageIdentification
 * NettingCutOffReportData1.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmCreationDateTime
 * NettingCutOffReportData1.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmReportType
 * NettingCutOffReportData1.mmReportType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmActivationDate
 * NettingCutOffReportData1.mmActivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmNetServiceParticipantIdentification
 * NettingCutOffReportData1.mmNetServiceParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmReportServicer
 * NettingCutOffReportData1.mmReportServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmNetServiceType
 * NettingCutOffReportData1.mmNetServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmMessagePagination
 * NettingCutOffReportData1.mmMessagePagination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01#mmReportData
 * NettingCutOffReferenceDataReportV01.mmReportData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NettingCutOffReportData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the meta data associated with a netting cut off report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NettingCutOffReportData1", propOrder = {"messageIdentification", "creationDateTime", "reportType", "activationDate", "netServiceParticipantIdentification", "reportServicer", "netServiceType", "messagePagination"})
public class NettingCutOffReportData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text messageIdentification;
	/**
	 * Unique and unambiguous identifier for a message, as assigned by the
	 * Sender. This unique identifier can be used for cross-referencing purposes
	 * in subsequent messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a message, as assigned by the Sender. This unique identifier can be used for cross-referencing purposes in subsequent messages."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identifier for a message, as assigned by the Sender. This unique identifier can be used for cross-referencing purposes in subsequent messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date and time at which the net report was generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the net report was generated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the net report was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max4Text reportType;
	/**
	 * Describes the type of net report, indicating how the obligations have
	 * been calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of net report, indicating how the obligations have been calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportType";
			definition = "Describes the type of net report, indicating how the obligations have been calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	protected ISODate activationDate;
	/**
	 * Date on which the proposed netting cut off will become active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the proposed netting cut off will become active."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "ActvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivationDate";
			definition = "Date on which the proposed netting cut off will become active.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PartyIdentification73Choice netServiceParticipantIdentification;
	/**
	 * Describes the participant receiving the net report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcPtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the participant receiving the net report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetServiceParticipantIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcPtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceParticipantIdentification";
			definition = "Describes the participant receiving the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected PartyIdentification73Choice reportServicer;
	/**
	 * Describes the central system responsible for generating the net report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the central system responsible for generating the net report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportServicer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportServicer";
			definition = "Describes the central system responsible for generating the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected Max35Text netServiceType;
	/**
	 * Describes the type of netting service supporting the net report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of netting service supporting the net report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceType";
			definition = "Describes the type of netting service supporting the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Pagination messagePagination;
	/**
	 * Page number of the message (within the net cut off report) and
	 * continuation indicator to indicate that the report is to continue or that
	 * the message is the last page of the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pagination Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within the net cut off report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessagePagination = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Page number of the message (within the net cut off report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NettingCutOffReportData1.mmMessageIdentification, NettingCutOffReportData1.mmCreationDateTime, NettingCutOffReportData1.mmReportType, NettingCutOffReportData1.mmActivationDate,
						NettingCutOffReportData1.mmNetServiceParticipantIdentification, NettingCutOffReportData1.mmReportServicer, NettingCutOffReportData1.mmNetServiceType, NettingCutOffReportData1.mmMessagePagination);
				messageBuildingBlock_lazy = () -> Arrays.asList(NettingCutOffReferenceDataReportV01.mmReportData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NettingCutOffReportData1";
				definition = "Specifies the meta data associated with a netting cut off report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "CreDtTm", required = true)
	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlElement(name = "RptTp", required = true)
	public Max4Text getReportType() {
		return reportType;
	}

	public void setReportType(Max4Text reportType) {
		this.reportType = reportType;
	}

	@XmlElement(name = "ActvtnDt", required = true)
	public ISODate getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(ISODate activationDate) {
		this.activationDate = activationDate;
	}

	@XmlElement(name = "NetSvcPtcptId")
	public PartyIdentification73Choice getNetServiceParticipantIdentification() {
		return netServiceParticipantIdentification;
	}

	public void setNetServiceParticipantIdentification(PartyIdentification73Choice netServiceParticipantIdentification) {
		this.netServiceParticipantIdentification = netServiceParticipantIdentification;
	}

	@XmlElement(name = "RptSvcr")
	public PartyIdentification73Choice getReportServicer() {
		return reportServicer;
	}

	public void setReportServicer(PartyIdentification73Choice reportServicer) {
		this.reportServicer = reportServicer;
	}

	@XmlElement(name = "NetSvcTp")
	public Max35Text getNetServiceType() {
		return netServiceType;
	}

	public void setNetServiceType(Max35Text netServiceType) {
		this.netServiceType = netServiceType;
	}

	@XmlElement(name = "MsgPgntn")
	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public void setMessagePagination(com.tools20022.repository.msg.Pagination messagePagination) {
		this.messagePagination = messagePagination;
	}
}