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
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.choice.TradeDate4Choice;
import com.tools20022.repository.choice.TradingDateCode1Choice;
import com.tools20022.repository.codeset.NettingEligibleCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of an order between at least two parties. A trade relates to the
 * delivery of goods and services, cash or securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Trade" src="doc-files/Trade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#TradeDateTime
 * Trade.TradeDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#TradeCommission
 * Trade.TradeCommission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#ValueDate
 * Trade.ValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#EndDate Trade.EndDate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#TradeRelatedIdentifications
 * Trade.TradeRelatedIdentifications}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#AllocationIndicator
 * Trade.AllocationIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#CollateralisationType
 * Trade.CollateralisationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#BlockIndicator
 * Trade.BlockIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#SettlementNetting
 * Trade.SettlementNetting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#TradePartyRole
 * Trade.TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Obligation
 * Trade.Obligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#RelatedNegotiation
 * Trade.RelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#GoverningDocument
 * Trade.GoverningDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#StartDate
 * Trade.StartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#System Trade.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Asset Trade.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Market Trade.Market}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Guarantee
 * Trade.Guarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Settlement
 * Trade.Settlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Order Trade.Order}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Leg Trade.Leg}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#FinancialTransaction
 * Trade.FinancialTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Reconciliation
 * Trade.Reconciliation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Trade Asset.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Trade
 * Commission.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Trade
 * Obligation.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#Trade
 * TradeIdentification.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#Trade
 * TradePartyRole.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Trade System.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Settlement#Trade
 * Settlement.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#Trade Leg.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#TradeExecution
 * Negotiation.TradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#GovernedTrades
 * MasterAgreement.GovernedTrades}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#GuaranteedTrade
 * Guarantee.GuaranteedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reconciliation#ReconciledTrades
 * Reconciliation.ReconciledTrades}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#Trade Market.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Order#Trade Order.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialTransaction#Trade
 * FinancialTransaction.Trade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradingDateCode1Choice#Code
 * TradingDateCode1Choice.Code}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeDate4Choice#Date
 * TradeDate4Choice.Date}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeDate4Choice#Value
 * TradeDate4Choice.Value}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryTrade TreasuryTrade}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
 * DateAndDateTime1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradingDateCode1Choice
 * TradingDateCode1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeDate4Choice
 * TradeDate4Choice}</li>
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
 * "Trade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities."
 * </li>
 * </ul>
 */
public class Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the date/time on which the trade was executed.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters2#TradeDateTime
	 * FundCashForecastParameters2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#TradeDateTime
	 * PriceValuation2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice#Date
	 * DateAndDateTime1Choice.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice#DateTime
	 * DateAndDateTime1Choice.DateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer4#TradeDate
	 * Transfer4.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#TradeDate
	 * Transfer7.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#TradeDate
	 * Transfer17.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer2#TradeDate
	 * Transfer2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#TradeDate
	 * Transfer10.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#TradeDate
	 * Transfer14.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#TradeDate
	 * Transfer24.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer25#TradeDate
	 * Transfer25.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#TradeDate
	 * TransactionDetails10.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#TradeDate
	 * TransactionDetails29.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#TradeDate
	 * SecuritiesTradeDetails25.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#TradeDate
	 * SecuritiesTradeDetails26.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#TradeDate
	 * TransactionDetails28.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#TradeDate
	 * TransactionDetails31.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#TradeDate
	 * TransactionDetails44.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#TradeDate
	 * SecuritiesTradeDetails27.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#TradeDate
	 * SecuritiesTradeDetails28.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#TradeDate
	 * Transfer18.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#TransferOrderDateForm
	 * Transfer18.TransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#TradeDate
	 * Transfer26.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#TransferOrderDateForm
	 * Transfer26.TransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#TradeDate
	 * Transfer13.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#TransferOrderDateForm
	 * Transfer13.TransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#TradeDate
	 * Transfer23.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#TransferOrderDateForm
	 * Transfer23.TransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#TransferOrderDateForm
	 * Transfer11.TransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#TransferOrderDateForm
	 * Transfer19.TransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#TradeDate
	 * SecuritiesTradeDetails6.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#TradeDate
	 * SecuritiesTradeDetails13.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#TradeDate
	 * SecuritiesTradeDetails3.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#TradeDate
	 * SecuritiesTradeDetails11.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#TradeDate
	 * SecuritiesTradeDetails2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#TradeDate
	 * SecuritiesTradeDetails16.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#TradeDate
	 * SecuritiesTradeDetails1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#TradeDate
	 * SecuritiesTradeDetails15.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#TradeDate
	 * TransactionDetails5.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#TradeDate
	 * TransactionDetails9.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#TradeDate
	 * TransactionDetails22.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#TradeDate
	 * TransactionDetails23.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#TradeDate
	 * TransactionDetails36.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#TradeDate
	 * TransactionDetails47.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#TradeDate
	 * TransactionDetails53.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#TradeDate
	 * TransactionDetails58.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#TradeDate
	 * TransactionDetails7.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#TradeDate
	 * TransactionDetails8.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#TradeDate
	 * TransactionDetails16.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#TradeDate
	 * TransactionDetails17.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#TradeDate
	 * TransactionDetails26.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#TradeDate
	 * TransactionDetails25.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#TradeDate
	 * TransactionDetails27.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#TradeDate
	 * TransactionDetails33.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#TradeDate
	 * TransactionDetails39.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#TradeDate
	 * TransactionDetails50.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#TradeDate
	 * TransactionDetails56.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#TradeDate
	 * TransactionDetails59.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#TradeDate
	 * TransactionDetails6.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#TradeDate
	 * TransactionDetails18.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#TradeDate
	 * TransactionDetails24.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#TradeDate
	 * TransactionDetails34.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#TradeDate
	 * TransactionDetails37.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#TradeDate
	 * TransactionDetails48.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#TradeDate
	 * TransactionDetails57.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#TradeDate
	 * TransactionDetails60.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#TradeDate
	 * Order3.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill1#TradeDate
	 * PartialFill1.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#TradeDate
	 * Order16.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#TradeDate
	 * Order14.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#TradeDate
	 * TwoLegTransactionDetails1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#TradeDate
	 * TransactionDates1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#TransactionDateTime
	 * TransactionDates1.TransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#TradeDate
	 * TransactionDates2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#TransactionDateTime
	 * TransactionDates2.TransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#ExecutionTimestamp
	 * RegulatoryReporting1.ExecutionTimestamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement2#TradeDate
	 * TradeAgreement2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement8#TradeDate
	 * TradeAgreement8.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement1#TradeDate
	 * TradeAgreement1.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement7#TradeDate
	 * TradeAgreement7.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement9#TradeDate
	 * TradeAgreement9.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#TradeDateTime
	 * FundCashForecast1.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#PreviousTradeDateTime
	 * FundCashForecast1.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#TradeDateTime
	 * FundCashForecast3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#PreviousTradeDateTime
	 * FundCashForecast3.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#TradeDateTime
	 * FundCashForecast2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#PreviousTradeDateTime
	 * FundCashForecast2.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#TradeDateTime
	 * FundCashForecast4.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#PreviousTradeDateTime
	 * FundCashForecast4.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#TradeDateTime
	 * EstimatedFundCashForecast2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#PreviousTradeDateTime
	 * EstimatedFundCashForecast2.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#TradeDateTime
	 * EstimatedFundCashForecast4.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#PreviousTradeDateTime
	 * EstimatedFundCashForecast4.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#TradeDateTime
	 * EstimatedFundCashForecast1.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#PreviousTradeDateTime
	 * EstimatedFundCashForecast1.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#TradeDateTime
	 * EstimatedFundCashForecast3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#PreviousTradeDateTime
	 * EstimatedFundCashForecast3.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails1#ExpectedTradeDateTime
	 * ExpectedExecutionDetails1.ExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2#ExpectedTradeDateTime
	 * ExpectedExecutionDetails2.ExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#TradeDateTime
	 * RedemptionExecution3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#TradeDateTime
	 * RedemptionExecution5.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#TradeDateTime
	 * RedemptionExecution4.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#TradeDateTime
	 * RedemptionExecution6.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#TradeDateTime
	 * InvestmentFundTransaction2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#TradeDateTime
	 * InvestmentFundTransaction3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#TradeDateTime
	 * SubscriptionExecution3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#TradeDateTime
	 * SubscriptionExecution5.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#TradeDateTime
	 * SubscriptionExecution4.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#TradeDateTime
	 * SubscriptionExecution6.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#TradeDateTime
	 * SwitchRedemptionLegExecution2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#TradeDateTime
	 * SwitchSubscriptionLegExecution2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#TradeDateTime
	 * SwitchRedemptionLegExecution3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#TradeDateTime
	 * SwitchSubscriptionLegExecution3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#TradeDate
	 * TransferStatusAndReason2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#TradeDateTime
	 * TransactionDetails1.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#TradeDateTime
	 * TransactionDetails3.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#TradeDate
	 * SecuritiesTradeDetails7.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#TradeDate
	 * SecuritiesTradeDetails19.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5#TradeDate
	 * SecuritiesTradeDetails5.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#TradeDate
	 * SecuritiesFinancingTransactionDetails2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#TradeDate
	 * SecuritiesFinancingTransactionDetails8.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#TradeDate
	 * SecuritiesTradeDetails8.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#TradeDate
	 * SecuritiesTradeDetails18.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#TradeDate
	 * SecuritiesTradeDetails4.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#TradeDate
	 * SecuritiesTradeDetails17.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#TradeDate
	 * TransactionDetails4.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#TradeDate
	 * TransactionDetails30.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData1#TradeDate
	 * OpeningData1.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ClosingData1#TradeDate
	 * ClosingData1.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData2#TradeDate
	 * OpeningData2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ClosingData2#TradeDate
	 * ClosingData2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData1#TradeDate
	 * OptionData1.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData2#TradeDate
	 * OptionData2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12#TradeDate
	 * SecuritiesTradeDetails12.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#TradeDate
	 * SecuritiesFinancingTransactionDetails6.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#TradeDate
	 * SecuritiesFinancingTransactionDetails10.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#TradeDate
	 * SecuritiesFinancingTransactionDetails17.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#TradeDate
	 * SecuritiesFinancingTransactionDetails18.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#TradeDate
	 * TransactionDetails20.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#TradeDate
	 * SecuritiesTradeDetails9.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#TradeDate
	 * SecuritiesTradeDetails21.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#TradeDate
	 * SecuritiesTradeDetails10.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#TradeDate
	 * SecuritiesTradeDetails22.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#TradeDate
	 * SecuritiesTradeDetails23.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#TradeDate
	 * SecuritiesTradeDetails29.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#TradeDate
	 * TransactionDetails40.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#TradeDate
	 * TransactionDetails42.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#TradeDate
	 * TransactionDetails46.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#TradeDate
	 * TransactionDetails32.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#TradeDate
	 * TransactionDetails14.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#TradeDate
	 * TransactionDetails35.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#TradeDate
	 * SecuritiesTradeDetails14.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#TradeDate
	 * SecuritiesTradeDetails20.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#TradeDate
	 * SecuritiesTradeDetails24.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#TradeDate
	 * SecuritiesTradeDetails30.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#TradeDate
	 * TransactionDetails45.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#TradeDate
	 * SettlementObligation1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#TradeDate
	 * SettlementObligation6.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#TradeDate
	 * SettlementObligation3.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#TradeDate
	 * SettlementObligation2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TradeDate3Choice#Date
	 * TradeDate3Choice.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#TradeDate
	 * SettlementObligation5.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#TradeDate
	 * SettlementObligation4.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#TradeDate
	 * TradeLeg2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#TradeDate
	 * TradeLeg5.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#TradeDate
	 * TradeLeg1.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#TradeDate
	 * TradeLeg3.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#TradeDate
	 * TradeLeg6.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#TradeDate
	 * TradeLeg4.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#TradeDate
	 * TradeLeg7.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetPosition2#TradeDate
	 * NetPosition2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#ExpectedTradeDateTime
	 * ExpectedExecutionDetails3.ExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#TradeDateTime
	 * RedemptionExecution10.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#TradeDateTime
	 * SubscriptionExecution7.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#TradeDateTime
	 * RedemptionExecution12.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#TradeDateTime
	 * SubscriptionExecution9.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#TradeDate
	 * TransactionDetails51.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#TradeDate
	 * TransactionDetails52.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#TradeDate
	 * Order9.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#TradeDate
	 * Bid1.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#TradeDate
	 * Order6.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List2#TradeDate
	 * List2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData3#TradeDate
	 * OptionData3.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData4#TradeDate
	 * OptionData4.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#TransferOrderDateForm
	 * Transfer27.TransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#TradeDate
	 * Transfer28.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#TransferOrderDateForm
	 * Transfer28.TransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#TradeDate
	 * Transfer29.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#TransferOrderDateForm
	 * Transfer29.TransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#TradeDate
	 * TransferStatusAndReason3.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#TradeDate
	 * TransactionDetails61.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#TradeDate
	 * SecuritiesFinancingTransactionDetails21.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#TradeDate
	 * TransactionDetails62.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#TradeDate
	 * TransactionDetails63.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#Date
	 * Garnishment1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#TradeDate
	 * SecuritiesTradeDetails31.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#TradeDate
	 * SecuritiesTradeDetails33.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#TradeDate
	 * SecuritiesTradeDetails35.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#TradeDate
	 * SecuritiesTradeDetails38.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#TradeDate
	 * SecuritiesTradeDetails37.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#TradeDate
	 * SecuritiesTradeDetails36.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#TradeDate
	 * SecuritiesTradeDetails34.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#TradeDate
	 * SecuritiesTradeDetails32.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#TradeDate
	 * Order17.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#TradeDate
	 * Order18.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2#TradeDate
	 * PartialFill2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#TradeDate
	 * SecuritiesTradeDetails44.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#TradeDate
	 * SecuritiesTradeDetails39.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#TradeDate
	 * SecuritiesTradeDetails43.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#TradeDate
	 * SecuritiesTradeDetails41.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#TradeDate
	 * SecuritiesFinancingTransactionDetails22.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#TradeDate
	 * SecuritiesTradeDetails40.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#TradeDate
	 * TransactionDetails66.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#TradeDate
	 * SecuritiesTradeDetails42.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#TradeDate
	 * TransactionDetails67.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#TradeDate
	 * TransactionDetails68.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#TradeDate
	 * SecuritiesTradeDetails46.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#TradeDate
	 * SecuritiesTradeDetails47.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement11#TradeDate
	 * TradeAgreement11.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#ExecutionTimestamp
	 * RegulatoryReporting4.ExecutionTimestamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement12#TradeDate
	 * TradeAgreement12.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement10#TradeDate
	 * TradeAgreement10.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#TradeDateTime
	 * FundCashForecast7.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#PreviousTradeDateTime
	 * FundCashForecast7.PreviousTradeDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#TradeDateTime
	 * Fund2.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#PreviousTradeDateTime
	 * Fund2.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#TradeDateTime
	 * EstimatedFundCashForecast6.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#PreviousTradeDateTime
	 * EstimatedFundCashForecast6.PreviousTradeDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#TradeDateTime
	 * Fund1.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#PreviousTradeDateTime
	 * Fund1.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#TradeDateTime
	 * FundCashForecast6.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#PreviousTradeDateTime
	 * FundCashForecast6.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#TradeDateTime
	 * EstimatedFundCashForecast5.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#PreviousTradeDateTime
	 * EstimatedFundCashForecast5.PreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#TradeDateTime
	 * InvestmentFundTransaction4.TradeDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#TradeDate
	 * TradeLeg8.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#TransactionDateTime
	 * TradeLeg8.TransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#TradeDate
	 * SecuritiesFinancingTransactionDetails24.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#TradeDate
	 * TransactionDetails70.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#TradeDate
	 * TransactionDetails69.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#TradeDate
	 * SettlementObligation7.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#TradeDate
	 * NetPosition3.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#TradeDate
	 * TradeLeg10.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#TransactionDateAndTime
	 * TradeLeg10.TransactionDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#TradeDate
	 * TradeLeg9.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#TransactionDateAndTime
	 * TradeLeg9.TransactionDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#TradeDate
	 * SettlementObligation8.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails88#TradeDate
	 * SettlementDetails88.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#TradeDate
	 * TransactionDetails71.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#TradeDate
	 * SecuritiesFinancingTransactionDetails25.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#TradeDate
	 * TransactionDetails72.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#TradeDate
	 * ForeignExchangeSwapTransaction1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#TradeDate
	 * UnsecuredMarketTransaction1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#TradeDate
	 * OvernightIndexSwapTransaction1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#TradeDate
	 * SecuredMarketTransaction1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#TradeDate
	 * SecuritiesTransaction1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#TradeDate
	 * TransactionDetails81.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#TradeDate
	 * TransactionDetails74.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#TradeDate
	 * SecuritiesTradeDetails49.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#TradeDate
	 * TransactionDetails82.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#TradeDate
	 * SecuritiesFinancingTransactionDetails26.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#TradeDate
	 * TransactionDetails79.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#TradeDate
	 * SecuritiesTradeDetails48.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#TradeDate
	 * TransactionDetails80.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#TradeDate
	 * TransactionDetails75.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#TradeDate
	 * TransactionDetails78.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade2#TradeDate
	 * Trade2.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade1#DateAndTime
	 * Trade1.DateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#TradeDate
	 * SecuritiesTradeDetails51.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#TradeDate
	 * SecuritiesTradeDetails53.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#TradeDate
	 * SecuritiesTradeDetails55.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#TradeDate
	 * SecuritiesTradeDetails56.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#TradeDate
	 * SecuritiesTradeDetails54.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#TradeDate
	 * SecuritiesTradeDetails52.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#TradeDate
	 * SecuritiesTradeDetails50.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#TradeDate
	 * Transfer31.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#TransferOrderDateForm
	 * Transfer31.TransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#TransferOrderDateForm
	 * Transfer30.TransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#TradeDate
	 * Transfer33.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#TransferOrderDateForm
	 * Transfer33.TransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#TradeDate
	 * TransferStatusAndReason4.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1#Date
	 * TreasuryProfile1.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails102#TradeDate
	 * SettlementDetails102.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#TradeDate
	 * SecuritiesTradeDetails57.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#TradeDate
	 * SecuritiesTradeDetails59.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#TradeDate
	 * SecuritiesFinancingTransactionDetails33.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#TradeDate
	 * TransactionDetails88.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#TradeDate
	 * SecuritiesTradeDetails58.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#TradeDate
	 * SecuritiesTradeDetails61.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#TradeDate
	 * TransactionDetails92.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#TradeDate
	 * TransactionDetails84.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#TradeDate
	 * SecuritiesTradeDetails63.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#TradeDate
	 * TransactionDetails83.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#TradeDate
	 * SecuritiesTradeDetails62.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#TradeDate
	 * TransactionDetails87.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#TradeDate
	 * SecuritiesTradeDetails60.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#TradeDate
	 * TransactionDetails91.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#TradeDate
	 * TransactionDetails90.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#TradeDate
	 * SecuritiesTradeDetails65.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#TradeDate
	 * SecuritiesTradeDetails66.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#TradeDate
	 * UnsecuredMarketTransaction2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#TradeDate
	 * ForeignExchangeSwapTransaction2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#TradeDate
	 * SecuredMarketTransaction2.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#TradeDate
	 * UnsecuredMarketTransaction3.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#TradeDate
	 * OvernightIndexSwapTransaction3.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#TradeDate
	 * SecuredMarketTransaction3.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#TradeDateTime
	 * SubscriptionExecution13.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#TradeDateTime
	 * SubscriptionExecution12.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4#ExpectedTradeDateTime
	 * ExpectedExecutionDetails4.ExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#TradeDateTime
	 * RedemptionExecution16.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#TradeDateTime
	 * SwitchSubscriptionLegExecution4.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#TradeDateTime
	 * RedemptionExecution15.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#TradeDateTime
	 * SwitchRedemptionLegExecution4.TradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#ReportingDate
	 * TransparencyDataReport11.ReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#ReportingDate
	 * TransparencyDataReport13.ReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#ReportingDate
	 * TransparencyDataReport15.ReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#ReportingDate
	 * TransparencyDataReport10.ReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#ExecutionTimestamp
	 * RegulatoryReporting6.ExecutionTimestamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#ConfirmationDateAndTimestamp
	 * RegulatoryReporting6.ConfirmationDateAndTimestamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement15#TradeDate
	 * TradeAgreement15.TradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement14#TradeDate
	 * TradeAgreement14.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#TradeDate
	 * SecuritiesTradeDetails67.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#TradeDate
	 * SecuritiesTradeDetails68.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#TradeDate
	 * TransactionDetails97.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#TradeDate
	 * SecuritiesFinancingTransactionDetails35.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#TradeDate
	 * TransactionDetails96.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#TradeDate
	 * TransactionDetails95.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#TradeDate
	 * SettlementDetails118.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#TradeDate
	 * SecuritiesTradeDetails69.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#TradeDate
	 * SecuritiesTradeDetails70.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#TradeDate
	 * SecuritiesFinancingTransactionDetails36.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#TradeDate
	 * TransactionDetails100.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#TradeDate
	 * TransactionDetails99.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#TradeDate
	 * TransactionDetails98.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#TradeDate
	 * FixingConditions1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#TradeDate
	 * SecuredMarketTransaction4.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#TradeDate
	 * ForeignExchangeSwapTransaction3.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#TradeDate
	 * OvernightIndexSwapTransaction4.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#TradeDate
	 * UnsecuredMarketTransaction4.TradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters2.TradeDateTime, com.tools20022.repository.msg.PriceValuation2.TradeDateTime,
					com.tools20022.repository.choice.DateAndDateTime1Choice.Date, com.tools20022.repository.choice.DateAndDateTime1Choice.DateTime, com.tools20022.repository.msg.Transfer4.TradeDate,
					com.tools20022.repository.msg.Transfer7.TradeDate, com.tools20022.repository.msg.Transfer17.TradeDate, com.tools20022.repository.msg.Transfer2.TradeDate, com.tools20022.repository.msg.Transfer10.TradeDate,
					com.tools20022.repository.msg.Transfer14.TradeDate, com.tools20022.repository.msg.Transfer24.TradeDate, com.tools20022.repository.msg.Transfer25.TradeDate, com.tools20022.repository.msg.TransactionDetails10.TradeDate,
					com.tools20022.repository.msg.TransactionDetails29.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails25.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails26.TradeDate,
					com.tools20022.repository.msg.TransactionDetails28.TradeDate, com.tools20022.repository.msg.TransactionDetails31.TradeDate, com.tools20022.repository.msg.TransactionDetails44.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails28.TradeDate, com.tools20022.repository.msg.Transfer18.TradeDate,
					com.tools20022.repository.msg.Transfer18.TransferOrderDateForm, com.tools20022.repository.msg.Transfer26.TradeDate, com.tools20022.repository.msg.Transfer26.TransferOrderDateForm,
					com.tools20022.repository.msg.Transfer13.TradeDate, com.tools20022.repository.msg.Transfer13.TransferOrderDateForm, com.tools20022.repository.msg.Transfer23.TradeDate,
					com.tools20022.repository.msg.Transfer23.TransferOrderDateForm, com.tools20022.repository.msg.Transfer11.TransferOrderDateForm, com.tools20022.repository.msg.Transfer19.TransferOrderDateForm,
					com.tools20022.repository.msg.SecuritiesTradeDetails6.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails13.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails3.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails11.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails2.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails16.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails15.TradeDate, com.tools20022.repository.msg.TransactionDetails5.TradeDate,
					com.tools20022.repository.msg.TransactionDetails9.TradeDate, com.tools20022.repository.msg.TransactionDetails22.TradeDate, com.tools20022.repository.msg.TransactionDetails23.TradeDate,
					com.tools20022.repository.msg.TransactionDetails36.TradeDate, com.tools20022.repository.msg.TransactionDetails47.TradeDate, com.tools20022.repository.msg.TransactionDetails53.TradeDate,
					com.tools20022.repository.msg.TransactionDetails58.TradeDate, com.tools20022.repository.msg.TransactionDetails7.TradeDate, com.tools20022.repository.msg.TransactionDetails8.TradeDate,
					com.tools20022.repository.msg.TransactionDetails16.TradeDate, com.tools20022.repository.msg.TransactionDetails17.TradeDate, com.tools20022.repository.msg.TransactionDetails26.TradeDate,
					com.tools20022.repository.msg.TransactionDetails25.TradeDate, com.tools20022.repository.msg.TransactionDetails27.TradeDate, com.tools20022.repository.msg.TransactionDetails33.TradeDate,
					com.tools20022.repository.msg.TransactionDetails39.TradeDate, com.tools20022.repository.msg.TransactionDetails50.TradeDate, com.tools20022.repository.msg.TransactionDetails56.TradeDate,
					com.tools20022.repository.msg.TransactionDetails59.TradeDate, com.tools20022.repository.msg.TransactionDetails6.TradeDate, com.tools20022.repository.msg.TransactionDetails18.TradeDate,
					com.tools20022.repository.msg.TransactionDetails24.TradeDate, com.tools20022.repository.msg.TransactionDetails34.TradeDate, com.tools20022.repository.msg.TransactionDetails37.TradeDate,
					com.tools20022.repository.msg.TransactionDetails48.TradeDate, com.tools20022.repository.msg.TransactionDetails57.TradeDate, com.tools20022.repository.msg.TransactionDetails60.TradeDate,
					com.tools20022.repository.msg.Order3.TradeDate, com.tools20022.repository.msg.PartialFill1.TradeDate, com.tools20022.repository.msg.Order16.TradeDate, com.tools20022.repository.msg.Order14.TradeDate,
					com.tools20022.repository.msg.TwoLegTransactionDetails1.TradeDate, com.tools20022.repository.msg.TransactionDates1.TradeDate, com.tools20022.repository.msg.TransactionDates1.TransactionDateTime,
					com.tools20022.repository.msg.TransactionDates2.TradeDate, com.tools20022.repository.msg.TransactionDates2.TransactionDateTime, com.tools20022.repository.msg.RegulatoryReporting1.ExecutionTimestamp,
					com.tools20022.repository.msg.TradeAgreement2.TradeDate, com.tools20022.repository.msg.TradeAgreement8.TradeDate, com.tools20022.repository.msg.TradeAgreement1.TradeDate,
					com.tools20022.repository.msg.TradeAgreement7.TradeDate, com.tools20022.repository.msg.TradeAgreement9.TradeDate, com.tools20022.repository.msg.FundCashForecast1.TradeDateTime,
					com.tools20022.repository.msg.FundCashForecast1.PreviousTradeDateTime, com.tools20022.repository.msg.FundCashForecast3.TradeDateTime, com.tools20022.repository.msg.FundCashForecast3.PreviousTradeDateTime,
					com.tools20022.repository.msg.FundCashForecast2.TradeDateTime, com.tools20022.repository.msg.FundCashForecast2.PreviousTradeDateTime, com.tools20022.repository.msg.FundCashForecast4.TradeDateTime,
					com.tools20022.repository.msg.FundCashForecast4.PreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast2.TradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast2.PreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast4.TradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast4.PreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast1.TradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.PreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast3.TradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast3.PreviousTradeDateTime, com.tools20022.repository.msg.ExpectedExecutionDetails1.ExpectedTradeDateTime,
					com.tools20022.repository.msg.ExpectedExecutionDetails2.ExpectedTradeDateTime, com.tools20022.repository.msg.RedemptionExecution3.TradeDateTime, com.tools20022.repository.msg.RedemptionExecution5.TradeDateTime,
					com.tools20022.repository.msg.RedemptionExecution4.TradeDateTime, com.tools20022.repository.msg.RedemptionExecution6.TradeDateTime, com.tools20022.repository.msg.InvestmentFundTransaction2.TradeDateTime,
					com.tools20022.repository.msg.InvestmentFundTransaction3.TradeDateTime, com.tools20022.repository.msg.SubscriptionExecution3.TradeDateTime, com.tools20022.repository.msg.SubscriptionExecution5.TradeDateTime,
					com.tools20022.repository.msg.SubscriptionExecution4.TradeDateTime, com.tools20022.repository.msg.SubscriptionExecution6.TradeDateTime, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.TradeDateTime,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.TradeDateTime, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.TradeDateTime,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.TradeDateTime, com.tools20022.repository.msg.TransferStatusAndReason2.TradeDate, com.tools20022.repository.msg.TransactionDetails1.TradeDateTime,
					com.tools20022.repository.msg.TransactionDetails3.TradeDateTime, com.tools20022.repository.msg.SecuritiesTradeDetails7.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails19.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails5.TradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails8.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails18.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails17.TradeDate, com.tools20022.repository.msg.TransactionDetails4.TradeDate,
					com.tools20022.repository.msg.TransactionDetails30.TradeDate, com.tools20022.repository.msg.OpeningData1.TradeDate, com.tools20022.repository.msg.ClosingData1.TradeDate,
					com.tools20022.repository.msg.OpeningData2.TradeDate, com.tools20022.repository.msg.ClosingData2.TradeDate, com.tools20022.repository.msg.OptionData1.TradeDate, com.tools20022.repository.msg.OptionData2.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails12.TradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.TradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.TradeDate, com.tools20022.repository.msg.TransactionDetails20.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails9.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails21.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails10.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails22.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails29.TradeDate, com.tools20022.repository.msg.TransactionDetails40.TradeDate,
					com.tools20022.repository.msg.TransactionDetails42.TradeDate, com.tools20022.repository.msg.TransactionDetails46.TradeDate, com.tools20022.repository.msg.TransactionDetails32.TradeDate,
					com.tools20022.repository.msg.TransactionDetails14.TradeDate, com.tools20022.repository.msg.TransactionDetails35.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails14.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails24.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails30.TradeDate,
					com.tools20022.repository.msg.TransactionDetails45.TradeDate, com.tools20022.repository.msg.SettlementObligation1.TradeDate, com.tools20022.repository.msg.SettlementObligation6.TradeDate,
					com.tools20022.repository.msg.SettlementObligation3.TradeDate, com.tools20022.repository.msg.SettlementObligation2.TradeDate, com.tools20022.repository.choice.TradeDate3Choice.Date,
					com.tools20022.repository.msg.SettlementObligation5.TradeDate, com.tools20022.repository.msg.SettlementObligation4.TradeDate, com.tools20022.repository.msg.TradeLeg2.TradeDate,
					com.tools20022.repository.msg.TradeLeg5.TradeDate, com.tools20022.repository.msg.TradeLeg1.TradeDate, com.tools20022.repository.msg.TradeLeg3.TradeDate, com.tools20022.repository.msg.TradeLeg6.TradeDate,
					com.tools20022.repository.msg.TradeLeg4.TradeDate, com.tools20022.repository.msg.TradeLeg7.TradeDate, com.tools20022.repository.msg.NetPosition2.TradeDate,
					com.tools20022.repository.msg.ExpectedExecutionDetails3.ExpectedTradeDateTime, com.tools20022.repository.msg.RedemptionExecution10.TradeDateTime, com.tools20022.repository.msg.SubscriptionExecution7.TradeDateTime,
					com.tools20022.repository.msg.RedemptionExecution12.TradeDateTime, com.tools20022.repository.msg.SubscriptionExecution9.TradeDateTime, com.tools20022.repository.msg.TransactionDetails51.TradeDate,
					com.tools20022.repository.msg.TransactionDetails52.TradeDate, com.tools20022.repository.msg.Order9.TradeDate, com.tools20022.repository.msg.Bid1.TradeDate, com.tools20022.repository.msg.Order6.TradeDate,
					com.tools20022.repository.msg.List2.TradeDate, com.tools20022.repository.msg.OptionData3.TradeDate, com.tools20022.repository.msg.OptionData4.TradeDate, com.tools20022.repository.msg.Transfer27.TransferOrderDateForm,
					com.tools20022.repository.msg.Transfer28.TradeDate, com.tools20022.repository.msg.Transfer28.TransferOrderDateForm, com.tools20022.repository.msg.Transfer29.TradeDate,
					com.tools20022.repository.msg.Transfer29.TransferOrderDateForm, com.tools20022.repository.msg.TransferStatusAndReason3.TradeDate, com.tools20022.repository.msg.TransactionDetails61.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.TradeDate, com.tools20022.repository.msg.TransactionDetails62.TradeDate, com.tools20022.repository.msg.TransactionDetails63.TradeDate,
					com.tools20022.repository.msg.Garnishment1.Date, com.tools20022.repository.msg.SecuritiesTradeDetails31.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails33.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails38.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails37.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails36.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails34.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails32.TradeDate,
					com.tools20022.repository.msg.Order17.TradeDate, com.tools20022.repository.msg.Order18.TradeDate, com.tools20022.repository.msg.PartialFill2.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails44.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails39.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails43.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails41.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails40.TradeDate, com.tools20022.repository.msg.TransactionDetails66.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.TradeDate, com.tools20022.repository.msg.TransactionDetails67.TradeDate, com.tools20022.repository.msg.TransactionDetails68.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails46.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails47.TradeDate, com.tools20022.repository.msg.TradeAgreement11.TradeDate,
					com.tools20022.repository.msg.RegulatoryReporting4.ExecutionTimestamp, com.tools20022.repository.msg.TradeAgreement12.TradeDate, com.tools20022.repository.msg.TradeAgreement10.TradeDate,
					com.tools20022.repository.msg.FundCashForecast7.TradeDateTime, com.tools20022.repository.msg.FundCashForecast7.PreviousTradeDateTime, com.tools20022.repository.msg.Fund2.TradeDateTime,
					com.tools20022.repository.msg.Fund2.PreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast6.TradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast6.PreviousTradeDateTime,
					com.tools20022.repository.msg.Fund1.TradeDateTime, com.tools20022.repository.msg.Fund1.PreviousTradeDateTime, com.tools20022.repository.msg.FundCashForecast6.TradeDateTime,
					com.tools20022.repository.msg.FundCashForecast6.PreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast5.TradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.PreviousTradeDateTime, com.tools20022.repository.msg.InvestmentFundTransaction4.TradeDateTime, com.tools20022.repository.msg.TradeLeg8.TradeDate,
					com.tools20022.repository.msg.TradeLeg8.TransactionDateTime, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.TradeDate, com.tools20022.repository.msg.TransactionDetails70.TradeDate,
					com.tools20022.repository.msg.TransactionDetails69.TradeDate, com.tools20022.repository.msg.SettlementObligation7.TradeDate, com.tools20022.repository.msg.NetPosition3.TradeDate,
					com.tools20022.repository.msg.TradeLeg10.TradeDate, com.tools20022.repository.msg.TradeLeg10.TransactionDateAndTime, com.tools20022.repository.msg.TradeLeg9.TradeDate,
					com.tools20022.repository.msg.TradeLeg9.TransactionDateAndTime, com.tools20022.repository.msg.SettlementObligation8.TradeDate, com.tools20022.repository.msg.SettlementDetails88.TradeDate,
					com.tools20022.repository.msg.TransactionDetails71.TradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.TradeDate, com.tools20022.repository.msg.TransactionDetails72.TradeDate,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.TradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction1.TradeDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction1.TradeDate,
					com.tools20022.repository.msg.SecuredMarketTransaction1.TradeDate, com.tools20022.repository.msg.SecuritiesTransaction1.TradeDate, com.tools20022.repository.msg.TransactionDetails81.TradeDate,
					com.tools20022.repository.msg.TransactionDetails74.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails49.TradeDate, com.tools20022.repository.msg.TransactionDetails82.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.TradeDate, com.tools20022.repository.msg.TransactionDetails79.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails48.TradeDate,
					com.tools20022.repository.msg.TransactionDetails80.TradeDate, com.tools20022.repository.msg.TransactionDetails75.TradeDate, com.tools20022.repository.msg.TransactionDetails78.TradeDate,
					com.tools20022.repository.msg.Trade2.TradeDate, com.tools20022.repository.msg.Trade1.DateAndTime, com.tools20022.repository.msg.SecuritiesTradeDetails51.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails55.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails56.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails54.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails52.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails50.TradeDate,
					com.tools20022.repository.msg.Transfer31.TradeDate, com.tools20022.repository.msg.Transfer31.TransferOrderDateForm, com.tools20022.repository.msg.Transfer30.TransferOrderDateForm,
					com.tools20022.repository.msg.Transfer33.TradeDate, com.tools20022.repository.msg.Transfer33.TransferOrderDateForm, com.tools20022.repository.msg.TransferStatusAndReason4.TradeDate,
					com.tools20022.repository.msg.TreasuryProfile1.Date, com.tools20022.repository.msg.SettlementDetails102.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails57.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.TradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.TradeDate, com.tools20022.repository.msg.TransactionDetails88.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails61.TradeDate, com.tools20022.repository.msg.TransactionDetails92.TradeDate,
					com.tools20022.repository.msg.TransactionDetails84.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails63.TradeDate, com.tools20022.repository.msg.TransactionDetails83.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.TradeDate, com.tools20022.repository.msg.TransactionDetails87.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails60.TradeDate,
					com.tools20022.repository.msg.TransactionDetails91.TradeDate, com.tools20022.repository.msg.TransactionDetails90.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails65.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.TradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction2.TradeDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.TradeDate,
					com.tools20022.repository.msg.SecuredMarketTransaction2.TradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction3.TradeDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction3.TradeDate,
					com.tools20022.repository.msg.SecuredMarketTransaction3.TradeDate, com.tools20022.repository.msg.SubscriptionExecution13.TradeDateTime, com.tools20022.repository.msg.SubscriptionExecution12.TradeDateTime,
					com.tools20022.repository.msg.ExpectedExecutionDetails4.ExpectedTradeDateTime, com.tools20022.repository.msg.RedemptionExecution16.TradeDateTime,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.TradeDateTime, com.tools20022.repository.msg.RedemptionExecution15.TradeDateTime, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.TradeDateTime,
					com.tools20022.repository.msg.TransparencyDataReport11.ReportingDate, com.tools20022.repository.msg.TransparencyDataReport13.ReportingDate, com.tools20022.repository.msg.TransparencyDataReport15.ReportingDate,
					com.tools20022.repository.msg.TransparencyDataReport10.ReportingDate, com.tools20022.repository.msg.RegulatoryReporting6.ExecutionTimestamp,
					com.tools20022.repository.msg.RegulatoryReporting6.ConfirmationDateAndTimestamp, com.tools20022.repository.msg.TradeAgreement15.TradeDate, com.tools20022.repository.msg.TradeAgreement14.TradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails67.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails68.TradeDate, com.tools20022.repository.msg.TransactionDetails97.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.TradeDate, com.tools20022.repository.msg.TransactionDetails96.TradeDate, com.tools20022.repository.msg.TransactionDetails95.TradeDate,
					com.tools20022.repository.msg.SettlementDetails118.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails69.TradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails70.TradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.TradeDate, com.tools20022.repository.msg.TransactionDetails100.TradeDate, com.tools20022.repository.msg.TransactionDetails99.TradeDate,
					com.tools20022.repository.msg.TransactionDetails98.TradeDate, com.tools20022.repository.msg.FixingConditions1.TradeDate, com.tools20022.repository.msg.SecuredMarketTransaction4.TradeDate,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.TradeDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.TradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction4.TradeDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Commission parameters associated with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#Trade
	 * Commission.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#CommissionDetails
	 * DeliverInformation4.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#CommissionDetails
	 * DeliverInformation7.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#CommissionDetails
	 * ReceiveInformation4.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#CommissionDetails
	 * ReceiveInformation8.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#CommissionDetails
	 * ReceiveInformation6.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#CommissionDetails
	 * ReceiveInformation11.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#CommissionDetails
	 * DeliverInformation11.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#CommissionDetails
	 * DeliverInformation3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#CommissionDetails
	 * DeliverInformation8.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#CommissionDetails
	 * ReceiveInformation3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#CommissionDetails
	 * ReceiveInformation7.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#CommissionDetails
	 * ReceiveInformation5.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#CommissionDetails
	 * ReceiveInformation9.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#CommissionDetails
	 * DeliverInformation5.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#CommissionDetails
	 * DeliverInformation9.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#CommissionDetails
	 * DeliverInformation6.CommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#CommissionDetails
	 * Order3.CommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#Commission
	 * Order16.Commission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#Commission
	 * Order14.Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#CommissionDetails
	 * FundCashInBreakdown1.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#CommissionDetails
	 * FundCashOutBreakdown1.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#CommissionDetails
	 * FundCashInBreakdown2.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#CommissionDetails
	 * FundCashOutBreakdown2.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#CommissionDetails
	 * RedemptionOrder3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#CommissionDetails
	 * RedemptionOrder5.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#CommissionGeneralDetails
	 * RedemptionExecution3.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#CommissionGeneralDetails
	 * RedemptionExecution5.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#CommissionDetails
	 * RedemptionOrder7.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#CommissionDetails
	 * RedemptionOrder4.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#CommissionDetails
	 * RedemptionOrder6.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#CommissionGeneralDetails
	 * RedemptionExecution4.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#CommissionGeneralDetails
	 * RedemptionExecution6.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#CommissionDetails
	 * RedemptionOrder8.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#CommissionDetails
	 * SubscriptionOrder3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#CommissionDetails
	 * SubscriptionOrder5.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#CommissionGeneralDetails
	 * SubscriptionExecution3.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#CommissionGeneralDetails
	 * SubscriptionExecution5.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#CommissionDetails
	 * SubscriptionOrder7.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#CommissionDetails
	 * SubscriptionOrder4.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#CommissionDetails
	 * SubscriptionOrder6.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#CommissionGeneralDetails
	 * SubscriptionExecution4.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#CommissionGeneralDetails
	 * SubscriptionExecution6.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#CommissionDetails
	 * SubscriptionOrder8.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#CommissionDetails
	 * SwitchRedemptionLegOrder2.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#CommissionDetails
	 * SwitchSubscriptionLegOrder2.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#CommissionDetails
	 * SwitchRedemptionLegOrder3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#CommissionDetails
	 * SwitchSubscriptionLegOrder3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#CommissionGeneralDetails
	 * SwitchRedemptionLegExecution2.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#CommissionGeneralDetails
	 * SwitchSubscriptionLegExecution2.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#CommissionGeneralDetails
	 * SwitchRedemptionLegExecution3.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#CommissionGeneralDetails
	 * SwitchSubscriptionLegExecution3.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#CommissionDetails
	 * RedemptionOrder11.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#CommissionGeneralDetails
	 * RedemptionExecution12.CommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#CommissionDetails
	 * SubscriptionOrder11.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#CommissionGeneralDetails
	 * SubscriptionExecution9.CommissionGeneralDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#CommissionDetails
	 * Order9.CommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#CommissionDetails
	 * Order1.CommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#CommissionDetails
	 * Order6.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#CommissionDetails
	 * ReceiveInformation13.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#CommissionDetails
	 * ReceiveInformation12.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#CommissionDetails
	 * DeliverInformation12.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#CommissionDetails
	 * DeliverInformation13.CommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#Commission
	 * Order17.Commission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#Commission
	 * Order18.Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#CommissionDetails
	 * FundCashOutBreakdown3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#CommissionDetails
	 * FundCashInBreakdown3.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#CommissionDetails
	 * DeliverInformation15.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#CommissionDetails
	 * DeliverInformation14.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#CommissionDetails
	 * ReceiveInformation15.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#CommissionDetails
	 * ReceiveInformation14.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#CommissionDetails
	 * ReceiveInformation17.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#CommissionDetails
	 * ReceiveInformation16.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#CommissionDetails
	 * DeliverInformation16.CommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#CommissionDetails
	 * DeliverInformation17.CommissionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission parameters associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeCommission = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.CommissionDetails, com.tools20022.repository.msg.DeliverInformation7.CommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation4.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation8.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation6.CommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation11.CommissionDetails, com.tools20022.repository.msg.DeliverInformation11.CommissionDetails, com.tools20022.repository.msg.DeliverInformation3.CommissionDetails,
					com.tools20022.repository.msg.DeliverInformation8.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation3.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation7.CommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation5.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation9.CommissionDetails, com.tools20022.repository.msg.DeliverInformation5.CommissionDetails,
					com.tools20022.repository.msg.DeliverInformation9.CommissionDetails, com.tools20022.repository.msg.DeliverInformation6.CommissionDetails, com.tools20022.repository.msg.Order3.CommissionDetails,
					com.tools20022.repository.msg.Order16.Commission, com.tools20022.repository.msg.Order14.Commission, com.tools20022.repository.msg.FundCashInBreakdown1.CommissionDetails,
					com.tools20022.repository.msg.FundCashOutBreakdown1.CommissionDetails, com.tools20022.repository.msg.FundCashInBreakdown2.CommissionDetails, com.tools20022.repository.msg.FundCashOutBreakdown2.CommissionDetails,
					com.tools20022.repository.msg.RedemptionOrder3.CommissionDetails, com.tools20022.repository.msg.RedemptionOrder5.CommissionDetails, com.tools20022.repository.msg.RedemptionExecution3.CommissionGeneralDetails,
					com.tools20022.repository.msg.RedemptionExecution5.CommissionGeneralDetails, com.tools20022.repository.msg.RedemptionOrder7.CommissionDetails, com.tools20022.repository.msg.RedemptionOrder4.CommissionDetails,
					com.tools20022.repository.msg.RedemptionOrder6.CommissionDetails, com.tools20022.repository.msg.RedemptionExecution4.CommissionGeneralDetails, com.tools20022.repository.msg.RedemptionExecution6.CommissionGeneralDetails,
					com.tools20022.repository.msg.RedemptionOrder8.CommissionDetails, com.tools20022.repository.msg.SubscriptionOrder3.CommissionDetails, com.tools20022.repository.msg.SubscriptionOrder5.CommissionDetails,
					com.tools20022.repository.msg.SubscriptionExecution3.CommissionGeneralDetails, com.tools20022.repository.msg.SubscriptionExecution5.CommissionGeneralDetails,
					com.tools20022.repository.msg.SubscriptionOrder7.CommissionDetails, com.tools20022.repository.msg.SubscriptionOrder4.CommissionDetails, com.tools20022.repository.msg.SubscriptionOrder6.CommissionDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.CommissionGeneralDetails, com.tools20022.repository.msg.SubscriptionExecution6.CommissionGeneralDetails,
					com.tools20022.repository.msg.SubscriptionOrder8.CommissionDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder2.CommissionDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.CommissionDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.CommissionDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.CommissionDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.CommissionGeneralDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.CommissionGeneralDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.CommissionGeneralDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.CommissionGeneralDetails,
					com.tools20022.repository.msg.RedemptionOrder11.CommissionDetails, com.tools20022.repository.msg.RedemptionExecution12.CommissionGeneralDetails, com.tools20022.repository.msg.SubscriptionOrder11.CommissionDetails,
					com.tools20022.repository.msg.SubscriptionExecution9.CommissionGeneralDetails, com.tools20022.repository.msg.Order9.CommissionDetails, com.tools20022.repository.msg.Order1.CommissionDetails,
					com.tools20022.repository.msg.Order6.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation13.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation12.CommissionDetails,
					com.tools20022.repository.msg.DeliverInformation12.CommissionDetails, com.tools20022.repository.msg.DeliverInformation13.CommissionDetails, com.tools20022.repository.msg.Order17.Commission,
					com.tools20022.repository.msg.Order18.Commission, com.tools20022.repository.msg.FundCashOutBreakdown3.CommissionDetails, com.tools20022.repository.msg.FundCashInBreakdown3.CommissionDetails,
					com.tools20022.repository.msg.DeliverInformation15.CommissionDetails, com.tools20022.repository.msg.DeliverInformation14.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation15.CommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation14.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation17.CommissionDetails, com.tools20022.repository.msg.ReceiveInformation16.CommissionDetails,
					com.tools20022.repository.msg.DeliverInformation16.CommissionDetails, com.tools20022.repository.msg.DeliverInformation17.CommissionDetails);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCommission";
			definition = "Commission parameters associated with a trade.";
			minOccurs = 0;
			type_lazy = () -> Commission.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the trade is settled, ie, the amounts are due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#ValueDate
	 * TransactionDetails6.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#ValueDate
	 * TransactionDetails18.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#ValueDate
	 * TransactionDetails24.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#ValueDate
	 * TransactionDetails34.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#ValueDate
	 * TransactionDetails37.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#ValueDate
	 * TransactionDetails48.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#ValueDate
	 * TransactionDetails57.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#ValueDate
	 * TransactionDetails60.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingDateCode1Choice#Proprietary
	 * TradingDateCode1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#CurrentSettlementDate
	 * TradeData8.CurrentSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#NewSettlementDate
	 * TradeData8.NewSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#SettlementDate
	 * AmountsAndValueDate1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#ValueDate
	 * TransactionDetails51.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#ValueDate
	 * TransactionDetails63.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#ValueDate
	 * TransactionDetails68.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#CurrentSettlementDate
	 * TradeData11.CurrentSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#NewSettlementDate
	 * TradeData11.NewSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#SpotValueDate
	 * ForeignExchangeSwapTransaction1.SpotValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#ValueDate
	 * TransactionDetails78.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#ValuationRate
	 * Option10.ValuationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#ValueDate
	 * TransactionDetails91.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#SpotValueDate
	 * ForeignExchangeSwapTransaction2.SpotValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#ClearingTimestamp
	 * RegulatoryReporting6.ClearingTimestamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#ValueDate
	 * TransactionDetails95.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#ValueDate
	 * TransactionDetails98.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#SpotValueDate
	 * ForeignExchangeSwapTransaction3.SpotValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled, ie, the amounts are due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails6.ValueDate, com.tools20022.repository.msg.TransactionDetails18.ValueDate, com.tools20022.repository.msg.TransactionDetails24.ValueDate,
					com.tools20022.repository.msg.TransactionDetails34.ValueDate, com.tools20022.repository.msg.TransactionDetails37.ValueDate, com.tools20022.repository.msg.TransactionDetails48.ValueDate,
					com.tools20022.repository.msg.TransactionDetails57.ValueDate, com.tools20022.repository.msg.TransactionDetails60.ValueDate, com.tools20022.repository.choice.TradingDateCode1Choice.Proprietary,
					com.tools20022.repository.msg.TradeData8.CurrentSettlementDate, com.tools20022.repository.msg.TradeData8.NewSettlementDate, com.tools20022.repository.msg.AmountsAndValueDate1.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails51.ValueDate, com.tools20022.repository.msg.TransactionDetails63.ValueDate, com.tools20022.repository.msg.TransactionDetails68.ValueDate,
					com.tools20022.repository.msg.TradeData11.CurrentSettlementDate, com.tools20022.repository.msg.TradeData11.NewSettlementDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.SpotValueDate,
					com.tools20022.repository.msg.TransactionDetails78.ValueDate, com.tools20022.repository.msg.Option10.ValuationRate, com.tools20022.repository.msg.TransactionDetails91.ValueDate,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.SpotValueDate, com.tools20022.repository.msg.RegulatoryReporting6.ClearingTimestamp, com.tools20022.repository.msg.TransactionDetails95.ValueDate,
					com.tools20022.repository.msg.TransactionDetails98.ValueDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.SpotValueDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * End date of the trade, such as a treasury trade or a derivative trade.
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
	 * <li>{@linkplain com.tools20022.repository.choice.ClosingDate1Choice#Date
	 * ClosingDate1Choice.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ClosingDate1Choice#Code
	 * ClosingDate1Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates1#EndDate
	 * TransactionDates1.EndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates2#EndDate
	 * TransactionDates2.EndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#MaturityDate
	 * TradeContract1.MaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "End date of the trade, such as a treasury trade or a derivative trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EndDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClosingDate1Choice.Date, com.tools20022.repository.choice.ClosingDate1Choice.Code, com.tools20022.repository.msg.TransactionDates1.EndDate,
					com.tools20022.repository.msg.TransactionDates2.EndDate, com.tools20022.repository.msg.TradeContract1.MaturityDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndDate";
			definition = "End date of the trade, such as a treasury trade or a derivative trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the different identifications associated with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#Trade
	 * TradeIdentification.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation1Choice#Reference
	 * Cancellation1Choice.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#CounterpartySideUniqueTransactionIdentifier
	 * RegulatoryReporting1.CounterpartySideUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#TransactionIdentification
	 * IntraBalanceCancellation2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice#References
	 * Cancellation5Choice.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice#References
	 * Cancellation4Choice.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1#CounterpartySideUniqueTransactionIdentifier
	 * CounterpartySideTransactionReporting1.
	 * CounterpartySideUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1#TradingSideUniqueTransactionIdentifier
	 * TradingSideTransactionReporting1.TradingSideUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice#References
	 * Cancellation9Choice.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation8Choice#References
	 * Cancellation8Choice.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation12Choice#References
	 * Cancellation12Choice.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice#References
	 * Cancellation10Choice.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#RelatedTradeReference
	 * GeneralInformation5.RelatedTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#LinkedReportIdentification
	 * TradeData12.LinkedReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetObligation1#CounterpartyNettingIdentification
	 * NetObligation1.CounterpartyNettingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#RelatedReference
	 * FixingConditions1.RelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Cancellation1Choice.Reference, com.tools20022.repository.msg.RegulatoryReporting1.CounterpartySideUniqueTransactionIdentifier,
					com.tools20022.repository.msg.IntraBalanceCancellation2.TransactionIdentification, com.tools20022.repository.choice.Cancellation5Choice.References, com.tools20022.repository.choice.Cancellation4Choice.References,
					com.tools20022.repository.msg.CounterpartySideTransactionReporting1.CounterpartySideUniqueTransactionIdentifier, com.tools20022.repository.msg.TradingSideTransactionReporting1.TradingSideUniqueTransactionIdentifier,
					com.tools20022.repository.choice.Cancellation9Choice.References, com.tools20022.repository.choice.Cancellation8Choice.References, com.tools20022.repository.choice.Cancellation12Choice.References,
					com.tools20022.repository.choice.Cancellation10Choice.References, com.tools20022.repository.msg.GeneralInformation5.RelatedTradeReference, com.tools20022.repository.msg.TradeData12.LinkedReportIdentification,
					com.tools20022.repository.msg.NetObligation1.CounterpartyNettingIdentification, com.tools20022.repository.msg.FixingConditions1.RelatedReference);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a trade.";
			minOccurs = 0;
			type_lazy = () -> TradeIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of allocation for a trade.
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#AllocationIndicator
	 * RegulatoryReporting1.AllocationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#AllocationIndicator
	 * RegulatoryReporting4.AllocationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#AllocationIndicator
	 * RegulatoryReporting6.AllocationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of allocation for a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllocationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.AllocationIndicator, com.tools20022.repository.msg.RegulatoryReporting4.AllocationIndicator,
					com.tools20022.repository.msg.RegulatoryReporting6.AllocationIndicator);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies the type of allocation for a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of collateralisation.
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#CollateralisationIndicator
	 * RegulatoryReporting1.CollateralisationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#CollateralisationIndicator
	 * RegulatoryReporting4.CollateralisationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#CollateralisationIndicator
	 * RegulatoryReporting6.CollateralisationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateralisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralisationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.CollateralisationIndicator, com.tools20022.repository.msg.RegulatoryReporting4.CollateralisationIndicator,
					com.tools20022.repository.msg.RegulatoryReporting6.CollateralisationIndicator);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralisationType";
			definition = "Specifies the type of collateralisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates whether the trade is a block or single trade.
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation1#BlockIndicator
	 * GeneralInformation1.BlockIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#BlockIndicator
	 * GeneralInformation4.BlockIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation2#BlockIndicator
	 * GeneralInformation2.BlockIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#BlockIndicator
	 * GeneralInformation5.BlockIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is a block or single trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BlockIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralInformation1.BlockIndicator, com.tools20022.repository.msg.GeneralInformation4.BlockIndicator,
					com.tools20022.repository.msg.GeneralInformation2.BlockIndicator, com.tools20022.repository.msg.GeneralInformation5.BlockIndicator);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates to the clearing member whether the trade is eligible for
	 * settlement netting or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligibleCode
	 * NettingEligibleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing1#SettlementNettingEligibleCode
	 * Clearing1.SettlementNettingEligibleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing2#SettlementNettingEligibleCode
	 * Clearing2.SettlementNettingEligibleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#SettlementNettingEligibleCode
	 * Clearing4.SettlementNettingEligibleCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates to the clearing member whether the trade is eligible for settlement netting or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementNetting = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Clearing1.SettlementNettingEligibleCode, com.tools20022.repository.msg.Clearing2.SettlementNettingEligibleCode,
					com.tools20022.repository.msg.Clearing4.SettlementNettingEligibleCode);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementNetting";
			definition = "Indicates to the clearing member whether the trade is eligible for settlement netting or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NettingEligibleCode.mmObject();
		}
	};
	/**
	 * Role played by a party in relation with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#Trade
	 * TradePartyRole.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#TradingParties
	 * Order3.TradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction1#IntermediaryDetails
	 * RedemptionBulkOrderInstruction1.IntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#RelatedPartyDetails
	 * RedemptionOrder5.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction2#RelatedPartyDetails
	 * RedemptionBulkOrderInstruction2.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#RelatedPartyDetails
	 * RedemptionExecution5.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1#RelatedPartyDetails
	 * OrderConfirmationDetails1.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#RelatedPartyDetails
	 * RedemptionOrder7.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#IntermediaryDetails
	 * RedemptionMultipleOrderInstruction1.IntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#RelatedPartyDetails
	 * RedemptionOrder6.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2#RelatedPartyDetails
	 * RedemptionMultipleOrderInstruction2.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#RelatedPartyDetails
	 * RedemptionExecution6.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#RelatedPartyDetails
	 * RedemptionOrderConfirmation1.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#RelatedPartyDetails
	 * RedemptionOrder8.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction1#IntermediaryDetails
	 * SubscriptionBulkOrderInstruction1.IntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#RelatedPartyDetails
	 * SubscriptionOrder5.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2#RelatedPartyDetails
	 * SubscriptionBulkOrderInstruction2.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#RelatedPartyDetails
	 * SubscriptionExecution5.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1#RelatedPartyDetails
	 * SubscriptionBulkOrderConfirmation1.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#RelatedPartyDetails
	 * SubscriptionOrder7.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction1#IntermediaryDetails
	 * SubscriptionMultipleOrderInstruction1.IntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#RelatedPartyDetails
	 * SubscriptionOrder6.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2#RelatedPartyDetails
	 * SubscriptionMultipleOrderInstruction2.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#RelatedPartyDetails
	 * SubscriptionExecution6.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1#RelatedPartyDetails
	 * SubscriptionOrderConfirmation1.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#RelatedPartyDetails
	 * SubscriptionOrder8.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction1#IntermediaryDetails
	 * SwitchOrderInstruction1.IntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#RelatedPartyDetails
	 * SwitchOrder3.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#RelatedPartyDetails
	 * SwitchExecution4.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#RelatedPartyDetails
	 * SwitchOrder4.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#RelatedPartyDetails
	 * RedemptionExecution10.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#RelatedPartyDetails
	 * RedemptionOrder9.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#RelatedPartyDetails
	 * SubscriptionExecution7.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#RelatedPartyDetails
	 * SubscriptionOrder9.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#RelatedPartyDetails
	 * RedemptionOrder11.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#RelatedPartyDetails
	 * RedemptionExecution12.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#RelatedPartyDetails
	 * SubscriptionOrder11.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#RelatedPartyDetails
	 * SubscriptionExecution9.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#TradingParties
	 * OrderStatusAndReason5.TradingParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#TradingParties
	 * Order9.TradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#TradingParties
	 * InstrumentLeg2.TradingParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#TradingParties
	 * MassQuote1.TradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#TradingParties
	 * IndicationOfInterest1.TradingParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#TradingParties
	 * Order6.TradingParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#TradingParties
	 * Order11.TradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#TripartyAgentIdentification
	 * SecuredMarketTransaction1.TripartyAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#TripartyAgentIdentification
	 * SecuredMarketTransaction2.TripartyAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#TripartyAgentIdentification
	 * SecuredMarketTransaction3.TripartyAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#RelatedPartyDetails
	 * SwitchExecution7.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#RelatedPartyDetails
	 * SwitchOrder7.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#RelatedPartyDetails
	 * RedemptionOrder14.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#RelatedPartyDetails
	 * SubscriptionExecution13.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#RelatedPartyDetails
	 * SubscriptionExecution12.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#RelatedPartyDetails
	 * SubscriptionOrder15.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#RelatedPartyDetails
	 * RedemptionOrder15.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#RelatedPartyDetails
	 * RedemptionExecution16.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#RelatedPartyDetails
	 * SubscriptionOrder14.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#RelatedPartyDetails
	 * RedemptionExecution15.RelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#TripartyAgentIdentification
	 * SecuredMarketTransaction4.TripartyAgentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in relation with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradePartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.TradingParties, com.tools20022.repository.msg.RedemptionBulkOrderInstruction1.IntermediaryDetails,
					com.tools20022.repository.msg.RedemptionOrder5.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionBulkOrderInstruction2.RelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionExecution5.RelatedPartyDetails, com.tools20022.repository.msg.OrderConfirmationDetails1.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder7.RelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.IntermediaryDetails, com.tools20022.repository.msg.RedemptionOrder6.RelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution6.RelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionOrderConfirmation1.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder8.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionBulkOrderInstruction1.IntermediaryDetails, com.tools20022.repository.msg.SubscriptionOrder5.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionExecution5.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder7.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction1.IntermediaryDetails, com.tools20022.repository.msg.SubscriptionOrder6.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionExecution6.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionOrderConfirmation1.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder8.RelatedPartyDetails,
					com.tools20022.repository.msg.SwitchOrderInstruction1.IntermediaryDetails, com.tools20022.repository.msg.SwitchOrder3.RelatedPartyDetails, com.tools20022.repository.msg.SwitchExecution4.RelatedPartyDetails,
					com.tools20022.repository.msg.SwitchOrder4.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution10.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder9.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionExecution7.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder9.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder11.RelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionExecution12.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder11.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionExecution9.RelatedPartyDetails,
					com.tools20022.repository.msg.OrderStatusAndReason5.TradingParties, com.tools20022.repository.msg.Order9.TradingParties, com.tools20022.repository.msg.InstrumentLeg2.TradingParties,
					com.tools20022.repository.msg.MassQuote1.TradingParties, com.tools20022.repository.msg.IndicationOfInterest1.TradingParties, com.tools20022.repository.msg.Order6.TradingParties,
					com.tools20022.repository.msg.Order11.TradingParties, com.tools20022.repository.msg.SecuredMarketTransaction1.TripartyAgentIdentification,
					com.tools20022.repository.msg.SecuredMarketTransaction2.TripartyAgentIdentification, com.tools20022.repository.msg.SecuredMarketTransaction3.TripartyAgentIdentification,
					com.tools20022.repository.msg.SwitchExecution7.RelatedPartyDetails, com.tools20022.repository.msg.SwitchOrder7.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder14.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.RelatedPartyDetails, com.tools20022.repository.msg.SubscriptionExecution12.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionOrder15.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder15.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution16.RelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionOrder14.RelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution15.RelatedPartyDetails,
					com.tools20022.repository.msg.SecuredMarketTransaction4.TripartyAgentIdentification);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Role played by a party in relation with a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#Trade
	 * Obligation.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a product, cash or securities.."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Negotiation process which is the source of the treasury trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#TradeExecution
	 * Negotiation.TradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Negotiation process which is the source of the treasury trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process which is the source of the treasury trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Negotiation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.TradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Legal agreement applicable to a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#GovernedTrades
	 * MasterAgreement.GovernedTrades}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#ApplicableRules
	 * PaymentObligation2.ApplicableRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#TradeAgreement
	 * CardPaymentInvoice1.TradeAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#TradeAgreement
	 * CardPaymentInvoice2.TradeAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal agreement applicable to a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GoverningDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation2.ApplicableRules, com.tools20022.repository.msg.CardPaymentInvoice1.TradeAgreement,
					com.tools20022.repository.msg.CardPaymentInvoice2.TradeAgreement);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoverningDocument";
			definition = "Legal agreement applicable to a trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MasterAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.GovernedTrades;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Start date of the trade, such as a treasury trade or a derivative trade.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#ProcessingDate
	 * Order16.ProcessingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#ProcessingDate
	 * Order14.ProcessingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#StartDate
	 * TransactionDates1.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#StartDate
	 * TransactionDates2.StartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#ProcessingDate
	 * Order17.ProcessingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#ProcessingDate
	 * Order18.ProcessingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#StartDate
	 * OvernightIndexSwapTransaction1.StartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#StartDate
	 * TradeContract1.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#StartDate
	 * OvernightIndexSwapTransaction3.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#BillingPeriod
	 * TradeSettlement2.BillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#StartDate
	 * OvernightIndexSwapTransaction4.StartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date of the trade, such as a treasury trade or a derivative trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StartDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.ProcessingDate, com.tools20022.repository.msg.Order14.ProcessingDate, com.tools20022.repository.msg.TransactionDates1.StartDate,
					com.tools20022.repository.msg.TransactionDates2.StartDate, com.tools20022.repository.msg.Order17.ProcessingDate, com.tools20022.repository.msg.Order18.ProcessingDate,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.StartDate, com.tools20022.repository.msg.TradeContract1.StartDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction3.StartDate,
					com.tools20022.repository.msg.TradeSettlement2.BillingPeriod, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.StartDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Start date of the trade, such as a treasury trade or a derivative trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * System involved in the processing of a trade such as clearing, settlement
	 * or matching system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#Trade
	 * System.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System involved in the processing of a trade such as clearing, settlement or matching system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System involved in the processing of a trade such as clearing, settlement or matching system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset which is the object of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#Trade
	 * Asset.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is the object of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Asset which is the object of a trade.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market where a trade is negotiated and executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Market#Trade
	 * Market.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.NetPosition2#PlaceOfTrade
	 * NetPosition2.PlaceOfTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#PlaceOfTrade
	 * NetPosition3.PlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#TradeMarket
	 * FinancialItemParameters1.TradeMarket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market where a trade is negotiated and executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Market = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetPosition2.PlaceOfTrade, com.tools20022.repository.msg.NetPosition3.PlaceOfTrade, com.tools20022.repository.msg.FinancialItemParameters1.TradeMarket);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market where a trade is negotiated and executed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Guarantee which covers a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#GuaranteedTrade
	 * Guarantee.GuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#Guarantee
	 * FinancingAgreementItem1.Guarantee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee which covers a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Guarantee = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingAgreementItem1.Guarantee);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee which covers a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.GuaranteedTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer of proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#Trade
	 * Settlement.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Settlement
	 * Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of proceeds."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Settlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Transfer of proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the order related to a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Order#Trade
	 * Order.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the order related to a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Specifies the order related to a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Order.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Separate transactions which combined together form a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Leg#Trade
	 * Leg.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Leg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate transactions which combined together form a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Leg = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Leg";
			definition = "Separate transactions which combined together form a trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financial transaction to which the trade belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#Trade
	 * FinancialTransaction.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial transaction to which the trade belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the trade belongs.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#ReconciledTrades
	 * Reconciliation.ReconciledTrades}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which compares and matches trade information with entries in an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.ReconciledTrades;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Trade";
				definition = "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Trade, com.tools20022.repository.entity.Commission.Trade, com.tools20022.repository.entity.Obligation.Trade,
						com.tools20022.repository.entity.TradeIdentification.Trade, com.tools20022.repository.entity.TradePartyRole.Trade, com.tools20022.repository.entity.System.Trade, com.tools20022.repository.entity.Settlement.Trade,
						com.tools20022.repository.entity.Leg.Trade, com.tools20022.repository.entity.Negotiation.TradeExecution, com.tools20022.repository.entity.MasterAgreement.GovernedTrades,
						com.tools20022.repository.entity.Guarantee.GuaranteedTrade, com.tools20022.repository.entity.Reconciliation.ReconciledTrades, com.tools20022.repository.entity.Market.Trade,
						com.tools20022.repository.entity.Order.Trade, com.tools20022.repository.entity.FinancialTransaction.Trade);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradingDateCode1Choice.Code, com.tools20022.repository.choice.TradeDate4Choice.Date, com.tools20022.repository.choice.TradeDate4Choice.Value);
				subType_lazy = () -> Arrays.asList(SecuritiesTrade.mmObject(), TreasuryTrade.mmObject(), CommercialTrade.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.TradeDateTime, com.tools20022.repository.entity.Trade.TradeCommission, com.tools20022.repository.entity.Trade.ValueDate,
						com.tools20022.repository.entity.Trade.EndDate, com.tools20022.repository.entity.Trade.TradeRelatedIdentifications, com.tools20022.repository.entity.Trade.AllocationIndicator,
						com.tools20022.repository.entity.Trade.CollateralisationType, com.tools20022.repository.entity.Trade.BlockIndicator, com.tools20022.repository.entity.Trade.SettlementNetting,
						com.tools20022.repository.entity.Trade.TradePartyRole, com.tools20022.repository.entity.Trade.Obligation, com.tools20022.repository.entity.Trade.RelatedNegotiation,
						com.tools20022.repository.entity.Trade.GoverningDocument, com.tools20022.repository.entity.Trade.StartDate, com.tools20022.repository.entity.Trade.System, com.tools20022.repository.entity.Trade.Asset,
						com.tools20022.repository.entity.Trade.Market, com.tools20022.repository.entity.Trade.Guarantee, com.tools20022.repository.entity.Trade.Settlement, com.tools20022.repository.entity.Trade.Order,
						com.tools20022.repository.entity.Trade.Leg, com.tools20022.repository.entity.Trade.FinancialTransaction, com.tools20022.repository.entity.Trade.Reconciliation);
				derivationComponent_lazy = () -> Arrays.asList(DateAndDateTime1Choice.mmObject(), TradingDateCode1Choice.mmObject(), TradeDate4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}