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
import com.tools20022.repository.codeset.FlowDirectionTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
 * NetAssetValueCalculation.mmFundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
 * SecuritiesQuantity.mmRelatedCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
 * InvestmentFundOrderExecution.mmCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
 * BookEntry.mmFundSubscriptionCashInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
 * BookEntry.mmFundRedemptionCashOutFlow}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmCashInForecastDetails
 * FundCashForecast1.mmCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmCashOutForecastDetails
 * FundCashForecast1.mmCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmNetCashForecastDetails
 * FundCashForecast1.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport1#mmFundCashForecastDetails
 * FundConfirmedCashForecastReport1.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmCashInForecastDetails
 * FundCashForecast3.mmCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmCashOutForecastDetails
 * FundCashForecast3.mmCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmNetCashForecastDetails
 * FundCashForecast3.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport2#mmFundCashForecastDetails
 * FundConfirmedCashForecastReport2.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport2#mmConsolidatedNetCashForecast
 * FundConfirmedCashForecastReport2.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#mmCashOutBreakdownDetails
 * CashOutForecast1.mmCashOutBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#mmCashInForecastDetails
 * ForecastParameter2.mmCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#mmCashOutForecastDetails
 * ForecastParameter2.mmCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter2#mmNetCashForecastDetails
 * ForecastParameter2.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmNetCashForecastDetails
 * FundCashForecast2.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmCashOutBreakdownDetails
 * CashOutForecast3.mmCashOutBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmNetCashForecastDetails
 * FundCashForecast4.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport2.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport2#mmConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReport2.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport1#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport1.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#mmEstimatedCashInForecastDetails
 * ForecastParameter1.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#mmEstimatedCashOutForecastDetails
 * ForecastParameter1.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForecastParameter1#mmEstimatedNetCashForecastDetails
 * ForecastParameter1.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast2.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast4.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmEstimatedCashInForecastDetails
 * EstimatedFundCashForecast1.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmEstimatedCashOutForecastDetails
 * EstimatedFundCashForecast1.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast1.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedCashInForecastDetails
 * EstimatedFundCashForecast3.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedCashOutForecastDetails
 * EstimatedFundCashForecast3.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast3.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmCashInForecastDetails
 * FundCashForecast7.mmCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmCashOutForecastDetails
 * FundCashForecast7.mmCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmNetCashForecastDetails
 * FundCashForecast7.mmNetCashForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmCashInForecastDetails
 * Fund2.mmCashInForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmCashOutForecastDetails
 * Fund2.mmCashOutForecastDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmNetCashForecastDetails
 * Fund2.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashInForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashOutForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedCashInForecastDetails
 * Fund1.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedCashOutForecastDetails
 * Fund1.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedNetCashForecastDetails
 * Fund1.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmFundCashForecastDetails
 * FundConfirmedCashForecastReport3.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundConfirmedCashForecastReport3#mmConsolidatedNetCashForecast
 * FundConfirmedCashForecastReport3.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmNetCashForecastDetails
 * FundCashForecast6.mmNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReport3.mmFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReport3.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast5.mmEstimatedNetCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashOutBreakdownDetails
 * CashOutForecast5.mmCashOutBreakdownDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmExceptionalCashFlowIndicator
 * FundsCashFlow.mmExceptionalCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFlowDirection
 * FundsCashFlow.mmFlowDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundSubscriptionAccountEntry
 * FundsCashFlow.mmFundSubscriptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundRedemptionAccountEntry
 * FundsCashFlow.mmFundRedemptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
 * FundsCashFlow.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetIndicator
 * FundsCashFlow.mmNetIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetAssetValueCalculation
 * FundsCashFlow.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmCashFlowQuantity
 * FundsCashFlow.mmCashFlowQuantity}</li>
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
 * "FundsCashFlow"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions."
 * </li>
 * </ul>
 */
public class FundsCashFlow {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator exceptionalCashFlowIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#mmExceptionalCashFlowIndicator
	 * CashInForecast2.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmExceptionalCashFlowIndicator
	 * CashOutForecast2.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast1.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#mmExceptionalCashFlowIndicator
	 * CashInForecast4.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmExceptionalCashFlowIndicator
	 * CashOutForecast4.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast3.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#mmExceptionalCashFlowIndicator
	 * CashInForecast1.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#mmExceptionalCashFlowIndicator
	 * CashOutForecast1.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast2.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#mmExceptionalCashFlowIndicator
	 * CashInForecast3.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmExceptionalCashFlowIndicator
	 * CashOutForecast3.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast4.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast2.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast4.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast1.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast3.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast7.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast6.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast5.mmExceptionalNetCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmExceptionalCashFlowIndicator
	 * CashOutForecast5.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#mmExceptionalCashFlowIndicator
	 * CashInForecast5.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmExceptionalCashFlowIndicator
	 * CashOutForecast6.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#mmExceptionalCashFlowIndicator
	 * CashInForecast6.mmExceptionalCashFlowIndicator}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmExceptionalCashFlowIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashInForecast2.mmExceptionalCashFlowIndicator, CashOutForecast2.mmExceptionalCashFlowIndicator, FundCashForecast1.mmExceptionalNetCashFlowIndicator,
					CashInForecast4.mmExceptionalCashFlowIndicator, CashOutForecast4.mmExceptionalCashFlowIndicator, FundCashForecast3.mmExceptionalNetCashFlowIndicator, CashInForecast1.mmExceptionalCashFlowIndicator,
					CashOutForecast1.mmExceptionalCashFlowIndicator, FundCashForecast2.mmExceptionalNetCashFlowIndicator, CashInForecast3.mmExceptionalCashFlowIndicator, CashOutForecast3.mmExceptionalCashFlowIndicator,
					FundCashForecast4.mmExceptionalNetCashFlowIndicator, EstimatedFundCashForecast2.mmExceptionalNetCashFlowIndicator, EstimatedFundCashForecast4.mmExceptionalNetCashFlowIndicator,
					EstimatedFundCashForecast1.mmExceptionalNetCashFlowIndicator, EstimatedFundCashForecast3.mmExceptionalNetCashFlowIndicator, FundCashForecast7.mmExceptionalNetCashFlowIndicator,
					EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator, FundCashForecast6.mmExceptionalNetCashFlowIndicator, EstimatedFundCashForecast5.mmExceptionalNetCashFlowIndicator,
					CashOutForecast5.mmExceptionalCashFlowIndicator, CashInForecast5.mmExceptionalCashFlowIndicator, CashOutForecast6.mmExceptionalCashFlowIndicator, CashInForecast6.mmExceptionalCashFlowIndicator);
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected FlowDirectionTypeCode flowDirection;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast1#mmFlowDirection
	 * NetCashForecast1.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmFlowDirection
	 * NetCashForecast2.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#mmFlowDirection
	 * NetCashForecast3.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmFlowDirection
	 * NetCashForecast4.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmFlowDirection
	 * NetCashForecast5.mmFlowDirection}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmFlowDirection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(NetCashForecast1.mmFlowDirection, NetCashForecast2.mmFlowDirection, NetCashForecast3.mmFlowDirection, NetCashForecast4.mmFlowDirection, NetCashForecast5.mmFlowDirection);
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FlowDirection";
			definition = "Specifies the direction of the cash flow from the perspective of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FlowDirectionTypeCode.mmObject();
		}
	};
	protected BookEntry fundSubscriptionAccountEntry;
	/**
	 * Account entry which is linked to a fund subscription process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
	 * BookEntry.mmFundSubscriptionCashInFlow}</li>
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
	public static final MMBusinessAssociationEnd mmFundSubscriptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionAccountEntry";
			definition = "Account entry which is linked to a fund subscription process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmFundSubscriptionCashInFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected BookEntry fundRedemptionAccountEntry;
	/**
	 * Account entry which is linked to a fund redemption process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
	 * BookEntry.mmFundRedemptionCashOutFlow}</li>
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
	public static final MMBusinessAssociationEnd mmFundRedemptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionAccountEntry";
			definition = "Account entry which is linked to a fund redemption process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmFundRedemptionCashOutFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected InvestmentFundOrderExecution relatedOrder;
	/**
	 * Trade which is the source for the calculation of the cash flow movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
	 * InvestmentFundOrderExecution.mmCashFlow}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Trade which is the source for the calculation of the cash flow movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected YesNoIndicator netIndicator;
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
	public static final MMBusinessAttribute mmNetIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetIndicator";
			definition = "Indicates whether the cash flow is the result of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Net asset value incorporating the net cash flow for a valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
	 * NetAssetValueCalculation.mmFundsCashFlow}</li>
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
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value incorporating the net cash flow for a valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmFundsCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected SecuritiesQuantity cashFlowQuantity;
	/**
	 * Value and quantity of the cash flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
	 * SecuritiesQuantity.mmRelatedCashFlow}</li>
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
	public static final MMBusinessAssociationEnd mmCashFlowQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFlowQuantity";
			definition = "Value and quantity of the cash flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundsCashFlow";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.mmFundsCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCashFlow,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmCashFlow, com.tools20022.repository.entity.BookEntry.mmFundSubscriptionCashInFlow,
						com.tools20022.repository.entity.BookEntry.mmFundRedemptionCashOutFlow);
				derivationElement_lazy = () -> Arrays.asList(FundCashForecast1.mmCashInForecastDetails, FundCashForecast1.mmCashOutForecastDetails, FundCashForecast1.mmNetCashForecastDetails,
						FundConfirmedCashForecastReport1.mmFundCashForecastDetails, FundCashForecast3.mmCashInForecastDetails, FundCashForecast3.mmCashOutForecastDetails, FundCashForecast3.mmNetCashForecastDetails,
						FundConfirmedCashForecastReport2.mmFundCashForecastDetails, FundConfirmedCashForecastReport2.mmConsolidatedNetCashForecast, CashOutForecast1.mmCashOutBreakdownDetails, ForecastParameter2.mmCashInForecastDetails,
						ForecastParameter2.mmCashOutForecastDetails, ForecastParameter2.mmNetCashForecastDetails, FundCashForecast2.mmNetCashForecastDetails, CashOutForecast3.mmCashOutBreakdownDetails,
						FundCashForecast4.mmNetCashForecastDetails, FundDetailedConfirmedCashForecastReport2.mmFundCashForecastDetails, FundDetailedConfirmedCashForecastReport2.mmConsolidatedNetCashForecast,
						FundDetailedConfirmedCashForecastReport1.mmFundCashForecastDetails, ForecastParameter1.mmEstimatedCashInForecastDetails, ForecastParameter1.mmEstimatedCashOutForecastDetails,
						ForecastParameter1.mmEstimatedNetCashForecastDetails, EstimatedFundCashForecast2.mmEstimatedNetCashForecastDetails, EstimatedFundCashForecast4.mmEstimatedNetCashForecastDetails,
						EstimatedFundCashForecast1.mmEstimatedCashInForecastDetails, EstimatedFundCashForecast1.mmEstimatedCashOutForecastDetails, EstimatedFundCashForecast1.mmEstimatedNetCashForecastDetails,
						EstimatedFundCashForecast3.mmEstimatedCashInForecastDetails, EstimatedFundCashForecast3.mmEstimatedCashOutForecastDetails, EstimatedFundCashForecast3.mmEstimatedNetCashForecastDetails,
						FundCashForecast7.mmCashInForecastDetails, FundCashForecast7.mmCashOutForecastDetails, FundCashForecast7.mmNetCashForecastDetails, Fund2.mmCashInForecastDetails, Fund2.mmCashOutForecastDetails,
						Fund2.mmNetCashForecastDetails, EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails, EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails,
						EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails, Fund1.mmEstimatedCashInForecastDetails, Fund1.mmEstimatedCashOutForecastDetails, Fund1.mmEstimatedNetCashForecastDetails,
						FundConfirmedCashForecastReport3.mmFundCashForecastDetails, FundConfirmedCashForecastReport3.mmConsolidatedNetCashForecast, FundCashForecast6.mmNetCashForecastDetails,
						FundDetailedConfirmedCashForecastReport3.mmFundCashForecastDetails, FundDetailedConfirmedCashForecastReport3.mmConsolidatedNetCashForecast, EstimatedFundCashForecast5.mmEstimatedNetCashForecastDetails,
						CashOutForecast5.mmCashOutBreakdownDetails);
				element_lazy = () -> Arrays.asList(FundsCashFlow.mmExceptionalCashFlowIndicator, FundsCashFlow.mmFlowDirection, FundsCashFlow.mmFundSubscriptionAccountEntry, FundsCashFlow.mmFundRedemptionAccountEntry,
						FundsCashFlow.mmRelatedOrder, FundsCashFlow.mmNetIndicator, FundsCashFlow.mmNetAssetValueCalculation, FundsCashFlow.mmCashFlowQuantity);
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

	public YesNoIndicator getExceptionalCashFlowIndicator() {
		return exceptionalCashFlowIndicator;
	}

	public void setExceptionalCashFlowIndicator(YesNoIndicator exceptionalCashFlowIndicator) {
		this.exceptionalCashFlowIndicator = exceptionalCashFlowIndicator;
	}

	public FlowDirectionTypeCode getFlowDirection() {
		return flowDirection;
	}

	public void setFlowDirection(FlowDirectionTypeCode flowDirection) {
		this.flowDirection = flowDirection;
	}

	public BookEntry getFundSubscriptionAccountEntry() {
		return fundSubscriptionAccountEntry;
	}

	public void setFundSubscriptionAccountEntry(com.tools20022.repository.entity.BookEntry fundSubscriptionAccountEntry) {
		this.fundSubscriptionAccountEntry = fundSubscriptionAccountEntry;
	}

	public BookEntry getFundRedemptionAccountEntry() {
		return fundRedemptionAccountEntry;
	}

	public void setFundRedemptionAccountEntry(com.tools20022.repository.entity.BookEntry fundRedemptionAccountEntry) {
		this.fundRedemptionAccountEntry = fundRedemptionAccountEntry;
	}

	public InvestmentFundOrderExecution getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.InvestmentFundOrderExecution relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public YesNoIndicator getNetIndicator() {
		return netIndicator;
	}

	public void setNetIndicator(YesNoIndicator netIndicator) {
		this.netIndicator = netIndicator;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public SecuritiesQuantity getCashFlowQuantity() {
		return cashFlowQuantity;
	}

	public void setCashFlowQuantity(com.tools20022.repository.entity.SecuritiesQuantity cashFlowQuantity) {
		this.cashFlowQuantity = cashFlowQuantity;
	}
}