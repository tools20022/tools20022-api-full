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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.InstructionForMeeting;
import com.tools20022.repository.entity.MeetingAttendeeRole;
import com.tools20022.repository.entity.ProxyAgent;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition2#mmPosition
 * SecurityPosition2.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#mmMeetingAttendee
 * SecurityPosition2.mmMeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition2#mmProxy
 * SecurityPosition2.mmProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#mmVoteDetails
 * SecurityPosition2.mmVoteDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#mmParticipationRegistrationRequest
 * SecurityPosition2.mmParticipationRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#mmBlockingRequest
 * SecurityPosition2.mmBlockingRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#mmSecuritiesRegistrationRequest
 * SecurityPosition2.mmSecuritiesRegistrationRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InstructionForMeeting
 * InstructionForMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityPosition2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityPosition2", propOrder = {"position", "meetingAttendee", "proxy", "voteDetails", "participationRegistrationRequest", "blockingRequest", "securitiesRegistrationRequest"})
public class SecurityPosition2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pos")
	protected EligiblePosition position;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EligiblePosition
	 * EligiblePosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
	 * SecuritiesAccount.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of securities that are eligible for the vote."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPosition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Amount of securities that are eligible for the vote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EligiblePosition.mmObject();
		}
	};
	@XmlElement(name = "MtgAttndee")
	protected List<com.tools20022.repository.msg.VotingPartyAndInstruction> meetingAttendee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction
	 * VotingPartyAndInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole
	 * MeetingAttendeeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgAttndee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a person who will attend the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMeetingAttendee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MeetingAttendeeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
			isDerived = false;
			xmlTag = "MtgAttndee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies a person who will attend the meeting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VotingPartyAndInstruction.mmObject();
		}
	};
	@XmlElement(name = "Prxy")
	protected List<com.tools20022.repository.msg.VotingPartyAndInstruction> proxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction
	 * VotingPartyAndInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAgent ProxyAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the proxy appointed by the security holder."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxy = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ProxyAgent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Identification of the proxy appointed by the security holder.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VotingPartyAndInstruction.mmObject();
		}
	};
	@XmlElement(name = "VoteDtls")
	protected List<com.tools20022.repository.msg.VoteInstruction> voteDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VoteInstruction
	 * VoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
	 * InstructionForMeeting.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies detailed voting instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmVoteInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
			isDerived = false;
			xmlTag = "VoteDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteDetails";
			definition = "Specifies detailed voting instructions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VoteInstruction.mmObject();
		}
	};
	@XmlElement(name = "PrtcptnRegnReq")
	protected List<com.tools20022.repository.msg.RequestInformation> participationRegistrationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequestInformation
	 * RequestInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmParticipationRegistration
	 * InstructionForMeeting.mmParticipationRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcptnRegnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register for participation to the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipationRegistrationRequest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmParticipationRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
			isDerived = false;
			xmlTag = "PrtcptnRegnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipationRegistrationRequest";
			definition = "Request to register for participation to the meeting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequestInformation.mmObject();
		}
	};
	@XmlElement(name = "BlckgReq")
	protected List<com.tools20022.repository.msg.RequestInformation> blockingRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequestInformation
	 * RequestInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmBlockingSecurities
	 * InstructionForMeeting.mmBlockingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckgReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to block the securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockingRequest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmBlockingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
			isDerived = false;
			xmlTag = "BlckgReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingRequest";
			definition = "Request to block the securities.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequestInformation.mmObject();
		}
	};
	@XmlElement(name = "SctiesRegnReq")
	protected List<com.tools20022.repository.msg.RequestInformation> securitiesRegistrationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequestInformation
	 * RequestInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSecuritiesRegistration
	 * InstructionForMeeting.mmSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRegnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register the securities for the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesRegistrationRequest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmSecuritiesRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationRequest";
			definition = "Request to register the securities for the meeting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequestInformation.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityPosition2.mmPosition, com.tools20022.repository.msg.SecurityPosition2.mmMeetingAttendee,
						com.tools20022.repository.msg.SecurityPosition2.mmProxy, com.tools20022.repository.msg.SecurityPosition2.mmVoteDetails, com.tools20022.repository.msg.SecurityPosition2.mmParticipationRegistrationRequest,
						com.tools20022.repository.msg.SecurityPosition2.mmBlockingRequest, com.tools20022.repository.msg.SecurityPosition2.mmSecuritiesRegistrationRequest);
				trace_lazy = () -> InstructionForMeeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityPosition2";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<EligiblePosition> getPosition() {
		return position == null ? Optional.empty() : Optional.of(position);
	}

	public SecurityPosition2 setPosition(com.tools20022.repository.msg.EligiblePosition position) {
		this.position = position;
		return this;
	}

	public List<VotingPartyAndInstruction> getMeetingAttendee() {
		return meetingAttendee == null ? meetingAttendee = new ArrayList<>() : meetingAttendee;
	}

	public SecurityPosition2 setMeetingAttendee(List<com.tools20022.repository.msg.VotingPartyAndInstruction> meetingAttendee) {
		this.meetingAttendee = Objects.requireNonNull(meetingAttendee);
		return this;
	}

	public List<VotingPartyAndInstruction> getProxy() {
		return proxy == null ? proxy = new ArrayList<>() : proxy;
	}

	public SecurityPosition2 setProxy(List<com.tools20022.repository.msg.VotingPartyAndInstruction> proxy) {
		this.proxy = Objects.requireNonNull(proxy);
		return this;
	}

	public List<VoteInstruction> getVoteDetails() {
		return voteDetails == null ? voteDetails = new ArrayList<>() : voteDetails;
	}

	public SecurityPosition2 setVoteDetails(List<com.tools20022.repository.msg.VoteInstruction> voteDetails) {
		this.voteDetails = Objects.requireNonNull(voteDetails);
		return this;
	}

	public List<RequestInformation> getParticipationRegistrationRequest() {
		return participationRegistrationRequest == null ? participationRegistrationRequest = new ArrayList<>() : participationRegistrationRequest;
	}

	public SecurityPosition2 setParticipationRegistrationRequest(List<com.tools20022.repository.msg.RequestInformation> participationRegistrationRequest) {
		this.participationRegistrationRequest = Objects.requireNonNull(participationRegistrationRequest);
		return this;
	}

	public List<RequestInformation> getBlockingRequest() {
		return blockingRequest == null ? blockingRequest = new ArrayList<>() : blockingRequest;
	}

	public SecurityPosition2 setBlockingRequest(List<com.tools20022.repository.msg.RequestInformation> blockingRequest) {
		this.blockingRequest = Objects.requireNonNull(blockingRequest);
		return this;
	}

	public List<RequestInformation> getSecuritiesRegistrationRequest() {
		return securitiesRegistrationRequest == null ? securitiesRegistrationRequest = new ArrayList<>() : securitiesRegistrationRequest;
	}

	public SecurityPosition2 setSecuritiesRegistrationRequest(List<com.tools20022.repository.msg.RequestInformation> securitiesRegistrationRequest) {
		this.securitiesRegistrationRequest = Objects.requireNonNull(securitiesRegistrationRequest);
		return this;
	}
}