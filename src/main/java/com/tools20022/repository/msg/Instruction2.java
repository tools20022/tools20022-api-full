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
import com.tools20022.repository.area.seev.MeetingInstructionV03;
import com.tools20022.repository.area.seev.MeetingInstructionV04;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionServicing;
import com.tools20022.repository.entity.InstructionForMeeting;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.Instruction2#mmInstructionIdentification
 * Instruction2.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction2#mmRequestedExecutionDate
 * Instruction2.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction2#mmVoteExecutionConfirmation
 * Instruction2.mmVoteExecutionConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#mmAccountDetails
 * Instruction2.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#mmProxy
 * Instruction2.mmProxy}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#mmVoteDetails
 * Instruction2.mmVoteDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#mmMeetingAttendee
 * Instruction2.mmMeetingAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction2#mmSpecificInstructionRequest
 * Instruction2.mmSpecificInstructionRequest}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV03#mmInstruction
 * MeetingInstructionV03.mmInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV04#mmInstruction
 * MeetingInstructionV04.mmInstruction}</li>
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
 * "Instruction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the instruction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction3 Instruction3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Instruction2", propOrder = {"instructionIdentification", "requestedExecutionDate", "voteExecutionConfirmation", "accountDetails", "proxy", "voteDetails", "meetingAttendee", "specificInstructionRequest"})
public class Instruction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text instructionIdentification;
	/**
	 * Identifies the detailed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmInstructionIdentification
	 * Instruction3.mmInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the detailed instruction.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmInstructionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime requestedExecutionDate;
	/**
	 * Date at which the instruction must be executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmRequestedExecutionDate
	 * Instruction3.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmRequestedExecutionDate;
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the instruction must be executed.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmRequestedExecutionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected YesNoIndicator voteExecutionConfirmation;
	/**
	 * Indicates that a Vote execution confirmation is requested.
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
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteExecutionConfirmation
	 * VoteInstructionRequest.mmVoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmVoteExecutionConfirmation
	 * Instruction3.mmVoteExecutionConfirmation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteExecutionConfirmation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmVoteExecutionConfirmation;
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "VoteExctnConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteExecutionConfirmation";
			definition = "Indicates that a Vote execution confirmation is requested.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmVoteExecutionConfirmation);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SafekeepingAccount4 accountDetails;
	/**
	 * Identification of the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmAccountDetails
	 * Instruction3.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmSecuritiesAccount;
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Identification of the securities account.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SafekeepingAccount4.mmObject();
		}
	};
	protected Proxy4 proxy;
	/**
	 * Identification of the person appointed by the security holder as proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Proxy4 Proxy4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmProxyAppointment
	 * InstructionForMeeting.mmProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction3#mmProxy
	 * Instruction3.mmProxy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxy = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmProxyAppointment;
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Identification of the person appointed by the security holder as proxy.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmProxy);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Proxy4.mmObject();
		}
	};
	protected VoteDetails2 voteDetails;
	/**
	 * Specifies detailed voting instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VoteDetails2
	 * VoteDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
	 * InstructionForMeeting.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction3#mmVoteDetails
	 * Instruction3.mmVoteDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmVoteInstruction;
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "VoteDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteDetails";
			definition = "Specifies detailed voting instructions.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmVoteDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VoteDetails2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.IndividualPerson17> meetingAttendee;
	/**
	 * Identification of the security holder who will attend and vote at the
	 * meeting in person and/or a person assigned by the security holder to
	 * attend the meeting without having any voting rights or taking any action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson17
	 * IndividualPerson17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmMeetingAttendee
	 * Instruction3.mmMeetingAttendee}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMeetingAttendee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "MtgAttndee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingAttendee";
			definition = "Identification of the security holder who will attend and vote at the meeting in person and/or a person assigned by the security holder to attend the meeting without having any voting rights or taking any action.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmMeetingAttendee);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson17.mmObject();
		}
	};
	protected SpecificInstructionRequest1 specificInstructionRequest;
	/**
	 * Request to execute specific instructions, such as participation
	 * registration, securities registration or blocking of securities.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmSpecificInstructionRequest
	 * Instruction3.mmSpecificInstructionRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpecificInstructionRequest = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InstructionForMeeting.mmObject();
			componentContext_lazy = () -> Instruction2.mmObject();
			isDerived = false;
			xmlTag = "SpcfcInstrReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificInstructionRequest";
			definition = "Request to execute specific instructions, such as participation registration, securities registration or blocking of securities.";
			nextVersions_lazy = () -> Arrays.asList(Instruction3.mmSpecificInstructionRequest);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SpecificInstructionRequest1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Instruction2.mmInstructionIdentification, Instruction2.mmRequestedExecutionDate, Instruction2.mmVoteExecutionConfirmation, Instruction2.mmAccountDetails, Instruction2.mmProxy,
						Instruction2.mmVoteDetails, Instruction2.mmMeetingAttendee, Instruction2.mmSpecificInstructionRequest);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionV03.mmInstruction, MeetingInstructionV04.mmInstruction);
				trace_lazy = () -> InstructionForMeeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instruction2";
				definition = "Provides information on the instruction.";
				nextVersions_lazy = () -> Arrays.asList(Instruction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstrId", required = true)
	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	@XmlElement(name = "ReqdExctnDt")
	public ISODateTime getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	@XmlElement(name = "VoteExctnConf", required = true)
	public YesNoIndicator getVoteExecutionConfirmation() {
		return voteExecutionConfirmation;
	}

	public void setVoteExecutionConfirmation(YesNoIndicator voteExecutionConfirmation) {
		this.voteExecutionConfirmation = voteExecutionConfirmation;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public SafekeepingAccount4 getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(com.tools20022.repository.msg.SafekeepingAccount4 accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "Prxy")
	public Proxy4 getProxy() {
		return proxy;
	}

	public void setProxy(com.tools20022.repository.msg.Proxy4 proxy) {
		this.proxy = proxy;
	}

	@XmlElement(name = "VoteDtls")
	public VoteDetails2 getVoteDetails() {
		return voteDetails;
	}

	public void setVoteDetails(com.tools20022.repository.msg.VoteDetails2 voteDetails) {
		this.voteDetails = voteDetails;
	}

	@XmlElement(name = "MtgAttndee")
	public List<IndividualPerson17> getMeetingAttendee() {
		return meetingAttendee;
	}

	public void setMeetingAttendee(List<com.tools20022.repository.msg.IndividualPerson17> meetingAttendee) {
		this.meetingAttendee = meetingAttendee;
	}

	@XmlElement(name = "SpcfcInstrReq")
	public SpecificInstructionRequest1 getSpecificInstructionRequest() {
		return specificInstructionRequest;
	}

	public void setSpecificInstructionRequest(com.tools20022.repository.msg.SpecificInstructionRequest1 specificInstructionRequest) {
		this.specificInstructionRequest = specificInstructionRequest;
	}
}