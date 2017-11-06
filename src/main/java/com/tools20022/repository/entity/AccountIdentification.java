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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique identifier of an account, as assigned by the account servicer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountIdentification"
 * src="doc-files/AccountIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
 * AccountIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmIBAN
 * AccountIdentification.mmIBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmBBAN
 * AccountIdentification.mmBBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmUPIC
 * AccountIdentification.mmUPIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
 * AccountIdentification.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
 * AccountIdentification.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmCostReferencePattern
 * AccountIdentification.mmCostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmNumber
 * AccountIdentification.mmNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
 * GenericIdentification.mmIdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmIdentification
 * Account.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose#mmIdentification
 * AccountIdentificationAndPurpose.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification3#mmIdentification
 * AccountIdentification3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmSimpleIdentification
 * AccountIdentificationFormatChoice.mmSimpleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmIdentificationAndPurpose
 * AccountIdentificationFormatChoice.mmIdentificationAndPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#mmIdentificationAsDSS
 * AccountIdentificationFormatChoice.mmIdentificationAsDSS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName3#mmIdentification
 * AccountIdentificationAndName3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationDetails#mmIdentification
 * AccountIdentificationDetails.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification10#mmIdentificationCode
 * AccountIdentification10.mmIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification6Choice#mmForAllAccounts
 * AccountIdentification6Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification6Choice#mmAccountsList
 * AccountIdentification6Choice.mmAccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification11Choice#mmForAllAccounts
 * AccountIdentification11Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification11Choice#mmAccountsList
 * AccountIdentification11Choice.mmAccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#mmForAllAccounts
 * AccountIdentification13Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#mmAccountsList
 * AccountIdentification13Choice.mmAccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification17Choice#mmForAllAccounts
 * AccountIdentification17Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification17Choice#mmAccountsList
 * AccountIdentification17Choice.mmAccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification7Choice#mmForAllAccounts
 * AccountIdentification7Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification8Choice#mmForAllAccounts
 * AccountIdentification8Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice#mmForAllAccounts
 * AccountIdentification12Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification15Choice#mmForAllAccounts
 * AccountIdentification15Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification18Choice#mmForAllAccounts
 * AccountIdentification18Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification19Choice#mmForAllAccounts
 * AccountIdentification19Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification21Choice#mmForAllAccounts
 * AccountIdentification21Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification22Choice#mmForAllAccounts
 * AccountIdentification22Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification2#mmIdentification
 * SubAccountIdentification2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#mmIdentification
 * SubAccountIdentification3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1#mmIdentification
 * SubAccountIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#mmIdentification
 * SubAccountIdentification5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification4#mmIdentification
 * SubAccountIdentification4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6#mmIdentification
 * SubAccountIdentification6.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName2#mmIdentification
 * AccountIdentificationAndName2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice#mmIdentification
 * AccountIdentificationOrNameChoice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice#mmNameAndIdentification
 * AccountIdentificationOrNameChoice.mmNameAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification9Choice#mmForAllAccounts
 * AccountIdentification9Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification9Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification9Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification10Choice#mmForAllAccounts
 * AccountIdentification10Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification10Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification10Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification14Choice#mmForAllAccounts
 * AccountIdentification14Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification14Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification14Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification16Choice#mmForAllAccounts
 * AccountIdentification16Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification16Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification16Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName#mmAccountIdentification
 * AccountIdentificationAndName.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName4#mmIdentification
 * AccountIdentificationAndName4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice#mmCashAccountIdentification
 * AccountIdentification20Choice.mmCashAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification23Choice#mmForAllAccounts
 * AccountIdentification23Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification26Choice#mmForAllAccounts
 * AccountIdentification26Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#mmIdentification
 * SubAccountIdentification36.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmCard
 * AccountIdentification30Choice.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmMSISDN
 * AccountIdentification30Choice.mmMSISDN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmEMail
 * AccountIdentification30Choice.mmEMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmDomestic
 * AccountIdentification30Choice.mmDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice#mmForAllAccounts
 * AccountIdentification33Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification33Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmForAllAccounts
 * AccountIdentification29Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#mmAccountsList
 * AccountIdentification29Choice.mmAccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice#mmForAllAccounts
 * AccountIdentification32Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5#mmIdentification
 * AccountIdentificationAndName5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification34Choice#mmForAllAccounts
 * AccountIdentification34Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification34Choice#mmAccountsList
 * AccountIdentification34Choice.mmAccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification36Choice#mmForAllAccounts
 * AccountIdentification36Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification37Choice#mmForAllAccounts
 * AccountIdentification37Choice.mmForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification37Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification37Choice.mmAccountsListAndBalanceDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice
 * AccountIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice
 * AccountIdentification5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification1
 * AccountIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose
 * AccountIdentificationAndPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification3
 * AccountIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
 * AccountIdentificationFormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice
 * CashAccountIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentificationAndName3
 * AccountIdentificationAndName3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice
 * AccountIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericAccountIdentification1
 * GenericAccountIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
 * AccountIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentificationDetails
 * AccountIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
 * CashAccountIdentification5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice
 * CashAccountIdentification2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
 * CashAccountIdentification6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification10
 * AccountIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification9
 * AccountIdentification9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification6Choice
 * AccountIdentification6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification14
 * AccountIdentification14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification11Choice
 * AccountIdentification11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification15
 * AccountIdentification15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice
 * AccountIdentification13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification21
 * AccountIdentification21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification17Choice
 * AccountIdentification17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification8
 * AccountIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification17
 * AccountIdentification17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification19
 * AccountIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification6
 * AccountIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification12
 * AccountIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification16
 * AccountIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification22
 * AccountIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification23
 * AccountIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification24
 * AccountIdentification24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification25
 * AccountIdentification25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification29
 * AccountIdentification29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification7Choice
 * AccountIdentification7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification8Choice
 * AccountIdentification8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice
 * AccountIdentification12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification15Choice
 * AccountIdentification15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification18Choice
 * AccountIdentification18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification19Choice
 * AccountIdentification19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification21Choice
 * AccountIdentification21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification22Choice
 * AccountIdentification22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification10
 * SubAccountIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification26
 * AccountIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification4
 * AccountIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification13
 * SubAccountIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification2
 * SubAccountIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification3
 * SubAccountIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification16
 * SubAccountIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification20
 * SubAccountIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification23
 * SubAccountIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification26
 * SubAccountIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification11
 * SubAccountIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification12
 * SubAccountIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification1
 * SubAccountIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification5
 * SubAccountIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification17
 * SubAccountIdentification17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification19
 * SubAccountIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification22
 * SubAccountIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification25
 * SubAccountIdentification25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification9
 * SubAccountIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification14
 * SubAccountIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification15
 * SubAccountIdentification15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification18
 * SubAccountIdentification18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification21
 * SubAccountIdentification21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification24
 * SubAccountIdentification24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification4
 * SubAccountIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification6
 * SubAccountIdentification6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice
 * AccountIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentificationAndName2
 * AccountIdentificationAndName2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice
 * AccountIdentificationOrNameChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification7
 * AccountIdentification7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification9Choice
 * AccountIdentification9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification13
 * AccountIdentification13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification10Choice
 * AccountIdentification10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification18
 * AccountIdentification18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification14Choice
 * AccountIdentification14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification20
 * AccountIdentification20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification16Choice
 * AccountIdentification16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentificationAndName
 * AccountIdentificationAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification5
 * AccountIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification2
 * AccountIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountIdentification1
 * CashAccountIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentificationAndName4
 * AccountIdentificationAndName4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification11
 * AccountIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification27
 * SubAccountIdentification27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubaccountIdentification7
 * SubaccountIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubaccountIdentification8
 * SubaccountIdentification8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice
 * AccountIdentification20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification23Choice
 * AccountIdentification23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification26Choice
 * AccountIdentification26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification36
 * SubAccountIdentification36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
 * AccountIdentification30Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice
 * AccountIdentification31Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice
 * AccountIdentification33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice
 * AccountIdentification29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification33
 * AccountIdentification33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice
 * AccountIdentification32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification31
 * AccountIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification32
 * AccountIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
 * AccountIdentificationAndName5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification34Choice
 * AccountIdentification34Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification36Choice
 * AccountIdentification36Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification37Choice
 * AccountIdentification37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification35
 * AccountIdentification35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification34
 * AccountIdentification34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification37
 * AccountIdentification37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification39
 * AccountIdentification39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification40
 * AccountIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification41
 * AccountIdentification41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountIdentification42
 * AccountIdentification42}</li>
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
 * "AccountIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique identifier of an account, as assigned by the account servicer."</li>
 * </ul>
 */
public class AccountIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Account account;
	/**
	 * Account for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected IBAN2007Identifier iBAN;
	/**
	 * International Bank Account Number (IBAN) - identifier used
	 * internationally by financial institutions to uniquely identify the
	 * account of a customer. Further specifications of the format and content
	 * of the IBAN can be found in the standard ISO 13616
	 * "Banking and related financial services - International Bank Account Number (IBAN)"
	 * version 1997-10-01, or later revisions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IBAN2007Identifier
	 * IBAN2007Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#mmIBAN
	 * AccountIdentification1Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmIBAN
	 * AccountIdentification5Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmIBAN
	 * CashAccountIdentification1Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmIBAN
	 * AccountIdentification3Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#mmIBAN
	 * AccountIdentification4Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#mmOther
	 * AccountIdentification4Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice#mmIBAN
	 * CashAccountIdentification5Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice#mmIBAN
	 * CashAccountIdentification2Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice#mmIBAN
	 * CashAccountIdentification6Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification2#mmIBAN
	 * AccountIdentification2.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmIBAN
	 * AccountIdentification30Choice.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#mmIBAN
	 * AccountIdentification31Choice.mmIBAN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIBAN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.mmIBAN, com.tools20022.repository.choice.AccountIdentification5Choice.mmIBAN,
					com.tools20022.repository.choice.CashAccountIdentification1Choice.mmIBAN, com.tools20022.repository.choice.AccountIdentification3Choice.mmIBAN, com.tools20022.repository.choice.AccountIdentification4Choice.mmIBAN,
					com.tools20022.repository.choice.AccountIdentification4Choice.mmOther, com.tools20022.repository.choice.CashAccountIdentification5Choice.mmIBAN, com.tools20022.repository.choice.CashAccountIdentification2Choice.mmIBAN,
					com.tools20022.repository.choice.CashAccountIdentification6Choice.mmIBAN, com.tools20022.repository.msg.AccountIdentification2.mmIBAN, com.tools20022.repository.choice.AccountIdentification30Choice.mmIBAN,
					com.tools20022.repository.choice.AccountIdentification31Choice.mmIBAN);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IBAN2007Identifier.mmObject();
		}
	};
	protected BBANIdentifier bBAN;
	/**
	 * Basic Bank Account Number (BBAN) - identifier used nationally by
	 * financial institutions, ie, in individual countries, generally as part of
	 * a National Account Numbering Scheme(s), to uniquely identify the account
	 * of a customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BBANIdentifier
	 * BBANIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#mmBBAN
	 * AccountIdentification1Choice.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmBBAN
	 * AccountIdentification5Choice.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmBBAN
	 * CashAccountIdentification1Choice.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmBBAN
	 * AccountIdentification3Choice.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmBBAN
	 * AccountIdentification30Choice.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#mmBBAN
	 * AccountIdentification31Choice.mmBBAN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBBAN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.mmBBAN, com.tools20022.repository.choice.AccountIdentification5Choice.mmBBAN,
					com.tools20022.repository.choice.CashAccountIdentification1Choice.mmBBAN, com.tools20022.repository.choice.AccountIdentification3Choice.mmBBAN, com.tools20022.repository.choice.AccountIdentification30Choice.mmBBAN,
					com.tools20022.repository.choice.AccountIdentification31Choice.mmBBAN);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BBAN";
			definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BBANIdentifier.mmObject();
		}
	};
	protected UPICIdentifier uPIC;
	/**
	 * Universal Payment Identification Code (UPIC) - identifier used by the New
	 * York Clearing House to mask confidential data, such as bank accounts and
	 * bank routing numbers. UPIC numbers remain with business customers,
	 * regardless of banking relationship changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UPICIdentifier
	 * UPICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#mmUPIC
	 * AccountIdentification1Choice.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmUPIC
	 * CashAccountIdentification1Choice.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmUPIC
	 * AccountIdentification3Choice.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmUPIC
	 * AccountIdentification30Choice.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#mmUPIC
	 * AccountIdentification31Choice.mmUPIC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUPIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.mmUPIC, com.tools20022.repository.choice.CashAccountIdentification1Choice.mmUPIC,
					com.tools20022.repository.choice.AccountIdentification3Choice.mmUPIC, com.tools20022.repository.choice.AccountIdentification30Choice.mmUPIC, com.tools20022.repository.choice.AccountIdentification31Choice.mmUPIC);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UPIC";
			definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UPICIdentifier.mmObject();
		}
	};
	protected GenericIdentification proprietaryIdentification;
	/**
	 * Unique identifier for an account. It is assigned by the account servicer
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccount
	 * GenericIdentification.mmIdentificationForAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#mmDomesticAccount
	 * AccountIdentification1Choice.mmDomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmDomesticAccount
	 * AccountIdentification5Choice.mmDomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#mmDepositoryAccount
	 * AccountIdentification5Choice.mmDepositoryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1#mmProprietary
	 * AccountIdentification1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#mmDomesticAccount
	 * CashAccountIdentification1Choice.mmDomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#mmProprietaryAccount
	 * AccountIdentification3Choice.mmProprietaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice#mmProprietary
	 * CashAccountIdentification5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice#mmProprietary
	 * CashAccountIdentification2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice#mmProprietary
	 * CashAccountIdentification6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification26#mmProprietary
	 * AccountIdentification26.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification4#mmProprietary
	 * AccountIdentification4.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountIdentification1#mmDomesticAccount
	 * CashAccountIdentification1.mmDomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmProprietary
	 * CustomerAccount2.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmOther
	 * AccountIdentification30Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#mmDomesticAccount
	 * AccountIdentification31Choice.mmDomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountDesignation1Choice#mmProprietary
	 * AccountDesignation1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.mmDomesticAccount, com.tools20022.repository.choice.AccountIdentification5Choice.mmDomesticAccount,
					com.tools20022.repository.choice.AccountIdentification5Choice.mmDepositoryAccount, com.tools20022.repository.msg.AccountIdentification1.mmProprietary,
					com.tools20022.repository.choice.CashAccountIdentification1Choice.mmDomesticAccount, com.tools20022.repository.choice.AccountIdentification3Choice.mmProprietaryAccount,
					com.tools20022.repository.choice.CashAccountIdentification5Choice.mmProprietary, com.tools20022.repository.choice.CashAccountIdentification2Choice.mmProprietary,
					com.tools20022.repository.choice.CashAccountIdentification6Choice.mmProprietary, com.tools20022.repository.msg.AccountIdentification26.mmProprietary, com.tools20022.repository.msg.AccountIdentification4.mmProprietary,
					com.tools20022.repository.msg.CashAccountIdentification1.mmDomesticAccount, com.tools20022.repository.msg.CustomerAccount2.mmProprietary, com.tools20022.repository.choice.AccountIdentification30Choice.mmOther,
					com.tools20022.repository.choice.AccountIdentification31Choice.mmDomesticAccount, com.tools20022.repository.choice.AccountDesignation1Choice.mmProprietary);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Max70Text name;
	/**
	 * Name of the account. It provides an additional means of identification,
	 * and is designated by the account servicer in agreement with the account
	 * owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#mmName
	 * CashAccount5.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount1#mmName
	 * SecuritiesAccount1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmName
	 * InvestmentAccount17.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName3#mmName
	 * AccountIdentificationAndName3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#mmName
	 * CashAccount12.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount4#mmName
	 * SecuritiesAccount4.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmName
	 * InvestmentAccount27.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmName
	 * InvestmentAccount35.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount19#mmName
	 * InvestmentAccount19.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmName
	 * InvestmentAccount18.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmName
	 * InvestmentAccount29.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmName
	 * InvestmentAccount28.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmName
	 * InvestmentAccount36.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmName
	 * InvestmentAccount16.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmName
	 * InvestmentAccount26.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmName
	 * InvestmentAccount34.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7#mmName
	 * CashAccount7.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16#mmName
	 * CashAccount16.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#mmName
	 * CashAccount24.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmName
	 * CashAccountDetails1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmName
	 * CashAccountDetails3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails4#mmName
	 * CashAccountDetails4.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23#mmName
	 * CashAccount23.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13#mmName
	 * CashAccount13.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20#mmName
	 * CashAccount20.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#mmName
	 * CashAccount25.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmAccountName
	 * InvestmentAccount10.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmAccountName
	 * InvestmentAccount11.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmAccountName
	 * InvestmentAccount22.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1#mmName
	 * SubAccount1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmAccountName
	 * InvestmentAccount24.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#mmName
	 * SecuritiesAccount13.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount17#mmName
	 * SecuritiesAccount17.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount11#mmName
	 * SecuritiesAccount11.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount2#mmName
	 * SecuritiesAccount2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount14#mmName
	 * SecuritiesAccount14.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount15#mmName
	 * SecuritiesAccount15.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount16#mmName
	 * SecuritiesAccount16.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount1#mmName
	 * SafekeepingAccount1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmName
	 * SafekeepingAccount2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20#mmName
	 * SecuritiesAccount20.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3#mmName
	 * SecuritiesAccount3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2#mmName
	 * AccountForAction2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1#mmName
	 * CustomerAccount1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#mmName
	 * CustomerAccount5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmName
	 * CustomerAccountModification1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#mmName
	 * CustomerAccount4.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount28#mmName
	 * CashAccount28.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#mmName
	 * CashAccount27.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount13#mmAccountName
	 * InvestmentAccount13.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#mmAccountName
	 * InvestmentAccount21.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#mmAccountName
	 * InvestmentAccount14.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount12#mmName
	 * InvestmentAccount12.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount25#mmName
	 * InvestmentAccount25.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3#mmName
	 * CashAccount3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName2#mmName
	 * AccountIdentificationAndName2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice#mmName
	 * AccountIdentificationOrNameChoice.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount1#mmName
	 * CollateralAccount1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName#mmAccountName
	 * AccountIdentificationAndName.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#mmName
	 * AccountIdentification5.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmName
	 * SecuritiesAccount19.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18#mmName
	 * SecuritiesAccount18.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount5#mmName
	 * SecuritiesAccount5.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount3#mmName
	 * SubAccount3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmName
	 * CustomerAccount2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmName
	 * CustomerAccount3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmName
	 * InvestmentAccount38.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmName
	 * InvestmentAccount37.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmName
	 * InvestmentAccount39.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmAccountName
	 * InvestmentAccount40.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmAccountName
	 * InvestmentAccount41.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmName
	 * SecuritiesAccount22.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmName
	 * InvestmentAccount43.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmName
	 * InvestmentAccount44.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount45#mmAccountName
	 * InvestmentAccount45.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmName
	 * InvestmentAccount46.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmName
	 * InvestmentAccount47.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4#mmName
	 * SubAccount4.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement1#mmAccountName
	 * ATMAccountStatement1.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountName
	 * CardAccount3.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1#mmAccountName
	 * CardAccount1.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountName
	 * CardAccount6.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountName
	 * CardAccount4.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#mmAccountName
	 * CardAccount5.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#mmAccountName
	 * CardAccount2.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmName
	 * SecuritiesAccount24.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmName
	 * SecuritiesAccount26.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25#mmName
	 * SecuritiesAccount25.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmName
	 * InvestmentAccount49.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmAccountName
	 * InvestmentAccount54.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmName
	 * InvestmentAccount51.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmName
	 * InvestmentAccount50.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmAccountName
	 * InvestmentAccount56.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmName
	 * InvestmentAccount52.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#mmName
	 * SubAccount5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountName
	 * InvestmentAccount55.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5#mmName
	 * AccountIdentificationAndName5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountName
	 * InvestmentAccount53.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountName
	 * InvestmentAccount57.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2#mmName
	 * CollateralAccount2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount33#mmName
	 * SecuritiesAccount33.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27#mmName
	 * SecuritiesAccount27.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount30#mmName
	 * SecuritiesAccount30.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount34#mmName
	 * SecuritiesAccount34.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmAccountName
	 * CardAccount10.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#mmAccountName
	 * CardAccount9.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#mmAccountName
	 * CardAccount8.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount11#mmAccountName
	 * CardAccount11.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount13#mmAccountName
	 * CardAccount13.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmAccountName
	 * CardAccount7.mmAccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount12#mmAccountName
	 * CardAccount12.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmName
	 * InvestmentAccount61.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmName
	 * InvestmentAccount63.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmName
	 * InvestmentAccount62.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmAccountName
	 * InvestmentAccount58.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6#mmName
	 * SubAccount6.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmName
	 * InvestmentAccount64.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3#mmName
	 * CollateralAccount3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount5.mmName, com.tools20022.repository.msg.SecuritiesAccount1.mmName, com.tools20022.repository.msg.InvestmentAccount17.mmName,
					com.tools20022.repository.msg.AccountIdentificationAndName3.mmName, com.tools20022.repository.msg.CashAccount12.mmName, com.tools20022.repository.msg.SecuritiesAccount4.mmName,
					com.tools20022.repository.msg.InvestmentAccount27.mmName, com.tools20022.repository.msg.InvestmentAccount35.mmName, com.tools20022.repository.msg.InvestmentAccount19.mmName,
					com.tools20022.repository.msg.InvestmentAccount18.mmName, com.tools20022.repository.msg.InvestmentAccount29.mmName, com.tools20022.repository.msg.InvestmentAccount28.mmName,
					com.tools20022.repository.msg.InvestmentAccount36.mmName, com.tools20022.repository.msg.InvestmentAccount16.mmName, com.tools20022.repository.msg.InvestmentAccount26.mmName,
					com.tools20022.repository.msg.InvestmentAccount34.mmName, com.tools20022.repository.msg.CashAccount7.mmName, com.tools20022.repository.msg.CashAccount16.mmName, com.tools20022.repository.msg.CashAccount24.mmName,
					com.tools20022.repository.msg.CashAccountDetails1.mmName, com.tools20022.repository.msg.CashAccountDetails3.mmName, com.tools20022.repository.msg.CashAccountDetails4.mmName,
					com.tools20022.repository.msg.CashAccount23.mmName, com.tools20022.repository.msg.CashAccount13.mmName, com.tools20022.repository.msg.CashAccount20.mmName, com.tools20022.repository.msg.CashAccount25.mmName,
					com.tools20022.repository.msg.InvestmentAccount10.mmAccountName, com.tools20022.repository.msg.InvestmentAccount11.mmAccountName, com.tools20022.repository.msg.InvestmentAccount22.mmAccountName,
					com.tools20022.repository.msg.SubAccount1.mmName, com.tools20022.repository.msg.InvestmentAccount24.mmAccountName, com.tools20022.repository.msg.SecuritiesAccount13.mmName,
					com.tools20022.repository.msg.SecuritiesAccount17.mmName, com.tools20022.repository.msg.SecuritiesAccount11.mmName, com.tools20022.repository.msg.SecuritiesAccount2.mmName,
					com.tools20022.repository.msg.SecuritiesAccount14.mmName, com.tools20022.repository.msg.SecuritiesAccount15.mmName, com.tools20022.repository.msg.SecuritiesAccount16.mmName,
					com.tools20022.repository.msg.SafekeepingAccount1.mmName, com.tools20022.repository.msg.SafekeepingAccount2.mmName, com.tools20022.repository.msg.SecuritiesAccount20.mmName,
					com.tools20022.repository.msg.SecuritiesAccount3.mmName, com.tools20022.repository.msg.AccountForAction2.mmName, com.tools20022.repository.msg.CustomerAccount1.mmName,
					com.tools20022.repository.msg.CustomerAccount5.mmName, com.tools20022.repository.msg.CustomerAccountModification1.mmName, com.tools20022.repository.msg.CustomerAccount4.mmName,
					com.tools20022.repository.msg.CashAccount28.mmName, com.tools20022.repository.msg.CashAccount27.mmName, com.tools20022.repository.msg.InvestmentAccount13.mmAccountName,
					com.tools20022.repository.msg.InvestmentAccount21.mmAccountName, com.tools20022.repository.msg.InvestmentAccount14.mmAccountName, com.tools20022.repository.msg.InvestmentAccount12.mmName,
					com.tools20022.repository.msg.InvestmentAccount25.mmName, com.tools20022.repository.msg.CashAccount3.mmName, com.tools20022.repository.msg.AccountIdentificationAndName2.mmName,
					com.tools20022.repository.choice.AccountIdentificationOrNameChoice.mmName, com.tools20022.repository.msg.CollateralAccount1.mmName, com.tools20022.repository.msg.AccountIdentificationAndName.mmAccountName,
					com.tools20022.repository.msg.AccountIdentification5.mmName, com.tools20022.repository.msg.SecuritiesAccount19.mmName, com.tools20022.repository.msg.SecuritiesAccount18.mmName,
					com.tools20022.repository.msg.SecuritiesAccount5.mmName, com.tools20022.repository.msg.SubAccount3.mmName, com.tools20022.repository.msg.CustomerAccount2.mmName, com.tools20022.repository.msg.CustomerAccount3.mmName,
					com.tools20022.repository.msg.InvestmentAccount38.mmName, com.tools20022.repository.msg.InvestmentAccount37.mmName, com.tools20022.repository.msg.InvestmentAccount39.mmName,
					com.tools20022.repository.msg.InvestmentAccount40.mmAccountName, com.tools20022.repository.msg.InvestmentAccount41.mmAccountName, com.tools20022.repository.msg.SecuritiesAccount22.mmName,
					com.tools20022.repository.msg.InvestmentAccount43.mmName, com.tools20022.repository.msg.InvestmentAccount44.mmName, com.tools20022.repository.msg.InvestmentAccount45.mmAccountName,
					com.tools20022.repository.msg.InvestmentAccount46.mmName, com.tools20022.repository.msg.InvestmentAccount47.mmName, com.tools20022.repository.msg.SubAccount4.mmName,
					com.tools20022.repository.msg.ATMAccountStatement1.mmAccountName, com.tools20022.repository.msg.CardAccount3.mmAccountName, com.tools20022.repository.msg.CardAccount1.mmAccountName,
					com.tools20022.repository.msg.CardAccount6.mmAccountName, com.tools20022.repository.msg.CardAccount4.mmAccountName, com.tools20022.repository.msg.CardAccount5.mmAccountName,
					com.tools20022.repository.msg.CardAccount2.mmAccountName, com.tools20022.repository.msg.SecuritiesAccount24.mmName, com.tools20022.repository.msg.SecuritiesAccount26.mmName,
					com.tools20022.repository.msg.SecuritiesAccount25.mmName, com.tools20022.repository.msg.InvestmentAccount49.mmName, com.tools20022.repository.msg.InvestmentAccount54.mmAccountName,
					com.tools20022.repository.msg.InvestmentAccount51.mmName, com.tools20022.repository.msg.InvestmentAccount50.mmName, com.tools20022.repository.msg.InvestmentAccount56.mmAccountName,
					com.tools20022.repository.msg.InvestmentAccount52.mmName, com.tools20022.repository.msg.SubAccount5.mmName, com.tools20022.repository.msg.InvestmentAccount55.mmAccountName,
					com.tools20022.repository.msg.AccountIdentificationAndName5.mmName, com.tools20022.repository.msg.InvestmentAccount53.mmAccountName, com.tools20022.repository.msg.InvestmentAccount57.mmAccountName,
					com.tools20022.repository.msg.CollateralAccount2.mmName, com.tools20022.repository.msg.SecuritiesAccount33.mmName, com.tools20022.repository.msg.SecuritiesAccount27.mmName,
					com.tools20022.repository.msg.SecuritiesAccount30.mmName, com.tools20022.repository.msg.SecuritiesAccount34.mmName, com.tools20022.repository.msg.CardAccount10.mmAccountName,
					com.tools20022.repository.msg.CardAccount9.mmAccountName, com.tools20022.repository.msg.CardAccount8.mmAccountName, com.tools20022.repository.msg.CardAccount11.mmAccountName,
					com.tools20022.repository.msg.CardAccount13.mmAccountName, com.tools20022.repository.msg.CardAccount7.mmAccountName, com.tools20022.repository.msg.CardAccount12.mmAccountName,
					com.tools20022.repository.msg.InvestmentAccount61.mmName, com.tools20022.repository.msg.InvestmentAccount63.mmName, com.tools20022.repository.msg.InvestmentAccount62.mmName,
					com.tools20022.repository.msg.InvestmentAccount58.mmAccountName, com.tools20022.repository.msg.SubAccount6.mmName, com.tools20022.repository.msg.InvestmentAccount64.mmName,
					com.tools20022.repository.msg.CollateralAccount3.mmName);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected GenericIdentification costReferencePattern;
	/**
	 * Template describing the mask of the structure for the format of the
	 * accounting account identifier; for example "AABBBBCC" where AA represents
	 * the country, BBBB the service classification, CC the sales area.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForAccountCostReferencePattern
	 * GenericIdentification.mmIdentificationForAccountCostReferencePattern}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingAccount1#mmCostReferencePattern
	 * AccountingAccount1.mmCostReferencePattern}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostReferencePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCostReferencePattern = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountingAccount1.mmCostReferencePattern);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CostReferencePattern";
			definition = "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Max35Text number;
	/**
	 * String of characters (mainly numbers) used to identify an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmAccountIdentification
	 * DetailedInstructionStatus8.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmSubAccountIdentification
	 * DetailedInstructionStatus8.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmAccountIdentification
	 * Entitlement1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmAccountIdentification
	 * DetailedInstructionStatus11.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmSubAccountIdentification
	 * DetailedInstructionStatus11.mmSubAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "String of characters (mainly numbers) used to identify an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DetailedInstructionStatus8.mmAccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus8.mmSubAccountIdentification,
					com.tools20022.repository.msg.Entitlement1.mmAccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus11.mmAccountIdentification,
					com.tools20022.repository.msg.DetailedInstructionStatus11.mmSubAccountIdentification);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "String of characters (mainly numbers) used to identify an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification";
				definition = "Unique identifier of an account, as assigned by the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccount,
						com.tools20022.repository.entity.GenericIdentification.mmIdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.Account.mmIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountIdentificationAndPurpose.mmIdentification, com.tools20022.repository.msg.AccountIdentification3.mmIdentification,
						com.tools20022.repository.choice.AccountIdentificationFormatChoice.mmSimpleIdentification, com.tools20022.repository.choice.AccountIdentificationFormatChoice.mmIdentificationAndPurpose,
						com.tools20022.repository.choice.AccountIdentificationFormatChoice.mmIdentificationAsDSS, com.tools20022.repository.msg.AccountIdentificationAndName3.mmIdentification,
						com.tools20022.repository.msg.AccountIdentificationDetails.mmIdentification, com.tools20022.repository.msg.AccountIdentification10.mmIdentificationCode,
						com.tools20022.repository.choice.AccountIdentification6Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification6Choice.mmAccountsList,
						com.tools20022.repository.choice.AccountIdentification11Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification11Choice.mmAccountsList,
						com.tools20022.repository.choice.AccountIdentification13Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification13Choice.mmAccountsList,
						com.tools20022.repository.choice.AccountIdentification17Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification17Choice.mmAccountsList,
						com.tools20022.repository.choice.AccountIdentification7Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification8Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification12Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification15Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification18Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification19Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification21Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification22Choice.mmForAllAccounts,
						com.tools20022.repository.msg.SubAccountIdentification2.mmIdentification, com.tools20022.repository.msg.SubAccountIdentification3.mmIdentification,
						com.tools20022.repository.msg.SubAccountIdentification1.mmIdentification, com.tools20022.repository.msg.SubAccountIdentification5.mmIdentification,
						com.tools20022.repository.msg.SubAccountIdentification4.mmIdentification, com.tools20022.repository.msg.SubAccountIdentification6.mmIdentification,
						com.tools20022.repository.msg.AccountIdentificationAndName2.mmIdentification, com.tools20022.repository.choice.AccountIdentificationOrNameChoice.mmIdentification,
						com.tools20022.repository.choice.AccountIdentificationOrNameChoice.mmNameAndIdentification, com.tools20022.repository.choice.AccountIdentification9Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification9Choice.mmAccountsListAndBalanceDetails, com.tools20022.repository.choice.AccountIdentification10Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification10Choice.mmAccountsListAndBalanceDetails, com.tools20022.repository.choice.AccountIdentification14Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification14Choice.mmAccountsListAndBalanceDetails, com.tools20022.repository.choice.AccountIdentification16Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification16Choice.mmAccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountIdentificationAndName.mmAccountIdentification,
						com.tools20022.repository.msg.AccountIdentificationAndName4.mmIdentification, com.tools20022.repository.choice.AccountIdentification20Choice.mmCashAccountIdentification,
						com.tools20022.repository.choice.AccountIdentification23Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification26Choice.mmForAllAccounts,
						com.tools20022.repository.msg.SubAccountIdentification36.mmIdentification, com.tools20022.repository.choice.AccountIdentification30Choice.mmCard,
						com.tools20022.repository.choice.AccountIdentification30Choice.mmMSISDN, com.tools20022.repository.choice.AccountIdentification30Choice.mmEMail,
						com.tools20022.repository.choice.AccountIdentification30Choice.mmDomestic, com.tools20022.repository.choice.AccountIdentification33Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification33Choice.mmAccountsListAndBalanceDetails, com.tools20022.repository.choice.AccountIdentification29Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification29Choice.mmAccountsList, com.tools20022.repository.choice.AccountIdentification32Choice.mmForAllAccounts,
						com.tools20022.repository.msg.AccountIdentificationAndName5.mmIdentification, com.tools20022.repository.choice.AccountIdentification34Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification34Choice.mmAccountsList, com.tools20022.repository.choice.AccountIdentification36Choice.mmForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification37Choice.mmForAllAccounts, com.tools20022.repository.choice.AccountIdentification37Choice.mmAccountsListAndBalanceDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountIdentification.mmAccount, com.tools20022.repository.entity.AccountIdentification.mmIBAN,
						com.tools20022.repository.entity.AccountIdentification.mmBBAN, com.tools20022.repository.entity.AccountIdentification.mmUPIC, com.tools20022.repository.entity.AccountIdentification.mmProprietaryIdentification,
						com.tools20022.repository.entity.AccountIdentification.mmName, com.tools20022.repository.entity.AccountIdentification.mmCostReferencePattern, com.tools20022.repository.entity.AccountIdentification.mmNumber);
				derivationComponent_lazy = () -> Arrays.asList(AccountIdentification1Choice.mmObject(), AccountIdentification5Choice.mmObject(), AccountIdentification1.mmObject(), AccountIdentificationAndPurpose.mmObject(),
						AccountIdentification3.mmObject(), AccountIdentificationFormatChoice.mmObject(), CashAccountIdentification1Choice.mmObject(), AccountIdentificationAndName3.mmObject(), AccountIdentification3Choice.mmObject(),
						GenericAccountIdentification1.mmObject(), AccountIdentification4Choice.mmObject(), AccountIdentificationDetails.mmObject(), CashAccountIdentification5Choice.mmObject(), CashAccountIdentification2Choice.mmObject(),
						CashAccountIdentification6Choice.mmObject(), AccountIdentification10.mmObject(), AccountIdentification9.mmObject(), AccountIdentification6Choice.mmObject(), AccountIdentification14.mmObject(),
						AccountIdentification11Choice.mmObject(), AccountIdentification15.mmObject(), AccountIdentification13Choice.mmObject(), AccountIdentification21.mmObject(), AccountIdentification17Choice.mmObject(),
						AccountIdentification8.mmObject(), AccountIdentification17.mmObject(), AccountIdentification19.mmObject(), AccountIdentification6.mmObject(), AccountIdentification12.mmObject(), AccountIdentification16.mmObject(),
						AccountIdentification22.mmObject(), AccountIdentification23.mmObject(), AccountIdentification24.mmObject(), AccountIdentification25.mmObject(), AccountIdentification29.mmObject(),
						AccountIdentification7Choice.mmObject(), AccountIdentification8Choice.mmObject(), AccountIdentification12Choice.mmObject(), AccountIdentification15Choice.mmObject(), AccountIdentification18Choice.mmObject(),
						AccountIdentification19Choice.mmObject(), AccountIdentification21Choice.mmObject(), AccountIdentification22Choice.mmObject(), SubAccountIdentification10.mmObject(), AccountIdentification26.mmObject(),
						AccountIdentification4.mmObject(), SubAccountIdentification13.mmObject(), SubAccountIdentification2.mmObject(), SubAccountIdentification3.mmObject(), SubAccountIdentification16.mmObject(),
						SubAccountIdentification20.mmObject(), SubAccountIdentification23.mmObject(), SubAccountIdentification26.mmObject(), SubAccountIdentification11.mmObject(), SubAccountIdentification12.mmObject(),
						SubAccountIdentification1.mmObject(), SubAccountIdentification5.mmObject(), SubAccountIdentification17.mmObject(), SubAccountIdentification19.mmObject(), SubAccountIdentification22.mmObject(),
						SubAccountIdentification25.mmObject(), SubAccountIdentification9.mmObject(), SubAccountIdentification14.mmObject(), SubAccountIdentification15.mmObject(), SubAccountIdentification18.mmObject(),
						SubAccountIdentification21.mmObject(), SubAccountIdentification24.mmObject(), SubAccountIdentification4.mmObject(), SubAccountIdentification6.mmObject(), AccountIdentification2Choice.mmObject(),
						AccountIdentificationAndName2.mmObject(), AccountIdentificationOrNameChoice.mmObject(), AccountIdentification7.mmObject(), AccountIdentification9Choice.mmObject(), AccountIdentification13.mmObject(),
						AccountIdentification10Choice.mmObject(), AccountIdentification18.mmObject(), AccountIdentification14Choice.mmObject(), AccountIdentification20.mmObject(), AccountIdentification16Choice.mmObject(),
						AccountIdentificationAndName.mmObject(), AccountIdentification5.mmObject(), AccountIdentification2.mmObject(), CashAccountIdentification1.mmObject(), AccountIdentificationAndName4.mmObject(),
						AccountIdentification11.mmObject(), SubAccountIdentification27.mmObject(), SubaccountIdentification7.mmObject(), SubaccountIdentification8.mmObject(), AccountIdentification20Choice.mmObject(),
						AccountIdentification23Choice.mmObject(), AccountIdentification26Choice.mmObject(), SubAccountIdentification36.mmObject(), AccountIdentification30Choice.mmObject(), AccountIdentification31Choice.mmObject(),
						AccountIdentification33Choice.mmObject(), AccountIdentification29Choice.mmObject(), AccountIdentification33.mmObject(), AccountIdentification32Choice.mmObject(), AccountIdentification31.mmObject(),
						AccountIdentification32.mmObject(), AccountIdentificationAndName5.mmObject(), AccountIdentification34Choice.mmObject(), AccountIdentification36Choice.mmObject(), AccountIdentification37Choice.mmObject(),
						AccountIdentification35.mmObject(), AccountIdentification34.mmObject(), AccountIdentification37.mmObject(), AccountIdentification39.mmObject(), AccountIdentification40.mmObject(), AccountIdentification41.mmObject(),
						AccountIdentification42.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.Account account) {
		this.account = account;
	}

	public IBAN2007Identifier getIBAN() {
		return iBAN;
	}

	public void setIBAN(IBAN2007Identifier iBAN) {
		this.iBAN = iBAN;
	}

	public BBANIdentifier getBBAN() {
		return bBAN;
	}

	public void setBBAN(BBANIdentifier bBAN) {
		this.bBAN = bBAN;
	}

	public UPICIdentifier getUPIC() {
		return uPIC;
	}

	public void setUPIC(UPICIdentifier uPIC) {
		this.uPIC = uPIC;
	}

	public GenericIdentification getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(com.tools20022.repository.entity.GenericIdentification proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}

	public Max70Text getName() {
		return name;
	}

	public void setName(Max70Text name) {
		this.name = name;
	}

	public GenericIdentification getCostReferencePattern() {
		return costReferencePattern;
	}

	public void setCostReferencePattern(com.tools20022.repository.entity.GenericIdentification costReferencePattern) {
		this.costReferencePattern = costReferencePattern;
	}

	public Max35Text getNumber() {
		return number;
	}

	public void setNumber(Max35Text number) {
		this.number = number;
	}
}