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
import com.tools20022.repository.codeset.ClearingAccountTypeCode;
import com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesAccount" src="doc-files/SecuritiesAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesAccountType
 * SecuritiesAccount.SecuritiesAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedInvestmentAccount
 * SecuritiesAccount.RelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedTransfer
 * SecuritiesAccount.RelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesPartyRole
 * SecuritiesAccount.SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesAccount#Security
 * SecuritiesAccount.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedRegistrar
 * SecuritiesAccount.RelatedRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SafekeepingPlace
 * SecuritiesAccount.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesBalance
 * SecuritiesAccount.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#CorporateActionServicing
 * SecuritiesAccount.CorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedAllocation
 * SecuritiesAccount.RelatedAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesEntry
 * SecuritiesAccount.SecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#ClearingAccountOwner
 * SecuritiesAccount.ClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#MarginAccountOwner
 * SecuritiesAccount.MarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DeliveryAccountOwner
 * SecuritiesAccount.DeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedPowerOfAttorney
 * SecuritiesAccount.RelatedPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedMeetingInstruction
 * SecuritiesAccount.RelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#ClearingAccountType
 * SecuritiesAccount.ClearingAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedOrder
 * SecuritiesAccount.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DisclosedListTrading
 * SecuritiesAccount.DisclosedListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#AccountLink
 * SecuritiesAccount.AccountLink}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesAccount
 * Security.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SecuritiesAccount
 * InvestmentAccount.SecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Account
 * SecuritiesTransfer.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingAccount
 * ClearingMemberRole.ClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#MarginAccount
 * ClearingMemberRole.MarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DeliveryAccount
 * ClearingMemberRole.DeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#SecuritiesAccount
 * SecuritiesPartyRole.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesAccount
 * SecuritiesEntry.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#RelatedSecuritiesAccount
 * SafekeepingPlace.RelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesAccount
 * SecuritiesBalance.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegistrarRole#RegistrarAccount
 * RegistrarRole.RegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#SecuritiesAccount
 * CorporateActionServicing.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderingAccount
 * SecuritiesOrder.OrderingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#AllocationAccount
 * Allocation.AllocationAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#SafekeepingAccount
 * InstructionForMeeting.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedAccount
 * PowerOfAttorney.AuthorisedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#SecuritiesAccount
 * AccountLink.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#DisclosedListTradingAccount
 * DisclosedListTrading.DisclosedListTradingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount16#SafekeepingAccount
 * PartyIdentificationAndAccount16.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount44#SafekeepingAccount
 * PartyIdentificationAndAccount44.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1#SafekeepingAccount
 * PartyIdentificationAndAccount1.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42#SafekeepingAccount
 * PartyIdentificationAndAccount42.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#SafekeepingAccount
 * PartyIdentificationAndAccount19.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21#SafekeepingAccount
 * PartyIdentificationAndAccount21.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#SafekeepingAccount
 * PartyIdentificationAndAccount40.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41#SafekeepingAccount
 * PartyIdentificationAndAccount41.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount81#SafekeepingAccount
 * PartyIdentificationAndAccount81.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#SafekeepingAccount
 * QuantityAndAccount30.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43#SafekeepingAccount
 * PartyIdentificationAndAccount43.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount68#SafekeepingAccount
 * PartyIdentificationAndAccount68.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount75#SafekeepingAccount
 * PartyIdentificationAndAccount75.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63#SafekeepingAccount
 * PartyIdentificationAndAccount63.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount88#SafekeepingAccount
 * PartyIdentificationAndAccount88.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66#SafekeepingAccount
 * PartyIdentificationAndAccount66.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#SafekeepingAccount
 * QuantityAndAccount33.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification9#SafekeepingAccount
 * AccountIdentification9.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification14#SafekeepingAccount
 * AccountIdentification14.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification15#SafekeepingAccount
 * AccountIdentification15.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification21#SafekeepingAccount
 * AccountIdentification21.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance2#SafekeepingAccount
 * AccountAndBalance2.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance5#SafekeepingAccount
 * AccountAndBalance5.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance10#SafekeepingAccount
 * AccountAndBalance10.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance12#SafekeepingAccount
 * AccountAndBalance12.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance17#SafekeepingAccount
 * AccountAndBalance17.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance20#SafekeepingAccount
 * AccountAndBalance20.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification8#SafekeepingAccount
 * AccountIdentification8.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification17#SafekeepingAccount
 * AccountIdentification17.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification19#SafekeepingAccount
 * AccountIdentification19.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification6#SafekeepingAccount
 * AccountIdentification6.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification12#SafekeepingAccount
 * AccountIdentification12.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification16#SafekeepingAccount
 * AccountIdentification16.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification22#SafekeepingAccount
 * AccountIdentification22.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification23#SafekeepingAccount
 * AccountIdentification23.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification24#SafekeepingAccount
 * AccountIdentification24.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification25#SafekeepingAccount
 * AccountIdentification25.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#SafekeepingAccount
 * AccountIdentification29.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance3#SafekeepingAccount
 * AccountAndBalance3.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14#SafekeepingAccount
 * PartyIdentificationAndAccount14.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance6#SafekeepingAccount
 * AccountAndBalance6.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22#SafekeepingAccount
 * PartyIdentificationAndAccount22.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance11#SafekeepingAccount
 * AccountAndBalance11.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51#SafekeepingAccount
 * PartyIdentificationAndAccount51.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance13#SafekeepingAccount
 * AccountAndBalance13.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56#SafekeepingAccount
 * PartyIdentificationAndAccount56.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance16#SafekeepingAccount
 * AccountAndBalance16.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance19#SafekeepingAccount
 * AccountAndBalance19.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance22#SafekeepingAccount
 * AccountAndBalance22.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance23#SafekeepingAccount
 * AccountAndBalance23.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance1#SafekeepingAccount
 * AccountAndBalance1.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification7Choice#AccountsListAndBalanceDetails
 * AccountIdentification7Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance7#SafekeepingAccount
 * AccountAndBalance7.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification8Choice#AccountsListAndBalanceDetails
 * AccountIdentification8Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance9#SafekeepingAccount
 * AccountAndBalance9.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice#AccountsListAndBalanceDetails
 * AccountIdentification12Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance14#SafekeepingAccount
 * AccountAndBalance14.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification15Choice#AccountsListAndBalanceDetails
 * AccountIdentification15Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance15#SafekeepingAccount
 * AccountAndBalance15.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification18Choice#AccountsListAndBalanceDetails
 * AccountIdentification18Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance18#SafekeepingAccount
 * AccountAndBalance18.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification19Choice#AccountsListAndBalanceDetails
 * AccountIdentification19Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance21#SafekeepingAccount
 * AccountAndBalance21.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification21Choice#AccountsListAndBalanceDetails
 * AccountIdentification21Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance24#SafekeepingAccount
 * AccountAndBalance24.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification22Choice#AccountsListAndBalanceDetails
 * AccountIdentification22Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance4#SafekeepingAccount
 * AccountAndBalance4.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8#SafekeepingAccount
 * AccountAndBalance8.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification10#SafekeepingAccount
 * SubAccountIdentification10.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification13#SafekeepingAccount
 * SubAccountIdentification13.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification16#SafekeepingAccount
 * SubAccountIdentification16.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification20#SafekeepingAccount
 * SubAccountIdentification20.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification23#SafekeepingAccount
 * SubAccountIdentification23.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification26#SafekeepingAccount
 * SubAccountIdentification26.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification29#SafekeepingAccount
 * SubAccountIdentification29.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification31#SafekeepingAccount
 * SubAccountIdentification31.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification11#SafekeepingAccount
 * SubAccountIdentification11.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification12#SafekeepingAccount
 * SubAccountIdentification12.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification17#SafekeepingAccount
 * SubAccountIdentification17.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification19#SafekeepingAccount
 * SubAccountIdentification19.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification22#SafekeepingAccount
 * SubAccountIdentification22.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification25#SafekeepingAccount
 * SubAccountIdentification25.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification28#SafekeepingAccount
 * SubAccountIdentification28.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification32#SafekeepingAccount
 * SubAccountIdentification32.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#SafekeepingAccount
 * QuantityAndAccount6.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#SafekeepingAccount
 * QuantityAndAccount11.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26#SafekeepingAccount
 * PartyIdentificationAndAccount26.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#SafekeepingAccount
 * PartyIdentificationAndAccount28.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30#SafekeepingAccount
 * PartyIdentificationAndAccount30.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#SafekeepingAccount
 * QuantityAndAccount18.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35#SafekeepingAccount
 * PartyIdentificationAndAccount35.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#SafekeepingAccount
 * PartyIdentificationAndAccount36.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37#SafekeepingAccount
 * PartyIdentificationAndAccount37.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#SafekeepingAccount
 * QuantityAndAccount19.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49#SafekeepingAccount
 * PartyIdentificationAndAccount49.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#SafekeepingAccount
 * PartyIdentificationAndAccount61.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62#SafekeepingAccount
 * PartyIdentificationAndAccount62.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#SafekeepingAccount
 * QuantityAndAccount1.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#SafekeepingAccount
 * QuantityAndAccount5.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#SafekeepingAccount
 * QuantityAndAccount17.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#SafekeepingAccount
 * QuantityAndAccount24.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#SafekeepingAccount
 * QuantityAndAccount25.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#SafekeepingAccount
 * QuantityAndAccount34.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount25#SafekeepingAccount
 * PartyIdentificationAndAccount25.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#SafekeepingAccount
 * QuantityAndAccount2.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#SafekeepingAccount
 * QuantityAndAccount12.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#SafekeepingAccount
 * QuantityAndAccount15.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#SafekeepingAccount
 * QuantityAndAccount20.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#SafekeepingAccount
 * PartyIdentificationAndAccount65.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67#SafekeepingAccount
 * PartyIdentificationAndAccount67.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#SafekeepingAccount
 * QuantityAndAccount28.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#SafekeepingAccount
 * QuantityAndAccount37.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification9#SafekeepingAccount
 * SubAccountIdentification9.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification14#SafekeepingAccount
 * SubAccountIdentification14.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification15#SafekeepingAccount
 * SubAccountIdentification15.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification18#SafekeepingAccount
 * SubAccountIdentification18.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification21#SafekeepingAccount
 * SubAccountIdentification21.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification24#SafekeepingAccount
 * SubAccountIdentification24.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification30#SafekeepingAccount
 * SubAccountIdentification30.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification33#SafekeepingAccount
 * SubAccountIdentification33.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#SafekeepingAccount
 * PartyIdentificationAndAccount9.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#SafekeepingAccount
 * PartyIdentificationAndAccount79.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#SafekeepingAccount
 * PartyIdentificationAndAccount83.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#SafekeepingAccount
 * PartyIdentificationAndAccount77.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#SafekeepingAccount
 * ConfirmationPartyDetails4.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary14#SafekeepingDetails
 * Intermediary14.SafekeepingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#SafekeepingAccount
 * ConfirmationPartyDetails3.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10#SafekeepingAccount
 * PartyIdentificationAndAccount10.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#SafekeepingAccount
 * PartyIdentificationAndAccount8.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#SafekeepingAccount
 * ConfirmationPartyDetails6.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#SafekeepingAccount
 * PartyIdentificationAndAccount34.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityMovement1#AccountDetails
 * SecurityMovement1.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesProceeds1#AccountDetails
 * SecuritiesProceeds1.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#AccountDetails
 * CorporateActionStandingInstructionGeneralInformation1.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#SecuritiesDistributionDetails
 * CorporateActionStandingInstruction1.SecuritiesDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#SafekeepingAccount
 * QuantityAndAccount7.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#SafekeepingAccount
 * QuantityAndAccount16.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails2.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails8.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#SafekeepingAccount
 * QuantityAndAccount3.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#SafekeepingAccount
 * QuantityAndAccount13.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45#SafekeepingAccount
 * PartyIdentificationAndAccount45.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#SafekeepingAccount
 * PartyIdentificationAndAccount46.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47#SafekeepingAccount
 * PartyIdentificationAndAccount47.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification7#SafekeepingAccount
 * AccountIdentification7.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification13#SafekeepingAccount
 * AccountIdentification13.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification18#SafekeepingAccount
 * AccountIdentification18.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification20#SafekeepingAccount
 * AccountIdentification20.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#SafekeepingAccount
 * QuantityAndAccount10.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#SafekeepingAccount
 * QuantityAndAccount21.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails6.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails10.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails17.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails18.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#SafekeepingAccount
 * QuantityAndAccount4.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#SafekeepingAccount
 * QuantityAndAccount22.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#SafekeepingAccount
 * QuantityAndAccount27.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#SafekeepingAccount
 * QuantityAndAccount36.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71#SafekeepingAccount
 * PartyIdentificationAndAccount71.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#SafekeepingAccount
 * PartyIdentificationAndAccount73.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74#SafekeepingAccount
 * PartyIdentificationAndAccount74.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount76#SafekeepingAccount
 * PartyIdentificationAndAccount76.SafekeepingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount21#SubAccount
 * SecuritiesAccount21.SubAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport1#MarginAccount
 * MarginReport1.MarginAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport2#MarginAccount
 * MarginReport2.MarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification11#SafekeepingAccount
 * AccountIdentification11.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice#Account
 * SecuritiesAccount1Choice.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification27#SafekeepingAccount
 * SubAccountIdentification27.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification7#SafekeepingAccount
 * SubaccountIdentification7.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification8#SafekeepingAccount
 * SubaccountIdentification8.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice#SecuritiesAccountIdentification
 * AccountIdentification20Choice.SecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification34#SafekeepingAccount
 * SubAccountIdentification34.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails21.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification23Choice#AccountsListAndBalanceDetails
 * AccountIdentification23Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance26#SafekeepingAccount
 * AccountAndBalance26.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance25#SafekeepingAccount
 * AccountAndBalance25.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95#AccountIdentification
 * PartyIdentificationAndAccount95.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance32#SafekeepingAccount
 * AccountAndBalance32.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification26Choice#AccountsListAndBalanceDetails
 * AccountIdentification26Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance29#SafekeepingAccount
 * AccountAndBalance29.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification35#SafekeepingAccount
 * SubAccountIdentification35.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails22.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#AccountIdentification
 * SafekeepingAccount5.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#AccountSubLevel1
 * SafekeepingAccount5.AccountSubLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#AccountSubLevel2
 * AccountSubLevel1.AccountSubLevel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#AccountSubLevel5
 * AccountSubLevel4.AccountSubLevel5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#AccountSubLevel6
 * AccountSubLevel5.AccountSubLevel6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#AccountSubLevel3
 * AccountSubLevel2.AccountSubLevel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#AccountSubLevel4
 * AccountSubLevel3.AccountSubLevel4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#AccountSubLevel7
 * AccountSubLevel6.AccountSubLevel7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#AccountSubLevel8
 * AccountSubLevel7.AccountSubLevel8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#AccountSubLevel9
 * AccountSubLevel8.AccountSubLevel9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails24.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification38#SafekeepingAccount
 * SubAccountIdentification38.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification37#SafekeepingAccount
 * SubAccountIdentification37.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#SafekeepingAccount
 * PartyIdentificationAndAccount100.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportItem1#AccountIdentification
 * ReportItem1.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification40#SafekeepingAccount
 * SubAccountIdentification40.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails25.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification39#SafekeepingAccount
 * SubAccountIdentification39.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#SafekeepingAccount
 * QuantityAndAccount39.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42#SafekeepingAccount
 * SubAccountIdentification42.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#SafekeepingAccount
 * QuantityAndAccount41.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification44#SafekeepingAccount
 * SubAccountIdentification44.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#SafekeepingAccount
 * QuantityAndAccount40.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#SafekeepingAccount
 * QuantityAndAccount42.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#SafekeepingAccount
 * QuantityAndAccount38.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails26.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#SafekeepingAccount
 * SubAccountIdentification43.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#SafekeepingAccount
 * PartyIdentificationAndAccount106.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#SafekeepingAccount
 * QuantityAndAccount43.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#SafekeepingAccount
 * PartyIdentificationAndAccount117.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#SafekeepingAccount
 * PartyIdentificationAndAccount108.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#SafekeepingAccount
 * PartyIdentificationAndAccount107.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#SafekeepingAccount
 * AccountAndBalance34.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#SafekeepingAccount
 * AccountAndBalance35.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance36#SafekeepingAccount
 * AccountAndBalance36.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification33#SafekeepingAccount
 * AccountIdentification33.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice#AccountsListAndBalanceDetails
 * AccountIdentification32Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification31#SafekeepingAccount
 * AccountIdentification31.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#SafekeepingAccount
 * PartyIdentificationAndAccount122.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#SafekeepingAccount
 * AccountAndBalance33.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#SafekeepingAccount
 * AccountIdentification32.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#SafekeepingAccount
 * PartyIdentificationAndAccount127.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance40#SafekeepingAccount
 * AccountAndBalance40.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38#SafekeepingAccount
 * AccountAndBalance38.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification36Choice#AccountsListAndBalanceDetails
 * AccountIdentification36Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification35#SafekeepingAccount
 * AccountIdentification35.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance37#SafekeepingAccount
 * AccountAndBalance37.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification34#SafekeepingAccount
 * AccountIdentification34.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification37#SafekeepingAccount
 * AccountIdentification37.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance39#SafekeepingAccount
 * AccountAndBalance39.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128#SafekeepingAccount
 * PartyIdentificationAndAccount128.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification47#SafekeepingAccount
 * SubAccountIdentification47.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#SafekeepingAccount
 * QuantityAndAccount47.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails33.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification45#SafekeepingAccount
 * SubAccountIdentification45.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#SafekeepingAccount
 * QuantityAndAccount48.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#SafekeepingAccount
 * QuantityAndAccount46.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification46#SafekeepingAccount
 * SubAccountIdentification46.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#SafekeepingAccount
 * QuantityAndAccount51.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#SafekeepingAccount
 * QuantityAndAccount49.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#SafekeepingAccount
 * PartyIdentificationAndAccount131.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146#SafekeepingAccount
 * PartyIdentificationAndAccount146.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135#SafekeepingAccount
 * PartyIdentificationAndAccount135.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#SafekeepingAccount
 * PartyIdentificationAndAccount136.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#SafekeepingAccount
 * QuantityAndAccount55.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification39#SafekeepingAccount
 * AccountIdentification39.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#AccountIdentification
 * SafekeepingAccount7.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#AccountSubLevel1
 * SafekeepingAccount7.AccountSubLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#AccountSubLevel6
 * AccountSubLevel15.AccountSubLevel6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#AccountSubLevel7
 * AccountSubLevel16.AccountSubLevel7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#AccountSubLevel9
 * AccountSubLevel18.AccountSubLevel9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#AccountSubLevel2
 * AccountSubLevel11.AccountSubLevel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#AccountSubLevel3
 * AccountSubLevel12.AccountSubLevel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#AccountSubLevel8
 * AccountSubLevel17.AccountSubLevel8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#AccountSubLevel4
 * AccountSubLevel13.AccountSubLevel4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#AccountSubLevel5
 * AccountSubLevel14.AccountSubLevel5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#SafekeepingAccount
 * AccountIdentification40.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification49#SafekeepingAccount
 * SubAccountIdentification49.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails35.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification50#SafekeepingAccount
 * SubAccountIdentification50.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification41#SafekeepingAccount
 * AccountIdentification41.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#SafekeepingAccount
 * SecuritiesFinancingTransactionDetails36.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#SafekeepingAccount
 * QuantityAndAccount57.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#SafekeepingAccount
 * QuantityAndAccount58.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#SafekeepingAccount
 * QuantityAndAccount56.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#SafekeepingAccount
 * QuantityAndAccount61.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#SafekeepingAccount
 * QuantityAndAccount62.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#SafekeepingAccount
 * QuantityAndAccount60.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification42#SafekeepingAccount
 * AccountIdentification42.SafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount1
 * SecuritiesAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount4
 * SecuritiesAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13
 * SecuritiesAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount17
 * SecuritiesAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance2
 * AccountAndBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance5
 * AccountAndBalance5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance10
 * AccountAndBalance10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance12
 * AccountAndBalance12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance17
 * AccountAndBalance17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance20
 * AccountAndBalance20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance3
 * AccountAndBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance6
 * AccountAndBalance6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance11
 * AccountAndBalance11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance13
 * AccountAndBalance13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance16
 * AccountAndBalance16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance19
 * AccountAndBalance19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance22
 * AccountAndBalance22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance23
 * AccountAndBalance23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance1
 * AccountAndBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance7
 * AccountAndBalance7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance9
 * AccountAndBalance9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance14
 * AccountAndBalance14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance15
 * AccountAndBalance15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance18
 * AccountAndBalance18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance21
 * AccountAndBalance21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance24
 * AccountAndBalance24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance4
 * AccountAndBalance4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance8
 * AccountAndBalance8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode1Choice
 * PurposeCode1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount11
 * SecuritiesAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount2
 * SecuritiesAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode2Choice
 * PurposeCode2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount14
 * SecuritiesAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode3Choice
 * PurposeCode3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount15
 * SecuritiesAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode4Choice
 * PurposeCode4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount16
 * SecuritiesAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount1
 * SafekeepingAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount2
 * SafekeepingAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification29
 * SubAccountIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification31
 * SubAccountIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification28
 * SubAccountIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification32
 * SubAccountIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification30
 * SubAccountIdentification30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification33
 * SubAccountIdentification33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20
 * SecuritiesAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode5Choice
 * PurposeCode5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3
 * SecuritiesAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount3
 * SafekeepingAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount4
 * SafekeepingAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount7
 * SecuritiesAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount9
 * SecuritiesAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount12
 * SecuritiesAccount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount8
 * SecuritiesAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount10
 * SecuritiesAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncludedAccount1
 * IncludedAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount6
 * SecuritiesAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount21
 * SecuritiesAccount21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19
 * SecuritiesAccount19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18
 * SecuritiesAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount5
 * SecuritiesAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice
 * SecuritiesAccount1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification34
 * SubAccountIdentification34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance26
 * AccountAndBalance26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance25
 * AccountAndBalance25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22
 * SecuritiesAccount22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance32
 * AccountAndBalance32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance29
 * AccountAndBalance29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification35
 * SubAccountIdentification35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount5
 * SafekeepingAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel1
 * AccountSubLevel1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel4
 * AccountSubLevel4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel5
 * AccountSubLevel5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel2
 * AccountSubLevel2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel3
 * AccountSubLevel3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel6
 * AccountSubLevel6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel7
 * AccountSubLevel7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel8
 * AccountSubLevel8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel9
 * AccountSubLevel9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification38
 * SubAccountIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification37
 * SubAccountIdentification37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount6
 * SafekeepingAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification40
 * SubAccountIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification39
 * SubAccountIdentification39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24
 * SecuritiesAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification42
 * SubAccountIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification44
 * SubAccountIdentification44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification43
 * SubAccountIdentification43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26
 * SecuritiesAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25
 * SecuritiesAccount25}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode7Choice
 * PurposeCode7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance34
 * AccountAndBalance34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance35
 * AccountAndBalance35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance36
 * AccountAndBalance36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance33
 * AccountAndBalance33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance40
 * AccountAndBalance40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance38
 * AccountAndBalance38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance37
 * AccountAndBalance37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance39
 * AccountAndBalance39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification47
 * SubAccountIdentification47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount33
 * SecuritiesAccount33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification45
 * SubAccountIdentification45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification46
 * SubAccountIdentification46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27
 * SecuritiesAccount27}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode8Choice
 * PurposeCode8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount30
 * SecuritiesAccount30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount34
 * SecuritiesAccount34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount7
 * SafekeepingAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel15
 * AccountSubLevel15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel16
 * AccountSubLevel16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel18
 * AccountSubLevel18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel19
 * AccountSubLevel19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel11
 * AccountSubLevel11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel12
 * AccountSubLevel12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel17
 * AccountSubLevel17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel13
 * AccountSubLevel13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel14
 * AccountSubLevel14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification49
 * SubAccountIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification50
 * SubAccountIdentification50}</li>
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
 * "SecuritiesAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * </ul>
 */
public class SecuritiesAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose#Purpose
	 * AccountIdentificationAndPurpose.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#Type
	 * SecuritiesAccount13.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount17#Type
	 * SecuritiesAccount17.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode1Choice#Code
	 * PurposeCode1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode1Choice#Proprietary
	 * PurposeCode1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount11#Type
	 * SecuritiesAccount11.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount2#Type
	 * SecuritiesAccount2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode2Choice#Code
	 * PurposeCode2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode2Choice#Proprietary
	 * PurposeCode2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount14#Type
	 * SecuritiesAccount14.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode3Choice#Code
	 * PurposeCode3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode3Choice#Proprietary
	 * PurposeCode3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount15#Type
	 * SecuritiesAccount15.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode4Choice#Code
	 * PurposeCode4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode4Choice#Proprietary
	 * PurposeCode4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount16#Type
	 * SecuritiesAccount16.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20#Type
	 * SecuritiesAccount20.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode5Choice#Code
	 * PurposeCode5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode5Choice#Proprietary
	 * PurposeCode5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3#Type
	 * SecuritiesAccount3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#Type
	 * SecuritiesAccount19.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18#Type
	 * SecuritiesAccount18.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#Type
	 * SecuritiesAccount22.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#Type
	 * SecuritiesAccount24.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26#Type
	 * SecuritiesAccount26.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25#Type
	 * SecuritiesAccount25.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode7Choice#Code
	 * PurposeCode7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode7Choice#Proprietary
	 * PurposeCode7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount33#Type
	 * SecuritiesAccount33.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27#Type
	 * SecuritiesAccount27.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode8Choice#Code
	 * PurposeCode8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode8Choice#Proprietary
	 * PurposeCode8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount30#Type
	 * SecuritiesAccount30.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount34#Type
	 * SecuritiesAccount34.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountIdentificationAndPurpose.Purpose, com.tools20022.repository.msg.SecuritiesAccount13.Type, com.tools20022.repository.msg.SecuritiesAccount17.Type,
					com.tools20022.repository.choice.PurposeCode1Choice.Code, com.tools20022.repository.choice.PurposeCode1Choice.Proprietary, com.tools20022.repository.msg.SecuritiesAccount11.Type,
					com.tools20022.repository.msg.SecuritiesAccount2.Type, com.tools20022.repository.choice.PurposeCode2Choice.Code, com.tools20022.repository.choice.PurposeCode2Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesAccount14.Type, com.tools20022.repository.choice.PurposeCode3Choice.Code, com.tools20022.repository.choice.PurposeCode3Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesAccount15.Type, com.tools20022.repository.choice.PurposeCode4Choice.Code, com.tools20022.repository.choice.PurposeCode4Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesAccount16.Type, com.tools20022.repository.msg.SecuritiesAccount20.Type, com.tools20022.repository.choice.PurposeCode5Choice.Code,
					com.tools20022.repository.choice.PurposeCode5Choice.Proprietary, com.tools20022.repository.msg.SecuritiesAccount3.Type, com.tools20022.repository.msg.SecuritiesAccount19.Type,
					com.tools20022.repository.msg.SecuritiesAccount18.Type, com.tools20022.repository.msg.SecuritiesAccount22.Type, com.tools20022.repository.msg.SecuritiesAccount24.Type,
					com.tools20022.repository.msg.SecuritiesAccount26.Type, com.tools20022.repository.msg.SecuritiesAccount25.Type, com.tools20022.repository.choice.PurposeCode7Choice.Code,
					com.tools20022.repository.choice.PurposeCode7Choice.Proprietary, com.tools20022.repository.msg.SecuritiesAccount33.Type, com.tools20022.repository.msg.SecuritiesAccount27.Type,
					com.tools20022.repository.choice.PurposeCode8Choice.Code, com.tools20022.repository.choice.PurposeCode8Choice.Proprietary, com.tools20022.repository.msg.SecuritiesAccount30.Type,
					com.tools20022.repository.msg.SecuritiesAccount34.Type);
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccountType";
			definition = "Specifies the type of securities account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
		}
	};
	/**
	 * Investment account which contains a securities account to make securities
	 * movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SecuritiesAccount
	 * InvestmentAccount.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account which contains a securities account to make securities movements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account which contains a securities account to make securities movements.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the process which moves securities out of an account to another
	 * one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Account
	 * SecuritiesTransfer.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which moves securities out of an account to another one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Specifies the process which moves securities out of an account to another one.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role which uses a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#SecuritiesAccount
	 * SecuritiesPartyRole.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role which uses a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a securities account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security which is held on the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesAccount
	 * Security.SecuritiesAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification9#FinancialInstrumentDetails
	 * SubAccountIdentification9.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification14#FinancialInstrumentDetails
	 * SubAccountIdentification14.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification15#FinancialInstrumentDetails
	 * SubAccountIdentification15.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification18#FinancialInstrumentDetails
	 * SubAccountIdentification18.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification21#FinancialInstrumentDetails
	 * SubAccountIdentification21.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification24#FinancialInstrumentDetails
	 * SubAccountIdentification24.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification30#FinancialInstrumentDetails
	 * SubAccountIdentification30.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification33#FinancialInstrumentDetails
	 * SubAccountIdentification33.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification34#FinancialInstrumentDetails
	 * SubAccountIdentification34.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification35#FinancialInstrumentDetails
	 * SubAccountIdentification35.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification44#FinancialInstrumentDetails
	 * SubAccountIdentification44.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification47#FinancialInstrumentDetails
	 * SubAccountIdentification47.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification49#FinancialInstrumentDetails
	 * SubAccountIdentification49.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification50#FinancialInstrumentDetails
	 * SubAccountIdentification50.FinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is held on the securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubAccountIdentification9.FinancialInstrumentDetails, com.tools20022.repository.msg.SubAccountIdentification14.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubAccountIdentification15.FinancialInstrumentDetails, com.tools20022.repository.msg.SubAccountIdentification18.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubAccountIdentification21.FinancialInstrumentDetails, com.tools20022.repository.msg.SubAccountIdentification24.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubAccountIdentification30.FinancialInstrumentDetails, com.tools20022.repository.msg.SubAccountIdentification33.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubAccountIdentification34.FinancialInstrumentDetails, com.tools20022.repository.msg.SubAccountIdentification35.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubAccountIdentification44.FinancialInstrumentDetails, com.tools20022.repository.msg.SubAccountIdentification47.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubAccountIdentification49.FinancialInstrumentDetails, com.tools20022.repository.msg.SubAccountIdentification50.FinancialInstrumentDetails);
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is held on the securities account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies where the financial instruments are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole#RegistrarAccount
	 * RegistrarRole.RegistrarAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegistrarRole
	 * RegistrarRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the financial instruments are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedRegistrar = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrar";
			definition = "Specifies where the financial instruments are registered.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> RegistrarRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegistrarRole.RegistrarAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location where the financial instruments are safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#RelatedSecuritiesAccount
	 * SafekeepingPlace.RelatedSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification9#SafekeepingPlace
	 * AccountIdentification9.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification14#SafekeepingPlace
	 * AccountIdentification14.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification15#SafekeepingPlace
	 * AccountIdentification15.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification21#SafekeepingPlace
	 * AccountIdentification21.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification8#SafekeepingPlace
	 * AccountIdentification8.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification17#SafekeepingPlace
	 * AccountIdentification17.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification19#SafekeepingPlace
	 * AccountIdentification19.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification6#SafekeepingPlace
	 * AccountIdentification6.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification12#SafekeepingPlace
	 * AccountIdentification12.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification16#SafekeepingPlace
	 * AccountIdentification16.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification22#SafekeepingPlace
	 * AccountIdentification22.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification23#SafekeepingPlace
	 * AccountIdentification23.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification24#SafekeepingPlace
	 * AccountIdentification24.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification7#SafekeepingPlace
	 * AccountIdentification7.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification13#SafekeepingPlace
	 * AccountIdentification13.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification18#SafekeepingPlace
	 * AccountIdentification18.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification20#SafekeepingPlace
	 * AccountIdentification20.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification11#SafekeepingPlace
	 * AccountIdentification11.SafekeepingPlace}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#SafekeepingPlace
	 * TradeLeg8.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#SafekeepingPlace
	 * SettlementObligation7.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#SafekeepingPlace
	 * TradeLeg10.SafekeepingPlace}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#SafekeepingPlace
	 * TradeLeg9.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#SafekeepingPlace
	 * SettlementObligation8.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31#SafekeepingPlace
	 * AccountIdentification31.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#SafekeepingPlace
	 * AccountIdentification32.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification34#SafekeepingPlace
	 * AccountIdentification34.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification37#SafekeepingPlace
	 * AccountIdentification37.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification39#SafekeepingPlace
	 * AccountIdentification39.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification42#SafekeepingPlace
	 * AccountIdentification42.SafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location where the financial instruments are safekept."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountIdentification9.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification14.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification15.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification21.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification8.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification17.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification19.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification6.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification12.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification16.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification22.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification23.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification24.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification7.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification13.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification18.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification20.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification11.SafekeepingPlace, com.tools20022.repository.msg.TradeLeg8.SafekeepingPlace, com.tools20022.repository.msg.SettlementObligation7.SafekeepingPlace,
					com.tools20022.repository.msg.TradeLeg10.SafekeepingPlace, com.tools20022.repository.msg.TradeLeg9.SafekeepingPlace, com.tools20022.repository.msg.SettlementObligation8.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification31.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification32.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification34.SafekeepingPlace,
					com.tools20022.repository.msg.AccountIdentification37.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification39.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification42.SafekeepingPlace);
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are safekept.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value of financial assets held by a person or an organisation. It is
	 * derived from the association between Account and Balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesAccount
	 * SecuritiesBalance.SecuritiesAccount}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance2#Balance
	 * AccountAndBalance2.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance5#Balance
	 * AccountAndBalance5.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance10#Balance
	 * AccountAndBalance10.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance12#Balance
	 * AccountAndBalance12.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance17#Balance
	 * AccountAndBalance17.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance20#Balance
	 * AccountAndBalance20.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance3#Balance
	 * AccountAndBalance3.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance6#Balance
	 * AccountAndBalance6.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance11#Balance
	 * AccountAndBalance11.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance13#Balance
	 * AccountAndBalance13.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance16#Balance
	 * AccountAndBalance16.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance19#Balance
	 * AccountAndBalance19.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance22#Balance
	 * AccountAndBalance22.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance23#Balance
	 * AccountAndBalance23.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance1#Balance
	 * AccountAndBalance1.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance7#Balance
	 * AccountAndBalance7.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance9#Balance
	 * AccountAndBalance9.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance14#Balance
	 * AccountAndBalance14.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance15#Balance
	 * AccountAndBalance15.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance18#Balance
	 * AccountAndBalance18.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance21#Balance
	 * AccountAndBalance21.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance24#Balance
	 * AccountAndBalance24.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance4#ConfirmedBalance
	 * AccountAndBalance4.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8#ConfirmedBalance
	 * AccountAndBalance8.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification29#BalanceForSubAccount
	 * SubAccountIdentification29.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification31#BalanceForSubAccount
	 * SubAccountIdentification31.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification28#BalanceForSubAccount
	 * SubAccountIdentification28.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification32#BalanceForSubAccount
	 * SubAccountIdentification32.BalanceForSubAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition2#Position
	 * SecurityPosition2.Position}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition1#Position
	 * SecurityPosition1.Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3#InstructedBalance
	 * SafekeepingAccount3.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#InstructedBalance
	 * SafekeepingAccount4.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification7#ConfirmedBalance
	 * AccountIdentification7.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification13#ConfirmedBalance
	 * AccountIdentification13.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification18#ConfirmedBalance
	 * AccountIdentification18.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification20#ConfirmedBalance
	 * AccountIdentification20.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance26#Balance
	 * AccountAndBalance26.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance25#Balance
	 * AccountAndBalance25.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance32#Balance
	 * AccountAndBalance32.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance29#Balance
	 * AccountAndBalance29.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification38#BalanceForSubAccount
	 * SubAccountIdentification38.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification37#BalanceForSubAccount
	 * SubAccountIdentification37.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#InstructedBalance
	 * SafekeepingAccount6.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification40#BalanceForSubAccount
	 * SubAccountIdentification40.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification39#BalanceForSubAccount
	 * SubAccountIdentification39.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42#BalanceForSubAccount
	 * SubAccountIdentification42.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#BalanceForSubAccount
	 * SubAccountIdentification43.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#Balance
	 * AccountAndBalance34.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#Balance
	 * AccountAndBalance35.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance36#ConfirmedBalance
	 * AccountAndBalance36.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#Balance
	 * AccountAndBalance33.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#ConfirmedBalance
	 * AccountIdentification32.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance40#ConfirmedBalance
	 * AccountAndBalance40.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38#Balance
	 * AccountAndBalance38.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance37#Balance
	 * AccountAndBalance37.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification37#ConfirmedBalance
	 * AccountIdentification37.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance39#Balance
	 * AccountAndBalance39.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification45#BalanceForSubAccount
	 * SubAccountIdentification45.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification46#BalanceForSubAccount
	 * SubAccountIdentification46.BalanceForSubAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountAndBalance2.Balance, com.tools20022.repository.msg.AccountAndBalance5.Balance, com.tools20022.repository.msg.AccountAndBalance10.Balance,
					com.tools20022.repository.msg.AccountAndBalance12.Balance, com.tools20022.repository.msg.AccountAndBalance17.Balance, com.tools20022.repository.msg.AccountAndBalance20.Balance,
					com.tools20022.repository.msg.AccountAndBalance3.Balance, com.tools20022.repository.msg.AccountAndBalance6.Balance, com.tools20022.repository.msg.AccountAndBalance11.Balance,
					com.tools20022.repository.msg.AccountAndBalance13.Balance, com.tools20022.repository.msg.AccountAndBalance16.Balance, com.tools20022.repository.msg.AccountAndBalance19.Balance,
					com.tools20022.repository.msg.AccountAndBalance22.Balance, com.tools20022.repository.msg.AccountAndBalance23.Balance, com.tools20022.repository.msg.AccountAndBalance1.Balance,
					com.tools20022.repository.msg.AccountAndBalance7.Balance, com.tools20022.repository.msg.AccountAndBalance9.Balance, com.tools20022.repository.msg.AccountAndBalance14.Balance,
					com.tools20022.repository.msg.AccountAndBalance15.Balance, com.tools20022.repository.msg.AccountAndBalance18.Balance, com.tools20022.repository.msg.AccountAndBalance21.Balance,
					com.tools20022.repository.msg.AccountAndBalance24.Balance, com.tools20022.repository.msg.AccountAndBalance4.ConfirmedBalance, com.tools20022.repository.msg.AccountAndBalance8.ConfirmedBalance,
					com.tools20022.repository.msg.SubAccountIdentification29.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification31.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification28.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification32.BalanceForSubAccount, com.tools20022.repository.msg.SecurityPosition2.Position,
					com.tools20022.repository.msg.SecurityPosition1.Position, com.tools20022.repository.msg.SafekeepingAccount3.InstructedBalance, com.tools20022.repository.msg.SafekeepingAccount4.InstructedBalance,
					com.tools20022.repository.msg.AccountIdentification7.ConfirmedBalance, com.tools20022.repository.msg.AccountIdentification13.ConfirmedBalance, com.tools20022.repository.msg.AccountIdentification18.ConfirmedBalance,
					com.tools20022.repository.msg.AccountIdentification20.ConfirmedBalance, com.tools20022.repository.msg.AccountAndBalance26.Balance, com.tools20022.repository.msg.AccountAndBalance25.Balance,
					com.tools20022.repository.msg.AccountAndBalance32.Balance, com.tools20022.repository.msg.AccountAndBalance29.Balance, com.tools20022.repository.msg.SubAccountIdentification38.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification37.BalanceForSubAccount, com.tools20022.repository.msg.SafekeepingAccount6.InstructedBalance,
					com.tools20022.repository.msg.SubAccountIdentification40.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification39.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification42.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification43.BalanceForSubAccount, com.tools20022.repository.msg.AccountAndBalance34.Balance,
					com.tools20022.repository.msg.AccountAndBalance35.Balance, com.tools20022.repository.msg.AccountAndBalance36.ConfirmedBalance, com.tools20022.repository.msg.AccountAndBalance33.Balance,
					com.tools20022.repository.msg.AccountIdentification32.ConfirmedBalance, com.tools20022.repository.msg.AccountAndBalance40.ConfirmedBalance, com.tools20022.repository.msg.AccountAndBalance38.Balance,
					com.tools20022.repository.msg.AccountAndBalance37.Balance, com.tools20022.repository.msg.AccountIdentification37.ConfirmedBalance, com.tools20022.repository.msg.AccountAndBalance39.Balance,
					com.tools20022.repository.msg.SubAccountIdentification45.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification46.BalanceForSubAccount);
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Actions taken in relation with the securities account in the context of
	 * the corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#SecuritiesAccount
	 * CorporateActionServicing.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actions taken in relation with the securities account in the context of the corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionServicing";
			definition = "Actions taken in relation with the securities account in the context of the corporate action.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation process for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#AllocationAccount
	 * Allocation.AllocationAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAllocation";
			definition = "Allocation process for which an account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocationAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record of the movements into or out of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesAccount
	 * SecuritiesEntry.SecuritiesAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of the movements into or out of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a clearing account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingAccount
	 * ClearingMemberRole.ClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a clearing account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Clearing member which holds a clearing account at a CCP.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a margin account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#MarginAccount
	 * ClearingMemberRole.MarginAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a margin account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarginAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAccountOwner";
			definition = "Clearing member which holds a margin account at a CCP.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.MarginAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a delivery account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DeliveryAccount
	 * ClearingMemberRole.DeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a delivery account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DeliveryAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccountOwner";
			definition = "Clearing member which holds a delivery account at a CCP.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Power of attorney related to the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedAccount
	 * PowerOfAttorney.AuthorisedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney related to the securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPowerOfAttorney";
			definition = "Power of attorney related to the securities account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PowerOfAttorney.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Meeting instruction which specifies an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#SafekeepingAccount
	 * InstructionForMeeting.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting instruction which specifies an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Meeting instruction which specifies an account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InstructionForMeeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the clearing account type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#ClearingAccountType
	 * SettlementObligation4.ClearingAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#ClearingAccountType
	 * SettlementObligation8.ClearingAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the clearing account type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementObligation4.ClearingAccountType, com.tools20022.repository.msg.SettlementObligation8.ClearingAccountType);
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountType";
			definition = "Specifies the clearing account type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingAccountTypeCode.mmObject();
		}
	};
	/**
	 * Order process for which an ordering account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderingAccount
	 * SecuritiesOrder.OrderingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order process for which an ordering account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order process for which an ordering account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Disclosed list trading process for which a trading account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#DisclosedListTradingAccount
	 * DisclosedListTrading.DisclosedListTradingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisclosedListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disclosed list trading process for which a trading account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DisclosedListTrading = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTrading";
			definition = "Disclosed list trading process for which a trading account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the link between a cash account and a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#SecuritiesAccount
	 * AccountLink.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the link between a cash account and a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountLink = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount";
				definition = "Account to or from which a securities entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesTransfer.Account, com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.MarginAccount,
						com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount, com.tools20022.repository.entity.SecuritiesPartyRole.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesEntry.SecuritiesAccount,
						com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount, com.tools20022.repository.entity.RegistrarRole.RegistrarAccount,
						com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount, com.tools20022.repository.entity.Allocation.AllocationAccount,
						com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount, com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount, com.tools20022.repository.entity.AccountLink.SecuritiesAccount,
						com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndAccount16.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount44.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount1.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount42.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount19.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount21.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount40.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount41.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount81.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount30.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount43.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount68.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount75.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount63.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount88.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount66.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount33.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification9.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification14.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification15.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification21.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance2.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance5.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance10.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance12.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance17.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance20.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification8.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification17.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification19.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification6.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification12.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification16.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification22.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification23.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification24.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification25.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification29.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance3.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount14.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance6.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount22.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance11.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount51.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance13.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount56.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance16.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance19.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance22.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance23.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance1.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification7Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance7.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification8Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance9.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification12Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance14.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification15Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance15.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification18Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance18.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification19Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance21.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification21Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance24.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification22Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance4.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance8.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification10.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification13.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification16.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification20.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification23.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification26.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification29.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification31.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification11.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification12.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification17.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification19.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification22.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification25.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification28.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification32.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount6.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount11.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount26.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount28.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount30.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount18.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount35.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount36.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount37.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount19.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount49.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount61.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount62.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount1.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount5.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount17.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount24.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount25.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount34.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount25.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount2.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount12.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount15.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount20.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount65.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount67.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount28.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount37.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification9.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification14.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification15.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification18.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification21.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification24.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification30.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification33.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount9.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount79.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount83.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount77.SafekeepingAccount,
						com.tools20022.repository.msg.ConfirmationPartyDetails4.SafekeepingAccount, com.tools20022.repository.msg.Intermediary14.SafekeepingDetails,
						com.tools20022.repository.msg.ConfirmationPartyDetails3.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount10.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount8.SafekeepingAccount, com.tools20022.repository.msg.ConfirmationPartyDetails6.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount34.SafekeepingAccount, com.tools20022.repository.msg.SecurityMovement1.AccountDetails, com.tools20022.repository.msg.SecuritiesProceeds1.AccountDetails,
						com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.AccountDetails, com.tools20022.repository.msg.CorporateActionStandingInstruction1.SecuritiesDistributionDetails,
						com.tools20022.repository.msg.QuantityAndAccount7.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount16.SafekeepingAccount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount3.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount13.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount45.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount46.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount47.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification7.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification13.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification18.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification20.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount10.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount21.SafekeepingAccount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.SafekeepingAccount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount4.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount22.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount27.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount36.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount71.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount73.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount74.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount76.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesAccount21.SubAccount, com.tools20022.repository.msg.MarginReport1.MarginAccount,
						com.tools20022.repository.msg.MarginReport2.MarginAccount, com.tools20022.repository.msg.AccountIdentification11.SafekeepingAccount, com.tools20022.repository.choice.SecuritiesAccount1Choice.Account,
						com.tools20022.repository.msg.SubAccountIdentification27.SafekeepingAccount, com.tools20022.repository.msg.SubaccountIdentification7.SafekeepingAccount,
						com.tools20022.repository.msg.SubaccountIdentification8.SafekeepingAccount, com.tools20022.repository.choice.AccountIdentification20Choice.SecuritiesAccountIdentification,
						com.tools20022.repository.msg.SubAccountIdentification34.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification23Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountAndBalance26.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance25.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount95.AccountIdentification,
						com.tools20022.repository.msg.AccountAndBalance32.SafekeepingAccount, com.tools20022.repository.choice.AccountIdentification26Choice.AccountsListAndBalanceDetails,
						com.tools20022.repository.msg.AccountAndBalance29.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification35.SafekeepingAccount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.SafekeepingAccount, com.tools20022.repository.msg.SafekeepingAccount5.AccountIdentification,
						com.tools20022.repository.msg.SafekeepingAccount5.AccountSubLevel1, com.tools20022.repository.msg.AccountSubLevel1.AccountSubLevel2, com.tools20022.repository.msg.AccountSubLevel4.AccountSubLevel5,
						com.tools20022.repository.msg.AccountSubLevel5.AccountSubLevel6, com.tools20022.repository.msg.AccountSubLevel2.AccountSubLevel3, com.tools20022.repository.msg.AccountSubLevel3.AccountSubLevel4,
						com.tools20022.repository.msg.AccountSubLevel6.AccountSubLevel7, com.tools20022.repository.msg.AccountSubLevel7.AccountSubLevel8, com.tools20022.repository.msg.AccountSubLevel8.AccountSubLevel9,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification38.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification37.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount100.SafekeepingAccount,
						com.tools20022.repository.msg.ReportItem1.AccountIdentification, com.tools20022.repository.msg.SubAccountIdentification40.SafekeepingAccount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification39.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount39.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification42.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount41.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification44.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount40.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount42.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount38.SafekeepingAccount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification43.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount106.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount43.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount117.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount108.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount107.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance34.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance35.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance36.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification33.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification32Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountIdentification31.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount122.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance33.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification32.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount127.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance40.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance38.SafekeepingAccount,
						com.tools20022.repository.choice.AccountIdentification36Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountIdentification35.SafekeepingAccount,
						com.tools20022.repository.msg.AccountAndBalance37.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification34.SafekeepingAccount,
						com.tools20022.repository.msg.AccountIdentification37.SafekeepingAccount, com.tools20022.repository.msg.AccountAndBalance39.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount128.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification47.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount47.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification45.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount48.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount46.SafekeepingAccount, com.tools20022.repository.msg.SubAccountIdentification46.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount51.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount49.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount131.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount146.SafekeepingAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount135.SafekeepingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount136.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount55.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification39.SafekeepingAccount,
						com.tools20022.repository.msg.SafekeepingAccount7.AccountIdentification, com.tools20022.repository.msg.SafekeepingAccount7.AccountSubLevel1, com.tools20022.repository.msg.AccountSubLevel15.AccountSubLevel6,
						com.tools20022.repository.msg.AccountSubLevel16.AccountSubLevel7, com.tools20022.repository.msg.AccountSubLevel18.AccountSubLevel9, com.tools20022.repository.msg.AccountSubLevel11.AccountSubLevel2,
						com.tools20022.repository.msg.AccountSubLevel12.AccountSubLevel3, com.tools20022.repository.msg.AccountSubLevel17.AccountSubLevel8, com.tools20022.repository.msg.AccountSubLevel13.AccountSubLevel4,
						com.tools20022.repository.msg.AccountSubLevel14.AccountSubLevel5, com.tools20022.repository.msg.AccountIdentification40.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification49.SafekeepingAccount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.SafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification50.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification41.SafekeepingAccount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount57.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount58.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount56.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount61.SafekeepingAccount,
						com.tools20022.repository.msg.QuantityAndAccount62.SafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount60.SafekeepingAccount, com.tools20022.repository.msg.AccountIdentification42.SafekeepingAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.SecuritiesAccountType, com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesPartyRole, com.tools20022.repository.entity.SecuritiesAccount.Security,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedRegistrar, com.tools20022.repository.entity.SecuritiesAccount.SafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesAccount.CorporateActionServicing, com.tools20022.repository.entity.SecuritiesAccount.RelatedAllocation, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.MarginAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.DeliveryAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.RelatedPowerOfAttorney,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedMeetingInstruction, com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountType, com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesAccount.DisclosedListTrading, com.tools20022.repository.entity.SecuritiesAccount.AccountLink);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesAccount1.mmObject(), SecuritiesAccount4.mmObject(), SecuritiesAccount13.mmObject(), SecuritiesAccount17.mmObject(), AccountAndBalance2.mmObject(),
						AccountAndBalance5.mmObject(), AccountAndBalance10.mmObject(), AccountAndBalance12.mmObject(), AccountAndBalance17.mmObject(), AccountAndBalance20.mmObject(), AccountAndBalance3.mmObject(),
						AccountAndBalance6.mmObject(), AccountAndBalance11.mmObject(), AccountAndBalance13.mmObject(), AccountAndBalance16.mmObject(), AccountAndBalance19.mmObject(), AccountAndBalance22.mmObject(),
						AccountAndBalance23.mmObject(), AccountAndBalance1.mmObject(), AccountAndBalance7.mmObject(), AccountAndBalance9.mmObject(), AccountAndBalance14.mmObject(), AccountAndBalance15.mmObject(),
						AccountAndBalance18.mmObject(), AccountAndBalance21.mmObject(), AccountAndBalance24.mmObject(), AccountAndBalance4.mmObject(), AccountAndBalance8.mmObject(), PurposeCode1Choice.mmObject(),
						SecuritiesAccount11.mmObject(), SecuritiesAccount2.mmObject(), PurposeCode2Choice.mmObject(), SecuritiesAccount14.mmObject(), PurposeCode3Choice.mmObject(), SecuritiesAccount15.mmObject(),
						PurposeCode4Choice.mmObject(), SecuritiesAccount16.mmObject(), SafekeepingAccount1.mmObject(), SafekeepingAccount2.mmObject(), SubAccountIdentification29.mmObject(), SubAccountIdentification31.mmObject(),
						SubAccountIdentification28.mmObject(), SubAccountIdentification32.mmObject(), SubAccountIdentification30.mmObject(), SubAccountIdentification33.mmObject(), SecuritiesAccount20.mmObject(),
						PurposeCode5Choice.mmObject(), SecuritiesAccount3.mmObject(), SafekeepingAccount3.mmObject(), SafekeepingAccount4.mmObject(), SecuritiesAccount7.mmObject(), SecuritiesAccount9.mmObject(),
						SecuritiesAccount12.mmObject(), SecuritiesAccount8.mmObject(), SecuritiesAccount10.mmObject(), IncludedAccount1.mmObject(), SecuritiesAccount6.mmObject(), SecuritiesAccount21.mmObject(),
						SecuritiesAccount19.mmObject(), SecuritiesAccount18.mmObject(), SecuritiesAccount5.mmObject(), SecuritiesAccount1Choice.mmObject(), SubAccountIdentification34.mmObject(), AccountAndBalance26.mmObject(),
						AccountAndBalance25.mmObject(), SecuritiesAccount22.mmObject(), AccountAndBalance32.mmObject(), AccountAndBalance29.mmObject(), SubAccountIdentification35.mmObject(), SafekeepingAccount5.mmObject(),
						AccountSubLevel1.mmObject(), AccountSubLevel4.mmObject(), AccountSubLevel5.mmObject(), AccountSubLevel2.mmObject(), AccountSubLevel3.mmObject(), AccountSubLevel6.mmObject(), AccountSubLevel7.mmObject(),
						AccountSubLevel8.mmObject(), AccountSubLevel9.mmObject(), SubAccountIdentification38.mmObject(), SubAccountIdentification37.mmObject(), SafekeepingAccount6.mmObject(), SubAccountIdentification40.mmObject(),
						SubAccountIdentification39.mmObject(), SecuritiesAccount24.mmObject(), SubAccountIdentification42.mmObject(), SubAccountIdentification44.mmObject(), SubAccountIdentification43.mmObject(),
						SecuritiesAccount26.mmObject(), SecuritiesAccount25.mmObject(), PurposeCode7Choice.mmObject(), AccountAndBalance34.mmObject(), AccountAndBalance35.mmObject(), AccountAndBalance36.mmObject(),
						AccountAndBalance33.mmObject(), AccountAndBalance40.mmObject(), AccountAndBalance38.mmObject(), AccountAndBalance37.mmObject(), AccountAndBalance39.mmObject(), SubAccountIdentification47.mmObject(),
						SecuritiesAccount33.mmObject(), SubAccountIdentification45.mmObject(), SubAccountIdentification46.mmObject(), SecuritiesAccount27.mmObject(), PurposeCode8Choice.mmObject(), SecuritiesAccount30.mmObject(),
						SecuritiesAccount34.mmObject(), SafekeepingAccount7.mmObject(), AccountSubLevel15.mmObject(), AccountSubLevel16.mmObject(), AccountSubLevel18.mmObject(), AccountSubLevel19.mmObject(), AccountSubLevel11.mmObject(),
						AccountSubLevel12.mmObject(), AccountSubLevel17.mmObject(), AccountSubLevel13.mmObject(), AccountSubLevel14.mmObject(), SubAccountIdentification49.mmObject(), SubAccountIdentification50.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}