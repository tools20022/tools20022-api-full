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
import com.tools20022.repository.choice.CardTransaction1Choice;
import com.tools20022.repository.choice.CardTransaction2Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode;
import com.tools20022.repository.codeset.TypeOfAmountCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment through an electronic money product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPayment" src="doc-files/CardPayment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#PaymentCard
 * CardPayment.PaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Product
 * CardPayment.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#DetailedAmount
 * CardPayment.DetailedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#AmountQualifier
 * CardPayment.AmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentAcquiring
 * CardPayment.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#PaymentCardPartyRole
 * CardPayment.PaymentCardPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentStatus
 * CardPayment.CardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#DetailedAmountLabel
 * CardPayment.DetailedAmountLabel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Reconciliation
 * CardPayment.Reconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#TransactionCategory
 * CardPayment.TransactionCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#CashBackAmount
 * CardPayment.CashBackAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Gratuity
 * CardPayment.Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#DebitCreditDirection
 * CardPayment.DebitCreditDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#ATMTotal
 * CardPayment.ATMTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#CardPayment
 * Product.CardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Payment
 * PaymentCard.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#CardPayment
 * CardPaymentPartyRole.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RelatedCardPayment
 * CardPaymentAcquiring.RelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#CardPaymentTotal
 * ReconciliationTransaction.CardPaymentTotal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#CardPayment
 * CardPaymentStatus.CardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#RelatedCardPayment
 * ATMTotal.RelatedCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#AggregatedEntry
 * CardEntry1.AggregatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction1Choice#Aggregated
 * CardTransaction1Choice.Aggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction1Choice#Individual
 * CardTransaction1Choice.Individual}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction1#Transaction
 * CardTransaction1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#CardTransaction
 * EntryTransaction3.CardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#CardTransaction
 * ReportEntry3.CardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#CardTransaction
 * EntryTransaction4.CardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#CardTransaction
 * ReportEntry4.CardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionData1#TransactionDetails
 * TransactionData1.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse1#Environment
 * AcceptorDiagnosticResponse1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse2#Environment
 * AcceptorDiagnosticResponse2.Environment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData1#Environment
 * CommonData1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#TransactionResult
 * CardPaymentTransaction8.TransactionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#OriginalTransaction
 * CardPaymentTransaction4.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#TransactionDetails
 * CardPaymentTransaction4.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1#Environment
 * CardPaymentDataSetTransaction1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1#Transaction
 * CardPaymentDataSetTransaction1.Transaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData2#Environment
 * CommonData2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#TransactionResult
 * CardPaymentTransaction17.TransactionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#OriginalTransaction
 * CardPaymentTransaction14.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#TransactionDetails
 * CardPaymentTransaction14.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2#Environment
 * CardPaymentDataSetTransaction2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2#Transaction
 * CardPaymentDataSetTransaction2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#OriginalTransaction
 * CardPaymentTransaction7.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#TransactionDetails
 * CardPaymentTransaction7.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#OriginalTransaction
 * CardPaymentTransaction16.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#TransactionDetails
 * CardPaymentTransaction16.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#OriginalTransaction
 * CardPaymentTransaction20.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#TransactionDetails
 * CardPaymentTransaction20.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3#Environment
 * CardPaymentDataSetTransaction3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3#Transaction
 * CardPaymentDataSetTransaction3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#OriginalTransaction
 * CardPaymentTransaction1.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#TransactionDetails
 * CardPaymentTransaction1.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#OriginalTransaction
 * CardPaymentTransaction11.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#TransactionDetails
 * CardPaymentTransaction11.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#OriginalTransaction
 * CardPaymentTransaction19.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#TransactionDetails
 * CardPaymentTransaction19.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4#Environment
 * CardPaymentDataSetTransaction4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4#Transaction
 * CardPaymentDataSetTransaction4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#TransactionDetails
 * CardPaymentTransaction2.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#TransactionDetails
 * CardPaymentTransaction12.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5#Environment
 * CardPaymentDataSetTransaction5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5#Transaction
 * CardPaymentDataSetTransaction5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5#TransactionResponse
 * CardPaymentDataSetTransaction5.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1#Environment
 * AcceptorCancellationAdviceResponse1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2#Environment
 * AcceptorCancellationAdviceResponse2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest1#Environment
 * AcceptorAuthorisationRequest1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest1#Transaction
 * AcceptorAuthorisationRequest1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest2#Environment
 * AcceptorAuthorisationRequest2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest2#Transaction
 * AcceptorAuthorisationRequest2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#Environment
 * AcceptorCompletionAdviceResponse1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2#Environment
 * AcceptorCompletionAdviceResponse2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#OriginalTransaction
 * CardPaymentTransaction5.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#TransactionDetails
 * CardPaymentTransaction5.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest1#Environment
 * AcceptorCancellationRequest1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest1#Transaction
 * AcceptorCancellationRequest1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#OriginalTransaction
 * CardPaymentTransaction15.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#TransactionDetails
 * CardPaymentTransaction15.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest2#Environment
 * AcceptorCancellationRequest2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest2#Transaction
 * AcceptorCancellationRequest2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#TransactionDetails
 * CardPaymentTransaction6.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse1#Environment
 * AcceptorCancellationResponse1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse1#Transaction
 * AcceptorCancellationResponse1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse1#TransactionResponse
 * AcceptorCancellationResponse1.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse2#Environment
 * AcceptorCancellationResponse2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse2#Transaction
 * AcceptorCancellationResponse2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse2#TransactionResponse
 * AcceptorCancellationResponse2.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest1#Environment
 * AcceptorDiagnosticRequest1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest2#Environment
 * AcceptorDiagnosticRequest2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#OriginalTransaction
 * CardPaymentTransaction3.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#TransactionDetails
 * CardPaymentTransaction3.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1#Environment
 * AcceptorCompletionAdvice1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1#Transaction
 * AcceptorCompletionAdvice1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#OriginalTransaction
 * CardPaymentTransaction13.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#TransactionDetails
 * CardPaymentTransaction13.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice2#Environment
 * AcceptorCompletionAdvice2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice2#Transaction
 * AcceptorCompletionAdvice2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice1#Environment
 * AcceptorCancellationAdvice1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice1#Transaction
 * AcceptorCancellationAdvice1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice2#Environment
 * AcceptorCancellationAdvice2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice2#Transaction
 * AcceptorCancellationAdvice2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1#Environment
 * AcceptorAuthorisationResponse1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1#Transaction
 * AcceptorAuthorisationResponse1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1#TransactionResponse
 * AcceptorAuthorisationResponse1.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse2#Environment
 * AcceptorAuthorisationResponse2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse2#Transaction
 * AcceptorAuthorisationResponse2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse2#TransactionResponse
 * AcceptorAuthorisationResponse2.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3#Environment
 * AcceptorDiagnosticResponse3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest1#Environment
 * AcceptorCurrencyConversionRequest1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest1#Transaction
 * AcceptorCurrencyConversionRequest1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3#Environment
 * AcceptorCancellationRequest3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3#Transaction
 * AcceptorCancellationRequest3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse3#Environment
 * AcceptorAuthorisationResponse3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse3#Transaction
 * AcceptorAuthorisationResponse3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse3#TransactionResponse
 * AcceptorAuthorisationResponse3.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest3#Environment
 * AcceptorDiagnosticRequest3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#Environment
 * AcceptorCurrencyConversionResponse1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#Transaction
 * AcceptorCurrencyConversionResponse1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#TransactionResponse
 * AcceptorCurrencyConversionResponse1.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#Environment
 * AcceptorCancellationAdviceResponse3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice3#Environment
 * AcceptorCompletionAdvice3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice3#Transaction
 * AcceptorCompletionAdvice3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest3#Environment
 * AcceptorAuthorisationRequest3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest3#Transaction
 * AcceptorAuthorisationRequest3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3#Environment
 * AcceptorCompletionAdviceResponse3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse3#Environment
 * AcceptorCancellationResponse3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse3#Transaction
 * AcceptorCancellationResponse3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse3#TransactionResponse
 * AcceptorCancellationResponse3.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#Environment
 * AcceptorCancellationAdvice3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#Transaction
 * AcceptorCancellationAdvice3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#IndividualPayment
 * AggregationTransaction1.IndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#OriginalTransaction
 * CardPaymentTransaction28.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#TransactionDetails
 * CardPaymentTransaction28.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#OriginalTransaction
 * CardPaymentTransaction22.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#TransactionDetails
 * CardPaymentTransaction22.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#OriginalTransaction
 * CardPaymentTransaction34.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#TransactionDetails
 * CardPaymentTransaction34.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#CashBack
 * DetailedAmount5.CashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#Gratuity
 * DetailedAmount5.Gratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#Fees
 * DetailedAmount5.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#Rebate
 * DetailedAmount5.Rebate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#ValueAddedTax
 * DetailedAmount5.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction9#Environment
 * CardPaymentDataSetTransaction9.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction9#Transaction
 * CardPaymentDataSetTransaction9.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction9#TransactionResponse
 * CardPaymentDataSetTransaction9.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#TransactionDetails
 * CardPaymentTransaction32.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#OriginalTransaction
 * CardPaymentTransaction31.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#TransactionDetails
 * CardPaymentTransaction31.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#TransactionDetails
 * CardPaymentTransaction35.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData3#Environment
 * CommonData3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#TransactionDetails
 * CardPaymentTransaction23.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction6#Environment
 * CardPaymentDataSetTransaction6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction6#Transaction
 * CardPaymentDataSetTransaction6.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction7#Environment
 * CardPaymentDataSetTransaction7.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction7#Transaction
 * CardPaymentDataSetTransaction7.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#Environment
 * CardPaymentDataSetTransaction8.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#Transaction
 * CardPaymentDataSetTransaction8.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#OriginalTransaction
 * CardPaymentTransaction29.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#TransactionDetails
 * CardPaymentTransaction29.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#OriginalTransaction
 * CardPaymentTransaction25.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#TransactionDetails
 * CardPaymentTransaction25.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#OriginalTransaction
 * CardPaymentTransaction30.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#TransactionDetails
 * CardPaymentTransaction30.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#OriginalTransaction
 * CardPaymentTransaction26.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#TransactionDetails
 * CardPaymentTransaction26.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#CardTransaction
 * ReportEntry7.CardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#CardTransaction
 * EntryTransaction7.CardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#Transaction
 * CardTransaction2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#Aggregated
 * CardTransaction2Choice.Aggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#Individual
 * CardTransaction2Choice.Individual}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#AggregatedEntry
 * CardEntry2.AggregatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest4#Environment
 * AcceptorCancellationRequest4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest4#Transaction
 * AcceptorCancellationRequest4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#Environment
 * AcceptorDiagnosticResponse4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest4#Environment
 * AcceptorAuthorisationRequest4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest4#Transaction
 * AcceptorAuthorisationRequest4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#Environment
 * AcceptorCurrencyConversionResponse2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#Transaction
 * AcceptorCurrencyConversionResponse2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#Environment
 * AcceptorAuthorisationResponse4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#Transaction
 * AcceptorAuthorisationResponse4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#TransactionResponse
 * AcceptorAuthorisationResponse4.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#Environment
 * AcceptorCancellationAdvice4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#Transaction
 * AcceptorCancellationAdvice4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse4#Environment
 * AcceptorCancellationResponse4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse4#Transaction
 * AcceptorCancellationResponse4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse4#TransactionResponse
 * AcceptorCancellationResponse4.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2#Environment
 * AcceptorCurrencyConversionRequest2.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2#Transaction
 * AcceptorCurrencyConversionRequest2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest4#Environment
 * AcceptorDiagnosticRequest4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice4#Environment
 * AcceptorCompletionAdvice4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice4#Transaction
 * AcceptorCompletionAdvice4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#Environment
 * AcceptorCancellationAdviceResponse4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4#Environment
 * AcceptorCompletionAdviceResponse4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#TransactionDetails
 * CardPaymentTransaction38.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#TransactionDetails
 * CardPaymentTransaction48.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#TransactionDetails
 * CardPaymentTransaction42.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#OriginalTransaction
 * CardPaymentTransaction36.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#TransactionDetails
 * CardPaymentTransaction36.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#OriginalTransaction
 * CardPaymentTransaction44.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#TransactionDetails
 * CardPaymentTransaction44.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#OriginalTransaction
 * CardPaymentTransaction45.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#TransactionDetails
 * CardPaymentTransaction45.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#CashBack
 * DetailedAmount7.CashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#Gratuity
 * DetailedAmount7.Gratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#Fees
 * DetailedAmount7.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#Rebate
 * DetailedAmount7.Rebate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#ValueAddedTax
 * DetailedAmount7.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#OriginalTransaction
 * CardPaymentTransaction49.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#TransactionDetails
 * CardPaymentTransaction49.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#Environment
 * CardPaymentDataSetTransaction12.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#Transaction
 * CardPaymentDataSetTransaction12.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#OriginalTransaction
 * CardPaymentTransaction47.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#TransactionDetails
 * CardPaymentTransaction47.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction13#Environment
 * CardPaymentDataSetTransaction13.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction13#Transaction
 * CardPaymentDataSetTransaction13.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction13#TransactionResponse
 * CardPaymentDataSetTransaction13.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#OriginalTransaction
 * CardPaymentTransaction41.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#TransactionDetails
 * CardPaymentTransaction41.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData4#Environment
 * CommonData4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction11#Environment
 * CardPaymentDataSetTransaction11.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction11#Transaction
 * CardPaymentDataSetTransaction11.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#OriginalTransaction
 * CardPaymentTransaction46.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#TransactionDetails
 * CardPaymentTransaction46.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction10#Environment
 * CardPaymentDataSetTransaction10.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction10#Transaction
 * CardPaymentDataSetTransaction10.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#OriginalTransaction
 * CardPaymentTransaction40.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionDetails
 * CardPaymentTransaction40.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#Fees
 * DetailedAmount12.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#Donation
 * DetailedAmount12.Donation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#DailyBalance
 * ATMTransactionAmounts2.DailyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#WeeklyBalance
 * ATMTransactionAmounts2.WeeklyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#MonthlyBalance
 * ATMTransactionAmounts2.MonthlyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#TransactionDetails
 * CardTransaction4.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction8#TransactionDetails
 * CardTransaction8.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#TransactionDetails
 * CardTransaction5.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#TransactionDetails
 * CardTransaction15.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction7#TransactionDetails
 * CardTransaction7.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction6#TransactionDetails
 * CardTransaction6.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#CardTransaction
 * ReportEntry8.CardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CardTransaction
 * EntryTransaction8.CardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#Environment
 * AcceptorCancellationAdviceResponse5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest5#Environment
 * AcceptorDiagnosticRequest5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#Environment
 * AcceptorCurrencyConversionResponse3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#Transaction
 * AcceptorCurrencyConversionResponse3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest3#Environment
 * AcceptorCurrencyConversionRequest3.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest3#Transaction
 * AcceptorCurrencyConversionRequest3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#Environment
 * AcceptorAuthorisationResponse5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#Transaction
 * AcceptorAuthorisationResponse5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#TransactionResponse
 * AcceptorAuthorisationResponse5.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse5#Environment
 * AcceptorCancellationResponse5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse5#Transaction
 * AcceptorCancellationResponse5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse5#TransactionResponse
 * AcceptorCancellationResponse5.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#Environment
 * AcceptorCancellationAdvice5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#Transaction
 * AcceptorCancellationAdvice5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5#Environment
 * AcceptorCompletionAdviceResponse5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest5#Environment
 * AcceptorAuthorisationRequest5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest5#Transaction
 * AcceptorAuthorisationRequest5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest5#Environment
 * AcceptorCancellationRequest5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest5#Transaction
 * AcceptorCancellationRequest5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice5#Environment
 * AcceptorCompletionAdvice5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice5#Transaction
 * AcceptorCompletionAdvice5.Transaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#CashBack
 * DetailedAmount15.CashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#Gratuity
 * DetailedAmount15.Gratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#Fees
 * DetailedAmount15.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#Rebate
 * DetailedAmount15.Rebate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#ValueAddedTax
 * DetailedAmount15.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#TransactionDetails
 * CardPaymentTransaction63.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#Environment
 * CardPaymentDataSetTransaction14.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#Transaction
 * CardPaymentDataSetTransaction14.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#OriginalTransaction
 * CardPaymentTransaction60.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#TransactionDetails
 * CardPaymentTransaction60.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#TransactionDetails
 * CardPaymentTransaction57.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#OriginalTransaction
 * CardPaymentTransaction61.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#TransactionDetails
 * CardPaymentTransaction61.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#OriginalTransaction
 * CardPaymentTransaction64.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#TransactionDetails
 * CardPaymentTransaction64.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#TransactionDetails
 * CardPaymentTransaction53.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#OriginalTransaction
 * CardPaymentTransaction59.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#TransactionDetails
 * CardPaymentTransaction59.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#OriginalTransaction
 * CardPaymentTransaction56.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#TransactionDetails
 * CardPaymentTransaction56.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15#Environment
 * CardPaymentDataSetTransaction15.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15#Transaction
 * CardPaymentDataSetTransaction15.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#IndividualPayment
 * AggregationTransaction2.IndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#OriginalTransaction
 * CardPaymentTransaction51.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#TransactionDetails
 * CardPaymentTransaction51.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#Environment
 * CardPaymentDataSetTransaction16.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#Transaction
 * CardPaymentDataSetTransaction16.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17#Environment
 * CardPaymentDataSetTransaction17.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17#Transaction
 * CardPaymentDataSetTransaction17.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17#TransactionResponse
 * CardPaymentDataSetTransaction17.TransactionResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData5#Environment
 * CommonData5.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#OriginalTransaction
 * CardPaymentTransaction55.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionDetails
 * CardPaymentTransaction55.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#OriginalTransaction
 * CardPaymentTransaction62.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#TransactionDetails
 * CardPaymentTransaction62.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#Fees
 * DetailedAmount16.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#Donation
 * DetailedAmount16.Donation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#Fees
 * DetailedAmount17.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#Donation
 * DetailedAmount17.Donation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#Environment
 * AcceptorCurrencyConversionResponse4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#Transaction
 * AcceptorCurrencyConversionResponse4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#Environment
 * AcceptorCancellationRequest6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#Transaction
 * AcceptorCancellationRequest6.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest6#Environment
 * AcceptorDiagnosticRequest6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#Environment
 * AcceptorCancellationAdviceResponse6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4#Environment
 * AcceptorCurrencyConversionRequest4.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4#Transaction
 * AcceptorCurrencyConversionRequest4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#Environment
 * AcceptorCancellationResponse6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#Transaction
 * AcceptorCancellationResponse6.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#TransactionResponse
 * AcceptorCancellationResponse6.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#Environment
 * AcceptorAuthorisationRequest6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#Transaction
 * AcceptorAuthorisationRequest6.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#Environment
 * AcceptorCancellationAdvice6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#Transaction
 * AcceptorCancellationAdvice6.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#Environment
 * AcceptorCompletionAdvice6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#Transaction
 * AcceptorCompletionAdvice6.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#Environment
 * AcceptorCompletionAdviceResponse6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#Environment
 * AcceptorAuthorisationResponse6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#Transaction
 * AcceptorAuthorisationResponse6.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#TransactionResponse
 * AcceptorAuthorisationResponse6.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#OriginalTransaction
 * CardPaymentTransaction71.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#TransactionDetails
 * CardPaymentTransaction71.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#Environment
 * CardPaymentDataSetTransaction19.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#Transaction
 * CardPaymentDataSetTransaction19.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#OriginalTransaction
 * CardPaymentTransaction75.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#TransactionDetails
 * CardPaymentTransaction75.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#OriginalTransaction
 * CardPaymentTransaction74.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#TransactionDetails
 * CardPaymentTransaction74.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#Environment
 * CardPaymentDataSetTransaction21.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#Transaction
 * CardPaymentDataSetTransaction21.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#TransactionResponse
 * CardPaymentDataSetTransaction21.TransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#OriginalTransaction
 * CardPaymentTransaction70.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#TransactionDetails
 * CardPaymentTransaction70.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#Environment
 * CardPaymentDataSetTransaction20.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#Transaction
 * CardPaymentDataSetTransaction20.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#OriginalTransaction
 * CardPaymentTransaction72.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#TransactionDetails
 * CardPaymentTransaction72.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#OriginalTransaction
 * CardPaymentTransaction76.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#TransactionDetails
 * CardPaymentTransaction76.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#Environment
 * CardPaymentDataSetTransaction18.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#Transaction
 * CardPaymentDataSetTransaction18.Transaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#Environment
 * CommonData6.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#OriginalTransaction
 * CardPaymentTransaction69.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionDetails
 * CardPaymentTransaction69.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#Environment
 * AcceptorCurrencyConversionAdvice1.Environment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#Transaction
 * AcceptorCurrencyConversionAdvice1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#TransactionDetails
 * CardPaymentTransaction77.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#TransactionDetails
 * CardPaymentTransaction78.TransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAggregated1
 * CardAggregated1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1 CardEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardIndividualTransaction1
 * CardIndividualTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CardTransaction1Choice
 * CardTransaction1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction1
 * CardTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAmountAndCurrencyExchange1
 * CardAmountAndCurrencyExchange1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8
 * CardPaymentTransactionDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment8
 * CardPaymentEnvironment8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse1
 * AcceptorDiagnosticResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment17
 * CardPaymentEnvironment17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse2
 * AcceptorDiagnosticResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment5
 * CardPaymentEnvironment5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData1 CommonData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6
 * CardPaymentEnvironment6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1
 * CardPaymentTransactionResult1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction8
 * CardPaymentTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount1
 * DetailedAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4
 * CardPaymentTransactionDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction4
 * CardPaymentTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1
 * CardPaymentDataSetTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment13
 * CardPaymentEnvironment13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData2 CommonData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14
 * CardPaymentEnvironment14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction17
 * CardPaymentTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction14
 * CardPaymentTransaction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2
 * CardPaymentDataSetTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7
 * CardPaymentTransactionDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction7
 * CardPaymentTransaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction16
 * CardPaymentTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9
 * CardPaymentTransactionDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction20
 * CardPaymentTransaction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3
 * CardPaymentDataSetTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1
 * CardPaymentTransactionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction1
 * CardPaymentTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction11
 * CardPaymentTransaction11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10
 * CardPaymentTransactionDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction19
 * CardPaymentTransaction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4
 * CardPaymentDataSetTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3
 * CardPaymentEnvironment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11
 * CardPaymentEnvironment11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16
 * CardPaymentEnvironment16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount2
 * DetailedAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2
 * CardPaymentTransactionDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction2
 * CardPaymentTransaction2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11
 * CardPaymentTransactionDetails11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction12
 * CardPaymentTransaction12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction9
 * CardPaymentTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction18
 * CardPaymentTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5
 * CardPaymentDataSetTransaction5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1
 * AcceptorCancellationAdviceResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2
 * AcceptorCancellationAdviceResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1
 * CardPaymentEnvironment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest1
 * AcceptorAuthorisationRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9
 * CardPaymentEnvironment9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest2
 * AcceptorAuthorisationRequest2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1
 * AcceptorCompletionAdviceResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2
 * AcceptorCompletionAdviceResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7
 * CardPaymentEnvironment7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment15
 * CardPaymentEnvironment15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19
 * CardPaymentEnvironment19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment4
 * CardPaymentEnvironment4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5
 * CardPaymentTransactionDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction5
 * CardPaymentTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest1
 * AcceptorCancellationRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12
 * CardPaymentEnvironment12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
 * CardPaymentTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest2
 * AcceptorCancellationRequest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails6
 * CardPaymentTransactionDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction6
 * CardPaymentTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction10
 * CardPaymentTransaction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse1
 * AcceptorCancellationResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse2
 * AcceptorCancellationResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest1
 * AcceptorDiagnosticRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest2
 * AcceptorDiagnosticRequest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2
 * CardPaymentEnvironment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3
 * CardPaymentTransactionDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction3
 * CardPaymentTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1
 * AcceptorCompletionAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10
 * CardPaymentEnvironment10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction13
 * CardPaymentTransaction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice2
 * AcceptorCompletionAdvice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice1
 * AcceptorCancellationAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18
 * CardPaymentEnvironment18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice2
 * AcceptorCancellationAdvice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1
 * AcceptorAuthorisationResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse2
 * AcceptorAuthorisationResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3
 * AcceptorDiagnosticResponse3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest1
 * AcceptorCurrencyConversionRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3
 * AcceptorCancellationRequest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse3
 * AcceptorAuthorisationResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest3
 * AcceptorDiagnosticRequest3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1
 * AcceptorCurrencyConversionResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3
 * AcceptorCancellationAdviceResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice3
 * AcceptorCompletionAdvice3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest3
 * AcceptorAuthorisationRequest3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3
 * AcceptorCompletionAdviceResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse3
 * AcceptorCancellationResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3
 * AcceptorCancellationAdvice3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount6
 * DetailedAmount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction28
 * CardPaymentTransaction28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction21
 * CardPaymentTransaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction22
 * CardPaymentTransaction22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12
 * CardPaymentTransactionDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction34
 * CardPaymentTransaction34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31
 * CardPaymentEnvironment31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment29
 * CardPaymentEnvironment29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24
 * CardPaymentEnvironment24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25
 * CardPaymentEnvironment25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction27
 * CardPaymentTransaction27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13
 * CardPaymentTransactionDetails13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18
 * CardPaymentTransactionDetails18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5
 * DetailedAmount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20
 * CardPaymentEnvironment20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30
 * CardPaymentEnvironment30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27
 * CardPaymentEnvironment27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction9
 * CardPaymentDataSetTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction24
 * CardPaymentTransaction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28
 * CardPaymentEnvironment28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction32
 * CardPaymentTransaction32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21
 * CardPaymentEnvironment21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction31
 * CardPaymentTransaction31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16
 * CardPaymentTransactionDetails16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14
 * CardPaymentTransactionDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction35
 * CardPaymentTransaction35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData3 CommonData3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount4
 * DetailedAmount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction33
 * CardPaymentTransaction33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15
 * CardPaymentTransactionDetails15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17
 * CardPaymentTransactionDetails17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction23
 * CardPaymentTransaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction6
 * CardPaymentDataSetTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction7
 * CardPaymentDataSetTransaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8
 * CardPaymentDataSetTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction29
 * CardPaymentTransaction29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment26
 * CardPaymentEnvironment26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23
 * CardPaymentEnvironment23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction25
 * CardPaymentTransaction25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction30
 * CardPaymentTransaction30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction26
 * CardPaymentTransaction26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
 * CardPaymentEnvironment22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection41
 * AmountAndDirection41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2
 * CardTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CardTransaction2Choice
 * CardTransaction2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
 * CardIndividualTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2 CardEntry2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest4
 * AcceptorCancellationRequest4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4
 * AcceptorDiagnosticResponse4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest4
 * AcceptorAuthorisationRequest4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2
 * AcceptorCurrencyConversionResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4
 * AcceptorAuthorisationResponse4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4
 * AcceptorCancellationAdvice4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse4
 * AcceptorCancellationResponse4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2
 * AcceptorCurrencyConversionRequest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest4
 * AcceptorDiagnosticRequest4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice4
 * AcceptorCompletionAdvice4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4
 * AcceptorCancellationAdviceResponse4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4
 * AcceptorCompletionAdviceResponse4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37
 * CardPaymentEnvironment37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction39
 * CardPaymentTransaction39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction38
 * CardPaymentTransaction38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33
 * CardPaymentEnvironment33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20
 * CardPaymentTransactionDetails20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction48
 * CardPaymentTransaction48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25
 * CardPaymentTransactionDetails25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction50
 * CardPaymentTransaction50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction43
 * CardPaymentTransaction43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction42
 * CardPaymentTransaction42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction36
 * CardPaymentTransaction36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
 * CardPaymentEnvironment32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction44
 * CardPaymentTransaction44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36
 * CardPaymentEnvironment36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43
 * CardPaymentEnvironment43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction45
 * CardPaymentTransaction45}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23
 * CardPaymentTransactionDetails23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction37
 * CardPaymentTransaction37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment41
 * CardPaymentEnvironment41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21
 * CardPaymentTransactionDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7
 * DetailedAmount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment42
 * CardPaymentEnvironment42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction49
 * CardPaymentTransaction49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26
 * CardPaymentTransactionDetails26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40
 * CardPaymentEnvironment40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12
 * CardPaymentDataSetTransaction12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction47
 * CardPaymentTransaction47}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19
 * CardPaymentTransactionDetails19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2
 * CardPaymentTransactionResult2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44
 * CardPaymentEnvironment44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
 * CardPaymentEnvironment34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction13
 * CardPaymentDataSetTransaction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35
 * CardPaymentEnvironment35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction41
 * CardPaymentTransaction41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24
 * CardPaymentTransactionDetails24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38
 * CardPaymentEnvironment38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData4 CommonData4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment39
 * CardPaymentEnvironment39}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction11
 * CardPaymentDataSetTransaction11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction46
 * CardPaymentTransaction46}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails22
 * CardPaymentTransactionDetails22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction10
 * CardPaymentDataSetTransaction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction40
 * CardPaymentTransaction40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction1
 * ATMTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndCurrency1
 * AmountAndCurrency1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12
 * DetailedAmount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction5
 * ATMTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction4
 * ATMTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction2
 * ATMTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction7
 * ATMTransaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8
 * ATMTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3
 * ATMTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount13
 * DetailedAmount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction6
 * ATMTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11
 * DetailedAmount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount10
 * DetailedAmount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount9
 * DetailedAmount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction4
 * CardTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount2
 * CardTransactionAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount8
 * DetailedAmount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount1
 * CardTransactionAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction8
 * CardTransaction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction5
 * CardTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction15
 * CardTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction7
 * CardTransaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail5
 * CardTransactionDetail5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail2
 * CardTransactionDetail2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail1
 * CardTransactionDetail1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction6
 * CardTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail4
 * CardTransactionDetail4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail6
 * CardTransactionDetail6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount5
 * CardTransactionAmount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount3
 * CardTransactionAmount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionAmount4
 * CardTransactionAmount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionDetail3
 * CardTransactionDetail3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5
 * AcceptorCancellationAdviceResponse5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest5
 * AcceptorDiagnosticRequest5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3
 * AcceptorCurrencyConversionResponse3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest3
 * AcceptorCurrencyConversionRequest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5
 * AcceptorAuthorisationResponse5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse5
 * AcceptorCancellationResponse5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5
 * AcceptorCancellationAdvice5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5
 * AcceptorCompletionAdviceResponse5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest5
 * AcceptorAuthorisationRequest5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest5
 * AcceptorCancellationRequest5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice5
 * AcceptorCompletionAdvice5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46
 * CardPaymentEnvironment46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50
 * CardPaymentEnvironment50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32
 * CardPaymentTransactionDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15
 * DetailedAmount15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33
 * CardPaymentTransactionDetails33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction52
 * CardPaymentTransaction52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult3
 * CardPaymentTransactionResult3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction63
 * CardPaymentTransaction63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14
 * CardPaymentDataSetTransaction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction60
 * CardPaymentTransaction60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52
 * CardPaymentEnvironment52}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28
 * CardPaymentTransactionDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction57
 * CardPaymentTransaction57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction61
 * CardPaymentTransaction61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction64
 * CardPaymentTransaction64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction65
 * CardPaymentTransaction65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction53
 * CardPaymentTransaction53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49
 * CardPaymentEnvironment49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction59
 * CardPaymentTransaction59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction56
 * CardPaymentTransaction56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment51
 * CardPaymentEnvironment51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15
 * CardPaymentDataSetTransaction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29
 * CardPaymentTransactionDetails29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30
 * CardPaymentTransactionDetails30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48
 * CardPaymentEnvironment48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56
 * CardPaymentEnvironment56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction51
 * CardPaymentTransaction51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45
 * CardPaymentEnvironment45}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16
 * CardPaymentDataSetTransaction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17
 * CardPaymentDataSetTransaction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27
 * CardPaymentTransactionDetails27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
 * CardPaymentTransactionDetails31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55
 * CardPaymentEnvironment55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData5 CommonData5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54
 * CardPaymentEnvironment54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53
 * CardPaymentEnvironment53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
 * CardPaymentTransaction54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount14
 * DetailedAmount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
 * CardPaymentEnvironment47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction55
 * CardPaymentTransaction55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction58
 * CardPaymentTransaction58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction62
 * CardPaymentTransaction62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails35
 * CardPaymentTransactionDetails35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34
 * CardPaymentTransactionDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction18
 * ATMTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction14
 * ATMTransaction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17
 * ATMTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction20
 * ATMTransaction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount18
 * DetailedAmount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction13
 * ATMTransaction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction16
 * ATMTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction19
 * ATMTransaction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16
 * DetailedAmount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction15
 * ATMTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction21
 * ATMTransaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24
 * ATMTransaction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17
 * DetailedAmount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction23
 * ATMTransaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction29
 * ATMTransaction29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4
 * AcceptorCurrencyConversionResponse4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6
 * AcceptorCancellationRequest6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest6
 * AcceptorDiagnosticRequest6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6
 * AcceptorCancellationAdviceResponse6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4
 * AcceptorCurrencyConversionRequest4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6
 * AcceptorCancellationResponse6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6
 * AcceptorAuthorisationRequest6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6
 * AcceptorCancellationAdvice6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6
 * AcceptorCompletionAdvice6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6
 * AcceptorCompletionAdviceResponse6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6
 * AcceptorAuthorisationResponse6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction71
 * CardPaymentTransaction71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39
 * CardPaymentTransactionDetails39}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19
 * CardPaymentDataSetTransaction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction75
 * CardPaymentTransaction75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61
 * CardPaymentEnvironment61}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38
 * CardPaymentTransactionDetails38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64
 * CardPaymentEnvironment64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60
 * CardPaymentEnvironment60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65
 * CardPaymentEnvironment65}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41
 * CardPaymentTransactionDetails41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
 * CardPaymentEnvironment67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66
 * CardPaymentEnvironment66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction74
 * CardPaymentTransaction74}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21
 * CardPaymentDataSetTransaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction67
 * CardPaymentTransaction67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction70
 * CardPaymentTransaction70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction73
 * CardPaymentTransaction73}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
 * CardPaymentDataSetTransaction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
 * CardPaymentEnvironment62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63
 * CardPaymentEnvironment63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction72
 * CardPaymentTransaction72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction76
 * CardPaymentTransaction76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction68
 * CardPaymentTransaction68}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
 * CardPaymentDataSetTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58
 * CardPaymentEnvironment58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59
 * CardPaymentEnvironment59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37
 * CardPaymentTransactionDetails37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData6 CommonData6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57
 * CardPaymentEnvironment57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction69
 * CardPaymentTransaction69}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40
 * CardPaymentTransactionDetails40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42
 * CardPaymentTransactionDetails42}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43
 * CardPaymentTransactionDetails43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1
 * AcceptorCurrencyConversionAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction77
 * CardPaymentTransaction77}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction78
 * CardPaymentTransaction78}</li>
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
 * "CardPayment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment through an electronic money product."</li>
 * </ul>
 */
public class CardPayment extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the card which is used in a payment by card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#Payment
	 * PaymentCard.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#PaymentCard
	 * PaymentInstrument7.PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#PaymentCardDetails
	 * PaymentInstrument8.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#PaymentCardDetails
	 * PaymentInstrument17Choice.PaymentCardDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#Card
	 * CardEntry1.Card}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction1#Card
	 * CardTransaction1.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#Card
	 * CardPaymentEnvironment6.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#Card
	 * CardPaymentEnvironment14.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#PlainCardData
	 * CardPaymentEnvironment3.PlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#PlainCardData
	 * CardPaymentEnvironment11.PlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#PlainCardData
	 * CardPaymentEnvironment16.PlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#Card
	 * CardPaymentEnvironment1.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#Card
	 * CardPaymentEnvironment9.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment4#Card
	 * CardPaymentEnvironment4.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#Card
	 * CardPaymentEnvironment12.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#Card
	 * CardPaymentEnvironment2.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#Card
	 * CardPaymentEnvironment10.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#Card
	 * CardPaymentEnvironment18.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#PaymentCardDetails
	 * PaymentInstrument9Choice.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#PaymentCardDetails
	 * PaymentInstrument10Choice.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#PaymentCardDetails
	 * PaymentInstrument6Choice.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#PaymentCardDetails
	 * PaymentInstrument8Choice.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#PaymentCardDetails
	 * PaymentInstrument12Choice.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#FinancialCard
	 * TradeSettlement1.FinancialCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#Card
	 * CardPaymentEnvironment24.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Card
	 * CardPaymentEnvironment20.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#Card
	 * CardPaymentEnvironment30.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#Card
	 * CardPaymentEnvironment27.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#PlainCardData
	 * CardPaymentEnvironment28.PlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#PlainCardData
	 * CardPaymentEnvironment21.PlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#Card
	 * CardPaymentEnvironment23.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#Card
	 * CardPaymentEnvironment22.Card}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#Card
	 * CardTransaction2.Card}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#Card
	 * CardEntry2.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Card
	 * CardPaymentEnvironment32.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#Card
	 * CardPaymentEnvironment36.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#Card
	 * CardPaymentEnvironment40.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#Card
	 * CardPaymentEnvironment44.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Card
	 * CardPaymentEnvironment34.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#Card
	 * CardPaymentEnvironment35.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#PaymentCardDetails
	 * PaymentInstrument18Choice.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#Card
	 * CardPaymentEnvironment52.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#Card
	 * CardPaymentEnvironment49.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#Card
	 * CardPaymentEnvironment48.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#Card
	 * CardPaymentEnvironment56.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Card
	 * CardPaymentEnvironment45.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#Card
	 * CardPaymentEnvironment54.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Card
	 * CardPaymentEnvironment53.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Card
	 * CardPaymentEnvironment47.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#PaymentCardDetails
	 * PaymentInstrument20Choice.PaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#Card
	 * CardPaymentEnvironment61.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Card
	 * CardPaymentEnvironment60.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#Card
	 * CardPaymentEnvironment66.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#Card
	 * CardPaymentEnvironment62.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#Card
	 * CardPaymentEnvironment63.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#Card
	 * CardPaymentEnvironment59.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#Card
	 * CardPaymentEnvironment57.Card}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the card which is used in a payment by card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentCard = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument7.PaymentCard, com.tools20022.repository.msg.PaymentInstrument8.PaymentCardDetails,
					com.tools20022.repository.choice.PaymentInstrument17Choice.PaymentCardDetails, com.tools20022.repository.msg.CardEntry1.Card, com.tools20022.repository.msg.CardTransaction1.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment6.Card, com.tools20022.repository.msg.CardPaymentEnvironment14.Card, com.tools20022.repository.msg.CardPaymentEnvironment3.PlainCardData,
					com.tools20022.repository.msg.CardPaymentEnvironment11.PlainCardData, com.tools20022.repository.msg.CardPaymentEnvironment16.PlainCardData, com.tools20022.repository.msg.CardPaymentEnvironment1.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment9.Card, com.tools20022.repository.msg.CardPaymentEnvironment4.Card, com.tools20022.repository.msg.CardPaymentEnvironment12.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment2.Card, com.tools20022.repository.msg.CardPaymentEnvironment10.Card, com.tools20022.repository.msg.CardPaymentEnvironment18.Card,
					com.tools20022.repository.choice.PaymentInstrument9Choice.PaymentCardDetails, com.tools20022.repository.choice.PaymentInstrument10Choice.PaymentCardDetails,
					com.tools20022.repository.choice.PaymentInstrument6Choice.PaymentCardDetails, com.tools20022.repository.choice.PaymentInstrument8Choice.PaymentCardDetails,
					com.tools20022.repository.choice.PaymentInstrument12Choice.PaymentCardDetails, com.tools20022.repository.msg.TradeSettlement1.FinancialCard, com.tools20022.repository.msg.CardPaymentEnvironment24.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment20.Card, com.tools20022.repository.msg.CardPaymentEnvironment30.Card, com.tools20022.repository.msg.CardPaymentEnvironment27.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment28.PlainCardData, com.tools20022.repository.msg.CardPaymentEnvironment21.PlainCardData, com.tools20022.repository.msg.CardPaymentEnvironment23.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment22.Card, com.tools20022.repository.msg.CardTransaction2.Card, com.tools20022.repository.msg.CardEntry2.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment32.Card, com.tools20022.repository.msg.CardPaymentEnvironment36.Card, com.tools20022.repository.msg.CardPaymentEnvironment40.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment44.Card, com.tools20022.repository.msg.CardPaymentEnvironment34.Card, com.tools20022.repository.msg.CardPaymentEnvironment35.Card,
					com.tools20022.repository.choice.PaymentInstrument18Choice.PaymentCardDetails, com.tools20022.repository.msg.CardPaymentEnvironment52.Card, com.tools20022.repository.msg.CardPaymentEnvironment49.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment48.Card, com.tools20022.repository.msg.CardPaymentEnvironment56.Card, com.tools20022.repository.msg.CardPaymentEnvironment45.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment54.Card, com.tools20022.repository.msg.CardPaymentEnvironment53.Card, com.tools20022.repository.msg.CardPaymentEnvironment47.Card,
					com.tools20022.repository.choice.PaymentInstrument20Choice.PaymentCardDetails, com.tools20022.repository.msg.CardPaymentEnvironment61.Card, com.tools20022.repository.msg.CardPaymentEnvironment60.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment66.Card, com.tools20022.repository.msg.CardPaymentEnvironment62.Card, com.tools20022.repository.msg.CardPaymentEnvironment63.Card,
					com.tools20022.repository.msg.CardPaymentEnvironment59.Card, com.tools20022.repository.msg.CardPaymentEnvironment57.Card);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Specifies the card which is used in a payment by card.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product purchased with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#CardPayment
	 * Product.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#Product
	 * CardIndividualTransaction1.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#Product
	 * CardPaymentTransactionDetails4.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#Product
	 * CardPaymentTransactionDetails1.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#Product
	 * CardPaymentTransactionDetails10.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#Product
	 * CardPaymentTransactionDetails3.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#Product
	 * CardPaymentTransactionDetails12.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#Product
	 * CardPaymentTransactionDetails16.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#Product
	 * CardPaymentTransactionDetails14.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#Product
	 * CardPaymentTransactionDetails15.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#Product
	 * CardIndividualTransaction2.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#Product
	 * CardPaymentTransactionDetails23.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#Product
	 * CardPaymentTransactionDetails21.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#Product
	 * CardPaymentTransactionDetails19.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#Product
	 * CardPaymentTransactionDetails24.Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#SaleItem
	 * CardPaymentTransactionDetails29.SaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#SaleItem
	 * CardPaymentTransactionDetails30.SaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#SaleItem
	 * CardPaymentTransactionDetails27.SaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#SaleItem
	 * CardPaymentTransactionDetails31.SaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#SaleItem
	 * CardPaymentTransactionDetails39.SaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#SaleItem
	 * CardPaymentTransactionDetails38.SaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#SaleItem
	 * CardPaymentTransactionDetails41.SaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#SaleItem
	 * CardPaymentTransactionDetails37.SaleItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product purchased with the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction1.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails4.Product,
					com.tools20022.repository.msg.CardPaymentTransactionDetails1.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails10.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails3.Product,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails16.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails14.Product,
					com.tools20022.repository.msg.CardPaymentTransactionDetails15.Product, com.tools20022.repository.msg.CardIndividualTransaction2.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails23.Product,
					com.tools20022.repository.msg.CardPaymentTransactionDetails21.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails19.Product, com.tools20022.repository.msg.CardPaymentTransactionDetails24.Product,
					com.tools20022.repository.msg.CardPaymentTransactionDetails29.SaleItem, com.tools20022.repository.msg.CardPaymentTransactionDetails30.SaleItem, com.tools20022.repository.msg.CardPaymentTransactionDetails27.SaleItem,
					com.tools20022.repository.msg.CardPaymentTransactionDetails31.SaleItem, com.tools20022.repository.msg.CardPaymentTransactionDetails39.SaleItem, com.tools20022.repository.msg.CardPaymentTransactionDetails38.SaleItem,
					com.tools20022.repository.msg.CardPaymentTransactionDetails41.SaleItem, com.tools20022.repository.msg.CardPaymentTransactionDetails37.SaleItem);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Detailed amount value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#Amount
	 * CardPaymentTransactionDetails8.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount1#Value
	 * DetailedAmount1.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#DetailedAmount
	 * CardPaymentTransactionDetails4.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#DetailedAmount
	 * CardPaymentTransactionDetails1.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#DetailedAmount
	 * CardPaymentTransactionDetails10.DetailedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount2#Value
	 * DetailedAmount2.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#DetailedAmount
	 * CardPaymentTransactionDetails2.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#DetailedAmount
	 * CardPaymentTransactionDetails11.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#DetailedAmount
	 * CardPaymentTransactionDetails3.DetailedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount3#Value
	 * DetailedAmount3.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#DetailedAmount
	 * CardPaymentTransactionDetails12.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#DetailedAmount
	 * CardPaymentTransactionDetails13.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#DetailedAmount
	 * CardPaymentTransactionDetails18.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#DetailedAmount
	 * CardPaymentTransactionDetails16.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#DetailedAmount
	 * CardPaymentTransactionDetails14.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#DetailedAmount
	 * CardPaymentTransactionDetails15.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#DetailedAmount
	 * CardPaymentTransactionDetails17.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#DetailedAmount
	 * CardPaymentTransactionDetails20.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#DetailedAmount
	 * CardPaymentTransactionDetails25.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#DetailedAmount
	 * CardPaymentTransactionDetails23.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#DetailedAmount
	 * CardPaymentTransactionDetails21.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#DetailedAmount
	 * CardPaymentTransactionDetails26.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#DetailedAmount
	 * CardPaymentTransactionDetails19.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#DetailedAmount
	 * CardPaymentTransactionDetails24.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount2#DetailedAmount
	 * CardTransactionAmount2.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#CardholderBillingTransactionAmount
	 * CardTransactionAmount1.CardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#DetailedAmount
	 * CardTransactionAmount1.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#AdditionalAmounts
	 * CardTransactionDetail5.AdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#AdditionalAmounts
	 * CardTransactionDetail2.AdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#AdditionalAmounts
	 * CardTransactionDetail1.AdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#TransactionFees
	 * CardTransactionDetail4.TransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#AdditionalAmounts
	 * CardTransactionDetail4.AdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail6#AdditionalAmounts
	 * CardTransactionDetail6.AdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#CardholderBillingTransactionAmount
	 * CardTransactionAmount5.CardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#ReconciliationTransactionAmount
	 * CardTransactionAmount5.ReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#CardholderBillingTransactionAmount
	 * CardTransactionAmount3.CardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#ReconciliationTransactionAmount
	 * CardTransactionAmount3.ReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#DetailedAmount
	 * CardTransactionAmount3.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#CardholderBillingTransactionAmount
	 * CardTransactionAmount4.CardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#ReconciliationTransactionAmount
	 * CardTransactionAmount4.ReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#DetailedAmount
	 * CardTransactionAmount4.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#AdditionalAmounts
	 * CardTransactionDetail3.AdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#DetailedAmount
	 * CardPaymentTransactionDetails32.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#DetailedAmount
	 * CardPaymentTransactionDetails33.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#DetailedAmount
	 * CardPaymentTransactionDetails28.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#DetailedAmount
	 * CardPaymentTransactionDetails29.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#DetailedAmount
	 * CardPaymentTransactionDetails30.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#DetailedAmount
	 * CardPaymentTransactionDetails27.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#DetailedAmount
	 * CardPaymentTransactionDetails31.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#DetailedAmount
	 * CardPaymentTransactionDetails39.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#DetailedAmount
	 * CardPaymentTransactionDetails38.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#DetailedAmount
	 * CardPaymentTransactionDetails41.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#DetailedAmount
	 * CardPaymentTransactionDetails37.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#DetailedAmount
	 * CardPaymentTransactionDetails40.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#DetailedAmount
	 * CardPaymentTransactionDetails42.DetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#DetailedAmount
	 * CardPaymentTransactionDetails43.DetailedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed amount value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DetailedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails8.Amount, com.tools20022.repository.msg.DetailedAmount1.Value,
					com.tools20022.repository.msg.CardPaymentTransactionDetails4.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails1.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails10.DetailedAmount, com.tools20022.repository.msg.DetailedAmount2.Value, com.tools20022.repository.msg.CardPaymentTransactionDetails2.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails11.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails3.DetailedAmount, com.tools20022.repository.msg.DetailedAmount3.Value,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails13.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails18.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails16.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails14.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails15.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails17.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails20.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails25.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails23.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails21.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails26.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails19.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails24.DetailedAmount,
					com.tools20022.repository.msg.CardTransactionAmount2.DetailedAmount, com.tools20022.repository.msg.CardTransactionAmount1.CardholderBillingTransactionAmount,
					com.tools20022.repository.msg.CardTransactionAmount1.DetailedAmount, com.tools20022.repository.msg.CardTransactionDetail5.AdditionalAmounts, com.tools20022.repository.msg.CardTransactionDetail2.AdditionalAmounts,
					com.tools20022.repository.msg.CardTransactionDetail1.AdditionalAmounts, com.tools20022.repository.msg.CardTransactionDetail4.TransactionFees, com.tools20022.repository.msg.CardTransactionDetail4.AdditionalAmounts,
					com.tools20022.repository.msg.CardTransactionDetail6.AdditionalAmounts, com.tools20022.repository.msg.CardTransactionAmount5.CardholderBillingTransactionAmount,
					com.tools20022.repository.msg.CardTransactionAmount5.ReconciliationTransactionAmount, com.tools20022.repository.msg.CardTransactionAmount3.CardholderBillingTransactionAmount,
					com.tools20022.repository.msg.CardTransactionAmount3.ReconciliationTransactionAmount, com.tools20022.repository.msg.CardTransactionAmount3.DetailedAmount,
					com.tools20022.repository.msg.CardTransactionAmount4.CardholderBillingTransactionAmount, com.tools20022.repository.msg.CardTransactionAmount4.ReconciliationTransactionAmount,
					com.tools20022.repository.msg.CardTransactionAmount4.DetailedAmount, com.tools20022.repository.msg.CardTransactionDetail3.AdditionalAmounts, com.tools20022.repository.msg.CardPaymentTransactionDetails32.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails33.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails28.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails29.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails30.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails27.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails31.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails39.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails38.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails41.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails37.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails40.DetailedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails42.DetailedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails43.DetailedAmount);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amount value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Identification of the type of amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAmountAndCurrencyExchange1#Type
	 * CardAmountAndCurrencyExchange1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount1#Type
	 * DetailedAmount1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#AmountQualifier
	 * CardPaymentTransactionDetails4.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#AmountQualifier
	 * CardPaymentTransactionDetails1.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#AmountQualifier
	 * CardPaymentTransactionDetails10.AmountQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount2#Type
	 * DetailedAmount2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#AmountQualifier
	 * CardPaymentTransactionDetails3.AmountQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount3#Type
	 * DetailedAmount3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#AmountQualifier
	 * CardPaymentTransactionDetails12.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#AmountQualifier
	 * CardPaymentTransactionDetails18.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#AmountQualifier
	 * CardPaymentTransactionDetails16.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#AmountQualifier
	 * CardPaymentTransactionDetails14.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#AmountQualifier
	 * CardPaymentTransactionDetails15.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#AmountQualifier
	 * CardPaymentTransactionDetails23.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#AmountQualifier
	 * CardPaymentTransactionDetails21.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#AmountQualifier
	 * CardPaymentTransactionDetails26.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#AmountQualifier
	 * CardPaymentTransactionDetails19.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#AmountQualifier
	 * CardPaymentTransactionDetails24.AmountQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11#Type
	 * DetailedAmount11.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#AdditionalType
	 * DetailedAmount11.AdditionalType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount10#Type
	 * DetailedAmount10.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount9#Type
	 * DetailedAmount9.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#AmountQualifier
	 * CardTransactionAmount1.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#AmountQualifier
	 * CardTransactionAmount3.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#AmountQualifier
	 * CardPaymentTransactionDetails33.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#AmountQualifier
	 * CardPaymentTransactionDetails29.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#AmountQualifier
	 * CardPaymentTransactionDetails30.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#AmountQualifier
	 * CardPaymentTransactionDetails27.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#AmountQualifier
	 * CardPaymentTransactionDetails31.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#AmountQualifier
	 * CardPaymentTransactionDetails39.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#AmountQualifier
	 * CardPaymentTransactionDetails38.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#AmountQualifier
	 * CardPaymentTransactionDetails41.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#AmountQualifier
	 * CardPaymentTransactionDetails37.AmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#AmountQualifier
	 * CardPaymentTransactionDetails40.AmountQualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmountQualifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAmountAndCurrencyExchange1.Type, com.tools20022.repository.msg.DetailedAmount1.Type,
					com.tools20022.repository.msg.CardPaymentTransactionDetails4.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails1.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails10.AmountQualifier, com.tools20022.repository.msg.DetailedAmount2.Type, com.tools20022.repository.msg.CardPaymentTransactionDetails3.AmountQualifier,
					com.tools20022.repository.msg.DetailedAmount3.Type, com.tools20022.repository.msg.CardPaymentTransactionDetails12.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails18.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails16.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails14.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails15.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails23.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails21.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails26.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails19.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails24.AmountQualifier, com.tools20022.repository.msg.DetailedAmount11.Type,
					com.tools20022.repository.msg.DetailedAmount11.AdditionalType, com.tools20022.repository.msg.DetailedAmount10.Type, com.tools20022.repository.msg.DetailedAmount9.Type,
					com.tools20022.repository.msg.CardTransactionAmount1.AmountQualifier, com.tools20022.repository.msg.CardTransactionAmount3.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails33.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails29.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails30.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails27.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails31.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails39.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails38.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails41.AmountQualifier, com.tools20022.repository.msg.CardPaymentTransactionDetails37.AmountQualifier,
					com.tools20022.repository.msg.CardPaymentTransactionDetails40.AmountQualifier);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountQualifier";
			definition = "Identification of the type of amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfAmountCode.mmObject();
		}
	};
	/**
	 * Parameters of the process of acquiring a card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RelatedCardPayment
	 * CardPaymentAcquiring.RelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#PaymentContext
	 * CardPaymentTransactionDetails8.PaymentContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData1#Context
	 * CommonData1.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1#Context
	 * CardPaymentDataSetTransaction1.Context}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData2#Context
	 * CommonData2.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2#Context
	 * CardPaymentDataSetTransaction2.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3#Context
	 * CardPaymentDataSetTransaction3.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4#Context
	 * CardPaymentDataSetTransaction4.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#Action
	 * CardPaymentTransaction9.Action}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#Action
	 * CardPaymentTransaction18.Action}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest1#Context
	 * AcceptorAuthorisationRequest1.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest2#Context
	 * AcceptorAuthorisationRequest2.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#ReconciliationTransactionIdentification
	 * TransactionReconciliation2.ReconciliationTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest1#Context
	 * AcceptorCancellationRequest1.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest2#Context
	 * AcceptorCancellationRequest2.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction10#Action
	 * CardPaymentTransaction10.Action}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1#Context
	 * AcceptorCompletionAdvice1.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice2#Context
	 * AcceptorCompletionAdvice2.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice1#Context
	 * AcceptorCancellationAdvice1.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice2#Context
	 * AcceptorCancellationAdvice2.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3#Context
	 * AcceptorCancellationRequest3.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice3#Context
	 * AcceptorCompletionAdvice3.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest3#Context
	 * AcceptorAuthorisationRequest3.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#Context
	 * AcceptorCancellationAdvice3.Context}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData3#Context
	 * CommonData3.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction6#Context
	 * CardPaymentDataSetTransaction6.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction7#Context
	 * CardPaymentDataSetTransaction7.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#Context
	 * CardPaymentDataSetTransaction8.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#PaymentContext
	 * CardIndividualTransaction2.PaymentContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest4#Context
	 * AcceptorCancellationRequest4.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest4#Context
	 * AcceptorAuthorisationRequest4.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#Context
	 * AcceptorCancellationAdvice4.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice4#Context
	 * AcceptorCompletionAdvice4.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#Context
	 * CardPaymentDataSetTransaction12.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#ReconciliationTransactionIdentification
	 * TransactionReconciliation3.ReconciliationTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData4#Context
	 * CommonData4.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction11#Context
	 * CardPaymentDataSetTransaction11.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction10#Context
	 * CardPaymentDataSetTransaction10.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#TransactionIdentification
	 * ATMTransaction5.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction4#TransactionIdentification
	 * ATMTransaction4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#TransactionIdentification
	 * ATMTransaction2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#TransactionIdentification
	 * ATMTransaction7.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#TransactionIdentification
	 * ATMTransaction3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#TransactionIdentification
	 * ATMTransaction6.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#Reconciliation
	 * CardTransaction10.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#Reconciliation
	 * CardTransaction4.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#Reconciliation
	 * CardTransaction9.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#Reconciliation
	 * CardTransaction5.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#OriginalTransaction
	 * CardTransaction5.OriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#Reconciliation
	 * CardTransaction15.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#OriginalTransaction
	 * CardTransaction15.OriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#OriginalTransaction
	 * CardTransaction7.OriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#Context
	 * AcceptorCancellationAdvice5.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest5#Context
	 * AcceptorAuthorisationRequest5.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest5#Context
	 * AcceptorCancellationRequest5.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice5#Context
	 * AcceptorCompletionAdvice5.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#Context
	 * CardPaymentDataSetTransaction14.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15#Context
	 * CardPaymentDataSetTransaction15.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#Context
	 * CardPaymentDataSetTransaction16.Context}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData5#Context
	 * CommonData5.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#ReconciliationTransactionIdentification
	 * TransactionReconciliation4.ReconciliationTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction18#TransactionIdentification
	 * ATMTransaction18.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#TransactionIdentification
	 * ATMTransaction14.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#TransactionIdentification
	 * ATMTransaction17.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#TransactionIdentification
	 * ATMTransaction20.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#TransactionIdentification
	 * ATMTransaction21.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#TransactionIdentification
	 * ATMTransaction29.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#Context
	 * AcceptorCancellationRequest6.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#Context
	 * AcceptorAuthorisationRequest6.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#Context
	 * AcceptorCancellationAdvice6.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#Context
	 * AcceptorCompletionAdvice6.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#Context
	 * CardPaymentDataSetTransaction19.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#Context
	 * CardPaymentDataSetTransaction20.Context}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#Context
	 * CardPaymentDataSetTransaction18.Context}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#Context
	 * CommonData6.Context}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of the process of acquiring a card payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails8.PaymentContext, com.tools20022.repository.msg.CommonData1.Context,
					com.tools20022.repository.msg.CardPaymentDataSetTransaction1.Context, com.tools20022.repository.msg.CommonData2.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction2.Context,
					com.tools20022.repository.msg.CardPaymentDataSetTransaction3.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction4.Context, com.tools20022.repository.msg.CardPaymentTransaction9.Action,
					com.tools20022.repository.msg.CardPaymentTransaction18.Action, com.tools20022.repository.msg.AcceptorAuthorisationRequest1.Context, com.tools20022.repository.msg.AcceptorAuthorisationRequest2.Context,
					com.tools20022.repository.msg.TransactionReconciliation2.ReconciliationTransactionIdentification, com.tools20022.repository.msg.AcceptorCancellationRequest1.Context,
					com.tools20022.repository.msg.AcceptorCancellationRequest2.Context, com.tools20022.repository.msg.CardPaymentTransaction10.Action, com.tools20022.repository.msg.AcceptorCompletionAdvice1.Context,
					com.tools20022.repository.msg.AcceptorCompletionAdvice2.Context, com.tools20022.repository.msg.AcceptorCancellationAdvice1.Context, com.tools20022.repository.msg.AcceptorCancellationAdvice2.Context,
					com.tools20022.repository.msg.AcceptorCancellationRequest3.Context, com.tools20022.repository.msg.AcceptorCompletionAdvice3.Context, com.tools20022.repository.msg.AcceptorAuthorisationRequest3.Context,
					com.tools20022.repository.msg.AcceptorCancellationAdvice3.Context, com.tools20022.repository.msg.CommonData3.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction6.Context,
					com.tools20022.repository.msg.CardPaymentDataSetTransaction7.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction8.Context, com.tools20022.repository.msg.CardIndividualTransaction2.PaymentContext,
					com.tools20022.repository.msg.AcceptorCancellationRequest4.Context, com.tools20022.repository.msg.AcceptorAuthorisationRequest4.Context, com.tools20022.repository.msg.AcceptorCancellationAdvice4.Context,
					com.tools20022.repository.msg.AcceptorCompletionAdvice4.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction12.Context,
					com.tools20022.repository.msg.TransactionReconciliation3.ReconciliationTransactionIdentification, com.tools20022.repository.msg.CommonData4.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction11.Context,
					com.tools20022.repository.msg.CardPaymentDataSetTransaction10.Context, com.tools20022.repository.msg.ATMTransaction5.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction4.TransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction2.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction7.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction3.TransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction6.TransactionIdentification, com.tools20022.repository.msg.CardTransaction10.Reconciliation, com.tools20022.repository.msg.CardTransaction4.Reconciliation,
					com.tools20022.repository.msg.CardTransaction9.Reconciliation, com.tools20022.repository.msg.CardTransaction5.Reconciliation, com.tools20022.repository.msg.CardTransaction5.OriginalTransaction,
					com.tools20022.repository.msg.CardTransaction15.Reconciliation, com.tools20022.repository.msg.CardTransaction15.OriginalTransaction, com.tools20022.repository.msg.CardTransaction7.OriginalTransaction,
					com.tools20022.repository.msg.AcceptorCancellationAdvice5.Context, com.tools20022.repository.msg.AcceptorAuthorisationRequest5.Context, com.tools20022.repository.msg.AcceptorCancellationRequest5.Context,
					com.tools20022.repository.msg.AcceptorCompletionAdvice5.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction14.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction15.Context,
					com.tools20022.repository.msg.CardPaymentDataSetTransaction16.Context, com.tools20022.repository.msg.CommonData5.Context, com.tools20022.repository.msg.TransactionReconciliation4.ReconciliationTransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction18.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction14.TransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction17.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction20.TransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction21.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction29.TransactionIdentification, com.tools20022.repository.msg.AcceptorCancellationRequest6.Context,
					com.tools20022.repository.msg.AcceptorAuthorisationRequest6.Context, com.tools20022.repository.msg.AcceptorCancellationAdvice6.Context, com.tools20022.repository.msg.AcceptorCompletionAdvice6.Context,
					com.tools20022.repository.msg.CardPaymentDataSetTransaction19.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction20.Context, com.tools20022.repository.msg.CardPaymentDataSetTransaction18.Context,
					com.tools20022.repository.msg.CommonData6.Context);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Parameters of the process of acquiring a card payment.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role played by a party in the process of a payment by
	 * card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#CardPayment
	 * CardPaymentPartyRole.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
	 * CardPaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCardPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in the process of a payment by card."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentCardPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCardPartyRole";
			definition = "Specifies each role played by a party in the process of a payment by card.";
			minOccurs = 0;
			type_lazy = () -> CardPaymentPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the payment by card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#CardPayment
	 * CardPaymentStatus.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#TransactionStatus
	 * ATMTransaction5.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#TransactionStatus
	 * ATMTransaction3.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#TransactionStatus
	 * ATMTransaction17.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#TransactionStatus
	 * ATMTransaction20.TransactionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the payment by card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPaymentStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction5.TransactionStatus, com.tools20022.repository.msg.ATMTransaction3.TransactionStatus,
					com.tools20022.repository.msg.ATMTransaction17.TransactionStatus, com.tools20022.repository.msg.ATMTransaction20.TransactionStatus);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentStatus";
			definition = "Status of the payment by card.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Short description of the amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmountLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short description of the amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DetailedAmountLabel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DetailedAmountLabel";
			definition = "Short description of the amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total of a certain type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#CardPaymentTotal
	 * ReconciliationTransaction.CardPaymentTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1#Transaction
	 * AcceptorReconciliationResponse1.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#Transaction
	 * AcceptorReconciliationResponse2.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#Transaction
	 * AcceptorReconciliationResponse3.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#Reconciliation
	 * CardTransaction8.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#Reconciliation
	 * CardTransaction7.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#Transaction
	 * AcceptorReconciliationResponse4.Transaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total of a certain type of transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorReconciliationResponse1.Transaction, com.tools20022.repository.msg.AcceptorReconciliationResponse2.Transaction,
					com.tools20022.repository.msg.AcceptorReconciliationResponse3.Transaction, com.tools20022.repository.msg.CardTransaction8.Reconciliation, com.tools20022.repository.msg.CardTransaction7.Reconciliation,
					com.tools20022.repository.msg.AcceptorReconciliationResponse4.Transaction);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Total of a certain type of transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ReconciliationTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the category to which the card transaction belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode
	 * ExternalCardTransactionCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category to which the card transaction belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionCategory = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCategory";
			definition = "Specifies the category to which the card transaction belongs.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalCardTransactionCategoryCode.mmObject();
		}
	};
	/**
	 * Amount added to the total price of the transaction and received in cash
	 * by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount added to the total price of the transaction and received in cash by the customer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashBackAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBackAmount";
			definition = "Amount added to the total price of the transaction and received in cash by the customer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount tendered for a service performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount tendered for a service performed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Gratuity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Amount tendered for a service performed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the direction of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCreditDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the direction of a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DebitCreditDirection = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditDirection";
			definition = "Specifies the direction of a payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Current totals of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#RelatedCardPayment
	 * ATMTotal.RelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ATMTotal ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction3#ATMTotals
	 * ATMTransaction3.ATMTotals}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction17#ATMTotals
	 * ATMTransaction17.ATMTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTotal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ATMTotal = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction3.ATMTotals, com.tools20022.repository.msg.ATMTransaction17.ATMTotals);
			elementContext_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMTotal";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ATMTotal.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPayment";
				definition = "Payment through an electronic money product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.CardPayment, com.tools20022.repository.entity.PaymentCard.Payment, com.tools20022.repository.entity.CardPaymentPartyRole.CardPayment,
						com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment, com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal, com.tools20022.repository.entity.CardPaymentStatus.CardPayment,
						com.tools20022.repository.entity.ATMTotal.RelatedCardPayment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry1.AggregatedEntry, com.tools20022.repository.choice.CardTransaction1Choice.Aggregated,
						com.tools20022.repository.choice.CardTransaction1Choice.Individual, com.tools20022.repository.msg.CardTransaction1.Transaction, com.tools20022.repository.msg.EntryTransaction3.CardTransaction,
						com.tools20022.repository.msg.ReportEntry3.CardTransaction, com.tools20022.repository.msg.EntryTransaction4.CardTransaction, com.tools20022.repository.msg.ReportEntry4.CardTransaction,
						com.tools20022.repository.msg.TransactionData1.TransactionDetails, com.tools20022.repository.msg.AcceptorDiagnosticResponse1.Environment, com.tools20022.repository.msg.AcceptorDiagnosticResponse2.Environment,
						com.tools20022.repository.msg.CommonData1.Environment, com.tools20022.repository.msg.CardPaymentTransaction8.TransactionResult, com.tools20022.repository.msg.CardPaymentTransaction4.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction4.TransactionDetails, com.tools20022.repository.msg.CardPaymentDataSetTransaction1.Environment,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction1.Transaction, com.tools20022.repository.msg.CommonData2.Environment, com.tools20022.repository.msg.CardPaymentTransaction17.TransactionResult,
						com.tools20022.repository.msg.CardPaymentTransaction14.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction14.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction2.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction2.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction7.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction7.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction16.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction16.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction20.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction20.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction3.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction3.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction1.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction1.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction11.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction11.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction19.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction19.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction4.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction4.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction2.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction12.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction5.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction5.Transaction,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction5.TransactionResponse, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1.Environment,
						com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2.Environment, com.tools20022.repository.msg.AcceptorAuthorisationRequest1.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationRequest1.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationRequest2.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationRequest2.Transaction, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.Environment,
						com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2.Environment, com.tools20022.repository.msg.CardPaymentTransaction5.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction5.TransactionDetails, com.tools20022.repository.msg.AcceptorCancellationRequest1.Environment,
						com.tools20022.repository.msg.AcceptorCancellationRequest1.Transaction, com.tools20022.repository.msg.CardPaymentTransaction15.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction15.TransactionDetails, com.tools20022.repository.msg.AcceptorCancellationRequest2.Environment,
						com.tools20022.repository.msg.AcceptorCancellationRequest2.Transaction, com.tools20022.repository.msg.CardPaymentTransaction6.TransactionDetails,
						com.tools20022.repository.msg.AcceptorCancellationResponse1.Environment, com.tools20022.repository.msg.AcceptorCancellationResponse1.Transaction,
						com.tools20022.repository.msg.AcceptorCancellationResponse1.TransactionResponse, com.tools20022.repository.msg.AcceptorCancellationResponse2.Environment,
						com.tools20022.repository.msg.AcceptorCancellationResponse2.Transaction, com.tools20022.repository.msg.AcceptorCancellationResponse2.TransactionResponse,
						com.tools20022.repository.msg.AcceptorDiagnosticRequest1.Environment, com.tools20022.repository.msg.AcceptorDiagnosticRequest2.Environment, com.tools20022.repository.msg.CardPaymentTransaction3.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction3.TransactionDetails, com.tools20022.repository.msg.AcceptorCompletionAdvice1.Environment, com.tools20022.repository.msg.AcceptorCompletionAdvice1.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction13.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction13.TransactionDetails,
						com.tools20022.repository.msg.AcceptorCompletionAdvice2.Environment, com.tools20022.repository.msg.AcceptorCompletionAdvice2.Transaction, com.tools20022.repository.msg.AcceptorCancellationAdvice1.Environment,
						com.tools20022.repository.msg.AcceptorCancellationAdvice1.Transaction, com.tools20022.repository.msg.AcceptorCancellationAdvice2.Environment, com.tools20022.repository.msg.AcceptorCancellationAdvice2.Transaction,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse1.Environment, com.tools20022.repository.msg.AcceptorAuthorisationResponse1.Transaction,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse1.TransactionResponse, com.tools20022.repository.msg.AcceptorAuthorisationResponse2.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse2.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationResponse2.TransactionResponse,
						com.tools20022.repository.msg.AcceptorDiagnosticResponse3.Environment, com.tools20022.repository.msg.AcceptorCurrencyConversionRequest1.Environment,
						com.tools20022.repository.msg.AcceptorCurrencyConversionRequest1.Transaction, com.tools20022.repository.msg.AcceptorCancellationRequest3.Environment,
						com.tools20022.repository.msg.AcceptorCancellationRequest3.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationResponse3.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse3.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationResponse3.TransactionResponse,
						com.tools20022.repository.msg.AcceptorDiagnosticRequest3.Environment, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1.Environment,
						com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1.Transaction, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1.TransactionResponse,
						com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3.Environment, com.tools20022.repository.msg.AcceptorCompletionAdvice3.Environment,
						com.tools20022.repository.msg.AcceptorCompletionAdvice3.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationRequest3.Environment, com.tools20022.repository.msg.AcceptorAuthorisationRequest3.Transaction,
						com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3.Environment, com.tools20022.repository.msg.AcceptorCancellationResponse3.Environment,
						com.tools20022.repository.msg.AcceptorCancellationResponse3.Transaction, com.tools20022.repository.msg.AcceptorCancellationResponse3.TransactionResponse,
						com.tools20022.repository.msg.AcceptorCancellationAdvice3.Environment, com.tools20022.repository.msg.AcceptorCancellationAdvice3.Transaction, com.tools20022.repository.msg.AggregationTransaction1.IndividualPayment,
						com.tools20022.repository.msg.CardPaymentTransaction28.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction28.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction22.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction22.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction34.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction34.TransactionDetails, com.tools20022.repository.msg.DetailedAmount5.CashBack,
						com.tools20022.repository.msg.DetailedAmount5.Gratuity, com.tools20022.repository.msg.DetailedAmount5.Fees, com.tools20022.repository.msg.DetailedAmount5.Rebate,
						com.tools20022.repository.msg.DetailedAmount5.ValueAddedTax, com.tools20022.repository.msg.CardPaymentDataSetTransaction9.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction9.Transaction,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction9.TransactionResponse, com.tools20022.repository.msg.CardPaymentTransaction32.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction31.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction31.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction35.TransactionDetails, com.tools20022.repository.msg.CommonData3.Environment, com.tools20022.repository.msg.CardPaymentTransaction23.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction6.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction6.Transaction,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction7.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction7.Transaction,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction8.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction8.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction29.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction29.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction25.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction25.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction30.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction30.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction26.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction26.TransactionDetails, com.tools20022.repository.msg.ReportEntry7.CardTransaction,
						com.tools20022.repository.msg.EntryTransaction7.CardTransaction, com.tools20022.repository.msg.CardTransaction2.Transaction, com.tools20022.repository.choice.CardTransaction2Choice.Aggregated,
						com.tools20022.repository.choice.CardTransaction2Choice.Individual, com.tools20022.repository.msg.CardEntry2.AggregatedEntry, com.tools20022.repository.msg.AcceptorCancellationRequest4.Environment,
						com.tools20022.repository.msg.AcceptorCancellationRequest4.Transaction, com.tools20022.repository.msg.AcceptorDiagnosticResponse4.Environment, com.tools20022.repository.msg.AcceptorAuthorisationRequest4.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationRequest4.Transaction, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2.Environment,
						com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationResponse4.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse4.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationResponse4.TransactionResponse,
						com.tools20022.repository.msg.AcceptorCancellationAdvice4.Environment, com.tools20022.repository.msg.AcceptorCancellationAdvice4.Transaction, com.tools20022.repository.msg.AcceptorCancellationResponse4.Environment,
						com.tools20022.repository.msg.AcceptorCancellationResponse4.Transaction, com.tools20022.repository.msg.AcceptorCancellationResponse4.TransactionResponse,
						com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2.Environment, com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2.Transaction,
						com.tools20022.repository.msg.AcceptorDiagnosticRequest4.Environment, com.tools20022.repository.msg.AcceptorCompletionAdvice4.Environment, com.tools20022.repository.msg.AcceptorCompletionAdvice4.Transaction,
						com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.Environment, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4.Environment,
						com.tools20022.repository.msg.CardPaymentTransaction38.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction48.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction42.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction36.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction36.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction44.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction44.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction45.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction45.TransactionDetails, com.tools20022.repository.msg.DetailedAmount7.CashBack, com.tools20022.repository.msg.DetailedAmount7.Gratuity,
						com.tools20022.repository.msg.DetailedAmount7.Fees, com.tools20022.repository.msg.DetailedAmount7.Rebate, com.tools20022.repository.msg.DetailedAmount7.ValueAddedTax,
						com.tools20022.repository.msg.CardPaymentTransaction49.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction49.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction12.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction12.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction47.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction47.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction13.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction13.Transaction,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction13.TransactionResponse, com.tools20022.repository.msg.CardPaymentTransaction41.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction41.TransactionDetails, com.tools20022.repository.msg.CommonData4.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction11.Environment,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction11.Transaction, com.tools20022.repository.msg.CardPaymentTransaction46.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction46.TransactionDetails, com.tools20022.repository.msg.CardPaymentDataSetTransaction10.Environment,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction10.Transaction, com.tools20022.repository.msg.CardPaymentTransaction40.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction40.TransactionDetails, com.tools20022.repository.msg.DetailedAmount12.Fees, com.tools20022.repository.msg.DetailedAmount12.Donation,
						com.tools20022.repository.msg.ATMTransactionAmounts2.DailyBalance, com.tools20022.repository.msg.ATMTransactionAmounts2.WeeklyBalance, com.tools20022.repository.msg.ATMTransactionAmounts2.MonthlyBalance,
						com.tools20022.repository.msg.CardTransaction4.TransactionDetails, com.tools20022.repository.msg.CardTransaction8.TransactionDetails, com.tools20022.repository.msg.CardTransaction5.TransactionDetails,
						com.tools20022.repository.msg.CardTransaction15.TransactionDetails, com.tools20022.repository.msg.CardTransaction7.TransactionDetails, com.tools20022.repository.msg.CardTransaction6.TransactionDetails,
						com.tools20022.repository.msg.ReportEntry8.CardTransaction, com.tools20022.repository.msg.EntryTransaction8.CardTransaction, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5.Environment,
						com.tools20022.repository.msg.AcceptorDiagnosticRequest5.Environment, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.Environment,
						com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.Transaction, com.tools20022.repository.msg.AcceptorCurrencyConversionRequest3.Environment,
						com.tools20022.repository.msg.AcceptorCurrencyConversionRequest3.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationResponse5.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse5.Transaction, com.tools20022.repository.msg.AcceptorAuthorisationResponse5.TransactionResponse,
						com.tools20022.repository.msg.AcceptorCancellationResponse5.Environment, com.tools20022.repository.msg.AcceptorCancellationResponse5.Transaction,
						com.tools20022.repository.msg.AcceptorCancellationResponse5.TransactionResponse, com.tools20022.repository.msg.AcceptorCancellationAdvice5.Environment,
						com.tools20022.repository.msg.AcceptorCancellationAdvice5.Transaction, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationRequest5.Environment, com.tools20022.repository.msg.AcceptorAuthorisationRequest5.Transaction,
						com.tools20022.repository.msg.AcceptorCancellationRequest5.Environment, com.tools20022.repository.msg.AcceptorCancellationRequest5.Transaction, com.tools20022.repository.msg.AcceptorCompletionAdvice5.Environment,
						com.tools20022.repository.msg.AcceptorCompletionAdvice5.Transaction, com.tools20022.repository.msg.DetailedAmount15.CashBack, com.tools20022.repository.msg.DetailedAmount15.Gratuity,
						com.tools20022.repository.msg.DetailedAmount15.Fees, com.tools20022.repository.msg.DetailedAmount15.Rebate, com.tools20022.repository.msg.DetailedAmount15.ValueAddedTax,
						com.tools20022.repository.msg.CardPaymentTransaction63.TransactionDetails, com.tools20022.repository.msg.CardPaymentDataSetTransaction14.Environment,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction14.Transaction, com.tools20022.repository.msg.CardPaymentTransaction60.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction60.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction57.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction61.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction61.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction64.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction64.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction53.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction59.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction59.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction56.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction56.TransactionDetails, com.tools20022.repository.msg.CardPaymentDataSetTransaction15.Environment,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction15.Transaction, com.tools20022.repository.msg.AggregationTransaction2.IndividualPayment,
						com.tools20022.repository.msg.CardPaymentTransaction51.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction51.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction16.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction16.Transaction,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction17.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction17.Transaction,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction17.TransactionResponse, com.tools20022.repository.msg.CommonData5.Environment, com.tools20022.repository.msg.CardPaymentTransaction55.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction55.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction62.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction62.TransactionDetails, com.tools20022.repository.msg.DetailedAmount16.Fees, com.tools20022.repository.msg.DetailedAmount16.Donation,
						com.tools20022.repository.msg.DetailedAmount17.Fees, com.tools20022.repository.msg.DetailedAmount17.Donation, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4.Environment,
						com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4.Transaction, com.tools20022.repository.msg.AcceptorCancellationRequest6.Environment,
						com.tools20022.repository.msg.AcceptorCancellationRequest6.Transaction, com.tools20022.repository.msg.AcceptorDiagnosticRequest6.Environment,
						com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.Environment, com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4.Environment,
						com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4.Transaction, com.tools20022.repository.msg.AcceptorCancellationResponse6.Environment,
						com.tools20022.repository.msg.AcceptorCancellationResponse6.Transaction, com.tools20022.repository.msg.AcceptorCancellationResponse6.TransactionResponse,
						com.tools20022.repository.msg.AcceptorAuthorisationRequest6.Environment, com.tools20022.repository.msg.AcceptorAuthorisationRequest6.Transaction,
						com.tools20022.repository.msg.AcceptorCancellationAdvice6.Environment, com.tools20022.repository.msg.AcceptorCancellationAdvice6.Transaction, com.tools20022.repository.msg.AcceptorCompletionAdvice6.Environment,
						com.tools20022.repository.msg.AcceptorCompletionAdvice6.Transaction, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6.Environment,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse6.Environment, com.tools20022.repository.msg.AcceptorAuthorisationResponse6.Transaction,
						com.tools20022.repository.msg.AcceptorAuthorisationResponse6.TransactionResponse, com.tools20022.repository.msg.CardPaymentTransaction71.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction71.TransactionDetails, com.tools20022.repository.msg.CardPaymentDataSetTransaction19.Environment,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction19.Transaction, com.tools20022.repository.msg.CardPaymentTransaction75.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction75.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction74.OriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction74.TransactionDetails, com.tools20022.repository.msg.CardPaymentDataSetTransaction21.Environment,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction21.Transaction, com.tools20022.repository.msg.CardPaymentDataSetTransaction21.TransactionResponse,
						com.tools20022.repository.msg.CardPaymentTransaction70.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction70.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction20.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction20.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction72.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction72.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction76.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction76.TransactionDetails,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction18.Environment, com.tools20022.repository.msg.CardPaymentDataSetTransaction18.Transaction, com.tools20022.repository.msg.CommonData6.Environment,
						com.tools20022.repository.msg.CardPaymentTransaction69.OriginalTransaction, com.tools20022.repository.msg.CardPaymentTransaction69.TransactionDetails,
						com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1.Environment, com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1.Transaction,
						com.tools20022.repository.msg.CardPaymentTransaction77.TransactionDetails, com.tools20022.repository.msg.CardPaymentTransaction78.TransactionDetails);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.PaymentCard, com.tools20022.repository.entity.CardPayment.Product, com.tools20022.repository.entity.CardPayment.DetailedAmount,
						com.tools20022.repository.entity.CardPayment.AmountQualifier, com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring, com.tools20022.repository.entity.CardPayment.PaymentCardPartyRole,
						com.tools20022.repository.entity.CardPayment.CardPaymentStatus, com.tools20022.repository.entity.CardPayment.DetailedAmountLabel, com.tools20022.repository.entity.CardPayment.Reconciliation,
						com.tools20022.repository.entity.CardPayment.TransactionCategory, com.tools20022.repository.entity.CardPayment.CashBackAmount, com.tools20022.repository.entity.CardPayment.Gratuity,
						com.tools20022.repository.entity.CardPayment.DebitCreditDirection, com.tools20022.repository.entity.CardPayment.ATMTotal);
				derivationComponent_lazy = () -> Arrays.asList(CardAggregated1.mmObject(), CardEntry1.mmObject(), CardIndividualTransaction1.mmObject(), CardTransaction1Choice.mmObject(), CardTransaction1.mmObject(),
						CardAmountAndCurrencyExchange1.mmObject(), CardPaymentTransactionDetails8.mmObject(), CardPaymentEnvironment8.mmObject(), AcceptorDiagnosticResponse1.mmObject(), CardPaymentEnvironment17.mmObject(),
						AcceptorDiagnosticResponse2.mmObject(), CardPaymentEnvironment5.mmObject(), CommonData1.mmObject(), CardPaymentEnvironment6.mmObject(), CardPaymentTransactionResult1.mmObject(), CardPaymentTransaction8.mmObject(),
						DetailedAmount1.mmObject(), CardPaymentTransactionDetails4.mmObject(), CardPaymentTransaction4.mmObject(), CardPaymentDataSetTransaction1.mmObject(), CardPaymentEnvironment13.mmObject(), CommonData2.mmObject(),
						CardPaymentEnvironment14.mmObject(), CardPaymentTransaction17.mmObject(), CardPaymentTransaction14.mmObject(), CardPaymentDataSetTransaction2.mmObject(), CardPaymentTransactionDetails7.mmObject(),
						CardPaymentTransaction7.mmObject(), CardPaymentTransaction16.mmObject(), CardPaymentTransactionDetails9.mmObject(), CardPaymentTransaction20.mmObject(), CardPaymentDataSetTransaction3.mmObject(),
						CardPaymentTransactionDetails1.mmObject(), CardPaymentTransaction1.mmObject(), CardPaymentTransaction11.mmObject(), CardPaymentTransactionDetails10.mmObject(), CardPaymentTransaction19.mmObject(),
						CardPaymentDataSetTransaction4.mmObject(), CardPaymentEnvironment3.mmObject(), CardPaymentEnvironment11.mmObject(), CardPaymentEnvironment16.mmObject(), DetailedAmount2.mmObject(),
						CardPaymentTransactionDetails2.mmObject(), CardPaymentTransaction2.mmObject(), CardPaymentTransactionDetails11.mmObject(), CardPaymentTransaction12.mmObject(), CardPaymentTransaction9.mmObject(),
						CardPaymentTransaction18.mmObject(), CardPaymentDataSetTransaction5.mmObject(), AcceptorCancellationAdviceResponse1.mmObject(), AcceptorCancellationAdviceResponse2.mmObject(), CardPaymentEnvironment1.mmObject(),
						AcceptorAuthorisationRequest1.mmObject(), CardPaymentEnvironment9.mmObject(), AcceptorAuthorisationRequest2.mmObject(), AcceptorCompletionAdviceResponse1.mmObject(), AcceptorCompletionAdviceResponse2.mmObject(),
						CardPaymentEnvironment7.mmObject(), CardPaymentEnvironment15.mmObject(), CardPaymentEnvironment19.mmObject(), CardPaymentEnvironment4.mmObject(), CardPaymentTransactionDetails5.mmObject(),
						CardPaymentTransaction5.mmObject(), AcceptorCancellationRequest1.mmObject(), CardPaymentEnvironment12.mmObject(), CardPaymentTransaction15.mmObject(), AcceptorCancellationRequest2.mmObject(),
						CardPaymentTransactionDetails6.mmObject(), CardPaymentTransaction6.mmObject(), CardPaymentTransaction10.mmObject(), AcceptorCancellationResponse1.mmObject(), AcceptorCancellationResponse2.mmObject(),
						AcceptorDiagnosticRequest1.mmObject(), AcceptorDiagnosticRequest2.mmObject(), CardPaymentEnvironment2.mmObject(), CardPaymentTransactionDetails3.mmObject(), CardPaymentTransaction3.mmObject(),
						AcceptorCompletionAdvice1.mmObject(), CardPaymentEnvironment10.mmObject(), CardPaymentTransaction13.mmObject(), AcceptorCompletionAdvice2.mmObject(), AcceptorCancellationAdvice1.mmObject(),
						CardPaymentEnvironment18.mmObject(), AcceptorCancellationAdvice2.mmObject(), AcceptorAuthorisationResponse1.mmObject(), AcceptorAuthorisationResponse2.mmObject(), AcceptorDiagnosticResponse3.mmObject(),
						AcceptorCurrencyConversionRequest1.mmObject(), AcceptorCancellationRequest3.mmObject(), AcceptorAuthorisationResponse3.mmObject(), AcceptorDiagnosticRequest3.mmObject(),
						AcceptorCurrencyConversionResponse1.mmObject(), AcceptorCancellationAdviceResponse3.mmObject(), AcceptorCompletionAdvice3.mmObject(), AcceptorAuthorisationRequest3.mmObject(),
						AcceptorCompletionAdviceResponse3.mmObject(), AcceptorCancellationResponse3.mmObject(), AcceptorCancellationAdvice3.mmObject(), DetailedAmount6.mmObject(), CardPaymentTransaction28.mmObject(),
						CardPaymentTransaction21.mmObject(), CardPaymentTransaction22.mmObject(), CardPaymentTransactionDetails12.mmObject(), CardPaymentTransaction34.mmObject(), CardPaymentEnvironment31.mmObject(),
						CardPaymentEnvironment29.mmObject(), CardPaymentEnvironment24.mmObject(), CardPaymentEnvironment25.mmObject(), CardPaymentTransaction27.mmObject(), CardPaymentTransactionDetails13.mmObject(),
						CardPaymentTransactionDetails18.mmObject(), DetailedAmount5.mmObject(), CardPaymentEnvironment20.mmObject(), CardPaymentEnvironment30.mmObject(), CardPaymentEnvironment27.mmObject(),
						CardPaymentDataSetTransaction9.mmObject(), CardPaymentTransaction24.mmObject(), CardPaymentEnvironment28.mmObject(), CardPaymentTransaction32.mmObject(), CardPaymentEnvironment21.mmObject(),
						CardPaymentTransaction31.mmObject(), CardPaymentTransactionDetails16.mmObject(), CardPaymentTransactionDetails14.mmObject(), CardPaymentTransaction35.mmObject(), CommonData3.mmObject(), DetailedAmount4.mmObject(),
						CardPaymentTransaction33.mmObject(), CardPaymentTransactionDetails15.mmObject(), CardPaymentTransactionDetails17.mmObject(), CardPaymentTransaction23.mmObject(), CardPaymentDataSetTransaction6.mmObject(),
						CardPaymentDataSetTransaction7.mmObject(), CardPaymentDataSetTransaction8.mmObject(), CardPaymentTransaction29.mmObject(), CardPaymentEnvironment26.mmObject(), CardPaymentEnvironment23.mmObject(),
						CardPaymentTransaction25.mmObject(), CardPaymentTransaction30.mmObject(), CardPaymentTransaction26.mmObject(), CardPaymentEnvironment22.mmObject(), AmountAndDirection41.mmObject(), CardTransaction2.mmObject(),
						CardTransaction2Choice.mmObject(), CardIndividualTransaction2.mmObject(), CardEntry2.mmObject(), AcceptorCancellationRequest4.mmObject(), AcceptorDiagnosticResponse4.mmObject(),
						AcceptorAuthorisationRequest4.mmObject(), AcceptorCurrencyConversionResponse2.mmObject(), AcceptorAuthorisationResponse4.mmObject(), AcceptorCancellationAdvice4.mmObject(), AcceptorCancellationResponse4.mmObject(),
						AcceptorCurrencyConversionRequest2.mmObject(), AcceptorDiagnosticRequest4.mmObject(), AcceptorCompletionAdvice4.mmObject(), AcceptorCancellationAdviceResponse4.mmObject(),
						AcceptorCompletionAdviceResponse4.mmObject(), CardPaymentEnvironment37.mmObject(), CardPaymentTransaction39.mmObject(), CardPaymentTransaction38.mmObject(), CardPaymentEnvironment33.mmObject(),
						CardPaymentTransactionDetails20.mmObject(), CardPaymentTransaction48.mmObject(), CardPaymentTransactionDetails25.mmObject(), CardPaymentTransaction50.mmObject(), CardPaymentTransaction43.mmObject(),
						CardPaymentTransaction42.mmObject(), CardPaymentTransaction36.mmObject(), CardPaymentEnvironment32.mmObject(), CardPaymentTransaction44.mmObject(), CardPaymentEnvironment36.mmObject(),
						CardPaymentEnvironment43.mmObject(), CardPaymentTransaction45.mmObject(), CardPaymentTransactionDetails23.mmObject(), CardPaymentTransaction37.mmObject(), CardPaymentEnvironment41.mmObject(),
						CardPaymentTransactionDetails21.mmObject(), DetailedAmount7.mmObject(), CardPaymentEnvironment42.mmObject(), CardPaymentTransaction49.mmObject(), CardPaymentTransactionDetails26.mmObject(),
						CardPaymentEnvironment40.mmObject(), CardPaymentDataSetTransaction12.mmObject(), CardPaymentTransaction47.mmObject(), CardPaymentTransactionDetails19.mmObject(), CardPaymentTransactionResult2.mmObject(),
						CardPaymentEnvironment44.mmObject(), CardPaymentEnvironment34.mmObject(), CardPaymentDataSetTransaction13.mmObject(), CardPaymentEnvironment35.mmObject(), CardPaymentTransaction41.mmObject(),
						CardPaymentTransactionDetails24.mmObject(), CardPaymentEnvironment38.mmObject(), CommonData4.mmObject(), CardPaymentEnvironment39.mmObject(), CardPaymentDataSetTransaction11.mmObject(),
						CardPaymentTransaction46.mmObject(), CardPaymentTransactionDetails22.mmObject(), CardPaymentDataSetTransaction10.mmObject(), CardPaymentTransaction40.mmObject(), ATMTransaction1.mmObject(),
						AmountAndCurrency1.mmObject(), DetailedAmount12.mmObject(), ATMTransaction5.mmObject(), ATMTransaction4.mmObject(), ATMTransaction2.mmObject(), ATMTransaction7.mmObject(), ATMTransaction8.mmObject(),
						ATMTransaction3.mmObject(), DetailedAmount13.mmObject(), ATMTransaction6.mmObject(), DetailedAmount11.mmObject(), DetailedAmount10.mmObject(), DetailedAmount9.mmObject(), CardTransaction4.mmObject(),
						CardTransactionAmount2.mmObject(), DetailedAmount8.mmObject(), CardTransactionAmount1.mmObject(), CardTransaction8.mmObject(), CardTransaction5.mmObject(), CardTransaction15.mmObject(), CardTransaction7.mmObject(),
						CardTransactionDetail5.mmObject(), CardTransactionDetail2.mmObject(), CardTransactionDetail1.mmObject(), CardTransaction6.mmObject(), CardTransactionDetail4.mmObject(), CardTransactionDetail6.mmObject(),
						CardTransactionAmount5.mmObject(), CardTransactionAmount3.mmObject(), CardTransactionAmount4.mmObject(), CardTransactionDetail3.mmObject(), AcceptorCancellationAdviceResponse5.mmObject(),
						AcceptorDiagnosticRequest5.mmObject(), AcceptorCurrencyConversionResponse3.mmObject(), AcceptorCurrencyConversionRequest3.mmObject(), AcceptorAuthorisationResponse5.mmObject(),
						AcceptorCancellationResponse5.mmObject(), AcceptorCancellationAdvice5.mmObject(), AcceptorCompletionAdviceResponse5.mmObject(), AcceptorAuthorisationRequest5.mmObject(), AcceptorCancellationRequest5.mmObject(),
						AcceptorCompletionAdvice5.mmObject(), CardPaymentEnvironment46.mmObject(), CardPaymentEnvironment50.mmObject(), CardPaymentTransactionDetails32.mmObject(), DetailedAmount15.mmObject(),
						CardPaymentTransactionDetails33.mmObject(), CardPaymentTransaction52.mmObject(), CardPaymentTransactionResult3.mmObject(), CardPaymentTransaction63.mmObject(), CardPaymentDataSetTransaction14.mmObject(),
						CardPaymentTransaction60.mmObject(), CardPaymentEnvironment52.mmObject(), CardPaymentTransactionDetails28.mmObject(), CardPaymentTransaction57.mmObject(), CardPaymentTransaction61.mmObject(),
						CardPaymentTransaction64.mmObject(), CardPaymentTransaction65.mmObject(), CardPaymentTransaction53.mmObject(), CardPaymentEnvironment49.mmObject(), CardPaymentTransaction59.mmObject(),
						CardPaymentTransaction56.mmObject(), CardPaymentEnvironment51.mmObject(), CardPaymentDataSetTransaction15.mmObject(), CardPaymentTransactionDetails29.mmObject(), CardPaymentTransactionDetails30.mmObject(),
						CardPaymentEnvironment48.mmObject(), CardPaymentEnvironment56.mmObject(), CardPaymentTransaction51.mmObject(), CardPaymentEnvironment45.mmObject(), CardPaymentDataSetTransaction16.mmObject(),
						CardPaymentDataSetTransaction17.mmObject(), CardPaymentTransactionDetails27.mmObject(), CardPaymentTransactionDetails31.mmObject(), CardPaymentEnvironment55.mmObject(), CommonData5.mmObject(),
						CardPaymentEnvironment54.mmObject(), CardPaymentEnvironment53.mmObject(), CardPaymentTransaction54.mmObject(), DetailedAmount14.mmObject(), CardPaymentEnvironment47.mmObject(), CardPaymentTransaction55.mmObject(),
						CardPaymentTransaction58.mmObject(), CardPaymentTransaction62.mmObject(), CardPaymentTransactionDetails35.mmObject(), CardPaymentTransactionDetails34.mmObject(), ATMTransaction18.mmObject(),
						ATMTransaction14.mmObject(), ATMTransaction17.mmObject(), ATMTransaction20.mmObject(), DetailedAmount18.mmObject(), ATMTransaction13.mmObject(), ATMTransaction16.mmObject(), ATMTransaction19.mmObject(),
						DetailedAmount16.mmObject(), ATMTransaction15.mmObject(), ATMTransaction21.mmObject(), ATMTransaction24.mmObject(), DetailedAmount17.mmObject(), ATMTransaction23.mmObject(), ATMTransaction29.mmObject(),
						AcceptorCurrencyConversionResponse4.mmObject(), AcceptorCancellationRequest6.mmObject(), AcceptorDiagnosticRequest6.mmObject(), AcceptorCancellationAdviceResponse6.mmObject(),
						AcceptorCurrencyConversionRequest4.mmObject(), AcceptorCancellationResponse6.mmObject(), AcceptorAuthorisationRequest6.mmObject(), AcceptorCancellationAdvice6.mmObject(), AcceptorCompletionAdvice6.mmObject(),
						AcceptorCompletionAdviceResponse6.mmObject(), AcceptorAuthorisationResponse6.mmObject(), CardPaymentTransaction71.mmObject(), CardPaymentTransactionDetails39.mmObject(), CardPaymentDataSetTransaction19.mmObject(),
						CardPaymentTransaction75.mmObject(), CardPaymentEnvironment61.mmObject(), CardPaymentTransactionDetails38.mmObject(), CardPaymentEnvironment64.mmObject(), CardPaymentEnvironment60.mmObject(),
						CardPaymentEnvironment65.mmObject(), CardPaymentTransactionDetails41.mmObject(), CardPaymentEnvironment67.mmObject(), CardPaymentEnvironment66.mmObject(), CardPaymentTransaction74.mmObject(),
						CardPaymentDataSetTransaction21.mmObject(), CardPaymentTransaction67.mmObject(), CardPaymentTransaction70.mmObject(), CardPaymentTransaction73.mmObject(), CardPaymentDataSetTransaction20.mmObject(),
						CardPaymentEnvironment62.mmObject(), CardPaymentEnvironment63.mmObject(), CardPaymentTransaction72.mmObject(), CardPaymentTransaction76.mmObject(), CardPaymentTransaction68.mmObject(),
						CardPaymentDataSetTransaction18.mmObject(), CardPaymentEnvironment58.mmObject(), CardPaymentEnvironment59.mmObject(), CardPaymentTransactionDetails37.mmObject(), CommonData6.mmObject(),
						CardPaymentEnvironment57.mmObject(), CardPaymentTransaction69.mmObject(), CardPaymentTransactionDetails40.mmObject(), CardPaymentTransactionDetails42.mmObject(), CardPaymentTransactionDetails43.mmObject(),
						AcceptorCurrencyConversionAdvice1.mmObject(), CardPaymentTransaction77.mmObject(), CardPaymentTransaction78.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}