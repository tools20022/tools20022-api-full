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
import com.tools20022.repository.choice.InitialAmount1Choice;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.InstalmentPlanCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.InvestmentPlan;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the details of each successive payment in settlement of a debt or
 * in an investment plan.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Instalment" src="doc-files/Instalment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmInitialNumberOfInstalment
 * Instalment.mmInitialNumberOfInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmTotalNumberOfInstalment
 * Instalment.mmTotalNumberOfInstalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#mmPeriodUnit
 * Instalment.mmPeriodUnit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#mmNumberOfUnits
 * Instalment.mmNumberOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmSequenceIdentification
 * Instalment.mmSequenceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#mmInvestmentPlan
 * Instalment.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmInstalmentPlanType
 * Instalment.mmInstalmentPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentAmount
 * Instalment.mmFirstPaymentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentDate
 * Instalment.mmFirstPaymentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInstalment
 * InvestmentPlan.mmInstalment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmRecurringTransaction
 * CardPaymentTransactionDetails4.mmRecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmRecurringTransaction
 * CardPaymentTransactionDetails1.mmRecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmRecurringTransaction
 * CardPaymentTransactionDetails10.mmRecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmRecurringTransaction
 * CardPaymentTransactionDetails3.mmRecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmInstalmentInformation
 * InvoiceRequestInformation1.mmInstalmentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#mmInstalmentFinancingInformation
 * InvoiceFinancingDetails1.mmInstalmentFinancingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmInstalment
 * CardPaymentTransactionDetails12.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmInstalment
 * CardPaymentTransactionDetails16.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmInstalment
 * CardPaymentTransactionDetails14.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmInstalment
 * CardPaymentTransactionDetails15.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmInstalment
 * CardPaymentTransactionDetails23.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmInstalment
 * CardPaymentTransactionDetails21.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmInstalment
 * CardPaymentTransactionDetails19.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmInstalment
 * CardPaymentTransactionDetails24.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmFinancingInstalment
 * FinancingItemList1.mmFinancingInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmInstalmentInformation
 * FinancialItem1.mmInstalmentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmInstalment
 * CardTransactionDetail1.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmInstalment
 * CardTransactionDetail3.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmInstalment
 * CardPaymentTransactionDetails29.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmInstalment
 * CardPaymentTransactionDetails30.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmInstalment
 * CardPaymentTransactionDetails27.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmInstalment
 * CardPaymentTransactionDetails31.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmInstalment
 * CardPaymentTransactionDetails39.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmInstalment
 * CardPaymentTransactionDetails38.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmInstalment
 * CardPaymentTransactionDetails41.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmInstalment
 * CardPaymentTransactionDetails37.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmInstalment
 * CardPaymentTransactionDetails44.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmInstalment
 * CardPaymentTransactionDetails45.mmInstalment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RecurringTransaction1
 * RecurringTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instalment1 Instalment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RecurringTransaction2
 * RecurringTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instalment2 Instalment2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InitialAmount1Choice
 * InitialAmount1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RecurringTransaction3
 * RecurringTransaction3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Instalment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of each successive payment in settlement of a debt or in an investment plan."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Instalment extends PaymentObligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number initialNumberOfInstalment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmInitialNumberOfInstalment
	 * InvestmentPlan2.mmInitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmInitialNumberOfInstalment
	 * InvestmentPlan4.mmInitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmInitialNumberOfInstalment
	 * InvestmentPlan6.mmInitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmInitialNumberOfInstalment
	 * InvestmentPlan5.mmInitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmInitialNumberOfInstalment
	 * InvestmentPlan3.mmInitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmInitialNumberOfInstalment
	 * InvestmentPlan7.mmInitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmInitialNumberOfInstalments
	 * InvestmentPlan9.mmInitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmInitialNumberOfInstalments
	 * InvestmentPlan8.mmInitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmInitialNumberOfInstalments
	 * InvestmentPlan10.mmInitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmInitialNumberOfInstalments
	 * InvestmentPlan11.mmInitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InitialAmount1Choice#mmInitialNumberOfInstalments
	 * InitialAmount1Choice.mmInitialNumberOfInstalments}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialNumberOfInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of pre-paid instalment periods at the time an investment plan is created."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, Number> mmInitialNumberOfInstalment = new MMBusinessAttribute<Instalment, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmInitialNumberOfInstalment, InvestmentPlan4.mmInitialNumberOfInstalment, InvestmentPlan6.mmInitialNumberOfInstalment, InvestmentPlan5.mmInitialNumberOfInstalment,
					InvestmentPlan3.mmInitialNumberOfInstalment, InvestmentPlan7.mmInitialNumberOfInstalment, InvestmentPlan9.mmInitialNumberOfInstalments, InvestmentPlan8.mmInitialNumberOfInstalments,
					InvestmentPlan10.mmInitialNumberOfInstalments, InvestmentPlan11.mmInitialNumberOfInstalments, InitialAmount1Choice.mmInitialNumberOfInstalments);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialNumberOfInstalment";
			definition = "Number of pre-paid instalment periods at the time an investment plan is created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Instalment obj) {
			return obj.getInitialNumberOfInstalment();
		}

		@Override
		public void setValue(Instalment obj, Number value) {
			obj.setInitialNumberOfInstalment(value);
		}
	};
	protected Number totalNumberOfInstalment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmTotalNumberOfInstalment
	 * InvestmentPlan2.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmTotalNumberOfInstalment
	 * InvestmentPlan4.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmTotalNumberOfInstalment
	 * InvestmentPlan6.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmTotalNumberOfInstalment
	 * InvestmentPlan5.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmTotalNumberOfInstalment
	 * InvestmentPlan3.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmTotalNumberOfInstalment
	 * InvestmentPlan7.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmTotalNumberOfPayments
	 * RecurringTransaction1.mmTotalNumberOfPayments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmTotalNumberOfInstalments
	 * InvestmentPlan9.mmTotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmTotalNumberOfInstalments
	 * InvestmentPlan8.mmTotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmTotalNumberOfPayments
	 * RecurringTransaction2.mmTotalNumberOfPayments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmTotalNumberOfInstalments
	 * InvestmentPlan10.mmTotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmTotalNumberOfInstalments
	 * InvestmentPlan11.mmTotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmTotalNumberOfInstalments
	 * InvestmentPlan12.mmTotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmTotalNumberOfInstalments
	 * InvestmentPlan13.mmTotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmNumberOfOccurrences
	 * RecurringTransaction3.mmNumberOfOccurrences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmTotalNumberOfInstalments
	 * InvestmentPlan14.mmTotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmTotalNumberOfInstalments
	 * InvestmentPlan15.mmTotalNumberOfInstalments}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, Number> mmTotalNumberOfInstalment = new MMBusinessAttribute<Instalment, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmTotalNumberOfInstalment, InvestmentPlan4.mmTotalNumberOfInstalment, InvestmentPlan6.mmTotalNumberOfInstalment, InvestmentPlan5.mmTotalNumberOfInstalment,
					InvestmentPlan3.mmTotalNumberOfInstalment, InvestmentPlan7.mmTotalNumberOfInstalment, RecurringTransaction1.mmTotalNumberOfPayments, InvestmentPlan9.mmTotalNumberOfInstalments,
					InvestmentPlan8.mmTotalNumberOfInstalments, RecurringTransaction2.mmTotalNumberOfPayments, InvestmentPlan10.mmTotalNumberOfInstalments, InvestmentPlan11.mmTotalNumberOfInstalments,
					InvestmentPlan12.mmTotalNumberOfInstalments, InvestmentPlan13.mmTotalNumberOfInstalments, RecurringTransaction3.mmNumberOfOccurrences, InvestmentPlan14.mmTotalNumberOfInstalments,
					InvestmentPlan15.mmTotalNumberOfInstalments);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfInstalment";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Instalment obj) {
			return obj.getTotalNumberOfInstalment();
		}

		@Override
		public void setValue(Instalment obj, Number value) {
			obj.setTotalNumberOfInstalment(value);
		}
	};
	protected FrequencyCode periodUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmPeriodUnit
	 * RecurringTransaction1.mmPeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmPeriodUnit
	 * RecurringTransaction2.mmPeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmPeriodUnit
	 * RecurringTransaction3.mmPeriodUnit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period unit between consecutive payments (for example day, month, year)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, FrequencyCode> mmPeriodUnit = new MMBusinessAttribute<Instalment, FrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RecurringTransaction1.mmPeriodUnit, RecurringTransaction2.mmPeriodUnit, RecurringTransaction3.mmPeriodUnit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeriodUnit";
			definition = "Period unit between consecutive payments (for example day, month, year).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(Instalment obj) {
			return obj.getPeriodUnit();
		}

		@Override
		public void setValue(Instalment obj, FrequencyCode value) {
			obj.setPeriodUnit(value);
		}
	};
	protected Number numberOfUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmInstalmentPeriod
	 * RecurringTransaction1.mmInstalmentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmInstalmentPeriod
	 * RecurringTransaction2.mmInstalmentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmIntervalDay
	 * RecurringTransaction3.mmIntervalDay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of period units between consecutive payments."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, Number> mmNumberOfUnits = new MMBusinessAttribute<Instalment, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(RecurringTransaction1.mmInstalmentPeriod, RecurringTransaction2.mmInstalmentPeriod, RecurringTransaction3.mmIntervalDay);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfUnits";
			definition = "Number of period units between consecutive payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Instalment obj) {
			return obj.getNumberOfUnits();
		}

		@Override
		public void setValue(Instalment obj, Number value) {
			obj.setNumberOfUnits(value);
		}
	};
	protected Max70Text sequenceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment1#mmSequenceIdentification
	 * Instalment1.mmSequenceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment2#mmSequenceIdentification
	 * Instalment2.mmSequenceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the progressive number of a single instalment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, Max70Text> mmSequenceIdentification = new MMBusinessAttribute<Instalment, Max70Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Instalment1.mmSequenceIdentification, Instalment2.mmSequenceIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SequenceIdentification";
			definition = "Specifies the progressive number of a single instalment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(Instalment obj) {
			return obj.getSequenceIdentification();
		}

		@Override
		public void setValue(Instalment obj, Max70Text value) {
			obj.setSequenceIdentification(value);
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInstalment
	 * InvestmentPlan.mmInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment plan for which instalment information is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Instalment, Optional<InvestmentPlan>> mmInvestmentPlan = new MMBusinessAssociationEnd<Instalment, Optional<InvestmentPlan>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan for which instalment information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmInstalment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}

		@Override
		public Optional<InvestmentPlan> getValue(Instalment obj) {
			return obj.getInvestmentPlan();
		}

		@Override
		public void setValue(Instalment obj, Optional<InvestmentPlan> value) {
			obj.setInvestmentPlan(value.orElse(null));
		}
	};
	protected InstalmentPlanCode instalmentPlanType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode
	 * InstalmentPlanCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmInstalmentPlan
	 * RecurringTransaction2.mmInstalmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instalment plan."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, InstalmentPlanCode> mmInstalmentPlanType = new MMBusinessAttribute<Instalment, InstalmentPlanCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RecurringTransaction2.mmInstalmentPlan);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstalmentPlanType";
			definition = "Type of instalment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstalmentPlanCode.mmObject();
		}

		@Override
		public InstalmentPlanCode getValue(Instalment obj) {
			return obj.getInstalmentPlanType();
		}

		@Override
		public void setValue(Instalment obj, InstalmentPlanCode value) {
			obj.setInstalmentPlanType(value);
		}
	};
	protected CurrencyAndAmount firstPaymentAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmFirstAmount
	 * RecurringTransaction2.mmFirstAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the first payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, CurrencyAndAmount> mmFirstPaymentAmount = new MMBusinessAttribute<Instalment, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(RecurringTransaction2.mmFirstAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentAmount";
			definition = "Amount of the first payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Instalment obj) {
			return obj.getFirstPaymentAmount();
		}

		@Override
		public void setValue(Instalment obj, CurrencyAndAmount value) {
			obj.setFirstPaymentAmount(value);
		}
	};
	protected ISODateTime firstPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmFirstPaymentDate
	 * RecurringTransaction2.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmStartDate
	 * RecurringTransaction3.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the first payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Instalment, ISODateTime> mmFirstPaymentDate = new MMBusinessAttribute<Instalment, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(RecurringTransaction2.mmFirstPaymentDate, RecurringTransaction3.mmStartDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date of the first payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Instalment obj) {
			return obj.getFirstPaymentDate();
		}

		@Override
		public void setValue(Instalment obj, ISODateTime value) {
			obj.setFirstPaymentDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instalment";
				definition = "Specifies the details of each successive payment in settlement of a debt or in an investment plan.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.mmInstalment);
				derivationElement_lazy = () -> Arrays.asList(CardPaymentTransactionDetails4.mmRecurringTransaction, CardPaymentTransactionDetails1.mmRecurringTransaction, CardPaymentTransactionDetails10.mmRecurringTransaction,
						CardPaymentTransactionDetails3.mmRecurringTransaction, InvoiceRequestInformation1.mmInstalmentInformation, InvoiceFinancingDetails1.mmInstalmentFinancingInformation, CardPaymentTransactionDetails12.mmInstalment,
						CardPaymentTransactionDetails16.mmInstalment, CardPaymentTransactionDetails14.mmInstalment, CardPaymentTransactionDetails15.mmInstalment, CardPaymentTransactionDetails23.mmInstalment,
						CardPaymentTransactionDetails21.mmInstalment, CardPaymentTransactionDetails19.mmInstalment, CardPaymentTransactionDetails24.mmInstalment, FinancingItemList1.mmFinancingInstalment,
						FinancialItem1.mmInstalmentInformation, CardTransactionDetail1.mmInstalment, CardTransactionDetail3.mmInstalment, CardPaymentTransactionDetails29.mmInstalment, CardPaymentTransactionDetails30.mmInstalment,
						CardPaymentTransactionDetails27.mmInstalment, CardPaymentTransactionDetails31.mmInstalment, CardPaymentTransactionDetails39.mmInstalment, CardPaymentTransactionDetails38.mmInstalment,
						CardPaymentTransactionDetails41.mmInstalment, CardPaymentTransactionDetails37.mmInstalment, CardPaymentTransactionDetails44.mmInstalment, CardPaymentTransactionDetails45.mmInstalment);
				superType_lazy = () -> PaymentObligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Instalment.mmInitialNumberOfInstalment, com.tools20022.repository.entity.Instalment.mmTotalNumberOfInstalment,
						com.tools20022.repository.entity.Instalment.mmPeriodUnit, com.tools20022.repository.entity.Instalment.mmNumberOfUnits, com.tools20022.repository.entity.Instalment.mmSequenceIdentification,
						com.tools20022.repository.entity.Instalment.mmInvestmentPlan, com.tools20022.repository.entity.Instalment.mmInstalmentPlanType, com.tools20022.repository.entity.Instalment.mmFirstPaymentAmount,
						com.tools20022.repository.entity.Instalment.mmFirstPaymentDate);
				derivationComponent_lazy = () -> Arrays.asList(RecurringTransaction1.mmObject(), Instalment1.mmObject(), RecurringTransaction2.mmObject(), Instalment2.mmObject(), InitialAmount1Choice.mmObject(),
						RecurringTransaction3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Instalment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Number getInitialNumberOfInstalment() {
		return initialNumberOfInstalment;
	}

	public Instalment setInitialNumberOfInstalment(Number initialNumberOfInstalment) {
		this.initialNumberOfInstalment = Objects.requireNonNull(initialNumberOfInstalment);
		return this;
	}

	public Number getTotalNumberOfInstalment() {
		return totalNumberOfInstalment;
	}

	public Instalment setTotalNumberOfInstalment(Number totalNumberOfInstalment) {
		this.totalNumberOfInstalment = Objects.requireNonNull(totalNumberOfInstalment);
		return this;
	}

	public FrequencyCode getPeriodUnit() {
		return periodUnit;
	}

	public Instalment setPeriodUnit(FrequencyCode periodUnit) {
		this.periodUnit = Objects.requireNonNull(periodUnit);
		return this;
	}

	public Number getNumberOfUnits() {
		return numberOfUnits;
	}

	public Instalment setNumberOfUnits(Number numberOfUnits) {
		this.numberOfUnits = Objects.requireNonNull(numberOfUnits);
		return this;
	}

	public Max70Text getSequenceIdentification() {
		return sequenceIdentification;
	}

	public Instalment setSequenceIdentification(Max70Text sequenceIdentification) {
		this.sequenceIdentification = Objects.requireNonNull(sequenceIdentification);
		return this;
	}

	public Optional<InvestmentPlan> getInvestmentPlan() {
		return investmentPlan == null ? Optional.empty() : Optional.of(investmentPlan);
	}

	public Instalment setInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan investmentPlan) {
		this.investmentPlan = investmentPlan;
		return this;
	}

	public InstalmentPlanCode getInstalmentPlanType() {
		return instalmentPlanType;
	}

	public Instalment setInstalmentPlanType(InstalmentPlanCode instalmentPlanType) {
		this.instalmentPlanType = Objects.requireNonNull(instalmentPlanType);
		return this;
	}

	public CurrencyAndAmount getFirstPaymentAmount() {
		return firstPaymentAmount;
	}

	public Instalment setFirstPaymentAmount(CurrencyAndAmount firstPaymentAmount) {
		this.firstPaymentAmount = Objects.requireNonNull(firstPaymentAmount);
		return this;
	}

	public ISODateTime getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public Instalment setFirstPaymentDate(ISODateTime firstPaymentDate) {
		this.firstPaymentDate = Objects.requireNonNull(firstPaymentDate);
		return this;
	}
}