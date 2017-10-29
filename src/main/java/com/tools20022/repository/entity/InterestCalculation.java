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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of parameters used to calculate an interest amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InterestCalculation" src="doc-files/InterestCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DayCountBasis
 * InterestCalculation.DayCountBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Rate
 * InterestCalculation.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Interest
 * InterestCalculation.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RateType
 * InterestCalculation.RateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestPeriod
 * InterestCalculation.InterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RelatedIndex
 * InterestCalculation.RelatedIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestAccrualDate
 * InterestCalculation.InterestAccrualDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#CalculationMethod
 * InterestCalculation.CalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#VariableInterest
 * InterestCalculation.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestType
 * InterestCalculation.InterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RateValidityRange
 * InterestCalculation.RateValidityRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#InterestMethod
 * InterestCalculation.InterestMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#CalculationFrequency
 * InterestCalculation.CalculationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#CalculationDate
 * InterestCalculation.CalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Charges
 * InterestCalculation.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DebtInstrument
 * InterestCalculation.DebtInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Spread
 * InterestCalculation.Spread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#PaymentFrequency
 * InterestCalculation.PaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RelatedInterestManagement
 * InterestCalculation.RelatedInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInterestCalculation
 * DateTimePeriod.RelatedInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#RelatedInterest
 * AmountRange.RelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#RelatedInterest
 * Charges.RelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
 * Interest.InterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#NextInterest
 * Debt.NextInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#InterestCalculation
 * VariableInterest.InterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#RelatedInterest
 * Spread.RelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#InterestCalculation
 * InterestManagement.InterestCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest1#Rate
 * TransactionInterest1.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest2#Rate
 * TransactionInterest2.Rate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat1Choice
 * InterestComputationMethodFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat2Choice
 * InterestComputationMethodFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType6Choice
 * RateType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType9Choice
 * RateType9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType3Choice
 * RateType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType5Choice
 * RateType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType8Choice
 * RateType8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod1Choice
 * InterestComputationMethod1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice
 * InterestComputationMethodFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType19Choice
 * RateType19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice
 * InterestComputationMethod2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestType1Choice
 * InterestType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateTypeChoice
 * RateTypeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Rate1 Rate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest1
 * AccountInterest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest1
 * TransactionInterest1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType4Choice
 * RateType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Rate3 Rate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest2
 * AccountInterest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest2
 * TransactionInterest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3
 * AccountInterest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest3
 * TransactionInterest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation1
 * InterestCalculation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation2
 * InterestCalculation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation3
 * InterestCalculation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType35Choice
 * RateType35Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice
 * InterestComputationMethodFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType33Choice
 * RateType33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation4
 * InterestCalculation4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType45Choice
 * RateType45Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat5Choice
 * InterestComputationMethodFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType67Choice
 * RateType67Choice}</li>
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
 * "InterestCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of parameters used to calculate an interest amount."</li>
 * </ul>
 */
public class InterestCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the computation method of accrued interest of the related
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat1Choice#Code
	 * InterestComputationMethodFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat1Choice#Proprietary
	 * InterestComputationMethodFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#DayCountBasis
	 * FinancialInstrumentAttributes8.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#DayCountBasis
	 * FinancialInstrumentAttributes20.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#DayCountBasis
	 * FinancialInstrumentAttributes35.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat2Choice#Code
	 * InterestComputationMethodFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat2Choice#Proprietary
	 * InterestComputationMethodFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#DayCountBasis
	 * FinancialInstrumentAttributes41.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#DayCountBasis
	 * FinancialInstrumentAttributes6.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#DayCountBasis
	 * FinancialInstrumentAttributes9.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#DayCountBasis
	 * FinancialInstrumentAttributes18.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#DayCountBasis
	 * FinancialInstrumentAttributes22.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#DayCountBasis
	 * FinancialInstrumentAttributes32.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#DayCountBasis
	 * FinancialInstrumentAttributes38.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#DayCountBasis
	 * FinancialInstrumentAttributes7.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#DayCountBasis
	 * FinancialInstrumentAttributes5.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#DayCountBasis
	 * FinancialInstrumentAttributes11.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#DayCountBasis
	 * FinancialInstrumentAttributes10.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#DayCountBasis
	 * FinancialInstrumentAttributes19.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#DayCountBasis
	 * FinancialInstrumentAttributes16.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#DayCountBasis
	 * FinancialInstrumentAttributes23.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#DayCountBasis
	 * FinancialInstrumentAttributes24.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#DayCountBasis
	 * FinancialInstrumentAttributes33.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#DayCountBasis
	 * FinancialInstrumentAttributes34.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#DayCountBasis
	 * FinancialInstrumentAttributes39.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#DayCountBasis
	 * FinancialInstrumentAttributes40.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#DayCountBasis
	 * FinancialInstrumentAttributes43.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#DayCountBasis
	 * FinancialInstrumentAttributes45.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#DayCountBasis
	 * FinancialInstrumentAttributes4.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#DayCountBasis
	 * FinancialInstrumentAttributes13.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#DayCountBasis
	 * FinancialInstrumentAttributes21.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#DayCountBasis
	 * FinancialInstrumentAttributes26.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#DayCountBasis
	 * FinancialInstrumentAttributes36.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#DayCountBasis
	 * FinancialInstrumentAttributes42.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#DayCountBasis
	 * FinancialInstrumentAttributes27.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#DayCountBasis
	 * FinancialInstrumentAttributes14.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#DayCountBasis
	 * FinancialInstrumentAttributes30.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails3.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails5.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#DayCountBasis
	 * FinancialInstrumentAttributes28.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails1.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails11.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails14.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails4.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod1Choice#Code
	 * InterestComputationMethod1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod1Choice#Proprietary
	 * InterestComputationMethod1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#DayCountBasis
	 * Debt1.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice#Code
	 * InterestComputationMethodFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice#Proprietary
	 * InterestComputationMethodFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#DayCountBasis
	 * FinancialInstrumentAttributes31.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice#Code
	 * InterestComputationMethod2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice#Proprietary
	 * InterestComputationMethod2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#InterestComputationMethod
	 * SecuritiesFinancing10.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#DayCountBasis
	 * FinancialInstrumentAttributes44.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#DayCountBasis
	 * FinancialInstrumentAttributes15.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#DayCountBasis
	 * InterestAmount1.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#DayCountBasis
	 * InterestAmount2.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#DayCountBasis
	 * CollateralValuation1.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails19.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails20.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#DayCountBasis
	 * FinancialInstrumentAttributes29.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#InterestComputationMethod
	 * SecuritiesFinancing1.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#DayCountBasis
	 * FinancialInstrumentAttributes2.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#DayCountBasis
	 * FinancialInstrumentAttributes48.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#DayCountBasis
	 * FinancialInstrumentAttributes50.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#DayCountBasis
	 * FinancialInstrumentAttributes49.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#DayCountBasis
	 * FinancialInstrumentAttributes55.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#DayCountBasis
	 * FinancialInstrumentAttributes57.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#DayCountBasis
	 * FinancialInstrumentAttributes56.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#DayCountBasis
	 * CollateralValuation2.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#DayCountBasis
	 * FinancialInstrumentAttributes63.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#DayCountBasis
	 * FinancialInstrumentAttributes64.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails28.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails27.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice#Code
	 * InterestComputationMethodFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice#Proprietary
	 * InterestComputationMethodFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#DayCountBasis
	 * FinancialInstrumentAttributes66.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#DayCountBasis
	 * FinancialInstrumentAttributes65.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#DayCountBasis
	 * FinancialInstrumentAttributes67.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#DayCountBasis
	 * CollateralValuation5.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#DayCountBasis
	 * FinancialInstrumentAttributes70.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#DayCountBasis
	 * FinancialInstrumentAttributes69.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#DayCountBasis
	 * FinancialInstrumentAttributes71.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat5Choice#Code
	 * InterestComputationMethodFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat5Choice#Proprietary
	 * InterestComputationMethodFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails32.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#InterestComputationMethod
	 * SecuritiesFinancingTransactionDetails30.InterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#DayCountBasis
	 * FinancialInstrumentAttributes75.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#DayCountBasis
	 * FinancialInstrumentAttributes78.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#DayCountBasis
	 * FinancialInstrumentAttributes79.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#DayCountBasis
	 * FinancialInstrumentAttributes81.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#DayCountBasis
	 * FinancialInstrumentAttributes80.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#DayCountBasis
	 * FinancialInstrumentAttributes85.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#DayCountBasis
	 * FinancialInstrumentAttributes84.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#DayCountBasis
	 * FinancialInstrumentAttributes83.DayCountBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the computation method of accrued interest of the related financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DayCountBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestComputationMethodFormat1Choice.Code, com.tools20022.repository.choice.InterestComputationMethodFormat1Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes20.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.DayCountBasis, com.tools20022.repository.choice.InterestComputationMethodFormat2Choice.Code,
					com.tools20022.repository.choice.InterestComputationMethodFormat2Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes41.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes9.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes22.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes38.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes5.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes10.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes16.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes24.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes34.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes40.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes45.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes13.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes26.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes42.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes14.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.DayCountBasis, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.InterestComputationMethod,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.InterestComputationMethod, com.tools20022.repository.msg.FinancialInstrumentAttributes28.DayCountBasis,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.InterestComputationMethod, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.InterestComputationMethod,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.InterestComputationMethod, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.InterestComputationMethod,
					com.tools20022.repository.choice.InterestComputationMethod1Choice.Code, com.tools20022.repository.choice.InterestComputationMethod1Choice.Proprietary, com.tools20022.repository.msg.Debt1.DayCountBasis,
					com.tools20022.repository.choice.InterestComputationMethodFormat3Choice.Code, com.tools20022.repository.choice.InterestComputationMethodFormat3Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.DayCountBasis, com.tools20022.repository.choice.InterestComputationMethod2Choice.Code,
					com.tools20022.repository.choice.InterestComputationMethod2Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancing10.InterestComputationMethod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes15.DayCountBasis, com.tools20022.repository.msg.InterestAmount1.DayCountBasis,
					com.tools20022.repository.msg.InterestAmount2.DayCountBasis, com.tools20022.repository.msg.CollateralValuation1.DayCountBasis,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.InterestComputationMethod, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.InterestComputationMethod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.DayCountBasis, com.tools20022.repository.msg.SecuritiesFinancing1.InterestComputationMethod,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes48.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes49.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes57.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.DayCountBasis, com.tools20022.repository.msg.CollateralValuation2.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes63.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.DayCountBasis, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.InterestComputationMethod,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.InterestComputationMethod, com.tools20022.repository.choice.InterestComputationMethodFormat4Choice.Code,
					com.tools20022.repository.choice.InterestComputationMethodFormat4Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes66.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes67.DayCountBasis, com.tools20022.repository.msg.CollateralValuation5.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes69.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.DayCountBasis, com.tools20022.repository.choice.InterestComputationMethodFormat5Choice.Code,
					com.tools20022.repository.choice.InterestComputationMethodFormat5Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.InterestComputationMethod,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.InterestComputationMethod, com.tools20022.repository.msg.FinancialInstrumentAttributes75.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes79.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes80.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes84.DayCountBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.DayCountBasis);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayCountBasis";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}
	};
	/**
	 * Percentage charged for the use of an amount of money, usually expressed
	 * at an annual rate. The interest rate is the ratio of the amount of
	 * interest paid during a certain period of time compared to the principal
	 * amount of the interest bearing financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#InterestRate
	 * FinancialInstrumentAttributes8.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#NextInterestRate
	 * FinancialInstrumentAttributes8.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#InterestRate
	 * FinancialInstrumentAttributes20.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#NextInterestRate
	 * FinancialInstrumentAttributes20.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#InterestRate
	 * FinancialInstrumentAttributes35.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#NextInterestRate
	 * FinancialInstrumentAttributes35.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#InterestRate
	 * FinancialInstrumentAttributes41.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#NextInterestRate
	 * FinancialInstrumentAttributes41.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#InterestRate
	 * FinancialInstrumentAttributes6.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#NextInterestRate
	 * FinancialInstrumentAttributes6.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#InterestRate
	 * FinancialInstrumentAttributes9.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#NextInterestRate
	 * FinancialInstrumentAttributes9.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#InterestRate
	 * FinancialInstrumentAttributes18.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#NextInterestRate
	 * FinancialInstrumentAttributes18.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#InterestRate
	 * FinancialInstrumentAttributes22.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#NextInterestRate
	 * FinancialInstrumentAttributes22.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#InterestRate
	 * FinancialInstrumentAttributes32.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#NextInterestRate
	 * FinancialInstrumentAttributes32.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#InterestRate
	 * FinancialInstrumentAttributes38.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#NextInterestRate
	 * FinancialInstrumentAttributes38.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#InterestRate
	 * FinancialInstrumentAttributes7.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#NextInterestRate
	 * FinancialInstrumentAttributes7.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#InterestRate
	 * FinancialInstrumentAttributes5.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#NextInterestRate
	 * FinancialInstrumentAttributes5.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#InterestRate
	 * FinancialInstrumentAttributes11.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#NextInterestRate
	 * FinancialInstrumentAttributes11.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#InterestRate
	 * FinancialInstrumentAttributes10.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#NextInterestRate
	 * FinancialInstrumentAttributes10.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#InterestRate
	 * FinancialInstrumentAttributes19.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#NextInterestRate
	 * FinancialInstrumentAttributes19.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#InterestRate
	 * FinancialInstrumentAttributes16.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#NextInterestRate
	 * FinancialInstrumentAttributes16.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#InterestRate
	 * FinancialInstrumentAttributes23.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#NextInterestRate
	 * FinancialInstrumentAttributes23.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#InterestRate
	 * FinancialInstrumentAttributes24.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#NextInterestRate
	 * FinancialInstrumentAttributes24.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#InterestRate
	 * FinancialInstrumentAttributes33.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#NextInterestRate
	 * FinancialInstrumentAttributes33.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#InterestRate
	 * FinancialInstrumentAttributes34.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#NextInterestRate
	 * FinancialInstrumentAttributes34.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#InterestRate
	 * FinancialInstrumentAttributes39.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#NextInterestRate
	 * FinancialInstrumentAttributes39.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#InterestRate
	 * FinancialInstrumentAttributes40.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#NextInterestRate
	 * FinancialInstrumentAttributes40.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#InterestRate
	 * FinancialInstrumentAttributes43.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#NextInterestRate
	 * FinancialInstrumentAttributes43.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#InterestRate
	 * FinancialInstrumentAttributes45.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#NextInterestRate
	 * FinancialInstrumentAttributes45.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#InterestRate
	 * FinancialInstrumentAttributes4.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#NextInterestRate
	 * FinancialInstrumentAttributes4.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#InterestRate
	 * FinancialInstrumentAttributes13.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#NextInterestRate
	 * FinancialInstrumentAttributes13.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#InterestRate
	 * FinancialInstrumentAttributes21.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#NextInterestRate
	 * FinancialInstrumentAttributes21.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#InterestRate
	 * FinancialInstrumentAttributes26.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#NextInterestRate
	 * FinancialInstrumentAttributes26.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#InterestRate
	 * FinancialInstrumentAttributes36.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#NextInterestRate
	 * FinancialInstrumentAttributes36.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#InterestRate
	 * FinancialInstrumentAttributes42.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#NextInterestRate
	 * FinancialInstrumentAttributes42.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#InterestRate
	 * FinancialInstrumentAttributes27.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#NextInterestRate
	 * FinancialInstrumentAttributes27.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#InterestRate
	 * FinancialInstrumentAttributes14.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#NextInterestRate
	 * FinancialInstrumentAttributes14.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#InterestRate
	 * FinancialInstrumentAttributes30.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#NextInterestRate
	 * FinancialInstrumentAttributes30.NextInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate2#Rate Rate2.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#InterestRate
	 * FinancialInstrumentAttributes28.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#NextInterestRate
	 * FinancialInstrumentAttributes28.NextInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#InterestRate
	 * Debt1.InterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#NextInterestRate
	 * Debt1.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#InterestRate
	 * FinancialInstrumentAttributes31.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#NextInterestRate
	 * FinancialInstrumentAttributes31.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#BorrowingRate
	 * SecuritiesFinancing10.BorrowingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateTypeChoice#PercentageRate
	 * RateTypeChoice.PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate1#Rate Rate1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest1#Rate
	 * AccountInterest1.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType4Choice#Percentage
	 * RateType4Choice.Percentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest2#Rate
	 * AccountInterest2.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#Rate
	 * AccountInterest3.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#InterestRate
	 * FinancialInstrumentAttributes44.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#NextInterestRate
	 * FinancialInstrumentAttributes44.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#InterestRate
	 * FinancialInstrumentAttributes15.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#NextInterestRate
	 * FinancialInstrumentAttributes15.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#InterestRate
	 * InterestCalculation1.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#InterestRate
	 * InterestCalculation2.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#InterestRate
	 * FinancialInstrumentAttributes29.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#NextInterestRate
	 * FinancialInstrumentAttributes29.NextInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#InterestRate
	 * Debt2.InterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#NextInterestRate
	 * Debt2.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#InterestRate
	 * FinancialInstrumentAttributes2.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#NextInterestRate
	 * FinancialInstrumentAttributes2.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#InterestRate
	 * FinancialInstrumentAttributes48.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#NextInterestRate
	 * FinancialInstrumentAttributes48.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#InterestRate
	 * FinancialInstrumentAttributes50.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#NextInterestRate
	 * FinancialInstrumentAttributes50.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#InterestRate
	 * FinancialInstrumentAttributes49.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#NextInterestRate
	 * FinancialInstrumentAttributes49.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#InterestRate
	 * FinancialInstrumentAttributes55.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#NextInterestRate
	 * FinancialInstrumentAttributes55.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#InterestRate
	 * FinancialInstrumentAttributes57.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#NextInterestRate
	 * FinancialInstrumentAttributes57.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#InterestRate
	 * FinancialInstrumentAttributes56.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#NextInterestRate
	 * FinancialInstrumentAttributes56.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#InterestRate
	 * InterestCalculation3.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#InterestRate
	 * FinancialInstrumentAttributes63.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#NextInterestRate
	 * FinancialInstrumentAttributes63.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#InterestRate
	 * FinancialInstrumentAttributes64.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#NextInterestRate
	 * FinancialInstrumentAttributes64.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#InterestRate
	 * FinancialInstrumentAttributes66.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#NextInterestRate
	 * FinancialInstrumentAttributes66.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#InterestRate
	 * FinancialInstrumentAttributes65.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextInterestRate
	 * FinancialInstrumentAttributes65.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#InterestRate
	 * FinancialInstrumentAttributes67.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#NextInterestRate
	 * FinancialInstrumentAttributes67.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#InterestRate
	 * InterestCalculation4.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#InterestRate
	 * FinancialInstrumentAttributes70.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#NextInterestRate
	 * FinancialInstrumentAttributes70.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#InterestRate
	 * FinancialInstrumentAttributes69.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#NextInterestRate
	 * FinancialInstrumentAttributes69.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#InterestRate
	 * FinancialInstrumentAttributes71.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#NextInterestRate
	 * FinancialInstrumentAttributes71.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#InterestRate
	 * FinancialInstrumentAttributes75.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#NextInterestRate
	 * FinancialInstrumentAttributes75.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#InterestRate
	 * FinancialInstrumentAttributes78.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#NextInterestRate
	 * FinancialInstrumentAttributes78.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#InterestRate
	 * FinancialInstrumentAttributes79.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#NextInterestRate
	 * FinancialInstrumentAttributes79.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#InterestRate
	 * FinancialInstrumentAttributes81.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextInterestRate
	 * FinancialInstrumentAttributes81.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#InterestRate
	 * FinancialInstrumentAttributes80.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#NextInterestRate
	 * FinancialInstrumentAttributes80.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#InterestRate
	 * FinancialInstrumentAttributes85.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#NextInterestRate
	 * FinancialInstrumentAttributes85.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#InterestRate
	 * FinancialInstrumentAttributes84.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#NextInterestRate
	 * FinancialInstrumentAttributes84.NextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#InterestRate
	 * FinancialInstrumentAttributes83.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#NextInterestRate
	 * FinancialInstrumentAttributes83.NextInterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes8.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes20.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes35.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes41.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes6.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes9.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes18.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes22.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes32.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes38.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes7.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes5.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes5.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes11.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes10.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes19.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes16.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes23.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes24.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes33.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes34.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes39.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes40.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes43.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes45.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes4.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes21.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes27.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes30.NextInterestRate, com.tools20022.repository.msg.Rate2.Rate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.NextInterestRate, com.tools20022.repository.msg.Debt1.InterestRate,
					com.tools20022.repository.msg.Debt1.NextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes31.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes31.NextInterestRate,
					com.tools20022.repository.msg.SecuritiesFinancing10.BorrowingRate, com.tools20022.repository.choice.RateTypeChoice.PercentageRate, com.tools20022.repository.msg.Rate1.Rate,
					com.tools20022.repository.msg.AccountInterest1.Rate, com.tools20022.repository.choice.RateType4Choice.Percentage, com.tools20022.repository.msg.AccountInterest2.Rate, com.tools20022.repository.msg.AccountInterest3.Rate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes15.NextInterestRate,
					com.tools20022.repository.msg.InterestCalculation1.InterestRate, com.tools20022.repository.msg.InterestCalculation2.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes29.InterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.NextInterestRate, com.tools20022.repository.msg.Debt2.InterestRate, com.tools20022.repository.msg.Debt2.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes2.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes48.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes50.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes49.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes55.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes57.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes56.NextInterestRate,
					com.tools20022.repository.msg.InterestCalculation3.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes63.InterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.NextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes64.InterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.NextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.InterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.NextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes65.InterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes67.InterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.NextInterestRate, com.tools20022.repository.msg.InterestCalculation4.InterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes70.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes69.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes71.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes78.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes79.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes80.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes85.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes84.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.NextInterestRate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes83.NextInterestRate);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Interest resulting from the interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestCalculation
	 * Interest.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate3#Type Rate3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest3#Record
	 * TransactionInterest3.Record}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest resulting from the interest calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Rate3.Type, com.tools20022.repository.msg.TransactionInterest3.Record);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest resulting from the interest calculation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of rate used to calculate the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType6Choice#Code
	 * RateType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType6Choice#Proprietary
	 * RateType6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType9Choice#Code
	 * RateType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType9Choice#Proprietary
	 * RateType9Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType3Choice#Code
	 * RateType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType3Choice#Proprietary
	 * RateType3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType5Choice#Code
	 * RateType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType5Choice#Proprietary
	 * RateType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#RateType
	 * SecuritiesFinancingTransactionDetails3.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType8Choice#Code
	 * RateType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType8Choice#Proprietary
	 * RateType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#RateType
	 * SecuritiesFinancingTransactionDetails5.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#RateType
	 * SecuritiesFinancingTransactionDetails1.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#RateType
	 * SecuritiesFinancingTransactionDetails11.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#RateType
	 * SecuritiesFinancingTransactionDetails14.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#RateType
	 * SecuritiesFinancingTransactionDetails4.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType19Choice#Code
	 * RateType19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType19Choice#Proprietary
	 * RateType19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#RateType
	 * SecuritiesFinancing10.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateTypeChoice#TextualRate
	 * RateTypeChoice.TextualRate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType4Choice#Other
	 * RateType4Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#RateType
	 * SecuritiesFinancingTransactionDetails2.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#RateType
	 * SecuritiesFinancingTransactionDetails8.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#RateType
	 * SecuritiesFinancingTransactionDetails7.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#RateType
	 * SecuritiesFinancingTransactionDetails19.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#RateType
	 * SecuritiesFinancingTransactionDetails20.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#RateType
	 * SecuritiesFinancingTransactionDetails6.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#RateType
	 * SecuritiesFinancingTransactionDetails10.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#RateType
	 * SecuritiesFinancingTransactionDetails17.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#RateType
	 * SecuritiesFinancingTransactionDetails18.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#RateType
	 * SecuritiesFinancingTransactionDetails9.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#RateType
	 * SecuritiesFinancing1.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#RateType
	 * SecuritiesFinancingTransactionDetails21.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#RateType
	 * SecuritiesFinancingTransactionDetails22.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#RateType
	 * SecuritiesFinancingTransactionDetails24.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#RateType
	 * SecuritiesFinancingTransactionDetails25.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#RateType
	 * SecuritiesFinancingTransactionDetails26.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#RateType
	 * SecuritiesFinancingTransactionDetails28.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#RateType
	 * SecuritiesFinancingTransactionDetails27.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#RateType
	 * SecuritiesFinancingTransactionDetails29.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType35Choice#Code
	 * RateType35Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType35Choice#Proprietary
	 * RateType35Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType33Choice#Code
	 * RateType33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType33Choice#Proprietary
	 * RateType33Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType45Choice#Code
	 * RateType45Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType45Choice#Proprietary
	 * RateType45Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#RateType
	 * SecuritiesFinancingTransactionDetails33.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#RateType
	 * SecuritiesFinancingTransactionDetails32.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#RateType
	 * SecuritiesFinancingTransactionDetails30.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#RateType
	 * SecuritiesFinancingTransactionDetails34.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType67Choice#Code
	 * RateType67Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType67Choice#Proprietary
	 * RateType67Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#RateType
	 * SecuritiesFinancingTransactionDetails35.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#RateType
	 * SecuritiesFinancingTransactionDetails36.RateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of rate used to calculate the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateType6Choice.Code, com.tools20022.repository.choice.RateType6Choice.Proprietary, com.tools20022.repository.choice.RateType9Choice.Code,
					com.tools20022.repository.choice.RateType9Choice.Proprietary, com.tools20022.repository.choice.RateType3Choice.Code, com.tools20022.repository.choice.RateType3Choice.Proprietary,
					com.tools20022.repository.choice.RateType5Choice.Code, com.tools20022.repository.choice.RateType5Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.RateType,
					com.tools20022.repository.choice.RateType8Choice.Code, com.tools20022.repository.choice.RateType8Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.RateType, com.tools20022.repository.choice.RateType19Choice.Code,
					com.tools20022.repository.choice.RateType19Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancing10.RateType, com.tools20022.repository.choice.RateTypeChoice.TextualRate,
					com.tools20022.repository.choice.RateType4Choice.Other, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.RateType, com.tools20022.repository.msg.SecuritiesFinancing1.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.RateType, com.tools20022.repository.choice.RateType35Choice.Code,
					com.tools20022.repository.choice.RateType35Choice.Proprietary, com.tools20022.repository.choice.RateType33Choice.Code, com.tools20022.repository.choice.RateType33Choice.Proprietary,
					com.tools20022.repository.choice.RateType45Choice.Code, com.tools20022.repository.choice.RateType45Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.RateType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.RateType, com.tools20022.repository.choice.RateType67Choice.Code, com.tools20022.repository.choice.RateType67Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.RateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.RateType);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of rate used to calculate the interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestRateTypeCode.mmObject();
		}
	};
	/**
	 * Period during which the interest rate has been applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInterestCalculation
	 * DateTimePeriod.RelatedInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#InterestPeriod
	 * CorporateActionPeriod3.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#InterestPeriod
	 * CorporateActionPeriod6.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#InterestPeriod
	 * CorporateActionPeriod8.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest1#FromToDate
	 * AccountInterest1.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest1#FromToDate
	 * TransactionInterest1.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest2#FromToDate
	 * AccountInterest2.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest2#FromToDate
	 * TransactionInterest2.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3#FromToDate
	 * AccountInterest3.FromToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestRecord1#FromToDate
	 * InterestRecord1.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#InterestPeriod
	 * CorporateActionPeriod1.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#InterestPeriod
	 * InterestAmount1.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#InterestPeriod
	 * InterestAmount2.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#InterestPeriod
	 * InterestStatement1.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#InterestPeriod
	 * InterestStatement2.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#InterestPeriod
	 * CorporateActionPeriod10.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#InterestPeriod
	 * InterestStatement3.InterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#InterestPeriod
	 * InterestStatement4.InterestPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the interest rate has been applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod3.InterestPeriod, com.tools20022.repository.msg.CorporateActionPeriod6.InterestPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod8.InterestPeriod, com.tools20022.repository.msg.AccountInterest1.FromToDate, com.tools20022.repository.msg.TransactionInterest1.FromToDate,
					com.tools20022.repository.msg.AccountInterest2.FromToDate, com.tools20022.repository.msg.TransactionInterest2.FromToDate, com.tools20022.repository.msg.AccountInterest3.FromToDate,
					com.tools20022.repository.msg.InterestRecord1.FromToDate, com.tools20022.repository.msg.CorporateActionPeriod1.InterestPeriod, com.tools20022.repository.msg.InterestAmount1.InterestPeriod,
					com.tools20022.repository.msg.InterestAmount2.InterestPeriod, com.tools20022.repository.msg.InterestStatement1.InterestPeriod, com.tools20022.repository.msg.InterestStatement2.InterestPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod10.InterestPeriod, com.tools20022.repository.msg.InterestStatement3.InterestPeriod, com.tools20022.repository.msg.InterestStatement4.InterestPeriod);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Index rate related to the interest rate of the forthcoming interest
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#RelatedIndex
	 * CorporateActionRate3.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#RelatedIndex
	 * CorporateActionRate14.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#RelatedIndex
	 * CorporateActionRate16.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#RelatedIndex
	 * CorporateActionRate24.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#RelatedIndex
	 * CorporateActionRate27.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#RelatedIndex
	 * CorporateActionRate32.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#RelatedIndex
	 * CorporateActionRate35.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#RelatedIndex
	 * CorporateActionRate41.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#RelatedIndex
	 * CorporateActionRate1.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#RelatedIndex
	 * CorporateActionRate43.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#RelatedIndex
	 * CorporateActionRate56.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#RelatedIndex
	 * CorporateActionRate66.RelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#RelatedIndex
	 * CorporateActionRate78.RelatedIndex}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index rate related to the interest rate of the forthcoming interest payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RelatedIndex = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate3.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate14.RelatedIndex,
					com.tools20022.repository.msg.CorporateActionRate16.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate24.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate27.RelatedIndex,
					com.tools20022.repository.msg.CorporateActionRate32.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate35.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate41.RelatedIndex,
					com.tools20022.repository.msg.CorporateActionRate1.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate43.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate56.RelatedIndex,
					com.tools20022.repository.msg.CorporateActionRate66.RelatedIndex, com.tools20022.repository.msg.CorporateActionRate78.RelatedIndex);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Start date used for calculating accrued interest on debt instruments
	 * which are being sold between interest payment dates. Often but not always
	 * the same as the issue date and the dated date.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#InterestAccrualDate
	 * Debt1.InterestAccrualDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#InterestAccrualDate
	 * Debt2.InterestAccrualDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccrualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestAccrualDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.InterestAccrualDate, com.tools20022.repository.msg.Debt2.InterestAccrualDate);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the interest is simple or compounded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationMethodCode
	 * CalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#InterestCalculationMethod
	 * Debt1.InterestCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#CalculationMethod
	 * InterestAmount1.CalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#CalculationMethod
	 * InterestAmount2.CalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#InterestCalculationMethod
	 * Debt2.InterestCalculationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the interest is simple or compounded."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.InterestCalculationMethod, com.tools20022.repository.msg.InterestAmount1.CalculationMethod,
					com.tools20022.repository.msg.InterestAmount2.CalculationMethod, com.tools20022.repository.msg.Debt2.InterestCalculationMethod);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CalculationMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the parameters to be used for variable interest payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#InterestCalculation
	 * VariableInterest.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#VariableInterestDetails
	 * Debt1.VariableInterestDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters to be used for variable interest payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariableInterest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.VariableInterestDetails);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Specifies the parameters to be used for variable interest payments.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.InterestCode
	 * InterestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#Code
	 * InterestType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#Proprietary
	 * InterestType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest1#Type
	 * AccountInterest1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest1#Type
	 * TransactionInterest1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest2#Type
	 * AccountInterest2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest2#Type
	 * TransactionInterest2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#Type
	 * AccountInterest3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#InterestType
	 * Debt2.InterestType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestType1Choice.Code, com.tools20022.repository.choice.InterestType1Choice.Proprietary, com.tools20022.repository.msg.AccountInterest1.Type,
					com.tools20022.repository.msg.TransactionInterest1.Type, com.tools20022.repository.msg.AccountInterest2.Type, com.tools20022.repository.msg.TransactionInterest2.Type, com.tools20022.repository.msg.AccountInterest3.Type,
					com.tools20022.repository.msg.Debt2.InterestType);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestType";
			definition = "Specifies the type of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestCode.mmObject();
		}
	};
	/**
	 * Specifies the amount range for which the interest rate is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#RelatedInterest
	 * AmountRange.RelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRange
	 * AmountRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate1#ValidityRange
	 * Rate1.ValidityRange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate3#ValidityRange
	 * Rate3.ValidityRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateValidityRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount range for which the interest rate is applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RateValidityRange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Rate1.ValidityRange, com.tools20022.repository.msg.Rate3.ValidityRange);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateValidityRange";
			definition = "Specifies the amount range for which the interest rate is applicable.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountRange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRange.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the interest will be settled in cash or rolled in the
	 * existing collateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestMethodCode
	 * InterestMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#InterestMethod
	 * InterestAmount1.InterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#InterestMethod
	 * InterestResult1.InterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#InterestMethod
	 * InterestAmount2.InterestMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestAmount1.InterestMethod, com.tools20022.repository.msg.InterestResult1.InterestMethod, com.tools20022.repository.msg.InterestAmount2.InterestMethod);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InterestMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the periodicity of the calculation of the interest.
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
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#CalculationFrequency
	 * InterestAmount1.CalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#CalculationFrequency
	 * InterestAmount2.CalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#Unit
	 * InterestRateContractTerm1.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm2#Unit
	 * InterestRateContractTerm2.Unit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity of the calculation of the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestAmount1.CalculationFrequency, com.tools20022.repository.msg.InterestAmount2.CalculationFrequency,
					com.tools20022.repository.msg.InterestRateContractTerm1.Unit, com.tools20022.repository.msg.InterestRateContractTerm2.Unit);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Indicates the calculation date of the interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#CalculationDate
	 * InterestCalculation1.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#CalculationDate
	 * InterestCalculation2.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#CalculationDate
	 * InterestCalculation3.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#CalculationDate
	 * InterestCalculation4.CalculationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the calculation date of the interest amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestCalculation1.CalculationDate, com.tools20022.repository.msg.InterestCalculation2.CalculationDate,
					com.tools20022.repository.msg.InterestCalculation3.CalculationDate, com.tools20022.repository.msg.InterestCalculation4.CalculationDate);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the calculation date of the interest amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the charges on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#RelatedInterest
	 * Charges.RelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the charges on interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges on interest.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which a next interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#NextInterest
	 * Debt.NextInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a next interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DebtInstrument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebtInstrument";
			definition = "Debt for which a next interest is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.NextInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the difference between two interests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#RelatedInterest
	 * Spread.RelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the difference between two interests."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Specifies the difference between two interests.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the frequency of an interest payment.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PaymentFrequency
	 * FinancialInstrumentAttributes8.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PaymentFrequency
	 * FinancialInstrumentAttributes20.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#PaymentFrequency
	 * FinancialInstrumentAttributes35.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#PaymentFrequency
	 * FinancialInstrumentAttributes41.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PaymentFrequency
	 * FinancialInstrumentAttributes4.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PaymentFrequency
	 * FinancialInstrumentAttributes13.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PaymentFrequency
	 * FinancialInstrumentAttributes21.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PaymentFrequency
	 * FinancialInstrumentAttributes26.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#PaymentFrequency
	 * FinancialInstrumentAttributes36.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#PaymentFrequency
	 * FinancialInstrumentAttributes42.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PaymentFrequency
	 * FinancialInstrumentAttributes27.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PaymentFrequency
	 * FinancialInstrumentAttributes14.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PaymentFrequency
	 * FinancialInstrumentAttributes30.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PaymentFrequency
	 * FinancialInstrumentAttributes28.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#PaymentFrequency
	 * FinancialInstrumentStipulations.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#PaymentFrequency
	 * FinancialInstrumentAttributes31.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#PaymentFrequency
	 * FinancialInstrumentStipulations2.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#PaymentFrequency
	 * FinancialInstrumentAttributes44.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PaymentFrequency
	 * FinancialInstrumentAttributes15.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PaymentFrequency
	 * FinancialInstrumentAttributes29.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PaymentFrequency
	 * FinancialInstrumentAttributes2.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#PaymentFrequency
	 * FinancialInstrumentAttributes63.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#PaymentFrequency
	 * FinancialInstrumentAttributes64.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#PaymentFrequency
	 * FinancialInstrumentAttributes75.PaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#PaymentFrequency
	 * FinancialInstrumentAttributes78.PaymentFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency of an interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes20.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes41.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes13.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes26.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes42.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes14.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes28.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes31.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes44.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes29.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes63.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.PaymentFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes75.PaymentFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.PaymentFrequency);
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Interest management process which requires interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#InterestCalculation
	 * InterestManagement.InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest management process which requires interest calculation.                        "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InterestCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Interest management process which requires interest calculation.                        ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InterestManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestCalculation";
				definition = "Set of parameters used to calculate an interest amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation, com.tools20022.repository.entity.AmountRange.RelatedInterest,
						com.tools20022.repository.entity.Charges.RelatedInterest, com.tools20022.repository.entity.Interest.InterestCalculation, com.tools20022.repository.entity.Debt.NextInterest,
						com.tools20022.repository.entity.VariableInterest.InterestCalculation, com.tools20022.repository.entity.Spread.RelatedInterest, com.tools20022.repository.entity.InterestManagement.InterestCalculation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionInterest1.Rate, com.tools20022.repository.msg.TransactionInterest2.Rate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestCalculation.DayCountBasis, com.tools20022.repository.entity.InterestCalculation.Rate,
						com.tools20022.repository.entity.InterestCalculation.Interest, com.tools20022.repository.entity.InterestCalculation.RateType, com.tools20022.repository.entity.InterestCalculation.InterestPeriod,
						com.tools20022.repository.entity.InterestCalculation.RelatedIndex, com.tools20022.repository.entity.InterestCalculation.InterestAccrualDate, com.tools20022.repository.entity.InterestCalculation.CalculationMethod,
						com.tools20022.repository.entity.InterestCalculation.VariableInterest, com.tools20022.repository.entity.InterestCalculation.InterestType, com.tools20022.repository.entity.InterestCalculation.RateValidityRange,
						com.tools20022.repository.entity.InterestCalculation.InterestMethod, com.tools20022.repository.entity.InterestCalculation.CalculationFrequency, com.tools20022.repository.entity.InterestCalculation.CalculationDate,
						com.tools20022.repository.entity.InterestCalculation.Charges, com.tools20022.repository.entity.InterestCalculation.DebtInstrument, com.tools20022.repository.entity.InterestCalculation.Spread,
						com.tools20022.repository.entity.InterestCalculation.PaymentFrequency, com.tools20022.repository.entity.InterestCalculation.RelatedInterestManagement);
				derivationComponent_lazy = () -> Arrays.asList(InterestComputationMethodFormat1Choice.mmObject(), InterestComputationMethodFormat2Choice.mmObject(), RateType6Choice.mmObject(), RateType9Choice.mmObject(),
						RateType3Choice.mmObject(), RateType5Choice.mmObject(), Rate2.mmObject(), RateType8Choice.mmObject(), InterestComputationMethod1Choice.mmObject(), InterestComputationMethodFormat3Choice.mmObject(),
						RateType19Choice.mmObject(), InterestComputationMethod2Choice.mmObject(), InterestType1Choice.mmObject(), RateTypeChoice.mmObject(), Rate1.mmObject(), AccountInterest1.mmObject(), TransactionInterest1.mmObject(),
						RateType4Choice.mmObject(), Rate3.mmObject(), AccountInterest2.mmObject(), TransactionInterest2.mmObject(), AccountInterest3.mmObject(), TransactionInterest3.mmObject(), InterestCalculation1.mmObject(),
						InterestCalculation2.mmObject(), InterestCalculation3.mmObject(), RateType35Choice.mmObject(), InterestComputationMethodFormat4Choice.mmObject(), RateType33Choice.mmObject(), InterestCalculation4.mmObject(),
						RateType45Choice.mmObject(), InterestComputationMethodFormat5Choice.mmObject(), RateType67Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}