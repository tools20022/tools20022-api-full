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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of votes assigned to each voting option.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Vote" src="doc-files/Vote.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#VoteRequest
 * Vote.VoteRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#For Vote.For}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#Against Vote.Against}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#Abstain Vote.Abstain}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#Withhold Vote.Withhold}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#WithManagement
 * Vote.WithManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#AgainstManagement
 * Vote.AgainstManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#Resolution
 * Vote.Resolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#NoAction Vote.NoAction}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#Result Vote.Result}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#TwoYears Vote.TwoYears}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#OneYear Vote.OneYear}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#Withdrawn
 * Vote.Withdrawn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#ThreeYears
 * Vote.ThreeYears}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#CastVotes
 * Resolution.CastVotes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#VotePerResolution
 * VoteInstructionRequest.VotePerResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VoteResult#Vote
 * VoteResult.Vote}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Vote1 Vote1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote4 Vote4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7 Vote7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6 Vote6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote8 Vote8}</li>
 * </ul>
 * </li>
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
 * "Vote"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Number of votes assigned to each voting option."</li>
 * </ul>
 */
public class Vote {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Request which contains the vote instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#VotePerResolution
	 * VoteInstructionRequest.VotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request which contains the vote instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VoteRequest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteRequest";
			definition = "Request which contains the vote instructions.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> VoteInstructionRequest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.VotePerResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of votes in favour of one resolution
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#For Vote1.For}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#For Vote4.For}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote2#For Vote2.For}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote5#For Vote5.For}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#For Vote7.For}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#For Vote6.For}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#For Vote8.For}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in favour of one resolution"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute For = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.For, com.tools20022.repository.msg.Vote4.For, com.tools20022.repository.msg.Vote2.For, com.tools20022.repository.msg.Vote5.For,
					com.tools20022.repository.msg.Vote7.For, com.tools20022.repository.msg.Vote6.For, com.tools20022.repository.msg.Vote8.For);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "For";
			definition = "Number of votes in favour of one resolution";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes against one resolution
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#Against
	 * Vote1.Against}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#Against
	 * Vote4.Against}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote2#Against
	 * Vote2.Against}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote5#Against
	 * Vote5.Against}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#Against
	 * Vote7.Against}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#Against
	 * Vote6.Against}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#Against
	 * Vote8.Against}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes against one resolution"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Against = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.Against, com.tools20022.repository.msg.Vote4.Against, com.tools20022.repository.msg.Vote2.Against, com.tools20022.repository.msg.Vote5.Against,
					com.tools20022.repository.msg.Vote7.Against, com.tools20022.repository.msg.Vote6.Against, com.tools20022.repository.msg.Vote8.Against);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Against";
			definition = "Number of votes against one resolution";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes declared abstained for one resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#Abstain
	 * Vote1.Abstain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#Abstain
	 * Vote4.Abstain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote2#Abstain
	 * Vote2.Abstain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote5#Abstain
	 * Vote5.Abstain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#Abstain
	 * Vote7.Abstain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#Abstain
	 * Vote6.Abstain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#Abstain
	 * Vote8.Abstain}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes declared abstained for one resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Abstain = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.Abstain, com.tools20022.repository.msg.Vote4.Abstain, com.tools20022.repository.msg.Vote2.Abstain, com.tools20022.repository.msg.Vote5.Abstain,
					com.tools20022.repository.msg.Vote7.Abstain, com.tools20022.repository.msg.Vote6.Abstain, com.tools20022.repository.msg.Vote8.Abstain);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Number of votes declared abstained for one resolution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes withheld for one resolution
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#Withhold
	 * Vote1.Withhold}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#Withhold
	 * Vote4.Withhold}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote2#Withhold
	 * Vote2.Withhold}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote5#Withhold
	 * Vote5.Withhold}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#Withhold
	 * Vote7.Withhold}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#Withhold
	 * Vote6.Withhold}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#Withhold
	 * Vote8.Withhold}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes withheld for one resolution"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Withhold = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.Withhold, com.tools20022.repository.msg.Vote4.Withhold, com.tools20022.repository.msg.Vote2.Withhold, com.tools20022.repository.msg.Vote5.Withhold,
					com.tools20022.repository.msg.Vote7.Withhold, com.tools20022.repository.msg.Vote6.Withhold, com.tools20022.repository.msg.Vote8.Withhold);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withhold";
			definition = "Number of votes withheld for one resolution";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes in line with the votes of the management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#WithManagement
	 * Vote1.WithManagement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#WithManagement
	 * Vote4.WithManagement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#WithManagement
	 * Vote6.WithManagement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#WithManagement
	 * Vote8.WithManagement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in line with the votes of the management."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WithManagement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.WithManagement, com.tools20022.repository.msg.Vote4.WithManagement, com.tools20022.repository.msg.Vote6.WithManagement,
					com.tools20022.repository.msg.Vote8.WithManagement);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithManagement";
			definition = "Number of votes in line with the votes of the management.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes against the voting recommendation of the management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#AgainstManagement
	 * Vote1.AgainstManagement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#AgainstManagement
	 * Vote4.AgainstManagement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#AgainstManagement
	 * Vote6.AgainstManagement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#AgainstManagement
	 * Vote8.AgainstManagement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes against the voting recommendation of the management."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AgainstManagement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.AgainstManagement, com.tools20022.repository.msg.Vote4.AgainstManagement, com.tools20022.repository.msg.Vote6.AgainstManagement,
					com.tools20022.repository.msg.Vote8.AgainstManagement);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgainstManagement";
			definition = "Number of votes against the voting recommendation of the management.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the agenda item on which a vote is/was cast.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#CastVotes
	 * Resolution.CastVotes}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Resolution
	 * Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Resolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the agenda item on which a vote is/was cast."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Resolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Resolution";
			definition = "Specifies the agenda item on which a vote is/was cast.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Resolution.CastVotes;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of votes for which no action has been taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#NoAction
	 * Vote4.NoAction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote5#NoAction
	 * Vote5.NoAction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#NoAction
	 * Vote7.NoAction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#NoAction
	 * Vote6.NoAction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#NoAction
	 * Vote8.NoAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes for which no action has been taken."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NoAction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote4.NoAction, com.tools20022.repository.msg.Vote5.NoAction, com.tools20022.repository.msg.Vote7.NoAction, com.tools20022.repository.msg.Vote6.NoAction,
					com.tools20022.repository.msg.Vote8.NoAction);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Number of votes for which no action has been taken.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Information on the vote result for a specific resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.VoteResult#Vote
	 * VoteResult.Vote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VoteResult
	 * VoteResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the vote result for a specific resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Result = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Result";
			definition = "Information on the vote result for a specific resolution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> VoteResult.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VoteResult.Vote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of votes in favour of two years for "say on pay" type of
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#TwoYears
	 * Vote7.TwoYears}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#TwoYears
	 * Vote6.TwoYears}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#TwoYears
	 * Vote8.TwoYears}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of two years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TwoYears = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote7.TwoYears, com.tools20022.repository.msg.Vote6.TwoYears, com.tools20022.repository.msg.Vote8.TwoYears);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwoYears";
			definition = "Number of votes in favour of two years for \"say on pay\" type of resolution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes in favour for one year for "say on pay" type of
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#OneYear
	 * Vote7.OneYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#OneYear
	 * Vote6.OneYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#OneYear
	 * Vote8.OneYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour for one year for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OneYear = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote7.OneYear, com.tools20022.repository.msg.Vote6.OneYear, com.tools20022.repository.msg.Vote8.OneYear);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OneYear";
			definition = "Number of votes in favour for one year for \"say on pay\" type of resolution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Resolution withdrawn at the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#Withdrawn
	 * Vote6.Withdrawn}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resolution withdrawn at the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Withdrawn = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote6.Withdrawn);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "Resolution withdrawn at the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Number of votes in favour of three years for "say on pay" type of
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#ThreeYears
	 * Vote7.ThreeYears}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#ThreeYears
	 * Vote6.ThreeYears}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#ThreeYears
	 * Vote8.ThreeYears}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Vote Vote}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of three years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ThreeYears = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote7.ThreeYears, com.tools20022.repository.msg.Vote6.ThreeYears, com.tools20022.repository.msg.Vote8.ThreeYears);
			elementContext_lazy = () -> Vote.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThreeYears";
			definition = "Number of votes in favour of three years for \"say on pay\" type of resolution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Vote";
				definition = "Number of votes assigned to each voting option.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.Resolution.CastVotes, com.tools20022.repository.entity.VoteInstructionRequest.VotePerResolution, com.tools20022.repository.entity.VoteResult.Vote);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Vote.VoteRequest, com.tools20022.repository.entity.Vote.For, com.tools20022.repository.entity.Vote.Against, com.tools20022.repository.entity.Vote.Abstain,
						com.tools20022.repository.entity.Vote.Withhold, com.tools20022.repository.entity.Vote.WithManagement, com.tools20022.repository.entity.Vote.AgainstManagement, com.tools20022.repository.entity.Vote.Resolution,
						com.tools20022.repository.entity.Vote.NoAction, com.tools20022.repository.entity.Vote.Result, com.tools20022.repository.entity.Vote.TwoYears, com.tools20022.repository.entity.Vote.OneYear,
						com.tools20022.repository.entity.Vote.Withdrawn, com.tools20022.repository.entity.Vote.ThreeYears);
				derivationComponent_lazy = () -> Arrays.asList(Vote1.mmObject(), Vote4.mmObject(), Vote7.mmObject(), Vote6.mmObject(), Vote8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}