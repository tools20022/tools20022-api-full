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
import com.tools20022.repository.choice.CalculationType2Choice;
import com.tools20022.repository.codeset.CalculationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.YieldCalculation1;
import com.tools20022.repository.msg.YieldCalculation2;
import com.tools20022.repository.msg.YieldCalculation3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics related to the yield.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="YieldCalculation" src="doc-files/YieldCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#RedemptionPrice
 * YieldCalculation.RedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.YieldCalculation#Value
 * YieldCalculation.Value}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#CalculationType
 * YieldCalculation.CalculationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.YieldCalculation#ValueDate
 * YieldCalculation.ValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#ValuePeriod
 * YieldCalculation.ValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#YieldCalculationDate
 * YieldCalculation.YieldCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.YieldCalculation#YieldRange
 * YieldCalculation.YieldRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#VariableInterest
 * YieldCalculation.VariableInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#YieldCalculation
 * SecuritiesPricing.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#YieldCalculation
 * DateTimePeriod.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#YieldCalculation
 * VariableInterest.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RelatedYieldCalculation
 * RateAndAmount.RelatedYieldCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#MidYield
 * SingleQuote1.MidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#BidYield
 * SingleQuote1.BidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#OfferYield
 * SingleQuote1.OfferYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#YieldDetails
 * QuoteRequest1.YieldDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#OfferYield
 * Quote1.OfferYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#MidYield
 * Quote1.MidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#BidYield
 * Quote1.BidYield}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Price on which the yield is computed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#YieldCalculation
	 * SecuritiesPricing.YieldCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#RedemptionPrice
	 * YieldCalculation1.RedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#RedemptionPrice
	 * YieldCalculation2.RedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#RedemptionPrice
	 * YieldCalculation3.RedemptionPrice}</li>
	 * </ul>
	 * </li>
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
	 * name} = "RedemptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price on which the yield is computed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RedemptionPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation1.RedemptionPrice, com.tools20022.repository.msg.YieldCalculation2.RedemptionPrice,
					com.tools20022.repository.msg.YieldCalculation3.RedemptionPrice);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionPrice";
			definition = "Price on which the yield is computed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.YieldCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation1#Value
	 * YieldCalculation1.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation2#Value
	 * YieldCalculation2.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation3#Value
	 * YieldCalculation3.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#Yield
	 * SecuritiesTransactionPrice2Choice.Yield}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the yield calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation1.Value, com.tools20022.repository.msg.YieldCalculation2.Value, com.tools20022.repository.msg.YieldCalculation3.Value,
					com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.Yield);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Result of the yield calculation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#CalculationType
	 * YieldCalculation1.CalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#CalculationType
	 * YieldCalculation2.CalculationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#YieldType
	 * Order16.YieldType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#YieldType
	 * Order14.YieldType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CalculationType2Choice#Code
	 * CalculationType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CalculationType2Choice#Proprietary
	 * CalculationType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#CalculationType
	 * YieldCalculation3.CalculationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#YieldDetails
	 * Order6.YieldDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#YieldType
	 * Order17.YieldType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#YieldType
	 * Order18.YieldType}</li>
	 * </ul>
	 * </li>
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
	 * name} = "CalculationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation1.CalculationType, com.tools20022.repository.msg.YieldCalculation2.CalculationType, com.tools20022.repository.msg.Order16.YieldType,
					com.tools20022.repository.msg.Order14.YieldType, com.tools20022.repository.choice.CalculationType2Choice.Code, com.tools20022.repository.choice.CalculationType2Choice.Proprietary,
					com.tools20022.repository.msg.YieldCalculation3.CalculationType, com.tools20022.repository.msg.Order6.YieldDetails, com.tools20022.repository.msg.Order17.YieldType, com.tools20022.repository.msg.Order18.YieldType);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CalculationTypeCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#ValueDateTime
	 * YieldCalculation1.ValueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#ValueDate
	 * YieldCalculation2.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#ValueDate
	 * YieldCalculation3.ValueDate}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation1.ValueDateTime, com.tools20022.repository.msg.YieldCalculation2.ValueDate, com.tools20022.repository.msg.YieldCalculation3.ValueDate);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period on which the calculation is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#YieldCalculation
	 * DateTimePeriod.YieldCalculation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#ValuePeriod
	 * YieldCalculation1.ValuePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#ValuePeriod
	 * YieldCalculation2.ValuePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#ValuePeriod
	 * YieldCalculation3.ValuePeriod}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ValuePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period on which the calculation is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValuePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation1.ValuePeriod, com.tools20022.repository.msg.YieldCalculation2.ValuePeriod, com.tools20022.repository.msg.YieldCalculation3.ValuePeriod);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.YieldCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#CalculationDate
	 * YieldCalculation1.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#CalculationDate
	 * YieldCalculation2.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#CalculationDate
	 * YieldCalculation3.CalculationDate}</li>
	 * </ul>
	 * </li>
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
	 * name} = "YieldCalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clarifies the yield irregularities associated with the date to which the yield has been calculated, eg, when it falls on a non-business day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute YieldCalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation1.CalculationDate, com.tools20022.repository.msg.YieldCalculation2.CalculationDate,
					com.tools20022.repository.msg.YieldCalculation3.CalculationDate);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculationDate";
			definition = "Clarifies the yield irregularities associated with the date to which the yield has been calculated, eg, when it falls on a non-business day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Range of allowed yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RelatedYieldCalculation
	 * RateAndAmount.RelatedYieldCalculation}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#YieldRange
	 * Debt2.YieldRange}</li>
	 * </ul>
	 * </li>
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
	 * name} = "YieldRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of allowed yield."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd YieldRange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt2.YieldRange);
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldRange";
			definition = "Range of allowed yield.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.RelatedYieldCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Variable interest used for the calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#YieldCalculation
	 * VariableInterest.YieldCalculation}</li>
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
	public static final MMBusinessAssociationEnd VariableInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> YieldCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest used for the calculation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.YieldCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "YieldCalculation";
				definition = "Characteristics related to the yield.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.YieldCalculation, com.tools20022.repository.entity.DateTimePeriod.YieldCalculation,
						com.tools20022.repository.entity.VariableInterest.YieldCalculation, com.tools20022.repository.entity.RateAndAmount.RelatedYieldCalculation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleQuote1.MidYield, com.tools20022.repository.msg.SingleQuote1.BidYield, com.tools20022.repository.msg.SingleQuote1.OfferYield,
						com.tools20022.repository.msg.QuoteRequest1.YieldDetails, com.tools20022.repository.msg.Quote1.OfferYield, com.tools20022.repository.msg.Quote1.MidYield, com.tools20022.repository.msg.Quote1.BidYield);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.YieldCalculation.RedemptionPrice, com.tools20022.repository.entity.YieldCalculation.Value,
						com.tools20022.repository.entity.YieldCalculation.CalculationType, com.tools20022.repository.entity.YieldCalculation.ValueDate, com.tools20022.repository.entity.YieldCalculation.ValuePeriod,
						com.tools20022.repository.entity.YieldCalculation.YieldCalculationDate, com.tools20022.repository.entity.YieldCalculation.YieldRange, com.tools20022.repository.entity.YieldCalculation.VariableInterest);
				derivationComponent_lazy = () -> Arrays.asList(YieldCalculation1.mmObject(), YieldCalculation2.mmObject(), CalculationType2Choice.mmObject(), YieldCalculation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}