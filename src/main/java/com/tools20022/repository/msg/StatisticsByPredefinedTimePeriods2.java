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
import com.tools20022.repository.entity.ValuationStatistics;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PriceValue5;
import com.tools20022.repository.msg.PriceValueChange1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmHighestPriceValue12Months
 * StatisticsByPredefinedTimePeriods2.mmHighestPriceValue12Months}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmLowestPriceValue12Months
 * StatisticsByPredefinedTimePeriods2.mmLowestPriceValue12Months}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmOneYearPriceChange
 * StatisticsByPredefinedTimePeriods2.mmOneYearPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmThreeYearPriceChange
 * StatisticsByPredefinedTimePeriods2.mmThreeYearPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2#mmFiveYearPriceChange
 * StatisticsByPredefinedTimePeriods2.mmFiveYearPriceChange}</li>
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
 * "StatisticsByPredefinedTimePeriods2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Statistical data related to the price change of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatisticsByPredefinedTimePeriods2", propOrder = {"highestPriceValue12Months", "lowestPriceValue12Months", "oneYearPriceChange", "threeYearPriceChange", "fiveYearPriceChange"})
public class StatisticsByPredefinedTimePeriods2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HghstPricVal12Mnths")
	protected PriceValue5 highestPriceValue12Months;
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2
	 * StatisticsByPredefinedTimePeriods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghstPricVal12Mnths"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighestPriceValue12Months"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Highest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValue5>> mmHighestPriceValue12Months = new MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValue5>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmHighestPriceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmObject();
			isDerived = false;
			xmlTag = "HghstPricVal12Mnths";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighestPriceValue12Months";
			definition = "Highest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue5.mmObject();
		}

		@Override
		public Optional<PriceValue5> getValue(StatisticsByPredefinedTimePeriods2 obj) {
			return obj.getHighestPriceValue12Months();
		}

		@Override
		public void setValue(StatisticsByPredefinedTimePeriods2 obj, Optional<PriceValue5> value) {
			obj.setHighestPriceValue12Months(value.orElse(null));
		}
	};
	@XmlElement(name = "LwstPricVal12Mnths")
	protected PriceValue5 lowestPriceValue12Months;
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2
	 * StatisticsByPredefinedTimePeriods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LwstPricVal12Mnths"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowestPriceValue12Months"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lowest price for the referenced period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValue5>> mmLowestPriceValue12Months = new MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValue5>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmLowestPriceValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmObject();
			isDerived = false;
			xmlTag = "LwstPricVal12Mnths";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowestPriceValue12Months";
			definition = "Lowest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue5.mmObject();
		}

		@Override
		public Optional<PriceValue5> getValue(StatisticsByPredefinedTimePeriods2 obj) {
			return obj.getLowestPriceValue12Months();
		}

		@Override
		public void setValue(StatisticsByPredefinedTimePeriods2 obj, Optional<PriceValue5> value) {
			obj.setLowestPriceValue12Months(value.orElse(null));
		}
	};
	@XmlElement(name = "OneYrPricChng")
	protected PriceValueChange1 oneYearPriceChange;
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2
	 * StatisticsByPredefinedTimePeriods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OneYrPricChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYearPriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in price over a one year period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValueChange1>> mmOneYearPriceChange = new MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValueChange1>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmObject();
			isDerived = false;
			xmlTag = "OneYrPricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYearPriceChange";
			definition = "Change in price over a one year period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValueChange1.mmObject();
		}

		@Override
		public Optional<PriceValueChange1> getValue(StatisticsByPredefinedTimePeriods2 obj) {
			return obj.getOneYearPriceChange();
		}

		@Override
		public void setValue(StatisticsByPredefinedTimePeriods2 obj, Optional<PriceValueChange1> value) {
			obj.setOneYearPriceChange(value.orElse(null));
		}
	};
	@XmlElement(name = "ThreeYrPricChng")
	protected PriceValueChange1 threeYearPriceChange;
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2
	 * StatisticsByPredefinedTimePeriods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThreeYrPricChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYearPriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in price over a three year period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValueChange1>> mmThreeYearPriceChange = new MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValueChange1>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmObject();
			isDerived = false;
			xmlTag = "ThreeYrPricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYearPriceChange";
			definition = "Change in price over a three year period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValueChange1.mmObject();
		}

		@Override
		public Optional<PriceValueChange1> getValue(StatisticsByPredefinedTimePeriods2 obj) {
			return obj.getThreeYearPriceChange();
		}

		@Override
		public void setValue(StatisticsByPredefinedTimePeriods2 obj, Optional<PriceValueChange1> value) {
			obj.setThreeYearPriceChange(value.orElse(null));
		}
	};
	@XmlElement(name = "FiveYrPricChng")
	protected PriceValueChange1 fiveYearPriceChange;
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2
	 * StatisticsByPredefinedTimePeriods2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FiveYrPricChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveYearPriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in price over a five year period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValueChange1>> mmFiveYearPriceChange = new MMMessageAttribute<StatisticsByPredefinedTimePeriods2, Optional<PriceValueChange1>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmObject();
			isDerived = false;
			xmlTag = "FiveYrPricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveYearPriceChange";
			definition = "Change in price over a five year period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValueChange1.mmObject();
		}

		@Override
		public Optional<PriceValueChange1> getValue(StatisticsByPredefinedTimePeriods2 obj) {
			return obj.getFiveYearPriceChange();
		}

		@Override
		public void setValue(StatisticsByPredefinedTimePeriods2 obj, Optional<PriceValueChange1> value) {
			obj.setFiveYearPriceChange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmHighestPriceValue12Months,
						com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmLowestPriceValue12Months, com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmOneYearPriceChange,
						com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmThreeYearPriceChange, com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmFiveYearPriceChange);
				trace_lazy = () -> ValuationStatistics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticsByPredefinedTimePeriods2";
				definition = "Statistical data related to the price change of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceValue5> getHighestPriceValue12Months() {
		return highestPriceValue12Months == null ? Optional.empty() : Optional.of(highestPriceValue12Months);
	}

	public StatisticsByPredefinedTimePeriods2 setHighestPriceValue12Months(PriceValue5 highestPriceValue12Months) {
		this.highestPriceValue12Months = highestPriceValue12Months;
		return this;
	}

	public Optional<PriceValue5> getLowestPriceValue12Months() {
		return lowestPriceValue12Months == null ? Optional.empty() : Optional.of(lowestPriceValue12Months);
	}

	public StatisticsByPredefinedTimePeriods2 setLowestPriceValue12Months(PriceValue5 lowestPriceValue12Months) {
		this.lowestPriceValue12Months = lowestPriceValue12Months;
		return this;
	}

	public Optional<PriceValueChange1> getOneYearPriceChange() {
		return oneYearPriceChange == null ? Optional.empty() : Optional.of(oneYearPriceChange);
	}

	public StatisticsByPredefinedTimePeriods2 setOneYearPriceChange(PriceValueChange1 oneYearPriceChange) {
		this.oneYearPriceChange = oneYearPriceChange;
		return this;
	}

	public Optional<PriceValueChange1> getThreeYearPriceChange() {
		return threeYearPriceChange == null ? Optional.empty() : Optional.of(threeYearPriceChange);
	}

	public StatisticsByPredefinedTimePeriods2 setThreeYearPriceChange(PriceValueChange1 threeYearPriceChange) {
		this.threeYearPriceChange = threeYearPriceChange;
		return this;
	}

	public Optional<PriceValueChange1> getFiveYearPriceChange() {
		return fiveYearPriceChange == null ? Optional.empty() : Optional.of(fiveYearPriceChange);
	}

	public StatisticsByPredefinedTimePeriods2 setFiveYearPriceChange(PriceValueChange1 fiveYearPriceChange) {
		this.fiveYearPriceChange = fiveYearPriceChange;
		return this;
	}
}