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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decision of the voting party for one resolution. Several types of decisions
 * can be indicated to allow for split vote specification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="VoteInstructionRequest"
 * src="doc-files/VoteInstructionRequest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#MeetingInstruction
 * VoteInstructionRequest.MeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#VotePerResolution
 * VoteInstructionRequest.VotePerResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#Discretionary
 * VoteInstructionRequest.Discretionary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#GlobalVoteInstruction
 * VoteInstructionRequest.GlobalVoteInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#VoteForMeetingResolution
 * VoteInstructionRequest.VoteForMeetingResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#VoteExecutionConfirmation
 * VoteInstructionRequest.VoteExecutionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#RelatedProxyAppointment
 * VoteInstructionRequest.RelatedProxyAppointment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ProxyAppointment#Vote
 * ProxyAppointment.Vote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#VoteInstruction
 * InstructionForMeeting.VoteInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#VoteRequest
 * Vote.VoteRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction#VotePerResolution
 * VotingPartyAndInstruction.VotePerResolution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Vote3 Vote3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.VoteChoice VoteChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction
 * VotingPartyAndInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution
 * VoteInstructionForMeetingResolution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteInstruction
 * VoteInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Vote1Choice Vote1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1
 * VoteInstructionForMeetingResolution1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteDetails1 VoteDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Vote2Choice Vote2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice
 * VoteInstructionForMeetingResolution1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteDetails2 VoteDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteInstruction1
 * VoteInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Vote3Choice Vote3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote9 Vote9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteDetails3 VoteDetails3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice
 * VoteInstructionForMeetingResolution2Choice}</li>
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
 * "VoteInstructionRequest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification."
 * </li>
 * </ul>
 */
public class VoteInstructionRequest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting instruction which contains a vote instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#VoteInstruction
	 * InstructionForMeeting.VoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting instruction which contains a vote instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MeetingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Meeting instruction which contains a vote instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InstructionForMeeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.VoteInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the number of votes to be cast for a specific resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Vote#VoteRequest
	 * Vote.VoteRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteChoice#VoteInstruction
	 * VoteChoice.VoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction#VotePerResolution
	 * VoteInstruction.VotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote1Choice#VoteInstruction
	 * Vote1Choice.VoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails1#VoteInstructionForAgendaResolution
	 * VoteDetails1.VoteInstructionForAgendaResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote2Choice#VoteInstruction
	 * Vote2Choice.VoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2#VoteInstructionForAgendaResolution
	 * VoteDetails2.VoteInstructionForAgendaResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction1#VotePerResolution
	 * VoteInstruction1.VotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#VotePerResolution
	 * DetailedInstructionStatus2.VotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#VotePerResolution
	 * DetailedInstructionStatus9.VotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#VotePerResolution
	 * DetailedInstructionStatus10.VotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote3Choice#VoteInstruction
	 * Vote3Choice.VoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3#VoteInstructionForAgendaResolution
	 * VoteDetails3.VoteInstructionForAgendaResolution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotePerResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of votes to be cast for a specific resolution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VotePerResolution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.VoteChoice.VoteInstruction, com.tools20022.repository.msg.VoteInstruction.VotePerResolution, com.tools20022.repository.choice.Vote1Choice.VoteInstruction,
					com.tools20022.repository.msg.VoteDetails1.VoteInstructionForAgendaResolution, com.tools20022.repository.choice.Vote2Choice.VoteInstruction, com.tools20022.repository.msg.VoteDetails2.VoteInstructionForAgendaResolution,
					com.tools20022.repository.msg.VoteInstruction1.VotePerResolution, com.tools20022.repository.msg.DetailedInstructionStatus2.VotePerResolution, com.tools20022.repository.msg.DetailedInstructionStatus9.VotePerResolution,
					com.tools20022.repository.msg.DetailedInstructionStatus10.VotePerResolution, com.tools20022.repository.choice.Vote3Choice.VoteInstruction, com.tools20022.repository.msg.VoteDetails3.VoteInstructionForAgendaResolution);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotePerResolution";
			definition = "Specifies the number of votes to be cast for a specific resolution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Vote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Vote.VoteRequest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of votes for which decision is left to the party that will
	 * exercise the voting right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#Discretionary
	 * Vote1.Discretionary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#Discretionary
	 * Vote4.Discretionary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#Discretionary
	 * Vote6.Discretionary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#Discretionary
	 * Vote8.Discretionary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes for which decision is left to the party that will exercise the voting right."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Discretionary = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.Discretionary, com.tools20022.repository.msg.Vote4.Discretionary, com.tools20022.repository.msg.Vote6.Discretionary,
					com.tools20022.repository.msg.Vote8.Discretionary);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Number of votes for which decision is left to the party that will exercise the voting right.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Vote instruction per resolution is cast for the entire entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteChoice#GlobalVoteInstruction
	 * VoteChoice.GlobalVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote1Choice#GlobalVoteInstruction
	 * Vote1Choice.GlobalVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote2Choice#GlobalVoteInstruction
	 * Vote2Choice.GlobalVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote3Choice#GlobalVoteInstruction
	 * Vote3Choice.GlobalVoteInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalVoteInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote instruction per resolution is cast for the entire entitlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GlobalVoteInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.VoteChoice.GlobalVoteInstruction, com.tools20022.repository.choice.Vote1Choice.GlobalVoteInstruction,
					com.tools20022.repository.choice.Vote2Choice.GlobalVoteInstruction, com.tools20022.repository.choice.Vote3Choice.GlobalVoteInstruction);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalVoteInstruction";
			definition = "Vote instruction per resolution is cast for the entire entitlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Specifies the vote recommendation for resolutions added during the
	 * meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
	 * VoteInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote3#VoteOption
	 * Vote3.VoteOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution#VoteIndication
	 * VoteInstructionForMeetingResolution.VoteIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction#VoteInstructionForMeetingResolution
	 * VoteInstruction.VoteInstructionForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1#VoteIndication
	 * VoteInstructionForMeetingResolution1.VoteIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails1#VoteInstructionForMeetingResolution
	 * VoteDetails1.VoteInstructionForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice#VoteIndication
	 * VoteInstructionForMeetingResolution1Choice.VoteIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2#VoteInstructionForMeetingResolution
	 * VoteDetails2.VoteInstructionForMeetingResolution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote9#VoteOption
	 * Vote9.VoteOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3#VoteInstructionForMeetingResolution
	 * VoteDetails3.VoteInstructionForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice#VoteIndication
	 * VoteInstructionForMeetingResolution2Choice.VoteIndication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteForMeetingResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the vote recommendation for resolutions added during the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VoteForMeetingResolution = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote3.VoteOption, com.tools20022.repository.msg.VoteInstructionForMeetingResolution.VoteIndication,
					com.tools20022.repository.msg.VoteInstruction.VoteInstructionForMeetingResolution, com.tools20022.repository.msg.VoteInstructionForMeetingResolution1.VoteIndication,
					com.tools20022.repository.msg.VoteDetails1.VoteInstructionForMeetingResolution, com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice.VoteIndication,
					com.tools20022.repository.msg.VoteDetails2.VoteInstructionForMeetingResolution, com.tools20022.repository.msg.Vote9.VoteOption, com.tools20022.repository.msg.VoteDetails3.VoteInstructionForMeetingResolution,
					com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice.VoteIndication);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteForMeetingResolution";
			definition = "Specifies the vote recommendation for resolutions added during the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates that a Vote execution confirmation is requested.
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
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction#VoteExecutionConfirmation
	 * VoteInstruction.VoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction1#VoteExecutionConfirmation
	 * Instruction1.VoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction2#VoteExecutionConfirmation
	 * Instruction2.VoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#VoteExecutionConfirmation
	 * Instruction3.VoteExecutionConfirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteExecutionConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a Vote execution confirmation is requested."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VoteExecutionConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteInstruction.VoteExecutionConfirmation, com.tools20022.repository.msg.Instruction1.VoteExecutionConfirmation,
					com.tools20022.repository.msg.Instruction2.VoteExecutionConfirmation, com.tools20022.repository.msg.Instruction3.VoteExecutionConfirmation);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteExecutionConfirmation";
			definition = "Indicates that a Vote execution confirmation is requested.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Proxy appointment to which instructions are attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#Vote
	 * ProxyAppointment.Vote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProxyAppointment
	 * ProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProxyAppointment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proxy appointment to which instructions are attached."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedProxyAppointment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment to which instructions are attached.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProxyAppointment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.Vote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionRequest";
				definition = "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointment.Vote, com.tools20022.repository.entity.InstructionForMeeting.VoteInstruction, com.tools20022.repository.entity.Vote.VoteRequest);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VotingPartyAndInstruction.VotePerResolution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteInstructionRequest.MeetingInstruction, com.tools20022.repository.entity.VoteInstructionRequest.VotePerResolution,
						com.tools20022.repository.entity.VoteInstructionRequest.Discretionary, com.tools20022.repository.entity.VoteInstructionRequest.GlobalVoteInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.VoteForMeetingResolution, com.tools20022.repository.entity.VoteInstructionRequest.VoteExecutionConfirmation,
						com.tools20022.repository.entity.VoteInstructionRequest.RelatedProxyAppointment);
				derivationComponent_lazy = () -> Arrays.asList(Vote3.mmObject(), VoteChoice.mmObject(), VotingPartyAndInstruction.mmObject(), VoteInstructionForMeetingResolution.mmObject(), VoteInstruction.mmObject(),
						Vote1Choice.mmObject(), VoteInstructionForMeetingResolution1.mmObject(), VoteDetails1.mmObject(), Vote2Choice.mmObject(), VoteInstructionForMeetingResolution1Choice.mmObject(), VoteDetails2.mmObject(),
						VoteInstruction1.mmObject(), Vote3Choice.mmObject(), Vote9.mmObject(), VoteDetails3.mmObject(), VoteInstructionForMeetingResolution2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}