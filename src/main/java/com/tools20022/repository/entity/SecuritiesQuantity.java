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
import com.tools20022.repository.codeset.QuantityCode;
import com.tools20022.repository.codeset.UKTaxGroupUnitCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Quantity of a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesQuantity" src="doc-files/SecuritiesQuantity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
 * Security.mmSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
 * Security.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSecuritiesQuantity
 * NetAssetValueCalculation.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMaximumTradedNominalQuantity
 * TradingMarket.mmMaximumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
 * InvestmentFundOrder.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
 * SecuritiesTrade.mmTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
 * SecuritiesTransfer.mmTransferredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
 * SecuritiesSettlement.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
 * SecuritiesSettlement.mmTurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
 * LotBreakdown.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmFinancialInstrumentQuantity
 * SecuritiesEntry.mmFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmExecutedTradeQuantity
 * SecuritiesTradeExecution.mmExecutedTradeQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumDenomination
 * Debt.mmMinimumDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
 * Debt.mmMinimumIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
 * Issuance.mmIssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmMinimum
 * Issuance.mmMinimum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioDenominator
 * SecuritiesConversion.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioNumerator
 * SecuritiesConversion.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
 * SecuritiesBalance.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
 * SecuritiesBalance.mmSubBalanceQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
 * SecuritiesBalance.mmAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUnavailableQuantity
 * SecuritiesBalance.mmUnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFractionalQuantity
 * CorporateActionEvent.mmFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
 * CorporateActionEvent.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantitySought
 * CorporateActionEvent.mmSecuritiesQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmConditionalQuantity
 * SecuritiesProceedsDefinition.mmConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmOverAndAboveNormalEnsuredEntitlementQuantity
 * SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmQuantityToReceive
 * SecuritiesProceedsDefinition.mmQuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmStatusQuantity
 * SecuritiesProceedsDefinition.mmStatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
 * CorporateActionElection.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
 * BiddingConditions.mmBackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
 * BiddingConditions.mmMaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
 * BiddingConditions.mmMinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
 * BiddingConditions.mmBaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
 * TaxVoucher.mmRecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingQuantity
 * CorporateActionDistribution.mmPostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
 * Lottery.mmIncrementalDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
 * SecuritiesOrder.mmOrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmDayOrderQuantity
 * SecuritiesOrder.mmDayOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedQuantity
 * Allocation.mmAllocatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityDenominator
 * UnderlyingRatio.mmUnderlyingQuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityNumerator
 * UnderlyingRatio.mmUnderlyingQuantityNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmCashFlowQuantity
 * FundsCashFlow.mmCashFlowQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
 * BuyIn.mmSecuritiesCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#mmSidePocketQuantity
 * SidePocket.mmSidePocketQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmQuantity
 * Liquidity.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMinimumQuantity
 * SecuritiesOrderParameters.mmMinimumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMatchIncrement
 * SecuritiesOrderParameters.mmMatchIncrement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMaximumQuantity
 * Quote.mmMaximumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuantity
 * Quote.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMinimumQuantity
 * Quote.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PairOff#mmPairedOffQuantity
 * PairOff.mmPairedOffQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingDenominator
 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumHolding
 * SecuritiesAndCashDistribution.mmMaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumExercisableQuantity
 * SecuritiesAndCashDistribution.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumExercisableQuantity
 * SecuritiesAndCashDistribution.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingDenominator
 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingNumerator
 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumHolding
 * SecuritiesAndCashDistribution.mmMinimumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingNumerator
 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMaximumHolding
 * SecuritiesDistribution.mmMaximumHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingNumerator
 * SecuritiesDistribution.mmIntermediateToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingDenominator
 * SecuritiesDistribution.mmIntermediateToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingDenominator
 * SecuritiesDistribution.mmDistributedToUnderlyingDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingNumerator
 * SecuritiesDistribution.mmDistributedToUnderlyingNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMinimumHolding
 * SecuritiesDistribution.mmMinimumHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmNetQuantity
 * Netting.mmNetQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmNetQuantity
 * Position.mmNetQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity6Choice#mmQuantity
 * Quantity6Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity6Choice#mmOriginalAndCurrentFace
 * Quantity6Choice.mmOriginalAndCurrentFace}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity10Choice#mmQuantity
 * Quantity10Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity10Choice#mmOriginalAndCurrentFace
 * Quantity10Choice.mmOriginalAndCurrentFace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity5Choice#mmOriginalAndCurrentFaceAmount
 * Quantity5Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity5Choice#mmQuantity
 * Quantity5Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity11Choice#mmOriginalAndCurrentFaceAmount
 * Quantity11Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity11Choice#mmQuantity
 * Quantity11Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice#mmQuantity
 * QuantityOrAmount1Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity1#mmQuantity
 * ProprietaryQuantity1.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities1Choice#mmQuantity
 * TransactionQuantities1Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities1Choice#mmProprietary
 * TransactionQuantities1Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmQuantity
 * TransactionQuantities2Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmOriginalAndCurrentFaceAmount
 * TransactionQuantities2Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice#mmProprietary
 * TransactionQuantities2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmRemainingQuantityToBeSettled
 * SettlementObligation6.mmRemainingQuantityToBeSettled}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity1Choice#mmQuantity
 * Quantity1Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity1Choice#mmRelativeSize
 * Quantity1Choice.mmRelativeSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#mmSettledBalance
 * FinancialInstrumentAggregateBalance2.mmSettledBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#mmTradedBalance
 * FinancialInstrumentAggregateBalance2.mmTradedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmRemainingQuantityToBeSettled
 * SettlementObligation7.mmRemainingQuantityToBeSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity20Choice#mmOriginalAndCurrentFaceAmount
 * Quantity20Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity20Choice#mmQuantity
 * Quantity20Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Quantity40Choice#mmOriginalAndCurrentFaceAmount
 * Quantity40Choice.mmOriginalAndCurrentFaceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Quantity40Choice#mmQuantity
 * Quantity40Choice.mmQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
 * SecuritiesQuantity.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTransfer
 * SecuritiesQuantity.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecurityIdentification
 * SecuritiesQuantity.mmSecurityIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
 * SecuritiesQuantity.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
 * SecuritiesQuantity.mmGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityDebt
 * SecuritiesQuantity.mmMinimumQuantityDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
 * SecuritiesQuantity.mmLotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesProceedsDefinition
 * SecuritiesQuantity.mmSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmConditionalQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOverAndAboveQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmEntry
 * SecuritiesQuantity.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCode
 * SecuritiesQuantity.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmExpectedQuantitySecuritiesProceeds
 * SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmStatusRelatedSecuritiesProceeds
 * SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionDistribution
 * SecuritiesQuantity.mmCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedEventForFractionalQuantity
 * SecuritiesQuantity.mmRelatedEventForFractionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBoardLotSecuritiesProceeds
 * SecuritiesQuantity.mmBoardLotSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNewDenominationSecuritiesProceeds
 * SecuritiesQuantity.mmNewDenominationSecuritiesProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBackEndOddLotBiddingConditions
 * SecuritiesQuantity.mmBackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesEntitlement
 * SecuritiesQuantity.mmSecuritiesEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionEvent
 * SecuritiesQuantity.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBiddingConditions
 * SecuritiesQuantity.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
 * SecuritiesQuantity.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedSubBalance
 * SecuritiesQuantity.mmRelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAvailableQuantityBalance
 * SecuritiesQuantity.mmAvailableQuantityBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
 * SecuritiesQuantity.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumTradedQuantityMarket
 * SecuritiesQuantity.mmMinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumDenominationDebt
 * SecuritiesQuantity.mmMinimumDenominationDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumIncrementDebt
 * SecuritiesQuantity.mmMinimumIncrementDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrder
 * SecuritiesQuantity.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAllocation
 * SecuritiesQuantity.mmAllocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
 * SecuritiesQuantity.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDenominatorRatio
 * SecuritiesQuantity.mmDenominatorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNumeratorRatio
 * SecuritiesQuantity.mmNumeratorRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTradeExecution
 * SecuritiesQuantity.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCorporateActionEvent
 * SecuritiesQuantity.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionElection
 * SecuritiesQuantity.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
 * SecuritiesQuantity.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedBuyIn
 * SecuritiesQuantity.mmRelatedBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPreviousDayOrder
 * SecuritiesQuantity.mmPreviousDayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLiquidity
 * SecuritiesQuantity.mmLiquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRate
 * SecuritiesQuantity.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityOrderParameters
 * SecuritiesQuantity.mmMinimumQuantityOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityRelatedQuote
 * SecuritiesQuantity.mmMaximumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnavailableQuantityBalance
 * SecuritiesQuantity.mmUnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMatchIncrementOrderParameters
 * SecuritiesQuantity.mmMatchIncrementOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedIssuance
 * SecuritiesQuantity.mmRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPairoff
 * SecuritiesQuantity.mmPairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIssuance
 * SecuritiesQuantity.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingDenominatorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingDistributionInformation
 * SecuritiesQuantity.mmMaximumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantityDistributionInformation
 * SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorDistributionInformation
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingDenominatorDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorDistributionInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingDistributionInformation
 * SecuritiesQuantity.mmMinimumHoldingDistributionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorDistributionInformation
 * SecuritiesQuantity.mmDistributedToUnderlyingNumeratorDistributionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution
 * SecuritiesQuantity.
 * mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumHoldingRelatedSecuritiesDistribution
 * SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumTradedQuantityMarket
 * SecuritiesQuantity.mmMaximumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmQuantityRelatedQuote
 * SecuritiesQuantity.mmQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityRelatedQuote
 * SecuritiesQuantity.mmMinimumQuantityRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetAssetValueCalculation
 * SecuritiesQuantity.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSidePocket
 * SecuritiesQuantity.mmSidePocket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetting
 * SecuritiesQuantity.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderStatus
 * SecuritiesQuantity.mmRelatedOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesOrderStatus
 * SecuritiesQuantity.mmSecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
 * SecuritiesQuantity.mmRelatedCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmPosition
 * SecuritiesQuantity.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityBiddingConditions
 * SecuritiesQuantity.mmMaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmFrontEndOddLotBiddingConditions
 * SecuritiesQuantity.mmFrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityBiddingConditions
 * SecuritiesQuantity.mmMinimumQuantityBiddingConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected DecimalNumber unit;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#mmPartialHoldingUnits
	 * BlockedHoldingDetails1.mmPartialHoldingUnits}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity12Choice#mmUnit
	 * Quantity12Choice.mmUnit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit2#mmGroup1Number
	 * Unit2.mmGroup1Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit2#mmGroup2Number
	 * Unit2.mmGroup2Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1#mmUnit
	 * FinancialInstrumentQuantity1.mmUnit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit5#mmUnitsNumber
	 * Unit5.mmUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity14Choice#mmUnit
	 * Quantity14Choice.mmUnit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#mmUnitsNumber
	 * Unit1.mmUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmUnitsNumber
	 * Unit3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice#mmUnit
	 * FinancialInstrumentQuantity1Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice#mmUnit
	 * FinancialInstrumentQuantity15Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmUnit
	 * FinancialInstrumentQuantity2Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#mmUnit
	 * FinancialInstrumentQuantity14Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#mmUnit
	 * FinancialInstrumentQuantity16Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#mmUnit
	 * FinancialInstrumentQuantity17Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#mmUnit
	 * FinancialInstrumentQuantity19Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#mmUnit
	 * FinancialInstrumentQuantity20Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#mmUnit
	 * FinancialInstrumentQuantity21Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#mmUnit
	 * FinancialInstrumentQuantity22Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmUnit
	 * FinancialInstrumentQuantityChoice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice#mmUnit
	 * UnitOrFaceAmountChoice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity18Choice#mmUnit
	 * FinancialInstrumentQuantity18Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#mmSubTotalUnitsNumber
	 * CashInForecast2.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmSubTotalUnitsNumber
	 * CashOutForecast2.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast1#mmNetUnitsNumber
	 * NetCashForecast1.mmNetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#mmSubTotalUnitsNumber
	 * CashInForecast4.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmSubTotalUnitsNumber
	 * CashOutForecast4.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmNetUnitsNumber
	 * NetCashForecast2.mmNetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#mmNetUnitsNumber
	 * NetCashForecast3.mmNetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmUnitsNumber
	 * FundCashInBreakdown1.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#mmSubTotalUnitsNumber
	 * CashInForecast1.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#mmUnitsNumber
	 * FundCashOutBreakdown1.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#mmSubTotalUnitsNumber
	 * CashOutForecast1.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmUnitsNumber
	 * FundCashInBreakdown2.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#mmSubTotalUnitsNumber
	 * CashInForecast3.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmUnitsNumber
	 * FundCashOutBreakdown2.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmSubTotalUnitsNumber
	 * CashOutForecast3.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice#mmUnit
	 * UnitOrFaceAmount1Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction#mmQuantityOfSecurity
	 * VotingPartyAndInstruction.mmQuantityOfSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestInformation#mmQuantityOfSecurity
	 * RequestInformation.mmQuantityOfSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice#mmUnit
	 * UnitOrFaceAmountOrCodeChoice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice#mmUnit
	 * UnitOrFaceAmountOrCode1Choice.mmUnit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity2#mmValue
	 * Quantity2.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1#mmUnitsNumber
	 * SidePocketQuantityAndAmount1.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#mmUnitsNumber
	 * FinancialInstrumentQuantity2.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmUnitsNumber
	 * FinancialInstrumentQuantity3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity4#mmUnit
	 * FinancialInstrumentQuantity4.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#mmUnit
	 * FinancialInstrumentQuantitySearch1Choice.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmSubTotalUnitsNumber
	 * CashOutForecast5.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmUnitsNumber
	 * FundCashOutBreakdown3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmNetUnitsNumber
	 * NetCashForecast4.mmNetUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#mmSubTotalUnitsNumber
	 * CashInForecast5.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmUnitsNumber
	 * FundCashInBreakdown3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmSubTotalUnitsNumber
	 * CashOutForecast6.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#mmSubTotalUnitsNumber
	 * CashInForecast6.mmSubTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmNetUnitsNumber
	 * NetCashForecast5.mmNetUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmUnitsNumber
	 * Unit6.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmPartialHoldingUnits
	 * BlockedHoldingDetails2.mmPartialHoldingUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#mmUnit
	 * FinancialInstrumentQuantity25Choice.mmUnit}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmUnit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BlockedHoldingDetails1.mmPartialHoldingUnits, Quantity12Choice.mmUnit, Unit2.mmGroup1Number, Unit2.mmGroup2Number, FinancialInstrumentQuantity1.mmUnit, Unit5.mmUnitsNumber,
					Quantity14Choice.mmUnit, Unit1.mmUnitsNumber, Unit3.mmUnitsNumber, FinancialInstrumentQuantity1Choice.mmUnit, FinancialInstrumentQuantity15Choice.mmUnit, FinancialInstrumentQuantity2Choice.mmUnit,
					FinancialInstrumentQuantity14Choice.mmUnit, FinancialInstrumentQuantity16Choice.mmUnit, FinancialInstrumentQuantity17Choice.mmUnit, FinancialInstrumentQuantity19Choice.mmUnit, FinancialInstrumentQuantity20Choice.mmUnit,
					FinancialInstrumentQuantity21Choice.mmUnit, FinancialInstrumentQuantity22Choice.mmUnit, FinancialInstrumentQuantityChoice.mmUnit, UnitOrFaceAmountChoice.mmUnit, FinancialInstrumentQuantity18Choice.mmUnit,
					CashInForecast2.mmSubTotalUnitsNumber, CashOutForecast2.mmSubTotalUnitsNumber, NetCashForecast1.mmNetUnitsNumber, CashInForecast4.mmSubTotalUnitsNumber, CashOutForecast4.mmSubTotalUnitsNumber,
					NetCashForecast2.mmNetUnitsNumber, NetCashForecast3.mmNetUnitsNumber, FundCashInBreakdown1.mmUnitsNumber, CashInForecast1.mmSubTotalUnitsNumber, FundCashOutBreakdown1.mmUnitsNumber,
					CashOutForecast1.mmSubTotalUnitsNumber, FundCashInBreakdown2.mmUnitsNumber, CashInForecast3.mmSubTotalUnitsNumber, FundCashOutBreakdown2.mmUnitsNumber, CashOutForecast3.mmSubTotalUnitsNumber,
					UnitOrFaceAmount1Choice.mmUnit, VotingPartyAndInstruction.mmQuantityOfSecurity, RequestInformation.mmQuantityOfSecurity, UnitOrFaceAmountOrCodeChoice.mmUnit, UnitOrFaceAmountOrCode1Choice.mmUnit, Quantity2.mmValue,
					SidePocketQuantityAndAmount1.mmUnitsNumber, FinancialInstrumentQuantity2.mmUnitsNumber, FinancialInstrumentQuantity3.mmUnitsNumber, FinancialInstrumentQuantity4.mmUnit, FinancialInstrumentQuantitySearch1Choice.mmUnit,
					CashOutForecast5.mmSubTotalUnitsNumber, FundCashOutBreakdown3.mmUnitsNumber, NetCashForecast4.mmNetUnitsNumber, CashInForecast5.mmSubTotalUnitsNumber, FundCashInBreakdown3.mmUnitsNumber,
					CashOutForecast6.mmSubTotalUnitsNumber, CashInForecast6.mmSubTotalUnitsNumber, NetCashForecast5.mmNetUnitsNumber, Unit6.mmUnitsNumber, BlockedHoldingDetails2.mmPartialHoldingUnits,
					FinancialInstrumentQuantity25Choice.mmUnit);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * Transfer of a specific quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmTransferredQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected Security securityIdentification;
	/**
	 * Identifies the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecurityIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected InvestmentFundOrder order;
	/**
	 * Order for which a number of units is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
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
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmUnitsNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected UKTaxGroupUnitCode group1Or2Units;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit5#mmGroup1Or2Units
	 * Unit5.mmGroup1Or2Units}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#mmGroup1Or2Units
	 * Unit1.mmGroup1Or2Units}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmGroup1Or2Units
	 * Unit3.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmGroup1Or2Units
	 * RedemptionOrder3.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmGroup1Or2Units
	 * RedemptionOrder5.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmGroup1Or2Units
	 * RedemptionExecution3.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmGroup1Or2Units
	 * RedemptionExecution5.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmGroup1Or2Units
	 * RedemptionOrder7.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmGroup1Or2Units
	 * RedemptionOrder4.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmGroup1Or2Units
	 * RedemptionOrder6.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmGroup1Or2Units
	 * RedemptionExecution4.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmGroup1Or2Units
	 * RedemptionExecution6.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmGroup1Or2Units
	 * RedemptionOrder8.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmGroup1Or2Units
	 * SwitchRedemptionLegOrder2.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmGroup1Or2Units
	 * SwitchRedemptionLegOrder3.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmGroup1Or2Units
	 * SwitchRedemptionLegExecution2.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmGroup1Or2Units
	 * SwitchRedemptionLegExecution3.mmGroup1Or2Units}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmGroup1Or2Units
	 * Unit6.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmGroup1Or2Units
	 * RedemptionOrder14.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmGroup1Or2Units
	 * SwitchRedemptionLegOrder6.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmGroup1Or2Units
	 * RedemptionOrder15.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGroup1Or2Units
	 * RedemptionExecution16.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmGroup1Or2Units
	 * RedemptionExecution15.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmGroup1Or2Units
	 * SwitchRedemptionLegExecution4.mmGroup1Or2Units}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmGroup1Or2Units = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Unit5.mmGroup1Or2Units, Unit1.mmGroup1Or2Units, Unit3.mmGroup1Or2Units, RedemptionOrder3.mmGroup1Or2Units, RedemptionOrder5.mmGroup1Or2Units, RedemptionExecution3.mmGroup1Or2Units,
					RedemptionExecution5.mmGroup1Or2Units, RedemptionOrder7.mmGroup1Or2Units, RedemptionOrder4.mmGroup1Or2Units, RedemptionOrder6.mmGroup1Or2Units, RedemptionExecution4.mmGroup1Or2Units,
					RedemptionExecution6.mmGroup1Or2Units, RedemptionOrder8.mmGroup1Or2Units, SwitchRedemptionLegOrder2.mmGroup1Or2Units, SwitchRedemptionLegOrder3.mmGroup1Or2Units, SwitchRedemptionLegExecution2.mmGroup1Or2Units,
					SwitchRedemptionLegExecution3.mmGroup1Or2Units, Unit6.mmGroup1Or2Units, RedemptionOrder14.mmGroup1Or2Units, SwitchRedemptionLegOrder6.mmGroup1Or2Units, RedemptionOrder15.mmGroup1Or2Units,
					RedemptionExecution16.mmGroup1Or2Units, RedemptionExecution15.mmGroup1Or2Units, SwitchRedemptionLegExecution4.mmGroup1Or2Units);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased units belong.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UKTaxGroupUnitCode.mmObject();
		}
	};
	protected InvestmentFundOrderExecution relatedOrderExecution;
	/**
	 * Order execution process for which a number of units is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOrderExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order execution process for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmUnitsNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * Settlement of a specific amount of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific amount of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected Security minimumQuantityDebt;
	/**
	 * Security for which a minimum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
	 * Security.mmMinimumQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityDebt";
			definition = "Security for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.LotBreakdown> lotBreakdown;
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
	 * LotBreakdown.mmSecuritiesQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit4#mmUnitDetails
	 * Unit4.mmUnitDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#mmQuantityBreakdown
	 * QuantityAndAccount29.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#mmQuantityBreakdown
	 * QuantityAndAccount30.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#mmQuantityBreakdown
	 * QuantityAndAccount32.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#mmQuantityBreakdown
	 * QuantityAndAccount33.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmQuantityBreakdown
	 * FinancialInstrumentAttributes4.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmQuantityBreakdown
	 * FinancialInstrumentAttributes13.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmQuantityBreakdown
	 * FinancialInstrumentAttributes21.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmQuantityBreakdown
	 * FinancialInstrumentAttributes26.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmQuantityBreakdown
	 * FinancialInstrumentAttributes36.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1#mmQuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown1.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmQuantityBreakdown
	 * FinancialInstrumentAttributes42.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2#mmQuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown2.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmQuantityBreakdown
	 * FinancialInstrumentAttributes27.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace7.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmQuantityBreakdown
	 * AggregateBalanceInformation8.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace10.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmQuantityBreakdown
	 * AggregateBalanceInformation11.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace12.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmQuantityBreakdown
	 * AggregateBalanceInformation13.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace14.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmQuantityBreakdown
	 * AggregateBalanceInformation15.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace16.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmQuantityBreakdown
	 * AggregateBalanceInformation17.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace18.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmQuantityBreakdown
	 * AggregateBalanceInformation19.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace21.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmQuantityBreakdown
	 * AggregateBalanceInformation22.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace22.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmQuantityBreakdown
	 * AggregateBalanceInformation23.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5#mmQuantityBreakdown
	 * AdditionalBalanceInformation5.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#mmQuantityBreakdown
	 * SubBalanceInformation5.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace8.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmQuantityBreakdown
	 * AggregateBalanceInformation9.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8#mmQuantityBreakdown
	 * AdditionalBalanceInformation8.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#mmQuantityBreakdown
	 * SubBalanceInformation8.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace9.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmQuantityBreakdown
	 * AggregateBalanceInformation10.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace11.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmQuantityBreakdown
	 * AggregateBalanceInformation12.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace13.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmQuantityBreakdown
	 * AggregateBalanceInformation14.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#mmQuantityBreakdown
	 * AdditionalBalanceInformation9.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#mmQuantityBreakdown
	 * SubBalanceInformation9.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace15.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmQuantityBreakdown
	 * AggregateBalanceInformation16.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10#mmQuantityBreakdown
	 * AdditionalBalanceInformation10.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#mmQuantityBreakdown
	 * SubBalanceInformation10.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace17.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmQuantityBreakdown
	 * AggregateBalanceInformation18.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11#mmQuantityBreakdown
	 * AdditionalBalanceInformation11.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#mmQuantityBreakdown
	 * SubBalanceInformation11.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace20.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmQuantityBreakdown
	 * AggregateBalanceInformation21.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12#mmQuantityBreakdown
	 * AdditionalBalanceInformation12.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#mmQuantityBreakdown
	 * SubBalanceInformation12.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace23.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmQuantityBreakdown
	 * AggregateBalanceInformation24.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#mmQuantityBreakdown
	 * QuantityAndAccount1.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#mmQuantityBreakdown
	 * QuantityAndAccount5.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#mmQuantityBreakdown
	 * QuantityAndAccount17.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#mmQuantityBreakdown
	 * QuantityAndAccount24.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#mmQuantityBreakdown
	 * QuantityAndAccount25.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#mmQuantityBreakdown
	 * QuantityAndAccount34.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmQuantityBreakdown
	 * QuantityAndAccount2.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmQuantityBreakdown
	 * QuantityAndAccount12.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmQuantityBreakdown
	 * QuantityAndAccount15.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmQuantityBreakdown
	 * QuantityAndAccount20.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmQuantityBreakdown
	 * QuantityAndAccount28.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmQuantityBreakdown
	 * QuantityAndAccount37.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmQuantityBreakdown
	 * Order16.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmQuantityBreakdown
	 * Order14.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmQuantityBreakdown
	 * QuantityAndAccount3.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#mmQuantityBreakdown
	 * QuantityAndAccount13.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#mmQuantityBreakdown
	 * QuantityAndAccount8.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#mmQuantityBreakdown
	 * QuantityAndAccount14.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmQuantityBreakdown
	 * QuantityAndAccount4.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#mmQuantityBreakdown
	 * QuantityAndAccount22.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#mmQuantityBreakdown
	 * QuantityAndAccount27.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#mmQuantityBreakdown
	 * QuantityAndAccount36.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#mmQuantityBreakdown
	 * QuantityAndAccount9.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#mmQuantityBreakdown
	 * QuantityAndAccount23.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#mmQuantityBreakdown
	 * QuantityAndAccount26.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#mmQuantityBreakdown
	 * QuantityAndAccount35.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmLotDetails
	 * RedemptionExecution10.mmLotDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmLotDetails
	 * RedemptionOrder9.mmLotDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1#mmQuantityBreakdown
	 * CashSubBalanceTypeAndQuantityBreakdown1.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace19.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmQuantityBreakdown
	 * AggregateBalanceInformation20.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace6.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmQuantityBreakdown
	 * AggregateBalanceInformation6.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace5.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmQuantityBreakdown
	 * AggregateBalanceInformation7.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmQuantityBreakdown
	 * Order17.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmQuantityBreakdown
	 * Order18.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmQuantityBreakdown
	 * AggregateBalanceInformation26.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmQuantityBreakdown
	 * AggregateBalanceInformation25.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace24.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace25.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmQuantityBreakdown
	 * AggregateBalanceInformation28.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmQuantityBreakdown
	 * AggregateBalanceInformation27.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace26.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace27.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmQuantityBreakdown
	 * QuantityAndAccount39.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmQuantityBreakdown
	 * AggregateBalanceInformation30.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmQuantityBreakdown
	 * QuantityAndAccount41.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmQuantityBreakdown
	 * QuantityAndAccount42.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmQuantityBreakdown
	 * AggregateBalanceInformation31.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace28.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmQuantityBreakdown
	 * QuantityAndAccount43.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace29.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmQuantityBreakdown
	 * FinancialInstrumentAttributes63.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#mmQuantityBreakdown
	 * SubBalanceInformation15.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmQuantityBreakdown
	 * AdditionalBalanceInformation15.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3#mmQuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#mmQuantityBreakdown
	 * QuantityAndAccount45.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#mmQuantityBreakdown
	 * QuantityAndAccount44.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#mmQuantityBreakdown
	 * QuantityAndAccount47.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmQuantityBreakdown
	 * AggregateBalanceInformation32.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmQuantityBreakdown
	 * AggregateBalanceInformation33.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmQuantityBreakdown
	 * FinancialInstrumentAttributes75.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmQuantityBreakdown
	 * QuantityAndAccount51.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#mmQuantityBreakdown
	 * QuantityAndAccount49.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown4#mmQuantityBreakdown
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown4.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace31.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17#mmQuantityBreakdown
	 * AdditionalBalanceInformation17.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#mmQuantityBreakdown
	 * SubBalanceInformation17.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#mmQuantityBreakdown
	 * QuantityAndAccount50.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmQuantityBreakdown
	 * AggregateBalancePerSafekeepingPlace30.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#mmQuantityBreakdown
	 * QuantityAndAccount55.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#mmQuantityBreakdown
	 * QuantityAndAccount54.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmQuantityBreakdown
	 * QuantityAndAccount57.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#mmQuantityBreakdown
	 * QuantityAndAccount58.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#mmQuantityBreakdown
	 * QuantityAndAccount56.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#mmQuantityBreakdown
	 * QuantityAndAccount59.mmQuantityBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#mmQuantityBreakdown
	 * QuantityAndAccount60.mmQuantityBreakdown}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmLotBreakdown = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Unit4.mmUnitDetails, QuantityAndAccount29.mmQuantityBreakdown, QuantityAndAccount30.mmQuantityBreakdown, QuantityAndAccount32.mmQuantityBreakdown, QuantityAndAccount33.mmQuantityBreakdown,
					FinancialInstrumentAttributes4.mmQuantityBreakdown, FinancialInstrumentAttributes13.mmQuantityBreakdown, FinancialInstrumentAttributes21.mmQuantityBreakdown, FinancialInstrumentAttributes26.mmQuantityBreakdown,
					FinancialInstrumentAttributes36.mmQuantityBreakdown, SecuritiesSubBalanceTypeAndQuantityBreakdown1.mmQuantityBreakdown, FinancialInstrumentAttributes42.mmQuantityBreakdown,
					SecuritiesSubBalanceTypeAndQuantityBreakdown2.mmQuantityBreakdown, FinancialInstrumentAttributes27.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace7.mmQuantityBreakdown,
					AggregateBalanceInformation8.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace10.mmQuantityBreakdown, AggregateBalanceInformation11.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace12.mmQuantityBreakdown,
					AggregateBalanceInformation13.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace14.mmQuantityBreakdown, AggregateBalanceInformation15.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace16.mmQuantityBreakdown,
					AggregateBalanceInformation17.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace18.mmQuantityBreakdown, AggregateBalanceInformation19.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace21.mmQuantityBreakdown,
					AggregateBalanceInformation22.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace22.mmQuantityBreakdown, AggregateBalanceInformation23.mmQuantityBreakdown, AdditionalBalanceInformation5.mmQuantityBreakdown,
					SubBalanceInformation5.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace8.mmQuantityBreakdown, AggregateBalanceInformation9.mmQuantityBreakdown, AdditionalBalanceInformation8.mmQuantityBreakdown,
					SubBalanceInformation8.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace9.mmQuantityBreakdown, AggregateBalanceInformation10.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace11.mmQuantityBreakdown,
					AggregateBalanceInformation12.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace13.mmQuantityBreakdown, AggregateBalanceInformation14.mmQuantityBreakdown, AdditionalBalanceInformation9.mmQuantityBreakdown,
					SubBalanceInformation9.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace15.mmQuantityBreakdown, AggregateBalanceInformation16.mmQuantityBreakdown, AdditionalBalanceInformation10.mmQuantityBreakdown,
					SubBalanceInformation10.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace17.mmQuantityBreakdown, AggregateBalanceInformation18.mmQuantityBreakdown, AdditionalBalanceInformation11.mmQuantityBreakdown,
					SubBalanceInformation11.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace20.mmQuantityBreakdown, AggregateBalanceInformation21.mmQuantityBreakdown, AdditionalBalanceInformation12.mmQuantityBreakdown,
					SubBalanceInformation12.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace23.mmQuantityBreakdown, AggregateBalanceInformation24.mmQuantityBreakdown, QuantityAndAccount1.mmQuantityBreakdown,
					QuantityAndAccount5.mmQuantityBreakdown, QuantityAndAccount17.mmQuantityBreakdown, QuantityAndAccount24.mmQuantityBreakdown, QuantityAndAccount25.mmQuantityBreakdown, QuantityAndAccount34.mmQuantityBreakdown,
					QuantityAndAccount2.mmQuantityBreakdown, QuantityAndAccount12.mmQuantityBreakdown, QuantityAndAccount15.mmQuantityBreakdown, QuantityAndAccount20.mmQuantityBreakdown, QuantityAndAccount28.mmQuantityBreakdown,
					QuantityAndAccount37.mmQuantityBreakdown, Order16.mmQuantityBreakdown, Order14.mmQuantityBreakdown, QuantityAndAccount3.mmQuantityBreakdown, QuantityAndAccount13.mmQuantityBreakdown,
					QuantityAndAccount8.mmQuantityBreakdown, QuantityAndAccount14.mmQuantityBreakdown, QuantityAndAccount4.mmQuantityBreakdown, QuantityAndAccount22.mmQuantityBreakdown, QuantityAndAccount27.mmQuantityBreakdown,
					QuantityAndAccount36.mmQuantityBreakdown, QuantityAndAccount9.mmQuantityBreakdown, QuantityAndAccount23.mmQuantityBreakdown, QuantityAndAccount26.mmQuantityBreakdown, QuantityAndAccount35.mmQuantityBreakdown,
					RedemptionExecution10.mmLotDetails, RedemptionOrder9.mmLotDetails, CashSubBalanceTypeAndQuantityBreakdown1.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace19.mmQuantityBreakdown,
					AggregateBalanceInformation20.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace6.mmQuantityBreakdown, AggregateBalanceInformation6.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace5.mmQuantityBreakdown,
					AggregateBalanceInformation7.mmQuantityBreakdown, Order17.mmQuantityBreakdown, Order18.mmQuantityBreakdown, AggregateBalanceInformation26.mmQuantityBreakdown, AggregateBalanceInformation25.mmQuantityBreakdown,
					AggregateBalancePerSafekeepingPlace24.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace25.mmQuantityBreakdown, AggregateBalanceInformation28.mmQuantityBreakdown, AggregateBalanceInformation27.mmQuantityBreakdown,
					AggregateBalancePerSafekeepingPlace26.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace27.mmQuantityBreakdown, QuantityAndAccount39.mmQuantityBreakdown, AggregateBalanceInformation30.mmQuantityBreakdown,
					QuantityAndAccount41.mmQuantityBreakdown, QuantityAndAccount42.mmQuantityBreakdown, AggregateBalanceInformation31.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace28.mmQuantityBreakdown,
					QuantityAndAccount43.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace29.mmQuantityBreakdown, FinancialInstrumentAttributes63.mmQuantityBreakdown, SubBalanceInformation15.mmQuantityBreakdown,
					AdditionalBalanceInformation15.mmQuantityBreakdown, SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmQuantityBreakdown, QuantityAndAccount45.mmQuantityBreakdown, QuantityAndAccount44.mmQuantityBreakdown,
					QuantityAndAccount47.mmQuantityBreakdown, AggregateBalanceInformation32.mmQuantityBreakdown, AggregateBalanceInformation33.mmQuantityBreakdown, FinancialInstrumentAttributes75.mmQuantityBreakdown,
					QuantityAndAccount51.mmQuantityBreakdown, QuantityAndAccount49.mmQuantityBreakdown, SecuritiesSubBalanceTypeAndQuantityBreakdown4.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace31.mmQuantityBreakdown,
					AdditionalBalanceInformation17.mmQuantityBreakdown, SubBalanceInformation17.mmQuantityBreakdown, QuantityAndAccount50.mmQuantityBreakdown, AggregateBalancePerSafekeepingPlace30.mmQuantityBreakdown,
					QuantityAndAccount55.mmQuantityBreakdown, QuantityAndAccount54.mmQuantityBreakdown, QuantityAndAccount57.mmQuantityBreakdown, QuantityAndAccount58.mmQuantityBreakdown, QuantityAndAccount56.mmQuantityBreakdown,
					QuantityAndAccount59.mmQuantityBreakdown, QuantityAndAccount60.mmQuantityBreakdown);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> minimumExercisableQuantitySecuritiesConversion;
	/**
	 * Securities conversion process for which a minimum exercisable quantity is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected SecuritiesConversion minimumExercisableMultipleQuantitySecuritiesConversion;
	/**
	 * Securities conversion process for which a minimum exercisable multiple
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumExercisableMultipleQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable multiple quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected SecuritiesBalance aggregateQuantityBalance;
	/**
	 * Securities balance which contains the aggregate quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance1#mmBalance
	 * CorporateActionEventAndBalance1.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance2#mmBalance
	 * CorporateActionEventAndBalance2.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance3#mmBalance
	 * CorporateActionEventAndBalance3.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#mmBalance
	 * CorporateActionEventAndBalance4.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance5#mmBalance
	 * CorporateActionEventAndBalance5.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance6#mmBalance
	 * CorporateActionEventAndBalance6.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#mmBalance
	 * CorporateActionEventAndBalance7.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance8#mmBalance
	 * CorporateActionEventAndBalance8.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#mmOpeningBalance
	 * FinancialInstrumentDetails2.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#mmClosingBalance
	 * FinancialInstrumentDetails2.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#mmOpeningBalance
	 * FinancialInstrumentDetails3.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#mmClosingBalance
	 * FinancialInstrumentDetails3.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#mmOpeningBalance
	 * FinancialInstrumentDetails5.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#mmClosingBalance
	 * FinancialInstrumentDetails5.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#mmOpeningBalance
	 * FinancialInstrumentDetails8.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#mmClosingBalance
	 * FinancialInstrumentDetails8.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#mmOpeningBalance
	 * FinancialInstrumentDetails9.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#mmClosingBalance
	 * FinancialInstrumentDetails9.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#mmOpeningBalance
	 * FinancialInstrumentDetails11.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#mmClosingBalance
	 * FinancialInstrumentDetails11.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#mmOpeningBalance
	 * FinancialInstrumentDetails13.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#mmClosingBalance
	 * FinancialInstrumentDetails13.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#mmOpeningBalance
	 * FinancialInstrumentDetails16.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#mmClosingBalance
	 * FinancialInstrumentDetails16.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#mmOpeningBalance
	 * FinancialInstrumentDetails17.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#mmClosingBalance
	 * FinancialInstrumentDetails17.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#mmOpeningBalance
	 * FinancialInstrumentDetails18.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#mmClosingBalance
	 * FinancialInstrumentDetails18.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#mmOpeningBalance
	 * FinancialInstrumentDetails20.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#mmClosingBalance
	 * FinancialInstrumentDetails20.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmBalance
	 * CorporateActionEventAndBalance9.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance10#mmBalance
	 * CorporateActionEventAndBalance10.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#mmOpeningBalance
	 * FinancialInstrumentDetails23.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#mmClosingBalance
	 * FinancialInstrumentDetails23.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmBalance
	 * CorporateActionEventAndBalance11.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#mmOpeningBalance
	 * FinancialInstrumentDetails25.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#mmClosingBalance
	 * FinancialInstrumentDetails25.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#mmOpeningBalance
	 * FinancialInstrumentDetails27.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#mmClosingBalance
	 * FinancialInstrumentDetails27.mmClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance12#mmBalance
	 * CorporateActionEventAndBalance12.mmBalance}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmAggregateQuantityBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionEventAndBalance1.mmBalance, CorporateActionEventAndBalance2.mmBalance, CorporateActionEventAndBalance3.mmBalance, CorporateActionEventAndBalance4.mmBalance,
					CorporateActionEventAndBalance5.mmBalance, CorporateActionEventAndBalance6.mmBalance, CorporateActionEventAndBalance7.mmBalance, CorporateActionEventAndBalance8.mmBalance, FinancialInstrumentDetails2.mmOpeningBalance,
					FinancialInstrumentDetails2.mmClosingBalance, FinancialInstrumentDetails3.mmOpeningBalance, FinancialInstrumentDetails3.mmClosingBalance, FinancialInstrumentDetails5.mmOpeningBalance,
					FinancialInstrumentDetails5.mmClosingBalance, FinancialInstrumentDetails8.mmOpeningBalance, FinancialInstrumentDetails8.mmClosingBalance, FinancialInstrumentDetails9.mmOpeningBalance,
					FinancialInstrumentDetails9.mmClosingBalance, FinancialInstrumentDetails11.mmOpeningBalance, FinancialInstrumentDetails11.mmClosingBalance, FinancialInstrumentDetails13.mmOpeningBalance,
					FinancialInstrumentDetails13.mmClosingBalance, FinancialInstrumentDetails16.mmOpeningBalance, FinancialInstrumentDetails16.mmClosingBalance, FinancialInstrumentDetails17.mmOpeningBalance,
					FinancialInstrumentDetails17.mmClosingBalance, FinancialInstrumentDetails18.mmOpeningBalance, FinancialInstrumentDetails18.mmClosingBalance, FinancialInstrumentDetails20.mmOpeningBalance,
					FinancialInstrumentDetails20.mmClosingBalance, CorporateActionEventAndBalance9.mmBalance, CorporateActionEventAndBalance10.mmBalance, FinancialInstrumentDetails23.mmOpeningBalance,
					FinancialInstrumentDetails23.mmClosingBalance, CorporateActionEventAndBalance11.mmBalance, FinancialInstrumentDetails25.mmOpeningBalance, FinancialInstrumentDetails25.mmClosingBalance,
					FinancialInstrumentDetails27.mmOpeningBalance, FinancialInstrumentDetails27.mmClosingBalance, CorporateActionEventAndBalance12.mmBalance);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantityBalance";
			definition = "Securities balance which contains the aggregate quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmAggregateQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition securitiesProceedsDefinition;
	/**
	 * Securities proceeds for which an amount of securities is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an amount of securities is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition conditionalQuantitySecuritiesProceeds;
	/**
	 * Securities proceeds for which a conditional quantity has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmConditionalQuantity
	 * SecuritiesProceedsDefinition.mmConditionalQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmConditionalQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a conditional quantity has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmConditionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition overAndAboveQuantitySecuritiesProceeds;
	/**
	 * Securities proceeds for which an over and above normal endured quantity
	 * has been provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmOverAndAboveNormalEnsuredEntitlementQuantity
	 * SecuritiesProceedsDefinition.
	 * mmOverAndAboveNormalEnsuredEntitlementQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmOverAndAboveQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which an over and above normal endured quantity has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesEntry entry;
	/**
	 * Entry in a securities account of a specific quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmFinancialInstrumentQuantity
	 * SecuritiesEntry.mmFinancialInstrumentQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry in a securities account of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmFinancialInstrumentQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	protected QuantityCode code;
	/**
	 * Quantity expressed as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.QuantityCode
	 * QuantityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity5Choice#mmCode
	 * Quantity5Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity11Choice#mmCode
	 * Quantity11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmCode
	 * FinancialInstrumentQuantity2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#mmCode
	 * FinancialInstrumentQuantity14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#mmCode
	 * FinancialInstrumentQuantity16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#mmCode
	 * FinancialInstrumentQuantity17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#mmCode
	 * FinancialInstrumentQuantity19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#mmCode
	 * FinancialInstrumentQuantity20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#mmCode
	 * FinancialInstrumentQuantity21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#mmCode
	 * FinancialInstrumentQuantity22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice#mmCode
	 * UnitOrFaceAmountOrCodeChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice#mmCode
	 * UnitOrFaceAmountOrCode1Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity20Choice#mmCode
	 * Quantity20Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Quantity40Choice#mmCode
	 * Quantity40Choice.mmCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Quantity5Choice.mmCode, Quantity11Choice.mmCode, FinancialInstrumentQuantity2Choice.mmCode, FinancialInstrumentQuantity14Choice.mmCode, FinancialInstrumentQuantity16Choice.mmCode,
					FinancialInstrumentQuantity17Choice.mmCode, FinancialInstrumentQuantity19Choice.mmCode, FinancialInstrumentQuantity20Choice.mmCode, FinancialInstrumentQuantity21Choice.mmCode, FinancialInstrumentQuantity22Choice.mmCode,
					UnitOrFaceAmountOrCodeChoice.mmCode, UnitOrFaceAmountOrCode1Choice.mmCode, Quantity20Choice.mmCode, Quantity40Choice.mmCode);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Quantity expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuantityCode.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition expectedQuantitySecuritiesProceeds;
	/**
	 * Securities proceeds for which a quantity of securities to receive has
	 * been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmQuantityToReceive
	 * SecuritiesProceedsDefinition.mmQuantityToReceive}</li>
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
	public static final MMBusinessAssociationEnd mmExpectedQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpectedQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a quantity of securities to receive has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmQuantityToReceive;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition statusRelatedSecuritiesProceeds;
	/**
	 * Securities proceeds related to securities with a specific status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmStatusQuantity
	 * SecuritiesProceedsDefinition.mmStatusQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmStatusRelatedSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusRelatedSecuritiesProceeds";
			definition = "Securities proceeds related to securities with a specific status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmStatusQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected CorporateActionDistribution corporateActionDistribution;
	/**
	 * Corporate action distribution process for which a quantity of securities
	 * has been posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingQuantity
	 * CorporateActionDistribution.mmPostingQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Corporate action distribution process for which a quantity of securities has been posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmPostingQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	protected CorporateActionEvent relatedEventForFractionalQuantity;
	/**
	 * Event for which the resulting fractional quantity will be paid with cash
	 * in lieu.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFractionalQuantity
	 * CorporateActionEvent.mmFractionalQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedEventForFractionalQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedEventForFractionalQuantity";
			definition = "Event for which the resulting fractional quantity will be paid with cash in lieu. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmFractionalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> maximumExercisableQuantitySecuritiesConversion;
	/**
	 * Securities conversion process for which a maximum exercisable quantity is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
	 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a maximum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmMaximumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition boardLotSecuritiesProceeds;
	/**
	 * Securities proceeds related to a board lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmBoardLotSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmBoardLotSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesProceeds";
			definition = "Securities proceeds related to a board lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition newDenominationSecuritiesProceeds;
	/**
	 * Securities proceeds related to a quantity of redenominated securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewDenominationSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmNewDenominationSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesProceeds";
			definition = "Securities proceeds related to a quantity of redenominated securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected BiddingConditions backEndOddLotBiddingConditions;
	/**
	 * BiddingConditions for which a back end odd lot is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
	 * BiddingConditions.mmBackEndOddLotQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmBackEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotBiddingConditions";
			definition = "BiddingConditions for which a back end odd lot is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmBackEndOddLotQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected CorporateActionSecuritiesEntitlement securitiesEntitlement;
	/**
	 * Specifies the entitlement parameters relative to the securities
	 * entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
	 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntitlement";
			definition = "Specifies the entitlement parameters relative to the securities entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmObject();
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Corporate action for which a quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
	 * CorporateActionEvent.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected BiddingConditions biddingConditions;
	/**
	 * Bidding conditions related to the base denomination quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
	 * BiddingConditions.mmBaseDenomination}</li>
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
	public static final MMBusinessAssociationEnd mmBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions related to the base denomination quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmBaseDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected Lottery lottery;
	/**
	 * Lottery for which an incremental denomination is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
	 * Lottery.mmIncrementalDenomination}</li>
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
	public static final MMBusinessAssociationEnd mmLottery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for which an incremental denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.mmIncrementalDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
		}
	};
	protected SecuritiesBalance relatedSubBalance;
	/**
	 * Sub balance which contains a quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails1#mmSubBalance
	 * FinancialInstrumentDetails1.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails4#mmSubBalance
	 * FinancialInstrumentDetails4.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails6#mmSubBalance
	 * FinancialInstrumentDetails6.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails7#mmSubBalance
	 * FinancialInstrumentDetails7.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails10#mmSubBalance
	 * FinancialInstrumentDetails10.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails12#mmSubBalance
	 * FinancialInstrumentDetails12.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails14#mmSubBalance
	 * FinancialInstrumentDetails14.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails15#mmSubBalance
	 * FinancialInstrumentDetails15.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails21#mmSubBalance
	 * FinancialInstrumentDetails21.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails22#mmSubBalance
	 * FinancialInstrumentDetails22.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails24#mmSubBalance
	 * FinancialInstrumentDetails24.mmSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails26#mmSubBalance
	 * FinancialInstrumentDetails26.mmSubBalance}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmRelatedSubBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentDetails1.mmSubBalance, FinancialInstrumentDetails4.mmSubBalance, FinancialInstrumentDetails6.mmSubBalance, FinancialInstrumentDetails7.mmSubBalance,
					FinancialInstrumentDetails10.mmSubBalance, FinancialInstrumentDetails12.mmSubBalance, FinancialInstrumentDetails14.mmSubBalance, FinancialInstrumentDetails15.mmSubBalance, FinancialInstrumentDetails21.mmSubBalance,
					FinancialInstrumentDetails22.mmSubBalance, FinancialInstrumentDetails24.mmSubBalance, FinancialInstrumentDetails26.mmSubBalance);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSubBalance";
			definition = "Sub balance which contains a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSubBalanceQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesBalance availableQuantityBalance;
	/**
	 * Securities balance which contains the securities quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
	 * SecuritiesBalance.mmAvailableQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmAvailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantityBalance";
			definition = "Securities balance which contains the securities quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmAvailableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesTrade trade;
	/**
	 * Trade for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
	 * SecuritiesTrade.mmTradeQuantity}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#mmTransaction
	 * FinancialInstrumentDetails2.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#mmTransaction
	 * FinancialInstrumentDetails3.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#mmTransaction
	 * FinancialInstrumentDetails5.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#mmTransaction
	 * FinancialInstrumentDetails8.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#mmTransaction
	 * FinancialInstrumentDetails9.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#mmTransaction
	 * FinancialInstrumentDetails11.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#mmTransaction
	 * FinancialInstrumentDetails13.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#mmTransaction
	 * FinancialInstrumentDetails16.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#mmTransaction
	 * FinancialInstrumentDetails17.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#mmTransaction
	 * FinancialInstrumentDetails18.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#mmTransaction
	 * FinancialInstrumentDetails20.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#mmTransaction
	 * FinancialInstrumentDetails23.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#mmTransaction
	 * FinancialInstrumentDetails25.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#mmTransaction
	 * FinancialInstrumentDetails27.mmTransaction}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentDetails2.mmTransaction, FinancialInstrumentDetails3.mmTransaction, FinancialInstrumentDetails5.mmTransaction, FinancialInstrumentDetails8.mmTransaction,
					FinancialInstrumentDetails9.mmTransaction, FinancialInstrumentDetails11.mmTransaction, FinancialInstrumentDetails13.mmTransaction, FinancialInstrumentDetails16.mmTransaction, FinancialInstrumentDetails17.mmTransaction,
					FinancialInstrumentDetails18.mmTransaction, FinancialInstrumentDetails20.mmTransaction, FinancialInstrumentDetails23.mmTransaction, FinancialInstrumentDetails25.mmTransaction, FinancialInstrumentDetails27.mmTransaction);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected SecuritiesConversion ratioDenominatorSecuritiesConversion;
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioDenominator
	 * SecuritiesConversion.mmConversionRatioDenominator}</li>
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
	public static final MMBusinessAssociationEnd mmRatioDenominatorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatioDenominatorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected SecuritiesConversion ratioNumeratorSecuritiesConversion;
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioNumerator
	 * SecuritiesConversion.mmConversionRatioNumerator}</li>
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
	public static final MMBusinessAssociationEnd mmRatioNumeratorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatioNumeratorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected TradingMarket minimumTradedQuantityMarket;
	/**
	 * Market for which a minimum traded quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
	 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedQuantityMarket";
			definition = "Market for which a minimum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmMinimumTradedNominalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected Debt minimumDenominationDebt;
	/**
	 * Debt for which a minimum denomination is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMinimumDenomination
	 * Debt.mmMinimumDenomination}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumDenominationDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumDenominationDebt";
			definition = "Debt for which a minimum denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmMinimumDenomination;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
		}
	};
	protected Debt minimumIncrementDebt;
	/**
	 * Debt for which a minimum increment is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmMinimumIncrement
	 * Debt.mmMinimumIncrement}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumIncrementDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrementDebt";
			definition = "Debt for which a minimum increment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmMinimumIncrement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * Order for which a specific quantity is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a specific quantity is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected Allocation allocation;
	/**
	 * Allocation process for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedQuantity
	 * Allocation.mmAllocatedQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmAllocatedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice#mmAmount
	 * QuantityOrAmount1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#mmSubTotalAmount
	 * CashInForecast2.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmSubTotalAmount
	 * CashOutForecast2.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast1#mmNetAmount
	 * NetCashForecast1.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#mmSubTotalAmount
	 * CashInForecast4.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmSubTotalAmount
	 * CashOutForecast4.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmNetAmount
	 * NetCashForecast2.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#mmNetAmount
	 * NetCashForecast3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmAmount
	 * FundCashInBreakdown1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#mmSubTotalAmount
	 * CashInForecast1.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#mmAmount
	 * FundCashOutBreakdown1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#mmSubTotalAmount
	 * CashOutForecast1.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmAmount
	 * FundCashInBreakdown2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#mmSubTotalAmount
	 * CashInForecast3.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmAmount
	 * FundCashOutBreakdown2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmSubTotalAmount
	 * CashOutForecast3.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCompensation1#mmSettlementAmount
	 * SecuritiesCompensation1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGrandTotalAmount
	 * UnitsAndCash.mmGrandTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmCurrencyStatus
	 * EstimatedFundCashForecast5.mmCurrencyStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmSubTotalAmount
	 * CashOutForecast5.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmAmount
	 * FundCashOutBreakdown3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmNetAmount
	 * NetCashForecast4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#mmSubTotalAmount
	 * CashInForecast5.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmAmount
	 * FundCashInBreakdown3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmSubTotalAmount
	 * CashOutForecast6.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#mmSubTotalAmount
	 * CashInForecast6.mmSubTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmNetAmount
	 * NetCashForecast5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInOutForecast7#mmAmount
	 * CashInOutForecast7.mmAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityOrAmount1Choice.mmAmount, CashInForecast2.mmSubTotalAmount, CashOutForecast2.mmSubTotalAmount, NetCashForecast1.mmNetAmount, CashInForecast4.mmSubTotalAmount,
					CashOutForecast4.mmSubTotalAmount, NetCashForecast2.mmNetAmount, NetCashForecast3.mmNetAmount, FundCashInBreakdown1.mmAmount, CashInForecast1.mmSubTotalAmount, FundCashOutBreakdown1.mmAmount,
					CashOutForecast1.mmSubTotalAmount, FundCashInBreakdown2.mmAmount, CashInForecast3.mmSubTotalAmount, FundCashOutBreakdown2.mmAmount, CashOutForecast3.mmSubTotalAmount, SecuritiesCompensation1.mmSettlementAmount,
					UnitsAndCash.mmGrandTotalAmount, EstimatedFundCashForecast5.mmCurrencyStatus, CashOutForecast5.mmSubTotalAmount, FundCashOutBreakdown3.mmAmount, NetCashForecast4.mmNetAmount, CashInForecast5.mmSubTotalAmount,
					FundCashInBreakdown3.mmAmount, CashOutForecast6.mmSubTotalAmount, CashInForecast6.mmSubTotalAmount, NetCashForecast5.mmNetAmount, CashInOutForecast7.mmAmount);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected UnderlyingRatio denominatorRatio;
	/**
	 * Ratio for which a denominator is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityDenominator
	 * UnderlyingRatio.mmUnderlyingQuantityDenominator}</li>
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
	public static final MMBusinessAssociationEnd mmDenominatorRatio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominatorRatio";
			definition = "Ratio for which a denominator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
		}
	};
	protected UnderlyingRatio numeratorRatio;
	/**
	 * Ratio for which a numerator is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityNumerator
	 * UnderlyingRatio.mmUnderlyingQuantityNumerator}</li>
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
	public static final MMBusinessAssociationEnd mmNumeratorRatio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumeratorRatio";
			definition = "Ratio for which a numerator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.mmObject();
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * Trade for which settlement takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmExecutedTradeQuantity
	 * SecuritiesTradeExecution.mmExecutedTradeQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade for which settlement takes place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmExecutedTradeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * Corporate action for which the offeror/issuer has specified a quantity of
	 * securities to purchase or redeem under the terms of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantitySought
	 * CorporateActionEvent.mmSecuritiesQuantitySought}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantitySought;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected CorporateActionElection corporateActionElection;
	/**
	 * Election process which selected a quantity of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
	 * CorporateActionElection.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * Tax voucher for which the calculation of holdings at record date took
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
	 * TaxVoucher.mmRecordDateHolding}</li>
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
	public static final MMBusinessAssociationEnd mmTaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the calculation of holdings at record date took place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmRecordDateHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	protected BuyIn relatedBuyIn;
	/**
	 * Buy-in process for which a compensation amount of securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
	 * BuyIn.mmSecuritiesCompensation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "Buy-in process for which a compensation amount of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.mmSecuritiesCompensation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
		}
	};
	protected SecuritiesOrder previousDayOrder;
	/**
	 * Securities order which uses information on a day order quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmDayOrderQuantity
	 * SecuritiesOrder.mmDayOrderQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmPreviousDayOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousDayOrder";
			definition = "Securities order which uses information on a day order quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmDayOrderQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Liquidity> liquidity;
	/**
	 * Liquidity information related to a quantity of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmQuantity
	 * Liquidity.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmLiquidity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Liquidity information related to a quantity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
		}
	};
	protected PercentageRate rate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity13Choice#mmPortfolioTransferOutRate
	 * Quantity13Choice.mmPortfolioTransferOutRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmPortfolioTransferOutRate
	 * Transfer28.mmPortfolioTransferOutRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmPortfolioTransferOutRate
	 * Transfer31.mmPortfolioTransferOutRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Quantity13Choice.mmPortfolioTransferOutRate, Transfer28.mmPortfolioTransferOutRate, Transfer31.mmPortfolioTransferOutRate);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderParameters> minimumQuantityOrderParameters;
	/**
	 * Securities order for which a minimum quantity to execute is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMinimumQuantity
	 * SecuritiesOrderParameters.mmMinimumQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityOrderParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityOrderParameters";
			definition = "Securities order for which a minimum quantity to execute is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
		}
	};
	protected Quote maximumQuantityRelatedQuote;
	/**
	 * Quote process for which a maximum quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMaximumQuantity
	 * Quote.mmMaximumQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityRelatedQuote";
			definition = "Quote process for which a maximum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmMaximumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesBalance unavailableQuantityBalance;
	/**
	 * Securities balance which contains the unavailable quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUnavailableQuantity
	 * SecuritiesBalance.mmUnavailableQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmUnavailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantityBalance";
			definition = "Securities balance which contains the unavailable quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmUnavailableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesOrderParameters matchIncrementOrderParameters;
	/**
	 * Securities order parameters for which a match increment quantity is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMatchIncrement
	 * SecuritiesOrderParameters.mmMatchIncrement}</li>
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
	public static final MMBusinessAssociationEnd mmMatchIncrementOrderParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchIncrementOrderParameters";
			definition = "Securities order parameters for which a match increment quantity is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmMatchIncrement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
		}
	};
	protected Issuance relatedIssuance;
	/**
	 * Issuance for which a minimum subscription quantity of securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmMinimum
	 * Issuance.mmMinimum}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIssuance";
			definition = "Issuance for which a minimum subscription quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmMinimum;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected PairOff pairoff;
	/**
	 * Pair off process for which a quantity has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#mmPairedOffQuantity
	 * PairOff.mmPairedOffQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmPairoff = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Pair off process for which a quantity has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.mmPairedOffQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
		}
	};
	protected Issuance issuance;
	/**
	 * Issuance for which the nominal amount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
	 * Issuance.mmIssueNominalAmount}</li>
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
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the nominal amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmIssueNominalAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution intermediateToUnderlyingDenominatorDistributionInformation;
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying denominator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution maximumHoldingDistributionInformation;
	/**
	 * Cash and securities distribution information for which a maximum holding
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumHolding
	 * SecuritiesAndCashDistribution.mmMaximumHolding}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution maximumExercisableQuantityDistributionInformation;
	/**
	 * Cash and securities distribution information for which a maximum
	 * exercisable quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMaximumExercisableQuantity
	 * SecuritiesAndCashDistribution.mmMaximumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution minimumExercisableQuantityDistributionInformation;
	/**
	 * Cash and securities distribution information for which a minimum
	 * exercisable quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumExercisableQuantity
	 * SecuritiesAndCashDistribution.mmMinimumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumExercisableQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution distributedToUnderlyingDenominatorDistributionInformation;
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying denominator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingDenominator
	 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution intermediateToUnderlyingNumeratorDistributionInformation;
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying numerator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmIntermediateToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution minimumHoldingDistributionInformation;
	/**
	 * Cash and securities distribution information for which a minimum holding
	 * quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmMinimumHolding
	 * SecuritiesAndCashDistribution.mmMinimumHolding}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesAndCashDistribution distributedToUnderlyingNumeratorDistributionInformation;
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying numerator quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAndCashDistribution#mmDistributedToUnderlyingNumerator
	 * SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution maximumHoldingRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which a maximum holding quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMaximumHolding
	 * SecuritiesDistribution.mmMaximumHolding}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a maximum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmMaximumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which an intermediate to underlying numerator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingNumerator
	 * SecuritiesDistribution.mmIntermediateToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which an intermediate to underlying
	 * denominator quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmIntermediateToUnderlyingDenominator
	 * SecuritiesDistribution.mmIntermediateToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution distributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which a distributed to underlying denominator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingDenominator
	 * SecuritiesDistribution.mmDistributedToUnderlyingDenominator}</li>
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingDenominator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution distributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which a distributed to underlying numerator
	 * quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmDistributedToUnderlyingNumerator
	 * SecuritiesDistribution.mmDistributedToUnderlyingNumerator}</li>
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
	public static final MMBusinessAssociationEnd mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingNumerator;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution minimumHoldingRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which a minimum holding quantity is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmMinimumHolding
	 * SecuritiesDistribution.mmMinimumHolding}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a minimum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmMinimumHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected TradingMarket maximumTradedQuantityMarket;
	/**
	 * Market for which a maximum traded quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMaximumTradedNominalQuantity
	 * TradingMarket.mmMaximumTradedNominalQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedQuantityMarket";
			definition = "Market for which a maximum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmMaximumTradedNominalQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected Quote quantityRelatedQuote;
	/**
	 * Quote process for which a quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuantity
	 * Quote.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityRelatedQuote";
			definition = "Quote process for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote minimumQuantityRelatedQuote;
	/**
	 * Quote process for which a minimum quantity of securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMinimumQuantity
	 * Quote.mmMinimumQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityRelatedQuote";
			definition = "Quote process for which a minimum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmMinimumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Net asset value calculation parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSecuritiesQuantity
	 * NetAssetValueCalculation.mmSecuritiesQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value calculation parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmSecuritiesQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected SidePocket sidePocket;
	/**
	 * Side pocket for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#mmSidePocketQuantity
	 * SidePocket.mmSidePocketQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SidePocket
	 * SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmSidePocketQuantity
	 * ExpectedExecutionDetails3.mmSidePocketQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSidePocket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ExpectedExecutionDetails3.mmSidePocketQuantity);
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SidePocket";
			definition = "Side pocket for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.mmSidePocketQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
		}
	};
	protected Netting netting;
	/**
	 * Netting process for which a net quantity of securities has been
	 * calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#mmNetQuantity
	 * Netting.mmNetQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmNetting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process for which a net quantity of securities has been calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.mmNetQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
		}
	};
	protected SecuritiesOrderStatus relatedOrderStatus;
	/**
	 * Order status for which a remaining quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
	 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOrderStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderStatus";
			definition = "Order status for which a remaining quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmRemainingQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	protected SecuritiesOrderStatus securitiesOrderStatus;
	/**
	 * Order status for which a cumulative quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
	 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOrderStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrderStatus";
			definition = "Order status for which a cumulative quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmCumulativeQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	protected SecuritiesSettlement relatedTurnaroundSettlement;
	/**
	 * Securities settlement process for which a turned quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
	 * SecuritiesSettlement.mmTurnedQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedTurnaroundSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTurnaroundSettlement";
			definition = "Securities settlement process for which a turned quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmTurnedQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected FundsCashFlow relatedCashFlow;
	/**
	 * Cash flow for which quantities are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmCashFlowQuantity
	 * FundsCashFlow.mmCashFlowQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCashFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashFlow";
			definition = "Cash flow for which quantities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmCashFlowQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	protected Position position;
	/**
	 * Position which contains the net quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmNetQuantity
	 * Position.mmNetQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmPosition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Position which contains the net quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmNetQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	protected BiddingConditions maximumQuantityBiddingConditions;
	/**
	 * Bidding conditions for which a maximum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
	 * BiddingConditions.mmMaximumQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmMaximumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityBiddingConditions";
			definition = "Bidding conditions for which a maximum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMaximumQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected BiddingConditions frontEndOddLotBiddingConditions;
	/**
	 * Bidding conditions for which a front end odd lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
	 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmFrontEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotBiddingConditions";
			definition = "Bidding conditions for which a front end odd lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmFrontEndOddLotQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected BiddingConditions minimumQuantityBiddingConditions;
	/**
	 * Bidding conditions for which a minimum quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
	 * BiddingConditions.mmMinimumQuantitySought}</li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityBiddingConditions";
			definition = "Bidding conditions for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMinimumQuantitySought;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantity";
				definition = "Quantity of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesQuantity, com.tools20022.repository.entity.Security.mmMinimumQuantity,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmSecuritiesQuantity, com.tools20022.repository.entity.TradingMarket.mmMinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.mmMaximumTradedNominalQuantity, com.tools20022.repository.entity.InvestmentFundOrder.mmUnitsNumber, com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.mmTransferredQuantity, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmUnitsNumber,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementQuantity, com.tools20022.repository.entity.SecuritiesSettlement.mmTurnedQuantity, com.tools20022.repository.entity.LotBreakdown.mmSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesEntry.mmFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesTradeExecution.mmExecutedTradeQuantity,
						com.tools20022.repository.entity.Debt.mmMinimumDenomination, com.tools20022.repository.entity.Debt.mmMinimumIncrement, com.tools20022.repository.entity.Issuance.mmIssueNominalAmount,
						com.tools20022.repository.entity.Issuance.mmMinimum, com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableMultipleQuantity, com.tools20022.repository.entity.SecuritiesConversion.mmMaximumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioDenominator, com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioNumerator,
						com.tools20022.repository.entity.SecuritiesBalance.mmAggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmSubBalanceQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.mmAvailableQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmUnavailableQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmFractionalQuantity, com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.mmSecuritiesQuantitySought, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmConditionalQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmOverAndAboveNormalEnsuredEntitlementQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmQuantityToReceive, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmStatusQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmBoardLotSecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewDenominationSecuritiesQuantity,
						com.tools20022.repository.entity.CorporateActionElection.mmQuantity, com.tools20022.repository.entity.BiddingConditions.mmFrontEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.mmBackEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.mmMaximumQuantity,
						com.tools20022.repository.entity.BiddingConditions.mmMinimumQuantitySought, com.tools20022.repository.entity.BiddingConditions.mmBaseDenomination, com.tools20022.repository.entity.TaxVoucher.mmRecordDateHolding,
						com.tools20022.repository.entity.CorporateActionDistribution.mmPostingQuantity, com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity,
						com.tools20022.repository.entity.Lottery.mmIncrementalDenomination, com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.mmDayOrderQuantity,
						com.tools20022.repository.entity.Allocation.mmAllocatedQuantity, com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityDenominator,
						com.tools20022.repository.entity.UnderlyingRatio.mmUnderlyingQuantityNumerator, com.tools20022.repository.entity.FundsCashFlow.mmCashFlowQuantity,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmCumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.mmRemainingQuantity,
						com.tools20022.repository.entity.BuyIn.mmSecuritiesCompensation, com.tools20022.repository.entity.SidePocket.mmSidePocketQuantity, com.tools20022.repository.entity.Liquidity.mmQuantity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.mmMinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.mmMatchIncrement, com.tools20022.repository.entity.Quote.mmMaximumQuantity,
						com.tools20022.repository.entity.Quote.mmQuantity, com.tools20022.repository.entity.Quote.mmMinimumQuantity, com.tools20022.repository.entity.PairOff.mmPairedOffQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmIntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmMinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmDistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmMaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmIntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.mmDistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.mmMinimumHolding,
						com.tools20022.repository.entity.Netting.mmNetQuantity, com.tools20022.repository.entity.Position.mmNetQuantity);
				derivationElement_lazy = () -> Arrays.asList(Quantity6Choice.mmQuantity, Quantity6Choice.mmOriginalAndCurrentFace, Quantity10Choice.mmQuantity, Quantity10Choice.mmOriginalAndCurrentFace,
						Quantity5Choice.mmOriginalAndCurrentFaceAmount, Quantity5Choice.mmQuantity, Quantity11Choice.mmOriginalAndCurrentFaceAmount, Quantity11Choice.mmQuantity, QuantityOrAmount1Choice.mmQuantity,
						ProprietaryQuantity1.mmQuantity, TransactionQuantities1Choice.mmQuantity, TransactionQuantities1Choice.mmProprietary, TransactionQuantities2Choice.mmQuantity,
						TransactionQuantities2Choice.mmOriginalAndCurrentFaceAmount, TransactionQuantities2Choice.mmProprietary, SettlementObligation6.mmRemainingQuantityToBeSettled, Quantity1Choice.mmQuantity,
						Quantity1Choice.mmRelativeSize, FinancialInstrumentAggregateBalance2.mmSettledBalance, FinancialInstrumentAggregateBalance2.mmTradedBalance, SettlementObligation7.mmRemainingQuantityToBeSettled,
						Quantity20Choice.mmOriginalAndCurrentFaceAmount, Quantity20Choice.mmQuantity, Quantity40Choice.mmOriginalAndCurrentFaceAmount, Quantity40Choice.mmQuantity);
				element_lazy = () -> Arrays.asList(SecuritiesQuantity.mmUnit, SecuritiesQuantity.mmSecuritiesTransfer, SecuritiesQuantity.mmSecurityIdentification, SecuritiesQuantity.mmOrder, SecuritiesQuantity.mmGroup1Or2Units,
						SecuritiesQuantity.mmRelatedOrderExecution, SecuritiesQuantity.mmSecuritiesSettlement, SecuritiesQuantity.mmMinimumQuantityDebt, SecuritiesQuantity.mmLotBreakdown,
						SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion, SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion, SecuritiesQuantity.mmAggregateQuantityBalance,
						SecuritiesQuantity.mmSecuritiesProceedsDefinition, SecuritiesQuantity.mmConditionalQuantitySecuritiesProceeds, SecuritiesQuantity.mmOverAndAboveQuantitySecuritiesProceeds, SecuritiesQuantity.mmEntry,
						SecuritiesQuantity.mmCode, SecuritiesQuantity.mmExpectedQuantitySecuritiesProceeds, SecuritiesQuantity.mmStatusRelatedSecuritiesProceeds, SecuritiesQuantity.mmCorporateActionDistribution,
						SecuritiesQuantity.mmRelatedEventForFractionalQuantity, SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion, SecuritiesQuantity.mmBoardLotSecuritiesProceeds,
						SecuritiesQuantity.mmNewDenominationSecuritiesProceeds, SecuritiesQuantity.mmBackEndOddLotBiddingConditions, SecuritiesQuantity.mmSecuritiesEntitlement, SecuritiesQuantity.mmCorporateActionEvent,
						SecuritiesQuantity.mmBiddingConditions, SecuritiesQuantity.mmLottery, SecuritiesQuantity.mmRelatedSubBalance, SecuritiesQuantity.mmAvailableQuantityBalance, SecuritiesQuantity.mmTrade,
						SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion, SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion, SecuritiesQuantity.mmMinimumTradedQuantityMarket, SecuritiesQuantity.mmMinimumDenominationDebt,
						SecuritiesQuantity.mmMinimumIncrementDebt, SecuritiesQuantity.mmRelatedOrder, SecuritiesQuantity.mmAllocation, SecuritiesQuantity.mmAmount, SecuritiesQuantity.mmDenominatorRatio, SecuritiesQuantity.mmNumeratorRatio,
						SecuritiesQuantity.mmSecuritiesTradeExecution, SecuritiesQuantity.mmRelatedCorporateActionEvent, SecuritiesQuantity.mmCorporateActionElection, SecuritiesQuantity.mmTaxVoucher, SecuritiesQuantity.mmRelatedBuyIn,
						SecuritiesQuantity.mmPreviousDayOrder, SecuritiesQuantity.mmLiquidity, SecuritiesQuantity.mmRate, SecuritiesQuantity.mmMinimumQuantityOrderParameters, SecuritiesQuantity.mmMaximumQuantityRelatedQuote,
						SecuritiesQuantity.mmUnavailableQuantityBalance, SecuritiesQuantity.mmMatchIncrementOrderParameters, SecuritiesQuantity.mmRelatedIssuance, SecuritiesQuantity.mmPairoff, SecuritiesQuantity.mmIssuance,
						SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorDistributionInformation, SecuritiesQuantity.mmMaximumHoldingDistributionInformation, SecuritiesQuantity.mmMaximumExercisableQuantityDistributionInformation,
						SecuritiesQuantity.mmMinimumExercisableQuantityDistributionInformation, SecuritiesQuantity.mmDistributedToUnderlyingDenominatorDistributionInformation,
						SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorDistributionInformation, SecuritiesQuantity.mmMinimumHoldingDistributionInformation,
						SecuritiesQuantity.mmDistributedToUnderlyingNumeratorDistributionInformation, SecuritiesQuantity.mmMaximumHoldingRelatedSecuritiesDistribution,
						SecuritiesQuantity.mmIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution, SecuritiesQuantity.mmIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						SecuritiesQuantity.mmDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution, SecuritiesQuantity.mmDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution,
						SecuritiesQuantity.mmMinimumHoldingRelatedSecuritiesDistribution, SecuritiesQuantity.mmMaximumTradedQuantityMarket, SecuritiesQuantity.mmQuantityRelatedQuote, SecuritiesQuantity.mmMinimumQuantityRelatedQuote,
						SecuritiesQuantity.mmNetAssetValueCalculation, SecuritiesQuantity.mmSidePocket, SecuritiesQuantity.mmNetting, SecuritiesQuantity.mmRelatedOrderStatus, SecuritiesQuantity.mmSecuritiesOrderStatus,
						SecuritiesQuantity.mmRelatedTurnaroundSettlement, SecuritiesQuantity.mmRelatedCashFlow, SecuritiesQuantity.mmPosition, SecuritiesQuantity.mmMaximumQuantityBiddingConditions,
						SecuritiesQuantity.mmFrontEndOddLotBiddingConditions, SecuritiesQuantity.mmMinimumQuantityBiddingConditions);
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

	public DecimalNumber getUnit() {
		return unit;
	}

	public void setUnit(DecimalNumber unit) {
		this.unit = unit;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public void setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
	}

	public Security getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(com.tools20022.repository.entity.Security securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	public InvestmentFundOrder getOrder() {
		return order;
	}

	public void setOrder(com.tools20022.repository.entity.InvestmentFundOrder order) {
		this.order = order;
	}

	public UKTaxGroupUnitCode getGroup1Or2Units() {
		return group1Or2Units;
	}

	public void setGroup1Or2Units(UKTaxGroupUnitCode group1Or2Units) {
		this.group1Or2Units = group1Or2Units;
	}

	public InvestmentFundOrderExecution getRelatedOrderExecution() {
		return relatedOrderExecution;
	}

	public void setRelatedOrderExecution(com.tools20022.repository.entity.InvestmentFundOrderExecution relatedOrderExecution) {
		this.relatedOrderExecution = relatedOrderExecution;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public Security getMinimumQuantityDebt() {
		return minimumQuantityDebt;
	}

	public void setMinimumQuantityDebt(com.tools20022.repository.entity.Security minimumQuantityDebt) {
		this.minimumQuantityDebt = minimumQuantityDebt;
	}

	public List<LotBreakdown> getLotBreakdown() {
		return lotBreakdown;
	}

	public void setLotBreakdown(List<com.tools20022.repository.entity.LotBreakdown> lotBreakdown) {
		this.lotBreakdown = lotBreakdown;
	}

	public List<SecuritiesConversion> getMinimumExercisableQuantitySecuritiesConversion() {
		return minimumExercisableQuantitySecuritiesConversion;
	}

	public void setMinimumExercisableQuantitySecuritiesConversion(List<com.tools20022.repository.entity.SecuritiesConversion> minimumExercisableQuantitySecuritiesConversion) {
		this.minimumExercisableQuantitySecuritiesConversion = minimumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesConversion getMinimumExercisableMultipleQuantitySecuritiesConversion() {
		return minimumExercisableMultipleQuantitySecuritiesConversion;
	}

	public void setMinimumExercisableMultipleQuantitySecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion minimumExercisableMultipleQuantitySecuritiesConversion) {
		this.minimumExercisableMultipleQuantitySecuritiesConversion = minimumExercisableMultipleQuantitySecuritiesConversion;
	}

	public SecuritiesBalance getAggregateQuantityBalance() {
		return aggregateQuantityBalance;
	}

	public void setAggregateQuantityBalance(com.tools20022.repository.entity.SecuritiesBalance aggregateQuantityBalance) {
		this.aggregateQuantityBalance = aggregateQuantityBalance;
	}

	public SecuritiesProceedsDefinition getSecuritiesProceedsDefinition() {
		return securitiesProceedsDefinition;
	}

	public void setSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition securitiesProceedsDefinition) {
		this.securitiesProceedsDefinition = securitiesProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getConditionalQuantitySecuritiesProceeds() {
		return conditionalQuantitySecuritiesProceeds;
	}

	public void setConditionalQuantitySecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition conditionalQuantitySecuritiesProceeds) {
		this.conditionalQuantitySecuritiesProceeds = conditionalQuantitySecuritiesProceeds;
	}

	public SecuritiesProceedsDefinition getOverAndAboveQuantitySecuritiesProceeds() {
		return overAndAboveQuantitySecuritiesProceeds;
	}

	public void setOverAndAboveQuantitySecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition overAndAboveQuantitySecuritiesProceeds) {
		this.overAndAboveQuantitySecuritiesProceeds = overAndAboveQuantitySecuritiesProceeds;
	}

	public SecuritiesEntry getEntry() {
		return entry;
	}

	public void setEntry(com.tools20022.repository.entity.SecuritiesEntry entry) {
		this.entry = entry;
	}

	public QuantityCode getCode() {
		return code;
	}

	public void setCode(QuantityCode code) {
		this.code = code;
	}

	public SecuritiesProceedsDefinition getExpectedQuantitySecuritiesProceeds() {
		return expectedQuantitySecuritiesProceeds;
	}

	public void setExpectedQuantitySecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition expectedQuantitySecuritiesProceeds) {
		this.expectedQuantitySecuritiesProceeds = expectedQuantitySecuritiesProceeds;
	}

	public SecuritiesProceedsDefinition getStatusRelatedSecuritiesProceeds() {
		return statusRelatedSecuritiesProceeds;
	}

	public void setStatusRelatedSecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition statusRelatedSecuritiesProceeds) {
		this.statusRelatedSecuritiesProceeds = statusRelatedSecuritiesProceeds;
	}

	public CorporateActionDistribution getCorporateActionDistribution() {
		return corporateActionDistribution;
	}

	public void setCorporateActionDistribution(com.tools20022.repository.entity.CorporateActionDistribution corporateActionDistribution) {
		this.corporateActionDistribution = corporateActionDistribution;
	}

	public CorporateActionEvent getRelatedEventForFractionalQuantity() {
		return relatedEventForFractionalQuantity;
	}

	public void setRelatedEventForFractionalQuantity(com.tools20022.repository.entity.CorporateActionEvent relatedEventForFractionalQuantity) {
		this.relatedEventForFractionalQuantity = relatedEventForFractionalQuantity;
	}

	public List<SecuritiesConversion> getMaximumExercisableQuantitySecuritiesConversion() {
		return maximumExercisableQuantitySecuritiesConversion;
	}

	public void setMaximumExercisableQuantitySecuritiesConversion(List<com.tools20022.repository.entity.SecuritiesConversion> maximumExercisableQuantitySecuritiesConversion) {
		this.maximumExercisableQuantitySecuritiesConversion = maximumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesProceedsDefinition getBoardLotSecuritiesProceeds() {
		return boardLotSecuritiesProceeds;
	}

	public void setBoardLotSecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition boardLotSecuritiesProceeds) {
		this.boardLotSecuritiesProceeds = boardLotSecuritiesProceeds;
	}

	public SecuritiesProceedsDefinition getNewDenominationSecuritiesProceeds() {
		return newDenominationSecuritiesProceeds;
	}

	public void setNewDenominationSecuritiesProceeds(com.tools20022.repository.entity.SecuritiesProceedsDefinition newDenominationSecuritiesProceeds) {
		this.newDenominationSecuritiesProceeds = newDenominationSecuritiesProceeds;
	}

	public BiddingConditions getBackEndOddLotBiddingConditions() {
		return backEndOddLotBiddingConditions;
	}

	public void setBackEndOddLotBiddingConditions(com.tools20022.repository.entity.BiddingConditions backEndOddLotBiddingConditions) {
		this.backEndOddLotBiddingConditions = backEndOddLotBiddingConditions;
	}

	public CorporateActionSecuritiesEntitlement getSecuritiesEntitlement() {
		return securitiesEntitlement;
	}

	public void setSecuritiesEntitlement(com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement securitiesEntitlement) {
		this.securitiesEntitlement = securitiesEntitlement;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public BiddingConditions getBiddingConditions() {
		return biddingConditions;
	}

	public void setBiddingConditions(com.tools20022.repository.entity.BiddingConditions biddingConditions) {
		this.biddingConditions = biddingConditions;
	}

	public Lottery getLottery() {
		return lottery;
	}

	public void setLottery(com.tools20022.repository.entity.Lottery lottery) {
		this.lottery = lottery;
	}

	public SecuritiesBalance getRelatedSubBalance() {
		return relatedSubBalance;
	}

	public void setRelatedSubBalance(com.tools20022.repository.entity.SecuritiesBalance relatedSubBalance) {
		this.relatedSubBalance = relatedSubBalance;
	}

	public SecuritiesBalance getAvailableQuantityBalance() {
		return availableQuantityBalance;
	}

	public void setAvailableQuantityBalance(com.tools20022.repository.entity.SecuritiesBalance availableQuantityBalance) {
		this.availableQuantityBalance = availableQuantityBalance;
	}

	public SecuritiesTrade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.SecuritiesTrade trade) {
		this.trade = trade;
	}

	public SecuritiesConversion getRatioDenominatorSecuritiesConversion() {
		return ratioDenominatorSecuritiesConversion;
	}

	public void setRatioDenominatorSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion ratioDenominatorSecuritiesConversion) {
		this.ratioDenominatorSecuritiesConversion = ratioDenominatorSecuritiesConversion;
	}

	public SecuritiesConversion getRatioNumeratorSecuritiesConversion() {
		return ratioNumeratorSecuritiesConversion;
	}

	public void setRatioNumeratorSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion ratioNumeratorSecuritiesConversion) {
		this.ratioNumeratorSecuritiesConversion = ratioNumeratorSecuritiesConversion;
	}

	public TradingMarket getMinimumTradedQuantityMarket() {
		return minimumTradedQuantityMarket;
	}

	public void setMinimumTradedQuantityMarket(com.tools20022.repository.entity.TradingMarket minimumTradedQuantityMarket) {
		this.minimumTradedQuantityMarket = minimumTradedQuantityMarket;
	}

	public Debt getMinimumDenominationDebt() {
		return minimumDenominationDebt;
	}

	public void setMinimumDenominationDebt(com.tools20022.repository.entity.Debt minimumDenominationDebt) {
		this.minimumDenominationDebt = minimumDenominationDebt;
	}

	public Debt getMinimumIncrementDebt() {
		return minimumIncrementDebt;
	}

	public void setMinimumIncrementDebt(com.tools20022.repository.entity.Debt minimumIncrementDebt) {
		this.minimumIncrementDebt = minimumIncrementDebt;
	}

	public SecuritiesOrder getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public Allocation getAllocation() {
		return allocation;
	}

	public void setAllocation(com.tools20022.repository.entity.Allocation allocation) {
		this.allocation = allocation;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public UnderlyingRatio getDenominatorRatio() {
		return denominatorRatio;
	}

	public void setDenominatorRatio(com.tools20022.repository.entity.UnderlyingRatio denominatorRatio) {
		this.denominatorRatio = denominatorRatio;
	}

	public UnderlyingRatio getNumeratorRatio() {
		return numeratorRatio;
	}

	public void setNumeratorRatio(com.tools20022.repository.entity.UnderlyingRatio numeratorRatio) {
		this.numeratorRatio = numeratorRatio;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public void setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
	}

	public CorporateActionElection getCorporateActionElection() {
		return corporateActionElection;
	}

	public void setCorporateActionElection(com.tools20022.repository.entity.CorporateActionElection corporateActionElection) {
		this.corporateActionElection = corporateActionElection;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public void setTaxVoucher(com.tools20022.repository.entity.TaxVoucher taxVoucher) {
		this.taxVoucher = taxVoucher;
	}

	public BuyIn getRelatedBuyIn() {
		return relatedBuyIn;
	}

	public void setRelatedBuyIn(com.tools20022.repository.entity.BuyIn relatedBuyIn) {
		this.relatedBuyIn = relatedBuyIn;
	}

	public SecuritiesOrder getPreviousDayOrder() {
		return previousDayOrder;
	}

	public void setPreviousDayOrder(com.tools20022.repository.entity.SecuritiesOrder previousDayOrder) {
		this.previousDayOrder = previousDayOrder;
	}

	public List<Liquidity> getLiquidity() {
		return liquidity;
	}

	public void setLiquidity(List<com.tools20022.repository.entity.Liquidity> liquidity) {
		this.liquidity = liquidity;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public List<SecuritiesOrderParameters> getMinimumQuantityOrderParameters() {
		return minimumQuantityOrderParameters;
	}

	public void setMinimumQuantityOrderParameters(List<com.tools20022.repository.entity.SecuritiesOrderParameters> minimumQuantityOrderParameters) {
		this.minimumQuantityOrderParameters = minimumQuantityOrderParameters;
	}

	public Quote getMaximumQuantityRelatedQuote() {
		return maximumQuantityRelatedQuote;
	}

	public void setMaximumQuantityRelatedQuote(com.tools20022.repository.entity.Quote maximumQuantityRelatedQuote) {
		this.maximumQuantityRelatedQuote = maximumQuantityRelatedQuote;
	}

	public SecuritiesBalance getUnavailableQuantityBalance() {
		return unavailableQuantityBalance;
	}

	public void setUnavailableQuantityBalance(com.tools20022.repository.entity.SecuritiesBalance unavailableQuantityBalance) {
		this.unavailableQuantityBalance = unavailableQuantityBalance;
	}

	public SecuritiesOrderParameters getMatchIncrementOrderParameters() {
		return matchIncrementOrderParameters;
	}

	public void setMatchIncrementOrderParameters(com.tools20022.repository.entity.SecuritiesOrderParameters matchIncrementOrderParameters) {
		this.matchIncrementOrderParameters = matchIncrementOrderParameters;
	}

	public Issuance getRelatedIssuance() {
		return relatedIssuance;
	}

	public void setRelatedIssuance(com.tools20022.repository.entity.Issuance relatedIssuance) {
		this.relatedIssuance = relatedIssuance;
	}

	public PairOff getPairoff() {
		return pairoff;
	}

	public void setPairoff(com.tools20022.repository.entity.PairOff pairoff) {
		this.pairoff = pairoff;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public void setIssuance(com.tools20022.repository.entity.Issuance issuance) {
		this.issuance = issuance;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingDenominatorDistributionInformation() {
		return intermediateToUnderlyingDenominatorDistributionInformation;
	}

	public void setIntermediateToUnderlyingDenominatorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution intermediateToUnderlyingDenominatorDistributionInformation) {
		this.intermediateToUnderlyingDenominatorDistributionInformation = intermediateToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMaximumHoldingDistributionInformation() {
		return maximumHoldingDistributionInformation;
	}

	public void setMaximumHoldingDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution maximumHoldingDistributionInformation) {
		this.maximumHoldingDistributionInformation = maximumHoldingDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMaximumExercisableQuantityDistributionInformation() {
		return maximumExercisableQuantityDistributionInformation;
	}

	public void setMaximumExercisableQuantityDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution maximumExercisableQuantityDistributionInformation) {
		this.maximumExercisableQuantityDistributionInformation = maximumExercisableQuantityDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMinimumExercisableQuantityDistributionInformation() {
		return minimumExercisableQuantityDistributionInformation;
	}

	public void setMinimumExercisableQuantityDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution minimumExercisableQuantityDistributionInformation) {
		this.minimumExercisableQuantityDistributionInformation = minimumExercisableQuantityDistributionInformation;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingDenominatorDistributionInformation() {
		return distributedToUnderlyingDenominatorDistributionInformation;
	}

	public void setDistributedToUnderlyingDenominatorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution distributedToUnderlyingDenominatorDistributionInformation) {
		this.distributedToUnderlyingDenominatorDistributionInformation = distributedToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingNumeratorDistributionInformation() {
		return intermediateToUnderlyingNumeratorDistributionInformation;
	}

	public void setIntermediateToUnderlyingNumeratorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution intermediateToUnderlyingNumeratorDistributionInformation) {
		this.intermediateToUnderlyingNumeratorDistributionInformation = intermediateToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMinimumHoldingDistributionInformation() {
		return minimumHoldingDistributionInformation;
	}

	public void setMinimumHoldingDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution minimumHoldingDistributionInformation) {
		this.minimumHoldingDistributionInformation = minimumHoldingDistributionInformation;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingNumeratorDistributionInformation() {
		return distributedToUnderlyingNumeratorDistributionInformation;
	}

	public void setDistributedToUnderlyingNumeratorDistributionInformation(com.tools20022.repository.entity.SecuritiesAndCashDistribution distributedToUnderlyingNumeratorDistributionInformation) {
		this.distributedToUnderlyingNumeratorDistributionInformation = distributedToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesDistribution getMaximumHoldingRelatedSecuritiesDistribution() {
		return maximumHoldingRelatedSecuritiesDistribution;
	}

	public void setMaximumHoldingRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution maximumHoldingRelatedSecuritiesDistribution) {
		this.maximumHoldingRelatedSecuritiesDistribution = maximumHoldingRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public void setIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = intermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public void setIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = intermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return distributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public void setDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution distributedToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.distributedToUnderlyingDenominatorRelatedSecuritiesDistribution = distributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return distributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public void setDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution distributedToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.distributedToUnderlyingNumeratorRelatedSecuritiesDistribution = distributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getMinimumHoldingRelatedSecuritiesDistribution() {
		return minimumHoldingRelatedSecuritiesDistribution;
	}

	public void setMinimumHoldingRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution minimumHoldingRelatedSecuritiesDistribution) {
		this.minimumHoldingRelatedSecuritiesDistribution = minimumHoldingRelatedSecuritiesDistribution;
	}

	public TradingMarket getMaximumTradedQuantityMarket() {
		return maximumTradedQuantityMarket;
	}

	public void setMaximumTradedQuantityMarket(com.tools20022.repository.entity.TradingMarket maximumTradedQuantityMarket) {
		this.maximumTradedQuantityMarket = maximumTradedQuantityMarket;
	}

	public Quote getQuantityRelatedQuote() {
		return quantityRelatedQuote;
	}

	public void setQuantityRelatedQuote(com.tools20022.repository.entity.Quote quantityRelatedQuote) {
		this.quantityRelatedQuote = quantityRelatedQuote;
	}

	public Quote getMinimumQuantityRelatedQuote() {
		return minimumQuantityRelatedQuote;
	}

	public void setMinimumQuantityRelatedQuote(com.tools20022.repository.entity.Quote minimumQuantityRelatedQuote) {
		this.minimumQuantityRelatedQuote = minimumQuantityRelatedQuote;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public SidePocket getSidePocket() {
		return sidePocket;
	}

	public void setSidePocket(com.tools20022.repository.entity.SidePocket sidePocket) {
		this.sidePocket = sidePocket;
	}

	public Netting getNetting() {
		return netting;
	}

	public void setNetting(com.tools20022.repository.entity.Netting netting) {
		this.netting = netting;
	}

	public SecuritiesOrderStatus getRelatedOrderStatus() {
		return relatedOrderStatus;
	}

	public void setRelatedOrderStatus(com.tools20022.repository.entity.SecuritiesOrderStatus relatedOrderStatus) {
		this.relatedOrderStatus = relatedOrderStatus;
	}

	public SecuritiesOrderStatus getSecuritiesOrderStatus() {
		return securitiesOrderStatus;
	}

	public void setSecuritiesOrderStatus(com.tools20022.repository.entity.SecuritiesOrderStatus securitiesOrderStatus) {
		this.securitiesOrderStatus = securitiesOrderStatus;
	}

	public SecuritiesSettlement getRelatedTurnaroundSettlement() {
		return relatedTurnaroundSettlement;
	}

	public void setRelatedTurnaroundSettlement(com.tools20022.repository.entity.SecuritiesSettlement relatedTurnaroundSettlement) {
		this.relatedTurnaroundSettlement = relatedTurnaroundSettlement;
	}

	public FundsCashFlow getRelatedCashFlow() {
		return relatedCashFlow;
	}

	public void setRelatedCashFlow(com.tools20022.repository.entity.FundsCashFlow relatedCashFlow) {
		this.relatedCashFlow = relatedCashFlow;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(com.tools20022.repository.entity.Position position) {
		this.position = position;
	}

	public BiddingConditions getMaximumQuantityBiddingConditions() {
		return maximumQuantityBiddingConditions;
	}

	public void setMaximumQuantityBiddingConditions(com.tools20022.repository.entity.BiddingConditions maximumQuantityBiddingConditions) {
		this.maximumQuantityBiddingConditions = maximumQuantityBiddingConditions;
	}

	public BiddingConditions getFrontEndOddLotBiddingConditions() {
		return frontEndOddLotBiddingConditions;
	}

	public void setFrontEndOddLotBiddingConditions(com.tools20022.repository.entity.BiddingConditions frontEndOddLotBiddingConditions) {
		this.frontEndOddLotBiddingConditions = frontEndOddLotBiddingConditions;
	}

	public BiddingConditions getMinimumQuantityBiddingConditions() {
		return minimumQuantityBiddingConditions;
	}

	public void setMinimumQuantityBiddingConditions(com.tools20022.repository.entity.BiddingConditions minimumQuantityBiddingConditions) {
		this.minimumQuantityBiddingConditions = minimumQuantityBiddingConditions;
	}
}