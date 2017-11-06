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
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
 * Trade.mmTradeDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
 * Trade.mmTradeCommission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmValueDate
 * Trade.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmEndDate
 * Trade.mmEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
 * Trade.mmTradeRelatedIdentifications}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmAllocationIndicator
 * Trade.mmAllocationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmCollateralisationType
 * Trade.mmCollateralisationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmBlockIndicator
 * Trade.mmBlockIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSettlementNetting
 * Trade.mmSettlementNetting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
 * Trade.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmObligation
 * Trade.mmObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmRelatedNegotiation
 * Trade.mmRelatedNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
 * Trade.mmGoverningDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmStartDate
 * Trade.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSystem
 * Trade.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmAsset Trade.mmAsset}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmMarket
 * Trade.mmMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmGuarantee
 * Trade.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSettlement
 * Trade.mmSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmOrder Trade.mmOrder}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmLeg Trade.mmLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmFinancialTransaction
 * Trade.mmFinancialTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmReconciliation
 * Trade.mmReconciliation}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmTrade Asset.mmTrade}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmTrade
 * Commission.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmTrade
 * Obligation.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
 * TradeIdentification.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
 * TradePartyRole.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmTrade
 * System.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Settlement#mmTrade
 * Settlement.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmTrade Leg.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradeExecution
 * Negotiation.mmTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedTrades
 * MasterAgreement.mmGovernedTrades}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteedTrade
 * Guarantee.mmGuaranteedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmReconciledTrades
 * Reconciliation.mmReconciledTrades}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmTrade
 * Market.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Order#mmTrade Order.mmTrade}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmTrade
 * FinancialTransaction.mmTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradingDateCode1Choice#mmCode
 * TradingDateCode1Choice.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeDate4Choice#mmDate
 * TradeDate4Choice.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeDate4Choice#mmValue
 * TradeDate4Choice.mmValue}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ISODateTime tradeDateTime;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters2#mmTradeDateTime
	 * FundCashForecastParameters2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmTradeDateTime
	 * PriceValuation2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice#mmDate
	 * DateAndDateTime1Choice.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice#mmDateTime
	 * DateAndDateTime1Choice.mmDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer4#mmTradeDate
	 * Transfer4.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#mmTradeDate
	 * Transfer7.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmTradeDate
	 * Transfer17.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer2#mmTradeDate
	 * Transfer2.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#mmTradeDate
	 * Transfer10.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#mmTradeDate
	 * Transfer14.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#mmTradeDate
	 * Transfer24.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer25#mmTradeDate
	 * Transfer25.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#mmTradeDate
	 * TransactionDetails10.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#mmTradeDate
	 * TransactionDetails29.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmTradeDate
	 * SecuritiesTradeDetails25.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmTradeDate
	 * SecuritiesTradeDetails26.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#mmTradeDate
	 * TransactionDetails28.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#mmTradeDate
	 * TransactionDetails31.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#mmTradeDate
	 * TransactionDetails44.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmTradeDate
	 * SecuritiesTradeDetails27.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmTradeDate
	 * SecuritiesTradeDetails28.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#mmTradeDate
	 * Transfer18.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmTransferOrderDateForm
	 * Transfer18.mmTransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmTradeDate
	 * Transfer26.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmTransferOrderDateForm
	 * Transfer26.mmTransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#mmTradeDate
	 * Transfer13.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmTransferOrderDateForm
	 * Transfer13.mmTransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#mmTradeDate
	 * Transfer23.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmTransferOrderDateForm
	 * Transfer23.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmTransferOrderDateForm
	 * Transfer11.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmTransferOrderDateForm
	 * Transfer19.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmTradeDate
	 * SecuritiesTradeDetails6.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmTradeDate
	 * SecuritiesTradeDetails13.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmTradeDate
	 * SecuritiesTradeDetails3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmTradeDate
	 * SecuritiesTradeDetails11.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmTradeDate
	 * SecuritiesTradeDetails2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmTradeDate
	 * SecuritiesTradeDetails16.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeDate
	 * SecuritiesTradeDetails1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmTradeDate
	 * SecuritiesTradeDetails15.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmTradeDate
	 * TransactionDetails5.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmTradeDate
	 * TransactionDetails9.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmTradeDate
	 * TransactionDetails22.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmTradeDate
	 * TransactionDetails23.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmTradeDate
	 * TransactionDetails36.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmTradeDate
	 * TransactionDetails47.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmTradeDate
	 * TransactionDetails53.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmTradeDate
	 * TransactionDetails58.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmTradeDate
	 * TransactionDetails7.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmTradeDate
	 * TransactionDetails8.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmTradeDate
	 * TransactionDetails16.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmTradeDate
	 * TransactionDetails17.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmTradeDate
	 * TransactionDetails26.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmTradeDate
	 * TransactionDetails25.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmTradeDate
	 * TransactionDetails27.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmTradeDate
	 * TransactionDetails33.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmTradeDate
	 * TransactionDetails39.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmTradeDate
	 * TransactionDetails50.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmTradeDate
	 * TransactionDetails56.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmTradeDate
	 * TransactionDetails59.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmTradeDate
	 * TransactionDetails6.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmTradeDate
	 * TransactionDetails18.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmTradeDate
	 * TransactionDetails24.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmTradeDate
	 * TransactionDetails34.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmTradeDate
	 * TransactionDetails37.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmTradeDate
	 * TransactionDetails48.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmTradeDate
	 * TransactionDetails57.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmTradeDate
	 * TransactionDetails60.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmTradeDate
	 * Order3.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill1#mmTradeDate
	 * PartialFill1.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmTradeDate
	 * Order16.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmTradeDate
	 * Order14.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmTradeDate
	 * TwoLegTransactionDetails1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#mmTradeDate
	 * TransactionDates1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#mmTransactionDateTime
	 * TransactionDates1.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmTradeDate
	 * TransactionDates2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmTransactionDateTime
	 * TransactionDates2.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmExecutionTimestamp
	 * RegulatoryReporting1.mmExecutionTimestamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement2#mmTradeDate
	 * TradeAgreement2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement8#mmTradeDate
	 * TradeAgreement8.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement1#mmTradeDate
	 * TradeAgreement1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement7#mmTradeDate
	 * TradeAgreement7.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmTradeDate
	 * TradeAgreement9.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmTradeDateTime
	 * FundCashForecast1.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmPreviousTradeDateTime
	 * FundCashForecast1.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTradeDateTime
	 * FundCashForecast3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmPreviousTradeDateTime
	 * FundCashForecast3.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmTradeDateTime
	 * FundCashForecast2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmPreviousTradeDateTime
	 * FundCashForecast2.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTradeDateTime
	 * FundCashForecast4.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmPreviousTradeDateTime
	 * FundCashForecast4.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmTradeDateTime
	 * EstimatedFundCashForecast2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmPreviousTradeDateTime
	 * EstimatedFundCashForecast2.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmTradeDateTime
	 * EstimatedFundCashForecast4.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmPreviousTradeDateTime
	 * EstimatedFundCashForecast4.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmTradeDateTime
	 * EstimatedFundCashForecast1.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmPreviousTradeDateTime
	 * EstimatedFundCashForecast1.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmTradeDateTime
	 * EstimatedFundCashForecast3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmPreviousTradeDateTime
	 * EstimatedFundCashForecast3.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails1#mmExpectedTradeDateTime
	 * ExpectedExecutionDetails1.mmExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2#mmExpectedTradeDateTime
	 * ExpectedExecutionDetails2.mmExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmTradeDateTime
	 * RedemptionExecution3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmTradeDateTime
	 * RedemptionExecution5.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmTradeDateTime
	 * RedemptionExecution4.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmTradeDateTime
	 * RedemptionExecution6.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmTradeDateTime
	 * InvestmentFundTransaction2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmTradeDateTime
	 * InvestmentFundTransaction3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmTradeDateTime
	 * SubscriptionExecution3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmTradeDateTime
	 * SubscriptionExecution5.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmTradeDateTime
	 * SubscriptionExecution4.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmTradeDateTime
	 * SubscriptionExecution6.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmTradeDateTime
	 * SwitchRedemptionLegExecution2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmTradeDateTime
	 * SwitchSubscriptionLegExecution2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmTradeDateTime
	 * SwitchRedemptionLegExecution3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmTradeDateTime
	 * SwitchSubscriptionLegExecution3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmTradeDate
	 * TransferStatusAndReason2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmTradeDateTime
	 * TransactionDetails1.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmTradeDateTime
	 * TransactionDetails3.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmTradeDate
	 * SecuritiesTradeDetails7.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmTradeDate
	 * SecuritiesTradeDetails19.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5#mmTradeDate
	 * SecuritiesTradeDetails5.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmTradeDate
	 * SecuritiesFinancingTransactionDetails2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmTradeDate
	 * SecuritiesFinancingTransactionDetails8.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmTradeDate
	 * SecuritiesTradeDetails8.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmTradeDate
	 * SecuritiesTradeDetails18.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmTradeDate
	 * SecuritiesTradeDetails4.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmTradeDate
	 * SecuritiesTradeDetails17.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#mmTradeDate
	 * TransactionDetails4.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#mmTradeDate
	 * TransactionDetails30.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData1#mmTradeDate
	 * OpeningData1.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ClosingData1#mmTradeDate
	 * ClosingData1.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OpeningData2#mmTradeDate
	 * OpeningData2.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ClosingData2#mmTradeDate
	 * ClosingData2.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData1#mmTradeDate
	 * OptionData1.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData2#mmTradeDate
	 * OptionData2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12#mmTradeDate
	 * SecuritiesTradeDetails12.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmTradeDate
	 * SecuritiesFinancingTransactionDetails6.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmTradeDate
	 * SecuritiesFinancingTransactionDetails10.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmTradeDate
	 * SecuritiesFinancingTransactionDetails17.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmTradeDate
	 * SecuritiesFinancingTransactionDetails18.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#mmTradeDate
	 * TransactionDetails20.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmTradeDate
	 * SecuritiesTradeDetails9.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmTradeDate
	 * SecuritiesTradeDetails21.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmTradeDate
	 * SecuritiesTradeDetails10.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmTradeDate
	 * SecuritiesTradeDetails22.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmTradeDate
	 * SecuritiesTradeDetails23.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmTradeDate
	 * SecuritiesTradeDetails29.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmTradeDate
	 * TransactionDetails40.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmTradeDate
	 * TransactionDetails42.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmTradeDate
	 * TransactionDetails46.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#mmTradeDate
	 * TransactionDetails32.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#mmTradeDate
	 * TransactionDetails14.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#mmTradeDate
	 * TransactionDetails35.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmTradeDate
	 * SecuritiesTradeDetails14.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmTradeDate
	 * SecuritiesTradeDetails20.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmTradeDate
	 * SecuritiesTradeDetails24.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmTradeDate
	 * SecuritiesTradeDetails30.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmTradeDate
	 * TransactionDetails45.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmTradeDate
	 * SettlementObligation1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmTradeDate
	 * SettlementObligation6.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmTradeDate
	 * SettlementObligation3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#mmTradeDate
	 * SettlementObligation2.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TradeDate3Choice#mmDate
	 * TradeDate3Choice.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmTradeDate
	 * SettlementObligation5.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmTradeDate
	 * SettlementObligation4.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmTradeDate
	 * TradeLeg2.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeDate
	 * TradeLeg5.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#mmTradeDate
	 * TradeLeg1.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmTradeDate
	 * TradeLeg3.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeDate
	 * TradeLeg6.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#mmTradeDate
	 * TradeLeg4.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradeDate
	 * TradeLeg7.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetPosition2#mmTradeDate
	 * NetPosition2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmExpectedTradeDateTime
	 * ExpectedExecutionDetails3.mmExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmTradeDateTime
	 * RedemptionExecution10.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmTradeDateTime
	 * SubscriptionExecution7.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmTradeDateTime
	 * RedemptionExecution12.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmTradeDateTime
	 * SubscriptionExecution9.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmTradeDate
	 * TransactionDetails51.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#mmTradeDate
	 * TransactionDetails52.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmTradeDate
	 * Order9.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTradeDate
	 * Bid1.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradeDate
	 * Order6.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List2#mmTradeDate
	 * List2.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData3#mmTradeDate
	 * OptionData3.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionData4#mmTradeDate
	 * OptionData4.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmTransferOrderDateForm
	 * Transfer27.mmTransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#mmTradeDate
	 * Transfer28.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferOrderDateForm
	 * Transfer28.mmTransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#mmTradeDate
	 * Transfer29.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferOrderDateForm
	 * Transfer29.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmTradeDate
	 * TransferStatusAndReason3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmTradeDate
	 * TransactionDetails61.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmTradeDate
	 * SecuritiesFinancingTransactionDetails21.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmTradeDate
	 * TransactionDetails62.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmTradeDate
	 * TransactionDetails63.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmDate
	 * Garnishment1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmTradeDate
	 * SecuritiesTradeDetails31.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeDate
	 * SecuritiesTradeDetails33.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmTradeDate
	 * SecuritiesTradeDetails35.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmTradeDate
	 * SecuritiesTradeDetails38.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmTradeDate
	 * SecuritiesTradeDetails37.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmTradeDate
	 * SecuritiesTradeDetails36.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmTradeDate
	 * SecuritiesTradeDetails34.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmTradeDate
	 * SecuritiesTradeDetails32.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmTradeDate
	 * Order17.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmTradeDate
	 * Order18.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2#mmTradeDate
	 * PartialFill2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmTradeDate
	 * SecuritiesTradeDetails44.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmTradeDate
	 * SecuritiesTradeDetails39.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmTradeDate
	 * SecuritiesTradeDetails43.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmTradeDate
	 * SecuritiesTradeDetails41.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmTradeDate
	 * SecuritiesFinancingTransactionDetails22.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmTradeDate
	 * SecuritiesTradeDetails40.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmTradeDate
	 * TransactionDetails66.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmTradeDate
	 * SecuritiesTradeDetails42.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmTradeDate
	 * TransactionDetails67.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmTradeDate
	 * TransactionDetails68.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmTradeDate
	 * SecuritiesTradeDetails46.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmTradeDate
	 * SecuritiesTradeDetails47.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement11#mmTradeDate
	 * TradeAgreement11.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionTimestamp
	 * RegulatoryReporting4.mmExecutionTimestamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmTradeDate
	 * TradeAgreement12.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement10#mmTradeDate
	 * TradeAgreement10.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTradeDateTime
	 * FundCashForecast7.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPreviousTradeDateTime
	 * FundCashForecast7.mmPreviousTradeDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmTradeDateTime
	 * Fund2.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#mmPreviousTradeDateTime
	 * Fund2.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmTradeDateTime
	 * EstimatedFundCashForecast6.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTradeDateTime
	 * EstimatedFundCashForecast6.mmPreviousTradeDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmTradeDateTime
	 * Fund1.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTradeDateTime
	 * Fund1.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTradeDateTime
	 * FundCashForecast6.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPreviousTradeDateTime
	 * FundCashForecast6.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmTradeDateTime
	 * EstimatedFundCashForecast5.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTradeDateTime
	 * EstimatedFundCashForecast5.mmPreviousTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmTradeDateTime
	 * InvestmentFundTransaction4.mmTradeDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeDate
	 * TradeLeg8.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTransactionDateTime
	 * TradeLeg8.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmTradeDate
	 * SecuritiesFinancingTransactionDetails24.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmTradeDate
	 * TransactionDetails70.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmTradeDate
	 * TransactionDetails69.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmTradeDate
	 * SettlementObligation7.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmTradeDate
	 * NetPosition3.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeDate
	 * TradeLeg10.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTransactionDateAndTime
	 * TradeLeg10.mmTransactionDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeDate
	 * TradeLeg9.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTransactionDateAndTime
	 * TradeLeg9.mmTransactionDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmTradeDate
	 * SettlementObligation8.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails88#mmTradeDate
	 * SettlementDetails88.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmTradeDate
	 * TransactionDetails71.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmTradeDate
	 * SecuritiesFinancingTransactionDetails25.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmTradeDate
	 * TransactionDetails72.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmTradeDate
	 * ForeignExchangeSwapTransaction1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmTradeDate
	 * UnsecuredMarketTransaction1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmTradeDate
	 * OvernightIndexSwapTransaction1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTradeDate
	 * SecuredMarketTransaction1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradeDate
	 * SecuritiesTransaction1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmTradeDate
	 * TransactionDetails81.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmTradeDate
	 * TransactionDetails74.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmTradeDate
	 * SecuritiesTradeDetails49.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmTradeDate
	 * TransactionDetails82.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTradeDate
	 * SecuritiesFinancingTransactionDetails26.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmTradeDate
	 * TransactionDetails79.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmTradeDate
	 * SecuritiesTradeDetails48.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmTradeDate
	 * TransactionDetails80.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmTradeDate
	 * TransactionDetails75.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmTradeDate
	 * TransactionDetails78.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradeDate
	 * Trade2.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmDateAndTime
	 * Trade1.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeDate
	 * SecuritiesTradeDetails51.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTradeDate
	 * SecuritiesTradeDetails53.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmTradeDate
	 * SecuritiesTradeDetails55.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmTradeDate
	 * SecuritiesTradeDetails56.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmTradeDate
	 * SecuritiesTradeDetails54.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTradeDate
	 * SecuritiesTradeDetails52.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTradeDate
	 * SecuritiesTradeDetails50.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmTradeDate
	 * Transfer31.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferOrderDateForm
	 * Transfer31.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferOrderDateForm
	 * Transfer30.mmTransferOrderDateForm}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#mmTradeDate
	 * Transfer33.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTransferOrderDateForm
	 * Transfer33.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmTradeDate
	 * TransferStatusAndReason4.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1#mmDate
	 * TreasuryProfile1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails102#mmTradeDate
	 * SettlementDetails102.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmTradeDate
	 * SecuritiesTradeDetails57.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmTradeDate
	 * SecuritiesTradeDetails59.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTradeDate
	 * SecuritiesFinancingTransactionDetails33.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#mmTradeDate
	 * TransactionDetails88.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmTradeDate
	 * SecuritiesTradeDetails58.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmTradeDate
	 * SecuritiesTradeDetails61.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmTradeDate
	 * TransactionDetails92.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmTradeDate
	 * TransactionDetails84.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeDate
	 * SecuritiesTradeDetails63.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#mmTradeDate
	 * TransactionDetails83.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeDate
	 * SecuritiesTradeDetails62.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmTradeDate
	 * TransactionDetails87.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmTradeDate
	 * SecuritiesTradeDetails60.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmTradeDate
	 * TransactionDetails91.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmTradeDate
	 * TransactionDetails90.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmTradeDate
	 * SecuritiesTradeDetails65.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmTradeDate
	 * SecuritiesTradeDetails66.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTradeDate
	 * UnsecuredMarketTransaction2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmTradeDate
	 * ForeignExchangeSwapTransaction2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTradeDate
	 * SecuredMarketTransaction2.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmTradeDate
	 * UnsecuredMarketTransaction3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmTradeDate
	 * OvernightIndexSwapTransaction3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTradeDate
	 * SecuredMarketTransaction3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmTradeDateTime
	 * SubscriptionExecution13.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmTradeDateTime
	 * SubscriptionExecution12.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4#mmExpectedTradeDateTime
	 * ExpectedExecutionDetails4.mmExpectedTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmTradeDateTime
	 * RedemptionExecution16.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmTradeDateTime
	 * SwitchSubscriptionLegExecution4.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmTradeDateTime
	 * RedemptionExecution15.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmTradeDateTime
	 * SwitchRedemptionLegExecution4.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmReportingDate
	 * TransparencyDataReport11.mmReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmReportingDate
	 * TransparencyDataReport13.mmReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#mmReportingDate
	 * TransparencyDataReport15.mmReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmReportingDate
	 * TransparencyDataReport10.mmReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionTimestamp
	 * RegulatoryReporting6.mmExecutionTimestamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmConfirmationDateAndTimestamp
	 * RegulatoryReporting6.mmConfirmationDateAndTimestamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15#mmTradeDate
	 * TradeAgreement15.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement14#mmTradeDate
	 * TradeAgreement14.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTradeDate
	 * SecuritiesTradeDetails67.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmTradeDate
	 * SecuritiesTradeDetails68.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmTradeDate
	 * TransactionDetails97.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTradeDate
	 * SecuritiesFinancingTransactionDetails35.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmTradeDate
	 * TransactionDetails96.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmTradeDate
	 * TransactionDetails95.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#mmTradeDate
	 * SettlementDetails118.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmTradeDate
	 * SecuritiesTradeDetails69.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmTradeDate
	 * SecuritiesTradeDetails70.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmTradeDate
	 * SecuritiesFinancingTransactionDetails36.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmTradeDate
	 * TransactionDetails100.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmTradeDate
	 * TransactionDetails99.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmTradeDate
	 * TransactionDetails98.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmTradeDate
	 * FixingConditions1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTradeDate
	 * SecuredMarketTransaction4.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmTradeDate
	 * ForeignExchangeSwapTransaction3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTradeDate
	 * OvernightIndexSwapTransaction4.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTradeDate
	 * UnsecuredMarketTransaction4.mmTradeDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTradeDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters2.mmTradeDateTime, com.tools20022.repository.msg.PriceValuation2.mmTradeDateTime,
					com.tools20022.repository.choice.DateAndDateTime1Choice.mmDate, com.tools20022.repository.choice.DateAndDateTime1Choice.mmDateTime, com.tools20022.repository.msg.Transfer4.mmTradeDate,
					com.tools20022.repository.msg.Transfer7.mmTradeDate, com.tools20022.repository.msg.Transfer17.mmTradeDate, com.tools20022.repository.msg.Transfer2.mmTradeDate, com.tools20022.repository.msg.Transfer10.mmTradeDate,
					com.tools20022.repository.msg.Transfer14.mmTradeDate, com.tools20022.repository.msg.Transfer24.mmTradeDate, com.tools20022.repository.msg.Transfer25.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails10.mmTradeDate, com.tools20022.repository.msg.TransactionDetails29.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails25.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails26.mmTradeDate, com.tools20022.repository.msg.TransactionDetails28.mmTradeDate, com.tools20022.repository.msg.TransactionDetails31.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails44.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails27.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails28.mmTradeDate,
					com.tools20022.repository.msg.Transfer18.mmTradeDate, com.tools20022.repository.msg.Transfer18.mmTransferOrderDateForm, com.tools20022.repository.msg.Transfer26.mmTradeDate,
					com.tools20022.repository.msg.Transfer26.mmTransferOrderDateForm, com.tools20022.repository.msg.Transfer13.mmTradeDate, com.tools20022.repository.msg.Transfer13.mmTransferOrderDateForm,
					com.tools20022.repository.msg.Transfer23.mmTradeDate, com.tools20022.repository.msg.Transfer23.mmTransferOrderDateForm, com.tools20022.repository.msg.Transfer11.mmTransferOrderDateForm,
					com.tools20022.repository.msg.Transfer19.mmTransferOrderDateForm, com.tools20022.repository.msg.SecuritiesTradeDetails6.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails13.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails3.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails11.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails2.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails16.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails1.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails15.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails5.mmTradeDate, com.tools20022.repository.msg.TransactionDetails9.mmTradeDate, com.tools20022.repository.msg.TransactionDetails22.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails23.mmTradeDate, com.tools20022.repository.msg.TransactionDetails36.mmTradeDate, com.tools20022.repository.msg.TransactionDetails47.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails53.mmTradeDate, com.tools20022.repository.msg.TransactionDetails58.mmTradeDate, com.tools20022.repository.msg.TransactionDetails7.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails8.mmTradeDate, com.tools20022.repository.msg.TransactionDetails16.mmTradeDate, com.tools20022.repository.msg.TransactionDetails17.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails26.mmTradeDate, com.tools20022.repository.msg.TransactionDetails25.mmTradeDate, com.tools20022.repository.msg.TransactionDetails27.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails33.mmTradeDate, com.tools20022.repository.msg.TransactionDetails39.mmTradeDate, com.tools20022.repository.msg.TransactionDetails50.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails56.mmTradeDate, com.tools20022.repository.msg.TransactionDetails59.mmTradeDate, com.tools20022.repository.msg.TransactionDetails6.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails18.mmTradeDate, com.tools20022.repository.msg.TransactionDetails24.mmTradeDate, com.tools20022.repository.msg.TransactionDetails34.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails37.mmTradeDate, com.tools20022.repository.msg.TransactionDetails48.mmTradeDate, com.tools20022.repository.msg.TransactionDetails57.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails60.mmTradeDate, com.tools20022.repository.msg.Order3.mmTradeDate, com.tools20022.repository.msg.PartialFill1.mmTradeDate,
					com.tools20022.repository.msg.Order16.mmTradeDate, com.tools20022.repository.msg.Order14.mmTradeDate, com.tools20022.repository.msg.TwoLegTransactionDetails1.mmTradeDate,
					com.tools20022.repository.msg.TransactionDates1.mmTradeDate, com.tools20022.repository.msg.TransactionDates1.mmTransactionDateTime, com.tools20022.repository.msg.TransactionDates2.mmTradeDate,
					com.tools20022.repository.msg.TransactionDates2.mmTransactionDateTime, com.tools20022.repository.msg.RegulatoryReporting1.mmExecutionTimestamp, com.tools20022.repository.msg.TradeAgreement2.mmTradeDate,
					com.tools20022.repository.msg.TradeAgreement8.mmTradeDate, com.tools20022.repository.msg.TradeAgreement1.mmTradeDate, com.tools20022.repository.msg.TradeAgreement7.mmTradeDate,
					com.tools20022.repository.msg.TradeAgreement9.mmTradeDate, com.tools20022.repository.msg.FundCashForecast1.mmTradeDateTime, com.tools20022.repository.msg.FundCashForecast1.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.FundCashForecast3.mmTradeDateTime, com.tools20022.repository.msg.FundCashForecast3.mmPreviousTradeDateTime, com.tools20022.repository.msg.FundCashForecast2.mmTradeDateTime,
					com.tools20022.repository.msg.FundCashForecast2.mmPreviousTradeDateTime, com.tools20022.repository.msg.FundCashForecast4.mmTradeDateTime, com.tools20022.repository.msg.FundCashForecast4.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast2.mmTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast2.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast4.mmTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast4.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.mmTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast1.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast3.mmTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast3.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.ExpectedExecutionDetails1.mmExpectedTradeDateTime, com.tools20022.repository.msg.ExpectedExecutionDetails2.mmExpectedTradeDateTime,
					com.tools20022.repository.msg.RedemptionExecution3.mmTradeDateTime, com.tools20022.repository.msg.RedemptionExecution5.mmTradeDateTime, com.tools20022.repository.msg.RedemptionExecution4.mmTradeDateTime,
					com.tools20022.repository.msg.RedemptionExecution6.mmTradeDateTime, com.tools20022.repository.msg.InvestmentFundTransaction2.mmTradeDateTime, com.tools20022.repository.msg.InvestmentFundTransaction3.mmTradeDateTime,
					com.tools20022.repository.msg.SubscriptionExecution3.mmTradeDateTime, com.tools20022.repository.msg.SubscriptionExecution5.mmTradeDateTime, com.tools20022.repository.msg.SubscriptionExecution4.mmTradeDateTime,
					com.tools20022.repository.msg.SubscriptionExecution6.mmTradeDateTime, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmTradeDateTime,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmTradeDateTime, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmTradeDateTime,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmTradeDateTime, com.tools20022.repository.msg.TransferStatusAndReason2.mmTradeDate, com.tools20022.repository.msg.TransactionDetails1.mmTradeDateTime,
					com.tools20022.repository.msg.TransactionDetails3.mmTradeDateTime, com.tools20022.repository.msg.SecuritiesTradeDetails7.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails19.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails5.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails8.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails18.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails17.mmTradeDate, com.tools20022.repository.msg.TransactionDetails4.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails30.mmTradeDate, com.tools20022.repository.msg.OpeningData1.mmTradeDate, com.tools20022.repository.msg.ClosingData1.mmTradeDate,
					com.tools20022.repository.msg.OpeningData2.mmTradeDate, com.tools20022.repository.msg.ClosingData2.mmTradeDate, com.tools20022.repository.msg.OptionData1.mmTradeDate,
					com.tools20022.repository.msg.OptionData2.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails12.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmTradeDate, com.tools20022.repository.msg.TransactionDetails20.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails9.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails21.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails10.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails22.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails29.mmTradeDate, com.tools20022.repository.msg.TransactionDetails40.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails42.mmTradeDate, com.tools20022.repository.msg.TransactionDetails46.mmTradeDate, com.tools20022.repository.msg.TransactionDetails32.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails14.mmTradeDate, com.tools20022.repository.msg.TransactionDetails35.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails14.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails24.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails30.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails45.mmTradeDate, com.tools20022.repository.msg.SettlementObligation1.mmTradeDate, com.tools20022.repository.msg.SettlementObligation6.mmTradeDate,
					com.tools20022.repository.msg.SettlementObligation3.mmTradeDate, com.tools20022.repository.msg.SettlementObligation2.mmTradeDate, com.tools20022.repository.choice.TradeDate3Choice.mmDate,
					com.tools20022.repository.msg.SettlementObligation5.mmTradeDate, com.tools20022.repository.msg.SettlementObligation4.mmTradeDate, com.tools20022.repository.msg.TradeLeg2.mmTradeDate,
					com.tools20022.repository.msg.TradeLeg5.mmTradeDate, com.tools20022.repository.msg.TradeLeg1.mmTradeDate, com.tools20022.repository.msg.TradeLeg3.mmTradeDate, com.tools20022.repository.msg.TradeLeg6.mmTradeDate,
					com.tools20022.repository.msg.TradeLeg4.mmTradeDate, com.tools20022.repository.msg.TradeLeg7.mmTradeDate, com.tools20022.repository.msg.NetPosition2.mmTradeDate,
					com.tools20022.repository.msg.ExpectedExecutionDetails3.mmExpectedTradeDateTime, com.tools20022.repository.msg.RedemptionExecution10.mmTradeDateTime, com.tools20022.repository.msg.SubscriptionExecution7.mmTradeDateTime,
					com.tools20022.repository.msg.RedemptionExecution12.mmTradeDateTime, com.tools20022.repository.msg.SubscriptionExecution9.mmTradeDateTime, com.tools20022.repository.msg.TransactionDetails51.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails52.mmTradeDate, com.tools20022.repository.msg.Order9.mmTradeDate, com.tools20022.repository.msg.Bid1.mmTradeDate, com.tools20022.repository.msg.Order6.mmTradeDate,
					com.tools20022.repository.msg.List2.mmTradeDate, com.tools20022.repository.msg.OptionData3.mmTradeDate, com.tools20022.repository.msg.OptionData4.mmTradeDate,
					com.tools20022.repository.msg.Transfer27.mmTransferOrderDateForm, com.tools20022.repository.msg.Transfer28.mmTradeDate, com.tools20022.repository.msg.Transfer28.mmTransferOrderDateForm,
					com.tools20022.repository.msg.Transfer29.mmTradeDate, com.tools20022.repository.msg.Transfer29.mmTransferOrderDateForm, com.tools20022.repository.msg.TransferStatusAndReason3.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails61.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmTradeDate, com.tools20022.repository.msg.TransactionDetails62.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails63.mmTradeDate, com.tools20022.repository.msg.Garnishment1.mmDate, com.tools20022.repository.msg.SecuritiesTradeDetails31.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails33.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails35.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails37.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails36.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails34.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.mmTradeDate, com.tools20022.repository.msg.Order17.mmTradeDate, com.tools20022.repository.msg.Order18.mmTradeDate,
					com.tools20022.repository.msg.PartialFill2.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails44.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails39.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails41.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails40.mmTradeDate, com.tools20022.repository.msg.TransactionDetails66.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails67.mmTradeDate, com.tools20022.repository.msg.TransactionDetails68.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails46.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.mmTradeDate, com.tools20022.repository.msg.TradeAgreement11.mmTradeDate, com.tools20022.repository.msg.RegulatoryReporting4.mmExecutionTimestamp,
					com.tools20022.repository.msg.TradeAgreement12.mmTradeDate, com.tools20022.repository.msg.TradeAgreement10.mmTradeDate, com.tools20022.repository.msg.FundCashForecast7.mmTradeDateTime,
					com.tools20022.repository.msg.FundCashForecast7.mmPreviousTradeDateTime, com.tools20022.repository.msg.Fund2.mmTradeDateTime, com.tools20022.repository.msg.Fund2.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast6.mmTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmPreviousTradeDateTime, com.tools20022.repository.msg.Fund1.mmTradeDateTime,
					com.tools20022.repository.msg.Fund1.mmPreviousTradeDateTime, com.tools20022.repository.msg.FundCashForecast6.mmTradeDateTime, com.tools20022.repository.msg.FundCashForecast6.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.mmTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmPreviousTradeDateTime,
					com.tools20022.repository.msg.InvestmentFundTransaction4.mmTradeDateTime, com.tools20022.repository.msg.TradeLeg8.mmTradeDate, com.tools20022.repository.msg.TradeLeg8.mmTransactionDateTime,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmTradeDate, com.tools20022.repository.msg.TransactionDetails70.mmTradeDate, com.tools20022.repository.msg.TransactionDetails69.mmTradeDate,
					com.tools20022.repository.msg.SettlementObligation7.mmTradeDate, com.tools20022.repository.msg.NetPosition3.mmTradeDate, com.tools20022.repository.msg.TradeLeg10.mmTradeDate,
					com.tools20022.repository.msg.TradeLeg10.mmTransactionDateAndTime, com.tools20022.repository.msg.TradeLeg9.mmTradeDate, com.tools20022.repository.msg.TradeLeg9.mmTransactionDateAndTime,
					com.tools20022.repository.msg.SettlementObligation8.mmTradeDate, com.tools20022.repository.msg.SettlementDetails88.mmTradeDate, com.tools20022.repository.msg.TransactionDetails71.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmTradeDate, com.tools20022.repository.msg.TransactionDetails72.mmTradeDate,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.mmTradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction1.mmTradeDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction1.mmTradeDate,
					com.tools20022.repository.msg.SecuredMarketTransaction1.mmTradeDate, com.tools20022.repository.msg.SecuritiesTransaction1.mmTradeDate, com.tools20022.repository.msg.TransactionDetails81.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails74.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails49.mmTradeDate, com.tools20022.repository.msg.TransactionDetails82.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmTradeDate, com.tools20022.repository.msg.TransactionDetails79.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails80.mmTradeDate, com.tools20022.repository.msg.TransactionDetails75.mmTradeDate, com.tools20022.repository.msg.TransactionDetails78.mmTradeDate,
					com.tools20022.repository.msg.Trade2.mmTradeDate, com.tools20022.repository.msg.Trade1.mmDateAndTime, com.tools20022.repository.msg.SecuritiesTradeDetails51.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails55.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails54.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails52.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails50.mmTradeDate,
					com.tools20022.repository.msg.Transfer31.mmTradeDate, com.tools20022.repository.msg.Transfer31.mmTransferOrderDateForm, com.tools20022.repository.msg.Transfer30.mmTransferOrderDateForm,
					com.tools20022.repository.msg.Transfer33.mmTradeDate, com.tools20022.repository.msg.Transfer33.mmTransferOrderDateForm, com.tools20022.repository.msg.TransferStatusAndReason4.mmTradeDate,
					com.tools20022.repository.msg.TreasuryProfile1.mmDate, com.tools20022.repository.msg.SettlementDetails102.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails57.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTradeDate, com.tools20022.repository.msg.TransactionDetails88.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails61.mmTradeDate, com.tools20022.repository.msg.TransactionDetails92.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails84.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmTradeDate, com.tools20022.repository.msg.TransactionDetails83.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.mmTradeDate, com.tools20022.repository.msg.TransactionDetails87.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails60.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails91.mmTradeDate, com.tools20022.repository.msg.TransactionDetails90.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails65.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.mmTradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction2.mmTradeDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.mmTradeDate,
					com.tools20022.repository.msg.SecuredMarketTransaction2.mmTradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmTradeDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction3.mmTradeDate,
					com.tools20022.repository.msg.SecuredMarketTransaction3.mmTradeDate, com.tools20022.repository.msg.SubscriptionExecution13.mmTradeDateTime, com.tools20022.repository.msg.SubscriptionExecution12.mmTradeDateTime,
					com.tools20022.repository.msg.ExpectedExecutionDetails4.mmExpectedTradeDateTime, com.tools20022.repository.msg.RedemptionExecution16.mmTradeDateTime,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmTradeDateTime, com.tools20022.repository.msg.RedemptionExecution15.mmTradeDateTime,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmTradeDateTime, com.tools20022.repository.msg.TransparencyDataReport11.mmReportingDate,
					com.tools20022.repository.msg.TransparencyDataReport13.mmReportingDate, com.tools20022.repository.msg.TransparencyDataReport15.mmReportingDate, com.tools20022.repository.msg.TransparencyDataReport10.mmReportingDate,
					com.tools20022.repository.msg.RegulatoryReporting6.mmExecutionTimestamp, com.tools20022.repository.msg.RegulatoryReporting6.mmConfirmationDateAndTimestamp, com.tools20022.repository.msg.TradeAgreement15.mmTradeDate,
					com.tools20022.repository.msg.TradeAgreement14.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails67.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails68.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails97.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmTradeDate, com.tools20022.repository.msg.TransactionDetails96.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails95.mmTradeDate, com.tools20022.repository.msg.SettlementDetails118.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails69.mmTradeDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.mmTradeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmTradeDate, com.tools20022.repository.msg.TransactionDetails100.mmTradeDate,
					com.tools20022.repository.msg.TransactionDetails99.mmTradeDate, com.tools20022.repository.msg.TransactionDetails98.mmTradeDate, com.tools20022.repository.msg.FixingConditions1.mmTradeDate,
					com.tools20022.repository.msg.SecuredMarketTransaction4.mmTradeDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.mmTradeDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmTradeDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.mmTradeDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Commission> tradeCommission;
	/**
	 * Commission parameters associated with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmTrade
	 * Commission.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmCommissionDetails
	 * DeliverInformation4.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmCommissionDetails
	 * DeliverInformation7.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmCommissionDetails
	 * ReceiveInformation4.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmCommissionDetails
	 * ReceiveInformation8.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmCommissionDetails
	 * ReceiveInformation6.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmCommissionDetails
	 * ReceiveInformation11.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmCommissionDetails
	 * DeliverInformation11.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmCommissionDetails
	 * DeliverInformation3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmCommissionDetails
	 * DeliverInformation8.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmCommissionDetails
	 * ReceiveInformation3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmCommissionDetails
	 * ReceiveInformation7.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmCommissionDetails
	 * ReceiveInformation5.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmCommissionDetails
	 * ReceiveInformation9.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmCommissionDetails
	 * DeliverInformation5.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmCommissionDetails
	 * DeliverInformation9.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmCommissionDetails
	 * DeliverInformation6.mmCommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmCommissionDetails
	 * Order3.mmCommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCommission
	 * Order16.mmCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCommission
	 * Order14.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmCommissionDetails
	 * FundCashInBreakdown1.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#mmCommissionDetails
	 * FundCashOutBreakdown1.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmCommissionDetails
	 * FundCashInBreakdown2.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmCommissionDetails
	 * FundCashOutBreakdown2.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmCommissionDetails
	 * RedemptionOrder3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmCommissionDetails
	 * RedemptionOrder5.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmCommissionGeneralDetails
	 * RedemptionExecution3.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmCommissionGeneralDetails
	 * RedemptionExecution5.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmCommissionDetails
	 * RedemptionOrder7.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmCommissionDetails
	 * RedemptionOrder4.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmCommissionDetails
	 * RedemptionOrder6.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmCommissionGeneralDetails
	 * RedemptionExecution4.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCommissionGeneralDetails
	 * RedemptionExecution6.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmCommissionDetails
	 * RedemptionOrder8.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmCommissionDetails
	 * SubscriptionOrder3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCommissionDetails
	 * SubscriptionOrder5.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmCommissionGeneralDetails
	 * SubscriptionExecution3.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmCommissionGeneralDetails
	 * SubscriptionExecution5.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmCommissionDetails
	 * SubscriptionOrder7.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmCommissionDetails
	 * SubscriptionOrder4.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmCommissionDetails
	 * SubscriptionOrder6.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmCommissionGeneralDetails
	 * SubscriptionExecution4.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCommissionGeneralDetails
	 * SubscriptionExecution6.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmCommissionDetails
	 * SubscriptionOrder8.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmCommissionDetails
	 * SwitchRedemptionLegOrder2.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmCommissionDetails
	 * SwitchSubscriptionLegOrder2.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmCommissionDetails
	 * SwitchRedemptionLegOrder3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmCommissionDetails
	 * SwitchSubscriptionLegOrder3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmCommissionGeneralDetails
	 * SwitchRedemptionLegExecution2.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmCommissionGeneralDetails
	 * SwitchSubscriptionLegExecution2.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmCommissionGeneralDetails
	 * SwitchRedemptionLegExecution3.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmCommissionGeneralDetails
	 * SwitchSubscriptionLegExecution3.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmCommissionDetails
	 * RedemptionOrder11.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmCommissionGeneralDetails
	 * RedemptionExecution12.mmCommissionGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmCommissionDetails
	 * SubscriptionOrder11.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmCommissionGeneralDetails
	 * SubscriptionExecution9.mmCommissionGeneralDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCommissionDetails
	 * Order9.mmCommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order1#mmCommissionDetails
	 * Order1.mmCommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCommissionDetails
	 * Order6.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmCommissionDetails
	 * ReceiveInformation13.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmCommissionDetails
	 * ReceiveInformation12.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmCommissionDetails
	 * DeliverInformation12.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmCommissionDetails
	 * DeliverInformation13.mmCommissionDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCommission
	 * Order17.mmCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCommission
	 * Order18.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmCommissionDetails
	 * FundCashOutBreakdown3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmCommissionDetails
	 * FundCashInBreakdown3.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmCommissionDetails
	 * DeliverInformation15.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmCommissionDetails
	 * DeliverInformation14.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmCommissionDetails
	 * ReceiveInformation15.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmCommissionDetails
	 * ReceiveInformation14.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmCommissionDetails
	 * ReceiveInformation17.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmCommissionDetails
	 * ReceiveInformation16.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmCommissionDetails
	 * DeliverInformation16.mmCommissionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmCommissionDetails
	 * DeliverInformation17.mmCommissionDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTradeCommission = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation7.mmCommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation4.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation8.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation6.mmCommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation11.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation11.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation3.mmCommissionDetails,
					com.tools20022.repository.msg.DeliverInformation8.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation3.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation7.mmCommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation5.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation9.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation5.mmCommissionDetails,
					com.tools20022.repository.msg.DeliverInformation9.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation6.mmCommissionDetails, com.tools20022.repository.msg.Order3.mmCommissionDetails,
					com.tools20022.repository.msg.Order16.mmCommission, com.tools20022.repository.msg.Order14.mmCommission, com.tools20022.repository.msg.FundCashInBreakdown1.mmCommissionDetails,
					com.tools20022.repository.msg.FundCashOutBreakdown1.mmCommissionDetails, com.tools20022.repository.msg.FundCashInBreakdown2.mmCommissionDetails, com.tools20022.repository.msg.FundCashOutBreakdown2.mmCommissionDetails,
					com.tools20022.repository.msg.RedemptionOrder3.mmCommissionDetails, com.tools20022.repository.msg.RedemptionOrder5.mmCommissionDetails, com.tools20022.repository.msg.RedemptionExecution3.mmCommissionGeneralDetails,
					com.tools20022.repository.msg.RedemptionExecution5.mmCommissionGeneralDetails, com.tools20022.repository.msg.RedemptionOrder7.mmCommissionDetails, com.tools20022.repository.msg.RedemptionOrder4.mmCommissionDetails,
					com.tools20022.repository.msg.RedemptionOrder6.mmCommissionDetails, com.tools20022.repository.msg.RedemptionExecution4.mmCommissionGeneralDetails,
					com.tools20022.repository.msg.RedemptionExecution6.mmCommissionGeneralDetails, com.tools20022.repository.msg.RedemptionOrder8.mmCommissionDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmCommissionDetails,
					com.tools20022.repository.msg.SubscriptionOrder5.mmCommissionDetails, com.tools20022.repository.msg.SubscriptionExecution3.mmCommissionGeneralDetails,
					com.tools20022.repository.msg.SubscriptionExecution5.mmCommissionGeneralDetails, com.tools20022.repository.msg.SubscriptionOrder7.mmCommissionDetails,
					com.tools20022.repository.msg.SubscriptionOrder4.mmCommissionDetails, com.tools20022.repository.msg.SubscriptionOrder6.mmCommissionDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.mmCommissionGeneralDetails, com.tools20022.repository.msg.SubscriptionExecution6.mmCommissionGeneralDetails,
					com.tools20022.repository.msg.SubscriptionOrder8.mmCommissionDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder2.mmCommissionDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmCommissionDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.mmCommissionDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmCommissionDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmCommissionGeneralDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmCommissionGeneralDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmCommissionGeneralDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmCommissionGeneralDetails, com.tools20022.repository.msg.RedemptionOrder11.mmCommissionDetails,
					com.tools20022.repository.msg.RedemptionExecution12.mmCommissionGeneralDetails, com.tools20022.repository.msg.SubscriptionOrder11.mmCommissionDetails,
					com.tools20022.repository.msg.SubscriptionExecution9.mmCommissionGeneralDetails, com.tools20022.repository.msg.Order9.mmCommissionDetails, com.tools20022.repository.msg.Order1.mmCommissionDetails,
					com.tools20022.repository.msg.Order6.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation13.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation12.mmCommissionDetails,
					com.tools20022.repository.msg.DeliverInformation12.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation13.mmCommissionDetails, com.tools20022.repository.msg.Order17.mmCommission,
					com.tools20022.repository.msg.Order18.mmCommission, com.tools20022.repository.msg.FundCashOutBreakdown3.mmCommissionDetails, com.tools20022.repository.msg.FundCashInBreakdown3.mmCommissionDetails,
					com.tools20022.repository.msg.DeliverInformation15.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation14.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation15.mmCommissionDetails,
					com.tools20022.repository.msg.ReceiveInformation14.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation17.mmCommissionDetails, com.tools20022.repository.msg.ReceiveInformation16.mmCommissionDetails,
					com.tools20022.repository.msg.DeliverInformation16.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation17.mmCommissionDetails);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCommission";
			definition = "Commission parameters associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Date on which the trade is settled, ie, the amounts are due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmValueDate
	 * TransactionDetails6.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmValueDate
	 * TransactionDetails18.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmValueDate
	 * TransactionDetails24.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmValueDate
	 * TransactionDetails34.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmValueDate
	 * TransactionDetails37.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmValueDate
	 * TransactionDetails48.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmValueDate
	 * TransactionDetails57.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmValueDate
	 * TransactionDetails60.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingDateCode1Choice#mmProprietary
	 * TradingDateCode1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmCurrentSettlementDate
	 * TradeData8.mmCurrentSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmNewSettlementDate
	 * TradeData8.mmNewSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#mmSettlementDate
	 * AmountsAndValueDate1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmValueDate
	 * TransactionDetails51.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmValueDate
	 * TransactionDetails63.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmValueDate
	 * TransactionDetails68.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmCurrentSettlementDate
	 * TradeData11.mmCurrentSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmNewSettlementDate
	 * TradeData11.mmNewSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmSpotValueDate
	 * ForeignExchangeSwapTransaction1.mmSpotValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmValueDate
	 * TransactionDetails78.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmValuationRate
	 * Option10.mmValuationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmValueDate
	 * TransactionDetails91.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmSpotValueDate
	 * ForeignExchangeSwapTransaction2.mmSpotValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingTimestamp
	 * RegulatoryReporting6.mmClearingTimestamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmValueDate
	 * TransactionDetails95.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmValueDate
	 * TransactionDetails98.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmSpotValueDate
	 * ForeignExchangeSwapTransaction3.mmSpotValueDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails6.mmValueDate, com.tools20022.repository.msg.TransactionDetails18.mmValueDate,
					com.tools20022.repository.msg.TransactionDetails24.mmValueDate, com.tools20022.repository.msg.TransactionDetails34.mmValueDate, com.tools20022.repository.msg.TransactionDetails37.mmValueDate,
					com.tools20022.repository.msg.TransactionDetails48.mmValueDate, com.tools20022.repository.msg.TransactionDetails57.mmValueDate, com.tools20022.repository.msg.TransactionDetails60.mmValueDate,
					com.tools20022.repository.choice.TradingDateCode1Choice.mmProprietary, com.tools20022.repository.msg.TradeData8.mmCurrentSettlementDate, com.tools20022.repository.msg.TradeData8.mmNewSettlementDate,
					com.tools20022.repository.msg.AmountsAndValueDate1.mmSettlementDate, com.tools20022.repository.msg.TransactionDetails51.mmValueDate, com.tools20022.repository.msg.TransactionDetails63.mmValueDate,
					com.tools20022.repository.msg.TransactionDetails68.mmValueDate, com.tools20022.repository.msg.TradeData11.mmCurrentSettlementDate, com.tools20022.repository.msg.TradeData11.mmNewSettlementDate,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.mmSpotValueDate, com.tools20022.repository.msg.TransactionDetails78.mmValueDate, com.tools20022.repository.msg.Option10.mmValuationRate,
					com.tools20022.repository.msg.TransactionDetails91.mmValueDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.mmSpotValueDate, com.tools20022.repository.msg.RegulatoryReporting6.mmClearingTimestamp,
					com.tools20022.repository.msg.TransactionDetails95.mmValueDate, com.tools20022.repository.msg.TransactionDetails98.mmValueDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.mmSpotValueDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODateTime endDate;
	/**
	 * End date of the trade, such as a treasury trade or a derivative trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingDate1Choice#mmDate
	 * ClosingDate1Choice.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingDate1Choice#mmCode
	 * ClosingDate1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#mmEndDate
	 * TransactionDates1.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmEndDate
	 * TransactionDates2.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmMaturityDate
	 * TradeContract1.mmMaturityDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEndDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClosingDate1Choice.mmDate, com.tools20022.repository.choice.ClosingDate1Choice.mmCode, com.tools20022.repository.msg.TransactionDates1.mmEndDate,
					com.tools20022.repository.msg.TransactionDates2.mmEndDate, com.tools20022.repository.msg.TradeContract1.mmMaturityDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndDate";
			definition = "End date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradeIdentification> tradeRelatedIdentifications;
	/**
	 * Specifies the different identifications associated with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
	 * TradeIdentification.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation1Choice#mmReference
	 * Cancellation1Choice.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmCounterpartySideUniqueTransactionIdentifier
	 * RegulatoryReporting1.mmCounterpartySideUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmTransactionIdentification
	 * IntraBalanceCancellation2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice#mmReferences
	 * Cancellation5Choice.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice#mmReferences
	 * Cancellation4Choice.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1#mmCounterpartySideUniqueTransactionIdentifier
	 * CounterpartySideTransactionReporting1.
	 * mmCounterpartySideUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1#mmTradingSideUniqueTransactionIdentifier
	 * TradingSideTransactionReporting1.mmTradingSideUniqueTransactionIdentifier
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice#mmReferences
	 * Cancellation9Choice.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation8Choice#mmReferences
	 * Cancellation8Choice.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation12Choice#mmReferences
	 * Cancellation12Choice.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice#mmReferences
	 * Cancellation10Choice.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmRelatedTradeReference
	 * GeneralInformation5.mmRelatedTradeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmLinkedReportIdentification
	 * TradeData12.mmLinkedReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmCounterpartyNettingIdentification
	 * NetObligation1.mmCounterpartyNettingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmRelatedReference
	 * FixingConditions1.mmRelatedReference}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Cancellation1Choice.mmReference, com.tools20022.repository.msg.RegulatoryReporting1.mmCounterpartySideUniqueTransactionIdentifier,
					com.tools20022.repository.msg.IntraBalanceCancellation2.mmTransactionIdentification, com.tools20022.repository.choice.Cancellation5Choice.mmReferences, com.tools20022.repository.choice.Cancellation4Choice.mmReferences,
					com.tools20022.repository.msg.CounterpartySideTransactionReporting1.mmCounterpartySideUniqueTransactionIdentifier, com.tools20022.repository.msg.TradingSideTransactionReporting1.mmTradingSideUniqueTransactionIdentifier,
					com.tools20022.repository.choice.Cancellation9Choice.mmReferences, com.tools20022.repository.choice.Cancellation8Choice.mmReferences, com.tools20022.repository.choice.Cancellation12Choice.mmReferences,
					com.tools20022.repository.choice.Cancellation10Choice.mmReferences, com.tools20022.repository.msg.GeneralInformation5.mmRelatedTradeReference, com.tools20022.repository.msg.TradeData12.mmLinkedReportIdentification,
					com.tools20022.repository.msg.NetObligation1.mmCounterpartyNettingIdentification, com.tools20022.repository.msg.FixingConditions1.mmRelatedReference);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
		}
	};
	protected Max35Text allocationIndicator;
	/**
	 * Specifies the type of allocation for a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmAllocationIndicator
	 * RegulatoryReporting1.mmAllocationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAllocationIndicator
	 * RegulatoryReporting4.mmAllocationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmAllocationIndicator
	 * RegulatoryReporting6.mmAllocationIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAllocationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.mmAllocationIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmAllocationIndicator,
					com.tools20022.repository.msg.RegulatoryReporting6.mmAllocationIndicator);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies the type of allocation for a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralisationType;
	/**
	 * Specifies the type of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmCollateralisationIndicator
	 * RegulatoryReporting1.mmCollateralisationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralisationIndicator
	 * RegulatoryReporting4.mmCollateralisationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralisationIndicator
	 * RegulatoryReporting6.mmCollateralisationIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCollateralisationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.mmCollateralisationIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmCollateralisationIndicator,
					com.tools20022.repository.msg.RegulatoryReporting6.mmCollateralisationIndicator);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralisationType";
			definition = "Specifies the type of collateralisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator blockIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation1#mmBlockIndicator
	 * GeneralInformation1.mmBlockIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBlockIndicator
	 * GeneralInformation4.mmBlockIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation2#mmBlockIndicator
	 * GeneralInformation2.mmBlockIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBlockIndicator
	 * GeneralInformation5.mmBlockIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBlockIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralInformation1.mmBlockIndicator, com.tools20022.repository.msg.GeneralInformation4.mmBlockIndicator,
					com.tools20022.repository.msg.GeneralInformation2.mmBlockIndicator, com.tools20022.repository.msg.GeneralInformation5.mmBlockIndicator);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected NettingEligibleCode settlementNetting;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing1#mmSettlementNettingEligibleCode
	 * Clearing1.mmSettlementNettingEligibleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing2#mmSettlementNettingEligibleCode
	 * Clearing2.mmSettlementNettingEligibleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmSettlementNettingEligibleCode
	 * Clearing4.mmSettlementNettingEligibleCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSettlementNetting = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Clearing1.mmSettlementNettingEligibleCode, com.tools20022.repository.msg.Clearing2.mmSettlementNettingEligibleCode,
					com.tools20022.repository.msg.Clearing4.mmSettlementNettingEligibleCode);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementNetting";
			definition = "Indicates to the clearing member whether the trade is eligible for settlement netting or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NettingEligibleCode.mmObject();
		}
	};
	protected TradePartyRole tradePartyRole;
	/**
	 * Role played by a party in relation with a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
	 * TradePartyRole.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmTradingParties
	 * Order3.mmTradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction1#mmIntermediaryDetails
	 * RedemptionBulkOrderInstruction1.mmIntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmRelatedPartyDetails
	 * RedemptionOrder5.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction2#mmRelatedPartyDetails
	 * RedemptionBulkOrderInstruction2.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmRelatedPartyDetails
	 * RedemptionExecution5.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1#mmRelatedPartyDetails
	 * OrderConfirmationDetails1.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmRelatedPartyDetails
	 * RedemptionOrder7.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#mmIntermediaryDetails
	 * RedemptionMultipleOrderInstruction1.mmIntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmRelatedPartyDetails
	 * RedemptionOrder6.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2#mmRelatedPartyDetails
	 * RedemptionMultipleOrderInstruction2.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRelatedPartyDetails
	 * RedemptionExecution6.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#mmRelatedPartyDetails
	 * RedemptionOrderConfirmation1.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRelatedPartyDetails
	 * RedemptionOrder8.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction1#mmIntermediaryDetails
	 * SubscriptionBulkOrderInstruction1.mmIntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmRelatedPartyDetails
	 * SubscriptionOrder5.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2#mmRelatedPartyDetails
	 * SubscriptionBulkOrderInstruction2.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmRelatedPartyDetails
	 * SubscriptionExecution5.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1#mmRelatedPartyDetails
	 * SubscriptionBulkOrderConfirmation1.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmRelatedPartyDetails
	 * SubscriptionOrder7.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction1#mmIntermediaryDetails
	 * SubscriptionMultipleOrderInstruction1.mmIntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmRelatedPartyDetails
	 * SubscriptionOrder6.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2#mmRelatedPartyDetails
	 * SubscriptionMultipleOrderInstruction2.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRelatedPartyDetails
	 * SubscriptionExecution6.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1#mmRelatedPartyDetails
	 * SubscriptionOrderConfirmation1.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmRelatedPartyDetails
	 * SubscriptionOrder8.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction1#mmIntermediaryDetails
	 * SwitchOrderInstruction1.mmIntermediaryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmRelatedPartyDetails
	 * SwitchOrder3.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmRelatedPartyDetails
	 * SwitchExecution4.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmRelatedPartyDetails
	 * SwitchOrder4.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmRelatedPartyDetails
	 * RedemptionExecution10.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmRelatedPartyDetails
	 * RedemptionOrder9.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRelatedPartyDetails
	 * SubscriptionExecution7.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmRelatedPartyDetails
	 * SubscriptionOrder9.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmRelatedPartyDetails
	 * RedemptionOrder11.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmRelatedPartyDetails
	 * RedemptionExecution12.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmRelatedPartyDetails
	 * SubscriptionOrder11.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmRelatedPartyDetails
	 * SubscriptionExecution9.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmTradingParties
	 * OrderStatusAndReason5.mmTradingParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmTradingParties
	 * Order9.mmTradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmTradingParties
	 * InstrumentLeg2.mmTradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MassQuote1#mmTradingParties
	 * MassQuote1.mmTradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmTradingParties
	 * IndicationOfInterest1.mmTradingParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmTradingParties
	 * Order6.mmTradingParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#mmTradingParties
	 * Order11.mmTradingParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTripartyAgentIdentification
	 * SecuredMarketTransaction1.mmTripartyAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTripartyAgentIdentification
	 * SecuredMarketTransaction2.mmTripartyAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTripartyAgentIdentification
	 * SecuredMarketTransaction3.mmTripartyAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmRelatedPartyDetails
	 * SwitchExecution7.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmRelatedPartyDetails
	 * SwitchOrder7.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRelatedPartyDetails
	 * RedemptionOrder14.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRelatedPartyDetails
	 * SubscriptionExecution13.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmRelatedPartyDetails
	 * SubscriptionExecution12.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmRelatedPartyDetails
	 * SubscriptionOrder15.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmRelatedPartyDetails
	 * RedemptionOrder15.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmRelatedPartyDetails
	 * RedemptionExecution16.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmRelatedPartyDetails
	 * SubscriptionOrder14.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRelatedPartyDetails
	 * RedemptionExecution15.mmRelatedPartyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTripartyAgentIdentification
	 * SecuredMarketTransaction4.mmTripartyAgentIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTradePartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.mmTradingParties, com.tools20022.repository.msg.RedemptionBulkOrderInstruction1.mmIntermediaryDetails,
					com.tools20022.repository.msg.RedemptionOrder5.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionBulkOrderInstruction2.mmRelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionExecution5.mmRelatedPartyDetails, com.tools20022.repository.msg.OrderConfirmationDetails1.mmRelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionOrder7.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmIntermediaryDetails,
					com.tools20022.repository.msg.RedemptionOrder6.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.mmRelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionExecution6.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmRelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionOrder8.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionBulkOrderInstruction1.mmIntermediaryDetails,
					com.tools20022.repository.msg.SubscriptionOrder5.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionBulkOrderInstruction2.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionExecution5.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionBulkOrderConfirmation1.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionOrder7.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction1.mmIntermediaryDetails,
					com.tools20022.repository.msg.SubscriptionOrder6.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionExecution6.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrderConfirmation1.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionOrder8.mmRelatedPartyDetails, com.tools20022.repository.msg.SwitchOrderInstruction1.mmIntermediaryDetails, com.tools20022.repository.msg.SwitchOrder3.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SwitchExecution4.mmRelatedPartyDetails, com.tools20022.repository.msg.SwitchOrder4.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution10.mmRelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionOrder9.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionExecution7.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder9.mmRelatedPartyDetails,
					com.tools20022.repository.msg.RedemptionOrder11.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution12.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder11.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionExecution9.mmRelatedPartyDetails, com.tools20022.repository.msg.OrderStatusAndReason5.mmTradingParties, com.tools20022.repository.msg.Order9.mmTradingParties,
					com.tools20022.repository.msg.InstrumentLeg2.mmTradingParties, com.tools20022.repository.msg.MassQuote1.mmTradingParties, com.tools20022.repository.msg.IndicationOfInterest1.mmTradingParties,
					com.tools20022.repository.msg.Order6.mmTradingParties, com.tools20022.repository.msg.Order11.mmTradingParties, com.tools20022.repository.msg.SecuredMarketTransaction1.mmTripartyAgentIdentification,
					com.tools20022.repository.msg.SecuredMarketTransaction2.mmTripartyAgentIdentification, com.tools20022.repository.msg.SecuredMarketTransaction3.mmTripartyAgentIdentification,
					com.tools20022.repository.msg.SwitchExecution7.mmRelatedPartyDetails, com.tools20022.repository.msg.SwitchOrder7.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder14.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionExecution12.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionOrder15.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrder15.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution16.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SubscriptionOrder14.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution15.mmRelatedPartyDetails,
					com.tools20022.repository.msg.SecuredMarketTransaction4.mmTripartyAgentIdentification);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Role played by a party in relation with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Obligation> obligation;
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmTrade
	 * Obligation.mmTrade}</li>
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
	public static final MMBusinessAssociationEnd mmObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * Negotiation process which is the source of the treasury trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradeExecution
	 * Negotiation.mmTradeExecution}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process which is the source of the treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected MasterAgreement governingDocument;
	/**
	 * Legal agreement applicable to a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedTrades
	 * MasterAgreement.mmGovernedTrades}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmApplicableRules
	 * PaymentObligation2.mmApplicableRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmTradeAgreement
	 * CardPaymentInvoice1.mmTradeAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmTradeAgreement
	 * CardPaymentInvoice2.mmTradeAgreement}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmGoverningDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation2.mmApplicableRules, com.tools20022.repository.msg.CardPaymentInvoice1.mmTradeAgreement,
					com.tools20022.repository.msg.CardPaymentInvoice2.mmTradeAgreement);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoverningDocument";
			definition = "Legal agreement applicable to a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmGovernedTrades;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
		}
	};
	protected ISODateTime startDate;
	/**
	 * Start date of the trade, such as a treasury trade or a derivative trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmProcessingDate
	 * Order16.mmProcessingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmProcessingDate
	 * Order14.mmProcessingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#mmStartDate
	 * TransactionDates1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmStartDate
	 * TransactionDates2.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmProcessingDate
	 * Order17.mmProcessingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmProcessingDate
	 * Order18.mmProcessingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmStartDate
	 * OvernightIndexSwapTransaction1.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#mmStartDate
	 * TradeContract1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmStartDate
	 * OvernightIndexSwapTransaction3.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmBillingPeriod
	 * TradeSettlement2.mmBillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmStartDate
	 * OvernightIndexSwapTransaction4.mmStartDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStartDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.mmProcessingDate, com.tools20022.repository.msg.Order14.mmProcessingDate, com.tools20022.repository.msg.TransactionDates1.mmStartDate,
					com.tools20022.repository.msg.TransactionDates2.mmStartDate, com.tools20022.repository.msg.Order17.mmProcessingDate, com.tools20022.repository.msg.Order18.mmProcessingDate,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.mmStartDate, com.tools20022.repository.msg.TradeContract1.mmStartDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction3.mmStartDate,
					com.tools20022.repository.msg.TradeSettlement2.mmBillingPeriod, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmStartDate);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Start date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected System system;
	/**
	 * System involved in the processing of a trade such as clearing, settlement
	 * or matching system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#mmTrade
	 * System.mmTrade}</li>
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
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System involved in the processing of a trade such as clearing, settlement or matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Asset> asset;
	/**
	 * Asset which is the object of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#mmTrade
	 * Asset.mmTrade}</li>
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
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Asset which is the object of a trade.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected Market market;
	/**
	 * Market where a trade is negotiated and executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Market#mmTrade
	 * Market.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmPlaceOfTrade
	 * NetPosition2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmPlaceOfTrade
	 * NetPosition3.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmTradeMarket
	 * FinancialItemParameters1.mmTradeMarket}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmMarket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetPosition2.mmPlaceOfTrade, com.tools20022.repository.msg.NetPosition3.mmPlaceOfTrade, com.tools20022.repository.msg.FinancialItemParameters1.mmTradeMarket);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market where a trade is negotiated and executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	protected Guarantee guarantee;
	/**
	 * Guarantee which covers a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteedTrade
	 * Guarantee.mmGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmGuarantee
	 * FinancingAgreementItem1.mmGuarantee}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmGuarantee = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingAgreementItem1.mmGuarantee);
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee which covers a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.mmGuaranteedTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	protected Settlement settlement;
	/**
	 * Transfer of proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmTrade
	 * Settlement.mmTrade}</li>
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
	public static final MMBusinessAssociationEnd mmSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Transfer of proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
		}
	};
	protected Order order;
	/**
	 * Specifies the order related to a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Order#mmTrade
	 * Order.mmTrade}</li>
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
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Specifies the order related to a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Order.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Leg> leg;
	/**
	 * Separate transactions which combined together form a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Leg#mmTrade
	 * Leg.mmTrade}</li>
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
	public static final MMBusinessAssociationEnd mmLeg = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Leg";
			definition = "Separate transactions which combined together form a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * Financial transaction to which the trade belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmTrade
	 * FinancialTransaction.mmTrade}</li>
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
	public static final MMBusinessAssociationEnd mmFinancialTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the trade belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmReconciledTrades
	 * Reconciliation.mmReconciledTrades}</li>
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
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Trade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmReconciledTrades;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Trade";
				definition = "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmTrade, com.tools20022.repository.entity.Commission.mmTrade, com.tools20022.repository.entity.Obligation.mmTrade,
						com.tools20022.repository.entity.TradeIdentification.mmTrade, com.tools20022.repository.entity.TradePartyRole.mmTrade, com.tools20022.repository.entity.System.mmTrade,
						com.tools20022.repository.entity.Settlement.mmTrade, com.tools20022.repository.entity.Leg.mmTrade, com.tools20022.repository.entity.Negotiation.mmTradeExecution,
						com.tools20022.repository.entity.MasterAgreement.mmGovernedTrades, com.tools20022.repository.entity.Guarantee.mmGuaranteedTrade, com.tools20022.repository.entity.Reconciliation.mmReconciledTrades,
						com.tools20022.repository.entity.Market.mmTrade, com.tools20022.repository.entity.Order.mmTrade, com.tools20022.repository.entity.FinancialTransaction.mmTrade);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradingDateCode1Choice.mmCode, com.tools20022.repository.choice.TradeDate4Choice.mmDate,
						com.tools20022.repository.choice.TradeDate4Choice.mmValue);
				subType_lazy = () -> Arrays.asList(SecuritiesTrade.mmObject(), TreasuryTrade.mmObject(), CommercialTrade.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmTradeDateTime, com.tools20022.repository.entity.Trade.mmTradeCommission, com.tools20022.repository.entity.Trade.mmValueDate,
						com.tools20022.repository.entity.Trade.mmEndDate, com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications, com.tools20022.repository.entity.Trade.mmAllocationIndicator,
						com.tools20022.repository.entity.Trade.mmCollateralisationType, com.tools20022.repository.entity.Trade.mmBlockIndicator, com.tools20022.repository.entity.Trade.mmSettlementNetting,
						com.tools20022.repository.entity.Trade.mmTradePartyRole, com.tools20022.repository.entity.Trade.mmObligation, com.tools20022.repository.entity.Trade.mmRelatedNegotiation,
						com.tools20022.repository.entity.Trade.mmGoverningDocument, com.tools20022.repository.entity.Trade.mmStartDate, com.tools20022.repository.entity.Trade.mmSystem, com.tools20022.repository.entity.Trade.mmAsset,
						com.tools20022.repository.entity.Trade.mmMarket, com.tools20022.repository.entity.Trade.mmGuarantee, com.tools20022.repository.entity.Trade.mmSettlement, com.tools20022.repository.entity.Trade.mmOrder,
						com.tools20022.repository.entity.Trade.mmLeg, com.tools20022.repository.entity.Trade.mmFinancialTransaction, com.tools20022.repository.entity.Trade.mmReconciliation);
				derivationComponent_lazy = () -> Arrays.asList(DateAndDateTime1Choice.mmObject(), TradingDateCode1Choice.mmObject(), TradeDate4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getTradeDateTime() {
		return tradeDateTime;
	}

	public void setTradeDateTime(ISODateTime tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}

	public List<Commission> getTradeCommission() {
		return tradeCommission;
	}

	public void setTradeCommission(List<com.tools20022.repository.entity.Commission> tradeCommission) {
		this.tradeCommission = tradeCommission;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	public ISODateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(ISODateTime endDate) {
		this.endDate = endDate;
	}

	public List<TradeIdentification> getTradeRelatedIdentifications() {
		return tradeRelatedIdentifications;
	}

	public void setTradeRelatedIdentifications(List<com.tools20022.repository.entity.TradeIdentification> tradeRelatedIdentifications) {
		this.tradeRelatedIdentifications = tradeRelatedIdentifications;
	}

	public Max35Text getAllocationIndicator() {
		return allocationIndicator;
	}

	public void setAllocationIndicator(Max35Text allocationIndicator) {
		this.allocationIndicator = allocationIndicator;
	}

	public Max35Text getCollateralisationType() {
		return collateralisationType;
	}

	public void setCollateralisationType(Max35Text collateralisationType) {
		this.collateralisationType = collateralisationType;
	}

	public YesNoIndicator getBlockIndicator() {
		return blockIndicator;
	}

	public void setBlockIndicator(YesNoIndicator blockIndicator) {
		this.blockIndicator = blockIndicator;
	}

	public NettingEligibleCode getSettlementNetting() {
		return settlementNetting;
	}

	public void setSettlementNetting(NettingEligibleCode settlementNetting) {
		this.settlementNetting = settlementNetting;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public void setTradePartyRole(com.tools20022.repository.entity.TradePartyRole tradePartyRole) {
		this.tradePartyRole = tradePartyRole;
	}

	public List<Obligation> getObligation() {
		return obligation;
	}

	public void setObligation(List<com.tools20022.repository.entity.Obligation> obligation) {
		this.obligation = obligation;
	}

	public Negotiation getRelatedNegotiation() {
		return relatedNegotiation;
	}

	public void setRelatedNegotiation(com.tools20022.repository.entity.Negotiation relatedNegotiation) {
		this.relatedNegotiation = relatedNegotiation;
	}

	public MasterAgreement getGoverningDocument() {
		return governingDocument;
	}

	public void setGoverningDocument(com.tools20022.repository.entity.MasterAgreement governingDocument) {
		this.governingDocument = governingDocument;
	}

	public ISODateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(ISODateTime startDate) {
		this.startDate = startDate;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(com.tools20022.repository.entity.System system) {
		this.system = system;
	}

	public List<Asset> getAsset() {
		return asset;
	}

	public void setAsset(List<com.tools20022.repository.entity.Asset> asset) {
		this.asset = asset;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(com.tools20022.repository.entity.Market market) {
		this.market = market;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(com.tools20022.repository.entity.Guarantee guarantee) {
		this.guarantee = guarantee;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(com.tools20022.repository.entity.Settlement settlement) {
		this.settlement = settlement;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(com.tools20022.repository.entity.Order order) {
		this.order = order;
	}

	public List<Leg> getLeg() {
		return leg;
	}

	public void setLeg(List<com.tools20022.repository.entity.Leg> leg) {
		this.leg = leg;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public void setFinancialTransaction(com.tools20022.repository.entity.FinancialTransaction financialTransaction) {
		this.financialTransaction = financialTransaction;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(com.tools20022.repository.entity.Reconciliation reconciliation) {
		this.reconciliation = reconciliation;
	}
}