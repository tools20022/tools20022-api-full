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
import com.tools20022.repository.area.seev.MeetingInstructionV02;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionServicing;
import com.tools20022.repository.entity.InstructionForMeeting;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction1#mmInstructionIdentification
 * Instruction1.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction1#mmRequestedExecutionDate
 * Instruction1.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction1#mmVoteExecutionConfirmation
 * Instruction1.mmVoteExecutionConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#mmAccountDetails
 * Instruction1.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#mmProxy
 * Instruction1.mmProxy}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#mmVoteDetails
 * Instruction1.mmVoteDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#mmMeetingAttendee
 * Instruction1.mmMeetingAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction1#mmSpecificInstructionRequest
 * Instruction1.mmSpecificInstructionRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InstructionForMeeting
 * InstructionForMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV02#mmInstruction
 * MeetingInstructionV02.mmInstruction}</li>
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
 * "Instruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Instruction1", propOrder = {"instructionIdentification", "requestedExecutionDate", "voteExecutionConfirmation", "accountDetails", "proxy", "voteDetails", "meetingAttendee", "specificInstructionRequest"})
public class Instruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrId", required = true)
	protected Max35Text instructionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the detailed instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Instruction1, Max35Text> mmInstructionIdentification = new MMMessageAttribute<Instruction1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the detailed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Instruction1 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(Instruction1 obj, Max35Text value) {
			obj.setInstructionIdentification(value);
		}
	};
	@XmlElement(name = "ReqdExctnDt")
	protected ISODateTime requestedExecutionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmRequestedExecutionDate
	 * InstructionForMeeting.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the instruction must be executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Instruction1, Optional<ISODateTime>> mmRequestedExecutionDate = new MMMessageAttribute<Instruction1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the instruction must be executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Instruction1 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(Instruction1 obj, Optional<ISODateTime> value) {
			obj.setRequestedExecutionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "VoteExctnConf", required = true)
	protected YesNoIndicator voteExecutionConfirmation;
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
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteExecutionConfirmation
	 * VoteInstructionRequest.mmVoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteExctnConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteExecutionConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a Vote execution confirmation is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Instruction1, YesNoIndicator> mmVoteExecutionConfirmation = new MMMessageAttribute<Instruction1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmVoteExecutionConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "VoteExctnConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteExecutionConfirmation";
			definition = "Indicates that a Vote execution confirmation is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Instruction1 obj) {
			return obj.getVoteExecutionConfirmation();
		}

		@Override
		public void setValue(Instruction1 obj, YesNoIndicator value) {
			obj.setVoteExecutionConfirmation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected SafekeepingAccount3 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafekeepingAccount3
	 * SafekeepingAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Instruction1, SafekeepingAccount3> mmAccountDetails = new MMMessageAssociationEnd<Instruction1, SafekeepingAccount3>() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Identification of the securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingAccount3.mmObject();
		}

		@Override
		public SafekeepingAccount3 getValue(Instruction1 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(Instruction1 obj, SafekeepingAccount3 value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "Prxy")
	protected Proxy2 proxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Proxy2 Proxy2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmProxyAppointment
	 * InstructionForMeeting.mmProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
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
	 * "Identification of the person appointed by the security holder as proxy."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Instruction1, Optional<Proxy2>> mmProxy = new MMMessageAssociationEnd<Instruction1, Optional<Proxy2>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmProxyAppointment;
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Identification of the person appointed by the security holder as proxy.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Proxy2.mmObject();
		}

		@Override
		public Optional<Proxy2> getValue(Instruction1 obj) {
			return obj.getProxy();
		}

		@Override
		public void setValue(Instruction1 obj, Optional<Proxy2> value) {
			obj.setProxy(value.orElse(null));
		}
	};
	@XmlElement(name = "VoteDtls")
	protected VoteDetails1 voteDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VoteDetails1
	 * VoteDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
	 * InstructionForMeeting.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
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
	public static final MMMessageAssociationEnd<Instruction1, Optional<VoteDetails1>> mmVoteDetails = new MMMessageAssociationEnd<Instruction1, Optional<VoteDetails1>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmVoteInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "VoteDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteDetails";
			definition = "Specifies detailed voting instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> VoteDetails1.mmObject();
		}

		@Override
		public Optional<VoteDetails1> getValue(Instruction1 obj) {
			return obj.getVoteDetails();
		}

		@Override
		public void setValue(Instruction1 obj, Optional<VoteDetails1> value) {
			obj.setVoteDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "MtgAttndee")
	protected List<IndividualPerson13> meetingAttendee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson13
	 * IndividualPerson13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
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
	 * definition} =
	 * "Identification of the security holder who will attend and vote at the meeting in person and/or a person assigned by the security holder to attend the meeting without having any voting rights or taking any action."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Instruction1, List<IndividualPerson13>> mmMeetingAttendee = new MMMessageAssociationEnd<Instruction1, List<IndividualPerson13>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "MtgAttndee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingAttendee";
			definition = "Identification of the security holder who will attend and vote at the meeting in person and/or a person assigned by the security holder to attend the meeting without having any voting rights or taking any action.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson13.mmObject();
		}

		@Override
		public List<IndividualPerson13> getValue(Instruction1 obj) {
			return obj.getMeetingAttendee();
		}

		@Override
		public void setValue(Instruction1 obj, List<IndividualPerson13> value) {
			obj.setMeetingAttendee(value);
		}
	};
	@XmlElement(name = "SpcfcInstrReq")
	protected SpecificInstructionRequest1 specificInstructionRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1
	 * SpecificInstructionRequest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpcfcInstrReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificInstructionRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to execute specific instructions, such as participation registration, securities registration or blocking of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Instruction1, Optional<SpecificInstructionRequest1>> mmSpecificInstructionRequest = new MMMessageAssociationEnd<Instruction1, Optional<SpecificInstructionRequest1>>() {
		{
			businessComponentTrace_lazy = () -> InstructionForMeeting.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Instruction1.mmObject();
			isDerived = false;
			xmlTag = "SpcfcInstrReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificInstructionRequest";
			definition = "Request to execute specific instructions, such as participation registration, securities registration or blocking of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SpecificInstructionRequest1.mmObject();
		}

		@Override
		public Optional<SpecificInstructionRequest1> getValue(Instruction1 obj) {
			return obj.getSpecificInstructionRequest();
		}

		@Override
		public void setValue(Instruction1 obj, Optional<SpecificInstructionRequest1> value) {
			obj.setSpecificInstructionRequest(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Instruction1.mmInstructionIdentification, com.tools20022.repository.msg.Instruction1.mmRequestedExecutionDate,
						com.tools20022.repository.msg.Instruction1.mmVoteExecutionConfirmation, com.tools20022.repository.msg.Instruction1.mmAccountDetails, com.tools20022.repository.msg.Instruction1.mmProxy,
						com.tools20022.repository.msg.Instruction1.mmVoteDetails, com.tools20022.repository.msg.Instruction1.mmMeetingAttendee, com.tools20022.repository.msg.Instruction1.mmSpecificInstructionRequest);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionV02.mmInstruction);
				trace_lazy = () -> InstructionForMeeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instruction1";
				definition = "Provides information on the instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public Instruction1 setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = Objects.requireNonNull(instructionIdentification);
		return this;
	}

	public Optional<ISODateTime> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? Optional.empty() : Optional.of(requestedExecutionDate);
	}

	public Instruction1 setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public YesNoIndicator getVoteExecutionConfirmation() {
		return voteExecutionConfirmation;
	}

	public Instruction1 setVoteExecutionConfirmation(YesNoIndicator voteExecutionConfirmation) {
		this.voteExecutionConfirmation = Objects.requireNonNull(voteExecutionConfirmation);
		return this;
	}

	public SafekeepingAccount3 getAccountDetails() {
		return accountDetails;
	}

	public Instruction1 setAccountDetails(SafekeepingAccount3 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<Proxy2> getProxy() {
		return proxy == null ? Optional.empty() : Optional.of(proxy);
	}

	public Instruction1 setProxy(Proxy2 proxy) {
		this.proxy = proxy;
		return this;
	}

	public Optional<VoteDetails1> getVoteDetails() {
		return voteDetails == null ? Optional.empty() : Optional.of(voteDetails);
	}

	public Instruction1 setVoteDetails(VoteDetails1 voteDetails) {
		this.voteDetails = voteDetails;
		return this;
	}

	public List<IndividualPerson13> getMeetingAttendee() {
		return meetingAttendee == null ? meetingAttendee = new ArrayList<>() : meetingAttendee;
	}

	public Instruction1 setMeetingAttendee(List<IndividualPerson13> meetingAttendee) {
		this.meetingAttendee = Objects.requireNonNull(meetingAttendee);
		return this;
	}

	public Optional<SpecificInstructionRequest1> getSpecificInstructionRequest() {
		return specificInstructionRequest == null ? Optional.empty() : Optional.of(specificInstructionRequest);
	}

	public Instruction1 setSpecificInstructionRequest(SpecificInstructionRequest1 specificInstructionRequest) {
		this.specificInstructionRequest = specificInstructionRequest;
		return this;
	}
}