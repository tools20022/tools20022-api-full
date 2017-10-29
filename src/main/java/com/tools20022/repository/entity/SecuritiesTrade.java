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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.SecuritiesTradeRelatedIdentifications}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeAmount
 * SecuritiesTrade.TradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#OpeningClosingIndicator
 * SecuritiesTrade.OpeningClosingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeTransactionCondition
 * SecuritiesTrade.TradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTradeStatus
 * SecuritiesTrade.SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#Activity
 * SecuritiesTrade.Activity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeQuantity
 * SecuritiesTrade.TradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeOriginationDate
 * SecuritiesTrade.TradeOriginationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#ClearingFeeType
 * SecuritiesTrade.ClearingFeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#Security
 * SecuritiesTrade.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradePrice
 * SecuritiesTrade.TradePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#PartyRole
 * SecuritiesTrade.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingClosingData
 * SecuritiesTrade.SecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradingExecution
 * SecuritiesTrade.TradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradeAllocation
 * SecuritiesTrade.TradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#RelatedOrder
 * SecuritiesTrade.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesFinancingOpeningData
 * SecuritiesTrade.SecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TransactionType
 * SecuritiesTrade.TransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#LegalFramework
 * SecuritiesTrade.LegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#SecuritiesTransactionType
 * SecuritiesTrade.SecuritiesTransactionType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesTrade
 * Security.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTrade
 * SecuritiesPricing.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#IdentifiedTrade
 * SecuritiesTradeIdentification.IdentifiedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Trade
 * SecuritiesQuantity.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#RelatedTrade
 * SecuritiesTradeExecution.RelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SecuritiesTrade
 * SecuritiesTradeStatus.SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#ClosingLegExecution
 * SecuritiesFinancing.ClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#OpeningLegExecution
 * SecuritiesFinancing.OpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecution
 * SecuritiesOrder.OrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#SecuritiesTrade
 * SecuritiesTradePartyRole.SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#SecuritiesTrade
 * Allocation.SecuritiesTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#TransactionDetails
 * TransactionDetails41.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#TransactionDetails
 * TransactionDetails43.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction7#TransactionDetails
 * Transaction7.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction8#TransactionDetails
 * Transaction8.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction9#TransactionDetails
 * Transaction9.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction10#TransactionDetails
 * Transaction10.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction14#TransactionDetails
 * Transaction14.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction12#TransactionDetails
 * Transaction12.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction15#TransactionDetails
 * Transaction15.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction16#TransactionDetails
 * Transaction16.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction20#TransactionDetails
 * Transaction20.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction19#TransactionDetails
 * Transaction19.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction23#TransactionDetails
 * Transaction23.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction22#TransactionDetails
 * Transaction22.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction28#TransactionDetails
 * Transaction28.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction27#TransactionDetails
 * Transaction27.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction30#TransactionDetails
 * Transaction30.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction31#TransactionDetails
 * Transaction31.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction6#TransactionDetails
 * Transaction6.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction11#TransactionDetails
 * Transaction11.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction13#TransactionDetails
 * Transaction13.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction17#TransactionDetails
 * Transaction17.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction18#TransactionDetails
 * Transaction18.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction21#TransactionDetails
 * Transaction21.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction29#TransactionDetails
 * Transaction29.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction32#TransactionDetails
 * Transaction32.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#OtherAmounts
 * SecuritiesTradeDetails7.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#OtherAmounts
 * SecuritiesTradeDetails19.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#TransactionDetails
 * TransactionDetails13.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#OtherAmounts
 * SecuritiesTradeDetails4.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#OtherAmounts
 * SecuritiesTradeDetails17.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#TransactionDetails
 * TransactionDetails11.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#TransactionDetails
 * TransactionDetails21.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#OtherAmounts
 * SecuritiesTradeDetails10.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#OtherAmounts
 * SecuritiesTradeDetails22.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#OtherAmounts
 * SecuritiesTradeDetails23.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#OtherAmounts
 * SecuritiesTradeDetails29.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#TransactionDetails
 * TransactionDetails15.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#OtherAmounts
 * SecuritiesTradeDetails14.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#OtherAmounts
 * SecuritiesTradeDetails20.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#OtherAmounts
 * SecuritiesTradeDetails24.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#OtherAmounts
 * SecuritiesTradeDetails30.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement1#TradeLegsDetails
 * TradeLegStatement1.TradeLegsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement2#TradeLegsDetails
 * TradeLegStatement2.TradeLegsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition1#TradeLegDetails
 * NetPosition1.TradeLegDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition2#TradeLegDetails
 * NetPosition2.TradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction25#TransactionDetails
 * Transaction25.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction34#TransactionDetails
 * Transaction34.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#TransactionDetails
 * TransactionDetails64.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction35#TransactionDetails
 * Transaction35.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction36#TransactionDetails
 * Transaction36.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#OtherAmounts
 * SecuritiesTradeDetails35.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction38#TransactionDetails
 * Transaction38.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#TransactionDetails
 * TransactionDetails65.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#OtherAmounts
 * SecuritiesTradeDetails42.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction39#TransactionDetails
 * Transaction39.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction37#TransactionDetails
 * Transaction37.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#TradeRegistrationOrigin
 * TradeLeg8.TradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction41#TransactionDetails
 * Transaction41.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction40#TransactionDetails
 * Transaction40.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement3#TradeLegsDetails
 * TradeLegStatement3.TradeLegsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#TradeLegDetails
 * NetPosition3.TradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg10#TradeRegistrationOrigin
 * TradeLeg10.TradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#TradeRegistrationOrigin
 * TradeLeg9.TradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction43#TransactionDetails
 * Transaction43.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction42#TransactionDetails
 * Transaction42.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#OtherAmounts
 * SecuritiesTradeDetails49.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction47#TransactionDetails
 * Transaction47.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#TransactionDetails
 * TransactionDetails76.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#OtherAmounts
 * SecuritiesTradeDetails48.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction45#TransactionDetails
 * Transaction45.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction46#TransactionDetails
 * Transaction46.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#OtherAmounts
 * SecuritiesTradeDetails57.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction49#TransactionDetails
 * Transaction49.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#OtherAmounts
 * SecuritiesTradeDetails61.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#TransactionDetails
 * TransactionDetails85.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction50#TransactionDetails
 * Transaction50.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction48#TransactionDetails
 * Transaction48.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction53#TransactionDetails
 * Transaction53.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#OtherAmounts
 * SecuritiesTradeDetails68.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction54#TransactionDetails
 * Transaction54.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction52#TransactionDetails
 * Transaction52.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#OtherAmounts
 * SecuritiesTradeDetails69.OtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction57#TransactionDetails
 * Transaction57.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#TransactionDetails
 * Transaction56.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction55#TransactionDetails
 * Transaction55.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#TransactionDetails
 * TransactionDetails101.TransactionDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
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
 * "SecuritiesTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds."
 * </li>
 * </ul>
 */
public class SecuritiesTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the different identifications associated with a securities
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#IdentifiedTrade
	 * SecuritiesTradeIdentification.IdentifiedTrade}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Cancellation3Choice#CancellationByReference
	 * Cancellation3Choice.CancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation2Choice#Reference
	 * Cancellation2Choice.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#Identification
	 * IntraPositionMovementDetails1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#Identification
	 * IntraPositionMovementDetails2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#Identification
	 * IntraPositionMovementDetails5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#Identification
	 * IntraPositionMovementDetails6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#Identification
	 * IntraPositionMovementDetails7.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#Identification
	 * IntraPositionMovementDetails8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#Identification
	 * IntraPositionMovementDetails9.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#Identification
	 * IntraPositionMovementDetails10.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails1#Reference
	 * RequestDetails1.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails2#Reference
	 * RequestDetails2.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails6#Reference
	 * RequestDetails6.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails7#Reference
	 * RequestDetails7.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8#Reference
	 * RequestDetails8.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails9#Reference
	 * RequestDetails9.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails11#Reference
	 * RequestDetails11.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails12#Reference
	 * RequestDetails12.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#Identification
	 * IntraPositionMovementDetails3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#Identification
	 * IntraPositionMovementDetails4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#References
	 * IntraPositionQueryCriteria1.References}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails10#Reference
	 * RequestDetails10.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation2#TransactionIdentification
	 * IntraPositionCancellation2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#SecondLegIdentification
	 * SecuritiesFinancing1.SecondLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice#CancellationByReference
	 * Cancellation6Choice.CancellationByReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails13#Reference
	 * RequestDetails13.Reference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails14#Reference
	 * RequestDetails14.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation7Choice#CancellationByReference
	 * Cancellation7Choice.CancellationByReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails15#Reference
	 * RequestDetails15.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#Identification
	 * IntraPositionMovementDetails11.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation11Choice#CancellationByReference
	 * Cancellation11Choice.CancellationByReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails16#Reference
	 * RequestDetails16.Reference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#Identification
	 * IntraPositionMovementDetails12.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#Identification
	 * IntraPositionMovementDetails13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#Identification
	 * IntraPositionMovementDetails14.Identification}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Cancellation3Choice.CancellationByReference, com.tools20022.repository.choice.Cancellation2Choice.Reference,
					com.tools20022.repository.msg.IntraPositionMovementDetails1.Identification, com.tools20022.repository.msg.IntraPositionMovementDetails2.Identification,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.Identification, com.tools20022.repository.msg.IntraPositionMovementDetails6.Identification,
					com.tools20022.repository.msg.IntraPositionMovementDetails7.Identification, com.tools20022.repository.msg.IntraPositionMovementDetails8.Identification,
					com.tools20022.repository.msg.IntraPositionMovementDetails9.Identification, com.tools20022.repository.msg.IntraPositionMovementDetails10.Identification, com.tools20022.repository.msg.RequestDetails1.Reference,
					com.tools20022.repository.msg.RequestDetails2.Reference, com.tools20022.repository.msg.RequestDetails6.Reference, com.tools20022.repository.msg.RequestDetails7.Reference,
					com.tools20022.repository.msg.RequestDetails8.Reference, com.tools20022.repository.msg.RequestDetails9.Reference, com.tools20022.repository.msg.RequestDetails11.Reference,
					com.tools20022.repository.msg.RequestDetails12.Reference, com.tools20022.repository.msg.IntraPositionMovementDetails3.Identification, com.tools20022.repository.msg.IntraPositionMovementDetails4.Identification,
					com.tools20022.repository.msg.IntraPositionQueryCriteria1.References, com.tools20022.repository.msg.RequestDetails10.Reference, com.tools20022.repository.msg.IntraPositionCancellation2.TransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancing1.SecondLegIdentification, com.tools20022.repository.choice.Cancellation6Choice.CancellationByReference, com.tools20022.repository.msg.RequestDetails13.Reference,
					com.tools20022.repository.msg.RequestDetails14.Reference, com.tools20022.repository.choice.Cancellation7Choice.CancellationByReference, com.tools20022.repository.msg.RequestDetails15.Reference,
					com.tools20022.repository.msg.IntraPositionMovementDetails11.Identification, com.tools20022.repository.choice.Cancellation11Choice.CancellationByReference, com.tools20022.repository.msg.RequestDetails16.Reference,
					com.tools20022.repository.msg.IntraPositionMovementDetails12.Identification, com.tools20022.repository.msg.IntraPositionMovementDetails13.Identification,
					com.tools20022.repository.msg.IntraPositionMovementDetails14.Identification);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a securities trade.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradeIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.IdentifiedTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount of the trade. Is equal to the executed trade quantity
	 * multiplied by the executed trade price.
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
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#NetAmount
	 * DeliverInformation4.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#NetAmount
	 * DeliverInformation7.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#NetAmount
	 * ReceiveInformation4.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#NetAmount
	 * ReceiveInformation8.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#NetAmount
	 * ReceiveInformation6.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#NetAmount
	 * ReceiveInformation11.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#NetAmount
	 * DeliverInformation11.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts12#TradeAmount
	 * OtherAmounts12.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts14#TradeAmount
	 * OtherAmounts14.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts20#TradeAmount
	 * OtherAmounts20.TradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#NetAmount
	 * DeliverInformation3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#NetAmount
	 * DeliverInformation8.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#NetAmount
	 * ReceiveInformation3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#NetAmount
	 * ReceiveInformation7.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#NetAmount
	 * ReceiveInformation5.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#NetAmount
	 * ReceiveInformation9.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#NetAmount
	 * DeliverInformation5.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#NetAmount
	 * DeliverInformation9.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#NetAmount
	 * DeliverInformation6.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#TradeAmount
	 * OtherAmounts4.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#TradeAmount
	 * OtherAmounts5.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#TradeAmount
	 * OtherAmounts17.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#TradeAmount
	 * OtherAmounts23.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts3#TradeAmount
	 * OtherAmounts3.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#TradeAmount
	 * OtherAmounts7.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#TradeAmount
	 * OtherAmounts9.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#TradeAmount
	 * OtherAmounts10.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#TradeAmount
	 * OtherAmounts18.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#TradeAmount
	 * OtherAmounts24.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts13#TradeAmount
	 * OtherAmounts13.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts1#TradeAmount
	 * OtherAmounts1.TradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#GrossTradeAmount
	 * TwoLegTransactionDetails1.GrossTradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts8#TradeAmount
	 * OtherAmounts8.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts11#TradeAmount
	 * OtherAmounts11.TradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#NetAmount
	 * ReceiveInformation13.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#NetAmount
	 * ReceiveInformation12.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#NetAmount
	 * DeliverInformation12.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#NetAmount
	 * DeliverInformation13.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#NetAmount
	 * DeliverInformation15.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#NetAmount
	 * DeliverInformation14.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#NetAmount
	 * ReceiveInformation15.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#NetAmount
	 * ReceiveInformation14.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#NetAmount
	 * SecuritiesTransaction1.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#TradeAmount
	 * OtherAmounts28.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#TradeAmount
	 * OtherAmounts30.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#TradeAmount
	 * OtherAmounts31.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts32#TradeAmount
	 * OtherAmounts32.TradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#NetAmount
	 * ReceiveInformation17.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#NetAmount
	 * ReceiveInformation16.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#NetAmount
	 * DeliverInformation16.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#NetAmount
	 * DeliverInformation17.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts35#TradeAmount
	 * OtherAmounts35.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#TradeAmount
	 * OtherAmounts34.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#TradeAmount
	 * OtherAmounts38.TradeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts36#TradeAmount
	 * OtherAmounts36.TradeAmount}</li>
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
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.NetAmount, com.tools20022.repository.msg.DeliverInformation7.NetAmount, com.tools20022.repository.msg.ReceiveInformation4.NetAmount,
					com.tools20022.repository.msg.ReceiveInformation8.NetAmount, com.tools20022.repository.msg.ReceiveInformation6.NetAmount, com.tools20022.repository.msg.ReceiveInformation11.NetAmount,
					com.tools20022.repository.msg.DeliverInformation11.NetAmount, com.tools20022.repository.msg.OtherAmounts12.TradeAmount, com.tools20022.repository.msg.OtherAmounts14.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts20.TradeAmount, com.tools20022.repository.msg.DeliverInformation3.NetAmount, com.tools20022.repository.msg.DeliverInformation8.NetAmount,
					com.tools20022.repository.msg.ReceiveInformation3.NetAmount, com.tools20022.repository.msg.ReceiveInformation7.NetAmount, com.tools20022.repository.msg.ReceiveInformation5.NetAmount,
					com.tools20022.repository.msg.ReceiveInformation9.NetAmount, com.tools20022.repository.msg.DeliverInformation5.NetAmount, com.tools20022.repository.msg.DeliverInformation9.NetAmount,
					com.tools20022.repository.msg.DeliverInformation6.NetAmount, com.tools20022.repository.msg.OtherAmounts4.TradeAmount, com.tools20022.repository.msg.OtherAmounts5.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts17.TradeAmount, com.tools20022.repository.msg.OtherAmounts23.TradeAmount, com.tools20022.repository.msg.OtherAmounts3.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts7.TradeAmount, com.tools20022.repository.msg.OtherAmounts9.TradeAmount, com.tools20022.repository.msg.OtherAmounts10.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts18.TradeAmount, com.tools20022.repository.msg.OtherAmounts24.TradeAmount, com.tools20022.repository.msg.OtherAmounts13.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts1.TradeAmount, com.tools20022.repository.msg.TwoLegTransactionDetails1.GrossTradeAmount, com.tools20022.repository.msg.OtherAmounts8.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts11.TradeAmount, com.tools20022.repository.msg.ReceiveInformation13.NetAmount, com.tools20022.repository.msg.ReceiveInformation12.NetAmount,
					com.tools20022.repository.msg.DeliverInformation12.NetAmount, com.tools20022.repository.msg.DeliverInformation13.NetAmount, com.tools20022.repository.msg.DeliverInformation15.NetAmount,
					com.tools20022.repository.msg.DeliverInformation14.NetAmount, com.tools20022.repository.msg.ReceiveInformation15.NetAmount, com.tools20022.repository.msg.ReceiveInformation14.NetAmount,
					com.tools20022.repository.msg.SecuritiesTransaction1.NetAmount, com.tools20022.repository.msg.OtherAmounts28.TradeAmount, com.tools20022.repository.msg.OtherAmounts30.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts31.TradeAmount, com.tools20022.repository.msg.OtherAmounts32.TradeAmount, com.tools20022.repository.msg.ReceiveInformation17.NetAmount,
					com.tools20022.repository.msg.ReceiveInformation16.NetAmount, com.tools20022.repository.msg.DeliverInformation16.NetAmount, com.tools20022.repository.msg.DeliverInformation17.NetAmount,
					com.tools20022.repository.msg.OtherAmounts35.TradeAmount, com.tools20022.repository.msg.OtherAmounts34.TradeAmount, com.tools20022.repository.msg.OtherAmounts38.TradeAmount,
					com.tools20022.repository.msg.OtherAmounts36.TradeAmount);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAmount";
			definition = "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies additional information relative to the processing of the trade.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#OpeningClosing
	 * SecuritiesTradeDetails25.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#OpeningClosing
	 * SecuritiesTradeDetails26.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#OpeningClosing
	 * SecuritiesTradeDetails27.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#OpeningClosing
	 * SecuritiesTradeDetails28.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#OpeningClosing
	 * SecuritiesTradeDetails2.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#OpeningClosing
	 * SecuritiesTradeDetails16.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#OpeningClosing
	 * SecuritiesTradeDetails1.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#OpeningClosing
	 * SecuritiesTradeDetails15.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#OpeningClosing
	 * SecuritiesTradeDetails8.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#OpeningClosing
	 * SecuritiesTradeDetails4.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#OpeningClosing
	 * SecuritiesTradeDetails9.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#OpeningClosing
	 * SecuritiesTradeDetails10.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#OpeningClosing
	 * SecuritiesTradeDetails31.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#OpeningClosing
	 * SecuritiesTradeDetails33.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#OpeningClosing
	 * SecuritiesTradeDetails34.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#OpeningClosing
	 * SecuritiesTradeDetails32.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#OpeningClosing
	 * SecuritiesTradeDetails44.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#OpeningClosing
	 * SecuritiesTradeDetails43.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#OpeningClosing
	 * SecuritiesTradeDetails46.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#OpeningClosing
	 * SecuritiesTradeDetails47.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#OpeningClosing
	 * SecuritiesTradeDetails51.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#OpeningClosing
	 * SecuritiesTradeDetails53.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#OpeningClosing
	 * SecuritiesTradeDetails52.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#OpeningClosing
	 * SecuritiesTradeDetails50.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#OpeningClosing
	 * SecuritiesTradeDetails63.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#OpeningClosing
	 * SecuritiesTradeDetails62.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#OpeningClosing
	 * SecuritiesTradeDetails65.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#OpeningClosing
	 * SecuritiesTradeDetails66.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#OpeningClosing
	 * SecuritiesTradeDetails67.OpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#OpeningClosing
	 * SecuritiesTradeDetails70.OpeningClosing}</li>
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
	 * name} = "OpeningClosingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information relative to the processing of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OpeningClosingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails26.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails28.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails2.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails16.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails1.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails15.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails4.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails9.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails31.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails33.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails34.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails32.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails44.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails46.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails47.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails51.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails53.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails52.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails50.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails63.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails62.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails66.OpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails67.OpeningClosing,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.OpeningClosing);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingIndicator";
			definition = "Specifies additional information relative to the processing of the trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}
	};
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition1Choice#Code
	 * TradeTransactionCondition1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition1Choice#Proprietary
	 * TradeTransactionCondition1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#TradeTransactionCondition
	 * SecuritiesTradeDetails25.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#TradeTransactionCondition
	 * SecuritiesTradeDetails26.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition2Choice#Code
	 * TradeTransactionCondition2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition2Choice#Proprietary
	 * TradeTransactionCondition2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#TradeTransactionCondition
	 * SecuritiesTradeDetails27.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#TradeTransactionCondition
	 * SecuritiesTradeDetails28.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#TradeTransactionCondition
	 * SecuritiesTradeDetails6.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#TradeTransactionCondition
	 * SecuritiesTradeDetails13.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#TradeTransactionCondition
	 * SecuritiesTradeDetails3.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#TradeTransactionCondition
	 * SecuritiesTradeDetails11.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#TradeTransactionCondition
	 * SecuritiesTradeDetails2.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#TradeTransactionCondition
	 * SecuritiesTradeDetails16.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#TradeTransactionCondition
	 * SecuritiesTradeDetails1.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#TradeTransactionCondition
	 * SecuritiesTradeDetails15.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#TransactionConditions
	 * FinancialInstrumentStipulations.TransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#Code
	 * TradeTransactionCondition4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#Proprietary
	 * TradeTransactionCondition4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#TradeTransactionCondition
	 * Order16.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#TradeTransactionCondition
	 * Order14.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#TransactionConditions
	 * FinancialInstrumentStipulations2.TransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#TradeTransactionCondition
	 * SecuritiesTradeDetails8.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#TradeTransactionCondition
	 * SecuritiesTradeDetails18.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#TradeTransactionCondition
	 * SecuritiesTradeDetails4.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#TradeTransactionCondition
	 * SecuritiesTradeDetails17.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#TradeTransactionCondition
	 * SecuritiesTradeDetails9.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#TradeTransactionCondition
	 * SecuritiesTradeDetails21.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#TradeTransactionCondition
	 * SecuritiesTradeDetails10.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#TradeTransactionCondition
	 * SecuritiesTradeDetails22.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#TradeTransactionCondition
	 * SecuritiesTradeDetails23.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#TradeTransactionCondition
	 * SecuritiesTradeDetails29.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition3Choice#Code
	 * TradeTransactionCondition3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition3Choice#Proprietary
	 * TradeTransactionCondition3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#TransactionConditions
	 * Debt2.TransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#TradeTransactionConditionIndicator
	 * OrderParameters1.TradeTransactionConditionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#TradeTransactionCondition
	 * SecuritiesTradeDetails31.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#TradeTransactionCondition
	 * SecuritiesTradeDetails33.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#TradeTransactionCondition
	 * SecuritiesTradeDetails35.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#TradeTransactionCondition
	 * SecuritiesTradeDetails38.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#TradeTransactionCondition
	 * SecuritiesTradeDetails37.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#TradeTransactionCondition
	 * SecuritiesTradeDetails36.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#TradeTransactionCondition
	 * SecuritiesTradeDetails34.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#TradeTransactionCondition
	 * SecuritiesTradeDetails32.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#TradeTransactionCondition
	 * Order17.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#TradeTransactionCondition
	 * Order18.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#TradeTransactionCondition
	 * SecuritiesTradeDetails44.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#TradeTransactionCondition
	 * SecuritiesTradeDetails39.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#TradeTransactionCondition
	 * SecuritiesTradeDetails43.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#TradeTransactionCondition
	 * SecuritiesTradeDetails41.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#TradeTransactionCondition
	 * SecuritiesTradeDetails40.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#TradeTransactionCondition
	 * SecuritiesTradeDetails42.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#TradeTransactionCondition
	 * SecuritiesTradeDetails46.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#TradeTransactionCondition
	 * SecuritiesTradeDetails47.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#TradeTransactionCondition
	 * SecuritiesTradeDetails49.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#TradeTransactionCondition
	 * SecuritiesTradeDetails51.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#TradeTransactionCondition
	 * SecuritiesTradeDetails53.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#TradeTransactionCondition
	 * SecuritiesTradeDetails55.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#TradeTransactionCondition
	 * SecuritiesTradeDetails56.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#TradeTransactionCondition
	 * SecuritiesTradeDetails54.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#Code
	 * TradeTransactionCondition5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#Proprietary
	 * TradeTransactionCondition5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#TradeTransactionCondition
	 * SecuritiesTradeDetails52.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#TradeTransactionCondition
	 * SecuritiesTradeDetails50.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#TradeTransactionCondition
	 * SecuritiesTradeDetails59.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#TradeTransactionCondition
	 * SecuritiesTradeDetails58.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#TradeTransactionCondition
	 * SecuritiesTradeDetails61.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#TradeTransactionCondition
	 * SecuritiesTradeDetails63.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#TradeTransactionCondition
	 * SecuritiesTradeDetails62.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#TradeTransactionCondition
	 * SecuritiesTradeDetails60.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition6Choice#Code
	 * TradeTransactionCondition6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition6Choice#Proprietary
	 * TradeTransactionCondition6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#TradeTransactionCondition
	 * SecuritiesTradeDetails65.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#TradeTransactionCondition
	 * SecuritiesTradeDetails66.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#TradeTransactionCondition
	 * FundSettlementParameters11.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#TradeTransactionCondition
	 * FundSettlementParameters12.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#TradeTransactionCondition
	 * SecuritiesTradeDetails67.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#TradeTransactionCondition
	 * SecuritiesTradeDetails68.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#TradeTransactionCondition
	 * SecuritiesTradeDetails69.TradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#TradeTransactionCondition
	 * SecuritiesTradeDetails70.TradeTransactionCondition}</li>
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
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeTransactionCondition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeTransactionCondition1Choice.Code, com.tools20022.repository.choice.TradeTransactionCondition1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails25.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails26.TradeTransactionCondition,
					com.tools20022.repository.choice.TradeTransactionCondition2Choice.Code, com.tools20022.repository.choice.TradeTransactionCondition2Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails28.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails6.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails13.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails3.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails11.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails16.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails15.TradeTransactionCondition,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.TransactionConditions, com.tools20022.repository.choice.TradeTransactionCondition4Choice.Code,
					com.tools20022.repository.choice.TradeTransactionCondition4Choice.Proprietary, com.tools20022.repository.msg.Order16.TradeTransactionCondition, com.tools20022.repository.msg.Order14.TradeTransactionCondition,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.TransactionConditions, com.tools20022.repository.msg.SecuritiesTradeDetails8.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails18.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails4.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails9.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails21.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails10.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails23.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.TradeTransactionCondition, com.tools20022.repository.choice.TradeTransactionCondition3Choice.Code,
					com.tools20022.repository.choice.TradeTransactionCondition3Choice.Proprietary, com.tools20022.repository.msg.Debt2.TransactionConditions,
					com.tools20022.repository.msg.OrderParameters1.TradeTransactionConditionIndicator, com.tools20022.repository.msg.SecuritiesTradeDetails31.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails33.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails35.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails38.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails37.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails36.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails34.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.TradeTransactionCondition, com.tools20022.repository.msg.Order17.TradeTransactionCondition, com.tools20022.repository.msg.Order18.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails44.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails39.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails41.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails40.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails42.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails46.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails47.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails51.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails55.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails56.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails54.TradeTransactionCondition,
					com.tools20022.repository.choice.TradeTransactionCondition5Choice.Code, com.tools20022.repository.choice.TradeTransactionCondition5Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails50.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails58.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails63.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails60.TradeTransactionCondition,
					com.tools20022.repository.choice.TradeTransactionCondition6Choice.Code, com.tools20022.repository.choice.TradeTransactionCondition6Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails66.TradeTransactionCondition,
					com.tools20022.repository.msg.FundSettlementParameters11.TradeTransactionCondition, com.tools20022.repository.msg.FundSettlementParameters12.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails67.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails68.TradeTransactionCondition,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.TradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails70.TradeTransactionCondition);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeTransactionConditionCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#SecuritiesTrade
	 * SecuritiesTradeStatus.SecuritiesTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RequestDetails1#MatchingDenial
	 * RequestDetails1.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails2#MatchingDenial
	 * RequestDetails2.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails6#MatchingDenial
	 * RequestDetails6.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails7#MatchingDenial
	 * RequestDetails7.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8#MatchingDenial
	 * RequestDetails8.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails9#MatchingDenial
	 * RequestDetails9.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#MatchingDenial
	 * RequestDetails11.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#MatchingDenial
	 * RequestDetails12.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#StatusAndReason
	 * Transaction8.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#StatusAndReason
	 * Transaction10.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#StatusAndReason
	 * Transaction12.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#StatusAndReason
	 * Transaction16.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#StatusAndReason
	 * Transaction19.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#StatusAndReason
	 * Transaction22.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#StatusAndReason
	 * Transaction27.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#StatusAndReason
	 * Transaction31.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#ProcessingStatus
	 * IntraBalanceCancellation2.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#ProcessingStatus
	 * IntraBalanceCancellation1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#StatusAndReason
	 * Transaction25.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#ProcessingStatus
	 * IntraBalanceModification2.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#ProcessingStatus
	 * IntraBalanceModification1.ProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#StatusAndReason
	 * Transaction34.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#MatchingDenial
	 * RequestDetails13.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#StatusAndReason
	 * Transaction38.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#MatchingDenial
	 * RequestDetails14.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#StatusAndReason
	 * Transaction41.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#StatusAndReason
	 * Transaction43.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#StatusAndReason
	 * Transaction47.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#MatchingDenial
	 * RequestDetails15.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#StatusAndReason
	 * Transaction49.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#MatchingDenial
	 * RequestDetails16.MatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#StatusAndReason
	 * Transaction53.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#StatusAndReason
	 * Transaction57.StatusAndReason}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestDetails1.MatchingDenial, com.tools20022.repository.msg.RequestDetails2.MatchingDenial, com.tools20022.repository.msg.RequestDetails6.MatchingDenial,
					com.tools20022.repository.msg.RequestDetails7.MatchingDenial, com.tools20022.repository.msg.RequestDetails8.MatchingDenial, com.tools20022.repository.msg.RequestDetails9.MatchingDenial,
					com.tools20022.repository.msg.RequestDetails11.MatchingDenial, com.tools20022.repository.msg.RequestDetails12.MatchingDenial, com.tools20022.repository.msg.Transaction8.StatusAndReason,
					com.tools20022.repository.msg.Transaction10.StatusAndReason, com.tools20022.repository.msg.Transaction12.StatusAndReason, com.tools20022.repository.msg.Transaction16.StatusAndReason,
					com.tools20022.repository.msg.Transaction19.StatusAndReason, com.tools20022.repository.msg.Transaction22.StatusAndReason, com.tools20022.repository.msg.Transaction27.StatusAndReason,
					com.tools20022.repository.msg.Transaction31.StatusAndReason, com.tools20022.repository.msg.IntraBalanceCancellation2.ProcessingStatus, com.tools20022.repository.msg.IntraBalanceCancellation1.ProcessingStatus,
					com.tools20022.repository.msg.Transaction25.StatusAndReason, com.tools20022.repository.msg.IntraBalanceModification2.ProcessingStatus, com.tools20022.repository.msg.IntraBalanceModification1.ProcessingStatus,
					com.tools20022.repository.msg.Transaction34.StatusAndReason, com.tools20022.repository.msg.RequestDetails13.MatchingDenial, com.tools20022.repository.msg.Transaction38.StatusAndReason,
					com.tools20022.repository.msg.RequestDetails14.MatchingDenial, com.tools20022.repository.msg.Transaction41.StatusAndReason, com.tools20022.repository.msg.Transaction43.StatusAndReason,
					com.tools20022.repository.msg.Transaction47.StatusAndReason, com.tools20022.repository.msg.RequestDetails15.MatchingDenial, com.tools20022.repository.msg.Transaction49.StatusAndReason,
					com.tools20022.repository.msg.RequestDetails16.MatchingDenial, com.tools20022.repository.msg.Transaction53.StatusAndReason, com.tools20022.repository.msg.Transaction57.StatusAndReason);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Specifies the status of a trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of activity to which the trade relates.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity1Choice#Code
	 * TransactionActivity1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity1Choice#Proprietary
	 * TransactionActivity1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#TransactionActivity
	 * TransactionDetails7.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#TransactionActivity
	 * TransactionDetails8.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity2Choice#Code
	 * TransactionActivity2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity2Choice#Proprietary
	 * TransactionActivity2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#TransactionActivity
	 * TransactionDetails16.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#TransactionActivity
	 * TransactionDetails17.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#TransactionActivity
	 * TransactionDetails26.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#TransactionActivity
	 * TransactionDetails25.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#TransactionActivity
	 * TransactionDetails27.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#TransactionActivity
	 * TransactionDetails33.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#TransactionActivity
	 * TransactionDetails39.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#TransactionActivity
	 * TransactionDetails50.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#TransactionActivity
	 * TransactionDetails56.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#TransactionActivity
	 * TransactionDetails59.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#TransactionActivity
	 * TransactionDetails6.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#TransactionActivity
	 * TransactionDetails18.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#TransactionActivity
	 * TransactionDetails24.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#TransactionActivity
	 * TransactionDetails34.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#TransactionActivity
	 * TransactionDetails37.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#TransactionActivity
	 * TransactionDetails48.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#TransactionActivity
	 * TransactionDetails57.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#TransactionActivity
	 * TransactionDetails60.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#TransactionActivity
	 * TransactionDetails51.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#TransactionActivity
	 * TransactionDetails62.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#TransactionActivity
	 * TransactionDetails63.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#TransactionActivity
	 * TransactionDetails67.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#TransactionActivity
	 * TransactionDetails68.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#TransactionActivity
	 * TransactionDetails69.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#TransactionActivity
	 * TransactionDetails72.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#TransactionActivity
	 * TransactionDetails75.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#TransactionActivity
	 * TransactionDetails78.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#Code
	 * TransactionActivity3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#Proprietary
	 * TransactionActivity3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#TransactionActivity
	 * TransactionDetails91.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#TransactionActivity
	 * TransactionDetails90.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity4Choice#Code
	 * TransactionActivity4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity4Choice#Proprietary
	 * TransactionActivity4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#TransactionActivity
	 * TransactionDetails96.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#TransactionActivity
	 * TransactionDetails95.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#TransactionActivity
	 * TransactionDetails99.TransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#TransactionActivity
	 * TransactionDetails98.TransactionActivity}</li>
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
	public static final MMBusinessAttribute Activity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TransactionActivity1Choice.Code, com.tools20022.repository.choice.TransactionActivity1Choice.Proprietary,
					com.tools20022.repository.msg.TransactionDetails7.TransactionActivity, com.tools20022.repository.msg.TransactionDetails8.TransactionActivity, com.tools20022.repository.choice.TransactionActivity2Choice.Code,
					com.tools20022.repository.choice.TransactionActivity2Choice.Proprietary, com.tools20022.repository.msg.TransactionDetails16.TransactionActivity, com.tools20022.repository.msg.TransactionDetails17.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails26.TransactionActivity, com.tools20022.repository.msg.TransactionDetails25.TransactionActivity, com.tools20022.repository.msg.TransactionDetails27.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails33.TransactionActivity, com.tools20022.repository.msg.TransactionDetails39.TransactionActivity, com.tools20022.repository.msg.TransactionDetails50.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails56.TransactionActivity, com.tools20022.repository.msg.TransactionDetails59.TransactionActivity, com.tools20022.repository.msg.TransactionDetails6.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails18.TransactionActivity, com.tools20022.repository.msg.TransactionDetails24.TransactionActivity, com.tools20022.repository.msg.TransactionDetails34.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails37.TransactionActivity, com.tools20022.repository.msg.TransactionDetails48.TransactionActivity, com.tools20022.repository.msg.TransactionDetails57.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails60.TransactionActivity, com.tools20022.repository.msg.TransactionDetails51.TransactionActivity, com.tools20022.repository.msg.TransactionDetails62.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails63.TransactionActivity, com.tools20022.repository.msg.TransactionDetails67.TransactionActivity, com.tools20022.repository.msg.TransactionDetails68.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails69.TransactionActivity, com.tools20022.repository.msg.TransactionDetails72.TransactionActivity, com.tools20022.repository.msg.TransactionDetails75.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails78.TransactionActivity, com.tools20022.repository.choice.TransactionActivity3Choice.Code, com.tools20022.repository.choice.TransactionActivity3Choice.Proprietary,
					com.tools20022.repository.msg.TransactionDetails91.TransactionActivity, com.tools20022.repository.msg.TransactionDetails90.TransactionActivity, com.tools20022.repository.choice.TransactionActivity4Choice.Code,
					com.tools20022.repository.choice.TransactionActivity4Choice.Proprietary, com.tools20022.repository.msg.TransactionDetails96.TransactionActivity, com.tools20022.repository.msg.TransactionDetails95.TransactionActivity,
					com.tools20022.repository.msg.TransactionDetails99.TransactionActivity, com.tools20022.repository.msg.TransactionDetails98.TransactionActivity);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Activity";
			definition = "Specifies the type of activity to which the trade relates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionActivityCode.mmObject();
		}
	};
	/**
	 * Specifies the total quantity of a financial instrument involved in a
	 * trade. It is derived from the ordered quantity or from the quantity
	 * specified in a leg of a financing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Trade
	 * SecuritiesQuantity.Trade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#ExecutedTradeQuantity
	 * TransactionDetails1.ExecutedTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#TradeQuantity
	 * TradeLeg2.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#TradeQuantity
	 * TradeLeg5.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#TradeQuantity
	 * TradeLeg1.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#TradeQuantity
	 * TradeLeg3.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#TradeQuantity
	 * TradeLeg6.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#TradeQuantity
	 * TradeLeg4.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#TradeQuantity
	 * TradeLeg7.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#TradeQuantity
	 * TradeLeg8.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#TradeQuantity
	 * TradeLeg10.TradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#TradeQuantity
	 * TradeLeg9.TradeQuantity}</li>
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
	public static final MMBusinessAssociationEnd TradeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.TransactionDetails1.ExecutedTradeQuantity, com.tools20022.repository.msg.TradeLeg2.TradeQuantity, com.tools20022.repository.msg.TradeLeg5.TradeQuantity,
							com.tools20022.repository.msg.TradeLeg1.TradeQuantity, com.tools20022.repository.msg.TradeLeg3.TradeQuantity, com.tools20022.repository.msg.TradeLeg6.TradeQuantity,
							com.tools20022.repository.msg.TradeLeg4.TradeQuantity, com.tools20022.repository.msg.TradeLeg7.TradeQuantity, com.tools20022.repository.msg.TradeLeg8.TradeQuantity,
							com.tools20022.repository.msg.TradeLeg10.TradeQuantity, com.tools20022.repository.msg.TradeLeg9.TradeQuantity);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeQuantity";
			definition = "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the date and time of the agreement in principal between
	 * counter-parties prior to actual trade date. Used with fixed income for
	 * municipal new issue markets.
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
	 * {@linkplain com.tools20022.repository.msg.Order3#TradeOriginationDate
	 * Order3.TradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#TradeOriginationDate
	 * Order16.TradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#TradeOriginationDate
	 * Order14.TradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order9#TradeOriginationDate
	 * Order9.TradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order2#TradeOriginationDate
	 * Order2.TradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#TradeOriginationDate
	 * Order6.TradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.List2#TradeOriginationDateTime
	 * List2.TradeOriginationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#TradeOriginationDate
	 * Order17.TradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#TradeOriginationDate
	 * Order18.TradeOriginationDate}</li>
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
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeOriginationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.TradeOriginationDate, com.tools20022.repository.msg.Order16.TradeOriginationDate, com.tools20022.repository.msg.Order14.TradeOriginationDate,
					com.tools20022.repository.msg.Order9.TradeOriginationDate, com.tools20022.repository.msg.Order2.TradeOriginationDate, com.tools20022.repository.msg.Order6.TradeOriginationDate,
					com.tools20022.repository.msg.List2.TradeOriginationDateTime, com.tools20022.repository.msg.Order17.TradeOriginationDate, com.tools20022.repository.msg.Order18.TradeOriginationDate);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the type of fee for trade executions at an exchange.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#ClearingFeeType
	 * Order3.ClearingFeeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#ClearingFeeType
	 * Order9.ClearingFeeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#ClearingFeeType
	 * Order6.ClearingFeeType}</li>
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
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee for trade executions at an exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingFeeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.ClearingFeeType, com.tools20022.repository.msg.Order9.ClearingFeeType, com.tools20022.repository.msg.Order6.ClearingFeeType);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee for trade executions at an exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingFeeTypeCode.mmObject();
		}
	};
	/**
	 * Security involved in a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesTrade
	 * Security.SecuritiesTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#FinancialInstrumentDetails
	 * TransactionDetails1.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#FinancialInstrumentDetails
	 * TransactionDetails3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails7.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails19.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails4.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails17.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails10.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails22.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails23.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails29.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails14.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails20.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails24.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails30.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails35.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails42.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails49.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails48.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails57.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails61.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails68.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#FinancialInstrumentAttributes
	 * SecuritiesTradeDetails69.FinancialInstrumentAttributes}</li>
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
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails1.FinancialInstrumentDetails, com.tools20022.repository.msg.TransactionDetails3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails19.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails17.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails22.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails29.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails20.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails30.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails42.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails48.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails57.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails61.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.FinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesTradeDetails69.FinancialInstrumentAttributes);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security involved in a trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the executed trade price which is derived from the different
	 * deal prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTrade
	 * SecuritiesPricing.SecuritiesTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#ExecutedTradePrice
	 * TransactionDetails1.ExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#AverageDealPrice
	 * NetPosition1.AverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#AverageDealPrice
	 * NetPosition2.AverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#AverageDealPrice
	 * NetPosition3.AverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#Price
	 * SecuritiesTransaction1.Price}</li>
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
	public static final MMBusinessAssociationEnd TradePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails1.ExecutedTradePrice, com.tools20022.repository.msg.NetPosition1.AverageDealPrice,
					com.tools20022.repository.msg.NetPosition2.AverageDealPrice, com.tools20022.repository.msg.NetPosition3.AverageDealPrice, com.tools20022.repository.msg.SecuritiesTransaction1.Price);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePrice";
			definition = "Specifies the executed trade price which is derived from the different deal prices.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a securities trade and played by a party at
	 * that step in a securities transaction flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#SecuritiesTrade
	 * SecuritiesTradePartyRole.SecuritiesTrade}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#OtherBusinessParties
	 * SecuritiesTradeDetails7.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#OtherBusinessParties
	 * SecuritiesTradeDetails19.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#OtherBusinessParties
	 * SecuritiesTradeDetails4.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#OtherBusinessParties
	 * SecuritiesTradeDetails17.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#OtherBusinessParties
	 * SecuritiesTradeDetails10.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#OtherBusinessParties
	 * SecuritiesTradeDetails22.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#OtherBusinessParties
	 * SecuritiesTradeDetails23.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#OtherBusinessParties
	 * SecuritiesTradeDetails29.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#OtherBusinessParties
	 * SecuritiesTradeDetails14.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#OtherBusinessParties
	 * SecuritiesTradeDetails20.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#OtherBusinessParties
	 * SecuritiesTradeDetails24.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#OtherBusinessParties
	 * SecuritiesTradeDetails30.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#OtherBusinessParties
	 * OrderStatusAndReason5.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#OtherBusinessParties
	 * SecuritiesTradeDetails35.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#OtherBusinessParties
	 * SecuritiesTradeDetails42.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#OtherBusinessParties
	 * SecuritiesTradeDetails49.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#OtherBusinessParties
	 * SecuritiesTradeDetails48.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#OtherBusinessParties
	 * SecuritiesTradeDetails57.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#OtherBusinessParties
	 * SecuritiesTradeDetails61.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#OtherBusinessParties
	 * SecuritiesTradeDetails68.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#OtherBusinessParties
	 * SecuritiesTradeDetails69.OtherBusinessParties}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails7.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails19.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails17.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails22.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails29.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails20.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails30.OtherBusinessParties,
					com.tools20022.repository.msg.OrderStatusAndReason5.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails35.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails49.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails48.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails57.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.OtherBusinessParties, com.tools20022.repository.msg.SecuritiesTradeDetails68.OtherBusinessParties,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.OtherBusinessParties);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financing process for which a closing leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#ClosingLegExecution
	 * SecuritiesFinancing.ClosingLegExecution}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails4.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails17.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails10.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails22.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails23.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails29.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails35.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails42.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails49.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails61.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails68.SecuritiesFinancingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#SecuritiesFinancingDetails
	 * SecuritiesTradeDetails69.SecuritiesFinancingDetails}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesFinancingClosingData = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails4.SecuritiesFinancingDetails, com.tools20022.repository.msg.SecuritiesTradeDetails17.SecuritiesFinancingDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.SecuritiesFinancingDetails, com.tools20022.repository.msg.SecuritiesTradeDetails22.SecuritiesFinancingDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.SecuritiesFinancingDetails, com.tools20022.repository.msg.SecuritiesTradeDetails29.SecuritiesFinancingDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.SecuritiesFinancingDetails, com.tools20022.repository.msg.SecuritiesTradeDetails42.SecuritiesFinancingDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.SecuritiesFinancingDetails, com.tools20022.repository.msg.SecuritiesTradeDetails61.SecuritiesFinancingDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.SecuritiesFinancingDetails, com.tools20022.repository.msg.SecuritiesTradeDetails69.SecuritiesFinancingDetails);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingClosingData";
			definition = "Financing process for which a closing leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.ClosingLegExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The realisation of the trade over one or more transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#RelatedTrade
	 * SecuritiesTradeExecution.RelatedTrade}</li>
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
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice#OffMarket
	 * PlaceOfTradeIdentification2Choice.OffMarket}</li>
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
	public static final MMBusinessAssociationEnd TradingExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice.OffMarket);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingExecution";
			definition = "The realisation of the trade over one or more transactions.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.RelatedTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the allocation of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#SecuritiesTrade
	 * Allocation.SecuritiesTrade}</li>
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
	public static final MMBusinessAssociationEnd TradeAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAllocation";
			definition = "Information about the allocation of the trade.";
			minOccurs = 0;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.SecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order which is executed by a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderExecution
	 * SecuritiesOrder.OrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#OrderTransmission
	 * SecuritiesTransactionReport4.OrderTransmission}</li>
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
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTransactionReport4.OrderTransmission);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed by a trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financing process for which an opening leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#OpeningLegExecution
	 * SecuritiesFinancing.OpeningLegExecution}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesFinancingOpeningData = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingOpeningData";
			definition = "Financing process for which an opening leg is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.OpeningLegExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the type of transaction of which the order is a component.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.TradeType3Choice#Code
	 * TradeType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeType3Choice#Proprietary
	 * TradeType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#TradeTransactionType
	 * Order16.TradeTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#TradeTransactionType
	 * Order14.TradeTransactionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#TradeType
	 * TradeLeg2.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#TradeType
	 * TradeLeg5.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#TradeType
	 * TradeLeg1.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#TradeType
	 * TradeLeg3.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#TradeType
	 * TradeLeg6.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#TradeType
	 * TradeLeg4.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#TradeType
	 * TradeLeg7.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#TradeType
	 * Bid1.TradeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#TradeTransactionType
	 * Order17.TradeTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#TradeTransactionType
	 * Order18.TradeTransactionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#TradeType
	 * TradeLeg8.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#TradeType
	 * TradeLeg10.TradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#TradeType
	 * TradeLeg9.TradeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#TransactionType
	 * UnsecuredMarketTransaction1.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#TransactionType
	 * OvernightIndexSwapTransaction1.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#TransactionType
	 * SecuredMarketTransaction1.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#DerivativeNotionalChange
	 * SecuritiesTransaction1.DerivativeNotionalChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#TransactionType
	 * UnsecuredMarketTransaction2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#TransactionType
	 * SecuredMarketTransaction2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#TransactionType
	 * UnsecuredMarketTransaction3.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#TransactionType
	 * OvernightIndexSwapTransaction3.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#TransactionType
	 * SecuredMarketTransaction3.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#TransactionType
	 * DerivativeCommodity2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#TransactionType
	 * SecuredMarketTransaction4.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#TransactionType
	 * OvernightIndexSwapTransaction4.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#TransactionType
	 * UnsecuredMarketTransaction4.TransactionType}</li>
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
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction of which the order is a component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeType3Choice.Code, com.tools20022.repository.choice.TradeType3Choice.Proprietary, com.tools20022.repository.msg.Order16.TradeTransactionType,
					com.tools20022.repository.msg.Order14.TradeTransactionType, com.tools20022.repository.msg.TradeLeg2.TradeType, com.tools20022.repository.msg.TradeLeg5.TradeType, com.tools20022.repository.msg.TradeLeg1.TradeType,
					com.tools20022.repository.msg.TradeLeg3.TradeType, com.tools20022.repository.msg.TradeLeg6.TradeType, com.tools20022.repository.msg.TradeLeg4.TradeType, com.tools20022.repository.msg.TradeLeg7.TradeType,
					com.tools20022.repository.msg.Bid1.TradeType, com.tools20022.repository.msg.Order17.TradeTransactionType, com.tools20022.repository.msg.Order18.TradeTransactionType, com.tools20022.repository.msg.TradeLeg8.TradeType,
					com.tools20022.repository.msg.TradeLeg10.TradeType, com.tools20022.repository.msg.TradeLeg9.TradeType, com.tools20022.repository.msg.UnsecuredMarketTransaction1.TransactionType,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.TransactionType, com.tools20022.repository.msg.SecuredMarketTransaction1.TransactionType,
					com.tools20022.repository.msg.SecuritiesTransaction1.DerivativeNotionalChange, com.tools20022.repository.msg.UnsecuredMarketTransaction2.TransactionType,
					com.tools20022.repository.msg.SecuredMarketTransaction2.TransactionType, com.tools20022.repository.msg.UnsecuredMarketTransaction3.TransactionType,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction3.TransactionType, com.tools20022.repository.msg.SecuredMarketTransaction3.TransactionType, com.tools20022.repository.msg.DerivativeCommodity2.TransactionType,
					com.tools20022.repository.msg.SecuredMarketTransaction4.TransactionType, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.TransactionType,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.TransactionType);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Indicates the type of transaction of which the order is a component.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeTypeCode.mmObject();
		}
	};
	/**
	 * Legal framework of the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.LegalFramework1Choice#Code
	 * LegalFramework1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework1Choice#Proprietary
	 * LegalFramework1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#LegalFramework
	 * SecuritiesFinancingTransactionDetails3.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework2Choice#Code
	 * LegalFramework2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework2Choice#Proprietary
	 * LegalFramework2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#LegalFramework
	 * SecuritiesFinancingTransactionDetails5.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#LegalFramework
	 * SecuritiesFinancingTransactionDetails1.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#LegalFramework
	 * SecuritiesFinancingTransactionDetails11.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#LegalFramework
	 * SecuritiesFinancingTransactionDetails14.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#LegalFramework
	 * SecuritiesFinancingTransactionDetails4.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#LegalFramework
	 * SecuritiesFinancing10.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#LegalFramework
	 * SecuritiesFinancingTransactionDetails7.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#LegalFramework
	 * SecuritiesFinancingTransactionDetails19.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#LegalFramework
	 * SecuritiesFinancingTransactionDetails20.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#LegalFramework
	 * SecuritiesFinancingTransactionDetails9.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#LegalFramework
	 * SecuritiesFinancing1.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#LegalFramework
	 * SecuritiesFinancingTransactionDetails28.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#LegalFramework
	 * SecuritiesFinancingTransactionDetails27.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#LegalFramework
	 * SecuritiesFinancingTransactionDetails29.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#Code
	 * LegalFramework3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#Proprietary
	 * LegalFramework3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#LegalFramework
	 * SecuritiesFinancingTransactionDetails32.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#LegalFramework
	 * SecuritiesFinancingTransactionDetails30.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#LegalFramework
	 * SecuritiesFinancingTransactionDetails34.LegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework4Choice#Code
	 * LegalFramework4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework4Choice#Proprietary
	 * LegalFramework4Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute LegalFramework = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LegalFramework1Choice.Code, com.tools20022.repository.choice.LegalFramework1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.LegalFramework, com.tools20022.repository.choice.LegalFramework2Choice.Code, com.tools20022.repository.choice.LegalFramework2Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.LegalFramework,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.LegalFramework,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancing10.LegalFramework,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.LegalFramework,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.LegalFramework,
					com.tools20022.repository.msg.SecuritiesFinancing1.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.LegalFramework,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.LegalFramework,
					com.tools20022.repository.choice.LegalFramework3Choice.Code, com.tools20022.repository.choice.LegalFramework3Choice.Proprietary, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.LegalFramework,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.LegalFramework, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.LegalFramework,
					com.tools20022.repository.choice.LegalFramework4Choice.Code, com.tools20022.repository.choice.LegalFramework4Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LegalFrameworkCode.mmObject();
		}
	};
	/**
	 * Underlying information about the settlement transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType1Choice#Code
	 * SecuritiesTransactionType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType1Choice#Proprietary
	 * SecuritiesTransactionType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType9Choice#Code
	 * SecuritiesTransactionType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType9Choice#Proprietary
	 * SecuritiesTransactionType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#SecuritiesTransactionType
	 * SettlementDetails50.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType16Choice#Code
	 * SecuritiesTransactionType16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType16Choice#Proprietary
	 * SecuritiesTransactionType16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#SecuritiesTransactionType
	 * SettlementDetails51.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters3.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters6.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters1.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters4.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit1Choice#Code
	 * UnilateralSplit1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit1Choice#Proprietary
	 * UnilateralSplit1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit2Choice#Code
	 * UnilateralSplit2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit2Choice#Proprietary
	 * UnilateralSplit2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType3Choice#Code
	 * SecuritiesTransactionType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType3Choice#Proprietary
	 * SecuritiesTransactionType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#SecuritiesTransactionType
	 * SettlementDetails6.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType6Choice#Code
	 * SecuritiesTransactionType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType6Choice#Proprietary
	 * SecuritiesTransactionType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#SecuritiesTransactionType
	 * SettlementDetails20.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#SecuritiesTransactionType
	 * SettlementDetails24.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#SecuritiesTransactionType
	 * SettlementDetails33.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType10Choice#Code
	 * SecuritiesTransactionType10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType10Choice#Proprietary
	 * SecuritiesTransactionType10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#SecuritiesTransactionType
	 * SettlementDetails45.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType13Choice#Code
	 * SecuritiesTransactionType13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType13Choice#Proprietary
	 * SecuritiesTransactionType13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#SecuritiesTransactionType
	 * SettlementDetails54.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#SecuritiesTransactionType
	 * SettlementDetails1.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType4Choice#Code
	 * SecuritiesTransactionType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType4Choice#Proprietary
	 * SecuritiesTransactionType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#SecuritiesTransactionType
	 * SettlementDetails19.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#SecuritiesTransactionType
	 * SettlementDetails22.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#SecuritiesTransactionType
	 * SettlementDetails35.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#SecuritiesTransactionType
	 * SettlementDetails42.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#SecuritiesTransactionType
	 * SettlementDetails52.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#SecuritiesTransactionType
	 * SettlementDetails8.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#SecuritiesTransactionType
	 * SettlementDetails11.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#SecuritiesTransactionType
	 * SettlementDetails23.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#SecuritiesTransactionType
	 * SettlementDetails37.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#SecuritiesTransactionType
	 * SettlementDetails44.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#SecuritiesTransactionType
	 * SettlementDetails53.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType2Choice#Code
	 * SecuritiesTransactionType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType2Choice#Proprietary
	 * SecuritiesTransactionType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent2Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent2Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType5Choice#Code
	 * SecuritiesTransactionType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType5Choice#Proprietary
	 * SecuritiesTransactionType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent3Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent3Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType11Choice#Code
	 * SecuritiesTransactionType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType11Choice#Proprietary
	 * SecuritiesTransactionType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent6Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent6Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType14Choice#Code
	 * SecuritiesTransactionType14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType14Choice#Proprietary
	 * SecuritiesTransactionType14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent8Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent8Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent10Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent11Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent1Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent1Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent4Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent4Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent5Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent5Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent7Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent7Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent9Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent9Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent12Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent12Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#SettlementTransactionType
	 * SettlementDetails43.SettlementTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters2.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters7.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails2.SecuritiesFinancingTransactionType
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails8.SecuritiesFinancingTransactionType
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#SecuritiesTransactionType
	 * SettlementDetails5.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType7Choice#Code
	 * SecuritiesTransactionType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType7Choice#Proprietary
	 * SecuritiesTransactionType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#SecuritiesTransactionType
	 * SettlementDetails25.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#SecuritiesTransactionType
	 * SettlementDetails26.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters5.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters8.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails6.SecuritiesFinancingTransactionType
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails10.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails17.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails18.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#SecuritiesTransactionType
	 * SettlementDetails15.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType8Choice#Code
	 * SecuritiesTransactionType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType8Choice#Proprietary
	 * SecuritiesTransactionType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#SecuritiesTransactionType
	 * SettlementDetails34.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType12Choice#Code
	 * SecuritiesTransactionType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType12Choice#Proprietary
	 * SecuritiesTransactionType12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#SecuritiesTransactionType
	 * SettlementDetails49.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType15Choice#Code
	 * SecuritiesTransactionType15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType15Choice#Proprietary
	 * SecuritiesTransactionType15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#SecuritiesTransactionType
	 * SettlementDetails58.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#SecuritiesTransactionType
	 * SettlementDetails36.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#SecuritiesTransactionType
	 * SettlementDetails67.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#SecuritiesTransactionType
	 * SettlementDetails70.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#SecuritiesTransactionType
	 * SettlementDetails68.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#SecuritiesTransactionType
	 * SettlementDetails69.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails21.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#SecuritiesTransactionType
	 * SettlementDetails81.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#SecuritiesTransactionType
	 * SettlementDetails80.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails22.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#SecuritiesTransactionType
	 * SettlementDetails83.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#SecuritiesTransactionType
	 * SettlementDetails85.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails24.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails25.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#TransactionType
	 * ForeignExchangeSwapTransaction1.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails26.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#SecuritiesTransactionType
	 * SettlementDetails93.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#SecuritiesTransactionType
	 * SettlementDetails90.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters10.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters9.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters11.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#SecuritiesTransactionType
	 * SettlementDetails99.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent14Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType19Choice#Code
	 * SecuritiesTransactionType19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType19Choice#Proprietary
	 * SecuritiesTransactionType19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#SecuritiesTransactionType
	 * SettlementDetails94.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice#Code
	 * SecuritiesTransactionType18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice#Proprietary
	 * SecuritiesTransactionType18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#SecuritiesTransactionType
	 * SettlementDetails95.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#Code
	 * UnilateralSplit3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#Proprietary
	 * UnilateralSplit3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType20Choice#Code
	 * SecuritiesTransactionType20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType20Choice#Proprietary
	 * SecuritiesTransactionType20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent13Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType21Choice#Code
	 * SecuritiesTransactionType21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType21Choice#Proprietary
	 * SecuritiesTransactionType21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#SecuritiesTransactionType
	 * SettlementDetails101.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters13.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails33.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters14.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters12.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#SecuritiesTransactionType
	 * SettlementDetails111.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#SecuritiesTransactionType
	 * SettlementDetails112.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#SecuritiesTransactionType
	 * SettlementDetails110.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#SecuritiesTransactionType
	 * SettlementDetails108.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType30Choice#Code
	 * SecuritiesTransactionType30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType30Choice#Proprietary
	 * SecuritiesTransactionType30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#SecuritiesTransactionType
	 * SettlementDetails115.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit4Choice#Code
	 * UnilateralSplit4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit4Choice#Proprietary
	 * UnilateralSplit4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType24Choice#Code
	 * SecuritiesTransactionType24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType24Choice#Proprietary
	 * SecuritiesTransactionType24Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent16Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent16Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType25Choice#Code
	 * SecuritiesTransactionType25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType25Choice#Proprietary
	 * SecuritiesTransactionType25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent15Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent15Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#SecuritiesTransactionType
	 * SettlementDetails113.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType22Choice#Code
	 * SecuritiesTransactionType22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType22Choice#Proprietary
	 * SecuritiesTransactionType22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#TransactionType
	 * ForeignExchangeSwapTransaction2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#SecuritiesTransactionType
	 * SettlementDetails128.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#SecuritiesTransactionType
	 * SettlementDetails120.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#SecuritiesTransactionType
	 * SettlementDetails119.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#SecuritiesTransactionType
	 * SettlementDetails125.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters15.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters17.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters16.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails35.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType33Choice#Code
	 * SecuritiesTransactionType33Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType33Choice#Proprietary
	 * SecuritiesTransactionType33Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent19Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#SecuritiesTransactionType
	 * SettlementDetails122.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent17Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType32Choice#Code
	 * SecuritiesTransactionType32Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType32Choice#Proprietary
	 * SecuritiesTransactionType32Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#SecuritiesTransactionType
	 * SettlementDetails121.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters19.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#SecuritiesTransactionType
	 * SettlementDetails134.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters20.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18#SecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters18.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#SecuritiesTransactionType
	 * SettlementDetails137.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#SecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails36.
	 * SecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#SecuritiesTransactionType
	 * SettlementDetails132.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType34Choice#Code
	 * SecuritiesTransactionType34Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType34Choice#Proprietary
	 * SecuritiesTransactionType34Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#SecuritiesTransactionType
	 * SettlementDetails138.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#SecuritiesTransactionType
	 * SettlementDetails131.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent20Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType35Choice#Code
	 * SecuritiesTransactionType35Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType35Choice#Proprietary
	 * SecuritiesTransactionType35Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent21Choice#SecuritiesTransactionType
	 * SettlementOrCorporateActionEvent21Choice.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#SecuritiesTransactionType
	 * SettlementDetails133.SecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#TransactionType
	 * ForeignExchangeSwapTransaction3.TransactionType}</li>
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
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying information about the settlement transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesTransactionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesTransactionType1Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType1Choice.Proprietary,
					com.tools20022.repository.choice.SecuritiesTransactionType9Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType9Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails50.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType16Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType16Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails51.SecuritiesTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters1.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters4.SecuritiesFinancingTransactionType,
					com.tools20022.repository.choice.UnilateralSplit1Choice.Code, com.tools20022.repository.choice.UnilateralSplit1Choice.Proprietary, com.tools20022.repository.choice.UnilateralSplit2Choice.Code,
					com.tools20022.repository.choice.UnilateralSplit2Choice.Proprietary, com.tools20022.repository.choice.SecuritiesTransactionType3Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails6.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType6Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType6Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails20.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails24.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails33.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType10Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType10Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails45.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType13Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType13Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails54.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails1.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType4Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails19.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails22.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails35.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails42.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails52.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails8.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails11.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails23.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails37.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails44.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails53.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType2Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType2Choice.Proprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent2Choice.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType5Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType5Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent3Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType11Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType11Choice.Proprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent6Choice.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType14Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType14Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent8Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent10Choice.SecuritiesTransactionType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent1Choice.SecuritiesTransactionType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent4Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent5Choice.SecuritiesTransactionType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent7Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent9Choice.SecuritiesTransactionType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent12Choice.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails43.SettlementTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SettlementDetails5.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType7Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType7Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails25.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails26.SecuritiesTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SettlementDetails15.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType8Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType8Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails34.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType12Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType12Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails49.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType15Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType15Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails58.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails36.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails67.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails70.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails68.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails69.SecuritiesTransactionType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SettlementDetails81.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails80.SecuritiesTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SettlementDetails83.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails85.SecuritiesTransactionType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.TransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SettlementDetails93.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails90.SecuritiesTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters9.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SettlementDetails99.SecuritiesTransactionType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent14Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType19Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType19Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails94.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType18Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType18Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails95.SecuritiesTransactionType, com.tools20022.repository.choice.UnilateralSplit3Choice.Code,
					com.tools20022.repository.choice.UnilateralSplit3Choice.Proprietary, com.tools20022.repository.choice.SecuritiesTransactionType20Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType20Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType21Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType21Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails101.SecuritiesTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SettlementDetails111.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails112.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails110.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails108.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType30Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType30Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails115.SecuritiesTransactionType, com.tools20022.repository.choice.UnilateralSplit4Choice.Code,
					com.tools20022.repository.choice.UnilateralSplit4Choice.Proprietary, com.tools20022.repository.choice.SecuritiesTransactionType24Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType24Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent16Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType25Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType25Choice.Proprietary,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent15Choice.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails113.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType22Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType22Choice.Proprietary,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.TransactionType, com.tools20022.repository.msg.SettlementDetails128.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails120.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails119.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails125.SecuritiesTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.SecuritiesFinancingTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType33Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType33Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails122.SecuritiesTransactionType, com.tools20022.repository.choice.SettlementOrCorporateActionEvent17Choice.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType32Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType32Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails121.SecuritiesTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.SettlementDetails134.SecuritiesTransactionType, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.SecuritiesFinancingTransactionType,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters18.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SettlementDetails137.SecuritiesTransactionType,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.SecuritiesFinancingTransactionType, com.tools20022.repository.msg.SettlementDetails132.SecuritiesTransactionType,
					com.tools20022.repository.choice.SecuritiesTransactionType34Choice.Code, com.tools20022.repository.choice.SecuritiesTransactionType34Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails138.SecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails131.SecuritiesTransactionType,
					com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice.SecuritiesTransactionType, com.tools20022.repository.choice.SecuritiesTransactionType35Choice.Code,
					com.tools20022.repository.choice.SecuritiesTransactionType35Choice.Proprietary, com.tools20022.repository.choice.SettlementOrCorporateActionEvent21Choice.SecuritiesTransactionType,
					com.tools20022.repository.msg.SettlementDetails133.SecuritiesTransactionType, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.TransactionType);
			elementContext_lazy = () -> SecuritiesTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Underlying information about the settlement transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTrade";
				definition = "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.IdentifiedTrade, com.tools20022.repository.entity.SecuritiesQuantity.Trade, com.tools20022.repository.entity.SecuritiesTradeExecution.RelatedTrade,
						com.tools20022.repository.entity.SecuritiesTradeStatus.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesFinancing.ClosingLegExecution,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningLegExecution, com.tools20022.repository.entity.SecuritiesOrder.OrderExecution, com.tools20022.repository.entity.SecuritiesTradePartyRole.SecuritiesTrade,
						com.tools20022.repository.entity.Allocation.SecuritiesTrade);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails41.TransactionDetails, com.tools20022.repository.msg.TransactionDetails43.TransactionDetails,
						com.tools20022.repository.msg.Transaction7.TransactionDetails, com.tools20022.repository.msg.Transaction8.TransactionDetails, com.tools20022.repository.msg.Transaction9.TransactionDetails,
						com.tools20022.repository.msg.Transaction10.TransactionDetails, com.tools20022.repository.msg.Transaction14.TransactionDetails, com.tools20022.repository.msg.Transaction12.TransactionDetails,
						com.tools20022.repository.msg.Transaction15.TransactionDetails, com.tools20022.repository.msg.Transaction16.TransactionDetails, com.tools20022.repository.msg.Transaction20.TransactionDetails,
						com.tools20022.repository.msg.Transaction19.TransactionDetails, com.tools20022.repository.msg.Transaction23.TransactionDetails, com.tools20022.repository.msg.Transaction22.TransactionDetails,
						com.tools20022.repository.msg.Transaction28.TransactionDetails, com.tools20022.repository.msg.Transaction27.TransactionDetails, com.tools20022.repository.msg.Transaction30.TransactionDetails,
						com.tools20022.repository.msg.Transaction31.TransactionDetails, com.tools20022.repository.msg.Transaction6.TransactionDetails, com.tools20022.repository.msg.Transaction11.TransactionDetails,
						com.tools20022.repository.msg.Transaction13.TransactionDetails, com.tools20022.repository.msg.Transaction17.TransactionDetails, com.tools20022.repository.msg.Transaction18.TransactionDetails,
						com.tools20022.repository.msg.Transaction21.TransactionDetails, com.tools20022.repository.msg.Transaction29.TransactionDetails, com.tools20022.repository.msg.Transaction32.TransactionDetails,
						com.tools20022.repository.msg.SecuritiesTradeDetails7.OtherAmounts, com.tools20022.repository.msg.SecuritiesTradeDetails19.OtherAmounts, com.tools20022.repository.msg.TransactionDetails13.TransactionDetails,
						com.tools20022.repository.msg.SecuritiesTradeDetails4.OtherAmounts, com.tools20022.repository.msg.SecuritiesTradeDetails17.OtherAmounts, com.tools20022.repository.msg.TransactionDetails11.TransactionDetails,
						com.tools20022.repository.msg.TransactionDetails21.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails10.OtherAmounts, com.tools20022.repository.msg.SecuritiesTradeDetails22.OtherAmounts,
						com.tools20022.repository.msg.SecuritiesTradeDetails23.OtherAmounts, com.tools20022.repository.msg.SecuritiesTradeDetails29.OtherAmounts, com.tools20022.repository.msg.TransactionDetails15.TransactionDetails,
						com.tools20022.repository.msg.SecuritiesTradeDetails14.OtherAmounts, com.tools20022.repository.msg.SecuritiesTradeDetails20.OtherAmounts, com.tools20022.repository.msg.SecuritiesTradeDetails24.OtherAmounts,
						com.tools20022.repository.msg.SecuritiesTradeDetails30.OtherAmounts, com.tools20022.repository.msg.TradeLegStatement1.TradeLegsDetails, com.tools20022.repository.msg.TradeLegStatement2.TradeLegsDetails,
						com.tools20022.repository.msg.NetPosition1.TradeLegDetails, com.tools20022.repository.msg.NetPosition2.TradeLegDetails, com.tools20022.repository.msg.Transaction25.TransactionDetails,
						com.tools20022.repository.msg.Transaction34.TransactionDetails, com.tools20022.repository.msg.TransactionDetails64.TransactionDetails, com.tools20022.repository.msg.Transaction35.TransactionDetails,
						com.tools20022.repository.msg.Transaction36.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails35.OtherAmounts, com.tools20022.repository.msg.Transaction38.TransactionDetails,
						com.tools20022.repository.msg.TransactionDetails65.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails42.OtherAmounts, com.tools20022.repository.msg.Transaction39.TransactionDetails,
						com.tools20022.repository.msg.Transaction37.TransactionDetails, com.tools20022.repository.msg.TradeLeg8.TradeRegistrationOrigin, com.tools20022.repository.msg.Transaction41.TransactionDetails,
						com.tools20022.repository.msg.Transaction40.TransactionDetails, com.tools20022.repository.msg.TradeLegStatement3.TradeLegsDetails, com.tools20022.repository.msg.NetPosition3.TradeLegDetails,
						com.tools20022.repository.msg.TradeLeg10.TradeRegistrationOrigin, com.tools20022.repository.msg.TradeLeg9.TradeRegistrationOrigin, com.tools20022.repository.msg.Transaction43.TransactionDetails,
						com.tools20022.repository.msg.Transaction42.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails49.OtherAmounts, com.tools20022.repository.msg.Transaction47.TransactionDetails,
						com.tools20022.repository.msg.TransactionDetails76.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails48.OtherAmounts, com.tools20022.repository.msg.Transaction45.TransactionDetails,
						com.tools20022.repository.msg.Transaction46.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails57.OtherAmounts, com.tools20022.repository.msg.Transaction49.TransactionDetails,
						com.tools20022.repository.msg.SecuritiesTradeDetails61.OtherAmounts, com.tools20022.repository.msg.TransactionDetails85.TransactionDetails, com.tools20022.repository.msg.Transaction50.TransactionDetails,
						com.tools20022.repository.msg.Transaction48.TransactionDetails, com.tools20022.repository.msg.Transaction53.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails68.OtherAmounts,
						com.tools20022.repository.msg.Transaction54.TransactionDetails, com.tools20022.repository.msg.Transaction52.TransactionDetails, com.tools20022.repository.msg.SecuritiesTradeDetails69.OtherAmounts,
						com.tools20022.repository.msg.Transaction57.TransactionDetails, com.tools20022.repository.msg.Transaction56.TransactionDetails, com.tools20022.repository.msg.Transaction55.TransactionDetails,
						com.tools20022.repository.msg.TransactionDetails101.TransactionDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundTransaction.mmObject(), SecuritiesFinancing.mmObject(), SecuritiesTransaction.mmObject(), SecuritiesOptionTrade.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeRelatedIdentifications, com.tools20022.repository.entity.SecuritiesTrade.TradeAmount,
						com.tools20022.repository.entity.SecuritiesTrade.OpeningClosingIndicator, com.tools20022.repository.entity.SecuritiesTrade.TradeTransactionCondition,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTrade.Activity, com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity,
						com.tools20022.repository.entity.SecuritiesTrade.TradeOriginationDate, com.tools20022.repository.entity.SecuritiesTrade.ClearingFeeType, com.tools20022.repository.entity.SecuritiesTrade.Security,
						com.tools20022.repository.entity.SecuritiesTrade.TradePrice, com.tools20022.repository.entity.SecuritiesTrade.PartyRole, com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.TradingExecution, com.tools20022.repository.entity.SecuritiesTrade.TradeAllocation, com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingOpeningData, com.tools20022.repository.entity.SecuritiesTrade.TransactionType, com.tools20022.repository.entity.SecuritiesTrade.LegalFramework,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesTransactionType);
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
						SecuritiesTradeDetails66.mmObject(), DerivativeCommodity2.mmObject(), AdditionalParameters29.mmObject(), AdditionalParameters30.mmObject(), SecuritiesTradeDetails67.mmObject(), Transaction53.mmObject(),
						SecuritiesTradeDetails68.mmObject(), TransactionDetails97.mmObject(), TransactionDetails96.mmObject(), Transaction54.mmObject(), Transaction52.mmObject(), TransactionDetails95.mmObject(),
						SecuritiesTradeDetails69.mmObject(), AdditionalParameters31.mmObject(), Transaction57.mmObject(), SecuritiesTradeDetails70.mmObject(), AdditionalParameters32.mmObject(), Transaction56.mmObject(),
						TransactionDetails100.mmObject(), TransactionDetails99.mmObject(), Transaction55.mmObject(), TransactionDetails98.mmObject(), TransactionDetails101.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}