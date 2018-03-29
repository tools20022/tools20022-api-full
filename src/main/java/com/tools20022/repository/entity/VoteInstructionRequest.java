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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InstructionForMeeting;
import com.tools20022.repository.entity.ProxyAppointment;
import com.tools20022.repository.entity.Vote;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
	protected InstructionForMeeting meetingInstruction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<VoteInstructionRequest, Optional<InstructionForMeeting>> mmMeetingInstruction = new MMBusinessAssociationEnd<VoteInstructionRequest, Optional<InstructionForMeeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Meeting instruction which contains a vote instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InstructionForMeeting.mmVoteInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}

		@Override
		public Optional<InstructionForMeeting> getValue(VoteInstructionRequest obj) {
			return obj.getMeetingInstruction();
		}

		@Override
		public void setValue(VoteInstructionRequest obj, Optional<InstructionForMeeting> value) {
			obj.setMeetingInstruction(value.orElse(null));
		}
	};
	protected Vote votePerResolution;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<VoteInstructionRequest, Optional<Vote>> mmVotePerResolution = new MMBusinessAssociationEnd<VoteInstructionRequest, Optional<Vote>>() {
		{
			derivation_lazy = () -> Arrays.asList(VoteChoice.mmVoteInstruction, VoteInstruction.mmVotePerResolution, Vote1Choice.mmVoteInstruction, VoteDetails1.mmVoteInstructionForAgendaResolution, Vote2Choice.mmVoteInstruction,
					VoteDetails2.mmVoteInstructionForAgendaResolution, VoteInstruction1.mmVotePerResolution, DetailedInstructionStatus2.mmVotePerResolution, DetailedInstructionStatus9.mmVotePerResolution,
					DetailedInstructionStatus10.mmVotePerResolution, Vote3Choice.mmVoteInstruction, VoteDetails3.mmVoteInstructionForAgendaResolution);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotePerResolution";
			definition = "Specifies the number of votes to be cast for a specific resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Vote.mmVoteRequest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Vote.mmObject();
		}

		@Override
		public Optional<Vote> getValue(VoteInstructionRequest obj) {
			return obj.getVotePerResolution();
		}

		@Override
		public void setValue(VoteInstructionRequest obj, Optional<Vote> value) {
			obj.setVotePerResolution(value.orElse(null));
		}
	};
	protected Number discretionary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
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
	public static final MMBusinessAttribute<VoteInstructionRequest, Number> mmDiscretionary = new MMBusinessAttribute<VoteInstructionRequest, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(Vote1.mmDiscretionary, Vote4.mmDiscretionary, Vote6.mmDiscretionary, Vote8.mmDiscretionary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Number of votes for which decision is left to the party that will exercise the voting right.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(VoteInstructionRequest obj) {
			return obj.getDiscretionary();
		}

		@Override
		public void setValue(VoteInstructionRequest obj, Number value) {
			obj.setDiscretionary(value);
		}
	};
	protected VoteInstructionCode globalVoteInstruction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<VoteInstructionRequest, VoteInstructionCode> mmGlobalVoteInstruction = new MMBusinessAttribute<VoteInstructionRequest, VoteInstructionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(VoteChoice.mmGlobalVoteInstruction, Vote1Choice.mmGlobalVoteInstruction, Vote2Choice.mmGlobalVoteInstruction, Vote3Choice.mmGlobalVoteInstruction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalVoteInstruction";
			definition = "Vote instruction per resolution is cast for the entire entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		@Override
		public VoteInstructionCode getValue(VoteInstructionRequest obj) {
			return obj.getGlobalVoteInstruction();
		}

		@Override
		public void setValue(VoteInstructionRequest obj, VoteInstructionCode value) {
			obj.setGlobalVoteInstruction(value);
		}
	};
	protected VoteInstructionCode voteForMeetingResolution;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<VoteInstructionRequest, VoteInstructionCode> mmVoteForMeetingResolution = new MMBusinessAttribute<VoteInstructionRequest, VoteInstructionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Vote3.mmVoteOption, VoteInstructionForMeetingResolution.mmVoteIndication, VoteInstruction.mmVoteInstructionForMeetingResolution, VoteInstructionForMeetingResolution1.mmVoteIndication,
					VoteDetails1.mmVoteInstructionForMeetingResolution, VoteInstructionForMeetingResolution1Choice.mmVoteIndication, VoteDetails2.mmVoteInstructionForMeetingResolution, Vote9.mmVoteOption,
					VoteDetails3.mmVoteInstructionForMeetingResolution, VoteInstructionForMeetingResolution2Choice.mmVoteIndication);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteForMeetingResolution";
			definition = "Specifies the vote recommendation for resolutions added during the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}

		@Override
		public VoteInstructionCode getValue(VoteInstructionRequest obj) {
			return obj.getVoteForMeetingResolution();
		}

		@Override
		public void setValue(VoteInstructionRequest obj, VoteInstructionCode value) {
			obj.setVoteForMeetingResolution(value);
		}
	};
	protected YesNoIndicator voteExecutionConfirmation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<VoteInstructionRequest, YesNoIndicator> mmVoteExecutionConfirmation = new MMBusinessAttribute<VoteInstructionRequest, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(VoteInstruction.mmVoteExecutionConfirmation, Instruction1.mmVoteExecutionConfirmation, Instruction2.mmVoteExecutionConfirmation, Instruction3.mmVoteExecutionConfirmation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteExecutionConfirmation";
			definition = "Indicates that a Vote execution confirmation is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(VoteInstructionRequest obj) {
			return obj.getVoteExecutionConfirmation();
		}

		@Override
		public void setValue(VoteInstructionRequest obj, YesNoIndicator value) {
			obj.setVoteExecutionConfirmation(value);
		}
	};
	protected ProxyAppointment relatedProxyAppointment;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<VoteInstructionRequest, Optional<ProxyAppointment>> mmRelatedProxyAppointment = new MMBusinessAssociationEnd<VoteInstructionRequest, Optional<ProxyAppointment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment to which instructions are attached.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ProxyAppointment.mmVote;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProxyAppointment.mmObject();
		}

		@Override
		public Optional<ProxyAppointment> getValue(VoteInstructionRequest obj) {
			return obj.getRelatedProxyAppointment();
		}

		@Override
		public void setValue(VoteInstructionRequest obj, Optional<ProxyAppointment> value) {
			obj.setRelatedProxyAppointment(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionRequest";
				definition = "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification.";
				associationDomain_lazy = () -> Arrays.asList(ProxyAppointment.mmVote, InstructionForMeeting.mmVoteInstruction, Vote.mmVoteRequest);
				derivationElement_lazy = () -> Arrays.asList(VotingPartyAndInstruction.mmVotePerResolution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteInstructionRequest.mmMeetingInstruction, com.tools20022.repository.entity.VoteInstructionRequest.mmVotePerResolution,
						com.tools20022.repository.entity.VoteInstructionRequest.mmDiscretionary, com.tools20022.repository.entity.VoteInstructionRequest.mmGlobalVoteInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.mmVoteForMeetingResolution, com.tools20022.repository.entity.VoteInstructionRequest.mmVoteExecutionConfirmation,
						com.tools20022.repository.entity.VoteInstructionRequest.mmRelatedProxyAppointment);
				derivationComponent_lazy = () -> Arrays.asList(Vote3.mmObject(), VoteChoice.mmObject(), VotingPartyAndInstruction.mmObject(), VoteInstructionForMeetingResolution.mmObject(), VoteInstruction.mmObject(),
						Vote1Choice.mmObject(), VoteInstructionForMeetingResolution1.mmObject(), VoteDetails1.mmObject(), Vote2Choice.mmObject(), VoteInstructionForMeetingResolution1Choice.mmObject(), VoteDetails2.mmObject(),
						VoteInstruction1.mmObject(), Vote3Choice.mmObject(), Vote9.mmObject(), VoteDetails3.mmObject(), VoteInstructionForMeetingResolution2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return VoteInstructionRequest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InstructionForMeeting> getMeetingInstruction() {
		return meetingInstruction == null ? Optional.empty() : Optional.of(meetingInstruction);
	}

	public VoteInstructionRequest setMeetingInstruction(InstructionForMeeting meetingInstruction) {
		this.meetingInstruction = meetingInstruction;
		return this;
	}

	public Optional<Vote> getVotePerResolution() {
		return votePerResolution == null ? Optional.empty() : Optional.of(votePerResolution);
	}

	public VoteInstructionRequest setVotePerResolution(Vote votePerResolution) {
		this.votePerResolution = votePerResolution;
		return this;
	}

	public Number getDiscretionary() {
		return discretionary;
	}

	public VoteInstructionRequest setDiscretionary(Number discretionary) {
		this.discretionary = Objects.requireNonNull(discretionary);
		return this;
	}

	public VoteInstructionCode getGlobalVoteInstruction() {
		return globalVoteInstruction;
	}

	public VoteInstructionRequest setGlobalVoteInstruction(VoteInstructionCode globalVoteInstruction) {
		this.globalVoteInstruction = Objects.requireNonNull(globalVoteInstruction);
		return this;
	}

	public VoteInstructionCode getVoteForMeetingResolution() {
		return voteForMeetingResolution;
	}

	public VoteInstructionRequest setVoteForMeetingResolution(VoteInstructionCode voteForMeetingResolution) {
		this.voteForMeetingResolution = Objects.requireNonNull(voteForMeetingResolution);
		return this;
	}

	public YesNoIndicator getVoteExecutionConfirmation() {
		return voteExecutionConfirmation;
	}

	public VoteInstructionRequest setVoteExecutionConfirmation(YesNoIndicator voteExecutionConfirmation) {
		this.voteExecutionConfirmation = Objects.requireNonNull(voteExecutionConfirmation);
		return this;
	}

	public Optional<ProxyAppointment> getRelatedProxyAppointment() {
		return relatedProxyAppointment == null ? Optional.empty() : Optional.of(relatedProxyAppointment);
	}

	public VoteInstructionRequest setRelatedProxyAppointment(ProxyAppointment relatedProxyAppointment) {
		this.relatedProxyAppointment = relatedProxyAppointment;
		return this;
	}
}