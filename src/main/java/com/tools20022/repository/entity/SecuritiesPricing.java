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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.AmountPriceTypeCode;
import com.tools20022.repository.codeset.PriceMethodCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceMethod
 * SecuritiesPricing.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
 * SecuritiesPricing.mmPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
 * SecuritiesPricing.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCalculationBasis
 * SecuritiesPricing.mmCalculationBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRelatedStatistics
 * SecuritiesPricing.mmPriceChangeRelatedStatistics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
 * SecuritiesPricing.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmHighestPriceValueRelatedStatistics
 * SecuritiesPricing.mmHighestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLowestPriceValueRelatedStatistics
 * SecuritiesPricing.mmLowestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
 * SecuritiesPricing.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTradeExecution
 * SecuritiesPricing.mmSecuritiesTradeExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYielded
 * SecuritiesPricing.mmYielded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfRate
 * SecuritiesPricing.mmTypeOfRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDerivative
 * SecuritiesPricing.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedWarrant
 * SecuritiesPricing.mmRelatedWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesConversion
 * SecuritiesPricing.mmRelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLotBreakdown
 * SecuritiesPricing.mmLotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfAmount
 * SecuritiesPricing.mmTypeOfAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
 * SecuritiesPricing.mmAmountPricePerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumPriceBiddingConditions
 * SecuritiesPricing.mmMaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumPriceBiddingConditions
 * SecuritiesPricing.mmMinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
 * SecuritiesPricing.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
 * SecuritiesPricing.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesFinancing
 * SecuritiesPricing.mmRelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
 * SecuritiesPricing.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
 * SecuritiesPricing.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmNetAssetValueCalculation
 * SecuritiesPricing.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedBuyIn
 * SecuritiesPricing.mmRelatedBuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
 * SecuritiesPricing.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmInformationPartyRole
 * SecuritiesPricing.mmInformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceFactPeriod
 * SecuritiesPricing.mmPriceFactPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAnalyticsCalculation
 * SecuritiesPricing.mmAnalyticsCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDurationCalculation
 * SecuritiesPricing.mmDurationCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLifeCalculation
 * SecuritiesPricing.mmLifeCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDate
 * SecuritiesPricing.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSpread
 * SecuritiesPricing.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOrder
 * SecuritiesPricing.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmStopPriceOrder
 * SecuritiesPricing.mmStopPriceOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAllocation
 * SecuritiesPricing.mmAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedOrder
 * SecuritiesPricing.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIssuance
 * SecuritiesPricing.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmEntitlement
 * SecuritiesPricing.mmEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashFractionsPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSuscriptionPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmReinvestmentPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedFuture
 * SecuritiesPricing.mmRelatedFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDistribution
 * SecuritiesPricing.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRedemptionSchedule
 * SecuritiesPricing.mmPriceChangeRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedRedemptionSchedule
 * SecuritiesPricing.mmRelatedRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPreviousClosingPriceRelatedQuote
 * SecuritiesPricing.mmPreviousClosingPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRequestedPriceRelatedQuote
 * SecuritiesPricing.mmRequestedPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceRelatedQuote
 * SecuritiesPricing.mmPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMarketPriceRelatedQuote
 * SecuritiesPricing.mmMarketPriceRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
 * SecuritiesPricing.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedPosition
 * SecuritiesPricing.mmRelatedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumCashToInstructRelatedEvent
 * SecuritiesPricing.mmMinimumCashToInstructRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumCashToInstructRelatedEvent
 * SecuritiesPricing.mmMaximumCashToInstructRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumMultipleCashToInstructRelatedEvent
 * SecuritiesPricing.mmMinimumMultipleCashToInstructRelatedEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPricing
 * Security.mmPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmPrice
 * InformationPartyRole.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
 * NetAssetValueCalculation.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChange
 * RedemptionSchedule.mmPriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPrice
 * RedemptionSchedule.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
 * SecuritiesTrade.mmTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
 * InvestmentFundOrderExecution.mmInformativePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
 * LotBreakdown.mmLotPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
 * Price.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
 * ValuationStatistics.mmPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
 * ValuationStatistics.mmHighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
 * ValuationStatistics.mmLowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
 * SecuritiesTradeExecution.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmTick
 * Derivative.mmTick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
 * Derivative.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmOriginalIssueDiscount
 * Issuance.mmOriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
 * Index.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
 * Warrant.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
 * SecuritiesConversion.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
 * SecuritiesFinancing.mmEndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
 * BiddingConditions.mmMaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
 * BiddingConditions.mmMinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
 * CorporateActionPrice.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
 * CorporateActionPrice.mmPricingCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumMultipleCashToInstruct
 * CorporateActionPrice.mmMinimumMultipleCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMaximumCashToInstruct
 * CorporateActionPrice.mmMaximumCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumCashToInstruct
 * CorporateActionPrice.mmMinimumCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmSecuritiesPricing
 * AmountAndQuantity.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmSecuritiesPricing
 * AmountRatio.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
 * Spread.mmBenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
 * SecuritiesOrder.mmOrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
 * SecuritiesOrder.mmStopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
 * YieldCalculation.mmRedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedPrice
 * Allocation.mmAllocatedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmOfferPrice
 * Distribution.mmOfferPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
 * BuyIn.mmBuyInPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
 * Quote.mmPreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
 * Quote.mmRequestedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
 * Quote.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmCashFractionsPrice
 * SecuritiesDistribution.mmCashFractionsPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSubscriptionPrice
 * SecuritiesDistribution.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentPrice
 * SecuritiesDistribution.mmReinvestmentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmSecuritiesPricing
 * AnalyticsCalculation.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmRelatedSecuritiesPricing
 * DurationCalculation.mmRelatedSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmSecuritiesPricing
 * LifeCalculation.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#mmStrikePrice
 * Entitlement.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmPrice
 * Position.mmPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Price2#mmValue Price2.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType1Choice#mmMarket
 * PriceType1Choice.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceType1Choice#mmIndicative
 * PriceType1Choice.mmIndicative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price3#mmValue Price3.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType2Choice#mmMarket
 * PriceType2Choice.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceType2Choice#mmIndicative
 * PriceType2Choice.mmIndicative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation5#mmValue
 * PriceInformation5.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation7#mmValue
 * PriceInformation7.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation1#mmValue
 * PriceInformation1.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2#mmValue
 * PriceInformation2.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation6#mmValue
 * PriceInformation6.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation8#mmValue
 * PriceInformation8.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation9#mmValue
 * PriceInformation9.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice1Choice#mmProprietary
 * TransactionPrice1Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice2Choice#mmProprietary
 * TransactionPrice2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#mmProprietary
 * TransactionPrice3Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceRate1#mmRateType
 * PriceRate1.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmAmountOfChange
 * PriceInformation10.mmAmountOfChange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation3#mmValue
 * PriceInformation3.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation3#mmPriceType
 * PriceInformation3.mmPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation4#mmValue
 * PriceInformation4.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11#mmValue
 * PriceInformation11.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#mmPrice
 * FinancialInstrumentAggregateBalance1.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12#mmValue
 * PriceInformation12.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13#mmValue
 * PriceInformation13.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16#mmValue
 * PriceInformation16.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation14#mmValue
 * PriceInformation14.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation18#mmValue
 * PriceInformation18.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price7#mmValue Price7.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType4Choice#mmMarket
 * PriceType4Choice.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceType4Choice#mmIndicative
 * PriceType4Choice.mmIndicative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionPrice4Choice#mmProprietary
 * TransactionPrice4Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType5Choice#mmMarket
 * PriceType5Choice.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceType5Choice#mmIndicative
 * PriceType5Choice.mmIndicative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation19#mmValue
 * PriceInformation19.mmValue}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8
 * AmountPricePerFinancialInstrumentQuantity8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22 UnitPrice22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice23 UnitPrice23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation18
 * PriceInformation18}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceRateOrAmount3Choice
 * PriceRateOrAmount3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price7 Price7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType4Choice
 * PriceType4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown2Choice
 * PriceRateOrAmountOrUnknown2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat61Choice
 * PriceFormat61Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice6 AmountPrice6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionPrice4Choice
 * TransactionPrice4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType5Choice
 * PriceType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation19
 * PriceInformation19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice
 * PriceRateOrAmountOrUnknown3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat62Choice
 * PriceFormat62Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice7 AmountPrice7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesPricing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics related to the price of the security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesPricing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceMethodCode priceMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmPriceMethod
	 * ValuationDealingProcessingCharacteristics.mmPriceMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmPriceMethod
	 * ValuationDealingProcessingCharacteristics2.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmPriceMethod
	 * UnitPrice6.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmPriceMethod
	 * UnitPrice15.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice3#mmPriceMethod
	 * UnitPrice3.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#mmPriceMethod
	 * UnitPrice12.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice1#mmPriceMethod
	 * UnitPrice1.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#mmPriceMethod
	 * UnitPrice5.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmPriceMethod
	 * UnitPrice10.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#mmPriceMethod
	 * UnitPrice11.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#mmPriceMethod
	 * UnitPrice20.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmPriceMethod
	 * UnitPrice21.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmPriceMethod
	 * UnitPrice22.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice23#mmPriceMethod
	 * UnitPrice23.mmPriceMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, PriceMethodCode> mmPriceMethod = new MMBusinessAttribute<SecuritiesPricing, PriceMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ValuationDealingProcessingCharacteristics.mmPriceMethod, ValuationDealingProcessingCharacteristics2.mmPriceMethod, UnitPrice6.mmPriceMethod, UnitPrice15.mmPriceMethod,
					UnitPrice3.mmPriceMethod, UnitPrice12.mmPriceMethod, UnitPrice1.mmPriceMethod, UnitPrice5.mmPriceMethod, UnitPrice10.mmPriceMethod, UnitPrice11.mmPriceMethod, UnitPrice20.mmPriceMethod, UnitPrice21.mmPriceMethod,
					UnitPrice22.mmPriceMethod, UnitPrice23.mmPriceMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceMethodCode.mmObject();
		}

		@Override
		public PriceMethodCode getValue(SecuritiesPricing obj) {
			return obj.getPriceMethod();
		}

		@Override
		public void setValue(SecuritiesPricing obj, PriceMethodCode value) {
			obj.setPriceMethod(value);
		}
	};
	protected TypeOfPriceCode priceType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice4#mmType
	 * UnitPrice4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmType
	 * UnitPrice6.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmType
	 * UnitPrice15.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedType
	 * UnitPrice15.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice3#mmPriceType
	 * UnitPrice3.mmPriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#mmType
	 * UnitPrice12.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#mmExtendedType
	 * UnitPrice12.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price2#mmType
	 * Price2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice1Choice#mmCode
	 * TypeOfPrice1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice1Choice#mmProprietary
	 * TypeOfPrice1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice3Choice#mmCode
	 * TypeOfPrice3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice3Choice#mmProprietary
	 * TypeOfPrice3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmTypeOfPrice
	 * SecuritiesTradeDetails25.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#mmTypeOfPrice
	 * QuantityBreakdown3.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#mmTypeOfPrice
	 * QuantityBreakdown13.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmTypeOfPrice
	 * SecuritiesTradeDetails26.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price3#mmType
	 * Price3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice5Choice#mmCode
	 * TypeOfPrice5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice5Choice#mmProprietary
	 * TypeOfPrice5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmTypeOfPrice
	 * SecuritiesTradeDetails27.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#mmTypeOfPrice
	 * QuantityBreakdown18.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmTypeOfPrice
	 * SecuritiesTradeDetails28.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#mmTypeOfPrice
	 * QuantityBreakdown9.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice2Choice#mmCode
	 * TypeOfPrice2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice2Choice#mmProprietary
	 * TypeOfPrice2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice4Choice#mmCode
	 * TypeOfPrice4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice4Choice#mmProprietary
	 * TypeOfPrice4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation5#mmType
	 * PriceInformation5.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmTypeOfPrice
	 * QuantityBreakdown4.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice7Choice#mmCode
	 * TypeOfPrice7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice7Choice#mmProprietary
	 * TypeOfPrice7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation7#mmType
	 * PriceInformation7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmTypeOfPrice
	 * QuantityBreakdown8.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation1#mmType
	 * PriceInformation1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2#mmType
	 * PriceInformation2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmExtendedType
	 * PriceInformation2.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmTypeOfPrice
	 * QuantityBreakdown14.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmTypeOfPrice
	 * QuantityBreakdown19.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmTypeOfPrice
	 * QuantityBreakdown24.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmTypeOfPrice
	 * QuantityBreakdown25.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#mmTypeOfPrice
	 * QuantityBreakdown7.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#mmTypeOfPrice
	 * QuantityBreakdown23.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#mmTypeOfPrice
	 * QuantityBreakdown26.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmTypeOfPrice
	 * SecuritiesTradeDetails2.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmTypeOfPrice
	 * SecuritiesTradeDetails16.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#mmTypeOfPrice
	 * QuantityBreakdown10.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#mmTypeOfPrice
	 * QuantityBreakdown16.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#mmTypeOfPrice
	 * QuantityBreakdown21.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTypeOfPrice
	 * SecuritiesTradeDetails1.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmTypeOfPrice
	 * SecuritiesTradeDetails15.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice6Choice#mmCode
	 * TypeOfPrice6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice6Choice#mmProprietary
	 * TypeOfPrice6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation6#mmType
	 * PriceInformation6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice8Choice#mmCode
	 * TypeOfPrice8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice8Choice#mmProprietary
	 * TypeOfPrice8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation8#mmType
	 * PriceInformation8.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price1#mmPriceType
	 * Price1.mmPriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price4#mmType
	 * Price4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice#mmCode
	 * TypeOfPrice10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice#mmProprietary
	 * TypeOfPrice10Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmTypeOfPrice
	 * Order16.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmTypeOfPrice
	 * Order14.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice1#mmType
	 * UnitPrice1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#mmType
	 * UnitPrice5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmType
	 * UnitPrice10.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmExtendedType
	 * UnitPrice10.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#mmType
	 * UnitPrice11.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#mmExtendedType
	 * UnitPrice11.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmTypeOfPrice
	 * SecuritiesTradeDetails8.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmTypeOfPrice
	 * SecuritiesTradeDetails18.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmTypeOfPrice
	 * SecuritiesTradeDetails4.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmTypeOfPrice
	 * SecuritiesTradeDetails17.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmTypeOfPrice
	 * SecuritiesTradeDetails9.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmTypeOfPrice
	 * SecuritiesTradeDetails21.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmTypeOfPrice
	 * SecuritiesTradeDetails10.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmTypeOfPrice
	 * SecuritiesTradeDetails22.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmTypeOfPrice
	 * SecuritiesTradeDetails23.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmTypeOfPrice
	 * SecuritiesTradeDetails29.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice#mmCode
	 * TypeOfPrice27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice#mmProprietary
	 * TypeOfPrice27Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation10#mmType
	 * PriceInformation10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType1Choice#mmType
	 * UnitPriceType1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType1Choice#mmProprietary
	 * UnitPriceType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice16#mmUnitPriceType
	 * UnitPrice16.mmUnitPriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice17#mmType
	 * UnitPrice17.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmTypeOfPrice
	 * QuantityBreakDown2.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation4#mmType
	 * PriceInformation4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmTypeOfPrice
	 * QuantityBreakDown1.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmTypeOfPrice
	 * SecuritiesTradeDetails31.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTypeOfPrice
	 * SecuritiesTradeDetails33.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmTypeOfPrice
	 * SecuritiesTradeDetails35.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmTypeOfPrice
	 * SecuritiesTradeDetails36.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmTypeOfPrice
	 * SecuritiesTradeDetails34.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmTypeOfPrice
	 * SecuritiesTradeDetails32.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmTypeOfPrice
	 * Order17.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmTypeOfPrice
	 * Order18.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmTypeOfPrice
	 * SecuritiesTradeDetails44.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmTypeOfPrice
	 * SecuritiesTradeDetails43.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmTypeOfPrice
	 * SecuritiesTradeDetails41.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmTypeOfPrice
	 * SecuritiesTradeDetails42.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmTypeOfPrice
	 * SecuritiesTradeDetails46.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmTypeOfPrice
	 * SecuritiesTradeDetails47.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#mmPriceType
	 * UnitPrice20.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType2Choice#mmCode
	 * UnitPriceType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType2Choice#mmProprietary
	 * UnitPriceType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19#mmPriceType
	 * UnitPrice19.mmPriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price6#mmType
	 * Price6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmTypeOfPrice
	 * SecuritiesTradeDetails49.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTypeOfPrice
	 * SecuritiesTradeDetails51.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTypeOfPrice
	 * SecuritiesTradeDetails53.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmTypeOfPrice
	 * SecuritiesTradeDetails54.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmTypeOfPrice
	 * QuantityBreakdown27.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#mmTypeOfPrice
	 * QuantityBreakdown30.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#mmTypeOfPrice
	 * QuantityBreakdown29.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice#mmCode
	 * TypeOfPrice29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice#mmProprietary
	 * TypeOfPrice29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice#mmCode
	 * TypeOfPrice30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice#mmProprietary
	 * TypeOfPrice30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTypeOfPrice
	 * SecuritiesTradeDetails52.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12#mmType
	 * PriceInformation12.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmTypeOfPrice
	 * QuantityBreakdown28.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice#mmCode
	 * TypeOfPrice28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice#mmProprietary
	 * TypeOfPrice28Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13#mmType
	 * PriceInformation13.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTypeOfPrice
	 * SecuritiesTradeDetails50.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmType
	 * UnitPrice21.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice#mmCode
	 * TypeOfPrice31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice#mmProprietary
	 * TypeOfPrice31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmTypeOfPrice
	 * SecuritiesTradeDetails61.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTypeOfPrice
	 * SecuritiesTradeDetails63.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTypeOfPrice
	 * SecuritiesTradeDetails62.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmTypeOfPrice
	 * SecuritiesTradeDetails60.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#mmTypeOfPrice
	 * QuantityBreakdown40.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmTypeOfPrice
	 * QuantityBreakdown39.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice33Choice#mmCode
	 * TypeOfPrice33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice33Choice#mmProprietary
	 * TypeOfPrice33Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16#mmType
	 * PriceInformation16.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice45Choice#mmCode
	 * TypeOfPrice45Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice45Choice#mmProprietary
	 * TypeOfPrice45Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#mmTypeOfPrice
	 * QuantityBreakdown38.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice32Choice#mmCode
	 * TypeOfPrice32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice32Choice#mmProprietary
	 * TypeOfPrice32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#mmTypeOfPrice
	 * QuantityBreakdown44.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation14#mmType
	 * PriceInformation14.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmTypeOfPrice
	 * SecuritiesTradeDetails65.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmTypeOfPrice
	 * SecuritiesTradeDetails66.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmType
	 * UnitPrice22.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice46Choice#mmCode
	 * TypeOfPrice46Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice46Choice#mmProprietary
	 * TypeOfPrice46Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmFinalPriceType
	 * DerivativeCommodity2.mmFinalPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTypeOfPrice
	 * SecuritiesTradeDetails67.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmTypeOfPrice
	 * SecuritiesTradeDetails68.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmTypeOfPrice
	 * SecuritiesTradeDetails69.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmTypeOfPrice
	 * SecuritiesTradeDetails70.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice23#mmType
	 * UnitPrice23.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmTypeOfPrice
	 * SecuritiesTradeDetails71.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmTypeOfPrice
	 * SecuritiesTradeDetails73.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmTypeOfPrice
	 * SecuritiesTradeDetails75.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmTypeOfPrice
	 * SecuritiesTradeDetails76.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmTypeOfPrice
	 * SecuritiesTradeDetails78.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmTypeOfPrice
	 * SecuritiesTradeDetails79.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmTypeOfPrice
	 * SecuritiesTradeDetails80.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown46#mmTypeOfPrice
	 * QuantityBreakdown46.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown47#mmTypeOfPrice
	 * QuantityBreakdown47.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation18#mmType
	 * PriceInformation18.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price7#mmType
	 * Price7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown48#mmTypeOfPrice
	 * QuantityBreakdown48.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails84#mmTypeOfPrice
	 * SecuritiesTradeDetails84.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmTypeOfPrice
	 * SecuritiesTradeDetails85.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmTypeOfPrice
	 * SecuritiesTradeDetails86.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown52#mmTypeOfPrice
	 * QuantityBreakdown52.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmTypeOfPrice
	 * SecuritiesTradeDetails87.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmTypeOfPrice
	 * SecuritiesTradeDetails88.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmTypeOfPrice
	 * SecuritiesTradeDetails89.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmTypeOfPrice
	 * SecuritiesTradeDetails90.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation19#mmType
	 * PriceInformation19.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, TypeOfPriceCode> mmPriceType = new MMBusinessAttribute<SecuritiesPricing, TypeOfPriceCode>() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice4.mmType, UnitPrice6.mmType, UnitPrice15.mmType, UnitPrice15.mmExtendedType, UnitPrice3.mmPriceType, UnitPrice12.mmType, UnitPrice12.mmExtendedType, Price2.mmType,
					TypeOfPrice1Choice.mmCode, TypeOfPrice1Choice.mmProprietary, TypeOfPrice3Choice.mmCode, TypeOfPrice3Choice.mmProprietary, SecuritiesTradeDetails25.mmTypeOfPrice, QuantityBreakdown3.mmTypeOfPrice,
					QuantityBreakdown13.mmTypeOfPrice, SecuritiesTradeDetails26.mmTypeOfPrice, Price3.mmType, TypeOfPrice5Choice.mmCode, TypeOfPrice5Choice.mmProprietary, SecuritiesTradeDetails27.mmTypeOfPrice,
					QuantityBreakdown18.mmTypeOfPrice, SecuritiesTradeDetails28.mmTypeOfPrice, QuantityBreakdown9.mmTypeOfPrice, TypeOfPrice2Choice.mmCode, TypeOfPrice2Choice.mmProprietary, TypeOfPrice4Choice.mmCode,
					TypeOfPrice4Choice.mmProprietary, PriceInformation5.mmType, QuantityBreakdown4.mmTypeOfPrice, TypeOfPrice7Choice.mmCode, TypeOfPrice7Choice.mmProprietary, PriceInformation7.mmType, QuantityBreakdown8.mmTypeOfPrice,
					PriceInformation1.mmType, PriceInformation2.mmType, PriceInformation2.mmExtendedType, QuantityBreakdown14.mmTypeOfPrice, QuantityBreakdown19.mmTypeOfPrice, QuantityBreakdown24.mmTypeOfPrice,
					QuantityBreakdown25.mmTypeOfPrice, QuantityBreakdown7.mmTypeOfPrice, QuantityBreakdown23.mmTypeOfPrice, QuantityBreakdown26.mmTypeOfPrice, SecuritiesTradeDetails2.mmTypeOfPrice, SecuritiesTradeDetails16.mmTypeOfPrice,
					QuantityBreakdown10.mmTypeOfPrice, QuantityBreakdown16.mmTypeOfPrice, QuantityBreakdown21.mmTypeOfPrice, SecuritiesTradeDetails1.mmTypeOfPrice, SecuritiesTradeDetails15.mmTypeOfPrice, TypeOfPrice6Choice.mmCode,
					TypeOfPrice6Choice.mmProprietary, PriceInformation6.mmType, TypeOfPrice8Choice.mmCode, TypeOfPrice8Choice.mmProprietary, PriceInformation8.mmType, Price1.mmPriceType, Price4.mmType, TypeOfPrice10Choice.mmCode,
					TypeOfPrice10Choice.mmProprietary, Order16.mmTypeOfPrice, Order14.mmTypeOfPrice, UnitPrice1.mmType, UnitPrice5.mmType, UnitPrice10.mmType, UnitPrice10.mmExtendedType, UnitPrice11.mmType, UnitPrice11.mmExtendedType,
					SecuritiesTradeDetails8.mmTypeOfPrice, SecuritiesTradeDetails18.mmTypeOfPrice, SecuritiesTradeDetails4.mmTypeOfPrice, SecuritiesTradeDetails17.mmTypeOfPrice, SecuritiesTradeDetails9.mmTypeOfPrice,
					SecuritiesTradeDetails21.mmTypeOfPrice, SecuritiesTradeDetails10.mmTypeOfPrice, SecuritiesTradeDetails22.mmTypeOfPrice, SecuritiesTradeDetails23.mmTypeOfPrice, SecuritiesTradeDetails29.mmTypeOfPrice,
					TypeOfPrice27Choice.mmCode, TypeOfPrice27Choice.mmProprietary, PriceInformation10.mmType, UnitPriceType1Choice.mmType, UnitPriceType1Choice.mmProprietary, UnitPrice16.mmUnitPriceType, UnitPrice17.mmType,
					QuantityBreakDown2.mmTypeOfPrice, PriceInformation4.mmType, QuantityBreakDown1.mmTypeOfPrice, SecuritiesTradeDetails31.mmTypeOfPrice, SecuritiesTradeDetails33.mmTypeOfPrice, SecuritiesTradeDetails35.mmTypeOfPrice,
					SecuritiesTradeDetails36.mmTypeOfPrice, SecuritiesTradeDetails34.mmTypeOfPrice, SecuritiesTradeDetails32.mmTypeOfPrice, Order17.mmTypeOfPrice, Order18.mmTypeOfPrice, SecuritiesTradeDetails44.mmTypeOfPrice,
					SecuritiesTradeDetails43.mmTypeOfPrice, SecuritiesTradeDetails41.mmTypeOfPrice, SecuritiesTradeDetails42.mmTypeOfPrice, SecuritiesTradeDetails46.mmTypeOfPrice, SecuritiesTradeDetails47.mmTypeOfPrice,
					UnitPrice20.mmPriceType, UnitPriceType2Choice.mmCode, UnitPriceType2Choice.mmProprietary, UnitPrice19.mmPriceType, Price6.mmType, SecuritiesTradeDetails49.mmTypeOfPrice, SecuritiesTradeDetails51.mmTypeOfPrice,
					SecuritiesTradeDetails53.mmTypeOfPrice, SecuritiesTradeDetails54.mmTypeOfPrice, QuantityBreakdown27.mmTypeOfPrice, QuantityBreakdown30.mmTypeOfPrice, QuantityBreakdown29.mmTypeOfPrice, TypeOfPrice29Choice.mmCode,
					TypeOfPrice29Choice.mmProprietary, TypeOfPrice30Choice.mmCode, TypeOfPrice30Choice.mmProprietary, SecuritiesTradeDetails52.mmTypeOfPrice, PriceInformation12.mmType, QuantityBreakdown28.mmTypeOfPrice,
					TypeOfPrice28Choice.mmCode, TypeOfPrice28Choice.mmProprietary, PriceInformation13.mmType, SecuritiesTradeDetails50.mmTypeOfPrice, UnitPrice21.mmType, TypeOfPrice31Choice.mmCode, TypeOfPrice31Choice.mmProprietary,
					SecuritiesTradeDetails61.mmTypeOfPrice, SecuritiesTradeDetails63.mmTypeOfPrice, SecuritiesTradeDetails62.mmTypeOfPrice, SecuritiesTradeDetails60.mmTypeOfPrice, QuantityBreakdown40.mmTypeOfPrice,
					QuantityBreakdown39.mmTypeOfPrice, TypeOfPrice33Choice.mmCode, TypeOfPrice33Choice.mmProprietary, PriceInformation16.mmType, TypeOfPrice45Choice.mmCode, TypeOfPrice45Choice.mmProprietary,
					QuantityBreakdown38.mmTypeOfPrice, TypeOfPrice32Choice.mmCode, TypeOfPrice32Choice.mmProprietary, QuantityBreakdown44.mmTypeOfPrice, PriceInformation14.mmType, SecuritiesTradeDetails65.mmTypeOfPrice,
					SecuritiesTradeDetails66.mmTypeOfPrice, UnitPrice22.mmType, TypeOfPrice46Choice.mmCode, TypeOfPrice46Choice.mmProprietary, DerivativeCommodity2.mmFinalPriceType, SecuritiesTradeDetails67.mmTypeOfPrice,
					SecuritiesTradeDetails68.mmTypeOfPrice, SecuritiesTradeDetails69.mmTypeOfPrice, SecuritiesTradeDetails70.mmTypeOfPrice, UnitPrice23.mmType, SecuritiesTradeDetails71.mmTypeOfPrice, SecuritiesTradeDetails73.mmTypeOfPrice,
					SecuritiesTradeDetails75.mmTypeOfPrice, SecuritiesTradeDetails76.mmTypeOfPrice, SecuritiesTradeDetails78.mmTypeOfPrice, SecuritiesTradeDetails79.mmTypeOfPrice, SecuritiesTradeDetails80.mmTypeOfPrice,
					QuantityBreakdown46.mmTypeOfPrice, QuantityBreakdown47.mmTypeOfPrice, PriceInformation18.mmType, Price7.mmType, QuantityBreakdown48.mmTypeOfPrice, SecuritiesTradeDetails84.mmTypeOfPrice,
					SecuritiesTradeDetails85.mmTypeOfPrice, SecuritiesTradeDetails86.mmTypeOfPrice, QuantityBreakdown52.mmTypeOfPrice, SecuritiesTradeDetails87.mmTypeOfPrice, SecuritiesTradeDetails88.mmTypeOfPrice,
					SecuritiesTradeDetails89.mmTypeOfPrice, SecuritiesTradeDetails90.mmTypeOfPrice, PriceInformation19.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}

		@Override
		public TypeOfPriceCode getValue(SecuritiesPricing obj) {
			return obj.getPriceType();
		}

		@Override
		public void setValue(SecuritiesPricing obj, TypeOfPriceCode value) {
			obj.setPriceType(value);
		}
	};
	protected YesNoIndicator cumDividendIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmCumDividendIndicator
	 * UnitPrice6.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmCumDividendIndicator
	 * UnitPrice15.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmCumDividendIndicator
	 * RedemptionExecution3.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmCumDividendIndicator
	 * RedemptionExecution5.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmCumDividendIndicator
	 * RedemptionExecution4.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCumDividendIndicator
	 * RedemptionExecution6.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmCumDividendIndicator
	 * InvestmentFundTransaction2.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCumDividendIndicator
	 * InvestmentFundTransaction3.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmCumDividendIndicator
	 * SubscriptionExecution3.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmCumDividendIndicator
	 * SubscriptionExecution5.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmCumDividendIndicator
	 * SubscriptionExecution4.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCumDividendIndicator
	 * SubscriptionExecution6.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmCumDividendIndicator
	 * SwitchRedemptionLegExecution2.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmCumDividendIndicator
	 * SwitchSubscriptionLegExecution2.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmCumDividendIndicator
	 * SwitchRedemptionLegExecution3.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmCumDividendIndicator
	 * SwitchSubscriptionLegExecution3.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmCumDividendIndicator
	 * RedemptionExecution12.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmCumDividendIndicator
	 * SubscriptionExecution9.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCumDividendIndicator
	 * InvestmentFundTransaction4.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCumDividendIndicator
	 * SubscriptionExecution13.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmCumDividendIndicator
	 * SubscriptionExecution12.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCumDividendIndicator
	 * RedemptionExecution16.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmCumDividendIndicator
	 * SwitchSubscriptionLegExecution4.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCumDividendIndicator
	 * RedemptionExecution15.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmCumDividendIndicator
	 * SwitchRedemptionLegExecution4.mmCumDividendIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, YesNoIndicator> mmCumDividendIndicator = new MMBusinessAttribute<SecuritiesPricing, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice6.mmCumDividendIndicator, UnitPrice15.mmCumDividendIndicator, RedemptionExecution3.mmCumDividendIndicator, RedemptionExecution5.mmCumDividendIndicator,
					RedemptionExecution4.mmCumDividendIndicator, RedemptionExecution6.mmCumDividendIndicator, InvestmentFundTransaction2.mmCumDividendIndicator, InvestmentFundTransaction3.mmCumDividendIndicator,
					SubscriptionExecution3.mmCumDividendIndicator, SubscriptionExecution5.mmCumDividendIndicator, SubscriptionExecution4.mmCumDividendIndicator, SubscriptionExecution6.mmCumDividendIndicator,
					SwitchRedemptionLegExecution2.mmCumDividendIndicator, SwitchSubscriptionLegExecution2.mmCumDividendIndicator, SwitchRedemptionLegExecution3.mmCumDividendIndicator, SwitchSubscriptionLegExecution3.mmCumDividendIndicator,
					RedemptionExecution12.mmCumDividendIndicator, SubscriptionExecution9.mmCumDividendIndicator, InvestmentFundTransaction4.mmCumDividendIndicator, SubscriptionExecution13.mmCumDividendIndicator,
					SubscriptionExecution12.mmCumDividendIndicator, RedemptionExecution16.mmCumDividendIndicator, SwitchSubscriptionLegExecution4.mmCumDividendIndicator, RedemptionExecution15.mmCumDividendIndicator,
					SwitchRedemptionLegExecution4.mmCumDividendIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesPricing obj) {
			return obj.getCumDividendIndicator();
		}

		@Override
		public void setValue(SecuritiesPricing obj, YesNoIndicator value) {
			obj.setCumDividendIndicator(value);
		}
	};
	protected PercentageRate calculationBasis;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmCalculationBasis
	 * UnitPrice6.mmCalculationBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmCalculationBasis
	 * UnitPrice15.mmCalculationBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied on the non-adjusted price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, PercentageRate> mmCalculationBasis = new MMBusinessAttribute<SecuritiesPricing, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice6.mmCalculationBasis, UnitPrice15.mmCalculationBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Ratio applied on the non-adjusted price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(SecuritiesPricing obj) {
			return obj.getCalculationBasis();
		}

		@Override
		public void setValue(SecuritiesPricing obj, PercentageRate value) {
			obj.setCalculationBasis(value);
		}
	};
	protected List<ValuationStatistics> priceChangeRelatedStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
	 * ValuationStatistics.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a change of price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<ValuationStatistics>> mmPriceChangeRelatedStatistics = new MMBusinessAssociationEnd<SecuritiesPricing, List<ValuationStatistics>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRelatedStatistics";
			definition = "Valuation statistics for which a change of price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> ValuationStatistics.mmPriceChange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ValuationStatistics.mmObject();
		}

		@Override
		public List<ValuationStatistics> getValue(SecuritiesPricing obj) {
			return obj.getPriceChangeRelatedStatistics();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<ValuationStatistics> value) {
			obj.setPriceChangeRelatedStatistics(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue2#mmRate
	 * PriceValue2.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueChange1#mmRate
	 * PriceValueChange1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#mmRate
	 * PriceRateOrAmountChoice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmount1Choice#mmRate
	 * PriceRateOrAmount1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentagePrice1#mmPriceValue
	 * PercentagePrice1.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice#mmPercentagePrice
	 * PriceFormat5Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#mmPercentagePrice
	 * PriceFormat9Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat17Choice#mmPercentagePrice
	 * PriceFormat17Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#mmPercentagePrice
	 * PriceFormat18Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#mmPercentagePrice
	 * PriceFormat21Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#mmPercentagePrice
	 * PriceFormat24Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice#mmPercentagePrice
	 * PriceFormat6Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmPercentagePrice
	 * PriceFormat7Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat12Choice#mmPercentagePrice
	 * PriceFormat12Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#mmPercentagePrice
	 * PriceFormat13Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat11Choice#mmPercentagePrice
	 * PriceFormat11Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat8Choice#mmPercentagePrice
	 * PriceFormat8Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#mmPercentagePrice
	 * PriceFormat10Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat15Choice#mmPercentagePrice
	 * PriceFormat15Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat16Choice#mmPercentagePrice
	 * PriceFormat16Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#mmPercentagePrice
	 * PriceFormat14Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat19Choice#mmPercentagePrice
	 * PriceFormat19Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#mmPercentagePrice
	 * PriceFormat20Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat23Choice#mmPercentagePrice
	 * PriceFormat23Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#mmPercentagePrice
	 * PriceFormat22Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat25Choice#mmPercentagePrice
	 * PriceFormat25Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#mmPercentagePrice
	 * PriceFormat26Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#mmPercentagePrice
	 * PriceFormat27Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmPercentagePrice
	 * PriceFormat28Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice#mmRate
	 * PriceRateOrAmountOrUnknownChoice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice#mmRate
	 * PriceRateOrAmountOrUnknown1Choice.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceRate1#mmRate
	 * PriceRate1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat3Choice#mmRate
	 * PriceFormat3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmRate
	 * PriceFormat4Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice#mmRate
	 * PriceFormat2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#mmRate
	 * PriceFormat1Choice.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4#mmRate
	 * PriceValueAndRate4.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#mmPercentagePrice
	 * PriceFormat33Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#mmPercentagePrice
	 * PriceFormat32Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmPercentagePrice
	 * PriceFormat34Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#mmPercentagePrice
	 * PriceFormat43Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#mmPercentagePrice
	 * PriceFormat40Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#mmPercentagePrice
	 * PriceFormat39Choice.mmPercentagePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price6#mmRateOrAmount
	 * Price6.mmRateOrAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmPercentage
	 * SecuritiesTransactionPrice2Choice.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegValuationRate
	 * InstrumentLeg6.mmLegValuationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat45Choice#mmPercentagePrice
	 * PriceFormat45Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat50Choice#mmPercentagePrice
	 * PriceFormat50Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmPercentagePrice
	 * PriceFormat48Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat51Choice#mmPercentagePrice
	 * PriceFormat51Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmPercentagePrice
	 * PriceFormat49Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmPercentagePrice
	 * PriceFormat47Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat44Choice#mmPercentagePrice
	 * PriceFormat44Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#mmPercentagePrice
	 * PriceFormat56Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat57Choice#mmPercentagePrice
	 * PriceFormat57Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat52Choice#mmPercentagePrice
	 * PriceFormat52Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat59Choice#mmPercentagePrice
	 * PriceFormat59Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat55Choice#mmPercentagePrice
	 * PriceFormat55Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmPercentagePrice
	 * PriceFormat53Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#mmPercentagePrice
	 * PriceFormat60Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice9Choice#mmPercentage
	 * SecuritiesTransactionPrice9Choice.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice8Choice#mmPercentage
	 * SecuritiesTransactionPrice8Choice.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmount3Choice#mmRate
	 * PriceRateOrAmount3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown2Choice#mmRate
	 * PriceRateOrAmountOrUnknown2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice#mmRate
	 * PriceRateOrAmountOrUnknown3Choice.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a rate, ie, percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, PercentageRate> mmRate = new MMBusinessAttribute<SecuritiesPricing, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValue2.mmRate, PriceValueChange1.mmRate, PriceRateOrAmountChoice.mmRate, PriceRateOrAmount1Choice.mmRate, PercentagePrice1.mmPriceValue, PriceFormat5Choice.mmPercentagePrice,
					PriceFormat9Choice.mmPercentagePrice, PriceFormat17Choice.mmPercentagePrice, PriceFormat18Choice.mmPercentagePrice, PriceFormat21Choice.mmPercentagePrice, PriceFormat24Choice.mmPercentagePrice,
					PriceFormat6Choice.mmPercentagePrice, PriceFormat7Choice.mmPercentagePrice, PriceFormat12Choice.mmPercentagePrice, PriceFormat13Choice.mmPercentagePrice, PriceFormat11Choice.mmPercentagePrice,
					PriceFormat8Choice.mmPercentagePrice, PriceFormat10Choice.mmPercentagePrice, PriceFormat15Choice.mmPercentagePrice, PriceFormat16Choice.mmPercentagePrice, PriceFormat14Choice.mmPercentagePrice,
					PriceFormat19Choice.mmPercentagePrice, PriceFormat20Choice.mmPercentagePrice, PriceFormat23Choice.mmPercentagePrice, PriceFormat22Choice.mmPercentagePrice, PriceFormat25Choice.mmPercentagePrice,
					PriceFormat26Choice.mmPercentagePrice, PriceFormat27Choice.mmPercentagePrice, PriceFormat28Choice.mmPercentagePrice, PriceRateOrAmountOrUnknownChoice.mmRate, PriceRateOrAmountOrUnknown1Choice.mmRate, PriceRate1.mmRate,
					PriceFormat3Choice.mmRate, PriceFormat4Choice.mmRate, PriceFormat2Choice.mmRate, PriceFormat1Choice.mmRate, PriceValueAndRate4.mmRate, PriceFormat33Choice.mmPercentagePrice, PriceFormat32Choice.mmPercentagePrice,
					PriceFormat34Choice.mmPercentagePrice, PriceFormat43Choice.mmPercentagePrice, PriceFormat40Choice.mmPercentagePrice, PriceFormat39Choice.mmPercentagePrice, Price6.mmRateOrAmount,
					SecuritiesTransactionPrice2Choice.mmPercentage, InstrumentLeg6.mmLegValuationRate, PriceFormat45Choice.mmPercentagePrice, PriceFormat50Choice.mmPercentagePrice, PriceFormat48Choice.mmPercentagePrice,
					PriceFormat51Choice.mmPercentagePrice, PriceFormat49Choice.mmPercentagePrice, PriceFormat47Choice.mmPercentagePrice, PriceFormat44Choice.mmPercentagePrice, PriceFormat56Choice.mmPercentagePrice,
					PriceFormat57Choice.mmPercentagePrice, PriceFormat52Choice.mmPercentagePrice, PriceFormat59Choice.mmPercentagePrice, PriceFormat55Choice.mmPercentagePrice, PriceFormat53Choice.mmPercentagePrice,
					PriceFormat60Choice.mmPercentagePrice, SecuritiesTransactionPrice9Choice.mmPercentage, SecuritiesTransactionPrice8Choice.mmPercentage, PriceRateOrAmount3Choice.mmRate, PriceRateOrAmountOrUnknown2Choice.mmRate,
					PriceRateOrAmountOrUnknown3Choice.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(SecuritiesPricing obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(SecuritiesPricing obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected ValuationStatistics highestPriceValueRelatedStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
	 * ValuationStatistics.mmHighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a highest price value is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<ValuationStatistics>> mmHighestPriceValueRelatedStatistics = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<ValuationStatistics>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a highest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ValuationStatistics.mmHighestPriceValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ValuationStatistics.mmObject();
		}

		@Override
		public Optional<ValuationStatistics> getValue(SecuritiesPricing obj) {
			return obj.getHighestPriceValueRelatedStatistics();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<ValuationStatistics> value) {
			obj.setHighestPriceValueRelatedStatistics(value.orElse(null));
		}
	};
	protected ValuationStatistics lowestPriceValueRelatedStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
	 * ValuationStatistics.mmLowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a lowest price value is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<ValuationStatistics>> mmLowestPriceValueRelatedStatistics = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<ValuationStatistics>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a lowest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ValuationStatistics.mmLowestPriceValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ValuationStatistics.mmObject();
		}

		@Override
		public Optional<ValuationStatistics> getValue(SecuritiesPricing obj) {
			return obj.getLowestPriceValueRelatedStatistics();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<ValuationStatistics> value) {
			obj.setLowestPriceValueRelatedStatistics(value.orElse(null));
		}
	};
	protected List<Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security for which a price is given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesPricing, List<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Identifies the security for which a price is given.";
			minOccurs = 0;
			opposite_lazy = () -> Security.mmPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesPricing obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade execution for which a deal price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesTradeExecution>> mmSecuritiesTradeExecution = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesTradeExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade execution for which a deal price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
		}

		@Override
		public Optional<SecuritiesTradeExecution> getValue(SecuritiesPricing obj) {
			return obj.getSecuritiesTradeExecution();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<SecuritiesTradeExecution> value) {
			obj.setSecuritiesTradeExecution(value.orElse(null));
		}
	};
	protected YesNoIndicator yielded;
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
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#mmYielded
	 * YieldedOrValueType1Choice.mmYielded}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation1#mmYielded
	 * PriceInformation1.mmYielded}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmYielded
	 * PriceInformation2.mmYielded}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation3#mmYieldedIndicator
	 * PriceInformation3.mmYieldedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation4#mmYielded
	 * PriceInformation4.mmYielded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yielded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, YesNoIndicator> mmYielded = new MMBusinessAttribute<SecuritiesPricing, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmYielded, PriceInformation1.mmYielded, PriceInformation2.mmYielded, PriceInformation3.mmYieldedIndicator, PriceInformation4.mmYielded);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yielded";
			definition = "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesPricing obj) {
			return obj.getYielded();
		}

		@Override
		public void setValue(SecuritiesPricing obj, YesNoIndicator value) {
			obj.setYielded(value);
		}
	};
	protected PriceValueTypeCode typeOfRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#mmValueType
	 * YieldedOrValueType1Choice.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentagePrice1#mmPercentagePriceType
	 * PercentagePrice1.mmPercentagePriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation5#mmValueType
	 * PriceInformation5.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation7#mmValueType
	 * PriceInformation7.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation1#mmValueType
	 * PriceInformation1.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmValueType
	 * PriceInformation2.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation6#mmValueType
	 * PriceInformation6.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation8#mmValueType
	 * PriceInformation8.mmValueType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price1#mmValueType
	 * Price1.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation4#mmValueType
	 * PriceInformation4.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#mmValueType
	 * PriceInformation12.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmValueType
	 * PriceInformation13.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16#mmValueType
	 * PriceInformation16.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation14#mmValueType
	 * PriceInformation14.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18#mmValueType
	 * PriceInformation18.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation19#mmValueType
	 * PriceInformation19.mmValueType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, PriceValueTypeCode> mmTypeOfRate = new MMBusinessAttribute<SecuritiesPricing, PriceValueTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmValueType, PercentagePrice1.mmPercentagePriceType, PriceInformation5.mmValueType, PriceInformation7.mmValueType, PriceInformation1.mmValueType,
					PriceInformation2.mmValueType, PriceInformation6.mmValueType, PriceInformation8.mmValueType, Price1.mmValueType, PriceInformation4.mmValueType, PriceInformation12.mmValueType, PriceInformation13.mmValueType,
					PriceInformation16.mmValueType, PriceInformation14.mmValueType, PriceInformation18.mmValueType, PriceInformation19.mmValueType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfRate";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}

		@Override
		public PriceValueTypeCode getValue(SecuritiesPricing obj) {
			return obj.getTypeOfRate();
		}

		@Override
		public void setValue(SecuritiesPricing obj, PriceValueTypeCode value) {
			obj.setTypeOfRate(value);
		}
	};
	protected List<Derivative> derivative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
	 * Derivative.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative for which an exercise price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<Derivative>> mmDerivative = new MMBusinessAssociationEnd<SecuritiesPricing, List<Derivative>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Derivative for which an exercise price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> Derivative.mmExercisePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Derivative.mmObject();
		}

		@Override
		public List<Derivative> getValue(SecuritiesPricing obj) {
			return obj.getDerivative();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<Derivative> value) {
			obj.setDerivative(value);
		}
	};
	protected List<Warrant> relatedWarrant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
	 * Warrant.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant for which a subscription price is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<Warrant>> mmRelatedWarrant = new MMBusinessAssociationEnd<SecuritiesPricing, List<Warrant>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedWarrant";
			definition = "Warrant for which a subscription price is provided.";
			minOccurs = 0;
			opposite_lazy = () -> Warrant.mmSubscriptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Warrant.mmObject();
		}

		@Override
		public List<Warrant> getValue(SecuritiesPricing obj) {
			return obj.getRelatedWarrant();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<Warrant> value) {
			obj.setRelatedWarrant(value);
		}
	};
	protected SecuritiesConversion relatedSecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
	 * SecuritiesConversion.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion price is specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesConversion> mmRelatedSecuritiesConversion = new MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesConversion>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesConversion";
			definition = "Securities conversion process for which a conversion price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesConversion.mmConversionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public SecuritiesConversion getValue(SecuritiesPricing obj) {
			return obj.getRelatedSecuritiesConversion();
		}

		@Override
		public void setValue(SecuritiesPricing obj, SecuritiesConversion value) {
			obj.setRelatedSecuritiesConversion(value);
		}
	};
	protected LotBreakdown lotBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
	 * LotBreakdown.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lot for which a price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<LotBreakdown>> mmLotBreakdown = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<LotBreakdown>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Lot for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LotBreakdown.mmLotPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}

		@Override
		public Optional<LotBreakdown> getValue(SecuritiesPricing obj) {
			return obj.getLotBreakdown();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<LotBreakdown> value) {
			obj.setLotBreakdown(value.orElse(null));
		}
	};
	protected AmountPriceTypeCode typeOfAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmountPrice3#mmAmountPriceType
	 * AmountPrice3.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity3.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#mmAmountPriceType
	 * AmountPricePerAmount2.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice5#mmAmountPriceType
	 * AmountPrice5.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity4.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount3#mmAmountPriceType
	 * AmountPricePerAmount3.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice2#mmAmountPriceType
	 * AmountPrice2.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice4#mmAmountPriceType
	 * AmountPrice4.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice#mmCode
	 * AmountPriceType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice#mmProprietary
	 * AmountPriceType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice1#mmAmountPriceType
	 * AmountPrice1.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity1.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmAmountPriceType
	 * AmountPricePerAmount1.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity5.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity6.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity7.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity8.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice6#mmAmountPriceType
	 * AmountPrice6.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice7#mmAmountPriceType
	 * AmountPrice7.mmAmountPriceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, AmountPriceTypeCode> mmTypeOfAmount = new MMBusinessAttribute<SecuritiesPricing, AmountPriceTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountPrice3.mmAmountPriceType, AmountPricePerFinancialInstrumentQuantity3.mmAmountPriceType, AmountPricePerAmount2.mmAmountPriceType, AmountPrice5.mmAmountPriceType,
					AmountPricePerFinancialInstrumentQuantity4.mmAmountPriceType, AmountPricePerAmount3.mmAmountPriceType, AmountPrice2.mmAmountPriceType, AmountPrice4.mmAmountPriceType, AmountPriceType1FormatChoice.mmCode,
					AmountPriceType1FormatChoice.mmProprietary, AmountPrice1.mmAmountPriceType, AmountPricePerFinancialInstrumentQuantity1.mmAmountPriceType, AmountPricePerAmount1.mmAmountPriceType,
					AmountPricePerFinancialInstrumentQuantity5.mmAmountPriceType, AmountPricePerFinancialInstrumentQuantity6.mmAmountPriceType, AmountPricePerFinancialInstrumentQuantity7.mmAmountPriceType,
					AmountPricePerFinancialInstrumentQuantity8.mmAmountPriceType, AmountPrice6.mmAmountPriceType, AmountPrice7.mmAmountPriceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfAmount";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountPriceTypeCode.mmObject();
		}

		@Override
		public AmountPriceTypeCode getValue(SecuritiesPricing obj) {
			return obj.getTypeOfAmount();
		}

		@Override
		public void setValue(SecuritiesPricing obj, AmountPriceTypeCode value) {
			obj.setTypeOfAmount(value);
		}
	};
	protected CorporateActionPrice exercisePriceRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
	 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an exercise price is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, CorporateActionPrice> mmExercisePriceRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, CorporateActionPrice>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisePriceRelatedEvent";
			definition = "Corporate action event for which an exercise price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionPrice.mmCorporateActionExercisePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public CorporateActionPrice getValue(SecuritiesPricing obj) {
			return obj.getExercisePriceRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, CorporateActionPrice value) {
			obj.setExercisePriceRelatedEvent(value);
		}
	};
	protected CorporateActionPrice genericCashPriceReceivedPerProductRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price received per product is provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>> mmGenericCashPriceReceivedPerProductRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price received per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice> getValue(SecuritiesPricing obj) {
			return obj.getGenericCashPriceReceivedPerProductRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<CorporateActionPrice> value) {
			obj.setGenericCashPriceReceivedPerProductRelatedEvent(value.orElse(null));
		}
	};
	protected AmountAndQuantity amountPricePerFinancialInstrumentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmSecuritiesPricing
	 * AmountAndQuantity.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat9Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat18Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat21Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat24Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat7Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat13Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat10Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat14Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat20Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat22Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat26Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat28Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat1Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat33Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat32Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat34Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat43Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat40Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat39Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat48Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat49Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat47Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat56Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat53Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat60Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as an amount per a quantity of financial instruments."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, AmountAndQuantity> mmAmountPricePerFinancialInstrumentQuantity = new MMBusinessAssociationEnd<SecuritiesPricing, AmountAndQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(PriceFormat9Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat18Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat21Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat24Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat7Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat13Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat10Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat14Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat20Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat22Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat26Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat28Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat1Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat33Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat32Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat34Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat43Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat40Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat39Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat48Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat49Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat47Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat56Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat53Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat60Choice.mmAmountPricePerFinancialInstrumentQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as an amount per a quantity of financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountAndQuantity.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountAndQuantity.mmObject();
		}

		@Override
		public AmountAndQuantity getValue(SecuritiesPricing obj) {
			return obj.getAmountPricePerFinancialInstrumentQuantity();
		}

		@Override
		public void setValue(SecuritiesPricing obj, AmountAndQuantity value) {
			obj.setAmountPricePerFinancialInstrumentQuantity(value);
		}
	};
	protected AmountRatio amountPricePerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRatio
	 * AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmSecuritiesPricing
	 * AmountRatio.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#mmAmount
	 * AmountPricePerAmount2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#mmAmountPricePerAmount
	 * PriceFormat9Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount3#mmAmount
	 * AmountPricePerAmount3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#mmAmountPricePerAmount
	 * PriceFormat18Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#mmAmountPricePerAmount
	 * PriceFormat21Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#mmAmountPricePerAmount
	 * PriceFormat24Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmAmountPricePerAmount
	 * PriceFormat7Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#mmAmountPricePerAmount
	 * PriceFormat13Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#mmAmountPricePerAmount
	 * PriceFormat10Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#mmAmountPricePerAmount
	 * PriceFormat14Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#mmAmountPricePerAmount
	 * PriceFormat20Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#mmAmountPricePerAmount
	 * PriceFormat22Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#mmAmountPricePerAmount
	 * PriceFormat26Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmAmountPricePerAmount
	 * PriceFormat28Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmAmount
	 * AmountPricePerAmount1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#mmAmountPricePerAmount
	 * PriceFormat1Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#mmAmountPricePerAmount
	 * PriceFormat33Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#mmAmountPricePerAmount
	 * PriceFormat32Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmAmountPricePerAmount
	 * PriceFormat34Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#mmAmountPricePerAmount
	 * PriceFormat43Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#mmAmountPricePerAmount
	 * PriceFormat40Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#mmAmountPricePerAmount
	 * PriceFormat39Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPricePerAmount
	 * PriceFormat48Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmAmountPricePerAmount
	 * PriceFormat49Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmAmountPricePerAmount
	 * PriceFormat47Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#mmAmountPricePerAmount
	 * PriceFormat56Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmAmountPricePerAmount
	 * PriceFormat53Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#mmAmountPricePerAmount
	 * PriceFormat60Choice.mmAmountPricePerAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as an amount per another amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, AmountRatio> mmAmountPricePerAmount = new MMBusinessAssociationEnd<SecuritiesPricing, AmountRatio>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountPricePerAmount2.mmAmount, PriceFormat9Choice.mmAmountPricePerAmount, AmountPricePerAmount3.mmAmount, PriceFormat18Choice.mmAmountPricePerAmount,
					PriceFormat21Choice.mmAmountPricePerAmount, PriceFormat24Choice.mmAmountPricePerAmount, PriceFormat7Choice.mmAmountPricePerAmount, PriceFormat13Choice.mmAmountPricePerAmount, PriceFormat10Choice.mmAmountPricePerAmount,
					PriceFormat14Choice.mmAmountPricePerAmount, PriceFormat20Choice.mmAmountPricePerAmount, PriceFormat22Choice.mmAmountPricePerAmount, PriceFormat26Choice.mmAmountPricePerAmount, PriceFormat28Choice.mmAmountPricePerAmount,
					AmountPricePerAmount1.mmAmount, PriceFormat1Choice.mmAmountPricePerAmount, PriceFormat33Choice.mmAmountPricePerAmount, PriceFormat32Choice.mmAmountPricePerAmount, PriceFormat34Choice.mmAmountPricePerAmount,
					PriceFormat43Choice.mmAmountPricePerAmount, PriceFormat40Choice.mmAmountPricePerAmount, PriceFormat39Choice.mmAmountPricePerAmount, PriceFormat48Choice.mmAmountPricePerAmount, PriceFormat49Choice.mmAmountPricePerAmount,
					PriceFormat47Choice.mmAmountPricePerAmount, PriceFormat56Choice.mmAmountPricePerAmount, PriceFormat53Choice.mmAmountPricePerAmount, PriceFormat60Choice.mmAmountPricePerAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as an amount per another amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AmountRatio.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmountRatio.mmObject();
		}

		@Override
		public AmountRatio getValue(SecuritiesPricing obj) {
			return obj.getAmountPricePerAmount();
		}

		@Override
		public void setValue(SecuritiesPricing obj, AmountRatio value) {
			obj.setAmountPricePerAmount(value);
		}
	};
	protected CorporateActionPrice genericCashPricePaidPerProductRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price paid per product is provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>> mmGenericCashPricePaidPerProductRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price paid per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice> getValue(SecuritiesPricing obj) {
			return obj.getGenericCashPricePaidPerProductRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<CorporateActionPrice> value) {
			obj.setGenericCashPricePaidPerProductRelatedEvent(value.orElse(null));
		}
	};
	protected DateTimePeriod priceCalculationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
	 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod4#mmPriceCalculationPeriod
	 * CorporateActionPeriod4.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#mmPriceCalculationPeriod
	 * CorporateActionPeriod9.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#mmPriceCalculationPeriod
	 * CorporateActionPeriod5.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmPriceCalculationPeriod
	 * CorporateActionPeriod7.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmPriceCalculationPeriod
	 * CorporateActionPeriod3.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmPriceCalculationPeriod
	 * CorporateActionPeriod6.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmPriceCalculationPeriod
	 * CorporateActionPeriod8.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9#mmPriceCalculationPeriod
	 * PriceInformation9.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmPriceCalculationPeriod
	 * CorporateActionPeriod1.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmPriceCalculationPeriod
	 * CorporateActionPeriod2.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmPriceCalculationPeriod
	 * CorporateActionPeriod10.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmPriceCalculationPeriod
	 * PriceInformation11.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmPriceCalculationPeriod
	 * CorporateActionPeriod11.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmPriceCalculationPeriod
	 * CorporateActionPeriod12.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod13#mmPriceCalculationPeriod
	 * CorporateActionPeriod13.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmPriceCalculationPeriod
	 * CorporateActionPeriod14.mmPriceCalculationPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined (For outturn securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, DateTimePeriod> mmPriceCalculationPeriod = new MMBusinessAssociationEnd<SecuritiesPricing, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod4.mmPriceCalculationPeriod, CorporateActionPeriod9.mmPriceCalculationPeriod, CorporateActionPeriod5.mmPriceCalculationPeriod,
					CorporateActionPeriod7.mmPriceCalculationPeriod, CorporateActionPeriod3.mmPriceCalculationPeriod, CorporateActionPeriod6.mmPriceCalculationPeriod, CorporateActionPeriod8.mmPriceCalculationPeriod,
					PriceInformation9.mmPriceCalculationPeriod, CorporateActionPeriod1.mmPriceCalculationPeriod, CorporateActionPeriod2.mmPriceCalculationPeriod, CorporateActionPeriod10.mmPriceCalculationPeriod,
					PriceInformation11.mmPriceCalculationPeriod, CorporateActionPeriod11.mmPriceCalculationPeriod, CorporateActionPeriod12.mmPriceCalculationPeriod, CorporateActionPeriod13.mmPriceCalculationPeriod,
					CorporateActionPeriod14.mmPriceCalculationPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For outturn securities).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmPriceCalculationRelatedPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(SecuritiesPricing obj) {
			return obj.getPriceCalculationPeriod();
		}

		@Override
		public void setValue(SecuritiesPricing obj, DateTimePeriod value) {
			obj.setPriceCalculationPeriod(value);
		}
	};
	protected CorporateActionPrice cashInLieuOfSharePriceRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash in lieu of share price is provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>> mmCashInLieuOfSharePriceRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePriceRelatedEvent";
			definition = "Corporate action event for which a cash in lieu of share price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice> getValue(SecuritiesPricing obj) {
			return obj.getCashInLieuOfSharePriceRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<CorporateActionPrice> value) {
			obj.setCashInLieuOfSharePriceRelatedEvent(value.orElse(null));
		}
	};
	protected CorporateActionPrice overSubscriptionDepositPriceRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an over subscription deposit price is provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>> mmOverSubscriptionDepositPriceRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPriceRelatedEvent";
			definition = "Corporate action event for which an over subscription deposit price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmOverSubscriptionDepositPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice> getValue(SecuritiesPricing obj) {
			return obj.getOverSubscriptionDepositPriceRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<CorporateActionPrice> value) {
			obj.setOverSubscriptionDepositPriceRelatedEvent(value.orElse(null));
		}
	};
	protected CorporateActionPrice cashValueForTaxRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
	 * CorporateActionPrice.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTaxRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash value has been provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, CorporateActionPrice> mmCashValueForTaxRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, CorporateActionPrice>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashValueForTaxRelatedEvent";
			definition = "Corporate action event for which a cash value has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionPrice.mmCashValueForTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public CorporateActionPrice getValue(SecuritiesPricing obj) {
			return obj.getCashValueForTaxRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, CorporateActionPrice value) {
			obj.setCashValueForTaxRelatedEvent(value);
		}
	};
	protected BiddingConditions maximumPriceBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
	 * BiddingConditions.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, BiddingConditions> mmMaximumPriceBiddingConditions = new MMBusinessAssociationEnd<SecuritiesPricing, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumPriceBiddingConditions";
			definition = "Bidding conditions for which a maximum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmMaximumPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(SecuritiesPricing obj) {
			return obj.getMaximumPriceBiddingConditions();
		}

		@Override
		public void setValue(SecuritiesPricing obj, BiddingConditions value) {
			obj.setMaximumPriceBiddingConditions(value);
		}
	};
	protected BiddingConditions minimumPriceBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
	 * BiddingConditions.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a minimum price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, BiddingConditions> mmMinimumPriceBiddingConditions = new MMBusinessAssociationEnd<SecuritiesPricing, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumPriceBiddingConditions";
			definition = "Bidding conditions for which a minimum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmMinimumPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(SecuritiesPricing obj) {
			return obj.getMinimumPriceBiddingConditions();
		}

		@Override
		public void setValue(SecuritiesPricing obj, BiddingConditions value) {
			obj.setMinimumPriceBiddingConditions(value);
		}
	};
	protected ISODateTime quotationDate;
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
	 * {@linkplain com.tools20022.repository.msg.PriceInformation5#mmQuotationDate
	 * PriceInformation5.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation7#mmQuotationDate
	 * PriceInformation7.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation1#mmQuotationDate
	 * PriceInformation1.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmQuotationDate
	 * PriceInformation2.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation6#mmQuotationDate
	 * PriceInformation6.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation8#mmQuotationDate
	 * PriceInformation8.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9#mmQuotationDate
	 * PriceInformation9.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmQuotationSettingDate
	 * CorporateActionDate4.mmQuotationSettingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation3#mmQuotationDate
	 * PriceInformation3.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation4#mmQuotationDate
	 * PriceInformation4.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmQuotationDate
	 * PriceInformation11.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#mmQuotationDate
	 * PriceInformation12.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmQuotationDate
	 * PriceInformation13.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16#mmQuotationDate
	 * PriceInformation16.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation14#mmQuotationDate
	 * PriceInformation14.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18#mmQuotationDate
	 * PriceInformation18.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation19#mmQuotationDate
	 * PriceInformation19.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the price is obtained."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, ISODateTime> mmQuotationDate = new MMBusinessAttribute<SecuritiesPricing, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(PriceInformation5.mmQuotationDate, PriceInformation7.mmQuotationDate, PriceInformation1.mmQuotationDate, PriceInformation2.mmQuotationDate, PriceInformation6.mmQuotationDate,
					PriceInformation8.mmQuotationDate, PriceInformation9.mmQuotationDate, CorporateActionDate4.mmQuotationSettingDate, PriceInformation3.mmQuotationDate, PriceInformation4.mmQuotationDate,
					PriceInformation11.mmQuotationDate, PriceInformation12.mmQuotationDate, PriceInformation13.mmQuotationDate, PriceInformation16.mmQuotationDate, PriceInformation14.mmQuotationDate, PriceInformation18.mmQuotationDate,
					PriceInformation19.mmQuotationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesPricing obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(SecuritiesPricing obj, ISODateTime value) {
			obj.setQuotationDate(value);
		}
	};
	protected List<YieldCalculation> yieldCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
	 * YieldCalculation.mmRedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmYieldDetails
	 * Debt1.mmYieldDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmYieldRange
	 * FinancialInstrumentStipulations.mmYieldRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmYieldRange
	 * FinancialInstrumentStipulations2.mmYieldRange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmYieldCalculation
	 * Debt2.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmYieldDetails
	 * SingleOrder1.mmYieldDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmYieldDetails
	 * IndicationOfInterest1.mmYieldDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmYieldCalculation
	 * Debt3.mmYieldCalculation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of return on an investment, based on the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<YieldCalculation>> mmYieldCalculation = new MMBusinessAssociationEnd<SecuritiesPricing, List<YieldCalculation>>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmYieldDetails, FinancialInstrumentStipulations.mmYieldRange, FinancialInstrumentStipulations2.mmYieldRange, Debt2.mmYieldCalculation, SingleOrder1.mmYieldDetails,
					IndicationOfInterest1.mmYieldDetails, Debt3.mmYieldCalculation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> YieldCalculation.mmRedemptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> YieldCalculation.mmObject();
		}

		@Override
		public List<YieldCalculation> getValue(SecuritiesPricing obj) {
			return obj.getYieldCalculation();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<YieldCalculation> value) {
			obj.setYieldCalculation(value);
		}
	};
	protected List<SecuritiesFinancing> relatedSecuritiesFinancing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
	 * SecuritiesFinancing.mmEndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing process for which an end price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<SecuritiesFinancing>> mmRelatedSecuritiesFinancing = new MMBusinessAssociationEnd<SecuritiesPricing, List<SecuritiesFinancing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesFinancing";
			definition = "Securities financing process for which an end price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesFinancing.mmEndPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}

		@Override
		public List<SecuritiesFinancing> getValue(SecuritiesPricing obj) {
			return obj.getRelatedSecuritiesFinancing();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<SecuritiesFinancing> value) {
			obj.setRelatedSecuritiesFinancing(value);
		}
	};
	protected InvestmentFundOrderExecution fundOrderRelatedToExecutedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToExecutedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an executed price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<InvestmentFundOrderExecution>> mmFundOrderRelatedToExecutedPrice = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<InvestmentFundOrderExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToExecutedPrice";
			definition = "Fund order for which an executed price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrderExecution> getValue(SecuritiesPricing obj) {
			return obj.getFundOrderRelatedToExecutedPrice();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<InvestmentFundOrderExecution> value) {
			obj.setFundOrderRelatedToExecutedPrice(value.orElse(null));
		}
	};
	protected InvestmentFundOrderExecution fundOrderRelatedToInformativePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
	 * InvestmentFundOrderExecution.mmInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToInformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an informative price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<InvestmentFundOrderExecution>> mmFundOrderRelatedToInformativePrice = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<InvestmentFundOrderExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToInformativePrice";
			definition = "Fund order for which an informative price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InvestmentFundOrderExecution.mmInformativePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrderExecution> getValue(SecuritiesPricing obj) {
			return obj.getFundOrderRelatedToInformativePrice();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<InvestmentFundOrderExecution> value) {
			obj.setFundOrderRelatedToInformativePrice(value.orElse(null));
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
	 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax voucher for which the cost per share is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, TaxVoucher> mmTaxVoucher = new MMBusinessAssociationEnd<SecuritiesPricing, TaxVoucher>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the cost per share is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TaxVoucher.mmScripDividendReinvestmentPricePerShare;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxVoucher.mmObject();
		}

		@Override
		public TaxVoucher getValue(SecuritiesPricing obj) {
			return obj.getTaxVoucher();
		}

		@Override
		public void setValue(SecuritiesPricing obj, TaxVoucher value) {
			obj.setTaxVoucher(value);
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which the trade price is calculated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesTrade>> mmSecuritiesTrade = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade for which the trade price is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTrade.mmTradePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}

		@Override
		public Optional<SecuritiesTrade> getValue(SecuritiesPricing obj) {
			return obj.getSecuritiesTrade();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<SecuritiesTrade> value) {
			obj.setSecuritiesTrade(value.orElse(null));
		}
	};
	protected List<NetAssetValueCalculation> netAssetValueCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
	 * NetAssetValueCalculation.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value calculation for which a securities pricing is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<NetAssetValueCalculation>> mmNetAssetValueCalculation = new MMBusinessAssociationEnd<SecuritiesPricing, List<NetAssetValueCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Value calculation for which a securities pricing is specified.";
			minOccurs = 0;
			opposite_lazy = () -> NetAssetValueCalculation.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}

		@Override
		public List<NetAssetValueCalculation> getValue(SecuritiesPricing obj) {
			return obj.getNetAssetValueCalculation();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<NetAssetValueCalculation> value) {
			obj.setNetAssetValueCalculation(value);
		}
	};
	protected BuyIn relatedBuyIn;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
	 * BuyIn.mmBuyInPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BuyIn process for which a price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, BuyIn> mmRelatedBuyIn = new MMBusinessAssociationEnd<SecuritiesPricing, BuyIn>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "BuyIn process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BuyIn.mmBuyInPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BuyIn.mmObject();
		}

		@Override
		public BuyIn getValue(SecuritiesPricing obj) {
			return obj.getRelatedBuyIn();
		}

		@Override
		public void setValue(SecuritiesPricing obj, BuyIn value) {
			obj.setRelatedBuyIn(value);
		}
	};
	protected List<Index> index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
	 * Index.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3#mmIndex
	 * BasketDescription3.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice8Choice#mmYield
	 * SecuritiesTransactionPrice8Choice.mmYield}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the index information when used for calculating the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<Index>> mmIndex = new MMBusinessAssociationEnd<SecuritiesPricing, List<Index>>() {
		{
			derivation_lazy = () -> Arrays.asList(BasketDescription3.mmIndex, SecuritiesTransactionPrice8Choice.mmYield);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index information when used for calculating the price.";
			minOccurs = 0;
			opposite_lazy = () -> Index.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Index.mmObject();
		}

		@Override
		public List<Index> getValue(SecuritiesPricing obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<Index> value) {
			obj.setIndex(value);
		}
	};
	protected InformationPartyRole informationPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmPrice
	 * InformationPartyRole.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which provided the pricing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, InformationPartyRole> mmInformationPartyRole = new MMBusinessAssociationEnd<SecuritiesPricing, InformationPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provided the pricing.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InformationPartyRole.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}

		@Override
		public InformationPartyRole getValue(SecuritiesPricing obj) {
			return obj.getInformationPartyRole();
		}

		@Override
		public void setValue(SecuritiesPricing obj, InformationPartyRole value) {
			obj.setInformationPartyRole(value);
		}
	};
	protected DateTimePeriod priceFactPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
	 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFactPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the price fact type is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, DateTimePeriod> mmPriceFactPeriod = new MMBusinessAssociationEnd<SecuritiesPricing, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceFactPeriod";
			definition = "Period during which the price fact type is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmPriceFactRelatedPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(SecuritiesPricing obj) {
			return obj.getPriceFactPeriod();
		}

		@Override
		public void setValue(SecuritiesPricing obj, DateTimePeriod value) {
			obj.setPriceFactPeriod(value);
		}
	};
	protected List<AnalyticsCalculation> analyticsCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmSecuritiesPricing
	 * AnalyticsCalculation.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnalyticsCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated analytics based on the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<AnalyticsCalculation>> mmAnalyticsCalculation = new MMBusinessAssociationEnd<SecuritiesPricing, List<AnalyticsCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Calculated analytics based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> AnalyticsCalculation.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AnalyticsCalculation.mmObject();
		}

		@Override
		public List<AnalyticsCalculation> getValue(SecuritiesPricing obj) {
			return obj.getAnalyticsCalculation();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<AnalyticsCalculation> value) {
			obj.setAnalyticsCalculation(value);
		}
	};
	protected List<DurationCalculation> durationCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmRelatedSecuritiesPricing
	 * DurationCalculation.mmRelatedSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated duration based on the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<DurationCalculation>> mmDurationCalculation = new MMBusinessAssociationEnd<SecuritiesPricing, List<DurationCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Calculated duration based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> DurationCalculation.mmRelatedSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DurationCalculation.mmObject();
		}

		@Override
		public List<DurationCalculation> getValue(SecuritiesPricing obj) {
			return obj.getDurationCalculation();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<DurationCalculation> value) {
			obj.setDurationCalculation(value);
		}
	};
	protected List<LifeCalculation> lifeCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LifeCalculation
	 * LifeCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmSecuritiesPricing
	 * LifeCalculation.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated  life based on the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, List<LifeCalculation>> mmLifeCalculation = new MMBusinessAssociationEnd<SecuritiesPricing, List<LifeCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Calculated  life based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> LifeCalculation.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LifeCalculation.mmObject();
		}

		@Override
		public List<LifeCalculation> getValue(SecuritiesPricing obj) {
			return obj.getLifeCalculation();
		}

		@Override
		public void setValue(SecuritiesPricing obj, List<LifeCalculation> value) {
			obj.setLifeCalculation(value);
		}
	};
	protected ISODateTime date;
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
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmPriceFixingDate
	 * AmountPricePerFinancialInstrumentQuantity5.mmPriceFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8#mmPriceFixingDate
	 * AmountPricePerFinancialInstrumentQuantity8.mmPriceFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the price. For CIV, this is the NAV date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesPricing, ISODateTime> mmDate = new MMBusinessAttribute<SecuritiesPricing, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity5.mmPriceFixingDate, AmountPricePerFinancialInstrumentQuantity8.mmPriceFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date/time of the price. For CIV, this is the NAV date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesPricing obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(SecuritiesPricing obj, ISODateTime value) {
			obj.setDate(value);
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
	 * Spread.mmBenchmarkPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread which uses the price as benchmark."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<Spread>> mmSpread = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<Spread>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread which uses the price as benchmark.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Spread.mmBenchmarkPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}

		@Override
		public Optional<Spread> getValue(SecuritiesPricing obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<Spread> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	protected SecuritiesOrder order;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities order for which a price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesOrder>> mmOrder = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Securities order for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmOrderPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesPricing obj) {
			return obj.getOrder();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<SecuritiesOrder> value) {
			obj.setOrder(value.orElse(null));
		}
	};
	protected SecuritiesOrder stopPriceOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
	 * SecuritiesOrder.mmStopPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPriceOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a stop price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesOrder>> mmStopPriceOrder = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StopPriceOrder";
			definition = "Order for which a stop price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmStopPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesPricing obj) {
			return obj.getStopPriceOrder();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<SecuritiesOrder> value) {
			obj.setStopPriceOrder(value.orElse(null));
		}
	};
	protected Allocation allocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedPrice
	 * Allocation.mmAllocatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which a price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<Allocation>> mmAllocation = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<Allocation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Allocation.mmAllocatedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}

		@Override
		public Optional<Allocation> getValue(SecuritiesPricing obj) {
			return obj.getAllocation();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<Allocation> value) {
			obj.setAllocation(value.orElse(null));
		}
	};
	protected SecuritiesOrderParameters relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
	 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a previous closing price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesOrderParameters>> mmRelatedOrder = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<SecuritiesOrderParameters>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a previous closing price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrderParameters.mmPreviousClosingPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}

		@Override
		public Optional<SecuritiesOrderParameters> getValue(SecuritiesPricing obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<SecuritiesOrderParameters> value) {
			obj.setRelatedOrder(value.orElse(null));
		}
	};
	protected Issuance issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmOriginalIssueDiscount
	 * Issuance.mmOriginalIssueDiscount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which a discount is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Issuance> mmIssuance = new MMBusinessAssociationEnd<SecuritiesPricing, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which a discount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmOriginalIssueDiscount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(SecuritiesPricing obj) {
			return obj.getIssuance();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Issuance value) {
			obj.setIssuance(value);
		}
	};
	protected Entitlement entitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entitlement
	 * Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement#mmStrikePrice
	 * Entitlement.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitlement for which a strike price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Entitlement> mmEntitlement = new MMBusinessAssociationEnd<SecuritiesPricing, Entitlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entitlement";
			definition = "Entitlement for which a strike price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Entitlement.mmStrikePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Entitlement.mmObject();
		}

		@Override
		public Entitlement getValue(SecuritiesPricing obj) {
			return obj.getEntitlement();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Entitlement value) {
			obj.setEntitlement(value);
		}
	};
	protected SecuritiesDistribution cashFractionsPriceRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmCashFractionsPrice
	 * SecuritiesDistribution.mmCashFractionsPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFractionsPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a cash fractions price is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesDistribution> mmCashFractionsPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a cash fractions price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmCashFractionsPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesPricing obj) {
			return obj.getCashFractionsPriceRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesPricing obj, SecuritiesDistribution value) {
			obj.setCashFractionsPriceRelatedSecuritiesDistribution(value);
		}
	};
	protected SecuritiesDistribution suscriptionPriceRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSubscriptionPrice
	 * SecuritiesDistribution.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuscriptionPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a subscription price is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesDistribution> mmSuscriptionPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuscriptionPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a subscription price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmSubscriptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesPricing obj) {
			return obj.getSuscriptionPriceRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesPricing obj, SecuritiesDistribution value) {
			obj.setSuscriptionPriceRelatedSecuritiesDistribution(value);
		}
	};
	protected SecuritiesDistribution reinvestmentPriceRelatedSecuritiesDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentPrice
	 * SecuritiesDistribution.mmReinvestmentPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a reinvestment price is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesDistribution> mmReinvestmentPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd<SecuritiesPricing, SecuritiesDistribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a reinvestment price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesDistribution.mmReinvestmentPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}

		@Override
		public SecuritiesDistribution getValue(SecuritiesPricing obj) {
			return obj.getReinvestmentPriceRelatedSecuritiesDistribution();
		}

		@Override
		public void setValue(SecuritiesPricing obj, SecuritiesDistribution value) {
			obj.setReinvestmentPriceRelatedSecuritiesDistribution(value);
		}
	};
	protected Derivative relatedFuture;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmTick
	 * Derivative.mmTick}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract for which a tick is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Derivative> mmRelatedFuture = new MMBusinessAssociationEnd<SecuritiesPricing, Derivative>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFuture";
			definition = "Contract for which a tick is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Derivative.mmTick;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Derivative.mmObject();
		}

		@Override
		public Derivative getValue(SecuritiesPricing obj) {
			return obj.getRelatedFuture();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Derivative value) {
			obj.setRelatedFuture(value);
		}
	};
	protected Distribution distribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmOfferPrice
	 * Distribution.mmOfferPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution for which an offer price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Distribution> mmDistribution = new MMBusinessAssociationEnd<SecuritiesPricing, Distribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution for which an offer price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Distribution.mmOfferPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Distribution getValue(SecuritiesPricing obj) {
			return obj.getDistribution();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Distribution value) {
			obj.setDistribution(value);
		}
	};
	protected RedemptionSchedule priceChangeRedemptionSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChange
	 * RedemptionSchedule.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption schedule for which a change in price is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, RedemptionSchedule> mmPriceChangeRedemptionSchedule = new MMBusinessAssociationEnd<SecuritiesPricing, RedemptionSchedule>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRedemptionSchedule";
			definition = "Redemption schedule for which a change in price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RedemptionSchedule.mmPriceChange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RedemptionSchedule.mmObject();
		}

		@Override
		public RedemptionSchedule getValue(SecuritiesPricing obj) {
			return obj.getPriceChangeRedemptionSchedule();
		}

		@Override
		public void setValue(SecuritiesPricing obj, RedemptionSchedule value) {
			obj.setPriceChangeRedemptionSchedule(value);
		}
	};
	protected RedemptionSchedule relatedRedemptionSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPrice
	 * RedemptionSchedule.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption schedule for which a price is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, RedemptionSchedule> mmRelatedRedemptionSchedule = new MMBusinessAssociationEnd<SecuritiesPricing, RedemptionSchedule>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRedemptionSchedule";
			definition = "Redemption schedule for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RedemptionSchedule.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RedemptionSchedule.mmObject();
		}

		@Override
		public RedemptionSchedule getValue(SecuritiesPricing obj) {
			return obj.getRelatedRedemptionSchedule();
		}

		@Override
		public void setValue(SecuritiesPricing obj, RedemptionSchedule value) {
			obj.setRelatedRedemptionSchedule(value);
		}
	};
	protected Quote previousClosingPriceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
	 * Quote.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a previous closing price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>> mmPreviousClosingPriceRelatedQuote = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPriceRelatedQuote";
			definition = "Quote which contains a previous closing price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Quote.mmPreviousClosingPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Optional<Quote> getValue(SecuritiesPricing obj) {
			return obj.getPreviousClosingPriceRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<Quote> value) {
			obj.setPreviousClosingPriceRelatedQuote(value.orElse(null));
		}
	};
	protected Quote requestedPriceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
	 * Quote.mmRequestedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a requested price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>> mmRequestedPriceRelatedQuote = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedPriceRelatedQuote";
			definition = "Quote which contains a requested price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Quote.mmRequestedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Optional<Quote> getValue(SecuritiesPricing obj) {
			return obj.getRequestedPriceRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<Quote> value) {
			obj.setRequestedPriceRelatedQuote(value.orElse(null));
		}
	};
	protected Quote priceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#mmPrice
	 * Quote.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>> mmPriceRelatedQuote = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceRelatedQuote";
			definition = "Quote which contains a price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Quote.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Optional<Quote> getValue(SecuritiesPricing obj) {
			return obj.getPriceRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<Quote> value) {
			obj.setPriceRelatedQuote(value.orElse(null));
		}
	};
	protected Quote marketPriceRelatedQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
	 * Quote.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a market price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>> mmMarketPriceRelatedQuote = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<Quote>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketPriceRelatedQuote";
			definition = "Quote which contains a market price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Quote.mmMarketPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}

		@Override
		public Optional<Quote> getValue(SecuritiesPricing obj) {
			return obj.getMarketPriceRelatedQuote();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<Quote> value) {
			obj.setMarketPriceRelatedQuote(value.orElse(null));
		}
	};
	protected Price price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
	 * Price.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice4#mmValue
	 * UnitPrice4.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmValueInInvestmentCurrency
	 * UnitPrice6.mmValueInInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmValueInAlternativeCurrency
	 * UnitPrice6.mmValueInAlternativeCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmValueInInvestmentCurrency
	 * UnitPrice15.mmValueInInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmValueInAlternativeCurrency
	 * UnitPrice15.mmValueInAlternativeCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice3#mmValue
	 * UnitPrice3.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice12#mmValue
	 * UnitPrice12.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#mmAmount
	 * PriceRateOrAmountChoice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmount1Choice#mmAmount
	 * PriceRateOrAmount1Choice.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice3#mmPriceValue
	 * AmountPrice3.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity3.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#mmPriceValue
	 * AmountPricePerAmount2.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice5#mmPriceValue
	 * AmountPrice5.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity4.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount3#mmPriceValue
	 * AmountPricePerAmount3.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice2#mmPriceValue
	 * AmountPrice2.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice4#mmPriceValue
	 * AmountPrice4.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice#mmAmount
	 * PriceRateOrAmountOrUnknownChoice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice#mmAmount
	 * PriceRateOrAmountOrUnknown1Choice.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmDealPrice
	 * Order16.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmDealPrice
	 * Order14.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice1Choice#mmDealPrice
	 * TransactionPrice1Choice.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice2Choice#mmDealPrice
	 * TransactionPrice2Choice.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice#mmDealPrice
	 * TransactionPrice3Choice.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice1#mmValue
	 * UnitPrice1.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#mmValue
	 * UnitPrice5.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmValue
	 * UnitPrice10.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice11#mmValue
	 * UnitPrice11.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice1#mmPriceValue
	 * AmountPrice1.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity1.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmPriceValue
	 * AmountPricePerAmount1.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceAndDirection1#mmValue
	 * PriceAndDirection1.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4#mmValue
	 * PriceValueAndRate4.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmCurrentPrice
	 * PriceInformation10.mmCurrentPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmPreviousPrice
	 * PriceInformation10.mmPreviousPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice16#mmValue
	 * UnitPrice16.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice17#mmValue
	 * UnitPrice17.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity5.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegBidPrice
	 * InstrumentLeg2.mmLegBidPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegOfferPrice
	 * InstrumentLeg2.mmLegOfferPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegPrice
	 * InstrumentLeg3.mmLegPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmDealPrice
	 * Order17.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmDealPrice
	 * Order18.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#mmValue
	 * UnitPrice20.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19#mmValue
	 * UnitPrice19.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmMonetaryValue
	 * SecuritiesTransactionPrice2Choice.mmMonetaryValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity6.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmValue
	 * UnitPrice21.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity7.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity8.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmValue
	 * UnitPrice22.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmInstrumentPrice
	 * TransparencyDataReport11.mmInstrumentPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice23#mmValue
	 * UnitPrice23.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmount3Choice#mmAmount
	 * PriceRateOrAmount3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown2Choice#mmAmount
	 * PriceRateOrAmountOrUnknown2Choice.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice6#mmPriceValue
	 * AmountPrice6.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice4Choice#mmDealPrice
	 * TransactionPrice4Choice.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice#mmAmount
	 * PriceRateOrAmountOrUnknown3Choice.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice7#mmPriceValue
	 * AmountPrice7.mmPriceValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Price> mmPrice = new MMBusinessAssociationEnd<SecuritiesPricing, Price>() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice4.mmValue, UnitPrice6.mmValueInInvestmentCurrency, UnitPrice6.mmValueInAlternativeCurrency, UnitPrice15.mmValueInInvestmentCurrency, UnitPrice15.mmValueInAlternativeCurrency,
					UnitPrice3.mmValue, UnitPrice12.mmValue, PriceRateOrAmountChoice.mmAmount, PriceRateOrAmount1Choice.mmAmount, AmountPrice3.mmPriceValue, AmountPricePerFinancialInstrumentQuantity3.mmPriceValue,
					AmountPricePerAmount2.mmPriceValue, AmountPrice5.mmPriceValue, AmountPricePerFinancialInstrumentQuantity4.mmPriceValue, AmountPricePerAmount3.mmPriceValue, AmountPrice2.mmPriceValue, AmountPrice4.mmPriceValue,
					PriceRateOrAmountOrUnknownChoice.mmAmount, PriceRateOrAmountOrUnknown1Choice.mmAmount, Order16.mmDealPrice, Order14.mmDealPrice, TransactionPrice1Choice.mmDealPrice, TransactionPrice2Choice.mmDealPrice,
					TransactionPrice3Choice.mmDealPrice, UnitPrice1.mmValue, UnitPrice5.mmValue, UnitPrice10.mmValue, UnitPrice11.mmValue, AmountPrice1.mmPriceValue, AmountPricePerFinancialInstrumentQuantity1.mmPriceValue,
					AmountPricePerAmount1.mmPriceValue, PriceAndDirection1.mmValue, PriceValueAndRate4.mmValue, PriceInformation10.mmCurrentPrice, PriceInformation10.mmPreviousPrice, UnitPrice16.mmValue, UnitPrice17.mmValue,
					AmountPricePerFinancialInstrumentQuantity5.mmPriceValue, InstrumentLeg2.mmLegBidPrice, InstrumentLeg2.mmLegOfferPrice, InstrumentLeg3.mmLegPrice, Order17.mmDealPrice, Order18.mmDealPrice, UnitPrice20.mmValue,
					UnitPrice19.mmValue, SecuritiesTransactionPrice2Choice.mmMonetaryValue, AmountPricePerFinancialInstrumentQuantity6.mmPriceValue, UnitPrice21.mmValue, AmountPricePerFinancialInstrumentQuantity7.mmPriceValue,
					AmountPricePerFinancialInstrumentQuantity8.mmPriceValue, UnitPrice22.mmValue, TransparencyDataReport11.mmInstrumentPrice, UnitPrice23.mmValue, PriceRateOrAmount3Choice.mmAmount,
					PriceRateOrAmountOrUnknown2Choice.mmAmount, AmountPrice6.mmPriceValue, TransactionPrice4Choice.mmDealPrice, PriceRateOrAmountOrUnknown3Choice.mmAmount, AmountPrice7.mmPriceValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Value of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Price.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public Price getValue(SecuritiesPricing obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Price value) {
			obj.setPrice(value);
		}
	};
	protected CorporateActionPrice relatedCorporateActionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
	 * CorporateActionPrice.mmPricingCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action price for which pricing information is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, CorporateActionPrice> mmRelatedCorporateActionPrice = new MMBusinessAssociationEnd<SecuritiesPricing, CorporateActionPrice>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionPrice";
			definition = "Corporate action price for which pricing information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionPrice.mmPricingCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public CorporateActionPrice getValue(SecuritiesPricing obj) {
			return obj.getRelatedCorporateActionPrice();
		}

		@Override
		public void setValue(SecuritiesPricing obj, CorporateActionPrice value) {
			obj.setRelatedCorporateActionPrice(value);
		}
	};
	protected Position relatedPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmPrice
	 * Position.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position for which a price is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Position> mmRelatedPosition = new MMBusinessAssociationEnd<SecuritiesPricing, Position>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPosition";
			definition = "Position for which a price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Position.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Position.mmObject();
		}

		@Override
		public Position getValue(SecuritiesPricing obj) {
			return obj.getRelatedPosition();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Position value) {
			obj.setRelatedPosition(value);
		}
	};
	protected CorporateActionPrice minimumCashToInstructRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumCashToInstruct
	 * CorporateActionPrice.mmMinimumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCashToInstructRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a minimum cash is instructed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>> mmMinimumCashToInstructRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumCashToInstructRelatedEvent";
			definition = "Corporate action event for which a minimum cash is instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmMinimumCashToInstruct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice> getValue(SecuritiesPricing obj) {
			return obj.getMinimumCashToInstructRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<CorporateActionPrice> value) {
			obj.setMinimumCashToInstructRelatedEvent(value.orElse(null));
		}
	};
	protected CorporateActionPrice maximumCashToInstructRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMaximumCashToInstruct
	 * CorporateActionPrice.mmMaximumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCashToInstructRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a maximum cash is instructed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>> mmMaximumCashToInstructRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumCashToInstructRelatedEvent";
			definition = "Corporate action event for which a maximum cash is instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmMaximumCashToInstruct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice> getValue(SecuritiesPricing obj) {
			return obj.getMaximumCashToInstructRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<CorporateActionPrice> value) {
			obj.setMaximumCashToInstructRelatedEvent(value.orElse(null));
		}
	};
	protected CorporateActionPrice minimumMultipleCashToInstructRelatedEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumMultipleCashToInstruct
	 * CorporateActionPrice.mmMinimumMultipleCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleCashToInstructRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a minimum multiple cash is instructed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>> mmMinimumMultipleCashToInstructRelatedEvent = new MMBusinessAssociationEnd<SecuritiesPricing, Optional<CorporateActionPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumMultipleCashToInstructRelatedEvent";
			definition = "Corporate action event for which a minimum multiple cash is instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionPrice.mmMinimumMultipleCashToInstruct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice> getValue(SecuritiesPricing obj) {
			return obj.getMinimumMultipleCashToInstructRelatedEvent();
		}

		@Override
		public void setValue(SecuritiesPricing obj, Optional<CorporateActionPrice> value) {
			obj.setMinimumMultipleCashToInstructRelatedEvent(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPricing";
				definition = "Characteristics related to the price of the security.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmPricing, InformationPartyRole.mmPrice, NetAssetValueCalculation.mmPrice, RedemptionSchedule.mmPriceChange, RedemptionSchedule.mmPrice,
						DateTimePeriod.mmPriceCalculationRelatedPricing, DateTimePeriod.mmPriceFactRelatedPricing, SecuritiesTrade.mmTradePrice, InvestmentFundOrderExecution.mmExecutedTradePrice,
						InvestmentFundOrderExecution.mmInformativePrice, LotBreakdown.mmLotPrice, Price.mmSecuritiesPricing, ValuationStatistics.mmPriceChange, ValuationStatistics.mmHighestPriceValue,
						ValuationStatistics.mmLowestPriceValue, SecuritiesTradeExecution.mmDealPrice, Derivative.mmTick, Derivative.mmExercisePrice, Issuance.mmOriginalIssueDiscount, Index.mmSecuritiesPricing, Warrant.mmSubscriptionPrice,
						SecuritiesConversion.mmConversionPrice, SecuritiesFinancing.mmEndPrice, BiddingConditions.mmMaximumPrice, BiddingConditions.mmMinimumPrice, TaxVoucher.mmScripDividendReinvestmentPricePerShare,
						CorporateActionPrice.mmCorporateActionExercisePrice, CorporateActionPrice.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice.mmGenericCashPricePaidPerProduct, CorporateActionPrice.mmCashInLieuOfSharePrice,
						CorporateActionPrice.mmOverSubscriptionDepositPrice, CorporateActionPrice.mmCashValueForTax, CorporateActionPrice.mmPricingCalculation, CorporateActionPrice.mmMinimumMultipleCashToInstruct,
						CorporateActionPrice.mmMaximumCashToInstruct, CorporateActionPrice.mmMinimumCashToInstruct, AmountAndQuantity.mmSecuritiesPricing, AmountRatio.mmSecuritiesPricing, Spread.mmBenchmarkPrice,
						SecuritiesOrder.mmOrderPrice, SecuritiesOrder.mmStopPrice, YieldCalculation.mmRedemptionPrice, Allocation.mmAllocatedPrice, Distribution.mmOfferPrice, BuyIn.mmBuyInPrice,
						SecuritiesOrderParameters.mmPreviousClosingPrice, Quote.mmPreviousClosingPrice, Quote.mmRequestedPrice, Quote.mmPrice, Quote.mmMarketPrice, SecuritiesDistribution.mmCashFractionsPrice,
						SecuritiesDistribution.mmSubscriptionPrice, SecuritiesDistribution.mmReinvestmentPrice, AnalyticsCalculation.mmSecuritiesPricing, DurationCalculation.mmRelatedSecuritiesPricing, LifeCalculation.mmSecuritiesPricing,
						Entitlement.mmStrikePrice, Position.mmPrice);
				derivationElement_lazy = () -> Arrays.asList(Price2.mmValue, PriceType1Choice.mmMarket, PriceType1Choice.mmIndicative, Price3.mmValue, PriceType2Choice.mmMarket, PriceType2Choice.mmIndicative, PriceInformation5.mmValue,
						PriceInformation7.mmValue, PriceInformation1.mmValue, PriceInformation2.mmValue, PriceInformation6.mmValue, PriceInformation8.mmValue, PriceInformation9.mmValue, TransactionPrice1Choice.mmProprietary,
						TransactionPrice2Choice.mmProprietary, TransactionPrice3Choice.mmProprietary, PriceRate1.mmRateType, PriceInformation10.mmAmountOfChange, PriceInformation3.mmValue, PriceInformation3.mmPriceType,
						PriceInformation4.mmValue, PriceInformation11.mmValue, FinancialInstrumentAggregateBalance1.mmPrice, PriceInformation12.mmValue, PriceInformation13.mmValue, PriceInformation16.mmValue, PriceInformation14.mmValue,
						PriceInformation18.mmValue, Price7.mmValue, PriceType4Choice.mmMarket, PriceType4Choice.mmIndicative, TransactionPrice4Choice.mmProprietary, PriceType5Choice.mmMarket, PriceType5Choice.mmIndicative,
						PriceInformation19.mmValue);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmPriceMethod, com.tools20022.repository.entity.SecuritiesPricing.mmPriceType,
						com.tools20022.repository.entity.SecuritiesPricing.mmCumDividendIndicator, com.tools20022.repository.entity.SecuritiesPricing.mmCalculationBasis,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmRate,
						com.tools20022.repository.entity.SecuritiesPricing.mmHighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmLowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.mmSecurity, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesPricing.mmYielded,
						com.tools20022.repository.entity.SecuritiesPricing.mmTypeOfRate, com.tools20022.repository.entity.SecuritiesPricing.mmDerivative, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedWarrant,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesConversion, com.tools20022.repository.entity.SecuritiesPricing.mmLotBreakdown, com.tools20022.repository.entity.SecuritiesPricing.mmTypeOfAmount,
						com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerAmount,
						com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmPriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmMaximumPriceBiddingConditions,
						com.tools20022.repository.entity.SecuritiesPricing.mmMinimumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.mmQuotationDate,
						com.tools20022.repository.entity.SecuritiesPricing.mmYieldCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.SecuritiesPricing.mmTaxVoucher, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedBuyIn, com.tools20022.repository.entity.SecuritiesPricing.mmIndex, com.tools20022.repository.entity.SecuritiesPricing.mmInformationPartyRole,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceFactPeriod, com.tools20022.repository.entity.SecuritiesPricing.mmAnalyticsCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.mmDurationCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmLifeCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmDate,
						com.tools20022.repository.entity.SecuritiesPricing.mmSpread, com.tools20022.repository.entity.SecuritiesPricing.mmOrder, com.tools20022.repository.entity.SecuritiesPricing.mmStopPriceOrder,
						com.tools20022.repository.entity.SecuritiesPricing.mmAllocation, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesPricing.mmIssuance,
						com.tools20022.repository.entity.SecuritiesPricing.mmEntitlement, com.tools20022.repository.entity.SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedFuture, com.tools20022.repository.entity.SecuritiesPricing.mmDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.mmPreviousClosingPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmRequestedPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmMarketPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmPrice,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedPosition,
						com.tools20022.repository.entity.SecuritiesPricing.mmMinimumCashToInstructRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmMaximumCashToInstructRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmMinimumMultipleCashToInstructRelatedEvent);
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
						TypeOfPrice32Choice.mmObject(), PriceInformation14.mmObject(), AmountPricePerFinancialInstrumentQuantity8.mmObject(), UnitPrice22.mmObject(), UnitPrice23.mmObject(), PriceInformation18.mmObject(),
						PriceRateOrAmount3Choice.mmObject(), Price7.mmObject(), PriceType4Choice.mmObject(), PriceRateOrAmountOrUnknown2Choice.mmObject(), PriceFormat61Choice.mmObject(), AmountPrice6.mmObject(),
						TransactionPrice4Choice.mmObject(), PriceType5Choice.mmObject(), PriceInformation19.mmObject(), PriceRateOrAmountOrUnknown3Choice.mmObject(), PriceFormat62Choice.mmObject(), AmountPrice7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesPricing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PriceMethodCode getPriceMethod() {
		return priceMethod;
	}

	public SecuritiesPricing setPriceMethod(PriceMethodCode priceMethod) {
		this.priceMethod = Objects.requireNonNull(priceMethod);
		return this;
	}

	public TypeOfPriceCode getPriceType() {
		return priceType;
	}

	public SecuritiesPricing setPriceType(TypeOfPriceCode priceType) {
		this.priceType = Objects.requireNonNull(priceType);
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public SecuritiesPricing setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public PercentageRate getCalculationBasis() {
		return calculationBasis;
	}

	public SecuritiesPricing setCalculationBasis(PercentageRate calculationBasis) {
		this.calculationBasis = Objects.requireNonNull(calculationBasis);
		return this;
	}

	public List<ValuationStatistics> getPriceChangeRelatedStatistics() {
		return priceChangeRelatedStatistics == null ? priceChangeRelatedStatistics = new ArrayList<>() : priceChangeRelatedStatistics;
	}

	public SecuritiesPricing setPriceChangeRelatedStatistics(List<ValuationStatistics> priceChangeRelatedStatistics) {
		this.priceChangeRelatedStatistics = Objects.requireNonNull(priceChangeRelatedStatistics);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public SecuritiesPricing setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Optional<ValuationStatistics> getHighestPriceValueRelatedStatistics() {
		return highestPriceValueRelatedStatistics == null ? Optional.empty() : Optional.of(highestPriceValueRelatedStatistics);
	}

	public SecuritiesPricing setHighestPriceValueRelatedStatistics(ValuationStatistics highestPriceValueRelatedStatistics) {
		this.highestPriceValueRelatedStatistics = highestPriceValueRelatedStatistics;
		return this;
	}

	public Optional<ValuationStatistics> getLowestPriceValueRelatedStatistics() {
		return lowestPriceValueRelatedStatistics == null ? Optional.empty() : Optional.of(lowestPriceValueRelatedStatistics);
	}

	public SecuritiesPricing setLowestPriceValueRelatedStatistics(ValuationStatistics lowestPriceValueRelatedStatistics) {
		this.lowestPriceValueRelatedStatistics = lowestPriceValueRelatedStatistics;
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesPricing setSecurity(List<Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Optional<SecuritiesTradeExecution> getSecuritiesTradeExecution() {
		return securitiesTradeExecution == null ? Optional.empty() : Optional.of(securitiesTradeExecution);
	}

	public SecuritiesPricing setSecuritiesTradeExecution(SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
		return this;
	}

	public YesNoIndicator getYielded() {
		return yielded;
	}

	public SecuritiesPricing setYielded(YesNoIndicator yielded) {
		this.yielded = Objects.requireNonNull(yielded);
		return this;
	}

	public PriceValueTypeCode getTypeOfRate() {
		return typeOfRate;
	}

	public SecuritiesPricing setTypeOfRate(PriceValueTypeCode typeOfRate) {
		this.typeOfRate = Objects.requireNonNull(typeOfRate);
		return this;
	}

	public List<Derivative> getDerivative() {
		return derivative == null ? derivative = new ArrayList<>() : derivative;
	}

	public SecuritiesPricing setDerivative(List<Derivative> derivative) {
		this.derivative = Objects.requireNonNull(derivative);
		return this;
	}

	public List<Warrant> getRelatedWarrant() {
		return relatedWarrant == null ? relatedWarrant = new ArrayList<>() : relatedWarrant;
	}

	public SecuritiesPricing setRelatedWarrant(List<Warrant> relatedWarrant) {
		this.relatedWarrant = Objects.requireNonNull(relatedWarrant);
		return this;
	}

	public SecuritiesConversion getRelatedSecuritiesConversion() {
		return relatedSecuritiesConversion;
	}

	public SecuritiesPricing setRelatedSecuritiesConversion(SecuritiesConversion relatedSecuritiesConversion) {
		this.relatedSecuritiesConversion = Objects.requireNonNull(relatedSecuritiesConversion);
		return this;
	}

	public Optional<LotBreakdown> getLotBreakdown() {
		return lotBreakdown == null ? Optional.empty() : Optional.of(lotBreakdown);
	}

	public SecuritiesPricing setLotBreakdown(LotBreakdown lotBreakdown) {
		this.lotBreakdown = lotBreakdown;
		return this;
	}

	public AmountPriceTypeCode getTypeOfAmount() {
		return typeOfAmount;
	}

	public SecuritiesPricing setTypeOfAmount(AmountPriceTypeCode typeOfAmount) {
		this.typeOfAmount = Objects.requireNonNull(typeOfAmount);
		return this;
	}

	public CorporateActionPrice getExercisePriceRelatedEvent() {
		return exercisePriceRelatedEvent;
	}

	public SecuritiesPricing setExercisePriceRelatedEvent(CorporateActionPrice exercisePriceRelatedEvent) {
		this.exercisePriceRelatedEvent = Objects.requireNonNull(exercisePriceRelatedEvent);
		return this;
	}

	public Optional<CorporateActionPrice> getGenericCashPriceReceivedPerProductRelatedEvent() {
		return genericCashPriceReceivedPerProductRelatedEvent == null ? Optional.empty() : Optional.of(genericCashPriceReceivedPerProductRelatedEvent);
	}

	public SecuritiesPricing setGenericCashPriceReceivedPerProductRelatedEvent(CorporateActionPrice genericCashPriceReceivedPerProductRelatedEvent) {
		this.genericCashPriceReceivedPerProductRelatedEvent = genericCashPriceReceivedPerProductRelatedEvent;
		return this;
	}

	public AmountAndQuantity getAmountPricePerFinancialInstrumentQuantity() {
		return amountPricePerFinancialInstrumentQuantity;
	}

	public SecuritiesPricing setAmountPricePerFinancialInstrumentQuantity(AmountAndQuantity amountPricePerFinancialInstrumentQuantity) {
		this.amountPricePerFinancialInstrumentQuantity = Objects.requireNonNull(amountPricePerFinancialInstrumentQuantity);
		return this;
	}

	public AmountRatio getAmountPricePerAmount() {
		return amountPricePerAmount;
	}

	public SecuritiesPricing setAmountPricePerAmount(AmountRatio amountPricePerAmount) {
		this.amountPricePerAmount = Objects.requireNonNull(amountPricePerAmount);
		return this;
	}

	public Optional<CorporateActionPrice> getGenericCashPricePaidPerProductRelatedEvent() {
		return genericCashPricePaidPerProductRelatedEvent == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProductRelatedEvent);
	}

	public SecuritiesPricing setGenericCashPricePaidPerProductRelatedEvent(CorporateActionPrice genericCashPricePaidPerProductRelatedEvent) {
		this.genericCashPricePaidPerProductRelatedEvent = genericCashPricePaidPerProductRelatedEvent;
		return this;
	}

	public DateTimePeriod getPriceCalculationPeriod() {
		return priceCalculationPeriod;
	}

	public SecuritiesPricing setPriceCalculationPeriod(DateTimePeriod priceCalculationPeriod) {
		this.priceCalculationPeriod = Objects.requireNonNull(priceCalculationPeriod);
		return this;
	}

	public Optional<CorporateActionPrice> getCashInLieuOfSharePriceRelatedEvent() {
		return cashInLieuOfSharePriceRelatedEvent == null ? Optional.empty() : Optional.of(cashInLieuOfSharePriceRelatedEvent);
	}

	public SecuritiesPricing setCashInLieuOfSharePriceRelatedEvent(CorporateActionPrice cashInLieuOfSharePriceRelatedEvent) {
		this.cashInLieuOfSharePriceRelatedEvent = cashInLieuOfSharePriceRelatedEvent;
		return this;
	}

	public Optional<CorporateActionPrice> getOverSubscriptionDepositPriceRelatedEvent() {
		return overSubscriptionDepositPriceRelatedEvent == null ? Optional.empty() : Optional.of(overSubscriptionDepositPriceRelatedEvent);
	}

	public SecuritiesPricing setOverSubscriptionDepositPriceRelatedEvent(CorporateActionPrice overSubscriptionDepositPriceRelatedEvent) {
		this.overSubscriptionDepositPriceRelatedEvent = overSubscriptionDepositPriceRelatedEvent;
		return this;
	}

	public CorporateActionPrice getCashValueForTaxRelatedEvent() {
		return cashValueForTaxRelatedEvent;
	}

	public SecuritiesPricing setCashValueForTaxRelatedEvent(CorporateActionPrice cashValueForTaxRelatedEvent) {
		this.cashValueForTaxRelatedEvent = Objects.requireNonNull(cashValueForTaxRelatedEvent);
		return this;
	}

	public BiddingConditions getMaximumPriceBiddingConditions() {
		return maximumPriceBiddingConditions;
	}

	public SecuritiesPricing setMaximumPriceBiddingConditions(BiddingConditions maximumPriceBiddingConditions) {
		this.maximumPriceBiddingConditions = Objects.requireNonNull(maximumPriceBiddingConditions);
		return this;
	}

	public BiddingConditions getMinimumPriceBiddingConditions() {
		return minimumPriceBiddingConditions;
	}

	public SecuritiesPricing setMinimumPriceBiddingConditions(BiddingConditions minimumPriceBiddingConditions) {
		this.minimumPriceBiddingConditions = Objects.requireNonNull(minimumPriceBiddingConditions);
		return this;
	}

	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public SecuritiesPricing setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = Objects.requireNonNull(quotationDate);
		return this;
	}

	public List<YieldCalculation> getYieldCalculation() {
		return yieldCalculation == null ? yieldCalculation = new ArrayList<>() : yieldCalculation;
	}

	public SecuritiesPricing setYieldCalculation(List<YieldCalculation> yieldCalculation) {
		this.yieldCalculation = Objects.requireNonNull(yieldCalculation);
		return this;
	}

	public List<SecuritiesFinancing> getRelatedSecuritiesFinancing() {
		return relatedSecuritiesFinancing == null ? relatedSecuritiesFinancing = new ArrayList<>() : relatedSecuritiesFinancing;
	}

	public SecuritiesPricing setRelatedSecuritiesFinancing(List<SecuritiesFinancing> relatedSecuritiesFinancing) {
		this.relatedSecuritiesFinancing = Objects.requireNonNull(relatedSecuritiesFinancing);
		return this;
	}

	public Optional<InvestmentFundOrderExecution> getFundOrderRelatedToExecutedPrice() {
		return fundOrderRelatedToExecutedPrice == null ? Optional.empty() : Optional.of(fundOrderRelatedToExecutedPrice);
	}

	public SecuritiesPricing setFundOrderRelatedToExecutedPrice(InvestmentFundOrderExecution fundOrderRelatedToExecutedPrice) {
		this.fundOrderRelatedToExecutedPrice = fundOrderRelatedToExecutedPrice;
		return this;
	}

	public Optional<InvestmentFundOrderExecution> getFundOrderRelatedToInformativePrice() {
		return fundOrderRelatedToInformativePrice == null ? Optional.empty() : Optional.of(fundOrderRelatedToInformativePrice);
	}

	public SecuritiesPricing setFundOrderRelatedToInformativePrice(InvestmentFundOrderExecution fundOrderRelatedToInformativePrice) {
		this.fundOrderRelatedToInformativePrice = fundOrderRelatedToInformativePrice;
		return this;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public SecuritiesPricing setTaxVoucher(TaxVoucher taxVoucher) {
		this.taxVoucher = Objects.requireNonNull(taxVoucher);
		return this;
	}

	public Optional<SecuritiesTrade> getSecuritiesTrade() {
		return securitiesTrade == null ? Optional.empty() : Optional.of(securitiesTrade);
	}

	public SecuritiesPricing setSecuritiesTrade(SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = securitiesTrade;
		return this;
	}

	public List<NetAssetValueCalculation> getNetAssetValueCalculation() {
		return netAssetValueCalculation == null ? netAssetValueCalculation = new ArrayList<>() : netAssetValueCalculation;
	}

	public SecuritiesPricing setNetAssetValueCalculation(List<NetAssetValueCalculation> netAssetValueCalculation) {
		this.netAssetValueCalculation = Objects.requireNonNull(netAssetValueCalculation);
		return this;
	}

	public BuyIn getRelatedBuyIn() {
		return relatedBuyIn;
	}

	public SecuritiesPricing setRelatedBuyIn(BuyIn relatedBuyIn) {
		this.relatedBuyIn = Objects.requireNonNull(relatedBuyIn);
		return this;
	}

	public List<Index> getIndex() {
		return index == null ? index = new ArrayList<>() : index;
	}

	public SecuritiesPricing setIndex(List<Index> index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public InformationPartyRole getInformationPartyRole() {
		return informationPartyRole;
	}

	public SecuritiesPricing setInformationPartyRole(InformationPartyRole informationPartyRole) {
		this.informationPartyRole = Objects.requireNonNull(informationPartyRole);
		return this;
	}

	public DateTimePeriod getPriceFactPeriod() {
		return priceFactPeriod;
	}

	public SecuritiesPricing setPriceFactPeriod(DateTimePeriod priceFactPeriod) {
		this.priceFactPeriod = Objects.requireNonNull(priceFactPeriod);
		return this;
	}

	public List<AnalyticsCalculation> getAnalyticsCalculation() {
		return analyticsCalculation == null ? analyticsCalculation = new ArrayList<>() : analyticsCalculation;
	}

	public SecuritiesPricing setAnalyticsCalculation(List<AnalyticsCalculation> analyticsCalculation) {
		this.analyticsCalculation = Objects.requireNonNull(analyticsCalculation);
		return this;
	}

	public List<DurationCalculation> getDurationCalculation() {
		return durationCalculation == null ? durationCalculation = new ArrayList<>() : durationCalculation;
	}

	public SecuritiesPricing setDurationCalculation(List<DurationCalculation> durationCalculation) {
		this.durationCalculation = Objects.requireNonNull(durationCalculation);
		return this;
	}

	public List<LifeCalculation> getLifeCalculation() {
		return lifeCalculation == null ? lifeCalculation = new ArrayList<>() : lifeCalculation;
	}

	public SecuritiesPricing setLifeCalculation(List<LifeCalculation> lifeCalculation) {
		this.lifeCalculation = Objects.requireNonNull(lifeCalculation);
		return this;
	}

	public ISODateTime getDate() {
		return date;
	}

	public SecuritiesPricing setDate(ISODateTime date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public SecuritiesPricing setSpread(Spread spread) {
		this.spread = spread;
		return this;
	}

	public Optional<SecuritiesOrder> getOrder() {
		return order == null ? Optional.empty() : Optional.of(order);
	}

	public SecuritiesPricing setOrder(SecuritiesOrder order) {
		this.order = order;
		return this;
	}

	public Optional<SecuritiesOrder> getStopPriceOrder() {
		return stopPriceOrder == null ? Optional.empty() : Optional.of(stopPriceOrder);
	}

	public SecuritiesPricing setStopPriceOrder(SecuritiesOrder stopPriceOrder) {
		this.stopPriceOrder = stopPriceOrder;
		return this;
	}

	public Optional<Allocation> getAllocation() {
		return allocation == null ? Optional.empty() : Optional.of(allocation);
	}

	public SecuritiesPricing setAllocation(Allocation allocation) {
		this.allocation = allocation;
		return this;
	}

	public Optional<SecuritiesOrderParameters> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesPricing setRelatedOrder(SecuritiesOrderParameters relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public SecuritiesPricing setIssuance(Issuance issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public Entitlement getEntitlement() {
		return entitlement;
	}

	public SecuritiesPricing setEntitlement(Entitlement entitlement) {
		this.entitlement = Objects.requireNonNull(entitlement);
		return this;
	}

	public SecuritiesDistribution getCashFractionsPriceRelatedSecuritiesDistribution() {
		return cashFractionsPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesPricing setCashFractionsPriceRelatedSecuritiesDistribution(SecuritiesDistribution cashFractionsPriceRelatedSecuritiesDistribution) {
		this.cashFractionsPriceRelatedSecuritiesDistribution = Objects.requireNonNull(cashFractionsPriceRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getSuscriptionPriceRelatedSecuritiesDistribution() {
		return suscriptionPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesPricing setSuscriptionPriceRelatedSecuritiesDistribution(SecuritiesDistribution suscriptionPriceRelatedSecuritiesDistribution) {
		this.suscriptionPriceRelatedSecuritiesDistribution = Objects.requireNonNull(suscriptionPriceRelatedSecuritiesDistribution);
		return this;
	}

	public SecuritiesDistribution getReinvestmentPriceRelatedSecuritiesDistribution() {
		return reinvestmentPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesPricing setReinvestmentPriceRelatedSecuritiesDistribution(SecuritiesDistribution reinvestmentPriceRelatedSecuritiesDistribution) {
		this.reinvestmentPriceRelatedSecuritiesDistribution = Objects.requireNonNull(reinvestmentPriceRelatedSecuritiesDistribution);
		return this;
	}

	public Derivative getRelatedFuture() {
		return relatedFuture;
	}

	public SecuritiesPricing setRelatedFuture(Derivative relatedFuture) {
		this.relatedFuture = Objects.requireNonNull(relatedFuture);
		return this;
	}

	public Distribution getDistribution() {
		return distribution;
	}

	public SecuritiesPricing setDistribution(Distribution distribution) {
		this.distribution = Objects.requireNonNull(distribution);
		return this;
	}

	public RedemptionSchedule getPriceChangeRedemptionSchedule() {
		return priceChangeRedemptionSchedule;
	}

	public SecuritiesPricing setPriceChangeRedemptionSchedule(RedemptionSchedule priceChangeRedemptionSchedule) {
		this.priceChangeRedemptionSchedule = Objects.requireNonNull(priceChangeRedemptionSchedule);
		return this;
	}

	public RedemptionSchedule getRelatedRedemptionSchedule() {
		return relatedRedemptionSchedule;
	}

	public SecuritiesPricing setRelatedRedemptionSchedule(RedemptionSchedule relatedRedemptionSchedule) {
		this.relatedRedemptionSchedule = Objects.requireNonNull(relatedRedemptionSchedule);
		return this;
	}

	public Optional<Quote> getPreviousClosingPriceRelatedQuote() {
		return previousClosingPriceRelatedQuote == null ? Optional.empty() : Optional.of(previousClosingPriceRelatedQuote);
	}

	public SecuritiesPricing setPreviousClosingPriceRelatedQuote(Quote previousClosingPriceRelatedQuote) {
		this.previousClosingPriceRelatedQuote = previousClosingPriceRelatedQuote;
		return this;
	}

	public Optional<Quote> getRequestedPriceRelatedQuote() {
		return requestedPriceRelatedQuote == null ? Optional.empty() : Optional.of(requestedPriceRelatedQuote);
	}

	public SecuritiesPricing setRequestedPriceRelatedQuote(Quote requestedPriceRelatedQuote) {
		this.requestedPriceRelatedQuote = requestedPriceRelatedQuote;
		return this;
	}

	public Optional<Quote> getPriceRelatedQuote() {
		return priceRelatedQuote == null ? Optional.empty() : Optional.of(priceRelatedQuote);
	}

	public SecuritiesPricing setPriceRelatedQuote(Quote priceRelatedQuote) {
		this.priceRelatedQuote = priceRelatedQuote;
		return this;
	}

	public Optional<Quote> getMarketPriceRelatedQuote() {
		return marketPriceRelatedQuote == null ? Optional.empty() : Optional.of(marketPriceRelatedQuote);
	}

	public SecuritiesPricing setMarketPriceRelatedQuote(Quote marketPriceRelatedQuote) {
		this.marketPriceRelatedQuote = marketPriceRelatedQuote;
		return this;
	}

	public Price getPrice() {
		return price;
	}

	public SecuritiesPricing setPrice(Price price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public CorporateActionPrice getRelatedCorporateActionPrice() {
		return relatedCorporateActionPrice;
	}

	public SecuritiesPricing setRelatedCorporateActionPrice(CorporateActionPrice relatedCorporateActionPrice) {
		this.relatedCorporateActionPrice = Objects.requireNonNull(relatedCorporateActionPrice);
		return this;
	}

	public Position getRelatedPosition() {
		return relatedPosition;
	}

	public SecuritiesPricing setRelatedPosition(Position relatedPosition) {
		this.relatedPosition = Objects.requireNonNull(relatedPosition);
		return this;
	}

	public Optional<CorporateActionPrice> getMinimumCashToInstructRelatedEvent() {
		return minimumCashToInstructRelatedEvent == null ? Optional.empty() : Optional.of(minimumCashToInstructRelatedEvent);
	}

	public SecuritiesPricing setMinimumCashToInstructRelatedEvent(CorporateActionPrice minimumCashToInstructRelatedEvent) {
		this.minimumCashToInstructRelatedEvent = minimumCashToInstructRelatedEvent;
		return this;
	}

	public Optional<CorporateActionPrice> getMaximumCashToInstructRelatedEvent() {
		return maximumCashToInstructRelatedEvent == null ? Optional.empty() : Optional.of(maximumCashToInstructRelatedEvent);
	}

	public SecuritiesPricing setMaximumCashToInstructRelatedEvent(CorporateActionPrice maximumCashToInstructRelatedEvent) {
		this.maximumCashToInstructRelatedEvent = maximumCashToInstructRelatedEvent;
		return this;
	}

	public Optional<CorporateActionPrice> getMinimumMultipleCashToInstructRelatedEvent() {
		return minimumMultipleCashToInstructRelatedEvent == null ? Optional.empty() : Optional.of(minimumMultipleCashToInstructRelatedEvent);
	}

	public SecuritiesPricing setMinimumMultipleCashToInstructRelatedEvent(CorporateActionPrice minimumMultipleCashToInstructRelatedEvent) {
		this.minimumMultipleCashToInstructRelatedEvent = minimumMultipleCashToInstructRelatedEvent;
		return this;
	}
}