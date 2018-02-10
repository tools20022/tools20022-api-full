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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PendingFailingReasonV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction/instruction is pending or failing
 * settlement. Settlement on the instructed settlement date is still possible,
 * status is pending. Settlement on the instructed settlement date is no longer
 * possible, status is failing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingMoney
 * PendingFailingReasonV2Code.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AccountServicerDeadlineMissed
 * PendingFailingReasonV2Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#SentToTaxAuthorities
 * PendingFailingReasonV2Code.SentToTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingSecurities
 * PendingFailingReasonV2Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#InstructionRefusedOrNotRecognised
 * PendingFailingReasonV2Code.InstructionRefusedOrNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingSecuritiesFromCounterparty
 * PendingFailingReasonV2Code.AwaitingSecuritiesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#PhysicalDeliveryDelay
 * PendingFailingReasonV2Code.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#TradeAmendedInMarket
 * PendingFailingReasonV2Code.TradeAmendedInMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingDocumentsOrEndorsementsFromYou
 * PendingFailingReasonV2Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingFailingReasonV2Code.AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AccountBlocked
 * PendingFailingReasonV2Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#EnquirySent
 * PendingFailingReasonV2Code.EnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NewIssues
 * PendingFailingReasonV2Code.NewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CounterpartyInsufficientSecurities
 * PendingFailingReasonV2Code.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#MultipleSettlementAmount
 * PendingFailingReasonV2Code.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#GlobalFormSecurities
 * PendingFailingReasonV2Code.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#YourInstructionOnHold
 * PendingFailingReasonV2Code.YourInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#GuaranteedDeliveryIndicatorDifference
 * PendingFailingReasonV2Code.GuaranteedDeliveryIndicatorDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#TradeSettlesInPartials
 * PendingFailingReasonV2Code.TradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NoMatchingRequired
 * PendingFailingReasonV2Code.NoMatchingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CounterpartyInsufficientMoney
 * PendingFailingReasonV2Code.CounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CollateralShortage
 * PendingFailingReasonV2Code.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#SecuritiesPledgedAsCollateral
 * PendingFailingReasonV2Code.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#RefusedDepositForIssueOfDepositaryReceipts
 * PendingFailingReasonV2Code.RefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#MaximumForeignLimitReached
 * PendingFailingReasonV2Code.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NoForeignExchangeInstruction
 * PendingFailingReasonV2Code.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#IncomeAdjustementRequired
 * PendingFailingReasonV2Code.IncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#PendingLinkedInstruction
 * PendingFailingReasonV2Code.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingSettlementDate
 * PendingFailingReasonV2Code.AwaitingSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#LackOfSecurities
 * PendingFailingReasonV2Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#SecuritiesLoanedOut
 * PendingFailingReasonV2Code.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#InsufficientMoney
 * PendingFailingReasonV2Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConfirmationNotReceived
 * PendingFailingReasonV2Code.ConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NotInGoodOrder
 * PendingFailingReasonV2Code.NotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#LackOfStampDutyInformation
 * PendingFailingReasonV2Code.LackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ProcessingBatchDifference
 * PendingFailingReasonV2Code.ProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingNextSettlementCycle
 * PendingFailingReasonV2Code.AwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#SecuritiesBlocked
 * PendingFailingReasonV2Code.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CounterpartyInReceivership
 * PendingFailingReasonV2Code.CounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#MinimumSettlementAmount
 * PendingFailingReasonV2Code.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#PendingCAP
 * PendingFailingReasonV2Code.PendingCAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#StatusReasonInvestigation
 * PendingFailingReasonV2Code.StatusReasonInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#Other
 * PendingFailingReasonV2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#PhysicalSecuritiesVerification
 * PendingFailingReasonV2Code.PhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#MissingInformation
 * PendingFailingReasonV2Code.MissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AccountNotOpen
 * PendingFailingReasonV2Code.AccountNotOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#UnderInvestigation
 * PendingFailingReasonV2Code.UnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#UnderClientInvestigation
 * PendingFailingReasonV2Code.UnderClientInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#UnderTransferAgentInvestigation
 * PendingFailingReasonV2Code.UnderTransferAgentInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingTransferAgentStatus
 * PendingFailingReasonV2Code.AwaitingTransferAgentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#UsualTransactionTime
 * PendingFailingReasonV2Code.UsualTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingStatus
 * PendingFailingReasonV2Code.AwaitingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ApplicationFormSent
 * PendingFailingReasonV2Code.ApplicationFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#StockTransferFormSent
 * PendingFailingReasonV2Code.StockTransferFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#LongerProcessing
 * PendingFailingReasonV2Code.LongerProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AdditionalDocumentsRequested
 * PendingFailingReasonV2Code.AdditionalDocumentsRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AdditionalDocumentsSent1
 * PendingFailingReasonV2Code.AdditionalDocumentsSent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AdditionalDocumentsSent2
 * PendingFailingReasonV2Code.AdditionalDocumentsSent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#DocumentsRejected
 * PendingFailingReasonV2Code.DocumentsRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingCounterpartyReceipt
 * PendingFailingReasonV2Code.AwaitingCounterpartyReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingCounterpartyDelivery
 * PendingFailingReasonV2Code.AwaitingCounterpartyDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NormalProcessingPeriodLapsed
 * PendingFailingReasonV2Code.NormalProcessingPeriodLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#WrongCounterpartyAccount
 * PendingFailingReasonV2Code.WrongCounterpartyAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#TransferAgentProcessing
 * PendingFailingReasonV2Code.TransferAgentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ExpectedConfirmation
 * PendingFailingReasonV2Code.ExpectedConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#Escalation
 * PendingFailingReasonV2Code.Escalation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#TransferAgentNonReceipt
 * PendingFailingReasonV2Code.TransferAgentNonReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#FinalVerification
 * PendingFailingReasonV2Code.FinalVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#BeneficialOwnershipDisagreement
 * PendingFailingReasonV2Code.BeneficialOwnershipDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#BothInstructionsOnHold
 * PendingFailingReasonV2Code.BothInstructionsOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ClearingHouseTrade
 * PendingFailingReasonV2Code.ClearingHouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConfirmationOfPayment
 * PendingFailingReasonV2Code.ConfirmationOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#UnavailableDeliverableDenominatedQuantity
 * PendingFailingReasonV2Code.UnavailableDeliverableDenominatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NaturalDisaster
 * PendingFailingReasonV2Code.NaturalDisaster}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CounterpartyReturnedShares
 * PendingFailingReasonV2Code.CounterpartyReturnedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#QuantityDisagreement
 * PendingFailingReasonV2Code.QuantityDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#SecuritiesFrozenAtCSD
 * PendingFailingReasonV2Code.SecuritiesFrozenAtCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingOtherTransaction
 * PendingFailingReasonV2Code.AwaitingOtherTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#MarketDeadlineMissed
 * PendingFailingReasonV2Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#InsufficientCentralBankLiquidity
 * PendingFailingReasonV2Code.InsufficientCentralBankLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#MissingCertification
 * PendingFailingReasonV2Code.MissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NoPayment
 * PendingFailingReasonV2Code.NoPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NotDelivered
 * PendingFailingReasonV2Code.NotDelivered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#PendingReceipt
 * PendingFailingReasonV2Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CounterpartyInstructionOnHold
 * PendingFailingReasonV2Code.CounterpartyInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CertificatesRejected
 * PendingFailingReasonV2Code.CertificatesRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#SettlementSystemMethodModified
 * PendingFailingReasonV2Code.SettlementSystemMethodModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ValidForTaxAuthorities
 * PendingFailingReasonV2Code.ValidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#BuyInProcedure
 * PendingFailingReasonV2Code.BuyInProcedure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CancellationConfirmationRequested
 * PendingFailingReasonV2Code.CancellationConfirmationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#WrongCertificatesNumbers
 * PendingFailingReasonV2Code.WrongCertificatesNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#UnderObjection
 * PendingFailingReasonV2Code.UnderObjection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConfirmationDiscrepency
 * PendingFailingReasonV2Code.ConfirmationDiscrepency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CounterpartyTooLateForSettlement
 * PendingFailingReasonV2Code.CounterpartyTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#MoneySecuritiesTooLateForSettlement
 * PendingFailingReasonV2Code.MoneySecuritiesTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#NextProcess
 * PendingFailingReasonV2Code.NextProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#AwaitingConfirmation
 * PendingFailingReasonV2Code.AwaitingConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#SystemOnHold
 * PendingFailingReasonV2Code.SystemOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConditionalRealignement
 * PendingFailingReasonV2Code.ConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConditionalCurrency
 * PendingFailingReasonV2Code.ConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConditionalRegistrar
 * PendingFailingReasonV2Code.ConditionalRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CancelNotPossible
 * PendingFailingReasonV2Code.CancelNotPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CSDHold
 * PendingFailingReasonV2Code.CSDHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConditionalDelivery
 * PendingFailingReasonV2Code.ConditionalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#CSDValidation
 * PendingFailingReasonV2Code.CSDValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConditionalDeliveryAwaitingRelease
 * PendingFailingReasonV2Code.ConditionalDeliveryAwaitingRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#IncompleteNumberCount
 * PendingFailingReasonV2Code.IncompleteNumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConditionalDeliveryAwaitingCancellation
 * PendingFailingReasonV2Code.ConditionalDeliveryAwaitingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#ConditionalDeliveryCancellationPending
 * PendingFailingReasonV2Code.ConditionalDeliveryCancellationPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#PendingBeneficiaryOwnerDetails
 * PendingFailingReasonV2Code.PendingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#DisagreementOnCashAmount
 * PendingFailingReasonV2Code.DisagreementOnCashAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingReason14Code
 * PendingReason14Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AWMO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingFailingReasonV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is pending or failing settlement. Settlement on the instructed settlement date is still possible, status is pending. Settlement on the instructed settlement date is no longer possible, status is failing."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingFailingReasonV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial instruments are delivered, but still awaiting money from
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments are delivered, but still awaiting money from counterparty."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingMoney = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			definition = "Financial instruments are delivered, but still awaiting money from counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Instruction was received after the account servicer's deadline. Processed
	 * on best effort basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction was received after the account servicer's deadline. Processed on best effort basis."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AccountServicerDeadlineMissed = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Instruction was received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Tax reclaim has been sent to the tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax reclaim has been sent to the tax authorities."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code SentToTaxAuthorities = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToTaxAuthorities";
			definition = "Tax reclaim has been sent to the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Awaiting financial instruments from a corporate action or other
	 * procedure, for example, conversion, dematerialisation, exchange,
	 * registration, stamping, splitting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingSecurities = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CAIS";
		}
	};
	/**
	 * Instruction has been refused or not recognised and is represented
	 * automatically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionRefusedOrNotRecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been refused or not recognised and is represented automatically."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code InstructionRefusedOrNotRecognised = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			definition = "Instruction has been refused or not recognised and is represented automatically.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * Financial instruments have not yet been received from the counterparty
	 * (if receive against payment trade), the money has been delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecuritiesFromCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments have not yet been received from the counterparty (if receive against payment trade), the money has been delivered."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingSecuritiesFromCounterparty = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			definition = "Financial instruments have not yet been received from the counterparty (if receive against payment trade), the money has been delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Settlement is physical. Financial instruments are being delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is physical. Financial instruments are being delivered."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code PhysicalDeliveryDelay = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical. Financial instruments are being delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PHSE";
		}
	};
	/**
	 * Trade is being amended in the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmendedInMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is being amended in the market."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code TradeAmendedInMarket = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmendedInMarket";
			definition = "Trade is being amended in the market.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "TAMM";
		}
	};
	/**
	 * Awaiting documents or endorsements from you.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting documents or endorsements from you."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingDocumentsOrEndorsementsFromYou = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			definition = "Awaiting documents or endorsements from you.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DOCY";
		}
	};
	/**
	 * Awaiting documents or endorsements from counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting documents or endorsements from counterparty."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingDocumentsOrEndorsementsFromCounterparty = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			definition = "Awaiting documents or endorsements from counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Your account is blocked, no instruction can settle over the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your account is blocked, no instruction can settle over the account."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AccountBlocked = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			definition = "Your account is blocked, no instruction can settle over the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * A chaser/enquiry has been sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnquirySent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A chaser/enquiry has been sent."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code EnquirySent = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnquirySent";
			definition = "A chaser/enquiry has been sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CHAS";
		}
	};
	/**
	 * Financial instrument is a new issue and not yet available/tradable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is a new issue and not yet available/tradable."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NewIssues = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssues";
			definition = "Financial instrument is a new issue and not yet available/tradable.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NEWI";
		}
	};
	/**
	 * Insufficient deliverable financial instruments in counterparty's account
	 * or counterparty does not hold financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CounterpartyInsufficientSecurities = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			definition = "Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CLAC";
		}
	};
	/**
	 * Quantity instructed is not a multiple of an existing settlement quantity
	 * lot for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code MultipleSettlementAmount = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Settlement cannot be executed; financial instruments are in global form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GLOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement cannot be executed; financial instruments are in global form."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code GlobalFormSecurities = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Settlement cannot be executed; financial instruments are in global form.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Your instruction is a preadvice, that is, for matching only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YourInstructionOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your instruction is a preadvice, that is, for matching only."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code YourInstructionOnHold = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YourInstructionOnHold";
			definition = "Your instruction is a preadvice, that is, for matching only.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Guaranteed delivery indicator differs in the counterparty's instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDeliveryIndicatorDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Guaranteed delivery indicator differs in the counterparty's instruction."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code GuaranteedDeliveryIndicatorDifference = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			definition = "Guaranteed delivery indicator differs in the counterparty's instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "GUAD";
		}
	};
	/**
	 * Trade will settle in partials.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlesInPartials"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade will settle in partials."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code TradeSettlesInPartials = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlesInPartials";
			definition = "Trade will settle in partials.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Instruction has not been matched; matching process is not required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has not been matched; matching process is not required."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NoMatchingRequired = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingRequired";
			definition = "Instruction has not been matched; matching process is not required.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Insufficient money in counterparty's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient money in counterparty's account."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CounterpartyInsufficientMoney = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in counterparty's account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CMON";
		}
	};
	/**
	 * Insufficient collateral in your account to execute the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YCOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient collateral in your account to execute the instruction."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CollateralShortage = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			definition = "Insufficient collateral in your account to execute the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "YCOL";
		}
	};
	/**
	 * Financial instruments are not deliverable as they are pledged as
	 * collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments are not deliverable as they are pledged as collateral."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code SecuritiesPledgedAsCollateral = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			definition = "Financial instruments are not deliverable as they are pledged as collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Deposit of shares for the issuing of depositary receipts has been
	 * refused. The allotment granted by the issuer is exceeded by your
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedDepositForIssueOfDepositaryReceipts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deposit of shares for the issuing of depositary receipts has been refused. The allotment granted by the issuer is exceeded by your transaction."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code RefusedDepositForIssueOfDepositaryReceipts = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuing of depositary receipts has been refused. The allotment granted by the issuer is exceeded by your transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DEPO";
		}
	};
	/**
	 * Insufficient deliverable financial instruments in your account as maximum
	 * foreign limit has been reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code MaximumForeignLimitReached = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "FLIM";
		}
	};
	/**
	 * A foreign exchange instruction from you is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOFX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A foreign exchange instruction from you is missing."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NoForeignExchangeInstruction = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "A foreign exchange instruction from you is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NOFX";
		}
	};
	/**
	 * Financial instruments require income adjustment, for example, dividend or
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeAdjustementRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments require income adjustment, for example, dividend or interest."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code IncomeAdjustementRequired = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Financial instruments require income adjustment, for example, dividend or interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Your instruction is pending settlement because the instruction linked to
	 * it is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LINK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your instruction is pending settlement because the instruction linked to it is pending."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code PendingLinkedInstruction = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Your instruction is pending settlement because the instruction linked to it is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "LINK";
		}
	};
	/**
	 * Awaiting settlement date. No settlement problems to be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Awaiting settlement date. No settlement problems to be reported."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingSettlementDate = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSettlementDate";
			definition = "Awaiting settlement date. No settlement problems to be reported.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Insufficient financial instruments in your account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient financial instruments in your account."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code LackOfSecurities = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			definition = "Insufficient financial instruments in your account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Financial instruments are out on loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LALO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial instruments are out on loan."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code SecuritiesLoanedOut = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Financial instruments are out on loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "LALO";
		}
	};
	/**
	 * Insufficient money in your account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient money in your account."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code InsufficientMoney = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Confirmation of settlement has not yet been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationNotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation of settlement has not yet been received."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConfirmationNotReceived = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Confirmation of settlement has not yet been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Delivery/receipt was refused because physical financial instruments are
	 * not in good order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInGoodOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery/receipt was refused because physical financial instruments are not in good order."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NotInGoodOrder = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt was refused because physical financial instruments are not in good order.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "REFS";
		}
	};
	/**
	 * Stamp duty information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDutyInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stamp duty information is missing."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code LackOfStampDutyInformation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Stamp duty information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Processing batch differs in the counterparty's instruction, for example,
	 * daytime/real-time versus overnight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BATC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing batch differs in the counterparty's instruction, for example, daytime/real-time versus overnight."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ProcessingBatchDifference = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, for example, daytime/real-time versus overnight.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Your instruction is confirmed in the local market or is ready for
	 * settlement, awaiting next settlement cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingNextSettlementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingNextSettlementCycle = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * Financial instruments are blocked due to a corporate action event,
	 * realignment, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments are blocked due to a corporate action event, realignment, etc."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code SecuritiesBlocked = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Financial instruments are blocked due to a corporate action event, realignment, etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "SBLO";
		}
	};
	/**
	 * Counterparty is in receivership (form of bankruptcy where a court
	 * appointed person - the receiver - manages the affairs of the business).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInReceivership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty is in receivership (form of bankruptcy where a court appointed person - the receiver - manages the affairs of the business)."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CounterpartyInReceivership = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership (form of bankruptcy where a court appointed person - the receiver - manages the affairs of the business).";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CPEC";
		}
	};
	/**
	 * Quantity instructed is lower than the minimum existing settlement
	 * quantity for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code MinimumSettlementAmount = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Payment is pending, and does not settle because the actual use of the
	 * risk management limit on the counterpart (bilateral limit) prevents
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code PendingCAP = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCAP";
			definition = "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PCAP";
		}
	};
	/**
	 * Pending reason being investigated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IAAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending reason being investigated."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code StatusReasonInvestigation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			definition = "Pending reason being investigated.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "IAAD";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code Other = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Physical financial instruments have been received and are being checked
	 * for authenticity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical financial instruments have been received and are being checked for authenticity."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code PhysicalSecuritiesVerification = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			definition = "Physical financial instruments have been received and are being checked for authenticity.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PHCK";
		}
	};
	/**
	 * Information, for example, telephone number, contact person, is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information, for example, telephone number, contact person, is missing."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code MissingInformation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			definition = "Information, for example, telephone number, contact person, is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "MINF";
		}
	};
	/**
	 * Account must already be opened in order to process the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotOpen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account must already be opened in order to process the transfer."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AccountNotOpen = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotOpen";
			definition = "Account must already be opened in order to process the transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "ACOP";
		}
	};
	/**
	 * Intermediary is investigating the reason why the transfer is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Intermediary is investigating the reason why the transfer is pending."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code UnderInvestigation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			definition = "Intermediary is investigating the reason why the transfer is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "IINV";
		}
	};
	/**
	 * Client has been informed of a problem and is investigating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderClientInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client has been informed of a problem and is investigating."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code UnderClientInvestigation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderClientInvestigation";
			definition = "Client has been informed of a problem and is investigating.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CINV";
		}
	};
	/**
	 * Transfer agent is investigating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderTransferAgentInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer agent is investigating."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code UnderTransferAgentInvestigation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderTransferAgentInvestigation";
			definition = "Transfer agent is investigating.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "AINV";
		}
	};
	/**
	 * Transfer is being processed by the transfer agent, awaiting status from
	 * transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingTransferAgentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer is being processed by the transfer agent, awaiting status from transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingTransferAgentStatus = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingTransferAgentStatus";
			definition = "Transfer is being processed by the transfer agent, awaiting status from transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "WTRF";
		}
	};
	/**
	 * Usual transfer agent's processing timeframe.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsualTransactionTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Usual transfer agent's processing timeframe."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code UsualTransactionTime = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsualTransactionTime";
			definition = "Usual transfer agent's processing timeframe.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "USUA";
		}
	};
	/**
	 * At your request, the Intermediary is checking the status of your
	 * instruction with the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At your request, the Intermediary is checking the status of your instruction with the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingStatus = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingStatus";
			definition = "At your request, the Intermediary is checking the status of your instruction with the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "ASTA";
		}
	};
	/**
	 * Application form has been sent to the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationFormSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Application form has been sent to the transfer agent."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ApplicationFormSent = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationFormSent";
			definition = "Application form has been sent to the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "AFST";
		}
	};
	/**
	 * Stock transfer form has been sent to the counterparty to sign and forward
	 * to the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockTransferFormSent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code StockTransferFormSent = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockTransferFormSent";
			definition = "Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "STST";
		}
	};
	/**
	 * Longer processing timeframe for this type of transfer, due to
	 * documentation requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LPRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongerProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Longer processing timeframe for this type of transfer, due to documentation requirements."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code LongerProcessing = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongerProcessing";
			definition = "Longer processing timeframe for this type of transfer, due to documentation requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "LPRO";
		}
	};
	/**
	 * Additional documents have been requested by the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional documents have been requested by the transfer agent."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AdditionalDocumentsRequested = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsRequested";
			definition = "Additional documents have been requested by the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "ADRQ";
		}
	};
	/**
	 * Additional documents have been sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADS1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsSent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional documents have been sent."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AdditionalDocumentsSent1 = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent1";
			definition = "Additional documents have been sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "ADS1";
		}
	};
	/**
	 * Upon request of the transfer agent, the intermediary has sent additional
	 * documents. The transfer agent has confirmed that all the necessary
	 * information is now in place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADS2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsSent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AdditionalDocumentsSent2 = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent2";
			definition = "Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "ADS2";
		}
	};
	/**
	 * Documents are rejected by the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRJC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentsRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents are rejected by the transfer agent."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code DocumentsRejected = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentsRejected";
			definition = "Documents are rejected by the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DRJC";
		}
	};
	/**
	 * Counterparty has not sent an instruction to receive. Check with
	 * counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCounterpartyReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty has not sent an instruction to receive. Check with counterparty."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingCounterpartyReceipt = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			definition = "Counterparty has not sent an instruction to receive. Check with counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CYIN";
		}
	};
	/**
	 * Counterparty has not sent an instruction to deliver or delivered the
	 * shares. Check with counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CYDV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCounterpartyDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingCounterpartyDelivery = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyDelivery";
			definition = "Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CYDV";
		}
	};
	/**
	 * The instructed position exceeds the eligible balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalProcessingPeriodLapsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The instructed position exceeds the eligible balance."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NormalProcessingPeriodLapsed = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			definition = "The instructed position exceeds the eligible balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Wrong counterparty account details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WCPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCounterpartyAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wrong counterparty account details."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code WrongCounterpartyAccount = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCounterpartyAccount";
			definition = "Wrong counterparty account details.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "WCPA";
		}
	};
	/**
	 * Transfer is being processed by transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgentProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is being processed by transfer agent."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code TransferAgentProcessing = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentProcessing";
			definition = "Transfer is being processed by transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "TAPR";
		}
	};
	/**
	 * Confirmation is expected from transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation is expected from transfer agent."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ExpectedConfirmation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedConfirmation";
			definition = "Confirmation is expected from transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "XCNF";
		}
	};
	/**
	 * Special follow-up is taking place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Escalation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special follow-up is taking place."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code Escalation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escalation";
			definition = "Special follow-up is taking place.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "ESCA";
		}
	};
	/**
	 * Transfer agent claims non-receipt of physical shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgentNonReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer agent claims non-receipt of physical shares."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code TransferAgentNonReceipt = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentNonReceipt";
			definition = "Transfer agent claims non-receipt of physical shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NRCP";
		}
	};
	/**
	 * Confirmed but finality is to be verified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmed but finality is to be verified."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code FinalVerification = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalVerification";
			definition = "Confirmed but finality is to be verified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "FVER";
		}
	};
	/**
	 * Disagreement in beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipDisagreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Disagreement in beneficial ownership."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code BeneficialOwnershipDisagreement = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			definition = "Disagreement in beneficial ownership.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "BENO";
		}
	};
	/**
	 * Counterparty's instruction and your instruction are on hold/frozen/ in a
	 * preadvice mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BothInstructionsOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instruction and your instruction are on hold/frozen/ in a preadvice mode."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code BothInstructionsOnHold = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothInstructionsOnHold";
			definition = "Counterparty's instruction and your instruction are on hold/frozen/ in a preadvice mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "BOTH";
		}
	};
	/**
	 * Instructed settlement date does not agree with the settlement date on the
	 * clearing house trade, that is, a specific type of trade in India.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLHT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingHouseTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructed settlement date does not agree with the settlement date on the clearing house trade, that is, a specific type of trade in India."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ClearingHouseTrade = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseTrade";
			definition = "Instructed settlement date does not agree with the settlement date on the clearing house trade, that is, a specific type of trade in India.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CLHT";
		}
	};
	/**
	 * Prior payment credited to account based contractual income collection
	 * agreement has been collected from issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationOfPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Prior payment credited to account based contractual income collection agreement has been collected from issuer."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConfirmationOfPayment = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfPayment";
			definition = "Prior payment credited to account based contractual income collection agreement has been collected from issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PCNF";
		}
	};
	/**
	 * Quantity instructed does not match the denomination
	 * available/deliverable. Physical securities need to be obtained in
	 * deliverable denominated quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DENO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableDeliverableDenominatedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code UnavailableDeliverableDenominatedQuantity = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			definition = "Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DENO";
		}
	};
	/**
	 * Exceptional closing of all financial institutions due to natural
	 * disaster, for example, earthquake.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalDisaster"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exceptional closing of all financial institutions due to natural disaster, for example, earthquake."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NaturalDisaster = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalDisaster";
			definition = "Exceptional closing of all financial institutions due to natural disaster, for example, earthquake.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Counterparty has returned or refuses the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DKNY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReturnedShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty has returned or refuses the securities."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CounterpartyReturnedShares = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReturnedShares";
			definition = "Counterparty has returned or refuses the securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DKNY";
		}
	};
	/**
	 * Quantity of financial instruments does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDisagreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instruments does not match."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code QuantityDisagreement = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDisagreement";
			definition = "Quantity of financial instruments does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Financial instruments are blocked at the Central Security Depository
	 * (CSD) following a corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FROZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFrozenAtCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments are blocked at the Central Security Depository (CSD) following a corporate event."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code SecuritiesFrozenAtCSD = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFrozenAtCSD";
			definition = "Financial instruments are blocked at the Central Security Depository (CSD) following a corporate event.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "FROZ";
		}
	};
	/**
	 * Awaiting settlement of a purchase to cover failing positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingOtherTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Awaiting settlement of a purchase to cover failing positions."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingOtherTransaction = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingOtherTransaction";
			definition = "Awaiting settlement of a purchase to cover failing positions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "LAAW";
		}
	};
	/**
	 * Instruction was received after market deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction was received after market deadline."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code MarketDeadlineMissed = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Central bank liquidity is insufficient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCentralBankLiquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Central bank liquidity is insufficient."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code InsufficientCentralBankLiquidity = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			definition = "Central bank liquidity is insufficient.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Awaiting receipt of adequate certification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting receipt of adequate certification."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code MissingCertification = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			definition = "Awaiting receipt of adequate certification.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "MCER";
		}
	};
	/**
	 * Payment has not been made by issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment has not been made by issuer."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NoPayment = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPayment";
			definition = "Payment has not been made by issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NPAY";
		}
	};
	/**
	 * Financial instruments have not been delivered by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDelivered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments have not been delivered by the issuer."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NotDelivered = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDelivered";
			definition = "Financial instruments have not been delivered by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NSEC";
		}
	};
	/**
	 * The instruction is pending receipt of securities, for example, from a
	 * purchase, loan etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The instruction is pending receipt of securities, for example, from a purchase, loan etc."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code PendingReceipt = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			definition = "The instruction is pending receipt of securities, for example, from a purchase, loan etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Counterparty's instruction is a preadvice, that is, for matching only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInstructionOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instruction is a preadvice, that is, for matching only."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CounterpartyInstructionOnHold = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInstructionOnHold";
			definition = "Counterparty's instruction is a preadvice, that is, for matching only.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PRCY";
		}
	};
	/**
	 * Certificates have been lodged with the registrar but rejected due to
	 * incomplete documentation or foreign ownership limitation reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificates have been lodged with the registrar but rejected due to incomplete documentation or foreign ownership limitation reached."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CertificatesRejected = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesRejected";
			definition = "Certificates have been lodged with the registrar but rejected due to incomplete documentation or foreign ownership limitation reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "REGT";
		}
	};
	/**
	 * Settlement system/method has been modified at central securities
	 * depository to allow settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodModified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement system/method has been modified at central securities depository to allow settlement."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code SettlementSystemMethodModified = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodModified";
			definition = "Settlement system/method has been modified at central securities depository to allow settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * For tax reclaim, the event is pending, the tax reclaim is valid for the
	 * tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VLDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidForTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ValidForTaxAuthorities = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidForTaxAuthorities";
			definition = "For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "VLDA";
		}
	};
	/**
	 * Buy-in procedure has started on the market (on your behalf if your
	 * instruction is a receipt, by the counterparty if your instruction is a
	 * delivery).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYIY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInProcedure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy-in procedure has started on the market (on your behalf if your instruction is a receipt, by the counterparty if your instruction is a delivery)."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code BuyInProcedure = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInProcedure";
			definition = "Buy-in procedure has started on the market (on your behalf if your instruction is a receipt, by the counterparty if your instruction is a delivery).";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "BYIY";
		}
	};
	/**
	 * Instruction was in suspense. Suspense period is finished so your
	 * cancellation or confirmation of instruction is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationConfirmationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction was in suspense. Suspense period is finished so your cancellation or confirmation of instruction is required."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CancellationConfirmationRequested = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationConfirmationRequested";
			definition = "Instruction was in suspense. Suspense period is finished so your cancellation or confirmation of instruction is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CANR";
		}
	};
	/**
	 * Certificate number error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate number error."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code WrongCertificatesNumbers = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			definition = "Certificate number error.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Financial instruments are stolen, in dispute, under objection etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OBJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderObjection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments are stolen, in dispute, under objection etc."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code UnderObjection = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderObjection";
			definition = "Financial instruments are stolen, in dispute, under objection etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "OBJT";
		}
	};
	/**
	 * Discrepancy in the settlement confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDiscrepency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Discrepancy in the settlement confirmation."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConfirmationDiscrepency = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDiscrepency";
			definition = "Discrepancy in the settlement confirmation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "STCD";
		}
	};
	/**
	 * Counterparty's instruction was too late for settlement, that is the
	 * matching or settlement problems was solved too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instruction was too late for settlement, that is the matching or settlement problems was solved too late."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CounterpartyTooLateForSettlement = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForSettlement";
			definition = "Counterparty's instruction was too late for settlement, that is the matching or settlement problems was solved too late.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Covering money/financial instruments were received too late for
	 * completing settlement on a same day basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneySecuritiesTooLateForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Covering money/financial instruments were received too late for completing settlement on a same day basis."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code MoneySecuritiesTooLateForSettlement = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneySecuritiesTooLateForSettlement";
			definition = "Covering money/financial instruments were received too late for completing settlement on a same day basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "MLAT";
		}
	};
	/**
	 * Next process is launched. No processing pending problems to be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEXT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next process is launched. No processing pending problems to be reported."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code NextProcess = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextProcess";
			definition = "Next process is launched. No processing pending problems to be reported.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "NEXT";
		}
	};
	/**
	 * Awaiting confirmation from the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting confirmation from the counterparty."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code AwaitingConfirmation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingConfirmation";
			definition = "Awaiting confirmation from the counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Transaction was put on hold/frozen by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction was put on hold/frozen by the system."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code SystemOnHold = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemOnHold";
			definition = "Transaction was put on hold/frozen by the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "PRSY";
		}
	};
	/**
	 * Execution is conditional to the execution of a process of realignment at
	 * the issuer CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is conditional to the execution of a process of realignment at the issuer CSD."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConditionalRealignement = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is conditional to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CDRE";
		}
	};
	/**
	 * Execution is conditional to the execution of a process linked to the
	 * currency of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is conditional to the execution of a process linked to the currency of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConditionalCurrency = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is conditional to the execution of a process linked to the currency of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CDCY";
		}
	};
	/**
	 * Execution is conditional to the execution of a process at the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is conditional to the execution of a process at the registrar."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConditionalRegistrar = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is conditional to the execution of a process at the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CDRG";
		}
	};
	/**
	 * Instruction has been processed and cannot be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPNC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelNotPossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been processed and cannot be cancelled."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CancelNotPossible = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelNotPossible";
			definition = "Instruction has been processed and cannot be cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "IPNC";
		}
	};
	/**
	 * Central securities depository sets the instruction in a
	 * hold/frozen/preadvice mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Central securities depository sets the instruction in a hold/frozen/preadvice mode."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CSDHold = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDHold";
			definition = "Central securities depository sets the instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CSDH";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditional delivery rules in the market infrastructure platform for
	 * conditional delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConditionalDelivery = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDelivery";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CDEL";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditions of a restriction processing type in the market infrastructure
	 * platform.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code CSDValidation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidation";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CVAL";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode. Market infrastructure
	 * platform is awaiting release.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDeliveryAwaitingRelease"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is in a hold/frozen/preadvice mode. Market infrastructure platform is awaiting release."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConditionalDeliveryAwaitingRelease = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingRelease";
			definition = "Instruction is in a hold/frozen/preadvice mode. Market infrastructure platform is awaiting release.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CDLR";
		}
	};
	/**
	 * Not all the instructions part of a pool have been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteNumberCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Not all the instructions part of a pool have been received."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code IncompleteNumberCount = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			definition = "Not all the instructions part of a pool have been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "INBC";
		}
	};
	/**
	 * Awaiting cancellation of one of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDeliveryAwaitingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting cancellation of one of the party."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConditionalDeliveryAwaitingCancellation = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingCancellation";
			definition = "Awaiting cancellation of one of the party.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CDAC";
		}
	};
	/**
	 * Conditional Delivery is still pending awaiting the cancellation from at
	 * least another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDeliveryCancellationPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditional Delivery is still pending awaiting the cancellation from at least another party."
	 * </li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code ConditionalDeliveryCancellationPending = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryCancellationPending";
			definition = "Conditional Delivery is still pending awaiting the cancellation from at least another party.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "CDLC";
		}
	};
	/**
	 * Pending receipt of beneficiary owner details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBeneficiaryOwnerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending receipt of beneficiary owner details."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code PendingBeneficiaryOwnerDetails = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBeneficiaryOwnerDetails";
			definition = "Pending receipt of beneficiary owner details.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Unrecognised or invalid instructed cash amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
	 * PendingFailingReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementOnCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid instructed cash amount."</li>
	 * </ul>
	 */
	public static final PendingFailingReasonV2Code DisagreementOnCashAmount = new PendingFailingReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementOnCashAmount";
			definition = "Unrecognised or invalid instructed cash amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingFailingReasonV2Code.mmObject();
			codeName = "DQCS";
		}
	};
	final static private LinkedHashMap<String, PendingFailingReasonV2Code> codesByName = new LinkedHashMap<>();

	protected PendingFailingReasonV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingFailingReasonV2Code";
				definition = "Specifies the reason the transaction/instruction is pending or failing settlement. Settlement on the instructed settlement date is still possible, status is pending. Settlement on the instructed settlement date is no longer possible, status is failing.";
				derivation_lazy = () -> Arrays.asList(PendingReason14Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingMoney, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.SentToTaxAuthorities, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.InstructionRefusedOrNotRecognised, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingSecuritiesFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.PhysicalDeliveryDelay, com.tools20022.repository.codeset.PendingFailingReasonV2Code.TradeAmendedInMarket,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingDocumentsOrEndorsementsFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.AccountBlocked, com.tools20022.repository.codeset.PendingFailingReasonV2Code.EnquirySent,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.NewIssues, com.tools20022.repository.codeset.PendingFailingReasonV2Code.CounterpartyInsufficientSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.MultipleSettlementAmount, com.tools20022.repository.codeset.PendingFailingReasonV2Code.GlobalFormSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.YourInstructionOnHold, com.tools20022.repository.codeset.PendingFailingReasonV2Code.GuaranteedDeliveryIndicatorDifference,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.TradeSettlesInPartials, com.tools20022.repository.codeset.PendingFailingReasonV2Code.NoMatchingRequired,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.CounterpartyInsufficientMoney, com.tools20022.repository.codeset.PendingFailingReasonV2Code.CollateralShortage,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.PendingFailingReasonV2Code.RefusedDepositForIssueOfDepositaryReceipts,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.MaximumForeignLimitReached, com.tools20022.repository.codeset.PendingFailingReasonV2Code.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.IncomeAdjustementRequired, com.tools20022.repository.codeset.PendingFailingReasonV2Code.PendingLinkedInstruction,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingSettlementDate, com.tools20022.repository.codeset.PendingFailingReasonV2Code.LackOfSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.SecuritiesLoanedOut, com.tools20022.repository.codeset.PendingFailingReasonV2Code.InsufficientMoney,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConfirmationNotReceived, com.tools20022.repository.codeset.PendingFailingReasonV2Code.NotInGoodOrder,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.LackOfStampDutyInformation, com.tools20022.repository.codeset.PendingFailingReasonV2Code.ProcessingBatchDifference,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingNextSettlementCycle, com.tools20022.repository.codeset.PendingFailingReasonV2Code.SecuritiesBlocked,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.CounterpartyInReceivership, com.tools20022.repository.codeset.PendingFailingReasonV2Code.MinimumSettlementAmount,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.PendingCAP, com.tools20022.repository.codeset.PendingFailingReasonV2Code.StatusReasonInvestigation,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.Other, com.tools20022.repository.codeset.PendingFailingReasonV2Code.PhysicalSecuritiesVerification,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.MissingInformation, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AccountNotOpen,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.UnderInvestigation, com.tools20022.repository.codeset.PendingFailingReasonV2Code.UnderClientInvestigation,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.UnderTransferAgentInvestigation, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingTransferAgentStatus,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.UsualTransactionTime, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingStatus,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ApplicationFormSent, com.tools20022.repository.codeset.PendingFailingReasonV2Code.StockTransferFormSent,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.LongerProcessing, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AdditionalDocumentsRequested,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.AdditionalDocumentsSent1, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AdditionalDocumentsSent2,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.DocumentsRejected, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingCounterpartyReceipt,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingCounterpartyDelivery, com.tools20022.repository.codeset.PendingFailingReasonV2Code.NormalProcessingPeriodLapsed,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.WrongCounterpartyAccount, com.tools20022.repository.codeset.PendingFailingReasonV2Code.TransferAgentProcessing,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ExpectedConfirmation, com.tools20022.repository.codeset.PendingFailingReasonV2Code.Escalation,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.TransferAgentNonReceipt, com.tools20022.repository.codeset.PendingFailingReasonV2Code.FinalVerification,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.BeneficialOwnershipDisagreement, com.tools20022.repository.codeset.PendingFailingReasonV2Code.BothInstructionsOnHold,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ClearingHouseTrade, com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConfirmationOfPayment,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.UnavailableDeliverableDenominatedQuantity, com.tools20022.repository.codeset.PendingFailingReasonV2Code.NaturalDisaster,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.CounterpartyReturnedShares, com.tools20022.repository.codeset.PendingFailingReasonV2Code.QuantityDisagreement,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.SecuritiesFrozenAtCSD, com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingOtherTransaction,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.MarketDeadlineMissed, com.tools20022.repository.codeset.PendingFailingReasonV2Code.InsufficientCentralBankLiquidity,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.MissingCertification, com.tools20022.repository.codeset.PendingFailingReasonV2Code.NoPayment,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.NotDelivered, com.tools20022.repository.codeset.PendingFailingReasonV2Code.PendingReceipt,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.CounterpartyInstructionOnHold, com.tools20022.repository.codeset.PendingFailingReasonV2Code.CertificatesRejected,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.SettlementSystemMethodModified, com.tools20022.repository.codeset.PendingFailingReasonV2Code.ValidForTaxAuthorities,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.BuyInProcedure, com.tools20022.repository.codeset.PendingFailingReasonV2Code.CancellationConfirmationRequested,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.WrongCertificatesNumbers, com.tools20022.repository.codeset.PendingFailingReasonV2Code.UnderObjection,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConfirmationDiscrepency, com.tools20022.repository.codeset.PendingFailingReasonV2Code.CounterpartyTooLateForSettlement,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.MoneySecuritiesTooLateForSettlement, com.tools20022.repository.codeset.PendingFailingReasonV2Code.NextProcess,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.AwaitingConfirmation, com.tools20022.repository.codeset.PendingFailingReasonV2Code.SystemOnHold,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConditionalRealignement, com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConditionalCurrency,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConditionalRegistrar, com.tools20022.repository.codeset.PendingFailingReasonV2Code.CancelNotPossible,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.CSDHold, com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConditionalDelivery,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.CSDValidation, com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConditionalDeliveryAwaitingRelease,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.IncompleteNumberCount, com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConditionalDeliveryAwaitingCancellation,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.ConditionalDeliveryCancellationPending, com.tools20022.repository.codeset.PendingFailingReasonV2Code.PendingBeneficiaryOwnerDetails,
						com.tools20022.repository.codeset.PendingFailingReasonV2Code.DisagreementOnCashAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingMoney.getCodeName().get(), AwaitingMoney);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(SentToTaxAuthorities.getCodeName().get(), SentToTaxAuthorities);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(InstructionRefusedOrNotRecognised.getCodeName().get(), InstructionRefusedOrNotRecognised);
		codesByName.put(AwaitingSecuritiesFromCounterparty.getCodeName().get(), AwaitingSecuritiesFromCounterparty);
		codesByName.put(PhysicalDeliveryDelay.getCodeName().get(), PhysicalDeliveryDelay);
		codesByName.put(TradeAmendedInMarket.getCodeName().get(), TradeAmendedInMarket);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromCounterparty);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(EnquirySent.getCodeName().get(), EnquirySent);
		codesByName.put(NewIssues.getCodeName().get(), NewIssues);
		codesByName.put(CounterpartyInsufficientSecurities.getCodeName().get(), CounterpartyInsufficientSecurities);
		codesByName.put(MultipleSettlementAmount.getCodeName().get(), MultipleSettlementAmount);
		codesByName.put(GlobalFormSecurities.getCodeName().get(), GlobalFormSecurities);
		codesByName.put(YourInstructionOnHold.getCodeName().get(), YourInstructionOnHold);
		codesByName.put(GuaranteedDeliveryIndicatorDifference.getCodeName().get(), GuaranteedDeliveryIndicatorDifference);
		codesByName.put(TradeSettlesInPartials.getCodeName().get(), TradeSettlesInPartials);
		codesByName.put(NoMatchingRequired.getCodeName().get(), NoMatchingRequired);
		codesByName.put(CounterpartyInsufficientMoney.getCodeName().get(), CounterpartyInsufficientMoney);
		codesByName.put(CollateralShortage.getCodeName().get(), CollateralShortage);
		codesByName.put(SecuritiesPledgedAsCollateral.getCodeName().get(), SecuritiesPledgedAsCollateral);
		codesByName.put(RefusedDepositForIssueOfDepositaryReceipts.getCodeName().get(), RefusedDepositForIssueOfDepositaryReceipts);
		codesByName.put(MaximumForeignLimitReached.getCodeName().get(), MaximumForeignLimitReached);
		codesByName.put(NoForeignExchangeInstruction.getCodeName().get(), NoForeignExchangeInstruction);
		codesByName.put(IncomeAdjustementRequired.getCodeName().get(), IncomeAdjustementRequired);
		codesByName.put(PendingLinkedInstruction.getCodeName().get(), PendingLinkedInstruction);
		codesByName.put(AwaitingSettlementDate.getCodeName().get(), AwaitingSettlementDate);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(SecuritiesLoanedOut.getCodeName().get(), SecuritiesLoanedOut);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(ConfirmationNotReceived.getCodeName().get(), ConfirmationNotReceived);
		codesByName.put(NotInGoodOrder.getCodeName().get(), NotInGoodOrder);
		codesByName.put(LackOfStampDutyInformation.getCodeName().get(), LackOfStampDutyInformation);
		codesByName.put(ProcessingBatchDifference.getCodeName().get(), ProcessingBatchDifference);
		codesByName.put(AwaitingNextSettlementCycle.getCodeName().get(), AwaitingNextSettlementCycle);
		codesByName.put(SecuritiesBlocked.getCodeName().get(), SecuritiesBlocked);
		codesByName.put(CounterpartyInReceivership.getCodeName().get(), CounterpartyInReceivership);
		codesByName.put(MinimumSettlementAmount.getCodeName().get(), MinimumSettlementAmount);
		codesByName.put(PendingCAP.getCodeName().get(), PendingCAP);
		codesByName.put(StatusReasonInvestigation.getCodeName().get(), StatusReasonInvestigation);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PhysicalSecuritiesVerification.getCodeName().get(), PhysicalSecuritiesVerification);
		codesByName.put(MissingInformation.getCodeName().get(), MissingInformation);
		codesByName.put(AccountNotOpen.getCodeName().get(), AccountNotOpen);
		codesByName.put(UnderInvestigation.getCodeName().get(), UnderInvestigation);
		codesByName.put(UnderClientInvestigation.getCodeName().get(), UnderClientInvestigation);
		codesByName.put(UnderTransferAgentInvestigation.getCodeName().get(), UnderTransferAgentInvestigation);
		codesByName.put(AwaitingTransferAgentStatus.getCodeName().get(), AwaitingTransferAgentStatus);
		codesByName.put(UsualTransactionTime.getCodeName().get(), UsualTransactionTime);
		codesByName.put(AwaitingStatus.getCodeName().get(), AwaitingStatus);
		codesByName.put(ApplicationFormSent.getCodeName().get(), ApplicationFormSent);
		codesByName.put(StockTransferFormSent.getCodeName().get(), StockTransferFormSent);
		codesByName.put(LongerProcessing.getCodeName().get(), LongerProcessing);
		codesByName.put(AdditionalDocumentsRequested.getCodeName().get(), AdditionalDocumentsRequested);
		codesByName.put(AdditionalDocumentsSent1.getCodeName().get(), AdditionalDocumentsSent1);
		codesByName.put(AdditionalDocumentsSent2.getCodeName().get(), AdditionalDocumentsSent2);
		codesByName.put(DocumentsRejected.getCodeName().get(), DocumentsRejected);
		codesByName.put(AwaitingCounterpartyReceipt.getCodeName().get(), AwaitingCounterpartyReceipt);
		codesByName.put(AwaitingCounterpartyDelivery.getCodeName().get(), AwaitingCounterpartyDelivery);
		codesByName.put(NormalProcessingPeriodLapsed.getCodeName().get(), NormalProcessingPeriodLapsed);
		codesByName.put(WrongCounterpartyAccount.getCodeName().get(), WrongCounterpartyAccount);
		codesByName.put(TransferAgentProcessing.getCodeName().get(), TransferAgentProcessing);
		codesByName.put(ExpectedConfirmation.getCodeName().get(), ExpectedConfirmation);
		codesByName.put(Escalation.getCodeName().get(), Escalation);
		codesByName.put(TransferAgentNonReceipt.getCodeName().get(), TransferAgentNonReceipt);
		codesByName.put(FinalVerification.getCodeName().get(), FinalVerification);
		codesByName.put(BeneficialOwnershipDisagreement.getCodeName().get(), BeneficialOwnershipDisagreement);
		codesByName.put(BothInstructionsOnHold.getCodeName().get(), BothInstructionsOnHold);
		codesByName.put(ClearingHouseTrade.getCodeName().get(), ClearingHouseTrade);
		codesByName.put(ConfirmationOfPayment.getCodeName().get(), ConfirmationOfPayment);
		codesByName.put(UnavailableDeliverableDenominatedQuantity.getCodeName().get(), UnavailableDeliverableDenominatedQuantity);
		codesByName.put(NaturalDisaster.getCodeName().get(), NaturalDisaster);
		codesByName.put(CounterpartyReturnedShares.getCodeName().get(), CounterpartyReturnedShares);
		codesByName.put(QuantityDisagreement.getCodeName().get(), QuantityDisagreement);
		codesByName.put(SecuritiesFrozenAtCSD.getCodeName().get(), SecuritiesFrozenAtCSD);
		codesByName.put(AwaitingOtherTransaction.getCodeName().get(), AwaitingOtherTransaction);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(InsufficientCentralBankLiquidity.getCodeName().get(), InsufficientCentralBankLiquidity);
		codesByName.put(MissingCertification.getCodeName().get(), MissingCertification);
		codesByName.put(NoPayment.getCodeName().get(), NoPayment);
		codesByName.put(NotDelivered.getCodeName().get(), NotDelivered);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(CounterpartyInstructionOnHold.getCodeName().get(), CounterpartyInstructionOnHold);
		codesByName.put(CertificatesRejected.getCodeName().get(), CertificatesRejected);
		codesByName.put(SettlementSystemMethodModified.getCodeName().get(), SettlementSystemMethodModified);
		codesByName.put(ValidForTaxAuthorities.getCodeName().get(), ValidForTaxAuthorities);
		codesByName.put(BuyInProcedure.getCodeName().get(), BuyInProcedure);
		codesByName.put(CancellationConfirmationRequested.getCodeName().get(), CancellationConfirmationRequested);
		codesByName.put(WrongCertificatesNumbers.getCodeName().get(), WrongCertificatesNumbers);
		codesByName.put(UnderObjection.getCodeName().get(), UnderObjection);
		codesByName.put(ConfirmationDiscrepency.getCodeName().get(), ConfirmationDiscrepency);
		codesByName.put(CounterpartyTooLateForSettlement.getCodeName().get(), CounterpartyTooLateForSettlement);
		codesByName.put(MoneySecuritiesTooLateForSettlement.getCodeName().get(), MoneySecuritiesTooLateForSettlement);
		codesByName.put(NextProcess.getCodeName().get(), NextProcess);
		codesByName.put(AwaitingConfirmation.getCodeName().get(), AwaitingConfirmation);
		codesByName.put(SystemOnHold.getCodeName().get(), SystemOnHold);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
		codesByName.put(CancelNotPossible.getCodeName().get(), CancelNotPossible);
		codesByName.put(CSDHold.getCodeName().get(), CSDHold);
		codesByName.put(ConditionalDelivery.getCodeName().get(), ConditionalDelivery);
		codesByName.put(CSDValidation.getCodeName().get(), CSDValidation);
		codesByName.put(ConditionalDeliveryAwaitingRelease.getCodeName().get(), ConditionalDeliveryAwaitingRelease);
		codesByName.put(IncompleteNumberCount.getCodeName().get(), IncompleteNumberCount);
		codesByName.put(ConditionalDeliveryAwaitingCancellation.getCodeName().get(), ConditionalDeliveryAwaitingCancellation);
		codesByName.put(ConditionalDeliveryCancellationPending.getCodeName().get(), ConditionalDeliveryCancellationPending);
		codesByName.put(PendingBeneficiaryOwnerDetails.getCodeName().get(), PendingBeneficiaryOwnerDetails);
		codesByName.put(DisagreementOnCashAmount.getCodeName().get(), DisagreementOnCashAmount);
	}

	public static PendingFailingReasonV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingFailingReasonV2Code[] values() {
		PendingFailingReasonV2Code[] values = new PendingFailingReasonV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingFailingReasonV2Code> {
		@Override
		public PendingFailingReasonV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingFailingReasonV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}