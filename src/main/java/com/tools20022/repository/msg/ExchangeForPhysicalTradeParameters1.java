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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ExchangeForPhysicalTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangeForPhysicalTradeParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExchangeForPhysicalTradeParameters1", propOrder = {"outsideIndex", "fairValue", "valueForFutures"})
public class ExchangeForPhysicalTradeParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OutsdIndx")
	protected PercentageRate outsideIndex;
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
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmOutsideIndex
	 * ExchangeForPhysicalTrade.mmOutsideIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1
	 * ExchangeForPhysicalTradeParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdIndx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutsideIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unexpected divergence between the price behaviour of an underlying position or portfolio and the price behaviour of a hedging position or benchmark."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 407</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeForPhysicalTradeParameters1, Optional<PercentageRate>> mmOutsideIndex = new MMMessageAttribute<ExchangeForPhysicalTradeParameters1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmOutsideIndex;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1.mmObject();
			isDerived = false;
			xmlTag = "OutsdIndx";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "407"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutsideIndex";
			definition = "Unexpected divergence between the price behaviour of an underlying position or portfolio and the price behaviour of a hedging position or benchmark.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(ExchangeForPhysicalTradeParameters1 obj) {
			return obj.getOutsideIndex();
		}

		@Override
		public void setValue(ExchangeForPhysicalTradeParameters1 obj, Optional<PercentageRate> value) {
			obj.setOutsideIndex(value.orElse(null));
		}
	};
	@XmlElement(name = "FairVal")
	protected ActiveCurrencyAndAmount fairValue;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FairValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 406</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeForPhysicalTradeParameters1, Optional<ActiveCurrencyAndAmount>> mmFairValue = new MMMessageAttribute<ExchangeForPhysicalTradeParameters1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmFairValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1.mmObject();
			isDerived = false;
			xmlTag = "FairVal";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "406"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FairValue";
			definition = "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ExchangeForPhysicalTradeParameters1 obj) {
			return obj.getFairValue();
		}

		@Override
		public void setValue(ExchangeForPhysicalTradeParameters1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFairValue(value.orElse(null));
		}
	};
	@XmlElement(name = "ValForFutrs")
	protected ActiveCurrencyAndAmount valueForFutures;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueForFutures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a futures position involved in an Exchange For Physical trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 408</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeForPhysicalTradeParameters1, Optional<ActiveCurrencyAndAmount>> mmValueForFutures = new MMMessageAttribute<ExchangeForPhysicalTradeParameters1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmValueForFutures;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1.mmObject();
			isDerived = false;
			xmlTag = "ValForFutrs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "408"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueForFutures";
			definition = "Value of a futures position involved in an Exchange For Physical trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ExchangeForPhysicalTradeParameters1 obj) {
			return obj.getValueForFutures();
		}

		@Override
		public void setValue(ExchangeForPhysicalTradeParameters1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setValueForFutures(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1.mmOutsideIndex, com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1.mmFairValue,
						com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1.mmValueForFutures);
				trace_lazy = () -> ExchangeForPhysicalTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExchangeForPhysicalTradeParameters1";
				definition = "Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PercentageRate> getOutsideIndex() {
		return outsideIndex == null ? Optional.empty() : Optional.of(outsideIndex);
	}

	public ExchangeForPhysicalTradeParameters1 setOutsideIndex(PercentageRate outsideIndex) {
		this.outsideIndex = outsideIndex;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFairValue() {
		return fairValue == null ? Optional.empty() : Optional.of(fairValue);
	}

	public ExchangeForPhysicalTradeParameters1 setFairValue(ActiveCurrencyAndAmount fairValue) {
		this.fairValue = fairValue;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getValueForFutures() {
		return valueForFutures == null ? Optional.empty() : Optional.of(valueForFutures);
	}

	public ExchangeForPhysicalTradeParameters1 setValueForFutures(ActiveCurrencyAndAmount valueForFutures) {
		this.valueForFutures = valueForFutures;
		return this;
	}
}