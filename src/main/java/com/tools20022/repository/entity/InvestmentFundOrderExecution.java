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
import com.tools20022.repository.codeset.BestExecutionCode;
import com.tools20022.repository.codeset.LateReportCode;
import com.tools20022.repository.codeset.SourceOfCashCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundOrderExecution"
 * src="doc-files/InvestmentFundOrderExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#UnitsNumber
 * InvestmentFundOrderExecution.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#NonStandardSettlementInformation
 * InvestmentFundOrderExecution.NonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#Order
 * InvestmentFundOrderExecution.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#DealIdentification
 * InvestmentFundOrderExecution.DealIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedTradePrice
 * InvestmentFundOrderExecution.ExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#PartiallyExecutedIndicator
 * InvestmentFundOrderExecution.PartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InterimProfitAmount
 * InvestmentFundOrderExecution.InterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InformativePrice
 * InvestmentFundOrderExecution.InformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#BestExecution
 * InvestmentFundOrderExecution.BestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#PartialSettlementOfUnits
 * InvestmentFundOrderExecution.PartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#PartialSettlementOfCash
 * InvestmentFundOrderExecution.PartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#LateReport
 * InvestmentFundOrderExecution.LateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#SettledIndicator
 * InvestmentFundOrderExecution.SettledIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#RegisteredIndicator
 * InvestmentFundOrderExecution.RegisteredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#ExecutedAmount
 * InvestmentFundOrderExecution.ExecutedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InvestmentFundTransaction
 * InvestmentFundOrderExecution.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#CashFlow
 * InvestmentFundOrderExecution.CashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#SourceOfCash
 * InvestmentFundOrderExecution.SourceOfCash}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToExecutedPrice
 * SecuritiesPricing.FundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToInformativePrice
 * SecuritiesPricing.FundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentFundOrderExecution
 * InvestmentFundOrder.InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderExecution
 * SecuritiesQuantity.RelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrderExecution
 * InvestmentFundTransaction.InvestmentFundOrderExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FundsCashFlow#RelatedOrder
 * FundsCashFlow.RelatedOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#TransactionDetails
 * InvestmentFundTransactionsByFund2.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#TransactionDetails
 * InvestmentFundTransactionsByFund3.TransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SubscriptionExecution
 * SubscriptionExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchExecution
 * SwitchExecution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
 * SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails1
 * ExpectedExecutionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2
 * ExpectedExecutionDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2
 * InvestmentFundOrderExecution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
 * InvestmentFundOrderExecution1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
 * ExpectedExecutionDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3
 * InvestmentFundOrderExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4
 * ExpectedExecutionDetails4}</li>
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
 * "InvestmentFundOrderExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
 * </li>
 * </ul>
 */
public class InvestmentFundOrderExecution extends SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of investment fund units subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedOrderExecution
	 * SecuritiesQuantity.RelatedOrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#EstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast2.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#PreviousEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast2.PreviousEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#EstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast4.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#PreviousTotalUnitsNumber
	 * EstimatedFundCashForecast4.PreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#EstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast1.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#PreviousEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast1.PreviousEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#EstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast3.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#PreviousTotalUnitsNumber
	 * EstimatedFundCashForecast3.PreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#UnitsNumber
	 * RedemptionExecution3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#UnitsNumber
	 * RedemptionExecution5.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#UnitsNumber
	 * RedemptionExecution4.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#UnitsNumber
	 * RedemptionExecution6.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#UnitsQuantity
	 * InvestmentFundTransaction2.UnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#UnitsQuantity
	 * InvestmentFundTransaction3.UnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#UnitsNumber
	 * SubscriptionExecution3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#UnitsNumber
	 * SubscriptionExecution5.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#UnitsNumber
	 * SubscriptionExecution4.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#UnitsNumber
	 * SubscriptionExecution6.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#UnitsNumber
	 * SwitchRedemptionLegExecution2.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#UnitsNumber
	 * SwitchSubscriptionLegExecution2.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#UnitsNumber
	 * SwitchRedemptionLegExecution3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#UnitsNumber
	 * SwitchSubscriptionLegExecution3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#UnitsNumber
	 * RedemptionExecution10.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice#UnitsNumber
	 * SidePocketUnitsOrAmountOrRate1Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#UnitsNumber
	 * SubscriptionExecution7.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#UnitsNumber
	 * RedemptionExecution12.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#UnitsNumber
	 * SubscriptionExecution9.UnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#Group1Number
	 * UnitsAndCash.Group1Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#Group2Number
	 * UnitsAndCash.Group2Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#TotalUnitsNumber
	 * Fund2.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#PreviousTotalUnitsNumber
	 * Fund2.PreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#EstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast6.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#PreviousTotalUnitsNumber
	 * EstimatedFundCashForecast6.PreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#EstimatedTotalUnitsNumber
	 * Fund1.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#PreviousTotalUnitsNumber
	 * Fund1.PreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#EstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast5.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#PreviousTotalUnitsNumber
	 * EstimatedFundCashForecast5.PreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#TotalUnitsFromUnitOrders
	 * FundBalance1.TotalUnitsFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#TotalUnitsFromCashOrders
	 * FundBalance1.TotalUnitsFromCashOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#UnitsQuantity
	 * InvestmentFundTransaction4.UnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#EstimatedTotalUnitsNumber
	 * Fund3.EstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#PreviousTotalUnitsNumber
	 * Fund3.PreviousTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#TotalUnitsNumber
	 * Fund4.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund4#PreviousTotalUnitsNumber
	 * Fund4.PreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#UnitsNumber
	 * SubscriptionExecution13.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#UnitsNumber
	 * SubscriptionExecution12.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#UnitsNumber
	 * RedemptionExecution16.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#UnitsNumber
	 * SwitchSubscriptionLegExecution4.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#UnitsNumber
	 * RedemptionExecution15.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#UnitsNumber
	 * SwitchRedemptionLegExecution4.UnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment fund units subscribed or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnitsNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EstimatedFundCashForecast2.EstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast2.PreviousEstimatedTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast4.EstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast4.PreviousTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.EstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast1.PreviousEstimatedTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast3.EstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast3.PreviousTotalUnitsNumber,
					com.tools20022.repository.msg.RedemptionExecution3.UnitsNumber, com.tools20022.repository.msg.RedemptionExecution5.UnitsNumber, com.tools20022.repository.msg.RedemptionExecution4.UnitsNumber,
					com.tools20022.repository.msg.RedemptionExecution6.UnitsNumber, com.tools20022.repository.msg.InvestmentFundTransaction2.UnitsQuantity, com.tools20022.repository.msg.InvestmentFundTransaction3.UnitsQuantity,
					com.tools20022.repository.msg.SubscriptionExecution3.UnitsNumber, com.tools20022.repository.msg.SubscriptionExecution5.UnitsNumber, com.tools20022.repository.msg.SubscriptionExecution4.UnitsNumber,
					com.tools20022.repository.msg.SubscriptionExecution6.UnitsNumber, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.UnitsNumber, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.UnitsNumber,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.UnitsNumber, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.UnitsNumber, com.tools20022.repository.msg.RedemptionExecution10.UnitsNumber,
					com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice.UnitsNumber, com.tools20022.repository.msg.SubscriptionExecution7.UnitsNumber, com.tools20022.repository.msg.RedemptionExecution12.UnitsNumber,
					com.tools20022.repository.msg.SubscriptionExecution9.UnitsNumber, com.tools20022.repository.msg.UnitsAndCash.Group1Number, com.tools20022.repository.msg.UnitsAndCash.Group2Number,
					com.tools20022.repository.msg.Fund2.TotalUnitsNumber, com.tools20022.repository.msg.Fund2.PreviousTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast6.EstimatedTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast6.PreviousTotalUnitsNumber, com.tools20022.repository.msg.Fund1.EstimatedTotalUnitsNumber, com.tools20022.repository.msg.Fund1.PreviousTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.EstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast5.PreviousTotalUnitsNumber,
					com.tools20022.repository.msg.FundBalance1.TotalUnitsFromUnitOrders, com.tools20022.repository.msg.FundBalance1.TotalUnitsFromCashOrders, com.tools20022.repository.msg.InvestmentFundTransaction4.UnitsQuantity,
					com.tools20022.repository.msg.Fund3.EstimatedTotalUnitsNumber, com.tools20022.repository.msg.Fund3.PreviousTotalUnitsNumber, com.tools20022.repository.msg.Fund4.TotalUnitsNumber,
					com.tools20022.repository.msg.Fund4.PreviousTotalUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution13.UnitsNumber, com.tools20022.repository.msg.SubscriptionExecution12.UnitsNumber,
					com.tools20022.repository.msg.RedemptionExecution16.UnitsNumber, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.UnitsNumber, com.tools20022.repository.msg.RedemptionExecution15.UnitsNumber,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.UnitsNumber);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed or redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#NonStandardSettlementInformation
	 * Transfer7.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#NonStandardSettlementInformation
	 * Transfer17.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#NonStandardSettlementInformation
	 * Transfer10.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#NonStandardSettlementInformation
	 * Transfer14.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#NonStandardSettlementInformation
	 * Transfer24.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#NonStandardSettlementInformation
	 * Transfer25.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#NonStandardSettlementInformation
	 * Transfer6.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#NonStandardSettlementInformation
	 * Transfer16.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#NonStandardSettlementInformation
	 * Transfer9.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer12#NonStandardSettlementInformation
	 * Transfer12.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#NonStandardSettlementInformation
	 * Transfer20.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#NonStandardSettlementInformation
	 * Transfer22.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#NonStandardSettlementInformation
	 * Transfer18.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#NonStandardSettlementInformation
	 * Transfer26.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#NonStandardSettlementInformation
	 * Transfer5.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#NonStandardSettlementInformation
	 * Transfer15.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#NonStandardSettlementInformation
	 * Transfer21.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#NonStandardSettlementInformation
	 * Transfer13.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#NonStandardSettlementInformation
	 * Transfer23.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#NonStandardSettlementInformation
	 * Transfer8.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#NonStandardSettlementInformation
	 * Transfer11.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#NonStandardSettlementInformation
	 * Transfer19.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#NonStandardSettlementInformation
	 * RedemptionOrder5.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#NonStandardSettlementInformation
	 * RedemptionExecution5.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#NonStandardSettlementInformation
	 * RedemptionOrder7.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#NonStandardSettlementInformation
	 * RedemptionOrder6.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#NonStandardSettlementInformation
	 * RedemptionExecution6.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#NonStandardSettlementInformation
	 * RedemptionOrder8.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#NonStandardSettlementInformation
	 * SubscriptionOrder5.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#NonStandardSettlementInformation
	 * SubscriptionExecution5.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#NonStandardSettlementInformation
	 * SubscriptionOrder7.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#NonStandardSettlementInformation
	 * SubscriptionOrder6.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#NonStandardSettlementInformation
	 * SubscriptionExecution6.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#NonStandardSettlementInformation
	 * SubscriptionOrder8.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#NonStandardSettlementInformation
	 * SwitchRedemptionLegOrder3.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#NonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder3.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#NonStandardSettlementInformation
	 * SwitchRedemptionLegExecution3.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#NonStandardSettlementInformation
	 * SwitchSubscriptionLegExecution3.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#NonStandardSettlementInformation
	 * Transfer27.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#NonStandardSettlementInformation
	 * Transfer28.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#NonStandardSettlementInformation
	 * Transfer29.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#NonStandardSettlementInformation
	 * Transfer31.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#NonStandardSettlementInformation
	 * Transfer30.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#NonStandardSettlementInformation
	 * Transfer32.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#NonStandardSettlementInformation
	 * Transfer33.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#NonStandardSettlementInformation
	 * RedemptionOrder14.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#NonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder6.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#NonStandardSettlementInformation
	 * SubscriptionExecution13.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#NonStandardSettlementInformation
	 * SubscriptionExecution12.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#NonStandardSettlementInformation
	 * SubscriptionOrder15.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#NonStandardSettlementInformation
	 * SwitchRedemptionLegOrder6.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#NonStandardSettlementInformation
	 * RedemptionOrder15.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#NonStandardSettlementInformation
	 * RedemptionExecution16.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#NonStandardSettlementInformation
	 * SubscriptionOrder14.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#NonStandardSettlementInformation
	 * SwitchSubscriptionLegExecution4.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#NonStandardSettlementInformation
	 * RedemptionExecution15.NonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#NonStandardSettlementInformation
	 * SwitchRedemptionLegExecution4.NonStandardSettlementInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NonStandardSettlementInformation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer7.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer17.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer10.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer14.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer24.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer25.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer6.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer16.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer9.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer12.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer20.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer22.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer18.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer26.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer5.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer15.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer21.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer13.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer23.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer8.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer11.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer19.NonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionOrder5.NonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionExecution5.NonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionOrder7.NonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder6.NonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionExecution6.NonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder8.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionOrder5.NonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionExecution5.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionOrder7.NonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder6.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionExecution6.NonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder8.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.NonStandardSettlementInformation, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.NonStandardSettlementInformation, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer27.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer28.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer29.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer31.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer30.NonStandardSettlementInformation, com.tools20022.repository.msg.Transfer32.NonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer33.NonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder14.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.NonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionExecution13.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionExecution12.NonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder15.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder6.NonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder15.NonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionExecution16.NonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder14.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.NonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionExecution15.NonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.NonStandardSettlementInformation);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Order which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentFundOrderExecution
	 * InvestmentFundOrder.InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#TotalUnitsNumber
	 * FundCashForecast1.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#TotalUnitsNumber
	 * FundCashForecast3.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#TotalUnitsNumber
	 * FundCashForecast2.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#TotalUnitsNumber
	 * FundCashForecast4.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#TotalUnitsNumber
	 * FundCashForecast7.TotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#TotalUnitsNumber
	 * FundCashForecast6.TotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecast1.TotalUnitsNumber, com.tools20022.repository.msg.FundCashForecast3.TotalUnitsNumber,
					com.tools20022.repository.msg.FundCashForecast2.TotalUnitsNumber, com.tools20022.repository.msg.FundCashForecast4.TotalUnitsNumber, com.tools20022.repository.msg.FundCashForecast7.TotalUnitsNumber,
					com.tools20022.repository.msg.FundCashForecast6.TotalUnitsNumber);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is executed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identifier for an order execution, as assigned by
	 * a confirming party.
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#DealReference
	 * SwitchOrderStatusAndReason1.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#DealReference
	 * RedemptionExecution3.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#DealReference
	 * RedemptionExecution5.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2#DealReference
	 * InvestmentFundOrderExecution2.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#DealReference
	 * RedemptionExecution4.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#DealReference
	 * RedemptionExecution6.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#DealReference
	 * InvestmentFundOrder3.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#DealReference
	 * InvestmentFundOrder2.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#DealReference
	 * InvestmentFundTransaction2.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#DealReference
	 * InvestmentFundTransaction3.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#DealReference
	 * SubscriptionExecution3.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#DealReference
	 * SubscriptionExecution5.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#DealReference
	 * SubscriptionExecution4.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#DealReference
	 * SubscriptionExecution6.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#DealReference
	 * SwitchExecution3.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#DealReference
	 * SwitchExecution4.DealReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LotDetails1#DealReference
	 * LotDetails1.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#DealReference
	 * RedemptionExecution10.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#DealReference
	 * SubscriptionExecution7.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#DealReference
	 * InvestmentFundOrderExecution3.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#DealReference
	 * RedemptionExecution12.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#DealReference
	 * SubscriptionExecution9.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#DealReference
	 * InvestmentFundTransaction4.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#DealReference
	 * InvestmentFundOrder11.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#DealReference
	 * SwitchExecution7.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#DealReference
	 * SwitchOrderStatusAndReason2.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#DealReference
	 * SubscriptionExecution13.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#DealReference
	 * SubscriptionExecution12.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#DealReference
	 * RedemptionExecution16.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#DealReference
	 * InvestmentFundOrder8.DealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#DealReference
	 * RedemptionExecution15.DealReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DealIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrderStatusAndReason1.DealReference, com.tools20022.repository.msg.RedemptionExecution3.DealReference,
					com.tools20022.repository.msg.RedemptionExecution5.DealReference, com.tools20022.repository.msg.InvestmentFundOrderExecution2.DealReference, com.tools20022.repository.msg.RedemptionExecution4.DealReference,
					com.tools20022.repository.msg.RedemptionExecution6.DealReference, com.tools20022.repository.msg.InvestmentFundOrder3.DealReference, com.tools20022.repository.msg.InvestmentFundOrder2.DealReference,
					com.tools20022.repository.msg.InvestmentFundTransaction2.DealReference, com.tools20022.repository.msg.InvestmentFundTransaction3.DealReference, com.tools20022.repository.msg.SubscriptionExecution3.DealReference,
					com.tools20022.repository.msg.SubscriptionExecution5.DealReference, com.tools20022.repository.msg.SubscriptionExecution4.DealReference, com.tools20022.repository.msg.SubscriptionExecution6.DealReference,
					com.tools20022.repository.msg.SwitchExecution3.DealReference, com.tools20022.repository.msg.SwitchExecution4.DealReference, com.tools20022.repository.msg.LotDetails1.DealReference,
					com.tools20022.repository.msg.RedemptionExecution10.DealReference, com.tools20022.repository.msg.SubscriptionExecution7.DealReference, com.tools20022.repository.msg.InvestmentFundOrderExecution3.DealReference,
					com.tools20022.repository.msg.RedemptionExecution12.DealReference, com.tools20022.repository.msg.SubscriptionExecution9.DealReference, com.tools20022.repository.msg.InvestmentFundTransaction4.DealReference,
					com.tools20022.repository.msg.InvestmentFundOrder11.DealReference, com.tools20022.repository.msg.SwitchExecution7.DealReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.DealReference,
					com.tools20022.repository.msg.SubscriptionExecution13.DealReference, com.tools20022.repository.msg.SubscriptionExecution12.DealReference, com.tools20022.repository.msg.RedemptionExecution16.DealReference,
					com.tools20022.repository.msg.InvestmentFundOrder8.DealReference, com.tools20022.repository.msg.RedemptionExecution15.DealReference);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealIdentification";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Price at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToExecutedPrice
	 * SecuritiesPricing.FundOrderRelatedToExecutedPrice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#PriceDetails
	 * RedemptionExecution3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#DealingPriceDetails
	 * RedemptionExecution5.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#PriceDetails
	 * RedemptionExecution4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#DealingPriceDetails
	 * RedemptionExecution6.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#PriceDetails
	 * InvestmentFundTransaction2.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#PriceDetails
	 * InvestmentFundTransaction3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#PriceDetails
	 * SubscriptionExecution3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#DealingPriceDetails
	 * SubscriptionExecution5.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#PriceDetails
	 * SubscriptionExecution4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#DealingPriceDetails
	 * SubscriptionExecution6.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#PriceDetails
	 * SwitchRedemptionLegExecution2.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#PriceDetails
	 * SwitchSubscriptionLegExecution2.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#PriceDetails
	 * SwitchRedemptionLegExecution3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#PriceDetails
	 * SwitchSubscriptionLegExecution3.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#DealingPriceDetails
	 * RedemptionExecution10.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#DealingPriceDetails
	 * SubscriptionExecution7.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#DealingPriceDetails
	 * RedemptionExecution12.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#DealingPriceDetails
	 * SubscriptionExecution9.DealingPriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7#Price
	 * FundCashForecast7.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#Price
	 * EstimatedFundCashForecast6.Price}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6#Price
	 * FundCashForecast6.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#Price
	 * EstimatedFundCashForecast5.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#PriceDetails
	 * InvestmentFundTransaction4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#DealingPriceDetails
	 * SubscriptionExecution13.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#DealingPriceDetails
	 * SubscriptionExecution12.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#DealingPriceDetails
	 * RedemptionExecution16.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#PriceDetails
	 * SwitchSubscriptionLegExecution4.PriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#DealingPriceDetails
	 * RedemptionExecution15.DealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#PriceDetails
	 * SwitchRedemptionLegExecution4.PriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExecutedTradePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution3.PriceDetails, com.tools20022.repository.msg.RedemptionExecution5.DealingPriceDetails,
					com.tools20022.repository.msg.RedemptionExecution4.PriceDetails, com.tools20022.repository.msg.RedemptionExecution6.DealingPriceDetails, com.tools20022.repository.msg.InvestmentFundTransaction2.PriceDetails,
					com.tools20022.repository.msg.InvestmentFundTransaction3.PriceDetails, com.tools20022.repository.msg.SubscriptionExecution3.PriceDetails, com.tools20022.repository.msg.SubscriptionExecution5.DealingPriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.PriceDetails, com.tools20022.repository.msg.SubscriptionExecution6.DealingPriceDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.PriceDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.PriceDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.PriceDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.PriceDetails, com.tools20022.repository.msg.RedemptionExecution10.DealingPriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution7.DealingPriceDetails, com.tools20022.repository.msg.RedemptionExecution12.DealingPriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution9.DealingPriceDetails, com.tools20022.repository.msg.FundCashForecast7.Price, com.tools20022.repository.msg.EstimatedFundCashForecast6.Price,
					com.tools20022.repository.msg.FundCashForecast6.Price, com.tools20022.repository.msg.EstimatedFundCashForecast5.Price, com.tools20022.repository.msg.InvestmentFundTransaction4.PriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.DealingPriceDetails, com.tools20022.repository.msg.SubscriptionExecution12.DealingPriceDetails,
					com.tools20022.repository.msg.RedemptionExecution16.DealingPriceDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.PriceDetails,
					com.tools20022.repository.msg.RedemptionExecution15.DealingPriceDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.PriceDetails);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Price at which the order was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the order has been partially executed, ie, the
	 * confirmed quantity does not match the ordered quantity for a given
	 * financial instrument.
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#PartiallyExecutedIndicator
	 * RedemptionExecution3.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#PartiallyExecutedIndicator
	 * RedemptionExecution5.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#PartiallyExecutedIndicator
	 * RedemptionExecution4.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#PartiallyExecutedIndicator
	 * RedemptionExecution6.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#PartiallyExecutedIndicator
	 * InvestmentFundTransaction2.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#PartiallyExecutedIndicator
	 * InvestmentFundTransaction3.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#PartiallyExecutedIndicator
	 * SubscriptionExecution3.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#PartiallyExecutedIndicator
	 * SubscriptionExecution5.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#PartiallyExecutedIndicator
	 * SubscriptionExecution4.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#PartiallyExecutedIndicator
	 * SubscriptionExecution6.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#PartiallyExecutedIndicator
	 * RedemptionExecution10.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#PartiallyExecutedIndicator
	 * SubscriptionExecution7.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#PartiallyExecutedIndicator
	 * RedemptionExecution12.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#PartiallyExecutedIndicator
	 * SubscriptionExecution9.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#PartiallyExecutedIndicator
	 * InvestmentFundTransaction4.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#PartiallyExecutedIndicator
	 * SubscriptionExecution13.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#PartiallyExecutedIndicator
	 * SubscriptionExecution12.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#PartiallyExecutedIndicator
	 * RedemptionExecution16.PartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#PartiallyExecutedIndicator
	 * RedemptionExecution15.PartiallyExecutedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartiallyExecutedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution3.PartiallyExecutedIndicator, com.tools20022.repository.msg.RedemptionExecution5.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution4.PartiallyExecutedIndicator, com.tools20022.repository.msg.RedemptionExecution6.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction2.PartiallyExecutedIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.SubscriptionExecution3.PartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution5.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.SubscriptionExecution4.PartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution6.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution10.PartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution7.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution12.PartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution9.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction4.PartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution13.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.SubscriptionExecution12.PartiallyExecutedIndicator, com.tools20022.repository.msg.RedemptionExecution16.PartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution15.PartiallyExecutedIndicator);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Part of the price deemed as accrued income or profit rather than capital.
	 * The interim profit amount is used for tax purposes.
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
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss1Choice#Profit
	 * ProfitAndLoss1Choice.Profit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss1Choice#Loss
	 * ProfitAndLoss1Choice.Loss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#InterimProfitAmount
	 * RedemptionExecution3.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#InterimProfitAmount
	 * RedemptionExecution5.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#InterimProfitAmount
	 * RedemptionExecution4.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#InterimProfitAmount
	 * RedemptionExecution6.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#InterimProfitAmount
	 * SubscriptionExecution3.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#InterimProfitAmount
	 * SubscriptionExecution5.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#InterimProfitAmount
	 * SubscriptionExecution4.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#InterimProfitAmount
	 * SubscriptionExecution6.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#InterimProfitAmount
	 * SwitchRedemptionLegExecution2.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#InterimProfitAmount
	 * SwitchSubscriptionLegExecution2.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#InterimProfitAmount
	 * SwitchRedemptionLegExecution3.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#InterimProfitAmount
	 * SwitchSubscriptionLegExecution3.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#InterimProfitAmount
	 * RedemptionExecution10.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#InterimProfitAmount
	 * SubscriptionExecution7.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#InterimProfitAmount
	 * SubscriptionExecution13.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#Profit
	 * ProfitAndLoss2Choice.Profit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#Loss
	 * ProfitAndLoss2Choice.Loss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#InterimProfitAmount
	 * SubscriptionExecution12.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#InterimProfitAmount
	 * RedemptionExecution16.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#InterimProfitAmount
	 * SwitchSubscriptionLegExecution4.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#InterimProfitAmount
	 * RedemptionExecution15.InterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#InterimProfitAmount
	 * SwitchRedemptionLegExecution4.InterimProfitAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterimProfitAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProfitAndLoss1Choice.Profit, com.tools20022.repository.choice.ProfitAndLoss1Choice.Loss,
					com.tools20022.repository.msg.RedemptionExecution3.InterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution5.InterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution4.InterimProfitAmount,
					com.tools20022.repository.msg.RedemptionExecution6.InterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution3.InterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution5.InterimProfitAmount,
					com.tools20022.repository.msg.SubscriptionExecution4.InterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution6.InterimProfitAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.InterimProfitAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.InterimProfitAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.InterimProfitAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.InterimProfitAmount,
					com.tools20022.repository.msg.RedemptionExecution10.InterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution7.InterimProfitAmount,
					com.tools20022.repository.msg.SubscriptionExecution13.InterimProfitAmount, com.tools20022.repository.choice.ProfitAndLoss2Choice.Profit, com.tools20022.repository.choice.ProfitAndLoss2Choice.Loss,
					com.tools20022.repository.msg.SubscriptionExecution12.InterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution16.InterimProfitAmount,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.InterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution15.InterimProfitAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.InterimProfitAmount);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Other quoted price than the one at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#FundOrderRelatedToInformativePrice
	 * SecuritiesPricing.FundOrderRelatedToInformativePrice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#InformativePriceDetails
	 * RedemptionExecution5.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#InformativePriceDetails
	 * RedemptionExecution6.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#InformativePriceDetails
	 * SubscriptionExecution5.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#InformativePriceDetails
	 * SubscriptionExecution6.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#InformativePriceDetails
	 * RedemptionExecution10.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#InformativePriceDetails
	 * SubscriptionExecution7.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#InformativePriceDetails
	 * SubscriptionExecution13.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#InformativePriceDetails
	 * SubscriptionExecution12.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#InformativePriceDetails
	 * RedemptionExecution16.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#InformativePriceDetails
	 * SwitchSubscriptionLegExecution4.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#InformativePriceDetails
	 * RedemptionExecution15.InformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#InformativePriceDetails
	 * SwitchRedemptionLegExecution4.InformativePriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other quoted price than the one at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InformativePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.InformativePriceDetails, com.tools20022.repository.msg.RedemptionExecution6.InformativePriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution5.InformativePriceDetails, com.tools20022.repository.msg.SubscriptionExecution6.InformativePriceDetails,
					com.tools20022.repository.msg.RedemptionExecution10.InformativePriceDetails, com.tools20022.repository.msg.SubscriptionExecution7.InformativePriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.InformativePriceDetails, com.tools20022.repository.msg.SubscriptionExecution12.InformativePriceDetails,
					com.tools20022.repository.msg.RedemptionExecution16.InformativePriceDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.InformativePriceDetails,
					com.tools20022.repository.msg.RedemptionExecution15.InformativePriceDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.InformativePriceDetails);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformativePrice";
			definition = "Other quoted price than the one at which the order was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that the execution was subject to best execution rules as
	 * defined by MiFID.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BestExecutionCode
	 * BestExecutionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#BestExecution
	 * RedemptionExecution5.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#BestExecution
	 * RedemptionExecution6.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#BestExecution
	 * SubscriptionExecution5.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#BestExecution
	 * SubscriptionExecution6.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#BestExecution
	 * SwitchExecution4.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#BestExecution
	 * SwitchExecution7.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#BestExecution
	 * SubscriptionExecution13.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#BestExecution
	 * SubscriptionExecution12.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#BestExecution
	 * RedemptionExecution16.BestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#BestExecution
	 * RedemptionExecution15.BestExecution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the execution was subject to best execution rules as defined by MiFID."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BestExecution = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.BestExecution, com.tools20022.repository.msg.RedemptionExecution6.BestExecution,
					com.tools20022.repository.msg.SubscriptionExecution5.BestExecution, com.tools20022.repository.msg.SubscriptionExecution6.BestExecution, com.tools20022.repository.msg.SwitchExecution4.BestExecution,
					com.tools20022.repository.msg.SwitchExecution7.BestExecution, com.tools20022.repository.msg.SubscriptionExecution13.BestExecution, com.tools20022.repository.msg.SubscriptionExecution12.BestExecution,
					com.tools20022.repository.msg.RedemptionExecution16.BestExecution, com.tools20022.repository.msg.RedemptionExecution15.BestExecution);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BestExecutionCode.mmObject();
		}
	};
	/**
	 * Percentage of units partially settled.
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#PartialSettlementOfUnits
	 * RedemptionExecution5.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#PartialSettlementOfUnits
	 * RedemptionExecution6.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#PartialSettlementOfUnits
	 * SubscriptionExecution5.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#PartialSettlementOfUnits
	 * SubscriptionExecution6.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#PartialSettlementOfUnits
	 * RedemptionExecution10.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#PartialSettlementOfUnits
	 * SubscriptionExecution7.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#PartialSettlementOfUnits
	 * SubscriptionExecution13.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#PartialSettlementOfUnits
	 * SubscriptionExecution12.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#PartialSettlementOfUnits
	 * RedemptionExecution16.PartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#PartialSettlementOfUnits
	 * RedemptionExecution15.PartialSettlementOfUnits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of units partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementOfUnits = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.PartialSettlementOfUnits, com.tools20022.repository.msg.RedemptionExecution6.PartialSettlementOfUnits,
					com.tools20022.repository.msg.SubscriptionExecution5.PartialSettlementOfUnits, com.tools20022.repository.msg.SubscriptionExecution6.PartialSettlementOfUnits,
					com.tools20022.repository.msg.RedemptionExecution10.PartialSettlementOfUnits, com.tools20022.repository.msg.SubscriptionExecution7.PartialSettlementOfUnits,
					com.tools20022.repository.msg.SubscriptionExecution13.PartialSettlementOfUnits, com.tools20022.repository.msg.SubscriptionExecution12.PartialSettlementOfUnits,
					com.tools20022.repository.msg.RedemptionExecution16.PartialSettlementOfUnits, com.tools20022.repository.msg.RedemptionExecution15.PartialSettlementOfUnits);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Percentage of cash partially settled.
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#PartialSettlementOfCash
	 * RedemptionExecution5.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#PartialSettlementOfCash
	 * RedemptionExecution6.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#PartialSettlementOfCash
	 * SubscriptionExecution5.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#PartialSettlementOfCash
	 * SubscriptionExecution6.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#PartialSettlementOfCash
	 * RedemptionExecution10.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#PartialSettlementOfCash
	 * SubscriptionExecution7.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#PartialSettlementOfCash
	 * SubscriptionExecution13.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#PartialSettlementOfCash
	 * SubscriptionExecution12.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#PartialSettlementOfCash
	 * RedemptionExecution16.PartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#PartialSettlementOfCash
	 * RedemptionExecution15.PartialSettlementOfCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of cash partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementOfCash = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.PartialSettlementOfCash, com.tools20022.repository.msg.RedemptionExecution6.PartialSettlementOfCash,
					com.tools20022.repository.msg.SubscriptionExecution5.PartialSettlementOfCash, com.tools20022.repository.msg.SubscriptionExecution6.PartialSettlementOfCash,
					com.tools20022.repository.msg.RedemptionExecution10.PartialSettlementOfCash, com.tools20022.repository.msg.SubscriptionExecution7.PartialSettlementOfCash,
					com.tools20022.repository.msg.SubscriptionExecution13.PartialSettlementOfCash, com.tools20022.repository.msg.SubscriptionExecution12.PartialSettlementOfCash,
					com.tools20022.repository.msg.RedemptionExecution16.PartialSettlementOfCash, com.tools20022.repository.msg.RedemptionExecution15.PartialSettlementOfCash);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies whether the order execution confirmation is late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LateReportCode
	 * LateReportCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#LateReport
	 * RedemptionExecution5.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#LateReport
	 * RedemptionExecution6.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#LateReport
	 * SubscriptionExecution5.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#LateReport
	 * SubscriptionExecution6.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#LateReport
	 * SwitchExecution4.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#LateReport
	 * SwitchExecution7.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#LateReport
	 * SubscriptionExecution13.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#LateReport
	 * SubscriptionExecution12.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#LateReport
	 * RedemptionExecution16.LateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#LateReport
	 * RedemptionExecution15.LateReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the order execution confirmation is late."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LateReport = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.LateReport, com.tools20022.repository.msg.RedemptionExecution6.LateReport,
					com.tools20022.repository.msg.SubscriptionExecution5.LateReport, com.tools20022.repository.msg.SubscriptionExecution6.LateReport, com.tools20022.repository.msg.SwitchExecution4.LateReport,
					com.tools20022.repository.msg.SwitchExecution7.LateReport, com.tools20022.repository.msg.SubscriptionExecution13.LateReport, com.tools20022.repository.msg.SubscriptionExecution12.LateReport,
					com.tools20022.repository.msg.RedemptionExecution16.LateReport, com.tools20022.repository.msg.RedemptionExecution15.LateReport);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LateReportCode.mmObject();
		}
	};
	/**
	 * Indicates whether the cash payment with respect to the executed order is
	 * settled.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#SettledTransactionIndicator
	 * InvestmentFundTransaction2.SettledTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#SettledTransactionIndicator
	 * InvestmentFundTransaction3.SettledTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#SettledTransactionIndicator
	 * InvestmentFundTransaction4.SettledTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash payment with respect to the executed order is settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettledIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction2.SettledTransactionIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.SettledTransactionIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction4.SettledTransactionIndicator);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the executed order has a registered status on the books
	 * of the transfer agent.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#RegisteredTransactionIndicator
	 * InvestmentFundTransaction2.RegisteredTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#RegisteredTransactionIndicator
	 * InvestmentFundTransaction3.RegisteredTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#RegisteredTransactionIndicator
	 * InvestmentFundTransaction4.RegisteredTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the executed order has a registered status on the books of the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegisteredIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction2.RegisteredTransactionIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.RegisteredTransactionIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction4.RegisteredTransactionIndicator);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money invested or redeemed as a result of an investment fund
	 * order.
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#ExecutedAmount
	 * RedemptionExecution10.ExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#ExecutedAmount
	 * SubscriptionExecution7.ExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#ExecutedAmount
	 * FinancialInstrumentQuantity2.ExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#ExecutedAmount
	 * FinancialInstrumentQuantity3.ExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#TotalCashFromUnitOrders
	 * FundBalance1.TotalCashFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#TotalCashFromCashOrders
	 * FundBalance1.TotalCashFromCashOrders}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money invested or redeemed as a result of an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExecutedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution10.ExecutedAmount, com.tools20022.repository.msg.SubscriptionExecution7.ExecutedAmount,
					com.tools20022.repository.msg.FinancialInstrumentQuantity2.ExecutedAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity3.ExecutedAmount, com.tools20022.repository.msg.FundBalance1.TotalCashFromUnitOrders,
					com.tools20022.repository.msg.FundBalance1.TotalCashFromCashOrders);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedAmount";
			definition = "Amount of money invested or redeemed as a result of an investment fund order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Transaction which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrderExecution
	 * InvestmentFundTransaction.InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#FinancialInstrumentDetails
	 * SwitchRedemptionLegExecution2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#FinancialInstrumentDetails
	 * SwitchRedemptionLegExecution3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#OrderExecutionDetails
	 * InvestmentFundOrderExecution3.OrderExecutionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#FinancialInstrumentDetails
	 * SwitchRedemptionLegExecution4.FinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchRedemptionLegExecution2.FinancialInstrumentDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentFundOrderExecution3.OrderExecutionDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.FinancialInstrumentDetails);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is executed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the cash flow resulting from the execution of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#RelatedOrder
	 * FundsCashFlow.RelatedOrder}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash flow resulting from the execution of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFlow";
			definition = "Specifies the cash flow resulting from the execution of an order.";
			minOccurs = 0;
			type_lazy = () -> FundsCashFlow.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Source of cash used for the settlement of the execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#SourceOfCash
	 * SubscriptionExecution13.SourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#SourceOfCash
	 * SubscriptionExecution12.SourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#SourceOfCash
	 * SubscriptionOrder15.SourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#SourceOfCash
	 * SubscriptionOrder14.SourceOfCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of cash used for the settlement of the execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SourceOfCash = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionExecution13.SourceOfCash, com.tools20022.repository.msg.SubscriptionExecution12.SourceOfCash,
					com.tools20022.repository.msg.SubscriptionOrder15.SourceOfCash, com.tools20022.repository.msg.SubscriptionOrder14.SourceOfCash);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfCash";
			definition = "Source of cash used for the settlement of the execution.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SourceOfCashCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrderExecution";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution, com.tools20022.repository.entity.FundsCashFlow.RelatedOrder);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.TransactionDetails, com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.TransactionDetails);
				subType_lazy = () -> Arrays.asList(SubscriptionExecution.mmObject(), RedemptionExecution.mmObject(), SwitchExecution.mmObject());
				superType_lazy = () -> SecuritiesTradeExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber, com.tools20022.repository.entity.InvestmentFundOrderExecution.NonStandardSettlementInformation,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.Order, com.tools20022.repository.entity.InvestmentFundOrderExecution.DealIdentification,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.PartiallyExecutedIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InterimProfitAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.BestExecution, com.tools20022.repository.entity.InvestmentFundOrderExecution.PartialSettlementOfUnits,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.PartialSettlementOfCash, com.tools20022.repository.entity.InvestmentFundOrderExecution.LateReport,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.SettledIndicator, com.tools20022.repository.entity.InvestmentFundOrderExecution.RegisteredIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.CashFlow, com.tools20022.repository.entity.InvestmentFundOrderExecution.SourceOfCash);
				derivationComponent_lazy = () -> Arrays.asList(ExpectedExecutionDetails1.mmObject(), ExpectedExecutionDetails2.mmObject(), InvestmentFundOrderExecution2.mmObject(), InvestmentFundOrderExecution1.mmObject(),
						ExpectedExecutionDetails3.mmObject(), InvestmentFundOrderExecution3.mmObject(), UnitsAndCash.mmObject(), ExpectedExecutionDetails4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}