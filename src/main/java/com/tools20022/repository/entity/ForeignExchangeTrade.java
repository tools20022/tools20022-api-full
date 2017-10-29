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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TreasuryTrade;
import com.tools20022.repository.msg.AmountsAndValueDate1;
import com.tools20022.repository.msg.OpeningData1;
import com.tools20022.repository.msg.OpeningData2;
import com.tools20022.repository.msg.Trade3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement between two parties in which one party buys a currency and the
 * other party sells a different currency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ForeignExchangeTrade" src="doc-files/ForeignExchangeTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#AgreedRate
 * ForeignExchangeTrade.AgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#TypeOfProduct
 * ForeignExchangeTrade.TypeOfProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#BuyAmount
 * ForeignExchangeTrade.BuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#SellAmount
 * ForeignExchangeTrade.SellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ResultingSettlement
 * ForeignExchangeTrade.ResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#OpeningLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ClosingLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedSwap
 * ForeignExchangeTrade.RelatedSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#RelatedOption
 * ForeignExchangeTrade.RelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.CurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ExchangeForwardPoint
 * ForeignExchangeTrade.ExchangeForwardPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExchangeRateInformation
 * PaymentObligation.ExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RelatedForeignExchangeOperation
 * SecuritiesSettlement.RelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.CurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ForeignExchangeTransaction
 * TaxVoucher.ForeignExchangeTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#SwapLeg
 * ForeignExchangeSwap.SwapLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#OpeningLeg
 * NonDeliverableTrade.OpeningLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#ClosingLeg
 * NonDeliverableTrade.ClosingLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#ExercisedOption
 * CurrencyOption.ExercisedOption}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails1#TradeAmounts
 * SplitTradeDetails1.TradeAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningData1#TradeAmounts
 * OpeningData1.TradeAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningData2#TradeAmounts
 * OpeningData2.TradeAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#OptionAmounts
 * Option10.OptionAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#TradeAmounts
 * SplitTradeDetails3.TradeAmounts}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.NonDeliverableTrade
 * NonDeliverableTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
 * AmountsAndValueDate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningData1 OpeningData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningData2 OpeningData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade3 Trade3}</li>
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
 * "ForeignExchangeTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two parties in which one party buys a currency and the other party sells a different currency."
 * </li>
 * </ul>
 */
public class ForeignExchangeTrade extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exchange rate between two currencies. The rate is agreed by the trading
	 * parties during the negotiation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForForeignExchangeTrade
	 * CurrencyExchange.CurrencyExchangeForForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#ForeignExchangeDetails
	 * AmountAndDirection32.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#ForeignExchangeDetails
	 * AmountAndDirection9.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#ForeignExchangeDetails
	 * AmountAndDirection33.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#ForeignExchangeDetails
	 * AmountAndDirection17.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#ForeignExchangeDetails
	 * AmountAndDirection24.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#ForeignExchangeDetails
	 * AmountAndDirection2.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#ForeignExchangeDetails
	 * AmountAndDirection16.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#Exchange
	 * AmountAndDirection1.Exchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#ForeignExchangeDetails
	 * AmountAndDirection29.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#ForeignExchangeDetails
	 * AmountAndDirection28.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails1#AgreedRate
	 * SplitTradeDetails1.AgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#ForeignExchangeDetails
	 * RedemptionOrder3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#ForeignExchangeDetails
	 * RedemptionOrder5.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#ForeignExchangeDetails
	 * RedemptionExecution3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#ForeignExchangeDetails
	 * RedemptionExecution5.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#ForeignExchangeDetails
	 * RedemptionOrder7.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#ForeignExchangeDetails
	 * RedemptionOrder4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#ForeignExchangeDetails
	 * RedemptionOrder6.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#ForeignExchangeDetails
	 * RedemptionExecution4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#ForeignExchangeDetails
	 * RedemptionExecution6.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#ForeignExchangeDetails
	 * RedemptionOrder8.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#ForeignExchangeDetails
	 * SubscriptionOrder3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#ForeignExchangeDetails
	 * SubscriptionOrder5.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#ForeignExchangeDetails
	 * SubscriptionExecution3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#ForeignExchangeDetails
	 * SubscriptionExecution5.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#ForeignExchangeDetails
	 * SubscriptionOrder7.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#ForeignExchangeDetails
	 * SubscriptionOrder4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#ForeignExchangeDetails
	 * SubscriptionOrder6.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#ForeignExchangeDetails
	 * SubscriptionExecution4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#ForeignExchangeDetails
	 * SubscriptionExecution6.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#ForeignExchangeDetails
	 * SubscriptionOrder8.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#ForeignExchangeDetails
	 * SwitchOrder2.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#ForeignExchangeDetails
	 * SwitchOrder3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#ForeignExchangeDetails
	 * SwitchExecution3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#ForeignExchangeDetails
	 * SwitchExecution4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#ForeignExchangeDetails
	 * SwitchOrder4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#ForeignExchangeDetails
	 * AmountAndDirection10.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#ForeignExchangeDetails
	 * AmountAndDirection22.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection23#ForeignExchangeDetails
	 * AmountAndDirection23.ForeignExchangeDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData1#AgreedRate
	 * OpeningData1.AgreedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData2#AgreedRate
	 * OpeningData2.AgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#ForeignExchangeDetails
	 * AmountAndDirection11.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#ForeignExchangeDetails
	 * AmountAndDirection25.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection26#ForeignExchangeDetails
	 * AmountAndDirection26.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#ForeignExchangeDetails
	 * AmountAndDirection27.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#ForeignExchangeDetails
	 * RedemptionExecution10.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#ForeignExchangeDetails
	 * SubscriptionExecution7.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#ForeignExchangeDetails
	 * RedemptionExecution12.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#ForeignExchangeDetails
	 * SubscriptionExecution9.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#ForeignExchangeDetails
	 * ReceiveInformation13.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#ForeignExchangeDetails
	 * ReceiveInformation12.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#ForeignExchangeDetails
	 * DeliverInformation12.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#ForeignExchangeDetails
	 * DeliverInformation13.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#ForeignExchangeDetails
	 * AmountAndDirection36.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#ForeignExchangeDetails
	 * AmountAndDirection37.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#ForeignExchangeDetails
	 * AmountAndDirection38.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#ForeignExchangeDetails
	 * AmountAndDirection40.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#ForeignExchangeRate
	 * FundCashForecast7.ForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#ForeignExchangeRate
	 * EstimatedFundCashForecast6.ForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#ForeignExchangeRate
	 * FundCashForecast6.ForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#ForeignExchangeRate
	 * EstimatedFundCashForecast5.ForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#ForeignExchangeDetails
	 * DeliverInformation15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#ForeignExchangeDetails
	 * DeliverInformation14.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#ForeignExchangeDetails
	 * ReceiveInformation15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#ForeignExchangeDetails
	 * ReceiveInformation14.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#ForeignExchange
	 * ForeignExchangeSwapTransaction1.ForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#ForeignExchangeDetails
	 * AmountAndDirection46.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#ForeignExchangeDetails
	 * AmountAndDirection49.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#ForeignExchangeDetails
	 * AmountAndDirection48.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#ForeignExchangeDetails
	 * AmountAndDirection44.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#ForeignExchangeDetails
	 * AmountAndDirection45.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection47#ForeignExchangeDetails
	 * AmountAndDirection47.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#ForeignExchangeDetails
	 * ReceiveInformation17.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#ForeignExchangeDetails
	 * ReceiveInformation16.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#ForeignExchangeDetails
	 * DeliverInformation16.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#ForeignExchangeDetails
	 * DeliverInformation17.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#ForeignExchangeDetails
	 * AmountAndDirection66.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#ForeignExchangeDetails
	 * AmountAndDirection60.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#ForeignExchangeDetails
	 * AmountAndDirection71.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#ForeignExchangeDetails
	 * AmountAndDirection85.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#ForeignExchangeDetails
	 * AmountAndDirection55.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#ForeignExchangeDetails
	 * AmountAndDirection58.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection72#ForeignExchangeDetails
	 * AmountAndDirection72.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#ForeignExchange
	 * ForeignExchangeSwapTransaction2.ForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#ForeignExchangeDetails
	 * SwitchExecution7.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#ForeignExchangeDetails
	 * SwitchOrder7.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#ForeignExchangeDetails
	 * RedemptionOrder14.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#ForeignExchangeDetails
	 * SubscriptionExecution13.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#ForeignExchangeDetails
	 * SubscriptionExecution12.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#ForeignExchangeDetails
	 * SubscriptionOrder15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#ForeignExchangeDetails
	 * RedemptionOrder15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#ForeignExchangeDetails
	 * RedemptionExecution16.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#ForeignExchangeDetails
	 * SubscriptionOrder14.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#ForeignExchangeDetails
	 * RedemptionExecution15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#AgreedRate
	 * SplitTradeDetails3.AgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#ForeignExchange
	 * ForeignExchangeSwapTransaction3.ForeignExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate between two currencies. The rate is agreed by the trading parties during the negotiation process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AgreedRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndDirection32.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection9.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection33.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection17.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection24.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection2.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection16.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection1.Exchange, com.tools20022.repository.msg.AmountAndDirection29.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection28.ForeignExchangeDetails, com.tools20022.repository.msg.SplitTradeDetails1.AgreedRate, com.tools20022.repository.msg.RedemptionOrder3.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionOrder5.ForeignExchangeDetails, com.tools20022.repository.msg.RedemptionExecution3.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionExecution5.ForeignExchangeDetails, com.tools20022.repository.msg.RedemptionOrder7.ForeignExchangeDetails, com.tools20022.repository.msg.RedemptionOrder4.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionOrder6.ForeignExchangeDetails, com.tools20022.repository.msg.RedemptionExecution4.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionExecution6.ForeignExchangeDetails, com.tools20022.repository.msg.RedemptionOrder8.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionOrder3.ForeignExchangeDetails,
					com.tools20022.repository.msg.SubscriptionOrder5.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionExecution3.ForeignExchangeDetails,
					com.tools20022.repository.msg.SubscriptionExecution5.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionOrder7.ForeignExchangeDetails,
					com.tools20022.repository.msg.SubscriptionOrder4.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionOrder6.ForeignExchangeDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionExecution6.ForeignExchangeDetails,
					com.tools20022.repository.msg.SubscriptionOrder8.ForeignExchangeDetails, com.tools20022.repository.msg.SwitchOrder2.ForeignExchangeDetails, com.tools20022.repository.msg.SwitchOrder3.ForeignExchangeDetails,
					com.tools20022.repository.msg.SwitchExecution3.ForeignExchangeDetails, com.tools20022.repository.msg.SwitchExecution4.ForeignExchangeDetails, com.tools20022.repository.msg.SwitchOrder4.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection10.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection22.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection23.ForeignExchangeDetails, com.tools20022.repository.msg.OpeningData1.AgreedRate, com.tools20022.repository.msg.OpeningData2.AgreedRate,
					com.tools20022.repository.msg.AmountAndDirection11.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection25.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection26.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection27.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionExecution10.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionExecution7.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionExecution12.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionExecution9.ForeignExchangeDetails,
					com.tools20022.repository.msg.ReceiveInformation13.ForeignExchangeDetails, com.tools20022.repository.msg.ReceiveInformation12.ForeignExchangeDetails,
					com.tools20022.repository.msg.DeliverInformation12.ForeignExchangeDetails, com.tools20022.repository.msg.DeliverInformation13.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection36.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection37.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection38.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection40.ForeignExchangeDetails, com.tools20022.repository.msg.FundCashForecast7.ForeignExchangeRate,
					com.tools20022.repository.msg.EstimatedFundCashForecast6.ForeignExchangeRate, com.tools20022.repository.msg.FundCashForecast6.ForeignExchangeRate,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.ForeignExchangeRate, com.tools20022.repository.msg.DeliverInformation15.ForeignExchangeDetails,
					com.tools20022.repository.msg.DeliverInformation14.ForeignExchangeDetails, com.tools20022.repository.msg.ReceiveInformation15.ForeignExchangeDetails,
					com.tools20022.repository.msg.ReceiveInformation14.ForeignExchangeDetails, com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.ForeignExchange,
					com.tools20022.repository.msg.AmountAndDirection46.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection49.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection48.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection44.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection45.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection47.ForeignExchangeDetails,
					com.tools20022.repository.msg.ReceiveInformation17.ForeignExchangeDetails, com.tools20022.repository.msg.ReceiveInformation16.ForeignExchangeDetails,
					com.tools20022.repository.msg.DeliverInformation16.ForeignExchangeDetails, com.tools20022.repository.msg.DeliverInformation17.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection66.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection60.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection71.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection85.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection55.ForeignExchangeDetails, com.tools20022.repository.msg.AmountAndDirection58.ForeignExchangeDetails,
					com.tools20022.repository.msg.AmountAndDirection72.ForeignExchangeDetails, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.ForeignExchange,
					com.tools20022.repository.msg.SwitchExecution7.ForeignExchangeDetails, com.tools20022.repository.msg.SwitchOrder7.ForeignExchangeDetails, com.tools20022.repository.msg.RedemptionOrder14.ForeignExchangeDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionExecution12.ForeignExchangeDetails,
					com.tools20022.repository.msg.SubscriptionOrder15.ForeignExchangeDetails, com.tools20022.repository.msg.RedemptionOrder15.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionExecution16.ForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionOrder14.ForeignExchangeDetails,
					com.tools20022.repository.msg.RedemptionExecution15.ForeignExchangeDetails, com.tools20022.repository.msg.SplitTradeDetails3.AgreedRate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.ForeignExchange);
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate between two currencies. The rate is agreed by the trading parties during the negotiation process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of trade.
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
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#ProductType
	 * TradeData10.ProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData8#ProductType
	 * TradeData8.ProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#ProductType
	 * TradeAgreement9.ProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#ProductType
	 * TradeData7.ProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#ProductType
	 * TradeAgreement12.ProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData11#ProductType
	 * TradeData11.ProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#ProductType
	 * TradeAgreement15.ProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#ProductType
	 * TradeData12.ProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement14#ProductType
	 * TradeAgreement14.ProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#ProductType
	 * TradeData15.ProductType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData10.ProductType, com.tools20022.repository.msg.TradeData8.ProductType, com.tools20022.repository.msg.TradeAgreement9.ProductType,
					com.tools20022.repository.msg.TradeData7.ProductType, com.tools20022.repository.msg.TradeAgreement12.ProductType, com.tools20022.repository.msg.TradeData11.ProductType,
					com.tools20022.repository.msg.TradeAgreement15.ProductType, com.tools20022.repository.msg.TradeData12.ProductType, com.tools20022.repository.msg.TradeAgreement14.ProductType,
					com.tools20022.repository.msg.TradeData15.ProductType);
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfProduct";
			definition = "Specifies the type of trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency and amount bought in a foreign exchange trade.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#TradingSideBuyAmount
	 * AmountsAndValueDate1.TradingSideBuyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#BuyAmount
	 * ForeignExchangeTerms4.BuyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#ToAmount
	 * ForeignExchangeTerms7.ToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#ToAmount
	 * ForeignExchangeTerms10.ToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#ToAmount
	 * ForeignExchangeTerms26.ToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#ToAmount
	 * ForeignExchangeTerms33.ToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#TradingSideBuyAmount
	 * FixingConditions1.TradingSideBuyAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount bought in a foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuyAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate1.TradingSideBuyAmount, com.tools20022.repository.msg.ForeignExchangeTerms4.BuyAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms7.ToAmount, com.tools20022.repository.msg.ForeignExchangeTerms10.ToAmount, com.tools20022.repository.msg.ForeignExchangeTerms26.ToAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms33.ToAmount, com.tools20022.repository.msg.FixingConditions1.TradingSideBuyAmount);
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Currency and amount bought in a foreign exchange trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Currency and amount sold in a foreign exchange trade.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#TradingSideSellAmount
	 * AmountsAndValueDate1.TradingSideSellAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#SellAmount
	 * ForeignExchangeTerms4.SellAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#FromAmount
	 * ForeignExchangeTerms7.FromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#FromAmount
	 * ForeignExchangeTerms10.FromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#FromAmount
	 * ForeignExchangeTerms26.FromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#FromAmount
	 * ForeignExchangeTerms33.FromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#TradingSideSellAmount
	 * FixingConditions1.TradingSideSellAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount sold in a foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SellAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate1.TradingSideSellAmount, com.tools20022.repository.msg.ForeignExchangeTerms4.SellAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms7.FromAmount, com.tools20022.repository.msg.ForeignExchangeTerms10.FromAmount, com.tools20022.repository.msg.ForeignExchangeTerms26.FromAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms33.FromAmount, com.tools20022.repository.msg.FixingConditions1.TradingSideSellAmount);
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Currency and amount sold in a foreign exchange trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Payment of the settlement amount to the account(s) of the final
	 * beneficiary. A payment may be settled gross, through split amounts at
	 * several agents of the buyer, or netted with several other treasury
	 * agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExchangeRateInformation
	 * PaymentObligation.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of the settlement amount to the account(s) of the final beneficiary. A payment may be settled gross, through split amounts at several agents of the buyer, or netted with several other treasury agreements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ResultingSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingSettlement";
			definition = "Payment of the settlement amount to the account(s) of the final beneficiary. A payment may be settled gross, through split amounts at several agents of the buyer, or netted with several other treasury agreements.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process for which a currency exchange is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RelatedForeignExchangeOperation
	 * SecuritiesSettlement.RelatedForeignExchangeOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which a currency exchange is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesSettlement";
			definition = "Securities settlement process for which a currency exchange is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Non deliverable trade for which an opening closing leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#OpeningLeg
	 * NonDeliverableTrade.OpeningLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegRelatedNonDeliverableTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non deliverable trade for which an opening closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OpeningLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which an opening closing leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NonDeliverableTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Non deliverable trade for which a closing leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#ClosingLeg
	 * NonDeliverableTrade.ClosingLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NonDeliverableTrade
	 * NonDeliverableTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegRelatedNonDeliverableTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non deliverable trade for which a closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosingLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which a closing leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NonDeliverableTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * FX swap for which the FX trade is one leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#SwapLeg
	 * ForeignExchangeSwap.SwapLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap
	 * ForeignExchangeSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "FX swap for which the FX trade is one leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSwap";
			definition = "FX swap for which the FX trade is one leg.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ForeignExchangeSwap.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Option which is executed by one (or more) FX trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#ExercisedOption
	 * CurrencyOption.ExercisedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option which is executed by one (or more) FX trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option which is executed by one (or more) FX trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CurrencyOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.ExercisedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax voucher for which currency exchange information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ForeignExchangeTransaction
	 * TaxVoucher.ForeignExchangeTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForTaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax voucher for which currency exchange information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForTaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTaxVoucher";
			definition = "Tax voucher for which currency exchange information is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Difference between the foreign exchange spot rate and the foreign
	 * exchange forward rate expressed in basis points quoted in accordance with
	 * the prevailing market conventions for the currency pair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#ExchangeForwardPoint
	 * ForeignExchange1.ExchangeForwardPoint}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForwardPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExchangeForwardPoint = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchange1.ExchangeForwardPoint);
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeForwardPoint";
			definition = "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. ";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTrade";
				definition = "Agreement between two parties in which one party buys a currency and the other party sells a different currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation, com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade, com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction,
						com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg, com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg, com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg,
						com.tools20022.repository.entity.CurrencyOption.ExercisedOption);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SplitTradeDetails1.TradeAmounts, com.tools20022.repository.msg.OpeningData1.TradeAmounts, com.tools20022.repository.msg.OpeningData2.TradeAmounts,
						com.tools20022.repository.msg.Option10.OptionAmounts, com.tools20022.repository.msg.SplitTradeDetails3.TradeAmounts);
				subType_lazy = () -> Arrays.asList(NonDeliverableTrade.mmObject());
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate, com.tools20022.repository.entity.ForeignExchangeTrade.TypeOfProduct,
						com.tools20022.repository.entity.ForeignExchangeTrade.BuyAmount, com.tools20022.repository.entity.ForeignExchangeTrade.SellAmount, com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement,
						com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade,
						com.tools20022.repository.entity.ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade, com.tools20022.repository.entity.ForeignExchangeTrade.RelatedSwap,
						com.tools20022.repository.entity.ForeignExchangeTrade.RelatedOption, com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.ForeignExchangeTrade.ExchangeForwardPoint);
				derivationComponent_lazy = () -> Arrays.asList(AmountsAndValueDate1.mmObject(), OpeningData1.mmObject(), OpeningData2.mmObject(), Trade3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}