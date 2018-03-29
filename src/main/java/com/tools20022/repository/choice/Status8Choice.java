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
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmAffirmationStatus
 * Status8Choice.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmAllocationStatus
 * Status8Choice.mmAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmRepoCallRequestStatus
 * Status8Choice.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmCorporateActionEventProcessingStatus
 * Status8Choice.mmCorporateActionEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmCorporateActionEventStage
 * Status8Choice.mmCorporateActionEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmInferredMatchingStatus
 * Status8Choice.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmInstructionProcessingStatus
 * Status8Choice.mmInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmMatchingStatus
 * Status8Choice.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmRegistrationProcessingStatus
 * Status8Choice.mmRegistrationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmResponseStatus
 * Status8Choice.mmResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmReplacementProcessingStatus
 * Status8Choice.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmCancellationProcessingStatus
 * Status8Choice.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmSettlementStatus
 * Status8Choice.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmSettlementConditionModificationStatus
 * Status8Choice.mmSettlementConditionModificationStatus}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusRule#forStatus8Choice
 * ConstraintStatusRule.forStatus8Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Status8Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Status19Choice
 * Status19Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Status8Choice", propOrder = {"affirmationStatus", "allocationStatus", "repoCallRequestStatus", "corporateActionEventProcessingStatus", "corporateActionEventStage", "inferredMatchingStatus", "instructionProcessingStatus",
		"matchingStatus", "registrationProcessingStatus", "responseStatus", "replacementProcessingStatus", "cancellationProcessingStatus", "settlementStatus", "settlementConditionModificationStatus"})
public class Status8Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AffirmSts", required = true)
	protected AffirmationStatus1Choice affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice
	 * AffirmationStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmAffirmationStatus
	 * Status19Choice.mmAffirmationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, AffirmationStatus1Choice> mmAffirmationStatus = new MMMessageAssociationEnd<Status8Choice, AffirmationStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmAffirmationStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AffirmationStatus1Choice.mmObject();
		}

		@Override
		public AffirmationStatus1Choice getValue(Status8Choice obj) {
			return obj.getAffirmationStatus();
		}

		@Override
		public void setValue(Status8Choice obj, AffirmationStatus1Choice value) {
			obj.setAffirmationStatus(value);
		}
	};
	@XmlElement(name = "AllcnSts", required = true)
	protected AllocationSatus1Choice allocationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus1Choice
	 * AllocationSatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCollateralAllocationStatus
	 * SecuritiesTradeStatus.mmCollateralAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnSts"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmAllocationStatus
	 * Status19Choice.mmAllocationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, AllocationSatus1Choice> mmAllocationStatus = new MMMessageAssociationEnd<Status8Choice, AllocationSatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmCollateralAllocationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "AllcnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmAllocationStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AllocationSatus1Choice.mmObject();
		}

		@Override
		public AllocationSatus1Choice getValue(Status8Choice obj) {
			return obj.getAllocationStatus();
		}

		@Override
		public void setValue(Status8Choice obj, AllocationSatus1Choice value) {
			obj.setAllocationStatus(value);
		}
	};
	@XmlElement(name = "RepoCallReqSts", required = true)
	protected RepoCallRequestStatus1Choice repoCallRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice
	 * RepoCallRequestStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRepoCallRequestStatus
	 * SecuritiesTradeStatus.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RepoCallReqSts"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmRepoCallRequestStatus
	 * Status19Choice.mmRepoCallRequestStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, RepoCallRequestStatus1Choice> mmRepoCallRequestStatus = new MMMessageAssociationEnd<Status8Choice, RepoCallRequestStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmRepoCallRequestStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmRepoCallRequestStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepoCallRequestStatus1Choice.mmObject();
		}

		@Override
		public RepoCallRequestStatus1Choice getValue(Status8Choice obj) {
			return obj.getRepoCallRequestStatus();
		}

		@Override
		public void setValue(Status8Choice obj, RepoCallRequestStatus1Choice value) {
			obj.setRepoCallRequestStatus(value);
		}
	};
	@XmlElement(name = "CorpActnEvtPrcgSts", required = true)
	protected CorporateActionEventProcessingStatus1Choice corporateActionEventProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice
	 * CorporateActionEventProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventProcessingStatus
	 * CorporateActionStatus.mmEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtPrcgSts"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCorporateActionEventProcessingStatus
	 * Status19Choice.mmCorporateActionEventProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, CorporateActionEventProcessingStatus1Choice> mmCorporateActionEventProcessingStatus = new MMMessageAssociationEnd<Status8Choice, CorporateActionEventProcessingStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmEventProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventProcessingStatus";
			definition = "Provides the status of a corporate action or the status of a payment.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmCorporateActionEventProcessingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventProcessingStatus1Choice.mmObject();
		}

		@Override
		public CorporateActionEventProcessingStatus1Choice getValue(Status8Choice obj) {
			return obj.getCorporateActionEventProcessingStatus();
		}

		@Override
		public void setValue(Status8Choice obj, CorporateActionEventProcessingStatus1Choice value) {
			obj.setCorporateActionEventProcessingStatus(value);
		}
	};
	@XmlElement(name = "CorpActnEvtStag", required = true)
	protected CorporateActionEventStage1Choice corporateActionEventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1Choice
	 * CorporateActionEventStage1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCorporateActionEventStage
	 * Status19Choice.mmCorporateActionEventStage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, CorporateActionEventStage1Choice> mmCorporateActionEventStage = new MMMessageAssociationEnd<Status8Choice, CorporateActionEventStage1Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventStage";
			definition = "Stage in the corporate action event life cycle.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmCorporateActionEventStage);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStage1Choice.mmObject();
		}

		@Override
		public CorporateActionEventStage1Choice getValue(Status8Choice obj) {
			return obj.getCorporateActionEventStage();
		}

		@Override
		public void setValue(Status8Choice obj, CorporateActionEventStage1Choice value) {
			obj.setCorporateActionEventStage(value);
		}
	};
	@XmlElement(name = "IfrrdMtchgSts", required = true)
	protected MatchingStatus1Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice
	 * MatchingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmInferredMatchingStatus
	 * Status19Choice.mmInferredMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, MatchingStatus1Choice> mmInferredMatchingStatus = new MMMessageAssociationEnd<Status8Choice, MatchingStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmInferredMatchingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingStatus1Choice.mmObject();
		}

		@Override
		public MatchingStatus1Choice getValue(Status8Choice obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(Status8Choice obj, MatchingStatus1Choice value) {
			obj.setInferredMatchingStatus(value);
		}
	};
	@XmlElement(name = "InstrPrcgSts", required = true)
	protected InstructionProcessingStatus2Choice instructionProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice
	 * InstructionProcessingStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmInstructionProcessingStatus
	 * Status19Choice.mmInstructionProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, InstructionProcessingStatus2Choice> mmInstructionProcessingStatus = new MMMessageAssociationEnd<Status8Choice, InstructionProcessingStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Provides the status of an instruction.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmInstructionProcessingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionProcessingStatus2Choice.mmObject();
		}

		@Override
		public InstructionProcessingStatus2Choice getValue(Status8Choice obj) {
			return obj.getInstructionProcessingStatus();
		}

		@Override
		public void setValue(Status8Choice obj, InstructionProcessingStatus2Choice value) {
			obj.setInstructionProcessingStatus(value);
		}
	};
	@XmlElement(name = "MtchgSts", required = true)
	protected MatchingStatus1Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice
	 * MatchingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmMatchingStatus
	 * Status19Choice.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, MatchingStatus1Choice> mmMatchingStatus = new MMMessageAssociationEnd<Status8Choice, MatchingStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmMatchingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingStatus1Choice.mmObject();
		}

		@Override
		public MatchingStatus1Choice getValue(Status8Choice obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(Status8Choice obj, MatchingStatus1Choice value) {
			obj.setMatchingStatus(value);
		}
	};
	@XmlElement(name = "RegnPrcgSts", required = true)
	protected RegistrationProcessingStatus1Choice registrationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice
	 * RegistrationProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of the registration processing."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmRegistrationProcessingStatus
	 * Status19Choice.mmRegistrationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, RegistrationProcessingStatus1Choice> mmRegistrationProcessingStatus = new MMMessageAssociationEnd<Status8Choice, RegistrationProcessingStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "RegnPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationProcessingStatus";
			definition = "Provides the status of the registration processing.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmRegistrationProcessingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RegistrationProcessingStatus1Choice.mmObject();
		}

		@Override
		public RegistrationProcessingStatus1Choice getValue(Status8Choice obj) {
			return obj.getRegistrationProcessingStatus();
		}

		@Override
		public void setValue(Status8Choice obj, RegistrationProcessingStatus1Choice value) {
			obj.setRegistrationProcessingStatus(value);
		}
	};
	@XmlElement(name = "RspnSts", required = true)
	protected ResponseStatus1Choice responseStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus1Choice
	 * ResponseStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmResponseStatus
	 * CollateralStatus.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnSts"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmResponseStatus
	 * Status19Choice.mmResponseStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, ResponseStatus1Choice> mmResponseStatus = new MMMessageAssociationEnd<Status8Choice, ResponseStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmResponseStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "RspnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmResponseStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseStatus1Choice.mmObject();
		}

		@Override
		public ResponseStatus1Choice getValue(Status8Choice obj) {
			return obj.getResponseStatus();
		}

		@Override
		public void setValue(Status8Choice obj, ResponseStatus1Choice value) {
			obj.setResponseStatus(value);
		}
	};
	@XmlElement(name = "RplcmntPrcgSts", required = true)
	protected ReplacementProcessingStatus1Choice replacementProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice
	 * ReplacementProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RplcmntPrcgSts"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmReplacementProcessingStatus
	 * Status19Choice.mmReplacementProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, ReplacementProcessingStatus1Choice> mmReplacementProcessingStatus = new MMMessageAssociationEnd<Status8Choice, ReplacementProcessingStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "RplcmntPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmReplacementProcessingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReplacementProcessingStatus1Choice.mmObject();
		}

		@Override
		public ReplacementProcessingStatus1Choice getValue(Status8Choice obj) {
			return obj.getReplacementProcessingStatus();
		}

		@Override
		public void setValue(Status8Choice obj, ReplacementProcessingStatus1Choice value) {
			obj.setReplacementProcessingStatus(value);
		}
	};
	@XmlElement(name = "CxlPrcgSts", required = true)
	protected CancellationProcessingStatus1Choice cancellationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice
	 * CancellationProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmCancellationProcessingStatus
	 * Status.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a cancellation request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCancellationProcessingStatus
	 * Status19Choice.mmCancellationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, CancellationProcessingStatus1Choice> mmCancellationProcessingStatus = new MMMessageAssociationEnd<Status8Choice, CancellationProcessingStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmCancellationProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Provides the status of a cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmCancellationProcessingStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationProcessingStatus1Choice.mmObject();
		}

		@Override
		public CancellationProcessingStatus1Choice getValue(Status8Choice obj) {
			return obj.getCancellationProcessingStatus();
		}

		@Override
		public void setValue(Status8Choice obj, CancellationProcessingStatus1Choice value) {
			obj.setCancellationProcessingStatus(value);
		}
	};
	@XmlElement(name = "SttlmSts", required = true)
	protected SettlementStatus5Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice
	 * SettlementStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmSettlementStatus
	 * Status19Choice.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, SettlementStatus5Choice> mmSettlementStatus = new MMMessageAssociationEnd<Status8Choice, SettlementStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmSettlementStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmSettlementStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementStatus5Choice.mmObject();
		}

		@Override
		public SettlementStatus5Choice getValue(Status8Choice obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(Status8Choice obj, SettlementStatus5Choice value) {
			obj.setSettlementStatus(value);
		}
	};
	@XmlElement(name = "SttlmCondModSts", required = true)
	protected SettlementConditionModificationStatus1Choice settlementConditionModificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus1Choice
	 * SettlementConditionModificationStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSettlementConditionModificationStatus
	 * SecuritiesTradeStatus.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCondModSts"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmSettlementConditionModificationStatus
	 * Status19Choice.mmSettlementConditionModificationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status8Choice, SettlementConditionModificationStatus1Choice> mmSettlementConditionModificationStatus = new MMMessageAssociationEnd<Status8Choice, SettlementConditionModificationStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmSettlementConditionModificationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status8Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmCondModSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of a securities settlement condition modification request.";
			nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmSettlementConditionModificationStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementConditionModificationStatus1Choice.mmObject();
		}

		@Override
		public SettlementConditionModificationStatus1Choice getValue(Status8Choice obj) {
			return obj.getSettlementConditionModificationStatus();
		}

		@Override
		public void setValue(Status8Choice obj, SettlementConditionModificationStatus1Choice value) {
			obj.setSettlementConditionModificationStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status8Choice.mmAffirmationStatus, com.tools20022.repository.choice.Status8Choice.mmAllocationStatus,
						com.tools20022.repository.choice.Status8Choice.mmRepoCallRequestStatus, com.tools20022.repository.choice.Status8Choice.mmCorporateActionEventProcessingStatus,
						com.tools20022.repository.choice.Status8Choice.mmCorporateActionEventStage, com.tools20022.repository.choice.Status8Choice.mmInferredMatchingStatus,
						com.tools20022.repository.choice.Status8Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status8Choice.mmMatchingStatus,
						com.tools20022.repository.choice.Status8Choice.mmRegistrationProcessingStatus, com.tools20022.repository.choice.Status8Choice.mmResponseStatus,
						com.tools20022.repository.choice.Status8Choice.mmReplacementProcessingStatus, com.tools20022.repository.choice.Status8Choice.mmCancellationProcessingStatus,
						com.tools20022.repository.choice.Status8Choice.mmSettlementStatus, com.tools20022.repository.choice.Status8Choice.mmSettlementConditionModificationStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusRule.forStatus8Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status8Choice";
				definition = "Choice of status.";
				nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AffirmationStatus1Choice getAffirmationStatus() {
		return affirmationStatus;
	}

	public Status8Choice setAffirmationStatus(AffirmationStatus1Choice affirmationStatus) {
		this.affirmationStatus = Objects.requireNonNull(affirmationStatus);
		return this;
	}

	public AllocationSatus1Choice getAllocationStatus() {
		return allocationStatus;
	}

	public Status8Choice setAllocationStatus(AllocationSatus1Choice allocationStatus) {
		this.allocationStatus = Objects.requireNonNull(allocationStatus);
		return this;
	}

	public RepoCallRequestStatus1Choice getRepoCallRequestStatus() {
		return repoCallRequestStatus;
	}

	public Status8Choice setRepoCallRequestStatus(RepoCallRequestStatus1Choice repoCallRequestStatus) {
		this.repoCallRequestStatus = Objects.requireNonNull(repoCallRequestStatus);
		return this;
	}

	public CorporateActionEventProcessingStatus1Choice getCorporateActionEventProcessingStatus() {
		return corporateActionEventProcessingStatus;
	}

	public Status8Choice setCorporateActionEventProcessingStatus(CorporateActionEventProcessingStatus1Choice corporateActionEventProcessingStatus) {
		this.corporateActionEventProcessingStatus = Objects.requireNonNull(corporateActionEventProcessingStatus);
		return this;
	}

	public CorporateActionEventStage1Choice getCorporateActionEventStage() {
		return corporateActionEventStage;
	}

	public Status8Choice setCorporateActionEventStage(CorporateActionEventStage1Choice corporateActionEventStage) {
		this.corporateActionEventStage = Objects.requireNonNull(corporateActionEventStage);
		return this;
	}

	public MatchingStatus1Choice getInferredMatchingStatus() {
		return inferredMatchingStatus;
	}

	public Status8Choice setInferredMatchingStatus(MatchingStatus1Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = Objects.requireNonNull(inferredMatchingStatus);
		return this;
	}

	public InstructionProcessingStatus2Choice getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public Status8Choice setInstructionProcessingStatus(InstructionProcessingStatus2Choice instructionProcessingStatus) {
		this.instructionProcessingStatus = Objects.requireNonNull(instructionProcessingStatus);
		return this;
	}

	public MatchingStatus1Choice getMatchingStatus() {
		return matchingStatus;
	}

	public Status8Choice setMatchingStatus(MatchingStatus1Choice matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public RegistrationProcessingStatus1Choice getRegistrationProcessingStatus() {
		return registrationProcessingStatus;
	}

	public Status8Choice setRegistrationProcessingStatus(RegistrationProcessingStatus1Choice registrationProcessingStatus) {
		this.registrationProcessingStatus = Objects.requireNonNull(registrationProcessingStatus);
		return this;
	}

	public ResponseStatus1Choice getResponseStatus() {
		return responseStatus;
	}

	public Status8Choice setResponseStatus(ResponseStatus1Choice responseStatus) {
		this.responseStatus = Objects.requireNonNull(responseStatus);
		return this;
	}

	public ReplacementProcessingStatus1Choice getReplacementProcessingStatus() {
		return replacementProcessingStatus;
	}

	public Status8Choice setReplacementProcessingStatus(ReplacementProcessingStatus1Choice replacementProcessingStatus) {
		this.replacementProcessingStatus = Objects.requireNonNull(replacementProcessingStatus);
		return this;
	}

	public CancellationProcessingStatus1Choice getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public Status8Choice setCancellationProcessingStatus(CancellationProcessingStatus1Choice cancellationProcessingStatus) {
		this.cancellationProcessingStatus = Objects.requireNonNull(cancellationProcessingStatus);
		return this;
	}

	public SettlementStatus5Choice getSettlementStatus() {
		return settlementStatus;
	}

	public Status8Choice setSettlementStatus(SettlementStatus5Choice settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public SettlementConditionModificationStatus1Choice getSettlementConditionModificationStatus() {
		return settlementConditionModificationStatus;
	}

	public Status8Choice setSettlementConditionModificationStatus(SettlementConditionModificationStatus1Choice settlementConditionModificationStatus) {
		this.settlementConditionModificationStatus = Objects.requireNonNull(settlementConditionModificationStatus);
		return this;
	}
}