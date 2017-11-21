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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max128Text;
import com.tools20022.repository.entity.ExchangeForPhysicalTrade;
import com.tools20022.repository.entity.NonDisclosedListTrading;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * List trading by which the buy-side provides details to the sell-side
 * information about the sector, country, index and potential market impact of
 * the financial instrument to be bought or sold. Using this information, the
 * sell-side firms bid for the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2#mmBidByCurrency
 * NonDisclosedBid2.mmBidByCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid2#mmBidBySector
 * NonDisclosedBid2.mmBidBySector}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid2#mmBidByIndex
 * NonDisclosedBid2.mmBidByIndex}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid2#mmFairValue
 * NonDisclosedBid2.mmFairValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
 * NonDisclosedListTrading}</li>
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
 * "NonDisclosedBid2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NonDisclosedBid2", propOrder = {"bidByCurrency", "bidBySector", "bidByIndex", "fairValue"})
public class NonDisclosedBid2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode bidByCurrency;
	/**
	 * Identifies a type of bid based on a common characteristic (the currency)
	 * of all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidByCurrency
	 * NonDisclosedListTrading.mmBidByCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2
	 * NonDisclosedBid2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidByCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidByCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmBidByCurrency;
			componentContext_lazy = () -> NonDisclosedBid2.mmObject();
			isDerived = false;
			xmlTag = "BidByCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidByCurrency";
			definition = "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max128Text bidBySector;
	/**
	 * Identifies a type of bid based on a common characteristic (the sector) of
	 * all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidBySector
	 * NonDisclosedListTrading.mmBidBySector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2
	 * NonDisclosedBid2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidBySctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidBySector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidBySector = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmBidBySector;
			componentContext_lazy = () -> NonDisclosedBid2.mmObject();
			isDerived = false;
			xmlTag = "BidBySctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidBySector";
			definition = "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	protected Max128Text bidByIndex;
	/**
	 * Identifies a type of bid based on a common characteristic (the index) of
	 * all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidByIndex
	 * NonDisclosedListTrading.mmBidByIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2
	 * NonDisclosedBid2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidByIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the index) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidByIndex = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmBidByIndex;
			componentContext_lazy = () -> NonDisclosedBid2.mmObject();
			isDerived = false;
			xmlTag = "BidByIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidByIndex";
			definition = "Identifies a type of bid based on a common characteristic (the index) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2
	 * NonDisclosedBid2}</li>
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
			componentContext_lazy = () -> NonDisclosedBid2.mmObject();
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

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NonDisclosedBid2.mmBidByCurrency, NonDisclosedBid2.mmBidBySector, NonDisclosedBid2.mmBidByIndex, NonDisclosedBid2.mmFairValue);
				trace_lazy = () -> NonDisclosedListTrading.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonDisclosedBid2";
				definition = "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BidByCcy")
	public CountryCode getBidByCurrency() {
		return bidByCurrency;
	}

	public void setBidByCurrency(CountryCode bidByCurrency) {
		this.bidByCurrency = bidByCurrency;
	}

	@XmlElement(name = "BidBySctr")
	public Max128Text getBidBySector() {
		return bidBySector;
	}

	public void setBidBySector(Max128Text bidBySector) {
		this.bidBySector = bidBySector;
	}

	@XmlElement(name = "BidByIndx")
	public Max128Text getBidByIndex() {
		return bidByIndex;
	}

	public void setBidByIndex(Max128Text bidByIndex) {
		this.bidByIndex = bidByIndex;
	}

	@XmlElement(name = "FairVal")
	public ActiveCurrencyAndAmount getFairValue() {
		return fairValue;
	}

	public void setFairValue(ActiveCurrencyAndAmount fairValue) {
		this.fairValue = fairValue;
	}
}