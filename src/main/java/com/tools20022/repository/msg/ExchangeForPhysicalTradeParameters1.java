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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ExchangeForPhysicalTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Technique whereby a position in the underlying is traded for a futures
 * position in the physical commodity markets.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1#mmOutsideIndex
 * ExchangeForPhysicalTradeParameters1.mmOutsideIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1#mmFairValue
 * ExchangeForPhysicalTradeParameters1.mmFairValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1#mmValueForFutures
 * ExchangeForPhysicalTradeParameters1.mmValueForFutures}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
 * ExchangeForPhysicalTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangeForPhysicalTradeParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets."
 * </li>
 * </ul>
 */
public class ExchangeForPhysicalTradeParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate outsideIndex;
	/**
	 * Unexpected divergence between the price behaviour of an underlying
	 * position or portfolio and the price behaviour of a hedging position or
	 * benchmark.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmOutsideIndex
	 * ExchangeForPhysicalTrade.mmOutsideIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1
	 * ExchangeForPhysicalTradeParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutsideIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unexpected divergence between the price behaviour of an underlying position or portfolio and the price behaviour of a hedging position or benchmark."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutsideIndex = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmOutsideIndex;
			componentContext_lazy = () -> ExchangeForPhysicalTradeParameters1.mmObject();
			isDerived = false;
			xmlTag = "OutsdIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutsideIndex";
			definition = "Unexpected divergence between the price behaviour of an underlying position or portfolio and the price behaviour of a hedging position or benchmark.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount fairValue;
	/**
	 * Difference between the value of a future and the value of the underlying
	 * equities after allowing for the discounted cash flows associated with the
	 * underlying stocks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmFairValue
	 * ExchangeForPhysicalTrade.mmFairValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1
	 * ExchangeForPhysicalTradeParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FairVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FairValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFairValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmFairValue;
			componentContext_lazy = () -> ExchangeForPhysicalTradeParameters1.mmObject();
			isDerived = false;
			xmlTag = "FairVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FairValue";
			definition = "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount valueForFutures;
	/**
	 * Value of a futures position involved in an Exchange For Physical trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmValueForFutures
	 * ExchangeForPhysicalTrade.mmValueForFutures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1
	 * ExchangeForPhysicalTradeParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValForFutrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueForFutures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a futures position involved in an Exchange For Physical trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueForFutures = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmValueForFutures;
			componentContext_lazy = () -> ExchangeForPhysicalTradeParameters1.mmObject();
			isDerived = false;
			xmlTag = "ValForFutrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueForFutures";
			definition = "Value of a futures position involved in an Exchange For Physical trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ExchangeForPhysicalTradeParameters1.mmOutsideIndex, ExchangeForPhysicalTradeParameters1.mmFairValue, ExchangeForPhysicalTradeParameters1.mmValueForFutures);
				trace_lazy = () -> ExchangeForPhysicalTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExchangeForPhysicalTradeParameters1";
				definition = "Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getOutsideIndex() {
		return outsideIndex;
	}

	public void setOutsideIndex(PercentageRate outsideIndex) {
		this.outsideIndex = outsideIndex;
	}

	public ActiveCurrencyAndAmount getFairValue() {
		return fairValue;
	}

	public void setFairValue(ActiveCurrencyAndAmount fairValue) {
		this.fairValue = fairValue;
	}

	public ActiveCurrencyAndAmount getValueForFutures() {
		return valueForFutures;
	}

	public void setValueForFutures(ActiveCurrencyAndAmount valueForFutures) {
		this.valueForFutures = valueForFutures;
	}
}