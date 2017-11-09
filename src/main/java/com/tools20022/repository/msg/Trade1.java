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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecurityIdentification22Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Details of the treasury trade captured.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmTradeIdentification
 * Trade1.mmTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmDateAndTime
 * Trade1.mmDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade1#mmForeignExchangeTradeProduct
 * Trade1.mmForeignExchangeTradeProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmTradingCurrency
 * Trade1.mmTradingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmSettlementCurrency
 * Trade1.mmSettlementCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmTradingMethod
 * Trade1.mmTradingMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmTradingMode
 * Trade1.mmTradingMode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmClearingMethod
 * Trade1.mmClearingMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmExecutionType
 * Trade1.mmExecutionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmSymbol
 * Trade1.mmSymbol}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmPlaceOfConfirmation
 * Trade1.mmPlaceOfConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmTransactionTime
 * Trade1.mmTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade1#mmForeignExchangeDetails
 * Trade1.mmForeignExchangeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmSwapLeg
 * Trade1.mmSwapLeg}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmOption
 * Trade1.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmProductIdentification
 * Trade1.mmProductIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
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
 * "Trade1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the treasury trade captured."</li>
 * </ul>
 */
public class Trade1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text tradeIdentification;
	/**
	 * Unique reference identification assigned to the trade by the instructing
	 * party. This reference will be used throughout the trade life cycle to
	 * identify the particular trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime dateAndTime;
	/**
	 * Date and time at which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "DtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected UnderlyingProductIdentifier1Code foreignExchangeTradeProduct;
	/**
	 * Specifies the underlying product type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXTradPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeTradeProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignExchangeTradeProduct = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "FXTradPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeTradeProduct";
			definition = "Specifies the underlying product type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}
	};
	protected CurrencyCode tradingCurrency;
	/**
	 * Specifies the ISO code of the trade currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingCurrency
	 * TradingMarket.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the ISO code of the trade currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradingCurrency;
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradgCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCurrency";
			definition = "Specifies the ISO code of the trade currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyCode settlementCurrency;
	/**
	 * Settlement currency of the trade, agreed by both sides of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement currency of the trade, agreed by both sides of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Settlement currency of the trade, agreed by both sides of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected TradingMethodType1Code tradingMethod;
	/**
	 * Identifies the type of trading method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of trading method."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMethod";
			definition = "Identifies the type of trading method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingMethodType1Code.mmObject();
		}
	};
	protected TradingModeType1Code tradingMode;
	/**
	 * Identifies the type of the trade mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of the trade mode."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingMode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradgMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMode";
			definition = "Identifies the type of the trade mode.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingModeType1Code.mmObject();
		}
	};
	protected ClearingMethod1Code clearingMethod;
	/**
	 * Clearing method of the trade, agreed by both sides of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code
	 * ClearingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing method of the trade, agreed by both sides of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "ClrMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMethod";
			definition = "Clearing method of the trade, agreed by both sides of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingMethod1Code.mmObject();
		}
	};
	protected OrderStatus8Code executionType;
	/**
	 * Identifies current status of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderStatus8Code
	 * OrderStatus8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies current status of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "ExctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionType";
			definition = "Identifies current status of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus8Code.mmObject();
		}
	};
	protected Max35Text symbol;
	/**
	 * Symbol of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Symb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Symbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Symbol of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSymbol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "Symb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Symbol";
			definition = "Symbol of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text placeOfConfirmation;
	/**
	 * Infrastructure where the trade confirmation will take place.
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
	 * {@linkplain com.tools20022.repository.entity.Market#mmGeographicalEnvironment
	 * Market.mmGeographicalEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure where the trade confirmation will take place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfConfirmation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Market.mmGeographicalEnvironment;
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfConfirmation";
			definition = "Infrastructure where the trade confirmation will take place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime transactionTime;
	/**
	 * Date and time at which the message was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "TxTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTime";
			definition = "Date and time at which the message was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Trade3 foreignExchangeDetails;
	/**
	 * Provides details of the foreign exchange trade including Spot Forward and
	 * NDF.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Trade3 Trade3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the foreign exchange trade including Spot Forward and NDF."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Provides details of the foreign exchange trade including Spot Forward and NDF.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstrumentLeg6> swapLeg;
	/**
	 * Provides details about each leg of the multileg instrument (foreign
	 * exchange swap).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InstrumentLeg6
	 * InstrumentLeg6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwpLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about each leg of the multileg instrument (foreign exchange swap)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwapLeg = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "SwpLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwapLeg";
			definition = "Provides details about each leg of the multileg instrument (foreign exchange swap).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstrumentLeg6.mmObject();
		}
	};
	protected Option10 option;
	/**
	 * Specifies the parameters of the foreign exchange option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Option10 Option10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Optn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the parameters of the foreign exchange option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOption = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "Optn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Specifies the parameters of the foreign exchange option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
		}
	};
	protected SecurityIdentification22Choice productIdentification;
	/**
	 * Identification of the treasury trade product, as assigned under a formal
	 * or proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade1
	 * Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the treasury trade product, as assigned under a formal or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> Trade1.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the treasury trade product, as assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification22Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Trade1.mmTradeIdentification, Trade1.mmDateAndTime, Trade1.mmForeignExchangeTradeProduct, Trade1.mmTradingCurrency, Trade1.mmSettlementCurrency, Trade1.mmTradingMethod,
						Trade1.mmTradingMode, Trade1.mmClearingMethod, Trade1.mmExecutionType, Trade1.mmSymbol, Trade1.mmPlaceOfConfirmation, Trade1.mmTransactionTime, Trade1.mmForeignExchangeDetails, Trade1.mmSwapLeg, Trade1.mmOption,
						Trade1.mmProductIdentification);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trade1";
				definition = "Details of the treasury trade captured.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTradeIdentification() {
		return tradeIdentification;
	}

	public void setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = tradeIdentification;
	}

	public ISODateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(ISODateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public UnderlyingProductIdentifier1Code getForeignExchangeTradeProduct() {
		return foreignExchangeTradeProduct;
	}

	public void setForeignExchangeTradeProduct(UnderlyingProductIdentifier1Code foreignExchangeTradeProduct) {
		this.foreignExchangeTradeProduct = foreignExchangeTradeProduct;
	}

	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}

	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public TradingMethodType1Code getTradingMethod() {
		return tradingMethod;
	}

	public void setTradingMethod(TradingMethodType1Code tradingMethod) {
		this.tradingMethod = tradingMethod;
	}

	public TradingModeType1Code getTradingMode() {
		return tradingMode;
	}

	public void setTradingMode(TradingModeType1Code tradingMode) {
		this.tradingMode = tradingMode;
	}

	public ClearingMethod1Code getClearingMethod() {
		return clearingMethod;
	}

	public void setClearingMethod(ClearingMethod1Code clearingMethod) {
		this.clearingMethod = clearingMethod;
	}

	public OrderStatus8Code getExecutionType() {
		return executionType;
	}

	public void setExecutionType(OrderStatus8Code executionType) {
		this.executionType = executionType;
	}

	public Max35Text getSymbol() {
		return symbol;
	}

	public void setSymbol(Max35Text symbol) {
		this.symbol = symbol;
	}

	public Max35Text getPlaceOfConfirmation() {
		return placeOfConfirmation;
	}

	public void setPlaceOfConfirmation(Max35Text placeOfConfirmation) {
		this.placeOfConfirmation = placeOfConfirmation;
	}

	public ISODateTime getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(ISODateTime transactionTime) {
		this.transactionTime = transactionTime;
	}

	public Trade3 getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(com.tools20022.repository.msg.Trade3 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}

	public List<InstrumentLeg6> getSwapLeg() {
		return swapLeg;
	}

	public void setSwapLeg(List<com.tools20022.repository.msg.InstrumentLeg6> swapLeg) {
		this.swapLeg = swapLeg;
	}

	public Option10 getOption() {
		return option;
	}

	public void setOption(com.tools20022.repository.msg.Option10 option) {
		this.option = option;
	}

	public SecurityIdentification22Choice getProductIdentification() {
		return productIdentification;
	}

	public void setProductIdentification(SecurityIdentification22Choice productIdentification) {
		this.productIdentification = productIdentification;
	}
}