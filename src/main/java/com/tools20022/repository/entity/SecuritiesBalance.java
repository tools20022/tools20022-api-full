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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code;
import com.tools20022.repository.codeset.ShortLongCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNetGainLoss
 * SecuritiesBalance.mmNetGainLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
 * SecuritiesBalance.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmShortLong
 * SecuritiesBalance.mmShortLong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
 * SecuritiesBalance.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmMainSecuritiesBalance
 * SecuritiesBalance.mmMainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
 * SecuritiesBalance.mmSubBalanceQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecurity
 * SecuritiesBalance.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
 * SecuritiesBalance.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailabilityIndicator
 * SecuritiesBalance.mmAvailabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
 * SecuritiesBalance.mmAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedMeetingEntitlement
 * SecuritiesBalance.mmRelatedMeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUnavailableQuantity
 * SecuritiesBalance.mmUnavailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
 * SecuritiesBalance.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesEntry
 * SecuritiesBalance.mmSecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedIntraPositionTransfer
 * SecuritiesBalance.mmRelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCostAdjustment
 * SecuritiesBalance.mmCostAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmPledgee
 * SecuritiesBalance.mmPledgee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmBalance
 * Security.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
 * SecuritiesAccount.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedSubBalance
 * SecuritiesQuantity.mmRelatedSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAvailableQuantityBalance
 * SecuritiesQuantity.mmAvailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnavailableQuantityBalance
 * SecuritiesQuantity.mmUnavailableQuantityBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesBalance
 * SecuritiesEntry.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesBalance
 * SafekeepingPlace.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmMainSecuritiesBalance
 * SecuritiesBalance.mmMainSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
 * CorporateActionEntitlement.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
 * CorporateActionEntitlement.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
 * CorporateActionEntitlement.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmNotEligibleBalance
 * CorporateActionEntitlement.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmSecuritiesBalance
 * IntraPositionTransfer.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEligiblePosition
 * MeetingEntitlement.mmEligiblePosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#mmSecuritiesBalance
 * Pledgee.mmSecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice#mmBalance
 * BalanceFormat1Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice#mmEligibleBalance
 * BalanceFormat1Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice#mmNotEligibleBalance
 * BalanceFormat1Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#mmBalance
 * BalanceFormat2Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#mmEligibleBalance
 * BalanceFormat2Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice#mmNotEligibleBalance
 * BalanceFormat2Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmBalance
 * BalanceFormat3Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmEligibleBalance
 * BalanceFormat3Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmNotEligibleBalance
 * BalanceFormat3Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmFullPeriodUnits
 * BalanceFormat3Choice.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmPartWayPeriodUnits
 * BalanceFormat3Choice.mmPartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#mmBalance
 * BalanceFormat4Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#mmEligibleBalance
 * BalanceFormat4Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#mmNotEligibleBalance
 * BalanceFormat4Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#mmFullPeriodUnits
 * BalanceFormat4Choice.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat4Choice#mmPartWayPeriodUnits
 * BalanceFormat4Choice.mmPartWayPeriodUnits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance1#mmQuantity
 * Balance1.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace7.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAggregateBalance
 * AggregateBalanceInformation8.mmAggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance2#mmQuantity
 * Balance2.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace10.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmAggregateBalance
 * AggregateBalanceInformation11.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace2.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmAggregateQuantity
 * AggregateBalanceInformation2.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace4.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmAggregateQuantity
 * AggregateBalanceInformation3.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace12.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmAggregateBalance
 * AggregateBalanceInformation13.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace14.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmAggregateBalance
 * AggregateBalanceInformation15.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace16.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmAggregateBalance
 * AggregateBalanceInformation17.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace18.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmAggregateBalance
 * AggregateBalanceInformation19.mmAggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance4#mmQuantity
 * Balance4.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace21.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmAggregateBalance
 * AggregateBalanceInformation22.mmAggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance5#mmQuantity
 * Balance5.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace22.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmAggregateBalance
 * AggregateBalanceInformation23.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace8.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace8.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmAggregateBalance
 * AggregateBalanceInformation9.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmNotAvailableBalance
 * AggregateBalanceInformation9.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace9.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace9.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmAggregateBalance
 * AggregateBalanceInformation10.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmNotAvailableBalance
 * AggregateBalanceInformation10.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAggregateQuantity
 * AggregateBalancePerSafekeepingPlace1.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmNotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace1.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmAggregateQuantity
 * AggregateBalanceInformation1.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmNotAvailableQuantity
 * AggregateBalanceInformation1.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAggregateQuantity
 * AggregateBalancePerSafekeepingPlace3.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmNotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace3.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAggregateQuantity
 * AggregateBalanceInformation4.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmNotAvailableQuantity
 * AggregateBalanceInformation4.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace11.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace11.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmAggregateBalance
 * AggregateBalanceInformation12.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmNotAvailableBalance
 * AggregateBalanceInformation12.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace13.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace13.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmAggregateBalance
 * AggregateBalanceInformation14.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmNotAvailableBalance
 * AggregateBalanceInformation14.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace15.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace15.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmAggregateBalance
 * AggregateBalanceInformation16.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmNotAvailableBalance
 * AggregateBalanceInformation16.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace17.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace17.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmAggregateBalance
 * AggregateBalanceInformation18.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmNotAvailableBalance
 * AggregateBalanceInformation18.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace20.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace20.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmAggregateBalance
 * AggregateBalanceInformation21.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmNotAvailableBalance
 * AggregateBalanceInformation21.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace23.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace23.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmAggregateBalance
 * AggregateBalanceInformation24.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmNotAvailableBalance
 * AggregateBalanceInformation24.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClosingBalance1#mmClosingBalance
 * ClosingBalance1.mmClosingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClosingBalance2#mmClosingBalance
 * ClosingBalance2.mmClosingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1#mmBalanceForAccount
 * AccountingStatementOfHoldings1.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#mmBalanceForAccount
 * AccountingStatementOfHoldings2.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmBalanceForAccount
 * CustodyStatementOfHoldings1.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmBalanceForAccount
 * CustodyStatementOfHoldings2.mmBalanceForAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition5#mmPosition
 * SecurityPosition5.mmPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition6#mmPosition
 * SecurityPosition6.mmPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition7#mmPosition
 * SecurityPosition7.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmAggregateQuantity
 * AggregateBalanceInformation5.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace19.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace19.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmAggregateBalance
 * AggregateBalanceInformation20.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmNotAvailableBalance
 * AggregateBalanceInformation20.mmNotAvailableBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance3#mmBalanceForAccount
 * Balance3.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAggregateQuantity
 * AggregateBalancePerSafekeepingPlace6.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmAggregateQuantity
 * AggregateBalanceInformation6.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmAggregateQuantity
 * AggregateBalancePerSafekeepingPlace5.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmNotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace5.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmAggregateQuantity
 * AggregateBalanceInformation7.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmNotAvailableQuantity
 * AggregateBalanceInformation7.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#mmFullPeriodUnits
 * TotalEligibleBalanceFormat1.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#mmPartWayPeriodUnits
 * TotalEligibleBalanceFormat1.mmPartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat4#mmFullPeriodUnits
 * TotalEligibleBalanceFormat4.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat4#mmPartWayPeriodUnits
 * TotalEligibleBalanceFormat4.mmPartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmBalanceForAccount
 * SafekeepingAccount5.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountSubLevel1Difference
 * SafekeepingAccount5.mmAccountSubLevel1Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2#mmBalanceForFinancialInstrument
 * AggregateHoldingBalance2.mmBalanceForFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance2#mmBalanceBreakdown
 * FinancialInstrumentAggregateBalance2.mmBalanceBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#mmBalanceForAccount
 * AccountSubLevel1.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#mmAccountSubLevel2Difference
 * AccountSubLevel1.mmAccountSubLevel2Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#mmBalanceForAccount
 * AccountSubLevel4.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#mmAccountSubLevel5Difference
 * AccountSubLevel4.mmAccountSubLevel5Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#mmBalanceForAccount
 * AccountSubLevel5.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#mmAccountSubLevel6Difference
 * AccountSubLevel5.mmAccountSubLevel6Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#mmBalanceForAccount
 * AccountSubLevel2.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#mmAccountSubLevel3Difference
 * AccountSubLevel2.mmAccountSubLevel3Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#mmBalanceForAccount
 * AccountSubLevel3.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#mmAccountSubLevel4Difference
 * AccountSubLevel3.mmAccountSubLevel4Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#mmBalanceForAccount
 * AccountSubLevel6.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#mmAccountSubLevel7Difference
 * AccountSubLevel6.mmAccountSubLevel7Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#mmBalanceForAccount
 * AccountSubLevel7.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#mmAccountSubLevel8Difference
 * AccountSubLevel7.mmAccountSubLevel8Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmBalanceForAccount
 * AccountSubLevel8.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountSubLevel9Difference
 * AccountSubLevel8.mmAccountSubLevel9Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel9#mmBalanceForAccount
 * AccountSubLevel9.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmAggregateBalance
 * AggregateBalanceInformation26.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmAggregateBalance
 * AggregateBalanceInformation25.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmNotAvailableBalance
 * AggregateBalanceInformation25.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace24.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace24.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace25.mmAggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition8#mmPosition
 * SecurityPosition8.mmPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition9#mmPosition
 * SecurityPosition9.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmAggregateBalance
 * AggregateBalanceInformation28.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmNotAvailableBalance
 * AggregateBalanceInformation28.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmAggregateBalance
 * AggregateBalanceInformation27.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace26.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace27.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace27.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmAggregateBalance
 * AggregateBalanceInformation30.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmNotAvailableBalance
 * AggregateBalanceInformation30.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAggregateBalance
 * AggregateBalanceInformation31.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace28.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace28.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace29.mmAggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance6#mmQuantity
 * Balance6.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClosingBalance3#mmClosingBalance
 * ClosingBalance3.mmClosingBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance7#mmQuantity
 * Balance7.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#mmBalance
 * BalanceFormat5Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#mmEligibleBalance
 * BalanceFormat5Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice#mmNotEligibleBalance
 * BalanceFormat5Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmFullPeriodUnits
 * TotalEligibleBalanceFormat8.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmPartWayPeriodUnits
 * TotalEligibleBalanceFormat8.mmPartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmBalance
 * BalanceFormat6Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmEligibleBalance
 * BalanceFormat6Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmNotEligibleBalance
 * BalanceFormat6Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmFullPeriodUnits
 * BalanceFormat6Choice.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmPartWayPeriodUnits
 * BalanceFormat6Choice.mmPartWayPeriodUnits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance9#mmQuantity
 * Balance9.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance8#mmQuantity
 * Balance8.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice#mmBalance
 * BalanceFormat7Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice#mmEligibleBalance
 * BalanceFormat7Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice#mmNotEligibleBalance
 * BalanceFormat7Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#mmFullPeriodUnits
 * TotalEligibleBalanceFormat9.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#mmPartWayPeriodUnits
 * TotalEligibleBalanceFormat9.mmPartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#mmBalance
 * BalanceFormat10Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#mmEligibleBalance
 * BalanceFormat10Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#mmNotEligibleBalance
 * BalanceFormat10Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#mmFullPeriodUnits
 * BalanceFormat10Choice.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice#mmPartWayPeriodUnits
 * BalanceFormat10Choice.mmPartWayPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmAggregateBalance
 * AggregateBalanceInformation32.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAggregateBalance
 * AggregateBalanceInformation33.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmNotAvailableBalance
 * AggregateBalanceInformation33.mmNotAvailableBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance11#mmQuantity
 * Balance11.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace31.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmNotAvailableBalance
 * AggregateBalancePerSafekeepingPlace31.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClosingBalance4#mmClosingBalance
 * ClosingBalance4.mmClosingBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance10#mmQuantity
 * Balance10.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmAggregateBalance
 * AggregateBalancePerSafekeepingPlace30.mmAggregateBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance13#mmQuantity
 * Balance13.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance12#mmQuantity
 * Balance12.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Balance14#mmBalanceForAccount
 * Balance14.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmAggregateBalance
 * AggregateBalanceInformation34.mmAggregateBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmNotAvailableBalance
 * AggregateBalanceInformation34.mmNotAvailableBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmBalanceDetails
 * SafekeepingAccount7.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountSubLevel1Difference
 * SafekeepingAccount7.mmAccountSubLevel1Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmBalanceDetails
 * AccountSubLevel15.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountSubLevel6Difference
 * AccountSubLevel15.mmAccountSubLevel6Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmBalanceDetails
 * AccountSubLevel16.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountSubLevel7Difference
 * AccountSubLevel16.mmAccountSubLevel7Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3#mmBalanceForAccount
 * AggregateHoldingBalance3.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmBalanceDetails
 * AccountSubLevel18.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountSubLevel9Difference
 * AccountSubLevel18.mmAccountSubLevel9Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmBalanceDetails
 * AccountSubLevel19.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmBalanceDetails
 * AccountSubLevel11.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountSubLevel2Difference
 * AccountSubLevel11.mmAccountSubLevel2Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmBalanceDetails
 * AccountSubLevel12.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountSubLevel3Difference
 * AccountSubLevel12.mmAccountSubLevel3Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmBalanceDetails
 * AccountSubLevel17.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountSubLevel8Difference
 * AccountSubLevel17.mmAccountSubLevel8Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmBalanceDetails
 * AccountSubLevel13.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountSubLevel4Difference
 * AccountSubLevel13.mmAccountSubLevel4Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmBalanceDetails
 * AccountSubLevel14.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountSubLevel5Difference
 * AccountSubLevel14.mmAccountSubLevel5Difference}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.Balance14 Balance14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34
 * AggregateBalanceInformation34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionType2
 * IntraPositionType2}</li>
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
	protected CurrencyAndAmount netGainLoss;
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
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmNetGainLoss
	 * OtherAmounts12.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmNetGainLoss
	 * OtherAmounts14.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmNetGainLoss
	 * OtherAmounts20.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmNetGainLoss
	 * OtherAmounts4.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmNetGainLoss
	 * OtherAmounts5.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmNetGainLoss
	 * OtherAmounts17.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmNetGainLoss
	 * OtherAmounts23.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmNetGainLoss
	 * OtherAmounts3.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmNetGainLoss
	 * OtherAmounts7.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmNetGainLoss
	 * OtherAmounts9.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmNetGainLoss
	 * OtherAmounts10.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmNetGainLoss
	 * OtherAmounts18.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmNetGainLoss
	 * OtherAmounts24.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmNetGainLoss
	 * OtherAmounts13.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmNetGainLoss
	 * OtherAmounts1.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmNetGainLoss
	 * OtherAmounts16.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmNetGainLoss
	 * OtherAmounts28.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmNetGainLoss
	 * OtherAmounts30.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmNetGainLoss
	 * OtherAmounts31.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmNetGainLoss
	 * OtherAmounts35.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmNetGainLoss
	 * OtherAmounts34.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmNetGainLoss
	 * OtherAmounts38.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmNetGainLoss
	 * OtherAmounts41.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmNetGainLoss
	 * OtherAmounts39.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmNetGainLoss
	 * OtherAmounts40.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts42#mmNetGainLoss
	 * OtherAmounts42.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts43#mmNetGainLoss
	 * OtherAmounts43.mmNetGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts44#mmNetGainLoss
	 * OtherAmounts44.mmNetGainLoss}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ANTO</li>
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
	public static final MMBusinessAttribute mmNetGainLoss = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts12.mmNetGainLoss, OtherAmounts14.mmNetGainLoss, OtherAmounts20.mmNetGainLoss, OtherAmounts4.mmNetGainLoss, OtherAmounts5.mmNetGainLoss, OtherAmounts17.mmNetGainLoss,
					OtherAmounts23.mmNetGainLoss, OtherAmounts3.mmNetGainLoss, OtherAmounts7.mmNetGainLoss, OtherAmounts9.mmNetGainLoss, OtherAmounts10.mmNetGainLoss, OtherAmounts18.mmNetGainLoss, OtherAmounts24.mmNetGainLoss,
					OtherAmounts13.mmNetGainLoss, OtherAmounts1.mmNetGainLoss, OtherAmounts16.mmNetGainLoss, OtherAmounts28.mmNetGainLoss, OtherAmounts30.mmNetGainLoss, OtherAmounts31.mmNetGainLoss, OtherAmounts35.mmNetGainLoss,
					OtherAmounts34.mmNetGainLoss, OtherAmounts38.mmNetGainLoss, OtherAmounts41.mmNetGainLoss, OtherAmounts39.mmNetGainLoss, OtherAmounts40.mmNetGainLoss, OtherAmounts42.mmNetGainLoss, OtherAmounts43.mmNetGainLoss,
					OtherAmounts44.mmNetGainLoss);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ANTO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getNetGainLoss", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
	 * SecuritiesAccount.mmSecuritiesBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1#mmAccountDetails
	 * AccountingStatementOfHoldings1.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#mmAccountDetails
	 * AccountingStatementOfHoldings2.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmAccountDetails
	 * CustodyStatementOfHoldings1.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3#mmAccount
	 * SecurityPosition3.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation2#mmSafekeepingAccount
	 * IntraPositionCancellation2.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance3#mmSafekeepingAccount
	 * Balance3.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance14#mmSafekeepingAccount
	 * Balance14.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation4#mmSafekeepingAccount
	 * IntraPositionCancellation4.mmSafekeepingAccount}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountingStatementOfHoldings1.mmAccountDetails, AccountingStatementOfHoldings2.mmAccountDetails, CustodyStatementOfHoldings1.mmAccountDetails, SecurityPosition3.mmAccount,
					IntraPositionCancellation2.mmSafekeepingAccount, Balance3.mmSafekeepingAccount, Balance14.mmSafekeepingAccount, IntraPositionCancellation4.mmSafekeepingAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected CorporateActionEntitlement eligibleBalanceRelatedEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
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
	public static final MMBusinessAssociationEnd mmEligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an eligible balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected ShortLongCode shortLong;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat2#mmShortLongPosition
	 * SignedQuantityFormat2.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1#mmShortLongPosition
	 * SignedQuantityFormat1.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4#mmShortLongPosition
	 * SignedQuantityFormat4.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3#mmShortLongPosition
	 * SignedQuantityFormat3.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance1#mmShortLongIndicator
	 * Balance1.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance2#mmShortLongIndicator
	 * Balance2.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance4#mmShortLongIndicator
	 * Balance4.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance5#mmShortLongIndicator
	 * Balance5.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance1#mmShortLongIndicator
	 * OpeningBalance1.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance1#mmShortLongIndicator
	 * ClosingBalance1.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance2#mmShortLongIndicator
	 * OpeningBalance2.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance2#mmShortLongIndicator
	 * ClosingBalance2.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmShortLong
	 * AggregateBalancePerSafekeepingPlace6.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmShortLong
	 * AggregateBalanceInformation6.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmShortLong
	 * AggregateBalancePerSafekeepingPlace5.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmShortLong
	 * AggregateBalanceInformation7.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat5#mmShortLongPosition
	 * SignedQuantityFormat5.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance6#mmShortLongIndicator
	 * Balance6.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmShortLongIndicator
	 * OpeningBalance3.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance3#mmShortLongIndicator
	 * ClosingBalance3.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance7#mmShortLongIndicator
	 * Balance7.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#mmShortLongPosition
	 * SignedQuantityFormat7.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6#mmShortLongPosition
	 * SignedQuantityFormat6.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance9#mmShortLongIndicator
	 * Balance9.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance8#mmShortLongIndicator
	 * Balance8.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9#mmShortLongPosition
	 * SignedQuantityFormat9.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat8#mmShortLongPosition
	 * SignedQuantityFormat8.mmShortLongPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance11#mmShortLongIndicator
	 * Balance11.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClosingBalance4#mmShortLongIndicator
	 * ClosingBalance4.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance4#mmShortLongIndicator
	 * OpeningBalance4.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance10#mmShortLongIndicator
	 * Balance10.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance13#mmShortLongIndicator
	 * Balance13.mmShortLongIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance12#mmShortLongIndicator
	 * Balance12.mmShortLongIndicator}</li>
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
	public static final MMBusinessAttribute mmShortLong = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SignedQuantityFormat2.mmShortLongPosition, SignedQuantityFormat1.mmShortLongPosition, SignedQuantityFormat4.mmShortLongPosition, SignedQuantityFormat3.mmShortLongPosition,
					Balance1.mmShortLongIndicator, Balance2.mmShortLongIndicator, Balance4.mmShortLongIndicator, Balance5.mmShortLongIndicator, OpeningBalance1.mmShortLongIndicator, ClosingBalance1.mmShortLongIndicator,
					OpeningBalance2.mmShortLongIndicator, ClosingBalance2.mmShortLongIndicator, AggregateBalancePerSafekeepingPlace6.mmShortLong, AggregateBalanceInformation6.mmShortLong, AggregateBalancePerSafekeepingPlace5.mmShortLong,
					AggregateBalanceInformation7.mmShortLong, SignedQuantityFormat5.mmShortLongPosition, Balance6.mmShortLongIndicator, OpeningBalance3.mmShortLongIndicator, ClosingBalance3.mmShortLongIndicator,
					Balance7.mmShortLongIndicator, SignedQuantityFormat7.mmShortLongPosition, SignedQuantityFormat6.mmShortLongPosition, Balance9.mmShortLongIndicator, Balance8.mmShortLongIndicator,
					SignedQuantityFormat9.mmShortLongPosition, SignedQuantityFormat8.mmShortLongPosition, Balance11.mmShortLongIndicator, ClosingBalance4.mmShortLongIndicator, OpeningBalance4.mmShortLongIndicator,
					Balance10.mmShortLongIndicator, Balance13.mmShortLongIndicator, Balance12.mmShortLongIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortLong";
			definition = "Indication that the position is short or long.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLongCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getShortLong", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity aggregateQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
	 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat2#mmQuantity
	 * SignedQuantityFormat2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1#mmQuantityChoice
	 * SignedQuantityFormat1.mmQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4#mmQuantity
	 * SignedQuantityFormat4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3#mmQuantityChoice
	 * SignedQuantityFormat3.mmQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity4Choice#mmQuantity
	 * BalanceQuantity4Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity4Choice#mmProprietary
	 * BalanceQuantity4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity6Choice#mmQuantity
	 * BalanceQuantity6Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity6Choice#mmProprietary
	 * BalanceQuantity6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice#mmQuantity
	 * BalanceQuantity1Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice#mmQuantityAsDSS
	 * BalanceQuantity1Choice.mmQuantityAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice#mmQuantity
	 * BalanceQuantity5Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice#mmProprietary
	 * BalanceQuantity5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity7Choice#mmQuantity
	 * BalanceQuantity7Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity7Choice#mmProprietary
	 * BalanceQuantity7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance1Choice#mmFirst
	 * OpeningBalance1Choice.mmFirst}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance1Choice#mmIntermediary
	 * OpeningBalance1Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance1#mmOpeningBalance
	 * OpeningBalance1.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance1Choice#mmFinal
	 * ClosingBalance1Choice.mmFinal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance1Choice#mmIntermediary
	 * ClosingBalance1Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance2Choice#mmFirst
	 * OpeningBalance2Choice.mmFirst}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance2Choice#mmIntermediary
	 * OpeningBalance2Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance2#mmOpeningBalance
	 * OpeningBalance2.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance2Choice#mmFinal
	 * ClosingBalance2Choice.mmFinal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance2Choice#mmIntermediary
	 * ClosingBalance2Choice.mmIntermediary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance2#mmBalance
	 * HoldingBalance2.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance3#mmBalance
	 * HoldingBalance3.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance6#mmBalance
	 * HoldingBalance6.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance4#mmBalance
	 * HoldingBalance4.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance5#mmBalance
	 * HoldingBalance5.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity2Choice#mmQuantity
	 * BalanceQuantity2Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity2Choice#mmProprietary
	 * BalanceQuantity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice#mmQuantity
	 * BalanceQuantity3Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice#mmProprietary
	 * BalanceQuantity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat1#mmBalance
	 * TotalEligibleBalanceFormat1.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat5#mmQuantity
	 * SignedQuantityFormat5.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat4#mmBalance
	 * TotalEligibleBalanceFormat4.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance8#mmBalance
	 * HoldingBalance8.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7#mmBalance
	 * HoldingBalance7.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmOpeningBalance
	 * OpeningBalance3.mmOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#mmFinal
	 * ClosingBalance4Choice.mmFinal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#mmIntermediary
	 * ClosingBalance4Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice#mmQuantity
	 * BalanceQuantity8Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice#mmProprietary
	 * BalanceQuantity8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance4Choice#mmFirst
	 * OpeningBalance4Choice.mmFirst}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance4Choice#mmIntermediary
	 * OpeningBalance4Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice#mmQuantity
	 * BalanceQuantity9Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity9Choice#mmProprietary
	 * BalanceQuantity9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#mmQuantityChoice
	 * SignedQuantityFormat7.mmQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6#mmQuantity
	 * SignedQuantityFormat6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8#mmBalance
	 * TotalEligibleBalanceFormat8.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9#mmBalance
	 * TotalEligibleBalanceFormat9.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9#mmQuantity
	 * SignedQuantityFormat9.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat8#mmQuantityChoice
	 * SignedQuantityFormat8.mmQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity10Choice#mmQuantity
	 * BalanceQuantity10Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity10Choice#mmProprietary
	 * BalanceQuantity10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity12Choice#mmQuantity
	 * BalanceQuantity12Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity12Choice#mmProprietary
	 * BalanceQuantity12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance5Choice#mmFinal
	 * ClosingBalance5Choice.mmFinal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance5Choice#mmIntermediary
	 * ClosingBalance5Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance5Choice#mmFirst
	 * OpeningBalance5Choice.mmFirst}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance5Choice#mmIntermediary
	 * OpeningBalance5Choice.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance4#mmOpeningBalance
	 * OpeningBalance4.mmOpeningBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::AGGR</li>
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
	public static final MMBusinessAssociationEnd mmAggregateQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SignedQuantityFormat2.mmQuantity, SignedQuantityFormat1.mmQuantityChoice, SignedQuantityFormat4.mmQuantity, SignedQuantityFormat3.mmQuantityChoice, BalanceQuantity4Choice.mmQuantity,
					BalanceQuantity4Choice.mmProprietary, BalanceQuantity6Choice.mmQuantity, BalanceQuantity6Choice.mmProprietary, BalanceQuantity1Choice.mmQuantity, BalanceQuantity1Choice.mmQuantityAsDSS,
					BalanceQuantity5Choice.mmQuantity, BalanceQuantity5Choice.mmProprietary, BalanceQuantity7Choice.mmQuantity, BalanceQuantity7Choice.mmProprietary, OpeningBalance1Choice.mmFirst, OpeningBalance1Choice.mmIntermediary,
					OpeningBalance1.mmOpeningBalance, ClosingBalance1Choice.mmFinal, ClosingBalance1Choice.mmIntermediary, OpeningBalance2Choice.mmFirst, OpeningBalance2Choice.mmIntermediary, OpeningBalance2.mmOpeningBalance,
					ClosingBalance2Choice.mmFinal, ClosingBalance2Choice.mmIntermediary, HoldingBalance2.mmBalance, HoldingBalance3.mmBalance, HoldingBalance6.mmBalance, HoldingBalance4.mmBalance, HoldingBalance5.mmBalance,
					BalanceQuantity2Choice.mmQuantity, BalanceQuantity2Choice.mmProprietary, BalanceQuantity3Choice.mmQuantity, BalanceQuantity3Choice.mmProprietary, TotalEligibleBalanceFormat1.mmBalance, SignedQuantityFormat5.mmQuantity,
					TotalEligibleBalanceFormat4.mmBalance, HoldingBalance8.mmBalance, HoldingBalance7.mmBalance, OpeningBalance3.mmOpeningBalance, ClosingBalance4Choice.mmFinal, ClosingBalance4Choice.mmIntermediary,
					BalanceQuantity8Choice.mmQuantity, BalanceQuantity8Choice.mmProprietary, OpeningBalance4Choice.mmFirst, OpeningBalance4Choice.mmIntermediary, BalanceQuantity9Choice.mmQuantity, BalanceQuantity9Choice.mmProprietary,
					SignedQuantityFormat7.mmQuantityChoice, SignedQuantityFormat6.mmQuantity, TotalEligibleBalanceFormat8.mmBalance, TotalEligibleBalanceFormat9.mmBalance, SignedQuantityFormat9.mmQuantity,
					SignedQuantityFormat8.mmQuantityChoice, BalanceQuantity10Choice.mmQuantity, BalanceQuantity10Choice.mmProprietary, BalanceQuantity12Choice.mmQuantity, BalanceQuantity12Choice.mmProprietary,
					ClosingBalance5Choice.mmFinal, ClosingBalance5Choice.mmIntermediary, OpeningBalance5Choice.mmFirst, OpeningBalance5Choice.mmIntermediary, OpeningBalance4.mmOpeningBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::AGGR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantity";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmAggregateQuantityBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CorporateActionEntitlement corporateActionEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Corporate action entitlement for which a balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected CorporateActionEntitlement instructedBalanceRelatedEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
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
	public static final MMBusinessAssociationEnd mmInstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an instructed balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected CorporateActionEntitlement uninstructedBalanceRelatedEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
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
	public static final MMBusinessAssociationEnd mmUninstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an uninstructed balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected SecuritiesBalance mainSecuritiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
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
	public static final MMBusinessAssociationEnd mmMainSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MainSecuritiesBalance";
			definition = "Balance which is divided in sub-balances.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesSubBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> securitiesSubBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmMainSecuritiesBalance
	 * SecuritiesBalance.mmMainSecuritiesBalance}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance1#mmBalance
	 * PendingBalance1.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance2#mmBalance
	 * PendingBalance2.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity3Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation6.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace7.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace7.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmBalanceBreakdown
	 * AggregateBalanceInformation8.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation8.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation8.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity4Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation7.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace10.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace10.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmBalanceBreakdown
	 * AggregateBalanceInformation11.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation11.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation11.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity1Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation1#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation1.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace2.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace2.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation2.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation2.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation2.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation2.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace4.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace4.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation3.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation3.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation3.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace12.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace12.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmBalanceBreakdown
	 * AggregateBalanceInformation13.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation13.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation13.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace14.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace14.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmBalanceBreakdown
	 * AggregateBalanceInformation15.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation15.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation15.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace16.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace16.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmBalanceBreakdown
	 * AggregateBalanceInformation17.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation17.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation17.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace18.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace18.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmBalanceBreakdown
	 * AggregateBalanceInformation19.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation19.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation19.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace21.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace21.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmBalanceBreakdown
	 * AggregateBalanceInformation22.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation22.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation22.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace22.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace22.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmBalanceBreakdown
	 * AggregateBalanceInformation23.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation23.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation23.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation5.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace8.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace8.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmBalanceBreakdown
	 * AggregateBalanceInformation9.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation9.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation9.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation8.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace9.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace9.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmBalanceBreakdown
	 * AggregateBalanceInformation10.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation10.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation10.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace1.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace1.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation1.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation1.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation1.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace3.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace3.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation4.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation4.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation4.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace11.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace11.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmBalanceBreakdown
	 * AggregateBalanceInformation12.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation12.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation12.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace13.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace13.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmBalanceBreakdown
	 * AggregateBalanceInformation14.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation14.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation14.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation9.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace15.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace15.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmBalanceBreakdown
	 * AggregateBalanceInformation16.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation16.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation16.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation10.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace17.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace17.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmBalanceBreakdown
	 * AggregateBalanceInformation18.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation18.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation18.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation11.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace20.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace20.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmBalanceBreakdown
	 * AggregateBalanceInformation21.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation21.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation21.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation12.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace23.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace23.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmBalanceBreakdown
	 * AggregateBalanceInformation24.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation24.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation24.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition#mmHoldingBalance
	 * EligiblePosition.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition#mmPosition
	 * SecurityPosition.mmPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition2#mmHoldingBalance
	 * EligiblePosition2.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#mmHoldingBalance
	 * EligiblePosition3.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition4#mmHoldingBalance
	 * EligiblePosition4.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmSecuritySubPosition
	 * SecurityPosition1.mmSecuritySubPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition3#mmSecuritySubPosition
	 * SecurityPosition3.mmSecuritySubPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation3#mmAdditionalBalanceInformation
	 * AdditionalBalanceInformation3.mmAdditionalBalanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation5.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmSubBalanceInformation
	 * AggregateBalanceInformation5.mmSubBalanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity2Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity2Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType1#mmBalanceFrom
	 * IntraPositionType1.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType1#mmBalanceTo
	 * IntraPositionType1.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace19.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace19.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmBalanceBreakdown
	 * AggregateBalanceInformation20.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation20.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation20.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4#mmSecuritiesSubBalanceIdentification
	 * IntraPosition4.mmSecuritiesSubBalanceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation4#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation4.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace6.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace6.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation6.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation6.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation6.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace5.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalancePerSafekeepingPlace5.mmAdditionalBalanceBreakdownDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmBalanceBreakdownDetails
	 * AggregateBalanceInformation7.mmBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmAdditionalBalanceBreakdownDetails
	 * AggregateBalanceInformation7.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation7.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmBalanceBreakdown
	 * AggregateBalanceInformation26.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation26.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation26.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmBalanceBreakdown
	 * AggregateBalanceInformation25.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation25.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation25.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace24.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace24.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace25.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace25.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmHoldingBalance
	 * EligiblePosition5.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#mmHoldingBalance
	 * EligiblePosition6.mmHoldingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmBalanceBreakdown
	 * AggregateBalanceInformation28.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation28.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation28.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmBalanceBreakdown
	 * AggregateBalanceInformation27.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation27.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation27.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace26.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace26.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace27.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace27.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmBalanceBreakdown
	 * AggregateBalanceInformation30.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation30.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation30.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmBalanceBreakdown
	 * AggregateBalanceInformation31.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation31.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation31.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace28.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace29.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace29.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation15.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity6Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation14.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance3#mmBalance
	 * PendingBalance3.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance4#mmBalance
	 * PendingBalance4.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmBalanceBreakdown
	 * AggregateBalanceInformation32.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation32.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation32.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmBalanceBreakdown
	 * AggregateBalanceInformation33.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation33.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation33.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#mmQuantityAndAvailability
	 * SubBalanceQuantity7Choice.mmQuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace31.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace31.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation17.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation16.mmAdditionalBalanceBreakdownDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace30.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmAdditionalBalanceBreakdown
	 * AggregateBalancePerSafekeepingPlace30.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmBalanceBreakdown
	 * AggregateBalanceInformation34.mmBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmAdditionalBalanceBreakdown
	 * AggregateBalanceInformation34.mmAdditionalBalanceBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmBalanceAtSafekeepingPlace
	 * AggregateBalanceInformation34.mmBalanceAtSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType2#mmBalanceFrom
	 * IntraPositionType2.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionType2#mmBalanceTo
	 * IntraPositionType2.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition5#mmSecuritiesSubBalanceIdentification
	 * IntraPosition5.mmSecuritiesSubBalanceIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance5#mmBalance
	 * PendingBalance5.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance6#mmBalance
	 * PendingBalance6.mmBalance}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesSubBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PendingBalance1.mmBalance, PendingBalance2.mmBalance, SubBalanceQuantity3Choice.mmQuantityAndAvailability, SubBalanceInformation6.mmAdditionalBalanceBreakdownDetails,
					AggregateBalancePerSafekeepingPlace7.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace7.mmAdditionalBalanceBreakdown, AggregateBalanceInformation8.mmBalanceBreakdown,
					AggregateBalanceInformation8.mmAdditionalBalanceBreakdown, AggregateBalanceInformation8.mmBalanceAtSafekeepingPlace, SubBalanceQuantity4Choice.mmQuantityAndAvailability,
					SubBalanceInformation7.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace10.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace10.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation11.mmBalanceBreakdown, AggregateBalanceInformation11.mmAdditionalBalanceBreakdown, AggregateBalanceInformation11.mmBalanceAtSafekeepingPlace,
					SubBalanceQuantity1Choice.mmQuantityAndAvailability, SubBalanceInformation1.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace2.mmBalanceBreakdownDetails,
					AggregateBalancePerSafekeepingPlace2.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation2.mmBalanceBreakdownDetails, AggregateBalanceInformation2.mmAdditionalBalanceBreakdownDetails,
					AggregateBalanceInformation2.mmBalanceAtSafekeepingPlace, SubBalanceInformation2.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace4.mmBalanceBreakdownDetails,
					AggregateBalancePerSafekeepingPlace4.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation3.mmBalanceBreakdownDetails, AggregateBalanceInformation3.mmAdditionalBalanceBreakdownDetails,
					AggregateBalanceInformation3.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace12.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace12.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation13.mmBalanceBreakdown, AggregateBalanceInformation13.mmAdditionalBalanceBreakdown, AggregateBalanceInformation13.mmBalanceAtSafekeepingPlace,
					AggregateBalancePerSafekeepingPlace14.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace14.mmAdditionalBalanceBreakdown, AggregateBalanceInformation15.mmBalanceBreakdown,
					AggregateBalanceInformation15.mmAdditionalBalanceBreakdown, AggregateBalanceInformation15.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace16.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace16.mmAdditionalBalanceBreakdown, AggregateBalanceInformation17.mmBalanceBreakdown, AggregateBalanceInformation17.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation17.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace18.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace18.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation19.mmBalanceBreakdown, AggregateBalanceInformation19.mmAdditionalBalanceBreakdown, AggregateBalanceInformation19.mmBalanceAtSafekeepingPlace,
					AggregateBalancePerSafekeepingPlace21.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace21.mmAdditionalBalanceBreakdown, AggregateBalanceInformation22.mmBalanceBreakdown,
					AggregateBalanceInformation22.mmAdditionalBalanceBreakdown, AggregateBalanceInformation22.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace22.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace22.mmAdditionalBalanceBreakdown, AggregateBalanceInformation23.mmBalanceBreakdown, AggregateBalanceInformation23.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation23.mmBalanceAtSafekeepingPlace, SubBalanceInformation5.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace8.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace8.mmAdditionalBalanceBreakdown, AggregateBalanceInformation9.mmBalanceBreakdown, AggregateBalanceInformation9.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation9.mmBalanceAtSafekeepingPlace, SubBalanceInformation8.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace9.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace9.mmAdditionalBalanceBreakdown, AggregateBalanceInformation10.mmBalanceBreakdown, AggregateBalanceInformation10.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation10.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace1.mmBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace1.mmAdditionalBalanceBreakdownDetails,
					AggregateBalanceInformation1.mmBalanceBreakdownDetails, AggregateBalanceInformation1.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation1.mmBalanceAtSafekeepingPlace,
					AggregateBalancePerSafekeepingPlace3.mmBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace3.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation4.mmBalanceBreakdownDetails,
					AggregateBalanceInformation4.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation4.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace11.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace11.mmAdditionalBalanceBreakdown, AggregateBalanceInformation12.mmBalanceBreakdown, AggregateBalanceInformation12.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation12.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace13.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace13.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation14.mmBalanceBreakdown, AggregateBalanceInformation14.mmAdditionalBalanceBreakdown, AggregateBalanceInformation14.mmBalanceAtSafekeepingPlace,
					SubBalanceInformation9.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace15.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace15.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation16.mmBalanceBreakdown, AggregateBalanceInformation16.mmAdditionalBalanceBreakdown, AggregateBalanceInformation16.mmBalanceAtSafekeepingPlace,
					SubBalanceInformation10.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace17.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace17.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation18.mmBalanceBreakdown, AggregateBalanceInformation18.mmAdditionalBalanceBreakdown, AggregateBalanceInformation18.mmBalanceAtSafekeepingPlace,
					SubBalanceInformation11.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace20.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace20.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation21.mmBalanceBreakdown, AggregateBalanceInformation21.mmAdditionalBalanceBreakdown, AggregateBalanceInformation21.mmBalanceAtSafekeepingPlace,
					SubBalanceInformation12.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace23.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace23.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation24.mmBalanceBreakdown, AggregateBalanceInformation24.mmAdditionalBalanceBreakdown, AggregateBalanceInformation24.mmBalanceAtSafekeepingPlace, EligiblePosition.mmHoldingBalance,
					SecurityPosition.mmPosition, EligiblePosition2.mmHoldingBalance, EligiblePosition3.mmHoldingBalance, EligiblePosition4.mmHoldingBalance, SecurityPosition1.mmSecuritySubPosition, SecurityPosition3.mmSecuritySubPosition,
					AdditionalBalanceInformation3.mmAdditionalBalanceInformation, AggregateBalanceInformation5.mmBalanceBreakdownDetails, AggregateBalanceInformation5.mmSubBalanceInformation,
					SubBalanceQuantity2Choice.mmQuantityAndAvailability, IntraPositionType1.mmBalanceFrom, IntraPositionType1.mmBalanceTo, AggregateBalancePerSafekeepingPlace19.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace19.mmAdditionalBalanceBreakdown, AggregateBalanceInformation20.mmBalanceBreakdown, AggregateBalanceInformation20.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation20.mmBalanceAtSafekeepingPlace, IntraPosition4.mmSecuritiesSubBalanceIdentification, SubBalanceInformation4.mmAdditionalBalanceBreakdownDetails,
					AggregateBalancePerSafekeepingPlace6.mmBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace6.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation6.mmBalanceBreakdownDetails,
					AggregateBalanceInformation6.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation6.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace5.mmBalanceBreakdownDetails,
					AggregateBalancePerSafekeepingPlace5.mmAdditionalBalanceBreakdownDetails, AggregateBalanceInformation7.mmBalanceBreakdownDetails, AggregateBalanceInformation7.mmAdditionalBalanceBreakdownDetails,
					AggregateBalanceInformation7.mmBalanceAtSafekeepingPlace, AggregateBalanceInformation26.mmBalanceBreakdown, AggregateBalanceInformation26.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation26.mmBalanceAtSafekeepingPlace, AggregateBalanceInformation25.mmBalanceBreakdown, AggregateBalanceInformation25.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation25.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace24.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace24.mmAdditionalBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace25.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace25.mmAdditionalBalanceBreakdown, EligiblePosition5.mmHoldingBalance, EligiblePosition6.mmHoldingBalance,
					AggregateBalanceInformation28.mmBalanceBreakdown, AggregateBalanceInformation28.mmAdditionalBalanceBreakdown, AggregateBalanceInformation28.mmBalanceAtSafekeepingPlace, AggregateBalanceInformation27.mmBalanceBreakdown,
					AggregateBalanceInformation27.mmAdditionalBalanceBreakdown, AggregateBalanceInformation27.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace26.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace26.mmAdditionalBalanceBreakdown, AggregateBalancePerSafekeepingPlace27.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace27.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation30.mmBalanceBreakdown, AggregateBalanceInformation30.mmAdditionalBalanceBreakdown, AggregateBalanceInformation30.mmBalanceAtSafekeepingPlace, AggregateBalanceInformation31.mmBalanceBreakdown,
					AggregateBalanceInformation31.mmAdditionalBalanceBreakdown, AggregateBalanceInformation31.mmBalanceAtSafekeepingPlace, AggregateBalancePerSafekeepingPlace28.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace28.mmAdditionalBalanceBreakdown, AggregateBalancePerSafekeepingPlace29.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace29.mmAdditionalBalanceBreakdown,
					SubBalanceInformation15.mmAdditionalBalanceBreakdownDetails, SubBalanceQuantity6Choice.mmQuantityAndAvailability, SubBalanceInformation14.mmAdditionalBalanceBreakdownDetails, PendingBalance3.mmBalance,
					PendingBalance4.mmBalance, AggregateBalanceInformation32.mmBalanceBreakdown, AggregateBalanceInformation32.mmAdditionalBalanceBreakdown, AggregateBalanceInformation32.mmBalanceAtSafekeepingPlace,
					AggregateBalanceInformation33.mmBalanceBreakdown, AggregateBalanceInformation33.mmAdditionalBalanceBreakdown, AggregateBalanceInformation33.mmBalanceAtSafekeepingPlace,
					SubBalanceQuantity7Choice.mmQuantityAndAvailability, AggregateBalancePerSafekeepingPlace31.mmBalanceBreakdown, AggregateBalancePerSafekeepingPlace31.mmAdditionalBalanceBreakdown,
					SubBalanceInformation17.mmAdditionalBalanceBreakdownDetails, SubBalanceInformation16.mmAdditionalBalanceBreakdownDetails, AggregateBalancePerSafekeepingPlace30.mmBalanceBreakdown,
					AggregateBalancePerSafekeepingPlace30.mmAdditionalBalanceBreakdown, AggregateBalanceInformation34.mmBalanceBreakdown, AggregateBalanceInformation34.mmAdditionalBalanceBreakdown,
					AggregateBalanceInformation34.mmBalanceAtSafekeepingPlace, IntraPositionType2.mmBalanceFrom, IntraPositionType2.mmBalanceTo, IntraPosition5.mmSecuritiesSubBalanceIdentification, PendingBalance5.mmBalance,
					PendingBalance6.mmBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSubBalance";
			definition = "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmMainSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesBalanceTypeV2Code securitiesBalanceType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType3Choice#mmCode
	 * SecuritiesBalanceType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType3Choice#mmProprietary
	 * SecuritiesBalanceType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmBalanceFrom
	 * IntraPositionDetails2.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2#mmBalanceTo
	 * IntraPositionDetails2.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType5Choice#mmCode
	 * SecuritiesBalanceType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType5Choice#mmProprietary
	 * SecuritiesBalanceType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmBalanceFrom
	 * IntraPositionDetails8.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8#mmBalanceTo
	 * IntraPositionDetails8.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmBalanceFrom
	 * IntraPositionDetails12.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmBalanceTo
	 * IntraPositionDetails12.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmBalanceFrom
	 * IntraPositionDetails13.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmBalanceTo
	 * IntraPositionDetails13.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1#mmType
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmBalanceFrom
	 * IntraPositionDetails22.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmBalanceTo
	 * IntraPositionDetails22.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2#mmType
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmBalanceFrom
	 * IntraPositionDetails26.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmBalanceTo
	 * IntraPositionDetails26.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmBalanceFrom
	 * IntraPositionDetails27.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmBalanceTo
	 * IntraPositionDetails27.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmBalanceFrom
	 * IntraPositionDetails29.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmBalanceTo
	 * IntraPositionDetails29.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmBalanceTo
	 * IntraPositionMovementDetails1.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#mmBalanceFrom
	 * IntraPositionDetails3.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmBalanceTo
	 * IntraPositionMovementDetails2.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails6#mmBalanceFrom
	 * IntraPositionDetails6.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmBalanceTo
	 * IntraPositionMovementDetails5.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails17#mmBalanceFrom
	 * IntraPositionDetails17.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmBalanceTo
	 * IntraPositionMovementDetails6.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails18#mmBalanceFrom
	 * IntraPositionDetails18.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmBalanceTo
	 * IntraPositionMovementDetails7.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails20#mmBalanceFrom
	 * IntraPositionDetails20.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmBalanceTo
	 * IntraPositionMovementDetails8.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails24#mmBalanceFrom
	 * IntraPositionDetails24.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmBalanceTo
	 * IntraPositionMovementDetails9.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails28#mmBalanceFrom
	 * IntraPositionDetails28.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmBalanceTo
	 * IntraPositionMovementDetails10.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails30#mmBalanceFrom
	 * IntraPositionDetails30.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType3Choice#mmCode
	 * SubBalanceType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType3Choice#mmProprietary
	 * SubBalanceType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType5Choice#mmCode
	 * SubBalanceType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType5Choice#mmProprietary
	 * SubBalanceType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType4Choice#mmCode
	 * SubBalanceType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType4Choice#mmProprietary
	 * SubBalanceType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType6Choice#mmCode
	 * SubBalanceType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType6Choice#mmProprietary
	 * SubBalanceType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6#mmSubBalanceType
	 * AdditionalBalanceInformation6.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#mmSubBalanceType
	 * SubBalanceInformation6.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType7Choice#mmCode
	 * SubBalanceType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType7Choice#mmProprietary
	 * SubBalanceType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType8Choice#mmCode
	 * SubBalanceType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType8Choice#mmProprietary
	 * SubBalanceType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7#mmSubBalanceType
	 * AdditionalBalanceInformation7.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7#mmSubBalanceType
	 * SubBalanceInformation7.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType1Choice#mmStructured
	 * SecuritiesBalanceType1Choice.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType1Choice#mmUnstructured
	 * SecuritiesBalanceType1Choice.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation#mmSubBalanceType
	 * AdditionalBalanceInformation.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation1#mmSubBalanceType
	 * SubBalanceInformation1.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#mmSubBalanceType
	 * AdditionalBalanceInformation2.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#mmExtendedSubBalanceType
	 * AdditionalBalanceInformation2.mmExtendedSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmSubBalanceType
	 * SubBalanceInformation2.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmExtendedSubBalanceType
	 * SubBalanceInformation2.mmExtendedSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5#mmSubBalanceType
	 * AdditionalBalanceInformation5.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#mmSubBalanceType
	 * SubBalanceInformation5.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8#mmSubBalanceType
	 * AdditionalBalanceInformation8.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#mmSubBalanceType
	 * SubBalanceInformation8.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#mmSubBalanceType
	 * AdditionalBalanceInformation9.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#mmSubBalanceType
	 * SubBalanceInformation9.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10#mmSubBalanceType
	 * AdditionalBalanceInformation10.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#mmSubBalanceType
	 * SubBalanceInformation10.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11#mmSubBalanceType
	 * AdditionalBalanceInformation11.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#mmSubBalanceType
	 * SubBalanceInformation11.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12#mmSubBalanceType
	 * AdditionalBalanceInformation12.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#mmSubBalanceType
	 * SubBalanceInformation12.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance2#mmBalanceType
	 * HoldingBalance2.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance3#mmBalanceType
	 * HoldingBalance3.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance6#mmBalanceType
	 * HoldingBalance6.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance4#mmBalanceType
	 * HoldingBalance4.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance5#mmBalanceType
	 * HoldingBalance5.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice#mmCode
	 * SecuritiesBalanceType10FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType10FormatChoice#mmProprietary
	 * SecuritiesBalanceType10FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmBalanceType
	 * SecuritiesAccount9.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice#mmCode
	 * SecuritiesBalanceType6FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6FormatChoice#mmProprietary
	 * SecuritiesBalanceType6FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount12#mmBalanceType
	 * SecuritiesAccount12.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmBalanceType
	 * SecuritiesAccount8.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice#mmCode
	 * SecuritiesBalanceType9FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType9FormatChoice#mmProprietary
	 * SecuritiesBalanceType9FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmBalanceType
	 * SecuritiesAccount10.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType2Choice#mmCode
	 * SecuritiesBalanceType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType2Choice#mmProprietary
	 * SecuritiesBalanceType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#mmBalanceFrom
	 * IntraPositionDetails1.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#mmBalanceTo
	 * IntraPositionDetails1.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#mmBalanceFrom
	 * IntraPositionDetails11.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#mmBalanceTo
	 * IntraPositionDetails11.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#mmBalanceFrom
	 * IntraPositionDetails4.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4#mmBalanceTo
	 * IntraPositionDetails4.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#mmBalanceFrom
	 * IntraPositionDetails9.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9#mmBalanceTo
	 * IntraPositionDetails9.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType4Choice#mmCode
	 * SecuritiesBalanceType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType4Choice#mmProprietary
	 * SecuritiesBalanceType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#mmBalanceFrom
	 * IntraPositionDetails7.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#mmBalanceTo
	 * IntraPositionDetails7.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#mmBalanceFrom
	 * IntraPositionDetails16.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#mmBalanceTo
	 * IntraPositionDetails16.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#mmBalanceFrom
	 * IntraPositionDetails21.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#mmBalanceTo
	 * IntraPositionDetails21.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmBalanceFrom
	 * IntraPositionDetails25.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmBalanceTo
	 * IntraPositionDetails25.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmBalanceFrom
	 * IntraPositionDetails5.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmBalanceTo
	 * IntraPositionDetails5.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#mmBalanceFrom
	 * IntraPositionDetails15.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15#mmBalanceTo
	 * IntraPositionDetails15.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#mmBalanceFrom
	 * IntraPositionDetails19.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#mmBalanceTo
	 * IntraPositionDetails19.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#mmBalanceFrom
	 * IntraPositionDetails23.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#mmBalanceTo
	 * IntraPositionDetails23.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType1Choice#mmSubBalanceType
	 * SubBalanceType1Choice.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType1Choice#mmProprietary
	 * SubBalanceType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType2Choice#mmSubBalanceType
	 * SubBalanceType2Choice.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType2Choice#mmProprietary
	 * SubBalanceType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation3#mmSubBalanceType
	 * SubBalanceInformation3.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmBalanceTo
	 * IntraPositionMovementDetails3.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails10#mmBalanceFrom
	 * IntraPositionDetails10.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmBalanceTo
	 * IntraPositionMovementDetails4.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails14#mmBalanceFrom
	 * IntraPositionDetails14.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation4#mmSubBalanceType
	 * AdditionalBalanceInformation4.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation4#mmSubBalanceType
	 * SubBalanceInformation4.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType9Choice#mmCode
	 * SubBalanceType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType9Choice#mmProprietary
	 * SubBalanceType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1#mmSubBalanceType
	 * SubBalanceBreakdown1.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance8#mmBalanceType
	 * HoldingBalance8.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#mmBalanceType
	 * HoldingBalance7.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#mmBalanceFrom
	 * IntraPositionDetails31.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#mmBalanceTo
	 * IntraPositionDetails31.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmBalanceFrom
	 * IntraPositionDetails33.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmBalanceTo
	 * IntraPositionDetails33.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmBalanceFrom
	 * IntraPositionDetails34.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmBalanceTo
	 * IntraPositionDetails34.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#mmSubBalanceType
	 * SubBalanceInformation15.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType11Choice#mmCode
	 * SubBalanceType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType11Choice#mmProprietary
	 * SubBalanceType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmSubBalanceType
	 * AdditionalBalanceInformation15.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#mmSubBalanceType
	 * AdditionalBalanceInformation14.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType12Choice#mmCode
	 * SubBalanceType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType12Choice#mmProprietary
	 * SubBalanceType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3#mmType
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmSubBalanceType
	 * SubBalanceInformation14.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice#mmCode
	 * SecuritiesBalanceType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType7Choice#mmProprietary
	 * SecuritiesBalanceType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#mmBalanceFrom
	 * IntraPositionDetails32.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice#mmCode
	 * SecuritiesBalanceType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice#mmProprietary
	 * SecuritiesBalanceType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmBalanceTo
	 * IntraPositionMovementDetails11.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmBalanceFrom
	 * IntraPositionDetails35.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmBalanceTo
	 * IntraPositionDetails35.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#mmBalanceFrom
	 * IntraPositionDetails36.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#mmBalanceTo
	 * IntraPositionDetails36.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#mmBalanceFrom
	 * IntraPositionDetails38.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#mmBalanceTo
	 * IntraPositionDetails38.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation16#mmSubBalanceType
	 * AdditionalBalanceInformation16.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType14Choice#mmCode
	 * SubBalanceType14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType14Choice#mmProprietary
	 * SubBalanceType14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown4#mmType
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17#mmSubBalanceType
	 * AdditionalBalanceInformation17.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#mmSubBalanceType
	 * SubBalanceInformation17.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType11Choice#mmCode
	 * SecuritiesBalanceType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType11Choice#mmProprietary
	 * SecuritiesBalanceType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16#mmSubBalanceType
	 * SubBalanceInformation16.mmSubBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType13Choice#mmCode
	 * SubBalanceType13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType13Choice#mmProprietary
	 * SubBalanceType13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmBalanceTo
	 * IntraPositionMovementDetails12.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType8Choice#mmCode
	 * SecuritiesBalanceType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType8Choice#mmProprietary
	 * SecuritiesBalanceType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails37#mmBalanceFrom
	 * IntraPositionDetails37.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceFrom
	 * IntraPositionDetails41.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceTo
	 * IntraPositionDetails41.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmBalanceFrom
	 * IntraPositionDetails39.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmBalanceTo
	 * IntraPositionDetails39.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#mmBalanceFrom
	 * IntraPositionDetails40.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmBalanceTo
	 * IntraPositionMovementDetails13.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmBalanceFrom
	 * IntraPositionDetails43.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmBalanceTo
	 * IntraPositionDetails43.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#mmBalanceFrom
	 * IntraPositionDetails42.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#mmBalanceTo
	 * IntraPositionDetails42.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails44#mmBalanceFrom
	 * IntraPositionDetails44.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmBalanceTo
	 * IntraPositionMovementDetails14.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmBalanceFrom
	 * IntraPositionDetails46.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmBalanceTo
	 * IntraPositionDetails46.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails45#mmBalanceFrom
	 * IntraPositionDetails45.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmBalanceTo
	 * IntraPositionMovementDetails15.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails47#mmBalanceFrom
	 * IntraPositionDetails47.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails47#mmBalanceTo
	 * IntraPositionDetails47.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails48#mmBalanceFrom
	 * IntraPositionDetails48.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails16#mmBalanceTo
	 * IntraPositionMovementDetails16.mmBalanceTo}</li>
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
	public static final MMBusinessAttribute mmSecuritiesBalanceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesBalanceType3Choice.mmCode, SecuritiesBalanceType3Choice.mmProprietary, IntraPositionDetails2.mmBalanceFrom, IntraPositionDetails2.mmBalanceTo, SecuritiesBalanceType5Choice.mmCode,
					SecuritiesBalanceType5Choice.mmProprietary, IntraPositionDetails8.mmBalanceFrom, IntraPositionDetails8.mmBalanceTo, IntraPositionDetails12.mmBalanceFrom, IntraPositionDetails12.mmBalanceTo,
					IntraPositionDetails13.mmBalanceFrom, IntraPositionDetails13.mmBalanceTo, SecuritiesSubBalanceTypeAndQuantityBreakdown1.mmType, IntraPositionDetails22.mmBalanceFrom, IntraPositionDetails22.mmBalanceTo,
					SecuritiesSubBalanceTypeAndQuantityBreakdown2.mmType, IntraPositionDetails26.mmBalanceFrom, IntraPositionDetails26.mmBalanceTo, IntraPositionDetails27.mmBalanceFrom, IntraPositionDetails27.mmBalanceTo,
					IntraPositionDetails29.mmBalanceFrom, IntraPositionDetails29.mmBalanceTo, IntraPositionMovementDetails1.mmBalanceTo, IntraPositionDetails3.mmBalanceFrom, IntraPositionMovementDetails2.mmBalanceTo,
					IntraPositionDetails6.mmBalanceFrom, IntraPositionMovementDetails5.mmBalanceTo, IntraPositionDetails17.mmBalanceFrom, IntraPositionMovementDetails6.mmBalanceTo, IntraPositionDetails18.mmBalanceFrom,
					IntraPositionMovementDetails7.mmBalanceTo, IntraPositionDetails20.mmBalanceFrom, IntraPositionMovementDetails8.mmBalanceTo, IntraPositionDetails24.mmBalanceFrom, IntraPositionMovementDetails9.mmBalanceTo,
					IntraPositionDetails28.mmBalanceFrom, IntraPositionMovementDetails10.mmBalanceTo, IntraPositionDetails30.mmBalanceFrom, SubBalanceType3Choice.mmCode, SubBalanceType3Choice.mmProprietary, SubBalanceType5Choice.mmCode,
					SubBalanceType5Choice.mmProprietary, SubBalanceType4Choice.mmCode, SubBalanceType4Choice.mmProprietary, SubBalanceType6Choice.mmCode, SubBalanceType6Choice.mmProprietary, AdditionalBalanceInformation6.mmSubBalanceType,
					SubBalanceInformation6.mmSubBalanceType, SubBalanceType7Choice.mmCode, SubBalanceType7Choice.mmProprietary, SubBalanceType8Choice.mmCode, SubBalanceType8Choice.mmProprietary,
					AdditionalBalanceInformation7.mmSubBalanceType, SubBalanceInformation7.mmSubBalanceType, SecuritiesBalanceType1Choice.mmStructured, SecuritiesBalanceType1Choice.mmUnstructured,
					AdditionalBalanceInformation.mmSubBalanceType, SubBalanceInformation1.mmSubBalanceType, AdditionalBalanceInformation2.mmSubBalanceType, AdditionalBalanceInformation2.mmExtendedSubBalanceType,
					SubBalanceInformation2.mmSubBalanceType, SubBalanceInformation2.mmExtendedSubBalanceType, AdditionalBalanceInformation5.mmSubBalanceType, SubBalanceInformation5.mmSubBalanceType,
					AdditionalBalanceInformation8.mmSubBalanceType, SubBalanceInformation8.mmSubBalanceType, AdditionalBalanceInformation9.mmSubBalanceType, SubBalanceInformation9.mmSubBalanceType,
					AdditionalBalanceInformation10.mmSubBalanceType, SubBalanceInformation10.mmSubBalanceType, AdditionalBalanceInformation11.mmSubBalanceType, SubBalanceInformation11.mmSubBalanceType,
					AdditionalBalanceInformation12.mmSubBalanceType, SubBalanceInformation12.mmSubBalanceType, HoldingBalance2.mmBalanceType, HoldingBalance3.mmBalanceType, HoldingBalance6.mmBalanceType, HoldingBalance4.mmBalanceType,
					HoldingBalance5.mmBalanceType, SecuritiesBalanceType10FormatChoice.mmCode, SecuritiesBalanceType10FormatChoice.mmProprietary, SecuritiesAccount9.mmBalanceType, SecuritiesBalanceType6FormatChoice.mmCode,
					SecuritiesBalanceType6FormatChoice.mmProprietary, SecuritiesAccount12.mmBalanceType, SecuritiesAccount8.mmBalanceType, SecuritiesBalanceType9FormatChoice.mmCode, SecuritiesBalanceType9FormatChoice.mmProprietary,
					SecuritiesAccount10.mmBalanceType, SecuritiesBalanceType2Choice.mmCode, SecuritiesBalanceType2Choice.mmProprietary, IntraPositionDetails1.mmBalanceFrom, IntraPositionDetails1.mmBalanceTo,
					IntraPositionDetails11.mmBalanceFrom, IntraPositionDetails11.mmBalanceTo, IntraPositionDetails4.mmBalanceFrom, IntraPositionDetails4.mmBalanceTo, IntraPositionDetails9.mmBalanceFrom, IntraPositionDetails9.mmBalanceTo,
					SecuritiesBalanceType4Choice.mmCode, SecuritiesBalanceType4Choice.mmProprietary, IntraPositionDetails7.mmBalanceFrom, IntraPositionDetails7.mmBalanceTo, IntraPositionDetails16.mmBalanceFrom,
					IntraPositionDetails16.mmBalanceTo, IntraPositionDetails21.mmBalanceFrom, IntraPositionDetails21.mmBalanceTo, IntraPositionDetails25.mmBalanceFrom, IntraPositionDetails25.mmBalanceTo,
					IntraPositionDetails5.mmBalanceFrom, IntraPositionDetails5.mmBalanceTo, IntraPositionDetails15.mmBalanceFrom, IntraPositionDetails15.mmBalanceTo, IntraPositionDetails19.mmBalanceFrom, IntraPositionDetails19.mmBalanceTo,
					IntraPositionDetails23.mmBalanceFrom, IntraPositionDetails23.mmBalanceTo, SubBalanceType1Choice.mmSubBalanceType, SubBalanceType1Choice.mmProprietary, SubBalanceType2Choice.mmSubBalanceType,
					SubBalanceType2Choice.mmProprietary, SubBalanceInformation3.mmSubBalanceType, IntraPositionMovementDetails3.mmBalanceTo, IntraPositionDetails10.mmBalanceFrom, IntraPositionMovementDetails4.mmBalanceTo,
					IntraPositionDetails14.mmBalanceFrom, AdditionalBalanceInformation4.mmSubBalanceType, SubBalanceInformation4.mmSubBalanceType, SubBalanceType9Choice.mmCode, SubBalanceType9Choice.mmProprietary,
					SubBalanceBreakdown1.mmSubBalanceType, HoldingBalance8.mmBalanceType, HoldingBalance7.mmBalanceType, IntraPositionDetails31.mmBalanceFrom, IntraPositionDetails31.mmBalanceTo, IntraPositionDetails33.mmBalanceFrom,
					IntraPositionDetails33.mmBalanceTo, IntraPositionDetails34.mmBalanceFrom, IntraPositionDetails34.mmBalanceTo, SubBalanceInformation15.mmSubBalanceType, SubBalanceType11Choice.mmCode,
					SubBalanceType11Choice.mmProprietary, AdditionalBalanceInformation15.mmSubBalanceType, AdditionalBalanceInformation14.mmSubBalanceType, SubBalanceType12Choice.mmCode, SubBalanceType12Choice.mmProprietary,
					SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmType, SubBalanceInformation14.mmSubBalanceType, SecuritiesBalanceType7Choice.mmCode, SecuritiesBalanceType7Choice.mmProprietary, IntraPositionDetails32.mmBalanceFrom,
					SecuritiesBalanceType6Choice.mmCode, SecuritiesBalanceType6Choice.mmProprietary, IntraPositionMovementDetails11.mmBalanceTo, IntraPositionDetails35.mmBalanceFrom, IntraPositionDetails35.mmBalanceTo,
					IntraPositionDetails36.mmBalanceFrom, IntraPositionDetails36.mmBalanceTo, IntraPositionDetails38.mmBalanceFrom, IntraPositionDetails38.mmBalanceTo, AdditionalBalanceInformation16.mmSubBalanceType,
					SubBalanceType14Choice.mmCode, SubBalanceType14Choice.mmProprietary, SecuritiesSubBalanceTypeAndQuantityBreakdown4.mmType, AdditionalBalanceInformation17.mmSubBalanceType, SubBalanceInformation17.mmSubBalanceType,
					SecuritiesBalanceType11Choice.mmCode, SecuritiesBalanceType11Choice.mmProprietary, SubBalanceInformation16.mmSubBalanceType, SubBalanceType13Choice.mmCode, SubBalanceType13Choice.mmProprietary,
					IntraPositionMovementDetails12.mmBalanceTo, SecuritiesBalanceType8Choice.mmCode, SecuritiesBalanceType8Choice.mmProprietary, IntraPositionDetails37.mmBalanceFrom, IntraPositionDetails41.mmBalanceFrom,
					IntraPositionDetails41.mmBalanceTo, IntraPositionDetails39.mmBalanceFrom, IntraPositionDetails39.mmBalanceTo, IntraPositionDetails40.mmBalanceFrom, IntraPositionMovementDetails13.mmBalanceTo,
					IntraPositionDetails43.mmBalanceFrom, IntraPositionDetails43.mmBalanceTo, IntraPositionDetails42.mmBalanceFrom, IntraPositionDetails42.mmBalanceTo, IntraPositionDetails44.mmBalanceFrom,
					IntraPositionMovementDetails14.mmBalanceTo, IntraPositionDetails46.mmBalanceFrom, IntraPositionDetails46.mmBalanceTo, IntraPositionDetails45.mmBalanceFrom, IntraPositionMovementDetails15.mmBalanceTo,
					IntraPositionDetails47.mmBalanceFrom, IntraPositionDetails47.mmBalanceTo, IntraPositionDetails48.mmBalanceFrom, IntraPositionMovementDetails16.mmBalanceTo);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalanceType";
			definition = "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getSecuritiesBalanceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity subBalanceQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedSubBalance
	 * SecuritiesQuantity.mmRelatedSubBalance}</li>
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
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice#mmQuantity
	 * SubBalanceQuantity3Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice#mmProprietary
	 * SubBalanceQuantity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6#mmQuantity
	 * AdditionalBalanceInformation6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#mmQuantity
	 * SubBalanceInformation6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice#mmQuantity
	 * SubBalanceQuantity4Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice#mmProprietary
	 * SubBalanceQuantity4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7#mmQuantity
	 * AdditionalBalanceInformation7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7#mmQuantity
	 * SubBalanceInformation7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantity
	 * SubBalanceQuantity1Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantityAsDSS
	 * SubBalanceQuantity1Choice.mmQuantityAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation#mmQuantity
	 * AdditionalBalanceInformation.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation1#mmQuantity
	 * SubBalanceInformation1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation2#mmQuantity
	 * AdditionalBalanceInformation2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation2#mmQuantity
	 * SubBalanceInformation2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5#mmQuantity
	 * AdditionalBalanceInformation5.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5#mmQuantity
	 * SubBalanceInformation5.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8#mmQuantity
	 * AdditionalBalanceInformation8.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8#mmQuantity
	 * SubBalanceInformation8.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#mmQuantity
	 * AdditionalBalanceInformation9.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9#mmQuantity
	 * SubBalanceInformation9.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10#mmQuantity
	 * AdditionalBalanceInformation10.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10#mmQuantity
	 * SubBalanceInformation10.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11#mmQuantity
	 * AdditionalBalanceInformation11.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11#mmQuantity
	 * SubBalanceInformation11.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12#mmQuantity
	 * AdditionalBalanceInformation12.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12#mmQuantity
	 * SubBalanceInformation12.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation3#mmQuantity
	 * AdditionalBalanceInformation3.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation3#mmQuantity
	 * SubBalanceInformation3.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity2Choice#mmQuantity
	 * SubBalanceQuantity2Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity2Choice#mmProprietary
	 * SubBalanceQuantity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation4#mmQuantity
	 * AdditionalBalanceInformation4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation4#mmQuantity
	 * SubBalanceInformation4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceBreakdown1#mmQuantity
	 * SubBalanceBreakdown1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice#mmQuantity
	 * SubBalanceQuantity5Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity5Choice#mmProprietary
	 * SubBalanceQuantity5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation15#mmQuantity
	 * SubBalanceInformation15.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#mmQuantity
	 * SubBalanceQuantity6Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity6Choice#mmProprietary
	 * SubBalanceQuantity6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation15#mmQuantity
	 * AdditionalBalanceInformation15.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#mmQuantity
	 * AdditionalBalanceInformation14.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmQuantity
	 * SubBalanceInformation14.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation16#mmQuantity
	 * AdditionalBalanceInformation16.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#mmQuantity
	 * SubBalanceQuantity7Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#mmProprietary
	 * SubBalanceQuantity7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation17#mmQuantity
	 * AdditionalBalanceInformation17.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation17#mmQuantity
	 * SubBalanceInformation17.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation16#mmQuantity
	 * SubBalanceInformation16.mmQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSubBalanceQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SubBalanceQuantity3Choice.mmQuantity, SubBalanceQuantity3Choice.mmProprietary, AdditionalBalanceInformation6.mmQuantity, SubBalanceInformation6.mmQuantity,
					SubBalanceQuantity4Choice.mmQuantity, SubBalanceQuantity4Choice.mmProprietary, AdditionalBalanceInformation7.mmQuantity, SubBalanceInformation7.mmQuantity, SubBalanceQuantity1Choice.mmQuantity,
					SubBalanceQuantity1Choice.mmQuantityAsDSS, AdditionalBalanceInformation.mmQuantity, SubBalanceInformation1.mmQuantity, AdditionalBalanceInformation2.mmQuantity, SubBalanceInformation2.mmQuantity,
					AdditionalBalanceInformation5.mmQuantity, SubBalanceInformation5.mmQuantity, AdditionalBalanceInformation8.mmQuantity, SubBalanceInformation8.mmQuantity, AdditionalBalanceInformation9.mmQuantity,
					SubBalanceInformation9.mmQuantity, AdditionalBalanceInformation10.mmQuantity, SubBalanceInformation10.mmQuantity, AdditionalBalanceInformation11.mmQuantity, SubBalanceInformation11.mmQuantity,
					AdditionalBalanceInformation12.mmQuantity, SubBalanceInformation12.mmQuantity, AdditionalBalanceInformation3.mmQuantity, SubBalanceInformation3.mmQuantity, SubBalanceQuantity2Choice.mmQuantity,
					SubBalanceQuantity2Choice.mmProprietary, AdditionalBalanceInformation4.mmQuantity, SubBalanceInformation4.mmQuantity, SubBalanceBreakdown1.mmQuantity, SubBalanceQuantity5Choice.mmQuantity,
					SubBalanceQuantity5Choice.mmProprietary, SubBalanceInformation15.mmQuantity, SubBalanceQuantity6Choice.mmQuantity, SubBalanceQuantity6Choice.mmProprietary, AdditionalBalanceInformation15.mmQuantity,
					AdditionalBalanceInformation14.mmQuantity, SubBalanceInformation14.mmQuantity, AdditionalBalanceInformation16.mmQuantity, SubBalanceQuantity7Choice.mmQuantity, SubBalanceQuantity7Choice.mmProprietary,
					AdditionalBalanceInformation17.mmQuantity, SubBalanceInformation17.mmQuantity, SubBalanceInformation16.mmQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubBalanceQuantity";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedSubBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmBalance
	 * Security.mmBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation8.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation11.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation13.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation15.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation17.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation19.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation22.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation23.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation9.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation10.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation12.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation14.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation16.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation18.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation21.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation24.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation20.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation26.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation25.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation28.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation27.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation30.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation31.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation32.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation33.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmFinancialInstrumentAttributes
	 * AggregateBalanceInformation34.mmFinancialInstrumentAttributes}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalanceInformation8.mmFinancialInstrumentAttributes, AggregateBalanceInformation11.mmFinancialInstrumentAttributes, AggregateBalanceInformation13.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation15.mmFinancialInstrumentAttributes, AggregateBalanceInformation17.mmFinancialInstrumentAttributes, AggregateBalanceInformation19.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation22.mmFinancialInstrumentAttributes, AggregateBalanceInformation23.mmFinancialInstrumentAttributes, AggregateBalanceInformation9.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation10.mmFinancialInstrumentAttributes, AggregateBalanceInformation12.mmFinancialInstrumentAttributes, AggregateBalanceInformation14.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation16.mmFinancialInstrumentAttributes, AggregateBalanceInformation18.mmFinancialInstrumentAttributes, AggregateBalanceInformation21.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation24.mmFinancialInstrumentAttributes, AggregateBalanceInformation20.mmFinancialInstrumentAttributes, AggregateBalanceInformation26.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation25.mmFinancialInstrumentAttributes, AggregateBalanceInformation28.mmFinancialInstrumentAttributes, AggregateBalanceInformation27.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation30.mmFinancialInstrumentAttributes, AggregateBalanceInformation31.mmFinancialInstrumentAttributes, AggregateBalanceInformation32.mmFinancialInstrumentAttributes,
					AggregateBalanceInformation33.mmFinancialInstrumentAttributes, AggregateBalanceInformation34.mmFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a balance is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesBalance
	 * CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace7.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmForeignExchangeDetails
	 * AggregateBalanceInformation8.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace10.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmForeignExchangeDetails
	 * AggregateBalanceInformation11.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace2.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmForeignExchangeDetails
	 * AggregateBalanceInformation2.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmForeignExchangeDetails
	 * AggregateBalanceInformation3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace12.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmForeignExchangeDetails
	 * AggregateBalanceInformation13.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace14.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmForeignExchangeDetails
	 * AggregateBalanceInformation15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace16.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmForeignExchangeDetails
	 * AggregateBalanceInformation17.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace18.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmForeignExchangeDetails
	 * AggregateBalanceInformation19.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace21.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmForeignExchangeDetails
	 * AggregateBalanceInformation22.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace22.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmForeignExchangeDetails
	 * AggregateBalanceInformation23.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace8.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmForeignExchangeDetails
	 * AggregateBalanceInformation9.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace9.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmForeignExchangeDetails
	 * AggregateBalanceInformation10.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace1.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmForeignExchangeDetails
	 * AggregateBalanceInformation1.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace3.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmForeignExchangeDetails
	 * AggregateBalanceInformation4.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace11.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmForeignExchangeDetails
	 * AggregateBalanceInformation12.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace13.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmForeignExchangeDetails
	 * AggregateBalanceInformation14.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace15.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmForeignExchangeDetails
	 * AggregateBalanceInformation16.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace17.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmForeignExchangeDetails
	 * AggregateBalanceInformation18.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace20.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmForeignExchangeDetails
	 * AggregateBalanceInformation21.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace23.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmForeignExchangeDetails
	 * AggregateBalanceInformation24.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmForeignExchangeDetails
	 * AggregateBalanceInformation5.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace19.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmForeignExchangeDetails
	 * AggregateBalanceInformation20.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace6.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmForeignExchangeDetails
	 * AggregateBalanceInformation6.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace5.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmForeignExchangeDetails
	 * AggregateBalanceInformation7.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmForeignExchangeDetails
	 * AggregateBalanceInformation26.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmForeignExchangeDetails
	 * AggregateBalanceInformation25.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace24.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace25.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmForeignExchangeDetails
	 * AggregateBalanceInformation28.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmForeignExchangeDetails
	 * AggregateBalanceInformation27.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace26.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace27.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmForeignExchangeDetails
	 * AggregateBalanceInformation30.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmForeignExchangeDetails
	 * AggregateBalanceInformation31.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace28.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace29.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmForeignExchangeDetails
	 * AggregateBalanceInformation32.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmForeignExchangeDetails
	 * AggregateBalanceInformation33.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace31.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmForeignExchangeDetails
	 * AggregateBalancePerSafekeepingPlace30.mmForeignExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmForeignExchangeDetails
	 * AggregateBalanceInformation34.mmForeignExchangeDetails}</li>
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
	public static final MMBusinessAssociationEnd mmExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace7.mmForeignExchangeDetails, AggregateBalanceInformation8.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace10.mmForeignExchangeDetails,
					AggregateBalanceInformation11.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace2.mmForeignExchangeDetails, AggregateBalanceInformation2.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace4.mmForeignExchangeDetails, AggregateBalanceInformation3.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace12.mmForeignExchangeDetails,
					AggregateBalanceInformation13.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace14.mmForeignExchangeDetails, AggregateBalanceInformation15.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace16.mmForeignExchangeDetails, AggregateBalanceInformation17.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace18.mmForeignExchangeDetails,
					AggregateBalanceInformation19.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace21.mmForeignExchangeDetails, AggregateBalanceInformation22.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace22.mmForeignExchangeDetails, AggregateBalanceInformation23.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace8.mmForeignExchangeDetails,
					AggregateBalanceInformation9.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace9.mmForeignExchangeDetails, AggregateBalanceInformation10.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace1.mmForeignExchangeDetails, AggregateBalanceInformation1.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace3.mmForeignExchangeDetails,
					AggregateBalanceInformation4.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace11.mmForeignExchangeDetails, AggregateBalanceInformation12.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace13.mmForeignExchangeDetails, AggregateBalanceInformation14.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace15.mmForeignExchangeDetails,
					AggregateBalanceInformation16.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace17.mmForeignExchangeDetails, AggregateBalanceInformation18.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace20.mmForeignExchangeDetails, AggregateBalanceInformation21.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace23.mmForeignExchangeDetails,
					AggregateBalanceInformation24.mmForeignExchangeDetails, AggregateBalanceInformation5.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace19.mmForeignExchangeDetails,
					AggregateBalanceInformation20.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace6.mmForeignExchangeDetails, AggregateBalanceInformation6.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace5.mmForeignExchangeDetails, AggregateBalanceInformation7.mmForeignExchangeDetails, AggregateBalanceInformation26.mmForeignExchangeDetails,
					AggregateBalanceInformation25.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace24.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace25.mmForeignExchangeDetails,
					AggregateBalanceInformation28.mmForeignExchangeDetails, AggregateBalanceInformation27.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace26.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace27.mmForeignExchangeDetails, AggregateBalanceInformation30.mmForeignExchangeDetails, AggregateBalanceInformation31.mmForeignExchangeDetails,
					AggregateBalancePerSafekeepingPlace28.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace29.mmForeignExchangeDetails, AggregateBalanceInformation32.mmForeignExchangeDetails,
					AggregateBalanceInformation33.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace31.mmForeignExchangeDetails, AggregateBalancePerSafekeepingPlace30.mmForeignExchangeDetails,
					AggregateBalanceInformation34.mmForeignExchangeDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the balance value in another currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected YesNoIndicator availabilityIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability#mmAvailabilityIndicator
	 * QuantityAndAvailability.mmAvailabilityIndicator}</li>
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
	public static final MMBusinessAttribute mmAvailabilityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityAndAvailability.mmAvailabilityIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailabilityIndicator";
			definition = "Indicates whether the quantity of securities on the balance is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getAvailabilityIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity availableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAvailableQuantityBalance
	 * SecuritiesQuantity.mmAvailableQuantityBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace8.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmAvailableBalance
	 * AggregateBalanceInformation9.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace9.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmAvailableBalance
	 * AggregateBalanceInformation10.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAvailableQuantity
	 * AggregateBalancePerSafekeepingPlace1.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmAvailableQuantity
	 * AggregateBalanceInformation1.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAvailableQuantity
	 * AggregateBalancePerSafekeepingPlace3.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAvailableQuantity
	 * AggregateBalanceInformation4.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace11.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmAvailableBalance
	 * AggregateBalanceInformation12.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace13.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmAvailableBalance
	 * AggregateBalanceInformation14.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace15.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmAvailableBalance
	 * AggregateBalanceInformation16.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace17.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmAvailableBalance
	 * AggregateBalanceInformation18.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace20.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmAvailableBalance
	 * AggregateBalanceInformation21.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace23.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmAvailableBalance
	 * AggregateBalanceInformation24.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace19.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmAvailableBalance
	 * AggregateBalanceInformation20.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmAvailableQuantity
	 * AggregateBalancePerSafekeepingPlace5.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmAvailableQuantity
	 * AggregateBalanceInformation7.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmAvailableBalance
	 * AggregateBalanceInformation25.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace24.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmAvailableBalance
	 * AggregateBalanceInformation28.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace27.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmAvailableBalance
	 * AggregateBalanceInformation30.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace28.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmAvailableBalance
	 * AggregateBalanceInformation33.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmAvailableBalance
	 * AggregateBalancePerSafekeepingPlace31.mmAvailableBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmAvailableBalance
	 * AggregateBalanceInformation34.mmAvailableBalance}</li>
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
	public static final MMBusinessAssociationEnd mmAvailableQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace8.mmAvailableBalance, AggregateBalanceInformation9.mmAvailableBalance, AggregateBalancePerSafekeepingPlace9.mmAvailableBalance,
					AggregateBalanceInformation10.mmAvailableBalance, AggregateBalancePerSafekeepingPlace1.mmAvailableQuantity, AggregateBalanceInformation1.mmAvailableQuantity, AggregateBalancePerSafekeepingPlace3.mmAvailableQuantity,
					AggregateBalanceInformation4.mmAvailableQuantity, AggregateBalancePerSafekeepingPlace11.mmAvailableBalance, AggregateBalanceInformation12.mmAvailableBalance, AggregateBalancePerSafekeepingPlace13.mmAvailableBalance,
					AggregateBalanceInformation14.mmAvailableBalance, AggregateBalancePerSafekeepingPlace15.mmAvailableBalance, AggregateBalanceInformation16.mmAvailableBalance, AggregateBalancePerSafekeepingPlace17.mmAvailableBalance,
					AggregateBalanceInformation18.mmAvailableBalance, AggregateBalancePerSafekeepingPlace20.mmAvailableBalance, AggregateBalanceInformation21.mmAvailableBalance, AggregateBalancePerSafekeepingPlace23.mmAvailableBalance,
					AggregateBalanceInformation24.mmAvailableBalance, AggregateBalancePerSafekeepingPlace19.mmAvailableBalance, AggregateBalanceInformation20.mmAvailableBalance, AggregateBalancePerSafekeepingPlace5.mmAvailableQuantity,
					AggregateBalanceInformation7.mmAvailableQuantity, AggregateBalanceInformation25.mmAvailableBalance, AggregateBalancePerSafekeepingPlace24.mmAvailableBalance, AggregateBalanceInformation28.mmAvailableBalance,
					AggregateBalancePerSafekeepingPlace27.mmAvailableBalance, AggregateBalanceInformation30.mmAvailableBalance, AggregateBalancePerSafekeepingPlace28.mmAvailableBalance, AggregateBalanceInformation33.mmAvailableBalance,
					AggregateBalancePerSafekeepingPlace31.mmAvailableBalance, AggregateBalanceInformation34.mmAvailableBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmAvailableQuantityBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected MeetingEntitlement relatedMeetingEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEligiblePosition
	 * MeetingEntitlement.mmEligiblePosition}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedMeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingEntitlement";
			definition = "Entitlement for which an eligible posistion is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmEligiblePosition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
		}
	};
	protected SecuritiesQuantity unavailableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnavailableQuantityBalance
	 * SecuritiesQuantity.mmUnavailableQuantityBalance}</li>
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
	public static final MMBusinessAssociationEnd mmUnavailableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmUnavailableQuantityBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesBalance
	 * SafekeepingPlace.mmSecuritiesBalance}</li>
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
	public static final MMBusinessAssociationEnd mmSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place at which the securities are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesBalance
	 * SecuritiesEntry.mmSecuritiesBalance}</li>
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
	 * "Postings used to calculate a balance. It is derived from the association between Balance and Entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Postings used to calculate a balance. It is derived from the association between Balance and Entry.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	protected CorporateActionEntitlement notEligibleBalanceRelatedEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmNotEligibleBalance
	 * CorporateActionEntitlement.mmNotEligibleBalance}</li>
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
	public static final MMBusinessAssociationEnd mmNotEligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which a non eligible balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	protected IntraPositionTransfer relatedIntraPositionTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmSecuritiesBalance
	 * IntraPositionTransfer.mmSecuritiesBalance}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer between two balances or sub balances.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmObject();
		}
	};
	protected CurrencyAndAmount costAdjustment;
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
	public static final MMBusinessAttribute mmCostAdjustment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostAdjustment";
			definition = "Specifies the amount added or substracted to the original cost of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalance.class.getMethod("getCostAdjustment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Pledgee> pledgee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee#mmSecuritiesBalance
	 * Pledgee.mmSecuritiesBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmPledgee
	 * AggregateBalancePerSafekeepingPlace24.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmPledgee
	 * AggregateBalancePerSafekeepingPlace25.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmPledgee
	 * AggregateBalancePerSafekeepingPlace26.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmPledgee
	 * AggregateBalancePerSafekeepingPlace27.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmPledgee
	 * AggregateBalancePerSafekeepingPlace28.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmPledgee
	 * AggregateBalancePerSafekeepingPlace29.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmPledgee
	 * AggregateBalancePerSafekeepingPlace31.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmPledgee
	 * AggregateBalancePerSafekeepingPlace30.mmPledgee}</li>
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
	public static final MMBusinessAssociationEnd mmPledgee = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalancePerSafekeepingPlace24.mmPledgee, AggregateBalancePerSafekeepingPlace25.mmPledgee, AggregateBalancePerSafekeepingPlace26.mmPledgee,
					AggregateBalancePerSafekeepingPlace27.mmPledgee, AggregateBalancePerSafekeepingPlace28.mmPledgee, AggregateBalancePerSafekeepingPlace29.mmPledgee, AggregateBalancePerSafekeepingPlace31.mmPledgee,
					AggregateBalancePerSafekeepingPlace30.mmPledgee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pledgee";
			definition = "Pledgee at which the securities are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Pledgee.mmSecuritiesBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Pledgee.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalance";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmBalance, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.mmAggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedSubBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.mmAvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.mmUnavailableQuantityBalance,
						com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesBalance, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesBalance,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.mmMainSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesSubBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance,
						com.tools20022.repository.entity.IntraPositionTransfer.mmSecuritiesBalance, com.tools20022.repository.entity.MeetingEntitlement.mmEligiblePosition, com.tools20022.repository.entity.Pledgee.mmSecuritiesBalance);
				derivationElement_lazy = () -> Arrays.asList(BalanceFormat1Choice.mmBalance, BalanceFormat1Choice.mmEligibleBalance, BalanceFormat1Choice.mmNotEligibleBalance, BalanceFormat2Choice.mmBalance,
						BalanceFormat2Choice.mmEligibleBalance, BalanceFormat2Choice.mmNotEligibleBalance, BalanceFormat3Choice.mmBalance, BalanceFormat3Choice.mmEligibleBalance, BalanceFormat3Choice.mmNotEligibleBalance,
						BalanceFormat3Choice.mmFullPeriodUnits, BalanceFormat3Choice.mmPartWayPeriodUnits, BalanceFormat4Choice.mmBalance, BalanceFormat4Choice.mmEligibleBalance, BalanceFormat4Choice.mmNotEligibleBalance,
						BalanceFormat4Choice.mmFullPeriodUnits, BalanceFormat4Choice.mmPartWayPeriodUnits, Balance1.mmQuantity, AggregateBalancePerSafekeepingPlace7.mmAggregateBalance, AggregateBalanceInformation8.mmAggregateBalance,
						Balance2.mmQuantity, AggregateBalancePerSafekeepingPlace10.mmAggregateBalance, AggregateBalanceInformation11.mmAggregateBalance, AggregateBalancePerSafekeepingPlace2.mmAggregateBalance,
						AggregateBalanceInformation2.mmAggregateQuantity, AggregateBalancePerSafekeepingPlace4.mmAggregateBalance, AggregateBalanceInformation3.mmAggregateQuantity, AggregateBalancePerSafekeepingPlace12.mmAggregateBalance,
						AggregateBalanceInformation13.mmAggregateBalance, AggregateBalancePerSafekeepingPlace14.mmAggregateBalance, AggregateBalanceInformation15.mmAggregateBalance, AggregateBalancePerSafekeepingPlace16.mmAggregateBalance,
						AggregateBalanceInformation17.mmAggregateBalance, AggregateBalancePerSafekeepingPlace18.mmAggregateBalance, AggregateBalanceInformation19.mmAggregateBalance, Balance4.mmQuantity,
						AggregateBalancePerSafekeepingPlace21.mmAggregateBalance, AggregateBalanceInformation22.mmAggregateBalance, Balance5.mmQuantity, AggregateBalancePerSafekeepingPlace22.mmAggregateBalance,
						AggregateBalanceInformation23.mmAggregateBalance, AggregateBalancePerSafekeepingPlace8.mmAggregateBalance, AggregateBalancePerSafekeepingPlace8.mmNotAvailableBalance, AggregateBalanceInformation9.mmAggregateBalance,
						AggregateBalanceInformation9.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace9.mmAggregateBalance, AggregateBalancePerSafekeepingPlace9.mmNotAvailableBalance,
						AggregateBalanceInformation10.mmAggregateBalance, AggregateBalanceInformation10.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace1.mmAggregateQuantity,
						AggregateBalancePerSafekeepingPlace1.mmNotAvailableQuantity, AggregateBalanceInformation1.mmAggregateQuantity, AggregateBalanceInformation1.mmNotAvailableQuantity,
						AggregateBalancePerSafekeepingPlace3.mmAggregateQuantity, AggregateBalancePerSafekeepingPlace3.mmNotAvailableQuantity, AggregateBalanceInformation4.mmAggregateQuantity,
						AggregateBalanceInformation4.mmNotAvailableQuantity, AggregateBalancePerSafekeepingPlace11.mmAggregateBalance, AggregateBalancePerSafekeepingPlace11.mmNotAvailableBalance,
						AggregateBalanceInformation12.mmAggregateBalance, AggregateBalanceInformation12.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace13.mmAggregateBalance,
						AggregateBalancePerSafekeepingPlace13.mmNotAvailableBalance, AggregateBalanceInformation14.mmAggregateBalance, AggregateBalanceInformation14.mmNotAvailableBalance,
						AggregateBalancePerSafekeepingPlace15.mmAggregateBalance, AggregateBalancePerSafekeepingPlace15.mmNotAvailableBalance, AggregateBalanceInformation16.mmAggregateBalance,
						AggregateBalanceInformation16.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace17.mmAggregateBalance, AggregateBalancePerSafekeepingPlace17.mmNotAvailableBalance,
						AggregateBalanceInformation18.mmAggregateBalance, AggregateBalanceInformation18.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace20.mmAggregateBalance,
						AggregateBalancePerSafekeepingPlace20.mmNotAvailableBalance, AggregateBalanceInformation21.mmAggregateBalance, AggregateBalanceInformation21.mmNotAvailableBalance,
						AggregateBalancePerSafekeepingPlace23.mmAggregateBalance, AggregateBalancePerSafekeepingPlace23.mmNotAvailableBalance, AggregateBalanceInformation24.mmAggregateBalance,
						AggregateBalanceInformation24.mmNotAvailableBalance, ClosingBalance1.mmClosingBalance, ClosingBalance2.mmClosingBalance, AccountingStatementOfHoldings1.mmBalanceForAccount,
						AccountingStatementOfHoldings2.mmBalanceForAccount, CustodyStatementOfHoldings1.mmBalanceForAccount, CustodyStatementOfHoldings2.mmBalanceForAccount, SecurityPosition5.mmPosition, SecurityPosition6.mmPosition,
						SecurityPosition7.mmPosition, AggregateBalanceInformation5.mmAggregateQuantity, AggregateBalancePerSafekeepingPlace19.mmAggregateBalance, AggregateBalancePerSafekeepingPlace19.mmNotAvailableBalance,
						AggregateBalanceInformation20.mmAggregateBalance, AggregateBalanceInformation20.mmNotAvailableBalance, Balance3.mmBalanceForAccount, AggregateBalancePerSafekeepingPlace6.mmAggregateQuantity,
						AggregateBalanceInformation6.mmAggregateQuantity, AggregateBalancePerSafekeepingPlace5.mmAggregateQuantity, AggregateBalancePerSafekeepingPlace5.mmNotAvailableQuantity,
						AggregateBalanceInformation7.mmAggregateQuantity, AggregateBalanceInformation7.mmNotAvailableQuantity, TotalEligibleBalanceFormat1.mmFullPeriodUnits, TotalEligibleBalanceFormat1.mmPartWayPeriodUnits,
						TotalEligibleBalanceFormat4.mmFullPeriodUnits, TotalEligibleBalanceFormat4.mmPartWayPeriodUnits, SafekeepingAccount5.mmBalanceForAccount, SafekeepingAccount5.mmAccountSubLevel1Difference,
						AggregateHoldingBalance2.mmBalanceForFinancialInstrument, FinancialInstrumentAggregateBalance2.mmBalanceBreakdown, AccountSubLevel1.mmBalanceForAccount, AccountSubLevel1.mmAccountSubLevel2Difference,
						AccountSubLevel4.mmBalanceForAccount, AccountSubLevel4.mmAccountSubLevel5Difference, AccountSubLevel5.mmBalanceForAccount, AccountSubLevel5.mmAccountSubLevel6Difference, AccountSubLevel2.mmBalanceForAccount,
						AccountSubLevel2.mmAccountSubLevel3Difference, AccountSubLevel3.mmBalanceForAccount, AccountSubLevel3.mmAccountSubLevel4Difference, AccountSubLevel6.mmBalanceForAccount,
						AccountSubLevel6.mmAccountSubLevel7Difference, AccountSubLevel7.mmBalanceForAccount, AccountSubLevel7.mmAccountSubLevel8Difference, AccountSubLevel8.mmBalanceForAccount,
						AccountSubLevel8.mmAccountSubLevel9Difference, AccountSubLevel9.mmBalanceForAccount, AggregateBalanceInformation26.mmAggregateBalance, AggregateBalanceInformation25.mmAggregateBalance,
						AggregateBalanceInformation25.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace24.mmAggregateBalance, AggregateBalancePerSafekeepingPlace24.mmNotAvailableBalance,
						AggregateBalancePerSafekeepingPlace25.mmAggregateBalance, SecurityPosition8.mmPosition, SecurityPosition9.mmPosition, AggregateBalanceInformation28.mmAggregateBalance,
						AggregateBalanceInformation28.mmNotAvailableBalance, AggregateBalanceInformation27.mmAggregateBalance, AggregateBalancePerSafekeepingPlace26.mmAggregateBalance,
						AggregateBalancePerSafekeepingPlace27.mmAggregateBalance, AggregateBalancePerSafekeepingPlace27.mmNotAvailableBalance, AggregateBalanceInformation30.mmAggregateBalance,
						AggregateBalanceInformation30.mmNotAvailableBalance, AggregateBalanceInformation31.mmAggregateBalance, AggregateBalancePerSafekeepingPlace28.mmAggregateBalance,
						AggregateBalancePerSafekeepingPlace28.mmNotAvailableBalance, AggregateBalancePerSafekeepingPlace29.mmAggregateBalance, Balance6.mmQuantity, ClosingBalance3.mmClosingBalance, Balance7.mmQuantity,
						BalanceFormat5Choice.mmBalance, BalanceFormat5Choice.mmEligibleBalance, BalanceFormat5Choice.mmNotEligibleBalance, TotalEligibleBalanceFormat8.mmFullPeriodUnits, TotalEligibleBalanceFormat8.mmPartWayPeriodUnits,
						BalanceFormat6Choice.mmBalance, BalanceFormat6Choice.mmEligibleBalance, BalanceFormat6Choice.mmNotEligibleBalance, BalanceFormat6Choice.mmFullPeriodUnits, BalanceFormat6Choice.mmPartWayPeriodUnits,
						Balance9.mmQuantity, Balance8.mmQuantity, BalanceFormat7Choice.mmBalance, BalanceFormat7Choice.mmEligibleBalance, BalanceFormat7Choice.mmNotEligibleBalance, TotalEligibleBalanceFormat9.mmFullPeriodUnits,
						TotalEligibleBalanceFormat9.mmPartWayPeriodUnits, BalanceFormat10Choice.mmBalance, BalanceFormat10Choice.mmEligibleBalance, BalanceFormat10Choice.mmNotEligibleBalance, BalanceFormat10Choice.mmFullPeriodUnits,
						BalanceFormat10Choice.mmPartWayPeriodUnits, AggregateBalanceInformation32.mmAggregateBalance, AggregateBalanceInformation33.mmAggregateBalance, AggregateBalanceInformation33.mmNotAvailableBalance,
						Balance11.mmQuantity, AggregateBalancePerSafekeepingPlace31.mmAggregateBalance, AggregateBalancePerSafekeepingPlace31.mmNotAvailableBalance, ClosingBalance4.mmClosingBalance, Balance10.mmQuantity,
						AggregateBalancePerSafekeepingPlace30.mmAggregateBalance, Balance13.mmQuantity, Balance12.mmQuantity, Balance14.mmBalanceForAccount, AggregateBalanceInformation34.mmAggregateBalance,
						AggregateBalanceInformation34.mmNotAvailableBalance, SafekeepingAccount7.mmBalanceDetails, SafekeepingAccount7.mmAccountSubLevel1Difference, AccountSubLevel15.mmBalanceDetails,
						AccountSubLevel15.mmAccountSubLevel6Difference, AccountSubLevel16.mmBalanceDetails, AccountSubLevel16.mmAccountSubLevel7Difference, AggregateHoldingBalance3.mmBalanceForAccount, AccountSubLevel18.mmBalanceDetails,
						AccountSubLevel18.mmAccountSubLevel9Difference, AccountSubLevel19.mmBalanceDetails, AccountSubLevel11.mmBalanceDetails, AccountSubLevel11.mmAccountSubLevel2Difference, AccountSubLevel12.mmBalanceDetails,
						AccountSubLevel12.mmAccountSubLevel3Difference, AccountSubLevel17.mmBalanceDetails, AccountSubLevel17.mmAccountSubLevel8Difference, AccountSubLevel13.mmBalanceDetails, AccountSubLevel13.mmAccountSubLevel4Difference,
						AccountSubLevel14.mmBalanceDetails, AccountSubLevel14.mmAccountSubLevel5Difference);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.mmNetGainLoss, com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesBalance.mmEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmShortLong,
						com.tools20022.repository.entity.SecuritiesBalance.mmAggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmCorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmInstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.mmMainSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesSubBalance,
						com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesBalanceType, com.tools20022.repository.entity.SecuritiesBalance.mmSubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.mmSecurity,
						com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate, com.tools20022.repository.entity.SecuritiesBalance.mmAvailabilityIndicator, com.tools20022.repository.entity.SecuritiesBalance.mmAvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.mmRelatedMeetingEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmUnavailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.mmRelatedIntraPositionTransfer,
						com.tools20022.repository.entity.SecuritiesBalance.mmCostAdjustment, com.tools20022.repository.entity.SecuritiesBalance.mmPledgee);
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
						Balance13.mmObject(), Balance12.mmObject(), Balance14.mmObject(), AggregateBalanceInformation34.mmObject(), IntraPositionType2.mmObject(), AggregateHoldingBalance3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesBalance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getNetGainLoss() {
		return netGainLoss;
	}

	public SecuritiesBalance setNetGainLoss(CurrencyAndAmount netGainLoss) {
		this.netGainLoss = Objects.requireNonNull(netGainLoss);
		return this;
	}

	public Optional<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount == null ? Optional.empty() : Optional.of(securitiesAccount);
	}

	public SecuritiesBalance setSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
		return this;
	}

	public Optional<CorporateActionEntitlement> getEligibleBalanceRelatedEntitlement() {
		return eligibleBalanceRelatedEntitlement == null ? Optional.empty() : Optional.of(eligibleBalanceRelatedEntitlement);
	}

	public SecuritiesBalance setEligibleBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement eligibleBalanceRelatedEntitlement) {
		this.eligibleBalanceRelatedEntitlement = eligibleBalanceRelatedEntitlement;
		return this;
	}

	public ShortLongCode getShortLong() {
		return shortLong;
	}

	public SecuritiesBalance setShortLong(ShortLongCode shortLong) {
		this.shortLong = Objects.requireNonNull(shortLong);
		return this;
	}

	public SecuritiesQuantity getAggregateQuantity() {
		return aggregateQuantity;
	}

	public SecuritiesBalance setAggregateQuantity(com.tools20022.repository.entity.SecuritiesQuantity aggregateQuantity) {
		this.aggregateQuantity = Objects.requireNonNull(aggregateQuantity);
		return this;
	}

	public CorporateActionEntitlement getCorporateActionEntitlement() {
		return corporateActionEntitlement;
	}

	public SecuritiesBalance setCorporateActionEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement corporateActionEntitlement) {
		this.corporateActionEntitlement = Objects.requireNonNull(corporateActionEntitlement);
		return this;
	}

	public Optional<CorporateActionEntitlement> getInstructedBalanceRelatedEntitlement() {
		return instructedBalanceRelatedEntitlement == null ? Optional.empty() : Optional.of(instructedBalanceRelatedEntitlement);
	}

	public SecuritiesBalance setInstructedBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement instructedBalanceRelatedEntitlement) {
		this.instructedBalanceRelatedEntitlement = instructedBalanceRelatedEntitlement;
		return this;
	}

	public Optional<CorporateActionEntitlement> getUninstructedBalanceRelatedEntitlement() {
		return uninstructedBalanceRelatedEntitlement == null ? Optional.empty() : Optional.of(uninstructedBalanceRelatedEntitlement);
	}

	public SecuritiesBalance setUninstructedBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement uninstructedBalanceRelatedEntitlement) {
		this.uninstructedBalanceRelatedEntitlement = uninstructedBalanceRelatedEntitlement;
		return this;
	}

	public Optional<SecuritiesBalance> getMainSecuritiesBalance() {
		return mainSecuritiesBalance == null ? Optional.empty() : Optional.of(mainSecuritiesBalance);
	}

	public SecuritiesBalance setMainSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance mainSecuritiesBalance) {
		this.mainSecuritiesBalance = mainSecuritiesBalance;
		return this;
	}

	public List<SecuritiesBalance> getSecuritiesSubBalance() {
		return securitiesSubBalance == null ? securitiesSubBalance = new ArrayList<>() : securitiesSubBalance;
	}

	public SecuritiesBalance setSecuritiesSubBalance(List<com.tools20022.repository.entity.SecuritiesBalance> securitiesSubBalance) {
		this.securitiesSubBalance = Objects.requireNonNull(securitiesSubBalance);
		return this;
	}

	public SecuritiesBalanceTypeV2Code getSecuritiesBalanceType() {
		return securitiesBalanceType;
	}

	public SecuritiesBalance setSecuritiesBalanceType(SecuritiesBalanceTypeV2Code securitiesBalanceType) {
		this.securitiesBalanceType = Objects.requireNonNull(securitiesBalanceType);
		return this;
	}

	public SecuritiesQuantity getSubBalanceQuantity() {
		return subBalanceQuantity;
	}

	public SecuritiesBalance setSubBalanceQuantity(com.tools20022.repository.entity.SecuritiesQuantity subBalanceQuantity) {
		this.subBalanceQuantity = Objects.requireNonNull(subBalanceQuantity);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesBalance setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<CurrencyExchange> getExchangeRate() {
		return exchangeRate == null ? exchangeRate = new ArrayList<>() : exchangeRate;
	}

	public SecuritiesBalance setExchangeRate(List<com.tools20022.repository.entity.CurrencyExchange> exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public YesNoIndicator getAvailabilityIndicator() {
		return availabilityIndicator;
	}

	public SecuritiesBalance setAvailabilityIndicator(YesNoIndicator availabilityIndicator) {
		this.availabilityIndicator = Objects.requireNonNull(availabilityIndicator);
		return this;
	}

	public SecuritiesQuantity getAvailableQuantity() {
		return availableQuantity;
	}

	public SecuritiesBalance setAvailableQuantity(com.tools20022.repository.entity.SecuritiesQuantity availableQuantity) {
		this.availableQuantity = Objects.requireNonNull(availableQuantity);
		return this;
	}

	public Optional<MeetingEntitlement> getRelatedMeetingEntitlement() {
		return relatedMeetingEntitlement == null ? Optional.empty() : Optional.of(relatedMeetingEntitlement);
	}

	public SecuritiesBalance setRelatedMeetingEntitlement(com.tools20022.repository.entity.MeetingEntitlement relatedMeetingEntitlement) {
		this.relatedMeetingEntitlement = relatedMeetingEntitlement;
		return this;
	}

	public SecuritiesQuantity getUnavailableQuantity() {
		return unavailableQuantity;
	}

	public SecuritiesBalance setUnavailableQuantity(com.tools20022.repository.entity.SecuritiesQuantity unavailableQuantity) {
		this.unavailableQuantity = Objects.requireNonNull(unavailableQuantity);
		return this;
	}

	public List<SafekeepingPlace> getSafekeepingPlace() {
		return safekeepingPlace == null ? safekeepingPlace = new ArrayList<>() : safekeepingPlace;
	}

	public SecuritiesBalance setSafekeepingPlace(List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace) {
		this.safekeepingPlace = Objects.requireNonNull(safekeepingPlace);
		return this;
	}

	public List<SecuritiesEntry> getSecuritiesEntry() {
		return securitiesEntry == null ? securitiesEntry = new ArrayList<>() : securitiesEntry;
	}

	public SecuritiesBalance setSecuritiesEntry(List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry) {
		this.securitiesEntry = Objects.requireNonNull(securitiesEntry);
		return this;
	}

	public CorporateActionEntitlement getNotEligibleBalanceRelatedEntitlement() {
		return notEligibleBalanceRelatedEntitlement;
	}

	public SecuritiesBalance setNotEligibleBalanceRelatedEntitlement(com.tools20022.repository.entity.CorporateActionEntitlement notEligibleBalanceRelatedEntitlement) {
		this.notEligibleBalanceRelatedEntitlement = Objects.requireNonNull(notEligibleBalanceRelatedEntitlement);
		return this;
	}

	public IntraPositionTransfer getRelatedIntraPositionTransfer() {
		return relatedIntraPositionTransfer;
	}

	public SecuritiesBalance setRelatedIntraPositionTransfer(com.tools20022.repository.entity.IntraPositionTransfer relatedIntraPositionTransfer) {
		this.relatedIntraPositionTransfer = Objects.requireNonNull(relatedIntraPositionTransfer);
		return this;
	}

	public CurrencyAndAmount getCostAdjustment() {
		return costAdjustment;
	}

	public SecuritiesBalance setCostAdjustment(CurrencyAndAmount costAdjustment) {
		this.costAdjustment = Objects.requireNonNull(costAdjustment);
		return this;
	}

	public List<Pledgee> getPledgee() {
		return pledgee == null ? pledgee = new ArrayList<>() : pledgee;
	}

	public SecuritiesBalance setPledgee(List<com.tools20022.repository.entity.Pledgee> pledgee) {
		this.pledgee = Objects.requireNonNull(pledgee);
		return this;
	}
}