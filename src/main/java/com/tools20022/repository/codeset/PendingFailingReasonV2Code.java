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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingMoney
 * PendingFailingReasonV2Code.mmAwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAccountServicerDeadlineMissed
 * PendingFailingReasonV2Code.mmAccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmSentToTaxAuthorities
 * PendingFailingReasonV2Code.mmSentToTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingSecurities
 * PendingFailingReasonV2Code.mmAwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmInstructionRefusedOrNotRecognised
 * PendingFailingReasonV2Code.mmInstructionRefusedOrNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingSecuritiesFromCounterparty
 * PendingFailingReasonV2Code.mmAwaitingSecuritiesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmPhysicalDeliveryDelay
 * PendingFailingReasonV2Code.mmPhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmTradeAmendedInMarket
 * PendingFailingReasonV2Code.mmTradeAmendedInMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingDocumentsOrEndorsementsFromYou
 * PendingFailingReasonV2Code.mmAwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingFailingReasonV2Code.mmAwaitingDocumentsOrEndorsementsFromCounterparty}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAccountBlocked
 * PendingFailingReasonV2Code.mmAccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmEnquirySent
 * PendingFailingReasonV2Code.mmEnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNewIssues
 * PendingFailingReasonV2Code.mmNewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCounterpartyInsufficientSecurities
 * PendingFailingReasonV2Code.mmCounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmMultipleSettlementAmount
 * PendingFailingReasonV2Code.mmMultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmGlobalFormSecurities
 * PendingFailingReasonV2Code.mmGlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmYourInstructionOnHold
 * PendingFailingReasonV2Code.mmYourInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmGuaranteedDeliveryIndicatorDifference
 * PendingFailingReasonV2Code.mmGuaranteedDeliveryIndicatorDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmTradeSettlesInPartials
 * PendingFailingReasonV2Code.mmTradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNoMatchingRequired
 * PendingFailingReasonV2Code.mmNoMatchingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCounterpartyInsufficientMoney
 * PendingFailingReasonV2Code.mmCounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCollateralShortage
 * PendingFailingReasonV2Code.mmCollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmSecuritiesPledgedAsCollateral
 * PendingFailingReasonV2Code.mmSecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmRefusedDepositForIssueOfDepositaryReceipts
 * PendingFailingReasonV2Code.mmRefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmMaximumForeignLimitReached
 * PendingFailingReasonV2Code.mmMaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNoForeignExchangeInstruction
 * PendingFailingReasonV2Code.mmNoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmIncomeAdjustementRequired
 * PendingFailingReasonV2Code.mmIncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmPendingLinkedInstruction
 * PendingFailingReasonV2Code.mmPendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingSettlementDate
 * PendingFailingReasonV2Code.mmAwaitingSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmLackOfSecurities
 * PendingFailingReasonV2Code.mmLackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmSecuritiesLoanedOut
 * PendingFailingReasonV2Code.mmSecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmInsufficientMoney
 * PendingFailingReasonV2Code.mmInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConfirmationNotReceived
 * PendingFailingReasonV2Code.mmConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNotInGoodOrder
 * PendingFailingReasonV2Code.mmNotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmLackOfStampDutyInformation
 * PendingFailingReasonV2Code.mmLackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmProcessingBatchDifference
 * PendingFailingReasonV2Code.mmProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingNextSettlementCycle
 * PendingFailingReasonV2Code.mmAwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmSecuritiesBlocked
 * PendingFailingReasonV2Code.mmSecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCounterpartyInReceivership
 * PendingFailingReasonV2Code.mmCounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmMinimumSettlementAmount
 * PendingFailingReasonV2Code.mmMinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmPendingCAP
 * PendingFailingReasonV2Code.mmPendingCAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmStatusReasonInvestigation
 * PendingFailingReasonV2Code.mmStatusReasonInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmOther
 * PendingFailingReasonV2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmPhysicalSecuritiesVerification
 * PendingFailingReasonV2Code.mmPhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmMissingInformation
 * PendingFailingReasonV2Code.mmMissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAccountNotOpen
 * PendingFailingReasonV2Code.mmAccountNotOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmUnderInvestigation
 * PendingFailingReasonV2Code.mmUnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmUnderClientInvestigation
 * PendingFailingReasonV2Code.mmUnderClientInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmUnderTransferAgentInvestigation
 * PendingFailingReasonV2Code.mmUnderTransferAgentInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingTransferAgentStatus
 * PendingFailingReasonV2Code.mmAwaitingTransferAgentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmUsualTransactionTime
 * PendingFailingReasonV2Code.mmUsualTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingStatus
 * PendingFailingReasonV2Code.mmAwaitingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmApplicationFormSent
 * PendingFailingReasonV2Code.mmApplicationFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmStockTransferFormSent
 * PendingFailingReasonV2Code.mmStockTransferFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmLongerProcessing
 * PendingFailingReasonV2Code.mmLongerProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAdditionalDocumentsRequested
 * PendingFailingReasonV2Code.mmAdditionalDocumentsRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAdditionalDocumentsSent1
 * PendingFailingReasonV2Code.mmAdditionalDocumentsSent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAdditionalDocumentsSent2
 * PendingFailingReasonV2Code.mmAdditionalDocumentsSent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmDocumentsRejected
 * PendingFailingReasonV2Code.mmDocumentsRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingCounterpartyReceipt
 * PendingFailingReasonV2Code.mmAwaitingCounterpartyReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingCounterpartyDelivery
 * PendingFailingReasonV2Code.mmAwaitingCounterpartyDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNormalProcessingPeriodLapsed
 * PendingFailingReasonV2Code.mmNormalProcessingPeriodLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmWrongCounterpartyAccount
 * PendingFailingReasonV2Code.mmWrongCounterpartyAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmTransferAgentProcessing
 * PendingFailingReasonV2Code.mmTransferAgentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmExpectedConfirmation
 * PendingFailingReasonV2Code.mmExpectedConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmEscalation
 * PendingFailingReasonV2Code.mmEscalation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmTransferAgentNonReceipt
 * PendingFailingReasonV2Code.mmTransferAgentNonReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmFinalVerification
 * PendingFailingReasonV2Code.mmFinalVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmBeneficialOwnershipDisagreement
 * PendingFailingReasonV2Code.mmBeneficialOwnershipDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmBothInstructionsOnHold
 * PendingFailingReasonV2Code.mmBothInstructionsOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmClearingHouseTrade
 * PendingFailingReasonV2Code.mmClearingHouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConfirmationOfPayment
 * PendingFailingReasonV2Code.mmConfirmationOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmUnavailableDeliverableDenominatedQuantity
 * PendingFailingReasonV2Code.mmUnavailableDeliverableDenominatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNaturalDisaster
 * PendingFailingReasonV2Code.mmNaturalDisaster}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCounterpartyReturnedShares
 * PendingFailingReasonV2Code.mmCounterpartyReturnedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmQuantityDisagreement
 * PendingFailingReasonV2Code.mmQuantityDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmSecuritiesFrozenAtCSD
 * PendingFailingReasonV2Code.mmSecuritiesFrozenAtCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingOtherTransaction
 * PendingFailingReasonV2Code.mmAwaitingOtherTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmMarketDeadlineMissed
 * PendingFailingReasonV2Code.mmMarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmInsufficientCentralBankLiquidity
 * PendingFailingReasonV2Code.mmInsufficientCentralBankLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmMissingCertification
 * PendingFailingReasonV2Code.mmMissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNoPayment
 * PendingFailingReasonV2Code.mmNoPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNotDelivered
 * PendingFailingReasonV2Code.mmNotDelivered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmPendingReceipt
 * PendingFailingReasonV2Code.mmPendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCounterpartyInstructionOnHold
 * PendingFailingReasonV2Code.mmCounterpartyInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCertificatesRejected
 * PendingFailingReasonV2Code.mmCertificatesRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmSettlementSystemMethodModified
 * PendingFailingReasonV2Code.mmSettlementSystemMethodModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmValidForTaxAuthorities
 * PendingFailingReasonV2Code.mmValidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmBuyInProcedure
 * PendingFailingReasonV2Code.mmBuyInProcedure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCancellationConfirmationRequested
 * PendingFailingReasonV2Code.mmCancellationConfirmationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmWrongCertificatesNumbers
 * PendingFailingReasonV2Code.mmWrongCertificatesNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmUnderObjection
 * PendingFailingReasonV2Code.mmUnderObjection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConfirmationDiscrepency
 * PendingFailingReasonV2Code.mmConfirmationDiscrepency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCounterpartyTooLateForSettlement
 * PendingFailingReasonV2Code.mmCounterpartyTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmMoneySecuritiesTooLateForSettlement
 * PendingFailingReasonV2Code.mmMoneySecuritiesTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmNextProcess
 * PendingFailingReasonV2Code.mmNextProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmAwaitingConfirmation
 * PendingFailingReasonV2Code.mmAwaitingConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmSystemOnHold
 * PendingFailingReasonV2Code.mmSystemOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConditionalRealignement
 * PendingFailingReasonV2Code.mmConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConditionalCurrency
 * PendingFailingReasonV2Code.mmConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConditionalRegistrar
 * PendingFailingReasonV2Code.mmConditionalRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCancelNotPossible
 * PendingFailingReasonV2Code.mmCancelNotPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCSDHold
 * PendingFailingReasonV2Code.mmCSDHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConditionalDelivery
 * PendingFailingReasonV2Code.mmConditionalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmCSDValidation
 * PendingFailingReasonV2Code.mmCSDValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConditionalDeliveryAwaitingRelease
 * PendingFailingReasonV2Code.mmConditionalDeliveryAwaitingRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmIncompleteNumberCount
 * PendingFailingReasonV2Code.mmIncompleteNumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConditionalDeliveryAwaitingCancellation
 * PendingFailingReasonV2Code.mmConditionalDeliveryAwaitingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmConditionalDeliveryCancellationPending
 * PendingFailingReasonV2Code.mmConditionalDeliveryCancellationPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmPendingBeneficiaryOwnerDetails
 * PendingFailingReasonV2Code.mmPendingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code#mmDisagreementOnCashAmount
 * PendingFailingReasonV2Code.mmDisagreementOnCashAmount}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class PendingFailingReasonV2Code {

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
	public static final MMCode mmAwaitingMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			definition = "Financial instruments are delivered, but still awaiting money from counterparty.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Instruction was received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmSentToTaxAuthorities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToTaxAuthorities";
			definition = "Tax reclaim has been sent to the tax authorities.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmInstructionRefusedOrNotRecognised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			definition = "Instruction has been refused or not recognised and is represented automatically.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingSecuritiesFromCounterparty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			definition = "Financial instruments have not yet been received from the counterparty (if receive against payment trade), the money has been delivered.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmPhysicalDeliveryDelay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical. Financial instruments are being delivered.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmTradeAmendedInMarket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmendedInMarket";
			definition = "Trade is being amended in the market.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingDocumentsOrEndorsementsFromYou = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			definition = "Awaiting documents or endorsements from you.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingDocumentsOrEndorsementsFromCounterparty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			definition = "Awaiting documents or endorsements from counterparty.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAccountBlocked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			definition = "Your account is blocked, no instruction can settle over the account.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmEnquirySent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnquirySent";
			definition = "A chaser/enquiry has been sent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNewIssues = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssues";
			definition = "Financial instrument is a new issue and not yet available/tradable.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCounterpartyInsufficientSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			definition = "Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmMultipleSettlementAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmGlobalFormSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Settlement cannot be executed; financial instruments are in global form.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmYourInstructionOnHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YourInstructionOnHold";
			definition = "Your instruction is a preadvice, that is, for matching only.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmGuaranteedDeliveryIndicatorDifference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			definition = "Guaranteed delivery indicator differs in the counterparty's instruction.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmTradeSettlesInPartials = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlesInPartials";
			definition = "Trade will settle in partials.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNoMatchingRequired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingRequired";
			definition = "Instruction has not been matched; matching process is not required.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCounterpartyInsufficientMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in counterparty's account.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCollateralShortage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			definition = "Insufficient collateral in your account to execute the instruction.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmSecuritiesPledgedAsCollateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			definition = "Financial instruments are not deliverable as they are pledged as collateral.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmRefusedDepositForIssueOfDepositaryReceipts = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuing of depositary receipts has been refused. The allotment granted by the issuer is exceeded by your transaction.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmMaximumForeignLimitReached = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNoForeignExchangeInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "A foreign exchange instruction from you is missing.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmIncomeAdjustementRequired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Financial instruments require income adjustment, for example, dividend or interest.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmPendingLinkedInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Your instruction is pending settlement because the instruction linked to it is pending.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingSettlementDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSettlementDate";
			definition = "Awaiting settlement date. No settlement problems to be reported.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmLackOfSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			definition = "Insufficient financial instruments in your account.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmSecuritiesLoanedOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Financial instruments are out on loan.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmInsufficientMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConfirmationNotReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Confirmation of settlement has not yet been received.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNotInGoodOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt was refused because physical financial instruments are not in good order.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmLackOfStampDutyInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Stamp duty information is missing.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmProcessingBatchDifference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, for example, daytime/real-time versus overnight.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingNextSettlementCycle = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmSecuritiesBlocked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Financial instruments are blocked due to a corporate action event, realignment, etc.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCounterpartyInReceivership = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership (form of bankruptcy where a court appointed person - the receiver - manages the affairs of the business).";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmMinimumSettlementAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmPendingCAP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCAP";
			definition = "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmStatusReasonInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			definition = "Pending reason being investigated.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmPhysicalSecuritiesVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			definition = "Physical financial instruments have been received and are being checked for authenticity.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmMissingInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			definition = "Information, for example, telephone number, contact person, is missing.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAccountNotOpen = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotOpen";
			definition = "Account must already be opened in order to process the transfer.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmUnderInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			definition = "Intermediary is investigating the reason why the transfer is pending.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmUnderClientInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderClientInvestigation";
			definition = "Client has been informed of a problem and is investigating.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmUnderTransferAgentInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderTransferAgentInvestigation";
			definition = "Transfer agent is investigating.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingTransferAgentStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingTransferAgentStatus";
			definition = "Transfer is being processed by the transfer agent, awaiting status from transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmUsualTransactionTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsualTransactionTime";
			definition = "Usual transfer agent's processing timeframe.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingStatus";
			definition = "At your request, the Intermediary is checking the status of your instruction with the transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmApplicationFormSent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationFormSent";
			definition = "Application form has been sent to the transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmStockTransferFormSent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockTransferFormSent";
			definition = "Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmLongerProcessing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongerProcessing";
			definition = "Longer processing timeframe for this type of transfer, due to documentation requirements.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAdditionalDocumentsRequested = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsRequested";
			definition = "Additional documents have been requested by the transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAdditionalDocumentsSent1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent1";
			definition = "Additional documents have been sent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAdditionalDocumentsSent2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent2";
			definition = "Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmDocumentsRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentsRejected";
			definition = "Documents are rejected by the transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingCounterpartyReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			definition = "Counterparty has not sent an instruction to receive. Check with counterparty.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingCounterpartyDelivery = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyDelivery";
			definition = "Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNormalProcessingPeriodLapsed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			definition = "The instructed position exceeds the eligible balance.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmWrongCounterpartyAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCounterpartyAccount";
			definition = "Wrong counterparty account details.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmTransferAgentProcessing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentProcessing";
			definition = "Transfer is being processed by transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmExpectedConfirmation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedConfirmation";
			definition = "Confirmation is expected from transfer agent.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmEscalation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escalation";
			definition = "Special follow-up is taking place.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmTransferAgentNonReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentNonReceipt";
			definition = "Transfer agent claims non-receipt of physical shares.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmFinalVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalVerification";
			definition = "Confirmed but finality is to be verified.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmBeneficialOwnershipDisagreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			definition = "Disagreement in beneficial ownership.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmBothInstructionsOnHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothInstructionsOnHold";
			definition = "Counterparty's instruction and your instruction are on hold/frozen/ in a preadvice mode.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmClearingHouseTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseTrade";
			definition = "Instructed settlement date does not agree with the settlement date on the clearing house trade, that is, a specific type of trade in India.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConfirmationOfPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfPayment";
			definition = "Prior payment credited to account based contractual income collection agreement has been collected from issuer.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmUnavailableDeliverableDenominatedQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			definition = "Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNaturalDisaster = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalDisaster";
			definition = "Exceptional closing of all financial institutions due to natural disaster, for example, earthquake.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCounterpartyReturnedShares = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReturnedShares";
			definition = "Counterparty has returned or refuses the securities.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmQuantityDisagreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDisagreement";
			definition = "Quantity of financial instruments does not match.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmSecuritiesFrozenAtCSD = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFrozenAtCSD";
			definition = "Financial instruments are blocked at the Central Security Depository (CSD) following a corporate event.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingOtherTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingOtherTransaction";
			definition = "Awaiting settlement of a purchase to cover failing positions.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmMarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmInsufficientCentralBankLiquidity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			definition = "Central bank liquidity is insufficient.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmMissingCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			definition = "Awaiting receipt of adequate certification.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNoPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPayment";
			definition = "Payment has not been made by issuer.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNotDelivered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDelivered";
			definition = "Financial instruments have not been delivered by the issuer.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmPendingReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			definition = "The instruction is pending receipt of securities, for example, from a purchase, loan etc.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCounterpartyInstructionOnHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInstructionOnHold";
			definition = "Counterparty's instruction is a preadvice, that is, for matching only.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCertificatesRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesRejected";
			definition = "Certificates have been lodged with the registrar but rejected due to incomplete documentation or foreign ownership limitation reached.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmSettlementSystemMethodModified = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodModified";
			definition = "Settlement system/method has been modified at central securities depository to allow settlement.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmValidForTaxAuthorities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidForTaxAuthorities";
			definition = "For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmBuyInProcedure = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInProcedure";
			definition = "Buy-in procedure has started on the market (on your behalf if your instruction is a receipt, by the counterparty if your instruction is a delivery).";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCancellationConfirmationRequested = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationConfirmationRequested";
			definition = "Instruction was in suspense. Suspense period is finished so your cancellation or confirmation of instruction is required.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmWrongCertificatesNumbers = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			definition = "Certificate number error.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmUnderObjection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderObjection";
			definition = "Financial instruments are stolen, in dispute, under objection etc.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConfirmationDiscrepency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDiscrepency";
			definition = "Discrepancy in the settlement confirmation.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCounterpartyTooLateForSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForSettlement";
			definition = "Counterparty's instruction was too late for settlement, that is the matching or settlement problems was solved too late.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmMoneySecuritiesTooLateForSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneySecuritiesTooLateForSettlement";
			definition = "Covering money/financial instruments were received too late for completing settlement on a same day basis.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmNextProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextProcess";
			definition = "Next process is launched. No processing pending problems to be reported.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmAwaitingConfirmation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingConfirmation";
			definition = "Awaiting confirmation from the counterparty.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmSystemOnHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemOnHold";
			definition = "Transaction was put on hold/frozen by the system.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConditionalRealignement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is conditional to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConditionalCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is conditional to the execution of a process linked to the currency of the transaction.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConditionalRegistrar = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is conditional to the execution of a process at the registrar.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCancelNotPossible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelNotPossible";
			definition = "Instruction has been processed and cannot be cancelled.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	 * "Central securities depository sets the  instruction in a hold/frozen/preadvice mode."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCSDHold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDHold";
			definition = "Central securities depository sets the  instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConditionalDelivery = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDelivery";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmCSDValidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidation";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConditionalDeliveryAwaitingRelease = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingRelease";
			definition = "Instruction is in a hold/frozen/preadvice mode. Market infrastructure platform is awaiting release.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmIncompleteNumberCount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			definition = "Not all the instructions part of a pool have been received.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConditionalDeliveryAwaitingCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingCancellation";
			definition = "Awaiting cancellation of one of the party.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmConditionalDeliveryCancellationPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryCancellationPending";
			definition = "Conditional Delivery is still pending awaiting the cancellation from at least another party.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmPendingBeneficiaryOwnerDetails = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBeneficiaryOwnerDetails";
			definition = "Pending receipt of beneficiary owner details.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
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
	public static final MMCode mmDisagreementOnCashAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementOnCashAmount";
			definition = "Unrecognised or invalid instructed cash amount.";
			owner_lazy = () -> PendingFailingReasonV2Code.mmObject();
			codeName = "DQCS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingFailingReasonV2Code";
				definition = "Specifies the reason the transaction/instruction is pending or failing settlement. Settlement on the instructed settlement date is still possible, status is pending. Settlement on the instructed settlement date is no longer possible, status is failing.";
				code_lazy = () -> Arrays.asList(PendingFailingReasonV2Code.mmAwaitingMoney, PendingFailingReasonV2Code.mmAccountServicerDeadlineMissed, PendingFailingReasonV2Code.mmSentToTaxAuthorities,
						PendingFailingReasonV2Code.mmAwaitingSecurities, PendingFailingReasonV2Code.mmInstructionRefusedOrNotRecognised, PendingFailingReasonV2Code.mmAwaitingSecuritiesFromCounterparty,
						PendingFailingReasonV2Code.mmPhysicalDeliveryDelay, PendingFailingReasonV2Code.mmTradeAmendedInMarket, PendingFailingReasonV2Code.mmAwaitingDocumentsOrEndorsementsFromYou,
						PendingFailingReasonV2Code.mmAwaitingDocumentsOrEndorsementsFromCounterparty, PendingFailingReasonV2Code.mmAccountBlocked, PendingFailingReasonV2Code.mmEnquirySent, PendingFailingReasonV2Code.mmNewIssues,
						PendingFailingReasonV2Code.mmCounterpartyInsufficientSecurities, PendingFailingReasonV2Code.mmMultipleSettlementAmount, PendingFailingReasonV2Code.mmGlobalFormSecurities,
						PendingFailingReasonV2Code.mmYourInstructionOnHold, PendingFailingReasonV2Code.mmGuaranteedDeliveryIndicatorDifference, PendingFailingReasonV2Code.mmTradeSettlesInPartials,
						PendingFailingReasonV2Code.mmNoMatchingRequired, PendingFailingReasonV2Code.mmCounterpartyInsufficientMoney, PendingFailingReasonV2Code.mmCollateralShortage,
						PendingFailingReasonV2Code.mmSecuritiesPledgedAsCollateral, PendingFailingReasonV2Code.mmRefusedDepositForIssueOfDepositaryReceipts, PendingFailingReasonV2Code.mmMaximumForeignLimitReached,
						PendingFailingReasonV2Code.mmNoForeignExchangeInstruction, PendingFailingReasonV2Code.mmIncomeAdjustementRequired, PendingFailingReasonV2Code.mmPendingLinkedInstruction,
						PendingFailingReasonV2Code.mmAwaitingSettlementDate, PendingFailingReasonV2Code.mmLackOfSecurities, PendingFailingReasonV2Code.mmSecuritiesLoanedOut, PendingFailingReasonV2Code.mmInsufficientMoney,
						PendingFailingReasonV2Code.mmConfirmationNotReceived, PendingFailingReasonV2Code.mmNotInGoodOrder, PendingFailingReasonV2Code.mmLackOfStampDutyInformation, PendingFailingReasonV2Code.mmProcessingBatchDifference,
						PendingFailingReasonV2Code.mmAwaitingNextSettlementCycle, PendingFailingReasonV2Code.mmSecuritiesBlocked, PendingFailingReasonV2Code.mmCounterpartyInReceivership,
						PendingFailingReasonV2Code.mmMinimumSettlementAmount, PendingFailingReasonV2Code.mmPendingCAP, PendingFailingReasonV2Code.mmStatusReasonInvestigation, PendingFailingReasonV2Code.mmOther,
						PendingFailingReasonV2Code.mmPhysicalSecuritiesVerification, PendingFailingReasonV2Code.mmMissingInformation, PendingFailingReasonV2Code.mmAccountNotOpen, PendingFailingReasonV2Code.mmUnderInvestigation,
						PendingFailingReasonV2Code.mmUnderClientInvestigation, PendingFailingReasonV2Code.mmUnderTransferAgentInvestigation, PendingFailingReasonV2Code.mmAwaitingTransferAgentStatus,
						PendingFailingReasonV2Code.mmUsualTransactionTime, PendingFailingReasonV2Code.mmAwaitingStatus, PendingFailingReasonV2Code.mmApplicationFormSent, PendingFailingReasonV2Code.mmStockTransferFormSent,
						PendingFailingReasonV2Code.mmLongerProcessing, PendingFailingReasonV2Code.mmAdditionalDocumentsRequested, PendingFailingReasonV2Code.mmAdditionalDocumentsSent1, PendingFailingReasonV2Code.mmAdditionalDocumentsSent2,
						PendingFailingReasonV2Code.mmDocumentsRejected, PendingFailingReasonV2Code.mmAwaitingCounterpartyReceipt, PendingFailingReasonV2Code.mmAwaitingCounterpartyDelivery,
						PendingFailingReasonV2Code.mmNormalProcessingPeriodLapsed, PendingFailingReasonV2Code.mmWrongCounterpartyAccount, PendingFailingReasonV2Code.mmTransferAgentProcessing,
						PendingFailingReasonV2Code.mmExpectedConfirmation, PendingFailingReasonV2Code.mmEscalation, PendingFailingReasonV2Code.mmTransferAgentNonReceipt, PendingFailingReasonV2Code.mmFinalVerification,
						PendingFailingReasonV2Code.mmBeneficialOwnershipDisagreement, PendingFailingReasonV2Code.mmBothInstructionsOnHold, PendingFailingReasonV2Code.mmClearingHouseTrade, PendingFailingReasonV2Code.mmConfirmationOfPayment,
						PendingFailingReasonV2Code.mmUnavailableDeliverableDenominatedQuantity, PendingFailingReasonV2Code.mmNaturalDisaster, PendingFailingReasonV2Code.mmCounterpartyReturnedShares,
						PendingFailingReasonV2Code.mmQuantityDisagreement, PendingFailingReasonV2Code.mmSecuritiesFrozenAtCSD, PendingFailingReasonV2Code.mmAwaitingOtherTransaction, PendingFailingReasonV2Code.mmMarketDeadlineMissed,
						PendingFailingReasonV2Code.mmInsufficientCentralBankLiquidity, PendingFailingReasonV2Code.mmMissingCertification, PendingFailingReasonV2Code.mmNoPayment, PendingFailingReasonV2Code.mmNotDelivered,
						PendingFailingReasonV2Code.mmPendingReceipt, PendingFailingReasonV2Code.mmCounterpartyInstructionOnHold, PendingFailingReasonV2Code.mmCertificatesRejected,
						PendingFailingReasonV2Code.mmSettlementSystemMethodModified, PendingFailingReasonV2Code.mmValidForTaxAuthorities, PendingFailingReasonV2Code.mmBuyInProcedure,
						PendingFailingReasonV2Code.mmCancellationConfirmationRequested, PendingFailingReasonV2Code.mmWrongCertificatesNumbers, PendingFailingReasonV2Code.mmUnderObjection,
						PendingFailingReasonV2Code.mmConfirmationDiscrepency, PendingFailingReasonV2Code.mmCounterpartyTooLateForSettlement, PendingFailingReasonV2Code.mmMoneySecuritiesTooLateForSettlement,
						PendingFailingReasonV2Code.mmNextProcess, PendingFailingReasonV2Code.mmAwaitingConfirmation, PendingFailingReasonV2Code.mmSystemOnHold, PendingFailingReasonV2Code.mmConditionalRealignement,
						PendingFailingReasonV2Code.mmConditionalCurrency, PendingFailingReasonV2Code.mmConditionalRegistrar, PendingFailingReasonV2Code.mmCancelNotPossible, PendingFailingReasonV2Code.mmCSDHold,
						PendingFailingReasonV2Code.mmConditionalDelivery, PendingFailingReasonV2Code.mmCSDValidation, PendingFailingReasonV2Code.mmConditionalDeliveryAwaitingRelease, PendingFailingReasonV2Code.mmIncompleteNumberCount,
						PendingFailingReasonV2Code.mmConditionalDeliveryAwaitingCancellation, PendingFailingReasonV2Code.mmConditionalDeliveryCancellationPending, PendingFailingReasonV2Code.mmPendingBeneficiaryOwnerDetails,
						PendingFailingReasonV2Code.mmDisagreementOnCashAmount);
				derivation_lazy = () -> Arrays.asList(PendingReason14Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}