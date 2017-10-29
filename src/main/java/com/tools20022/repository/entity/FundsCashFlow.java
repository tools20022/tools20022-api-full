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
import com.tools20022.repository.codeset.FlowDirectionTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash movements from or to a fund as a result of investment funds
 * transactions, for example, subscriptions or redemptions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FundsCashFlow" src="doc-files/FundsCashFlow.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#ExceptionalCashFlowIndicator
 * FundsCashFlow.ExceptionalCashFlowIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FundsCashFlow#FlowDirection
 * FundsCashFlow.FlowDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#FundSubscriptionAccountEntry
 * FundsCashFlow.FundSubscriptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#FundRedemptionAccountEntry
 * FundsCashFlow.FundRedemptionAccountEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FundsCashFlow#RelatedOrder
 * FundsCashFlow.RelatedOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FundsCashFlow#NetIndicator
 * FundsCashFlow.NetIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#NetAssetValueCalculation
 * FundsCashFlow.NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#CashFlowQuantity
 * FundsCashFlow.CashFlowQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#FundsCashFlow
 * NetAssetValueCalculation.FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCashFlow
 * SecuritiesQuantity.RelatedCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#CashFlow
 * InvestmentFundOrderExecution.CashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#FundSubscriptionCashInFlow
 * BookEntry.FundSubscriptionCashInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#FundRedemptionCashOutFlow
 * BookEntry.FundRedemptionCashOutFlow}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#CashInForecastDetails
 * FundCashForecast1.CashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#CashOutForecastDetails
 * FundCashForecast1.CashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#NetCashForecastDetails
 * FundCashForecast1.NetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport1#FundCashForecastDetails
 * FundConfirmedCashForecastReport1.FundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#CashInForecastDetails
 * FundCashForecast3.CashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#CashOutForecastDetails
 * FundCashForecast3.CashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#NetCashForecastDetails
 * FundCashForecast3.NetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport2#FundCashForecastDetails
 * FundConfirmedCashForecastReport2.FundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport2#ConsolidatedNetCashForecast
 * FundConfirmedCashForecastReport2.ConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#CashOutBreakdownDetails
 * CashOutForecast1.CashOutBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#CashInForecastDetails
 * ForecastParameter2.CashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#CashOutForecastDetails
 * ForecastParameter2.CashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#NetCashForecastDetails
 * ForecastParameter2.NetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#NetCashForecastDetails
 * FundCashForecast2.NetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#CashOutBreakdownDetails
 * CashOutForecast3.CashOutBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#NetCashForecastDetails
 * FundCashForecast4.NetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2#FundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport2.FundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2#ConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReport2.ConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1#FundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport1.FundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#EstimatedCashInForecastDetails
 * ForecastParameter1.EstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#EstimatedCashOutForecastDetails
 * ForecastParameter1.EstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#EstimatedNetCashForecastDetails
 * ForecastParameter1.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#EstimatedNetCashForecastDetails
 * EstimatedFundCashForecast2.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#EstimatedNetCashForecastDetails
 * EstimatedFundCashForecast4.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#EstimatedCashInForecastDetails
 * EstimatedFundCashForecast1.EstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#EstimatedCashOutForecastDetails
 * EstimatedFundCashForecast1.EstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#EstimatedNetCashForecastDetails
 * EstimatedFundCashForecast1.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#EstimatedCashInForecastDetails
 * EstimatedFundCashForecast3.EstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#EstimatedCashOutForecastDetails
 * EstimatedFundCashForecast3.EstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#EstimatedNetCashForecastDetails
 * EstimatedFundCashForecast3.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#CashInForecastDetails
 * FundCashForecast7.CashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#CashOutForecastDetails
 * FundCashForecast7.CashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#NetCashForecastDetails
 * FundCashForecast7.NetCashForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#CashInForecastDetails
 * Fund2.CashInForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#CashOutForecastDetails
 * Fund2.CashOutForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#NetCashForecastDetails
 * Fund2.NetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#EstimatedCashInForecastDetails
 * EstimatedFundCashForecast6.EstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#EstimatedCashOutForecastDetails
 * EstimatedFundCashForecast6.EstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#EstimatedNetCashForecastDetails
 * EstimatedFundCashForecast6.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#EstimatedCashInForecastDetails
 * Fund1.EstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#EstimatedCashOutForecastDetails
 * Fund1.EstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#EstimatedNetCashForecastDetails
 * Fund1.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#FundCashForecastDetails
 * FundConfirmedCashForecastReport3.FundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#ConsolidatedNetCashForecast
 * FundConfirmedCashForecastReport3.ConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#NetCashForecastDetails
 * FundCashForecast6.NetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#FundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport3.FundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#ConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReport3.ConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#EstimatedNetCashForecastDetails
 * EstimatedFundCashForecast5.EstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#CashOutBreakdownDetails
 * CashOutForecast5.CashOutBreakdownDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast2
 * CashInForecast2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast2
 * CashOutForecast2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast1
 * NetCashForecast1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast1
 * FundCashForecast1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport1
 * FundConfirmedCashForecastReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast4
 * CashInForecast4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast4
 * CashOutForecast4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast2
 * NetCashForecast2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast3
 * FundCashForecast3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast3
 * NetCashForecast3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport2
 * FundConfirmedCashForecastReport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashInBreakdown1
 * FundCashInBreakdown1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast1
 * CashInForecast1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1
 * FundCashOutBreakdown1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast1
 * CashOutForecast1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForecastParameter2
 * ForecastParameter2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast2
 * FundCashForecast2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashInBreakdown2
 * FundCashInBreakdown2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast3
 * CashInForecast3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2
 * FundCashOutBreakdown2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast3
 * CashOutForecast3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast4
 * FundCashForecast4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2
 * FundDetailedConfirmedCashForecastReport2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1
 * FundDetailedConfirmedCashForecastReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForecastParameter1
 * ForecastParameter1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2
 * EstimatedFundCashForecast2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4
 * EstimatedFundCashForecast4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1
 * EstimatedFundCashForecast1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3
 * EstimatedFundCashForecast3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7
 * FundCashForecast7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2 Fund2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
 * EstimatedFundCashForecast6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1 Fund1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3
 * FundConfirmedCashForecastReport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6
 * FundCashForecast6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3
 * FundDetailedConfirmedCashForecastReport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
 * EstimatedFundCashForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast5
 * CashOutForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundBalance1 FundBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
 * FundCashOutBreakdown3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast4
 * NetCashForecast4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast5
 * CashInForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
 * FundCashInBreakdown3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOutForecast6
 * CashOutForecast6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInForecast6
 * CashInForecast6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3 Fund3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund4 Fund4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast5
 * NetCashForecast5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashInOutForecast7
 * CashInOutForecast7}</li>
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
 * "FundsCashFlow"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions."
 * </li>
 * </ul>
 */
public class FundsCashFlow {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the cash flow is exceptional , eg, extraordinary cash
	 * amounts in or out.
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
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#ExceptionalCashFlowIndicator
	 * CashInForecast2.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#ExceptionalCashFlowIndicator
	 * CashOutForecast2.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#ExceptionalNetCashFlowIndicator
	 * FundCashForecast1.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#ExceptionalCashFlowIndicator
	 * CashInForecast4.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#ExceptionalCashFlowIndicator
	 * CashOutForecast4.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#ExceptionalNetCashFlowIndicator
	 * FundCashForecast3.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#ExceptionalCashFlowIndicator
	 * CashInForecast1.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#ExceptionalCashFlowIndicator
	 * CashOutForecast1.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#ExceptionalNetCashFlowIndicator
	 * FundCashForecast2.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#ExceptionalCashFlowIndicator
	 * CashInForecast3.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#ExceptionalCashFlowIndicator
	 * CashOutForecast3.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#ExceptionalNetCashFlowIndicator
	 * FundCashForecast4.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#ExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast2.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#ExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast4.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#ExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast1.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#ExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast3.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#ExceptionalNetCashFlowIndicator
	 * FundCashForecast7.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#ExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast6.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#ExceptionalNetCashFlowIndicator
	 * FundCashForecast6.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#ExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast5.ExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#ExceptionalCashFlowIndicator
	 * CashOutForecast5.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#ExceptionalCashFlowIndicator
	 * CashInForecast5.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#ExceptionalCashFlowIndicator
	 * CashOutForecast6.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#ExceptionalCashFlowIndicator
	 * CashInForecast6.ExceptionalCashFlowIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExceptionalCashFlowIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashInForecast2.ExceptionalCashFlowIndicator, com.tools20022.repository.msg.CashOutForecast2.ExceptionalCashFlowIndicator,
					com.tools20022.repository.msg.FundCashForecast1.ExceptionalNetCashFlowIndicator, com.tools20022.repository.msg.CashInForecast4.ExceptionalCashFlowIndicator,
					com.tools20022.repository.msg.CashOutForecast4.ExceptionalCashFlowIndicator, com.tools20022.repository.msg.FundCashForecast3.ExceptionalNetCashFlowIndicator,
					com.tools20022.repository.msg.CashInForecast1.ExceptionalCashFlowIndicator, com.tools20022.repository.msg.CashOutForecast1.ExceptionalCashFlowIndicator,
					com.tools20022.repository.msg.FundCashForecast2.ExceptionalNetCashFlowIndicator, com.tools20022.repository.msg.CashInForecast3.ExceptionalCashFlowIndicator,
					com.tools20022.repository.msg.CashOutForecast3.ExceptionalCashFlowIndicator, com.tools20022.repository.msg.FundCashForecast4.ExceptionalNetCashFlowIndicator,
					com.tools20022.repository.msg.EstimatedFundCashForecast2.ExceptionalNetCashFlowIndicator, com.tools20022.repository.msg.EstimatedFundCashForecast4.ExceptionalNetCashFlowIndicator,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.ExceptionalNetCashFlowIndicator, com.tools20022.repository.msg.EstimatedFundCashForecast3.ExceptionalNetCashFlowIndicator,
					com.tools20022.repository.msg.FundCashForecast7.ExceptionalNetCashFlowIndicator, com.tools20022.repository.msg.EstimatedFundCashForecast6.ExceptionalNetCashFlowIndicator,
					com.tools20022.repository.msg.FundCashForecast6.ExceptionalNetCashFlowIndicator, com.tools20022.repository.msg.EstimatedFundCashForecast5.ExceptionalNetCashFlowIndicator,
					com.tools20022.repository.msg.CashOutForecast5.ExceptionalCashFlowIndicator, com.tools20022.repository.msg.CashInForecast5.ExceptionalCashFlowIndicator,
					com.tools20022.repository.msg.CashOutForecast6.ExceptionalCashFlowIndicator, com.tools20022.repository.msg.CashInForecast6.ExceptionalCashFlowIndicator);
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the direction of the cash flow from the perspective of the
	 * fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FlowDirectionTypeCode
	 * FlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast1#FlowDirection
	 * NetCashForecast1.FlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#FlowDirection
	 * NetCashForecast2.FlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#FlowDirection
	 * NetCashForecast3.FlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#FlowDirection
	 * NetCashForecast4.FlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#FlowDirection
	 * NetCashForecast5.FlowDirection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the direction of the cash flow from the perspective of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FlowDirection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetCashForecast1.FlowDirection, com.tools20022.repository.msg.NetCashForecast2.FlowDirection, com.tools20022.repository.msg.NetCashForecast3.FlowDirection,
					com.tools20022.repository.msg.NetCashForecast4.FlowDirection, com.tools20022.repository.msg.NetCashForecast5.FlowDirection);
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FlowDirection";
			definition = "Specifies the direction of the cash flow from the perspective of the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FlowDirectionTypeCode.mmObject();
		}
	};
	/**
	 * Account entry which is linked to a fund subscription process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#FundSubscriptionCashInFlow
	 * BookEntry.FundSubscriptionCashInFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundSubscriptionAccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry which is linked to a fund subscription process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundSubscriptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionAccountEntry";
			definition = "Account entry which is linked to a fund subscription process.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.FundSubscriptionCashInFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account entry which is linked to a fund redemption process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#FundRedemptionCashOutFlow
	 * BookEntry.FundRedemptionCashOutFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundRedemptionAccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry which is linked to a fund redemption process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundRedemptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionAccountEntry";
			definition = "Account entry which is linked to a fund redemption process.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.FundRedemptionCashOutFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade which is the source for the calculation of the cash flow movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#CashFlow
	 * InvestmentFundOrderExecution.CashFlow}</li>
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade which is the source for the calculation of the cash flow movements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Trade which is the source for the calculation of the cash flow movements.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.CashFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the cash flow is the result of netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the cash flow is the result of netting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetIndicator";
			definition = "Indicates whether the cash flow is the result of netting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Net asset value incorporating the net cash flow for a valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#FundsCashFlow
	 * NetAssetValueCalculation.FundsCashFlow}</li>
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value incorporating the net cash flow for a valuation date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value incorporating the net cash flow for a valuation date.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.FundsCashFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value and quantity of the cash flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedCashFlow
	 * SecuritiesQuantity.RelatedCashFlow}</li>
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlowQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value and quantity of the cash flow."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashFlowQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFlowQuantity";
			definition = "Value and quantity of the cash flow.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedCashFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundsCashFlow";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.FundsCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.RelatedCashFlow,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.CashFlow, com.tools20022.repository.entity.BookEntry.FundSubscriptionCashInFlow, com.tools20022.repository.entity.BookEntry.FundRedemptionCashOutFlow);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecast1.CashInForecastDetails, com.tools20022.repository.msg.FundCashForecast1.CashOutForecastDetails,
						com.tools20022.repository.msg.FundCashForecast1.NetCashForecastDetails, com.tools20022.repository.msg.FundConfirmedCashForecastReport1.FundCashForecastDetails,
						com.tools20022.repository.msg.FundCashForecast3.CashInForecastDetails, com.tools20022.repository.msg.FundCashForecast3.CashOutForecastDetails, com.tools20022.repository.msg.FundCashForecast3.NetCashForecastDetails,
						com.tools20022.repository.msg.FundConfirmedCashForecastReport2.FundCashForecastDetails, com.tools20022.repository.msg.FundConfirmedCashForecastReport2.ConsolidatedNetCashForecast,
						com.tools20022.repository.msg.CashOutForecast1.CashOutBreakdownDetails, com.tools20022.repository.msg.ForecastParameter2.CashInForecastDetails,
						com.tools20022.repository.msg.ForecastParameter2.CashOutForecastDetails, com.tools20022.repository.msg.ForecastParameter2.NetCashForecastDetails,
						com.tools20022.repository.msg.FundCashForecast2.NetCashForecastDetails, com.tools20022.repository.msg.CashOutForecast3.CashOutBreakdownDetails, com.tools20022.repository.msg.FundCashForecast4.NetCashForecastDetails,
						com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2.FundCashForecastDetails, com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2.ConsolidatedNetCashForecast,
						com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1.FundCashForecastDetails, com.tools20022.repository.msg.ForecastParameter1.EstimatedCashInForecastDetails,
						com.tools20022.repository.msg.ForecastParameter1.EstimatedCashOutForecastDetails, com.tools20022.repository.msg.ForecastParameter1.EstimatedNetCashForecastDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast2.EstimatedNetCashForecastDetails, com.tools20022.repository.msg.EstimatedFundCashForecast4.EstimatedNetCashForecastDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast1.EstimatedCashInForecastDetails, com.tools20022.repository.msg.EstimatedFundCashForecast1.EstimatedCashOutForecastDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast1.EstimatedNetCashForecastDetails, com.tools20022.repository.msg.EstimatedFundCashForecast3.EstimatedCashInForecastDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast3.EstimatedCashOutForecastDetails, com.tools20022.repository.msg.EstimatedFundCashForecast3.EstimatedNetCashForecastDetails,
						com.tools20022.repository.msg.FundCashForecast7.CashInForecastDetails, com.tools20022.repository.msg.FundCashForecast7.CashOutForecastDetails, com.tools20022.repository.msg.FundCashForecast7.NetCashForecastDetails,
						com.tools20022.repository.msg.Fund2.CashInForecastDetails, com.tools20022.repository.msg.Fund2.CashOutForecastDetails, com.tools20022.repository.msg.Fund2.NetCashForecastDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.EstimatedCashInForecastDetails, com.tools20022.repository.msg.EstimatedFundCashForecast6.EstimatedCashOutForecastDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.EstimatedNetCashForecastDetails, com.tools20022.repository.msg.Fund1.EstimatedCashInForecastDetails,
						com.tools20022.repository.msg.Fund1.EstimatedCashOutForecastDetails, com.tools20022.repository.msg.Fund1.EstimatedNetCashForecastDetails,
						com.tools20022.repository.msg.FundConfirmedCashForecastReport3.FundCashForecastDetails, com.tools20022.repository.msg.FundConfirmedCashForecastReport3.ConsolidatedNetCashForecast,
						com.tools20022.repository.msg.FundCashForecast6.NetCashForecastDetails, com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.FundCashForecastDetails,
						com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.ConsolidatedNetCashForecast, com.tools20022.repository.msg.EstimatedFundCashForecast5.EstimatedNetCashForecastDetails,
						com.tools20022.repository.msg.CashOutForecast5.CashOutBreakdownDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FundsCashFlow.ExceptionalCashFlowIndicator, com.tools20022.repository.entity.FundsCashFlow.FlowDirection,
						com.tools20022.repository.entity.FundsCashFlow.FundSubscriptionAccountEntry, com.tools20022.repository.entity.FundsCashFlow.FundRedemptionAccountEntry, com.tools20022.repository.entity.FundsCashFlow.RelatedOrder,
						com.tools20022.repository.entity.FundsCashFlow.NetIndicator, com.tools20022.repository.entity.FundsCashFlow.NetAssetValueCalculation, com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity);
				derivationComponent_lazy = () -> Arrays.asList(CashInForecast2.mmObject(), CashOutForecast2.mmObject(), NetCashForecast1.mmObject(), FundCashForecast1.mmObject(), FundConfirmedCashForecastReport1.mmObject(),
						CashInForecast4.mmObject(), CashOutForecast4.mmObject(), NetCashForecast2.mmObject(), FundCashForecast3.mmObject(), NetCashForecast3.mmObject(), FundConfirmedCashForecastReport2.mmObject(),
						FundCashInBreakdown1.mmObject(), CashInForecast1.mmObject(), FundCashOutBreakdown1.mmObject(), CashOutForecast1.mmObject(), ForecastParameter2.mmObject(), FundCashForecast2.mmObject(),
						FundCashInBreakdown2.mmObject(), CashInForecast3.mmObject(), FundCashOutBreakdown2.mmObject(), CashOutForecast3.mmObject(), FundCashForecast4.mmObject(), FundDetailedConfirmedCashForecastReport2.mmObject(),
						FundDetailedConfirmedCashForecastReport1.mmObject(), ForecastParameter1.mmObject(), EstimatedFundCashForecast2.mmObject(), EstimatedFundCashForecast4.mmObject(), EstimatedFundCashForecast1.mmObject(),
						EstimatedFundCashForecast3.mmObject(), FundCashForecast7.mmObject(), Fund2.mmObject(), EstimatedFundCashForecast6.mmObject(), Fund1.mmObject(), FundConfirmedCashForecastReport3.mmObject(),
						FundCashForecast6.mmObject(), FundDetailedConfirmedCashForecastReport3.mmObject(), EstimatedFundCashForecast5.mmObject(), CashOutForecast5.mmObject(), FundBalance1.mmObject(), FundCashOutBreakdown3.mmObject(),
						NetCashForecast4.mmObject(), CashInForecast5.mmObject(), FundCashInBreakdown3.mmObject(), CashOutForecast6.mmObject(), CashInForecast6.mmObject(), Fund3.mmObject(), Fund4.mmObject(), NetCashForecast5.mmObject(),
						CashInOutForecast7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}