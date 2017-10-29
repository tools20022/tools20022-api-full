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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.BusinessProcessType1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderEffectiveDate
 * SecuritiesOrder.OrderEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExpiryDate
 * SecuritiesOrder.OrderExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#Identification
 * SecuritiesOrder.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#CashMargin
 * SecuritiesOrder.CashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Side
 * SecuritiesOrder.Side}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SolicitedOrder
 * SecuritiesOrder.SolicitedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#CustomerCapacity
 * SecuritiesOrder.CustomerCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PositionEffect
 * SecuritiesOrder.PositionEffect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ForeignExchangeExecutionRequested
 * SecuritiesOrder.ForeignExchangeExecutionRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SettlementCurrency
 * SecuritiesOrder.SettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderOriginatorEligibility
 * SecuritiesOrder.OrderOriginatorEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedQuantity
 * SecuritiesOrder.OrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#BusinessProcessType
 * SecuritiesOrder.BusinessProcessType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PlaceOfTrade
 * SecuritiesOrder.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedAmount
 * SecuritiesOrder.OrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#GiveUpNumberOfDays
 * SecuritiesOrder.GiveUpNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#TradeRegulatoryConditionsType
 * SecuritiesOrder.TradeRegulatoryConditionsType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#DayOrderQuantity
 * SecuritiesOrder.DayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderPartyRole
 * SecuritiesOrder.SecuritiesOrderPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Status
 * SecuritiesOrder.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#RelatedNegotiation
 * SecuritiesOrder.RelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Adjustments
 * SecuritiesOrder.Adjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#LegalParameters
 * SecuritiesOrder.LegalParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderPrice
 * SecuritiesOrder.OrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#StopPrice
 * SecuritiesOrder.StopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderAllocation
 * SecuritiesOrder.SecuritiesOrderAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecutionParameters
 * SecuritiesOrder.OrderExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecution
 * SecuritiesOrder.OrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderingAccount
 * SecuritiesOrder.OrderingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Quote
 * SecuritiesOrder.Quote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#FundTransactionDirectionIndicator
 * SecuritiesOrder.FundTransactionDirectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderDate
 * SecuritiesOrder.OrderDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PegDifference
 * SecuritiesOrder.PegDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SecuritiesOrderTradingSession
 * SecuritiesOrder.SecuritiesOrderTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#RelatedOrderBook
 * SecuritiesOrder.RelatedOrderBook}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#ListTrading
 * SecuritiesOrder.ListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#BuySideRelatedCrossTrade
 * SecuritiesOrder.BuySideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SellSideRelatedCrossTrade
 * SecuritiesOrder.SellSideRelatedCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedSecurity
 * SecuritiesOrder.OrderedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#BookingInstructions
 * SecuritiesOrder.BookingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ExchangeForPhysicalTrade
 * SecuritiesOrder.ExchangeForPhysicalTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#QuantityType
 * SecuritiesOrder.QuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ClientOrderIdentification
 * SecuritiesOrder.ClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ExecutionInstructions
 * SecuritiesOrder.ExecutionInstructions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#Type
 * SecuritiesOrder.Type}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesOrder
 * Security.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Order
 * SecuritiesPricing.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#StopPriceOrder
 * SecuritiesPricing.StopPriceOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#RelatedOrder
 * TradingMarket.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedOrder
 * SecuritiesAccount.RelatedOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#SecuritiesOrder
 * Adjustment.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrder
 * SecuritiesQuantity.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#PreviousDayOrder
 * SecuritiesQuantity.PreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#RelatedOrder
 * SecuritiesTrade.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#SecuritiesListOrder
 * ListTrading.SecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#SecuritiesOrder
 * TradingSession.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#SecuritiesOrder
 * Allocation.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#RelatedOrder
 * SecuritiesOrderExecutionInstruction.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#RelatedOrder
 * SecuritiesPostTradeBooking.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#SecuritiesOrder
 * SecuritiesOrderPartyRole.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#SecuritiesOrder
 * Negotiation.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#SecuritiesOrder
 * SecuritiesOrderStatus.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#RelatedSecuritiesOrder
 * SecuritiesOrderParameters.RelatedSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#RelatedOrder
 * SecuritiesRegulatoryDetails.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#SecuritiesOrder
 * SecuritiesQuoteVariable.SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#SecuritiesOrder
 * ExchangeForPhysicalTrade.SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrderBook#Order
 * OrderBook.Order}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#BuySideOrder
 * CrossTrade.BuySideOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CrossTrade#SellSideOrder
 * CrossTrade.SellSideOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#BusinessProcessType
 * Order16.BusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#PartialFillDetails
 * Order16.PartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#BusinessProcessType
 * Order14.BusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#PartialFillDetails
 * Order14.PartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleQuote1#OrderDetails
 * SingleQuote1.OrderDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleOrder1#OrderDetails
 * SingleOrder1.OrderDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultiLegOrder1#OrderDetails
 * MultiLegOrder1.OrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice#SingleOrderDetails
 * SingleOrMultiLegOrderChoice.SingleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice#MultilegOrderDetails
 * SingleOrMultiLegOrderChoice.MultilegOrderDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order17#BusinessProcessType
 * Order17.BusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order17#PartialFillDetails
 * Order17.PartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order18#BusinessProcessType
 * Order18.BusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order18#PartialFillDetails
 * Order18.PartialFillDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
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
	/**
	 * Date/time on which the order is effective.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#EffectiveDateAndTime
	 * OrderParameters1.EffectiveDateAndTime}</li>
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
	 * name} = "OrderEffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderEffectiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderParameters1.EffectiveDateAndTime);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderEffectiveDate";
			definition = "Date/time on which the order is effective.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time on which the order is to expire.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#ExpiryDateTime
	 * Order1.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#ExpiryDateAndTime
	 * OrderParameters1.ExpiryDateAndTime}</li>
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
	 * name} = "OrderExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is to expire."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order1.ExpiryDateTime, com.tools20022.repository.msg.OrderParameters1.ExpiryDateAndTime);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExpiryDate";
			definition = "Date/time on which the order is to expire.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique identifier for an order, as assigned by the sell-side. The
	 * identifier must be unique within a single trading day.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4#OrderReference
	 * InvestmentFundOrder4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#ClientOrderLinkIdentification
	 * IdentificationReference8Choice.ClientOrderLinkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#ClientOrderLinkIdentification
	 * IdentificationReference11Choice.ClientOrderLinkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#SecondaryClientOrderIdentification
	 * Order3.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#OrderIdentification
	 * Order16.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#OrderIdentification
	 * Order14.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#OrderReference
	 * IndividualOrderStatusAndReason4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#OrderReference
	 * IndividualOrderConfirmationStatusAndReason1.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#OrderReference
	 * IndividualOrderStatusAndReason1.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#OrderReference
	 * IndividualOrderStatusAndReason2.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#RedemptionLegIdentification
	 * SwitchLegReferences1.RedemptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#SubscriptionLegIdentification
	 * SwitchLegReferences1.SubscriptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#OrderReference
	 * SwitchOrderStatusAndReason1.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#OrderReference
	 * RedemptionOrder3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder5#OrderReference
	 * InvestmentFundOrder5.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder1#OrderReferences
	 * InvestmentFundOrder1.OrderReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#OrderReference
	 * RedemptionOrder5.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#OrderReference
	 * RedemptionExecution3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#OrderReference
	 * RedemptionExecution5.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2#OrderReference
	 * InvestmentFundOrderExecution2.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#OrderReferences
	 * InvestmentFundOrderExecution1.OrderReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#OrderReference
	 * RedemptionOrder7.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#OrderReference
	 * RedemptionOrder4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#OrderReference
	 * RedemptionOrder6.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#OrderReference
	 * RedemptionExecution4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#OrderReference
	 * RedemptionExecution6.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#OrderReference
	 * RedemptionOrder8.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#OrderReference
	 * InvestmentFundOrder3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5#OrderReference
	 * MessageAndBusinessReference5.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#IndividualOrderReference
	 * MessageAndBusinessReference2.IndividualOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#OrderReference
	 * InvestmentFundOrder2.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4#OrderReference
	 * MessageAndBusinessReference4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#OrderReference
	 * InvestmentFundTransaction2.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#OrderReference
	 * InvestmentFundTransaction3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#OrderReference
	 * SubscriptionOrder3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#OrderReference
	 * SubscriptionOrder5.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#OrderReference
	 * SubscriptionExecution3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#OrderReference
	 * SubscriptionExecution5.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#OrderReference
	 * SubscriptionOrder7.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#OrderReference
	 * SubscriptionOrder4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#OrderReference
	 * SubscriptionOrder6.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#OrderReference
	 * SubscriptionExecution4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#OrderReference
	 * SubscriptionExecution6.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#OrderReference
	 * SubscriptionOrder8.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#OrderReference
	 * SwitchOrder2.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#OrderReference
	 * SwitchOrder3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#OrderReference
	 * SwitchExecution3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#OrderReference
	 * SwitchExecution4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#OrderReference
	 * SwitchOrder4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#OrderReference
	 * IndividualOrderStatusAndReason3.OrderReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LotDetails1#OrderReference
	 * LotDetails1.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#OrderReference
	 * RedemptionExecution10.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#OrderReference
	 * RedemptionOrder9.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#OrderReference
	 * SubscriptionExecution7.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#OrderReference
	 * SubscriptionOrder9.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#OrderReference
	 * InvestmentFundOrderExecution3.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#OrderReference
	 * InvestmentFundOrder6.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#OrderReference
	 * IndividualOrderStatusAndReason5.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#OrderReference
	 * RedemptionOrder11.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#OrderReference
	 * RedemptionExecution12.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#OrderReference
	 * SubscriptionOrder11.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#OrderReference
	 * SubscriptionExecution9.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#OrderIdentification
	 * OrderIdentification3.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#SecondaryClientOrderIdentification
	 * Order6.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#ClientOrderIdentification
	 * ListStrikePriceDetails1.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#SecondaryClientOrderIdentification
	 * ListStrikePriceDetails1.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#OrderIdentification
	 * Order17.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#OrderIdentification
	 * Order18.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#OrderReference
	 * InvestmentFundTransaction4.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#OrderIdentification
	 * TradeLeg8.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#OrderIdentification
	 * TradeLeg10.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#OrderIdentification
	 * TradeLeg9.OrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#OrderReference
	 * IndividualOrderConfirmationStatusAndReason2.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#OrderReference
	 * InvestmentFundOrder11.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#OrderReference
	 * SwitchExecution7.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#OrderReference
	 * MessageAndBusinessReference10.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#OrderReference
	 * InvestmentFundOrder9.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#OrderReference
	 * SwitchOrder7.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#OrderReference
	 * RedemptionOrder14.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#OrderReference
	 * IndividualOrderStatusAndReason7.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#OrderReference
	 * SwitchOrderStatusAndReason2.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#OrderReference
	 * IndividualOrderStatusAndReason8.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#OrderReference
	 * SubscriptionExecution13.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#OrderReference
	 * SubscriptionExecution12.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#OrderReference
	 * SubscriptionOrder15.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#OrderReference
	 * RedemptionOrder15.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#OrderReference
	 * RedemptionExecution16.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#OrderReference
	 * SubscriptionOrder14.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#OrderReference
	 * InvestmentFundOrder8.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice#RedemptionLegIdentification
	 * LegIdentification1Choice.RedemptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice#SubscriptionLegIdentification
	 * LegIdentification1Choice.SubscriptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#OrderReference
	 * RedemptionExecution15.OrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#LegIdentification
	 * SwitchLegReferences2.LegIdentification}</li>
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
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundOrder4.OrderReference, com.tools20022.repository.choice.IdentificationReference8Choice.ClientOrderLinkIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.ClientOrderLinkIdentification, com.tools20022.repository.msg.Order3.SecondaryClientOrderIdentification,
					com.tools20022.repository.msg.Order16.OrderIdentification, com.tools20022.repository.msg.Order14.OrderIdentification, com.tools20022.repository.msg.IndividualOrderStatusAndReason4.OrderReference,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.OrderReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason1.OrderReference,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason2.OrderReference, com.tools20022.repository.msg.SwitchLegReferences1.RedemptionLegIdentification,
					com.tools20022.repository.msg.SwitchLegReferences1.SubscriptionLegIdentification, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.OrderReference, com.tools20022.repository.msg.RedemptionOrder3.OrderReference,
					com.tools20022.repository.msg.InvestmentFundOrder5.OrderReference, com.tools20022.repository.msg.InvestmentFundOrder1.OrderReferences, com.tools20022.repository.msg.RedemptionOrder5.OrderReference,
					com.tools20022.repository.msg.RedemptionExecution3.OrderReference, com.tools20022.repository.msg.RedemptionExecution5.OrderReference, com.tools20022.repository.msg.InvestmentFundOrderExecution2.OrderReference,
					com.tools20022.repository.msg.InvestmentFundOrderExecution1.OrderReferences, com.tools20022.repository.msg.RedemptionOrder7.OrderReference, com.tools20022.repository.msg.RedemptionOrder4.OrderReference,
					com.tools20022.repository.msg.RedemptionOrder6.OrderReference, com.tools20022.repository.msg.RedemptionExecution4.OrderReference, com.tools20022.repository.msg.RedemptionExecution6.OrderReference,
					com.tools20022.repository.msg.RedemptionOrder8.OrderReference, com.tools20022.repository.msg.InvestmentFundOrder3.OrderReference, com.tools20022.repository.msg.MessageAndBusinessReference5.OrderReference,
					com.tools20022.repository.msg.MessageAndBusinessReference2.IndividualOrderReference, com.tools20022.repository.msg.InvestmentFundOrder2.OrderReference,
					com.tools20022.repository.msg.MessageAndBusinessReference4.OrderReference, com.tools20022.repository.msg.InvestmentFundTransaction2.OrderReference,
					com.tools20022.repository.msg.InvestmentFundTransaction3.OrderReference, com.tools20022.repository.msg.SubscriptionOrder3.OrderReference, com.tools20022.repository.msg.SubscriptionOrder5.OrderReference,
					com.tools20022.repository.msg.SubscriptionExecution3.OrderReference, com.tools20022.repository.msg.SubscriptionExecution5.OrderReference, com.tools20022.repository.msg.SubscriptionOrder7.OrderReference,
					com.tools20022.repository.msg.SubscriptionOrder4.OrderReference, com.tools20022.repository.msg.SubscriptionOrder6.OrderReference, com.tools20022.repository.msg.SubscriptionExecution4.OrderReference,
					com.tools20022.repository.msg.SubscriptionExecution6.OrderReference, com.tools20022.repository.msg.SubscriptionOrder8.OrderReference, com.tools20022.repository.msg.SwitchOrder2.OrderReference,
					com.tools20022.repository.msg.SwitchOrder3.OrderReference, com.tools20022.repository.msg.SwitchExecution3.OrderReference, com.tools20022.repository.msg.SwitchExecution4.OrderReference,
					com.tools20022.repository.msg.SwitchOrder4.OrderReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.OrderReference, com.tools20022.repository.msg.LotDetails1.OrderReference,
					com.tools20022.repository.msg.RedemptionExecution10.OrderReference, com.tools20022.repository.msg.RedemptionOrder9.OrderReference, com.tools20022.repository.msg.SubscriptionExecution7.OrderReference,
					com.tools20022.repository.msg.SubscriptionOrder9.OrderReference, com.tools20022.repository.msg.InvestmentFundOrderExecution3.OrderReference, com.tools20022.repository.msg.InvestmentFundOrder6.OrderReference,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason5.OrderReference, com.tools20022.repository.msg.RedemptionOrder11.OrderReference, com.tools20022.repository.msg.RedemptionExecution12.OrderReference,
					com.tools20022.repository.msg.SubscriptionOrder11.OrderReference, com.tools20022.repository.msg.SubscriptionExecution9.OrderReference, com.tools20022.repository.msg.OrderIdentification3.OrderIdentification,
					com.tools20022.repository.msg.Order6.SecondaryClientOrderIdentification, com.tools20022.repository.msg.ListStrikePriceDetails1.ClientOrderIdentification,
					com.tools20022.repository.msg.ListStrikePriceDetails1.SecondaryClientOrderIdentification, com.tools20022.repository.msg.Order17.OrderIdentification, com.tools20022.repository.msg.Order18.OrderIdentification,
					com.tools20022.repository.msg.InvestmentFundTransaction4.OrderReference, com.tools20022.repository.msg.TradeLeg8.OrderIdentification, com.tools20022.repository.msg.TradeLeg10.OrderIdentification,
					com.tools20022.repository.msg.TradeLeg9.OrderIdentification, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.OrderReference, com.tools20022.repository.msg.InvestmentFundOrder11.OrderReference,
					com.tools20022.repository.msg.SwitchExecution7.OrderReference, com.tools20022.repository.msg.MessageAndBusinessReference10.OrderReference, com.tools20022.repository.msg.InvestmentFundOrder9.OrderReference,
					com.tools20022.repository.msg.SwitchOrder7.OrderReference, com.tools20022.repository.msg.RedemptionOrder14.OrderReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.OrderReference,
					com.tools20022.repository.msg.SwitchOrderStatusAndReason2.OrderReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason8.OrderReference,
					com.tools20022.repository.msg.SubscriptionExecution13.OrderReference, com.tools20022.repository.msg.SubscriptionExecution12.OrderReference, com.tools20022.repository.msg.SubscriptionOrder15.OrderReference,
					com.tools20022.repository.msg.RedemptionOrder15.OrderReference, com.tools20022.repository.msg.RedemptionExecution16.OrderReference, com.tools20022.repository.msg.SubscriptionOrder14.OrderReference,
					com.tools20022.repository.msg.InvestmentFundOrder8.OrderReference, com.tools20022.repository.choice.LegIdentification1Choice.RedemptionLegIdentification,
					com.tools20022.repository.choice.LegIdentification1Choice.SubscriptionLegIdentification, com.tools20022.repository.msg.RedemptionExecution15.OrderReference,
					com.tools20022.repository.msg.SwitchLegReferences2.LegIdentification);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies whether an order is a margin order or a non-margin order. This
	 * is primarily used when sending orders to Japanese exchanges to indicate
	 * sell margin or buy to cover. The same tag could be assigned also by
	 * buy-side to indicate the intent to sell or buy margin and the sell-side
	 * to accept or reject (base on some validation criteria) the margin
	 * request.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#CashMargin
	 * Order3.CashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#CashMargin
	 * Order16.CashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#CashMargin
	 * Order14.CashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#CashMargin
	 * Order9.CashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#CashMargin
	 * Order6.CashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#CashMargin
	 * Order17.CashMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#CashMargin
	 * Order18.CashMargin}</li>
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
	 * name} = "CashMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashMargin = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.CashMargin, com.tools20022.repository.msg.Order16.CashMargin, com.tools20022.repository.msg.Order14.CashMargin,
					com.tools20022.repository.msg.Order9.CashMargin, com.tools20022.repository.msg.Order6.CashMargin, com.tools20022.repository.msg.Order17.CashMargin, com.tools20022.repository.msg.Order18.CashMargin);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashMarginOrderCode.mmObject();
		}
	};
	/**
	 * Coded list to specify the side of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.SideCode
	 * SideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LegDetails1#Side
	 * LegDetails1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#Side Order3.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#Side Order16.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#Side Order14.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails1#Side
	 * TransactionDetails1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails3#Side
	 * TransactionDetails3.Side}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#BuySellIndicator
	 * SettlementObligation3.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#BuySellIndicator
	 * TradeLeg2.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#BuySellIndicator
	 * TradeLeg5.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#BuySellIndicator
	 * TradeLeg1.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#BuySellIndicator
	 * TradeLeg3.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#BuySellIndicator
	 * TradeLeg6.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#BuySellIndicator
	 * TradeLeg4.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#BuySellIndicator
	 * TradeLeg7.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus1#Side
	 * OrderStatus1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus3#Side
	 * OrderStatus3.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#Side Order1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DisclosedBid1#Side
	 * DisclosedBid1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndicationOfInterest1#Side
	 * IndicationOfInterest1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice1#Side
	 * BidResponsePrice1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice2#Side
	 * BidResponsePrice2.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderSide1#Side
	 * OrderSide1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderIdentification3#Side
	 * OrderIdentification3.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#Side Order6.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#Side Order11.Side}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#Side
	 * ListStrikePriceDetails1.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#Side Order17.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#Side Order18.Side}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#BuySellIndicator
	 * TradeLeg8.BuySellIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#BuySellIndicator
	 * TradeLeg10.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#BuySellIndicator
	 * TradeLeg9.BuySellIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#LegSide
	 * InstrumentLeg6.LegSide}</li>
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
	public static final MMBusinessAttribute Side = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LegDetails1.Side, com.tools20022.repository.msg.Order3.Side, com.tools20022.repository.msg.Order16.Side, com.tools20022.repository.msg.Order14.Side,
					com.tools20022.repository.msg.TransactionDetails1.Side, com.tools20022.repository.msg.TransactionDetails3.Side, com.tools20022.repository.msg.SettlementObligation3.BuySellIndicator,
					com.tools20022.repository.msg.TradeLeg2.BuySellIndicator, com.tools20022.repository.msg.TradeLeg5.BuySellIndicator, com.tools20022.repository.msg.TradeLeg1.BuySellIndicator,
					com.tools20022.repository.msg.TradeLeg3.BuySellIndicator, com.tools20022.repository.msg.TradeLeg6.BuySellIndicator, com.tools20022.repository.msg.TradeLeg4.BuySellIndicator,
					com.tools20022.repository.msg.TradeLeg7.BuySellIndicator, com.tools20022.repository.msg.OrderStatus1.Side, com.tools20022.repository.msg.OrderStatus3.Side, com.tools20022.repository.msg.Order1.Side,
					com.tools20022.repository.msg.DisclosedBid1.Side, com.tools20022.repository.msg.IndicationOfInterest1.Side, com.tools20022.repository.msg.BidResponsePrice1.Side, com.tools20022.repository.msg.BidResponsePrice2.Side,
					com.tools20022.repository.msg.OrderSide1.Side, com.tools20022.repository.msg.OrderIdentification3.Side, com.tools20022.repository.msg.Order6.Side, com.tools20022.repository.msg.Order11.Side,
					com.tools20022.repository.msg.ListStrikePriceDetails1.Side, com.tools20022.repository.msg.Order17.Side, com.tools20022.repository.msg.Order18.Side, com.tools20022.repository.msg.TradeLeg8.BuySellIndicator,
					com.tools20022.repository.msg.TradeLeg10.BuySellIndicator, com.tools20022.repository.msg.TradeLeg9.BuySellIndicator, com.tools20022.repository.msg.InstrumentLeg6.LegSide);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SideCode.mmObject();
		}
	};
	/**
	 * Indicates that an order has been generated in response to an
	 * advertisement or an indication of interest.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Order3#SolicitedOrderIndicator
	 * Order3.SolicitedOrderIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#SolicitedOrder
	 * Order9.SolicitedOrder}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#SolicitedOrder
	 * Order6.SolicitedOrder}</li>
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
	 * name} = "SolicitedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order has been generated in response to an advertisement or an indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SolicitedOrder = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.SolicitedOrderIndicator, com.tools20022.repository.msg.Order9.SolicitedOrder, com.tools20022.repository.msg.Order6.SolicitedOrder);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitedOrder";
			definition = "Indicates that an order has been generated in response to an advertisement or an indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Capacity of customer placing the order. Primarily used by futures
	 * exchanges to indicate the CTI code (customer type indicator) as required
	 * by the US CFTC (Commodity Futures Trading Commission).
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#TradingCapacity
	 * Order3.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#CustomerCapacity
	 * Order3.CustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#CustomerCapacity
	 * Order9.CustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#TradingCapacity
	 * Order1.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#CustomerCapacity
	 * Order1.CustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#TradingCapacity
	 * Order2.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#CustomerCapacity
	 * Order2.CustomerCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#TradingCapacity
	 * Order6.TradingCapacity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#CustomerCapacity
	 * Order6.CustomerCapacity}</li>
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
	public static final MMBusinessAttribute CustomerCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.TradingCapacity, com.tools20022.repository.msg.Order3.CustomerCapacity, com.tools20022.repository.msg.Order9.CustomerCapacity,
					com.tools20022.repository.msg.Order1.TradingCapacity, com.tools20022.repository.msg.Order1.CustomerCapacity, com.tools20022.repository.msg.Order2.TradingCapacity, com.tools20022.repository.msg.Order2.CustomerCapacity,
					com.tools20022.repository.msg.Order6.TradingCapacity, com.tools20022.repository.msg.Order6.CustomerCapacity);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CustomerOrderCapacityCode.mmObject();
		}
	};
	/**
	 * Indicates whether the resulting position after a trade should be an
	 * opening position or closing position. Used for omnibus accounting - where
	 * accounts are held on a gross basis instead of being netted together.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#PositionEffect
	 * Order3.PositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#PositionEffect
	 * Order16.PositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#PositionEffect
	 * Order14.PositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#PositionEffect
	 * Order9.PositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#LegPositionEffect
	 * InstrumentLeg3.LegPositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#PositionEffect
	 * Order6.PositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#PositionEffect
	 * Order17.PositionEffect}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#PositionEffect
	 * Order18.PositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#ProcessingOrder
	 * InvestmentAccount49.ProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#ProcessingOrder
	 * InvestmentAccount51.ProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#ProcessingOrder
	 * InvestmentAccount50.ProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#ProcessingOrder
	 * InvestmentAccount61.ProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#ProcessingOrder
	 * InvestmentAccount63.ProcessingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#ProcessingOrder
	 * InvestmentAccount62.ProcessingOrder}</li>
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
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PositionEffect = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.PositionEffect, com.tools20022.repository.msg.Order16.PositionEffect, com.tools20022.repository.msg.Order14.PositionEffect,
					com.tools20022.repository.msg.Order9.PositionEffect, com.tools20022.repository.msg.InstrumentLeg3.LegPositionEffect, com.tools20022.repository.msg.Order6.PositionEffect,
					com.tools20022.repository.msg.Order17.PositionEffect, com.tools20022.repository.msg.Order18.PositionEffect, com.tools20022.repository.msg.InvestmentAccount49.ProcessingOrder,
					com.tools20022.repository.msg.InvestmentAccount51.ProcessingOrder, com.tools20022.repository.msg.InvestmentAccount50.ProcessingOrder, com.tools20022.repository.msg.InvestmentAccount61.ProcessingOrder,
					com.tools20022.repository.msg.InvestmentAccount63.ProcessingOrder, com.tools20022.repository.msg.InvestmentAccount62.ProcessingOrder);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PositionEffectCode.mmObject();
		}
	};
	/**
	 * Indicates a request for a foreign exchange accommodation trade to be
	 * executed along with security transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Order3#ForeignExchangeExecutionRequestedIndicator
	 * Order3.ForeignExchangeExecutionRequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#ForeignExchangeExecutionRequested
	 * Order9.ForeignExchangeExecutionRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#ForeignExchangeExecutionRequestedIndicator
	 * Bid1.ForeignExchangeExecutionRequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#ForeignExchangeExecutionRequestedIndicator
	 * Order6.ForeignExchangeExecutionRequestedIndicator}</li>
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
	 * name} = "ForeignExchangeExecutionRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ForeignExchangeExecutionRequested = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.ForeignExchangeExecutionRequestedIndicator, com.tools20022.repository.msg.Order9.ForeignExchangeExecutionRequested,
					com.tools20022.repository.msg.Bid1.ForeignExchangeExecutionRequestedIndicator, com.tools20022.repository.msg.Order6.ForeignExchangeExecutionRequestedIndicator);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeExecutionRequested";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency to be used for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#SettlementCurrency
	 * Order3.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1#Currency
	 * SecuritiesSettlement1.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#SettlementCurrency
	 * Order9.SettlementCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#SettlementCurrency
	 * Order6.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#SettlementCurrency
	 * FundCashOutBreakdown3.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#SettlementCurrency
	 * FundCashInBreakdown3.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#LegSettlementCurrency
	 * InstrumentLeg6.LegSettlementCurrency}</li>
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
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.SettlementCurrency, com.tools20022.repository.msg.SecuritiesSettlement1.Currency, com.tools20022.repository.msg.Order9.SettlementCurrency,
					com.tools20022.repository.msg.Order6.SettlementCurrency, com.tools20022.repository.msg.FundCashOutBreakdown3.SettlementCurrency, com.tools20022.repository.msg.FundCashInBreakdown3.SettlementCurrency,
					com.tools20022.repository.msg.InstrumentLeg6.LegSettlementCurrency);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Counterparties eligibility as defined by article 24 of the EU MiFID
	 * Directive applicable to transactions executed by investment firms for
	 * eligible counterparties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Order3#OrderOriginatorEligibility
	 * Order3.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#OrderOriginatorEligibility
	 * Order16.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#OrderOriginatorEligibility
	 * Order14.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#OrderOriginatorEligibility
	 * InvestmentAccount21.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#OrderOriginatorEligibility
	 * Order9.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#OrderOriginatorEligibility
	 * Order6.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#OrderOriginatorEligibility
	 * Order17.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#OrderOriginatorEligibility
	 * Order18.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#OrderOriginatorEligibility
	 * InvestmentAccount58.OrderOriginatorEligibility}</li>
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
	public static final MMBusinessAttribute OrderOriginatorEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.OrderOriginatorEligibility, com.tools20022.repository.msg.Order16.OrderOriginatorEligibility,
					com.tools20022.repository.msg.Order14.OrderOriginatorEligibility, com.tools20022.repository.msg.InvestmentAccount21.OrderOriginatorEligibility, com.tools20022.repository.msg.Order9.OrderOriginatorEligibility,
					com.tools20022.repository.msg.Order6.OrderOriginatorEligibility, com.tools20022.repository.msg.Order17.OrderOriginatorEligibility, com.tools20022.repository.msg.Order18.OrderOriginatorEligibility,
					com.tools20022.repository.msg.InvestmentAccount58.OrderOriginatorEligibility);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument to be ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrder
	 * SecuritiesQuantity.RelatedOrder}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity1#Quantity
	 * OrderQuantity1.Quantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#QuantityDetails
	 * Order3.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#ConfirmationQuantity
	 * PartialFill1.ConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#OriginalOrderedQuantity
	 * PartialFill1.OriginalOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#PreviouslyExecutedQuantity
	 * PartialFill1.PreviouslyExecutedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#ConfirmationQuantity
	 * Order16.ConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#ConfirmationQuantity
	 * Order14.ConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus1#OrderQuantityDetails
	 * OrderStatus1.OrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#SideOrderQuantityDetails
	 * Order9.SideOrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#NewQuantity
	 * TriggeringInstructions.NewQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#LegOrderQuantity
	 * InstrumentLeg2.LegOrderQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#QuantityDetails
	 * Order1.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#LegOrderQuantity
	 * InstrumentLeg3.LegOrderQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#LegIOIQuantity
	 * InstrumentLeg1.LegIOIQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#OrderQuantity
	 * IndicationOfInterest1.OrderQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#TotalNumberSecurities
	 * Bid1.TotalNumberSecurities}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#QuantityDetails
	 * Order2.QuantityDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#Quantity2Details
	 * Order6.Quantity2Details}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#Quantity1Details
	 * Order6.Quantity1Details}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#QuantityDetails
	 * Order11.QuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#ConfirmationQuantity
	 * Order17.ConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#ConfirmationQuantity
	 * Order18.ConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#ConfirmationQuantity
	 * PartialFill2.ConfirmationQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#OriginalOrderedQuantity
	 * PartialFill2.OriginalOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartialFill2#PreviouslyExecutedQuantity
	 * PartialFill2.PreviouslyExecutedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#AmountOrUnitsOrPercentage
	 * RedemptionOrder14.AmountOrUnitsOrPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#AmountOrUnits
	 * SubscriptionOrder15.AmountOrUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#AmountOrUnitsOrPercentage
	 * RedemptionOrder15.AmountOrUnitsOrPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#AmountOrUnits
	 * SubscriptionOrder14.AmountOrUnits}</li>
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
	 * name} = "OrderedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument to be ordered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderedQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderQuantity1.Quantity, com.tools20022.repository.msg.Order3.QuantityDetails, com.tools20022.repository.msg.PartialFill1.ConfirmationQuantity,
					com.tools20022.repository.msg.PartialFill1.OriginalOrderedQuantity, com.tools20022.repository.msg.PartialFill1.PreviouslyExecutedQuantity, com.tools20022.repository.msg.Order16.ConfirmationQuantity,
					com.tools20022.repository.msg.Order14.ConfirmationQuantity, com.tools20022.repository.msg.OrderStatus1.OrderQuantityDetails, com.tools20022.repository.msg.Order9.SideOrderQuantityDetails,
					com.tools20022.repository.msg.TriggeringInstructions.NewQuantity, com.tools20022.repository.msg.InstrumentLeg2.LegOrderQuantity, com.tools20022.repository.msg.Order1.QuantityDetails,
					com.tools20022.repository.msg.InstrumentLeg3.LegOrderQuantity, com.tools20022.repository.msg.InstrumentLeg1.LegIOIQuantity, com.tools20022.repository.msg.IndicationOfInterest1.OrderQuantity,
					com.tools20022.repository.msg.Bid1.TotalNumberSecurities, com.tools20022.repository.msg.Order2.QuantityDetails, com.tools20022.repository.msg.Order6.Quantity2Details,
					com.tools20022.repository.msg.Order6.Quantity1Details, com.tools20022.repository.msg.Order11.QuantityDetails, com.tools20022.repository.msg.Order17.ConfirmationQuantity,
					com.tools20022.repository.msg.Order18.ConfirmationQuantity, com.tools20022.repository.msg.PartialFill2.ConfirmationQuantity, com.tools20022.repository.msg.PartialFill2.OriginalOrderedQuantity,
					com.tools20022.repository.msg.PartialFill2.PreviouslyExecutedQuantity, com.tools20022.repository.msg.RedemptionOrder14.AmountOrUnitsOrPercentage, com.tools20022.repository.msg.SubscriptionOrder15.AmountOrUnits,
					com.tools20022.repository.msg.RedemptionOrder15.AmountOrUnitsOrPercentage, com.tools20022.repository.msg.SubscriptionOrder14.AmountOrUnits);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity of financial instrument to be ordered.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of business process model used to carry out the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.BusinessProcessType1Choice#Code
	 * BusinessProcessType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BusinessProcessType1Choice#Proprietary
	 * BusinessProcessType1Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute BusinessProcessType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BusinessProcessType1Choice.Code, com.tools20022.repository.choice.BusinessProcessType1Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessProcessType";
			definition = "Type of business process model used to carry out the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BusinessProcessTypeCode.mmObject();
		}
	};
	/**
	 * Market at which the order is to be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#RelatedOrder
	 * TradingMarket.RelatedOrder}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#PlaceOfExecution
	 * Order3.PlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#PlaceOfTrade
	 * Order16.PlaceOfTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#PlaceOfTrade
	 * Order14.PlaceOfTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#PlaceOfExecution
	 * Order9.PlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#PlaceOfExecution
	 * Order1.PlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#PlaceOfExecution
	 * Order2.PlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#PlaceOfExecution
	 * Order6.PlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#PlaceOfExecution
	 * Order11.PlaceOfExecution}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#PlaceOfTrade
	 * Order17.PlaceOfTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#PlaceOfTrade
	 * Order18.PlaceOfTrade}</li>
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
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market at which the order is to be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.PlaceOfExecution, com.tools20022.repository.msg.Order16.PlaceOfTrade, com.tools20022.repository.msg.Order14.PlaceOfTrade,
					com.tools20022.repository.msg.Order9.PlaceOfExecution, com.tools20022.repository.msg.Order1.PlaceOfExecution, com.tools20022.repository.msg.Order2.PlaceOfExecution, com.tools20022.repository.msg.Order6.PlaceOfExecution,
					com.tools20022.repository.msg.Order11.PlaceOfExecution, com.tools20022.repository.msg.Order17.PlaceOfTrade, com.tools20022.repository.msg.Order18.PlaceOfTrade);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market at which the order is to be traded.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount to be used to derive the appropriate quantity of financial
	 * instrument to be bought or sold.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#GrossTradeAmount
	 * Order16.GrossTradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#GrossTradeAmount
	 * Order14.GrossTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#Amount
	 * InvestmentFundsOrderBreakdown1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice#OrderedAmount
	 * FinancialInstrumentQuantity11Choice.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1#OrderedAmount
	 * SidePocketQuantityAndAmount1.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#OrderedAmount
	 * RedemptionExecution10.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice#OrderedAmount
	 * FinancialInstrumentQuantity10Choice.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice#OrderedAmount
	 * SidePocketUnitsOrAmountOrRate1Choice.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#OrderedAmount
	 * SubscriptionExecution7.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity9Choice#OrderedAmount
	 * FinancialInstrumentQuantity9Choice.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#OrderedAmount
	 * FinancialInstrumentQuantity3.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#OrderedAmount
	 * FinancialInstrumentQuantity7Choice.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#OrderedAmount
	 * FinancialInstrumentQuantity8Choice.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#OrderedAmount
	 * FinancialInstrumentQuantity12Choice.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#OrderedAmount
	 * FinancialInstrumentQuantity13Choice.OrderedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#GrossTradeAmount
	 * Order17.GrossTradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#GrossTradeAmount
	 * Order18.GrossTradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#GrossAmount
	 * TradeLeg8.GrossAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#GrossAmount
	 * TradeLeg10.GrossAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#GrossAmount
	 * TradeLeg9.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#Amount
	 * InvestmentFundsOrderBreakdown2.Amount}</li>
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
	 * name} = "OrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.GrossTradeAmount, com.tools20022.repository.msg.Order14.GrossTradeAmount, com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.Amount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice.OrderedAmount, com.tools20022.repository.msg.SidePocketQuantityAndAmount1.OrderedAmount,
					com.tools20022.repository.msg.RedemptionExecution10.OrderedAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice.OrderedAmount,
					com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice.OrderedAmount, com.tools20022.repository.msg.SubscriptionExecution7.OrderedAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity9Choice.OrderedAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity3.OrderedAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice.OrderedAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice.OrderedAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice.OrderedAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice.OrderedAmount,
					com.tools20022.repository.msg.Order17.GrossTradeAmount, com.tools20022.repository.msg.Order18.GrossTradeAmount, com.tools20022.repository.msg.TradeLeg8.GrossAmount, com.tools20022.repository.msg.TradeLeg10.GrossAmount,
					com.tools20022.repository.msg.TradeLeg9.GrossAmount, com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2.Amount);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedAmount";
			definition = "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the number of days from trade date that the counterparty on the
	 * other side of the trade should be "given up" or divulged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#GiveUpNumberOfDays
	 * Order16.GiveUpNumberOfDays}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#GiveUpNumberOfDays
	 * Order14.GiveUpNumberOfDays}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#GiveUpNumberOfDays
	 * Order17.GiveUpNumberOfDays}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#GiveUpNumberOfDays
	 * Order18.GiveUpNumberOfDays}</li>
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
	public static final MMBusinessAttribute GiveUpNumberOfDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.GiveUpNumberOfDays, com.tools20022.repository.msg.Order14.GiveUpNumberOfDays, com.tools20022.repository.msg.Order17.GiveUpNumberOfDays,
					com.tools20022.repository.msg.Order18.GiveUpNumberOfDays);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GiveUpNumberOfDays";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	/**
	 * Specifies the regulatory conditions type of the trade.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Order16#TradeRegulatoryConditionsType
	 * Order16.TradeRegulatoryConditionsType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#TradeRegulatoryConditionsType
	 * Order14.TradeRegulatoryConditionsType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#TradeRegulatoryConditionsType
	 * Order17.TradeRegulatoryConditionsType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#TradeRegulatoryConditionsType
	 * Order18.TradeRegulatoryConditionsType}</li>
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
	public static final MMBusinessAttribute TradeRegulatoryConditionsType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.TradeRegulatoryConditionsType, com.tools20022.repository.msg.Order14.TradeRegulatoryConditionsType,
					com.tools20022.repository.msg.Order17.TradeRegulatoryConditionsType, com.tools20022.repository.msg.Order18.TradeRegulatoryConditionsType);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeRegulatoryConditionsType";
			definition = "Specifies the regulatory conditions type of the trade.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
		}
	};
	/**
	 * For good till orders, the order quantity less all quantity (adjusted for
	 * stock splits) that traded on previous days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#PreviousDayOrder
	 * SecuritiesQuantity.PreviousDayOrder}</li>
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
	public static final MMBusinessAssociationEnd DayOrderQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayOrderQuantity";
			definition = "For good till orders, the order quantity less all quantity (adjusted for stock splits) that traded on previous days.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the party which plays a role in the process of ordering
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole#SecuritiesOrder
	 * SecuritiesOrderPartyRole.SecuritiesOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order3#OtherBusinessParties
	 * Order3.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#OtherBusinessParties
	 * Order9.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#OtherBusinessParties
	 * Order6.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#OtherBusinessParties
	 * Order11.OtherBusinessParties}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesOrderPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.OtherBusinessParties, com.tools20022.repository.msg.Order9.OtherBusinessParties, com.tools20022.repository.msg.Order6.OtherBusinessParties,
					com.tools20022.repository.msg.Order11.OtherBusinessParties);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderPartyRole";
			definition = "Specifies the party which plays a role in the process of ordering securities.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the status of an order at a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#SecuritiesOrder
	 * SecuritiesOrderStatus.SecuritiesOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#Confirmation
	 * IndividualOrderConfirmationStatusAndReason2.Confirmation}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.Confirmation);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Indicates the status of an order at a specific point in time.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Negotiation which resulted in an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#SecuritiesOrder
	 * Negotiation.SecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd RelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation which resulted in an order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Negotiation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Charges and commissions associated with a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#SecuritiesOrder
	 * Adjustment.SecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd Adjustments = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Charges and commissions associated with a securities order.";
			minOccurs = 0;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Legal parameters required in a securities order for regulatory purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#RelatedOrder
	 * SecuritiesRegulatoryDetails.RelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd LegalParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalParameters";
			definition = "Legal parameters required in a securities order for regulatory purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesRegulatoryDetails.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the requested price for the order. This can be a "stop" price a
	 * "limit" price or a "deal" price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Order
	 * SecuritiesPricing.Order}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity1#Price
	 * OrderQuantity1.Price}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill1#DealPrice
	 * PartialFill1.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus3#AveragePrice
	 * OrderStatus3.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderQuantity3#Price
	 * OrderQuantity3.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#PreviousClosingPrice
	 * Order6.PreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#StrikePrice
	 * ListStrikePriceDetails1.StrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2#DealPrice
	 * PartialFill2.DealPrice}</li>
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
	 * name} = "OrderPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderQuantity1.Price, com.tools20022.repository.msg.PartialFill1.DealPrice, com.tools20022.repository.msg.OrderStatus3.AveragePrice,
					com.tools20022.repository.msg.OrderQuantity3.Price, com.tools20022.repository.msg.Order6.PreviousClosingPrice, com.tools20022.repository.msg.ListStrikePriceDetails1.StrikePrice,
					com.tools20022.repository.msg.PartialFill2.DealPrice);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderPrice";
			definition = "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the stop price in case of a stop order or a stop limit order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#StopPriceOrder
	 * SecuritiesPricing.StopPriceOrder}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.OrderParameters1#StopPrice
	 * OrderParameters1.StopPrice}</li>
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
	 * name} = "StopPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the stop price in case of a stop order or a stop limit order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StopPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderParameters1.StopPrice);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopPrice";
			definition = "Indicates the stop price in case of a stop order or a stop limit order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the pre-allocation of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#SecuritiesOrder
	 * Allocation.SecuritiesOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order3#PreAllocationDetails
	 * Order3.PreAllocationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#PreAllocationDetails
	 * Order9.PreAllocationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#LegPreAllocationDetails
	 * InstrumentLeg3.LegPreAllocationDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#TotalNumberTickets
	 * Bid1.TotalNumberTickets}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#PreAllocationDetails
	 * Order6.PreAllocationDetails}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesOrderAllocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.PreAllocationDetails, com.tools20022.repository.msg.Order9.PreAllocationDetails, com.tools20022.repository.msg.InstrumentLeg3.LegPreAllocationDetails,
					com.tools20022.repository.msg.Bid1.TotalNumberTickets, com.tools20022.repository.msg.Order6.PreAllocationDetails);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderAllocation";
			definition = "Information about the pre-allocation of an order.";
			minOccurs = 0;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Conditions under which a securities order must be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#RelatedSecuritiesOrder
	 * SecuritiesOrderParameters.RelatedSecuritiesOrder}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry1#OrderType
	 * QuoteEntry1.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#OrderParameters
	 * Order6.OrderParameters}</li>
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
	public static final MMBusinessAssociationEnd OrderExecutionParameters = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteEntry1.OrderType, com.tools20022.repository.msg.Order6.OrderParameters);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExecutionParameters";
			definition = "Conditions under which a securities order must be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Result of a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#RelatedOrder
	 * SecuritiesTrade.RelatedOrder}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#AmountsDetails
	 * Order3.AmountsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#AmountsDetails
	 * Order9.AmountsDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#AmountDetails
	 * Order6.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#AmountsDetails
	 * Order11.AmountsDetails}</li>
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
	public static final MMBusinessAssociationEnd OrderExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.AmountsDetails, com.tools20022.repository.msg.Order9.AmountsDetails, com.tools20022.repository.msg.Order6.AmountDetails,
					com.tools20022.repository.msg.Order11.AmountsDetails);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExecution";
			definition = "Result of a securities order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account impacted by a security transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedOrder
	 * SecuritiesAccount.RelatedOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#BiddingAccount
	 * DisclosedBid1.BiddingAccount}</li>
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
	public static final MMBusinessAssociationEnd OrderingAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisclosedBid1.BiddingAccount);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderingAccount";
			definition = "Account impacted by a security transaction.";
			minOccurs = 1;
			type_lazy = () -> SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote for which the order conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#SecuritiesOrder
	 * SecuritiesQuoteVariable.SecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote for which the order conditions are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the type of investment funds transaction.
	 * <p>
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
	public static final MMBusinessAttribute FundTransactionDirectionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundTransactionDirectionIndicator";
			definition = "Indicates the type of investment funds transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * Date/time on which the order was placed by the investor with the trading
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#OrderBookingDate
	 * Order16.OrderBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#OrderBookingDate
	 * Order14.OrderBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#OrderBookingDate
	 * Order17.OrderBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#OrderBookingDate
	 * Order18.OrderBookingDate}</li>
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
	 * name} = "OrderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the order was placed by the investor with the \ntrading party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.OrderBookingDate, com.tools20022.repository.msg.Order14.OrderBookingDate, com.tools20022.repository.msg.Order17.OrderBookingDate,
					com.tools20022.repository.msg.Order18.OrderBookingDate);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderDate";
			definition = "Date/time on which the order was placed by the investor with the \ntrading party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Price difference for a pegged order.
	 * <p>
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
	public static final MMBusinessAttribute PegDifference = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PegDifference";
			definition = "Price difference for a pegged order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Details of a specific trading session associated with a securities order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#SecuritiesOrder
	 * TradingSession.SecuritiesOrder}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesOrderTradingSession = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderTradingSession";
			definition = "Details of a specific trading session associated with a securities order.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order book whichgenerates an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.OrderBook#Order
	 * OrderBook.Order}</li>
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
	public static final MMBusinessAssociationEnd RelatedOrderBook = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderBook";
			definition = "Order book whichgenerates an order.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OrderBook.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrderBook.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * List trading information containing a serie of orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#SecuritiesListOrder
	 * ListTrading.SecuritiesListOrder}</li>
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
	public static final MMBusinessAssociationEnd ListTrading = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading information containing a serie of orders.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.SecuritiesListOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cross trade for which the buy side information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#BuySideOrder
	 * CrossTrade.BuySideOrder}</li>
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
	public static final MMBusinessAssociationEnd BuySideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideRelatedCrossTrade";
			definition = "Cross trade for which the buy side information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CrossTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.BuySideOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cross trade for which the sell side information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CrossTrade#SellSideOrder
	 * CrossTrade.SellSideOrder}</li>
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
	public static final MMBusinessAssociationEnd SellSideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideRelatedCrossTrade";
			definition = "Cross trade for which the sell side information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CrossTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.SellSideOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which an order is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesOrder
	 * Security.SecuritiesOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order3#FinancialInstrumentAttributes
	 * Order3.FinancialInstrumentAttributes}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#Stipulations
	 * Order3.Stipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#UnderlyingFinancialInstrumentAttributes
	 * Order3.UnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#UnderlyingStipulations
	 * Order3.UnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#UnderlyingFinancialInstrument
	 * OrderStatusAndReason5.UnderlyingFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#FinancialInstrumentAttributes
	 * IndicationOfInterest1.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#Stipulations
	 * IndicationOfInterest1.Stipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#UnderlyingFinancialInstrumentDetails
	 * IndicationOfInterest1.UnderlyingFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#UnderlyingFinancialInstrumentAttributes
	 * IndicationOfInterest1.UnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#UnderlyingStipulations
	 * IndicationOfInterest1.UnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#FinancialInstrumentAttributes
	 * Order6.FinancialInstrumentAttributes}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#Stipulations
	 * Order6.Stipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#UnderlyingFinancialInstrumentAttributes
	 * Order6.UnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#UnderlyingStipulations
	 * Order6.UnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#FinancialInstrumentAttributes
	 * Order11.FinancialInstrumentAttributes}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#Stipulations
	 * Order11.Stipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#UnderlyingFinancialInstrumentAttributes
	 * Order11.UnderlyingFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#UnderlyingStipulations
	 * Order11.UnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#Stipulations
	 * ListStrikePriceDetails1.Stipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#UnderlyingStipulations
	 * ListStrikePriceDetails1.UnderlyingStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#FinancialInstrumentAttributes
	 * ListStrikePriceDetails1.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#UnderlyingFinancialInstrumentAttributes
	 * ListStrikePriceDetails1.UnderlyingFinancialInstrumentAttributes}</li>
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
	public static final MMBusinessAssociationEnd OrderedSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.FinancialInstrumentAttributes, com.tools20022.repository.msg.Order3.Stipulations,
					com.tools20022.repository.msg.Order3.UnderlyingFinancialInstrumentAttributes, com.tools20022.repository.msg.Order3.UnderlyingStipulations,
					com.tools20022.repository.msg.OrderStatusAndReason5.UnderlyingFinancialInstrument, com.tools20022.repository.msg.IndicationOfInterest1.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.IndicationOfInterest1.Stipulations, com.tools20022.repository.msg.IndicationOfInterest1.UnderlyingFinancialInstrumentDetails,
					com.tools20022.repository.msg.IndicationOfInterest1.UnderlyingFinancialInstrumentAttributes, com.tools20022.repository.msg.IndicationOfInterest1.UnderlyingStipulations,
					com.tools20022.repository.msg.Order6.FinancialInstrumentAttributes, com.tools20022.repository.msg.Order6.Stipulations, com.tools20022.repository.msg.Order6.UnderlyingFinancialInstrumentAttributes,
					com.tools20022.repository.msg.Order6.UnderlyingStipulations, com.tools20022.repository.msg.Order11.FinancialInstrumentAttributes, com.tools20022.repository.msg.Order11.Stipulations,
					com.tools20022.repository.msg.Order11.UnderlyingFinancialInstrumentAttributes, com.tools20022.repository.msg.Order11.UnderlyingStipulations, com.tools20022.repository.msg.ListStrikePriceDetails1.Stipulations,
					com.tools20022.repository.msg.ListStrikePriceDetails1.UnderlyingStipulations, com.tools20022.repository.msg.ListStrikePriceDetails1.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.ListStrikePriceDetails1.UnderlyingFinancialInstrumentAttributes);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedSecurity";
			definition = "Security for which an order is specified.";
			minOccurs = 0;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the booking of executions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#RelatedOrder
	 * SecuritiesPostTradeBooking.RelatedOrder}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#BookingDetails
	 * Order3.BookingDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#BookingDetails
	 * Order9.BookingDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#BookingDetails
	 * Order6.BookingDetails}</li>
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
	public static final MMBusinessAssociationEnd BookingInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.BookingDetails, com.tools20022.repository.msg.Order9.BookingDetails, com.tools20022.repository.msg.Order6.BookingDetails);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookingInstructions";
			definition = "Information about the booking of executions.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPostTradeBooking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Conditions under which an exchange for physical trade takes place in the
	 * case of a non disclosed bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#SecuritiesOrder
	 * ExchangeForPhysicalTrade.SecuritiesOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Bid1#ExchangeForPhysicalIndicator
	 * Bid1.ExchangeForPhysicalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#ExchangeForPhysicalTrade
	 * NonDisclosedBid1.ExchangeForPhysicalTrade}</li>
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
	public static final MMBusinessAssociationEnd ExchangeForPhysicalTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Bid1.ExchangeForPhysicalIndicator, com.tools20022.repository.msg.NonDisclosedBid1.ExchangeForPhysicalTrade);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeForPhysicalTrade";
			definition = "Conditions under which an exchange for physical trade takes place in the case of a non disclosed bid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Describes how the quantity is specified, that is by quantity of units or
	 * by amount of money.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OrderQuantity1#QuantityType
	 * OrderQuantity1.QuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalOrderQuantityType1#Structured
	 * OriginalOrderQuantityType1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#OriginalOrderQuantityDetails
	 * FundCashInBreakdown1.OriginalOrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#OriginalOrderQuantityDetails
	 * FundCashOutBreakdown1.OriginalOrderQuantityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#OriginalOrderQuantityType
	 * FundCashInBreakdown2.OriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#ExtendedOriginalOrderQuantityType
	 * FundCashInBreakdown2.ExtendedOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#OriginalOrderQuantityType
	 * FundCashOutBreakdown2.OriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#ExtendedOriginalOrderQuantityType
	 * FundCashOutBreakdown2.ExtendedOriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#OriginalOrderQuantityType
	 * FundCashOutBreakdown3.OriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#OriginalOrderQuantityType
	 * FundCashInBreakdown3.OriginalOrderQuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.QuantityType1Choice#Code
	 * QuantityType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.QuantityType1Choice#Proprietary
	 * QuantityType1Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute QuantityType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderQuantity1.QuantityType, com.tools20022.repository.msg.OriginalOrderQuantityType1.Structured,
					com.tools20022.repository.msg.FundCashInBreakdown1.OriginalOrderQuantityDetails, com.tools20022.repository.msg.FundCashOutBreakdown1.OriginalOrderQuantityDetails,
					com.tools20022.repository.msg.FundCashInBreakdown2.OriginalOrderQuantityType, com.tools20022.repository.msg.FundCashInBreakdown2.ExtendedOriginalOrderQuantityType,
					com.tools20022.repository.msg.FundCashOutBreakdown2.OriginalOrderQuantityType, com.tools20022.repository.msg.FundCashOutBreakdown2.ExtendedOriginalOrderQuantityType,
					com.tools20022.repository.msg.FundCashOutBreakdown3.OriginalOrderQuantityType, com.tools20022.repository.msg.FundCashInBreakdown3.OriginalOrderQuantityType, com.tools20022.repository.choice.QuantityType1Choice.Code,
					com.tools20022.repository.choice.QuantityType1Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityType";
			definition = "Describes how the quantity is specified, that is by quantity of units or by amount of money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderQuantityTypeCode.mmObject();
		}
	};
	/**
	 * Unique identifier for the order as assigned by the buy-side. Uniqueness
	 * must be guaranteed within a single trading day. Firms, particularly those
	 * that electronically submit multi-day orders, trade globally or throughout
	 * market close periods, should ensure uniqueness across days, for example
	 * by embedding a date within the ClientOrderIdentification element.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransferReference2#ClientReference
	 * TransferReference2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference1#ClientReference
	 * TransferReference1.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#ClientOrderIdentification
	 * Order3.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#ClientOrderIdentification
	 * Order16.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#SecondaryClientOrderIdentification
	 * Order16.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#ClientOrderIdentification
	 * Order14.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#SecondaryClientOrderIdentification
	 * Order14.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#ClientReference
	 * IndividualOrderStatusAndReason4.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#ClientReference
	 * IndividualOrderConfirmationStatusAndReason1.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#ClientReference
	 * IndividualOrderStatusAndReason2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#ClientReference
	 * MessageAndBusinessReference6.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#ClientReference
	 * TransferStatusAndReason2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#ClientReference
	 * IndividualOrderStatusAndReason3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#ClientOrderIdentification
	 * Order9.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#SecondaryClientOrderIdentification
	 * Order9.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#ClientOrderIdentification
	 * OrderStatus3.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3#SecondaryClientOrderIdentification
	 * OrderStatus3.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#ClientOrderIdentification
	 * OrderIdentification3.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#SecondaryClientOrderIdentification
	 * OrderIdentification3.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#ClientOrderIdentification
	 * Order6.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#ClientOrderIdentification
	 * Order11.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order11#SecondaryClientOrderIdentification
	 * Order11.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#ClientReference
	 * MessageAndBusinessReference7.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#ClientReference
	 * TransferStatusAndReason3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference5#ClientReference
	 * TransferReference5.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference6#ClientReference
	 * TransferReference6.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#ClientOrderIdentification
	 * Order17.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#SecondaryClientOrderIdentification
	 * Order17.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#ClientOrderIdentification
	 * Order18.ClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#SecondaryClientOrderIdentification
	 * Order18.SecondaryClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#ClientReference
	 * MessageAndBusinessReference8.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#ClientReference
	 * TransferStatusAndReason4.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#ClientReference
	 * TransferReference9.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#ClientReference
	 * TransferReference10.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#ClientReference
	 * IndividualOrderConfirmationStatusAndReason2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#ClientReference
	 * IndividualOrderStatusAndReason7.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#ClientReference
	 * IndividualOrderStatusAndReason8.ClientReference}</li>
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
	 * "Unique identifier for the order as assigned by the buy-side.  Uniqueness must be guaranteed within a single trading day.  Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClientOrderIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferReference2.ClientReference, com.tools20022.repository.msg.TransferReference1.ClientReference,
					com.tools20022.repository.msg.Order3.ClientOrderIdentification, com.tools20022.repository.msg.Order16.ClientOrderIdentification, com.tools20022.repository.msg.Order16.SecondaryClientOrderIdentification,
					com.tools20022.repository.msg.Order14.ClientOrderIdentification, com.tools20022.repository.msg.Order14.SecondaryClientOrderIdentification, com.tools20022.repository.msg.IndividualOrderStatusAndReason4.ClientReference,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.ClientReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.ClientReference,
					com.tools20022.repository.msg.MessageAndBusinessReference6.ClientReference, com.tools20022.repository.msg.TransferStatusAndReason2.ClientReference,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason3.ClientReference, com.tools20022.repository.msg.Order9.ClientOrderIdentification, com.tools20022.repository.msg.Order9.SecondaryClientOrderIdentification,
					com.tools20022.repository.msg.OrderStatus3.ClientOrderIdentification, com.tools20022.repository.msg.OrderStatus3.SecondaryClientOrderIdentification,
					com.tools20022.repository.msg.OrderIdentification3.ClientOrderIdentification, com.tools20022.repository.msg.OrderIdentification3.SecondaryClientOrderIdentification,
					com.tools20022.repository.msg.Order6.ClientOrderIdentification, com.tools20022.repository.msg.Order11.ClientOrderIdentification, com.tools20022.repository.msg.Order11.SecondaryClientOrderIdentification,
					com.tools20022.repository.msg.MessageAndBusinessReference7.ClientReference, com.tools20022.repository.msg.TransferStatusAndReason3.ClientReference, com.tools20022.repository.msg.TransferReference5.ClientReference,
					com.tools20022.repository.msg.TransferReference6.ClientReference, com.tools20022.repository.msg.Order17.ClientOrderIdentification, com.tools20022.repository.msg.Order17.SecondaryClientOrderIdentification,
					com.tools20022.repository.msg.Order18.ClientOrderIdentification, com.tools20022.repository.msg.Order18.SecondaryClientOrderIdentification, com.tools20022.repository.msg.MessageAndBusinessReference8.ClientReference,
					com.tools20022.repository.msg.TransferStatusAndReason4.ClientReference, com.tools20022.repository.msg.TransferReference9.ClientReference, com.tools20022.repository.msg.TransferReference10.ClientReference,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.ClientReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.ClientReference,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason8.ClientReference);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side.  Uniqueness must be guaranteed within a single trading day.  Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Execution instructions in which securities order parameters are defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#RelatedOrder
	 * SecuritiesOrderExecutionInstruction.RelatedOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order3#ExecutionInstructionsDetails
	 * Order3.ExecutionInstructionsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#ExecutionInstructionsDetails
	 * Order6.ExecutionInstructionsDetails}</li>
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
	public static final MMBusinessAssociationEnd ExecutionInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.ExecutionInstructionsDetails, com.tools20022.repository.msg.Order6.ExecutionInstructionsDetails);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionInstructions";
			definition = "Execution instructions in which securities order parameters are defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the type of instruction to a broker or dealer to buy or sell a
	 * financial instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#OrderType
	 * TriggeringInstructions.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#OrderType
	 * QuoteEntry2.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#Type Order1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order2#Type Order2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OrderParameters1#Type
	 * OrderParameters1.Type}</li>
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
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TriggeringInstructions.OrderType, com.tools20022.repository.msg.QuoteEntry2.OrderType, com.tools20022.repository.msg.Order1.Type,
					com.tools20022.repository.msg.Order2.Type, com.tools20022.repository.msg.OrderParameters1.Type);
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrder";
				definition = "Intention to transfer an ownership of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesPricing.Order,
						com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder, com.tools20022.repository.entity.TradingMarket.RelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder,
						com.tools20022.repository.entity.Adjustment.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder,
						com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder, com.tools20022.repository.entity.ListTrading.SecuritiesListOrder, com.tools20022.repository.entity.TradingSession.SecuritiesOrder,
						com.tools20022.repository.entity.Allocation.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.RelatedOrder, com.tools20022.repository.entity.SecuritiesOrderPartyRole.SecuritiesOrder, com.tools20022.repository.entity.Negotiation.SecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesRegulatoryDetails.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder,
						com.tools20022.repository.entity.ExchangeForPhysicalTrade.SecuritiesOrder, com.tools20022.repository.entity.OrderBook.Order, com.tools20022.repository.entity.CrossTrade.BuySideOrder,
						com.tools20022.repository.entity.CrossTrade.SellSideOrder);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.BusinessProcessType, com.tools20022.repository.msg.Order16.PartialFillDetails, com.tools20022.repository.msg.Order14.BusinessProcessType,
						com.tools20022.repository.msg.Order14.PartialFillDetails, com.tools20022.repository.msg.SingleQuote1.OrderDetails, com.tools20022.repository.msg.SingleOrder1.OrderDetails,
						com.tools20022.repository.msg.MultiLegOrder1.OrderDetails, com.tools20022.repository.choice.SingleOrMultiLegOrderChoice.SingleOrderDetails,
						com.tools20022.repository.choice.SingleOrMultiLegOrderChoice.MultilegOrderDetails, com.tools20022.repository.msg.Order17.BusinessProcessType, com.tools20022.repository.msg.Order17.PartialFillDetails,
						com.tools20022.repository.msg.Order18.BusinessProcessType, com.tools20022.repository.msg.Order18.PartialFillDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrder.mmObject(), CrossTrade.mmObject());
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.OrderEffectiveDate, com.tools20022.repository.entity.SecuritiesOrder.OrderExpiryDate,
						com.tools20022.repository.entity.SecuritiesOrder.Identification, com.tools20022.repository.entity.SecuritiesOrder.CashMargin, com.tools20022.repository.entity.SecuritiesOrder.Side,
						com.tools20022.repository.entity.SecuritiesOrder.SolicitedOrder, com.tools20022.repository.entity.SecuritiesOrder.CustomerCapacity, com.tools20022.repository.entity.SecuritiesOrder.PositionEffect,
						com.tools20022.repository.entity.SecuritiesOrder.ForeignExchangeExecutionRequested, com.tools20022.repository.entity.SecuritiesOrder.SettlementCurrency,
						com.tools20022.repository.entity.SecuritiesOrder.OrderOriginatorEligibility, com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.BusinessProcessType,
						com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade, com.tools20022.repository.entity.SecuritiesOrder.OrderedAmount, com.tools20022.repository.entity.SecuritiesOrder.GiveUpNumberOfDays,
						com.tools20022.repository.entity.SecuritiesOrder.TradeRegulatoryConditionsType, com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderPartyRole, com.tools20022.repository.entity.SecuritiesOrder.Status, com.tools20022.repository.entity.SecuritiesOrder.RelatedNegotiation,
						com.tools20022.repository.entity.SecuritiesOrder.Adjustments, com.tools20022.repository.entity.SecuritiesOrder.LegalParameters, com.tools20022.repository.entity.SecuritiesOrder.OrderPrice,
						com.tools20022.repository.entity.SecuritiesOrder.StopPrice, com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderAllocation, com.tools20022.repository.entity.SecuritiesOrder.OrderExecutionParameters,
						com.tools20022.repository.entity.SecuritiesOrder.OrderExecution, com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount, com.tools20022.repository.entity.SecuritiesOrder.Quote,
						com.tools20022.repository.entity.SecuritiesOrder.FundTransactionDirectionIndicator, com.tools20022.repository.entity.SecuritiesOrder.OrderDate, com.tools20022.repository.entity.SecuritiesOrder.PegDifference,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderTradingSession, com.tools20022.repository.entity.SecuritiesOrder.RelatedOrderBook, com.tools20022.repository.entity.SecuritiesOrder.ListTrading,
						com.tools20022.repository.entity.SecuritiesOrder.BuySideRelatedCrossTrade, com.tools20022.repository.entity.SecuritiesOrder.SellSideRelatedCrossTrade,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity, com.tools20022.repository.entity.SecuritiesOrder.BookingInstructions, com.tools20022.repository.entity.SecuritiesOrder.ExchangeForPhysicalTrade,
						com.tools20022.repository.entity.SecuritiesOrder.QuantityType, com.tools20022.repository.entity.SecuritiesOrder.ClientOrderIdentification, com.tools20022.repository.entity.SecuritiesOrder.ExecutionInstructions,
						com.tools20022.repository.entity.SecuritiesOrder.Type);
				derivationComponent_lazy = () -> Arrays.asList(OrderQuantity1.mmObject(), Order3.mmObject(), BusinessProcessType1Choice.mmObject(), PartialFill1.mmObject(), Order16.mmObject(), Order14.mmObject(), Order9.mmObject(),
						Order1.mmObject(), SingleOrder1.mmObject(), MultiLegOrder1.mmObject(), Bid1.mmObject(), Bid2.mmObject(), Bid3.mmObject(), OrderQuantity3.mmObject(), Order2.mmObject(), OrderSide1.mmObject(),
						OrderIdentification3.mmObject(), Order6.mmObject(), Order11.mmObject(), Order17.mmObject(), Order18.mmObject(), PartialFill2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}