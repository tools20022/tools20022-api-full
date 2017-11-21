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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmHighestPriceValue12Months
 * StatisticsByPredefinedTimePeriods1.mmHighestPriceValue12Months}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmLowestPriceValue12Months
 * StatisticsByPredefinedTimePeriods1.mmLowestPriceValue12Months}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmOneYearPriceChange
 * StatisticsByPredefinedTimePeriods1.mmOneYearPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmThreeYearPriceChange
 * StatisticsByPredefinedTimePeriods1.mmThreeYearPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1#mmFiveYearPriceChange
 * StatisticsByPredefinedTimePeriods1.mmFiveYearPriceChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
 * ValuationStatistics}</li>
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
 * "StatisticsByPredefinedTimePeriods1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Statistical data related to the price change of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatisticsByPredefinedTimePeriods1", propOrder = {"highestPriceValue12Months", "lowestPriceValue12Months", "oneYearPriceChange", "threeYearPriceChange", "fiveYearPriceChange"})
public class StatisticsByPredefinedTimePeriods1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceValue1 highestPriceValue12Months;
	/**
	 * Highest price for the referenced period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1
	 * StatisticsByPredefinedTimePeriods1}</li>
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
	public static final MMMessageAttribute mmHighestPriceValue12Months = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmHighestPriceValue;
			componentContext_lazy = () -> StatisticsByPredefinedTimePeriods1.mmObject();
			isDerived = false;
			xmlTag = "HghstPricVal12Mnths";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighestPriceValue12Months";
			definition = "Highest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	protected PriceValue1 lowestPriceValue12Months;
	/**
	 * Lowest price for the referenced period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1
	 * StatisticsByPredefinedTimePeriods1}</li>
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
	public static final MMMessageAttribute mmLowestPriceValue12Months = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmLowestPriceValue;
			componentContext_lazy = () -> StatisticsByPredefinedTimePeriods1.mmObject();
			isDerived = false;
			xmlTag = "LwstPricVal12Mnths";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowestPriceValue12Months";
			definition = "Lowest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	protected PriceValue2 oneYearPriceChange;
	/**
	 * Change in price over a one year period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1
	 * StatisticsByPredefinedTimePeriods1}</li>
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
	public static final MMMessageAttribute mmOneYearPriceChange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> StatisticsByPredefinedTimePeriods1.mmObject();
			isDerived = false;
			xmlTag = "OneYrPricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYearPriceChange";
			definition = "Change in price over a one year period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue2.mmObject();
		}
	};
	protected PriceValue2 threeYearPriceChange;
	/**
	 * Change in price over a three year period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1
	 * StatisticsByPredefinedTimePeriods1}</li>
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
	public static final MMMessageAttribute mmThreeYearPriceChange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> StatisticsByPredefinedTimePeriods1.mmObject();
			isDerived = false;
			xmlTag = "ThreeYrPricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYearPriceChange";
			definition = "Change in price over a three year period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue2.mmObject();
		}
	};
	protected PriceValue2 fiveYearPriceChange;
	/**
	 * Change in price over a five year period.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods1
	 * StatisticsByPredefinedTimePeriods1}</li>
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
	public static final MMMessageAttribute mmFiveYearPriceChange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> StatisticsByPredefinedTimePeriods1.mmObject();
			isDerived = false;
			xmlTag = "FiveYrPricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveYearPriceChange";
			definition = "Change in price over a five year period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatisticsByPredefinedTimePeriods1.mmHighestPriceValue12Months, StatisticsByPredefinedTimePeriods1.mmLowestPriceValue12Months,
						StatisticsByPredefinedTimePeriods1.mmOneYearPriceChange, StatisticsByPredefinedTimePeriods1.mmThreeYearPriceChange, StatisticsByPredefinedTimePeriods1.mmFiveYearPriceChange);
				trace_lazy = () -> ValuationStatistics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticsByPredefinedTimePeriods1";
				definition = "Statistical data related to the price change of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "HghstPricVal12Mnths")
	public PriceValue1 getHighestPriceValue12Months() {
		return highestPriceValue12Months;
	}

	public void setHighestPriceValue12Months(com.tools20022.repository.msg.PriceValue1 highestPriceValue12Months) {
		this.highestPriceValue12Months = highestPriceValue12Months;
	}

	@XmlElement(name = "LwstPricVal12Mnths")
	public PriceValue1 getLowestPriceValue12Months() {
		return lowestPriceValue12Months;
	}

	public void setLowestPriceValue12Months(com.tools20022.repository.msg.PriceValue1 lowestPriceValue12Months) {
		this.lowestPriceValue12Months = lowestPriceValue12Months;
	}

	@XmlElement(name = "OneYrPricChng")
	public PriceValue2 getOneYearPriceChange() {
		return oneYearPriceChange;
	}

	public void setOneYearPriceChange(com.tools20022.repository.msg.PriceValue2 oneYearPriceChange) {
		this.oneYearPriceChange = oneYearPriceChange;
	}

	@XmlElement(name = "ThreeYrPricChng")
	public PriceValue2 getThreeYearPriceChange() {
		return threeYearPriceChange;
	}

	public void setThreeYearPriceChange(com.tools20022.repository.msg.PriceValue2 threeYearPriceChange) {
		this.threeYearPriceChange = threeYearPriceChange;
	}

	@XmlElement(name = "FiveYrPricChng")
	public PriceValue2 getFiveYearPriceChange() {
		return fiveYearPriceChange;
	}

	public void setFiveYearPriceChange(com.tools20022.repository.msg.PriceValue2 fiveYearPriceChange) {
		this.fiveYearPriceChange = fiveYearPriceChange;
	}
}