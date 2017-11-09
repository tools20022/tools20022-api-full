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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.choice.NotificationAdviceStatus1Choice;
import com.tools20022.repository.choice.NotificationCancellationRequestStatus1Choice;
import com.tools20022.repository.msg.CorporateActionInformation2;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to an issuer (or its agent) to report the
 * status, or change in status, of a notification advice or notification
 * cancellation request.<br>
 * <b>Usage</b><br>
 * When this message is used to report the status of a notification advice then
 * the building block Agent Corporate Action Notification Advice Identification
 * must be present.<br>
 * When this message is used to provide the status of a notification
 * cancellation request then the building block Notification Cancellation
 * Request Identification must be present.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.011.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCANtfctnStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationCancellationRequestStatusOrNotificationAdviceStatusRule
 * AgentCANotificationStatusAdviceV01.
 * mmNotificationCancellationRequestStatusOrNotificationAdviceStatusRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule
 * AgentCANotificationStatusAdviceV01.
 * mmAgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmIdentification
 * AgentCANotificationStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationAdviceIdentification
 * AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationCancellationRequestIdentification
 * AgentCANotificationStatusAdviceV01.
 * mmAgentCANotificationCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCANotificationStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationCancellationRequestStatus
 * AgentCANotificationStatusAdviceV01.mmNotificationCancellationRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationAdviceStatus
 * AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCANotificationStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or change in status, of a notification advice or notification cancellation request.\r\nUsage\r\nWhen this message is used to report the status of a notification advice then the building block Agent Corporate Action Notification Advice Identification must be present.\r\nWhen this message is used to provide the status of a notification cancellation request then the building block Notification Cancellation Request Identification must be present."
 * </li>
 * </ul>
 */
public class AgentCANotificationStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either NotificationCancellationRequestStatus or NotificationAdviceStatus
	 * must be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationCancellationRequestStatus
	 * AgentCANotificationStatusAdviceV01.
	 * mmNotificationCancellationRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationAdviceStatus
	 * AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01
	 * AgentCANotificationStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "NotificationCancellationRequestStatusOrNotificationAdviceStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either NotificationCancellationRequestStatus or NotificationAdviceStatus must be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmNotificationCancellationRequestStatusOrNotificationAdviceStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCancellationRequestStatusOrNotificationAdviceStatusRule";
			definition = "Either NotificationCancellationRequestStatus or NotificationAdviceStatus must be present but not both.";
			messageDefinition_lazy = () -> AgentCANotificationStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(AgentCANotificationStatusAdviceV01.mmNotificationCancellationRequestStatus, AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus);
		}
	};
	/**
	 * Either AgentCANotificationAdviceIdentification or
	 * AgentCANotificationCancellationRequestIdentification must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationAdviceIdentification
	 * AgentCANotificationStatusAdviceV01.
	 * mmAgentCANotificationAdviceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationCancellationRequestIdentification
	 * AgentCANotificationStatusAdviceV01.
	 * mmAgentCANotificationCancellationRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01
	 * AgentCANotificationStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AgentCANotificationAdviceIdentification or AgentCANotificationCancellationRequestIdentification must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmAgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule";
			definition = "Either AgentCANotificationAdviceIdentification or AgentCANotificationCancellationRequestIdentification must be present, but not both.";
			messageDefinition_lazy = () -> AgentCANotificationStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIdentification, AgentCANotificationStatusAdviceV01.mmAgentCANotificationCancellationRequestIdentification);
		}
	};
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * status advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the Sender to unambiguously identify the status advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the status advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected DocumentIdentification8 agentCANotificationAdviceIdentification;
	/**
	 * Identification of the linked Agent CA Notification Advice for which a
	 * status is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCANtfctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCANotificationAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Notification Advice for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCANotificationAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCANtfctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCANotificationAdviceIdentification";
			definition = "Identification of the linked Agent CA Notification Advice for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected DocumentIdentification8 agentCANotificationCancellationRequestIdentification;
	/**
	 * Identification of the linked Agent CA Notification Cancellation Request
	 * for which a status is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCANtfctnCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCANotificationCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Notification Cancellation Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCANotificationCancellationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCANtfctnCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCANotificationCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Notification Cancellation Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected CorporateActionInformation2 corporateActionGeneralInformation;
	/**
	 * General information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2
	 * CorporateActionInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation2.mmObject();
		}
	};
	protected NotificationCancellationRequestStatus1Choice notificationCancellationRequestStatus;
	/**
	 * Status of the Notification Cancellation Request sent by the issuer
	 * (agent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NotificationCancellationRequestStatus1Choice
	 * NotificationCancellationRequestStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnCxlReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationCancellationRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the Notification Cancellation Request sent by the issuer (agent)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotificationCancellationRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnCxlReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCancellationRequestStatus";
			definition = "Status of the Notification Cancellation Request sent by the issuer (agent).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationCancellationRequestStatus1Choice.mmObject();
		}
	};
	protected NotificationAdviceStatus1Choice notificationAdviceStatus;
	/**
	 * Status of the notification advice sent by the issuer (agent).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NotificationAdviceStatus1Choice
	 * NotificationAdviceStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnAdvcSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationAdviceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the notification advice sent by the issuer (agent)."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotificationAdviceStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnAdvcSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationAdviceStatus";
			definition = "Status of the notification advice sent by the issuer (agent).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationAdviceStatus1Choice.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCANotificationStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or change in status, of a notification advice or notification cancellation request.\r\nUsage\r\nWhen this message is used to report the status of a notification advice then the building block Agent Corporate Action Notification Advice Identification must be present.\r\nWhen this message is used to provide the status of a notification cancellation request then the building block Notification Cancellation Request Identification must be present.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(AgentCANotificationStatusAdviceV01.mmNotificationCancellationRequestStatusOrNotificationAdviceStatusRule,
						AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule);
				rootElement = "Document";
				xmlTag = "AgtCANtfctnStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationStatusAdviceV01.mmIdentification, AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIdentification,
						AgentCANotificationStatusAdviceV01.mmAgentCANotificationCancellationRequestIdentification, AgentCANotificationStatusAdviceV01.mmCorporateActionGeneralInformation,
						AgentCANotificationStatusAdviceV01.mmNotificationCancellationRequestStatus, AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	public DocumentIdentification8 getAgentCANotificationAdviceIdentification() {
		return agentCANotificationAdviceIdentification;
	}

	public void setAgentCANotificationAdviceIdentification(DocumentIdentification8 agentCANotificationAdviceIdentification) {
		this.agentCANotificationAdviceIdentification = agentCANotificationAdviceIdentification;
	}

	public DocumentIdentification8 getAgentCANotificationCancellationRequestIdentification() {
		return agentCANotificationCancellationRequestIdentification;
	}

	public void setAgentCANotificationCancellationRequestIdentification(DocumentIdentification8 agentCANotificationCancellationRequestIdentification) {
		this.agentCANotificationCancellationRequestIdentification = agentCANotificationCancellationRequestIdentification;
	}

	public CorporateActionInformation2 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation2 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	public NotificationCancellationRequestStatus1Choice getNotificationCancellationRequestStatus() {
		return notificationCancellationRequestStatus;
	}

	public void setNotificationCancellationRequestStatus(NotificationCancellationRequestStatus1Choice notificationCancellationRequestStatus) {
		this.notificationCancellationRequestStatus = notificationCancellationRequestStatus;
	}

	public NotificationAdviceStatus1Choice getNotificationAdviceStatus() {
		return notificationAdviceStatus;
	}

	public void setNotificationAdviceStatus(NotificationAdviceStatus1Choice notificationAdviceStatus) {
		this.notificationAdviceStatus = notificationAdviceStatus;
	}
}