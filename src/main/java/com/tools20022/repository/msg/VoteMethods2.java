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
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.PhoneAddress;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.entity.VotingCondition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommunicationAddress4;
import com.tools20022.repository.msg.PostalAddress1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * List of the different methods that can be used to vote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteMethods2#mmVoteThroughNetwork
 * VoteMethods2.mmVoteThroughNetwork}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2#mmVoteByMail
 * VoteMethods2.mmVoteByMail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2#mmElectronicVote
 * VoteMethods2.mmElectronicVote}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2#mmVoteByTelephone
 * VoteMethods2.mmVoteByTelephone}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VotingCondition
 * VotingCondition}</li>
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
 * "VoteMethods2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "List of the different methods that can be used to vote."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VoteMethods2", propOrder = {"voteThroughNetwork", "voteByMail", "electronicVote", "voteByTelephone"})
public class VoteMethods2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VoteThrghNtwk")
	protected List<AnyBICIdentifier> voteThroughNetwork;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmVoteLocation
	 * VotingCondition.mmVoteLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteMethods2 VoteMethods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteThrghNtwk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteThroughNetwork"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Network address through which a voting party can cast its vote via a structured message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VoteMethods2, List<AnyBICIdentifier>> mmVoteThroughNetwork = new MMMessageAttribute<VoteMethods2, List<AnyBICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> VotingCondition.mmVoteLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteMethods2.mmObject();
			isDerived = false;
			xmlTag = "VoteThrghNtwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteThroughNetwork";
			definition = "Network address through which a voting party can cast its vote via a structured message.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public List<AnyBICIdentifier> getValue(VoteMethods2 obj) {
			return obj.getVoteThroughNetwork();
		}

		@Override
		public void setValue(VoteMethods2 obj, List<AnyBICIdentifier> value) {
			obj.setVoteThroughNetwork(value);
		}
	};
	@XmlElement(name = "VoteByMail")
	protected List<PostalAddress1> voteByMail;
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
	 * {@linkplain com.tools20022.repository.msg.VoteMethods2 VoteMethods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteByMail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteByMail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the address where voting ballot can be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<VoteMethods2, List<PostalAddress1>> mmVoteByMail = new MMMessageAssociationEnd<VoteMethods2, List<PostalAddress1>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteMethods2.mmObject();
			isDerived = false;
			xmlTag = "VoteByMail";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteByMail";
			definition = "Specifies the address where voting ballot can be sent.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress1.mmObject();
		}

		@Override
		public List<PostalAddress1> getValue(VoteMethods2 obj) {
			return obj.getVoteByMail();
		}

		@Override
		public void setValue(VoteMethods2 obj, List<PostalAddress1> value) {
			obj.setVoteByMail(value);
		}
	};
	@XmlElement(name = "ElctrncVote")
	protected List<CommunicationAddress4> electronicVote;
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
	 * {@linkplain com.tools20022.repository.msg.VoteMethods2 VoteMethods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic address, e-mail or website, where a security holder can vote."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<VoteMethods2, List<CommunicationAddress4>> mmElectronicVote = new MMMessageAssociationEnd<VoteMethods2, List<CommunicationAddress4>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteMethods2.mmObject();
			isDerived = false;
			xmlTag = "ElctrncVote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicVote";
			definition = "Electronic address, e-mail or website, where a security holder can vote.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress4.mmObject();
		}

		@Override
		public List<CommunicationAddress4> getValue(VoteMethods2 obj) {
			return obj.getElectronicVote();
		}

		@Override
		public void setValue(VoteMethods2 obj, List<CommunicationAddress4> value) {
			obj.setElectronicVote(value);
		}
	};
	@XmlElement(name = "VoteByTel")
	protected List<Max35Text> voteByTelephone;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress PhoneAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteMethods2 VoteMethods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteByTel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteByTelephone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Telephone number providing access to an automated voting system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VoteMethods2, List<Max35Text>> mmVoteByTelephone = new MMMessageAttribute<VoteMethods2, List<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> PhoneAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.VoteMethods2.mmObject();
			isDerived = false;
			xmlTag = "VoteByTel";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteByTelephone";
			definition = "Telephone number providing access to an automated voting system.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(VoteMethods2 obj) {
			return obj.getVoteByTelephone();
		}

		@Override
		public void setValue(VoteMethods2 obj, List<Max35Text> value) {
			obj.setVoteByTelephone(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteMethods2.mmVoteThroughNetwork, com.tools20022.repository.msg.VoteMethods2.mmVoteByMail,
						com.tools20022.repository.msg.VoteMethods2.mmElectronicVote, com.tools20022.repository.msg.VoteMethods2.mmVoteByTelephone);
				trace_lazy = () -> VotingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteMethods2";
				definition = "List of the different methods that can be used to vote.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AnyBICIdentifier> getVoteThroughNetwork() {
		return voteThroughNetwork == null ? voteThroughNetwork = new ArrayList<>() : voteThroughNetwork;
	}

	public VoteMethods2 setVoteThroughNetwork(List<AnyBICIdentifier> voteThroughNetwork) {
		this.voteThroughNetwork = Objects.requireNonNull(voteThroughNetwork);
		return this;
	}

	public List<PostalAddress1> getVoteByMail() {
		return voteByMail == null ? voteByMail = new ArrayList<>() : voteByMail;
	}

	public VoteMethods2 setVoteByMail(List<PostalAddress1> voteByMail) {
		this.voteByMail = Objects.requireNonNull(voteByMail);
		return this;
	}

	public List<CommunicationAddress4> getElectronicVote() {
		return electronicVote == null ? electronicVote = new ArrayList<>() : electronicVote;
	}

	public VoteMethods2 setElectronicVote(List<CommunicationAddress4> electronicVote) {
		this.electronicVote = Objects.requireNonNull(electronicVote);
		return this;
	}

	public List<Max35Text> getVoteByTelephone() {
		return voteByTelephone == null ? voteByTelephone = new ArrayList<>() : voteByTelephone;
	}

	public VoteMethods2 setVoteByTelephone(List<Max35Text> voteByTelephone) {
		this.voteByTelephone = Objects.requireNonNull(voteByTelephone);
		return this;
	}
}