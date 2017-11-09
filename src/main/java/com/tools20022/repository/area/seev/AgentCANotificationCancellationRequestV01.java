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

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.msg.CorporateActionInformation2;
import com.tools20022.repository.msg.CorporateActionNotificationAdvice1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.NotificationCancellation1;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to a CSD to request the
 * cancellation of a notification advice message.<br>
 * <b>Usage</b><br>
 * When this message is used to request the cancellation of a notification
 * advice message, the function of the message must be cancellation.<br>
 * When this message is used to request the withdrawal of a Corporate Action
 * event or option, then the function of the message must be withdrawal.<br>
 * In both cases, the building block notification advice identification must be
 * present to link this cancellation request to the notification advice that was
 * previously sent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.010.001.01}</li>
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
 * xmlTag} = "AgtCANtfctnCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#mmIdentification
 * AgentCANotificationCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#mmNotificationCancellationTypeAndLinkage
 * AgentCANotificationCancellationRequestV01.
 * mmNotificationCancellationTypeAndLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#mmCorporateActionGeneralInformation
 * AgentCANotificationCancellationRequestV01.mmCorporateActionGeneralInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#mmCorporateActionNotificationDetails
 * AgentCANotificationCancellationRequestV01.
 * mmCorporateActionNotificationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCANotificationCancellationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to request the cancellation of a notification advice message.\r\nUsage\r\nWhen this message is used to request the cancellation of a notification advice message, the function of the message must be cancellation.\r\nWhen this message is used to request the withdrawal of a Corporate Action event or option, then the function of the message must be withdrawal.\r\nIn both cases, the building block notification advice identification must be present to link this cancellation request to the notification advice that was previously sent."
 * </li>
 * </ul>
 */
public class AgentCANotificationCancellationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * cancellation request.
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
	 * "Identification assigned by the Sender to unambiguously identify the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected NotificationCancellation1 notificationCancellationTypeAndLinkage;
	/**
	 * Provides information about the type of notification cancellation request
	 * and linked message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NotificationCancellation1
	 * NotificationCancellation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnCxlTpAndLkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationCancellationTypeAndLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the type of  notification cancellation request and linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotificationCancellationTypeAndLinkage = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnCxlTpAndLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCancellationTypeAndLinkage";
			definition = "Provides information about the type of  notification cancellation request and linked message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationCancellation1.mmObject();
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
	protected CorporateActionNotificationAdvice1 corporateActionNotificationDetails;
	/**
	 * Detailed information of the notification advice to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationAdvice1
	 * CorporateActionNotificationAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnNtfctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionNotificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information of the notification advice to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionNotificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnNtfctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionNotificationDetails";
			definition = "Detailed information of the notification advice to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNotificationAdvice1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCANotificationCancellationRequestV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to request the cancellation of a notification advice message.\r\nUsage\r\nWhen this message is used to request the cancellation of a notification advice message, the function of the message must be cancellation.\r\nWhen this message is used to request the withdrawal of a Corporate Action event or option, then the function of the message must be withdrawal.\r\nIn both cases, the building block notification advice identification must be present to link this cancellation request to the notification advice that was previously sent.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCANtfctnCxlReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationCancellationRequestV01.mmIdentification, AgentCANotificationCancellationRequestV01.mmNotificationCancellationTypeAndLinkage,
						AgentCANotificationCancellationRequestV01.mmCorporateActionGeneralInformation, AgentCANotificationCancellationRequestV01.mmCorporateActionNotificationDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "010";
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

	public NotificationCancellation1 getNotificationCancellationTypeAndLinkage() {
		return notificationCancellationTypeAndLinkage;
	}

	public void setNotificationCancellationTypeAndLinkage(NotificationCancellation1 notificationCancellationTypeAndLinkage) {
		this.notificationCancellationTypeAndLinkage = notificationCancellationTypeAndLinkage;
	}

	public CorporateActionInformation2 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation2 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	public CorporateActionNotificationAdvice1 getCorporateActionNotificationDetails() {
		return corporateActionNotificationDetails;
	}

	public void setCorporateActionNotificationDetails(CorporateActionNotificationAdvice1 corporateActionNotificationDetails) {
		this.corporateActionNotificationDetails = corporateActionNotificationDetails;
	}
}