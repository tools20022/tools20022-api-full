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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmAffirmationStatus
 * Status3Choice.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmAllocationStatus
 * Status3Choice.mmAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmRepoCallRequestStatus
 * Status3Choice.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmCorporateActionEventProcessingStatus
 * Status3Choice.mmCorporateActionEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmCorporateActionEventStage
 * Status3Choice.mmCorporateActionEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmInferredMatchingStatus
 * Status3Choice.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmInstructionProcessingStatus
 * Status3Choice.mmInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmMatchingStatus
 * Status3Choice.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmRegistrationProcessingStatus
 * Status3Choice.mmRegistrationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmResponseStatus
 * Status3Choice.mmResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmReplacementProcessingStatus
 * Status3Choice.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmCancellationProcessingStatus
 * Status3Choice.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmSettlementStatus
 * Status3Choice.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmSettlementConditionModificationStatus
 * Status3Choice.mmSettlementConditionModificationStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusRule#forStatus3Choice
 * ConstraintStatusRule.forStatus3Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Status3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Status3Choice", propOrder = {"affirmationStatus", "allocationStatus", "repoCallRequestStatus", "corporateActionEventProcessingStatus", "corporateActionEventStage", "inferredMatchingStatus", "instructionProcessingStatus",
		"matchingStatus", "registrationProcessingStatus", "responseStatus", "replacementProcessingStatus", "cancellationProcessingStatus", "settlementStatus", "settlementConditionModificationStatus"})
public class Status3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AffirmSts", required = true)
	protected AffirmationStatus2Choice affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus2Choice
	 * AffirmationStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::AFFM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, AffirmationStatus2Choice> mmAffirmationStatus = new MMMessageAssociationEnd<Status3Choice, AffirmationStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::AFFM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AffirmationStatus2Choice.mmObject();
		}

		@Override
		public AffirmationStatus2Choice getValue(Status3Choice obj) {
			return obj.getAffirmationStatus();
		}

		@Override
		public void setValue(Status3Choice obj, AffirmationStatus2Choice value) {
			obj.setAffirmationStatus(value);
		}
	};
	@XmlElement(name = "AllcnSts", required = true)
	protected AllocationSatus2Choice allocationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus2Choice
	 * AllocationSatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCollateralAllocationStatus
	 * SecuritiesTradeStatus.mmCollateralAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::ALOC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of allocation of collateral to cover the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, AllocationSatus2Choice> mmAllocationStatus = new MMMessageAssociationEnd<Status3Choice, AllocationSatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmCollateralAllocationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "AllcnSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::ALOC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AllocationSatus2Choice.mmObject();
		}

		@Override
		public AllocationSatus2Choice getValue(Status3Choice obj) {
			return obj.getAllocationStatus();
		}

		@Override
		public void setValue(Status3Choice obj, AllocationSatus2Choice value) {
			obj.setAllocationStatus(value);
		}
	};
	@XmlElement(name = "RepoCallReqSts", required = true)
	protected RepoCallRequestStatus3Choice repoCallRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus3Choice
	 * RepoCallRequestStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRepoCallRequestStatus
	 * SecuritiesTradeStatus.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RepoCallReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CALL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the repurchase agreement call request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, RepoCallRequestStatus3Choice> mmRepoCallRequestStatus = new MMMessageAssociationEnd<Status3Choice, RepoCallRequestStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmRepoCallRequestStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallReqSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CALL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepoCallRequestStatus3Choice.mmObject();
		}

		@Override
		public RepoCallRequestStatus3Choice getValue(Status3Choice obj) {
			return obj.getRepoCallRequestStatus();
		}

		@Override
		public void setValue(Status3Choice obj, RepoCallRequestStatus3Choice value) {
			obj.setRepoCallRequestStatus(value);
		}
	};
	@XmlElement(name = "CorpActnEvtPrcgSts", required = true)
	protected CorporateActionEventProcessingStatus2Choice corporateActionEventProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice
	 * CorporateActionEventProcessingStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventProcessingStatus
	 * CorporateActionStatus.mmEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::EPRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of a corporate action or the status of a payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, CorporateActionEventProcessingStatus2Choice> mmCorporateActionEventProcessingStatus = new MMMessageAssociationEnd<Status3Choice, CorporateActionEventProcessingStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmEventProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtPrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::EPRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventProcessingStatus";
			definition = "Provides the status of a corporate action or the status of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventProcessingStatus2Choice.mmObject();
		}

		@Override
		public CorporateActionEventProcessingStatus2Choice getValue(Status3Choice obj) {
			return obj.getCorporateActionEventProcessingStatus();
		}

		@Override
		public void setValue(Status3Choice obj, CorporateActionEventProcessingStatus2Choice value) {
			obj.setCorporateActionEventProcessingStatus(value);
		}
	};
	@XmlElement(name = "CorpActnEvtStag", required = true)
	protected CorporateActionEventStage2Choice corporateActionEventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage2Choice
	 * CorporateActionEventStage2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::ESTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, CorporateActionEventStage2Choice> mmCorporateActionEventStage = new MMMessageAssociationEnd<Status3Choice, CorporateActionEventStage2Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtStag";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::ESTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStage2Choice.mmObject();
		}

		@Override
		public CorporateActionEventStage2Choice getValue(Status3Choice obj) {
			return obj.getCorporateActionEventStage();
		}

		@Override
		public void setValue(Status3Choice obj, CorporateActionEventStage2Choice value) {
			obj.setCorporateActionEventStage(value);
		}
	};
	@XmlElement(name = "IfrrdMtchgSts", required = true)
	protected MatchingStatus5Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus5Choice
	 * MatchingStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::INMH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, MatchingStatus5Choice> mmInferredMatchingStatus = new MMMessageAssociationEnd<Status3Choice, MatchingStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::INMH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingStatus5Choice.mmObject();
		}

		@Override
		public MatchingStatus5Choice getValue(Status3Choice obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(Status3Choice obj, MatchingStatus5Choice value) {
			obj.setInferredMatchingStatus(value);
		}
	};
	@XmlElement(name = "InstrPrcgSts", required = true)
	protected InstructionProcessingStatus5Choice instructionProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice
	 * InstructionProcessingStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, InstructionProcessingStatus5Choice> mmInstructionProcessingStatus = new MMMessageAssociationEnd<Status3Choice, InstructionProcessingStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Provides the status of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionProcessingStatus5Choice.mmObject();
		}

		@Override
		public InstructionProcessingStatus5Choice getValue(Status3Choice obj) {
			return obj.getInstructionProcessingStatus();
		}

		@Override
		public void setValue(Status3Choice obj, InstructionProcessingStatus5Choice value) {
			obj.setInstructionProcessingStatus(value);
		}
	};
	@XmlElement(name = "MtchgSts", required = true)
	protected MatchingStatus5Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus5Choice
	 * MatchingStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::MTCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, MatchingStatus5Choice> mmMatchingStatus = new MMMessageAssociationEnd<Status3Choice, MatchingStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::MTCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingStatus5Choice.mmObject();
		}

		@Override
		public MatchingStatus5Choice getValue(Status3Choice obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(Status3Choice obj, MatchingStatus5Choice value) {
			obj.setMatchingStatus(value);
		}
	};
	@XmlElement(name = "RegnPrcgSts", required = true)
	protected RegistrationProcessingStatus2Choice registrationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus2Choice
	 * RegistrationProcessingStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::RERC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of the registration processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, RegistrationProcessingStatus2Choice> mmRegistrationProcessingStatus = new MMMessageAssociationEnd<Status3Choice, RegistrationProcessingStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "RegnPrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::RERC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationProcessingStatus";
			definition = "Provides the status of the registration processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RegistrationProcessingStatus2Choice.mmObject();
		}

		@Override
		public RegistrationProcessingStatus2Choice getValue(Status3Choice obj) {
			return obj.getRegistrationProcessingStatus();
		}

		@Override
		public void setValue(Status3Choice obj, RegistrationProcessingStatus2Choice value) {
			obj.setRegistrationProcessingStatus(value);
		}
	};
	@XmlElement(name = "RspnSts", required = true)
	protected ResponseStatus2Choice responseStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus2Choice
	 * ResponseStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmResponseStatus
	 * CollateralStatus.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::REST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, ResponseStatus2Choice> mmResponseStatus = new MMMessageAssociationEnd<Status3Choice, ResponseStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmResponseStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "RspnSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::REST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseStatus2Choice.mmObject();
		}

		@Override
		public ResponseStatus2Choice getValue(Status3Choice obj) {
			return obj.getResponseStatus();
		}

		@Override
		public void setValue(Status3Choice obj, ResponseStatus2Choice value) {
			obj.setResponseStatus(value);
		}
	};
	@XmlElement(name = "RplcmntPrcgSts", required = true)
	protected ReplacementProcessingStatus2Choice replacementProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus2Choice
	 * ReplacementProcessingStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RplcmntPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::RPRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the processing status of the replacement request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, ReplacementProcessingStatus2Choice> mmReplacementProcessingStatus = new MMMessageAssociationEnd<Status3Choice, ReplacementProcessingStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "RplcmntPrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::RPRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReplacementProcessingStatus2Choice.mmObject();
		}

		@Override
		public ReplacementProcessingStatus2Choice getValue(Status3Choice obj) {
			return obj.getReplacementProcessingStatus();
		}

		@Override
		public void setValue(Status3Choice obj, ReplacementProcessingStatus2Choice value) {
			obj.setReplacementProcessingStatus(value);
		}
	};
	@XmlElement(name = "CxlPrcgSts", required = true)
	protected CancellationProcessingStatus2Choice cancellationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice
	 * CancellationProcessingStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmCancellationProcessingStatus
	 * Status.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, CancellationProcessingStatus2Choice> mmCancellationProcessingStatus = new MMMessageAssociationEnd<Status3Choice, CancellationProcessingStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmCancellationProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlPrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Provides the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationProcessingStatus2Choice.mmObject();
		}

		@Override
		public CancellationProcessingStatus2Choice getValue(Status3Choice obj) {
			return obj.getCancellationProcessingStatus();
		}

		@Override
		public void setValue(Status3Choice obj, CancellationProcessingStatus2Choice value) {
			obj.setCancellationProcessingStatus(value);
		}
	};
	@XmlElement(name = "SttlmSts", required = true)
	protected SettlementStatus3Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus3Choice
	 * SettlementStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, SettlementStatus3Choice> mmSettlementStatus = new MMMessageAssociationEnd<Status3Choice, SettlementStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmSettlementStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementStatus3Choice.mmObject();
		}

		@Override
		public SettlementStatus3Choice getValue(Status3Choice obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(Status3Choice obj, SettlementStatus3Choice value) {
			obj.setSettlementStatus(value);
		}
	};
	@XmlElement(name = "SttlmCondModSts", required = true)
	protected SettlementConditionModificationStatus2Choice settlementConditionModificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice
	 * SettlementConditionModificationStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSettlementConditionModificationStatus
	 * SecuritiesTradeStatus.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCondModSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::TPRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementConditionModificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of a securities settlement condition modification request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status3Choice, SettlementConditionModificationStatus2Choice> mmSettlementConditionModificationStatus = new MMMessageAssociationEnd<Status3Choice, SettlementConditionModificationStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmSettlementConditionModificationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status3Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmCondModSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::TPRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of a securities settlement condition modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementConditionModificationStatus2Choice.mmObject();
		}

		@Override
		public SettlementConditionModificationStatus2Choice getValue(Status3Choice obj) {
			return obj.getSettlementConditionModificationStatus();
		}

		@Override
		public void setValue(Status3Choice obj, SettlementConditionModificationStatus2Choice value) {
			obj.setSettlementConditionModificationStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status3Choice.mmAffirmationStatus, com.tools20022.repository.choice.Status3Choice.mmAllocationStatus,
						com.tools20022.repository.choice.Status3Choice.mmRepoCallRequestStatus, com.tools20022.repository.choice.Status3Choice.mmCorporateActionEventProcessingStatus,
						com.tools20022.repository.choice.Status3Choice.mmCorporateActionEventStage, com.tools20022.repository.choice.Status3Choice.mmInferredMatchingStatus,
						com.tools20022.repository.choice.Status3Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status3Choice.mmMatchingStatus,
						com.tools20022.repository.choice.Status3Choice.mmRegistrationProcessingStatus, com.tools20022.repository.choice.Status3Choice.mmResponseStatus,
						com.tools20022.repository.choice.Status3Choice.mmReplacementProcessingStatus, com.tools20022.repository.choice.Status3Choice.mmCancellationProcessingStatus,
						com.tools20022.repository.choice.Status3Choice.mmSettlementStatus, com.tools20022.repository.choice.Status3Choice.mmSettlementConditionModificationStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusRule.forStatus3Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status3Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	public AffirmationStatus2Choice getAffirmationStatus() {
		return affirmationStatus;
	}

	public Status3Choice setAffirmationStatus(AffirmationStatus2Choice affirmationStatus) {
		this.affirmationStatus = Objects.requireNonNull(affirmationStatus);
		return this;
	}

	public AllocationSatus2Choice getAllocationStatus() {
		return allocationStatus;
	}

	public Status3Choice setAllocationStatus(AllocationSatus2Choice allocationStatus) {
		this.allocationStatus = Objects.requireNonNull(allocationStatus);
		return this;
	}

	public RepoCallRequestStatus3Choice getRepoCallRequestStatus() {
		return repoCallRequestStatus;
	}

	public Status3Choice setRepoCallRequestStatus(RepoCallRequestStatus3Choice repoCallRequestStatus) {
		this.repoCallRequestStatus = Objects.requireNonNull(repoCallRequestStatus);
		return this;
	}

	public CorporateActionEventProcessingStatus2Choice getCorporateActionEventProcessingStatus() {
		return corporateActionEventProcessingStatus;
	}

	public Status3Choice setCorporateActionEventProcessingStatus(CorporateActionEventProcessingStatus2Choice corporateActionEventProcessingStatus) {
		this.corporateActionEventProcessingStatus = Objects.requireNonNull(corporateActionEventProcessingStatus);
		return this;
	}

	public CorporateActionEventStage2Choice getCorporateActionEventStage() {
		return corporateActionEventStage;
	}

	public Status3Choice setCorporateActionEventStage(CorporateActionEventStage2Choice corporateActionEventStage) {
		this.corporateActionEventStage = Objects.requireNonNull(corporateActionEventStage);
		return this;
	}

	public MatchingStatus5Choice getInferredMatchingStatus() {
		return inferredMatchingStatus;
	}

	public Status3Choice setInferredMatchingStatus(MatchingStatus5Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = Objects.requireNonNull(inferredMatchingStatus);
		return this;
	}

	public InstructionProcessingStatus5Choice getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public Status3Choice setInstructionProcessingStatus(InstructionProcessingStatus5Choice instructionProcessingStatus) {
		this.instructionProcessingStatus = Objects.requireNonNull(instructionProcessingStatus);
		return this;
	}

	public MatchingStatus5Choice getMatchingStatus() {
		return matchingStatus;
	}

	public Status3Choice setMatchingStatus(MatchingStatus5Choice matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public RegistrationProcessingStatus2Choice getRegistrationProcessingStatus() {
		return registrationProcessingStatus;
	}

	public Status3Choice setRegistrationProcessingStatus(RegistrationProcessingStatus2Choice registrationProcessingStatus) {
		this.registrationProcessingStatus = Objects.requireNonNull(registrationProcessingStatus);
		return this;
	}

	public ResponseStatus2Choice getResponseStatus() {
		return responseStatus;
	}

	public Status3Choice setResponseStatus(ResponseStatus2Choice responseStatus) {
		this.responseStatus = Objects.requireNonNull(responseStatus);
		return this;
	}

	public ReplacementProcessingStatus2Choice getReplacementProcessingStatus() {
		return replacementProcessingStatus;
	}

	public Status3Choice setReplacementProcessingStatus(ReplacementProcessingStatus2Choice replacementProcessingStatus) {
		this.replacementProcessingStatus = Objects.requireNonNull(replacementProcessingStatus);
		return this;
	}

	public CancellationProcessingStatus2Choice getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public Status3Choice setCancellationProcessingStatus(CancellationProcessingStatus2Choice cancellationProcessingStatus) {
		this.cancellationProcessingStatus = Objects.requireNonNull(cancellationProcessingStatus);
		return this;
	}

	public SettlementStatus3Choice getSettlementStatus() {
		return settlementStatus;
	}

	public Status3Choice setSettlementStatus(SettlementStatus3Choice settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public SettlementConditionModificationStatus2Choice getSettlementConditionModificationStatus() {
		return settlementConditionModificationStatus;
	}

	public Status3Choice setSettlementConditionModificationStatus(SettlementConditionModificationStatus2Choice settlementConditionModificationStatus) {
		this.settlementConditionModificationStatus = Objects.requireNonNull(settlementConditionModificationStatus);
		return this;
	}
}