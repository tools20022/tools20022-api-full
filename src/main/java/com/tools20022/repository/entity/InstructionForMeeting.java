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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the position of the instructing party and the actions that it
 * wants to take in relation with the meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InstructionForMeeting"
 * src="doc-files/InstructionForMeeting.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#VoteInstruction
 * InstructionForMeeting.VoteInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#RequestedExecutionDate
 * InstructionForMeeting.RequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#RelatedServicing
 * InstructionForMeeting.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#MeetingAttendance
 * InstructionForMeeting.MeetingAttendance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#ProxyAppointment
 * InstructionForMeeting.ProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#MeetingIdentification
 * InstructionForMeeting.MeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#SecuritiesRegistration
 * InstructionForMeeting.SecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#BlockingSecurities
 * InstructionForMeeting.BlockingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#ParticipationRegistration
 * InstructionForMeeting.ParticipationRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#SafekeepingAccount
 * InstructionForMeeting.SafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedMeetingInstruction
 * SecuritiesAccount.RelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#RelatedMeetingInstruction
 * ProxyAppointment.RelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#MeetingInstruction
 * VoteInstructionRequest.MeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#RelatedMeeting
 * MeetingAttendance.RelatedMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingInstruction
 * MeetingServicing.MeetingInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction1#SpecificInstructionRequest
 * Instruction1.SpecificInstructionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction2#SpecificInstructionRequest
 * Instruction2.SpecificInstructionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Instruction3#SpecificInstructionRequest
 * Instruction3.SpecificInstructionRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequestInformation
 * RequestInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition2
 * SecurityPosition2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition1
 * SecurityPosition1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1
 * SpecificInstructionRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction1 Instruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction2 Instruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction3 Instruction3}</li>
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
 * "InstructionForMeeting"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the position of the instructing party and the actions that it wants to take in relation with the meeting."
 * </li>
 * </ul>
 */
public class InstructionForMeeting {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Request to cast detailed voting instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#MeetingInstruction
	 * VoteInstructionRequest.MeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#VoteDetails
	 * SecurityPosition2.VoteDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#VoteDetails
	 * SecurityPosition1.VoteDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#VoteDetails
	 * Instruction1.VoteDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#VoteDetails
	 * Instruction2.VoteDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition4#VoteInstruction
	 * SecurityPosition4.VoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3#VoteInstruction
	 * SecurityPosition3.VoteInstruction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction3#VoteDetails
	 * Instruction3.VoteDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to cast detailed voting instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VoteInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityPosition2.VoteDetails, com.tools20022.repository.msg.SecurityPosition1.VoteDetails, com.tools20022.repository.msg.Instruction1.VoteDetails,
					com.tools20022.repository.msg.Instruction2.VoteDetails, com.tools20022.repository.msg.SecurityPosition4.VoteInstruction, com.tools20022.repository.msg.SecurityPosition3.VoteInstruction,
					com.tools20022.repository.msg.Instruction3.VoteDetails);
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteInstruction";
			definition = "Request to cast detailed voting instructions.";
			minOccurs = 0;
			type_lazy = () -> VoteInstructionRequest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.MeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at which the instruction must be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction#RequestedExecutionDate
	 * VotingPartyAndInstruction.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction#RequestedExecutionDate
	 * VoteInstruction.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestInformation#RequestedExecutionDate
	 * RequestInformation.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction1#RequestedExecutionDate
	 * Instruction1.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction2#RequestedExecutionDate
	 * Instruction2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#RequestedExecutionDate
	 * Instruction3.RequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the instruction must be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedExecutionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VotingPartyAndInstruction.RequestedExecutionDate, com.tools20022.repository.msg.VoteInstruction.RequestedExecutionDate,
					com.tools20022.repository.msg.RequestInformation.RequestedExecutionDate, com.tools20022.repository.msg.Instruction1.RequestedExecutionDate, com.tools20022.repository.msg.Instruction2.RequestedExecutionDate,
					com.tools20022.repository.msg.Instruction3.RequestedExecutionDate);
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the instruction must be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Meeting servicing process which comprises the management of meeting
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingInstruction
	 * MeetingServicing.MeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting servicing process which comprises the management of meeting instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the management of meeting instructions.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MeetingServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instruction containing the information on the participation of the
	 * security holder or of its assigned representative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#RelatedMeeting
	 * MeetingAttendance.RelatedMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingAttendance
	 * MeetingAttendance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction containing the information on the participation of the security holder or of its assigned representative."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MeetingAttendance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendance";
			definition = "Instruction containing the information on the participation of the security holder or of its assigned representative.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Request to assign a proxy for participation to the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#RelatedMeetingInstruction
	 * ProxyAppointment.RelatedMeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#Proxy
	 * Instruction1.Proxy}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#Proxy
	 * Instruction2.Proxy}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instruction3#Proxy
	 * Instruction3.Proxy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to assign a proxy for participation to the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProxyAppointment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Instruction1.Proxy, com.tools20022.repository.msg.Instruction2.Proxy, com.tools20022.repository.msg.Instruction3.Proxy);
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointment";
			definition = "Request to assign a proxy for participation to the meeting.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.RelatedMeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification assigned to a general meeting by the party which has
	 * notified the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a general meeting by the party which has notified the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MeetingIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to a general meeting by the party which has notified the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Request to register the securities for the meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#SecuritiesRegistrationRequest
	 * SecurityPosition2.SecuritiesRegistrationRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#SecuritiesRegistrationRequest
	 * SecurityPosition1.SecuritiesRegistrationRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1#SecuritiesRegistration
	 * SpecificInstructionRequest1.SecuritiesRegistration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register the securities for the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesRegistration = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityPosition2.SecuritiesRegistrationRequest, com.tools20022.repository.msg.SecurityPosition1.SecuritiesRegistrationRequest,
					com.tools20022.repository.msg.SpecificInstructionRequest1.SecuritiesRegistration);
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRegistration";
			definition = "Request to register the securities for the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Request to block the securities
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#BlockingRequest
	 * SecurityPosition2.BlockingRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#BlockingRequest
	 * SecurityPosition1.BlockingRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1#BlockingSecurities
	 * SpecificInstructionRequest1.BlockingSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to block the securities"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BlockingSecurities = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityPosition2.BlockingRequest, com.tools20022.repository.msg.SecurityPosition1.BlockingRequest,
					com.tools20022.repository.msg.SpecificInstructionRequest1.BlockingSecurities);
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingSecurities";
			definition = "Request to block the securities";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Request to register for participation to the meeting.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#ParticipationRegistrationRequest
	 * SecurityPosition2.ParticipationRegistrationRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#ParticipationRegistrationRequest
	 * SecurityPosition1.ParticipationRegistrationRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1#ParticipationRegistration
	 * SpecificInstructionRequest1.ParticipationRegistration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register for participation to the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ParticipationRegistration = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityPosition2.ParticipationRegistrationRequest, com.tools20022.repository.msg.SecurityPosition1.ParticipationRegistrationRequest,
					com.tools20022.repository.msg.SpecificInstructionRequest1.ParticipationRegistration);
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParticipationRegistration";
			definition = "Request to register for participation to the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Account and balance for which the instruction is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedMeetingInstruction
	 * SecuritiesAccount.RelatedMeetingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account and balance for which the instruction is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SafekeepingAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account and balance for which the instruction is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedMeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionForMeeting";
				definition = "Identifies the position of the instructing party and the actions that it wants to take in relation with the meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.RelatedMeetingInstruction, com.tools20022.repository.entity.ProxyAppointment.RelatedMeetingInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.MeetingInstruction, com.tools20022.repository.entity.MeetingAttendance.RelatedMeeting, com.tools20022.repository.entity.MeetingServicing.MeetingInstruction);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Instruction1.SpecificInstructionRequest, com.tools20022.repository.msg.Instruction2.SpecificInstructionRequest,
						com.tools20022.repository.msg.Instruction3.SpecificInstructionRequest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InstructionForMeeting.VoteInstruction, com.tools20022.repository.entity.InstructionForMeeting.RequestedExecutionDate,
						com.tools20022.repository.entity.InstructionForMeeting.RelatedServicing, com.tools20022.repository.entity.InstructionForMeeting.MeetingAttendance,
						com.tools20022.repository.entity.InstructionForMeeting.ProxyAppointment, com.tools20022.repository.entity.InstructionForMeeting.MeetingIdentification,
						com.tools20022.repository.entity.InstructionForMeeting.SecuritiesRegistration, com.tools20022.repository.entity.InstructionForMeeting.BlockingSecurities,
						com.tools20022.repository.entity.InstructionForMeeting.ParticipationRegistration, com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount);
				derivationComponent_lazy = () -> Arrays.asList(RequestInformation.mmObject(), SecurityPosition2.mmObject(), SecurityPosition1.mmObject(), SpecificInstructionRequest1.mmObject(), Instruction1.mmObject(),
						Instruction2.mmObject(), Instruction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}