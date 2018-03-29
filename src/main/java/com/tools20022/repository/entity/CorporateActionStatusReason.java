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
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the underlying reason for a status of a corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionStatusReason"
 * src="doc-files/CorporateActionStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionStatus
 * CorporateActionStatusReason.mmCorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
 * CorporateActionStatusReason.mmAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmReversalReason
 * CorporateActionStatusReason.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmMovementFailureReason
 * CorporateActionStatusReason.mmMovementFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmMovementRejectionReason
 * CorporateActionStatusReason.mmMovementRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus2Choice#mmReason
 * PendingStatus2Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus5Choice#mmReason
 * PendingStatus5Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#mmDefaultAction
 * InstructionProcessingStatus1Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#mmStandingInstruction
 * InstructionProcessingStatus1Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#mmDefaultAction
 * InstructionProcessingStatus4Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#mmStandingInstruction
 * InstructionProcessingStatus4Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmDefaultAction
 * InstructionProcessingStatus7Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmStandingInstruction
 * InstructionProcessingStatus7Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#mmDefaultAction
 * InstructionProcessingStatus8Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#mmStandingInstruction
 * InstructionProcessingStatus8Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#mmDefaultAction
 * InstructionProcessingStatus12Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#mmStandingInstruction
 * InstructionProcessingStatus12Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#mmDefaultAction
 * InstructionProcessingStatus13Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#mmStandingInstruction
 * InstructionProcessingStatus13Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1#mmReason
 * CorporateActionReversalReason1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason2#mmReason
 * CorporateActionReversalReason2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus3Choice#mmReason
 * AcceptedStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmDefaultAction
 * InstructionProcessingStatus15Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmStandingInstruction
 * InstructionProcessingStatus15Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmDefaultAction
 * InstructionProcessingStatus16Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmStandingInstruction
 * InstructionProcessingStatus16Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus5Choice#mmReason
 * AcceptedStatus5Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmDefaultAction
 * InstructionProcessingStatus20Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmStandingInstruction
 * InstructionProcessingStatus20Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#mmDefaultAction
 * InstructionProcessingStatus21Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#mmStandingInstruction
 * InstructionProcessingStatus21Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#mmReason
 * CorporateActionReversalReason3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmDefaultAction
 * InstructionProcessingStatus24Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmStandingInstruction
 * InstructionProcessingStatus24Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice#mmReason
 * AcceptedStatus8Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus41Choice#mmReason
 * PendingStatus41Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#mmDefaultAction
 * InstructionProcessingStatus25Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#mmStandingInstruction
 * InstructionProcessingStatus25Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4#mmReason
 * CorporateActionReversalReason4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus43Choice#mmReason
 * PendingStatus43Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus9Choice#mmReason
 * AcceptedStatus9Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmDefaultAction
 * InstructionProcessingStatus29Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmStandingInstruction
 * InstructionProcessingStatus29Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#mmDefaultAction
 * InstructionProcessingStatus30Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#mmStandingInstruction
 * InstructionProcessingStatus30Choice.mmStandingInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason4Choice
 * PendingReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason2
 * PendingStatusReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus2Choice
 * PendingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason5Choice
 * PendingReason5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason3
 * PendingStatusReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus5Choice
 * PendingStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason1Choice
 * CancelledReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason4
 * CancelledStatusReason4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus1Choice
 * CancelledStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason1Choice
 * AcceptedReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason1
 * AcceptedStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatus1Choice
 * AcceptedStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason1Choice
 * RejectedReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason8
 * RejectedStatusReason8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus1Choice
 * RejectedStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason1Choice
 * PendingCancellationReason1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason1
 * PendingCancellationStatusReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus1Choice
 * PendingCancellationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason2Choice
 * CancelledReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason5
 * CancelledStatusReason5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus2Choice
 * CancelledStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason2Choice
 * AcceptedReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason2
 * AcceptedStatusReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatus2Choice
 * AcceptedStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason2Choice
 * RejectedReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason9
 * RejectedStatusReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus2Choice
 * RejectedStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason2Choice
 * PendingCancellationReason2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason2
 * PendingCancellationStatusReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus2Choice
 * PendingCancellationStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason3Choice
 * CancelledReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason6
 * CancelledStatusReason6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus3Choice
 * CancelledStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason4Choice
 * CancelledReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason7
 * CancelledStatusReason7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus4Choice
 * CancelledStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason3
 * PendingCancellationStatusReason3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus3Choice
 * PendingCancellationStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason4
 * PendingCancellationStatusReason4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus4Choice
 * PendingCancellationStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason6Choice
 * PendingReason6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason1
 * PendingStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus1Choice
 * PendingStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice
 * InstructionProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason7Choice
 * PendingReason7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason4
 * PendingStatusReason4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus6Choice
 * PendingStatus6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice
 * InstructionProcessingStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
 * InstructionProcessingStatus7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice
 * InstructionProcessingStatus8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice
 * InstructionProcessingStatus12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice
 * InstructionProcessingStatus13Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason1Choice
 * CorporateActionReversalReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1
 * CorporateActionReversalReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason2Choice
 * CorporateActionReversalReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionReversalReason2
 * CorporateActionReversalReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason11FormatChoice
 * RejectionReason11FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason6FormatChoice
 * RejectionReason6FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason18FormatChoice
 * RejectionReason18FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason9FormatChoice
 * RejectionReason9FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason8FormatChoice
 * RejectionReason8FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason19FormatChoice
 * RejectionReason19FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice
 * FailedSettlementReason1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason13FormatChoice
 * RejectionReason13FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason14FormatChoice
 * RejectionReason14FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason15FormatChoice
 * RejectionReason15FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason20FormatChoice
 * RejectionReason20FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason10FormatChoice
 * RejectionReason10FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason12FormatChoice
 * RejectionReason12FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason7FormatChoice
 * RejectionReason7FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason22Choice
 * PendingReason22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason3Choice
 * AcceptedReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatus3Choice
 * AcceptedStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason3
 * AcceptedStatusReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus9Choice
 * RejectedStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason10
 * RejectedStatusReason10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus32Choice
 * PendingStatus32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason5
 * PendingStatusReason5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice
 * InstructionProcessingStatus15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason5Choice
 * RejectedReason5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice
 * InstructionProcessingStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason6
 * PendingStatusReason6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason23Choice
 * PendingReason23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason6Choice
 * RejectedReason6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason11
 * RejectedStatusReason11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus11Choice
 * RejectedStatus11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus33Choice
 * PendingStatus33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason5Choice
 * AcceptedReason5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason5
 * AcceptedStatusReason5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatus5Choice
 * AcceptedStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2SD1
 * CorporateActionCancellation2SD1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice
 * InstructionProcessingStatus20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus7Choice
 * CancelledStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason8
 * CancelledStatusReason8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus13Choice
 * RejectedStatus13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason13
 * RejectedStatusReason13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus14Choice
 * RejectedStatus14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason14
 * RejectedStatusReason14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason5Choice
 * CancelledReason5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason10Choice
 * RejectedReason10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason9Choice
 * RejectedReason9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus34Choice
 * PendingStatus34Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason7
 * PendingStatusReason7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason24Choice
 * PendingReason24Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice
 * InstructionProcessingStatus21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus8Choice
 * CancelledStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason9
 * CancelledStatusReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus15Choice
 * RejectedStatus15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason15
 * RejectedStatusReason15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason11Choice
 * RejectedReason11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus35Choice
 * PendingStatus35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus16Choice
 * RejectedStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus9Choice
 * CancelledStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason8
 * PendingStatusReason8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason25Choice
 * PendingReason25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason10
 * CancelledStatusReason10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason6Choice
 * CancelledReason6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason16
 * RejectedStatusReason16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason7Choice
 * CancelledReason7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason12Choice
 * RejectedReason12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3
 * CorporateActionReversalReason3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice
 * InstructionProcessingStatus24Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason3Choice
 * PendingCancellationReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus19Choice
 * RejectedStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason17
 * RejectedStatusReason17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason14Choice
 * RejectedReason14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason12
 * CancelledStatusReason12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason9Choice
 * CancelledReason9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice
 * AcceptedStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus12Choice
 * CancelledStatus12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus42Choice
 * PendingStatus42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus11Choice
 * CancelledStatus11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus5Choice
 * PendingCancellationStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus18Choice
 * RejectedStatus18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason10
 * PendingStatusReason10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason33Choice
 * PendingReason33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice
 * CorporateActionReversalReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason8Choice
 * CancelledReason8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason18
 * RejectedStatusReason18}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason32Choice
 * PendingReason32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus41Choice
 * PendingStatus41Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason5
 * PendingCancellationStatusReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason9
 * AcceptedStatusReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason10Choice
 * AcceptedReason10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason9
 * PendingStatusReason9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason11
 * CancelledStatusReason11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason13Choice
 * RejectedReason13Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice
 * InstructionProcessingStatus25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4
 * CorporateActionReversalReason4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus6Choice
 * PendingCancellationStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus14Choice
 * CancelledStatus14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus20Choice
 * RejectedStatus20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason6
 * PendingCancellationStatusReason6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason4Choice
 * PendingCancellationReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason14
 * CancelledStatusReason14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason11Choice
 * CancelledReason11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledStatus15Choice
 * CancelledStatus15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason4Choice
 * CorporateActionReversalReason4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason19
 * RejectedStatusReason19}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason18Choice
 * RejectedReason18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancelledStatusReason13
 * CancelledStatusReason13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason10Choice
 * CancelledReason10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptedStatusReason10
 * AcceptedStatusReason10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedReason11Choice
 * AcceptedReason11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason35Choice
 * PendingReason35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus43Choice
 * PendingStatus43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason11
 * PendingStatusReason11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason12
 * PendingStatusReason12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason34Choice
 * PendingReason34Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus44Choice
 * PendingStatus44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus21Choice
 * RejectedStatus21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason20
 * RejectedStatusReason20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason19Choice
 * RejectedReason19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AcceptedStatus9Choice
 * AcceptedStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CancelledReason12Choice
 * CancelledReason12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice
 * InstructionProcessingStatus29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason5Choice
 * PendingCancellationReason5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus7Choice
 * PendingCancellationStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason48Choice
 * PendingReason48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus23Choice
 * RejectedStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus52Choice
 * PendingStatus52Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason7
 * PendingCancellationStatusReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason21
 * RejectedStatusReason21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason22Choice
 * RejectedReason22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason13
 * PendingStatusReason13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice
 * InstructionProcessingStatus30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatusReason22
 * RejectedStatusReason22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedReason23Choice
 * RejectedReason23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus8Choice
 * PendingCancellationStatus8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingCancellationStatusReason8
 * PendingCancellationStatusReason8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RejectedStatus24Choice
 * RejectedStatus24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus53Choice
 * PendingStatus53Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingReason49Choice
 * PendingReason49Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingCancellationReason6Choice
 * PendingCancellationReason6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingStatusReason15
 * PendingStatusReason15}</li>
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
 * "CorporateActionStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a corporate action."</li>
 * </ul>
 */
public class CorporateActionStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionCancellationReasonCode corporateActionCancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode
	 * CorporateActionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReasonCode
	 * CorporateActionCancellation3.mmCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReason
	 * CorporateActionCancellation3.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#mmCancellationReasonCode
	 * CorporateActionCancellation4.mmCancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#mmCancellationReason
	 * CorporateActionCancellation4.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2SD1#mmLocalLanguageCancellationReason
	 * CorporateActionCancellation2SD1.mmLocalLanguageCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies reasons for cancellation of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionStatusReason, CorporateActionCancellationReasonCode> mmCorporateActionCancellationReason = new MMBusinessAttribute<CorporateActionStatusReason, CorporateActionCancellationReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionCancellation3.mmCancellationReasonCode, CorporateActionCancellation3.mmCancellationReason, CorporateActionCancellation4.mmCancellationReasonCode,
					CorporateActionCancellation4.mmCancellationReason, CorporateActionCancellation2SD1.mmLocalLanguageCancellationReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCancellationReason";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
		}

		@Override
		public CorporateActionCancellationReasonCode getValue(CorporateActionStatusReason obj) {
			return obj.getCorporateActionCancellationReason();
		}

		@Override
		public void setValue(CorporateActionStatusReason obj, CorporateActionCancellationReasonCode value) {
			obj.setCorporateActionCancellationReason(value);
		}
	};
	protected CorporateActionStatus corporateActionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionStatusReason
	 * CorporateActionStatus.mmCorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate actions status for which a reason is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionStatusReason, Optional<CorporateActionStatus>> mmCorporateActionStatus = new MMBusinessAssociationEnd<CorporateActionStatusReason, Optional<CorporateActionStatus>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Corporate actions status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionStatusReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
		}

		@Override
		public Optional<CorporateActionStatus> getValue(CorporateActionStatusReason obj) {
			return obj.getCorporateActionStatus();
		}

		@Override
		public void setValue(CorporateActionStatusReason obj, Optional<CorporateActionStatus> value) {
			obj.setCorporateActionStatus(value.orElse(null));
		}
	};
	protected AcknowledgementReasonCode acceptedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason1Choice#mmCode
	 * AcceptedReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason1Choice#mmProprietary
	 * AcceptedReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason1#mmReasonCode
	 * AcceptedStatusReason1.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus1Choice#mmReason
	 * AcceptedStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#mmAccepted
	 * InstructionCancellationRequestStatus1Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason2Choice#mmCode
	 * AcceptedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason2Choice#mmProprietary
	 * AcceptedReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason2#mmReasonCode
	 * AcceptedStatusReason2.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus2Choice#mmReason
	 * AcceptedStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#mmAccepted
	 * InstructionCancellationRequestStatus2Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#mmAccepted
	 * InstructionCancellationRequestStatus3Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#mmAccepted
	 * InstructionCancellationRequestStatus4Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmAccepted
	 * InstructionCancellationRequestStatus5Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#mmAccepted
	 * InstructionCancellationRequestStatus6Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#mmAccepted
	 * InstructionProcessingStatus1Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#mmAccepted
	 * InstructionProcessingStatus4Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmAccepted
	 * InstructionProcessingStatus7Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#mmAccepted
	 * InstructionProcessingStatus8Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus12Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus13Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason3Choice#mmCode
	 * AcceptedReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason3Choice#mmProprietary
	 * AcceptedReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason3#mmReasonCode
	 * AcceptedStatusReason3.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus15Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus16Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason5Choice#mmCode
	 * AcceptedReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason5Choice#mmProprietary
	 * AcceptedReason5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason5#mmReasonCode
	 * AcceptedStatusReason5.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus20Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmAccepted
	 * InstructionCancellationRequestStatus7Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus21Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#mmAccepted
	 * InstructionCancellationRequestStatus8Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#mmAccepted
	 * InstructionCancellationRequestStatus9Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus24Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9#mmReasonCode
	 * AcceptedStatusReason9.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason10Choice#mmCode
	 * AcceptedReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason10Choice#mmProprietary
	 * AcceptedReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmAccepted
	 * InstructionCancellationRequestStatus10Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus25Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason10#mmReasonCode
	 * AcceptedStatusReason10.mmReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason11Choice#mmCode
	 * AcceptedReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason11Choice#mmProprietary
	 * AcceptedReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#mmAccepted
	 * InstructionCancellationRequestStatus11Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus29Choice.mmAcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmAccepted
	 * InstructionCancellationRequestStatus12Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#mmAcceptedForFurtherProcessing
	 * InstructionProcessingStatus30Choice.mmAcceptedForFurtherProcessing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionStatusReason, AcknowledgementReasonCode> mmAcceptedReason = new MMBusinessAttribute<CorporateActionStatusReason, AcknowledgementReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptedReason1Choice.mmCode, AcceptedReason1Choice.mmProprietary, AcceptedStatusReason1.mmReasonCode, AcceptedStatus1Choice.mmReason,
					InstructionCancellationRequestStatus1Choice.mmAccepted, AcceptedReason2Choice.mmCode, AcceptedReason2Choice.mmProprietary, AcceptedStatusReason2.mmReasonCode, AcceptedStatus2Choice.mmReason,
					InstructionCancellationRequestStatus2Choice.mmAccepted, InstructionCancellationRequestStatus3Choice.mmAccepted, InstructionCancellationRequestStatus4Choice.mmAccepted,
					InstructionCancellationRequestStatus5Choice.mmAccepted, InstructionCancellationRequestStatus6Choice.mmAccepted, InstructionProcessingStatus1Choice.mmAccepted, InstructionProcessingStatus4Choice.mmAccepted,
					InstructionProcessingStatus7Choice.mmAccepted, InstructionProcessingStatus8Choice.mmAccepted, InstructionProcessingStatus12Choice.mmAcceptedForFurtherProcessing,
					InstructionProcessingStatus13Choice.mmAcceptedForFurtherProcessing, AcceptedReason3Choice.mmCode, AcceptedReason3Choice.mmProprietary, AcceptedStatusReason3.mmReasonCode,
					InstructionProcessingStatus15Choice.mmAcceptedForFurtherProcessing, InstructionProcessingStatus16Choice.mmAcceptedForFurtherProcessing, AcceptedReason5Choice.mmCode, AcceptedReason5Choice.mmProprietary,
					AcceptedStatusReason5.mmReasonCode, InstructionProcessingStatus20Choice.mmAcceptedForFurtherProcessing, InstructionCancellationRequestStatus7Choice.mmAccepted,
					InstructionProcessingStatus21Choice.mmAcceptedForFurtherProcessing, InstructionCancellationRequestStatus8Choice.mmAccepted, InstructionCancellationRequestStatus9Choice.mmAccepted,
					InstructionProcessingStatus24Choice.mmAcceptedForFurtherProcessing, AcceptedStatusReason9.mmReasonCode, AcceptedReason10Choice.mmCode, AcceptedReason10Choice.mmProprietary,
					InstructionCancellationRequestStatus10Choice.mmAccepted, InstructionProcessingStatus25Choice.mmAcceptedForFurtherProcessing, AcceptedStatusReason10.mmReasonCode, AcceptedReason11Choice.mmCode,
					AcceptedReason11Choice.mmProprietary, InstructionCancellationRequestStatus11Choice.mmAccepted, InstructionProcessingStatus29Choice.mmAcceptedForFurtherProcessing, InstructionCancellationRequestStatus12Choice.mmAccepted,
					InstructionProcessingStatus30Choice.mmAcceptedForFurtherProcessing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}

		@Override
		public AcknowledgementReasonCode getValue(CorporateActionStatusReason obj) {
			return obj.getAcceptedReason();
		}

		@Override
		public void setValue(CorporateActionStatusReason obj, AcknowledgementReasonCode value) {
			obj.setAcceptedReason(value);
		}
	};
	protected CorporateActionReversalReasonCode reversalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
	 * CorporateActionReversalReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason1Choice#mmCode
	 * CorporateActionReversalReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason1Choice#mmProprietary
	 * CorporateActionReversalReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason2Choice#mmCode
	 * CorporateActionReversalReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason2Choice#mmProprietary
	 * CorporateActionReversalReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#mmCode
	 * CorporateActionReversalReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#mmProprietary
	 * CorporateActionReversalReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason4Choice#mmCode
	 * CorporateActionReversalReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason4Choice#mmProprietary
	 * CorporateActionReversalReason4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionStatusReason, CorporateActionReversalReasonCode> mmReversalReason = new MMBusinessAttribute<CorporateActionStatusReason, CorporateActionReversalReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionReversalReason1Choice.mmCode, CorporateActionReversalReason1Choice.mmProprietary, CorporateActionReversalReason2Choice.mmCode,
					CorporateActionReversalReason2Choice.mmProprietary, CorporateActionReversalReason3Choice.mmCode, CorporateActionReversalReason3Choice.mmProprietary, CorporateActionReversalReason4Choice.mmCode,
					CorporateActionReversalReason4Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionReversalReasonCode.mmObject();
		}

		@Override
		public CorporateActionReversalReasonCode getValue(CorporateActionStatusReason obj) {
			return obj.getReversalReason();
		}

		@Override
		public void setValue(CorporateActionStatusReason obj, CorporateActionReversalReasonCode value) {
			obj.setReversalReason(value);
		}
	};
	protected FailedSettlementReasonCode movementFailureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
	 * FailedSettlementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice#mmCode
	 * FailedSettlementReason1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice#mmProprietary
	 * FailedSettlementReason1FormatChoice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailedMovement1#mmReason
	 * FailedMovement1.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementFailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The reason for the failure."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionStatusReason, FailedSettlementReasonCode> mmMovementFailureReason = new MMBusinessAttribute<CorporateActionStatusReason, FailedSettlementReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FailedSettlementReason1FormatChoice.mmCode, FailedSettlementReason1FormatChoice.mmProprietary, FailedMovement1.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementFailureReason";
			definition = "The reason for the failure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailedSettlementReasonCode.mmObject();
		}

		@Override
		public FailedSettlementReasonCode getValue(CorporateActionStatusReason obj) {
			return obj.getMovementFailureReason();
		}

		@Override
		public void setValue(CorporateActionStatusReason obj, FailedSettlementReasonCode value) {
			obj.setMovementFailureReason(value);
		}
	};
	protected RejectionReasonCode movementRejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the rejection status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionStatusReason, RejectionReasonCode> mmMovementRejectionReason = new MMBusinessAttribute<CorporateActionStatusReason, RejectionReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementRejectionReason";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}

		@Override
		public RejectionReasonCode getValue(CorporateActionStatusReason obj) {
			return obj.getMovementRejectionReason();
		}

		@Override
		public void setValue(CorporateActionStatusReason obj, RejectionReasonCode value) {
			obj.setMovementRejectionReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatusReason";
				definition = "Specifies the underlying reason for a status of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionStatusReason);
				derivationElement_lazy = () -> Arrays.asList(PendingStatus2Choice.mmReason, PendingStatus5Choice.mmReason, InstructionProcessingStatus1Choice.mmDefaultAction, InstructionProcessingStatus1Choice.mmStandingInstruction,
						InstructionProcessingStatus4Choice.mmDefaultAction, InstructionProcessingStatus4Choice.mmStandingInstruction, InstructionProcessingStatus7Choice.mmDefaultAction,
						InstructionProcessingStatus7Choice.mmStandingInstruction, InstructionProcessingStatus8Choice.mmDefaultAction, InstructionProcessingStatus8Choice.mmStandingInstruction,
						InstructionProcessingStatus12Choice.mmDefaultAction, InstructionProcessingStatus12Choice.mmStandingInstruction, InstructionProcessingStatus13Choice.mmDefaultAction,
						InstructionProcessingStatus13Choice.mmStandingInstruction, CorporateActionReversalReason1.mmReason, CorporateActionReversalReason2.mmReason, AcceptedStatus3Choice.mmReason,
						InstructionProcessingStatus15Choice.mmDefaultAction, InstructionProcessingStatus15Choice.mmStandingInstruction, InstructionProcessingStatus16Choice.mmDefaultAction,
						InstructionProcessingStatus16Choice.mmStandingInstruction, AcceptedStatus5Choice.mmReason, InstructionProcessingStatus20Choice.mmDefaultAction, InstructionProcessingStatus20Choice.mmStandingInstruction,
						InstructionProcessingStatus21Choice.mmDefaultAction, InstructionProcessingStatus21Choice.mmStandingInstruction, CorporateActionReversalReason3.mmReason, InstructionProcessingStatus24Choice.mmDefaultAction,
						InstructionProcessingStatus24Choice.mmStandingInstruction, AcceptedStatus8Choice.mmReason, PendingStatus41Choice.mmReason, InstructionProcessingStatus25Choice.mmDefaultAction,
						InstructionProcessingStatus25Choice.mmStandingInstruction, CorporateActionReversalReason4.mmReason, PendingStatus43Choice.mmReason, AcceptedStatus9Choice.mmReason,
						InstructionProcessingStatus29Choice.mmDefaultAction, InstructionProcessingStatus29Choice.mmStandingInstruction, InstructionProcessingStatus30Choice.mmDefaultAction,
						InstructionProcessingStatus30Choice.mmStandingInstruction);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionCancellationReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmCorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionStatusReason.mmAcceptedReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmReversalReason,
						com.tools20022.repository.entity.CorporateActionStatusReason.mmMovementFailureReason, com.tools20022.repository.entity.CorporateActionStatusReason.mmMovementRejectionReason);
				derivationComponent_lazy = () -> Arrays.asList(PendingReason4Choice.mmObject(), PendingStatusReason2.mmObject(), PendingStatus2Choice.mmObject(), PendingReason5Choice.mmObject(), PendingStatusReason3.mmObject(),
						PendingStatus5Choice.mmObject(), CancelledReason1Choice.mmObject(), CancelledStatusReason4.mmObject(), CancelledStatus1Choice.mmObject(), AcceptedReason1Choice.mmObject(), AcceptedStatusReason1.mmObject(),
						AcceptedStatus1Choice.mmObject(), RejectedReason1Choice.mmObject(), RejectedStatusReason8.mmObject(), RejectedStatus1Choice.mmObject(), PendingCancellationReason1Choice.mmObject(),
						PendingCancellationStatusReason1.mmObject(), PendingCancellationStatus1Choice.mmObject(), CancelledReason2Choice.mmObject(), CancelledStatusReason5.mmObject(), CancelledStatus2Choice.mmObject(),
						AcceptedReason2Choice.mmObject(), AcceptedStatusReason2.mmObject(), AcceptedStatus2Choice.mmObject(), RejectedReason2Choice.mmObject(), RejectedStatusReason9.mmObject(), RejectedStatus2Choice.mmObject(),
						PendingCancellationReason2Choice.mmObject(), PendingCancellationStatusReason2.mmObject(), PendingCancellationStatus2Choice.mmObject(), CancelledReason3Choice.mmObject(), CancelledStatusReason6.mmObject(),
						CancelledStatus3Choice.mmObject(), CancelledReason4Choice.mmObject(), CancelledStatusReason7.mmObject(), CancelledStatus4Choice.mmObject(), PendingCancellationStatusReason3.mmObject(),
						PendingCancellationStatus3Choice.mmObject(), PendingCancellationStatusReason4.mmObject(), PendingCancellationStatus4Choice.mmObject(), PendingReason6Choice.mmObject(), PendingStatusReason1.mmObject(),
						PendingStatus1Choice.mmObject(), InstructionProcessingStatus1Choice.mmObject(), PendingReason7Choice.mmObject(), PendingStatusReason4.mmObject(), PendingStatus6Choice.mmObject(),
						InstructionProcessingStatus4Choice.mmObject(), InstructionProcessingStatus7Choice.mmObject(), InstructionProcessingStatus8Choice.mmObject(), InstructionProcessingStatus12Choice.mmObject(),
						InstructionProcessingStatus13Choice.mmObject(), CorporateActionReversalReason1Choice.mmObject(), CorporateActionReversalReason1.mmObject(), CorporateActionReversalReason2Choice.mmObject(),
						CorporateActionReversalReason2.mmObject(), RejectionReason11FormatChoice.mmObject(), RejectionReason6FormatChoice.mmObject(), RejectionReason18FormatChoice.mmObject(), RejectionReason9FormatChoice.mmObject(),
						RejectionReason8FormatChoice.mmObject(), RejectionReason19FormatChoice.mmObject(), FailedSettlementReason1FormatChoice.mmObject(), RejectionReason13FormatChoice.mmObject(), RejectionReason14FormatChoice.mmObject(),
						RejectionReason15FormatChoice.mmObject(), RejectionReason20FormatChoice.mmObject(), RejectionReason10FormatChoice.mmObject(), RejectionReason12FormatChoice.mmObject(), RejectionReason7FormatChoice.mmObject(),
						PendingReason22Choice.mmObject(), AcceptedReason3Choice.mmObject(), AcceptedStatus3Choice.mmObject(), AcceptedStatusReason3.mmObject(), RejectedStatus9Choice.mmObject(), RejectedStatusReason10.mmObject(),
						PendingStatus32Choice.mmObject(), PendingStatusReason5.mmObject(), InstructionProcessingStatus15Choice.mmObject(), RejectedReason5Choice.mmObject(), InstructionProcessingStatus16Choice.mmObject(),
						PendingStatusReason6.mmObject(), PendingReason23Choice.mmObject(), RejectedReason6Choice.mmObject(), RejectedStatusReason11.mmObject(), RejectedStatus11Choice.mmObject(), PendingStatus33Choice.mmObject(),
						AcceptedReason5Choice.mmObject(), AcceptedStatusReason5.mmObject(), AcceptedStatus5Choice.mmObject(), CorporateActionCancellation2SD1.mmObject(), InstructionProcessingStatus20Choice.mmObject(),
						CancelledStatus7Choice.mmObject(), CancelledStatusReason8.mmObject(), RejectedStatus13Choice.mmObject(), RejectedStatusReason13.mmObject(), RejectedStatus14Choice.mmObject(), RejectedStatusReason14.mmObject(),
						CancelledReason5Choice.mmObject(), RejectedReason10Choice.mmObject(), RejectedReason9Choice.mmObject(), PendingStatus34Choice.mmObject(), PendingStatusReason7.mmObject(), PendingReason24Choice.mmObject(),
						InstructionProcessingStatus21Choice.mmObject(), CancelledStatus8Choice.mmObject(), CancelledStatusReason9.mmObject(), RejectedStatus15Choice.mmObject(), RejectedStatusReason15.mmObject(),
						RejectedReason11Choice.mmObject(), PendingStatus35Choice.mmObject(), RejectedStatus16Choice.mmObject(), CancelledStatus9Choice.mmObject(), PendingStatusReason8.mmObject(), PendingReason25Choice.mmObject(),
						CancelledStatusReason10.mmObject(), CancelledReason6Choice.mmObject(), RejectedStatusReason16.mmObject(), CancelledReason7Choice.mmObject(), RejectedReason12Choice.mmObject(),
						CorporateActionReversalReason3.mmObject(), InstructionProcessingStatus24Choice.mmObject(), PendingCancellationReason3Choice.mmObject(), RejectedStatus19Choice.mmObject(), RejectedStatusReason17.mmObject(),
						RejectedReason14Choice.mmObject(), CancelledStatusReason12.mmObject(), CancelledReason9Choice.mmObject(), AcceptedStatus8Choice.mmObject(), CancelledStatus12Choice.mmObject(), PendingStatus42Choice.mmObject(),
						CancelledStatus11Choice.mmObject(), PendingCancellationStatus5Choice.mmObject(), RejectedStatus18Choice.mmObject(), PendingStatusReason10.mmObject(), PendingReason33Choice.mmObject(),
						CorporateActionReversalReason3Choice.mmObject(), CancelledReason8Choice.mmObject(), RejectedStatusReason18.mmObject(), PendingReason32Choice.mmObject(), PendingStatus41Choice.mmObject(),
						PendingCancellationStatusReason5.mmObject(), AcceptedStatusReason9.mmObject(), AcceptedReason10Choice.mmObject(), PendingStatusReason9.mmObject(), CancelledStatusReason11.mmObject(),
						RejectedReason13Choice.mmObject(), InstructionProcessingStatus25Choice.mmObject(), CorporateActionReversalReason4.mmObject(), PendingCancellationStatus6Choice.mmObject(), CancelledStatus14Choice.mmObject(),
						RejectedStatus20Choice.mmObject(), PendingCancellationStatusReason6.mmObject(), PendingCancellationReason4Choice.mmObject(), CancelledStatusReason14.mmObject(), CancelledReason11Choice.mmObject(),
						CancelledStatus15Choice.mmObject(), CorporateActionReversalReason4Choice.mmObject(), RejectedStatusReason19.mmObject(), RejectedReason18Choice.mmObject(), CancelledStatusReason13.mmObject(),
						CancelledReason10Choice.mmObject(), AcceptedStatusReason10.mmObject(), AcceptedReason11Choice.mmObject(), PendingReason35Choice.mmObject(), PendingStatus43Choice.mmObject(), PendingStatusReason11.mmObject(),
						PendingStatusReason12.mmObject(), PendingReason34Choice.mmObject(), PendingStatus44Choice.mmObject(), RejectedStatus21Choice.mmObject(), RejectedStatusReason20.mmObject(), RejectedReason19Choice.mmObject(),
						AcceptedStatus9Choice.mmObject(), CancelledReason12Choice.mmObject(), InstructionProcessingStatus29Choice.mmObject(), PendingCancellationReason5Choice.mmObject(), PendingCancellationStatus7Choice.mmObject(),
						PendingReason48Choice.mmObject(), RejectedStatus23Choice.mmObject(), PendingStatus52Choice.mmObject(), PendingCancellationStatusReason7.mmObject(), RejectedStatusReason21.mmObject(),
						RejectedReason22Choice.mmObject(), PendingStatusReason13.mmObject(), InstructionProcessingStatus30Choice.mmObject(), RejectedStatusReason22.mmObject(), RejectedReason23Choice.mmObject(),
						PendingCancellationStatus8Choice.mmObject(), PendingCancellationStatusReason8.mmObject(), RejectedStatus24Choice.mmObject(), PendingStatus53Choice.mmObject(), PendingReason49Choice.mmObject(),
						PendingCancellationReason6Choice.mmObject(), PendingStatusReason15.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionCancellationReasonCode getCorporateActionCancellationReason() {
		return corporateActionCancellationReason;
	}

	public CorporateActionStatusReason setCorporateActionCancellationReason(CorporateActionCancellationReasonCode corporateActionCancellationReason) {
		this.corporateActionCancellationReason = Objects.requireNonNull(corporateActionCancellationReason);
		return this;
	}

	public Optional<CorporateActionStatus> getCorporateActionStatus() {
		return corporateActionStatus == null ? Optional.empty() : Optional.of(corporateActionStatus);
	}

	public CorporateActionStatusReason setCorporateActionStatus(com.tools20022.repository.entity.CorporateActionStatus corporateActionStatus) {
		this.corporateActionStatus = corporateActionStatus;
		return this;
	}

	public AcknowledgementReasonCode getAcceptedReason() {
		return acceptedReason;
	}

	public CorporateActionStatusReason setAcceptedReason(AcknowledgementReasonCode acceptedReason) {
		this.acceptedReason = Objects.requireNonNull(acceptedReason);
		return this;
	}

	public CorporateActionReversalReasonCode getReversalReason() {
		return reversalReason;
	}

	public CorporateActionStatusReason setReversalReason(CorporateActionReversalReasonCode reversalReason) {
		this.reversalReason = Objects.requireNonNull(reversalReason);
		return this;
	}

	public FailedSettlementReasonCode getMovementFailureReason() {
		return movementFailureReason;
	}

	public CorporateActionStatusReason setMovementFailureReason(FailedSettlementReasonCode movementFailureReason) {
		this.movementFailureReason = Objects.requireNonNull(movementFailureReason);
		return this;
	}

	public RejectionReasonCode getMovementRejectionReason() {
		return movementRejectionReason;
	}

	public CorporateActionStatusReason setMovementRejectionReason(RejectionReasonCode movementRejectionReason) {
		this.movementRejectionReason = Objects.requireNonNull(movementRejectionReason);
		return this;
	}
}