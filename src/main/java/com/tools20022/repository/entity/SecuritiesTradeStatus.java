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
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a securities trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeStatus"
 * src="doc-files/SecuritiesTradeStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#MatchingStatus
 * SecuritiesTradeStatus.MatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#AffirmationStatus
 * SecuritiesTradeStatus.AffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#Reason
 * SecuritiesTradeStatus.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SecuritiesTrade
 * SecuritiesTradeStatus.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#TransactionStatus
 * SecuritiesTradeStatus.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#ReplacementProcessingStatus
 * SecuritiesTradeStatus.ReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#CancellationStatus
 * SecuritiesTradeStatus.CancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#CancellationRight
 * SecuritiesTradeStatus.CancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#TransferStatus
 * SecuritiesTradeStatus.TransferStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#AllegedStatus
 * SecuritiesTradeStatus.AllegedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#CollateralAllocationStatus
 * SecuritiesTradeStatus.CollateralAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RepoCallRequestStatus
 * SecuritiesTradeStatus.RepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SettlementConditionModificationStatus
 * SecuritiesTradeStatus.SettlementConditionModificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#MatchingProcess
 * SecuritiesTradeStatus.MatchingProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#RelatedSecuritiesTransfer
 * SecuritiesTradeStatus.RelatedSecuritiesTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeStatus
 * SecuritiesTrade.SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Status
 * SecuritiesTransfer.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#SecuritiesTradeStatus
 * SecuritiesTradeStatusReason.SecuritiesTradeStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus2Choice#Proprietary
 * MatchingStatus2Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#Proprietary
 * MatchingStatus7Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice#Pending
 * SettlementStatus2Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice#Failing
 * SettlementStatus2Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice#Proprietary
 * SettlementStatus2Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#Pending
 * SettlementStatus7Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#Failing
 * SettlementStatus7Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#Proprietary
 * SettlementStatus7Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice#Proprietary
 * MatchingStatus18Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice#Pending
 * SettlementStatus13Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice#Failing
 * SettlementStatus13Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice#Proprietary
 * SettlementStatus13Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus6Choice#Proprietary
 * MatchingStatus6Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus4Choice#Pending
 * SettlementStatus4Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus4Choice#Failing
 * SettlementStatus4Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus4Choice#Proprietary
 * SettlementStatus4Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#ProprietaryStatus
 * MatchingStatus9Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#ProprietaryStatus
 * CancellationProcessingStatus6Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#Status
 * CancellationStatusAndReason.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#Status
 * CancellationStatusAndReason2.Status}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason#Status
 * TransferStatusAndReason.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#Status
 * TransferStatusAndReason2.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice#Proprietary
 * MatchingStatus3Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice#Proprietary
 * RepoCallRequestStatus2Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters1#Status
 * AdditionalQueryParameters1.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters3#Status
 * AdditionalQueryParameters3.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus4Choice#Proprietary
 * MatchingStatus4Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice#Proprietary
 * RepoCallRequestStatus4Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus12Choice#Proprietary
 * MatchingStatus12Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice#Pending
 * SettlementStatus10Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice#Failing
 * SettlementStatus10Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice#Proprietary
 * SettlementStatus10Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice#Proprietary
 * RepoCallRequestStatus5Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus16Choice#Proprietary
 * MatchingStatus16Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus12Choice#Pending
 * SettlementStatus12Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus12Choice#Failing
 * SettlementStatus12Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus12Choice#Proprietary
 * SettlementStatus12Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice#Proprietary
 * RepoCallRequestStatus6Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters2#Status
 * AdditionalQueryParameters2.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters4#Status
 * AdditionalQueryParameters4.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5#Status
 * AdditionalQueryParameters5.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters6#Status
 * AdditionalQueryParameters6.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus9Choice#Pending
 * SettlementStatus9Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus9Choice#Failing
 * SettlementStatus9Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus9Choice#Proprietary
 * SettlementStatus9Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus15Choice#Pending
 * SettlementStatus15Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus15Choice#Failing
 * SettlementStatus15Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus15Choice#Proprietary
 * SettlementStatus15Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#Proprietary
 * ProcessingStatus34Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1#SettlementStatus
 * IntraPositionStatusAndReason1.SettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1#Settled
 * IntraPositionStatusAndReason1.Settled}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1#Type
 * IntraPositionQueryStatus1.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#Status
 * TransferStatus1Choice.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7#Status
 * AdditionalQueryParameters7.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice#Proprietary
 * MatchingStatus20Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#Proprietary
 * MatchingStatus19Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#Proprietary
 * ProcessingStatus37Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus21Choice#Proprietary
 * MatchingStatus21Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters8#Status
 * AdditionalQueryParameters8.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#Proprietary
 * ProcessingStatus42Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus22Choice#Proprietary
 * MatchingStatus22Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#ProprietaryStatus
 * MatchingStatus23Choice.ProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9#Status
 * AdditionalQueryParameters9.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters10#Status
 * AdditionalQueryParameters10.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#Pending
 * SettlementStatus16Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#Failing
 * SettlementStatus16Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#Proprietary
 * SettlementStatus16Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#Proprietary
 * ProcessingStatus48Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#Proprietary
 * MatchingStatus24Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#Pending
 * SettlementStatus17Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#Failing
 * SettlementStatus17Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#Proprietary
 * SettlementStatus17Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11#Status
 * AdditionalQueryParameters11.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#Proprietary
 * MatchingStatus26Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#Proprietary
 * RepoCallRequestStatus7Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#Pending
 * SettlementStatus18Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#Failing
 * SettlementStatus18Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#Proprietary
 * SettlementStatus18Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#Proprietary
 * MatchingStatus25Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#Status
 * TransferStatus2Choice.Status}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#Status
 * Status21Choice.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus21Choice#Pending
 * SettlementStatus21Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus21Choice#Failing
 * SettlementStatus21Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus21Choice#Proprietary
 * SettlementStatus21Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice#Proprietary
 * RepoCallRequestStatus9Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#Proprietary
 * MatchingStatus29Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters12#Status
 * AdditionalQueryParameters12.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus20Choice#Pending
 * SettlementStatus20Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus20Choice#Failing
 * SettlementStatus20Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus20Choice#Proprietary
 * SettlementStatus20Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#Proprietary
 * ProcessingStatus63Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice#Proprietary
 * MatchingStatus32Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice#Proprietary
 * MatchingStatus30Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#Pending
 * SettlementStatus22Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#Failing
 * SettlementStatus22Choice.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#Proprietary
 * SettlementStatus22Choice.Proprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus2Choice
 * MatchingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus7Choice
 * MatchingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus2Choice
 * SettlementStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
 * SettlementStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus18Choice
 * MatchingStatus18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus13Choice
 * SettlementStatus13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus1Choice
 * MatchingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice
 * AffirmationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus5Choice
 * MatchingStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus2Choice
 * AffirmationStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus6Choice
 * MatchingStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus4Choice
 * SettlementStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice
 * AffirmationStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice
 * AffirmationStatus6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice
 * InstructionProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus9Choice
 * MatchingStatus9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice
 * CancellationProcessingStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus8Choice
 * MatchingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationRight1
 * CancellationRight1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferCancellationStatus
 * TransferCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason
 * CancellationStatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferCancellationStatus2
 * TransferCancellationStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2
 * CancellationStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus
 * TransferInstructionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason
 * TransferStatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus2
 * TransferInstructionStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
 * TransferStatusAndReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1
 * TradeTransactionStatusAndReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
 * TradeTransactionStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus3Choice
 * MatchingStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice
 * RepoCallRequestStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus1Choice
 * AllegementStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus1Choice
 * AllocationSatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice
 * RepoCallRequestStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice
 * CancellationProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters1
 * AdditionalQueryParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus5Choice
 * SettlementStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters3
 * AdditionalQueryParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus4Choice
 * MatchingStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice
 * RepoCallRequestStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus12Choice
 * MatchingStatus12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus10Choice
 * SettlementStatus10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice
 * RepoCallRequestStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus16Choice
 * MatchingStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus12Choice
 * SettlementStatus12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice
 * RepoCallRequestStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus2Choice
 * AllegementStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus2Choice
 * AllocationSatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus3Choice
 * RepoCallRequestStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice
 * InstructionProcessingStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice
 * CancellationProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters2
 * AdditionalQueryParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus6Choice
 * SettlementStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters4
 * AdditionalQueryParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5
 * AdditionalQueryParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters6
 * AdditionalQueryParameters6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus9Choice
 * SettlementStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus15Choice
 * SettlementStatus15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice
 * CancellationProcessingStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1
 * IntraPositionStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionStatusType1
 * IntraPositionStatusType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1
 * IntraPositionQueryStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason3
 * TransferStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferStatus1Choice
 * TransferStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus3
 * TransferInstructionStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7
 * AdditionalQueryParameters7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus20Choice
 * MatchingStatus20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus19Choice
 * MatchingStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus21Choice
 * MatchingStatus21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters8
 * AdditionalQueryParameters8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus22Choice
 * MatchingStatus22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
 * ProcessingStatus43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
 * MatchingStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9
 * AdditionalQueryParameters9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters10
 * AdditionalQueryParameters10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus16Choice
 * SettlementStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus24Choice
 * MatchingStatus24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
 * SettlementStatus17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11
 * AdditionalQueryParameters11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus26Choice
 * MatchingStatus26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice
 * RepoCallRequestStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus18Choice
 * SettlementStatus18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice
 * RepoCallRequestStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice
 * AffirmationStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus27Choice
 * MatchingStatus27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus25Choice
 * MatchingStatus25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice
 * InstructionProcessingStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus3Choice
 * AllocationSatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus3Choice
 * AllegementStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice
 * CancellationProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus19Choice
 * SettlementStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3
 * CancellationStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason4
 * TransferStatusAndReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus4
 * TransferInstructionStatus4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferStatus2Choice
 * TransferStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus21Choice
 * SettlementStatus21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice
 * RepoCallRequestStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus29Choice
 * MatchingStatus29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters12
 * AdditionalQueryParameters12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus20Choice
 * SettlementStatus20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus32Choice
 * MatchingStatus32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice
 * AffirmationStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus28Choice
 * MatchingStatus28Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice
 * CancellationProcessingStatus8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus10Choice
 * RepoCallRequestStatus10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice
 * InstructionProcessingStatus26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus25Choice
 * SettlementStatus25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus4Choice
 * AllocationSatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus30Choice
 * MatchingStatus30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
 * SettlementStatus22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus4Choice
 * AllegementStatus4Choice}</li>
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
 * "SecuritiesTradeStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a securities trade."</li>
 * </ul>
 */
public class SecuritiesTradeStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of matching of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus2Choice#Matched
	 * MatchingStatus2Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#Matched
	 * MatchingStatus7Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#InferredMatchingStatus
	 * StatusTrail2.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#MatchingStatus
	 * StatusTrail2.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice#Matched
	 * MatchingStatus18Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail3#InferredMatchingStatus
	 * StatusTrail3.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail3#MatchingStatus
	 * StatusTrail3.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice#Code
	 * MatchingStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice#Proprietary
	 * MatchingStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#MatchingStatus
	 * SecuritiesTradeDetails25.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#MatchingStatus
	 * SecuritiesTradeDetails26.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus5Choice#Code
	 * MatchingStatus5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus5Choice#Proprietary
	 * MatchingStatus5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#MatchingStatus
	 * SecuritiesTradeDetails27.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#MatchingStatus
	 * SecuritiesTradeDetails28.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#MatchingStatus
	 * SecuritiesTradeDetails3.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#MatchingStatus
	 * SecuritiesTradeDetails11.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#MatchingStatus
	 * SecuritiesTradeDetails1.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#InferredMatchingStatus
	 * StatusAndReason3.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#MatchingStatus
	 * StatusAndReason3.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#MatchingStatus
	 * SecuritiesTradeDetails15.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus6Choice#Matched
	 * MatchingStatus6Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#InferredMatchingStatus
	 * StatusAndReason6.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#MatchingStatus
	 * StatusAndReason6.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#InferredMatchingStatus
	 * StatusAndReason12.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#MatchingStatus
	 * StatusAndReason12.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#InferredMatchingStatus
	 * StatusAndReason14.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#MatchingStatus
	 * StatusAndReason14.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#MatchingStatus
	 * Status2Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#InferredMatchingStatus
	 * Status2Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#MatchingStatus
	 * Status4Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#InferredMatchingStatus
	 * Status4Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#MatchingStatus
	 * Status9Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#InferredMatchingStatus
	 * Status9Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#MatchingStatus
	 * Status11Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#InferredMatchingStatus
	 * Status11Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#Matched
	 * MatchingStatus9Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#MatchedWithTolerance
	 * MatchingStatus9Choice.MatchedWithTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#MatchingAlleged
	 * MatchingStatus9Choice.MatchingAlleged}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice#Code
	 * MatchingStatus8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice#Proprietary
	 * MatchingStatus8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#MatchStatus
	 * Order16.MatchStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#MatchStatus
	 * Order14.MatchStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice#Matched
	 * MatchingStatus3Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#InferredMatchingStatus
	 * Status1Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#MatchingStatus
	 * Status1Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#InferredMatchingStatus
	 * Status8Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#MatchingStatus
	 * Status8Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus4Choice#Matched
	 * MatchingStatus4Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus12Choice#Matched
	 * MatchingStatus12Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus16Choice#Matched
	 * MatchingStatus16Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#InferredMatchingStatus
	 * Status3Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#MatchingStatus
	 * Status3Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#InferredMatchingStatus
	 * Status10Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#MatchingStatus
	 * Status10Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#MatchingStatus
	 * Status15Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#InferredMatchingStatus
	 * Status15Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice#Matched
	 * MatchingStatus20Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#MatchingStatus
	 * SecuritiesTradeDetails33.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#InferredMatchingStatus
	 * StatusAndReason19.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#MatchingStatus
	 * StatusAndReason19.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#Matched
	 * MatchingStatus19Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#MatchingStatus
	 * SecuritiesTradeDetails37.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#MatchingStatus
	 * SecuritiesTradeDetails34.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#MatchingStatus
	 * SecuritiesTradeDetails32.MatchingStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#MatchStatus
	 * Order17.MatchStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#MatchStatus
	 * Order18.MatchStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#MatchingStatus
	 * SecuritiesTradeDetails44.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#InferredMatchingStatus
	 * StatusAndReason20.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#MatchingStatus
	 * StatusAndReason20.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus21Choice#Matched
	 * MatchingStatus21Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#MatchingStatus
	 * SecuritiesTradeDetails40.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus22Choice#Matched
	 * MatchingStatus22Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#MatchingStatus
	 * Status16Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#InferredMatchingStatus
	 * Status16Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#MatchingStatus
	 * SecuritiesTradeDetails46.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#MatchingStatus
	 * SecuritiesTradeDetails47.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#Matched
	 * MatchingStatus23Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#MatchedWithTolerance
	 * MatchingStatus23Choice.MatchedWithTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#MatchingAlleged
	 * MatchingStatus23Choice.MatchingAlleged}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4#InferredMatchingStatus
	 * StatusTrail4.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4#MatchingStatus
	 * StatusTrail4.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5#InferredMatchingStatus
	 * StatusTrail5.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5#MatchingStatus
	 * StatusTrail5.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#InferredMatchingStatus
	 * StatusAndReason28.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#MatchingStatus
	 * StatusAndReason28.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#MatchingStatus
	 * SecuritiesTradeDetails51.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#InferredMatchingStatus
	 * StatusTrail6.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#MatchingStatus
	 * StatusTrail6.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#Matched
	 * MatchingStatus24Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#MatchingStatus
	 * SecuritiesTradeDetails56.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#Matched
	 * MatchingStatus26Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#MatchingStatus
	 * SecuritiesTradeDetails52.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice#Code
	 * MatchingStatus27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice#Proprietary
	 * MatchingStatus27Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#MatchingStatus
	 * Status18Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#InferredMatchingStatus
	 * Status18Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#MatchingStatus
	 * SecuritiesTradeDetails50.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#Matched
	 * MatchingStatus25Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#InferredMatchingStatus
	 * Status19Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#MatchingStatus
	 * Status19Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#MatchingStatus
	 * SecuritiesTradeDetails59.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#Matched
	 * MatchingStatus29Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#MatchingStatus
	 * SecuritiesTradeDetails63.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#InferredMatchingStatus
	 * StatusAndReason29.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#MatchingStatus
	 * StatusAndReason29.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7#InferredMatchingStatus
	 * StatusTrail7.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7#MatchingStatus
	 * StatusTrail7.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice#Matched
	 * MatchingStatus32Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus28Choice#Code
	 * MatchingStatus28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus28Choice#Proprietary
	 * MatchingStatus28Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#InferredMatchingStatus
	 * Status22Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#MatchingStatus
	 * Status22Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#MatchingStatus
	 * Status23Choice.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#InferredMatchingStatus
	 * Status23Choice.InferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice#Matched
	 * MatchingStatus30Choice.Matched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#MatchingStatus
	 * SecuritiesTradeDetails65.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#MatchingStatus
	 * SecuritiesTradeDetails66.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#MatchingStatus
	 * SecuritiesTradeDetails67.MatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#MatchingStatus
	 * SecuritiesTradeDetails70.MatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of matching of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MatchingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MatchingStatus2Choice.Matched, com.tools20022.repository.choice.MatchingStatus7Choice.Matched,
					com.tools20022.repository.msg.StatusTrail2.InferredMatchingStatus, com.tools20022.repository.msg.StatusTrail2.MatchingStatus, com.tools20022.repository.choice.MatchingStatus18Choice.Matched,
					com.tools20022.repository.msg.StatusTrail3.InferredMatchingStatus, com.tools20022.repository.msg.StatusTrail3.MatchingStatus, com.tools20022.repository.choice.MatchingStatus1Choice.Code,
					com.tools20022.repository.choice.MatchingStatus1Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails25.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails26.MatchingStatus,
					com.tools20022.repository.choice.MatchingStatus5Choice.Code, com.tools20022.repository.choice.MatchingStatus5Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails27.MatchingStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails28.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails3.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails11.MatchingStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.MatchingStatus, com.tools20022.repository.msg.StatusAndReason3.InferredMatchingStatus, com.tools20022.repository.msg.StatusAndReason3.MatchingStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.MatchingStatus, com.tools20022.repository.choice.MatchingStatus6Choice.Matched, com.tools20022.repository.msg.StatusAndReason6.InferredMatchingStatus,
					com.tools20022.repository.msg.StatusAndReason6.MatchingStatus, com.tools20022.repository.msg.StatusAndReason12.InferredMatchingStatus, com.tools20022.repository.msg.StatusAndReason12.MatchingStatus,
					com.tools20022.repository.msg.StatusAndReason14.InferredMatchingStatus, com.tools20022.repository.msg.StatusAndReason14.MatchingStatus, com.tools20022.repository.choice.Status2Choice.MatchingStatus,
					com.tools20022.repository.choice.Status2Choice.InferredMatchingStatus, com.tools20022.repository.choice.Status4Choice.MatchingStatus, com.tools20022.repository.choice.Status4Choice.InferredMatchingStatus,
					com.tools20022.repository.choice.Status9Choice.MatchingStatus, com.tools20022.repository.choice.Status9Choice.InferredMatchingStatus, com.tools20022.repository.choice.Status11Choice.MatchingStatus,
					com.tools20022.repository.choice.Status11Choice.InferredMatchingStatus, com.tools20022.repository.choice.MatchingStatus9Choice.Matched, com.tools20022.repository.choice.MatchingStatus9Choice.MatchedWithTolerance,
					com.tools20022.repository.choice.MatchingStatus9Choice.MatchingAlleged, com.tools20022.repository.choice.MatchingStatus8Choice.Code, com.tools20022.repository.choice.MatchingStatus8Choice.Proprietary,
					com.tools20022.repository.msg.Order16.MatchStatus, com.tools20022.repository.msg.Order14.MatchStatus, com.tools20022.repository.choice.MatchingStatus3Choice.Matched,
					com.tools20022.repository.choice.Status1Choice.InferredMatchingStatus, com.tools20022.repository.choice.Status1Choice.MatchingStatus, com.tools20022.repository.choice.Status8Choice.InferredMatchingStatus,
					com.tools20022.repository.choice.Status8Choice.MatchingStatus, com.tools20022.repository.choice.MatchingStatus4Choice.Matched, com.tools20022.repository.choice.MatchingStatus12Choice.Matched,
					com.tools20022.repository.choice.MatchingStatus16Choice.Matched, com.tools20022.repository.choice.Status3Choice.InferredMatchingStatus, com.tools20022.repository.choice.Status3Choice.MatchingStatus,
					com.tools20022.repository.choice.Status10Choice.InferredMatchingStatus, com.tools20022.repository.choice.Status10Choice.MatchingStatus, com.tools20022.repository.choice.Status15Choice.MatchingStatus,
					com.tools20022.repository.choice.Status15Choice.InferredMatchingStatus, com.tools20022.repository.choice.MatchingStatus20Choice.Matched, com.tools20022.repository.msg.SecuritiesTradeDetails33.MatchingStatus,
					com.tools20022.repository.msg.StatusAndReason19.InferredMatchingStatus, com.tools20022.repository.msg.StatusAndReason19.MatchingStatus, com.tools20022.repository.choice.MatchingStatus19Choice.Matched,
					com.tools20022.repository.msg.SecuritiesTradeDetails37.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails34.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails32.MatchingStatus,
					com.tools20022.repository.msg.Order17.MatchStatus, com.tools20022.repository.msg.Order18.MatchStatus, com.tools20022.repository.msg.SecuritiesTradeDetails44.MatchingStatus,
					com.tools20022.repository.msg.StatusAndReason20.InferredMatchingStatus, com.tools20022.repository.msg.StatusAndReason20.MatchingStatus, com.tools20022.repository.choice.MatchingStatus21Choice.Matched,
					com.tools20022.repository.msg.SecuritiesTradeDetails40.MatchingStatus, com.tools20022.repository.choice.MatchingStatus22Choice.Matched, com.tools20022.repository.choice.Status16Choice.MatchingStatus,
					com.tools20022.repository.choice.Status16Choice.InferredMatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails46.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails47.MatchingStatus,
					com.tools20022.repository.choice.MatchingStatus23Choice.Matched, com.tools20022.repository.choice.MatchingStatus23Choice.MatchedWithTolerance, com.tools20022.repository.choice.MatchingStatus23Choice.MatchingAlleged,
					com.tools20022.repository.msg.StatusTrail4.InferredMatchingStatus, com.tools20022.repository.msg.StatusTrail4.MatchingStatus, com.tools20022.repository.msg.StatusTrail5.InferredMatchingStatus,
					com.tools20022.repository.msg.StatusTrail5.MatchingStatus, com.tools20022.repository.msg.StatusAndReason28.InferredMatchingStatus, com.tools20022.repository.msg.StatusAndReason28.MatchingStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails51.MatchingStatus, com.tools20022.repository.msg.StatusTrail6.InferredMatchingStatus, com.tools20022.repository.msg.StatusTrail6.MatchingStatus,
					com.tools20022.repository.choice.MatchingStatus24Choice.Matched, com.tools20022.repository.msg.SecuritiesTradeDetails56.MatchingStatus, com.tools20022.repository.choice.MatchingStatus26Choice.Matched,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.MatchingStatus, com.tools20022.repository.choice.MatchingStatus27Choice.Code, com.tools20022.repository.choice.MatchingStatus27Choice.Proprietary,
					com.tools20022.repository.choice.Status18Choice.MatchingStatus, com.tools20022.repository.choice.Status18Choice.InferredMatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails50.MatchingStatus,
					com.tools20022.repository.choice.MatchingStatus25Choice.Matched, com.tools20022.repository.choice.Status19Choice.InferredMatchingStatus, com.tools20022.repository.choice.Status19Choice.MatchingStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.MatchingStatus, com.tools20022.repository.choice.MatchingStatus29Choice.Matched, com.tools20022.repository.msg.SecuritiesTradeDetails63.MatchingStatus,
					com.tools20022.repository.msg.StatusAndReason29.InferredMatchingStatus, com.tools20022.repository.msg.StatusAndReason29.MatchingStatus, com.tools20022.repository.msg.StatusTrail7.InferredMatchingStatus,
					com.tools20022.repository.msg.StatusTrail7.MatchingStatus, com.tools20022.repository.choice.MatchingStatus32Choice.Matched, com.tools20022.repository.choice.MatchingStatus28Choice.Code,
					com.tools20022.repository.choice.MatchingStatus28Choice.Proprietary, com.tools20022.repository.choice.Status22Choice.InferredMatchingStatus, com.tools20022.repository.choice.Status22Choice.MatchingStatus,
					com.tools20022.repository.choice.Status23Choice.MatchingStatus, com.tools20022.repository.choice.Status23Choice.InferredMatchingStatus, com.tools20022.repository.choice.MatchingStatus30Choice.Matched,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails66.MatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails67.MatchingStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.MatchingStatus);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingStatus";
			definition = "Status of matching of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MatchingStatusCode.mmObject();
		}
	};
	/**
	 * Status of affirmation of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmationStatusCode
	 * AffirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice#Code
	 * AffirmationStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice#Proprietary
	 * AffirmationStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#AffirmationStatus
	 * SecuritiesTradeDetails25.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#AffirmationStatus
	 * SecuritiesTradeDetails26.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus2Choice#Code
	 * AffirmationStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus2Choice#Proprietary
	 * AffirmationStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#AffirmationStatus
	 * SecuritiesTradeDetails27.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#AffirmationStatus
	 * SecuritiesTradeDetails28.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#AffirmationStatus
	 * SecuritiesTradeDetails3.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#AffirmationStatus
	 * SecuritiesTradeDetails11.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#AffirmationStatus
	 * SecuritiesTradeDetails1.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#AffirmationStatus
	 * SecuritiesTradeDetails15.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice#Code
	 * AffirmationStatus7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice#Proprietary
	 * AffirmationStatus7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#AffirmationStatus
	 * StatusAndReason10.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#Affirmed
	 * AffirmationStatus6Choice.Affirmed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#Unaffirmed
	 * AffirmationStatus6Choice.Unaffirmed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#ProprietaryStatus
	 * AffirmationStatus6Choice.ProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#AffirmationStatus
	 * Status1Choice.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#AffirmationStatus
	 * Status8Choice.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#AffirmationStatus
	 * Status3Choice.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#AffirmationStatus
	 * Status10Choice.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#AffirmationStatus
	 * SecuritiesTradeDetails33.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#AffirmationStatus
	 * SecuritiesTradeDetails37.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#AffirmationStatus
	 * SecuritiesTradeDetails34.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#AffirmationStatus
	 * SecuritiesTradeDetails32.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#AffirmationStatus
	 * SecuritiesTradeDetails44.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#AffirmationStatus
	 * SecuritiesTradeDetails40.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#AffirmationStatus
	 * SecuritiesTradeDetails46.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#AffirmationStatus
	 * SecuritiesTradeDetails47.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#AffirmationStatus
	 * SecuritiesTradeDetails51.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#AffirmationStatus
	 * SecuritiesTradeDetails56.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice#Code
	 * AffirmationStatus8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice#Proprietary
	 * AffirmationStatus8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#AffirmationStatus
	 * SecuritiesTradeDetails52.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#AffirmationStatus
	 * SecuritiesTradeDetails50.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#AffirmationStatus
	 * Status19Choice.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#AffirmationStatus
	 * SecuritiesTradeDetails59.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#AffirmationStatus
	 * SecuritiesTradeDetails63.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice#Code
	 * AffirmationStatus9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice#Proprietary
	 * AffirmationStatus9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#AffirmationStatus
	 * Status22Choice.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#AffirmationStatus
	 * SecuritiesTradeDetails65.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#AffirmationStatus
	 * SecuritiesTradeDetails66.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#AffirmationStatus
	 * SecuritiesTradeDetails67.AffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#AffirmationStatus
	 * SecuritiesTradeDetails70.AffirmationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AffirmationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AffirmationStatus1Choice.Code, com.tools20022.repository.choice.AffirmationStatus1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails25.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails26.AffirmationStatus, com.tools20022.repository.choice.AffirmationStatus2Choice.Code,
					com.tools20022.repository.choice.AffirmationStatus2Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails27.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails28.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails3.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails11.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails1.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.AffirmationStatus, com.tools20022.repository.choice.AffirmationStatus7Choice.Code, com.tools20022.repository.choice.AffirmationStatus7Choice.Proprietary,
					com.tools20022.repository.msg.StatusAndReason10.AffirmationStatus, com.tools20022.repository.choice.AffirmationStatus6Choice.Affirmed, com.tools20022.repository.choice.AffirmationStatus6Choice.Unaffirmed,
					com.tools20022.repository.choice.AffirmationStatus6Choice.ProprietaryStatus, com.tools20022.repository.choice.Status1Choice.AffirmationStatus, com.tools20022.repository.choice.Status8Choice.AffirmationStatus,
					com.tools20022.repository.choice.Status3Choice.AffirmationStatus, com.tools20022.repository.choice.Status10Choice.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails33.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails37.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails34.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails44.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails40.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails46.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails51.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails56.AffirmationStatus, com.tools20022.repository.choice.AffirmationStatus8Choice.Code, com.tools20022.repository.choice.AffirmationStatus8Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails50.AffirmationStatus, com.tools20022.repository.choice.Status19Choice.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails63.AffirmationStatus, com.tools20022.repository.choice.AffirmationStatus9Choice.Code,
					com.tools20022.repository.choice.AffirmationStatus9Choice.Proprietary, com.tools20022.repository.choice.Status22Choice.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails65.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.AffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails67.AffirmationStatus,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.AffirmationStatus);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AffirmationStatusCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#SecuritiesTradeStatus
	 * SecuritiesTradeStatusReason.SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus2Choice#Unmatched
	 * MatchingStatus2Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#Unmatched
	 * MatchingStatus7Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice#Unmatched
	 * MatchingStatus18Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#DeliveryReturnReason
	 * SettlementDetails50.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#DeliveryReturnReason
	 * SettlementDetails51.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#DeliveryReturnReason
	 * SettlementDetails1.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#DeliveryReturnReason
	 * SettlementDetails19.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus6Choice#Unmatched
	 * MatchingStatus6Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#DeliveryReturnReason
	 * SettlementDetails22.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#DeliveryReturnReason
	 * SettlementDetails35.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#DeliveryReturnReason
	 * SettlementDetails42.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#DeliveryReturnReason
	 * SettlementDetails52.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#Unmatched
	 * MatchingStatus9Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#CancellationPending
	 * CancellationProcessingStatus6Choice.CancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#Rejected
	 * CancellationStatusAndReason.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#Complete
	 * CancellationStatusAndReason.Complete}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#Rejected
	 * CancellationStatusAndReason2.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#Complete
	 * CancellationStatusAndReason2.Complete}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#Pending
	 * CancellationStatusAndReason2.Pending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#PendingSettlement
	 * TransferStatusAndReason.PendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#Unmatched
	 * TransferStatusAndReason.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#InRepair
	 * TransferStatusAndReason.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#Rejected
	 * TransferStatusAndReason.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#PendingSettlement
	 * TransferStatusAndReason2.PendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#Unmatched
	 * TransferStatusAndReason2.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#InRepair
	 * TransferStatusAndReason2.InRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#Rejected
	 * TransferStatusAndReason2.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#FailedSettlement
	 * TransferStatusAndReason2.FailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#Cancelled
	 * TransferStatusAndReason2.Cancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#Reversed
	 * TransferStatusAndReason2.Reversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice#Unmatched
	 * MatchingStatus3Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus4Choice#Unmatched
	 * MatchingStatus4Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus12Choice#Unmatched
	 * MatchingStatus12Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus16Choice#Unmatched
	 * MatchingStatus16Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1#ProcessingStatus
	 * IntraPositionStatusAndReason1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#ProcessingStatus
	 * IntraPositionModification2.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1#ProcessingStatus
	 * IntraPositionModification1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#Reversed
	 * TransferStatus1Choice.Reversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#DeliveryReturnReason
	 * SettlementDetails67.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#DeliveryReturnReason
	 * SettlementDetails68.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice#Unmatched
	 * MatchingStatus20Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#Unmatched
	 * MatchingStatus19Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#DeliveryReturnReason
	 * SettlementDetails81.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus21Choice#Unmatched
	 * MatchingStatus21Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus22Choice#Unmatched
	 * MatchingStatus22Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#DeliveryReturnReason
	 * SettlementDetails83.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#Unmatched
	 * MatchingStatus23Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#DeliveryReturnReason
	 * SettlementDetails93.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#Unmatched
	 * MatchingStatus24Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#Unmatched
	 * MatchingStatus26Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#DeliveryReturnReason
	 * SettlementDetails94.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#Unmatched
	 * MatchingStatus25Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#Reversed
	 * TransferStatus2Choice.Reversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#DeliveryReturnReason
	 * SettlementDetails101.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#Unmatched
	 * MatchingStatus29Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#DeliveryReturnReason
	 * SettlementDetails111.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#DeliveryReturnReason
	 * SettlementDetails112.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice#Unmatched
	 * MatchingStatus32Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice#Unmatched
	 * MatchingStatus30Choice.Unmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#DeliveryReturnReason
	 * SettlementDetails113.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#DeliveryReturnReason
	 * SettlementDetails120.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#DeliveryReturnReason
	 * SettlementDetails119.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#DeliveryReturnReason
	 * SettlementDetails122.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#DeliveryReturnReason
	 * SettlementDetails137.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#DeliveryReturnReason
	 * SettlementDetails132.DeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#DeliveryReturnReason
	 * SettlementDetails138.DeliveryReturnReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MatchingStatus2Choice.Unmatched, com.tools20022.repository.choice.MatchingStatus7Choice.Unmatched,
					com.tools20022.repository.choice.MatchingStatus18Choice.Unmatched, com.tools20022.repository.msg.SettlementDetails50.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails51.DeliveryReturnReason,
					com.tools20022.repository.msg.SettlementDetails1.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails19.DeliveryReturnReason, com.tools20022.repository.choice.MatchingStatus6Choice.Unmatched,
					com.tools20022.repository.msg.SettlementDetails22.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails35.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails42.DeliveryReturnReason,
					com.tools20022.repository.msg.SettlementDetails52.DeliveryReturnReason, com.tools20022.repository.choice.MatchingStatus9Choice.Unmatched,
					com.tools20022.repository.choice.CancellationProcessingStatus6Choice.CancellationPending, com.tools20022.repository.msg.CancellationStatusAndReason.Rejected,
					com.tools20022.repository.msg.CancellationStatusAndReason.Complete, com.tools20022.repository.msg.CancellationStatusAndReason2.Rejected, com.tools20022.repository.msg.CancellationStatusAndReason2.Complete,
					com.tools20022.repository.msg.CancellationStatusAndReason2.Pending, com.tools20022.repository.msg.TransferStatusAndReason.PendingSettlement, com.tools20022.repository.msg.TransferStatusAndReason.Unmatched,
					com.tools20022.repository.msg.TransferStatusAndReason.InRepair, com.tools20022.repository.msg.TransferStatusAndReason.Rejected, com.tools20022.repository.msg.TransferStatusAndReason2.PendingSettlement,
					com.tools20022.repository.msg.TransferStatusAndReason2.Unmatched, com.tools20022.repository.msg.TransferStatusAndReason2.InRepair, com.tools20022.repository.msg.TransferStatusAndReason2.Rejected,
					com.tools20022.repository.msg.TransferStatusAndReason2.FailedSettlement, com.tools20022.repository.msg.TransferStatusAndReason2.Cancelled, com.tools20022.repository.msg.TransferStatusAndReason2.Reversed,
					com.tools20022.repository.choice.MatchingStatus3Choice.Unmatched, com.tools20022.repository.choice.MatchingStatus4Choice.Unmatched, com.tools20022.repository.choice.MatchingStatus12Choice.Unmatched,
					com.tools20022.repository.choice.MatchingStatus16Choice.Unmatched, com.tools20022.repository.msg.IntraPositionStatusAndReason1.ProcessingStatus, com.tools20022.repository.msg.IntraPositionModification2.ProcessingStatus,
					com.tools20022.repository.msg.IntraPositionModification1.ProcessingStatus, com.tools20022.repository.choice.TransferStatus1Choice.Reversed, com.tools20022.repository.msg.SettlementDetails67.DeliveryReturnReason,
					com.tools20022.repository.msg.SettlementDetails68.DeliveryReturnReason, com.tools20022.repository.choice.MatchingStatus20Choice.Unmatched, com.tools20022.repository.choice.MatchingStatus19Choice.Unmatched,
					com.tools20022.repository.msg.SettlementDetails81.DeliveryReturnReason, com.tools20022.repository.choice.MatchingStatus21Choice.Unmatched, com.tools20022.repository.choice.MatchingStatus22Choice.Unmatched,
					com.tools20022.repository.msg.SettlementDetails83.DeliveryReturnReason, com.tools20022.repository.choice.MatchingStatus23Choice.Unmatched, com.tools20022.repository.msg.SettlementDetails93.DeliveryReturnReason,
					com.tools20022.repository.choice.MatchingStatus24Choice.Unmatched, com.tools20022.repository.choice.MatchingStatus26Choice.Unmatched, com.tools20022.repository.msg.SettlementDetails94.DeliveryReturnReason,
					com.tools20022.repository.choice.MatchingStatus25Choice.Unmatched, com.tools20022.repository.choice.TransferStatus2Choice.Reversed, com.tools20022.repository.msg.SettlementDetails101.DeliveryReturnReason,
					com.tools20022.repository.choice.MatchingStatus29Choice.Unmatched, com.tools20022.repository.msg.SettlementDetails111.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails112.DeliveryReturnReason,
					com.tools20022.repository.choice.MatchingStatus32Choice.Unmatched, com.tools20022.repository.choice.MatchingStatus30Choice.Unmatched, com.tools20022.repository.msg.SettlementDetails113.DeliveryReturnReason,
					com.tools20022.repository.msg.SettlementDetails120.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails119.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails122.DeliveryReturnReason,
					com.tools20022.repository.msg.SettlementDetails137.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails132.DeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails138.DeliveryReturnReason);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.SecuritiesTradeStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade which has a specific status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeStatus
	 * SecuritiesTrade.SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade which has a specific status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Specifies the trade which has a specific status.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of an investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#BookingStatus
	 * InvestmentFundTransaction2.BookingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#BookingStatus
	 * InvestmentFundTransaction3.BookingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#BookingStatus
	 * InvestmentFundTransaction4.BookingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction2.BookingStatus, com.tools20022.repository.msg.InvestmentFundTransaction3.BookingStatus,
					com.tools20022.repository.msg.InvestmentFundTransaction4.BookingStatus);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of an investment fund transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}
	};
	/**
	 * Provides the processing status of the replacement request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice#Code
	 * ReplacementProcessingStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus2Choice#Code
	 * ReplacementProcessingStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice#Code
	 * ReplacementProcessingStatus8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus9Choice#Code
	 * ReplacementProcessingStatus9Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the processing status of the replacement request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReplacementProcessingStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReplacementProcessingStatus1Choice.Code, com.tools20022.repository.choice.ReplacementProcessingStatus2Choice.Code,
					com.tools20022.repository.choice.ReplacementProcessingStatus8Choice.Code, com.tools20022.repository.choice.ReplacementProcessingStatus9Choice.Code);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReplacementProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Status of the cancellation of a trade.
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
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#CancellationRequested
	 * CancellationProcessingStatus6Choice.CancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#CancellationCompleted
	 * CancellationProcessingStatus6Choice.CancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus#Status
	 * TransferCancellationStatus.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus2#Status
	 * TransferCancellationStatus2.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the cancellation of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CancellationProcessingStatus6Choice.CancellationRequested, com.tools20022.repository.choice.CancellationProcessingStatus6Choice.CancellationCompleted,
					com.tools20022.repository.msg.TransferCancellationStatus.Status, com.tools20022.repository.msg.TransferCancellationStatus2.Status);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}
	};
	/**
	 * Cancellation right of an investor with respect to an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRight1#Structured
	 * CancellationRight1.Structured}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationRight = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationRight1.Structured);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}
	};
	/**
	 * Status of the transfer is accepted, sent to next party, matched, already
	 * executed, or settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus#Status
	 * TransferInstructionStatus.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus2#Status
	 * TransferInstructionStatus2.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#TransferStatus
	 * TransferStatusAndReason3.TransferStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus3#Status
	 * TransferInstructionStatus3.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#TransferStatus
	 * TransferStatusAndReason4.TransferStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus4#Status
	 * TransferInstructionStatus4.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is accepted, sent to next party, matched, already executed, or settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferInstructionStatus.Status, com.tools20022.repository.msg.TransferInstructionStatus2.Status,
					com.tools20022.repository.msg.TransferStatusAndReason3.TransferStatus, com.tools20022.repository.msg.TransferInstructionStatus3.Status, com.tools20022.repository.msg.TransferStatusAndReason4.TransferStatus,
					com.tools20022.repository.msg.TransferInstructionStatus4.Status);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferStatus";
			definition = "Status of the transfer is accepted, sent to next party, matched, already executed, or settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransferStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of an allegement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode
	 * AllegementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus1Choice#Code
	 * AllegementStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus1Choice#Proprietary
	 * AllegementStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#Status
	 * SecuritiesTradeDetails4.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#Status
	 * SecuritiesTradeDetails17.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus2Choice#Code
	 * AllegementStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus2Choice#Proprietary
	 * AllegementStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#Status
	 * SecuritiesTradeDetails10.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#Status
	 * SecuritiesTradeDetails22.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#Status
	 * SecuritiesTradeDetails23.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#Status
	 * SecuritiesTradeDetails29.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#Status
	 * SecuritiesTradeDetails35.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#Status
	 * SecuritiesTradeDetails42.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#Status
	 * SecuritiesTradeDetails49.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus3Choice#Code
	 * AllegementStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus3Choice#Proprietary
	 * AllegementStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#Status
	 * SecuritiesTradeDetails61.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus4Choice#Code
	 * AllegementStatus4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus4Choice#Proprietary
	 * AllegementStatus4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#Status
	 * SecuritiesTradeDetails68.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#Status
	 * SecuritiesTradeDetails69.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an allegement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllegedStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AllegementStatus1Choice.Code, com.tools20022.repository.choice.AllegementStatus1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.Status, com.tools20022.repository.msg.SecuritiesTradeDetails17.Status, com.tools20022.repository.choice.AllegementStatus2Choice.Code,
					com.tools20022.repository.choice.AllegementStatus2Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails10.Status, com.tools20022.repository.msg.SecuritiesTradeDetails22.Status,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.Status, com.tools20022.repository.msg.SecuritiesTradeDetails29.Status, com.tools20022.repository.msg.SecuritiesTradeDetails35.Status,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.Status, com.tools20022.repository.msg.SecuritiesTradeDetails49.Status, com.tools20022.repository.choice.AllegementStatus3Choice.Code,
					com.tools20022.repository.choice.AllegementStatus3Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails61.Status, com.tools20022.repository.choice.AllegementStatus4Choice.Code,
					com.tools20022.repository.choice.AllegementStatus4Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails68.Status, com.tools20022.repository.msg.SecuritiesTradeDetails69.Status);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllegedStatus";
			definition = "Provides the status of an allegement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AllegementStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of allocation of collateral to cover the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationStatusCode
	 * AllocationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus1Choice#Code
	 * AllocationSatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus1Choice#Proprietary
	 * AllocationSatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#AllocationStatus
	 * Status1Choice.AllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#AllocationStatus
	 * Status8Choice.AllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus2Choice#Code
	 * AllocationSatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus2Choice#Proprietary
	 * AllocationSatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#AllocationStatus
	 * Status3Choice.AllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#AllocationStatus
	 * Status10Choice.AllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus3Choice#Code
	 * AllocationSatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus3Choice#Proprietary
	 * AllocationSatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#AllocationStatus
	 * Status19Choice.AllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#AllocationStatus
	 * Status22Choice.AllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus4Choice#Code
	 * AllocationSatus4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus4Choice#Proprietary
	 * AllocationSatus4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAllocationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of allocation of collateral to cover the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralAllocationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AllocationSatus1Choice.Code, com.tools20022.repository.choice.AllocationSatus1Choice.Proprietary,
					com.tools20022.repository.choice.Status1Choice.AllocationStatus, com.tools20022.repository.choice.Status8Choice.AllocationStatus, com.tools20022.repository.choice.AllocationSatus2Choice.Code,
					com.tools20022.repository.choice.AllocationSatus2Choice.Proprietary, com.tools20022.repository.choice.Status3Choice.AllocationStatus, com.tools20022.repository.choice.Status10Choice.AllocationStatus,
					com.tools20022.repository.choice.AllocationSatus3Choice.Code, com.tools20022.repository.choice.AllocationSatus3Choice.Proprietary, com.tools20022.repository.choice.Status19Choice.AllocationStatus,
					com.tools20022.repository.choice.Status22Choice.AllocationStatus, com.tools20022.repository.choice.AllocationSatus4Choice.Code, com.tools20022.repository.choice.AllocationSatus4Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AllocationStatusCode.mmObject();
		}
	};
	/**
	 * Specifies additional information about the status of the repurchase
	 * agreement call processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode
	 * RepoCallRequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice#Code
	 * RepoCallRequestStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice#Proprietary
	 * RepoCallRequestStatus1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#RepoCallRequestStatus
	 * Status1Choice.RepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#RepoCallRequestStatus
	 * Status8Choice.RepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus3Choice#Code
	 * RepoCallRequestStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus3Choice#Proprietary
	 * RepoCallRequestStatus3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#RepoCallRequestStatus
	 * Status3Choice.RepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#RepoCallRequestStatus
	 * Status10Choice.RepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice#Code
	 * RepoCallRequestStatus8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice#Proprietary
	 * RepoCallRequestStatus8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#RepoCallRequestStatus
	 * Status19Choice.RepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#RepoCallRequestStatus
	 * Status22Choice.RepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus10Choice#Code
	 * RepoCallRequestStatus10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus10Choice#Proprietary
	 * RepoCallRequestStatus10Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the status of the repurchase agreement call processed instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RepoCallRequestStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RepoCallRequestStatus1Choice.Code, com.tools20022.repository.choice.RepoCallRequestStatus1Choice.Proprietary,
					com.tools20022.repository.choice.Status1Choice.RepoCallRequestStatus, com.tools20022.repository.choice.Status8Choice.RepoCallRequestStatus, com.tools20022.repository.choice.RepoCallRequestStatus3Choice.Code,
					com.tools20022.repository.choice.RepoCallRequestStatus3Choice.Proprietary, com.tools20022.repository.choice.Status3Choice.RepoCallRequestStatus, com.tools20022.repository.choice.Status10Choice.RepoCallRequestStatus,
					com.tools20022.repository.choice.RepoCallRequestStatus8Choice.Code, com.tools20022.repository.choice.RepoCallRequestStatus8Choice.Proprietary, com.tools20022.repository.choice.Status19Choice.RepoCallRequestStatus,
					com.tools20022.repository.choice.Status22Choice.RepoCallRequestStatus, com.tools20022.repository.choice.RepoCallRequestStatus10Choice.Code, com.tools20022.repository.choice.RepoCallRequestStatus10Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Specifies additional information about the status of the repurchase agreement call processed instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RepoCallRequestStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of the securities settlement condition modification
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus1Choice#Code
	 * SettlementConditionModificationStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#SettlementConditionModificationStatus
	 * Status1Choice.SettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#SettlementConditionModificationStatus
	 * Status8Choice.SettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice#Code
	 * SettlementConditionModificationStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#SettlementConditionModificationStatus
	 * Status3Choice.SettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#SettlementConditionModificationStatus
	 * Status10Choice.SettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#SettlementConditionModificationStatus
	 * Status19Choice.SettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus3Choice#Code
	 * SettlementConditionModificationStatus3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#SettlementConditionModificationStatus
	 * Status22Choice.SettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice#Code
	 * SettlementConditionModificationStatus4Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementConditionModificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the securities settlement condition modification request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementConditionModificationStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementConditionModificationStatus1Choice.Code, com.tools20022.repository.choice.Status1Choice.SettlementConditionModificationStatus,
					com.tools20022.repository.choice.Status8Choice.SettlementConditionModificationStatus, com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice.Code,
					com.tools20022.repository.choice.Status3Choice.SettlementConditionModificationStatus, com.tools20022.repository.choice.Status10Choice.SettlementConditionModificationStatus,
					com.tools20022.repository.choice.Status19Choice.SettlementConditionModificationStatus, com.tools20022.repository.choice.SettlementConditionModificationStatus3Choice.Code,
					com.tools20022.repository.choice.Status22Choice.SettlementConditionModificationStatus, com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice.Code);
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of the securities settlement condition modification request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the matching status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingProcessCode
	 * MatchingProcessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the matching status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MatchingProcess = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchingProcess";
			definition = "Specifies the matching status of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MatchingProcessCode.mmObject();
		}
	};
	/**
	 * Transfer operation for which a status is provided
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Status
	 * SecuritiesTransfer.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer operation for which a status is provided"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTransfer";
			definition = "Transfer operation for which a status is provided";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatus";
				definition = "Status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTransfer.Status,
						com.tools20022.repository.entity.SecuritiesTradeStatusReason.SecuritiesTradeStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MatchingStatus2Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus7Choice.Proprietary,
						com.tools20022.repository.choice.SettlementStatus2Choice.Pending, com.tools20022.repository.choice.SettlementStatus2Choice.Failing, com.tools20022.repository.choice.SettlementStatus2Choice.Proprietary,
						com.tools20022.repository.choice.SettlementStatus7Choice.Pending, com.tools20022.repository.choice.SettlementStatus7Choice.Failing, com.tools20022.repository.choice.SettlementStatus7Choice.Proprietary,
						com.tools20022.repository.choice.MatchingStatus18Choice.Proprietary, com.tools20022.repository.choice.SettlementStatus13Choice.Pending, com.tools20022.repository.choice.SettlementStatus13Choice.Failing,
						com.tools20022.repository.choice.SettlementStatus13Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus6Choice.Proprietary, com.tools20022.repository.choice.SettlementStatus4Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus4Choice.Failing, com.tools20022.repository.choice.SettlementStatus4Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus9Choice.ProprietaryStatus,
						com.tools20022.repository.choice.CancellationProcessingStatus6Choice.ProprietaryStatus, com.tools20022.repository.msg.CancellationStatusAndReason.Status,
						com.tools20022.repository.msg.CancellationStatusAndReason2.Status, com.tools20022.repository.msg.TransferStatusAndReason.Status, com.tools20022.repository.msg.TransferStatusAndReason2.Status,
						com.tools20022.repository.choice.MatchingStatus3Choice.Proprietary, com.tools20022.repository.choice.RepoCallRequestStatus2Choice.Proprietary, com.tools20022.repository.msg.AdditionalQueryParameters1.Status,
						com.tools20022.repository.msg.AdditionalQueryParameters3.Status, com.tools20022.repository.choice.MatchingStatus4Choice.Proprietary, com.tools20022.repository.choice.RepoCallRequestStatus4Choice.Proprietary,
						com.tools20022.repository.choice.MatchingStatus12Choice.Proprietary, com.tools20022.repository.choice.SettlementStatus10Choice.Pending, com.tools20022.repository.choice.SettlementStatus10Choice.Failing,
						com.tools20022.repository.choice.SettlementStatus10Choice.Proprietary, com.tools20022.repository.choice.RepoCallRequestStatus5Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus16Choice.Proprietary,
						com.tools20022.repository.choice.SettlementStatus12Choice.Pending, com.tools20022.repository.choice.SettlementStatus12Choice.Failing, com.tools20022.repository.choice.SettlementStatus12Choice.Proprietary,
						com.tools20022.repository.choice.RepoCallRequestStatus6Choice.Proprietary, com.tools20022.repository.msg.AdditionalQueryParameters2.Status, com.tools20022.repository.msg.AdditionalQueryParameters4.Status,
						com.tools20022.repository.msg.AdditionalQueryParameters5.Status, com.tools20022.repository.msg.AdditionalQueryParameters6.Status, com.tools20022.repository.choice.SettlementStatus9Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus9Choice.Failing, com.tools20022.repository.choice.SettlementStatus9Choice.Proprietary, com.tools20022.repository.choice.SettlementStatus15Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus15Choice.Failing, com.tools20022.repository.choice.SettlementStatus15Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus34Choice.Proprietary,
						com.tools20022.repository.msg.IntraPositionStatusAndReason1.SettlementStatus, com.tools20022.repository.msg.IntraPositionStatusAndReason1.Settled, com.tools20022.repository.msg.IntraPositionQueryStatus1.Type,
						com.tools20022.repository.choice.TransferStatus1Choice.Status, com.tools20022.repository.msg.AdditionalQueryParameters7.Status, com.tools20022.repository.choice.MatchingStatus20Choice.Proprietary,
						com.tools20022.repository.choice.MatchingStatus19Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus37Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus21Choice.Proprietary,
						com.tools20022.repository.msg.AdditionalQueryParameters8.Status, com.tools20022.repository.choice.ProcessingStatus42Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus22Choice.Proprietary,
						com.tools20022.repository.choice.MatchingStatus23Choice.ProprietaryStatus, com.tools20022.repository.msg.AdditionalQueryParameters9.Status, com.tools20022.repository.msg.AdditionalQueryParameters10.Status,
						com.tools20022.repository.choice.SettlementStatus16Choice.Pending, com.tools20022.repository.choice.SettlementStatus16Choice.Failing, com.tools20022.repository.choice.SettlementStatus16Choice.Proprietary,
						com.tools20022.repository.choice.ProcessingStatus48Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus24Choice.Proprietary, com.tools20022.repository.choice.SettlementStatus17Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus17Choice.Failing, com.tools20022.repository.choice.SettlementStatus17Choice.Proprietary, com.tools20022.repository.msg.AdditionalQueryParameters11.Status,
						com.tools20022.repository.choice.MatchingStatus26Choice.Proprietary, com.tools20022.repository.choice.RepoCallRequestStatus7Choice.Proprietary, com.tools20022.repository.choice.SettlementStatus18Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus18Choice.Failing, com.tools20022.repository.choice.SettlementStatus18Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus25Choice.Proprietary,
						com.tools20022.repository.choice.TransferStatus2Choice.Status, com.tools20022.repository.choice.Status21Choice.Status, com.tools20022.repository.choice.SettlementStatus21Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus21Choice.Failing, com.tools20022.repository.choice.SettlementStatus21Choice.Proprietary, com.tools20022.repository.choice.RepoCallRequestStatus9Choice.Proprietary,
						com.tools20022.repository.choice.MatchingStatus29Choice.Proprietary, com.tools20022.repository.msg.AdditionalQueryParameters12.Status, com.tools20022.repository.choice.SettlementStatus20Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus20Choice.Failing, com.tools20022.repository.choice.SettlementStatus20Choice.Proprietary, com.tools20022.repository.choice.ProcessingStatus63Choice.Proprietary,
						com.tools20022.repository.choice.MatchingStatus32Choice.Proprietary, com.tools20022.repository.choice.MatchingStatus30Choice.Proprietary, com.tools20022.repository.choice.SettlementStatus22Choice.Pending,
						com.tools20022.repository.choice.SettlementStatus22Choice.Failing, com.tools20022.repository.choice.SettlementStatus22Choice.Proprietary);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.MatchingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.AffirmationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.Reason, com.tools20022.repository.entity.SecuritiesTradeStatus.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.TransactionStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.ReplacementProcessingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.CancellationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.CancellationRight, com.tools20022.repository.entity.SecuritiesTradeStatus.TransferStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.AllegedStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.CollateralAllocationStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.RepoCallRequestStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.SettlementConditionModificationStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.MatchingProcess,
						com.tools20022.repository.entity.SecuritiesTradeStatus.RelatedSecuritiesTransfer);
				derivationComponent_lazy = () -> Arrays.asList(MatchingStatus2Choice.mmObject(), MatchingStatus7Choice.mmObject(), SettlementStatus2Choice.mmObject(), SettlementStatus7Choice.mmObject(), MatchingStatus18Choice.mmObject(),
						SettlementStatus13Choice.mmObject(), MatchingStatus1Choice.mmObject(), AffirmationStatus1Choice.mmObject(), MatchingStatus5Choice.mmObject(), AffirmationStatus2Choice.mmObject(), MatchingStatus6Choice.mmObject(),
						SettlementStatus4Choice.mmObject(), AffirmationStatus7Choice.mmObject(), AffirmationStatus6Choice.mmObject(), InstructionProcessingStatus2Choice.mmObject(), MatchingStatus9Choice.mmObject(),
						CancellationProcessingStatus6Choice.mmObject(), MatchingStatus8Choice.mmObject(), CancellationRight1.mmObject(), TransferCancellationStatus.mmObject(), CancellationStatusAndReason.mmObject(),
						TransferCancellationStatus2.mmObject(), CancellationStatusAndReason2.mmObject(), TransferInstructionStatus.mmObject(), TransferStatusAndReason.mmObject(), TransferInstructionStatus2.mmObject(),
						TransferStatusAndReason2.mmObject(), TradeTransactionStatusAndReason1.mmObject(), TradeTransactionStatusAndReason2.mmObject(), MatchingStatus3Choice.mmObject(), RepoCallRequestStatus2Choice.mmObject(),
						AllegementStatus1Choice.mmObject(), AllocationSatus1Choice.mmObject(), RepoCallRequestStatus1Choice.mmObject(), CancellationProcessingStatus1Choice.mmObject(), AdditionalQueryParameters1.mmObject(),
						SettlementStatus5Choice.mmObject(), AdditionalQueryParameters3.mmObject(), MatchingStatus4Choice.mmObject(), RepoCallRequestStatus4Choice.mmObject(), MatchingStatus12Choice.mmObject(),
						SettlementStatus10Choice.mmObject(), RepoCallRequestStatus5Choice.mmObject(), MatchingStatus16Choice.mmObject(), SettlementStatus12Choice.mmObject(), RepoCallRequestStatus6Choice.mmObject(),
						AllegementStatus2Choice.mmObject(), AllocationSatus2Choice.mmObject(), RepoCallRequestStatus3Choice.mmObject(), InstructionProcessingStatus5Choice.mmObject(), CancellationProcessingStatus2Choice.mmObject(),
						AdditionalQueryParameters2.mmObject(), SettlementStatus6Choice.mmObject(), AdditionalQueryParameters4.mmObject(), AdditionalQueryParameters5.mmObject(), AdditionalQueryParameters6.mmObject(),
						SettlementStatus9Choice.mmObject(), SettlementStatus15Choice.mmObject(), CancellationProcessingStatus3Choice.mmObject(), IntraPositionStatusAndReason1.mmObject(), IntraPositionStatusType1.mmObject(),
						IntraPositionQueryStatus1.mmObject(), TransferStatusAndReason3.mmObject(), TransferStatus1Choice.mmObject(), TransferInstructionStatus3.mmObject(), AdditionalQueryParameters7.mmObject(),
						MatchingStatus20Choice.mmObject(), MatchingStatus19Choice.mmObject(), MatchingStatus21Choice.mmObject(), AdditionalQueryParameters8.mmObject(), MatchingStatus22Choice.mmObject(), ProcessingStatus43Choice.mmObject(),
						MatchingStatus23Choice.mmObject(), AdditionalQueryParameters9.mmObject(), AdditionalQueryParameters10.mmObject(), SettlementStatus16Choice.mmObject(), MatchingStatus24Choice.mmObject(),
						SettlementStatus17Choice.mmObject(), AdditionalQueryParameters11.mmObject(), MatchingStatus26Choice.mmObject(), RepoCallRequestStatus7Choice.mmObject(), SettlementStatus18Choice.mmObject(),
						RepoCallRequestStatus8Choice.mmObject(), AffirmationStatus8Choice.mmObject(), MatchingStatus27Choice.mmObject(), MatchingStatus25Choice.mmObject(), InstructionProcessingStatus23Choice.mmObject(),
						AllocationSatus3Choice.mmObject(), AllegementStatus3Choice.mmObject(), CancellationProcessingStatus7Choice.mmObject(), SettlementStatus19Choice.mmObject(), CancellationStatusAndReason3.mmObject(),
						TransferStatusAndReason4.mmObject(), TransferInstructionStatus4.mmObject(), TransferStatus2Choice.mmObject(), SettlementStatus21Choice.mmObject(), RepoCallRequestStatus9Choice.mmObject(),
						MatchingStatus29Choice.mmObject(), AdditionalQueryParameters12.mmObject(), SettlementStatus20Choice.mmObject(), MatchingStatus32Choice.mmObject(), AffirmationStatus9Choice.mmObject(),
						MatchingStatus28Choice.mmObject(), CancellationProcessingStatus8Choice.mmObject(), RepoCallRequestStatus10Choice.mmObject(), InstructionProcessingStatus26Choice.mmObject(), SettlementStatus25Choice.mmObject(),
						AllocationSatus4Choice.mmObject(), MatchingStatus30Choice.mmObject(), SettlementStatus22Choice.mmObject(), AllegementStatus4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}