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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Index"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the index."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Index {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate indexRateBasis;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmIndexRateBasis
	 * FinancialInstrumentAttributes91.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmIndexRateBasis
	 * FinancialInstrumentAttributes92.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmIndexRateBasis
	 * FinancialInstrumentAttributes95.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmIndexRateBasis
	 * FinancialInstrumentAttributes97.mmIndexRateBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reference rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, PercentageRate> mmIndexRateBasis = new MMBusinessAttribute<Index, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmIndexRateBasis, FinancialInstrumentAttributes20.mmIndexRateBasis, FinancialInstrumentAttributes35.mmIndexRateBasis,
					FinancialInstrumentAttributes41.mmIndexRateBasis, FinancialInstrumentAttributes4.mmIndexRateBasis, FinancialInstrumentAttributes13.mmIndexRateBasis, FinancialInstrumentAttributes21.mmIndexRateBasis,
					FinancialInstrumentAttributes26.mmIndexRateBasis, FinancialInstrumentAttributes36.mmIndexRateBasis, FinancialInstrumentAttributes42.mmIndexRateBasis, FinancialInstrumentAttributes27.mmIndexRateBasis,
					FinancialInstrumentAttributes14.mmIndexRateBasis, FinancialInstrumentAttributes30.mmIndexRateBasis, FinancialInstrumentAttributes28.mmIndexRateBasis, InterestChange1.mmIndexRateBasis,
					FinancialInstrumentAttributes31.mmIndexRateBasis, FinancialInstrumentAttributes44.mmIndexRateBasis, FinancialInstrumentAttributes15.mmIndexRateBasis, FinancialInstrumentAttributes29.mmIndexRateBasis,
					FinancialInstrumentAttributes2.mmIndexRateBasis, FinancialInstrumentAttributes63.mmIndexRateBasis, FinancialInstrumentAttributes64.mmIndexRateBasis, FinancialInstrumentAttributes75.mmIndexRateBasis,
					FinancialInstrumentAttributes78.mmIndexRateBasis, FinancialInstrumentAttributes91.mmIndexRateBasis, FinancialInstrumentAttributes92.mmIndexRateBasis, FinancialInstrumentAttributes95.mmIndexRateBasis,
					FinancialInstrumentAttributes97.mmIndexRateBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Index obj) {
			return obj.getIndexRateBasis();
		}

		@Override
		public void setValue(Index obj, PercentageRate value) {
			obj.setIndexRateBasis(value);
		}
	};
	protected RateAndAmount indexFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmIndex
	 * RateAndAmount.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDerivative3#mmIndexFactor
	 * CreditDerivative3.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmIndexFactor
	 * CorporateActionRate86.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmIndexFactor
	 * CorporateActionRate87.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88#mmIndexFactor
	 * CorporateActionRate88.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92#mmIndexFactor
	 * CorporateActionRate92.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate94#mmIndexFactor
	 * CorporateActionRate94.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97#mmIndexFactor
	 * CorporateActionRate97.mmIndexFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index rate applied to the amount paid to adjust it for instance to inflation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Index, RateAndAmount> mmIndexFactor = new MMBusinessAssociationEnd<Index, RateAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmIndexFactor, CorporateActionRate10.mmIndexFactor, CorporateActionRate20.mmIndexFactor, CorporateActionRate22.mmIndexFactor, CorporateActionRate26.mmIndexFactor,
					CorporateActionRate31.mmIndexFactor, CorporateActionRate38.mmIndexFactor, CorporateActionRate39.mmIndexFactor, CorporateActionRate5.mmIndexFactor, CorporateActionRate12.mmIndexFactor,
					CorporateActionRate15.mmIndexFactor, CorporateActionRate18.mmIndexFactor, CorporateActionRate25.mmIndexFactor, CorporateActionRate30.mmIndexFactor, CorporateActionRate37.mmIndexFactor,
					CorporateActionRate40.mmIndexFactor, CorporateActionRate36.mmIndexFactor, CorporateActionRate42.mmIndexFactor, CorporateActionRate2.mmIndexFactor, CorporateActionRate46.mmIndexFactor,
					CorporateActionRate45.mmIndexFactor, CorporateActionRate44.mmIndexFactor, CorporateActionRate60.mmIndexFactor, CorporateActionRate64.mmIndexFactor, CorporateActionRate57.mmIndexFactor,
					CorporateActionRate68.mmIndexFactor, CorporateActionRate70.mmIndexFactor, CorporateActionRate67.mmIndexFactor, CorporateActionRate74.mmIndexFactor, CorporateActionRate79.mmIndexFactor,
					CorporateActionRate76.mmIndexFactor, CorporateActionRate82.mmIndexFactor, CorporateActionRate80.mmIndexFactor, CorporateActionRate81.mmIndexFactor, CorporateActionRate83.mmIndexFactor,
					CorporateActionRate84.mmIndexFactor, CorporateActionRate85.mmIndexFactor, CreditDerivative3.mmIndexFactor, CorporateActionRate86.mmIndexFactor, CorporateActionRate87.mmIndexFactor, CorporateActionRate88.mmIndexFactor,
					CorporateActionRate92.mmIndexFactor, CorporateActionRate94.mmIndexFactor, CorporateActionRate97.mmIndexFactor);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexFactor";
			definition = "Index rate applied to the amount paid to adjust it for instance to inflation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RateAndAmount.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}

		@Override
		public RateAndAmount getValue(Index obj) {
			return obj.getIndexFactor();
		}

		@Override
		public void setValue(Index obj, RateAndAmount value) {
			obj.setIndexFactor(value);
		}
	};
	protected DecimalNumber indexPoints;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of points above the index used to calculate a price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, DecimalNumber> mmIndexPoints = new MMBusinessAttribute<Index, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(PriceFormat6Choice.mmIndexPoints, PriceFormat12Choice.mmIndexPoints, PriceFormat8Choice.mmIndexPoints, PriceFormat16Choice.mmIndexPoints, PriceFormat23Choice.mmIndexPoints,
					PriceFormat27Choice.mmIndexPoints, PriceFormat4Choice.mmIndexPoints, PriceFormat33Choice.mmIndexPoints, RateAndAmountFormat19Choice.mmIndexPoints, PriceFormat32Choice.mmIndexPoints, PriceFormat34Choice.mmIndexPoints,
					PriceFormat43Choice.mmIndexPoints, RateAndAmountFormat28Choice.mmIndexPoints, PriceFormat40Choice.mmIndexPoints, PriceFormat39Choice.mmIndexPoints, SecuritiesTransactionPrice2Choice.mmBasisPoints,
					PriceFormat48Choice.mmIndexPoints, PriceFormat51Choice.mmIndexPoints, PriceFormat49Choice.mmIndexPoints, PriceFormat47Choice.mmIndexPoints, PriceFormat44Choice.mmIndexPoints, RateAndAmountFormat38Choice.mmIndexPoints,
					RateAndAmountFormat50Choice.mmIndexPoints, PriceFormat56Choice.mmIndexPoints, PriceFormat59Choice.mmIndexPoints, PriceFormat55Choice.mmIndexPoints, PriceFormat53Choice.mmIndexPoints, PriceFormat60Choice.mmIndexPoints);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexPoints";
			definition = "Number of points above the index used to calculate a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Index obj) {
			return obj.getIndexPoints();
		}

		@Override
		public void setValue(Index obj, DecimalNumber value) {
			obj.setIndexPoints(value);
		}
	};
	protected ISODateTime indexFixingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which an index rate will be determined ."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, ISODateTime> mmIndexFixingDate = new MMBusinessAttribute<Index, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmIndexFixingDate, CorporateActionDate13.mmIndexFixingDate, CorporateActionDate14.mmIndexFixingDate, CorporateActionDate21.mmIndexFixingDate,
					CorporateActionDate2.mmIndexFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexFixingDate";
			definition = "Date/time at which an index rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Index obj) {
			return obj.getIndexFixingDate();
		}

		@Override
		public void setValue(Index obj, ISODateTime value) {
			obj.setIndexFixingDate(value);
		}
	};
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the index by a name for instance LIBOR."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, Max35Text> mmIdentification = new MMBusinessAttribute<Index, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Identification2.mmIndexIdentification, IdentificationReference8Choice.mmIndexIdentification, IdentificationReference11Choice.mmIndexIdentification, Identification7.mmIndexIdentification,
					Identification6.mmIndexIdentification, VariableInterest1Rate.mmIndex, Identification5.mmIndexIdentification, Identification8.mmIndexIdentification, Identification11.mmIndexIdentification,
					Identification13.mmIndexIdentification, Identification9.mmIndexIdentification, Identification3.mmIndexIdentification, FloatingRateNote1.mmReferenceRateIndex, FloatingInterestRate4.mmReferenceRate,
					Identification15.mmIndexIdentification, Identification24.mmIndexIdentification, FloatingRateNote2.mmReferenceRateIndex, FloatingInterestRate6.mmReferenceRate, FloatingInterestRate8.mmReferenceRate,
					CreditDefaultSwapDerivative3.mmUnderlyingIndexIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the index by a name for instance LIBOR.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Index obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Index obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Max35Text referenceSource;
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmRateResetSource
	 * InterestChange1.mmRateResetSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3#mmIndexName
	 * CreditDefaultSwapDerivative3.mmIndexName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reference source. The source can be the fixing agent or a system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, Max35Text> mmReferenceSource = new MMBusinessAttribute<Index, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestChange1.mmRateResetSource, CreditDefaultSwapDerivative3.mmIndexName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReferenceSource";
			definition = "Identifies the reference source. The source can be the fixing agent or a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Index obj) {
			return obj.getReferenceSource();
		}

		@Override
		public void setValue(Index obj, Max35Text value) {
			obj.setReferenceSource(value);
		}
	};
	protected CurrencyCode indexRateCurrency;
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateCurrency
	 * InterestChange1.mmIndexRateCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, CurrencyCode> mmIndexRateCurrency = new MMBusinessAttribute<Index, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestChange1.mmIndexRateCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateCurrency";
			definition = "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Index obj) {
			return obj.getIndexRateCurrency();
		}

		@Override
		public void setValue(Index obj, CurrencyCode value) {
			obj.setIndexRateCurrency(value);
		}
	};
	protected FrequencyCode indexRateFrequency;
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateFrequency
	 * InterestChange1.mmIndexRateFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the index changes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, FrequencyCode> mmIndexRateFrequency = new MMBusinessAttribute<Index, FrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestChange1.mmIndexRateFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateFrequency";
			definition = "Frequency at which the index changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(Index obj) {
			return obj.getIndexRateFrequency();
		}

		@Override
		public void setValue(Index obj, FrequencyCode value) {
			obj.setIndexRateFrequency(value);
		}
	};
	protected DecimalNumber indexRateMultiplier;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateMultiplier
	 * InterestChange1.mmIndexRateMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1#mmValue
	 * InterestRateContractTerm1.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm2#mmValue
	 * InterestRateContractTerm2.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm3#mmValue
	 * InterestRateContractTerm3.mmValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multiplier for the variable rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Index, DecimalNumber> mmIndexRateMultiplier = new MMBusinessAttribute<Index, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestChange1.mmIndexRateMultiplier, InterestRateContractTerm1.mmValue, InterestRateContractTerm2.mmValue, InterestRateContractTerm3.mmValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexRateMultiplier";
			definition = "Multiplier for the variable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Index obj) {
			return obj.getIndexRateMultiplier();
		}

		@Override
		public void setValue(Index obj, DecimalNumber value) {
			obj.setIndexRateMultiplier(value);
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Spread#mmIndex
	 * Spread.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage to be added to or deducted from the index rate to calculate the effective rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Index, Optional<Spread>> mmSpread = new MMBusinessAssociationEnd<Index, Optional<Spread>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Percentage to be added to or deducted from the index rate to calculate the effective rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Spread.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}

		@Override
		public Optional<Spread> getValue(Index obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(Index obj, Optional<Spread> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	protected List<PortfolioBenchmark> portfolioBenchmark;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioBenchmark
	 * PortfolioBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioBenchmark#mmIndex
	 * PortfolioBenchmark.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioBenchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio benchmark which uses an index for decomposition,"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Index, List<PortfolioBenchmark>> mmPortfolioBenchmark = new MMBusinessAssociationEnd<Index, List<PortfolioBenchmark>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PortfolioBenchmark";
			definition = "Portfolio benchmark which uses an index for decomposition,";
			minOccurs = 0;
			opposite_lazy = () -> PortfolioBenchmark.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioBenchmark.mmObject();
		}

		@Override
		public List<PortfolioBenchmark> getValue(Index obj) {
			return obj.getPortfolioBenchmark();
		}

		@Override
		public void setValue(Index obj, List<PortfolioBenchmark> value) {
			obj.setPortfolioBenchmark(value);
		}
	};
	protected VariableInterest variableInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmIndex
	 * VariableInterest.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable interest which uises the index."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Index, VariableInterest> mmVariableInterest = new MMBusinessAssociationEnd<Index, VariableInterest>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest which uises the index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> VariableInterest.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VariableInterest.mmObject();
		}

		@Override
		public VariableInterest getValue(Index obj) {
			return obj.getVariableInterest();
		}

		@Override
		public void setValue(Index obj, VariableInterest value) {
			obj.setVariableInterest(value);
		}
	};
	protected SecuritiesPricing securitiesPricing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
	 * SecuritiesPricing.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Index
	 * Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing which uses an index."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Index, SecuritiesPricing> mmSecuritiesPricing = new MMBusinessAssociationEnd<Index, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses an index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmIndex;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Index obj) {
			return obj.getSecuritiesPricing();
		}

		@Override
		public void setValue(Index obj, SecuritiesPricing value) {
			obj.setSecuritiesPricing(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Index";
				definition = "Identifies the index.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmIndex, VariableInterest.mmIndex, RateAndAmount.mmIndex, Spread.mmIndex, PortfolioBenchmark.mmIndex);
				derivationElement_lazy = () -> Arrays.asList(FloatingInterestRate4.mmTerm, CreditDefaultSwapDerivative3.mmIndex);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Index.mmIndexRateBasis, com.tools20022.repository.entity.Index.mmIndexFactor, com.tools20022.repository.entity.Index.mmIndexPoints,
						com.tools20022.repository.entity.Index.mmIndexFixingDate, com.tools20022.repository.entity.Index.mmIdentification, com.tools20022.repository.entity.Index.mmReferenceSource,
						com.tools20022.repository.entity.Index.mmIndexRateCurrency, com.tools20022.repository.entity.Index.mmIndexRateFrequency, com.tools20022.repository.entity.Index.mmIndexRateMultiplier,
						com.tools20022.repository.entity.Index.mmSpread, com.tools20022.repository.entity.Index.mmPortfolioBenchmark, com.tools20022.repository.entity.Index.mmVariableInterest,
						com.tools20022.repository.entity.Index.mmSecuritiesPricing);
				derivationComponent_lazy = () -> Arrays.asList(CreditDefaultSwapDerivative3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Index.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getIndexRateBasis() {
		return indexRateBasis;
	}

	public Index setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = Objects.requireNonNull(indexRateBasis);
		return this;
	}

	public RateAndAmount getIndexFactor() {
		return indexFactor;
	}

	public Index setIndexFactor(RateAndAmount indexFactor) {
		this.indexFactor = Objects.requireNonNull(indexFactor);
		return this;
	}

	public DecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public Index setIndexPoints(DecimalNumber indexPoints) {
		this.indexPoints = Objects.requireNonNull(indexPoints);
		return this;
	}

	public ISODateTime getIndexFixingDate() {
		return indexFixingDate;
	}

	public Index setIndexFixingDate(ISODateTime indexFixingDate) {
		this.indexFixingDate = Objects.requireNonNull(indexFixingDate);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Index setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max35Text getReferenceSource() {
		return referenceSource;
	}

	public Index setReferenceSource(Max35Text referenceSource) {
		this.referenceSource = Objects.requireNonNull(referenceSource);
		return this;
	}

	public CurrencyCode getIndexRateCurrency() {
		return indexRateCurrency;
	}

	public Index setIndexRateCurrency(CurrencyCode indexRateCurrency) {
		this.indexRateCurrency = Objects.requireNonNull(indexRateCurrency);
		return this;
	}

	public FrequencyCode getIndexRateFrequency() {
		return indexRateFrequency;
	}

	public Index setIndexRateFrequency(FrequencyCode indexRateFrequency) {
		this.indexRateFrequency = Objects.requireNonNull(indexRateFrequency);
		return this;
	}

	public DecimalNumber getIndexRateMultiplier() {
		return indexRateMultiplier;
	}

	public Index setIndexRateMultiplier(DecimalNumber indexRateMultiplier) {
		this.indexRateMultiplier = Objects.requireNonNull(indexRateMultiplier);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public Index setSpread(Spread spread) {
		this.spread = spread;
		return this;
	}

	public List<PortfolioBenchmark> getPortfolioBenchmark() {
		return portfolioBenchmark == null ? portfolioBenchmark = new ArrayList<>() : portfolioBenchmark;
	}

	public Index setPortfolioBenchmark(List<PortfolioBenchmark> portfolioBenchmark) {
		this.portfolioBenchmark = Objects.requireNonNull(portfolioBenchmark);
		return this;
	}

	public VariableInterest getVariableInterest() {
		return variableInterest;
	}

	public Index setVariableInterest(VariableInterest variableInterest) {
		this.variableInterest = Objects.requireNonNull(variableInterest);
		return this;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return securitiesPricing;
	}

	public Index setSecuritiesPricing(SecuritiesPricing securitiesPricing) {
		this.securitiesPricing = Objects.requireNonNull(securitiesPricing);
		return this;
	}
}