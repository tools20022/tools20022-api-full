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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.choice.SecurityIdentification22Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstrumentLeg6;
import com.tools20022.repository.msg.Trade3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the foreign exchange trade including spot\forward\NDF\swap that is
 * confirmed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradeIdentification
 * Trade2.mmTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradeDate
 * Trade2.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade2#mmForeignExchangeTradeProduct
 * Trade2.mmForeignExchangeTradeProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradingCurrency
 * Trade2.mmTradingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmSettlementCurrency
 * Trade2.mmSettlementCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradingMethod
 * Trade2.mmTradingMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradingMode
 * Trade2.mmTradingMode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmClearingMethod
 * Trade2.mmClearingMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmSymbol
 * Trade2.mmSymbol}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmPlaceOfConfirmation
 * Trade2.mmPlaceOfConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade2#mmForeignExchangeDetails
 * Trade2.mmForeignExchangeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmSwapLeg
 * Trade2.mmSwapLeg}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmProductIdentification
 * Trade2.mmProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade2#mmAssociatedTradeReference
 * Trade2.mmAssociatedTradeReference}</li>
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
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmTradeDetail
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradeDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmTradeDetail
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmTradeDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmTradeDetail
 * ForeignExchangeTradeConfirmationRequestV01.mmTradeDetail}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductRule#forTrade2
 * ConstraintForeignExchangeTradeProductRule.forTrade2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductRule1#forTrade2
 * ConstraintForeignExchangeTradeProductRule1.forTrade2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSwapLegRule#forTrade2
 * ConstraintSwapLegRule.forTrade2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFixingCurrencyAndFixingDateRule#forTrade2
 * ConstraintFixingCurrencyAndFixingDateRule.forTrade2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeltaIndicatorRule#forTrade2
 * ConstraintDeltaIndicatorRule.forTrade2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionIndicatiorRule#forTrade2
 * ConstraintOptionIndicatiorRule.forTrade2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardPointsRule#forTrade2
 * ConstraintForwardPointsRule.forTrade2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Trade2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the foreign exchange trade including spot\\forward\\NDF\\swap that is confirmed."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Trade2", propOrder = {"tradeIdentification", "tradeDate", "foreignExchangeTradeProduct", "tradingCurrency", "settlementCurrency", "tradingMethod", "tradingMode", "clearingMethod", "symbol", "placeOfConfirmation",
		"foreignExchangeDetails", "swapLeg", "productIdentification", "associatedTradeReference"})
public class Trade2 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, Max35Text> mmTradeIdentification = new MMMessageAttribute<Trade2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
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
		public Max35Text getValue(Trade2 obj) {
			return obj.getTradeIdentification();
		}

		@Override
		public void setValue(Trade2 obj, Max35Text value) {
			obj.setTradeIdentification(value);
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected ISODate tradeDate;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	 * definition} = "Specifies the date on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade2, ISODate> mmTradeDate = new MMMessageAttribute<Trade2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Trade2 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(Trade2 obj, ISODate value) {
			obj.setTradeDate(value);
		}
	};
	@XmlElement(name = "FXTradPdct", required = true)
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, UnderlyingProductIdentifier1Code> mmForeignExchangeTradeProduct = new MMMessageAttribute<Trade2, UnderlyingProductIdentifier1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
			isDerived = false;
			xmlTag = "FXTradPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeTradeProduct";
			definition = "Specifies the underlying product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}

		@Override
		public UnderlyingProductIdentifier1Code getValue(Trade2 obj) {
			return obj.getForeignExchangeTradeProduct();
		}

		@Override
		public void setValue(Trade2 obj, UnderlyingProductIdentifier1Code value) {
			obj.setForeignExchangeTradeProduct(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, Optional<CurrencyCode>> mmTradingCurrency = new MMMessageAttribute<Trade2, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
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
		public Optional<CurrencyCode> getValue(Trade2 obj) {
			return obj.getTradingCurrency();
		}

		@Override
		public void setValue(Trade2 obj, Optional<CurrencyCode> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, Optional<CurrencyCode>> mmSettlementCurrency = new MMMessageAttribute<Trade2, Optional<CurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
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
		public Optional<CurrencyCode> getValue(Trade2 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(Trade2 obj, Optional<CurrencyCode> value) {
			obj.setSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgMtd")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, Optional<TradingMethodType1Code>> mmTradingMethod = new MMMessageAttribute<Trade2, Optional<TradingMethodType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMethod";
			definition = "Identifies the type of trading method.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingMethodType1Code.mmObject();
		}

		@Override
		public Optional<TradingMethodType1Code> getValue(Trade2 obj) {
			return obj.getTradingMethod();
		}

		@Override
		public void setValue(Trade2 obj, Optional<TradingMethodType1Code> value) {
			obj.setTradingMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgMd", required = true)
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, TradingModeType1Code> mmTradingMode = new MMMessageAttribute<Trade2, TradingModeType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradgMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMode";
			definition = "Identifies the type of the trade mode.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingModeType1Code.mmObject();
		}

		@Override
		public TradingModeType1Code getValue(Trade2 obj) {
			return obj.getTradingMode();
		}

		@Override
		public void setValue(Trade2 obj, TradingModeType1Code value) {
			obj.setTradingMode(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, ClearingMethod1Code> mmClearingMethod = new MMMessageAttribute<Trade2, ClearingMethod1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
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
		public ClearingMethod1Code getValue(Trade2 obj) {
			return obj.getClearingMethod();
		}

		@Override
		public void setValue(Trade2 obj, ClearingMethod1Code value) {
			obj.setClearingMethod(value);
		}
	};
	@XmlElement(name = "Symb")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, Optional<Max35Text>> mmSymbol = new MMMessageAttribute<Trade2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
			isDerived = false;
			xmlTag = "Symb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Symbol";
			definition = "Symbol of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Trade2 obj) {
			return obj.getSymbol();
		}

		@Override
		public void setValue(Trade2 obj, Optional<Max35Text> value) {
			obj.setSymbol(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfConf")
	protected AnyBICIdentifier placeOfConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmGeographicalEnvironment
	 * Market.mmGeographicalEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAttribute<Trade2, Optional<AnyBICIdentifier>> mmPlaceOfConfirmation = new MMMessageAttribute<Trade2, Optional<AnyBICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Market.mmGeographicalEnvironment;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfConfirmation";
			definition = "Infrastructure where the trade confirmation will take place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public Optional<AnyBICIdentifier> getValue(Trade2 obj) {
			return obj.getPlaceOfConfirmation();
		}

		@Override
		public void setValue(Trade2 obj, Optional<AnyBICIdentifier> value) {
			obj.setPlaceOfConfirmation(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAssociationEnd<Trade2, Optional<Trade3>> mmForeignExchangeDetails = new MMMessageAssociationEnd<Trade2, Optional<Trade3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
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
		public Optional<Trade3> getValue(Trade2 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(Trade2 obj, Optional<Trade3> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAssociationEnd<Trade2, List<InstrumentLeg6>> mmSwapLeg = new MMMessageAssociationEnd<Trade2, List<InstrumentLeg6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
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
		public List<InstrumentLeg6> getValue(Trade2 obj) {
			return obj.getSwapLeg();
		}

		@Override
		public void setValue(Trade2 obj, List<InstrumentLeg6> value) {
			obj.setSwapLeg(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	public static final MMMessageAssociationEnd<Trade2, Optional<SecurityIdentification22Choice>> mmProductIdentification = new MMMessageAssociationEnd<Trade2, Optional<SecurityIdentification22Choice>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
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
		public Optional<SecurityIdentification22Choice> getValue(Trade2 obj) {
			return obj.getProductIdentification();
		}

		@Override
		public void setValue(Trade2 obj, Optional<SecurityIdentification22Choice> value) {
			obj.setProductIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AssoctdTradRef")
	protected List<Max70Text> associatedTradeReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdTradRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedTradeReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Some associated trade reference needs to be specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade2, List<Max70Text>> mmAssociatedTradeReference = new MMMessageAttribute<Trade2, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade2.mmObject();
			isDerived = false;
			xmlTag = "AssoctdTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedTradeReference";
			definition = "Some associated trade reference needs to be specified.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(Trade2 obj) {
			return obj.getAssociatedTradeReference();
		}

		@Override
		public void setValue(Trade2 obj, List<Max70Text> value) {
			obj.setAssociatedTradeReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Trade2.mmTradeIdentification, com.tools20022.repository.msg.Trade2.mmTradeDate, com.tools20022.repository.msg.Trade2.mmForeignExchangeTradeProduct,
						com.tools20022.repository.msg.Trade2.mmTradingCurrency, com.tools20022.repository.msg.Trade2.mmSettlementCurrency, com.tools20022.repository.msg.Trade2.mmTradingMethod,
						com.tools20022.repository.msg.Trade2.mmTradingMode, com.tools20022.repository.msg.Trade2.mmClearingMethod, com.tools20022.repository.msg.Trade2.mmSymbol, com.tools20022.repository.msg.Trade2.mmPlaceOfConfirmation,
						com.tools20022.repository.msg.Trade2.mmForeignExchangeDetails, com.tools20022.repository.msg.Trade2.mmSwapLeg, com.tools20022.repository.msg.Trade2.mmProductIdentification,
						com.tools20022.repository.msg.Trade2.mmAssociatedTradeReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradeDetail, ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmTradeDetail,
						ForeignExchangeTradeConfirmationRequestV01.mmTradeDetail);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductRule.forTrade2, com.tools20022.repository.constraints.ConstraintForeignExchangeTradeProductRule1.forTrade2,
						com.tools20022.repository.constraints.ConstraintSwapLegRule.forTrade2, com.tools20022.repository.constraints.ConstraintFixingCurrencyAndFixingDateRule.forTrade2,
						com.tools20022.repository.constraints.ConstraintDeltaIndicatorRule.forTrade2, com.tools20022.repository.constraints.ConstraintOptionIndicatiorRule.forTrade2,
						com.tools20022.repository.constraints.ConstraintForwardPointsRule.forTrade2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trade2";
				definition = "Details of the foreign exchange trade including spot\\forward\\NDF\\swap that is confirmed.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTradeIdentification() {
		return tradeIdentification;
	}

	public Trade2 setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = Objects.requireNonNull(tradeIdentification);
		return this;
	}

	public ISODate getTradeDate() {
		return tradeDate;
	}

	public Trade2 setTradeDate(ISODate tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public UnderlyingProductIdentifier1Code getForeignExchangeTradeProduct() {
		return foreignExchangeTradeProduct;
	}

	public Trade2 setForeignExchangeTradeProduct(UnderlyingProductIdentifier1Code foreignExchangeTradeProduct) {
		this.foreignExchangeTradeProduct = Objects.requireNonNull(foreignExchangeTradeProduct);
		return this;
	}

	public Optional<CurrencyCode> getTradingCurrency() {
		return tradingCurrency == null ? Optional.empty() : Optional.of(tradingCurrency);
	}

	public Trade2 setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
		return this;
	}

	public Optional<CurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? Optional.empty() : Optional.of(settlementCurrency);
	}

	public Trade2 setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
		return this;
	}

	public Optional<TradingMethodType1Code> getTradingMethod() {
		return tradingMethod == null ? Optional.empty() : Optional.of(tradingMethod);
	}

	public Trade2 setTradingMethod(TradingMethodType1Code tradingMethod) {
		this.tradingMethod = tradingMethod;
		return this;
	}

	public TradingModeType1Code getTradingMode() {
		return tradingMode;
	}

	public Trade2 setTradingMode(TradingModeType1Code tradingMode) {
		this.tradingMode = Objects.requireNonNull(tradingMode);
		return this;
	}

	public ClearingMethod1Code getClearingMethod() {
		return clearingMethod;
	}

	public Trade2 setClearingMethod(ClearingMethod1Code clearingMethod) {
		this.clearingMethod = Objects.requireNonNull(clearingMethod);
		return this;
	}

	public Optional<Max35Text> getSymbol() {
		return symbol == null ? Optional.empty() : Optional.of(symbol);
	}

	public Trade2 setSymbol(Max35Text symbol) {
		this.symbol = symbol;
		return this;
	}

	public Optional<AnyBICIdentifier> getPlaceOfConfirmation() {
		return placeOfConfirmation == null ? Optional.empty() : Optional.of(placeOfConfirmation);
	}

	public Trade2 setPlaceOfConfirmation(AnyBICIdentifier placeOfConfirmation) {
		this.placeOfConfirmation = placeOfConfirmation;
		return this;
	}

	public Optional<Trade3> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public Trade2 setForeignExchangeDetails(Trade3 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public List<InstrumentLeg6> getSwapLeg() {
		return swapLeg == null ? swapLeg = new ArrayList<>() : swapLeg;
	}

	public Trade2 setSwapLeg(List<InstrumentLeg6> swapLeg) {
		this.swapLeg = Objects.requireNonNull(swapLeg);
		return this;
	}

	public Optional<SecurityIdentification22Choice> getProductIdentification() {
		return productIdentification == null ? Optional.empty() : Optional.of(productIdentification);
	}

	public Trade2 setProductIdentification(SecurityIdentification22Choice productIdentification) {
		this.productIdentification = productIdentification;
		return this;
	}

	public List<Max70Text> getAssociatedTradeReference() {
		return associatedTradeReference == null ? associatedTradeReference = new ArrayList<>() : associatedTradeReference;
	}

	public Trade2 setAssociatedTradeReference(List<Max70Text> associatedTradeReference) {
		this.associatedTradeReference = Objects.requireNonNull(associatedTradeReference);
		return this;
	}
}