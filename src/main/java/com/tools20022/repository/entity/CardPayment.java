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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode;
import com.tools20022.repository.codeset.TypeOfAmountCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
 * CardPayment.mmPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
 * CardPayment.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
 * CardPayment.mmDetailedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
 * CardPayment.mmAmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
 * CardPayment.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCardPartyRole
 * CardPayment.mmPaymentCardPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
 * CardPayment.mmCardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmountLabel
 * CardPayment.mmDetailedAmountLabel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
 * CardPayment.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmTransactionCategory
 * CardPayment.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCashBackAmount
 * CardPayment.mmCashBackAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmGratuity
 * CardPayment.mmGratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDebitCreditDirection
 * CardPayment.mmDebitCreditDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
 * CardPayment.mmATMTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCardPayment
 * Product.mmCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
 * PaymentCard.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmCardPayment
 * CardPaymentPartyRole.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
 * ReconciliationTransaction.mmCardPaymentTotal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
 * CardPaymentStatus.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
 * ATMTotal.mmRelatedCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#mmAggregatedEntry
 * CardEntry1.mmAggregatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction1Choice#mmAggregated
 * CardTransaction1Choice.mmAggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction1Choice#mmIndividual
 * CardTransaction1Choice.mmIndividual}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction1#mmTransaction
 * CardTransaction1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmCardTransaction
 * EntryTransaction3.mmCardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmCardTransaction
 * ReportEntry3.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCardTransaction
 * EntryTransaction4.mmCardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmCardTransaction
 * ReportEntry4.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionData1#mmTransactionDetails
 * TransactionData1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse1#mmEnvironment
 * AcceptorDiagnosticResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse2#mmEnvironment
 * AcceptorDiagnosticResponse2.mmEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData1#mmEnvironment
 * CommonData1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#mmTransactionResult
 * CardPaymentTransaction8.mmTransactionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmOriginalTransaction
 * CardPaymentTransaction4.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmTransactionDetails
 * CardPaymentTransaction4.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1#mmEnvironment
 * CardPaymentDataSetTransaction1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1#mmTransaction
 * CardPaymentDataSetTransaction1.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData2#mmEnvironment
 * CommonData2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#mmTransactionResult
 * CardPaymentTransaction17.mmTransactionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmOriginalTransaction
 * CardPaymentTransaction14.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmTransactionDetails
 * CardPaymentTransaction14.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2#mmEnvironment
 * CardPaymentDataSetTransaction2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2#mmTransaction
 * CardPaymentDataSetTransaction2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmOriginalTransaction
 * CardPaymentTransaction7.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmTransactionDetails
 * CardPaymentTransaction7.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmOriginalTransaction
 * CardPaymentTransaction16.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmTransactionDetails
 * CardPaymentTransaction16.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmOriginalTransaction
 * CardPaymentTransaction20.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmTransactionDetails
 * CardPaymentTransaction20.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3#mmEnvironment
 * CardPaymentDataSetTransaction3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3#mmTransaction
 * CardPaymentDataSetTransaction3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmOriginalTransaction
 * CardPaymentTransaction1.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmTransactionDetails
 * CardPaymentTransaction1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmOriginalTransaction
 * CardPaymentTransaction11.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmTransactionDetails
 * CardPaymentTransaction11.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmOriginalTransaction
 * CardPaymentTransaction19.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmTransactionDetails
 * CardPaymentTransaction19.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4#mmEnvironment
 * CardPaymentDataSetTransaction4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4#mmTransaction
 * CardPaymentDataSetTransaction4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#mmTransactionDetails
 * CardPaymentTransaction2.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#mmTransactionDetails
 * CardPaymentTransaction12.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5#mmEnvironment
 * CardPaymentDataSetTransaction5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5#mmTransaction
 * CardPaymentDataSetTransaction5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction5#mmTransactionResponse
 * CardPaymentDataSetTransaction5.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1#mmEnvironment
 * AcceptorCancellationAdviceResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2#mmEnvironment
 * AcceptorCancellationAdviceResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest1#mmEnvironment
 * AcceptorAuthorisationRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest1#mmTransaction
 * AcceptorAuthorisationRequest1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest2#mmEnvironment
 * AcceptorAuthorisationRequest2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest2#mmTransaction
 * AcceptorAuthorisationRequest2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#mmEnvironment
 * AcceptorCompletionAdviceResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2#mmEnvironment
 * AcceptorCompletionAdviceResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#mmOriginalTransaction
 * CardPaymentTransaction5.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#mmTransactionDetails
 * CardPaymentTransaction5.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest1#mmEnvironment
 * AcceptorCancellationRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest1#mmTransaction
 * AcceptorCancellationRequest1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmOriginalTransaction
 * CardPaymentTransaction15.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmTransactionDetails
 * CardPaymentTransaction15.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest2#mmEnvironment
 * AcceptorCancellationRequest2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest2#mmTransaction
 * AcceptorCancellationRequest2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#mmTransactionDetails
 * CardPaymentTransaction6.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse1#mmEnvironment
 * AcceptorCancellationResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse1#mmTransaction
 * AcceptorCancellationResponse1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse1#mmTransactionResponse
 * AcceptorCancellationResponse1.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse2#mmEnvironment
 * AcceptorCancellationResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse2#mmTransaction
 * AcceptorCancellationResponse2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse2#mmTransactionResponse
 * AcceptorCancellationResponse2.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest1#mmEnvironment
 * AcceptorDiagnosticRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest2#mmEnvironment
 * AcceptorDiagnosticRequest2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmOriginalTransaction
 * CardPaymentTransaction3.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionDetails
 * CardPaymentTransaction3.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1#mmEnvironment
 * AcceptorCompletionAdvice1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1#mmTransaction
 * AcceptorCompletionAdvice1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmOriginalTransaction
 * CardPaymentTransaction13.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmTransactionDetails
 * CardPaymentTransaction13.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice2#mmEnvironment
 * AcceptorCompletionAdvice2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice2#mmTransaction
 * AcceptorCompletionAdvice2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice1#mmEnvironment
 * AcceptorCancellationAdvice1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice1#mmTransaction
 * AcceptorCancellationAdvice1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice2#mmEnvironment
 * AcceptorCancellationAdvice2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice2#mmTransaction
 * AcceptorCancellationAdvice2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1#mmEnvironment
 * AcceptorAuthorisationResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1#mmTransaction
 * AcceptorAuthorisationResponse1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1#mmTransactionResponse
 * AcceptorAuthorisationResponse1.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse2#mmEnvironment
 * AcceptorAuthorisationResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse2#mmTransaction
 * AcceptorAuthorisationResponse2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse2#mmTransactionResponse
 * AcceptorAuthorisationResponse2.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3#mmEnvironment
 * AcceptorDiagnosticResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest1#mmEnvironment
 * AcceptorCurrencyConversionRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest1#mmTransaction
 * AcceptorCurrencyConversionRequest1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3#mmEnvironment
 * AcceptorCancellationRequest3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3#mmTransaction
 * AcceptorCancellationRequest3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse3#mmEnvironment
 * AcceptorAuthorisationResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse3#mmTransaction
 * AcceptorAuthorisationResponse3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse3#mmTransactionResponse
 * AcceptorAuthorisationResponse3.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest3#mmEnvironment
 * AcceptorDiagnosticRequest3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmEnvironment
 * AcceptorCurrencyConversionResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmTransaction
 * AcceptorCurrencyConversionResponse1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmTransactionResponse
 * AcceptorCurrencyConversionResponse1.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#mmEnvironment
 * AcceptorCancellationAdviceResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice3#mmEnvironment
 * AcceptorCompletionAdvice3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice3#mmTransaction
 * AcceptorCompletionAdvice3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest3#mmEnvironment
 * AcceptorAuthorisationRequest3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest3#mmTransaction
 * AcceptorAuthorisationRequest3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3#mmEnvironment
 * AcceptorCompletionAdviceResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse3#mmEnvironment
 * AcceptorCancellationResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse3#mmTransaction
 * AcceptorCancellationResponse3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse3#mmTransactionResponse
 * AcceptorCancellationResponse3.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#mmEnvironment
 * AcceptorCancellationAdvice3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#mmTransaction
 * AcceptorCancellationAdvice3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmIndividualPayment
 * AggregationTransaction1.mmIndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmOriginalTransaction
 * CardPaymentTransaction28.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmTransactionDetails
 * CardPaymentTransaction28.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmOriginalTransaction
 * CardPaymentTransaction22.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmTransactionDetails
 * CardPaymentTransaction22.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#mmOriginalTransaction
 * CardPaymentTransaction34.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#mmTransactionDetails
 * CardPaymentTransaction34.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#mmCashBack
 * DetailedAmount5.mmCashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#mmGratuity
 * DetailedAmount5.mmGratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#mmFees
 * DetailedAmount5.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount5#mmRebate
 * DetailedAmount5.mmRebate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount5#mmValueAddedTax
 * DetailedAmount5.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction9#mmEnvironment
 * CardPaymentDataSetTransaction9.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction9#mmTransaction
 * CardPaymentDataSetTransaction9.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction9#mmTransactionResponse
 * CardPaymentDataSetTransaction9.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#mmTransactionDetails
 * CardPaymentTransaction32.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmOriginalTransaction
 * CardPaymentTransaction31.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmTransactionDetails
 * CardPaymentTransaction31.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#mmTransactionDetails
 * CardPaymentTransaction35.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData3#mmEnvironment
 * CommonData3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#mmTransactionDetails
 * CardPaymentTransaction23.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction6#mmEnvironment
 * CardPaymentDataSetTransaction6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction6#mmTransaction
 * CardPaymentDataSetTransaction6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction7#mmEnvironment
 * CardPaymentDataSetTransaction7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction7#mmTransaction
 * CardPaymentDataSetTransaction7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmEnvironment
 * CardPaymentDataSetTransaction8.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmTransaction
 * CardPaymentDataSetTransaction8.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmOriginalTransaction
 * CardPaymentTransaction29.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionDetails
 * CardPaymentTransaction29.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmOriginalTransaction
 * CardPaymentTransaction25.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmTransactionDetails
 * CardPaymentTransaction25.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmOriginalTransaction
 * CardPaymentTransaction30.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmTransactionDetails
 * CardPaymentTransaction30.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmOriginalTransaction
 * CardPaymentTransaction26.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmTransactionDetails
 * CardPaymentTransaction26.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmCardTransaction
 * ReportEntry7.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCardTransaction
 * EntryTransaction7.mmCardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#mmTransaction
 * CardTransaction2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#mmAggregated
 * CardTransaction2Choice.mmAggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#mmIndividual
 * CardTransaction2Choice.mmIndividual}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmAggregatedEntry
 * CardEntry2.mmAggregatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest4#mmEnvironment
 * AcceptorCancellationRequest4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest4#mmTransaction
 * AcceptorCancellationRequest4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#mmEnvironment
 * AcceptorDiagnosticResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest4#mmEnvironment
 * AcceptorAuthorisationRequest4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest4#mmTransaction
 * AcceptorAuthorisationRequest4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmEnvironment
 * AcceptorCurrencyConversionResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmTransaction
 * AcceptorCurrencyConversionResponse2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#mmEnvironment
 * AcceptorAuthorisationResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#mmTransaction
 * AcceptorAuthorisationResponse4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse4#mmTransactionResponse
 * AcceptorAuthorisationResponse4.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#mmEnvironment
 * AcceptorCancellationAdvice4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#mmTransaction
 * AcceptorCancellationAdvice4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse4#mmEnvironment
 * AcceptorCancellationResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse4#mmTransaction
 * AcceptorCancellationResponse4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse4#mmTransactionResponse
 * AcceptorCancellationResponse4.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2#mmEnvironment
 * AcceptorCurrencyConversionRequest2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2#mmTransaction
 * AcceptorCurrencyConversionRequest2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest4#mmEnvironment
 * AcceptorDiagnosticRequest4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice4#mmEnvironment
 * AcceptorCompletionAdvice4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice4#mmTransaction
 * AcceptorCompletionAdvice4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#mmEnvironment
 * AcceptorCancellationAdviceResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4#mmEnvironment
 * AcceptorCompletionAdviceResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#mmTransactionDetails
 * CardPaymentTransaction38.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#mmTransactionDetails
 * CardPaymentTransaction48.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#mmTransactionDetails
 * CardPaymentTransaction42.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmOriginalTransaction
 * CardPaymentTransaction36.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmTransactionDetails
 * CardPaymentTransaction36.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmOriginalTransaction
 * CardPaymentTransaction44.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmTransactionDetails
 * CardPaymentTransaction44.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmOriginalTransaction
 * CardPaymentTransaction45.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionDetails
 * CardPaymentTransaction45.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmCashBack
 * DetailedAmount7.mmCashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmGratuity
 * DetailedAmount7.mmGratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmFees
 * DetailedAmount7.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmRebate
 * DetailedAmount7.mmRebate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmValueAddedTax
 * DetailedAmount7.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#mmOriginalTransaction
 * CardPaymentTransaction49.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#mmTransactionDetails
 * CardPaymentTransaction49.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmEnvironment
 * CardPaymentDataSetTransaction12.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmTransaction
 * CardPaymentDataSetTransaction12.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmOriginalTransaction
 * CardPaymentTransaction47.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmTransactionDetails
 * CardPaymentTransaction47.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction13#mmEnvironment
 * CardPaymentDataSetTransaction13.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction13#mmTransaction
 * CardPaymentDataSetTransaction13.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction13#mmTransactionResponse
 * CardPaymentDataSetTransaction13.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#mmOriginalTransaction
 * CardPaymentTransaction41.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#mmTransactionDetails
 * CardPaymentTransaction41.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData4#mmEnvironment
 * CommonData4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction11#mmEnvironment
 * CardPaymentDataSetTransaction11.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction11#mmTransaction
 * CardPaymentDataSetTransaction11.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmOriginalTransaction
 * CardPaymentTransaction46.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmTransactionDetails
 * CardPaymentTransaction46.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction10#mmEnvironment
 * CardPaymentDataSetTransaction10.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction10#mmTransaction
 * CardPaymentDataSetTransaction10.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmOriginalTransaction
 * CardPaymentTransaction40.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmTransactionDetails
 * CardPaymentTransaction40.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#mmFees
 * DetailedAmount12.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#mmDonation
 * DetailedAmount12.mmDonation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmDailyBalance
 * ATMTransactionAmounts2.mmDailyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmWeeklyBalance
 * ATMTransactionAmounts2.mmWeeklyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMonthlyBalance
 * ATMTransactionAmounts2.mmMonthlyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionDetails
 * CardTransaction4.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionDetails
 * CardTransaction8.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionDetails
 * CardTransaction5.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionDetails
 * CardTransaction15.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionDetails
 * CardTransaction7.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionDetails
 * CardTransaction6.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmCardTransaction
 * ReportEntry8.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCardTransaction
 * EntryTransaction8.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmEnvironment
 * AcceptorCancellationAdviceResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest5#mmEnvironment
 * AcceptorDiagnosticRequest5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#mmEnvironment
 * AcceptorCurrencyConversionResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#mmTransaction
 * AcceptorCurrencyConversionResponse3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest3#mmEnvironment
 * AcceptorCurrencyConversionRequest3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest3#mmTransaction
 * AcceptorCurrencyConversionRequest3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#mmEnvironment
 * AcceptorAuthorisationResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#mmTransaction
 * AcceptorAuthorisationResponse5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse5#mmTransactionResponse
 * AcceptorAuthorisationResponse5.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse5#mmEnvironment
 * AcceptorCancellationResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse5#mmTransaction
 * AcceptorCancellationResponse5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse5#mmTransactionResponse
 * AcceptorCancellationResponse5.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmEnvironment
 * AcceptorCancellationAdvice5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmTransaction
 * AcceptorCancellationAdvice5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5#mmEnvironment
 * AcceptorCompletionAdviceResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest5#mmEnvironment
 * AcceptorAuthorisationRequest5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest5#mmTransaction
 * AcceptorAuthorisationRequest5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest5#mmEnvironment
 * AcceptorCancellationRequest5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest5#mmTransaction
 * AcceptorCancellationRequest5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice5#mmEnvironment
 * AcceptorCompletionAdvice5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice5#mmTransaction
 * AcceptorCompletionAdvice5.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmCashBack
 * DetailedAmount15.mmCashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmGratuity
 * DetailedAmount15.mmGratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmFees
 * DetailedAmount15.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmRebate
 * DetailedAmount15.mmRebate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmValueAddedTax
 * DetailedAmount15.mmValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#mmTransactionDetails
 * CardPaymentTransaction63.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmEnvironment
 * CardPaymentDataSetTransaction14.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmTransaction
 * CardPaymentDataSetTransaction14.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmOriginalTransaction
 * CardPaymentTransaction60.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionDetails
 * CardPaymentTransaction60.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmTransactionDetails
 * CardPaymentTransaction57.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmOriginalTransaction
 * CardPaymentTransaction61.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmTransactionDetails
 * CardPaymentTransaction61.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#mmOriginalTransaction
 * CardPaymentTransaction64.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#mmTransactionDetails
 * CardPaymentTransaction64.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#mmTransactionDetails
 * CardPaymentTransaction53.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmOriginalTransaction
 * CardPaymentTransaction59.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmTransactionDetails
 * CardPaymentTransaction59.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#mmOriginalTransaction
 * CardPaymentTransaction56.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#mmTransactionDetails
 * CardPaymentTransaction56.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15#mmEnvironment
 * CardPaymentDataSetTransaction15.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15#mmTransaction
 * CardPaymentDataSetTransaction15.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmIndividualPayment
 * AggregationTransaction2.mmIndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmOriginalTransaction
 * CardPaymentTransaction51.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmTransactionDetails
 * CardPaymentTransaction51.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmEnvironment
 * CardPaymentDataSetTransaction16.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmTransaction
 * CardPaymentDataSetTransaction16.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17#mmEnvironment
 * CardPaymentDataSetTransaction17.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17#mmTransaction
 * CardPaymentDataSetTransaction17.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction17#mmTransactionResponse
 * CardPaymentDataSetTransaction17.mmTransactionResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData5#mmEnvironment
 * CommonData5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmOriginalTransaction
 * CardPaymentTransaction55.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmTransactionDetails
 * CardPaymentTransaction55.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmOriginalTransaction
 * CardPaymentTransaction62.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmTransactionDetails
 * CardPaymentTransaction62.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmFees
 * DetailedAmount16.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmDonation
 * DetailedAmount16.mmDonation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#mmFees
 * DetailedAmount17.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#mmDonation
 * DetailedAmount17.mmDonation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmEnvironment
 * AcceptorCurrencyConversionResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmTransaction
 * AcceptorCurrencyConversionResponse4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#mmEnvironment
 * AcceptorCancellationRequest6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#mmTransaction
 * AcceptorCancellationRequest6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest6#mmEnvironment
 * AcceptorDiagnosticRequest6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmEnvironment
 * AcceptorCancellationAdviceResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4#mmEnvironment
 * AcceptorCurrencyConversionRequest4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest4#mmTransaction
 * AcceptorCurrencyConversionRequest4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#mmEnvironment
 * AcceptorCancellationResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#mmTransaction
 * AcceptorCancellationResponse6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse6#mmTransactionResponse
 * AcceptorCancellationResponse6.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#mmEnvironment
 * AcceptorAuthorisationRequest6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#mmTransaction
 * AcceptorAuthorisationRequest6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmEnvironment
 * AcceptorCancellationAdvice6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmTransaction
 * AcceptorCancellationAdvice6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#mmEnvironment
 * AcceptorCompletionAdvice6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#mmTransaction
 * AcceptorCompletionAdvice6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#mmEnvironment
 * AcceptorCompletionAdviceResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmEnvironment
 * AcceptorAuthorisationResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmTransaction
 * AcceptorAuthorisationResponse6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse6#mmTransactionResponse
 * AcceptorAuthorisationResponse6.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmOriginalTransaction
 * CardPaymentTransaction71.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmTransactionDetails
 * CardPaymentTransaction71.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#mmEnvironment
 * CardPaymentDataSetTransaction19.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#mmTransaction
 * CardPaymentDataSetTransaction19.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmOriginalTransaction
 * CardPaymentTransaction75.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmTransactionDetails
 * CardPaymentTransaction75.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmOriginalTransaction
 * CardPaymentTransaction74.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmTransactionDetails
 * CardPaymentTransaction74.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#mmEnvironment
 * CardPaymentDataSetTransaction21.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#mmTransaction
 * CardPaymentDataSetTransaction21.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction21#mmTransactionResponse
 * CardPaymentDataSetTransaction21.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmOriginalTransaction
 * CardPaymentTransaction70.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmTransactionDetails
 * CardPaymentTransaction70.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmEnvironment
 * CardPaymentDataSetTransaction20.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmTransaction
 * CardPaymentDataSetTransaction20.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmOriginalTransaction
 * CardPaymentTransaction72.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmTransactionDetails
 * CardPaymentTransaction72.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmOriginalTransaction
 * CardPaymentTransaction76.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionDetails
 * CardPaymentTransaction76.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmEnvironment
 * CardPaymentDataSetTransaction18.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmTransaction
 * CardPaymentDataSetTransaction18.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#mmEnvironment
 * CommonData6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmOriginalTransaction
 * CardPaymentTransaction69.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmTransactionDetails
 * CardPaymentTransaction69.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#mmEnvironment
 * AcceptorCurrencyConversionAdvice1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#mmTransaction
 * AcceptorCurrencyConversionAdvice1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmTransactionDetails
 * CardPaymentTransaction77.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmTransactionDetails
 * CardPaymentTransaction78.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction16#mmTransaction
 * CardTransaction16.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmCardTransaction
 * EntryTransaction9.mmCardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9#mmCardTransaction
 * ReportEntry9.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction3Choice#mmAggregated
 * CardTransaction3Choice.mmAggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction3Choice#mmIndividual
 * CardTransaction3Choice.mmIndividual}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3#mmAggregatedEntry
 * CardEntry3.mmAggregatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7#mmEnvironment
 * AcceptorCancellationResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7#mmTransaction
 * AcceptorCancellationResponse7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7#mmTransactionResponse
 * AcceptorCancellationResponse7.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7#mmEnvironment
 * AcceptorCancellationAdvice7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7#mmTransaction
 * AcceptorCancellationAdvice7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse7#mmEnvironment
 * AcceptorCancellationAdviceResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse5#mmEnvironment
 * AcceptorDiagnosticResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5#mmEnvironment
 * AcceptorCurrencyConversionRequest5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5#mmTransaction
 * AcceptorCurrencyConversionRequest5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7#mmEnvironment
 * AcceptorCompletionAdvice7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7#mmTransaction
 * AcceptorCompletionAdvice7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest7#mmEnvironment
 * AcceptorDiagnosticRequest7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest7#mmEnvironment
 * AcceptorCancellationRequest7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest7#mmTransaction
 * AcceptorCancellationRequest7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse5#mmEnvironment
 * AcceptorCurrencyConversionResponse5.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse5#mmTransaction
 * AcceptorCurrencyConversionResponse5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7#mmEnvironment
 * AcceptorAuthorisationRequest7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7#mmTransaction
 * AcceptorAuthorisationRequest7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7#mmEnvironment
 * AcceptorAuthorisationResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7#mmTransaction
 * AcceptorAuthorisationResponse7.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7#mmTransactionResponse
 * AcceptorAuthorisationResponse7.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice2#mmEnvironment
 * AcceptorCurrencyConversionAdvice2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice2#mmTransaction
 * AcceptorCurrencyConversionAdvice2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse7#mmEnvironment
 * AcceptorCompletionAdviceResponse7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmEnvironment
 * CardPaymentDataSetTransaction22.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmTransaction
 * CardPaymentDataSetTransaction22.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25#mmEnvironment
 * CardPaymentDataSetTransaction25.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25#mmTransaction
 * CardPaymentDataSetTransaction25.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25#mmTransactionResponse
 * CardPaymentDataSetTransaction25.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmEnvironment
 * CardPaymentDataSetTransaction24.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmTransaction
 * CardPaymentDataSetTransaction24.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23#mmEnvironment
 * CardPaymentDataSetTransaction23.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23#mmTransaction
 * CardPaymentDataSetTransaction23.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData7#mmEnvironment
 * CommonData7.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmOriginalTransaction
 * CardPaymentTransaction83.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmTransactionDetails
 * CardPaymentTransaction83.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmOriginalTransaction
 * CardPaymentTransaction81.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmTransactionDetails
 * CardPaymentTransaction81.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction82#mmOriginalTransaction
 * CardPaymentTransaction82.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction82#mmTransactionDetails
 * CardPaymentTransaction82.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmOriginalTransaction
 * CardPaymentTransaction80.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction80#mmTransactionDetails
 * CardPaymentTransaction80.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction85#mmOriginalTransaction
 * CardPaymentTransaction85.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction85#mmTransactionDetails
 * CardPaymentTransaction85.mmTransactionDetails}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndCurrency2
 * AmountAndCurrency2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction16
 * CardTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CardTransaction3Choice
 * CardTransaction3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAggregated2
 * CardAggregated2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3 CardEntry3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationResponse7
 * AcceptorCancellationResponse7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7
 * AcceptorCancellationAdvice7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse7
 * AcceptorCancellationAdviceResponse7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse5
 * AcceptorDiagnosticResponse5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest5
 * AcceptorCurrencyConversionRequest5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7
 * AcceptorCompletionAdvice7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest7
 * AcceptorDiagnosticRequest7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest7
 * AcceptorCancellationRequest7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse5
 * AcceptorCurrencyConversionResponse5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7
 * AcceptorAuthorisationRequest7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse7
 * AcceptorAuthorisationResponse7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice2
 * AcceptorCurrencyConversionAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse7
 * AcceptorCompletionAdviceResponse7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22
 * CardPaymentDataSetTransaction22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction25
 * CardPaymentDataSetTransaction25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24
 * CardPaymentDataSetTransaction24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23
 * CardPaymentDataSetTransaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonData7 CommonData7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment70
 * CardPaymentEnvironment70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71
 * CardPaymentEnvironment71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction84
 * CardPaymentTransaction84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment69
 * CardPaymentEnvironment69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection93
 * AmountAndDirection93}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44
 * CardPaymentTransactionDetails44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction79
 * CardPaymentTransaction79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment68
 * CardPaymentEnvironment68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction83
 * CardPaymentTransaction83}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45
 * CardPaymentTransactionDetails45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction81
 * CardPaymentTransaction81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction82
 * CardPaymentTransaction82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction80
 * CardPaymentTransaction80}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails46
 * CardPaymentTransactionDetails46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction85
 * CardPaymentTransaction85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction86
 * CardPaymentTransaction86}</li>
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
	protected PaymentCard paymentCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmPayment
	 * PaymentCard.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmPaymentCard
	 * PaymentInstrument7.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#mmPaymentCardDetails
	 * PaymentInstrument8.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#mmPaymentCardDetails
	 * PaymentInstrument17Choice.mmPaymentCardDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#mmCard
	 * CardEntry1.mmCard}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction1#mmCard
	 * CardTransaction1.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#mmCard
	 * CardPaymentEnvironment6.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmCard
	 * CardPaymentEnvironment14.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#mmPlainCardData
	 * CardPaymentEnvironment3.mmPlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#mmPlainCardData
	 * CardPaymentEnvironment11.mmPlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmPlainCardData
	 * CardPaymentEnvironment16.mmPlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#mmCard
	 * CardPaymentEnvironment1.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#mmCard
	 * CardPaymentEnvironment9.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment4#mmCard
	 * CardPaymentEnvironment4.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#mmCard
	 * CardPaymentEnvironment12.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#mmCard
	 * CardPaymentEnvironment2.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmCard
	 * CardPaymentEnvironment10.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#mmCard
	 * CardPaymentEnvironment18.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#mmPaymentCardDetails
	 * PaymentInstrument9Choice.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#mmPaymentCardDetails
	 * PaymentInstrument10Choice.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#mmPaymentCardDetails
	 * PaymentInstrument6Choice.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#mmPaymentCardDetails
	 * PaymentInstrument8Choice.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmPaymentCardDetails
	 * PaymentInstrument12Choice.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmFinancialCard
	 * TradeSettlement1.mmFinancialCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#mmCard
	 * CardPaymentEnvironment24.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#mmCard
	 * CardPaymentEnvironment20.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#mmCard
	 * CardPaymentEnvironment30.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmCard
	 * CardPaymentEnvironment27.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmPlainCardData
	 * CardPaymentEnvironment28.mmPlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#mmPlainCardData
	 * CardPaymentEnvironment21.mmPlainCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#mmCard
	 * CardPaymentEnvironment23.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmCard
	 * CardPaymentEnvironment22.mmCard}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#mmCard
	 * CardTransaction2.mmCard}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmCard
	 * CardEntry2.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#mmCard
	 * CardPaymentEnvironment32.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#mmCard
	 * CardPaymentEnvironment36.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmCard
	 * CardPaymentEnvironment40.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#mmCard
	 * CardPaymentEnvironment44.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCard
	 * CardPaymentEnvironment34.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#mmCard
	 * CardPaymentEnvironment35.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice#mmPaymentCardDetails
	 * PaymentInstrument18Choice.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#mmCard
	 * CardPaymentEnvironment52.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#mmCard
	 * CardPaymentEnvironment49.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#mmCard
	 * CardPaymentEnvironment48.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#mmCard
	 * CardPaymentEnvironment56.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#mmCard
	 * CardPaymentEnvironment45.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmCard
	 * CardPaymentEnvironment54.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmCard
	 * CardPaymentEnvironment53.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCard
	 * CardPaymentEnvironment47.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmPaymentCardDetails
	 * PaymentInstrument20Choice.mmPaymentCardDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmCard
	 * CardPaymentEnvironment61.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmCard
	 * CardPaymentEnvironment60.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#mmCard
	 * CardPaymentEnvironment66.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmCard
	 * CardPaymentEnvironment62.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#mmCard
	 * CardPaymentEnvironment63.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#mmCard
	 * CardPaymentEnvironment59.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmCard
	 * CardPaymentEnvironment57.mmCard}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction16#mmCard
	 * CardTransaction16.mmCard}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry3#mmCard
	 * CardEntry3.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment68#mmCard
	 * CardPaymentEnvironment68.mmCard}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentCard = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstrument7.mmPaymentCard, PaymentInstrument8.mmPaymentCardDetails, PaymentInstrument17Choice.mmPaymentCardDetails, CardEntry1.mmCard, CardTransaction1.mmCard,
					CardPaymentEnvironment6.mmCard, CardPaymentEnvironment14.mmCard, CardPaymentEnvironment3.mmPlainCardData, CardPaymentEnvironment11.mmPlainCardData, CardPaymentEnvironment16.mmPlainCardData,
					CardPaymentEnvironment1.mmCard, CardPaymentEnvironment9.mmCard, CardPaymentEnvironment4.mmCard, CardPaymentEnvironment12.mmCard, CardPaymentEnvironment2.mmCard, CardPaymentEnvironment10.mmCard,
					CardPaymentEnvironment18.mmCard, PaymentInstrument9Choice.mmPaymentCardDetails, PaymentInstrument10Choice.mmPaymentCardDetails, PaymentInstrument6Choice.mmPaymentCardDetails,
					PaymentInstrument8Choice.mmPaymentCardDetails, PaymentInstrument12Choice.mmPaymentCardDetails, TradeSettlement1.mmFinancialCard, CardPaymentEnvironment24.mmCard, CardPaymentEnvironment20.mmCard,
					CardPaymentEnvironment30.mmCard, CardPaymentEnvironment27.mmCard, CardPaymentEnvironment28.mmPlainCardData, CardPaymentEnvironment21.mmPlainCardData, CardPaymentEnvironment23.mmCard, CardPaymentEnvironment22.mmCard,
					CardTransaction2.mmCard, CardEntry2.mmCard, CardPaymentEnvironment32.mmCard, CardPaymentEnvironment36.mmCard, CardPaymentEnvironment40.mmCard, CardPaymentEnvironment44.mmCard, CardPaymentEnvironment34.mmCard,
					CardPaymentEnvironment35.mmCard, PaymentInstrument18Choice.mmPaymentCardDetails, CardPaymentEnvironment52.mmCard, CardPaymentEnvironment49.mmCard, CardPaymentEnvironment48.mmCard, CardPaymentEnvironment56.mmCard,
					CardPaymentEnvironment45.mmCard, CardPaymentEnvironment54.mmCard, CardPaymentEnvironment53.mmCard, CardPaymentEnvironment47.mmCard, PaymentInstrument20Choice.mmPaymentCardDetails, CardPaymentEnvironment61.mmCard,
					CardPaymentEnvironment60.mmCard, CardPaymentEnvironment66.mmCard, CardPaymentEnvironment62.mmCard, CardPaymentEnvironment63.mmCard, CardPaymentEnvironment59.mmCard, CardPaymentEnvironment57.mmCard,
					CardTransaction16.mmCard, CardEntry3.mmCard, CardPaymentEnvironment68.mmCard);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Specifies the card which is used in a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Product> product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCardPayment
	 * Product.mmCardPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmProduct
	 * CardIndividualTransaction1.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmProduct
	 * CardPaymentTransactionDetails4.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmProduct
	 * CardPaymentTransactionDetails1.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmProduct
	 * CardPaymentTransactionDetails10.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmProduct
	 * CardPaymentTransactionDetails3.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmProduct
	 * CardPaymentTransactionDetails12.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmProduct
	 * CardPaymentTransactionDetails16.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmProduct
	 * CardPaymentTransactionDetails14.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmProduct
	 * CardPaymentTransactionDetails15.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmProduct
	 * CardIndividualTransaction2.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmProduct
	 * CardPaymentTransactionDetails23.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmProduct
	 * CardPaymentTransactionDetails21.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmProduct
	 * CardPaymentTransactionDetails19.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmProduct
	 * CardPaymentTransactionDetails24.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmSaleItem
	 * CardPaymentTransactionDetails29.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmSaleItem
	 * CardPaymentTransactionDetails30.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmSaleItem
	 * CardPaymentTransactionDetails27.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmSaleItem
	 * CardPaymentTransactionDetails31.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmSaleItem
	 * CardPaymentTransactionDetails39.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmSaleItem
	 * CardPaymentTransactionDetails38.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmSaleItem
	 * CardPaymentTransactionDetails41.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmSaleItem
	 * CardPaymentTransactionDetails37.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmSaleItem
	 * CardPaymentTransactionDetails44.mmSaleItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmSaleItem
	 * CardPaymentTransactionDetails45.mmSaleItem}</li>
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
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardIndividualTransaction1.mmProduct, CardPaymentTransactionDetails4.mmProduct, CardPaymentTransactionDetails1.mmProduct, CardPaymentTransactionDetails10.mmProduct,
					CardPaymentTransactionDetails3.mmProduct, CardPaymentTransactionDetails12.mmProduct, CardPaymentTransactionDetails16.mmProduct, CardPaymentTransactionDetails14.mmProduct, CardPaymentTransactionDetails15.mmProduct,
					CardIndividualTransaction2.mmProduct, CardPaymentTransactionDetails23.mmProduct, CardPaymentTransactionDetails21.mmProduct, CardPaymentTransactionDetails19.mmProduct, CardPaymentTransactionDetails24.mmProduct,
					CardPaymentTransactionDetails29.mmSaleItem, CardPaymentTransactionDetails30.mmSaleItem, CardPaymentTransactionDetails27.mmSaleItem, CardPaymentTransactionDetails31.mmSaleItem, CardPaymentTransactionDetails39.mmSaleItem,
					CardPaymentTransactionDetails38.mmSaleItem, CardPaymentTransactionDetails41.mmSaleItem, CardPaymentTransactionDetails37.mmSaleItem, CardPaymentTransactionDetails44.mmSaleItem, CardPaymentTransactionDetails45.mmSaleItem);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount detailedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#mmAmount
	 * CardPaymentTransactionDetails8.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount1#mmValue
	 * DetailedAmount1.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmDetailedAmount
	 * CardPaymentTransactionDetails4.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmDetailedAmount
	 * CardPaymentTransactionDetails1.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmDetailedAmount
	 * CardPaymentTransactionDetails10.mmDetailedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount2#mmValue
	 * DetailedAmount2.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmDetailedAmount
	 * CardPaymentTransactionDetails2.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#mmDetailedAmount
	 * CardPaymentTransactionDetails11.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmDetailedAmount
	 * CardPaymentTransactionDetails3.mmDetailedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount3#mmValue
	 * DetailedAmount3.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmDetailedAmount
	 * CardPaymentTransactionDetails12.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmDetailedAmount
	 * CardPaymentTransactionDetails13.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmDetailedAmount
	 * CardPaymentTransactionDetails18.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmDetailedAmount
	 * CardPaymentTransactionDetails16.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmDetailedAmount
	 * CardPaymentTransactionDetails14.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmDetailedAmount
	 * CardPaymentTransactionDetails15.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#mmDetailedAmount
	 * CardPaymentTransactionDetails17.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmDetailedAmount
	 * CardPaymentTransactionDetails20.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#mmDetailedAmount
	 * CardPaymentTransactionDetails25.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmDetailedAmount
	 * CardPaymentTransactionDetails23.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmDetailedAmount
	 * CardPaymentTransactionDetails21.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#mmDetailedAmount
	 * CardPaymentTransactionDetails26.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmDetailedAmount
	 * CardPaymentTransactionDetails19.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmDetailedAmount
	 * CardPaymentTransactionDetails24.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount2#mmDetailedAmount
	 * CardTransactionAmount2.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount1.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmDetailedAmount
	 * CardTransactionAmount1.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmAdditionalAmounts
	 * CardTransactionDetail5.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmAdditionalAmounts
	 * CardTransactionDetail2.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAdditionalAmounts
	 * CardTransactionDetail1.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmTransactionFees
	 * CardTransactionDetail4.mmTransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmAdditionalAmounts
	 * CardTransactionDetail4.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail6#mmAdditionalAmounts
	 * CardTransactionDetail6.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount5.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmReconciliationTransactionAmount
	 * CardTransactionAmount5.mmReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount3.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmReconciliationTransactionAmount
	 * CardTransactionAmount3.mmReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmDetailedAmount
	 * CardTransactionAmount3.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount4.mmCardholderBillingTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#mmReconciliationTransactionAmount
	 * CardTransactionAmount4.mmReconciliationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#mmDetailedAmount
	 * CardTransactionAmount4.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAdditionalAmounts
	 * CardTransactionDetail3.mmAdditionalAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmDetailedAmount
	 * CardPaymentTransactionDetails32.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#mmDetailedAmount
	 * CardPaymentTransactionDetails33.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmDetailedAmount
	 * CardPaymentTransactionDetails28.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmDetailedAmount
	 * CardPaymentTransactionDetails29.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmDetailedAmount
	 * CardPaymentTransactionDetails30.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmDetailedAmount
	 * CardPaymentTransactionDetails27.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmDetailedAmount
	 * CardPaymentTransactionDetails31.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmDetailedAmount
	 * CardPaymentTransactionDetails39.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmDetailedAmount
	 * CardPaymentTransactionDetails38.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmDetailedAmount
	 * CardPaymentTransactionDetails41.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmDetailedAmount
	 * CardPaymentTransactionDetails37.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmDetailedAmount
	 * CardPaymentTransactionDetails40.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#mmDetailedAmount
	 * CardPaymentTransactionDetails42.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#mmDetailedAmount
	 * CardPaymentTransactionDetails43.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmDetailedAmount
	 * CardPaymentTransactionDetails44.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmDetailedAmount
	 * CardPaymentTransactionDetails45.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails46#mmDetailedAmount
	 * CardPaymentTransactionDetails46.mmDetailedAmount}</li>
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
	public static final MMBusinessAttribute mmDetailedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails8.mmAmount, DetailedAmount1.mmValue, CardPaymentTransactionDetails4.mmDetailedAmount, CardPaymentTransactionDetails1.mmDetailedAmount,
					CardPaymentTransactionDetails10.mmDetailedAmount, DetailedAmount2.mmValue, CardPaymentTransactionDetails2.mmDetailedAmount, CardPaymentTransactionDetails11.mmDetailedAmount,
					CardPaymentTransactionDetails3.mmDetailedAmount, DetailedAmount3.mmValue, CardPaymentTransactionDetails12.mmDetailedAmount, CardPaymentTransactionDetails13.mmDetailedAmount,
					CardPaymentTransactionDetails18.mmDetailedAmount, CardPaymentTransactionDetails16.mmDetailedAmount, CardPaymentTransactionDetails14.mmDetailedAmount, CardPaymentTransactionDetails15.mmDetailedAmount,
					CardPaymentTransactionDetails17.mmDetailedAmount, CardPaymentTransactionDetails20.mmDetailedAmount, CardPaymentTransactionDetails25.mmDetailedAmount, CardPaymentTransactionDetails23.mmDetailedAmount,
					CardPaymentTransactionDetails21.mmDetailedAmount, CardPaymentTransactionDetails26.mmDetailedAmount, CardPaymentTransactionDetails19.mmDetailedAmount, CardPaymentTransactionDetails24.mmDetailedAmount,
					CardTransactionAmount2.mmDetailedAmount, CardTransactionAmount1.mmCardholderBillingTransactionAmount, CardTransactionAmount1.mmDetailedAmount, CardTransactionDetail5.mmAdditionalAmounts,
					CardTransactionDetail2.mmAdditionalAmounts, CardTransactionDetail1.mmAdditionalAmounts, CardTransactionDetail4.mmTransactionFees, CardTransactionDetail4.mmAdditionalAmounts, CardTransactionDetail6.mmAdditionalAmounts,
					CardTransactionAmount5.mmCardholderBillingTransactionAmount, CardTransactionAmount5.mmReconciliationTransactionAmount, CardTransactionAmount3.mmCardholderBillingTransactionAmount,
					CardTransactionAmount3.mmReconciliationTransactionAmount, CardTransactionAmount3.mmDetailedAmount, CardTransactionAmount4.mmCardholderBillingTransactionAmount, CardTransactionAmount4.mmReconciliationTransactionAmount,
					CardTransactionAmount4.mmDetailedAmount, CardTransactionDetail3.mmAdditionalAmounts, CardPaymentTransactionDetails32.mmDetailedAmount, CardPaymentTransactionDetails33.mmDetailedAmount,
					CardPaymentTransactionDetails28.mmDetailedAmount, CardPaymentTransactionDetails29.mmDetailedAmount, CardPaymentTransactionDetails30.mmDetailedAmount, CardPaymentTransactionDetails27.mmDetailedAmount,
					CardPaymentTransactionDetails31.mmDetailedAmount, CardPaymentTransactionDetails39.mmDetailedAmount, CardPaymentTransactionDetails38.mmDetailedAmount, CardPaymentTransactionDetails41.mmDetailedAmount,
					CardPaymentTransactionDetails37.mmDetailedAmount, CardPaymentTransactionDetails40.mmDetailedAmount, CardPaymentTransactionDetails42.mmDetailedAmount, CardPaymentTransactionDetails43.mmDetailedAmount,
					CardPaymentTransactionDetails44.mmDetailedAmount, CardPaymentTransactionDetails45.mmDetailedAmount, CardPaymentTransactionDetails46.mmDetailedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amount value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getDetailedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeOfAmountCode amountQualifier;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardAmountAndCurrencyExchange1#mmType
	 * CardAmountAndCurrencyExchange1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount1#mmType
	 * DetailedAmount1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmAmountQualifier
	 * CardPaymentTransactionDetails4.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmAmountQualifier
	 * CardPaymentTransactionDetails1.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmAmountQualifier
	 * CardPaymentTransactionDetails10.mmAmountQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount2#mmType
	 * DetailedAmount2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmAmountQualifier
	 * CardPaymentTransactionDetails3.mmAmountQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount3#mmType
	 * DetailedAmount3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmAmountQualifier
	 * CardPaymentTransactionDetails12.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmAmountQualifier
	 * CardPaymentTransactionDetails18.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmAmountQualifier
	 * CardPaymentTransactionDetails16.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmAmountQualifier
	 * CardPaymentTransactionDetails14.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmAmountQualifier
	 * CardPaymentTransactionDetails15.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmAmountQualifier
	 * CardPaymentTransactionDetails23.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmAmountQualifier
	 * CardPaymentTransactionDetails21.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#mmAmountQualifier
	 * CardPaymentTransactionDetails26.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmAmountQualifier
	 * CardPaymentTransactionDetails19.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmAmountQualifier
	 * CardPaymentTransactionDetails24.mmAmountQualifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11#mmType
	 * DetailedAmount11.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#mmAdditionalType
	 * DetailedAmount11.mmAdditionalType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount10#mmType
	 * DetailedAmount10.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount9#mmType
	 * DetailedAmount9.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmAmountQualifier
	 * CardTransactionAmount1.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmAmountQualifier
	 * CardTransactionAmount3.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#mmAmountQualifier
	 * CardPaymentTransactionDetails33.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmAmountQualifier
	 * CardPaymentTransactionDetails29.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmAmountQualifier
	 * CardPaymentTransactionDetails30.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmAmountQualifier
	 * CardPaymentTransactionDetails27.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmAmountQualifier
	 * CardPaymentTransactionDetails31.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmAmountQualifier
	 * CardPaymentTransactionDetails39.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmAmountQualifier
	 * CardPaymentTransactionDetails38.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmAmountQualifier
	 * CardPaymentTransactionDetails41.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmAmountQualifier
	 * CardPaymentTransactionDetails37.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmAmountQualifier
	 * CardPaymentTransactionDetails40.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmAmountQualifier
	 * CardPaymentTransactionDetails44.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmAmountQualifier
	 * CardPaymentTransactionDetails45.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails46#mmAmountQualifier
	 * CardPaymentTransactionDetails46.mmAmountQualifier}</li>
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
	public static final MMBusinessAttribute mmAmountQualifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardAmountAndCurrencyExchange1.mmType, DetailedAmount1.mmType, CardPaymentTransactionDetails4.mmAmountQualifier, CardPaymentTransactionDetails1.mmAmountQualifier,
					CardPaymentTransactionDetails10.mmAmountQualifier, DetailedAmount2.mmType, CardPaymentTransactionDetails3.mmAmountQualifier, DetailedAmount3.mmType, CardPaymentTransactionDetails12.mmAmountQualifier,
					CardPaymentTransactionDetails18.mmAmountQualifier, CardPaymentTransactionDetails16.mmAmountQualifier, CardPaymentTransactionDetails14.mmAmountQualifier, CardPaymentTransactionDetails15.mmAmountQualifier,
					CardPaymentTransactionDetails23.mmAmountQualifier, CardPaymentTransactionDetails21.mmAmountQualifier, CardPaymentTransactionDetails26.mmAmountQualifier, CardPaymentTransactionDetails19.mmAmountQualifier,
					CardPaymentTransactionDetails24.mmAmountQualifier, DetailedAmount11.mmType, DetailedAmount11.mmAdditionalType, DetailedAmount10.mmType, DetailedAmount9.mmType, CardTransactionAmount1.mmAmountQualifier,
					CardTransactionAmount3.mmAmountQualifier, CardPaymentTransactionDetails33.mmAmountQualifier, CardPaymentTransactionDetails29.mmAmountQualifier, CardPaymentTransactionDetails30.mmAmountQualifier,
					CardPaymentTransactionDetails27.mmAmountQualifier, CardPaymentTransactionDetails31.mmAmountQualifier, CardPaymentTransactionDetails39.mmAmountQualifier, CardPaymentTransactionDetails38.mmAmountQualifier,
					CardPaymentTransactionDetails41.mmAmountQualifier, CardPaymentTransactionDetails37.mmAmountQualifier, CardPaymentTransactionDetails40.mmAmountQualifier, CardPaymentTransactionDetails44.mmAmountQualifier,
					CardPaymentTransactionDetails45.mmAmountQualifier, CardPaymentTransactionDetails46.mmAmountQualifier);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountQualifier";
			definition = "Identification of the type of amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfAmountCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getAmountQualifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentAcquiring> cardPaymentAcquiring;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
	 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#mmPaymentContext
	 * CardPaymentTransactionDetails8.mmPaymentContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData1#mmContext
	 * CommonData1.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1#mmContext
	 * CardPaymentDataSetTransaction1.mmContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData2#mmContext
	 * CommonData2.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction2#mmContext
	 * CardPaymentDataSetTransaction2.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction3#mmContext
	 * CardPaymentDataSetTransaction3.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction4#mmContext
	 * CardPaymentDataSetTransaction4.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#mmAction
	 * CardPaymentTransaction9.mmAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmAction
	 * CardPaymentTransaction18.mmAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest1#mmContext
	 * AcceptorAuthorisationRequest1.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest2#mmContext
	 * AcceptorAuthorisationRequest2.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#mmReconciliationTransactionIdentification
	 * TransactionReconciliation2.mmReconciliationTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest1#mmContext
	 * AcceptorCancellationRequest1.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest2#mmContext
	 * AcceptorCancellationRequest2.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction10#mmAction
	 * CardPaymentTransaction10.mmAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1#mmContext
	 * AcceptorCompletionAdvice1.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice2#mmContext
	 * AcceptorCompletionAdvice2.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice1#mmContext
	 * AcceptorCancellationAdvice1.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice2#mmContext
	 * AcceptorCancellationAdvice2.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3#mmContext
	 * AcceptorCancellationRequest3.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice3#mmContext
	 * AcceptorCompletionAdvice3.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest3#mmContext
	 * AcceptorAuthorisationRequest3.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice3#mmContext
	 * AcceptorCancellationAdvice3.mmContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData3#mmContext
	 * CommonData3.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction6#mmContext
	 * CardPaymentDataSetTransaction6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction7#mmContext
	 * CardPaymentDataSetTransaction7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmContext
	 * CardPaymentDataSetTransaction8.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmPaymentContext
	 * CardIndividualTransaction2.mmPaymentContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest4#mmContext
	 * AcceptorCancellationRequest4.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest4#mmContext
	 * AcceptorAuthorisationRequest4.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice4#mmContext
	 * AcceptorCancellationAdvice4.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice4#mmContext
	 * AcceptorCompletionAdvice4.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmContext
	 * CardPaymentDataSetTransaction12.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmReconciliationTransactionIdentification
	 * TransactionReconciliation3.mmReconciliationTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData4#mmContext
	 * CommonData4.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction11#mmContext
	 * CardPaymentDataSetTransaction11.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction10#mmContext
	 * CardPaymentDataSetTransaction10.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmTransactionIdentification
	 * ATMTransaction5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction4#mmTransactionIdentification
	 * ATMTransaction4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmTransactionIdentification
	 * ATMTransaction2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmTransactionIdentification
	 * ATMTransaction7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTransactionIdentification
	 * ATMTransaction3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmTransactionIdentification
	 * ATMTransaction6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmReconciliation
	 * CardTransaction10.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmReconciliation
	 * CardTransaction4.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmReconciliation
	 * CardTransaction9.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmReconciliation
	 * CardTransaction5.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmOriginalTransaction
	 * CardTransaction5.mmOriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmReconciliation
	 * CardTransaction15.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmOriginalTransaction
	 * CardTransaction15.mmOriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmOriginalTransaction
	 * CardTransaction7.mmOriginalTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmContext
	 * AcceptorCancellationAdvice5.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest5#mmContext
	 * AcceptorAuthorisationRequest5.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest5#mmContext
	 * AcceptorCancellationRequest5.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice5#mmContext
	 * AcceptorCompletionAdvice5.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmContext
	 * CardPaymentDataSetTransaction14.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction15#mmContext
	 * CardPaymentDataSetTransaction15.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmContext
	 * CardPaymentDataSetTransaction16.mmContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData5#mmContext
	 * CommonData5.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmReconciliationTransactionIdentification
	 * TransactionReconciliation4.mmReconciliationTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction18#mmTransactionIdentification
	 * ATMTransaction18.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#mmTransactionIdentification
	 * ATMTransaction14.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTransactionIdentification
	 * ATMTransaction17.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#mmTransactionIdentification
	 * ATMTransaction20.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmTransactionIdentification
	 * ATMTransaction21.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#mmTransactionIdentification
	 * ATMTransaction29.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest6#mmContext
	 * AcceptorCancellationRequest6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6#mmContext
	 * AcceptorAuthorisationRequest6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmContext
	 * AcceptorCancellationAdvice6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice6#mmContext
	 * AcceptorCompletionAdvice6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction19#mmContext
	 * CardPaymentDataSetTransaction19.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmContext
	 * CardPaymentDataSetTransaction20.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmContext
	 * CardPaymentDataSetTransaction18.mmContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#mmContext
	 * CommonData6.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice7#mmContext
	 * AcceptorCancellationAdvice7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice7#mmContext
	 * AcceptorCompletionAdvice7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest7#mmContext
	 * AcceptorCancellationRequest7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest7#mmContext
	 * AcceptorAuthorisationRequest7.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmContext
	 * CardPaymentDataSetTransaction22.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmContext
	 * CardPaymentDataSetTransaction24.mmContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction23#mmContext
	 * CardPaymentDataSetTransaction23.mmContext}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData7#mmContext
	 * CommonData7.mmContext}</li>
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
	public static final MMBusinessAssociationEnd mmCardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails8.mmPaymentContext, CommonData1.mmContext, CardPaymentDataSetTransaction1.mmContext, CommonData2.mmContext, CardPaymentDataSetTransaction2.mmContext,
					CardPaymentDataSetTransaction3.mmContext, CardPaymentDataSetTransaction4.mmContext, CardPaymentTransaction9.mmAction, CardPaymentTransaction18.mmAction, AcceptorAuthorisationRequest1.mmContext,
					AcceptorAuthorisationRequest2.mmContext, TransactionReconciliation2.mmReconciliationTransactionIdentification, AcceptorCancellationRequest1.mmContext, AcceptorCancellationRequest2.mmContext,
					CardPaymentTransaction10.mmAction, AcceptorCompletionAdvice1.mmContext, AcceptorCompletionAdvice2.mmContext, AcceptorCancellationAdvice1.mmContext, AcceptorCancellationAdvice2.mmContext,
					AcceptorCancellationRequest3.mmContext, AcceptorCompletionAdvice3.mmContext, AcceptorAuthorisationRequest3.mmContext, AcceptorCancellationAdvice3.mmContext, CommonData3.mmContext,
					CardPaymentDataSetTransaction6.mmContext, CardPaymentDataSetTransaction7.mmContext, CardPaymentDataSetTransaction8.mmContext, CardIndividualTransaction2.mmPaymentContext, AcceptorCancellationRequest4.mmContext,
					AcceptorAuthorisationRequest4.mmContext, AcceptorCancellationAdvice4.mmContext, AcceptorCompletionAdvice4.mmContext, CardPaymentDataSetTransaction12.mmContext,
					TransactionReconciliation3.mmReconciliationTransactionIdentification, CommonData4.mmContext, CardPaymentDataSetTransaction11.mmContext, CardPaymentDataSetTransaction10.mmContext,
					ATMTransaction5.mmTransactionIdentification, ATMTransaction4.mmTransactionIdentification, ATMTransaction2.mmTransactionIdentification, ATMTransaction7.mmTransactionIdentification,
					ATMTransaction3.mmTransactionIdentification, ATMTransaction6.mmTransactionIdentification, CardTransaction10.mmReconciliation, CardTransaction4.mmReconciliation, CardTransaction9.mmReconciliation,
					CardTransaction5.mmReconciliation, CardTransaction5.mmOriginalTransaction, CardTransaction15.mmReconciliation, CardTransaction15.mmOriginalTransaction, CardTransaction7.mmOriginalTransaction,
					AcceptorCancellationAdvice5.mmContext, AcceptorAuthorisationRequest5.mmContext, AcceptorCancellationRequest5.mmContext, AcceptorCompletionAdvice5.mmContext, CardPaymentDataSetTransaction14.mmContext,
					CardPaymentDataSetTransaction15.mmContext, CardPaymentDataSetTransaction16.mmContext, CommonData5.mmContext, TransactionReconciliation4.mmReconciliationTransactionIdentification,
					ATMTransaction18.mmTransactionIdentification, ATMTransaction14.mmTransactionIdentification, ATMTransaction17.mmTransactionIdentification, ATMTransaction20.mmTransactionIdentification,
					ATMTransaction21.mmTransactionIdentification, ATMTransaction29.mmTransactionIdentification, AcceptorCancellationRequest6.mmContext, AcceptorAuthorisationRequest6.mmContext, AcceptorCancellationAdvice6.mmContext,
					AcceptorCompletionAdvice6.mmContext, CardPaymentDataSetTransaction19.mmContext, CardPaymentDataSetTransaction20.mmContext, CardPaymentDataSetTransaction18.mmContext, CommonData6.mmContext,
					AcceptorCancellationAdvice7.mmContext, AcceptorCompletionAdvice7.mmContext, AcceptorCancellationRequest7.mmContext, AcceptorAuthorisationRequest7.mmContext, CardPaymentDataSetTransaction22.mmContext,
					CardPaymentDataSetTransaction24.mmContext, CardPaymentDataSetTransaction23.mmContext, CommonData7.mmContext);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Parameters of the process of acquiring a card payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentPartyRole> paymentCardPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole#mmCardPayment
	 * CardPaymentPartyRole.mmCardPayment}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentCardPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCardPartyRole";
			definition = "Specifies each role played by a party in the process of a payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentStatus> cardPaymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
	 * CardPaymentStatus.mmCardPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmTransactionStatus
	 * ATMTransaction5.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTransactionStatus
	 * ATMTransaction3.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTransactionStatus
	 * ATMTransaction17.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#mmTransactionStatus
	 * ATMTransaction20.mmTransactionStatus}</li>
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
	public static final MMBusinessAssociationEnd mmCardPaymentStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction5.mmTransactionStatus, ATMTransaction3.mmTransactionStatus, ATMTransaction17.mmTransactionStatus, ATMTransaction20.mmTransactionStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentStatus";
			definition = "Status of the payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
		}
	};
	protected Max35Text detailedAmountLabel;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmDetailedAmountLabel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DetailedAmountLabel";
			definition = "Short description of the amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getDetailedAmountLabel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReconciliationTransaction reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
	 * ReconciliationTransaction.mmCardPaymentTotal}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1#mmTransaction
	 * AcceptorReconciliationResponse1.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#mmTransaction
	 * AcceptorReconciliationResponse2.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#mmTransaction
	 * AcceptorReconciliationResponse3.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmReconciliation
	 * CardTransaction8.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmReconciliation
	 * CardTransaction7.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#mmTransaction
	 * AcceptorReconciliationResponse4.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse5#mmTransaction
	 * AcceptorReconciliationResponse5.mmTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorReconciliationResponse1.mmTransaction, AcceptorReconciliationResponse2.mmTransaction, AcceptorReconciliationResponse3.mmTransaction, CardTransaction8.mmReconciliation,
					CardTransaction7.mmReconciliation, AcceptorReconciliationResponse4.mmTransaction, AcceptorReconciliationResponse5.mmTransaction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Total of a certain type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmCardPaymentTotal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
		}
	};
	protected ExternalCardTransactionCategoryCode transactionCategory;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmTransactionCategory = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCategory";
			definition = "Specifies the category to which the card transaction belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCardTransactionCategoryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getTransactionCategory", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount cashBackAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCashBackAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBackAmount";
			definition = "Amount added to the total price of the transaction and received in cash by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getCashBackAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount gratuity;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmGratuity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Amount tendered for a service performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getGratuity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitCreditCode debitCreditDirection;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmDebitCreditDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditDirection";
			definition = "Specifies the direction of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPayment.class.getMethod("getDebitCreditDirection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ATMTotal> aTMTotal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
	 * ATMTotal.mmRelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ATMTotal ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmATMTotals
	 * ATMTransaction3.mmATMTotals}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmATMTotals
	 * ATMTransaction17.mmATMTotals}</li>
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
	public static final MMBusinessAssociationEnd mmATMTotal = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction3.mmATMTotals, ATMTransaction17.mmATMTotals);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ATMTotal";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPayment";
				definition = "Payment through an electronic money product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmCardPayment, com.tools20022.repository.entity.PaymentCard.mmPayment,
						com.tools20022.repository.entity.CardPaymentPartyRole.mmCardPayment, com.tools20022.repository.entity.CardPaymentAcquiring.mmRelatedCardPayment,
						com.tools20022.repository.entity.ReconciliationTransaction.mmCardPaymentTotal, com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment, com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment);
				derivationElement_lazy = () -> Arrays.asList(CardEntry1.mmAggregatedEntry, CardTransaction1Choice.mmAggregated, CardTransaction1Choice.mmIndividual, CardTransaction1.mmTransaction, EntryTransaction3.mmCardTransaction,
						ReportEntry3.mmCardTransaction, EntryTransaction4.mmCardTransaction, ReportEntry4.mmCardTransaction, TransactionData1.mmTransactionDetails, AcceptorDiagnosticResponse1.mmEnvironment,
						AcceptorDiagnosticResponse2.mmEnvironment, CommonData1.mmEnvironment, CardPaymentTransaction8.mmTransactionResult, CardPaymentTransaction4.mmOriginalTransaction, CardPaymentTransaction4.mmTransactionDetails,
						CardPaymentDataSetTransaction1.mmEnvironment, CardPaymentDataSetTransaction1.mmTransaction, CommonData2.mmEnvironment, CardPaymentTransaction17.mmTransactionResult, CardPaymentTransaction14.mmOriginalTransaction,
						CardPaymentTransaction14.mmTransactionDetails, CardPaymentDataSetTransaction2.mmEnvironment, CardPaymentDataSetTransaction2.mmTransaction, CardPaymentTransaction7.mmOriginalTransaction,
						CardPaymentTransaction7.mmTransactionDetails, CardPaymentTransaction16.mmOriginalTransaction, CardPaymentTransaction16.mmTransactionDetails, CardPaymentTransaction20.mmOriginalTransaction,
						CardPaymentTransaction20.mmTransactionDetails, CardPaymentDataSetTransaction3.mmEnvironment, CardPaymentDataSetTransaction3.mmTransaction, CardPaymentTransaction1.mmOriginalTransaction,
						CardPaymentTransaction1.mmTransactionDetails, CardPaymentTransaction11.mmOriginalTransaction, CardPaymentTransaction11.mmTransactionDetails, CardPaymentTransaction19.mmOriginalTransaction,
						CardPaymentTransaction19.mmTransactionDetails, CardPaymentDataSetTransaction4.mmEnvironment, CardPaymentDataSetTransaction4.mmTransaction, CardPaymentTransaction2.mmTransactionDetails,
						CardPaymentTransaction12.mmTransactionDetails, CardPaymentDataSetTransaction5.mmEnvironment, CardPaymentDataSetTransaction5.mmTransaction, CardPaymentDataSetTransaction5.mmTransactionResponse,
						AcceptorCancellationAdviceResponse1.mmEnvironment, AcceptorCancellationAdviceResponse2.mmEnvironment, AcceptorAuthorisationRequest1.mmEnvironment, AcceptorAuthorisationRequest1.mmTransaction,
						AcceptorAuthorisationRequest2.mmEnvironment, AcceptorAuthorisationRequest2.mmTransaction, AcceptorCompletionAdviceResponse1.mmEnvironment, AcceptorCompletionAdviceResponse2.mmEnvironment,
						CardPaymentTransaction5.mmOriginalTransaction, CardPaymentTransaction5.mmTransactionDetails, AcceptorCancellationRequest1.mmEnvironment, AcceptorCancellationRequest1.mmTransaction,
						CardPaymentTransaction15.mmOriginalTransaction, CardPaymentTransaction15.mmTransactionDetails, AcceptorCancellationRequest2.mmEnvironment, AcceptorCancellationRequest2.mmTransaction,
						CardPaymentTransaction6.mmTransactionDetails, AcceptorCancellationResponse1.mmEnvironment, AcceptorCancellationResponse1.mmTransaction, AcceptorCancellationResponse1.mmTransactionResponse,
						AcceptorCancellationResponse2.mmEnvironment, AcceptorCancellationResponse2.mmTransaction, AcceptorCancellationResponse2.mmTransactionResponse, AcceptorDiagnosticRequest1.mmEnvironment,
						AcceptorDiagnosticRequest2.mmEnvironment, CardPaymentTransaction3.mmOriginalTransaction, CardPaymentTransaction3.mmTransactionDetails, AcceptorCompletionAdvice1.mmEnvironment,
						AcceptorCompletionAdvice1.mmTransaction, CardPaymentTransaction13.mmOriginalTransaction, CardPaymentTransaction13.mmTransactionDetails, AcceptorCompletionAdvice2.mmEnvironment,
						AcceptorCompletionAdvice2.mmTransaction, AcceptorCancellationAdvice1.mmEnvironment, AcceptorCancellationAdvice1.mmTransaction, AcceptorCancellationAdvice2.mmEnvironment, AcceptorCancellationAdvice2.mmTransaction,
						AcceptorAuthorisationResponse1.mmEnvironment, AcceptorAuthorisationResponse1.mmTransaction, AcceptorAuthorisationResponse1.mmTransactionResponse, AcceptorAuthorisationResponse2.mmEnvironment,
						AcceptorAuthorisationResponse2.mmTransaction, AcceptorAuthorisationResponse2.mmTransactionResponse, AcceptorDiagnosticResponse3.mmEnvironment, AcceptorCurrencyConversionRequest1.mmEnvironment,
						AcceptorCurrencyConversionRequest1.mmTransaction, AcceptorCancellationRequest3.mmEnvironment, AcceptorCancellationRequest3.mmTransaction, AcceptorAuthorisationResponse3.mmEnvironment,
						AcceptorAuthorisationResponse3.mmTransaction, AcceptorAuthorisationResponse3.mmTransactionResponse, AcceptorDiagnosticRequest3.mmEnvironment, AcceptorCurrencyConversionResponse1.mmEnvironment,
						AcceptorCurrencyConversionResponse1.mmTransaction, AcceptorCurrencyConversionResponse1.mmTransactionResponse, AcceptorCancellationAdviceResponse3.mmEnvironment, AcceptorCompletionAdvice3.mmEnvironment,
						AcceptorCompletionAdvice3.mmTransaction, AcceptorAuthorisationRequest3.mmEnvironment, AcceptorAuthorisationRequest3.mmTransaction, AcceptorCompletionAdviceResponse3.mmEnvironment,
						AcceptorCancellationResponse3.mmEnvironment, AcceptorCancellationResponse3.mmTransaction, AcceptorCancellationResponse3.mmTransactionResponse, AcceptorCancellationAdvice3.mmEnvironment,
						AcceptorCancellationAdvice3.mmTransaction, AggregationTransaction1.mmIndividualPayment, CardPaymentTransaction28.mmOriginalTransaction, CardPaymentTransaction28.mmTransactionDetails,
						CardPaymentTransaction22.mmOriginalTransaction, CardPaymentTransaction22.mmTransactionDetails, CardPaymentTransaction34.mmOriginalTransaction, CardPaymentTransaction34.mmTransactionDetails,
						DetailedAmount5.mmCashBack, DetailedAmount5.mmGratuity, DetailedAmount5.mmFees, DetailedAmount5.mmRebate, DetailedAmount5.mmValueAddedTax, CardPaymentDataSetTransaction9.mmEnvironment,
						CardPaymentDataSetTransaction9.mmTransaction, CardPaymentDataSetTransaction9.mmTransactionResponse, CardPaymentTransaction32.mmTransactionDetails, CardPaymentTransaction31.mmOriginalTransaction,
						CardPaymentTransaction31.mmTransactionDetails, CardPaymentTransaction35.mmTransactionDetails, CommonData3.mmEnvironment, CardPaymentTransaction23.mmTransactionDetails, CardPaymentDataSetTransaction6.mmEnvironment,
						CardPaymentDataSetTransaction6.mmTransaction, CardPaymentDataSetTransaction7.mmEnvironment, CardPaymentDataSetTransaction7.mmTransaction, CardPaymentDataSetTransaction8.mmEnvironment,
						CardPaymentDataSetTransaction8.mmTransaction, CardPaymentTransaction29.mmOriginalTransaction, CardPaymentTransaction29.mmTransactionDetails, CardPaymentTransaction25.mmOriginalTransaction,
						CardPaymentTransaction25.mmTransactionDetails, CardPaymentTransaction30.mmOriginalTransaction, CardPaymentTransaction30.mmTransactionDetails, CardPaymentTransaction26.mmOriginalTransaction,
						CardPaymentTransaction26.mmTransactionDetails, ReportEntry7.mmCardTransaction, EntryTransaction7.mmCardTransaction, CardTransaction2.mmTransaction, CardTransaction2Choice.mmAggregated,
						CardTransaction2Choice.mmIndividual, CardEntry2.mmAggregatedEntry, AcceptorCancellationRequest4.mmEnvironment, AcceptorCancellationRequest4.mmTransaction, AcceptorDiagnosticResponse4.mmEnvironment,
						AcceptorAuthorisationRequest4.mmEnvironment, AcceptorAuthorisationRequest4.mmTransaction, AcceptorCurrencyConversionResponse2.mmEnvironment, AcceptorCurrencyConversionResponse2.mmTransaction,
						AcceptorAuthorisationResponse4.mmEnvironment, AcceptorAuthorisationResponse4.mmTransaction, AcceptorAuthorisationResponse4.mmTransactionResponse, AcceptorCancellationAdvice4.mmEnvironment,
						AcceptorCancellationAdvice4.mmTransaction, AcceptorCancellationResponse4.mmEnvironment, AcceptorCancellationResponse4.mmTransaction, AcceptorCancellationResponse4.mmTransactionResponse,
						AcceptorCurrencyConversionRequest2.mmEnvironment, AcceptorCurrencyConversionRequest2.mmTransaction, AcceptorDiagnosticRequest4.mmEnvironment, AcceptorCompletionAdvice4.mmEnvironment,
						AcceptorCompletionAdvice4.mmTransaction, AcceptorCancellationAdviceResponse4.mmEnvironment, AcceptorCompletionAdviceResponse4.mmEnvironment, CardPaymentTransaction38.mmTransactionDetails,
						CardPaymentTransaction48.mmTransactionDetails, CardPaymentTransaction42.mmTransactionDetails, CardPaymentTransaction36.mmOriginalTransaction, CardPaymentTransaction36.mmTransactionDetails,
						CardPaymentTransaction44.mmOriginalTransaction, CardPaymentTransaction44.mmTransactionDetails, CardPaymentTransaction45.mmOriginalTransaction, CardPaymentTransaction45.mmTransactionDetails,
						DetailedAmount7.mmCashBack, DetailedAmount7.mmGratuity, DetailedAmount7.mmFees, DetailedAmount7.mmRebate, DetailedAmount7.mmValueAddedTax, CardPaymentTransaction49.mmOriginalTransaction,
						CardPaymentTransaction49.mmTransactionDetails, CardPaymentDataSetTransaction12.mmEnvironment, CardPaymentDataSetTransaction12.mmTransaction, CardPaymentTransaction47.mmOriginalTransaction,
						CardPaymentTransaction47.mmTransactionDetails, CardPaymentDataSetTransaction13.mmEnvironment, CardPaymentDataSetTransaction13.mmTransaction, CardPaymentDataSetTransaction13.mmTransactionResponse,
						CardPaymentTransaction41.mmOriginalTransaction, CardPaymentTransaction41.mmTransactionDetails, CommonData4.mmEnvironment, CardPaymentDataSetTransaction11.mmEnvironment, CardPaymentDataSetTransaction11.mmTransaction,
						CardPaymentTransaction46.mmOriginalTransaction, CardPaymentTransaction46.mmTransactionDetails, CardPaymentDataSetTransaction10.mmEnvironment, CardPaymentDataSetTransaction10.mmTransaction,
						CardPaymentTransaction40.mmOriginalTransaction, CardPaymentTransaction40.mmTransactionDetails, DetailedAmount12.mmFees, DetailedAmount12.mmDonation, ATMTransactionAmounts2.mmDailyBalance,
						ATMTransactionAmounts2.mmWeeklyBalance, ATMTransactionAmounts2.mmMonthlyBalance, CardTransaction4.mmTransactionDetails, CardTransaction8.mmTransactionDetails, CardTransaction5.mmTransactionDetails,
						CardTransaction15.mmTransactionDetails, CardTransaction7.mmTransactionDetails, CardTransaction6.mmTransactionDetails, ReportEntry8.mmCardTransaction, EntryTransaction8.mmCardTransaction,
						AcceptorCancellationAdviceResponse5.mmEnvironment, AcceptorDiagnosticRequest5.mmEnvironment, AcceptorCurrencyConversionResponse3.mmEnvironment, AcceptorCurrencyConversionResponse3.mmTransaction,
						AcceptorCurrencyConversionRequest3.mmEnvironment, AcceptorCurrencyConversionRequest3.mmTransaction, AcceptorAuthorisationResponse5.mmEnvironment, AcceptorAuthorisationResponse5.mmTransaction,
						AcceptorAuthorisationResponse5.mmTransactionResponse, AcceptorCancellationResponse5.mmEnvironment, AcceptorCancellationResponse5.mmTransaction, AcceptorCancellationResponse5.mmTransactionResponse,
						AcceptorCancellationAdvice5.mmEnvironment, AcceptorCancellationAdvice5.mmTransaction, AcceptorCompletionAdviceResponse5.mmEnvironment, AcceptorAuthorisationRequest5.mmEnvironment,
						AcceptorAuthorisationRequest5.mmTransaction, AcceptorCancellationRequest5.mmEnvironment, AcceptorCancellationRequest5.mmTransaction, AcceptorCompletionAdvice5.mmEnvironment, AcceptorCompletionAdvice5.mmTransaction,
						DetailedAmount15.mmCashBack, DetailedAmount15.mmGratuity, DetailedAmount15.mmFees, DetailedAmount15.mmRebate, DetailedAmount15.mmValueAddedTax, CardPaymentTransaction63.mmTransactionDetails,
						CardPaymentDataSetTransaction14.mmEnvironment, CardPaymentDataSetTransaction14.mmTransaction, CardPaymentTransaction60.mmOriginalTransaction, CardPaymentTransaction60.mmTransactionDetails,
						CardPaymentTransaction57.mmTransactionDetails, CardPaymentTransaction61.mmOriginalTransaction, CardPaymentTransaction61.mmTransactionDetails, CardPaymentTransaction64.mmOriginalTransaction,
						CardPaymentTransaction64.mmTransactionDetails, CardPaymentTransaction53.mmTransactionDetails, CardPaymentTransaction59.mmOriginalTransaction, CardPaymentTransaction59.mmTransactionDetails,
						CardPaymentTransaction56.mmOriginalTransaction, CardPaymentTransaction56.mmTransactionDetails, CardPaymentDataSetTransaction15.mmEnvironment, CardPaymentDataSetTransaction15.mmTransaction,
						AggregationTransaction2.mmIndividualPayment, CardPaymentTransaction51.mmOriginalTransaction, CardPaymentTransaction51.mmTransactionDetails, CardPaymentDataSetTransaction16.mmEnvironment,
						CardPaymentDataSetTransaction16.mmTransaction, CardPaymentDataSetTransaction17.mmEnvironment, CardPaymentDataSetTransaction17.mmTransaction, CardPaymentDataSetTransaction17.mmTransactionResponse,
						CommonData5.mmEnvironment, CardPaymentTransaction55.mmOriginalTransaction, CardPaymentTransaction55.mmTransactionDetails, CardPaymentTransaction62.mmOriginalTransaction,
						CardPaymentTransaction62.mmTransactionDetails, DetailedAmount16.mmFees, DetailedAmount16.mmDonation, DetailedAmount17.mmFees, DetailedAmount17.mmDonation, AcceptorCurrencyConversionResponse4.mmEnvironment,
						AcceptorCurrencyConversionResponse4.mmTransaction, AcceptorCancellationRequest6.mmEnvironment, AcceptorCancellationRequest6.mmTransaction, AcceptorDiagnosticRequest6.mmEnvironment,
						AcceptorCancellationAdviceResponse6.mmEnvironment, AcceptorCurrencyConversionRequest4.mmEnvironment, AcceptorCurrencyConversionRequest4.mmTransaction, AcceptorCancellationResponse6.mmEnvironment,
						AcceptorCancellationResponse6.mmTransaction, AcceptorCancellationResponse6.mmTransactionResponse, AcceptorAuthorisationRequest6.mmEnvironment, AcceptorAuthorisationRequest6.mmTransaction,
						AcceptorCancellationAdvice6.mmEnvironment, AcceptorCancellationAdvice6.mmTransaction, AcceptorCompletionAdvice6.mmEnvironment, AcceptorCompletionAdvice6.mmTransaction,
						AcceptorCompletionAdviceResponse6.mmEnvironment, AcceptorAuthorisationResponse6.mmEnvironment, AcceptorAuthorisationResponse6.mmTransaction, AcceptorAuthorisationResponse6.mmTransactionResponse,
						CardPaymentTransaction71.mmOriginalTransaction, CardPaymentTransaction71.mmTransactionDetails, CardPaymentDataSetTransaction19.mmEnvironment, CardPaymentDataSetTransaction19.mmTransaction,
						CardPaymentTransaction75.mmOriginalTransaction, CardPaymentTransaction75.mmTransactionDetails, CardPaymentTransaction74.mmOriginalTransaction, CardPaymentTransaction74.mmTransactionDetails,
						CardPaymentDataSetTransaction21.mmEnvironment, CardPaymentDataSetTransaction21.mmTransaction, CardPaymentDataSetTransaction21.mmTransactionResponse, CardPaymentTransaction70.mmOriginalTransaction,
						CardPaymentTransaction70.mmTransactionDetails, CardPaymentDataSetTransaction20.mmEnvironment, CardPaymentDataSetTransaction20.mmTransaction, CardPaymentTransaction72.mmOriginalTransaction,
						CardPaymentTransaction72.mmTransactionDetails, CardPaymentTransaction76.mmOriginalTransaction, CardPaymentTransaction76.mmTransactionDetails, CardPaymentDataSetTransaction18.mmEnvironment,
						CardPaymentDataSetTransaction18.mmTransaction, CommonData6.mmEnvironment, CardPaymentTransaction69.mmOriginalTransaction, CardPaymentTransaction69.mmTransactionDetails,
						AcceptorCurrencyConversionAdvice1.mmEnvironment, AcceptorCurrencyConversionAdvice1.mmTransaction, CardPaymentTransaction77.mmTransactionDetails, CardPaymentTransaction78.mmTransactionDetails,
						CardTransaction16.mmTransaction, EntryTransaction9.mmCardTransaction, ReportEntry9.mmCardTransaction, CardTransaction3Choice.mmAggregated, CardTransaction3Choice.mmIndividual, CardEntry3.mmAggregatedEntry,
						AcceptorCancellationResponse7.mmEnvironment, AcceptorCancellationResponse7.mmTransaction, AcceptorCancellationResponse7.mmTransactionResponse, AcceptorCancellationAdvice7.mmEnvironment,
						AcceptorCancellationAdvice7.mmTransaction, AcceptorCancellationAdviceResponse7.mmEnvironment, AcceptorDiagnosticResponse5.mmEnvironment, AcceptorCurrencyConversionRequest5.mmEnvironment,
						AcceptorCurrencyConversionRequest5.mmTransaction, AcceptorCompletionAdvice7.mmEnvironment, AcceptorCompletionAdvice7.mmTransaction, AcceptorDiagnosticRequest7.mmEnvironment,
						AcceptorCancellationRequest7.mmEnvironment, AcceptorCancellationRequest7.mmTransaction, AcceptorCurrencyConversionResponse5.mmEnvironment, AcceptorCurrencyConversionResponse5.mmTransaction,
						AcceptorAuthorisationRequest7.mmEnvironment, AcceptorAuthorisationRequest7.mmTransaction, AcceptorAuthorisationResponse7.mmEnvironment, AcceptorAuthorisationResponse7.mmTransaction,
						AcceptorAuthorisationResponse7.mmTransactionResponse, AcceptorCurrencyConversionAdvice2.mmEnvironment, AcceptorCurrencyConversionAdvice2.mmTransaction, AcceptorCompletionAdviceResponse7.mmEnvironment,
						CardPaymentDataSetTransaction22.mmEnvironment, CardPaymentDataSetTransaction22.mmTransaction, CardPaymentDataSetTransaction25.mmEnvironment, CardPaymentDataSetTransaction25.mmTransaction,
						CardPaymentDataSetTransaction25.mmTransactionResponse, CardPaymentDataSetTransaction24.mmEnvironment, CardPaymentDataSetTransaction24.mmTransaction, CardPaymentDataSetTransaction23.mmEnvironment,
						CardPaymentDataSetTransaction23.mmTransaction, CommonData7.mmEnvironment, CardPaymentTransaction83.mmOriginalTransaction, CardPaymentTransaction83.mmTransactionDetails,
						CardPaymentTransaction81.mmOriginalTransaction, CardPaymentTransaction81.mmTransactionDetails, CardPaymentTransaction82.mmOriginalTransaction, CardPaymentTransaction82.mmTransactionDetails,
						CardPaymentTransaction80.mmOriginalTransaction, CardPaymentTransaction80.mmTransactionDetails, CardPaymentTransaction85.mmOriginalTransaction, CardPaymentTransaction85.mmTransactionDetails);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmPaymentCard, com.tools20022.repository.entity.CardPayment.mmProduct, com.tools20022.repository.entity.CardPayment.mmDetailedAmount,
						com.tools20022.repository.entity.CardPayment.mmAmountQualifier, com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring, com.tools20022.repository.entity.CardPayment.mmPaymentCardPartyRole,
						com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus, com.tools20022.repository.entity.CardPayment.mmDetailedAmountLabel, com.tools20022.repository.entity.CardPayment.mmReconciliation,
						com.tools20022.repository.entity.CardPayment.mmTransactionCategory, com.tools20022.repository.entity.CardPayment.mmCashBackAmount, com.tools20022.repository.entity.CardPayment.mmGratuity,
						com.tools20022.repository.entity.CardPayment.mmDebitCreditDirection, com.tools20022.repository.entity.CardPayment.mmATMTotal);
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
						AcceptorCurrencyConversionAdvice1.mmObject(), CardPaymentTransaction77.mmObject(), CardPaymentTransaction78.mmObject(), AmountAndCurrency2.mmObject(), CardTransaction16.mmObject(), CardTransaction3Choice.mmObject(),
						CardAggregated2.mmObject(), CardEntry3.mmObject(), AcceptorCancellationResponse7.mmObject(), AcceptorCancellationAdvice7.mmObject(), AcceptorCancellationAdviceResponse7.mmObject(),
						AcceptorDiagnosticResponse5.mmObject(), AcceptorCurrencyConversionRequest5.mmObject(), AcceptorCompletionAdvice7.mmObject(), AcceptorDiagnosticRequest7.mmObject(), AcceptorCancellationRequest7.mmObject(),
						AcceptorCurrencyConversionResponse5.mmObject(), AcceptorAuthorisationRequest7.mmObject(), AcceptorAuthorisationResponse7.mmObject(), AcceptorCurrencyConversionAdvice2.mmObject(),
						AcceptorCompletionAdviceResponse7.mmObject(), CardPaymentDataSetTransaction22.mmObject(), CardPaymentDataSetTransaction25.mmObject(), CardPaymentDataSetTransaction24.mmObject(),
						CardPaymentDataSetTransaction23.mmObject(), CommonData7.mmObject(), CardPaymentEnvironment70.mmObject(), CardPaymentEnvironment71.mmObject(), CardPaymentTransaction84.mmObject(), CardPaymentEnvironment69.mmObject(),
						AmountAndDirection93.mmObject(), CardPaymentTransactionDetails44.mmObject(), CardPaymentTransaction79.mmObject(), CardPaymentEnvironment68.mmObject(), CardPaymentTransaction83.mmObject(),
						CardPaymentTransactionDetails45.mmObject(), CardPaymentTransaction81.mmObject(), CardPaymentTransaction82.mmObject(), CardPaymentTransaction80.mmObject(), CardPaymentTransactionDetails46.mmObject(),
						CardPaymentTransaction85.mmObject(), CardPaymentTransaction86.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPayment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentCard getPaymentCard() {
		return paymentCard;
	}

	public CardPayment setPaymentCard(com.tools20022.repository.entity.PaymentCard paymentCard) {
		this.paymentCard = Objects.requireNonNull(paymentCard);
		return this;
	}

	public List<Product> getProduct() {
		return product == null ? product = new ArrayList<>() : product;
	}

	public CardPayment setProduct(List<com.tools20022.repository.entity.Product> product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public ImpliedCurrencyAndAmount getDetailedAmount() {
		return detailedAmount;
	}

	public CardPayment setDetailedAmount(ImpliedCurrencyAndAmount detailedAmount) {
		this.detailedAmount = Objects.requireNonNull(detailedAmount);
		return this;
	}

	public TypeOfAmountCode getAmountQualifier() {
		return amountQualifier;
	}

	public CardPayment setAmountQualifier(TypeOfAmountCode amountQualifier) {
		this.amountQualifier = Objects.requireNonNull(amountQualifier);
		return this;
	}

	public List<CardPaymentAcquiring> getCardPaymentAcquiring() {
		return cardPaymentAcquiring == null ? cardPaymentAcquiring = new ArrayList<>() : cardPaymentAcquiring;
	}

	public CardPayment setCardPaymentAcquiring(List<com.tools20022.repository.entity.CardPaymentAcquiring> cardPaymentAcquiring) {
		this.cardPaymentAcquiring = Objects.requireNonNull(cardPaymentAcquiring);
		return this;
	}

	public List<CardPaymentPartyRole> getPaymentCardPartyRole() {
		return paymentCardPartyRole == null ? paymentCardPartyRole = new ArrayList<>() : paymentCardPartyRole;
	}

	public CardPayment setPaymentCardPartyRole(List<com.tools20022.repository.entity.CardPaymentPartyRole> paymentCardPartyRole) {
		this.paymentCardPartyRole = Objects.requireNonNull(paymentCardPartyRole);
		return this;
	}

	public List<CardPaymentStatus> getCardPaymentStatus() {
		return cardPaymentStatus == null ? cardPaymentStatus = new ArrayList<>() : cardPaymentStatus;
	}

	public CardPayment setCardPaymentStatus(List<com.tools20022.repository.entity.CardPaymentStatus> cardPaymentStatus) {
		this.cardPaymentStatus = Objects.requireNonNull(cardPaymentStatus);
		return this;
	}

	public Max35Text getDetailedAmountLabel() {
		return detailedAmountLabel;
	}

	public CardPayment setDetailedAmountLabel(Max35Text detailedAmountLabel) {
		this.detailedAmountLabel = Objects.requireNonNull(detailedAmountLabel);
		return this;
	}

	public Optional<ReconciliationTransaction> getReconciliation() {
		return reconciliation == null ? Optional.empty() : Optional.of(reconciliation);
	}

	public CardPayment setReconciliation(com.tools20022.repository.entity.ReconciliationTransaction reconciliation) {
		this.reconciliation = reconciliation;
		return this;
	}

	public ExternalCardTransactionCategoryCode getTransactionCategory() {
		return transactionCategory;
	}

	public CardPayment setTransactionCategory(ExternalCardTransactionCategoryCode transactionCategory) {
		this.transactionCategory = Objects.requireNonNull(transactionCategory);
		return this;
	}

	public CurrencyAndAmount getCashBackAmount() {
		return cashBackAmount;
	}

	public CardPayment setCashBackAmount(CurrencyAndAmount cashBackAmount) {
		this.cashBackAmount = Objects.requireNonNull(cashBackAmount);
		return this;
	}

	public CurrencyAndAmount getGratuity() {
		return gratuity;
	}

	public CardPayment setGratuity(CurrencyAndAmount gratuity) {
		this.gratuity = Objects.requireNonNull(gratuity);
		return this;
	}

	public DebitCreditCode getDebitCreditDirection() {
		return debitCreditDirection;
	}

	public CardPayment setDebitCreditDirection(DebitCreditCode debitCreditDirection) {
		this.debitCreditDirection = Objects.requireNonNull(debitCreditDirection);
		return this;
	}

	public List<ATMTotal> getATMTotal() {
		return aTMTotal == null ? aTMTotal = new ArrayList<>() : aTMTotal;
	}

	public CardPayment setATMTotal(List<com.tools20022.repository.entity.ATMTotal> aTMTotal) {
		this.aTMTotal = Objects.requireNonNull(aTMTotal);
		return this;
	}
}