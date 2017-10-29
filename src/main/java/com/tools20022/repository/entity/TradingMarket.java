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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.MarketTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Market;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Context or geographic environment in which trading parties may meet in order
 * to negotiate and execute trades among themselves. It also identifies the
 * primary market where an asset is issued.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradingMarket" src="doc-files/TradingMarket.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradedSecurity
 * TradingMarket.TradedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#Type
 * TradingMarket.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurity
 * TradingMarket.ListedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#SourceOfPrice
 * TradingMarket.SourceOfPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#TradeLotSize
 * TradingMarket.TradeLotSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MinimumTradedNominalQuantity
 * TradingMarket.MinimumTradedNominalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#ListingDate
 * TradingMarket.ListingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#RelatedOrder
 * TradingMarket.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradingCurrency
 * TradingMarket.TradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MaximumTradedNominalQuantity
 * TradingMarket.MaximumTradedNominalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#StockExchange
 * TradingMarket.StockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#QuoteLot
 * TradingMarket.QuoteLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#RoundLot
 * TradingMarket.RoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradingSession
 * TradingMarket.TradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurityTradingIdentification
 * TradingMarket.ListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#DefaultCurrency
 * TradingMarket.DefaultCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#FirstTradingDate
 * TradingMarket.FirstTradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#LastTradingDate
 * TradingMarket.LastTradingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#Issuance
 * TradingMarket.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#RelatedPlaceOfSettlement
 * TradingMarket.RelatedPlaceOfSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#TradingMarket
 * Security.TradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
 * Security.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ApplicableTradingMarket
 * SecuritiesIdentification.ApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumTradedQuantityMarket
 * SecuritiesQuantity.MinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumTradedQuantityMarket
 * SecuritiesQuantity.MaximumTradedQuantityMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#TradeLotMarket
 * LotBreakdown.TradeLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#QuoteLotMarket
 * LotBreakdown.QuoteLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#RoundLotMarket
 * LotBreakdown.RoundLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuePlace
 * Issuance.IssuePlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#MarketIdentification
 * SourceOfPrice.MarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PlaceOfTrade
 * SecuritiesOrder.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#Market
 * TradingSession.Market}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#SettlementMarket
 * PlaceOfSettlement.SettlementMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StockExchange#Market
 * StockExchange.Market}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification4#Identification
 * MarketIdentification4.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification5#Identification
 * MarketIdentification5.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification8#Identification
 * MarketIdentification8.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification2#Identification
 * MarketIdentification2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification7#Identification
 * MarketIdentification7.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification9#Identification
 * MarketIdentification9.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification6#Identification
 * MarketIdentification6.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification10#Identification
 * MarketIdentification10.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification13#Identification
 * MarketIdentification13.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartialFill1#PlaceOfTrade
 * PartialFill1.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#PlaceOfTrade
 * RedemptionBulkOrder3.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#PlaceOfTrade
 * RedemptionBulkOrder4.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#PlaceOfTrade
 * RedemptionMultipleExecution3.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#PlaceOfTrade
 * RedemptionMultipleOrder4.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#PlaceOfTrade
 * SubscriptionBulkOrder3.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#PlaceOfTrade
 * SubscriptionBulkExecution3.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#PlaceOfTrade
 * SubscriptionBulkOrder4.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#PlaceOfTrade
 * SubscriptionMultipleOrder3.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#PlaceOfTrade
 * SubscriptionMultipleExecution3.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#PlaceOfTrade
 * SubscriptionMultipleOrder4.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification20#Identification
 * MarketIdentification20.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#PlaceOfTrade
 * SettlementObligation2.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#PlaceOfTrade
 * SettlementObligation4.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification21#Identification
 * MarketIdentification21.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#PlaceOfTrade
 * TradeLeg2.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#PlaceOfTrade
 * TradeLeg5.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#PlaceOfTrade
 * TradeLeg1.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#PlaceOfTrade
 * TradeLeg3.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#PlaceOfTrade
 * TradeLeg6.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#PlaceOfTrade
 * TradeLeg4.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#PlaceOfTrade
 * TradeLeg7.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#PlaceOfTrade
 * RedemptionMultipleOrder5.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#PlaceOfTrade
 * RedemptionMultipleExecution4.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#PlaceOfTrade
 * SubscriptionMultipleOrder5.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#PlaceOfTrade
 * SubscriptionMultipleExecution4.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification3#Identification
 * MarketIdentification3.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification78#Identification
 * MarketIdentification78.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification79#Identification
 * MarketIdentification79.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification80#Identification
 * MarketIdentification80.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification82#Identification
 * MarketIdentification82.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#PlaceOfTrade
 * TradeLeg8.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification84#Identification
 * MarketIdentification84.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#PlaceOfTrade
 * TradeLeg10.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification85#Identification
 * MarketIdentification85.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#PlaceOfTrade
 * TradeLeg9.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#PlaceOfTrade
 * SettlementObligation8.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradeVenue
 * SecuritiesTransaction1.TradeVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification89#Identification
 * MarketIdentification89.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification90#Identification
 * MarketIdentification90.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification91#Identification
 * MarketIdentification91.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecution7#PlaceOfTrade
 * SwitchExecution7.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#PlaceOfTrade
 * SubscriptionBulkOrder5.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#PlaceOfTrade
 * RedemptionMultipleExecution5.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#PlaceOfTrade
 * RedemptionMultipleOrder6.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#PlaceOfTrade
 * SubscriptionMultipleOrder6.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#PlaceOfTrade
 * SubscriptionBulkExecution4.PlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder7#PlaceOfTrade
 * SwitchOrder7.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#PlaceOfTrade
 * RedemptionBulkOrder6.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#PlaceOfTrade
 * SubscriptionMultipleExecution5.PlaceOfTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex
 * LocalMarketAnnex}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
 * LocalMarketAnnex2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification1Choice
 * MarketIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType3Choice
 * MarketType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification4
 * MarketIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType2Choice
 * MarketType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification5
 * MarketIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification3Choice
 * MarketIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification2Choice
 * MarketIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType6Choice
 * MarketType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification8
 * MarketIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification4Choice
 * MarketIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketTypeFormat1Choice
 * MarketTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification2
 * MarketIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketTypeFormat2Choice
 * MarketTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification7
 * MarketIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType5Choice
 * MarketType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification9
 * MarketIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType4Choice
 * MarketType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification6
 * MarketIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType7Choice
 * MarketType7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification10
 * MarketIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification1
 * MarketIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType11Choice
 * MarketType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification77
 * MarketIdentification77}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType12Choice
 * MarketType12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification13
 * MarketIdentification13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice
 * PlaceOfTradeIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice
 * PlaceOfTradeIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType8Choice
 * MarketType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification20
 * MarketIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType9Choice
 * MarketType9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification21
 * MarketIdentification21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice
 * PlaceOfTradeIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingParameters1
 * TradingParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType1Choice
 * MarketType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification3
 * MarketIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification78
 * MarketIdentification78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification79
 * MarketIdentification79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification80
 * MarketIdentification80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification82
 * MarketIdentification82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification84
 * MarketIdentification84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification85
 * MarketIdentification85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
 * TradingVenueAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification89
 * MarketIdentification89}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType15Choice
 * MarketType15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification90
 * MarketIdentification90}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType16Choice
 * MarketType16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType17Choice
 * MarketType17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification91
 * MarketIdentification91}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketDetail2 MarketDetail2}</li>
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
 * "TradingMarket"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued."
 * </li>
 * </ul>
 */
public class TradingMarket extends Market {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security which is traded on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#TradingMarket
	 * Security.TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is traded on a specific market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradedSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradedSecurity";
			definition = "Security which is traded on a specific market.";
			minOccurs = 0;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.TradingMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Nature of a market in which transactions take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType3Choice#Code
	 * MarketType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType3Choice#Proprietary
	 * MarketType3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification4#Type
	 * MarketIdentification4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType2Choice#Code
	 * MarketType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType2Choice#Proprietary
	 * MarketType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification5#Type
	 * MarketIdentification5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType6Choice#Code
	 * MarketType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType6Choice#Proprietary
	 * MarketType6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification8#Type
	 * MarketIdentification8.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat1Choice#Code
	 * MarketTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat1Choice#Proprietary
	 * MarketTypeFormat1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification2#Type
	 * MarketIdentification2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat2Choice#Code
	 * MarketTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat2Choice#Proprietary
	 * MarketTypeFormat2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification7#Type
	 * MarketIdentification7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType5Choice#Code
	 * MarketType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType5Choice#Proprietary
	 * MarketType5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification9#Type
	 * MarketIdentification9.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType4Choice#Code
	 * MarketType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType4Choice#Proprietary
	 * MarketType4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification6#Type
	 * MarketIdentification6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType7Choice#Code
	 * MarketType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType7Choice#Proprietary
	 * MarketType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification10#Type
	 * MarketIdentification10.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification1#Type
	 * MarketIdentification1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType11Choice#Code
	 * MarketType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType11Choice#Proprietary
	 * MarketType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification77#Type
	 * MarketIdentification77.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType12Choice#Code
	 * MarketType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType12Choice#Proprietary
	 * MarketType12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification13#Type
	 * MarketIdentification13.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType8Choice#Code
	 * MarketType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType8Choice#Proprietary
	 * MarketType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification20#Type
	 * MarketIdentification20.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType9Choice#Code
	 * MarketType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType9Choice#Proprietary
	 * MarketType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification21#Type
	 * MarketIdentification21.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType1Choice#Code
	 * MarketType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType1Choice#Proprietary
	 * MarketType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification3#Type
	 * MarketIdentification3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification78#Type
	 * MarketIdentification78.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification79#Type
	 * MarketIdentification79.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification80#Type
	 * MarketIdentification80.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification82#Type
	 * MarketIdentification82.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification84#Type
	 * MarketIdentification84.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification85#Type
	 * MarketIdentification85.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification89#Type
	 * MarketIdentification89.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType15Choice#Code
	 * MarketType15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType15Choice#Proprietary
	 * MarketType15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification90#Type
	 * MarketIdentification90.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType16Choice#Code
	 * MarketType16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType16Choice#Proprietary
	 * MarketType16Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.MarketType17Choice#Code
	 * MarketType17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType17Choice#Proprietary
	 * MarketType17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification91#Type
	 * MarketIdentification91.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#Category
	 * MarketIdentification92.Category}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of a market in which transactions take place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarketType3Choice.Code, com.tools20022.repository.choice.MarketType3Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification4.Type,
					com.tools20022.repository.choice.MarketType2Choice.Code, com.tools20022.repository.choice.MarketType2Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification5.Type,
					com.tools20022.repository.choice.MarketType6Choice.Code, com.tools20022.repository.choice.MarketType6Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification8.Type,
					com.tools20022.repository.choice.MarketTypeFormat1Choice.Code, com.tools20022.repository.choice.MarketTypeFormat1Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification2.Type,
					com.tools20022.repository.choice.MarketTypeFormat2Choice.Code, com.tools20022.repository.choice.MarketTypeFormat2Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification7.Type,
					com.tools20022.repository.choice.MarketType5Choice.Code, com.tools20022.repository.choice.MarketType5Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification9.Type,
					com.tools20022.repository.choice.MarketType4Choice.Code, com.tools20022.repository.choice.MarketType4Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification6.Type,
					com.tools20022.repository.choice.MarketType7Choice.Code, com.tools20022.repository.choice.MarketType7Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification10.Type,
					com.tools20022.repository.msg.MarketIdentification1.Type, com.tools20022.repository.choice.MarketType11Choice.Code, com.tools20022.repository.choice.MarketType11Choice.Proprietary,
					com.tools20022.repository.msg.MarketIdentification77.Type, com.tools20022.repository.choice.MarketType12Choice.Code, com.tools20022.repository.choice.MarketType12Choice.Proprietary,
					com.tools20022.repository.msg.MarketIdentification13.Type, com.tools20022.repository.choice.MarketType8Choice.Code, com.tools20022.repository.choice.MarketType8Choice.Proprietary,
					com.tools20022.repository.msg.MarketIdentification20.Type, com.tools20022.repository.choice.MarketType9Choice.Code, com.tools20022.repository.choice.MarketType9Choice.Proprietary,
					com.tools20022.repository.msg.MarketIdentification21.Type, com.tools20022.repository.choice.MarketType1Choice.Code, com.tools20022.repository.choice.MarketType1Choice.Proprietary,
					com.tools20022.repository.msg.MarketIdentification3.Type, com.tools20022.repository.msg.MarketIdentification78.Type, com.tools20022.repository.msg.MarketIdentification79.Type,
					com.tools20022.repository.msg.MarketIdentification80.Type, com.tools20022.repository.msg.MarketIdentification82.Type, com.tools20022.repository.msg.MarketIdentification84.Type,
					com.tools20022.repository.msg.MarketIdentification85.Type, com.tools20022.repository.msg.MarketIdentification89.Type, com.tools20022.repository.choice.MarketType15Choice.Code,
					com.tools20022.repository.choice.MarketType15Choice.Proprietary, com.tools20022.repository.msg.MarketIdentification90.Type, com.tools20022.repository.choice.MarketType16Choice.Code,
					com.tools20022.repository.choice.MarketType16Choice.Proprietary, com.tools20022.repository.choice.MarketType17Choice.Code, com.tools20022.repository.choice.MarketType17Choice.Proprietary,
					com.tools20022.repository.msg.MarketIdentification91.Type, com.tools20022.repository.msg.MarketIdentification92.Category);
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of a market in which transactions take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarketTypeCode.mmObject();
		}
	};
	/**
	 * Security whch is listed on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
	 * Security.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security whch is listed on a specific market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ListedSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListedSecurity";
			definition = "Security whch is listed on a specific market.";
			minOccurs = 0;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.PlaceOfListing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which provides a price on a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#MarketIdentification
	 * SourceOfPrice.MarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SourceOfPrice
	 * SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which provides a price on a market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SourceOfPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfPrice";
			definition = "Party which provides a price on a market.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.MarketIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the number of securities that have to be traded in one lot .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#TradeLotMarket
	 * LotBreakdown.TradeLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#TradeLotSize
	 * FinancialInstrumentAttributes1.TradeLotSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#TradeLotSize
	 * TradingParameters1.TradeLotSize}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLotSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of securities that have to be traded in one lot ."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeLotSize = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.TradeLotSize, com.tools20022.repository.msg.TradingParameters1.TradeLotSize);
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeLotSize";
			definition = "Specifies the number of securities that have to be traded in one lot .";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.TradeLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumTradedQuantityMarket
	 * SecuritiesQuantity.MinimumTradedQuantityMarket}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#MinimumTradedNominalQuantity
	 * FinancialInstrumentAttributes1.MinimumTradedNominalQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#MinimumQuantity
	 * Debt2.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#MinimumTradedNominalQuantity
	 * TradingParameters1.MinimumTradedNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.MinimumTradedNominalQuantity, com.tools20022.repository.msg.Debt2.MinimumQuantity,
					com.tools20022.repository.msg.TradingParameters1.MinimumTradedNominalQuantity);
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedNominalQuantity";
			definition = "Minimum number of securities that can be traded.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time at which the security is listed at the specific exchange.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#ListingDate
	 * FinancialInstrumentAttributes1.ListingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#ListingDate
	 * CommonFinancialInstrumentAttributes1.ListingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the security is listed at the specific exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ListingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.ListingDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.ListingDate);
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListingDate";
			definition = "Date/time at which the security is listed at the specific exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Order for which a place of trade is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#PlaceOfTrade
	 * SecuritiesOrder.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a place of trade is requested."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a place of trade is requested.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency of the trading.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#TradingCurrency
	 * SettlementObligation3.TradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#TradingCurrency
	 * SettlementObligation5.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#TradingCurrency
	 * TradeLeg2.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#TradingCurrency
	 * TradeLeg5.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#TradingCurrency
	 * TradeLeg1.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#TradingCurrency
	 * TradeLeg3.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#TradingCurrency
	 * TradeLeg6.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#TradingCurrency
	 * TradeLeg4.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#TradingCurrency
	 * TradeLeg7.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#TradingCurrency
	 * TradeLeg8.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#TradingCurrency
	 * TradeLeg10.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#TradingCurrency
	 * TradeLeg9.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade2#TradingCurrency
	 * Trade2.TradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade1#TradingCurrency
	 * Trade1.TradingCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementObligation3.TradingCurrency, com.tools20022.repository.msg.SettlementObligation5.TradingCurrency,
					com.tools20022.repository.msg.TradeLeg2.TradingCurrency, com.tools20022.repository.msg.TradeLeg5.TradingCurrency, com.tools20022.repository.msg.TradeLeg1.TradingCurrency,
					com.tools20022.repository.msg.TradeLeg3.TradingCurrency, com.tools20022.repository.msg.TradeLeg6.TradingCurrency, com.tools20022.repository.msg.TradeLeg4.TradingCurrency,
					com.tools20022.repository.msg.TradeLeg7.TradingCurrency, com.tools20022.repository.msg.TradeLeg8.TradingCurrency, com.tools20022.repository.msg.TradeLeg10.TradingCurrency,
					com.tools20022.repository.msg.TradeLeg9.TradingCurrency, com.tools20022.repository.msg.Trade2.TradingCurrency, com.tools20022.repository.msg.Trade1.TradingCurrency);
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Miaximum number of securities that can be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumTradedQuantityMarket
	 * SecuritiesQuantity.MaximumTradedQuantityMarket}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#MaximumTradedNominalQuantity
	 * TradingParameters1.MaximumTradedNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Miaximum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradingParameters1.MaximumTradedNominalQuantity);
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedNominalQuantity";
			definition = "Miaximum number of securities that can be traded.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Stock exchange which operates on a specific market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StockExchange#Market
	 * StockExchange.Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StockExchange
	 * StockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock exchange which operates on a specific market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StockExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Stock exchange which operates on a specific market.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.StockExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StockExchange.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lot size associated with the price. Most exchanges require that pricing
	 * be quoted in round lot size. However, some exchanges have pricing quoted
	 * in many different lot sizes, for example, Latin America, some Asian
	 * markets, Turkey.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#QuoteLotMarket
	 * LotBreakdown.QuoteLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd QuoteLot = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteLot";
			definition = "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum quantity of securities that can be purchased without incurring a
	 * larger fee. For example, if the round lot size is 100 and the trade is
	 * for 125 shares, then 100 will be processed without a fee and the
	 * remaining 25 will incur a service fee for being an odd lot size.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#RoundLotMarket
	 * LotBreakdown.RoundLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#RoundLot
	 * TradingParameters1.RoundLot}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RoundLot = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradingParameters1.RoundLot);
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundLot";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.RoundLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trading session associated with a market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#Market
	 * TradingSession.Market}</li>
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
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading session associated with a market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradingSession = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session associated with a market.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trading identification used on this trading market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ApplicableTradingMarket
	 * SecuritiesIdentification.ApplicableTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListedSecurityTradingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading identification used on this trading market."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ListedSecurityTradingIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListedSecurityTradingIdentification";
			definition = "Trading identification used on this trading market.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Default currency for the securities trading on this market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default currency for the securities trading on this market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DefaultCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultCurrency";
			definition = "Default currency for the securities trading on this market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * First date/time at which the security is eligible for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date/time at which the security is eligible for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstTradingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstTradingDate";
			definition = "First date/time at which the security is eligible for trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Last date/time at which the security is eligible for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time at which the security is eligible for trading."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LastTradingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Last date/time at which the security is eligible for trading.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Issuance for which the place has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssuePlace
	 * Issuance.IssuePlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which the place has been defined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the place has been defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssuePlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place of settlement for which a settlement market is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#SettlementMarket
	 * PlaceOfSettlement.SettlementMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PlaceOfSettlement
	 * PlaceOfSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPlaceOfSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of settlement for which a settlement market is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPlaceOfSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TradingMarket.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPlaceOfSettlement";
			definition = "Place of settlement for which a settlement market is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PlaceOfSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PlaceOfSettlement.SettlementMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingMarket";
				definition = "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.TradingMarket, com.tools20022.repository.entity.Security.PlaceOfListing,
						com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket, com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket, com.tools20022.repository.entity.LotBreakdown.TradeLotMarket, com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket,
						com.tools20022.repository.entity.LotBreakdown.RoundLotMarket, com.tools20022.repository.entity.Issuance.IssuePlace, com.tools20022.repository.entity.SourceOfPrice.MarketIdentification,
						com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade, com.tools20022.repository.entity.TradingSession.Market, com.tools20022.repository.entity.PlaceOfSettlement.SettlementMarket,
						com.tools20022.repository.entity.StockExchange.Market);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarketIdentification4.Identification, com.tools20022.repository.msg.MarketIdentification5.Identification,
						com.tools20022.repository.msg.MarketIdentification8.Identification, com.tools20022.repository.msg.MarketIdentification2.Identification, com.tools20022.repository.msg.MarketIdentification7.Identification,
						com.tools20022.repository.msg.MarketIdentification9.Identification, com.tools20022.repository.msg.MarketIdentification6.Identification, com.tools20022.repository.msg.MarketIdentification10.Identification,
						com.tools20022.repository.msg.MarketIdentification13.Identification, com.tools20022.repository.msg.PartialFill1.PlaceOfTrade, com.tools20022.repository.msg.RedemptionBulkOrder3.PlaceOfTrade,
						com.tools20022.repository.msg.RedemptionBulkOrder4.PlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleExecution3.PlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleOrder4.PlaceOfTrade,
						com.tools20022.repository.msg.SubscriptionBulkOrder3.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionBulkExecution3.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionBulkOrder4.PlaceOfTrade,
						com.tools20022.repository.msg.SubscriptionMultipleOrder3.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionMultipleExecution3.PlaceOfTrade,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.PlaceOfTrade, com.tools20022.repository.msg.MarketIdentification20.Identification, com.tools20022.repository.msg.SettlementObligation2.PlaceOfTrade,
						com.tools20022.repository.msg.SettlementObligation4.PlaceOfTrade, com.tools20022.repository.msg.MarketIdentification21.Identification, com.tools20022.repository.msg.TradeLeg2.PlaceOfTrade,
						com.tools20022.repository.msg.TradeLeg5.PlaceOfTrade, com.tools20022.repository.msg.TradeLeg1.PlaceOfTrade, com.tools20022.repository.msg.TradeLeg3.PlaceOfTrade, com.tools20022.repository.msg.TradeLeg6.PlaceOfTrade,
						com.tools20022.repository.msg.TradeLeg4.PlaceOfTrade, com.tools20022.repository.msg.TradeLeg7.PlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleOrder5.PlaceOfTrade,
						com.tools20022.repository.msg.RedemptionMultipleExecution4.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionMultipleOrder5.PlaceOfTrade,
						com.tools20022.repository.msg.SubscriptionMultipleExecution4.PlaceOfTrade, com.tools20022.repository.msg.MarketIdentification3.Identification, com.tools20022.repository.msg.MarketIdentification78.Identification,
						com.tools20022.repository.msg.MarketIdentification79.Identification, com.tools20022.repository.msg.MarketIdentification80.Identification, com.tools20022.repository.msg.MarketIdentification82.Identification,
						com.tools20022.repository.msg.TradeLeg8.PlaceOfTrade, com.tools20022.repository.msg.MarketIdentification84.Identification, com.tools20022.repository.msg.TradeLeg10.PlaceOfTrade,
						com.tools20022.repository.msg.MarketIdentification85.Identification, com.tools20022.repository.msg.TradeLeg9.PlaceOfTrade, com.tools20022.repository.msg.SettlementObligation8.PlaceOfTrade,
						com.tools20022.repository.msg.SecuritiesTransaction1.TradeVenue, com.tools20022.repository.msg.MarketIdentification89.Identification, com.tools20022.repository.msg.MarketIdentification90.Identification,
						com.tools20022.repository.msg.MarketIdentification91.Identification, com.tools20022.repository.msg.SwitchExecution7.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionBulkOrder5.PlaceOfTrade,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.PlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleOrder6.PlaceOfTrade, com.tools20022.repository.msg.SubscriptionMultipleOrder6.PlaceOfTrade,
						com.tools20022.repository.msg.SubscriptionBulkExecution4.PlaceOfTrade, com.tools20022.repository.msg.SwitchOrder7.PlaceOfTrade, com.tools20022.repository.msg.RedemptionBulkOrder6.PlaceOfTrade,
						com.tools20022.repository.msg.SubscriptionMultipleExecution5.PlaceOfTrade);
				superType_lazy = () -> Market.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.TradedSecurity, com.tools20022.repository.entity.TradingMarket.Type, com.tools20022.repository.entity.TradingMarket.ListedSecurity,
						com.tools20022.repository.entity.TradingMarket.SourceOfPrice, com.tools20022.repository.entity.TradingMarket.TradeLotSize, com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.ListingDate, com.tools20022.repository.entity.TradingMarket.RelatedOrder, com.tools20022.repository.entity.TradingMarket.TradingCurrency,
						com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity, com.tools20022.repository.entity.TradingMarket.StockExchange, com.tools20022.repository.entity.TradingMarket.QuoteLot,
						com.tools20022.repository.entity.TradingMarket.RoundLot, com.tools20022.repository.entity.TradingMarket.TradingSession, com.tools20022.repository.entity.TradingMarket.ListedSecurityTradingIdentification,
						com.tools20022.repository.entity.TradingMarket.DefaultCurrency, com.tools20022.repository.entity.TradingMarket.FirstTradingDate, com.tools20022.repository.entity.TradingMarket.LastTradingDate,
						com.tools20022.repository.entity.TradingMarket.Issuance, com.tools20022.repository.entity.TradingMarket.RelatedPlaceOfSettlement);
				derivationComponent_lazy = () -> Arrays.asList(LocalMarketAnnex.mmObject(), LocalMarketAnnex2.mmObject(), MarketIdentification1Choice.mmObject(), MarketType3Choice.mmObject(), MarketIdentification4.mmObject(),
						MarketType2Choice.mmObject(), MarketIdentification5.mmObject(), MarketIdentification3Choice.mmObject(), MarketIdentification2Choice.mmObject(), MarketType6Choice.mmObject(), MarketIdentification8.mmObject(),
						MarketIdentification4Choice.mmObject(), MarketTypeFormat1Choice.mmObject(), MarketIdentification2.mmObject(), MarketTypeFormat2Choice.mmObject(), MarketIdentification7.mmObject(), MarketType5Choice.mmObject(),
						MarketIdentification9.mmObject(), MarketType4Choice.mmObject(), MarketIdentification6.mmObject(), MarketType7Choice.mmObject(), MarketIdentification10.mmObject(), MarketIdentification1.mmObject(),
						MarketType11Choice.mmObject(), MarketIdentification77.mmObject(), MarketType12Choice.mmObject(), MarketIdentification13.mmObject(), PlaceOfTradeIdentification1Choice.mmObject(),
						PlaceOfTradeIdentification2Choice.mmObject(), MarketType8Choice.mmObject(), MarketIdentification20.mmObject(), MarketType9Choice.mmObject(), MarketIdentification21.mmObject(),
						PlaceOfTradeIdentification3Choice.mmObject(), TradingParameters1.mmObject(), MarketType1Choice.mmObject(), MarketIdentification3.mmObject(), MarketIdentification78.mmObject(), MarketIdentification79.mmObject(),
						MarketIdentification80.mmObject(), MarketIdentification82.mmObject(), MarketIdentification84.mmObject(), MarketIdentification85.mmObject(), TradingVenueAttributes1.mmObject(), MarketIdentification89.mmObject(),
						MarketType15Choice.mmObject(), MarketIdentification90.mmObject(), MarketType16Choice.mmObject(), MarketType17Choice.mmObject(), MarketIdentification91.mmObject(), MarketDetail2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}