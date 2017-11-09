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
import com.tools20022.repository.choice.CalculationType2Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice;
import com.tools20022.repository.codeset.CalculationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Characteristics related to the yield.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="YieldCalculation" src="doc-files/YieldCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation1
 * YieldCalculation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation2
 * YieldCalculation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CalculationType2Choice
 * CalculationType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation3
 * YieldCalculation3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
 * SecuritiesPricing.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmYieldCalculation
 * DateTimePeriod.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmYieldCalculation
 * VariableInterest.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRelatedYieldCalculation
 * RateAndAmount.mmRelatedYieldCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmMidYield
 * SingleQuote1.mmMidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmBidYield
 * SingleQuote1.mmBidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmOfferYield
 * SingleQuote1.mmOfferYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmYieldDetails
 * QuoteRequest1.mmYieldDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmOfferYield
 * Quote1.mmOfferYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmMidYield
 * Quote1.mmMidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmBidYield
 * Quote1.mmBidYield}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
 * YieldCalculation.mmRedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.YieldCalculation#mmValue
 * YieldCalculation.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmCalculationType
 * YieldCalculation.mmCalculationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValueDate
 * YieldCalculation.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValuePeriod
 * YieldCalculation.mmValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldCalculationDate
 * YieldCalculation.mmYieldCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldRange
 * YieldCalculation.mmYieldRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmVariableInterest
 * YieldCalculation.mmVariableInterest}</li>
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
 * "YieldCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics related to the yield."</li>
 * </ul>
 */
public class YieldCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing redemptionPrice;
	/**
	 * Price on which the yield is computed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
	 * SecuritiesPricing.mmYieldCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmRedemptionPrice
	 * YieldCalculation1.mmRedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmRedemptionPrice
	 * YieldCalculation2.mmRedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmRedemptionPrice
	 * YieldCalculation3.mmRedemptionPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price on which the yield is computed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRedemptionPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmRedemptionPrice, YieldCalculation2.mmRedemptionPrice, YieldCalculation3.mmRedemptionPrice);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionPrice";
			definition = "Price on which the yield is computed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected PercentageRate value;
	/**
	 * Result of the yield calculation.
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValue
	 * YieldCalculation1.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValue
	 * YieldCalculation2.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValue
	 * YieldCalculation3.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmYield
	 * SecuritiesTransactionPrice2Choice.mmYield}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the yield calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmValue, YieldCalculation2.mmValue, YieldCalculation3.mmValue, SecuritiesTransactionPrice2Choice.mmYield);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Result of the yield calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CalculationTypeCode calculationType;
	/**
	 * Specifies the type of calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
	 * CalculationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmCalculationType
	 * YieldCalculation1.mmCalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmCalculationType
	 * YieldCalculation2.mmCalculationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmYieldType
	 * Order16.mmYieldType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmYieldType
	 * Order14.mmYieldType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CalculationType2Choice#mmCode
	 * CalculationType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CalculationType2Choice#mmProprietary
	 * CalculationType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmCalculationType
	 * YieldCalculation3.mmCalculationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmYieldDetails
	 * Order6.mmYieldDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmYieldType
	 * Order17.mmYieldType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmYieldType
	 * Order18.mmYieldType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmCalculationType, YieldCalculation2.mmCalculationType, Order16.mmYieldType, Order14.mmYieldType, CalculationType2Choice.mmCode, CalculationType2Choice.mmProprietary,
					YieldCalculation3.mmCalculationType, Order6.mmYieldDetails, Order17.mmYieldType, Order18.mmYieldType);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationTypeCode.mmObject();
		}
	};
	protected ISODateTime valueDate;
	/**
	 * Date/time on which the calculation is based, for example, valuation on
	 * October 1 (price date) based on price of September 19 ( value date).
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValueDateTime
	 * YieldCalculation1.mmValueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValueDate
	 * YieldCalculation2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValueDate
	 * YieldCalculation3.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmValueDateTime, YieldCalculation2.mmValueDate, YieldCalculation3.mmValueDate);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriod valuePeriod;
	/**
	 * Period on which the calculation is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmYieldCalculation
	 * DateTimePeriod.mmYieldCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValuePeriod
	 * YieldCalculation1.mmValuePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValuePeriod
	 * YieldCalculation2.mmValuePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValuePeriod
	 * YieldCalculation3.mmValuePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period on which the calculation is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValuePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmValuePeriod, YieldCalculation2.mmValuePeriod, YieldCalculation3.mmValuePeriod);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected ISODateTime yieldCalculationDate;
	/**
	 * Clarifies the yield irregularities associated with the date to which the
	 * yield has been calculated, eg, when it falls on a non-business day.
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmCalculationDate
	 * YieldCalculation1.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmCalculationDate
	 * YieldCalculation2.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmCalculationDate
	 * YieldCalculation3.mmCalculationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clarifies the yield irregularities associated with the date to which the yield has been calculated, eg, when it falls on a non-business day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmYieldCalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmCalculationDate, YieldCalculation2.mmCalculationDate, YieldCalculation3.mmCalculationDate);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldCalculationDate";
			definition = "Clarifies the yield irregularities associated with the date to which the yield has been calculated, eg, when it falls on a non-business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected RateAndAmount yieldRange;
	/**
	 * Range of allowed yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRelatedYieldCalculation
	 * RateAndAmount.mmRelatedYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmYieldRange
	 * Debt2.mmYieldRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of allowed yield."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmYieldRange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Debt2.mmYieldRange);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldRange";
			definition = "Range of allowed yield.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmRelatedYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.VariableInterest> variableInterest;
	/**
	 * Variable interest used for the calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmYieldCalculation
	 * VariableInterest.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable interest used for the calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariableInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest used for the calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "YieldCalculation";
				definition = "Characteristics related to the yield.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmYieldCalculation, com.tools20022.repository.entity.DateTimePeriod.mmYieldCalculation,
						com.tools20022.repository.entity.VariableInterest.mmYieldCalculation, com.tools20022.repository.entity.RateAndAmount.mmRelatedYieldCalculation);
				derivationElement_lazy = () -> Arrays.asList(SingleQuote1.mmMidYield, SingleQuote1.mmBidYield, SingleQuote1.mmOfferYield, QuoteRequest1.mmYieldDetails, Quote1.mmOfferYield, Quote1.mmMidYield, Quote1.mmBidYield);
				element_lazy = () -> Arrays.asList(YieldCalculation.mmRedemptionPrice, YieldCalculation.mmValue, YieldCalculation.mmCalculationType, YieldCalculation.mmValueDate, YieldCalculation.mmValuePeriod,
						YieldCalculation.mmYieldCalculationDate, YieldCalculation.mmYieldRange, YieldCalculation.mmVariableInterest);
				derivationComponent_lazy = () -> Arrays.asList(YieldCalculation1.mmObject(), YieldCalculation2.mmObject(), CalculationType2Choice.mmObject(), YieldCalculation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPricing getRedemptionPrice() {
		return redemptionPrice;
	}

	public void setRedemptionPrice(com.tools20022.repository.entity.SecuritiesPricing redemptionPrice) {
		this.redemptionPrice = redemptionPrice;
	}

	public PercentageRate getValue() {
		return value;
	}

	public void setValue(PercentageRate value) {
		this.value = value;
	}

	public CalculationTypeCode getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(CalculationTypeCode calculationType) {
		this.calculationType = calculationType;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODateTime valueDate) {
		this.valueDate = valueDate;
	}

	public DateTimePeriod getValuePeriod() {
		return valuePeriod;
	}

	public void setValuePeriod(com.tools20022.repository.entity.DateTimePeriod valuePeriod) {
		this.valuePeriod = valuePeriod;
	}

	public ISODateTime getYieldCalculationDate() {
		return yieldCalculationDate;
	}

	public void setYieldCalculationDate(ISODateTime yieldCalculationDate) {
		this.yieldCalculationDate = yieldCalculationDate;
	}

	public RateAndAmount getYieldRange() {
		return yieldRange;
	}

	public void setYieldRange(com.tools20022.repository.entity.RateAndAmount yieldRange) {
		this.yieldRange = yieldRange;
	}

	public List<VariableInterest> getVariableInterest() {
		return variableInterest;
	}

	public void setVariableInterest(List<com.tools20022.repository.entity.VariableInterest> variableInterest) {
		this.variableInterest = variableInterest;
	}
}