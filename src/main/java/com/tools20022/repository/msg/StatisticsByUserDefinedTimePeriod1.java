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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ValuationStatistics;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails;
import com.tools20022.repository.msg.PriceValue1;
import com.tools20022.repository.msg.PriceValue2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Statistical data related to the price change of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmPeriod
 * StatisticsByUserDefinedTimePeriod1.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmHighestPriceValue
 * StatisticsByUserDefinedTimePeriod1.mmHighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmLowestPriceValue
 * StatisticsByUserDefinedTimePeriod1.mmLowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmPriceChange
 * StatisticsByUserDefinedTimePeriod1.mmPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1#mmYield
 * StatisticsByUserDefinedTimePeriod1.mmYield}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
 * ValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatisticsCurrency2Rule#forStatisticsByUserDefinedTimePeriod1
 * ConstraintStatisticsCurrency2Rule.forStatisticsByUserDefinedTimePeriod1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatisticsByUserDefinedTimePeriod1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Statistical data related to the price change of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatisticsByUserDefinedTimePeriod1", propOrder = {"period", "highestPriceValue", "lowestPriceValue", "priceChange", "yield"})
public class StatisticsByUserDefinedTimePeriod1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prd", required = true)
	protected DateTimePeriodDetails period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPeriod
	 * ValuationStatistics.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1
	 * StatisticsByUserDefinedTimePeriod1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference period for the valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, DateTimePeriodDetails> mmPeriod = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, DateTimePeriodDetails>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Reference period for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public DateTimePeriodDetails getValue(StatisticsByUserDefinedTimePeriod1 obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod1 obj, DateTimePeriodDetails value) {
			obj.setPeriod(value);
		}
	};
	@XmlElement(name = "HghstPricVal")
	protected PriceValue1 highestPriceValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
	 * ValuationStatistics.mmHighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1
	 * StatisticsByUserDefinedTimePeriod1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghstPricVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighestPriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Highest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PriceValue1>> mmHighestPriceValue = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmHighestPriceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmObject();
			isDerived = false;
			xmlTag = "HghstPricVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighestPriceValue";
			definition = "Highest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public Optional<PriceValue1> getValue(StatisticsByUserDefinedTimePeriod1 obj) {
			return obj.getHighestPriceValue();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod1 obj, Optional<PriceValue1> value) {
			obj.setHighestPriceValue(value.orElse(null));
		}
	};
	@XmlElement(name = "LwstPricVal")
	protected PriceValue1 lowestPriceValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
	 * ValuationStatistics.mmLowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1
	 * StatisticsByUserDefinedTimePeriod1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LwstPricVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowestPriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lowest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PriceValue1>> mmLowestPriceValue = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmLowestPriceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmObject();
			isDerived = false;
			xmlTag = "LwstPricVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowestPriceValue";
			definition = "Lowest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public Optional<PriceValue1> getValue(StatisticsByUserDefinedTimePeriod1 obj) {
			return obj.getLowestPriceValue();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod1 obj, Optional<PriceValue1> value) {
			obj.setLowestPriceValue(value.orElse(null));
		}
	};
	@XmlElement(name = "PricChng")
	protected PriceValue2 priceChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue2
	 * PriceValue2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
	 * ValuationStatistics.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1
	 * StatisticsByUserDefinedTimePeriod1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in price since the last valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PriceValue2>> mmPriceChange = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PriceValue2>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmObject();
			isDerived = false;
			xmlTag = "PricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceChange";
			definition = "Change in price since the last valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue2.mmObject();
		}

		@Override
		public Optional<PriceValue2> getValue(StatisticsByUserDefinedTimePeriod1 obj) {
			return obj.getPriceChange();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod1 obj, Optional<PriceValue2> value) {
			obj.setPriceChange(value.orElse(null));
		}
	};
	@XmlElement(name = "Yld")
	protected PercentageRate yield;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmYield
	 * ValuationStatistics.mmYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1
	 * StatisticsByUserDefinedTimePeriod1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Yld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PercentageRate>> mmYield = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmYield;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmObject();
			isDerived = false;
			xmlTag = "Yld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yield";
			definition = "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(StatisticsByUserDefinedTimePeriod1 obj) {
			return obj.getYield();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod1 obj, Optional<PercentageRate> value) {
			obj.setYield(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmPeriod, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmHighestPriceValue,
						com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmLowestPriceValue, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmPriceChange,
						com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod1.mmYield);
				trace_lazy = () -> ValuationStatistics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatisticsCurrency2Rule.forStatisticsByUserDefinedTimePeriod1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticsByUserDefinedTimePeriod1";
				definition = "Statistical data related to the price change of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriodDetails getPeriod() {
		return period;
	}

	public StatisticsByUserDefinedTimePeriod1 setPeriod(DateTimePeriodDetails period) {
		this.period = Objects.requireNonNull(period);
		return this;
	}

	public Optional<PriceValue1> getHighestPriceValue() {
		return highestPriceValue == null ? Optional.empty() : Optional.of(highestPriceValue);
	}

	public StatisticsByUserDefinedTimePeriod1 setHighestPriceValue(PriceValue1 highestPriceValue) {
		this.highestPriceValue = highestPriceValue;
		return this;
	}

	public Optional<PriceValue1> getLowestPriceValue() {
		return lowestPriceValue == null ? Optional.empty() : Optional.of(lowestPriceValue);
	}

	public StatisticsByUserDefinedTimePeriod1 setLowestPriceValue(PriceValue1 lowestPriceValue) {
		this.lowestPriceValue = lowestPriceValue;
		return this;
	}

	public Optional<PriceValue2> getPriceChange() {
		return priceChange == null ? Optional.empty() : Optional.of(priceChange);
	}

	public StatisticsByUserDefinedTimePeriod1 setPriceChange(PriceValue2 priceChange) {
		this.priceChange = priceChange;
		return this;
	}

	public Optional<PercentageRate> getYield() {
		return yield == null ? Optional.empty() : Optional.of(yield);
	}

	public StatisticsByUserDefinedTimePeriod1 setYield(PercentageRate yield) {
		this.yield = yield;
		return this;
	}
}