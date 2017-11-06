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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountType
 * InvestmentAccount.mmInvestmentAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmOwnershipType
 * InvestmentAccount.mmOwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
 * InvestmentAccount.mmDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmReferenceCurrency
 * InvestmentAccount.mmReferenceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
 * InvestmentAccount.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
 * InvestmentAccount.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
 * InvestmentAccount.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
 * InvestmentAccount.mmInvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
 * InvestmentAccount.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSidePocket
 * InvestmentAccount.mmSidePocket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmAccountForInvestmentFundProcessing
 * InvestmentAccount.mmAccountForInvestmentFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
 * InvestmentAccount.mmInvestmentAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmAccountUsageType
 * InvestmentAccount.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCategory
 * InvestmentAccount.mmCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmPortfolio
 * InvestmentAccount.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
 * InvestmentFundClass.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvestmentAccount
 * CashAccount.mmRelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedInvestmentAccount
 * SecuritiesAccount.mmRelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmInvestmentAccount
 * InvestmentAccountContract.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmInvestmentAccount
 * InvestmentAccountPartyRole.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmInvestmentAccount
 * InvestmentFundTax.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
 * InvestmentFundTransaction.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
 * PortfolioTransfer.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountTo
 * PortfolioTransfer.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
 * PortfolioTransfer.mmNomineeAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmAccount
 * Portfolio.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SidePocket#mmInvestmentAccount
 * SidePocket.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#mmMainFundOrderDeskAccount
 * FundOrderDesk.mmMainFundOrderDeskAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType1Choice#mmCode
 * AccountUsageType1Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType1Choice#mmProprietary
 * AccountUsageType1Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmType
 * InvestmentAccount35.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmAccountUsageType
 * InvestmentAccount35.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection1#mmOtherAccountSelectionData
 * InvestmentAccountSelection1.mmOtherAccountSelectionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#mmOtherAccountSelectionData
 * InvestmentAccountSelection2.mmOtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmType
 * InvestmentAccount36.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmAccountUsageType
 * InvestmentAccount36.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmType
 * InvestmentAccount34.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmAccountUsageType
 * InvestmentAccount34.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn1#mmAccountDetails
 * TransferIn1.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn4#mmAccountDetails
 * TransferIn4.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn6#mmAccountDetails
 * TransferIn6.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmReceiverDetails
 * ReceivingPartiesAndAccount1.mmReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut1#mmAccountDetails
 * TransferOut1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4#mmReceiverDetails
 * ReceivingPartiesAndAccount4.mmReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut6#mmAccountDetails
 * TransferOut6.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmReceiverDetails
 * ReceivingPartiesAndAccount8.mmReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut8#mmAccountDetails
 * TransferOut8.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut10#mmAccountDetails
 * TransferOut10.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn8#mmAccountDetails
 * TransferIn8.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn2#mmAccountDetails
 * TransferIn2.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn3#mmAccountDetails
 * TransferIn3.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn5#mmAccountDetails
 * TransferIn5.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut2#mmAccountDetails
 * TransferOut2.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut5#mmAccountDetails
 * TransferOut5.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut7#mmAccountDetails
 * TransferOut7.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut9#mmAccountDetails
 * TransferOut9.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn7#mmAccountDetails
 * TransferIn7.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1#mmInvestmentAccountDetails
 * StatementOfInvestmentFundTransactions1.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmInvestmentAccountDetails
 * StatementOfInvestmentFundTransactions2.mmInvestmentAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmType
 * InvestmentAccount38.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmAccountUsageType
 * InvestmentAccount38.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmType
 * InvestmentAccount37.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmAccountUsageType
 * InvestmentAccount37.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmType
 * InvestmentAccount39.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmAccountUsageType
 * InvestmentAccount39.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn10#mmAccountDetails
 * TransferIn10.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn9#mmAccountDetails
 * TransferIn9.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut11#mmAccountDetails
 * TransferOut11.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut12#mmAccountDetails
 * TransferOut12.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmReceiverDetails
 * ReceivingPartiesAndAccount9.mmReceiverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmInvestmentAccountDetails
 * StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentAccountSelection1Choice#mmOtherAccountSelectionData
 * InvestmentAccountSelection1Choice.mmOtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmType
 * InvestmentAccount46.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmAccountUsageType
 * InvestmentAccount46.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmType
 * InvestmentAccount47.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmAccountUsageType
 * InvestmentAccount47.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn13#mmAccountDetails
 * TransferIn13.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut14#mmAccountDetails
 * TransferOut14.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn12#mmAccountDetails
 * TransferIn12.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut15#mmAccountDetails
 * TransferOut15.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmType
 * InvestmentAccount49.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmAccountUsageType
 * InvestmentAccount49.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmType
 * InvestmentAccount51.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmAccountUsageType
 * InvestmentAccount51.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountSelection1Choice#mmOtherAccountSelectionData
 * AccountSelection1Choice.mmOtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmType
 * InvestmentAccount50.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccountUsageType
 * InvestmentAccount50.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmReceiverDetails
 * ReceivingPartiesAndAccount13.mmReceiverDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut17#mmAccountDetails
 * TransferOut17.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn14#mmAccountDetails
 * TransferIn14.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferIn15#mmAccountDetails
 * TransferIn15.mmAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut16#mmAccountDetails
 * TransferOut16.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice#mmCode
 * AccountUsageType2Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice#mmProprietary
 * AccountUsageType2Choice.mmProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmType
 * InvestmentAccount61.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmAccountUsageType
 * InvestmentAccount61.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountSelection2Choice#mmOtherAccountSelectionData
 * AccountSelection2Choice.mmOtherAccountSelectionData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmType
 * InvestmentAccount63.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountUsageType
 * InvestmentAccount63.mmAccountUsageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmType
 * InvestmentAccount62.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountUsageType
 * InvestmentAccount62.mmAccountUsageType}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected FundCashAccountCode investmentAccountType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmType
	 * InvestmentAccount17.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmExtendedType
	 * InvestmentAccount17.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#mmInvestmentAccountType
	 * CashAccount4.mmInvestmentAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#mmExtendedInvestmentAccountType
	 * CashAccount4.mmExtendedInvestmentAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmType
	 * InvestmentAccount27.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmExtendedType
	 * InvestmentAccount27.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType1Choice#mmCode
	 * AccountType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType1Choice#mmProprietary
	 * AccountType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice#mmCode
	 * InvestmentAccountType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice#mmProprietary
	 * InvestmentAccountType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmType
	 * InvestmentAccount18.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedType
	 * InvestmentAccount18.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmType
	 * InvestmentAccount28.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmExtendedType
	 * InvestmentAccount28.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmType
	 * InvestmentAccount16.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmExtendedType
	 * InvestmentAccount16.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmType
	 * InvestmentAccount26.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmExtendedType
	 * InvestmentAccount26.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountType1#mmStructured
	 * CashAccountType1.mmStructured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount15#mmType
	 * InvestmentAccount15.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount20#mmType
	 * InvestmentAccount20.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount20#mmExtendedType
	 * InvestmentAccount20.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice#mmCode
	 * AccountType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice#mmProprietary
	 * AccountType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount60#mmType
	 * InvestmentAccount60.mmType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInvestmentAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmType, com.tools20022.repository.msg.InvestmentAccount17.mmExtendedType,
					com.tools20022.repository.msg.CashAccount4.mmInvestmentAccountType, com.tools20022.repository.msg.CashAccount4.mmExtendedInvestmentAccountType, com.tools20022.repository.msg.InvestmentAccount27.mmType,
					com.tools20022.repository.msg.InvestmentAccount27.mmExtendedType, com.tools20022.repository.choice.AccountType1Choice.mmCode, com.tools20022.repository.choice.AccountType1Choice.mmProprietary,
					com.tools20022.repository.choice.InvestmentAccountType1Choice.mmCode, com.tools20022.repository.choice.InvestmentAccountType1Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccount18.mmType,
					com.tools20022.repository.msg.InvestmentAccount18.mmExtendedType, com.tools20022.repository.msg.InvestmentAccount28.mmType, com.tools20022.repository.msg.InvestmentAccount28.mmExtendedType,
					com.tools20022.repository.msg.InvestmentAccount16.mmType, com.tools20022.repository.msg.InvestmentAccount16.mmExtendedType, com.tools20022.repository.msg.InvestmentAccount26.mmType,
					com.tools20022.repository.msg.InvestmentAccount26.mmExtendedType, com.tools20022.repository.msg.CashAccountType1.mmStructured, com.tools20022.repository.msg.InvestmentAccount15.mmType,
					com.tools20022.repository.msg.InvestmentAccount20.mmType, com.tools20022.repository.msg.InvestmentAccount20.mmExtendedType, com.tools20022.repository.choice.AccountType2Choice.mmCode,
					com.tools20022.repository.choice.AccountType2Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccount60.mmType);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountType";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundCashAccountCode.mmObject();
		}
	};
	protected AccountOwnershipTypeCode ownershipType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmOwnershipType
	 * InvestmentAccount17.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmExtendedOwnershipType
	 * InvestmentAccount17.mmExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmOwnershipType
	 * InvestmentAccount27.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmExtendedOwnershipType
	 * InvestmentAccount27.mmExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType1Choice#mmCode
	 * OwnershipType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType1Choice#mmProprietary
	 * OwnershipType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmOwnershipType
	 * InvestmentAccount35.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmOwnershipType
	 * InvestmentAccount18.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedOwnershipType
	 * InvestmentAccount18.mmExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmOwnershipType
	 * InvestmentAccount28.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmExtendedOwnershipType
	 * InvestmentAccount28.mmExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmOwnershipType
	 * InvestmentAccount36.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmOwnershipType
	 * InvestmentAccount16.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmExtendedOwnershipType
	 * InvestmentAccount16.mmExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmOwnershipType
	 * InvestmentAccount26.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmExtendedOwnershipType
	 * InvestmentAccount26.mmExtendedOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmOwnershipType
	 * InvestmentAccount34.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmOwnershipType
	 * InvestmentAccount38.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmOwnershipType
	 * InvestmentAccount37.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmOwnershipType
	 * InvestmentAccount39.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmOwnershipType
	 * InvestmentAccount46.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmOwnershipType
	 * InvestmentAccount47.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmOwnershipType
	 * InvestmentAccount49.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmOwnershipType
	 * InvestmentAccount51.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmOwnershipType
	 * InvestmentAccount50.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice#mmCode
	 * OwnershipType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice#mmProprietary
	 * OwnershipType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmOwnershipType
	 * InvestmentAccount61.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmOwnershipType
	 * InvestmentAccount63.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmOwnershipType
	 * InvestmentAccount62.mmOwnershipType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOwnershipType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount17.mmExtendedOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount27.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount27.mmExtendedOwnershipType, com.tools20022.repository.choice.OwnershipType1Choice.mmCode,
					com.tools20022.repository.choice.OwnershipType1Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccount35.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount18.mmOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount18.mmExtendedOwnershipType, com.tools20022.repository.msg.InvestmentAccount28.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount28.mmExtendedOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount36.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount16.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount16.mmExtendedOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount26.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount26.mmExtendedOwnershipType, com.tools20022.repository.msg.InvestmentAccount34.mmOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount38.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount37.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount39.mmOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount46.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount47.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount49.mmOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount51.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount50.mmOwnershipType, com.tools20022.repository.choice.OwnershipType2Choice.mmCode,
					com.tools20022.repository.choice.OwnershipType2Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccount61.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount63.mmOwnershipType,
					com.tools20022.repository.msg.InvestmentAccount62.mmOwnershipType);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, eg, joint owners.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountOwnershipTypeCode.mmObject();
		}
	};
	protected Max70Text designation;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmDesignation
	 * InvestmentAccount17.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmDesignation
	 * InvestmentAccount27.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmDesignation
	 * InvestmentAccount35.mmDesignation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account5#mmDesignation
	 * Account5.mmDesignation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account6#mmDesignation
	 * Account6.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#mmDesignation
	 * InvestmentAccount19.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmDesignation
	 * InvestmentAccount18.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmDesignation
	 * InvestmentAccount29.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmDesignation
	 * InvestmentAccount28.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmDesignation
	 * InvestmentAccount36.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmDesignation
	 * InvestmentAccount16.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmDesignation
	 * InvestmentAccount26.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmDesignation
	 * InvestmentAccount34.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmAccountDesignation
	 * InvestmentAccount10.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmAccountDesignation
	 * InvestmentAccount11.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmAccountDesignation
	 * InvestmentAccount22.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmAccountDesignation
	 * InvestmentAccount24.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount11#mmDesignation
	 * SecuritiesAccount11.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount15#mmDesignation
	 * SecuritiesAccount15.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#mmDesignation
	 * SafekeepingAccount1.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmDesignation
	 * SafekeepingAccount2.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount13#mmAccountDesignation
	 * InvestmentAccount13.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#mmAccountDesignation
	 * InvestmentAccount21.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#mmAccountDesignation
	 * InvestmentAccount14.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount12#mmDesignation
	 * InvestmentAccount12.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount25#mmDesignation
	 * InvestmentAccount25.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount30#mmDesignation
	 * InvestmentAccount30.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmDesignation
	 * InvestmentAccount38.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmDesignation
	 * InvestmentAccount37.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmDesignation
	 * InvestmentAccount39.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmAccountDesignation
	 * InvestmentAccount40.mmAccountDesignation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account15#mmDesignation
	 * Account15.mmDesignation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account16#mmDesignation
	 * Account16.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmAccountDesignation
	 * InvestmentAccount41.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmDesignation
	 * InvestmentAccount43.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmDesignation
	 * InvestmentAccount44.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount45#mmAccountDesignation
	 * InvestmentAccount45.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmDesignation
	 * InvestmentAccount46.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmDesignation
	 * InvestmentAccount47.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmDesignation
	 * SecuritiesAccount26.mmDesignation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account19#mmDesignation
	 * Account19.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmDesignation
	 * InvestmentAccount49.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmAccountDesignation
	 * InvestmentAccount54.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmDesignation
	 * InvestmentAccount51.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmDesignation
	 * InvestmentAccount50.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmAccountDesignation
	 * InvestmentAccount56.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmDesignation
	 * InvestmentAccount52.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountDesignation
	 * InvestmentAccount55.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountDesignation
	 * InvestmentAccount53.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountDesignation
	 * InvestmentAccount57.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount33#mmDesignation
	 * SecuritiesAccount33.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmDesignation
	 * InvestmentAccount61.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmDesignation
	 * InvestmentAccount63.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmDesignation
	 * InvestmentAccount62.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmAccountDesignation
	 * InvestmentAccount58.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount6#mmAccountDesignation
	 * SubAccount6.mmAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmDesignation
	 * InvestmentAccount64.mmDesignation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDesignation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmDesignation, com.tools20022.repository.msg.InvestmentAccount27.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount35.mmDesignation, com.tools20022.repository.msg.Account5.mmDesignation, com.tools20022.repository.msg.Account6.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount19.mmDesignation, com.tools20022.repository.msg.InvestmentAccount18.mmDesignation, com.tools20022.repository.msg.InvestmentAccount29.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount28.mmDesignation, com.tools20022.repository.msg.InvestmentAccount36.mmDesignation, com.tools20022.repository.msg.InvestmentAccount16.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount26.mmDesignation, com.tools20022.repository.msg.InvestmentAccount34.mmDesignation, com.tools20022.repository.msg.InvestmentAccount10.mmAccountDesignation,
					com.tools20022.repository.msg.InvestmentAccount11.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount22.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount24.mmAccountDesignation,
					com.tools20022.repository.msg.SecuritiesAccount11.mmDesignation, com.tools20022.repository.msg.SecuritiesAccount15.mmDesignation, com.tools20022.repository.msg.SafekeepingAccount1.mmDesignation,
					com.tools20022.repository.msg.SafekeepingAccount2.mmDesignation, com.tools20022.repository.msg.InvestmentAccount13.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount21.mmAccountDesignation,
					com.tools20022.repository.msg.InvestmentAccount14.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount12.mmDesignation, com.tools20022.repository.msg.InvestmentAccount25.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount30.mmDesignation, com.tools20022.repository.msg.InvestmentAccount38.mmDesignation, com.tools20022.repository.msg.InvestmentAccount37.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount39.mmDesignation, com.tools20022.repository.msg.InvestmentAccount40.mmAccountDesignation, com.tools20022.repository.msg.Account15.mmDesignation,
					com.tools20022.repository.msg.Account16.mmDesignation, com.tools20022.repository.msg.InvestmentAccount41.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount43.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount44.mmDesignation, com.tools20022.repository.msg.InvestmentAccount45.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount46.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount47.mmDesignation, com.tools20022.repository.msg.SecuritiesAccount26.mmDesignation, com.tools20022.repository.msg.Account19.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount49.mmDesignation, com.tools20022.repository.msg.InvestmentAccount54.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount51.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount50.mmDesignation, com.tools20022.repository.msg.InvestmentAccount56.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount52.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount55.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount53.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount57.mmAccountDesignation,
					com.tools20022.repository.msg.SecuritiesAccount33.mmDesignation, com.tools20022.repository.msg.InvestmentAccount61.mmDesignation, com.tools20022.repository.msg.InvestmentAccount63.mmDesignation,
					com.tools20022.repository.msg.InvestmentAccount62.mmDesignation, com.tools20022.repository.msg.InvestmentAccount58.mmAccountDesignation, com.tools20022.repository.msg.SubAccount6.mmAccountDesignation,
					com.tools20022.repository.msg.InvestmentAccount64.mmDesignation);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CurrencyCode referenceCurrency;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmReferenceCurrency
	 * InvestmentAccount17.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmReferenceCurrency
	 * InvestmentAccount27.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmReferenceCurrency
	 * InvestmentAccount35.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmReferenceCurrency
	 * InvestmentAccount18.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmReferenceCurrency
	 * InvestmentAccount28.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmReferenceCurrency
	 * InvestmentAccount36.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmReferenceCurrency
	 * InvestmentAccount16.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmReferenceCurrency
	 * InvestmentAccount26.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmReferenceCurrency
	 * InvestmentAccount34.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmReferenceCurrency
	 * InvestmentAccount38.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmReferenceCurrency
	 * InvestmentAccount37.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmReferenceCurrency
	 * InvestmentAccount39.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmReferenceCurrency
	 * InvestmentAccount46.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmReferenceCurrency
	 * InvestmentAccount47.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmReferenceCurrency
	 * InvestmentAccount49.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmReferenceCurrency
	 * InvestmentAccount51.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmReferenceCurrency
	 * InvestmentAccount50.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmReferenceCurrency
	 * InvestmentAccount61.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmReferenceCurrency
	 * InvestmentAccount63.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmReferenceCurrency
	 * InvestmentAccount62.mmReferenceCurrency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmReferenceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount27.mmReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount35.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount18.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount28.mmReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount36.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount16.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount26.mmReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount34.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount38.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount37.mmReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount39.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount46.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount47.mmReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount49.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount51.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount50.mmReferenceCurrency,
					com.tools20022.repository.msg.InvestmentAccount61.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount63.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount62.mmReferenceCurrency);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass;
	/**
	 * Investment fund classes held in an investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentAccount
	 * InvestmentFundClass.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmFundDetails
	 * InvestmentAccount17.mmFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmFundsDetails
	 * InvestmentAccount27.mmFundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmFundsDetails
	 * InvestmentAccount35.mmFundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#mmSecurityDetails
	 * InvestmentAccount19.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmFundDetails
	 * InvestmentAccount18.mmFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmSecurityDetails
	 * InvestmentAccount29.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmModifiedFundDetails
	 * InvestmentAccount28.mmModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmModifiedFundDetails
	 * InvestmentAccount36.mmModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmFundDetails
	 * InvestmentAccount16.mmFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmFundDetails
	 * InvestmentAccount26.mmFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmFundDetails
	 * InvestmentAccount34.mmFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmFundsDetails
	 * InvestmentAccount38.mmFundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmFundDetails
	 * InvestmentAccount37.mmFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmModifiedFundDetails
	 * InvestmentAccount39.mmModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmSecurityDetails
	 * InvestmentAccount44.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmFundsDetails
	 * InvestmentAccount46.mmFundsDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmModifiedFundDetails
	 * InvestmentAccount47.mmModifiedFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmFinancialInstrumentDetails
	 * InvestmentAccount49.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmModifiedFinancialInstrumentDetails
	 * InvestmentAccount51.mmModifiedFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmFinancialInstrumentDetails
	 * InvestmentAccount50.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmSecurityDetails
	 * InvestmentAccount52.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmFinancialInstrumentDetails
	 * InvestmentAccount61.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmModifiedFinancialInstrumentDetails
	 * InvestmentAccount63.mmModifiedFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmFinancialInstrumentDetails
	 * InvestmentAccount62.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmSecurityDetails
	 * InvestmentAccount64.mmSecurityDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.mmFinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentAccount17.mmFundDetails,
					com.tools20022.repository.msg.InvestmentAccount27.mmFundsDetails, com.tools20022.repository.msg.InvestmentAccount35.mmFundsDetails, com.tools20022.repository.msg.InvestmentAccount19.mmSecurityDetails,
					com.tools20022.repository.msg.InvestmentAccount18.mmFundDetails, com.tools20022.repository.msg.InvestmentAccount29.mmSecurityDetails, com.tools20022.repository.msg.InvestmentAccount28.mmModifiedFundDetails,
					com.tools20022.repository.msg.InvestmentAccount36.mmModifiedFundDetails, com.tools20022.repository.msg.InvestmentAccount16.mmFundDetails, com.tools20022.repository.msg.InvestmentAccount26.mmFundDetails,
					com.tools20022.repository.msg.InvestmentAccount34.mmFundDetails, com.tools20022.repository.msg.InvestmentAccount38.mmFundsDetails, com.tools20022.repository.msg.InvestmentAccount37.mmFundDetails,
					com.tools20022.repository.msg.InvestmentAccount39.mmModifiedFundDetails, com.tools20022.repository.msg.InvestmentAccount44.mmSecurityDetails, com.tools20022.repository.msg.InvestmentAccount46.mmFundsDetails,
					com.tools20022.repository.msg.InvestmentAccount47.mmModifiedFundDetails, com.tools20022.repository.msg.InvestmentAccount49.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount51.mmModifiedFinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentAccount50.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount52.mmSecurityDetails, com.tools20022.repository.msg.InvestmentAccount61.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount63.mmModifiedFinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentAccount62.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentAccount64.mmSecurityDetails);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund classes held in an investment account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Part of the investment account to or from which cash entries are made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvestmentAccount
	 * CashAccount.mmRelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmCashAccount
	 * InvestmentAccount17.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmCashAccount
	 * InvestmentAccount27.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmCashAccount
	 * InvestmentAccount35.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmCashAccount
	 * PEPISATransfer7.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmCashAccount
	 * PEPISATransfer11.mmCashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer9#mmCashAccount
	 * ISATransfer9.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmCashAccountDetails
	 * PaymentInstrument11Choice.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmCashAccountDetails
	 * PaymentInstrument12Choice.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument13Choice#mmCashAccountDetails
	 * PaymentInstrument13Choice.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice#mmCashAccountDetails
	 * PaymentInstrument14Choice.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmCashAccount
	 * InvestmentAccount38.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmCashAccount
	 * ISATransfer12.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmCashAccount
	 * ISATransfer19.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmCashAccount
	 * InvestmentAccount46.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmCashAccount
	 * ISATransfer24.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmCashAccountDetails
	 * PaymentInstrument21Choice.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmCashAccountDetails
	 * PaymentInstrument20Choice.mmCashAccountDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmCashAccount, com.tools20022.repository.msg.InvestmentAccount27.mmCashAccount,
					com.tools20022.repository.msg.InvestmentAccount35.mmCashAccount, com.tools20022.repository.msg.PEPISATransfer7.mmCashAccount, com.tools20022.repository.msg.PEPISATransfer11.mmCashAccount,
					com.tools20022.repository.msg.ISATransfer9.mmCashAccount, com.tools20022.repository.choice.PaymentInstrument11Choice.mmCashAccountDetails, com.tools20022.repository.choice.PaymentInstrument12Choice.mmCashAccountDetails,
					com.tools20022.repository.choice.PaymentInstrument13Choice.mmCashAccountDetails, com.tools20022.repository.choice.PaymentInstrument14Choice.mmCashAccountDetails,
					com.tools20022.repository.msg.InvestmentAccount38.mmCashAccount, com.tools20022.repository.msg.ISATransfer12.mmCashAccount, com.tools20022.repository.msg.ISATransfer19.mmCashAccount,
					com.tools20022.repository.msg.InvestmentAccount46.mmCashAccount, com.tools20022.repository.msg.ISATransfer24.mmCashAccount, com.tools20022.repository.choice.PaymentInstrument21Choice.mmCashAccountDetails,
					com.tools20022.repository.choice.PaymentInstrument20Choice.mmCashAccountDetails);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Part of the investment account to or from which cash entries are made.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount;
	/**
	 * Part of the investment account to or from which securities entries are
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedInvestmentAccount
	 * SecuritiesAccount.mmRelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmSecuritiesAccount
	 * InvestmentAccount17.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmSecuritiesAccount
	 * InvestmentAccount27.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmSecuritiesAccount
	 * InvestmentAccount35.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount30#mmAccount
	 * InvestmentAccount30.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmSecuritiesAccount
	 * InvestmentAccount38.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmSecuritiesAccount
	 * InvestmentAccount46.mmSecuritiesAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmSecuritiesAccount, com.tools20022.repository.msg.InvestmentAccount27.mmSecuritiesAccount,
					com.tools20022.repository.msg.InvestmentAccount35.mmSecuritiesAccount, com.tools20022.repository.msg.InvestmentAccount30.mmAccount, com.tools20022.repository.msg.InvestmentAccount38.mmSecuritiesAccount,
					com.tools20022.repository.msg.InvestmentAccount46.mmSecuritiesAccount);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Part of the investment account to or from which securities entries are made.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmRelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundTax> investmentFundTax;
	/**
	 * Taxes specific to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmInvestmentAccount
	 * InvestmentFundTax.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmTaxExemption
	 * InvestmentAccount35.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmTaxExemption
	 * InvestmentAccount36.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmTaxExemption
	 * InvestmentAccount34.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmTaxExemption
	 * InvestmentAccount38.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmTaxExemption
	 * InvestmentAccount37.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmTaxExemption
	 * InvestmentAccount39.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmTaxExemption
	 * InvestmentAccount46.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmTaxExemption
	 * InvestmentAccount47.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmTaxExemption
	 * InvestmentAccount49.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmTaxExemption
	 * InvestmentAccount51.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmTaxExemption
	 * InvestmentAccount50.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmTaxExemption
	 * InvestmentAccount61.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTaxExemption
	 * InvestmentAccount63.mmTaxExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTaxExemption
	 * InvestmentAccount62.mmTaxExemption}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount35.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount36.mmTaxExemption,
					com.tools20022.repository.msg.InvestmentAccount34.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount38.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount37.mmTaxExemption,
					com.tools20022.repository.msg.InvestmentAccount39.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount46.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount47.mmTaxExemption,
					com.tools20022.repository.msg.InvestmentAccount49.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount51.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount50.mmTaxExemption,
					com.tools20022.repository.msg.InvestmentAccount61.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount63.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount62.mmTaxExemption);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTax";
			definition = "Taxes specific to the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction;
	/**
	 * Investment fund transaction which uses the investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification4#mmTransactionOnSubAccount
	 * SubAccountIdentification4.mmTransactionOnSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1#mmTransactionOnAccount
	 * StatementOfInvestmentFundTransactions1.mmTransactionOnAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6#mmTransactionOnSubAccount
	 * SubAccountIdentification6.mmTransactionOnSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmTransactionOnAccount
	 * StatementOfInvestmentFundTransactions2.mmTransactionOnAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification36#mmTransactionOnSubAccount
	 * SubAccountIdentification36.mmTransactionOnSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmTransactionOnAccount
	 * StatementOfInvestmentFundTransactions3.mmTransactionOnAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubAccountIdentification4.mmTransactionOnSubAccount, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1.mmTransactionOnAccount,
					com.tools20022.repository.msg.SubAccountIdentification6.mmTransactionOnSubAccount, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmTransactionOnAccount,
					com.tools20022.repository.msg.SubAccountIdentification36.mmTransactionOnSubAccount, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmTransactionOnAccount);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction which uses the investment account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SidePocket> sidePocket;
	/**
	 * Separate account containing illiquid assets of a hedge fund portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#mmInvestmentAccount
	 * SidePocket.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SidePocket
	 * SidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmSidePocketDetails
	 * RedemptionExecution10.mmSidePocketDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmSidePocketDetails
	 * RedemptionOrder9.mmSidePocketDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmSidePocketDetails
	 * SubscriptionExecution7.mmSidePocketDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmSidePocketDetails
	 * SubscriptionOrder9.mmSidePocketDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSidePocket = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution10.mmSidePocketDetails, com.tools20022.repository.msg.RedemptionOrder9.mmSidePocketDetails,
					com.tools20022.repository.msg.SubscriptionExecution7.mmSidePocketDetails, com.tools20022.repository.msg.SubscriptionOrder9.mmSidePocketDetails);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocket";
			definition = "Separate account containing illiquid assets of a hedge fund portfolio.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.mmInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountPartyRole;
	/**
	 * Specifies each role linked to an investment account and played by a party
	 * in that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmInvestmentAccount
	 * InvestmentAccountPartyRole.mmInvestmentAccount}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccountPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountPartyRole";
			definition = "Specifies each role linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
		}
	};
	protected PortfolioTransfer debitPortfolioTransfer;
	/**
	 * Transfer process for which a debit investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
	 * PortfolioTransfer.mmAccountFrom}</li>
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
	public static final MMBusinessAssociationEnd mmDebitPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitPortfolioTransfer";
			definition = "Transfer process for which a debit investment account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmAccountFrom;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};
	protected PortfolioTransfer creditPortfolioTransfer;
	/**
	 * Transfer process for which a beneficiary investment account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountTo
	 * PortfolioTransfer.mmAccountTo}</li>
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
	public static final MMBusinessAssociationEnd mmCreditPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditPortfolioTransfer";
			definition = "Transfer process for which a beneficiary investment account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmAccountTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};
	protected FundOrderDesk accountForInvestmentFundProcessing;
	/**
	 * Order desk for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundOrderDesk#mmMainFundOrderDeskAccount
	 * FundOrderDesk.mmMainFundOrderDeskAccount}</li>
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
	public static final MMBusinessAssociationEnd mmAccountForInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountForInvestmentFundProcessing";
			definition = "Order desk for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.mmMainFundOrderDeskAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.mmObject();
		}
	};
	protected InvestmentAccountContract investmentAccountContract;
	/**
	 * Contract defining the related account
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmInvestmentAccount
	 * InvestmentAccountContract.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract
	 * InvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmLetterIntentReference
	 * SubscriptionOrder3.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmLetterIntentReference
	 * SubscriptionOrder5.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmLetterIntentReference
	 * SubscriptionExecution3.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmLetterIntentReference
	 * SubscriptionExecution5.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmLetterIntentReference
	 * SubscriptionOrder7.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmLetterIntentReference
	 * SubscriptionOrder4.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmLetterIntentReference
	 * SubscriptionOrder6.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmLetterIntentReference
	 * SubscriptionExecution4.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmLetterIntentReference
	 * SubscriptionExecution6.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmLetterIntentReference
	 * SubscriptionOrder8.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmLetterIntentReference
	 * RedemptionExecution10.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmLetterIntentReference
	 * SubscriptionExecution7.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmLetterIntentReference
	 * SubscriptionExecution13.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmLetterIntentReference
	 * SubscriptionExecution12.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmLetterIntentReference
	 * SubscriptionOrder15.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmLetterIntentReference
	 * SubscriptionOrder14.mmLetterIntentReference}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder3.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder5.mmLetterIntentReference,
					com.tools20022.repository.msg.SubscriptionExecution3.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution5.mmLetterIntentReference,
					com.tools20022.repository.msg.SubscriptionOrder7.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder4.mmLetterIntentReference,
					com.tools20022.repository.msg.SubscriptionOrder6.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution4.mmLetterIntentReference,
					com.tools20022.repository.msg.SubscriptionExecution6.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder8.mmLetterIntentReference,
					com.tools20022.repository.msg.RedemptionExecution10.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution7.mmLetterIntentReference,
					com.tools20022.repository.msg.SubscriptionExecution13.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution12.mmLetterIntentReference,
					com.tools20022.repository.msg.SubscriptionOrder15.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder14.mmLetterIntentReference);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract defining the related account";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
		}
	};
	protected AccountUsageTypeCode accountUsageType;
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
	public static final MMBusinessAttribute mmAccountUsageType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies whether the account is used for investment or for settlement purpose.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountUsageTypeCode.mmObject();
		}
	};
	protected InvestmentAccountCategoryCode category;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmInvestmentAccountCategory
	 * InvestmentAccount38.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmInvestmentAccountCategory
	 * InvestmentAccount37.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmInvestmentAccountCategory
	 * InvestmentAccount39.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice#mmCode
	 * InvestmentAccountCategory1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice#mmProprietary
	 * InvestmentAccountCategory1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmInvestmentAccountCategory
	 * InvestmentAccount46.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmInvestmentAccountCategory
	 * InvestmentAccount47.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmInvestmentAccountCategory
	 * InvestmentAccount49.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmInvestmentAccountCategory
	 * InvestmentAccount51.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmInvestmentAccountCategory
	 * InvestmentAccount50.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmInvestmentAccountCategory
	 * InvestmentAccount61.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmInvestmentAccountCategory
	 * InvestmentAccount63.mmInvestmentAccountCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmInvestmentAccountCategory
	 * InvestmentAccount62.mmInvestmentAccountCategory}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount38.mmInvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount37.mmInvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount39.mmInvestmentAccountCategory, com.tools20022.repository.choice.InvestmentAccountCategory1Choice.mmCode,
					com.tools20022.repository.choice.InvestmentAccountCategory1Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccount46.mmInvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount47.mmInvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount49.mmInvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount51.mmInvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount50.mmInvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount61.mmInvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount63.mmInvestmentAccountCategory,
					com.tools20022.repository.msg.InvestmentAccount62.mmInvestmentAccountCategory);
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the investment account category.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentAccountCategoryCode.mmObject();
		}
	};
	protected Portfolio portfolio;
	/**
	 * Portfolio held on an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmAccount
	 * Portfolio.mmAccount}</li>
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
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio held on an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected PortfolioTransfer relatedPortfolioTransfer;
	/**
	 * Transfer of a portfolio held on a nominee account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
	 * PortfolioTransfer.mmNomineeAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Transfer of a portfolio held on a nominee account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmNomineeAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentAccount, com.tools20022.repository.entity.CashAccount.mmRelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedInvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmInvestmentAccount, com.tools20022.repository.entity.InvestmentFundTax.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentAccount, com.tools20022.repository.entity.PortfolioTransfer.mmAccountFrom, com.tools20022.repository.entity.PortfolioTransfer.mmAccountTo,
						com.tools20022.repository.entity.PortfolioTransfer.mmNomineeAccount, com.tools20022.repository.entity.Portfolio.mmAccount, com.tools20022.repository.entity.SidePocket.mmInvestmentAccount,
						com.tools20022.repository.entity.FundOrderDesk.mmMainFundOrderDeskAccount);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountUsageType1Choice.mmCode, com.tools20022.repository.choice.AccountUsageType1Choice.mmProprietary,
						com.tools20022.repository.msg.InvestmentAccount35.mmType, com.tools20022.repository.msg.InvestmentAccount35.mmAccountUsageType, com.tools20022.repository.msg.InvestmentAccountSelection1.mmOtherAccountSelectionData,
						com.tools20022.repository.msg.InvestmentAccountSelection2.mmOtherAccountSelectionData, com.tools20022.repository.msg.InvestmentAccount36.mmType, com.tools20022.repository.msg.InvestmentAccount36.mmAccountUsageType,
						com.tools20022.repository.msg.InvestmentAccount34.mmType, com.tools20022.repository.msg.InvestmentAccount34.mmAccountUsageType, com.tools20022.repository.msg.TransferIn1.mmAccountDetails,
						com.tools20022.repository.msg.TransferIn4.mmAccountDetails, com.tools20022.repository.msg.TransferIn6.mmAccountDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount1.mmReceiverDetails,
						com.tools20022.repository.msg.TransferOut1.mmAccountDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount4.mmReceiverDetails, com.tools20022.repository.msg.TransferOut6.mmAccountDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount8.mmReceiverDetails, com.tools20022.repository.msg.TransferOut8.mmAccountDetails, com.tools20022.repository.msg.TransferOut10.mmAccountDetails,
						com.tools20022.repository.msg.TransferIn8.mmAccountDetails, com.tools20022.repository.msg.TransferIn2.mmAccountDetails, com.tools20022.repository.msg.TransferIn3.mmAccountDetails,
						com.tools20022.repository.msg.TransferIn5.mmAccountDetails, com.tools20022.repository.msg.TransferOut2.mmAccountDetails, com.tools20022.repository.msg.TransferOut5.mmAccountDetails,
						com.tools20022.repository.msg.TransferOut7.mmAccountDetails, com.tools20022.repository.msg.TransferOut9.mmAccountDetails, com.tools20022.repository.msg.TransferIn7.mmAccountDetails,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1.mmInvestmentAccountDetails, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.InvestmentAccount38.mmType, com.tools20022.repository.msg.InvestmentAccount38.mmAccountUsageType, com.tools20022.repository.msg.InvestmentAccount37.mmType,
						com.tools20022.repository.msg.InvestmentAccount37.mmAccountUsageType, com.tools20022.repository.msg.InvestmentAccount39.mmType, com.tools20022.repository.msg.InvestmentAccount39.mmAccountUsageType,
						com.tools20022.repository.msg.TransferIn10.mmAccountDetails, com.tools20022.repository.msg.TransferIn9.mmAccountDetails, com.tools20022.repository.msg.TransferOut11.mmAccountDetails,
						com.tools20022.repository.msg.TransferOut12.mmAccountDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount9.mmReceiverDetails,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails, com.tools20022.repository.choice.InvestmentAccountSelection1Choice.mmOtherAccountSelectionData,
						com.tools20022.repository.msg.InvestmentAccount46.mmType, com.tools20022.repository.msg.InvestmentAccount46.mmAccountUsageType, com.tools20022.repository.msg.InvestmentAccount47.mmType,
						com.tools20022.repository.msg.InvestmentAccount47.mmAccountUsageType, com.tools20022.repository.msg.TransferIn13.mmAccountDetails, com.tools20022.repository.msg.TransferOut14.mmAccountDetails,
						com.tools20022.repository.msg.TransferIn12.mmAccountDetails, com.tools20022.repository.msg.TransferOut15.mmAccountDetails, com.tools20022.repository.msg.InvestmentAccount49.mmType,
						com.tools20022.repository.msg.InvestmentAccount49.mmAccountUsageType, com.tools20022.repository.msg.InvestmentAccount51.mmType, com.tools20022.repository.msg.InvestmentAccount51.mmAccountUsageType,
						com.tools20022.repository.choice.AccountSelection1Choice.mmOtherAccountSelectionData, com.tools20022.repository.msg.InvestmentAccount50.mmType, com.tools20022.repository.msg.InvestmentAccount50.mmAccountUsageType,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount13.mmReceiverDetails, com.tools20022.repository.msg.TransferOut17.mmAccountDetails, com.tools20022.repository.msg.TransferIn14.mmAccountDetails,
						com.tools20022.repository.msg.TransferIn15.mmAccountDetails, com.tools20022.repository.msg.TransferOut16.mmAccountDetails, com.tools20022.repository.choice.AccountUsageType2Choice.mmCode,
						com.tools20022.repository.choice.AccountUsageType2Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccount61.mmType, com.tools20022.repository.msg.InvestmentAccount61.mmAccountUsageType,
						com.tools20022.repository.choice.AccountSelection2Choice.mmOtherAccountSelectionData, com.tools20022.repository.msg.InvestmentAccount63.mmType, com.tools20022.repository.msg.InvestmentAccount63.mmAccountUsageType,
						com.tools20022.repository.msg.InvestmentAccount62.mmType, com.tools20022.repository.msg.InvestmentAccount62.mmAccountUsageType);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountType, com.tools20022.repository.entity.InvestmentAccount.mmOwnershipType,
						com.tools20022.repository.entity.InvestmentAccount.mmDesignation, com.tools20022.repository.entity.InvestmentAccount.mmReferenceCurrency, com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentAccount.mmCashAccount, com.tools20022.repository.entity.InvestmentAccount.mmSecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTax,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.mmSidePocket,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole, com.tools20022.repository.entity.InvestmentAccount.mmDebitPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.mmCreditPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.mmAccountForInvestmentFundProcessing,
						com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccount.mmAccountUsageType, com.tools20022.repository.entity.InvestmentAccount.mmCategory,
						com.tools20022.repository.entity.InvestmentAccount.mmPortfolio, com.tools20022.repository.entity.InvestmentAccount.mmRelatedPortfolioTransfer);
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

	public FundCashAccountCode getInvestmentAccountType() {
		return investmentAccountType;
	}

	public void setInvestmentAccountType(FundCashAccountCode investmentAccountType) {
		this.investmentAccountType = investmentAccountType;
	}

	public AccountOwnershipTypeCode getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(AccountOwnershipTypeCode ownershipType) {
		this.ownershipType = ownershipType;
	}

	public Max70Text getDesignation() {
		return designation;
	}

	public void setDesignation(Max70Text designation) {
		this.designation = designation;
	}

	public CurrencyCode getReferenceCurrency() {
		return referenceCurrency;
	}

	public void setReferenceCurrency(CurrencyCode referenceCurrency) {
		this.referenceCurrency = referenceCurrency;
	}

	public List<InvestmentFundClass> getInvestmentFundClass() {
		return investmentFundClass;
	}

	public void setInvestmentFundClass(List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass) {
		this.investmentFundClass = investmentFundClass;
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount;
	}

	public void setSecuritiesAccount(List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
	}

	public List<InvestmentFundTax> getInvestmentFundTax() {
		return investmentFundTax;
	}

	public void setInvestmentFundTax(List<com.tools20022.repository.entity.InvestmentFundTax> investmentFundTax) {
		this.investmentFundTax = investmentFundTax;
	}

	public List<InvestmentFundTransaction> getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(List<com.tools20022.repository.entity.InvestmentFundTransaction> investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public List<SidePocket> getSidePocket() {
		return sidePocket;
	}

	public void setSidePocket(List<com.tools20022.repository.entity.SidePocket> sidePocket) {
		this.sidePocket = sidePocket;
	}

	public List<InvestmentAccountPartyRole> getInvestmentAccountPartyRole() {
		return investmentAccountPartyRole;
	}

	public void setInvestmentAccountPartyRole(List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountPartyRole) {
		this.investmentAccountPartyRole = investmentAccountPartyRole;
	}

	public PortfolioTransfer getDebitPortfolioTransfer() {
		return debitPortfolioTransfer;
	}

	public void setDebitPortfolioTransfer(com.tools20022.repository.entity.PortfolioTransfer debitPortfolioTransfer) {
		this.debitPortfolioTransfer = debitPortfolioTransfer;
	}

	public PortfolioTransfer getCreditPortfolioTransfer() {
		return creditPortfolioTransfer;
	}

	public void setCreditPortfolioTransfer(com.tools20022.repository.entity.PortfolioTransfer creditPortfolioTransfer) {
		this.creditPortfolioTransfer = creditPortfolioTransfer;
	}

	public FundOrderDesk getAccountForInvestmentFundProcessing() {
		return accountForInvestmentFundProcessing;
	}

	public void setAccountForInvestmentFundProcessing(com.tools20022.repository.entity.FundOrderDesk accountForInvestmentFundProcessing) {
		this.accountForInvestmentFundProcessing = accountForInvestmentFundProcessing;
	}

	public InvestmentAccountContract getInvestmentAccountContract() {
		return investmentAccountContract;
	}

	public void setInvestmentAccountContract(com.tools20022.repository.entity.InvestmentAccountContract investmentAccountContract) {
		this.investmentAccountContract = investmentAccountContract;
	}

	public AccountUsageTypeCode getAccountUsageType() {
		return accountUsageType;
	}

	public void setAccountUsageType(AccountUsageTypeCode accountUsageType) {
		this.accountUsageType = accountUsageType;
	}

	public InvestmentAccountCategoryCode getCategory() {
		return category;
	}

	public void setCategory(InvestmentAccountCategoryCode category) {
		this.category = category;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public PortfolioTransfer getRelatedPortfolioTransfer() {
		return relatedPortfolioTransfer;
	}

	public void setRelatedPortfolioTransfer(com.tools20022.repository.entity.PortfolioTransfer relatedPortfolioTransfer) {
		this.relatedPortfolioTransfer = relatedPortfolioTransfer;
	}
}