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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeTransactionTotalsCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Reconciliation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Reconciliation
 * Reconciliation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
 * ReconciliationTransaction.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCurrency
 * ReconciliationTransaction.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTransactionType
 * ReconciliationTransaction.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTotalNumber
 * ReconciliationTransaction.mmTotalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCumulativeAmount
 * ReconciliationTransaction.mmCumulativeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmClosePeriod
 * ReconciliationTransaction.mmClosePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
 * ReconciliationTransaction.mmCardPaymentTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
 * CardPayment.mmReconciliation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest1#mmTransaction
 * AcceptorReconciliationRequest1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2#mmTransaction
 * AcceptorReconciliationRequest2.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3#mmTransaction
 * AcceptorReconciliationRequest3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4#mmTransaction
 * AcceptorReconciliationRequest4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5#mmTransaction
 * AcceptorReconciliationRequest5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#mmTransaction
 * AcceptorReconciliationRequest6.mmTransaction}</li>
 * </ul>
 * </li>
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
	protected Max35Text reconciliationIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmSaleReconciliationIdentification
	 * CardIndividualTransaction1.mmSaleReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#mmReconciliationIdentification
	 * CommonData1.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmReconciliationIdentification
	 * CardPaymentTransaction4.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#mmReconciliationIdentification
	 * CommonData2.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmReconciliationIdentification
	 * CardPaymentTransaction14.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmReconciliationIdentification
	 * CardPaymentTransaction7.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmReconciliationIdentification
	 * CardPaymentTransaction16.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmReconciliationIdentification
	 * CardPaymentTransaction20.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmReconciliationIdentification
	 * CardPaymentTransaction1.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmReconciliationIdentification
	 * CardPaymentTransaction11.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmReconciliationIdentification
	 * CardPaymentTransaction19.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#mmReconciliationIdentification
	 * CardPaymentTransaction2.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#mmReconciliationIdentification
	 * CardPaymentTransaction12.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation1#mmReconciliationIdentification
	 * TransactionReconciliation1.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#mmReconciliationIdentification
	 * TransactionReconciliation2.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#mmReconciliationIdentification
	 * CardPaymentTransaction5.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmReconciliationIdentification
	 * CardPaymentTransaction15.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#mmReconciliationIdentification
	 * CardPaymentTransaction6.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmReconciliationIdentification
	 * CardPaymentTransaction3.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmReconciliationIdentification
	 * CardPaymentTransaction13.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmReconciliationIdentification
	 * CardPaymentTransaction28.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmReconciliationIdentification
	 * CardPaymentTransaction22.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#mmReconciliationIdentification
	 * CardPaymentTransaction32.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmReconciliationIdentification
	 * CardPaymentTransaction31.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#mmReconciliationIdentification
	 * CardPaymentTransaction35.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#mmReconciliationIdentification
	 * CommonData3.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#mmReconciliationIdentification
	 * CardPaymentTransaction23.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmReconciliationIdentification
	 * CardPaymentTransaction29.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmReconciliationIdentification
	 * CardPaymentTransaction25.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmReconciliationIdentification
	 * CardPaymentTransaction30.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmReconciliationIdentification
	 * CardPaymentTransaction26.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmSaleReconciliationIdentification
	 * CardIndividualTransaction2.mmSaleReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#mmReconciliationIdentification
	 * CardPaymentTransaction38.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#mmReconciliationIdentification
	 * CardPaymentTransaction48.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#mmReconciliationIdentification
	 * CardPaymentTransaction42.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmReconciliationIdentification
	 * CardPaymentTransaction36.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmReconciliationIdentification
	 * CardPaymentTransaction44.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmReconciliationIdentification
	 * CardPaymentTransaction45.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmReconciliationIdentification
	 * CardPaymentTransaction47.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmReconciliationIdentification
	 * TransactionReconciliation3.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#mmReconciliationIdentification
	 * CardPaymentTransaction41.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#mmReconciliationIdentification
	 * CommonData4.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmReconciliationIdentification
	 * CardPaymentTransaction46.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmReconciliationIdentification
	 * CardPaymentTransaction40.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmReconciliationIdentification
	 * ATMTransaction1.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier2#mmReconciliationIdentification
	 * TransactionIdentifier2.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#mmReconciliationIdentification
	 * CardPaymentTransaction63.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmReconciliationIdentification
	 * CardPaymentTransaction60.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmReconciliationIdentification
	 * CardPaymentTransaction57.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmReconciliationIdentification
	 * CardPaymentTransaction61.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#mmReconciliationIdentification
	 * CardPaymentTransaction53.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmReconciliationIdentification
	 * CardPaymentTransaction59.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#mmReconciliationIdentification
	 * CardPaymentTransaction56.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmReconciliationIdentification
	 * CardPaymentTransaction51.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#mmReconciliationIdentification
	 * CommonData5.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmReconciliationIdentification
	 * CardPaymentTransaction55.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmReconciliationIdentification
	 * CardPaymentTransaction62.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmReconciliationIdentification
	 * TransactionReconciliation4.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmReconciliationIdentification
	 * ATMTransaction13.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmReconciliationIdentification
	 * ATMTransaction16.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmReconciliationIdentification
	 * ATMTransaction19.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmReconciliationIdentification
	 * ATMTransaction15.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmReconciliationIdentification
	 * ATMTransaction24.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmReconciliationIdentification
	 * ATMTransaction23.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmReconciliationIdentification
	 * CardPaymentTransaction71.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmReconciliationIdentification
	 * CardPaymentTransaction75.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmReconciliationIdentification
	 * CardPaymentTransaction74.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmReconciliationIdentification
	 * CardPaymentTransaction70.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmReconciliationIdentification
	 * CardPaymentTransaction76.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmReconciliationIdentification
	 * CommonData6.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmReconciliationIdentification
	 * CardPaymentTransaction69.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmReconciliationIdentification
	 * CardPaymentTransaction77.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmReconciliationIdentification
	 * CardPaymentTransaction78.mmReconciliationIdentification}</li>
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
	public static final MMBusinessAttribute mmReconciliationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardIndividualTransaction1.mmSaleReconciliationIdentification, CommonData1.mmReconciliationIdentification, CardPaymentTransaction4.mmReconciliationIdentification,
					CommonData2.mmReconciliationIdentification, CardPaymentTransaction14.mmReconciliationIdentification, CardPaymentTransaction7.mmReconciliationIdentification, CardPaymentTransaction16.mmReconciliationIdentification,
					CardPaymentTransaction20.mmReconciliationIdentification, CardPaymentTransaction1.mmReconciliationIdentification, CardPaymentTransaction11.mmReconciliationIdentification,
					CardPaymentTransaction19.mmReconciliationIdentification, CardPaymentTransaction2.mmReconciliationIdentification, CardPaymentTransaction12.mmReconciliationIdentification,
					TransactionReconciliation1.mmReconciliationIdentification, TransactionReconciliation2.mmReconciliationIdentification, CardPaymentTransaction5.mmReconciliationIdentification,
					CardPaymentTransaction15.mmReconciliationIdentification, CardPaymentTransaction6.mmReconciliationIdentification, CardPaymentTransaction3.mmReconciliationIdentification,
					CardPaymentTransaction13.mmReconciliationIdentification, CardPaymentTransaction28.mmReconciliationIdentification, CardPaymentTransaction22.mmReconciliationIdentification,
					CardPaymentTransaction32.mmReconciliationIdentification, CardPaymentTransaction31.mmReconciliationIdentification, CardPaymentTransaction35.mmReconciliationIdentification, CommonData3.mmReconciliationIdentification,
					CardPaymentTransaction23.mmReconciliationIdentification, CardPaymentTransaction29.mmReconciliationIdentification, CardPaymentTransaction25.mmReconciliationIdentification,
					CardPaymentTransaction30.mmReconciliationIdentification, CardPaymentTransaction26.mmReconciliationIdentification, CardIndividualTransaction2.mmSaleReconciliationIdentification,
					CardPaymentTransaction38.mmReconciliationIdentification, CardPaymentTransaction48.mmReconciliationIdentification, CardPaymentTransaction42.mmReconciliationIdentification,
					CardPaymentTransaction36.mmReconciliationIdentification, CardPaymentTransaction44.mmReconciliationIdentification, CardPaymentTransaction45.mmReconciliationIdentification,
					CardPaymentTransaction47.mmReconciliationIdentification, TransactionReconciliation3.mmReconciliationIdentification, CardPaymentTransaction41.mmReconciliationIdentification, CommonData4.mmReconciliationIdentification,
					CardPaymentTransaction46.mmReconciliationIdentification, CardPaymentTransaction40.mmReconciliationIdentification, ATMTransaction1.mmReconciliationIdentification, TransactionIdentifier2.mmReconciliationIdentification,
					CardPaymentTransaction63.mmReconciliationIdentification, CardPaymentTransaction60.mmReconciliationIdentification, CardPaymentTransaction57.mmReconciliationIdentification,
					CardPaymentTransaction61.mmReconciliationIdentification, CardPaymentTransaction53.mmReconciliationIdentification, CardPaymentTransaction59.mmReconciliationIdentification,
					CardPaymentTransaction56.mmReconciliationIdentification, CardPaymentTransaction51.mmReconciliationIdentification, CommonData5.mmReconciliationIdentification, CardPaymentTransaction55.mmReconciliationIdentification,
					CardPaymentTransaction62.mmReconciliationIdentification, TransactionReconciliation4.mmReconciliationIdentification, ATMTransaction13.mmReconciliationIdentification, ATMTransaction16.mmReconciliationIdentification,
					ATMTransaction19.mmReconciliationIdentification, ATMTransaction15.mmReconciliationIdentification, ATMTransaction24.mmReconciliationIdentification, ATMTransaction23.mmReconciliationIdentification,
					CardPaymentTransaction71.mmReconciliationIdentification, CardPaymentTransaction75.mmReconciliationIdentification, CardPaymentTransaction74.mmReconciliationIdentification,
					CardPaymentTransaction70.mmReconciliationIdentification, CardPaymentTransaction76.mmReconciliationIdentification, CommonData6.mmReconciliationIdentification, CardPaymentTransaction69.mmReconciliationIdentification,
					CardPaymentTransaction77.mmReconciliationIdentification, CardPaymentTransaction78.mmReconciliationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getReconciliationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#mmCurrency
	 * TransactionTotals1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCurrency
	 * TransactionTotals2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCurrency
	 * TransactionTotals3.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmCurrency
	 * TransactionTotals7.mmCurrency}</li>
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
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionTotals1.mmCurrency, TransactionTotals2.mmCurrency, TransactionTotals3.mmCurrency, TransactionTotals7.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency associated with thecumulative amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeTransactionTotalsCode transactionType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals1#mmType
	 * TransactionTotals1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals2#mmType
	 * TransactionTotals2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals3#mmType
	 * TransactionTotals3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals7#mmType
	 * TransactionTotals7.mmType}</li>
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
	public static final MMBusinessAttribute mmTransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionTotals1.mmType, TransactionTotals2.mmType, TransactionTotals3.mmType, TransactionTotals7.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Identification of the type of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeTransactionTotalsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getTransactionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text totalNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#mmTotalNumber
	 * TransactionTotals1.mmTotalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmTotalNumber
	 * TransactionTotals2.mmTotalNumber}</li>
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
	public static final MMBusinessAttribute mmTotalNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionTotals1.mmTotalNumber, TransactionTotals2.mmTotalNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumber";
			definition = "Total number of transactions during a reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getTotalNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ImpliedCurrencyAndAmount cumulativeAmount;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals1#mmCumulativeAmount
	 * TransactionTotals1.mmCumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCumulativeAmount
	 * TransactionTotals2.mmCumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCumulativeAmount
	 * TransactionTotals3.mmCumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmCumulativeAmount
	 * TransactionTotals7.mmCumulativeAmount}</li>
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
	public static final MMBusinessAttribute mmCumulativeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionTotals1.mmCumulativeAmount, TransactionTotals2.mmCumulativeAmount, TransactionTotals3.mmCumulativeAmount, TransactionTotals7.mmCumulativeAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumulativeAmount";
			definition = "Total amount of a collection of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getCumulativeAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator closePeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation1#mmClosePeriod
	 * TransactionReconciliation1.mmClosePeriod}</li>
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
	public static final MMBusinessAttribute mmClosePeriod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReconciliation1.mmClosePeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosePeriod";
			definition = "Indicates if the exchange requires a closure of the reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReconciliationTransaction.class.getMethod("getClosePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CardPayment> cardPaymentTotal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
	 * CardPayment.mmReconciliation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest1#mmEnvironment
	 * AcceptorReconciliationRequest1.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2#mmEnvironment
	 * AcceptorReconciliationRequest2.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3#mmEnvironment
	 * AcceptorReconciliationRequest3.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4#mmEnvironment
	 * AcceptorReconciliationRequest4.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5#mmEnvironment
	 * AcceptorReconciliationRequest5.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#mmEnvironment
	 * AcceptorReconciliationRequest6.mmEnvironment}</li>
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
	public static final MMBusinessAssociationEnd mmCardPaymentTotal = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorReconciliationRequest1.mmEnvironment, AcceptorReconciliationRequest2.mmEnvironment, AcceptorReconciliationRequest3.mmEnvironment, AcceptorReconciliationRequest4.mmEnvironment,
					AcceptorReconciliationRequest5.mmEnvironment, AcceptorReconciliationRequest6.mmEnvironment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentTotal";
			definition = "Specifies the card payments which are part of the transaction reconciliation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReconciliationTransaction";
				definition = "Totals performed during the reconciliation period, for a certain type of transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmReconciliation);
				derivationElement_lazy = () -> Arrays.asList(AcceptorReconciliationRequest1.mmTransaction, AcceptorReconciliationRequest2.mmTransaction, AcceptorReconciliationRequest3.mmTransaction,
						AcceptorReconciliationRequest4.mmTransaction, AcceptorReconciliationRequest5.mmTransaction, AcceptorReconciliationRequest6.mmTransaction);
				superType_lazy = () -> Reconciliation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReconciliationTransaction.mmReconciliationIdentification, com.tools20022.repository.entity.ReconciliationTransaction.mmCurrency,
						com.tools20022.repository.entity.ReconciliationTransaction.mmTransactionType, com.tools20022.repository.entity.ReconciliationTransaction.mmTotalNumber,
						com.tools20022.repository.entity.ReconciliationTransaction.mmCumulativeAmount, com.tools20022.repository.entity.ReconciliationTransaction.mmClosePeriod,
						com.tools20022.repository.entity.ReconciliationTransaction.mmCardPaymentTotal);
				derivationComponent_lazy = () -> Arrays.asList(TransactionTotals1.mmObject(), TransactionReconciliation1.mmObject(), AcceptorReconciliationRequest1.mmObject(), TransactionReconciliation2.mmObject(),
						AcceptorReconciliationRequest2.mmObject(), AcceptorReconciliationRequest3.mmObject(), AcceptorReconciliationRequest4.mmObject(), TransactionReconciliation3.mmObject(), CardTransaction10.mmObject(),
						CardTransaction9.mmObject(), AcceptorReconciliationRequest5.mmObject(), TransactionReconciliation4.mmObject(), AcceptorReconciliationRequest6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReconciliationTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public ReconciliationTransaction setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = Objects.requireNonNull(reconciliationIdentification);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public ReconciliationTransaction setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public TypeTransactionTotalsCode getTransactionType() {
		return transactionType;
	}

	public ReconciliationTransaction setTransactionType(TypeTransactionTotalsCode transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public Max35Text getTotalNumber() {
		return totalNumber;
	}

	public ReconciliationTransaction setTotalNumber(Max35Text totalNumber) {
		this.totalNumber = Objects.requireNonNull(totalNumber);
		return this;
	}

	public ImpliedCurrencyAndAmount getCumulativeAmount() {
		return cumulativeAmount;
	}

	public ReconciliationTransaction setCumulativeAmount(ImpliedCurrencyAndAmount cumulativeAmount) {
		this.cumulativeAmount = Objects.requireNonNull(cumulativeAmount);
		return this;
	}

	public TrueFalseIndicator getClosePeriod() {
		return closePeriod;
	}

	public ReconciliationTransaction setClosePeriod(TrueFalseIndicator closePeriod) {
		this.closePeriod = Objects.requireNonNull(closePeriod);
		return this;
	}

	public List<CardPayment> getCardPaymentTotal() {
		return cardPaymentTotal == null ? cardPaymentTotal = new ArrayList<>() : cardPaymentTotal;
	}

	public ReconciliationTransaction setCardPaymentTotal(List<com.tools20022.repository.entity.CardPayment> cardPaymentTotal) {
		this.cardPaymentTotal = Objects.requireNonNull(cardPaymentTotal);
		return this;
	}
}