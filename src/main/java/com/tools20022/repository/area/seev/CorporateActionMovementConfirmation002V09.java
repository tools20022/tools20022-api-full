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
import com.tools20022.repository.choice.PartyIdentification104Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISO15022VariantsISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionMovementConfirmation message to
 * an account owner or its designated agent to confirm posting of securities or
 * cash as a result of a corporate action event.<br>
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.036.002.09}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestversionsubsetvariant
 * SecuritiesEventsLatestversionsubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmPagination
 * CorporateActionMovementConfirmation002V09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmNotificationIdentification
 * CorporateActionMovementConfirmation002V09.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmation002V09.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmInstructionIdentification
 * CorporateActionMovementConfirmation002V09.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmation002V09.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmEventsLinkage
 * CorporateActionMovementConfirmation002V09.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmCorporateActionGeneralInformation
 * CorporateActionMovementConfirmation002V09.mmCorporateActionGeneralInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmAccountDetails
 * CorporateActionMovementConfirmation002V09.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmCorporateActionDetails
 * CorporateActionMovementConfirmation002V09.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmCorporateActionConfirmationDetails
 * CorporateActionMovementConfirmation002V09.
 * mmCorporateActionConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmAdditionalInformation
 * CorporateActionMovementConfirmation002V09.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmIssuerAgent
 * CorporateActionMovementConfirmation002V09.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmPayingAgent
 * CorporateActionMovementConfirmation002V09.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmSubPayingAgent
 * CorporateActionMovementConfirmation002V09.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmSupplementaryData
 * CorporateActionMovementConfirmation002V09.mmSupplementaryData}</li>
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
 * xmlTag} = "CorpActnMvmntConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementConfirmation002V09"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementConfirmation message to an account owner or its designated agent to confirm posting of securities or cash as a result of a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberRule#for_seev_CorporateActionMovementConfirmation002V09
 * ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmation002V09
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherDocumentIdentificationRule#for_seev_CorporateActionMovementConfirmation002V09
 * ConstraintOtherDocumentIdentificationRule.
 * for_seev_CorporateActionMovementConfirmation002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment1Rule#for_seev_CorporateActionMovementConfirmation002V09
 * ConstraintScripOrDividendReinvestment1Rule.
 * for_seev_CorporateActionMovementConfirmation002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment2Rule#for_seev_CorporateActionMovementConfirmation002V09
 * ConstraintScripOrDividendReinvestment2Rule.
 * for_seev_CorporateActionMovementConfirmation002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule#for_seev_CorporateActionMovementConfirmation002V09
 * ConstraintScripOrDividendReinvestment3Rule.
 * for_seev_CorporateActionMovementConfirmation002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionMovementConfirmation002V09
 * ConstraintAdditionalInformationRule.
 * for_seev_CorporateActionMovementConfirmation002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#for_seev_CorporateActionMovementConfirmation002V09
 * ConstraintIssuerAgentGuideline.
 * for_seev_CorporateActionMovementConfirmation002V09}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementConfirmation002V09", propOrder = {"pagination", "notificationIdentification", "movementPreliminaryAdviceIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage",
		"corporateActionGeneralInformation", "accountDetails", "corporateActionDetails", "corporateActionConfirmationDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "supplementaryData"})
public class CorporateActionMovementConfirmation002V09 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and continuation indicator to indicate that the multi-part notification is to continue or that the message is the last page of the multi-part notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<Pagination1>> mmPagination = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<Pagination1>>() {
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
		public Optional<Pagination1> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, Optional<Pagination1> value) {
			obj.setPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnId")
	protected DocumentIdentification37 notificationIdentification;
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
	 * xmlTag} = "NtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<DocumentIdentification37>> mmNotificationIdentification = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<DocumentIdentification37>>() {
		{
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		@Override
		public Optional<DocumentIdentification37> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, Optional<DocumentIdentification37> value) {
			obj.setNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MvmntPrlimryAdvcId")
	protected DocumentIdentification37 movementPreliminaryAdviceIdentification;
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
	 * xmlTag} = "MvmntPrlimryAdvcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementPreliminaryAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement preliminary advice document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<DocumentIdentification37>> mmMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<DocumentIdentification37>>() {
		{
			xmlTag = "MvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification37.mmObject();
		}

		@Override
		public Optional<DocumentIdentification37> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getMovementPreliminaryAdviceIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, Optional<DocumentIdentification37> value) {
			obj.setMovementPreliminaryAdviceIdentification(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<DocumentIdentification17>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<DocumentIdentification17>>() {
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
		public Optional<DocumentIdentification17> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, Optional<DocumentIdentification17> value) {
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<DocumentIdentification38>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<DocumentIdentification38>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification38.mmObject();
		}

		@Override
		public List<DocumentIdentification38> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, List<DocumentIdentification38> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of another corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<CorporateActionEventReference4>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<CorporateActionEventReference4>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of another corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference4.mmObject();
		}

		@Override
		public List<CorporateActionEventReference4> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, List<CorporateActionEventReference4> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation130 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation130
	 * CorporateActionGeneralInformation130}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, CorporateActionGeneralInformation130> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, CorporateActionGeneralInformation130>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation130.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation130 getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, CorporateActionGeneralInformation130 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountAndBalance38 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38
	 * AccountAndBalance38}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, AccountAndBalance38> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, AccountAndBalance38>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountAndBalance38.mmObject();
		}

		@Override
		public AccountAndBalance38 getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, AccountAndBalance38 value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction47 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction47
	 * CorporateAction47}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<CorporateAction47>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<CorporateAction47>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction47.mmObject();
		}

		@Override
		public Optional<CorporateAction47> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, Optional<CorporateAction47> value) {
			obj.setCorporateActionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnConfDtls", required = true)
	protected CorporateActionOption147 corporateActionConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147
	 * CorporateActionOption147}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnConfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, CorporateActionOption147> mmCorporateActionConfirmationDetails = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, CorporateActionOption147>() {
		{
			xmlTag = "CorpActnConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionConfirmationDetails";
			definition = "Information about the corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption147.mmObject();
		}

		@Override
		public CorporateActionOption147 getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getCorporateActionConfirmationDetails();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, CorporateActionOption147 value) {
			obj.setCorporateActionConfirmationDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative35 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative35
	 * CorporateActionNarrative35}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<CorporateActionNarrative35>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, Optional<CorporateActionNarrative35>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative35.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative35> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, Optional<CorporateActionNarrative35> value) {
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<PartyIdentification104Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, List<PartyIdentification104Choice> value) {
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<PartyIdentification104Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, List<PartyIdentification104Choice> value) {
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<PartyIdentification104Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<PartyIdentification104Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification104Choice.mmObject();
		}

		@Override
		public List<PartyIdentification104Choice> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, List<PartyIdentification104Choice> value) {
			obj.setSubPayingAgent(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionMovementConfirmation002V09, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionMovementConfirmation002V09 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionMovementConfirmation002V09 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionNumberRule.for_seev_CorporateActionMovementConfirmation002V09,
						com.tools20022.repository.constraints.ConstraintOtherDocumentIdentificationRule.for_seev_CorporateActionMovementConfirmation002V09,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment1Rule.for_seev_CorporateActionMovementConfirmation002V09,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment2Rule.for_seev_CorporateActionMovementConfirmation002V09,
						com.tools20022.repository.constraints.ConstraintScripOrDividendReinvestment3Rule.for_seev_CorporateActionMovementConfirmation002V09,
						com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionMovementConfirmation002V09,
						com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.for_seev_CorporateActionMovementConfirmation002V09);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementConfirmation002V09";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementConfirmation message to an account owner or its designated agent to confirm posting of securities or cash as a result of a corporate action event.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISO15022VariantsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntConf";
				businessArea_lazy = () -> SecuritiesEventsLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmInstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmCorporateActionConfirmationDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "036";
						version = "09";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementConfirmation002V09.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Pagination1> getPagination() {
		return pagination == null ? Optional.empty() : Optional.of(pagination);
	}

	public CorporateActionMovementConfirmation002V09 setPagination(Pagination1 pagination) {
		this.pagination = pagination;
		return this;
	}

	public Optional<DocumentIdentification37> getNotificationIdentification() {
		return notificationIdentification == null ? Optional.empty() : Optional.of(notificationIdentification);
	}

	public CorporateActionMovementConfirmation002V09 setNotificationIdentification(DocumentIdentification37 notificationIdentification) {
		this.notificationIdentification = notificationIdentification;
		return this;
	}

	public Optional<DocumentIdentification37> getMovementPreliminaryAdviceIdentification() {
		return movementPreliminaryAdviceIdentification == null ? Optional.empty() : Optional.of(movementPreliminaryAdviceIdentification);
	}

	public CorporateActionMovementConfirmation002V09 setMovementPreliminaryAdviceIdentification(DocumentIdentification37 movementPreliminaryAdviceIdentification) {
		this.movementPreliminaryAdviceIdentification = movementPreliminaryAdviceIdentification;
		return this;
	}

	public Optional<DocumentIdentification17> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionMovementConfirmation002V09 setInstructionIdentification(DocumentIdentification17 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification38> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionMovementConfirmation002V09 setOtherDocumentIdentification(List<DocumentIdentification38> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference4> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionMovementConfirmation002V09 setEventsLinkage(List<CorporateActionEventReference4> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public CorporateActionGeneralInformation130 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementConfirmation002V09 setCorporateActionGeneralInformation(CorporateActionGeneralInformation130 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountAndBalance38 getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementConfirmation002V09 setAccountDetails(AccountAndBalance38 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction47> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementConfirmation002V09 setCorporateActionDetails(CorporateAction47 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public CorporateActionOption147 getCorporateActionConfirmationDetails() {
		return corporateActionConfirmationDetails;
	}

	public CorporateActionMovementConfirmation002V09 setCorporateActionConfirmationDetails(CorporateActionOption147 corporateActionConfirmationDetails) {
		this.corporateActionConfirmationDetails = Objects.requireNonNull(corporateActionConfirmationDetails);
		return this;
	}

	public Optional<CorporateActionNarrative35> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionMovementConfirmation002V09 setAdditionalInformation(CorporateActionNarrative35 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification104Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementConfirmation002V09 setIssuerAgent(List<PartyIdentification104Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementConfirmation002V09 setPayingAgent(List<PartyIdentification104Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification104Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementConfirmation002V09 setSubPayingAgent(List<PartyIdentification104Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementConfirmation002V09 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.002.09")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntConf", required = true)
		public CorporateActionMovementConfirmation002V09 messageBody;
	}
}