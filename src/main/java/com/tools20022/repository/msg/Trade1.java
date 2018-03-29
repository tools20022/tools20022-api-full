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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01;
import com.tools20022.repository.choice.SecurityIdentification22Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstrumentLeg6;
import com.tools20022.repository.msg.Option10;
import com.tools20022.repository.msg.Trade3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmTradeDetail
 * ForeignExchangeTradeCaptureReportV01.mmTradeDetail}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForeignExchangeDetailsRule#forTrade1
 * ConstraintForeignExchangeDetailsRule.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSwapLegRule#forTrade1
 * ConstraintSwapLegRule.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductAndOptionRule1#forTrade1
 * ConstraintForeignExchangeTradeProductAndOptionRule1.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductAndOptionRule2#forTrade1
 * ConstraintForeignExchangeTradeProductAndOptionRule2.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionIndicatiorRule#forTrade1
 * ConstraintOptionIndicatiorRule.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeltaIndicatorRule#forTrade1
 * ConstraintDeltaIndicatorRule.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFixingCurrencyAndFixingDateRule#forTrade1
 * ConstraintFixingCurrencyAndFixingDateRule.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardPointsRule#forTrade1
 * ConstraintForwardPointsRule.forTrade1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductRule#forTrade1
 * ConstraintForeignExchangeTradeProductRule.forTrade1}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Trade1", propOrder = {"tradeIdentification", "dateAndTime", "foreignExchangeTradeProduct", "tradingCurrency", "settlementCurrency", "tradingMethod", "tradingMode", "clearingMethod", "executionType", "symbol",
		"placeOfConfirmation", "transactionTime", "foreignExchangeDetails", "swapLeg", "option", "productIdentification"})
public class Trade1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradId", required = true)
	protected Max35Text tradeIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Max35Text> mmTradeIdentification = new MMMessageAttribute<Trade1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Trade1 obj) {
			return obj.getTradeIdentification();
		}

		@Override
		public void setValue(Trade1 obj, Max35Text value) {
			obj.setTradeIdentification(value);
		}
	};
	@XmlElement(name = "DtAndTm", required = true)
	protected ISODateTime dateAndTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, ISODateTime> mmDateAndTime = new MMMessageAttribute<Trade1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "DtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Trade1 obj) {
			return obj.getDateAndTime();
		}

		@Override
		public void setValue(Trade1 obj, ISODateTime value) {
			obj.setDateAndTime(value);
		}
	};
	@XmlElement(name = "FXTradPdct")
	protected UnderlyingProductIdentifier1Code foreignExchangeTradeProduct;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Optional<UnderlyingProductIdentifier1Code>> mmForeignExchangeTradeProduct = new MMMessageAttribute<Trade1, Optional<UnderlyingProductIdentifier1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "FXTradPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeTradeProduct";
			definition = "Specifies the underlying product type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}

		@Override
		public Optional<UnderlyingProductIdentifier1Code> getValue(Trade1 obj) {
			return obj.getForeignExchangeTradeProduct();
		}

		@Override
		public void setValue(Trade1 obj, Optional<UnderlyingProductIdentifier1Code> value) {
			obj.setForeignExchangeTradeProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgCcy")
	protected CurrencyCode tradingCurrency;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Optional<CurrencyCode>> mmTradingCurrency = new MMMessageAttribute<Trade1, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradgCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCurrency";
			definition = "Specifies the ISO code of the trade currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(Trade1 obj) {
			return obj.getTradingCurrency();
		}

		@Override
		public void setValue(Trade1 obj, Optional<CurrencyCode> value) {
			obj.setTradingCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmCcy")
	protected CurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Optional<CurrencyCode>> mmSettlementCurrency = new MMMessageAttribute<Trade1, Optional<CurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Settlement currency of the trade, agreed by both sides of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(Trade1 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(Trade1 obj, Optional<CurrencyCode> value) {
			obj.setSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgMtd", required = true)
	protected TradingMethodType1Code tradingMethod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, TradingMethodType1Code> mmTradingMethod = new MMMessageAttribute<Trade1, TradingMethodType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMethod";
			definition = "Identifies the type of trading method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingMethodType1Code.mmObject();
		}

		@Override
		public TradingMethodType1Code getValue(Trade1 obj) {
			return obj.getTradingMethod();
		}

		@Override
		public void setValue(Trade1 obj, TradingMethodType1Code value) {
			obj.setTradingMethod(value);
		}
	};
	@XmlElement(name = "TradgMd")
	protected TradingModeType1Code tradingMode;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Optional<TradingModeType1Code>> mmTradingMode = new MMMessageAttribute<Trade1, Optional<TradingModeType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "TradgMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMode";
			definition = "Identifies the type of the trade mode.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingModeType1Code.mmObject();
		}

		@Override
		public Optional<TradingModeType1Code> getValue(Trade1 obj) {
			return obj.getTradingMode();
		}

		@Override
		public void setValue(Trade1 obj, Optional<TradingModeType1Code> value) {
			obj.setTradingMode(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrMtd", required = true)
	protected ClearingMethod1Code clearingMethod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, ClearingMethod1Code> mmClearingMethod = new MMMessageAttribute<Trade1, ClearingMethod1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "ClrMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMethod";
			definition = "Clearing method of the trade, agreed by both sides of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingMethod1Code.mmObject();
		}

		@Override
		public ClearingMethod1Code getValue(Trade1 obj) {
			return obj.getClearingMethod();
		}

		@Override
		public void setValue(Trade1 obj, ClearingMethod1Code value) {
			obj.setClearingMethod(value);
		}
	};
	@XmlElement(name = "ExctnTp", required = true)
	protected OrderStatus8Code executionType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, OrderStatus8Code> mmExecutionType = new MMMessageAttribute<Trade1, OrderStatus8Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "ExctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionType";
			definition = "Identifies current status of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatus8Code.mmObject();
		}

		@Override
		public OrderStatus8Code getValue(Trade1 obj) {
			return obj.getExecutionType();
		}

		@Override
		public void setValue(Trade1 obj, OrderStatus8Code value) {
			obj.setExecutionType(value);
		}
	};
	@XmlElement(name = "Symb", required = true)
	protected Max35Text symbol;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Max35Text> mmSymbol = new MMMessageAttribute<Trade1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "Symb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Symbol";
			definition = "Symbol of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Trade1 obj) {
			return obj.getSymbol();
		}

		@Override
		public void setValue(Trade1 obj, Max35Text value) {
			obj.setSymbol(value);
		}
	};
	@XmlElement(name = "PlcOfConf")
	protected Max35Text placeOfConfirmation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Optional<Max35Text>> mmPlaceOfConfirmation = new MMMessageAttribute<Trade1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Market.mmGeographicalEnvironment;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfConfirmation";
			definition = "Infrastructure where the trade confirmation will take place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Trade1 obj) {
			return obj.getPlaceOfConfirmation();
		}

		@Override
		public void setValue(Trade1 obj, Optional<Max35Text> value) {
			obj.setPlaceOfConfirmation(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTm")
	protected ISODateTime transactionTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Trade1, Optional<ISODateTime>> mmTransactionTime = new MMMessageAttribute<Trade1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "TxTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTime";
			definition = "Date and time at which the message was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Trade1 obj) {
			return obj.getTransactionTime();
		}

		@Override
		public void setValue(Trade1 obj, Optional<ISODateTime> value) {
			obj.setTransactionTime(value.orElse(null));
		}
	};
	@XmlElement(name = "FXDtls")
	protected Trade3 foreignExchangeDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Trade1, Optional<Trade3>> mmForeignExchangeDetails = new MMMessageAssociationEnd<Trade1, Optional<Trade3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Provides details of the foreign exchange trade including Spot Forward and NDF.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Trade3.mmObject();
		}

		@Override
		public Optional<Trade3> getValue(Trade1 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(Trade1 obj, Optional<Trade3> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SwpLeg")
	protected List<InstrumentLeg6> swapLeg;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Trade1, List<InstrumentLeg6>> mmSwapLeg = new MMMessageAssociationEnd<Trade1, List<InstrumentLeg6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "SwpLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwapLeg";
			definition = "Provides details about each leg of the multileg instrument (foreign exchange swap).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstrumentLeg6.mmObject();
		}

		@Override
		public List<InstrumentLeg6> getValue(Trade1 obj) {
			return obj.getSwapLeg();
		}

		@Override
		public void setValue(Trade1 obj, List<InstrumentLeg6> value) {
			obj.setSwapLeg(value);
		}
	};
	@XmlElement(name = "Optn")
	protected Option10 option;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Trade1, Optional<Option10>> mmOption = new MMMessageAssociationEnd<Trade1, Optional<Option10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
			isDerived = false;
			xmlTag = "Optn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Specifies the parameters of the foreign exchange option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Option10.mmObject();
		}

		@Override
		public Optional<Option10> getValue(Trade1 obj) {
			return obj.getOption();
		}

		@Override
		public void setValue(Trade1 obj, Optional<Option10> value) {
			obj.setOption(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctId")
	protected SecurityIdentification22Choice productIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Trade1, Optional<SecurityIdentification22Choice>> mmProductIdentification = new MMMessageAssociationEnd<Trade1, Optional<SecurityIdentification22Choice>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade1.mmObject();
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

		@Override
		public Optional<SecurityIdentification22Choice> getValue(Trade1 obj) {
			return obj.getProductIdentification();
		}

		@Override
		public void setValue(Trade1 obj, Optional<SecurityIdentification22Choice> value) {
			obj.setProductIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Trade1.mmTradeIdentification, com.tools20022.repository.msg.Trade1.mmDateAndTime, com.tools20022.repository.msg.Trade1.mmForeignExchangeTradeProduct,
						com.tools20022.repository.msg.Trade1.mmTradingCurrency, com.tools20022.repository.msg.Trade1.mmSettlementCurrency, com.tools20022.repository.msg.Trade1.mmTradingMethod,
						com.tools20022.repository.msg.Trade1.mmTradingMode, com.tools20022.repository.msg.Trade1.mmClearingMethod, com.tools20022.repository.msg.Trade1.mmExecutionType, com.tools20022.repository.msg.Trade1.mmSymbol,
						com.tools20022.repository.msg.Trade1.mmPlaceOfConfirmation, com.tools20022.repository.msg.Trade1.mmTransactionTime, com.tools20022.repository.msg.Trade1.mmForeignExchangeDetails,
						com.tools20022.repository.msg.Trade1.mmSwapLeg, com.tools20022.repository.msg.Trade1.mmOption, com.tools20022.repository.msg.Trade1.mmProductIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeCaptureReportV01.mmTradeDetail);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintForeignExchangeDetailsRule.forTrade1, com.tools20022.repository.constraints.ConstraintSwapLegRule.forTrade1,
						com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductAndOptionRule1.forTrade1, com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductAndOptionRule2.forTrade1,
						com.tools20022.repository.constraints.ConstraintOptionIndicatiorRule.forTrade1, com.tools20022.repository.constraints.ConstraintDeltaIndicatorRule.forTrade1,
						com.tools20022.repository.constraints.ConstraintFixingCurrencyAndFixingDateRule.forTrade1, com.tools20022.repository.constraints.ConstraintForwardPointsRule.forTrade1,
						com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductRule.forTrade1);
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

	public Trade1 setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = Objects.requireNonNull(tradeIdentification);
		return this;
	}

	public ISODateTime getDateAndTime() {
		return dateAndTime;
	}

	public Trade1 setDateAndTime(ISODateTime dateAndTime) {
		this.dateAndTime = Objects.requireNonNull(dateAndTime);
		return this;
	}

	public Optional<UnderlyingProductIdentifier1Code> getForeignExchangeTradeProduct() {
		return foreignExchangeTradeProduct == null ? Optional.empty() : Optional.of(foreignExchangeTradeProduct);
	}

	public Trade1 setForeignExchangeTradeProduct(UnderlyingProductIdentifier1Code foreignExchangeTradeProduct) {
		this.foreignExchangeTradeProduct = foreignExchangeTradeProduct;
		return this;
	}

	public Optional<CurrencyCode> getTradingCurrency() {
		return tradingCurrency == null ? Optional.empty() : Optional.of(tradingCurrency);
	}

	public Trade1 setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
		return this;
	}

	public Optional<CurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? Optional.empty() : Optional.of(settlementCurrency);
	}

	public Trade1 setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
		return this;
	}

	public TradingMethodType1Code getTradingMethod() {
		return tradingMethod;
	}

	public Trade1 setTradingMethod(TradingMethodType1Code tradingMethod) {
		this.tradingMethod = Objects.requireNonNull(tradingMethod);
		return this;
	}

	public Optional<TradingModeType1Code> getTradingMode() {
		return tradingMode == null ? Optional.empty() : Optional.of(tradingMode);
	}

	public Trade1 setTradingMode(TradingModeType1Code tradingMode) {
		this.tradingMode = tradingMode;
		return this;
	}

	public ClearingMethod1Code getClearingMethod() {
		return clearingMethod;
	}

	public Trade1 setClearingMethod(ClearingMethod1Code clearingMethod) {
		this.clearingMethod = Objects.requireNonNull(clearingMethod);
		return this;
	}

	public OrderStatus8Code getExecutionType() {
		return executionType;
	}

	public Trade1 setExecutionType(OrderStatus8Code executionType) {
		this.executionType = Objects.requireNonNull(executionType);
		return this;
	}

	public Max35Text getSymbol() {
		return symbol;
	}

	public Trade1 setSymbol(Max35Text symbol) {
		this.symbol = Objects.requireNonNull(symbol);
		return this;
	}

	public Optional<Max35Text> getPlaceOfConfirmation() {
		return placeOfConfirmation == null ? Optional.empty() : Optional.of(placeOfConfirmation);
	}

	public Trade1 setPlaceOfConfirmation(Max35Text placeOfConfirmation) {
		this.placeOfConfirmation = placeOfConfirmation;
		return this;
	}

	public Optional<ISODateTime> getTransactionTime() {
		return transactionTime == null ? Optional.empty() : Optional.of(transactionTime);
	}

	public Trade1 setTransactionTime(ISODateTime transactionTime) {
		this.transactionTime = transactionTime;
		return this;
	}

	public Optional<Trade3> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public Trade1 setForeignExchangeDetails(Trade3 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public List<InstrumentLeg6> getSwapLeg() {
		return swapLeg == null ? swapLeg = new ArrayList<>() : swapLeg;
	}

	public Trade1 setSwapLeg(List<InstrumentLeg6> swapLeg) {
		this.swapLeg = Objects.requireNonNull(swapLeg);
		return this;
	}

	public Optional<Option10> getOption() {
		return option == null ? Optional.empty() : Optional.of(option);
	}

	public Trade1 setOption(Option10 option) {
		this.option = option;
		return this;
	}

	public Optional<SecurityIdentification22Choice> getProductIdentification() {
		return productIdentification == null ? Optional.empty() : Optional.of(productIdentification);
	}

	public Trade1 setProductIdentification(SecurityIdentification22Choice productIdentification) {
		this.productIdentification = productIdentification;
		return this;
	}
}