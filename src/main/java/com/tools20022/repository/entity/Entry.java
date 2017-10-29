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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.EntryCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Posting to an account that results in an increase or decrease to a balance.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Entry" src="doc-files/Entry.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#CreditDebitIndicator
 * Entry.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#EntryDate
 * Entry.EntryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Identification
 * Entry.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#AccountOwnerTransactionIdentification
 * Entry.AccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#AccountServicerTransactionIdentification
 * Entry.AccountServicerTransactionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#ReversalIndicator
 * Entry.ReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#ValueDate
 * Entry.ValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#BankTransactionCode
 * Entry.BankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#CommissionWaiverIndicator
 * Entry.CommissionWaiverIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Role Entry.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Account Entry.Account}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Balance Entry.Balance}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#EntryType
 * Entry.EntryType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#Entry Role.Entry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Entry Account.Entry}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#BalanceEntry
 * Balance.BalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedEntry
 * BankTransaction.RelatedEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesEntry
 * SecuritiesEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1
 * EntryTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2
 * EntryTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3
 * EntryTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4
 * EntryTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry1
 * UnderlyingStatementEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7
 * EntryTransaction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8
 * EntryTransaction8}</li>
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
 * "Entry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting to an account that results in an increase or decrease to a balance."
 * </li>
 * </ul>
 */
public class Entry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether an entry is a credit or a debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#CreditDebitIndicator
	 * AccountCashEntrySearch2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#CreditDebitIndicator
	 * CashAccountEntrySearch3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#CreditDebitIndicator
	 * PaymentCommonDetails2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#CreditDebitIndicator
	 * PaymentCommonDetails3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#CreditDebitIndicator
	 * PaymentCommonDetails4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#CreditDebitIndicator
	 * PaymentCommon1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#CreditDebitIndicator
	 * ReportEntry1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#CreditDebitIndicator
	 * ReportEntry2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#CreditDebitIndicator
	 * EntryTransaction3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#CreditDebitIndicator
	 * ReportEntry3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection35#CreditDebitIndicator
	 * AmountAndDirection35.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#CreditDebitIndicator
	 * EntryTransaction4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#CreditDebitIndicator
	 * ReportEntry4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#CreditDebitIndicator
	 * NotificationEntry1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#CreditDebitIndicator
	 * StatementEntry1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionType1#CreditDebitIndicator
	 * TransactionType1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equalisation2#CreditDebitIndicator
	 * Equalisation2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#CreditDebitIndicator
	 * CashAccountEntrySearch4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#CreditDebitIndicator
	 * PaymentCommon2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#CreditDebitIndicator
	 * ReportEntry7.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#CreditDebitIndicator
	 * EntryTransaction7.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#CreditDebitIndicator
	 * ReportEntry8.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#CreditDebitIndicator
	 * EntryTransaction8.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether an entry is a credit or a debit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.CreditDebitIndicator, com.tools20022.repository.msg.CashAccountEntrySearch3.CreditDebitIndicator,
					com.tools20022.repository.msg.PaymentCommonDetails2.CreditDebitIndicator, com.tools20022.repository.msg.PaymentCommonDetails3.CreditDebitIndicator,
					com.tools20022.repository.msg.PaymentCommonDetails4.CreditDebitIndicator, com.tools20022.repository.msg.PaymentCommon1.CreditDebitIndicator, com.tools20022.repository.msg.ReportEntry1.CreditDebitIndicator,
					com.tools20022.repository.msg.ReportEntry2.CreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction3.CreditDebitIndicator, com.tools20022.repository.msg.ReportEntry3.CreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection35.CreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction4.CreditDebitIndicator, com.tools20022.repository.msg.ReportEntry4.CreditDebitIndicator,
					com.tools20022.repository.msg.NotificationEntry1.CreditDebitIndicator, com.tools20022.repository.msg.StatementEntry1.CreditDebitIndicator, com.tools20022.repository.msg.TransactionType1.CreditDebitIndicator,
					com.tools20022.repository.msg.Equalisation2.CreditDebitIndicator, com.tools20022.repository.msg.CashAccountEntrySearch4.CreditDebitIndicator, com.tools20022.repository.msg.PaymentCommon2.CreditDebitIndicator,
					com.tools20022.repository.msg.ReportEntry7.CreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction7.CreditDebitIndicator, com.tools20022.repository.msg.ReportEntry8.CreditDebitIndicator,
					com.tools20022.repository.msg.EntryTransaction8.CreditDebitIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date and time at which an entry is posted to an account on the account
	 * servicer's books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#EntryDate
	 * AccountCashEntrySearch2.EntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#EntryDate
	 * CashAccountEntrySearch3.EntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#EntryDate
	 * PaymentCommonDetails2.EntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#EntryDate
	 * AccountCashEntryDetails3.EntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#EntryDate
	 * PaymentCommonDetails3.EntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#EntryDate
	 * PaymentCommonDetails4.EntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon1#EntryDate
	 * PaymentCommon1.EntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1#Date
	 * CashEntry1.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#BookingDate
	 * ReportEntry1.BookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#BookingDate
	 * ReportEntry2.BookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#BookingDate
	 * ReportEntry3.BookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#BookingDate
	 * ReportEntry4.BookingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#BookingDate
	 * NotificationEntry1.BookingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#BookingDate
	 * StatementEntry1.BookingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#PostingDateTime
	 * CorporateActionCashMovements2.PostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement3#PostingDateTime
	 * CashMovement3.PostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingDateDetails1#BookDate
	 * FinancingDateDetails1.BookDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingDateDetails1#CreditDate
	 * FinancingDateDetails1.CreditDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingDateDetails1#DebitDate
	 * FinancingDateDetails1.DebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#PostingDate
	 * BalanceAdjustment1.PostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#EntryDate
	 * CashAccountEntrySearch4.EntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2#EntryDate
	 * PaymentCommon2.EntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#BookingDate
	 * ReportEntry7.BookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportItem1#ItemDate
	 * ReportItem1.ItemDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#BookingDate
	 * ReportEntry8.BookingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which an entry is posted to an account on the account servicer's books."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.EntryDate, com.tools20022.repository.msg.CashAccountEntrySearch3.EntryDate,
					com.tools20022.repository.msg.PaymentCommonDetails2.EntryDate, com.tools20022.repository.msg.AccountCashEntryDetails3.EntryDate, com.tools20022.repository.msg.PaymentCommonDetails3.EntryDate,
					com.tools20022.repository.msg.PaymentCommonDetails4.EntryDate, com.tools20022.repository.msg.PaymentCommon1.EntryDate, com.tools20022.repository.msg.CashEntry1.Date,
					com.tools20022.repository.msg.ReportEntry1.BookingDate, com.tools20022.repository.msg.ReportEntry2.BookingDate, com.tools20022.repository.msg.ReportEntry3.BookingDate,
					com.tools20022.repository.msg.ReportEntry4.BookingDate, com.tools20022.repository.msg.NotificationEntry1.BookingDate, com.tools20022.repository.msg.StatementEntry1.BookingDate,
					com.tools20022.repository.msg.CorporateActionCashMovements2.PostingDateTime, com.tools20022.repository.msg.CashMovement3.PostingDateTime, com.tools20022.repository.msg.FinancingDateDetails1.BookDate,
					com.tools20022.repository.msg.FinancingDateDetails1.CreditDate, com.tools20022.repository.msg.FinancingDateDetails1.DebitDate, com.tools20022.repository.msg.BalanceAdjustment1.PostingDate,
					com.tools20022.repository.msg.CashAccountEntrySearch4.EntryDate, com.tools20022.repository.msg.PaymentCommon2.EntryDate, com.tools20022.repository.msg.ReportEntry7.BookingDate,
					com.tools20022.repository.msg.ReportItem1.ItemDate, com.tools20022.repository.msg.ReportEntry8.BookingDate);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for an entry, as assigned by the
	 * account servicer.
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
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#EntryReference
	 * AccountCashEntryDetails3.EntryReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1#Identification
	 * CashEntry1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#References
	 * EntryTransaction1.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#AccountServicerReference
	 * ReportEntry1.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#References
	 * EntryTransaction2.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#EntryReference
	 * ReportEntry2.EntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#AccountServicerReference
	 * ReportEntry2.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#References
	 * EntryTransaction3.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#EntryReference
	 * ReportEntry3.EntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#AccountServicerReference
	 * ReportEntry3.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#References
	 * EntryTransaction4.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#EntryReference
	 * ReportEntry4.EntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry1#OriginalEntryIdentification
	 * UnderlyingStatementEntry1.OriginalEntryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#EntryReference
	 * ReportEntry7.EntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#References
	 * EntryTransaction7.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#AccountServicerReference
	 * CertificateIdentification1.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#EntryReference
	 * ReportEntry8.EntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#References
	 * EntryTransaction8.References}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an entry, as assigned by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntryDetails3.EntryReference, com.tools20022.repository.msg.CashEntry1.Identification, com.tools20022.repository.msg.EntryTransaction1.References,
					com.tools20022.repository.msg.ReportEntry1.AccountServicerReference, com.tools20022.repository.msg.EntryTransaction2.References, com.tools20022.repository.msg.ReportEntry2.EntryReference,
					com.tools20022.repository.msg.ReportEntry2.AccountServicerReference, com.tools20022.repository.msg.EntryTransaction3.References, com.tools20022.repository.msg.ReportEntry3.EntryReference,
					com.tools20022.repository.msg.ReportEntry3.AccountServicerReference, com.tools20022.repository.msg.EntryTransaction4.References, com.tools20022.repository.msg.ReportEntry4.EntryReference,
					com.tools20022.repository.msg.UnderlyingStatementEntry1.OriginalEntryIdentification, com.tools20022.repository.msg.ReportEntry7.EntryReference, com.tools20022.repository.msg.EntryTransaction7.References,
					com.tools20022.repository.msg.CertificateIdentification1.AccountServicerReference, com.tools20022.repository.msg.ReportEntry8.EntryReference, com.tools20022.repository.msg.EntryTransaction8.References);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an entry, as assigned by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * owner (or the instructing party managing the account).
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications3#AccountOwnerTransactionIdentification
	 * TransactionIdentifications3.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#AccountOwnerTransactionIdentification
	 * TransactionIdentifications10.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#AccountOwnerTransactionIdentification
	 * TransactionIdentifications15.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#AccountOwnerTransactionIdentification
	 * TransactionIdentifications19.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#AccountOwnerTransactionIdentification
	 * TransactionDetails41.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#AccountOwnerTransactionIdentification
	 * TransactionDetails43.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#AccountOwnerTransactionIdentification
	 * AdditionalParameters3.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#AccountOwnerTransactionIdentification
	 * AdditionalParameters7.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#AccountOwnerTransactionIdentification
	 * AdditionalParameters8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#AccountOwnerTransactionIdentification
	 * AdditionalParameters9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#AccountOwnerTransactionIdentification
	 * AdditionalParameters10.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#AccountOwnerTransactionIdentification
	 * AdditionalParameters11.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#AccountOwnerTransactionIdentification
	 * References5Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#AccountOwnerTransactionIdentification
	 * References11Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#AccountOwnerTransactionIdentification
	 * References19Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#AccountOwnerTransactionIdentification
	 * References21Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#AccountOwnerTransactionIdentification
	 * References27Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#AccountOwnerTransactionIdentification
	 * References33Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters3.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters6.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#AccountOwnerTransactionIdentification
	 * References1.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#AccountOwnerTransactionIdentification
	 * References6Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#AccountOwnerTransactionIdentification
	 * References2.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#AccountOwnerTransactionIdentification
	 * References10Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#AccountOwnerTransactionIdentification
	 * References7.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#AccountOwnerTransactionIdentification
	 * References8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#AccountOwnerTransactionIdentification
	 * References9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#AccountOwnerTransactionIdentification
	 * References13.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#AccountOwnerTransactionIdentification
	 * AdditionalInformation3.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#AccountOwnerTransactionIdentification
	 * AdditionalInformation4.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#AccountOwnerTransactionIdentification
	 * AdditionalInformation7.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#AccountOwnerTransactionIdentification
	 * AdditionalInformation8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification1.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification11.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification15.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification17.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification10.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification12.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#AccountOwnerTransactionIdentification
	 * TransactionIdentifications2.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#AccountOwnerTransactionIdentification
	 * TransactionIdentifications7.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#AccountOwnerTransactionIdentification
	 * TransactionIdentifications9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#AccountOwnerTransactionIdentification
	 * TransactionIdentifications13.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#AccountOwnerTransactionIdentification
	 * TransactionIdentifications16.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#AccountOwnerTransactionIdentification
	 * TransactionIdentifications22.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#AccountOwnerTransactionIdentification
	 * Transaction7.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#AccountOwnerTransactionIdentification
	 * Transaction8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#AccountOwnerTransactionIdentification
	 * Transaction9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#AccountOwnerTransactionIdentification
	 * Transaction10.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#AccountOwnerTransactionIdentification
	 * Transaction14.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#AccountOwnerTransactionIdentification
	 * Transaction12.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#AccountOwnerTransactionIdentification
	 * Transaction15.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#AccountOwnerTransactionIdentification
	 * Transaction16.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#AccountOwnerTransactionIdentification
	 * Transaction20.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#AccountOwnerTransactionIdentification
	 * Transaction19.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#AccountOwnerTransactionIdentification
	 * Transaction23.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#AccountOwnerTransactionIdentification
	 * Transaction22.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#AccountOwnerTransactionIdentification
	 * Transaction28.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#AccountOwnerTransactionIdentification
	 * Transaction27.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#AccountOwnerTransactionIdentification
	 * Transaction30.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#AccountOwnerTransactionIdentification
	 * Transaction31.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#AccountOwnerTransactionIdentification
	 * Transaction6.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#AccountOwnerTransactionIdentification
	 * Transaction11.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#AccountOwnerTransactionIdentification
	 * Transaction13.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#AccountOwnerTransactionIdentification
	 * Transaction17.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#AccountOwnerTransactionIdentification
	 * Transaction18.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#AccountOwnerTransactionIdentification
	 * Transaction21.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#AccountOwnerTransactionIdentification
	 * Transaction29.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#AccountOwnerTransactionIdentification
	 * Transaction32.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#AccountOwnerTransactionIdentification
	 * Identification2.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#AccountOwnerTransactionIdentification
	 * TransactionReferences3.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters2.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters7.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1#AccountOwnerTransactionIdentification
	 * TransactionIdentifications1.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails18.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails4.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails17.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#AccountOwnerTransactionIdentification
	 * Identification7.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications4#AccountOwnerTransactionIdentification
	 * TransactionIdentifications4.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#AccountOwnerTransactionIdentification
	 * TransactionIdentifications11.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#AccountOwnerTransactionIdentification
	 * TransactionDetails11.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#AccountOwnerTransactionIdentification
	 * Identification6.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters5.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters8.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications6#AccountOwnerTransactionIdentification
	 * TransactionIdentifications6.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails21.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails10.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails22.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails23.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails29.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#AccountOwnerTransactionIdentification
	 * TransactionIdentification2.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#AccountOwnerTransactionIdentification
	 * TransactionIdentification3.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#AccountOwnerTransactionIdentification
	 * TransactionIdentifications18.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#AccountOwnerTransactionIdentification
	 * TransactionIdentifications20.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#AccountOwnerTransactionIdentification
	 * Identification5.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#AccountOwnerTransactionIdentification
	 * Identification8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#AccountOwnerTransactionIdentification
	 * Identification11.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#AccountOwnerTransactionIdentification
	 * Identification13.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#AccountOwnerTransactionIdentification
	 * TransactionDetails15.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications8#AccountOwnerTransactionIdentification
	 * TransactionIdentifications8.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#AccountOwnerTransactionIdentification
	 * TransactionIdentifications14.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#AccountOwnerTransactionIdentification
	 * TransactionIdentifications17.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#AccountOwnerTransactionIdentification
	 * TransactionIdentifications23.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#AccountOwnerTransactionIdentification
	 * Identification9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications5#AccountOwnerTransactionIdentification
	 * TransactionIdentifications5.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#AccountOwnerTransactionIdentification
	 * TransactionIdentifications12.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#AccountOwnerTransactionIdentification
	 * References14.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#AccountOwnerTransactionIdentification
	 * IntraBalanceMovement1.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#AccountOwnerTransactionIdentification
	 * IntraBalancePending2.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#AccountOwnerTransactionIdentification
	 * Transaction25.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#AccountOwnerTransactionIdentification
	 * References36Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#AccountOwnerTransactionIdentification
	 * References35Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#AccountOwnerTransactionIdentification
	 * TransactionIdentifications24.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#AccountOwnerTransactionIdentification
	 * Identification3.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#AccountOwnerTransactionIdentification
	 * AdditionalParameters16.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#AccountOwnerTransactionIdentification
	 * Transaction34.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#AccountOwnerTransactionIdentification
	 * TransactionIdentifications25.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#AccountOwnerTransactionIdentification
	 * TransactionDetails64.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#AccountOwnerTransactionIdentification
	 * Transaction35.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#AccountOwnerTransactionIdentification
	 * Transaction36.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails35.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails36.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#AccountOwnerTransactionIdentification
	 * AdditionalInformation9.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#AccountOwnerTransactionIdentification
	 * References16.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#AccountOwnerTransactionIdentification
	 * TransactionIdentifications26.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails41.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#AccountOwnerTransactionIdentification
	 * Transaction38.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#AccountOwnerTransactionIdentification
	 * TransactionDetails65.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#AccountOwnerTransactionIdentification
	 * AdditionalInformation10.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails42.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#AccountOwnerTransactionIdentification
	 * References17.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#AccountOwnerTransactionIdentification
	 * Transaction39.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#AccountOwnerTransactionIdentification
	 * Transaction37.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#AccountOwnerTransactionIdentification
	 * Transaction41.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#AccountOwnerTransactionIdentification
	 * Transaction40.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#AccountOwnerTransactionIdentification
	 * Transaction43.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#AccountOwnerTransactionIdentification
	 * Transaction42.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#AccountOwnerTransactionIdentification
	 * AdditionalInformation11.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails49.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#AccountOwnerTransactionIdentification
	 * Transaction47.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#AccountOwnerTransactionIdentification
	 * TransactionDetails76.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#AccountOwnerTransactionIdentification
	 * Transaction45.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#AccountOwnerTransactionIdentification
	 * Transaction46.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#AccountOwnerTransactionIdentification
	 * TransactionIdentification6.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#AccountOwnerTransactionIdentification
	 * TransactionIdentifications29.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification19.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#AccountOwnerTransactionIdentification
	 * TransactionIdentifications31.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#AccountOwnerTransactionIdentification
	 * TransactionIdentifications33.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters10.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters11.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#AccountOwnerTransactionIdentification
	 * AdditionalParameters21.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails54.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#AccountOwnerTransactionIdentification
	 * TransactionIdentifications30.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#AccountOwnerTransactionIdentification
	 * TransactionIdentifications32.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#AccountOwnerTransactionIdentification
	 * Identification15.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#AccountOwnerTransactionIdentification
	 * References42Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#AccountOwnerTransactionIdentification
	 * References18.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications35#AccountOwnerTransactionIdentification
	 * TransactionIdentifications35.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#AccountOwnerTransactionIdentification
	 * AdditionalInformation12.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#AccountOwnerTransactionIdentification
	 * Transaction49.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters14.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#AccountOwnerTransactionIdentification
	 * TransactionIdentifications39.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters12.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails61.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#AccountOwnerTransactionIdentification
	 * TransactionIdentification7.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#AccountOwnerTransactionIdentification
	 * TransactionIdentifications37.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#AccountOwnerTransactionIdentification
	 * AdditionalParameters25.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#AccountOwnerTransactionIdentification
	 * TransactionIdentifications34.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#AccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification24.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#AccountOwnerTransactionIdentification
	 * TransactionDetails85.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#AccountOwnerTransactionIdentification
	 * TransactionIdentifications38.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails60.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#AccountOwnerTransactionIdentification
	 * Identification24.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#AccountOwnerTransactionIdentification
	 * Transaction50.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#AccountOwnerTransactionIdentification
	 * References51Choice.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#AccountOwnerTransactionIdentification
	 * Transaction48.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#AccountOwnerTransactionIdentification
	 * References21.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#AccountOwnerTransactionIdentification
	 * Transaction53.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails68.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters17.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#AccountOwnerTransactionIdentification
	 * AdditionalInformation13.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#AccountOwnerTransactionIdentification
	 * Transaction54.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#AccountOwnerTransactionIdentification
	 * Transaction52.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters19.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#AccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails69.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#AccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters20.
	 * AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#AccountOwnerTransactionIdentification
	 * AdditionalInformation14.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#AccountOwnerTransactionIdentification
	 * Transaction57.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#AccountOwnerTransactionIdentification
	 * Transaction56.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#AccountOwnerTransactionIdentification
	 * Transaction55.AccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#AccountOwnerTransactionIdentification
	 * TransactionDetails101.AccountOwnerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccountOwnerTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications3.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications10.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications15.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications19.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails43.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters3.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters7.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters8.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters9.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters10.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters11.AccountOwnerTransactionIdentification, com.tools20022.repository.choice.References5Choice.AccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References11Choice.AccountOwnerTransactionIdentification, com.tools20022.repository.choice.References19Choice.AccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References21Choice.AccountOwnerTransactionIdentification, com.tools20022.repository.choice.References27Choice.AccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References33Choice.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.References1.AccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References6Choice.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.References2.AccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References10Choice.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.References7.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References8.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.References9.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References13.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation3.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation4.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation7.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation8.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification1.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification8.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification9.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification15.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification10.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications2.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications7.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications9.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications13.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications16.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications22.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction7.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction9.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction14.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction15.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction20.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction23.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction28.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction30.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction6.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction13.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction18.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction29.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification2.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences3.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications1.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails18.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification7.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications4.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications11.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails11.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification6.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications6.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails9.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails21.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails22.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails29.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification2.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification3.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications18.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications20.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification5.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification8.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification11.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification13.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails15.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications8.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications14.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications17.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications23.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification9.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications5.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications12.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References14.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.IntraBalanceMovement1.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.IntraBalancePending2.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction25.AccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References36Choice.AccountOwnerTransactionIdentification, com.tools20022.repository.choice.References35Choice.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications24.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification3.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters16.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction34.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications25.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails64.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction36.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails36.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation9.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.References16.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications26.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails41.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction38.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails65.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation10.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References17.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction39.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction37.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction41.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction43.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction42.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation11.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction47.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails76.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction45.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction46.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification6.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications29.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications31.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications33.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters21.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails54.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications30.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications32.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification15.AccountOwnerTransactionIdentification, com.tools20022.repository.choice.References42Choice.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References18.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications35.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation12.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction49.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications39.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification7.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications37.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters25.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications34.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails85.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications38.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails60.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification24.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction50.AccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References51Choice.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction48.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References21.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction53.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation13.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction54.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction52.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails69.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation14.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction57.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction56.AccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction55.AccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails101.AccountOwnerTransactionIdentification);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * servicer.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications3#AccountServicerTransactionIdentification
	 * TransactionIdentifications3.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#AccountServicerTransactionIdentification
	 * TransactionIdentifications10.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#AccountServicerTransactionIdentification
	 * TransactionIdentifications15.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#AccountServicerTransactionIdentification
	 * TransactionIdentifications19.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#AccountServicerTransactionIdentification
	 * TransactionDetails41.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References1Choice#AccountServicerTransactionIdentification
	 * References1Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#AccountServicerTransactionIdentification
	 * TransactionDetails43.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#AccountServicerTransactionIdentification
	 * References12Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#AccountServicerTransactionIdentification
	 * References28Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#AccountServicerTransactionIdentification
	 * AdditionalParameters3.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#AccountServicerTransactionIdentification
	 * AdditionalParameters7.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#AccountServicerTransactionIdentification
	 * AdditionalParameters8.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#AccountServicerTransactionIdentification
	 * AdditionalParameters9.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#AccountServicerTransactionIdentification
	 * AdditionalParameters10.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#AccountServicerTransactionIdentification
	 * AdditionalParameters11.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#AccountServicerTransactionIdentification
	 * References5Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#AccountServicerTransactionIdentification
	 * References11Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#AccountServicerTransactionIdentification
	 * References19Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#AccountServicerTransactionIdentification
	 * References21Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#AccountServicerTransactionIdentification
	 * References27Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#AccountServicerTransactionIdentification
	 * References33Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters3.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters6.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#AccountServicerTransactionIdentification
	 * References14Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#AccountServicerTransactionIdentification
	 * References16Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#AccountServicerTransactionIdentification
	 * References25Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#AccountServicerTransactionIdentification
	 * References32Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#AccountServicerTransactionIdentification
	 * References1.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#AccountServicerTransactionIdentification
	 * References6Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#AccountServicerTransactionIdentification
	 * References2.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#AccountServicerTransactionIdentification
	 * References10Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#AccountServicerTransactionIdentification
	 * References7.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#AccountServicerTransactionIdentification
	 * References13Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#AccountServicerTransactionIdentification
	 * References8.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#AccountServicerTransactionIdentification
	 * References15Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#AccountServicerTransactionIdentification
	 * References9.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#AccountServicerTransactionIdentification
	 * References24Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#AccountServicerTransactionIdentification
	 * References13.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#AccountServicerTransactionIdentification
	 * References31Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification1.AccountServicerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification8.AccountServicerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification9.AccountServicerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification11.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification15.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification17.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification10.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification12.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#AccountServicerTransactionIdentification
	 * TransactionIdentifications2.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#AccountServicerTransactionIdentification
	 * TransactionIdentifications7.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#AccountServicerTransactionIdentification
	 * TransactionIdentifications9.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#AccountServicerTransactionIdentification
	 * TransactionIdentifications13.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#AccountServicerTransactionIdentification
	 * TransactionIdentifications16.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#AccountServicerTransactionIdentification
	 * TransactionIdentifications22.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#AccountServicerTransactionIdentification
	 * Transaction7.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#AccountServicerTransactionIdentification
	 * Transaction8.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#AccountServicerTransactionIdentification
	 * Transaction9.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#AccountServicerTransactionIdentification
	 * Transaction10.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#AccountServicerTransactionIdentification
	 * Transaction14.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#AccountServicerTransactionIdentification
	 * Transaction12.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#AccountServicerTransactionIdentification
	 * Transaction15.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#AccountServicerTransactionIdentification
	 * Transaction16.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#AccountServicerTransactionIdentification
	 * Transaction20.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#AccountServicerTransactionIdentification
	 * Transaction19.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#AccountServicerTransactionIdentification
	 * Transaction23.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#AccountServicerTransactionIdentification
	 * Transaction22.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#AccountServicerTransactionIdentification
	 * Transaction28.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#AccountServicerTransactionIdentification
	 * Transaction27.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#AccountServicerTransactionIdentification
	 * Transaction30.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#AccountServicerTransactionIdentification
	 * Transaction31.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#AccountServicerTransactionIdentification
	 * Transaction6.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#AccountServicerTransactionIdentification
	 * Transaction11.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#AccountServicerTransactionIdentification
	 * Transaction13.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#AccountServicerTransactionIdentification
	 * Transaction17.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#AccountServicerTransactionIdentification
	 * Transaction18.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#AccountServicerTransactionIdentification
	 * Transaction21.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#AccountServicerTransactionIdentification
	 * Transaction29.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#AccountServicerTransactionIdentification
	 * Transaction32.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#AccountServicerTransactionIdentification
	 * Identification2.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#AccountServicerReference
	 * TransactionReferences1.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#AccountServicerReference
	 * TransactionReferences2.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#AccountServicerReference
	 * TransactionReferences3.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#AccountServicerTransactionIdentification
	 * TransactionReferences3.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#AccountServicerReference
	 * ReportEntry4.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#AccountServicerReference
	 * NotificationEntry1.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#AccountServicerReference
	 * StatementEntry1.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#AccountServicerReference
	 * PaymentTransactionInformation25.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#AccountServicerReference
	 * PaymentTransaction32.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#AccountServicerReference
	 * PaymentTransaction46.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#AccountServicerReference
	 * PaymentTransactionInformation26.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#AccountServicerReference
	 * PaymentTransaction33.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#AccountServicerReference
	 * PaymentTransaction43.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#AccountServicerReference
	 * PaymentTransactionInformation34.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#AccountServicerReference
	 * PaymentTransaction41.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#AccountServicerReference
	 * PaymentTransaction49.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters2.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters7.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1#AccountServicerTransactionIdentification
	 * TransactionIdentifications1.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#AccountServicerTransactionIdentification
	 * TransactionDetails13.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails4.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails17.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#AccountServicerTransactionIdentification
	 * Identification7.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications4#AccountServicerTransactionIdentification
	 * TransactionIdentifications4.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#AccountServicerTransactionIdentification
	 * TransactionIdentifications11.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#AccountServicerTransactionIdentification
	 * TransactionDetails11.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#AccountServicerTransactionIdentification
	 * Identification6.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#AccountServicerReference
	 * StatementResolutionEntry1.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters5.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters8.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications6#AccountServicerTransactionIdentification
	 * TransactionIdentifications6.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#AccountServicerTransactionIdentification
	 * TransactionDetails21.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails10.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails22.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails23.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails29.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#AccountServicerTransactionIdentification
	 * TransactionIdentification2.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#AccountServicerTransactionIdentification
	 * TransactionIdentification3.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#AccountServicerTransactionIdentification
	 * TransactionIdentifications18.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#AccountServicerTransactionIdentification
	 * TransactionIdentifications20.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#AccountServicerTransactionIdentification
	 * Identification5.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#AccountServicerTransactionIdentification
	 * Identification8.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#AccountServicerTransactionIdentification
	 * Identification11.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#AccountServicerTransactionIdentification
	 * Identification13.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#AccountServicerTransactionIdentification
	 * TransactionDetails15.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications8#AccountServicerTransactionIdentification
	 * TransactionIdentifications8.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#AccountServicerTransactionIdentification
	 * TransactionIdentifications14.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#AccountServicerTransactionIdentification
	 * TransactionIdentifications17.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#AccountServicerTransactionIdentification
	 * TransactionIdentifications23.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#AccountServicerTransactionIdentification
	 * Identification9.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications5#AccountServicerTransactionIdentification
	 * TransactionIdentifications5.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#AccountServicerTransactionIdentification
	 * TransactionIdentifications12.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#AccountServicerReference
	 * StatementResolutionEntry2.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#AccountServicerTransactionIdentification
	 * References34Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#AccountServicerTransactionIdentification
	 * References14.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#AccountServicerTransactionIdentification
	 * IntraBalanceMovement1.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#AccountServicerTransactionIdentification
	 * IntraBalancePending2.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#AccountServicerTransactionIdentification
	 * Transaction25.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#AccountServicerTransactionIdentification
	 * References36Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#AccountServicerTransactionIdentification
	 * References35Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#AccountServicerTransactionIdentification
	 * TransactionIdentifications24.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#AccountServicerTransactionIdentification
	 * Identification3.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#AccountServicerTransactionIdentification
	 * AdditionalParameters16.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#AccountServicerTransactionIdentification
	 * Transaction34.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#AccountServicerTransactionIdentification
	 * TransactionIdentifications25.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#AccountServicerTransactionIdentification
	 * TransactionDetails64.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#AccountServicerTransactionIdentification
	 * Transaction35.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#AccountServicerTransactionIdentification
	 * Transaction36.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails35.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#AccountServicerTransactionIdentification
	 * References16.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#AccountServicerTransactionIdentification
	 * TransactionIdentifications26.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#AccountServicerTransactionIdentification
	 * Transaction38.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#AccountServicerTransactionIdentification
	 * TransactionDetails65.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails42.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#AccountServicerTransactionIdentification
	 * References17.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#AccountServicerTransactionIdentification
	 * Transaction39.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#AccountServicerTransactionIdentification
	 * Transaction37.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#AccountServicerReference
	 * PaymentTransaction52.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#AccountServicerReference
	 * ReportEntry7.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#AccountServicerReference
	 * PaymentTransaction57.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#AccountServicerTransactionIdentification
	 * Transaction41.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#AccountServicerTransactionIdentification
	 * Transaction40.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#AccountServicerReference
	 * PaymentTransaction59.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#AccountServicerTransactionIdentification
	 * Transaction43.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#AccountServicerTransactionIdentification
	 * Transaction42.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails49.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#AccountServicerTransactionIdentification
	 * Transaction47.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#AccountServicerTransactionIdentification
	 * TransactionDetails76.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#AccountServicerTransactionIdentification
	 * Transaction45.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#AccountServicerTransactionIdentification
	 * Transaction46.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#AccountServicerTransactionIdentification
	 * TransactionIdentification6.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#AccountServicerTransactionIdentification
	 * TransactionIdentifications29.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification19.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#AccountServicerTransactionIdentification
	 * TransactionIdentifications31.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#AccountServicerTransactionIdentification
	 * TransactionIdentifications33.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters10.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters11.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#AccountServicerTransactionIdentification
	 * AdditionalParameters21.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#AccountServicerTransactionIdentification
	 * TransactionIdentifications30.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#AccountServicerTransactionIdentification
	 * TransactionIdentifications32.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#AccountServicerTransactionIdentification
	 * References46Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#AccountServicerTransactionIdentification
	 * Identification15.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#AccountServicerTransactionIdentification
	 * References41Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#AccountServicerTransactionIdentification
	 * References47Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#AccountServicerTransactionIdentification
	 * References42Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#AccountServicerTransactionIdentification
	 * References18.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#AccountServicerReference
	 * PaymentTransaction63.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#AccountServicerReference
	 * PaymentTransaction68.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#AccountServicerReference
	 * ReportEntry8.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#AccountServicerReference
	 * PaymentTransaction69.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications35#AccountServicerTransactionIdentification
	 * TransactionIdentifications35.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#AccountServicerTransactionIdentification
	 * Transaction49.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters14.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#AccountServicerTransactionIdentification
	 * TransactionIdentifications39.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters12.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails61.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#AccountServicerTransactionIdentification
	 * TransactionIdentification7.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#AccountServicerTransactionIdentification
	 * TransactionIdentifications37.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#AccountServicerTransactionIdentification
	 * AdditionalParameters25.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#AccountServicerTransactionIdentification
	 * TransactionIdentifications34.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#AccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification24.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#AccountServicerTransactionIdentification
	 * TransactionDetails85.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#AccountServicerTransactionIdentification
	 * TransactionIdentifications38.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#AccountServicerTransactionIdentification
	 * References58Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#AccountServicerTransactionIdentification
	 * Identification24.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#AccountServicerTransactionIdentification
	 * Transaction50.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#AccountServicerTransactionIdentification
	 * References50Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#AccountServicerTransactionIdentification
	 * References51Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#AccountServicerTransactionIdentification
	 * Transaction48.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#AccountServicerTransactionIdentification
	 * References21.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#AccountServicerTransactionIdentification
	 * References54Choice.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#AccountServicerReference
	 * PaymentTransaction80.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#AccountServicerReference
	 * PaymentTransaction83.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#AccountServicerReference
	 * PaymentTransaction82.AccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#AccountServicerTransactionIdentification
	 * Transaction53.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails68.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters17.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#AccountServicerTransactionIdentification
	 * Transaction54.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#AccountServicerTransactionIdentification
	 * Transaction52.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters19.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#AccountServicerTransactionIdentification
	 * SecuritiesTradeDetails69.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#AccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters20.
	 * AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#AccountServicerTransactionIdentification
	 * Transaction57.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#AccountServicerTransactionIdentification
	 * Transaction56.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#AccountServicerTransactionIdentification
	 * Transaction55.AccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#AccountServicerTransactionIdentification
	 * TransactionDetails101.AccountServicerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccountServicerTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications3.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications10.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications15.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications19.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References1Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails43.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References12Choice.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References28Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters3.AccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters7.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters8.AccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters9.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters10.AccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters11.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References5Choice.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References11Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References19Choice.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References21Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References27Choice.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References33Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References14Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References16Choice.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References25Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References32Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References1.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References6Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References2.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References10Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References7.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References13Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References8.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References15Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References9.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References24Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References13.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References31Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification1.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification8.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification9.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification15.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification10.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications2.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications7.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications9.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications13.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications16.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications22.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction7.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction9.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction14.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction15.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction20.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction23.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction28.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction30.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction6.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction13.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction18.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction29.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification2.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences1.AccountServicerReference, com.tools20022.repository.msg.TransactionReferences2.AccountServicerReference,
					com.tools20022.repository.msg.TransactionReferences3.AccountServicerReference, com.tools20022.repository.msg.TransactionReferences3.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.ReportEntry4.AccountServicerReference, com.tools20022.repository.msg.NotificationEntry1.AccountServicerReference, com.tools20022.repository.msg.StatementEntry1.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransactionInformation25.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction32.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction46.AccountServicerReference, com.tools20022.repository.msg.PaymentTransactionInformation26.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction33.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction43.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransactionInformation34.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction41.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction49.AccountServicerReference, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications1.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails13.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails4.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification7.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications4.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications11.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails11.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification6.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.StatementResolutionEntry1.AccountServicerReference, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications6.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails21.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails10.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails23.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification2.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification3.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications18.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications20.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification5.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification8.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification11.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification13.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails15.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications8.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications14.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications17.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications23.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification9.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications5.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications12.AccountServicerTransactionIdentification, com.tools20022.repository.msg.StatementResolutionEntry2.AccountServicerReference,
					com.tools20022.repository.choice.References34Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References14.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.IntraBalanceMovement1.AccountServicerTransactionIdentification, com.tools20022.repository.msg.IntraBalancePending2.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction25.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References36Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References35Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications24.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification3.AccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters16.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction34.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications25.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails64.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction35.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction36.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails35.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.References16.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications26.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction38.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails65.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References17.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction39.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction37.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction52.AccountServicerReference, com.tools20022.repository.msg.ReportEntry7.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction57.AccountServicerReference, com.tools20022.repository.msg.Transaction41.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.AccountServicerTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction59.AccountServicerReference,
					com.tools20022.repository.msg.Transaction43.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction42.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction47.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails76.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction45.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction46.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification6.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications29.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications31.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications33.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.AccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters21.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications30.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications32.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References46Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification15.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References41Choice.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References47Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References42Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References18.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction63.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction68.AccountServicerReference,
					com.tools20022.repository.msg.ReportEntry8.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction69.AccountServicerReference,
					com.tools20022.repository.msg.TransactionIdentifications35.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction49.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications39.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification7.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications37.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters25.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications34.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails85.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications38.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References58Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification24.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction50.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References50Choice.AccountServicerTransactionIdentification, com.tools20022.repository.choice.References51Choice.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.AccountServicerTransactionIdentification, com.tools20022.repository.msg.References21.AccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References54Choice.AccountServicerTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction80.AccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction83.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction82.AccountServicerReference,
					com.tools20022.repository.msg.Transaction53.AccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails68.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction54.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction52.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction57.AccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction56.AccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction55.AccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails101.AccountServicerTransactionIdentification);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates whether or not the entry is the result of a reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#ReversalIndicator
	 * ReportEntry1.ReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#ReversalIndicator
	 * ReportEntry2.ReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#ReversalIndicator
	 * ReportEntry3.ReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#ReversalIndicator
	 * ReportEntry4.ReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#ReversalIndicator
	 * NotificationEntry1.ReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#ReversalIndicator
	 * StatementEntry1.ReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#ReversalIndicator
	 * ReportEntry7.ReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#ReversalIndicator
	 * ReportEntry8.ReversalIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the entry is the result of a reversal."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReversalIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry1.ReversalIndicator, com.tools20022.repository.msg.ReportEntry2.ReversalIndicator, com.tools20022.repository.msg.ReportEntry3.ReversalIndicator,
					com.tools20022.repository.msg.ReportEntry4.ReversalIndicator, com.tools20022.repository.msg.NotificationEntry1.ReversalIndicator, com.tools20022.repository.msg.StatementEntry1.ReversalIndicator,
					com.tools20022.repository.msg.ReportEntry7.ReversalIndicator, com.tools20022.repository.msg.ReportEntry8.ReversalIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Date and time assets become available to the account owner (in a credit
	 * entry), or cease to be available to the account owner (in a debit entry).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#SettlementDate
	 * LiquidityCreditTransfer1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#SettlementDate
	 * LiquidityDebitTransfer1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#TransferValueDate
	 * PaymentCommonDetails2.TransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#TransferValueDate
	 * PaymentCommonDetails3.TransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#TransferValueDate
	 * PaymentDetails6.TransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#TransferValueDate
	 * PaymentCommonDetails4.TransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#TransferValueDate
	 * PaymentDetails7.TransferValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#ValueDate
	 * ReportEntry1.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#ValueDate
	 * ReportEntry2.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#ValueDate
	 * ReportEntry3.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#ValueDate
	 * ReportEntry4.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#ValueDate
	 * NotificationEntry1.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#ValueDate
	 * StatementEntry1.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#DelayedDebitDate
	 * CashAccountCharacteristics1.DelayedDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#EffectiveSettlementDate
	 * IntraBalanceMovement2.EffectiveSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#ValueDate
	 * ReportEntry7.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#DelayedDebitDate
	 * CashAccountCharacteristics2.DelayedDebitDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#ValueDate
	 * ReportEntry8.ValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityCreditTransfer1.SettlementDate, com.tools20022.repository.msg.LiquidityDebitTransfer1.SettlementDate,
					com.tools20022.repository.msg.PaymentCommonDetails2.TransferValueDate, com.tools20022.repository.msg.PaymentCommonDetails3.TransferValueDate, com.tools20022.repository.msg.PaymentDetails6.TransferValueDate,
					com.tools20022.repository.msg.PaymentCommonDetails4.TransferValueDate, com.tools20022.repository.msg.PaymentDetails7.TransferValueDate, com.tools20022.repository.msg.ReportEntry1.ValueDate,
					com.tools20022.repository.msg.ReportEntry2.ValueDate, com.tools20022.repository.msg.ReportEntry3.ValueDate, com.tools20022.repository.msg.ReportEntry4.ValueDate,
					com.tools20022.repository.msg.NotificationEntry1.ValueDate, com.tools20022.repository.msg.StatementEntry1.ValueDate, com.tools20022.repository.msg.CashAccountCharacteristics1.DelayedDebitDate,
					com.tools20022.repository.msg.IntraBalanceMovement2.EffectiveSettlementDate, com.tools20022.repository.msg.ReportEntry7.ValueDate, com.tools20022.repository.msg.CashAccountCharacteristics2.DelayedDebitDate,
					com.tools20022.repository.msg.ReportEntry8.ValueDate);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Type of underlying transaction resulting in the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#RelatedEntry
	 * BankTransaction.RelatedEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation5#OriginalBankTransactionCode
	 * ReturnReasonInformation5.OriginalBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#BankTransactionCode
	 * EntryTransaction1.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#BankTransactionCode
	 * ReportEntry1.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation10#OriginalBankTransactionCode
	 * ReturnReasonInformation10.OriginalBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#BankTransactionCode
	 * EntryTransaction2.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#BankTransactionCode
	 * ReportEntry2.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#BankTransactionCode
	 * EntryTransaction3.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#BankTransactionCode
	 * ReportEntry3.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#BankTransactionCode
	 * EntryTransaction4.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#BankTransactionCode
	 * ReportEntry4.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#BankTransactionCode
	 * NotificationEntry1.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#BankTransactionCode
	 * StatementEntry1.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#BankTransactionCode
	 * ReportEntry7.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#BankTransactionCode
	 * EntryTransaction7.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#BankTransactionCode
	 * ReportEntry8.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#BankTransactionCode
	 * BillingServiceIdentification3.BankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#BankTransactionCode
	 * EntryTransaction8.BankTransactionCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of underlying transaction resulting in the entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankTransactionCode = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReturnReasonInformation5.OriginalBankTransactionCode, com.tools20022.repository.msg.EntryTransaction1.BankTransactionCode,
					com.tools20022.repository.msg.ReportEntry1.BankTransactionCode, com.tools20022.repository.msg.ReturnReasonInformation10.OriginalBankTransactionCode, com.tools20022.repository.msg.EntryTransaction2.BankTransactionCode,
					com.tools20022.repository.msg.ReportEntry2.BankTransactionCode, com.tools20022.repository.msg.EntryTransaction3.BankTransactionCode, com.tools20022.repository.msg.ReportEntry3.BankTransactionCode,
					com.tools20022.repository.msg.EntryTransaction4.BankTransactionCode, com.tools20022.repository.msg.ReportEntry4.BankTransactionCode, com.tools20022.repository.msg.NotificationEntry1.BankTransactionCode,
					com.tools20022.repository.msg.StatementEntry1.BankTransactionCode, com.tools20022.repository.msg.ReportEntry7.BankTransactionCode, com.tools20022.repository.msg.EntryTransaction7.BankTransactionCode,
					com.tools20022.repository.msg.ReportEntry8.BankTransactionCode, com.tools20022.repository.msg.BillingServiceIdentification3.BankTransactionCode, com.tools20022.repository.msg.EntryTransaction8.BankTransactionCode);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankTransactionCode";
			definition = "Type of underlying transaction resulting in the entry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BankTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.RelatedEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the transaction is exempt from commission or not.
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#CommissionWaiverIndicator
	 * ReportEntry1.CommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#CommissionWaiverIndicator
	 * ReportEntry2.CommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#CommissionWaiverIndicator
	 * ReportEntry3.CommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#CommissionWaiverIndicator
	 * ReportEntry4.CommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#CommissionWaiverIndicator
	 * NotificationEntry1.CommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#CommissionWaiverIndicator
	 * StatementEntry1.CommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#CommissionWaiverIndicator
	 * ReportEntry7.CommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#CommissionWaiverIndicator
	 * ReportEntry8.CommissionWaiverIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is exempt from commission or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CommissionWaiverIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry1.CommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry2.CommissionWaiverIndicator,
					com.tools20022.repository.msg.ReportEntry3.CommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry4.CommissionWaiverIndicator, com.tools20022.repository.msg.NotificationEntry1.CommissionWaiverIndicator,
					com.tools20022.repository.msg.StatementEntry1.CommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry7.CommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry8.CommissionWaiverIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role played by a party or a system in the context of an
	 * entry in an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Role#Entry
	 * Role.Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party or a system in the context of an entry in an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Role = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Specifies the role played by a party or a system in the context of an entry in an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Role.Entry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Posting of an item to an account, that results in an increase or a
	 * decrease to the balance of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#Entry
	 * Account.Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#SafekeepingAccount
	 * Transaction25.SafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting of an item to an account, that results in an increase or a decrease to the balance of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transaction25.SafekeepingAccount);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Posting of an item to an account, that results in an increase or a decrease to the balance of the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Entry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount that is the result of the sum of the entries from or to an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#BalanceEntry
	 * Balance.BalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that is the result of the sum of the entries from or to an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Amount that is the result of the sum of the entries from or to an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.BalanceEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of an entry in a report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.EntryCode
	 * EntryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of an entry in a report."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntryType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryType";
			definition = "Specifies the type of an entry in a report.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EntryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Entry";
				definition = "Posting to an account that results in an increase or decrease to a balance.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Entry, com.tools20022.repository.entity.Account.Entry, com.tools20022.repository.entity.Balance.BalanceEntry,
						com.tools20022.repository.entity.BankTransaction.RelatedEntry);
				subType_lazy = () -> Arrays.asList(CashEntry.mmObject(), SecuritiesEntry.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Entry.CreditDebitIndicator, com.tools20022.repository.entity.Entry.EntryDate, com.tools20022.repository.entity.Entry.Identification,
						com.tools20022.repository.entity.Entry.AccountOwnerTransactionIdentification, com.tools20022.repository.entity.Entry.AccountServicerTransactionIdentification,
						com.tools20022.repository.entity.Entry.ReversalIndicator, com.tools20022.repository.entity.Entry.ValueDate, com.tools20022.repository.entity.Entry.BankTransactionCode,
						com.tools20022.repository.entity.Entry.CommissionWaiverIndicator, com.tools20022.repository.entity.Entry.Role, com.tools20022.repository.entity.Entry.Account, com.tools20022.repository.entity.Entry.Balance,
						com.tools20022.repository.entity.Entry.EntryType);
				derivationComponent_lazy = () -> Arrays.asList(EntryTransaction1.mmObject(), EntryTransaction2.mmObject(), EntryTransaction3.mmObject(), EntryTransaction4.mmObject(), UnderlyingStatementEntry1.mmObject(),
						EntryTransaction7.mmObject(), EntryTransaction8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}