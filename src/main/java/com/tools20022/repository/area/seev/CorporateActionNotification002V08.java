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
import com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant;
import com.tools20022.repository.choice.AccountIdentification36Choice;
import com.tools20022.repository.choice.PartyIdentification104Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion;
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmPagination
 * CorporateActionNotification002V08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmNotificationGeneralInformation
 * CorporateActionNotification002V08.mmNotificationGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmPreviousNotificationIdentification
 * CorporateActionNotification002V08.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmInstructionIdentification
 * CorporateActionNotification002V08.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmOtherDocumentIdentification
 * CorporateActionNotification002V08.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmEventsLinkage
 * CorporateActionNotification002V08.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmCorporateActionGeneralInformation
 * CorporateActionNotification002V08.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmAccountDetails
 * CorporateActionNotification002V08.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmIntermediateSecurity
 * CorporateActionNotification002V08.mmIntermediateSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmCorporateActionDetails
 * CorporateActionNotification002V08.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmCorporateActionOptionDetails
 * CorporateActionNotification002V08.mmCorporateActionOptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmAdditionalInformation
 * CorporateActionNotification002V08.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmIssuerAgent
 * CorporateActionNotification002V08.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmPayingAgent
 * CorporateActionNotification002V08.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmSubPayingAgent
 * CorporateActionNotification002V08.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmRegistrar
 * CorporateActionNotification002V08.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmResellingAgent
 * CorporateActionNotification002V08.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmPhysicalSecuritiesAgent
 * CorporateActionNotification002V08.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmDropAgent
 * CorporateActionNotification002V08.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmSolicitationAgent
 * CorporateActionNotification002V08.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmInformationAgent
 * CorporateActionNotification002V08.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmSupplementaryData
 * CorporateActionNotification002V08.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion
 * CorporateActionsISO15022VariantsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant
 * SecuritiesEventsLatestversionsubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.031.002.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestPaymentRule#for_seev_CorporateActionNotification002V08
 * ConstraintInterestPaymentRule.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#for_seev_CorporateActionNotification002V08
 * ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionNotification002V08}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule#for_seev_CorporateActionNotification002V08
 * ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionNotification002V08}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQuantityOfIntermediateSecuritiesRule#for_seev_CorporateActionNotification002V08
 * ConstraintQuantityOfIntermediateSecuritiesRule.
 * for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherEventRule#for_seev_CorporateActionNotification002V08
 * ConstraintOtherEventRule.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecurity1Rule#for_seev_CorporateActionNotification002V08
 * ConstraintIntermediateSecurity1Rule.
 * for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecurity2Rule#for_seev_CorporateActionNotification002V08
 * ConstraintIntermediateSecurity2Rule.
 * for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationIdentificationRule#for_seev_CorporateActionNotification002V08
 * ConstraintNotificationIdentificationRule.
 * for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule#for_seev_CorporateActionNotification002V08
 * ConstraintIntermediateSecuritiesDistribution1Rule.
 * for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentDateRule#for_seev_CorporateActionNotification002V08
 * ConstraintPaymentDateRule.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNameChangeRule#for_seev_CorporateActionNotification002V08
 * ConstraintNameChangeRule.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionNotification002V08
 * ConstraintRateAndCorporateActionEventRule.
 * for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#for_seev_CorporateActionNotification002V08
 * ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotification002V08
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#for_seev_CorporateActionNotification002V08
 * ConstraintIssuerAgentGuideline.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNewMaturityDateRule#for_seev_CorporateActionNotification002V08
 * ConstraintNewMaturityDateRule.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInformationEventRule#for_seev_CorporateActionNotification002V08
 * ConstraintInformationEventRule.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclaredRateRule#for_seev_CorporateActionNotification002V08
 * ConstraintDeclaredRateRule.for_seev_CorporateActionNotification002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionNotification002V08
 * ConstraintAppliedOptionRule.for_seev_CorporateActionNotification002V08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotification002V08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotification002V08", propOrder = {"pagination", "notificationGeneralInformation", "previousNotificationIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage",
		"corporateActionGeneralInformation", "accountDetails", "intermediateSecurity", "corporateActionDetails", "corporateActionOptionDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "registrar",
		"resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent", "supplementaryData"})
public class CorporateActionNotification002V08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn")
	protected Pagination1 pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination1
	 * Pagination1}</li>
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
	 * "Page number of the message and continuation indicator to indicate that the multi-part notification is to continue or that the message is the last page of the multi-part notification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<Pagination1>> mmPagination = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<Pagination1>>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-part notification is to continue or that the message is the last page of the multi-part notification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination1.mmObject();
		}

		@Override
		public Optional<Pagination1> getValue(CorporateActionNotification002V08 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<Pagination1> value) {
			obj.setPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnGnlInf", required = true)
	protected CorporateActionNotification6 notificationGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6
	 * CorporateActionNotification6}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, CorporateActionNotification6> mmNotificationGeneralInformation = new MMMessageBuildingBlock<CorporateActionNotification002V08, CorporateActionNotification6>() {
		{
			xmlTag = "NtfctnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationGeneralInformation";
			definition = "General information about the event notification type, status and contents.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionNotification6.mmObject();
		}

		@Override
		public CorporateActionNotification6 getValue(CorporateActionNotification002V08 obj) {
			return obj.getNotificationGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, CorporateActionNotification6 value) {
			obj.setNotificationGeneralInformation(value);
		}
	};
	@XmlElement(name = "PrvsNtfctnId")
	protected DocumentIdentification37 previousNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification37
	 * DocumentIdentification37}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<DocumentIdentification37>> mmPreviousNotificationIdentification = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<DocumentIdentification37>>() {
		{
			xmlTag = "PrvsNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousNotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		@Override
		public Optional<DocumentIdentification37> getValue(CorporateActionNotification002V08 obj) {
			return obj.getPreviousNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<DocumentIdentification37> value) {
			obj.setPreviousNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrId")
	protected DocumentIdentification17 instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification17
	 * DocumentIdentification17}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<DocumentIdentification17>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<DocumentIdentification17>>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification17.mmObject();
		}

		@Override
		public Optional<DocumentIdentification17> getValue(CorporateActionNotification002V08 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<DocumentIdentification17> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification38> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38
	 * DocumentIdentification38}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<DocumentIdentification38>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<DocumentIdentification38>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification38.mmObject();
		}

		@Override
		public List<DocumentIdentification38> getValue(CorporateActionNotification002V08 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<DocumentIdentification38> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference4> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4
	 * CorporateActionEventReference4}</li>
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
	 * "Identification of another corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<CorporateActionEventReference4>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<CorporateActionEventReference4>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of another corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference4.mmObject();
		}

		@Override
		public List<CorporateActionEventReference4> getValue(CorporateActionNotification002V08 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<CorporateActionEventReference4> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation134 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134
	 * CorporateActionGeneralInformation134}</li>
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
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, CorporateActionGeneralInformation134> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionNotification002V08, CorporateActionGeneralInformation134>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation134.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation134 getValue(CorporateActionNotification002V08 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, CorporateActionGeneralInformation134 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification36Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification36Choice
	 * AccountIdentification36Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, AccountIdentification36Choice> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionNotification002V08, AccountIdentification36Choice>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification36Choice.mmObject();
		}

		@Override
		public AccountIdentification36Choice getValue(CorporateActionNotification002V08 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, AccountIdentification36Choice value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "IntrmdtScty")
	protected FinancialInstrumentAttributes94 intermediateSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes94
	 * FinancialInstrumentAttributes94}</li>
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
	 * "Details on rights credited to the account as for instance trading period, expiry date, renounceability."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<FinancialInstrumentAttributes94>> mmIntermediateSecurity = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<FinancialInstrumentAttributes94>>() {
		{
			xmlTag = "IntrmdtScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecurity";
			definition = "Details on rights credited to the account as for instance trading period, expiry date, renounceability.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes94.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes94> getValue(CorporateActionNotification002V08 obj) {
			return obj.getIntermediateSecurity();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<FinancialInstrumentAttributes94> value) {
			obj.setIntermediateSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction51 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<CorporateAction51>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<CorporateAction51>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction51.mmObject();
		}

		@Override
		public Optional<CorporateAction51> getValue(CorporateActionNotification002V08 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<CorporateAction51> value) {
			obj.setCorporateActionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnOptnDtls")
	protected List<CorporateActionOption150> corporateActionOptionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150
	 * CorporateActionOption150}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<CorporateActionOption150>> mmCorporateActionOptionDetails = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<CorporateActionOption150>>() {
		{
			xmlTag = "CorpActnOptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionDetails";
			definition = "Information about the corporate action option.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption150.mmObject();
		}

		@Override
		public List<CorporateActionOption150> getValue(CorporateActionNotification002V08 obj) {
			return obj.getCorporateActionOptionDetails();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<CorporateActionOption150> value) {
			obj.setCorporateActionOptionDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative41 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
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
	 * definition} = "Additional information on the event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<CorporateActionNarrative41>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<CorporateActionNarrative41>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information on the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative41.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative41> getValue(CorporateActionNotification002V08 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<CorporateActionNarrative41> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification104Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<PartyIdentification104Choice> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification104Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<PartyIdentification104Choice> value) {
			obj.setPayingAgent(value);
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification104Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<PartyIdentification104Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "Regar")
	protected PartyIdentification104Choice registrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * "Party/agent responsible for maintaining the register of the security."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>> mmRegistrar = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getRegistrar();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<PartyIdentification104Choice> value) {
			obj.setRegistrar(value.orElse(null));
		}
	};
	@XmlElement(name = "RsellngAgt")
	protected List<PartyIdentification104Choice> resellingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * "Broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>> mmResellingAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "Broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getResellingAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<PartyIdentification104Choice> value) {
			obj.setResellingAgent(value);
		}
	};
	@XmlElement(name = "PhysSctiesAgt")
	protected PartyIdentification104Choice physicalSecuritiesAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>> mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getPhysicalSecuritiesAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<PartyIdentification104Choice> value) {
			obj.setPhysicalSecuritiesAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrpAgt")
	protected PartyIdentification104Choice dropAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * "A trust company, bank or similar financial institution that acts on behalf of an out-of-town agent or event agent where securities can be delivered in person."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>> mmDropAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution that acts on behalf of an out-of-town agent or event agent where securities can be delivered in person.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getDropAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<PartyIdentification104Choice> value) {
			obj.setDropAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnAgt")
	protected List<PartyIdentification104Choice> solicitationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>> mmSolicitationAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getSolicitationAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<PartyIdentification104Choice> value) {
			obj.setSolicitationAgent(value);
		}
	};
	@XmlElement(name = "InfAgt")
	protected PartyIdentification104Choice informationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
	 * PartyIdentification104Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>> mmInformationAgent = new MMMessageBuildingBlock<CorporateActionNotification002V08, Optional<PartyIdentification104Choice>>() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification104Choice> getValue(CorporateActionNotification002V08 obj) {
			return obj.getInformationAgent();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, Optional<PartyIdentification104Choice> value) {
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNotification002V08, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionNotification002V08, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionNotification002V08 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionNotification002V08 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestPaymentRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintQuantityOfIntermediateSecuritiesRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintOtherEventRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintIntermediateSecurity1Rule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintIntermediateSecurity2Rule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintNotificationIdentificationRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistribution1Rule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintPaymentDateRule.for_seev_CorporateActionNotification002V08, com.tools20022.repository.constraints.ConstraintNameChangeRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintNewMaturityDateRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintInformationEventRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintDeclaredRateRule.for_seev_CorporateActionNotification002V08,
						com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionNotification002V08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification002V08";
				definition = "Scope\r\nAn account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.\r\r\nIt may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.\r\r\nIt may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISO15022VariantsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnNtfctn";
				businessArea_lazy = () -> SecuritiesEventsLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmNotificationGeneralInformation, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmPreviousNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmInstructionIdentification, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmIntermediateSecurity,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmCorporateActionDetails, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmCorporateActionOptionDetails,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmRegistrar, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmPhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmSolicitationAgent, com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionNotification002V08.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "031";
						version = "08";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionNotification002V08.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Pagination1> getPagination() {
		return pagination == null ? Optional.empty() : Optional.of(pagination);
	}

	public CorporateActionNotification002V08 setPagination(Pagination1 pagination) {
		this.pagination = pagination;
		return this;
	}

	public CorporateActionNotification6 getNotificationGeneralInformation() {
		return notificationGeneralInformation;
	}

	public CorporateActionNotification002V08 setNotificationGeneralInformation(CorporateActionNotification6 notificationGeneralInformation) {
		this.notificationGeneralInformation = Objects.requireNonNull(notificationGeneralInformation);
		return this;
	}

	public Optional<DocumentIdentification37> getPreviousNotificationIdentification() {
		return previousNotificationIdentification == null ? Optional.empty() : Optional.of(previousNotificationIdentification);
	}

	public CorporateActionNotification002V08 setPreviousNotificationIdentification(DocumentIdentification37 previousNotificationIdentification) {
		this.previousNotificationIdentification = previousNotificationIdentification;
		return this;
	}

	public Optional<DocumentIdentification17> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionNotification002V08 setInstructionIdentification(DocumentIdentification17 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification38> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionNotification002V08 setOtherDocumentIdentification(List<DocumentIdentification38> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference4> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionNotification002V08 setEventsLinkage(List<CorporateActionEventReference4> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public CorporateActionGeneralInformation134 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionNotification002V08 setCorporateActionGeneralInformation(CorporateActionGeneralInformation134 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification36Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionNotification002V08 setAccountDetails(AccountIdentification36Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<FinancialInstrumentAttributes94> getIntermediateSecurity() {
		return intermediateSecurity == null ? Optional.empty() : Optional.of(intermediateSecurity);
	}

	public CorporateActionNotification002V08 setIntermediateSecurity(FinancialInstrumentAttributes94 intermediateSecurity) {
		this.intermediateSecurity = intermediateSecurity;
		return this;
	}

	public Optional<CorporateAction51> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionNotification002V08 setCorporateActionDetails(CorporateAction51 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public List<CorporateActionOption150> getCorporateActionOptionDetails() {
		return corporateActionOptionDetails == null ? corporateActionOptionDetails = new ArrayList<>() : corporateActionOptionDetails;
	}

	public CorporateActionNotification002V08 setCorporateActionOptionDetails(List<CorporateActionOption150> corporateActionOptionDetails) {
		this.corporateActionOptionDetails = Objects.requireNonNull(corporateActionOptionDetails);
		return this;
	}

	public Optional<CorporateActionNarrative41> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionNotification002V08 setAdditionalInformation(CorporateActionNarrative41 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification104Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionNotification002V08 setIssuerAgent(List<PartyIdentification104Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionNotification002V08 setPayingAgent(List<PartyIdentification104Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionNotification002V08 setSubPayingAgent(List<PartyIdentification104Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification104Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionNotification002V08 setRegistrar(PartyIdentification104Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification104Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionNotification002V08 setResellingAgent(List<PartyIdentification104Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification104Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionNotification002V08 setPhysicalSecuritiesAgent(PartyIdentification104Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification104Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionNotification002V08 setDropAgent(PartyIdentification104Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification104Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionNotification002V08 setSolicitationAgent(List<PartyIdentification104Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification104Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionNotification002V08 setInformationAgent(PartyIdentification104Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionNotification002V08 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.002.08")
	static public class Document {
		@XmlElement(name = "CorpActnNtfctn", required = true)
		public CorporateActionNotification002V08 messageBody;
	}
}