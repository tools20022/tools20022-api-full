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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the additional information for an NDF as supplied on a fixing
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FixingConditions1#mmTradeDate
 * FixingConditions1.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmOriginatorReference
 * FixingConditions1.mmOriginatorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmCommonReference
 * FixingConditions1.mmCommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmRelatedReference
 * FixingConditions1.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmTradingSideBuyAmount
 * FixingConditions1.mmTradingSideBuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmTradingSideSellAmount
 * FixingConditions1.mmTradingSideSellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmExchangeRate
 * FixingConditions1.mmExchangeRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FixingCondition
 * FixingCondition}</li>
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
 * "FixingConditions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the additional information for an NDF as supplied on a fixing instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FixingConditions1", propOrder = {"tradeDate", "originatorReference", "commonReference", "relatedReference", "tradingSideBuyAmount", "tradingSideSellAmount", "exchangeRate"})
public class FixingConditions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate tradeDate;
	/**
	 * The date on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The date on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> FixingConditions1.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "The date on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text originatorReference;
	/**
	 * Represents the original reference of the instruction for which the status
	 * is given, as assigned by the participant that submitted the foreign
	 * exchange trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the original reference of the instruction for which the status is given, as assigned by the participant that submitted the foreign exchange trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginatorReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> FixingConditions1.mmObject();
			isDerived = false;
			xmlTag = "OrgtrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatorReference";
			definition = "Represents the original reference of the instruction for which the status is given, as assigned by the participant that submitted the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text commonReference;
	/**
	 * Reference common to both parties of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference common to both parties of the trade. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommonReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> FixingConditions1.mmObject();
			isDerived = false;
			xmlTag = "CmonRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			definition = "Reference common to both parties of the trade. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text relatedReference;
	/**
	 * Reference to the identification of a previous event in the life of a
	 * trade which is amended or cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of a previous event in the life of a trade which is amended or cancelled. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> FixingConditions1.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to the identification of a previous event in the life of a trade which is amended or cancelled. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount tradingSideBuyAmount;
	/**
	 * Currency and amount bought in a foreign exchange trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmBuyAmount
	 * ForeignExchangeTrade.mmBuyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdBuyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideBuyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount bought in a foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingSideBuyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmBuyAmount;
			componentContext_lazy = () -> FixingConditions1.mmObject();
			isDerived = false;
			xmlTag = "TradgSdBuyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideBuyAmount";
			definition = "Currency and amount bought in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount tradingSideSellAmount;
	/**
	 * Currency and amount sold in a foreign exchange trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmSellAmount
	 * ForeignExchangeTrade.mmSellAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdSellAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideSellAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount sold in a foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingSideSellAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmSellAmount;
			componentContext_lazy = () -> FixingConditions1.mmObject();
			isDerived = false;
			xmlTag = "TradgSdSellAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideSellAmount";
			definition = "Currency and amount sold in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * The value of one currency expressed in relation to another currency.
	 * ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency
	 * (ExchangeRate = UnitCurrency/QuotedCurrency).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> FixingConditions1.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FixingConditions1.mmTradeDate, FixingConditions1.mmOriginatorReference, FixingConditions1.mmCommonReference, FixingConditions1.mmRelatedReference,
						FixingConditions1.mmTradingSideBuyAmount, FixingConditions1.mmTradingSideSellAmount, FixingConditions1.mmExchangeRate);
				trace_lazy = () -> FixingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FixingConditions1";
				definition = "Provides the additional information for an NDF as supplied on a fixing instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradDt", required = true)
	public ISODate getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(ISODate tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "OrgtrRef", required = true)
	public Max35Text getOriginatorReference() {
		return originatorReference;
	}

	public void setOriginatorReference(Max35Text originatorReference) {
		this.originatorReference = originatorReference;
	}

	@XmlElement(name = "CmonRef")
	public Max35Text getCommonReference() {
		return commonReference;
	}

	public void setCommonReference(Max35Text commonReference) {
		this.commonReference = commonReference;
	}

	@XmlElement(name = "RltdRef")
	public Max35Text getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "TradgSdBuyAmt", required = true)
	public ActiveOrHistoricCurrencyAndAmount getTradingSideBuyAmount() {
		return tradingSideBuyAmount;
	}

	public void setTradingSideBuyAmount(ActiveOrHistoricCurrencyAndAmount tradingSideBuyAmount) {
		this.tradingSideBuyAmount = tradingSideBuyAmount;
	}

	@XmlElement(name = "TradgSdSellAmt", required = true)
	public ActiveOrHistoricCurrencyAndAmount getTradingSideSellAmount() {
		return tradingSideSellAmount;
	}

	public void setTradingSideSellAmount(ActiveOrHistoricCurrencyAndAmount tradingSideSellAmount) {
		this.tradingSideSellAmount = tradingSideSellAmount;
	}

	@XmlElement(name = "XchgRate", required = true)
	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}