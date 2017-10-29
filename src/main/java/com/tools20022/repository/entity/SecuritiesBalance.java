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
import com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code;
import com.tools20022.repository.codeset.ShortLongCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesBalance" src="doc-files/SecuritiesBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#NetGainLoss
 * SecuritiesBalance.NetGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesAccount
 * SecuritiesBalance.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#EligibleBalanceRelatedEntitlement
 * SecuritiesBalance.EligibleBalanceRelatedEntitlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#ShortLong
 * SecuritiesBalance.ShortLong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AggregateQuantity
 * SecuritiesBalance.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#CorporateActionEntitlement
 * SecuritiesBalance.CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#InstructedBalanceRelatedEntitlement
 * SecuritiesBalance.InstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.UninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#MainSecuritiesBalance
 * SecuritiesBalance.MainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
 * SecuritiesBalance.SecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesBalanceType
 * SecuritiesBalance.SecuritiesBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SubBalanceQuantity
 * SecuritiesBalance.SubBalanceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#Security
 * SecuritiesBalance.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#ExchangeRate
 * SecuritiesBalance.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailabilityIndicator
 * SecuritiesBalance.AvailabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#AvailableQuantity
 * SecuritiesBalance.AvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#RelatedMeetingEntitlement
 * SecuritiesBalance.RelatedMeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UnavailableQuantity
 * SecuritiesBalance.UnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SafekeepingPlace
 * SecuritiesBalance.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesEntry
 * SecuritiesBalance.SecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#NotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.NotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#RelatedIntraPositionTransfer
 * SecuritiesBalance.RelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#CostAdjustment
 * SecuritiesBalance.CostAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#Pledgee
 * SecuritiesBalance.Pledgee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Balance
 * Security.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesBalance
 * SecuritiesAccount.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AggregateQuantityBalance
 * SecuritiesQuantity.AggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedSubBalance
 * SecuritiesQuantity.RelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AvailableQuantityBalance
 * SecuritiesQuantity.AvailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#UnavailableQuantityBalance
 * SecuritiesQuantity.UnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesBalance
 * SecuritiesEntry.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesBalance
 * SafekeepingPlace.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.CurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#MainSecuritiesBalance
 * SecuritiesBalance.MainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
 * SecuritiesBalance.SecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#EligibleBalance
 * CorporateActionEntitlement.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#SecuritiesBalance
 * CorporateActionEntitlement.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#InstructedBalance
 * CorporateActionEntitlement.InstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#UninstructedBalance
 * CorporateActionEntitlement.UninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#NotEligibleBalance
 * CorporateActionEntitlement.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#SecuritiesBalance
 * IntraPositionTransfer.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EligiblePosition
 * MeetingEntitlement.EligiblePosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#SecuritiesBalance
 * Pledgee.SecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice#Balance
 * BalanceFormat1Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice#EligibleBalance
 * BalanceFormat1Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice#NotEligibleBalance
 * BalanceFormat1Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#Balance
 * BalanceFormat2Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#EligibleBalance
 * BalanceFormat2Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#NotEligibleBalance
 * BalanceFormat2Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#Balance
 * BalanceFormat3Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#EligibleBalance
 * BalanceFormat3Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#NotEligibleBalance
 * BalanceFormat3Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#FullPeriodUnits
 * BalanceFormat3Choice.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#PartWayPeriodUnits
 * BalanceFormat3Choice.PartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#Balance
 * BalanceFormat4Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#EligibleBalance
 * BalanceFormat4Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#NotEligibleBalance
 * BalanceFormat4Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#FullPeriodUnits
 * BalanceFormat4Choice.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#PartWayPeriodUnits
 * BalanceFormat4Choice.PartWayPeriodUnits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance1#Quantity
 * Balance1.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#AggregateBalance
 * AggregateBalancePerSafekeepingPlace7.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#AggregateBalance
 * AggregateBalanceInformation8.AggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance2#Quantity
 * Balance2.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#AggregateBalance
 * AggregateBalancePerSafekeepingPlace10.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#AggregateBalance
 * AggregateBalanceInformation11.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#AggregateBalance
 * AggregateBalancePerSafekeepingPlace2.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#AggregateQuantity
 * AggregateBalanceInformation2.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#AggregateBalance
 * AggregateBalancePerSafekeepingPlace4.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#AggregateQuantity
 * AggregateBalanceInformation3.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#AggregateBalance
 * AggregateBalancePerSafekeepingPlace12.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#AggregateBalance
 * AggregateBalanceInformation13.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#AggregateBalance
 * AggregateBalancePerSafekeepingPlace14.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#AggregateBalance
 * AggregateBalanceInformation15.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#AggregateBalance
 * AggregateBalancePerSafekeepingPlace16.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#AggregateBalance
 * AggregateBalanceInformation17.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#AggregateBalance
 * AggregateBalancePerSafekeepingPlace18.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#AggregateBalance
 * AggregateBalanceInformation19.AggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance4#Quantity
 * Balance4.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#AggregateBalance
 * AggregateBalancePerSafekeepingPlace21.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#AggregateBalance
 * AggregateBalanceInformation22.AggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance5#Quantity
 * Balance5.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#AggregateBalance
 * AggregateBalancePerSafekeepingPlace22.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#AggregateBalance
 * AggregateBalanceInformation23.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#AggregateBalance
 * AggregateBalancePerSafekeepingPlace8.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace8.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#AggregateBalance
 * AggregateBalanceInformation9.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#NotAvailableBalance
 * AggregateBalanceInformation9.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#AggregateBalance
 * AggregateBalancePerSafekeepingPlace9.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace9.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#AggregateBalance
 * AggregateBalanceInformation10.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#NotAvailableBalance
 * AggregateBalanceInformation10.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#AggregateQuantity
 * AggregateBalancePerSafekeepingPlace1.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#NotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace1.NotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#AggregateQuantity
 * AggregateBalanceInformation1.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#NotAvailableQuantity
 * AggregateBalanceInformation1.NotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#AggregateQuantity
 * AggregateBalancePerSafekeepingPlace3.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#NotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace3.NotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#AggregateQuantity
 * AggregateBalanceInformation4.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#NotAvailableQuantity
 * AggregateBalanceInformation4.NotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#AggregateBalance
 * AggregateBalancePerSafekeepingPlace11.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace11.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#AggregateBalance
 * AggregateBalanceInformation12.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#NotAvailableBalance
 * AggregateBalanceInformation12.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#AggregateBalance
 * AggregateBalancePerSafekeepingPlace13.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace13.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#AggregateBalance
 * AggregateBalanceInformation14.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#NotAvailableBalance
 * AggregateBalanceInformation14.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#AggregateBalance
 * AggregateBalancePerSafekeepingPlace15.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace15.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#AggregateBalance
 * AggregateBalanceInformation16.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#NotAvailableBalance
 * AggregateBalanceInformation16.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#AggregateBalance
 * AggregateBalancePerSafekeepingPlace17.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace17.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#AggregateBalance
 * AggregateBalanceInformation18.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#NotAvailableBalance
 * AggregateBalanceInformation18.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AggregateBalance
 * AggregateBalancePerSafekeepingPlace20.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace20.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#AggregateBalance
 * AggregateBalanceInformation21.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#NotAvailableBalance
 * AggregateBalanceInformation21.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#AggregateBalance
 * AggregateBalancePerSafekeepingPlace23.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace23.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#AggregateBalance
 * AggregateBalanceInformation24.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#NotAvailableBalance
 * AggregateBalanceInformation24.NotAvailableBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance1#ClosingBalance
 * ClosingBalance1.ClosingBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance2#ClosingBalance
 * ClosingBalance2.ClosingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1#BalanceForAccount
 * AccountingStatementOfHoldings1.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#BalanceForAccount
 * AccountingStatementOfHoldings2.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#BalanceForAccount
 * CustodyStatementOfHoldings1.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#BalanceForAccount
 * CustodyStatementOfHoldings2.BalanceForAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition5#Position
 * SecurityPosition5.Position}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition6#Position
 * SecurityPosition6.Position}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition7#Position
 * SecurityPosition7.Position}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#AggregateQuantity
 * AggregateBalanceInformation5.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#AggregateBalance
 * AggregateBalancePerSafekeepingPlace19.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace19.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#AggregateBalance
 * AggregateBalanceInformation20.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#NotAvailableBalance
 * AggregateBalanceInformation20.NotAvailableBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance3#BalanceForAccount
 * Balance3.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#AggregateQuantity
 * AggregateBalancePerSafekeepingPlace6.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#AggregateQuantity
 * AggregateBalanceInformation6.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#AggregateQuantity
 * AggregateBalancePerSafekeepingPlace5.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#NotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace5.NotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#AggregateQuantity
 * AggregateBalanceInformation7.AggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#NotAvailableQuantity
 * AggregateBalanceInformation7.NotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#FullPeriodUnits
 * TotalEligibleBalanceFormat1.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#PartWayPeriodUnits
 * TotalEligibleBalanceFormat1.PartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat4#FullPeriodUnits
 * TotalEligibleBalanceFormat4.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat4#PartWayPeriodUnits
 * TotalEligibleBalanceFormat4.PartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#BalanceForAccount
 * SafekeepingAccount5.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#AccountSubLevel1Difference
 * SafekeepingAccount5.AccountSubLevel1Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2#BalanceForFinancialInstrument
 * AggregateHoldingBalance2.BalanceForFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#BalanceBreakdown
 * FinancialInstrumentAggregateBalance2.BalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#BalanceForAccount
 * AccountSubLevel1.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#AccountSubLevel2Difference
 * AccountSubLevel1.AccountSubLevel2Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#BalanceForAccount
 * AccountSubLevel4.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#AccountSubLevel5Difference
 * AccountSubLevel4.AccountSubLevel5Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#BalanceForAccount
 * AccountSubLevel5.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#AccountSubLevel6Difference
 * AccountSubLevel5.AccountSubLevel6Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#BalanceForAccount
 * AccountSubLevel2.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#AccountSubLevel3Difference
 * AccountSubLevel2.AccountSubLevel3Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#BalanceForAccount
 * AccountSubLevel3.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#AccountSubLevel4Difference
 * AccountSubLevel3.AccountSubLevel4Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#BalanceForAccount
 * AccountSubLevel6.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#AccountSubLevel7Difference
 * AccountSubLevel6.AccountSubLevel7Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#BalanceForAccount
 * AccountSubLevel7.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#AccountSubLevel8Difference
 * AccountSubLevel7.AccountSubLevel8Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#BalanceForAccount
 * AccountSubLevel8.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#AccountSubLevel9Difference
 * AccountSubLevel8.AccountSubLevel9Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel9#BalanceForAccount
 * AccountSubLevel9.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#AggregateBalance
 * AggregateBalanceInformation26.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#AggregateBalance
 * AggregateBalanceInformation25.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#NotAvailableBalance
 * AggregateBalanceInformation25.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AggregateBalance
 * AggregateBalancePerSafekeepingPlace24.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace24.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#AggregateBalance
 * AggregateBalancePerSafekeepingPlace25.AggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition8#Position
 * SecurityPosition8.Position}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition9#Position
 * SecurityPosition9.Position}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#AggregateBalance
 * AggregateBalanceInformation28.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#NotAvailableBalance
 * AggregateBalanceInformation28.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#AggregateBalance
 * AggregateBalanceInformation27.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#AggregateBalance
 * AggregateBalancePerSafekeepingPlace26.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#AggregateBalance
 * AggregateBalancePerSafekeepingPlace27.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace27.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#AggregateBalance
 * AggregateBalanceInformation30.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#NotAvailableBalance
 * AggregateBalanceInformation30.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#AggregateBalance
 * AggregateBalanceInformation31.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AggregateBalance
 * AggregateBalancePerSafekeepingPlace28.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace28.NotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#AggregateBalance
 * AggregateBalancePerSafekeepingPlace29.AggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance6#Quantity
 * Balance6.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance3#ClosingBalance
 * ClosingBalance3.ClosingBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance7#Quantity
 * Balance7.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#Balance
 * BalanceFormat5Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#EligibleBalance
 * BalanceFormat5Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#NotEligibleBalance
 * BalanceFormat5Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#FullPeriodUnits
 * TotalEligibleBalanceFormat8.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#PartWayPeriodUnits
 * TotalEligibleBalanceFormat8.PartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#Balance
 * BalanceFormat6Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#EligibleBalance
 * BalanceFormat6Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#NotEligibleBalance
 * BalanceFormat6Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#FullPeriodUnits
 * BalanceFormat6Choice.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#PartWayPeriodUnits
 * BalanceFormat6Choice.PartWayPeriodUnits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance9#Quantity
 * Balance9.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance8#Quantity
 * Balance8.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice#Balance
 * BalanceFormat7Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice#EligibleBalance
 * BalanceFormat7Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice#NotEligibleBalance
 * BalanceFormat7Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#FullPeriodUnits
 * TotalEligibleBalanceFormat9.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#PartWayPeriodUnits
 * TotalEligibleBalanceFormat9.PartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#Balance
 * BalanceFormat10Choice.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#EligibleBalance
 * BalanceFormat10Choice.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#NotEligibleBalance
 * BalanceFormat10Choice.NotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#FullPeriodUnits
 * BalanceFormat10Choice.FullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#PartWayPeriodUnits
 * BalanceFormat10Choice.PartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#AggregateBalance
 * AggregateBalanceInformation32.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#AggregateBalance
 * AggregateBalanceInformation33.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#NotAvailableBalance
 * AggregateBalanceInformation33.NotAvailableBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance11#Quantity
 * Balance11.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#AggregateBalance
 * AggregateBalancePerSafekeepingPlace31.AggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#NotAvailableBalance
 * AggregateBalancePerSafekeepingPlace31.NotAvailableBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance4#ClosingBalance
 * ClosingBalance4.ClosingBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance10#Quantity
 * Balance10.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#AggregateBalance
 * AggregateBalancePerSafekeepingPlace30.AggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance13#Quantity
 * Balance13.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance12#Quantity
 * Balance12.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#BalanceDetails
 * SafekeepingAccount7.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#AccountSubLevel1Difference
 * SafekeepingAccount7.AccountSubLevel1Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#BalanceDetails
 * AccountSubLevel15.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#AccountSubLevel6Difference
 * AccountSubLevel15.AccountSubLevel6Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#BalanceDetails
 * AccountSubLevel16.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#AccountSubLevel7Difference
 * AccountSubLevel16.AccountSubLevel7Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3#BalanceForAccount
 * AggregateHoldingBalance3.BalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#BalanceDetails
 * AccountSubLevel18.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#AccountSubLevel9Difference
 * AccountSubLevel18.AccountSubLevel9Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#BalanceDetails
 * AccountSubLevel19.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#BalanceDetails
 * AccountSubLevel11.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#AccountSubLevel2Difference
 * AccountSubLevel11.AccountSubLevel2Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#BalanceDetails
 * AccountSubLevel12.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#AccountSubLevel3Difference
 * AccountSubLevel12.AccountSubLevel3Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#BalanceDetails
 * AccountSubLevel17.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#AccountSubLevel8Difference
 * AccountSubLevel17.AccountSubLevel8Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#BalanceDetails
 * AccountSubLevel13.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#AccountSubLevel4Difference
 * AccountSubLevel13.AccountSubLevel4Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#BalanceDetails
 * AccountSubLevel14.BalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#AccountSubLevel5Difference
 * AccountSubLevel14.AccountSubLevel5Difference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningClosing1Choice
 * OpeningClosing1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningClosing2Choice
 * OpeningClosing2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat2
 * SignedQuantityFormat2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat1
 * SignedQuantityFormat1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
 * BalanceFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
 * SignedQuantityFormat4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
 * SignedQuantityFormat3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat2Choice
 * BalanceFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat3Choice
 * BalanceFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat4Choice
 * BalanceFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType3Choice
 * SecuritiesBalanceType3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType5Choice
 * SecuritiesBalanceType5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1
 * SecuritiesSubBalanceTypeAndQuantityBreakdown1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2
 * SecuritiesSubBalanceTypeAndQuantityBreakdown2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity4Choice
 * BalanceQuantity4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance1 Balance1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType3Choice
 * SubBalanceType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType5Choice
 * SubBalanceType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice
 * SubBalanceQuantity3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType4Choice
 * SubBalanceType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType6Choice
 * SubBalanceType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
 * AdditionalBalanceInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation6
 * SubBalanceInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7
 * AggregateBalancePerSafekeepingPlace7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
 * AggregateBalanceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity6Choice
 * BalanceQuantity6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance2 Balance2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType7Choice
 * SubBalanceType7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice
 * SubBalanceQuantity4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType8Choice
 * SubBalanceType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7
 * AdditionalBalanceInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation7
 * SubBalanceInformation7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10
 * AggregateBalancePerSafekeepingPlace10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11
 * AggregateBalanceInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice
 * BalanceQuantity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAvailability
 * QuantityAndAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice
 * SubBalanceQuantity1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType1Choice
 * SecuritiesBalanceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation
 * AdditionalBalanceInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation1
 * SubBalanceInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2
 * AggregateBalancePerSafekeepingPlace2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2
 * AggregateBalanceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2
 * AdditionalBalanceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation2
 * SubBalanceInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4
 * AggregateBalancePerSafekeepingPlace4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3
 * AggregateBalanceInformation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12
 * AggregateBalancePerSafekeepingPlace12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13
 * AggregateBalanceInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14
 * AggregateBalancePerSafekeepingPlace14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15
 * AggregateBalanceInformation15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16
 * AggregateBalancePerSafekeepingPlace16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17
 * AggregateBalanceInformation17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18
 * AggregateBalancePerSafekeepingPlace18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19
 * AggregateBalanceInformation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance4 Balance4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21
 * AggregateBalancePerSafekeepingPlace21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22
 * AggregateBalanceInformation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance5 Balance5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22
 * AggregateBalancePerSafekeepingPlace22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23
 * AggregateBalanceInformation23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice
 * BalanceQuantity5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5
 * AdditionalBalanceInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation5
 * SubBalanceInformation5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8
 * AggregateBalancePerSafekeepingPlace8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9
 * AggregateBalanceInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity7Choice
 * BalanceQuantity7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8
 * AdditionalBalanceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation8
 * SubBalanceInformation8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9
 * AggregateBalancePerSafekeepingPlace9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10
 * AggregateBalanceInformation10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
 * AggregateBalancePerSafekeepingPlace1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1
 * AggregateBalanceInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3
 * AggregateBalancePerSafekeepingPlace3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4
 * AggregateBalanceInformation4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11
 * AggregateBalancePerSafekeepingPlace11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12
 * AggregateBalanceInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13
 * AggregateBalancePerSafekeepingPlace13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14
 * AggregateBalanceInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9
 * AdditionalBalanceInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation9
 * SubBalanceInformation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15
 * AggregateBalancePerSafekeepingPlace15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16
 * AggregateBalanceInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10
 * AdditionalBalanceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation10
 * SubBalanceInformation10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17
 * AggregateBalancePerSafekeepingPlace17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18
 * AggregateBalanceInformation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11
 * AdditionalBalanceInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation11
 * SubBalanceInformation11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20
 * AggregateBalancePerSafekeepingPlace20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21
 * AggregateBalanceInformation21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12
 * AdditionalBalanceInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation12
 * SubBalanceInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23
 * AggregateBalancePerSafekeepingPlace23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24
 * AggregateBalanceInformation24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningBalance1Choice
 * OpeningBalance1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningBalance1
 * OpeningBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosingBalance1Choice
 * ClosingBalance1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance1
 * ClosingBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningBalance2Choice
 * OpeningBalance2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningBalance2
 * OpeningBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosingBalance2Choice
 * ClosingBalance2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance2
 * ClosingBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1
 * AccountingStatementOfHoldings1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2
 * AccountingStatementOfHoldings2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1
 * CustodyStatementOfHoldings1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2
 * CustodyStatementOfHoldings2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance2
 * HoldingBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition
 * EligiblePosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition
 * SecurityPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance3
 * HoldingBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition2
 * EligiblePosition2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition5
 * SecurityPosition5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance6
 * HoldingBalance6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition3
 * EligiblePosition3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition6
 * SecurityPosition6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition4
 * EligiblePosition4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition7
 * SecurityPosition7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance4
 * HoldingBalance4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance5
 * HoldingBalance5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition1
 * EligiblePosition1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition4
 * SecurityPosition4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition3
 * SecurityPosition3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice
 * SecuritiesBalanceType10FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice
 * SecuritiesBalanceType6FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice
 * SecuritiesBalanceType9FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType2Choice
 * SecuritiesBalanceType2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType4Choice
 * SecuritiesBalanceType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType1Choice
 * SubBalanceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation3
 * AdditionalBalanceInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType2Choice
 * SubBalanceType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation3
 * SubBalanceInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5
 * AggregateBalanceInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity2Choice
 * SubBalanceQuantity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionType1
 * IntraPositionType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19
 * AggregateBalancePerSafekeepingPlace19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20
 * AggregateBalanceInformation20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance3 Balance3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity2Choice
 * BalanceQuantity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation4
 * AdditionalBalanceInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation4
 * SubBalanceInformation4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6
 * AggregateBalancePerSafekeepingPlace6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6
 * AggregateBalanceInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice
 * BalanceQuantity3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5
 * AggregateBalancePerSafekeepingPlace5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7
 * AggregateBalanceInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1
 * TotalEligibleBalanceFormat1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat5
 * SignedQuantityFormat5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat4
 * TotalEligibleBalanceFormat4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2
 * AggregateHoldingBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType9Choice
 * SubBalanceType9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2
 * FinancialInstrumentAggregateBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1
 * SubBalanceBreakdown1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice
 * SubBalanceQuantity5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26
 * AggregateBalanceInformation26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25
 * AggregateBalanceInformation25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24
 * AggregateBalancePerSafekeepingPlace24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25
 * AggregateBalancePerSafekeepingPlace25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition8
 * SecurityPosition8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition9
 * SecurityPosition9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance8
 * HoldingBalance8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition5
 * EligiblePosition5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7
 * HoldingBalance7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition6
 * EligiblePosition6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
 * AggregateHoldingBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28
 * AggregateBalanceInformation28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27
 * AggregateBalanceInformation27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26
 * AggregateBalancePerSafekeepingPlace26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27
 * AggregateBalancePerSafekeepingPlace27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30
 * AggregateBalanceInformation30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31
 * AggregateBalanceInformation31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28
 * AggregateBalancePerSafekeepingPlace28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29
 * AggregateBalancePerSafekeepingPlace29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation15
 * SubBalanceInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType11Choice
 * SubBalanceType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice
 * SubBalanceQuantity6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15
 * AdditionalBalanceInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningClosing3Choice
 * OpeningClosing3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14
 * AdditionalBalanceInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType12Choice
 * SubBalanceType12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3
 * SecuritiesSubBalanceTypeAndQuantityBreakdown3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance6 Balance6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation14
 * SubBalanceInformation14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice
 * SecuritiesBalanceType7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice
 * SecuritiesBalanceType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningBalance3
 * OpeningBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance3
 * ClosingBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance7 Balance7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosingBalance4Choice
 * ClosingBalance4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice
 * BalanceQuantity8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningBalance4Choice
 * OpeningBalance4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice
 * BalanceQuantity9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat5Choice
 * BalanceFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat7
 * SignedQuantityFormat7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
 * SignedQuantityFormat6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8
 * TotalEligibleBalanceFormat8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
 * BalanceFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance9 Balance9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance8 Balance8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
 * BalanceFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9
 * TotalEligibleBalanceFormat9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
 * SignedQuantityFormat9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceFormat10Choice
 * BalanceFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat8
 * SignedQuantityFormat8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32
 * AggregateBalanceInformation32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
 * AggregateBalanceInformation33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation16
 * AdditionalBalanceInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType14Choice
 * SubBalanceType14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice
 * SubBalanceQuantity7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown4
 * SecuritiesSubBalanceTypeAndQuantityBreakdown4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance11 Balance11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity10Choice
 * BalanceQuantity10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningClosing4Choice
 * OpeningClosing4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31
 * AggregateBalancePerSafekeepingPlace31}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceQuantity12Choice
 * BalanceQuantity12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17
 * AdditionalBalanceInformation17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation17
 * SubBalanceInformation17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosingBalance5Choice
 * ClosingBalance5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType11Choice
 * SecuritiesBalanceType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OpeningBalance5Choice
 * OpeningBalance5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation16
 * SubBalanceInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SubBalanceType13Choice
 * SubBalanceType13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClosingBalance4
 * ClosingBalance4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningBalance4
 * OpeningBalance4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance10 Balance10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30
 * AggregateBalancePerSafekeepingPlace30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType8Choice
 * SecuritiesBalanceType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance13 Balance13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance12 Balance12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3
 * AggregateHoldingBalance3}</li>
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
 * "SecuritiesBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries."
 * </li>
 * </ul>
 */
public class SecuritiesBalance extends Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount representing the difference between the cost and the current price
	 * of a security. In the context of securities settlement, it is the amount
	 * paid or received when the instructions are netted or paired off.
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
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts12#NetGainLoss
	 * OtherAmounts12.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts14#NetGainLoss
	 * OtherAmounts14.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts20#NetGainLoss
	 * OtherAmounts20.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#NetGainLoss
	 * OtherAmounts4.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#NetGainLoss
	 * OtherAmounts5.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#NetGainLoss
	 * OtherAmounts17.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#NetGainLoss
	 * OtherAmounts23.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts3#NetGainLoss
	 * OtherAmounts3.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#NetGainLoss
	 * OtherAmounts7.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#NetGainLoss
	 * OtherAmounts9.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#NetGainLoss
	 * OtherAmounts10.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#NetGainLoss
	 * OtherAmounts18.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#NetGainLoss
	 * OtherAmounts24.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts13#NetGainLoss
	 * OtherAmounts13.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts1#NetGainLoss
	 * OtherAmounts1.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#NetGainLoss
	 * OtherAmounts16.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#NetGainLoss
	 * OtherAmounts28.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#NetGainLoss
	 * OtherAmounts30.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#NetGainLoss
	 * OtherAmounts31.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts35#NetGainLoss
	 * OtherAmounts35.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#NetGainLoss
	 * OtherAmounts34.NetGainLoss}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#NetGainLoss
	 * OtherAmounts38.NetGainLoss}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetGainLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetGainLoss = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.NetGainLoss, com.tools20022.repository.msg.OtherAmounts14.NetGainLoss, com.tools20022.repository.msg.OtherAmounts20.NetGainLoss,
					com.tools20022.repository.msg.OtherAmounts4.NetGainLoss, com.tools20022.repository.msg.OtherAmounts5.NetGainLoss, com.tools20022.repository.msg.OtherAmounts17.NetGainLoss,
					com.tools20022.repository.msg.OtherAmounts23.NetGainLoss, com.tools20022.repository.msg.OtherAmounts3.NetGainLoss, com.tools20022.repository.msg.OtherAmounts7.NetGainLoss,
					com.tools20022.repository.msg.OtherAmounts9.NetGainLoss, com.tools20022.repository.msg.OtherAmounts10.NetGainLoss, com.tools20022.repository.msg.OtherAmounts18.NetGainLoss,
					com.tools20022.repository.msg.OtherAmounts24.NetGainLoss, com.tools20022.repository.msg.OtherAmounts13.NetGainLoss, com.tools20022.repository.msg.OtherAmounts1.NetGainLoss,
					com.tools20022.repository.msg.OtherAmounts16.NetGainLoss, com.tools20022.repository.msg.OtherAmounts28.NetGainLoss, com.tools20022.repository.msg.OtherAmounts30.NetGainLoss,
					com.tools20022.repository.msg.OtherAmounts31.NetGainLoss, com.tools20022.repository.msg.OtherAmounts35.NetGainLoss, com.tools20022.repository.msg.OtherAmounts34.NetGainLoss,
					com.tools20022.repository.msg.OtherAmounts38.NetGainLoss);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Account or sub-account for which a balance is calculated. It is derived
	 * from the association between Balance and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesBalance
	 * SecuritiesAccount.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1#AccountDetails
	 * AccountingStatementOfHoldings1.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#AccountDetails
	 * AccountingStatementOfHoldings2.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#AccountDetails
	 * CustodyStatementOfHoldings1.AccountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition3#Account
	 * SecurityPosition3.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation2#SafekeepingAccount
	 * IntraPositionCancellation2.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance3#SafekeepingAccount
	 * Balance3.SafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountingStatementOfHoldings1.AccountDetails, com.tools20022.repository.msg.AccountingStatementOfHoldings2.AccountDetails,
					com.tools20022.repository.msg.CustodyStatementOfHoldings1.AccountDetails, com.tools20022.repository.msg.SecurityPosition3.Account, com.tools20022.repository.msg.IntraPositionCancellation2.SafekeepingAccount,
					com.tools20022.repository.msg.Balance3.SafekeepingAccount);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which an eligible balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#EligibleBalance
	 * CorporateActionEntitlement.EligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an eligible balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an eligible balance is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indication that the position is short or long.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLongCode
	 * ShortLongCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat2#ShortLongPosition
	 * SignedQuantityFormat2.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1#ShortLongPosition
	 * SignedQuantityFormat1.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4#ShortLongPosition
	 * SignedQuantityFormat4.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3#ShortLongPosition
	 * SignedQuantityFormat3.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance1#ShortLongIndicator
	 * Balance1.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance2#ShortLongIndicator
	 * Balance2.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance4#ShortLongIndicator
	 * Balance4.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance5#ShortLongIndicator
	 * Balance5.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance1#ShortLongIndicator
	 * OpeningBalance1.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance1#ShortLongIndicator
	 * ClosingBalance1.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance2#ShortLongIndicator
	 * OpeningBalance2.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance2#ShortLongIndicator
	 * ClosingBalance2.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#ShortLong
	 * AggregateBalancePerSafekeepingPlace6.ShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#ShortLong
	 * AggregateBalanceInformation6.ShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#ShortLong
	 * AggregateBalancePerSafekeepingPlace5.ShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#ShortLong
	 * AggregateBalanceInformation7.ShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat5#ShortLongPosition
	 * SignedQuantityFormat5.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance6#ShortLongIndicator
	 * Balance6.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#ShortLongIndicator
	 * OpeningBalance3.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance3#ShortLongIndicator
	 * ClosingBalance3.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance7#ShortLongIndicator
	 * Balance7.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#ShortLongPosition
	 * SignedQuantityFormat7.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6#ShortLongPosition
	 * SignedQuantityFormat6.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance9#ShortLongIndicator
	 * Balance9.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance8#ShortLongIndicator
	 * Balance8.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9#ShortLongPosition
	 * SignedQuantityFormat9.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat8#ShortLongPosition
	 * SignedQuantityFormat8.ShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance11#ShortLongIndicator
	 * Balance11.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance4#ShortLongIndicator
	 * ClosingBalance4.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance4#ShortLongIndicator
	 * OpeningBalance4.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance10#ShortLongIndicator
	 * Balance10.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance13#ShortLongIndicator
	 * Balance13.ShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance12#ShortLongIndicator
	 * Balance12.ShortLongIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that the position is short or long."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ShortLong = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SignedQuantityFormat2.ShortLongPosition, com.tools20022.repository.msg.SignedQuantityFormat1.ShortLongPosition,
					com.tools20022.repository.msg.SignedQuantityFormat4.ShortLongPosition, com.tools20022.repository.msg.SignedQuantityFormat3.ShortLongPosition, com.tools20022.repository.msg.Balance1.ShortLongIndicator,
					com.tools20022.repository.msg.Balance2.ShortLongIndicator, com.tools20022.repository.msg.Balance4.ShortLongIndicator, com.tools20022.repository.msg.Balance5.ShortLongIndicator,
					com.tools20022.repository.msg.OpeningBalance1.ShortLongIndicator, com.tools20022.repository.msg.ClosingBalance1.ShortLongIndicator, com.tools20022.repository.msg.OpeningBalance2.ShortLongIndicator,
					com.tools20022.repository.msg.ClosingBalance2.ShortLongIndicator, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.ShortLong, com.tools20022.repository.msg.AggregateBalanceInformation6.ShortLong,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.ShortLong, com.tools20022.repository.msg.AggregateBalanceInformation7.ShortLong, com.tools20022.repository.msg.SignedQuantityFormat5.ShortLongPosition,
					com.tools20022.repository.msg.Balance6.ShortLongIndicator, com.tools20022.repository.msg.OpeningBalance3.ShortLongIndicator, com.tools20022.repository.msg.ClosingBalance3.ShortLongIndicator,
					com.tools20022.repository.msg.Balance7.ShortLongIndicator, com.tools20022.repository.msg.SignedQuantityFormat7.ShortLongPosition, com.tools20022.repository.msg.SignedQuantityFormat6.ShortLongPosition,
					com.tools20022.repository.msg.Balance9.ShortLongIndicator, com.tools20022.repository.msg.Balance8.ShortLongIndicator, com.tools20022.repository.msg.SignedQuantityFormat9.ShortLongPosition,
					com.tools20022.repository.msg.SignedQuantityFormat8.ShortLongPosition, com.tools20022.repository.msg.Balance11.ShortLongIndicator, com.tools20022.repository.msg.ClosingBalance4.ShortLongIndicator,
					com.tools20022.repository.msg.OpeningBalance4.ShortLongIndicator, com.tools20022.repository.msg.Balance10.ShortLongIndicator, com.tools20022.repository.msg.Balance13.ShortLongIndicator,
					com.tools20022.repository.msg.Balance12.ShortLongIndicator);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortLong";
			definition = "Indication that the position is short or long.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ShortLongCode.mmObject();
		}
	};
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AggregateQuantityBalance
	 * SecuritiesQuantity.AggregateQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat2#Quantity
	 * SignedQuantityFormat2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1#QuantityChoice
	 * SignedQuantityFormat1.QuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4#Quantity
	 * SignedQuantityFormat4.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3#QuantityChoice
	 * SignedQuantityFormat3.QuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity4Choice#Quantity
	 * BalanceQuantity4Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity4Choice#Proprietary
	 * BalanceQuantity4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity6Choice#Quantity
	 * BalanceQuantity6Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity6Choice#Proprietary
	 * BalanceQuantity6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice#Quantity
	 * BalanceQuantity1Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice#QuantityAsDSS
	 * BalanceQuantity1Choice.QuantityAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice#Quantity
	 * BalanceQuantity5Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice#Proprietary
	 * BalanceQuantity5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity7Choice#Quantity
	 * BalanceQuantity7Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity7Choice#Proprietary
	 * BalanceQuantity7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance1Choice#First
	 * OpeningBalance1Choice.First}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance1Choice#Intermediary
	 * OpeningBalance1Choice.Intermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance1#OpeningBalance
	 * OpeningBalance1.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance1Choice#Final
	 * ClosingBalance1Choice.Final}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance1Choice#Intermediary
	 * ClosingBalance1Choice.Intermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance2Choice#First
	 * OpeningBalance2Choice.First}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance2Choice#Intermediary
	 * OpeningBalance2Choice.Intermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance2#OpeningBalance
	 * OpeningBalance2.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance2Choice#Final
	 * ClosingBalance2Choice.Final}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance2Choice#Intermediary
	 * ClosingBalance2Choice.Intermediary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance2#Balance
	 * HoldingBalance2.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance3#Balance
	 * HoldingBalance3.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance6#Balance
	 * HoldingBalance6.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance4#Balance
	 * HoldingBalance4.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance5#Balance
	 * HoldingBalance5.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity2Choice#Quantity
	 * BalanceQuantity2Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity2Choice#Proprietary
	 * BalanceQuantity2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice#Quantity
	 * BalanceQuantity3Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice#Proprietary
	 * BalanceQuantity3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#Balance
	 * TotalEligibleBalanceFormat1.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat5#Quantity
	 * SignedQuantityFormat5.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat4#Balance
	 * TotalEligibleBalanceFormat4.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance8#Balance
	 * HoldingBalance8.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7#Balance
	 * HoldingBalance7.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#OpeningBalance
	 * OpeningBalance3.OpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#Final
	 * ClosingBalance4Choice.Final}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#Intermediary
	 * ClosingBalance4Choice.Intermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice#Quantity
	 * BalanceQuantity8Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice#Proprietary
	 * BalanceQuantity8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance4Choice#First
	 * OpeningBalance4Choice.First}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance4Choice#Intermediary
	 * OpeningBalance4Choice.Intermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice#Quantity
	 * BalanceQuantity9Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice#Proprietary
	 * BalanceQuantity9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#QuantityChoice
	 * SignedQuantityFormat7.QuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6#Quantity
	 * SignedQuantityFormat6.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#Balance
	 * TotalEligibleBalanceFormat8.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#Balance
	 * TotalEligibleBalanceFormat9.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9#Quantity
	 * SignedQuantityFormat9.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat8#QuantityChoice
	 * SignedQuantityFormat8.QuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity10Choice#Quantity
	 * BalanceQuantity10Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity10Choice#Proprietary
	 * BalanceQuantity10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity12Choice#Quantity
	 * BalanceQuantity12Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity12Choice#Proprietary
	 * BalanceQuantity12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance5Choice#Final
	 * ClosingBalance5Choice.Final}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance5Choice#Intermediary
	 * ClosingBalance5Choice.Intermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance5Choice#First
	 * OpeningBalance5Choice.First}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance5Choice#Intermediary
	 * OpeningBalance5Choice.Intermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance4#OpeningBalance
	 * OpeningBalance4.OpeningBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AggregateQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SignedQuantityFormat2.Quantity, com.tools20022.repository.msg.SignedQuantityFormat1.QuantityChoice,
					com.tools20022.repository.msg.SignedQuantityFormat4.Quantity, com.tools20022.repository.msg.SignedQuantityFormat3.QuantityChoice, com.tools20022.repository.choice.BalanceQuantity4Choice.Quantity,
					com.tools20022.repository.choice.BalanceQuantity4Choice.Proprietary, com.tools20022.repository.choice.BalanceQuantity6Choice.Quantity, com.tools20022.repository.choice.BalanceQuantity6Choice.Proprietary,
					com.tools20022.repository.choice.BalanceQuantity1Choice.Quantity, com.tools20022.repository.choice.BalanceQuantity1Choice.QuantityAsDSS, com.tools20022.repository.choice.BalanceQuantity5Choice.Quantity,
					com.tools20022.repository.choice.BalanceQuantity5Choice.Proprietary, com.tools20022.repository.choice.BalanceQuantity7Choice.Quantity, com.tools20022.repository.choice.BalanceQuantity7Choice.Proprietary,
					com.tools20022.repository.choice.OpeningBalance1Choice.First, com.tools20022.repository.choice.OpeningBalance1Choice.Intermediary, com.tools20022.repository.msg.OpeningBalance1.OpeningBalance,
					com.tools20022.repository.choice.ClosingBalance1Choice.Final, com.tools20022.repository.choice.ClosingBalance1Choice.Intermediary, com.tools20022.repository.choice.OpeningBalance2Choice.First,
					com.tools20022.repository.choice.OpeningBalance2Choice.Intermediary, com.tools20022.repository.msg.OpeningBalance2.OpeningBalance, com.tools20022.repository.choice.ClosingBalance2Choice.Final,
					com.tools20022.repository.choice.ClosingBalance2Choice.Intermediary, com.tools20022.repository.msg.HoldingBalance2.Balance, com.tools20022.repository.msg.HoldingBalance3.Balance,
					com.tools20022.repository.msg.HoldingBalance6.Balance, com.tools20022.repository.msg.HoldingBalance4.Balance, com.tools20022.repository.msg.HoldingBalance5.Balance,
					com.tools20022.repository.choice.BalanceQuantity2Choice.Quantity, com.tools20022.repository.choice.BalanceQuantity2Choice.Proprietary, com.tools20022.repository.choice.BalanceQuantity3Choice.Quantity,
					com.tools20022.repository.choice.BalanceQuantity3Choice.Proprietary, com.tools20022.repository.msg.TotalEligibleBalanceFormat1.Balance, com.tools20022.repository.msg.SignedQuantityFormat5.Quantity,
					com.tools20022.repository.msg.TotalEligibleBalanceFormat4.Balance, com.tools20022.repository.msg.HoldingBalance8.Balance, com.tools20022.repository.msg.HoldingBalance7.Balance,
					com.tools20022.repository.msg.OpeningBalance3.OpeningBalance, com.tools20022.repository.choice.ClosingBalance4Choice.Final, com.tools20022.repository.choice.ClosingBalance4Choice.Intermediary,
					com.tools20022.repository.choice.BalanceQuantity8Choice.Quantity, com.tools20022.repository.choice.BalanceQuantity8Choice.Proprietary, com.tools20022.repository.choice.OpeningBalance4Choice.First,
					com.tools20022.repository.choice.OpeningBalance4Choice.Intermediary, com.tools20022.repository.choice.BalanceQuantity9Choice.Quantity, com.tools20022.repository.choice.BalanceQuantity9Choice.Proprietary,
					com.tools20022.repository.msg.SignedQuantityFormat7.QuantityChoice, com.tools20022.repository.msg.SignedQuantityFormat6.Quantity, com.tools20022.repository.msg.TotalEligibleBalanceFormat8.Balance,
					com.tools20022.repository.msg.TotalEligibleBalanceFormat9.Balance, com.tools20022.repository.msg.SignedQuantityFormat9.Quantity, com.tools20022.repository.msg.SignedQuantityFormat8.QuantityChoice,
					com.tools20022.repository.choice.BalanceQuantity10Choice.Quantity, com.tools20022.repository.choice.BalanceQuantity10Choice.Proprietary, com.tools20022.repository.choice.BalanceQuantity12Choice.Quantity,
					com.tools20022.repository.choice.BalanceQuantity12Choice.Proprietary, com.tools20022.repository.choice.ClosingBalance5Choice.Final, com.tools20022.repository.choice.ClosingBalance5Choice.Intermediary,
					com.tools20022.repository.choice.OpeningBalance5Choice.First, com.tools20022.repository.choice.OpeningBalance5Choice.Intermediary, com.tools20022.repository.msg.OpeningBalance4.OpeningBalance);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantity";
			definition = "Total quantity of financial instruments of the balance.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which a balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#SecuritiesBalance
	 * CorporateActionEntitlement.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which a balance is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Corporate action entitlement for which a balance is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which an instructed balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#InstructedBalance
	 * CorporateActionEntitlement.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an instructed balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an instructed balance is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.InstructedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which an uninstructed balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#UninstructedBalance
	 * CorporateActionEntitlement.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which an uninstructed balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UninstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an uninstructed balance is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.UninstructedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance which is divided in sub-balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesSubBalance
	 * SecuritiesBalance.SecuritiesSubBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainSecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance which is divided in sub-balances."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MainSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MainSecuritiesBalance";
			definition = "Balance which is divided in sub-balances.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in an account, eg, sub-balance per status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#MainSecuritiesBalance
	 * SecuritiesBalance.MainSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance1#Balance
	 * PendingBalance1.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance2#Balance
	 * PendingBalance2.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice#QuantityAndAvailability
	 * SubBalanceQuantity3Choice.QuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation6.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace7.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace7.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#BalanceBreakdown
	 * AggregateBalanceInformation8.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation8.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation8.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice#QuantityAndAvailability
	 * SubBalanceQuantity4Choice.QuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation7.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace10.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace10.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#BalanceBreakdown
	 * AggregateBalanceInformation11.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation11.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation11.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#QuantityAndAvailability
	 * SubBalanceQuantity1Choice.QuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation1#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation1.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#BalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace2.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#AdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace2.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#BalanceBreakdownDetails
	 * AggregateBalanceInformation2.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#AdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation2.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation2.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation2.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#BalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace4.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#AdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace4.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#BalanceBreakdownDetails
	 * AggregateBalanceInformation3.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#AdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation3.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation3.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace12.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace12.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#BalanceBreakdown
	 * AggregateBalanceInformation13.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation13.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation13.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace14.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace14.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#BalanceBreakdown
	 * AggregateBalanceInformation15.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation15.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation15.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace16.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace16.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#BalanceBreakdown
	 * AggregateBalanceInformation17.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation17.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation17.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace18.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace18.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#BalanceBreakdown
	 * AggregateBalanceInformation19.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation19.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation19.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace21.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace21.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#BalanceBreakdown
	 * AggregateBalanceInformation22.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation22.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation22.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace22.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace22.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#BalanceBreakdown
	 * AggregateBalanceInformation23.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation23.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation23.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation5.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace8.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace8.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#BalanceBreakdown
	 * AggregateBalanceInformation9.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation9.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation9.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation8.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace9.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace9.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#BalanceBreakdown
	 * AggregateBalanceInformation10.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation10.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation10.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#BalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace1.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#AdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace1.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#BalanceBreakdownDetails
	 * AggregateBalanceInformation1.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#AdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation1.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation1.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#BalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace3.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#AdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace3.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#BalanceBreakdownDetails
	 * AggregateBalanceInformation4.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#AdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation4.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation4.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace11.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace11.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#BalanceBreakdown
	 * AggregateBalanceInformation12.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation12.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation12.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace13.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace13.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#BalanceBreakdown
	 * AggregateBalanceInformation14.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation14.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation14.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation9.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace15.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace15.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#BalanceBreakdown
	 * AggregateBalanceInformation16.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation16.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation16.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation10.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace17.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace17.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#BalanceBreakdown
	 * AggregateBalanceInformation18.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation18.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation18.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation11.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace20.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace20.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#BalanceBreakdown
	 * AggregateBalanceInformation21.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation21.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation21.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation12.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace23.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace23.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#BalanceBreakdown
	 * AggregateBalanceInformation24.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation24.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation24.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition#HoldingBalance
	 * EligiblePosition.HoldingBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition#Position
	 * SecurityPosition.Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition2#HoldingBalance
	 * EligiblePosition2.HoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#HoldingBalance
	 * EligiblePosition3.HoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition4#HoldingBalance
	 * EligiblePosition4.HoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#SecuritySubPosition
	 * SecurityPosition1.SecuritySubPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3#SecuritySubPosition
	 * SecurityPosition3.SecuritySubPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation3#AdditionalBalanceInformation
	 * AdditionalBalanceInformation3.AdditionalBalanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#BalanceBreakdownDetails
	 * AggregateBalanceInformation5.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#SubBalanceInformation
	 * AggregateBalanceInformation5.SubBalanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity2Choice#QuantityAndAvailability
	 * SubBalanceQuantity2Choice.QuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType1#BalanceFrom
	 * IntraPositionType1.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType1#BalanceTo
	 * IntraPositionType1.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace19.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace19.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#BalanceBreakdown
	 * AggregateBalanceInformation20.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation20.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation20.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4#SecuritiesSubBalanceIdentification
	 * IntraPosition4.SecuritiesSubBalanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation4#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation4.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#BalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace6.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#AdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace6.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#BalanceBreakdownDetails
	 * AggregateBalanceInformation6.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#AdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation6.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation6.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#BalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace5.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#AdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace5.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#BalanceBreakdownDetails
	 * AggregateBalanceInformation7.BalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#AdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation7.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation7.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#BalanceBreakdown
	 * AggregateBalanceInformation26.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation26.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation26.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#BalanceBreakdown
	 * AggregateBalanceInformation25.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation25.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation25.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace24.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace24.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace25.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace25.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#HoldingBalance
	 * EligiblePosition5.HoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#HoldingBalance
	 * EligiblePosition6.HoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#BalanceBreakdown
	 * AggregateBalanceInformation28.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation28.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation28.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#BalanceBreakdown
	 * AggregateBalanceInformation27.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation27.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation27.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace26.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace26.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace27.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace27.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#BalanceBreakdown
	 * AggregateBalanceInformation30.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation30.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation30.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#BalanceBreakdown
	 * AggregateBalanceInformation31.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation31.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation31.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace29.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace29.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation15.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#QuantityAndAvailability
	 * SubBalanceQuantity6Choice.QuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation14.AdditionalBalanceBreakdownDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance3#Balance
	 * PendingBalance3.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance4#Balance
	 * PendingBalance4.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#BalanceBreakdown
	 * AggregateBalanceInformation32.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation32.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation32.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#BalanceBreakdown
	 * AggregateBalanceInformation33.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#AdditionalBalanceBreakdown
	 * AggregateBalanceInformation33.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#BalanceAtSafekeepingPlace
	 * AggregateBalanceInformation33.BalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#QuantityAndAvailability
	 * SubBalanceQuantity7Choice.QuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace31.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace31.AdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation17.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16#AdditionalBalanceBreakdownDetails
	 * SubBalanceInformation16.AdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#BalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace30.BalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#AdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace30.AdditionalBalanceBreakdown}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSubBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PendingBalance1.Balance, com.tools20022.repository.msg.PendingBalance2.Balance,
					com.tools20022.repository.choice.SubBalanceQuantity3Choice.QuantityAndAvailability, com.tools20022.repository.msg.SubBalanceInformation6.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation8.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation8.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation8.BalanceAtSafekeepingPlace, com.tools20022.repository.choice.SubBalanceQuantity4Choice.QuantityAndAvailability,
					com.tools20022.repository.msg.SubBalanceInformation7.AdditionalBalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation11.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation11.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation11.BalanceAtSafekeepingPlace,
					com.tools20022.repository.choice.SubBalanceQuantity1Choice.QuantityAndAvailability, com.tools20022.repository.msg.SubBalanceInformation1.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation2.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation2.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation2.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.SubBalanceInformation2.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation3.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation3.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation3.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation13.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation13.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation13.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation15.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation15.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation15.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation17.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation17.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation17.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation19.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation19.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation19.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation22.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation22.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation22.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation23.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation23.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation23.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.SubBalanceInformation5.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation9.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation9.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation9.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.SubBalanceInformation8.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation10.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation10.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation10.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.BalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.AdditionalBalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation1.BalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation1.AdditionalBalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation1.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation4.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation4.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation4.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation12.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation12.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation12.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation14.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation14.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation14.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.SubBalanceInformation9.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation16.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation16.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation16.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.SubBalanceInformation10.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation18.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation18.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation18.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.SubBalanceInformation11.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation21.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation21.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation21.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.SubBalanceInformation12.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation24.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation24.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation24.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.EligiblePosition.HoldingBalance, com.tools20022.repository.msg.SecurityPosition.Position,
					com.tools20022.repository.msg.EligiblePosition2.HoldingBalance, com.tools20022.repository.msg.EligiblePosition3.HoldingBalance, com.tools20022.repository.msg.EligiblePosition4.HoldingBalance,
					com.tools20022.repository.msg.SecurityPosition1.SecuritySubPosition, com.tools20022.repository.msg.SecurityPosition3.SecuritySubPosition,
					com.tools20022.repository.msg.AdditionalBalanceInformation3.AdditionalBalanceInformation, com.tools20022.repository.msg.AggregateBalanceInformation5.BalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation5.SubBalanceInformation, com.tools20022.repository.choice.SubBalanceQuantity2Choice.QuantityAndAvailability,
					com.tools20022.repository.msg.IntraPositionType1.BalanceFrom, com.tools20022.repository.msg.IntraPositionType1.BalanceTo, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation20.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation20.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation20.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.IntraPosition4.SecuritiesSubBalanceIdentification, com.tools20022.repository.msg.SubBalanceInformation4.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation6.BalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation6.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation6.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.BalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.AdditionalBalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation7.BalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation7.AdditionalBalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalanceInformation7.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalanceInformation26.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation26.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation26.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation25.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation25.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation25.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.EligiblePosition5.HoldingBalance, com.tools20022.repository.msg.EligiblePosition6.HoldingBalance, com.tools20022.repository.msg.AggregateBalanceInformation28.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation28.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation28.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalanceInformation27.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation27.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation27.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation30.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation30.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation30.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalanceInformation31.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation31.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation31.BalanceAtSafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.AdditionalBalanceBreakdown, com.tools20022.repository.msg.SubBalanceInformation15.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.choice.SubBalanceQuantity6Choice.QuantityAndAvailability, com.tools20022.repository.msg.SubBalanceInformation14.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.PendingBalance3.Balance, com.tools20022.repository.msg.PendingBalance4.Balance, com.tools20022.repository.msg.AggregateBalanceInformation32.BalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation32.AdditionalBalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation32.BalanceAtSafekeepingPlace,
					com.tools20022.repository.msg.AggregateBalanceInformation33.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalanceInformation33.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.AggregateBalanceInformation33.BalanceAtSafekeepingPlace, com.tools20022.repository.choice.SubBalanceQuantity7Choice.QuantityAndAvailability,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.AdditionalBalanceBreakdown,
					com.tools20022.repository.msg.SubBalanceInformation17.AdditionalBalanceBreakdownDetails, com.tools20022.repository.msg.SubBalanceInformation16.AdditionalBalanceBreakdownDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.BalanceBreakdown, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.AdditionalBalanceBreakdown);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSubBalance";
			definition = "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason a security is not available or additional information about the
	 * financial instrument for which the balance is given, for example,
	 * unregistered, registered in nominee name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
	 * SecuritiesBalanceTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType3Choice#Code
	 * SecuritiesBalanceType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType3Choice#Proprietary
	 * SecuritiesBalanceType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#BalanceFrom
	 * IntraPositionDetails2.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#BalanceTo
	 * IntraPositionDetails2.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType5Choice#Code
	 * SecuritiesBalanceType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType5Choice#Proprietary
	 * SecuritiesBalanceType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#BalanceFrom
	 * IntraPositionDetails8.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#BalanceTo
	 * IntraPositionDetails8.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#BalanceFrom
	 * IntraPositionDetails12.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#BalanceTo
	 * IntraPositionDetails12.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#BalanceFrom
	 * IntraPositionDetails13.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#BalanceTo
	 * IntraPositionDetails13.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1#Type
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#BalanceFrom
	 * IntraPositionDetails22.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#BalanceTo
	 * IntraPositionDetails22.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2#Type
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#BalanceFrom
	 * IntraPositionDetails26.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#BalanceTo
	 * IntraPositionDetails26.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#BalanceFrom
	 * IntraPositionDetails27.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#BalanceTo
	 * IntraPositionDetails27.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#BalanceFrom
	 * IntraPositionDetails29.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#BalanceTo
	 * IntraPositionDetails29.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#BalanceTo
	 * IntraPositionMovementDetails1.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#BalanceFrom
	 * IntraPositionDetails3.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#BalanceTo
	 * IntraPositionMovementDetails2.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails6#BalanceFrom
	 * IntraPositionDetails6.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#BalanceTo
	 * IntraPositionMovementDetails5.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails17#BalanceFrom
	 * IntraPositionDetails17.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#BalanceTo
	 * IntraPositionMovementDetails6.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails18#BalanceFrom
	 * IntraPositionDetails18.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#BalanceTo
	 * IntraPositionMovementDetails7.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails20#BalanceFrom
	 * IntraPositionDetails20.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#BalanceTo
	 * IntraPositionMovementDetails8.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails24#BalanceFrom
	 * IntraPositionDetails24.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#BalanceTo
	 * IntraPositionMovementDetails9.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails28#BalanceFrom
	 * IntraPositionDetails28.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#BalanceTo
	 * IntraPositionMovementDetails10.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails30#BalanceFrom
	 * IntraPositionDetails30.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType3Choice#Code
	 * SubBalanceType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType3Choice#Proprietary
	 * SubBalanceType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType5Choice#Code
	 * SubBalanceType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType5Choice#Proprietary
	 * SubBalanceType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType4Choice#Code
	 * SubBalanceType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType4Choice#Proprietary
	 * SubBalanceType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType6Choice#Code
	 * SubBalanceType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType6Choice#Proprietary
	 * SubBalanceType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6#SubBalanceType
	 * AdditionalBalanceInformation6.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#SubBalanceType
	 * SubBalanceInformation6.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType7Choice#Code
	 * SubBalanceType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType7Choice#Proprietary
	 * SubBalanceType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType8Choice#Code
	 * SubBalanceType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType8Choice#Proprietary
	 * SubBalanceType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7#SubBalanceType
	 * AdditionalBalanceInformation7.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7#SubBalanceType
	 * SubBalanceInformation7.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType1Choice#Structured
	 * SecuritiesBalanceType1Choice.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType1Choice#Unstructured
	 * SecuritiesBalanceType1Choice.Unstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation#SubBalanceType
	 * AdditionalBalanceInformation.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation1#SubBalanceType
	 * SubBalanceInformation1.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#SubBalanceType
	 * AdditionalBalanceInformation2.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#ExtendedSubBalanceType
	 * AdditionalBalanceInformation2.ExtendedSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#SubBalanceType
	 * SubBalanceInformation2.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#ExtendedSubBalanceType
	 * SubBalanceInformation2.ExtendedSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5#SubBalanceType
	 * AdditionalBalanceInformation5.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#SubBalanceType
	 * SubBalanceInformation5.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8#SubBalanceType
	 * AdditionalBalanceInformation8.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#SubBalanceType
	 * SubBalanceInformation8.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#SubBalanceType
	 * AdditionalBalanceInformation9.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#SubBalanceType
	 * SubBalanceInformation9.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10#SubBalanceType
	 * AdditionalBalanceInformation10.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#SubBalanceType
	 * SubBalanceInformation10.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11#SubBalanceType
	 * AdditionalBalanceInformation11.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#SubBalanceType
	 * SubBalanceInformation11.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12#SubBalanceType
	 * AdditionalBalanceInformation12.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#SubBalanceType
	 * SubBalanceInformation12.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance2#BalanceType
	 * HoldingBalance2.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance3#BalanceType
	 * HoldingBalance3.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance6#BalanceType
	 * HoldingBalance6.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance4#BalanceType
	 * HoldingBalance4.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance5#BalanceType
	 * HoldingBalance5.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice#Code
	 * SecuritiesBalanceType10FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice#Proprietary
	 * SecuritiesBalanceType10FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#BalanceType
	 * SecuritiesAccount9.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice#Code
	 * SecuritiesBalanceType6FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice#Proprietary
	 * SecuritiesBalanceType6FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#BalanceType
	 * SecuritiesAccount12.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#BalanceType
	 * SecuritiesAccount8.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice#Code
	 * SecuritiesBalanceType9FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice#Proprietary
	 * SecuritiesBalanceType9FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#BalanceType
	 * SecuritiesAccount10.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType2Choice#Code
	 * SecuritiesBalanceType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType2Choice#Proprietary
	 * SecuritiesBalanceType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#BalanceFrom
	 * IntraPositionDetails1.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#BalanceTo
	 * IntraPositionDetails1.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#BalanceFrom
	 * IntraPositionDetails11.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#BalanceTo
	 * IntraPositionDetails11.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#BalanceFrom
	 * IntraPositionDetails4.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#BalanceTo
	 * IntraPositionDetails4.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#BalanceFrom
	 * IntraPositionDetails9.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#BalanceTo
	 * IntraPositionDetails9.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType4Choice#Code
	 * SecuritiesBalanceType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType4Choice#Proprietary
	 * SecuritiesBalanceType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#BalanceFrom
	 * IntraPositionDetails7.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#BalanceTo
	 * IntraPositionDetails7.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#BalanceFrom
	 * IntraPositionDetails16.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#BalanceTo
	 * IntraPositionDetails16.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#BalanceFrom
	 * IntraPositionDetails21.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#BalanceTo
	 * IntraPositionDetails21.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#BalanceFrom
	 * IntraPositionDetails25.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#BalanceTo
	 * IntraPositionDetails25.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#BalanceFrom
	 * IntraPositionDetails5.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#BalanceTo
	 * IntraPositionDetails5.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#BalanceFrom
	 * IntraPositionDetails15.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#BalanceTo
	 * IntraPositionDetails15.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#BalanceFrom
	 * IntraPositionDetails19.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#BalanceTo
	 * IntraPositionDetails19.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#BalanceFrom
	 * IntraPositionDetails23.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#BalanceTo
	 * IntraPositionDetails23.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType1Choice#SubBalanceType
	 * SubBalanceType1Choice.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType1Choice#Proprietary
	 * SubBalanceType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType2Choice#SubBalanceType
	 * SubBalanceType2Choice.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType2Choice#Proprietary
	 * SubBalanceType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation3#SubBalanceType
	 * SubBalanceInformation3.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#BalanceTo
	 * IntraPositionMovementDetails3.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails10#BalanceFrom
	 * IntraPositionDetails10.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#BalanceTo
	 * IntraPositionMovementDetails4.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails14#BalanceFrom
	 * IntraPositionDetails14.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation4#SubBalanceType
	 * AdditionalBalanceInformation4.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation4#SubBalanceType
	 * SubBalanceInformation4.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType9Choice#Code
	 * SubBalanceType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType9Choice#Proprietary
	 * SubBalanceType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1#SubBalanceType
	 * SubBalanceBreakdown1.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance8#BalanceType
	 * HoldingBalance8.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#BalanceType
	 * HoldingBalance7.BalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#BalanceFrom
	 * IntraPositionDetails31.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#BalanceTo
	 * IntraPositionDetails31.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#BalanceFrom
	 * IntraPositionDetails33.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#BalanceTo
	 * IntraPositionDetails33.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#BalanceFrom
	 * IntraPositionDetails34.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#BalanceTo
	 * IntraPositionDetails34.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#SubBalanceType
	 * SubBalanceInformation15.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType11Choice#Code
	 * SubBalanceType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType11Choice#Proprietary
	 * SubBalanceType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#SubBalanceType
	 * AdditionalBalanceInformation15.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#SubBalanceType
	 * AdditionalBalanceInformation14.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType12Choice#Code
	 * SubBalanceType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType12Choice#Proprietary
	 * SubBalanceType12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3#Type
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#SubBalanceType
	 * SubBalanceInformation14.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice#Code
	 * SecuritiesBalanceType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice#Proprietary
	 * SecuritiesBalanceType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#BalanceFrom
	 * IntraPositionDetails32.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice#Code
	 * SecuritiesBalanceType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice#Proprietary
	 * SecuritiesBalanceType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#BalanceTo
	 * IntraPositionMovementDetails11.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#BalanceFrom
	 * IntraPositionDetails35.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#BalanceTo
	 * IntraPositionDetails35.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#BalanceFrom
	 * IntraPositionDetails36.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#BalanceTo
	 * IntraPositionDetails36.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#BalanceFrom
	 * IntraPositionDetails38.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#BalanceTo
	 * IntraPositionDetails38.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation16#SubBalanceType
	 * AdditionalBalanceInformation16.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType14Choice#Code
	 * SubBalanceType14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType14Choice#Proprietary
	 * SubBalanceType14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown4#Type
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17#SubBalanceType
	 * AdditionalBalanceInformation17.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#SubBalanceType
	 * SubBalanceInformation17.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType11Choice#Code
	 * SecuritiesBalanceType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType11Choice#Proprietary
	 * SecuritiesBalanceType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16#SubBalanceType
	 * SubBalanceInformation16.SubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType13Choice#Code
	 * SubBalanceType13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType13Choice#Proprietary
	 * SubBalanceType13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#BalanceTo
	 * IntraPositionMovementDetails12.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType8Choice#Code
	 * SecuritiesBalanceType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType8Choice#Proprietary
	 * SecuritiesBalanceType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails37#BalanceFrom
	 * IntraPositionDetails37.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#BalanceFrom
	 * IntraPositionDetails41.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#BalanceTo
	 * IntraPositionDetails41.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#BalanceFrom
	 * IntraPositionDetails39.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#BalanceTo
	 * IntraPositionDetails39.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#BalanceFrom
	 * IntraPositionDetails40.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#BalanceTo
	 * IntraPositionMovementDetails13.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#BalanceFrom
	 * IntraPositionDetails43.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#BalanceTo
	 * IntraPositionDetails43.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#BalanceFrom
	 * IntraPositionDetails42.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#BalanceTo
	 * IntraPositionDetails42.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails44#BalanceFrom
	 * IntraPositionDetails44.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#BalanceTo
	 * IntraPositionMovementDetails14.BalanceTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesBalanceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesBalanceType3Choice.Code, com.tools20022.repository.choice.SecuritiesBalanceType3Choice.Proprietary,
					com.tools20022.repository.msg.IntraPositionDetails2.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails2.BalanceTo, com.tools20022.repository.choice.SecuritiesBalanceType5Choice.Code,
					com.tools20022.repository.choice.SecuritiesBalanceType5Choice.Proprietary, com.tools20022.repository.msg.IntraPositionDetails8.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails8.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails12.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails12.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails13.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails13.BalanceTo, com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1.Type, com.tools20022.repository.msg.IntraPositionDetails22.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails22.BalanceTo, com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2.Type, com.tools20022.repository.msg.IntraPositionDetails26.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails26.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails27.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails27.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails29.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails29.BalanceTo, com.tools20022.repository.msg.IntraPositionMovementDetails1.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails3.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails2.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails6.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails17.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails6.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails18.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails7.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails20.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionMovementDetails8.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails24.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails9.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails28.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails10.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails30.BalanceFrom,
					com.tools20022.repository.choice.SubBalanceType3Choice.Code, com.tools20022.repository.choice.SubBalanceType3Choice.Proprietary, com.tools20022.repository.choice.SubBalanceType5Choice.Code,
					com.tools20022.repository.choice.SubBalanceType5Choice.Proprietary, com.tools20022.repository.choice.SubBalanceType4Choice.Code, com.tools20022.repository.choice.SubBalanceType4Choice.Proprietary,
					com.tools20022.repository.choice.SubBalanceType6Choice.Code, com.tools20022.repository.choice.SubBalanceType6Choice.Proprietary, com.tools20022.repository.msg.AdditionalBalanceInformation6.SubBalanceType,
					com.tools20022.repository.msg.SubBalanceInformation6.SubBalanceType, com.tools20022.repository.choice.SubBalanceType7Choice.Code, com.tools20022.repository.choice.SubBalanceType7Choice.Proprietary,
					com.tools20022.repository.choice.SubBalanceType8Choice.Code, com.tools20022.repository.choice.SubBalanceType8Choice.Proprietary, com.tools20022.repository.msg.AdditionalBalanceInformation7.SubBalanceType,
					com.tools20022.repository.msg.SubBalanceInformation7.SubBalanceType, com.tools20022.repository.choice.SecuritiesBalanceType1Choice.Structured, com.tools20022.repository.choice.SecuritiesBalanceType1Choice.Unstructured,
					com.tools20022.repository.msg.AdditionalBalanceInformation.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation1.SubBalanceType, com.tools20022.repository.msg.AdditionalBalanceInformation2.SubBalanceType,
					com.tools20022.repository.msg.AdditionalBalanceInformation2.ExtendedSubBalanceType, com.tools20022.repository.msg.SubBalanceInformation2.SubBalanceType,
					com.tools20022.repository.msg.SubBalanceInformation2.ExtendedSubBalanceType, com.tools20022.repository.msg.AdditionalBalanceInformation5.SubBalanceType,
					com.tools20022.repository.msg.SubBalanceInformation5.SubBalanceType, com.tools20022.repository.msg.AdditionalBalanceInformation8.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation8.SubBalanceType,
					com.tools20022.repository.msg.AdditionalBalanceInformation9.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation9.SubBalanceType,
					com.tools20022.repository.msg.AdditionalBalanceInformation10.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation10.SubBalanceType,
					com.tools20022.repository.msg.AdditionalBalanceInformation11.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation11.SubBalanceType,
					com.tools20022.repository.msg.AdditionalBalanceInformation12.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation12.SubBalanceType, com.tools20022.repository.msg.HoldingBalance2.BalanceType,
					com.tools20022.repository.msg.HoldingBalance3.BalanceType, com.tools20022.repository.msg.HoldingBalance6.BalanceType, com.tools20022.repository.msg.HoldingBalance4.BalanceType,
					com.tools20022.repository.msg.HoldingBalance5.BalanceType, com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice.Code, com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice.Proprietary,
					com.tools20022.repository.msg.SecuritiesAccount9.BalanceType, com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice.Code, com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice.Proprietary,
					com.tools20022.repository.msg.SecuritiesAccount12.BalanceType, com.tools20022.repository.msg.SecuritiesAccount8.BalanceType, com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice.Code,
					com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice.Proprietary, com.tools20022.repository.msg.SecuritiesAccount10.BalanceType, com.tools20022.repository.choice.SecuritiesBalanceType2Choice.Code,
					com.tools20022.repository.choice.SecuritiesBalanceType2Choice.Proprietary, com.tools20022.repository.msg.IntraPositionDetails1.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails1.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails11.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails11.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails4.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails4.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails9.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails9.BalanceTo,
					com.tools20022.repository.choice.SecuritiesBalanceType4Choice.Code, com.tools20022.repository.choice.SecuritiesBalanceType4Choice.Proprietary, com.tools20022.repository.msg.IntraPositionDetails7.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails7.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails16.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails16.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails21.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails21.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails25.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails25.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails5.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails5.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails15.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails15.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails19.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails19.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails23.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails23.BalanceTo,
					com.tools20022.repository.choice.SubBalanceType1Choice.SubBalanceType, com.tools20022.repository.choice.SubBalanceType1Choice.Proprietary, com.tools20022.repository.choice.SubBalanceType2Choice.SubBalanceType,
					com.tools20022.repository.choice.SubBalanceType2Choice.Proprietary, com.tools20022.repository.msg.SubBalanceInformation3.SubBalanceType, com.tools20022.repository.msg.IntraPositionMovementDetails3.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails10.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails4.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails14.BalanceFrom,
					com.tools20022.repository.msg.AdditionalBalanceInformation4.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation4.SubBalanceType, com.tools20022.repository.choice.SubBalanceType9Choice.Code,
					com.tools20022.repository.choice.SubBalanceType9Choice.Proprietary, com.tools20022.repository.msg.SubBalanceBreakdown1.SubBalanceType, com.tools20022.repository.msg.HoldingBalance8.BalanceType,
					com.tools20022.repository.msg.HoldingBalance7.BalanceType, com.tools20022.repository.msg.IntraPositionDetails31.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails31.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails33.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails33.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails34.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails34.BalanceTo, com.tools20022.repository.msg.SubBalanceInformation15.SubBalanceType, com.tools20022.repository.choice.SubBalanceType11Choice.Code,
					com.tools20022.repository.choice.SubBalanceType11Choice.Proprietary, com.tools20022.repository.msg.AdditionalBalanceInformation15.SubBalanceType,
					com.tools20022.repository.msg.AdditionalBalanceInformation14.SubBalanceType, com.tools20022.repository.choice.SubBalanceType12Choice.Code, com.tools20022.repository.choice.SubBalanceType12Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3.Type, com.tools20022.repository.msg.SubBalanceInformation14.SubBalanceType, com.tools20022.repository.choice.SecuritiesBalanceType7Choice.Code,
					com.tools20022.repository.choice.SecuritiesBalanceType7Choice.Proprietary, com.tools20022.repository.msg.IntraPositionDetails32.BalanceFrom, com.tools20022.repository.choice.SecuritiesBalanceType6Choice.Code,
					com.tools20022.repository.choice.SecuritiesBalanceType6Choice.Proprietary, com.tools20022.repository.msg.IntraPositionMovementDetails11.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails35.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails35.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails36.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails36.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails38.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails38.BalanceTo, com.tools20022.repository.msg.AdditionalBalanceInformation16.SubBalanceType,
					com.tools20022.repository.choice.SubBalanceType14Choice.Code, com.tools20022.repository.choice.SubBalanceType14Choice.Proprietary, com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown4.Type,
					com.tools20022.repository.msg.AdditionalBalanceInformation17.SubBalanceType, com.tools20022.repository.msg.SubBalanceInformation17.SubBalanceType, com.tools20022.repository.choice.SecuritiesBalanceType11Choice.Code,
					com.tools20022.repository.choice.SecuritiesBalanceType11Choice.Proprietary, com.tools20022.repository.msg.SubBalanceInformation16.SubBalanceType, com.tools20022.repository.choice.SubBalanceType13Choice.Code,
					com.tools20022.repository.choice.SubBalanceType13Choice.Proprietary, com.tools20022.repository.msg.IntraPositionMovementDetails12.BalanceTo, com.tools20022.repository.choice.SecuritiesBalanceType8Choice.Code,
					com.tools20022.repository.choice.SecuritiesBalanceType8Choice.Proprietary, com.tools20022.repository.msg.IntraPositionDetails37.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails41.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails41.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails39.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails39.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails40.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails13.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails43.BalanceFrom,
					com.tools20022.repository.msg.IntraPositionDetails43.BalanceTo, com.tools20022.repository.msg.IntraPositionDetails42.BalanceFrom, com.tools20022.repository.msg.IntraPositionDetails42.BalanceTo,
					com.tools20022.repository.msg.IntraPositionDetails44.BalanceFrom, com.tools20022.repository.msg.IntraPositionMovementDetails14.BalanceTo);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalanceType";
			definition = "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
		}
	};
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in a securities account, for instance. sub-balance
	 * per type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedSubBalance
	 * SecuritiesQuantity.RelatedSubBalance}</li>
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
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice#Quantity
	 * SubBalanceQuantity3Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice#Proprietary
	 * SubBalanceQuantity3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6#Quantity
	 * AdditionalBalanceInformation6.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#Quantity
	 * SubBalanceInformation6.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice#Quantity
	 * SubBalanceQuantity4Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice#Proprietary
	 * SubBalanceQuantity4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7#Quantity
	 * AdditionalBalanceInformation7.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7#Quantity
	 * SubBalanceInformation7.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#Quantity
	 * SubBalanceQuantity1Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#QuantityAsDSS
	 * SubBalanceQuantity1Choice.QuantityAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation#Quantity
	 * AdditionalBalanceInformation.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation1#Quantity
	 * SubBalanceInformation1.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#Quantity
	 * AdditionalBalanceInformation2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#Quantity
	 * SubBalanceInformation2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5#Quantity
	 * AdditionalBalanceInformation5.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#Quantity
	 * SubBalanceInformation5.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8#Quantity
	 * AdditionalBalanceInformation8.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#Quantity
	 * SubBalanceInformation8.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#Quantity
	 * AdditionalBalanceInformation9.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#Quantity
	 * SubBalanceInformation9.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10#Quantity
	 * AdditionalBalanceInformation10.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#Quantity
	 * SubBalanceInformation10.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11#Quantity
	 * AdditionalBalanceInformation11.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#Quantity
	 * SubBalanceInformation11.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12#Quantity
	 * AdditionalBalanceInformation12.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#Quantity
	 * SubBalanceInformation12.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation3#Quantity
	 * AdditionalBalanceInformation3.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation3#Quantity
	 * SubBalanceInformation3.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity2Choice#Quantity
	 * SubBalanceQuantity2Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity2Choice#Proprietary
	 * SubBalanceQuantity2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation4#Quantity
	 * AdditionalBalanceInformation4.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation4#Quantity
	 * SubBalanceInformation4.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1#Quantity
	 * SubBalanceBreakdown1.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice#Quantity
	 * SubBalanceQuantity5Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice#Proprietary
	 * SubBalanceQuantity5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#Quantity
	 * SubBalanceInformation15.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#Quantity
	 * SubBalanceQuantity6Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#Proprietary
	 * SubBalanceQuantity6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#Quantity
	 * AdditionalBalanceInformation15.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#Quantity
	 * AdditionalBalanceInformation14.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#Quantity
	 * SubBalanceInformation14.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation16#Quantity
	 * AdditionalBalanceInformation16.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#Quantity
	 * SubBalanceQuantity7Choice.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#Proprietary
	 * SubBalanceQuantity7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17#Quantity
	 * AdditionalBalanceInformation17.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#Quantity
	 * SubBalanceInformation17.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16#Quantity
	 * SubBalanceInformation16.Quantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubBalanceQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SubBalanceQuantity3Choice.Quantity, com.tools20022.repository.choice.SubBalanceQuantity3Choice.Proprietary,
					com.tools20022.repository.msg.AdditionalBalanceInformation6.Quantity, com.tools20022.repository.msg.SubBalanceInformation6.Quantity, com.tools20022.repository.choice.SubBalanceQuantity4Choice.Quantity,
					com.tools20022.repository.choice.SubBalanceQuantity4Choice.Proprietary, com.tools20022.repository.msg.AdditionalBalanceInformation7.Quantity, com.tools20022.repository.msg.SubBalanceInformation7.Quantity,
					com.tools20022.repository.choice.SubBalanceQuantity1Choice.Quantity, com.tools20022.repository.choice.SubBalanceQuantity1Choice.QuantityAsDSS, com.tools20022.repository.msg.AdditionalBalanceInformation.Quantity,
					com.tools20022.repository.msg.SubBalanceInformation1.Quantity, com.tools20022.repository.msg.AdditionalBalanceInformation2.Quantity, com.tools20022.repository.msg.SubBalanceInformation2.Quantity,
					com.tools20022.repository.msg.AdditionalBalanceInformation5.Quantity, com.tools20022.repository.msg.SubBalanceInformation5.Quantity, com.tools20022.repository.msg.AdditionalBalanceInformation8.Quantity,
					com.tools20022.repository.msg.SubBalanceInformation8.Quantity, com.tools20022.repository.msg.AdditionalBalanceInformation9.Quantity, com.tools20022.repository.msg.SubBalanceInformation9.Quantity,
					com.tools20022.repository.msg.AdditionalBalanceInformation10.Quantity, com.tools20022.repository.msg.SubBalanceInformation10.Quantity, com.tools20022.repository.msg.AdditionalBalanceInformation11.Quantity,
					com.tools20022.repository.msg.SubBalanceInformation11.Quantity, com.tools20022.repository.msg.AdditionalBalanceInformation12.Quantity, com.tools20022.repository.msg.SubBalanceInformation12.Quantity,
					com.tools20022.repository.msg.AdditionalBalanceInformation3.Quantity, com.tools20022.repository.msg.SubBalanceInformation3.Quantity, com.tools20022.repository.choice.SubBalanceQuantity2Choice.Quantity,
					com.tools20022.repository.choice.SubBalanceQuantity2Choice.Proprietary, com.tools20022.repository.msg.AdditionalBalanceInformation4.Quantity, com.tools20022.repository.msg.SubBalanceInformation4.Quantity,
					com.tools20022.repository.msg.SubBalanceBreakdown1.Quantity, com.tools20022.repository.choice.SubBalanceQuantity5Choice.Quantity, com.tools20022.repository.choice.SubBalanceQuantity5Choice.Proprietary,
					com.tools20022.repository.msg.SubBalanceInformation15.Quantity, com.tools20022.repository.choice.SubBalanceQuantity6Choice.Quantity, com.tools20022.repository.choice.SubBalanceQuantity6Choice.Proprietary,
					com.tools20022.repository.msg.AdditionalBalanceInformation15.Quantity, com.tools20022.repository.msg.AdditionalBalanceInformation14.Quantity, com.tools20022.repository.msg.SubBalanceInformation14.Quantity,
					com.tools20022.repository.msg.AdditionalBalanceInformation16.Quantity, com.tools20022.repository.choice.SubBalanceQuantity7Choice.Quantity, com.tools20022.repository.choice.SubBalanceQuantity7Choice.Proprietary,
					com.tools20022.repository.msg.AdditionalBalanceInformation17.Quantity, com.tools20022.repository.msg.SubBalanceInformation17.Quantity, com.tools20022.repository.msg.SubBalanceInformation16.Quantity);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubBalanceQuantity";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which a balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Balance
	 * Security.Balance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#FinancialInstrumentAttributes
	 * AggregateBalanceInformation8.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#FinancialInstrumentAttributes
	 * AggregateBalanceInformation11.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#FinancialInstrumentAttributes
	 * AggregateBalanceInformation13.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#FinancialInstrumentAttributes
	 * AggregateBalanceInformation15.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#FinancialInstrumentAttributes
	 * AggregateBalanceInformation17.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#FinancialInstrumentAttributes
	 * AggregateBalanceInformation19.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#FinancialInstrumentAttributes
	 * AggregateBalanceInformation22.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#FinancialInstrumentAttributes
	 * AggregateBalanceInformation23.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#FinancialInstrumentAttributes
	 * AggregateBalanceInformation9.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#FinancialInstrumentAttributes
	 * AggregateBalanceInformation10.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#FinancialInstrumentAttributes
	 * AggregateBalanceInformation12.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#FinancialInstrumentAttributes
	 * AggregateBalanceInformation14.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#FinancialInstrumentAttributes
	 * AggregateBalanceInformation16.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#FinancialInstrumentAttributes
	 * AggregateBalanceInformation18.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#FinancialInstrumentAttributes
	 * AggregateBalanceInformation21.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#FinancialInstrumentAttributes
	 * AggregateBalanceInformation24.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#FinancialInstrumentAttributes
	 * AggregateBalanceInformation20.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#FinancialInstrumentAttributes
	 * AggregateBalanceInformation26.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#FinancialInstrumentAttributes
	 * AggregateBalanceInformation25.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#FinancialInstrumentAttributes
	 * AggregateBalanceInformation28.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#FinancialInstrumentAttributes
	 * AggregateBalanceInformation27.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#FinancialInstrumentAttributes
	 * AggregateBalanceInformation30.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#FinancialInstrumentAttributes
	 * AggregateBalanceInformation31.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#FinancialInstrumentAttributes
	 * AggregateBalanceInformation32.FinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#FinancialInstrumentAttributes
	 * AggregateBalanceInformation33.FinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a balance is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalanceInformation8.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation11.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation13.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation15.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation17.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation19.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation22.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation23.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation9.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation10.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation12.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation14.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation16.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation18.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation21.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation24.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation20.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation26.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation25.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation28.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation27.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation30.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation31.FinancialInstrumentAttributes, com.tools20022.repository.msg.AggregateBalanceInformation32.FinancialInstrumentAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation33.FinancialInstrumentAttributes);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a balance is calculated.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the exchange rate used to convert the balance value in another
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesBalance
	 * CurrencyExchange.CurrencyExchangeForSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace7.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#ForeignExchangeDetails
	 * AggregateBalanceInformation8.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace10.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#ForeignExchangeDetails
	 * AggregateBalanceInformation11.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace2.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#ForeignExchangeDetails
	 * AggregateBalanceInformation2.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#ForeignExchangeDetails
	 * AggregateBalanceInformation3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace12.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#ForeignExchangeDetails
	 * AggregateBalanceInformation13.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace14.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#ForeignExchangeDetails
	 * AggregateBalanceInformation15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace16.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#ForeignExchangeDetails
	 * AggregateBalanceInformation17.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace18.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#ForeignExchangeDetails
	 * AggregateBalanceInformation19.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace21.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#ForeignExchangeDetails
	 * AggregateBalanceInformation22.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace22.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#ForeignExchangeDetails
	 * AggregateBalanceInformation23.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace8.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#ForeignExchangeDetails
	 * AggregateBalanceInformation9.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace9.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#ForeignExchangeDetails
	 * AggregateBalanceInformation10.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace1.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#ForeignExchangeDetails
	 * AggregateBalanceInformation1.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace3.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#ForeignExchangeDetails
	 * AggregateBalanceInformation4.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace11.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#ForeignExchangeDetails
	 * AggregateBalanceInformation12.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace13.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#ForeignExchangeDetails
	 * AggregateBalanceInformation14.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace15.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#ForeignExchangeDetails
	 * AggregateBalanceInformation16.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace17.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#ForeignExchangeDetails
	 * AggregateBalanceInformation18.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace20.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#ForeignExchangeDetails
	 * AggregateBalanceInformation21.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace23.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#ForeignExchangeDetails
	 * AggregateBalanceInformation24.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#ForeignExchangeDetails
	 * AggregateBalanceInformation5.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace19.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#ForeignExchangeDetails
	 * AggregateBalanceInformation20.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace6.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#ForeignExchangeDetails
	 * AggregateBalanceInformation6.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace5.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#ForeignExchangeDetails
	 * AggregateBalanceInformation7.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#ForeignExchangeDetails
	 * AggregateBalanceInformation26.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#ForeignExchangeDetails
	 * AggregateBalanceInformation25.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace24.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace25.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#ForeignExchangeDetails
	 * AggregateBalanceInformation28.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#ForeignExchangeDetails
	 * AggregateBalanceInformation27.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace26.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace27.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#ForeignExchangeDetails
	 * AggregateBalanceInformation30.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#ForeignExchangeDetails
	 * AggregateBalanceInformation31.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace28.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace29.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#ForeignExchangeDetails
	 * AggregateBalanceInformation32.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#ForeignExchangeDetails
	 * AggregateBalanceInformation33.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace31.ForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#ForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace30.ForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate used to convert the balance value in another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation8.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation11.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation2.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation3.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation13.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation15.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation17.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation19.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation22.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation23.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation9.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation10.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation1.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation4.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation12.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation14.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation16.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation18.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation21.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation24.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation5.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation20.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation6.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation7.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation26.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation25.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation28.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation27.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation30.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation31.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalanceInformation32.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation33.ForeignExchangeDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.ForeignExchangeDetails,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.ForeignExchangeDetails);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the balance value in another currency.";
			minOccurs = 0;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the quantity of securities on the balance is available.
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability#AvailabilityIndicator
	 * QuantityAndAvailability.AvailabilityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the quantity of securities on the balance is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AvailabilityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityAndAvailability.AvailabilityIndicator);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailabilityIndicator";
			definition = "Indicates whether the quantity of securities on the balance is available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#AvailableQuantityBalance
	 * SecuritiesQuantity.AvailableQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace8.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#AvailableBalance
	 * AggregateBalanceInformation9.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace9.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#AvailableBalance
	 * AggregateBalanceInformation10.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#AvailableQuantity
	 * AggregateBalancePerSafekeepingPlace1.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#AvailableQuantity
	 * AggregateBalanceInformation1.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#AvailableQuantity
	 * AggregateBalancePerSafekeepingPlace3.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#AvailableQuantity
	 * AggregateBalanceInformation4.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace11.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#AvailableBalance
	 * AggregateBalanceInformation12.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace13.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#AvailableBalance
	 * AggregateBalanceInformation14.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace15.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#AvailableBalance
	 * AggregateBalanceInformation16.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace17.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#AvailableBalance
	 * AggregateBalanceInformation18.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace20.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#AvailableBalance
	 * AggregateBalanceInformation21.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace23.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#AvailableBalance
	 * AggregateBalanceInformation24.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace19.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#AvailableBalance
	 * AggregateBalanceInformation20.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#AvailableQuantity
	 * AggregateBalancePerSafekeepingPlace5.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#AvailableQuantity
	 * AggregateBalanceInformation7.AvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#AvailableBalance
	 * AggregateBalanceInformation25.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace24.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#AvailableBalance
	 * AggregateBalanceInformation28.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace27.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#AvailableBalance
	 * AggregateBalanceInformation30.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace28.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#AvailableBalance
	 * AggregateBalanceInformation33.AvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#AvailableBalance
	 * AggregateBalancePerSafekeepingPlace31.AvailableBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AvailableQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation9.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation10.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.AvailableQuantity, com.tools20022.repository.msg.AggregateBalanceInformation1.AvailableQuantity,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.AvailableQuantity, com.tools20022.repository.msg.AggregateBalanceInformation4.AvailableQuantity,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation12.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation14.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation16.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation18.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation21.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation24.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.AvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation20.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.AvailableQuantity, com.tools20022.repository.msg.AggregateBalanceInformation7.AvailableQuantity,
					com.tools20022.repository.msg.AggregateBalanceInformation25.AvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalanceInformation28.AvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalanceInformation30.AvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AvailableBalance,
					com.tools20022.repository.msg.AggregateBalanceInformation33.AvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.AvailableBalance);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is available.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entitlement for which an eligible posistion is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EligiblePosition
	 * MeetingEntitlement.EligiblePosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitlement for which an eligible posistion is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingEntitlement";
			definition = "Entitlement for which an eligible posistion is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MeetingEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is not
	 * available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#UnavailableQuantityBalance
	 * SecuritiesQuantity.UnavailableQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments of the balance that is not available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnavailableQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Safekeeping place at which the securities are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesBalance
	 * SafekeepingPlace.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Safekeeping place at which the securities are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place at which the securities are held.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Postings used to calculate a balance. It is derived from the association
	 * between Balance and Entry
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesBalance
	 * SecuritiesEntry.SecuritiesBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Postings used to calculate a balance. It is derived from the association between Balance and Entry"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Postings used to calculate a balance. It is derived from the association between Balance and Entry";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action entitlement for which a non eligible balance is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#NotEligibleBalance
	 * CorporateActionEntitlement.NotEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalanceRelatedEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action entitlement for which a non eligible balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NotEligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which a non eligible balance is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.NotEligibleBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer between two balances or sub balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#SecuritiesBalance
	 * IntraPositionTransfer.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIntraPositionTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer between two balances or sub balances."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer between two balances or sub balances.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> IntraPositionTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the amount added or substracted to the original cost of a
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount added or substracted to the original cost of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CostAdjustment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostAdjustment";
			definition = "Specifies the amount added or substracted to the original cost of a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Pledgee at which the securities are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee#SecuritiesBalance
	 * Pledgee.SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#Pledgee
	 * AggregateBalancePerSafekeepingPlace24.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#Pledgee
	 * AggregateBalancePerSafekeepingPlace25.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#Pledgee
	 * AggregateBalancePerSafekeepingPlace26.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#Pledgee
	 * AggregateBalancePerSafekeepingPlace27.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#Pledgee
	 * AggregateBalancePerSafekeepingPlace28.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#Pledgee
	 * AggregateBalancePerSafekeepingPlace29.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#Pledgee
	 * AggregateBalancePerSafekeepingPlace31.Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#Pledgee
	 * AggregateBalancePerSafekeepingPlace30.Pledgee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledgee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pledgee at which the securities are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Pledgee = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.Pledgee, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.Pledgee,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.Pledgee, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.Pledgee,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.Pledgee, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.Pledgee,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.Pledgee, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.Pledgee);
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pledgee";
			definition = "Pledgee at which the securities are held.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Pledgee.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Pledgee.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalance";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Balance, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance,
						com.tools20022.repository.entity.SecuritiesEntry.SecuritiesBalance, com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance, com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.SecuritiesBalance, com.tools20022.repository.entity.CorporateActionEntitlement.InstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.UninstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.NotEligibleBalance,
						com.tools20022.repository.entity.IntraPositionTransfer.SecuritiesBalance, com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition, com.tools20022.repository.entity.Pledgee.SecuritiesBalance);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BalanceFormat1Choice.Balance, com.tools20022.repository.choice.BalanceFormat1Choice.EligibleBalance,
						com.tools20022.repository.choice.BalanceFormat1Choice.NotEligibleBalance, com.tools20022.repository.choice.BalanceFormat2Choice.Balance, com.tools20022.repository.choice.BalanceFormat2Choice.EligibleBalance,
						com.tools20022.repository.choice.BalanceFormat2Choice.NotEligibleBalance, com.tools20022.repository.choice.BalanceFormat3Choice.Balance, com.tools20022.repository.choice.BalanceFormat3Choice.EligibleBalance,
						com.tools20022.repository.choice.BalanceFormat3Choice.NotEligibleBalance, com.tools20022.repository.choice.BalanceFormat3Choice.FullPeriodUnits,
						com.tools20022.repository.choice.BalanceFormat3Choice.PartWayPeriodUnits, com.tools20022.repository.choice.BalanceFormat4Choice.Balance, com.tools20022.repository.choice.BalanceFormat4Choice.EligibleBalance,
						com.tools20022.repository.choice.BalanceFormat4Choice.NotEligibleBalance, com.tools20022.repository.choice.BalanceFormat4Choice.FullPeriodUnits,
						com.tools20022.repository.choice.BalanceFormat4Choice.PartWayPeriodUnits, com.tools20022.repository.msg.Balance1.Quantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation8.AggregateBalance, com.tools20022.repository.msg.Balance2.Quantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation11.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation2.AggregateQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation3.AggregateQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation13.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation15.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation17.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation19.AggregateBalance, com.tools20022.repository.msg.Balance4.Quantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation22.AggregateBalance, com.tools20022.repository.msg.Balance5.Quantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation23.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation9.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation9.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation10.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation10.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.NotAvailableQuantity, com.tools20022.repository.msg.AggregateBalanceInformation1.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalanceInformation1.NotAvailableQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.NotAvailableQuantity, com.tools20022.repository.msg.AggregateBalanceInformation4.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalanceInformation4.NotAvailableQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation12.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation12.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation14.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation14.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation16.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation16.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation18.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation18.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation21.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation21.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalanceInformation24.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation24.NotAvailableBalance, com.tools20022.repository.msg.ClosingBalance1.ClosingBalance, com.tools20022.repository.msg.ClosingBalance2.ClosingBalance,
						com.tools20022.repository.msg.AccountingStatementOfHoldings1.BalanceForAccount, com.tools20022.repository.msg.AccountingStatementOfHoldings2.BalanceForAccount,
						com.tools20022.repository.msg.CustodyStatementOfHoldings1.BalanceForAccount, com.tools20022.repository.msg.CustodyStatementOfHoldings2.BalanceForAccount, com.tools20022.repository.msg.SecurityPosition5.Position,
						com.tools20022.repository.msg.SecurityPosition6.Position, com.tools20022.repository.msg.SecurityPosition7.Position, com.tools20022.repository.msg.AggregateBalanceInformation5.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.NotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation20.AggregateBalance, com.tools20022.repository.msg.AggregateBalanceInformation20.NotAvailableBalance,
						com.tools20022.repository.msg.Balance3.BalanceForAccount, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalanceInformation6.AggregateQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.NotAvailableQuantity, com.tools20022.repository.msg.AggregateBalanceInformation7.AggregateQuantity,
						com.tools20022.repository.msg.AggregateBalanceInformation7.NotAvailableQuantity, com.tools20022.repository.msg.TotalEligibleBalanceFormat1.FullPeriodUnits,
						com.tools20022.repository.msg.TotalEligibleBalanceFormat1.PartWayPeriodUnits, com.tools20022.repository.msg.TotalEligibleBalanceFormat4.FullPeriodUnits,
						com.tools20022.repository.msg.TotalEligibleBalanceFormat4.PartWayPeriodUnits, com.tools20022.repository.msg.SafekeepingAccount5.BalanceForAccount,
						com.tools20022.repository.msg.SafekeepingAccount5.AccountSubLevel1Difference, com.tools20022.repository.msg.AggregateHoldingBalance2.BalanceForFinancialInstrument,
						com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2.BalanceBreakdown, com.tools20022.repository.msg.AccountSubLevel1.BalanceForAccount,
						com.tools20022.repository.msg.AccountSubLevel1.AccountSubLevel2Difference, com.tools20022.repository.msg.AccountSubLevel4.BalanceForAccount, com.tools20022.repository.msg.AccountSubLevel4.AccountSubLevel5Difference,
						com.tools20022.repository.msg.AccountSubLevel5.BalanceForAccount, com.tools20022.repository.msg.AccountSubLevel5.AccountSubLevel6Difference, com.tools20022.repository.msg.AccountSubLevel2.BalanceForAccount,
						com.tools20022.repository.msg.AccountSubLevel2.AccountSubLevel3Difference, com.tools20022.repository.msg.AccountSubLevel3.BalanceForAccount, com.tools20022.repository.msg.AccountSubLevel3.AccountSubLevel4Difference,
						com.tools20022.repository.msg.AccountSubLevel6.BalanceForAccount, com.tools20022.repository.msg.AccountSubLevel6.AccountSubLevel7Difference, com.tools20022.repository.msg.AccountSubLevel7.BalanceForAccount,
						com.tools20022.repository.msg.AccountSubLevel7.AccountSubLevel8Difference, com.tools20022.repository.msg.AccountSubLevel8.BalanceForAccount, com.tools20022.repository.msg.AccountSubLevel8.AccountSubLevel9Difference,
						com.tools20022.repository.msg.AccountSubLevel9.BalanceForAccount, com.tools20022.repository.msg.AggregateBalanceInformation26.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation25.AggregateBalance, com.tools20022.repository.msg.AggregateBalanceInformation25.NotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.NotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.AggregateBalance, com.tools20022.repository.msg.SecurityPosition8.Position, com.tools20022.repository.msg.SecurityPosition9.Position,
						com.tools20022.repository.msg.AggregateBalanceInformation28.AggregateBalance, com.tools20022.repository.msg.AggregateBalanceInformation28.NotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation27.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.NotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation30.AggregateBalance, com.tools20022.repository.msg.AggregateBalanceInformation30.NotAvailableBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation31.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.NotAvailableBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.AggregateBalance,
						com.tools20022.repository.msg.Balance6.Quantity, com.tools20022.repository.msg.ClosingBalance3.ClosingBalance, com.tools20022.repository.msg.Balance7.Quantity,
						com.tools20022.repository.choice.BalanceFormat5Choice.Balance, com.tools20022.repository.choice.BalanceFormat5Choice.EligibleBalance, com.tools20022.repository.choice.BalanceFormat5Choice.NotEligibleBalance,
						com.tools20022.repository.msg.TotalEligibleBalanceFormat8.FullPeriodUnits, com.tools20022.repository.msg.TotalEligibleBalanceFormat8.PartWayPeriodUnits, com.tools20022.repository.choice.BalanceFormat6Choice.Balance,
						com.tools20022.repository.choice.BalanceFormat6Choice.EligibleBalance, com.tools20022.repository.choice.BalanceFormat6Choice.NotEligibleBalance, com.tools20022.repository.choice.BalanceFormat6Choice.FullPeriodUnits,
						com.tools20022.repository.choice.BalanceFormat6Choice.PartWayPeriodUnits, com.tools20022.repository.msg.Balance9.Quantity, com.tools20022.repository.msg.Balance8.Quantity,
						com.tools20022.repository.choice.BalanceFormat7Choice.Balance, com.tools20022.repository.choice.BalanceFormat7Choice.EligibleBalance, com.tools20022.repository.choice.BalanceFormat7Choice.NotEligibleBalance,
						com.tools20022.repository.msg.TotalEligibleBalanceFormat9.FullPeriodUnits, com.tools20022.repository.msg.TotalEligibleBalanceFormat9.PartWayPeriodUnits,
						com.tools20022.repository.choice.BalanceFormat10Choice.Balance, com.tools20022.repository.choice.BalanceFormat10Choice.EligibleBalance, com.tools20022.repository.choice.BalanceFormat10Choice.NotEligibleBalance,
						com.tools20022.repository.choice.BalanceFormat10Choice.FullPeriodUnits, com.tools20022.repository.choice.BalanceFormat10Choice.PartWayPeriodUnits,
						com.tools20022.repository.msg.AggregateBalanceInformation32.AggregateBalance, com.tools20022.repository.msg.AggregateBalanceInformation33.AggregateBalance,
						com.tools20022.repository.msg.AggregateBalanceInformation33.NotAvailableBalance, com.tools20022.repository.msg.Balance11.Quantity,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.AggregateBalance, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.NotAvailableBalance,
						com.tools20022.repository.msg.ClosingBalance4.ClosingBalance, com.tools20022.repository.msg.Balance10.Quantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.AggregateBalance,
						com.tools20022.repository.msg.Balance13.Quantity, com.tools20022.repository.msg.Balance12.Quantity, com.tools20022.repository.msg.SafekeepingAccount7.BalanceDetails,
						com.tools20022.repository.msg.SafekeepingAccount7.AccountSubLevel1Difference, com.tools20022.repository.msg.AccountSubLevel15.BalanceDetails,
						com.tools20022.repository.msg.AccountSubLevel15.AccountSubLevel6Difference, com.tools20022.repository.msg.AccountSubLevel16.BalanceDetails, com.tools20022.repository.msg.AccountSubLevel16.AccountSubLevel7Difference,
						com.tools20022.repository.msg.AggregateHoldingBalance3.BalanceForAccount, com.tools20022.repository.msg.AccountSubLevel18.BalanceDetails, com.tools20022.repository.msg.AccountSubLevel18.AccountSubLevel9Difference,
						com.tools20022.repository.msg.AccountSubLevel19.BalanceDetails, com.tools20022.repository.msg.AccountSubLevel11.BalanceDetails, com.tools20022.repository.msg.AccountSubLevel11.AccountSubLevel2Difference,
						com.tools20022.repository.msg.AccountSubLevel12.BalanceDetails, com.tools20022.repository.msg.AccountSubLevel12.AccountSubLevel3Difference, com.tools20022.repository.msg.AccountSubLevel17.BalanceDetails,
						com.tools20022.repository.msg.AccountSubLevel17.AccountSubLevel8Difference, com.tools20022.repository.msg.AccountSubLevel13.BalanceDetails, com.tools20022.repository.msg.AccountSubLevel13.AccountSubLevel4Difference,
						com.tools20022.repository.msg.AccountSubLevel14.BalanceDetails, com.tools20022.repository.msg.AccountSubLevel14.AccountSubLevel5Difference);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.NetGainLoss, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesBalance.EligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.ShortLong,
						com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.CorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.InstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.UninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance,
						com.tools20022.repository.entity.SecuritiesBalance.SecuritiesBalanceType, com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.Security,
						com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate, com.tools20022.repository.entity.SecuritiesBalance.AvailabilityIndicator, com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.RelatedMeetingEntitlement, com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.SafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesBalance.NotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.RelatedIntraPositionTransfer,
						com.tools20022.repository.entity.SecuritiesBalance.CostAdjustment, com.tools20022.repository.entity.SecuritiesBalance.Pledgee);
				derivationComponent_lazy = () -> Arrays.asList(OpeningClosing1Choice.mmObject(), OpeningClosing2Choice.mmObject(), SignedQuantityFormat2.mmObject(), SignedQuantityFormat1.mmObject(), BalanceFormat1Choice.mmObject(),
						SignedQuantityFormat4.mmObject(), SignedQuantityFormat3.mmObject(), BalanceFormat2Choice.mmObject(), BalanceFormat3Choice.mmObject(), BalanceFormat4Choice.mmObject(), SecuritiesBalanceType3Choice.mmObject(),
						SecuritiesBalanceType5Choice.mmObject(), SecuritiesSubBalanceTypeAndQuantityBreakdown1.mmObject(), SecuritiesSubBalanceTypeAndQuantityBreakdown2.mmObject(), BalanceQuantity4Choice.mmObject(), Balance1.mmObject(),
						SubBalanceType3Choice.mmObject(), SubBalanceType5Choice.mmObject(), SubBalanceQuantity3Choice.mmObject(), SubBalanceType4Choice.mmObject(), SubBalanceType6Choice.mmObject(), AdditionalBalanceInformation6.mmObject(),
						SubBalanceInformation6.mmObject(), AggregateBalancePerSafekeepingPlace7.mmObject(), AggregateBalanceInformation8.mmObject(), BalanceQuantity6Choice.mmObject(), Balance2.mmObject(), SubBalanceType7Choice.mmObject(),
						SubBalanceQuantity4Choice.mmObject(), SubBalanceType8Choice.mmObject(), AdditionalBalanceInformation7.mmObject(), SubBalanceInformation7.mmObject(), AggregateBalancePerSafekeepingPlace10.mmObject(),
						AggregateBalanceInformation11.mmObject(), BalanceQuantity1Choice.mmObject(), QuantityAndAvailability.mmObject(), SubBalanceQuantity1Choice.mmObject(), SecuritiesBalanceType1Choice.mmObject(),
						AdditionalBalanceInformation.mmObject(), SubBalanceInformation1.mmObject(), AggregateBalancePerSafekeepingPlace2.mmObject(), AggregateBalanceInformation2.mmObject(), AdditionalBalanceInformation2.mmObject(),
						SubBalanceInformation2.mmObject(), AggregateBalancePerSafekeepingPlace4.mmObject(), AggregateBalanceInformation3.mmObject(), AggregateBalancePerSafekeepingPlace12.mmObject(),
						AggregateBalanceInformation13.mmObject(), AggregateBalancePerSafekeepingPlace14.mmObject(), AggregateBalanceInformation15.mmObject(), AggregateBalancePerSafekeepingPlace16.mmObject(),
						AggregateBalanceInformation17.mmObject(), AggregateBalancePerSafekeepingPlace18.mmObject(), AggregateBalanceInformation19.mmObject(), Balance4.mmObject(), AggregateBalancePerSafekeepingPlace21.mmObject(),
						AggregateBalanceInformation22.mmObject(), Balance5.mmObject(), AggregateBalancePerSafekeepingPlace22.mmObject(), AggregateBalanceInformation23.mmObject(), BalanceQuantity5Choice.mmObject(),
						AdditionalBalanceInformation5.mmObject(), SubBalanceInformation5.mmObject(), AggregateBalancePerSafekeepingPlace8.mmObject(), AggregateBalanceInformation9.mmObject(), BalanceQuantity7Choice.mmObject(),
						AdditionalBalanceInformation8.mmObject(), SubBalanceInformation8.mmObject(), AggregateBalancePerSafekeepingPlace9.mmObject(), AggregateBalanceInformation10.mmObject(),
						AggregateBalancePerSafekeepingPlace1.mmObject(), AggregateBalanceInformation1.mmObject(), AggregateBalancePerSafekeepingPlace3.mmObject(), AggregateBalanceInformation4.mmObject(),
						AggregateBalancePerSafekeepingPlace11.mmObject(), AggregateBalanceInformation12.mmObject(), AggregateBalancePerSafekeepingPlace13.mmObject(), AggregateBalanceInformation14.mmObject(),
						AdditionalBalanceInformation9.mmObject(), SubBalanceInformation9.mmObject(), AggregateBalancePerSafekeepingPlace15.mmObject(), AggregateBalanceInformation16.mmObject(), AdditionalBalanceInformation10.mmObject(),
						SubBalanceInformation10.mmObject(), AggregateBalancePerSafekeepingPlace17.mmObject(), AggregateBalanceInformation18.mmObject(), AdditionalBalanceInformation11.mmObject(), SubBalanceInformation11.mmObject(),
						AggregateBalancePerSafekeepingPlace20.mmObject(), AggregateBalanceInformation21.mmObject(), AdditionalBalanceInformation12.mmObject(), SubBalanceInformation12.mmObject(),
						AggregateBalancePerSafekeepingPlace23.mmObject(), AggregateBalanceInformation24.mmObject(), OpeningBalance1Choice.mmObject(), OpeningBalance1.mmObject(), ClosingBalance1Choice.mmObject(), ClosingBalance1.mmObject(),
						OpeningBalance2Choice.mmObject(), OpeningBalance2.mmObject(), ClosingBalance2Choice.mmObject(), ClosingBalance2.mmObject(), AccountingStatementOfHoldings1.mmObject(), AccountingStatementOfHoldings2.mmObject(),
						CustodyStatementOfHoldings1.mmObject(), CustodyStatementOfHoldings2.mmObject(), HoldingBalance2.mmObject(), EligiblePosition.mmObject(), SecurityPosition.mmObject(), HoldingBalance3.mmObject(),
						EligiblePosition2.mmObject(), SecurityPosition5.mmObject(), HoldingBalance6.mmObject(), EligiblePosition3.mmObject(), SecurityPosition6.mmObject(), EligiblePosition4.mmObject(), SecurityPosition7.mmObject(),
						HoldingBalance4.mmObject(), HoldingBalance5.mmObject(), EligiblePosition1.mmObject(), SecurityPosition4.mmObject(), SecurityPosition3.mmObject(), SecuritiesBalanceType10FormatChoice.mmObject(),
						SecuritiesBalanceType6FormatChoice.mmObject(), SecuritiesBalanceType9FormatChoice.mmObject(), SecuritiesBalanceType2Choice.mmObject(), SecuritiesBalanceType4Choice.mmObject(), SubBalanceType1Choice.mmObject(),
						AdditionalBalanceInformation3.mmObject(), SubBalanceType2Choice.mmObject(), SubBalanceInformation3.mmObject(), AggregateBalanceInformation5.mmObject(), SubBalanceQuantity2Choice.mmObject(),
						IntraPositionType1.mmObject(), AggregateBalancePerSafekeepingPlace19.mmObject(), AggregateBalanceInformation20.mmObject(), Balance3.mmObject(), BalanceQuantity2Choice.mmObject(),
						AdditionalBalanceInformation4.mmObject(), SubBalanceInformation4.mmObject(), AggregateBalancePerSafekeepingPlace6.mmObject(), AggregateBalanceInformation6.mmObject(), BalanceQuantity3Choice.mmObject(),
						AggregateBalancePerSafekeepingPlace5.mmObject(), AggregateBalanceInformation7.mmObject(), TotalEligibleBalanceFormat1.mmObject(), SignedQuantityFormat5.mmObject(), TotalEligibleBalanceFormat4.mmObject(),
						AggregateHoldingBalance2.mmObject(), SubBalanceType9Choice.mmObject(), FinancialInstrumentAggregateBalance2.mmObject(), SubBalanceBreakdown1.mmObject(), SubBalanceQuantity5Choice.mmObject(),
						AggregateBalanceInformation26.mmObject(), AggregateBalanceInformation25.mmObject(), AggregateBalancePerSafekeepingPlace24.mmObject(), AggregateBalancePerSafekeepingPlace25.mmObject(), SecurityPosition8.mmObject(),
						SecurityPosition9.mmObject(), HoldingBalance8.mmObject(), EligiblePosition5.mmObject(), HoldingBalance7.mmObject(), EligiblePosition6.mmObject(), AggregateHoldingBalance1.mmObject(),
						AggregateBalanceInformation28.mmObject(), AggregateBalanceInformation27.mmObject(), AggregateBalancePerSafekeepingPlace26.mmObject(), AggregateBalancePerSafekeepingPlace27.mmObject(),
						AggregateBalanceInformation30.mmObject(), AggregateBalanceInformation31.mmObject(), AggregateBalancePerSafekeepingPlace28.mmObject(), AggregateBalancePerSafekeepingPlace29.mmObject(),
						SubBalanceInformation15.mmObject(), SubBalanceType11Choice.mmObject(), SubBalanceQuantity6Choice.mmObject(), AdditionalBalanceInformation15.mmObject(), OpeningClosing3Choice.mmObject(),
						AdditionalBalanceInformation14.mmObject(), SubBalanceType12Choice.mmObject(), SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject(), Balance6.mmObject(), SubBalanceInformation14.mmObject(),
						SecuritiesBalanceType7Choice.mmObject(), SecuritiesBalanceType6Choice.mmObject(), OpeningBalance3.mmObject(), ClosingBalance3.mmObject(), Balance7.mmObject(), ClosingBalance4Choice.mmObject(),
						BalanceQuantity8Choice.mmObject(), OpeningBalance4Choice.mmObject(), BalanceQuantity9Choice.mmObject(), BalanceFormat5Choice.mmObject(), SignedQuantityFormat7.mmObject(), SignedQuantityFormat6.mmObject(),
						TotalEligibleBalanceFormat8.mmObject(), BalanceFormat6Choice.mmObject(), Balance9.mmObject(), Balance8.mmObject(), BalanceFormat7Choice.mmObject(), TotalEligibleBalanceFormat9.mmObject(),
						SignedQuantityFormat9.mmObject(), BalanceFormat10Choice.mmObject(), SignedQuantityFormat8.mmObject(), AggregateBalanceInformation32.mmObject(), AggregateBalanceInformation33.mmObject(),
						AdditionalBalanceInformation16.mmObject(), SubBalanceType14Choice.mmObject(), SubBalanceQuantity7Choice.mmObject(), SecuritiesSubBalanceTypeAndQuantityBreakdown4.mmObject(), Balance11.mmObject(),
						BalanceQuantity10Choice.mmObject(), OpeningClosing4Choice.mmObject(), AggregateBalancePerSafekeepingPlace31.mmObject(), BalanceQuantity12Choice.mmObject(), AdditionalBalanceInformation17.mmObject(),
						SubBalanceInformation17.mmObject(), ClosingBalance5Choice.mmObject(), SecuritiesBalanceType11Choice.mmObject(), OpeningBalance5Choice.mmObject(), SubBalanceInformation16.mmObject(),
						SubBalanceType13Choice.mmObject(), ClosingBalance4.mmObject(), OpeningBalance4.mmObject(), Balance10.mmObject(), AggregateBalancePerSafekeepingPlace30.mmObject(), SecuritiesBalanceType8Choice.mmObject(),
						Balance13.mmObject(), Balance12.mmObject(), AggregateHoldingBalance3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}