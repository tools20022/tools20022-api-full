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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.PartyIdentification1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmReference
 * AdditionalReference2.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmReferenceIssuer
 * AdditionalReference2.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference2#mmMessageName
 * AdditionalReference2.mmMessageName}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#mmPreviousReference
 * ReversalOfTransferInConfirmation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#mmPoolReference
 * ReversalOfTransferInConfirmation.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation#mmRelatedReference
 * ReversalOfTransferInConfirmation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#mmPreviousReference
 * ReversalOfTransferInConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#mmPoolReference
 * ReversalOfTransferInConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#mmRelatedReference
 * ReversalOfTransferInConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation#mmPreviousReference
 * ReversalOfTransferOutConfirmation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation#mmPoolReference
 * ReversalOfTransferOutConfirmation.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation#mmRelatedReference
 * ReversalOfTransferOutConfirmation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#mmPreviousReference
 * ReversalOfTransferOutConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#mmPoolReference
 * ReversalOfTransferOutConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#mmRelatedReference
 * ReversalOfTransferOutConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationInstruction#mmPreviousReference
 * TransferInCancellationInstruction.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationInstruction#mmPoolReference
 * TransferInCancellationInstruction.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationInstruction#mmRelatedReference
 * TransferInCancellationInstruction.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#mmPreviousReference
 * TransferInCancellationRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#mmPoolReference
 * TransferInCancellationRequestV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#mmRelatedReference
 * TransferInCancellationRequestV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#mmRelatedReference
 * TransferInConfirmation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#mmPoolReference
 * TransferInConfirmation.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#mmPreviousReference
 * TransferInConfirmation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#mmRelatedReference
 * TransferInConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#mmPoolReference
 * TransferInConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#mmPreviousReference
 * TransferInConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#mmPoolReference
 * TransferInConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#mmPreviousReference
 * TransferInConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#mmRelatedReference
 * TransferInConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmPoolReference
 * TransferInConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmPreviousReference
 * TransferInConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmRelatedReference
 * TransferInConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#mmPoolReference
 * TransferInInstruction.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#mmPreviousReference
 * TransferInInstruction.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#mmRelatedReference
 * TransferInInstruction.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#mmPoolReference
 * TransferInInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#mmPreviousReference
 * TransferInInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#mmRelatedReference
 * TransferInInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#mmPoolReference
 * TransferInInstructionV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#mmPreviousReference
 * TransferInInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#mmRelatedReference
 * TransferInInstructionV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#mmPoolReference
 * TransferInInstructionV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#mmPreviousReference
 * TransferInInstructionV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#mmRelatedReference
 * TransferInInstructionV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#mmPreviousReference
 * TransferOutCancellationInstruction.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#mmPoolReference
 * TransferOutCancellationInstruction.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction#mmRelatedReference
 * TransferOutCancellationInstruction.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#mmPreviousReference
 * TransferOutCancellationRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#mmPoolReference
 * TransferOutCancellationRequestV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#mmRelatedReference
 * TransferOutCancellationRequestV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#mmRelatedReference
 * TransferOutConfirmation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#mmPoolReference
 * TransferOutConfirmation.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#mmPreviousReference
 * TransferOutConfirmation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#mmRelatedReference
 * TransferOutConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#mmPoolReference
 * TransferOutConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#mmPreviousReference
 * TransferOutConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#mmPoolReference
 * TransferOutConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#mmPreviousReference
 * TransferOutConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#mmRelatedReference
 * TransferOutConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#mmPoolReference
 * TransferOutConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#mmPreviousReference
 * TransferOutConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#mmRelatedReference
 * TransferOutConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#mmPoolReference
 * TransferOutInstruction.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#mmPreviousReference
 * TransferOutInstruction.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#mmRelatedReference
 * TransferOutInstruction.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#mmPoolReference
 * TransferOutInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#mmPreviousReference
 * TransferOutInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#mmRelatedReference
 * TransferOutInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#mmPoolReference
 * TransferOutInstructionV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#mmPreviousReference
 * TransferOutInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#mmRelatedReference
 * TransferOutInstructionV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#mmPoolReference
 * TransferOutInstructionV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#mmPreviousReference
 * TransferOutInstructionV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#mmRelatedReference
 * TransferOutInstructionV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#mmPreviousReference
 * AccountingStatementOfHoldings.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#mmRelatedReference
 * AccountingStatementOfHoldings.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmPreviousReference
 * AccountingStatementOfHoldingsV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmRelatedReference
 * AccountingStatementOfHoldingsV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmPreviousReference
 * CustodyStatementOfHoldings.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmRelatedReference
 * CustodyStatementOfHoldings.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmPreviousReference
 * CustodyStatementOfHoldingsV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmRelatedReference
 * CustodyStatementOfHoldingsV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation#mmPreviousReference
 * AccountingStatementOfHoldingsCancellation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation#mmRelatedReference
 * AccountingStatementOfHoldingsCancellation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmPreviousReference
 * AccountingStatementOfHoldingsCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmRelatedReference
 * AccountingStatementOfHoldingsCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmPreviousReference
 * CustodyStatementOfHoldingsCancellation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmRelatedReference
 * CustodyStatementOfHoldingsCancellation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmPreviousReference
 * CustodyStatementOfHoldingsCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmRelatedReference
 * CustodyStatementOfHoldingsCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejection#mmRelatedReference
 * SecuritiesMessageRejection.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#mmPreviousReference
 * StatementOfInvestmentFundTransactionsCancellation.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#mmRelatedReference
 * StatementOfInvestmentFundTransactionsCancellation.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#mmPreviousReference
 * StatementOfInvestmentFundTransactionsCancellationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#mmRelatedReference
 * StatementOfInvestmentFundTransactionsCancellationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#mmPreviousReference
 * StatementOfInvestmentFundTransactions.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#mmRelatedReference
 * StatementOfInvestmentFundTransactions.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#mmPreviousReference
 * StatementOfInvestmentFundTransactionsV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#mmRelatedReference
 * StatementOfInvestmentFundTransactionsV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReport#mmRelatedReference
 * TransferCancellationStatusReport.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReport#mmOtherReference
 * TransferCancellationStatusReport.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#mmCounterpartyReference
 * TransferCancellationStatusReportV03.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmRelatedReference
 * TransferInstructionStatusReport.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmOtherReference
 * TransferInstructionStatusReport.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmCounterpartyReference
 * TransferInstructionStatusReportV03.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#mmPoolReference
 * TransferInConfirmationV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#mmPreviousReference
 * TransferInConfirmationV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#mmRelatedReference
 * TransferInConfirmationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmCounterpartyReference
 * TransferInstructionStatusReportV04.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmPoolReference
 * TransferOutInstructionV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmPreviousReference
 * TransferOutInstructionV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmRelatedReference
 * TransferOutInstructionV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmCounterpartyReference
 * TransferCancellationStatusReportV04.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmPoolReference
 * TransferInInstructionV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmPreviousReference
 * TransferInInstructionV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmRelatedReference
 * TransferInInstructionV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#mmPoolReference
 * TransferOutConfirmationV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#mmPreviousReference
 * TransferOutConfirmationV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#mmRelatedReference
 * TransferOutConfirmationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmPreviousReference
 * StatementOfInvestmentFundTransactionsV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmRelatedReference
 * StatementOfInvestmentFundTransactionsV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmPreviousReference
 * StatementOfInvestmentFundTransactionsCancellationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmRelatedReference
 * StatementOfInvestmentFundTransactionsCancellationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#mmPoolReference
 * TransferInInstructionV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#mmPreviousReference
 * TransferInInstructionV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#mmRelatedReference
 * TransferInInstructionV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#mmPoolReference
 * TransferOutConfirmationV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#mmPreviousReference
 * TransferOutConfirmationV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#mmRelatedReference
 * TransferOutConfirmationV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#mmPoolReference
 * TransferOutInstructionV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#mmPreviousReference
 * TransferOutInstructionV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#mmRelatedReference
 * TransferOutInstructionV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#mmPoolReference
 * TransferInConfirmationV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#mmPreviousReference
 * TransferInConfirmationV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#mmRelatedReference
 * TransferInConfirmationV06.mmRelatedReference}</li>
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
 * "AdditionalReference2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * </ul>
 */
public class AdditionalReference2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reference;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
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
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> AdditionalReference2.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Business reference of a message assigned by the party issuing the message. This reference must be unique amongst all messages of the same name sent by the same party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification1Choice referenceIssuer;
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
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
	public static final MMMessageAttribute mmReferenceIssuer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AdditionalReference2.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification1Choice.mmObject();
		}
	};
	protected Max35Text messageName;
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
	public static final MMMessageAttribute mmMessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference2.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of a message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalReference2.mmReference, AdditionalReference2.mmReferenceIssuer, AdditionalReference2.mmMessageName);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReversalOfTransferInConfirmation.mmPreviousReference, ReversalOfTransferInConfirmation.mmPoolReference, ReversalOfTransferInConfirmation.mmRelatedReference,
						ReversalOfTransferInConfirmationV02.mmPreviousReference, ReversalOfTransferInConfirmationV02.mmPoolReference, ReversalOfTransferInConfirmationV02.mmRelatedReference,
						ReversalOfTransferOutConfirmation.mmPreviousReference, ReversalOfTransferOutConfirmation.mmPoolReference, ReversalOfTransferOutConfirmation.mmRelatedReference,
						ReversalOfTransferOutConfirmationV02.mmPreviousReference, ReversalOfTransferOutConfirmationV02.mmPoolReference, ReversalOfTransferOutConfirmationV02.mmRelatedReference,
						TransferInCancellationInstruction.mmPreviousReference, TransferInCancellationInstruction.mmPoolReference, TransferInCancellationInstruction.mmRelatedReference, TransferInCancellationRequestV02.mmPreviousReference,
						TransferInCancellationRequestV02.mmPoolReference, TransferInCancellationRequestV02.mmRelatedReference, TransferInConfirmation.mmRelatedReference, TransferInConfirmation.mmPoolReference,
						TransferInConfirmation.mmPreviousReference, TransferInConfirmationV02.mmRelatedReference, TransferInConfirmationV02.mmPoolReference, TransferInConfirmationV02.mmPreviousReference,
						TransferInConfirmationV03.mmPoolReference, TransferInConfirmationV03.mmPreviousReference, TransferInConfirmationV03.mmRelatedReference, TransferInConfirmationV04.mmPoolReference,
						TransferInConfirmationV04.mmPreviousReference, TransferInConfirmationV04.mmRelatedReference, TransferInInstruction.mmPoolReference, TransferInInstruction.mmPreviousReference,
						TransferInInstruction.mmRelatedReference, TransferInInstructionV02.mmPoolReference, TransferInInstructionV02.mmPreviousReference, TransferInInstructionV02.mmRelatedReference,
						TransferInInstructionV03.mmPoolReference, TransferInInstructionV03.mmPreviousReference, TransferInInstructionV03.mmRelatedReference, TransferInInstructionV04.mmPoolReference,
						TransferInInstructionV04.mmPreviousReference, TransferInInstructionV04.mmRelatedReference, TransferOutCancellationInstruction.mmPreviousReference, TransferOutCancellationInstruction.mmPoolReference,
						TransferOutCancellationInstruction.mmRelatedReference, TransferOutCancellationRequestV02.mmPreviousReference, TransferOutCancellationRequestV02.mmPoolReference, TransferOutCancellationRequestV02.mmRelatedReference,
						TransferOutConfirmation.mmRelatedReference, TransferOutConfirmation.mmPoolReference, TransferOutConfirmation.mmPreviousReference, TransferOutConfirmationV02.mmRelatedReference,
						TransferOutConfirmationV02.mmPoolReference, TransferOutConfirmationV02.mmPreviousReference, TransferOutConfirmationV03.mmPoolReference, TransferOutConfirmationV03.mmPreviousReference,
						TransferOutConfirmationV03.mmRelatedReference, TransferOutConfirmationV04.mmPoolReference, TransferOutConfirmationV04.mmPreviousReference, TransferOutConfirmationV04.mmRelatedReference,
						TransferOutInstruction.mmPoolReference, TransferOutInstruction.mmPreviousReference, TransferOutInstruction.mmRelatedReference, TransferOutInstructionV02.mmPoolReference,
						TransferOutInstructionV02.mmPreviousReference, TransferOutInstructionV02.mmRelatedReference, TransferOutInstructionV03.mmPoolReference, TransferOutInstructionV03.mmPreviousReference,
						TransferOutInstructionV03.mmRelatedReference, TransferOutInstructionV04.mmPoolReference, TransferOutInstructionV04.mmPreviousReference, TransferOutInstructionV04.mmRelatedReference,
						AccountingStatementOfHoldings.mmPreviousReference, AccountingStatementOfHoldings.mmRelatedReference, AccountingStatementOfHoldingsV02.mmPreviousReference, AccountingStatementOfHoldingsV02.mmRelatedReference,
						CustodyStatementOfHoldings.mmPreviousReference, CustodyStatementOfHoldings.mmRelatedReference, CustodyStatementOfHoldingsV02.mmPreviousReference, CustodyStatementOfHoldingsV02.mmRelatedReference,
						AccountingStatementOfHoldingsCancellation.mmPreviousReference, AccountingStatementOfHoldingsCancellation.mmRelatedReference, AccountingStatementOfHoldingsCancellationV02.mmPreviousReference,
						AccountingStatementOfHoldingsCancellationV02.mmRelatedReference, CustodyStatementOfHoldingsCancellation.mmPreviousReference, CustodyStatementOfHoldingsCancellation.mmRelatedReference,
						CustodyStatementOfHoldingsCancellationV02.mmPreviousReference, CustodyStatementOfHoldingsCancellationV02.mmRelatedReference, SecuritiesMessageRejection.mmRelatedReference,
						StatementOfInvestmentFundTransactionsCancellation.mmPreviousReference, StatementOfInvestmentFundTransactionsCancellation.mmRelatedReference, StatementOfInvestmentFundTransactionsCancellationV02.mmPreviousReference,
						StatementOfInvestmentFundTransactionsCancellationV02.mmRelatedReference, StatementOfInvestmentFundTransactions.mmPreviousReference, StatementOfInvestmentFundTransactions.mmRelatedReference,
						StatementOfInvestmentFundTransactionsV02.mmPreviousReference, StatementOfInvestmentFundTransactionsV02.mmRelatedReference, TransferCancellationStatusReport.mmRelatedReference,
						TransferCancellationStatusReport.mmOtherReference, TransferCancellationStatusReportV03.mmCounterpartyReference, TransferInstructionStatusReport.mmRelatedReference, TransferInstructionStatusReport.mmOtherReference,
						TransferInstructionStatusReportV03.mmCounterpartyReference, TransferInConfirmationV05.mmPoolReference, TransferInConfirmationV05.mmPreviousReference, TransferInConfirmationV05.mmRelatedReference,
						TransferInstructionStatusReportV04.mmCounterpartyReference, TransferOutInstructionV05.mmPoolReference, TransferOutInstructionV05.mmPreviousReference, TransferOutInstructionV05.mmRelatedReference,
						TransferCancellationStatusReportV04.mmCounterpartyReference, TransferInInstructionV05.mmPoolReference, TransferInInstructionV05.mmPreviousReference, TransferInInstructionV05.mmRelatedReference,
						TransferOutConfirmationV05.mmPoolReference, TransferOutConfirmationV05.mmPreviousReference, TransferOutConfirmationV05.mmRelatedReference, StatementOfInvestmentFundTransactionsV03.mmPreviousReference,
						StatementOfInvestmentFundTransactionsV03.mmRelatedReference, StatementOfInvestmentFundTransactionsCancellationV03.mmPreviousReference, StatementOfInvestmentFundTransactionsCancellationV03.mmRelatedReference,
						TransferInInstructionV06.mmPoolReference, TransferInInstructionV06.mmPreviousReference, TransferInInstructionV06.mmRelatedReference, TransferOutConfirmationV06.mmPoolReference,
						TransferOutConfirmationV06.mmPreviousReference, TransferOutConfirmationV06.mmRelatedReference, TransferOutInstructionV06.mmPoolReference, TransferOutInstructionV06.mmPreviousReference,
						TransferOutInstructionV06.mmRelatedReference, TransferInConfirmationV06.mmPoolReference, TransferInConfirmationV06.mmPreviousReference, TransferInConfirmationV06.mmRelatedReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference2";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReference() {
		return reference;
	}

	public void setReference(Max35Text reference) {
		this.reference = reference;
	}

	public PartyIdentification1Choice getReferenceIssuer() {
		return referenceIssuer;
	}

	public void setReferenceIssuer(PartyIdentification1Choice referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
	}

	public Max35Text getMessageName() {
		return messageName;
	}

	public void setMessageName(Max35Text messageName) {
		this.messageName = messageName;
	}
}