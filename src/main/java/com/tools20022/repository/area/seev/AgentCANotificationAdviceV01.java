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
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to a CSD to:<br>
 * - Provide a CSD with the details of a corporate action along with the
 * possible options available to the clients of that CSD; and<br>
 * - to update a corporate action notification. A notification advice can be
 * initially sent as a preliminary advice and subsequently replaced by another
 * notification advice with updated information.<br>
 * <b>Usage</b><br>
 * This message is used:<br>
 * - to provide a CSD with the details of a corporate action along with the
 * possible options available to the clients of that CSD. The information can be
 * complete or incomplete.<br>
 * - to update a corporate action notification advice. A notification advice can
 * be initially sent as a preliminary advice and subsequently replaced by
 * another notification advice with updated information. As per SMPG
 * recommendation, all the information should be provided in the update, not
 * only updated information.<br>
 * An Agent Corporate Action Notification Status Advice is sent in reply to the
 * Agent Corporate Action Notification Advice.<br>
 * Note: The amendment of a corporate action notification is done through a
 * replacement mechanism in line with both the ISO 15022 messages used in the
 * flow between the CSD and its clients, and the ISO 20022 proxy voting
 * messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.009.001.01}</li>
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
 * xmlTag} = "AgtCANtfctnAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmIdentification
 * AgentCANotificationAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmNotificationTypeAndLinkage
 * AgentCANotificationAdviceV01.mmNotificationTypeAndLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmNotificationGeneralInformation
 * AgentCANotificationAdviceV01.mmNotificationGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmCorporateActionGeneralInformation
 * AgentCANotificationAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmCorporateActionDetails
 * AgentCANotificationAdviceV01.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmCorporateActionOptionDetails
 * AgentCANotificationAdviceV01.mmCorporateActionOptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmContactDetails
 * AgentCANotificationAdviceV01.mmContactDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmAdditionalInformation
 * AgentCANotificationAdviceV01.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCANotificationAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to:\r\n- Provide a CSD with the details of a corporate action along with the possible options available to the clients of that CSD; and\r\n- to update a corporate action notification. A notification advice can be initially sent as a preliminary advice and subsequently replaced by another notification advice with updated information.\r\nUsage\r\nThis message is used:\r\n- to provide a CSD with the details of a corporate action along with the possible options available to the clients of that CSD. The information can be complete or incomplete.\r\n- to update a corporate action notification advice. A notification advice can be initially sent as a preliminary advice and subsequently replaced by another notification advice with updated information. As per SMPG recommendation, all the information should be provided in the update, not only updated information.\r\nAn Agent Corporate Action Notification Status Advice is sent in reply to the Agent Corporate Action Notification Advice.\r\nNote: The amendment of a corporate action notification is done through a replacement mechanism in line with both the ISO 15022 messages used in the flow between the CSD and its clients, and the ISO 20022 proxy voting messages."
 * </li>
 * </ul>
 */
public class AgentCANotificationAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * advice.
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
	 * "Identification assigned by the Sender to unambiguously identify the advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected LinkedCorporateAction1 notificationTypeAndLinkage;
	/**
	 * Provides information about the type of notification advice and linked
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.LinkedCorporateAction1
	 * LinkedCorporateAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnTpAndLkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationTypeAndLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the type of  notification advice and linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotificationTypeAndLinkage = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnTpAndLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationTypeAndLinkage";
			definition = "Provides information about the type of  notification advice and linked message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LinkedCorporateAction1.mmObject();
		}
	};
	protected CorporateActionNotification1 notificationGeneralInformation;
	/**
	 * Provides general information about the notification advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1
	 * CorporateActionNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides general information about the notification advice."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotificationGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationGeneralInformation";
			definition = "Provides general information about the notification advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionNotification1.mmObject();
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
	protected CorporateAction2 corporateActionDetails;
	/**
	 * Provides details information about the CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details information about the CA event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Provides details information about the CA event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateAction2.mmObject();
		}
	};
	protected List<CorporateActionOption1> corporateActionOptionDetails;
	/**
	 * Provides detailed information about the option of the CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnOptnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information about the option of the CA event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionOptionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnOptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionDetails";
			definition = "Provides detailed information about the option of the CA event.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption1.mmObject();
		}
	};
	protected List<ContactPerson1> contactDetails;
	/**
	 * Provides information about the contact responsible for the transaction
	 * identified in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactPerson1
	 * ContactPerson1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the contact responsible for the transaction identified in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmContactDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactDetails";
			definition = "Provides information about the contact responsible for the transaction identified in the message.";
			minOccurs = 0;
			complexType_lazy = () -> ContactPerson1.mmObject();
		}
	};
	protected CorporateActionNarrative2 additionalInformation;
	/**
	 * Provides additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2
	 * CorporateActionNarrative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCANotificationAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to:\r\n- Provide a CSD with the details of a corporate action along with the possible options available to the clients of that CSD; and\r\n- to update a corporate action notification. A notification advice can be initially sent as a preliminary advice and subsequently replaced by another notification advice with updated information.\r\nUsage\r\nThis message is used:\r\n- to provide a CSD with the details of a corporate action along with the possible options available to the clients of that CSD. The information can be complete or incomplete.\r\n- to update a corporate action notification advice. A notification advice can be initially sent as a preliminary advice and subsequently replaced by another notification advice with updated information. As per SMPG recommendation, all the information should be provided in the update, not only updated information.\r\nAn Agent Corporate Action Notification Status Advice is sent in reply to the Agent Corporate Action Notification Advice.\r\nNote: The amendment of a corporate action notification is done through a replacement mechanism in line with both the ISO 15022 messages used in the flow between the CSD and its clients, and the ISO 20022 proxy voting messages.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCANtfctnAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmIdentification, AgentCANotificationAdviceV01.mmNotificationTypeAndLinkage, AgentCANotificationAdviceV01.mmNotificationGeneralInformation,
						AgentCANotificationAdviceV01.mmCorporateActionGeneralInformation, AgentCANotificationAdviceV01.mmCorporateActionDetails, AgentCANotificationAdviceV01.mmCorporateActionOptionDetails,
						AgentCANotificationAdviceV01.mmContactDetails, AgentCANotificationAdviceV01.mmAdditionalInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "009";
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

	public LinkedCorporateAction1 getNotificationTypeAndLinkage() {
		return notificationTypeAndLinkage;
	}

	public void setNotificationTypeAndLinkage(LinkedCorporateAction1 notificationTypeAndLinkage) {
		this.notificationTypeAndLinkage = notificationTypeAndLinkage;
	}

	public CorporateActionNotification1 getNotificationGeneralInformation() {
		return notificationGeneralInformation;
	}

	public void setNotificationGeneralInformation(CorporateActionNotification1 notificationGeneralInformation) {
		this.notificationGeneralInformation = notificationGeneralInformation;
	}

	public CorporateActionInformation2 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation2 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	public CorporateAction2 getCorporateActionDetails() {
		return corporateActionDetails;
	}

	public void setCorporateActionDetails(CorporateAction2 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
	}

	public List<CorporateActionOption1> getCorporateActionOptionDetails() {
		return corporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(List<CorporateActionOption1> corporateActionOptionDetails) {
		this.corporateActionOptionDetails = corporateActionOptionDetails;
	}

	public List<ContactPerson1> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<ContactPerson1> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public CorporateActionNarrative2 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(CorporateActionNarrative2 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}