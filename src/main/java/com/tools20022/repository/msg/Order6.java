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
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
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
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmListOrderNumber
 * Order6.mmListOrderNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmClientOrderIdentification
 * Order6.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmSecondaryClientOrderIdentification
 * Order6.mmSecondaryClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmClientOrderLinkIdentification
 * Order6.mmClientOrderLinkIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSolicitedOrder
 * Order6.mmSolicitedOrder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradeDate
 * Order6.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSide Order6.mmSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSideValueIndicator
 * Order6.mmSideValueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmForeignExchangeExecutionRequestedIndicator
 * Order6.mmForeignExchangeExecutionRequestedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCashMargin
 * Order6.mmCashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmPreviousClosingPrice
 * Order6.mmPreviousClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmComplianceIdentification
 * Order6.mmComplianceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradingCapacity
 * Order6.mmTradingCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCustomerCapacity
 * Order6.mmCustomerCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmPositionEffect
 * Order6.mmPositionEffect}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmDerivativeCovered
 * Order6.mmDerivativeCovered}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradeRegulator
 * Order6.mmTradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradeOriginationDate
 * Order6.mmTradeOriginationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSettlementCurrency
 * Order6.mmSettlementCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmClearingFeeType
 * Order6.mmClearingFeeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmOrderOriginatorEligibility
 * Order6.mmOrderOriginatorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmPlaceOfExecution
 * Order6.mmPlaceOfExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmSettlementInstructionMethod
 * Order6.mmSettlementInstructionMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmOrderRestrictions
 * Order6.mmOrderRestrictions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmQuantity2Details
 * Order6.mmQuantity2Details}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmQuantity1Details
 * Order6.mmQuantity1Details}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmFinancialInstrument
 * Order6.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmFinancialInstrumentAttributes
 * Order6.mmFinancialInstrumentAttributes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmStipulations
 * Order6.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmUnderlyingFinancialInstrument
 * Order6.mmUnderlyingFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmUnderlyingFinancialInstrumentAttributes
 * Order6.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmSpreadAndBenchmarkCurveDetails
 * Order6.mmSpreadAndBenchmarkCurveDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmYieldDetails
 * Order6.mmYieldDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmUnderlyingStipulations
 * Order6.mmUnderlyingStipulations}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmOrderParameters
 * Order6.mmOrderParameters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCommissionDetails
 * Order6.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmExecutionInstructionsDetails
 * Order6.mmExecutionInstructionsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmStrategyParametersDetails
 * Order6.mmStrategyParametersDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradingSessionDetails
 * Order6.mmTradingSessionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmDiscretion
 * Order6.mmDiscretion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmPreAllocationDetails
 * Order6.mmPreAllocationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmBookingDetails
 * Order6.mmBookingDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradingParties
 * Order6.mmTradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSettlementDetails
 * Order6.mmSettlementDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCashParties
 * Order6.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmOtherBusinessParties
 * Order6.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmReceivingSettlementParties
 * Order6.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmDeliveringSettlementParties
 * Order6.mmDeliveringSettlementParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmAmountDetails
 * Order6.mmAmountDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Order6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSideValue#forOrder6
 * ConstraintSideValue.forOrder6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency#forOrder6
 * ConstraintSettlementCurrency.forOrder6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Order6", propOrder = {"listOrderNumber", "clientOrderIdentification", "secondaryClientOrderIdentification", "clientOrderLinkIdentification", "solicitedOrder", "tradeDate", "side", "sideValueIndicator",
		"foreignExchangeExecutionRequestedIndicator", "cashMargin", "previousClosingPrice", "complianceIdentification", "tradingCapacity", "customerCapacity", "positionEffect", "derivativeCovered", "tradeRegulator", "tradeOriginationDate",
		"settlementCurrency", "clearingFeeType", "orderOriginatorEligibility", "placeOfExecution", "settlementInstructionMethod", "orderRestrictions", "quantity2Details", "quantity1Details", "financialInstrument",
		"financialInstrumentAttributes", "stipulations", "underlyingFinancialInstrument", "underlyingFinancialInstrumentAttributes", "spreadAndBenchmarkCurveDetails", "yieldDetails", "underlyingStipulations", "orderParameters",
		"commissionDetails", "executionInstructionsDetails", "strategyParametersDetails", "tradingSessionDetails", "discretion", "preAllocationDetails", "bookingDetails", "tradingParties", "settlementDetails", "cashParties",
		"otherBusinessParties", "receivingSettlementParties", "deliveringSettlementParties", "amountDetails"})
public class Order6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ListOrdrNb", required = true)
	protected Number listOrderNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListOrdrNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListOrderNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the order number within the list, eg, ListOrderNumber 2 of 25."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 67</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Number> mmListOrderNumber = new MMMessageAttribute<Order6, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "ListOrdrNb";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "67"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListOrderNumber";
			definition = "Identifies the order number within the list, eg, ListOrderNumber 2 of 25.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Order6 obj) {
			return obj.getListOrderNumber();
		}

		@Override
		public void setValue(Order6 obj, Number value) {
			obj.setListOrderNumber(value);
		}
	};
	@XmlElement(name = "ClntOrdrId", required = true)
	protected Max35Text clientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 11</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Max35Text> mmClientOrderIdentification = new MMMessageAttribute<Order6, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "11"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Order6 obj) {
			return obj.getClientOrderIdentification();
		}

		@Override
		public void setValue(Order6 obj, Max35Text value) {
			obj.setClientOrderIdentification(value);
		}
	};
	@XmlElement(name = "ScndryClntOrdrId")
	protected Max35Text secondaryClientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assigned by the party that originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 526</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<Max35Text>> mmSecondaryClientOrderIdentification = new MMMessageAttribute<Order6, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "526"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Assigned by the party that originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Order6 obj) {
			return obj.getSecondaryClientOrderIdentification();
		}

		@Override
		public void setValue(Order6 obj, Optional<Max35Text> value) {
			obj.setSecondaryClientOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntOrdrLkId")
	protected Max35Text clientOrderLinkIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrLkId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderLinkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It permits order originators to tie together groups of orders in which trades resulting from orders are associated for a specific purpose, for example the calculation of average execution price for a customer.\nWhere multiple waves of a program trade are submitted by an institution or retail intermediaries, as a series of separate lists, to a broker, ClOrdLinkID may be used to link the orders together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 583, ISO15022Synonym: :20C::MAST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<Max35Text>> mmClientOrderLinkIdentification = new MMMessageAttribute<Order6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrLkId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "583"), new ISO15022Synonym(this, ":20C::MAST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			definition = "It permits order originators to tie together groups of orders in which trades resulting from orders are associated for a specific purpose, for example the calculation of average execution price for a customer.\nWhere multiple waves of a program trade are submitted by an institution or retail intermediaries, as a series of separate lists, to a broker, ClOrdLinkID may be used to link the orders together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Order6 obj) {
			return obj.getClientOrderLinkIdentification();
		}

		@Override
		public void setValue(Order6 obj, Optional<Max35Text> value) {
			obj.setClientOrderLinkIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctdOrdr", required = true)
	protected YesNoIndicator solicitedOrder;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSolicitedOrder
	 * SecuritiesOrder.mmSolicitedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctdOrdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order has been generated in response to an advertisement or an indication of interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 377</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, YesNoIndicator> mmSolicitedOrder = new MMMessageAttribute<Order6, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSolicitedOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "SlctdOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "377"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedOrder";
			definition = "Indicates that an order has been generated in response to an advertisement or an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Order6 obj) {
			return obj.getSolicitedOrder();
		}

		@Override
		public void setValue(Order6 obj, YesNoIndicator value) {
			obj.setSolicitedOrder(value);
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected ISODateTime tradeDate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 75</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, ISODateTime> mmTradeDate = new MMMessageAttribute<Order6, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "75"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Order6 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(Order6 obj, ISODateTime value) {
			obj.setTradeDate(value);
		}
	};
	@XmlElement(name = "Sd", required = true)
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coded list to specify the side of the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Side1Code> mmSide = new MMMessageAttribute<Order6, Side1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}

		@Override
		public Side1Code getValue(Order6 obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(Order6 obj, Side1Code value) {
			obj.setSide(value);
		}
	};
	@XmlElement(name = "SdValInd")
	protected TrueFalseIndicator sideValueIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdValInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideValueIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Must be used when Side = Undisclosed. Indicates which \"SideValue\" the value refers to. SideValue 1 and SideValue2 are used as opposed to Buy or Sell so that the basket can be quoted either way as Buy or Sell.\n\nTrue = SideValue 1\nFalse = SideValue 2."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 401</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<TrueFalseIndicator>> mmSideValueIndicator = new MMMessageAttribute<Order6, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "SdValInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "401"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideValueIndicator";
			definition = "Must be used when Side = Undisclosed. Indicates which \"SideValue\" the value refers to. SideValue 1 and SideValue2 are used as opposed to Buy or Sell so that the basket can be quoted either way as Buy or Sell.\n\nTrue = SideValue 1\nFalse = SideValue 2.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(Order6 obj) {
			return obj.getSideValueIndicator();
		}

		@Override
		public void setValue(Order6 obj, Optional<TrueFalseIndicator> value) {
			obj.setSideValueIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnXchgExctnReqdInd", required = true)
	protected YesNoIndicator foreignExchangeExecutionRequestedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmForeignExchangeExecutionRequested
	 * SecuritiesOrder.mmForeignExchangeExecutionRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnXchgExctnReqdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeExecutionRequestedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 121</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, YesNoIndicator> mmForeignExchangeExecutionRequestedIndicator = new MMMessageAttribute<Order6, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmForeignExchangeExecutionRequested;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "FrgnXchgExctnReqdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "121"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeExecutionRequestedIndicator";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Order6 obj) {
			return obj.getForeignExchangeExecutionRequestedIndicator();
		}

		@Override
		public void setValue(Order6 obj, YesNoIndicator value) {
			obj.setForeignExchangeExecutionRequestedIndicator(value);
		}
	};
	@XmlElement(name = "CshMrgn")
	protected CashMarginOrder1Code cashMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code
	 * CashMarginOrder1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCashMargin
	 * SecuritiesOrder.mmCashMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 544</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<CashMarginOrder1Code>> mmCashMargin = new MMMessageAttribute<Order6, Optional<CashMarginOrder1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCashMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "CshMrgn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "544"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CashMarginOrder1Code.mmObject();
		}

		@Override
		public Optional<CashMarginOrder1Code> getValue(Order6 obj) {
			return obj.getCashMargin();
		}

		@Override
		public void setValue(Order6 obj, Optional<CashMarginOrder1Code> value) {
			obj.setCashMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsClsgPric")
	protected Price1 previousClosingPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsClsgPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of a financial instrument at closing time of the exchange in which it is traded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 140</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<Price1>> mmPreviousClosingPrice = new MMMessageAttribute<Order6, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "PrvsClsgPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "140"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Price of a financial instrument at closing time of the exchange in which it is traded.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(Order6 obj) {
			return obj.getPreviousClosingPrice();
		}

		@Override
		public void setValue(Order6 obj, Optional<Price1> value) {
			obj.setPreviousClosingPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "CmplcId")
	protected Max35Text complianceIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used to represent this transaction for compliance purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 376</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<Max35Text>> mmComplianceIdentification = new MMMessageAttribute<Order6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "CmplcId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "376"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification used to represent this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Order6 obj) {
			return obj.getComplianceIdentification();
		}

		@Override
		public void setValue(Order6 obj, Optional<Max35Text> value) {
			obj.setComplianceIdentification(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 528</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<TradingCapacity3Code>> mmTradingCapacity = new MMMessageAttribute<Order6, Optional<TradingCapacity3Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCustomerCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "528"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingCapacity3Code.mmObject();
		}

		@Override
		public Optional<TradingCapacity3Code> getValue(Order6 obj) {
			return obj.getTradingCapacity();
		}

		@Override
		public void setValue(Order6 obj, Optional<TradingCapacity3Code> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 582</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<CustomerOrderCapacity1Code>> mmCustomerCapacity = new MMMessageAttribute<Order6, Optional<CustomerOrderCapacity1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCustomerCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
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
		public Optional<CustomerOrderCapacity1Code> getValue(Order6 obj) {
			return obj.getCustomerCapacity();
		}

		@Override
		public void setValue(Order6 obj, Optional<CustomerOrderCapacity1Code> value) {
			obj.setCustomerCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "PosFct")
	protected PositionEffect1Code positionEffect;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect1Code
	 * PositionEffect1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
	 * SecuritiesOrder.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosFct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 77</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<PositionEffect1Code>> mmPositionEffect = new MMMessageAttribute<Order6, Optional<PositionEffect1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPositionEffect;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "PosFct";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "77"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PositionEffect1Code.mmObject();
		}

		@Override
		public Optional<PositionEffect1Code> getValue(Order6 obj) {
			return obj.getPositionEffect();
		}

		@Override
		public void setValue(Order6 obj, Optional<PositionEffect1Code> value) {
			obj.setPositionEffect(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivCvrd")
	protected YesNoIndicator derivativeCovered;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmDerivativeCovered
	 * Derivative.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivCvrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 203</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<YesNoIndicator>> mmDerivativeCovered = new MMMessageAttribute<Order6, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmDerivativeCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "DerivCvrd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "203"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeCovered";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Order6 obj) {
			return obj.getDerivativeCovered();
		}

		@Override
		public void setValue(Order6 obj, Optional<YesNoIndicator> value) {
			obj.setDerivativeCovered(value.orElse(null));
		}
	};
	@XmlElement(name = "TradRgltr")
	protected PartyIdentification23 tradeRegulator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification23
	 * PartyIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Institution to which a trade must be reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<PartyIdentification23>> mmTradeRegulator = new MMMessageAttribute<Order6, Optional<PartyIdentification23>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "TradRgltr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulator";
			definition = "Institution to which a trade must be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification23.mmObject();
		}

		@Override
		public Optional<PartyIdentification23> getValue(Order6 obj) {
			return obj.getTradeRegulator();
		}

		@Override
		public void setValue(Order6 obj, Optional<PartyIdentification23> value) {
			obj.setTradeRegulator(value.orElse(null));
		}
	};
	@XmlElement(name = "TradOrgtnDt")
	protected ISODateTime tradeOriginationDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
	 * SecuritiesTrade.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradOrgtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 229</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<ISODateTime>> mmTradeOriginationDate = new MMMessageAttribute<Order6, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeOriginationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "229"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Order6 obj) {
			return obj.getTradeOriginationDate();
		}

		@Override
		public void setValue(Order6 obj, Optional<ISODateTime> value) {
			obj.setTradeOriginationDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSettlementCurrency
	 * SecuritiesOrder.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Required if ForeignExchangeExecutionRequested=Yes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<CurrencyCode>> mmSettlementCurrency = new MMMessageAttribute<Order6, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Required if ForeignExchangeExecutionRequested=Yes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(Order6 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(Order6 obj, Optional<CurrencyCode> value) {
			obj.setSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrFeeTp")
	protected ClearingFeeType1Code clearingFeeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmClearingFeeType
	 * SecuritiesTrade.mmClearingFeeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrFeeTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee being assessed of the customer for trade executions at an exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<ClearingFeeType1Code>> mmClearingFeeType = new MMMessageAttribute<Order6, Optional<ClearingFeeType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmClearingFeeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "ClrFeeTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee being assessed of the customer for trade executions at an exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ClearingFeeType1Code.mmObject();
		}

		@Override
		public Optional<ClearingFeeType1Code> getValue(Order6 obj) {
			return obj.getClearingFeeType();
		}

		@Override
		public void setValue(Order6 obj, Optional<ClearingFeeType1Code> value) {
			obj.setClearingFeeType(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrOrgtrElgblty")
	protected Eligibility1Code orderOriginatorEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderOriginatorEligibility
	 * SecuritiesOrder.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrOrgtrElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Optional<Eligibility1Code>> mmOrderOriginatorEligibility = new MMMessageAttribute<Order6, Optional<Eligibility1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderOriginatorEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "OrdrOrgtrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
		}

		@Override
		public Optional<Eligibility1Code> getValue(Order6 obj) {
			return obj.getOrderOriginatorEligibility();
		}

		@Override
		public void setValue(Order6 obj, Optional<Eligibility1Code> value) {
			obj.setOrderOriginatorEligibility(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfExctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous way to identify an organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<MarketIdentification1>> mmPlaceOfExecution = new MMMessageAssociationEnd<Order6, Optional<MarketIdentification1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPlaceOfTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
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
		public Optional<MarketIdentification1> getValue(Order6 obj) {
			return obj.getPlaceOfExecution();
		}

		@Override
		public void setValue(Order6 obj, Optional<MarketIdentification1> value) {
			obj.setPlaceOfExecution(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmInstrMtd", required = true)
	protected Max35Text settlementInstructionMethod;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInstrMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates mode used for Settlement Instructions message, eg, Default, SSI provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 160</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, Max35Text> mmSettlementInstructionMethod = new MMMessageAttribute<Order6, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "160"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionMethod";
			definition = "Indicates mode used for Settlement Instructions message, eg, Default, SSI provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Order6 obj) {
			return obj.getSettlementInstructionMethod();
		}

		@Override
		public void setValue(Order6 obj, Max35Text value) {
			obj.setSettlementInstructionMethod(value);
		}
	};
	@XmlElement(name = "OrdrRstrctns")
	protected List<OrderRestrictions1Code> orderRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmOrderRestrictions
	 * SecuritiesRegulatoryDetails.mmOrderRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRstrctns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification and restrictions linked to an order (for regulatory purpose)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 529</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order6, List<OrderRestrictions1Code>> mmOrderRestrictions = new MMMessageAttribute<Order6, List<OrderRestrictions1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRegulatoryDetails.mmOrderRestrictions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "OrdrRstrctns";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "529"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderRestrictions";
			definition = "Classification and restrictions linked to an order (for regulatory purpose).";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> OrderRestrictions1Code.mmObject();
		}

		@Override
		public List<OrderRestrictions1Code> getValue(Order6 obj) {
			return obj.getOrderRestrictions();
		}

		@Override
		public void setValue(Order6 obj, List<OrderRestrictions1Code> value) {
			obj.setOrderRestrictions(value);
		}
	};
	@XmlElement(name = "Qty2Dtls", required = true)
	protected OrderQuantity1 quantity2Details;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty2Dtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity2Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument to be ordered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, OrderQuantity1> mmQuantity2Details = new MMMessageAssociationEnd<Order6, OrderQuantity1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "Qty2Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity2Details";
			definition = "Quantity of financial instrument to be ordered.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrderQuantity1.mmObject();
		}

		@Override
		public OrderQuantity1 getValue(Order6 obj) {
			return obj.getQuantity2Details();
		}

		@Override
		public void setValue(Order6 obj, OrderQuantity1 value) {
			obj.setQuantity2Details(value);
		}
	};
	@XmlElement(name = "Qty1Dtls")
	protected OrderQuantity3 quantity1Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderQuantity3
	 * OrderQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty1Dtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity1Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions under which a securities order must be executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<OrderQuantity3>> mmQuantity1Details = new MMMessageAssociationEnd<Order6, Optional<OrderQuantity3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "Qty1Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity1Details";
			definition = "Conditions under which a securities order must be executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrderQuantity3.mmObject();
		}

		@Override
		public Optional<OrderQuantity3> getValue(Order6 obj) {
			return obj.getQuantity1Details();
		}

		@Override
		public void setValue(Order6 obj, Optional<OrderQuantity3> value) {
			obj.setQuantity1Details(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrm", required = true)
	protected SecurityIdentification7 financialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, SecurityIdentification7> mmFinancialInstrument = new MMMessageAssociationEnd<Order6, SecurityIdentification7>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Provides details about the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public SecurityIdentification7 getValue(Order6 obj) {
			return obj.getFinancialInstrument();
		}

		@Override
		public void setValue(Order6 obj, SecurityIdentification7 value) {
			obj.setFinancialInstrument(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes1 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument attributes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<FinancialInstrumentAttributes1>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<Order6, Optional<FinancialInstrumentAttributes1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes1> getValue(Order6 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(Order6 obj, Optional<FinancialInstrumentAttributes1> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "Stiptns")
	protected FinancialInstrumentStipulations stipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument stipulations."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<FinancialInstrumentStipulations>> mmStipulations = new MMMessageAssociationEnd<Order6, Optional<FinancialInstrumentStipulations>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Provides details about the financial instrument stipulations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentStipulations> getValue(Order6 obj) {
			return obj.getStipulations();
		}

		@Override
		public void setValue(Order6 obj, Optional<FinancialInstrumentStipulations> value) {
			obj.setStipulations(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygFinInstrm")
	protected List<SecurityIdentification7> underlyingFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, List<SecurityIdentification7>> mmUnderlyingFinancialInstrument = new MMMessageAssociationEnd<Order6, List<SecurityIdentification7>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrument";
			definition = "Provides details about the underlying financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public List<SecurityIdentification7> getValue(Order6 obj) {
			return obj.getUnderlyingFinancialInstrument();
		}

		@Override
		public void setValue(Order6 obj, List<SecurityIdentification7> value) {
			obj.setUnderlyingFinancialInstrument(value);
		}
	};
	@XmlElement(name = "UndrlygFinInstrmAttrbts")
	protected List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument attributes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, List<FinancialInstrumentAttributes1>> mmUnderlyingFinancialInstrumentAttributes = new MMMessageAssociationEnd<Order6, List<FinancialInstrumentAttributes1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentAttributes";
			definition = "Provides details about the underlying financial instrument attributes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}

		@Override
		public List<FinancialInstrumentAttributes1> getValue(Order6 obj) {
			return obj.getUnderlyingFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(Order6 obj, List<FinancialInstrumentAttributes1> value) {
			obj.setUnderlyingFinancialInstrumentAttributes(value);
		}
	};
	@XmlElement(name = "SprdAndBchmkCrvDtls")
	protected BenchmarkCurve1 spreadAndBenchmarkCurveDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BenchmarkCurve1
	 * BenchmarkCurve1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSpreadToBenchmark
	 * BuyOrSellIndicationOfInterest.mmSpreadToBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdAndBchmkCrvDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadAndBenchmarkCurveDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the benchmark against which the financial instrument is measured."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<BenchmarkCurve1>> mmSpreadAndBenchmarkCurveDetails = new MMMessageAssociationEnd<Order6, Optional<BenchmarkCurve1>>() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmSpreadToBenchmark;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "SprdAndBchmkCrvDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadAndBenchmarkCurveDetails";
			definition = "Provides details about the benchmark against which the financial instrument is measured.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BenchmarkCurve1.mmObject();
		}

		@Override
		public Optional<BenchmarkCurve1> getValue(Order6 obj) {
			return obj.getSpreadAndBenchmarkCurveDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<BenchmarkCurve1> value) {
			obj.setSpreadAndBenchmarkCurveDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "YldDtls")
	protected YieldCalculation1 yieldDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmCalculationType
	 * YieldCalculation.mmCalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details about the return provided by a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<YieldCalculation1>> mmYieldDetails = new MMMessageAssociationEnd<Order6, Optional<YieldCalculation1>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmCalculationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "YldDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldDetails";
			definition = "Details about the return provided by a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> YieldCalculation1.mmObject();
		}

		@Override
		public Optional<YieldCalculation1> getValue(Order6 obj) {
			return obj.getYieldDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<YieldCalculation1> value) {
			obj.setYieldDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygStiptns")
	protected List<FinancialInstrumentStipulations> underlyingStipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygStiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument stipulations."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, List<FinancialInstrumentStipulations>> mmUnderlyingStipulations = new MMMessageAssociationEnd<Order6, List<FinancialInstrumentStipulations>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "UndrlygStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingStipulations";
			definition = "Provides details about the underlying financial instrument stipulations.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}

		@Override
		public List<FinancialInstrumentStipulations> getValue(Order6 obj) {
			return obj.getUnderlyingStipulations();
		}

		@Override
		public void setValue(Order6 obj, List<FinancialInstrumentStipulations> value) {
			obj.setUnderlyingStipulations(value);
		}
	};
	@XmlElement(name = "OrdrParams")
	protected OrderParameters1 orderParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecutionParameters
	 * SecuritiesOrder.mmOrderExecutionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions under which a securities order must be executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<OrderParameters1>> mmOrderParameters = new MMMessageAssociationEnd<Order6, Optional<OrderParameters1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderExecutionParameters;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "OrdrParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderParameters";
			definition = "Conditions under which a securities order must be executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrderParameters1.mmObject();
		}

		@Override
		public Optional<OrderParameters1> getValue(Order6 obj) {
			return obj.getOrderParameters();
		}

		@Override
		public void setValue(Order6 obj, Optional<OrderParameters1> value) {
			obj.setOrderParameters(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission details related that may apply to the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<Commission2>> mmCommissionDetails = new MMMessageAssociationEnd<Order6, Optional<Commission2>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
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
		public Optional<Commission2> getValue(Order6 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<Commission2> value) {
			obj.setCommissionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnInstrsDtls")
	protected SecuritiesExecutionInstructions1 executionInstructionsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExecutionInstructions
	 * SecuritiesOrder.mmExecutionInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnInstrsDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionInstructionsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the instructions for order handling."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<SecuritiesExecutionInstructions1>> mmExecutionInstructionsDetails = new MMMessageAssociationEnd<Order6, Optional<SecuritiesExecutionInstructions1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmExecutionInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "ExctnInstrsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionInstructionsDetails";
			definition = "Identifies the instructions for order handling.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
		}

		@Override
		public Optional<SecuritiesExecutionInstructions1> getValue(Order6 obj) {
			return obj.getExecutionInstructionsDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<SecuritiesExecutionInstructions1> value) {
			obj.setExecutionInstructionsDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "StrtgyParamsDtls")
	protected StrategyParameters1 strategyParametersDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StrategyParameters1
	 * StrategyParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtgyParamsDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrategyParametersDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the strategy parameters name and type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<StrategyParameters1>> mmStrategyParametersDetails = new MMMessageAssociationEnd<Order6, Optional<StrategyParameters1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "StrtgyParamsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrategyParametersDetails";
			definition = "Defines the strategy parameters name and type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StrategyParameters1.mmObject();
		}

		@Override
		public Optional<StrategyParameters1> getValue(Order6 obj) {
			return obj.getStrategyParametersDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<StrategyParameters1> value) {
			obj.setStrategyParametersDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSsnDtls")
	protected TradingSession1 tradingSessionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListTradingSession
	 * ListTrading.mmListTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the trading session."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<TradingSession1>> mmTradingSessionDetails = new MMMessageAssociationEnd<Order6, Optional<TradingSession1>>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListTradingSession;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionDetails";
			definition = "Provides details about the trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradingSession1.mmObject();
		}

		@Override
		public Optional<TradingSession1> getValue(Order6 obj) {
			return obj.getTradingSessionDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<TradingSession1> value) {
			obj.setTradingSessionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Dscrtn")
	protected DiscretionInstructions1 discretion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOrderPriceStrategy
	 * SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dscrtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information for the executing party about the price to be obtained for an order. It is expressed as an offset from a reference price such as the market price or last trade price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<DiscretionInstructions1>> mmDiscretion = new MMMessageAssociationEnd<Order6, Optional<DiscretionInstructions1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "Dscrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretion";
			definition = "Information for the executing party about the price to be obtained for an order. It is expressed as an offset from a reference price such as the market price or last trade price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DiscretionInstructions1.mmObject();
		}

		@Override
		public Optional<DiscretionInstructions1> getValue(Order6 obj) {
			return obj.getDiscretion();
		}

		@Override
		public void setValue(Order6 obj, Optional<DiscretionInstructions1> value) {
			obj.setDiscretion(value.orElse(null));
		}
	};
	@XmlElement(name = "PreAllcnDtls")
	protected PreAllocation1 preAllocationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PreAllocation1
	 * PreAllocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
	 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreAllcnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides pre-allocation information for the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<PreAllocation1>> mmPreAllocationDetails = new MMMessageAssociationEnd<Order6, Optional<PreAllocation1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSecuritiesOrderAllocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "PreAllcnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAllocationDetails";
			definition = "Provides pre-allocation information for the order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PreAllocation1.mmObject();
		}

		@Override
		public Optional<PreAllocation1> getValue(Order6 obj) {
			return obj.getPreAllocationDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<PreAllocation1> value) {
			obj.setPreAllocationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "BookgDtls")
	protected Booking1 bookingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Booking1 Booking1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBookingInstructions
	 * SecuritiesOrder.mmBookingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information used to book the executions of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<Booking1>> mmBookingDetails = new MMMessageAssociationEnd<Order6, Optional<Booking1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmBookingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "BookgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingDetails";
			definition = "Information used to book the executions of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Booking1.mmObject();
		}

		@Override
		public Optional<Booking1> getValue(Order6 obj) {
			return obj.getBookingDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<Booking1> value) {
			obj.setBookingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPties")
	protected List<Intermediary14> tradingParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties used for acting parties that applies either to the whole message or to individual sides."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, List<Intermediary14>> mmTradingParties = new MMMessageAssociationEnd<Order6, List<Intermediary14>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Parties used for acting parties that applies either to the whole message or to individual sides.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary14.mmObject();
		}

		@Override
		public List<Intermediary14> getValue(Order6 obj) {
			return obj.getTradingParties();
		}

		@Override
		public void setValue(Order6 obj, List<Intermediary14> value) {
			obj.setTradingParties(value);
		}
	};
	@XmlElement(name = "SttlmDtls")
	protected SecuritiesSettlement1 settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1
	 * SecuritiesSettlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<SecuritiesSettlement1>> mmSettlementDetails = new MMMessageAssociationEnd<Order6, Optional<SecuritiesSettlement1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Parameters applied to the settlement of a security transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlement1.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement1> getValue(Order6 obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(Order6 obj, Optional<SecuritiesSettlement1> value) {
			obj.setSettlementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties1 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties1
	 * CashParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<CashParties1>> mmCashParties = new MMMessageAssociationEnd<Order6, Optional<CashParties1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashParties1.mmObject();
		}

		@Override
		public Optional<CashParties1> getValue(Order6 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(Order6 obj, Optional<CashParties1> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties1 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties1
	 * OtherParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderPartyRole
	 * SecuritiesOrder.mmSecuritiesOrderPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<OtherParties1>> mmOtherBusinessParties = new MMMessageAssociationEnd<Order6, Optional<OtherParties1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSecuritiesOrderPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherParties1.mmObject();
		}

		@Override
		public Optional<OtherParties1> getValue(Order6 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(Order6 obj, Optional<OtherParties1> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties3 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<SettlementParties3>> mmReceivingSettlementParties = new MMMessageAssociationEnd<Order6, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(Order6 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(Order6 obj, Optional<SettlementParties3> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties3 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, Optional<SettlementParties3>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<Order6, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(Order6 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(Order6 obj, Optional<SettlementParties3> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls")
	protected List<OtherAmounts1> amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmounts1
	 * OtherAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
	 * SecuritiesOrder.mmOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order6
	 * Order6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies amounts of money such as taxes and charges as well as amounts needed for accounting purposes, eg, original face value traded, broker commission, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order6, List<OtherAmounts1>> mmAmountDetails = new MMMessageAssociationEnd<Order6, List<OtherAmounts1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Identifies amounts of money such as taxes and charges as well as amounts needed for accounting purposes, eg, original face value traded, broker commission, etc.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherAmounts1.mmObject();
		}

		@Override
		public List<OtherAmounts1> getValue(Order6 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(Order6 obj, List<OtherAmounts1> value) {
			obj.setAmountDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order6.mmListOrderNumber, com.tools20022.repository.msg.Order6.mmClientOrderIdentification,
						com.tools20022.repository.msg.Order6.mmSecondaryClientOrderIdentification, com.tools20022.repository.msg.Order6.mmClientOrderLinkIdentification, com.tools20022.repository.msg.Order6.mmSolicitedOrder,
						com.tools20022.repository.msg.Order6.mmTradeDate, com.tools20022.repository.msg.Order6.mmSide, com.tools20022.repository.msg.Order6.mmSideValueIndicator,
						com.tools20022.repository.msg.Order6.mmForeignExchangeExecutionRequestedIndicator, com.tools20022.repository.msg.Order6.mmCashMargin, com.tools20022.repository.msg.Order6.mmPreviousClosingPrice,
						com.tools20022.repository.msg.Order6.mmComplianceIdentification, com.tools20022.repository.msg.Order6.mmTradingCapacity, com.tools20022.repository.msg.Order6.mmCustomerCapacity,
						com.tools20022.repository.msg.Order6.mmPositionEffect, com.tools20022.repository.msg.Order6.mmDerivativeCovered, com.tools20022.repository.msg.Order6.mmTradeRegulator,
						com.tools20022.repository.msg.Order6.mmTradeOriginationDate, com.tools20022.repository.msg.Order6.mmSettlementCurrency, com.tools20022.repository.msg.Order6.mmClearingFeeType,
						com.tools20022.repository.msg.Order6.mmOrderOriginatorEligibility, com.tools20022.repository.msg.Order6.mmPlaceOfExecution, com.tools20022.repository.msg.Order6.mmSettlementInstructionMethod,
						com.tools20022.repository.msg.Order6.mmOrderRestrictions, com.tools20022.repository.msg.Order6.mmQuantity2Details, com.tools20022.repository.msg.Order6.mmQuantity1Details,
						com.tools20022.repository.msg.Order6.mmFinancialInstrument, com.tools20022.repository.msg.Order6.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.Order6.mmStipulations,
						com.tools20022.repository.msg.Order6.mmUnderlyingFinancialInstrument, com.tools20022.repository.msg.Order6.mmUnderlyingFinancialInstrumentAttributes,
						com.tools20022.repository.msg.Order6.mmSpreadAndBenchmarkCurveDetails, com.tools20022.repository.msg.Order6.mmYieldDetails, com.tools20022.repository.msg.Order6.mmUnderlyingStipulations,
						com.tools20022.repository.msg.Order6.mmOrderParameters, com.tools20022.repository.msg.Order6.mmCommissionDetails, com.tools20022.repository.msg.Order6.mmExecutionInstructionsDetails,
						com.tools20022.repository.msg.Order6.mmStrategyParametersDetails, com.tools20022.repository.msg.Order6.mmTradingSessionDetails, com.tools20022.repository.msg.Order6.mmDiscretion,
						com.tools20022.repository.msg.Order6.mmPreAllocationDetails, com.tools20022.repository.msg.Order6.mmBookingDetails, com.tools20022.repository.msg.Order6.mmTradingParties,
						com.tools20022.repository.msg.Order6.mmSettlementDetails, com.tools20022.repository.msg.Order6.mmCashParties, com.tools20022.repository.msg.Order6.mmOtherBusinessParties,
						com.tools20022.repository.msg.Order6.mmReceivingSettlementParties, com.tools20022.repository.msg.Order6.mmDeliveringSettlementParties, com.tools20022.repository.msg.Order6.mmAmountDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSideValue.forOrder6, com.tools20022.repository.constraints.ConstraintSettlementCurrency.forOrder6);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Order6";
				definition = "Intention to transfer an ownership of a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getListOrderNumber() {
		return listOrderNumber;
	}

	public Order6 setListOrderNumber(Number listOrderNumber) {
		this.listOrderNumber = Objects.requireNonNull(listOrderNumber);
		return this;
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public Order6 setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = Objects.requireNonNull(clientOrderIdentification);
		return this;
	}

	public Optional<Max35Text> getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification == null ? Optional.empty() : Optional.of(secondaryClientOrderIdentification);
	}

	public Order6 setSecondaryClientOrderIdentification(Max35Text secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
		return this;
	}

	public Optional<Max35Text> getClientOrderLinkIdentification() {
		return clientOrderLinkIdentification == null ? Optional.empty() : Optional.of(clientOrderLinkIdentification);
	}

	public Order6 setClientOrderLinkIdentification(Max35Text clientOrderLinkIdentification) {
		this.clientOrderLinkIdentification = clientOrderLinkIdentification;
		return this;
	}

	public YesNoIndicator getSolicitedOrder() {
		return solicitedOrder;
	}

	public Order6 setSolicitedOrder(YesNoIndicator solicitedOrder) {
		this.solicitedOrder = Objects.requireNonNull(solicitedOrder);
		return this;
	}

	public ISODateTime getTradeDate() {
		return tradeDate;
	}

	public Order6 setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public Side1Code getSide() {
		return side;
	}

	public Order6 setSide(Side1Code side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public Optional<TrueFalseIndicator> getSideValueIndicator() {
		return sideValueIndicator == null ? Optional.empty() : Optional.of(sideValueIndicator);
	}

	public Order6 setSideValueIndicator(TrueFalseIndicator sideValueIndicator) {
		this.sideValueIndicator = sideValueIndicator;
		return this;
	}

	public YesNoIndicator getForeignExchangeExecutionRequestedIndicator() {
		return foreignExchangeExecutionRequestedIndicator;
	}

	public Order6 setForeignExchangeExecutionRequestedIndicator(YesNoIndicator foreignExchangeExecutionRequestedIndicator) {
		this.foreignExchangeExecutionRequestedIndicator = Objects.requireNonNull(foreignExchangeExecutionRequestedIndicator);
		return this;
	}

	public Optional<CashMarginOrder1Code> getCashMargin() {
		return cashMargin == null ? Optional.empty() : Optional.of(cashMargin);
	}

	public Order6 setCashMargin(CashMarginOrder1Code cashMargin) {
		this.cashMargin = cashMargin;
		return this;
	}

	public Optional<Price1> getPreviousClosingPrice() {
		return previousClosingPrice == null ? Optional.empty() : Optional.of(previousClosingPrice);
	}

	public Order6 setPreviousClosingPrice(Price1 previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
		return this;
	}

	public Optional<Max35Text> getComplianceIdentification() {
		return complianceIdentification == null ? Optional.empty() : Optional.of(complianceIdentification);
	}

	public Order6 setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
		return this;
	}

	public Optional<TradingCapacity3Code> getTradingCapacity() {
		return tradingCapacity == null ? Optional.empty() : Optional.of(tradingCapacity);
	}

	public Order6 setTradingCapacity(TradingCapacity3Code tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
		return this;
	}

	public Optional<CustomerOrderCapacity1Code> getCustomerCapacity() {
		return customerCapacity == null ? Optional.empty() : Optional.of(customerCapacity);
	}

	public Order6 setCustomerCapacity(CustomerOrderCapacity1Code customerCapacity) {
		this.customerCapacity = customerCapacity;
		return this;
	}

	public Optional<PositionEffect1Code> getPositionEffect() {
		return positionEffect == null ? Optional.empty() : Optional.of(positionEffect);
	}

	public Order6 setPositionEffect(PositionEffect1Code positionEffect) {
		this.positionEffect = positionEffect;
		return this;
	}

	public Optional<YesNoIndicator> getDerivativeCovered() {
		return derivativeCovered == null ? Optional.empty() : Optional.of(derivativeCovered);
	}

	public Order6 setDerivativeCovered(YesNoIndicator derivativeCovered) {
		this.derivativeCovered = derivativeCovered;
		return this;
	}

	public Optional<PartyIdentification23> getTradeRegulator() {
		return tradeRegulator == null ? Optional.empty() : Optional.of(tradeRegulator);
	}

	public Order6 setTradeRegulator(PartyIdentification23 tradeRegulator) {
		this.tradeRegulator = tradeRegulator;
		return this;
	}

	public Optional<ISODateTime> getTradeOriginationDate() {
		return tradeOriginationDate == null ? Optional.empty() : Optional.of(tradeOriginationDate);
	}

	public Order6 setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = tradeOriginationDate;
		return this;
	}

	public Optional<CurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? Optional.empty() : Optional.of(settlementCurrency);
	}

	public Order6 setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
		return this;
	}

	public Optional<ClearingFeeType1Code> getClearingFeeType() {
		return clearingFeeType == null ? Optional.empty() : Optional.of(clearingFeeType);
	}

	public Order6 setClearingFeeType(ClearingFeeType1Code clearingFeeType) {
		this.clearingFeeType = clearingFeeType;
		return this;
	}

	public Optional<Eligibility1Code> getOrderOriginatorEligibility() {
		return orderOriginatorEligibility == null ? Optional.empty() : Optional.of(orderOriginatorEligibility);
	}

	public Order6 setOrderOriginatorEligibility(Eligibility1Code orderOriginatorEligibility) {
		this.orderOriginatorEligibility = orderOriginatorEligibility;
		return this;
	}

	public Optional<MarketIdentification1> getPlaceOfExecution() {
		return placeOfExecution == null ? Optional.empty() : Optional.of(placeOfExecution);
	}

	public Order6 setPlaceOfExecution(MarketIdentification1 placeOfExecution) {
		this.placeOfExecution = placeOfExecution;
		return this;
	}

	public Max35Text getSettlementInstructionMethod() {
		return settlementInstructionMethod;
	}

	public Order6 setSettlementInstructionMethod(Max35Text settlementInstructionMethod) {
		this.settlementInstructionMethod = Objects.requireNonNull(settlementInstructionMethod);
		return this;
	}

	public List<OrderRestrictions1Code> getOrderRestrictions() {
		return orderRestrictions == null ? orderRestrictions = new ArrayList<>() : orderRestrictions;
	}

	public Order6 setOrderRestrictions(List<OrderRestrictions1Code> orderRestrictions) {
		this.orderRestrictions = Objects.requireNonNull(orderRestrictions);
		return this;
	}

	public OrderQuantity1 getQuantity2Details() {
		return quantity2Details;
	}

	public Order6 setQuantity2Details(OrderQuantity1 quantity2Details) {
		this.quantity2Details = Objects.requireNonNull(quantity2Details);
		return this;
	}

	public Optional<OrderQuantity3> getQuantity1Details() {
		return quantity1Details == null ? Optional.empty() : Optional.of(quantity1Details);
	}

	public Order6 setQuantity1Details(OrderQuantity3 quantity1Details) {
		this.quantity1Details = quantity1Details;
		return this;
	}

	public SecurityIdentification7 getFinancialInstrument() {
		return financialInstrument;
	}

	public Order6 setFinancialInstrument(SecurityIdentification7 financialInstrument) {
		this.financialInstrument = Objects.requireNonNull(financialInstrument);
		return this;
	}

	public Optional<FinancialInstrumentAttributes1> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public Order6 setFinancialInstrumentAttributes(FinancialInstrumentAttributes1 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public Optional<FinancialInstrumentStipulations> getStipulations() {
		return stipulations == null ? Optional.empty() : Optional.of(stipulations);
	}

	public Order6 setStipulations(FinancialInstrumentStipulations stipulations) {
		this.stipulations = stipulations;
		return this;
	}

	public List<SecurityIdentification7> getUnderlyingFinancialInstrument() {
		return underlyingFinancialInstrument == null ? underlyingFinancialInstrument = new ArrayList<>() : underlyingFinancialInstrument;
	}

	public Order6 setUnderlyingFinancialInstrument(List<SecurityIdentification7> underlyingFinancialInstrument) {
		this.underlyingFinancialInstrument = Objects.requireNonNull(underlyingFinancialInstrument);
		return this;
	}

	public List<FinancialInstrumentAttributes1> getUnderlyingFinancialInstrumentAttributes() {
		return underlyingFinancialInstrumentAttributes == null ? underlyingFinancialInstrumentAttributes = new ArrayList<>() : underlyingFinancialInstrumentAttributes;
	}

	public Order6 setUnderlyingFinancialInstrumentAttributes(List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes) {
		this.underlyingFinancialInstrumentAttributes = Objects.requireNonNull(underlyingFinancialInstrumentAttributes);
		return this;
	}

	public Optional<BenchmarkCurve1> getSpreadAndBenchmarkCurveDetails() {
		return spreadAndBenchmarkCurveDetails == null ? Optional.empty() : Optional.of(spreadAndBenchmarkCurveDetails);
	}

	public Order6 setSpreadAndBenchmarkCurveDetails(BenchmarkCurve1 spreadAndBenchmarkCurveDetails) {
		this.spreadAndBenchmarkCurveDetails = spreadAndBenchmarkCurveDetails;
		return this;
	}

	public Optional<YieldCalculation1> getYieldDetails() {
		return yieldDetails == null ? Optional.empty() : Optional.of(yieldDetails);
	}

	public Order6 setYieldDetails(YieldCalculation1 yieldDetails) {
		this.yieldDetails = yieldDetails;
		return this;
	}

	public List<FinancialInstrumentStipulations> getUnderlyingStipulations() {
		return underlyingStipulations == null ? underlyingStipulations = new ArrayList<>() : underlyingStipulations;
	}

	public Order6 setUnderlyingStipulations(List<FinancialInstrumentStipulations> underlyingStipulations) {
		this.underlyingStipulations = Objects.requireNonNull(underlyingStipulations);
		return this;
	}

	public Optional<OrderParameters1> getOrderParameters() {
		return orderParameters == null ? Optional.empty() : Optional.of(orderParameters);
	}

	public Order6 setOrderParameters(OrderParameters1 orderParameters) {
		this.orderParameters = orderParameters;
		return this;
	}

	public Optional<Commission2> getCommissionDetails() {
		return commissionDetails == null ? Optional.empty() : Optional.of(commissionDetails);
	}

	public Order6 setCommissionDetails(Commission2 commissionDetails) {
		this.commissionDetails = commissionDetails;
		return this;
	}

	public Optional<SecuritiesExecutionInstructions1> getExecutionInstructionsDetails() {
		return executionInstructionsDetails == null ? Optional.empty() : Optional.of(executionInstructionsDetails);
	}

	public Order6 setExecutionInstructionsDetails(SecuritiesExecutionInstructions1 executionInstructionsDetails) {
		this.executionInstructionsDetails = executionInstructionsDetails;
		return this;
	}

	public Optional<StrategyParameters1> getStrategyParametersDetails() {
		return strategyParametersDetails == null ? Optional.empty() : Optional.of(strategyParametersDetails);
	}

	public Order6 setStrategyParametersDetails(StrategyParameters1 strategyParametersDetails) {
		this.strategyParametersDetails = strategyParametersDetails;
		return this;
	}

	public Optional<TradingSession1> getTradingSessionDetails() {
		return tradingSessionDetails == null ? Optional.empty() : Optional.of(tradingSessionDetails);
	}

	public Order6 setTradingSessionDetails(TradingSession1 tradingSessionDetails) {
		this.tradingSessionDetails = tradingSessionDetails;
		return this;
	}

	public Optional<DiscretionInstructions1> getDiscretion() {
		return discretion == null ? Optional.empty() : Optional.of(discretion);
	}

	public Order6 setDiscretion(DiscretionInstructions1 discretion) {
		this.discretion = discretion;
		return this;
	}

	public Optional<PreAllocation1> getPreAllocationDetails() {
		return preAllocationDetails == null ? Optional.empty() : Optional.of(preAllocationDetails);
	}

	public Order6 setPreAllocationDetails(PreAllocation1 preAllocationDetails) {
		this.preAllocationDetails = preAllocationDetails;
		return this;
	}

	public Optional<Booking1> getBookingDetails() {
		return bookingDetails == null ? Optional.empty() : Optional.of(bookingDetails);
	}

	public Order6 setBookingDetails(Booking1 bookingDetails) {
		this.bookingDetails = bookingDetails;
		return this;
	}

	public List<Intermediary14> getTradingParties() {
		return tradingParties == null ? tradingParties = new ArrayList<>() : tradingParties;
	}

	public Order6 setTradingParties(List<Intermediary14> tradingParties) {
		this.tradingParties = Objects.requireNonNull(tradingParties);
		return this;
	}

	public Optional<SecuritiesSettlement1> getSettlementDetails() {
		return settlementDetails == null ? Optional.empty() : Optional.of(settlementDetails);
	}

	public Order6 setSettlementDetails(SecuritiesSettlement1 settlementDetails) {
		this.settlementDetails = settlementDetails;
		return this;
	}

	public Optional<CashParties1> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public Order6 setCashParties(CashParties1 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<OtherParties1> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public Order6 setOtherBusinessParties(OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<SettlementParties3> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public Order6 setReceivingSettlementParties(SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<SettlementParties3> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public Order6 setDeliveringSettlementParties(SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public List<OtherAmounts1> getAmountDetails() {
		return amountDetails == null ? amountDetails = new ArrayList<>() : amountDetails;
	}

	public Order6 setAmountDetails(List<OtherAmounts1> amountDetails) {
		this.amountDetails = Objects.requireNonNull(amountDetails);
		return this;
	}
}