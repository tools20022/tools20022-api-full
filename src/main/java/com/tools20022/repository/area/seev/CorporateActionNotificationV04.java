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
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.AccountIdentification21Choice;
import com.tools20022.repository.choice.PartyIdentification47Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends the CorporateActionNotification message to an
 * account owner or its designated agent to notify details of a corporate action
 * event and optionally account information, eligible balance and entitlements.<br>
 * It may also include possible elections or choices available to the account
 * owner. The account servicer can initially send the
 * CorporateActionNotification message as a preliminary advice, subsequently
 * replaced by another CorporateActionNotification message with complete or
 * confirmed information.<br>
 * It may also be sent to an account owner or its designated agent, to remind of
 * event details and/or of missing or incomplete instructions for a corporate
 * action event. Usage The message may also be used to: - re-send a message
 * previously sent (the sub-function of the message is Duplicate), - provide a
 * third party with a copy of a message for information (the sub-function of the
 * message is Copy), - re-send to a third party a copy of a message for
 * information (the sub-function of the message is Copy Duplicate), using the
 * relevant elements in the business application header (BAH). ISO 15022 - 20022
 * COEXISTENCE<br>
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.031.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPagination
 * CorporateActionNotificationV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmNotificationGeneralInformation
 * CorporateActionNotificationV04.mmNotificationGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPreviousNotificationIdentification
 * CorporateActionNotificationV04.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmInstructionIdentification
 * CorporateActionNotificationV04.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmOtherDocumentIdentification
 * CorporateActionNotificationV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmEventsLinkage
 * CorporateActionNotificationV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmCorporateActionGeneralInformation
 * CorporateActionNotificationV04.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmAccountDetails
 * CorporateActionNotificationV04.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmIntermediateSecurity
 * CorporateActionNotificationV04.mmIntermediateSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmCorporateActionDetails
 * CorporateActionNotificationV04.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmCorporateActionOptionDetails
 * CorporateActionNotificationV04.mmCorporateActionOptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmAdditionalInformation
 * CorporateActionNotificationV04.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmIssuerAgent
 * CorporateActionNotificationV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPayingAgent
 * CorporateActionNotificationV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmSubPayingAgent
 * CorporateActionNotificationV04.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmRegistrar
 * CorporateActionNotificationV04.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmResellingAgent
 * CorporateActionNotificationV04.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV04.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmDropAgent
 * CorporateActionNotificationV04.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmSolicitationAgent
 * CorporateActionNotificationV04.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmInformationAgent
 * CorporateActionNotificationV04.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmSupplementaryData
 * CorporateActionNotificationV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotificationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\nUsage\nThe message may also be used to:\n- re-send a message previously sent (the sub-function of the message is Duplicate),\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#for_seev_CorporateActionNotificationV04
 * ConstraintInterestPaymentRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#for_seev_CorporateActionNotificationV04
 * ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule#for_seev_CorporateActionNotificationV04
 * ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityOfIntermediateSecuritiesRule#for_seev_CorporateActionNotificationV04
 * ConstraintQuantityOfIntermediateSecuritiesRule.
 * for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherEventRule#for_seev_CorporateActionNotificationV04
 * ConstraintOtherEventRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecurity1Rule#for_seev_CorporateActionNotificationV04
 * ConstraintIntermediateSecurity1Rule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecurity2Rule#for_seev_CorporateActionNotificationV04
 * ConstraintIntermediateSecurity2Rule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationIdentificationRule#for_seev_CorporateActionNotificationV04
 * ConstraintNotificationIdentificationRule.
 * for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#for_seev_CorporateActionNotificationV04
 * ConstraintIntermediateSecuritiesDistribution1Rule.
 * for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentDateRule#for_seev_CorporateActionNotificationV04
 * ConstraintPaymentDateRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNameChangeRule#for_seev_CorporateActionNotificationV04
 * ConstraintNameChangeRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotificationV04
 * ConstraintRateAndCorporateActionEventRule.
 * for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotificationV04
 * ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityGuideline#for_seev_CorporateActionNotificationV04
 * ConstraintMinimumExercisableQuantityGuideline.
 * for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#for_seev_CorporateActionNotificationV04
 * ConstraintIssuerAgentGuideline.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionNotificationV04
 * ConstraintCoexistenceCharacterSetXRule.
 * for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_seev_CorporateActionNotificationV04
 * ConstraintCoexistenceIdentificationRule.
 * for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMaturityDateRule#for_seev_CorporateActionNotificationV04
 * ConstraintMaturityDateRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMiniOddLotOfferUsageRule#for_seev_CorporateActionNotificationV04
 * ConstraintMiniOddLotOfferUsageRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInformationEventRule#for_seev_CorporateActionNotificationV04
 * ConstraintInformationEventRule.for_seev_CorporateActionNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotificationV04
 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
 * CorporateActionNotificationV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
 * CorporateActionNotificationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotificationV04", propOrder = {"pagination", "notificationGeneralInformation", "previousNotificationIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage",
		"corporateActionGeneralInformation", "accountDetails", "intermediateSecurity", "corporateActionDetails", "corporateActionOptionDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "registrar",
		"resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionNotificationV04 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPagination
	 * CorporateActionNotificationV05.mmPagination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<Pagination>> mmPagination = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<Pagination>>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmPagination);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(CorporateActionNotificationV04 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<Pagination> value) {
			obj.setPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnGnlInf", required = true)
	protected CorporateActionNotification3 notificationGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3
	 * CorporateActionNotification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the event notification type, status and contents."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmNotificationGeneralInformation
	 * CorporateActionNotificationV05.mmNotificationGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, CorporateActionNotification3> mmNotificationGeneralInformation = new MMMessageBuildingBlock<CorporateActionNotificationV04, CorporateActionNotification3>() {
		{
			xmlTag = "NtfctnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationGeneralInformation";
			definition = "General information about the event notification type, status and contents.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmNotificationGeneralInformation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionNotification3.mmObject();
		}

		@Override
		public CorporateActionNotification3 getValue(CorporateActionNotificationV04 obj) {
			return obj.getNotificationGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, CorporateActionNotification3 value) {
			obj.setNotificationGeneralInformation(value);
		}
	};
	@XmlElement(name = "PrvsNtfctnId")
	protected DocumentIdentification15 previousNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsNtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPreviousNotificationIdentification
	 * CorporateActionNotificationV05.mmPreviousNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<DocumentIdentification15>> mmPreviousNotificationIdentification = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<DocumentIdentification15>>() {
		{
			xmlTag = "PrvsNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmPreviousNotificationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		@Override
		public Optional<DocumentIdentification15> getValue(CorporateActionNotificationV04 obj) {
			return obj.getPreviousNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<DocumentIdentification15> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmInstructionIdentification
	 * CorporateActionNotificationV05.mmInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<DocumentIdentification9>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<DocumentIdentification9>>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmInstructionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public Optional<DocumentIdentification9> getValue(CorporateActionNotificationV04 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<DocumentIdentification9> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification13> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmOtherDocumentIdentification
	 * CorporateActionNotificationV05.mmOtherDocumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<DocumentIdentification13>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<DocumentIdentification13>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmOtherDocumentIdentification);
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification13.mmObject();
		}

		@Override
		public List<DocumentIdentification13> getValue(CorporateActionNotificationV04 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<DocumentIdentification13> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference1> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtsLkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmEventsLinkage
	 * CorporateActionNotificationV05.mmEventsLinkage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<CorporateActionEventReference1>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<CorporateActionEventReference1>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmEventsLinkage);
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference1.mmObject();
		}

		@Override
		public List<CorporateActionEventReference1> getValue(CorporateActionNotificationV04 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<CorporateActionEventReference1> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation51 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51
	 * CorporateActionGeneralInformation51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmCorporateActionGeneralInformation
	 * CorporateActionNotificationV05.mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, CorporateActionGeneralInformation51> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionNotificationV04, CorporateActionGeneralInformation51>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmCorporateActionGeneralInformation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation51.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation51 getValue(CorporateActionNotificationV04 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, CorporateActionGeneralInformation51 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification21Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification21Choice
	 * AccountIdentification21Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account, owner and account balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmAccountDetails
	 * CorporateActionNotificationV05.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, AccountIdentification21Choice> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionNotificationV04, AccountIdentification21Choice>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification21Choice.mmObject();
		}

		@Override
		public AccountIdentification21Choice getValue(CorporateActionNotificationV04 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, AccountIdentification21Choice value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "IntrmdtScty")
	protected FinancialInstrumentAttributes46 intermediateSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46
	 * FinancialInstrumentAttributes46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on rights credited to the account as for instance trading period, expiry date, renounceability."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmIntermediateSecurity
	 * CorporateActionNotificationV05.mmIntermediateSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<FinancialInstrumentAttributes46>> mmIntermediateSecurity = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<FinancialInstrumentAttributes46>>() {
		{
			xmlTag = "IntrmdtScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecurity";
			definition = "Provides details on rights credited to the account as for instance trading period, expiry date, renounceability.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmIntermediateSecurity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes46.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes46> getValue(CorporateActionNotificationV04 obj) {
			return obj.getIntermediateSecurity();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<FinancialInstrumentAttributes46> value) {
			obj.setIntermediateSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction10 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmCorporateActionDetails
	 * CorporateActionNotificationV05.mmCorporateActionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<CorporateAction10>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<CorporateAction10>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmCorporateActionDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction10.mmObject();
		}

		@Override
		public Optional<CorporateAction10> getValue(CorporateActionNotificationV04 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<CorporateAction10> value) {
			obj.setCorporateActionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnOptnDtls")
	protected List<CorporateActionOption51> corporateActionOptionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51
	 * CorporateActionOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnOptnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmCorporateActionOptionDetails
	 * CorporateActionNotificationV05.mmCorporateActionOptionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<CorporateActionOption51>> mmCorporateActionOptionDetails = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<CorporateActionOption51>>() {
		{
			xmlTag = "CorpActnOptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionDetails";
			definition = "Information about the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmCorporateActionOptionDetails);
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption51.mmObject();
		}

		@Override
		public List<CorporateActionOption51> getValue(CorporateActionNotificationV04 obj) {
			return obj.getCorporateActionOptionDetails();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<CorporateActionOption51> value) {
			obj.setCorporateActionOptionDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative11 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11
	 * CorporateActionNarrative11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmAdditionalInformation
	 * CorporateActionNotificationV05.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<CorporateActionNarrative11>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<CorporateActionNarrative11>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative11.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative11> getValue(CorporateActionNotificationV04 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<CorporateActionNarrative11> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification47Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmIssuerAgent
	 * CorporateActionNotificationV05.mmIssuerAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmIssuerAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public List<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<PartyIdentification47Choice> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification47Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPayingAgent
	 * CorporateActionNotificationV05.mmPayingAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmPayingAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public List<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<PartyIdentification47Choice> value) {
			obj.setPayingAgent(value);
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification47Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmSubPayingAgent
	 * CorporateActionNotificationV05.mmSubPayingAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmSubPayingAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public List<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<PartyIdentification47Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "Regar")
	protected PartyIdentification47Choice registrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regar"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party/agent responsible for maintaining the register of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmRegistrar
	 * CorporateActionNotificationV05.mmRegistrar}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>> mmRegistrar = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>>() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmRegistrar);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getRegistrar();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<PartyIdentification47Choice> value) {
			obj.setRegistrar(value.orElse(null));
		}
	};
	@XmlElement(name = "RsellngAgt")
	protected List<PartyIdentification47Choice> resellingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsellngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResellingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmResellingAgent
	 * CorporateActionNotificationV05.mmResellingAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>> mmResellingAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>>() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmResellingAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public List<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getResellingAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<PartyIdentification47Choice> value) {
			obj.setResellingAgent(value);
		}
	};
	@XmlElement(name = "PhysSctiesAgt")
	protected PartyIdentification47Choice physicalSecuritiesAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysSctiesAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPhysicalSecuritiesAgent
	 * CorporateActionNotificationV05.mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>> mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>>() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmPhysicalSecuritiesAgent);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getPhysicalSecuritiesAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<PartyIdentification47Choice> value) {
			obj.setPhysicalSecuritiesAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrpAgt")
	protected PartyIdentification47Choice dropAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrpAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DropAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmDropAgent
	 * CorporateActionNotificationV05.mmDropAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>> mmDropAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>>() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmDropAgent);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getDropAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<PartyIdentification47Choice> value) {
			obj.setDropAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnAgt")
	protected List<PartyIdentification47Choice> solicitationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmSolicitationAgent
	 * CorporateActionNotificationV05.mmSolicitationAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>> mmSolicitationAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<PartyIdentification47Choice>>() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmSolicitationAgent);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public List<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getSolicitationAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<PartyIdentification47Choice> value) {
			obj.setSolicitationAgent(value);
		}
	};
	@XmlElement(name = "InfAgt")
	protected PartyIdentification47Choice informationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmInformationAgent
	 * CorporateActionNotificationV05.mmInformationAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>> mmInformationAgent = new MMMessageBuildingBlock<CorporateActionNotificationV04, Optional<PartyIdentification47Choice>>() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmInformationAgent);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification47Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification47Choice> getValue(CorporateActionNotificationV04 obj) {
			return obj.getInformationAgent();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, Optional<PartyIdentification47Choice> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmSupplementaryData
	 * CorporateActionNotificationV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotificationV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionNotificationV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionNotificationV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionNotificationV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPaymentRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintQuantityOfIntermediateSecuritiesRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintOtherEventRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintIntermediateSecurity1Rule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintIntermediateSecurity2Rule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintNotificationIdentificationRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintPaymentDateRule.for_seev_CorporateActionNotificationV04, com.tools20022.repository.constraints.ConstraintNameChangeRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintMinimumExercisableQuantityGuideline.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintMaturityDateRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintMiniOddLotOfferUsageRule.for_seev_CorporateActionNotificationV04,
						com.tools20022.repository.constraints.ConstraintInformationEventRule.for_seev_CorporateActionNotificationV04, com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotificationV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotificationV04";
				definition = "Scope\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\nUsage\nThe message may also be used to:\n- re-send a message previously sent (the sub-function of the message is Duplicate),\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmObject());
				previousVersion_lazy = () -> CorporateActionNotificationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnNtfctn";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmNotificationGeneralInformation, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmPreviousNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmInstructionIdentification, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmIntermediateSecurity,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmCorporateActionDetails, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmCorporateActionOptionDetails,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmRegistrar, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmPhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmSolicitationAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "031";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionNotificationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Pagination> getPagination() {
		return pagination == null ? Optional.empty() : Optional.of(pagination);
	}

	public CorporateActionNotificationV04 setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}

	public CorporateActionNotification3 getNotificationGeneralInformation() {
		return notificationGeneralInformation;
	}

	public CorporateActionNotificationV04 setNotificationGeneralInformation(CorporateActionNotification3 notificationGeneralInformation) {
		this.notificationGeneralInformation = Objects.requireNonNull(notificationGeneralInformation);
		return this;
	}

	public Optional<DocumentIdentification15> getPreviousNotificationIdentification() {
		return previousNotificationIdentification == null ? Optional.empty() : Optional.of(previousNotificationIdentification);
	}

	public CorporateActionNotificationV04 setPreviousNotificationIdentification(DocumentIdentification15 previousNotificationIdentification) {
		this.previousNotificationIdentification = previousNotificationIdentification;
		return this;
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionNotificationV04 setInstructionIdentification(DocumentIdentification9 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification13> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionNotificationV04 setOtherDocumentIdentification(List<DocumentIdentification13> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference1> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionNotificationV04 setEventsLinkage(List<CorporateActionEventReference1> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public CorporateActionGeneralInformation51 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionNotificationV04 setCorporateActionGeneralInformation(CorporateActionGeneralInformation51 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification21Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionNotificationV04 setAccountDetails(AccountIdentification21Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<FinancialInstrumentAttributes46> getIntermediateSecurity() {
		return intermediateSecurity == null ? Optional.empty() : Optional.of(intermediateSecurity);
	}

	public CorporateActionNotificationV04 setIntermediateSecurity(FinancialInstrumentAttributes46 intermediateSecurity) {
		this.intermediateSecurity = intermediateSecurity;
		return this;
	}

	public Optional<CorporateAction10> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionNotificationV04 setCorporateActionDetails(CorporateAction10 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public List<CorporateActionOption51> getCorporateActionOptionDetails() {
		return corporateActionOptionDetails == null ? corporateActionOptionDetails = new ArrayList<>() : corporateActionOptionDetails;
	}

	public CorporateActionNotificationV04 setCorporateActionOptionDetails(List<CorporateActionOption51> corporateActionOptionDetails) {
		this.corporateActionOptionDetails = Objects.requireNonNull(corporateActionOptionDetails);
		return this;
	}

	public Optional<CorporateActionNarrative11> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionNotificationV04 setAdditionalInformation(CorporateActionNarrative11 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification47Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionNotificationV04 setIssuerAgent(List<PartyIdentification47Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification47Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionNotificationV04 setPayingAgent(List<PartyIdentification47Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification47Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionNotificationV04 setSubPayingAgent(List<PartyIdentification47Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification47Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionNotificationV04 setRegistrar(PartyIdentification47Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification47Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionNotificationV04 setResellingAgent(List<PartyIdentification47Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification47Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionNotificationV04 setPhysicalSecuritiesAgent(PartyIdentification47Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification47Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionNotificationV04 setDropAgent(PartyIdentification47Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification47Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionNotificationV04 setSolicitationAgent(List<PartyIdentification47Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification47Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionNotificationV04 setInformationAgent(PartyIdentification47Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionNotificationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.04")
	static public class Document {
		@XmlElement(name = "CorpActnNtfctn", required = true)
		public CorporateActionNotificationV04 messageBody;
	}
}