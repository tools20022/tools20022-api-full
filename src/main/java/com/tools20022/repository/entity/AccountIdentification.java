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
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#Account
 * AccountIdentification.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountIdentification#IBAN
 * AccountIdentification.IBAN}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountIdentification#BBAN
 * AccountIdentification.BBAN}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountIdentification#UPIC
 * AccountIdentification.UPIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#ProprietaryIdentification
 * AccountIdentification.ProprietaryIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountIdentification#Name
 * AccountIdentification.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#CostReferencePattern
 * AccountIdentification.CostReferencePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#Number
 * AccountIdentification.Number}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccount
 * GenericIdentification.IdentificationForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccountCostReferencePattern
 * GenericIdentification.IdentificationForAccountCostReferencePattern}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Identification
 * Account.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose#Identification
 * AccountIdentificationAndPurpose.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification3#Identification
 * AccountIdentification3.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#SimpleIdentification
 * AccountIdentificationFormatChoice.SimpleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#IdentificationAndPurpose
 * AccountIdentificationFormatChoice.IdentificationAndPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice#IdentificationAsDSS
 * AccountIdentificationFormatChoice.IdentificationAsDSS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName3#Identification
 * AccountIdentificationAndName3.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationDetails#Identification
 * AccountIdentificationDetails.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification10#IdentificationCode
 * AccountIdentification10.IdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification6Choice#ForAllAccounts
 * AccountIdentification6Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification6Choice#AccountsList
 * AccountIdentification6Choice.AccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification11Choice#ForAllAccounts
 * AccountIdentification11Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification11Choice#AccountsList
 * AccountIdentification11Choice.AccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#ForAllAccounts
 * AccountIdentification13Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification13Choice#AccountsList
 * AccountIdentification13Choice.AccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification17Choice#ForAllAccounts
 * AccountIdentification17Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification17Choice#AccountsList
 * AccountIdentification17Choice.AccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification7Choice#ForAllAccounts
 * AccountIdentification7Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification8Choice#ForAllAccounts
 * AccountIdentification8Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice#ForAllAccounts
 * AccountIdentification12Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification15Choice#ForAllAccounts
 * AccountIdentification15Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification18Choice#ForAllAccounts
 * AccountIdentification18Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification19Choice#ForAllAccounts
 * AccountIdentification19Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification21Choice#ForAllAccounts
 * AccountIdentification21Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification22Choice#ForAllAccounts
 * AccountIdentification22Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification2#Identification
 * SubAccountIdentification2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#Identification
 * SubAccountIdentification3.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1#Identification
 * SubAccountIdentification1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#Identification
 * SubAccountIdentification5.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification4#Identification
 * SubAccountIdentification4.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6#Identification
 * SubAccountIdentification6.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName2#Identification
 * AccountIdentificationAndName2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice#Identification
 * AccountIdentificationOrNameChoice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice#NameAndIdentification
 * AccountIdentificationOrNameChoice.NameAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification9Choice#ForAllAccounts
 * AccountIdentification9Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification9Choice#AccountsListAndBalanceDetails
 * AccountIdentification9Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification10Choice#ForAllAccounts
 * AccountIdentification10Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification10Choice#AccountsListAndBalanceDetails
 * AccountIdentification10Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification14Choice#ForAllAccounts
 * AccountIdentification14Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification14Choice#AccountsListAndBalanceDetails
 * AccountIdentification14Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification16Choice#ForAllAccounts
 * AccountIdentification16Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification16Choice#AccountsListAndBalanceDetails
 * AccountIdentification16Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName#AccountIdentification
 * AccountIdentificationAndName.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName4#Identification
 * AccountIdentificationAndName4.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice#CashAccountIdentification
 * AccountIdentification20Choice.CashAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification23Choice#ForAllAccounts
 * AccountIdentification23Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification26Choice#ForAllAccounts
 * AccountIdentification26Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#Identification
 * SubAccountIdentification36.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#Card
 * AccountIdentification30Choice.Card}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#MSISDN
 * AccountIdentification30Choice.MSISDN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#EMail
 * AccountIdentification30Choice.EMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#Domestic
 * AccountIdentification30Choice.Domestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice#ForAllAccounts
 * AccountIdentification33Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice#AccountsListAndBalanceDetails
 * AccountIdentification33Choice.AccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#ForAllAccounts
 * AccountIdentification29Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification29Choice#AccountsList
 * AccountIdentification29Choice.AccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice#ForAllAccounts
 * AccountIdentification32Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5#Identification
 * AccountIdentificationAndName5.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification34Choice#ForAllAccounts
 * AccountIdentification34Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification34Choice#AccountsList
 * AccountIdentification34Choice.AccountsList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification36Choice#ForAllAccounts
 * AccountIdentification36Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification37Choice#ForAllAccounts
 * AccountIdentification37Choice.ForAllAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification37Choice#AccountsListAndBalanceDetails
 * AccountIdentification37Choice.AccountsListAndBalanceDetails}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Account for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#Identification
	 * Account.Identification}</li>
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
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which an identification is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#IBAN
	 * AccountIdentification1Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#IBAN
	 * AccountIdentification5Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#IBAN
	 * CashAccountIdentification1Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#IBAN
	 * AccountIdentification3Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#IBAN
	 * AccountIdentification4Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice#Other
	 * AccountIdentification4Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice#IBAN
	 * CashAccountIdentification5Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice#IBAN
	 * CashAccountIdentification2Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice#IBAN
	 * CashAccountIdentification6Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification2#IBAN
	 * AccountIdentification2.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#IBAN
	 * AccountIdentification30Choice.IBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#IBAN
	 * AccountIdentification31Choice.IBAN}</li>
	 * </ul>
	 * </li>
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
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IBAN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.IBAN, com.tools20022.repository.choice.AccountIdentification5Choice.IBAN,
					com.tools20022.repository.choice.CashAccountIdentification1Choice.IBAN, com.tools20022.repository.choice.AccountIdentification3Choice.IBAN, com.tools20022.repository.choice.AccountIdentification4Choice.IBAN,
					com.tools20022.repository.choice.AccountIdentification4Choice.Other, com.tools20022.repository.choice.CashAccountIdentification5Choice.IBAN, com.tools20022.repository.choice.CashAccountIdentification2Choice.IBAN,
					com.tools20022.repository.choice.CashAccountIdentification6Choice.IBAN, com.tools20022.repository.msg.AccountIdentification2.IBAN, com.tools20022.repository.choice.AccountIdentification30Choice.IBAN,
					com.tools20022.repository.choice.AccountIdentification31Choice.IBAN);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IBAN2007Identifier.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#BBAN
	 * AccountIdentification1Choice.BBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#BBAN
	 * AccountIdentification5Choice.BBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#BBAN
	 * CashAccountIdentification1Choice.BBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#BBAN
	 * AccountIdentification3Choice.BBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#BBAN
	 * AccountIdentification30Choice.BBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#BBAN
	 * AccountIdentification31Choice.BBAN}</li>
	 * </ul>
	 * </li>
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
	 * name} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BBAN = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.BBAN, com.tools20022.repository.choice.AccountIdentification5Choice.BBAN,
					com.tools20022.repository.choice.CashAccountIdentification1Choice.BBAN, com.tools20022.repository.choice.AccountIdentification3Choice.BBAN, com.tools20022.repository.choice.AccountIdentification30Choice.BBAN,
					com.tools20022.repository.choice.AccountIdentification31Choice.BBAN);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BBAN";
			definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BBANIdentifier.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#UPIC
	 * AccountIdentification1Choice.UPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#UPIC
	 * CashAccountIdentification1Choice.UPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#UPIC
	 * AccountIdentification3Choice.UPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#UPIC
	 * AccountIdentification30Choice.UPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#UPIC
	 * AccountIdentification31Choice.UPIC}</li>
	 * </ul>
	 * </li>
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
	 * name} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UPIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.UPIC, com.tools20022.repository.choice.CashAccountIdentification1Choice.UPIC,
					com.tools20022.repository.choice.AccountIdentification3Choice.UPIC, com.tools20022.repository.choice.AccountIdentification30Choice.UPIC, com.tools20022.repository.choice.AccountIdentification31Choice.UPIC);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UPIC";
			definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UPICIdentifier.mmObject();
		}
	};
	/**
	 * Unique identifier for an account. It is assigned by the account servicer
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccount
	 * GenericIdentification.IdentificationForAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#DomesticAccount
	 * AccountIdentification1Choice.DomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#DomesticAccount
	 * AccountIdentification5Choice.DomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification5Choice#DepositoryAccount
	 * AccountIdentification5Choice.DepositoryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1#Proprietary
	 * AccountIdentification1.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice#DomesticAccount
	 * CashAccountIdentification1Choice.DomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification3Choice#ProprietaryAccount
	 * AccountIdentification3Choice.ProprietaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice#Proprietary
	 * CashAccountIdentification5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification2Choice#Proprietary
	 * CashAccountIdentification2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice#Proprietary
	 * CashAccountIdentification6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification26#Proprietary
	 * AccountIdentification26.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification4#Proprietary
	 * AccountIdentification4.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountIdentification1#DomesticAccount
	 * CashAccountIdentification1.DomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#Proprietary
	 * CustomerAccount2.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#Other
	 * AccountIdentification30Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice#DomesticAccount
	 * AccountIdentification31Choice.DomesticAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountDesignation1Choice#Proprietary
	 * AccountDesignation1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification1Choice.DomesticAccount, com.tools20022.repository.choice.AccountIdentification5Choice.DomesticAccount,
					com.tools20022.repository.choice.AccountIdentification5Choice.DepositoryAccount, com.tools20022.repository.msg.AccountIdentification1.Proprietary,
					com.tools20022.repository.choice.CashAccountIdentification1Choice.DomesticAccount, com.tools20022.repository.choice.AccountIdentification3Choice.ProprietaryAccount,
					com.tools20022.repository.choice.CashAccountIdentification5Choice.Proprietary, com.tools20022.repository.choice.CashAccountIdentification2Choice.Proprietary,
					com.tools20022.repository.choice.CashAccountIdentification6Choice.Proprietary, com.tools20022.repository.msg.AccountIdentification26.Proprietary, com.tools20022.repository.msg.AccountIdentification4.Proprietary,
					com.tools20022.repository.msg.CashAccountIdentification1.DomesticAccount, com.tools20022.repository.msg.CustomerAccount2.Proprietary, com.tools20022.repository.choice.AccountIdentification30Choice.Other,
					com.tools20022.repository.choice.AccountIdentification31Choice.DomesticAccount, com.tools20022.repository.choice.AccountDesignation1Choice.Proprietary);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique identifier for an account. It is assigned by the account servicer using a proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#Name
	 * CashAccount5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount1#Name
	 * SecuritiesAccount1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount17#Name
	 * InvestmentAccount17.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName3#Name
	 * AccountIdentificationAndName3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#Name
	 * CashAccount12.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount4#Name
	 * SecuritiesAccount4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount27#Name
	 * InvestmentAccount27.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#Name
	 * InvestmentAccount35.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount19#Name
	 * InvestmentAccount19.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#Name
	 * InvestmentAccount18.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount29#Name
	 * InvestmentAccount29.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount28#Name
	 * InvestmentAccount28.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount36#Name
	 * InvestmentAccount36.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount16#Name
	 * InvestmentAccount16.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount26#Name
	 * InvestmentAccount26.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount34#Name
	 * InvestmentAccount34.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7#Name
	 * CashAccount7.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16#Name
	 * CashAccount16.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#Name
	 * CashAccount24.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1#Name
	 * CashAccountDetails1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3#Name
	 * CashAccountDetails3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails4#Name
	 * CashAccountDetails4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23#Name
	 * CashAccount23.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13#Name
	 * CashAccount13.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20#Name
	 * CashAccount20.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#Name
	 * CashAccount25.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#AccountName
	 * InvestmentAccount10.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#AccountName
	 * InvestmentAccount11.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#AccountName
	 * InvestmentAccount22.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1#Name
	 * SubAccount1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#AccountName
	 * InvestmentAccount24.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#Name
	 * SecuritiesAccount13.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount17#Name
	 * SecuritiesAccount17.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount11#Name
	 * SecuritiesAccount11.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount2#Name
	 * SecuritiesAccount2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount14#Name
	 * SecuritiesAccount14.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount15#Name
	 * SecuritiesAccount15.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount16#Name
	 * SecuritiesAccount16.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount1#Name
	 * SafekeepingAccount1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount2#Name
	 * SafekeepingAccount2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20#Name
	 * SecuritiesAccount20.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3#Name
	 * SecuritiesAccount3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2#Name
	 * AccountForAction2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1#Name
	 * CustomerAccount1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#Name
	 * CustomerAccount5.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Name
	 * CustomerAccountModification1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#Name
	 * CustomerAccount4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount28#Name
	 * CashAccount28.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#Name
	 * CashAccount27.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount13#AccountName
	 * InvestmentAccount13.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#AccountName
	 * InvestmentAccount21.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#AccountName
	 * InvestmentAccount14.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount12#Name
	 * InvestmentAccount12.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount25#Name
	 * InvestmentAccount25.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3#Name
	 * CashAccount3.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName2#Name
	 * AccountIdentificationAndName2.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice#Name
	 * AccountIdentificationOrNameChoice.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount1#Name
	 * CollateralAccount1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName#AccountName
	 * AccountIdentificationAndName.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#Name
	 * AccountIdentification5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#Name
	 * SecuritiesAccount19.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18#Name
	 * SecuritiesAccount18.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount5#Name
	 * SecuritiesAccount5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount3#Name
	 * SubAccount3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#Name
	 * CustomerAccount2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#Name
	 * CustomerAccount3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38#Name
	 * InvestmentAccount38.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount37#Name
	 * InvestmentAccount37.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount39#Name
	 * InvestmentAccount39.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#AccountName
	 * InvestmentAccount40.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#AccountName
	 * InvestmentAccount41.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#Name
	 * SecuritiesAccount22.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount43#Name
	 * InvestmentAccount43.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount44#Name
	 * InvestmentAccount44.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount45#AccountName
	 * InvestmentAccount45.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount46#Name
	 * InvestmentAccount46.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount47#Name
	 * InvestmentAccount47.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4#Name
	 * SubAccount4.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement1#AccountName
	 * ATMAccountStatement1.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#AccountName
	 * CardAccount3.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1#AccountName
	 * CardAccount1.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#AccountName
	 * CardAccount6.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#AccountName
	 * CardAccount4.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#AccountName
	 * CardAccount5.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#AccountName
	 * CardAccount2.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#Name
	 * SecuritiesAccount24.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26#Name
	 * SecuritiesAccount26.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25#Name
	 * SecuritiesAccount25.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount49#Name
	 * InvestmentAccount49.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#AccountName
	 * InvestmentAccount54.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount51#Name
	 * InvestmentAccount51.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#Name
	 * InvestmentAccount50.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#AccountName
	 * InvestmentAccount56.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount52#Name
	 * InvestmentAccount52.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#Name
	 * SubAccount5.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#AccountName
	 * InvestmentAccount55.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5#Name
	 * AccountIdentificationAndName5.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#AccountName
	 * InvestmentAccount53.AccountName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#AccountName
	 * InvestmentAccount57.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2#Name
	 * CollateralAccount2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount33#Name
	 * SecuritiesAccount33.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27#Name
	 * SecuritiesAccount27.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount30#Name
	 * SecuritiesAccount30.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount34#Name
	 * SecuritiesAccount34.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#AccountName
	 * CardAccount10.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#AccountName
	 * CardAccount9.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#AccountName
	 * CardAccount8.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#AccountName
	 * CardAccount11.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13#AccountName
	 * CardAccount13.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#AccountName
	 * CardAccount7.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12#AccountName
	 * CardAccount12.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61#Name
	 * InvestmentAccount61.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#Name
	 * InvestmentAccount63.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#Name
	 * InvestmentAccount62.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#AccountName
	 * InvestmentAccount58.AccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6#Name
	 * SubAccount6.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount64#Name
	 * InvestmentAccount64.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3#Name
	 * CollateralAccount3.Name}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount5.Name, com.tools20022.repository.msg.SecuritiesAccount1.Name, com.tools20022.repository.msg.InvestmentAccount17.Name,
					com.tools20022.repository.msg.AccountIdentificationAndName3.Name, com.tools20022.repository.msg.CashAccount12.Name, com.tools20022.repository.msg.SecuritiesAccount4.Name,
					com.tools20022.repository.msg.InvestmentAccount27.Name, com.tools20022.repository.msg.InvestmentAccount35.Name, com.tools20022.repository.msg.InvestmentAccount19.Name,
					com.tools20022.repository.msg.InvestmentAccount18.Name, com.tools20022.repository.msg.InvestmentAccount29.Name, com.tools20022.repository.msg.InvestmentAccount28.Name,
					com.tools20022.repository.msg.InvestmentAccount36.Name, com.tools20022.repository.msg.InvestmentAccount16.Name, com.tools20022.repository.msg.InvestmentAccount26.Name,
					com.tools20022.repository.msg.InvestmentAccount34.Name, com.tools20022.repository.msg.CashAccount7.Name, com.tools20022.repository.msg.CashAccount16.Name, com.tools20022.repository.msg.CashAccount24.Name,
					com.tools20022.repository.msg.CashAccountDetails1.Name, com.tools20022.repository.msg.CashAccountDetails3.Name, com.tools20022.repository.msg.CashAccountDetails4.Name, com.tools20022.repository.msg.CashAccount23.Name,
					com.tools20022.repository.msg.CashAccount13.Name, com.tools20022.repository.msg.CashAccount20.Name, com.tools20022.repository.msg.CashAccount25.Name, com.tools20022.repository.msg.InvestmentAccount10.AccountName,
					com.tools20022.repository.msg.InvestmentAccount11.AccountName, com.tools20022.repository.msg.InvestmentAccount22.AccountName, com.tools20022.repository.msg.SubAccount1.Name,
					com.tools20022.repository.msg.InvestmentAccount24.AccountName, com.tools20022.repository.msg.SecuritiesAccount13.Name, com.tools20022.repository.msg.SecuritiesAccount17.Name,
					com.tools20022.repository.msg.SecuritiesAccount11.Name, com.tools20022.repository.msg.SecuritiesAccount2.Name, com.tools20022.repository.msg.SecuritiesAccount14.Name,
					com.tools20022.repository.msg.SecuritiesAccount15.Name, com.tools20022.repository.msg.SecuritiesAccount16.Name, com.tools20022.repository.msg.SafekeepingAccount1.Name,
					com.tools20022.repository.msg.SafekeepingAccount2.Name, com.tools20022.repository.msg.SecuritiesAccount20.Name, com.tools20022.repository.msg.SecuritiesAccount3.Name,
					com.tools20022.repository.msg.AccountForAction2.Name, com.tools20022.repository.msg.CustomerAccount1.Name, com.tools20022.repository.msg.CustomerAccount5.Name,
					com.tools20022.repository.msg.CustomerAccountModification1.Name, com.tools20022.repository.msg.CustomerAccount4.Name, com.tools20022.repository.msg.CashAccount28.Name, com.tools20022.repository.msg.CashAccount27.Name,
					com.tools20022.repository.msg.InvestmentAccount13.AccountName, com.tools20022.repository.msg.InvestmentAccount21.AccountName, com.tools20022.repository.msg.InvestmentAccount14.AccountName,
					com.tools20022.repository.msg.InvestmentAccount12.Name, com.tools20022.repository.msg.InvestmentAccount25.Name, com.tools20022.repository.msg.CashAccount3.Name,
					com.tools20022.repository.msg.AccountIdentificationAndName2.Name, com.tools20022.repository.choice.AccountIdentificationOrNameChoice.Name, com.tools20022.repository.msg.CollateralAccount1.Name,
					com.tools20022.repository.msg.AccountIdentificationAndName.AccountName, com.tools20022.repository.msg.AccountIdentification5.Name, com.tools20022.repository.msg.SecuritiesAccount19.Name,
					com.tools20022.repository.msg.SecuritiesAccount18.Name, com.tools20022.repository.msg.SecuritiesAccount5.Name, com.tools20022.repository.msg.SubAccount3.Name, com.tools20022.repository.msg.CustomerAccount2.Name,
					com.tools20022.repository.msg.CustomerAccount3.Name, com.tools20022.repository.msg.InvestmentAccount38.Name, com.tools20022.repository.msg.InvestmentAccount37.Name,
					com.tools20022.repository.msg.InvestmentAccount39.Name, com.tools20022.repository.msg.InvestmentAccount40.AccountName, com.tools20022.repository.msg.InvestmentAccount41.AccountName,
					com.tools20022.repository.msg.SecuritiesAccount22.Name, com.tools20022.repository.msg.InvestmentAccount43.Name, com.tools20022.repository.msg.InvestmentAccount44.Name,
					com.tools20022.repository.msg.InvestmentAccount45.AccountName, com.tools20022.repository.msg.InvestmentAccount46.Name, com.tools20022.repository.msg.InvestmentAccount47.Name,
					com.tools20022.repository.msg.SubAccount4.Name, com.tools20022.repository.msg.ATMAccountStatement1.AccountName, com.tools20022.repository.msg.CardAccount3.AccountName,
					com.tools20022.repository.msg.CardAccount1.AccountName, com.tools20022.repository.msg.CardAccount6.AccountName, com.tools20022.repository.msg.CardAccount4.AccountName,
					com.tools20022.repository.msg.CardAccount5.AccountName, com.tools20022.repository.msg.CardAccount2.AccountName, com.tools20022.repository.msg.SecuritiesAccount24.Name,
					com.tools20022.repository.msg.SecuritiesAccount26.Name, com.tools20022.repository.msg.SecuritiesAccount25.Name, com.tools20022.repository.msg.InvestmentAccount49.Name,
					com.tools20022.repository.msg.InvestmentAccount54.AccountName, com.tools20022.repository.msg.InvestmentAccount51.Name, com.tools20022.repository.msg.InvestmentAccount50.Name,
					com.tools20022.repository.msg.InvestmentAccount56.AccountName, com.tools20022.repository.msg.InvestmentAccount52.Name, com.tools20022.repository.msg.SubAccount5.Name,
					com.tools20022.repository.msg.InvestmentAccount55.AccountName, com.tools20022.repository.msg.AccountIdentificationAndName5.Name, com.tools20022.repository.msg.InvestmentAccount53.AccountName,
					com.tools20022.repository.msg.InvestmentAccount57.AccountName, com.tools20022.repository.msg.CollateralAccount2.Name, com.tools20022.repository.msg.SecuritiesAccount33.Name,
					com.tools20022.repository.msg.SecuritiesAccount27.Name, com.tools20022.repository.msg.SecuritiesAccount30.Name, com.tools20022.repository.msg.SecuritiesAccount34.Name,
					com.tools20022.repository.msg.CardAccount10.AccountName, com.tools20022.repository.msg.CardAccount9.AccountName, com.tools20022.repository.msg.CardAccount8.AccountName,
					com.tools20022.repository.msg.CardAccount11.AccountName, com.tools20022.repository.msg.CardAccount13.AccountName, com.tools20022.repository.msg.CardAccount7.AccountName,
					com.tools20022.repository.msg.CardAccount12.AccountName, com.tools20022.repository.msg.InvestmentAccount61.Name, com.tools20022.repository.msg.InvestmentAccount63.Name,
					com.tools20022.repository.msg.InvestmentAccount62.Name, com.tools20022.repository.msg.InvestmentAccount58.AccountName, com.tools20022.repository.msg.SubAccount6.Name,
					com.tools20022.repository.msg.InvestmentAccount64.Name, com.tools20022.repository.msg.CollateralAccount3.Name);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForAccountCostReferencePattern
	 * GenericIdentification.IdentificationForAccountCostReferencePattern}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingAccount1#CostReferencePattern
	 * AccountingAccount1.CostReferencePattern}</li>
	 * </ul>
	 * </li>
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
	 * name} = "CostReferencePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CostReferencePattern = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountingAccount1.CostReferencePattern);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CostReferencePattern";
			definition = "Template describing the mask of the structure for the format of the accounting account identifier; for example \"AABBBBCC\" where AA represents the country, BBBB the service classification, CC the sales area.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForAccountCostReferencePattern;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * String of characters (mainly numbers) used to identify an account.
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
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#AccountIdentification
	 * DetailedInstructionStatus8.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#SubAccountIdentification
	 * DetailedInstructionStatus8.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Entitlement1#AccountIdentification
	 * Entitlement1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#AccountIdentification
	 * DetailedInstructionStatus11.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#SubAccountIdentification
	 * DetailedInstructionStatus11.SubAccountIdentification}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "String of characters (mainly numbers) used to identify an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DetailedInstructionStatus8.AccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus8.SubAccountIdentification,
					com.tools20022.repository.msg.Entitlement1.AccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus11.AccountIdentification,
					com.tools20022.repository.msg.DetailedInstructionStatus11.SubAccountIdentification);
			elementContext_lazy = () -> AccountIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "String of characters (mainly numbers) used to identify an account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification";
				definition = "Unique identifier of an account, as assigned by the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForAccount,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.Account.Identification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountIdentificationAndPurpose.Identification, com.tools20022.repository.msg.AccountIdentification3.Identification,
						com.tools20022.repository.choice.AccountIdentificationFormatChoice.SimpleIdentification, com.tools20022.repository.choice.AccountIdentificationFormatChoice.IdentificationAndPurpose,
						com.tools20022.repository.choice.AccountIdentificationFormatChoice.IdentificationAsDSS, com.tools20022.repository.msg.AccountIdentificationAndName3.Identification,
						com.tools20022.repository.msg.AccountIdentificationDetails.Identification, com.tools20022.repository.msg.AccountIdentification10.IdentificationCode,
						com.tools20022.repository.choice.AccountIdentification6Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification6Choice.AccountsList,
						com.tools20022.repository.choice.AccountIdentification11Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification11Choice.AccountsList,
						com.tools20022.repository.choice.AccountIdentification13Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification13Choice.AccountsList,
						com.tools20022.repository.choice.AccountIdentification17Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification17Choice.AccountsList,
						com.tools20022.repository.choice.AccountIdentification7Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification8Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification12Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification15Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification18Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification19Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification21Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification22Choice.ForAllAccounts,
						com.tools20022.repository.msg.SubAccountIdentification2.Identification, com.tools20022.repository.msg.SubAccountIdentification3.Identification, com.tools20022.repository.msg.SubAccountIdentification1.Identification,
						com.tools20022.repository.msg.SubAccountIdentification5.Identification, com.tools20022.repository.msg.SubAccountIdentification4.Identification, com.tools20022.repository.msg.SubAccountIdentification6.Identification,
						com.tools20022.repository.msg.AccountIdentificationAndName2.Identification, com.tools20022.repository.choice.AccountIdentificationOrNameChoice.Identification,
						com.tools20022.repository.choice.AccountIdentificationOrNameChoice.NameAndIdentification, com.tools20022.repository.choice.AccountIdentification9Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification9Choice.AccountsListAndBalanceDetails, com.tools20022.repository.choice.AccountIdentification10Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification10Choice.AccountsListAndBalanceDetails, com.tools20022.repository.choice.AccountIdentification14Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification14Choice.AccountsListAndBalanceDetails, com.tools20022.repository.choice.AccountIdentification16Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification16Choice.AccountsListAndBalanceDetails, com.tools20022.repository.msg.AccountIdentificationAndName.AccountIdentification,
						com.tools20022.repository.msg.AccountIdentificationAndName4.Identification, com.tools20022.repository.choice.AccountIdentification20Choice.CashAccountIdentification,
						com.tools20022.repository.choice.AccountIdentification23Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification26Choice.ForAllAccounts,
						com.tools20022.repository.msg.SubAccountIdentification36.Identification, com.tools20022.repository.choice.AccountIdentification30Choice.Card, com.tools20022.repository.choice.AccountIdentification30Choice.MSISDN,
						com.tools20022.repository.choice.AccountIdentification30Choice.EMail, com.tools20022.repository.choice.AccountIdentification30Choice.Domestic,
						com.tools20022.repository.choice.AccountIdentification33Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification33Choice.AccountsListAndBalanceDetails,
						com.tools20022.repository.choice.AccountIdentification29Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification29Choice.AccountsList,
						com.tools20022.repository.choice.AccountIdentification32Choice.ForAllAccounts, com.tools20022.repository.msg.AccountIdentificationAndName5.Identification,
						com.tools20022.repository.choice.AccountIdentification34Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification34Choice.AccountsList,
						com.tools20022.repository.choice.AccountIdentification36Choice.ForAllAccounts, com.tools20022.repository.choice.AccountIdentification37Choice.ForAllAccounts,
						com.tools20022.repository.choice.AccountIdentification37Choice.AccountsListAndBalanceDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountIdentification.Account, com.tools20022.repository.entity.AccountIdentification.IBAN, com.tools20022.repository.entity.AccountIdentification.BBAN,
						com.tools20022.repository.entity.AccountIdentification.UPIC, com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification, com.tools20022.repository.entity.AccountIdentification.Name,
						com.tools20022.repository.entity.AccountIdentification.CostReferencePattern, com.tools20022.repository.entity.AccountIdentification.Number);
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
}