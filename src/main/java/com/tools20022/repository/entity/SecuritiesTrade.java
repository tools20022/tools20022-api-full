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
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies trades linked to securities operations such as the exchange of
 * securities, the lending of securities and the transactions related to
 * investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTrade" src="doc-files/SecuritiesTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
 * SecuritiesTrade.mmTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmOpeningClosingIndicator
 * SecuritiesTrade.mmOpeningClosingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
 * SecuritiesTrade.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmActivity
 * SecuritiesTrade.mmActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
 * SecuritiesTrade.mmTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
 * SecuritiesTrade.mmTradeOriginationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmClearingFeeType
 * SecuritiesTrade.mmClearingFeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
 * SecuritiesTrade.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
 * SecuritiesTrade.mmTradePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmPartyRole
 * SecuritiesTrade.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
 * SecuritiesTrade.mmTradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAllocation
 * SecuritiesTrade.mmTradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
 * SecuritiesTrade.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
 * SecuritiesTrade.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
 * SecuritiesTrade.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
 * Security.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
 * SecuritiesPricing.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
 * SecuritiesQuantity.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
 * SecuritiesTradeExecution.mmRelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
 * SecuritiesFinancing.mmClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
 * SecuritiesFinancing.mmOpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
 * SecuritiesOrder.mmOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
 * Allocation.mmSecuritiesTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#mmTransactionDetails
 * TransactionDetails41.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#mmTransactionDetails
 * TransactionDetails43.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction7#mmTransactionDetails
 * Transaction7.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction8#mmTransactionDetails
 * Transaction8.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction9#mmTransactionDetails
 * Transaction9.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction10#mmTransactionDetails
 * Transaction10.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction14#mmTransactionDetails
 * Transaction14.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction12#mmTransactionDetails
 * Transaction12.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction15#mmTransactionDetails
 * Transaction15.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction16#mmTransactionDetails
 * Transaction16.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction20#mmTransactionDetails
 * Transaction20.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction19#mmTransactionDetails
 * Transaction19.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction23#mmTransactionDetails
 * Transaction23.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction22#mmTransactionDetails
 * Transaction22.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction28#mmTransactionDetails
 * Transaction28.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction27#mmTransactionDetails
 * Transaction27.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction30#mmTransactionDetails
 * Transaction30.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction31#mmTransactionDetails
 * Transaction31.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction6#mmTransactionDetails
 * Transaction6.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction11#mmTransactionDetails
 * Transaction11.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction13#mmTransactionDetails
 * Transaction13.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction17#mmTransactionDetails
 * Transaction17.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction18#mmTransactionDetails
 * Transaction18.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction21#mmTransactionDetails
 * Transaction21.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction29#mmTransactionDetails
 * Transaction29.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction32#mmTransactionDetails
 * Transaction32.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmOtherAmounts
 * SecuritiesTradeDetails7.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmOtherAmounts
 * SecuritiesTradeDetails19.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#mmTransactionDetails
 * TransactionDetails13.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmOtherAmounts
 * SecuritiesTradeDetails4.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmOtherAmounts
 * SecuritiesTradeDetails17.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#mmTransactionDetails
 * TransactionDetails11.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#mmTransactionDetails
 * TransactionDetails21.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmOtherAmounts
 * SecuritiesTradeDetails10.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmOtherAmounts
 * SecuritiesTradeDetails22.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmOtherAmounts
 * SecuritiesTradeDetails23.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmOtherAmounts
 * SecuritiesTradeDetails29.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#mmTransactionDetails
 * TransactionDetails15.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmOtherAmounts
 * SecuritiesTradeDetails14.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmOtherAmounts
 * SecuritiesTradeDetails20.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmOtherAmounts
 * SecuritiesTradeDetails24.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmOtherAmounts
 * SecuritiesTradeDetails30.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement1#mmTradeLegsDetails
 * TradeLegStatement1.mmTradeLegsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement2#mmTradeLegsDetails
 * TradeLegStatement2.mmTradeLegsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition1#mmTradeLegDetails
 * NetPosition1.mmTradeLegDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition2#mmTradeLegDetails
 * NetPosition2.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction25#mmTransactionDetails
 * Transaction25.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction34#mmTransactionDetails
 * Transaction34.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#mmTransactionDetails
 * TransactionDetails64.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction35#mmTransactionDetails
 * Transaction35.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction36#mmTransactionDetails
 * Transaction36.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmOtherAmounts
 * SecuritiesTradeDetails35.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction38#mmTransactionDetails
 * Transaction38.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#mmTransactionDetails
 * TransactionDetails65.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmOtherAmounts
 * SecuritiesTradeDetails42.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction39#mmTransactionDetails
 * Transaction39.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction37#mmTransactionDetails
 * Transaction37.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeRegistrationOrigin
 * TradeLeg8.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction41#mmTransactionDetails
 * Transaction41.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction40#mmTransactionDetails
 * Transaction40.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement3#mmTradeLegsDetails
 * TradeLegStatement3.mmTradeLegsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmTradeLegDetails
 * NetPosition3.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeRegistrationOrigin
 * TradeLeg10.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeRegistrationOrigin
 * TradeLeg9.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction43#mmTransactionDetails
 * Transaction43.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction42#mmTransactionDetails
 * Transaction42.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmOtherAmounts
 * SecuritiesTradeDetails49.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction47#mmTransactionDetails
 * Transaction47.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmTransactionDetails
 * TransactionDetails76.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmOtherAmounts
 * SecuritiesTradeDetails48.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction45#mmTransactionDetails
 * Transaction45.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction46#mmTransactionDetails
 * Transaction46.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmOtherAmounts
 * SecuritiesTradeDetails57.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction49#mmTransactionDetails
 * Transaction49.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmOtherAmounts
 * SecuritiesTradeDetails61.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#mmTransactionDetails
 * TransactionDetails85.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction50#mmTransactionDetails
 * Transaction50.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction48#mmTransactionDetails
 * Transaction48.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction51#mmTransactionDetails
 * Transaction51.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTransactionDetails
 * Transaction53.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmOtherAmounts
 * SecuritiesTradeDetails68.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTransactionDetails
 * Transaction54.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTransactionDetails
 * Transaction52.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmOtherAmounts
 * SecuritiesTradeDetails69.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction57#mmTransactionDetails
 * Transaction57.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTransactionDetails
 * Transaction56.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction55#mmTransactionDetails
 * Transaction55.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#mmTransactionDetails
 * TransactionDetails101.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport21#mmTransactionData
 * CommonTradeDataReport21.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport20#mmTransactionData
 * CommonTradeDataReport20.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport23#mmTransactionData
 * CommonTradeDataReport23.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport22#mmTransactionData
 * CommonTradeDataReport22.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport24#mmTransactionData
 * CommonTradeDataReport24.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport19#mmTransactionData
 * CommonTradeDataReport19.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport25#mmTransactionData
 * CommonTradeDataReport25.mmTransactionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction58#mmTransactionDetails
 * Transaction58.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmOtherAmounts
 * SecuritiesTradeDetails71.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction60#mmTransactionDetails
 * Transaction60.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmOtherAmounts
 * SecuritiesTradeDetails72.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction61#mmTransactionDetails
 * Transaction61.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction62#mmTransactionDetails
 * Transaction62.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails106#mmTransactionDetails
 * TransactionDetails106.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmOtherAmounts
 * SecuritiesTradeDetails81.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmOtherAmounts
 * SecuritiesTradeDetails85.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails108#mmTransactionDetails
 * TransactionDetails108.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction63#mmTransactionDetails
 * Transaction63.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction64#mmTransactionDetails
 * Transaction64.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction65#mmTransactionDetails
 * Transaction65.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransaction
 * SecuritiesTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
 * SecuritiesOptionTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails10
 * TransactionDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails29
 * TransactionDetails29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails41
 * TransactionDetails41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition1Choice
 * TradeTransactionCondition1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25
 * SecuritiesTradeDetails25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts12 OtherAmounts12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts14 OtherAmounts14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26
 * SecuritiesTradeDetails26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails28
 * TransactionDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails31
 * TransactionDetails31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails44
 * TransactionDetails44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails43
 * TransactionDetails43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition2Choice
 * TradeTransactionCondition2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27
 * SecuritiesTradeDetails27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts20 OtherAmounts20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28
 * SecuritiesTradeDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters3
 * AdditionalParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters7
 * AdditionalParameters7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters8
 * AdditionalParameters8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters9
 * AdditionalParameters9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters10
 * AdditionalParameters10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters11
 * AdditionalParameters11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters2
 * AdditionalParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LegalFramework1Choice
 * LegalFramework1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4 OtherAmounts4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters6
 * AdditionalParameters6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LegalFramework2Choice
 * LegalFramework2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5 OtherAmounts5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters12
 * AdditionalParameters12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17 OtherAmounts17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters13
 * AdditionalParameters13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23 OtherAmounts23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters18
 * AdditionalParameters18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters19
 * AdditionalParameters19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts3 OtherAmounts3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7 OtherAmounts7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails12
 * TransactionDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails19
 * TransactionDetails19}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnilateralSplit1Choice
 * UnilateralSplit1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnilateralSplit2Choice
 * UnilateralSplit2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2
 * SecuritiesTradeDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16
 * SecuritiesTradeDetails16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9 OtherAmounts9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10 OtherAmounts10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18 OtherAmounts18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24 OtherAmounts24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters17
 * AdditionalParameters17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters20
 * AdditionalParameters20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1
 * SecuritiesTradeDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15
 * SecuritiesTradeDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts13 OtherAmounts13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails5
 * TransactionDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails9
 * TransactionDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails22
 * TransactionDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails23
 * TransactionDetails23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails36
 * TransactionDetails36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails47
 * TransactionDetails47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails53
 * TransactionDetails53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails58
 * TransactionDetails58}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionActivity1Choice
 * TransactionActivity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails7
 * TransactionDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction7 Transaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails8
 * TransactionDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction8 Transaction8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionActivity2Choice
 * TransactionActivity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails16
 * TransactionDetails16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction9 Transaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails17
 * TransactionDetails17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction10 Transaction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails26
 * TransactionDetails26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction14 Transaction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails25
 * TransactionDetails25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction12 Transaction12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails27
 * TransactionDetails27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction15 Transaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails33
 * TransactionDetails33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction16 Transaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails39
 * TransactionDetails39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction20 Transaction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction19 Transaction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails50
 * TransactionDetails50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction23 Transaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction22 Transaction22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails56
 * TransactionDetails56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction28 Transaction28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction27 Transaction27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails59
 * TransactionDetails59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction30 Transaction30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction31 Transaction31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails6
 * TransactionDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction6 Transaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails18
 * TransactionDetails18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction11 Transaction11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails24
 * TransactionDetails24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction13 Transaction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails34
 * TransactionDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction17 Transaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails37
 * TransactionDetails37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction18 Transaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails48
 * TransactionDetails48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction21 Transaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails57
 * TransactionDetails57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction29 Transaction29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails60
 * TransactionDetails60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction32 Transaction32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts1 OtherAmounts1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeType3Choice
 * TradeType3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice
 * TradeTransactionCondition4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice
 * TwoLegTransactionType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails1
 * TransactionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails3
 * TransactionDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails2
 * TransactionDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts2 OtherAmounts2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7
 * SecuritiesTradeDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19
 * SecuritiesTradeDetails19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails13
 * TransactionDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8
 * SecuritiesTradeDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18
 * SecuritiesTradeDetails18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts8 OtherAmounts8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4
 * SecuritiesTradeDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17
 * SecuritiesTradeDetails17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters4
 * AdditionalParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails4
 * TransactionDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails30
 * TransactionDetails30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails11
 * TransactionDetails11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails20
 * TransactionDetails20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails21
 * TransactionDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9
 * SecuritiesTradeDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21
 * SecuritiesTradeDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts11 OtherAmounts11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10
 * SecuritiesTradeDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22
 * SecuritiesTradeDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23
 * SecuritiesTradeDetails23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29
 * SecuritiesTradeDetails29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails40
 * TransactionDetails40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails42
 * TransactionDetails42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails46
 * TransactionDetails46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters5
 * AdditionalParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters14
 * AdditionalParameters14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters15
 * AdditionalParameters15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails15
 * TransactionDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails32
 * TransactionDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails14
 * TransactionDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails35
 * TransactionDetails35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts6 OtherAmounts6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14
 * SecuritiesTradeDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20
 * SecuritiesTradeDetails20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts15 OtherAmounts15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24
 * SecuritiesTradeDetails24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts22 OtherAmounts22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30
 * SecuritiesTradeDetails30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails45
 * TransactionDetails45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2 TradeLeg2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5 TradeLeg5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1 TradeLeg1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3 TradeLeg3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLegStatement1
 * TradeLegStatement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6 TradeLeg6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLegStatement2
 * TradeLegStatement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4 TradeLeg4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7 TradeLeg7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails51
 * TransactionDetails51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction25 Transaction25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition3Choice
 * TradeTransactionCondition3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails52
 * TransactionDetails52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters16
 * AdditionalParameters16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails61
 * TransactionDetails61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction34 Transaction34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails64
 * TransactionDetails64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction35 Transaction35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails62
 * TransactionDetails62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails63
 * TransactionDetails63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction36 Transaction36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31
 * SecuritiesTradeDetails31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
 * SecuritiesTradeDetails33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35
 * SecuritiesTradeDetails35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36
 * SecuritiesTradeDetails36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34
 * SecuritiesTradeDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32
 * SecuritiesTradeDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44
 * SecuritiesTradeDetails44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43
 * SecuritiesTradeDetails43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41
 * SecuritiesTradeDetails41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction38 Transaction38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails66
 * TransactionDetails66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails65
 * TransactionDetails65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42
 * SecuritiesTradeDetails42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails67
 * TransactionDetails67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails68
 * TransactionDetails68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction39 Transaction39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46
 * SecuritiesTradeDetails46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47
 * SecuritiesTradeDetails47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction37 Transaction37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8 TradeLeg8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction41 Transaction41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails70
 * TransactionDetails70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails69
 * TransactionDetails69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction40 Transaction40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLegStatement3
 * TradeLegStatement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10 TradeLeg10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9 TradeLeg9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction43 Transaction43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails71
 * TransactionDetails71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails72
 * TransactionDetails72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction42 Transaction42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails81
 * TransactionDetails81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails74
 * TransactionDetails74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49
 * SecuritiesTradeDetails49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction47 Transaction47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails82
 * TransactionDetails82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails76
 * TransactionDetails76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails79
 * TransactionDetails79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
 * SecuritiesTradeDetails48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails80
 * TransactionDetails80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction45 Transaction45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails75
 * TransactionDetails75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction46 Transaction46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails78
 * TransactionDetails78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28 OtherAmounts28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51
 * SecuritiesTradeDetails51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30 OtherAmounts30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters23
 * AdditionalParameters23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53
 * SecuritiesTradeDetails53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters24
 * AdditionalParameters24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31 OtherAmounts31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters22
 * AdditionalParameters22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters21
 * AdditionalParameters21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts32 OtherAmounts32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54
 * SecuritiesTradeDetails54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LegalFramework3Choice
 * LegalFramework3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionActivity3Choice
 * TransactionActivity3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice
 * TradeTransactionCondition5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52
 * SecuritiesTradeDetails52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50
 * SecuritiesTradeDetails50}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice
 * UnilateralSplit3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57
 * SecuritiesTradeDetails57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts35 OtherAmounts35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction49 Transaction49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails88
 * TransactionDetails88}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34 OtherAmounts34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters26
 * AdditionalParameters26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61
 * SecuritiesTradeDetails61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails92
 * TransactionDetails92}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails84
 * TransactionDetails84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters25
 * AdditionalParameters25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
 * SecuritiesTradeDetails63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails83
 * TransactionDetails83}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters28
 * AdditionalParameters28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38 OtherAmounts38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
 * SecuritiesTradeDetails62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters27
 * AdditionalParameters27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails85
 * TransactionDetails85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails87
 * TransactionDetails87}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts36 OtherAmounts36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60
 * SecuritiesTradeDetails60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts33 OtherAmounts33}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LegalFramework4Choice
 * LegalFramework4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition6Choice
 * TradeTransactionCondition6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction50 Transaction50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails91
 * TransactionDetails91}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnilateralSplit4Choice
 * UnilateralSplit4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction48 Transaction48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails90
 * TransactionDetails90}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionActivity4Choice
 * TransactionActivity4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65
 * SecuritiesTradeDetails65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66
 * SecuritiesTradeDetails66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails93
 * TransactionDetails93}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction51 Transaction51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition7Choice
 * TradeTransactionCondition7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails94
 * TransactionDetails94}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeCommodity2
 * DerivativeCommodity2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters29
 * AdditionalParameters29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters30
 * AdditionalParameters30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67
 * SecuritiesTradeDetails67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction53 Transaction53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68
 * SecuritiesTradeDetails68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails97
 * TransactionDetails97}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails96
 * TransactionDetails96}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction54 Transaction54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction52 Transaction52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails95
 * TransactionDetails95}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69
 * SecuritiesTradeDetails69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters31
 * AdditionalParameters31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction57 Transaction57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70
 * SecuritiesTradeDetails70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters32
 * AdditionalParameters32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails100
 * TransactionDetails100}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails99
 * TransactionDetails99}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction55 Transaction55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails98
 * TransactionDetails98}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails101
 * TransactionDetails101}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction15
 * TradeTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction17
 * TradeTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction14
 * TradeTransaction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18
 * TradeTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16
 * TradeTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction58 Transaction58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails102
 * TransactionDetails102}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeUnderlyingLeg1
 * DerivativeUnderlyingLeg1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts41 OtherAmounts41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
 * SecuritiesTradeDetails71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts39 OtherAmounts39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails105
 * TransactionDetails105}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts40 OtherAmounts40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction60 Transaction60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72
 * SecuritiesTradeDetails72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails104
 * TransactionDetails104}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction61 Transaction61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails103
 * TransactionDetails103}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction62 Transaction62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73
 * SecuritiesTradeDetails73}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75
 * SecuritiesTradeDetails75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76
 * SecuritiesTradeDetails76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails106
 * TransactionDetails106}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails107
 * TransactionDetails107}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
 * SecuritiesTradeDetails78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79
 * SecuritiesTradeDetails79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80
 * SecuritiesTradeDetails80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81
 * SecuritiesTradeDetails81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts42 OtherAmounts42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts43 OtherAmounts43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails84
 * SecuritiesTradeDetails84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85
 * SecuritiesTradeDetails85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86
 * SecuritiesTradeDetails86}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts44 OtherAmounts44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87
 * SecuritiesTradeDetails87}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88
 * SecuritiesTradeDetails88}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails108
 * TransactionDetails108}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails109
 * TransactionDetails109}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89
 * SecuritiesTradeDetails89}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90
 * SecuritiesTradeDetails90}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails110
 * TransactionDetails110}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction63 Transaction63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails111
 * TransactionDetails111}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction64 Transaction64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction65 Transaction65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails112
 * TransactionDetails112}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment=Street Side
 * confirmation</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds."
 * </li>
 * </ul>
 */
public class SecuritiesTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
	 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation3Choice#mmCancellationByReference
	 * Cancellation3Choice.mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation2Choice#mmReference
	 * Cancellation2Choice.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmIdentification
	 * IntraPositionMovementDetails1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmIdentification
	 * IntraPositionMovementDetails2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmIdentification
	 * IntraPositionMovementDetails5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmIdentification
	 * IntraPositionMovementDetails6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmIdentification
	 * IntraPositionMovementDetails7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmIdentification
	 * IntraPositionMovementDetails8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmIdentification
	 * IntraPositionMovementDetails9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmIdentification
	 * IntraPositionMovementDetails10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#mmReference
	 * RequestDetails1.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#mmReference
	 * RequestDetails2.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmReference
	 * RequestDetails6.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#mmReference
	 * RequestDetails7.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmReference
	 * RequestDetails8.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#mmReference
	 * RequestDetails9.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmReference
	 * RequestDetails11.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmReference
	 * RequestDetails12.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmIdentification
	 * IntraPositionMovementDetails3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmIdentification
	 * IntraPositionMovementDetails4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmReferences
	 * IntraPositionQueryCriteria1.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails10#mmReference
	 * RequestDetails10.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation2#mmTransactionIdentification
	 * IntraPositionCancellation2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmSecondLegIdentification
	 * SecuritiesFinancing1.mmSecondLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice#mmCancellationByReference
	 * Cancellation6Choice.mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmReference
	 * RequestDetails13.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmReference
	 * RequestDetails14.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation7Choice#mmCancellationByReference
	 * Cancellation7Choice.mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmReference
	 * RequestDetails15.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmIdentification
	 * IntraPositionMovementDetails11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation11Choice#mmCancellationByReference
	 * Cancellation11Choice.mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmReference
	 * RequestDetails16.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmIdentification
	 * IntraPositionMovementDetails12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails17#mmReference
	 * RequestDetails17.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation4#mmTransactionIdentification
	 * IntraPositionCancellation4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmReferences
	 * IntraPositionQueryCriteria6.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmReference
	 * RequestDetails18.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmIdentification
	 * IntraPositionMovementDetails13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmIdentification
	 * IntraPositionMovementDetails14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmIdentification
	 * IntraPositionMovementDetails15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails16#mmIdentification
	 * IntraPositionMovementDetails16.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a securities trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Cancellation3Choice.mmCancellationByReference, Cancellation2Choice.mmReference, IntraPositionMovementDetails1.mmIdentification, IntraPositionMovementDetails2.mmIdentification,
					IntraPositionMovementDetails5.mmIdentification, IntraPositionMovementDetails6.mmIdentification, IntraPositionMovementDetails7.mmIdentification, IntraPositionMovementDetails8.mmIdentification,
					IntraPositionMovementDetails9.mmIdentification, IntraPositionMovementDetails10.mmIdentification, RequestDetails1.mmReference, RequestDetails2.mmReference, RequestDetails6.mmReference, RequestDetails7.mmReference,
					RequestDetails8.mmReference, RequestDetails9.mmReference, RequestDetails11.mmReference, RequestDetails12.mmReference, IntraPositionMovementDetails3.mmIdentification, IntraPositionMovementDetails4.mmIdentification,
					IntraPositionQueryCriteria1.mmReferences, RequestDetails10.mmReference, IntraPositionCancellation2.mmTransactionIdentification, SecuritiesFinancing1.mmSecondLegIdentification,
					Cancellation6Choice.mmCancellationByReference, RequestDetails13.mmReference, RequestDetails14.mmReference, Cancellation7Choice.mmCancellationByReference, RequestDetails15.mmReference,
					IntraPositionMovementDetails11.mmIdentification, Cancellation11Choice.mmCancellationByReference, RequestDetails16.mmReference, IntraPositionMovementDetails12.mmIdentification, RequestDetails17.mmReference,
					IntraPositionCancellation4.mmTransactionIdentification, IntraPositionQueryCriteria6.mmReferences, RequestDetails18.mmReference, IntraPositionMovementDetails13.mmIdentification,
					IntraPositionMovementDetails14.mmIdentification, IntraPositionMovementDetails15.mmIdentification, IntraPositionMovementDetails16.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a securities trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
		}
	};
	protected CurrencyAndAmount tradeAmount;
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
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmNetAmount
	 * DeliverInformation4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmNetAmount
	 * DeliverInformation7.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmNetAmount
	 * ReceiveInformation4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmNetAmount
	 * ReceiveInformation8.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmNetAmount
	 * ReceiveInformation6.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmNetAmount
	 * ReceiveInformation11.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmNetAmount
	 * DeliverInformation11.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmTradeAmount
	 * OtherAmounts12.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmTradeAmount
	 * OtherAmounts14.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmTradeAmount
	 * OtherAmounts20.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmNetAmount
	 * DeliverInformation3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmNetAmount
	 * DeliverInformation8.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmNetAmount
	 * ReceiveInformation3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmNetAmount
	 * ReceiveInformation7.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmNetAmount
	 * ReceiveInformation5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmNetAmount
	 * ReceiveInformation9.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmNetAmount
	 * DeliverInformation5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmNetAmount
	 * DeliverInformation9.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmNetAmount
	 * DeliverInformation6.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmTradeAmount
	 * OtherAmounts4.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmTradeAmount
	 * OtherAmounts5.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmTradeAmount
	 * OtherAmounts17.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmTradeAmount
	 * OtherAmounts23.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmTradeAmount
	 * OtherAmounts3.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmTradeAmount
	 * OtherAmounts7.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmTradeAmount
	 * OtherAmounts9.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmTradeAmount
	 * OtherAmounts10.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmTradeAmount
	 * OtherAmounts18.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmTradeAmount
	 * OtherAmounts24.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmTradeAmount
	 * OtherAmounts13.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmTradeAmount
	 * OtherAmounts1.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmGrossTradeAmount
	 * TwoLegTransactionDetails1.mmGrossTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#mmTradeAmount
	 * OtherAmounts8.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#mmTradeAmount
	 * OtherAmounts11.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmNetAmount
	 * ReceiveInformation13.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmNetAmount
	 * ReceiveInformation12.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmNetAmount
	 * DeliverInformation12.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmNetAmount
	 * DeliverInformation13.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmNetAmount
	 * DeliverInformation15.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmNetAmount
	 * DeliverInformation14.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmNetAmount
	 * ReceiveInformation15.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmNetAmount
	 * ReceiveInformation14.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmNetAmount
	 * SecuritiesTransaction1.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmTradeAmount
	 * OtherAmounts28.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmTradeAmount
	 * OtherAmounts30.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmTradeAmount
	 * OtherAmounts31.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmTradeAmount
	 * OtherAmounts32.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmNetAmount
	 * ReceiveInformation17.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmNetAmount
	 * ReceiveInformation16.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmNetAmount
	 * DeliverInformation16.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmNetAmount
	 * DeliverInformation17.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmTradeAmount
	 * OtherAmounts35.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmTradeAmount
	 * OtherAmounts34.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmTradeAmount
	 * OtherAmounts38.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#mmTradeAmount
	 * OtherAmounts36.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction15#mmNotionalAmount
	 * TradeTransaction15.mmNotionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction17#mmNotionalAmount
	 * TradeTransaction17.mmNotionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction14#mmNotionalAmount
	 * TradeTransaction14.mmNotionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmNotionalAmount
	 * TradeTransaction16.mmNotionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmNetAmount
	 * ReceiveInformation18.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmNetAmount
	 * DeliverInformation19.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmNetAmount
	 * ReceiveInformation19.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmNetAmount
	 * DeliverInformation18.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmTradeAmount
	 * OtherAmounts41.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmTradeAmount
	 * OtherAmounts39.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmTradeAmount
	 * OtherAmounts40.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts42#mmTradeAmount
	 * OtherAmounts42.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts43#mmTradeAmount
	 * OtherAmounts43.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts44#mmTradeAmount
	 * OtherAmounts44.mmTradeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::DEAL, FIXSynonym: 381</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation4.mmNetAmount, DeliverInformation7.mmNetAmount, ReceiveInformation4.mmNetAmount, ReceiveInformation8.mmNetAmount, ReceiveInformation6.mmNetAmount,
					ReceiveInformation11.mmNetAmount, DeliverInformation11.mmNetAmount, OtherAmounts12.mmTradeAmount, OtherAmounts14.mmTradeAmount, OtherAmounts20.mmTradeAmount, DeliverInformation3.mmNetAmount,
					DeliverInformation8.mmNetAmount, ReceiveInformation3.mmNetAmount, ReceiveInformation7.mmNetAmount, ReceiveInformation5.mmNetAmount, ReceiveInformation9.mmNetAmount, DeliverInformation5.mmNetAmount,
					DeliverInformation9.mmNetAmount, DeliverInformation6.mmNetAmount, OtherAmounts4.mmTradeAmount, OtherAmounts5.mmTradeAmount, OtherAmounts17.mmTradeAmount, OtherAmounts23.mmTradeAmount, OtherAmounts3.mmTradeAmount,
					OtherAmounts7.mmTradeAmount, OtherAmounts9.mmTradeAmount, OtherAmounts10.mmTradeAmount, OtherAmounts18.mmTradeAmount, OtherAmounts24.mmTradeAmount, OtherAmounts13.mmTradeAmount, OtherAmounts1.mmTradeAmount,
					TwoLegTransactionDetails1.mmGrossTradeAmount, OtherAmounts8.mmTradeAmount, OtherAmounts11.mmTradeAmount, ReceiveInformation13.mmNetAmount, ReceiveInformation12.mmNetAmount, DeliverInformation12.mmNetAmount,
					DeliverInformation13.mmNetAmount, DeliverInformation15.mmNetAmount, DeliverInformation14.mmNetAmount, ReceiveInformation15.mmNetAmount, ReceiveInformation14.mmNetAmount, SecuritiesTransaction1.mmNetAmount,
					OtherAmounts28.mmTradeAmount, OtherAmounts30.mmTradeAmount, OtherAmounts31.mmTradeAmount, OtherAmounts32.mmTradeAmount, ReceiveInformation17.mmNetAmount, ReceiveInformation16.mmNetAmount,
					DeliverInformation16.mmNetAmount, DeliverInformation17.mmNetAmount, OtherAmounts35.mmTradeAmount, OtherAmounts34.mmTradeAmount, OtherAmounts38.mmTradeAmount, OtherAmounts36.mmTradeAmount,
					TradeTransaction15.mmNotionalAmount, TradeTransaction17.mmNotionalAmount, TradeTransaction14.mmNotionalAmount, TradeTransaction16.mmNotionalAmount, ReceiveInformation18.mmNetAmount, DeliverInformation19.mmNetAmount,
					ReceiveInformation19.mmNetAmount, DeliverInformation18.mmNetAmount, OtherAmounts41.mmTradeAmount, OtherAmounts39.mmTradeAmount, OtherAmounts40.mmTradeAmount, OtherAmounts42.mmTradeAmount, OtherAmounts43.mmTradeAmount,
					OtherAmounts44.mmTradeAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::DEAL"), new FIXSynonym(this, "381"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAmount";
			definition = "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OpeningClosingCode openingClosingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmOpeningClosing
	 * SecuritiesTradeDetails25.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmOpeningClosing
	 * SecuritiesTradeDetails26.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmOpeningClosing
	 * SecuritiesTradeDetails27.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmOpeningClosing
	 * SecuritiesTradeDetails28.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmOpeningClosing
	 * SecuritiesTradeDetails2.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmOpeningClosing
	 * SecuritiesTradeDetails16.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmOpeningClosing
	 * SecuritiesTradeDetails1.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmOpeningClosing
	 * SecuritiesTradeDetails15.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmOpeningClosing
	 * SecuritiesTradeDetails8.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmOpeningClosing
	 * SecuritiesTradeDetails4.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmOpeningClosing
	 * SecuritiesTradeDetails9.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmOpeningClosing
	 * SecuritiesTradeDetails10.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmOpeningClosing
	 * SecuritiesTradeDetails31.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmOpeningClosing
	 * SecuritiesTradeDetails33.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmOpeningClosing
	 * SecuritiesTradeDetails34.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmOpeningClosing
	 * SecuritiesTradeDetails32.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmOpeningClosing
	 * SecuritiesTradeDetails44.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmOpeningClosing
	 * SecuritiesTradeDetails43.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmOpeningClosing
	 * SecuritiesTradeDetails46.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmOpeningClosing
	 * SecuritiesTradeDetails47.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmOpeningClosing
	 * SecuritiesTradeDetails51.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmOpeningClosing
	 * SecuritiesTradeDetails53.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmOpeningClosing
	 * SecuritiesTradeDetails52.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmOpeningClosing
	 * SecuritiesTradeDetails50.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmOpeningClosing
	 * SecuritiesTradeDetails63.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmOpeningClosing
	 * SecuritiesTradeDetails62.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmOpeningClosing
	 * SecuritiesTradeDetails65.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmOpeningClosing
	 * SecuritiesTradeDetails66.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmOpeningClosing
	 * SecuritiesTradeDetails67.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmOpeningClosing
	 * SecuritiesTradeDetails70.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmOpeningClosing
	 * SecuritiesTradeDetails73.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmOpeningClosing
	 * SecuritiesTradeDetails75.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmOpeningClosing
	 * SecuritiesTradeDetails76.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmOpeningClosing
	 * SecuritiesTradeDetails78.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmOpeningClosing
	 * SecuritiesTradeDetails79.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmOpeningClosing
	 * SecuritiesTradeDetails86.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmOpeningClosing
	 * SecuritiesTradeDetails87.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmOpeningClosing
	 * SecuritiesTradeDetails88.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmOpeningClosing
	 * SecuritiesTradeDetails89.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmOpeningClosing
	 * SecuritiesTradeDetails90.mmOpeningClosing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::PROC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information relative to the processing of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningClosingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails25.mmOpeningClosing, SecuritiesTradeDetails26.mmOpeningClosing, SecuritiesTradeDetails27.mmOpeningClosing, SecuritiesTradeDetails28.mmOpeningClosing,
					SecuritiesTradeDetails2.mmOpeningClosing, SecuritiesTradeDetails16.mmOpeningClosing, SecuritiesTradeDetails1.mmOpeningClosing, SecuritiesTradeDetails15.mmOpeningClosing, SecuritiesTradeDetails8.mmOpeningClosing,
					SecuritiesTradeDetails4.mmOpeningClosing, SecuritiesTradeDetails9.mmOpeningClosing, SecuritiesTradeDetails10.mmOpeningClosing, SecuritiesTradeDetails31.mmOpeningClosing, SecuritiesTradeDetails33.mmOpeningClosing,
					SecuritiesTradeDetails34.mmOpeningClosing, SecuritiesTradeDetails32.mmOpeningClosing, SecuritiesTradeDetails44.mmOpeningClosing, SecuritiesTradeDetails43.mmOpeningClosing, SecuritiesTradeDetails46.mmOpeningClosing,
					SecuritiesTradeDetails47.mmOpeningClosing, SecuritiesTradeDetails51.mmOpeningClosing, SecuritiesTradeDetails53.mmOpeningClosing, SecuritiesTradeDetails52.mmOpeningClosing, SecuritiesTradeDetails50.mmOpeningClosing,
					SecuritiesTradeDetails63.mmOpeningClosing, SecuritiesTradeDetails62.mmOpeningClosing, SecuritiesTradeDetails65.mmOpeningClosing, SecuritiesTradeDetails66.mmOpeningClosing, SecuritiesTradeDetails67.mmOpeningClosing,
					SecuritiesTradeDetails70.mmOpeningClosing, SecuritiesTradeDetails73.mmOpeningClosing, SecuritiesTradeDetails75.mmOpeningClosing, SecuritiesTradeDetails76.mmOpeningClosing, SecuritiesTradeDetails78.mmOpeningClosing,
					SecuritiesTradeDetails79.mmOpeningClosing, SecuritiesTradeDetails86.mmOpeningClosing, SecuritiesTradeDetails87.mmOpeningClosing, SecuritiesTradeDetails88.mmOpeningClosing, SecuritiesTradeDetails89.mmOpeningClosing,
					SecuritiesTradeDetails90.mmOpeningClosing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::PROC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingIndicator";
			definition = "Specifies additional information relative to the processing of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getOpeningClosingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeTransactionConditionCode tradeTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition1Choice#mmCode
	 * TradeTransactionCondition1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition1Choice#mmProprietary
	 * TradeTransactionCondition1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmTradeTransactionCondition
	 * SecuritiesTradeDetails25.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmTradeTransactionCondition
	 * SecuritiesTradeDetails26.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition2Choice#mmCode
	 * TradeTransactionCondition2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition2Choice#mmProprietary
	 * TradeTransactionCondition2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmTradeTransactionCondition
	 * SecuritiesTradeDetails27.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmTradeTransactionCondition
	 * SecuritiesTradeDetails28.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmTradeTransactionCondition
	 * SecuritiesTradeDetails6.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmTradeTransactionCondition
	 * SecuritiesTradeDetails13.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmTradeTransactionCondition
	 * SecuritiesTradeDetails3.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmTradeTransactionCondition
	 * SecuritiesTradeDetails11.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmTradeTransactionCondition
	 * SecuritiesTradeDetails2.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmTradeTransactionCondition
	 * SecuritiesTradeDetails16.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeTransactionCondition
	 * SecuritiesTradeDetails1.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmTradeTransactionCondition
	 * SecuritiesTradeDetails15.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmTransactionConditions
	 * FinancialInstrumentStipulations.mmTransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#mmCode
	 * TradeTransactionCondition4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#mmProprietary
	 * TradeTransactionCondition4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmTradeTransactionCondition
	 * Order16.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmTradeTransactionCondition
	 * Order14.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmTransactionConditions
	 * FinancialInstrumentStipulations2.mmTransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmTradeTransactionCondition
	 * SecuritiesTradeDetails8.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmTradeTransactionCondition
	 * SecuritiesTradeDetails18.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmTradeTransactionCondition
	 * SecuritiesTradeDetails4.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmTradeTransactionCondition
	 * SecuritiesTradeDetails17.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmTradeTransactionCondition
	 * SecuritiesTradeDetails9.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmTradeTransactionCondition
	 * SecuritiesTradeDetails21.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmTradeTransactionCondition
	 * SecuritiesTradeDetails10.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmTradeTransactionCondition
	 * SecuritiesTradeDetails22.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmTradeTransactionCondition
	 * SecuritiesTradeDetails23.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmTradeTransactionCondition
	 * SecuritiesTradeDetails29.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition3Choice#mmCode
	 * TradeTransactionCondition3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition3Choice#mmProprietary
	 * TradeTransactionCondition3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmTransactionConditions
	 * Debt2.mmTransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmTradeTransactionConditionIndicator
	 * OrderParameters1.mmTradeTransactionConditionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmTradeTransactionCondition
	 * SecuritiesTradeDetails31.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeTransactionCondition
	 * SecuritiesTradeDetails33.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmTradeTransactionCondition
	 * SecuritiesTradeDetails35.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmTradeTransactionCondition
	 * SecuritiesTradeDetails38.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmTradeTransactionCondition
	 * SecuritiesTradeDetails37.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmTradeTransactionCondition
	 * SecuritiesTradeDetails36.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmTradeTransactionCondition
	 * SecuritiesTradeDetails34.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmTradeTransactionCondition
	 * SecuritiesTradeDetails32.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionCondition
	 * Order17.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionCondition
	 * Order18.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmTradeTransactionCondition
	 * SecuritiesTradeDetails44.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmTradeTransactionCondition
	 * SecuritiesTradeDetails39.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmTradeTransactionCondition
	 * SecuritiesTradeDetails43.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmTradeTransactionCondition
	 * SecuritiesTradeDetails41.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmTradeTransactionCondition
	 * SecuritiesTradeDetails40.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmTradeTransactionCondition
	 * SecuritiesTradeDetails42.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmTradeTransactionCondition
	 * SecuritiesTradeDetails46.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmTradeTransactionCondition
	 * SecuritiesTradeDetails47.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmTradeTransactionCondition
	 * SecuritiesTradeDetails49.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeTransactionCondition
	 * SecuritiesTradeDetails51.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTradeTransactionCondition
	 * SecuritiesTradeDetails53.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmTradeTransactionCondition
	 * SecuritiesTradeDetails55.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmTradeTransactionCondition
	 * SecuritiesTradeDetails56.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmTradeTransactionCondition
	 * SecuritiesTradeDetails54.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#mmCode
	 * TradeTransactionCondition5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#mmProprietary
	 * TradeTransactionCondition5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTradeTransactionCondition
	 * SecuritiesTradeDetails52.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTradeTransactionCondition
	 * SecuritiesTradeDetails50.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmTradeTransactionCondition
	 * SecuritiesTradeDetails59.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmTradeTransactionCondition
	 * SecuritiesTradeDetails58.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmTradeTransactionCondition
	 * SecuritiesTradeDetails61.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeTransactionCondition
	 * SecuritiesTradeDetails63.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeTransactionCondition
	 * SecuritiesTradeDetails62.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmTradeTransactionCondition
	 * SecuritiesTradeDetails60.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition6Choice#mmCode
	 * TradeTransactionCondition6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition6Choice#mmProprietary
	 * TradeTransactionCondition6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmTradeTransactionCondition
	 * SecuritiesTradeDetails65.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmTradeTransactionCondition
	 * SecuritiesTradeDetails66.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition7Choice#mmCode
	 * TradeTransactionCondition7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition7Choice#mmProprietary
	 * TradeTransactionCondition7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt3#mmTransactionConditions
	 * Debt3.mmTransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmTradeTransactionCondition
	 * FundSettlementParameters11.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmTradeTransactionCondition
	 * FundSettlementParameters12.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTradeTransactionCondition
	 * SecuritiesTradeDetails67.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmTradeTransactionCondition
	 * SecuritiesTradeDetails68.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmTradeTransactionCondition
	 * SecuritiesTradeDetails69.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmTradeTransactionCondition
	 * SecuritiesTradeDetails70.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmTradeTransactionCondition
	 * SecuritiesTradeDetails71.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmTradeTransactionCondition
	 * SecuritiesTradeDetails73.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmTradeTransactionCondition
	 * SecuritiesTradeDetails74.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmTradeTransactionCondition
	 * SecuritiesTradeDetails75.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmTradeTransactionCondition
	 * SecuritiesTradeDetails76.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmTradeTransactionCondition
	 * SecuritiesTradeDetails77.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmTradeTransactionCondition
	 * SecuritiesTradeDetails78.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmTradeTransactionCondition
	 * SecuritiesTradeDetails79.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmTradeTransactionCondition
	 * SecuritiesTradeDetails80.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails82#mmTradeTransactionCondition
	 * SecuritiesTradeDetails82.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails83#mmTradeTransactionCondition
	 * SecuritiesTradeDetails83.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails84#mmTradeTransactionCondition
	 * SecuritiesTradeDetails84.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmTradeTransactionCondition
	 * SecuritiesTradeDetails85.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmTradeTransactionCondition
	 * SecuritiesTradeDetails86.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmTradeTransactionCondition
	 * SecuritiesTradeDetails87.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmTradeTransactionCondition
	 * SecuritiesTradeDetails88.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmTradeTransactionCondition
	 * SecuritiesTradeDetails89.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmTradeTransactionCondition
	 * SecuritiesTradeDetails90.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TTCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeTransactionCondition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeTransactionCondition1Choice.mmCode, TradeTransactionCondition1Choice.mmProprietary, SecuritiesTradeDetails25.mmTradeTransactionCondition,
					SecuritiesTradeDetails26.mmTradeTransactionCondition, TradeTransactionCondition2Choice.mmCode, TradeTransactionCondition2Choice.mmProprietary, SecuritiesTradeDetails27.mmTradeTransactionCondition,
					SecuritiesTradeDetails28.mmTradeTransactionCondition, SecuritiesTradeDetails6.mmTradeTransactionCondition, SecuritiesTradeDetails13.mmTradeTransactionCondition, SecuritiesTradeDetails3.mmTradeTransactionCondition,
					SecuritiesTradeDetails11.mmTradeTransactionCondition, SecuritiesTradeDetails2.mmTradeTransactionCondition, SecuritiesTradeDetails16.mmTradeTransactionCondition, SecuritiesTradeDetails1.mmTradeTransactionCondition,
					SecuritiesTradeDetails15.mmTradeTransactionCondition, FinancialInstrumentStipulations.mmTransactionConditions, TradeTransactionCondition4Choice.mmCode, TradeTransactionCondition4Choice.mmProprietary,
					Order16.mmTradeTransactionCondition, Order14.mmTradeTransactionCondition, FinancialInstrumentStipulations2.mmTransactionConditions, SecuritiesTradeDetails8.mmTradeTransactionCondition,
					SecuritiesTradeDetails18.mmTradeTransactionCondition, SecuritiesTradeDetails4.mmTradeTransactionCondition, SecuritiesTradeDetails17.mmTradeTransactionCondition, SecuritiesTradeDetails9.mmTradeTransactionCondition,
					SecuritiesTradeDetails21.mmTradeTransactionCondition, SecuritiesTradeDetails10.mmTradeTransactionCondition, SecuritiesTradeDetails22.mmTradeTransactionCondition, SecuritiesTradeDetails23.mmTradeTransactionCondition,
					SecuritiesTradeDetails29.mmTradeTransactionCondition, TradeTransactionCondition3Choice.mmCode, TradeTransactionCondition3Choice.mmProprietary, Debt2.mmTransactionConditions,
					OrderParameters1.mmTradeTransactionConditionIndicator, SecuritiesTradeDetails31.mmTradeTransactionCondition, SecuritiesTradeDetails33.mmTradeTransactionCondition, SecuritiesTradeDetails35.mmTradeTransactionCondition,
					SecuritiesTradeDetails38.mmTradeTransactionCondition, SecuritiesTradeDetails37.mmTradeTransactionCondition, SecuritiesTradeDetails36.mmTradeTransactionCondition, SecuritiesTradeDetails34.mmTradeTransactionCondition,
					SecuritiesTradeDetails32.mmTradeTransactionCondition, Order17.mmTradeTransactionCondition, Order18.mmTradeTransactionCondition, SecuritiesTradeDetails44.mmTradeTransactionCondition,
					SecuritiesTradeDetails39.mmTradeTransactionCondition, SecuritiesTradeDetails43.mmTradeTransactionCondition, SecuritiesTradeDetails41.mmTradeTransactionCondition, SecuritiesTradeDetails40.mmTradeTransactionCondition,
					SecuritiesTradeDetails42.mmTradeTransactionCondition, SecuritiesTradeDetails46.mmTradeTransactionCondition, SecuritiesTradeDetails47.mmTradeTransactionCondition, SecuritiesTradeDetails49.mmTradeTransactionCondition,
					SecuritiesTradeDetails51.mmTradeTransactionCondition, SecuritiesTradeDetails53.mmTradeTransactionCondition, SecuritiesTradeDetails55.mmTradeTransactionCondition, SecuritiesTradeDetails56.mmTradeTransactionCondition,
					SecuritiesTradeDetails54.mmTradeTransactionCondition, TradeTransactionCondition5Choice.mmCode, TradeTransactionCondition5Choice.mmProprietary, SecuritiesTradeDetails52.mmTradeTransactionCondition,
					SecuritiesTradeDetails50.mmTradeTransactionCondition, SecuritiesTradeDetails59.mmTradeTransactionCondition, SecuritiesTradeDetails58.mmTradeTransactionCondition, SecuritiesTradeDetails61.mmTradeTransactionCondition,
					SecuritiesTradeDetails63.mmTradeTransactionCondition, SecuritiesTradeDetails62.mmTradeTransactionCondition, SecuritiesTradeDetails60.mmTradeTransactionCondition, TradeTransactionCondition6Choice.mmCode,
					TradeTransactionCondition6Choice.mmProprietary, SecuritiesTradeDetails65.mmTradeTransactionCondition, SecuritiesTradeDetails66.mmTradeTransactionCondition, TradeTransactionCondition7Choice.mmCode,
					TradeTransactionCondition7Choice.mmProprietary, Debt3.mmTransactionConditions, FundSettlementParameters11.mmTradeTransactionCondition, FundSettlementParameters12.mmTradeTransactionCondition,
					SecuritiesTradeDetails67.mmTradeTransactionCondition, SecuritiesTradeDetails68.mmTradeTransactionCondition, SecuritiesTradeDetails69.mmTradeTransactionCondition, SecuritiesTradeDetails70.mmTradeTransactionCondition,
					SecuritiesTradeDetails71.mmTradeTransactionCondition, SecuritiesTradeDetails73.mmTradeTransactionCondition, SecuritiesTradeDetails74.mmTradeTransactionCondition, SecuritiesTradeDetails75.mmTradeTransactionCondition,
					SecuritiesTradeDetails76.mmTradeTransactionCondition, SecuritiesTradeDetails77.mmTradeTransactionCondition, SecuritiesTradeDetails78.mmTradeTransactionCondition, SecuritiesTradeDetails79.mmTradeTransactionCondition,
					SecuritiesTradeDetails80.mmTradeTransactionCondition, SecuritiesTradeDetails82.mmTradeTransactionCondition, SecuritiesTradeDetails83.mmTradeTransactionCondition, SecuritiesTradeDetails84.mmTradeTransactionCondition,
					SecuritiesTradeDetails85.mmTradeTransactionCondition, SecuritiesTradeDetails86.mmTradeTransactionCondition, SecuritiesTradeDetails87.mmTradeTransactionCondition, SecuritiesTradeDetails88.mmTradeTransactionCondition,
					SecuritiesTradeDetails89.mmTradeTransactionCondition, SecuritiesTradeDetails90.mmTradeTransactionCondition);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TTCO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTransactionConditionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeTransactionCondition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
	 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#mmMatchingDenial
	 * RequestDetails1.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#mmMatchingDenial
	 * RequestDetails2.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#mmMatchingDenial
	 * RequestDetails6.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#mmMatchingDenial
	 * RequestDetails7.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmMatchingDenial
	 * RequestDetails8.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#mmMatchingDenial
	 * RequestDetails9.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmMatchingDenial
	 * RequestDetails11.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmMatchingDenial
	 * RequestDetails12.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmStatusAndReason
	 * Transaction8.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmStatusAndReason
	 * Transaction10.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmStatusAndReason
	 * Transaction12.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmStatusAndReason
	 * Transaction16.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmStatusAndReason
	 * Transaction19.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmStatusAndReason
	 * Transaction22.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmStatusAndReason
	 * Transaction27.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmStatusAndReason
	 * Transaction31.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmProcessingStatus
	 * IntraBalanceCancellation2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#mmProcessingStatus
	 * IntraBalanceCancellation1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmStatusAndReason
	 * Transaction25.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmProcessingStatus
	 * IntraBalanceModification2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#mmProcessingStatus
	 * IntraBalanceModification1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmStatusAndReason
	 * Transaction34.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmMatchingDenial
	 * RequestDetails13.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmStatusAndReason
	 * Transaction38.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmMatchingDenial
	 * RequestDetails14.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmStatusAndReason
	 * Transaction41.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmStatusAndReason
	 * Transaction43.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmStatusAndReason
	 * Transaction47.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmMatchingDenial
	 * RequestDetails15.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmStatusAndReason
	 * Transaction49.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmMatchingDenial
	 * RequestDetails16.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation3#mmProcessingStatus
	 * IntraBalanceCancellation3.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmProcessingStatus
	 * IntraBalanceCancellation4.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmProcessingStatus
	 * IntraBalanceModification4.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmMatchingDenial
	 * RequestDetails18.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction51#mmStatusAndReason
	 * Transaction51.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification3#mmProcessingStatus
	 * IntraBalanceModification3.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmStatusAndReason
	 * Transaction53.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmStatusAndReason
	 * Transaction57.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmTradeConfirmation
	 * TradeTransaction18.mmTradeConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction58#mmStatusAndReason
	 * Transaction58.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmStatusAndReason
	 * Transaction60.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction64#mmStatusAndReason
	 * Transaction64.mmStatusAndReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RequestDetails1.mmMatchingDenial, RequestDetails2.mmMatchingDenial, RequestDetails6.mmMatchingDenial, RequestDetails7.mmMatchingDenial, RequestDetails8.mmMatchingDenial,
					RequestDetails9.mmMatchingDenial, RequestDetails11.mmMatchingDenial, RequestDetails12.mmMatchingDenial, Transaction8.mmStatusAndReason, Transaction10.mmStatusAndReason, Transaction12.mmStatusAndReason,
					Transaction16.mmStatusAndReason, Transaction19.mmStatusAndReason, Transaction22.mmStatusAndReason, Transaction27.mmStatusAndReason, Transaction31.mmStatusAndReason, IntraBalanceCancellation2.mmProcessingStatus,
					IntraBalanceCancellation1.mmProcessingStatus, Transaction25.mmStatusAndReason, IntraBalanceModification2.mmProcessingStatus, IntraBalanceModification1.mmProcessingStatus, Transaction34.mmStatusAndReason,
					RequestDetails13.mmMatchingDenial, Transaction38.mmStatusAndReason, RequestDetails14.mmMatchingDenial, Transaction41.mmStatusAndReason, Transaction43.mmStatusAndReason, Transaction47.mmStatusAndReason,
					RequestDetails15.mmMatchingDenial, Transaction49.mmStatusAndReason, RequestDetails16.mmMatchingDenial, IntraBalanceCancellation3.mmProcessingStatus, IntraBalanceCancellation4.mmProcessingStatus,
					IntraBalanceModification4.mmProcessingStatus, RequestDetails18.mmMatchingDenial, Transaction51.mmStatusAndReason, IntraBalanceModification3.mmProcessingStatus, Transaction53.mmStatusAndReason,
					Transaction57.mmStatusAndReason, TradeTransaction18.mmTradeConfirmation, Transaction58.mmStatusAndReason, Transaction60.mmStatusAndReason, Transaction64.mmStatusAndReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Specifies the status of a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}
	};
	protected TransactionActivityCode activity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity1Choice#mmCode
	 * TransactionActivity1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity1Choice#mmProprietary
	 * TransactionActivity1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmTransactionActivity
	 * TransactionDetails7.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmTransactionActivity
	 * TransactionDetails8.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity2Choice#mmCode
	 * TransactionActivity2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity2Choice#mmProprietary
	 * TransactionActivity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmTransactionActivity
	 * TransactionDetails16.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmTransactionActivity
	 * TransactionDetails17.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmTransactionActivity
	 * TransactionDetails26.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmTransactionActivity
	 * TransactionDetails25.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmTransactionActivity
	 * TransactionDetails27.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmTransactionActivity
	 * TransactionDetails33.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmTransactionActivity
	 * TransactionDetails39.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmTransactionActivity
	 * TransactionDetails50.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmTransactionActivity
	 * TransactionDetails56.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmTransactionActivity
	 * TransactionDetails59.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmTransactionActivity
	 * TransactionDetails6.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmTransactionActivity
	 * TransactionDetails18.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmTransactionActivity
	 * TransactionDetails24.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmTransactionActivity
	 * TransactionDetails34.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmTransactionActivity
	 * TransactionDetails37.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmTransactionActivity
	 * TransactionDetails48.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmTransactionActivity
	 * TransactionDetails57.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmTransactionActivity
	 * TransactionDetails60.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmTransactionActivity
	 * TransactionDetails51.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmTransactionActivity
	 * TransactionDetails62.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmTransactionActivity
	 * TransactionDetails63.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmTransactionActivity
	 * TransactionDetails67.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmTransactionActivity
	 * TransactionDetails68.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmTransactionActivity
	 * TransactionDetails69.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmTransactionActivity
	 * TransactionDetails72.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmTransactionActivity
	 * TransactionDetails75.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmTransactionActivity
	 * TransactionDetails78.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#mmCode
	 * TransactionActivity3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#mmProprietary
	 * TransactionActivity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmTransactionActivity
	 * TransactionDetails91.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmTransactionActivity
	 * TransactionDetails90.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity4Choice#mmCode
	 * TransactionActivity4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity4Choice#mmProprietary
	 * TransactionActivity4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmTransactionActivity
	 * TransactionDetails93.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmTransactionActivity
	 * TransactionDetails96.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmTransactionActivity
	 * TransactionDetails95.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmTransactionActivity
	 * TransactionDetails99.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmTransactionActivity
	 * TransactionDetails98.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmTransactionActivity
	 * TransactionDetails102.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmTransactionActivity
	 * TransactionDetails104.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmTransactionActivity
	 * TransactionDetails103.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmTransactionActivity
	 * TransactionDetails111.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmTransactionActivity
	 * TransactionDetails112.mmTransactionActivity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of activity to which the trade relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmActivity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionActivity1Choice.mmCode, TransactionActivity1Choice.mmProprietary, TransactionDetails7.mmTransactionActivity, TransactionDetails8.mmTransactionActivity,
					TransactionActivity2Choice.mmCode, TransactionActivity2Choice.mmProprietary, TransactionDetails16.mmTransactionActivity, TransactionDetails17.mmTransactionActivity, TransactionDetails26.mmTransactionActivity,
					TransactionDetails25.mmTransactionActivity, TransactionDetails27.mmTransactionActivity, TransactionDetails33.mmTransactionActivity, TransactionDetails39.mmTransactionActivity, TransactionDetails50.mmTransactionActivity,
					TransactionDetails56.mmTransactionActivity, TransactionDetails59.mmTransactionActivity, TransactionDetails6.mmTransactionActivity, TransactionDetails18.mmTransactionActivity, TransactionDetails24.mmTransactionActivity,
					TransactionDetails34.mmTransactionActivity, TransactionDetails37.mmTransactionActivity, TransactionDetails48.mmTransactionActivity, TransactionDetails57.mmTransactionActivity, TransactionDetails60.mmTransactionActivity,
					TransactionDetails51.mmTransactionActivity, TransactionDetails62.mmTransactionActivity, TransactionDetails63.mmTransactionActivity, TransactionDetails67.mmTransactionActivity, TransactionDetails68.mmTransactionActivity,
					TransactionDetails69.mmTransactionActivity, TransactionDetails72.mmTransactionActivity, TransactionDetails75.mmTransactionActivity, TransactionDetails78.mmTransactionActivity, TransactionActivity3Choice.mmCode,
					TransactionActivity3Choice.mmProprietary, TransactionDetails91.mmTransactionActivity, TransactionDetails90.mmTransactionActivity, TransactionActivity4Choice.mmCode, TransactionActivity4Choice.mmProprietary,
					TransactionDetails93.mmTransactionActivity, TransactionDetails96.mmTransactionActivity, TransactionDetails95.mmTransactionActivity, TransactionDetails99.mmTransactionActivity, TransactionDetails98.mmTransactionActivity,
					TransactionDetails102.mmTransactionActivity, TransactionDetails104.mmTransactionActivity, TransactionDetails103.mmTransactionActivity, TransactionDetails111.mmTransactionActivity,
					TransactionDetails112.mmTransactionActivity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Activity";
			definition = "Specifies the type of activity to which the trade relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionActivityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getActivity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> tradeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
	 * SecuritiesQuantity.mmTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmExecutedTradeQuantity
	 * TransactionDetails1.mmExecutedTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmTradeQuantity
	 * TradeLeg2.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeQuantity
	 * TradeLeg5.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#mmTradeQuantity
	 * TradeLeg1.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmTradeQuantity
	 * TradeLeg3.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeQuantity
	 * TradeLeg6.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#mmTradeQuantity
	 * TradeLeg4.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradeQuantity
	 * TradeLeg7.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeQuantity
	 * TradeLeg8.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeQuantity
	 * TradeLeg10.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeQuantity
	 * TradeLeg9.mmTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction15#mmQuantity
	 * TradeTransaction15.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction17#mmQuantity
	 * TradeTransaction17.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction14#mmQuantity
	 * TradeTransaction14.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmQuantity
	 * TradeTransaction18.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmQuantity
	 * TradeTransaction16.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails1.mmExecutedTradeQuantity, TradeLeg2.mmTradeQuantity, TradeLeg5.mmTradeQuantity, TradeLeg1.mmTradeQuantity, TradeLeg3.mmTradeQuantity, TradeLeg6.mmTradeQuantity,
					TradeLeg4.mmTradeQuantity, TradeLeg7.mmTradeQuantity, TradeLeg8.mmTradeQuantity, TradeLeg10.mmTradeQuantity, TradeLeg9.mmTradeQuantity, TradeTransaction15.mmQuantity, TradeTransaction17.mmQuantity,
					TradeTransaction14.mmQuantity, TradeTransaction18.mmQuantity, TradeTransaction16.mmQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeQuantity";
			definition = "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ISODateTime tradeOriginationDate;
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
	 * {@linkplain com.tools20022.repository.msg.Order3#mmTradeOriginationDate
	 * Order3.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmTradeOriginationDate
	 * Order16.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmTradeOriginationDate
	 * Order14.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#mmTradeOriginationDate
	 * Order9.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order2#mmTradeOriginationDate
	 * Order2.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmTradeOriginationDate
	 * Order6.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.List2#mmTradeOriginationDateTime
	 * List2.mmTradeOriginationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeOriginationDate
	 * Order17.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeOriginationDate
	 * Order18.mmTradeOriginationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 229</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeOriginationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmTradeOriginationDate, Order16.mmTradeOriginationDate, Order14.mmTradeOriginationDate, Order9.mmTradeOriginationDate, Order2.mmTradeOriginationDate, Order6.mmTradeOriginationDate,
					List2.mmTradeOriginationDateTime, Order17.mmTradeOriginationDate, Order18.mmTradeOriginationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "229"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeOriginationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ClearingFeeTypeCode clearingFeeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmClearingFeeType
	 * Order3.mmClearingFeeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmClearingFeeType
	 * Order9.mmClearingFeeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmClearingFeeType
	 * Order6.mmClearingFeeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 635</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee for trade executions at an exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClearingFeeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmClearingFeeType, Order9.mmClearingFeeType, Order6.mmClearingFeeType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "635"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee for trade executions at an exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingFeeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getClearingFeeType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
	 * Security.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmFinancialInstrumentDetails
	 * TransactionDetails1.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmFinancialInstrumentDetails
	 * TransactionDetails3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails7.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails19.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails4.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails17.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails10.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails22.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails23.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails29.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails14.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails20.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails24.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails30.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails35.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails42.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails49.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails48.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails57.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails61.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails68.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails69.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails71.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails72.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails81.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails85.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security involved in a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails1.mmFinancialInstrumentDetails, TransactionDetails3.mmFinancialInstrumentDetails, SecuritiesTradeDetails7.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails19.mmFinancialInstrumentAttributes, SecuritiesTradeDetails4.mmFinancialInstrumentAttributes, SecuritiesTradeDetails17.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails10.mmFinancialInstrumentAttributes, SecuritiesTradeDetails22.mmFinancialInstrumentAttributes, SecuritiesTradeDetails23.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails29.mmFinancialInstrumentAttributes, SecuritiesTradeDetails14.mmFinancialInstrumentAttributes, SecuritiesTradeDetails20.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails24.mmFinancialInstrumentAttributes, SecuritiesTradeDetails30.mmFinancialInstrumentAttributes, SecuritiesTradeDetails35.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails42.mmFinancialInstrumentAttributes, SecuritiesTradeDetails49.mmFinancialInstrumentAttributes, SecuritiesTradeDetails48.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails57.mmFinancialInstrumentAttributes, SecuritiesTradeDetails61.mmFinancialInstrumentAttributes, SecuritiesTradeDetails68.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails69.mmFinancialInstrumentAttributes, SecuritiesTradeDetails71.mmFinancialInstrumentAttributes, SecuritiesTradeDetails72.mmFinancialInstrumentAttributes,
					SecuritiesTradeDetails81.mmFinancialInstrumentAttributes, SecuritiesTradeDetails85.mmFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security involved in a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> tradePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
	 * SecuritiesPricing.mmSecuritiesTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmExecutedTradePrice
	 * TransactionDetails1.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#mmAverageDealPrice
	 * NetPosition1.mmAverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmAverageDealPrice
	 * NetPosition2.mmAverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAverageDealPrice
	 * NetPosition3.mmAverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmPrice
	 * SecuritiesTransaction1.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction15#mmPrice
	 * TradeTransaction15.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction17#mmPrice
	 * TradeTransaction17.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction14#mmPrice
	 * TradeTransaction14.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmPrice
	 * TradeTransaction18.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmPrice
	 * TradeTransaction16.mmPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the executed trade price which is derived from the different deal prices."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails1.mmExecutedTradePrice, NetPosition1.mmAverageDealPrice, NetPosition2.mmAverageDealPrice, NetPosition3.mmAverageDealPrice, SecuritiesTransaction1.mmPrice,
					TradeTransaction15.mmPrice, TradeTransaction17.mmPrice, TradeTransaction14.mmPrice, TradeTransaction18.mmPrice, TradeTransaction16.mmPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePrice";
			definition = "Specifies the executed trade price which is derived from the different deal prices.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradePartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
	 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
	 * SecuritiesTradePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmOtherBusinessParties
	 * SecuritiesTradeDetails7.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmOtherBusinessParties
	 * SecuritiesTradeDetails19.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmOtherBusinessParties
	 * SecuritiesTradeDetails4.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmOtherBusinessParties
	 * SecuritiesTradeDetails17.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmOtherBusinessParties
	 * SecuritiesTradeDetails10.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmOtherBusinessParties
	 * SecuritiesTradeDetails22.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmOtherBusinessParties
	 * SecuritiesTradeDetails23.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmOtherBusinessParties
	 * SecuritiesTradeDetails29.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmOtherBusinessParties
	 * SecuritiesTradeDetails14.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmOtherBusinessParties
	 * SecuritiesTradeDetails20.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmOtherBusinessParties
	 * SecuritiesTradeDetails24.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmOtherBusinessParties
	 * SecuritiesTradeDetails30.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmOtherBusinessParties
	 * OrderStatusAndReason5.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmOtherBusinessParties
	 * SecuritiesTradeDetails35.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmOtherBusinessParties
	 * SecuritiesTradeDetails42.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmOtherBusinessParties
	 * SecuritiesTradeDetails49.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmOtherBusinessParties
	 * SecuritiesTradeDetails48.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmOtherBusinessParties
	 * SecuritiesTradeDetails57.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmOtherBusinessParties
	 * SecuritiesTradeDetails61.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmOtherBusinessParties
	 * SecuritiesTradeDetails68.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmOtherBusinessParties
	 * SecuritiesTradeDetails69.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmOtherBusinessParties
	 * SecuritiesTradeDetails71.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmOtherBusinessParties
	 * SecuritiesTradeDetails72.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmOtherBusinessParties
	 * SecuritiesTradeDetails81.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmOtherBusinessParties
	 * SecuritiesTradeDetails85.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails7.mmOtherBusinessParties, SecuritiesTradeDetails19.mmOtherBusinessParties, SecuritiesTradeDetails4.mmOtherBusinessParties,
					SecuritiesTradeDetails17.mmOtherBusinessParties, SecuritiesTradeDetails10.mmOtherBusinessParties, SecuritiesTradeDetails22.mmOtherBusinessParties, SecuritiesTradeDetails23.mmOtherBusinessParties,
					SecuritiesTradeDetails29.mmOtherBusinessParties, SecuritiesTradeDetails14.mmOtherBusinessParties, SecuritiesTradeDetails20.mmOtherBusinessParties, SecuritiesTradeDetails24.mmOtherBusinessParties,
					SecuritiesTradeDetails30.mmOtherBusinessParties, OrderStatusAndReason5.mmOtherBusinessParties, SecuritiesTradeDetails35.mmOtherBusinessParties, SecuritiesTradeDetails42.mmOtherBusinessParties,
					SecuritiesTradeDetails49.mmOtherBusinessParties, SecuritiesTradeDetails48.mmOtherBusinessParties, SecuritiesTradeDetails57.mmOtherBusinessParties, SecuritiesTradeDetails61.mmOtherBusinessParties,
					SecuritiesTradeDetails68.mmOtherBusinessParties, SecuritiesTradeDetails69.mmOtherBusinessParties, SecuritiesTradeDetails71.mmOtherBusinessParties, SecuritiesTradeDetails72.mmOtherBusinessParties,
					SecuritiesTradeDetails81.mmOtherBusinessParties, SecuritiesTradeDetails85.mmOtherBusinessParties);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.mmObject();
		}
	};
	protected SecuritiesFinancing securitiesFinancingClosingData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
	 * SecuritiesFinancing.mmClosingLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails4.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails17.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails10.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails22.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails23.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails29.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails35.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails42.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails49.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails61.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails68.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails69.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails71.mmSecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails85.mmSecuritiesFinancingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingClosingData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which a closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancingClosingData = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails4.mmSecuritiesFinancingDetails, SecuritiesTradeDetails17.mmSecuritiesFinancingDetails, SecuritiesTradeDetails10.mmSecuritiesFinancingDetails,
					SecuritiesTradeDetails22.mmSecuritiesFinancingDetails, SecuritiesTradeDetails23.mmSecuritiesFinancingDetails, SecuritiesTradeDetails29.mmSecuritiesFinancingDetails, SecuritiesTradeDetails35.mmSecuritiesFinancingDetails,
					SecuritiesTradeDetails42.mmSecuritiesFinancingDetails, SecuritiesTradeDetails49.mmSecuritiesFinancingDetails, SecuritiesTradeDetails61.mmSecuritiesFinancingDetails, SecuritiesTradeDetails68.mmSecuritiesFinancingDetails,
					SecuritiesTradeDetails69.mmSecuritiesFinancingDetails, SecuritiesTradeDetails71.mmSecuritiesFinancingDetails, SecuritiesTradeDetails85.mmSecuritiesFinancingDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingClosingData";
			definition = "Financing process for which a closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeExecution> tradingExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice#mmOffMarket
	 * PlaceOfTradeIdentification2Choice.mmOffMarket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The realisation of the trade over one or more transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradingExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PlaceOfTradeIdentification2Choice.mmOffMarket);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingExecution";
			definition = "The realisation of the trade over one or more transactions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmRelatedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Allocation> tradeAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
	 * Allocation.mmSecuritiesTrade}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the allocation of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAllocation";
			definition = "Information about the allocation of the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
	 * SecuritiesOrder.mmOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmOrderTransmission
	 * SecuritiesTransactionReport4.mmOrderTransmission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed by a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTransactionReport4.mmOrderTransmission);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed by a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected SecuritiesFinancing securitiesFinancingOpeningData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
	 * SecuritiesFinancing.mmOpeningLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingOpeningData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which an opening leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancingOpeningData = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingOpeningData";
			definition = "Financing process for which an opening leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected TradeTypeCode transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.TradeType3Choice#mmCode
	 * TradeType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeType3Choice#mmProprietary
	 * TradeType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmTradeTransactionType
	 * Order16.mmTradeTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmTradeTransactionType
	 * Order14.mmTradeTransactionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmTradeType
	 * TradeLeg2.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeType
	 * TradeLeg5.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#mmTradeType
	 * TradeLeg1.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmTradeType
	 * TradeLeg3.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeType
	 * TradeLeg6.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#mmTradeType
	 * TradeLeg4.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradeType
	 * TradeLeg7.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTradeType
	 * Bid1.mmTradeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionType
	 * Order17.mmTradeTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionType
	 * Order18.mmTradeTransactionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeType
	 * TradeLeg8.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeType
	 * TradeLeg10.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeType
	 * TradeLeg9.mmTradeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmTransactionType
	 * UnsecuredMarketTransaction1.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmTransactionType
	 * OvernightIndexSwapTransaction1.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTransactionType
	 * SecuredMarketTransaction1.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmDerivativeNotionalChange
	 * SecuritiesTransaction1.mmDerivativeNotionalChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTransactionType
	 * UnsecuredMarketTransaction2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTransactionType
	 * SecuredMarketTransaction2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmTransactionType
	 * UnsecuredMarketTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmTransactionType
	 * OvernightIndexSwapTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTransactionType
	 * SecuredMarketTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmTransactionType
	 * DerivativeCommodity2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTransactionType
	 * SecuredMarketTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTransactionType
	 * OvernightIndexSwapTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTransactionType
	 * UnsecuredMarketTransaction4.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction of which the order is a component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeType3Choice.mmCode, TradeType3Choice.mmProprietary, Order16.mmTradeTransactionType, Order14.mmTradeTransactionType, TradeLeg2.mmTradeType, TradeLeg5.mmTradeType, TradeLeg1.mmTradeType,
					TradeLeg3.mmTradeType, TradeLeg6.mmTradeType, TradeLeg4.mmTradeType, TradeLeg7.mmTradeType, Bid1.mmTradeType, Order17.mmTradeTransactionType, Order18.mmTradeTransactionType, TradeLeg8.mmTradeType,
					TradeLeg10.mmTradeType, TradeLeg9.mmTradeType, UnsecuredMarketTransaction1.mmTransactionType, OvernightIndexSwapTransaction1.mmTransactionType, SecuredMarketTransaction1.mmTransactionType,
					SecuritiesTransaction1.mmDerivativeNotionalChange, UnsecuredMarketTransaction2.mmTransactionType, SecuredMarketTransaction2.mmTransactionType, UnsecuredMarketTransaction3.mmTransactionType,
					OvernightIndexSwapTransaction3.mmTransactionType, SecuredMarketTransaction3.mmTransactionType, DerivativeCommodity2.mmTransactionType, SecuredMarketTransaction4.mmTransactionType,
					OvernightIndexSwapTransaction4.mmTransactionType, UnsecuredMarketTransaction4.mmTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Indicates the type of transaction of which the order is a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTransactionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LegalFrameworkCode legalFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalFrameworkCode
	 * LegalFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework1Choice#mmCode
	 * LegalFramework1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework1Choice#mmProprietary
	 * LegalFramework1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails3.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework2Choice#mmCode
	 * LegalFramework2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework2Choice#mmProprietary
	 * LegalFramework2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails5.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails1.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails11.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails14.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails4.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmLegalFramework
	 * SecuritiesFinancing10.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails7.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails19.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails20.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails9.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmLegalFramework
	 * SecuritiesFinancing1.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails28.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails27.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails29.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#mmCode
	 * LegalFramework3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#mmProprietary
	 * LegalFramework3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails32.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails30.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails34.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework4Choice#mmCode
	 * LegalFramework4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework4Choice#mmProprietary
	 * LegalFramework4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails37#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails37.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails38.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails39#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails39.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails41#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails41.mmLegalFramework}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegalFramework = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LegalFramework1Choice.mmCode, LegalFramework1Choice.mmProprietary, SecuritiesFinancingTransactionDetails3.mmLegalFramework, LegalFramework2Choice.mmCode,
					LegalFramework2Choice.mmProprietary, SecuritiesFinancingTransactionDetails5.mmLegalFramework, SecuritiesFinancingTransactionDetails1.mmLegalFramework, SecuritiesFinancingTransactionDetails11.mmLegalFramework,
					SecuritiesFinancingTransactionDetails14.mmLegalFramework, SecuritiesFinancingTransactionDetails4.mmLegalFramework, SecuritiesFinancing10.mmLegalFramework, SecuritiesFinancingTransactionDetails7.mmLegalFramework,
					SecuritiesFinancingTransactionDetails19.mmLegalFramework, SecuritiesFinancingTransactionDetails20.mmLegalFramework, SecuritiesFinancingTransactionDetails9.mmLegalFramework, SecuritiesFinancing1.mmLegalFramework,
					SecuritiesFinancingTransactionDetails28.mmLegalFramework, SecuritiesFinancingTransactionDetails27.mmLegalFramework, SecuritiesFinancingTransactionDetails29.mmLegalFramework, LegalFramework3Choice.mmCode,
					LegalFramework3Choice.mmProprietary, SecuritiesFinancingTransactionDetails32.mmLegalFramework, SecuritiesFinancingTransactionDetails30.mmLegalFramework, SecuritiesFinancingTransactionDetails34.mmLegalFramework,
					LegalFramework4Choice.mmCode, LegalFramework4Choice.mmProprietary, SecuritiesFinancingTransactionDetails37.mmLegalFramework, SecuritiesFinancingTransactionDetails38.mmLegalFramework,
					SecuritiesFinancingTransactionDetails39.mmLegalFramework, SecuritiesFinancingTransactionDetails41.mmLegalFramework);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalFrameworkCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getLegalFramework", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTransactionTypeV2Code securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType1Choice#mmCode
	 * SecuritiesTransactionType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType1Choice#mmProprietary
	 * SecuritiesTransactionType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType9Choice#mmCode
	 * SecuritiesTransactionType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType9Choice#mmProprietary
	 * SecuritiesTransactionType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSecuritiesTransactionType
	 * SettlementDetails50.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType16Choice#mmCode
	 * SecuritiesTransactionType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType16Choice#mmProprietary
	 * SecuritiesTransactionType16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmSecuritiesTransactionType
	 * SettlementDetails51.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters3.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters6.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters1.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters4.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit1Choice#mmCode
	 * UnilateralSplit1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit1Choice#mmProprietary
	 * UnilateralSplit1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit2Choice#mmCode
	 * UnilateralSplit2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit2Choice#mmProprietary
	 * UnilateralSplit2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType3Choice#mmCode
	 * SecuritiesTransactionType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType3Choice#mmProprietary
	 * SecuritiesTransactionType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmSecuritiesTransactionType
	 * SettlementDetails6.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType6Choice#mmCode
	 * SecuritiesTransactionType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType6Choice#mmProprietary
	 * SecuritiesTransactionType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSecuritiesTransactionType
	 * SettlementDetails20.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmSecuritiesTransactionType
	 * SettlementDetails24.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmSecuritiesTransactionType
	 * SettlementDetails33.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType10Choice#mmCode
	 * SecuritiesTransactionType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType10Choice#mmProprietary
	 * SecuritiesTransactionType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmSecuritiesTransactionType
	 * SettlementDetails45.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType13Choice#mmCode
	 * SecuritiesTransactionType13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType13Choice#mmProprietary
	 * SecuritiesTransactionType13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmSecuritiesTransactionType
	 * SettlementDetails54.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmSecuritiesTransactionType
	 * SettlementDetails1.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType4Choice#mmCode
	 * SecuritiesTransactionType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType4Choice#mmProprietary
	 * SecuritiesTransactionType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmSecuritiesTransactionType
	 * SettlementDetails19.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmSecuritiesTransactionType
	 * SettlementDetails22.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmSecuritiesTransactionType
	 * SettlementDetails35.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSecuritiesTransactionType
	 * SettlementDetails42.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmSecuritiesTransactionType
	 * SettlementDetails52.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmSecuritiesTransactionType
	 * SettlementDetails8.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmSecuritiesTransactionType
	 * SettlementDetails11.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmSecuritiesTransactionType
	 * SettlementDetails23.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmSecuritiesTransactionType
	 * SettlementDetails37.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSecuritiesTransactionType
	 * SettlementDetails44.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmSecuritiesTransactionType
	 * SettlementDetails53.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType2Choice#mmCode
	 * SecuritiesTransactionType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType2Choice#mmProprietary
	 * SecuritiesTransactionType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent2Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent2Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType5Choice#mmCode
	 * SecuritiesTransactionType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType5Choice#mmProprietary
	 * SecuritiesTransactionType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent3Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent3Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType11Choice#mmCode
	 * SecuritiesTransactionType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType11Choice#mmProprietary
	 * SecuritiesTransactionType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent6Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent6Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType14Choice#mmCode
	 * SecuritiesTransactionType14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType14Choice#mmProprietary
	 * SecuritiesTransactionType14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent8Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent8Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent10Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent11Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent1Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent1Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent4Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent4Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent5Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent5Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent7Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent7Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent9Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent9Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent12Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent12Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlementTransactionType
	 * SettlementDetails43.mmSettlementTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters2.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters7.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails2.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails8.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmSecuritiesTransactionType
	 * SettlementDetails5.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType7Choice#mmCode
	 * SecuritiesTransactionType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType7Choice#mmProprietary
	 * SecuritiesTransactionType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmSecuritiesTransactionType
	 * SettlementDetails25.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmSecuritiesTransactionType
	 * SettlementDetails26.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters5.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters8.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails6.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails10.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails17.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails18.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmSecuritiesTransactionType
	 * SettlementDetails15.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType8Choice#mmCode
	 * SecuritiesTransactionType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType8Choice#mmProprietary
	 * SecuritiesTransactionType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmSecuritiesTransactionType
	 * SettlementDetails34.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType12Choice#mmCode
	 * SecuritiesTransactionType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType12Choice#mmProprietary
	 * SecuritiesTransactionType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmSecuritiesTransactionType
	 * SettlementDetails49.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType15Choice#mmCode
	 * SecuritiesTransactionType15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType15Choice#mmProprietary
	 * SecuritiesTransactionType15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmSecuritiesTransactionType
	 * SettlementDetails58.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmSecuritiesTransactionType
	 * SettlementDetails36.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSecuritiesTransactionType
	 * SettlementDetails67.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmSecuritiesTransactionType
	 * SettlementDetails70.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSecuritiesTransactionType
	 * SettlementDetails68.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSecuritiesTransactionType
	 * SettlementDetails69.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails21.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmSecuritiesTransactionType
	 * SettlementDetails81.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmSecuritiesTransactionType
	 * SettlementDetails80.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails22.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmSecuritiesTransactionType
	 * SettlementDetails83.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmSecuritiesTransactionType
	 * SettlementDetails85.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails24.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails25.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmTransactionType
	 * ForeignExchangeSwapTransaction1.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails26.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSecuritiesTransactionType
	 * SettlementDetails93.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmSecuritiesTransactionType
	 * SettlementDetails90.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters10.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters9.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters11.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmSecuritiesTransactionType
	 * SettlementDetails99.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent14Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType19Choice#mmCode
	 * SecuritiesTransactionType19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType19Choice#mmProprietary
	 * SecuritiesTransactionType19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSecuritiesTransactionType
	 * SettlementDetails94.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice#mmCode
	 * SecuritiesTransactionType18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice#mmProprietary
	 * SecuritiesTransactionType18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmSecuritiesTransactionType
	 * SettlementDetails95.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#mmCode
	 * UnilateralSplit3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#mmProprietary
	 * UnilateralSplit3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType20Choice#mmCode
	 * SecuritiesTransactionType20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType20Choice#mmProprietary
	 * SecuritiesTransactionType20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent13Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType21Choice#mmCode
	 * SecuritiesTransactionType21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType21Choice#mmProprietary
	 * SecuritiesTransactionType21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmSecuritiesTransactionType
	 * SettlementDetails101.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters13.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails33.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters14.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters12.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmSecuritiesTransactionType
	 * SettlementDetails111.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmSecuritiesTransactionType
	 * SettlementDetails112.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmSecuritiesTransactionType
	 * SettlementDetails110.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmSecuritiesTransactionType
	 * SettlementDetails108.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType30Choice#mmCode
	 * SecuritiesTransactionType30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType30Choice#mmProprietary
	 * SecuritiesTransactionType30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmSecuritiesTransactionType
	 * SettlementDetails115.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit4Choice#mmCode
	 * UnilateralSplit4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit4Choice#mmProprietary
	 * UnilateralSplit4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType24Choice#mmCode
	 * SecuritiesTransactionType24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType24Choice#mmProprietary
	 * SecuritiesTransactionType24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent16Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent16Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType25Choice#mmCode
	 * SecuritiesTransactionType25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType25Choice#mmProprietary
	 * SecuritiesTransactionType25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent15Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent15Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmSecuritiesTransactionType
	 * SettlementDetails113.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType22Choice#mmCode
	 * SecuritiesTransactionType22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType22Choice#mmProprietary
	 * SecuritiesTransactionType22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmTransactionType
	 * ForeignExchangeSwapTransaction2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSecuritiesTransactionType
	 * SettlementDetails128.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSecuritiesTransactionType
	 * SettlementDetails120.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSecuritiesTransactionType
	 * SettlementDetails119.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmSecuritiesTransactionType
	 * SettlementDetails125.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters15.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters17.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters16.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails35.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType33Choice#mmCode
	 * SecuritiesTransactionType33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType33Choice#mmProprietary
	 * SecuritiesTransactionType33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent19Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSecuritiesTransactionType
	 * SettlementDetails122.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent17Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType32Choice#mmCode
	 * SecuritiesTransactionType32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType32Choice#mmProprietary
	 * SecuritiesTransactionType32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSecuritiesTransactionType
	 * SettlementDetails121.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters19.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmSecuritiesTransactionType
	 * SettlementDetails134.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters20.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters18.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmSecuritiesTransactionType
	 * SettlementDetails137.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails36.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmSecuritiesTransactionType
	 * SettlementDetails132.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType34Choice#mmCode
	 * SecuritiesTransactionType34Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType34Choice#mmProprietary
	 * SecuritiesTransactionType34Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmSecuritiesTransactionType
	 * SettlementDetails138.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmSecuritiesTransactionType
	 * SettlementDetails131.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent20Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType35Choice#mmCode
	 * SecuritiesTransactionType35Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType35Choice#mmProprietary
	 * SecuritiesTransactionType35Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent21Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent21Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmSecuritiesTransactionType
	 * SettlementDetails133.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmTransactionType
	 * ForeignExchangeSwapTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmSecuritiesTransactionType
	 * SettlementDetails140.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSecuritiesTransactionType
	 * SettlementDetails142.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSecuritiesTransactionType
	 * SettlementDetails144.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmSecuritiesTransactionType
	 * SettlementDetails141.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSecuritiesTransactionType
	 * SettlementDetails145.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent22Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent22Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType36Choice#mmCode
	 * SecuritiesTransactionType36Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType36Choice#mmProprietary
	 * SecuritiesTransactionType36Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSecuritiesTransactionType
	 * SettlementDetails146.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType37Choice#mmCode
	 * SecuritiesTransactionType37Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType37Choice#mmProprietary
	 * SecuritiesTransactionType37Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSecuritiesTransactionType
	 * SettlementDetails143.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType38Choice#mmCode
	 * SecuritiesTransactionType38Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType38Choice#mmProprietary
	 * SecuritiesTransactionType38Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent23Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent23Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmSecuritiesTransactionType
	 * SettlementDetails153.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType39Choice#mmCode
	 * SecuritiesTransactionType39Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType39Choice#mmProprietary
	 * SecuritiesTransactionType39Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmSecuritiesTransactionType
	 * SettlementDetails155.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType41Choice#mmCode
	 * SecuritiesTransactionType41Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType41Choice#mmProprietary
	 * SecuritiesTransactionType41Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmSecuritiesTransactionType
	 * SettlementDetails156.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType42Choice#mmCode
	 * SecuritiesTransactionType42Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType42Choice#mmProprietary
	 * SecuritiesTransactionType42Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmSecuritiesTransactionType
	 * SettlementDetails157.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmSecuritiesTransactionType
	 * SettlementDetails158.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmSecuritiesTransactionType
	 * SettlementDetails160.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent24Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent24Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent25Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent25Choice.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying information about the settlement transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSecuritiesTransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTransactionType1Choice.mmCode, SecuritiesTransactionType1Choice.mmProprietary, SecuritiesTransactionType9Choice.mmCode, SecuritiesTransactionType9Choice.mmProprietary,
					SettlementDetails50.mmSecuritiesTransactionType, SecuritiesTransactionType16Choice.mmCode, SecuritiesTransactionType16Choice.mmProprietary, SettlementDetails51.mmSecuritiesTransactionType,
					TransactionTypeAndAdditionalParameters3.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters6.mmSecuritiesFinancingTransactionType,
					TransactionTypeAndAdditionalParameters1.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters4.mmSecuritiesFinancingTransactionType, UnilateralSplit1Choice.mmCode,
					UnilateralSplit1Choice.mmProprietary, UnilateralSplit2Choice.mmCode, UnilateralSplit2Choice.mmProprietary, SecuritiesTransactionType3Choice.mmCode, SecuritiesTransactionType3Choice.mmProprietary,
					SettlementDetails6.mmSecuritiesTransactionType, SecuritiesTransactionType6Choice.mmCode, SecuritiesTransactionType6Choice.mmProprietary, SettlementDetails20.mmSecuritiesTransactionType,
					SettlementDetails24.mmSecuritiesTransactionType, SettlementDetails33.mmSecuritiesTransactionType, SecuritiesTransactionType10Choice.mmCode, SecuritiesTransactionType10Choice.mmProprietary,
					SettlementDetails45.mmSecuritiesTransactionType, SecuritiesTransactionType13Choice.mmCode, SecuritiesTransactionType13Choice.mmProprietary, SettlementDetails54.mmSecuritiesTransactionType,
					SettlementDetails1.mmSecuritiesTransactionType, SecuritiesTransactionType4Choice.mmCode, SecuritiesTransactionType4Choice.mmProprietary, SettlementDetails19.mmSecuritiesTransactionType,
					SettlementDetails22.mmSecuritiesTransactionType, SettlementDetails35.mmSecuritiesTransactionType, SettlementDetails42.mmSecuritiesTransactionType, SettlementDetails52.mmSecuritiesTransactionType,
					SettlementDetails8.mmSecuritiesTransactionType, SettlementDetails11.mmSecuritiesTransactionType, SettlementDetails23.mmSecuritiesTransactionType, SettlementDetails37.mmSecuritiesTransactionType,
					SettlementDetails44.mmSecuritiesTransactionType, SettlementDetails53.mmSecuritiesTransactionType, SecuritiesTransactionType2Choice.mmCode, SecuritiesTransactionType2Choice.mmProprietary,
					SettlementOrCorporateActionEvent2Choice.mmSecuritiesTransactionType, SecuritiesTransactionType5Choice.mmCode, SecuritiesTransactionType5Choice.mmProprietary,
					SettlementOrCorporateActionEvent3Choice.mmSecuritiesTransactionType, SecuritiesTransactionType11Choice.mmCode, SecuritiesTransactionType11Choice.mmProprietary,
					SettlementOrCorporateActionEvent6Choice.mmSecuritiesTransactionType, SecuritiesTransactionType14Choice.mmCode, SecuritiesTransactionType14Choice.mmProprietary,
					SettlementOrCorporateActionEvent8Choice.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent10Choice.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent11Choice.mmSecuritiesTransactionType,
					SettlementOrCorporateActionEvent1Choice.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent4Choice.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent5Choice.mmSecuritiesTransactionType,
					SettlementOrCorporateActionEvent7Choice.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent9Choice.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent12Choice.mmSecuritiesTransactionType,
					SettlementDetails43.mmSettlementTransactionType, TransactionTypeAndAdditionalParameters2.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters7.mmSecuritiesFinancingTransactionType,
					SecuritiesFinancingTransactionDetails2.mmSecuritiesFinancingTransactionType, SecuritiesFinancingTransactionDetails8.mmSecuritiesFinancingTransactionType, SettlementDetails5.mmSecuritiesTransactionType,
					SecuritiesTransactionType7Choice.mmCode, SecuritiesTransactionType7Choice.mmProprietary, SettlementDetails25.mmSecuritiesTransactionType, SettlementDetails26.mmSecuritiesTransactionType,
					TransactionTypeAndAdditionalParameters5.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters8.mmSecuritiesFinancingTransactionType,
					SecuritiesFinancingTransactionDetails6.mmSecuritiesFinancingTransactionType, SecuritiesFinancingTransactionDetails10.mmSecuritiesFinancingTransactionType,
					SecuritiesFinancingTransactionDetails17.mmSecuritiesFinancingTransactionType, SecuritiesFinancingTransactionDetails18.mmSecuritiesFinancingTransactionType, SettlementDetails15.mmSecuritiesTransactionType,
					SecuritiesTransactionType8Choice.mmCode, SecuritiesTransactionType8Choice.mmProprietary, SettlementDetails34.mmSecuritiesTransactionType, SecuritiesTransactionType12Choice.mmCode,
					SecuritiesTransactionType12Choice.mmProprietary, SettlementDetails49.mmSecuritiesTransactionType, SecuritiesTransactionType15Choice.mmCode, SecuritiesTransactionType15Choice.mmProprietary,
					SettlementDetails58.mmSecuritiesTransactionType, SettlementDetails36.mmSecuritiesTransactionType, SettlementDetails67.mmSecuritiesTransactionType, SettlementDetails70.mmSecuritiesTransactionType,
					SettlementDetails68.mmSecuritiesTransactionType, SettlementDetails69.mmSecuritiesTransactionType, SecuritiesFinancingTransactionDetails21.mmSecuritiesFinancingTransactionType,
					SettlementDetails81.mmSecuritiesTransactionType, SettlementDetails80.mmSecuritiesTransactionType, SecuritiesFinancingTransactionDetails22.mmSecuritiesFinancingTransactionType,
					SettlementDetails83.mmSecuritiesTransactionType, SettlementDetails85.mmSecuritiesTransactionType, SecuritiesFinancingTransactionDetails24.mmSecuritiesFinancingTransactionType,
					SecuritiesFinancingTransactionDetails25.mmSecuritiesFinancingTransactionType, ForeignExchangeSwapTransaction1.mmTransactionType, SecuritiesFinancingTransactionDetails26.mmSecuritiesFinancingTransactionType,
					SettlementDetails93.mmSecuritiesTransactionType, SettlementDetails90.mmSecuritiesTransactionType, TransactionTypeAndAdditionalParameters10.mmSecuritiesFinancingTransactionType,
					TransactionTypeAndAdditionalParameters9.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters11.mmSecuritiesFinancingTransactionType, SettlementDetails99.mmSecuritiesTransactionType,
					SettlementOrCorporateActionEvent14Choice.mmSecuritiesTransactionType, SecuritiesTransactionType19Choice.mmCode, SecuritiesTransactionType19Choice.mmProprietary, SettlementDetails94.mmSecuritiesTransactionType,
					SecuritiesTransactionType18Choice.mmCode, SecuritiesTransactionType18Choice.mmProprietary, SettlementDetails95.mmSecuritiesTransactionType, UnilateralSplit3Choice.mmCode, UnilateralSplit3Choice.mmProprietary,
					SecuritiesTransactionType20Choice.mmCode, SecuritiesTransactionType20Choice.mmProprietary, SettlementOrCorporateActionEvent13Choice.mmSecuritiesTransactionType, SecuritiesTransactionType21Choice.mmCode,
					SecuritiesTransactionType21Choice.mmProprietary, SettlementDetails101.mmSecuritiesTransactionType, TransactionTypeAndAdditionalParameters13.mmSecuritiesFinancingTransactionType,
					SecuritiesFinancingTransactionDetails33.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters14.mmSecuritiesFinancingTransactionType,
					TransactionTypeAndAdditionalParameters12.mmSecuritiesFinancingTransactionType, SettlementDetails111.mmSecuritiesTransactionType, SettlementDetails112.mmSecuritiesTransactionType,
					SettlementDetails110.mmSecuritiesTransactionType, SettlementDetails108.mmSecuritiesTransactionType, SecuritiesTransactionType30Choice.mmCode, SecuritiesTransactionType30Choice.mmProprietary,
					SettlementDetails115.mmSecuritiesTransactionType, UnilateralSplit4Choice.mmCode, UnilateralSplit4Choice.mmProprietary, SecuritiesTransactionType24Choice.mmCode, SecuritiesTransactionType24Choice.mmProprietary,
					SettlementOrCorporateActionEvent16Choice.mmSecuritiesTransactionType, SecuritiesTransactionType25Choice.mmCode, SecuritiesTransactionType25Choice.mmProprietary,
					SettlementOrCorporateActionEvent15Choice.mmSecuritiesTransactionType, SettlementDetails113.mmSecuritiesTransactionType, SecuritiesTransactionType22Choice.mmCode, SecuritiesTransactionType22Choice.mmProprietary,
					ForeignExchangeSwapTransaction2.mmTransactionType, SettlementDetails128.mmSecuritiesTransactionType, SettlementDetails120.mmSecuritiesTransactionType, SettlementDetails119.mmSecuritiesTransactionType,
					SettlementDetails125.mmSecuritiesTransactionType, TransactionTypeAndAdditionalParameters15.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters17.mmSecuritiesFinancingTransactionType,
					TransactionTypeAndAdditionalParameters16.mmSecuritiesFinancingTransactionType, SecuritiesFinancingTransactionDetails35.mmSecuritiesFinancingTransactionType, SecuritiesTransactionType33Choice.mmCode,
					SecuritiesTransactionType33Choice.mmProprietary, SettlementOrCorporateActionEvent19Choice.mmSecuritiesTransactionType, SettlementDetails122.mmSecuritiesTransactionType,
					SettlementOrCorporateActionEvent17Choice.mmSecuritiesTransactionType, SecuritiesTransactionType32Choice.mmCode, SecuritiesTransactionType32Choice.mmProprietary, SettlementDetails121.mmSecuritiesTransactionType,
					TransactionTypeAndAdditionalParameters19.mmSecuritiesFinancingTransactionType, SettlementDetails134.mmSecuritiesTransactionType, TransactionTypeAndAdditionalParameters20.mmSecuritiesFinancingTransactionType,
					TransactionTypeAndAdditionalParameters18.mmSecuritiesFinancingTransactionType, SettlementDetails137.mmSecuritiesTransactionType, SecuritiesFinancingTransactionDetails36.mmSecuritiesFinancingTransactionType,
					SettlementDetails132.mmSecuritiesTransactionType, SecuritiesTransactionType34Choice.mmCode, SecuritiesTransactionType34Choice.mmProprietary, SettlementDetails138.mmSecuritiesTransactionType,
					SettlementDetails131.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent20Choice.mmSecuritiesTransactionType, SecuritiesTransactionType35Choice.mmCode, SecuritiesTransactionType35Choice.mmProprietary,
					SettlementOrCorporateActionEvent21Choice.mmSecuritiesTransactionType, SettlementDetails133.mmSecuritiesTransactionType, ForeignExchangeSwapTransaction3.mmTransactionType,
					SettlementDetails140.mmSecuritiesTransactionType, SettlementDetails142.mmSecuritiesTransactionType, SettlementDetails144.mmSecuritiesTransactionType, SettlementDetails141.mmSecuritiesTransactionType,
					SettlementDetails145.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent22Choice.mmSecuritiesTransactionType, SecuritiesTransactionType36Choice.mmCode, SecuritiesTransactionType36Choice.mmProprietary,
					SettlementDetails146.mmSecuritiesTransactionType, SecuritiesTransactionType37Choice.mmCode, SecuritiesTransactionType37Choice.mmProprietary, SettlementDetails143.mmSecuritiesTransactionType,
					SecuritiesTransactionType38Choice.mmCode, SecuritiesTransactionType38Choice.mmProprietary, SettlementOrCorporateActionEvent23Choice.mmSecuritiesTransactionType, SettlementDetails153.mmSecuritiesTransactionType,
					SecuritiesTransactionType39Choice.mmCode, SecuritiesTransactionType39Choice.mmProprietary, SettlementDetails155.mmSecuritiesTransactionType, SecuritiesTransactionType41Choice.mmCode,
					SecuritiesTransactionType41Choice.mmProprietary, SettlementDetails156.mmSecuritiesTransactionType, SecuritiesTransactionType42Choice.mmCode, SecuritiesTransactionType42Choice.mmProprietary,
					SettlementDetails157.mmSecuritiesTransactionType, SettlementDetails158.mmSecuritiesTransactionType, SettlementDetails160.mmSecuritiesTransactionType, SettlementOrCorporateActionEvent24Choice.mmSecuritiesTransactionType,
					SettlementOrCorporateActionEvent25Choice.mmSecuritiesTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Underlying information about the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getSecuritiesTransactionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "Street Side confirmation"}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTrade";
				definition = "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade, com.tools20022.repository.entity.SecuritiesQuantity.mmTrade,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmRelatedTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution, com.tools20022.repository.entity.SecuritiesTradePartyRole.mmSecuritiesTrade, com.tools20022.repository.entity.Allocation.mmSecuritiesTrade);
				derivationElement_lazy = () -> Arrays.asList(TransactionDetails41.mmTransactionDetails, TransactionDetails43.mmTransactionDetails, Transaction7.mmTransactionDetails, Transaction8.mmTransactionDetails,
						Transaction9.mmTransactionDetails, Transaction10.mmTransactionDetails, Transaction14.mmTransactionDetails, Transaction12.mmTransactionDetails, Transaction15.mmTransactionDetails, Transaction16.mmTransactionDetails,
						Transaction20.mmTransactionDetails, Transaction19.mmTransactionDetails, Transaction23.mmTransactionDetails, Transaction22.mmTransactionDetails, Transaction28.mmTransactionDetails, Transaction27.mmTransactionDetails,
						Transaction30.mmTransactionDetails, Transaction31.mmTransactionDetails, Transaction6.mmTransactionDetails, Transaction11.mmTransactionDetails, Transaction13.mmTransactionDetails, Transaction17.mmTransactionDetails,
						Transaction18.mmTransactionDetails, Transaction21.mmTransactionDetails, Transaction29.mmTransactionDetails, Transaction32.mmTransactionDetails, SecuritiesTradeDetails7.mmOtherAmounts,
						SecuritiesTradeDetails19.mmOtherAmounts, TransactionDetails13.mmTransactionDetails, SecuritiesTradeDetails4.mmOtherAmounts, SecuritiesTradeDetails17.mmOtherAmounts, TransactionDetails11.mmTransactionDetails,
						TransactionDetails21.mmTransactionDetails, SecuritiesTradeDetails10.mmOtherAmounts, SecuritiesTradeDetails22.mmOtherAmounts, SecuritiesTradeDetails23.mmOtherAmounts, SecuritiesTradeDetails29.mmOtherAmounts,
						TransactionDetails15.mmTransactionDetails, SecuritiesTradeDetails14.mmOtherAmounts, SecuritiesTradeDetails20.mmOtherAmounts, SecuritiesTradeDetails24.mmOtherAmounts, SecuritiesTradeDetails30.mmOtherAmounts,
						TradeLegStatement1.mmTradeLegsDetails, TradeLegStatement2.mmTradeLegsDetails, NetPosition1.mmTradeLegDetails, NetPosition2.mmTradeLegDetails, Transaction25.mmTransactionDetails, Transaction34.mmTransactionDetails,
						TransactionDetails64.mmTransactionDetails, Transaction35.mmTransactionDetails, Transaction36.mmTransactionDetails, SecuritiesTradeDetails35.mmOtherAmounts, Transaction38.mmTransactionDetails,
						TransactionDetails65.mmTransactionDetails, SecuritiesTradeDetails42.mmOtherAmounts, Transaction39.mmTransactionDetails, Transaction37.mmTransactionDetails, TradeLeg8.mmTradeRegistrationOrigin,
						Transaction41.mmTransactionDetails, Transaction40.mmTransactionDetails, TradeLegStatement3.mmTradeLegsDetails, NetPosition3.mmTradeLegDetails, TradeLeg10.mmTradeRegistrationOrigin,
						TradeLeg9.mmTradeRegistrationOrigin, Transaction43.mmTransactionDetails, Transaction42.mmTransactionDetails, SecuritiesTradeDetails49.mmOtherAmounts, Transaction47.mmTransactionDetails,
						TransactionDetails76.mmTransactionDetails, SecuritiesTradeDetails48.mmOtherAmounts, Transaction45.mmTransactionDetails, Transaction46.mmTransactionDetails, SecuritiesTradeDetails57.mmOtherAmounts,
						Transaction49.mmTransactionDetails, SecuritiesTradeDetails61.mmOtherAmounts, TransactionDetails85.mmTransactionDetails, Transaction50.mmTransactionDetails, Transaction48.mmTransactionDetails,
						Transaction51.mmTransactionDetails, Transaction53.mmTransactionDetails, SecuritiesTradeDetails68.mmOtherAmounts, Transaction54.mmTransactionDetails, Transaction52.mmTransactionDetails,
						SecuritiesTradeDetails69.mmOtherAmounts, Transaction57.mmTransactionDetails, Transaction56.mmTransactionDetails, Transaction55.mmTransactionDetails, TransactionDetails101.mmTransactionDetails,
						CommonTradeDataReport21.mmTransactionData, CommonTradeDataReport20.mmTransactionData, CommonTradeDataReport23.mmTransactionData, CommonTradeDataReport22.mmTransactionData, CommonTradeDataReport24.mmTransactionData,
						CommonTradeDataReport19.mmTransactionData, CommonTradeDataReport25.mmTransactionData, Transaction58.mmTransactionDetails, SecuritiesTradeDetails71.mmOtherAmounts, Transaction60.mmTransactionDetails,
						SecuritiesTradeDetails72.mmOtherAmounts, Transaction61.mmTransactionDetails, Transaction62.mmTransactionDetails, TransactionDetails106.mmTransactionDetails, SecuritiesTradeDetails81.mmOtherAmounts,
						SecuritiesTradeDetails85.mmOtherAmounts, TransactionDetails108.mmTransactionDetails, Transaction63.mmTransactionDetails, Transaction64.mmTransactionDetails, Transaction65.mmTransactionDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundTransaction.mmObject(), com.tools20022.repository.entity.SecuritiesFinancing.mmObject(), SecuritiesTransaction.mmObject(), SecuritiesOptionTrade.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAmount,
						com.tools20022.repository.entity.SecuritiesTrade.mmOpeningClosingIndicator, com.tools20022.repository.entity.SecuritiesTrade.mmTradeTransactionCondition,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTrade.mmActivity, com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradeOriginationDate, com.tools20022.repository.entity.SecuritiesTrade.mmClearingFeeType, com.tools20022.repository.entity.SecuritiesTrade.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice, com.tools20022.repository.entity.SecuritiesTrade.mmPartyRole, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAllocation, com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingOpeningData, com.tools20022.repository.entity.SecuritiesTrade.mmTransactionType,
						com.tools20022.repository.entity.SecuritiesTrade.mmLegalFramework, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTransactionType);
				derivationComponent_lazy = () -> Arrays.asList(TransactionDetails10.mmObject(), TransactionDetails29.mmObject(), TransactionDetails41.mmObject(), TradeTransactionCondition1Choice.mmObject(),
						SecuritiesTradeDetails25.mmObject(), OtherAmounts12.mmObject(), OtherAmounts14.mmObject(), SecuritiesTradeDetails26.mmObject(), TransactionDetails28.mmObject(), TransactionDetails31.mmObject(),
						TransactionDetails44.mmObject(), TransactionDetails43.mmObject(), TradeTransactionCondition2Choice.mmObject(), SecuritiesTradeDetails27.mmObject(), OtherAmounts20.mmObject(), SecuritiesTradeDetails28.mmObject(),
						AdditionalParameters3.mmObject(), AdditionalParameters7.mmObject(), AdditionalParameters8.mmObject(), AdditionalParameters9.mmObject(), AdditionalParameters10.mmObject(), AdditionalParameters11.mmObject(),
						AdditionalParameters2.mmObject(), LegalFramework1Choice.mmObject(), OtherAmounts4.mmObject(), AdditionalParameters6.mmObject(), LegalFramework2Choice.mmObject(), OtherAmounts5.mmObject(),
						AdditionalParameters12.mmObject(), OtherAmounts17.mmObject(), AdditionalParameters13.mmObject(), OtherAmounts23.mmObject(), AdditionalParameters18.mmObject(), AdditionalParameters19.mmObject(),
						OtherAmounts3.mmObject(), OtherAmounts7.mmObject(), TransactionDetails12.mmObject(), TransactionDetails19.mmObject(), UnilateralSplit1Choice.mmObject(), UnilateralSplit2Choice.mmObject(),
						SecuritiesTradeDetails2.mmObject(), SecuritiesTradeDetails16.mmObject(), OtherAmounts9.mmObject(), OtherAmounts10.mmObject(), OtherAmounts18.mmObject(), OtherAmounts24.mmObject(), AdditionalParameters17.mmObject(),
						AdditionalParameters20.mmObject(), SecuritiesTradeDetails1.mmObject(), SecuritiesTradeDetails15.mmObject(), OtherAmounts13.mmObject(), TransactionDetails5.mmObject(), TransactionDetails9.mmObject(),
						TransactionDetails22.mmObject(), TransactionDetails23.mmObject(), TransactionDetails36.mmObject(), TransactionDetails47.mmObject(), TransactionDetails53.mmObject(), TransactionDetails58.mmObject(),
						TransactionActivity1Choice.mmObject(), TransactionDetails7.mmObject(), Transaction7.mmObject(), TransactionDetails8.mmObject(), Transaction8.mmObject(), TransactionActivity2Choice.mmObject(),
						TransactionDetails16.mmObject(), Transaction9.mmObject(), TransactionDetails17.mmObject(), Transaction10.mmObject(), TransactionDetails26.mmObject(), Transaction14.mmObject(), TransactionDetails25.mmObject(),
						Transaction12.mmObject(), TransactionDetails27.mmObject(), Transaction15.mmObject(), TransactionDetails33.mmObject(), Transaction16.mmObject(), TransactionDetails39.mmObject(), Transaction20.mmObject(),
						Transaction19.mmObject(), TransactionDetails50.mmObject(), Transaction23.mmObject(), Transaction22.mmObject(), TransactionDetails56.mmObject(), Transaction28.mmObject(), Transaction27.mmObject(),
						TransactionDetails59.mmObject(), Transaction30.mmObject(), Transaction31.mmObject(), TransactionDetails6.mmObject(), Transaction6.mmObject(), TransactionDetails18.mmObject(), Transaction11.mmObject(),
						TransactionDetails24.mmObject(), Transaction13.mmObject(), TransactionDetails34.mmObject(), Transaction17.mmObject(), TransactionDetails37.mmObject(), Transaction18.mmObject(), TransactionDetails48.mmObject(),
						Transaction21.mmObject(), TransactionDetails57.mmObject(), Transaction29.mmObject(), TransactionDetails60.mmObject(), Transaction32.mmObject(), OtherAmounts1.mmObject(), TradeType3Choice.mmObject(),
						TradeTransactionCondition4Choice.mmObject(), OtherAmounts16.mmObject(), TwoLegTransactionType1Choice.mmObject(), TransactionDetails1.mmObject(), TransactionDetails3.mmObject(), TransactionDetails2.mmObject(),
						OtherAmounts2.mmObject(), SecuritiesTradeDetails7.mmObject(), SecuritiesTradeDetails19.mmObject(), TransactionDetails13.mmObject(), SecuritiesTradeDetails8.mmObject(), SecuritiesTradeDetails18.mmObject(),
						OtherAmounts8.mmObject(), SecuritiesTradeDetails4.mmObject(), SecuritiesTradeDetails17.mmObject(), AdditionalParameters4.mmObject(), TransactionDetails4.mmObject(), TransactionDetails30.mmObject(),
						TransactionDetails11.mmObject(), TransactionDetails20.mmObject(), TransactionDetails21.mmObject(), SecuritiesTradeDetails9.mmObject(), SecuritiesTradeDetails21.mmObject(), OtherAmounts11.mmObject(),
						SecuritiesTradeDetails10.mmObject(), SecuritiesTradeDetails22.mmObject(), SecuritiesTradeDetails23.mmObject(), SecuritiesTradeDetails29.mmObject(), TransactionDetails40.mmObject(), TransactionDetails42.mmObject(),
						TransactionDetails46.mmObject(), AdditionalParameters5.mmObject(), AdditionalParameters14.mmObject(), AdditionalParameters15.mmObject(), TransactionDetails15.mmObject(), TransactionDetails32.mmObject(),
						TransactionDetails14.mmObject(), TransactionDetails35.mmObject(), OtherAmounts6.mmObject(), SecuritiesTradeDetails14.mmObject(), SecuritiesTradeDetails20.mmObject(), OtherAmounts15.mmObject(),
						SecuritiesTradeDetails24.mmObject(), OtherAmounts22.mmObject(), SecuritiesTradeDetails30.mmObject(), TransactionDetails45.mmObject(), TradeLeg2.mmObject(), TradeLeg5.mmObject(), TradeLeg1.mmObject(),
						TradeLeg3.mmObject(), TradeLegStatement1.mmObject(), TradeLeg6.mmObject(), TradeLegStatement2.mmObject(), TradeLeg4.mmObject(), TradeLeg7.mmObject(), TransactionDetails51.mmObject(), Transaction25.mmObject(),
						TradeTransactionCondition3Choice.mmObject(), TransactionDetails52.mmObject(), AdditionalParameters16.mmObject(), TransactionDetails61.mmObject(), Transaction34.mmObject(), TransactionDetails64.mmObject(),
						Transaction35.mmObject(), TransactionDetails62.mmObject(), TransactionDetails63.mmObject(), Transaction36.mmObject(), SecuritiesTradeDetails31.mmObject(), SecuritiesTradeDetails33.mmObject(),
						SecuritiesTradeDetails35.mmObject(), SecuritiesTradeDetails36.mmObject(), SecuritiesTradeDetails34.mmObject(), SecuritiesTradeDetails32.mmObject(), SecuritiesTradeDetails44.mmObject(),
						SecuritiesTradeDetails43.mmObject(), SecuritiesTradeDetails41.mmObject(), Transaction38.mmObject(), TransactionDetails66.mmObject(), TransactionDetails65.mmObject(), SecuritiesTradeDetails42.mmObject(),
						TransactionDetails67.mmObject(), TransactionDetails68.mmObject(), Transaction39.mmObject(), SecuritiesTradeDetails46.mmObject(), SecuritiesTradeDetails47.mmObject(), Transaction37.mmObject(), TradeLeg8.mmObject(),
						Transaction41.mmObject(), TransactionDetails70.mmObject(), TransactionDetails69.mmObject(), Transaction40.mmObject(), TradeLegStatement3.mmObject(), TradeLeg10.mmObject(), TradeLeg9.mmObject(),
						Transaction43.mmObject(), TransactionDetails71.mmObject(), TransactionDetails72.mmObject(), Transaction42.mmObject(), TransactionDetails81.mmObject(), TransactionDetails74.mmObject(),
						SecuritiesTradeDetails49.mmObject(), Transaction47.mmObject(), TransactionDetails82.mmObject(), TransactionDetails76.mmObject(), TransactionDetails79.mmObject(), SecuritiesTradeDetails48.mmObject(),
						TransactionDetails80.mmObject(), Transaction45.mmObject(), TransactionDetails75.mmObject(), Transaction46.mmObject(), TransactionDetails78.mmObject(), OtherAmounts28.mmObject(), SecuritiesTradeDetails51.mmObject(),
						OtherAmounts30.mmObject(), AdditionalParameters23.mmObject(), SecuritiesTradeDetails53.mmObject(), AdditionalParameters24.mmObject(), OtherAmounts31.mmObject(), AdditionalParameters22.mmObject(),
						AdditionalParameters21.mmObject(), OtherAmounts32.mmObject(), SecuritiesTradeDetails54.mmObject(), LegalFramework3Choice.mmObject(), TransactionActivity3Choice.mmObject(),
						TradeTransactionCondition5Choice.mmObject(), SecuritiesTradeDetails52.mmObject(), OtherAmounts29.mmObject(), SecuritiesTradeDetails50.mmObject(), UnilateralSplit3Choice.mmObject(),
						SecuritiesTradeDetails57.mmObject(), OtherAmounts35.mmObject(), Transaction49.mmObject(), TransactionDetails88.mmObject(), OtherAmounts34.mmObject(), AdditionalParameters26.mmObject(),
						SecuritiesTradeDetails61.mmObject(), TransactionDetails92.mmObject(), TransactionDetails84.mmObject(), AdditionalParameters25.mmObject(), SecuritiesTradeDetails63.mmObject(), TransactionDetails83.mmObject(),
						AdditionalParameters28.mmObject(), OtherAmounts38.mmObject(), SecuritiesTradeDetails62.mmObject(), AdditionalParameters27.mmObject(), TransactionDetails85.mmObject(), TransactionDetails87.mmObject(),
						OtherAmounts36.mmObject(), SecuritiesTradeDetails60.mmObject(), OtherAmounts33.mmObject(), LegalFramework4Choice.mmObject(), TradeTransactionCondition6Choice.mmObject(), Transaction50.mmObject(),
						TransactionDetails91.mmObject(), UnilateralSplit4Choice.mmObject(), Transaction48.mmObject(), TransactionDetails90.mmObject(), TransactionActivity4Choice.mmObject(), SecuritiesTradeDetails65.mmObject(),
						SecuritiesTradeDetails66.mmObject(), TransactionDetails93.mmObject(), Transaction51.mmObject(), TradeTransactionCondition7Choice.mmObject(), TransactionDetails94.mmObject(), DerivativeCommodity2.mmObject(),
						AdditionalParameters29.mmObject(), AdditionalParameters30.mmObject(), SecuritiesTradeDetails67.mmObject(), Transaction53.mmObject(), SecuritiesTradeDetails68.mmObject(), TransactionDetails97.mmObject(),
						TransactionDetails96.mmObject(), Transaction54.mmObject(), Transaction52.mmObject(), TransactionDetails95.mmObject(), SecuritiesTradeDetails69.mmObject(), AdditionalParameters31.mmObject(), Transaction57.mmObject(),
						SecuritiesTradeDetails70.mmObject(), AdditionalParameters32.mmObject(), Transaction56.mmObject(), TransactionDetails100.mmObject(), TransactionDetails99.mmObject(), Transaction55.mmObject(),
						TransactionDetails98.mmObject(), TransactionDetails101.mmObject(), TradeTransaction15.mmObject(), TradeTransaction17.mmObject(), TradeTransaction14.mmObject(), TradeTransaction18.mmObject(),
						TradeTransaction16.mmObject(), Transaction58.mmObject(), TransactionDetails102.mmObject(), DerivativeUnderlyingLeg1.mmObject(), OtherAmounts41.mmObject(), SecuritiesTradeDetails71.mmObject(),
						OtherAmounts39.mmObject(), TransactionDetails105.mmObject(), OtherAmounts40.mmObject(), Transaction60.mmObject(), SecuritiesTradeDetails72.mmObject(), TransactionDetails104.mmObject(), Transaction61.mmObject(),
						TransactionDetails103.mmObject(), Transaction62.mmObject(), SecuritiesTradeDetails73.mmObject(), SecuritiesTradeDetails75.mmObject(), SecuritiesTradeDetails76.mmObject(), TransactionDetails106.mmObject(),
						TransactionDetails107.mmObject(), SecuritiesTradeDetails78.mmObject(), SecuritiesTradeDetails79.mmObject(), SecuritiesTradeDetails80.mmObject(), SecuritiesTradeDetails81.mmObject(), OtherAmounts42.mmObject(),
						OtherAmounts43.mmObject(), SecuritiesTradeDetails84.mmObject(), SecuritiesTradeDetails85.mmObject(), SecuritiesTradeDetails86.mmObject(), OtherAmounts44.mmObject(), SecuritiesTradeDetails87.mmObject(),
						SecuritiesTradeDetails88.mmObject(), TransactionDetails108.mmObject(), TransactionDetails109.mmObject(), SecuritiesTradeDetails89.mmObject(), SecuritiesTradeDetails90.mmObject(), TransactionDetails110.mmObject(),
						Transaction63.mmObject(), TransactionDetails111.mmObject(), Transaction64.mmObject(), Transaction65.mmObject(), TransactionDetails112.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesTradeIdentification> getSecuritiesTradeRelatedIdentifications() {
		return securitiesTradeRelatedIdentifications == null ? securitiesTradeRelatedIdentifications = new ArrayList<>() : securitiesTradeRelatedIdentifications;
	}

	public SecuritiesTrade setSecuritiesTradeRelatedIdentifications(List<com.tools20022.repository.entity.SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications) {
		this.securitiesTradeRelatedIdentifications = Objects.requireNonNull(securitiesTradeRelatedIdentifications);
		return this;
	}

	public CurrencyAndAmount getTradeAmount() {
		return tradeAmount;
	}

	public SecuritiesTrade setTradeAmount(CurrencyAndAmount tradeAmount) {
		this.tradeAmount = Objects.requireNonNull(tradeAmount);
		return this;
	}

	public OpeningClosingCode getOpeningClosingIndicator() {
		return openingClosingIndicator;
	}

	public SecuritiesTrade setOpeningClosingIndicator(OpeningClosingCode openingClosingIndicator) {
		this.openingClosingIndicator = Objects.requireNonNull(openingClosingIndicator);
		return this;
	}

	public TradeTransactionConditionCode getTradeTransactionCondition() {
		return tradeTransactionCondition;
	}

	public SecuritiesTrade setTradeTransactionCondition(TradeTransactionConditionCode tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public List<SecuritiesTradeStatus> getSecuritiesTradeStatus() {
		return securitiesTradeStatus == null ? securitiesTradeStatus = new ArrayList<>() : securitiesTradeStatus;
	}

	public SecuritiesTrade setSecuritiesTradeStatus(List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus) {
		this.securitiesTradeStatus = Objects.requireNonNull(securitiesTradeStatus);
		return this;
	}

	public TransactionActivityCode getActivity() {
		return activity;
	}

	public SecuritiesTrade setActivity(TransactionActivityCode activity) {
		this.activity = Objects.requireNonNull(activity);
		return this;
	}

	public List<SecuritiesQuantity> getTradeQuantity() {
		return tradeQuantity == null ? tradeQuantity = new ArrayList<>() : tradeQuantity;
	}

	public SecuritiesTrade setTradeQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> tradeQuantity) {
		this.tradeQuantity = Objects.requireNonNull(tradeQuantity);
		return this;
	}

	public ISODateTime getTradeOriginationDate() {
		return tradeOriginationDate;
	}

	public SecuritiesTrade setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = Objects.requireNonNull(tradeOriginationDate);
		return this;
	}

	public ClearingFeeTypeCode getClearingFeeType() {
		return clearingFeeType;
	}

	public SecuritiesTrade setClearingFeeType(ClearingFeeTypeCode clearingFeeType) {
		this.clearingFeeType = Objects.requireNonNull(clearingFeeType);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesTrade setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<SecuritiesPricing> getTradePrice() {
		return tradePrice == null ? tradePrice = new ArrayList<>() : tradePrice;
	}

	public SecuritiesTrade setTradePrice(List<com.tools20022.repository.entity.SecuritiesPricing> tradePrice) {
		this.tradePrice = Objects.requireNonNull(tradePrice);
		return this;
	}

	public List<SecuritiesTradePartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public SecuritiesTrade setPartyRole(List<com.tools20022.repository.entity.SecuritiesTradePartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancingClosingData() {
		return securitiesFinancingClosingData == null ? Optional.empty() : Optional.of(securitiesFinancingClosingData);
	}

	public SecuritiesTrade setSecuritiesFinancingClosingData(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancingClosingData) {
		this.securitiesFinancingClosingData = securitiesFinancingClosingData;
		return this;
	}

	public List<SecuritiesTradeExecution> getTradingExecution() {
		return tradingExecution == null ? tradingExecution = new ArrayList<>() : tradingExecution;
	}

	public SecuritiesTrade setTradingExecution(List<com.tools20022.repository.entity.SecuritiesTradeExecution> tradingExecution) {
		this.tradingExecution = Objects.requireNonNull(tradingExecution);
		return this;
	}

	public List<Allocation> getTradeAllocation() {
		return tradeAllocation == null ? tradeAllocation = new ArrayList<>() : tradeAllocation;
	}

	public SecuritiesTrade setTradeAllocation(List<com.tools20022.repository.entity.Allocation> tradeAllocation) {
		this.tradeAllocation = Objects.requireNonNull(tradeAllocation);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesTrade setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancingOpeningData() {
		return securitiesFinancingOpeningData == null ? Optional.empty() : Optional.of(securitiesFinancingOpeningData);
	}

	public SecuritiesTrade setSecuritiesFinancingOpeningData(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancingOpeningData) {
		this.securitiesFinancingOpeningData = securitiesFinancingOpeningData;
		return this;
	}

	public TradeTypeCode getTransactionType() {
		return transactionType;
	}

	public SecuritiesTrade setTransactionType(TradeTypeCode transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public LegalFrameworkCode getLegalFramework() {
		return legalFramework;
	}

	public SecuritiesTrade setLegalFramework(LegalFrameworkCode legalFramework) {
		this.legalFramework = Objects.requireNonNull(legalFramework);
		return this;
	}

	public SecuritiesTransactionTypeV2Code getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public SecuritiesTrade setSecuritiesTransactionType(SecuritiesTransactionTypeV2Code securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}
}