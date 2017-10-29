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
import com.tools20022.repository.codeset.QuantityCode;
import com.tools20022.repository.codeset.UKTaxGroupUnitCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Quantity of a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesQuantity" src="doc-files/SecuritiesQuantity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Unit
 * SecuritiesQuantity.Unit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTransfer
 * SecuritiesQuantity.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecurityIdentification
 * SecuritiesQuantity.SecurityIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Order
 * SecuritiesQuantity.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Group1Or2Units
 * SecuritiesQuantity.Group1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderExecution
 * SecuritiesQuantity.RelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesSettlement
 * SecuritiesQuantity.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityDebt
 * SecuritiesQuantity.MinimumQuantityDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#LotBreakdown
 * SecuritiesQuantity.LotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AggregateQuantityBalance
 * SecuritiesQuantity.AggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesProceedsDefinition
 * SecuritiesQuantity.SecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ConditionalQuantitySecuritiesProceeds
 * SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#OverAndAboveQuantitySecuritiesProceeds
 * SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Entry
 * SecuritiesQuantity.Entry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Code
 * SecuritiesQuantity.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#ExpectedQuantitySecuritiesProceeds
 * SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#StatusRelatedSecuritiesProceeds
 * SecuritiesQuantity.StatusRelatedSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionDistribution
 * SecuritiesQuantity.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedEventForFractionalQuantity
 * SecuritiesQuantity.RelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BoardLotSecuritiesProceeds
 * SecuritiesQuantity.BoardLotSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NewDenominationSecuritiesProceeds
 * SecuritiesQuantity.NewDenominationSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BackEndOddLotBiddingConditions
 * SecuritiesQuantity.BackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesEntitlement
 * SecuritiesQuantity.SecuritiesEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionEvent
 * SecuritiesQuantity.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BiddingConditions
 * SecuritiesQuantity.BiddingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Lottery
 * SecuritiesQuantity.Lottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedSubBalance
 * SecuritiesQuantity.RelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AvailableQuantityBalance
 * SecuritiesQuantity.AvailableQuantityBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Trade
 * SecuritiesQuantity.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.RatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.RatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumTradedQuantityMarket
 * SecuritiesQuantity.MinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumDenominationDebt
 * SecuritiesQuantity.MinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumIncrementDebt
 * SecuritiesQuantity.MinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrder
 * SecuritiesQuantity.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Allocation
 * SecuritiesQuantity.Allocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Amount
 * SecuritiesQuantity.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DenominatorRatio
 * SecuritiesQuantity.DenominatorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NumeratorRatio
 * SecuritiesQuantity.NumeratorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTradeExecution
 * SecuritiesQuantity.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCorporateActionEvent
 * SecuritiesQuantity.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#CorporateActionElection
 * SecuritiesQuantity.CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#TaxVoucher
 * SecuritiesQuantity.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedBuyIn
 * SecuritiesQuantity.RelatedBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#PreviousDayOrder
 * SecuritiesQuantity.PreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Liquidity
 * SecuritiesQuantity.Liquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Rate
 * SecuritiesQuantity.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityOrderParameters
 * SecuritiesQuantity.MinimumQuantityOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityRelatedQuote
 * SecuritiesQuantity.MaximumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#UnavailableQuantityBalance
 * SecuritiesQuantity.UnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MatchIncrementOrderParameters
 * SecuritiesQuantity.MatchIncrementOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedIssuance
 * SecuritiesQuantity.RelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Pairoff
 * SecuritiesQuantity.Pairoff}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Issuance
 * SecuritiesQuantity.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingDistributionInformation
 * SecuritiesQuantity.MaximumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingDistributionInformation
 * SecuritiesQuantity.MinimumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumTradedQuantityMarket
 * SecuritiesQuantity.MaximumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#QuantityRelatedQuote
 * SecuritiesQuantity.QuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityRelatedQuote
 * SecuritiesQuantity.MinimumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#NetAssetValueCalculation
 * SecuritiesQuantity.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SidePocket
 * SecuritiesQuantity.SidePocket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Netting
 * SecuritiesQuantity.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderStatus
 * SecuritiesQuantity.RelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesOrderStatus
 * SecuritiesQuantity.SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedTurnaroundSettlement
 * SecuritiesQuantity.RelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCashFlow
 * SecuritiesQuantity.RelatedCashFlow}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Position
 * SecuritiesQuantity.Position}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityBiddingConditions
 * SecuritiesQuantity.MaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#FrontEndOddLotBiddingConditions
 * SecuritiesQuantity.FrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityBiddingConditions
 * SecuritiesQuantity.MinimumQuantityBiddingConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
 * Security.SecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#MinimumQuantity
 * Security.MinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#SecuritiesQuantity
 * NetAssetValueCalculation.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MinimumTradedNominalQuantity
 * TradingMarket.MinimumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#MaximumTradedNominalQuantity
 * TradingMarket.MaximumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#UnitsNumber
 * InvestmentFundOrder.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeQuantity
 * SecuritiesTrade.TradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferredQuantity
 * SecuritiesTransfer.TransferredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#UnitsNumber
 * InvestmentFundOrderExecution.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementQuantity
 * SecuritiesSettlement.SettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TurnedQuantity
 * SecuritiesSettlement.TurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#SecuritiesQuantity
 * LotBreakdown.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#FinancialInstrumentQuantity
 * SecuritiesEntry.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ExecutedTradeQuantity
 * SecuritiesTradeExecution.ExecutedTradeQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumDenomination
 * Debt.MinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#MinimumIncrement
 * Debt.MinimumIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
 * Issuance.IssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#Minimum
 * Issuance.Minimum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableQuantity
 * SecuritiesConversion.MinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableMultipleQuantity
 * SecuritiesConversion.MinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MaximumExercisableQuantity
 * SecuritiesConversion.MaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioDenominator
 * SecuritiesConversion.ConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioNumerator
 * SecuritiesConversion.ConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AggregateQuantity
 * SecuritiesBalance.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SubBalanceQuantity
 * SecuritiesBalance.SubBalanceQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailableQuantity
 * SecuritiesBalance.AvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UnavailableQuantity
 * SecuritiesBalance.UnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FractionalQuantity
 * CorporateActionEvent.FractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantity
 * CorporateActionEvent.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantitySought
 * CorporateActionEvent.SecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SecuritiesQuantity
 * SecuritiesProceedsDefinition.SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ConditionalQuantity
 * SecuritiesProceedsDefinition.ConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#OverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#QuantityToReceive
 * SecuritiesProceedsDefinition.QuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#StatusQuantity
 * SecuritiesProceedsDefinition.StatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#BoardLotSecuritiesQuantity
 * SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewDenominationSecuritiesQuantity
 * SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Quantity
 * CorporateActionElection.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#FrontEndOddLotQuantity
 * BiddingConditions.FrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BackEndOddLotQuantity
 * BiddingConditions.BackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumQuantity
 * BiddingConditions.MaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumQuantitySought
 * BiddingConditions.MinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BaseDenomination
 * BiddingConditions.BaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RecordDateHolding
 * TaxVoucher.RecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingQuantity
 * CorporateActionDistribution.PostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#EntitledSecuritiesQuantity
 * CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#IncrementalDenomination
 * Lottery.IncrementalDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedQuantity
 * SecuritiesOrder.OrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#DayOrderQuantity
 * SecuritiesOrder.DayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedQuantity
 * Allocation.AllocatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityDenominator
 * UnderlyingRatio.UnderlyingQuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityNumerator
 * UnderlyingRatio.UnderlyingQuantityNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#CashFlowQuantity
 * FundsCashFlow.CashFlowQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#CumulativeQuantity
 * SecuritiesOrderStatus.CumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#RemainingQuantity
 * SecuritiesOrderStatus.RemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#SecuritiesCompensation
 * BuyIn.SecuritiesCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#SidePocketQuantity
 * SidePocket.SidePocketQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#Quantity
 * Liquidity.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MinimumQuantity
 * SecuritiesOrderParameters.MinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MatchIncrement
 * SecuritiesOrderParameters.MatchIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#MaximumQuantity
 * Quote.MaximumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#Quantity
 * Quote.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#MinimumQuantity
 * Quote.MinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PairOff#PairedOffQuantity
 * PairOff.PairedOffQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingDenominator
 * SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumHolding
 * SecuritiesAndCashDistribution.MaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumExercisableQuantity
 * SecuritiesAndCashDistribution.MaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumExercisableQuantity
 * SecuritiesAndCashDistribution.MinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingDenominator
 * SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingNumerator
 * SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumHolding
 * SecuritiesAndCashDistribution.MinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingNumerator
 * SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MaximumHolding
 * SecuritiesDistribution.MaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingNumerator
 * SecuritiesDistribution.IntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingDenominator
 * SecuritiesDistribution.IntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingDenominator
 * SecuritiesDistribution.DistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingNumerator
 * SecuritiesDistribution.DistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MinimumHolding
 * SecuritiesDistribution.MinimumHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#NetQuantity
 * Netting.NetQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#NetQuantity
 * Position.NetQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity6Choice#Quantity
 * Quantity6Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity6Choice#OriginalAndCurrentFace
 * Quantity6Choice.OriginalAndCurrentFace}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity10Choice#Quantity
 * Quantity10Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity10Choice#OriginalAndCurrentFace
 * Quantity10Choice.OriginalAndCurrentFace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity5Choice#OriginalAndCurrentFaceAmount
 * Quantity5Choice.OriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity5Choice#Quantity
 * Quantity5Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity11Choice#OriginalAndCurrentFaceAmount
 * Quantity11Choice.OriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity11Choice#Quantity
 * Quantity11Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice#Quantity
 * QuantityOrAmount1Choice.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryQuantity1#Quantity
 * ProprietaryQuantity1.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities1Choice#Quantity
 * TransactionQuantities1Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities1Choice#Proprietary
 * TransactionQuantities1Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#Quantity
 * TransactionQuantities2Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#OriginalAndCurrentFaceAmount
 * TransactionQuantities2Choice.OriginalAndCurrentFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#Proprietary
 * TransactionQuantities2Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#RemainingQuantityToBeSettled
 * SettlementObligation6.RemainingQuantityToBeSettled}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity1Choice#Quantity
 * Quantity1Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity1Choice#RelativeSize
 * Quantity1Choice.RelativeSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#SettledBalance
 * FinancialInstrumentAggregateBalance2.SettledBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#TradedBalance
 * FinancialInstrumentAggregateBalance2.TradedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#RemainingQuantityToBeSettled
 * SettlementObligation7.RemainingQuantityToBeSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity20Choice#OriginalAndCurrentFaceAmount
 * Quantity20Choice.OriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity20Choice#Quantity
 * Quantity20Choice.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity40Choice#OriginalAndCurrentFaceAmount
 * Quantity40Choice.OriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity40Choice#Quantity
 * Quantity40Choice.Quantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity12Choice
 * Quantity12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit2 Unit2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
 * FinancialInstrumentQuantity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit5 Unit5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit4 Unit4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity14Choice
 * Quantity14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit1 Unit1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit3 Unit3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
 * FinancialInstrumentQuantity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1
 * OriginalAndCurrentQuantities1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity6Choice
 * Quantity6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
 * FinancialInstrumentQuantity15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities4
 * OriginalAndCurrentQuantities4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity10Choice
 * Quantity10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity13Choice
 * Quantity13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities2
 * OriginalAndCurrentQuantities2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity4Choice
 * Quantity4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity3Choice
 * Quantity3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity2Choice
 * Quantity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity5Choice
 * Quantity5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3
 * OriginalAndCurrentQuantities3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity9Choice
 * Quantity9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity8Choice
 * Quantity8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity7Choice
 * Quantity7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity11Choice
 * Quantity11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance1
 * PendingBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance2
 * PendingBalance2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice
 * FinancialInstrumentQuantity2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice
 * FinancialInstrumentQuantity14Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice
 * FinancialInstrumentQuantity16Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice
 * FinancialInstrumentQuantity17Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice
 * FinancialInstrumentQuantity19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice
 * FinancialInstrumentQuantity20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice
 * FinancialInstrumentQuantity21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice
 * FinancialInstrumentQuantity22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
 * FinancialInstrumentQuantityChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice
 * UnitOrFaceAmountChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice
 * QuantityOrAmount1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity18Choice
 * FinancialInstrumentQuantity18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryQuantity1
 * ProprietaryQuantity1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities1Choice
 * TransactionQuantities1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
 * TransactionQuantities2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
 * UnitOrFaceAmount1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice
 * UnitOrFaceAmountOrCodeChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice
 * UnitOrFaceAmountOrCode1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity5 Quantity5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity6 Quantity6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity7 Quantity7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity8 Quantity8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCompensation1
 * SecuritiesCompensation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1
 * SidePocketQuantityAndAmount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice
 * SidePocketUnitsOrAmountOrRate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2
 * FinancialInstrumentQuantity2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3
 * FinancialInstrumentQuantity3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity4
 * FinancialInstrumentQuantity4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice
 * FinancialInstrumentQuantitySearch1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1
 * FinancialInstrumentQuantitySearch1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.QuantitySearch1Choice
 * QuantitySearch1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity1Choice
 * Quantity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity15Choice
 * Quantity15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity16Choice
 * Quantity16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities5
 * OriginalAndCurrentQuantities5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity11 Quantity11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity17Choice
 * Quantity17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity18Choice
 * Quantity18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities6
 * OriginalAndCurrentQuantities6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity20Choice
 * Quantity20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance3
 * PendingBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity19Choice
 * Quantity19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit6 Unit6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance4
 * PendingBalance4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity22Choice
 * Quantity22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity23Choice
 * Quantity23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity21Choice
 * Quantity21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities7
 * OriginalAndCurrentQuantities7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity12 Quantity12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity40Choice
 * Quantity40Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice
 * FinancialInstrumentQuantity25Choice}</li>
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
 * "SecuritiesQuantity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Quantity of a security."</li>
 * </ul>
 */
public class SecuritiesQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of a security.
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
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#PartialHoldingUnits
	 * BlockedHoldingDetails1.PartialHoldingUnits}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity12Choice#Unit
	 * Quantity12Choice.Unit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit2#Group1Number
	 * Unit2.Group1Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit2#Group2Number
	 * Unit2.Group2Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1#Unit
	 * FinancialInstrumentQuantity1.Unit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit5#UnitsNumber
	 * Unit5.UnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity14Choice#Unit
	 * Quantity14Choice.Unit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#UnitsNumber
	 * Unit1.UnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#UnitsNumber
	 * Unit3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice#Unit
	 * FinancialInstrumentQuantity1Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice#Unit
	 * FinancialInstrumentQuantity15Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#Unit
	 * FinancialInstrumentQuantity2Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#Unit
	 * FinancialInstrumentQuantity14Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#Unit
	 * FinancialInstrumentQuantity16Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#Unit
	 * FinancialInstrumentQuantity17Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#Unit
	 * FinancialInstrumentQuantity19Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#Unit
	 * FinancialInstrumentQuantity20Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#Unit
	 * FinancialInstrumentQuantity21Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#Unit
	 * FinancialInstrumentQuantity22Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#Unit
	 * FinancialInstrumentQuantityChoice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice#Unit
	 * UnitOrFaceAmountChoice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity18Choice#Unit
	 * FinancialInstrumentQuantity18Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#SubTotalUnitsNumber
	 * CashInForecast2.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#SubTotalUnitsNumber
	 * CashOutForecast2.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast1#NetUnitsNumber
	 * NetCashForecast1.NetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#SubTotalUnitsNumber
	 * CashInForecast4.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#SubTotalUnitsNumber
	 * CashOutForecast4.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#NetUnitsNumber
	 * NetCashForecast2.NetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#NetUnitsNumber
	 * NetCashForecast3.NetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#UnitsNumber
	 * FundCashInBreakdown1.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#SubTotalUnitsNumber
	 * CashInForecast1.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#UnitsNumber
	 * FundCashOutBreakdown1.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#SubTotalUnitsNumber
	 * CashOutForecast1.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#UnitsNumber
	 * FundCashInBreakdown2.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#SubTotalUnitsNumber
	 * CashInForecast3.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#UnitsNumber
	 * FundCashOutBreakdown2.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#SubTotalUnitsNumber
	 * CashOutForecast3.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice#Unit
	 * UnitOrFaceAmount1Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction#QuantityOfSecurity
	 * VotingPartyAndInstruction.QuantityOfSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestInformation#QuantityOfSecurity
	 * RequestInformation.QuantityOfSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice#Unit
	 * UnitOrFaceAmountOrCodeChoice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice#Unit
	 * UnitOrFaceAmountOrCode1Choice.Unit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity2#Value
	 * Quantity2.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1#UnitsNumber
	 * SidePocketQuantityAndAmount1.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#UnitsNumber
	 * FinancialInstrumentQuantity2.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#UnitsNumber
	 * FinancialInstrumentQuantity3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity4#Unit
	 * FinancialInstrumentQuantity4.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#Unit
	 * FinancialInstrumentQuantitySearch1Choice.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#SubTotalUnitsNumber
	 * CashOutForecast5.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#UnitsNumber
	 * FundCashOutBreakdown3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#NetUnitsNumber
	 * NetCashForecast4.NetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#SubTotalUnitsNumber
	 * CashInForecast5.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#UnitsNumber
	 * FundCashInBreakdown3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#SubTotalUnitsNumber
	 * CashOutForecast6.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#SubTotalUnitsNumber
	 * CashInForecast6.SubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#NetUnitsNumber
	 * NetCashForecast5.NetUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#UnitsNumber
	 * Unit6.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#PartialHoldingUnits
	 * BlockedHoldingDetails2.PartialHoldingUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#Unit
	 * FinancialInstrumentQuantity25Choice.Unit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Unit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BlockedHoldingDetails1.PartialHoldingUnits, com.tools20022.repository.choice.Quantity12Choice.Unit, com.tools20022.repository.msg.Unit2.Group1Number,
					com.tools20022.repository.msg.Unit2.Group2Number, com.tools20022.repository.msg.FinancialInstrumentQuantity1.Unit, com.tools20022.repository.msg.Unit5.UnitsNumber, com.tools20022.repository.choice.Quantity14Choice.Unit,
					com.tools20022.repository.msg.Unit1.UnitsNumber, com.tools20022.repository.msg.Unit3.UnitsNumber, com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice.Unit,
					com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice.Unit, com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.Unit,
					com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice.Unit, com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice.Unit,
					com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice.Unit, com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice.Unit,
					com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice.Unit, com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice.Unit,
					com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice.Unit, com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.Unit, com.tools20022.repository.choice.UnitOrFaceAmountChoice.Unit,
					com.tools20022.repository.choice.FinancialInstrumentQuantity18Choice.Unit, com.tools20022.repository.msg.CashInForecast2.SubTotalUnitsNumber, com.tools20022.repository.msg.CashOutForecast2.SubTotalUnitsNumber,
					com.tools20022.repository.msg.NetCashForecast1.NetUnitsNumber, com.tools20022.repository.msg.CashInForecast4.SubTotalUnitsNumber, com.tools20022.repository.msg.CashOutForecast4.SubTotalUnitsNumber,
					com.tools20022.repository.msg.NetCashForecast2.NetUnitsNumber, com.tools20022.repository.msg.NetCashForecast3.NetUnitsNumber, com.tools20022.repository.msg.FundCashInBreakdown1.UnitsNumber,
					com.tools20022.repository.msg.CashInForecast1.SubTotalUnitsNumber, com.tools20022.repository.msg.FundCashOutBreakdown1.UnitsNumber, com.tools20022.repository.msg.CashOutForecast1.SubTotalUnitsNumber,
					com.tools20022.repository.msg.FundCashInBreakdown2.UnitsNumber, com.tools20022.repository.msg.CashInForecast3.SubTotalUnitsNumber, com.tools20022.repository.msg.FundCashOutBreakdown2.UnitsNumber,
					com.tools20022.repository.msg.CashOutForecast3.SubTotalUnitsNumber, com.tools20022.repository.choice.UnitOrFaceAmount1Choice.Unit, com.tools20022.repository.msg.VotingPartyAndInstruction.QuantityOfSecurity,
					com.tools20022.repository.msg.RequestInformation.QuantityOfSecurity, com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice.Unit, com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice.Unit,
					com.tools20022.repository.msg.Quantity2.Value, com.tools20022.repository.msg.SidePocketQuantityAndAmount1.UnitsNumber, com.tools20022.repository.msg.FinancialInstrumentQuantity2.UnitsNumber,
					com.tools20022.repository.msg.FinancialInstrumentQuantity3.UnitsNumber, com.tools20022.repository.msg.FinancialInstrumentQuantity4.Unit, com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice.Unit,
					com.tools20022.repository.msg.CashOutForecast5.SubTotalUnitsNumber, com.tools20022.repository.msg.FundCashOutBreakdown3.UnitsNumber, com.tools20022.repository.msg.NetCashForecast4.NetUnitsNumber,
					com.tools20022.repository.msg.CashInForecast5.SubTotalUnitsNumber, com.tools20022.repository.msg.FundCashInBreakdown3.UnitsNumber, com.tools20022.repository.msg.CashOutForecast6.SubTotalUnitsNumber,
					com.tools20022.repository.msg.CashInForecast6.SubTotalUnitsNumber, com.tools20022.repository.msg.NetCashForecast5.NetUnitsNumber, com.tools20022.repository.msg.Unit6.UnitsNumber,
					com.tools20022.repository.msg.BlockedHoldingDetails2.PartialHoldingUnits, com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice.Unit);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Quantity of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Transfer of a specific quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferredQuantity
	 * SecuritiesTransfer.TransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of a specific quantity of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer of a specific quantity of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
	 * Security.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecurityIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a number of units is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#UnitsNumber
	 * InvestmentFundOrder.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a number of units is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order for which a number of units is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax group to which the purchased units belong.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode
	 * UKTaxGroupUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit5#Group1Or2Units
	 * Unit5.Group1Or2Units}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#Group1Or2Units
	 * Unit1.Group1Or2Units}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#Group1Or2Units
	 * Unit3.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#Group1Or2Units
	 * RedemptionOrder3.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#Group1Or2Units
	 * RedemptionOrder5.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#Group1Or2Units
	 * RedemptionExecution3.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#Group1Or2Units
	 * RedemptionExecution5.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#Group1Or2Units
	 * RedemptionOrder7.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#Group1Or2Units
	 * RedemptionOrder4.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#Group1Or2Units
	 * RedemptionOrder6.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#Group1Or2Units
	 * RedemptionExecution4.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#Group1Or2Units
	 * RedemptionExecution6.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#Group1Or2Units
	 * RedemptionOrder8.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#Group1Or2Units
	 * SwitchRedemptionLegOrder2.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#Group1Or2Units
	 * SwitchRedemptionLegOrder3.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#Group1Or2Units
	 * SwitchRedemptionLegExecution2.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#Group1Or2Units
	 * SwitchRedemptionLegExecution3.Group1Or2Units}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#Group1Or2Units
	 * Unit6.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#Group1Or2Units
	 * RedemptionOrder14.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#Group1Or2Units
	 * SwitchRedemptionLegOrder6.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#Group1Or2Units
	 * RedemptionOrder15.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#Group1Or2Units
	 * RedemptionExecution16.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#Group1Or2Units
	 * RedemptionExecution15.Group1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#Group1Or2Units
	 * SwitchRedemptionLegExecution4.Group1Or2Units}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax group to which the purchased units belong."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Group1Or2Units = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit5.Group1Or2Units, com.tools20022.repository.msg.Unit1.Group1Or2Units, com.tools20022.repository.msg.Unit3.Group1Or2Units,
					com.tools20022.repository.msg.RedemptionOrder3.Group1Or2Units, com.tools20022.repository.msg.RedemptionOrder5.Group1Or2Units, com.tools20022.repository.msg.RedemptionExecution3.Group1Or2Units,
					com.tools20022.repository.msg.RedemptionExecution5.Group1Or2Units, com.tools20022.repository.msg.RedemptionOrder7.Group1Or2Units, com.tools20022.repository.msg.RedemptionOrder4.Group1Or2Units,
					com.tools20022.repository.msg.RedemptionOrder6.Group1Or2Units, com.tools20022.repository.msg.RedemptionExecution4.Group1Or2Units, com.tools20022.repository.msg.RedemptionExecution6.Group1Or2Units,
					com.tools20022.repository.msg.RedemptionOrder8.Group1Or2Units, com.tools20022.repository.msg.SwitchRedemptionLegOrder2.Group1Or2Units, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.Group1Or2Units,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.Group1Or2Units, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.Group1Or2Units, com.tools20022.repository.msg.Unit6.Group1Or2Units,
					com.tools20022.repository.msg.RedemptionOrder14.Group1Or2Units, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.Group1Or2Units, com.tools20022.repository.msg.RedemptionOrder15.Group1Or2Units,
					com.tools20022.repository.msg.RedemptionExecution16.Group1Or2Units, com.tools20022.repository.msg.RedemptionExecution15.Group1Or2Units, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.Group1Or2Units);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased units belong.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UKTaxGroupUnitCode.mmObject();
		}
	};
	/**
	 * Order execution process for which a number of units is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#UnitsNumber
	 * InvestmentFundOrderExecution.UnitsNumber}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order execution process for which a number of units is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrderExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order execution process for which a number of units is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement of a specific amount of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementQuantity
	 * SecuritiesSettlement.SettlementQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of a specific amount of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific amount of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which a minimum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#MinimumQuantity
	 * Security.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a minimum quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityDebt";
			definition = "Security for which a minimum quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of securities purchased or sold in one transaction. In terms of
	 * options, a lot represents the number of contracts contained in one
	 * derivative security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#SecuritiesQuantity
	 * LotBreakdown.SecuritiesQuantity}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Unit4#UnitDetails
	 * Unit4.UnitDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#QuantityBreakdown
	 * QuantityAndAccount29.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#QuantityBreakdown
	 * QuantityAndAccount30.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#QuantityBreakdown
	 * QuantityAndAccount32.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#QuantityBreakdown
	 * QuantityAndAccount33.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#QuantityBreakdown
	 * FinancialInstrumentAttributes4.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#QuantityBreakdown
	 * FinancialInstrumentAttributes13.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#QuantityBreakdown
	 * FinancialInstrumentAttributes21.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#QuantityBreakdown
	 * FinancialInstrumentAttributes26.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#QuantityBreakdown
	 * FinancialInstrumentAttributes36.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1#QuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown1.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#QuantityBreakdown
	 * FinancialInstrumentAttributes42.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2#QuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown2.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#QuantityBreakdown
	 * FinancialInstrumentAttributes27.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace7.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#QuantityBreakdown
	 * AggregateBalanceInformation8.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace10.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#QuantityBreakdown
	 * AggregateBalanceInformation11.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace12.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#QuantityBreakdown
	 * AggregateBalanceInformation13.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace14.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#QuantityBreakdown
	 * AggregateBalanceInformation15.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace16.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#QuantityBreakdown
	 * AggregateBalanceInformation17.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace18.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#QuantityBreakdown
	 * AggregateBalanceInformation19.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace21.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#QuantityBreakdown
	 * AggregateBalanceInformation22.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace22.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#QuantityBreakdown
	 * AggregateBalanceInformation23.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5#QuantityBreakdown
	 * AdditionalBalanceInformation5.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#QuantityBreakdown
	 * SubBalanceInformation5.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace8.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#QuantityBreakdown
	 * AggregateBalanceInformation9.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8#QuantityBreakdown
	 * AdditionalBalanceInformation8.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#QuantityBreakdown
	 * SubBalanceInformation8.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace9.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#QuantityBreakdown
	 * AggregateBalanceInformation10.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace11.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#QuantityBreakdown
	 * AggregateBalanceInformation12.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace13.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#QuantityBreakdown
	 * AggregateBalanceInformation14.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#QuantityBreakdown
	 * AdditionalBalanceInformation9.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#QuantityBreakdown
	 * SubBalanceInformation9.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace15.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#QuantityBreakdown
	 * AggregateBalanceInformation16.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10#QuantityBreakdown
	 * AdditionalBalanceInformation10.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#QuantityBreakdown
	 * SubBalanceInformation10.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace17.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#QuantityBreakdown
	 * AggregateBalanceInformation18.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11#QuantityBreakdown
	 * AdditionalBalanceInformation11.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#QuantityBreakdown
	 * SubBalanceInformation11.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace20.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#QuantityBreakdown
	 * AggregateBalanceInformation21.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12#QuantityBreakdown
	 * AdditionalBalanceInformation12.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#QuantityBreakdown
	 * SubBalanceInformation12.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace23.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#QuantityBreakdown
	 * AggregateBalanceInformation24.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#QuantityBreakdown
	 * QuantityAndAccount1.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#QuantityBreakdown
	 * QuantityAndAccount5.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#QuantityBreakdown
	 * QuantityAndAccount17.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#QuantityBreakdown
	 * QuantityAndAccount24.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#QuantityBreakdown
	 * QuantityAndAccount25.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#QuantityBreakdown
	 * QuantityAndAccount34.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#QuantityBreakdown
	 * QuantityAndAccount2.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#QuantityBreakdown
	 * QuantityAndAccount12.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#QuantityBreakdown
	 * QuantityAndAccount15.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#QuantityBreakdown
	 * QuantityAndAccount20.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#QuantityBreakdown
	 * QuantityAndAccount28.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#QuantityBreakdown
	 * QuantityAndAccount37.QuantityBreakdown}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#QuantityBreakdown
	 * Order16.QuantityBreakdown}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#QuantityBreakdown
	 * Order14.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#QuantityBreakdown
	 * QuantityAndAccount3.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#QuantityBreakdown
	 * QuantityAndAccount13.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#QuantityBreakdown
	 * QuantityAndAccount8.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#QuantityBreakdown
	 * QuantityAndAccount14.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#QuantityBreakdown
	 * QuantityAndAccount4.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#QuantityBreakdown
	 * QuantityAndAccount22.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#QuantityBreakdown
	 * QuantityAndAccount27.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#QuantityBreakdown
	 * QuantityAndAccount36.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#QuantityBreakdown
	 * QuantityAndAccount9.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#QuantityBreakdown
	 * QuantityAndAccount23.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#QuantityBreakdown
	 * QuantityAndAccount26.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#QuantityBreakdown
	 * QuantityAndAccount35.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#LotDetails
	 * RedemptionExecution10.LotDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#LotDetails
	 * RedemptionOrder9.LotDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1#QuantityBreakdown
	 * CashSubBalanceTypeAndQuantityBreakdown1.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace19.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#QuantityBreakdown
	 * AggregateBalanceInformation20.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace6.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#QuantityBreakdown
	 * AggregateBalanceInformation6.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace5.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#QuantityBreakdown
	 * AggregateBalanceInformation7.QuantityBreakdown}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#QuantityBreakdown
	 * Order17.QuantityBreakdown}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#QuantityBreakdown
	 * Order18.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#QuantityBreakdown
	 * AggregateBalanceInformation26.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#QuantityBreakdown
	 * AggregateBalanceInformation25.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace24.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace25.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#QuantityBreakdown
	 * AggregateBalanceInformation28.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#QuantityBreakdown
	 * AggregateBalanceInformation27.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace26.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace27.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#QuantityBreakdown
	 * QuantityAndAccount39.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#QuantityBreakdown
	 * AggregateBalanceInformation30.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#QuantityBreakdown
	 * QuantityAndAccount41.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#QuantityBreakdown
	 * QuantityAndAccount42.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#QuantityBreakdown
	 * AggregateBalanceInformation31.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace28.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#QuantityBreakdown
	 * QuantityAndAccount43.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace29.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#QuantityBreakdown
	 * FinancialInstrumentAttributes63.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#QuantityBreakdown
	 * SubBalanceInformation15.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#QuantityBreakdown
	 * AdditionalBalanceInformation15.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3#QuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#QuantityBreakdown
	 * QuantityAndAccount45.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#QuantityBreakdown
	 * QuantityAndAccount44.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#QuantityBreakdown
	 * QuantityAndAccount47.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#QuantityBreakdown
	 * AggregateBalanceInformation32.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#QuantityBreakdown
	 * AggregateBalanceInformation33.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#QuantityBreakdown
	 * FinancialInstrumentAttributes75.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#QuantityBreakdown
	 * QuantityAndAccount51.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#QuantityBreakdown
	 * QuantityAndAccount49.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown4#QuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown4.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace31.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17#QuantityBreakdown
	 * AdditionalBalanceInformation17.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#QuantityBreakdown
	 * SubBalanceInformation17.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#QuantityBreakdown
	 * QuantityAndAccount50.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#QuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace30.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#QuantityBreakdown
	 * QuantityAndAccount55.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#QuantityBreakdown
	 * QuantityAndAccount54.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#QuantityBreakdown
	 * QuantityAndAccount57.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#QuantityBreakdown
	 * QuantityAndAccount58.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#QuantityBreakdown
	 * QuantityAndAccount56.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#QuantityBreakdown
	 * QuantityAndAccount59.QuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#QuantityBreakdown
	 * QuantityAndAccount60.QuantityBreakdown}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LotBreakdown = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit4.UnitDetails, com.tools20022.repository.msg.QuantityAndAccount29.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount30.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount32.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount33.QuantityBreakdown, com.tools20022.repository.msg.FinancialInstrumentAttributes4.QuantityBreakdown,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.QuantityBreakdown, com.tools20022.repository.msg.FinancialInstrumentAttributes21.QuantityBreakdown,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.QuantityBreakdown, com.tools20022.repository.msg.FinancialInstrumentAttributes36.QuantityBreakdown,
					com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1.QuantityBreakdown, com.tools20022.repository.msg.FinancialInstrumentAttributes42.QuantityBreakdown,
					com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2.QuantityBreakdown, com.tools20022.repository.msg.FinancialInstrumentAttributes27.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation8.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation11.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation13.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation15.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation17.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation19.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation22.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation23.QuantityBreakdown,
					com.tools20022.repository.msg.AdditionalBalanceInformation5.QuantityBreakdown, com.tools20022.repository.msg.SubBalanceInformation5.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation9.QuantityBreakdown,
					com.tools20022.repository.msg.AdditionalBalanceInformation8.QuantityBreakdown, com.tools20022.repository.msg.SubBalanceInformation8.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation10.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation12.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation14.QuantityBreakdown,
					com.tools20022.repository.msg.AdditionalBalanceInformation9.QuantityBreakdown, com.tools20022.repository.msg.SubBalanceInformation9.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation16.QuantityBreakdown,
					com.tools20022.repository.msg.AdditionalBalanceInformation10.QuantityBreakdown, com.tools20022.repository.msg.SubBalanceInformation10.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation18.QuantityBreakdown,
					com.tools20022.repository.msg.AdditionalBalanceInformation11.QuantityBreakdown, com.tools20022.repository.msg.SubBalanceInformation11.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation21.QuantityBreakdown,
					com.tools20022.repository.msg.AdditionalBalanceInformation12.QuantityBreakdown, com.tools20022.repository.msg.SubBalanceInformation12.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation24.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount1.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount5.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount17.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount24.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount25.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount34.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount2.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount12.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount15.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount20.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount28.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount37.QuantityBreakdown,
					com.tools20022.repository.msg.Order16.QuantityBreakdown, com.tools20022.repository.msg.Order14.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount3.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount13.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount8.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount14.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount4.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount22.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount27.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount36.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount9.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount23.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount26.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount35.QuantityBreakdown, com.tools20022.repository.msg.RedemptionExecution10.LotDetails,
					com.tools20022.repository.msg.RedemptionOrder9.LotDetails, com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation20.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation6.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation7.QuantityBreakdown,
					com.tools20022.repository.msg.Order17.QuantityBreakdown, com.tools20022.repository.msg.Order18.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation26.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation25.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation28.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation27.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount39.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation30.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount41.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount42.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation31.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount43.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.QuantityBreakdown,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.QuantityBreakdown, com.tools20022.repository.msg.SubBalanceInformation15.QuantityBreakdown,
					com.tools20022.repository.msg.AdditionalBalanceInformation15.QuantityBreakdown, com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount45.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount44.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount47.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation32.QuantityBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation33.QuantityBreakdown,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount51.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount49.QuantityBreakdown, com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown4.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.QuantityBreakdown, com.tools20022.repository.msg.AdditionalBalanceInformation17.QuantityBreakdown,
					com.tools20022.repository.msg.SubBalanceInformation17.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount50.QuantityBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount55.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount54.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount57.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount58.QuantityBreakdown,
					com.tools20022.repository.msg.QuantityAndAccount56.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount59.QuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount60.QuantityBreakdown);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a minimum exercisable quantity is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableQuantity
	 * SecuritiesConversion.MinimumExercisableQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantitySecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a minimum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable quantity is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a minimum exercisable multiple
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableMultipleQuantity
	 * SecuritiesConversion.MinimumExercisableMultipleQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantitySecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a minimum exercisable multiple quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableMultipleQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable multiple quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities balance which contains the aggregate quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AggregateQuantity
	 * SecuritiesBalance.AggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance1#Balance
	 * CorporateActionEventAndBalance1.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance2#Balance
	 * CorporateActionEventAndBalance2.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance3#Balance
	 * CorporateActionEventAndBalance3.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#Balance
	 * CorporateActionEventAndBalance4.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance5#Balance
	 * CorporateActionEventAndBalance5.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance6#Balance
	 * CorporateActionEventAndBalance6.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#Balance
	 * CorporateActionEventAndBalance7.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance8#Balance
	 * CorporateActionEventAndBalance8.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#OpeningBalance
	 * FinancialInstrumentDetails2.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#ClosingBalance
	 * FinancialInstrumentDetails2.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#OpeningBalance
	 * FinancialInstrumentDetails3.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#ClosingBalance
	 * FinancialInstrumentDetails3.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#OpeningBalance
	 * FinancialInstrumentDetails5.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#ClosingBalance
	 * FinancialInstrumentDetails5.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#OpeningBalance
	 * FinancialInstrumentDetails8.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#ClosingBalance
	 * FinancialInstrumentDetails8.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#OpeningBalance
	 * FinancialInstrumentDetails9.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#ClosingBalance
	 * FinancialInstrumentDetails9.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#OpeningBalance
	 * FinancialInstrumentDetails11.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#ClosingBalance
	 * FinancialInstrumentDetails11.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#OpeningBalance
	 * FinancialInstrumentDetails13.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#ClosingBalance
	 * FinancialInstrumentDetails13.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#OpeningBalance
	 * FinancialInstrumentDetails16.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#ClosingBalance
	 * FinancialInstrumentDetails16.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#OpeningBalance
	 * FinancialInstrumentDetails17.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#ClosingBalance
	 * FinancialInstrumentDetails17.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#OpeningBalance
	 * FinancialInstrumentDetails18.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#ClosingBalance
	 * FinancialInstrumentDetails18.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#OpeningBalance
	 * FinancialInstrumentDetails20.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#ClosingBalance
	 * FinancialInstrumentDetails20.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#Balance
	 * CorporateActionEventAndBalance9.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance10#Balance
	 * CorporateActionEventAndBalance10.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#OpeningBalance
	 * FinancialInstrumentDetails23.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#ClosingBalance
	 * FinancialInstrumentDetails23.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#Balance
	 * CorporateActionEventAndBalance11.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#OpeningBalance
	 * FinancialInstrumentDetails25.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#ClosingBalance
	 * FinancialInstrumentDetails25.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#OpeningBalance
	 * FinancialInstrumentDetails27.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#ClosingBalance
	 * FinancialInstrumentDetails27.ClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance12#Balance
	 * CorporateActionEventAndBalance12.Balance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantityBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities balance which contains the aggregate quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AggregateQuantityBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventAndBalance1.Balance, com.tools20022.repository.msg.CorporateActionEventAndBalance2.Balance,
					com.tools20022.repository.msg.CorporateActionEventAndBalance3.Balance, com.tools20022.repository.msg.CorporateActionEventAndBalance4.Balance, com.tools20022.repository.msg.CorporateActionEventAndBalance5.Balance,
					com.tools20022.repository.msg.CorporateActionEventAndBalance6.Balance, com.tools20022.repository.msg.CorporateActionEventAndBalance7.Balance, com.tools20022.repository.msg.CorporateActionEventAndBalance8.Balance,
					com.tools20022.repository.msg.FinancialInstrumentDetails2.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails2.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails3.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails3.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails5.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails5.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails8.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails8.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails9.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails9.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails11.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails11.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails13.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails13.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails16.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails16.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails17.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails17.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails18.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails18.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails20.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails20.ClosingBalance,
					com.tools20022.repository.msg.CorporateActionEventAndBalance9.Balance, com.tools20022.repository.msg.CorporateActionEventAndBalance10.Balance, com.tools20022.repository.msg.FinancialInstrumentDetails23.OpeningBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails23.ClosingBalance, com.tools20022.repository.msg.CorporateActionEventAndBalance11.Balance,
					com.tools20022.repository.msg.FinancialInstrumentDetails25.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails25.ClosingBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails27.OpeningBalance, com.tools20022.repository.msg.FinancialInstrumentDetails27.ClosingBalance,
					com.tools20022.repository.msg.CorporateActionEventAndBalance12.Balance);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantityBalance";
			definition = "Securities balance which contains the aggregate quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which an amount of securities is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#SecuritiesQuantity
	 * SecuritiesProceedsDefinition.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an amount of securities is posted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an amount of securities is posted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which a conditional quantity has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#ConditionalQuantity
	 * SecuritiesProceedsDefinition.ConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantitySecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a conditional quantity has been defined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConditionalQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a conditional quantity has been defined.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which an over and above normal endured quantity
	 * has been provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#OverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAboveQuantitySecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an over and above normal endured quantity has been provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OverAndAboveQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which an over and above normal endured quantity has been provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry in a securities account of a specific quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#FinancialInstrumentQuantity
	 * SecuritiesEntry.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry in a securities account of a specific quantity of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry in a securities account of a specific quantity of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity expressed as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.QuantityCode
	 * QuantityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity5Choice#Code
	 * Quantity5Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity11Choice#Code
	 * Quantity11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#Code
	 * FinancialInstrumentQuantity2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#Code
	 * FinancialInstrumentQuantity14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#Code
	 * FinancialInstrumentQuantity16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#Code
	 * FinancialInstrumentQuantity17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#Code
	 * FinancialInstrumentQuantity19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#Code
	 * FinancialInstrumentQuantity20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#Code
	 * FinancialInstrumentQuantity21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#Code
	 * FinancialInstrumentQuantity22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice#Code
	 * UnitOrFaceAmountOrCodeChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice#Code
	 * UnitOrFaceAmountOrCode1Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity20Choice#Code
	 * Quantity20Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity40Choice#Code
	 * Quantity40Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a code."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Quantity5Choice.Code, com.tools20022.repository.choice.Quantity11Choice.Code, com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.Code,
					com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice.Code, com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice.Code,
					com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice.Code, com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice.Code,
					com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice.Code, com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice.Code,
					com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice.Code, com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice.Code, com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice.Code,
					com.tools20022.repository.choice.Quantity20Choice.Code, com.tools20022.repository.choice.Quantity40Choice.Code);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Quantity expressed as a code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QuantityCode.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a quantity of securities to receive has
	 * been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#QuantityToReceive
	 * SecuritiesProceedsDefinition.QuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedQuantitySecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a quantity of securities to receive has been specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExpectedQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpectedQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a quantity of securities to receive has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds related to securities with a specific status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#StatusQuantity
	 * SecuritiesProceedsDefinition.StatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusRelatedSecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds related to securities with a specific status."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StatusRelatedSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusRelatedSecuritiesProceeds";
			definition = "Securities proceeds related to securities with a specific status.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action distribution process for which a quantity of securities
	 * has been posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#PostingQuantity
	 * CorporateActionDistribution.PostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action distribution process for which a quantity of securities has been posted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Corporate action distribution process for which a quantity of securities has been posted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Event for which the resulting fractional quantity will be paid with cash
	 * in lieu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#FractionalQuantity
	 * CorporateActionEvent.FractionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedEventForFractionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event for which the resulting fractional quantity will be paid with cash in lieu. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedEventForFractionalQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedEventForFractionalQuantity";
			definition = "Event for which the resulting fractional quantity will be paid with cash in lieu. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a maximum exercisable quantity is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MaximumExercisableQuantity
	 * SecuritiesConversion.MaximumExercisableQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantitySecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a maximum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a maximum exercisable quantity is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds related to a board lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#BoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLotSecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities proceeds related to a board lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BoardLotSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesProceeds";
			definition = "Securities proceeds related to a board lot.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds related to a quantity of redenominated securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDenominationSecuritiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds related to a quantity of redenominated securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewDenominationSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesProceeds";
			definition = "Securities proceeds related to a quantity of redenominated securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * BiddingConditions for which a back end odd lot is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BackEndOddLotQuantity
	 * BiddingConditions.BackEndOddLotQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndOddLotBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BiddingConditions for which a back end odd lot is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BackEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotBiddingConditions";
			definition = "BiddingConditions for which a back end odd lot is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the entitlement parameters relative to the securities
	 * entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#EntitledSecuritiesQuantity
	 * CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entitlement parameters relative to the securities entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntitlement";
			definition = "Specifies the entitlement parameters relative to the securities entitlement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action for which a quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantity
	 * CorporateActionEvent.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which a quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action for which a quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions related to the base denomination quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BaseDenomination
	 * BiddingConditions.BaseDenomination}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions related to the base denomination quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions related to the base denomination quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.BaseDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Lottery for which an incremental denomination is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#IncrementalDenomination
	 * Lottery.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Lottery Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lottery for which an incremental denomination is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Lottery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for which an incremental denomination is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.IncrementalDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Sub balance which contains a quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SubBalanceQuantity
	 * SecuritiesBalance.SubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails1#SubBalance
	 * FinancialInstrumentDetails1.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails4#SubBalance
	 * FinancialInstrumentDetails4.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails6#SubBalance
	 * FinancialInstrumentDetails6.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails7#SubBalance
	 * FinancialInstrumentDetails7.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails10#SubBalance
	 * FinancialInstrumentDetails10.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails12#SubBalance
	 * FinancialInstrumentDetails12.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails14#SubBalance
	 * FinancialInstrumentDetails14.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails15#SubBalance
	 * FinancialInstrumentDetails15.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails21#SubBalance
	 * FinancialInstrumentDetails21.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails22#SubBalance
	 * FinancialInstrumentDetails22.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24#SubBalance
	 * FinancialInstrumentDetails24.SubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails26#SubBalance
	 * FinancialInstrumentDetails26.SubBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSubBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub balance which contains a quantity of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSubBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentDetails1.SubBalance, com.tools20022.repository.msg.FinancialInstrumentDetails4.SubBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails6.SubBalance, com.tools20022.repository.msg.FinancialInstrumentDetails7.SubBalance, com.tools20022.repository.msg.FinancialInstrumentDetails10.SubBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails12.SubBalance, com.tools20022.repository.msg.FinancialInstrumentDetails14.SubBalance, com.tools20022.repository.msg.FinancialInstrumentDetails15.SubBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails21.SubBalance, com.tools20022.repository.msg.FinancialInstrumentDetails22.SubBalance, com.tools20022.repository.msg.FinancialInstrumentDetails24.SubBalance,
					com.tools20022.repository.msg.FinancialInstrumentDetails26.SubBalance);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSubBalance";
			definition = "Sub balance which contains a quantity of securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities balance which contains the securities quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailableQuantity
	 * SecuritiesBalance.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableQuantityBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities balance which contains the securities quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AvailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantityBalance";
			definition = "Securities balance which contains the securities quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeQuantity
	 * SecuritiesTrade.TradeQuantity}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#Transaction
	 * FinancialInstrumentDetails2.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#Transaction
	 * FinancialInstrumentDetails3.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#Transaction
	 * FinancialInstrumentDetails5.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#Transaction
	 * FinancialInstrumentDetails8.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#Transaction
	 * FinancialInstrumentDetails9.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#Transaction
	 * FinancialInstrumentDetails11.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#Transaction
	 * FinancialInstrumentDetails13.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#Transaction
	 * FinancialInstrumentDetails16.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#Transaction
	 * FinancialInstrumentDetails17.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#Transaction
	 * FinancialInstrumentDetails18.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#Transaction
	 * FinancialInstrumentDetails20.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#Transaction
	 * FinancialInstrumentDetails23.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#Transaction
	 * FinancialInstrumentDetails25.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#Transaction
	 * FinancialInstrumentDetails27.Transaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentDetails2.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails3.Transaction,
					com.tools20022.repository.msg.FinancialInstrumentDetails5.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails8.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails9.Transaction,
					com.tools20022.repository.msg.FinancialInstrumentDetails11.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails13.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails16.Transaction,
					com.tools20022.repository.msg.FinancialInstrumentDetails17.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails18.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails20.Transaction,
					com.tools20022.repository.msg.FinancialInstrumentDetails23.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails25.Transaction, com.tools20022.repository.msg.FinancialInstrumentDetails27.Transaction);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which a quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioDenominator
	 * SecuritiesConversion.ConversionRatioDenominator}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatioDenominatorSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion ratio denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RatioDenominatorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatioDenominatorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioNumerator
	 * SecuritiesConversion.ConversionRatioNumerator}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatioNumeratorSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion ratio denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RatioNumeratorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatioNumeratorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a minimum traded quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#MinimumTradedNominalQuantity
	 * TradingMarket.MinimumTradedNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradedQuantityMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a minimum traded quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedQuantityMarket";
			definition = "Market for which a minimum traded quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which a minimum denomination is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#MinimumDenomination
	 * Debt.MinimumDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenominationDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a minimum denomination is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumDenominationDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDenominationDebt";
			definition = "Debt for which a minimum denomination is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.MinimumDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debt for which a minimum increment is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#MinimumIncrement
	 * Debt.MinimumIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrementDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a minimum increment is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumIncrementDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrementDebt";
			definition = "Debt for which a minimum increment is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.MinimumIncrement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order for which a specific quantity is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedQuantity
	 * SecuritiesOrder.OrderedQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a specific quantity is requested."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a specific quantity is requested.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation process for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#AllocatedQuantity
	 * Allocation.AllocatedQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Allocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a quantity is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocatedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity expressed as an amount, eg, in the investment fund business, a
	 * quantity of a financial instrument may be expressed as an amount of
	 * money.
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
	 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice#Amount
	 * QuantityOrAmount1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#SubTotalAmount
	 * CashInForecast2.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#SubTotalAmount
	 * CashOutForecast2.SubTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast1#NetAmount
	 * NetCashForecast1.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#SubTotalAmount
	 * CashInForecast4.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#SubTotalAmount
	 * CashOutForecast4.SubTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast2#NetAmount
	 * NetCashForecast2.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast3#NetAmount
	 * NetCashForecast3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#Amount
	 * FundCashInBreakdown1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#SubTotalAmount
	 * CashInForecast1.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#Amount
	 * FundCashOutBreakdown1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#SubTotalAmount
	 * CashOutForecast1.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#Amount
	 * FundCashInBreakdown2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#SubTotalAmount
	 * CashInForecast3.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#Amount
	 * FundCashOutBreakdown2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#SubTotalAmount
	 * CashOutForecast3.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCompensation1#SettlementAmount
	 * SecuritiesCompensation1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#GrandTotalAmount
	 * UnitsAndCash.GrandTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#CurrencyStatus
	 * EstimatedFundCashForecast5.CurrencyStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#SubTotalAmount
	 * CashOutForecast5.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#Amount
	 * FundCashOutBreakdown3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast4#NetAmount
	 * NetCashForecast4.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#SubTotalAmount
	 * CashInForecast5.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#Amount
	 * FundCashInBreakdown3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#SubTotalAmount
	 * CashOutForecast6.SubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#SubTotalAmount
	 * CashInForecast6.SubTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast5#NetAmount
	 * NetCashForecast5.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashInOutForecast7#Amount
	 * CashInOutForecast7.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.QuantityOrAmount1Choice.Amount, com.tools20022.repository.msg.CashInForecast2.SubTotalAmount, com.tools20022.repository.msg.CashOutForecast2.SubTotalAmount,
					com.tools20022.repository.msg.NetCashForecast1.NetAmount, com.tools20022.repository.msg.CashInForecast4.SubTotalAmount, com.tools20022.repository.msg.CashOutForecast4.SubTotalAmount,
					com.tools20022.repository.msg.NetCashForecast2.NetAmount, com.tools20022.repository.msg.NetCashForecast3.NetAmount, com.tools20022.repository.msg.FundCashInBreakdown1.Amount,
					com.tools20022.repository.msg.CashInForecast1.SubTotalAmount, com.tools20022.repository.msg.FundCashOutBreakdown1.Amount, com.tools20022.repository.msg.CashOutForecast1.SubTotalAmount,
					com.tools20022.repository.msg.FundCashInBreakdown2.Amount, com.tools20022.repository.msg.CashInForecast3.SubTotalAmount, com.tools20022.repository.msg.FundCashOutBreakdown2.Amount,
					com.tools20022.repository.msg.CashOutForecast3.SubTotalAmount, com.tools20022.repository.msg.SecuritiesCompensation1.SettlementAmount, com.tools20022.repository.msg.UnitsAndCash.GrandTotalAmount,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.CurrencyStatus, com.tools20022.repository.msg.CashOutForecast5.SubTotalAmount, com.tools20022.repository.msg.FundCashOutBreakdown3.Amount,
					com.tools20022.repository.msg.NetCashForecast4.NetAmount, com.tools20022.repository.msg.CashInForecast5.SubTotalAmount, com.tools20022.repository.msg.FundCashInBreakdown3.Amount,
					com.tools20022.repository.msg.CashOutForecast6.SubTotalAmount, com.tools20022.repository.msg.CashInForecast6.SubTotalAmount, com.tools20022.repository.msg.NetCashForecast5.NetAmount,
					com.tools20022.repository.msg.CashInOutForecast7.Amount);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Ratio for which a denominator is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityDenominator
	 * UnderlyingRatio.UnderlyingQuantityDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominatorRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio for which a denominator is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DenominatorRatio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominatorRatio";
			definition = "Ratio for which a denominator is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Ratio for which a numerator is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#UnderlyingQuantityNumerator
	 * UnderlyingRatio.UnderlyingQuantityNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumeratorRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio for which a numerator is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NumeratorRatio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumeratorRatio";
			definition = "Ratio for which a numerator is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which settlement takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ExecutedTradeQuantity
	 * SecuritiesTradeExecution.ExecutedTradeQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which settlement takes place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade for which settlement takes place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action for which the offeror/issuer has specified a quantity of
	 * securities to purchase or redeem under the terms of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SecuritiesQuantitySought
	 * CorporateActionEvent.SecuritiesQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Election process which selected a quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Quantity
	 * CorporateActionElection.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which selected a quantity of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a quantity of securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax voucher for which the calculation of holdings at record date took
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RecordDateHolding
	 * TaxVoucher.RecordDateHolding}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax voucher for which the calculation of holdings at record date took place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the calculation of holdings at record date took place.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.RecordDateHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Buy-in process for which a compensation amount of securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#SecuritiesCompensation
	 * BuyIn.SecuritiesCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy-in process for which a compensation amount of securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "Buy-in process for which a compensation amount of securities is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyIn.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.SecuritiesCompensation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities order which uses information on a day order quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#DayOrderQuantity
	 * SecuritiesOrder.DayOrderQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousDayOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities order which uses information on a day order quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PreviousDayOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousDayOrder";
			definition = "Securities order which uses information on a day order quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Liquidity information related to a quantity of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#Quantity
	 * Liquidity.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Liquidity Liquidity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liquidity information related to a quantity of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Liquidity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Liquidity information related to a quantity of a financial instrument.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity expressed as a percentage rate, eg, in the investment fund
	 * business, a quantity of a financial instrument may be expressed as
	 * percentage of the investor's total holding.
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
	 * {@linkplain com.tools20022.repository.choice.Quantity13Choice#PortfolioTransferOutRate
	 * Quantity13Choice.PortfolioTransferOutRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#PortfolioTransferOutRate
	 * Transfer28.PortfolioTransferOutRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#PortfolioTransferOutRate
	 * Transfer31.PortfolioTransferOutRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Quantity13Choice.PortfolioTransferOutRate, com.tools20022.repository.msg.Transfer28.PortfolioTransferOutRate,
					com.tools20022.repository.msg.Transfer31.PortfolioTransferOutRate);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Securities order for which a minimum quantity to execute is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MinimumQuantity
	 * SecuritiesOrderParameters.MinimumQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityOrderParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities order for which a minimum quantity to execute is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityOrderParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityOrderParameters";
			definition = "Securities order for which a minimum quantity to execute is specified.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote process for which a maximum quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#MaximumQuantity
	 * Quote.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantityRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quote process for which a maximum quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityRelatedQuote";
			definition = "Quote process for which a maximum quantity of securities is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MaximumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities balance which contains the unavailable quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UnavailableQuantity
	 * SecuritiesBalance.UnavailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableQuantityBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities balance which contains the unavailable quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnavailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantityBalance";
			definition = "Securities balance which contains the unavailable quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities order parameters for which a match increment quantity is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#MatchIncrement
	 * SecuritiesOrderParameters.MatchIncrement}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIncrementOrderParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities order parameters for which a match increment quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MatchIncrementOrderParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchIncrementOrderParameters";
			definition = "Securities order parameters for which a match increment quantity is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which a minimum subscription quantity of securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#Minimum
	 * Issuance.Minimum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuance for which a minimum subscription quantity of securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIssuance";
			definition = "Issuance for which a minimum subscription quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.Minimum;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Pair off process for which a quantity has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#PairedOffQuantity
	 * PairOff.PairedOffQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PairOff PairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pairoff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pair off process for which a quantity has been specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Pairoff = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Pair off process for which a quantity has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PairOff.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.PairedOffQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which the nominal amount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
	 * Issuance.IssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which the nominal amount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the nominal amount is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssueNominalAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying denominator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingDenominatorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a maximum holding
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumHolding
	 * SecuritiesAndCashDistribution.MaximumHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumHoldingDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a maximum holding quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum holding quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a maximum
	 * exercisable quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MaximumExercisableQuantity
	 * SecuritiesAndCashDistribution.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantityDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a maximum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum exercisable quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a minimum
	 * exercisable quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumExercisableQuantity
	 * SecuritiesAndCashDistribution.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantityDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a minimum exercisable quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum exercisable quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying denominator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingDenominatorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying numerator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#IntermediateToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingNumeratorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a minimum holding
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#MinimumHolding
	 * SecuritiesAndCashDistribution.MinimumHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a minimum holding quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum holding quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying numerator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#DistributedToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution
	 * SecuritiesAndCashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingNumeratorDistributionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a maximum holding quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MaximumHolding
	 * SecuritiesDistribution.MaximumHolding}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumHoldingRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a maximum holding quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a maximum holding quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which an intermediate to underlying numerator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingNumerator
	 * SecuritiesDistribution.IntermediateToUnderlyingNumerator}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which an intermediate to underlying numerator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying numerator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which an intermediate to underlying
	 * denominator quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#IntermediateToUnderlyingDenominator
	 * SecuritiesDistribution.IntermediateToUnderlyingDenominator}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which an intermediate to underlying denominator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying denominator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a distributed to underlying denominator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingDenominator
	 * SecuritiesDistribution.DistributedToUnderlyingDenominator}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a distributed to underlying denominator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying denominator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a distributed to underlying numerator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#DistributedToUnderlyingNumerator
	 * SecuritiesDistribution.DistributedToUnderlyingNumerator}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a distributed to underlying numerator quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying numerator quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities distribution for which a minimum holding quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#MinimumHolding
	 * SecuritiesDistribution.MinimumHolding}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a minimum holding quantity is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a minimum holding quantity is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a maximum traded quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#MaximumTradedNominalQuantity
	 * TradingMarket.MaximumTradedNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumTradedQuantityMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a maximum traded quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedQuantityMarket";
			definition = "Market for which a maximum traded quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote process for which a quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#Quantity
	 * Quote.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quote process for which a quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd QuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityRelatedQuote";
			definition = "Quote process for which a quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote process for which a minimum quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#MinimumQuantity
	 * Quote.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quote process for which a minimum quantity of securities is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityRelatedQuote";
			definition = "Quote process for which a minimum quantity of securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#SecuritiesQuantity
	 * NetAssetValueCalculation.SecuritiesQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net asset value calculation parameters."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value calculation parameters.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Side pocket for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#SidePocketQuantity
	 * SidePocket.SidePocketQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SidePocket
	 * SidePocket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#SidePocketQuantity
	 * ExpectedExecutionDetails3.SidePocketQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Side pocket for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SidePocket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedExecutionDetails3.SidePocketQuantity);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocket";
			definition = "Side pocket for which a quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.SidePocketQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Netting process for which a net quantity of securities has been
	 * calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#NetQuantity
	 * Netting.NetQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Netting process for which a net quantity of securities has been calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Netting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process for which a net quantity of securities has been calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.NetQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order status for which a remaining quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#RemainingQuantity
	 * SecuritiesOrderStatus.RemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order status for which a remaining quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrderStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderStatus";
			definition = "Order status for which a remaining quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order status for which a cumulative quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#CumulativeQuantity
	 * SecuritiesOrderStatus.CumulativeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order status for which a cumulative quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrderStatus";
			definition = "Order status for which a cumulative quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process for which a turned quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TurnedQuantity
	 * SecuritiesSettlement.TurnedQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTurnaroundSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which a turned quantity is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTurnaroundSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTurnaroundSettlement";
			definition = "Securities settlement process for which a turned quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash flow for which quantities are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#CashFlowQuantity
	 * FundsCashFlow.CashFlowQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash flow for which quantities are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCashFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashFlow";
			definition = "Cash flow for which quantities are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FundsCashFlow.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Position which contains the net quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#NetQuantity
	 * Position.NetQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position which contains the net quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Position = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Position which contains the net quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.NetQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a maximum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumQuantity
	 * BiddingConditions.MaximumQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantityBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityBiddingConditions";
			definition = "Bidding conditions for which a maximum quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a front end odd lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#FrontEndOddLotQuantity
	 * BiddingConditions.FrontEndOddLotQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndOddLotBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a front end odd lot is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FrontEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotBiddingConditions";
			definition = "Bidding conditions for which a front end odd lot is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a minimum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumQuantitySought
	 * BiddingConditions.MinimumQuantitySought}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a minimum quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityBiddingConditions";
			definition = "Bidding conditions for which a minimum quantity is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantity";
				definition = "Quantity of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesQuantity, com.tools20022.repository.entity.Security.MinimumQuantity,
						com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity, com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity, com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber, com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity, com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber,
						com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity, com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity, com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity,
						com.tools20022.repository.entity.Debt.MinimumDenomination, com.tools20022.repository.entity.Debt.MinimumIncrement, com.tools20022.repository.entity.Issuance.IssueNominalAmount,
						com.tools20022.repository.entity.Issuance.Minimum, com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity, com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator, com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator,
						com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity, com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity, com.tools20022.repository.entity.CorporateActionElection.Quantity,
						com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.MaximumQuantity, com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought, com.tools20022.repository.entity.BiddingConditions.BaseDenomination,
						com.tools20022.repository.entity.TaxVoucher.RecordDateHolding, com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity,
						com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity, com.tools20022.repository.entity.Lottery.IncrementalDenomination,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity, com.tools20022.repository.entity.Allocation.AllocatedQuantity,
						com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityDenominator, com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityNumerator,
						com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity,
						com.tools20022.repository.entity.BuyIn.SecuritiesCompensation, com.tools20022.repository.entity.SidePocket.SidePocketQuantity, com.tools20022.repository.entity.Liquidity.Quantity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement, com.tools20022.repository.entity.Quote.MaximumQuantity,
						com.tools20022.repository.entity.Quote.Quantity, com.tools20022.repository.entity.Quote.MinimumQuantity, com.tools20022.repository.entity.PairOff.PairedOffQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding, com.tools20022.repository.entity.Netting.NetQuantity,
						com.tools20022.repository.entity.Position.NetQuantity);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Quantity6Choice.Quantity, com.tools20022.repository.choice.Quantity6Choice.OriginalAndCurrentFace,
						com.tools20022.repository.choice.Quantity10Choice.Quantity, com.tools20022.repository.choice.Quantity10Choice.OriginalAndCurrentFace, com.tools20022.repository.choice.Quantity5Choice.OriginalAndCurrentFaceAmount,
						com.tools20022.repository.choice.Quantity5Choice.Quantity, com.tools20022.repository.choice.Quantity11Choice.OriginalAndCurrentFaceAmount, com.tools20022.repository.choice.Quantity11Choice.Quantity,
						com.tools20022.repository.choice.QuantityOrAmount1Choice.Quantity, com.tools20022.repository.msg.ProprietaryQuantity1.Quantity, com.tools20022.repository.choice.TransactionQuantities1Choice.Quantity,
						com.tools20022.repository.choice.TransactionQuantities1Choice.Proprietary, com.tools20022.repository.choice.TransactionQuantities2Choice.Quantity,
						com.tools20022.repository.choice.TransactionQuantities2Choice.OriginalAndCurrentFaceAmount, com.tools20022.repository.choice.TransactionQuantities2Choice.Proprietary,
						com.tools20022.repository.msg.SettlementObligation6.RemainingQuantityToBeSettled, com.tools20022.repository.choice.Quantity1Choice.Quantity, com.tools20022.repository.choice.Quantity1Choice.RelativeSize,
						com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2.SettledBalance, com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2.TradedBalance,
						com.tools20022.repository.msg.SettlementObligation7.RemainingQuantityToBeSettled, com.tools20022.repository.choice.Quantity20Choice.OriginalAndCurrentFaceAmount,
						com.tools20022.repository.choice.Quantity20Choice.Quantity, com.tools20022.repository.choice.Quantity40Choice.OriginalAndCurrentFaceAmount, com.tools20022.repository.choice.Quantity40Choice.Quantity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Unit, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer,
						com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.Order, com.tools20022.repository.entity.SecuritiesQuantity.Group1Or2Units,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt, com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.Entry, com.tools20022.repository.entity.SecuritiesQuantity.Code, com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesEntitlement,
						com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent, com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.Lottery,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance, com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.Trade,
						com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.Allocation,
						com.tools20022.repository.entity.SecuritiesQuantity.Amount, com.tools20022.repository.entity.SecuritiesQuantity.DenominatorRatio, com.tools20022.repository.entity.SecuritiesQuantity.NumeratorRatio,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionElection, com.tools20022.repository.entity.SecuritiesQuantity.TaxVoucher, com.tools20022.repository.entity.SecuritiesQuantity.RelatedBuyIn,
						com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder, com.tools20022.repository.entity.SecuritiesQuantity.Liquidity, com.tools20022.repository.entity.SecuritiesQuantity.Rate,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityOrderParameters, com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.MatchIncrementOrderParameters,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.Pairoff, com.tools20022.repository.entity.SecuritiesQuantity.Issuance,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.QuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityRelatedQuote, com.tools20022.repository.entity.SecuritiesQuantity.NetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesQuantity.SidePocket, com.tools20022.repository.entity.SecuritiesQuantity.Netting, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.RelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.Position,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions);
				derivationComponent_lazy = () -> Arrays.asList(Quantity12Choice.mmObject(), Unit2.mmObject(), FinancialInstrumentQuantity1.mmObject(), Unit5.mmObject(), Unit4.mmObject(), Quantity14Choice.mmObject(), Unit1.mmObject(),
						Unit3.mmObject(), FinancialInstrumentQuantity1Choice.mmObject(), OriginalAndCurrentQuantities1.mmObject(), Quantity6Choice.mmObject(), FinancialInstrumentQuantity15Choice.mmObject(),
						OriginalAndCurrentQuantities4.mmObject(), Quantity10Choice.mmObject(), Quantity13Choice.mmObject(), OriginalAndCurrentQuantities2.mmObject(), Quantity4Choice.mmObject(), Quantity3Choice.mmObject(),
						Quantity2Choice.mmObject(), Quantity5Choice.mmObject(), OriginalAndCurrentQuantities3.mmObject(), Quantity9Choice.mmObject(), Quantity8Choice.mmObject(), Quantity7Choice.mmObject(), Quantity11Choice.mmObject(),
						PendingBalance1.mmObject(), PendingBalance2.mmObject(), FinancialInstrumentQuantity2Choice.mmObject(), FinancialInstrumentQuantity14Choice.mmObject(), FinancialInstrumentQuantity16Choice.mmObject(),
						FinancialInstrumentQuantity17Choice.mmObject(), FinancialInstrumentQuantity19Choice.mmObject(), FinancialInstrumentQuantity20Choice.mmObject(), FinancialInstrumentQuantity21Choice.mmObject(),
						FinancialInstrumentQuantity22Choice.mmObject(), FinancialInstrumentQuantityChoice.mmObject(), UnitOrFaceAmountChoice.mmObject(), QuantityOrAmount1Choice.mmObject(), FinancialInstrumentQuantity18Choice.mmObject(),
						ProprietaryQuantity1.mmObject(), TransactionQuantities1Choice.mmObject(), TransactionQuantities2Choice.mmObject(), UnitOrFaceAmount1Choice.mmObject(), UnitOrFaceAmountOrCodeChoice.mmObject(),
						UnitOrFaceAmountOrCode1Choice.mmObject(), Quantity5.mmObject(), Quantity6.mmObject(), Quantity7.mmObject(), Quantity8.mmObject(), SecuritiesCompensation1.mmObject(), SidePocketQuantityAndAmount1.mmObject(),
						SidePocketUnitsOrAmountOrRate1Choice.mmObject(), FinancialInstrumentQuantity2.mmObject(), FinancialInstrumentQuantity3.mmObject(), FinancialInstrumentQuantity4.mmObject(),
						FinancialInstrumentQuantitySearch1Choice.mmObject(), FinancialInstrumentQuantitySearch1.mmObject(), QuantitySearch1Choice.mmObject(), Quantity1Choice.mmObject(), Quantity15Choice.mmObject(),
						Quantity16Choice.mmObject(), OriginalAndCurrentQuantities5.mmObject(), Quantity11.mmObject(), Quantity17Choice.mmObject(), Quantity18Choice.mmObject(), OriginalAndCurrentQuantities6.mmObject(),
						Quantity20Choice.mmObject(), PendingBalance3.mmObject(), Quantity19Choice.mmObject(), Unit6.mmObject(), PendingBalance4.mmObject(), Quantity22Choice.mmObject(), Quantity23Choice.mmObject(),
						Quantity21Choice.mmObject(), OriginalAndCurrentQuantities7.mmObject(), Quantity12.mmObject(), Quantity40Choice.mmObject(), FinancialInstrumentQuantity25Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}