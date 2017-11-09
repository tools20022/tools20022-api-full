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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionStatus
 * CorporateActionStatusReason.mmCorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
 * CorporateActionEvent.mmCorporateActionStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation1#mmProcessingStatus
 * CorporateActionCancellation1.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2#mmProcessingStatus
 * CorporateActionCancellation2.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus1Choice#mmComplete
 * EventProcessingStatus1Choice.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus1Choice#mmReconciled
 * EventProcessingStatus1Choice.mmReconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus2Choice#mmComplete
 * EventProcessingStatus2Choice.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus2Choice#mmReconciled
 * EventProcessingStatus2Choice.mmReconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus1Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus2Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus3Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus4Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus5Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus6Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#mmProprietaryStatus
 * InstructionProcessingStatus1Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#mmProprietaryStatus
 * InstructionProcessingStatus4Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmProprietaryStatus
 * InstructionProcessingStatus7Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#mmProprietaryStatus
 * InstructionProcessingStatus8Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#mmProprietaryStatus
 * InstructionProcessingStatus12Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#mmProprietaryStatus
 * InstructionProcessingStatus13Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAdviceStatus1Choice#mmProcessedStatus
 * ElectionAdviceStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAdviceStatus1Choice#mmRejectedStatus
 * ElectionAdviceStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1#mmStatus
 * CorporateActionCancellationProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionCancellationStatus1Choice#mmProcessedStatus
 * ElectionCancellationStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionCancellationStatus1Choice#mmRejectedStatus
 * ElectionCancellationStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1#mmStatus
 * CorporateActionAmendmentProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice#mmProcessedStatus
 * ElectionAmendmentStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice#mmRejectedStatus
 * ElectionAmendmentStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1#mmStatus
 * CorporateActionMovementProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmResourceDetails
 * CorporateActionMovementFailedStatus1.mmResourceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#mmProcessedStatus
 * CorporateActionMovementStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#mmFailedStatus
 * CorporateActionMovementStatus1Choice.mmFailedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#mmRejectedStatus
 * CorporateActionMovementStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2#mmStatus
 * CorporationActionMovementProcessingStatus2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateMovementStatus2#mmProcessedStatus
 * CorporateMovementStatus2.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateMovementStatus2#mmRejectedStatus
 * CorporateMovementStatus2.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1#mmStatus
 * CorporateActionInformationProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice#mmProcessedStatus
 * CorporateActionInformationStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice#mmRejectedStatus
 * CorporateActionInformationStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionStatus1Choice#mmProcessedStatus
 * StandingInstructionStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionStatus1Choice#mmRejectedStatus
 * StandingInstructionStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1#mmStatus
 * CorporateActionStandingInstructionCancellationProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice#mmProcessedStatus
 * StandingInstructionCancellationStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice#mmRejectedStatus
 * StandingInstructionCancellationStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1#mmStatus
 * CorporateActionDeactivationInstructionProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmProcessedStatus
 * CorporateActionDeactivationInstructionStatus1.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmRejectedStatus
 * CorporateActionDeactivationInstructionStatus1.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1#mmStatus
 * CorporateActionDeactivationCancellationProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice#mmProcessedStatus
 * CorporateActionDeactivationCancellationStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice#mmRejectedStatus
 * CorporateActionDeactivationCancellationStatus1Choice.mmRejectedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmProcessingStatus
 * CorporateActionCancellation3.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmProprietaryStatus
 * InstructionProcessingStatus15Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmProprietaryStatus
 * InstructionProcessingStatus16Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#mmProcessingStatus
 * CorporateActionCancellation4.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmProprietaryStatus
 * InstructionProcessingStatus20Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus7Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#mmProprietaryStatus
 * InstructionProcessingStatus21Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus8Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmComplete
 * EventProcessingStatus3Choice.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmReconciled
 * EventProcessingStatus3Choice.mmReconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus9Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmProprietaryStatus
 * InstructionProcessingStatus24Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus10Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#mmProprietaryStatus
 * InstructionProcessingStatus25Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus4Choice#mmComplete
 * EventProcessingStatus4Choice.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus4Choice#mmReconciled
 * EventProcessingStatus4Choice.mmReconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus11Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmProprietaryStatus
 * InstructionProcessingStatus29Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus12Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#mmProprietaryStatus
 * InstructionProcessingStatus30Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmAgentStandingInstructionStatus
 * CorporateActionStatus.mmAgentStandingInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmProcessingStatus
 * CorporateActionStatus.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventProcessingStatus
 * CorporateActionStatus.mmEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmInstructionCancellationStatus
 * CorporateActionStatus.mmInstructionCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionInstructionProcessingStatus
 * CorporateActionStatus.mmCorporateActionInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmRateStatus
 * CorporateActionStatus.mmRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmOptionAvailabilityStatus
 * CorporateActionStatus.mmOptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionEvent
 * CorporateActionStatus.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventStatus
 * CorporateActionStatus.mmEventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmRelatedInstructionProcessedStatus
 * CorporateActionStatus.mmRelatedInstructionProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmDeactivationDateAndTime
 * CorporateActionStatus.mmDeactivationDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventConfirmationStatus
 * CorporateActionStatus.mmEventConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventCompletenessStatus
 * CorporateActionStatus.mmEventCompletenessStatus}</li>
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
 * "CorporateActionStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the corporate action process."</li>
 * </ul>
 */
public class CorporateActionStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text agentStandingInstructionStatus;
	/**
	 * Specifies the state or the condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#mmProprietary
	 * Status2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#mmProprietary
	 * Status4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice#mmProprietary
	 * RegistrationProcessingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus1Choice#mmProprietary
	 * ResponseStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice#mmProprietary
	 * ReplacementProcessingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus2Choice#mmProprietary
	 * RegistrationProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus2Choice#mmProprietary
	 * ResponseStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus2Choice#mmProprietary
	 * ReplacementProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus5Choice#mmProprietary
	 * ResponseStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice#mmProprietary
	 * ReplacementProcessingStatus8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus3Choice#mmProprietary
	 * RegistrationProcessingStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus4Choice#mmProprietary
	 * RegistrationProcessingStatus4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus7Choice#mmProprietary
	 * ResponseStatus7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus9Choice#mmProprietary
	 * ReplacementProcessingStatus9Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAgentStandingInstructionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Status2Choice.mmProprietary, Status4Choice.mmProprietary, RegistrationProcessingStatus1Choice.mmProprietary, ResponseStatus1Choice.mmProprietary,
					ReplacementProcessingStatus1Choice.mmProprietary, RegistrationProcessingStatus2Choice.mmProprietary, ResponseStatus2Choice.mmProprietary, ReplacementProcessingStatus2Choice.mmProprietary,
					ResponseStatus5Choice.mmProprietary, ReplacementProcessingStatus8Choice.mmProprietary, RegistrationProcessingStatus3Choice.mmProprietary, RegistrationProcessingStatus4Choice.mmProprietary,
					ResponseStatus7Choice.mmProprietary, ReplacementProcessingStatus9Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgentStandingInstructionStatus";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ProcessingStatusCode processingStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1#mmEventCompletenessStatus
	 * CorporateActionEventStatus1.mmEventCompletenessStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1#mmEventConfirmationStatus
	 * CorporateActionEventStatus1.mmEventConfirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice#mmEventStatus
	 * CorporateActionProcessingStatus1Choice.mmEventStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1#mmProcessingStatus
	 * CorporateActionPreliminaryAdviceType1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice#mmCode
	 * CorporateActionProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice#mmProprietary
	 * CorporateActionProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus3Choice#mmCode
	 * CorporateActionProcessingStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus3Choice#mmProprietary
	 * CorporateActionProcessingStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice#mmCode
	 * CorporateActionProcessingStatus4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice#mmProprietary
	 * CorporateActionProcessingStatus4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice#mmCode
	 * CorporateActionProcessingStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice#mmProprietary
	 * CorporateActionProcessingStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus6Choice#mmCode
	 * CorporateActionProcessingStatus6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus6Choice#mmProprietary
	 * CorporateActionProcessingStatus6Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventStatus1.mmEventCompletenessStatus, CorporateActionEventStatus1.mmEventConfirmationStatus, CorporateActionProcessingStatus1Choice.mmEventStatus,
					CorporateActionPreliminaryAdviceType1.mmProcessingStatus, CorporateActionProcessingStatus2Choice.mmCode, CorporateActionProcessingStatus2Choice.mmProprietary, CorporateActionProcessingStatus3Choice.mmCode,
					CorporateActionProcessingStatus3Choice.mmProprietary, CorporateActionProcessingStatus4Choice.mmCode, CorporateActionProcessingStatus4Choice.mmProprietary, CorporateActionProcessingStatus5Choice.mmCode,
					CorporateActionProcessingStatus5Choice.mmProprietary, CorporateActionProcessingStatus6Choice.mmCode, CorporateActionProcessingStatus6Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingStatusCode.mmObject();
		}
	};
	protected CorporateActionEventProcessingStatusCode eventProcessingStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice#mmCode
	 * CorporateActionEventProcessingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus1Choice#mmProprietary
	 * CorporateActionEventProcessingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmCorporateActionEventProcessingStatus
	 * Status1Choice.mmCorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmCorporateActionEventProcessingStatus
	 * Status8Choice.mmCorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice#mmCode
	 * CorporateActionEventProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus2Choice#mmProprietary
	 * CorporateActionEventProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmCorporateActionEventProcessingStatus
	 * Status3Choice.mmCorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmCorporateActionEventProcessingStatus
	 * Status10Choice.mmCorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus3Choice#mmCode
	 * CorporateActionEventProcessingStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus3Choice#mmProprietary
	 * CorporateActionEventProcessingStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCorporateActionEventProcessingStatus
	 * Status19Choice.mmCorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmCorporateActionEventProcessingStatus
	 * Status22Choice.mmCorporateActionEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice#mmCode
	 * CorporateActionEventProcessingStatus4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice#mmProprietary
	 * CorporateActionEventProcessingStatus4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEventProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(CorporateActionEventProcessingStatus1Choice.mmCode, CorporateActionEventProcessingStatus1Choice.mmProprietary, Status1Choice.mmCorporateActionEventProcessingStatus,
							Status8Choice.mmCorporateActionEventProcessingStatus, CorporateActionEventProcessingStatus2Choice.mmCode, CorporateActionEventProcessingStatus2Choice.mmProprietary,
							Status3Choice.mmCorporateActionEventProcessingStatus, Status10Choice.mmCorporateActionEventProcessingStatus, CorporateActionEventProcessingStatus3Choice.mmCode,
							CorporateActionEventProcessingStatus3Choice.mmProprietary, Status19Choice.mmCorporateActionEventProcessingStatus, Status22Choice.mmCorporateActionEventProcessingStatus,
							CorporateActionEventProcessingStatus4Choice.mmCode, CorporateActionEventProcessingStatus4Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventProcessingStatus";
			definition = "Processing status of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionStatusReason> corporateActionStatusReason;
	/**
	 * Specifies the reasons for the status. It is derived from the relationship
	 * between Status and Status Reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionStatus
	 * CorporateActionStatusReason.mmCorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus1Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus2Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1#mmReason
	 * CorporateActionCancellationRejectionStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1#mmReason
	 * CorporateActionInformationRejectedStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1#mmReason
	 * CorporateActionStandingInstructionCancellationRejectionStatus1.mmReason}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionStatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus1Choice.mmCancellationCompleted, InstructionCancellationRequestStatus2Choice.mmCancellationCompleted,
					CorporateActionCancellationRejectionStatus1.mmReason, CorporateActionInformationRejectedStatus1.mmReason, CorporateActionStandingInstructionCancellationRejectionStatus1.mmReason);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatusReason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
		}
	};
	protected CorporateActionInstructionCancellationProcessingStatusCode instructionCancellationStatus;
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
	public static final MMBusinessAttribute mmInstructionCancellationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the instruction cancellation process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
		}
	};
	protected CorporateActionInstructionProcessingStatusCode corporateActionInstructionProcessingStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#mmReceived
	 * ProcessingStatus43Choice.mmReceived}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCorporateActionInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ProcessingStatus43Choice.mmReceived);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionInstructionProcessingStatus";
			definition = "Status of the corporate action instruction process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
		}
	};
	protected RateStatusCode rateStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1#mmRateStatus
	 * RateTypeAndAmountAndStatus1.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus3#mmRateStatus
	 * RateTypeAndAmountAndStatus3.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus4#mmRateStatus
	 * RateTypeAndAmountAndStatus4.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus5#mmRateStatus
	 * RateTypeAndAmountAndStatus5.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus6#mmRateStatus
	 * RateTypeAndAmountAndStatus6.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus2#mmRateStatus
	 * RateTypeAndAmountAndStatus2.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus7#mmRateStatus
	 * RateTypeAndAmountAndStatus7.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8#mmRateStatus
	 * RateTypeAndAmountAndStatus8.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus9#mmRateStatus
	 * RateTypeAndAmountAndStatus9.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus10#mmRateStatus
	 * RateTypeAndAmountAndStatus10.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus11#mmRateStatus
	 * RateTypeAndAmountAndStatus11.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus12#mmRateStatus
	 * RateTypeAndAmountAndStatus12.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus15#mmRateStatus
	 * RateTypeAndAmountAndStatus15.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus16#mmRateStatus
	 * RateTypeAndAmountAndStatus16.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus13#mmRateStatus
	 * RateTypeAndAmountAndStatus13.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus14#mmRateStatus
	 * RateTypeAndAmountAndStatus14.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus17#mmRateStatus
	 * RateTypeAndAmountAndStatus17.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus18#mmRateStatus
	 * RateTypeAndAmountAndStatus18.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus19#mmRateStatus
	 * RateTypeAndAmountAndStatus19.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus20#mmRateStatus
	 * RateTypeAndAmountAndStatus20.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus21#mmRateStatus
	 * RateTypeAndAmountAndStatus21.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#mmRateStatus
	 * RateTypeAndAmountAndStatus24.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus22#mmRateStatus
	 * RateTypeAndAmountAndStatus22.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus25#mmRateStatus
	 * RateTypeAndAmountAndStatus25.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus27#mmRateStatus
	 * RateTypeAndAmountAndStatus27.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmRateStatus
	 * RateTypeAndAmountAndStatus26.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus28#mmRateStatus
	 * RateTypeAndAmountAndStatus28.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29#mmRateStatus
	 * RateTypeAndAmountAndStatus29.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32#mmRateStatus
	 * RateTypeAndAmountAndStatus32.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus31#mmRateStatus
	 * RateTypeAndAmountAndStatus31.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus33#mmRateStatus
	 * RateTypeAndAmountAndStatus33.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus36#mmRateStatus
	 * RateTypeAndAmountAndStatus36.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus35#mmRateStatus
	 * RateTypeAndAmountAndStatus35.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus30#mmRateStatus
	 * RateTypeAndAmountAndStatus30.mmRateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus34#mmRateStatus
	 * RateTypeAndAmountAndStatus34.mmRateStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRateStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateTypeAndAmountAndStatus1.mmRateStatus, RateTypeAndAmountAndStatus3.mmRateStatus, RateTypeAndAmountAndStatus4.mmRateStatus, RateTypeAndAmountAndStatus5.mmRateStatus,
					RateTypeAndAmountAndStatus6.mmRateStatus, RateTypeAndAmountAndStatus2.mmRateStatus, RateTypeAndAmountAndStatus7.mmRateStatus, RateTypeAndAmountAndStatus8.mmRateStatus, RateTypeAndAmountAndStatus9.mmRateStatus,
					RateTypeAndAmountAndStatus10.mmRateStatus, RateTypeAndAmountAndStatus11.mmRateStatus, RateTypeAndAmountAndStatus12.mmRateStatus, RateTypeAndAmountAndStatus15.mmRateStatus, RateTypeAndAmountAndStatus16.mmRateStatus,
					RateTypeAndAmountAndStatus13.mmRateStatus, RateTypeAndAmountAndStatus14.mmRateStatus, RateTypeAndAmountAndStatus17.mmRateStatus, RateTypeAndAmountAndStatus18.mmRateStatus, RateTypeAndAmountAndStatus19.mmRateStatus,
					RateTypeAndAmountAndStatus20.mmRateStatus, RateTypeAndAmountAndStatus21.mmRateStatus, RateTypeAndAmountAndStatus24.mmRateStatus, RateTypeAndAmountAndStatus22.mmRateStatus, RateTypeAndAmountAndStatus25.mmRateStatus,
					RateTypeAndAmountAndStatus27.mmRateStatus, RateTypeAndAmountAndStatus26.mmRateStatus, RateTypeAndAmountAndStatus28.mmRateStatus, RateTypeAndAmountAndStatus29.mmRateStatus, RateTypeAndAmountAndStatus32.mmRateStatus,
					RateTypeAndAmountAndStatus31.mmRateStatus, RateTypeAndAmountAndStatus33.mmRateStatus, RateTypeAndAmountAndStatus36.mmRateStatus, RateTypeAndAmountAndStatus35.mmRateStatus, RateTypeAndAmountAndStatus30.mmRateStatus,
					RateTypeAndAmountAndStatus34.mmRateStatus);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateStatus";
			definition = "Specifies whether the rate is indicative or actual.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateStatusCode.mmObject();
		}
	};
	protected OptionAvailabilityStatusCode optionAvailabilityStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmOptionAvailabilityStatus
	 * CorporateActionOption10.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmOptionAvailabilityStatus
	 * CorporateActionOption15.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmOptionAvailabilityStatus
	 * CorporateActionOption20.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmOptionAvailabilityStatus
	 * CorporateActionOption32.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmOptionAvailabilityStatus
	 * CorporateActionOption35.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmOptionAvailabilityStatus
	 * CorporateActionOption44.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmOptionAvailabilityStatus
	 * CorporateActionOption52.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmOptionAvailabilityStatus
	 * CorporateActionOption55.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmOptionAvailabilityStatus
	 * CorporateActionOption3.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmOptionAvailabilityStatus
	 * CorporateActionOption17.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionAvailabilityStatus
	 * CorporateActionOption19.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmOptionAvailabilityStatus
	 * CorporateActionOption34.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmOptionAvailabilityStatus
	 * CorporateActionOption36.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmOptionAvailabilityStatus
	 * CorporateActionOption45.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmOptionAvailabilityStatus
	 * CorporateActionOption51.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmOptionAvailabilityStatus
	 * CorporateActionOption56.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionAvailabilityStatus
	 * CorporateActionOption1.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmOptionAvailabilityStatus
	 * CorporateActionOption100.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmOptionAvailabilityStatus
	 * CorporateActionOption101.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionAvailabilityStatus
	 * CorporateActionOption108.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmOptionAvailabilityStatus
	 * CorporateActionOption106.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmOptionAvailabilityStatus
	 * CorporateActionOption115.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionAvailabilityStatus
	 * CorporateActionOption114.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmOptionAvailabilityStatus
	 * CorporateActionOption125.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmOptionAvailabilityStatus
	 * CorporateActionOption127.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionAvailabilityStatus
	 * CorporateActionOption130.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOptionAvailabilityStatus
	 * CorporateActionOption129.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmOptionAvailabilityStatus
	 * CorporateActionOption135.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmOptionAvailabilityStatus
	 * CorporateActionOption133.mmOptionAvailabilityStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOptionAvailabilityStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption10.mmOptionAvailabilityStatus, CorporateActionOption15.mmOptionAvailabilityStatus, CorporateActionOption20.mmOptionAvailabilityStatus,
					CorporateActionOption32.mmOptionAvailabilityStatus, CorporateActionOption35.mmOptionAvailabilityStatus, CorporateActionOption44.mmOptionAvailabilityStatus, CorporateActionOption52.mmOptionAvailabilityStatus,
					CorporateActionOption55.mmOptionAvailabilityStatus, CorporateActionOption3.mmOptionAvailabilityStatus, CorporateActionOption17.mmOptionAvailabilityStatus, CorporateActionOption19.mmOptionAvailabilityStatus,
					CorporateActionOption34.mmOptionAvailabilityStatus, CorporateActionOption36.mmOptionAvailabilityStatus, CorporateActionOption45.mmOptionAvailabilityStatus, CorporateActionOption51.mmOptionAvailabilityStatus,
					CorporateActionOption56.mmOptionAvailabilityStatus, CorporateActionOption1.mmOptionAvailabilityStatus, CorporateActionOption100.mmOptionAvailabilityStatus, CorporateActionOption101.mmOptionAvailabilityStatus,
					CorporateActionOption108.mmOptionAvailabilityStatus, CorporateActionOption106.mmOptionAvailabilityStatus, CorporateActionOption115.mmOptionAvailabilityStatus, CorporateActionOption114.mmOptionAvailabilityStatus,
					CorporateActionOption125.mmOptionAvailabilityStatus, CorporateActionOption127.mmOptionAvailabilityStatus, CorporateActionOption130.mmOptionAvailabilityStatus, CorporateActionOption129.mmOptionAvailabilityStatus,
					CorporateActionOption135.mmOptionAvailabilityStatus, CorporateActionOption133.mmOptionAvailabilityStatus);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Availability status of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionAvailabilityStatusCode.mmObject();
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Corporate event for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
	 * CorporateActionEvent.mmCorporateActionStatus}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected CorporateActionEventStatusCode eventStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice#mmCode
	 * CorporateActionEventStatus2FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice#mmProprietary
	 * CorporateActionEventStatus2FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus1FormatChoice#mmCode
	 * CorporateActionEventStatus1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus1FormatChoice#mmProprietary
	 * CorporateActionEventStatus1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus3FormatChoice#mmCode
	 * CorporateActionEventStatus3FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus3FormatChoice#mmProprietary
	 * CorporateActionEventStatus3FormatChoice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEventStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventStatus2FormatChoice.mmCode, CorporateActionEventStatus2FormatChoice.mmProprietary, CorporateActionEventStatus1FormatChoice.mmCode,
					CorporateActionEventStatus1FormatChoice.mmProprietary, CorporateActionEventStatus3FormatChoice.mmCode, CorporateActionEventStatus3FormatChoice.mmProprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventStatus";
			definition = "Status of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStatusCode.mmObject();
		}
	};
	protected CorporateActionProcessedStatusCode relatedInstructionProcessedStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus2FormatChoice#mmCode
	 * ProcessedStatus2FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus2FormatChoice#mmProprietary
	 * ProcessedStatus2FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus1FormatChoice#mmCode
	 * ProcessedStatus1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus1FormatChoice#mmProprietary
	 * ProcessedStatus1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus3FormatChoice#mmCode
	 * ProcessedStatus3FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus3FormatChoice#mmProprietary
	 * ProcessedStatus3FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus5FormatChoice#mmCode
	 * ProcessedStatus5FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus5FormatChoice#mmProprietary
	 * ProcessedStatus5FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1#mmStatus
	 * CorporateActionStandingInstructionProcessingStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus4FormatChoice#mmCode
	 * ProcessedStatus4FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus4FormatChoice#mmProprietary
	 * ProcessedStatus4FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus6FormatChoice#mmCode
	 * ProcessedStatus6FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessedStatus6FormatChoice#mmProprietary
	 * ProcessedStatus6FormatChoice.mmProprietary}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRelatedInstructionProcessedStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ProcessedStatus2FormatChoice.mmCode, ProcessedStatus2FormatChoice.mmProprietary, ProcessedStatus1FormatChoice.mmCode, ProcessedStatus1FormatChoice.mmProprietary,
					ProcessedStatus3FormatChoice.mmCode, ProcessedStatus3FormatChoice.mmProprietary, ProcessedStatus5FormatChoice.mmCode, ProcessedStatus5FormatChoice.mmProprietary,
					CorporateActionStandingInstructionProcessingStatus1.mmStatus, ProcessedStatus4FormatChoice.mmCode, ProcessedStatus4FormatChoice.mmProprietary, ProcessedStatus6FormatChoice.mmCode,
					ProcessedStatus6FormatChoice.mmProprietary);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInstructionProcessedStatus";
			definition = "Information on the status of the processing of an instruction related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
		}
	};
	protected ISODateTime deactivationDateAndTime;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1#mmDeactivationDateAndTime
	 * CorporateActionDeactivationInstruction1.mmDeactivationDateAndTime}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDeactivationDateAndTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDeactivationInstruction1.mmDeactivationDateAndTime);
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeactivationDateAndTime";
			definition = "Date and time at which the the corporate action event or the option is deactivated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected EventConfirmationStatusCode eventConfirmationStatus;
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
	public static final MMBusinessAttribute mmEventConfirmationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventConfirmationStatus";
			definition = "Indicates the status of the occurrence of an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventConfirmationStatusCode.mmObject();
		}
	};
	protected EventCompletenessStatusCode eventCompletenessStatus;
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
	public static final MMBusinessAttribute mmEventCompletenessStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventCompletenessStatus";
			definition = "Indicates whether the details provided about an event are complete or incomplete.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventCompletenessStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatus";
				definition = "Status of the corporate action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionStatus, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionStatus);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionCancellation1.mmProcessingStatus, CorporateActionCancellation2.mmProcessingStatus, EventProcessingStatus1Choice.mmComplete,
						EventProcessingStatus1Choice.mmReconciled, EventProcessingStatus2Choice.mmComplete, EventProcessingStatus2Choice.mmReconciled, InstructionCancellationRequestStatus1Choice.mmProprietaryStatus,
						InstructionCancellationRequestStatus2Choice.mmProprietaryStatus, InstructionCancellationRequestStatus3Choice.mmProprietaryStatus, InstructionCancellationRequestStatus4Choice.mmProprietaryStatus,
						InstructionCancellationRequestStatus5Choice.mmProprietaryStatus, InstructionCancellationRequestStatus6Choice.mmProprietaryStatus, InstructionProcessingStatus1Choice.mmProprietaryStatus,
						InstructionProcessingStatus4Choice.mmProprietaryStatus, InstructionProcessingStatus7Choice.mmProprietaryStatus, InstructionProcessingStatus8Choice.mmProprietaryStatus,
						InstructionProcessingStatus12Choice.mmProprietaryStatus, InstructionProcessingStatus13Choice.mmProprietaryStatus, ElectionAdviceStatus1Choice.mmProcessedStatus, ElectionAdviceStatus1Choice.mmRejectedStatus,
						CorporateActionCancellationProcessingStatus1.mmStatus, ElectionCancellationStatus1Choice.mmProcessedStatus, ElectionCancellationStatus1Choice.mmRejectedStatus, CorporateActionAmendmentProcessingStatus1.mmStatus,
						ElectionAmendmentStatus1Choice.mmProcessedStatus, ElectionAmendmentStatus1Choice.mmRejectedStatus, CorporateActionMovementProcessingStatus1.mmStatus, CorporateActionMovementFailedStatus1.mmResourceDetails,
						CorporateActionMovementStatus1Choice.mmProcessedStatus, CorporateActionMovementStatus1Choice.mmFailedStatus, CorporateActionMovementStatus1Choice.mmRejectedStatus,
						CorporationActionMovementProcessingStatus2.mmStatus, CorporateMovementStatus2.mmProcessedStatus, CorporateMovementStatus2.mmRejectedStatus, CorporateActionInformationProcessingStatus1.mmStatus,
						CorporateActionInformationStatus1Choice.mmProcessedStatus, CorporateActionInformationStatus1Choice.mmRejectedStatus, StandingInstructionStatus1Choice.mmProcessedStatus,
						StandingInstructionStatus1Choice.mmRejectedStatus, CorporateActionStandingInstructionCancellationProcessingStatus1.mmStatus, StandingInstructionCancellationStatus1Choice.mmProcessedStatus,
						StandingInstructionCancellationStatus1Choice.mmRejectedStatus, CorporateActionDeactivationInstructionProcessingStatus1.mmStatus, CorporateActionDeactivationInstructionStatus1.mmProcessedStatus,
						CorporateActionDeactivationInstructionStatus1.mmRejectedStatus, CorporateActionDeactivationCancellationProcessingStatus1.mmStatus, CorporateActionDeactivationCancellationStatus1Choice.mmProcessedStatus,
						CorporateActionDeactivationCancellationStatus1Choice.mmRejectedStatus, CorporateActionCancellation3.mmProcessingStatus, InstructionProcessingStatus15Choice.mmProprietaryStatus,
						InstructionProcessingStatus16Choice.mmProprietaryStatus, CorporateActionCancellation4.mmProcessingStatus, InstructionProcessingStatus20Choice.mmProprietaryStatus,
						InstructionCancellationRequestStatus7Choice.mmProprietaryStatus, InstructionProcessingStatus21Choice.mmProprietaryStatus, InstructionCancellationRequestStatus8Choice.mmProprietaryStatus,
						EventProcessingStatus3Choice.mmComplete, EventProcessingStatus3Choice.mmReconciled, InstructionCancellationRequestStatus9Choice.mmProprietaryStatus, InstructionProcessingStatus24Choice.mmProprietaryStatus,
						InstructionCancellationRequestStatus10Choice.mmProprietaryStatus, InstructionProcessingStatus25Choice.mmProprietaryStatus, EventProcessingStatus4Choice.mmComplete, EventProcessingStatus4Choice.mmReconciled,
						InstructionCancellationRequestStatus11Choice.mmProprietaryStatus, InstructionProcessingStatus29Choice.mmProprietaryStatus, InstructionCancellationRequestStatus12Choice.mmProprietaryStatus,
						InstructionProcessingStatus30Choice.mmProprietaryStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(CorporateActionStatus.mmAgentStandingInstructionStatus, CorporateActionStatus.mmProcessingStatus, CorporateActionStatus.mmEventProcessingStatus,
						CorporateActionStatus.mmCorporateActionStatusReason, CorporateActionStatus.mmInstructionCancellationStatus, CorporateActionStatus.mmCorporateActionInstructionProcessingStatus, CorporateActionStatus.mmRateStatus,
						CorporateActionStatus.mmOptionAvailabilityStatus, CorporateActionStatus.mmCorporateActionEvent, CorporateActionStatus.mmEventStatus, CorporateActionStatus.mmRelatedInstructionProcessedStatus,
						CorporateActionStatus.mmDeactivationDateAndTime, CorporateActionStatus.mmEventConfirmationStatus, CorporateActionStatus.mmEventCompletenessStatus);
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

	public Max350Text getAgentStandingInstructionStatus() {
		return agentStandingInstructionStatus;
	}

	public void setAgentStandingInstructionStatus(Max350Text agentStandingInstructionStatus) {
		this.agentStandingInstructionStatus = agentStandingInstructionStatus;
	}

	public ProcessingStatusCode getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatusCode processingStatus) {
		this.processingStatus = processingStatus;
	}

	public CorporateActionEventProcessingStatusCode getEventProcessingStatus() {
		return eventProcessingStatus;
	}

	public void setEventProcessingStatus(CorporateActionEventProcessingStatusCode eventProcessingStatus) {
		this.eventProcessingStatus = eventProcessingStatus;
	}

	public List<CorporateActionStatusReason> getCorporateActionStatusReason() {
		return corporateActionStatusReason;
	}

	public void setCorporateActionStatusReason(List<com.tools20022.repository.entity.CorporateActionStatusReason> corporateActionStatusReason) {
		this.corporateActionStatusReason = corporateActionStatusReason;
	}

	public CorporateActionInstructionCancellationProcessingStatusCode getInstructionCancellationStatus() {
		return instructionCancellationStatus;
	}

	public void setInstructionCancellationStatus(CorporateActionInstructionCancellationProcessingStatusCode instructionCancellationStatus) {
		this.instructionCancellationStatus = instructionCancellationStatus;
	}

	public CorporateActionInstructionProcessingStatusCode getCorporateActionInstructionProcessingStatus() {
		return corporateActionInstructionProcessingStatus;
	}

	public void setCorporateActionInstructionProcessingStatus(CorporateActionInstructionProcessingStatusCode corporateActionInstructionProcessingStatus) {
		this.corporateActionInstructionProcessingStatus = corporateActionInstructionProcessingStatus;
	}

	public RateStatusCode getRateStatus() {
		return rateStatus;
	}

	public void setRateStatus(RateStatusCode rateStatus) {
		this.rateStatus = rateStatus;
	}

	public OptionAvailabilityStatusCode getOptionAvailabilityStatus() {
		return optionAvailabilityStatus;
	}

	public void setOptionAvailabilityStatus(OptionAvailabilityStatusCode optionAvailabilityStatus) {
		this.optionAvailabilityStatus = optionAvailabilityStatus;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public CorporateActionEventStatusCode getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(CorporateActionEventStatusCode eventStatus) {
		this.eventStatus = eventStatus;
	}

	public CorporateActionProcessedStatusCode getRelatedInstructionProcessedStatus() {
		return relatedInstructionProcessedStatus;
	}

	public void setRelatedInstructionProcessedStatus(CorporateActionProcessedStatusCode relatedInstructionProcessedStatus) {
		this.relatedInstructionProcessedStatus = relatedInstructionProcessedStatus;
	}

	public ISODateTime getDeactivationDateAndTime() {
		return deactivationDateAndTime;
	}

	public void setDeactivationDateAndTime(ISODateTime deactivationDateAndTime) {
		this.deactivationDateAndTime = deactivationDateAndTime;
	}

	public EventConfirmationStatusCode getEventConfirmationStatus() {
		return eventConfirmationStatus;
	}

	public void setEventConfirmationStatus(EventConfirmationStatusCode eventConfirmationStatus) {
		this.eventConfirmationStatus = eventConfirmationStatus;
	}

	public EventCompletenessStatusCode getEventCompletenessStatus() {
		return eventCompletenessStatus;
	}

	public void setEventCompletenessStatus(EventCompletenessStatusCode eventCompletenessStatus) {
		this.eventCompletenessStatus = eventCompletenessStatus;
	}
}