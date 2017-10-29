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
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.Status8Choice#AffirmationStatus
 * Status8Choice.AffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#AllocationStatus
 * Status8Choice.AllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#RepoCallRequestStatus
 * Status8Choice.RepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#CorporateActionEventProcessingStatus
 * Status8Choice.CorporateActionEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#CorporateActionEventStage
 * Status8Choice.CorporateActionEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#InferredMatchingStatus
 * Status8Choice.InferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#InstructionProcessingStatus
 * Status8Choice.InstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#MatchingStatus
 * Status8Choice.MatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#RegistrationProcessingStatus
 * Status8Choice.RegistrationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#ResponseStatus
 * Status8Choice.ResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#ReplacementProcessingStatus
 * Status8Choice.ReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#CancellationProcessingStatus
 * Status8Choice.CancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#SettlementStatus
 * Status8Choice.SettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status8Choice#SettlementConditionModificationStatus
 * Status8Choice.SettlementConditionModificationStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
public class Status8Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of affirmation of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice
	 * AffirmationStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#AffirmationStatus
	 * SecuritiesTradeStatus.AffirmationStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#AffirmationStatus
	 * Status19Choice.AffirmationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AffirmationStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.AffirmationStatus;
			isDerived = false;
			xmlTag = "AffirmSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.AffirmationStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AffirmationStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of allocation of collateral to cover the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus1Choice
	 * AllocationSatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#CollateralAllocationStatus
	 * SecuritiesTradeStatus.CollateralAllocationStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#AllocationStatus
	 * Status19Choice.AllocationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AllocationStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.CollateralAllocationStatus;
			isDerived = false;
			xmlTag = "AllcnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.AllocationStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AllocationSatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of the repurchase agreement call request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice
	 * RepoCallRequestStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RepoCallRequestStatus
	 * SecuritiesTradeStatus.RepoCallRequestStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#RepoCallRequestStatus
	 * Status19Choice.RepoCallRequestStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RepoCallRequestStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.RepoCallRequestStatus;
			isDerived = false;
			xmlTag = "RepoCallReqSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.RepoCallRequestStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RepoCallRequestStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of a corporate action or the status of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice
	 * CorporateActionEventProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventProcessingStatus
	 * CorporateActionStatus.EventProcessingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#CorporateActionEventProcessingStatus
	 * Status19Choice.CorporateActionEventProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CorporateActionEventProcessingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.EventProcessingStatus;
			isDerived = false;
			xmlTag = "CorpActnEvtPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventProcessingStatus";
			definition = "Provides the status of a corporate action or the status of a payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.CorporateActionEventProcessingStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEventProcessingStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage1Choice
	 * CorporateActionEventStage1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#EventStage
	 * CorporateActionEvent.EventStage}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#CorporateActionEventStage
	 * Status19Choice.CorporateActionEventStage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CorporateActionEventStage = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.EventStage;
			isDerived = false;
			xmlTag = "CorpActnEvtStag";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventStage";
			definition = "Stage in the corporate action event life cycle.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.CorporateActionEventStage);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEventStage1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the matching status of an instruction as known by the account
	 * servicer based on an allegement. At this time no matching took place on
	 * the market (at the CSD/ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice
	 * MatchingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#MatchingStatus
	 * SecuritiesTradeStatus.MatchingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#InferredMatchingStatus
	 * Status19Choice.InferredMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InferredMatchingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.MatchingStatus;
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.InferredMatchingStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MatchingStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice
	 * InstructionProcessingStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#InstructionProcessingStatus
	 * Status19Choice.InstructionProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InstructionProcessingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "InstrPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Provides the status of an instruction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.InstructionProcessingStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InstructionProcessingStatus2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the matching status of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice
	 * MatchingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#MatchingStatus
	 * SecuritiesTradeStatus.MatchingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#MatchingStatus
	 * Status19Choice.MatchingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MatchingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.MatchingStatus;
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.MatchingStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MatchingStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of the registration processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice
	 * RegistrationProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#RegistrationProcessingStatus
	 * Status19Choice.RegistrationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RegistrationProcessingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "RegnPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationProcessingStatus";
			definition = "Provides the status of the registration processing.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.RegistrationProcessingStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegistrationProcessingStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of the received collateral message (collateral claim,
	 * a collateral proposal or a proposal/request for collateral substitution)
	 * from a collateral management perspective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus1Choice
	 * ResponseStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#ResponseStatus
	 * CollateralStatus.ResponseStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#ResponseStatus
	 * Status19Choice.ResponseStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ResponseStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralStatus.ResponseStatus;
			isDerived = false;
			xmlTag = "RspnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.ResponseStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ResponseStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the processing status of the replacement request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice
	 * ReplacementProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#ReplacementProcessingStatus
	 * Status19Choice.ReplacementProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReplacementProcessingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "RplcmntPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.ReplacementProcessingStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ReplacementProcessingStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice
	 * CancellationProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#CancellationProcessingStatus
	 * Status.CancellationProcessingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#CancellationProcessingStatus
	 * Status19Choice.CancellationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CancellationProcessingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.CancellationProcessingStatus;
			isDerived = false;
			xmlTag = "CxlPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Provides the status of a cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.CancellationProcessingStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CancellationProcessingStatus1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice
	 * SettlementStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#SettlementStatus
	 * Status.SettlementStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#SettlementStatus
	 * Status19Choice.SettlementStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SettlementStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.SettlementStatus;
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.SettlementStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SettlementStatus5Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the status of a securities settlement condition modification
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus1Choice
	 * SettlementConditionModificationStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SettlementConditionModificationStatus
	 * SecuritiesTradeStatus.SettlementConditionModificationStatus}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#SettlementConditionModificationStatus
	 * Status19Choice.SettlementConditionModificationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SettlementConditionModificationStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status8Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.SettlementConditionModificationStatus;
			isDerived = false;
			xmlTag = "SttlmCondModSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of a securities settlement condition modification request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status19Choice.SettlementConditionModificationStatus);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SettlementConditionModificationStatus1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status8Choice.AffirmationStatus, com.tools20022.repository.choice.Status8Choice.AllocationStatus,
						com.tools20022.repository.choice.Status8Choice.RepoCallRequestStatus, com.tools20022.repository.choice.Status8Choice.CorporateActionEventProcessingStatus,
						com.tools20022.repository.choice.Status8Choice.CorporateActionEventStage, com.tools20022.repository.choice.Status8Choice.InferredMatchingStatus,
						com.tools20022.repository.choice.Status8Choice.InstructionProcessingStatus, com.tools20022.repository.choice.Status8Choice.MatchingStatus, com.tools20022.repository.choice.Status8Choice.RegistrationProcessingStatus,
						com.tools20022.repository.choice.Status8Choice.ResponseStatus, com.tools20022.repository.choice.Status8Choice.ReplacementProcessingStatus, com.tools20022.repository.choice.Status8Choice.CancellationProcessingStatus,
						com.tools20022.repository.choice.Status8Choice.SettlementStatus, com.tools20022.repository.choice.Status8Choice.SettlementConditionModificationStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Status8Choice";
				definition = "Choice of status.";
				nextVersions_lazy = () -> Arrays.asList(Status19Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}