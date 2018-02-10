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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
 * InterestCalculation.mmDayCountBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
 * InterestCalculation.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
 * InterestCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
 * InterestCalculation.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
 * InterestCalculation.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedIndex
 * InterestCalculation.mmRelatedIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestAccrualDate
 * InterestCalculation.mmInterestAccrualDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationMethod
 * InterestCalculation.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmVariableInterest
 * InterestCalculation.mmVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestType
 * InterestCalculation.mmInterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
 * InterestCalculation.mmRateValidityRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestMethod
 * InterestCalculation.mmInterestMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationFrequency
 * InterestCalculation.mmCalculationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationDate
 * InterestCalculation.mmCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCharges
 * InterestCalculation.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDebtInstrument
 * InterestCalculation.mmDebtInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmSpread
 * InterestCalculation.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
 * InterestCalculation.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedInterestManagement
 * InterestCalculation.mmRelatedInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
 * DateTimePeriod.mmRelatedInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
 * AmountRange.mmRelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
 * Charges.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
 * Interest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
 * Debt.mmNextInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmInterestCalculation
 * VariableInterest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
 * Spread.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterestCalculation
 * InterestManagement.mmInterestCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest1#mmRate
 * TransactionInterest1.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionInterest2#mmRate
 * TransactionInterest2.mmRate}</li>
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
	protected InterestComputationMethodCode dayCountBasis;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat1Choice#mmCode
	 * InterestComputationMethodFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat1Choice#mmProprietary
	 * InterestComputationMethodFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmDayCountBasis
	 * FinancialInstrumentAttributes8.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmDayCountBasis
	 * FinancialInstrumentAttributes20.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmDayCountBasis
	 * FinancialInstrumentAttributes35.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat2Choice#mmCode
	 * InterestComputationMethodFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat2Choice#mmProprietary
	 * InterestComputationMethodFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmDayCountBasis
	 * FinancialInstrumentAttributes41.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmDayCountBasis
	 * FinancialInstrumentAttributes6.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmDayCountBasis
	 * FinancialInstrumentAttributes9.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmDayCountBasis
	 * FinancialInstrumentAttributes18.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmDayCountBasis
	 * FinancialInstrumentAttributes22.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmDayCountBasis
	 * FinancialInstrumentAttributes32.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmDayCountBasis
	 * FinancialInstrumentAttributes38.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmDayCountBasis
	 * FinancialInstrumentAttributes7.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmDayCountBasis
	 * FinancialInstrumentAttributes5.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmDayCountBasis
	 * FinancialInstrumentAttributes11.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmDayCountBasis
	 * FinancialInstrumentAttributes10.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmDayCountBasis
	 * FinancialInstrumentAttributes19.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmDayCountBasis
	 * FinancialInstrumentAttributes16.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmDayCountBasis
	 * FinancialInstrumentAttributes23.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmDayCountBasis
	 * FinancialInstrumentAttributes24.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmDayCountBasis
	 * FinancialInstrumentAttributes33.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmDayCountBasis
	 * FinancialInstrumentAttributes34.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmDayCountBasis
	 * FinancialInstrumentAttributes39.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmDayCountBasis
	 * FinancialInstrumentAttributes40.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmDayCountBasis
	 * FinancialInstrumentAttributes43.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmDayCountBasis
	 * FinancialInstrumentAttributes45.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmDayCountBasis
	 * FinancialInstrumentAttributes4.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmDayCountBasis
	 * FinancialInstrumentAttributes13.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmDayCountBasis
	 * FinancialInstrumentAttributes21.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmDayCountBasis
	 * FinancialInstrumentAttributes26.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmDayCountBasis
	 * FinancialInstrumentAttributes36.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmDayCountBasis
	 * FinancialInstrumentAttributes42.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmDayCountBasis
	 * FinancialInstrumentAttributes27.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmDayCountBasis
	 * FinancialInstrumentAttributes14.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmDayCountBasis
	 * FinancialInstrumentAttributes30.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails3.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails5.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmDayCountBasis
	 * FinancialInstrumentAttributes28.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails1.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails11.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails14.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails4.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod1Choice#mmCode
	 * InterestComputationMethod1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod1Choice#mmProprietary
	 * InterestComputationMethod1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmDayCountBasis
	 * Debt1.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice#mmCode
	 * InterestComputationMethodFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice#mmProprietary
	 * InterestComputationMethodFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmDayCountBasis
	 * FinancialInstrumentAttributes31.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice#mmCode
	 * InterestComputationMethod2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice#mmProprietary
	 * InterestComputationMethod2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmInterestComputationMethod
	 * SecuritiesFinancing10.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmDayCountBasis
	 * FinancialInstrumentAttributes44.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmDayCountBasis
	 * FinancialInstrumentAttributes15.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmDayCountBasis
	 * InterestAmount1.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmDayCountBasis
	 * InterestAmount2.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmDayCountBasis
	 * CollateralValuation1.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails19.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails20.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmDayCountBasis
	 * FinancialInstrumentAttributes29.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmInterestComputationMethod
	 * SecuritiesFinancing1.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmDayCountBasis
	 * FinancialInstrumentAttributes2.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmDayCountBasis
	 * FinancialInstrumentAttributes48.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmDayCountBasis
	 * FinancialInstrumentAttributes50.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmDayCountBasis
	 * FinancialInstrumentAttributes49.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmDayCountBasis
	 * FinancialInstrumentAttributes55.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmDayCountBasis
	 * FinancialInstrumentAttributes57.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmDayCountBasis
	 * FinancialInstrumentAttributes56.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmDayCountBasis
	 * CollateralValuation2.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDayCountBasis
	 * FinancialInstrumentAttributes63.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDayCountBasis
	 * FinancialInstrumentAttributes64.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails28.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails27.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice#mmCode
	 * InterestComputationMethodFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice#mmProprietary
	 * InterestComputationMethodFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmDayCountBasis
	 * FinancialInstrumentAttributes66.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmDayCountBasis
	 * FinancialInstrumentAttributes65.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmDayCountBasis
	 * FinancialInstrumentAttributes67.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmDayCountBasis
	 * CollateralValuation5.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmDayCountBasis
	 * FinancialInstrumentAttributes70.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmDayCountBasis
	 * FinancialInstrumentAttributes69.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmDayCountBasis
	 * FinancialInstrumentAttributes71.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat5Choice#mmCode
	 * InterestComputationMethodFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat5Choice#mmProprietary
	 * InterestComputationMethodFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails32.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails30.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmDayCountBasis
	 * FinancialInstrumentAttributes75.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmDayCountBasis
	 * FinancialInstrumentAttributes78.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDayCountBasis
	 * FinancialInstrumentAttributes79.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmDayCountBasis
	 * FinancialInstrumentAttributes81.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDayCountBasis
	 * FinancialInstrumentAttributes80.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmDayCountBasis
	 * FinancialInstrumentAttributes85.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmDayCountBasis
	 * FinancialInstrumentAttributes84.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmDayCountBasis
	 * FinancialInstrumentAttributes83.mmDayCountBasis}</li>
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
	public static final MMBusinessAttribute mmDayCountBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestComputationMethodFormat1Choice.mmCode, InterestComputationMethodFormat1Choice.mmProprietary, FinancialInstrumentAttributes8.mmDayCountBasis,
					FinancialInstrumentAttributes20.mmDayCountBasis, FinancialInstrumentAttributes35.mmDayCountBasis, InterestComputationMethodFormat2Choice.mmCode, InterestComputationMethodFormat2Choice.mmProprietary,
					FinancialInstrumentAttributes41.mmDayCountBasis, FinancialInstrumentAttributes6.mmDayCountBasis, FinancialInstrumentAttributes9.mmDayCountBasis, FinancialInstrumentAttributes18.mmDayCountBasis,
					FinancialInstrumentAttributes22.mmDayCountBasis, FinancialInstrumentAttributes32.mmDayCountBasis, FinancialInstrumentAttributes38.mmDayCountBasis, FinancialInstrumentAttributes7.mmDayCountBasis,
					FinancialInstrumentAttributes5.mmDayCountBasis, FinancialInstrumentAttributes11.mmDayCountBasis, FinancialInstrumentAttributes10.mmDayCountBasis, FinancialInstrumentAttributes19.mmDayCountBasis,
					FinancialInstrumentAttributes16.mmDayCountBasis, FinancialInstrumentAttributes23.mmDayCountBasis, FinancialInstrumentAttributes24.mmDayCountBasis, FinancialInstrumentAttributes33.mmDayCountBasis,
					FinancialInstrumentAttributes34.mmDayCountBasis, FinancialInstrumentAttributes39.mmDayCountBasis, FinancialInstrumentAttributes40.mmDayCountBasis, FinancialInstrumentAttributes43.mmDayCountBasis,
					FinancialInstrumentAttributes45.mmDayCountBasis, FinancialInstrumentAttributes4.mmDayCountBasis, FinancialInstrumentAttributes13.mmDayCountBasis, FinancialInstrumentAttributes21.mmDayCountBasis,
					FinancialInstrumentAttributes26.mmDayCountBasis, FinancialInstrumentAttributes36.mmDayCountBasis, FinancialInstrumentAttributes42.mmDayCountBasis, FinancialInstrumentAttributes27.mmDayCountBasis,
					FinancialInstrumentAttributes14.mmDayCountBasis, FinancialInstrumentAttributes30.mmDayCountBasis, SecuritiesFinancingTransactionDetails3.mmInterestComputationMethod,
					SecuritiesFinancingTransactionDetails5.mmInterestComputationMethod, FinancialInstrumentAttributes28.mmDayCountBasis, SecuritiesFinancingTransactionDetails1.mmInterestComputationMethod,
					SecuritiesFinancingTransactionDetails11.mmInterestComputationMethod, SecuritiesFinancingTransactionDetails14.mmInterestComputationMethod, SecuritiesFinancingTransactionDetails4.mmInterestComputationMethod,
					InterestComputationMethod1Choice.mmCode, InterestComputationMethod1Choice.mmProprietary, Debt1.mmDayCountBasis, InterestComputationMethodFormat3Choice.mmCode, InterestComputationMethodFormat3Choice.mmProprietary,
					FinancialInstrumentAttributes31.mmDayCountBasis, InterestComputationMethod2Choice.mmCode, InterestComputationMethod2Choice.mmProprietary, SecuritiesFinancing10.mmInterestComputationMethod,
					FinancialInstrumentAttributes44.mmDayCountBasis, FinancialInstrumentAttributes15.mmDayCountBasis, InterestAmount1.mmDayCountBasis, InterestAmount2.mmDayCountBasis, CollateralValuation1.mmDayCountBasis,
					SecuritiesFinancingTransactionDetails19.mmInterestComputationMethod, SecuritiesFinancingTransactionDetails20.mmInterestComputationMethod, FinancialInstrumentAttributes29.mmDayCountBasis,
					SecuritiesFinancing1.mmInterestComputationMethod, FinancialInstrumentAttributes2.mmDayCountBasis, FinancialInstrumentAttributes48.mmDayCountBasis, FinancialInstrumentAttributes50.mmDayCountBasis,
					FinancialInstrumentAttributes49.mmDayCountBasis, FinancialInstrumentAttributes55.mmDayCountBasis, FinancialInstrumentAttributes57.mmDayCountBasis, FinancialInstrumentAttributes56.mmDayCountBasis,
					CollateralValuation2.mmDayCountBasis, FinancialInstrumentAttributes63.mmDayCountBasis, FinancialInstrumentAttributes64.mmDayCountBasis, SecuritiesFinancingTransactionDetails28.mmInterestComputationMethod,
					SecuritiesFinancingTransactionDetails27.mmInterestComputationMethod, InterestComputationMethodFormat4Choice.mmCode, InterestComputationMethodFormat4Choice.mmProprietary, FinancialInstrumentAttributes66.mmDayCountBasis,
					FinancialInstrumentAttributes65.mmDayCountBasis, FinancialInstrumentAttributes67.mmDayCountBasis, CollateralValuation5.mmDayCountBasis, FinancialInstrumentAttributes70.mmDayCountBasis,
					FinancialInstrumentAttributes69.mmDayCountBasis, FinancialInstrumentAttributes71.mmDayCountBasis, InterestComputationMethodFormat5Choice.mmCode, InterestComputationMethodFormat5Choice.mmProprietary,
					SecuritiesFinancingTransactionDetails32.mmInterestComputationMethod, SecuritiesFinancingTransactionDetails30.mmInterestComputationMethod, FinancialInstrumentAttributes75.mmDayCountBasis,
					FinancialInstrumentAttributes78.mmDayCountBasis, FinancialInstrumentAttributes79.mmDayCountBasis, FinancialInstrumentAttributes81.mmDayCountBasis, FinancialInstrumentAttributes80.mmDayCountBasis,
					FinancialInstrumentAttributes85.mmDayCountBasis, FinancialInstrumentAttributes84.mmDayCountBasis, FinancialInstrumentAttributes83.mmDayCountBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DayCountBasis";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getDayCountBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmInterestRate
	 * FinancialInstrumentAttributes8.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmNextInterestRate
	 * FinancialInstrumentAttributes8.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmInterestRate
	 * FinancialInstrumentAttributes20.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmNextInterestRate
	 * FinancialInstrumentAttributes20.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmInterestRate
	 * FinancialInstrumentAttributes35.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmNextInterestRate
	 * FinancialInstrumentAttributes35.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmInterestRate
	 * FinancialInstrumentAttributes41.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmNextInterestRate
	 * FinancialInstrumentAttributes41.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmInterestRate
	 * FinancialInstrumentAttributes6.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmNextInterestRate
	 * FinancialInstrumentAttributes6.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmInterestRate
	 * FinancialInstrumentAttributes9.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmNextInterestRate
	 * FinancialInstrumentAttributes9.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmInterestRate
	 * FinancialInstrumentAttributes18.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmNextInterestRate
	 * FinancialInstrumentAttributes18.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmInterestRate
	 * FinancialInstrumentAttributes22.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmNextInterestRate
	 * FinancialInstrumentAttributes22.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmInterestRate
	 * FinancialInstrumentAttributes32.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmNextInterestRate
	 * FinancialInstrumentAttributes32.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmInterestRate
	 * FinancialInstrumentAttributes38.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmNextInterestRate
	 * FinancialInstrumentAttributes38.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmInterestRate
	 * FinancialInstrumentAttributes7.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmNextInterestRate
	 * FinancialInstrumentAttributes7.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmInterestRate
	 * FinancialInstrumentAttributes5.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmNextInterestRate
	 * FinancialInstrumentAttributes5.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmInterestRate
	 * FinancialInstrumentAttributes11.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmNextInterestRate
	 * FinancialInstrumentAttributes11.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmInterestRate
	 * FinancialInstrumentAttributes10.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmNextInterestRate
	 * FinancialInstrumentAttributes10.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmInterestRate
	 * FinancialInstrumentAttributes19.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmNextInterestRate
	 * FinancialInstrumentAttributes19.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmInterestRate
	 * FinancialInstrumentAttributes16.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmNextInterestRate
	 * FinancialInstrumentAttributes16.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmInterestRate
	 * FinancialInstrumentAttributes23.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmNextInterestRate
	 * FinancialInstrumentAttributes23.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmInterestRate
	 * FinancialInstrumentAttributes24.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmNextInterestRate
	 * FinancialInstrumentAttributes24.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmInterestRate
	 * FinancialInstrumentAttributes33.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmNextInterestRate
	 * FinancialInstrumentAttributes33.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmInterestRate
	 * FinancialInstrumentAttributes34.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmNextInterestRate
	 * FinancialInstrumentAttributes34.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmInterestRate
	 * FinancialInstrumentAttributes39.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmNextInterestRate
	 * FinancialInstrumentAttributes39.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmInterestRate
	 * FinancialInstrumentAttributes40.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmNextInterestRate
	 * FinancialInstrumentAttributes40.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmInterestRate
	 * FinancialInstrumentAttributes43.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmNextInterestRate
	 * FinancialInstrumentAttributes43.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmInterestRate
	 * FinancialInstrumentAttributes45.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmNextInterestRate
	 * FinancialInstrumentAttributes45.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmInterestRate
	 * FinancialInstrumentAttributes4.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmNextInterestRate
	 * FinancialInstrumentAttributes4.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmInterestRate
	 * FinancialInstrumentAttributes13.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmNextInterestRate
	 * FinancialInstrumentAttributes13.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmInterestRate
	 * FinancialInstrumentAttributes21.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmNextInterestRate
	 * FinancialInstrumentAttributes21.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmInterestRate
	 * FinancialInstrumentAttributes26.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmNextInterestRate
	 * FinancialInstrumentAttributes26.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmInterestRate
	 * FinancialInstrumentAttributes36.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmNextInterestRate
	 * FinancialInstrumentAttributes36.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmInterestRate
	 * FinancialInstrumentAttributes42.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmNextInterestRate
	 * FinancialInstrumentAttributes42.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmInterestRate
	 * FinancialInstrumentAttributes27.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmNextInterestRate
	 * FinancialInstrumentAttributes27.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmInterestRate
	 * FinancialInstrumentAttributes14.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmNextInterestRate
	 * FinancialInstrumentAttributes14.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmInterestRate
	 * FinancialInstrumentAttributes30.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmNextInterestRate
	 * FinancialInstrumentAttributes30.mmNextInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate2#mmRate Rate2.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmInterestRate
	 * FinancialInstrumentAttributes28.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmNextInterestRate
	 * FinancialInstrumentAttributes28.mmNextInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmInterestRate
	 * Debt1.mmInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmNextInterestRate
	 * Debt1.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmInterestRate
	 * FinancialInstrumentAttributes31.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmNextInterestRate
	 * FinancialInstrumentAttributes31.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmBorrowingRate
	 * SecuritiesFinancing10.mmBorrowingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateTypeChoice#mmPercentageRate
	 * RateTypeChoice.mmPercentageRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate1#mmRate Rate1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest1#mmRate
	 * AccountInterest1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType4Choice#mmPercentage
	 * RateType4Choice.mmPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest2#mmRate
	 * AccountInterest2.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmRate
	 * AccountInterest3.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmInterestRate
	 * FinancialInstrumentAttributes44.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmNextInterestRate
	 * FinancialInstrumentAttributes44.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmInterestRate
	 * FinancialInstrumentAttributes15.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmNextInterestRate
	 * FinancialInstrumentAttributes15.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#mmInterestRate
	 * InterestCalculation1.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmInterestRate
	 * InterestCalculation2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmInterestRate
	 * FinancialInstrumentAttributes29.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmNextInterestRate
	 * FinancialInstrumentAttributes29.mmNextInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInterestRate
	 * Debt2.mmInterestRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmNextInterestRate
	 * Debt2.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmInterestRate
	 * FinancialInstrumentAttributes2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmNextInterestRate
	 * FinancialInstrumentAttributes2.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmInterestRate
	 * FinancialInstrumentAttributes48.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextInterestRate
	 * FinancialInstrumentAttributes48.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmInterestRate
	 * FinancialInstrumentAttributes50.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmNextInterestRate
	 * FinancialInstrumentAttributes50.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmInterestRate
	 * FinancialInstrumentAttributes49.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextInterestRate
	 * FinancialInstrumentAttributes49.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmInterestRate
	 * FinancialInstrumentAttributes55.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmNextInterestRate
	 * FinancialInstrumentAttributes55.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmInterestRate
	 * FinancialInstrumentAttributes57.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmNextInterestRate
	 * FinancialInstrumentAttributes57.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmInterestRate
	 * FinancialInstrumentAttributes56.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmNextInterestRate
	 * FinancialInstrumentAttributes56.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmInterestRate
	 * InterestCalculation3.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmInterestRate
	 * FinancialInstrumentAttributes63.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmNextInterestRate
	 * FinancialInstrumentAttributes63.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmInterestRate
	 * FinancialInstrumentAttributes64.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmNextInterestRate
	 * FinancialInstrumentAttributes64.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmInterestRate
	 * FinancialInstrumentAttributes66.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextInterestRate
	 * FinancialInstrumentAttributes66.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmInterestRate
	 * FinancialInstrumentAttributes65.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmNextInterestRate
	 * FinancialInstrumentAttributes65.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmInterestRate
	 * FinancialInstrumentAttributes67.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextInterestRate
	 * FinancialInstrumentAttributes67.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmInterestRate
	 * InterestCalculation4.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmInterestRate
	 * FinancialInstrumentAttributes70.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmNextInterestRate
	 * FinancialInstrumentAttributes70.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmInterestRate
	 * FinancialInstrumentAttributes69.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmNextInterestRate
	 * FinancialInstrumentAttributes69.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmInterestRate
	 * FinancialInstrumentAttributes71.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmNextInterestRate
	 * FinancialInstrumentAttributes71.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmInterestRate
	 * FinancialInstrumentAttributes75.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmNextInterestRate
	 * FinancialInstrumentAttributes75.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmInterestRate
	 * FinancialInstrumentAttributes78.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmNextInterestRate
	 * FinancialInstrumentAttributes78.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmInterestRate
	 * FinancialInstrumentAttributes79.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextInterestRate
	 * FinancialInstrumentAttributes79.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmInterestRate
	 * FinancialInstrumentAttributes81.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmNextInterestRate
	 * FinancialInstrumentAttributes81.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmInterestRate
	 * FinancialInstrumentAttributes80.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextInterestRate
	 * FinancialInstrumentAttributes80.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmInterestRate
	 * FinancialInstrumentAttributes85.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmNextInterestRate
	 * FinancialInstrumentAttributes85.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmInterestRate
	 * FinancialInstrumentAttributes84.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmNextInterestRate
	 * FinancialInstrumentAttributes84.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmInterestRate
	 * FinancialInstrumentAttributes83.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmNextInterestRate
	 * FinancialInstrumentAttributes83.mmNextInterestRate}</li>
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmInterestRate, FinancialInstrumentAttributes8.mmNextInterestRate, FinancialInstrumentAttributes20.mmInterestRate,
					FinancialInstrumentAttributes20.mmNextInterestRate, FinancialInstrumentAttributes35.mmInterestRate, FinancialInstrumentAttributes35.mmNextInterestRate, FinancialInstrumentAttributes41.mmInterestRate,
					FinancialInstrumentAttributes41.mmNextInterestRate, FinancialInstrumentAttributes6.mmInterestRate, FinancialInstrumentAttributes6.mmNextInterestRate, FinancialInstrumentAttributes9.mmInterestRate,
					FinancialInstrumentAttributes9.mmNextInterestRate, FinancialInstrumentAttributes18.mmInterestRate, FinancialInstrumentAttributes18.mmNextInterestRate, FinancialInstrumentAttributes22.mmInterestRate,
					FinancialInstrumentAttributes22.mmNextInterestRate, FinancialInstrumentAttributes32.mmInterestRate, FinancialInstrumentAttributes32.mmNextInterestRate, FinancialInstrumentAttributes38.mmInterestRate,
					FinancialInstrumentAttributes38.mmNextInterestRate, FinancialInstrumentAttributes7.mmInterestRate, FinancialInstrumentAttributes7.mmNextInterestRate, FinancialInstrumentAttributes5.mmInterestRate,
					FinancialInstrumentAttributes5.mmNextInterestRate, FinancialInstrumentAttributes11.mmInterestRate, FinancialInstrumentAttributes11.mmNextInterestRate, FinancialInstrumentAttributes10.mmInterestRate,
					FinancialInstrumentAttributes10.mmNextInterestRate, FinancialInstrumentAttributes19.mmInterestRate, FinancialInstrumentAttributes19.mmNextInterestRate, FinancialInstrumentAttributes16.mmInterestRate,
					FinancialInstrumentAttributes16.mmNextInterestRate, FinancialInstrumentAttributes23.mmInterestRate, FinancialInstrumentAttributes23.mmNextInterestRate, FinancialInstrumentAttributes24.mmInterestRate,
					FinancialInstrumentAttributes24.mmNextInterestRate, FinancialInstrumentAttributes33.mmInterestRate, FinancialInstrumentAttributes33.mmNextInterestRate, FinancialInstrumentAttributes34.mmInterestRate,
					FinancialInstrumentAttributes34.mmNextInterestRate, FinancialInstrumentAttributes39.mmInterestRate, FinancialInstrumentAttributes39.mmNextInterestRate, FinancialInstrumentAttributes40.mmInterestRate,
					FinancialInstrumentAttributes40.mmNextInterestRate, FinancialInstrumentAttributes43.mmInterestRate, FinancialInstrumentAttributes43.mmNextInterestRate, FinancialInstrumentAttributes45.mmInterestRate,
					FinancialInstrumentAttributes45.mmNextInterestRate, FinancialInstrumentAttributes4.mmInterestRate, FinancialInstrumentAttributes4.mmNextInterestRate, FinancialInstrumentAttributes13.mmInterestRate,
					FinancialInstrumentAttributes13.mmNextInterestRate, FinancialInstrumentAttributes21.mmInterestRate, FinancialInstrumentAttributes21.mmNextInterestRate, FinancialInstrumentAttributes26.mmInterestRate,
					FinancialInstrumentAttributes26.mmNextInterestRate, FinancialInstrumentAttributes36.mmInterestRate, FinancialInstrumentAttributes36.mmNextInterestRate, FinancialInstrumentAttributes42.mmInterestRate,
					FinancialInstrumentAttributes42.mmNextInterestRate, FinancialInstrumentAttributes27.mmInterestRate, FinancialInstrumentAttributes27.mmNextInterestRate, FinancialInstrumentAttributes14.mmInterestRate,
					FinancialInstrumentAttributes14.mmNextInterestRate, FinancialInstrumentAttributes30.mmInterestRate, FinancialInstrumentAttributes30.mmNextInterestRate, Rate2.mmRate, FinancialInstrumentAttributes28.mmInterestRate,
					FinancialInstrumentAttributes28.mmNextInterestRate, Debt1.mmInterestRate, Debt1.mmNextInterestRate, FinancialInstrumentAttributes31.mmInterestRate, FinancialInstrumentAttributes31.mmNextInterestRate,
					SecuritiesFinancing10.mmBorrowingRate, RateTypeChoice.mmPercentageRate, Rate1.mmRate, AccountInterest1.mmRate, RateType4Choice.mmPercentage, AccountInterest2.mmRate, AccountInterest3.mmRate,
					FinancialInstrumentAttributes44.mmInterestRate, FinancialInstrumentAttributes44.mmNextInterestRate, FinancialInstrumentAttributes15.mmInterestRate, FinancialInstrumentAttributes15.mmNextInterestRate,
					InterestCalculation1.mmInterestRate, InterestCalculation2.mmInterestRate, FinancialInstrumentAttributes29.mmInterestRate, FinancialInstrumentAttributes29.mmNextInterestRate, Debt2.mmInterestRate,
					Debt2.mmNextInterestRate, FinancialInstrumentAttributes2.mmInterestRate, FinancialInstrumentAttributes2.mmNextInterestRate, FinancialInstrumentAttributes48.mmInterestRate,
					FinancialInstrumentAttributes48.mmNextInterestRate, FinancialInstrumentAttributes50.mmInterestRate, FinancialInstrumentAttributes50.mmNextInterestRate, FinancialInstrumentAttributes49.mmInterestRate,
					FinancialInstrumentAttributes49.mmNextInterestRate, FinancialInstrumentAttributes55.mmInterestRate, FinancialInstrumentAttributes55.mmNextInterestRate, FinancialInstrumentAttributes57.mmInterestRate,
					FinancialInstrumentAttributes57.mmNextInterestRate, FinancialInstrumentAttributes56.mmInterestRate, FinancialInstrumentAttributes56.mmNextInterestRate, InterestCalculation3.mmInterestRate,
					FinancialInstrumentAttributes63.mmInterestRate, FinancialInstrumentAttributes63.mmNextInterestRate, FinancialInstrumentAttributes64.mmInterestRate, FinancialInstrumentAttributes64.mmNextInterestRate,
					FinancialInstrumentAttributes66.mmInterestRate, FinancialInstrumentAttributes66.mmNextInterestRate, FinancialInstrumentAttributes65.mmInterestRate, FinancialInstrumentAttributes65.mmNextInterestRate,
					FinancialInstrumentAttributes67.mmInterestRate, FinancialInstrumentAttributes67.mmNextInterestRate, InterestCalculation4.mmInterestRate, FinancialInstrumentAttributes70.mmInterestRate,
					FinancialInstrumentAttributes70.mmNextInterestRate, FinancialInstrumentAttributes69.mmInterestRate, FinancialInstrumentAttributes69.mmNextInterestRate, FinancialInstrumentAttributes71.mmInterestRate,
					FinancialInstrumentAttributes71.mmNextInterestRate, FinancialInstrumentAttributes75.mmInterestRate, FinancialInstrumentAttributes75.mmNextInterestRate, FinancialInstrumentAttributes78.mmInterestRate,
					FinancialInstrumentAttributes78.mmNextInterestRate, FinancialInstrumentAttributes79.mmInterestRate, FinancialInstrumentAttributes79.mmNextInterestRate, FinancialInstrumentAttributes81.mmInterestRate,
					FinancialInstrumentAttributes81.mmNextInterestRate, FinancialInstrumentAttributes80.mmInterestRate, FinancialInstrumentAttributes80.mmNextInterestRate, FinancialInstrumentAttributes85.mmInterestRate,
					FinancialInstrumentAttributes85.mmNextInterestRate, FinancialInstrumentAttributes84.mmInterestRate, FinancialInstrumentAttributes84.mmNextInterestRate, FinancialInstrumentAttributes83.mmInterestRate,
					FinancialInstrumentAttributes83.mmNextInterestRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate3#mmType Rate3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest3#mmRecord
	 * TransactionInterest3.mmRecord}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Rate3.mmType, TransactionInterest3.mmRecord);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest resulting from the interest calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected InterestRateTypeCode rateType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.RateType6Choice#mmCode
	 * RateType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType6Choice#mmProprietary
	 * RateType6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType9Choice#mmCode
	 * RateType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType9Choice#mmProprietary
	 * RateType9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType3Choice#mmCode
	 * RateType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType3Choice#mmProprietary
	 * RateType3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType5Choice#mmCode
	 * RateType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType5Choice#mmProprietary
	 * RateType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmRateType
	 * SecuritiesFinancingTransactionDetails3.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType8Choice#mmCode
	 * RateType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType8Choice#mmProprietary
	 * RateType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmRateType
	 * SecuritiesFinancingTransactionDetails5.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmRateType
	 * SecuritiesFinancingTransactionDetails1.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmRateType
	 * SecuritiesFinancingTransactionDetails11.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmRateType
	 * SecuritiesFinancingTransactionDetails14.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmRateType
	 * SecuritiesFinancingTransactionDetails4.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType19Choice#mmCode
	 * RateType19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType19Choice#mmProprietary
	 * RateType19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRateType
	 * SecuritiesFinancing10.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateTypeChoice#mmTextualRate
	 * RateTypeChoice.mmTextualRate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType4Choice#mmOther
	 * RateType4Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmRateType
	 * SecuritiesFinancingTransactionDetails2.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmRateType
	 * SecuritiesFinancingTransactionDetails8.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmRateType
	 * SecuritiesFinancingTransactionDetails7.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRateType
	 * SecuritiesFinancingTransactionDetails19.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRateType
	 * SecuritiesFinancingTransactionDetails20.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmRateType
	 * SecuritiesFinancingTransactionDetails6.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmRateType
	 * SecuritiesFinancingTransactionDetails10.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmRateType
	 * SecuritiesFinancingTransactionDetails17.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmRateType
	 * SecuritiesFinancingTransactionDetails18.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmRateType
	 * SecuritiesFinancingTransactionDetails9.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRateType
	 * SecuritiesFinancing1.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmRateType
	 * SecuritiesFinancingTransactionDetails21.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmRateType
	 * SecuritiesFinancingTransactionDetails22.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmRateType
	 * SecuritiesFinancingTransactionDetails24.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmRateType
	 * SecuritiesFinancingTransactionDetails25.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmRateType
	 * SecuritiesFinancingTransactionDetails26.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmRateType
	 * SecuritiesFinancingTransactionDetails28.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRateType
	 * SecuritiesFinancingTransactionDetails27.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmRateType
	 * SecuritiesFinancingTransactionDetails29.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType35Choice#mmCode
	 * RateType35Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType35Choice#mmProprietary
	 * RateType35Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType33Choice#mmCode
	 * RateType33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType33Choice#mmProprietary
	 * RateType33Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType45Choice#mmCode
	 * RateType45Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType45Choice#mmProprietary
	 * RateType45Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmRateType
	 * SecuritiesFinancingTransactionDetails33.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmRateType
	 * SecuritiesFinancingTransactionDetails32.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmRateType
	 * SecuritiesFinancingTransactionDetails30.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmRateType
	 * SecuritiesFinancingTransactionDetails34.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType67Choice#mmCode
	 * RateType67Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType67Choice#mmProprietary
	 * RateType67Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmRateType
	 * SecuritiesFinancingTransactionDetails35.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmRateType
	 * SecuritiesFinancingTransactionDetails36.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REPT</li>
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
	public static final MMBusinessAttribute mmRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateType6Choice.mmCode, RateType6Choice.mmProprietary, RateType9Choice.mmCode, RateType9Choice.mmProprietary, RateType3Choice.mmCode, RateType3Choice.mmProprietary, RateType5Choice.mmCode,
					RateType5Choice.mmProprietary, SecuritiesFinancingTransactionDetails3.mmRateType, RateType8Choice.mmCode, RateType8Choice.mmProprietary, SecuritiesFinancingTransactionDetails5.mmRateType,
					SecuritiesFinancingTransactionDetails1.mmRateType, SecuritiesFinancingTransactionDetails11.mmRateType, SecuritiesFinancingTransactionDetails14.mmRateType, SecuritiesFinancingTransactionDetails4.mmRateType,
					RateType19Choice.mmCode, RateType19Choice.mmProprietary, SecuritiesFinancing10.mmRateType, RateTypeChoice.mmTextualRate, RateType4Choice.mmOther, SecuritiesFinancingTransactionDetails2.mmRateType,
					SecuritiesFinancingTransactionDetails8.mmRateType, SecuritiesFinancingTransactionDetails7.mmRateType, SecuritiesFinancingTransactionDetails19.mmRateType, SecuritiesFinancingTransactionDetails20.mmRateType,
					SecuritiesFinancingTransactionDetails6.mmRateType, SecuritiesFinancingTransactionDetails10.mmRateType, SecuritiesFinancingTransactionDetails17.mmRateType, SecuritiesFinancingTransactionDetails18.mmRateType,
					SecuritiesFinancingTransactionDetails9.mmRateType, SecuritiesFinancing1.mmRateType, SecuritiesFinancingTransactionDetails21.mmRateType, SecuritiesFinancingTransactionDetails22.mmRateType,
					SecuritiesFinancingTransactionDetails24.mmRateType, SecuritiesFinancingTransactionDetails25.mmRateType, SecuritiesFinancingTransactionDetails26.mmRateType, SecuritiesFinancingTransactionDetails28.mmRateType,
					SecuritiesFinancingTransactionDetails27.mmRateType, SecuritiesFinancingTransactionDetails29.mmRateType, RateType35Choice.mmCode, RateType35Choice.mmProprietary, RateType33Choice.mmCode, RateType33Choice.mmProprietary,
					RateType45Choice.mmCode, RateType45Choice.mmProprietary, SecuritiesFinancingTransactionDetails33.mmRateType, SecuritiesFinancingTransactionDetails32.mmRateType, SecuritiesFinancingTransactionDetails30.mmRateType,
					SecuritiesFinancingTransactionDetails34.mmRateType, RateType67Choice.mmCode, RateType67Choice.mmProprietary, SecuritiesFinancingTransactionDetails35.mmRateType, SecuritiesFinancingTransactionDetails36.mmRateType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REPT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of rate used to calculate the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod interestPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
	 * DateTimePeriod.mmRelatedInterestCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmInterestPeriod
	 * CorporateActionPeriod3.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmInterestPeriod
	 * CorporateActionPeriod6.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmInterestPeriod
	 * CorporateActionPeriod8.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest1#mmFromToDate
	 * AccountInterest1.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest1#mmFromToDate
	 * TransactionInterest1.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest2#mmFromToDate
	 * AccountInterest2.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest2#mmFromToDate
	 * TransactionInterest2.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3#mmFromToDate
	 * AccountInterest3.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRecord1#mmFromToDate
	 * InterestRecord1.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmInterestPeriod
	 * CorporateActionPeriod1.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestPeriod
	 * InterestAmount1.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestPeriod
	 * InterestAmount2.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement1#mmInterestPeriod
	 * InterestStatement1.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestPeriod
	 * InterestStatement2.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmInterestPeriod
	 * CorporateActionPeriod10.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestPeriod
	 * InterestStatement3.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestPeriod
	 * InterestStatement4.mmInterestPeriod}</li>
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
	public static final MMBusinessAssociationEnd mmInterestPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmInterestPeriod, CorporateActionPeriod6.mmInterestPeriod, CorporateActionPeriod8.mmInterestPeriod, AccountInterest1.mmFromToDate, TransactionInterest1.mmFromToDate,
					AccountInterest2.mmFromToDate, TransactionInterest2.mmFromToDate, AccountInterest3.mmFromToDate, InterestRecord1.mmFromToDate, CorporateActionPeriod1.mmInterestPeriod, InterestAmount1.mmInterestPeriod,
					InterestAmount2.mmInterestPeriod, InterestStatement1.mmInterestPeriod, InterestStatement2.mmInterestPeriod, CorporateActionPeriod10.mmInterestPeriod, InterestStatement3.mmInterestPeriod,
					InterestStatement4.mmInterestPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PercentageRate relatedIndex;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmRelatedIndex
	 * CorporateActionRate3.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmRelatedIndex
	 * CorporateActionRate14.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmRelatedIndex
	 * CorporateActionRate16.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmRelatedIndex
	 * CorporateActionRate24.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmRelatedIndex
	 * CorporateActionRate27.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmRelatedIndex
	 * CorporateActionRate32.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmRelatedIndex
	 * CorporateActionRate35.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmRelatedIndex
	 * CorporateActionRate41.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmRelatedIndex
	 * CorporateActionRate1.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmRelatedIndex
	 * CorporateActionRate43.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmRelatedIndex
	 * CorporateActionRate56.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmRelatedIndex
	 * CorporateActionRate66.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmRelatedIndex
	 * CorporateActionRate78.mmRelatedIndex}</li>
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
	public static final MMBusinessAttribute mmRelatedIndex = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate3.mmRelatedIndex, CorporateActionRate14.mmRelatedIndex, CorporateActionRate16.mmRelatedIndex, CorporateActionRate24.mmRelatedIndex, CorporateActionRate27.mmRelatedIndex,
					CorporateActionRate32.mmRelatedIndex, CorporateActionRate35.mmRelatedIndex, CorporateActionRate41.mmRelatedIndex, CorporateActionRate1.mmRelatedIndex, CorporateActionRate43.mmRelatedIndex,
					CorporateActionRate56.mmRelatedIndex, CorporateActionRate66.mmRelatedIndex, CorporateActionRate78.mmRelatedIndex);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getRelatedIndex", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime interestAccrualDate;
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmInterestAccrualDate
	 * Debt1.mmInterestAccrualDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestAccrualDate
	 * Debt2.mmInterestAccrualDate}</li>
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
	public static final MMBusinessAttribute mmInterestAccrualDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmInterestAccrualDate, Debt2.mmInterestAccrualDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getInterestAccrualDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CalculationMethodCode calculationMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmInterestCalculationMethod
	 * Debt1.mmInterestCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCalculationMethod
	 * InterestAmount1.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCalculationMethod
	 * InterestAmount2.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInterestCalculationMethod
	 * Debt2.mmInterestCalculationMethod}</li>
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
	public static final MMBusinessAttribute mmCalculationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmInterestCalculationMethod, InterestAmount1.mmCalculationMethod, InterestAmount2.mmCalculationMethod, Debt2.mmInterestCalculationMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getCalculationMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.VariableInterest> variableInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmInterestCalculation
	 * VariableInterest.mmInterestCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmVariableInterestDetails
	 * Debt1.mmVariableInterestDetails}</li>
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
	public static final MMBusinessAssociationEnd mmVariableInterest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmVariableInterestDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Specifies the parameters to be used for variable interest payments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected InterestCode interestType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#mmCode
	 * InterestType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestType1Choice#mmProprietary
	 * InterestType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest1#mmType
	 * AccountInterest1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest1#mmType
	 * TransactionInterest1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest2#mmType
	 * AccountInterest2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionInterest2#mmType
	 * TransactionInterest2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmType
	 * AccountInterest3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmInterestType
	 * Debt2.mmInterestType}</li>
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
	public static final MMBusinessAttribute mmInterestType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestType1Choice.mmCode, InterestType1Choice.mmProprietary, AccountInterest1.mmType, TransactionInterest1.mmType, AccountInterest2.mmType, TransactionInterest2.mmType,
					AccountInterest3.mmType, Debt2.mmInterestType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestType";
			definition = "Specifies the type of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getInterestType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountRange rateValidityRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
	 * AmountRange.mmRelatedInterest}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Rate1#mmValidityRange
	 * Rate1.mmValidityRange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate3#mmValidityRange
	 * Rate3.mmValidityRange}</li>
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
	public static final MMBusinessAssociationEnd mmRateValidityRange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Rate1.mmValidityRange, Rate3.mmValidityRange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateValidityRange";
			definition = "Specifies the amount range for which the interest rate is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRange.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
		}
	};
	protected InterestMethodCode interestMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestMethod
	 * InterestAmount1.mmInterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestMethod
	 * InterestResult1.mmInterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestMethod
	 * InterestAmount2.mmInterestMethod}</li>
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
	public static final MMBusinessAttribute mmInterestMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmInterestMethod, InterestResult1.mmInterestMethod, InterestAmount2.mmInterestMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getInterestMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode calculationFrequency;
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
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCalculationFrequency
	 * InterestAmount1.mmCalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCalculationFrequency
	 * InterestAmount2.mmCalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#mmUnit
	 * InterestRateContractTerm1.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm2#mmUnit
	 * InterestRateContractTerm2.mmUnit}</li>
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
	public static final MMBusinessAttribute mmCalculationFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmCalculationFrequency, InterestAmount2.mmCalculationFrequency, InterestRateContractTerm1.mmUnit, InterestRateContractTerm2.mmUnit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getCalculationFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate calculationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#mmCalculationDate
	 * InterestCalculation1.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmCalculationDate
	 * InterestCalculation2.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmCalculationDate
	 * InterestCalculation3.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmCalculationDate
	 * InterestCalculation4.mmCalculationDate}</li>
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
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestCalculation1.mmCalculationDate, InterestCalculation2.mmCalculationDate, InterestCalculation3.mmCalculationDate, InterestCalculation4.mmCalculationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the calculation date of the interest amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getCalculationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Charges> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
	 * Charges.mmRelatedInterest}</li>
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
	public static final MMBusinessAssociationEnd mmCharges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges on interest.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected Debt debtInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
	 * Debt.mmNextInterest}</li>
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
	public static final MMBusinessAssociationEnd mmDebtInstrument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtInstrument";
			definition = "Debt for which a next interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmNextInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Spread> spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
	 * Spread.mmRelatedInterest}</li>
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
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Specifies the difference between two interests.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected FrequencyCode paymentFrequency;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPaymentFrequency
	 * FinancialInstrumentAttributes8.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPaymentFrequency
	 * FinancialInstrumentAttributes20.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmPaymentFrequency
	 * FinancialInstrumentAttributes35.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmPaymentFrequency
	 * FinancialInstrumentAttributes41.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPaymentFrequency
	 * FinancialInstrumentAttributes4.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPaymentFrequency
	 * FinancialInstrumentAttributes13.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPaymentFrequency
	 * FinancialInstrumentAttributes21.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPaymentFrequency
	 * FinancialInstrumentAttributes26.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmPaymentFrequency
	 * FinancialInstrumentAttributes36.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmPaymentFrequency
	 * FinancialInstrumentAttributes42.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPaymentFrequency
	 * FinancialInstrumentAttributes27.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPaymentFrequency
	 * FinancialInstrumentAttributes14.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPaymentFrequency
	 * FinancialInstrumentAttributes30.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPaymentFrequency
	 * FinancialInstrumentAttributes28.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPaymentFrequency
	 * FinancialInstrumentStipulations.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmPaymentFrequency
	 * FinancialInstrumentAttributes31.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPaymentFrequency
	 * FinancialInstrumentStipulations2.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPaymentFrequency
	 * FinancialInstrumentAttributes44.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPaymentFrequency
	 * FinancialInstrumentAttributes15.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPaymentFrequency
	 * FinancialInstrumentAttributes29.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPaymentFrequency
	 * FinancialInstrumentAttributes2.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPaymentFrequency
	 * FinancialInstrumentAttributes63.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPaymentFrequency
	 * FinancialInstrumentAttributes64.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmPaymentFrequency
	 * FinancialInstrumentAttributes75.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmPaymentFrequency
	 * FinancialInstrumentAttributes78.mmPaymentFrequency}</li>
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
	public static final MMBusinessAttribute mmPaymentFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmPaymentFrequency, FinancialInstrumentAttributes20.mmPaymentFrequency, FinancialInstrumentAttributes35.mmPaymentFrequency,
					FinancialInstrumentAttributes41.mmPaymentFrequency, FinancialInstrumentAttributes4.mmPaymentFrequency, FinancialInstrumentAttributes13.mmPaymentFrequency, FinancialInstrumentAttributes21.mmPaymentFrequency,
					FinancialInstrumentAttributes26.mmPaymentFrequency, FinancialInstrumentAttributes36.mmPaymentFrequency, FinancialInstrumentAttributes42.mmPaymentFrequency, FinancialInstrumentAttributes27.mmPaymentFrequency,
					FinancialInstrumentAttributes14.mmPaymentFrequency, FinancialInstrumentAttributes30.mmPaymentFrequency, FinancialInstrumentAttributes28.mmPaymentFrequency, FinancialInstrumentStipulations.mmPaymentFrequency,
					FinancialInstrumentAttributes31.mmPaymentFrequency, FinancialInstrumentStipulations2.mmPaymentFrequency, FinancialInstrumentAttributes44.mmPaymentFrequency, FinancialInstrumentAttributes15.mmPaymentFrequency,
					FinancialInstrumentAttributes29.mmPaymentFrequency, FinancialInstrumentAttributes2.mmPaymentFrequency, FinancialInstrumentAttributes63.mmPaymentFrequency, FinancialInstrumentAttributes64.mmPaymentFrequency,
					FinancialInstrumentAttributes75.mmPaymentFrequency, FinancialInstrumentAttributes78.mmPaymentFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getPaymentFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestManagement relatedInterestManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterestCalculation
	 * InterestManagement.mmInterestCalculation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Interest management process which requires interest calculation.                        ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestCalculation";
				definition = "Set of parameters used to calculate an interest amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedInterestCalculation, com.tools20022.repository.entity.AmountRange.mmRelatedInterest,
						com.tools20022.repository.entity.Charges.mmRelatedInterest, com.tools20022.repository.entity.Interest.mmInterestCalculation, com.tools20022.repository.entity.Debt.mmNextInterest,
						com.tools20022.repository.entity.VariableInterest.mmInterestCalculation, com.tools20022.repository.entity.Spread.mmRelatedInterest, com.tools20022.repository.entity.InterestManagement.mmInterestCalculation);
				derivationElement_lazy = () -> Arrays.asList(TransactionInterest1.mmRate, TransactionInterest2.mmRate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestCalculation.mmDayCountBasis, com.tools20022.repository.entity.InterestCalculation.mmRate,
						com.tools20022.repository.entity.InterestCalculation.mmInterest, com.tools20022.repository.entity.InterestCalculation.mmRateType, com.tools20022.repository.entity.InterestCalculation.mmInterestPeriod,
						com.tools20022.repository.entity.InterestCalculation.mmRelatedIndex, com.tools20022.repository.entity.InterestCalculation.mmInterestAccrualDate,
						com.tools20022.repository.entity.InterestCalculation.mmCalculationMethod, com.tools20022.repository.entity.InterestCalculation.mmVariableInterest, com.tools20022.repository.entity.InterestCalculation.mmInterestType,
						com.tools20022.repository.entity.InterestCalculation.mmRateValidityRange, com.tools20022.repository.entity.InterestCalculation.mmInterestMethod,
						com.tools20022.repository.entity.InterestCalculation.mmCalculationFrequency, com.tools20022.repository.entity.InterestCalculation.mmCalculationDate, com.tools20022.repository.entity.InterestCalculation.mmCharges,
						com.tools20022.repository.entity.InterestCalculation.mmDebtInstrument, com.tools20022.repository.entity.InterestCalculation.mmSpread, com.tools20022.repository.entity.InterestCalculation.mmPaymentFrequency,
						com.tools20022.repository.entity.InterestCalculation.mmRelatedInterestManagement);
				derivationComponent_lazy = () -> Arrays.asList(InterestComputationMethodFormat1Choice.mmObject(), InterestComputationMethodFormat2Choice.mmObject(), RateType6Choice.mmObject(), RateType9Choice.mmObject(),
						RateType3Choice.mmObject(), RateType5Choice.mmObject(), Rate2.mmObject(), RateType8Choice.mmObject(), InterestComputationMethod1Choice.mmObject(), InterestComputationMethodFormat3Choice.mmObject(),
						RateType19Choice.mmObject(), InterestComputationMethod2Choice.mmObject(), InterestType1Choice.mmObject(), RateTypeChoice.mmObject(), Rate1.mmObject(), AccountInterest1.mmObject(), TransactionInterest1.mmObject(),
						RateType4Choice.mmObject(), Rate3.mmObject(), AccountInterest2.mmObject(), TransactionInterest2.mmObject(), AccountInterest3.mmObject(), TransactionInterest3.mmObject(), InterestCalculation1.mmObject(),
						InterestCalculation2.mmObject(), InterestCalculation3.mmObject(), RateType35Choice.mmObject(), InterestComputationMethodFormat4Choice.mmObject(), RateType33Choice.mmObject(), InterestCalculation4.mmObject(),
						RateType45Choice.mmObject(), InterestComputationMethodFormat5Choice.mmObject(), RateType67Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InterestCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InterestComputationMethodCode getDayCountBasis() {
		return dayCountBasis;
	}

	public InterestCalculation setDayCountBasis(InterestComputationMethodCode dayCountBasis) {
		this.dayCountBasis = Objects.requireNonNull(dayCountBasis);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public InterestCalculation setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public InterestCalculation setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public InterestRateTypeCode getRateType() {
		return rateType;
	}

	public InterestCalculation setRateType(InterestRateTypeCode rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public DateTimePeriod getInterestPeriod() {
		return interestPeriod;
	}

	public InterestCalculation setInterestPeriod(com.tools20022.repository.entity.DateTimePeriod interestPeriod) {
		this.interestPeriod = Objects.requireNonNull(interestPeriod);
		return this;
	}

	public PercentageRate getRelatedIndex() {
		return relatedIndex;
	}

	public InterestCalculation setRelatedIndex(PercentageRate relatedIndex) {
		this.relatedIndex = Objects.requireNonNull(relatedIndex);
		return this;
	}

	public ISODateTime getInterestAccrualDate() {
		return interestAccrualDate;
	}

	public InterestCalculation setInterestAccrualDate(ISODateTime interestAccrualDate) {
		this.interestAccrualDate = Objects.requireNonNull(interestAccrualDate);
		return this;
	}

	public CalculationMethodCode getCalculationMethod() {
		return calculationMethod;
	}

	public InterestCalculation setCalculationMethod(CalculationMethodCode calculationMethod) {
		this.calculationMethod = Objects.requireNonNull(calculationMethod);
		return this;
	}

	public List<VariableInterest> getVariableInterest() {
		return variableInterest == null ? variableInterest = new ArrayList<>() : variableInterest;
	}

	public InterestCalculation setVariableInterest(List<com.tools20022.repository.entity.VariableInterest> variableInterest) {
		this.variableInterest = Objects.requireNonNull(variableInterest);
		return this;
	}

	public InterestCode getInterestType() {
		return interestType;
	}

	public InterestCalculation setInterestType(InterestCode interestType) {
		this.interestType = Objects.requireNonNull(interestType);
		return this;
	}

	public AmountRange getRateValidityRange() {
		return rateValidityRange;
	}

	public InterestCalculation setRateValidityRange(com.tools20022.repository.entity.AmountRange rateValidityRange) {
		this.rateValidityRange = Objects.requireNonNull(rateValidityRange);
		return this;
	}

	public InterestMethodCode getInterestMethod() {
		return interestMethod;
	}

	public InterestCalculation setInterestMethod(InterestMethodCode interestMethod) {
		this.interestMethod = Objects.requireNonNull(interestMethod);
		return this;
	}

	public FrequencyCode getCalculationFrequency() {
		return calculationFrequency;
	}

	public InterestCalculation setCalculationFrequency(FrequencyCode calculationFrequency) {
		this.calculationFrequency = Objects.requireNonNull(calculationFrequency);
		return this;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public InterestCalculation setCalculationDate(ISODate calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}

	public List<Charges> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public InterestCalculation setCharges(List<com.tools20022.repository.entity.Charges> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public Debt getDebtInstrument() {
		return debtInstrument;
	}

	public InterestCalculation setDebtInstrument(com.tools20022.repository.entity.Debt debtInstrument) {
		this.debtInstrument = Objects.requireNonNull(debtInstrument);
		return this;
	}

	public List<Spread> getSpread() {
		return spread == null ? spread = new ArrayList<>() : spread;
	}

	public InterestCalculation setSpread(List<com.tools20022.repository.entity.Spread> spread) {
		this.spread = Objects.requireNonNull(spread);
		return this;
	}

	public FrequencyCode getPaymentFrequency() {
		return paymentFrequency;
	}

	public InterestCalculation setPaymentFrequency(FrequencyCode paymentFrequency) {
		this.paymentFrequency = Objects.requireNonNull(paymentFrequency);
		return this;
	}

	public InterestManagement getRelatedInterestManagement() {
		return relatedInterestManagement;
	}

	public InterestCalculation setRelatedInterestManagement(com.tools20022.repository.entity.InterestManagement relatedInterestManagement) {
		this.relatedInterestManagement = Objects.requireNonNull(relatedInterestManagement);
		return this;
	}
}