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
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionCancellationReason
 * CorporateActionStatusReason.CorporateActionCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#CorporateActionStatus
 * CorporateActionStatusReason.CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#AcceptedReason
 * CorporateActionStatusReason.AcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#ReversalReason
 * CorporateActionStatusReason.ReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#MovementFailureReason
 * CorporateActionStatusReason.MovementFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#MovementRejectionReason
 * CorporateActionStatusReason.MovementRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionStatusReason
 * CorporateActionStatus.CorporateActionStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus2Choice#Reason
 * PendingStatus2Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus5Choice#Reason
 * PendingStatus5Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#DefaultAction
 * InstructionProcessingStatus1Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#StandingInstruction
 * InstructionProcessingStatus1Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#DefaultAction
 * InstructionProcessingStatus4Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#StandingInstruction
 * InstructionProcessingStatus4Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#DefaultAction
 * InstructionProcessingStatus7Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#StandingInstruction
 * InstructionProcessingStatus7Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#DefaultAction
 * InstructionProcessingStatus8Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#StandingInstruction
 * InstructionProcessingStatus8Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#DefaultAction
 * InstructionProcessingStatus12Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#StandingInstruction
 * InstructionProcessingStatus12Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#DefaultAction
 * InstructionProcessingStatus13Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#StandingInstruction
 * InstructionProcessingStatus13Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1#Reason
 * CorporateActionReversalReason1.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason2#Reason
 * CorporateActionReversalReason2.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus3Choice#Reason
 * AcceptedStatus3Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#DefaultAction
 * InstructionProcessingStatus15Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#StandingInstruction
 * InstructionProcessingStatus15Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#DefaultAction
 * InstructionProcessingStatus16Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#StandingInstruction
 * InstructionProcessingStatus16Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus5Choice#Reason
 * AcceptedStatus5Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#DefaultAction
 * InstructionProcessingStatus20Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#StandingInstruction
 * InstructionProcessingStatus20Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#DefaultAction
 * InstructionProcessingStatus21Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#StandingInstruction
 * InstructionProcessingStatus21Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason3#Reason
 * CorporateActionReversalReason3.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#DefaultAction
 * InstructionProcessingStatus24Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#StandingInstruction
 * InstructionProcessingStatus24Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus8Choice#Reason
 * AcceptedStatus8Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus41Choice#Reason
 * PendingStatus41Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#DefaultAction
 * InstructionProcessingStatus25Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#StandingInstruction
 * InstructionProcessingStatus25Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason4#Reason
 * CorporateActionReversalReason4.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus43Choice#Reason
 * PendingStatus43Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus9Choice#Reason
 * AcceptedStatus9Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#DefaultAction
 * InstructionProcessingStatus29Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#StandingInstruction
 * InstructionProcessingStatus29Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#DefaultAction
 * InstructionProcessingStatus30Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#StandingInstruction
 * InstructionProcessingStatus30Choice.StandingInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
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
	/**
	 * Specifies reasons for cancellation of a corporate action event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#CancellationReasonCode
	 * CorporateActionCancellation3.CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#CancellationReason
	 * CorporateActionCancellation3.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#CancellationReasonCode
	 * CorporateActionCancellation4.CancellationReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation4#CancellationReason
	 * CorporateActionCancellation4.CancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation2SD1#LocalLanguageCancellationReason
	 * CorporateActionCancellation2SD1.LocalLanguageCancellationReason}</li>
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
	public static final MMBusinessAttribute CorporateActionCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionCancellation3.CancellationReasonCode, com.tools20022.repository.msg.CorporateActionCancellation3.CancellationReason,
					com.tools20022.repository.msg.CorporateActionCancellation4.CancellationReasonCode, com.tools20022.repository.msg.CorporateActionCancellation4.CancellationReason,
					com.tools20022.repository.msg.CorporateActionCancellation2SD1.LocalLanguageCancellationReason);
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCancellationReason";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
		}
	};
	/**
	 * Corporate actions status for which a reason is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionStatusReason
	 * CorporateActionStatus.CorporateActionStatusReason}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Corporate actions status for which a reason is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason1Choice#Code
	 * AcceptedReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason1Choice#Proprietary
	 * AcceptedReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason1#ReasonCode
	 * AcceptedStatusReason1.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus1Choice#Reason
	 * AcceptedStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice#Accepted
	 * InstructionCancellationRequestStatus1Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason2Choice#Code
	 * AcceptedReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason2Choice#Proprietary
	 * AcceptedReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason2#ReasonCode
	 * AcceptedStatusReason2.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus2Choice#Reason
	 * AcceptedStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice#Accepted
	 * InstructionCancellationRequestStatus2Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice#Accepted
	 * InstructionCancellationRequestStatus3Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice#Accepted
	 * InstructionCancellationRequestStatus4Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#Accepted
	 * InstructionCancellationRequestStatus5Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice#Accepted
	 * InstructionCancellationRequestStatus6Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus1Choice#Accepted
	 * InstructionProcessingStatus1Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus4Choice#Accepted
	 * InstructionProcessingStatus4Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#Accepted
	 * InstructionProcessingStatus7Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus8Choice#Accepted
	 * InstructionProcessingStatus8Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus12Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus13Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus13Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason3Choice#Code
	 * AcceptedReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason3Choice#Proprietary
	 * AcceptedReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason3#ReasonCode
	 * AcceptedStatusReason3.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus15Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus15Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus16Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus16Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason5Choice#Code
	 * AcceptedReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason5Choice#Proprietary
	 * AcceptedReason5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason5#ReasonCode
	 * AcceptedStatusReason5.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus20Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus20Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#Accepted
	 * InstructionCancellationRequestStatus7Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus21Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus21Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice#Accepted
	 * InstructionCancellationRequestStatus8Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice#Accepted
	 * InstructionCancellationRequestStatus9Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus24Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus24Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason9#ReasonCode
	 * AcceptedStatusReason9.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason10Choice#Code
	 * AcceptedReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason10Choice#Proprietary
	 * AcceptedReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#Accepted
	 * InstructionCancellationRequestStatus10Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus25Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus25Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptedStatusReason10#ReasonCode
	 * AcceptedStatusReason10.ReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason11Choice#Code
	 * AcceptedReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcceptedReason11Choice#Proprietary
	 * AcceptedReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice#Accepted
	 * InstructionCancellationRequestStatus11Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus29Choice.AcceptedForFurtherProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#Accepted
	 * InstructionCancellationRequestStatus12Choice.Accepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus30Choice#AcceptedForFurtherProcessing
	 * InstructionProcessingStatus30Choice.AcceptedForFurtherProcessing}</li>
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
	public static final MMBusinessAttribute AcceptedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AcceptedReason1Choice.Code, com.tools20022.repository.choice.AcceptedReason1Choice.Proprietary,
					com.tools20022.repository.msg.AcceptedStatusReason1.ReasonCode, com.tools20022.repository.choice.AcceptedStatus1Choice.Reason, com.tools20022.repository.choice.InstructionCancellationRequestStatus1Choice.Accepted,
					com.tools20022.repository.choice.AcceptedReason2Choice.Code, com.tools20022.repository.choice.AcceptedReason2Choice.Proprietary, com.tools20022.repository.msg.AcceptedStatusReason2.ReasonCode,
					com.tools20022.repository.choice.AcceptedStatus2Choice.Reason, com.tools20022.repository.choice.InstructionCancellationRequestStatus2Choice.Accepted,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice.Accepted, com.tools20022.repository.choice.InstructionCancellationRequestStatus4Choice.Accepted,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.Accepted, com.tools20022.repository.choice.InstructionCancellationRequestStatus6Choice.Accepted,
					com.tools20022.repository.choice.InstructionProcessingStatus1Choice.Accepted, com.tools20022.repository.choice.InstructionProcessingStatus4Choice.Accepted,
					com.tools20022.repository.choice.InstructionProcessingStatus7Choice.Accepted, com.tools20022.repository.choice.InstructionProcessingStatus8Choice.Accepted,
					com.tools20022.repository.choice.InstructionProcessingStatus12Choice.AcceptedForFurtherProcessing, com.tools20022.repository.choice.InstructionProcessingStatus13Choice.AcceptedForFurtherProcessing,
					com.tools20022.repository.choice.AcceptedReason3Choice.Code, com.tools20022.repository.choice.AcceptedReason3Choice.Proprietary, com.tools20022.repository.msg.AcceptedStatusReason3.ReasonCode,
					com.tools20022.repository.choice.InstructionProcessingStatus15Choice.AcceptedForFurtherProcessing, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.AcceptedForFurtherProcessing,
					com.tools20022.repository.choice.AcceptedReason5Choice.Code, com.tools20022.repository.choice.AcceptedReason5Choice.Proprietary, com.tools20022.repository.msg.AcceptedStatusReason5.ReasonCode,
					com.tools20022.repository.choice.InstructionProcessingStatus20Choice.AcceptedForFurtherProcessing, com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice.Accepted,
					com.tools20022.repository.choice.InstructionProcessingStatus21Choice.AcceptedForFurtherProcessing, com.tools20022.repository.choice.InstructionCancellationRequestStatus8Choice.Accepted,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus9Choice.Accepted, com.tools20022.repository.choice.InstructionProcessingStatus24Choice.AcceptedForFurtherProcessing,
					com.tools20022.repository.msg.AcceptedStatusReason9.ReasonCode, com.tools20022.repository.choice.AcceptedReason10Choice.Code, com.tools20022.repository.choice.AcceptedReason10Choice.Proprietary,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice.Accepted, com.tools20022.repository.choice.InstructionProcessingStatus25Choice.AcceptedForFurtherProcessing,
					com.tools20022.repository.msg.AcceptedStatusReason10.ReasonCode, com.tools20022.repository.choice.AcceptedReason11Choice.Code, com.tools20022.repository.choice.AcceptedReason11Choice.Proprietary,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus11Choice.Accepted, com.tools20022.repository.choice.InstructionProcessingStatus29Choice.AcceptedForFurtherProcessing,
					com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.Accepted, com.tools20022.repository.choice.InstructionProcessingStatus30Choice.AcceptedForFurtherProcessing);
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the reversal.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason1Choice#Code
	 * CorporateActionReversalReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason1Choice#Proprietary
	 * CorporateActionReversalReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason2Choice#Code
	 * CorporateActionReversalReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason2Choice#Proprietary
	 * CorporateActionReversalReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#Code
	 * CorporateActionReversalReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#Proprietary
	 * CorporateActionReversalReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason4Choice#Code
	 * CorporateActionReversalReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason4Choice#Proprietary
	 * CorporateActionReversalReason4Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute ReversalReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionReversalReason1Choice.Code, com.tools20022.repository.choice.CorporateActionReversalReason1Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionReversalReason2Choice.Code, com.tools20022.repository.choice.CorporateActionReversalReason2Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionReversalReason3Choice.Code, com.tools20022.repository.choice.CorporateActionReversalReason3Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionReversalReason4Choice.Code, com.tools20022.repository.choice.CorporateActionReversalReason4Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionReversalReasonCode.mmObject();
		}
	};
	/**
	 * The reason for the failure.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice#Code
	 * FailedSettlementReason1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice#Proprietary
	 * FailedSettlementReason1FormatChoice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailedMovement1#Reason
	 * FailedMovement1.Reason}</li>
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
	public static final MMBusinessAttribute MovementFailureReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FailedSettlementReason1FormatChoice.Code, com.tools20022.repository.choice.FailedSettlementReason1FormatChoice.Proprietary,
					com.tools20022.repository.msg.FailedMovement1.Reason);
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementFailureReason";
			definition = "The reason for the failure.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FailedSettlementReasonCode.mmObject();
		}
	};
	/**
	 * Provides information about the rejection status.
	 * <p>
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
	public static final MMBusinessAttribute MovementRejectionReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementRejectionReason";
			definition = "Provides information about the rejection status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatusReason";
				definition = "Specifies the underlying reason for a status of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PendingStatus2Choice.Reason, com.tools20022.repository.choice.PendingStatus5Choice.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus1Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus1Choice.StandingInstruction,
						com.tools20022.repository.choice.InstructionProcessingStatus4Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus4Choice.StandingInstruction,
						com.tools20022.repository.choice.InstructionProcessingStatus7Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus7Choice.StandingInstruction,
						com.tools20022.repository.choice.InstructionProcessingStatus8Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus8Choice.StandingInstruction,
						com.tools20022.repository.choice.InstructionProcessingStatus12Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus12Choice.StandingInstruction,
						com.tools20022.repository.choice.InstructionProcessingStatus13Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus13Choice.StandingInstruction,
						com.tools20022.repository.msg.CorporateActionReversalReason1.Reason, com.tools20022.repository.msg.CorporateActionReversalReason2.Reason, com.tools20022.repository.choice.AcceptedStatus3Choice.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus15Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus15Choice.StandingInstruction,
						com.tools20022.repository.choice.InstructionProcessingStatus16Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus16Choice.StandingInstruction,
						com.tools20022.repository.choice.AcceptedStatus5Choice.Reason, com.tools20022.repository.choice.InstructionProcessingStatus20Choice.DefaultAction,
						com.tools20022.repository.choice.InstructionProcessingStatus20Choice.StandingInstruction, com.tools20022.repository.choice.InstructionProcessingStatus21Choice.DefaultAction,
						com.tools20022.repository.choice.InstructionProcessingStatus21Choice.StandingInstruction, com.tools20022.repository.msg.CorporateActionReversalReason3.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus24Choice.DefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus24Choice.StandingInstruction,
						com.tools20022.repository.choice.AcceptedStatus8Choice.Reason, com.tools20022.repository.choice.PendingStatus41Choice.Reason, com.tools20022.repository.choice.InstructionProcessingStatus25Choice.DefaultAction,
						com.tools20022.repository.choice.InstructionProcessingStatus25Choice.StandingInstruction, com.tools20022.repository.msg.CorporateActionReversalReason4.Reason,
						com.tools20022.repository.choice.PendingStatus43Choice.Reason, com.tools20022.repository.choice.AcceptedStatus9Choice.Reason, com.tools20022.repository.choice.InstructionProcessingStatus29Choice.DefaultAction,
						com.tools20022.repository.choice.InstructionProcessingStatus29Choice.StandingInstruction, com.tools20022.repository.choice.InstructionProcessingStatus30Choice.DefaultAction,
						com.tools20022.repository.choice.InstructionProcessingStatus30Choice.StandingInstruction);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionCancellationReason, com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionStatusReason.AcceptedReason, com.tools20022.repository.entity.CorporateActionStatusReason.ReversalReason,
						com.tools20022.repository.entity.CorporateActionStatusReason.MovementFailureReason, com.tools20022.repository.entity.CorporateActionStatusReason.MovementRejectionReason);
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
		});
		return mmObject_lazy.get();
	}
}