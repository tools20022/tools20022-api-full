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
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different voting types, channels and premium.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="VotingCondition" src="doc-files/VotingCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#SecuritiesQuantityRequiredToVote
 * VotingCondition.SecuritiesQuantityRequiredToVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#PartialVoteAllowed
 * VotingCondition.PartialVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#SplitVoteAllowed
 * VotingCondition.SplitVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#VoteLocation
 * VotingCondition.VoteLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#BeneficialOwnerDisclosure
 * VotingCondition.BeneficialOwnerDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#IncentivePremium
 * VotingCondition.IncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#VoteInstructionType
 * VotingCondition.VoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#StandingVotingInstruction
 * VotingCondition.StandingVotingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#VotingPremiumAmount
 * VotingCondition.VotingPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#VotingPremiumRate
 * VotingCondition.VotingPremiumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VotingCondition#Meeting
 * VotingCondition.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#PreviousInstructionInvalidity
 * VotingCondition.PreviousInstructionInvalidity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForVote
 * ContactPoint.ContactPointForVote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#VotingCondition
 * Meeting.VotingCondition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods VoteMethods}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters VoteParameters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters1
 * VoteParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters2
 * VoteParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2 VoteMethods2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters3
 * VoteParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters4
 * VoteParameters4}</li>
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
 * "VotingCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the different voting types, channels and premium."</li>
 * </ul>
 */
public class VotingCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of holdings required for a vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#SecuritiesQuantityRequiredToVote
	 * VoteParameters.SecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#SecuritiesQuantityRequiredToVote
	 * VoteParameters1.SecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#SecuritiesQuantityRequiredToVote
	 * VoteParameters2.SecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#SecuritiesQuantityRequiredToVote
	 * VoteParameters3.SecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#SecuritiesQuantityRequiredToVote
	 * VoteParameters4.SecuritiesQuantityRequiredToVote}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityRequiredToVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of holdings required for a vote."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesQuantityRequiredToVote = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters.SecuritiesQuantityRequiredToVote, com.tools20022.repository.msg.VoteParameters1.SecuritiesQuantityRequiredToVote,
					com.tools20022.repository.msg.VoteParameters2.SecuritiesQuantityRequiredToVote, com.tools20022.repository.msg.VoteParameters3.SecuritiesQuantityRequiredToVote,
					com.tools20022.repository.msg.VoteParameters4.SecuritiesQuantityRequiredToVote);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantityRequiredToVote";
			definition = "Number of holdings required for a vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Specifies whether it is allowed to only vote on a part of the entire
	 * entitled holding, leaving part of the position un-voted.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#PartialVoteAllowed
	 * VoteParameters.PartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#PartialVoteAllowed
	 * VoteParameters1.PartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#PartialVoteAllowed
	 * VoteParameters2.PartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#PartialVoteAllowed
	 * VoteParameters3.PartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#PartialVoteAllowed
	 * VoteParameters4.PartialVoteAllowed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is allowed to only vote on a part of the entire entitled holding, leaving part of the position un-voted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialVoteAllowed = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters.PartialVoteAllowed, com.tools20022.repository.msg.VoteParameters1.PartialVoteAllowed,
					com.tools20022.repository.msg.VoteParameters2.PartialVoteAllowed, com.tools20022.repository.msg.VoteParameters3.PartialVoteAllowed, com.tools20022.repository.msg.VoteParameters4.PartialVoteAllowed);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialVoteAllowed";
			definition = "Specifies whether it is allowed to only vote on a part of the entire entitled holding, leaving part of the position un-voted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the option to give a split instruction, for example, a
	 * split voting instruction on a meeting, is allowed.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#SplitVoteAllowed
	 * VoteParameters.SplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#SplitVoteAllowed
	 * VoteParameters1.SplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#SplitVoteAllowed
	 * VoteParameters2.SplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#SplitVoteAllowed
	 * VoteParameters3.SplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#SplitVoteAllowed
	 * VoteParameters4.SplitVoteAllowed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the option to give a split instruction, for example, a split voting instruction on a meeting, is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SplitVoteAllowed = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters.SplitVoteAllowed, com.tools20022.repository.msg.VoteParameters1.SplitVoteAllowed,
					com.tools20022.repository.msg.VoteParameters2.SplitVoteAllowed, com.tools20022.repository.msg.VoteParameters3.SplitVoteAllowed, com.tools20022.repository.msg.VoteParameters4.SplitVoteAllowed);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitVoteAllowed";
			definition = "Indicates that the option to give a split instruction, for example, a split voting instruction on a meeting, is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Electronic address, e-mail or website where a voting ballot can be
	 * obtained and/or where a security holder can vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForVote
	 * ContactPoint.ContactPointForVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteMethods#VoteThroughNetwork
	 * VoteMethods.VoteThroughNetwork}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters#VoteMethods
	 * VoteParameters.VoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteMethods
	 * VoteParameters1.VoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteMethods
	 * VoteParameters2.VoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteMethods2#VoteThroughNetwork
	 * VoteMethods2.VoteThroughNetwork}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteMethods
	 * VoteParameters3.VoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteMethods
	 * VoteParameters4.VoteMethods}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic address, e-mail or website where a voting ballot can be obtained and/or where a security holder can vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VoteLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteMethods.VoteThroughNetwork, com.tools20022.repository.msg.VoteParameters.VoteMethods, com.tools20022.repository.msg.VoteParameters1.VoteMethods,
					com.tools20022.repository.msg.VoteParameters2.VoteMethods, com.tools20022.repository.msg.VoteMethods2.VoteThroughNetwork, com.tools20022.repository.msg.VoteParameters3.VoteMethods,
					com.tools20022.repository.msg.VoteParameters4.VoteMethods);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteLocation";
			definition = "Electronic address, e-mail or website where a voting ballot can be obtained and/or where a security holder can vote.";
			minOccurs = 1;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.ContactPointForVote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether beneficiary details (eg name and address) must be
	 * supplied in order to take part to a meeting.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#BeneficialOwnerDisclosure
	 * VoteParameters.BeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#BeneficialOwnerDisclosure
	 * VoteParameters1.BeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#BeneficialOwnerDisclosure
	 * VoteParameters2.BeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#BeneficialOwnerDisclosure
	 * VoteParameters3.BeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#BeneficialOwnerDisclosure
	 * VoteParameters4.BeneficialOwnerDisclosure}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDisclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether beneficiary details (eg name and address) must be supplied in order to take part to a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficialOwnerDisclosure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters.BeneficialOwnerDisclosure, com.tools20022.repository.msg.VoteParameters1.BeneficialOwnerDisclosure,
					com.tools20022.repository.msg.VoteParameters2.BeneficialOwnerDisclosure, com.tools20022.repository.msg.VoteParameters3.BeneficialOwnerDisclosure, com.tools20022.repository.msg.VoteParameters4.BeneficialOwnerDisclosure);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerDisclosure";
			definition = "Indicates whether beneficiary details (eg name and address) must be supplied in order to take part to a meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#IncentivePremium
	 * VoteParameters.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#IncentivePremium
	 * VoteParameters1.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#IncentivePremium
	 * VoteParameters2.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#IncentivePremium
	 * VoteParameters3.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#EarlyIncentivePremium
	 * VoteParameters4.EarlyIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#IncentivePremium
	 * VoteParameters4.IncentivePremium}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available if the securities holder consents or participates to an event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncentivePremium = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters.IncentivePremium, com.tools20022.repository.msg.VoteParameters1.IncentivePremium,
					com.tools20022.repository.msg.VoteParameters2.IncentivePremium, com.tools20022.repository.msg.VoteParameters3.IncentivePremium, com.tools20022.repository.msg.VoteParameters4.EarlyIncentivePremium,
					com.tools20022.repository.msg.VoteParameters4.IncentivePremium);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available if the securities holder consents or participates to an event.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}
	};
	/**
	 * Identifies the possible types of voting instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#VoteInstructionType
	 * VoteParameters.VoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteInstructionType
	 * VoteParameters1.VoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteInstructionType
	 * VoteParameters2.VoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteInstructionType
	 * VoteParameters3.VoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteInstructionType
	 * VoteParameters4.VoteInstructionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the possible types of voting instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VoteInstructionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters.VoteInstructionType, com.tools20022.repository.msg.VoteParameters1.VoteInstructionType,
					com.tools20022.repository.msg.VoteParameters2.VoteInstructionType, com.tools20022.repository.msg.VoteParameters3.VoteInstructionType, com.tools20022.repository.msg.VoteParameters4.VoteInstructionType);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteInstructionType";
			definition = "Identifies the possible types of voting instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates whether standing instructions have been defined or not. In this
	 * case, the intermediary should cast the votes according to these
	 * instructions.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction1#StandingInstruction
	 * VoteInstruction1.StandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#StandingInstruction
	 * DetailedInstructionStatus2.StandingInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingVotingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether standing instructions have been defined or not. In this case, the intermediary should cast the votes according to these instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StandingVotingInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteInstruction1.StandingInstruction, com.tools20022.repository.msg.DetailedInstructionStatus2.StandingInstruction);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingVotingInstruction";
			definition = "Indicates whether standing instructions have been defined or not. In this case, the intermediary should cast the votes according to these instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of additional weight applied to the votes of long term
	 * shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingPremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of additional weight applied to the votes of long term shareholders."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VotingPremiumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingPremiumAmount";
			definition = "Amount of additional weight applied to the votes of long term shareholders.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate of additional weight applied to the votes of long term shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingPremiumRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of additional weight applied to the votes of long term shareholders."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VotingPremiumRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingPremiumRate";
			definition = "Rate of additional weight applied to the votes of long term shareholders.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Meeting for which voting conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#VotingCondition
	 * Meeting.VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which voting conditions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which voting conditions are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.VotingCondition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the previously sent instructions becomes invalid after
	 * a market deadline extension.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#PreviousInstructionInvalidityIndicator
	 * VoteParameters4.PreviousInstructionInvalidityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructionInvalidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the previously sent instructions becomes invalid after a market deadline extension."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreviousInstructionInvalidity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters4.PreviousInstructionInvalidityIndicator);
			elementContext_lazy = () -> VotingCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousInstructionInvalidity";
			definition = "Indicates whether the previously sent instructions becomes invalid after a market deadline extension.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VotingCondition";
				definition = "Specifies the different voting types, channels and premium.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.ContactPointForVote, com.tools20022.repository.entity.Meeting.VotingCondition);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VotingCondition.SecuritiesQuantityRequiredToVote, com.tools20022.repository.entity.VotingCondition.PartialVoteAllowed,
						com.tools20022.repository.entity.VotingCondition.SplitVoteAllowed, com.tools20022.repository.entity.VotingCondition.VoteLocation, com.tools20022.repository.entity.VotingCondition.BeneficialOwnerDisclosure,
						com.tools20022.repository.entity.VotingCondition.IncentivePremium, com.tools20022.repository.entity.VotingCondition.VoteInstructionType, com.tools20022.repository.entity.VotingCondition.StandingVotingInstruction,
						com.tools20022.repository.entity.VotingCondition.VotingPremiumAmount, com.tools20022.repository.entity.VotingCondition.VotingPremiumRate, com.tools20022.repository.entity.VotingCondition.Meeting,
						com.tools20022.repository.entity.VotingCondition.PreviousInstructionInvalidity);
				derivationComponent_lazy = () -> Arrays.asList(VoteMethods.mmObject(), VoteParameters.mmObject(), VoteParameters1.mmObject(), VoteParameters2.mmObject(), VoteMethods2.mmObject(), VoteParameters3.mmObject(),
						VoteParameters4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}