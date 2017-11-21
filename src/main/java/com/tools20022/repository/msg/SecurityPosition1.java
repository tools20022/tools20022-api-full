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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmIdentification
 * SecurityPosition1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition1#mmPosition
 * SecurityPosition1.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmMeetingAttendee
 * SecurityPosition1.mmMeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition1#mmProxy
 * SecurityPosition1.mmProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmVoteDetails
 * SecurityPosition1.mmVoteDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmParticipationRegistrationRequest
 * SecurityPosition1.mmParticipationRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmBlockingRequest
 * SecurityPosition1.mmBlockingRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmSecuritiesRegistrationRequest
 * SecurityPosition1.mmSecuritiesRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmSecuritySubPosition
 * SecurityPosition1.mmSecuritySubPosition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InstructionForMeeting
 * InstructionForMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityPosition1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityPosition1", propOrder = {"identification", "position", "meetingAttendee", "proxy", "voteDetails", "participationRegistrationRequest", "blockingRequest", "securitiesRegistrationRequest", "securitySubPosition"})
public class SecurityPosition1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification3 identification;
	/**
	 * Security held in an account on which the balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3
	 * SecurityIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security held in an account on which the balance is calculated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Security held in an account on which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification3.mmObject();
		}
	};
	protected EligiblePosition position;
	/**
	 * Amount of securities that are eligible for the vote.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
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
			componentContext_lazy = () -> SecurityPosition1.mmObject();
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
	protected List<com.tools20022.repository.msg.VotingPartyAndInstruction> meetingAttendee;
	/**
	 * Specifies a person who will attend the meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
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
			componentContext_lazy = () -> SecurityPosition1.mmObject();
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
	protected List<com.tools20022.repository.msg.VotingPartyAndInstruction> proxy;
	/**
	 * Identification of the proxy appointed by the security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction
	 * VotingPartyAndInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
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
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> SecurityPosition1.mmObject();
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
	protected List<com.tools20022.repository.msg.VoteInstruction> voteDetails;
	/**
	 * Specifies detailed voting instructions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
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
			componentContext_lazy = () -> SecurityPosition1.mmObject();
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
	protected List<com.tools20022.repository.msg.RequestInformation> participationRegistrationRequest;
	/**
	 * Request to register for participation to the meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
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
			componentContext_lazy = () -> SecurityPosition1.mmObject();
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
	protected List<com.tools20022.repository.msg.RequestInformation> blockingRequest;
	/**
	 * Request to block the securities.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
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
			componentContext_lazy = () -> SecurityPosition1.mmObject();
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
	protected List<com.tools20022.repository.msg.RequestInformation> securitiesRegistrationRequest;
	/**
	 * Request to register the securities for the meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
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
			componentContext_lazy = () -> SecurityPosition1.mmObject();
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
	protected List<com.tools20022.repository.msg.SecurityPosition2> securitySubPosition;
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityPosition2
	 * SecurityPosition2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySubPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritySubPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subdivision of an account used to segregate specific holdings."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritySubPosition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "SctySubPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritySubPosition";
			definition = "Subdivision of an account used to segregate specific holdings.";
			maxOccurs = 1000;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityPosition2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityPosition1.mmIdentification, SecurityPosition1.mmPosition, SecurityPosition1.mmMeetingAttendee, SecurityPosition1.mmProxy, SecurityPosition1.mmVoteDetails,
						SecurityPosition1.mmParticipationRegistrationRequest, SecurityPosition1.mmBlockingRequest, SecurityPosition1.mmSecuritiesRegistrationRequest, SecurityPosition1.mmSecuritySubPosition);
				trace_lazy = () -> InstructionForMeeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityPosition1";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public SecurityIdentification3 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.SecurityIdentification3 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Pos")
	public EligiblePosition getPosition() {
		return position;
	}

	public void setPosition(com.tools20022.repository.msg.EligiblePosition position) {
		this.position = position;
	}

	@XmlElement(name = "MtgAttndee")
	public List<VotingPartyAndInstruction> getMeetingAttendee() {
		return meetingAttendee;
	}

	public void setMeetingAttendee(List<com.tools20022.repository.msg.VotingPartyAndInstruction> meetingAttendee) {
		this.meetingAttendee = meetingAttendee;
	}

	@XmlElement(name = "Prxy")
	public List<VotingPartyAndInstruction> getProxy() {
		return proxy;
	}

	public void setProxy(List<com.tools20022.repository.msg.VotingPartyAndInstruction> proxy) {
		this.proxy = proxy;
	}

	@XmlElement(name = "VoteDtls")
	public List<VoteInstruction> getVoteDetails() {
		return voteDetails;
	}

	public void setVoteDetails(List<com.tools20022.repository.msg.VoteInstruction> voteDetails) {
		this.voteDetails = voteDetails;
	}

	@XmlElement(name = "PrtcptnRegnReq")
	public List<RequestInformation> getParticipationRegistrationRequest() {
		return participationRegistrationRequest;
	}

	public void setParticipationRegistrationRequest(List<com.tools20022.repository.msg.RequestInformation> participationRegistrationRequest) {
		this.participationRegistrationRequest = participationRegistrationRequest;
	}

	@XmlElement(name = "BlckgReq")
	public List<RequestInformation> getBlockingRequest() {
		return blockingRequest;
	}

	public void setBlockingRequest(List<com.tools20022.repository.msg.RequestInformation> blockingRequest) {
		this.blockingRequest = blockingRequest;
	}

	@XmlElement(name = "SctiesRegnReq")
	public List<RequestInformation> getSecuritiesRegistrationRequest() {
		return securitiesRegistrationRequest;
	}

	public void setSecuritiesRegistrationRequest(List<com.tools20022.repository.msg.RequestInformation> securitiesRegistrationRequest) {
		this.securitiesRegistrationRequest = securitiesRegistrationRequest;
	}

	@XmlElement(name = "SctySubPos")
	public List<SecurityPosition2> getSecuritySubPosition() {
		return securitySubPosition;
	}

	public void setSecuritySubPosition(List<com.tools20022.repository.msg.SecurityPosition2> securitySubPosition) {
		this.securitySubPosition = securitySubPosition;
	}
}