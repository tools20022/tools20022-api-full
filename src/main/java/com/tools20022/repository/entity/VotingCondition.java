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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmSecuritiesQuantityRequiredToVote
 * VotingCondition.mmSecuritiesQuantityRequiredToVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmPartialVoteAllowed
 * VotingCondition.mmPartialVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmSplitVoteAllowed
 * VotingCondition.mmSplitVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteLocation
 * VotingCondition.mmVoteLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmBeneficialOwnerDisclosure
 * VotingCondition.mmBeneficialOwnerDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmIncentivePremium
 * VotingCondition.mmIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteInstructionType
 * VotingCondition.mmVoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmStandingVotingInstruction
 * VotingCondition.mmStandingVotingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVotingPremiumAmount
 * VotingCondition.mmVotingPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVotingPremiumRate
 * VotingCondition.mmVotingPremiumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VotingCondition#mmMeeting
 * VotingCondition.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmPreviousInstructionInvalidity
 * VotingCondition.mmPreviousInstructionInvalidity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForVote
 * ContactPoint.mmContactPointForVote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmVotingCondition
 * Meeting.mmVotingCondition}</li>
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
	protected DecimalNumber securitiesQuantityRequiredToVote;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmSecuritiesQuantityRequiredToVote
	 * VoteParameters.mmSecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmSecuritiesQuantityRequiredToVote
	 * VoteParameters1.mmSecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmSecuritiesQuantityRequiredToVote
	 * VoteParameters2.mmSecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmSecuritiesQuantityRequiredToVote
	 * VoteParameters3.mmSecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmSecuritiesQuantityRequiredToVote
	 * VoteParameters4.mmSecuritiesQuantityRequiredToVote}</li>
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
	public static final MMBusinessAttribute mmSecuritiesQuantityRequiredToVote = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteParameters.mmSecuritiesQuantityRequiredToVote, VoteParameters1.mmSecuritiesQuantityRequiredToVote, VoteParameters2.mmSecuritiesQuantityRequiredToVote,
					VoteParameters3.mmSecuritiesQuantityRequiredToVote, VoteParameters4.mmSecuritiesQuantityRequiredToVote);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantityRequiredToVote";
			definition = "Number of holdings required for a vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getSecuritiesQuantityRequiredToVote", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator partialVoteAllowed;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmPartialVoteAllowed
	 * VoteParameters.mmPartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmPartialVoteAllowed
	 * VoteParameters1.mmPartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmPartialVoteAllowed
	 * VoteParameters2.mmPartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmPartialVoteAllowed
	 * VoteParameters3.mmPartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmPartialVoteAllowed
	 * VoteParameters4.mmPartialVoteAllowed}</li>
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
	public static final MMBusinessAttribute mmPartialVoteAllowed = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteParameters.mmPartialVoteAllowed, VoteParameters1.mmPartialVoteAllowed, VoteParameters2.mmPartialVoteAllowed, VoteParameters3.mmPartialVoteAllowed, VoteParameters4.mmPartialVoteAllowed);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialVoteAllowed";
			definition = "Specifies whether it is allowed to only vote on a part of the entire entitled holding, leaving part of the position un-voted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getPartialVoteAllowed", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator splitVoteAllowed;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmSplitVoteAllowed
	 * VoteParameters.mmSplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmSplitVoteAllowed
	 * VoteParameters1.mmSplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmSplitVoteAllowed
	 * VoteParameters2.mmSplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmSplitVoteAllowed
	 * VoteParameters3.mmSplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmSplitVoteAllowed
	 * VoteParameters4.mmSplitVoteAllowed}</li>
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
	public static final MMBusinessAttribute mmSplitVoteAllowed = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteParameters.mmSplitVoteAllowed, VoteParameters1.mmSplitVoteAllowed, VoteParameters2.mmSplitVoteAllowed, VoteParameters3.mmSplitVoteAllowed, VoteParameters4.mmSplitVoteAllowed);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitVoteAllowed";
			definition = "Indicates that the option to give a split instruction, for example, a split voting instruction on a meeting, is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getSplitVoteAllowed", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> voteLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForVote
	 * ContactPoint.mmContactPointForVote}</li>
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
	 * {@linkplain com.tools20022.repository.msg.VoteMethods#mmVoteThroughNetwork
	 * VoteMethods.mmVoteThroughNetwork}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteMethods
	 * VoteParameters.mmVoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteMethods
	 * VoteParameters1.mmVoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteMethods
	 * VoteParameters2.mmVoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteMethods2#mmVoteThroughNetwork
	 * VoteMethods2.mmVoteThroughNetwork}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteMethods
	 * VoteParameters3.mmVoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteMethods
	 * VoteParameters4.mmVoteMethods}</li>
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
	public static final MMBusinessAssociationEnd mmVoteLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(VoteMethods.mmVoteThroughNetwork, VoteParameters.mmVoteMethods, VoteParameters1.mmVoteMethods, VoteParameters2.mmVoteMethods, VoteMethods2.mmVoteThroughNetwork,
					VoteParameters3.mmVoteMethods, VoteParameters4.mmVoteMethods);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteLocation";
			definition = "Electronic address, e-mail or website where a voting ballot can be obtained and/or where a security holder can vote.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmContactPointForVote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected YesNoIndicator beneficialOwnerDisclosure;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmBeneficialOwnerDisclosure
	 * VoteParameters.mmBeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmBeneficialOwnerDisclosure
	 * VoteParameters1.mmBeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmBeneficialOwnerDisclosure
	 * VoteParameters2.mmBeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmBeneficialOwnerDisclosure
	 * VoteParameters3.mmBeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmBeneficialOwnerDisclosure
	 * VoteParameters4.mmBeneficialOwnerDisclosure}</li>
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
	public static final MMBusinessAttribute mmBeneficialOwnerDisclosure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteParameters.mmBeneficialOwnerDisclosure, VoteParameters1.mmBeneficialOwnerDisclosure, VoteParameters2.mmBeneficialOwnerDisclosure, VoteParameters3.mmBeneficialOwnerDisclosure,
					VoteParameters4.mmBeneficialOwnerDisclosure);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerDisclosure";
			definition = "Indicates whether beneficiary details (eg name and address) must be supplied in order to take part to a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getBeneficialOwnerDisclosure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected IncentivePremium incentivePremium;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmIncentivePremium
	 * VoteParameters.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmIncentivePremium
	 * VoteParameters1.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmIncentivePremium
	 * VoteParameters2.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmIncentivePremium
	 * VoteParameters3.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmEarlyIncentivePremium
	 * VoteParameters4.mmEarlyIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmIncentivePremium
	 * VoteParameters4.mmIncentivePremium}</li>
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
	public static final MMBusinessAttribute mmIncentivePremium = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteParameters.mmIncentivePremium, VoteParameters1.mmIncentivePremium, VoteParameters2.mmIncentivePremium, VoteParameters3.mmIncentivePremium, VoteParameters4.mmEarlyIncentivePremium,
					VoteParameters4.mmIncentivePremium);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available if the securities holder consents or participates to an event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getIncentivePremium", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected VoteInstructionCode voteInstructionType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteInstructionType
	 * VoteParameters.mmVoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteInstructionType
	 * VoteParameters1.mmVoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteInstructionType
	 * VoteParameters2.mmVoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteInstructionType
	 * VoteParameters3.mmVoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteInstructionType
	 * VoteParameters4.mmVoteInstructionType}</li>
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
	public static final MMBusinessAttribute mmVoteInstructionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteParameters.mmVoteInstructionType, VoteParameters1.mmVoteInstructionType, VoteParameters2.mmVoteInstructionType, VoteParameters3.mmVoteInstructionType,
					VoteParameters4.mmVoteInstructionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteInstructionType";
			definition = "Identifies the possible types of voting instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getVoteInstructionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator standingVotingInstruction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction1#mmStandingInstruction
	 * VoteInstruction1.mmStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#mmStandingInstruction
	 * DetailedInstructionStatus2.mmStandingInstruction}</li>
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
	public static final MMBusinessAttribute mmStandingVotingInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteInstruction1.mmStandingInstruction, DetailedInstructionStatus2.mmStandingInstruction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingVotingInstruction";
			definition = "Indicates whether standing instructions have been defined or not. In this case, the intermediary should cast the votes according to these instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getStandingVotingInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount votingPremiumAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmVotingPremiumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotingPremiumAmount";
			definition = "Amount of additional weight applied to the votes of long term shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getVotingPremiumAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate votingPremiumRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmVotingPremiumRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotingPremiumRate";
			definition = "Rate of additional weight applied to the votes of long term shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getVotingPremiumRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Meeting meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmVotingCondition
	 * Meeting.mmVotingCondition}</li>
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
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which voting conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmVotingCondition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected YesNoIndicator previousInstructionInvalidity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmPreviousInstructionInvalidityIndicator
	 * VoteParameters4.mmPreviousInstructionInvalidityIndicator}</li>
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
	public static final MMBusinessAttribute mmPreviousInstructionInvalidity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VoteParameters4.mmPreviousInstructionInvalidityIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousInstructionInvalidity";
			definition = "Indicates whether the previously sent instructions becomes invalid after a market deadline extension.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VotingCondition.class.getMethod("getPreviousInstructionInvalidity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VotingCondition";
				definition = "Specifies the different voting types, channels and premium.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmContactPointForVote, com.tools20022.repository.entity.Meeting.mmVotingCondition);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VotingCondition.mmSecuritiesQuantityRequiredToVote, com.tools20022.repository.entity.VotingCondition.mmPartialVoteAllowed,
						com.tools20022.repository.entity.VotingCondition.mmSplitVoteAllowed, com.tools20022.repository.entity.VotingCondition.mmVoteLocation, com.tools20022.repository.entity.VotingCondition.mmBeneficialOwnerDisclosure,
						com.tools20022.repository.entity.VotingCondition.mmIncentivePremium, com.tools20022.repository.entity.VotingCondition.mmVoteInstructionType,
						com.tools20022.repository.entity.VotingCondition.mmStandingVotingInstruction, com.tools20022.repository.entity.VotingCondition.mmVotingPremiumAmount,
						com.tools20022.repository.entity.VotingCondition.mmVotingPremiumRate, com.tools20022.repository.entity.VotingCondition.mmMeeting, com.tools20022.repository.entity.VotingCondition.mmPreviousInstructionInvalidity);
				derivationComponent_lazy = () -> Arrays.asList(VoteMethods.mmObject(), VoteParameters.mmObject(), VoteParameters1.mmObject(), VoteParameters2.mmObject(), VoteMethods2.mmObject(), VoteParameters3.mmObject(),
						VoteParameters4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return VotingCondition.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getSecuritiesQuantityRequiredToVote() {
		return securitiesQuantityRequiredToVote;
	}

	public VotingCondition setSecuritiesQuantityRequiredToVote(DecimalNumber securitiesQuantityRequiredToVote) {
		this.securitiesQuantityRequiredToVote = Objects.requireNonNull(securitiesQuantityRequiredToVote);
		return this;
	}

	public YesNoIndicator getPartialVoteAllowed() {
		return partialVoteAllowed;
	}

	public VotingCondition setPartialVoteAllowed(YesNoIndicator partialVoteAllowed) {
		this.partialVoteAllowed = Objects.requireNonNull(partialVoteAllowed);
		return this;
	}

	public YesNoIndicator getSplitVoteAllowed() {
		return splitVoteAllowed;
	}

	public VotingCondition setSplitVoteAllowed(YesNoIndicator splitVoteAllowed) {
		this.splitVoteAllowed = Objects.requireNonNull(splitVoteAllowed);
		return this;
	}

	public List<ContactPoint> getVoteLocation() {
		return voteLocation == null ? voteLocation = new ArrayList<>() : voteLocation;
	}

	public VotingCondition setVoteLocation(List<com.tools20022.repository.entity.ContactPoint> voteLocation) {
		this.voteLocation = Objects.requireNonNull(voteLocation);
		return this;
	}

	public YesNoIndicator getBeneficialOwnerDisclosure() {
		return beneficialOwnerDisclosure;
	}

	public VotingCondition setBeneficialOwnerDisclosure(YesNoIndicator beneficialOwnerDisclosure) {
		this.beneficialOwnerDisclosure = Objects.requireNonNull(beneficialOwnerDisclosure);
		return this;
	}

	public IncentivePremium getIncentivePremium() {
		return incentivePremium;
	}

	public VotingCondition setIncentivePremium(com.tools20022.repository.entity.IncentivePremium incentivePremium) {
		this.incentivePremium = Objects.requireNonNull(incentivePremium);
		return this;
	}

	public VoteInstructionCode getVoteInstructionType() {
		return voteInstructionType;
	}

	public VotingCondition setVoteInstructionType(VoteInstructionCode voteInstructionType) {
		this.voteInstructionType = Objects.requireNonNull(voteInstructionType);
		return this;
	}

	public YesNoIndicator getStandingVotingInstruction() {
		return standingVotingInstruction;
	}

	public VotingCondition setStandingVotingInstruction(YesNoIndicator standingVotingInstruction) {
		this.standingVotingInstruction = Objects.requireNonNull(standingVotingInstruction);
		return this;
	}

	public CurrencyAndAmount getVotingPremiumAmount() {
		return votingPremiumAmount;
	}

	public VotingCondition setVotingPremiumAmount(CurrencyAndAmount votingPremiumAmount) {
		this.votingPremiumAmount = Objects.requireNonNull(votingPremiumAmount);
		return this;
	}

	public PercentageRate getVotingPremiumRate() {
		return votingPremiumRate;
	}

	public VotingCondition setVotingPremiumRate(PercentageRate votingPremiumRate) {
		this.votingPremiumRate = Objects.requireNonNull(votingPremiumRate);
		return this;
	}

	public Optional<Meeting> getMeeting() {
		return meeting == null ? Optional.empty() : Optional.of(meeting);
	}

	public VotingCondition setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
		return this;
	}

	public YesNoIndicator getPreviousInstructionInvalidity() {
		return previousInstructionInvalidity;
	}

	public VotingCondition setPreviousInstructionInvalidity(YesNoIndicator previousInstructionInvalidity) {
		this.previousInstructionInvalidity = Objects.requireNonNull(previousInstructionInvalidity);
		return this;
	}
}