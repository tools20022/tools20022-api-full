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
import com.tools20022.repository.datatype.ChargeIncludedIndicator;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashAccount
 * CashEntry.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Amount
 * CashEntry.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#RelatedBookEntry
 * CashEntry.RelatedBookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashBalance
 * CashEntry.CashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CurrencyExchange
 * CashEntry.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Charges
 * CashEntry.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Availability
 * CashEntry.Availability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Interest
 * CashEntry.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#DebitRelatedBookEntry
 * CashEntry.DebitRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#CreditRelatedBookEntry
 * CashEntry.CreditRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvoiceFinancingTransaction
 * CashEntry.RelatedInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCase
 * CashEntry.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedInvestigationCaseResolution
 * CashEntry.RelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#ChargesIncluded
 * CashEntry.ChargesIncluded}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashEntry
 * CashAccount.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#CashBalanceEntry
 * CashBalance.CashBalanceEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#CashEntry
 * Charges.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#CashEntry
 * BookEntry.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#DebitEntry
 * BookEntry.DebitEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#CreditEntry
 * BookEntry.CreditEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#CashEntry
 * Interest.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashEntry
 * CurrencyExchange.CurrencyExchangeForCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAvailability#CashEntry
 * CashAvailability.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingCashEntry
 * PaymentInvestigationCase.UnderlyingCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#EntryCorrection
 * PaymentInvestigationCaseResolution.EntryCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#ResultingCashEntry
 * InvoiceFinancingAgreement.ResultingCashEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#ProprietaryAmount
 * AmountAndCurrencyExchange2.ProprietaryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#AmountDetails
 * EntryTransaction1.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry1#TransactionDetails
 * ReportEntry1.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#ProprietaryAmount
 * AmountAndCurrencyExchange3.ProprietaryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#AmountDetails
 * EntryTransaction2.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails1#TransactionDetails
 * EntryDetails1.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#EntryDetails
 * ReportEntry2.EntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#AmountDetails
 * EntryTransaction3.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails2#TransactionDetails
 * EntryDetails2.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#EntryDetails
 * ReportEntry3.EntryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection35#Amount
 * AmountAndDirection35.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#AmountDetails
 * EntryTransaction4.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails3#TransactionDetails
 * EntryDetails3.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#EntryDetails
 * ReportEntry4.EntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#AmountDetails
 * NotificationEntry1.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#TransactionDetails
 * NotificationEntry1.TransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#AmountDetails
 * StatementEntry1.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementEntry1#TransactionDetails
 * StatementEntry1.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#StatementEntry
 * UnderlyingTransaction1Choice.StatementEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#StatementEntry
 * UnderlyingTransaction2Choice.StatementEntry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#EntryDetails
 * ReportEntry7.EntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails6#TransactionDetails
 * EntryDetails6.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#AmountDetails
 * EntryTransaction7.AmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#EntryDetails
 * ReportEntry8.EntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#AmountDetails
 * EntryTransaction8.AmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails7#TransactionDetails
 * EntryDetails7.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#StatementEntry
 * UnderlyingTransaction3Choice.StatementEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection53
 * AmountAndDirection53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection61
 * AmountAndDirection61}</li>
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
	/**
	 * Cash account on which the amount of the entry is debited or credited. It
	 * is derived from the association between Entry and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashEntry
	 * CashAccount.CashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#CashAccount
	 * PaymentInstrument7.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#CashAccount
	 * PaymentInstrument6.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#CashAccountDetails
	 * PaymentInstrument8.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#CashAccountDetails
	 * PaymentInstrument9.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument16Choice#CashAccountDetails
	 * PaymentInstrument16Choice.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#AccountIdentification
	 * CashAccountEntrySearch3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#SafekeepingAccount
	 * EntryTransaction1.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#SafekeepingAccount
	 * EntryTransaction2.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#SafekeepingAccount
	 * EntryTransaction3.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#SafekeepingAccount
	 * EntryTransaction4.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#AccountDetails
	 * CorporateActionCashMovements2.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement1#AccountDetails
	 * CashMovement1.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement2#AccountDetails
	 * CashMovement2.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement3#AccountDetails
	 * CashMovement3.AccountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem3#Account
	 * NotificationItem3.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification1#Account
	 * OriginalNotification1.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#Account
	 * OriginalItemReference1.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#Account
	 * OriginalNotificationReference1.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#Account
	 * OriginalNotification2.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#Account
	 * OriginalNotificationReference2.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem4#Account
	 * NotificationItem4.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#Account
	 * OriginalItemReference2.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#Account
	 * OriginalNotificationReference4.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#Account
	 * OriginalNotificationReference3.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#CashAccount
	 * IntraBalanceCancellation2.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#CashAccount
	 * IntraBalanceCancellation1.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#CashAccount
	 * IntraBalanceMovement1.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#CashAccount
	 * IntraBalanceMovements1.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#CashAccount
	 * IntraBalanceModification2.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#CashAccount
	 * IntraBalanceModification1.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#CashAccount
	 * IntraBalanceQueryCriteria3.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#AccountIdentification
	 * CashAccountEntrySearch4.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#Account
	 * OriginalNotificationReference6.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#Account
	 * OriginalItemReference3.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#Account
	 * OriginalNotificationReference5.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem5#Account
	 * NotificationItem5.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#SafekeepingAccount
	 * EntryTransaction7.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#Account
	 * OriginalNotificationReference8.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#Account
	 * OriginalItemReference4.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#Account
	 * OriginalNotificationReference7.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#SafekeepingAccount
	 * EntryTransaction8.SafekeepingAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#Account
	 * NotificationItem6.Account}</li>
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
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument7.CashAccount, com.tools20022.repository.msg.PaymentInstrument6.CashAccount,
					com.tools20022.repository.msg.PaymentInstrument8.CashAccountDetails, com.tools20022.repository.msg.PaymentInstrument9.CashAccountDetails, com.tools20022.repository.choice.PaymentInstrument16Choice.CashAccountDetails,
					com.tools20022.repository.msg.CashAccountEntrySearch3.AccountIdentification, com.tools20022.repository.msg.EntryTransaction1.SafekeepingAccount, com.tools20022.repository.msg.EntryTransaction2.SafekeepingAccount,
					com.tools20022.repository.msg.EntryTransaction3.SafekeepingAccount, com.tools20022.repository.msg.EntryTransaction4.SafekeepingAccount, com.tools20022.repository.msg.CorporateActionCashMovements2.AccountDetails,
					com.tools20022.repository.msg.CashMovement1.AccountDetails, com.tools20022.repository.msg.CashMovement2.AccountDetails, com.tools20022.repository.msg.CashMovement3.AccountDetails,
					com.tools20022.repository.msg.NotificationItem3.Account, com.tools20022.repository.msg.OriginalNotification1.Account, com.tools20022.repository.msg.OriginalItemReference1.Account,
					com.tools20022.repository.msg.OriginalNotificationReference1.Account, com.tools20022.repository.msg.OriginalNotification2.Account, com.tools20022.repository.msg.OriginalNotificationReference2.Account,
					com.tools20022.repository.msg.NotificationItem4.Account, com.tools20022.repository.msg.OriginalItemReference2.Account, com.tools20022.repository.msg.OriginalNotificationReference4.Account,
					com.tools20022.repository.msg.OriginalNotificationReference3.Account, com.tools20022.repository.msg.IntraBalanceCancellation2.CashAccount, com.tools20022.repository.msg.IntraBalanceCancellation1.CashAccount,
					com.tools20022.repository.msg.IntraBalanceMovement1.CashAccount, com.tools20022.repository.msg.IntraBalanceMovements1.CashAccount, com.tools20022.repository.msg.IntraBalanceModification2.CashAccount,
					com.tools20022.repository.msg.IntraBalanceModification1.CashAccount, com.tools20022.repository.msg.IntraBalanceQueryCriteria3.CashAccount, com.tools20022.repository.msg.CashAccountEntrySearch4.AccountIdentification,
					com.tools20022.repository.msg.OriginalNotificationReference6.Account, com.tools20022.repository.msg.OriginalItemReference3.Account, com.tools20022.repository.msg.OriginalNotificationReference5.Account,
					com.tools20022.repository.msg.NotificationItem5.Account, com.tools20022.repository.msg.EntryTransaction7.SafekeepingAccount, com.tools20022.repository.msg.OriginalNotificationReference8.Account,
					com.tools20022.repository.msg.OriginalItemReference4.Account, com.tools20022.repository.msg.OriginalNotificationReference7.Account, com.tools20022.repository.msg.EntryTransaction8.SafekeepingAccount,
					com.tools20022.repository.msg.NotificationItem6.Account);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which the amount of the entry is debited or credited. It is derived from the association between Entry and Account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money in the cash entry.
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
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#EntryAmount
	 * AccountCashEntrySearch2.EntryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#EntryAmount
	 * CashAccountEntrySearch3.EntryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#EntryAmount
	 * AccountCashEntryDetails3.EntryAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1#Amount
	 * CashEntry1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1#Amount
	 * AmountAndCurrencyExchangeDetails1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2#Amount
	 * AmountAndCurrencyExchangeDetails2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#Amount
	 * ReportEntry1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#AmountDetails
	 * ReportEntry1.AmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#Amount
	 * AmountAndCurrencyExchangeDetails3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#Amount
	 * AmountAndCurrencyExchangeDetails4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#Amount
	 * ReportEntry2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#AmountDetails
	 * ReportEntry2.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3#Amount
	 * EntryTransaction3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#Amount
	 * ReportEntry3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#AmountDetails
	 * ReportEntry3.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4#Amount
	 * EntryTransaction4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#Amount
	 * ReportEntry4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#AmountDetails
	 * ReportEntry4.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#Amount
	 * NotificationEntry1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#Amount
	 * StatementEntry1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Value#BaseCurrencyItem
	 * Value.BaseCurrencyItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData5#PayInCallAmount
	 * ReportData5.PayInCallAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PayInScheduleItems#Amount
	 * PayInScheduleItems.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PayInScheduleItems1#Amount
	 * PayInScheduleItems1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#PostingAmount
	 * CorporateActionCashMovements2.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry2#Amount
	 * NotificationEntry2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#CorrectedAmount
	 * StatementResolutionEntry1.CorrectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#CorrectedAmount
	 * StatementResolutionEntry2.CorrectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection34#Amount
	 * AmountAndDirection34.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#SettledAmount
	 * IntraBalance2.SettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#PreviouslySettledAmount
	 * IntraBalance2.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#RemainingSettlementAmount
	 * IntraBalance2.RemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1#SettlementAmount
	 * IntraBalance1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#SettledAmount
	 * IntraBalanceMovement2.SettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#PreviouslySettledAmount
	 * IntraBalanceMovement2.PreviouslySettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#RemainingSettlementAmount
	 * IntraBalanceMovement2.RemainingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#EntryAmount
	 * CashAccountEntrySearch4.EntryAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#Amount
	 * ReportEntry7.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#AmountDetails
	 * ReportEntry7.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#Amount
	 * EntryTransaction7.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Amount
	 * ReportEntry8.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#AmountDetails
	 * ReportEntry8.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Amount
	 * EntryTransaction8.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection53#Amount
	 * AmountAndDirection53.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection61#Amount
	 * AmountAndDirection61.Amount}</li>
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.EntryAmount, com.tools20022.repository.msg.CashAccountEntrySearch3.EntryAmount,
					com.tools20022.repository.msg.AccountCashEntryDetails3.EntryAmount, com.tools20022.repository.msg.CashEntry1.Amount, com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1.Amount,
					com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2.Amount, com.tools20022.repository.msg.ReportEntry1.Amount, com.tools20022.repository.msg.ReportEntry1.AmountDetails,
					com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.Amount, com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4.Amount, com.tools20022.repository.msg.ReportEntry2.Amount,
					com.tools20022.repository.msg.ReportEntry2.AmountDetails, com.tools20022.repository.msg.EntryTransaction3.Amount, com.tools20022.repository.msg.ReportEntry3.Amount,
					com.tools20022.repository.msg.ReportEntry3.AmountDetails, com.tools20022.repository.msg.EntryTransaction4.Amount, com.tools20022.repository.msg.ReportEntry4.Amount,
					com.tools20022.repository.msg.ReportEntry4.AmountDetails, com.tools20022.repository.msg.NotificationEntry1.Amount, com.tools20022.repository.msg.StatementEntry1.Amount,
					com.tools20022.repository.msg.Value.BaseCurrencyItem, com.tools20022.repository.msg.ReportData5.PayInCallAmount, com.tools20022.repository.msg.PayInScheduleItems.Amount,
					com.tools20022.repository.msg.PayInScheduleItems1.Amount, com.tools20022.repository.msg.CorporateActionCashMovements2.PostingAmount, com.tools20022.repository.msg.NotificationEntry2.Amount,
					com.tools20022.repository.msg.StatementResolutionEntry1.CorrectedAmount, com.tools20022.repository.msg.StatementResolutionEntry2.CorrectedAmount, com.tools20022.repository.msg.AmountAndDirection34.Amount,
					com.tools20022.repository.msg.IntraBalance2.SettledAmount, com.tools20022.repository.msg.IntraBalance2.PreviouslySettledAmount, com.tools20022.repository.msg.IntraBalance2.RemainingSettlementAmount,
					com.tools20022.repository.msg.IntraBalance1.SettlementAmount, com.tools20022.repository.msg.IntraBalanceMovement2.SettledAmount, com.tools20022.repository.msg.IntraBalanceMovement2.PreviouslySettledAmount,
					com.tools20022.repository.msg.IntraBalanceMovement2.RemainingSettlementAmount, com.tools20022.repository.msg.CashAccountEntrySearch4.EntryAmount, com.tools20022.repository.msg.ReportEntry7.Amount,
					com.tools20022.repository.msg.ReportEntry7.AmountDetails, com.tools20022.repository.msg.EntryTransaction7.Amount, com.tools20022.repository.msg.ReportEntry8.Amount,
					com.tools20022.repository.msg.ReportEntry8.AmountDetails, com.tools20022.repository.msg.EntryTransaction8.Amount, com.tools20022.repository.msg.AmountAndDirection53.Amount,
					com.tools20022.repository.msg.AmountAndDirection61.Amount);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Account entry for which one or more cash entries are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#CashEntry
	 * BookEntry.CashEntry}</li>
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
	public static final MMBusinessAssociationEnd RelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBookEntry";
			definition = "Account entry for which one or more cash entries are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount that is the result of the sum of the cash entries from or to
	 * a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#CashBalanceEntry
	 * CashBalance.CashBalanceEntry}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#BalanceFrom
	 * IntraBalance2.BalanceFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#BalanceTo
	 * IntraBalance2.BalanceTo}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance1#BalanceFrom
	 * IntraBalance1.BalanceFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance1#BalanceTo
	 * IntraBalance1.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#BalanceFrom
	 * IntraBalanceMovement2.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#BalanceTo
	 * IntraBalanceMovement2.BalanceTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1#BalanceFrom
	 * IntraBalanceType1.BalanceFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1#BalanceTo
	 * IntraBalanceType1.BalanceTo}</li>
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
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalance2.BalanceFrom, com.tools20022.repository.msg.IntraBalance2.BalanceTo, com.tools20022.repository.msg.IntraBalance1.BalanceFrom,
					com.tools20022.repository.msg.IntraBalance1.BalanceTo, com.tools20022.repository.msg.IntraBalanceMovement2.BalanceFrom, com.tools20022.repository.msg.IntraBalanceMovement2.BalanceTo,
					com.tools20022.repository.msg.IntraBalanceType1.BalanceFrom, com.tools20022.repository.msg.IntraBalanceType1.BalanceTo);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash amount that is the result of the sum of the cash entries from or to a cash account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.CashBalanceEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry details related to currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashEntry
	 * CurrencyExchange.CurrencyExchangeForCashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1#CurrencyExchange
	 * AmountAndCurrencyExchangeDetails1.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2#CurrencyExchange
	 * AmountAndCurrencyExchangeDetails2.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3#CurrencyExchange
	 * AmountAndCurrencyExchangeDetails3.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4#CurrencyExchange
	 * AmountAndCurrencyExchangeDetails4.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAmountAndCurrencyExchange1#CurrencyExchange
	 * CardAmountAndCurrencyExchange1.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1.CurrencyExchange, com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2.CurrencyExchange,
					com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails3.CurrencyExchange, com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails4.CurrencyExchange,
					com.tools20022.repository.msg.CardAmountAndCurrencyExchange1.CurrencyExchange);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides information on the charges included in the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#CashEntry
	 * Charges.CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#Charges
	 * EntryTransaction1.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#Charges
	 * ReportEntry1.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#Charges
	 * EntryTransaction2.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#Charges
	 * ReportEntry2.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3#Charges
	 * EntryTransaction3.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#Charges
	 * ReportEntry3.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4#Charges
	 * EntryTransaction4.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#Charges
	 * ReportEntry4.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#Charges
	 * NotificationEntry1.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#Charges
	 * StatementEntry1.Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#Charges
	 * StatementResolutionEntry1.Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#Charges
	 * StatementResolutionEntry2.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#Charges
	 * ReportEntry7.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#Charges
	 * EntryTransaction7.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Charges
	 * ReportEntry8.Charges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Charges
	 * EntryTransaction8.Charges}</li>
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
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction1.Charges, com.tools20022.repository.msg.ReportEntry1.Charges, com.tools20022.repository.msg.EntryTransaction2.Charges,
					com.tools20022.repository.msg.ReportEntry2.Charges, com.tools20022.repository.msg.EntryTransaction3.Charges, com.tools20022.repository.msg.ReportEntry3.Charges, com.tools20022.repository.msg.EntryTransaction4.Charges,
					com.tools20022.repository.msg.ReportEntry4.Charges, com.tools20022.repository.msg.NotificationEntry1.Charges, com.tools20022.repository.msg.StatementEntry1.Charges,
					com.tools20022.repository.msg.StatementResolutionEntry1.Charges, com.tools20022.repository.msg.StatementResolutionEntry2.Charges, com.tools20022.repository.msg.ReportEntry7.Charges,
					com.tools20022.repository.msg.EntryTransaction7.Charges, com.tools20022.repository.msg.ReportEntry8.Charges, com.tools20022.repository.msg.EntryTransaction8.Charges);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Availability information on the entry.<br>
	 * Elements used to indicate when the booked amount of money will become
	 * available, that is can be accessed and start generating interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#CashEntry
	 * CashAvailability.CashEntry}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#Availability
	 * EntryTransaction1.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#Availability
	 * EntryTransaction2.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#Availability
	 * ReportEntry2.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#Availability
	 * EntryTransaction3.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#Availability
	 * ReportEntry3.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#Availability
	 * EntryTransaction4.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#Availability
	 * NotificationEntry1.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#Availability
	 * EntryTransaction7.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#Availability
	 * EntryTransaction8.Availability}</li>
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
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction1.Availability, com.tools20022.repository.msg.EntryTransaction2.Availability, com.tools20022.repository.msg.ReportEntry2.Availability,
					com.tools20022.repository.msg.EntryTransaction3.Availability, com.tools20022.repository.msg.ReportEntry3.Availability, com.tools20022.repository.msg.EntryTransaction4.Availability,
					com.tools20022.repository.msg.NotificationEntry1.Availability, com.tools20022.repository.msg.EntryTransaction7.Availability, com.tools20022.repository.msg.EntryTransaction8.Availability);
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Availability information on the entry.\r\nElements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAvailability.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAvailability.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest amount included in the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#CashEntry
	 * Interest.CashEntry}</li>
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
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest amount included in the entry amount.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Book entry which is the source of the cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#DebitEntry
	 * BookEntry.DebitEntry}</li>
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
	public static final MMBusinessAssociationEnd DebitRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.DebitEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Book entry which is the source of the cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#CreditEntry
	 * BookEntry.CreditEntry}</li>
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
	public static final MMBusinessAssociationEnd CreditRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BookEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.CreditEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the invoice financing transaction which originates the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#ResultingCashEntry
	 * InvoiceFinancingAgreement.ResultingCashEntry}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingTransaction";
			definition = "Specifies the invoice financing transaction which originates the entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Case which is investigating a cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingCashEntry
	 * PaymentInvestigationCase.UnderlyingCashEntry}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case which is investigating a cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment investigation case resolution which created a correction
	 * resulting in a cash entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#EntryCorrection
	 * PaymentInvestigationCaseResolution.EntryCorrection}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which created a correction resulting in a cash entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether charges have already been included in the entry amount.
	 * <p>
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
	public static final MMBusinessAttribute ChargesIncluded = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesIncluded";
			definition = "Indicates whether charges have already been included in the entry amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargeIncludedIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashEntry";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashEntry, com.tools20022.repository.entity.CashBalance.CashBalanceEntry, com.tools20022.repository.entity.Charges.CashEntry,
						com.tools20022.repository.entity.BookEntry.CashEntry, com.tools20022.repository.entity.BookEntry.DebitEntry, com.tools20022.repository.entity.BookEntry.CreditEntry,
						com.tools20022.repository.entity.Interest.CashEntry, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry, com.tools20022.repository.entity.CashAvailability.CashEntry,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange2.ProprietaryAmount, com.tools20022.repository.msg.EntryTransaction1.AmountDetails,
						com.tools20022.repository.msg.ReportEntry1.TransactionDetails, com.tools20022.repository.msg.AmountAndCurrencyExchange3.ProprietaryAmount, com.tools20022.repository.msg.EntryTransaction2.AmountDetails,
						com.tools20022.repository.msg.EntryDetails1.TransactionDetails, com.tools20022.repository.msg.ReportEntry2.EntryDetails, com.tools20022.repository.msg.EntryTransaction3.AmountDetails,
						com.tools20022.repository.msg.EntryDetails2.TransactionDetails, com.tools20022.repository.msg.ReportEntry3.EntryDetails, com.tools20022.repository.msg.AmountAndDirection35.Amount,
						com.tools20022.repository.msg.EntryTransaction4.AmountDetails, com.tools20022.repository.msg.EntryDetails3.TransactionDetails, com.tools20022.repository.msg.ReportEntry4.EntryDetails,
						com.tools20022.repository.msg.NotificationEntry1.AmountDetails, com.tools20022.repository.msg.NotificationEntry1.TransactionDetails, com.tools20022.repository.msg.StatementEntry1.AmountDetails,
						com.tools20022.repository.msg.StatementEntry1.TransactionDetails, com.tools20022.repository.choice.UnderlyingTransaction1Choice.StatementEntry,
						com.tools20022.repository.choice.UnderlyingTransaction2Choice.StatementEntry, com.tools20022.repository.msg.ReportEntry7.EntryDetails, com.tools20022.repository.msg.EntryDetails6.TransactionDetails,
						com.tools20022.repository.msg.EntryTransaction7.AmountDetails, com.tools20022.repository.msg.ReportEntry8.EntryDetails, com.tools20022.repository.msg.EntryTransaction8.AmountDetails,
						com.tools20022.repository.msg.EntryDetails7.TransactionDetails, com.tools20022.repository.choice.UnderlyingTransaction3Choice.StatementEntry);
				superType_lazy = () -> Entry.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.CashAccount, com.tools20022.repository.entity.CashEntry.Amount, com.tools20022.repository.entity.CashEntry.RelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CashBalance, com.tools20022.repository.entity.CashEntry.CurrencyExchange, com.tools20022.repository.entity.CashEntry.Charges,
						com.tools20022.repository.entity.CashEntry.Availability, com.tools20022.repository.entity.CashEntry.Interest, com.tools20022.repository.entity.CashEntry.DebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CreditRelatedBookEntry, com.tools20022.repository.entity.CashEntry.RelatedInvoiceFinancingTransaction, com.tools20022.repository.entity.CashEntry.RelatedInvestigationCase,
						com.tools20022.repository.entity.CashEntry.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.ChargesIncluded);
				derivationComponent_lazy = () -> Arrays.asList(AccountCashEntrySearch2.mmObject(), CashAccountEntrySearch3.mmObject(), AccountCashEntryDetails3.mmObject(), CashEntry1.mmObject(),
						AmountAndCurrencyExchangeDetails1.mmObject(), AmountAndCurrencyExchangeDetails2.mmObject(), AmountAndCurrencyExchange2.mmObject(), ReportEntry1.mmObject(), AmountAndCurrencyExchangeDetails3.mmObject(),
						AmountAndCurrencyExchangeDetails4.mmObject(), AmountAndCurrencyExchange3.mmObject(), EntryDetails1.mmObject(), ReportEntry2.mmObject(), EntryDetails2.mmObject(), ReportEntry3.mmObject(),
						AmountAndDirection35.mmObject(), EntryDetails3.mmObject(), ReportEntry4.mmObject(), NotificationEntry1.mmObject(), StatementEntry1.mmObject(), Value.mmObject(), PayInScheduleItems.mmObject(),
						PayInFactors1.mmObject(), PayInScheduleItems1.mmObject(), CorporateActionCashMovements2.mmObject(), TransactionType1.mmObject(), NotificationEntry2.mmObject(), StatementResolutionEntry1.mmObject(),
						StatementResolutionEntry2.mmObject(), AmountAndDirection34.mmObject(), CashAccountEntrySearch4.mmObject(), ReportEntry7.mmObject(), EntryDetails6.mmObject(), ReportEntry8.mmObject(), EntryDetails7.mmObject(),
						AmountAndDirection53.mmObject(), AmountAndDirection61.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}