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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.SettlementDateCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import com.tools20022.repository.entity.TreasuryTradeSettlementStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AgreedRate3;
import com.tools20022.repository.msg.SecurityIdentification18;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the foreign exchange trade including Spot\Forward\NDF that is
 * captured.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmExecutionPrice
 * Trade3.mmExecutionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmLastQuantity
 * Trade3.mmLastQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmSettlementType
 * Trade3.mmSettlementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmSettlementDate
 * Trade3.mmSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmValuationRate
 * Trade3.mmValuationRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmForwardPoints
 * Trade3.mmForwardPoints}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade3#mmCalculatedCounterpartyCurrencyLastQuantity
 * Trade3.mmCalculatedCounterpartyCurrencyLastQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmValueDate
 * Trade3.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmRiskAmount
 * Trade3.mmRiskAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade3#mmSecurityIdentification
 * Trade3.mmSecurityIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmFixingCurrency
 * Trade3.mmFixingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmFixingDate
 * Trade3.mmFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmOptionIndicator
 * Trade3.mmOptionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmDeltaIndicator
 * Trade3.mmDeltaIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade3#mmAssociatedTradeReference
 * Trade3.mmAssociatedTradeReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
 * ForeignExchangeTrade}</li>
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
 * "Trade3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the foreign exchange trade including Spot\\Forward\\NDF that is captured."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Trade3", propOrder = {"executionPrice", "lastQuantity", "settlementType", "settlementDate", "valuationRate", "forwardPoints", "calculatedCounterpartyCurrencyLastQuantity", "valueDate", "riskAmount",
		"securityIdentification", "fixingCurrency", "fixingDate", "optionIndicator", "deltaIndicator", "associatedTradeReference"})
public class Trade3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ExctnPric", required = true)
	protected ActiveCurrencyAnd13DecimalAmount executionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of the execution of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, ActiveCurrencyAnd13DecimalAmount> mmExecutionPrice = new MMMessageAttribute<Trade3, ActiveCurrencyAnd13DecimalAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "ExctnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionPrice";
			definition = "Price of the execution of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAnd13DecimalAmount getValue(Trade3 obj) {
			return obj.getExecutionPrice();
		}

		@Override
		public void setValue(Trade3 obj, ActiveCurrencyAnd13DecimalAmount value) {
			obj.setExecutionPrice(value);
		}
	};
	@XmlElement(name = "LastQty", required = true)
	protected CurrencyAndAmount lastQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of trade in trading currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, CurrencyAndAmount> mmLastQuantity = new MMMessageAttribute<Trade3, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "LastQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastQuantity";
			definition = "Amount of trade in trading currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Trade3 obj) {
			return obj.getLastQuantity();
		}

		@Override
		public void setValue(Trade3 obj, CurrencyAndAmount value) {
			obj.setLastQuantity(value);
		}
	};
	@XmlElement(name = "SttlmTp", required = true)
	protected SettlementDateCode settlementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlment period of the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, SettlementDateCode> mmSettlementType = new MMMessageAttribute<Trade3, SettlementDateCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "SttlmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementType";
			definition = "Specifies the settlment period of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementDateCode.mmObject();
		}

		@Override
		public SettlementDateCode getValue(Trade3 obj) {
			return obj.getSettlementType();
		}

		@Override
		public void setValue(Trade3 obj, SettlementDateCode value) {
			obj.setSettlementType(value);
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementDate
	 * TreasuryTradeSettlementStatus.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date on which the trade will be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, ISODate> mmSettlementDate = new MMMessageAttribute<Trade3, ISODate>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Specifies the date on which the trade will be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Trade3 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(Trade3 obj, ISODate value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "ValtnRate", required = true)
	protected AgreedRate3 valuationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreedRate3
	 * AgreedRate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the valuation rate used for the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Trade3, AgreedRate3> mmValuationRate = new MMMessageAssociationEnd<Trade3, AgreedRate3>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "ValtnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationRate";
			definition = "Specifies the valuation rate used for the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgreedRate3.mmObject();
		}

		@Override
		public AgreedRate3 getValue(Trade3 obj) {
			return obj.getValuationRate();
		}

		@Override
		public void setValue(Trade3 obj, AgreedRate3 value) {
			obj.setValuationRate(value);
		}
	};
	@XmlElement(name = "FwdPts")
	protected DecimalNumber forwardPoints;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FwdPts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the forward points of the trade if needed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, Optional<DecimalNumber>> mmForwardPoints = new MMMessageAttribute<Trade3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "FwdPts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardPoints";
			definition = "Specifies the forward points of the trade if needed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(Trade3 obj) {
			return obj.getForwardPoints();
		}

		@Override
		public void setValue(Trade3 obj, Optional<DecimalNumber> value) {
			obj.setForwardPoints(value.orElse(null));
		}
	};
	@XmlElement(name = "ClctdCtrPtyCcyLastQty", required = true)
	protected CurrencyAndAmount calculatedCounterpartyCurrencyLastQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdCtrPtyCcyLastQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedCounterpartyCurrencyLastQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of trade in corresponding currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, CurrencyAndAmount> mmCalculatedCounterpartyCurrencyLastQuantity = new MMMessageAttribute<Trade3, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "ClctdCtrPtyCcyLastQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedCounterpartyCurrencyLastQuantity";
			definition = "Amount of trade in corresponding currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Trade3 obj) {
			return obj.getCalculatedCounterpartyCurrencyLastQuantity();
		}

		@Override
		public void setValue(Trade3 obj, CurrencyAndAmount value) {
			obj.setCalculatedCounterpartyCurrencyLastQuantity(value);
		}
	};
	@XmlElement(name = "ValDt", required = true)
	protected ISODate valueDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the value date of spot transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, ISODate> mmValueDate = new MMMessageAttribute<Trade3, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Specifies the value date of spot transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Trade3 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Trade3 obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	@XmlElement(name = "RskAmt", required = true)
	protected ActiveCurrencyAndAmount riskAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measurement of the amount of the trade values converted in the US dollars."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, ActiveCurrencyAndAmount> mmRiskAmount = new MMMessageAttribute<Trade3, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "RskAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskAmount";
			definition = "Measurement of the amount of the trade values converted in the US dollars.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Trade3 obj) {
			return obj.getRiskAmount();
		}

		@Override
		public void setValue(Trade3 obj, ActiveCurrencyAndAmount value) {
			obj.setRiskAmount(value);
		}
	};
	@XmlElement(name = "SctyId", required = true)
	protected SecurityIdentification18 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification18
	 * SecurityIdentification18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security identification of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Trade3, SecurityIdentification18> mmSecurityIdentification = new MMMessageAssociationEnd<Trade3, SecurityIdentification18>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Security identification of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification18.mmObject();
		}

		@Override
		public SecurityIdentification18 getValue(Trade3 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(Trade3 obj, SecurityIdentification18 value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "FxgCcy")
	protected CurrencyCode fixingCurrency;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the ISO code of the fixing currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, Optional<CurrencyCode>> mmFixingCurrency = new MMMessageAttribute<Trade3, Optional<CurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "FxgCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingCurrency";
			definition = "Specifies the ISO code of the fixing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(Trade3 obj) {
			return obj.getFixingCurrency();
		}

		@Override
		public void setValue(Trade3 obj, Optional<CurrencyCode> value) {
			obj.setFixingCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "FxgDt")
	protected ISODate fixingDate;
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
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementDate
	 * TreasuryTradeSettlementStatus.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the rate determination is made in the NDF trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, Optional<ISODate>> mmFixingDate = new MMMessageAttribute<Trade3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "FxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingDate";
			definition = "Date at which the rate determination is made in the NDF trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Trade3 obj) {
			return obj.getFixingDate();
		}

		@Override
		public void setValue(Trade3 obj, Optional<ISODate> value) {
			obj.setFixingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnInd")
	protected YesNoIndicator optionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the spot trade is produced by the option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, Optional<YesNoIndicator>> mmOptionIndicator = new MMMessageAttribute<Trade3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "OptnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionIndicator";
			definition = "Indicates whether the spot trade is produced by the option.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Trade3 obj) {
			return obj.getOptionIndicator();
		}

		@Override
		public void setValue(Trade3 obj, Optional<YesNoIndicator> value) {
			obj.setOptionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DltaInd")
	protected YesNoIndicator deltaIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DltaInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeltaIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicate the trade whether it's exchange delta."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Trade3, Optional<YesNoIndicator>> mmDeltaIndicator = new MMMessageAttribute<Trade3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "DltaInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeltaIndicator";
			definition = "Indicate the trade whether it's exchange delta.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Trade3 obj) {
			return obj.getDeltaIndicator();
		}

		@Override
		public void setValue(Trade3 obj, Optional<YesNoIndicator> value) {
			obj.setDeltaIndicator(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade3
	 * Trade3}</li>
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
	public static final MMMessageAttribute<Trade3, List<Max70Text>> mmAssociatedTradeReference = new MMMessageAttribute<Trade3, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
			isDerived = false;
			xmlTag = "AssoctdTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedTradeReference";
			definition = "Some associated trade reference needs to be specified.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(Trade3 obj) {
			return obj.getAssociatedTradeReference();
		}

		@Override
		public void setValue(Trade3 obj, List<Max70Text> value) {
			obj.setAssociatedTradeReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Trade3.mmExecutionPrice, com.tools20022.repository.msg.Trade3.mmLastQuantity, com.tools20022.repository.msg.Trade3.mmSettlementType,
						com.tools20022.repository.msg.Trade3.mmSettlementDate, com.tools20022.repository.msg.Trade3.mmValuationRate, com.tools20022.repository.msg.Trade3.mmForwardPoints,
						com.tools20022.repository.msg.Trade3.mmCalculatedCounterpartyCurrencyLastQuantity, com.tools20022.repository.msg.Trade3.mmValueDate, com.tools20022.repository.msg.Trade3.mmRiskAmount,
						com.tools20022.repository.msg.Trade3.mmSecurityIdentification, com.tools20022.repository.msg.Trade3.mmFixingCurrency, com.tools20022.repository.msg.Trade3.mmFixingDate,
						com.tools20022.repository.msg.Trade3.mmOptionIndicator, com.tools20022.repository.msg.Trade3.mmDeltaIndicator, com.tools20022.repository.msg.Trade3.mmAssociatedTradeReference);
				trace_lazy = () -> ForeignExchangeTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trade3";
				definition = "Details of the foreign exchange trade including Spot\\Forward\\NDF that is captured.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAnd13DecimalAmount getExecutionPrice() {
		return executionPrice;
	}

	public Trade3 setExecutionPrice(ActiveCurrencyAnd13DecimalAmount executionPrice) {
		this.executionPrice = Objects.requireNonNull(executionPrice);
		return this;
	}

	public CurrencyAndAmount getLastQuantity() {
		return lastQuantity;
	}

	public Trade3 setLastQuantity(CurrencyAndAmount lastQuantity) {
		this.lastQuantity = Objects.requireNonNull(lastQuantity);
		return this;
	}

	public SettlementDateCode getSettlementType() {
		return settlementType;
	}

	public Trade3 setSettlementType(SettlementDateCode settlementType) {
		this.settlementType = Objects.requireNonNull(settlementType);
		return this;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public Trade3 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public AgreedRate3 getValuationRate() {
		return valuationRate;
	}

	public Trade3 setValuationRate(AgreedRate3 valuationRate) {
		this.valuationRate = Objects.requireNonNull(valuationRate);
		return this;
	}

	public Optional<DecimalNumber> getForwardPoints() {
		return forwardPoints == null ? Optional.empty() : Optional.of(forwardPoints);
	}

	public Trade3 setForwardPoints(DecimalNumber forwardPoints) {
		this.forwardPoints = forwardPoints;
		return this;
	}

	public CurrencyAndAmount getCalculatedCounterpartyCurrencyLastQuantity() {
		return calculatedCounterpartyCurrencyLastQuantity;
	}

	public Trade3 setCalculatedCounterpartyCurrencyLastQuantity(CurrencyAndAmount calculatedCounterpartyCurrencyLastQuantity) {
		this.calculatedCounterpartyCurrencyLastQuantity = Objects.requireNonNull(calculatedCounterpartyCurrencyLastQuantity);
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public Trade3 setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public ActiveCurrencyAndAmount getRiskAmount() {
		return riskAmount;
	}

	public Trade3 setRiskAmount(ActiveCurrencyAndAmount riskAmount) {
		this.riskAmount = Objects.requireNonNull(riskAmount);
		return this;
	}

	public SecurityIdentification18 getSecurityIdentification() {
		return securityIdentification;
	}

	public Trade3 setSecurityIdentification(SecurityIdentification18 securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public Optional<CurrencyCode> getFixingCurrency() {
		return fixingCurrency == null ? Optional.empty() : Optional.of(fixingCurrency);
	}

	public Trade3 setFixingCurrency(CurrencyCode fixingCurrency) {
		this.fixingCurrency = fixingCurrency;
		return this;
	}

	public Optional<ISODate> getFixingDate() {
		return fixingDate == null ? Optional.empty() : Optional.of(fixingDate);
	}

	public Trade3 setFixingDate(ISODate fixingDate) {
		this.fixingDate = fixingDate;
		return this;
	}

	public Optional<YesNoIndicator> getOptionIndicator() {
		return optionIndicator == null ? Optional.empty() : Optional.of(optionIndicator);
	}

	public Trade3 setOptionIndicator(YesNoIndicator optionIndicator) {
		this.optionIndicator = optionIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getDeltaIndicator() {
		return deltaIndicator == null ? Optional.empty() : Optional.of(deltaIndicator);
	}

	public Trade3 setDeltaIndicator(YesNoIndicator deltaIndicator) {
		this.deltaIndicator = deltaIndicator;
		return this;
	}

	public List<Max70Text> getAssociatedTradeReference() {
		return associatedTradeReference == null ? associatedTradeReference = new ArrayList<>() : associatedTradeReference;
	}

	public Trade3 setAssociatedTradeReference(List<Max70Text> associatedTradeReference) {
		this.associatedTradeReference = Objects.requireNonNull(associatedTradeReference);
		return this;
	}
}