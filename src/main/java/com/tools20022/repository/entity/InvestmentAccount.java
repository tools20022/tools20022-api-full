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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccount" src="doc-files/InvestmentAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountType
 * InvestmentAccount.InvestmentAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#OwnershipType
 * InvestmentAccount.OwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#Designation
 * InvestmentAccount.Designation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#ReferenceCurrency
 * InvestmentAccount.ReferenceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundClass
 * InvestmentAccount.InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CashAccount
 * InvestmentAccount.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SecuritiesAccount
 * InvestmentAccount.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTax
 * InvestmentAccount.InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTransaction
 * InvestmentAccount.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SidePocket
 * InvestmentAccount.SidePocket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountPartyRole
 * InvestmentAccount.InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#DebitPortfolioTransfer
 * InvestmentAccount.DebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CreditPortfolioTransfer
 * InvestmentAccount.CreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#AccountForInvestmentFundProcessing
 * InvestmentAccount.AccountForInvestmentFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountContract
 * InvestmentAccount.InvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#AccountUsageType
 * InvestmentAccount.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount#Category
 * InvestmentAccount.Category}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount#Portfolio
 * InvestmentAccount.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#RelatedPortfolioTransfer
 * InvestmentAccount.RelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentAccount
 * InvestmentFundClass.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvestmentAccount
 * CashAccount.RelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedInvestmentAccount
 * SecuritiesAccount.RelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#InvestmentAccount
 * InvestmentAccountContract.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#InvestmentAccount
 * InvestmentAccountPartyRole.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#InvestmentAccount
 * InvestmentFundTax.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentAccount
 * InvestmentFundTransaction.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountFrom
 * PortfolioTransfer.AccountFrom}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountTo
 * PortfolioTransfer.AccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#NomineeAccount
 * PortfolioTransfer.NomineeAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Account
 * Portfolio.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#InvestmentAccount
 * SidePocket.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#MainFundOrderDeskAccount
 * FundOrderDesk.MainFundOrderDeskAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType1Choice#Code
 * AccountUsageType1Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType1Choice#Proprietary
 * AccountUsageType1Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#Type
 * InvestmentAccount35.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#AccountUsageType
 * InvestmentAccount35.AccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection1#OtherAccountSelectionData
 * InvestmentAccountSelection1.OtherAccountSelectionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#OtherAccountSelectionData
 * InvestmentAccountSelection2.OtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount36#Type
 * InvestmentAccount36.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#AccountUsageType
 * InvestmentAccount36.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount34#Type
 * InvestmentAccount34.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#AccountUsageType
 * InvestmentAccount34.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn1#AccountDetails
 * TransferIn1.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn4#AccountDetails
 * TransferIn4.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn6#AccountDetails
 * TransferIn6.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#ReceiverDetails
 * ReceivingPartiesAndAccount1.ReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut1#AccountDetails
 * TransferOut1.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4#ReceiverDetails
 * ReceivingPartiesAndAccount4.ReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut6#AccountDetails
 * TransferOut6.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#ReceiverDetails
 * ReceivingPartiesAndAccount8.ReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut8#AccountDetails
 * TransferOut8.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut10#AccountDetails
 * TransferOut10.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn8#AccountDetails
 * TransferIn8.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn2#AccountDetails
 * TransferIn2.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn3#AccountDetails
 * TransferIn3.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn5#AccountDetails
 * TransferIn5.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut2#AccountDetails
 * TransferOut2.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut5#AccountDetails
 * TransferOut5.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut7#AccountDetails
 * TransferOut7.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut9#AccountDetails
 * TransferOut9.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn7#AccountDetails
 * TransferIn7.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1#InvestmentAccountDetails
 * StatementOfInvestmentFundTransactions1.InvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#InvestmentAccountDetails
 * StatementOfInvestmentFundTransactions2.InvestmentAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38#Type
 * InvestmentAccount38.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#AccountUsageType
 * InvestmentAccount38.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount37#Type
 * InvestmentAccount37.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#AccountUsageType
 * InvestmentAccount37.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount39#Type
 * InvestmentAccount39.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#AccountUsageType
 * InvestmentAccount39.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn10#AccountDetails
 * TransferIn10.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn9#AccountDetails
 * TransferIn9.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut11#AccountDetails
 * TransferOut11.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut12#AccountDetails
 * TransferOut12.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#ReceiverDetails
 * ReceivingPartiesAndAccount9.ReceiverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#InvestmentAccountDetails
 * StatementOfInvestmentFundTransactions3.InvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentAccountSelection1Choice#OtherAccountSelectionData
 * InvestmentAccountSelection1Choice.OtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount46#Type
 * InvestmentAccount46.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#AccountUsageType
 * InvestmentAccount46.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount47#Type
 * InvestmentAccount47.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#AccountUsageType
 * InvestmentAccount47.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn13#AccountDetails
 * TransferIn13.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut14#AccountDetails
 * TransferOut14.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn12#AccountDetails
 * TransferIn12.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut15#AccountDetails
 * TransferOut15.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount49#Type
 * InvestmentAccount49.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#AccountUsageType
 * InvestmentAccount49.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount51#Type
 * InvestmentAccount51.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#AccountUsageType
 * InvestmentAccount51.AccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountSelection1Choice#OtherAccountSelectionData
 * AccountSelection1Choice.OtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#Type
 * InvestmentAccount50.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#AccountUsageType
 * InvestmentAccount50.AccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#ReceiverDetails
 * ReceivingPartiesAndAccount13.ReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut17#AccountDetails
 * TransferOut17.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14#AccountDetails
 * TransferIn14.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn15#AccountDetails
 * TransferIn15.AccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut16#AccountDetails
 * TransferOut16.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice#Code
 * AccountUsageType2Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice#Proprietary
 * AccountUsageType2Choice.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61#Type
 * InvestmentAccount61.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#AccountUsageType
 * InvestmentAccount61.AccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountSelection2Choice#OtherAccountSelectionData
 * AccountSelection2Choice.OtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#Type
 * InvestmentAccount63.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#AccountUsageType
 * InvestmentAccount63.AccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#Type
 * InvestmentAccount62.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#AccountUsageType
 * InvestmentAccount62.AccountUsageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount17
 * InvestmentAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount27
 * InvestmentAccount27}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountType1Choice
 * AccountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OwnershipType1Choice
 * OwnershipType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountUsageType1Choice
 * AccountUsageType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35
 * InvestmentAccount35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice
 * InvestmentAccountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account5 Account5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account6 Account6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount19
 * InvestmentAccount19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccountSelection1
 * InvestmentAccountSelection1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18
 * InvestmentAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount29
 * InvestmentAccount29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2
 * InvestmentAccountSelection2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount28
 * InvestmentAccount28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount36
 * InvestmentAccount36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount16
 * InvestmentAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount26
 * InvestmentAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount34
 * InvestmentAccount34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount10
 * InvestmentAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount11
 * InvestmentAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount22
 * InvestmentAccount22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount24
 * InvestmentAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount13
 * InvestmentAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount15
 * InvestmentAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount21
 * InvestmentAccount21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount20
 * InvestmentAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount14
 * InvestmentAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount12
 * InvestmentAccount12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1
 * StatementOfInvestmentFundTransactions1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount25
 * InvestmentAccount25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2
 * StatementOfInvestmentFundTransactions2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount30
 * InvestmentAccount30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount31
 * InvestmentAccount31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount32
 * InvestmentAccount32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount33
 * InvestmentAccount33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38
 * InvestmentAccount38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount37
 * InvestmentAccount37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount39
 * InvestmentAccount39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount40
 * InvestmentAccount40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account15 Account15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account16 Account16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount41
 * InvestmentAccount41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount43
 * InvestmentAccount43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
 * StatementOfInvestmentFundTransactions3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount44
 * InvestmentAccount44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount45
 * InvestmentAccount45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount42
 * InvestmentAccount42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount46
 * InvestmentAccount46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount47
 * InvestmentAccount47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account19 Account19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount49
 * InvestmentAccount49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount54
 * InvestmentAccount54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount51
 * InvestmentAccount51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50
 * InvestmentAccount50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount56
 * InvestmentAccount56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount52
 * InvestmentAccount52}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountType2Choice
 * AccountType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount55
 * InvestmentAccount55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount53
 * InvestmentAccount53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount57
 * InvestmentAccount57}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountUsageType2Choice
 * AccountUsageType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OwnershipType2Choice
 * OwnershipType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61
 * InvestmentAccount61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63
 * InvestmentAccount63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62
 * InvestmentAccount62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount58
 * InvestmentAccount58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount64
 * InvestmentAccount64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount60
 * InvestmentAccount60}</li>
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
 * "InvestmentAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * </ul>
 */
public class InvestmentAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purpose of the account/source fund type. This is typically linked to an
	 * investment product, eg, wrapper, PEP, ISA.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount17#Type
	 * InvestmentAccount17.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#ExtendedType
	 * InvestmentAccount17.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#InvestmentAccountType
	 * CashAccount4.InvestmentAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#ExtendedInvestmentAccountType
	 * CashAccount4.ExtendedInvestmentAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount27#Type
	 * InvestmentAccount27.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#ExtendedType
	 * InvestmentAccount27.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.AccountType1Choice#Code
	 * AccountType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType1Choice#Proprietary
	 * AccountType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice#Code
	 * InvestmentAccountType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice#Proprietary
	 * InvestmentAccountType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#Type
	 * InvestmentAccount18.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#ExtendedType
	 * InvestmentAccount18.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount28#Type
	 * InvestmentAccount28.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#ExtendedType
	 * InvestmentAccount28.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount16#Type
	 * InvestmentAccount16.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#ExtendedType
	 * InvestmentAccount16.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount26#Type
	 * InvestmentAccount26.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#ExtendedType
	 * InvestmentAccount26.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountType1#Structured
	 * CashAccountType1.Structured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount15#Type
	 * InvestmentAccount15.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount20#Type
	 * InvestmentAccount20.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount20#ExtendedType
	 * InvestmentAccount20.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.AccountType2Choice#Code
	 * AccountType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice#Proprietary
	 * AccountType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount60#Type
	 * InvestmentAccount60.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestmentAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.Type, com.tools20022.repository.msg.InvestmentAccount17.ExtendedType, com.tools20022.repository.msg.CashAccount4.InvestmentAccountType,
					com.tools20022.repository.msg.CashAccount4.ExtendedInvestmentAccountType, com.tools20022.repository.msg.InvestmentAccount27.Type, com.tools20022.repository.msg.InvestmentAccount27.ExtendedType,
					com.tools20022.repository.choice.AccountType1Choice.Code, com.tools20022.repository.choice.AccountType1Choice.Proprietary, com.tools20022.repository.choice.InvestmentAccountType1Choice.Code,
					com.tools20022.repository.choice.InvestmentAccountType1Choice.Proprietary, com.tools20022.repository.msg.InvestmentAccount18.Type, com.tools20022.repository.msg.InvestmentAccount18.ExtendedType,
					com.tools20022.repository.msg.InvestmentAccount28.Type, com.tools20022.repository.msg.InvestmentAccount28.ExtendedType, com.tools20022.repository.msg.InvestmentAccount16.Type,
					com.tools20022.repository.msg.InvestmentAccount16.ExtendedType, com.tools20022.repository.msg.InvestmentAccount26.Type, com.tools20022.repository.msg.InvestmentAccount26.ExtendedType,
					com.tools20022.repository.msg.CashAccountType1.Structured, com.tools20022.repository.msg.InvestmentAccount15.Type, com.tools20022.repository.msg.InvestmentAccount20.Type,
					com.tools20022.repository.msg.InvestmentAccount20.ExtendedType, com.tools20022.repository.choice.AccountType2Choice.Code, com.tools20022.repository.choice.AccountType2Choice.Proprietary,
					com.tools20022.repository.msg.InvestmentAccount60.Type);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountType";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FundCashAccountCode.mmObject();
		}
	};
	/**
	 * Ownership status of the account, eg, joint owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#OwnershipType
	 * InvestmentAccount17.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#ExtendedOwnershipType
	 * InvestmentAccount17.ExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#OwnershipType
	 * InvestmentAccount27.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#ExtendedOwnershipType
	 * InvestmentAccount27.ExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType1Choice#Code
	 * OwnershipType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType1Choice#Proprietary
	 * OwnershipType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#OwnershipType
	 * InvestmentAccount35.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#OwnershipType
	 * InvestmentAccount18.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#ExtendedOwnershipType
	 * InvestmentAccount18.ExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#OwnershipType
	 * InvestmentAccount28.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#ExtendedOwnershipType
	 * InvestmentAccount28.ExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#OwnershipType
	 * InvestmentAccount36.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#OwnershipType
	 * InvestmentAccount16.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#ExtendedOwnershipType
	 * InvestmentAccount16.ExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#OwnershipType
	 * InvestmentAccount26.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#ExtendedOwnershipType
	 * InvestmentAccount26.ExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#OwnershipType
	 * InvestmentAccount34.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#OwnershipType
	 * InvestmentAccount38.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#OwnershipType
	 * InvestmentAccount37.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#OwnershipType
	 * InvestmentAccount39.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#OwnershipType
	 * InvestmentAccount46.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#OwnershipType
	 * InvestmentAccount47.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#OwnershipType
	 * InvestmentAccount49.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#OwnershipType
	 * InvestmentAccount51.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#OwnershipType
	 * InvestmentAccount50.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice#Code
	 * OwnershipType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice#Proprietary
	 * OwnershipType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#OwnershipType
	 * InvestmentAccount61.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#OwnershipType
	 * InvestmentAccount63.OwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#OwnershipType
	 * InvestmentAccount62.OwnershipType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ownership status of the account, eg, joint owners."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OwnershipType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.OwnershipType, com.tools20022.repository.msg.InvestmentAccount17.ExtendedOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount27.OwnershipType, com.tools20022.repository.msg.InvestmentAccount27.ExtendedOwnershipType, com.tools20022.repository.choice.OwnershipType1Choice.Code,
					com.tools20022.repository.choice.OwnershipType1Choice.Proprietary, com.tools20022.repository.msg.InvestmentAccount35.OwnershipType, com.tools20022.repository.msg.InvestmentAccount18.OwnershipType,
					com.tools20022.repository.msg.InvestmentAccount18.ExtendedOwnershipType, com.tools20022.repository.msg.InvestmentAccount28.OwnershipType, com.tools20022.repository.msg.InvestmentAccount28.ExtendedOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount36.OwnershipType, com.tools20022.repository.msg.InvestmentAccount16.OwnershipType, com.tools20022.repository.msg.InvestmentAccount16.ExtendedOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount26.OwnershipType, com.tools20022.repository.msg.InvestmentAccount26.ExtendedOwnershipType, com.tools20022.repository.msg.InvestmentAccount34.OwnershipType,
					com.tools20022.repository.msg.InvestmentAccount38.OwnershipType, com.tools20022.repository.msg.InvestmentAccount37.OwnershipType, com.tools20022.repository.msg.InvestmentAccount39.OwnershipType,
					com.tools20022.repository.msg.InvestmentAccount46.OwnershipType, com.tools20022.repository.msg.InvestmentAccount47.OwnershipType, com.tools20022.repository.msg.InvestmentAccount49.OwnershipType,
					com.tools20022.repository.msg.InvestmentAccount51.OwnershipType, com.tools20022.repository.msg.InvestmentAccount50.OwnershipType, com.tools20022.repository.choice.OwnershipType2Choice.Code,
					com.tools20022.repository.choice.OwnershipType2Choice.Proprietary, com.tools20022.repository.msg.InvestmentAccount61.OwnershipType, com.tools20022.repository.msg.InvestmentAccount63.OwnershipType,
					com.tools20022.repository.msg.InvestmentAccount62.OwnershipType);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, eg, joint owners.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountOwnershipTypeCode.mmObject();
		}
	};
	/**
	 * Supplementary registration information applying to a specific block of
	 * units for dealing and reporting purposes. The supplementary registration
	 * information may be used when all the units are registered, for example,
	 * to a funds supermarket, but holdings for each investor have to be
	 * reconciled individually.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#Designation
	 * InvestmentAccount17.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#Designation
	 * InvestmentAccount27.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#Designation
	 * InvestmentAccount35.Designation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account5#Designation
	 * Account5.Designation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account6#Designation
	 * Account6.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#Designation
	 * InvestmentAccount19.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#Designation
	 * InvestmentAccount18.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#Designation
	 * InvestmentAccount29.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#Designation
	 * InvestmentAccount28.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#Designation
	 * InvestmentAccount36.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#Designation
	 * InvestmentAccount16.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#Designation
	 * InvestmentAccount26.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#Designation
	 * InvestmentAccount34.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#AccountDesignation
	 * InvestmentAccount10.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#AccountDesignation
	 * InvestmentAccount11.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#AccountDesignation
	 * InvestmentAccount22.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#AccountDesignation
	 * InvestmentAccount24.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount11#Designation
	 * SecuritiesAccount11.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount15#Designation
	 * SecuritiesAccount15.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#Designation
	 * SafekeepingAccount1.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#Designation
	 * SafekeepingAccount2.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount13#AccountDesignation
	 * InvestmentAccount13.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#AccountDesignation
	 * InvestmentAccount21.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#AccountDesignation
	 * InvestmentAccount14.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount12#Designation
	 * InvestmentAccount12.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount25#Designation
	 * InvestmentAccount25.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount30#Designation
	 * InvestmentAccount30.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#Designation
	 * InvestmentAccount38.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#Designation
	 * InvestmentAccount37.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#Designation
	 * InvestmentAccount39.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#AccountDesignation
	 * InvestmentAccount40.AccountDesignation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account15#Designation
	 * Account15.Designation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account16#Designation
	 * Account16.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#AccountDesignation
	 * InvestmentAccount41.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#Designation
	 * InvestmentAccount43.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#Designation
	 * InvestmentAccount44.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount45#AccountDesignation
	 * InvestmentAccount45.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#Designation
	 * InvestmentAccount46.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#Designation
	 * InvestmentAccount47.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount26#Designation
	 * SecuritiesAccount26.Designation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account19#Designation
	 * Account19.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#Designation
	 * InvestmentAccount49.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#AccountDesignation
	 * InvestmentAccount54.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#Designation
	 * InvestmentAccount51.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#Designation
	 * InvestmentAccount50.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#AccountDesignation
	 * InvestmentAccount56.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#Designation
	 * InvestmentAccount52.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#AccountDesignation
	 * InvestmentAccount55.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#AccountDesignation
	 * InvestmentAccount53.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#AccountDesignation
	 * InvestmentAccount57.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount33#Designation
	 * SecuritiesAccount33.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#Designation
	 * InvestmentAccount61.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#Designation
	 * InvestmentAccount63.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#Designation
	 * InvestmentAccount62.Designation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#AccountDesignation
	 * InvestmentAccount58.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount6#AccountDesignation
	 * SubAccount6.AccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#Designation
	 * InvestmentAccount64.Designation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Designation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Designation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.Designation, com.tools20022.repository.msg.InvestmentAccount27.Designation, com.tools20022.repository.msg.InvestmentAccount35.Designation,
					com.tools20022.repository.msg.Account5.Designation, com.tools20022.repository.msg.Account6.Designation, com.tools20022.repository.msg.InvestmentAccount19.Designation,
					com.tools20022.repository.msg.InvestmentAccount18.Designation, com.tools20022.repository.msg.InvestmentAccount29.Designation, com.tools20022.repository.msg.InvestmentAccount28.Designation,
					com.tools20022.repository.msg.InvestmentAccount36.Designation, com.tools20022.repository.msg.InvestmentAccount16.Designation, com.tools20022.repository.msg.InvestmentAccount26.Designation,
					com.tools20022.repository.msg.InvestmentAccount34.Designation, com.tools20022.repository.msg.InvestmentAccount10.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount11.AccountDesignation,
					com.tools20022.repository.msg.InvestmentAccount22.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount24.AccountDesignation, com.tools20022.repository.msg.SecuritiesAccount11.Designation,
					com.tools20022.repository.msg.SecuritiesAccount15.Designation, com.tools20022.repository.msg.SafekeepingAccount1.Designation, com.tools20022.repository.msg.SafekeepingAccount2.Designation,
					com.tools20022.repository.msg.InvestmentAccount13.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount21.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount14.AccountDesignation,
					com.tools20022.repository.msg.InvestmentAccount12.Designation, com.tools20022.repository.msg.InvestmentAccount25.Designation, com.tools20022.repository.msg.InvestmentAccount30.Designation,
					com.tools20022.repository.msg.InvestmentAccount38.Designation, com.tools20022.repository.msg.InvestmentAccount37.Designation, com.tools20022.repository.msg.InvestmentAccount39.Designation,
					com.tools20022.repository.msg.InvestmentAccount40.AccountDesignation, com.tools20022.repository.msg.Account15.Designation, com.tools20022.repository.msg.Account16.Designation,
					com.tools20022.repository.msg.InvestmentAccount41.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount43.Designation, com.tools20022.repository.msg.InvestmentAccount44.Designation,
					com.tools20022.repository.msg.InvestmentAccount45.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount46.Designation, com.tools20022.repository.msg.InvestmentAccount47.Designation,
					com.tools20022.repository.msg.SecuritiesAccount26.Designation, com.tools20022.repository.msg.Account19.Designation, com.tools20022.repository.msg.InvestmentAccount49.Designation,
					com.tools20022.repository.msg.InvestmentAccount54.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount51.Designation, com.tools20022.repository.msg.InvestmentAccount50.Designation,
					com.tools20022.repository.msg.InvestmentAccount56.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount52.Designation, com.tools20022.repository.msg.InvestmentAccount55.AccountDesignation,
					com.tools20022.repository.msg.InvestmentAccount53.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount57.AccountDesignation, com.tools20022.repository.msg.SecuritiesAccount33.Designation,
					com.tools20022.repository.msg.InvestmentAccount61.Designation, com.tools20022.repository.msg.InvestmentAccount63.Designation, com.tools20022.repository.msg.InvestmentAccount62.Designation,
					com.tools20022.repository.msg.InvestmentAccount58.AccountDesignation, com.tools20022.repository.msg.SubAccount6.AccountDesignation, com.tools20022.repository.msg.InvestmentAccount64.Designation);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Currency chosen for reporting purposes by the account owner in agreement
	 * with the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#ReferenceCurrency
	 * InvestmentAccount17.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#ReferenceCurrency
	 * InvestmentAccount27.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#ReferenceCurrency
	 * InvestmentAccount35.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#ReferenceCurrency
	 * InvestmentAccount18.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#ReferenceCurrency
	 * InvestmentAccount28.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#ReferenceCurrency
	 * InvestmentAccount36.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#ReferenceCurrency
	 * InvestmentAccount16.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#ReferenceCurrency
	 * InvestmentAccount26.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#ReferenceCurrency
	 * InvestmentAccount34.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#ReferenceCurrency
	 * InvestmentAccount38.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#ReferenceCurrency
	 * InvestmentAccount37.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#ReferenceCurrency
	 * InvestmentAccount39.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#ReferenceCurrency
	 * InvestmentAccount46.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#ReferenceCurrency
	 * InvestmentAccount47.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#ReferenceCurrency
	 * InvestmentAccount49.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#ReferenceCurrency
	 * InvestmentAccount51.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#ReferenceCurrency
	 * InvestmentAccount50.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#ReferenceCurrency
	 * InvestmentAccount61.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#ReferenceCurrency
	 * InvestmentAccount63.ReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#ReferenceCurrency
	 * InvestmentAccount62.ReferenceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency chosen for reporting purposes by the account owner in agreement with the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReferenceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount27.ReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount35.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount18.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount28.ReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount36.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount16.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount26.ReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount34.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount38.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount37.ReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount39.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount46.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount47.ReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount49.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount51.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount50.ReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount61.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount63.ReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount62.ReferenceCurrency);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Investment fund classes held in an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentAccount
	 * InvestmentFundClass.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#FinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#FundDetails
	 * InvestmentAccount17.FundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#FundsDetails
	 * InvestmentAccount27.FundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#FundsDetails
	 * InvestmentAccount35.FundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#SecurityDetails
	 * InvestmentAccount19.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#FundDetails
	 * InvestmentAccount18.FundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#SecurityDetails
	 * InvestmentAccount29.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#ModifiedFundDetails
	 * InvestmentAccount28.ModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#ModifiedFundDetails
	 * InvestmentAccount36.ModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#FundDetails
	 * InvestmentAccount16.FundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#FundDetails
	 * InvestmentAccount26.FundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#FundDetails
	 * InvestmentAccount34.FundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#FundsDetails
	 * InvestmentAccount38.FundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#FundDetails
	 * InvestmentAccount37.FundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#ModifiedFundDetails
	 * InvestmentAccount39.ModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#SecurityDetails
	 * InvestmentAccount44.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#FundsDetails
	 * InvestmentAccount46.FundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#ModifiedFundDetails
	 * InvestmentAccount47.ModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#FinancialInstrumentDetails
	 * InvestmentAccount49.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#ModifiedFinancialInstrumentDetails
	 * InvestmentAccount51.ModifiedFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#FinancialInstrumentDetails
	 * InvestmentAccount50.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#SecurityDetails
	 * InvestmentAccount52.SecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#FinancialInstrumentDetails
	 * InvestmentAccount61.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#ModifiedFinancialInstrumentDetails
	 * InvestmentAccount63.ModifiedFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#FinancialInstrumentDetails
	 * InvestmentAccount62.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#SecurityDetails
	 * InvestmentAccount64.SecurityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund classes held in an investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.FinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentAccount17.FundDetails,
					com.tools20022.repository.msg.InvestmentAccount27.FundsDetails, com.tools20022.repository.msg.InvestmentAccount35.FundsDetails, com.tools20022.repository.msg.InvestmentAccount19.SecurityDetails,
					com.tools20022.repository.msg.InvestmentAccount18.FundDetails, com.tools20022.repository.msg.InvestmentAccount29.SecurityDetails, com.tools20022.repository.msg.InvestmentAccount28.ModifiedFundDetails,
					com.tools20022.repository.msg.InvestmentAccount36.ModifiedFundDetails, com.tools20022.repository.msg.InvestmentAccount16.FundDetails, com.tools20022.repository.msg.InvestmentAccount26.FundDetails,
					com.tools20022.repository.msg.InvestmentAccount34.FundDetails, com.tools20022.repository.msg.InvestmentAccount38.FundsDetails, com.tools20022.repository.msg.InvestmentAccount37.FundDetails,
					com.tools20022.repository.msg.InvestmentAccount39.ModifiedFundDetails, com.tools20022.repository.msg.InvestmentAccount44.SecurityDetails, com.tools20022.repository.msg.InvestmentAccount46.FundsDetails,
					com.tools20022.repository.msg.InvestmentAccount47.ModifiedFundDetails, com.tools20022.repository.msg.InvestmentAccount49.FinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount51.ModifiedFinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentAccount50.FinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount52.SecurityDetails, com.tools20022.repository.msg.InvestmentAccount61.FinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount63.ModifiedFinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentAccount62.FinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount64.SecurityDetails);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund classes held in an investment account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Part of the investment account to or from which cash entries are made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvestmentAccount
	 * CashAccount.RelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#CashAccount
	 * InvestmentAccount17.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#CashAccount
	 * InvestmentAccount27.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#CashAccount
	 * InvestmentAccount35.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#CashAccount
	 * PEPISATransfer7.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#CashAccount
	 * PEPISATransfer11.CashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer9#CashAccount
	 * ISATransfer9.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#CashAccountDetails
	 * PaymentInstrument11Choice.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#CashAccountDetails
	 * PaymentInstrument12Choice.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument13Choice#CashAccountDetails
	 * PaymentInstrument13Choice.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice#CashAccountDetails
	 * PaymentInstrument14Choice.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#CashAccount
	 * InvestmentAccount38.CashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer12#CashAccount
	 * ISATransfer12.CashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer19#CashAccount
	 * ISATransfer19.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#CashAccount
	 * InvestmentAccount46.CashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24#CashAccount
	 * ISATransfer24.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#CashAccountDetails
	 * PaymentInstrument21Choice.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#CashAccountDetails
	 * PaymentInstrument20Choice.CashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which cash entries are made."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.CashAccount, com.tools20022.repository.msg.InvestmentAccount27.CashAccount, com.tools20022.repository.msg.InvestmentAccount35.CashAccount,
					com.tools20022.repository.msg.PEPISATransfer7.CashAccount, com.tools20022.repository.msg.PEPISATransfer11.CashAccount, com.tools20022.repository.msg.ISATransfer9.CashAccount,
					com.tools20022.repository.choice.PaymentInstrument11Choice.CashAccountDetails, com.tools20022.repository.choice.PaymentInstrument12Choice.CashAccountDetails,
					com.tools20022.repository.choice.PaymentInstrument13Choice.CashAccountDetails, com.tools20022.repository.choice.PaymentInstrument14Choice.CashAccountDetails,
					com.tools20022.repository.msg.InvestmentAccount38.CashAccount, com.tools20022.repository.msg.ISATransfer12.CashAccount, com.tools20022.repository.msg.ISATransfer19.CashAccount,
					com.tools20022.repository.msg.InvestmentAccount46.CashAccount, com.tools20022.repository.msg.ISATransfer24.CashAccount, com.tools20022.repository.choice.PaymentInstrument21Choice.CashAccountDetails,
					com.tools20022.repository.choice.PaymentInstrument20Choice.CashAccountDetails);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Part of the investment account to or from which cash entries are made.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Part of the investment account to or from which securities entries are
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedInvestmentAccount
	 * SecuritiesAccount.RelatedInvestmentAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#SecuritiesAccount
	 * InvestmentAccount17.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#SecuritiesAccount
	 * InvestmentAccount27.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#SecuritiesAccount
	 * InvestmentAccount35.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount30#Account
	 * InvestmentAccount30.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#SecuritiesAccount
	 * InvestmentAccount38.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#SecuritiesAccount
	 * InvestmentAccount46.SecuritiesAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which securities entries are made."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.SecuritiesAccount, com.tools20022.repository.msg.InvestmentAccount27.SecuritiesAccount,
					com.tools20022.repository.msg.InvestmentAccount35.SecuritiesAccount, com.tools20022.repository.msg.InvestmentAccount30.Account, com.tools20022.repository.msg.InvestmentAccount38.SecuritiesAccount,
					com.tools20022.repository.msg.InvestmentAccount46.SecuritiesAccount);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Part of the investment account to or from which securities entries are made.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Taxes specific to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#InvestmentAccount
	 * InvestmentFundTax.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#TaxExemption
	 * InvestmentAccount35.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#TaxExemption
	 * InvestmentAccount36.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#TaxExemption
	 * InvestmentAccount34.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#TaxExemption
	 * InvestmentAccount38.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#TaxExemption
	 * InvestmentAccount37.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#TaxExemption
	 * InvestmentAccount39.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#TaxExemption
	 * InvestmentAccount46.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#TaxExemption
	 * InvestmentAccount47.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#TaxExemption
	 * InvestmentAccount49.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#TaxExemption
	 * InvestmentAccount51.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#TaxExemption
	 * InvestmentAccount50.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#TaxExemption
	 * InvestmentAccount61.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#TaxExemption
	 * InvestmentAccount63.TaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#TaxExemption
	 * InvestmentAccount62.TaxExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxes specific to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount35.TaxExemption, com.tools20022.repository.msg.InvestmentAccount36.TaxExemption,
					com.tools20022.repository.msg.InvestmentAccount34.TaxExemption, com.tools20022.repository.msg.InvestmentAccount38.TaxExemption, com.tools20022.repository.msg.InvestmentAccount37.TaxExemption,
					com.tools20022.repository.msg.InvestmentAccount39.TaxExemption, com.tools20022.repository.msg.InvestmentAccount46.TaxExemption, com.tools20022.repository.msg.InvestmentAccount47.TaxExemption,
					com.tools20022.repository.msg.InvestmentAccount49.TaxExemption, com.tools20022.repository.msg.InvestmentAccount51.TaxExemption, com.tools20022.repository.msg.InvestmentAccount50.TaxExemption,
					com.tools20022.repository.msg.InvestmentAccount61.TaxExemption, com.tools20022.repository.msg.InvestmentAccount63.TaxExemption, com.tools20022.repository.msg.InvestmentAccount62.TaxExemption);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTax";
			definition = "Taxes specific to the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund transaction which uses the investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentAccount
	 * InvestmentFundTransaction.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification4#TransactionOnSubAccount
	 * SubAccountIdentification4.TransactionOnSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1#TransactionOnAccount
	 * StatementOfInvestmentFundTransactions1.TransactionOnAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6#TransactionOnSubAccount
	 * SubAccountIdentification6.TransactionOnSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#TransactionOnAccount
	 * StatementOfInvestmentFundTransactions2.TransactionOnAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#TransactionOnSubAccount
	 * SubAccountIdentification36.TransactionOnSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#TransactionOnAccount
	 * StatementOfInvestmentFundTransactions3.TransactionOnAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund transaction which uses the investment account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubAccountIdentification4.TransactionOnSubAccount, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1.TransactionOnAccount,
					com.tools20022.repository.msg.SubAccountIdentification6.TransactionOnSubAccount, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.TransactionOnAccount,
					com.tools20022.repository.msg.SubAccountIdentification36.TransactionOnSubAccount, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.TransactionOnAccount);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction which uses the investment account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Separate account containing illiquid assets of a hedge fund portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#InvestmentAccount
	 * SidePocket.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SidePocket
	 * SidePocket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#SidePocketDetails
	 * RedemptionExecution10.SidePocketDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#SidePocketDetails
	 * RedemptionOrder9.SidePocketDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#SidePocketDetails
	 * SubscriptionExecution7.SidePocketDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#SidePocketDetails
	 * SubscriptionOrder9.SidePocketDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate account containing illiquid assets of a hedge fund portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SidePocket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution10.SidePocketDetails, com.tools20022.repository.msg.RedemptionOrder9.SidePocketDetails,
					com.tools20022.repository.msg.SubscriptionExecution7.SidePocketDetails, com.tools20022.repository.msg.SubscriptionOrder9.SidePocketDetails);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocket";
			definition = "Separate account containing illiquid assets of a hedge fund portfolio.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to an investment account and played by a party
	 * in that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#InvestmentAccount
	 * InvestmentAccountPartyRole.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountPartyRole";
			definition = "Specifies each role linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer process for which a debit investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountFrom
	 * PortfolioTransfer.AccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which a debit investment account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DebitPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitPortfolioTransfer";
			definition = "Transfer process for which a debit investment account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.AccountFrom;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer process for which a beneficiary investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountTo
	 * PortfolioTransfer.AccountTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which a beneficiary investment account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CreditPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditPortfolioTransfer";
			definition = "Transfer process for which a beneficiary investment account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.AccountTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Order desk for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#MainFundOrderDeskAccount
	 * FundOrderDesk.MainFundOrderDeskAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundOrderDesk
	 * FundOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountForInvestmentFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order desk for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountForInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountForInvestmentFundProcessing";
			definition = "Order desk for which an account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FundOrderDesk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract defining the related account
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#InvestmentAccount
	 * InvestmentAccountContract.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#LetterIntentReference
	 * SubscriptionOrder3.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#LetterIntentReference
	 * SubscriptionOrder5.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#LetterIntentReference
	 * SubscriptionExecution3.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#LetterIntentReference
	 * SubscriptionExecution5.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#LetterIntentReference
	 * SubscriptionOrder7.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#LetterIntentReference
	 * SubscriptionOrder4.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#LetterIntentReference
	 * SubscriptionOrder6.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#LetterIntentReference
	 * SubscriptionExecution4.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#LetterIntentReference
	 * SubscriptionExecution6.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#LetterIntentReference
	 * SubscriptionOrder8.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#LetterIntentReference
	 * RedemptionExecution10.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#LetterIntentReference
	 * SubscriptionExecution7.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#LetterIntentReference
	 * SubscriptionExecution13.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#LetterIntentReference
	 * SubscriptionExecution12.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#LetterIntentReference
	 * SubscriptionOrder15.LetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#LetterIntentReference
	 * SubscriptionOrder14.LetterIntentReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract defining the related account"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder3.LetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder5.LetterIntentReference,
					com.tools20022.repository.msg.SubscriptionExecution3.LetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution5.LetterIntentReference,
					com.tools20022.repository.msg.SubscriptionOrder7.LetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder4.LetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder6.LetterIntentReference,
					com.tools20022.repository.msg.SubscriptionExecution4.LetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution6.LetterIntentReference,
					com.tools20022.repository.msg.SubscriptionOrder8.LetterIntentReference, com.tools20022.repository.msg.RedemptionExecution10.LetterIntentReference,
					com.tools20022.repository.msg.SubscriptionExecution7.LetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution13.LetterIntentReference,
					com.tools20022.repository.msg.SubscriptionExecution12.LetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder15.LetterIntentReference,
					com.tools20022.repository.msg.SubscriptionOrder14.LetterIntentReference);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract defining the related account";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the account is used for investment or for settlement
	 * purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
	 * AccountUsageTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountUsageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the account is used for investment or for settlement purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccountUsageType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies whether the account is used for investment or for settlement purpose.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountUsageTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the investment account category.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentAccountCategoryCode
	 * InvestmentAccountCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#InvestmentAccountCategory
	 * InvestmentAccount38.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#InvestmentAccountCategory
	 * InvestmentAccount37.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#InvestmentAccountCategory
	 * InvestmentAccount39.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice#Code
	 * InvestmentAccountCategory1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice#Proprietary
	 * InvestmentAccountCategory1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#InvestmentAccountCategory
	 * InvestmentAccount46.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#InvestmentAccountCategory
	 * InvestmentAccount47.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#InvestmentAccountCategory
	 * InvestmentAccount49.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#InvestmentAccountCategory
	 * InvestmentAccount51.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#InvestmentAccountCategory
	 * InvestmentAccount50.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#InvestmentAccountCategory
	 * InvestmentAccount61.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#InvestmentAccountCategory
	 * InvestmentAccount63.InvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#InvestmentAccountCategory
	 * InvestmentAccount62.InvestmentAccountCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the investment account category."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Category = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount38.InvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount37.InvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount39.InvestmentAccountCategory, com.tools20022.repository.choice.InvestmentAccountCategory1Choice.Code,
					com.tools20022.repository.choice.InvestmentAccountCategory1Choice.Proprietary, com.tools20022.repository.msg.InvestmentAccount46.InvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount47.InvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount49.InvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount51.InvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount50.InvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount61.InvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount63.InvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount62.InvestmentAccountCategory);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the investment account category.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestmentAccountCategoryCode.mmObject();
		}
	};
	/**
	 * Portfolio held on an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#Account
	 * Portfolio.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portfolio held on an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio held on an account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer of a portfolio held on a nominee account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#NomineeAccount
	 * PortfolioTransfer.NomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer of a portfolio held on a nominee account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Transfer of a portfolio held on a nominee account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount, com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundTax.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount, com.tools20022.repository.entity.PortfolioTransfer.AccountFrom, com.tools20022.repository.entity.PortfolioTransfer.AccountTo,
						com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount, com.tools20022.repository.entity.Portfolio.Account, com.tools20022.repository.entity.SidePocket.InvestmentAccount,
						com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskAccount);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountUsageType1Choice.Code, com.tools20022.repository.choice.AccountUsageType1Choice.Proprietary,
						com.tools20022.repository.msg.InvestmentAccount35.Type, com.tools20022.repository.msg.InvestmentAccount35.AccountUsageType, com.tools20022.repository.msg.InvestmentAccountSelection1.OtherAccountSelectionData,
						com.tools20022.repository.msg.InvestmentAccountSelection2.OtherAccountSelectionData, com.tools20022.repository.msg.InvestmentAccount36.Type, com.tools20022.repository.msg.InvestmentAccount36.AccountUsageType,
						com.tools20022.repository.msg.InvestmentAccount34.Type, com.tools20022.repository.msg.InvestmentAccount34.AccountUsageType, com.tools20022.repository.msg.TransferIn1.AccountDetails,
						com.tools20022.repository.msg.TransferIn4.AccountDetails, com.tools20022.repository.msg.TransferIn6.AccountDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount1.ReceiverDetails,
						com.tools20022.repository.msg.TransferOut1.AccountDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount4.ReceiverDetails, com.tools20022.repository.msg.TransferOut6.AccountDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount8.ReceiverDetails, com.tools20022.repository.msg.TransferOut8.AccountDetails, com.tools20022.repository.msg.TransferOut10.AccountDetails,
						com.tools20022.repository.msg.TransferIn8.AccountDetails, com.tools20022.repository.msg.TransferIn2.AccountDetails, com.tools20022.repository.msg.TransferIn3.AccountDetails,
						com.tools20022.repository.msg.TransferIn5.AccountDetails, com.tools20022.repository.msg.TransferOut2.AccountDetails, com.tools20022.repository.msg.TransferOut5.AccountDetails,
						com.tools20022.repository.msg.TransferOut7.AccountDetails, com.tools20022.repository.msg.TransferOut9.AccountDetails, com.tools20022.repository.msg.TransferIn7.AccountDetails,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1.InvestmentAccountDetails, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.InvestmentAccountDetails,
						com.tools20022.repository.msg.InvestmentAccount38.Type, com.tools20022.repository.msg.InvestmentAccount38.AccountUsageType, com.tools20022.repository.msg.InvestmentAccount37.Type,
						com.tools20022.repository.msg.InvestmentAccount37.AccountUsageType, com.tools20022.repository.msg.InvestmentAccount39.Type, com.tools20022.repository.msg.InvestmentAccount39.AccountUsageType,
						com.tools20022.repository.msg.TransferIn10.AccountDetails, com.tools20022.repository.msg.TransferIn9.AccountDetails, com.tools20022.repository.msg.TransferOut11.AccountDetails,
						com.tools20022.repository.msg.TransferOut12.AccountDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount9.ReceiverDetails,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.InvestmentAccountDetails, com.tools20022.repository.choice.InvestmentAccountSelection1Choice.OtherAccountSelectionData,
						com.tools20022.repository.msg.InvestmentAccount46.Type, com.tools20022.repository.msg.InvestmentAccount46.AccountUsageType, com.tools20022.repository.msg.InvestmentAccount47.Type,
						com.tools20022.repository.msg.InvestmentAccount47.AccountUsageType, com.tools20022.repository.msg.TransferIn13.AccountDetails, com.tools20022.repository.msg.TransferOut14.AccountDetails,
						com.tools20022.repository.msg.TransferIn12.AccountDetails, com.tools20022.repository.msg.TransferOut15.AccountDetails, com.tools20022.repository.msg.InvestmentAccount49.Type,
						com.tools20022.repository.msg.InvestmentAccount49.AccountUsageType, com.tools20022.repository.msg.InvestmentAccount51.Type, com.tools20022.repository.msg.InvestmentAccount51.AccountUsageType,
						com.tools20022.repository.choice.AccountSelection1Choice.OtherAccountSelectionData, com.tools20022.repository.msg.InvestmentAccount50.Type, com.tools20022.repository.msg.InvestmentAccount50.AccountUsageType,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount13.ReceiverDetails, com.tools20022.repository.msg.TransferOut17.AccountDetails, com.tools20022.repository.msg.TransferIn14.AccountDetails,
						com.tools20022.repository.msg.TransferIn15.AccountDetails, com.tools20022.repository.msg.TransferOut16.AccountDetails, com.tools20022.repository.choice.AccountUsageType2Choice.Code,
						com.tools20022.repository.choice.AccountUsageType2Choice.Proprietary, com.tools20022.repository.msg.InvestmentAccount61.Type, com.tools20022.repository.msg.InvestmentAccount61.AccountUsageType,
						com.tools20022.repository.choice.AccountSelection2Choice.OtherAccountSelectionData, com.tools20022.repository.msg.InvestmentAccount63.Type, com.tools20022.repository.msg.InvestmentAccount63.AccountUsageType,
						com.tools20022.repository.msg.InvestmentAccount62.Type, com.tools20022.repository.msg.InvestmentAccount62.AccountUsageType);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountType, com.tools20022.repository.entity.InvestmentAccount.OwnershipType,
						com.tools20022.repository.entity.InvestmentAccount.Designation, com.tools20022.repository.entity.InvestmentAccount.ReferenceCurrency, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentAccount.CashAccount, com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTax,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.SidePocket,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountPartyRole, com.tools20022.repository.entity.InvestmentAccount.DebitPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.CreditPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.AccountForInvestmentFundProcessing,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccount.AccountUsageType, com.tools20022.repository.entity.InvestmentAccount.Category,
						com.tools20022.repository.entity.InvestmentAccount.Portfolio, com.tools20022.repository.entity.InvestmentAccount.RelatedPortfolioTransfer);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentAccount17.mmObject(), InvestmentAccount27.mmObject(), AccountType1Choice.mmObject(), OwnershipType1Choice.mmObject(), AccountUsageType1Choice.mmObject(),
						InvestmentAccount35.mmObject(), InvestmentAccountType1Choice.mmObject(), Account5.mmObject(), Account6.mmObject(), InvestmentAccount19.mmObject(), InvestmentAccountSelection1.mmObject(),
						InvestmentAccount18.mmObject(), InvestmentAccount29.mmObject(), InvestmentAccountSelection2.mmObject(), InvestmentAccount28.mmObject(), InvestmentAccount36.mmObject(), InvestmentAccount16.mmObject(),
						InvestmentAccount26.mmObject(), InvestmentAccount34.mmObject(), InvestmentAccount10.mmObject(), InvestmentAccount11.mmObject(), InvestmentAccount22.mmObject(), InvestmentAccount24.mmObject(),
						InvestmentAccount13.mmObject(), InvestmentAccount15.mmObject(), InvestmentAccount21.mmObject(), InvestmentAccount20.mmObject(), InvestmentAccount14.mmObject(), InvestmentAccount12.mmObject(),
						StatementOfInvestmentFundTransactions1.mmObject(), InvestmentAccount25.mmObject(), StatementOfInvestmentFundTransactions2.mmObject(), InvestmentAccount30.mmObject(), InvestmentAccount31.mmObject(),
						InvestmentAccount32.mmObject(), InvestmentAccount33.mmObject(), InvestmentAccount38.mmObject(), InvestmentAccount37.mmObject(), InvestmentAccount39.mmObject(), InvestmentAccount40.mmObject(), Account15.mmObject(),
						Account16.mmObject(), InvestmentAccount41.mmObject(), InvestmentAccount43.mmObject(), StatementOfInvestmentFundTransactions3.mmObject(), InvestmentAccount44.mmObject(), InvestmentAccount45.mmObject(),
						InvestmentAccount42.mmObject(), InvestmentAccount46.mmObject(), InvestmentAccount47.mmObject(), Account19.mmObject(), InvestmentAccount49.mmObject(), InvestmentAccount54.mmObject(), InvestmentAccount51.mmObject(),
						InvestmentAccount50.mmObject(), InvestmentAccount56.mmObject(), InvestmentAccount52.mmObject(), AccountType2Choice.mmObject(), InvestmentAccount55.mmObject(), InvestmentAccount53.mmObject(),
						InvestmentAccount57.mmObject(), AccountUsageType2Choice.mmObject(), OwnershipType2Choice.mmObject(), InvestmentAccount61.mmObject(), InvestmentAccount63.mmObject(), InvestmentAccount62.mmObject(),
						InvestmentAccount58.mmObject(), InvestmentAccount64.mmObject(), InvestmentAccount60.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}