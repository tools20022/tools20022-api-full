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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.StatusReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for a status of a securities trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeStatusReason"
 * src="doc-files/SecuritiesTradeStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#UnmatchedReason
 * SecuritiesTradeStatusReason.UnmatchedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#DeniedReason
 * SecuritiesTradeStatusReason.DeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#SecuritiesTradeStatus
 * SecuritiesTradeStatusReason.SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#GeneratedReason
 * SecuritiesTradeStatusReason.GeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#AllegementReason
 * SecuritiesTradeStatusReason.AllegementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#PendingSettlementReason
 * SecuritiesTradeStatusReason.PendingSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#RepoCallAcknowledgementReason
 * SecuritiesTradeStatusReason.RepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#RepairReason
 * SecuritiesTradeStatusReason.RepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#DeliveryReturnReason
 * SecuritiesTradeStatusReason.DeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#CounterpartyStatusReason
 * SecuritiesTradeStatusReason.CounterpartyStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#ModifiedStatusReason
 * SecuritiesTradeStatusReason.ModifiedStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#Reason
 * SecuritiesTradeStatus.Reason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#Proprietary
 * ProcessingStatus1Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#CancellationRequested
 * ProcessingStatus1Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#ModificationRequested
 * ProcessingStatus1Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#Proprietary
 * ProcessingStatus19Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#CancellationRequested
 * ProcessingStatus19Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#ModificationRequested
 * ProcessingStatus19Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus1Choice#Reason
 * UnmatchedStatus1Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus5Choice#Reason
 * UnmatchedStatus5Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus3Choice#Reason
 * PendingStatus3Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus2Choice#Reason
 * ModificationStatus2Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason1#Code
 * RejectionOrRepairReason1.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus6Choice#Reason
 * RejectionOrRepairStatus6Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#Proprietary
 * ProcessingStatus2Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason9#Code
 * RejectionOrRepairReason9.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus10Choice#Reason
 * RejectionOrRepairStatus10Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#Proprietary
 * ProcessingStatus13Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason3#Code
 * RejectionOrRepairReason3.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus4Choice#Reason
 * RejectionOrRepairStatus4Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason10#Code
 * RejectionOrRepairReason10.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus11Choice#Reason
 * RejectionOrRepairStatus11Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason18#Code
 * RejectionOrRepairReason18.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus25Choice#Reason
 * RejectionOrRepairStatus25Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason13#Code
 * RejectionOrRepairReason13.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus14Choice#Reason
 * RejectionOrRepairStatus14Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#Proprietary
 * ProcessingStatus20Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#Proprietary
 * ProcessingStatus25Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#CancellationRequested
 * ProcessingStatus25Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#ModificationRequested
 * ProcessingStatus25Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus10Choice#Reason
 * UnmatchedStatus10Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus3Choice#Reason
 * ModificationStatus3Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason19#Code
 * RejectionOrRepairReason19.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus24Choice#Reason
 * RejectionOrRepairStatus24Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason16#Code
 * RejectionOrRepairReason16.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus20Choice#Reason
 * RejectionOrRepairStatus20Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#Proprietary
 * ProcessingStatus26Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#Completed
 * ProcessingStatus5Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#Proprietary
 * ProcessingStatus5Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason7#Code
 * RejectionOrRepairReason7.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus9Choice#Reason
 * RejectionOrRepairStatus9Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#Completed
 * ProcessingStatus11Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#Proprietary
 * ProcessingStatus11Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#Completed
 * ProcessingStatus14Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#Proprietary
 * ProcessingStatus14Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason11#Code
 * RejectionOrRepairReason11.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus12Choice#Reason
 * RejectionOrRepairStatus12Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#Completed
 * ProcessingStatus15Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#Proprietary
 * ProcessingStatus15Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#Completed
 * ProcessingStatus18Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#Proprietary
 * ProcessingStatus18Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#Completed
 * ProcessingStatus24Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#Proprietary
 * ProcessingStatus24Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#Proprietary
 * ProcessingStatus6Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#CancellationRequested
 * ProcessingStatus6Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#Proprietary
 * ProcessingStatus12Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#CancellationRequested
 * ProcessingStatus12Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus4Choice#Reason
 * UnmatchedStatus4Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PendingStatus8Choice#Reason
 * PendingStatus8Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#Proprietary
 * ProcessingStatus23Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#CancellationRequested
 * ProcessingStatus23Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#Proprietary
 * ProcessingStatus29Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#CancellationRequested
 * ProcessingStatus29Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#Proprietary
 * ProcessingStatus7Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#CancellationRequested
 * ProcessingStatus7Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#ModificationRequested
 * ProcessingStatus7Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#ModificationRequested
 * InstructionProcessingStatus3Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#ModificationRequested
 * InstructionProcessingStatus6Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus3Choice#Reason
 * GeneratedStatus3Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#ModificationRequested
 * InstructionProcessingStatus10Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus4Choice#Reason
 * GeneratedStatus4Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#ModificationRequested
 * InstructionProcessingStatus11Choice.ModificationRequested}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AffirmationReason1#Code
 * AffirmationReason1.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessing1Choice#Reason
 * PendingProcessing1Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#AlreadyMatchedAndAffirmed
 * ProcessingStatus17Choice.AlreadyMatchedAndAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#DefaultAction
 * ProcessingStatus17Choice.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#Done
 * ProcessingStatus17Choice.Done}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#ForcedRejection
 * ProcessingStatus17Choice.ForcedRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#FullyExecutedConfirmationSent
 * ProcessingStatus17Choice.FullyExecutedConfirmationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#Future
 * ProcessingStatus17Choice.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#Generated
 * ProcessingStatus17Choice.Generated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#NoInstruction
 * ProcessingStatus17Choice.NoInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#OpenOrder
 * ProcessingStatus17Choice.OpenOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#ReceivedAtIntermediary
 * ProcessingStatus17Choice.ReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#SettlementInstructionSent
 * ProcessingStatus17Choice.SettlementInstructionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#StandingInstruction
 * ProcessingStatus17Choice.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#TradingSuspendedByStockExchange
 * ProcessingStatus17Choice.TradingSuspendedByStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#Treated
 * ProcessingStatus17Choice.Treated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#ProprietaryStatus
 * ProcessingStatus17Choice.ProprietaryStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AllegmentMatchingReason1#Code
 * AllegmentMatchingReason1.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationReason11Choice#Reason
 * CancellationReason11Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#ConditionallyAccepted
 * IndividualOrderStatusAndReason1.ConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice#Reason
 * TransferCancellationCompleteStatusChoice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus2#Reason
 * TransferInstructionStatus2.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason4#Code
 * RejectionOrRepairReason4.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus2Choice#Reason
 * RejectionOrRepairStatus2Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#Rejected
 * IntraPositionProcessingStatus1Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#Repair
 * IntraPositionProcessingStatus1Choice.Repair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#Proprietary
 * ProcessingStatus3Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#CancellationRequested
 * ProcessingStatus3Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#ModificationRequested
 * ProcessingStatus3Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus2Choice#Reason
 * UnmatchedStatus2Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason2#Code
 * RejectionOrRepairReason2.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus5Choice#Reason
 * RejectionOrRepairStatus5Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus4Choice#Proprietary
 * ProcessingStatus4Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#Proprietary
 * ProcessingStatus10Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#CancellationRequested
 * ProcessingStatus10Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#ModificationRequested
 * ProcessingStatus10Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus3Choice#Reason
 * UnmatchedStatus3Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#Proprietary
 * ProcessingStatus21Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#CancellationRequested
 * ProcessingStatus21Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#ModificationRequested
 * ProcessingStatus21Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus6Choice#Reason
 * UnmatchedStatus6Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#Proprietary
 * ProcessingStatus27Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#CancellationRequested
 * ProcessingStatus27Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#ModificationRequested
 * ProcessingStatus27Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus11Choice#Reason
 * UnmatchedStatus11Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus20Choice#Forwarded
 * PendingStatus20Choice.Forwarded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus20Choice#UnderInvestigation
 * PendingStatus20Choice.UnderInvestigation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason5#Code
 * RejectionOrRepairReason5.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus7Choice#Reason
 * RejectionOrRepairStatus7Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus8Choice#Proprietary
 * ProcessingStatus8Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus18Choice#Reason
 * RejectionOrRepairStatus18Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus22Choice#Proprietary
 * ProcessingStatus22Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus23Choice#Reason
 * RejectionOrRepairStatus23Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus28Choice#Proprietary
 * ProcessingStatus28Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason6#Code
 * RejectionOrRepairReason6.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus8Choice#Reason
 * RejectionOrRepairStatus8Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#Proprietary
 * ProcessingStatus9Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason12#Code
 * RejectionOrRepairReason12.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus13Choice#Reason
 * RejectionOrRepairStatus13Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#Proprietary
 * ProcessingStatus16Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason8#Code
 * RejectionOrRepairReason8.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus3Choice#Reason
 * RejectionOrRepairStatus3Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#Rejected
 * IntraPositionProcessingStatus2Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#Repair
 * IntraPositionProcessingStatus2Choice.Repair}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason14#Code
 * RejectionOrRepairReason14.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus15Choice#Reason
 * RejectionOrRepairStatus15Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#Rejected
 * IntraPositionProcessingStatus3Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#Repair
 * IntraPositionProcessingStatus3Choice.Repair}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason17#Code
 * RejectionOrRepairReason17.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus21Choice#Reason
 * RejectionOrRepairStatus21Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#Rejected
 * IntraPositionProcessingStatus4Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#Repair
 * IntraPositionProcessingStatus4Choice.Repair}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason20#Code
 * RejectionOrRepairReason20.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus26Choice#Reason
 * RejectionOrRepairStatus26Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason22#Code
 * RejectionOrRepairReason22.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus28Choice#Reason
 * RejectionOrRepairStatus28Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#Proprietary
 * ProcessingStatus32Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#Proprietary
 * ProcessingStatus35Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#Completed
 * ProcessingStatus36Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#Proprietary
 * ProcessingStatus36Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason21#Code
 * RejectionOrRepairReason21.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus27Choice#Reason
 * RejectionOrRepairStatus27Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#Completed
 * ProcessingStatus31Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#Proprietary
 * ProcessingStatus31Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus3#Reason
 * TransferInstructionStatus3.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus5Choice#Reason
 * GeneratedStatus5Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#ModificationRequested
 * InstructionProcessingStatus14Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#Proprietary
 * ProcessingStatus38Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#CancellationRequested
 * ProcessingStatus38Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#ModificationRequested
 * ProcessingStatus38Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#CancellationRequested
 * ProcessingStatus37Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#ModificationRequested
 * ProcessingStatus37Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus12Choice#Reason
 * UnmatchedStatus12Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus13Choice#Reason
 * UnmatchedStatus13Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus4Choice#Reason
 * AcceptedStatus4Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#Proprietary
 * ProcessingStatus40Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#CancellationRequested
 * ProcessingStatus40Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#ModificationRequested
 * ProcessingStatus40Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#CancellationRequested
 * ProcessingStatus42Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#ModificationRequested
 * ProcessingStatus42Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus15Choice#Reason
 * UnmatchedStatus15Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#ModificationRequested
 * InstructionProcessingStatus17Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus6Choice#Reason
 * GeneratedStatus6Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus14Choice#Reason
 * UnmatchedStatus14Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus6Choice#Reason
 * AcceptedStatus6Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AllegementMatchingReason1#Code
 * AllegementMatchingReason1.Code}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportItemStatus1#Exception
 * ReportItemStatus1.Exception}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#Completed
 * ProcessingStatus44Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#Proprietary
 * ProcessingStatus44Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#Proprietary
 * ProcessingStatus45Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#Proprietary
 * ProcessingStatus47Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#Completed
 * ProcessingStatus46Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#Proprietary
 * ProcessingStatus46Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#Proprietary
 * ProcessingStatus55Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#Rejected
 * IntraPositionProcessingStatus5Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#Repair
 * IntraPositionProcessingStatus5Choice.Repair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#Completed
 * ProcessingStatus50Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#Proprietary
 * ProcessingStatus50Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#CancellationRequested
 * ProcessingStatus48Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#ModificationRequested
 * ProcessingStatus48Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#Proprietary
 * ProcessingStatus54Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#Proprietary
 * ProcessingStatus51Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#CancellationRequested
 * ProcessingStatus51Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#ModificationRequested
 * ProcessingStatus51Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus7Choice#Reason
 * AcceptedStatus7Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#Proprietary
 * ProcessingStatus52Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#CancellationRequested
 * ProcessingStatus52Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus31Choice#Reason
 * RejectionOrRepairStatus31Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus4Choice#Reason
 * ModificationStatus4Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason25#Code
 * RejectionOrRepairReason25.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus17Choice#Reason
 * UnmatchedStatus17Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#Proprietary
 * ProcessingStatus49Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#CancellationRequested
 * ProcessingStatus49Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#ModificationRequested
 * ProcessingStatus49Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus16Choice#Reason
 * UnmatchedStatus16Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#ModificationRequested
 * InstructionProcessingStatus22Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus29Choice#Reason
 * RejectionOrRepairStatus29Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason23#Code
 * RejectionOrRepairReason23.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#Proprietary
 * ProcessingStatus53Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice#Reason
 * GeneratedStatus7Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus32Choice#Reason
 * RejectionOrRepairStatus32Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus18Choice#Reason
 * UnmatchedStatus18Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason26#Code
 * RejectionOrRepairReason26.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#Reason
 * RejectionOrRepairStatus30Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24#Code
 * RejectionOrRepairReason24.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus4#Reason
 * TransferInstructionStatus4.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#Proprietary
 * ProcessingStatus57Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#CancellationRequested
 * ProcessingStatus57Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#ModificationRequested
 * ProcessingStatus57Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#Proprietary
 * ProcessingStatus65Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#Completed
 * ProcessingStatus58Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#Proprietary
 * ProcessingStatus58Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus64Choice#Proprietary
 * ProcessingStatus64Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#Rejected
 * IntraPositionProcessingStatus6Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#Repair
 * IntraPositionProcessingStatus6Choice.Repair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#CancellationRequested
 * ProcessingStatus63Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#ModificationRequested
 * ProcessingStatus63Choice.ModificationRequested}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason29#Code
 * RejectionOrRepairReason29.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#Proprietary
 * ProcessingStatus62Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#CancellationRequested
 * ProcessingStatus62Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus10Choice#Reason
 * AcceptedStatus10Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus19Choice#Reason
 * UnmatchedStatus19Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus8Choice#Reason
 * GeneratedStatus8Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason31#Code
 * RejectionOrRepairReason31.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus5Choice#Reason
 * ModificationStatus5Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#ModificationRequested
 * InstructionProcessingStatus27Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus34Choice#Reason
 * RejectionOrRepairStatus34Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason28#Code
 * RejectionOrRepairReason28.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus21Choice#Reason
 * UnmatchedStatus21Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#Proprietary
 * ProcessingStatus61Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus35Choice#Reason
 * RejectionOrRepairStatus35Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus33Choice#Reason
 * RejectionOrRepairStatus33Choice.Reason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionOrRepairReason27#Code
 * RejectionOrRepairReason27.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus20Choice#Reason
 * UnmatchedStatus20Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus37Choice#Reason
 * RejectionOrRepairStatus37Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#Proprietary
 * ProcessingStatus60Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#CancellationRequested
 * ProcessingStatus60Choice.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#ModificationRequested
 * ProcessingStatus60Choice.ModificationRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} = List of 807 elements</li>
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
 * "SecuritiesTradeStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for the unmatched status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
	 * UnmatchedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason1Choice#Code
	 * UnmatchedReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason1Choice#Proprietary
	 * UnmatchedReason1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason1#Code
	 * UnmatchedReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason9Choice#Code
	 * UnmatchedReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason9Choice#Proprietary
	 * UnmatchedReason9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason6#Code
	 * UnmatchedReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason13Choice#Code
	 * UnmatchedReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason13Choice#Proprietary
	 * UnmatchedReason13Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason9#Code
	 * UnmatchedReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason6Choice#Code
	 * UnmatchedReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason6Choice#Proprietary
	 * UnmatchedReason6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason4#Code
	 * UnmatchedReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason7Choice#Code
	 * UnmatchedReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason7Choice#Proprietary
	 * UnmatchedReason7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason5#Code
	 * UnmatchedReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason5#AdditionalReasonInformation
	 * UnmatchedReason5.AdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason1Choice#Reason
	 * MatchingReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason3Choice#Code
	 * UnmatchedReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason3Choice#Proprietary
	 * UnmatchedReason3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason2#Code
	 * UnmatchedReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason2Choice#Code
	 * UnmatchedReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason2Choice#Proprietary
	 * UnmatchedReason2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#UnmatchedReason
	 * Reason1Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#UnmatchedReason
	 * Reason6Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason5Choice#Code
	 * UnmatchedReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason5Choice#Proprietary
	 * UnmatchedReason5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason3#Code
	 * UnmatchedReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason10Choice#Code
	 * UnmatchedReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason10Choice#Proprietary
	 * UnmatchedReason10Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason7#Code
	 * UnmatchedReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason11Choice#Code
	 * UnmatchedReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason11Choice#Proprietary
	 * UnmatchedReason11Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason10#Code
	 * UnmatchedReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason4Choice#Code
	 * UnmatchedReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason4Choice#Proprietary
	 * UnmatchedReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#UnmatchedReason
	 * Reason2Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#UnmatchedReason
	 * Reason10Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason8Choice#Code
	 * UnmatchedReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason8Choice#Proprietary
	 * UnmatchedReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#UnmatchedReason
	 * Reason7Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason12Choice#Code
	 * UnmatchedReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason12Choice#Proprietary
	 * UnmatchedReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#UnmatchedReason
	 * Reason11Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#UnmatchedReason
	 * Reason12Choice.UnmatchedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason12#Code
	 * UnmatchedReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason15Choice#Code
	 * UnmatchedReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason15Choice#Proprietary
	 * UnmatchedReason15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason14Choice#Code
	 * UnmatchedReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason14Choice#Proprietary
	 * UnmatchedReason14Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason11#Code
	 * UnmatchedReason11.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason16Choice#Code
	 * UnmatchedReason16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason16Choice#Proprietary
	 * UnmatchedReason16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason17Choice#Code
	 * UnmatchedReason17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason17Choice#Proprietary
	 * UnmatchedReason17Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason13#Code
	 * UnmatchedReason13.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason14#Code
	 * UnmatchedReason14.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason18Choice#Code
	 * UnmatchedReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason18Choice#Proprietary
	 * UnmatchedReason18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#UnmatchedReason
	 * Reason13Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason20Choice#Code
	 * UnmatchedReason20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason20Choice#Proprietary
	 * UnmatchedReason20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason4Choice#Reason
	 * MatchingReason4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#UnmatchedReason
	 * Reason14Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#UnmatchedReason
	 * Reason15Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason24Choice#Code
	 * UnmatchedReason24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason24Choice#Proprietary
	 * UnmatchedReason24Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason16#Code
	 * UnmatchedReason16.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice#Code
	 * UnmatchedReason22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice#Proprietary
	 * UnmatchedReason22Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason17#Code
	 * UnmatchedReason17.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason15#Code
	 * UnmatchedReason15.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason23Choice#Code
	 * UnmatchedReason23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason23Choice#Proprietary
	 * UnmatchedReason23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#UnmatchedReason
	 * Reason16Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason21Choice#Code
	 * UnmatchedReason21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason21Choice#Proprietary
	 * UnmatchedReason21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#UnmatchedReason
	 * Reason17Choice.UnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason29Choice#Code
	 * UnmatchedReason29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason29Choice#Proprietary
	 * UnmatchedReason29Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason19#Code
	 * UnmatchedReason19.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason26Choice#Code
	 * UnmatchedReason26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason26Choice#Proprietary
	 * UnmatchedReason26Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason20#Code
	 * UnmatchedReason20.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason27Choice#Code
	 * UnmatchedReason27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason27Choice#Proprietary
	 * UnmatchedReason27Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason18#Code
	 * UnmatchedReason18.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason25Choice#Code
	 * UnmatchedReason25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason25Choice#Proprietary
	 * UnmatchedReason25Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the unmatched status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnmatchedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnmatchedReason1Choice.Code, com.tools20022.repository.choice.UnmatchedReason1Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason1.Code,
					com.tools20022.repository.choice.UnmatchedReason9Choice.Code, com.tools20022.repository.choice.UnmatchedReason9Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason6.Code,
					com.tools20022.repository.choice.UnmatchedReason13Choice.Code, com.tools20022.repository.choice.UnmatchedReason13Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason9.Code,
					com.tools20022.repository.choice.UnmatchedReason6Choice.Code, com.tools20022.repository.choice.UnmatchedReason6Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason4.Code,
					com.tools20022.repository.choice.UnmatchedReason7Choice.Code, com.tools20022.repository.choice.UnmatchedReason7Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason5.Code,
					com.tools20022.repository.msg.UnmatchedReason5.AdditionalReasonInformation, com.tools20022.repository.choice.MatchingReason1Choice.Reason, com.tools20022.repository.choice.UnmatchedReason3Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason3Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason2.Code, com.tools20022.repository.choice.UnmatchedReason2Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason2Choice.Proprietary, com.tools20022.repository.choice.Reason1Choice.UnmatchedReason, com.tools20022.repository.choice.Reason6Choice.UnmatchedReason,
					com.tools20022.repository.choice.UnmatchedReason5Choice.Code, com.tools20022.repository.choice.UnmatchedReason5Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason3.Code,
					com.tools20022.repository.choice.UnmatchedReason10Choice.Code, com.tools20022.repository.choice.UnmatchedReason10Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason7.Code,
					com.tools20022.repository.choice.UnmatchedReason11Choice.Code, com.tools20022.repository.choice.UnmatchedReason11Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason10.Code,
					com.tools20022.repository.choice.UnmatchedReason4Choice.Code, com.tools20022.repository.choice.UnmatchedReason4Choice.Proprietary, com.tools20022.repository.choice.Reason2Choice.UnmatchedReason,
					com.tools20022.repository.choice.Reason10Choice.UnmatchedReason, com.tools20022.repository.choice.UnmatchedReason8Choice.Code, com.tools20022.repository.choice.UnmatchedReason8Choice.Proprietary,
					com.tools20022.repository.choice.Reason7Choice.UnmatchedReason, com.tools20022.repository.choice.UnmatchedReason12Choice.Code, com.tools20022.repository.choice.UnmatchedReason12Choice.Proprietary,
					com.tools20022.repository.choice.Reason11Choice.UnmatchedReason, com.tools20022.repository.choice.Reason12Choice.UnmatchedReason, com.tools20022.repository.msg.UnmatchedReason12.Code,
					com.tools20022.repository.choice.UnmatchedReason15Choice.Code, com.tools20022.repository.choice.UnmatchedReason15Choice.Proprietary, com.tools20022.repository.choice.UnmatchedReason14Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason14Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason11.Code, com.tools20022.repository.choice.UnmatchedReason16Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason16Choice.Proprietary, com.tools20022.repository.choice.UnmatchedReason17Choice.Code, com.tools20022.repository.choice.UnmatchedReason17Choice.Proprietary,
					com.tools20022.repository.msg.UnmatchedReason13.Code, com.tools20022.repository.msg.UnmatchedReason14.Code, com.tools20022.repository.choice.UnmatchedReason18Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason18Choice.Proprietary, com.tools20022.repository.choice.Reason13Choice.UnmatchedReason, com.tools20022.repository.choice.UnmatchedReason20Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason20Choice.Proprietary, com.tools20022.repository.choice.MatchingReason4Choice.Reason, com.tools20022.repository.choice.Reason14Choice.UnmatchedReason,
					com.tools20022.repository.choice.Reason15Choice.UnmatchedReason, com.tools20022.repository.choice.UnmatchedReason24Choice.Code, com.tools20022.repository.choice.UnmatchedReason24Choice.Proprietary,
					com.tools20022.repository.msg.UnmatchedReason16.Code, com.tools20022.repository.choice.UnmatchedReason22Choice.Code, com.tools20022.repository.choice.UnmatchedReason22Choice.Proprietary,
					com.tools20022.repository.msg.UnmatchedReason17.Code, com.tools20022.repository.msg.UnmatchedReason15.Code, com.tools20022.repository.choice.UnmatchedReason23Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason23Choice.Proprietary, com.tools20022.repository.choice.Reason16Choice.UnmatchedReason, com.tools20022.repository.choice.UnmatchedReason21Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason21Choice.Proprietary, com.tools20022.repository.choice.Reason17Choice.UnmatchedReason, com.tools20022.repository.choice.UnmatchedReason29Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason29Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason19.Code, com.tools20022.repository.choice.UnmatchedReason26Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason26Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason20.Code, com.tools20022.repository.choice.UnmatchedReason27Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason27Choice.Proprietary, com.tools20022.repository.msg.UnmatchedReason18.Code, com.tools20022.repository.choice.UnmatchedReason25Choice.Code,
					com.tools20022.repository.choice.UnmatchedReason25Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnmatchedReason";
			definition = "Reason for the unmatched status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnmatchedReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the request was denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
	 * DeniedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason2Choice#Code
	 * DeniedReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason2Choice#Proprietary
	 * DeniedReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason2#Code
	 * DeniedReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus2Choice#Reason
	 * DeniedStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus6Choice#Reason
	 * DeniedStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#Denied
	 * ModificationProcessingStatus2Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#Denied
	 * ProcessingStatus2Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#Denied
	 * ProcessingStatus13Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#Denied
	 * ProcessingStatus20Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason6Choice#Code
	 * DeniedReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason6Choice#Proprietary
	 * DeniedReason6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason4#Code
	 * DeniedReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus9Choice#Reason
	 * DeniedStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#Denied
	 * ModificationProcessingStatus3Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#Denied
	 * ProcessingStatus26Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#Denied
	 * ProcessingStatus5Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus4Choice#Reason
	 * DeniedStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#Denied
	 * ProcessingStatus11Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#Denied
	 * ProcessingStatus14Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#Denied
	 * ProcessingStatus15Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#Denied
	 * ProcessingStatus18Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#Denied
	 * ProcessingStatus24Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason3Choice#Code
	 * DeniedReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason3Choice#Proprietary
	 * DeniedReason3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason1#Code
	 * DeniedReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus1Choice#Reason
	 * DeniedStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice#Denied
	 * RepoCallRequestStatus2Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason1Choice#Code
	 * DeniedReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason1Choice#Proprietary
	 * DeniedReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#DeniedReason
	 * Reason1Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#DeniedReason
	 * Reason6Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason5Choice#Code
	 * DeniedReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason5Choice#Proprietary
	 * DeniedReason5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason3#Code
	 * DeniedReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus3Choice#Reason
	 * DeniedStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice#Denied
	 * RepoCallRequestStatus4Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus5Choice#Reason
	 * DeniedStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice#Denied
	 * RepoCallRequestStatus5Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus8Choice#Reason
	 * DeniedStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice#Denied
	 * RepoCallRequestStatus6Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason4Choice#Code
	 * DeniedReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason4Choice#Proprietary
	 * DeniedReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#DeniedReason
	 * Reason2Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#DeniedReason
	 * Reason10Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#DeniedReason
	 * Reason7Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#DeniedReason
	 * Reason11Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#Denied
	 * ProcessingStatus9Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#Denied
	 * ProcessingStatus16Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#Denied
	 * ProcessingStatus32Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#Denied
	 * ProcessingStatus31Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#DeniedReason
	 * Reason12Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#DeniedReason
	 * Reason13Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#Denied
	 * ProcessingStatus44Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#Denied
	 * ModificationProcessingStatus4Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#Denied
	 * ProcessingStatus45Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#DeniedReason
	 * Reason14Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason8Choice#Code
	 * DeniedReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason8Choice#Proprietary
	 * DeniedReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus10Choice#Reason
	 * DeniedStatus10Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason5#Code
	 * DeniedReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason7Choice#Code
	 * DeniedReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason7Choice#Proprietary
	 * DeniedReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#Denied
	 * ModificationProcessingStatus6Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#Denied
	 * ProcessingStatus47Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#Denied
	 * ProcessingStatus46Choice.Denied}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason8#Code
	 * DeniedReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason11Choice#Code
	 * DeniedReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason11Choice#Proprietary
	 * DeniedReason11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus13Choice#Reason
	 * DeniedStatus13Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason6#Code
	 * DeniedReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason9Choice#Code
	 * DeniedReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason9Choice#Proprietary
	 * DeniedReason9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus11Choice#Reason
	 * DeniedStatus11Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#DeniedReason
	 * Reason15Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason12Choice#Code
	 * DeniedReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason12Choice#Proprietary
	 * DeniedReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus12Choice#Reason
	 * DeniedStatus12Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason7#Code
	 * DeniedReason7.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason9#Code
	 * DeniedReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason13Choice#Code
	 * DeniedReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason13Choice#Proprietary
	 * DeniedReason13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#Denied
	 * ModificationProcessingStatus5Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason10Choice#Code
	 * DeniedReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason10Choice#Proprietary
	 * DeniedReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus14Choice#Reason
	 * DeniedStatus14Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#Denied
	 * ProcessingStatus50Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#Denied
	 * ModificationProcessingStatus7Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#Denied
	 * ProcessingStatus54Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#Denied
	 * RepoCallRequestStatus7Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason16Choice#Code
	 * DeniedReason16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason16Choice#Proprietary
	 * DeniedReason16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#Code
	 * DeniedReason15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#Proprietary
	 * DeniedReason15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus17Choice#Reason
	 * DeniedStatus17Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason12#Code
	 * DeniedReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus16Choice#Reason
	 * DeniedStatus16Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason11#Code
	 * DeniedReason11.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus15Choice#Reason
	 * DeniedStatus15Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason17Choice#Code
	 * DeniedReason17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason17Choice#Proprietary
	 * DeniedReason17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#Denied
	 * ProcessingStatus53Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason14Choice#Code
	 * DeniedReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason14Choice#Proprietary
	 * DeniedReason14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#DeniedReason
	 * Reason16Choice.DeniedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason10#Code
	 * DeniedReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice#Denied
	 * RepoCallRequestStatus9Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#Denied
	 * ProcessingStatus65Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#Denied
	 * ProcessingStatus58Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#DeniedReason
	 * Reason17Choice.DeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason23Choice#Code
	 * DeniedReason23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason23Choice#Proprietary
	 * DeniedReason23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason21Choice#Code
	 * DeniedReason21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason21Choice#Proprietary
	 * DeniedReason21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason18Choice#Code
	 * DeniedReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason18Choice#Proprietary
	 * DeniedReason18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#Denied
	 * ModificationProcessingStatus8Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#Denied
	 * ProcessingStatus61Choice.Denied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus21Choice#Reason
	 * DeniedStatus21Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus18Choice#Reason
	 * DeniedStatus18Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason13#Code
	 * DeniedReason13.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason16#Code
	 * DeniedReason16.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus19Choice#Reason
	 * DeniedStatus19Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason17#Code
	 * DeniedReason17.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason24Choice#Code
	 * DeniedReason24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason24Choice#Proprietary
	 * DeniedReason24Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeniedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DeniedReason2Choice.Code, com.tools20022.repository.choice.DeniedReason2Choice.Proprietary, com.tools20022.repository.msg.DeniedReason2.Code,
					com.tools20022.repository.choice.DeniedStatus2Choice.Reason, com.tools20022.repository.choice.DeniedStatus6Choice.Reason, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus2Choice.Denied, com.tools20022.repository.choice.ProcessingStatus13Choice.Denied, com.tools20022.repository.choice.ProcessingStatus20Choice.Denied,
					com.tools20022.repository.choice.DeniedReason6Choice.Code, com.tools20022.repository.choice.DeniedReason6Choice.Proprietary, com.tools20022.repository.msg.DeniedReason4.Code,
					com.tools20022.repository.choice.DeniedStatus9Choice.Reason, com.tools20022.repository.choice.ModificationProcessingStatus3Choice.Denied, com.tools20022.repository.choice.ProcessingStatus26Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus5Choice.Denied, com.tools20022.repository.choice.DeniedStatus4Choice.Reason, com.tools20022.repository.choice.ProcessingStatus11Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus14Choice.Denied, com.tools20022.repository.choice.ProcessingStatus15Choice.Denied, com.tools20022.repository.choice.ProcessingStatus18Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus24Choice.Denied, com.tools20022.repository.choice.DeniedReason3Choice.Code, com.tools20022.repository.choice.DeniedReason3Choice.Proprietary,
					com.tools20022.repository.msg.DeniedReason1.Code, com.tools20022.repository.choice.DeniedStatus1Choice.Reason, com.tools20022.repository.choice.RepoCallRequestStatus2Choice.Denied,
					com.tools20022.repository.choice.DeniedReason1Choice.Code, com.tools20022.repository.choice.DeniedReason1Choice.Proprietary, com.tools20022.repository.choice.Reason1Choice.DeniedReason,
					com.tools20022.repository.choice.Reason6Choice.DeniedReason, com.tools20022.repository.choice.DeniedReason5Choice.Code, com.tools20022.repository.choice.DeniedReason5Choice.Proprietary,
					com.tools20022.repository.msg.DeniedReason3.Code, com.tools20022.repository.choice.DeniedStatus3Choice.Reason, com.tools20022.repository.choice.RepoCallRequestStatus4Choice.Denied,
					com.tools20022.repository.choice.DeniedStatus5Choice.Reason, com.tools20022.repository.choice.RepoCallRequestStatus5Choice.Denied, com.tools20022.repository.choice.DeniedStatus8Choice.Reason,
					com.tools20022.repository.choice.RepoCallRequestStatus6Choice.Denied, com.tools20022.repository.choice.DeniedReason4Choice.Code, com.tools20022.repository.choice.DeniedReason4Choice.Proprietary,
					com.tools20022.repository.choice.Reason2Choice.DeniedReason, com.tools20022.repository.choice.Reason10Choice.DeniedReason, com.tools20022.repository.choice.Reason7Choice.DeniedReason,
					com.tools20022.repository.choice.Reason11Choice.DeniedReason, com.tools20022.repository.choice.ProcessingStatus9Choice.Denied, com.tools20022.repository.choice.ProcessingStatus16Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus32Choice.Denied, com.tools20022.repository.choice.ProcessingStatus31Choice.Denied, com.tools20022.repository.choice.Reason12Choice.DeniedReason,
					com.tools20022.repository.choice.Reason13Choice.DeniedReason, com.tools20022.repository.choice.ProcessingStatus44Choice.Denied, com.tools20022.repository.choice.ModificationProcessingStatus4Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus45Choice.Denied, com.tools20022.repository.choice.Reason14Choice.DeniedReason, com.tools20022.repository.choice.DeniedReason8Choice.Code,
					com.tools20022.repository.choice.DeniedReason8Choice.Proprietary, com.tools20022.repository.choice.DeniedStatus10Choice.Reason, com.tools20022.repository.msg.DeniedReason5.Code,
					com.tools20022.repository.choice.DeniedReason7Choice.Code, com.tools20022.repository.choice.DeniedReason7Choice.Proprietary, com.tools20022.repository.choice.ModificationProcessingStatus6Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus47Choice.Denied, com.tools20022.repository.choice.ProcessingStatus46Choice.Denied, com.tools20022.repository.msg.DeniedReason8.Code,
					com.tools20022.repository.choice.DeniedReason11Choice.Code, com.tools20022.repository.choice.DeniedReason11Choice.Proprietary, com.tools20022.repository.choice.DeniedStatus13Choice.Reason,
					com.tools20022.repository.msg.DeniedReason6.Code, com.tools20022.repository.choice.DeniedReason9Choice.Code, com.tools20022.repository.choice.DeniedReason9Choice.Proprietary,
					com.tools20022.repository.choice.DeniedStatus11Choice.Reason, com.tools20022.repository.choice.Reason15Choice.DeniedReason, com.tools20022.repository.choice.DeniedReason12Choice.Code,
					com.tools20022.repository.choice.DeniedReason12Choice.Proprietary, com.tools20022.repository.choice.DeniedStatus12Choice.Reason, com.tools20022.repository.msg.DeniedReason7.Code,
					com.tools20022.repository.msg.DeniedReason9.Code, com.tools20022.repository.choice.DeniedReason13Choice.Code, com.tools20022.repository.choice.DeniedReason13Choice.Proprietary,
					com.tools20022.repository.choice.ModificationProcessingStatus5Choice.Denied, com.tools20022.repository.choice.DeniedReason10Choice.Code, com.tools20022.repository.choice.DeniedReason10Choice.Proprietary,
					com.tools20022.repository.choice.DeniedStatus14Choice.Reason, com.tools20022.repository.choice.ProcessingStatus50Choice.Denied, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.Denied,
					com.tools20022.repository.choice.ProcessingStatus54Choice.Denied, com.tools20022.repository.choice.RepoCallRequestStatus7Choice.Denied, com.tools20022.repository.choice.DeniedReason16Choice.Code,
					com.tools20022.repository.choice.DeniedReason16Choice.Proprietary, com.tools20022.repository.choice.DeniedReason15Choice.Code, com.tools20022.repository.choice.DeniedReason15Choice.Proprietary,
					com.tools20022.repository.choice.DeniedStatus17Choice.Reason, com.tools20022.repository.msg.DeniedReason12.Code, com.tools20022.repository.choice.DeniedStatus16Choice.Reason,
					com.tools20022.repository.msg.DeniedReason11.Code, com.tools20022.repository.choice.DeniedStatus15Choice.Reason, com.tools20022.repository.choice.DeniedReason17Choice.Code,
					com.tools20022.repository.choice.DeniedReason17Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus53Choice.Denied, com.tools20022.repository.choice.DeniedReason14Choice.Code,
					com.tools20022.repository.choice.DeniedReason14Choice.Proprietary, com.tools20022.repository.choice.Reason16Choice.DeniedReason, com.tools20022.repository.msg.DeniedReason10.Code,
					com.tools20022.repository.choice.RepoCallRequestStatus9Choice.Denied, com.tools20022.repository.choice.ProcessingStatus65Choice.Denied, com.tools20022.repository.choice.ProcessingStatus58Choice.Denied,
					com.tools20022.repository.choice.Reason17Choice.DeniedReason, com.tools20022.repository.choice.DeniedReason23Choice.Code, com.tools20022.repository.choice.DeniedReason23Choice.Proprietary,
					com.tools20022.repository.choice.DeniedReason21Choice.Code, com.tools20022.repository.choice.DeniedReason21Choice.Proprietary, com.tools20022.repository.choice.DeniedReason18Choice.Code,
					com.tools20022.repository.choice.DeniedReason18Choice.Proprietary, com.tools20022.repository.choice.ModificationProcessingStatus8Choice.Denied, com.tools20022.repository.choice.ProcessingStatus61Choice.Denied,
					com.tools20022.repository.choice.DeniedStatus21Choice.Reason, com.tools20022.repository.choice.DeniedStatus18Choice.Reason, com.tools20022.repository.msg.DeniedReason13.Code,
					com.tools20022.repository.msg.DeniedReason16.Code, com.tools20022.repository.choice.DeniedStatus19Choice.Reason, com.tools20022.repository.msg.DeniedReason17.Code,
					com.tools20022.repository.choice.DeniedReason24Choice.Code, com.tools20022.repository.choice.DeniedReason24Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeniedReasonCode.mmObject();
		}
	};
	/**
	 * Status for which a reason is provided. It is derived from the association
	 * between StatusReason and Status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#Reason
	 * SecuritiesTradeStatus.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status for which a reason is provided. It is derived from the association between StatusReason and Status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.Reason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the reason why the transaction was generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
	 * GeneratedReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons1Choice#Code
	 * GeneratedReasons1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons1Choice#Proprietary
	 * GeneratedReasons1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason1#Code
	 * GeneratedReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons2Choice#Code
	 * GeneratedReasons2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons2Choice#Proprietary
	 * GeneratedReasons2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason2#Code
	 * GeneratedReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus1Choice#Reason
	 * GeneratedStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#Generated
	 * InstructionProcessingStatus3Choice.Generated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus2Choice#Reason
	 * GeneratedStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#Generated
	 * InstructionProcessingStatus6Choice.Generated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#Generated
	 * InstructionProcessingStatus10Choice.Generated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#Generated
	 * InstructionProcessingStatus11Choice.Generated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#GeneratedReason
	 * Reason1Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#GeneratedReason
	 * Reason6Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#GeneratedReason
	 * Reason2Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#GeneratedReason
	 * Reason10Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#GeneratedReason
	 * Reason7Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#GeneratedReason
	 * Reason11Choice.GeneratedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason3#Code
	 * GeneratedReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#GeneratedReason
	 * Reason12Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons3Choice#Code
	 * GeneratedReasons3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons3Choice#Proprietary
	 * GeneratedReasons3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#Generated
	 * InstructionProcessingStatus14Choice.Generated}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason4#Code
	 * GeneratedReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons4Choice#Code
	 * GeneratedReasons4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons4Choice#Proprietary
	 * GeneratedReasons4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#Generated
	 * InstructionProcessingStatus17Choice.Generated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#GeneratedReason
	 * Reason13Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#GeneratedReason
	 * Reason14Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#GeneratedReason
	 * Reason15Choice.GeneratedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason5#Code
	 * GeneratedReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice#Code
	 * GeneratedReasons5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice#Proprietary
	 * GeneratedReasons5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#Generated
	 * InstructionProcessingStatus22Choice.Generated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#GeneratedReason
	 * Reason16Choice.GeneratedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason6#Code
	 * GeneratedReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#GeneratedReason
	 * Reason17Choice.GeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons6Choice#Code
	 * GeneratedReasons6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons6Choice#Proprietary
	 * GeneratedReasons6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#Generated
	 * InstructionProcessingStatus27Choice.Generated}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GeneratedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GeneratedReasons1Choice.Code, com.tools20022.repository.choice.GeneratedReasons1Choice.Proprietary, com.tools20022.repository.msg.GeneratedReason1.Code,
					com.tools20022.repository.choice.GeneratedReasons2Choice.Code, com.tools20022.repository.choice.GeneratedReasons2Choice.Proprietary, com.tools20022.repository.msg.GeneratedReason2.Code,
					com.tools20022.repository.choice.GeneratedStatus1Choice.Reason, com.tools20022.repository.choice.InstructionProcessingStatus3Choice.Generated, com.tools20022.repository.choice.GeneratedStatus2Choice.Reason,
					com.tools20022.repository.choice.InstructionProcessingStatus6Choice.Generated, com.tools20022.repository.choice.InstructionProcessingStatus10Choice.Generated,
					com.tools20022.repository.choice.InstructionProcessingStatus11Choice.Generated, com.tools20022.repository.choice.Reason1Choice.GeneratedReason, com.tools20022.repository.choice.Reason6Choice.GeneratedReason,
					com.tools20022.repository.choice.Reason2Choice.GeneratedReason, com.tools20022.repository.choice.Reason10Choice.GeneratedReason, com.tools20022.repository.choice.Reason7Choice.GeneratedReason,
					com.tools20022.repository.choice.Reason11Choice.GeneratedReason, com.tools20022.repository.msg.GeneratedReason3.Code, com.tools20022.repository.choice.Reason12Choice.GeneratedReason,
					com.tools20022.repository.choice.GeneratedReasons3Choice.Code, com.tools20022.repository.choice.GeneratedReasons3Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus14Choice.Generated,
					com.tools20022.repository.msg.GeneratedReason4.Code, com.tools20022.repository.choice.GeneratedReasons4Choice.Code, com.tools20022.repository.choice.GeneratedReasons4Choice.Proprietary,
					com.tools20022.repository.choice.InstructionProcessingStatus17Choice.Generated, com.tools20022.repository.choice.Reason13Choice.GeneratedReason, com.tools20022.repository.choice.Reason14Choice.GeneratedReason,
					com.tools20022.repository.choice.Reason15Choice.GeneratedReason, com.tools20022.repository.msg.GeneratedReason5.Code, com.tools20022.repository.choice.GeneratedReasons5Choice.Code,
					com.tools20022.repository.choice.GeneratedReasons5Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.Generated, com.tools20022.repository.choice.Reason16Choice.GeneratedReason,
					com.tools20022.repository.msg.GeneratedReason6.Code, com.tools20022.repository.choice.Reason17Choice.GeneratedReason, com.tools20022.repository.choice.GeneratedReasons6Choice.Code,
					com.tools20022.repository.choice.GeneratedReasons6Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus27Choice.Generated);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GeneratedReasonCode.mmObject();
		}
	};
	/**
	 * Reason why the instruction has an allegement status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementReasonCode
	 * AllegementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegmentReason1Choice#Code
	 * AllegmentReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegmentReason1Choice#Proprietary
	 * AllegmentReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason3Choice#Reason
	 * MatchingReason3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementReason1Choice#Code
	 * AllegementReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementReason1Choice#Proprietary
	 * AllegementReason1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the instruction has an allegement status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllegementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AllegmentReason1Choice.Code, com.tools20022.repository.choice.AllegmentReason1Choice.Proprietary,
					com.tools20022.repository.choice.MatchingReason3Choice.Reason, com.tools20022.repository.choice.AllegementReason1Choice.Code, com.tools20022.repository.choice.AllegementReason1Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllegementReason";
			definition = "Reason why the instruction has an allegement status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AllegementReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the settlement pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
	 * PendingSettlementStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatusReason1#Structured
	 * PendingSettlementStatusReason1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#Reason
	 * PendingSettlementStatusChoice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#Reason
	 * PendingSettlementStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#PendingSettlement
	 * TransferStatus1Choice.PendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#PendingSettlement
	 * TransferStatus2Choice.PendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#Reason
	 * PendingSettlementStatus3Choice.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the settlement pending status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingSettlementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PendingSettlementStatusReason1.Structured, com.tools20022.repository.choice.PendingSettlementStatusChoice.Reason,
					com.tools20022.repository.msg.PendingSettlementStatus2.Reason, com.tools20022.repository.choice.TransferStatus1Choice.PendingSettlement, com.tools20022.repository.choice.TransferStatus2Choice.PendingSettlement,
					com.tools20022.repository.choice.PendingSettlementStatus3Choice.Reason);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlementReason";
			definition = "Reason for the settlement pending status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
	 * RepoCallAcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason3Choice#Code
	 * AcknowledgementReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason3Choice#Proprietary
	 * AcknowledgementReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason2#Code
	 * AcknowledgementReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus2Choice#Reason
	 * AcknowledgedAcceptedStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice#AcknowledgedAccepted
	 * RepoCallRequestStatus2Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#RepoCallAcknowledgementReason
	 * Reason1Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#RepoCallAcknowledgementReason
	 * Reason6Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason7Choice#Code
	 * AcknowledgementReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason7Choice#Proprietary
	 * AcknowledgementReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason5#Code
	 * AcknowledgementReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus5Choice#Reason
	 * AcknowledgedAcceptedStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice#AcknowledgedAccepted
	 * RepoCallRequestStatus4Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice#AcknowledgedAccepted
	 * RepoCallRequestStatus5Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice#AcknowledgedAccepted
	 * RepoCallRequestStatus6Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#RepoCallAcknowledgementReason
	 * Reason2Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#RepoCallAcknowledgementReason
	 * Reason10Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#RepoCallAcknowledgementReason
	 * Reason7Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#RepoCallAcknowledgementReason
	 * Reason11Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#RepoCallAcknowledgementReason
	 * Reason12Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#RepoCallAcknowledgementReason
	 * Reason13Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#RepoCallAcknowledgementReason
	 * Reason14Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#RepoCallAcknowledgementReason
	 * Reason15Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#AcknowledgedAccepted
	 * RepoCallRequestStatus7Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason10#Code
	 * AcknowledgementReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice#Code
	 * AcknowledgementReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice#Proprietary
	 * AcknowledgementReason13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#RepoCallAcknowledgementReason
	 * Reason16Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice#AcknowledgedAccepted
	 * RepoCallRequestStatus9Choice.AcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason18Choice#Code
	 * AcknowledgementReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason18Choice#Proprietary
	 * AcknowledgementReason18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#RepoCallAcknowledgementReason
	 * Reason17Choice.RepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason15#Code
	 * AcknowledgementReason15.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallAcknowledgementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepoCallAcknowledgementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AcknowledgementReason3Choice.Code, com.tools20022.repository.choice.AcknowledgementReason3Choice.Proprietary,
					com.tools20022.repository.msg.AcknowledgementReason2.Code, com.tools20022.repository.choice.AcknowledgedAcceptedStatus2Choice.Reason, com.tools20022.repository.choice.RepoCallRequestStatus2Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.Reason1Choice.RepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason6Choice.RepoCallAcknowledgementReason,
					com.tools20022.repository.choice.AcknowledgementReason7Choice.Code, com.tools20022.repository.choice.AcknowledgementReason7Choice.Proprietary, com.tools20022.repository.msg.AcknowledgementReason5.Code,
					com.tools20022.repository.choice.AcknowledgedAcceptedStatus5Choice.Reason, com.tools20022.repository.choice.RepoCallRequestStatus4Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.RepoCallRequestStatus5Choice.AcknowledgedAccepted, com.tools20022.repository.choice.RepoCallRequestStatus6Choice.AcknowledgedAccepted,
					com.tools20022.repository.choice.Reason2Choice.RepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason10Choice.RepoCallAcknowledgementReason,
					com.tools20022.repository.choice.Reason7Choice.RepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason11Choice.RepoCallAcknowledgementReason,
					com.tools20022.repository.choice.Reason12Choice.RepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason13Choice.RepoCallAcknowledgementReason,
					com.tools20022.repository.choice.Reason14Choice.RepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason15Choice.RepoCallAcknowledgementReason,
					com.tools20022.repository.choice.RepoCallRequestStatus7Choice.AcknowledgedAccepted, com.tools20022.repository.msg.AcknowledgementReason10.Code, com.tools20022.repository.choice.AcknowledgementReason13Choice.Code,
					com.tools20022.repository.choice.AcknowledgementReason13Choice.Proprietary, com.tools20022.repository.choice.Reason16Choice.RepoCallAcknowledgementReason,
					com.tools20022.repository.choice.RepoCallRequestStatus9Choice.AcknowledgedAccepted, com.tools20022.repository.choice.AcknowledgementReason18Choice.Code,
					com.tools20022.repository.choice.AcknowledgementReason18Choice.Proprietary, com.tools20022.repository.choice.Reason17Choice.RepoCallAcknowledgementReason, com.tools20022.repository.msg.AcknowledgementReason15.Code);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information about the processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction/request has a repair status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
	 * RepairReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason1Choice#Code
	 * RepairReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason1Choice#Proprietary
	 * RepairReason1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason1#Code
	 * RepairReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus1Choice#Reason
	 * RepairStatus1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#Repair
	 * ProcessingStatus1Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus5Choice#Reason
	 * RepairStatus5Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#Repair
	 * ProcessingStatus19Choice.Repair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason6#Code
	 * RepairReason6.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus8Choice#Reason
	 * RepairStatus8Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#Repaired
	 * ModificationProcessingStatus2Choice.Repaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#Repair
	 * ProcessingStatus2Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#Repair
	 * ProcessingStatus13Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#Repair
	 * ProcessingStatus20Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason6Choice#Code
	 * RepairReason6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason6Choice#Proprietary
	 * RepairReason6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason2#Code
	 * RepairReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus10Choice#Reason
	 * RepairStatus10Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#Repair
	 * ProcessingStatus25Choice.Repair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason7#Code
	 * RepairReason7.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus9Choice#Reason
	 * RepairStatus9Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#Repaired
	 * ModificationProcessingStatus3Choice.Repaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#Repair
	 * ProcessingStatus26Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#Repair
	 * ProcessingStatus6Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus2Choice#Reason
	 * RepairStatus2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#Repair
	 * ProcessingStatus12Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#Repair
	 * ProcessingStatus23Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#Repair
	 * ProcessingStatus29Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#Repair
	 * ProcessingStatus7Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#Repair
	 * InstructionProcessingStatus3Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#Repair
	 * InstructionProcessingStatus6Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#Repair
	 * InstructionProcessingStatus10Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#Repair
	 * InstructionProcessingStatus11Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason9Choice#Code
	 * RepairReason9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason9Choice#Proprietary
	 * RepairReason9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason5#Code
	 * RepairReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice#Reason
	 * InstructionProcessingReason2Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#InRepair
	 * ProcessingStatus17Choice.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason2Choice#Code
	 * RepairReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason2Choice#Proprietary
	 * RepairReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason3#Code
	 * RepairReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus3Choice#Reason
	 * RepairStatus3Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#Repair
	 * ProcessingStatus3Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason3Choice#Code
	 * RepairReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason3Choice#Proprietary
	 * RepairReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#RepairReason
	 * Reason1Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason7Choice#Code
	 * RepairReason7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason7Choice#Proprietary
	 * RepairReason7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#RepairReason
	 * Reason6Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason5Choice#Code
	 * RepairReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason5Choice#Proprietary
	 * RepairReason5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason4#Code
	 * RepairReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus4Choice#Reason
	 * RepairStatus4Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#Repair
	 * ProcessingStatus10Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus6Choice#Reason
	 * RepairStatus6Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#Repair
	 * ProcessingStatus21Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus11Choice#Reason
	 * RepairStatus11Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#Repair
	 * ProcessingStatus27Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason4Choice#Code
	 * RepairReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason4Choice#Proprietary
	 * RepairReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#RepairReason
	 * Reason2Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason8Choice#Code
	 * RepairReason8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason8Choice#Proprietary
	 * RepairReason8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#RepairReason
	 * Reason10Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#RepairReason
	 * Reason7Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#RepairReason
	 * Reason11Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#Repair
	 * ProcessingStatus9Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#Repair
	 * ProcessingStatus16Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#Repair
	 * ProcessingStatus34Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#Repair
	 * ProcessingStatus32Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#Repair
	 * ProcessingStatus35Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#Repair
	 * ProcessingStatus31Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#RepairReason
	 * Reason12Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#Repair
	 * InstructionProcessingStatus14Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#Repair
	 * ProcessingStatus38Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#Repair
	 * ProcessingStatus37Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#Repair
	 * ProcessingStatus40Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#Repair
	 * ProcessingStatus42Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#Repair
	 * InstructionProcessingStatus17Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#RepairReason
	 * Reason13Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#Repaired
	 * ModificationProcessingStatus4Choice.Repaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#Repair
	 * ProcessingStatus45Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#RepairReason
	 * Reason14Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#Repaired
	 * ModificationProcessingStatus6Choice.Repaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#Repair
	 * ProcessingStatus47Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#RepairReason
	 * Reason15Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#Repaired
	 * ModificationProcessingStatus5Choice.Repaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#Repair
	 * ProcessingStatus48Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#Repaired
	 * ModificationProcessingStatus7Choice.Repaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#Repair
	 * ProcessingStatus54Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#Repair
	 * ProcessingStatus51Choice.Repair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason8#Code
	 * RepairReason8.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason10Choice#Code
	 * RepairReason10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason10Choice#Proprietary
	 * RepairReason10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice#Reason
	 * RepairStatus12Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#Repair
	 * ProcessingStatus52Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus13Choice#Reason
	 * RepairStatus13Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#Repair
	 * ProcessingStatus49Choice.Repair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason10#Code
	 * RepairReason10.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason12Choice#Code
	 * RepairReason12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason12Choice#Proprietary
	 * RepairReason12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#Repair
	 * InstructionProcessingStatus22Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason11Choice#Code
	 * RepairReason11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason11Choice#Proprietary
	 * RepairReason11Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason9#Code
	 * RepairReason9.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#Repair
	 * ProcessingStatus53Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus14Choice#Reason
	 * RepairStatus14Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#RepairReason
	 * Reason16Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#Repair
	 * ProcessingStatus57Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#Repair
	 * ProcessingStatus65Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#Repair
	 * ProcessingStatus63Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus15Choice#Reason
	 * RepairStatus15Choice.Reason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason11#Code
	 * RepairReason11.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#RepairReason
	 * Reason17Choice.RepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason18Choice#Code
	 * RepairReason18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason18Choice#Proprietary
	 * RepairReason18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#Repair
	 * ProcessingStatus62Choice.Repair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason12#Code
	 * RepairReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason14Choice#Code
	 * RepairReason14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason14Choice#Proprietary
	 * RepairReason14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#Repair
	 * InstructionProcessingStatus27Choice.Repair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason13#Code
	 * RepairReason13.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#Repaired
	 * ModificationProcessingStatus8Choice.Repaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus17Choice#Reason
	 * RepairStatus17Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#Repair
	 * ProcessingStatus61Choice.Repair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus16Choice#Reason
	 * RepairStatus16Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason13Choice#Code
	 * RepairReason13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason13Choice#Proprietary
	 * RepairReason13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#Repair
	 * ProcessingStatus60Choice.Repair}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepairReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RepairReason1Choice.Code, com.tools20022.repository.choice.RepairReason1Choice.Proprietary, com.tools20022.repository.msg.RepairReason1.Code,
					com.tools20022.repository.choice.RepairStatus1Choice.Reason, com.tools20022.repository.choice.ProcessingStatus1Choice.Repair, com.tools20022.repository.choice.RepairStatus5Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus19Choice.Repair, com.tools20022.repository.msg.RepairReason6.Code, com.tools20022.repository.choice.RepairStatus8Choice.Reason,
					com.tools20022.repository.choice.ModificationProcessingStatus2Choice.Repaired, com.tools20022.repository.choice.ProcessingStatus2Choice.Repair, com.tools20022.repository.choice.ProcessingStatus13Choice.Repair,
					com.tools20022.repository.choice.ProcessingStatus20Choice.Repair, com.tools20022.repository.choice.RepairReason6Choice.Code, com.tools20022.repository.choice.RepairReason6Choice.Proprietary,
					com.tools20022.repository.msg.RepairReason2.Code, com.tools20022.repository.choice.RepairStatus10Choice.Reason, com.tools20022.repository.choice.ProcessingStatus25Choice.Repair,
					com.tools20022.repository.msg.RepairReason7.Code, com.tools20022.repository.choice.RepairStatus9Choice.Reason, com.tools20022.repository.choice.ModificationProcessingStatus3Choice.Repaired,
					com.tools20022.repository.choice.ProcessingStatus26Choice.Repair, com.tools20022.repository.choice.ProcessingStatus6Choice.Repair, com.tools20022.repository.choice.RepairStatus2Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus12Choice.Repair, com.tools20022.repository.choice.ProcessingStatus23Choice.Repair, com.tools20022.repository.choice.ProcessingStatus29Choice.Repair,
					com.tools20022.repository.choice.ProcessingStatus7Choice.Repair, com.tools20022.repository.choice.InstructionProcessingStatus3Choice.Repair, com.tools20022.repository.choice.InstructionProcessingStatus6Choice.Repair,
					com.tools20022.repository.choice.InstructionProcessingStatus10Choice.Repair, com.tools20022.repository.choice.InstructionProcessingStatus11Choice.Repair, com.tools20022.repository.choice.RepairReason9Choice.Code,
					com.tools20022.repository.choice.RepairReason9Choice.Proprietary, com.tools20022.repository.msg.RepairReason5.Code, com.tools20022.repository.choice.InstructionProcessingReason2Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus17Choice.InRepair, com.tools20022.repository.choice.RepairReason2Choice.Code, com.tools20022.repository.choice.RepairReason2Choice.Proprietary,
					com.tools20022.repository.msg.RepairReason3.Code, com.tools20022.repository.choice.RepairStatus3Choice.Reason, com.tools20022.repository.choice.ProcessingStatus3Choice.Repair,
					com.tools20022.repository.choice.RepairReason3Choice.Code, com.tools20022.repository.choice.RepairReason3Choice.Proprietary, com.tools20022.repository.choice.Reason1Choice.RepairReason,
					com.tools20022.repository.choice.RepairReason7Choice.Code, com.tools20022.repository.choice.RepairReason7Choice.Proprietary, com.tools20022.repository.choice.Reason6Choice.RepairReason,
					com.tools20022.repository.choice.RepairReason5Choice.Code, com.tools20022.repository.choice.RepairReason5Choice.Proprietary, com.tools20022.repository.msg.RepairReason4.Code,
					com.tools20022.repository.choice.RepairStatus4Choice.Reason, com.tools20022.repository.choice.ProcessingStatus10Choice.Repair, com.tools20022.repository.choice.RepairStatus6Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus21Choice.Repair, com.tools20022.repository.choice.RepairStatus11Choice.Reason, com.tools20022.repository.choice.ProcessingStatus27Choice.Repair,
					com.tools20022.repository.choice.RepairReason4Choice.Code, com.tools20022.repository.choice.RepairReason4Choice.Proprietary, com.tools20022.repository.choice.Reason2Choice.RepairReason,
					com.tools20022.repository.choice.RepairReason8Choice.Code, com.tools20022.repository.choice.RepairReason8Choice.Proprietary, com.tools20022.repository.choice.Reason10Choice.RepairReason,
					com.tools20022.repository.choice.Reason7Choice.RepairReason, com.tools20022.repository.choice.Reason11Choice.RepairReason, com.tools20022.repository.choice.ProcessingStatus9Choice.Repair,
					com.tools20022.repository.choice.ProcessingStatus16Choice.Repair, com.tools20022.repository.choice.ProcessingStatus34Choice.Repair, com.tools20022.repository.choice.ProcessingStatus32Choice.Repair,
					com.tools20022.repository.choice.ProcessingStatus35Choice.Repair, com.tools20022.repository.choice.ProcessingStatus31Choice.Repair, com.tools20022.repository.choice.Reason12Choice.RepairReason,
					com.tools20022.repository.choice.InstructionProcessingStatus14Choice.Repair, com.tools20022.repository.choice.ProcessingStatus38Choice.Repair, com.tools20022.repository.choice.ProcessingStatus37Choice.Repair,
					com.tools20022.repository.choice.ProcessingStatus40Choice.Repair, com.tools20022.repository.choice.ProcessingStatus42Choice.Repair, com.tools20022.repository.choice.InstructionProcessingStatus17Choice.Repair,
					com.tools20022.repository.choice.Reason13Choice.RepairReason, com.tools20022.repository.choice.ModificationProcessingStatus4Choice.Repaired, com.tools20022.repository.choice.ProcessingStatus45Choice.Repair,
					com.tools20022.repository.choice.Reason14Choice.RepairReason, com.tools20022.repository.choice.ModificationProcessingStatus6Choice.Repaired, com.tools20022.repository.choice.ProcessingStatus47Choice.Repair,
					com.tools20022.repository.choice.Reason15Choice.RepairReason, com.tools20022.repository.choice.ModificationProcessingStatus5Choice.Repaired, com.tools20022.repository.choice.ProcessingStatus48Choice.Repair,
					com.tools20022.repository.choice.ModificationProcessingStatus7Choice.Repaired, com.tools20022.repository.choice.ProcessingStatus54Choice.Repair, com.tools20022.repository.choice.ProcessingStatus51Choice.Repair,
					com.tools20022.repository.msg.RepairReason8.Code, com.tools20022.repository.choice.RepairReason10Choice.Code, com.tools20022.repository.choice.RepairReason10Choice.Proprietary,
					com.tools20022.repository.choice.RepairStatus12Choice.Reason, com.tools20022.repository.choice.ProcessingStatus52Choice.Repair, com.tools20022.repository.choice.RepairStatus13Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus49Choice.Repair, com.tools20022.repository.msg.RepairReason10.Code, com.tools20022.repository.choice.RepairReason12Choice.Code,
					com.tools20022.repository.choice.RepairReason12Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.Repair, com.tools20022.repository.choice.RepairReason11Choice.Code,
					com.tools20022.repository.choice.RepairReason11Choice.Proprietary, com.tools20022.repository.msg.RepairReason9.Code, com.tools20022.repository.choice.ProcessingStatus53Choice.Repair,
					com.tools20022.repository.choice.RepairStatus14Choice.Reason, com.tools20022.repository.choice.Reason16Choice.RepairReason, com.tools20022.repository.choice.ProcessingStatus57Choice.Repair,
					com.tools20022.repository.choice.ProcessingStatus65Choice.Repair, com.tools20022.repository.choice.ProcessingStatus63Choice.Repair, com.tools20022.repository.choice.RepairStatus15Choice.Reason,
					com.tools20022.repository.msg.RepairReason11.Code, com.tools20022.repository.choice.Reason17Choice.RepairReason, com.tools20022.repository.choice.RepairReason18Choice.Code,
					com.tools20022.repository.choice.RepairReason18Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus62Choice.Repair, com.tools20022.repository.msg.RepairReason12.Code,
					com.tools20022.repository.choice.RepairReason14Choice.Code, com.tools20022.repository.choice.RepairReason14Choice.Proprietary, com.tools20022.repository.choice.InstructionProcessingStatus27Choice.Repair,
					com.tools20022.repository.msg.RepairReason13.Code, com.tools20022.repository.choice.ModificationProcessingStatus8Choice.Repaired, com.tools20022.repository.choice.RepairStatus17Choice.Reason,
					com.tools20022.repository.choice.ProcessingStatus61Choice.Repair, com.tools20022.repository.choice.RepairStatus16Choice.Reason, com.tools20022.repository.choice.RepairReason13Choice.Code,
					com.tools20022.repository.choice.RepairReason13Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus60Choice.Repair);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction/request has a repair status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RepairReasonV2Code.mmObject();
		}
	};
	/**
	 * Reason why the trade was returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReturnCode
	 * DeliveryReturnCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the trade was returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeliveryReturnReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Reason why the trade was returned.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeliveryReturnCode.mmObject();
		}
	};
	/**
	 * Specifies the counterparty action which is the reason of the trade
	 * status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
	 * CounterpartyResponseStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason2Choice#Code
	 * ConsentOrRejectionReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason2Choice#Proprietary
	 * ConsentOrRejectionReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason12#Code
	 * RejectionReason12.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason3Choice#Code
	 * ConsentOrRejectionReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason3Choice#Proprietary
	 * ConsentOrRejectionReason3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason13#Code
	 * RejectionReason13.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason29#Code
	 * RejectionReason29.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason4Choice#Code
	 * ConsentOrRejectionReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason4Choice#Proprietary
	 * ConsentOrRejectionReason4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason40#Code
	 * RejectionReason40.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason5Choice#Code
	 * ConsentOrRejectionReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason5Choice#Proprietary
	 * ConsentOrRejectionReason5Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty action which is the reason of the trade status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CounterpartyStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ConsentOrRejectionReason2Choice.Code, com.tools20022.repository.choice.ConsentOrRejectionReason2Choice.Proprietary,
					com.tools20022.repository.msg.RejectionReason12.Code, com.tools20022.repository.choice.ConsentOrRejectionReason3Choice.Code, com.tools20022.repository.choice.ConsentOrRejectionReason3Choice.Proprietary,
					com.tools20022.repository.msg.RejectionReason13.Code, com.tools20022.repository.msg.RejectionReason29.Code, com.tools20022.repository.choice.ConsentOrRejectionReason4Choice.Code,
					com.tools20022.repository.choice.ConsentOrRejectionReason4Choice.Proprietary, com.tools20022.repository.msg.RejectionReason40.Code, com.tools20022.repository.choice.ConsentOrRejectionReason5Choice.Code,
					com.tools20022.repository.choice.ConsentOrRejectionReason5Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyStatusReason";
			definition = "Specifies the counterparty action which is the reason of the trade status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the related instruction is modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModifiedStatusReasonCode
	 * ModifiedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason2Choice#Code
	 * ModificationReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason2Choice#Proprietary
	 * ModificationReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason2#Code
	 * ModificationReason2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#Modified
	 * ModificationProcessingStatus2Choice.Modified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason3Choice#Code
	 * ModificationReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason3Choice#Proprietary
	 * ModificationReason3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason3#Code
	 * ModificationReason3.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#Modified
	 * ModificationProcessingStatus3Choice.Modified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#Modified
	 * ModificationProcessingStatus4Choice.Modified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#Modified
	 * ModificationProcessingStatus6Choice.Modified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#Modified
	 * ModificationProcessingStatus5Choice.Modified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#Modified
	 * ModificationProcessingStatus7Choice.Modified}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason4#Code
	 * ModificationReason4.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason4Choice#Code
	 * ModificationReason4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason4Choice#Proprietary
	 * ModificationReason4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason5Choice#Code
	 * ModificationReason5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason5Choice#Proprietary
	 * ModificationReason5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason5#Code
	 * ModificationReason5.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#Modified
	 * ModificationProcessingStatus8Choice.Modified}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is modified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ModifiedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ModificationReason2Choice.Code, com.tools20022.repository.choice.ModificationReason2Choice.Proprietary,
					com.tools20022.repository.msg.ModificationReason2.Code, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.Modified, com.tools20022.repository.choice.ModificationReason3Choice.Code,
					com.tools20022.repository.choice.ModificationReason3Choice.Proprietary, com.tools20022.repository.msg.ModificationReason3.Code, com.tools20022.repository.choice.ModificationProcessingStatus3Choice.Modified,
					com.tools20022.repository.choice.ModificationProcessingStatus4Choice.Modified, com.tools20022.repository.choice.ModificationProcessingStatus6Choice.Modified,
					com.tools20022.repository.choice.ModificationProcessingStatus5Choice.Modified, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.Modified, com.tools20022.repository.msg.ModificationReason4.Code,
					com.tools20022.repository.choice.ModificationReason4Choice.Code, com.tools20022.repository.choice.ModificationReason4Choice.Proprietary, com.tools20022.repository.choice.ModificationReason5Choice.Code,
					com.tools20022.repository.choice.ModificationReason5Choice.Proprietary, com.tools20022.repository.msg.ModificationReason5.Code, com.tools20022.repository.choice.ModificationProcessingStatus8Choice.Modified);
			elementContext_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ModifiedStatusReason";
			definition = "Specifies the reason why the related instruction is modified.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ModifiedStatusReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatusReason";
				definition = "Specifies the underlying reason for a status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.Reason);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProcessingStatus1Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus1Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus1Choice.ModificationRequested, com.tools20022.repository.choice.ProcessingStatus19Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus19Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus19Choice.ModificationRequested,
						com.tools20022.repository.choice.UnmatchedStatus1Choice.Reason, com.tools20022.repository.choice.UnmatchedStatus5Choice.Reason, com.tools20022.repository.choice.PendingStatus3Choice.Reason,
						com.tools20022.repository.choice.ModificationStatus2Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason1.Code, com.tools20022.repository.choice.RejectionOrRepairStatus6Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus2Choice.Proprietary, com.tools20022.repository.msg.RejectionOrRepairReason9.Code, com.tools20022.repository.choice.RejectionOrRepairStatus10Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus13Choice.Proprietary, com.tools20022.repository.msg.RejectionOrRepairReason3.Code, com.tools20022.repository.choice.RejectionOrRepairStatus4Choice.Reason,
						com.tools20022.repository.msg.RejectionOrRepairReason10.Code, com.tools20022.repository.choice.RejectionOrRepairStatus11Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason18.Code,
						com.tools20022.repository.choice.RejectionOrRepairStatus25Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason13.Code, com.tools20022.repository.choice.RejectionOrRepairStatus14Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus20Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus25Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus25Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus25Choice.ModificationRequested,
						com.tools20022.repository.choice.UnmatchedStatus10Choice.Reason, com.tools20022.repository.choice.ModificationStatus3Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason19.Code,
						com.tools20022.repository.choice.RejectionOrRepairStatus24Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason16.Code, com.tools20022.repository.choice.RejectionOrRepairStatus20Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus26Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus5Choice.Completed, com.tools20022.repository.choice.ProcessingStatus5Choice.Proprietary,
						com.tools20022.repository.msg.RejectionOrRepairReason7.Code, com.tools20022.repository.choice.RejectionOrRepairStatus9Choice.Reason, com.tools20022.repository.choice.ProcessingStatus11Choice.Completed,
						com.tools20022.repository.choice.ProcessingStatus11Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus14Choice.Completed, com.tools20022.repository.choice.ProcessingStatus14Choice.Proprietary,
						com.tools20022.repository.msg.RejectionOrRepairReason11.Code, com.tools20022.repository.choice.RejectionOrRepairStatus12Choice.Reason, com.tools20022.repository.choice.ProcessingStatus15Choice.Completed,
						com.tools20022.repository.choice.ProcessingStatus15Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus18Choice.Completed, com.tools20022.repository.choice.ProcessingStatus18Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus24Choice.Completed, com.tools20022.repository.choice.ProcessingStatus24Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus6Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus6Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus12Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus12Choice.CancellationRequested, com.tools20022.repository.choice.UnmatchedStatus4Choice.Reason, com.tools20022.repository.choice.PendingStatus8Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus23Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus23Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus29Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus29Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus7Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus7Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus7Choice.ModificationRequested, com.tools20022.repository.choice.InstructionProcessingStatus3Choice.ModificationRequested,
						com.tools20022.repository.choice.InstructionProcessingStatus6Choice.ModificationRequested, com.tools20022.repository.choice.GeneratedStatus3Choice.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus10Choice.ModificationRequested, com.tools20022.repository.choice.GeneratedStatus4Choice.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus11Choice.ModificationRequested, com.tools20022.repository.msg.AffirmationReason1.Code, com.tools20022.repository.choice.PendingProcessing1Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus17Choice.AlreadyMatchedAndAffirmed, com.tools20022.repository.choice.ProcessingStatus17Choice.DefaultAction,
						com.tools20022.repository.choice.ProcessingStatus17Choice.Done, com.tools20022.repository.choice.ProcessingStatus17Choice.ForcedRejection,
						com.tools20022.repository.choice.ProcessingStatus17Choice.FullyExecutedConfirmationSent, com.tools20022.repository.choice.ProcessingStatus17Choice.Future,
						com.tools20022.repository.choice.ProcessingStatus17Choice.Generated, com.tools20022.repository.choice.ProcessingStatus17Choice.NoInstruction, com.tools20022.repository.choice.ProcessingStatus17Choice.OpenOrder,
						com.tools20022.repository.choice.ProcessingStatus17Choice.ReceivedAtIntermediary, com.tools20022.repository.choice.ProcessingStatus17Choice.SettlementInstructionSent,
						com.tools20022.repository.choice.ProcessingStatus17Choice.StandingInstruction, com.tools20022.repository.choice.ProcessingStatus17Choice.TradingSuspendedByStockExchange,
						com.tools20022.repository.choice.ProcessingStatus17Choice.Treated, com.tools20022.repository.choice.ProcessingStatus17Choice.ProprietaryStatus, com.tools20022.repository.msg.AllegmentMatchingReason1.Code,
						com.tools20022.repository.choice.CancellationReason11Choice.Reason, com.tools20022.repository.msg.IndividualOrderStatusAndReason1.ConditionallyAccepted,
						com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice.Reason, com.tools20022.repository.msg.TransferInstructionStatus2.Reason, com.tools20022.repository.msg.RejectionOrRepairReason4.Code,
						com.tools20022.repository.choice.RejectionOrRepairStatus2Choice.Reason, com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice.Rejected,
						com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice.Repair, com.tools20022.repository.choice.ProcessingStatus3Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus3Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus3Choice.ModificationRequested,
						com.tools20022.repository.choice.UnmatchedStatus2Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason2.Code, com.tools20022.repository.choice.RejectionOrRepairStatus5Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus4Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus10Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus10Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus10Choice.ModificationRequested,
						com.tools20022.repository.choice.UnmatchedStatus3Choice.Reason, com.tools20022.repository.choice.ProcessingStatus21Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus21Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus21Choice.ModificationRequested, com.tools20022.repository.choice.UnmatchedStatus6Choice.Reason, com.tools20022.repository.choice.ProcessingStatus27Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus27Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus27Choice.ModificationRequested,
						com.tools20022.repository.choice.UnmatchedStatus11Choice.Reason, com.tools20022.repository.choice.PendingStatus20Choice.Forwarded, com.tools20022.repository.choice.PendingStatus20Choice.UnderInvestigation,
						com.tools20022.repository.msg.RejectionOrRepairReason5.Code, com.tools20022.repository.choice.RejectionOrRepairStatus7Choice.Reason, com.tools20022.repository.choice.ProcessingStatus8Choice.Proprietary,
						com.tools20022.repository.choice.RejectionOrRepairStatus18Choice.Reason, com.tools20022.repository.choice.ProcessingStatus22Choice.Proprietary,
						com.tools20022.repository.choice.RejectionOrRepairStatus23Choice.Reason, com.tools20022.repository.choice.ProcessingStatus28Choice.Proprietary, com.tools20022.repository.msg.RejectionOrRepairReason6.Code,
						com.tools20022.repository.choice.RejectionOrRepairStatus8Choice.Reason, com.tools20022.repository.choice.ProcessingStatus9Choice.Proprietary, com.tools20022.repository.msg.RejectionOrRepairReason12.Code,
						com.tools20022.repository.choice.RejectionOrRepairStatus13Choice.Reason, com.tools20022.repository.choice.ProcessingStatus16Choice.Proprietary, com.tools20022.repository.msg.RejectionOrRepairReason8.Code,
						com.tools20022.repository.choice.RejectionOrRepairStatus3Choice.Reason, com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice.Rejected,
						com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice.Repair, com.tools20022.repository.msg.RejectionOrRepairReason14.Code, com.tools20022.repository.choice.RejectionOrRepairStatus15Choice.Reason,
						com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.Rejected, com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.Repair,
						com.tools20022.repository.msg.RejectionOrRepairReason17.Code, com.tools20022.repository.choice.RejectionOrRepairStatus21Choice.Reason, com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice.Rejected,
						com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice.Repair, com.tools20022.repository.msg.RejectionOrRepairReason20.Code, com.tools20022.repository.choice.RejectionOrRepairStatus26Choice.Reason,
						com.tools20022.repository.msg.RejectionOrRepairReason22.Code, com.tools20022.repository.choice.RejectionOrRepairStatus28Choice.Reason, com.tools20022.repository.choice.ProcessingStatus32Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus35Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus36Choice.Completed, com.tools20022.repository.choice.ProcessingStatus36Choice.Proprietary,
						com.tools20022.repository.msg.RejectionOrRepairReason21.Code, com.tools20022.repository.choice.RejectionOrRepairStatus27Choice.Reason, com.tools20022.repository.choice.ProcessingStatus31Choice.Completed,
						com.tools20022.repository.choice.ProcessingStatus31Choice.Proprietary, com.tools20022.repository.msg.TransferInstructionStatus3.Reason, com.tools20022.repository.choice.GeneratedStatus5Choice.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus14Choice.ModificationRequested, com.tools20022.repository.choice.ProcessingStatus38Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus38Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus38Choice.ModificationRequested,
						com.tools20022.repository.choice.ProcessingStatus37Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus37Choice.ModificationRequested,
						com.tools20022.repository.choice.UnmatchedStatus12Choice.Reason, com.tools20022.repository.choice.UnmatchedStatus13Choice.Reason, com.tools20022.repository.choice.AcceptedStatus4Choice.Reason,
						com.tools20022.repository.choice.ProcessingStatus40Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus40Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus40Choice.ModificationRequested, com.tools20022.repository.choice.ProcessingStatus42Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus42Choice.ModificationRequested, com.tools20022.repository.choice.UnmatchedStatus15Choice.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus17Choice.ModificationRequested, com.tools20022.repository.choice.GeneratedStatus6Choice.Reason,
						com.tools20022.repository.choice.UnmatchedStatus14Choice.Reason, com.tools20022.repository.choice.AcceptedStatus6Choice.Reason, com.tools20022.repository.msg.AllegementMatchingReason1.Code,
						com.tools20022.repository.msg.ReportItemStatus1.Exception, com.tools20022.repository.choice.ProcessingStatus44Choice.Completed, com.tools20022.repository.choice.ProcessingStatus44Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus45Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus47Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus46Choice.Completed,
						com.tools20022.repository.choice.ProcessingStatus46Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus55Choice.Proprietary,
						com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice.Rejected, com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice.Repair,
						com.tools20022.repository.choice.ProcessingStatus50Choice.Completed, com.tools20022.repository.choice.ProcessingStatus50Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus48Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus48Choice.ModificationRequested,
						com.tools20022.repository.choice.ProcessingStatus54Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus51Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus51Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus51Choice.ModificationRequested,
						com.tools20022.repository.choice.AcceptedStatus7Choice.Reason, com.tools20022.repository.choice.ProcessingStatus52Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus52Choice.CancellationRequested,
						com.tools20022.repository.choice.RejectionOrRepairStatus31Choice.Reason, com.tools20022.repository.choice.ModificationStatus4Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason25.Code,
						com.tools20022.repository.choice.UnmatchedStatus17Choice.Reason, com.tools20022.repository.choice.ProcessingStatus49Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus49Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus49Choice.ModificationRequested,
						com.tools20022.repository.choice.UnmatchedStatus16Choice.Reason, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.ModificationRequested,
						com.tools20022.repository.choice.RejectionOrRepairStatus29Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason23.Code, com.tools20022.repository.choice.ProcessingStatus53Choice.Proprietary,
						com.tools20022.repository.choice.GeneratedStatus7Choice.Reason, com.tools20022.repository.choice.RejectionOrRepairStatus32Choice.Reason, com.tools20022.repository.choice.UnmatchedStatus18Choice.Reason,
						com.tools20022.repository.msg.RejectionOrRepairReason26.Code, com.tools20022.repository.choice.RejectionOrRepairStatus30Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason24.Code,
						com.tools20022.repository.msg.TransferInstructionStatus4.Reason, com.tools20022.repository.choice.ProcessingStatus57Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus57Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus57Choice.ModificationRequested,
						com.tools20022.repository.choice.ProcessingStatus65Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus58Choice.Completed, com.tools20022.repository.choice.ProcessingStatus58Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus64Choice.Proprietary, com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice.Rejected,
						com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice.Repair, com.tools20022.repository.choice.ProcessingStatus63Choice.CancellationRequested,
						com.tools20022.repository.choice.ProcessingStatus63Choice.ModificationRequested, com.tools20022.repository.msg.RejectionOrRepairReason29.Code, com.tools20022.repository.choice.ProcessingStatus62Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus62Choice.CancellationRequested, com.tools20022.repository.choice.AcceptedStatus10Choice.Reason, com.tools20022.repository.choice.UnmatchedStatus19Choice.Reason,
						com.tools20022.repository.choice.GeneratedStatus8Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason31.Code, com.tools20022.repository.choice.ModificationStatus5Choice.Reason,
						com.tools20022.repository.choice.InstructionProcessingStatus27Choice.ModificationRequested, com.tools20022.repository.choice.RejectionOrRepairStatus34Choice.Reason,
						com.tools20022.repository.msg.RejectionOrRepairReason28.Code, com.tools20022.repository.choice.UnmatchedStatus21Choice.Reason, com.tools20022.repository.choice.ProcessingStatus61Choice.Proprietary,
						com.tools20022.repository.choice.RejectionOrRepairStatus35Choice.Reason, com.tools20022.repository.choice.RejectionOrRepairStatus33Choice.Reason, com.tools20022.repository.msg.RejectionOrRepairReason27.Code,
						com.tools20022.repository.choice.UnmatchedStatus20Choice.Reason, com.tools20022.repository.choice.RejectionOrRepairStatus37Choice.Reason, com.tools20022.repository.choice.ProcessingStatus60Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus60Choice.CancellationRequested, com.tools20022.repository.choice.ProcessingStatus60Choice.ModificationRequested);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatusReason.UnmatchedReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.DeniedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.SecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTradeStatusReason.GeneratedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.AllegementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.PendingSettlementReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.RepoCallAcknowledgementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.RepairReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.DeliveryReturnReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.CounterpartyStatusReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.ModifiedStatusReason);
				derivationComponent_lazy = () -> ListBuilderForSecuritiesTradeStatusReason_00.addElems(new ArrayList<>());
			}
		});
		return mmObject_lazy.get();
	}
}