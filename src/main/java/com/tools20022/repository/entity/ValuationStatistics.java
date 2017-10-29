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
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.PercentageRate;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#Currency
 * ValuationStatistics.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#PriceTypeChangeBasis
 * ValuationStatistics.PriceTypeChangeBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#PriceChange
 * ValuationStatistics.PriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ValuationStatistics#Yield
 * ValuationStatistics.Yield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#HighestPriceValue
 * ValuationStatistics.HighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#LowestPriceValue
 * ValuationStatistics.LowestPriceValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ValuationStatistics#Period
 * ValuationStatistics.Period}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#NetAssetValueCalculation
 * ValuationStatistics.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#NetAssetValueChangeRate
 * ValuationStatistics.NetAssetValueChangeRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#ValuationStatistics
 * NetAssetValueCalculation.ValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRelatedStatistics
 * SecuritiesPricing.PriceChangeRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#HighestPriceValueRelatedStatistics
 * SecuritiesPricing.HighestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LowestPriceValueRelatedStatistics
 * SecuritiesPricing.LowestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ValuationStatistics
 * DateTimePeriod.ValuationStatistics}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Currency of the net asset value calculation.
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
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics2#Currency
	 * ValuationStatistics2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#Currency
	 * ValuationStatistics3.Currency}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the net asset value calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationStatistics2.Currency, com.tools20022.repository.msg.ValuationStatistics3.Currency);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the net asset value calculation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics2#PriceTypeChangeBasis
	 * ValuationStatistics2.PriceTypeChangeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#PriceTypeChangeBasis
	 * ValuationStatistics3.PriceTypeChangeBasis}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PriceTypeChangeBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of price from which the change is calculated, eg, bid, offer, or single."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceTypeChangeBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationStatistics2.PriceTypeChangeBasis, com.tools20022.repository.msg.ValuationStatistics3.PriceTypeChangeBasis);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceTypeChangeBasis";
			definition = "Type of price from which the change is calculated, eg, bid, offer, or single.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}
	};
	/**
	 * Change in price since the last valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRelatedStatistics
	 * SecuritiesPricing.PriceChangeRelatedStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#OneYearPriceChange
	 * StatisticsByPredefinedTimePeriods1.OneYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#ThreeYearPriceChange
	 * StatisticsByPredefinedTimePeriods1.ThreeYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#FiveYearPriceChange
	 * StatisticsByPredefinedTimePeriods1.FiveYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#PriceChange
	 * StatisticsByUserDefinedTimePeriod1.PriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics2#PriceChange
	 * ValuationStatistics2.PriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#OneYearPriceChange
	 * StatisticsByPredefinedTimePeriods2.OneYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#ThreeYearPriceChange
	 * StatisticsByPredefinedTimePeriods2.ThreeYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#FiveYearPriceChange
	 * StatisticsByPredefinedTimePeriods2.FiveYearPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#PriceChange
	 * StatisticsByUserDefinedTimePeriod2.PriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#PriceChange
	 * ValuationStatistics3.PriceChange}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in price since the last valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceChange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1.OneYearPriceChange, com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1.ThreeYearPriceChange,
					com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1.FiveYearPriceChange, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.PriceChange,
					com.tools20022.repository.msg.ValuationStatistics2.PriceChange, com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.OneYearPriceChange,
					com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.ThreeYearPriceChange, com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.FiveYearPriceChange,
					com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.PriceChange, com.tools20022.repository.msg.ValuationStatistics3.PriceChange);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChange";
			definition = "Change in price since the last valuation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRelatedStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#Yield
	 * StatisticsByUserDefinedTimePeriod1.Yield}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ValuationStatistics2#Yield
	 * ValuationStatistics2.Yield}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#Yield
	 * StatisticsByUserDefinedTimePeriod2.Yield}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ValuationStatistics3#Yield
	 * ValuationStatistics3.Yield}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Yield = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.Yield, com.tools20022.repository.msg.ValuationStatistics2.Yield,
					com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.Yield, com.tools20022.repository.msg.ValuationStatistics3.Yield);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Highest price for the referenced period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#HighestPriceValueRelatedStatistics
	 * SecuritiesPricing.HighestPriceValueRelatedStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#HighestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods1.HighestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#HighestPriceValue
	 * StatisticsByUserDefinedTimePeriod1.HighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#HighestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods2.HighestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#HighestPriceValue
	 * StatisticsByUserDefinedTimePeriod2.HighestPriceValue}</li>
	 * </ul>
	 * </li>
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
	 * name} = "HighestPriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Highest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd HighestPriceValue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1.HighestPriceValue12Months, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.HighestPriceValue,
					com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.HighestPriceValue12Months, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.HighestPriceValue);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValue";
			definition = "Highest price for the referenced period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.HighestPriceValueRelatedStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lowest price for the referenced period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LowestPriceValueRelatedStatistics
	 * SecuritiesPricing.LowestPriceValueRelatedStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#LowestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods1.LowestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#LowestPriceValue
	 * StatisticsByUserDefinedTimePeriod1.LowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#LowestPriceValue12Months
	 * StatisticsByPredefinedTimePeriods2.LowestPriceValue12Months}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#LowestPriceValue
	 * StatisticsByUserDefinedTimePeriod2.LowestPriceValue}</li>
	 * </ul>
	 * </li>
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
	 * name} = "LowestPriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lowest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LowestPriceValue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1.LowestPriceValue12Months, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.LowestPriceValue,
					com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.LowestPriceValue12Months, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.LowestPriceValue);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValue";
			definition = "Lowest price for the referenced period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.LowestPriceValueRelatedStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reference period for the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#ValuationStatistics
	 * DateTimePeriod.ValuationStatistics}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#Period
	 * StatisticsByUserDefinedTimePeriod1.Period}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#Period
	 * StatisticsByUserDefinedTimePeriod2.Period}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference period for the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Period = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.Period, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.Period);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Reference period for the valuation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ValuationStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to the price valuation of an investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#ValuationStatistics
	 * NetAssetValueCalculation.ValuationStatistics}</li>
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
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Information related to the price valuation of an investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.ValuationStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#TotalNAVChangeRate
	 * FundCashForecast1.TotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#TotalNAVChangeRate
	 * FundCashForecast3.TotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#TotalNAVChangeRate
	 * FundCashForecast2.TotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#TotalNAVChangeRate
	 * FundCashForecast4.TotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#EstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast2.EstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#EstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast4.EstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#EstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast1.EstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#EstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast3.EstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#TotalNAVChangeRate
	 * FundCashForecast7.TotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#EstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast6.EstimatedTotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#TotalNAVChangeRate
	 * FundCashForecast6.TotalNAVChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#EstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast5.EstimatedTotalNAVChangeRate}</li>
	 * </ul>
	 * </li>
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
	 * name} = "NetAssetValueChangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of change of the net asset value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAssetValueChangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecast1.TotalNAVChangeRate, com.tools20022.repository.msg.FundCashForecast3.TotalNAVChangeRate,
					com.tools20022.repository.msg.FundCashForecast2.TotalNAVChangeRate, com.tools20022.repository.msg.FundCashForecast4.TotalNAVChangeRate,
					com.tools20022.repository.msg.EstimatedFundCashForecast2.EstimatedTotalNAVChangeRate, com.tools20022.repository.msg.EstimatedFundCashForecast4.EstimatedTotalNAVChangeRate,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.EstimatedTotalNAVChangeRate, com.tools20022.repository.msg.EstimatedFundCashForecast3.EstimatedTotalNAVChangeRate,
					com.tools20022.repository.msg.FundCashForecast7.TotalNAVChangeRate, com.tools20022.repository.msg.EstimatedFundCashForecast6.EstimatedTotalNAVChangeRate,
					com.tools20022.repository.msg.FundCashForecast6.TotalNAVChangeRate, com.tools20022.repository.msg.EstimatedFundCashForecast5.EstimatedTotalNAVChangeRate);
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueChangeRate";
			definition = "Rate of change of the net asset value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ValuationStatistics";
				definition = "Statistical data related to the price change of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.ValuationStatistics, com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.HighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.LowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.DateTimePeriod.ValuationStatistics);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ValuationStatistics.Currency, com.tools20022.repository.entity.ValuationStatistics.PriceTypeChangeBasis,
						com.tools20022.repository.entity.ValuationStatistics.PriceChange, com.tools20022.repository.entity.ValuationStatistics.Yield, com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue,
						com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue, com.tools20022.repository.entity.ValuationStatistics.Period, com.tools20022.repository.entity.ValuationStatistics.NetAssetValueCalculation,
						com.tools20022.repository.entity.ValuationStatistics.NetAssetValueChangeRate);
				derivationComponent_lazy = () -> Arrays.asList(StatisticsByPredefinedTimePeriods1.mmObject(), StatisticsByUserDefinedTimePeriod1.mmObject(), ValuationStatistics2.mmObject(), StatisticsByPredefinedTimePeriods2.mmObject(),
						StatisticsByUserDefinedTimePeriod2.mmObject(), ValuationStatistics3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}