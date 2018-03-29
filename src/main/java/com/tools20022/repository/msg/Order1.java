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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CustomerOrderCapacity1Code;
import com.tools20022.repository.codeset.OrderType1Code;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.codeset.TradingCapacity3Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Commission2;
import com.tools20022.repository.msg.MarketIdentification1;
import com.tools20022.repository.msg.OrderQuantity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Intention to transfer an ownership of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmType Order1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmTradingCapacity
 * Order1.mmTradingCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmCustomerCapacity
 * Order1.mmCustomerCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmSide Order1.mmSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmPlaceOfExecution
 * Order1.mmPlaceOfExecution}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmExpiryDateTime
 * Order1.mmExpiryDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmQuantityDetails
 * Order1.mmQuantityDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmCommissionDetails
 * Order1.mmCommissionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Order1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Order1", propOrder = {"type", "tradingCapacity", "customerCapacity", "side", "placeOfExecution", "expiryDateTime", "quantityDetails", "commissionDetails"})
public class Order1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected OrderType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmType
	 * SecuritiesOrder.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 40</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of instruction to a broker or dealer to buy or sell a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order1, Optional<OrderType1Code>> mmType = new MMMessageAttribute<Order1, Optional<OrderType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "40"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the type of instruction to a broker or dealer to buy or sell a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OrderType1Code.mmObject();
		}

		@Override
		public Optional<OrderType1Code> getValue(Order1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Order1 obj, Optional<OrderType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgCpcty")
	protected TradingCapacity3Code tradingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCustomerCapacity
	 * SecuritiesOrder.mmCustomerCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 582</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order1, Optional<TradingCapacity3Code>> mmTradingCapacity = new MMMessageAttribute<Order1, Optional<TradingCapacity3Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCustomerCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "582"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingCapacity3Code.mmObject();
		}

		@Override
		public Optional<TradingCapacity3Code> getValue(Order1 obj) {
			return obj.getTradingCapacity();
		}

		@Override
		public void setValue(Order1 obj, Optional<TradingCapacity3Code> value) {
			obj.setTradingCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrCpcty")
	protected CustomerOrderCapacity1Code customerCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code
	 * CustomerOrderCapacity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCustomerCapacity
	 * SecuritiesOrder.mmCustomerCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 582</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order1, Optional<CustomerOrderCapacity1Code>> mmCustomerCapacity = new MMMessageAttribute<Order1, Optional<CustomerOrderCapacity1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCustomerCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "CstmrCpcty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "582"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CustomerOrderCapacity1Code.mmObject();
		}

		@Override
		public Optional<CustomerOrderCapacity1Code> getValue(Order1 obj) {
			return obj.getCustomerCapacity();
		}

		@Override
		public void setValue(Order1 obj, Optional<CustomerOrderCapacity1Code> value) {
			obj.setCustomerCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "Sd")
	protected Side1Code side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coded list to specify the side of the order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order1, Optional<Side1Code>> mmSide = new MMMessageAttribute<Order1, Optional<Side1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side1Code.mmObject();
		}

		@Override
		public Optional<Side1Code> getValue(Order1 obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(Order1 obj, Optional<Side1Code> value) {
			obj.setSide(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfExctn")
	protected MarketIdentification1 placeOfExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification1
	 * MarketIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
	 * SecuritiesOrder.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfExctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous way to identify an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order1, Optional<MarketIdentification1>> mmPlaceOfExecution = new MMMessageAssociationEnd<Order1, Optional<MarketIdentification1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPlaceOfTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfExctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfExecution";
			definition = "Unique and unambiguous way to identify an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification1.mmObject();
		}

		@Override
		public Optional<MarketIdentification1> getValue(Order1 obj) {
			return obj.getPlaceOfExecution();
		}

		@Override
		public void setValue(Order1 obj, Optional<MarketIdentification1> value) {
			obj.setPlaceOfExecution(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDtTm")
	protected ISODateTime expiryDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExpiryDate
	 * SecuritiesOrder.mmOrderExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 126</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time/Date of order expiration (always expressed in UTC (Universal Time Coordinated, also known as \"GMT\")."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order1, Optional<ISODateTime>> mmExpiryDateTime = new MMMessageAttribute<Order1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "XpryDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "126"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateTime";
			definition = "Time/Date of order expiration (always expressed in UTC (Universal Time Coordinated, also known as \"GMT\").";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Order1 obj) {
			return obj.getExpiryDateTime();
		}

		@Override
		public void setValue(Order1 obj, Optional<ISODateTime> value) {
			obj.setExpiryDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyDtls")
	protected OrderQuantity1 quantityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderQuantity1
	 * OrderQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the order quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order1, Optional<OrderQuantity1>> mmQuantityDetails = new MMMessageAssociationEnd<Order1, Optional<OrderQuantity1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "QtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDetails";
			definition = "Provides details about the order quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrderQuantity1.mmObject();
		}

		@Override
		public Optional<OrderQuantity1> getValue(Order1 obj) {
			return obj.getQuantityDetails();
		}

		@Override
		public void setValue(Order1 obj, Optional<OrderQuantity1> value) {
			obj.setQuantityDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected Commission2 commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission2
	 * Commission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order1
	 * Order1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission details related that may apply to the order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order1, Optional<Commission2>> mmCommissionDetails = new MMMessageAssociationEnd<Order1, Optional<Commission2>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order1.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission details related that may apply to the order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission2.mmObject();
		}

		@Override
		public Optional<Commission2> getValue(Order1 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(Order1 obj, Optional<Commission2> value) {
			obj.setCommissionDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order1.mmType, com.tools20022.repository.msg.Order1.mmTradingCapacity, com.tools20022.repository.msg.Order1.mmCustomerCapacity,
						com.tools20022.repository.msg.Order1.mmSide, com.tools20022.repository.msg.Order1.mmPlaceOfExecution, com.tools20022.repository.msg.Order1.mmExpiryDateTime, com.tools20022.repository.msg.Order1.mmQuantityDetails,
						com.tools20022.repository.msg.Order1.mmCommissionDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Order1";
				definition = "Intention to transfer an ownership of a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OrderType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Order1 setType(OrderType1Code type) {
		this.type = type;
		return this;
	}

	public Optional<TradingCapacity3Code> getTradingCapacity() {
		return tradingCapacity == null ? Optional.empty() : Optional.of(tradingCapacity);
	}

	public Order1 setTradingCapacity(TradingCapacity3Code tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
		return this;
	}

	public Optional<CustomerOrderCapacity1Code> getCustomerCapacity() {
		return customerCapacity == null ? Optional.empty() : Optional.of(customerCapacity);
	}

	public Order1 setCustomerCapacity(CustomerOrderCapacity1Code customerCapacity) {
		this.customerCapacity = customerCapacity;
		return this;
	}

	public Optional<Side1Code> getSide() {
		return side == null ? Optional.empty() : Optional.of(side);
	}

	public Order1 setSide(Side1Code side) {
		this.side = side;
		return this;
	}

	public Optional<MarketIdentification1> getPlaceOfExecution() {
		return placeOfExecution == null ? Optional.empty() : Optional.of(placeOfExecution);
	}

	public Order1 setPlaceOfExecution(MarketIdentification1 placeOfExecution) {
		this.placeOfExecution = placeOfExecution;
		return this;
	}

	public Optional<ISODateTime> getExpiryDateTime() {
		return expiryDateTime == null ? Optional.empty() : Optional.of(expiryDateTime);
	}

	public Order1 setExpiryDateTime(ISODateTime expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
		return this;
	}

	public Optional<OrderQuantity1> getQuantityDetails() {
		return quantityDetails == null ? Optional.empty() : Optional.of(quantityDetails);
	}

	public Order1 setQuantityDetails(OrderQuantity1 quantityDetails) {
		this.quantityDetails = quantityDetails;
		return this;
	}

	public Optional<Commission2> getCommissionDetails() {
		return commissionDetails == null ? Optional.empty() : Optional.of(commissionDetails);
	}

	public Order1 setCommissionDetails(Commission2 commissionDetails) {
		this.commissionDetails = commissionDetails;
		return this;
	}
}