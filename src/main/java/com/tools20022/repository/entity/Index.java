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
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateBasis
 * Index.mmIndexRateBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
 * Index.mmIndexFactor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexPoints
 * Index.mmIndexPoints}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexFixingDate
 * Index.mmIndexFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIdentification
 * Index.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmReferenceSource
 * Index.mmReferenceSource}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateCurrency
 * Index.mmIndexRateCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateFrequency
 * Index.mmIndexRateFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexRateMultiplier
 * Index.mmIndexRateMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSpread
 * Index.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmPortfolioBenchmark
 * Index.mmPortfolioBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmVariableInterest
 * Index.mmVariableInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
 * Index.mmSecuritiesPricing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
 * SecuritiesPricing.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariableInterest#mmIndex
 * VariableInterest.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmIndex
 * RateAndAmount.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmIndex
 * Spread.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmIndex
 * PortfolioBenchmark.mmIndex}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmTerm
 * FloatingInterestRate4.mmTerm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#mmIndex
 * CreditDefaultSwapDerivative3.mmIndex}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected PercentageRate indexRateBasis;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmIndexRateBasis
	 * FinancialInstrumentAttributes8.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmIndexRateBasis
	 * FinancialInstrumentAttributes20.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmIndexRateBasis
	 * FinancialInstrumentAttributes35.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmIndexRateBasis
	 * FinancialInstrumentAttributes41.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmIndexRateBasis
	 * FinancialInstrumentAttributes4.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmIndexRateBasis
	 * FinancialInstrumentAttributes13.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmIndexRateBasis
	 * FinancialInstrumentAttributes21.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmIndexRateBasis
	 * FinancialInstrumentAttributes26.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmIndexRateBasis
	 * FinancialInstrumentAttributes36.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmIndexRateBasis
	 * FinancialInstrumentAttributes42.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmIndexRateBasis
	 * FinancialInstrumentAttributes27.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmIndexRateBasis
	 * FinancialInstrumentAttributes14.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmIndexRateBasis
	 * FinancialInstrumentAttributes30.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmIndexRateBasis
	 * FinancialInstrumentAttributes28.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateBasis
	 * InterestChange1.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmIndexRateBasis
	 * FinancialInstrumentAttributes31.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmIndexRateBasis
	 * FinancialInstrumentAttributes44.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmIndexRateBasis
	 * FinancialInstrumentAttributes15.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmIndexRateBasis
	 * FinancialInstrumentAttributes29.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmIndexRateBasis
	 * FinancialInstrumentAttributes2.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmIndexRateBasis
	 * FinancialInstrumentAttributes63.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmIndexRateBasis
	 * FinancialInstrumentAttributes64.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmIndexRateBasis
	 * FinancialInstrumentAttributes75.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmIndexRateBasis
	 * FinancialInstrumentAttributes78.mmIndexRateBasis}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIndexRateBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes20.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes41.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes13.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes26.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes42.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes14.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes28.mmIndexRateBasis,
					com.tools20022.repository.msg.InterestChange1.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes31.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes15.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes2.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes64.mmIndexRateBasis,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.mmIndexRateBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes78.mmIndexRateBasis);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RateAndAmount indexFactor;
	/**
	 * Index rate applied to the amount paid to adjust it for instance to
	 * inflation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmIndex
	 * RateAndAmount.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmIndexFactor
	 * CorporateActionRate4.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmIndexFactor
	 * CorporateActionRate10.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmIndexFactor
	 * CorporateActionRate20.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmIndexFactor
	 * CorporateActionRate22.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmIndexFactor
	 * CorporateActionRate26.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmIndexFactor
	 * CorporateActionRate31.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmIndexFactor
	 * CorporateActionRate38.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmIndexFactor
	 * CorporateActionRate39.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmIndexFactor
	 * CorporateActionRate5.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmIndexFactor
	 * CorporateActionRate12.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmIndexFactor
	 * CorporateActionRate15.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmIndexFactor
	 * CorporateActionRate18.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmIndexFactor
	 * CorporateActionRate25.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmIndexFactor
	 * CorporateActionRate30.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmIndexFactor
	 * CorporateActionRate37.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmIndexFactor
	 * CorporateActionRate40.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmIndexFactor
	 * CorporateActionRate36.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmIndexFactor
	 * CorporateActionRate42.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmIndexFactor
	 * CorporateActionRate2.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmIndexFactor
	 * CorporateActionRate46.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmIndexFactor
	 * CorporateActionRate45.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmIndexFactor
	 * CorporateActionRate44.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmIndexFactor
	 * CorporateActionRate60.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmIndexFactor
	 * CorporateActionRate64.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmIndexFactor
	 * CorporateActionRate57.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmIndexFactor
	 * CorporateActionRate68.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmIndexFactor
	 * CorporateActionRate70.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmIndexFactor
	 * CorporateActionRate67.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmIndexFactor
	 * CorporateActionRate74.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmIndexFactor
	 * CorporateActionRate79.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmIndexFactor
	 * CorporateActionRate76.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmIndexFactor
	 * CorporateActionRate82.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmIndexFactor
	 * CorporateActionRate80.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmIndexFactor
	 * CorporateActionRate81.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmIndexFactor
	 * CorporateActionRate83.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmIndexFactor
	 * CorporateActionRate84.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmIndexFactor
	 * CorporateActionRate85.mmIndexFactor}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmIndexFactor = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate10.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate20.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate22.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate26.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate31.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate38.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate39.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate5.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate12.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate15.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate18.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate25.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate30.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate37.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate40.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate36.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate42.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate2.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate46.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate45.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate44.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate60.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate64.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate57.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate68.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate70.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate67.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate74.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate79.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate76.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate82.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate80.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate81.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate83.mmIndexFactor,
					com.tools20022.repository.msg.CorporateActionRate84.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate85.mmIndexFactor);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexFactor";
			definition = "Index rate applied to the amount paid to adjust it for instance to inflation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmIndex;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected DecimalNumber indexPoints;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice#mmIndexPoints
	 * PriceFormat6Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat12Choice#mmIndexPoints
	 * PriceFormat12Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat8Choice#mmIndexPoints
	 * PriceFormat8Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat16Choice#mmIndexPoints
	 * PriceFormat16Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat23Choice#mmIndexPoints
	 * PriceFormat23Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#mmIndexPoints
	 * PriceFormat27Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmIndexPoints
	 * PriceFormat4Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#mmIndexPoints
	 * PriceFormat33Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat19Choice#mmIndexPoints
	 * RateAndAmountFormat19Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#mmIndexPoints
	 * PriceFormat32Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmIndexPoints
	 * PriceFormat34Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#mmIndexPoints
	 * PriceFormat43Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat28Choice#mmIndexPoints
	 * RateAndAmountFormat28Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#mmIndexPoints
	 * PriceFormat40Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#mmIndexPoints
	 * PriceFormat39Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmBasisPoints
	 * SecuritiesTransactionPrice2Choice.mmBasisPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmIndexPoints
	 * PriceFormat48Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat51Choice#mmIndexPoints
	 * PriceFormat51Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmIndexPoints
	 * PriceFormat49Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmIndexPoints
	 * PriceFormat47Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat44Choice#mmIndexPoints
	 * PriceFormat44Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat38Choice#mmIndexPoints
	 * RateAndAmountFormat38Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat50Choice#mmIndexPoints
	 * RateAndAmountFormat50Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#mmIndexPoints
	 * PriceFormat56Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat59Choice#mmIndexPoints
	 * PriceFormat59Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat55Choice#mmIndexPoints
	 * PriceFormat55Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmIndexPoints
	 * PriceFormat53Choice.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#mmIndexPoints
	 * PriceFormat60Choice.mmIndexPoints}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIndexPoints = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat6Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat12Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat8Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat16Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat23Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat27Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat4Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat33Choice.mmIndexPoints,
					com.tools20022.repository.choice.RateAndAmountFormat19Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat32Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat34Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat43Choice.mmIndexPoints, com.tools20022.repository.choice.RateAndAmountFormat28Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat40Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat39Choice.mmIndexPoints, com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmBasisPoints, com.tools20022.repository.choice.PriceFormat48Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat51Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat49Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat47Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat44Choice.mmIndexPoints, com.tools20022.repository.choice.RateAndAmountFormat38Choice.mmIndexPoints, com.tools20022.repository.choice.RateAndAmountFormat50Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat56Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat59Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat55Choice.mmIndexPoints,
					com.tools20022.repository.choice.PriceFormat53Choice.mmIndexPoints, com.tools20022.repository.choice.PriceFormat60Choice.mmIndexPoints);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexPoints";
			definition = "Number of points above the index used to calculate a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected ISODateTime indexFixingDate;
	/**
	 * Date/time at which an index rate will be determined .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmIndexFixingDate
	 * CorporateActionDate1.mmIndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmIndexFixingDate
	 * CorporateActionDate13.mmIndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmIndexFixingDate
	 * CorporateActionDate14.mmIndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmIndexFixingDate
	 * CorporateActionDate21.mmIndexFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmIndexFixingDate
	 * CorporateActionDate2.mmIndexFixingDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIndexFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmIndexFixingDate, com.tools20022.repository.msg.CorporateActionDate13.mmIndexFixingDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmIndexFixingDate, com.tools20022.repository.msg.CorporateActionDate21.mmIndexFixingDate, com.tools20022.repository.msg.CorporateActionDate2.mmIndexFixingDate);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexFixingDate";
			definition = "Date/time at which an index rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Identifies the index by a name for instance LIBOR.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmIndexIdentification
	 * Identification2.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmIndexIdentification
	 * IdentificationReference8Choice.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmIndexIdentification
	 * IdentificationReference11Choice.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmIndexIdentification
	 * Identification7.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmIndexIdentification
	 * Identification6.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariableInterest1Rate#mmIndex
	 * VariableInterest1Rate.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmIndexIdentification
	 * Identification5.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmIndexIdentification
	 * Identification8.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmIndexIdentification
	 * Identification11.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmIndexIdentification
	 * Identification13.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmIndexIdentification
	 * Identification9.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmIndexIdentification
	 * Identification3.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote1#mmReferenceRateIndex
	 * FloatingRateNote1.mmReferenceRateIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmReferenceRate
	 * FloatingInterestRate4.mmReferenceRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmIndexIdentification
	 * Identification15.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmIndexIdentification
	 * Identification24.mmIndexIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote2#mmReferenceRateIndex
	 * FloatingRateNote2.mmReferenceRateIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmReferenceRate
	 * FloatingInterestRate6.mmReferenceRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate8#mmReferenceRate
	 * FloatingInterestRate8.mmReferenceRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#mmUnderlyingIndexIdentification
	 * CreditDefaultSwapDerivative3.mmUnderlyingIndexIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification2.mmIndexIdentification, com.tools20022.repository.choice.IdentificationReference8Choice.mmIndexIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.mmIndexIdentification, com.tools20022.repository.msg.Identification7.mmIndexIdentification,
					com.tools20022.repository.msg.Identification6.mmIndexIdentification, com.tools20022.repository.msg.VariableInterest1Rate.mmIndex, com.tools20022.repository.msg.Identification5.mmIndexIdentification,
					com.tools20022.repository.msg.Identification8.mmIndexIdentification, com.tools20022.repository.msg.Identification11.mmIndexIdentification, com.tools20022.repository.msg.Identification13.mmIndexIdentification,
					com.tools20022.repository.msg.Identification9.mmIndexIdentification, com.tools20022.repository.msg.Identification3.mmIndexIdentification, com.tools20022.repository.msg.FloatingRateNote1.mmReferenceRateIndex,
					com.tools20022.repository.msg.FloatingInterestRate4.mmReferenceRate, com.tools20022.repository.msg.Identification15.mmIndexIdentification, com.tools20022.repository.msg.Identification24.mmIndexIdentification,
					com.tools20022.repository.msg.FloatingRateNote2.mmReferenceRateIndex, com.tools20022.repository.msg.FloatingInterestRate6.mmReferenceRate, com.tools20022.repository.msg.FloatingInterestRate8.mmReferenceRate,
					com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmUnderlyingIndexIdentification);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the index by a name for instance LIBOR.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text referenceSource;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmRateResetSource
	 * InterestChange1.mmRateResetSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#mmIndexName
	 * CreditDefaultSwapDerivative3.mmIndexName}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmReferenceSource = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.mmRateResetSource, com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmIndexName);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceSource";
			definition = "Identifies the reference source. The source can be the fixing agent or a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyCode indexRateCurrency;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateCurrency
	 * InterestChange1.mmIndexRateCurrency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIndexRateCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.mmIndexRateCurrency);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateCurrency";
			definition = "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected FrequencyCode indexRateFrequency;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateFrequency
	 * InterestChange1.mmIndexRateFrequency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIndexRateFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.mmIndexRateFrequency);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateFrequency";
			definition = "Frequency at which the index changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	protected DecimalNumber indexRateMultiplier;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateMultiplier
	 * InterestChange1.mmIndexRateMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#mmValue
	 * InterestRateContractTerm1.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm2#mmValue
	 * InterestRateContractTerm2.mmValue}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIndexRateMultiplier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.mmIndexRateMultiplier, com.tools20022.repository.msg.InterestRateContractTerm1.mmValue,
					com.tools20022.repository.msg.InterestRateContractTerm2.mmValue);
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateMultiplier";
			definition = "Multiplier for the variable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Spread spread;
	/**
	 * Percentage to be added to or deducted from the index rate to calculate
	 * the effective rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Spread#mmIndex
	 * Spread.mmIndex}</li>
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
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Percentage to be added to or deducted from the index rate to calculate the effective rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmIndex;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PortfolioBenchmark> portfolioBenchmark;
	/**
	 * Portfolio benchmark which uses an index for decomposition,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmIndex
	 * PortfolioBenchmark.mmIndex}</li>
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
	public static final MMBusinessAssociationEnd mmPortfolioBenchmark = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PortfolioBenchmark";
			definition = "Portfolio benchmark which uses an index for decomposition,";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmIndex;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
		}
	};
	protected VariableInterest variableInterest;
	/**
	 * Variable interest which uises the index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmIndex
	 * VariableInterest.mmIndex}</li>
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
	public static final MMBusinessAssociationEnd mmVariableInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest which uises the index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmIndex;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected SecuritiesPricing securitiesPricing;
	/**
	 * Pricing which uses an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
	 * SecuritiesPricing.mmIndex}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Index.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses an index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmIndex;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Index";
				definition = "Identifies the index.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmIndex, com.tools20022.repository.entity.VariableInterest.mmIndex, com.tools20022.repository.entity.RateAndAmount.mmIndex,
						com.tools20022.repository.entity.Spread.mmIndex, com.tools20022.repository.entity.PortfolioBenchmark.mmIndex);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate4.mmTerm, com.tools20022.repository.msg.CreditDefaultSwapDerivative3.mmIndex);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Index.mmIndexRateBasis, com.tools20022.repository.entity.Index.mmIndexFactor, com.tools20022.repository.entity.Index.mmIndexPoints,
						com.tools20022.repository.entity.Index.mmIndexFixingDate, com.tools20022.repository.entity.Index.mmIdentification, com.tools20022.repository.entity.Index.mmReferenceSource,
						com.tools20022.repository.entity.Index.mmIndexRateCurrency, com.tools20022.repository.entity.Index.mmIndexRateFrequency, com.tools20022.repository.entity.Index.mmIndexRateMultiplier,
						com.tools20022.repository.entity.Index.mmSpread, com.tools20022.repository.entity.Index.mmPortfolioBenchmark, com.tools20022.repository.entity.Index.mmVariableInterest,
						com.tools20022.repository.entity.Index.mmSecuritiesPricing);
				derivationComponent_lazy = () -> Arrays.asList(CreditDefaultSwapDerivative3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getIndexRateBasis() {
		return indexRateBasis;
	}

	public void setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = indexRateBasis;
	}

	public RateAndAmount getIndexFactor() {
		return indexFactor;
	}

	public void setIndexFactor(com.tools20022.repository.entity.RateAndAmount indexFactor) {
		this.indexFactor = indexFactor;
	}

	public DecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public void setIndexPoints(DecimalNumber indexPoints) {
		this.indexPoints = indexPoints;
	}

	public ISODateTime getIndexFixingDate() {
		return indexFixingDate;
	}

	public void setIndexFixingDate(ISODateTime indexFixingDate) {
		this.indexFixingDate = indexFixingDate;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Max35Text getReferenceSource() {
		return referenceSource;
	}

	public void setReferenceSource(Max35Text referenceSource) {
		this.referenceSource = referenceSource;
	}

	public CurrencyCode getIndexRateCurrency() {
		return indexRateCurrency;
	}

	public void setIndexRateCurrency(CurrencyCode indexRateCurrency) {
		this.indexRateCurrency = indexRateCurrency;
	}

	public FrequencyCode getIndexRateFrequency() {
		return indexRateFrequency;
	}

	public void setIndexRateFrequency(FrequencyCode indexRateFrequency) {
		this.indexRateFrequency = indexRateFrequency;
	}

	public DecimalNumber getIndexRateMultiplier() {
		return indexRateMultiplier;
	}

	public void setIndexRateMultiplier(DecimalNumber indexRateMultiplier) {
		this.indexRateMultiplier = indexRateMultiplier;
	}

	public Spread getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
	}

	public List<PortfolioBenchmark> getPortfolioBenchmark() {
		return portfolioBenchmark;
	}

	public void setPortfolioBenchmark(List<com.tools20022.repository.entity.PortfolioBenchmark> portfolioBenchmark) {
		this.portfolioBenchmark = portfolioBenchmark;
	}

	public VariableInterest getVariableInterest() {
		return variableInterest;
	}

	public void setVariableInterest(com.tools20022.repository.entity.VariableInterest variableInterest) {
		this.variableInterest = variableInterest;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return securitiesPricing;
	}

	public void setSecuritiesPricing(com.tools20022.repository.entity.SecuritiesPricing securitiesPricing) {
		this.securitiesPricing = securitiesPricing;
	}
}