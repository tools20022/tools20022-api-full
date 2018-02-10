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
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmAffirmationStatus
 * Status10Choice.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmAllocationStatus
 * Status10Choice.mmAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmRepoCallRequestStatus
 * Status10Choice.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmCorporateActionEventProcessingStatus
 * Status10Choice.mmCorporateActionEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmCorporateActionEventStage
 * Status10Choice.mmCorporateActionEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmInferredMatchingStatus
 * Status10Choice.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmInstructionProcessingStatus
 * Status10Choice.mmInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmMatchingStatus
 * Status10Choice.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmRegistrationProcessingStatus
 * Status10Choice.mmRegistrationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmResponseStatus
 * Status10Choice.mmResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmReplacementProcessingStatus
 * Status10Choice.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmCancellationProcessingStatus
 * Status10Choice.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmSettlementStatus
 * Status10Choice.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmSettlementConditionModificationStatus
 * Status10Choice.mmSettlementConditionModificationStatus}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusRule#forStatus10Choice
 * ConstraintStatusRule.forStatus10Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Status10Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Status10Choice", propOrder = {"affirmationStatus", "allocationStatus", "repoCallRequestStatus", "corporateActionEventProcessingStatus", "corporateActionEventStage", "inferredMatchingStatus", "instructionProcessingStatus",
		"matchingStatus", "registrationProcessingStatus", "responseStatus", "replacementProcessingStatus", "cancellationProcessingStatus", "settlementStatus", "settlementConditionModificationStatus"})
public class Status10Choice {

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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAffirmationStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AffirmationStatus2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllocationStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmCollateralAllocationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "AllcnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AllocationSatus2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepoCallRequestStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmRepoCallRequestStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepoCallRequestStatus3Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionEventProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmEventProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventProcessingStatus";
			definition = "Provides the status of a corporate action or the status of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionEventStage = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CorporateActionEventStage2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInferredMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.MatchingStatus5Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Provides the status of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus5Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.MatchingStatus5Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "RegnPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationProcessingStatus";
			definition = "Provides the status of the registration processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RegistrationProcessingStatus2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponseStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmResponseStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "RspnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.ResponseStatus2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReplacementProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "RplcmntPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.ReplacementProcessingStatus2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmCancellationProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Provides the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationProcessingStatus2Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmSts", required = true)
	protected SettlementStatus6Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus6Choice
	 * SettlementStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmSettlementStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SettlementStatus6Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.Status10Choice
	 * Status10Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementConditionModificationStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmSettlementConditionModificationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status10Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmCondModSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of a securities settlement condition modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status10Choice.mmAffirmationStatus, com.tools20022.repository.choice.Status10Choice.mmAllocationStatus,
						com.tools20022.repository.choice.Status10Choice.mmRepoCallRequestStatus, com.tools20022.repository.choice.Status10Choice.mmCorporateActionEventProcessingStatus,
						com.tools20022.repository.choice.Status10Choice.mmCorporateActionEventStage, com.tools20022.repository.choice.Status10Choice.mmInferredMatchingStatus,
						com.tools20022.repository.choice.Status10Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status10Choice.mmMatchingStatus,
						com.tools20022.repository.choice.Status10Choice.mmRegistrationProcessingStatus, com.tools20022.repository.choice.Status10Choice.mmResponseStatus,
						com.tools20022.repository.choice.Status10Choice.mmReplacementProcessingStatus, com.tools20022.repository.choice.Status10Choice.mmCancellationProcessingStatus,
						com.tools20022.repository.choice.Status10Choice.mmSettlementStatus, com.tools20022.repository.choice.Status10Choice.mmSettlementConditionModificationStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusRule.forStatus10Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status10Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	public AffirmationStatus2Choice getAffirmationStatus() {
		return affirmationStatus;
	}

	public Status10Choice setAffirmationStatus(com.tools20022.repository.choice.AffirmationStatus2Choice affirmationStatus) {
		this.affirmationStatus = Objects.requireNonNull(affirmationStatus);
		return this;
	}

	public AllocationSatus2Choice getAllocationStatus() {
		return allocationStatus;
	}

	public Status10Choice setAllocationStatus(com.tools20022.repository.choice.AllocationSatus2Choice allocationStatus) {
		this.allocationStatus = Objects.requireNonNull(allocationStatus);
		return this;
	}

	public RepoCallRequestStatus3Choice getRepoCallRequestStatus() {
		return repoCallRequestStatus;
	}

	public Status10Choice setRepoCallRequestStatus(com.tools20022.repository.choice.RepoCallRequestStatus3Choice repoCallRequestStatus) {
		this.repoCallRequestStatus = Objects.requireNonNull(repoCallRequestStatus);
		return this;
	}

	public CorporateActionEventProcessingStatus2Choice getCorporateActionEventProcessingStatus() {
		return corporateActionEventProcessingStatus;
	}

	public Status10Choice setCorporateActionEventProcessingStatus(com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice corporateActionEventProcessingStatus) {
		this.corporateActionEventProcessingStatus = Objects.requireNonNull(corporateActionEventProcessingStatus);
		return this;
	}

	public CorporateActionEventStage2Choice getCorporateActionEventStage() {
		return corporateActionEventStage;
	}

	public Status10Choice setCorporateActionEventStage(com.tools20022.repository.choice.CorporateActionEventStage2Choice corporateActionEventStage) {
		this.corporateActionEventStage = Objects.requireNonNull(corporateActionEventStage);
		return this;
	}

	public MatchingStatus5Choice getInferredMatchingStatus() {
		return inferredMatchingStatus;
	}

	public Status10Choice setInferredMatchingStatus(com.tools20022.repository.choice.MatchingStatus5Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = Objects.requireNonNull(inferredMatchingStatus);
		return this;
	}

	public InstructionProcessingStatus5Choice getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public Status10Choice setInstructionProcessingStatus(com.tools20022.repository.choice.InstructionProcessingStatus5Choice instructionProcessingStatus) {
		this.instructionProcessingStatus = Objects.requireNonNull(instructionProcessingStatus);
		return this;
	}

	public MatchingStatus5Choice getMatchingStatus() {
		return matchingStatus;
	}

	public Status10Choice setMatchingStatus(com.tools20022.repository.choice.MatchingStatus5Choice matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public RegistrationProcessingStatus2Choice getRegistrationProcessingStatus() {
		return registrationProcessingStatus;
	}

	public Status10Choice setRegistrationProcessingStatus(com.tools20022.repository.choice.RegistrationProcessingStatus2Choice registrationProcessingStatus) {
		this.registrationProcessingStatus = Objects.requireNonNull(registrationProcessingStatus);
		return this;
	}

	public ResponseStatus2Choice getResponseStatus() {
		return responseStatus;
	}

	public Status10Choice setResponseStatus(com.tools20022.repository.choice.ResponseStatus2Choice responseStatus) {
		this.responseStatus = Objects.requireNonNull(responseStatus);
		return this;
	}

	public ReplacementProcessingStatus2Choice getReplacementProcessingStatus() {
		return replacementProcessingStatus;
	}

	public Status10Choice setReplacementProcessingStatus(com.tools20022.repository.choice.ReplacementProcessingStatus2Choice replacementProcessingStatus) {
		this.replacementProcessingStatus = Objects.requireNonNull(replacementProcessingStatus);
		return this;
	}

	public CancellationProcessingStatus2Choice getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public Status10Choice setCancellationProcessingStatus(com.tools20022.repository.choice.CancellationProcessingStatus2Choice cancellationProcessingStatus) {
		this.cancellationProcessingStatus = Objects.requireNonNull(cancellationProcessingStatus);
		return this;
	}

	public SettlementStatus6Choice getSettlementStatus() {
		return settlementStatus;
	}

	public Status10Choice setSettlementStatus(com.tools20022.repository.choice.SettlementStatus6Choice settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public SettlementConditionModificationStatus2Choice getSettlementConditionModificationStatus() {
		return settlementConditionModificationStatus;
	}

	public Status10Choice setSettlementConditionModificationStatus(com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice settlementConditionModificationStatus) {
		this.settlementConditionModificationStatus = Objects.requireNonNull(settlementConditionModificationStatus);
		return this;
	}
}