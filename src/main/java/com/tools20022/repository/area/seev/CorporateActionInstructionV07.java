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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISOPreviousversion;
import com.tools20022.repository.msgset.CorporateActionsMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends the CorporateActionInstruction message to an account
 * servicer to instruct election on a corporate action event. <br>
 * This message is used to provide the custodian with instructions on how the
 * account owner wishes to proceed with a corporate action event. Instructions
 * include investment decisions regarding the exercise of rights issues, the
 * election of stock or cash when the option is available, and decisions on the
 * conversion or tendering of securities.<br>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmChangeInstructionIndicator
 * CorporateActionInstructionV07.mmChangeInstructionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmCancelledInstructionIdentification
 * CorporateActionInstructionV07.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV07.mmInstructionCancellationRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmOtherDocumentIdentification
 * CorporateActionInstructionV07.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmEventsLinkage
 * CorporateActionInstructionV07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmCorporateActionGeneralInformation
 * CorporateActionInstructionV07.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmAccountDetails
 * CorporateActionInstructionV07.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmBeneficialOwnerDetails
 * CorporateActionInstructionV07.mmBeneficialOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmCorporateActionInstruction
 * CorporateActionInstructionV07.mmCorporateActionInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmAdditionalInformation
 * CorporateActionInstructionV07.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07#mmSupplementaryData
 * CorporateActionInstructionV07.mmSupplementaryData}</li>
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
 * xmlTag} = "CorpActnInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.033.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#for_seev_CorporateActionInstructionV07
 * ConstraintInstructionCancellationRequestIdentificationRule.
 * for_seev_CorporateActionInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionEventIdentificationRule#for_seev_CorporateActionInstructionV07
 * ConstraintCorporateActionEventIdentificationRule.
 * for_seev_CorporateActionInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline#for_seev_CorporateActionInstructionV07
 * ConstraintChangeInstructionIndicatorGuideline.
 * for_seev_CorporateActionInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionV07
 * ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#for_seev_CorporateActionInstructionV07
 * ConstraintOptionTypeRule.for_seev_CorporateActionInstructionV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends the CorporateActionInstruction message to an account servicer to instruct election on a corporate action event.\r\r\nThis message is used to provide the custodian with instructions on how the account owner wishes to proceed with a corporate action event. Instructions include investment decisions regarding the exercise of rights issues, the election of stock or cash when the option is available, and decisions on the conversion or tendering of securities.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
 * CorporateActionInstructionV08}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06
 * CorporateActionInstructionV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructionV07", propOrder = {"changeInstructionIndicator", "cancelledInstructionIdentification", "instructionCancellationRequestIdentification", "otherDocumentIdentification", "eventsLinkage",
		"corporateActionGeneralInformation", "accountDetails", "beneficialOwnerDetails", "corporateActionInstruction", "additionalInformation", "supplementaryData"})
public class CorporateActionInstructionV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ChngInstrInd")
	protected YesNoIndicator changeInstructionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngInstrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used in a corporate action instruction, indicates that the current instruction is replacing a previous one that was cancelled earlier. When used in a corporate action instruction cancellation request, indicates that cancelled instruction will be replaced by a new corporate action instruction to be sent later."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmChangeInstructionIndicator
	 * CorporateActionInstructionV08.mmChangeInstructionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmChangeInstructionIndicator
	 * CorporateActionInstructionV06.mmChangeInstructionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<YesNoIndicator>> mmChangeInstructionIndicator = new MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<YesNoIndicator>>() {
		{
			xmlTag = "ChngInstrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicator";
			definition = "When used in a corporate action instruction, indicates that the current instruction is replacing a previous one that was cancelled earlier. When used in a corporate action instruction cancellation request, indicates that cancelled instruction will be replaced by a new corporate action instruction to be sent later.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmChangeInstructionIndicator);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmChangeInstructionIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionInstructionV07 obj) {
			return obj.getChangeInstructionIndicator();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, Optional<YesNoIndicator> value) {
			obj.setChangeInstructionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CancInstrId")
	protected DocumentIdentification31 cancelledInstructionIdentification;
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
	 * xmlTag} = "CancInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent cancelled instruction document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmCancelledInstructionIdentification
	 * CorporateActionInstructionV08.mmCancelledInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmCancelledInstructionIdentification
	 * CorporateActionInstructionV06.mmCancelledInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<DocumentIdentification31>> mmCancelledInstructionIdentification = new MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<DocumentIdentification31>>() {
		{
			xmlTag = "CancInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledInstructionIdentification";
			definition = "Identification of a previously sent cancelled instruction document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmCancelledInstructionIdentification);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmCancelledInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		@Override
		public Optional<DocumentIdentification31> getValue(CorporateActionInstructionV07 obj) {
			return obj.getCancelledInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, Optional<DocumentIdentification31> value) {
			obj.setCancelledInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrCxlReqId")
	protected DocumentIdentification31 instructionCancellationRequestIdentification;
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
	 * xmlTag} = "InstrCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent instruction cancellation request document."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmInstructionCancellationRequestIdentification
	 * CorporateActionInstructionV08.
	 * mmInstructionCancellationRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmInstructionCancellationRequestIdentification
	 * CorporateActionInstructionV06.
	 * mmInstructionCancellationRequestIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<DocumentIdentification31>> mmInstructionCancellationRequestIdentification = new MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<DocumentIdentification31>>() {
		{
			xmlTag = "InstrCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentification";
			definition = "Identification of a previously sent instruction cancellation request document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmInstructionCancellationRequestIdentification);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmInstructionCancellationRequestIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		@Override
		public Optional<DocumentIdentification31> getValue(CorporateActionInstructionV07 obj) {
			return obj.getInstructionCancellationRequestIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, Optional<DocumentIdentification31> value) {
			obj.setInstructionCancellationRequestIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmOtherDocumentIdentification
	 * CorporateActionInstructionV08.mmOtherDocumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmOtherDocumentIdentification
	 * CorporateActionInstructionV06.mmOtherDocumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, List<DocumentIdentification32>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionInstructionV07, List<DocumentIdentification32>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmOtherDocumentIdentification);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmOtherDocumentIdentification;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification32.mmObject();
		}

		@Override
		public List<DocumentIdentification32> getValue(CorporateActionInstructionV07 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, List<DocumentIdentification32> value) {
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmEventsLinkage
	 * CorporateActionInstructionV08.mmEventsLinkage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmEventsLinkage
	 * CorporateActionInstructionV06.mmEventsLinkage}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, List<CorporateActionEventReference3>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionInstructionV07, List<CorporateActionEventReference3>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmEventsLinkage);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmEventsLinkage;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference3.mmObject();
		}

		@Override
		public List<CorporateActionEventReference3> getValue(CorporateActionInstructionV07 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, List<CorporateActionEventReference3> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation107 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107
	 * CorporateActionGeneralInformation107}</li>
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmCorporateActionGeneralInformation
	 * CorporateActionInstructionV08.mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmCorporateActionGeneralInformation
	 * CorporateActionInstructionV06.mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, CorporateActionGeneralInformation107> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionInstructionV07, CorporateActionGeneralInformation107>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmCorporateActionGeneralInformation);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation107.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation107 getValue(CorporateActionInstructionV07 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, CorporateActionGeneralInformation107 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountAndBalance35 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35
	 * AccountAndBalance35}</li>
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmAccountDetails
	 * CorporateActionInstructionV08.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmAccountDetails
	 * CorporateActionInstructionV06.mmAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, AccountAndBalance35> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionInstructionV07, AccountAndBalance35>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmAccountDetails);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountAndBalance35.mmObject();
		}

		@Override
		public AccountAndBalance35 getValue(CorporateActionInstructionV07 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, AccountAndBalance35 value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "BnfclOwnrDtls")
	protected List<PartyIdentification93> beneficialOwnerDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93
	 * PartyIdentification93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the beneficial owner of the securities."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmBeneficialOwnerDetails
	 * CorporateActionInstructionV08.mmBeneficialOwnerDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmBeneficialOwnerDetails
	 * CorporateActionInstructionV06.mmBeneficialOwnerDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, List<PartyIdentification93>> mmBeneficialOwnerDetails = new MMMessageBuildingBlock<CorporateActionInstructionV07, List<PartyIdentification93>>() {
		{
			xmlTag = "BnfclOwnrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDetails";
			definition = "Provides information about the beneficial owner of the securities.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmBeneficialOwnerDetails);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmBeneficialOwnerDetails;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification93.mmObject();
		}

		@Override
		public List<PartyIdentification93> getValue(CorporateActionInstructionV07 obj) {
			return obj.getBeneficialOwnerDetails();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, List<PartyIdentification93> value) {
			obj.setBeneficialOwnerDetails(value);
		}
	};
	@XmlElement(name = "CorpActnInstr", required = true)
	protected CorporateActionOption131 corporateActionInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131
	 * CorporateActionOption131}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmCorporateActionInstruction
	 * CorporateActionInstructionV08.mmCorporateActionInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmCorporateActionInstruction
	 * CorporateActionInstructionV06.mmCorporateActionInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, CorporateActionOption131> mmCorporateActionInstruction = new MMMessageBuildingBlock<CorporateActionInstructionV07, CorporateActionOption131>() {
		{
			xmlTag = "CorpActnInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionInstruction";
			definition = "Information about the corporate action instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmCorporateActionInstruction);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmCorporateActionInstruction;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption131.mmObject();
		}

		@Override
		public CorporateActionOption131 getValue(CorporateActionInstructionV07 obj) {
			return obj.getCorporateActionInstruction();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, CorporateActionOption131 value) {
			obj.setCorporateActionInstruction(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative30 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30
	 * CorporateActionNarrative30}</li>
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmAdditionalInformation
	 * CorporateActionInstructionV08.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmAdditionalInformation
	 * CorporateActionInstructionV06.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<CorporateActionNarrative30>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionInstructionV07, Optional<CorporateActionNarrative30>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmAdditionalInformation);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative30.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative30> getValue(CorporateActionInstructionV07 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, Optional<CorporateActionNarrative30> value) {
			obj.setAdditionalInformation(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08#mmSupplementaryData
	 * CorporateActionInstructionV08.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06#mmSupplementaryData
	 * CorporateActionInstructionV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionInstructionV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmSupplementaryData);
			previousVersion_lazy = () -> CorporateActionInstructionV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionInstructionV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionInstructionV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays
						.asList(com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.for_seev_CorporateActionInstructionV07,
								com.tools20022.repository.constraints.ConstraintCorporateActionEventIdentificationRule.for_seev_CorporateActionInstructionV07,
								com.tools20022.repository.constraints.ConstraintChangeInstructionIndicatorGuideline.for_seev_CorporateActionInstructionV07,
								com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionV07,
								com.tools20022.repository.constraints.ConstraintOptionTypeRule.for_seev_CorporateActionInstructionV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionV07";
				definition = "Scope\r\nAn account owner sends the CorporateActionInstruction message to an account servicer to instruct election on a corporate action event.\r\r\nThis message is used to provide the custodian with instructions on how the account owner wishes to proceed with a corporate action event. Instructions include investment decisions regarding the exercise of rights issues, the election of stock or cash when the option is available, and decisions on the conversion or tendering of securities.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionV08.mmObject());
				previousVersion_lazy = () -> CorporateActionInstructionV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISOPreviousversion.mmObject(), CorporateActionsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnInstr";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmChangeInstructionIndicator,
						com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmCancelledInstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmInstructionCancellationRequestIdentification, com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmBeneficialOwnerDetails,
						com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmCorporateActionInstruction, com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "033";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionInstructionV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getChangeInstructionIndicator() {
		return changeInstructionIndicator == null ? Optional.empty() : Optional.of(changeInstructionIndicator);
	}

	public CorporateActionInstructionV07 setChangeInstructionIndicator(YesNoIndicator changeInstructionIndicator) {
		this.changeInstructionIndicator = changeInstructionIndicator;
		return this;
	}

	public Optional<DocumentIdentification31> getCancelledInstructionIdentification() {
		return cancelledInstructionIdentification == null ? Optional.empty() : Optional.of(cancelledInstructionIdentification);
	}

	public CorporateActionInstructionV07 setCancelledInstructionIdentification(DocumentIdentification31 cancelledInstructionIdentification) {
		this.cancelledInstructionIdentification = cancelledInstructionIdentification;
		return this;
	}

	public Optional<DocumentIdentification31> getInstructionCancellationRequestIdentification() {
		return instructionCancellationRequestIdentification == null ? Optional.empty() : Optional.of(instructionCancellationRequestIdentification);
	}

	public CorporateActionInstructionV07 setInstructionCancellationRequestIdentification(DocumentIdentification31 instructionCancellationRequestIdentification) {
		this.instructionCancellationRequestIdentification = instructionCancellationRequestIdentification;
		return this;
	}

	public List<DocumentIdentification32> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionInstructionV07 setOtherDocumentIdentification(List<DocumentIdentification32> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference3> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionInstructionV07 setEventsLinkage(List<CorporateActionEventReference3> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public CorporateActionGeneralInformation107 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionInstructionV07 setCorporateActionGeneralInformation(CorporateActionGeneralInformation107 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountAndBalance35 getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionInstructionV07 setAccountDetails(AccountAndBalance35 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public List<PartyIdentification93> getBeneficialOwnerDetails() {
		return beneficialOwnerDetails == null ? beneficialOwnerDetails = new ArrayList<>() : beneficialOwnerDetails;
	}

	public CorporateActionInstructionV07 setBeneficialOwnerDetails(List<PartyIdentification93> beneficialOwnerDetails) {
		this.beneficialOwnerDetails = Objects.requireNonNull(beneficialOwnerDetails);
		return this;
	}

	public CorporateActionOption131 getCorporateActionInstruction() {
		return corporateActionInstruction;
	}

	public CorporateActionInstructionV07 setCorporateActionInstruction(CorporateActionOption131 corporateActionInstruction) {
		this.corporateActionInstruction = Objects.requireNonNull(corporateActionInstruction);
		return this;
	}

	public Optional<CorporateActionNarrative30> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionInstructionV07 setAdditionalInformation(CorporateActionNarrative30 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionInstructionV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.033.001.07")
	static public class Document {
		@XmlElement(name = "CorpActnInstr", required = true)
		public CorporateActionInstructionV07 messageBody;
	}
}