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
import com.tools20022.repository.codeset.CancellationStatusCode;
import com.tools20022.repository.codeset.NotificationStatusCode;
import com.tools20022.repository.codeset.ResolutionStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of the instructions related to a meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingStatus" src="doc-files/MeetingStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#MeetingResolutionStatus
 * MeetingStatus.MeetingResolutionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#InstructionCancellationStatus
 * MeetingStatus.InstructionCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#Reason
 * MeetingStatus.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatus#NotificationStatus
 * MeetingStatus.NotificationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#Meeting
 * MeetingStatus.Meeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Status
 * Meeting.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#MeetingStatus
 * MeetingStatusReason.MeetingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#RejectionStatus
 * MeetingInstructionGlobalStatus.RejectionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#CancellationStatus
 * MeetingInstructionGlobalStatus.CancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation#Status
 * DetailedInstructionConfirmation.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#ParticipationRegistrationConfirmation
 * MeetingInstructionDetailedStatus.ParticipationRegistrationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#VotingInstructionConfirmation
 * MeetingInstructionDetailedStatus.VotingInstructionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#ProxyAssignmentConfirmation
 * MeetingInstructionDetailedStatus.ProxyAssignmentConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#MeetingAttendanceConfirmation
 * MeetingInstructionDetailedStatus.MeetingAttendanceConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#SecuritiesRegistrationConfirmation
 * MeetingInstructionDetailedStatus.SecuritiesRegistrationConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#Status
	 * Resolution1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#Status
	 * Resolution2.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Vote7#ResolutionStatus
	 * Vote7.ResolutionStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#Status
	 * Resolution3.Status}</li>
	 * </ul>
	 * </li>
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
	 * name} = "MeetingResolutionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the resolution is active or withdrawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MeetingResolutionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.Status, com.tools20022.repository.msg.Resolution2.Status, com.tools20022.repository.msg.Vote7.ResolutionStatus,
					com.tools20022.repository.msg.Resolution3.Status);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingResolutionStatus";
			definition = "Indicates whether the resolution is active or withdrawn.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ResolutionStatusCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1#Status
	 * CancellationProcessingStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice#ProcessingStatus
	 * CancellationStatus1Choice.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus2Choice#ProcessingStatus
	 * CancellationStatus2Choice.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#CancellationStatus
	 * InstructionTypeStatus1Choice.CancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#CancellationStatus
	 * InstructionTypeStatus2Choice.CancellationStatus}</li>
	 * </ul>
	 * </li>
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
	 * name} = "InstructionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the request for cancellation of an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionCancellationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationProcessingStatus1.Status, com.tools20022.repository.choice.CancellationStatus1Choice.ProcessingStatus,
					com.tools20022.repository.choice.CancellationStatus2Choice.ProcessingStatus, com.tools20022.repository.choice.InstructionTypeStatus1Choice.CancellationStatus,
					com.tools20022.repository.choice.InstructionTypeStatus2Choice.CancellationStatus);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the request for cancellation of an instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the underlying reason for a status of a meeting or related
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#MeetingStatus
	 * MeetingStatusReason.MeetingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice#RejectionStatus
	 * CancellationStatus1Choice.RejectionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus2Choice#RejectionStatus
	 * CancellationStatus2Choice.RejectionStatus}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying reason for a status of a meeting or related instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CancellationStatus1Choice.RejectionStatus, com.tools20022.repository.choice.CancellationStatus2Choice.RejectionStatus);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
			minOccurs = 0;
			type_lazy = () -> MeetingStatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationStatus#Status
	 * NotificationStatus.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationStatus1#Status
	 * NotificationStatus1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationStatus2#Status
	 * NotificationStatus2.Status}</li>
	 * </ul>
	 * </li>
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
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the related notification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationStatus.Status, com.tools20022.repository.msg.NotificationStatus1.Status, com.tools20022.repository.msg.NotificationStatus2.Status);
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the related notification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NotificationStatusCode.mmObject();
		}
	};
	/**
	 * Meeting for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Meeting#Status
	 * Meeting.Status}</li>
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
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingStatus";
				definition = "Status of the instructions related to a meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.Status, com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionGlobalStatus.RejectionStatus, com.tools20022.repository.msg.MeetingInstructionGlobalStatus.CancellationStatus,
						com.tools20022.repository.msg.DetailedInstructionConfirmation.Status, com.tools20022.repository.msg.MeetingInstructionDetailedStatus.ParticipationRegistrationConfirmation,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.VotingInstructionConfirmation, com.tools20022.repository.msg.MeetingInstructionDetailedStatus.ProxyAssignmentConfirmation,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.MeetingAttendanceConfirmation, com.tools20022.repository.msg.MeetingInstructionDetailedStatus.SecuritiesRegistrationConfirmation);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatus.MeetingResolutionStatus, com.tools20022.repository.entity.MeetingStatus.InstructionCancellationStatus,
						com.tools20022.repository.entity.MeetingStatus.Reason, com.tools20022.repository.entity.MeetingStatus.NotificationStatus, com.tools20022.repository.entity.MeetingStatus.Meeting);
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
}