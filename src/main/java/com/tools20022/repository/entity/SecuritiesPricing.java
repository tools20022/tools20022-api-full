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
import com.tools20022.repository.codeset.AmountPriceTypeCode;
import com.tools20022.repository.codeset.PriceMethodCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics related to the price of the security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesPricing" src="doc-files/SecuritiesPricing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceMethod
 * SecuritiesPricing.PriceMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceType
 * SecuritiesPricing.PriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CumDividendIndicator
 * SecuritiesPricing.CumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CalculationBasis
 * SecuritiesPricing.CalculationBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRelatedStatistics
 * SecuritiesPricing.PriceChangeRelatedStatistics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Rate
 * SecuritiesPricing.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#HighestPriceValueRelatedStatistics
 * SecuritiesPricing.HighestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LowestPriceValueRelatedStatistics
 * SecuritiesPricing.LowestPriceValueRelatedStatistics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Security
 * SecuritiesPricing.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTradeExecution
 * SecuritiesPricing.SecuritiesTradeExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Yielded
 * SecuritiesPricing.Yielded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TypeOfRate
 * SecuritiesPricing.TypeOfRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Derivative
 * SecuritiesPricing.Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedWarrant
 * SecuritiesPricing.RelatedWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesConversion
 * SecuritiesPricing.RelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LotBreakdown
 * SecuritiesPricing.LotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TypeOfAmount
 * SecuritiesPricing.TypeOfAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ExercisePriceRelatedEvent
 * SecuritiesPricing.ExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerFinancialInstrumentQuantity
 * SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerAmount
 * SecuritiesPricing.AmountPricePerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceCalculationPeriod
 * SecuritiesPricing.PriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#OverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashValueForTaxRelatedEvent
 * SecuritiesPricing.CashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MaximumPriceBiddingConditions
 * SecuritiesPricing.MaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MinimumPriceBiddingConditions
 * SecuritiesPricing.MinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#QuotationDate
 * SecuritiesPricing.QuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#YieldCalculation
 * SecuritiesPricing.YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesFinancing
 * SecuritiesPricing.RelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToExecutedPrice
 * SecuritiesPricing.FundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToInformativePrice
 * SecuritiesPricing.FundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TaxVoucher
 * SecuritiesPricing.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTrade
 * SecuritiesPricing.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#NetAssetValueCalculation
 * SecuritiesPricing.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedBuyIn
 * SecuritiesPricing.RelatedBuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Index
 * SecuritiesPricing.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#InformationPartyRole
 * SecuritiesPricing.InformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceFactPeriod
 * SecuritiesPricing.PriceFactPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AnalyticsCalculation
 * SecuritiesPricing.AnalyticsCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#DurationCalculation
 * SecuritiesPricing.DurationCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LifeCalculation
 * SecuritiesPricing.LifeCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Date
 * SecuritiesPricing.Date}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Spread
 * SecuritiesPricing.Spread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Order
 * SecuritiesPricing.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#StopPriceOrder
 * SecuritiesPricing.StopPriceOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Allocation
 * SecuritiesPricing.Allocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedOrder
 * SecuritiesPricing.RelatedOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Issuance
 * SecuritiesPricing.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Entitlement
 * SecuritiesPricing.Entitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashFractionsPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SuscriptionPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ReinvestmentPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedFuture
 * SecuritiesPricing.RelatedFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Distribution
 * SecuritiesPricing.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceChangeRedemptionSchedule
 * SecuritiesPricing.PriceChangeRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedRedemptionSchedule
 * SecuritiesPricing.RelatedRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PreviousClosingPriceRelatedQuote
 * SecuritiesPricing.PreviousClosingPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RequestedPriceRelatedQuote
 * SecuritiesPricing.RequestedPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#PriceRelatedQuote
 * SecuritiesPricing.PriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MarketPriceRelatedQuote
 * SecuritiesPricing.MarketPriceRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Price
 * SecuritiesPricing.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedCorporateActionPrice
 * SecuritiesPricing.RelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedPosition
 * SecuritiesPricing.RelatedPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Pricing
 * Security.Pricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole#Price
 * InformationPartyRole.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Price
 * NetAssetValueCalculation.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PriceChange
 * RedemptionSchedule.PriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#Price
 * RedemptionSchedule.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceCalculationRelatedPricing
 * DateTimePeriod.PriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceFactRelatedPricing
 * DateTimePeriod.PriceFactRelatedPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradePrice
 * SecuritiesTrade.TradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedTradePrice
 * InvestmentFundOrderExecution.ExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InformativePrice
 * InvestmentFundOrderExecution.InformativePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotPrice
 * LotBreakdown.LotPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#SecuritiesPricing
 * Price.SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#PriceChange
 * ValuationStatistics.PriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#HighestPriceValue
 * ValuationStatistics.HighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#LowestPriceValue
 * ValuationStatistics.LowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealPrice
 * SecuritiesTradeExecution.DealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#Tick
 * Derivative.Tick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#ExercisePrice
 * Derivative.ExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#OriginalIssueDiscount
 * Issuance.OriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#SecuritiesPricing
 * Index.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#SubscriptionPrice
 * Warrant.SubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPrice
 * SecuritiesConversion.ConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#EndPrice
 * SecuritiesFinancing.EndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumPrice
 * BiddingConditions.MaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumPrice
 * BiddingConditions.MinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ScripDividendReinvestmentPricePerShare
 * TaxVoucher.ScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionExercisePrice
 * CorporateActionPrice.CorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPriceReceivedPerProduct
 * CorporateActionPrice.GenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPricePaidPerProduct
 * CorporateActionPrice.GenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashInLieuOfSharePrice
 * CorporateActionPrice.CashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#OverSubscriptionDepositPrice
 * CorporateActionPrice.OverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashValueForTax
 * CorporateActionPrice.CashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#PricingCalculation
 * CorporateActionPrice.PricingCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#SecuritiesPricing
 * AmountAndQuantity.SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRatio#SecuritiesPricing
 * AmountRatio.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#BenchmarkPrice
 * Spread.BenchmarkPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderPrice
 * SecuritiesOrder.OrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#StopPrice
 * SecuritiesOrder.StopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#RedemptionPrice
 * YieldCalculation.RedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#AllocatedPrice
 * Allocation.AllocatedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#OfferPrice
 * Distribution.OfferPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#BuyInPrice
 * BuyIn.BuyInPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PreviousClosingPrice
 * SecuritiesOrderParameters.PreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#PreviousClosingPrice
 * Quote.PreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#RequestedPrice
 * Quote.RequestedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#Price Quote.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#MarketPrice
 * Quote.MarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#CashFractionsPrice
 * SecuritiesDistribution.CashFractionsPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SubscriptionPrice
 * SecuritiesDistribution.SubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentPrice
 * SecuritiesDistribution.ReinvestmentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#SecuritiesPricing
 * AnalyticsCalculation.SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#RelatedSecuritiesPricing
 * DurationCalculation.RelatedSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#SecuritiesPricing
 * LifeCalculation.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#StrikePrice
 * Entitlement.StrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#Price
 * Position.Price}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Price2#Value Price2.Value}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType1Choice#Market
 * PriceType1Choice.Market}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType1Choice#Indicative
 * PriceType1Choice.Indicative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price3#Value Price3.Value}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType2Choice#Market
 * PriceType2Choice.Market}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType2Choice#Indicative
 * PriceType2Choice.Indicative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation5#Value
 * PriceInformation5.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation7#Value
 * PriceInformation7.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation1#Value
 * PriceInformation1.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2#Value
 * PriceInformation2.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation6#Value
 * PriceInformation6.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation8#Value
 * PriceInformation8.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation9#Value
 * PriceInformation9.Value}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice1Choice#Proprietary
 * TransactionPrice1Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice2Choice#Proprietary
 * TransactionPrice2Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#Proprietary
 * TransactionPrice3Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceRate1#RateType
 * PriceRate1.RateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#AmountOfChange
 * PriceInformation10.AmountOfChange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation3#Value
 * PriceInformation3.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation3#PriceType
 * PriceInformation3.PriceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation4#Value
 * PriceInformation4.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11#Value
 * PriceInformation11.Value}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#Price
 * FinancialInstrumentAggregateBalance1.Price}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12#Value
 * PriceInformation12.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13#Value
 * PriceInformation13.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16#Value
 * PriceInformation16.Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation14#Value
 * PriceInformation14.Value}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValue1 PriceValue1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice4 UnitPrice4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6 UnitPrice6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValue2 PriceValue2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValue5 PriceValue5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice3 UnitPrice3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12 UnitPrice12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice
 * YieldedOrValueType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice
 * PriceRateOrAmountChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice1Choice
 * TypeOfPrice1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice3Choice
 * TypeOfPrice3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType1Choice
 * PriceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceRateOrAmount1Choice
 * PriceRateOrAmount1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price3 Price3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice5Choice
 * TypeOfPrice5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType2Choice
 * PriceType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PercentagePrice1
 * PercentagePrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice3 AmountPrice3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat5Choice
 * PriceFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice2Choice
 * IndicativeOrMarketPrice2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3
 * AmountPricePerFinancialInstrumentQuantity3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPricePerAmount2
 * AmountPricePerAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat9Choice
 * PriceFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice5 AmountPrice5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat17Choice
 * PriceFormat17Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice4Choice
 * IndicativeOrMarketPrice4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4
 * AmountPricePerFinancialInstrumentQuantity4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPricePerAmount3
 * AmountPricePerAmount3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat18Choice
 * PriceFormat18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat21Choice
 * PriceFormat21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat24Choice
 * PriceFormat24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat6Choice
 * PriceFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat7Choice
 * PriceFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat12Choice
 * PriceFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat13Choice
 * PriceFormat13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails2 PriceDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails4 PriceDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice2 AmountPrice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails7 PriceDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice4 AmountPrice4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails9 PriceDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails11 PriceDetails11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails12 PriceDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat11Choice
 * PriceFormat11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat8Choice
 * PriceFormat8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice1Choice
 * IndicativeOrMarketPrice1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat10Choice
 * PriceFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat15Choice
 * PriceFormat15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat16Choice
 * PriceFormat16Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice3Choice
 * IndicativeOrMarketPrice3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat14Choice
 * PriceFormat14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat19Choice
 * PriceFormat19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat20Choice
 * PriceFormat20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice5Choice
 * IndicativeOrMarketPrice5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat23Choice
 * PriceFormat23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat22Choice
 * PriceFormat22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails3 PriceDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat25Choice
 * PriceFormat25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat26Choice
 * PriceFormat26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice6Choice
 * IndicativeOrMarketPrice6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat27Choice
 * PriceFormat27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat28Choice
 * PriceFormat28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails5 PriceDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat29Choice
 * PriceFormat29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails6 PriceDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat31Choice
 * PriceFormat31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails8 PriceDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails10 PriceDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails13 PriceDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice2Choice
 * TypeOfPrice2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice4Choice
 * TypeOfPrice4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice
 * PriceRateOrAmountOrUnknownChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation5
 * PriceInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice7Choice
 * TypeOfPrice7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice
 * PriceRateOrAmountOrUnknown1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation7
 * PriceInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation1
 * PriceInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2
 * PriceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice6Choice
 * TypeOfPrice6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation6
 * PriceInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice8Choice
 * TypeOfPrice8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation8
 * PriceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice
 * TypeOfPrice10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation9
 * PriceInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionPrice1Choice
 * TransactionPrice1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionPrice2Choice
 * TransactionPrice2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionPrice3Choice
 * TransactionPrice3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice1 UnitPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5 UnitPrice5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11 UnitPrice11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice
 * AmountPriceType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice1 AmountPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat3Choice
 * PriceFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat4Choice
 * PriceFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat2Choice
 * PriceFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1
 * AmountPricePerFinancialInstrumentQuantity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPricePerAmount1
 * AmountPricePerAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat1Choice
 * PriceFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice
 * TypeOfPrice27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceAndDirection1
 * PriceAndDirection1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4
 * PriceValueAndRate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation10
 * PriceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnitPriceType1Choice
 * UnitPriceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation3
 * PriceInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice16 UnitPrice16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValue6 PriceValue6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice17 UnitPrice17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5
 * AmountPricePerFinancialInstrumentQuantity5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation4
 * PriceInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat33Choice
 * PriceFormat33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails14 PriceDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat32Choice
 * PriceFormat32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat34Choice
 * PriceFormat34Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails15 PriceDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11
 * PriceInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat43Choice
 * PriceFormat43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails18 PriceDetails18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails21 PriceDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat40Choice
 * PriceFormat40Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat39Choice
 * PriceFormat39Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20 UnitPrice20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnitPriceType2Choice
 * UnitPriceType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19 UnitPrice19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price6 Price6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice
 * SecuritiesTransactionPrice2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice
 * TypeOfPrice29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice
 * TypeOfPrice30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12
 * PriceInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice
 * TypeOfPrice28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13
 * PriceInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6
 * AmountPricePerFinancialInstrumentQuantity6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice7Choice
 * IndicativeOrMarketPrice7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat45Choice
 * PriceFormat45Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat50Choice
 * PriceFormat50Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice8Choice
 * IndicativeOrMarketPrice8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat48Choice
 * PriceFormat48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat51Choice
 * PriceFormat51Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat46Choice
 * PriceFormat46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails23 PriceDetails23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat49Choice
 * PriceFormat49Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails22 PriceDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat47Choice
 * PriceFormat47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat44Choice
 * PriceFormat44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice
 * TypeOfPrice31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat56Choice
 * PriceFormat56Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat57Choice
 * PriceFormat57Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails24 PriceDetails24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails25 PriceDetails25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice9Choice
 * IndicativeOrMarketPrice9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat52Choice
 * PriceFormat52Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice11Choice
 * IndicativeOrMarketPrice11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat59Choice
 * PriceFormat59Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat55Choice
 * PriceFormat55Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7
 * AmountPricePerFinancialInstrumentQuantity7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat53Choice
 * PriceFormat53Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat60Choice
 * PriceFormat60Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat58Choice
 * PriceFormat58Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice33Choice
 * TypeOfPrice33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16
 * PriceInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice45Choice
 * TypeOfPrice45Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice32Choice
 * TypeOfPrice32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation14
 * PriceInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22 UnitPrice22}</li>
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
 * "SecuritiesPricing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics related to the price of the security."</li>
 * </ul>
 */
public class SecuritiesPricing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of pricing calculation method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethodCode
	 * PriceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#PriceMethod
	 * ValuationDealingProcessingCharacteristics.PriceMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#PriceMethod
	 * ValuationDealingProcessingCharacteristics2.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#PriceMethod
	 * UnitPrice6.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#PriceMethod
	 * UnitPrice15.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice3#PriceMethod
	 * UnitPrice3.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#PriceMethod
	 * UnitPrice12.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice1#PriceMethod
	 * UnitPrice1.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#PriceMethod
	 * UnitPrice5.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#PriceMethod
	 * UnitPrice10.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#PriceMethod
	 * UnitPrice11.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#PriceMethod
	 * UnitPrice20.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#PriceMethod
	 * UnitPrice21.PriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#PriceMethod
	 * UnitPrice22.PriceMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics.PriceMethod, com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2.PriceMethod,
					com.tools20022.repository.msg.UnitPrice6.PriceMethod, com.tools20022.repository.msg.UnitPrice15.PriceMethod, com.tools20022.repository.msg.UnitPrice3.PriceMethod, com.tools20022.repository.msg.UnitPrice12.PriceMethod,
					com.tools20022.repository.msg.UnitPrice1.PriceMethod, com.tools20022.repository.msg.UnitPrice5.PriceMethod, com.tools20022.repository.msg.UnitPrice10.PriceMethod, com.tools20022.repository.msg.UnitPrice11.PriceMethod,
					com.tools20022.repository.msg.UnitPrice20.PriceMethod, com.tools20022.repository.msg.UnitPrice21.PriceMethod, com.tools20022.repository.msg.UnitPrice22.PriceMethod);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceMethodCode.mmObject();
		}
	};
	/**
	 * Type and information about a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice4#Type
	 * UnitPrice4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#Type
	 * UnitPrice6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#Type
	 * UnitPrice15.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#ExtendedType
	 * UnitPrice15.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice3#PriceType
	 * UnitPrice3.PriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#Type
	 * UnitPrice12.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#ExtendedType
	 * UnitPrice12.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price2#Type Price2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice1Choice#Code
	 * TypeOfPrice1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice1Choice#Proprietary
	 * TypeOfPrice1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice3Choice#Code
	 * TypeOfPrice3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice3Choice#Proprietary
	 * TypeOfPrice3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#TypeOfPrice
	 * SecuritiesTradeDetails25.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#TypeOfPrice
	 * QuantityBreakdown3.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#TypeOfPrice
	 * QuantityBreakdown13.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#TypeOfPrice
	 * SecuritiesTradeDetails26.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price3#Type Price3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice5Choice#Code
	 * TypeOfPrice5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice5Choice#Proprietary
	 * TypeOfPrice5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#TypeOfPrice
	 * SecuritiesTradeDetails27.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#TypeOfPrice
	 * QuantityBreakdown18.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#TypeOfPrice
	 * SecuritiesTradeDetails28.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#TypeOfPrice
	 * QuantityBreakdown9.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice2Choice#Code
	 * TypeOfPrice2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice2Choice#Proprietary
	 * TypeOfPrice2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice4Choice#Code
	 * TypeOfPrice4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice4Choice#Proprietary
	 * TypeOfPrice4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation5#Type
	 * PriceInformation5.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#TypeOfPrice
	 * QuantityBreakdown4.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice7Choice#Code
	 * TypeOfPrice7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice7Choice#Proprietary
	 * TypeOfPrice7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation7#Type
	 * PriceInformation7.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#TypeOfPrice
	 * QuantityBreakdown8.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation1#Type
	 * PriceInformation1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2#Type
	 * PriceInformation2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#ExtendedType
	 * PriceInformation2.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#TypeOfPrice
	 * QuantityBreakdown14.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#TypeOfPrice
	 * QuantityBreakdown19.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#TypeOfPrice
	 * QuantityBreakdown24.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#TypeOfPrice
	 * QuantityBreakdown25.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#TypeOfPrice
	 * QuantityBreakdown7.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#TypeOfPrice
	 * QuantityBreakdown23.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#TypeOfPrice
	 * QuantityBreakdown26.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#TypeOfPrice
	 * SecuritiesTradeDetails2.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#TypeOfPrice
	 * SecuritiesTradeDetails16.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#TypeOfPrice
	 * QuantityBreakdown10.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#TypeOfPrice
	 * QuantityBreakdown16.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#TypeOfPrice
	 * QuantityBreakdown21.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#TypeOfPrice
	 * SecuritiesTradeDetails1.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#TypeOfPrice
	 * SecuritiesTradeDetails15.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice6Choice#Code
	 * TypeOfPrice6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice6Choice#Proprietary
	 * TypeOfPrice6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation6#Type
	 * PriceInformation6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice8Choice#Code
	 * TypeOfPrice8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice8Choice#Proprietary
	 * TypeOfPrice8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation8#Type
	 * PriceInformation8.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price1#PriceType
	 * Price1.PriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price4#Type Price4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice#Code
	 * TypeOfPrice10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice#Proprietary
	 * TypeOfPrice10Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#TypeOfPrice
	 * Order16.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#TypeOfPrice
	 * Order14.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice1#Type
	 * UnitPrice1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#Type
	 * UnitPrice5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#Type
	 * UnitPrice10.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#ExtendedType
	 * UnitPrice10.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#Type
	 * UnitPrice11.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#ExtendedType
	 * UnitPrice11.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#TypeOfPrice
	 * SecuritiesTradeDetails8.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#TypeOfPrice
	 * SecuritiesTradeDetails18.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#TypeOfPrice
	 * SecuritiesTradeDetails4.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#TypeOfPrice
	 * SecuritiesTradeDetails17.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#TypeOfPrice
	 * SecuritiesTradeDetails9.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#TypeOfPrice
	 * SecuritiesTradeDetails21.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#TypeOfPrice
	 * SecuritiesTradeDetails10.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#TypeOfPrice
	 * SecuritiesTradeDetails22.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#TypeOfPrice
	 * SecuritiesTradeDetails23.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#TypeOfPrice
	 * SecuritiesTradeDetails29.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice#Code
	 * TypeOfPrice27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice#Proprietary
	 * TypeOfPrice27Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation10#Type
	 * PriceInformation10.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType1Choice#Type
	 * UnitPriceType1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType1Choice#Proprietary
	 * UnitPriceType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice16#UnitPriceType
	 * UnitPrice16.UnitPriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice17#Type
	 * UnitPrice17.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#TypeOfPrice
	 * QuantityBreakDown2.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation4#Type
	 * PriceInformation4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#TypeOfPrice
	 * QuantityBreakDown1.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#TypeOfPrice
	 * SecuritiesTradeDetails31.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#TypeOfPrice
	 * SecuritiesTradeDetails33.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#TypeOfPrice
	 * SecuritiesTradeDetails35.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#TypeOfPrice
	 * SecuritiesTradeDetails36.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#TypeOfPrice
	 * SecuritiesTradeDetails34.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#TypeOfPrice
	 * SecuritiesTradeDetails32.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#TypeOfPrice
	 * Order17.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#TypeOfPrice
	 * Order18.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#TypeOfPrice
	 * SecuritiesTradeDetails44.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#TypeOfPrice
	 * SecuritiesTradeDetails43.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#TypeOfPrice
	 * SecuritiesTradeDetails41.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#TypeOfPrice
	 * SecuritiesTradeDetails42.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#TypeOfPrice
	 * SecuritiesTradeDetails46.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#TypeOfPrice
	 * SecuritiesTradeDetails47.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#PriceType
	 * UnitPrice20.PriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType2Choice#Code
	 * UnitPriceType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType2Choice#Proprietary
	 * UnitPriceType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19#PriceType
	 * UnitPrice19.PriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price6#Type Price6.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#TypeOfPrice
	 * SecuritiesTradeDetails49.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#TypeOfPrice
	 * SecuritiesTradeDetails51.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#TypeOfPrice
	 * SecuritiesTradeDetails53.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#TypeOfPrice
	 * SecuritiesTradeDetails54.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#TypeOfPrice
	 * QuantityBreakdown27.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#TypeOfPrice
	 * QuantityBreakdown30.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#TypeOfPrice
	 * QuantityBreakdown29.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice#Code
	 * TypeOfPrice29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice#Proprietary
	 * TypeOfPrice29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice#Code
	 * TypeOfPrice30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice#Proprietary
	 * TypeOfPrice30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#TypeOfPrice
	 * SecuritiesTradeDetails52.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12#Type
	 * PriceInformation12.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#TypeOfPrice
	 * QuantityBreakdown28.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice#Code
	 * TypeOfPrice28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice#Proprietary
	 * TypeOfPrice28Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13#Type
	 * PriceInformation13.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#TypeOfPrice
	 * SecuritiesTradeDetails50.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#Type
	 * UnitPrice21.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice#Code
	 * TypeOfPrice31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice#Proprietary
	 * TypeOfPrice31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#TypeOfPrice
	 * SecuritiesTradeDetails61.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#TypeOfPrice
	 * SecuritiesTradeDetails63.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#TypeOfPrice
	 * SecuritiesTradeDetails62.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#TypeOfPrice
	 * SecuritiesTradeDetails60.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#TypeOfPrice
	 * QuantityBreakdown40.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#TypeOfPrice
	 * QuantityBreakdown39.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice33Choice#Code
	 * TypeOfPrice33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice33Choice#Proprietary
	 * TypeOfPrice33Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16#Type
	 * PriceInformation16.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice45Choice#Code
	 * TypeOfPrice45Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice45Choice#Proprietary
	 * TypeOfPrice45Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#TypeOfPrice
	 * QuantityBreakdown38.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice32Choice#Code
	 * TypeOfPrice32Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice32Choice#Proprietary
	 * TypeOfPrice32Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#TypeOfPrice
	 * QuantityBreakdown44.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation14#Type
	 * PriceInformation14.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#TypeOfPrice
	 * SecuritiesTradeDetails65.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#TypeOfPrice
	 * SecuritiesTradeDetails66.TypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#Type
	 * UnitPrice22.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice46Choice#Code
	 * TypeOfPrice46Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice46Choice#Proprietary
	 * TypeOfPrice46Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#FinalPriceType
	 * DerivativeCommodity2.FinalPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#TypeOfPrice
	 * SecuritiesTradeDetails67.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#TypeOfPrice
	 * SecuritiesTradeDetails68.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#TypeOfPrice
	 * SecuritiesTradeDetails69.TypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#TypeOfPrice
	 * SecuritiesTradeDetails70.TypeOfPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PriceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice4.Type, com.tools20022.repository.msg.UnitPrice6.Type, com.tools20022.repository.msg.UnitPrice15.Type,
					com.tools20022.repository.msg.UnitPrice15.ExtendedType, com.tools20022.repository.msg.UnitPrice3.PriceType, com.tools20022.repository.msg.UnitPrice12.Type, com.tools20022.repository.msg.UnitPrice12.ExtendedType,
					com.tools20022.repository.msg.Price2.Type, com.tools20022.repository.choice.TypeOfPrice1Choice.Code, com.tools20022.repository.choice.TypeOfPrice1Choice.Proprietary,
					com.tools20022.repository.choice.TypeOfPrice3Choice.Code, com.tools20022.repository.choice.TypeOfPrice3Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails25.TypeOfPrice,
					com.tools20022.repository.msg.QuantityBreakdown3.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown13.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails26.TypeOfPrice,
					com.tools20022.repository.msg.Price3.Type, com.tools20022.repository.choice.TypeOfPrice5Choice.Code, com.tools20022.repository.choice.TypeOfPrice5Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown18.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails28.TypeOfPrice,
					com.tools20022.repository.msg.QuantityBreakdown9.TypeOfPrice, com.tools20022.repository.choice.TypeOfPrice2Choice.Code, com.tools20022.repository.choice.TypeOfPrice2Choice.Proprietary,
					com.tools20022.repository.choice.TypeOfPrice4Choice.Code, com.tools20022.repository.choice.TypeOfPrice4Choice.Proprietary, com.tools20022.repository.msg.PriceInformation5.Type,
					com.tools20022.repository.msg.QuantityBreakdown4.TypeOfPrice, com.tools20022.repository.choice.TypeOfPrice7Choice.Code, com.tools20022.repository.choice.TypeOfPrice7Choice.Proprietary,
					com.tools20022.repository.msg.PriceInformation7.Type, com.tools20022.repository.msg.QuantityBreakdown8.TypeOfPrice, com.tools20022.repository.msg.PriceInformation1.Type,
					com.tools20022.repository.msg.PriceInformation2.Type, com.tools20022.repository.msg.PriceInformation2.ExtendedType, com.tools20022.repository.msg.QuantityBreakdown14.TypeOfPrice,
					com.tools20022.repository.msg.QuantityBreakdown19.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown24.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown25.TypeOfPrice,
					com.tools20022.repository.msg.QuantityBreakdown7.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown23.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown26.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails16.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown10.TypeOfPrice,
					com.tools20022.repository.msg.QuantityBreakdown16.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown21.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails1.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.TypeOfPrice, com.tools20022.repository.choice.TypeOfPrice6Choice.Code, com.tools20022.repository.choice.TypeOfPrice6Choice.Proprietary,
					com.tools20022.repository.msg.PriceInformation6.Type, com.tools20022.repository.choice.TypeOfPrice8Choice.Code, com.tools20022.repository.choice.TypeOfPrice8Choice.Proprietary,
					com.tools20022.repository.msg.PriceInformation8.Type, com.tools20022.repository.msg.Price1.PriceType, com.tools20022.repository.msg.Price4.Type, com.tools20022.repository.choice.TypeOfPrice10Choice.Code,
					com.tools20022.repository.choice.TypeOfPrice10Choice.Proprietary, com.tools20022.repository.msg.Order16.TypeOfPrice, com.tools20022.repository.msg.Order14.TypeOfPrice, com.tools20022.repository.msg.UnitPrice1.Type,
					com.tools20022.repository.msg.UnitPrice5.Type, com.tools20022.repository.msg.UnitPrice10.Type, com.tools20022.repository.msg.UnitPrice10.ExtendedType, com.tools20022.repository.msg.UnitPrice11.Type,
					com.tools20022.repository.msg.UnitPrice11.ExtendedType, com.tools20022.repository.msg.SecuritiesTradeDetails8.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails18.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails17.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails9.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails21.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails10.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails22.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails29.TypeOfPrice, com.tools20022.repository.choice.TypeOfPrice27Choice.Code,
					com.tools20022.repository.choice.TypeOfPrice27Choice.Proprietary, com.tools20022.repository.msg.PriceInformation10.Type, com.tools20022.repository.choice.UnitPriceType1Choice.Type,
					com.tools20022.repository.choice.UnitPriceType1Choice.Proprietary, com.tools20022.repository.msg.UnitPrice16.UnitPriceType, com.tools20022.repository.msg.UnitPrice17.Type,
					com.tools20022.repository.msg.QuantityBreakDown2.TypeOfPrice, com.tools20022.repository.msg.PriceInformation4.Type, com.tools20022.repository.msg.QuantityBreakDown1.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails33.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails35.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails36.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails34.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails32.TypeOfPrice,
					com.tools20022.repository.msg.Order17.TypeOfPrice, com.tools20022.repository.msg.Order18.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails44.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails41.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails42.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails46.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails47.TypeOfPrice, com.tools20022.repository.msg.UnitPrice20.PriceType,
					com.tools20022.repository.choice.UnitPriceType2Choice.Code, com.tools20022.repository.choice.UnitPriceType2Choice.Proprietary, com.tools20022.repository.msg.UnitPrice19.PriceType,
					com.tools20022.repository.msg.Price6.Type, com.tools20022.repository.msg.SecuritiesTradeDetails49.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails51.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails54.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown27.TypeOfPrice,
					com.tools20022.repository.msg.QuantityBreakdown30.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown29.TypeOfPrice, com.tools20022.repository.choice.TypeOfPrice29Choice.Code,
					com.tools20022.repository.choice.TypeOfPrice29Choice.Proprietary, com.tools20022.repository.choice.TypeOfPrice30Choice.Code, com.tools20022.repository.choice.TypeOfPrice30Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.TypeOfPrice, com.tools20022.repository.msg.PriceInformation12.Type, com.tools20022.repository.msg.QuantityBreakdown28.TypeOfPrice,
					com.tools20022.repository.choice.TypeOfPrice28Choice.Code, com.tools20022.repository.choice.TypeOfPrice28Choice.Proprietary, com.tools20022.repository.msg.PriceInformation13.Type,
					com.tools20022.repository.msg.SecuritiesTradeDetails50.TypeOfPrice, com.tools20022.repository.msg.UnitPrice21.Type, com.tools20022.repository.choice.TypeOfPrice31Choice.Code,
					com.tools20022.repository.choice.TypeOfPrice31Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails61.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails63.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails60.TypeOfPrice, com.tools20022.repository.msg.QuantityBreakdown40.TypeOfPrice,
					com.tools20022.repository.msg.QuantityBreakdown39.TypeOfPrice, com.tools20022.repository.choice.TypeOfPrice33Choice.Code, com.tools20022.repository.choice.TypeOfPrice33Choice.Proprietary,
					com.tools20022.repository.msg.PriceInformation16.Type, com.tools20022.repository.choice.TypeOfPrice45Choice.Code, com.tools20022.repository.choice.TypeOfPrice45Choice.Proprietary,
					com.tools20022.repository.msg.QuantityBreakdown38.TypeOfPrice, com.tools20022.repository.choice.TypeOfPrice32Choice.Code, com.tools20022.repository.choice.TypeOfPrice32Choice.Proprietary,
					com.tools20022.repository.msg.QuantityBreakdown44.TypeOfPrice, com.tools20022.repository.msg.PriceInformation14.Type, com.tools20022.repository.msg.SecuritiesTradeDetails65.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.TypeOfPrice, com.tools20022.repository.msg.UnitPrice22.Type, com.tools20022.repository.choice.TypeOfPrice46Choice.Code,
					com.tools20022.repository.choice.TypeOfPrice46Choice.Proprietary, com.tools20022.repository.msg.DerivativeCommodity2.FinalPriceType, com.tools20022.repository.msg.SecuritiesTradeDetails67.TypeOfPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails69.TypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails70.TypeOfPrice);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Type and information about a price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}
	};
	/**
	 * Indicates whether the dividend is included, ie, cum-dividend, in the
	 * executed price. When the dividend is not included, the price will be
	 * ex-dividend.
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#CumDividendIndicator
	 * UnitPrice6.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#CumDividendIndicator
	 * UnitPrice15.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#CumDividendIndicator
	 * RedemptionExecution3.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#CumDividendIndicator
	 * RedemptionExecution5.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#CumDividendIndicator
	 * RedemptionExecution4.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#CumDividendIndicator
	 * RedemptionExecution6.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#CumDividendIndicator
	 * InvestmentFundTransaction2.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#CumDividendIndicator
	 * InvestmentFundTransaction3.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#CumDividendIndicator
	 * SubscriptionExecution3.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#CumDividendIndicator
	 * SubscriptionExecution5.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#CumDividendIndicator
	 * SubscriptionExecution4.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#CumDividendIndicator
	 * SubscriptionExecution6.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#CumDividendIndicator
	 * SwitchRedemptionLegExecution2.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#CumDividendIndicator
	 * SwitchSubscriptionLegExecution2.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#CumDividendIndicator
	 * SwitchRedemptionLegExecution3.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#CumDividendIndicator
	 * SwitchSubscriptionLegExecution3.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#CumDividendIndicator
	 * RedemptionExecution12.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#CumDividendIndicator
	 * SubscriptionExecution9.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#CumDividendIndicator
	 * InvestmentFundTransaction4.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#CumDividendIndicator
	 * SubscriptionExecution13.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#CumDividendIndicator
	 * SubscriptionExecution12.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#CumDividendIndicator
	 * RedemptionExecution16.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#CumDividendIndicator
	 * SwitchSubscriptionLegExecution4.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#CumDividendIndicator
	 * RedemptionExecution15.CumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#CumDividendIndicator
	 * SwitchRedemptionLegExecution4.CumDividendIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CumDividendIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice6.CumDividendIndicator, com.tools20022.repository.msg.UnitPrice15.CumDividendIndicator,
					com.tools20022.repository.msg.RedemptionExecution3.CumDividendIndicator, com.tools20022.repository.msg.RedemptionExecution5.CumDividendIndicator, com.tools20022.repository.msg.RedemptionExecution4.CumDividendIndicator,
					com.tools20022.repository.msg.RedemptionExecution6.CumDividendIndicator, com.tools20022.repository.msg.InvestmentFundTransaction2.CumDividendIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction3.CumDividendIndicator, com.tools20022.repository.msg.SubscriptionExecution3.CumDividendIndicator,
					com.tools20022.repository.msg.SubscriptionExecution5.CumDividendIndicator, com.tools20022.repository.msg.SubscriptionExecution4.CumDividendIndicator,
					com.tools20022.repository.msg.SubscriptionExecution6.CumDividendIndicator, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.CumDividendIndicator,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.CumDividendIndicator, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.CumDividendIndicator,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.CumDividendIndicator, com.tools20022.repository.msg.RedemptionExecution12.CumDividendIndicator,
					com.tools20022.repository.msg.SubscriptionExecution9.CumDividendIndicator, com.tools20022.repository.msg.InvestmentFundTransaction4.CumDividendIndicator,
					com.tools20022.repository.msg.SubscriptionExecution13.CumDividendIndicator, com.tools20022.repository.msg.SubscriptionExecution12.CumDividendIndicator,
					com.tools20022.repository.msg.RedemptionExecution16.CumDividendIndicator, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.CumDividendIndicator,
					com.tools20022.repository.msg.RedemptionExecution15.CumDividendIndicator, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.CumDividendIndicator);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Ratio applied on the non-adjusted price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#CalculationBasis
	 * UnitPrice6.CalculationBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#CalculationBasis
	 * UnitPrice15.CalculationBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied on the non-adjusted price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice6.CalculationBasis, com.tools20022.repository.msg.UnitPrice15.CalculationBasis);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Ratio applied on the non-adjusted price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a change of price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#PriceChange
	 * ValuationStatistics.PriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a change of price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceChangeRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRelatedStatistics";
			definition = "Valuation statistics for which a change of price is specified.";
			minOccurs = 0;
			type_lazy = () -> ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.PriceChange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price expressed as a rate, ie, percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue2#Rate
	 * PriceValue2.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueChange1#Rate
	 * PriceValueChange1.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#Rate
	 * PriceRateOrAmountChoice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmount1Choice#Rate
	 * PriceRateOrAmount1Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentagePrice1#PriceValue
	 * PercentagePrice1.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice#PercentagePrice
	 * PriceFormat5Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#PercentagePrice
	 * PriceFormat9Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat17Choice#PercentagePrice
	 * PriceFormat17Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#PercentagePrice
	 * PriceFormat18Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#PercentagePrice
	 * PriceFormat21Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#PercentagePrice
	 * PriceFormat24Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice#PercentagePrice
	 * PriceFormat6Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#PercentagePrice
	 * PriceFormat7Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat12Choice#PercentagePrice
	 * PriceFormat12Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#PercentagePrice
	 * PriceFormat13Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat11Choice#PercentagePrice
	 * PriceFormat11Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat8Choice#PercentagePrice
	 * PriceFormat8Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#PercentagePrice
	 * PriceFormat10Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat15Choice#PercentagePrice
	 * PriceFormat15Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat16Choice#PercentagePrice
	 * PriceFormat16Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#PercentagePrice
	 * PriceFormat14Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat19Choice#PercentagePrice
	 * PriceFormat19Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#PercentagePrice
	 * PriceFormat20Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat23Choice#PercentagePrice
	 * PriceFormat23Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#PercentagePrice
	 * PriceFormat22Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat25Choice#PercentagePrice
	 * PriceFormat25Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#PercentagePrice
	 * PriceFormat26Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#PercentagePrice
	 * PriceFormat27Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#PercentagePrice
	 * PriceFormat28Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice#Rate
	 * PriceRateOrAmountOrUnknownChoice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice#Rate
	 * PriceRateOrAmountOrUnknown1Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceRate1#Rate
	 * PriceRate1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat3Choice#Rate
	 * PriceFormat3Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat4Choice#Rate
	 * PriceFormat4Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat2Choice#Rate
	 * PriceFormat2Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat1Choice#Rate
	 * PriceFormat1Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4#Rate
	 * PriceValueAndRate4.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#PercentagePrice
	 * PriceFormat33Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#PercentagePrice
	 * PriceFormat32Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#PercentagePrice
	 * PriceFormat34Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#PercentagePrice
	 * PriceFormat43Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#PercentagePrice
	 * PriceFormat40Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#PercentagePrice
	 * PriceFormat39Choice.PercentagePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price6#RateOrAmount
	 * Price6.RateOrAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#Percentage
	 * SecuritiesTransactionPrice2Choice.Percentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#LegValuationRate
	 * InstrumentLeg6.LegValuationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat45Choice#PercentagePrice
	 * PriceFormat45Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat50Choice#PercentagePrice
	 * PriceFormat50Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#PercentagePrice
	 * PriceFormat48Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat51Choice#PercentagePrice
	 * PriceFormat51Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#PercentagePrice
	 * PriceFormat49Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#PercentagePrice
	 * PriceFormat47Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat44Choice#PercentagePrice
	 * PriceFormat44Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#PercentagePrice
	 * PriceFormat56Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat57Choice#PercentagePrice
	 * PriceFormat57Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat52Choice#PercentagePrice
	 * PriceFormat52Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat59Choice#PercentagePrice
	 * PriceFormat59Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat55Choice#PercentagePrice
	 * PriceFormat55Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#PercentagePrice
	 * PriceFormat53Choice.PercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#PercentagePrice
	 * PriceFormat60Choice.PercentagePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a rate, ie, percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceValue2.Rate, com.tools20022.repository.msg.PriceValueChange1.Rate, com.tools20022.repository.choice.PriceRateOrAmountChoice.Rate,
					com.tools20022.repository.choice.PriceRateOrAmount1Choice.Rate, com.tools20022.repository.msg.PercentagePrice1.PriceValue, com.tools20022.repository.choice.PriceFormat5Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat9Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat17Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat18Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat21Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat24Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat6Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat7Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat12Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat13Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat11Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat8Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat10Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat15Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat16Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat14Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat19Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat20Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat23Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat22Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat25Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat26Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat27Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat28Choice.PercentagePrice, com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice.Rate,
					com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice.Rate, com.tools20022.repository.msg.PriceRate1.Rate, com.tools20022.repository.choice.PriceFormat3Choice.Rate,
					com.tools20022.repository.choice.PriceFormat4Choice.Rate, com.tools20022.repository.choice.PriceFormat2Choice.Rate, com.tools20022.repository.choice.PriceFormat1Choice.Rate,
					com.tools20022.repository.msg.PriceValueAndRate4.Rate, com.tools20022.repository.choice.PriceFormat33Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat32Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat34Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat43Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat40Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat39Choice.PercentagePrice, com.tools20022.repository.msg.Price6.RateOrAmount, com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.Percentage,
					com.tools20022.repository.msg.InstrumentLeg6.LegValuationRate, com.tools20022.repository.choice.PriceFormat45Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat50Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat48Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat51Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat49Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat47Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat44Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat56Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat57Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat52Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat59Choice.PercentagePrice,
					com.tools20022.repository.choice.PriceFormat55Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat53Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat60Choice.PercentagePrice);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a highest price value is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#HighestPriceValue
	 * ValuationStatistics.HighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a highest price value is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd HighestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a highest price value is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Valuation statistics for which a lowest price value is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#LowestPriceValue
	 * ValuationStatistics.LowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a lowest price value is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LowestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a lowest price value is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ValuationStatistics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the security for which a price is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Pricing
	 * Security.Pricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security for which a price is given."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Identifies the security for which a price is given.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Pricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade execution for which a deal price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealPrice
	 * SecuritiesTradeExecution.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade execution for which a deal price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade execution for which a deal price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the price is expressed as a yield (yield is the annual
	 * rate of return expressed as a percentage).
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
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#Yielded
	 * YieldedOrValueType1Choice.Yielded}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation1#Yielded
	 * PriceInformation1.Yielded}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2#Yielded
	 * PriceInformation2.Yielded}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation3#YieldedIndicator
	 * PriceInformation3.YieldedIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation4#Yielded
	 * PriceInformation4.Yielded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yielded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Yielded = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.YieldedOrValueType1Choice.Yielded, com.tools20022.repository.msg.PriceInformation1.Yielded, com.tools20022.repository.msg.PriceInformation2.Yielded,
					com.tools20022.repository.msg.PriceInformation3.YieldedIndicator, com.tools20022.repository.msg.PriceInformation4.Yielded);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yielded";
			definition = "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#ValueType
	 * YieldedOrValueType1Choice.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentagePrice1#PercentagePriceType
	 * PercentagePrice1.PercentagePriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation5#ValueType
	 * PriceInformation5.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation7#ValueType
	 * PriceInformation7.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation1#ValueType
	 * PriceInformation1.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#ValueType
	 * PriceInformation2.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation6#ValueType
	 * PriceInformation6.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation8#ValueType
	 * PriceInformation8.ValueType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price1#ValueType
	 * Price1.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation4#ValueType
	 * PriceInformation4.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#ValueType
	 * PriceInformation12.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#ValueType
	 * PriceInformation13.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16#ValueType
	 * PriceInformation16.ValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation14#ValueType
	 * PriceInformation14.ValueType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.YieldedOrValueType1Choice.ValueType, com.tools20022.repository.msg.PercentagePrice1.PercentagePriceType,
					com.tools20022.repository.msg.PriceInformation5.ValueType, com.tools20022.repository.msg.PriceInformation7.ValueType, com.tools20022.repository.msg.PriceInformation1.ValueType,
					com.tools20022.repository.msg.PriceInformation2.ValueType, com.tools20022.repository.msg.PriceInformation6.ValueType, com.tools20022.repository.msg.PriceInformation8.ValueType,
					com.tools20022.repository.msg.Price1.ValueType, com.tools20022.repository.msg.PriceInformation4.ValueType, com.tools20022.repository.msg.PriceInformation12.ValueType,
					com.tools20022.repository.msg.PriceInformation13.ValueType, com.tools20022.repository.msg.PriceInformation16.ValueType, com.tools20022.repository.msg.PriceInformation14.ValueType);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfRate";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}
	};
	/**
	 * Derivative for which an exercise price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#ExercisePrice
	 * Derivative.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative for which an exercise price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Derivative = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Derivative for which an exercise price is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.ExercisePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Warrant for which a subscription price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#SubscriptionPrice
	 * Warrant.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant for which a subscription price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedWarrant = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedWarrant";
			definition = "Warrant for which a subscription price is provided.";
			minOccurs = 0;
			type_lazy = () -> Warrant.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.SubscriptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a conversion price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPrice
	 * SecuritiesConversion.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion price is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesConversion";
			definition = "Securities conversion process for which a conversion price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lot for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#LotPrice
	 * LotBreakdown.LotPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lot for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LotBreakdown = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Lot for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.LotPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
	 * AmountPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice3#AmountPriceType
	 * AmountPrice3.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#AmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity3.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#AmountPriceType
	 * AmountPricePerAmount2.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice5#AmountPriceType
	 * AmountPrice5.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4#AmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity4.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount3#AmountPriceType
	 * AmountPricePerAmount3.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice2#AmountPriceType
	 * AmountPrice2.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice4#AmountPriceType
	 * AmountPrice4.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice#Code
	 * AmountPriceType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice#Proprietary
	 * AmountPriceType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice1#AmountPriceType
	 * AmountPrice1.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#AmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity1.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#AmountPriceType
	 * AmountPricePerAmount1.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#AmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity5.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#AmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity6.AmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7#AmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity7.AmountPriceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TypeOfAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPrice3.AmountPriceType, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3.AmountPriceType,
					com.tools20022.repository.msg.AmountPricePerAmount2.AmountPriceType, com.tools20022.repository.msg.AmountPrice5.AmountPriceType, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4.AmountPriceType,
					com.tools20022.repository.msg.AmountPricePerAmount3.AmountPriceType, com.tools20022.repository.msg.AmountPrice2.AmountPriceType, com.tools20022.repository.msg.AmountPrice4.AmountPriceType,
					com.tools20022.repository.choice.AmountPriceType1FormatChoice.Code, com.tools20022.repository.choice.AmountPriceType1FormatChoice.Proprietary, com.tools20022.repository.msg.AmountPrice1.AmountPriceType,
					com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1.AmountPriceType, com.tools20022.repository.msg.AmountPricePerAmount1.AmountPriceType,
					com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.AmountPriceType, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6.AmountPriceType,
					com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7.AmountPriceType);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfAmount";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AmountPriceTypeCode.mmObject();
		}
	};
	/**
	 * Corporate action event for which an exercise price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionExercisePrice
	 * CorporateActionPrice.CorporateActionExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an exercise price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExercisePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePriceRelatedEvent";
			definition = "Corporate action event for which an exercise price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a generic cash price received per
	 * product is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price received per product is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GenericCashPriceReceivedPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price received per product is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price expressed as an amount per a quantity of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#SecuritiesPricing
	 * AmountAndQuantity.SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat9Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat18Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat21Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat24Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat7Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat13Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat10Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat14Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat20Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat22Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat26Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat28Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat1Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat33Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat32Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat34Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat43Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat40Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat39Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat48Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat49Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat47Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat56Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat53Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat60Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as an amount per a quantity of financial instruments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AmountPricePerFinancialInstrumentQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat9Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat18Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat21Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat24Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat7Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat13Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat10Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat14Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat20Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat22Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat26Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat28Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat1Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat33Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat32Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat34Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat43Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat40Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat39Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat48Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat49Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat47Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat56Choice.AmountPricePerFinancialInstrumentQuantity,
					com.tools20022.repository.choice.PriceFormat53Choice.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.choice.PriceFormat60Choice.AmountPricePerFinancialInstrumentQuantity);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as an amount per a quantity of financial instruments.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndQuantity.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Price expressed as an amount per another amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio#SecuritiesPricing
	 * AmountRatio.SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRatio
	 * AmountRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#Amount
	 * AmountPricePerAmount2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#AmountPricePerAmount
	 * PriceFormat9Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount3#Amount
	 * AmountPricePerAmount3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#AmountPricePerAmount
	 * PriceFormat18Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#AmountPricePerAmount
	 * PriceFormat21Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#AmountPricePerAmount
	 * PriceFormat24Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#AmountPricePerAmount
	 * PriceFormat7Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#AmountPricePerAmount
	 * PriceFormat13Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#AmountPricePerAmount
	 * PriceFormat10Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#AmountPricePerAmount
	 * PriceFormat14Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#AmountPricePerAmount
	 * PriceFormat20Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#AmountPricePerAmount
	 * PriceFormat22Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#AmountPricePerAmount
	 * PriceFormat26Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#AmountPricePerAmount
	 * PriceFormat28Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#Amount
	 * AmountPricePerAmount1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#AmountPricePerAmount
	 * PriceFormat1Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#AmountPricePerAmount
	 * PriceFormat33Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#AmountPricePerAmount
	 * PriceFormat32Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#AmountPricePerAmount
	 * PriceFormat34Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#AmountPricePerAmount
	 * PriceFormat43Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#AmountPricePerAmount
	 * PriceFormat40Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#AmountPricePerAmount
	 * PriceFormat39Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#AmountPricePerAmount
	 * PriceFormat48Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#AmountPricePerAmount
	 * PriceFormat49Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#AmountPricePerAmount
	 * PriceFormat47Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#AmountPricePerAmount
	 * PriceFormat56Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#AmountPricePerAmount
	 * PriceFormat53Choice.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#AmountPricePerAmount
	 * PriceFormat60Choice.AmountPricePerAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as an amount per another amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AmountPricePerAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerAmount2.Amount, com.tools20022.repository.choice.PriceFormat9Choice.AmountPricePerAmount,
					com.tools20022.repository.msg.AmountPricePerAmount3.Amount, com.tools20022.repository.choice.PriceFormat18Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat21Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat24Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat7Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat13Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat10Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat14Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat20Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat22Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat26Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat28Choice.AmountPricePerAmount, com.tools20022.repository.msg.AmountPricePerAmount1.Amount, com.tools20022.repository.choice.PriceFormat1Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat33Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat32Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat34Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat43Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat40Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat39Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat48Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat49Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat47Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat56Choice.AmountPricePerAmount,
					com.tools20022.repository.choice.PriceFormat53Choice.AmountPricePerAmount, com.tools20022.repository.choice.PriceFormat60Choice.AmountPricePerAmount);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as an amount per another amount.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRatio.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a generic cash price paid per product is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPricePaidPerProduct
	 * CorporateActionPrice.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price paid per product is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GenericCashPricePaidPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price paid per product is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the price of a security is determined (For outturn
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceCalculationRelatedPricing
	 * DateTimePeriod.PriceCalculationRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod4#PriceCalculationPeriod
	 * CorporateActionPeriod4.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#PriceCalculationPeriod
	 * CorporateActionPeriod9.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#PriceCalculationPeriod
	 * CorporateActionPeriod5.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#PriceCalculationPeriod
	 * CorporateActionPeriod7.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#PriceCalculationPeriod
	 * CorporateActionPeriod3.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#PriceCalculationPeriod
	 * CorporateActionPeriod6.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#PriceCalculationPeriod
	 * CorporateActionPeriod8.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9#PriceCalculationPeriod
	 * PriceInformation9.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#PriceCalculationPeriod
	 * CorporateActionPeriod1.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#PriceCalculationPeriod
	 * CorporateActionPeriod2.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#PriceCalculationPeriod
	 * CorporateActionPeriod10.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#PriceCalculationPeriod
	 * PriceInformation11.PriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#PriceCalculationPeriod
	 * CorporateActionPeriod11.PriceCalculationPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined (For outturn securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceCalculationPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod4.PriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod9.PriceCalculationPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod5.PriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod7.PriceCalculationPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod3.PriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod6.PriceCalculationPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod8.PriceCalculationPeriod, com.tools20022.repository.msg.PriceInformation9.PriceCalculationPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod1.PriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod2.PriceCalculationPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod10.PriceCalculationPeriod, com.tools20022.repository.msg.PriceInformation11.PriceCalculationPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod11.PriceCalculationPeriod);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For outturn securities).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a cash in lieu of share price is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashInLieuOfSharePrice
	 * CorporateActionPrice.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash in lieu of share price is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashInLieuOfSharePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePriceRelatedEvent";
			definition = "Corporate action event for which a cash in lieu of share price is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which an over subscription deposit price is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#OverSubscriptionDepositPrice
	 * CorporateActionPrice.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an over subscription deposit price is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OverSubscriptionDepositPriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPriceRelatedEvent";
			definition = "Corporate action event for which an over subscription deposit price is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a cash value has been provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashValueForTax
	 * CorporateActionPrice.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTaxRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash value has been provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashValueForTaxRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashValueForTaxRelatedEvent";
			definition = "Corporate action event for which a cash value has been provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a maximum price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumPrice
	 * BiddingConditions.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumPriceBiddingConditions";
			definition = "Bidding conditions for which a maximum price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a minimum price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumPrice
	 * BiddingConditions.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a minimum price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumPriceBiddingConditions";
			definition = "Bidding conditions for which a minimum price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MinimumPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the price is obtained.
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
	 * {@linkplain com.tools20022.repository.msg.PriceInformation5#QuotationDate
	 * PriceInformation5.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation7#QuotationDate
	 * PriceInformation7.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation1#QuotationDate
	 * PriceInformation1.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#QuotationDate
	 * PriceInformation2.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation6#QuotationDate
	 * PriceInformation6.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation8#QuotationDate
	 * PriceInformation8.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9#QuotationDate
	 * PriceInformation9.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#QuotationSettingDate
	 * CorporateActionDate4.QuotationSettingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation3#QuotationDate
	 * PriceInformation3.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation4#QuotationDate
	 * PriceInformation4.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#QuotationDate
	 * PriceInformation11.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#QuotationDate
	 * PriceInformation12.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#QuotationDate
	 * PriceInformation13.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16#QuotationDate
	 * PriceInformation16.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation14#QuotationDate
	 * PriceInformation14.QuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the price is obtained."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QuotationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceInformation5.QuotationDate, com.tools20022.repository.msg.PriceInformation7.QuotationDate, com.tools20022.repository.msg.PriceInformation1.QuotationDate,
					com.tools20022.repository.msg.PriceInformation2.QuotationDate, com.tools20022.repository.msg.PriceInformation6.QuotationDate, com.tools20022.repository.msg.PriceInformation8.QuotationDate,
					com.tools20022.repository.msg.PriceInformation9.QuotationDate, com.tools20022.repository.msg.CorporateActionDate4.QuotationSettingDate, com.tools20022.repository.msg.PriceInformation3.QuotationDate,
					com.tools20022.repository.msg.PriceInformation4.QuotationDate, com.tools20022.repository.msg.PriceInformation11.QuotationDate, com.tools20022.repository.msg.PriceInformation12.QuotationDate,
					com.tools20022.repository.msg.PriceInformation13.QuotationDate, com.tools20022.repository.msg.PriceInformation16.QuotationDate, com.tools20022.repository.msg.PriceInformation14.QuotationDate);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate of return on an investment, based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#RedemptionPrice
	 * YieldCalculation.RedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#YieldDetails
	 * Debt1.YieldDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#YieldRange
	 * FinancialInstrumentStipulations.YieldRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#YieldRange
	 * FinancialInstrumentStipulations2.YieldRange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#YieldCalculation
	 * Debt2.YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SingleOrder1#YieldDetails
	 * SingleOrder1.YieldDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#YieldDetails
	 * IndicationOfInterest1.YieldDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of return on an investment, based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.YieldDetails, com.tools20022.repository.msg.FinancialInstrumentStipulations.YieldRange,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.YieldRange, com.tools20022.repository.msg.Debt2.YieldCalculation, com.tools20022.repository.msg.SingleOrder1.YieldDetails,
					com.tools20022.repository.msg.IndicationOfInterest1.YieldDetails);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.RedemptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities financing process for which an end price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#EndPrice
	 * SecuritiesFinancing.EndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing process for which an end price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesFinancing";
			definition = "Securities financing process for which an end price is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.EndPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fund order for which an executed price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedTradePrice
	 * InvestmentFundOrderExecution.ExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToExecutedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an executed price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundOrderRelatedToExecutedPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToExecutedPrice";
			definition = "Fund order for which an executed price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fund order for which an informative price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InformativePrice
	 * InvestmentFundOrderExecution.InformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToInformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an informative price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundOrderRelatedToInformativePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToInformativePrice";
			definition = "Fund order for which an informative price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax voucher for which the cost per share is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ScripDividendReinvestmentPricePerShare
	 * TaxVoucher.ScripDividendReinvestmentPricePerShare}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax voucher for which the cost per share is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the cost per share is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which the trade price is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradePrice
	 * SecuritiesTrade.TradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which the trade price is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade for which the trade price is calculated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value calculation for which a securities pricing is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#Price
	 * NetAssetValueCalculation.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value calculation for which a securities pricing is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Value calculation for which a securities pricing is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * BuyIn process for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#BuyInPrice
	 * BuyIn.BuyInPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BuyIn process for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "BuyIn process for which a price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BuyIn.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.BuyInPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the index information when used for calculating the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#SecuritiesPricing
	 * Index.SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3#Index
	 * BasketDescription3.Index}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the index information when used for calculating the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BasketDescription3.Index);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index information when used for calculating the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which provided the pricing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#Price
	 * InformationPartyRole.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which provided the pricing."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InformationPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provided the pricing.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the price fact type is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PriceFactRelatedPricing
	 * DateTimePeriod.PriceFactRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFactPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the price fact type is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceFactPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFactPeriod";
			definition = "Period during which the price fact type is valid.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculated analytics based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#SecuritiesPricing
	 * AnalyticsCalculation.SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnalyticsCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated analytics based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AnalyticsCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Calculated analytics based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculated duration based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#RelatedSecuritiesPricing
	 * DurationCalculation.RelatedSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated duration based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DurationCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Calculated duration based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.RelatedSecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculated life based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#SecuritiesPricing
	 * LifeCalculation.SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LifeCalculation
	 * LifeCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated  life based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LifeCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Calculated  life based on the price.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time of the price. For CIV, this is the NAV date.
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
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#PriceFixingDate
	 * AmountPricePerFinancialInstrumentQuantity5.PriceFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the price. For CIV, this is the NAV date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.PriceFixingDate);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date/time of the price. For CIV, this is the NAV date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Spread which uses the price as benchmark.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#BenchmarkPrice
	 * Spread.BenchmarkPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread which uses the price as benchmark."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread which uses the price as benchmark.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.BenchmarkPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities order for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderPrice
	 * SecuritiesOrder.OrderPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities order for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Securities order for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a stop price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#StopPrice
	 * SecuritiesOrder.StopPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPriceOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a stop price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StopPriceOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopPriceOrder";
			definition = "Order for which a stop price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.StopPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation process for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedPrice
	 * Allocation.AllocatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Allocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocatedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a previous closing price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#PreviousClosingPrice
	 * SecuritiesOrderParameters.PreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a previous closing price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a previous closing price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which a discount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#OriginalIssueDiscount
	 * Issuance.OriginalIssueDiscount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which a discount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which a discount is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.OriginalIssueDiscount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entitlement for which a strike price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement#StrikePrice
	 * Entitlement.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entitlement
	 * Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitlement for which a strike price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Entitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entitlement";
			definition = "Entitlement for which a strike price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entitlement.StrikePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a cash fractions price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#CashFractionsPrice
	 * SecuritiesDistribution.CashFractionsPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFractionsPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a cash fractions price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashFractionsPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a cash fractions price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a subscription price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#SubscriptionPrice
	 * SecuritiesDistribution.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuscriptionPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a subscription price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SuscriptionPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuscriptionPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a subscription price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a reinvestment price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#ReinvestmentPrice
	 * SecuritiesDistribution.ReinvestmentPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a reinvestment price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReinvestmentPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a reinvestment price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract for which a tick is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Derivative#Tick
	 * Derivative.Tick}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract for which a tick is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedFuture = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFuture";
			definition = "Contract for which a tick is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.Tick;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution for which an offer price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#OfferPrice
	 * Distribution.OfferPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution for which an offer price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution for which an offer price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.OfferPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Redemption schedule for which a change in price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#PriceChange
	 * RedemptionSchedule.PriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption schedule for which a change in price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceChangeRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRedemptionSchedule";
			definition = "Redemption schedule for which a change in price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RedemptionSchedule.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.PriceChange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Redemption schedule for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#Price
	 * RedemptionSchedule.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption schedule for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRedemptionSchedule";
			definition = "Redemption schedule for which a price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RedemptionSchedule.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a previous closing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#PreviousClosingPrice
	 * Quote.PreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a previous closing price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PreviousClosingPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPriceRelatedQuote";
			definition = "Quote which contains a previous closing price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.PreviousClosingPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a requested price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#RequestedPrice
	 * Quote.RequestedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a requested price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RequestedPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedPriceRelatedQuote";
			definition = "Quote which contains a requested price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.RequestedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#Price
	 * Quote.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceRelatedQuote";
			definition = "Quote which contains a price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which contains a market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#MarketPrice
	 * Quote.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a market price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarketPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketPriceRelatedQuote";
			definition = "Quote which contains a market price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MarketPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value of the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#SecuritiesPricing
	 * Price.SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice4#Value
	 * UnitPrice4.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#ValueInInvestmentCurrency
	 * UnitPrice6.ValueInInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#ValueInAlternativeCurrency
	 * UnitPrice6.ValueInAlternativeCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#ValueInInvestmentCurrency
	 * UnitPrice15.ValueInInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#ValueInAlternativeCurrency
	 * UnitPrice15.ValueInAlternativeCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice3#Value
	 * UnitPrice3.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#Value
	 * UnitPrice12.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#Amount
	 * PriceRateOrAmountChoice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmount1Choice#Amount
	 * PriceRateOrAmount1Choice.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice3#PriceValue
	 * AmountPrice3.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#PriceValue
	 * AmountPricePerFinancialInstrumentQuantity3.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#PriceValue
	 * AmountPricePerAmount2.PriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice5#PriceValue
	 * AmountPrice5.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4#PriceValue
	 * AmountPricePerFinancialInstrumentQuantity4.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount3#PriceValue
	 * AmountPricePerAmount3.PriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice2#PriceValue
	 * AmountPrice2.PriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice4#PriceValue
	 * AmountPrice4.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice#Amount
	 * PriceRateOrAmountOrUnknownChoice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice#Amount
	 * PriceRateOrAmountOrUnknown1Choice.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#DealPrice
	 * Order16.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#DealPrice
	 * Order14.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice1Choice#DealPrice
	 * TransactionPrice1Choice.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice2Choice#DealPrice
	 * TransactionPrice2Choice.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#DealPrice
	 * TransactionPrice3Choice.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice1#Value
	 * UnitPrice1.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#Value
	 * UnitPrice5.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#Value
	 * UnitPrice10.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#Value
	 * UnitPrice11.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice1#PriceValue
	 * AmountPrice1.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#PriceValue
	 * AmountPricePerFinancialInstrumentQuantity1.PriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#PriceValue
	 * AmountPricePerAmount1.PriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceAndDirection1#Value
	 * PriceAndDirection1.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4#Value
	 * PriceValueAndRate4.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10#CurrentPrice
	 * PriceInformation10.CurrentPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10#PreviousPrice
	 * PriceInformation10.PreviousPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice16#Value
	 * UnitPrice16.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice17#Value
	 * UnitPrice17.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#PriceValue
	 * AmountPricePerFinancialInstrumentQuantity5.PriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2#LegBidPrice
	 * InstrumentLeg2.LegBidPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#LegOfferPrice
	 * InstrumentLeg2.LegOfferPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg3#LegPrice
	 * InstrumentLeg3.LegPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#DealPrice
	 * Order17.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#DealPrice
	 * Order18.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#Value
	 * UnitPrice20.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19#Value
	 * UnitPrice19.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#MonetaryValue
	 * SecuritiesTransactionPrice2Choice.MonetaryValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#PriceValue
	 * AmountPricePerFinancialInstrumentQuantity6.PriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#Value
	 * UnitPrice21.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7#PriceValue
	 * AmountPricePerFinancialInstrumentQuantity7.PriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#Value
	 * UnitPrice22.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#InstrumentPrice
	 * TransparencyDataReport11.InstrumentPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice4.Value, com.tools20022.repository.msg.UnitPrice6.ValueInInvestmentCurrency, com.tools20022.repository.msg.UnitPrice6.ValueInAlternativeCurrency,
					com.tools20022.repository.msg.UnitPrice15.ValueInInvestmentCurrency, com.tools20022.repository.msg.UnitPrice15.ValueInAlternativeCurrency, com.tools20022.repository.msg.UnitPrice3.Value,
					com.tools20022.repository.msg.UnitPrice12.Value, com.tools20022.repository.choice.PriceRateOrAmountChoice.Amount, com.tools20022.repository.choice.PriceRateOrAmount1Choice.Amount,
					com.tools20022.repository.msg.AmountPrice3.PriceValue, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3.PriceValue, com.tools20022.repository.msg.AmountPricePerAmount2.PriceValue,
					com.tools20022.repository.msg.AmountPrice5.PriceValue, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4.PriceValue, com.tools20022.repository.msg.AmountPricePerAmount3.PriceValue,
					com.tools20022.repository.msg.AmountPrice2.PriceValue, com.tools20022.repository.msg.AmountPrice4.PriceValue, com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice.Amount,
					com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice.Amount, com.tools20022.repository.msg.Order16.DealPrice, com.tools20022.repository.msg.Order14.DealPrice,
					com.tools20022.repository.choice.TransactionPrice1Choice.DealPrice, com.tools20022.repository.choice.TransactionPrice2Choice.DealPrice, com.tools20022.repository.choice.TransactionPrice3Choice.DealPrice,
					com.tools20022.repository.msg.UnitPrice1.Value, com.tools20022.repository.msg.UnitPrice5.Value, com.tools20022.repository.msg.UnitPrice10.Value, com.tools20022.repository.msg.UnitPrice11.Value,
					com.tools20022.repository.msg.AmountPrice1.PriceValue, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1.PriceValue, com.tools20022.repository.msg.AmountPricePerAmount1.PriceValue,
					com.tools20022.repository.msg.PriceAndDirection1.Value, com.tools20022.repository.msg.PriceValueAndRate4.Value, com.tools20022.repository.msg.PriceInformation10.CurrentPrice,
					com.tools20022.repository.msg.PriceInformation10.PreviousPrice, com.tools20022.repository.msg.UnitPrice16.Value, com.tools20022.repository.msg.UnitPrice17.Value,
					com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.PriceValue, com.tools20022.repository.msg.InstrumentLeg2.LegBidPrice, com.tools20022.repository.msg.InstrumentLeg2.LegOfferPrice,
					com.tools20022.repository.msg.InstrumentLeg3.LegPrice, com.tools20022.repository.msg.Order17.DealPrice, com.tools20022.repository.msg.Order18.DealPrice, com.tools20022.repository.msg.UnitPrice20.Value,
					com.tools20022.repository.msg.UnitPrice19.Value, com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.MonetaryValue, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6.PriceValue,
					com.tools20022.repository.msg.UnitPrice21.Value, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7.PriceValue, com.tools20022.repository.msg.UnitPrice22.Value,
					com.tools20022.repository.msg.TransparencyDataReport11.InstrumentPrice);
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Value of the price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action price for which pricing information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#PricingCalculation
	 * CorporateActionPrice.PricingCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action price for which pricing information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionPrice";
			definition = "Corporate action price for which pricing information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPrice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Position for which a price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Position#Price
	 * Position.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position for which a price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPosition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPosition";
			definition = "Position for which a price is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPricing";
				definition = "Characteristics related to the price of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Pricing, com.tools20022.repository.entity.InformationPartyRole.Price, com.tools20022.repository.entity.NetAssetValueCalculation.Price,
						com.tools20022.repository.entity.RedemptionSchedule.PriceChange, com.tools20022.repository.entity.RedemptionSchedule.Price, com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing,
						com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing, com.tools20022.repository.entity.SecuritiesTrade.TradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice, com.tools20022.repository.entity.LotBreakdown.LotPrice, com.tools20022.repository.entity.Price.SecuritiesPricing,
						com.tools20022.repository.entity.ValuationStatistics.PriceChange, com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue, com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue,
						com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice, com.tools20022.repository.entity.Derivative.Tick, com.tools20022.repository.entity.Derivative.ExercisePrice,
						com.tools20022.repository.entity.Issuance.OriginalIssueDiscount, com.tools20022.repository.entity.Index.SecuritiesPricing, com.tools20022.repository.entity.Warrant.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice, com.tools20022.repository.entity.SecuritiesFinancing.EndPrice, com.tools20022.repository.entity.BiddingConditions.MaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.MinimumPrice, com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare,
						com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice, com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct, com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice,
						com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice, com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax,
						com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation, com.tools20022.repository.entity.AmountAndQuantity.SecuritiesPricing, com.tools20022.repository.entity.AmountRatio.SecuritiesPricing,
						com.tools20022.repository.entity.Spread.BenchmarkPrice, com.tools20022.repository.entity.SecuritiesOrder.OrderPrice, com.tools20022.repository.entity.SecuritiesOrder.StopPrice,
						com.tools20022.repository.entity.YieldCalculation.RedemptionPrice, com.tools20022.repository.entity.Allocation.AllocatedPrice, com.tools20022.repository.entity.Distribution.OfferPrice,
						com.tools20022.repository.entity.BuyIn.BuyInPrice, com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice, com.tools20022.repository.entity.Quote.PreviousClosingPrice,
						com.tools20022.repository.entity.Quote.RequestedPrice, com.tools20022.repository.entity.Quote.Price, com.tools20022.repository.entity.Quote.MarketPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice, com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing,
						com.tools20022.repository.entity.DurationCalculation.RelatedSecuritiesPricing, com.tools20022.repository.entity.LifeCalculation.SecuritiesPricing, com.tools20022.repository.entity.Entitlement.StrikePrice,
						com.tools20022.repository.entity.Position.Price);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Price2.Value, com.tools20022.repository.choice.PriceType1Choice.Market, com.tools20022.repository.choice.PriceType1Choice.Indicative,
						com.tools20022.repository.msg.Price3.Value, com.tools20022.repository.choice.PriceType2Choice.Market, com.tools20022.repository.choice.PriceType2Choice.Indicative,
						com.tools20022.repository.msg.PriceInformation5.Value, com.tools20022.repository.msg.PriceInformation7.Value, com.tools20022.repository.msg.PriceInformation1.Value,
						com.tools20022.repository.msg.PriceInformation2.Value, com.tools20022.repository.msg.PriceInformation6.Value, com.tools20022.repository.msg.PriceInformation8.Value,
						com.tools20022.repository.msg.PriceInformation9.Value, com.tools20022.repository.choice.TransactionPrice1Choice.Proprietary, com.tools20022.repository.choice.TransactionPrice2Choice.Proprietary,
						com.tools20022.repository.choice.TransactionPrice3Choice.Proprietary, com.tools20022.repository.msg.PriceRate1.RateType, com.tools20022.repository.msg.PriceInformation10.AmountOfChange,
						com.tools20022.repository.msg.PriceInformation3.Value, com.tools20022.repository.msg.PriceInformation3.PriceType, com.tools20022.repository.msg.PriceInformation4.Value,
						com.tools20022.repository.msg.PriceInformation11.Value, com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.Price, com.tools20022.repository.msg.PriceInformation12.Value,
						com.tools20022.repository.msg.PriceInformation13.Value, com.tools20022.repository.msg.PriceInformation16.Value, com.tools20022.repository.msg.PriceInformation14.Value);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.PriceMethod, com.tools20022.repository.entity.SecuritiesPricing.PriceType,
						com.tools20022.repository.entity.SecuritiesPricing.CumDividendIndicator, com.tools20022.repository.entity.SecuritiesPricing.CalculationBasis,
						com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.Rate,
						com.tools20022.repository.entity.SecuritiesPricing.HighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.LowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.Security, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesPricing.Yielded,
						com.tools20022.repository.entity.SecuritiesPricing.TypeOfRate, com.tools20022.repository.entity.SecuritiesPricing.Derivative, com.tools20022.repository.entity.SecuritiesPricing.RelatedWarrant,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion, com.tools20022.repository.entity.SecuritiesPricing.LotBreakdown, com.tools20022.repository.entity.SecuritiesPricing.TypeOfAmount,
						com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount,
						com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.PriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions,
						com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.QuotationDate,
						com.tools20022.repository.entity.SecuritiesPricing.YieldCalculation, com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.SecuritiesPricing.TaxVoucher, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.NetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedBuyIn, com.tools20022.repository.entity.SecuritiesPricing.Index, com.tools20022.repository.entity.SecuritiesPricing.InformationPartyRole,
						com.tools20022.repository.entity.SecuritiesPricing.PriceFactPeriod, com.tools20022.repository.entity.SecuritiesPricing.AnalyticsCalculation, com.tools20022.repository.entity.SecuritiesPricing.DurationCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.LifeCalculation, com.tools20022.repository.entity.SecuritiesPricing.Date, com.tools20022.repository.entity.SecuritiesPricing.Spread,
						com.tools20022.repository.entity.SecuritiesPricing.Order, com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder, com.tools20022.repository.entity.SecuritiesPricing.Allocation,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedOrder, com.tools20022.repository.entity.SecuritiesPricing.Issuance, com.tools20022.repository.entity.SecuritiesPricing.Entitlement,
						com.tools20022.repository.entity.SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.RelatedFuture,
						com.tools20022.repository.entity.SecuritiesPricing.Distribution, com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedRedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.PreviousClosingPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.RequestedPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.PriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.MarketPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.Price, com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedPosition);
				derivationComponent_lazy = () -> Arrays.asList(PriceValue1.mmObject(), UnitPrice4.mmObject(), UnitPrice6.mmObject(), PriceValue2.mmObject(), UnitPrice15.mmObject(), PriceValue5.mmObject(), UnitPrice3.mmObject(),
						UnitPrice12.mmObject(), YieldedOrValueType1Choice.mmObject(), PriceRateOrAmountChoice.mmObject(), Price2.mmObject(), TypeOfPrice1Choice.mmObject(), TypeOfPrice3Choice.mmObject(), PriceType1Choice.mmObject(),
						PriceRateOrAmount1Choice.mmObject(), Price3.mmObject(), TypeOfPrice5Choice.mmObject(), PriceType2Choice.mmObject(), PercentagePrice1.mmObject(), AmountPrice3.mmObject(), PriceFormat5Choice.mmObject(),
						IndicativeOrMarketPrice2Choice.mmObject(), AmountPricePerFinancialInstrumentQuantity3.mmObject(), AmountPricePerAmount2.mmObject(), PriceFormat9Choice.mmObject(), AmountPrice5.mmObject(),
						PriceFormat17Choice.mmObject(), IndicativeOrMarketPrice4Choice.mmObject(), AmountPricePerFinancialInstrumentQuantity4.mmObject(), AmountPricePerAmount3.mmObject(), PriceFormat18Choice.mmObject(),
						PriceFormat21Choice.mmObject(), PriceFormat24Choice.mmObject(), PriceFormat6Choice.mmObject(), PriceFormat7Choice.mmObject(), PriceFormat12Choice.mmObject(), PriceFormat13Choice.mmObject(), PriceDetails2.mmObject(),
						PriceDetails4.mmObject(), AmountPrice2.mmObject(), PriceDetails7.mmObject(), AmountPrice4.mmObject(), PriceDetails9.mmObject(), PriceDetails11.mmObject(), PriceDetails12.mmObject(), PriceFormat11Choice.mmObject(),
						PriceFormat8Choice.mmObject(), IndicativeOrMarketPrice1Choice.mmObject(), PriceFormat10Choice.mmObject(), PriceFormat15Choice.mmObject(), PriceFormat16Choice.mmObject(), IndicativeOrMarketPrice3Choice.mmObject(),
						PriceFormat14Choice.mmObject(), PriceFormat19Choice.mmObject(), PriceFormat20Choice.mmObject(), IndicativeOrMarketPrice5Choice.mmObject(), PriceFormat23Choice.mmObject(), PriceFormat22Choice.mmObject(),
						PriceDetails3.mmObject(), PriceFormat25Choice.mmObject(), PriceFormat26Choice.mmObject(), IndicativeOrMarketPrice6Choice.mmObject(), PriceFormat27Choice.mmObject(), PriceFormat28Choice.mmObject(),
						PriceDetails5.mmObject(), PriceFormat29Choice.mmObject(), PriceDetails6.mmObject(), PriceFormat31Choice.mmObject(), PriceDetails8.mmObject(), PriceDetails10.mmObject(), PriceDetails13.mmObject(),
						TypeOfPrice2Choice.mmObject(), TypeOfPrice4Choice.mmObject(), PriceRateOrAmountOrUnknownChoice.mmObject(), PriceInformation5.mmObject(), TypeOfPrice7Choice.mmObject(), PriceRateOrAmountOrUnknown1Choice.mmObject(),
						PriceInformation7.mmObject(), PriceInformation1.mmObject(), PriceInformation2.mmObject(), TypeOfPrice6Choice.mmObject(), PriceInformation6.mmObject(), TypeOfPrice8Choice.mmObject(), PriceInformation8.mmObject(),
						Price1.mmObject(), Price4.mmObject(), TypeOfPrice10Choice.mmObject(), PriceInformation9.mmObject(), TransactionPrice1Choice.mmObject(), TransactionPrice2Choice.mmObject(), TransactionPrice3Choice.mmObject(),
						UnitPrice1.mmObject(), UnitPrice5.mmObject(), UnitPrice10.mmObject(), UnitPrice11.mmObject(), AmountPriceType1FormatChoice.mmObject(), AmountPrice1.mmObject(), PriceFormat3Choice.mmObject(),
						PriceFormat4Choice.mmObject(), PriceFormat2Choice.mmObject(), AmountPricePerFinancialInstrumentQuantity1.mmObject(), AmountPricePerAmount1.mmObject(), PriceFormat1Choice.mmObject(), TypeOfPrice27Choice.mmObject(),
						PriceAndDirection1.mmObject(), PriceValueAndRate4.mmObject(), PriceInformation10.mmObject(), UnitPriceType1Choice.mmObject(), PriceInformation3.mmObject(), UnitPrice16.mmObject(), PriceValue6.mmObject(),
						UnitPrice17.mmObject(), AmountPricePerFinancialInstrumentQuantity5.mmObject(), PriceInformation4.mmObject(), PriceFormat33Choice.mmObject(), PriceDetails14.mmObject(), PriceFormat32Choice.mmObject(),
						PriceFormat34Choice.mmObject(), PriceDetails15.mmObject(), PriceInformation11.mmObject(), PriceFormat43Choice.mmObject(), PriceDetails18.mmObject(), PriceDetails21.mmObject(), PriceFormat40Choice.mmObject(),
						PriceFormat39Choice.mmObject(), UnitPrice20.mmObject(), UnitPriceType2Choice.mmObject(), UnitPrice19.mmObject(), Price6.mmObject(), SecuritiesTransactionPrice2Choice.mmObject(), TypeOfPrice29Choice.mmObject(),
						TypeOfPrice30Choice.mmObject(), PriceInformation12.mmObject(), TypeOfPrice28Choice.mmObject(), PriceInformation13.mmObject(), AmountPricePerFinancialInstrumentQuantity6.mmObject(),
						IndicativeOrMarketPrice7Choice.mmObject(), PriceFormat45Choice.mmObject(), PriceFormat50Choice.mmObject(), IndicativeOrMarketPrice8Choice.mmObject(), PriceFormat48Choice.mmObject(), PriceFormat51Choice.mmObject(),
						PriceFormat46Choice.mmObject(), PriceDetails23.mmObject(), PriceFormat49Choice.mmObject(), PriceDetails22.mmObject(), PriceFormat47Choice.mmObject(), PriceFormat44Choice.mmObject(), UnitPrice21.mmObject(),
						TypeOfPrice31Choice.mmObject(), PriceFormat56Choice.mmObject(), PriceFormat57Choice.mmObject(), PriceDetails24.mmObject(), PriceDetails25.mmObject(), IndicativeOrMarketPrice9Choice.mmObject(),
						PriceFormat52Choice.mmObject(), IndicativeOrMarketPrice11Choice.mmObject(), PriceFormat59Choice.mmObject(), PriceFormat55Choice.mmObject(), AmountPricePerFinancialInstrumentQuantity7.mmObject(),
						PriceFormat53Choice.mmObject(), PriceFormat60Choice.mmObject(), PriceFormat58Choice.mmObject(), TypeOfPrice33Choice.mmObject(), PriceInformation16.mmObject(), TypeOfPrice45Choice.mmObject(),
						TypeOfPrice32Choice.mmObject(), PriceInformation14.mmObject(), UnitPrice22.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}