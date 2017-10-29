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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the estimated interest rate and the parameters used for determining
 * its value.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="VariableInterest" src="doc-files/VariableInterest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#VariableRateChangeFrequency
 * VariableInterest.VariableRateChangeFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#FixingDate
 * VariableInterest.FixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#InterestCalculation
 * VariableInterest.InterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#ReportingDate
 * VariableInterest.ReportingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#ResetDate
 * VariableInterest.ResetDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#Arrears
 * VariableInterest.Arrears}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#Index
 * VariableInterest.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#YieldCalculation
 * VariableInterest.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#BenchmarkReference
 * VariableInterest.BenchmarkReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#EstimatedInterestRate
 * VariableInterest.EstimatedInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#VariableRateValueDate
 * VariableInterest.VariableRateValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#LifeCalculation
 * VariableInterest.LifeCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#DurationCalculation
 * VariableInterest.DurationCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#RelatedVariableInterest
 * Security.RelatedVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#VariableInterest
 * InterestCalculation.VariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#VariableInterest
 * Index.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#VariableInterest
 * YieldCalculation.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#VariableInterest
 * DurationCalculation.VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#VariableInterest
 * LifeCalculation.VariableInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRate1Choice#VariableInterestRate
 * InterestRate1Choice.VariableInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRate2Choice#Floating
 * InterestRate2Choice.Floating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRate6Choice#Floating
 * InterestRate6Choice.Floating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice#Floating
 * InterestRate8Choice.Floating}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1
 * InterestChange1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VariableInterest1Rate
 * VariableInterest1Rate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingRateNote1
 * FloatingRateNote1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate4
 * FloatingInterestRate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingRateNote2
 * FloatingRateNote2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate6
 * FloatingInterestRate6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate8
 * FloatingInterestRate8}</li>
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
 * "VariableInterest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the estimated interest rate and the parameters used for determining its value."
 * </li>
 * </ul>
 */
public class VariableInterest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the frequency of change to the variable rate of an interest
	 * bearing instrument.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes8.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes20.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes35.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes41.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes4.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes13.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes21.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes26.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes36.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes42.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes27.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes14.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes30.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes28.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#VariableRateChangeFrequency
	 * InterestChange1.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes31.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes44.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes15.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes29.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes2.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes63.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes64.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes75.VariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#VariableRateChangeFrequency
	 * FinancialInstrumentAttributes78.VariableRateChangeFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateChangeFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency of change to the variable rate of an interest bearing instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariableRateChangeFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes20.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes41.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes13.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes26.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes42.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes14.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes28.VariableRateChangeFrequency,
					com.tools20022.repository.msg.InterestChange1.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes31.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes15.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes2.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes64.VariableRateChangeFrequency,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.VariableRateChangeFrequency, com.tools20022.repository.msg.FinancialInstrumentAttributes78.VariableRateChangeFrequency);
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date/time at which the rate determination is made, also called
	 * determination date, for instance the date the interest rate of a floating
	 * rate note will be/was calculated, according to the terms of the issue.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#FloatingRateFixingDate
	 * FinancialInstrumentAttributes8.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#FloatingRateFixingDate
	 * FinancialInstrumentAttributes20.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#FloatingRateFixingDate
	 * FinancialInstrumentAttributes35.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#FloatingRateFixingDate
	 * FinancialInstrumentAttributes41.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#FloatingRateFixingDate
	 * FinancialInstrumentAttributes6.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#FloatingRateFixingDate
	 * FinancialInstrumentAttributes9.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#FloatingRateFixingDate
	 * FinancialInstrumentAttributes18.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#FloatingRateFixingDate
	 * FinancialInstrumentAttributes22.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#FloatingRateFixingDate
	 * FinancialInstrumentAttributes32.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#FloatingRateFixingDate
	 * FinancialInstrumentAttributes38.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#FloatingRateFixingDate
	 * FinancialInstrumentAttributes7.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#FloatingRateFixingDate
	 * FinancialInstrumentAttributes5.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#FloatingRateFixingDate
	 * FinancialInstrumentAttributes11.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#FloatingRateFixingDate
	 * FinancialInstrumentAttributes10.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#FloatingRateFixingDate
	 * FinancialInstrumentAttributes19.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#FloatingRateFixingDate
	 * FinancialInstrumentAttributes16.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#FloatingRateFixingDate
	 * FinancialInstrumentAttributes23.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#FloatingRateFixingDate
	 * FinancialInstrumentAttributes24.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#FloatingRateFixingDate
	 * FinancialInstrumentAttributes33.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#FloatingRateFixingDate
	 * FinancialInstrumentAttributes34.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#FloatingRateFixingDate
	 * FinancialInstrumentAttributes39.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#FloatingRateFixingDate
	 * FinancialInstrumentAttributes40.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#FloatingRateFixingDate
	 * FinancialInstrumentAttributes43.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#FloatingRateFixingDate
	 * FinancialInstrumentAttributes45.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#FloatingRateFixingDate
	 * FinancialInstrumentAttributes4.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#FloatingRateFixingDate
	 * FinancialInstrumentAttributes13.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#FloatingRateFixingDate
	 * FinancialInstrumentAttributes21.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#FloatingRateFixingDate
	 * FinancialInstrumentAttributes26.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#FloatingRateFixingDate
	 * FinancialInstrumentAttributes36.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#FloatingRateFixingDate
	 * FinancialInstrumentAttributes42.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#FloatingRateFixingDate
	 * FinancialInstrumentAttributes27.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#FloatingRateFixingDate
	 * FinancialInstrumentAttributes14.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#FloatingRateFixingDate
	 * FinancialInstrumentAttributes30.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#FloatingRateFixingDate
	 * FinancialInstrumentAttributes28.FloatingRateFixingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1#FixingDate
	 * InterestChange1.FixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#FloatingRateFixingDate
	 * FinancialInstrumentAttributes31.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#FloatingRateFixingDate
	 * FinancialInstrumentAttributes44.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#FloatingRateFixingDate
	 * FinancialInstrumentAttributes15.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#FloatingRateFixingDate
	 * FinancialInstrumentAttributes29.FloatingRateFixingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#InterestFixingDate
	 * Debt2.InterestFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#FloatingRateFixingDate
	 * FinancialInstrumentAttributes48.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#FloatingRateFixingDate
	 * FinancialInstrumentAttributes50.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#FloatingRateFixingDate
	 * FinancialInstrumentAttributes49.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#FloatingRateFixingDate
	 * FinancialInstrumentAttributes55.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#FloatingRateFixingDate
	 * FinancialInstrumentAttributes57.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#FloatingRateFixingDate
	 * FinancialInstrumentAttributes56.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#FloatingRateFixingDate
	 * FinancialInstrumentAttributes63.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#FloatingRateFixingDate
	 * FinancialInstrumentAttributes64.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#FloatingRateFixingDate
	 * FinancialInstrumentAttributes66.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#FloatingRateFixingDate
	 * FinancialInstrumentAttributes65.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#FloatingRateFixingDate
	 * FinancialInstrumentAttributes67.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#FloatingRateFixingDate
	 * FinancialInstrumentAttributes70.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#FloatingRateFixingDate
	 * FinancialInstrumentAttributes69.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#FloatingRateFixingDate
	 * FinancialInstrumentAttributes71.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#FloatingRateFixingDate
	 * FinancialInstrumentAttributes75.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#FloatingRateFixingDate
	 * FinancialInstrumentAttributes78.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#FloatingRateFixingDate
	 * FinancialInstrumentAttributes79.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#FloatingRateFixingDate
	 * FinancialInstrumentAttributes81.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#FloatingRateFixingDate
	 * FinancialInstrumentAttributes80.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#FloatingRateFixingDate
	 * FinancialInstrumentAttributes85.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#FloatingRateFixingDate
	 * FinancialInstrumentAttributes84.FloatingRateFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#FloatingRateFixingDate
	 * FinancialInstrumentAttributes83.FloatingRateFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the rate determination is made, also called determination date, for instance the date the interest rate of a floating rate note will be/was calculated, according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes5.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes24.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes45.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.FloatingRateFixingDate,
					com.tools20022.repository.msg.InterestChange1.FixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes31.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes15.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.FloatingRateFixingDate, com.tools20022.repository.msg.Debt2.InterestFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes50.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes55.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes57.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes56.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes64.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes65.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes70.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes71.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes78.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes85.FloatingRateFixingDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes84.FloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes83.FloatingRateFixingDate);
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date, for instance the date the interest rate of a floating rate note will be/was calculated, according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Interest calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#VariableInterest
	 * InterestCalculation.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Interest calculation for which a variable interest is used.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Last date the new interest rate must be reported to the market.
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#ReportingDate
	 * InterestChange1.ReportingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date the new interest rate must be reported to the market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReportingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.ReportingDate);
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingDate";
			definition = "Last date the new interest rate must be reported to the market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the interest rate of an interest bearing instrument
	 * will be reset, according to the terms of the issue.
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
	 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1#ResetDate
	 * InterestChange1.ResetDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ResetDate
	 * FinancialInstrumentAttributes2.ResetDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResetDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the interest rate of an interest bearing instrument will be reset, according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResetDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.ResetDate, com.tools20022.repository.msg.FinancialInstrumentAttributes2.ResetDate);
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResetDate";
			definition = "Date/time at which the interest rate of an interest bearing instrument will be reset, according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates that the rate reset will occur at the end of the payment period
	 * (True case)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1#Arriers
	 * InterestChange1.Arriers}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Arrears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the rate reset will occur at the end of the payment period (True case)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Arrears = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.Arriers);
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Arrears";
			definition = "Indicates that the rate reset will occur at the end of the payment period (True case)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Identifies the index used for calculating the interest
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#VariableInterest
	 * Index.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the index used for calculating the interest"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Identifies the index used for calculating the interest";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Yield calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#VariableInterest
	 * YieldCalculation.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a variable interest is used.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Benchmark rate against which variable rate instruments are measured to
	 * determine the interest rate, for example, LIBOR.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#RelatedVariableInterest
	 * Security.RelatedVariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Benchmark rate against which variable rate instruments are measured to determine the interest rate, for example, LIBOR."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BenchmarkReference = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkReference";
			definition = "Benchmark rate against which variable rate instruments are measured to determine the interest rate, for example, LIBOR.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RelatedVariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Estimated per annum ratio of interest paid to the principal amount of the
	 * financial instrument for a specific period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EstimatedInterestRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstimatedInterestRate";
			definition = "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time as of which the variable rate is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time as of which the variable rate is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariableRateValueDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateValueDate";
			definition = "Date/time as of which the variable rate is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Lfe calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#VariableInterest
	 * LifeCalculation.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LifeCalculation
	 * LifeCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lfe calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LifeCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Lfe calculation for which a variable interest is used.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Duration calculation for which a variable interest is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#VariableInterest
	 * DurationCalculation.VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate6#Term
	 * FloatingInterestRate6.Term}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate8#Term
	 * FloatingInterestRate8.Term}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Duration calculation for which a variable interest is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DurationCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate6.Term, com.tools20022.repository.msg.FloatingInterestRate8.Term);
			elementContext_lazy = () -> VariableInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Duration calculation for which a variable interest is used.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VariableInterest";
				definition = "Specifies the estimated interest rate and the parameters used for determining its value.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RelatedVariableInterest, com.tools20022.repository.entity.InterestCalculation.VariableInterest,
						com.tools20022.repository.entity.Index.VariableInterest, com.tools20022.repository.entity.YieldCalculation.VariableInterest, com.tools20022.repository.entity.DurationCalculation.VariableInterest,
						com.tools20022.repository.entity.LifeCalculation.VariableInterest);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestRate1Choice.VariableInterestRate, com.tools20022.repository.choice.InterestRate2Choice.Floating,
						com.tools20022.repository.choice.InterestRate6Choice.Floating, com.tools20022.repository.choice.InterestRate8Choice.Floating);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VariableInterest.VariableRateChangeFrequency, com.tools20022.repository.entity.VariableInterest.FixingDate,
						com.tools20022.repository.entity.VariableInterest.InterestCalculation, com.tools20022.repository.entity.VariableInterest.ReportingDate, com.tools20022.repository.entity.VariableInterest.ResetDate,
						com.tools20022.repository.entity.VariableInterest.Arrears, com.tools20022.repository.entity.VariableInterest.Index, com.tools20022.repository.entity.VariableInterest.YieldCalculation,
						com.tools20022.repository.entity.VariableInterest.BenchmarkReference, com.tools20022.repository.entity.VariableInterest.EstimatedInterestRate, com.tools20022.repository.entity.VariableInterest.VariableRateValueDate,
						com.tools20022.repository.entity.VariableInterest.LifeCalculation, com.tools20022.repository.entity.VariableInterest.DurationCalculation);
				derivationComponent_lazy = () -> Arrays.asList(InterestChange1.mmObject(), VariableInterest1Rate.mmObject(), FloatingRateNote1.mmObject(), FloatingInterestRate4.mmObject(), FloatingRateNote2.mmObject(),
						FloatingInterestRate6.mmObject(), FloatingInterestRate8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}