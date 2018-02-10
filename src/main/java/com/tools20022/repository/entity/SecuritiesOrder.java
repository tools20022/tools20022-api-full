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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Intention to transfer an ownership of a financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrder" src="doc-files/SecuritiesOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderEffectiveDate
 * SecuritiesOrder.mmOrderEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExpiryDate
 * SecuritiesOrder.mmOrderExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
 * SecuritiesOrder.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCashMargin
 * SecuritiesOrder.mmCashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
 * SecuritiesOrder.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSolicitedOrder
 * SecuritiesOrder.mmSolicitedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCustomerCapacity
 * SecuritiesOrder.mmCustomerCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
 * SecuritiesOrder.mmPositionEffect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmForeignExchangeExecutionRequested
 * SecuritiesOrder.mmForeignExchangeExecutionRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSettlementCurrency
 * SecuritiesOrder.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderOriginatorEligibility
 * SecuritiesOrder.mmOrderOriginatorEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
 * SecuritiesOrder.mmOrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBusinessProcessType
 * SecuritiesOrder.mmBusinessProcessType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
 * SecuritiesOrder.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
 * SecuritiesOrder.mmOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmGiveUpNumberOfDays
 * SecuritiesOrder.mmGiveUpNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmTradeRegulatoryConditionsType
 * SecuritiesOrder.mmTradeRegulatoryConditionsType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmDayOrderQuantity
 * SecuritiesOrder.mmDayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderPartyRole
 * SecuritiesOrder.mmSecuritiesOrderPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
 * SecuritiesOrder.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedNegotiation
 * SecuritiesOrder.mmRelatedNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
 * SecuritiesOrder.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmLegalParameters
 * SecuritiesOrder.mmLegalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
 * SecuritiesOrder.mmOrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
 * SecuritiesOrder.mmStopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecutionParameters
 * SecuritiesOrder.mmOrderExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
 * SecuritiesOrder.mmOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
 * SecuritiesOrder.mmOrderingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuote
 * SecuritiesOrder.mmQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmFundTransactionDirectionIndicator
 * SecuritiesOrder.mmFundTransactionDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderDate
 * SecuritiesOrder.mmOrderDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPegDifference
 * SecuritiesOrder.mmPegDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderTradingSession
 * SecuritiesOrder.mmSecuritiesOrderTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmRelatedOrderBook
 * SecuritiesOrder.mmRelatedOrderBook}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmListTrading
 * SecuritiesOrder.mmListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBuySideRelatedCrossTrade
 * SecuritiesOrder.mmBuySideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSellSideRelatedCrossTrade
 * SecuritiesOrder.mmSellSideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
 * SecuritiesOrder.mmOrderedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBookingInstructions
 * SecuritiesOrder.mmBookingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExchangeForPhysicalTrade
 * SecuritiesOrder.mmExchangeForPhysicalTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmQuantityType
 * SecuritiesOrder.mmQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
 * SecuritiesOrder.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExecutionInstructions
 * SecuritiesOrder.mmExecutionInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmType
 * SecuritiesOrder.mmType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesOrder
 * Security.mmSecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOrder
 * SecuritiesPricing.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmStopPriceOrder
 * SecuritiesPricing.mmStopPriceOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedOrder
 * TradingMarket.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedOrder
 * SecuritiesAccount.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmSecuritiesOrder
 * Adjustment.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrder
 * SecuritiesQuantity.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPreviousDayOrder
 * SecuritiesQuantity.mmPreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
 * SecuritiesTrade.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSecuritiesListOrder
 * ListTrading.mmSecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmSecuritiesOrder
 * TradingSession.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesOrder
 * Allocation.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmRelatedOrder
 * SecuritiesOrderExecutionInstruction.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmRelatedOrder
 * SecuritiesPostTradeBooking.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#mmSecuritiesOrder
 * SecuritiesOrderPartyRole.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmSecuritiesOrder
 * Negotiation.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSecuritiesOrder
 * SecuritiesOrderStatus.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmRelatedSecuritiesOrder
 * SecuritiesOrderParameters.mmRelatedSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmRelatedOrder
 * SecuritiesRegulatoryDetails.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmSecuritiesOrder
 * SecuritiesQuoteVariable.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmSecuritiesOrder
 * ExchangeForPhysicalTrade.mmSecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrderBook#mmOrder
 * OrderBook.mmOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmBuySideOrder
 * CrossTrade.mmBuySideOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#mmSellSideOrder
 * CrossTrade.mmSellSideOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmBusinessProcessType
 * Order16.mmBusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPartialFillDetails
 * Order16.mmPartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmBusinessProcessType
 * Order14.mmBusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPartialFillDetails
 * Order14.mmPartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#mmOrderDetails
 * SingleQuote1.mmOrderDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleOrder1#mmOrderDetails
 * SingleOrder1.mmOrderDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultiLegOrder1#mmOrderDetails
 * MultiLegOrder1.mmOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice#mmSingleOrderDetails
 * SingleOrMultiLegOrderChoice.mmSingleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice#mmMultilegOrderDetails
 * SingleOrMultiLegOrderChoice.mmMultilegOrderDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmBusinessProcessType
 * Order17.mmBusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPartialFillDetails
 * Order17.mmPartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmBusinessProcessType
 * Order18.mmBusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPartialFillDetails
 * Order18.mmPartialFillDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade CrossTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity1 OrderQuantity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order3 Order3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BusinessProcessType1Choice
 * BusinessProcessType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartialFill1 PartialFill1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16 Order16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14 Order14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9 Order9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order1 Order1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultiLegOrder1 MultiLegOrder1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid2 Bid2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid3 Bid3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity3 OrderQuantity3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order2 Order2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderSide1 OrderSide1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderIdentification3
 * OrderIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order6 Order6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order11 Order11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order17 Order17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order18 Order18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
 * </ul>
 * </li>
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
 * "SecuritiesOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * </ul>
 */
public class SecuritiesOrder extends Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime orderEffectiveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmEffectiveDateAndTime
	 * OrderParameters1.mmEffectiveDateAndTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 168</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderEffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderEffectiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrderParameters1.mmEffectiveDateAndTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "168"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderEffectiveDate";
			definition = "Date/time on which the order is effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderExpiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmExpiryDateTime
	 * Order1.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmExpiryDateAndTime
	 * OrderParameters1.mmExpiryDateAndTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EXPI, FIXSynonym: 432 and 126</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is to expire."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order1.mmExpiryDateTime, OrderParameters1.mmExpiryDateAndTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXPI"), new FIXSynonym(this, "432 and 126"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderExpiryDate";
			definition = "Date/time on which the order is to expire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4#mmOrderReference
	 * InvestmentFundOrder4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmClientOrderLinkIdentification
	 * IdentificationReference8Choice.mmClientOrderLinkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmClientOrderLinkIdentification
	 * IdentificationReference11Choice.mmClientOrderLinkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmSecondaryClientOrderIdentification
	 * Order3.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmOrderIdentification
	 * Order16.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmOrderIdentification
	 * Order14.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#mmOrderReference
	 * IndividualOrderStatusAndReason4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmOrderReference
	 * IndividualOrderConfirmationStatusAndReason1.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmOrderReference
	 * IndividualOrderStatusAndReason1.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmOrderReference
	 * IndividualOrderStatusAndReason2.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmRedemptionLegIdentification
	 * SwitchLegReferences1.mmRedemptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmSubscriptionLegIdentification
	 * SwitchLegReferences1.mmSubscriptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmOrderReference
	 * SwitchOrderStatusAndReason1.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmOrderReference
	 * RedemptionOrder3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder5#mmOrderReference
	 * InvestmentFundOrder5.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder1#mmOrderReferences
	 * InvestmentFundOrder1.mmOrderReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmOrderReference
	 * RedemptionOrder5.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmOrderReference
	 * RedemptionExecution3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmOrderReference
	 * RedemptionExecution5.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2#mmOrderReference
	 * InvestmentFundOrderExecution2.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmOrderReferences
	 * InvestmentFundOrderExecution1.mmOrderReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmOrderReference
	 * RedemptionOrder7.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmOrderReference
	 * RedemptionOrder4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmOrderReference
	 * RedemptionOrder6.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmOrderReference
	 * RedemptionExecution4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmOrderReference
	 * RedemptionExecution6.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmOrderReference
	 * RedemptionOrder8.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#mmOrderReference
	 * InvestmentFundOrder3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#mmOrderReference
	 * MessageAndBusinessReference5.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#mmIndividualOrderReference
	 * MessageAndBusinessReference2.mmIndividualOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmOrderReference
	 * InvestmentFundOrder2.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#mmOrderReference
	 * MessageAndBusinessReference4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmOrderReference
	 * InvestmentFundTransaction2.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmOrderReference
	 * InvestmentFundTransaction3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmOrderReference
	 * SubscriptionOrder3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmOrderReference
	 * SubscriptionOrder5.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmOrderReference
	 * SubscriptionExecution3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmOrderReference
	 * SubscriptionExecution5.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmOrderReference
	 * SubscriptionOrder7.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmOrderReference
	 * SubscriptionOrder4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmOrderReference
	 * SubscriptionOrder6.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmOrderReference
	 * SubscriptionExecution4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmOrderReference
	 * SubscriptionExecution6.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmOrderReference
	 * SubscriptionOrder8.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmOrderReference
	 * SwitchOrder2.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmOrderReference
	 * SwitchOrder3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmOrderReference
	 * SwitchExecution3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmOrderReference
	 * SwitchExecution4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmOrderReference
	 * SwitchOrder4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmOrderReference
	 * IndividualOrderStatusAndReason3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LotDetails1#mmOrderReference
	 * LotDetails1.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmOrderReference
	 * RedemptionExecution10.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmOrderReference
	 * RedemptionOrder9.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmOrderReference
	 * SubscriptionExecution7.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmOrderReference
	 * SubscriptionOrder9.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmOrderReference
	 * InvestmentFundOrderExecution3.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#mmOrderReference
	 * InvestmentFundOrder6.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#mmOrderReference
	 * IndividualOrderStatusAndReason5.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmOrderReference
	 * RedemptionOrder11.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmOrderReference
	 * RedemptionExecution12.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmOrderReference
	 * SubscriptionOrder11.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmOrderReference
	 * SubscriptionExecution9.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmOrderIdentification
	 * OrderIdentification3.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmSecondaryClientOrderIdentification
	 * Order6.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmClientOrderIdentification
	 * ListStrikePriceDetails1.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmSecondaryClientOrderIdentification
	 * ListStrikePriceDetails1.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmOrderIdentification
	 * Order17.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmOrderIdentification
	 * Order18.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmOrderReference
	 * InvestmentFundTransaction4.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmOrderIdentification
	 * TradeLeg8.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmOrderIdentification
	 * TradeLeg10.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmOrderIdentification
	 * TradeLeg9.mmOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmOrderReference
	 * IndividualOrderConfirmationStatusAndReason2.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmOrderReference
	 * InvestmentFundOrder11.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmOrderReference
	 * SwitchExecution7.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#mmOrderReference
	 * MessageAndBusinessReference10.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#mmOrderReference
	 * InvestmentFundOrder9.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmOrderReference
	 * SwitchOrder7.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderReference
	 * RedemptionOrder14.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderReference
	 * IndividualOrderStatusAndReason7.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderReference
	 * SwitchOrderStatusAndReason2.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmOrderReference
	 * IndividualOrderStatusAndReason8.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderReference
	 * SubscriptionExecution13.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmOrderReference
	 * SubscriptionExecution12.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderReference
	 * SubscriptionOrder15.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmOrderReference
	 * RedemptionOrder15.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderReference
	 * RedemptionExecution16.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmOrderReference
	 * SubscriptionOrder14.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmOrderReference
	 * InvestmentFundOrder8.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice#mmRedemptionLegIdentification
	 * LegIdentification1Choice.mmRedemptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice#mmSubscriptionLegIdentification
	 * LegIdentification1Choice.mmSubscriptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmOrderReference
	 * RedemptionExecution15.mmOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmLegIdentification
	 * SwitchLegReferences2.mmLegIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmReference
	 * Unit8.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundOrder4.mmOrderReference, IdentificationReference8Choice.mmClientOrderLinkIdentification, IdentificationReference11Choice.mmClientOrderLinkIdentification,
					Order3.mmSecondaryClientOrderIdentification, Order16.mmOrderIdentification, Order14.mmOrderIdentification, IndividualOrderStatusAndReason4.mmOrderReference, IndividualOrderConfirmationStatusAndReason1.mmOrderReference,
					IndividualOrderStatusAndReason1.mmOrderReference, IndividualOrderStatusAndReason2.mmOrderReference, SwitchLegReferences1.mmRedemptionLegIdentification, SwitchLegReferences1.mmSubscriptionLegIdentification,
					SwitchOrderStatusAndReason1.mmOrderReference, RedemptionOrder3.mmOrderReference, InvestmentFundOrder5.mmOrderReference, InvestmentFundOrder1.mmOrderReferences, RedemptionOrder5.mmOrderReference,
					RedemptionExecution3.mmOrderReference, RedemptionExecution5.mmOrderReference, InvestmentFundOrderExecution2.mmOrderReference, InvestmentFundOrderExecution1.mmOrderReferences, RedemptionOrder7.mmOrderReference,
					RedemptionOrder4.mmOrderReference, RedemptionOrder6.mmOrderReference, RedemptionExecution4.mmOrderReference, RedemptionExecution6.mmOrderReference, RedemptionOrder8.mmOrderReference,
					InvestmentFundOrder3.mmOrderReference, MessageAndBusinessReference5.mmOrderReference, MessageAndBusinessReference2.mmIndividualOrderReference, InvestmentFundOrder2.mmOrderReference,
					MessageAndBusinessReference4.mmOrderReference, InvestmentFundTransaction2.mmOrderReference, InvestmentFundTransaction3.mmOrderReference, SubscriptionOrder3.mmOrderReference, SubscriptionOrder5.mmOrderReference,
					SubscriptionExecution3.mmOrderReference, SubscriptionExecution5.mmOrderReference, SubscriptionOrder7.mmOrderReference, SubscriptionOrder4.mmOrderReference, SubscriptionOrder6.mmOrderReference,
					SubscriptionExecution4.mmOrderReference, SubscriptionExecution6.mmOrderReference, SubscriptionOrder8.mmOrderReference, SwitchOrder2.mmOrderReference, SwitchOrder3.mmOrderReference, SwitchExecution3.mmOrderReference,
					SwitchExecution4.mmOrderReference, SwitchOrder4.mmOrderReference, IndividualOrderStatusAndReason3.mmOrderReference, LotDetails1.mmOrderReference, RedemptionExecution10.mmOrderReference,
					RedemptionOrder9.mmOrderReference, SubscriptionExecution7.mmOrderReference, SubscriptionOrder9.mmOrderReference, InvestmentFundOrderExecution3.mmOrderReference, InvestmentFundOrder6.mmOrderReference,
					IndividualOrderStatusAndReason5.mmOrderReference, RedemptionOrder11.mmOrderReference, RedemptionExecution12.mmOrderReference, SubscriptionOrder11.mmOrderReference, SubscriptionExecution9.mmOrderReference,
					OrderIdentification3.mmOrderIdentification, Order6.mmSecondaryClientOrderIdentification, ListStrikePriceDetails1.mmClientOrderIdentification, ListStrikePriceDetails1.mmSecondaryClientOrderIdentification,
					Order17.mmOrderIdentification, Order18.mmOrderIdentification, InvestmentFundTransaction4.mmOrderReference, TradeLeg8.mmOrderIdentification, TradeLeg10.mmOrderIdentification, TradeLeg9.mmOrderIdentification,
					IndividualOrderConfirmationStatusAndReason2.mmOrderReference, InvestmentFundOrder11.mmOrderReference, SwitchExecution7.mmOrderReference, MessageAndBusinessReference10.mmOrderReference,
					InvestmentFundOrder9.mmOrderReference, SwitchOrder7.mmOrderReference, RedemptionOrder14.mmOrderReference, IndividualOrderStatusAndReason7.mmOrderReference, SwitchOrderStatusAndReason2.mmOrderReference,
					IndividualOrderStatusAndReason8.mmOrderReference, SubscriptionExecution13.mmOrderReference, SubscriptionExecution12.mmOrderReference, SubscriptionOrder15.mmOrderReference, RedemptionOrder15.mmOrderReference,
					RedemptionExecution16.mmOrderReference, SubscriptionOrder14.mmOrderReference, InvestmentFundOrder8.mmOrderReference, LegIdentification1Choice.mmRedemptionLegIdentification,
					LegIdentification1Choice.mmSubscriptionLegIdentification, RedemptionExecution15.mmOrderReference, SwitchLegReferences2.mmLegIdentification, Unit8.mmReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashMarginOrderCode cashMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode
	 * CashMarginOrderCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmCashMargin
	 * Order3.mmCashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCashMargin
	 * Order16.mmCashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCashMargin
	 * Order14.mmCashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCashMargin
	 * Order9.mmCashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCashMargin
	 * Order6.mmCashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCashMargin
	 * Order17.mmCashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCashMargin
	 * Order18.mmCashMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 544</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashMargin = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmCashMargin, Order16.mmCashMargin, Order14.mmCashMargin, Order9.mmCashMargin, Order6.mmCashMargin, Order17.mmCashMargin, Order18.mmCashMargin);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "544"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashMarginOrderCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getCashMargin", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SideCode side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.SideCode
	 * SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LegDetails1#mmSide
	 * LegDetails1.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmSide
	 * Order3.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmSide
	 * Order16.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmSide
	 * Order14.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails1#mmSide
	 * TransactionDetails1.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails3#mmSide
	 * TransactionDetails3.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmBuySellIndicator
	 * SettlementObligation3.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg2#mmBuySellIndicator
	 * TradeLeg2.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmBuySellIndicator
	 * TradeLeg5.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg1#mmBuySellIndicator
	 * TradeLeg1.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#mmBuySellIndicator
	 * TradeLeg3.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmBuySellIndicator
	 * TradeLeg6.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg4#mmBuySellIndicator
	 * TradeLeg4.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#mmBuySellIndicator
	 * TradeLeg7.mmBuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus1#mmSide
	 * OrderStatus1.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus3#mmSide
	 * OrderStatus3.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmSide
	 * Order1.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DisclosedBid1#mmSide
	 * DisclosedBid1.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmSide
	 * IndicationOfInterest1.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmSide
	 * BidResponsePrice1.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmSide
	 * BidResponsePrice2.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderSide1#mmSide
	 * OrderSide1.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmSide
	 * OrderIdentification3.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSide
	 * Order6.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#mmSide
	 * Order11.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmSide
	 * ListStrikePriceDetails1.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmSide
	 * Order17.mmSide}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmSide
	 * Order18.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmBuySellIndicator
	 * TradeLeg8.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmBuySellIndicator
	 * TradeLeg10.mmBuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmBuySellIndicator
	 * TradeLeg9.mmBuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSide
	 * InstrumentLeg6.mmLegSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coded list to specify the side of the order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSide = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LegDetails1.mmSide, Order3.mmSide, Order16.mmSide, Order14.mmSide, TransactionDetails1.mmSide, TransactionDetails3.mmSide, SettlementObligation3.mmBuySellIndicator,
					TradeLeg2.mmBuySellIndicator, TradeLeg5.mmBuySellIndicator, TradeLeg1.mmBuySellIndicator, TradeLeg3.mmBuySellIndicator, TradeLeg6.mmBuySellIndicator, TradeLeg4.mmBuySellIndicator, TradeLeg7.mmBuySellIndicator,
					OrderStatus1.mmSide, OrderStatus3.mmSide, Order1.mmSide, DisclosedBid1.mmSide, IndicationOfInterest1.mmSide, BidResponsePrice1.mmSide, BidResponsePrice2.mmSide, OrderSide1.mmSide, OrderIdentification3.mmSide,
					Order6.mmSide, Order11.mmSide, ListStrikePriceDetails1.mmSide, Order17.mmSide, Order18.mmSide, TradeLeg8.mmBuySellIndicator, TradeLeg10.mmBuySellIndicator, TradeLeg9.mmBuySellIndicator, InstrumentLeg6.mmLegSide);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SideCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getSide", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator solicitedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmSolicitedOrderIndicator
	 * Order3.mmSolicitedOrderIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmSolicitedOrder
	 * Order9.mmSolicitedOrder}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSolicitedOrder
	 * Order6.mmSolicitedOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 377, ISO15022Synonym: 22F::TRCN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order has been generated in response to an advertisement or an indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSolicitedOrder = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmSolicitedOrderIndicator, Order9.mmSolicitedOrder, Order6.mmSolicitedOrder);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "377"), new ISO15022Synonym(this, "22F::TRCN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitedOrder";
			definition = "Indicates that an order has been generated in response to an advertisement or an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getSolicitedOrder", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CustomerOrderCapacityCode customerCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode
	 * CustomerOrderCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmTradingCapacity
	 * Order3.mmTradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmCustomerCapacity
	 * Order3.mmCustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCustomerCapacity
	 * Order9.mmCustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmTradingCapacity
	 * Order1.mmTradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmCustomerCapacity
	 * Order1.mmCustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#mmTradingCapacity
	 * Order2.mmTradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#mmCustomerCapacity
	 * Order2.mmCustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradingCapacity
	 * Order6.mmTradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCustomerCapacity
	 * Order6.mmCustomerCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCustomerCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmTradingCapacity, Order3.mmCustomerCapacity, Order9.mmCustomerCapacity, Order1.mmTradingCapacity, Order1.mmCustomerCapacity, Order2.mmTradingCapacity, Order2.mmCustomerCapacity,
					Order6.mmTradingCapacity, Order6.mmCustomerCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustomerOrderCapacityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getCustomerCapacity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PositionEffectCode positionEffect;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
	 * PositionEffectCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmPositionEffect
	 * Order3.mmPositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPositionEffect
	 * Order16.mmPositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPositionEffect
	 * Order14.mmPositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmPositionEffect
	 * Order9.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegPositionEffect
	 * InstrumentLeg3.mmLegPositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmPositionEffect
	 * Order6.mmPositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPositionEffect
	 * Order17.mmPositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPositionEffect
	 * Order18.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmProcessingOrder
	 * InvestmentAccount49.mmProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmProcessingOrder
	 * InvestmentAccount51.mmProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmProcessingOrder
	 * InvestmentAccount50.mmProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmProcessingOrder
	 * InvestmentAccount61.mmProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmProcessingOrder
	 * InvestmentAccount63.mmProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmProcessingOrder
	 * InvestmentAccount62.mmProcessingOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 77</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPositionEffect = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmPositionEffect, Order16.mmPositionEffect, Order14.mmPositionEffect, Order9.mmPositionEffect, InstrumentLeg3.mmLegPositionEffect, Order6.mmPositionEffect, Order17.mmPositionEffect,
					Order18.mmPositionEffect, InvestmentAccount49.mmProcessingOrder, InvestmentAccount51.mmProcessingOrder, InvestmentAccount50.mmProcessingOrder, InvestmentAccount61.mmProcessingOrder,
					InvestmentAccount63.mmProcessingOrder, InvestmentAccount62.mmProcessingOrder);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "77"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PositionEffectCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getPositionEffect", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator foreignExchangeExecutionRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmForeignExchangeExecutionRequestedIndicator
	 * Order3.mmForeignExchangeExecutionRequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmForeignExchangeExecutionRequested
	 * Order9.mmForeignExchangeExecutionRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#mmForeignExchangeExecutionRequestedIndicator
	 * Bid1.mmForeignExchangeExecutionRequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmForeignExchangeExecutionRequestedIndicator
	 * Order6.mmForeignExchangeExecutionRequestedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 121</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeExecutionRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmForeignExchangeExecutionRequested = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmForeignExchangeExecutionRequestedIndicator, Order9.mmForeignExchangeExecutionRequested, Bid1.mmForeignExchangeExecutionRequestedIndicator,
					Order6.mmForeignExchangeExecutionRequestedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "121"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeExecutionRequested";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getForeignExchangeExecutionRequested", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmSettlementCurrency
	 * Order3.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1#mmCurrency
	 * SecuritiesSettlement1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmSettlementCurrency
	 * Order9.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmSettlementCurrency
	 * Order6.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmSettlementCurrency
	 * FundCashOutBreakdown3.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmSettlementCurrency
	 * FundCashInBreakdown3.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSettlementCurrency
	 * InstrumentLeg6.mmLegSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency to be used for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmSettlementCurrency, SecuritiesSettlement1.mmCurrency, Order9.mmSettlementCurrency, Order6.mmSettlementCurrency, FundCashOutBreakdown3.mmSettlementCurrency,
					FundCashInBreakdown3.mmSettlementCurrency, InstrumentLeg6.mmLegSettlementCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getSettlementCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EligibilityCode orderOriginatorEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmOrderOriginatorEligibility
	 * Order3.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmOrderOriginatorEligibility
	 * Order16.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmOrderOriginatorEligibility
	 * Order14.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#mmOrderOriginatorEligibility
	 * InvestmentAccount21.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmOrderOriginatorEligibility
	 * Order9.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmOrderOriginatorEligibility
	 * Order6.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmOrderOriginatorEligibility
	 * Order17.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmOrderOriginatorEligibility
	 * Order18.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmOrderOriginatorEligibility
	 * InvestmentAccount58.mmOrderOriginatorEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderOriginatorEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmOrderOriginatorEligibility, Order16.mmOrderOriginatorEligibility, Order14.mmOrderOriginatorEligibility, InvestmentAccount21.mmOrderOriginatorEligibility,
					Order9.mmOrderOriginatorEligibility, Order6.mmOrderOriginatorEligibility, Order17.mmOrderOriginatorEligibility, Order18.mmOrderOriginatorEligibility, InvestmentAccount58.mmOrderOriginatorEligibility);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderOriginatorEligibility", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity orderedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrder
	 * SecuritiesQuantity.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity1#mmQuantity
	 * OrderQuantity1.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmQuantityDetails
	 * Order3.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmConfirmationQuantity
	 * PartialFill1.mmConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmOriginalOrderedQuantity
	 * PartialFill1.mmOriginalOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmPreviouslyExecutedQuantity
	 * PartialFill1.mmPreviouslyExecutedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmConfirmationQuantity
	 * Order16.mmConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmConfirmationQuantity
	 * Order14.mmConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1#mmOrderQuantityDetails
	 * OrderStatus1.mmOrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmSideOrderQuantityDetails
	 * Order9.mmSideOrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmNewQuantity
	 * TriggeringInstructions.mmNewQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegOrderQuantity
	 * InstrumentLeg2.mmLegOrderQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmQuantityDetails
	 * Order1.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegOrderQuantity
	 * InstrumentLeg3.mmLegOrderQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#mmLegIOIQuantity
	 * InstrumentLeg1.mmLegIOIQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmOrderQuantity
	 * IndicationOfInterest1.mmOrderQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#mmTotalNumberSecurities
	 * Bid1.mmTotalNumberSecurities}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#mmQuantityDetails
	 * Order2.mmQuantityDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmQuantity2Details
	 * Order6.mmQuantity2Details}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmQuantity1Details
	 * Order6.mmQuantity1Details}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#mmQuantityDetails
	 * Order11.mmQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmConfirmationQuantity
	 * Order17.mmConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmConfirmationQuantity
	 * Order18.mmConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmConfirmationQuantity
	 * PartialFill2.mmConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmOriginalOrderedQuantity
	 * PartialFill2.mmOriginalOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmPreviouslyExecutedQuantity
	 * PartialFill2.mmPreviouslyExecutedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmAmountOrUnitsOrPercentage
	 * RedemptionOrder14.mmAmountOrUnitsOrPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmAmountOrUnits
	 * SubscriptionOrder15.mmAmountOrUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmAmountOrUnitsOrPercentage
	 * RedemptionOrder15.mmAmountOrUnitsOrPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmAmountOrUnits
	 * SubscriptionOrder14.mmAmountOrUnits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ORDR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument to be ordered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderedQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OrderQuantity1.mmQuantity, Order3.mmQuantityDetails, PartialFill1.mmConfirmationQuantity, PartialFill1.mmOriginalOrderedQuantity, PartialFill1.mmPreviouslyExecutedQuantity,
					Order16.mmConfirmationQuantity, Order14.mmConfirmationQuantity, OrderStatus1.mmOrderQuantityDetails, Order9.mmSideOrderQuantityDetails, TriggeringInstructions.mmNewQuantity, InstrumentLeg2.mmLegOrderQuantity,
					Order1.mmQuantityDetails, InstrumentLeg3.mmLegOrderQuantity, InstrumentLeg1.mmLegIOIQuantity, IndicationOfInterest1.mmOrderQuantity, Bid1.mmTotalNumberSecurities, Order2.mmQuantityDetails, Order6.mmQuantity2Details,
					Order6.mmQuantity1Details, Order11.mmQuantityDetails, Order17.mmConfirmationQuantity, Order18.mmConfirmationQuantity, PartialFill2.mmConfirmationQuantity, PartialFill2.mmOriginalOrderedQuantity,
					PartialFill2.mmPreviouslyExecutedQuantity, RedemptionOrder14.mmAmountOrUnitsOrPercentage, SubscriptionOrder15.mmAmountOrUnits, RedemptionOrder15.mmAmountOrUnitsOrPercentage, SubscriptionOrder14.mmAmountOrUnits);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ORDR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity of financial instrument to be ordered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected BusinessProcessTypeCode businessProcessType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
	 * BusinessProcessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BusinessProcessType1Choice#mmCode
	 * BusinessProcessType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BusinessProcessType1Choice#mmProprietary
	 * BusinessProcessType1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessProcessType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of business process model used to carry out the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBusinessProcessType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BusinessProcessType1Choice.mmCode, BusinessProcessType1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessProcessType";
			definition = "Type of business process model used to carry out the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessProcessTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getBusinessProcessType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradingMarket placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedOrder
	 * TradingMarket.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmPlaceOfExecution
	 * Order3.mmPlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPlaceOfTrade
	 * Order16.mmPlaceOfTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPlaceOfTrade
	 * Order14.mmPlaceOfTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmPlaceOfExecution
	 * Order9.mmPlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmPlaceOfExecution
	 * Order1.mmPlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#mmPlaceOfExecution
	 * Order2.mmPlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmPlaceOfExecution
	 * Order6.mmPlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#mmPlaceOfExecution
	 * Order11.mmPlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPlaceOfTrade
	 * Order17.mmPlaceOfTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPlaceOfTrade
	 * Order18.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market at which the order is to be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmPlaceOfExecution, Order16.mmPlaceOfTrade, Order14.mmPlaceOfTrade, Order9.mmPlaceOfExecution, Order1.mmPlaceOfExecution, Order2.mmPlaceOfExecution, Order6.mmPlaceOfExecution,
					Order11.mmPlaceOfExecution, Order17.mmPlaceOfTrade, Order18.mmPlaceOfTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::TRAD"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market at which the order is to be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected CurrencyAndAmount orderedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmGrossTradeAmount
	 * Order16.mmGrossTradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmGrossTradeAmount
	 * Order14.mmGrossTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmAmount
	 * InvestmentFundsOrderBreakdown1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice#mmOrderedAmount
	 * FinancialInstrumentQuantity11Choice.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1#mmOrderedAmount
	 * SidePocketQuantityAndAmount1.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmOrderedAmount
	 * RedemptionExecution10.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice#mmOrderedAmount
	 * FinancialInstrumentQuantity10Choice.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice#mmOrderedAmount
	 * SidePocketUnitsOrAmountOrRate1Choice.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmOrderedAmount
	 * SubscriptionExecution7.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity9Choice#mmOrderedAmount
	 * FinancialInstrumentQuantity9Choice.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmOrderedAmount
	 * FinancialInstrumentQuantity3.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#mmOrderedAmount
	 * FinancialInstrumentQuantity7Choice.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#mmOrderedAmount
	 * FinancialInstrumentQuantity8Choice.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#mmOrderedAmount
	 * FinancialInstrumentQuantity12Choice.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#mmOrderedAmount
	 * FinancialInstrumentQuantity13Choice.mmOrderedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmGrossTradeAmount
	 * Order17.mmGrossTradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmGrossTradeAmount
	 * Order18.mmGrossTradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmGrossAmount
	 * TradeLeg8.mmGrossAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmGrossAmount
	 * TradeLeg10.mmGrossAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmGrossAmount
	 * TradeLeg9.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#mmAmount
	 * InvestmentFundsOrderBreakdown2.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ORDR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order16.mmGrossTradeAmount, Order14.mmGrossTradeAmount, InvestmentFundsOrderBreakdown1.mmAmount, FinancialInstrumentQuantity11Choice.mmOrderedAmount,
					SidePocketQuantityAndAmount1.mmOrderedAmount, RedemptionExecution10.mmOrderedAmount, FinancialInstrumentQuantity10Choice.mmOrderedAmount, SidePocketUnitsOrAmountOrRate1Choice.mmOrderedAmount,
					SubscriptionExecution7.mmOrderedAmount, FinancialInstrumentQuantity9Choice.mmOrderedAmount, FinancialInstrumentQuantity3.mmOrderedAmount, FinancialInstrumentQuantity7Choice.mmOrderedAmount,
					FinancialInstrumentQuantity8Choice.mmOrderedAmount, FinancialInstrumentQuantity12Choice.mmOrderedAmount, FinancialInstrumentQuantity13Choice.mmOrderedAmount, Order17.mmGrossTradeAmount, Order18.mmGrossTradeAmount,
					TradeLeg8.mmGrossAmount, TradeLeg10.mmGrossAmount, TradeLeg9.mmGrossAmount, InvestmentFundsOrderBreakdown2.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ORDR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderedAmount";
			definition = "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max3Number giveUpNumberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmGiveUpNumberOfDays
	 * Order16.mmGiveUpNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmGiveUpNumberOfDays
	 * Order14.mmGiveUpNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmGiveUpNumberOfDays
	 * Order17.mmGiveUpNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmGiveUpNumberOfDays
	 * Order18.mmGiveUpNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiveUpNumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGiveUpNumberOfDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order16.mmGiveUpNumberOfDays, Order14.mmGiveUpNumberOfDays, Order17.mmGiveUpNumberOfDays, Order18.mmGiveUpNumberOfDays);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GiveUpNumberOfDays";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getGiveUpNumberOfDays", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeRegulatoryConditionsCode tradeRegulatoryConditionsType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditionsCode
	 * TradeRegulatoryConditionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmTradeRegulatoryConditionsType
	 * Order16.mmTradeRegulatoryConditionsType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmTradeRegulatoryConditionsType
	 * Order14.mmTradeRegulatoryConditionsType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeRegulatoryConditionsType
	 * Order17.mmTradeRegulatoryConditionsType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeRegulatoryConditionsType
	 * Order18.mmTradeRegulatoryConditionsType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryConditionsType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the regulatory conditions type of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeRegulatoryConditionsType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order16.mmTradeRegulatoryConditionsType, Order14.mmTradeRegulatoryConditionsType, Order17.mmTradeRegulatoryConditionsType, Order18.mmTradeRegulatoryConditionsType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeRegulatoryConditionsType";
			definition = "Specifies the regulatory conditions type of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getTradeRegulatoryConditionsType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity dayOrderQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPreviousDayOrder
	 * SecuritiesQuantity.mmPreviousDayOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 424</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayOrderQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For good till orders, the order quantity less all quantity (adjusted for stock splits) that traded on previous days."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDayOrderQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "424"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DayOrderQuantity";
			definition = "For good till orders, the order quantity less all quantity (adjusted for stock splits) that traded on previous days.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmPreviousDayOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderPartyRole> securitiesOrderPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#mmSecuritiesOrder
	 * SecuritiesOrderPartyRole.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole
	 * SecuritiesOrderPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmOtherBusinessParties
	 * Order3.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmOtherBusinessParties
	 * Order9.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmOtherBusinessParties
	 * Order6.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#mmOtherBusinessParties
	 * Order11.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party which plays a role in the process of ordering securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrderPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmOtherBusinessParties, Order9.mmOtherBusinessParties, Order6.mmOtherBusinessParties, Order11.mmOtherBusinessParties);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderPartyRole";
			definition = "Specifies the party which plays a role in the process of ordering securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderStatus> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSecuritiesOrder
	 * SecuritiesOrderStatus.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmConfirmation
	 * IndividualOrderConfirmationStatusAndReason2.mmConfirmation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the status of an order at a specific point in time."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmConfirmation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Indicates the status of an order at a specific point in time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmSecuritiesOrder
	 * Negotiation.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiation which resulted in an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation which resulted in an order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Adjustment> adjustments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmSecuritiesOrder
	 * Adjustment.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charges and commissions associated with a securities order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustments = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Charges and commissions associated with a securities order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected SecuritiesRegulatoryDetails legalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmRelatedOrder
	 * SecuritiesRegulatoryDetails.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails
	 * SecuritiesRegulatoryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal parameters required in a securities order for regulatory purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLegalParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalParameters";
			definition = "Legal parameters required in a securities order for regulatory purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmObject();
		}
	};
	protected SecuritiesPricing orderPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOrder
	 * SecuritiesPricing.mmOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity1#mmPrice
	 * OrderQuantity1.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill1#mmDealPrice
	 * PartialFill1.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmAveragePrice
	 * OrderStatus3.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity3#mmPrice
	 * OrderQuantity3.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmPreviousClosingPrice
	 * Order6.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmStrikePrice
	 * ListStrikePriceDetails1.mmStrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2#mmDealPrice
	 * PartialFill2.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::DEAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OrderQuantity1.mmPrice, PartialFill1.mmDealPrice, OrderStatus3.mmAveragePrice, OrderQuantity3.mmPrice, Order6.mmPreviousClosingPrice, ListStrikePriceDetails1.mmStrikePrice,
					PartialFill2.mmDealPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::DEAL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderPrice";
			definition = "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing stopPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmStopPriceOrder
	 * SecuritiesPricing.mmStopPriceOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmStopPrice
	 * OrderParameters1.mmStopPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 99</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the stop price in case of a stop order or a stop limit order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStopPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OrderParameters1.mmStopPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "99"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StopPrice";
			definition = "Indicates the stop price in case of a stop order or a stop limit order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmStopPriceOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Allocation> securitiesOrderAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesOrder
	 * Allocation.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmPreAllocationDetails
	 * Order3.mmPreAllocationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmPreAllocationDetails
	 * Order9.mmPreAllocationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegPreAllocationDetails
	 * InstrumentLeg3.mmLegPreAllocationDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTotalNumberTickets
	 * Bid1.mmTotalNumberTickets}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmPreAllocationDetails
	 * Order6.mmPreAllocationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the pre-allocation of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrderAllocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmPreAllocationDetails, Order9.mmPreAllocationDetails, InstrumentLeg3.mmLegPreAllocationDetails, Bid1.mmTotalNumberTickets, Order6.mmPreAllocationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderAllocation";
			definition = "Information about the pre-allocation of an order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected SecuritiesOrderParameters orderExecutionParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmRelatedSecuritiesOrder
	 * SecuritiesOrderParameters.mmRelatedSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#mmOrderType
	 * QuoteEntry1.mmOrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmOrderParameters
	 * Order6.mmOrderParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderExecutionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions under which a securities order must be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderExecutionParameters = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuoteEntry1.mmOrderType, Order6.mmOrderParameters);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderExecutionParameters";
			definition = "Conditions under which a securities order must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmRelatedSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
		}
	};
	protected SecuritiesTrade orderExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
	 * SecuritiesTrade.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmAmountsDetails
	 * Order3.mmAmountsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmAmountsDetails
	 * Order9.mmAmountsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmAmountDetails
	 * Order6.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#mmAmountsDetails
	 * Order11.mmAmountsDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of a securities order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmAmountsDetails, Order9.mmAmountsDetails, Order6.mmAmountDetails, Order11.mmAmountsDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderExecution";
			definition = "Result of a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> orderingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedOrder
	 * SecuritiesAccount.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#mmBiddingAccount
	 * DisclosedBid1.mmBiddingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by a security transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderingAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(DisclosedBid1.mmBiddingAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderingAccount";
			definition = "Account impacted by a security transaction.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected SecuritiesQuoteVariable quote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmSecuritiesOrder
	 * SecuritiesQuoteVariable.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote for which the order conditions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote for which the order conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected TransactionType1Code fundTransactionDirectionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType1Code
	 * TransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::BUSE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundTransactionDirectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of investment funds transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFundTransactionDirectionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::BUSE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundTransactionDirectionIndicator";
			definition = "Indicates the type of investment funds transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionType1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getFundTransactionDirectionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmOrderBookingDate
	 * Order16.mmOrderBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmOrderBookingDate
	 * Order14.mmOrderBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmOrderBookingDate
	 * Order17.mmOrderBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmOrderBookingDate
	 * Order18.mmOrderBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmOrderDate
	 * Unit8.mmOrderDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ORDR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the order was placed by the investor with the \ntrading party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order16.mmOrderBookingDate, Order14.mmOrderBookingDate, Order17.mmOrderBookingDate, Order18.mmOrderBookingDate, Unit8.mmOrderDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ORDR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderDate";
			definition = "Date/time on which the order was placed by the investor with the \ntrading party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getOrderDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount pegDifference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 211</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PegDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price difference for a pegged order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPegDifference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "211"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PegDifference";
			definition = "Price difference for a pegged order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getPegDifference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradingSession securitiesOrderTradingSession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmSecuritiesOrder
	 * TradingSession.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of a specific trading session associated with a securities order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrderTradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderTradingSession";
			definition = "Details of a specific trading session associated with a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	protected OrderBook relatedOrderBook;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrderBook#mmOrder
	 * OrderBook.mmOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.OrderBook OrderBook}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderBook"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order book whichgenerates an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrderBook = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderBook";
			definition = "Order book whichgenerates an order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrderBook.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrderBook.mmObject();
		}
	};
	protected ListTrading listTrading;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSecuritiesListOrder
	 * ListTrading.mmSecuritiesListOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ListTrading
	 * ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List trading information containing a serie of orders."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading information containing a serie of orders.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.mmSecuritiesListOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
		}
	};
	protected CrossTrade buySideRelatedCrossTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmBuySideOrder
	 * CrossTrade.mmBuySideOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CrossTrade
	 * CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideRelatedCrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross trade for which the buy side information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBuySideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySideRelatedCrossTrade";
			definition = "Cross trade for which the buy side information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmBuySideOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
		}
	};
	protected CrossTrade sellSideRelatedCrossTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#mmSellSideOrder
	 * CrossTrade.mmSellSideOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CrossTrade
	 * CrossTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideRelatedCrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross trade for which the sell side information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSellSideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellSideRelatedCrossTrade";
			definition = "Cross trade for which the sell side information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmSellSideOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CrossTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> orderedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesOrder
	 * Security.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmFinancialInstrumentAttributes
	 * Order3.mmFinancialInstrumentAttributes}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmStipulations
	 * Order3.mmStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmUnderlyingFinancialInstrumentAttributes
	 * Order3.mmUnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmUnderlyingStipulations
	 * Order3.mmUnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmUnderlyingFinancialInstrument
	 * OrderStatusAndReason5.mmUnderlyingFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmFinancialInstrumentAttributes
	 * IndicationOfInterest1.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmStipulations
	 * IndicationOfInterest1.mmStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmUnderlyingFinancialInstrumentDetails
	 * IndicationOfInterest1.mmUnderlyingFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmUnderlyingFinancialInstrumentAttributes
	 * IndicationOfInterest1.mmUnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmUnderlyingStipulations
	 * IndicationOfInterest1.mmUnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmFinancialInstrumentAttributes
	 * Order6.mmFinancialInstrumentAttributes}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmStipulations
	 * Order6.mmStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmUnderlyingFinancialInstrumentAttributes
	 * Order6.mmUnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmUnderlyingStipulations
	 * Order6.mmUnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#mmFinancialInstrumentAttributes
	 * Order11.mmFinancialInstrumentAttributes}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#mmStipulations
	 * Order11.mmStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#mmUnderlyingFinancialInstrumentAttributes
	 * Order11.mmUnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#mmUnderlyingStipulations
	 * Order11.mmUnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmStipulations
	 * ListStrikePriceDetails1.mmStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmUnderlyingStipulations
	 * ListStrikePriceDetails1.mmUnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmFinancialInstrumentAttributes
	 * ListStrikePriceDetails1.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmUnderlyingFinancialInstrumentAttributes
	 * ListStrikePriceDetails1.mmUnderlyingFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which an order is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderedSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmFinancialInstrumentAttributes, Order3.mmStipulations, Order3.mmUnderlyingFinancialInstrumentAttributes, Order3.mmUnderlyingStipulations,
					OrderStatusAndReason5.mmUnderlyingFinancialInstrument, IndicationOfInterest1.mmFinancialInstrumentAttributes, IndicationOfInterest1.mmStipulations, IndicationOfInterest1.mmUnderlyingFinancialInstrumentDetails,
					IndicationOfInterest1.mmUnderlyingFinancialInstrumentAttributes, IndicationOfInterest1.mmUnderlyingStipulations, Order6.mmFinancialInstrumentAttributes, Order6.mmStipulations,
					Order6.mmUnderlyingFinancialInstrumentAttributes, Order6.mmUnderlyingStipulations, Order11.mmFinancialInstrumentAttributes, Order11.mmStipulations, Order11.mmUnderlyingFinancialInstrumentAttributes,
					Order11.mmUnderlyingStipulations, ListStrikePriceDetails1.mmStipulations, ListStrikePriceDetails1.mmUnderlyingStipulations, ListStrikePriceDetails1.mmFinancialInstrumentAttributes,
					ListStrikePriceDetails1.mmUnderlyingFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderedSecurity";
			definition = "Security for which an order is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected SecuritiesPostTradeBooking bookingInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmRelatedOrder
	 * SecuritiesPostTradeBooking.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
	 * SecuritiesPostTradeBooking}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmBookingDetails
	 * Order3.mmBookingDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmBookingDetails
	 * Order9.mmBookingDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmBookingDetails
	 * Order6.mmBookingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the booking of executions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBookingInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmBookingDetails, Order9.mmBookingDetails, Order6.mmBookingDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookingInstructions";
			definition = "Information about the booking of executions.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmObject();
		}
	};
	protected ExchangeForPhysicalTrade exchangeForPhysicalTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmSecuritiesOrder
	 * ExchangeForPhysicalTrade.mmSecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade
	 * ExchangeForPhysicalTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#mmExchangeForPhysicalIndicator
	 * Bid1.mmExchangeForPhysicalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmExchangeForPhysicalTrade
	 * NonDisclosedBid1.mmExchangeForPhysicalTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions under which an exchange for physical trade takes place in the case of a non disclosed bid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExchangeForPhysicalTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Bid1.mmExchangeForPhysicalIndicator, NonDisclosedBid1.mmExchangeForPhysicalTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeForPhysicalTrade";
			definition = "Conditions under which an exchange for physical trade takes place in the case of a non disclosed bid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmSecuritiesOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
		}
	};
	protected OrderQuantityTypeCode quantityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderQuantityTypeCode
	 * OrderQuantityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderQuantity1#mmQuantityType
	 * OrderQuantity1.mmQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalOrderQuantityType1#mmStructured
	 * OriginalOrderQuantityType1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmOriginalOrderQuantityDetails
	 * FundCashInBreakdown1.mmOriginalOrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#mmOriginalOrderQuantityDetails
	 * FundCashOutBreakdown1.mmOriginalOrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmOriginalOrderQuantityType
	 * FundCashInBreakdown2.mmOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmExtendedOriginalOrderQuantityType
	 * FundCashInBreakdown2.mmExtendedOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmOriginalOrderQuantityType
	 * FundCashOutBreakdown2.mmOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmExtendedOriginalOrderQuantityType
	 * FundCashOutBreakdown2.mmExtendedOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmOriginalOrderQuantityType
	 * FundCashOutBreakdown3.mmOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmOriginalOrderQuantityType
	 * FundCashInBreakdown3.mmOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.QuantityType1Choice#mmCode
	 * QuantityType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.QuantityType1Choice#mmProprietary
	 * QuantityType1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes how the quantity is specified, that is by quantity of units or by amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuantityType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrderQuantity1.mmQuantityType, OriginalOrderQuantityType1.mmStructured, FundCashInBreakdown1.mmOriginalOrderQuantityDetails, FundCashOutBreakdown1.mmOriginalOrderQuantityDetails,
					FundCashInBreakdown2.mmOriginalOrderQuantityType, FundCashInBreakdown2.mmExtendedOriginalOrderQuantityType, FundCashOutBreakdown2.mmOriginalOrderQuantityType, FundCashOutBreakdown2.mmExtendedOriginalOrderQuantityType,
					FundCashOutBreakdown3.mmOriginalOrderQuantityType, FundCashInBreakdown3.mmOriginalOrderQuantityType, QuantityType1Choice.mmCode, QuantityType1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityType";
			definition = "Describes how the quantity is specified, that is by quantity of units or by amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderQuantityTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getQuantityType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text clientOrderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference2#mmClientReference
	 * TransferReference2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference1#mmClientReference
	 * TransferReference1.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmClientOrderIdentification
	 * Order3.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmClientOrderIdentification
	 * Order16.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmSecondaryClientOrderIdentification
	 * Order16.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmClientOrderIdentification
	 * Order14.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmSecondaryClientOrderIdentification
	 * Order14.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#mmClientReference
	 * IndividualOrderStatusAndReason4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmClientReference
	 * IndividualOrderConfirmationStatusAndReason1.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmClientReference
	 * IndividualOrderStatusAndReason2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#mmClientReference
	 * MessageAndBusinessReference6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmClientReference
	 * TransferStatusAndReason2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmClientReference
	 * IndividualOrderStatusAndReason3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmClientOrderIdentification
	 * Order9.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmSecondaryClientOrderIdentification
	 * Order9.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmClientOrderIdentification
	 * OrderStatus3.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmSecondaryClientOrderIdentification
	 * OrderStatus3.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmClientOrderIdentification
	 * OrderIdentification3.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmSecondaryClientOrderIdentification
	 * OrderIdentification3.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmClientOrderIdentification
	 * Order6.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#mmClientOrderIdentification
	 * Order11.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#mmSecondaryClientOrderIdentification
	 * Order11.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#mmClientReference
	 * MessageAndBusinessReference7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmClientReference
	 * TransferStatusAndReason3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference5#mmClientReference
	 * TransferReference5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference6#mmClientReference
	 * TransferReference6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmClientOrderIdentification
	 * Order17.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmSecondaryClientOrderIdentification
	 * Order17.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmClientOrderIdentification
	 * Order18.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmSecondaryClientOrderIdentification
	 * Order18.mmSecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmClientReference
	 * MessageAndBusinessReference8.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmClientReference
	 * TransferStatusAndReason4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#mmClientReference
	 * TransferReference9.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmClientReference
	 * TransferReference10.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmClientReference
	 * IndividualOrderConfirmationStatusAndReason2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmClientReference
	 * IndividualOrderStatusAndReason7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmClientReference
	 * IndividualOrderStatusAndReason8.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference11#mmClientReference
	 * TransferReference11.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmClientReference
	 * TransferStatusAndReason5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference13#mmClientReference
	 * TransferReference13.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference12#mmClientReference
	 * TransferReference12.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11#mmClientReference
	 * MessageAndBusinessReference11.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClientOrderIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransferReference2.mmClientReference, TransferReference1.mmClientReference, Order3.mmClientOrderIdentification, Order16.mmClientOrderIdentification,
					Order16.mmSecondaryClientOrderIdentification, Order14.mmClientOrderIdentification, Order14.mmSecondaryClientOrderIdentification, IndividualOrderStatusAndReason4.mmClientReference,
					IndividualOrderConfirmationStatusAndReason1.mmClientReference, IndividualOrderStatusAndReason2.mmClientReference, MessageAndBusinessReference6.mmClientReference, TransferStatusAndReason2.mmClientReference,
					IndividualOrderStatusAndReason3.mmClientReference, Order9.mmClientOrderIdentification, Order9.mmSecondaryClientOrderIdentification, OrderStatus3.mmClientOrderIdentification,
					OrderStatus3.mmSecondaryClientOrderIdentification, OrderIdentification3.mmClientOrderIdentification, OrderIdentification3.mmSecondaryClientOrderIdentification, Order6.mmClientOrderIdentification,
					Order11.mmClientOrderIdentification, Order11.mmSecondaryClientOrderIdentification, MessageAndBusinessReference7.mmClientReference, TransferStatusAndReason3.mmClientReference, TransferReference5.mmClientReference,
					TransferReference6.mmClientReference, Order17.mmClientOrderIdentification, Order17.mmSecondaryClientOrderIdentification, Order18.mmClientOrderIdentification, Order18.mmSecondaryClientOrderIdentification,
					MessageAndBusinessReference8.mmClientReference, TransferStatusAndReason4.mmClientReference, TransferReference9.mmClientReference, TransferReference10.mmClientReference,
					IndividualOrderConfirmationStatusAndReason2.mmClientReference, IndividualOrderStatusAndReason7.mmClientReference, IndividualOrderStatusAndReason8.mmClientReference, TransferReference11.mmClientReference,
					TransferStatusAndReason5.mmClientReference, TransferReference13.mmClientReference, TransferReference12.mmClientReference, MessageAndBusinessReference11.mmClientReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getClientOrderIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrderExecutionInstruction executionInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmRelatedOrder
	 * SecuritiesOrderExecutionInstruction.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmExecutionInstructionsDetails
	 * Order3.mmExecutionInstructionsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmExecutionInstructionsDetails
	 * Order6.mmExecutionInstructionsDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution instructions in which securities order parameters are defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExecutionInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmExecutionInstructionsDetails, Order6.mmExecutionInstructionsDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionInstructions";
			definition = "Execution instructions in which securities order parameters are defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
		}
	};
	protected OrderTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode
	 * OrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmOrderType
	 * TriggeringInstructions.mmOrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmOrderType
	 * QuoteEntry2.mmOrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmType
	 * Order1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#mmType
	 * Order2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderParameters1#mmType
	 * OrderParameters1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TOOR, FIXSynonym: 80</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of instruction to a broker or dealer to buy or sell a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TriggeringInstructions.mmOrderType, QuoteEntry2.mmOrderType, Order1.mmType, Order2.mmType, OrderParameters1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TOOR"), new FIXSynonym(this, "80"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the type of instruction to a broker or dealer to buy or sell a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesOrder.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrder";
				definition = "Intention to transfer an ownership of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesPricing.mmOrder,
						com.tools20022.repository.entity.SecuritiesPricing.mmStopPriceOrder, com.tools20022.repository.entity.TradingMarket.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedOrder,
						com.tools20022.repository.entity.Adjustment.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmPreviousDayOrder,
						com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder, com.tools20022.repository.entity.ListTrading.mmSecuritiesListOrder, com.tools20022.repository.entity.TradingSession.mmSecuritiesOrder,
						com.tools20022.repository.entity.Allocation.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmSecuritiesOrder,
						com.tools20022.repository.entity.Negotiation.mmSecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderStatus.mmSecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmRelatedSecuritiesOrder, com.tools20022.repository.entity.SecuritiesRegulatoryDetails.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.mmSecuritiesOrder, com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmSecuritiesOrder, com.tools20022.repository.entity.OrderBook.mmOrder,
						com.tools20022.repository.entity.CrossTrade.mmBuySideOrder, com.tools20022.repository.entity.CrossTrade.mmSellSideOrder);
				derivationElement_lazy = () -> Arrays.asList(Order16.mmBusinessProcessType, Order16.mmPartialFillDetails, Order14.mmBusinessProcessType, Order14.mmPartialFillDetails, SingleQuote1.mmOrderDetails,
						SingleOrder1.mmOrderDetails, MultiLegOrder1.mmOrderDetails, SingleOrMultiLegOrderChoice.mmSingleOrderDetails, SingleOrMultiLegOrderChoice.mmMultilegOrderDetails, Order17.mmBusinessProcessType,
						Order17.mmPartialFillDetails, Order18.mmBusinessProcessType, Order18.mmPartialFillDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrder.mmObject(), com.tools20022.repository.entity.CrossTrade.mmObject());
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.mmOrderEffectiveDate, com.tools20022.repository.entity.SecuritiesOrder.mmOrderExpiryDate,
						com.tools20022.repository.entity.SecuritiesOrder.mmIdentification, com.tools20022.repository.entity.SecuritiesOrder.mmCashMargin, com.tools20022.repository.entity.SecuritiesOrder.mmSide,
						com.tools20022.repository.entity.SecuritiesOrder.mmSolicitedOrder, com.tools20022.repository.entity.SecuritiesOrder.mmCustomerCapacity, com.tools20022.repository.entity.SecuritiesOrder.mmPositionEffect,
						com.tools20022.repository.entity.SecuritiesOrder.mmForeignExchangeExecutionRequested, com.tools20022.repository.entity.SecuritiesOrder.mmSettlementCurrency,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderOriginatorEligibility, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity,
						com.tools20022.repository.entity.SecuritiesOrder.mmBusinessProcessType, com.tools20022.repository.entity.SecuritiesOrder.mmPlaceOfTrade, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedAmount,
						com.tools20022.repository.entity.SecuritiesOrder.mmGiveUpNumberOfDays, com.tools20022.repository.entity.SecuritiesOrder.mmTradeRegulatoryConditionsType,
						com.tools20022.repository.entity.SecuritiesOrder.mmDayOrderQuantity, com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderPartyRole, com.tools20022.repository.entity.SecuritiesOrder.mmStatus,
						com.tools20022.repository.entity.SecuritiesOrder.mmRelatedNegotiation, com.tools20022.repository.entity.SecuritiesOrder.mmAdjustments, com.tools20022.repository.entity.SecuritiesOrder.mmLegalParameters,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderPrice, com.tools20022.repository.entity.SecuritiesOrder.mmStopPrice, com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderAllocation,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecutionParameters, com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution, com.tools20022.repository.entity.SecuritiesOrder.mmOrderingAccount,
						com.tools20022.repository.entity.SecuritiesOrder.mmQuote, com.tools20022.repository.entity.SecuritiesOrder.mmFundTransactionDirectionIndicator, com.tools20022.repository.entity.SecuritiesOrder.mmOrderDate,
						com.tools20022.repository.entity.SecuritiesOrder.mmPegDifference, com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderTradingSession,
						com.tools20022.repository.entity.SecuritiesOrder.mmRelatedOrderBook, com.tools20022.repository.entity.SecuritiesOrder.mmListTrading, com.tools20022.repository.entity.SecuritiesOrder.mmBuySideRelatedCrossTrade,
						com.tools20022.repository.entity.SecuritiesOrder.mmSellSideRelatedCrossTrade, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedSecurity,
						com.tools20022.repository.entity.SecuritiesOrder.mmBookingInstructions, com.tools20022.repository.entity.SecuritiesOrder.mmExchangeForPhysicalTrade, com.tools20022.repository.entity.SecuritiesOrder.mmQuantityType,
						com.tools20022.repository.entity.SecuritiesOrder.mmClientOrderIdentification, com.tools20022.repository.entity.SecuritiesOrder.mmExecutionInstructions, com.tools20022.repository.entity.SecuritiesOrder.mmType);
				derivationComponent_lazy = () -> Arrays.asList(OrderQuantity1.mmObject(), Order3.mmObject(), BusinessProcessType1Choice.mmObject(), PartialFill1.mmObject(), Order16.mmObject(), Order14.mmObject(), Order9.mmObject(),
						Order1.mmObject(), SingleOrder1.mmObject(), MultiLegOrder1.mmObject(), Bid1.mmObject(), Bid2.mmObject(), Bid3.mmObject(), OrderQuantity3.mmObject(), Order2.mmObject(), OrderSide1.mmObject(),
						OrderIdentification3.mmObject(), Order6.mmObject(), Order11.mmObject(), Order17.mmObject(), Order18.mmObject(), PartialFill2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getOrderEffectiveDate() {
		return orderEffectiveDate;
	}

	public SecuritiesOrder setOrderEffectiveDate(ISODateTime orderEffectiveDate) {
		this.orderEffectiveDate = Objects.requireNonNull(orderEffectiveDate);
		return this;
	}

	public ISODateTime getOrderExpiryDate() {
		return orderExpiryDate;
	}

	public SecuritiesOrder setOrderExpiryDate(ISODateTime orderExpiryDate) {
		this.orderExpiryDate = Objects.requireNonNull(orderExpiryDate);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public SecuritiesOrder setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CashMarginOrderCode getCashMargin() {
		return cashMargin;
	}

	public SecuritiesOrder setCashMargin(CashMarginOrderCode cashMargin) {
		this.cashMargin = Objects.requireNonNull(cashMargin);
		return this;
	}

	public SideCode getSide() {
		return side;
	}

	public SecuritiesOrder setSide(SideCode side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public YesNoIndicator getSolicitedOrder() {
		return solicitedOrder;
	}

	public SecuritiesOrder setSolicitedOrder(YesNoIndicator solicitedOrder) {
		this.solicitedOrder = Objects.requireNonNull(solicitedOrder);
		return this;
	}

	public CustomerOrderCapacityCode getCustomerCapacity() {
		return customerCapacity;
	}

	public SecuritiesOrder setCustomerCapacity(CustomerOrderCapacityCode customerCapacity) {
		this.customerCapacity = Objects.requireNonNull(customerCapacity);
		return this;
	}

	public PositionEffectCode getPositionEffect() {
		return positionEffect;
	}

	public SecuritiesOrder setPositionEffect(PositionEffectCode positionEffect) {
		this.positionEffect = Objects.requireNonNull(positionEffect);
		return this;
	}

	public YesNoIndicator getForeignExchangeExecutionRequested() {
		return foreignExchangeExecutionRequested;
	}

	public SecuritiesOrder setForeignExchangeExecutionRequested(YesNoIndicator foreignExchangeExecutionRequested) {
		this.foreignExchangeExecutionRequested = Objects.requireNonNull(foreignExchangeExecutionRequested);
		return this;
	}

	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public SecuritiesOrder setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public EligibilityCode getOrderOriginatorEligibility() {
		return orderOriginatorEligibility;
	}

	public SecuritiesOrder setOrderOriginatorEligibility(EligibilityCode orderOriginatorEligibility) {
		this.orderOriginatorEligibility = Objects.requireNonNull(orderOriginatorEligibility);
		return this;
	}

	public SecuritiesQuantity getOrderedQuantity() {
		return orderedQuantity;
	}

	public SecuritiesOrder setOrderedQuantity(com.tools20022.repository.entity.SecuritiesQuantity orderedQuantity) {
		this.orderedQuantity = Objects.requireNonNull(orderedQuantity);
		return this;
	}

	public BusinessProcessTypeCode getBusinessProcessType() {
		return businessProcessType;
	}

	public SecuritiesOrder setBusinessProcessType(BusinessProcessTypeCode businessProcessType) {
		this.businessProcessType = Objects.requireNonNull(businessProcessType);
		return this;
	}

	public TradingMarket getPlaceOfTrade() {
		return placeOfTrade;
	}

	public SecuritiesOrder setPlaceOfTrade(com.tools20022.repository.entity.TradingMarket placeOfTrade) {
		this.placeOfTrade = Objects.requireNonNull(placeOfTrade);
		return this;
	}

	public CurrencyAndAmount getOrderedAmount() {
		return orderedAmount;
	}

	public SecuritiesOrder setOrderedAmount(CurrencyAndAmount orderedAmount) {
		this.orderedAmount = Objects.requireNonNull(orderedAmount);
		return this;
	}

	public Max3Number getGiveUpNumberOfDays() {
		return giveUpNumberOfDays;
	}

	public SecuritiesOrder setGiveUpNumberOfDays(Max3Number giveUpNumberOfDays) {
		this.giveUpNumberOfDays = Objects.requireNonNull(giveUpNumberOfDays);
		return this;
	}

	public Optional<TradeRegulatoryConditionsCode> getTradeRegulatoryConditionsType() {
		return tradeRegulatoryConditionsType == null ? Optional.empty() : Optional.of(tradeRegulatoryConditionsType);
	}

	public SecuritiesOrder setTradeRegulatoryConditionsType(TradeRegulatoryConditionsCode tradeRegulatoryConditionsType) {
		this.tradeRegulatoryConditionsType = tradeRegulatoryConditionsType;
		return this;
	}

	public SecuritiesQuantity getDayOrderQuantity() {
		return dayOrderQuantity;
	}

	public SecuritiesOrder setDayOrderQuantity(com.tools20022.repository.entity.SecuritiesQuantity dayOrderQuantity) {
		this.dayOrderQuantity = Objects.requireNonNull(dayOrderQuantity);
		return this;
	}

	public List<SecuritiesOrderPartyRole> getSecuritiesOrderPartyRole() {
		return securitiesOrderPartyRole == null ? securitiesOrderPartyRole = new ArrayList<>() : securitiesOrderPartyRole;
	}

	public SecuritiesOrder setSecuritiesOrderPartyRole(List<com.tools20022.repository.entity.SecuritiesOrderPartyRole> securitiesOrderPartyRole) {
		this.securitiesOrderPartyRole = Objects.requireNonNull(securitiesOrderPartyRole);
		return this;
	}

	public List<SecuritiesOrderStatus> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public SecuritiesOrder setStatus(List<com.tools20022.repository.entity.SecuritiesOrderStatus> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Negotiation getRelatedNegotiation() {
		return relatedNegotiation;
	}

	public SecuritiesOrder setRelatedNegotiation(com.tools20022.repository.entity.Negotiation relatedNegotiation) {
		this.relatedNegotiation = Objects.requireNonNull(relatedNegotiation);
		return this;
	}

	public List<Adjustment> getAdjustments() {
		return adjustments == null ? adjustments = new ArrayList<>() : adjustments;
	}

	public SecuritiesOrder setAdjustments(List<com.tools20022.repository.entity.Adjustment> adjustments) {
		this.adjustments = Objects.requireNonNull(adjustments);
		return this;
	}

	public SecuritiesRegulatoryDetails getLegalParameters() {
		return legalParameters;
	}

	public SecuritiesOrder setLegalParameters(com.tools20022.repository.entity.SecuritiesRegulatoryDetails legalParameters) {
		this.legalParameters = Objects.requireNonNull(legalParameters);
		return this;
	}

	public SecuritiesPricing getOrderPrice() {
		return orderPrice;
	}

	public SecuritiesOrder setOrderPrice(com.tools20022.repository.entity.SecuritiesPricing orderPrice) {
		this.orderPrice = Objects.requireNonNull(orderPrice);
		return this;
	}

	public SecuritiesPricing getStopPrice() {
		return stopPrice;
	}

	public SecuritiesOrder setStopPrice(com.tools20022.repository.entity.SecuritiesPricing stopPrice) {
		this.stopPrice = Objects.requireNonNull(stopPrice);
		return this;
	}

	public List<Allocation> getSecuritiesOrderAllocation() {
		return securitiesOrderAllocation == null ? securitiesOrderAllocation = new ArrayList<>() : securitiesOrderAllocation;
	}

	public SecuritiesOrder setSecuritiesOrderAllocation(List<com.tools20022.repository.entity.Allocation> securitiesOrderAllocation) {
		this.securitiesOrderAllocation = Objects.requireNonNull(securitiesOrderAllocation);
		return this;
	}

	public SecuritiesOrderParameters getOrderExecutionParameters() {
		return orderExecutionParameters;
	}

	public SecuritiesOrder setOrderExecutionParameters(com.tools20022.repository.entity.SecuritiesOrderParameters orderExecutionParameters) {
		this.orderExecutionParameters = Objects.requireNonNull(orderExecutionParameters);
		return this;
	}

	public SecuritiesTrade getOrderExecution() {
		return orderExecution;
	}

	public SecuritiesOrder setOrderExecution(com.tools20022.repository.entity.SecuritiesTrade orderExecution) {
		this.orderExecution = Objects.requireNonNull(orderExecution);
		return this;
	}

	public List<SecuritiesAccount> getOrderingAccount() {
		return orderingAccount == null ? orderingAccount = new ArrayList<>() : orderingAccount;
	}

	public SecuritiesOrder setOrderingAccount(List<com.tools20022.repository.entity.SecuritiesAccount> orderingAccount) {
		this.orderingAccount = Objects.requireNonNull(orderingAccount);
		return this;
	}

	public Optional<SecuritiesQuoteVariable> getQuote() {
		return quote == null ? Optional.empty() : Optional.of(quote);
	}

	public SecuritiesOrder setQuote(com.tools20022.repository.entity.SecuritiesQuoteVariable quote) {
		this.quote = quote;
		return this;
	}

	public TransactionType1Code getFundTransactionDirectionIndicator() {
		return fundTransactionDirectionIndicator;
	}

	public SecuritiesOrder setFundTransactionDirectionIndicator(TransactionType1Code fundTransactionDirectionIndicator) {
		this.fundTransactionDirectionIndicator = Objects.requireNonNull(fundTransactionDirectionIndicator);
		return this;
	}

	public ISODateTime getOrderDate() {
		return orderDate;
	}

	public SecuritiesOrder setOrderDate(ISODateTime orderDate) {
		this.orderDate = Objects.requireNonNull(orderDate);
		return this;
	}

	public CurrencyAndAmount getPegDifference() {
		return pegDifference;
	}

	public SecuritiesOrder setPegDifference(CurrencyAndAmount pegDifference) {
		this.pegDifference = Objects.requireNonNull(pegDifference);
		return this;
	}

	public TradingSession getSecuritiesOrderTradingSession() {
		return securitiesOrderTradingSession;
	}

	public SecuritiesOrder setSecuritiesOrderTradingSession(com.tools20022.repository.entity.TradingSession securitiesOrderTradingSession) {
		this.securitiesOrderTradingSession = Objects.requireNonNull(securitiesOrderTradingSession);
		return this;
	}

	public Optional<OrderBook> getRelatedOrderBook() {
		return relatedOrderBook == null ? Optional.empty() : Optional.of(relatedOrderBook);
	}

	public SecuritiesOrder setRelatedOrderBook(com.tools20022.repository.entity.OrderBook relatedOrderBook) {
		this.relatedOrderBook = relatedOrderBook;
		return this;
	}

	public Optional<ListTrading> getListTrading() {
		return listTrading == null ? Optional.empty() : Optional.of(listTrading);
	}

	public SecuritiesOrder setListTrading(com.tools20022.repository.entity.ListTrading listTrading) {
		this.listTrading = listTrading;
		return this;
	}

	public CrossTrade getBuySideRelatedCrossTrade() {
		return buySideRelatedCrossTrade;
	}

	public SecuritiesOrder setBuySideRelatedCrossTrade(com.tools20022.repository.entity.CrossTrade buySideRelatedCrossTrade) {
		this.buySideRelatedCrossTrade = Objects.requireNonNull(buySideRelatedCrossTrade);
		return this;
	}

	public CrossTrade getSellSideRelatedCrossTrade() {
		return sellSideRelatedCrossTrade;
	}

	public SecuritiesOrder setSellSideRelatedCrossTrade(com.tools20022.repository.entity.CrossTrade sellSideRelatedCrossTrade) {
		this.sellSideRelatedCrossTrade = Objects.requireNonNull(sellSideRelatedCrossTrade);
		return this;
	}

	public List<Security> getOrderedSecurity() {
		return orderedSecurity == null ? orderedSecurity = new ArrayList<>() : orderedSecurity;
	}

	public SecuritiesOrder setOrderedSecurity(List<com.tools20022.repository.entity.Security> orderedSecurity) {
		this.orderedSecurity = Objects.requireNonNull(orderedSecurity);
		return this;
	}

	public SecuritiesPostTradeBooking getBookingInstructions() {
		return bookingInstructions;
	}

	public SecuritiesOrder setBookingInstructions(com.tools20022.repository.entity.SecuritiesPostTradeBooking bookingInstructions) {
		this.bookingInstructions = Objects.requireNonNull(bookingInstructions);
		return this;
	}

	public ExchangeForPhysicalTrade getExchangeForPhysicalTrade() {
		return exchangeForPhysicalTrade;
	}

	public SecuritiesOrder setExchangeForPhysicalTrade(com.tools20022.repository.entity.ExchangeForPhysicalTrade exchangeForPhysicalTrade) {
		this.exchangeForPhysicalTrade = Objects.requireNonNull(exchangeForPhysicalTrade);
		return this;
	}

	public OrderQuantityTypeCode getQuantityType() {
		return quantityType;
	}

	public SecuritiesOrder setQuantityType(OrderQuantityTypeCode quantityType) {
		this.quantityType = Objects.requireNonNull(quantityType);
		return this;
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public SecuritiesOrder setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = Objects.requireNonNull(clientOrderIdentification);
		return this;
	}

	public SecuritiesOrderExecutionInstruction getExecutionInstructions() {
		return executionInstructions;
	}

	public SecuritiesOrder setExecutionInstructions(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction executionInstructions) {
		this.executionInstructions = Objects.requireNonNull(executionInstructions);
		return this;
	}

	public OrderTypeCode getType() {
		return type;
	}

	public SecuritiesOrder setType(OrderTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}
}