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
import com.tools20022.repository.codeset.AccountLevelCode;
import com.tools20022.repository.codeset.CashAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccount" src="doc-files/CashAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashAccountType
 * CashAccount.CashAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvestmentAccount
 * CashAccount.RelatedInvestmentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashEntry
 * CashAccount.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
 * CashAccount.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#PaymentPartyRole
 * CashAccount.PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCreditStandingOrder
 * CashAccount.RelatedCreditStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedDebitStandingOrder
 * CashAccount.RelatedDebitStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountContract
 * CashAccount.CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCorporateActionElection
 * CashAccount.RelatedCorporateActionElection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Charges
 * CashAccount.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Tax
 * CashAccount.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedSettlementInstruction
 * CashAccount.RelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashSettlementPartyRole
 * CashAccount.CashSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#UltimateObligor
 * CashAccount.UltimateObligor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedPaymentCard
 * CashAccount.RelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#SecuritiesPartyRole
 * CashAccount.SecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedInvoiceFinancingPartyRole
 * CashAccount.RelatedInvoiceFinancingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCommercialTrade
 * CashAccount.RelatedCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Level
 * CashAccount.Level}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#SettlementCurrency
 * CashAccount.SettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#ReportedMovements
 * CashAccount.ReportedMovements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#ClosedAccountContract
 * CashAccount.ClosedAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#AccountLink
 * CashAccount.AccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashStandingOrder
 * CashAccount.CashStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Cheque
 * CashAccount.Cheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountService
 * CashAccount.CashAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Payment
 * CashAccount.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Commission
 * CashAccount.Commission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CashAccount
 * InvestmentAccount.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxAccount
 * Tax.TaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Account
 * Commission.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Account
 * Payment.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccount
 * PaymentCard.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashAccount
 * CashEntry.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#CashAccount
 * Cheque.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementAccount
 * CashSettlement.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
 * PaymentPartyRole.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
 * CashBalance.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#CreditAccount
 * StandingOrder.CreditAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#DebitAccount
 * StandingOrder.DebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CashAccount
 * CashStandingOrder.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#CashAccount
 * SecuritiesPartyRole.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargesDebitAccount
 * Charges.ChargesDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
 * CashAccountContract.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#TransferCashAccount
 * CashAccountContract.TransferCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccount
 * CashAccountService.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#CashAccount
 * CashSettlementInstructionPartyRole.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#CashAccount
 * CorporateActionElection.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#ReportedCashAccount
 * AccountReportedMovement.ReportedCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#CashAccount
 * UndertakingUltimateObligor.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#CashAccount
 * InvoiceFinancingPartyRole.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseAccount
 * CommercialTrade.PurchaseAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#CashAccount
 * AccountLink.CashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#SettlementDetails
 * OrderDeskContactDetails.SettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#CashAccountDetails
 * PaymentInstrument17Choice.CashAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError1Choice#Account
 * AccountOrBusinessError1Choice.Account}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountAndEntry1#Account
 * CashAccountAndEntry1.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#CashAccount
 * CorporateActionOption9.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#CashAccount
 * CorporateActionOption18.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#CashAccount
 * CorporateActionOption22.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#CashAccount
 * CorporateActionOption27.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#CashAccount
 * CorporateActionOption26.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#CashAccount
 * CorporateActionOption41.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#CashAccount
 * CorporateActionOption50.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#CashAccount
 * CorporateActionOption29.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Account8Choice#CashAccount
 * Account8Choice.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Account9Choice#CashAccount
 * Account9Choice.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#CashDetails
 * ConfirmationPartyDetails4.CashDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary14#CashDetails
 * Intermediary14.CashDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1#Type
 * CustomerAccount1.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#Type
 * CustomerAccount5.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Type
 * CustomerAccountModification1.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#Type
 * CustomerAccount4.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#RelatedAccount
 * AccountReport9.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#RelatedAccount
 * AccountReport11.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#RelatedAccount
 * AccountReport12.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#RelatedAccount
 * AccountReport16.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement1#RelatedAccount
 * AccountStatement1.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement2#RelatedAccount
 * AccountStatement2.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement3#RelatedAccount
 * AccountStatement3.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#RelatedAccount
 * AccountStatement4.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#InstructingReimbursementAgentAccount
 * SettlementInformation3.InstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#InstructedReimbursementAgentAccount
 * SettlementInformation3.InstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#InstructingReimbursementAgentAccount
 * SettlementInformation1.InstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#InstructedReimbursementAgentAccount
 * SettlementInformation1.InstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#InstructingReimbursementAgentAccount
 * SettlementInformation13.InstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#InstructedReimbursementAgentAccount
 * SettlementInformation13.InstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#InstructingReimbursementAgentAccount
 * SettlementInformation16.InstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#InstructedReimbursementAgentAccount
 * SettlementInformation16.InstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#BeneficiaryInstitutionAccount
 * RequestedModification.BeneficiaryInstitutionAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashProceeds1#AccountDetails
 * CashProceeds1.AccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#CashDistributionDetails
 * CorporateActionStandingInstruction1.CashDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem3#RelatedAccount
 * NotificationItem3.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#RelatedAccount
 * OriginalItemReference1.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#RelatedAccount
 * OriginalNotificationReference1.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#RelatedAccount
 * OriginalNotificationReference2.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation15#InstructingReimbursementAgentAccount
 * SettlementInformation15.InstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation15#InstructedReimbursementAgentAccount
 * SettlementInformation15.InstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem4#RelatedAccount
 * NotificationItem4.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#RelatedAccount
 * OriginalItemReference2.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#RelatedAccount
 * OriginalNotificationReference4.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#RelatedAccount
 * OriginalNotificationReference3.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndParties1#Identification
 * AccountAndParties1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParentCashAccount1#Identification
 * ParentCashAccount1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#CashAccount
 * CashAccountCharacteristics1.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#InstructingReimbursementAgentAccount
 * SettlementInformation6.InstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#InstructedReimbursementAgentAccount
 * SettlementInformation6.InstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#InstructingReimbursementAgentAccount
 * SettlementInformation8.InstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#InstructedReimbursementAgentAccount
 * SettlementInformation8.InstructedReimbursementAgentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4#CashAccount
 * TransferOut4.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member1#Account
 * Member1.Account}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#Type
 * CustomerAccount2.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#Type
 * CustomerAccount3.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#CashAccount
 * CorporateActionOption8.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError2Choice#Account
 * AccountOrBusinessError2Choice.Account}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndParties2#Account
 * AccountAndParties2.Account}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#RelatedAccount
 * AccountReport18.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#RelatedAccount
 * AccountStatement5.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#RelatedAccount
 * OriginalNotificationReference6.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#RelatedAccount
 * OriginalItemReference3.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#RelatedAccount
 * OriginalNotificationReference5.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem5#RelatedAccount
 * NotificationItem5.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement6#RelatedAccount
 * AccountStatement6.RelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#RelatedAccount
 * AccountReport19.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#CashAccount
 * CashAccountCharacteristics2.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParentCashAccount2#Identification
 * ParentCashAccount2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#RelatedAccount
 * OriginalNotificationReference8.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#RelatedAccount
 * OriginalItemReference4.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#RelatedAccount
 * OriginalNotificationReference7.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem6#RelatedAccount
 * NotificationItem6.RelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#CashAccount
 * CorporateActionOption116.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement1#CashAccountDetails
 * CashSettlement1.CashAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement2#CashAccountDetails
 * CashSettlement2.CashAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#CashAccount
 * CorporateActionOption121.CashAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount15 CashAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount14 CashAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount21 CashAccount21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22 CashAccount22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5 CashAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount4 CashAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12 CashAccount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2
 * CashAccountSearchCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3
 * CashAccountSearchCriteria3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4
 * CashAccountSearchCriteria4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountType2
 * CashAccountType2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashAccountType2Choice
 * CashAccountType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5
 * CashAccountSearchCriteria5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7 CashAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16 CashAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24 CashAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount6 CashAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount11 CashAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1
 * CashAccountDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Accounts2 Accounts2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3
 * CashAccountDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Accounts3 Accounts3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails4
 * CashAccountDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Accounts4 Accounts4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23 CashAccount23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError1Choice
 * AccountOrBusinessError1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13 CashAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20 CashAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25 CashAccount25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountAndEntry1
 * CashAccountAndEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Account8Choice
 * Account8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Account9Choice
 * Account9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction1
 * AccountForAction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2
 * AccountForAction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1
 * CustomerAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5
 * CustomerAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PurposeModification1
 * PurposeModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccountModification1
 * CustomerAccountModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4
 * CustomerAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount28 CashAccount28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27 CashAccount27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountType1
 * CashAccountType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3 CashAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount19 CashAccount19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount18 CashAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount17 CashAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndParties1
 * AccountAndParties1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1
 * ParentCashAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
 * CashAccountCharacteristics1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount10 CashAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount8 CashAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
 * CustomerAccountReturnCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2
 * CustomerAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3
 * CustomerAccount3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError2Choice
 * AccountOrBusinessError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount29 CashAccount29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1 CardAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5 CardAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2 CardAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
 * CashAccountCharacteristics2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2
 * ParentCashAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount34 CashAccount34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount32 CashAccount32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9 CardAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8 CardAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13 CardAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7 CardAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12 CardAccount12}</li>
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
 * "CashAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * </ul>
 */
public class CashAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the nature, or use, of the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#AccountTypeDescription
	 * CashAccount22.AccountTypeDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#Type
	 * CashAccount5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#Type
	 * CashAccount12.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#ExtendedType
	 * CashAccount12.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#Type
	 * CashAccountSearchCriteria2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#Type
	 * CashAccountSearchCriteria3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#Type
	 * CashAccountSearchCriteria4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountType2#Code
	 * CashAccountType2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountType2#Proprietary
	 * CashAccountType2.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice#Code
	 * CashAccountType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice#Proprietary
	 * CashAccountType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#Type
	 * CashAccountSearchCriteria5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7#Type
	 * CashAccount7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16#Type
	 * CashAccount16.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#Type
	 * CashAccount24.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationDetails#Type
	 * AccountIdentificationDetails.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification1#AccountType
	 * StandingOrderIdentification1.AccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1#Type
	 * CashAccountDetails1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3#Type
	 * CashAccountDetails3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails4#Type
	 * CashAccountDetails4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23#Type
	 * CashAccount23.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#AccountType
	 * AccountCashEntryDetails3.AccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13#Type
	 * CashAccount13.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20#Type
	 * CashAccount20.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#Type
	 * CashAccount25.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#Type
	 * CashAccount27.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3#Type
	 * CashAccount3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#CashAccountPurpose
	 * CashAccount33.CashAccountPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount22.AccountTypeDescription, com.tools20022.repository.msg.CashAccount5.Type, com.tools20022.repository.msg.CashAccount12.Type,
					com.tools20022.repository.msg.CashAccount12.ExtendedType, com.tools20022.repository.msg.CashAccountSearchCriteria2.Type, com.tools20022.repository.msg.CashAccountSearchCriteria3.Type,
					com.tools20022.repository.msg.CashAccountSearchCriteria4.Type, com.tools20022.repository.msg.CashAccountType2.Code, com.tools20022.repository.msg.CashAccountType2.Proprietary,
					com.tools20022.repository.choice.CashAccountType2Choice.Code, com.tools20022.repository.choice.CashAccountType2Choice.Proprietary, com.tools20022.repository.msg.CashAccountSearchCriteria5.Type,
					com.tools20022.repository.msg.CashAccount7.Type, com.tools20022.repository.msg.CashAccount16.Type, com.tools20022.repository.msg.CashAccount24.Type, com.tools20022.repository.msg.AccountIdentificationDetails.Type,
					com.tools20022.repository.msg.StandingOrderIdentification1.AccountType, com.tools20022.repository.msg.CashAccountDetails1.Type, com.tools20022.repository.msg.CashAccountDetails3.Type,
					com.tools20022.repository.msg.CashAccountDetails4.Type, com.tools20022.repository.msg.CashAccount23.Type, com.tools20022.repository.msg.AccountCashEntryDetails3.AccountType,
					com.tools20022.repository.msg.CashAccount13.Type, com.tools20022.repository.msg.CashAccount20.Type, com.tools20022.repository.msg.CashAccount25.Type, com.tools20022.repository.msg.CashAccount27.Type,
					com.tools20022.repository.msg.CashAccount3.Type, com.tools20022.repository.msg.CashAccount33.CashAccountPurpose);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountType";
			definition = "Specifies the nature, or use, of the cash account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CashAccountTypeCode.mmObject();
		}
	};
	/**
	 * Investment account for which a cash branch is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CashAccount
	 * InvestmentAccount.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#InvestmentAccountType
	 * CashAccount26.InvestmentAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#InvestmentAccountType
	 * CashAccount33.InvestmentAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account for which a cash branch is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount26.InvestmentAccountType, com.tools20022.repository.msg.CashAccount33.InvestmentAccountType);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account for which a cash branch is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record of the cash movements into or out of a cash account. It is derived
	 * from the association between Account and Entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CashAccount
	 * CashEntry.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountAndEntry1#Entry
	 * CashAccountAndEntry1.Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#RequestedTransactionType
	 * ReportingRequest1.RequestedTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest2#RequestedTransactionType
	 * ReportingRequest2.RequestedTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#RequestedTransactionType
	 * ReportingRequest3.RequestedTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Record of the cash movements into or out of a cash account. It is derived from the association between Account and Entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountAndEntry1.Entry, com.tools20022.repository.msg.ReportingRequest1.RequestedTransactionType,
					com.tools20022.repository.msg.ReportingRequest2.RequestedTransactionType, com.tools20022.repository.msg.ReportingRequest3.RequestedTransactionType);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Record of the cash movements into or out of a cash account. It is derived from the association between Account and Entry.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time. It is derived from the association between
	 * Account and Balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
	 * CashBalance.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#Balance
	 * CashAccountSearchCriteria2.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#Balance
	 * CashAccountSearchCriteria3.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#Balance
	 * CashAccountSearchCriteria4.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#Balance
	 * CashAccountSearchCriteria5.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails1#BilateralBalance
	 * BilateralLimitDetails1.BilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#MultilateralBalance
	 * CashAccountDetails1.MultilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails2#BilateralBalance
	 * BilateralLimitDetails2.BilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#MultilateralBalance
	 * CashAccountDetails3.MultilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#BilateralBalance
	 * BilateralLimitDetails3.BilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails4#MultilateralBalance
	 * CashAccountDetails4.MultilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit1#BilateralBalance
	 * BilateralLimit1.BilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#MultilateralBalance
	 * CashAccount23.MultilateralBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#Balance
	 * BillingStatement1.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#BalanceAdjustment
	 * BillingStatement1.BalanceAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Balance
	 * BillingStatement2.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#BalanceAdjustment
	 * BillingStatement2.BalanceAdjustment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall position representing the net debits and credits in an account at a specific point in time. It is derived from the association between Account and Balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountSearchCriteria2.Balance, com.tools20022.repository.msg.CashAccountSearchCriteria3.Balance,
					com.tools20022.repository.msg.CashAccountSearchCriteria4.Balance, com.tools20022.repository.msg.CashAccountSearchCriteria5.Balance, com.tools20022.repository.msg.BilateralLimitDetails1.BilateralBalance,
					com.tools20022.repository.msg.CashAccountDetails1.MultilateralBalance, com.tools20022.repository.msg.BilateralLimitDetails2.BilateralBalance, com.tools20022.repository.msg.CashAccountDetails3.MultilateralBalance,
					com.tools20022.repository.msg.BilateralLimitDetails3.BilateralBalance, com.tools20022.repository.msg.CashAccountDetails4.MultilateralBalance, com.tools20022.repository.msg.BilateralLimit1.BilateralBalance,
					com.tools20022.repository.msg.CashAccount23.MultilateralBalance, com.tools20022.repository.msg.BillingStatement1.Balance, com.tools20022.repository.msg.BillingStatement1.BalanceAdjustment,
					com.tools20022.repository.msg.BillingStatement2.Balance, com.tools20022.repository.msg.BillingStatement2.BalanceAdjustment);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment and using a specific cash account
	 * in the payment context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#CashAccount
	 * PaymentPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment and using a specific cash account in the payment context. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPartyRole";
			definition = "Specifies each role linked to a payment and using a specific cash account in the payment context. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#CreditAccount
	 * StandingOrder.CreditAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCreditStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCreditStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCreditStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.CreditAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#DebitAccount
	 * StandingOrder.DebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDebitStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> StandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.DebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which manages the account. It is derived from the relation
	 * between AccountContract and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#CashAccount
	 * CashAccountContract.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Accounts2#AccountReport
	 * Accounts2.AccountReport}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Accounts3#AccountReport
	 * Accounts3.AccountReport}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Accounts4#AccountReport
	 * Accounts4.AccountReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which manages the account. It is derived from the relation between AccountContract and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountContract = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Accounts2.AccountReport, com.tools20022.repository.msg.Accounts3.AccountReport, com.tools20022.repository.msg.Accounts4.AccountReport);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Contract which manages the account. It is derived from the relation between AccountContract and Account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Election process which uses specific cash accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#CashAccount
	 * CorporateActionElection.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which uses specific cash accounts."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionElection";
			definition = "Election process which uses specific cash accounts.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionElection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the charges which are debited from the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#ChargesDebitAccount
	 * Charges.ChargesDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the charges which are debited from the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges which are debited from the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.ChargesDebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax charged on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#TaxAccount
	 * Tax.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#Tax
	 * CashAccountCharacteristics1.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#Tax
	 * CashAccountCharacteristics2.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax charged on a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.Tax, com.tools20022.repository.msg.CashAccountCharacteristics2.Tax);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax charged on a cash account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Settlement process which uses specific cash accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#SettlementAccount
	 * CashSettlement.SettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#SettlementInstructionReason
	 * CashAccount33.SettlementInstructionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement process which uses specific cash accounts."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount33.SettlementInstructionReason);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Settlement process which uses specific cash accounts.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment settlement and using a specific
	 * cash account in the payment context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#CashAccount
	 * CashSettlementInstructionPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment settlement and using a specific cash account in the payment context. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashSettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementPartyRole";
			definition = "Specifies each role linked to a payment settlement and using a specific cash account in the payment context. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which different types of cash accounts are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#CashAccount
	 * UndertakingUltimateObligor.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor
	 * UndertakingUltimateObligor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateObligor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which different types of cash accounts are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UltimateObligor = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UltimateObligor";
			definition = "Party for which different types of cash accounts are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UndertakingUltimateObligor.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingUltimateObligor.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment card for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#RelatedAccount
	 * PaymentCard.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which an account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.RelatedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role which uses a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#CashAccount
	 * SecuritiesPartyRole.CashAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role which uses a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a cash account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role using a specific account in the context of invoice
	 * financing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#CashAccount
	 * InvoiceFinancingPartyRole.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoiceFinancingPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role using a specific account in the context of invoice financing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvoiceFinancingPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingPartyRole";
			definition = "Specifies each role using a specific account in the context of invoice financing.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvoiceFinancingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Commercial trade for which a purchase account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseAccount
	 * CommercialTrade.PurchaseAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commercial trade for which a purchase account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCommercialTrade";
			definition = "Commercial trade for which a purchase account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PurchaseAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the level of an account within the account hierarchy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode
	 * AccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1#Level
	 * ParentCashAccount1.Level}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#AccountLevel
	 * CashAccountCharacteristics1.AccountLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountLevel
	 * CashAccountCharacteristics2.AccountLevel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2#Level
	 * ParentCashAccount2.Level}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the level of an account within the account hierarchy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Level = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ParentCashAccount1.Level, com.tools20022.repository.msg.CashAccountCharacteristics1.AccountLevel,
					com.tools20022.repository.msg.CashAccountCharacteristics2.AccountLevel, com.tools20022.repository.msg.ParentCashAccount2.Level);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Level";
			definition = "Defines the level of an account within the account hierarchy.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountLevelCode.mmObject();
		}
	};
	/**
	 * Specifies the currency used for settlement, if different from the account
	 * currency.
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#SettlementCurrencyCode
	 * CashAccountCharacteristics1.SettlementCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#SettlementCurrencyCode
	 * CashAccountCharacteristics2.SettlementCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency used for settlement, if different from the account currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.SettlementCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics2.SettlementCurrencyCode);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency used for settlement, if different from the account currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Provides statistical information on the number of movements and their
	 * value for a particular account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#ReportedCashAccount
	 * AccountReportedMovement.ReportedCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedMovements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides statistical information on the number of movements and their value for a particular account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportedMovements = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedMovements";
			definition = "Provides statistical information on the number of movements and their value for a particular account.";
			minOccurs = 0;
			type_lazy = () -> AccountReportedMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which specifies the cash account to/from which the balance of a
	 * closed account must be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#TransferCashAccount
	 * CashAccountContract.TransferCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which specifies the cash account to/from which the balance of a closed account must be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClosedAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosedAccountContract";
			definition = "Contract which specifies the cash account to/from which the balance of a closed account must be transferred.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.TransferCashAccount;
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
	 * {@linkplain com.tools20022.repository.entity.AccountLink#CashAccount
	 * AccountLink.CashAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
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
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing order which applies on a specific account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CashAccount
	 * CashStandingOrder.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#StandingOrder
	 * CashAccountDetails3.StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails4#StandingOrder
	 * CashAccountDetails4.StandingOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order which applies on a specific account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashStandingOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountDetails3.StandingOrder, com.tools20022.repository.msg.CashAccountDetails4.StandingOrder);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashStandingOrder";
			definition = "Standing order which applies on a specific account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cheques drawn on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#CashAccount
	 * Cheque.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Cheque Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheques drawn on a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Cheque = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Cheques drawn on a cash account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Services linked to the cash account and specified in the cash account
	 * contract. It is derived from the association between Account and
	 * AccountService.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccount
	 * CashAccountService.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to the cash account and specified in the cash account contract. It is derived from the association between Account and AccountService."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountService";
			definition = "Services linked to the cash account and specified in the cash account contract. It is derived from the association between Account and AccountService.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Payment#Account
	 * Payment.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which an account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money due to a party as compensation for a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#Account
	 * Commission.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FeeAndTax1#CommercialAgreementReference
	 * FeeAndTax1.CommercialAgreementReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FeeAndTax1.CommercialAgreementReference);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccount";
				definition = "Account to or from which a cash entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.CashAccount, com.tools20022.repository.entity.Tax.TaxAccount, com.tools20022.repository.entity.Commission.Account,
						com.tools20022.repository.entity.Payment.Account, com.tools20022.repository.entity.PaymentCard.RelatedAccount, com.tools20022.repository.entity.CashEntry.CashAccount,
						com.tools20022.repository.entity.Cheque.CashAccount, com.tools20022.repository.entity.CashSettlement.SettlementAccount, com.tools20022.repository.entity.PaymentPartyRole.CashAccount,
						com.tools20022.repository.entity.CashBalance.CashAccount, com.tools20022.repository.entity.StandingOrder.CreditAccount, com.tools20022.repository.entity.StandingOrder.DebitAccount,
						com.tools20022.repository.entity.CashStandingOrder.CashAccount, com.tools20022.repository.entity.SecuritiesPartyRole.CashAccount, com.tools20022.repository.entity.Charges.ChargesDebitAccount,
						com.tools20022.repository.entity.CashAccountContract.CashAccount, com.tools20022.repository.entity.CashAccountContract.TransferCashAccount, com.tools20022.repository.entity.CashAccountService.CashAccount,
						com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount, com.tools20022.repository.entity.CorporateActionElection.CashAccount,
						com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount, com.tools20022.repository.entity.UndertakingUltimateObligor.CashAccount,
						com.tools20022.repository.entity.InvoiceFinancingPartyRole.CashAccount, com.tools20022.repository.entity.CommercialTrade.PurchaseAccount, com.tools20022.repository.entity.AccountLink.CashAccount);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderDeskContactDetails.SettlementDetails, com.tools20022.repository.choice.PaymentInstrument17Choice.CashAccountDetails,
						com.tools20022.repository.choice.AccountOrBusinessError1Choice.Account, com.tools20022.repository.msg.CashAccountAndEntry1.Account, com.tools20022.repository.msg.CorporateActionOption9.CashAccount,
						com.tools20022.repository.msg.CorporateActionOption18.CashAccount, com.tools20022.repository.msg.CorporateActionOption22.CashAccount, com.tools20022.repository.msg.CorporateActionOption27.CashAccount,
						com.tools20022.repository.msg.CorporateActionOption26.CashAccount, com.tools20022.repository.msg.CorporateActionOption41.CashAccount, com.tools20022.repository.msg.CorporateActionOption50.CashAccount,
						com.tools20022.repository.msg.CorporateActionOption29.CashAccount, com.tools20022.repository.choice.Account8Choice.CashAccount, com.tools20022.repository.choice.Account9Choice.CashAccount,
						com.tools20022.repository.msg.ConfirmationPartyDetails4.CashDetails, com.tools20022.repository.msg.Intermediary14.CashDetails, com.tools20022.repository.msg.CustomerAccount1.Type,
						com.tools20022.repository.msg.CustomerAccount5.Type, com.tools20022.repository.msg.CustomerAccountModification1.Type, com.tools20022.repository.msg.CustomerAccount4.Type,
						com.tools20022.repository.msg.AccountReport9.RelatedAccount, com.tools20022.repository.msg.AccountReport11.RelatedAccount, com.tools20022.repository.msg.AccountReport12.RelatedAccount,
						com.tools20022.repository.msg.AccountReport16.RelatedAccount, com.tools20022.repository.msg.AccountStatement1.RelatedAccount, com.tools20022.repository.msg.AccountStatement2.RelatedAccount,
						com.tools20022.repository.msg.AccountStatement3.RelatedAccount, com.tools20022.repository.msg.AccountStatement4.RelatedAccount,
						com.tools20022.repository.msg.SettlementInformation3.InstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation3.InstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation1.InstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation1.InstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation13.InstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation13.InstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation16.InstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation16.InstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.RequestedModification.BeneficiaryInstitutionAccount, com.tools20022.repository.msg.CashProceeds1.AccountDetails,
						com.tools20022.repository.msg.CorporateActionStandingInstruction1.CashDistributionDetails, com.tools20022.repository.msg.NotificationItem3.RelatedAccount,
						com.tools20022.repository.msg.OriginalItemReference1.RelatedAccount, com.tools20022.repository.msg.OriginalNotificationReference1.RelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference2.RelatedAccount, com.tools20022.repository.msg.SettlementInformation15.InstructingReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation15.InstructedReimbursementAgentAccount, com.tools20022.repository.msg.NotificationItem4.RelatedAccount,
						com.tools20022.repository.msg.OriginalItemReference2.RelatedAccount, com.tools20022.repository.msg.OriginalNotificationReference4.RelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference3.RelatedAccount, com.tools20022.repository.msg.AccountAndParties1.Identification, com.tools20022.repository.msg.ParentCashAccount1.Identification,
						com.tools20022.repository.msg.CashAccountCharacteristics1.CashAccount, com.tools20022.repository.msg.SettlementInformation6.InstructingReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation6.InstructedReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation8.InstructingReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation8.InstructedReimbursementAgentAccount, com.tools20022.repository.msg.TransferOut4.CashAccount, com.tools20022.repository.msg.Member1.Account,
						com.tools20022.repository.msg.CustomerAccount2.Type, com.tools20022.repository.msg.CustomerAccount3.Type, com.tools20022.repository.msg.CorporateActionOption8.CashAccount,
						com.tools20022.repository.choice.AccountOrBusinessError2Choice.Account, com.tools20022.repository.msg.AccountAndParties2.Account, com.tools20022.repository.msg.AccountReport18.RelatedAccount,
						com.tools20022.repository.msg.AccountStatement5.RelatedAccount, com.tools20022.repository.msg.OriginalNotificationReference6.RelatedAccount, com.tools20022.repository.msg.OriginalItemReference3.RelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference5.RelatedAccount, com.tools20022.repository.msg.NotificationItem5.RelatedAccount, com.tools20022.repository.msg.AccountStatement6.RelatedAccount,
						com.tools20022.repository.msg.AccountReport19.RelatedAccount, com.tools20022.repository.msg.CashAccountCharacteristics2.CashAccount, com.tools20022.repository.msg.ParentCashAccount2.Identification,
						com.tools20022.repository.msg.OriginalNotificationReference8.RelatedAccount, com.tools20022.repository.msg.OriginalItemReference4.RelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference7.RelatedAccount, com.tools20022.repository.msg.NotificationItem6.RelatedAccount, com.tools20022.repository.msg.CorporateActionOption116.CashAccount,
						com.tools20022.repository.msg.CashSettlement1.CashAccountDetails, com.tools20022.repository.msg.CashSettlement2.CashAccountDetails, com.tools20022.repository.msg.CorporateActionOption121.CashAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashAccountType, com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount, com.tools20022.repository.entity.CashAccount.CashEntry,
						com.tools20022.repository.entity.CashAccount.CashBalance, com.tools20022.repository.entity.CashAccount.PaymentPartyRole, com.tools20022.repository.entity.CashAccount.RelatedCreditStandingOrder,
						com.tools20022.repository.entity.CashAccount.RelatedDebitStandingOrder, com.tools20022.repository.entity.CashAccount.CashAccountContract, com.tools20022.repository.entity.CashAccount.RelatedCorporateActionElection,
						com.tools20022.repository.entity.CashAccount.Charges, com.tools20022.repository.entity.CashAccount.Tax, com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction,
						com.tools20022.repository.entity.CashAccount.CashSettlementPartyRole, com.tools20022.repository.entity.CashAccount.UltimateObligor, com.tools20022.repository.entity.CashAccount.RelatedPaymentCard,
						com.tools20022.repository.entity.CashAccount.SecuritiesPartyRole, com.tools20022.repository.entity.CashAccount.RelatedInvoiceFinancingPartyRole, com.tools20022.repository.entity.CashAccount.RelatedCommercialTrade,
						com.tools20022.repository.entity.CashAccount.Level, com.tools20022.repository.entity.CashAccount.SettlementCurrency, com.tools20022.repository.entity.CashAccount.ReportedMovements,
						com.tools20022.repository.entity.CashAccount.ClosedAccountContract, com.tools20022.repository.entity.CashAccount.AccountLink, com.tools20022.repository.entity.CashAccount.CashStandingOrder,
						com.tools20022.repository.entity.CashAccount.Cheque, com.tools20022.repository.entity.CashAccount.CashAccountService, com.tools20022.repository.entity.CashAccount.Payment,
						com.tools20022.repository.entity.CashAccount.Commission);
				derivationComponent_lazy = () -> Arrays.asList(CashAccount15.mmObject(), CashAccount14.mmObject(), CashAccount21.mmObject(), CashAccount22.mmObject(), CashAccount5.mmObject(), CashAccount4.mmObject(),
						CashAccount12.mmObject(), CashAccount26.mmObject(), CashAccountSearchCriteria2.mmObject(), CashAccountSearchCriteria3.mmObject(), CashAccountSearchCriteria4.mmObject(), CashAccountType2.mmObject(),
						CashAccountType2Choice.mmObject(), CashAccountSearchCriteria5.mmObject(), CashAccount7.mmObject(), CashAccount16.mmObject(), CashAccount24.mmObject(), CashAccount6.mmObject(), CashAccount11.mmObject(),
						CashAccountDetails1.mmObject(), Accounts2.mmObject(), CashAccountDetails3.mmObject(), Accounts3.mmObject(), CashAccountDetails4.mmObject(), Accounts4.mmObject(), CashAccount23.mmObject(),
						AccountOrBusinessError1Choice.mmObject(), CashAccount13.mmObject(), CashAccount20.mmObject(), CashAccount25.mmObject(), CashAccountAndEntry1.mmObject(), Account8Choice.mmObject(), Account9Choice.mmObject(),
						AccountForAction1.mmObject(), AccountForAction2.mmObject(), CustomerAccount1.mmObject(), CustomerAccount5.mmObject(), PurposeModification1.mmObject(), CustomerAccountModification1.mmObject(),
						CustomerAccount4.mmObject(), CashAccount28.mmObject(), CashAccount27.mmObject(), CashAccountType1.mmObject(), CashAccount3.mmObject(), CashAccount19.mmObject(), CashAccount18.mmObject(), CashAccount17.mmObject(),
						AccountAndParties1.mmObject(), ParentCashAccount1.mmObject(), CashAccountCharacteristics1.mmObject(), CashAccount10.mmObject(), CashAccount8.mmObject(), CustomerAccountReturnCriteria1.mmObject(),
						CustomerAccount2.mmObject(), CustomerAccount3.mmObject(), AccountOrBusinessError2Choice.mmObject(), CashAccount29.mmObject(), CardAccount3.mmObject(), CardAccount1.mmObject(), CardAccount6.mmObject(),
						CardAccount4.mmObject(), CardAccount5.mmObject(), CardAccount2.mmObject(), CashAccountCharacteristics2.mmObject(), ParentCashAccount2.mmObject(), CashAccount34.mmObject(), CashAccount32.mmObject(),
						CashAccount33.mmObject(), CardAccount10.mmObject(), CardAccount9.mmObject(), CardAccount8.mmObject(), CardAccount11.mmObject(), CardAccount13.mmObject(), CardAccount7.mmObject(), CardAccount12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}