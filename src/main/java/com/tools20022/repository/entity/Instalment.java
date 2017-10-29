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
import com.tools20022.repository.choice.InitialAmount1Choice;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.InstalmentPlanCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#InitialNumberOfInstalment
 * Instalment.InitialNumberOfInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#TotalNumberOfInstalment
 * Instalment.TotalNumberOfInstalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#PeriodUnit
 * Instalment.PeriodUnit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#NumberOfUnits
 * Instalment.NumberOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#SequenceIdentification
 * Instalment.SequenceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#InvestmentPlan
 * Instalment.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#InstalmentPlanType
 * Instalment.InstalmentPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Instalment#FirstPaymentAmount
 * Instalment.FirstPaymentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment#FirstPaymentDate
 * Instalment.FirstPaymentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Instalment
 * InvestmentPlan.Instalment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#RecurringTransaction
 * CardPaymentTransactionDetails4.RecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#RecurringTransaction
 * CardPaymentTransactionDetails1.RecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#RecurringTransaction
 * CardPaymentTransactionDetails10.RecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#RecurringTransaction
 * CardPaymentTransactionDetails3.RecurringTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#InstalmentInformation
 * InvoiceRequestInformation1.InstalmentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#InstalmentFinancingInformation
 * InvoiceFinancingDetails1.InstalmentFinancingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#Instalment
 * CardPaymentTransactionDetails12.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#Instalment
 * CardPaymentTransactionDetails16.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#Instalment
 * CardPaymentTransactionDetails14.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#Instalment
 * CardPaymentTransactionDetails15.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#Instalment
 * CardPaymentTransactionDetails23.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#Instalment
 * CardPaymentTransactionDetails21.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#Instalment
 * CardPaymentTransactionDetails19.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#Instalment
 * CardPaymentTransactionDetails24.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#FinancingInstalment
 * FinancingItemList1.FinancingInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#InstalmentInformation
 * FinancialItem1.InstalmentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#Instalment
 * CardTransactionDetail1.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#Instalment
 * CardTransactionDetail3.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#Instalment
 * CardPaymentTransactionDetails29.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#Instalment
 * CardPaymentTransactionDetails30.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#Instalment
 * CardPaymentTransactionDetails27.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#Instalment
 * CardPaymentTransactionDetails31.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#Instalment
 * CardPaymentTransactionDetails39.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#Instalment
 * CardPaymentTransactionDetails38.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#Instalment
 * CardPaymentTransactionDetails41.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#Instalment
 * CardPaymentTransactionDetails37.Instalment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Instalment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of each successive payment in settlement of a debt or in an investment plan."
 * </li>
 * </ul>
 */
public class Instalment extends PaymentObligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of pre-paid instalment periods at the time an investment plan is
	 * created.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#InitialNumberOfInstalment
	 * InvestmentPlan2.InitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#InitialNumberOfInstalment
	 * InvestmentPlan4.InitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#InitialNumberOfInstalment
	 * InvestmentPlan6.InitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#InitialNumberOfInstalment
	 * InvestmentPlan5.InitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#InitialNumberOfInstalment
	 * InvestmentPlan3.InitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#InitialNumberOfInstalment
	 * InvestmentPlan7.InitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#InitialNumberOfInstalments
	 * InvestmentPlan9.InitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#InitialNumberOfInstalments
	 * InvestmentPlan8.InitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#InitialNumberOfInstalments
	 * InvestmentPlan10.InitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#InitialNumberOfInstalments
	 * InvestmentPlan11.InitialNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InitialAmount1Choice#InitialNumberOfInstalments
	 * InitialAmount1Choice.InitialNumberOfInstalments}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialNumberOfInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of pre-paid instalment periods at the time an investment plan is created."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InitialNumberOfInstalment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan2.InitialNumberOfInstalment, com.tools20022.repository.msg.InvestmentPlan4.InitialNumberOfInstalment,
					com.tools20022.repository.msg.InvestmentPlan6.InitialNumberOfInstalment, com.tools20022.repository.msg.InvestmentPlan5.InitialNumberOfInstalment, com.tools20022.repository.msg.InvestmentPlan3.InitialNumberOfInstalment,
					com.tools20022.repository.msg.InvestmentPlan7.InitialNumberOfInstalment, com.tools20022.repository.msg.InvestmentPlan9.InitialNumberOfInstalments,
					com.tools20022.repository.msg.InvestmentPlan8.InitialNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan10.InitialNumberOfInstalments,
					com.tools20022.repository.msg.InvestmentPlan11.InitialNumberOfInstalments, com.tools20022.repository.choice.InitialAmount1Choice.InitialNumberOfInstalments);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialNumberOfInstalment";
			definition = "Number of pre-paid instalment periods at the time an investment plan is created.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Total number of times the amount must be invested at the predefined
	 * frequency as of the start date of the investment plan.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#TotalNumberOfInstalment
	 * InvestmentPlan2.TotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#TotalNumberOfInstalment
	 * InvestmentPlan4.TotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#TotalNumberOfInstalment
	 * InvestmentPlan6.TotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#TotalNumberOfInstalment
	 * InvestmentPlan5.TotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#TotalNumberOfInstalment
	 * InvestmentPlan3.TotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#TotalNumberOfInstalment
	 * InvestmentPlan7.TotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#TotalNumberOfPayments
	 * RecurringTransaction1.TotalNumberOfPayments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#TotalNumberOfInstalments
	 * InvestmentPlan9.TotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#TotalNumberOfInstalments
	 * InvestmentPlan8.TotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#TotalNumberOfPayments
	 * RecurringTransaction2.TotalNumberOfPayments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#TotalNumberOfInstalments
	 * InvestmentPlan10.TotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#TotalNumberOfInstalments
	 * InvestmentPlan11.TotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#TotalNumberOfInstalments
	 * InvestmentPlan12.TotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#TotalNumberOfInstalments
	 * InvestmentPlan13.TotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#NumberOfOccurrences
	 * RecurringTransaction3.NumberOfOccurrences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#TotalNumberOfInstalments
	 * InvestmentPlan14.TotalNumberOfInstalments}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#TotalNumberOfInstalments
	 * InvestmentPlan15.TotalNumberOfInstalments}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalNumberOfInstalment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan2.TotalNumberOfInstalment, com.tools20022.repository.msg.InvestmentPlan4.TotalNumberOfInstalment,
					com.tools20022.repository.msg.InvestmentPlan6.TotalNumberOfInstalment, com.tools20022.repository.msg.InvestmentPlan5.TotalNumberOfInstalment, com.tools20022.repository.msg.InvestmentPlan3.TotalNumberOfInstalment,
					com.tools20022.repository.msg.InvestmentPlan7.TotalNumberOfInstalment, com.tools20022.repository.msg.RecurringTransaction1.TotalNumberOfPayments, com.tools20022.repository.msg.InvestmentPlan9.TotalNumberOfInstalments,
					com.tools20022.repository.msg.InvestmentPlan8.TotalNumberOfInstalments, com.tools20022.repository.msg.RecurringTransaction2.TotalNumberOfPayments, com.tools20022.repository.msg.InvestmentPlan10.TotalNumberOfInstalments,
					com.tools20022.repository.msg.InvestmentPlan11.TotalNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan12.TotalNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan13.TotalNumberOfInstalments,
					com.tools20022.repository.msg.RecurringTransaction3.NumberOfOccurrences, com.tools20022.repository.msg.InvestmentPlan14.TotalNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan15.TotalNumberOfInstalments);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfInstalment";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Period unit between consecutive payments (for example day, month, year).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#PeriodUnit
	 * RecurringTransaction1.PeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#PeriodUnit
	 * RecurringTransaction2.PeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#PeriodUnit
	 * RecurringTransaction3.PeriodUnit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period unit between consecutive payments (for example day, month, year)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PeriodUnit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction1.PeriodUnit, com.tools20022.repository.msg.RecurringTransaction2.PeriodUnit,
					com.tools20022.repository.msg.RecurringTransaction3.PeriodUnit);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodUnit";
			definition = "Period unit between consecutive payments (for example day, month, year).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Number of period units between consecutive payments.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#InstalmentPeriod
	 * RecurringTransaction1.InstalmentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#InstalmentPeriod
	 * RecurringTransaction2.InstalmentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#IntervalDay
	 * RecurringTransaction3.IntervalDay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of period units between consecutive payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NumberOfUnits = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction1.InstalmentPeriod, com.tools20022.repository.msg.RecurringTransaction2.InstalmentPeriod,
					com.tools20022.repository.msg.RecurringTransaction3.IntervalDay);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfUnits";
			definition = "Number of period units between consecutive payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the progressive number of a single instalment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Instalment1#SequenceIdentification
	 * Instalment1.SequenceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment2#SequenceIdentification
	 * Instalment2.SequenceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the progressive number of a single instalment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SequenceIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Instalment1.SequenceIdentification, com.tools20022.repository.msg.Instalment2.SequenceIdentification);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceIdentification";
			definition = "Specifies the progressive number of a single instalment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Investment plan for which instalment information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#Instalment
	 * InvestmentPlan.Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment plan for which instalment information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan for which instalment information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Instalment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of instalment plan.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#InstalmentPlan
	 * RecurringTransaction2.InstalmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instalment plan."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstalmentPlanType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction2.InstalmentPlan);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstalmentPlanType";
			definition = "Type of instalment plan.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstalmentPlanCode.mmObject();
		}
	};
	/**
	 * Amount of the first payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#FirstAmount
	 * RecurringTransaction2.FirstAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the first payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstPaymentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction2.FirstAmount);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentAmount";
			definition = "Amount of the first payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date of the first payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#FirstPaymentDate
	 * RecurringTransaction2.FirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#StartDate
	 * RecurringTransaction3.StartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the first payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction2.FirstPaymentDate, com.tools20022.repository.msg.RecurringTransaction3.StartDate);
			elementContext_lazy = () -> Instalment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date of the first payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Instalment";
				definition = "Specifies the details of each successive payment in settlement of a debt or in an investment plan.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.Instalment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails4.RecurringTransaction, com.tools20022.repository.msg.CardPaymentTransactionDetails1.RecurringTransaction,
						com.tools20022.repository.msg.CardPaymentTransactionDetails10.RecurringTransaction, com.tools20022.repository.msg.CardPaymentTransactionDetails3.RecurringTransaction,
						com.tools20022.repository.msg.InvoiceRequestInformation1.InstalmentInformation, com.tools20022.repository.msg.InvoiceFinancingDetails1.InstalmentFinancingInformation,
						com.tools20022.repository.msg.CardPaymentTransactionDetails12.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails16.Instalment,
						com.tools20022.repository.msg.CardPaymentTransactionDetails14.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails15.Instalment,
						com.tools20022.repository.msg.CardPaymentTransactionDetails23.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails21.Instalment,
						com.tools20022.repository.msg.CardPaymentTransactionDetails19.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails24.Instalment,
						com.tools20022.repository.msg.FinancingItemList1.FinancingInstalment, com.tools20022.repository.msg.FinancialItem1.InstalmentInformation, com.tools20022.repository.msg.CardTransactionDetail1.Instalment,
						com.tools20022.repository.msg.CardTransactionDetail3.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails29.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails30.Instalment,
						com.tools20022.repository.msg.CardPaymentTransactionDetails27.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails31.Instalment,
						com.tools20022.repository.msg.CardPaymentTransactionDetails39.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails38.Instalment,
						com.tools20022.repository.msg.CardPaymentTransactionDetails41.Instalment, com.tools20022.repository.msg.CardPaymentTransactionDetails37.Instalment);
				superType_lazy = () -> PaymentObligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Instalment.InitialNumberOfInstalment, com.tools20022.repository.entity.Instalment.TotalNumberOfInstalment,
						com.tools20022.repository.entity.Instalment.PeriodUnit, com.tools20022.repository.entity.Instalment.NumberOfUnits, com.tools20022.repository.entity.Instalment.SequenceIdentification,
						com.tools20022.repository.entity.Instalment.InvestmentPlan, com.tools20022.repository.entity.Instalment.InstalmentPlanType, com.tools20022.repository.entity.Instalment.FirstPaymentAmount,
						com.tools20022.repository.entity.Instalment.FirstPaymentDate);
				derivationComponent_lazy = () -> Arrays.asList(RecurringTransaction1.mmObject(), Instalment1.mmObject(), RecurringTransaction2.mmObject(), Instalment2.mmObject(), InitialAmount1Choice.mmObject(),
						RecurringTransaction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}