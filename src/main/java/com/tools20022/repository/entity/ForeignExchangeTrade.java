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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TreasuryTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
 * ForeignExchangeTrade.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmTypeOfProduct
 * ForeignExchangeTrade.mmTypeOfProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmBuyAmount
 * ForeignExchangeTrade.mmBuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmSellAmount
 * ForeignExchangeTrade.mmSellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
 * ForeignExchangeTrade.mmResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmOpeningLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmClosingLegRelatedNonDeliverableTrade
 * ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmRelatedSwap
 * ForeignExchangeTrade.mmRelatedSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmRelatedOption
 * ForeignExchangeTrade.mmRelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmExchangeForwardPoint
 * ForeignExchangeTrade.mmExchangeForwardPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
 * PaymentObligation.mmExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRelatedForeignExchangeOperation
 * SecuritiesSettlement.mmRelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmForeignExchangeTransaction
 * TaxVoucher.mmForeignExchangeTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#mmSwapLeg
 * ForeignExchangeSwap.mmSwapLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmOpeningLeg
 * NonDeliverableTrade.mmOpeningLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmClosingLeg
 * NonDeliverableTrade.mmClosingLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmExercisedOption
 * CurrencyOption.mmExercisedOption}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails1#mmTradeAmounts
 * SplitTradeDetails1.mmTradeAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningData1#mmTradeAmounts
 * OpeningData1.mmTradeAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningData2#mmTradeAmounts
 * OpeningData2.mmTradeAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmOptionAmounts
 * Option10.mmOptionAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#mmTradeAmounts
 * SplitTradeDetails3.mmTradeAmounts}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.NonDeliverableTrade
 * NonDeliverableTrade}</li>
 * </ul>
 * </li>
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
	protected CurrencyExchange agreedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForForeignExchangeTrade
	 * CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmForeignExchangeDetails
	 * AmountAndDirection32.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#mmForeignExchangeDetails
	 * AmountAndDirection9.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmForeignExchangeDetails
	 * AmountAndDirection33.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#mmForeignExchangeDetails
	 * AmountAndDirection17.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#mmForeignExchangeDetails
	 * AmountAndDirection24.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmForeignExchangeDetails
	 * AmountAndDirection2.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmForeignExchangeDetails
	 * AmountAndDirection16.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#mmExchange
	 * AmountAndDirection1.mmExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#mmForeignExchangeDetails
	 * AmountAndDirection29.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmForeignExchangeDetails
	 * AmountAndDirection28.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails1#mmAgreedRate
	 * SplitTradeDetails1.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmForeignExchangeDetails
	 * RedemptionOrder3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmForeignExchangeDetails
	 * RedemptionOrder5.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmForeignExchangeDetails
	 * RedemptionExecution3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmForeignExchangeDetails
	 * RedemptionExecution5.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmForeignExchangeDetails
	 * RedemptionOrder7.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmForeignExchangeDetails
	 * RedemptionOrder4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmForeignExchangeDetails
	 * RedemptionOrder6.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmForeignExchangeDetails
	 * RedemptionExecution4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmForeignExchangeDetails
	 * RedemptionExecution6.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmForeignExchangeDetails
	 * RedemptionOrder8.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmForeignExchangeDetails
	 * SubscriptionOrder3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmForeignExchangeDetails
	 * SubscriptionOrder5.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmForeignExchangeDetails
	 * SubscriptionExecution3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmForeignExchangeDetails
	 * SubscriptionExecution5.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmForeignExchangeDetails
	 * SubscriptionOrder7.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmForeignExchangeDetails
	 * SubscriptionOrder4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmForeignExchangeDetails
	 * SubscriptionOrder6.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmForeignExchangeDetails
	 * SubscriptionExecution4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmForeignExchangeDetails
	 * SubscriptionExecution6.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmForeignExchangeDetails
	 * SubscriptionOrder8.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmForeignExchangeDetails
	 * SwitchOrder2.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmForeignExchangeDetails
	 * SwitchOrder3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmForeignExchangeDetails
	 * SwitchExecution3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmForeignExchangeDetails
	 * SwitchExecution4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmForeignExchangeDetails
	 * SwitchOrder4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#mmForeignExchangeDetails
	 * AmountAndDirection10.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#mmForeignExchangeDetails
	 * AmountAndDirection22.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection23#mmForeignExchangeDetails
	 * AmountAndDirection23.mmForeignExchangeDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData1#mmAgreedRate
	 * OpeningData1.mmAgreedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData2#mmAgreedRate
	 * OpeningData2.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#mmForeignExchangeDetails
	 * AmountAndDirection11.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#mmForeignExchangeDetails
	 * AmountAndDirection25.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection26#mmForeignExchangeDetails
	 * AmountAndDirection26.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#mmForeignExchangeDetails
	 * AmountAndDirection27.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmForeignExchangeDetails
	 * RedemptionExecution10.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmForeignExchangeDetails
	 * SubscriptionExecution7.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmForeignExchangeDetails
	 * RedemptionExecution12.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmForeignExchangeDetails
	 * SubscriptionExecution9.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmForeignExchangeDetails
	 * ReceiveInformation13.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmForeignExchangeDetails
	 * ReceiveInformation12.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmForeignExchangeDetails
	 * DeliverInformation12.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmForeignExchangeDetails
	 * DeliverInformation13.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmForeignExchangeDetails
	 * AmountAndDirection36.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmForeignExchangeDetails
	 * AmountAndDirection37.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmForeignExchangeDetails
	 * AmountAndDirection38.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmForeignExchangeDetails
	 * AmountAndDirection40.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmForeignExchangeRate
	 * FundCashForecast7.mmForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmForeignExchangeRate
	 * EstimatedFundCashForecast6.mmForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmForeignExchangeRate
	 * FundCashForecast6.mmForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmForeignExchangeRate
	 * EstimatedFundCashForecast5.mmForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmForeignExchangeDetails
	 * DeliverInformation15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmForeignExchangeDetails
	 * DeliverInformation14.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmForeignExchangeDetails
	 * ReceiveInformation15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmForeignExchangeDetails
	 * ReceiveInformation14.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmForeignExchange
	 * ForeignExchangeSwapTransaction1.mmForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmForeignExchangeDetails
	 * AmountAndDirection46.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#mmForeignExchangeDetails
	 * AmountAndDirection49.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#mmForeignExchangeDetails
	 * AmountAndDirection48.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#mmForeignExchangeDetails
	 * AmountAndDirection44.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmForeignExchangeDetails
	 * AmountAndDirection45.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection47#mmForeignExchangeDetails
	 * AmountAndDirection47.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmForeignExchangeDetails
	 * ReceiveInformation17.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmForeignExchangeDetails
	 * ReceiveInformation16.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmForeignExchangeDetails
	 * DeliverInformation16.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmForeignExchangeDetails
	 * DeliverInformation17.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#mmForeignExchangeDetails
	 * AmountAndDirection66.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmForeignExchangeDetails
	 * AmountAndDirection60.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#mmForeignExchangeDetails
	 * AmountAndDirection71.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmForeignExchangeDetails
	 * AmountAndDirection85.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#mmForeignExchangeDetails
	 * AmountAndDirection55.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#mmForeignExchangeDetails
	 * AmountAndDirection58.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection72#mmForeignExchangeDetails
	 * AmountAndDirection72.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmForeignExchange
	 * ForeignExchangeSwapTransaction2.mmForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmForeignExchangeDetails
	 * SwitchExecution7.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmForeignExchangeDetails
	 * SwitchOrder7.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmForeignExchangeDetails
	 * RedemptionOrder14.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmForeignExchangeDetails
	 * SubscriptionExecution13.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmForeignExchangeDetails
	 * SubscriptionExecution12.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmForeignExchangeDetails
	 * SubscriptionOrder15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmForeignExchangeDetails
	 * RedemptionOrder15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmForeignExchangeDetails
	 * RedemptionExecution16.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmForeignExchangeDetails
	 * SubscriptionOrder14.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmForeignExchangeDetails
	 * RedemptionExecution15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3#mmAgreedRate
	 * SplitTradeDetails3.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmForeignExchange
	 * ForeignExchangeSwapTransaction3.mmForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmForeignExchangeDetails
	 * ReceiveInformation18.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmForeignExchangeDetails
	 * DeliverInformation19.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmForeignExchangeDetails
	 * ReceiveInformation19.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmForeignExchangeDetails
	 * DeliverInformation18.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection87#mmForeignExchangeDetails
	 * AmountAndDirection87.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection88#mmForeignExchangeDetails
	 * AmountAndDirection88.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection89#mmForeignExchangeDetails
	 * AmountAndDirection89.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection90#mmForeignExchangeDetails
	 * AmountAndDirection90.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection92#mmForeignExchangeDetails
	 * AmountAndDirection92.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection91#mmForeignExchangeDetails
	 * AmountAndDirection91.mmForeignExchangeDetails}</li>
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
	public static final MMBusinessAssociationEnd mmAgreedRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection32.mmForeignExchangeDetails, AmountAndDirection9.mmForeignExchangeDetails, AmountAndDirection33.mmForeignExchangeDetails, AmountAndDirection17.mmForeignExchangeDetails,
					AmountAndDirection24.mmForeignExchangeDetails, AmountAndDirection2.mmForeignExchangeDetails, AmountAndDirection16.mmForeignExchangeDetails, AmountAndDirection1.mmExchange, AmountAndDirection29.mmForeignExchangeDetails,
					AmountAndDirection28.mmForeignExchangeDetails, SplitTradeDetails1.mmAgreedRate, RedemptionOrder3.mmForeignExchangeDetails, RedemptionOrder5.mmForeignExchangeDetails, RedemptionExecution3.mmForeignExchangeDetails,
					RedemptionExecution5.mmForeignExchangeDetails, RedemptionOrder7.mmForeignExchangeDetails, RedemptionOrder4.mmForeignExchangeDetails, RedemptionOrder6.mmForeignExchangeDetails,
					RedemptionExecution4.mmForeignExchangeDetails, RedemptionExecution6.mmForeignExchangeDetails, RedemptionOrder8.mmForeignExchangeDetails, SubscriptionOrder3.mmForeignExchangeDetails,
					SubscriptionOrder5.mmForeignExchangeDetails, SubscriptionExecution3.mmForeignExchangeDetails, SubscriptionExecution5.mmForeignExchangeDetails, SubscriptionOrder7.mmForeignExchangeDetails,
					SubscriptionOrder4.mmForeignExchangeDetails, SubscriptionOrder6.mmForeignExchangeDetails, SubscriptionExecution4.mmForeignExchangeDetails, SubscriptionExecution6.mmForeignExchangeDetails,
					SubscriptionOrder8.mmForeignExchangeDetails, SwitchOrder2.mmForeignExchangeDetails, SwitchOrder3.mmForeignExchangeDetails, SwitchExecution3.mmForeignExchangeDetails, SwitchExecution4.mmForeignExchangeDetails,
					SwitchOrder4.mmForeignExchangeDetails, AmountAndDirection10.mmForeignExchangeDetails, AmountAndDirection22.mmForeignExchangeDetails, AmountAndDirection23.mmForeignExchangeDetails, OpeningData1.mmAgreedRate,
					OpeningData2.mmAgreedRate, AmountAndDirection11.mmForeignExchangeDetails, AmountAndDirection25.mmForeignExchangeDetails, AmountAndDirection26.mmForeignExchangeDetails, AmountAndDirection27.mmForeignExchangeDetails,
					RedemptionExecution10.mmForeignExchangeDetails, SubscriptionExecution7.mmForeignExchangeDetails, RedemptionExecution12.mmForeignExchangeDetails, SubscriptionExecution9.mmForeignExchangeDetails,
					ReceiveInformation13.mmForeignExchangeDetails, ReceiveInformation12.mmForeignExchangeDetails, DeliverInformation12.mmForeignExchangeDetails, DeliverInformation13.mmForeignExchangeDetails,
					AmountAndDirection36.mmForeignExchangeDetails, AmountAndDirection37.mmForeignExchangeDetails, AmountAndDirection38.mmForeignExchangeDetails, AmountAndDirection40.mmForeignExchangeDetails,
					FundCashForecast7.mmForeignExchangeRate, EstimatedFundCashForecast6.mmForeignExchangeRate, FundCashForecast6.mmForeignExchangeRate, EstimatedFundCashForecast5.mmForeignExchangeRate,
					DeliverInformation15.mmForeignExchangeDetails, DeliverInformation14.mmForeignExchangeDetails, ReceiveInformation15.mmForeignExchangeDetails, ReceiveInformation14.mmForeignExchangeDetails,
					ForeignExchangeSwapTransaction1.mmForeignExchange, AmountAndDirection46.mmForeignExchangeDetails, AmountAndDirection49.mmForeignExchangeDetails, AmountAndDirection48.mmForeignExchangeDetails,
					AmountAndDirection44.mmForeignExchangeDetails, AmountAndDirection45.mmForeignExchangeDetails, AmountAndDirection47.mmForeignExchangeDetails, ReceiveInformation17.mmForeignExchangeDetails,
					ReceiveInformation16.mmForeignExchangeDetails, DeliverInformation16.mmForeignExchangeDetails, DeliverInformation17.mmForeignExchangeDetails, AmountAndDirection66.mmForeignExchangeDetails,
					AmountAndDirection60.mmForeignExchangeDetails, AmountAndDirection71.mmForeignExchangeDetails, AmountAndDirection85.mmForeignExchangeDetails, AmountAndDirection55.mmForeignExchangeDetails,
					AmountAndDirection58.mmForeignExchangeDetails, AmountAndDirection72.mmForeignExchangeDetails, ForeignExchangeSwapTransaction2.mmForeignExchange, SwitchExecution7.mmForeignExchangeDetails,
					SwitchOrder7.mmForeignExchangeDetails, RedemptionOrder14.mmForeignExchangeDetails, SubscriptionExecution13.mmForeignExchangeDetails, SubscriptionExecution12.mmForeignExchangeDetails,
					SubscriptionOrder15.mmForeignExchangeDetails, RedemptionOrder15.mmForeignExchangeDetails, RedemptionExecution16.mmForeignExchangeDetails, SubscriptionOrder14.mmForeignExchangeDetails,
					RedemptionExecution15.mmForeignExchangeDetails, SplitTradeDetails3.mmAgreedRate, ForeignExchangeSwapTransaction3.mmForeignExchange, ReceiveInformation18.mmForeignExchangeDetails,
					DeliverInformation19.mmForeignExchangeDetails, ReceiveInformation19.mmForeignExchangeDetails, DeliverInformation18.mmForeignExchangeDetails, AmountAndDirection87.mmForeignExchangeDetails,
					AmountAndDirection88.mmForeignExchangeDetails, AmountAndDirection89.mmForeignExchangeDetails, AmountAndDirection90.mmForeignExchangeDetails, AmountAndDirection92.mmForeignExchangeDetails,
					AmountAndDirection91.mmForeignExchangeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate between two currencies. The rate is agreed by the trading parties during the negotiation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected Max35Text typeOfProduct;
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
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#mmProductType
	 * TradeData10.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData8#mmProductType
	 * TradeData8.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmProductType
	 * TradeAgreement9.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#mmProductType
	 * TradeData7.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmProductType
	 * TradeAgreement12.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData11#mmProductType
	 * TradeData11.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#mmProductType
	 * TradeAgreement15.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmProductType
	 * TradeData12.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement14#mmProductType
	 * TradeAgreement14.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#mmProductType
	 * TradeData15.mmProductType}</li>
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
	public static final MMBusinessAttribute mmTypeOfProduct = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeData10.mmProductType, TradeData8.mmProductType, TradeAgreement9.mmProductType, TradeData7.mmProductType, TradeAgreement12.mmProductType, TradeData11.mmProductType,
					TradeAgreement15.mmProductType, TradeData12.mmProductType, TradeAgreement14.mmProductType, TradeData15.mmProductType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfProduct";
			definition = "Specifies the type of trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTrade.class.getMethod("getTypeOfProduct", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount buyAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#mmTradingSideBuyAmount
	 * AmountsAndValueDate1.mmTradingSideBuyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmBuyAmount
	 * ForeignExchangeTerms4.mmBuyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmToAmount
	 * ForeignExchangeTerms7.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmToAmount
	 * ForeignExchangeTerms10.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmToAmount
	 * ForeignExchangeTerms26.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmToAmount
	 * ForeignExchangeTerms33.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmTradingSideBuyAmount
	 * FixingConditions1.mmTradingSideBuyAmount}</li>
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
	public static final MMBusinessAttribute mmBuyAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountsAndValueDate1.mmTradingSideBuyAmount, ForeignExchangeTerms4.mmBuyAmount, ForeignExchangeTerms7.mmToAmount, ForeignExchangeTerms10.mmToAmount, ForeignExchangeTerms26.mmToAmount,
					ForeignExchangeTerms33.mmToAmount, FixingConditions1.mmTradingSideBuyAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Currency and amount bought in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTrade.class.getMethod("getBuyAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount sellAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#mmTradingSideSellAmount
	 * AmountsAndValueDate1.mmTradingSideSellAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmSellAmount
	 * ForeignExchangeTerms4.mmSellAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmFromAmount
	 * ForeignExchangeTerms7.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmFromAmount
	 * ForeignExchangeTerms10.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmFromAmount
	 * ForeignExchangeTerms26.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmFromAmount
	 * ForeignExchangeTerms33.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmTradingSideSellAmount
	 * FixingConditions1.mmTradingSideSellAmount}</li>
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
	public static final MMBusinessAttribute mmSellAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountsAndValueDate1.mmTradingSideSellAmount, ForeignExchangeTerms4.mmSellAmount, ForeignExchangeTerms7.mmFromAmount, ForeignExchangeTerms10.mmFromAmount,
					ForeignExchangeTerms26.mmFromAmount, ForeignExchangeTerms33.mmFromAmount, FixingConditions1.mmTradingSideSellAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Currency and amount sold in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTrade.class.getMethod("getSellAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> resultingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
	 * PaymentObligation.mmExchangeRateInformation}</li>
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
	public static final MMBusinessAssociationEnd mmResultingSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingSettlement";
			definition = "Payment of the settlement amount to the account(s) of the final beneficiary. A payment may be settled gross, through split amounts at several agents of the buyer, or netted with several other treasury agreements.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmExchangeRateInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected SecuritiesSettlement currencyExchangeForSecuritiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRelatedForeignExchangeOperation
	 * SecuritiesSettlement.mmRelatedForeignExchangeOperation}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesSettlement";
			definition = "Securities settlement process for which a currency exchange is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmRelatedForeignExchangeOperation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected NonDeliverableTrade openingLegRelatedNonDeliverableTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmOpeningLeg
	 * NonDeliverableTrade.mmOpeningLeg}</li>
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
	public static final MMBusinessAssociationEnd mmOpeningLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which an opening closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmOpeningLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
		}
	};
	protected NonDeliverableTrade closingLegRelatedNonDeliverableTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmClosingLeg
	 * NonDeliverableTrade.mmClosingLeg}</li>
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
	public static final MMBusinessAssociationEnd mmClosingLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which a closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmClosingLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
		}
	};
	protected ForeignExchangeSwap relatedSwap;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#mmSwapLeg
	 * ForeignExchangeSwap.mmSwapLeg}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSwap";
			definition = "FX swap for which the FX trade is one leg.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeSwap.mmSwapLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeSwap.mmObject();
		}
	};
	protected CurrencyOption relatedOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmExercisedOption
	 * CurrencyOption.mmExercisedOption}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option which is executed by one (or more) FX trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmExercisedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}
	};
	protected TaxVoucher currencyExchangeForTaxVoucher;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmForeignExchangeTransaction
	 * TaxVoucher.mmForeignExchangeTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForTaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTaxVoucher";
			definition = "Tax voucher for which currency exchange information is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmForeignExchangeTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	protected DecimalNumber exchangeForwardPoint;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmExchangeForwardPoint
	 * ForeignExchange1.mmExchangeForwardPoint}</li>
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
	 * "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExchangeForwardPoint = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ForeignExchange1.mmExchangeForwardPoint);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeForwardPoint";
			definition = "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTrade.class.getMethod("getExchangeForwardPoint", new Class[]{});
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
				name = "ForeignExchangeTrade";
				definition = "Agreement between two parties in which one party buys a currency and the other party sells a different currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmExchangeRateInformation, com.tools20022.repository.entity.SecuritiesSettlement.mmRelatedForeignExchangeOperation,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade, com.tools20022.repository.entity.TaxVoucher.mmForeignExchangeTransaction,
						com.tools20022.repository.entity.ForeignExchangeSwap.mmSwapLeg, com.tools20022.repository.entity.NonDeliverableTrade.mmOpeningLeg, com.tools20022.repository.entity.NonDeliverableTrade.mmClosingLeg,
						com.tools20022.repository.entity.CurrencyOption.mmExercisedOption);
				derivationElement_lazy = () -> Arrays.asList(SplitTradeDetails1.mmTradeAmounts, OpeningData1.mmTradeAmounts, OpeningData2.mmTradeAmounts, Option10.mmOptionAmounts, SplitTradeDetails3.mmTradeAmounts);
				subType_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NonDeliverableTrade.mmObject());
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate, com.tools20022.repository.entity.ForeignExchangeTrade.mmTypeOfProduct,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmBuyAmount, com.tools20022.repository.entity.ForeignExchangeTrade.mmSellAmount, com.tools20022.repository.entity.ForeignExchangeTrade.mmResultingSettlement,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.mmOpeningLegRelatedNonDeliverableTrade,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmClosingLegRelatedNonDeliverableTrade, com.tools20022.repository.entity.ForeignExchangeTrade.mmRelatedSwap,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmRelatedOption, com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmExchangeForwardPoint);
				derivationComponent_lazy = () -> Arrays.asList(AmountsAndValueDate1.mmObject(), OpeningData1.mmObject(), OpeningData2.mmObject(), Trade3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyExchange getAgreedRate() {
		return agreedRate;
	}

	public ForeignExchangeTrade setAgreedRate(com.tools20022.repository.entity.CurrencyExchange agreedRate) {
		this.agreedRate = Objects.requireNonNull(agreedRate);
		return this;
	}

	public Max35Text getTypeOfProduct() {
		return typeOfProduct;
	}

	public ForeignExchangeTrade setTypeOfProduct(Max35Text typeOfProduct) {
		this.typeOfProduct = Objects.requireNonNull(typeOfProduct);
		return this;
	}

	public CurrencyAndAmount getBuyAmount() {
		return buyAmount;
	}

	public ForeignExchangeTrade setBuyAmount(CurrencyAndAmount buyAmount) {
		this.buyAmount = Objects.requireNonNull(buyAmount);
		return this;
	}

	public CurrencyAndAmount getSellAmount() {
		return sellAmount;
	}

	public ForeignExchangeTrade setSellAmount(CurrencyAndAmount sellAmount) {
		this.sellAmount = Objects.requireNonNull(sellAmount);
		return this;
	}

	public List<PaymentObligation> getResultingSettlement() {
		return resultingSettlement == null ? resultingSettlement = new ArrayList<>() : resultingSettlement;
	}

	public ForeignExchangeTrade setResultingSettlement(List<com.tools20022.repository.entity.PaymentObligation> resultingSettlement) {
		this.resultingSettlement = Objects.requireNonNull(resultingSettlement);
		return this;
	}

	public Optional<SecuritiesSettlement> getCurrencyExchangeForSecuritiesSettlement() {
		return currencyExchangeForSecuritiesSettlement == null ? Optional.empty() : Optional.of(currencyExchangeForSecuritiesSettlement);
	}

	public ForeignExchangeTrade setCurrencyExchangeForSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement currencyExchangeForSecuritiesSettlement) {
		this.currencyExchangeForSecuritiesSettlement = currencyExchangeForSecuritiesSettlement;
		return this;
	}

	public Optional<NonDeliverableTrade> getOpeningLegRelatedNonDeliverableTrade() {
		return openingLegRelatedNonDeliverableTrade == null ? Optional.empty() : Optional.of(openingLegRelatedNonDeliverableTrade);
	}

	public ForeignExchangeTrade setOpeningLegRelatedNonDeliverableTrade(com.tools20022.repository.entity.NonDeliverableTrade openingLegRelatedNonDeliverableTrade) {
		this.openingLegRelatedNonDeliverableTrade = openingLegRelatedNonDeliverableTrade;
		return this;
	}

	public Optional<NonDeliverableTrade> getClosingLegRelatedNonDeliverableTrade() {
		return closingLegRelatedNonDeliverableTrade == null ? Optional.empty() : Optional.of(closingLegRelatedNonDeliverableTrade);
	}

	public ForeignExchangeTrade setClosingLegRelatedNonDeliverableTrade(com.tools20022.repository.entity.NonDeliverableTrade closingLegRelatedNonDeliverableTrade) {
		this.closingLegRelatedNonDeliverableTrade = closingLegRelatedNonDeliverableTrade;
		return this;
	}

	public Optional<ForeignExchangeSwap> getRelatedSwap() {
		return relatedSwap == null ? Optional.empty() : Optional.of(relatedSwap);
	}

	public ForeignExchangeTrade setRelatedSwap(com.tools20022.repository.entity.ForeignExchangeSwap relatedSwap) {
		this.relatedSwap = relatedSwap;
		return this;
	}

	public Optional<CurrencyOption> getRelatedOption() {
		return relatedOption == null ? Optional.empty() : Optional.of(relatedOption);
	}

	public ForeignExchangeTrade setRelatedOption(com.tools20022.repository.entity.CurrencyOption relatedOption) {
		this.relatedOption = relatedOption;
		return this;
	}

	public Optional<TaxVoucher> getCurrencyExchangeForTaxVoucher() {
		return currencyExchangeForTaxVoucher == null ? Optional.empty() : Optional.of(currencyExchangeForTaxVoucher);
	}

	public ForeignExchangeTrade setCurrencyExchangeForTaxVoucher(com.tools20022.repository.entity.TaxVoucher currencyExchangeForTaxVoucher) {
		this.currencyExchangeForTaxVoucher = currencyExchangeForTaxVoucher;
		return this;
	}

	public Optional<DecimalNumber> getExchangeForwardPoint() {
		return exchangeForwardPoint == null ? Optional.empty() : Optional.of(exchangeForwardPoint);
	}

	public ForeignExchangeTrade setExchangeForwardPoint(DecimalNumber exchangeForwardPoint) {
		this.exchangeForwardPoint = exchangeForwardPoint;
		return this;
	}
}