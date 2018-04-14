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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.NettingEligibleCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.msg.CommonTradeDataReport21
 * CommonTradeDataReport21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonTradeDataReport20
 * CommonTradeDataReport20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
 * TradeAdditionalQueryCriteria3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonTradeDataReport23
 * CommonTradeDataReport23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonTradeDataReport22
 * CommonTradeDataReport22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonTradeDataReport24
 * CommonTradeDataReport24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonTradeDataReport19
 * CommonTradeDataReport19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateLegs5
 * InterestRateLegs5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommonTradeDataReport25
 * CommonTradeDataReport25}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Trade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime tradeDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmTradeDate
	 * TransactionDetails93.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails94#mmTradeDate
	 * TransactionDetails94.mmTradeDate}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction15#mmExecutionDateTime
	 * TradeTransaction15.mmExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction17#mmExecutionDateTime
	 * TradeTransaction17.mmExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction14#mmExecutionDateTime
	 * TradeTransaction14.mmExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmExecutionDateTime
	 * TradeTransaction18.mmExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmExecutionDateTime
	 * TradeTransaction16.mmExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmTradeDate
	 * TransactionDetails102.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTradeDate
	 * TransferStatusAndReason5.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmTradeDate
	 * Transfer35.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferOrderDateForm
	 * Transfer35.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmTransferOrderDateForm
	 * Transfer34.mmTransferOrderDateForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmTradeDate
	 * TransactionDates3.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmTransactionDateTime
	 * TransactionDates3.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmTradeDate
	 * SecuritiesTradeDetails71.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmTradeDate
	 * TransactionDetails105.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmTradeDate
	 * SecuritiesTradeDetails72.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmTradeDate
	 * TransactionDetails104.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmTradeDate
	 * TransactionDetails103.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmTradeDate
	 * SecuritiesTradeDetails73.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmTradeDate
	 * SecuritiesTradeDetails74.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmTradeDate
	 * SecuritiesTradeDetails75.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmTradeDate
	 * SecuritiesTradeDetails76.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmTradeDate
	 * SecuritiesTradeDetails77.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmTradeDate
	 * TransactionDetails107.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmTradeDate
	 * SecuritiesTradeDetails78.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmTradeDate
	 * SecuritiesTradeDetails79.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmTradeDate
	 * SecuritiesTradeDetails80.mmTradeDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment2#mmDate
	 * Garnishment2.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmTradeDate
	 * SecuritiesTradeDetails81.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails82#mmTradeDate
	 * SecuritiesTradeDetails82.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails83#mmTradeDate
	 * SecuritiesTradeDetails83.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails84#mmTradeDate
	 * SecuritiesTradeDetails84.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmTradeDate
	 * SecuritiesTradeDetails85.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmTradeDate
	 * SecuritiesTradeDetails86.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmTradeDate
	 * SecuritiesTradeDetails87.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmTradeDate
	 * SecuritiesTradeDetails88.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails109#mmTradeDate
	 * TransactionDetails109.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmTradeDate
	 * SecuritiesTradeDetails89.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmTradeDate
	 * SecuritiesTradeDetails90.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmTradeDate
	 * TransactionDetails110.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmTradeDate
	 * TransactionDetails111.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmTradeDate
	 * TransactionDetails112.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD, FIXSynonym: 75</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODateTime> mmTradeDateTime = new MMBusinessAttribute<Trade, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashForecastParameters2.mmTradeDateTime, PriceValuation2.mmTradeDateTime, DateAndDateTime1Choice.mmDate, DateAndDateTime1Choice.mmDateTime, Transfer4.mmTradeDate, Transfer7.mmTradeDate,
					Transfer17.mmTradeDate, Transfer2.mmTradeDate, Transfer10.mmTradeDate, Transfer14.mmTradeDate, Transfer24.mmTradeDate, Transfer25.mmTradeDate, TransactionDetails10.mmTradeDate, TransactionDetails29.mmTradeDate,
					SecuritiesTradeDetails25.mmTradeDate, SecuritiesTradeDetails26.mmTradeDate, TransactionDetails28.mmTradeDate, TransactionDetails31.mmTradeDate, TransactionDetails44.mmTradeDate, SecuritiesTradeDetails27.mmTradeDate,
					SecuritiesTradeDetails28.mmTradeDate, Transfer18.mmTradeDate, Transfer18.mmTransferOrderDateForm, Transfer26.mmTradeDate, Transfer26.mmTransferOrderDateForm, Transfer13.mmTradeDate, Transfer13.mmTransferOrderDateForm,
					Transfer23.mmTradeDate, Transfer23.mmTransferOrderDateForm, Transfer11.mmTransferOrderDateForm, Transfer19.mmTransferOrderDateForm, SecuritiesTradeDetails6.mmTradeDate, SecuritiesTradeDetails13.mmTradeDate,
					SecuritiesTradeDetails3.mmTradeDate, SecuritiesTradeDetails11.mmTradeDate, SecuritiesTradeDetails2.mmTradeDate, SecuritiesTradeDetails16.mmTradeDate, SecuritiesTradeDetails1.mmTradeDate,
					SecuritiesTradeDetails15.mmTradeDate, TransactionDetails5.mmTradeDate, TransactionDetails9.mmTradeDate, TransactionDetails22.mmTradeDate, TransactionDetails23.mmTradeDate, TransactionDetails36.mmTradeDate,
					TransactionDetails47.mmTradeDate, TransactionDetails53.mmTradeDate, TransactionDetails58.mmTradeDate, TransactionDetails7.mmTradeDate, TransactionDetails8.mmTradeDate, TransactionDetails16.mmTradeDate,
					TransactionDetails17.mmTradeDate, TransactionDetails26.mmTradeDate, TransactionDetails25.mmTradeDate, TransactionDetails27.mmTradeDate, TransactionDetails33.mmTradeDate, TransactionDetails39.mmTradeDate,
					TransactionDetails50.mmTradeDate, TransactionDetails56.mmTradeDate, TransactionDetails59.mmTradeDate, TransactionDetails6.mmTradeDate, TransactionDetails18.mmTradeDate, TransactionDetails24.mmTradeDate,
					TransactionDetails34.mmTradeDate, TransactionDetails37.mmTradeDate, TransactionDetails48.mmTradeDate, TransactionDetails57.mmTradeDate, TransactionDetails60.mmTradeDate, Order3.mmTradeDate, PartialFill1.mmTradeDate,
					Order16.mmTradeDate, Order14.mmTradeDate, TwoLegTransactionDetails1.mmTradeDate, TransactionDates1.mmTradeDate, TransactionDates1.mmTransactionDateTime, TransactionDates2.mmTradeDate,
					TransactionDates2.mmTransactionDateTime, RegulatoryReporting1.mmExecutionTimestamp, TradeAgreement2.mmTradeDate, TradeAgreement8.mmTradeDate, TradeAgreement1.mmTradeDate, TradeAgreement7.mmTradeDate,
					TradeAgreement9.mmTradeDate, FundCashForecast1.mmTradeDateTime, FundCashForecast1.mmPreviousTradeDateTime, FundCashForecast3.mmTradeDateTime, FundCashForecast3.mmPreviousTradeDateTime, FundCashForecast2.mmTradeDateTime,
					FundCashForecast2.mmPreviousTradeDateTime, FundCashForecast4.mmTradeDateTime, FundCashForecast4.mmPreviousTradeDateTime, EstimatedFundCashForecast2.mmTradeDateTime, EstimatedFundCashForecast2.mmPreviousTradeDateTime,
					EstimatedFundCashForecast4.mmTradeDateTime, EstimatedFundCashForecast4.mmPreviousTradeDateTime, EstimatedFundCashForecast1.mmTradeDateTime, EstimatedFundCashForecast1.mmPreviousTradeDateTime,
					EstimatedFundCashForecast3.mmTradeDateTime, EstimatedFundCashForecast3.mmPreviousTradeDateTime, ExpectedExecutionDetails1.mmExpectedTradeDateTime, ExpectedExecutionDetails2.mmExpectedTradeDateTime,
					RedemptionExecution3.mmTradeDateTime, RedemptionExecution5.mmTradeDateTime, RedemptionExecution4.mmTradeDateTime, RedemptionExecution6.mmTradeDateTime, InvestmentFundTransaction2.mmTradeDateTime,
					InvestmentFundTransaction3.mmTradeDateTime, SubscriptionExecution3.mmTradeDateTime, SubscriptionExecution5.mmTradeDateTime, SubscriptionExecution4.mmTradeDateTime, SubscriptionExecution6.mmTradeDateTime,
					SwitchRedemptionLegExecution2.mmTradeDateTime, SwitchSubscriptionLegExecution2.mmTradeDateTime, SwitchRedemptionLegExecution3.mmTradeDateTime, SwitchSubscriptionLegExecution3.mmTradeDateTime,
					TransferStatusAndReason2.mmTradeDate, TransactionDetails1.mmTradeDateTime, TransactionDetails3.mmTradeDateTime, SecuritiesTradeDetails7.mmTradeDate, SecuritiesTradeDetails19.mmTradeDate,
					SecuritiesTradeDetails5.mmTradeDate, SecuritiesFinancingTransactionDetails2.mmTradeDate, SecuritiesFinancingTransactionDetails8.mmTradeDate, SecuritiesTradeDetails8.mmTradeDate, SecuritiesTradeDetails18.mmTradeDate,
					SecuritiesTradeDetails4.mmTradeDate, SecuritiesTradeDetails17.mmTradeDate, TransactionDetails4.mmTradeDate, TransactionDetails30.mmTradeDate, OpeningData1.mmTradeDate, ClosingData1.mmTradeDate, OpeningData2.mmTradeDate,
					ClosingData2.mmTradeDate, OptionData1.mmTradeDate, OptionData2.mmTradeDate, SecuritiesTradeDetails12.mmTradeDate, SecuritiesFinancingTransactionDetails6.mmTradeDate, SecuritiesFinancingTransactionDetails10.mmTradeDate,
					SecuritiesFinancingTransactionDetails17.mmTradeDate, SecuritiesFinancingTransactionDetails18.mmTradeDate, TransactionDetails20.mmTradeDate, SecuritiesTradeDetails9.mmTradeDate, SecuritiesTradeDetails21.mmTradeDate,
					SecuritiesTradeDetails10.mmTradeDate, SecuritiesTradeDetails22.mmTradeDate, SecuritiesTradeDetails23.mmTradeDate, SecuritiesTradeDetails29.mmTradeDate, TransactionDetails40.mmTradeDate, TransactionDetails42.mmTradeDate,
					TransactionDetails46.mmTradeDate, TransactionDetails32.mmTradeDate, TransactionDetails14.mmTradeDate, TransactionDetails35.mmTradeDate, SecuritiesTradeDetails14.mmTradeDate, SecuritiesTradeDetails20.mmTradeDate,
					SecuritiesTradeDetails24.mmTradeDate, SecuritiesTradeDetails30.mmTradeDate, TransactionDetails45.mmTradeDate, SettlementObligation1.mmTradeDate, SettlementObligation6.mmTradeDate, SettlementObligation3.mmTradeDate,
					SettlementObligation2.mmTradeDate, TradeDate3Choice.mmDate, SettlementObligation5.mmTradeDate, SettlementObligation4.mmTradeDate, TradeLeg2.mmTradeDate, TradeLeg5.mmTradeDate, TradeLeg1.mmTradeDate,
					TradeLeg3.mmTradeDate, TradeLeg6.mmTradeDate, TradeLeg4.mmTradeDate, TradeLeg7.mmTradeDate, NetPosition2.mmTradeDate, ExpectedExecutionDetails3.mmExpectedTradeDateTime, RedemptionExecution10.mmTradeDateTime,
					SubscriptionExecution7.mmTradeDateTime, RedemptionExecution12.mmTradeDateTime, SubscriptionExecution9.mmTradeDateTime, TransactionDetails51.mmTradeDate, TransactionDetails52.mmTradeDate, Order9.mmTradeDate,
					Bid1.mmTradeDate, Order6.mmTradeDate, List2.mmTradeDate, OptionData3.mmTradeDate, OptionData4.mmTradeDate, Transfer27.mmTransferOrderDateForm, Transfer28.mmTradeDate, Transfer28.mmTransferOrderDateForm,
					Transfer29.mmTradeDate, Transfer29.mmTransferOrderDateForm, TransferStatusAndReason3.mmTradeDate, TransactionDetails61.mmTradeDate, SecuritiesFinancingTransactionDetails21.mmTradeDate, TransactionDetails62.mmTradeDate,
					TransactionDetails63.mmTradeDate, Garnishment1.mmDate, SecuritiesTradeDetails31.mmTradeDate, SecuritiesTradeDetails33.mmTradeDate, SecuritiesTradeDetails35.mmTradeDate, SecuritiesTradeDetails38.mmTradeDate,
					SecuritiesTradeDetails37.mmTradeDate, SecuritiesTradeDetails36.mmTradeDate, SecuritiesTradeDetails34.mmTradeDate, SecuritiesTradeDetails32.mmTradeDate, Order17.mmTradeDate, Order18.mmTradeDate, PartialFill2.mmTradeDate,
					SecuritiesTradeDetails44.mmTradeDate, SecuritiesTradeDetails39.mmTradeDate, SecuritiesTradeDetails43.mmTradeDate, SecuritiesTradeDetails41.mmTradeDate, SecuritiesFinancingTransactionDetails22.mmTradeDate,
					SecuritiesTradeDetails40.mmTradeDate, TransactionDetails66.mmTradeDate, SecuritiesTradeDetails42.mmTradeDate, TransactionDetails67.mmTradeDate, TransactionDetails68.mmTradeDate, SecuritiesTradeDetails46.mmTradeDate,
					SecuritiesTradeDetails47.mmTradeDate, TradeAgreement11.mmTradeDate, RegulatoryReporting4.mmExecutionTimestamp, TradeAgreement12.mmTradeDate, TradeAgreement10.mmTradeDate, FundCashForecast7.mmTradeDateTime,
					FundCashForecast7.mmPreviousTradeDateTime, Fund2.mmTradeDateTime, Fund2.mmPreviousTradeDateTime, EstimatedFundCashForecast6.mmTradeDateTime, EstimatedFundCashForecast6.mmPreviousTradeDateTime, Fund1.mmTradeDateTime,
					Fund1.mmPreviousTradeDateTime, FundCashForecast6.mmTradeDateTime, FundCashForecast6.mmPreviousTradeDateTime, EstimatedFundCashForecast5.mmTradeDateTime, EstimatedFundCashForecast5.mmPreviousTradeDateTime,
					InvestmentFundTransaction4.mmTradeDateTime, TradeLeg8.mmTradeDate, TradeLeg8.mmTransactionDateTime, SecuritiesFinancingTransactionDetails24.mmTradeDate, TransactionDetails70.mmTradeDate,
					TransactionDetails69.mmTradeDate, SettlementObligation7.mmTradeDate, NetPosition3.mmTradeDate, TradeLeg10.mmTradeDate, TradeLeg10.mmTransactionDateAndTime, TradeLeg9.mmTradeDate, TradeLeg9.mmTransactionDateAndTime,
					SettlementObligation8.mmTradeDate, SettlementDetails88.mmTradeDate, TransactionDetails71.mmTradeDate, SecuritiesFinancingTransactionDetails25.mmTradeDate, TransactionDetails72.mmTradeDate,
					ForeignExchangeSwapTransaction1.mmTradeDate, UnsecuredMarketTransaction1.mmTradeDate, OvernightIndexSwapTransaction1.mmTradeDate, SecuredMarketTransaction1.mmTradeDate, SecuritiesTransaction1.mmTradeDate,
					TransactionDetails81.mmTradeDate, TransactionDetails74.mmTradeDate, SecuritiesTradeDetails49.mmTradeDate, TransactionDetails82.mmTradeDate, SecuritiesFinancingTransactionDetails26.mmTradeDate,
					TransactionDetails79.mmTradeDate, SecuritiesTradeDetails48.mmTradeDate, TransactionDetails80.mmTradeDate, TransactionDetails75.mmTradeDate, TransactionDetails78.mmTradeDate, Trade2.mmTradeDate, Trade1.mmDateAndTime,
					SecuritiesTradeDetails51.mmTradeDate, SecuritiesTradeDetails53.mmTradeDate, SecuritiesTradeDetails55.mmTradeDate, SecuritiesTradeDetails56.mmTradeDate, SecuritiesTradeDetails54.mmTradeDate,
					SecuritiesTradeDetails52.mmTradeDate, SecuritiesTradeDetails50.mmTradeDate, Transfer31.mmTradeDate, Transfer31.mmTransferOrderDateForm, Transfer30.mmTransferOrderDateForm, Transfer33.mmTradeDate,
					Transfer33.mmTransferOrderDateForm, TransferStatusAndReason4.mmTradeDate, TreasuryProfile1.mmDate, SettlementDetails102.mmTradeDate, SecuritiesTradeDetails57.mmTradeDate, SecuritiesTradeDetails59.mmTradeDate,
					SecuritiesFinancingTransactionDetails33.mmTradeDate, TransactionDetails88.mmTradeDate, SecuritiesTradeDetails58.mmTradeDate, SecuritiesTradeDetails61.mmTradeDate, TransactionDetails92.mmTradeDate,
					TransactionDetails84.mmTradeDate, SecuritiesTradeDetails63.mmTradeDate, TransactionDetails83.mmTradeDate, SecuritiesTradeDetails62.mmTradeDate, TransactionDetails87.mmTradeDate, SecuritiesTradeDetails60.mmTradeDate,
					TransactionDetails91.mmTradeDate, TransactionDetails90.mmTradeDate, SecuritiesTradeDetails65.mmTradeDate, SecuritiesTradeDetails66.mmTradeDate, UnsecuredMarketTransaction2.mmTradeDate,
					ForeignExchangeSwapTransaction2.mmTradeDate, SecuredMarketTransaction2.mmTradeDate, UnsecuredMarketTransaction3.mmTradeDate, OvernightIndexSwapTransaction3.mmTradeDate, SecuredMarketTransaction3.mmTradeDate,
					TransactionDetails93.mmTradeDate, TransactionDetails94.mmTradeDate, SubscriptionExecution13.mmTradeDateTime, SubscriptionExecution12.mmTradeDateTime, ExpectedExecutionDetails4.mmExpectedTradeDateTime,
					RedemptionExecution16.mmTradeDateTime, SwitchSubscriptionLegExecution4.mmTradeDateTime, RedemptionExecution15.mmTradeDateTime, SwitchRedemptionLegExecution4.mmTradeDateTime, TransparencyDataReport11.mmReportingDate,
					TransparencyDataReport13.mmReportingDate, TransparencyDataReport15.mmReportingDate, TransparencyDataReport10.mmReportingDate, RegulatoryReporting6.mmExecutionTimestamp,
					RegulatoryReporting6.mmConfirmationDateAndTimestamp, TradeAgreement15.mmTradeDate, TradeAgreement14.mmTradeDate, SecuritiesTradeDetails67.mmTradeDate, SecuritiesTradeDetails68.mmTradeDate,
					TransactionDetails97.mmTradeDate, SecuritiesFinancingTransactionDetails35.mmTradeDate, TransactionDetails96.mmTradeDate, TransactionDetails95.mmTradeDate, SettlementDetails118.mmTradeDate,
					SecuritiesTradeDetails69.mmTradeDate, SecuritiesTradeDetails70.mmTradeDate, SecuritiesFinancingTransactionDetails36.mmTradeDate, TransactionDetails100.mmTradeDate, TransactionDetails99.mmTradeDate,
					TransactionDetails98.mmTradeDate, FixingConditions1.mmTradeDate, SecuredMarketTransaction4.mmTradeDate, ForeignExchangeSwapTransaction3.mmTradeDate, OvernightIndexSwapTransaction4.mmTradeDate,
					UnsecuredMarketTransaction4.mmTradeDate, TradeTransaction15.mmExecutionDateTime, TradeTransaction17.mmExecutionDateTime, TradeTransaction14.mmExecutionDateTime, TradeTransaction18.mmExecutionDateTime,
					TradeTransaction16.mmExecutionDateTime, TransactionDetails102.mmTradeDate, TransferStatusAndReason5.mmTradeDate, Transfer35.mmTradeDate, Transfer35.mmTransferOrderDateForm, Transfer34.mmTransferOrderDateForm,
					TransactionDates3.mmTradeDate, TransactionDates3.mmTransactionDateTime, SecuritiesTradeDetails71.mmTradeDate, TransactionDetails105.mmTradeDate, SecuritiesTradeDetails72.mmTradeDate, TransactionDetails104.mmTradeDate,
					TransactionDetails103.mmTradeDate, SecuritiesTradeDetails73.mmTradeDate, SecuritiesTradeDetails74.mmTradeDate, SecuritiesTradeDetails75.mmTradeDate, SecuritiesTradeDetails76.mmTradeDate,
					SecuritiesTradeDetails77.mmTradeDate, TransactionDetails107.mmTradeDate, SecuritiesTradeDetails78.mmTradeDate, SecuritiesTradeDetails79.mmTradeDate, SecuritiesTradeDetails80.mmTradeDate, Garnishment2.mmDate,
					SecuritiesTradeDetails81.mmTradeDate, SecuritiesTradeDetails82.mmTradeDate, SecuritiesTradeDetails83.mmTradeDate, SecuritiesTradeDetails84.mmTradeDate, SecuritiesTradeDetails85.mmTradeDate,
					SecuritiesTradeDetails86.mmTradeDate, SecuritiesTradeDetails87.mmTradeDate, SecuritiesTradeDetails88.mmTradeDate, TransactionDetails109.mmTradeDate, SecuritiesTradeDetails89.mmTradeDate,
					SecuritiesTradeDetails90.mmTradeDate, TransactionDetails110.mmTradeDate, TransactionDetails111.mmTradeDate, TransactionDetails112.mmTradeDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"), new FIXSynonym(this, "75"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Trade obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(Trade obj, ISODateTime value) {
			obj.setTradeDateTime(value);
		}
	};
	protected List<Commission> tradeCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmTrade
	 * Commission.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission parameters associated with a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Commission>> mmTradeCommission = new MMBusinessAssociationEnd<Trade, List<Commission>>() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation4.mmCommissionDetails, DeliverInformation7.mmCommissionDetails, ReceiveInformation4.mmCommissionDetails, ReceiveInformation8.mmCommissionDetails,
					ReceiveInformation6.mmCommissionDetails, ReceiveInformation11.mmCommissionDetails, DeliverInformation11.mmCommissionDetails, DeliverInformation3.mmCommissionDetails, DeliverInformation8.mmCommissionDetails,
					ReceiveInformation3.mmCommissionDetails, ReceiveInformation7.mmCommissionDetails, ReceiveInformation5.mmCommissionDetails, ReceiveInformation9.mmCommissionDetails, DeliverInformation5.mmCommissionDetails,
					DeliverInformation9.mmCommissionDetails, DeliverInformation6.mmCommissionDetails, Order3.mmCommissionDetails, Order16.mmCommission, Order14.mmCommission, FundCashInBreakdown1.mmCommissionDetails,
					FundCashOutBreakdown1.mmCommissionDetails, FundCashInBreakdown2.mmCommissionDetails, FundCashOutBreakdown2.mmCommissionDetails, RedemptionOrder3.mmCommissionDetails, RedemptionOrder5.mmCommissionDetails,
					RedemptionExecution3.mmCommissionGeneralDetails, RedemptionExecution5.mmCommissionGeneralDetails, RedemptionOrder7.mmCommissionDetails, RedemptionOrder4.mmCommissionDetails, RedemptionOrder6.mmCommissionDetails,
					RedemptionExecution4.mmCommissionGeneralDetails, RedemptionExecution6.mmCommissionGeneralDetails, RedemptionOrder8.mmCommissionDetails, SubscriptionOrder3.mmCommissionDetails, SubscriptionOrder5.mmCommissionDetails,
					SubscriptionExecution3.mmCommissionGeneralDetails, SubscriptionExecution5.mmCommissionGeneralDetails, SubscriptionOrder7.mmCommissionDetails, SubscriptionOrder4.mmCommissionDetails,
					SubscriptionOrder6.mmCommissionDetails, SubscriptionExecution4.mmCommissionGeneralDetails, SubscriptionExecution6.mmCommissionGeneralDetails, SubscriptionOrder8.mmCommissionDetails,
					SwitchRedemptionLegOrder2.mmCommissionDetails, SwitchSubscriptionLegOrder2.mmCommissionDetails, SwitchRedemptionLegOrder3.mmCommissionDetails, SwitchSubscriptionLegOrder3.mmCommissionDetails,
					SwitchRedemptionLegExecution2.mmCommissionGeneralDetails, SwitchSubscriptionLegExecution2.mmCommissionGeneralDetails, SwitchRedemptionLegExecution3.mmCommissionGeneralDetails,
					SwitchSubscriptionLegExecution3.mmCommissionGeneralDetails, RedemptionOrder11.mmCommissionDetails, RedemptionExecution12.mmCommissionGeneralDetails, SubscriptionOrder11.mmCommissionDetails,
					SubscriptionExecution9.mmCommissionGeneralDetails, Order9.mmCommissionDetails, Order1.mmCommissionDetails, Order6.mmCommissionDetails, ReceiveInformation13.mmCommissionDetails, ReceiveInformation12.mmCommissionDetails,
					DeliverInformation12.mmCommissionDetails, DeliverInformation13.mmCommissionDetails, Order17.mmCommission, Order18.mmCommission, FundCashOutBreakdown3.mmCommissionDetails, FundCashInBreakdown3.mmCommissionDetails,
					DeliverInformation15.mmCommissionDetails, DeliverInformation14.mmCommissionDetails, ReceiveInformation15.mmCommissionDetails, ReceiveInformation14.mmCommissionDetails, ReceiveInformation17.mmCommissionDetails,
					ReceiveInformation16.mmCommissionDetails, DeliverInformation16.mmCommissionDetails, DeliverInformation17.mmCommissionDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeCommission";
			definition = "Commission parameters associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> Commission.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Commission.mmObject();
		}

		@Override
		public List<Commission> getValue(Trade obj) {
			return obj.getTradeCommission();
		}

		@Override
		public void setValue(Trade obj, List<Commission> value) {
			obj.setTradeCommission(value);
		}
	};
	protected ISODate valueDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmValueDate
	 * TransactionDetails93.mmValueDate}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmValueDate
	 * TransactionDetails102.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmValueDate
	 * TransactionDetails103.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmValueDate
	 * TransactionDetails112.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled, ie, the amounts are due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODate> mmValueDate = new MMBusinessAttribute<Trade, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails6.mmValueDate, TransactionDetails18.mmValueDate, TransactionDetails24.mmValueDate, TransactionDetails34.mmValueDate, TransactionDetails37.mmValueDate,
					TransactionDetails48.mmValueDate, TransactionDetails57.mmValueDate, TransactionDetails60.mmValueDate, TradingDateCode1Choice.mmProprietary, TradeData8.mmCurrentSettlementDate, TradeData8.mmNewSettlementDate,
					AmountsAndValueDate1.mmSettlementDate, TransactionDetails51.mmValueDate, TransactionDetails63.mmValueDate, TransactionDetails68.mmValueDate, TradeData11.mmCurrentSettlementDate, TradeData11.mmNewSettlementDate,
					ForeignExchangeSwapTransaction1.mmSpotValueDate, TransactionDetails78.mmValueDate, Option10.mmValuationRate, TransactionDetails91.mmValueDate, ForeignExchangeSwapTransaction2.mmSpotValueDate,
					TransactionDetails93.mmValueDate, RegulatoryReporting6.mmClearingTimestamp, TransactionDetails95.mmValueDate, TransactionDetails98.mmValueDate, ForeignExchangeSwapTransaction3.mmSpotValueDate,
					TransactionDetails102.mmValueDate, TransactionDetails103.mmValueDate, TransactionDetails112.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Trade obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Trade obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	protected ISODateTime endDate;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmEndDate
	 * TransactionDates3.mmEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "End date of the trade, such as a treasury trade or a derivative trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODateTime> mmEndDate = new MMBusinessAttribute<Trade, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(ClosingDate1Choice.mmDate, ClosingDate1Choice.mmCode, TransactionDates1.mmEndDate, TransactionDates2.mmEndDate, TradeContract1.mmMaturityDate, TransactionDates3.mmEndDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndDate";
			definition = "End date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Trade obj) {
			return obj.getEndDate();
		}

		@Override
		public void setValue(Trade obj, ISODateTime value) {
			obj.setEndDate(value);
		}
	};
	protected List<TradeIdentification> tradeRelatedIdentifications;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
	 * TradeIdentification.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmTransactionIdentification
	 * IntraBalanceCancellation4.mmTransactionIdentification}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<TradeIdentification>> mmTradeRelatedIdentifications = new MMBusinessAssociationEnd<Trade, List<TradeIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(Cancellation1Choice.mmReference, RegulatoryReporting1.mmCounterpartySideUniqueTransactionIdentifier, IntraBalanceCancellation2.mmTransactionIdentification, Cancellation5Choice.mmReferences,
					Cancellation4Choice.mmReferences, CounterpartySideTransactionReporting1.mmCounterpartySideUniqueTransactionIdentifier, TradingSideTransactionReporting1.mmTradingSideUniqueTransactionIdentifier,
					Cancellation9Choice.mmReferences, Cancellation8Choice.mmReferences, Cancellation12Choice.mmReferences, Cancellation10Choice.mmReferences, IntraBalanceCancellation4.mmTransactionIdentification,
					GeneralInformation5.mmRelatedTradeReference, TradeData12.mmLinkedReportIdentification, NetObligation1.mmCounterpartyNettingIdentification, FixingConditions1.mmRelatedReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> TradeIdentification.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradeIdentification.mmObject();
		}

		@Override
		public List<TradeIdentification> getValue(Trade obj) {
			return obj.getTradeRelatedIdentifications();
		}

		@Override
		public void setValue(Trade obj, List<TradeIdentification> value) {
			obj.setTradeRelatedIdentifications(value);
		}
	};
	protected Max35Text allocationIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of allocation for a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, Max35Text> mmAllocationIndicator = new MMBusinessAttribute<Trade, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(RegulatoryReporting1.mmAllocationIndicator, RegulatoryReporting4.mmAllocationIndicator, RegulatoryReporting6.mmAllocationIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies the type of allocation for a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Trade obj) {
			return obj.getAllocationIndicator();
		}

		@Override
		public void setValue(Trade obj, Max35Text value) {
			obj.setAllocationIndicator(value);
		}
	};
	protected Max35Text collateralisationType;
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateralisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, Max35Text> mmCollateralisationType = new MMBusinessAttribute<Trade, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(RegulatoryReporting1.mmCollateralisationIndicator, RegulatoryReporting4.mmCollateralisationIndicator, RegulatoryReporting6.mmCollateralisationIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralisationType";
			definition = "Specifies the type of collateralisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Trade obj) {
			return obj.getCollateralisationType();
		}

		@Override
		public void setValue(Trade obj, Max35Text value) {
			obj.setCollateralisationType(value);
		}
	};
	protected YesNoIndicator blockIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is a block or single trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, YesNoIndicator> mmBlockIndicator = new MMBusinessAttribute<Trade, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(GeneralInformation1.mmBlockIndicator, GeneralInformation4.mmBlockIndicator, GeneralInformation2.mmBlockIndicator, GeneralInformation5.mmBlockIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Trade obj) {
			return obj.getBlockIndicator();
		}

		@Override
		public void setValue(Trade obj, YesNoIndicator value) {
			obj.setBlockIndicator(value);
		}
	};
	protected NettingEligibleCode settlementNetting;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates to the clearing member whether the trade is eligible for settlement netting or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, NettingEligibleCode> mmSettlementNetting = new MMBusinessAttribute<Trade, NettingEligibleCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Clearing1.mmSettlementNettingEligibleCode, Clearing2.mmSettlementNettingEligibleCode, Clearing4.mmSettlementNettingEligibleCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementNetting";
			definition = "Indicates to the clearing member whether the trade is eligible for settlement netting or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NettingEligibleCode.mmObject();
		}

		@Override
		public NettingEligibleCode getValue(Trade obj) {
			return obj.getSettlementNetting();
		}

		@Override
		public void setValue(Trade obj, NettingEligibleCode value) {
			obj.setSettlementNetting(value);
		}
	};
	protected TradePartyRole tradePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
	 * TradePartyRole.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in relation with a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, TradePartyRole> mmTradePartyRole = new MMBusinessAssociationEnd<Trade, TradePartyRole>() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmTradingParties, RedemptionBulkOrderInstruction1.mmIntermediaryDetails, RedemptionOrder5.mmRelatedPartyDetails, RedemptionBulkOrderInstruction2.mmRelatedPartyDetails,
					RedemptionExecution5.mmRelatedPartyDetails, OrderConfirmationDetails1.mmRelatedPartyDetails, RedemptionOrder7.mmRelatedPartyDetails, RedemptionMultipleOrderInstruction1.mmIntermediaryDetails,
					RedemptionOrder6.mmRelatedPartyDetails, RedemptionMultipleOrderInstruction2.mmRelatedPartyDetails, RedemptionExecution6.mmRelatedPartyDetails, RedemptionOrderConfirmation1.mmRelatedPartyDetails,
					RedemptionOrder8.mmRelatedPartyDetails, SubscriptionBulkOrderInstruction1.mmIntermediaryDetails, SubscriptionOrder5.mmRelatedPartyDetails, SubscriptionBulkOrderInstruction2.mmRelatedPartyDetails,
					SubscriptionExecution5.mmRelatedPartyDetails, SubscriptionBulkOrderConfirmation1.mmRelatedPartyDetails, SubscriptionOrder7.mmRelatedPartyDetails, SubscriptionMultipleOrderInstruction1.mmIntermediaryDetails,
					SubscriptionOrder6.mmRelatedPartyDetails, SubscriptionMultipleOrderInstruction2.mmRelatedPartyDetails, SubscriptionExecution6.mmRelatedPartyDetails, SubscriptionOrderConfirmation1.mmRelatedPartyDetails,
					SubscriptionOrder8.mmRelatedPartyDetails, SwitchOrderInstruction1.mmIntermediaryDetails, SwitchOrder3.mmRelatedPartyDetails, SwitchExecution4.mmRelatedPartyDetails, SwitchOrder4.mmRelatedPartyDetails,
					RedemptionExecution10.mmRelatedPartyDetails, RedemptionOrder9.mmRelatedPartyDetails, SubscriptionExecution7.mmRelatedPartyDetails, SubscriptionOrder9.mmRelatedPartyDetails, RedemptionOrder11.mmRelatedPartyDetails,
					RedemptionExecution12.mmRelatedPartyDetails, SubscriptionOrder11.mmRelatedPartyDetails, SubscriptionExecution9.mmRelatedPartyDetails, OrderStatusAndReason5.mmTradingParties, Order9.mmTradingParties,
					InstrumentLeg2.mmTradingParties, MassQuote1.mmTradingParties, IndicationOfInterest1.mmTradingParties, Order6.mmTradingParties, Order11.mmTradingParties, SecuredMarketTransaction1.mmTripartyAgentIdentification,
					SecuredMarketTransaction2.mmTripartyAgentIdentification, SecuredMarketTransaction3.mmTripartyAgentIdentification, SwitchExecution7.mmRelatedPartyDetails, SwitchOrder7.mmRelatedPartyDetails,
					RedemptionOrder14.mmRelatedPartyDetails, SubscriptionExecution13.mmRelatedPartyDetails, SubscriptionExecution12.mmRelatedPartyDetails, SubscriptionOrder15.mmRelatedPartyDetails, RedemptionOrder15.mmRelatedPartyDetails,
					RedemptionExecution16.mmRelatedPartyDetails, SubscriptionOrder14.mmRelatedPartyDetails, RedemptionExecution15.mmRelatedPartyDetails, SecuredMarketTransaction4.mmTripartyAgentIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Role played by a party in relation with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradePartyRole.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradePartyRole.mmObject();
		}

		@Override
		public TradePartyRole getValue(Trade obj) {
			return obj.getTradePartyRole();
		}

		@Override
		public void setValue(Trade obj, TradePartyRole value) {
			obj.setTradePartyRole(value);
		}
	};
	protected List<Obligation> obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmTrade
	 * Obligation.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a product, cash or securities.."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Obligation>> mmObligation = new MMBusinessAssociationEnd<Trade, List<Obligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 0;
			opposite_lazy = () -> Obligation.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}

		@Override
		public List<Obligation> getValue(Trade obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(Trade obj, List<Obligation> value) {
			obj.setObligation(value);
		}
	};
	protected Negotiation relatedNegotiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradeExecution
	 * Negotiation.mmTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNegotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Negotiation process which is the source of the treasury trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Optional<Negotiation>> mmRelatedNegotiation = new MMBusinessAssociationEnd<Trade, Optional<Negotiation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process which is the source of the treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Negotiation.mmTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}

		@Override
		public Optional<Negotiation> getValue(Trade obj) {
			return obj.getRelatedNegotiation();
		}

		@Override
		public void setValue(Trade obj, Optional<Negotiation> value) {
			obj.setRelatedNegotiation(value.orElse(null));
		}
	};
	protected MasterAgreement governingDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedTrades
	 * MasterAgreement.mmGovernedTrades}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction15#mmMasterAgreement
	 * TradeTransaction15.mmMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction17#mmMasterAgreement
	 * TradeTransaction17.mmMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction14#mmMasterAgreement
	 * TradeTransaction14.mmMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmMasterAgreement
	 * TradeTransaction16.mmMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice3#mmTradeAgreement
	 * CardPaymentInvoice3.mmTradeAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal agreement applicable to a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Optional<MasterAgreement>> mmGoverningDocument = new MMBusinessAssociationEnd<Trade, Optional<MasterAgreement>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation2.mmApplicableRules, CardPaymentInvoice1.mmTradeAgreement, CardPaymentInvoice2.mmTradeAgreement, TradeTransaction15.mmMasterAgreement, TradeTransaction17.mmMasterAgreement,
					TradeTransaction14.mmMasterAgreement, TradeTransaction16.mmMasterAgreement, CardPaymentInvoice3.mmTradeAgreement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GoverningDocument";
			definition = "Legal agreement applicable to a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MasterAgreement.mmGovernedTrades;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MasterAgreement.mmObject();
		}

		@Override
		public Optional<MasterAgreement> getValue(Trade obj) {
			return obj.getGoverningDocument();
		}

		@Override
		public void setValue(Trade obj, Optional<MasterAgreement> value) {
			obj.setGoverningDocument(value.orElse(null));
		}
	};
	protected ISODateTime startDate;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmStartDate
	 * TransactionDates3.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date of the trade, such as a treasury trade or a derivative trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Trade, ISODateTime> mmStartDate = new MMBusinessAttribute<Trade, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Order16.mmProcessingDate, Order14.mmProcessingDate, TransactionDates1.mmStartDate, TransactionDates2.mmStartDate, Order17.mmProcessingDate, Order18.mmProcessingDate,
					OvernightIndexSwapTransaction1.mmStartDate, TradeContract1.mmStartDate, OvernightIndexSwapTransaction3.mmStartDate, TradeSettlement2.mmBillingPeriod, OvernightIndexSwapTransaction4.mmStartDate,
					TransactionDates3.mmStartDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Start date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Trade obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(Trade obj, ISODateTime value) {
			obj.setStartDate(value);
		}
	};
	protected System system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#mmTrade
	 * System.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System involved in the processing of a trade such as clearing, settlement or matching system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, System> mmSystem = new MMBusinessAssociationEnd<Trade, System>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System involved in the processing of a trade such as clearing, settlement or matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> System.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public System getValue(Trade obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(Trade obj, System value) {
			obj.setSystem(value);
		}
	};
	protected List<Asset> asset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#mmTrade
	 * Asset.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction17#mmCommodity
	 * TradeTransaction17.mmCommodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction14#mmCommodity
	 * TradeTransaction14.mmCommodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmCommodity
	 * TradeTransaction16.mmCommodity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is the object of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Asset>> mmAsset = new MMBusinessAssociationEnd<Trade, List<Asset>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeTransaction17.mmCommodity, TradeTransaction14.mmCommodity, TradeTransaction16.mmCommodity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Asset which is the object of a trade.";
			minOccurs = 1;
			opposite_lazy = () -> Asset.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}

		@Override
		public List<Asset> getValue(Trade obj) {
			return obj.getAsset();
		}

		@Override
		public void setValue(Trade obj, List<Asset> value) {
			obj.setAsset(value);
		}
	};
	protected Market market;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Market#mmTrade
	 * Market.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmExecutionVenue
	 * TradeAdditionalQueryCriteria3.mmExecutionVenue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market where a trade is negotiated and executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Market> mmMarket = new MMBusinessAssociationEnd<Trade, Market>() {
		{
			derivation_lazy = () -> Arrays.asList(NetPosition2.mmPlaceOfTrade, NetPosition3.mmPlaceOfTrade, FinancialItemParameters1.mmTradeMarket, TradeAdditionalQueryCriteria3.mmExecutionVenue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market where a trade is negotiated and executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Market.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Market.mmObject();
		}

		@Override
		public Market getValue(Trade obj) {
			return obj.getMarket();
		}

		@Override
		public void setValue(Trade obj, Market value) {
			obj.setMarket(value);
		}
	};
	protected Guarantee guarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteedTrade
	 * Guarantee.mmGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmGuarantee
	 * FinancingAgreementItem1.mmGuarantee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee which covers a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Guarantee> mmGuarantee = new MMBusinessAssociationEnd<Trade, Guarantee>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancingAgreementItem1.mmGuarantee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee which covers a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Guarantee.mmGuaranteedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Guarantee.mmObject();
		}

		@Override
		public Guarantee getValue(Trade obj) {
			return obj.getGuarantee();
		}

		@Override
		public void setValue(Trade obj, Guarantee value) {
			obj.setGuarantee(value);
		}
	};
	protected Settlement settlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Settlement
	 * Settlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmTrade
	 * Settlement.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Settlement> mmSettlement = new MMBusinessAssociationEnd<Trade, Settlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Transfer of proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Settlement.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Settlement.mmObject();
		}

		@Override
		public Settlement getValue(Trade obj) {
			return obj.getSettlement();
		}

		@Override
		public void setValue(Trade obj, Settlement value) {
			obj.setSettlement(value);
		}
	};
	protected Order order;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Order#mmTrade
	 * Order.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the order related to a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Order> mmOrder = new MMBusinessAssociationEnd<Trade, Order>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Specifies the order related to a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Order.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Order.mmObject();
		}

		@Override
		public Order getValue(Trade obj) {
			return obj.getOrder();
		}

		@Override
		public void setValue(Trade obj, Order value) {
			obj.setOrder(value);
		}
	};
	protected List<Leg> leg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Leg#mmTrade
	 * Leg.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateLegs5#mmFirstLeg
	 * InterestRateLegs5.mmFirstLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateLegs5#mmSecondLeg
	 * InterestRateLegs5.mmSecondLeg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Leg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate transactions which combined together form a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, List<Leg>> mmLeg = new MMBusinessAssociationEnd<Trade, List<Leg>>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestRateLegs5.mmFirstLeg, InterestRateLegs5.mmSecondLeg);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Leg";
			definition = "Separate transactions which combined together form a trade.";
			minOccurs = 0;
			opposite_lazy = () -> Leg.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Leg.mmObject();
		}

		@Override
		public List<Leg> getValue(Trade obj) {
			return obj.getLeg();
		}

		@Override
		public void setValue(Trade obj, List<Leg> value) {
			obj.setLeg(value);
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmTrade
	 * FinancialTransaction.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial transaction to which the trade belongs."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, FinancialTransaction> mmFinancialTransaction = new MMBusinessAssociationEnd<Trade, FinancialTransaction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the trade belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FinancialTransaction.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialTransaction.mmObject();
		}

		@Override
		public FinancialTransaction getValue(Trade obj) {
			return obj.getFinancialTransaction();
		}

		@Override
		public void setValue(Trade obj, FinancialTransaction value) {
			obj.setFinancialTransaction(value);
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmReconciledTrades
	 * Reconciliation.mmReconciledTrades}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Trade
	 * Trade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which compares and matches trade information with entries in an account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Trade, Reconciliation> mmReconciliation = new MMBusinessAssociationEnd<Trade, Reconciliation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Reconciliation.mmReconciledTrades;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Reconciliation.mmObject();
		}

		@Override
		public Reconciliation getValue(Trade obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(Trade obj, Reconciliation value) {
			obj.setReconciliation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trade";
				definition = "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities.";
				associationDomain_lazy = () -> Arrays.asList(Asset.mmTrade, Commission.mmTrade, Obligation.mmTrade, TradeIdentification.mmTrade, TradePartyRole.mmTrade, System.mmTrade, Settlement.mmTrade, Leg.mmTrade,
						Negotiation.mmTradeExecution, MasterAgreement.mmGovernedTrades, Guarantee.mmGuaranteedTrade, Reconciliation.mmReconciledTrades, Market.mmTrade, Order.mmTrade, FinancialTransaction.mmTrade);
				derivationElement_lazy = () -> Arrays.asList(TradingDateCode1Choice.mmCode, TradeDate4Choice.mmDate, TradeDate4Choice.mmValue);
				subType_lazy = () -> Arrays.asList(SecuritiesTrade.mmObject(), TreasuryTrade.mmObject(), CommercialTrade.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmTradeDateTime, com.tools20022.repository.entity.Trade.mmTradeCommission, com.tools20022.repository.entity.Trade.mmValueDate,
						com.tools20022.repository.entity.Trade.mmEndDate, com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications, com.tools20022.repository.entity.Trade.mmAllocationIndicator,
						com.tools20022.repository.entity.Trade.mmCollateralisationType, com.tools20022.repository.entity.Trade.mmBlockIndicator, com.tools20022.repository.entity.Trade.mmSettlementNetting,
						com.tools20022.repository.entity.Trade.mmTradePartyRole, com.tools20022.repository.entity.Trade.mmObligation, com.tools20022.repository.entity.Trade.mmRelatedNegotiation,
						com.tools20022.repository.entity.Trade.mmGoverningDocument, com.tools20022.repository.entity.Trade.mmStartDate, com.tools20022.repository.entity.Trade.mmSystem, com.tools20022.repository.entity.Trade.mmAsset,
						com.tools20022.repository.entity.Trade.mmMarket, com.tools20022.repository.entity.Trade.mmGuarantee, com.tools20022.repository.entity.Trade.mmSettlement, com.tools20022.repository.entity.Trade.mmOrder,
						com.tools20022.repository.entity.Trade.mmLeg, com.tools20022.repository.entity.Trade.mmFinancialTransaction, com.tools20022.repository.entity.Trade.mmReconciliation);
				derivationComponent_lazy = () -> Arrays.asList(DateAndDateTime1Choice.mmObject(), TradingDateCode1Choice.mmObject(), TradeDate4Choice.mmObject(), CommonTradeDataReport21.mmObject(), CommonTradeDataReport20.mmObject(),
						TradeAdditionalQueryCriteria3.mmObject(), CommonTradeDataReport23.mmObject(), CommonTradeDataReport22.mmObject(), CommonTradeDataReport24.mmObject(), CommonTradeDataReport19.mmObject(), InterestRateLegs5.mmObject(),
						CommonTradeDataReport25.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Trade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getTradeDateTime() {
		return tradeDateTime;
	}

	public Trade setTradeDateTime(ISODateTime tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public List<Commission> getTradeCommission() {
		return tradeCommission == null ? tradeCommission = new ArrayList<>() : tradeCommission;
	}

	public Trade setTradeCommission(List<Commission> tradeCommission) {
		this.tradeCommission = Objects.requireNonNull(tradeCommission);
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public Trade setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public ISODateTime getEndDate() {
		return endDate;
	}

	public Trade setEndDate(ISODateTime endDate) {
		this.endDate = Objects.requireNonNull(endDate);
		return this;
	}

	public List<TradeIdentification> getTradeRelatedIdentifications() {
		return tradeRelatedIdentifications == null ? tradeRelatedIdentifications = new ArrayList<>() : tradeRelatedIdentifications;
	}

	public Trade setTradeRelatedIdentifications(List<TradeIdentification> tradeRelatedIdentifications) {
		this.tradeRelatedIdentifications = Objects.requireNonNull(tradeRelatedIdentifications);
		return this;
	}

	public Max35Text getAllocationIndicator() {
		return allocationIndicator;
	}

	public Trade setAllocationIndicator(Max35Text allocationIndicator) {
		this.allocationIndicator = Objects.requireNonNull(allocationIndicator);
		return this;
	}

	public Max35Text getCollateralisationType() {
		return collateralisationType;
	}

	public Trade setCollateralisationType(Max35Text collateralisationType) {
		this.collateralisationType = Objects.requireNonNull(collateralisationType);
		return this;
	}

	public YesNoIndicator getBlockIndicator() {
		return blockIndicator;
	}

	public Trade setBlockIndicator(YesNoIndicator blockIndicator) {
		this.blockIndicator = Objects.requireNonNull(blockIndicator);
		return this;
	}

	public NettingEligibleCode getSettlementNetting() {
		return settlementNetting;
	}

	public Trade setSettlementNetting(NettingEligibleCode settlementNetting) {
		this.settlementNetting = Objects.requireNonNull(settlementNetting);
		return this;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public Trade setTradePartyRole(TradePartyRole tradePartyRole) {
		this.tradePartyRole = Objects.requireNonNull(tradePartyRole);
		return this;
	}

	public List<Obligation> getObligation() {
		return obligation == null ? obligation = new ArrayList<>() : obligation;
	}

	public Trade setObligation(List<Obligation> obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Negotiation> getRelatedNegotiation() {
		return relatedNegotiation == null ? Optional.empty() : Optional.of(relatedNegotiation);
	}

	public Trade setRelatedNegotiation(Negotiation relatedNegotiation) {
		this.relatedNegotiation = relatedNegotiation;
		return this;
	}

	public Optional<MasterAgreement> getGoverningDocument() {
		return governingDocument == null ? Optional.empty() : Optional.of(governingDocument);
	}

	public Trade setGoverningDocument(MasterAgreement governingDocument) {
		this.governingDocument = governingDocument;
		return this;
	}

	public ISODateTime getStartDate() {
		return startDate;
	}

	public Trade setStartDate(ISODateTime startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public System getSystem() {
		return system;
	}

	public Trade setSystem(System system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public List<Asset> getAsset() {
		return asset == null ? asset = new ArrayList<>() : asset;
	}

	public Trade setAsset(List<Asset> asset) {
		this.asset = Objects.requireNonNull(asset);
		return this;
	}

	public Market getMarket() {
		return market;
	}

	public Trade setMarket(Market market) {
		this.market = Objects.requireNonNull(market);
		return this;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public Trade setGuarantee(Guarantee guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public Trade setSettlement(Settlement settlement) {
		this.settlement = Objects.requireNonNull(settlement);
		return this;
	}

	public Order getOrder() {
		return order;
	}

	public Trade setOrder(Order order) {
		this.order = Objects.requireNonNull(order);
		return this;
	}

	public List<Leg> getLeg() {
		return leg == null ? leg = new ArrayList<>() : leg;
	}

	public Trade setLeg(List<Leg> leg) {
		this.leg = Objects.requireNonNull(leg);
		return this;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public Trade setFinancialTransaction(FinancialTransaction financialTransaction) {
		this.financialTransaction = Objects.requireNonNull(financialTransaction);
		return this;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public Trade setReconciliation(Reconciliation reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}
}