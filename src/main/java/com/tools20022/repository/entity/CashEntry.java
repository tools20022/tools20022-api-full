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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ChargeIncludedIndicator;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashEntry" src="doc-files/CashEntry.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
 * CashEntry.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
 * CashEntry.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedBookEntry
 * CashEntry.mmRelatedBookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
 * CashEntry.mmCashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
 * CashEntry.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
 * CashEntry.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
 * CashEntry.mmAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
 * CashEntry.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmDebitRelatedBookEntry
 * CashEntry.mmDebitRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCreditRelatedBookEntry
 * CashEntry.mmCreditRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvoiceFinancingTransaction
 * CashEntry.mmRelatedInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCase
 * CashEntry.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedInvestigationCaseResolution
 * CashEntry.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmChargesIncluded
 * CashEntry.mmChargesIncluded}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCashEntry
 * CashAccount.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
 * CashBalance.mmCashBalanceEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmCashEntry
 * Charges.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
 * BookEntry.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmDebitEntry
 * BookEntry.mmDebitEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCreditEntry
 * BookEntry.mmCreditEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
 * Interest.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashEntry
 * CurrencyExchange.mmCurrencyExchangeForCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashEntry
 * CashAvailability.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingCashEntry
 * PaymentInvestigationCase.mmUnderlyingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmEntryCorrection
 * PaymentInvestigationCaseResolution.mmEntryCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmResultingCashEntry
 * InvoiceFinancingAgreement.mmResultingCashEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmProprietaryAmount
 * AmountAndCurrencyExchange2.mmProprietaryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmAmountDetails
 * EntryTransaction1.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmTransactionDetails
 * ReportEntry1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmProprietaryAmount
 * AmountAndCurrencyExchange3.mmProprietaryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmAmountDetails
 * EntryTransaction2.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails1#mmTransactionDetails
 * EntryDetails1.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#mmEntryDetails
 * ReportEntry2.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmAmountDetails
 * EntryTransaction3.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails2#mmTransactionDetails
 * EntryDetails2.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmEntryDetails
 * ReportEntry3.mmEntryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection35#mmAmount
 * AmountAndDirection35.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmAmountDetails
 * EntryTransaction4.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails3#mmTransactionDetails
 * EntryDetails3.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmEntryDetails
 * ReportEntry4.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAmountDetails
 * NotificationEntry1.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmTransactionDetails
 * NotificationEntry1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmAmountDetails
 * StatementEntry1.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmTransactionDetails
 * StatementEntry1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#mmStatementEntry
 * UnderlyingTransaction1Choice.mmStatementEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#mmStatementEntry
 * UnderlyingTransaction2Choice.mmStatementEntry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmEntryDetails
 * ReportEntry7.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails6#mmTransactionDetails
 * EntryDetails6.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmAmountDetails
 * EntryTransaction7.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmEntryDetails
 * ReportEntry8.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAmountDetails
 * EntryTransaction8.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails7#mmTransactionDetails
 * EntryDetails7.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmStatementEntry
 * UnderlyingTransaction3Choice.mmStatementEntry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmInFlow
 * ConcentrationAccount1.mmInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmOutFlow
 * ConcentrationAccount1.mmOutFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction4Choice#mmStatementEntry
 * UnderlyingTransaction4Choice.mmStatementEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmAmountDetails
 * EntryTransaction9.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails8#mmTransactionDetails
 * EntryDetails8.mmTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9#mmEntryDetails
 * ReportEntry9.mmEntryDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
 * AccountCashEntrySearch2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3
 * CashAccountEntrySearch3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
 * AccountCashEntryDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1 CashEntry1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1
 * AmountAndCurrencyExchangeDetails1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2
 * AmountAndCurrencyExchangeDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
 * AmountAndCurrencyExchange2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1 ReportEntry1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3
 * AmountAndCurrencyExchangeDetails3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4
 * AmountAndCurrencyExchangeDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
 * AmountAndCurrencyExchange3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails1 EntryDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2 ReportEntry2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails2 EntryDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection35
 * AmountAndDirection35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails3 EntryDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1
 * NotificationEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1
 * StatementEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Value Value}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PayInScheduleItems
 * PayInScheduleItems}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PayInFactors1 PayInFactors1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PayInScheduleItems1
 * PayInScheduleItems1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2
 * CorporateActionCashMovements2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionType1
 * TransactionType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry2
 * NotificationEntry2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementResolutionEntry1
 * StatementResolutionEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementResolutionEntry2
 * StatementResolutionEntry2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection34
 * AmountAndDirection34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
 * CashAccountEntrySearch4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7 ReportEntry7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails6 EntryDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8 ReportEntry8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails7 EntryDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection54
 * AmountAndDirection54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection53
 * AmountAndDirection53}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementMethod1Choice
 * SettlementMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection56
 * AmountAndDirection56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection61
 * AmountAndDirection61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Flows1 Flows1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Deposit1 Deposit1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails8 EntryDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionType2
 * TransactionType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9 ReportEntry9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashEntry2 CashEntry2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
 * CashAccountEntrySearch5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementResolutionEntry3
 * StatementResolutionEntry3}</li>
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
 * "CashEntry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account."
 * </li>
 * </ul>
 */
public class CashEntry extends Entry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashEntry
	 * CashAccount.mmCashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmCashAccount
	 * PaymentInstrument7.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmCashAccount
	 * PaymentInstrument6.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#mmCashAccountDetails
	 * PaymentInstrument8.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmCashAccountDetails
	 * PaymentInstrument9.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument16Choice#mmCashAccountDetails
	 * PaymentInstrument16Choice.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmAccountIdentification
	 * CashAccountEntrySearch3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmSafekeepingAccount
	 * EntryTransaction1.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmSafekeepingAccount
	 * EntryTransaction2.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmSafekeepingAccount
	 * EntryTransaction3.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmSafekeepingAccount
	 * EntryTransaction4.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#mmAccountDetails
	 * CorporateActionCashMovements2.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement1#mmAccountDetails
	 * CashMovement1.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement2#mmAccountDetails
	 * CashMovement2.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement3#mmAccountDetails
	 * CashMovement3.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmAccount
	 * NotificationItem3.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification1#mmAccount
	 * OriginalNotification1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmAccount
	 * OriginalItemReference1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#mmAccount
	 * OriginalNotificationReference1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#mmAccount
	 * OriginalNotification2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#mmAccount
	 * OriginalNotificationReference2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmAccount
	 * NotificationItem4.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmAccount
	 * OriginalItemReference2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmAccount
	 * OriginalNotificationReference4.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#mmAccount
	 * OriginalNotificationReference3.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmCashAccount
	 * IntraBalanceCancellation2.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#mmCashAccount
	 * IntraBalanceCancellation1.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmCashAccount
	 * IntraBalanceMovement1.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#mmCashAccount
	 * IntraBalanceMovements1.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmCashAccount
	 * IntraBalanceModification2.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#mmCashAccount
	 * IntraBalanceModification1.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmCashAccount
	 * IntraBalanceQueryCriteria3.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmAccountIdentification
	 * CashAccountEntrySearch4.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmAccount
	 * OriginalNotificationReference6.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmAccount
	 * OriginalItemReference3.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#mmAccount
	 * OriginalNotificationReference5.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmAccount
	 * NotificationItem5.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmSafekeepingAccount
	 * EntryTransaction7.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmAccount
	 * OriginalNotificationReference8.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmAccount
	 * OriginalItemReference4.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmAccount
	 * OriginalNotificationReference7.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmSafekeepingAccount
	 * EntryTransaction8.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmAccount
	 * NotificationItem6.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation3#mmCashAccount
	 * IntraBalanceCancellation3.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement3#mmCashAccount
	 * IntraBalanceMovement3.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmCashAccount
	 * IntraBalanceCancellation4.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmCashAccount
	 * IntraBalanceModification4.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements2#mmCashAccount
	 * IntraBalanceMovements2.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6#mmCashAccount
	 * IntraBalanceQueryCriteria6.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification3#mmCashAccount
	 * IntraBalanceModification3.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmSafekeepingAccount
	 * EntryTransaction9.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmAccountIdentification
	 * CashAccountEntrySearch5.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account on which the amount of the entry is debited or credited. It is derived from the association between Entry and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, List<CashAccount>> mmCashAccount = new MMBusinessAssociationEnd<CashEntry, List<CashAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstrument7.mmCashAccount, PaymentInstrument6.mmCashAccount, PaymentInstrument8.mmCashAccountDetails, PaymentInstrument9.mmCashAccountDetails,
					PaymentInstrument16Choice.mmCashAccountDetails, CashAccountEntrySearch3.mmAccountIdentification, EntryTransaction1.mmSafekeepingAccount, EntryTransaction2.mmSafekeepingAccount, EntryTransaction3.mmSafekeepingAccount,
					EntryTransaction4.mmSafekeepingAccount, CorporateActionCashMovements2.mmAccountDetails, CashMovement1.mmAccountDetails, CashMovement2.mmAccountDetails, CashMovement3.mmAccountDetails, NotificationItem3.mmAccount,
					OriginalNotification1.mmAccount, OriginalItemReference1.mmAccount, OriginalNotificationReference1.mmAccount, OriginalNotification2.mmAccount, OriginalNotificationReference2.mmAccount, NotificationItem4.mmAccount,
					OriginalItemReference2.mmAccount, OriginalNotificationReference4.mmAccount, OriginalNotificationReference3.mmAccount, IntraBalanceCancellation2.mmCashAccount, IntraBalanceCancellation1.mmCashAccount,
					IntraBalanceMovement1.mmCashAccount, IntraBalanceMovements1.mmCashAccount, IntraBalanceModification2.mmCashAccount, IntraBalanceModification1.mmCashAccount, IntraBalanceQueryCriteria3.mmCashAccount,
					CashAccountEntrySearch4.mmAccountIdentification, OriginalNotificationReference6.mmAccount, OriginalItemReference3.mmAccount, OriginalNotificationReference5.mmAccount, NotificationItem5.mmAccount,
					EntryTransaction7.mmSafekeepingAccount, OriginalNotificationReference8.mmAccount, OriginalItemReference4.mmAccount, OriginalNotificationReference7.mmAccount, EntryTransaction8.mmSafekeepingAccount,
					NotificationItem6.mmAccount, IntraBalanceCancellation3.mmCashAccount, IntraBalanceMovement3.mmCashAccount, IntraBalanceCancellation4.mmCashAccount, IntraBalanceModification4.mmCashAccount,
					IntraBalanceMovements2.mmCashAccount, IntraBalanceQueryCriteria6.mmCashAccount, IntraBalanceModification3.mmCashAccount, EntryTransaction9.mmSafekeepingAccount, CashAccountEntrySearch5.mmAccountIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which the amount of the entry is debited or credited. It is derived from the association between Entry and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(CashEntry obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(CashEntry obj, List<CashAccount> value) {
			obj.setCashAccount(value);
		}
	};
	protected CurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmEntryAmount
	 * AccountCashEntrySearch2.mmEntryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmEntryAmount
	 * CashAccountEntrySearch3.mmEntryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryAmount
	 * AccountCashEntryDetails3.mmEntryAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1#mmAmount
	 * CashEntry1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1#mmAmount
	 * AmountAndCurrencyExchangeDetails1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2#mmAmount
	 * AmountAndCurrencyExchangeDetails2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#mmAmount
	 * ReportEntry1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmAmountDetails
	 * ReportEntry1.mmAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#mmAmount
	 * AmountAndCurrencyExchangeDetails3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#mmAmount
	 * AmountAndCurrencyExchangeDetails4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#mmAmount
	 * ReportEntry2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmAmountDetails
	 * ReportEntry2.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3#mmAmount
	 * EntryTransaction3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmAmount
	 * ReportEntry3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmAmountDetails
	 * ReportEntry3.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4#mmAmount
	 * EntryTransaction4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmAmount
	 * ReportEntry4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmAmountDetails
	 * ReportEntry4.mmAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAmount
	 * NotificationEntry1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#mmAmount
	 * StatementEntry1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Value#mmBaseCurrencyItem
	 * Value.mmBaseCurrencyItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData5#mmPayInCallAmount
	 * ReportData5.mmPayInCallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PayInScheduleItems#mmAmount
	 * PayInScheduleItems.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PayInScheduleItems1#mmAmount
	 * PayInScheduleItems1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#mmPostingAmount
	 * CorporateActionCashMovements2.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#mmAmount
	 * NotificationEntry2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#mmCorrectedAmount
	 * StatementResolutionEntry1.mmCorrectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmCorrectedAmount
	 * StatementResolutionEntry2.mmCorrectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection34#mmAmount
	 * AmountAndDirection34.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmSettledAmount
	 * IntraBalance2.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmPreviouslySettledAmount
	 * IntraBalance2.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmRemainingSettlementAmount
	 * IntraBalance2.mmRemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1#mmSettlementAmount
	 * IntraBalance1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmSettledAmount
	 * IntraBalanceMovement2.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmPreviouslySettledAmount
	 * IntraBalanceMovement2.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmRemainingSettlementAmount
	 * IntraBalanceMovement2.mmRemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryAmount
	 * CashAccountEntrySearch4.mmEntryAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmAmount
	 * ReportEntry7.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAmountDetails
	 * ReportEntry7.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmAmount
	 * EntryTransaction7.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmAmount
	 * ReportEntry8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmAmountDetails
	 * ReportEntry8.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAmount
	 * EntryTransaction8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection54#mmAmount
	 * AmountAndDirection54.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection53#mmAmount
	 * AmountAndDirection53.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection56#mmAmount
	 * AmountAndDirection56.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection61#mmAmount
	 * AmountAndDirection61.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance3#mmSettlementAmount
	 * IntraBalance3.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmSettledAmount
	 * IntraBalance4.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmPreviouslySettledAmount
	 * IntraBalance4.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmRemainingSettlementAmount
	 * IntraBalance4.mmRemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmSettledAmount
	 * IntraBalanceMovement4.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmPreviouslySettledAmount
	 * IntraBalanceMovement4.mmPreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmRemainingSettlementAmount
	 * IntraBalanceMovement4.mmRemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DefaultFundRequirement1#mmAmount
	 * DefaultFundRequirement1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Flows1#mmPaymentBankFlows
	 * Flows1.mmPaymentBankFlows}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Flows1#mmInvestmentFlows
	 * Flows1.mmInvestmentFlows}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Deposit1#mmValue
	 * Deposit1.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction9#mmAmount
	 * EntryTransaction9.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9#mmAmount
	 * ReportEntry9.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmAmountDetails
	 * ReportEntry9.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry2#mmAmount
	 * CashEntry2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmEntryAmount
	 * CashAccountEntrySearch5.mmEntryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry3#mmCorrectedAmount
	 * StatementResolutionEntry3.mmCorrectedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money in the cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashEntry, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<CashEntry, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountCashEntrySearch2.mmEntryAmount, CashAccountEntrySearch3.mmEntryAmount, AccountCashEntryDetails3.mmEntryAmount, CashEntry1.mmAmount, AmountAndCurrencyExchangeDetails1.mmAmount,
					AmountAndCurrencyExchangeDetails2.mmAmount, ReportEntry1.mmAmount, ReportEntry1.mmAmountDetails, AmountAndCurrencyExchangeDetails3.mmAmount, AmountAndCurrencyExchangeDetails4.mmAmount, ReportEntry2.mmAmount,
					ReportEntry2.mmAmountDetails, EntryTransaction3.mmAmount, ReportEntry3.mmAmount, ReportEntry3.mmAmountDetails, EntryTransaction4.mmAmount, ReportEntry4.mmAmount, ReportEntry4.mmAmountDetails,
					NotificationEntry1.mmAmount, StatementEntry1.mmAmount, Value.mmBaseCurrencyItem, ReportData5.mmPayInCallAmount, PayInScheduleItems.mmAmount, PayInScheduleItems1.mmAmount, CorporateActionCashMovements2.mmPostingAmount,
					NotificationEntry2.mmAmount, StatementResolutionEntry1.mmCorrectedAmount, StatementResolutionEntry2.mmCorrectedAmount, AmountAndDirection34.mmAmount, IntraBalance2.mmSettledAmount,
					IntraBalance2.mmPreviouslySettledAmount, IntraBalance2.mmRemainingSettlementAmount, IntraBalance1.mmSettlementAmount, IntraBalanceMovement2.mmSettledAmount, IntraBalanceMovement2.mmPreviouslySettledAmount,
					IntraBalanceMovement2.mmRemainingSettlementAmount, CashAccountEntrySearch4.mmEntryAmount, ReportEntry7.mmAmount, ReportEntry7.mmAmountDetails, EntryTransaction7.mmAmount, ReportEntry8.mmAmount,
					ReportEntry8.mmAmountDetails, EntryTransaction8.mmAmount, AmountAndDirection54.mmAmount, AmountAndDirection53.mmAmount, AmountAndDirection56.mmAmount, AmountAndDirection61.mmAmount, IntraBalance3.mmSettlementAmount,
					IntraBalance4.mmSettledAmount, IntraBalance4.mmPreviouslySettledAmount, IntraBalance4.mmRemainingSettlementAmount, IntraBalanceMovement4.mmSettledAmount, IntraBalanceMovement4.mmPreviouslySettledAmount,
					IntraBalanceMovement4.mmRemainingSettlementAmount, DefaultFundRequirement1.mmAmount, Flows1.mmPaymentBankFlows, Flows1.mmInvestmentFlows, Deposit1.mmValue, EntryTransaction9.mmAmount, ReportEntry9.mmAmount,
					ReportEntry9.mmAmountDetails, CashEntry2.mmAmount, CashAccountEntrySearch5.mmEntryAmount, StatementResolutionEntry3.mmCorrectedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashEntry obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(CashEntry obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected BookEntry relatedBookEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
	 * BookEntry.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry for which one or more cash entries are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, Optional<BookEntry>> mmRelatedBookEntry = new MMBusinessAssociationEnd<CashEntry, Optional<BookEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBookEntry";
			definition = "Account entry for which one or more cash entries are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BookEntry.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}

		@Override
		public Optional<BookEntry> getValue(CashEntry obj) {
			return obj.getRelatedBookEntry();
		}

		@Override
		public void setValue(CashEntry obj, Optional<BookEntry> value) {
			obj.setRelatedBookEntry(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.CashBalance> cashBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
	 * CashBalance.mmCashBalanceEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmBalanceFrom
	 * IntraBalance2.mmBalanceFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmBalanceTo
	 * IntraBalance2.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1#mmBalanceFrom
	 * IntraBalance1.mmBalanceFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance1#mmBalanceTo
	 * IntraBalance1.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmBalanceFrom
	 * IntraBalanceMovement2.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmBalanceTo
	 * IntraBalanceMovement2.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1#mmBalanceFrom
	 * IntraBalanceType1.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1#mmBalanceTo
	 * IntraBalanceType1.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance3#mmBalanceFrom
	 * IntraBalance3.mmBalanceFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance3#mmBalanceTo
	 * IntraBalance3.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmBalanceFrom
	 * IntraBalance4.mmBalanceFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance4#mmBalanceTo
	 * IntraBalance4.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmBalanceFrom
	 * IntraBalanceMovement4.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmBalanceTo
	 * IntraBalanceMovement4.mmBalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType2#mmBalanceFrom
	 * IntraBalanceType2.mmBalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType2#mmBalanceTo
	 * IntraBalanceType2.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount that is the result of the sum of the cash entries from or to a cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, List<CashBalance>> mmCashBalance = new MMBusinessAssociationEnd<CashEntry, List<CashBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(IntraBalance2.mmBalanceFrom, IntraBalance2.mmBalanceTo, IntraBalance1.mmBalanceFrom, IntraBalance1.mmBalanceTo, IntraBalanceMovement2.mmBalanceFrom, IntraBalanceMovement2.mmBalanceTo,
					IntraBalanceType1.mmBalanceFrom, IntraBalanceType1.mmBalanceTo, IntraBalance3.mmBalanceFrom, IntraBalance3.mmBalanceTo, IntraBalance4.mmBalanceFrom, IntraBalance4.mmBalanceTo, IntraBalanceMovement4.mmBalanceFrom,
					IntraBalanceMovement4.mmBalanceTo, IntraBalanceType2.mmBalanceFrom, IntraBalanceType2.mmBalanceTo);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash amount that is the result of the sum of the cash entries from or to a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmCashBalanceEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}

		@Override
		public List<CashBalance> getValue(CashEntry obj) {
			return obj.getCashBalance();
		}

		@Override
		public void setValue(CashEntry obj, List<CashBalance> value) {
			obj.setCashBalance(value);
		}
	};
	protected CurrencyExchange currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashEntry
	 * CurrencyExchange.mmCurrencyExchangeForCashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1#mmCurrencyExchange
	 * AmountAndCurrencyExchangeDetails1.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2#mmCurrencyExchange
	 * AmountAndCurrencyExchangeDetails2.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#mmCurrencyExchange
	 * AmountAndCurrencyExchangeDetails3.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#mmCurrencyExchange
	 * AmountAndCurrencyExchangeDetails4.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAmountAndCurrencyExchange1#mmCurrencyExchange
	 * CardAmountAndCurrencyExchange1.mmCurrencyExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry details related to currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, com.tools20022.repository.entity.CurrencyExchange> mmCurrencyExchange = new MMBusinessAssociationEnd<CashEntry, com.tools20022.repository.entity.CurrencyExchange>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndCurrencyExchangeDetails1.mmCurrencyExchange, AmountAndCurrencyExchangeDetails2.mmCurrencyExchange, AmountAndCurrencyExchangeDetails3.mmCurrencyExchange,
					AmountAndCurrencyExchangeDetails4.mmCurrencyExchange, CardAmountAndCurrencyExchange1.mmCurrencyExchange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Entry details related to currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CurrencyExchange getValue(CashEntry obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(CashEntry obj, com.tools20022.repository.entity.CurrencyExchange value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected List<com.tools20022.repository.entity.Charges> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmCashEntry
	 * Charges.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmCharges
	 * EntryTransaction1.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#mmCharges
	 * ReportEntry1.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmCharges
	 * EntryTransaction2.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#mmCharges
	 * ReportEntry2.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmCharges
	 * EntryTransaction3.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmCharges
	 * ReportEntry3.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCharges
	 * EntryTransaction4.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmCharges
	 * ReportEntry4.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmCharges
	 * NotificationEntry1.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#mmCharges
	 * StatementEntry1.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#mmCharges
	 * StatementResolutionEntry1.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmCharges
	 * StatementResolutionEntry2.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmCharges
	 * ReportEntry7.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCharges
	 * EntryTransaction7.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmCharges
	 * ReportEntry8.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCharges
	 * EntryTransaction8.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmCharges
	 * EntryTransaction9.mmCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry9#mmCharges
	 * ReportEntry9.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry3#mmCharges
	 * StatementResolutionEntry3.mmCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges included in the entry amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, List<Charges>> mmCharges = new MMBusinessAssociationEnd<CashEntry, List<Charges>>() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmCharges, ReportEntry1.mmCharges, EntryTransaction2.mmCharges, ReportEntry2.mmCharges, EntryTransaction3.mmCharges, ReportEntry3.mmCharges, EntryTransaction4.mmCharges,
					ReportEntry4.mmCharges, NotificationEntry1.mmCharges, StatementEntry1.mmCharges, StatementResolutionEntry1.mmCharges, StatementResolutionEntry2.mmCharges, ReportEntry7.mmCharges, EntryTransaction7.mmCharges,
					ReportEntry8.mmCharges, EntryTransaction8.mmCharges, EntryTransaction9.mmCharges, ReportEntry9.mmCharges, StatementResolutionEntry3.mmCharges);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}

		@Override
		public List<Charges> getValue(CashEntry obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(CashEntry obj, List<Charges> value) {
			obj.setCharges(value);
		}
	};
	protected CashAvailability availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashEntry
	 * CashAvailability.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmAvailability
	 * EntryTransaction1.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmAvailability
	 * EntryTransaction2.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmAvailability
	 * ReportEntry2.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmAvailability
	 * EntryTransaction3.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmAvailability
	 * ReportEntry3.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmAvailability
	 * EntryTransaction4.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAvailability
	 * NotificationEntry1.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmAvailability
	 * EntryTransaction7.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAvailability
	 * EntryTransaction8.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmAvailability
	 * EntryTransaction9.mmAvailability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Availability information on the entry.\r\nElements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, CashAvailability> mmAvailability = new MMBusinessAssociationEnd<CashEntry, CashAvailability>() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmAvailability, EntryTransaction2.mmAvailability, ReportEntry2.mmAvailability, EntryTransaction3.mmAvailability, ReportEntry3.mmAvailability,
					EntryTransaction4.mmAvailability, NotificationEntry1.mmAvailability, EntryTransaction7.mmAvailability, EntryTransaction8.mmAvailability, EntryTransaction9.mmAvailability);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Availability information on the entry.\r\nElements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAvailability.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAvailability.mmObject();
		}

		@Override
		public CashAvailability getValue(CashEntry obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(CashEntry obj, CashAvailability value) {
			obj.setAvailability(value);
		}
	};
	protected Interest interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
	 * Interest.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest amount included in the entry amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, Optional<Interest>> mmInterest = new MMBusinessAssociationEnd<CashEntry, Optional<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest amount included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}

		@Override
		public Optional<Interest> getValue(CashEntry obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(CashEntry obj, Optional<Interest> value) {
			obj.setInterest(value.orElse(null));
		}
	};
	protected BookEntry debitRelatedBookEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmDebitEntry
	 * BookEntry.mmDebitEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitRelatedBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Book entry which is the source of the cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, Optional<BookEntry>> mmDebitRelatedBookEntry = new MMBusinessAssociationEnd<CashEntry, Optional<BookEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BookEntry.mmDebitEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}

		@Override
		public Optional<BookEntry> getValue(CashEntry obj) {
			return obj.getDebitRelatedBookEntry();
		}

		@Override
		public void setValue(CashEntry obj, Optional<BookEntry> value) {
			obj.setDebitRelatedBookEntry(value.orElse(null));
		}
	};
	protected BookEntry creditRelatedBookEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCreditEntry
	 * BookEntry.mmCreditEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRelatedBookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Book entry which is the source of the cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, Optional<BookEntry>> mmCreditRelatedBookEntry = new MMBusinessAssociationEnd<CashEntry, Optional<BookEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BookEntry.mmCreditEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}

		@Override
		public Optional<BookEntry> getValue(CashEntry obj) {
			return obj.getCreditRelatedBookEntry();
		}

		@Override
		public void setValue(CashEntry obj, Optional<BookEntry> value) {
			obj.setCreditRelatedBookEntry(value.orElse(null));
		}
	};
	protected InvoiceFinancingAgreement relatedInvoiceFinancingTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmResultingCashEntry
	 * InvoiceFinancingAgreement.mmResultingCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoiceFinancingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the invoice financing transaction which originates the entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, Optional<InvoiceFinancingAgreement>> mmRelatedInvoiceFinancingTransaction = new MMBusinessAssociationEnd<CashEntry, Optional<InvoiceFinancingAgreement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingTransaction";
			definition = "Specifies the invoice financing transaction which originates the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InvoiceFinancingAgreement.mmResultingCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
		}

		@Override
		public Optional<InvoiceFinancingAgreement> getValue(CashEntry obj) {
			return obj.getRelatedInvoiceFinancingTransaction();
		}

		@Override
		public void setValue(CashEntry obj, Optional<InvoiceFinancingAgreement> value) {
			obj.setRelatedInvoiceFinancingTransaction(value.orElse(null));
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingCashEntry
	 * PaymentInvestigationCase.mmUnderlyingCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case which is investigating a cash entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, Optional<PaymentInvestigationCase>> mmRelatedInvestigationCase = new MMBusinessAssociationEnd<CashEntry, Optional<PaymentInvestigationCase>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case which is investigating a cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCase.mmUnderlyingCashEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCase> getValue(CashEntry obj) {
			return obj.getRelatedInvestigationCase();
		}

		@Override
		public void setValue(CashEntry obj, Optional<PaymentInvestigationCase> value) {
			obj.setRelatedInvestigationCase(value.orElse(null));
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmEntryCorrection
	 * PaymentInvestigationCaseResolution.mmEntryCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which created a correction resulting in a cash entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashEntry, Optional<PaymentInvestigationCaseResolution>> mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd<CashEntry, Optional<PaymentInvestigationCaseResolution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which created a correction resulting in a cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentInvestigationCaseResolution.mmEntryCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}

		@Override
		public Optional<PaymentInvestigationCaseResolution> getValue(CashEntry obj) {
			return obj.getRelatedInvestigationCaseResolution();
		}

		@Override
		public void setValue(CashEntry obj, Optional<PaymentInvestigationCaseResolution> value) {
			obj.setRelatedInvestigationCaseResolution(value.orElse(null));
		}
	};
	protected ChargeIncludedIndicator chargesIncluded;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ChargeIncludedIndicator
	 * ChargeIncludedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.CashEntry
	 * CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesIncluded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges have already been included in the entry amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashEntry, ChargeIncludedIndicator> mmChargesIncluded = new MMBusinessAttribute<CashEntry, ChargeIncludedIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesIncluded";
			definition = "Indicates whether charges have already been included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeIncludedIndicator.mmObject();
		}

		@Override
		public ChargeIncludedIndicator getValue(CashEntry obj) {
			return obj.getChargesIncluded();
		}

		@Override
		public void setValue(CashEntry obj, ChargeIncludedIndicator value) {
			obj.setChargesIncluded(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashEntry";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashEntry, com.tools20022.repository.entity.CashBalance.mmCashBalanceEntry, com.tools20022.repository.entity.Charges.mmCashEntry,
						BookEntry.mmCashEntry, BookEntry.mmDebitEntry, BookEntry.mmCreditEntry, com.tools20022.repository.entity.Interest.mmCashEntry, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashEntry,
						CashAvailability.mmCashEntry, PaymentInvestigationCase.mmUnderlyingCashEntry, PaymentInvestigationCaseResolution.mmEntryCorrection, InvoiceFinancingAgreement.mmResultingCashEntry);
				derivationElement_lazy = () -> Arrays.asList(AmountAndCurrencyExchange2.mmProprietaryAmount, EntryTransaction1.mmAmountDetails, ReportEntry1.mmTransactionDetails, AmountAndCurrencyExchange3.mmProprietaryAmount,
						EntryTransaction2.mmAmountDetails, EntryDetails1.mmTransactionDetails, ReportEntry2.mmEntryDetails, EntryTransaction3.mmAmountDetails, EntryDetails2.mmTransactionDetails, ReportEntry3.mmEntryDetails,
						AmountAndDirection35.mmAmount, EntryTransaction4.mmAmountDetails, EntryDetails3.mmTransactionDetails, ReportEntry4.mmEntryDetails, NotificationEntry1.mmAmountDetails, NotificationEntry1.mmTransactionDetails,
						StatementEntry1.mmAmountDetails, StatementEntry1.mmTransactionDetails, UnderlyingTransaction1Choice.mmStatementEntry, UnderlyingTransaction2Choice.mmStatementEntry, ReportEntry7.mmEntryDetails,
						EntryDetails6.mmTransactionDetails, EntryTransaction7.mmAmountDetails, ReportEntry8.mmEntryDetails, EntryTransaction8.mmAmountDetails, EntryDetails7.mmTransactionDetails,
						UnderlyingTransaction3Choice.mmStatementEntry, ConcentrationAccount1.mmInFlow, ConcentrationAccount1.mmOutFlow, UnderlyingTransaction4Choice.mmStatementEntry, EntryTransaction9.mmAmountDetails,
						EntryDetails8.mmTransactionDetails, ReportEntry9.mmEntryDetails);
				superType_lazy = () -> Entry.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.mmCashAccount, com.tools20022.repository.entity.CashEntry.mmAmount, com.tools20022.repository.entity.CashEntry.mmRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.mmCashBalance, com.tools20022.repository.entity.CashEntry.mmCurrencyExchange, com.tools20022.repository.entity.CashEntry.mmCharges,
						com.tools20022.repository.entity.CashEntry.mmAvailability, com.tools20022.repository.entity.CashEntry.mmInterest, com.tools20022.repository.entity.CashEntry.mmDebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.mmCreditRelatedBookEntry, com.tools20022.repository.entity.CashEntry.mmRelatedInvoiceFinancingTransaction,
						com.tools20022.repository.entity.CashEntry.mmRelatedInvestigationCase, com.tools20022.repository.entity.CashEntry.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.mmChargesIncluded);
				derivationComponent_lazy = () -> Arrays.asList(AccountCashEntrySearch2.mmObject(), CashAccountEntrySearch3.mmObject(), AccountCashEntryDetails3.mmObject(), CashEntry1.mmObject(),
						AmountAndCurrencyExchangeDetails1.mmObject(), AmountAndCurrencyExchangeDetails2.mmObject(), AmountAndCurrencyExchange2.mmObject(), ReportEntry1.mmObject(), AmountAndCurrencyExchangeDetails3.mmObject(),
						AmountAndCurrencyExchangeDetails4.mmObject(), AmountAndCurrencyExchange3.mmObject(), EntryDetails1.mmObject(), ReportEntry2.mmObject(), EntryDetails2.mmObject(), ReportEntry3.mmObject(),
						AmountAndDirection35.mmObject(), EntryDetails3.mmObject(), ReportEntry4.mmObject(), NotificationEntry1.mmObject(), StatementEntry1.mmObject(), Value.mmObject(), PayInScheduleItems.mmObject(),
						PayInFactors1.mmObject(), PayInScheduleItems1.mmObject(), CorporateActionCashMovements2.mmObject(), TransactionType1.mmObject(), NotificationEntry2.mmObject(), StatementResolutionEntry1.mmObject(),
						StatementResolutionEntry2.mmObject(), AmountAndDirection34.mmObject(), CashAccountEntrySearch4.mmObject(), ReportEntry7.mmObject(), EntryDetails6.mmObject(), ReportEntry8.mmObject(), EntryDetails7.mmObject(),
						AmountAndDirection54.mmObject(), AmountAndDirection53.mmObject(), SettlementMethod1Choice.mmObject(), AmountAndDirection56.mmObject(), AmountAndDirection61.mmObject(), Flows1.mmObject(), Deposit1.mmObject(),
						EntryDetails8.mmObject(), TransactionType2.mmObject(), ReportEntry9.mmObject(), CashEntry2.mmObject(), CashAccountEntrySearch5.mmObject(), StatementResolutionEntry3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashEntry.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public CashEntry setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public CashEntry setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<BookEntry> getRelatedBookEntry() {
		return relatedBookEntry == null ? Optional.empty() : Optional.of(relatedBookEntry);
	}

	public CashEntry setRelatedBookEntry(BookEntry relatedBookEntry) {
		this.relatedBookEntry = relatedBookEntry;
		return this;
	}

	public List<CashBalance> getCashBalance() {
		return cashBalance == null ? cashBalance = new ArrayList<>() : cashBalance;
	}

	public CashEntry setCashBalance(List<com.tools20022.repository.entity.CashBalance> cashBalance) {
		this.cashBalance = Objects.requireNonNull(cashBalance);
		return this;
	}

	public CurrencyExchange getCurrencyExchange() {
		return currencyExchange;
	}

	public CashEntry setCurrencyExchange(com.tools20022.repository.entity.CurrencyExchange currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public List<Charges> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public CashEntry setCharges(List<com.tools20022.repository.entity.Charges> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public CashAvailability getAvailability() {
		return availability;
	}

	public CashEntry setAvailability(CashAvailability availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public Optional<Interest> getInterest() {
		return interest == null ? Optional.empty() : Optional.of(interest);
	}

	public CashEntry setInterest(com.tools20022.repository.entity.Interest interest) {
		this.interest = interest;
		return this;
	}

	public Optional<BookEntry> getDebitRelatedBookEntry() {
		return debitRelatedBookEntry == null ? Optional.empty() : Optional.of(debitRelatedBookEntry);
	}

	public CashEntry setDebitRelatedBookEntry(BookEntry debitRelatedBookEntry) {
		this.debitRelatedBookEntry = debitRelatedBookEntry;
		return this;
	}

	public Optional<BookEntry> getCreditRelatedBookEntry() {
		return creditRelatedBookEntry == null ? Optional.empty() : Optional.of(creditRelatedBookEntry);
	}

	public CashEntry setCreditRelatedBookEntry(BookEntry creditRelatedBookEntry) {
		this.creditRelatedBookEntry = creditRelatedBookEntry;
		return this;
	}

	public Optional<InvoiceFinancingAgreement> getRelatedInvoiceFinancingTransaction() {
		return relatedInvoiceFinancingTransaction == null ? Optional.empty() : Optional.of(relatedInvoiceFinancingTransaction);
	}

	public CashEntry setRelatedInvoiceFinancingTransaction(InvoiceFinancingAgreement relatedInvoiceFinancingTransaction) {
		this.relatedInvoiceFinancingTransaction = relatedInvoiceFinancingTransaction;
		return this;
	}

	public Optional<PaymentInvestigationCase> getRelatedInvestigationCase() {
		return relatedInvestigationCase == null ? Optional.empty() : Optional.of(relatedInvestigationCase);
	}

	public CashEntry setRelatedInvestigationCase(PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
		return this;
	}

	public Optional<PaymentInvestigationCaseResolution> getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution == null ? Optional.empty() : Optional.of(relatedInvestigationCaseResolution);
	}

	public CashEntry setRelatedInvestigationCaseResolution(PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
		return this;
	}

	public ChargeIncludedIndicator getChargesIncluded() {
		return chargesIncluded;
	}

	public CashEntry setChargesIncluded(ChargeIncludedIndicator chargesIncluded) {
		this.chargesIncluded = Objects.requireNonNull(chargesIncluded);
		return this;
	}
}