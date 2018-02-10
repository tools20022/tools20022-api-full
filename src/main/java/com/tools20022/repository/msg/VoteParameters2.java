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
import com.tools20022.repository.area.seev.MeetingNotificationV03;
import com.tools20022.repository.choice.DateFormat2Choice;
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
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmSecuritiesQuantityRequiredToVote
 * VoteParameters2.mmSecuritiesQuantityRequiredToVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmPartialVoteAllowed
 * VoteParameters2.mmPartialVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmSplitVoteAllowed
 * VoteParameters2.mmSplitVoteAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteDeadline
 * VoteParameters2.mmVoteDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteSTPDeadline
 * VoteParameters2.mmVoteSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteMarketDeadline
 * VoteParameters2.mmVoteMarketDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteMethods
 * VoteParameters2.mmVoteMethods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVotingBallotElectronicAddress
 * VoteParameters2.mmVotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVotingBallotRequestAddress
 * VoteParameters2.mmVotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilityDeadline
 * VoteParameters2.mmRevocabilityDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilitySTPDeadline
 * VoteParameters2.mmRevocabilitySTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilityMarketDeadline
 * VoteParameters2.mmRevocabilityMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmBeneficialOwnerDisclosure
 * VoteParameters2.mmBeneficialOwnerDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteInstructionType
 * VoteParameters2.mmVoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmIncentivePremium
 * VoteParameters2.mmIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumDeadline
 * VoteParameters2.mmVoteWithPremiumDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumSTPDeadline
 * VoteParameters2.mmVoteWithPremiumSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumMarketDeadline
 * VoteParameters2.mmVoteWithPremiumMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmAdditionalVotingRequirements
 * VoteParameters2.mmAdditionalVotingRequirements}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmVote
 * MeetingNotificationV03.mmVote}</li>
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
 * "VoteParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information describing how the voting process is organised."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VoteParameters2", propOrder = {"securitiesQuantityRequiredToVote", "partialVoteAllowed", "splitVoteAllowed", "voteDeadline", "voteSTPDeadline", "voteMarketDeadline", "voteMethods", "votingBallotElectronicAddress",
		"votingBallotRequestAddress", "revocabilityDeadline", "revocabilitySTPDeadline", "revocabilityMarketDeadline", "beneficialOwnerDisclosure", "voteInstructionType", "incentivePremium", "voteWithPremiumDeadline",
		"voteWithPremiumSTPDeadline", "voteWithPremiumMarketDeadline", "additionalVotingRequirements"})
public class VoteParameters2 {

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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesQuantityRequiredToVote = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmSecuritiesQuantityRequiredToVote;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyReqrdToVote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityRequiredToVote";
			definition = "Number of holdings required for a vote.";
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialVoteAllowed = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmPartialVoteAllowed;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "PrtlVoteAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteAllowed";
			definition = "Specifies whether it is allowed to only vote on a part of the entire holding, leaving part of the position un-voted.";
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitVoteAllowed = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmSplitVoteAllowed;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "SpltVoteAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteAllowed";
			definition = "Specifies whether it is allowed to vote in different directions for the entire holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "VoteDdln")
	protected DateFormat2Choice voteDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteSTPDdln")
	protected DateFormat2Choice voteSTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteSTPDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteMktDdln")
	protected DateFormat2Choice voteMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteMarketDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteMthds")
	protected VoteMethods voteMethods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VoteMethods
	 * VoteMethods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteLocation
	 * VotingCondition.mmVoteLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteMethods = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmVoteLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteMthds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteMethods";
			definition = "Indicates the different methods that can be used to vote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VoteMethods.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVotingBallotElectronicAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VtngBlltElctrncAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingBallotElectronicAddress";
			definition = "Electronic location, e-mail or URL address, where the voting ballot can be requested.";
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVotingBallotRequestAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VtngBlltReqAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingBallotRequestAddress";
			definition = "Specifies the postal address where the voting ballot can be requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};
	@XmlElement(name = "RvcbltyDdln")
	protected DateFormat2Choice revocabilityDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRevocabilityDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RvcbltySTPDdln")
	protected DateFormat2Choice revocabilitySTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRevocabilitySTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "RvcbltySTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilitySTPDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is specified by an intermediary (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RvcbltyMktDdln")
	protected DateFormat2Choice revocabilityMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRevocabilityMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityMarketDeadline";
			definition = "Date till which the instructing party can revoke, change or withdraw its voting instruction. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * "Indicates whether beneficiary details (eg name and address) must be supplied in order to take part to a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBeneficialOwnerDisclosure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmBeneficialOwnerDisclosure;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrDsclsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDisclosure";
			definition = "Indicates whether beneficiary details (eg name and address) must be supplied in order to take part to a meeting.";
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteInstructionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmVoteInstructionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType";
			definition = "Identifies the possible types of voting instructions. When used at the resolution level, it supersedes the value specified in the meeting notice.";
			maxOccurs = 8;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncentivePremium = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmIncentivePremium;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "IncntivPrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium paid to the security holder when voting.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IncentivePremium3.mmObject();
		}
	};
	@XmlElement(name = "VoteWthPrmDdln")
	protected DateFormat2Choice voteWithPremiumDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteWithPremiumDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteWthPrmDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteWthPrmSTPDdln")
	protected DateFormat2Choice voteWithPremiumSTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteWithPremiumSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteWthPrmSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumSTPDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the intermediary to take advantage of the premium (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "VoteWthPrmMktDdln")
	protected DateFormat2Choice voteWithPremiumMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteWithPremiumMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "VoteWthPrmMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithPremiumMarketDeadline";
			definition = "Date and time by which the vote instructions should be submitted to the issuer to take advantage of the premium.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalVotingRequirements = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteParameters2.mmObject();
			isDerived = false;
			xmlTag = "AddtlVtngRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalVotingRequirements";
			definition = "Additional information on specific requirements for allowing a person to vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteParameters2.mmSecuritiesQuantityRequiredToVote, com.tools20022.repository.msg.VoteParameters2.mmPartialVoteAllowed,
						com.tools20022.repository.msg.VoteParameters2.mmSplitVoteAllowed, com.tools20022.repository.msg.VoteParameters2.mmVoteDeadline, com.tools20022.repository.msg.VoteParameters2.mmVoteSTPDeadline,
						com.tools20022.repository.msg.VoteParameters2.mmVoteMarketDeadline, com.tools20022.repository.msg.VoteParameters2.mmVoteMethods, com.tools20022.repository.msg.VoteParameters2.mmVotingBallotElectronicAddress,
						com.tools20022.repository.msg.VoteParameters2.mmVotingBallotRequestAddress, com.tools20022.repository.msg.VoteParameters2.mmRevocabilityDeadline,
						com.tools20022.repository.msg.VoteParameters2.mmRevocabilitySTPDeadline, com.tools20022.repository.msg.VoteParameters2.mmRevocabilityMarketDeadline,
						com.tools20022.repository.msg.VoteParameters2.mmBeneficialOwnerDisclosure, com.tools20022.repository.msg.VoteParameters2.mmVoteInstructionType, com.tools20022.repository.msg.VoteParameters2.mmIncentivePremium,
						com.tools20022.repository.msg.VoteParameters2.mmVoteWithPremiumDeadline, com.tools20022.repository.msg.VoteParameters2.mmVoteWithPremiumSTPDeadline,
						com.tools20022.repository.msg.VoteParameters2.mmVoteWithPremiumMarketDeadline, com.tools20022.repository.msg.VoteParameters2.mmAdditionalVotingRequirements);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV03.mmVote);
				trace_lazy = () -> VotingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteParameters2";
				definition = "Information describing how the voting process is organised.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DecimalNumber> getSecuritiesQuantityRequiredToVote() {
		return securitiesQuantityRequiredToVote == null ? Optional.empty() : Optional.of(securitiesQuantityRequiredToVote);
	}

	public VoteParameters2 setSecuritiesQuantityRequiredToVote(DecimalNumber securitiesQuantityRequiredToVote) {
		this.securitiesQuantityRequiredToVote = securitiesQuantityRequiredToVote;
		return this;
	}

	public YesNoIndicator getPartialVoteAllowed() {
		return partialVoteAllowed;
	}

	public VoteParameters2 setPartialVoteAllowed(YesNoIndicator partialVoteAllowed) {
		this.partialVoteAllowed = Objects.requireNonNull(partialVoteAllowed);
		return this;
	}

	public YesNoIndicator getSplitVoteAllowed() {
		return splitVoteAllowed;
	}

	public VoteParameters2 setSplitVoteAllowed(YesNoIndicator splitVoteAllowed) {
		this.splitVoteAllowed = Objects.requireNonNull(splitVoteAllowed);
		return this;
	}

	public Optional<DateFormat2Choice> getVoteDeadline() {
		return voteDeadline == null ? Optional.empty() : Optional.of(voteDeadline);
	}

	public VoteParameters2 setVoteDeadline(DateFormat2Choice voteDeadline) {
		this.voteDeadline = voteDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getVoteSTPDeadline() {
		return voteSTPDeadline == null ? Optional.empty() : Optional.of(voteSTPDeadline);
	}

	public VoteParameters2 setVoteSTPDeadline(DateFormat2Choice voteSTPDeadline) {
		this.voteSTPDeadline = voteSTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getVoteMarketDeadline() {
		return voteMarketDeadline == null ? Optional.empty() : Optional.of(voteMarketDeadline);
	}

	public VoteParameters2 setVoteMarketDeadline(DateFormat2Choice voteMarketDeadline) {
		this.voteMarketDeadline = voteMarketDeadline;
		return this;
	}

	public Optional<VoteMethods> getVoteMethods() {
		return voteMethods == null ? Optional.empty() : Optional.of(voteMethods);
	}

	public VoteParameters2 setVoteMethods(com.tools20022.repository.msg.VoteMethods voteMethods) {
		this.voteMethods = voteMethods;
		return this;
	}

	public Optional<CommunicationAddress4> getVotingBallotElectronicAddress() {
		return votingBallotElectronicAddress == null ? Optional.empty() : Optional.of(votingBallotElectronicAddress);
	}

	public VoteParameters2 setVotingBallotElectronicAddress(com.tools20022.repository.msg.CommunicationAddress4 votingBallotElectronicAddress) {
		this.votingBallotElectronicAddress = votingBallotElectronicAddress;
		return this;
	}

	public Optional<PostalAddress1> getVotingBallotRequestAddress() {
		return votingBallotRequestAddress == null ? Optional.empty() : Optional.of(votingBallotRequestAddress);
	}

	public VoteParameters2 setVotingBallotRequestAddress(com.tools20022.repository.msg.PostalAddress1 votingBallotRequestAddress) {
		this.votingBallotRequestAddress = votingBallotRequestAddress;
		return this;
	}

	public Optional<DateFormat2Choice> getRevocabilityDeadline() {
		return revocabilityDeadline == null ? Optional.empty() : Optional.of(revocabilityDeadline);
	}

	public VoteParameters2 setRevocabilityDeadline(DateFormat2Choice revocabilityDeadline) {
		this.revocabilityDeadline = revocabilityDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getRevocabilitySTPDeadline() {
		return revocabilitySTPDeadline == null ? Optional.empty() : Optional.of(revocabilitySTPDeadline);
	}

	public VoteParameters2 setRevocabilitySTPDeadline(DateFormat2Choice revocabilitySTPDeadline) {
		this.revocabilitySTPDeadline = revocabilitySTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getRevocabilityMarketDeadline() {
		return revocabilityMarketDeadline == null ? Optional.empty() : Optional.of(revocabilityMarketDeadline);
	}

	public VoteParameters2 setRevocabilityMarketDeadline(DateFormat2Choice revocabilityMarketDeadline) {
		this.revocabilityMarketDeadline = revocabilityMarketDeadline;
		return this;
	}

	public YesNoIndicator getBeneficialOwnerDisclosure() {
		return beneficialOwnerDisclosure;
	}

	public VoteParameters2 setBeneficialOwnerDisclosure(YesNoIndicator beneficialOwnerDisclosure) {
		this.beneficialOwnerDisclosure = Objects.requireNonNull(beneficialOwnerDisclosure);
		return this;
	}

	public List<VoteInstruction2Code> getVoteInstructionType() {
		return voteInstructionType == null ? voteInstructionType = new ArrayList<>() : voteInstructionType;
	}

	public VoteParameters2 setVoteInstructionType(List<VoteInstruction2Code> voteInstructionType) {
		this.voteInstructionType = Objects.requireNonNull(voteInstructionType);
		return this;
	}

	public Optional<IncentivePremium3> getIncentivePremium() {
		return incentivePremium == null ? Optional.empty() : Optional.of(incentivePremium);
	}

	public VoteParameters2 setIncentivePremium(com.tools20022.repository.msg.IncentivePremium3 incentivePremium) {
		this.incentivePremium = incentivePremium;
		return this;
	}

	public Optional<DateFormat2Choice> getVoteWithPremiumDeadline() {
		return voteWithPremiumDeadline == null ? Optional.empty() : Optional.of(voteWithPremiumDeadline);
	}

	public VoteParameters2 setVoteWithPremiumDeadline(DateFormat2Choice voteWithPremiumDeadline) {
		this.voteWithPremiumDeadline = voteWithPremiumDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getVoteWithPremiumSTPDeadline() {
		return voteWithPremiumSTPDeadline == null ? Optional.empty() : Optional.of(voteWithPremiumSTPDeadline);
	}

	public VoteParameters2 setVoteWithPremiumSTPDeadline(DateFormat2Choice voteWithPremiumSTPDeadline) {
		this.voteWithPremiumSTPDeadline = voteWithPremiumSTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getVoteWithPremiumMarketDeadline() {
		return voteWithPremiumMarketDeadline == null ? Optional.empty() : Optional.of(voteWithPremiumMarketDeadline);
	}

	public VoteParameters2 setVoteWithPremiumMarketDeadline(DateFormat2Choice voteWithPremiumMarketDeadline) {
		this.voteWithPremiumMarketDeadline = voteWithPremiumMarketDeadline;
		return this;
	}

	public Optional<Max350Text> getAdditionalVotingRequirements() {
		return additionalVotingRequirements == null ? Optional.empty() : Optional.of(additionalVotingRequirements);
	}

	public VoteParameters2 setAdditionalVotingRequirements(Max350Text additionalVotingRequirements) {
		this.additionalVotingRequirements = additionalVotingRequirements;
		return this;
	}
}