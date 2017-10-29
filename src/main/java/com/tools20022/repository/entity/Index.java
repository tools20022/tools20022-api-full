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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.CreditDefaultSwapDerivative3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the index.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Index" src="doc-files/Index.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexRateBasis
 * Index.IndexRateBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexFactor
 * Index.IndexFactor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexPoints
 * Index.IndexPoints}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexFixingDate
 * Index.IndexFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#Identification
 * Index.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#ReferenceSource
 * Index.ReferenceSource}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexRateCurrency
 * Index.IndexRateCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexRateFrequency
 * Index.IndexRateFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexRateMultiplier
 * Index.IndexRateMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#Spread Index.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#PortfolioBenchmark
 * Index.PortfolioBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#VariableInterest
 * Index.VariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#SecuritiesPricing
 * Index.SecuritiesPricing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Index
 * SecuritiesPricing.Index}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#Index
 * VariableInterest.Index}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Index
 * RateAndAmount.Index}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#Index Spread.Index}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioBenchmark#Index
 * PortfolioBenchmark.Index}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate4#Term
 * FloatingInterestRate4.Term}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#Index
 * CreditDefaultSwapDerivative3.Index}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3
 * CreditDefaultSwapDerivative3}</li>
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
 * "Index"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the index."</li>
 * </ul>
 */
public class Index {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reference rate.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#IndexRateBasis
	 * FinancialInstrumentAttributes8.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#IndexRateBasis
	 * FinancialInstrumentAttributes20.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#IndexRateBasis
	 * FinancialInstrumentAttributes35.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#IndexRateBasis
	 * FinancialInstrumentAttributes41.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#IndexRateBasis
	 * FinancialInstrumentAttributes4.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#IndexRateBasis
	 * FinancialInstrumentAttributes13.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#IndexRateBasis
	 * FinancialInstrumentAttributes21.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#IndexRateBasis
	 * FinancialInstrumentAttributes26.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#IndexRateBasis
	 * FinancialInstrumentAttributes36.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#IndexRateBasis
	 * FinancialInstrumentAttributes42.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#IndexRateBasis
	 * FinancialInstrumentAttributes27.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#IndexRateBasis
	 * FinancialInstrumentAttributes14.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#IndexRateBasis
	 * FinancialInstrumentAttributes30.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#IndexRateBasis
	 * FinancialInstrumentAttributes28.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#IndexRateBasis
	 * InterestChange1.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#IndexRateBasis
	 * FinancialInstrumentAttributes31.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#IndexRateBasis
	 * FinancialInstrumentAttributes44.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#IndexRateBasis
	 * FinancialInstrumentAttributes15.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#IndexRateBasis
	 * FinancialInstrumentAttributes29.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#IndexRateBasis
	 * FinancialInstrumentAttributes2.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#IndexRateBasis
	 * FinancialInstrumentAttributes63.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#IndexRateBasis
	 * FinancialInstrumentAttributes64.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#IndexRateBasis
	 * FinancialInstrumentAttributes75.IndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#IndexRateBasis
	 * FinancialInstrumentAttributes78.IndexRateBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reference rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndexRateBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes20.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes41.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes13.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes26.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes42.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes14.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes28.IndexRateBasis, com.tools20022.repository.msg.InterestChange1.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes44.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes29.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes63.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.IndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes75.IndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.IndexRateBasis);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Index rate applied to the amount paid to adjust it for instance to
	 * inflation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#Index
	 * RateAndAmount.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#IndexFactor
	 * CorporateActionRate4.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#IndexFactor
	 * CorporateActionRate10.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#IndexFactor
	 * CorporateActionRate20.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#IndexFactor
	 * CorporateActionRate22.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#IndexFactor
	 * CorporateActionRate26.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#IndexFactor
	 * CorporateActionRate31.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#IndexFactor
	 * CorporateActionRate38.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#IndexFactor
	 * CorporateActionRate39.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#IndexFactor
	 * CorporateActionRate5.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#IndexFactor
	 * CorporateActionRate12.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#IndexFactor
	 * CorporateActionRate15.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#IndexFactor
	 * CorporateActionRate18.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#IndexFactor
	 * CorporateActionRate25.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#IndexFactor
	 * CorporateActionRate30.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#IndexFactor
	 * CorporateActionRate37.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#IndexFactor
	 * CorporateActionRate40.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#IndexFactor
	 * CorporateActionRate36.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#IndexFactor
	 * CorporateActionRate42.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#IndexFactor
	 * CorporateActionRate2.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#IndexFactor
	 * CorporateActionRate46.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#IndexFactor
	 * CorporateActionRate45.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#IndexFactor
	 * CorporateActionRate44.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#IndexFactor
	 * CorporateActionRate60.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#IndexFactor
	 * CorporateActionRate64.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#IndexFactor
	 * CorporateActionRate57.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#IndexFactor
	 * CorporateActionRate68.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#IndexFactor
	 * CorporateActionRate70.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#IndexFactor
	 * CorporateActionRate67.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#IndexFactor
	 * CorporateActionRate74.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#IndexFactor
	 * CorporateActionRate79.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#IndexFactor
	 * CorporateActionRate76.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#IndexFactor
	 * CorporateActionRate82.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#IndexFactor
	 * CorporateActionRate80.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#IndexFactor
	 * CorporateActionRate81.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#IndexFactor
	 * CorporateActionRate83.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#IndexFactor
	 * CorporateActionRate84.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#IndexFactor
	 * CorporateActionRate85.IndexFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index rate applied to the amount paid to adjust it for instance to inflation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IndexFactor = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.IndexFactor, com.tools20022.repository.msg.CorporateActionRate10.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate20.IndexFactor, com.tools20022.repository.msg.CorporateActionRate22.IndexFactor, com.tools20022.repository.msg.CorporateActionRate26.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate31.IndexFactor, com.tools20022.repository.msg.CorporateActionRate38.IndexFactor, com.tools20022.repository.msg.CorporateActionRate39.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate5.IndexFactor, com.tools20022.repository.msg.CorporateActionRate12.IndexFactor, com.tools20022.repository.msg.CorporateActionRate15.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate18.IndexFactor, com.tools20022.repository.msg.CorporateActionRate25.IndexFactor, com.tools20022.repository.msg.CorporateActionRate30.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate37.IndexFactor, com.tools20022.repository.msg.CorporateActionRate40.IndexFactor, com.tools20022.repository.msg.CorporateActionRate36.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate42.IndexFactor, com.tools20022.repository.msg.CorporateActionRate2.IndexFactor, com.tools20022.repository.msg.CorporateActionRate46.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate45.IndexFactor, com.tools20022.repository.msg.CorporateActionRate44.IndexFactor, com.tools20022.repository.msg.CorporateActionRate60.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate64.IndexFactor, com.tools20022.repository.msg.CorporateActionRate57.IndexFactor, com.tools20022.repository.msg.CorporateActionRate68.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate70.IndexFactor, com.tools20022.repository.msg.CorporateActionRate67.IndexFactor, com.tools20022.repository.msg.CorporateActionRate74.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate79.IndexFactor, com.tools20022.repository.msg.CorporateActionRate76.IndexFactor, com.tools20022.repository.msg.CorporateActionRate82.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate80.IndexFactor, com.tools20022.repository.msg.CorporateActionRate81.IndexFactor, com.tools20022.repository.msg.CorporateActionRate83.IndexFactor,
					com.tools20022.repository.msg.CorporateActionRate84.IndexFactor, com.tools20022.repository.msg.CorporateActionRate85.IndexFactor);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexFactor";
			definition = "Index rate applied to the amount paid to adjust it for instance to inflation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of points above the index used to calculate a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice#IndexPoints
	 * PriceFormat6Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat12Choice#IndexPoints
	 * PriceFormat12Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat8Choice#IndexPoints
	 * PriceFormat8Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat16Choice#IndexPoints
	 * PriceFormat16Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat23Choice#IndexPoints
	 * PriceFormat23Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#IndexPoints
	 * PriceFormat27Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#IndexPoints
	 * PriceFormat4Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#IndexPoints
	 * PriceFormat33Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat19Choice#IndexPoints
	 * RateAndAmountFormat19Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#IndexPoints
	 * PriceFormat32Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#IndexPoints
	 * PriceFormat34Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#IndexPoints
	 * PriceFormat43Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat28Choice#IndexPoints
	 * RateAndAmountFormat28Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#IndexPoints
	 * PriceFormat40Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#IndexPoints
	 * PriceFormat39Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#BasisPoints
	 * SecuritiesTransactionPrice2Choice.BasisPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#IndexPoints
	 * PriceFormat48Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat51Choice#IndexPoints
	 * PriceFormat51Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#IndexPoints
	 * PriceFormat49Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#IndexPoints
	 * PriceFormat47Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat44Choice#IndexPoints
	 * PriceFormat44Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat38Choice#IndexPoints
	 * RateAndAmountFormat38Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat50Choice#IndexPoints
	 * RateAndAmountFormat50Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#IndexPoints
	 * PriceFormat56Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat59Choice#IndexPoints
	 * PriceFormat59Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat55Choice#IndexPoints
	 * PriceFormat55Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#IndexPoints
	 * PriceFormat53Choice.IndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#IndexPoints
	 * PriceFormat60Choice.IndexPoints}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of points above the index used to calculate a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndexPoints = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat6Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat12Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat8Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat16Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat23Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat27Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat4Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat33Choice.IndexPoints,
					com.tools20022.repository.choice.RateAndAmountFormat19Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat32Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat34Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat43Choice.IndexPoints, com.tools20022.repository.choice.RateAndAmountFormat28Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat40Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat39Choice.IndexPoints, com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.BasisPoints, com.tools20022.repository.choice.PriceFormat48Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat51Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat49Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat47Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat44Choice.IndexPoints, com.tools20022.repository.choice.RateAndAmountFormat38Choice.IndexPoints, com.tools20022.repository.choice.RateAndAmountFormat50Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat56Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat59Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat55Choice.IndexPoints,
					com.tools20022.repository.choice.PriceFormat53Choice.IndexPoints, com.tools20022.repository.choice.PriceFormat60Choice.IndexPoints);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexPoints";
			definition = "Number of points above the index used to calculate a price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Date/time at which an index rate will be determined .
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#IndexFixingDate
	 * CorporateActionDate1.IndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#IndexFixingDate
	 * CorporateActionDate13.IndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#IndexFixingDate
	 * CorporateActionDate14.IndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#IndexFixingDate
	 * CorporateActionDate21.IndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#IndexFixingDate
	 * CorporateActionDate2.IndexFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which an index rate will be determined ."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndexFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.IndexFixingDate, com.tools20022.repository.msg.CorporateActionDate13.IndexFixingDate,
					com.tools20022.repository.msg.CorporateActionDate14.IndexFixingDate, com.tools20022.repository.msg.CorporateActionDate21.IndexFixingDate, com.tools20022.repository.msg.CorporateActionDate2.IndexFixingDate);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexFixingDate";
			definition = "Date/time at which an index rate will be determined .";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies the index by a name for instance LIBOR.
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
	 * {@linkplain com.tools20022.repository.msg.Identification2#IndexIdentification
	 * Identification2.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#IndexIdentification
	 * IdentificationReference8Choice.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#IndexIdentification
	 * IdentificationReference11Choice.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#IndexIdentification
	 * Identification7.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#IndexIdentification
	 * Identification6.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariableInterest1Rate#Index
	 * VariableInterest1Rate.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#IndexIdentification
	 * Identification5.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#IndexIdentification
	 * Identification8.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#IndexIdentification
	 * Identification11.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#IndexIdentification
	 * Identification13.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#IndexIdentification
	 * Identification9.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#IndexIdentification
	 * Identification3.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote1#ReferenceRateIndex
	 * FloatingRateNote1.ReferenceRateIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#ReferenceRate
	 * FloatingInterestRate4.ReferenceRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#IndexIdentification
	 * Identification15.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#IndexIdentification
	 * Identification24.IndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote2#ReferenceRateIndex
	 * FloatingRateNote2.ReferenceRateIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#ReferenceRate
	 * FloatingInterestRate6.ReferenceRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate8#ReferenceRate
	 * FloatingInterestRate8.ReferenceRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#UnderlyingIndexIdentification
	 * CreditDefaultSwapDerivative3.UnderlyingIndexIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the index by a name for instance LIBOR."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification2.IndexIdentification, com.tools20022.repository.choice.IdentificationReference8Choice.IndexIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.IndexIdentification, com.tools20022.repository.msg.Identification7.IndexIdentification, com.tools20022.repository.msg.Identification6.IndexIdentification,
					com.tools20022.repository.msg.VariableInterest1Rate.Index, com.tools20022.repository.msg.Identification5.IndexIdentification, com.tools20022.repository.msg.Identification8.IndexIdentification,
					com.tools20022.repository.msg.Identification11.IndexIdentification, com.tools20022.repository.msg.Identification13.IndexIdentification, com.tools20022.repository.msg.Identification9.IndexIdentification,
					com.tools20022.repository.msg.Identification3.IndexIdentification, com.tools20022.repository.msg.FloatingRateNote1.ReferenceRateIndex, com.tools20022.repository.msg.FloatingInterestRate4.ReferenceRate,
					com.tools20022.repository.msg.Identification15.IndexIdentification, com.tools20022.repository.msg.Identification24.IndexIdentification, com.tools20022.repository.msg.FloatingRateNote2.ReferenceRateIndex,
					com.tools20022.repository.msg.FloatingInterestRate6.ReferenceRate, com.tools20022.repository.msg.FloatingInterestRate8.ReferenceRate,
					com.tools20022.repository.msg.CreditDefaultSwapDerivative3.UnderlyingIndexIdentification);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the index by a name for instance LIBOR.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies the reference source. The source can be the fixing agent or a
	 * system.
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#RateResetSource
	 * InterestChange1.RateResetSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#IndexName
	 * CreditDefaultSwapDerivative3.IndexName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reference source. The source can be the fixing agent or a system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReferenceSource = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.RateResetSource, com.tools20022.repository.msg.CreditDefaultSwapDerivative3.IndexName);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceSource";
			definition = "Identifies the reference source. The source can be the fixing agent or a system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the currency of the reference rate for fixed income instruments
	 * where the price of the instrument is indexed to the price of an
	 * underlying benchmark.
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#IndexRateCurrency
	 * InterestChange1.IndexRateCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndexRateCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.IndexRateCurrency);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateCurrency";
			definition = "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Frequency at which the index changes.
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#IndexRateFrequency
	 * InterestChange1.IndexRateFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the index changes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndexRateFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.IndexRateFrequency);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateFrequency";
			definition = "Frequency at which the index changes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Multiplier for the variable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#IndexRateMultiplier
	 * InterestChange1.IndexRateMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#Value
	 * InterestRateContractTerm1.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm2#Value
	 * InterestRateContractTerm2.Value}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multiplier for the variable rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndexRateMultiplier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.IndexRateMultiplier, com.tools20022.repository.msg.InterestRateContractTerm1.Value,
					com.tools20022.repository.msg.InterestRateContractTerm2.Value);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateMultiplier";
			definition = "Multiplier for the variable rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Percentage to be added to or deducted from the index rate to calculate
	 * the effective rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Spread#Index
	 * Spread.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage to be added to or deducted from the index rate to calculate the effective rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Percentage to be added to or deducted from the index rate to calculate the effective rate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Portfolio benchmark which uses an index for decomposition,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#Index
	 * PortfolioBenchmark.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioBenchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio benchmark which uses an index for decomposition,"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PortfolioBenchmark = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PortfolioBenchmark";
			definition = "Portfolio benchmark which uses an index for decomposition,";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Variable interest which uises the index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#Index
	 * VariableInterest.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable interest which uises the index."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariableInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest which uises the index.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Pricing which uses an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Index
	 * SecuritiesPricing.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing which uses an index."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses an index.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Index";
				definition = "Identifies the index.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.Index, com.tools20022.repository.entity.VariableInterest.Index, com.tools20022.repository.entity.RateAndAmount.Index,
						com.tools20022.repository.entity.Spread.Index, com.tools20022.repository.entity.PortfolioBenchmark.Index);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate4.Term, com.tools20022.repository.msg.CreditDefaultSwapDerivative3.Index);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Index.IndexRateBasis, com.tools20022.repository.entity.Index.IndexFactor, com.tools20022.repository.entity.Index.IndexPoints,
						com.tools20022.repository.entity.Index.IndexFixingDate, com.tools20022.repository.entity.Index.Identification, com.tools20022.repository.entity.Index.ReferenceSource,
						com.tools20022.repository.entity.Index.IndexRateCurrency, com.tools20022.repository.entity.Index.IndexRateFrequency, com.tools20022.repository.entity.Index.IndexRateMultiplier,
						com.tools20022.repository.entity.Index.Spread, com.tools20022.repository.entity.Index.PortfolioBenchmark, com.tools20022.repository.entity.Index.VariableInterest,
						com.tools20022.repository.entity.Index.SecuritiesPricing);
				derivationComponent_lazy = () -> Arrays.asList(CreditDefaultSwapDerivative3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}