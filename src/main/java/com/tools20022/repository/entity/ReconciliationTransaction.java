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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeTransactionTotalsCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Reconciliation;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Totals performed during the reconciliation period, for a certain type of
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReconciliationTransaction"
 * src="doc-files/ReconciliationTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#ReconciliationIdentification
 * ReconciliationTransaction.ReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#Currency
 * ReconciliationTransaction.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#TransactionType
 * ReconciliationTransaction.TransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#TotalNumber
 * ReconciliationTransaction.TotalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#CumulativeAmount
 * ReconciliationTransaction.CumulativeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#ClosePeriod
 * ReconciliationTransaction.ClosePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#CardPaymentTotal
 * ReconciliationTransaction.CardPaymentTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#Reconciliation
 * CardPayment.Reconciliation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest1#Transaction
 * AcceptorReconciliationRequest1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2#Transaction
 * AcceptorReconciliationRequest2.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3#Transaction
 * AcceptorReconciliationRequest3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4#Transaction
 * AcceptorReconciliationRequest4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5#Transaction
 * AcceptorReconciliationRequest5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#Transaction
 * AcceptorReconciliationRequest6.Transaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Reconciliation
 * Reconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals1
 * TransactionTotals1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReconciliation1
 * TransactionReconciliation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest1
 * AcceptorReconciliationRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReconciliation2
 * TransactionReconciliation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2
 * AcceptorReconciliationRequest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3
 * AcceptorReconciliationRequest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4
 * AcceptorReconciliationRequest4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReconciliation3
 * TransactionReconciliation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction10
 * CardTransaction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction9
 * CardTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5
 * AcceptorReconciliationRequest5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReconciliation4
 * TransactionReconciliation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6
 * AcceptorReconciliationRequest6}</li>
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
 * "ReconciliationTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals performed during the reconciliation period, for a certain type of transaction."
 * </li>
 * </ul>
 */
public class ReconciliationTransaction extends Reconciliation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification of the reconciliation period between the acceptor
	 * and the acquirer. This identification might be linked to the
	 * identification of the settlement for further verification by the
	 * merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#SaleReconciliationIdentification
	 * CardIndividualTransaction1.SaleReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#ReconciliationIdentification
	 * CommonData1.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#ReconciliationIdentification
	 * CardPaymentTransaction4.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#ReconciliationIdentification
	 * CommonData2.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#ReconciliationIdentification
	 * CardPaymentTransaction14.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#ReconciliationIdentification
	 * CardPaymentTransaction7.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#ReconciliationIdentification
	 * CardPaymentTransaction16.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#ReconciliationIdentification
	 * CardPaymentTransaction20.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#ReconciliationIdentification
	 * CardPaymentTransaction1.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#ReconciliationIdentification
	 * CardPaymentTransaction11.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#ReconciliationIdentification
	 * CardPaymentTransaction19.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#ReconciliationIdentification
	 * CardPaymentTransaction2.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#ReconciliationIdentification
	 * CardPaymentTransaction12.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation1#ReconciliationIdentification
	 * TransactionReconciliation1.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#ReconciliationIdentification
	 * TransactionReconciliation2.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#ReconciliationIdentification
	 * CardPaymentTransaction5.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#ReconciliationIdentification
	 * CardPaymentTransaction15.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#ReconciliationIdentification
	 * CardPaymentTransaction6.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#ReconciliationIdentification
	 * CardPaymentTransaction3.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#ReconciliationIdentification
	 * CardPaymentTransaction13.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#ReconciliationIdentification
	 * CardPaymentTransaction28.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#ReconciliationIdentification
	 * CardPaymentTransaction22.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#ReconciliationIdentification
	 * CardPaymentTransaction32.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#ReconciliationIdentification
	 * CardPaymentTransaction31.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#ReconciliationIdentification
	 * CardPaymentTransaction35.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#ReconciliationIdentification
	 * CommonData3.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#ReconciliationIdentification
	 * CardPaymentTransaction23.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#ReconciliationIdentification
	 * CardPaymentTransaction29.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#ReconciliationIdentification
	 * CardPaymentTransaction25.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#ReconciliationIdentification
	 * CardPaymentTransaction30.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#ReconciliationIdentification
	 * CardPaymentTransaction26.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#SaleReconciliationIdentification
	 * CardIndividualTransaction2.SaleReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#ReconciliationIdentification
	 * CardPaymentTransaction38.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#ReconciliationIdentification
	 * CardPaymentTransaction48.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#ReconciliationIdentification
	 * CardPaymentTransaction42.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#ReconciliationIdentification
	 * CardPaymentTransaction36.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#ReconciliationIdentification
	 * CardPaymentTransaction44.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#ReconciliationIdentification
	 * CardPaymentTransaction45.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#ReconciliationIdentification
	 * CardPaymentTransaction47.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#ReconciliationIdentification
	 * TransactionReconciliation3.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#ReconciliationIdentification
	 * CardPaymentTransaction41.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#ReconciliationIdentification
	 * CommonData4.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#ReconciliationIdentification
	 * CardPaymentTransaction46.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#ReconciliationIdentification
	 * CardPaymentTransaction40.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#ReconciliationIdentification
	 * ATMTransaction1.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier2#ReconciliationIdentification
	 * TransactionIdentifier2.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#ReconciliationIdentification
	 * CardPaymentTransaction63.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#ReconciliationIdentification
	 * CardPaymentTransaction60.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#ReconciliationIdentification
	 * CardPaymentTransaction57.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#ReconciliationIdentification
	 * CardPaymentTransaction61.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#ReconciliationIdentification
	 * CardPaymentTransaction53.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#ReconciliationIdentification
	 * CardPaymentTransaction59.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#ReconciliationIdentification
	 * CardPaymentTransaction56.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#ReconciliationIdentification
	 * CardPaymentTransaction51.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#ReconciliationIdentification
	 * CommonData5.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#ReconciliationIdentification
	 * CardPaymentTransaction55.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#ReconciliationIdentification
	 * CardPaymentTransaction62.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#ReconciliationIdentification
	 * TransactionReconciliation4.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#ReconciliationIdentification
	 * ATMTransaction13.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#ReconciliationIdentification
	 * ATMTransaction16.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#ReconciliationIdentification
	 * ATMTransaction19.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#ReconciliationIdentification
	 * ATMTransaction15.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#ReconciliationIdentification
	 * ATMTransaction24.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#ReconciliationIdentification
	 * ATMTransaction23.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#ReconciliationIdentification
	 * CardPaymentTransaction71.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#ReconciliationIdentification
	 * CardPaymentTransaction75.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#ReconciliationIdentification
	 * CardPaymentTransaction74.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#ReconciliationIdentification
	 * CardPaymentTransaction70.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#ReconciliationIdentification
	 * CardPaymentTransaction76.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#ReconciliationIdentification
	 * CommonData6.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#ReconciliationIdentification
	 * CardPaymentTransaction69.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#ReconciliationIdentification
	 * CardPaymentTransaction77.ReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#ReconciliationIdentification
	 * CardPaymentTransaction78.ReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReconciliationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardIndividualTransaction1.SaleReconciliationIdentification, com.tools20022.repository.msg.CommonData1.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction4.ReconciliationIdentification, com.tools20022.repository.msg.CommonData2.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction14.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction7.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction16.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction20.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction1.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction11.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction19.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction2.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction12.ReconciliationIdentification, com.tools20022.repository.msg.TransactionReconciliation1.ReconciliationIdentification,
					com.tools20022.repository.msg.TransactionReconciliation2.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction5.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction15.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction6.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction3.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction13.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction28.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction22.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction32.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction31.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction35.ReconciliationIdentification, com.tools20022.repository.msg.CommonData3.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction23.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction29.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction25.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction30.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction26.ReconciliationIdentification, com.tools20022.repository.msg.CardIndividualTransaction2.SaleReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction38.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction48.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction42.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction36.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction44.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction45.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction47.ReconciliationIdentification, com.tools20022.repository.msg.TransactionReconciliation3.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction41.ReconciliationIdentification, com.tools20022.repository.msg.CommonData4.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction46.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction40.ReconciliationIdentification,
					com.tools20022.repository.msg.ATMTransaction1.ReconciliationIdentification, com.tools20022.repository.msg.TransactionIdentifier2.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction63.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction60.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction57.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction61.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction53.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction59.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction56.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction51.ReconciliationIdentification,
					com.tools20022.repository.msg.CommonData5.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction55.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction62.ReconciliationIdentification, com.tools20022.repository.msg.TransactionReconciliation4.ReconciliationIdentification,
					com.tools20022.repository.msg.ATMTransaction13.ReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction16.ReconciliationIdentification,
					com.tools20022.repository.msg.ATMTransaction19.ReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction15.ReconciliationIdentification,
					com.tools20022.repository.msg.ATMTransaction24.ReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction23.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction71.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction75.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction74.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction70.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction76.ReconciliationIdentification, com.tools20022.repository.msg.CommonData6.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction69.ReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction77.ReconciliationIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction78.ReconciliationIdentification);
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency associated with thecumulative amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#Currency
	 * TransactionTotals1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#Currency
	 * TransactionTotals2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#Currency
	 * TransactionTotals3.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#Currency
	 * TransactionTotals7.Currency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with thecumulative amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals1.Currency, com.tools20022.repository.msg.TransactionTotals2.Currency, com.tools20022.repository.msg.TransactionTotals3.Currency,
					com.tools20022.repository.msg.TransactionTotals7.Currency);
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency associated with thecumulative amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Identification of the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
	 * TypeTransactionTotalsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals1#Type
	 * TransactionTotals1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals2#Type
	 * TransactionTotals2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals3#Type
	 * TransactionTotals3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals7#Type
	 * TransactionTotals7.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals1.Type, com.tools20022.repository.msg.TransactionTotals2.Type, com.tools20022.repository.msg.TransactionTotals3.Type,
					com.tools20022.repository.msg.TransactionTotals7.Type);
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Identification of the type of transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeTransactionTotalsCode.mmObject();
		}
	};
	/**
	 * Total number of transactions during a reconciliation period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#TotalNumber
	 * TransactionTotals1.TotalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#TotalNumber
	 * TransactionTotals2.TotalNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions during a reconciliation period."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals1.TotalNumber, com.tools20022.repository.msg.TransactionTotals2.TotalNumber);
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumber";
			definition = "Total number of transactions during a reconciliation period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total amount of a collection of transactions.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#CumulativeAmount
	 * TransactionTotals1.CumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#CumulativeAmount
	 * TransactionTotals2.CumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#CumulativeAmount
	 * TransactionTotals3.CumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#CumulativeAmount
	 * TransactionTotals7.CumulativeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of a collection of transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CumulativeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals1.CumulativeAmount, com.tools20022.repository.msg.TransactionTotals2.CumulativeAmount,
					com.tools20022.repository.msg.TransactionTotals3.CumulativeAmount, com.tools20022.repository.msg.TransactionTotals7.CumulativeAmount);
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumulativeAmount";
			definition = "Total amount of a collection of transactions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates if the exchange requires a closure of the reconciliation
	 * period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation1#ClosePeriod
	 * TransactionReconciliation1.ClosePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the exchange requires a closure of the reconciliation period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClosePeriod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReconciliation1.ClosePeriod);
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosePeriod";
			definition = "Indicates if the exchange requires a closure of the reconciliation period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Specifies the card payments which are part of the transaction
	 * reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#Reconciliation
	 * CardPayment.Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest1#Environment
	 * AcceptorReconciliationRequest1.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2#Environment
	 * AcceptorReconciliationRequest2.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3#Environment
	 * AcceptorReconciliationRequest3.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4#Environment
	 * AcceptorReconciliationRequest4.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5#Environment
	 * AcceptorReconciliationRequest5.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#Environment
	 * AcceptorReconciliationRequest6.Environment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentTotal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the card payments which are part of the transaction reconciliation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPaymentTotal = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorReconciliationRequest1.Environment, com.tools20022.repository.msg.AcceptorReconciliationRequest2.Environment,
					com.tools20022.repository.msg.AcceptorReconciliationRequest3.Environment, com.tools20022.repository.msg.AcceptorReconciliationRequest4.Environment,
					com.tools20022.repository.msg.AcceptorReconciliationRequest5.Environment, com.tools20022.repository.msg.AcceptorReconciliationRequest6.Environment);
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentTotal";
			definition = "Specifies the card payments which are part of the transaction reconciliation.";
			minOccurs = 0;
			type_lazy = () -> CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.Reconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReconciliationTransaction";
				definition = "Totals performed during the reconciliation period, for a certain type of transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.Reconciliation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorReconciliationRequest1.Transaction, com.tools20022.repository.msg.AcceptorReconciliationRequest2.Transaction,
						com.tools20022.repository.msg.AcceptorReconciliationRequest3.Transaction, com.tools20022.repository.msg.AcceptorReconciliationRequest4.Transaction,
						com.tools20022.repository.msg.AcceptorReconciliationRequest5.Transaction, com.tools20022.repository.msg.AcceptorReconciliationRequest6.Transaction);
				superType_lazy = () -> Reconciliation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReconciliationTransaction.ReconciliationIdentification, com.tools20022.repository.entity.ReconciliationTransaction.Currency,
						com.tools20022.repository.entity.ReconciliationTransaction.TransactionType, com.tools20022.repository.entity.ReconciliationTransaction.TotalNumber,
						com.tools20022.repository.entity.ReconciliationTransaction.CumulativeAmount, com.tools20022.repository.entity.ReconciliationTransaction.ClosePeriod,
						com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal);
				derivationComponent_lazy = () -> Arrays.asList(TransactionTotals1.mmObject(), TransactionReconciliation1.mmObject(), AcceptorReconciliationRequest1.mmObject(), TransactionReconciliation2.mmObject(),
						AcceptorReconciliationRequest2.mmObject(), AcceptorReconciliationRequest3.mmObject(), AcceptorReconciliationRequest4.mmObject(), TransactionReconciliation3.mmObject(), CardTransaction10.mmObject(),
						CardTransaction9.mmObject(), AcceptorReconciliationRequest5.mmObject(), TransactionReconciliation4.mmObject(), AcceptorReconciliationRequest6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}