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
import com.tools20022.repository.choice.CalculationType3Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice9Choice;
import com.tools20022.repository.codeset.CalculationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.RateAndAmount;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.VariableInterest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.choice.CalculationType3Choice
 * CalculationType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation5
 * YieldCalculation5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "YieldCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics related to the yield."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class YieldCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing redemptionPrice;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
	 * SecuritiesPricing.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmRedemptionPrice
	 * YieldCalculation5.mmRedemptionPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price on which the yield is computed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<YieldCalculation, Optional<SecuritiesPricing>> mmRedemptionPrice = new MMBusinessAssociationEnd<YieldCalculation, Optional<SecuritiesPricing>>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmRedemptionPrice, YieldCalculation2.mmRedemptionPrice, YieldCalculation3.mmRedemptionPrice, YieldCalculation5.mmRedemptionPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionPrice";
			definition = "Price on which the yield is computed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesPricing.mmYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public Optional<SecuritiesPricing> getValue(YieldCalculation obj) {
			return obj.getRedemptionPrice();
		}

		@Override
		public void setValue(YieldCalculation obj, Optional<SecuritiesPricing> value) {
			obj.setRedemptionPrice(value.orElse(null));
		}
	};
	protected PercentageRate value;
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
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValue
	 * YieldCalculation1.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValue
	 * YieldCalculation2.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValue
	 * YieldCalculation3.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmYield
	 * SecuritiesTransactionPrice2Choice.mmYield}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation5#mmValue
	 * YieldCalculation5.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice9Choice#mmYield
	 * SecuritiesTransactionPrice9Choice.mmYield}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the yield calculation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<YieldCalculation, PercentageRate> mmValue = new MMBusinessAttribute<YieldCalculation, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmValue, YieldCalculation2.mmValue, YieldCalculation3.mmValue, SecuritiesTransactionPrice2Choice.mmYield, YieldCalculation5.mmValue,
					SecuritiesTransactionPrice9Choice.mmYield);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Result of the yield calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(YieldCalculation obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(YieldCalculation obj, PercentageRate value) {
			obj.setValue(value);
		}
	};
	protected CalculationTypeCode calculationType;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CalculationType3Choice#mmCode
	 * CalculationType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CalculationType3Choice#mmProprietary
	 * CalculationType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmCalculationType
	 * YieldCalculation5.mmCalculationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of calculation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<YieldCalculation, CalculationTypeCode> mmCalculationType = new MMBusinessAttribute<YieldCalculation, CalculationTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmCalculationType, YieldCalculation2.mmCalculationType, Order16.mmYieldType, Order14.mmYieldType, CalculationType2Choice.mmCode, CalculationType2Choice.mmProprietary,
					YieldCalculation3.mmCalculationType, Order6.mmYieldDetails, Order17.mmYieldType, Order18.mmYieldType, CalculationType3Choice.mmCode, CalculationType3Choice.mmProprietary, YieldCalculation5.mmCalculationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationTypeCode.mmObject();
		}

		@Override
		public CalculationTypeCode getValue(YieldCalculation obj) {
			return obj.getCalculationType();
		}

		@Override
		public void setValue(YieldCalculation obj, CalculationTypeCode value) {
			obj.setCalculationType(value);
		}
	};
	protected ISODateTime valueDate;
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValueDateTime
	 * YieldCalculation1.mmValueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValueDate
	 * YieldCalculation2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValueDate
	 * YieldCalculation3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmValueDate
	 * YieldCalculation5.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<YieldCalculation, ISODateTime> mmValueDate = new MMBusinessAttribute<YieldCalculation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmValueDateTime, YieldCalculation2.mmValueDate, YieldCalculation3.mmValueDate, YieldCalculation5.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(YieldCalculation obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(YieldCalculation obj, ISODateTime value) {
			obj.setValueDate(value);
		}
	};
	protected DateTimePeriod valuePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmYieldCalculation
	 * DateTimePeriod.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmValuePeriod
	 * YieldCalculation5.mmValuePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period on which the calculation is based."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<YieldCalculation, DateTimePeriod> mmValuePeriod = new MMBusinessAssociationEnd<YieldCalculation, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmValuePeriod, YieldCalculation2.mmValuePeriod, YieldCalculation3.mmValuePeriod, YieldCalculation5.mmValuePeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(YieldCalculation obj) {
			return obj.getValuePeriod();
		}

		@Override
		public void setValue(YieldCalculation obj, DateTimePeriod value) {
			obj.setValuePeriod(value);
		}
	};
	protected ISODateTime yieldCalculationDate;
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmCalculationDate
	 * YieldCalculation1.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmCalculationDate
	 * YieldCalculation2.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmCalculationDate
	 * YieldCalculation3.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmCalculationDate
	 * YieldCalculation5.mmCalculationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clarifies the yield irregularities associated with the date to which the yield has been calculated, eg, when it falls on a non-business day."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<YieldCalculation, ISODateTime> mmYieldCalculationDate = new MMBusinessAttribute<YieldCalculation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldCalculation1.mmCalculationDate, YieldCalculation2.mmCalculationDate, YieldCalculation3.mmCalculationDate, YieldCalculation5.mmCalculationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldCalculationDate";
			definition = "Clarifies the yield irregularities associated with the date to which the yield has been calculated, eg, when it falls on a non-business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(YieldCalculation obj) {
			return obj.getYieldCalculationDate();
		}

		@Override
		public void setValue(YieldCalculation obj, ISODateTime value) {
			obj.setYieldCalculationDate(value);
		}
	};
	protected RateAndAmount yieldRange;
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRelatedYieldCalculation
	 * RateAndAmount.mmRelatedYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmYieldRange
	 * Debt2.mmYieldRange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmYieldRange
	 * Debt3.mmYieldRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of allowed yield."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<YieldCalculation, RateAndAmount> mmYieldRange = new MMBusinessAssociationEnd<YieldCalculation, RateAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt2.mmYieldRange, Debt3.mmYieldRange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldRange";
			definition = "Range of allowed yield.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RateAndAmount.mmRelatedYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}

		@Override
		public RateAndAmount getValue(YieldCalculation obj) {
			return obj.getYieldRange();
		}

		@Override
		public void setValue(YieldCalculation obj, RateAndAmount value) {
			obj.setYieldRange(value);
		}
	};
	protected List<VariableInterest> variableInterest;
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmYieldCalculation
	 * VariableInterest.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable interest used for the calculation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<YieldCalculation, List<VariableInterest>> mmVariableInterest = new MMBusinessAssociationEnd<YieldCalculation, List<VariableInterest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest used for the calculation.";
			minOccurs = 0;
			opposite_lazy = () -> VariableInterest.mmYieldCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> VariableInterest.mmObject();
		}

		@Override
		public List<VariableInterest> getValue(YieldCalculation obj) {
			return obj.getVariableInterest();
		}

		@Override
		public void setValue(YieldCalculation obj, List<VariableInterest> value) {
			obj.setVariableInterest(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "YieldCalculation";
				definition = "Characteristics related to the yield.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmYieldCalculation, DateTimePeriod.mmYieldCalculation, VariableInterest.mmYieldCalculation, RateAndAmount.mmRelatedYieldCalculation);
				derivationElement_lazy = () -> Arrays.asList(SingleQuote1.mmMidYield, SingleQuote1.mmBidYield, SingleQuote1.mmOfferYield, QuoteRequest1.mmYieldDetails, Quote1.mmOfferYield, Quote1.mmMidYield, Quote1.mmBidYield);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.YieldCalculation.mmRedemptionPrice, com.tools20022.repository.entity.YieldCalculation.mmValue,
						com.tools20022.repository.entity.YieldCalculation.mmCalculationType, com.tools20022.repository.entity.YieldCalculation.mmValueDate, com.tools20022.repository.entity.YieldCalculation.mmValuePeriod,
						com.tools20022.repository.entity.YieldCalculation.mmYieldCalculationDate, com.tools20022.repository.entity.YieldCalculation.mmYieldRange, com.tools20022.repository.entity.YieldCalculation.mmVariableInterest);
				derivationComponent_lazy = () -> Arrays.asList(YieldCalculation1.mmObject(), YieldCalculation2.mmObject(), CalculationType2Choice.mmObject(), YieldCalculation3.mmObject(), CalculationType3Choice.mmObject(),
						YieldCalculation5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return YieldCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecuritiesPricing> getRedemptionPrice() {
		return redemptionPrice == null ? Optional.empty() : Optional.of(redemptionPrice);
	}

	public YieldCalculation setRedemptionPrice(SecuritiesPricing redemptionPrice) {
		this.redemptionPrice = redemptionPrice;
		return this;
	}

	public PercentageRate getValue() {
		return value;
	}

	public YieldCalculation setValue(PercentageRate value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public CalculationTypeCode getCalculationType() {
		return calculationType;
	}

	public YieldCalculation setCalculationType(CalculationTypeCode calculationType) {
		this.calculationType = Objects.requireNonNull(calculationType);
		return this;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public YieldCalculation setValueDate(ISODateTime valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public DateTimePeriod getValuePeriod() {
		return valuePeriod;
	}

	public YieldCalculation setValuePeriod(DateTimePeriod valuePeriod) {
		this.valuePeriod = Objects.requireNonNull(valuePeriod);
		return this;
	}

	public ISODateTime getYieldCalculationDate() {
		return yieldCalculationDate;
	}

	public YieldCalculation setYieldCalculationDate(ISODateTime yieldCalculationDate) {
		this.yieldCalculationDate = Objects.requireNonNull(yieldCalculationDate);
		return this;
	}

	public RateAndAmount getYieldRange() {
		return yieldRange;
	}

	public YieldCalculation setYieldRange(RateAndAmount yieldRange) {
		this.yieldRange = Objects.requireNonNull(yieldRange);
		return this;
	}

	public List<VariableInterest> getVariableInterest() {
		return variableInterest == null ? variableInterest = new ArrayList<>() : variableInterest;
	}

	public YieldCalculation setVariableInterest(List<VariableInterest> variableInterest) {
		this.variableInterest = Objects.requireNonNull(variableInterest);
		return this;
	}
}