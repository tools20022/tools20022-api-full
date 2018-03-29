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
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ValuationStatistics;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PriceValue5;
import com.tools20022.repository.msg.PriceValueChange1;
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
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmPeriod
 * StatisticsByUserDefinedTimePeriod2.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmHighestPriceValue
 * StatisticsByUserDefinedTimePeriod2.mmHighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmLowestPriceValue
 * StatisticsByUserDefinedTimePeriod2.mmLowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmPriceChange
 * StatisticsByUserDefinedTimePeriod2.mmPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2#mmYield
 * StatisticsByUserDefinedTimePeriod2.mmYield}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatisticsByUserDefinedTimePeriod2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Statistical data related to the price change of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatisticsByUserDefinedTimePeriod2", propOrder = {"period", "highestPriceValue", "lowestPriceValue", "priceChange", "yield"})
public class StatisticsByUserDefinedTimePeriod2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prd", required = true)
	protected DateOrDateTimePeriodChoice period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPeriod
	 * ValuationStatistics.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2
	 * StatisticsByUserDefinedTimePeriod2}</li>
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
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, DateOrDateTimePeriodChoice> mmPeriod = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, DateOrDateTimePeriodChoice>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Reference period for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}

		@Override
		public DateOrDateTimePeriodChoice getValue(StatisticsByUserDefinedTimePeriod2 obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod2 obj, DateOrDateTimePeriodChoice value) {
			obj.setPeriod(value);
		}
	};
	@XmlElement(name = "HghstPricVal")
	protected PriceValue5 highestPriceValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue5
	 * PriceValue5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
	 * ValuationStatistics.mmHighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2
	 * StatisticsByUserDefinedTimePeriod2}</li>
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
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PriceValue5>> mmHighestPriceValue = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PriceValue5>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmHighestPriceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmObject();
			isDerived = false;
			xmlTag = "HghstPricVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighestPriceValue";
			definition = "Highest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue5.mmObject();
		}

		@Override
		public Optional<PriceValue5> getValue(StatisticsByUserDefinedTimePeriod2 obj) {
			return obj.getHighestPriceValue();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod2 obj, Optional<PriceValue5> value) {
			obj.setHighestPriceValue(value.orElse(null));
		}
	};
	@XmlElement(name = "LwstPricVal")
	protected PriceValue5 lowestPriceValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue5
	 * PriceValue5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
	 * ValuationStatistics.mmLowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2
	 * StatisticsByUserDefinedTimePeriod2}</li>
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
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PriceValue5>> mmLowestPriceValue = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PriceValue5>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmLowestPriceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmObject();
			isDerived = false;
			xmlTag = "LwstPricVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowestPriceValue";
			definition = "Lowest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue5.mmObject();
		}

		@Override
		public Optional<PriceValue5> getValue(StatisticsByUserDefinedTimePeriod2 obj) {
			return obj.getLowestPriceValue();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod2 obj, Optional<PriceValue5> value) {
			obj.setLowestPriceValue(value.orElse(null));
		}
	};
	@XmlElement(name = "PricChng")
	protected PriceValueChange1 priceChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PriceValueChange1
	 * PriceValueChange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
	 * ValuationStatistics.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2
	 * StatisticsByUserDefinedTimePeriod2}</li>
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
	 * definition} = "Change in price since the previous valuation date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PriceValueChange1>> mmPriceChange = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PriceValueChange1>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmObject();
			isDerived = false;
			xmlTag = "PricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceChange";
			definition = "Change in price since the previous valuation date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValueChange1.mmObject();
		}

		@Override
		public Optional<PriceValueChange1> getValue(StatisticsByUserDefinedTimePeriod2 obj) {
			return obj.getPriceChange();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod2 obj, Optional<PriceValueChange1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2
	 * StatisticsByUserDefinedTimePeriod2}</li>
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
	public static final MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PercentageRate>> mmYield = new MMMessageAttribute<StatisticsByUserDefinedTimePeriod2, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmYield;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmObject();
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
		public Optional<PercentageRate> getValue(StatisticsByUserDefinedTimePeriod2 obj) {
			return obj.getYield();
		}

		@Override
		public void setValue(StatisticsByUserDefinedTimePeriod2 obj, Optional<PercentageRate> value) {
			obj.setYield(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmPeriod, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmHighestPriceValue,
						com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmLowestPriceValue, com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmPriceChange,
						com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmYield);
				trace_lazy = () -> ValuationStatistics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticsByUserDefinedTimePeriod2";
				definition = "Statistical data related to the price change of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateOrDateTimePeriodChoice getPeriod() {
		return period;
	}

	public StatisticsByUserDefinedTimePeriod2 setPeriod(DateOrDateTimePeriodChoice period) {
		this.period = Objects.requireNonNull(period);
		return this;
	}

	public Optional<PriceValue5> getHighestPriceValue() {
		return highestPriceValue == null ? Optional.empty() : Optional.of(highestPriceValue);
	}

	public StatisticsByUserDefinedTimePeriod2 setHighestPriceValue(PriceValue5 highestPriceValue) {
		this.highestPriceValue = highestPriceValue;
		return this;
	}

	public Optional<PriceValue5> getLowestPriceValue() {
		return lowestPriceValue == null ? Optional.empty() : Optional.of(lowestPriceValue);
	}

	public StatisticsByUserDefinedTimePeriod2 setLowestPriceValue(PriceValue5 lowestPriceValue) {
		this.lowestPriceValue = lowestPriceValue;
		return this;
	}

	public Optional<PriceValueChange1> getPriceChange() {
		return priceChange == null ? Optional.empty() : Optional.of(priceChange);
	}

	public StatisticsByUserDefinedTimePeriod2 setPriceChange(PriceValueChange1 priceChange) {
		this.priceChange = priceChange;
		return this;
	}

	public Optional<PercentageRate> getYield() {
		return yield == null ? Optional.empty() : Optional.of(yield);
	}

	public StatisticsByUserDefinedTimePeriod2 setYield(PercentageRate yield) {
		this.yield = yield;
		return this;
	}
}