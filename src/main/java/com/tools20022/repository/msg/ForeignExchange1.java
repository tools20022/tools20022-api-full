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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of the foreign exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmForeignCurrency
 * ForeignExchange1.mmForeignCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmExchangeSpotRate
 * ForeignExchange1.mmExchangeSpotRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmExchangeForwardPoint
 * ForeignExchange1.mmExchangeForwardPoint}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
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
 * "ForeignExchange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details of the foreign exchange."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ForeignExchange1", propOrder = {"foreignCurrency", "exchangeSpotRate", "exchangeForwardPoint"})
public class ForeignExchange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyCode foreignCurrency;
	/**
	 * Currency into which an amount is to be converted in a currency
	 * conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1
	 * ForeignExchange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which an amount is to be converted in a currency conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> ForeignExchange1.mmObject();
			isDerived = false;
			xmlTag = "FrgnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected BaseOneRate exchangeSpotRate;
	/**
	 * Foreign exchange rate between the source and the foreign currency
	 * applicable to the first leg of the FX swap transaction. The foreign
	 * exchange spot rate will be reported as the number of foreign currency
	 * units per one unit of the source currency.
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1
	 * ForeignExchange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgSpotRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeSpotRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign exchange rate between the source and the foreign currency applicable to the first leg of the FX swap transaction. The foreign exchange spot rate will be reported as the number of foreign currency units per one unit of the source currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeSpotRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> ForeignExchange1.mmObject();
			isDerived = false;
			xmlTag = "XchgSpotRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeSpotRate";
			definition = "Foreign exchange rate between the source and the foreign currency applicable to the first leg of the FX swap transaction. The foreign exchange spot rate will be reported as the number of foreign currency units per one unit of the source currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected DecimalNumber exchangeForwardPoint;
	/**
	 * Difference between the foreign exchange spot rate and the foreign
	 * exchange forward rate expressed in basis points quoted in accordance with
	 * the prevailing market conventions for the currency pair. <br>
	 * Usage:<br>
	 * This value can be either positive or negative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmExchangeForwardPoint
	 * ForeignExchangeTrade.mmExchangeForwardPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1
	 * ForeignExchange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgFwdPt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForwardPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. \r\nUsage:\r\nThis value can be either positive or negative."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeForwardPoint = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmExchangeForwardPoint;
			componentContext_lazy = () -> ForeignExchange1.mmObject();
			isDerived = false;
			xmlTag = "XchgFwdPt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForwardPoint";
			definition = "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. \r\nUsage:\r\nThis value can be either positive or negative.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ForeignExchange1.mmForeignCurrency, ForeignExchange1.mmExchangeSpotRate, ForeignExchange1.mmExchangeForwardPoint);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchange1";
				definition = "Provides the details of the foreign exchange.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FrgnCcy", required = true)
	public ActiveOrHistoricCurrencyCode getForeignCurrency() {
		return foreignCurrency;
	}

	public void setForeignCurrency(ActiveOrHistoricCurrencyCode foreignCurrency) {
		this.foreignCurrency = foreignCurrency;
	}

	@XmlElement(name = "XchgSpotRate", required = true)
	public BaseOneRate getExchangeSpotRate() {
		return exchangeSpotRate;
	}

	public void setExchangeSpotRate(BaseOneRate exchangeSpotRate) {
		this.exchangeSpotRate = exchangeSpotRate;
	}

	@XmlElement(name = "XchgFwdPt", required = true)
	public DecimalNumber getExchangeForwardPoint() {
		return exchangeForwardPoint;
	}

	public void setExchangeForwardPoint(DecimalNumber exchangeForwardPoint) {
		this.exchangeForwardPoint = exchangeForwardPoint;
	}
}