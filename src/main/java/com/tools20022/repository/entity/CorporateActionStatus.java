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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of the corporate action process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionStatus"
 * src="doc-files/CorporateActionStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#AgentStandingInstructionStatus
 * CorporateActionStatus.AgentStandingInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#ProcessingStatus
 * CorporateActionStatus.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventProcessingStatus
 * CorporateActionStatus.EventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionStatusReason
 * CorporateActionStatus.CorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#InstructionCancellationStatus
 * CorporateActionStatus.InstructionCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionInstructionProcessingStatus
 * CorporateActionStatus.CorporateActionInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#RateStatus
 * CorporateActionStatus.RateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#OptionAvailabilityStatus
 * CorporateActionStatus.OptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionEvent
 * CorporateActionStatus.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventStatus
 * CorporateActionStatus.EventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#RelatedInstructionProcessedStatus
 * CorporateActionStatus.RelatedInstructionProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#DeactivationDateAndTime
 * CorporateActionStatus.DeactivationDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventConfirmationStatus
 * CorporateActionStatus.EventConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#EventCompletenessStatus
 * CorporateActionStatus.EventCompletenessStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionStatus
 * CorporateActionStatusReason.CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionStatus
 * CorporateActionEvent.CorporateActionStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#ProcessingStatus
 * CorporateActionCancellation1.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2#ProcessingStatus
 * CorporateActionCancellation2.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus1Choice#Complete
 * EventProcessingStatus1Choice.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus1Choice#Reconciled
 * EventProcessingStatus1Choice.Reconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus2Choice#Complete
 * EventProcessingStatus2Choice.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus2Choice#Reconciled
 * EventProcessingStatus2Choice.Reconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus1Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus2Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus3Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus4Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus5Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus6Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#ProprietaryStatus
 * InstructionProcessingStatus1Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#ProprietaryStatus
 * InstructionProcessingStatus4Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#ProprietaryStatus
 * InstructionProcessingStatus7Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#ProprietaryStatus
 * InstructionProcessingStatus8Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#ProprietaryStatus
 * InstructionProcessingStatus12Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#ProprietaryStatus
 * InstructionProcessingStatus13Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAdviceStatus1Choice#ProcessedStatus
 * ElectionAdviceStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAdviceStatus1Choice#RejectedStatus
 * ElectionAdviceStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1#Status
 * CorporateActionCancellationProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionCancellationStatus1Choice#ProcessedStatus
 * ElectionCancellationStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionCancellationStatus1Choice#RejectedStatus
 * ElectionCancellationStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1#Status
 * CorporateActionAmendmentProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice#ProcessedStatus
 * ElectionAmendmentStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice#RejectedStatus
 * ElectionAmendmentStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1#Status
 * CorporateActionMovementProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#ResourceDetails
 * CorporateActionMovementFailedStatus1.ResourceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#ProcessedStatus
 * CorporateActionMovementStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#FailedStatus
 * CorporateActionMovementStatus1Choice.FailedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#RejectedStatus
 * CorporateActionMovementStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2#Status
 * CorporationActionMovementProcessingStatus2.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateMovementStatus2#ProcessedStatus
 * CorporateMovementStatus2.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateMovementStatus2#RejectedStatus
 * CorporateMovementStatus2.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1#Status
 * CorporateActionInformationProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice#ProcessedStatus
 * CorporateActionInformationStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice#RejectedStatus
 * CorporateActionInformationStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionStatus1Choice#ProcessedStatus
 * StandingInstructionStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionStatus1Choice#RejectedStatus
 * StandingInstructionStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1#Status
 * CorporateActionStandingInstructionCancellationProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice#ProcessedStatus
 * StandingInstructionCancellationStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice#RejectedStatus
 * StandingInstructionCancellationStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1#Status
 * CorporateActionDeactivationInstructionProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#ProcessedStatus
 * CorporateActionDeactivationInstructionStatus1.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#RejectedStatus
 * CorporateActionDeactivationInstructionStatus1.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1#Status
 * CorporateActionDeactivationCancellationProcessingStatus1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice#ProcessedStatus
 * CorporateActionDeactivationCancellationStatus1Choice.ProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice#RejectedStatus
 * CorporateActionDeactivationCancellationStatus1Choice.RejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#ProcessingStatus
 * CorporateActionCancellation3.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#ProprietaryStatus
 * InstructionProcessingStatus15Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#ProprietaryStatus
 * InstructionProcessingStatus16Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#ProcessingStatus
 * CorporateActionCancellation4.ProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#ProprietaryStatus
 * InstructionProcessingStatus20Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus7Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#ProprietaryStatus
 * InstructionProcessingStatus21Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus8Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#Complete
 * EventProcessingStatus3Choice.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#Reconciled
 * EventProcessingStatus3Choice.Reconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus9Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#ProprietaryStatus
 * InstructionProcessingStatus24Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus10Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#ProprietaryStatus
 * InstructionProcessingStatus25Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus4Choice#Complete
 * EventProcessingStatus4Choice.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus4Choice#Reconciled
 * EventProcessingStatus4Choice.Reconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus11Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#ProprietaryStatus
 * InstructionProcessingStatus29Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#ProprietaryStatus
 * InstructionCancellationRequestStatus12Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#ProprietaryStatus
 * InstructionProcessingStatus30Choice.ProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1
 * CorporateActionEventStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice
 * CorporateActionProcessingStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus1Choice
 * EventProcessingStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus2Choice
 * EventProcessingStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice
 * InstructionCancellationRequestStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice
 * InstructionCancellationRequestStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice
 * InstructionCancellationRequestStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice
 * InstructionCancellationRequestStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice
 * InstructionCancellationRequestStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice
 * InstructionCancellationRequestStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateStatus1Choice
 * RateStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateStatus2Choice
 * RateStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice
 * CorporateActionProcessingStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus3Choice
 * CorporateActionProcessingStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice
 * CorporateActionEventStatus2FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessedStatus2FormatChoice
 * ProcessedStatus2FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessedStatus1FormatChoice
 * ProcessedStatus1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessedStatus3FormatChoice
 * ProcessedStatus3FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1
 * CorporateActionInstructionProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1
 * CorporateActionInstructionRejectionStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ElectionAdviceStatus1Choice
 * ElectionAdviceStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessedStatus5FormatChoice
 * ProcessedStatus5FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1
 * CorporateActionCancellationProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1
 * CorporateActionCancellationRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionCancellationStatus1Choice
 * ElectionCancellationStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1
 * CorporateActionAmendmentProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1
 * CorporateActionAmendmentRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice
 * ElectionAmendmentStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1
 * CorporateActionMovementProcessingStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FailedMovement1
 * FailedMovement1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1
 * CorporateActionMovementFailedStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1
 * CorporateActionMovementRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice
 * CorporateActionMovementStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2
 * CorporateActionMovementRejectionStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateMovementStatus2
 * CorporateMovementStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1
 * CorporateActionInformationProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1
 * CorporateActionInformationRejectedStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice
 * CorporateActionInformationStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1
 * CorporateActionStandingInstructionProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1
 * CorporateActionStandingInstructionRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionStatus1Choice
 * StandingInstructionStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessedStatus4FormatChoice
 * ProcessedStatus4FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1
 * CorporateActionStandingInstructionCancellationProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1
 * CorporateActionStandingInstructionCancellationRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice
 * StandingInstructionCancellationStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessedStatus6FormatChoice
 * ProcessedStatus6FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1
 * CorporateActionDeactivationInstructionProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1
 * CorporateActionDeactivationInstructionRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1
 * CorporateActionDeactivationInstructionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1
 * CorporateActionDeactivationCancellationProcessingStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1
 * CorporateActionDeactivationCancellationRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice
 * CorporateActionDeactivationCancellationStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice
 * CorporateActionEventProcessingStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice
 * CorporateActionEventProcessingStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus1FormatChoice
 * CorporateActionEventStatus1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus3FormatChoice
 * CorporateActionEventStatus3FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice
 * CorporateActionProcessingStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice
 * InstructionCancellationRequestStatus7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice
 * InstructionCancellationRequestStatus8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus3Choice
 * CorporateActionEventProcessingStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice
 * EventProcessingStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice
 * InstructionCancellationRequestStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateStatus3Choice
 * RateStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice
 * CorporateActionProcessingStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice
 * InstructionCancellationRequestStatus10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus4Choice
 * EventProcessingStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateStatus4Choice
 * RateStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice
 * CorporateActionEventProcessingStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus6Choice
 * CorporateActionProcessingStatus6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice
 * InstructionCancellationRequestStatus11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice
 * InstructionCancellationRequestStatus12Choice}</li>
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
 * "CorporateActionStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the corporate action process."</li>
 * </ul>
 */
public class CorporateActionStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the state or the condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#Proprietary
	 * Status2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#Proprietary
	 * Status4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice#Proprietary
	 * RegistrationProcessingStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus1Choice#Proprietary
	 * ResponseStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice#Proprietary
	 * ReplacementProcessingStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus2Choice#Proprietary
	 * RegistrationProcessingStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus2Choice#Proprietary
	 * ResponseStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus2Choice#Proprietary
	 * ReplacementProcessingStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus5Choice#Proprietary
	 * ResponseStatus5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice#Proprietary
	 * ReplacementProcessingStatus8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus3Choice#Proprietary
	 * RegistrationProcessingStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus4Choice#Proprietary
	 * RegistrationProcessingStatus4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus7Choice#Proprietary
	 * ResponseStatus7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus9Choice#Proprietary
	 * ReplacementProcessingStatus9Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentStandingInstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state or the condition."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AgentStandingInstructionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status2Choice.Proprietary, com.tools20022.repository.choice.Status4Choice.Proprietary,
					com.tools20022.repository.choice.RegistrationProcessingStatus1Choice.Proprietary, com.tools20022.repository.choice.ResponseStatus1Choice.Proprietary,
					com.tools20022.repository.choice.ReplacementProcessingStatus1Choice.Proprietary, com.tools20022.repository.choice.RegistrationProcessingStatus2Choice.Proprietary,
					com.tools20022.repository.choice.ResponseStatus2Choice.Proprietary, com.tools20022.repository.choice.ReplacementProcessingStatus2Choice.Proprietary, com.tools20022.repository.choice.ResponseStatus5Choice.Proprietary,
					com.tools20022.repository.choice.ReplacementProcessingStatus8Choice.Proprietary, com.tools20022.repository.choice.RegistrationProcessingStatus3Choice.Proprietary,
					com.tools20022.repository.choice.RegistrationProcessingStatus4Choice.Proprietary, com.tools20022.repository.choice.ResponseStatus7Choice.Proprietary,
					com.tools20022.repository.choice.ReplacementProcessingStatus9Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgentStandingInstructionStatus";
			definition = "Specifies the state or the condition.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the status of the details of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode
	 * ProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1#EventCompletenessStatus
	 * CorporateActionEventStatus1.EventCompletenessStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1#EventConfirmationStatus
	 * CorporateActionEventStatus1.EventConfirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice#EventStatus
	 * CorporateActionProcessingStatus1Choice.EventStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1#ProcessingStatus
	 * CorporateActionPreliminaryAdviceType1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice#Code
	 * CorporateActionProcessingStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice#Proprietary
	 * CorporateActionProcessingStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus3Choice#Code
	 * CorporateActionProcessingStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus3Choice#Proprietary
	 * CorporateActionProcessingStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice#Code
	 * CorporateActionProcessingStatus4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice#Proprietary
	 * CorporateActionProcessingStatus4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice#Code
	 * CorporateActionProcessingStatus5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice#Proprietary
	 * CorporateActionProcessingStatus5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus6Choice#Code
	 * CorporateActionProcessingStatus6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus6Choice#Proprietary
	 * CorporateActionProcessingStatus6Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the details of the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventStatus1.EventCompletenessStatus, com.tools20022.repository.msg.CorporateActionEventStatus1.EventConfirmationStatus,
					com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice.EventStatus, com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1.ProcessingStatus,
					com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice.Code, com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionProcessingStatus3Choice.Code, com.tools20022.repository.choice.CorporateActionProcessingStatus3Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice.Code, com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice.Code, com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionProcessingStatus6Choice.Code, com.tools20022.repository.choice.CorporateActionProcessingStatus6Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Processing status of the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode
	 * CorporateActionEventProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice#Code
	 * CorporateActionEventProcessingStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice#Proprietary
	 * CorporateActionEventProcessingStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#CorporateActionEventProcessingStatus
	 * Status1Choice.CorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#CorporateActionEventProcessingStatus
	 * Status8Choice.CorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice#Code
	 * CorporateActionEventProcessingStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice#Proprietary
	 * CorporateActionEventProcessingStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#CorporateActionEventProcessingStatus
	 * Status3Choice.CorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#CorporateActionEventProcessingStatus
	 * Status10Choice.CorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus3Choice#Code
	 * CorporateActionEventProcessingStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus3Choice#Proprietary
	 * CorporateActionEventProcessingStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#CorporateActionEventProcessingStatus
	 * Status19Choice.CorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#CorporateActionEventProcessingStatus
	 * Status22Choice.CorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice#Code
	 * CorporateActionEventProcessingStatus4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice#Proprietary
	 * CorporateActionEventProcessingStatus4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing status of the corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice.Proprietary,
					com.tools20022.repository.choice.Status1Choice.CorporateActionEventProcessingStatus, com.tools20022.repository.choice.Status8Choice.CorporateActionEventProcessingStatus,
					com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice.Proprietary,
					com.tools20022.repository.choice.Status3Choice.CorporateActionEventProcessingStatus, com.tools20022.repository.choice.Status10Choice.CorporateActionEventProcessingStatus,
					com.tools20022.repository.choice.CorporateActionEventProcessingStatus3Choice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingStatus3Choice.Proprietary,
					com.tools20022.repository.choice.Status19Choice.CorporateActionEventProcessingStatus, com.tools20022.repository.choice.Status22Choice.CorporateActionEventProcessingStatus,
					com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice.Code, com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventProcessingStatus";
			definition = "Processing status of the corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reasons for the status. It is derived from the relationship
	 * between Status and Status Reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionStatus
	 * CorporateActionStatusReason.CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus1Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#CancellationCompleted
	 * InstructionCancellationRequestStatus2Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1#Reason
	 * CorporateActionCancellationRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1#Reason
	 * CorporateActionInformationRejectedStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1#Reason
	 * CorporateActionStandingInstructionCancellationRejectionStatus1.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionStatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice.CancellationCompleted,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice.CancellationCompleted, com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1.Reason,
					com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1.Reason, com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1.Reason);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatusReason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the instruction cancellation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode
	 * CorporateActionInstructionCancellationProcessingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the instruction cancellation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionCancellationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the instruction cancellation process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Status of the corporate action instruction process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode
	 * CorporateActionInstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#Received
	 * ProcessingStatus43Choice.Received}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionInstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action instruction process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CorporateActionInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProcessingStatus43Choice.Received);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionInstructionProcessingStatus";
			definition = "Status of the corporate action instruction process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Specifies whether the rate is indicative or actual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateStatusCode
	 * RateStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1#RateStatus
	 * RateTypeAndAmountAndStatus1.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3#RateStatus
	 * RateTypeAndAmountAndStatus3.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4#RateStatus
	 * RateTypeAndAmountAndStatus4.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5#RateStatus
	 * RateTypeAndAmountAndStatus5.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6#RateStatus
	 * RateTypeAndAmountAndStatus6.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2#RateStatus
	 * RateTypeAndAmountAndStatus2.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7#RateStatus
	 * RateTypeAndAmountAndStatus7.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8#RateStatus
	 * RateTypeAndAmountAndStatus8.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9#RateStatus
	 * RateTypeAndAmountAndStatus9.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10#RateStatus
	 * RateTypeAndAmountAndStatus10.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#RateStatus
	 * RateTypeAndAmountAndStatus11.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12#RateStatus
	 * RateTypeAndAmountAndStatus12.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15#RateStatus
	 * RateTypeAndAmountAndStatus15.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16#RateStatus
	 * RateTypeAndAmountAndStatus16.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13#RateStatus
	 * RateTypeAndAmountAndStatus13.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#RateStatus
	 * RateTypeAndAmountAndStatus14.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17#RateStatus
	 * RateTypeAndAmountAndStatus17.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18#RateStatus
	 * RateTypeAndAmountAndStatus18.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19#RateStatus
	 * RateTypeAndAmountAndStatus19.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20#RateStatus
	 * RateTypeAndAmountAndStatus20.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21#RateStatus
	 * RateTypeAndAmountAndStatus21.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#RateStatus
	 * RateTypeAndAmountAndStatus24.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#RateStatus
	 * RateTypeAndAmountAndStatus22.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#RateStatus
	 * RateTypeAndAmountAndStatus25.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#RateStatus
	 * RateTypeAndAmountAndStatus27.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#RateStatus
	 * RateTypeAndAmountAndStatus26.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#RateStatus
	 * RateTypeAndAmountAndStatus28.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#RateStatus
	 * RateTypeAndAmountAndStatus29.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32#RateStatus
	 * RateTypeAndAmountAndStatus32.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus31#RateStatus
	 * RateTypeAndAmountAndStatus31.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus33#RateStatus
	 * RateTypeAndAmountAndStatus33.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus36#RateStatus
	 * RateTypeAndAmountAndStatus36.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus35#RateStatus
	 * RateTypeAndAmountAndStatus35.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus30#RateStatus
	 * RateTypeAndAmountAndStatus30.RateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus34#RateStatus
	 * RateTypeAndAmountAndStatus34.RateStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is indicative or actual."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RateStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateTypeAndAmountAndStatus1.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus3.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus4.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus5.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus6.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus2.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus7.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus8.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus9.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus10.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus11.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus12.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus15.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus16.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus13.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus14.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus17.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus18.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus19.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus20.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus21.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus24.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus22.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus25.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus27.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus26.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus28.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus29.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus32.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus31.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus33.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus36.RateStatus,
					com.tools20022.repository.msg.RateTypeAndAmountAndStatus35.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus30.RateStatus, com.tools20022.repository.msg.RateTypeAndAmountAndStatus34.RateStatus);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateStatus";
			definition = "Specifies whether the rate is indicative or actual.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RateStatusCode.mmObject();
		}
	};
	/**
	 * Availability status of the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionAvailabilityStatusCode
	 * OptionAvailabilityStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#OptionAvailabilityStatus
	 * CorporateActionOption10.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#OptionAvailabilityStatus
	 * CorporateActionOption15.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#OptionAvailabilityStatus
	 * CorporateActionOption20.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#OptionAvailabilityStatus
	 * CorporateActionOption32.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#OptionAvailabilityStatus
	 * CorporateActionOption35.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#OptionAvailabilityStatus
	 * CorporateActionOption44.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#OptionAvailabilityStatus
	 * CorporateActionOption52.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#OptionAvailabilityStatus
	 * CorporateActionOption55.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#OptionAvailabilityStatus
	 * CorporateActionOption3.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#OptionAvailabilityStatus
	 * CorporateActionOption17.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#OptionAvailabilityStatus
	 * CorporateActionOption19.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#OptionAvailabilityStatus
	 * CorporateActionOption34.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#OptionAvailabilityStatus
	 * CorporateActionOption36.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#OptionAvailabilityStatus
	 * CorporateActionOption45.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#OptionAvailabilityStatus
	 * CorporateActionOption51.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#OptionAvailabilityStatus
	 * CorporateActionOption56.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#OptionAvailabilityStatus
	 * CorporateActionOption1.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#OptionAvailabilityStatus
	 * CorporateActionOption100.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#OptionAvailabilityStatus
	 * CorporateActionOption101.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#OptionAvailabilityStatus
	 * CorporateActionOption108.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#OptionAvailabilityStatus
	 * CorporateActionOption106.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#OptionAvailabilityStatus
	 * CorporateActionOption115.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#OptionAvailabilityStatus
	 * CorporateActionOption114.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#OptionAvailabilityStatus
	 * CorporateActionOption125.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#OptionAvailabilityStatus
	 * CorporateActionOption127.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#OptionAvailabilityStatus
	 * CorporateActionOption130.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#OptionAvailabilityStatus
	 * CorporateActionOption129.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#OptionAvailabilityStatus
	 * CorporateActionOption135.OptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#OptionAvailabilityStatus
	 * CorporateActionOption133.OptionAvailabilityStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAvailabilityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Availability status of the option."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionAvailabilityStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption15.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption20.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption32.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption35.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption44.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption52.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption55.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption3.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption17.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption19.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption34.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption36.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption45.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption51.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption56.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption1.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption100.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption101.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption108.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption106.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption115.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption114.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption125.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption127.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption130.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption129.OptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption135.OptionAvailabilityStatus,
					com.tools20022.repository.msg.CorporateActionOption133.OptionAvailabilityStatus);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Availability status of the option.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionAvailabilityStatusCode.mmObject();
		}
	};
	/**
	 * Corporate event for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionStatus
	 * CorporateActionEvent.CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
	 * CorporateActionEventStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice#Code
	 * CorporateActionEventStatus2FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice#Proprietary
	 * CorporateActionEventStatus2FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus1FormatChoice#Code
	 * CorporateActionEventStatus1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus1FormatChoice#Proprietary
	 * CorporateActionEventStatus1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus3FormatChoice#Code
	 * CorporateActionEventStatus3FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus3FormatChoice#Proprietary
	 * CorporateActionEventStatus3FormatChoice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice.Code, com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventStatus1FormatChoice.Code, com.tools20022.repository.choice.CorporateActionEventStatus1FormatChoice.Proprietary,
					com.tools20022.repository.choice.CorporateActionEventStatus3FormatChoice.Code, com.tools20022.repository.choice.CorporateActionEventStatus3FormatChoice.Proprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventStatus";
			definition = "Status of the corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStatusCode.mmObject();
		}
	};
	/**
	 * Information on the status of the processing of an instruction related to
	 * a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
	 * CorporateActionProcessedStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus2FormatChoice#Code
	 * ProcessedStatus2FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus2FormatChoice#Proprietary
	 * ProcessedStatus2FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus1FormatChoice#Code
	 * ProcessedStatus1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus1FormatChoice#Proprietary
	 * ProcessedStatus1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus3FormatChoice#Code
	 * ProcessedStatus3FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus3FormatChoice#Proprietary
	 * ProcessedStatus3FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus5FormatChoice#Code
	 * ProcessedStatus5FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus5FormatChoice#Proprietary
	 * ProcessedStatus5FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1#Status
	 * CorporateActionStandingInstructionProcessingStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus4FormatChoice#Code
	 * ProcessedStatus4FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus4FormatChoice#Proprietary
	 * ProcessedStatus4FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus6FormatChoice#Code
	 * ProcessedStatus6FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus6FormatChoice#Proprietary
	 * ProcessedStatus6FormatChoice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInstructionProcessedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the status of the processing of an instruction related to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RelatedInstructionProcessedStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProcessedStatus2FormatChoice.Code, com.tools20022.repository.choice.ProcessedStatus2FormatChoice.Proprietary,
					com.tools20022.repository.choice.ProcessedStatus1FormatChoice.Code, com.tools20022.repository.choice.ProcessedStatus1FormatChoice.Proprietary, com.tools20022.repository.choice.ProcessedStatus3FormatChoice.Code,
					com.tools20022.repository.choice.ProcessedStatus3FormatChoice.Proprietary, com.tools20022.repository.choice.ProcessedStatus5FormatChoice.Code, com.tools20022.repository.choice.ProcessedStatus5FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1.Status, com.tools20022.repository.choice.ProcessedStatus4FormatChoice.Code,
					com.tools20022.repository.choice.ProcessedStatus4FormatChoice.Proprietary, com.tools20022.repository.choice.ProcessedStatus6FormatChoice.Code, com.tools20022.repository.choice.ProcessedStatus6FormatChoice.Proprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInstructionProcessedStatus";
			definition = "Information on the status of the processing of an instruction related to a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
		}
	};
	/**
	 * Date and time at which the the corporate action event or the option is
	 * deactivated.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1#DeactivationDateAndTime
	 * CorporateActionDeactivationInstruction1.DeactivationDateAndTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the the corporate action event or the option is deactivated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeactivationDateAndTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDeactivationInstruction1.DeactivationDateAndTime);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeactivationDateAndTime";
			definition = "Date and time at which the the corporate action event or the option is deactivated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the status of the occurrence of an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventConfirmationStatusCode
	 * EventConfirmationStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of the occurrence of an event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventConfirmationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventConfirmationStatus";
			definition = "Indicates the status of the occurrence of an event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventConfirmationStatusCode.mmObject();
		}
	};
	/**
	 * Indicates whether the details provided about an event are complete or
	 * incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventCompletenessStatusCode
	 * EventCompletenessStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventCompletenessStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the details provided about an event are complete or incomplete."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EventCompletenessStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventCompletenessStatus";
			definition = "Indicates whether the details provided about an event are complete or incomplete.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventCompletenessStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatus";
				definition = "Status of the corporate action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionCancellation1.ProcessingStatus, com.tools20022.repository.msg.CorporateActionCancellation2.ProcessingStatus,
						com.tools20022.repository.choice.EventProcessingStatus1Choice.Complete, com.tools20022.repository.choice.EventProcessingStatus1Choice.Reconciled,
						com.tools20022.repository.choice.EventProcessingStatus2Choice.Complete, com.tools20022.repository.choice.EventProcessingStatus2Choice.Reconciled,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionProcessingStatus1Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionProcessingStatus4Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionProcessingStatus7Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionProcessingStatus8Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionProcessingStatus12Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionProcessingStatus13Choice.ProprietaryStatus,
						com.tools20022.repository.choice.ElectionAdviceStatus1Choice.ProcessedStatus, com.tools20022.repository.choice.ElectionAdviceStatus1Choice.RejectedStatus,
						com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1.Status, com.tools20022.repository.choice.ElectionCancellationStatus1Choice.ProcessedStatus,
						com.tools20022.repository.choice.ElectionCancellationStatus1Choice.RejectedStatus, com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1.Status,
						com.tools20022.repository.choice.ElectionAmendmentStatus1Choice.ProcessedStatus, com.tools20022.repository.choice.ElectionAmendmentStatus1Choice.RejectedStatus,
						com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1.Status, com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.ResourceDetails,
						com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.ProcessedStatus, com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.FailedStatus,
						com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.RejectedStatus, com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2.Status,
						com.tools20022.repository.msg.CorporateMovementStatus2.ProcessedStatus, com.tools20022.repository.msg.CorporateMovementStatus2.RejectedStatus,
						com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1.Status, com.tools20022.repository.choice.CorporateActionInformationStatus1Choice.ProcessedStatus,
						com.tools20022.repository.choice.CorporateActionInformationStatus1Choice.RejectedStatus, com.tools20022.repository.choice.StandingInstructionStatus1Choice.ProcessedStatus,
						com.tools20022.repository.choice.StandingInstructionStatus1Choice.RejectedStatus, com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1.Status,
						com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice.ProcessedStatus, com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice.RejectedStatus,
						com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1.Status, com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1.ProcessedStatus,
						com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1.RejectedStatus, com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1.Status,
						com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice.ProcessedStatus, com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice.RejectedStatus,
						com.tools20022.repository.msg.CorporateActionCancellation3.ProcessingStatus, com.tools20022.repository.choice.InstructionProcessingStatus15Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionProcessingStatus16Choice.ProprietaryStatus, com.tools20022.repository.msg.CorporateActionCancellation4.ProcessingStatus,
						com.tools20022.repository.choice.InstructionProcessingStatus20Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionProcessingStatus21Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice.ProprietaryStatus,
						com.tools20022.repository.choice.EventProcessingStatus3Choice.Complete, com.tools20022.repository.choice.EventProcessingStatus3Choice.Reconciled,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionProcessingStatus24Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionProcessingStatus25Choice.ProprietaryStatus,
						com.tools20022.repository.choice.EventProcessingStatus4Choice.Complete, com.tools20022.repository.choice.EventProcessingStatus4Choice.Reconciled,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionProcessingStatus29Choice.ProprietaryStatus,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.ProprietaryStatus, com.tools20022.repository.choice.InstructionProcessingStatus30Choice.ProprietaryStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.AgentStandingInstructionStatus, com.tools20022.repository.entity.CorporateActionStatus.ProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.EventProcessingStatus, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason,
						com.tools20022.repository.entity.CorporateActionStatus.InstructionCancellationStatus, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionInstructionProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.RateStatus, com.tools20022.repository.entity.CorporateActionStatus.OptionAvailabilityStatus,
						com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.EventStatus,
						com.tools20022.repository.entity.CorporateActionStatus.RelatedInstructionProcessedStatus, com.tools20022.repository.entity.CorporateActionStatus.DeactivationDateAndTime,
						com.tools20022.repository.entity.CorporateActionStatus.EventConfirmationStatus, com.tools20022.repository.entity.CorporateActionStatus.EventCompletenessStatus);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionEventStatus1.mmObject(), CorporateActionProcessingStatus1Choice.mmObject(), EventProcessingStatus1Choice.mmObject(), EventProcessingStatus2Choice.mmObject(),
						InstructionCancellationRequestStatus1Choice.mmObject(), InstructionCancellationRequestStatus2Choice.mmObject(), InstructionCancellationRequestStatus3Choice.mmObject(),
						InstructionCancellationRequestStatus4Choice.mmObject(), InstructionCancellationRequestStatus5Choice.mmObject(), InstructionCancellationRequestStatus6Choice.mmObject(), RateStatus1Choice.mmObject(),
						RateStatus2Choice.mmObject(), CorporateActionProcessingStatus2Choice.mmObject(), CorporateActionProcessingStatus3Choice.mmObject(), CorporateActionEventStatus2FormatChoice.mmObject(),
						ProcessedStatus2FormatChoice.mmObject(), ProcessedStatus1FormatChoice.mmObject(), ProcessedStatus3FormatChoice.mmObject(), CorporateActionInstructionProcessingStatus1.mmObject(),
						CorporateActionInstructionRejectionStatus1.mmObject(), ElectionAdviceStatus1Choice.mmObject(), ProcessedStatus5FormatChoice.mmObject(), CorporateActionCancellationProcessingStatus1.mmObject(),
						CorporateActionCancellationRejectionStatus1.mmObject(), ElectionCancellationStatus1Choice.mmObject(), CorporateActionAmendmentProcessingStatus1.mmObject(), CorporateActionAmendmentRejectionStatus1.mmObject(),
						ElectionAmendmentStatus1Choice.mmObject(), CorporateActionMovementProcessingStatus1.mmObject(), FailedMovement1.mmObject(), CorporateActionMovementFailedStatus1.mmObject(),
						CorporateActionMovementRejectionStatus1.mmObject(), CorporateActionMovementStatus1Choice.mmObject(), CorporateActionMovementRejectionStatus2.mmObject(), CorporateMovementStatus2.mmObject(),
						CorporateActionInformationProcessingStatus1.mmObject(), CorporateActionInformationRejectedStatus1.mmObject(), CorporateActionInformationStatus1Choice.mmObject(),
						CorporateActionStandingInstructionProcessingStatus1.mmObject(), CorporateActionStandingInstructionRejectionStatus1.mmObject(), StandingInstructionStatus1Choice.mmObject(), ProcessedStatus4FormatChoice.mmObject(),
						CorporateActionStandingInstructionCancellationProcessingStatus1.mmObject(), CorporateActionStandingInstructionCancellationRejectionStatus1.mmObject(), StandingInstructionCancellationStatus1Choice.mmObject(),
						ProcessedStatus6FormatChoice.mmObject(), CorporateActionDeactivationInstructionProcessingStatus1.mmObject(), CorporateActionDeactivationInstructionRejectionStatus1.mmObject(),
						CorporateActionDeactivationInstructionStatus1.mmObject(), CorporateActionDeactivationCancellationProcessingStatus1.mmObject(), CorporateActionDeactivationCancellationRejectionStatus1.mmObject(),
						CorporateActionDeactivationCancellationStatus1Choice.mmObject(), CorporateActionEventProcessingStatus1Choice.mmObject(), CorporateActionEventProcessingStatus2Choice.mmObject(),
						CorporateActionEventStatus1FormatChoice.mmObject(), CorporateActionEventStatus3FormatChoice.mmObject(), CorporateActionProcessingStatus4Choice.mmObject(), InstructionCancellationRequestStatus7Choice.mmObject(),
						InstructionCancellationRequestStatus8Choice.mmObject(), CorporateActionEventProcessingStatus3Choice.mmObject(), EventProcessingStatus3Choice.mmObject(), InstructionCancellationRequestStatus9Choice.mmObject(),
						RateStatus3Choice.mmObject(), CorporateActionProcessingStatus5Choice.mmObject(), InstructionCancellationRequestStatus10Choice.mmObject(), EventProcessingStatus4Choice.mmObject(), RateStatus4Choice.mmObject(),
						CorporateActionEventProcessingStatus4Choice.mmObject(), CorporateActionProcessingStatus6Choice.mmObject(), InstructionCancellationRequestStatus11Choice.mmObject(),
						InstructionCancellationRequestStatus12Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}