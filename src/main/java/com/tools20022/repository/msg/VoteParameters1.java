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
import com.tools20022.repository.area.seev.MeetingNotificationV02;
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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmSecuritiesQuantityRequiredToVote
 * VoteParameters1.mmSecuritiesQuantityRequiredToVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmPartialVoteAllowed
 * VoteParameters1.mmPartialVoteAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmSplitVoteAllowed
 * VoteParameters1.mmSplitVoteAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteDeadline
 * VoteParameters1.mmVoteDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteSTPDeadline
 * VoteParameters1.mmVoteSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteMarketDeadline
 * VoteParameters1.mmVoteMarketDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteMethods
 * VoteParameters1.mmVoteMethods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVotingBallotElectronicAddress
 * VoteParameters1.mmVotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVotingBallotRequestAddress
 * VoteParameters1.mmVotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilityDeadline
 * VoteParameters1.mmRevocabilityDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilitySTPDeadline
 * VoteParameters1.mmRevocabilitySTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilityMarketDeadline
 * VoteParameters1.mmRevocabilityMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmBeneficialOwnerDisclosure
 * VoteParameters1.mmBeneficialOwnerDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteInstructionType
 * VoteParameters1.mmVoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmIncentivePremium
 * VoteParameters1.mmIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumDeadline
 * VoteParameters1.mmVoteWithPremiumDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumSTPDeadline
 * VoteParameters1.mmVoteWithPremiumSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumMarketDeadline
 * VoteParameters1.mmVoteWithPremiumMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmAdditionalVotingRequirements
 * VoteParameters1.mmAdditionalVotingRequirements}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmVote
 * MeetingNotificationV02.mmVote}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VoteParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information describing how the voting process is organised."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "VoteParameters1", propOrder = {"securitiesQuantityRequiredToVote", "partialVoteAllowed", "splitVoteAllowed", "voteDeadline", "voteSTPDeadline", "voteMarketDeadline", "voteMethods", "votingBallotElectronicAddress",
		"votingBallotRequestAddress", "revocabilityDeadline", "revocabilitySTPDeadline", "revocabilityMarketDeadline", "beneficialOwnerDisclosure", "voteInstructionType", "incentivePremium", "voteWithPremiumDeadline",
		"voteWithPremiumSTPDeadline", "voteWithPremiumMarketDeadline", "additionalVotingRequirements"})
public class VoteParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber securitiesQuantityRequiredToVote;
	/**
	 * Number of holdings required for a vote.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected YesNoIndicator partialVoteAllowed;
	/**
	 * Specifies whether it is allowed to only vote on a part of the entire
	 * holding, leaving part of the position un-voted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected YesNoIndicator splitVoteAllowed;
	/**
	 * Specifies whether it is allowed to vote in different directions for the
	 * entire holding.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice voteDeadline;
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice voteSTPDeadline;
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary (STP mode).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice voteMarketDeadline;
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * issuer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected VoteMethods voteMethods;
	/**
	 * Indicates the different methods that can be used to vote.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected CommunicationAddress4 votingBallotElectronicAddress;
	/**
	 * Electronic location, e-mail or URL address, where the voting ballot can
	 * be requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected PostalAddress1 votingBallotRequestAddress;
	/**
	 * Specifies the postal address where the voting ballot can be requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice revocabilityDeadline;
	/**
	 * Date till which the instructing party can revoke, change or withdraw its
	 * voting instruction. This deadline is specified by an intermediary.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice revocabilitySTPDeadline;
	/**
	 * Date till which the instructing party can revoke, change or withdraw its
	 * voting instruction. This deadline is specified by an intermediary (STP
	 * mode).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice revocabilityMarketDeadline;
	/**
	 * Date till which the instructing party can revoke, change or withdraw its
	 * voting instruction. This deadline is set by the issuer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected YesNoIndicator beneficialOwnerDisclosure;
	/**
	 * Indicates whether beneficiary details (eg name and address) must be
	 * supplied in order to take part to a meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected List<VoteInstruction2Code> voteInstructionType;
	/**
	 * Identifies the possible types of voting instructions. When used at the
	 * resolution level, it supersedes the value specified in the meeting
	 * notice.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected IncentivePremium2 incentivePremium;
	/**
	 * Cash premium paid to the security holder when voting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IncentivePremium2
	 * IncentivePremium2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmIncentivePremium
	 * VotingCondition.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
			isDerived = false;
			xmlTag = "IncntivPrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium paid to the security holder when voting.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IncentivePremium2.mmObject();
		}
	};
	protected DateFormat2Choice voteWithPremiumDeadline;
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary to take advantage of the premium.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice voteWithPremiumSTPDeadline;
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * intermediary to take advantage of the premium (STP mode).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected DateFormat2Choice voteWithPremiumMarketDeadline;
	/**
	 * Date and time by which the vote instructions should be submitted to the
	 * issuer to take advantage of the premium.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
	protected Max350Text additionalVotingRequirements;
	/**
	 * Additional information on specific requirements for allowing a person to
	 * vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
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
			componentContext_lazy = () -> VoteParameters1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(VoteParameters1.mmSecuritiesQuantityRequiredToVote, VoteParameters1.mmPartialVoteAllowed, VoteParameters1.mmSplitVoteAllowed, VoteParameters1.mmVoteDeadline,
						VoteParameters1.mmVoteSTPDeadline, VoteParameters1.mmVoteMarketDeadline, VoteParameters1.mmVoteMethods, VoteParameters1.mmVotingBallotElectronicAddress, VoteParameters1.mmVotingBallotRequestAddress,
						VoteParameters1.mmRevocabilityDeadline, VoteParameters1.mmRevocabilitySTPDeadline, VoteParameters1.mmRevocabilityMarketDeadline, VoteParameters1.mmBeneficialOwnerDisclosure, VoteParameters1.mmVoteInstructionType,
						VoteParameters1.mmIncentivePremium, VoteParameters1.mmVoteWithPremiumDeadline, VoteParameters1.mmVoteWithPremiumSTPDeadline, VoteParameters1.mmVoteWithPremiumMarketDeadline,
						VoteParameters1.mmAdditionalVotingRequirements);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV02.mmVote);
				trace_lazy = () -> VotingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteParameters1";
				definition = "Information describing how the voting process is organised.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesQtyReqrdToVote")
	public DecimalNumber getSecuritiesQuantityRequiredToVote() {
		return securitiesQuantityRequiredToVote;
	}

	public void setSecuritiesQuantityRequiredToVote(DecimalNumber securitiesQuantityRequiredToVote) {
		this.securitiesQuantityRequiredToVote = securitiesQuantityRequiredToVote;
	}

	@XmlElement(name = "PrtlVoteAllwd", required = true)
	public YesNoIndicator getPartialVoteAllowed() {
		return partialVoteAllowed;
	}

	public void setPartialVoteAllowed(YesNoIndicator partialVoteAllowed) {
		this.partialVoteAllowed = partialVoteAllowed;
	}

	@XmlElement(name = "SpltVoteAllwd", required = true)
	public YesNoIndicator getSplitVoteAllowed() {
		return splitVoteAllowed;
	}

	public void setSplitVoteAllowed(YesNoIndicator splitVoteAllowed) {
		this.splitVoteAllowed = splitVoteAllowed;
	}

	@XmlElement(name = "VoteDdln")
	public DateFormat2Choice getVoteDeadline() {
		return voteDeadline;
	}

	public void setVoteDeadline(DateFormat2Choice voteDeadline) {
		this.voteDeadline = voteDeadline;
	}

	@XmlElement(name = "VoteSTPDdln")
	public DateFormat2Choice getVoteSTPDeadline() {
		return voteSTPDeadline;
	}

	public void setVoteSTPDeadline(DateFormat2Choice voteSTPDeadline) {
		this.voteSTPDeadline = voteSTPDeadline;
	}

	@XmlElement(name = "VoteMktDdln")
	public DateFormat2Choice getVoteMarketDeadline() {
		return voteMarketDeadline;
	}

	public void setVoteMarketDeadline(DateFormat2Choice voteMarketDeadline) {
		this.voteMarketDeadline = voteMarketDeadline;
	}

	@XmlElement(name = "VoteMthds")
	public VoteMethods getVoteMethods() {
		return voteMethods;
	}

	public void setVoteMethods(com.tools20022.repository.msg.VoteMethods voteMethods) {
		this.voteMethods = voteMethods;
	}

	@XmlElement(name = "VtngBlltElctrncAdr")
	public CommunicationAddress4 getVotingBallotElectronicAddress() {
		return votingBallotElectronicAddress;
	}

	public void setVotingBallotElectronicAddress(com.tools20022.repository.msg.CommunicationAddress4 votingBallotElectronicAddress) {
		this.votingBallotElectronicAddress = votingBallotElectronicAddress;
	}

	@XmlElement(name = "VtngBlltReqAdr")
	public PostalAddress1 getVotingBallotRequestAddress() {
		return votingBallotRequestAddress;
	}

	public void setVotingBallotRequestAddress(com.tools20022.repository.msg.PostalAddress1 votingBallotRequestAddress) {
		this.votingBallotRequestAddress = votingBallotRequestAddress;
	}

	@XmlElement(name = "RvcbltyDdln")
	public DateFormat2Choice getRevocabilityDeadline() {
		return revocabilityDeadline;
	}

	public void setRevocabilityDeadline(DateFormat2Choice revocabilityDeadline) {
		this.revocabilityDeadline = revocabilityDeadline;
	}

	@XmlElement(name = "RvcbltySTPDdln")
	public DateFormat2Choice getRevocabilitySTPDeadline() {
		return revocabilitySTPDeadline;
	}

	public void setRevocabilitySTPDeadline(DateFormat2Choice revocabilitySTPDeadline) {
		this.revocabilitySTPDeadline = revocabilitySTPDeadline;
	}

	@XmlElement(name = "RvcbltyMktDdln")
	public DateFormat2Choice getRevocabilityMarketDeadline() {
		return revocabilityMarketDeadline;
	}

	public void setRevocabilityMarketDeadline(DateFormat2Choice revocabilityMarketDeadline) {
		this.revocabilityMarketDeadline = revocabilityMarketDeadline;
	}

	@XmlElement(name = "BnfclOwnrDsclsr", required = true)
	public YesNoIndicator getBeneficialOwnerDisclosure() {
		return beneficialOwnerDisclosure;
	}

	public void setBeneficialOwnerDisclosure(YesNoIndicator beneficialOwnerDisclosure) {
		this.beneficialOwnerDisclosure = beneficialOwnerDisclosure;
	}

	@XmlElement(name = "VoteInstrTp")
	public List<VoteInstruction2Code> getVoteInstructionType() {
		return voteInstructionType;
	}

	public void setVoteInstructionType(List<VoteInstruction2Code> voteInstructionType) {
		this.voteInstructionType = voteInstructionType;
	}

	@XmlElement(name = "IncntivPrm")
	public IncentivePremium2 getIncentivePremium() {
		return incentivePremium;
	}

	public void setIncentivePremium(com.tools20022.repository.msg.IncentivePremium2 incentivePremium) {
		this.incentivePremium = incentivePremium;
	}

	@XmlElement(name = "VoteWthPrmDdln")
	public DateFormat2Choice getVoteWithPremiumDeadline() {
		return voteWithPremiumDeadline;
	}

	public void setVoteWithPremiumDeadline(DateFormat2Choice voteWithPremiumDeadline) {
		this.voteWithPremiumDeadline = voteWithPremiumDeadline;
	}

	@XmlElement(name = "VoteWthPrmSTPDdln")
	public DateFormat2Choice getVoteWithPremiumSTPDeadline() {
		return voteWithPremiumSTPDeadline;
	}

	public void setVoteWithPremiumSTPDeadline(DateFormat2Choice voteWithPremiumSTPDeadline) {
		this.voteWithPremiumSTPDeadline = voteWithPremiumSTPDeadline;
	}

	@XmlElement(name = "VoteWthPrmMktDdln")
	public DateFormat2Choice getVoteWithPremiumMarketDeadline() {
		return voteWithPremiumMarketDeadline;
	}

	public void setVoteWithPremiumMarketDeadline(DateFormat2Choice voteWithPremiumMarketDeadline) {
		this.voteWithPremiumMarketDeadline = voteWithPremiumMarketDeadline;
	}

	@XmlElement(name = "AddtlVtngRqrmnts")
	public Max350Text getAdditionalVotingRequirements() {
		return additionalVotingRequirements;
	}

	public void setAdditionalVotingRequirements(Max350Text additionalVotingRequirements) {
		this.additionalVotingRequirements = additionalVotingRequirements;
	}
}