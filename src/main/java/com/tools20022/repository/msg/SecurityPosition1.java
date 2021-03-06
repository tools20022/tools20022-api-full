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
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityPosition1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityPosition1", propOrder = {"identification", "position", "meetingAttendee", "proxy", "voteDetails", "participationRegistrationRequest", "blockingRequest", "securitiesRegistrationRequest", "securitySubPosition"})
public class SecurityPosition1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification3 identification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security held in an account on which the balance is calculated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityPosition1, SecurityIdentification3> mmIdentification = new MMMessageAttribute<SecurityPosition1, SecurityIdentification3>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Security held in an account on which the balance is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification3.mmObject();
		}

		@Override
		public SecurityIdentification3 getValue(SecurityPosition1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecurityPosition1 obj, SecurityIdentification3 value) {
			obj.setIdentification(value);
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pos"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of securities that are eligible for the vote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, Optional<EligiblePosition>> mmPosition = new MMMessageAssociationEnd<SecurityPosition1, Optional<EligiblePosition>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Amount of securities that are eligible for the vote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EligiblePosition.mmObject();
		}

		@Override
		public Optional<EligiblePosition> getValue(SecurityPosition1 obj) {
			return obj.getPosition();
		}

		@Override
		public void setValue(SecurityPosition1 obj, Optional<EligiblePosition> value) {
			obj.setPosition(value.orElse(null));
		}
	};
	@XmlElement(name = "MtgAttndee")
	protected List<VotingPartyAndInstruction> meetingAttendee;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgAttndee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a person who will attend the meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, List<VotingPartyAndInstruction>> mmMeetingAttendee = new MMMessageAssociationEnd<SecurityPosition1, List<VotingPartyAndInstruction>>() {
		{
			businessComponentTrace_lazy = () -> MeetingAttendeeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "MtgAttndee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies a person who will attend the meeting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> VotingPartyAndInstruction.mmObject();
		}

		@Override
		public List<VotingPartyAndInstruction> getValue(SecurityPosition1 obj) {
			return obj.getMeetingAttendee();
		}

		@Override
		public void setValue(SecurityPosition1 obj, List<VotingPartyAndInstruction> value) {
			obj.setMeetingAttendee(value);
		}
	};
	@XmlElement(name = "Prxy")
	protected List<VotingPartyAndInstruction> proxy;
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
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prxy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the proxy appointed by the security holder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, List<VotingPartyAndInstruction>> mmProxy = new MMMessageAssociationEnd<SecurityPosition1, List<VotingPartyAndInstruction>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Identification of the proxy appointed by the security holder.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> VotingPartyAndInstruction.mmObject();
		}

		@Override
		public List<VotingPartyAndInstruction> getValue(SecurityPosition1 obj) {
			return obj.getProxy();
		}

		@Override
		public void setValue(SecurityPosition1 obj, List<VotingPartyAndInstruction> value) {
			obj.setProxy(value);
		}
	};
	@XmlElement(name = "VoteDtls")
	protected List<VoteInstruction> voteDetails;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies detailed voting instructions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, List<VoteInstruction>> mmVoteDetails = new MMMessageAssociationEnd<SecurityPosition1, List<VoteInstruction>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmVoteInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "VoteDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteDetails";
			definition = "Specifies detailed voting instructions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> VoteInstruction.mmObject();
		}

		@Override
		public List<VoteInstruction> getValue(SecurityPosition1 obj) {
			return obj.getVoteDetails();
		}

		@Override
		public void setValue(SecurityPosition1 obj, List<VoteInstruction> value) {
			obj.setVoteDetails(value);
		}
	};
	@XmlElement(name = "PrtcptnRegnReq")
	protected List<RequestInformation> participationRegistrationRequest;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcptnRegnReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register for participation to the meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, List<RequestInformation>> mmParticipationRegistrationRequest = new MMMessageAssociationEnd<SecurityPosition1, List<RequestInformation>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmParticipationRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "PrtcptnRegnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipationRegistrationRequest";
			definition = "Request to register for participation to the meeting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RequestInformation.mmObject();
		}

		@Override
		public List<RequestInformation> getValue(SecurityPosition1 obj) {
			return obj.getParticipationRegistrationRequest();
		}

		@Override
		public void setValue(SecurityPosition1 obj, List<RequestInformation> value) {
			obj.setParticipationRegistrationRequest(value);
		}
	};
	@XmlElement(name = "BlckgReq")
	protected List<RequestInformation> blockingRequest;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckgReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to block the securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, List<RequestInformation>> mmBlockingRequest = new MMMessageAssociationEnd<SecurityPosition1, List<RequestInformation>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmBlockingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "BlckgReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingRequest";
			definition = "Request to block the securities.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RequestInformation.mmObject();
		}

		@Override
		public List<RequestInformation> getValue(SecurityPosition1 obj) {
			return obj.getBlockingRequest();
		}

		@Override
		public void setValue(SecurityPosition1 obj, List<RequestInformation> value) {
			obj.setBlockingRequest(value);
		}
	};
	@XmlElement(name = "SctiesRegnReq")
	protected List<RequestInformation> securitiesRegistrationRequest;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1
	 * SecurityPosition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRegnReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register the securities for the meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, List<RequestInformation>> mmSecuritiesRegistrationRequest = new MMMessageAssociationEnd<SecurityPosition1, List<RequestInformation>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmSecuritiesRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationRequest";
			definition = "Request to register the securities for the meeting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RequestInformation.mmObject();
		}

		@Override
		public List<RequestInformation> getValue(SecurityPosition1 obj) {
			return obj.getSecuritiesRegistrationRequest();
		}

		@Override
		public void setValue(SecurityPosition1 obj, List<RequestInformation> value) {
			obj.setSecuritiesRegistrationRequest(value);
		}
	};
	@XmlElement(name = "SctySubPos")
	protected List<SecurityPosition2> securitySubPosition;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritySubPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subdivision of an account used to segregate specific holdings."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityPosition1, List<SecurityPosition2>> mmSecuritySubPosition = new MMMessageAssociationEnd<SecurityPosition1, List<SecurityPosition2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityPosition1.mmObject();
			isDerived = false;
			xmlTag = "SctySubPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritySubPosition";
			definition = "Subdivision of an account used to segregate specific holdings.";
			maxOccurs = 1000;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityPosition2.mmObject();
		}

		@Override
		public List<SecurityPosition2> getValue(SecurityPosition1 obj) {
			return obj.getSecuritySubPosition();
		}

		@Override
		public void setValue(SecurityPosition1 obj, List<SecurityPosition2> value) {
			obj.setSecuritySubPosition(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityPosition1.mmIdentification, com.tools20022.repository.msg.SecurityPosition1.mmPosition,
						com.tools20022.repository.msg.SecurityPosition1.mmMeetingAttendee, com.tools20022.repository.msg.SecurityPosition1.mmProxy, com.tools20022.repository.msg.SecurityPosition1.mmVoteDetails,
						com.tools20022.repository.msg.SecurityPosition1.mmParticipationRegistrationRequest, com.tools20022.repository.msg.SecurityPosition1.mmBlockingRequest,
						com.tools20022.repository.msg.SecurityPosition1.mmSecuritiesRegistrationRequest, com.tools20022.repository.msg.SecurityPosition1.mmSecuritySubPosition);
				trace_lazy = () -> InstructionForMeeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityPosition1";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification3 getIdentification() {
		return identification;
	}

	public SecurityPosition1 setIdentification(SecurityIdentification3 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<EligiblePosition> getPosition() {
		return position == null ? Optional.empty() : Optional.of(position);
	}

	public SecurityPosition1 setPosition(EligiblePosition position) {
		this.position = position;
		return this;
	}

	public List<VotingPartyAndInstruction> getMeetingAttendee() {
		return meetingAttendee == null ? meetingAttendee = new ArrayList<>() : meetingAttendee;
	}

	public SecurityPosition1 setMeetingAttendee(List<VotingPartyAndInstruction> meetingAttendee) {
		this.meetingAttendee = Objects.requireNonNull(meetingAttendee);
		return this;
	}

	public List<VotingPartyAndInstruction> getProxy() {
		return proxy == null ? proxy = new ArrayList<>() : proxy;
	}

	public SecurityPosition1 setProxy(List<VotingPartyAndInstruction> proxy) {
		this.proxy = Objects.requireNonNull(proxy);
		return this;
	}

	public List<VoteInstruction> getVoteDetails() {
		return voteDetails == null ? voteDetails = new ArrayList<>() : voteDetails;
	}

	public SecurityPosition1 setVoteDetails(List<VoteInstruction> voteDetails) {
		this.voteDetails = Objects.requireNonNull(voteDetails);
		return this;
	}

	public List<RequestInformation> getParticipationRegistrationRequest() {
		return participationRegistrationRequest == null ? participationRegistrationRequest = new ArrayList<>() : participationRegistrationRequest;
	}

	public SecurityPosition1 setParticipationRegistrationRequest(List<RequestInformation> participationRegistrationRequest) {
		this.participationRegistrationRequest = Objects.requireNonNull(participationRegistrationRequest);
		return this;
	}

	public List<RequestInformation> getBlockingRequest() {
		return blockingRequest == null ? blockingRequest = new ArrayList<>() : blockingRequest;
	}

	public SecurityPosition1 setBlockingRequest(List<RequestInformation> blockingRequest) {
		this.blockingRequest = Objects.requireNonNull(blockingRequest);
		return this;
	}

	public List<RequestInformation> getSecuritiesRegistrationRequest() {
		return securitiesRegistrationRequest == null ? securitiesRegistrationRequest = new ArrayList<>() : securitiesRegistrationRequest;
	}

	public SecurityPosition1 setSecuritiesRegistrationRequest(List<RequestInformation> securitiesRegistrationRequest) {
		this.securitiesRegistrationRequest = Objects.requireNonNull(securitiesRegistrationRequest);
		return this;
	}

	public List<SecurityPosition2> getSecuritySubPosition() {
		return securitySubPosition == null ? securitySubPosition = new ArrayList<>() : securitySubPosition;
	}

	public SecurityPosition1 setSecuritySubPosition(List<SecurityPosition2> securitySubPosition) {
		this.securitySubPosition = Objects.requireNonNull(securitySubPosition);
		return this;
	}
}