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
import com.tools20022.repository.choice.ProfitAndLoss1Choice;
import com.tools20022.repository.choice.ProfitAndLoss2Choice;
import com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice;
import com.tools20022.repository.codeset.BestExecutionCode;
import com.tools20022.repository.codeset.LateReportCode;
import com.tools20022.repository.codeset.SourceOfCashCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
 * SecuritiesTradeExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
 * InvestmentFundOrderExecution.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
 * InvestmentFundOrderExecution.mmDealIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartiallyExecutedIndicator
 * InvestmentFundOrderExecution.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInterimProfitAmount
 * InvestmentFundOrderExecution.mmInterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
 * InvestmentFundOrderExecution.mmInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmBestExecution
 * InvestmentFundOrderExecution.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfUnits
 * InvestmentFundOrderExecution.mmPartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfCash
 * InvestmentFundOrderExecution.mmPartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmLateReport
 * InvestmentFundOrderExecution.mmLateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSettledIndicator
 * InvestmentFundOrderExecution.mmSettledIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmRegisteredIndicator
 * InvestmentFundOrderExecution.mmRegisteredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedAmount
 * InvestmentFundOrderExecution.mmExecutedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
 * InvestmentFundOrderExecution.mmCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSourceOfCash
 * InvestmentFundOrderExecution.mmSourceOfCash}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
 * FundsCashFlow.mmRelatedOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmTransactionDetails
 * InvestmentFundTransactionsByFund2.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmTransactionDetails
 * InvestmentFundTransactionsByFund3.mmTransactionDetails}</li>
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
	protected SecuritiesQuantity unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
	 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast2.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmPreviousEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast2.mmPreviousEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast4.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast4.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast1.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmPreviousEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast1.mmPreviousEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast3.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast3.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmUnitsNumber
	 * RedemptionExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmUnitsNumber
	 * RedemptionExecution5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmUnitsNumber
	 * RedemptionExecution4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmUnitsNumber
	 * RedemptionExecution6.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmUnitsQuantity
	 * InvestmentFundTransaction2.mmUnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmUnitsQuantity
	 * InvestmentFundTransaction3.mmUnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmUnitsNumber
	 * SubscriptionExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmUnitsNumber
	 * SubscriptionExecution5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmUnitsNumber
	 * SubscriptionExecution4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmUnitsNumber
	 * SubscriptionExecution6.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmUnitsNumber
	 * SwitchRedemptionLegExecution2.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmUnitsNumber
	 * SwitchSubscriptionLegExecution2.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmUnitsNumber
	 * SwitchRedemptionLegExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmUnitsNumber
	 * SwitchSubscriptionLegExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmUnitsNumber
	 * RedemptionExecution10.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice#mmUnitsNumber
	 * SidePocketUnitsOrAmountOrRate1Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmUnitsNumber
	 * SubscriptionExecution7.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmUnitsNumber
	 * RedemptionExecution12.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmUnitsNumber
	 * SubscriptionExecution9.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup1Number
	 * UnitsAndCash.mmGroup1Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup2Number
	 * UnitsAndCash.mmGroup2Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmTotalUnitsNumber
	 * Fund2.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#mmPreviousTotalUnitsNumber
	 * Fund2.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalUnitsNumber
	 * Fund1.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalUnitsNumber
	 * Fund1.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromUnitOrders
	 * FundBalance1.mmTotalUnitsFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromCashOrders
	 * FundBalance1.mmTotalUnitsFromCashOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmUnitsQuantity
	 * InvestmentFundTransaction4.mmUnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalUnitsNumber
	 * Fund3.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalUnitsNumber
	 * Fund3.mmPreviousTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmTotalUnitsNumber
	 * Fund4.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund4#mmPreviousTotalUnitsNumber
	 * Fund4.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmUnitsNumber
	 * SubscriptionExecution13.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmUnitsNumber
	 * SubscriptionExecution12.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmUnitsNumber
	 * RedemptionExecution16.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmUnitsNumber
	 * SwitchSubscriptionLegExecution4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmUnitsNumber
	 * RedemptionExecution15.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmUnitsNumber
	 * SwitchRedemptionLegExecution4.mmUnitsNumber}</li>
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
	public static final MMBusinessAssociationEnd<InvestmentFundOrderExecution, SecuritiesQuantity> mmUnitsNumber = new MMBusinessAssociationEnd<InvestmentFundOrderExecution, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(EstimatedFundCashForecast2.mmEstimatedTotalUnitsNumber, EstimatedFundCashForecast2.mmPreviousEstimatedTotalUnitsNumber, EstimatedFundCashForecast4.mmEstimatedTotalUnitsNumber,
					EstimatedFundCashForecast4.mmPreviousTotalUnitsNumber, EstimatedFundCashForecast1.mmEstimatedTotalUnitsNumber, EstimatedFundCashForecast1.mmPreviousEstimatedTotalUnitsNumber,
					EstimatedFundCashForecast3.mmEstimatedTotalUnitsNumber, EstimatedFundCashForecast3.mmPreviousTotalUnitsNumber, RedemptionExecution3.mmUnitsNumber, RedemptionExecution5.mmUnitsNumber, RedemptionExecution4.mmUnitsNumber,
					RedemptionExecution6.mmUnitsNumber, InvestmentFundTransaction2.mmUnitsQuantity, InvestmentFundTransaction3.mmUnitsQuantity, SubscriptionExecution3.mmUnitsNumber, SubscriptionExecution5.mmUnitsNumber,
					SubscriptionExecution4.mmUnitsNumber, SubscriptionExecution6.mmUnitsNumber, SwitchRedemptionLegExecution2.mmUnitsNumber, SwitchSubscriptionLegExecution2.mmUnitsNumber, SwitchRedemptionLegExecution3.mmUnitsNumber,
					SwitchSubscriptionLegExecution3.mmUnitsNumber, RedemptionExecution10.mmUnitsNumber, SidePocketUnitsOrAmountOrRate1Choice.mmUnitsNumber, SubscriptionExecution7.mmUnitsNumber, RedemptionExecution12.mmUnitsNumber,
					SubscriptionExecution9.mmUnitsNumber, UnitsAndCash.mmGroup1Number, UnitsAndCash.mmGroup2Number, Fund2.mmTotalUnitsNumber, Fund2.mmPreviousTotalUnitsNumber, EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber,
					EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber, Fund1.mmEstimatedTotalUnitsNumber, Fund1.mmPreviousTotalUnitsNumber, EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber,
					EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber, FundBalance1.mmTotalUnitsFromUnitOrders, FundBalance1.mmTotalUnitsFromCashOrders, InvestmentFundTransaction4.mmUnitsQuantity, Fund3.mmEstimatedTotalUnitsNumber,
					Fund3.mmPreviousTotalUnitsNumber, Fund4.mmTotalUnitsNumber, Fund4.mmPreviousTotalUnitsNumber, SubscriptionExecution13.mmUnitsNumber, SubscriptionExecution12.mmUnitsNumber, RedemptionExecution16.mmUnitsNumber,
					SwitchSubscriptionLegExecution4.mmUnitsNumber, RedemptionExecution15.mmUnitsNumber, SwitchRedemptionLegExecution4.mmUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRelatedOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(InvestmentFundOrderExecution obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, SecuritiesQuantity value) {
			obj.setUnitsNumber(value);
		}
	};
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmNonStandardSettlementInformation
	 * Transfer7.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#mmNonStandardSettlementInformation
	 * Transfer17.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmNonStandardSettlementInformation
	 * Transfer10.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#mmNonStandardSettlementInformation
	 * Transfer14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmNonStandardSettlementInformation
	 * Transfer24.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmNonStandardSettlementInformation
	 * Transfer25.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#mmNonStandardSettlementInformation
	 * Transfer6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#mmNonStandardSettlementInformation
	 * Transfer16.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmNonStandardSettlementInformation
	 * Transfer9.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer12#mmNonStandardSettlementInformation
	 * Transfer12.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#mmNonStandardSettlementInformation
	 * Transfer20.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#mmNonStandardSettlementInformation
	 * Transfer22.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmNonStandardSettlementInformation
	 * Transfer18.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmNonStandardSettlementInformation
	 * Transfer26.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#mmNonStandardSettlementInformation
	 * Transfer5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmNonStandardSettlementInformation
	 * Transfer15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmNonStandardSettlementInformation
	 * Transfer21.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmNonStandardSettlementInformation
	 * Transfer13.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmNonStandardSettlementInformation
	 * Transfer23.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmNonStandardSettlementInformation
	 * Transfer8.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmNonStandardSettlementInformation
	 * Transfer11.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmNonStandardSettlementInformation
	 * Transfer19.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmNonStandardSettlementInformation
	 * RedemptionOrder5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmNonStandardSettlementInformation
	 * RedemptionExecution5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmNonStandardSettlementInformation
	 * RedemptionOrder7.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmNonStandardSettlementInformation
	 * RedemptionOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmNonStandardSettlementInformation
	 * RedemptionExecution6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmNonStandardSettlementInformation
	 * RedemptionOrder8.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNonStandardSettlementInformation
	 * SubscriptionOrder5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmNonStandardSettlementInformation
	 * SubscriptionExecution5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmNonStandardSettlementInformation
	 * SubscriptionOrder7.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmNonStandardSettlementInformation
	 * SubscriptionOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmNonStandardSettlementInformation
	 * SubscriptionExecution6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmNonStandardSettlementInformation
	 * SubscriptionOrder8.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegOrder3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegExecution3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegExecution3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmNonStandardSettlementInformation
	 * Transfer27.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmNonStandardSettlementInformation
	 * Transfer28.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmNonStandardSettlementInformation
	 * Transfer29.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmNonStandardSettlementInformation
	 * Transfer31.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmNonStandardSettlementInformation
	 * Transfer30.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmNonStandardSettlementInformation
	 * Transfer32.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmNonStandardSettlementInformation
	 * Transfer33.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmNonStandardSettlementInformation
	 * RedemptionOrder14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNonStandardSettlementInformation
	 * SubscriptionExecution13.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmNonStandardSettlementInformation
	 * SubscriptionExecution12.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmNonStandardSettlementInformation
	 * SubscriptionOrder15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmNonStandardSettlementInformation
	 * RedemptionOrder15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNonStandardSettlementInformation
	 * RedemptionExecution16.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmNonStandardSettlementInformation
	 * SubscriptionOrder14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegExecution4.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNonStandardSettlementInformation
	 * RedemptionExecution15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegExecution4.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmNonStandardSettlementInformation
	 * Transfer35.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmNonStandardSettlementInformation
	 * Transfer34.mmNonStandardSettlementInformation}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, Max350Text> mmNonStandardSettlementInformation = new MMBusinessAttribute<InvestmentFundOrderExecution, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer7.mmNonStandardSettlementInformation, Transfer17.mmNonStandardSettlementInformation, Transfer10.mmNonStandardSettlementInformation, Transfer14.mmNonStandardSettlementInformation,
					Transfer24.mmNonStandardSettlementInformation, Transfer25.mmNonStandardSettlementInformation, Transfer6.mmNonStandardSettlementInformation, Transfer16.mmNonStandardSettlementInformation,
					Transfer9.mmNonStandardSettlementInformation, Transfer12.mmNonStandardSettlementInformation, Transfer20.mmNonStandardSettlementInformation, Transfer22.mmNonStandardSettlementInformation,
					Transfer18.mmNonStandardSettlementInformation, Transfer26.mmNonStandardSettlementInformation, Transfer5.mmNonStandardSettlementInformation, Transfer15.mmNonStandardSettlementInformation,
					Transfer21.mmNonStandardSettlementInformation, Transfer13.mmNonStandardSettlementInformation, Transfer23.mmNonStandardSettlementInformation, Transfer8.mmNonStandardSettlementInformation,
					Transfer11.mmNonStandardSettlementInformation, Transfer19.mmNonStandardSettlementInformation, RedemptionOrder5.mmNonStandardSettlementInformation, RedemptionExecution5.mmNonStandardSettlementInformation,
					RedemptionOrder7.mmNonStandardSettlementInformation, RedemptionOrder6.mmNonStandardSettlementInformation, RedemptionExecution6.mmNonStandardSettlementInformation, RedemptionOrder8.mmNonStandardSettlementInformation,
					SubscriptionOrder5.mmNonStandardSettlementInformation, SubscriptionExecution5.mmNonStandardSettlementInformation, SubscriptionOrder7.mmNonStandardSettlementInformation,
					SubscriptionOrder6.mmNonStandardSettlementInformation, SubscriptionExecution6.mmNonStandardSettlementInformation, SubscriptionOrder8.mmNonStandardSettlementInformation,
					SwitchRedemptionLegOrder3.mmNonStandardSettlementInformation, SwitchSubscriptionLegOrder3.mmNonStandardSettlementInformation, SwitchRedemptionLegExecution3.mmNonStandardSettlementInformation,
					SwitchSubscriptionLegExecution3.mmNonStandardSettlementInformation, Transfer27.mmNonStandardSettlementInformation, Transfer28.mmNonStandardSettlementInformation, Transfer29.mmNonStandardSettlementInformation,
					Transfer31.mmNonStandardSettlementInformation, Transfer30.mmNonStandardSettlementInformation, Transfer32.mmNonStandardSettlementInformation, Transfer33.mmNonStandardSettlementInformation,
					RedemptionOrder14.mmNonStandardSettlementInformation, SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation, SubscriptionExecution13.mmNonStandardSettlementInformation,
					SubscriptionExecution12.mmNonStandardSettlementInformation, SubscriptionOrder15.mmNonStandardSettlementInformation, SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation,
					RedemptionOrder15.mmNonStandardSettlementInformation, RedemptionExecution16.mmNonStandardSettlementInformation, SubscriptionOrder14.mmNonStandardSettlementInformation,
					SwitchSubscriptionLegExecution4.mmNonStandardSettlementInformation, RedemptionExecution15.mmNonStandardSettlementInformation, SwitchRedemptionLegExecution4.mmNonStandardSettlementInformation,
					Transfer35.mmNonStandardSettlementInformation, Transfer34.mmNonStandardSettlementInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(InvestmentFundOrderExecution obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, Max350Text value) {
			obj.setNonStandardSettlementInformation(value);
		}
	};
	protected InvestmentFundOrder order;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmTotalUnitsNumber
	 * FundCashForecast1.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTotalUnitsNumber
	 * FundCashForecast3.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmTotalUnitsNumber
	 * FundCashForecast2.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTotalUnitsNumber
	 * FundCashForecast4.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalUnitsNumber
	 * FundCashForecast7.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalUnitsNumber
	 * FundCashForecast6.mmTotalUnitsNumber}</li>
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
	public static final MMBusinessAssociationEnd<InvestmentFundOrderExecution, Optional<InvestmentFundOrder>> mmOrder = new MMBusinessAssociationEnd<InvestmentFundOrderExecution, Optional<InvestmentFundOrder>>() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashForecast1.mmTotalUnitsNumber, FundCashForecast3.mmTotalUnitsNumber, FundCashForecast2.mmTotalUnitsNumber, FundCashForecast4.mmTotalUnitsNumber, FundCashForecast7.mmTotalUnitsNumber,
					FundCashForecast6.mmTotalUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InvestmentFundOrder.mmInvestmentFundOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrder.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrder> getValue(InvestmentFundOrderExecution obj) {
			return obj.getOrder();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, Optional<InvestmentFundOrder> value) {
			obj.setOrder(value.orElse(null));
		}
	};
	protected Max35Text dealIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmDealReference
	 * SwitchOrderStatusAndReason1.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmDealReference
	 * RedemptionExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmDealReference
	 * RedemptionExecution5.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2#mmDealReference
	 * InvestmentFundOrderExecution2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmDealReference
	 * RedemptionExecution4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmDealReference
	 * RedemptionExecution6.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#mmDealReference
	 * InvestmentFundOrder3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmDealReference
	 * InvestmentFundOrder2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmDealReference
	 * InvestmentFundTransaction2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmDealReference
	 * InvestmentFundTransaction3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmDealReference
	 * SubscriptionExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmDealReference
	 * SubscriptionExecution5.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmDealReference
	 * SubscriptionExecution4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmDealReference
	 * SubscriptionExecution6.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmDealReference
	 * SwitchExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmDealReference
	 * SwitchExecution4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LotDetails1#mmDealReference
	 * LotDetails1.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmDealReference
	 * RedemptionExecution10.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmDealReference
	 * SubscriptionExecution7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmDealReference
	 * InvestmentFundOrderExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmDealReference
	 * RedemptionExecution12.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmDealReference
	 * SubscriptionExecution9.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmDealReference
	 * InvestmentFundTransaction4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmDealReference
	 * InvestmentFundOrder11.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmDealReference
	 * SwitchExecution7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmDealReference
	 * SwitchOrderStatusAndReason2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealReference
	 * SubscriptionExecution13.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmDealReference
	 * SubscriptionExecution12.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealReference
	 * RedemptionExecution16.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmDealReference
	 * InvestmentFundOrder8.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealReference
	 * RedemptionExecution15.mmDealReference}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, Max35Text> mmDealIdentification = new MMBusinessAttribute<InvestmentFundOrderExecution, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason1.mmDealReference, RedemptionExecution3.mmDealReference, RedemptionExecution5.mmDealReference, InvestmentFundOrderExecution2.mmDealReference,
					RedemptionExecution4.mmDealReference, RedemptionExecution6.mmDealReference, InvestmentFundOrder3.mmDealReference, InvestmentFundOrder2.mmDealReference, InvestmentFundTransaction2.mmDealReference,
					InvestmentFundTransaction3.mmDealReference, SubscriptionExecution3.mmDealReference, SubscriptionExecution5.mmDealReference, SubscriptionExecution4.mmDealReference, SubscriptionExecution6.mmDealReference,
					SwitchExecution3.mmDealReference, SwitchExecution4.mmDealReference, LotDetails1.mmDealReference, RedemptionExecution10.mmDealReference, SubscriptionExecution7.mmDealReference,
					InvestmentFundOrderExecution3.mmDealReference, RedemptionExecution12.mmDealReference, SubscriptionExecution9.mmDealReference, InvestmentFundTransaction4.mmDealReference, InvestmentFundOrder11.mmDealReference,
					SwitchExecution7.mmDealReference, SwitchOrderStatusAndReason2.mmDealReference, SubscriptionExecution13.mmDealReference, SubscriptionExecution12.mmDealReference, RedemptionExecution16.mmDealReference,
					InvestmentFundOrder8.mmDealReference, RedemptionExecution15.mmDealReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealIdentification";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvestmentFundOrderExecution obj) {
			return obj.getDealIdentification();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, Max35Text value) {
			obj.setDealIdentification(value);
		}
	};
	protected SecuritiesPricing executedTradePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
	 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmPriceDetails
	 * RedemptionExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmDealingPriceDetails
	 * RedemptionExecution5.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmPriceDetails
	 * RedemptionExecution4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmDealingPriceDetails
	 * RedemptionExecution6.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmPriceDetails
	 * InvestmentFundTransaction2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPriceDetails
	 * InvestmentFundTransaction3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmPriceDetails
	 * SubscriptionExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmDealingPriceDetails
	 * SubscriptionExecution5.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmPriceDetails
	 * SubscriptionExecution4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmDealingPriceDetails
	 * SubscriptionExecution6.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmPriceDetails
	 * SwitchRedemptionLegExecution2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmPriceDetails
	 * SwitchSubscriptionLegExecution2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmPriceDetails
	 * SwitchRedemptionLegExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmPriceDetails
	 * SwitchSubscriptionLegExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmDealingPriceDetails
	 * RedemptionExecution10.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmDealingPriceDetails
	 * SubscriptionExecution7.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmDealingPriceDetails
	 * RedemptionExecution12.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmDealingPriceDetails
	 * SubscriptionExecution9.mmDealingPriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPrice
	 * FundCashForecast7.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPrice
	 * EstimatedFundCashForecast6.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPrice
	 * FundCashForecast6.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPrice
	 * EstimatedFundCashForecast5.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPriceDetails
	 * InvestmentFundTransaction4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealingPriceDetails
	 * SubscriptionExecution13.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmDealingPriceDetails
	 * SubscriptionExecution12.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealingPriceDetails
	 * RedemptionExecution16.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmPriceDetails
	 * SwitchSubscriptionLegExecution4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealingPriceDetails
	 * RedemptionExecution15.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmPriceDetails
	 * SwitchRedemptionLegExecution4.mmPriceDetails}</li>
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
	public static final MMBusinessAssociationEnd<InvestmentFundOrderExecution, SecuritiesPricing> mmExecutedTradePrice = new MMBusinessAssociationEnd<InvestmentFundOrderExecution, SecuritiesPricing>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution3.mmPriceDetails, RedemptionExecution5.mmDealingPriceDetails, RedemptionExecution4.mmPriceDetails, RedemptionExecution6.mmDealingPriceDetails,
					InvestmentFundTransaction2.mmPriceDetails, InvestmentFundTransaction3.mmPriceDetails, SubscriptionExecution3.mmPriceDetails, SubscriptionExecution5.mmDealingPriceDetails, SubscriptionExecution4.mmPriceDetails,
					SubscriptionExecution6.mmDealingPriceDetails, SwitchRedemptionLegExecution2.mmPriceDetails, SwitchSubscriptionLegExecution2.mmPriceDetails, SwitchRedemptionLegExecution3.mmPriceDetails,
					SwitchSubscriptionLegExecution3.mmPriceDetails, RedemptionExecution10.mmDealingPriceDetails, SubscriptionExecution7.mmDealingPriceDetails, RedemptionExecution12.mmDealingPriceDetails,
					SubscriptionExecution9.mmDealingPriceDetails, FundCashForecast7.mmPrice, EstimatedFundCashForecast6.mmPrice, FundCashForecast6.mmPrice, EstimatedFundCashForecast5.mmPrice, InvestmentFundTransaction4.mmPriceDetails,
					SubscriptionExecution13.mmDealingPriceDetails, SubscriptionExecution12.mmDealingPriceDetails, RedemptionExecution16.mmDealingPriceDetails, SwitchSubscriptionLegExecution4.mmPriceDetails,
					RedemptionExecution15.mmDealingPriceDetails, SwitchRedemptionLegExecution4.mmPriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Price at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmFundOrderRelatedToExecutedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(InvestmentFundOrderExecution obj) {
			return obj.getExecutedTradePrice();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, SecuritiesPricing value) {
			obj.setExecutedTradePrice(value);
		}
	};
	protected YesNoIndicator partiallyExecutedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmPartiallyExecutedIndicator
	 * RedemptionExecution3.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPartiallyExecutedIndicator
	 * RedemptionExecution5.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmPartiallyExecutedIndicator
	 * RedemptionExecution4.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartiallyExecutedIndicator
	 * RedemptionExecution6.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction2.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction3.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmPartiallyExecutedIndicator
	 * SubscriptionExecution3.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmPartiallyExecutedIndicator
	 * SubscriptionExecution5.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmPartiallyExecutedIndicator
	 * SubscriptionExecution4.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartiallyExecutedIndicator
	 * SubscriptionExecution6.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPartiallyExecutedIndicator
	 * RedemptionExecution10.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartiallyExecutedIndicator
	 * SubscriptionExecution7.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmPartiallyExecutedIndicator
	 * RedemptionExecution12.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmPartiallyExecutedIndicator
	 * SubscriptionExecution9.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction4.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartiallyExecutedIndicator
	 * SubscriptionExecution13.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartiallyExecutedIndicator
	 * SubscriptionExecution12.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartiallyExecutedIndicator
	 * RedemptionExecution16.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartiallyExecutedIndicator
	 * RedemptionExecution15.mmPartiallyExecutedIndicator}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, YesNoIndicator> mmPartiallyExecutedIndicator = new MMBusinessAttribute<InvestmentFundOrderExecution, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution3.mmPartiallyExecutedIndicator, RedemptionExecution5.mmPartiallyExecutedIndicator, RedemptionExecution4.mmPartiallyExecutedIndicator,
					RedemptionExecution6.mmPartiallyExecutedIndicator, InvestmentFundTransaction2.mmPartiallyExecutedIndicator, InvestmentFundTransaction3.mmPartiallyExecutedIndicator, SubscriptionExecution3.mmPartiallyExecutedIndicator,
					SubscriptionExecution5.mmPartiallyExecutedIndicator, SubscriptionExecution4.mmPartiallyExecutedIndicator, SubscriptionExecution6.mmPartiallyExecutedIndicator, RedemptionExecution10.mmPartiallyExecutedIndicator,
					SubscriptionExecution7.mmPartiallyExecutedIndicator, RedemptionExecution12.mmPartiallyExecutedIndicator, SubscriptionExecution9.mmPartiallyExecutedIndicator, InvestmentFundTransaction4.mmPartiallyExecutedIndicator,
					SubscriptionExecution13.mmPartiallyExecutedIndicator, SubscriptionExecution12.mmPartiallyExecutedIndicator, RedemptionExecution16.mmPartiallyExecutedIndicator, RedemptionExecution15.mmPartiallyExecutedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundOrderExecution obj) {
			return obj.getPartiallyExecutedIndicator();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, YesNoIndicator value) {
			obj.setPartiallyExecutedIndicator(value);
		}
	};
	protected CurrencyAndAmount interimProfitAmount;
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
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss1Choice#mmProfit
	 * ProfitAndLoss1Choice.mmProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss1Choice#mmLoss
	 * ProfitAndLoss1Choice.mmLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmInterimProfitAmount
	 * RedemptionExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmInterimProfitAmount
	 * RedemptionExecution5.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmInterimProfitAmount
	 * RedemptionExecution4.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmInterimProfitAmount
	 * RedemptionExecution6.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmInterimProfitAmount
	 * SubscriptionExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmInterimProfitAmount
	 * SubscriptionExecution5.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmInterimProfitAmount
	 * SubscriptionExecution4.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmInterimProfitAmount
	 * SubscriptionExecution6.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmInterimProfitAmount
	 * SwitchRedemptionLegExecution2.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmInterimProfitAmount
	 * SwitchSubscriptionLegExecution2.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmInterimProfitAmount
	 * SwitchRedemptionLegExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmInterimProfitAmount
	 * SwitchSubscriptionLegExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmInterimProfitAmount
	 * RedemptionExecution10.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInterimProfitAmount
	 * SubscriptionExecution7.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInterimProfitAmount
	 * SubscriptionExecution13.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#mmProfit
	 * ProfitAndLoss2Choice.mmProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#mmLoss
	 * ProfitAndLoss2Choice.mmLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInterimProfitAmount
	 * SubscriptionExecution12.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInterimProfitAmount
	 * RedemptionExecution16.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInterimProfitAmount
	 * SwitchSubscriptionLegExecution4.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInterimProfitAmount
	 * RedemptionExecution15.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInterimProfitAmount
	 * SwitchRedemptionLegExecution4.mmInterimProfitAmount}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, CurrencyAndAmount> mmInterimProfitAmount = new MMBusinessAttribute<InvestmentFundOrderExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(ProfitAndLoss1Choice.mmProfit, ProfitAndLoss1Choice.mmLoss, RedemptionExecution3.mmInterimProfitAmount, RedemptionExecution5.mmInterimProfitAmount,
					RedemptionExecution4.mmInterimProfitAmount, RedemptionExecution6.mmInterimProfitAmount, SubscriptionExecution3.mmInterimProfitAmount, SubscriptionExecution5.mmInterimProfitAmount,
					SubscriptionExecution4.mmInterimProfitAmount, SubscriptionExecution6.mmInterimProfitAmount, SwitchRedemptionLegExecution2.mmInterimProfitAmount, SwitchSubscriptionLegExecution2.mmInterimProfitAmount,
					SwitchRedemptionLegExecution3.mmInterimProfitAmount, SwitchSubscriptionLegExecution3.mmInterimProfitAmount, RedemptionExecution10.mmInterimProfitAmount, SubscriptionExecution7.mmInterimProfitAmount,
					SubscriptionExecution13.mmInterimProfitAmount, ProfitAndLoss2Choice.mmProfit, ProfitAndLoss2Choice.mmLoss, SubscriptionExecution12.mmInterimProfitAmount, RedemptionExecution16.mmInterimProfitAmount,
					SwitchSubscriptionLegExecution4.mmInterimProfitAmount, RedemptionExecution15.mmInterimProfitAmount, SwitchRedemptionLegExecution4.mmInterimProfitAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(InvestmentFundOrderExecution obj) {
			return obj.getInterimProfitAmount();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, CurrencyAndAmount value) {
			obj.setInterimProfitAmount(value);
		}
	};
	protected SecuritiesPricing informativePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
	 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmInformativePriceDetails
	 * RedemptionExecution5.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmInformativePriceDetails
	 * RedemptionExecution6.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmInformativePriceDetails
	 * SubscriptionExecution5.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmInformativePriceDetails
	 * SubscriptionExecution6.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmInformativePriceDetails
	 * RedemptionExecution10.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInformativePriceDetails
	 * SubscriptionExecution7.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInformativePriceDetails
	 * SubscriptionExecution13.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInformativePriceDetails
	 * SubscriptionExecution12.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInformativePriceDetails
	 * RedemptionExecution16.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInformativePriceDetails
	 * SwitchSubscriptionLegExecution4.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInformativePriceDetails
	 * RedemptionExecution15.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInformativePriceDetails
	 * SwitchRedemptionLegExecution4.mmInformativePriceDetails}</li>
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
	public static final MMBusinessAssociationEnd<InvestmentFundOrderExecution, SecuritiesPricing> mmInformativePrice = new MMBusinessAssociationEnd<InvestmentFundOrderExecution, SecuritiesPricing>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution5.mmInformativePriceDetails, RedemptionExecution6.mmInformativePriceDetails, SubscriptionExecution5.mmInformativePriceDetails,
					SubscriptionExecution6.mmInformativePriceDetails, RedemptionExecution10.mmInformativePriceDetails, SubscriptionExecution7.mmInformativePriceDetails, SubscriptionExecution13.mmInformativePriceDetails,
					SubscriptionExecution12.mmInformativePriceDetails, RedemptionExecution16.mmInformativePriceDetails, SwitchSubscriptionLegExecution4.mmInformativePriceDetails, RedemptionExecution15.mmInformativePriceDetails,
					SwitchRedemptionLegExecution4.mmInformativePriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformativePrice";
			definition = "Other quoted price than the one at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmFundOrderRelatedToInformativePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(InvestmentFundOrderExecution obj) {
			return obj.getInformativePrice();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, SecuritiesPricing value) {
			obj.setInformativePrice(value);
		}
	};
	protected BestExecutionCode bestExecution;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmBestExecution
	 * RedemptionExecution5.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmBestExecution
	 * RedemptionExecution6.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmBestExecution
	 * SubscriptionExecution5.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmBestExecution
	 * SubscriptionExecution6.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmBestExecution
	 * SwitchExecution4.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmBestExecution
	 * SwitchExecution7.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmBestExecution
	 * SubscriptionExecution13.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmBestExecution
	 * SubscriptionExecution12.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmBestExecution
	 * RedemptionExecution16.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmBestExecution
	 * RedemptionExecution15.mmBestExecution}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, BestExecutionCode> mmBestExecution = new MMBusinessAttribute<InvestmentFundOrderExecution, BestExecutionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution5.mmBestExecution, RedemptionExecution6.mmBestExecution, SubscriptionExecution5.mmBestExecution, SubscriptionExecution6.mmBestExecution, SwitchExecution4.mmBestExecution,
					SwitchExecution7.mmBestExecution, SubscriptionExecution13.mmBestExecution, SubscriptionExecution12.mmBestExecution, RedemptionExecution16.mmBestExecution, RedemptionExecution15.mmBestExecution);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BestExecutionCode.mmObject();
		}

		@Override
		public BestExecutionCode getValue(InvestmentFundOrderExecution obj) {
			return obj.getBestExecution();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, BestExecutionCode value) {
			obj.setBestExecution(value);
		}
	};
	protected PercentageRate partialSettlementOfUnits;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPartialSettlementOfUnits
	 * RedemptionExecution5.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialSettlementOfUnits
	 * RedemptionExecution6.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmPartialSettlementOfUnits
	 * SubscriptionExecution5.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartialSettlementOfUnits
	 * SubscriptionExecution6.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPartialSettlementOfUnits
	 * RedemptionExecution10.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartialSettlementOfUnits
	 * SubscriptionExecution7.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfUnits
	 * SubscriptionExecution13.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartialSettlementOfUnits
	 * SubscriptionExecution12.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfUnits
	 * RedemptionExecution16.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfUnits
	 * RedemptionExecution15.mmPartialSettlementOfUnits}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, PercentageRate> mmPartialSettlementOfUnits = new MMBusinessAttribute<InvestmentFundOrderExecution, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution5.mmPartialSettlementOfUnits, RedemptionExecution6.mmPartialSettlementOfUnits, SubscriptionExecution5.mmPartialSettlementOfUnits,
					SubscriptionExecution6.mmPartialSettlementOfUnits, RedemptionExecution10.mmPartialSettlementOfUnits, SubscriptionExecution7.mmPartialSettlementOfUnits, SubscriptionExecution13.mmPartialSettlementOfUnits,
					SubscriptionExecution12.mmPartialSettlementOfUnits, RedemptionExecution16.mmPartialSettlementOfUnits, RedemptionExecution15.mmPartialSettlementOfUnits);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InvestmentFundOrderExecution obj) {
			return obj.getPartialSettlementOfUnits();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, PercentageRate value) {
			obj.setPartialSettlementOfUnits(value);
		}
	};
	protected PercentageRate partialSettlementOfCash;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPartialSettlementOfCash
	 * RedemptionExecution5.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialSettlementOfCash
	 * RedemptionExecution6.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmPartialSettlementOfCash
	 * SubscriptionExecution5.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartialSettlementOfCash
	 * SubscriptionExecution6.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPartialSettlementOfCash
	 * RedemptionExecution10.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartialSettlementOfCash
	 * SubscriptionExecution7.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfCash
	 * SubscriptionExecution13.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartialSettlementOfCash
	 * SubscriptionExecution12.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfCash
	 * RedemptionExecution16.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfCash
	 * RedemptionExecution15.mmPartialSettlementOfCash}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, PercentageRate> mmPartialSettlementOfCash = new MMBusinessAttribute<InvestmentFundOrderExecution, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution5.mmPartialSettlementOfCash, RedemptionExecution6.mmPartialSettlementOfCash, SubscriptionExecution5.mmPartialSettlementOfCash,
					SubscriptionExecution6.mmPartialSettlementOfCash, RedemptionExecution10.mmPartialSettlementOfCash, SubscriptionExecution7.mmPartialSettlementOfCash, SubscriptionExecution13.mmPartialSettlementOfCash,
					SubscriptionExecution12.mmPartialSettlementOfCash, RedemptionExecution16.mmPartialSettlementOfCash, RedemptionExecution15.mmPartialSettlementOfCash);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InvestmentFundOrderExecution obj) {
			return obj.getPartialSettlementOfCash();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, PercentageRate value) {
			obj.setPartialSettlementOfCash(value);
		}
	};
	protected LateReportCode lateReport;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmLateReport
	 * RedemptionExecution5.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmLateReport
	 * RedemptionExecution6.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmLateReport
	 * SubscriptionExecution5.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmLateReport
	 * SubscriptionExecution6.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmLateReport
	 * SwitchExecution4.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmLateReport
	 * SwitchExecution7.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmLateReport
	 * SubscriptionExecution13.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmLateReport
	 * SubscriptionExecution12.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmLateReport
	 * RedemptionExecution16.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmLateReport
	 * RedemptionExecution15.mmLateReport}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, LateReportCode> mmLateReport = new MMBusinessAttribute<InvestmentFundOrderExecution, LateReportCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution5.mmLateReport, RedemptionExecution6.mmLateReport, SubscriptionExecution5.mmLateReport, SubscriptionExecution6.mmLateReport, SwitchExecution4.mmLateReport,
					SwitchExecution7.mmLateReport, SubscriptionExecution13.mmLateReport, SubscriptionExecution12.mmLateReport, RedemptionExecution16.mmLateReport, RedemptionExecution15.mmLateReport);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LateReportCode.mmObject();
		}

		@Override
		public LateReportCode getValue(InvestmentFundOrderExecution obj) {
			return obj.getLateReport();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, LateReportCode value) {
			obj.setLateReport(value);
		}
	};
	protected YesNoIndicator settledIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmSettledTransactionIndicator
	 * InvestmentFundTransaction2.mmSettledTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettledTransactionIndicator
	 * InvestmentFundTransaction3.mmSettledTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettledTransactionIndicator
	 * InvestmentFundTransaction4.mmSettledTransactionIndicator}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, YesNoIndicator> mmSettledIndicator = new MMBusinessAttribute<InvestmentFundOrderExecution, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction2.mmSettledTransactionIndicator, InvestmentFundTransaction3.mmSettledTransactionIndicator, InvestmentFundTransaction4.mmSettledTransactionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundOrderExecution obj) {
			return obj.getSettledIndicator();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, YesNoIndicator value) {
			obj.setSettledIndicator(value);
		}
	};
	protected YesNoIndicator registeredIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction2.mmRegisteredTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction3.mmRegisteredTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction4.mmRegisteredTransactionIndicator}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, YesNoIndicator> mmRegisteredIndicator = new MMBusinessAttribute<InvestmentFundOrderExecution, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction2.mmRegisteredTransactionIndicator, InvestmentFundTransaction3.mmRegisteredTransactionIndicator, InvestmentFundTransaction4.mmRegisteredTransactionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundOrderExecution obj) {
			return obj.getRegisteredIndicator();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, YesNoIndicator value) {
			obj.setRegisteredIndicator(value);
		}
	};
	protected CurrencyAndAmount executedAmount;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmExecutedAmount
	 * RedemptionExecution10.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmExecutedAmount
	 * SubscriptionExecution7.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#mmExecutedAmount
	 * FinancialInstrumentQuantity2.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmExecutedAmount
	 * FinancialInstrumentQuantity3.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromUnitOrders
	 * FundBalance1.mmTotalCashFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromCashOrders
	 * FundBalance1.mmTotalCashFromCashOrders}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, CurrencyAndAmount> mmExecutedAmount = new MMBusinessAttribute<InvestmentFundOrderExecution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionExecution10.mmExecutedAmount, SubscriptionExecution7.mmExecutedAmount, FinancialInstrumentQuantity2.mmExecutedAmount, FinancialInstrumentQuantity3.mmExecutedAmount,
					FundBalance1.mmTotalCashFromUnitOrders, FundBalance1.mmTotalCashFromCashOrders);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedAmount";
			definition = "Amount of money invested or redeemed as a result of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(InvestmentFundOrderExecution obj) {
			return obj.getExecutedAmount();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, CurrencyAndAmount value) {
			obj.setExecutedAmount(value);
		}
	};
	protected InvestmentFundTransaction investmentFundTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
	 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegExecution2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegExecution3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmOrderExecutionDetails
	 * InvestmentFundOrderExecution3.mmOrderExecutionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegExecution4.mmFinancialInstrumentDetails}</li>
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
	public static final MMBusinessAssociationEnd<InvestmentFundOrderExecution, Optional<InvestmentFundTransaction>> mmInvestmentFundTransaction = new MMBusinessAssociationEnd<InvestmentFundOrderExecution, Optional<InvestmentFundTransaction>>() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchRedemptionLegExecution2.mmFinancialInstrumentDetails, SwitchRedemptionLegExecution3.mmFinancialInstrumentDetails, InvestmentFundOrderExecution3.mmOrderExecutionDetails,
					SwitchRedemptionLegExecution4.mmFinancialInstrumentDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}

		@Override
		public Optional<InvestmentFundTransaction> getValue(InvestmentFundOrderExecution obj) {
			return obj.getInvestmentFundTransaction();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, Optional<InvestmentFundTransaction> value) {
			obj.setInvestmentFundTransaction(value.orElse(null));
		}
	};
	protected List<FundsCashFlow> cashFlow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
	 * FundsCashFlow.mmRelatedOrder}</li>
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
	public static final MMBusinessAssociationEnd<InvestmentFundOrderExecution, List<FundsCashFlow>> mmCashFlow = new MMBusinessAssociationEnd<InvestmentFundOrderExecution, List<FundsCashFlow>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFlow";
			definition = "Specifies the cash flow resulting from the execution of an order.";
			minOccurs = 0;
			opposite_lazy = () -> FundsCashFlow.mmRelatedOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}

		@Override
		public List<FundsCashFlow> getValue(InvestmentFundOrderExecution obj) {
			return obj.getCashFlow();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, List<FundsCashFlow> value) {
			obj.setCashFlow(value);
		}
	};
	protected SourceOfCashCode sourceOfCash;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSourceOfCash
	 * SubscriptionExecution13.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSourceOfCash
	 * SubscriptionExecution12.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSourceOfCash
	 * SubscriptionOrder15.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSourceOfCash
	 * SubscriptionOrder14.mmSourceOfCash}</li>
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
	public static final MMBusinessAttribute<InvestmentFundOrderExecution, SourceOfCashCode> mmSourceOfCash = new MMBusinessAttribute<InvestmentFundOrderExecution, SourceOfCashCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionExecution13.mmSourceOfCash, SubscriptionExecution12.mmSourceOfCash, SubscriptionOrder15.mmSourceOfCash, SubscriptionOrder14.mmSourceOfCash);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SourceOfCash";
			definition = "Source of cash used for the settlement of the execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SourceOfCashCode.mmObject();
		}

		@Override
		public SourceOfCashCode getValue(InvestmentFundOrderExecution obj) {
			return obj.getSourceOfCash();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution obj, SourceOfCashCode value) {
			obj.setSourceOfCash(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrderExecution";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmFundOrderRelatedToExecutedPrice, SecuritiesPricing.mmFundOrderRelatedToInformativePrice, InvestmentFundOrder.mmInvestmentFundOrderExecution,
						SecuritiesQuantity.mmRelatedOrderExecution, com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution, FundsCashFlow.mmRelatedOrder);
				derivationElement_lazy = () -> Arrays.asList(InvestmentFundTransactionsByFund2.mmTransactionDetails, InvestmentFundTransactionsByFund3.mmTransactionDetails);
				subType_lazy = () -> Arrays.asList(SubscriptionExecution.mmObject(), RedemptionExecution.mmObject(), SwitchExecution.mmObject());
				superType_lazy = () -> SecuritiesTradeExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrderExecution.mmUnitsNumber, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmNonStandardSettlementInformation,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmDealIdentification,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartiallyExecutedIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInterimProfitAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmBestExecution, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartialSettlementOfUnits,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartialSettlementOfCash, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmLateReport,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmSettledIndicator, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmRegisteredIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmCashFlow, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmSourceOfCash);
				derivationComponent_lazy = () -> Arrays.asList(ExpectedExecutionDetails1.mmObject(), ExpectedExecutionDetails2.mmObject(), InvestmentFundOrderExecution2.mmObject(), InvestmentFundOrderExecution1.mmObject(),
						ExpectedExecutionDetails3.mmObject(), InvestmentFundOrderExecution3.mmObject(), UnitsAndCash.mmObject(), ExpectedExecutionDetails4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundOrderExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getUnitsNumber() {
		return unitsNumber;
	}

	public InvestmentFundOrderExecution setUnitsNumber(SecuritiesQuantity unitsNumber) {
		this.unitsNumber = Objects.requireNonNull(unitsNumber);
		return this;
	}

	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public InvestmentFundOrderExecution setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = Objects.requireNonNull(nonStandardSettlementInformation);
		return this;
	}

	public Optional<InvestmentFundOrder> getOrder() {
		return order == null ? Optional.empty() : Optional.of(order);
	}

	public InvestmentFundOrderExecution setOrder(InvestmentFundOrder order) {
		this.order = order;
		return this;
	}

	public Max35Text getDealIdentification() {
		return dealIdentification;
	}

	public InvestmentFundOrderExecution setDealIdentification(Max35Text dealIdentification) {
		this.dealIdentification = Objects.requireNonNull(dealIdentification);
		return this;
	}

	public SecuritiesPricing getExecutedTradePrice() {
		return executedTradePrice;
	}

	public InvestmentFundOrderExecution setExecutedTradePrice(SecuritiesPricing executedTradePrice) {
		this.executedTradePrice = Objects.requireNonNull(executedTradePrice);
		return this;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public InvestmentFundOrderExecution setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = Objects.requireNonNull(partiallyExecutedIndicator);
		return this;
	}

	public CurrencyAndAmount getInterimProfitAmount() {
		return interimProfitAmount;
	}

	public InvestmentFundOrderExecution setInterimProfitAmount(CurrencyAndAmount interimProfitAmount) {
		this.interimProfitAmount = Objects.requireNonNull(interimProfitAmount);
		return this;
	}

	public SecuritiesPricing getInformativePrice() {
		return informativePrice;
	}

	public InvestmentFundOrderExecution setInformativePrice(SecuritiesPricing informativePrice) {
		this.informativePrice = Objects.requireNonNull(informativePrice);
		return this;
	}

	public BestExecutionCode getBestExecution() {
		return bestExecution;
	}

	public InvestmentFundOrderExecution setBestExecution(BestExecutionCode bestExecution) {
		this.bestExecution = Objects.requireNonNull(bestExecution);
		return this;
	}

	public PercentageRate getPartialSettlementOfUnits() {
		return partialSettlementOfUnits;
	}

	public InvestmentFundOrderExecution setPartialSettlementOfUnits(PercentageRate partialSettlementOfUnits) {
		this.partialSettlementOfUnits = Objects.requireNonNull(partialSettlementOfUnits);
		return this;
	}

	public PercentageRate getPartialSettlementOfCash() {
		return partialSettlementOfCash;
	}

	public InvestmentFundOrderExecution setPartialSettlementOfCash(PercentageRate partialSettlementOfCash) {
		this.partialSettlementOfCash = Objects.requireNonNull(partialSettlementOfCash);
		return this;
	}

	public LateReportCode getLateReport() {
		return lateReport;
	}

	public InvestmentFundOrderExecution setLateReport(LateReportCode lateReport) {
		this.lateReport = Objects.requireNonNull(lateReport);
		return this;
	}

	public YesNoIndicator getSettledIndicator() {
		return settledIndicator;
	}

	public InvestmentFundOrderExecution setSettledIndicator(YesNoIndicator settledIndicator) {
		this.settledIndicator = Objects.requireNonNull(settledIndicator);
		return this;
	}

	public YesNoIndicator getRegisteredIndicator() {
		return registeredIndicator;
	}

	public InvestmentFundOrderExecution setRegisteredIndicator(YesNoIndicator registeredIndicator) {
		this.registeredIndicator = Objects.requireNonNull(registeredIndicator);
		return this;
	}

	public CurrencyAndAmount getExecutedAmount() {
		return executedAmount;
	}

	public InvestmentFundOrderExecution setExecutedAmount(CurrencyAndAmount executedAmount) {
		this.executedAmount = Objects.requireNonNull(executedAmount);
		return this;
	}

	public Optional<InvestmentFundTransaction> getInvestmentFundTransaction() {
		return investmentFundTransaction == null ? Optional.empty() : Optional.of(investmentFundTransaction);
	}

	public InvestmentFundOrderExecution setInvestmentFundTransaction(com.tools20022.repository.entity.InvestmentFundTransaction investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
		return this;
	}

	public List<FundsCashFlow> getCashFlow() {
		return cashFlow == null ? cashFlow = new ArrayList<>() : cashFlow;
	}

	public InvestmentFundOrderExecution setCashFlow(List<FundsCashFlow> cashFlow) {
		this.cashFlow = Objects.requireNonNull(cashFlow);
		return this;
	}

	public SourceOfCashCode getSourceOfCash() {
		return sourceOfCash;
	}

	public InvestmentFundOrderExecution setSourceOfCash(SourceOfCashCode sourceOfCash) {
		this.sourceOfCash = Objects.requireNonNull(sourceOfCash);
		return this;
	}
}