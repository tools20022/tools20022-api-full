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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.MeetingNotificationV05;
import com.tools20022.repository.choice.DateFormat29Choice;
import com.tools20022.repository.codeset.VoteInstruction2Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.entity.VotingCondition;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information describing how the voting process is organised.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmSecuritiesQuantityRequiredToVote
 * VoteParameters4.mmSecuritiesQuantityRequiredToVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmPartialVoteAllowed
 * VoteParameters4.mmPartialVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmSplitVoteAllowed
 * VoteParameters4.mmSplitVoteAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteDeadline
 * VoteParameters4.mmVoteDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteSTPDeadline
 * VoteParameters4.mmVoteSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteMarketDeadline
 * VoteParameters4.mmVoteMarketDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteMethods
 * VoteParameters4.mmVoteMethods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVotingBallotElectronicAddress
 * VoteParameters4.mmVotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVotingBallotRequestAddress
 * VoteParameters4.mmVotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityDeadline
 * VoteParameters4.mmRevocabilityDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilitySTPDeadline
 * VoteParameters4.mmRevocabilitySTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityMarketDeadline
 * VoteParameters4.mmRevocabilityMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmBeneficialOwnerDisclosure
 * VoteParameters4.mmBeneficialOwnerDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteInstructionType
 * VoteParameters4.mmVoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmEarlyIncentivePremium
 * VoteParameters4.mmEarlyIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmIncentivePremium
 * VoteParameters4.mmIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmEarlyVoteWithPremiumDeadline
 * VoteParameters4.mmEarlyVoteWithPremiumDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumDeadline
 * VoteParameters4.mmVoteWithPremiumDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumSTPDeadline
 * VoteParameters4.mmVoteWithPremiumSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumMarketDeadline
 * VoteParameters4.mmVoteWithPremiumMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmAdditionalVotingRequirements
 * VoteParameters4.mmAdditionalVotingRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmPreviousInstructionInvalidityIndicator
 * VoteParameters4.mmPreviousInstructionInvalidityIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VotingCondition
 * VotingCondition}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmVote
 * MeetingNotificationV05.mmVote}</li>
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
 * "VoteParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information describing how the voting process is organised."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.VoteParameters3
 * VoteParameters3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VoteParameters4", propOrder = {"securitiesQuantityRequiredToVote", "partialVoteAllowed", "splitVoteAllowed", "voteDeadline", "voteSTPDeadline", "voteMarketDeadline", "voteMethods", "votingBallotElectronicAddress",
		"votingBallotRequestAddress", "revocabilityDeadline", "revocabilitySTPDeadline", "revocabilityMarketDeadline", "beneficialOwnerDisclosure", "voteInstructionType", "earlyIncentivePremium", "incentivePremium",
		"earlyVoteWithPremiumDeadline", "voteWithPremiumDeadline", "voteWithPremiumSTPDeadline", "voteWithPremiumMarketDeadline", "additionalVotingRequirements", "previousInstructionInvalidityIndicator"})
public class VoteParameters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesQtyReqrdToVote")
	protected DecimalNumber securitiesQuantityRequiredToVote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmSecuritiesQuantityRequiredToVote
	 * VotingCondition.mmSecuritiesQuantityRequiredToVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQtyReqrdToVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityRequiredToVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of holdings required for a vote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmSecuritiesQuantityRequiredToVote
	 * VoteParameters3.mmSecuritiesQuantityRequiredToVote}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesQuantityRequiredToVote = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmSecuritiesQuantityRequiredToVote;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyReqrdToVote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityRequiredToVote";
			definition = "Number of holdings required for a vote.";
			previousVersion_lazy = () -> VoteParameters3.mmSecuritiesQuantityRequiredToVote;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PrtlVoteAllwd", required = true)
	protected YesNoIndicator partialVoteAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmPartialVoteAllowed
	 * VotingCondition.mmPartialVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlVoteAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is allowed to only vote on a part of the entire holding, leaving part of the position un-voted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmPartialVoteAllowed
	 * VoteParameters3.mmPartialVoteAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialVoteAllowed = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmPartialVoteAllowed;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "PrtlVoteAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteAllowed";
			definition = "Specifies whether it is allowed to only vote on a part of the entire holding, leaving part of the position un-voted.";
			previousVersion_lazy = () -> VoteParameters3.mmPartialVoteAllowed;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SpltVoteAllwd", required = true)
	protected YesNoIndicator splitVoteAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmSplitVoteAllowed
	 * VotingCondition.mmSplitVoteAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltVoteAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is allowed to vote in different directions for the entire holding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmSplitVoteAllowed
	 * VoteParameters3.mmSplitVoteAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitVoteAllowed = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmSplitVoteAllowed;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "SpltVoteAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteAllowed";
			definition = "Specifies whether it is allowed to vote in different directions for the entire holding.";
			previousVersion_lazy = () -> VoteParameters3.mmSplitVoteAllowed;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "VoteDdln")
	protected DateFormat29Choice voteDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteDeadline
	 * VoteParameters3.mmVoteDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary.";
			previousVersion_lazy = () -> VoteParameters3.mmVoteDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteSTPDdln")
	protected DateFormat29Choice voteSTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary (STP mode)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteSTPDeadline
	 * VoteParameters3.mmVoteSTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteSTPDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary (STP mode).";
			previousVersion_lazy = () -> VoteParameters3.mmVoteSTPDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteMktDdln")
	protected DateFormat29Choice voteMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteMarketDeadline
	 * VoteParameters3.mmVoteMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteMarketDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the issuer.";
			previousVersion_lazy = () -> VoteParameters3.mmVoteMarketDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteMthds")
	protected VoteMethods2 voteMethods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VoteMethods2
	 * VoteMethods2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteLocation
	 * VotingCondition.mmVoteLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteMthds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteMethods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the different methods that can be used to vote."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteMethods
	 * VoteParameters3.mmVoteMethods}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteMethods = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmVoteLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteMthds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteMethods";
			definition = "Indicates the different methods that can be used to vote.";
			previousVersion_lazy = () -> VoteParameters3.mmVoteMethods;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VoteMethods2.mmObject();
		}
	};
	@XmlElement(name = "VtngBlltElctrncAdr")
	protected CommunicationAddress4 votingBallotElectronicAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress4
	 * CommunicationAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngBlltElctrncAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingBallotElectronicAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic location, e-mail or URL address, where the voting ballot can be requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVotingBallotElectronicAddress
	 * VoteParameters3.mmVotingBallotElectronicAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVotingBallotElectronicAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VtngBlltElctrncAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingBallotElectronicAddress";
			definition = "Electronic location, e-mail or URL address, where the voting ballot can be requested.";
			previousVersion_lazy = () -> VoteParameters3.mmVotingBallotElectronicAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationAddress4.mmObject();
		}
	};
	@XmlElement(name = "VtngBlltReqAdr")
	protected PostalAddress1 votingBallotRequestAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngBlltReqAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingBallotRequestAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the postal address where the voting ballot can be requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVotingBallotRequestAddress
	 * VoteParameters3.mmVotingBallotRequestAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVotingBallotRequestAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VtngBlltReqAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingBallotRequestAddress";
			definition = "Specifies the postal address where the voting ballot can be requested.";
			previousVersion_lazy = () -> VoteParameters3.mmVotingBallotRequestAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};
	@XmlElement(name = "RvcbltyDdln")
	protected DateFormat29Choice revocabilityDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilityDeadline
	 * VoteParameters3.mmRevocabilityDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRevocabilityDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary.";
			previousVersion_lazy = () -> VoteParameters3.mmRevocabilityDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "RvcbltySTPDdln")
	protected DateFormat29Choice revocabilitySTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltySTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilitySTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary (STP mode)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilitySTPDeadline
	 * VoteParameters3.mmRevocabilitySTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRevocabilitySTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "RvcbltySTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilitySTPDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary (STP mode).";
			previousVersion_lazy = () -> VoteParameters3.mmRevocabilitySTPDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "RvcbltyMktDdln")
	protected DateFormat29Choice revocabilityMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltyMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is set by the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilityMarketDeadline
	 * VoteParameters3.mmRevocabilityMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRevocabilityMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityMarketDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is set by the issuer.";
			previousVersion_lazy = () -> VoteParameters3.mmRevocabilityMarketDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "BnfclOwnrDsclsr", required = true)
	protected YesNoIndicator beneficialOwnerDisclosure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmBeneficialOwnerDisclosure
	 * VotingCondition.mmBeneficialOwnerDisclosure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrDsclsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDisclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether beneficiary details, for example, name and address, must be supplied in order to take part in a meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmBeneficialOwnerDisclosure
	 * VoteParameters3.mmBeneficialOwnerDisclosure}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBeneficialOwnerDisclosure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmBeneficialOwnerDisclosure;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrDsclsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDisclosure";
			definition = "Indicates whether beneficiary details, for example, name and address, must be supplied in order to take part in a meeting.";
			previousVersion_lazy = () -> VoteParameters3.mmBeneficialOwnerDisclosure;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "VoteInstrTp")
	protected List<VoteInstruction2Code> voteInstructionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction2Code
	 * VoteInstruction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteInstructionType
	 * VotingCondition.mmVoteInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the possible types of voting instructions. When used at the resolution level, it supersedes the value specified in the meeting notice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteInstructionType
	 * VoteParameters3.mmVoteInstructionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteInstructionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmVoteInstructionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType";
			definition = "Identifies the possible types of voting instructions. When used at the resolution level, it supersedes the value specified in the meeting notice.";
			previousVersion_lazy = () -> VoteParameters3.mmVoteInstructionType;
			maxOccurs = 8;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction2Code.mmObject();
		}
	};
	@XmlElement(name = "EarlyIncntivPrm")
	protected IncentivePremium3 earlyIncentivePremium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmIncentivePremium
	 * VotingCondition.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyIncntivPrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyIncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium paid to the security holder when voting earlier (before the early vote with premium deadline)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyIncentivePremium = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmIncentivePremium;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "EarlyIncntivPrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyIncentivePremium";
			definition = "Cash premium paid to the security holder when voting earlier (before the early vote with premium deadline).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IncentivePremium3.mmObject();
		}
	};
	@XmlElement(name = "IncntivPrm")
	protected IncentivePremium3 incentivePremium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IncentivePremium3
	 * IncentivePremium3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmIncentivePremium
	 * VotingCondition.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncntivPrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash premium paid to the security holder when voting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmIncentivePremium
	 * VoteParameters3.mmIncentivePremium}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncentivePremium = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmIncentivePremium;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "IncntivPrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium paid to the security holder when voting.";
			previousVersion_lazy = () -> VoteParameters3.mmIncentivePremium;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IncentivePremium3.mmObject();
		}
	};
	@XmlElement(name = "EarlyVoteWthPrmDdln")
	protected DateFormat29Choice earlyVoteWithPremiumDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyVoteWthPrmDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyVoteWithPremiumDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the early incentive premium."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyVoteWithPremiumDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "EarlyVoteWthPrmDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyVoteWithPremiumDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the early incentive premium.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteWthPrmDdln")
	protected DateFormat29Choice voteWithPremiumDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteWthPrmDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithPremiumDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumDeadline
	 * VoteParameters3.mmVoteWithPremiumDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteWithPremiumDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteWthPrmDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium.";
			previousVersion_lazy = () -> VoteParameters3.mmVoteWithPremiumDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteWthPrmSTPDdln")
	protected DateFormat29Choice voteWithPremiumSTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteWthPrmSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithPremiumSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium (STP mode)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumSTPDeadline
	 * VoteParameters3.mmVoteWithPremiumSTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteWithPremiumSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteWthPrmSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumSTPDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium (STP mode).";
			previousVersion_lazy = () -> VoteParameters3.mmVoteWithPremiumSTPDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteWthPrmMktDdln")
	protected DateFormat29Choice voteWithPremiumMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteWthPrmMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithPremiumMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the vote instructions should be submitted to the issuer to take advantage of the premium."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumMarketDeadline
	 * VoteParameters3.mmVoteWithPremiumMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteWithPremiumMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "VoteWthPrmMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumMarketDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the issuer to take advantage of the premium.";
			previousVersion_lazy = () -> VoteParameters3.mmVoteWithPremiumMarketDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlVtngRqrmnts")
	protected Max350Text additionalVotingRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlVtngRqrmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalVotingRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on specific requirements for allowing a person to vote."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmAdditionalVotingRequirements
	 * VoteParameters3.mmAdditionalVotingRequirements}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalVotingRequirements = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "AddtlVtngRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalVotingRequirements";
			definition = "Additional information on specific requirements for allowing a person to vote.";
			previousVersion_lazy = () -> VoteParameters3.mmAdditionalVotingRequirements;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PrvsInstrInvldtyInd")
	protected YesNoIndicator previousInstructionInvalidityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmPreviousInstructionInvalidity
	 * VotingCondition.mmPreviousInstructionInvalidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsInstrInvldtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructionInvalidityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the previously sent instructions becomes invalid after a market deadline extension."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousInstructionInvalidityIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmPreviousInstructionInvalidity;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters4.mmObject();
			isDerived = false;
			xmlTag = "PrvsInstrInvldtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructionInvalidityIndicator";
			definition = "Indicates whether the previously sent instructions becomes invalid after a market deadline extension.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters4.mmSecuritiesQuantityRequiredToVote, com.tools20022.repository.msg.VoteParameters4.mmPartialVoteAllowed,
						com.tools20022.repository.msg.VoteParameters4.mmSplitVoteAllowed, com.tools20022.repository.msg.VoteParameters4.mmVoteDeadline, com.tools20022.repository.msg.VoteParameters4.mmVoteSTPDeadline,
						com.tools20022.repository.msg.VoteParameters4.mmVoteMarketDeadline, com.tools20022.repository.msg.VoteParameters4.mmVoteMethods, com.tools20022.repository.msg.VoteParameters4.mmVotingBallotElectronicAddress,
						com.tools20022.repository.msg.VoteParameters4.mmVotingBallotRequestAddress, com.tools20022.repository.msg.VoteParameters4.mmRevocabilityDeadline,
						com.tools20022.repository.msg.VoteParameters4.mmRevocabilitySTPDeadline, com.tools20022.repository.msg.VoteParameters4.mmRevocabilityMarketDeadline,
						com.tools20022.repository.msg.VoteParameters4.mmBeneficialOwnerDisclosure, com.tools20022.repository.msg.VoteParameters4.mmVoteInstructionType, com.tools20022.repository.msg.VoteParameters4.mmEarlyIncentivePremium,
						com.tools20022.repository.msg.VoteParameters4.mmIncentivePremium, com.tools20022.repository.msg.VoteParameters4.mmEarlyVoteWithPremiumDeadline,
						com.tools20022.repository.msg.VoteParameters4.mmVoteWithPremiumDeadline, com.tools20022.repository.msg.VoteParameters4.mmVoteWithPremiumSTPDeadline,
						com.tools20022.repository.msg.VoteParameters4.mmVoteWithPremiumMarketDeadline, com.tools20022.repository.msg.VoteParameters4.mmAdditionalVotingRequirements,
						com.tools20022.repository.msg.VoteParameters4.mmPreviousInstructionInvalidityIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV05.mmVote);
				trace_lazy = () -> VotingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteParameters4";
				definition = "Information describing how the voting process is organised.";
				previousVersion_lazy = () -> VoteParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DecimalNumber> getSecuritiesQuantityRequiredToVote() {
		return securitiesQuantityRequiredToVote == null ? Optional.empty() : Optional.of(securitiesQuantityRequiredToVote);
	}

	public VoteParameters4 setSecuritiesQuantityRequiredToVote(DecimalNumber securitiesQuantityRequiredToVote) {
		this.securitiesQuantityRequiredToVote = securitiesQuantityRequiredToVote;
		return this;
	}

	public YesNoIndicator getPartialVoteAllowed() {
		return partialVoteAllowed;
	}

	public VoteParameters4 setPartialVoteAllowed(YesNoIndicator partialVoteAllowed) {
		this.partialVoteAllowed = Objects.requireNonNull(partialVoteAllowed);
		return this;
	}

	public YesNoIndicator getSplitVoteAllowed() {
		return splitVoteAllowed;
	}

	public VoteParameters4 setSplitVoteAllowed(YesNoIndicator splitVoteAllowed) {
		this.splitVoteAllowed = Objects.requireNonNull(splitVoteAllowed);
		return this;
	}

	public Optional<DateFormat29Choice> getVoteDeadline() {
		return voteDeadline == null ? Optional.empty() : Optional.of(voteDeadline);
	}

	public VoteParameters4 setVoteDeadline(DateFormat29Choice voteDeadline) {
		this.voteDeadline = voteDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getVoteSTPDeadline() {
		return voteSTPDeadline == null ? Optional.empty() : Optional.of(voteSTPDeadline);
	}

	public VoteParameters4 setVoteSTPDeadline(DateFormat29Choice voteSTPDeadline) {
		this.voteSTPDeadline = voteSTPDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getVoteMarketDeadline() {
		return voteMarketDeadline == null ? Optional.empty() : Optional.of(voteMarketDeadline);
	}

	public VoteParameters4 setVoteMarketDeadline(DateFormat29Choice voteMarketDeadline) {
		this.voteMarketDeadline = voteMarketDeadline;
		return this;
	}

	public Optional<VoteMethods2> getVoteMethods() {
		return voteMethods == null ? Optional.empty() : Optional.of(voteMethods);
	}

	public VoteParameters4 setVoteMethods(com.tools20022.repository.msg.VoteMethods2 voteMethods) {
		this.voteMethods = voteMethods;
		return this;
	}

	public Optional<CommunicationAddress4> getVotingBallotElectronicAddress() {
		return votingBallotElectronicAddress == null ? Optional.empty() : Optional.of(votingBallotElectronicAddress);
	}

	public VoteParameters4 setVotingBallotElectronicAddress(com.tools20022.repository.msg.CommunicationAddress4 votingBallotElectronicAddress) {
		this.votingBallotElectronicAddress = votingBallotElectronicAddress;
		return this;
	}

	public Optional<PostalAddress1> getVotingBallotRequestAddress() {
		return votingBallotRequestAddress == null ? Optional.empty() : Optional.of(votingBallotRequestAddress);
	}

	public VoteParameters4 setVotingBallotRequestAddress(com.tools20022.repository.msg.PostalAddress1 votingBallotRequestAddress) {
		this.votingBallotRequestAddress = votingBallotRequestAddress;
		return this;
	}

	public Optional<DateFormat29Choice> getRevocabilityDeadline() {
		return revocabilityDeadline == null ? Optional.empty() : Optional.of(revocabilityDeadline);
	}

	public VoteParameters4 setRevocabilityDeadline(DateFormat29Choice revocabilityDeadline) {
		this.revocabilityDeadline = revocabilityDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getRevocabilitySTPDeadline() {
		return revocabilitySTPDeadline == null ? Optional.empty() : Optional.of(revocabilitySTPDeadline);
	}

	public VoteParameters4 setRevocabilitySTPDeadline(DateFormat29Choice revocabilitySTPDeadline) {
		this.revocabilitySTPDeadline = revocabilitySTPDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getRevocabilityMarketDeadline() {
		return revocabilityMarketDeadline == null ? Optional.empty() : Optional.of(revocabilityMarketDeadline);
	}

	public VoteParameters4 setRevocabilityMarketDeadline(DateFormat29Choice revocabilityMarketDeadline) {
		this.revocabilityMarketDeadline = revocabilityMarketDeadline;
		return this;
	}

	public YesNoIndicator getBeneficialOwnerDisclosure() {
		return beneficialOwnerDisclosure;
	}

	public VoteParameters4 setBeneficialOwnerDisclosure(YesNoIndicator beneficialOwnerDisclosure) {
		this.beneficialOwnerDisclosure = Objects.requireNonNull(beneficialOwnerDisclosure);
		return this;
	}

	public List<VoteInstruction2Code> getVoteInstructionType() {
		return voteInstructionType == null ? voteInstructionType = new ArrayList<>() : voteInstructionType;
	}

	public VoteParameters4 setVoteInstructionType(List<VoteInstruction2Code> voteInstructionType) {
		this.voteInstructionType = Objects.requireNonNull(voteInstructionType);
		return this;
	}

	public Optional<IncentivePremium3> getEarlyIncentivePremium() {
		return earlyIncentivePremium == null ? Optional.empty() : Optional.of(earlyIncentivePremium);
	}

	public VoteParameters4 setEarlyIncentivePremium(com.tools20022.repository.msg.IncentivePremium3 earlyIncentivePremium) {
		this.earlyIncentivePremium = earlyIncentivePremium;
		return this;
	}

	public Optional<IncentivePremium3> getIncentivePremium() {
		return incentivePremium == null ? Optional.empty() : Optional.of(incentivePremium);
	}

	public VoteParameters4 setIncentivePremium(com.tools20022.repository.msg.IncentivePremium3 incentivePremium) {
		this.incentivePremium = incentivePremium;
		return this;
	}

	public Optional<DateFormat29Choice> getEarlyVoteWithPremiumDeadline() {
		return earlyVoteWithPremiumDeadline == null ? Optional.empty() : Optional.of(earlyVoteWithPremiumDeadline);
	}

	public VoteParameters4 setEarlyVoteWithPremiumDeadline(DateFormat29Choice earlyVoteWithPremiumDeadline) {
		this.earlyVoteWithPremiumDeadline = earlyVoteWithPremiumDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getVoteWithPremiumDeadline() {
		return voteWithPremiumDeadline == null ? Optional.empty() : Optional.of(voteWithPremiumDeadline);
	}

	public VoteParameters4 setVoteWithPremiumDeadline(DateFormat29Choice voteWithPremiumDeadline) {
		this.voteWithPremiumDeadline = voteWithPremiumDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getVoteWithPremiumSTPDeadline() {
		return voteWithPremiumSTPDeadline == null ? Optional.empty() : Optional.of(voteWithPremiumSTPDeadline);
	}

	public VoteParameters4 setVoteWithPremiumSTPDeadline(DateFormat29Choice voteWithPremiumSTPDeadline) {
		this.voteWithPremiumSTPDeadline = voteWithPremiumSTPDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getVoteWithPremiumMarketDeadline() {
		return voteWithPremiumMarketDeadline == null ? Optional.empty() : Optional.of(voteWithPremiumMarketDeadline);
	}

	public VoteParameters4 setVoteWithPremiumMarketDeadline(DateFormat29Choice voteWithPremiumMarketDeadline) {
		this.voteWithPremiumMarketDeadline = voteWithPremiumMarketDeadline;
		return this;
	}

	public Optional<Max350Text> getAdditionalVotingRequirements() {
		return additionalVotingRequirements == null ? Optional.empty() : Optional.of(additionalVotingRequirements);
	}

	public VoteParameters4 setAdditionalVotingRequirements(Max350Text additionalVotingRequirements) {
		this.additionalVotingRequirements = additionalVotingRequirements;
		return this;
	}

	public Optional<YesNoIndicator> getPreviousInstructionInvalidityIndicator() {
		return previousInstructionInvalidityIndicator == null ? Optional.empty() : Optional.of(previousInstructionInvalidityIndicator);
	}

	public VoteParameters4 setPreviousInstructionInvalidityIndicator(YesNoIndicator previousInstructionInvalidityIndicator) {
		this.previousInstructionInvalidityIndicator = previousInstructionInvalidityIndicator;
		return this;
	}
}