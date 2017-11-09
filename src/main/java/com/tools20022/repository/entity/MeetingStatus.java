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
import com.tools20022.repository.codeset.CancellationStatusCode;
import com.tools20022.repository.codeset.NotificationStatusCode;
import com.tools20022.repository.codeset.ResolutionStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Status of the instructions related to a meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingStatus" src="doc-files/MeetingStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationStatus
 * NotificationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationStatus1
 * NotificationStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus
 * MeetingInstructionGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails
 * MeetingInstructionStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
 * DetailedInstructionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
 * MeetingInstructionDetailedStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionProcessingStatus1
 * InstructionProcessingStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus2Choice
 * InstructionStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1
 * DetailedInstructionStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus1Choice
 * InstructionStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1
 * CancellationProcessingStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationStatus1Choice
 * CancellationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalStatus1
 * AdditionalStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus4Choice
 * InstructionStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8
 * DetailedInstructionStatus8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus3Choice
 * InstructionStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalStatus2
 * AdditionalStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancellationStatus2Choice
 * CancellationStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice
 * InstructionTypeStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2
 * DetailedInstructionStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9
 * DetailedInstructionStatus9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
 * DetailedInstructionStatus10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice
 * InstructionTypeStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus5Choice
 * InstructionStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus6Choice
 * InstructionStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
 * DetailedInstructionStatus11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionProcessingStatus3
 * InstructionProcessingStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationStatus2
 * NotificationStatus2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmStatus
 * Meeting.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingStatus
 * MeetingStatusReason.mmMeetingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmRejectionStatus
 * MeetingInstructionGlobalStatus.mmRejectionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmCancellationStatus
 * MeetingInstructionGlobalStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation#mmStatus
 * DetailedInstructionConfirmation.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmParticipationRegistrationConfirmation
 * MeetingInstructionDetailedStatus.mmParticipationRegistrationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmVotingInstructionConfirmation
 * MeetingInstructionDetailedStatus.mmVotingInstructionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmProxyAssignmentConfirmation
 * MeetingInstructionDetailedStatus.mmProxyAssignmentConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmMeetingAttendanceConfirmation
 * MeetingInstructionDetailedStatus.mmMeetingAttendanceConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmSecuritiesRegistrationConfirmation
 * MeetingInstructionDetailedStatus.mmSecuritiesRegistrationConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeetingResolutionStatus
 * MeetingStatus.mmMeetingResolutionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmInstructionCancellationStatus
 * MeetingStatus.mmInstructionCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#mmReason
 * MeetingStatus.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmNotificationStatus
 * MeetingStatus.mmNotificationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeeting
 * MeetingStatus.mmMeeting}</li>
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
 * "MeetingStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the instructions related to a meeting."</li>
 * </ul>
 */
public class MeetingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ResolutionStatusCode meetingResolutionStatus;
	/**
	 * Indicates whether the resolution is active or withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatusCode
	 * ResolutionStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#mmStatus
	 * Resolution1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#mmStatus
	 * Resolution2.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmResolutionStatus
	 * Vote7.mmResolutionStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmStatus
	 * Resolution3.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingResolutionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the resolution is active or withdrawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMeetingResolutionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Resolution1.mmStatus, Resolution2.mmStatus, Vote7.mmResolutionStatus, Resolution3.mmStatus);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MeetingResolutionStatus";
			definition = "Indicates whether the resolution is active or withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionStatusCode.mmObject();
		}
	};
	protected CancellationStatusCode instructionCancellationStatus;
	/**
	 * Status of the request for cancellation of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1#mmStatus
	 * CancellationProcessingStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice#mmProcessingStatus
	 * CancellationStatus1Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus2Choice#mmProcessingStatus
	 * CancellationStatus2Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#mmCancellationStatus
	 * InstructionTypeStatus1Choice.mmCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmCancellationStatus
	 * InstructionTypeStatus2Choice.mmCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the request for cancellation of an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionCancellationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationProcessingStatus1.mmStatus, CancellationStatus1Choice.mmProcessingStatus, CancellationStatus2Choice.mmProcessingStatus, InstructionTypeStatus1Choice.mmCancellationStatus,
					InstructionTypeStatus2Choice.mmCancellationStatus);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the request for cancellation of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingStatusReason> reason;
	/**
	 * Specifies the underlying reason for a status of a meeting or related
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingStatus
	 * MeetingStatusReason.mmMeetingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice#mmRejectionStatus
	 * CancellationStatus1Choice.mmRejectionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus2Choice#mmRejectionStatus
	 * CancellationStatus2Choice.mmRejectionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying reason for a status of a meeting or related instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationStatus1Choice.mmRejectionStatus, CancellationStatus2Choice.mmRejectionStatus);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.mmMeetingStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.mmObject();
		}
	};
	protected NotificationStatusCode notificationStatus;
	/**
	 * Specifies the status of the related notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
	 * NotificationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationStatus#mmStatus
	 * NotificationStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationStatus1#mmStatus
	 * NotificationStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationStatus2#mmStatus
	 * NotificationStatus2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the related notification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationStatus.mmStatus, NotificationStatus1.mmStatus, NotificationStatus2.mmStatus);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the related notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationStatusCode.mmObject();
		}
	};
	protected Meeting meeting;
	/**
	 * Meeting for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmStatus
	 * Meeting.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingStatus";
				definition = "Status of the instructions related to a meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmStatus, com.tools20022.repository.entity.MeetingStatusReason.mmMeetingStatus);
				derivationElement_lazy = () -> Arrays.asList(MeetingInstructionGlobalStatus.mmRejectionStatus, MeetingInstructionGlobalStatus.mmCancellationStatus, DetailedInstructionConfirmation.mmStatus,
						MeetingInstructionDetailedStatus.mmParticipationRegistrationConfirmation, MeetingInstructionDetailedStatus.mmVotingInstructionConfirmation, MeetingInstructionDetailedStatus.mmProxyAssignmentConfirmation,
						MeetingInstructionDetailedStatus.mmMeetingAttendanceConfirmation, MeetingInstructionDetailedStatus.mmSecuritiesRegistrationConfirmation);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(MeetingStatus.mmMeetingResolutionStatus, MeetingStatus.mmInstructionCancellationStatus, MeetingStatus.mmReason, MeetingStatus.mmNotificationStatus, MeetingStatus.mmMeeting);
				derivationComponent_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationStatus.mmObject(), NotificationStatus1.mmObject(), MeetingInstructionGlobalStatus.mmObject(),
						MeetingInstructionStatusDetails.mmObject(), DetailedInstructionConfirmation.mmObject(), MeetingInstructionDetailedStatus.mmObject(), InstructionProcessingStatus1.mmObject(), InstructionStatus2Choice.mmObject(),
						DetailedInstructionStatus1.mmObject(), InstructionStatus1Choice.mmObject(), CancellationProcessingStatus1.mmObject(), CancellationStatus1Choice.mmObject(), AdditionalStatus1.mmObject(),
						InstructionStatus4Choice.mmObject(), DetailedInstructionStatus8.mmObject(), InstructionStatus3Choice.mmObject(), AdditionalStatus2.mmObject(), CancellationStatus2Choice.mmObject(),
						InstructionTypeStatus1Choice.mmObject(), DetailedInstructionStatus2.mmObject(), DetailedInstructionStatus9.mmObject(), DetailedInstructionStatus10.mmObject(), InstructionTypeStatus2Choice.mmObject(),
						InstructionStatus5Choice.mmObject(), InstructionStatus6Choice.mmObject(), DetailedInstructionStatus11.mmObject(), InstructionProcessingStatus3.mmObject(), NotificationStatus2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ResolutionStatusCode getMeetingResolutionStatus() {
		return meetingResolutionStatus;
	}

	public void setMeetingResolutionStatus(ResolutionStatusCode meetingResolutionStatus) {
		this.meetingResolutionStatus = meetingResolutionStatus;
	}

	public CancellationStatusCode getInstructionCancellationStatus() {
		return instructionCancellationStatus;
	}

	public void setInstructionCancellationStatus(CancellationStatusCode instructionCancellationStatus) {
		this.instructionCancellationStatus = instructionCancellationStatus;
	}

	public List<MeetingStatusReason> getReason() {
		return reason;
	}

	public void setReason(List<com.tools20022.repository.entity.MeetingStatusReason> reason) {
		this.reason = reason;
	}

	public NotificationStatusCode getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationStatusCode notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
	}
}