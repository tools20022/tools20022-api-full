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
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmMeetingInstruction
 * VoteInstructionRequest.mmMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVotePerResolution
 * VoteInstructionRequest.mmVotePerResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmDiscretionary
 * VoteInstructionRequest.mmDiscretionary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmGlobalVoteInstruction
 * VoteInstructionRequest.mmGlobalVoteInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteForMeetingResolution
 * VoteInstructionRequest.mmVoteForMeetingResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteExecutionConfirmation
 * VoteInstructionRequest.mmVoteExecutionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmRelatedProxyAppointment
 * VoteInstructionRequest.mmRelatedProxyAppointment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ProxyAppointment#mmVote
 * ProxyAppointment.mmVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
 * InstructionForMeeting.mmVoteInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Vote#mmVoteRequest
 * Vote.mmVoteRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction#mmVotePerResolution
 * VotingPartyAndInstruction.mmVotePerResolution}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected InstructionForMeeting meetingInstruction;
	/**
	 * Meeting instruction which contains a vote instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmVoteInstruction
	 * InstructionForMeeting.mmVoteInstruction}</li>
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
	public static final MMBusinessAssociationEnd mmMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Meeting instruction which contains a vote instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmVoteInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
		}
	};
	protected Vote votePerResolution;
	/**
	 * Specifies the number of votes to be cast for a specific resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmVoteRequest
	 * Vote.mmVoteRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteChoice#mmVoteInstruction
	 * VoteChoice.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction#mmVotePerResolution
	 * VoteInstruction.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote1Choice#mmVoteInstruction
	 * Vote1Choice.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails1#mmVoteInstructionForAgendaResolution
	 * VoteDetails1.mmVoteInstructionForAgendaResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote2Choice#mmVoteInstruction
	 * Vote2Choice.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2#mmVoteInstructionForAgendaResolution
	 * VoteDetails2.mmVoteInstructionForAgendaResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction1#mmVotePerResolution
	 * VoteInstruction1.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#mmVotePerResolution
	 * DetailedInstructionStatus2.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmVotePerResolution
	 * DetailedInstructionStatus9.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmVotePerResolution
	 * DetailedInstructionStatus10.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote3Choice#mmVoteInstruction
	 * Vote3Choice.mmVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3#mmVoteInstructionForAgendaResolution
	 * VoteDetails3.mmVoteInstructionForAgendaResolution}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmVotePerResolution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.VoteChoice.mmVoteInstruction, com.tools20022.repository.msg.VoteInstruction.mmVotePerResolution,
					com.tools20022.repository.choice.Vote1Choice.mmVoteInstruction, com.tools20022.repository.msg.VoteDetails1.mmVoteInstructionForAgendaResolution, com.tools20022.repository.choice.Vote2Choice.mmVoteInstruction,
					com.tools20022.repository.msg.VoteDetails2.mmVoteInstructionForAgendaResolution, com.tools20022.repository.msg.VoteInstruction1.mmVotePerResolution,
					com.tools20022.repository.msg.DetailedInstructionStatus2.mmVotePerResolution, com.tools20022.repository.msg.DetailedInstructionStatus9.mmVotePerResolution,
					com.tools20022.repository.msg.DetailedInstructionStatus10.mmVotePerResolution, com.tools20022.repository.choice.Vote3Choice.mmVoteInstruction,
					com.tools20022.repository.msg.VoteDetails3.mmVoteInstructionForAgendaResolution);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotePerResolution";
			definition = "Specifies the number of votes to be cast for a specific resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Vote.mmVoteRequest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
		}
	};
	protected Number discretionary;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote1#mmDiscretionary
	 * Vote1.mmDiscretionary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote4#mmDiscretionary
	 * Vote4.mmDiscretionary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmDiscretionary
	 * Vote6.mmDiscretionary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote8#mmDiscretionary
	 * Vote8.mmDiscretionary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDiscretionary = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote1.mmDiscretionary, com.tools20022.repository.msg.Vote4.mmDiscretionary, com.tools20022.repository.msg.Vote6.mmDiscretionary,
					com.tools20022.repository.msg.Vote8.mmDiscretionary);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Number of votes for which decision is left to the party that will exercise the voting right.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected VoteInstructionCode globalVoteInstruction;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteChoice#mmGlobalVoteInstruction
	 * VoteChoice.mmGlobalVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote1Choice#mmGlobalVoteInstruction
	 * Vote1Choice.mmGlobalVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote2Choice#mmGlobalVoteInstruction
	 * Vote2Choice.mmGlobalVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Vote3Choice#mmGlobalVoteInstruction
	 * Vote3Choice.mmGlobalVoteInstruction}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmGlobalVoteInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.VoteChoice.mmGlobalVoteInstruction, com.tools20022.repository.choice.Vote1Choice.mmGlobalVoteInstruction,
					com.tools20022.repository.choice.Vote2Choice.mmGlobalVoteInstruction, com.tools20022.repository.choice.Vote3Choice.mmGlobalVoteInstruction);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalVoteInstruction";
			definition = "Vote instruction per resolution is cast for the entire entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	protected VoteInstructionCode voteForMeetingResolution;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote3#mmVoteOption
	 * Vote3.mmVoteOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution#mmVoteIndication
	 * VoteInstructionForMeetingResolution.mmVoteIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction#mmVoteInstructionForMeetingResolution
	 * VoteInstruction.mmVoteInstructionForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1#mmVoteIndication
	 * VoteInstructionForMeetingResolution1.mmVoteIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails1#mmVoteInstructionForMeetingResolution
	 * VoteDetails1.mmVoteInstructionForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice#mmVoteIndication
	 * VoteInstructionForMeetingResolution1Choice.mmVoteIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2#mmVoteInstructionForMeetingResolution
	 * VoteDetails2.mmVoteInstructionForMeetingResolution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote9#mmVoteOption
	 * Vote9.mmVoteOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3#mmVoteInstructionForMeetingResolution
	 * VoteDetails3.mmVoteInstructionForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice#mmVoteIndication
	 * VoteInstructionForMeetingResolution2Choice.mmVoteIndication}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmVoteForMeetingResolution = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote3.mmVoteOption, com.tools20022.repository.msg.VoteInstructionForMeetingResolution.mmVoteIndication,
					com.tools20022.repository.msg.VoteInstruction.mmVoteInstructionForMeetingResolution, com.tools20022.repository.msg.VoteInstructionForMeetingResolution1.mmVoteIndication,
					com.tools20022.repository.msg.VoteDetails1.mmVoteInstructionForMeetingResolution, com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice.mmVoteIndication,
					com.tools20022.repository.msg.VoteDetails2.mmVoteInstructionForMeetingResolution, com.tools20022.repository.msg.Vote9.mmVoteOption, com.tools20022.repository.msg.VoteDetails3.mmVoteInstructionForMeetingResolution,
					com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice.mmVoteIndication);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteForMeetingResolution";
			definition = "Specifies the vote recommendation for resolutions added during the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	protected YesNoIndicator voteExecutionConfirmation;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
	 * VoteInstructionRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstruction#mmVoteExecutionConfirmation
	 * VoteInstruction.mmVoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction1#mmVoteExecutionConfirmation
	 * Instruction1.mmVoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction2#mmVoteExecutionConfirmation
	 * Instruction2.mmVoteExecutionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmVoteExecutionConfirmation
	 * Instruction3.mmVoteExecutionConfirmation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmVoteExecutionConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteInstruction.mmVoteExecutionConfirmation, com.tools20022.repository.msg.Instruction1.mmVoteExecutionConfirmation,
					com.tools20022.repository.msg.Instruction2.mmVoteExecutionConfirmation, com.tools20022.repository.msg.Instruction3.mmVoteExecutionConfirmation);
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteExecutionConfirmation";
			definition = "Indicates that a Vote execution confirmation is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ProxyAppointment relatedProxyAppointment;
	/**
	 * Proxy appointment to which instructions are attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmVote
	 * ProxyAppointment.mmVote}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedProxyAppointment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment to which instructions are attached.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmVote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionRequest";
				definition = "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointment.mmVote, com.tools20022.repository.entity.InstructionForMeeting.mmVoteInstruction,
						com.tools20022.repository.entity.Vote.mmVoteRequest);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VotingPartyAndInstruction.mmVotePerResolution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteInstructionRequest.mmMeetingInstruction, com.tools20022.repository.entity.VoteInstructionRequest.mmVotePerResolution,
						com.tools20022.repository.entity.VoteInstructionRequest.mmDiscretionary, com.tools20022.repository.entity.VoteInstructionRequest.mmGlobalVoteInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.mmVoteForMeetingResolution, com.tools20022.repository.entity.VoteInstructionRequest.mmVoteExecutionConfirmation,
						com.tools20022.repository.entity.VoteInstructionRequest.mmRelatedProxyAppointment);
				derivationComponent_lazy = () -> Arrays.asList(Vote3.mmObject(), VoteChoice.mmObject(), VotingPartyAndInstruction.mmObject(), VoteInstructionForMeetingResolution.mmObject(), VoteInstruction.mmObject(),
						Vote1Choice.mmObject(), VoteInstructionForMeetingResolution1.mmObject(), VoteDetails1.mmObject(), Vote2Choice.mmObject(), VoteInstructionForMeetingResolution1Choice.mmObject(), VoteDetails2.mmObject(),
						VoteInstruction1.mmObject(), Vote3Choice.mmObject(), Vote9.mmObject(), VoteDetails3.mmObject(), VoteInstructionForMeetingResolution2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public InstructionForMeeting getMeetingInstruction() {
		return meetingInstruction;
	}

	public void setMeetingInstruction(com.tools20022.repository.entity.InstructionForMeeting meetingInstruction) {
		this.meetingInstruction = meetingInstruction;
	}

	public Vote getVotePerResolution() {
		return votePerResolution;
	}

	public void setVotePerResolution(com.tools20022.repository.entity.Vote votePerResolution) {
		this.votePerResolution = votePerResolution;
	}

	public Number getDiscretionary() {
		return discretionary;
	}

	public void setDiscretionary(Number discretionary) {
		this.discretionary = discretionary;
	}

	public VoteInstructionCode getGlobalVoteInstruction() {
		return globalVoteInstruction;
	}

	public void setGlobalVoteInstruction(VoteInstructionCode globalVoteInstruction) {
		this.globalVoteInstruction = globalVoteInstruction;
	}

	public VoteInstructionCode getVoteForMeetingResolution() {
		return voteForMeetingResolution;
	}

	public void setVoteForMeetingResolution(VoteInstructionCode voteForMeetingResolution) {
		this.voteForMeetingResolution = voteForMeetingResolution;
	}

	public YesNoIndicator getVoteExecutionConfirmation() {
		return voteExecutionConfirmation;
	}

	public void setVoteExecutionConfirmation(YesNoIndicator voteExecutionConfirmation) {
		this.voteExecutionConfirmation = voteExecutionConfirmation;
	}

	public ProxyAppointment getRelatedProxyAppointment() {
		return relatedProxyAppointment;
	}

	public void setRelatedProxyAppointment(com.tools20022.repository.entity.ProxyAppointment relatedProxyAppointment) {
		this.relatedProxyAppointment = relatedProxyAppointment;
	}
}