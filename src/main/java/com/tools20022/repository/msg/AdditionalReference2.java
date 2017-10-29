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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.PartyIdentification1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * References a related message or provides another reference, such as a pool
 * reference, linking a set of messages. The party which issued the related
 * reference may be the Sender of the referenced message or a party other than
 * the Sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference2#Reference
 * AdditionalReference2.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#ReferenceIssuer
 * AdditionalReference2.ReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#MessageName
 * AdditionalReference2.MessageName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#PreviousReference
 * ReversalOfTransferInConfirmation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#PoolReference
 * ReversalOfTransferInConfirmation.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#RelatedReference
 * ReversalOfTransferInConfirmation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#PreviousReference
 * ReversalOfTransferInConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#PoolReference
 * ReversalOfTransferInConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#RelatedReference
 * ReversalOfTransferInConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation#PreviousReference
 * ReversalOfTransferOutConfirmation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation#PoolReference
 * ReversalOfTransferOutConfirmation.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation#RelatedReference
 * ReversalOfTransferOutConfirmation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#PreviousReference
 * ReversalOfTransferOutConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#PoolReference
 * ReversalOfTransferOutConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#RelatedReference
 * ReversalOfTransferOutConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationInstruction#PreviousReference
 * TransferInCancellationInstruction.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationInstruction#PoolReference
 * TransferInCancellationInstruction.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationInstruction#RelatedReference
 * TransferInCancellationInstruction.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#PreviousReference
 * TransferInCancellationRequestV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#PoolReference
 * TransferInCancellationRequestV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#RelatedReference
 * TransferInCancellationRequestV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#RelatedReference
 * TransferInConfirmation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#PoolReference
 * TransferInConfirmation.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#PreviousReference
 * TransferInConfirmation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#RelatedReference
 * TransferInConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#PoolReference
 * TransferInConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#PreviousReference
 * TransferInConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#PoolReference
 * TransferInConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#PreviousReference
 * TransferInConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#RelatedReference
 * TransferInConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#PoolReference
 * TransferInConfirmationV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#PreviousReference
 * TransferInConfirmationV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#RelatedReference
 * TransferInConfirmationV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#PoolReference
 * TransferInInstruction.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#PreviousReference
 * TransferInInstruction.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#RelatedReference
 * TransferInInstruction.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#PoolReference
 * TransferInInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#PreviousReference
 * TransferInInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#RelatedReference
 * TransferInInstructionV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#PoolReference
 * TransferInInstructionV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#PreviousReference
 * TransferInInstructionV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#RelatedReference
 * TransferInInstructionV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#PoolReference
 * TransferInInstructionV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#PreviousReference
 * TransferInInstructionV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#RelatedReference
 * TransferInInstructionV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#PreviousReference
 * TransferOutCancellationInstruction.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#PoolReference
 * TransferOutCancellationInstruction.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#RelatedReference
 * TransferOutCancellationInstruction.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#PreviousReference
 * TransferOutCancellationRequestV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#PoolReference
 * TransferOutCancellationRequestV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#RelatedReference
 * TransferOutCancellationRequestV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#RelatedReference
 * TransferOutConfirmation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#PoolReference
 * TransferOutConfirmation.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#PreviousReference
 * TransferOutConfirmation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#RelatedReference
 * TransferOutConfirmationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#PoolReference
 * TransferOutConfirmationV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#PreviousReference
 * TransferOutConfirmationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#PoolReference
 * TransferOutConfirmationV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#PreviousReference
 * TransferOutConfirmationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#RelatedReference
 * TransferOutConfirmationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#PoolReference
 * TransferOutConfirmationV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#PreviousReference
 * TransferOutConfirmationV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#RelatedReference
 * TransferOutConfirmationV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#PoolReference
 * TransferOutInstruction.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#PreviousReference
 * TransferOutInstruction.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#RelatedReference
 * TransferOutInstruction.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#PoolReference
 * TransferOutInstructionV02.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#PreviousReference
 * TransferOutInstructionV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#RelatedReference
 * TransferOutInstructionV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#PoolReference
 * TransferOutInstructionV03.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#PreviousReference
 * TransferOutInstructionV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#RelatedReference
 * TransferOutInstructionV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#PoolReference
 * TransferOutInstructionV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#PreviousReference
 * TransferOutInstructionV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#RelatedReference
 * TransferOutInstructionV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#PreviousReference
 * AccountingStatementOfHoldings.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#RelatedReference
 * AccountingStatementOfHoldings.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#PreviousReference
 * AccountingStatementOfHoldingsV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#RelatedReference
 * AccountingStatementOfHoldingsV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#PreviousReference
 * CustodyStatementOfHoldings.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#RelatedReference
 * CustodyStatementOfHoldings.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#PreviousReference
 * CustodyStatementOfHoldingsV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#RelatedReference
 * CustodyStatementOfHoldingsV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation#PreviousReference
 * AccountingStatementOfHoldingsCancellation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation#RelatedReference
 * AccountingStatementOfHoldingsCancellation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#PreviousReference
 * AccountingStatementOfHoldingsCancellationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#RelatedReference
 * AccountingStatementOfHoldingsCancellationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#PreviousReference
 * CustodyStatementOfHoldingsCancellation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#RelatedReference
 * CustodyStatementOfHoldingsCancellation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#PreviousReference
 * CustodyStatementOfHoldingsCancellationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#RelatedReference
 * CustodyStatementOfHoldingsCancellationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejection#RelatedReference
 * SecuritiesMessageRejection.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#PreviousReference
 * StatementOfInvestmentFundTransactionsCancellation.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#RelatedReference
 * StatementOfInvestmentFundTransactionsCancellation.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#PreviousReference
 * StatementOfInvestmentFundTransactionsCancellationV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#RelatedReference
 * StatementOfInvestmentFundTransactionsCancellationV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#PreviousReference
 * StatementOfInvestmentFundTransactions.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#RelatedReference
 * StatementOfInvestmentFundTransactions.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#PreviousReference
 * StatementOfInvestmentFundTransactionsV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#RelatedReference
 * StatementOfInvestmentFundTransactionsV02.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReport#RelatedReference
 * TransferCancellationStatusReport.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReport#OtherReference
 * TransferCancellationStatusReport.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#CounterpartyReference
 * TransferCancellationStatusReportV03.CounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#RelatedReference
 * TransferInstructionStatusReport.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#OtherReference
 * TransferInstructionStatusReport.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#CounterpartyReference
 * TransferInstructionStatusReportV03.CounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#PoolReference
 * TransferInConfirmationV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#PreviousReference
 * TransferInConfirmationV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#RelatedReference
 * TransferInConfirmationV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#CounterpartyReference
 * TransferInstructionStatusReportV04.CounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#PoolReference
 * TransferOutInstructionV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#PreviousReference
 * TransferOutInstructionV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#RelatedReference
 * TransferOutInstructionV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#CounterpartyReference
 * TransferCancellationStatusReportV04.CounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#PoolReference
 * TransferInInstructionV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#PreviousReference
 * TransferInInstructionV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#RelatedReference
 * TransferInInstructionV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#PoolReference
 * TransferOutConfirmationV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#PreviousReference
 * TransferOutConfirmationV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#RelatedReference
 * TransferOutConfirmationV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#PreviousReference
 * StatementOfInvestmentFundTransactionsV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#RelatedReference
 * StatementOfInvestmentFundTransactionsV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#PreviousReference
 * StatementOfInvestmentFundTransactionsCancellationV03.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#RelatedReference
 * StatementOfInvestmentFundTransactionsCancellationV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#PoolReference
 * TransferInInstructionV06.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#PreviousReference
 * TransferInInstructionV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#RelatedReference
 * TransferInInstructionV06.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#PoolReference
 * TransferOutConfirmationV06.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#PreviousReference
 * TransferOutConfirmationV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#RelatedReference
 * TransferOutConfirmationV06.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#PoolReference
 * TransferOutInstructionV06.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#PreviousReference
 * TransferOutInstructionV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#RelatedReference
 * TransferOutInstructionV06.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#PoolReference
 * TransferInConfirmationV06.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#PreviousReference
 * TransferInConfirmationV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#RelatedReference
 * TransferInConfirmationV06.RelatedReference}</li>
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
 * "AdditionalReference2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * </ul>
 */
public class AdditionalReference2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Business reference of a message assigned by the party issuing the
	 * message. This reference must be unique amongst all messages of the same
	 * name sent by the same party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Issuer of the reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
	 * PartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer of the reference."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReferenceIssuer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PartyIdentification1Choice.mmObject();
		}
	};
	/**
	 * Name of a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference2.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of a message.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference2.Reference, com.tools20022.repository.msg.AdditionalReference2.ReferenceIssuer,
						com.tools20022.repository.msg.AdditionalReference2.MessageName);
				trace_lazy = () -> GenericIdentification.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation.PreviousReference, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation.PoolReference,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation.RelatedReference, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02.PreviousReference,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02.PoolReference, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02.RelatedReference,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation.PreviousReference, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation.PoolReference,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation.RelatedReference, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02.PreviousReference,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02.PoolReference, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02.RelatedReference,
						com.tools20022.repository.area.sese.TransferInCancellationInstruction.PreviousReference, com.tools20022.repository.area.sese.TransferInCancellationInstruction.PoolReference,
						com.tools20022.repository.area.sese.TransferInCancellationInstruction.RelatedReference, com.tools20022.repository.area.sese.TransferInCancellationRequestV02.PreviousReference,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV02.PoolReference, com.tools20022.repository.area.sese.TransferInCancellationRequestV02.RelatedReference,
						com.tools20022.repository.area.sese.TransferInConfirmation.RelatedReference, com.tools20022.repository.area.sese.TransferInConfirmation.PoolReference,
						com.tools20022.repository.area.sese.TransferInConfirmation.PreviousReference, com.tools20022.repository.area.sese.TransferInConfirmationV02.RelatedReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV02.PoolReference, com.tools20022.repository.area.sese.TransferInConfirmationV02.PreviousReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV03.PoolReference, com.tools20022.repository.area.sese.TransferInConfirmationV03.PreviousReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV03.RelatedReference, com.tools20022.repository.area.sese.TransferInConfirmationV04.PoolReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV04.PreviousReference, com.tools20022.repository.area.sese.TransferInConfirmationV04.RelatedReference,
						com.tools20022.repository.area.sese.TransferInInstruction.PoolReference, com.tools20022.repository.area.sese.TransferInInstruction.PreviousReference,
						com.tools20022.repository.area.sese.TransferInInstruction.RelatedReference, com.tools20022.repository.area.sese.TransferInInstructionV02.PoolReference,
						com.tools20022.repository.area.sese.TransferInInstructionV02.PreviousReference, com.tools20022.repository.area.sese.TransferInInstructionV02.RelatedReference,
						com.tools20022.repository.area.sese.TransferInInstructionV03.PoolReference, com.tools20022.repository.area.sese.TransferInInstructionV03.PreviousReference,
						com.tools20022.repository.area.sese.TransferInInstructionV03.RelatedReference, com.tools20022.repository.area.sese.TransferInInstructionV04.PoolReference,
						com.tools20022.repository.area.sese.TransferInInstructionV04.PreviousReference, com.tools20022.repository.area.sese.TransferInInstructionV04.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutCancellationInstruction.PreviousReference, com.tools20022.repository.area.sese.TransferOutCancellationInstruction.PoolReference,
						com.tools20022.repository.area.sese.TransferOutCancellationInstruction.RelatedReference, com.tools20022.repository.area.sese.TransferOutCancellationRequestV02.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV02.PoolReference, com.tools20022.repository.area.sese.TransferOutCancellationRequestV02.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutConfirmation.RelatedReference, com.tools20022.repository.area.sese.TransferOutConfirmation.PoolReference,
						com.tools20022.repository.area.sese.TransferOutConfirmation.PreviousReference, com.tools20022.repository.area.sese.TransferOutConfirmationV02.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV02.PoolReference, com.tools20022.repository.area.sese.TransferOutConfirmationV02.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV03.PoolReference, com.tools20022.repository.area.sese.TransferOutConfirmationV03.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV03.RelatedReference, com.tools20022.repository.area.sese.TransferOutConfirmationV04.PoolReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV04.PreviousReference, com.tools20022.repository.area.sese.TransferOutConfirmationV04.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutInstruction.PoolReference, com.tools20022.repository.area.sese.TransferOutInstruction.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutInstruction.RelatedReference, com.tools20022.repository.area.sese.TransferOutInstructionV02.PoolReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV02.PreviousReference, com.tools20022.repository.area.sese.TransferOutInstructionV02.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV03.PoolReference, com.tools20022.repository.area.sese.TransferOutInstructionV03.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV03.RelatedReference, com.tools20022.repository.area.sese.TransferOutInstructionV04.PoolReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV04.PreviousReference, com.tools20022.repository.area.sese.TransferOutInstructionV04.RelatedReference,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldings.PreviousReference, com.tools20022.repository.area.semt.AccountingStatementOfHoldings.RelatedReference,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02.PreviousReference, com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02.RelatedReference,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldings.PreviousReference, com.tools20022.repository.area.semt.CustodyStatementOfHoldings.RelatedReference,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.PreviousReference, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.RelatedReference,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation.PreviousReference, com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation.RelatedReference,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02.PreviousReference, com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02.RelatedReference,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation.PreviousReference, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation.RelatedReference,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02.PreviousReference, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02.RelatedReference,
						com.tools20022.repository.area.semt.SecuritiesMessageRejection.RelatedReference, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.PreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.RelatedReference, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02.PreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02.RelatedReference, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions.PreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions.RelatedReference, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02.PreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02.RelatedReference, com.tools20022.repository.area.sese.TransferCancellationStatusReport.RelatedReference,
						com.tools20022.repository.area.sese.TransferCancellationStatusReport.OtherReference, com.tools20022.repository.area.sese.TransferCancellationStatusReportV03.CounterpartyReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReport.RelatedReference, com.tools20022.repository.area.sese.TransferInstructionStatusReport.OtherReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV03.CounterpartyReference, com.tools20022.repository.area.sese.TransferInConfirmationV05.PoolReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV05.PreviousReference, com.tools20022.repository.area.sese.TransferInConfirmationV05.RelatedReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.CounterpartyReference, com.tools20022.repository.area.sese.TransferOutInstructionV05.PoolReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV05.PreviousReference, com.tools20022.repository.area.sese.TransferOutInstructionV05.RelatedReference,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV04.CounterpartyReference, com.tools20022.repository.area.sese.TransferInInstructionV05.PoolReference,
						com.tools20022.repository.area.sese.TransferInInstructionV05.PreviousReference, com.tools20022.repository.area.sese.TransferInInstructionV05.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV05.PoolReference, com.tools20022.repository.area.sese.TransferOutConfirmationV05.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV05.RelatedReference, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03.PreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03.RelatedReference, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.PreviousReference,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.RelatedReference, com.tools20022.repository.area.sese.TransferInInstructionV06.PoolReference,
						com.tools20022.repository.area.sese.TransferInInstructionV06.PreviousReference, com.tools20022.repository.area.sese.TransferInInstructionV06.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV06.PoolReference, com.tools20022.repository.area.sese.TransferOutConfirmationV06.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV06.RelatedReference, com.tools20022.repository.area.sese.TransferOutInstructionV06.PoolReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV06.PreviousReference, com.tools20022.repository.area.sese.TransferOutInstructionV06.RelatedReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV06.PoolReference, com.tools20022.repository.area.sese.TransferInConfirmationV06.PreviousReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV06.RelatedReference);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference2";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
			}
		});
		return mmObject_lazy.get();
	}
}