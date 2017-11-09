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
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Statistical data related to the price change of a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ValuationStatistics" src="doc-files/ValuationStatistics.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1
 * StatisticsByPredefinedTimePeriods1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1
 * StatisticsByUserDefinedTimePeriod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValuationStatistics2
 * ValuationStatistics2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2
 * StatisticsByPredefinedTimePeriods2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2
 * StatisticsByUserDefinedTimePeriod2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValuationStatistics3
 * ValuationStatistics3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationStatistics
 * NetAssetValueCalculation.mmValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRelatedStatistics
 * SecuritiesPricing.mmPriceChangeRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmHighestPriceValueRelatedStatistics
 * SecuritiesPricing.mmHighestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLowestPriceValueRelatedStatistics
 * SecuritiesPricing.mmLowestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmValuationStatistics
 * DateTimePeriod.mmValuationStatistics}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmCurrency
 * ValuationStatistics.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceTypeChangeBasis
 * ValuationStatistics.mmPriceTypeChangeBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
 * ValuationStatistics.mmPriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ValuationStatistics#mmYield
 * ValuationStatistics.mmYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
 * ValuationStatistics.mmHighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
 * ValuationStatistics.mmLowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPeriod
 * ValuationStatistics.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueCalculation
 * ValuationStatistics.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueChangeRate
 * ValuationStatistics.mmNetAssetValueChangeRate}</li>
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
 * "ValuationStatistics"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Statistical data related to the price change of a security."</li>
 * </ul>
 */
public class ValuationStatistics {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode currency;
	/**
	 * Currency of the net asset value calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics2#mmCurrency
	 * ValuationStatistics2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmCurrency
	 * ValuationStatistics3.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the net asset value calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ValuationStatistics2.mmCurrency, ValuationStatistics3.mmCurrency);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the net asset value calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected TypeOfPriceCode priceTypeChangeBasis;
	/**
	 * Type of price from which the change is calculated, eg, bid, offer, or
	 * single.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics2#mmPriceTypeChangeBasis
	 * ValuationStatistics2.mmPriceTypeChangeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmPriceTypeChangeBasis
	 * ValuationStatistics3.mmPriceTypeChangeBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTypeChangeBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of price from which the change is calculated, eg, bid, offer, or single."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceTypeChangeBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ValuationStatistics2.mmPriceTypeChangeBasis, ValuationStatistics3.mmPriceTypeChangeBasis);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceTypeChangeBasis";
			definition = "Type of price from which the change is calculated, eg, bid, offer, or single.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}
	};
	protected SecuritiesPricing priceChange;
	/**
	 * Change in price since the last valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRelatedStatistics
	 * SecuritiesPricing.mmPriceChangeRelatedStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmOneYearPriceChange
	 * StatisticsByPredefinedTimePeriods1.mmOneYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmThreeYearPriceChange
	 * StatisticsByPredefinedTimePeriods1.mmThreeYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmFiveYearPriceChange
	 * StatisticsByPredefinedTimePeriods1.mmFiveYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmPriceChange
	 * StatisticsByUserDefinedTimePeriod1.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics2#mmPriceChange
	 * ValuationStatistics2.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmOneYearPriceChange
	 * StatisticsByPredefinedTimePeriods2.mmOneYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmThreeYearPriceChange
	 * StatisticsByPredefinedTimePeriods2.mmThreeYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmFiveYearPriceChange
	 * StatisticsByPredefinedTimePeriods2.mmFiveYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmPriceChange
	 * StatisticsByUserDefinedTimePeriod2.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmPriceChange
	 * ValuationStatistics3.mmPriceChange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in price since the last valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceChange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatisticsByPredefinedTimePeriods1.mmOneYearPriceChange, StatisticsByPredefinedTimePeriods1.mmThreeYearPriceChange, StatisticsByPredefinedTimePeriods1.mmFiveYearPriceChange,
					StatisticsByUserDefinedTimePeriod1.mmPriceChange, ValuationStatistics2.mmPriceChange, StatisticsByPredefinedTimePeriods2.mmOneYearPriceChange, StatisticsByPredefinedTimePeriods2.mmThreeYearPriceChange,
					StatisticsByPredefinedTimePeriods2.mmFiveYearPriceChange, StatisticsByUserDefinedTimePeriod2.mmPriceChange, ValuationStatistics3.mmPriceChange);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChange";
			definition = "Change in price since the last valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRelatedStatistics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected PercentageRate yield;
	/**
	 * Rate of income from the financial instrument, usually calculated as total
	 * dividends or coupon interest available to investors in the last
	 * year,divided by the current price.
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
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmYield
	 * StatisticsByUserDefinedTimePeriod1.mmYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics2#mmYield
	 * ValuationStatistics2.mmYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmYield
	 * StatisticsByUserDefinedTimePeriod2.mmYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmYield
	 * ValuationStatistics3.mmYield}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmYield = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StatisticsByUserDefinedTimePeriod1.mmYield, ValuationStatistics2.mmYield, StatisticsByUserDefinedTimePeriod2.mmYield, ValuationStatistics3.mmYield);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected SecuritiesPricing highestPriceValue;
	/**
	 * Highest price for the referenced period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmHighestPriceValueRelatedStatistics
	 * SecuritiesPricing.mmHighestPriceValueRelatedStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmHighestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods1.mmHighestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmHighestPriceValue
	 * StatisticsByUserDefinedTimePeriod1.mmHighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmHighestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods2.mmHighestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmHighestPriceValue
	 * StatisticsByUserDefinedTimePeriod2.mmHighestPriceValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighestPriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Highest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmHighestPriceValue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatisticsByPredefinedTimePeriods1.mmHighestPriceValue12Months, StatisticsByUserDefinedTimePeriod1.mmHighestPriceValue, StatisticsByPredefinedTimePeriods2.mmHighestPriceValue12Months,
					StatisticsByUserDefinedTimePeriod2.mmHighestPriceValue);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValue";
			definition = "Highest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmHighestPriceValueRelatedStatistics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing lowestPriceValue;
	/**
	 * Lowest price for the referenced period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLowestPriceValueRelatedStatistics
	 * SecuritiesPricing.mmLowestPriceValueRelatedStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmLowestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods1.mmLowestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmLowestPriceValue
	 * StatisticsByUserDefinedTimePeriod1.mmLowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmLowestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods2.mmLowestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmLowestPriceValue
	 * StatisticsByUserDefinedTimePeriod2.mmLowestPriceValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowestPriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lowest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLowestPriceValue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatisticsByPredefinedTimePeriods1.mmLowestPriceValue12Months, StatisticsByUserDefinedTimePeriod1.mmLowestPriceValue, StatisticsByPredefinedTimePeriods2.mmLowestPriceValue12Months,
					StatisticsByUserDefinedTimePeriod2.mmLowestPriceValue);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValue";
			definition = "Lowest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmLowestPriceValueRelatedStatistics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected DateTimePeriod period;
	/**
	 * Reference period for the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmValuationStatistics
	 * DateTimePeriod.mmValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmPeriod
	 * StatisticsByUserDefinedTimePeriod1.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmPeriod
	 * StatisticsByUserDefinedTimePeriod2.mmPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference period for the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatisticsByUserDefinedTimePeriod1.mmPeriod, StatisticsByUserDefinedTimePeriod2.mmPeriod);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Reference period for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmValuationStatistics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Information related to the price valuation of an investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationStatistics
	 * NetAssetValueCalculation.mmValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the price valuation of an investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Information related to the price valuation of an investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationStatistics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected PercentageRate netAssetValueChangeRate;
	/**
	 * Rate of change of the net asset value.
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
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmTotalNAVChangeRate
	 * FundCashForecast1.mmTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTotalNAVChangeRate
	 * FundCashForecast3.mmTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmTotalNAVChangeRate
	 * FundCashForecast2.mmTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTotalNAVChangeRate
	 * FundCashForecast4.mmTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmEstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast2.mmEstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmEstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast4.mmEstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmEstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast1.mmEstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast3.mmEstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalNAVChangeRate
	 * FundCashForecast7.mmTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast6.mmEstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalNAVChangeRate
	 * FundCashForecast6.mmTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast5.mmEstimatedTotalNAVChangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueChangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of change of the net asset value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetAssetValueChangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashForecast1.mmTotalNAVChangeRate, FundCashForecast3.mmTotalNAVChangeRate, FundCashForecast2.mmTotalNAVChangeRate, FundCashForecast4.mmTotalNAVChangeRate,
					EstimatedFundCashForecast2.mmEstimatedTotalNAVChangeRate, EstimatedFundCashForecast4.mmEstimatedTotalNAVChangeRate, EstimatedFundCashForecast1.mmEstimatedTotalNAVChangeRate,
					EstimatedFundCashForecast3.mmEstimatedTotalNAVChangeRate, FundCashForecast7.mmTotalNAVChangeRate, EstimatedFundCashForecast6.mmEstimatedTotalNAVChangeRate, FundCashForecast6.mmTotalNAVChangeRate,
					EstimatedFundCashForecast5.mmEstimatedTotalNAVChangeRate);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueChangeRate";
			definition = "Rate of change of the net asset value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValuationStatistics";
				definition = "Statistical data related to the price change of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.mmHighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmLowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.DateTimePeriod.mmValuationStatistics);
				element_lazy = () -> Arrays.asList(ValuationStatistics.mmCurrency, ValuationStatistics.mmPriceTypeChangeBasis, ValuationStatistics.mmPriceChange, ValuationStatistics.mmYield, ValuationStatistics.mmHighestPriceValue,
						ValuationStatistics.mmLowestPriceValue, ValuationStatistics.mmPeriod, ValuationStatistics.mmNetAssetValueCalculation, ValuationStatistics.mmNetAssetValueChangeRate);
				derivationComponent_lazy = () -> Arrays.asList(StatisticsByPredefinedTimePeriods1.mmObject(), StatisticsByUserDefinedTimePeriod1.mmObject(), ValuationStatistics2.mmObject(), StatisticsByPredefinedTimePeriods2.mmObject(),
						StatisticsByUserDefinedTimePeriod2.mmObject(), ValuationStatistics3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public TypeOfPriceCode getPriceTypeChangeBasis() {
		return priceTypeChangeBasis;
	}

	public void setPriceTypeChangeBasis(TypeOfPriceCode priceTypeChangeBasis) {
		this.priceTypeChangeBasis = priceTypeChangeBasis;
	}

	public SecuritiesPricing getPriceChange() {
		return priceChange;
	}

	public void setPriceChange(com.tools20022.repository.entity.SecuritiesPricing priceChange) {
		this.priceChange = priceChange;
	}

	public PercentageRate getYield() {
		return yield;
	}

	public void setYield(PercentageRate yield) {
		this.yield = yield;
	}

	public SecuritiesPricing getHighestPriceValue() {
		return highestPriceValue;
	}

	public void setHighestPriceValue(com.tools20022.repository.entity.SecuritiesPricing highestPriceValue) {
		this.highestPriceValue = highestPriceValue;
	}

	public SecuritiesPricing getLowestPriceValue() {
		return lowestPriceValue;
	}

	public void setLowestPriceValue(com.tools20022.repository.entity.SecuritiesPricing lowestPriceValue) {
		this.lowestPriceValue = lowestPriceValue;
	}

	public DateTimePeriod getPeriod() {
		return period;
	}

	public void setPeriod(com.tools20022.repository.entity.DateTimePeriod period) {
		this.period = period;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public PercentageRate getNetAssetValueChangeRate() {
		return netAssetValueChangeRate;
	}

	public void setNetAssetValueChangeRate(PercentageRate netAssetValueChangeRate) {
		this.netAssetValueChangeRate = netAssetValueChangeRate;
	}
}