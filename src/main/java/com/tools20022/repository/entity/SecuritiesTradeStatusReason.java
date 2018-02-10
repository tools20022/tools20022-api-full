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
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmAllegementReason
 * SecuritiesTradeStatusReason.mmAllegementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmPendingSettlementReason
 * SecuritiesTradeStatusReason.mmPendingSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepoCallAcknowledgementReason
 * SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
 * SecuritiesTradeStatusReason.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeliveryReturnReason
 * SecuritiesTradeStatusReason.mmDeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmCounterpartyStatusReason
 * SecuritiesTradeStatusReason.mmCounterpartyStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmModifiedStatusReason
 * SecuritiesTradeStatusReason.mmModifiedStatusReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
 * SecuritiesTradeStatus.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmProprietary
 * ProcessingStatus1Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmCancellationRequested
 * ProcessingStatus1Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmModificationRequested
 * ProcessingStatus1Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmProprietary
 * ProcessingStatus19Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmCancellationRequested
 * ProcessingStatus19Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmModificationRequested
 * ProcessingStatus19Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus1Choice#mmReason
 * UnmatchedStatus1Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus5Choice#mmReason
 * UnmatchedStatus5Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus3Choice#mmReason
 * PendingStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus2Choice#mmReason
 * ModificationStatus2Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason1#mmCode
 * RejectionOrRepairReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus6Choice#mmReason
 * RejectionOrRepairStatus6Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#mmProprietary
 * ProcessingStatus2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason9#mmCode
 * RejectionOrRepairReason9.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus10Choice#mmReason
 * RejectionOrRepairStatus10Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#mmProprietary
 * ProcessingStatus13Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason3#mmCode
 * RejectionOrRepairReason3.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus4Choice#mmReason
 * RejectionOrRepairStatus4Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason10#mmCode
 * RejectionOrRepairReason10.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus11Choice#mmReason
 * RejectionOrRepairStatus11Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason18#mmCode
 * RejectionOrRepairReason18.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus25Choice#mmReason
 * RejectionOrRepairStatus25Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason13#mmCode
 * RejectionOrRepairReason13.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus14Choice#mmReason
 * RejectionOrRepairStatus14Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#mmProprietary
 * ProcessingStatus20Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmProprietary
 * ProcessingStatus25Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmCancellationRequested
 * ProcessingStatus25Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmModificationRequested
 * ProcessingStatus25Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus10Choice#mmReason
 * UnmatchedStatus10Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus3Choice#mmReason
 * ModificationStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason19#mmCode
 * RejectionOrRepairReason19.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus24Choice#mmReason
 * RejectionOrRepairStatus24Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason16#mmCode
 * RejectionOrRepairReason16.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus20Choice#mmReason
 * RejectionOrRepairStatus20Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#mmProprietary
 * ProcessingStatus26Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#mmCompleted
 * ProcessingStatus5Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#mmProprietary
 * ProcessingStatus5Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason7#mmCode
 * RejectionOrRepairReason7.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus9Choice#mmReason
 * RejectionOrRepairStatus9Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#mmCompleted
 * ProcessingStatus11Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#mmProprietary
 * ProcessingStatus11Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#mmCompleted
 * ProcessingStatus14Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#mmProprietary
 * ProcessingStatus14Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason11#mmCode
 * RejectionOrRepairReason11.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus12Choice#mmReason
 * RejectionOrRepairStatus12Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#mmCompleted
 * ProcessingStatus15Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#mmProprietary
 * ProcessingStatus15Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#mmCompleted
 * ProcessingStatus18Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#mmProprietary
 * ProcessingStatus18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#mmCompleted
 * ProcessingStatus24Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#mmProprietary
 * ProcessingStatus24Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#mmProprietary
 * ProcessingStatus6Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#mmCancellationRequested
 * ProcessingStatus6Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#mmProprietary
 * ProcessingStatus12Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#mmCancellationRequested
 * ProcessingStatus12Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus4Choice#mmReason
 * UnmatchedStatus4Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus8Choice#mmReason
 * PendingStatus8Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#mmProprietary
 * ProcessingStatus23Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#mmCancellationRequested
 * ProcessingStatus23Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#mmProprietary
 * ProcessingStatus29Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#mmCancellationRequested
 * ProcessingStatus29Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmProprietary
 * ProcessingStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmCancellationRequested
 * ProcessingStatus7Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmModificationRequested
 * ProcessingStatus7Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmModificationRequested
 * InstructionProcessingStatus3Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmModificationRequested
 * InstructionProcessingStatus6Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus3Choice#mmReason
 * GeneratedStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmModificationRequested
 * InstructionProcessingStatus10Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus4Choice#mmReason
 * GeneratedStatus4Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmModificationRequested
 * InstructionProcessingStatus11Choice.mmModificationRequested}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AffirmationReason1#mmCode
 * AffirmationReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingProcessing1Choice#mmReason
 * PendingProcessing1Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmAlreadyMatchedAndAffirmed
 * ProcessingStatus17Choice.mmAlreadyMatchedAndAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmDefaultAction
 * ProcessingStatus17Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmDone
 * ProcessingStatus17Choice.mmDone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmForcedRejection
 * ProcessingStatus17Choice.mmForcedRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmFullyExecutedConfirmationSent
 * ProcessingStatus17Choice.mmFullyExecutedConfirmationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmFuture
 * ProcessingStatus17Choice.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmGenerated
 * ProcessingStatus17Choice.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmNoInstruction
 * ProcessingStatus17Choice.mmNoInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmOpenOrder
 * ProcessingStatus17Choice.mmOpenOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmReceivedAtIntermediary
 * ProcessingStatus17Choice.mmReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmSettlementInstructionSent
 * ProcessingStatus17Choice.mmSettlementInstructionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmStandingInstruction
 * ProcessingStatus17Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmTradingSuspendedByStockExchange
 * ProcessingStatus17Choice.mmTradingSuspendedByStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmTreated
 * ProcessingStatus17Choice.mmTreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmProprietaryStatus
 * ProcessingStatus17Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AllegmentMatchingReason1#mmCode
 * AllegmentMatchingReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationReason11Choice#mmReason
 * CancellationReason11Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmConditionallyAccepted
 * IndividualOrderStatusAndReason1.mmConditionallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice#mmReason
 * TransferCancellationCompleteStatusChoice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus2#mmReason
 * TransferInstructionStatus2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason4#mmCode
 * RejectionOrRepairReason4.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus2Choice#mmReason
 * RejectionOrRepairStatus2Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#mmRejected
 * IntraPositionProcessingStatus1Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice#mmRepair
 * IntraPositionProcessingStatus1Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmProprietary
 * ProcessingStatus3Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmCancellationRequested
 * ProcessingStatus3Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmModificationRequested
 * ProcessingStatus3Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus2Choice#mmReason
 * UnmatchedStatus2Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason2#mmCode
 * RejectionOrRepairReason2.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus5Choice#mmReason
 * RejectionOrRepairStatus5Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus4Choice#mmProprietary
 * ProcessingStatus4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmProprietary
 * ProcessingStatus10Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmCancellationRequested
 * ProcessingStatus10Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmModificationRequested
 * ProcessingStatus10Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus3Choice#mmReason
 * UnmatchedStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmProprietary
 * ProcessingStatus21Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmCancellationRequested
 * ProcessingStatus21Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmModificationRequested
 * ProcessingStatus21Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus6Choice#mmReason
 * UnmatchedStatus6Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmProprietary
 * ProcessingStatus27Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmCancellationRequested
 * ProcessingStatus27Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmModificationRequested
 * ProcessingStatus27Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus11Choice#mmReason
 * UnmatchedStatus11Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus20Choice#mmForwarded
 * PendingStatus20Choice.mmForwarded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingStatus20Choice#mmUnderInvestigation
 * PendingStatus20Choice.mmUnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason5#mmCode
 * RejectionOrRepairReason5.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus7Choice#mmReason
 * RejectionOrRepairStatus7Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus8Choice#mmProprietary
 * ProcessingStatus8Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus18Choice#mmReason
 * RejectionOrRepairStatus18Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus22Choice#mmProprietary
 * ProcessingStatus22Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus23Choice#mmReason
 * RejectionOrRepairStatus23Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus28Choice#mmProprietary
 * ProcessingStatus28Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason6#mmCode
 * RejectionOrRepairReason6.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus8Choice#mmReason
 * RejectionOrRepairStatus8Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#mmProprietary
 * ProcessingStatus9Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason12#mmCode
 * RejectionOrRepairReason12.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus13Choice#mmReason
 * RejectionOrRepairStatus13Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#mmProprietary
 * ProcessingStatus16Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason8#mmCode
 * RejectionOrRepairReason8.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus3Choice#mmReason
 * RejectionOrRepairStatus3Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#mmRejected
 * IntraPositionProcessingStatus2Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus2Choice#mmRepair
 * IntraPositionProcessingStatus2Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason14#mmCode
 * RejectionOrRepairReason14.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus15Choice#mmReason
 * RejectionOrRepairStatus15Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmRejected
 * IntraPositionProcessingStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmRepair
 * IntraPositionProcessingStatus3Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason17#mmCode
 * RejectionOrRepairReason17.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus21Choice#mmReason
 * RejectionOrRepairStatus21Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#mmRejected
 * IntraPositionProcessingStatus4Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus4Choice#mmRepair
 * IntraPositionProcessingStatus4Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason20#mmCode
 * RejectionOrRepairReason20.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus26Choice#mmReason
 * RejectionOrRepairStatus26Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason22#mmCode
 * RejectionOrRepairReason22.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus28Choice#mmReason
 * RejectionOrRepairStatus28Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#mmProprietary
 * ProcessingStatus32Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#mmProprietary
 * ProcessingStatus35Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmCompleted
 * ProcessingStatus36Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmProprietary
 * ProcessingStatus36Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason21#mmCode
 * RejectionOrRepairReason21.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus27Choice#mmReason
 * RejectionOrRepairStatus27Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#mmCompleted
 * ProcessingStatus31Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#mmProprietary
 * ProcessingStatus31Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus3#mmReason
 * TransferInstructionStatus3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus5Choice#mmReason
 * GeneratedStatus5Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmModificationRequested
 * InstructionProcessingStatus14Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmProprietary
 * ProcessingStatus38Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmCancellationRequested
 * ProcessingStatus38Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmModificationRequested
 * ProcessingStatus38Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmCancellationRequested
 * ProcessingStatus37Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmModificationRequested
 * ProcessingStatus37Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus12Choice#mmReason
 * UnmatchedStatus12Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus13Choice#mmReason
 * UnmatchedStatus13Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus4Choice#mmReason
 * AcceptedStatus4Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmProprietary
 * ProcessingStatus40Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmCancellationRequested
 * ProcessingStatus40Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmModificationRequested
 * ProcessingStatus40Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmCancellationRequested
 * ProcessingStatus42Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmModificationRequested
 * ProcessingStatus42Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus15Choice#mmReason
 * UnmatchedStatus15Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmModificationRequested
 * InstructionProcessingStatus17Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus6Choice#mmReason
 * GeneratedStatus6Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus14Choice#mmReason
 * UnmatchedStatus14Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus6Choice#mmReason
 * AcceptedStatus6Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AllegementMatchingReason1#mmCode
 * AllegementMatchingReason1.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportItemStatus1#mmException
 * ReportItemStatus1.mmException}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#mmCompleted
 * ProcessingStatus44Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#mmProprietary
 * ProcessingStatus44Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#mmProprietary
 * ProcessingStatus45Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#mmProprietary
 * ProcessingStatus47Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#mmCompleted
 * ProcessingStatus46Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#mmProprietary
 * ProcessingStatus46Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice#mmProprietary
 * ProcessingStatus55Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmRejected
 * IntraPositionProcessingStatus5Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmRepair
 * IntraPositionProcessingStatus5Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmCompleted
 * ProcessingStatus50Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmProprietary
 * ProcessingStatus50Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmCancellationRequested
 * ProcessingStatus48Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmModificationRequested
 * ProcessingStatus48Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmProprietary
 * ProcessingStatus54Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmProprietary
 * ProcessingStatus51Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmCancellationRequested
 * ProcessingStatus51Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmModificationRequested
 * ProcessingStatus51Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus7Choice#mmReason
 * AcceptedStatus7Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmProprietary
 * ProcessingStatus52Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmCancellationRequested
 * ProcessingStatus52Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus31Choice#mmReason
 * RejectionOrRepairStatus31Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus4Choice#mmReason
 * ModificationStatus4Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason25#mmCode
 * RejectionOrRepairReason25.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus17Choice#mmReason
 * UnmatchedStatus17Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmProprietary
 * ProcessingStatus49Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmCancellationRequested
 * ProcessingStatus49Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmModificationRequested
 * ProcessingStatus49Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus16Choice#mmReason
 * UnmatchedStatus16Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmModificationRequested
 * InstructionProcessingStatus22Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus29Choice#mmReason
 * RejectionOrRepairStatus29Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason23#mmCode
 * RejectionOrRepairReason23.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmProprietary
 * ProcessingStatus53Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice#mmReason
 * GeneratedStatus7Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus32Choice#mmReason
 * RejectionOrRepairStatus32Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus18Choice#mmReason
 * UnmatchedStatus18Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason26#mmCode
 * RejectionOrRepairReason26.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#mmReason
 * RejectionOrRepairStatus30Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24#mmCode
 * RejectionOrRepairReason24.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus4#mmReason
 * TransferInstructionStatus4.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmProprietary
 * ProcessingStatus57Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmCancellationRequested
 * ProcessingStatus57Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmModificationRequested
 * ProcessingStatus57Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#mmProprietary
 * ProcessingStatus65Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#mmCompleted
 * ProcessingStatus58Choice.mmCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#mmProprietary
 * ProcessingStatus58Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus64Choice#mmProprietary
 * ProcessingStatus64Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#mmRejected
 * IntraPositionProcessingStatus6Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus6Choice#mmRepair
 * IntraPositionProcessingStatus6Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmCancellationRequested
 * ProcessingStatus63Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmModificationRequested
 * ProcessingStatus63Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason29#mmCode
 * RejectionOrRepairReason29.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmProprietary
 * ProcessingStatus62Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmCancellationRequested
 * ProcessingStatus62Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcceptedStatus10Choice#mmReason
 * AcceptedStatus10Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus19Choice#mmReason
 * UnmatchedStatus19Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneratedStatus8Choice#mmReason
 * GeneratedStatus8Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason31#mmCode
 * RejectionOrRepairReason31.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationStatus5Choice#mmReason
 * ModificationStatus5Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmModificationRequested
 * InstructionProcessingStatus27Choice.mmModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus34Choice#mmReason
 * RejectionOrRepairStatus34Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason28#mmCode
 * RejectionOrRepairReason28.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus21Choice#mmReason
 * UnmatchedStatus21Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#mmProprietary
 * ProcessingStatus61Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus35Choice#mmReason
 * RejectionOrRepairStatus35Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus33Choice#mmReason
 * RejectionOrRepairStatus33Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason27#mmCode
 * RejectionOrRepairReason27.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnmatchedStatus20Choice#mmReason
 * UnmatchedStatus20Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus37Choice#mmReason
 * RejectionOrRepairStatus37Choice.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmProprietary
 * ProcessingStatus60Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmCancellationRequested
 * ProcessingStatus60Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmModificationRequested
 * ProcessingStatus60Choice.mmModificationRequested}</li>
 * </ul>
 * </li>
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
	protected UnmatchedReasonCode unmatchedReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason1Choice#mmCode
	 * UnmatchedReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason1Choice#mmProprietary
	 * UnmatchedReason1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason1#mmCode
	 * UnmatchedReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason9Choice#mmCode
	 * UnmatchedReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason9Choice#mmProprietary
	 * UnmatchedReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason6#mmCode
	 * UnmatchedReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason13Choice#mmCode
	 * UnmatchedReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason13Choice#mmProprietary
	 * UnmatchedReason13Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason9#mmCode
	 * UnmatchedReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason6Choice#mmCode
	 * UnmatchedReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason6Choice#mmProprietary
	 * UnmatchedReason6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason4#mmCode
	 * UnmatchedReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason7Choice#mmCode
	 * UnmatchedReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason7Choice#mmProprietary
	 * UnmatchedReason7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason5#mmCode
	 * UnmatchedReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnmatchedReason5#mmAdditionalReasonInformation
	 * UnmatchedReason5.mmAdditionalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason1Choice#mmReason
	 * MatchingReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason3Choice#mmCode
	 * UnmatchedReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason3Choice#mmProprietary
	 * UnmatchedReason3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason2#mmCode
	 * UnmatchedReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason2Choice#mmCode
	 * UnmatchedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason2Choice#mmProprietary
	 * UnmatchedReason2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmUnmatchedReason
	 * Reason1Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmUnmatchedReason
	 * Reason6Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason5Choice#mmCode
	 * UnmatchedReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason5Choice#mmProprietary
	 * UnmatchedReason5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason3#mmCode
	 * UnmatchedReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason10Choice#mmCode
	 * UnmatchedReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason10Choice#mmProprietary
	 * UnmatchedReason10Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason7#mmCode
	 * UnmatchedReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason11Choice#mmCode
	 * UnmatchedReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason11Choice#mmProprietary
	 * UnmatchedReason11Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason10#mmCode
	 * UnmatchedReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason4Choice#mmCode
	 * UnmatchedReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason4Choice#mmProprietary
	 * UnmatchedReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmUnmatchedReason
	 * Reason2Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmUnmatchedReason
	 * Reason10Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason8Choice#mmCode
	 * UnmatchedReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason8Choice#mmProprietary
	 * UnmatchedReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmUnmatchedReason
	 * Reason7Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason12Choice#mmCode
	 * UnmatchedReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason12Choice#mmProprietary
	 * UnmatchedReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmUnmatchedReason
	 * Reason11Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmUnmatchedReason
	 * Reason12Choice.mmUnmatchedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason12#mmCode
	 * UnmatchedReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason15Choice#mmCode
	 * UnmatchedReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason15Choice#mmProprietary
	 * UnmatchedReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason14Choice#mmCode
	 * UnmatchedReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason14Choice#mmProprietary
	 * UnmatchedReason14Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason11#mmCode
	 * UnmatchedReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason16Choice#mmCode
	 * UnmatchedReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason16Choice#mmProprietary
	 * UnmatchedReason16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason17Choice#mmCode
	 * UnmatchedReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason17Choice#mmProprietary
	 * UnmatchedReason17Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason13#mmCode
	 * UnmatchedReason13.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason14#mmCode
	 * UnmatchedReason14.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason18Choice#mmCode
	 * UnmatchedReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason18Choice#mmProprietary
	 * UnmatchedReason18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmUnmatchedReason
	 * Reason13Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason20Choice#mmCode
	 * UnmatchedReason20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason20Choice#mmProprietary
	 * UnmatchedReason20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason4Choice#mmReason
	 * MatchingReason4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmUnmatchedReason
	 * Reason14Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmUnmatchedReason
	 * Reason15Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason24Choice#mmCode
	 * UnmatchedReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason24Choice#mmProprietary
	 * UnmatchedReason24Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason16#mmCode
	 * UnmatchedReason16.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice#mmCode
	 * UnmatchedReason22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice#mmProprietary
	 * UnmatchedReason22Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason17#mmCode
	 * UnmatchedReason17.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason15#mmCode
	 * UnmatchedReason15.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason23Choice#mmCode
	 * UnmatchedReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason23Choice#mmProprietary
	 * UnmatchedReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmUnmatchedReason
	 * Reason16Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason21Choice#mmCode
	 * UnmatchedReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason21Choice#mmProprietary
	 * UnmatchedReason21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmUnmatchedReason
	 * Reason17Choice.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason29Choice#mmCode
	 * UnmatchedReason29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason29Choice#mmProprietary
	 * UnmatchedReason29Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason19#mmCode
	 * UnmatchedReason19.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason26Choice#mmCode
	 * UnmatchedReason26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason26Choice#mmProprietary
	 * UnmatchedReason26Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason20#mmCode
	 * UnmatchedReason20.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason27Choice#mmCode
	 * UnmatchedReason27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason27Choice#mmProprietary
	 * UnmatchedReason27Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnmatchedReason18#mmCode
	 * UnmatchedReason18.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason25Choice#mmCode
	 * UnmatchedReason25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason25Choice#mmProprietary
	 * UnmatchedReason25Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmUnmatchedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnmatchedReason1Choice.mmCode, UnmatchedReason1Choice.mmProprietary, UnmatchedReason1.mmCode, UnmatchedReason9Choice.mmCode, UnmatchedReason9Choice.mmProprietary, UnmatchedReason6.mmCode,
					UnmatchedReason13Choice.mmCode, UnmatchedReason13Choice.mmProprietary, UnmatchedReason9.mmCode, UnmatchedReason6Choice.mmCode, UnmatchedReason6Choice.mmProprietary, UnmatchedReason4.mmCode,
					UnmatchedReason7Choice.mmCode, UnmatchedReason7Choice.mmProprietary, UnmatchedReason5.mmCode, UnmatchedReason5.mmAdditionalReasonInformation, MatchingReason1Choice.mmReason, UnmatchedReason3Choice.mmCode,
					UnmatchedReason3Choice.mmProprietary, UnmatchedReason2.mmCode, UnmatchedReason2Choice.mmCode, UnmatchedReason2Choice.mmProprietary, Reason1Choice.mmUnmatchedReason, Reason6Choice.mmUnmatchedReason,
					UnmatchedReason5Choice.mmCode, UnmatchedReason5Choice.mmProprietary, UnmatchedReason3.mmCode, UnmatchedReason10Choice.mmCode, UnmatchedReason10Choice.mmProprietary, UnmatchedReason7.mmCode,
					UnmatchedReason11Choice.mmCode, UnmatchedReason11Choice.mmProprietary, UnmatchedReason10.mmCode, UnmatchedReason4Choice.mmCode, UnmatchedReason4Choice.mmProprietary, Reason2Choice.mmUnmatchedReason,
					Reason10Choice.mmUnmatchedReason, UnmatchedReason8Choice.mmCode, UnmatchedReason8Choice.mmProprietary, Reason7Choice.mmUnmatchedReason, UnmatchedReason12Choice.mmCode, UnmatchedReason12Choice.mmProprietary,
					Reason11Choice.mmUnmatchedReason, Reason12Choice.mmUnmatchedReason, UnmatchedReason12.mmCode, UnmatchedReason15Choice.mmCode, UnmatchedReason15Choice.mmProprietary, UnmatchedReason14Choice.mmCode,
					UnmatchedReason14Choice.mmProprietary, UnmatchedReason11.mmCode, UnmatchedReason16Choice.mmCode, UnmatchedReason16Choice.mmProprietary, UnmatchedReason17Choice.mmCode, UnmatchedReason17Choice.mmProprietary,
					UnmatchedReason13.mmCode, UnmatchedReason14.mmCode, UnmatchedReason18Choice.mmCode, UnmatchedReason18Choice.mmProprietary, Reason13Choice.mmUnmatchedReason, UnmatchedReason20Choice.mmCode,
					UnmatchedReason20Choice.mmProprietary, MatchingReason4Choice.mmReason, Reason14Choice.mmUnmatchedReason, Reason15Choice.mmUnmatchedReason, UnmatchedReason24Choice.mmCode, UnmatchedReason24Choice.mmProprietary,
					UnmatchedReason16.mmCode, UnmatchedReason22Choice.mmCode, UnmatchedReason22Choice.mmProprietary, UnmatchedReason17.mmCode, UnmatchedReason15.mmCode, UnmatchedReason23Choice.mmCode, UnmatchedReason23Choice.mmProprietary,
					Reason16Choice.mmUnmatchedReason, UnmatchedReason21Choice.mmCode, UnmatchedReason21Choice.mmProprietary, Reason17Choice.mmUnmatchedReason, UnmatchedReason29Choice.mmCode, UnmatchedReason29Choice.mmProprietary,
					UnmatchedReason19.mmCode, UnmatchedReason26Choice.mmCode, UnmatchedReason26Choice.mmProprietary, UnmatchedReason20.mmCode, UnmatchedReason27Choice.mmCode, UnmatchedReason27Choice.mmProprietary, UnmatchedReason18.mmCode,
					UnmatchedReason25Choice.mmCode, UnmatchedReason25Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnmatchedReason";
			definition = "Reason for the unmatched status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getUnmatchedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeniedReasonCode deniedReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.DeniedReason2Choice#mmCode
	 * DeniedReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason2Choice#mmProprietary
	 * DeniedReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason2#mmCode
	 * DeniedReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus2Choice#mmReason
	 * DeniedStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus6Choice#mmReason
	 * DeniedStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmDenied
	 * ModificationProcessingStatus2Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#mmDenied
	 * ProcessingStatus2Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#mmDenied
	 * ProcessingStatus13Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#mmDenied
	 * ProcessingStatus20Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason6Choice#mmCode
	 * DeniedReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason6Choice#mmProprietary
	 * DeniedReason6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason4#mmCode
	 * DeniedReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus9Choice#mmReason
	 * DeniedStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmDenied
	 * ModificationProcessingStatus3Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#mmDenied
	 * ProcessingStatus26Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus5Choice#mmDenied
	 * ProcessingStatus5Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus4Choice#mmReason
	 * DeniedStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus11Choice#mmDenied
	 * ProcessingStatus11Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus14Choice#mmDenied
	 * ProcessingStatus14Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus15Choice#mmDenied
	 * ProcessingStatus15Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus18Choice#mmDenied
	 * ProcessingStatus18Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus24Choice#mmDenied
	 * ProcessingStatus24Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason3Choice#mmCode
	 * DeniedReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason3Choice#mmProprietary
	 * DeniedReason3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason1#mmCode
	 * DeniedReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus1Choice#mmReason
	 * DeniedStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice#mmDenied
	 * RepoCallRequestStatus2Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason1Choice#mmCode
	 * DeniedReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason1Choice#mmProprietary
	 * DeniedReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmDeniedReason
	 * Reason1Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmDeniedReason
	 * Reason6Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason5Choice#mmCode
	 * DeniedReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason5Choice#mmProprietary
	 * DeniedReason5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason3#mmCode
	 * DeniedReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus3Choice#mmReason
	 * DeniedStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice#mmDenied
	 * RepoCallRequestStatus4Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus5Choice#mmReason
	 * DeniedStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice#mmDenied
	 * RepoCallRequestStatus5Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus8Choice#mmReason
	 * DeniedStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice#mmDenied
	 * RepoCallRequestStatus6Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason4Choice#mmCode
	 * DeniedReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason4Choice#mmProprietary
	 * DeniedReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmDeniedReason
	 * Reason2Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmDeniedReason
	 * Reason10Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmDeniedReason
	 * Reason7Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmDeniedReason
	 * Reason11Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#mmDenied
	 * ProcessingStatus9Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#mmDenied
	 * ProcessingStatus16Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#mmDenied
	 * ProcessingStatus32Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#mmDenied
	 * ProcessingStatus31Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmDeniedReason
	 * Reason12Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmDeniedReason
	 * Reason13Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus44Choice#mmDenied
	 * ProcessingStatus44Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmDenied
	 * ModificationProcessingStatus4Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#mmDenied
	 * ProcessingStatus45Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmDeniedReason
	 * Reason14Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason8Choice#mmCode
	 * DeniedReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason8Choice#mmProprietary
	 * DeniedReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus10Choice#mmReason
	 * DeniedStatus10Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason5#mmCode
	 * DeniedReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason7Choice#mmCode
	 * DeniedReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason7Choice#mmProprietary
	 * DeniedReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmDenied
	 * ModificationProcessingStatus6Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#mmDenied
	 * ProcessingStatus47Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus46Choice#mmDenied
	 * ProcessingStatus46Choice.mmDenied}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason8#mmCode
	 * DeniedReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason11Choice#mmCode
	 * DeniedReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason11Choice#mmProprietary
	 * DeniedReason11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus13Choice#mmReason
	 * DeniedStatus13Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason6#mmCode
	 * DeniedReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason9Choice#mmCode
	 * DeniedReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason9Choice#mmProprietary
	 * DeniedReason9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus11Choice#mmReason
	 * DeniedStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmDeniedReason
	 * Reason15Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason12Choice#mmCode
	 * DeniedReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason12Choice#mmProprietary
	 * DeniedReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus12Choice#mmReason
	 * DeniedStatus12Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason7#mmCode
	 * DeniedReason7.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason9#mmCode
	 * DeniedReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason13Choice#mmCode
	 * DeniedReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason13Choice#mmProprietary
	 * DeniedReason13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmDenied
	 * ModificationProcessingStatus5Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason10Choice#mmCode
	 * DeniedReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason10Choice#mmProprietary
	 * DeniedReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus14Choice#mmReason
	 * DeniedStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus50Choice#mmDenied
	 * ProcessingStatus50Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmDenied
	 * ModificationProcessingStatus7Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmDenied
	 * ProcessingStatus54Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#mmDenied
	 * RepoCallRequestStatus7Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason16Choice#mmCode
	 * DeniedReason16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason16Choice#mmProprietary
	 * DeniedReason16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#mmCode
	 * DeniedReason15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason15Choice#mmProprietary
	 * DeniedReason15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus17Choice#mmReason
	 * DeniedStatus17Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason12#mmCode
	 * DeniedReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus16Choice#mmReason
	 * DeniedStatus16Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason11#mmCode
	 * DeniedReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus15Choice#mmReason
	 * DeniedStatus15Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason17Choice#mmCode
	 * DeniedReason17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason17Choice#mmProprietary
	 * DeniedReason17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmDenied
	 * ProcessingStatus53Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason14Choice#mmCode
	 * DeniedReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason14Choice#mmProprietary
	 * DeniedReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmDeniedReason
	 * Reason16Choice.mmDeniedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason10#mmCode
	 * DeniedReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice#mmDenied
	 * RepoCallRequestStatus9Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#mmDenied
	 * ProcessingStatus65Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice#mmDenied
	 * ProcessingStatus58Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmDeniedReason
	 * Reason17Choice.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason23Choice#mmCode
	 * DeniedReason23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason23Choice#mmProprietary
	 * DeniedReason23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason21Choice#mmCode
	 * DeniedReason21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason21Choice#mmProprietary
	 * DeniedReason21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason18Choice#mmCode
	 * DeniedReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason18Choice#mmProprietary
	 * DeniedReason18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmDenied
	 * ModificationProcessingStatus8Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#mmDenied
	 * ProcessingStatus61Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus21Choice#mmReason
	 * DeniedStatus21Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus18Choice#mmReason
	 * DeniedStatus18Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason13#mmCode
	 * DeniedReason13.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason16#mmCode
	 * DeniedReason16.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus19Choice#mmReason
	 * DeniedStatus19Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DeniedReason17#mmCode
	 * DeniedReason17.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason24Choice#mmCode
	 * DeniedReason24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeniedReason24Choice#mmProprietary
	 * DeniedReason24Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmDeniedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeniedReason2Choice.mmCode, DeniedReason2Choice.mmProprietary, DeniedReason2.mmCode, DeniedStatus2Choice.mmReason, DeniedStatus6Choice.mmReason,
					ModificationProcessingStatus2Choice.mmDenied, ProcessingStatus2Choice.mmDenied, ProcessingStatus13Choice.mmDenied, ProcessingStatus20Choice.mmDenied, DeniedReason6Choice.mmCode, DeniedReason6Choice.mmProprietary,
					DeniedReason4.mmCode, DeniedStatus9Choice.mmReason, ModificationProcessingStatus3Choice.mmDenied, ProcessingStatus26Choice.mmDenied, ProcessingStatus5Choice.mmDenied, DeniedStatus4Choice.mmReason,
					ProcessingStatus11Choice.mmDenied, ProcessingStatus14Choice.mmDenied, ProcessingStatus15Choice.mmDenied, ProcessingStatus18Choice.mmDenied, ProcessingStatus24Choice.mmDenied, DeniedReason3Choice.mmCode,
					DeniedReason3Choice.mmProprietary, DeniedReason1.mmCode, DeniedStatus1Choice.mmReason, RepoCallRequestStatus2Choice.mmDenied, DeniedReason1Choice.mmCode, DeniedReason1Choice.mmProprietary, Reason1Choice.mmDeniedReason,
					Reason6Choice.mmDeniedReason, DeniedReason5Choice.mmCode, DeniedReason5Choice.mmProprietary, DeniedReason3.mmCode, DeniedStatus3Choice.mmReason, RepoCallRequestStatus4Choice.mmDenied, DeniedStatus5Choice.mmReason,
					RepoCallRequestStatus5Choice.mmDenied, DeniedStatus8Choice.mmReason, RepoCallRequestStatus6Choice.mmDenied, DeniedReason4Choice.mmCode, DeniedReason4Choice.mmProprietary, Reason2Choice.mmDeniedReason,
					Reason10Choice.mmDeniedReason, Reason7Choice.mmDeniedReason, Reason11Choice.mmDeniedReason, ProcessingStatus9Choice.mmDenied, ProcessingStatus16Choice.mmDenied, ProcessingStatus32Choice.mmDenied,
					ProcessingStatus31Choice.mmDenied, Reason12Choice.mmDeniedReason, Reason13Choice.mmDeniedReason, ProcessingStatus44Choice.mmDenied, ModificationProcessingStatus4Choice.mmDenied, ProcessingStatus45Choice.mmDenied,
					Reason14Choice.mmDeniedReason, DeniedReason8Choice.mmCode, DeniedReason8Choice.mmProprietary, DeniedStatus10Choice.mmReason, DeniedReason5.mmCode, DeniedReason7Choice.mmCode, DeniedReason7Choice.mmProprietary,
					ModificationProcessingStatus6Choice.mmDenied, ProcessingStatus47Choice.mmDenied, ProcessingStatus46Choice.mmDenied, DeniedReason8.mmCode, DeniedReason11Choice.mmCode, DeniedReason11Choice.mmProprietary,
					DeniedStatus13Choice.mmReason, DeniedReason6.mmCode, DeniedReason9Choice.mmCode, DeniedReason9Choice.mmProprietary, DeniedStatus11Choice.mmReason, Reason15Choice.mmDeniedReason, DeniedReason12Choice.mmCode,
					DeniedReason12Choice.mmProprietary, DeniedStatus12Choice.mmReason, DeniedReason7.mmCode, DeniedReason9.mmCode, DeniedReason13Choice.mmCode, DeniedReason13Choice.mmProprietary,
					ModificationProcessingStatus5Choice.mmDenied, DeniedReason10Choice.mmCode, DeniedReason10Choice.mmProprietary, DeniedStatus14Choice.mmReason, ProcessingStatus50Choice.mmDenied,
					ModificationProcessingStatus7Choice.mmDenied, ProcessingStatus54Choice.mmDenied, RepoCallRequestStatus7Choice.mmDenied, DeniedReason16Choice.mmCode, DeniedReason16Choice.mmProprietary, DeniedReason15Choice.mmCode,
					DeniedReason15Choice.mmProprietary, DeniedStatus17Choice.mmReason, DeniedReason12.mmCode, DeniedStatus16Choice.mmReason, DeniedReason11.mmCode, DeniedStatus15Choice.mmReason, DeniedReason17Choice.mmCode,
					DeniedReason17Choice.mmProprietary, ProcessingStatus53Choice.mmDenied, DeniedReason14Choice.mmCode, DeniedReason14Choice.mmProprietary, Reason16Choice.mmDeniedReason, DeniedReason10.mmCode,
					RepoCallRequestStatus9Choice.mmDenied, ProcessingStatus65Choice.mmDenied, ProcessingStatus58Choice.mmDenied, Reason17Choice.mmDeniedReason, DeniedReason23Choice.mmCode, DeniedReason23Choice.mmProprietary,
					DeniedReason21Choice.mmCode, DeniedReason21Choice.mmProprietary, DeniedReason18Choice.mmCode, DeniedReason18Choice.mmProprietary, ModificationProcessingStatus8Choice.mmDenied, ProcessingStatus61Choice.mmDenied,
					DeniedStatus21Choice.mmReason, DeniedStatus18Choice.mmReason, DeniedReason13.mmCode, DeniedReason16.mmCode, DeniedStatus19Choice.mmReason, DeniedReason17.mmCode, DeniedReason24Choice.mmCode,
					DeniedReason24Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeniedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getDeniedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTradeStatus securitiesTradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}
	};
	protected GeneratedReasonCode generatedReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons1Choice#mmCode
	 * GeneratedReasons1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons1Choice#mmProprietary
	 * GeneratedReasons1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason1#mmCode
	 * GeneratedReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons2Choice#mmCode
	 * GeneratedReasons2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons2Choice#mmProprietary
	 * GeneratedReasons2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason2#mmCode
	 * GeneratedReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus1Choice#mmReason
	 * GeneratedStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmGenerated
	 * InstructionProcessingStatus3Choice.mmGenerated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus2Choice#mmReason
	 * GeneratedStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmGenerated
	 * InstructionProcessingStatus6Choice.mmGenerated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmGenerated
	 * InstructionProcessingStatus10Choice.mmGenerated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmGenerated
	 * InstructionProcessingStatus11Choice.mmGenerated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmGeneratedReason
	 * Reason1Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmGeneratedReason
	 * Reason6Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmGeneratedReason
	 * Reason2Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmGeneratedReason
	 * Reason10Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmGeneratedReason
	 * Reason7Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmGeneratedReason
	 * Reason11Choice.mmGeneratedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason3#mmCode
	 * GeneratedReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmGeneratedReason
	 * Reason12Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons3Choice#mmCode
	 * GeneratedReasons3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons3Choice#mmProprietary
	 * GeneratedReasons3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmGenerated
	 * InstructionProcessingStatus14Choice.mmGenerated}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason4#mmCode
	 * GeneratedReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons4Choice#mmCode
	 * GeneratedReasons4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons4Choice#mmProprietary
	 * GeneratedReasons4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmGenerated
	 * InstructionProcessingStatus17Choice.mmGenerated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmGeneratedReason
	 * Reason13Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmGeneratedReason
	 * Reason14Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmGeneratedReason
	 * Reason15Choice.mmGeneratedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason5#mmCode
	 * GeneratedReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice#mmCode
	 * GeneratedReasons5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice#mmProprietary
	 * GeneratedReasons5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmGenerated
	 * InstructionProcessingStatus22Choice.mmGenerated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmGeneratedReason
	 * Reason16Choice.mmGeneratedReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GeneratedReason6#mmCode
	 * GeneratedReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmGeneratedReason
	 * Reason17Choice.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons6Choice#mmCode
	 * GeneratedReasons6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons6Choice#mmProprietary
	 * GeneratedReasons6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmGenerated
	 * InstructionProcessingStatus27Choice.mmGenerated}</li>
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
	public static final MMBusinessAttribute mmGeneratedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GeneratedReasons1Choice.mmCode, GeneratedReasons1Choice.mmProprietary, GeneratedReason1.mmCode, GeneratedReasons2Choice.mmCode, GeneratedReasons2Choice.mmProprietary,
					GeneratedReason2.mmCode, GeneratedStatus1Choice.mmReason, InstructionProcessingStatus3Choice.mmGenerated, GeneratedStatus2Choice.mmReason, InstructionProcessingStatus6Choice.mmGenerated,
					InstructionProcessingStatus10Choice.mmGenerated, InstructionProcessingStatus11Choice.mmGenerated, Reason1Choice.mmGeneratedReason, Reason6Choice.mmGeneratedReason, Reason2Choice.mmGeneratedReason,
					Reason10Choice.mmGeneratedReason, Reason7Choice.mmGeneratedReason, Reason11Choice.mmGeneratedReason, GeneratedReason3.mmCode, Reason12Choice.mmGeneratedReason, GeneratedReasons3Choice.mmCode,
					GeneratedReasons3Choice.mmProprietary, InstructionProcessingStatus14Choice.mmGenerated, GeneratedReason4.mmCode, GeneratedReasons4Choice.mmCode, GeneratedReasons4Choice.mmProprietary,
					InstructionProcessingStatus17Choice.mmGenerated, Reason13Choice.mmGeneratedReason, Reason14Choice.mmGeneratedReason, Reason15Choice.mmGeneratedReason, GeneratedReason5.mmCode, GeneratedReasons5Choice.mmCode,
					GeneratedReasons5Choice.mmProprietary, InstructionProcessingStatus22Choice.mmGenerated, Reason16Choice.mmGeneratedReason, GeneratedReason6.mmCode, Reason17Choice.mmGeneratedReason, GeneratedReasons6Choice.mmCode,
					GeneratedReasons6Choice.mmProprietary, InstructionProcessingStatus27Choice.mmGenerated);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GeneratedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getGeneratedReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AllegementReasonCode allegementReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.AllegmentReason1Choice#mmCode
	 * AllegmentReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegmentReason1Choice#mmProprietary
	 * AllegmentReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingReason3Choice#mmReason
	 * MatchingReason3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementReason1Choice#mmCode
	 * AllegementReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementReason1Choice#mmProprietary
	 * AllegementReason1Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmAllegementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AllegmentReason1Choice.mmCode, AllegmentReason1Choice.mmProprietary, MatchingReason3Choice.mmReason, AllegementReason1Choice.mmCode, AllegementReason1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegementReason";
			definition = "Reason why the instruction has an allegement status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllegementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getAllegementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingSettlementStatusReasonCode pendingSettlementReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatusReason1#mmStructured
	 * PendingSettlementStatusReason1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatusChoice#mmReason
	 * PendingSettlementStatusChoice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmReason
	 * PendingSettlementStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmPendingSettlement
	 * TransferStatus1Choice.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmPendingSettlement
	 * TransferStatus2Choice.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmReason
	 * PendingSettlementStatus3Choice.mmReason}</li>
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
	public static final MMBusinessAttribute mmPendingSettlementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PendingSettlementStatusReason1.mmStructured, PendingSettlementStatusChoice.mmReason, PendingSettlementStatus2.mmReason, TransferStatus1Choice.mmPendingSettlement,
					TransferStatus2Choice.mmPendingSettlement, PendingSettlementStatus3Choice.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSettlementReason";
			definition = "Reason for the settlement pending status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getPendingSettlementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RepoCallAcknowledgementReasonCode repoCallAcknowledgementReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason3Choice#mmCode
	 * AcknowledgementReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason3Choice#mmProprietary
	 * AcknowledgementReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason2#mmCode
	 * AcknowledgementReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus2Choice#mmReason
	 * AcknowledgedAcceptedStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice#mmAcknowledgedAccepted
	 * RepoCallRequestStatus2Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmRepoCallAcknowledgementReason
	 * Reason1Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmRepoCallAcknowledgementReason
	 * Reason6Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason7Choice#mmCode
	 * AcknowledgementReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason7Choice#mmProprietary
	 * AcknowledgementReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason5#mmCode
	 * AcknowledgementReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus5Choice#mmReason
	 * AcknowledgedAcceptedStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice#mmAcknowledgedAccepted
	 * RepoCallRequestStatus4Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice#mmAcknowledgedAccepted
	 * RepoCallRequestStatus5Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice#mmAcknowledgedAccepted
	 * RepoCallRequestStatus6Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmRepoCallAcknowledgementReason
	 * Reason2Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmRepoCallAcknowledgementReason
	 * Reason10Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRepoCallAcknowledgementReason
	 * Reason7Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmRepoCallAcknowledgementReason
	 * Reason11Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepoCallAcknowledgementReason
	 * Reason12Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmRepoCallAcknowledgementReason
	 * Reason13Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepoCallAcknowledgementReason
	 * Reason14Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmRepoCallAcknowledgementReason
	 * Reason15Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#mmAcknowledgedAccepted
	 * RepoCallRequestStatus7Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason10#mmCode
	 * AcknowledgementReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice#mmCode
	 * AcknowledgementReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice#mmProprietary
	 * AcknowledgementReason13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepoCallAcknowledgementReason
	 * Reason16Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice#mmAcknowledgedAccepted
	 * RepoCallRequestStatus9Choice.mmAcknowledgedAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason18Choice#mmCode
	 * AcknowledgementReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason18Choice#mmProprietary
	 * AcknowledgementReason18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmRepoCallAcknowledgementReason
	 * Reason17Choice.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcknowledgementReason15#mmCode
	 * AcknowledgementReason15.mmCode}</li>
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
	public static final MMBusinessAttribute mmRepoCallAcknowledgementReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AcknowledgementReason3Choice.mmCode, AcknowledgementReason3Choice.mmProprietary, AcknowledgementReason2.mmCode, AcknowledgedAcceptedStatus2Choice.mmReason,
					RepoCallRequestStatus2Choice.mmAcknowledgedAccepted, Reason1Choice.mmRepoCallAcknowledgementReason, Reason6Choice.mmRepoCallAcknowledgementReason, AcknowledgementReason7Choice.mmCode,
					AcknowledgementReason7Choice.mmProprietary, AcknowledgementReason5.mmCode, AcknowledgedAcceptedStatus5Choice.mmReason, RepoCallRequestStatus4Choice.mmAcknowledgedAccepted,
					RepoCallRequestStatus5Choice.mmAcknowledgedAccepted, RepoCallRequestStatus6Choice.mmAcknowledgedAccepted, Reason2Choice.mmRepoCallAcknowledgementReason, Reason10Choice.mmRepoCallAcknowledgementReason,
					Reason7Choice.mmRepoCallAcknowledgementReason, Reason11Choice.mmRepoCallAcknowledgementReason, Reason12Choice.mmRepoCallAcknowledgementReason, Reason13Choice.mmRepoCallAcknowledgementReason,
					Reason14Choice.mmRepoCallAcknowledgementReason, Reason15Choice.mmRepoCallAcknowledgementReason, RepoCallRequestStatus7Choice.mmAcknowledgedAccepted, AcknowledgementReason10.mmCode, AcknowledgementReason13Choice.mmCode,
					AcknowledgementReason13Choice.mmProprietary, Reason16Choice.mmRepoCallAcknowledgementReason, RepoCallRequestStatus9Choice.mmAcknowledgedAccepted, AcknowledgementReason18Choice.mmCode,
					AcknowledgementReason18Choice.mmProprietary, Reason17Choice.mmRepoCallAcknowledgementReason, AcknowledgementReason15.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getRepoCallAcknowledgementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RepairReasonV2Code repairReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.RepairReason1Choice#mmCode
	 * RepairReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason1Choice#mmProprietary
	 * RepairReason1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason1#mmCode
	 * RepairReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus1Choice#mmReason
	 * RepairStatus1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus1Choice#mmRepair
	 * ProcessingStatus1Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus5Choice#mmReason
	 * RepairStatus5Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice#mmRepair
	 * ProcessingStatus19Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason6#mmCode
	 * RepairReason6.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus8Choice#mmReason
	 * RepairStatus8Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmRepaired
	 * ModificationProcessingStatus2Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus2Choice#mmRepair
	 * ProcessingStatus2Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus13Choice#mmRepair
	 * ProcessingStatus13Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice#mmRepair
	 * ProcessingStatus20Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason6Choice#mmCode
	 * RepairReason6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason6Choice#mmProprietary
	 * RepairReason6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason2#mmCode
	 * RepairReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus10Choice#mmReason
	 * RepairStatus10Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice#mmRepair
	 * ProcessingStatus25Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason7#mmCode
	 * RepairReason7.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus9Choice#mmReason
	 * RepairStatus9Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmRepaired
	 * ModificationProcessingStatus3Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice#mmRepair
	 * ProcessingStatus26Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus6Choice#mmRepair
	 * ProcessingStatus6Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus2Choice#mmReason
	 * RepairStatus2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus12Choice#mmRepair
	 * ProcessingStatus12Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus23Choice#mmRepair
	 * ProcessingStatus23Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus29Choice#mmRepair
	 * ProcessingStatus29Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus7Choice#mmRepair
	 * ProcessingStatus7Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus3Choice#mmRepair
	 * InstructionProcessingStatus3Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus6Choice#mmRepair
	 * InstructionProcessingStatus6Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmRepair
	 * InstructionProcessingStatus10Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus11Choice#mmRepair
	 * InstructionProcessingStatus11Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason9Choice#mmCode
	 * RepairReason9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason9Choice#mmProprietary
	 * RepairReason9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason5#mmCode
	 * RepairReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingReason2Choice#mmReason
	 * InstructionProcessingReason2Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice#mmInRepair
	 * ProcessingStatus17Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason2Choice#mmCode
	 * RepairReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason2Choice#mmProprietary
	 * RepairReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason3#mmCode
	 * RepairReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus3Choice#mmReason
	 * RepairStatus3Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice#mmRepair
	 * ProcessingStatus3Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason3Choice#mmCode
	 * RepairReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason3Choice#mmProprietary
	 * RepairReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmRepairReason
	 * Reason1Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason7Choice#mmCode
	 * RepairReason7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason7Choice#mmProprietary
	 * RepairReason7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason6Choice#mmRepairReason
	 * Reason6Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason5Choice#mmCode
	 * RepairReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason5Choice#mmProprietary
	 * RepairReason5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason4#mmCode
	 * RepairReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus4Choice#mmReason
	 * RepairStatus4Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus10Choice#mmRepair
	 * ProcessingStatus10Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus6Choice#mmReason
	 * RepairStatus6Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus21Choice#mmRepair
	 * ProcessingStatus21Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus11Choice#mmReason
	 * RepairStatus11Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus27Choice#mmRepair
	 * ProcessingStatus27Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason4Choice#mmCode
	 * RepairReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason4Choice#mmProprietary
	 * RepairReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason2Choice#mmRepairReason
	 * Reason2Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason8Choice#mmCode
	 * RepairReason8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason8Choice#mmProprietary
	 * RepairReason8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason10Choice#mmRepairReason
	 * Reason10Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRepairReason
	 * Reason7Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason11Choice#mmRepairReason
	 * Reason11Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus9Choice#mmRepair
	 * ProcessingStatus9Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus16Choice#mmRepair
	 * ProcessingStatus16Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#mmRepair
	 * ProcessingStatus34Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus32Choice#mmRepair
	 * ProcessingStatus32Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus35Choice#mmRepair
	 * ProcessingStatus35Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus31Choice#mmRepair
	 * ProcessingStatus31Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepairReason
	 * Reason12Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmRepair
	 * InstructionProcessingStatus14Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice#mmRepair
	 * ProcessingStatus38Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmRepair
	 * ProcessingStatus37Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus40Choice#mmRepair
	 * ProcessingStatus40Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmRepair
	 * ProcessingStatus42Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmRepair
	 * InstructionProcessingStatus17Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason13Choice#mmRepairReason
	 * Reason13Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmRepaired
	 * ModificationProcessingStatus4Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus45Choice#mmRepair
	 * ProcessingStatus45Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepairReason
	 * Reason14Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmRepaired
	 * ModificationProcessingStatus6Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus47Choice#mmRepair
	 * ProcessingStatus47Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason15Choice#mmRepairReason
	 * Reason15Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmRepaired
	 * ModificationProcessingStatus5Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmRepair
	 * ProcessingStatus48Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmRepaired
	 * ModificationProcessingStatus7Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice#mmRepair
	 * ProcessingStatus54Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice#mmRepair
	 * ProcessingStatus51Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason8#mmCode
	 * RepairReason8.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason10Choice#mmCode
	 * RepairReason10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason10Choice#mmProprietary
	 * RepairReason10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice#mmReason
	 * RepairStatus12Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus52Choice#mmRepair
	 * ProcessingStatus52Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus13Choice#mmReason
	 * RepairStatus13Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus49Choice#mmRepair
	 * ProcessingStatus49Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason10#mmCode
	 * RepairReason10.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason12Choice#mmCode
	 * RepairReason12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason12Choice#mmProprietary
	 * RepairReason12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmRepair
	 * InstructionProcessingStatus22Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason11Choice#mmCode
	 * RepairReason11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason11Choice#mmProprietary
	 * RepairReason11Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason9#mmCode
	 * RepairReason9.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus53Choice#mmRepair
	 * ProcessingStatus53Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus14Choice#mmReason
	 * RepairStatus14Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepairReason
	 * Reason16Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus57Choice#mmRepair
	 * ProcessingStatus57Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice#mmRepair
	 * ProcessingStatus65Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmRepair
	 * ProcessingStatus63Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus15Choice#mmReason
	 * RepairStatus15Choice.mmReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason11#mmCode
	 * RepairReason11.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason17Choice#mmRepairReason
	 * Reason17Choice.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason18Choice#mmCode
	 * RepairReason18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason18Choice#mmProprietary
	 * RepairReason18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmRepair
	 * ProcessingStatus62Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason12#mmCode
	 * RepairReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason14Choice#mmCode
	 * RepairReason14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason14Choice#mmProprietary
	 * RepairReason14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus27Choice#mmRepair
	 * InstructionProcessingStatus27Choice.mmRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RepairReason13#mmCode
	 * RepairReason13.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmRepaired
	 * ModificationProcessingStatus8Choice.mmRepaired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus17Choice#mmReason
	 * RepairStatus17Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice#mmRepair
	 * ProcessingStatus61Choice.mmRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairStatus16Choice#mmReason
	 * RepairStatus16Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason13Choice#mmCode
	 * RepairReason13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepairReason13Choice#mmProprietary
	 * RepairReason13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice#mmRepair
	 * ProcessingStatus60Choice.mmRepair}</li>
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
	public static final MMBusinessAttribute mmRepairReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RepairReason1Choice.mmCode, RepairReason1Choice.mmProprietary, RepairReason1.mmCode, RepairStatus1Choice.mmReason, ProcessingStatus1Choice.mmRepair, RepairStatus5Choice.mmReason,
					ProcessingStatus19Choice.mmRepair, RepairReason6.mmCode, RepairStatus8Choice.mmReason, ModificationProcessingStatus2Choice.mmRepaired, ProcessingStatus2Choice.mmRepair, ProcessingStatus13Choice.mmRepair,
					ProcessingStatus20Choice.mmRepair, RepairReason6Choice.mmCode, RepairReason6Choice.mmProprietary, RepairReason2.mmCode, RepairStatus10Choice.mmReason, ProcessingStatus25Choice.mmRepair, RepairReason7.mmCode,
					RepairStatus9Choice.mmReason, ModificationProcessingStatus3Choice.mmRepaired, ProcessingStatus26Choice.mmRepair, ProcessingStatus6Choice.mmRepair, RepairStatus2Choice.mmReason, ProcessingStatus12Choice.mmRepair,
					ProcessingStatus23Choice.mmRepair, ProcessingStatus29Choice.mmRepair, ProcessingStatus7Choice.mmRepair, InstructionProcessingStatus3Choice.mmRepair, InstructionProcessingStatus6Choice.mmRepair,
					InstructionProcessingStatus10Choice.mmRepair, InstructionProcessingStatus11Choice.mmRepair, RepairReason9Choice.mmCode, RepairReason9Choice.mmProprietary, RepairReason5.mmCode,
					InstructionProcessingReason2Choice.mmReason, ProcessingStatus17Choice.mmInRepair, RepairReason2Choice.mmCode, RepairReason2Choice.mmProprietary, RepairReason3.mmCode, RepairStatus3Choice.mmReason,
					ProcessingStatus3Choice.mmRepair, RepairReason3Choice.mmCode, RepairReason3Choice.mmProprietary, Reason1Choice.mmRepairReason, RepairReason7Choice.mmCode, RepairReason7Choice.mmProprietary, Reason6Choice.mmRepairReason,
					RepairReason5Choice.mmCode, RepairReason5Choice.mmProprietary, RepairReason4.mmCode, RepairStatus4Choice.mmReason, ProcessingStatus10Choice.mmRepair, RepairStatus6Choice.mmReason, ProcessingStatus21Choice.mmRepair,
					RepairStatus11Choice.mmReason, ProcessingStatus27Choice.mmRepair, RepairReason4Choice.mmCode, RepairReason4Choice.mmProprietary, Reason2Choice.mmRepairReason, RepairReason8Choice.mmCode,
					RepairReason8Choice.mmProprietary, Reason10Choice.mmRepairReason, Reason7Choice.mmRepairReason, Reason11Choice.mmRepairReason, ProcessingStatus9Choice.mmRepair, ProcessingStatus16Choice.mmRepair,
					ProcessingStatus34Choice.mmRepair, ProcessingStatus32Choice.mmRepair, ProcessingStatus35Choice.mmRepair, ProcessingStatus31Choice.mmRepair, Reason12Choice.mmRepairReason, InstructionProcessingStatus14Choice.mmRepair,
					ProcessingStatus38Choice.mmRepair, ProcessingStatus37Choice.mmRepair, ProcessingStatus40Choice.mmRepair, ProcessingStatus42Choice.mmRepair, InstructionProcessingStatus17Choice.mmRepair, Reason13Choice.mmRepairReason,
					ModificationProcessingStatus4Choice.mmRepaired, ProcessingStatus45Choice.mmRepair, Reason14Choice.mmRepairReason, ModificationProcessingStatus6Choice.mmRepaired, ProcessingStatus47Choice.mmRepair,
					Reason15Choice.mmRepairReason, ModificationProcessingStatus5Choice.mmRepaired, ProcessingStatus48Choice.mmRepair, ModificationProcessingStatus7Choice.mmRepaired, ProcessingStatus54Choice.mmRepair,
					ProcessingStatus51Choice.mmRepair, RepairReason8.mmCode, RepairReason10Choice.mmCode, RepairReason10Choice.mmProprietary, RepairStatus12Choice.mmReason, ProcessingStatus52Choice.mmRepair, RepairStatus13Choice.mmReason,
					ProcessingStatus49Choice.mmRepair, RepairReason10.mmCode, RepairReason12Choice.mmCode, RepairReason12Choice.mmProprietary, InstructionProcessingStatus22Choice.mmRepair, RepairReason11Choice.mmCode,
					RepairReason11Choice.mmProprietary, RepairReason9.mmCode, ProcessingStatus53Choice.mmRepair, RepairStatus14Choice.mmReason, Reason16Choice.mmRepairReason, ProcessingStatus57Choice.mmRepair,
					ProcessingStatus65Choice.mmRepair, ProcessingStatus63Choice.mmRepair, RepairStatus15Choice.mmReason, RepairReason11.mmCode, Reason17Choice.mmRepairReason, RepairReason18Choice.mmCode, RepairReason18Choice.mmProprietary,
					ProcessingStatus62Choice.mmRepair, RepairReason12.mmCode, RepairReason14Choice.mmCode, RepairReason14Choice.mmProprietary, InstructionProcessingStatus27Choice.mmRepair, RepairReason13.mmCode,
					ModificationProcessingStatus8Choice.mmRepaired, RepairStatus17Choice.mmReason, ProcessingStatus61Choice.mmRepair, RepairStatus16Choice.mmReason, RepairReason13Choice.mmCode, RepairReason13Choice.mmProprietary,
					ProcessingStatus60Choice.mmRepair);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction/request has a repair status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepairReasonV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getRepairReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeliveryReturnCode deliveryReturnReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmDeliveryReturnReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Reason why the trade was returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReturnCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getDeliveryReturnReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CounterpartyResponseStatusReasonCode counterpartyStatusReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason2Choice#mmCode
	 * ConsentOrRejectionReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason2Choice#mmProprietary
	 * ConsentOrRejectionReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason12#mmCode
	 * RejectionReason12.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason3Choice#mmCode
	 * ConsentOrRejectionReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason3Choice#mmProprietary
	 * ConsentOrRejectionReason3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason13#mmCode
	 * RejectionReason13.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason29#mmCode
	 * RejectionReason29.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason4Choice#mmCode
	 * ConsentOrRejectionReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason4Choice#mmProprietary
	 * ConsentOrRejectionReason4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason40#mmCode
	 * RejectionReason40.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason5Choice#mmCode
	 * ConsentOrRejectionReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConsentOrRejectionReason5Choice#mmProprietary
	 * ConsentOrRejectionReason5Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmCounterpartyStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ConsentOrRejectionReason2Choice.mmCode, ConsentOrRejectionReason2Choice.mmProprietary, RejectionReason12.mmCode, ConsentOrRejectionReason3Choice.mmCode,
					ConsentOrRejectionReason3Choice.mmProprietary, RejectionReason13.mmCode, RejectionReason29.mmCode, ConsentOrRejectionReason4Choice.mmCode, ConsentOrRejectionReason4Choice.mmProprietary, RejectionReason40.mmCode,
					ConsentOrRejectionReason5Choice.mmCode, ConsentOrRejectionReason5Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyStatusReason";
			definition = "Specifies the counterparty action which is the reason of the trade status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getCounterpartyStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ModifiedStatusReasonCode modifiedStatusReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.ModificationReason2Choice#mmCode
	 * ModificationReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason2Choice#mmProprietary
	 * ModificationReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason2#mmCode
	 * ModificationReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmModified
	 * ModificationProcessingStatus2Choice.mmModified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason3Choice#mmCode
	 * ModificationReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason3Choice#mmProprietary
	 * ModificationReason3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason3#mmCode
	 * ModificationReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmModified
	 * ModificationProcessingStatus3Choice.mmModified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmModified
	 * ModificationProcessingStatus4Choice.mmModified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmModified
	 * ModificationProcessingStatus6Choice.mmModified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmModified
	 * ModificationProcessingStatus5Choice.mmModified}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmModified
	 * ModificationProcessingStatus7Choice.mmModified}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason4#mmCode
	 * ModificationReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason4Choice#mmCode
	 * ModificationReason4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason4Choice#mmProprietary
	 * ModificationReason4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason5Choice#mmCode
	 * ModificationReason5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationReason5Choice#mmProprietary
	 * ModificationReason5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ModificationReason5#mmCode
	 * ModificationReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmModified
	 * ModificationProcessingStatus8Choice.mmModified}</li>
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
	public static final MMBusinessAttribute mmModifiedStatusReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ModificationReason2Choice.mmCode, ModificationReason2Choice.mmProprietary, ModificationReason2.mmCode, ModificationProcessingStatus2Choice.mmModified, ModificationReason3Choice.mmCode,
					ModificationReason3Choice.mmProprietary, ModificationReason3.mmCode, ModificationProcessingStatus3Choice.mmModified, ModificationProcessingStatus4Choice.mmModified, ModificationProcessingStatus6Choice.mmModified,
					ModificationProcessingStatus5Choice.mmModified, ModificationProcessingStatus7Choice.mmModified, ModificationReason4.mmCode, ModificationReason4Choice.mmCode, ModificationReason4Choice.mmProprietary,
					ModificationReason5Choice.mmCode, ModificationReason5Choice.mmProprietary, ModificationReason5.mmCode, ModificationProcessingStatus8Choice.mmModified);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModifiedStatusReason";
			definition = "Specifies the reason why the related instruction is modified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModifiedStatusReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeStatusReason.class.getMethod("getModifiedStatusReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatusReason";
				definition = "Specifies the underlying reason for a status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason);
				derivationElement_lazy = () -> Arrays.asList(ProcessingStatus1Choice.mmProprietary, ProcessingStatus1Choice.mmCancellationRequested, ProcessingStatus1Choice.mmModificationRequested, ProcessingStatus19Choice.mmProprietary,
						ProcessingStatus19Choice.mmCancellationRequested, ProcessingStatus19Choice.mmModificationRequested, UnmatchedStatus1Choice.mmReason, UnmatchedStatus5Choice.mmReason, PendingStatus3Choice.mmReason,
						ModificationStatus2Choice.mmReason, RejectionOrRepairReason1.mmCode, RejectionOrRepairStatus6Choice.mmReason, ProcessingStatus2Choice.mmProprietary, RejectionOrRepairReason9.mmCode,
						RejectionOrRepairStatus10Choice.mmReason, ProcessingStatus13Choice.mmProprietary, RejectionOrRepairReason3.mmCode, RejectionOrRepairStatus4Choice.mmReason, RejectionOrRepairReason10.mmCode,
						RejectionOrRepairStatus11Choice.mmReason, RejectionOrRepairReason18.mmCode, RejectionOrRepairStatus25Choice.mmReason, RejectionOrRepairReason13.mmCode, RejectionOrRepairStatus14Choice.mmReason,
						ProcessingStatus20Choice.mmProprietary, ProcessingStatus25Choice.mmProprietary, ProcessingStatus25Choice.mmCancellationRequested, ProcessingStatus25Choice.mmModificationRequested, UnmatchedStatus10Choice.mmReason,
						ModificationStatus3Choice.mmReason, RejectionOrRepairReason19.mmCode, RejectionOrRepairStatus24Choice.mmReason, RejectionOrRepairReason16.mmCode, RejectionOrRepairStatus20Choice.mmReason,
						ProcessingStatus26Choice.mmProprietary, ProcessingStatus5Choice.mmCompleted, ProcessingStatus5Choice.mmProprietary, RejectionOrRepairReason7.mmCode, RejectionOrRepairStatus9Choice.mmReason,
						ProcessingStatus11Choice.mmCompleted, ProcessingStatus11Choice.mmProprietary, ProcessingStatus14Choice.mmCompleted, ProcessingStatus14Choice.mmProprietary, RejectionOrRepairReason11.mmCode,
						RejectionOrRepairStatus12Choice.mmReason, ProcessingStatus15Choice.mmCompleted, ProcessingStatus15Choice.mmProprietary, ProcessingStatus18Choice.mmCompleted, ProcessingStatus18Choice.mmProprietary,
						ProcessingStatus24Choice.mmCompleted, ProcessingStatus24Choice.mmProprietary, ProcessingStatus6Choice.mmProprietary, ProcessingStatus6Choice.mmCancellationRequested, ProcessingStatus12Choice.mmProprietary,
						ProcessingStatus12Choice.mmCancellationRequested, UnmatchedStatus4Choice.mmReason, PendingStatus8Choice.mmReason, ProcessingStatus23Choice.mmProprietary, ProcessingStatus23Choice.mmCancellationRequested,
						ProcessingStatus29Choice.mmProprietary, ProcessingStatus29Choice.mmCancellationRequested, ProcessingStatus7Choice.mmProprietary, ProcessingStatus7Choice.mmCancellationRequested,
						ProcessingStatus7Choice.mmModificationRequested, InstructionProcessingStatus3Choice.mmModificationRequested, InstructionProcessingStatus6Choice.mmModificationRequested, GeneratedStatus3Choice.mmReason,
						InstructionProcessingStatus10Choice.mmModificationRequested, GeneratedStatus4Choice.mmReason, InstructionProcessingStatus11Choice.mmModificationRequested, AffirmationReason1.mmCode,
						PendingProcessing1Choice.mmReason, ProcessingStatus17Choice.mmAlreadyMatchedAndAffirmed, ProcessingStatus17Choice.mmDefaultAction, ProcessingStatus17Choice.mmDone, ProcessingStatus17Choice.mmForcedRejection,
						ProcessingStatus17Choice.mmFullyExecutedConfirmationSent, ProcessingStatus17Choice.mmFuture, ProcessingStatus17Choice.mmGenerated, ProcessingStatus17Choice.mmNoInstruction, ProcessingStatus17Choice.mmOpenOrder,
						ProcessingStatus17Choice.mmReceivedAtIntermediary, ProcessingStatus17Choice.mmSettlementInstructionSent, ProcessingStatus17Choice.mmStandingInstruction, ProcessingStatus17Choice.mmTradingSuspendedByStockExchange,
						ProcessingStatus17Choice.mmTreated, ProcessingStatus17Choice.mmProprietaryStatus, AllegmentMatchingReason1.mmCode, CancellationReason11Choice.mmReason, IndividualOrderStatusAndReason1.mmConditionallyAccepted,
						TransferCancellationCompleteStatusChoice.mmReason, TransferInstructionStatus2.mmReason, RejectionOrRepairReason4.mmCode, RejectionOrRepairStatus2Choice.mmReason, IntraPositionProcessingStatus1Choice.mmRejected,
						IntraPositionProcessingStatus1Choice.mmRepair, ProcessingStatus3Choice.mmProprietary, ProcessingStatus3Choice.mmCancellationRequested, ProcessingStatus3Choice.mmModificationRequested,
						UnmatchedStatus2Choice.mmReason, RejectionOrRepairReason2.mmCode, RejectionOrRepairStatus5Choice.mmReason, ProcessingStatus4Choice.mmProprietary, ProcessingStatus10Choice.mmProprietary,
						ProcessingStatus10Choice.mmCancellationRequested, ProcessingStatus10Choice.mmModificationRequested, UnmatchedStatus3Choice.mmReason, ProcessingStatus21Choice.mmProprietary,
						ProcessingStatus21Choice.mmCancellationRequested, ProcessingStatus21Choice.mmModificationRequested, UnmatchedStatus6Choice.mmReason, ProcessingStatus27Choice.mmProprietary,
						ProcessingStatus27Choice.mmCancellationRequested, ProcessingStatus27Choice.mmModificationRequested, UnmatchedStatus11Choice.mmReason, PendingStatus20Choice.mmForwarded, PendingStatus20Choice.mmUnderInvestigation,
						RejectionOrRepairReason5.mmCode, RejectionOrRepairStatus7Choice.mmReason, ProcessingStatus8Choice.mmProprietary, RejectionOrRepairStatus18Choice.mmReason, ProcessingStatus22Choice.mmProprietary,
						RejectionOrRepairStatus23Choice.mmReason, ProcessingStatus28Choice.mmProprietary, RejectionOrRepairReason6.mmCode, RejectionOrRepairStatus8Choice.mmReason, ProcessingStatus9Choice.mmProprietary,
						RejectionOrRepairReason12.mmCode, RejectionOrRepairStatus13Choice.mmReason, ProcessingStatus16Choice.mmProprietary, RejectionOrRepairReason8.mmCode, RejectionOrRepairStatus3Choice.mmReason,
						IntraPositionProcessingStatus2Choice.mmRejected, IntraPositionProcessingStatus2Choice.mmRepair, RejectionOrRepairReason14.mmCode, RejectionOrRepairStatus15Choice.mmReason,
						IntraPositionProcessingStatus3Choice.mmRejected, IntraPositionProcessingStatus3Choice.mmRepair, RejectionOrRepairReason17.mmCode, RejectionOrRepairStatus21Choice.mmReason,
						IntraPositionProcessingStatus4Choice.mmRejected, IntraPositionProcessingStatus4Choice.mmRepair, RejectionOrRepairReason20.mmCode, RejectionOrRepairStatus26Choice.mmReason, RejectionOrRepairReason22.mmCode,
						RejectionOrRepairStatus28Choice.mmReason, ProcessingStatus32Choice.mmProprietary, ProcessingStatus35Choice.mmProprietary, ProcessingStatus36Choice.mmCompleted, ProcessingStatus36Choice.mmProprietary,
						RejectionOrRepairReason21.mmCode, RejectionOrRepairStatus27Choice.mmReason, ProcessingStatus31Choice.mmCompleted, ProcessingStatus31Choice.mmProprietary, TransferInstructionStatus3.mmReason,
						GeneratedStatus5Choice.mmReason, InstructionProcessingStatus14Choice.mmModificationRequested, ProcessingStatus38Choice.mmProprietary, ProcessingStatus38Choice.mmCancellationRequested,
						ProcessingStatus38Choice.mmModificationRequested, ProcessingStatus37Choice.mmCancellationRequested, ProcessingStatus37Choice.mmModificationRequested, UnmatchedStatus12Choice.mmReason,
						UnmatchedStatus13Choice.mmReason, AcceptedStatus4Choice.mmReason, ProcessingStatus40Choice.mmProprietary, ProcessingStatus40Choice.mmCancellationRequested, ProcessingStatus40Choice.mmModificationRequested,
						ProcessingStatus42Choice.mmCancellationRequested, ProcessingStatus42Choice.mmModificationRequested, UnmatchedStatus15Choice.mmReason, InstructionProcessingStatus17Choice.mmModificationRequested,
						GeneratedStatus6Choice.mmReason, UnmatchedStatus14Choice.mmReason, AcceptedStatus6Choice.mmReason, AllegementMatchingReason1.mmCode, ReportItemStatus1.mmException, ProcessingStatus44Choice.mmCompleted,
						ProcessingStatus44Choice.mmProprietary, ProcessingStatus45Choice.mmProprietary, ProcessingStatus47Choice.mmProprietary, ProcessingStatus46Choice.mmCompleted, ProcessingStatus46Choice.mmProprietary,
						ProcessingStatus55Choice.mmProprietary, IntraPositionProcessingStatus5Choice.mmRejected, IntraPositionProcessingStatus5Choice.mmRepair, ProcessingStatus50Choice.mmCompleted, ProcessingStatus50Choice.mmProprietary,
						ProcessingStatus48Choice.mmCancellationRequested, ProcessingStatus48Choice.mmModificationRequested, ProcessingStatus54Choice.mmProprietary, ProcessingStatus51Choice.mmProprietary,
						ProcessingStatus51Choice.mmCancellationRequested, ProcessingStatus51Choice.mmModificationRequested, AcceptedStatus7Choice.mmReason, ProcessingStatus52Choice.mmProprietary,
						ProcessingStatus52Choice.mmCancellationRequested, RejectionOrRepairStatus31Choice.mmReason, ModificationStatus4Choice.mmReason, RejectionOrRepairReason25.mmCode, UnmatchedStatus17Choice.mmReason,
						ProcessingStatus49Choice.mmProprietary, ProcessingStatus49Choice.mmCancellationRequested, ProcessingStatus49Choice.mmModificationRequested, UnmatchedStatus16Choice.mmReason,
						InstructionProcessingStatus22Choice.mmModificationRequested, RejectionOrRepairStatus29Choice.mmReason, RejectionOrRepairReason23.mmCode, ProcessingStatus53Choice.mmProprietary, GeneratedStatus7Choice.mmReason,
						RejectionOrRepairStatus32Choice.mmReason, UnmatchedStatus18Choice.mmReason, RejectionOrRepairReason26.mmCode, RejectionOrRepairStatus30Choice.mmReason, RejectionOrRepairReason24.mmCode,
						TransferInstructionStatus4.mmReason, ProcessingStatus57Choice.mmProprietary, ProcessingStatus57Choice.mmCancellationRequested, ProcessingStatus57Choice.mmModificationRequested,
						ProcessingStatus65Choice.mmProprietary, ProcessingStatus58Choice.mmCompleted, ProcessingStatus58Choice.mmProprietary, ProcessingStatus64Choice.mmProprietary, IntraPositionProcessingStatus6Choice.mmRejected,
						IntraPositionProcessingStatus6Choice.mmRepair, ProcessingStatus63Choice.mmCancellationRequested, ProcessingStatus63Choice.mmModificationRequested, RejectionOrRepairReason29.mmCode,
						ProcessingStatus62Choice.mmProprietary, ProcessingStatus62Choice.mmCancellationRequested, AcceptedStatus10Choice.mmReason, UnmatchedStatus19Choice.mmReason, GeneratedStatus8Choice.mmReason,
						RejectionOrRepairReason31.mmCode, ModificationStatus5Choice.mmReason, InstructionProcessingStatus27Choice.mmModificationRequested, RejectionOrRepairStatus34Choice.mmReason, RejectionOrRepairReason28.mmCode,
						UnmatchedStatus21Choice.mmReason, ProcessingStatus61Choice.mmProprietary, RejectionOrRepairStatus35Choice.mmReason, RejectionOrRepairStatus33Choice.mmReason, RejectionOrRepairReason27.mmCode,
						UnmatchedStatus20Choice.mmReason, RejectionOrRepairStatus37Choice.mmReason, ProcessingStatus60Choice.mmProprietary, ProcessingStatus60Choice.mmCancellationRequested, ProcessingStatus60Choice.mmModificationRequested);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmUnmatchedReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmDeniedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmGeneratedReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmAllegementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmPendingSettlementReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmRepairReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmDeliveryReturnReason, com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmCounterpartyStatusReason,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmModifiedStatusReason);
				derivationComponent_lazy = () -> ListBuilderForSecuritiesTradeStatusReason_00.addElems(new ArrayList<>());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeStatusReason.class;
			}
		});
		return mmObject_lazy.get();
	}

	public UnmatchedReasonCode getUnmatchedReason() {
		return unmatchedReason;
	}

	public SecuritiesTradeStatusReason setUnmatchedReason(UnmatchedReasonCode unmatchedReason) {
		this.unmatchedReason = Objects.requireNonNull(unmatchedReason);
		return this;
	}

	public DeniedReasonCode getDeniedReason() {
		return deniedReason;
	}

	public SecuritiesTradeStatusReason setDeniedReason(DeniedReasonCode deniedReason) {
		this.deniedReason = Objects.requireNonNull(deniedReason);
		return this;
	}

	public Optional<SecuritiesTradeStatus> getSecuritiesTradeStatus() {
		return securitiesTradeStatus == null ? Optional.empty() : Optional.of(securitiesTradeStatus);
	}

	public SecuritiesTradeStatusReason setSecuritiesTradeStatus(com.tools20022.repository.entity.SecuritiesTradeStatus securitiesTradeStatus) {
		this.securitiesTradeStatus = securitiesTradeStatus;
		return this;
	}

	public GeneratedReasonCode getGeneratedReason() {
		return generatedReason;
	}

	public SecuritiesTradeStatusReason setGeneratedReason(GeneratedReasonCode generatedReason) {
		this.generatedReason = Objects.requireNonNull(generatedReason);
		return this;
	}

	public AllegementReasonCode getAllegementReason() {
		return allegementReason;
	}

	public SecuritiesTradeStatusReason setAllegementReason(AllegementReasonCode allegementReason) {
		this.allegementReason = Objects.requireNonNull(allegementReason);
		return this;
	}

	public PendingSettlementStatusReasonCode getPendingSettlementReason() {
		return pendingSettlementReason;
	}

	public SecuritiesTradeStatusReason setPendingSettlementReason(PendingSettlementStatusReasonCode pendingSettlementReason) {
		this.pendingSettlementReason = Objects.requireNonNull(pendingSettlementReason);
		return this;
	}

	public RepoCallAcknowledgementReasonCode getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason;
	}

	public SecuritiesTradeStatusReason setRepoCallAcknowledgementReason(RepoCallAcknowledgementReasonCode repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = Objects.requireNonNull(repoCallAcknowledgementReason);
		return this;
	}

	public RepairReasonV2Code getRepairReason() {
		return repairReason;
	}

	public SecuritiesTradeStatusReason setRepairReason(RepairReasonV2Code repairReason) {
		this.repairReason = Objects.requireNonNull(repairReason);
		return this;
	}

	public DeliveryReturnCode getDeliveryReturnReason() {
		return deliveryReturnReason;
	}

	public SecuritiesTradeStatusReason setDeliveryReturnReason(DeliveryReturnCode deliveryReturnReason) {
		this.deliveryReturnReason = Objects.requireNonNull(deliveryReturnReason);
		return this;
	}

	public CounterpartyResponseStatusReasonCode getCounterpartyStatusReason() {
		return counterpartyStatusReason;
	}

	public SecuritiesTradeStatusReason setCounterpartyStatusReason(CounterpartyResponseStatusReasonCode counterpartyStatusReason) {
		this.counterpartyStatusReason = Objects.requireNonNull(counterpartyStatusReason);
		return this;
	}

	public ModifiedStatusReasonCode getModifiedStatusReason() {
		return modifiedStatusReason;
	}

	public SecuritiesTradeStatusReason setModifiedStatusReason(ModifiedStatusReasonCode modifiedStatusReason) {
		this.modifiedStatusReason = Objects.requireNonNull(modifiedStatusReason);
		return this;
	}
}