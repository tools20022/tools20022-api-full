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
import com.tools20022.repository.area.SecuritiesEventsPreviousVersion;
import com.tools20022.repository.choice.AccountIdentification32Choice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISOPreviousversion;
import com.tools20022.repository.msgset.CorporateActionsMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionNotification message to an
 * account owner or its designated agent to notify details of a corporate action
 * event and optionally account information, eligible balance and entitlements. <br>
 * It may also include possible elections or choices available to the account
 * owner. The account servicer can initially send the
 * CorporateActionNotification message as a preliminary advice, subsequently
 * replaced by another CorporateActionNotification message with complete or
 * confirmed information. <br>
 * It may also be sent to an account owner or its designated agent, to remind of
 * event details and/or of missing or incomplete instructions for a corporate
 * action event.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate),<br>
 * using the relevant elements in the business application header (BAH).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPagination
 * CorporateActionNotificationV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmNotificationGeneralInformation
 * CorporateActionNotificationV07.mmNotificationGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPreviousNotificationIdentification
 * CorporateActionNotificationV07.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmInstructionIdentification
 * CorporateActionNotificationV07.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmOtherDocumentIdentification
 * CorporateActionNotificationV07.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmEventsLinkage
 * CorporateActionNotificationV07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmCorporateActionGeneralInformation
 * CorporateActionNotificationV07.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmAccountDetails
 * CorporateActionNotificationV07.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmIntermediateSecurity
 * CorporateActionNotificationV07.mmIntermediateSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmCorporateActionDetails
 * CorporateActionNotificationV07.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmCorporateActionOptionDetails
 * CorporateActionNotificationV07.mmCorporateActionOptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmAdditionalInformation
 * CorporateActionNotificationV07.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmIssuerAgent
 * CorporateActionNotificationV07.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPayingAgent
 * CorporateActionNotificationV07.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmSubPayingAgent
 * CorporateActionNotificationV07.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmRegistrar
 * CorporateActionNotificationV07.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmResellingAgent
 * CorporateActionNotificationV07.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV07.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmDropAgent
 * CorporateActionNotificationV07.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmSolicitationAgent
 * CorporateActionNotificationV07.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmInformationAgent
 * CorporateActionNotificationV07.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmSupplementaryData
 * CorporateActionNotificationV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOPreviousversion
 * CorporateActionsISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsMaintenance20162017
 * CorporateActionsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.031.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#for_seev_CorporateActionNotificationV07
 * ConstraintInterestPaymentRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#for_seev_CorporateActionNotificationV07
 * ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule#for_seev_CorporateActionNotificationV07
 * ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityOfIntermediateSecuritiesRule#for_seev_CorporateActionNotificationV07
 * ConstraintQuantityOfIntermediateSecuritiesRule.
 * for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherEventRule#for_seev_CorporateActionNotificationV07
 * ConstraintOtherEventRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecurity1Rule#for_seev_CorporateActionNotificationV07
 * ConstraintIntermediateSecurity1Rule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecurity2Rule#for_seev_CorporateActionNotificationV07
 * ConstraintIntermediateSecurity2Rule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationIdentificationRule#for_seev_CorporateActionNotificationV07
 * ConstraintNotificationIdentificationRule.
 * for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#for_seev_CorporateActionNotificationV07
 * ConstraintIntermediateSecuritiesDistribution1Rule.
 * for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentDateRule#for_seev_CorporateActionNotificationV07
 * ConstraintPaymentDateRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNameChangeRule#for_seev_CorporateActionNotificationV07
 * ConstraintNameChangeRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV07
 * ConstraintRateAndCorporateActionEventRule.
 * for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV07
 * ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#for_seev_CorporateActionNotificationV07
 * ConstraintIssuerAgentGuideline.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#for_seev_CorporateActionNotificationV07
 * ConstraintNewMaturityDateRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInformationEventRule#for_seev_CorporateActionNotificationV07
 * ConstraintInformationEventRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV07
 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionNotificationV07
 * ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotificationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
 * CorporateActionNotificationV08}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
 * CorporateActionNotificationV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotificationV07", propOrder = {"pagination", "notificationGeneralInformation", "previousNotificationIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage",
		"corporateActionGeneralInformation", "accountDetails", "intermediateSecurity", "corporateActionDetails", "corporateActionOptionDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "registrar",
		"resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionNotificationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn")
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmPagination
	 * CorporateActionNotificationV08.mmPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPagination
	 * CorporateActionNotificationV06.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<Pagination>> mmPagination = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<Pagination>>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmPagination);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmPagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(CorporateActionNotificationV07 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<Pagination> value) {
			obj.setPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnGnlInf", required = true)
	protected CorporateActionNotification5 notificationGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5
	 * CorporateActionNotification5}</li>
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
	 * "General information about the event notification type, status and contents."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmNotificationGeneralInformation
	 * CorporateActionNotificationV08.mmNotificationGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmNotificationGeneralInformation
	 * CorporateActionNotificationV06.mmNotificationGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, CorporateActionNotification5> mmNotificationGeneralInformation = new MMMessageBuildingBlock<CorporateActionNotificationV07, CorporateActionNotification5>() {
		{
			xmlTag = "NtfctnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationGeneralInformation";
			definition = "General information about the event notification type, status and contents.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmNotificationGeneralInformation);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmNotificationGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionNotification5.mmObject();
		}

		@Override
		public CorporateActionNotification5 getValue(CorporateActionNotificationV07 obj) {
			return obj.getNotificationGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, CorporateActionNotification5 value) {
			obj.setNotificationGeneralInformation(value);
		}
	};
	@XmlElement(name = "PrvsNtfctnId")
	protected DocumentIdentification31 previousNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31
	 * DocumentIdentification31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmPreviousNotificationIdentification
	 * CorporateActionNotificationV08.mmPreviousNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPreviousNotificationIdentification
	 * CorporateActionNotificationV06.mmPreviousNotificationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<DocumentIdentification31>> mmPreviousNotificationIdentification = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<DocumentIdentification31>>() {
		{
			xmlTag = "PrvsNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmPreviousNotificationIdentification);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmPreviousNotificationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		@Override
		public Optional<DocumentIdentification31> getValue(CorporateActionNotificationV07 obj) {
			return obj.getPreviousNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<DocumentIdentification31> value) {
			obj.setPreviousNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrId")
	protected DocumentIdentification9 instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmInstructionIdentification
	 * CorporateActionNotificationV08.mmInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmInstructionIdentification
	 * CorporateActionNotificationV06.mmInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<DocumentIdentification9>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<DocumentIdentification9>>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmInstructionIdentification);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public Optional<DocumentIdentification9> getValue(CorporateActionNotificationV07 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<DocumentIdentification9> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification32> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32
	 * DocumentIdentification32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmOtherDocumentIdentification
	 * CorporateActionNotificationV08.mmOtherDocumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmOtherDocumentIdentification
	 * CorporateActionNotificationV06.mmOtherDocumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<DocumentIdentification32>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<DocumentIdentification32>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmOtherDocumentIdentification);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmOtherDocumentIdentification;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification32.mmObject();
		}

		@Override
		public List<DocumentIdentification32> getValue(CorporateActionNotificationV07 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<DocumentIdentification32> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference3> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
	 * CorporateActionEventReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtsLkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmEventsLinkage
	 * CorporateActionNotificationV08.mmEventsLinkage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmEventsLinkage
	 * CorporateActionNotificationV06.mmEventsLinkage}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<CorporateActionEventReference3>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<CorporateActionEventReference3>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmEventsLinkage);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmEventsLinkage;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference3.mmObject();
		}

		@Override
		public List<CorporateActionEventReference3> getValue(CorporateActionNotificationV07 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<CorporateActionEventReference3> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation105 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105
	 * CorporateActionGeneralInformation105}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmCorporateActionGeneralInformation
	 * CorporateActionNotificationV08.mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmCorporateActionGeneralInformation
	 * CorporateActionNotificationV06.mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, CorporateActionGeneralInformation105> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionNotificationV07, CorporateActionGeneralInformation105>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmCorporateActionGeneralInformation);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation105.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation105 getValue(CorporateActionNotificationV07 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, CorporateActionGeneralInformation105 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification32Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice
	 * AccountIdentification32Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account, owner and account balance."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmAccountDetails
	 * CorporateActionNotificationV08.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmAccountDetails
	 * CorporateActionNotificationV06.mmAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, AccountIdentification32Choice> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionNotificationV07, AccountIdentification32Choice>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmAccountDetails);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification32Choice.mmObject();
		}

		@Override
		public AccountIdentification32Choice getValue(CorporateActionNotificationV07 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, AccountIdentification32Choice value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "IntrmdtScty")
	protected FinancialInstrumentAttributes68 intermediateSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68
	 * FinancialInstrumentAttributes68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on rights credited to the account as for instance trading period, expiry date, renounceability."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmIntermediateSecurity
	 * CorporateActionNotificationV08.mmIntermediateSecurity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmIntermediateSecurity
	 * CorporateActionNotificationV06.mmIntermediateSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<FinancialInstrumentAttributes68>> mmIntermediateSecurity = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<FinancialInstrumentAttributes68>>() {
		{
			xmlTag = "IntrmdtScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecurity";
			definition = "Provides details on rights credited to the account as for instance trading period, expiry date, renounceability.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmIntermediateSecurity);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmIntermediateSecurity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes68.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes68> getValue(CorporateActionNotificationV07 obj) {
			return obj.getIntermediateSecurity();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<FinancialInstrumentAttributes68> value) {
			obj.setIntermediateSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction31 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31
	 * CorporateAction31}</li>
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
	 * definition} = "Information about the corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmCorporateActionDetails
	 * CorporateActionNotificationV08.mmCorporateActionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmCorporateActionDetails
	 * CorporateActionNotificationV06.mmCorporateActionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<CorporateAction31>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<CorporateAction31>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmCorporateActionDetails);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmCorporateActionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction31.mmObject();
		}

		@Override
		public Optional<CorporateAction31> getValue(CorporateActionNotificationV07 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<CorporateAction31> value) {
			obj.setCorporateActionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnOptnDtls")
	protected List<CorporateActionOption130> corporateActionOptionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
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
	 * definition} = "Information about the corporate action option."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmCorporateActionOptionDetails
	 * CorporateActionNotificationV08.mmCorporateActionOptionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmCorporateActionOptionDetails
	 * CorporateActionNotificationV06.mmCorporateActionOptionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<CorporateActionOption130>> mmCorporateActionOptionDetails = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<CorporateActionOption130>>() {
		{
			xmlTag = "CorpActnOptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionDetails";
			definition = "Information about the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmCorporateActionOptionDetails);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmCorporateActionOptionDetails;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption130.mmObject();
		}

		@Override
		public List<CorporateActionOption130> getValue(CorporateActionNotificationV07 obj) {
			return obj.getCorporateActionOptionDetails();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<CorporateActionOption130> value) {
			obj.setCorporateActionOptionDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative27 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmAdditionalInformation
	 * CorporateActionNotificationV08.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmAdditionalInformation
	 * CorporateActionNotificationV06.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<CorporateActionNarrative27>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<CorporateActionNarrative27>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmAdditionalInformation);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative27.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative27> getValue(CorporateActionNotificationV07 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<CorporateActionNarrative27> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification71Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmIssuerAgent
	 * CorporateActionNotificationV08.mmIssuerAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmIssuerAgent
	 * CorporateActionNotificationV06.mmIssuerAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmIssuerAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmIssuerAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<PartyIdentification71Choice> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification71Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmPayingAgent
	 * CorporateActionNotificationV08.mmPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPayingAgent
	 * CorporateActionNotificationV06.mmPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmPayingAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<PartyIdentification71Choice> value) {
			obj.setPayingAgent(value);
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification71Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPngAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmSubPayingAgent
	 * CorporateActionNotificationV08.mmSubPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmSubPayingAgent
	 * CorporateActionNotificationV06.mmSubPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmSubPayingAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmSubPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<PartyIdentification71Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "Regar")
	protected PartyIdentification71Choice registrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party/agent responsible for maintaining the register of a security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmRegistrar
	 * CorporateActionNotificationV08.mmRegistrar}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmRegistrar
	 * CorporateActionNotificationV06.mmRegistrar}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>> mmRegistrar = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmRegistrar);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmRegistrar;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getRegistrar();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<PartyIdentification71Choice> value) {
			obj.setRegistrar(value.orElse(null));
		}
	};
	@XmlElement(name = "RsellngAgt")
	protected List<PartyIdentification71Choice> resellingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsellngAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResellingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmResellingAgent
	 * CorporateActionNotificationV08.mmResellingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmResellingAgent
	 * CorporateActionNotificationV06.mmResellingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>> mmResellingAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmResellingAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmResellingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getResellingAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<PartyIdentification71Choice> value) {
			obj.setResellingAgent(value);
		}
	};
	@XmlElement(name = "PhysSctiesAgt")
	protected PartyIdentification71Choice physicalSecuritiesAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysSctiesAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmPhysicalSecuritiesAgent
	 * CorporateActionNotificationV08.mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPhysicalSecuritiesAgent
	 * CorporateActionNotificationV06.mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>> mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmPhysicalSecuritiesAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmPhysicalSecuritiesAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getPhysicalSecuritiesAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<PartyIdentification71Choice> value) {
			obj.setPhysicalSecuritiesAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrpAgt")
	protected PartyIdentification71Choice dropAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrpAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DropAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmDropAgent
	 * CorporateActionNotificationV08.mmDropAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmDropAgent
	 * CorporateActionNotificationV06.mmDropAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>> mmDropAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmDropAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmDropAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getDropAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<PartyIdentification71Choice> value) {
			obj.setDropAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnAgt")
	protected List<PartyIdentification71Choice> solicitationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmSolicitationAgent
	 * CorporateActionNotificationV08.mmSolicitationAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmSolicitationAgent
	 * CorporateActionNotificationV06.mmSolicitationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>> mmSolicitationAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<PartyIdentification71Choice>>() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmSolicitationAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmSolicitationAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public List<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getSolicitationAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<PartyIdentification71Choice> value) {
			obj.setSolicitationAgent(value);
		}
	};
	@XmlElement(name = "InfAgt")
	protected PartyIdentification71Choice informationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmInformationAgent
	 * CorporateActionNotificationV08.mmInformationAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmInformationAgent
	 * CorporateActionNotificationV06.mmInformationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>> mmInformationAgent = new MMMessageBuildingBlock<CorporateActionNotificationV07, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmInformationAgent);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmInformationAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(CorporateActionNotificationV07 obj) {
			return obj.getInformationAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, Optional<PartyIdentification71Choice> value) {
			obj.setInformationAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmSupplementaryData
	 * CorporateActionNotificationV08.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmSupplementaryData
	 * CorporateActionNotificationV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionNotificationV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmSupplementaryData);
			previousVersion_lazy = () -> CorporateActionNotificationV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionNotificationV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionNotificationV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPaymentRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintQuantityOfIntermediateSecuritiesRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintOtherEventRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintIntermediateSecurity1Rule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintIntermediateSecurity2Rule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintNotificationIdentificationRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintPaymentDateRule.for_seev_CorporateActionNotificationV07, com.tools20022.repository.constraints.ConstraintNameChangeRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintInformationEventRule.for_seev_CorporateActionNotificationV07, com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV07,
						com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotificationV07";
				definition = "Scope\r\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmObject());
				previousVersion_lazy = () -> CorporateActionNotificationV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISOPreviousversion.mmObject(), CorporateActionsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnNtfctn";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmNotificationGeneralInformation, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmPreviousNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmInstructionIdentification, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmIntermediateSecurity,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmCorporateActionDetails, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmCorporateActionOptionDetails,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmRegistrar, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmPhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmSolicitationAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "031";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionNotificationV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Pagination> getPagination() {
		return pagination == null ? Optional.empty() : Optional.of(pagination);
	}

	public CorporateActionNotificationV07 setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}

	public CorporateActionNotification5 getNotificationGeneralInformation() {
		return notificationGeneralInformation;
	}

	public CorporateActionNotificationV07 setNotificationGeneralInformation(CorporateActionNotification5 notificationGeneralInformation) {
		this.notificationGeneralInformation = Objects.requireNonNull(notificationGeneralInformation);
		return this;
	}

	public Optional<DocumentIdentification31> getPreviousNotificationIdentification() {
		return previousNotificationIdentification == null ? Optional.empty() : Optional.of(previousNotificationIdentification);
	}

	public CorporateActionNotificationV07 setPreviousNotificationIdentification(DocumentIdentification31 previousNotificationIdentification) {
		this.previousNotificationIdentification = previousNotificationIdentification;
		return this;
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionNotificationV07 setInstructionIdentification(DocumentIdentification9 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification32> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionNotificationV07 setOtherDocumentIdentification(List<DocumentIdentification32> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference3> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionNotificationV07 setEventsLinkage(List<CorporateActionEventReference3> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public CorporateActionGeneralInformation105 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionNotificationV07 setCorporateActionGeneralInformation(CorporateActionGeneralInformation105 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification32Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionNotificationV07 setAccountDetails(AccountIdentification32Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<FinancialInstrumentAttributes68> getIntermediateSecurity() {
		return intermediateSecurity == null ? Optional.empty() : Optional.of(intermediateSecurity);
	}

	public CorporateActionNotificationV07 setIntermediateSecurity(FinancialInstrumentAttributes68 intermediateSecurity) {
		this.intermediateSecurity = intermediateSecurity;
		return this;
	}

	public Optional<CorporateAction31> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionNotificationV07 setCorporateActionDetails(CorporateAction31 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public List<CorporateActionOption130> getCorporateActionOptionDetails() {
		return corporateActionOptionDetails == null ? corporateActionOptionDetails = new ArrayList<>() : corporateActionOptionDetails;
	}

	public CorporateActionNotificationV07 setCorporateActionOptionDetails(List<CorporateActionOption130> corporateActionOptionDetails) {
		this.corporateActionOptionDetails = Objects.requireNonNull(corporateActionOptionDetails);
		return this;
	}

	public Optional<CorporateActionNarrative27> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionNotificationV07 setAdditionalInformation(CorporateActionNarrative27 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification71Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionNotificationV07 setIssuerAgent(List<PartyIdentification71Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionNotificationV07 setPayingAgent(List<PartyIdentification71Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification71Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionNotificationV07 setSubPayingAgent(List<PartyIdentification71Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionNotificationV07 setRegistrar(PartyIdentification71Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification71Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionNotificationV07 setResellingAgent(List<PartyIdentification71Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionNotificationV07 setPhysicalSecuritiesAgent(PartyIdentification71Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification71Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionNotificationV07 setDropAgent(PartyIdentification71Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification71Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionNotificationV07 setSolicitationAgent(List<PartyIdentification71Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification71Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionNotificationV07 setInformationAgent(PartyIdentification71Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionNotificationV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.07")
	static public class Document {
		@XmlElement(name = "CorpActnNtfctn", required = true)
		public CorporateActionNotificationV07 messageBody;
	}
}