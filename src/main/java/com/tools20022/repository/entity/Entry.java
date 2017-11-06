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
import java.util.List;

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
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmCreditDebitIndicator
 * Entry.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
 * Entry.mmEntryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmIdentification
 * Entry.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountOwnerTransactionIdentification
 * Entry.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
 * Entry.mmAccountServicerTransactionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmReversalIndicator
 * Entry.mmReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmValueDate
 * Entry.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
 * Entry.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Entry#mmCommissionWaiverIndicator
 * Entry.mmCommissionWaiverIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmRole Entry.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmAccount
 * Entry.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmBalance
 * Entry.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmEntryType
 * Entry.mmEntryType}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmEntry Role.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmEntry
 * Account.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmBalanceEntry
 * Balance.mmBalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedEntry
 * BankTransaction.mmRelatedEntry}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected DebitCreditCode creditDebitIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmCreditDebitIndicator
	 * AccountCashEntrySearch2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmCreditDebitIndicator
	 * CashAccountEntrySearch3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#mmCreditDebitIndicator
	 * PaymentCommonDetails2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#mmCreditDebitIndicator
	 * PaymentCommonDetails3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmCreditDebitIndicator
	 * PaymentCommonDetails4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmCreditDebitIndicator
	 * PaymentCommon1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmCreditDebitIndicator
	 * ReportEntry1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmCreditDebitIndicator
	 * ReportEntry2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmCreditDebitIndicator
	 * EntryTransaction3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmCreditDebitIndicator
	 * ReportEntry3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection35#mmCreditDebitIndicator
	 * AmountAndDirection35.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCreditDebitIndicator
	 * EntryTransaction4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmCreditDebitIndicator
	 * ReportEntry4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmCreditDebitIndicator
	 * NotificationEntry1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmCreditDebitIndicator
	 * StatementEntry1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionType1#mmCreditDebitIndicator
	 * TransactionType1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equalisation2#mmCreditDebitIndicator
	 * Equalisation2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmCreditDebitIndicator
	 * CashAccountEntrySearch4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#mmCreditDebitIndicator
	 * PaymentCommon2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmCreditDebitIndicator
	 * ReportEntry7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCreditDebitIndicator
	 * EntryTransaction7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmCreditDebitIndicator
	 * ReportEntry8.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCreditDebitIndicator
	 * EntryTransaction8.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.mmCreditDebitIndicator, com.tools20022.repository.msg.CashAccountEntrySearch3.mmCreditDebitIndicator,
					com.tools20022.repository.msg.PaymentCommonDetails2.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentCommonDetails3.mmCreditDebitIndicator,
					com.tools20022.repository.msg.PaymentCommonDetails4.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentCommon1.mmCreditDebitIndicator, com.tools20022.repository.msg.ReportEntry1.mmCreditDebitIndicator,
					com.tools20022.repository.msg.ReportEntry2.mmCreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction3.mmCreditDebitIndicator, com.tools20022.repository.msg.ReportEntry3.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection35.mmCreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction4.mmCreditDebitIndicator, com.tools20022.repository.msg.ReportEntry4.mmCreditDebitIndicator,
					com.tools20022.repository.msg.NotificationEntry1.mmCreditDebitIndicator, com.tools20022.repository.msg.StatementEntry1.mmCreditDebitIndicator, com.tools20022.repository.msg.TransactionType1.mmCreditDebitIndicator,
					com.tools20022.repository.msg.Equalisation2.mmCreditDebitIndicator, com.tools20022.repository.msg.CashAccountEntrySearch4.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentCommon2.mmCreditDebitIndicator,
					com.tools20022.repository.msg.ReportEntry7.mmCreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction7.mmCreditDebitIndicator, com.tools20022.repository.msg.ReportEntry8.mmCreditDebitIndicator,
					com.tools20022.repository.msg.EntryTransaction8.mmCreditDebitIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	protected ISODateTime entryDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmEntryDate
	 * AccountCashEntrySearch2.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmEntryDate
	 * CashAccountEntrySearch3.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#mmEntryDate
	 * PaymentCommonDetails2.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryDate
	 * AccountCashEntryDetails3.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#mmEntryDate
	 * PaymentCommonDetails3.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmEntryDate
	 * PaymentCommonDetails4.mmEntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon1#mmEntryDate
	 * PaymentCommon1.mmEntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1#mmDate
	 * CashEntry1.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#mmBookingDate
	 * ReportEntry1.mmBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#mmBookingDate
	 * ReportEntry2.mmBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmBookingDate
	 * ReportEntry3.mmBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmBookingDate
	 * ReportEntry4.mmBookingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmBookingDate
	 * NotificationEntry1.mmBookingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmBookingDate
	 * StatementEntry1.mmBookingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#mmPostingDateTime
	 * CorporateActionCashMovements2.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement3#mmPostingDateTime
	 * CashMovement3.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingDateDetails1#mmBookDate
	 * FinancingDateDetails1.mmBookDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingDateDetails1#mmCreditDate
	 * FinancingDateDetails1.mmCreditDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingDateDetails1#mmDebitDate
	 * FinancingDateDetails1.mmDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmPostingDate
	 * BalanceAdjustment1.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryDate
	 * CashAccountEntrySearch4.mmEntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2#mmEntryDate
	 * PaymentCommon2.mmEntryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmBookingDate
	 * ReportEntry7.mmBookingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportItem1#mmItemDate
	 * ReportItem1.mmItemDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmBookingDate
	 * ReportEntry8.mmBookingDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEntryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.mmEntryDate, com.tools20022.repository.msg.CashAccountEntrySearch3.mmEntryDate,
					com.tools20022.repository.msg.PaymentCommonDetails2.mmEntryDate, com.tools20022.repository.msg.AccountCashEntryDetails3.mmEntryDate, com.tools20022.repository.msg.PaymentCommonDetails3.mmEntryDate,
					com.tools20022.repository.msg.PaymentCommonDetails4.mmEntryDate, com.tools20022.repository.msg.PaymentCommon1.mmEntryDate, com.tools20022.repository.msg.CashEntry1.mmDate,
					com.tools20022.repository.msg.ReportEntry1.mmBookingDate, com.tools20022.repository.msg.ReportEntry2.mmBookingDate, com.tools20022.repository.msg.ReportEntry3.mmBookingDate,
					com.tools20022.repository.msg.ReportEntry4.mmBookingDate, com.tools20022.repository.msg.NotificationEntry1.mmBookingDate, com.tools20022.repository.msg.StatementEntry1.mmBookingDate,
					com.tools20022.repository.msg.CorporateActionCashMovements2.mmPostingDateTime, com.tools20022.repository.msg.CashMovement3.mmPostingDateTime, com.tools20022.repository.msg.FinancingDateDetails1.mmBookDate,
					com.tools20022.repository.msg.FinancingDateDetails1.mmCreditDate, com.tools20022.repository.msg.FinancingDateDetails1.mmDebitDate, com.tools20022.repository.msg.BalanceAdjustment1.mmPostingDate,
					com.tools20022.repository.msg.CashAccountEntrySearch4.mmEntryDate, com.tools20022.repository.msg.PaymentCommon2.mmEntryDate, com.tools20022.repository.msg.ReportEntry7.mmBookingDate,
					com.tools20022.repository.msg.ReportItem1.mmItemDate, com.tools20022.repository.msg.ReportEntry8.mmBookingDate);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Text identification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryReference
	 * AccountCashEntryDetails3.mmEntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashEntry1#mmIdentification
	 * CashEntry1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmReferences
	 * EntryTransaction1.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmAccountServicerReference
	 * ReportEntry1.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmReferences
	 * EntryTransaction2.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmEntryReference
	 * ReportEntry2.mmEntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmAccountServicerReference
	 * ReportEntry2.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmReferences
	 * EntryTransaction3.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmEntryReference
	 * ReportEntry3.mmEntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmAccountServicerReference
	 * ReportEntry3.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmReferences
	 * EntryTransaction4.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmEntryReference
	 * ReportEntry4.mmEntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingStatementEntry1#mmOriginalEntryIdentification
	 * UnderlyingStatementEntry1.mmOriginalEntryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmEntryReference
	 * ReportEntry7.mmEntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmReferences
	 * EntryTransaction7.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmAccountServicerReference
	 * CertificateIdentification1.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmEntryReference
	 * ReportEntry8.mmEntryReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmReferences
	 * EntryTransaction8.mmReferences}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntryDetails3.mmEntryReference, com.tools20022.repository.msg.CashEntry1.mmIdentification,
					com.tools20022.repository.msg.EntryTransaction1.mmReferences, com.tools20022.repository.msg.ReportEntry1.mmAccountServicerReference, com.tools20022.repository.msg.EntryTransaction2.mmReferences,
					com.tools20022.repository.msg.ReportEntry2.mmEntryReference, com.tools20022.repository.msg.ReportEntry2.mmAccountServicerReference, com.tools20022.repository.msg.EntryTransaction3.mmReferences,
					com.tools20022.repository.msg.ReportEntry3.mmEntryReference, com.tools20022.repository.msg.ReportEntry3.mmAccountServicerReference, com.tools20022.repository.msg.EntryTransaction4.mmReferences,
					com.tools20022.repository.msg.ReportEntry4.mmEntryReference, com.tools20022.repository.msg.UnderlyingStatementEntry1.mmOriginalEntryIdentification, com.tools20022.repository.msg.ReportEntry7.mmEntryReference,
					com.tools20022.repository.msg.EntryTransaction7.mmReferences, com.tools20022.repository.msg.CertificateIdentification1.mmAccountServicerReference, com.tools20022.repository.msg.ReportEntry8.mmEntryReference,
					com.tools20022.repository.msg.EntryTransaction8.mmReferences);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an entry, as assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text accountOwnerTransactionIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications3#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications3.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications10.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications15.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications19.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#mmAccountOwnerTransactionIdentification
	 * TransactionDetails41.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#mmAccountOwnerTransactionIdentification
	 * TransactionDetails43.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters3.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters7.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters8.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters9.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters10.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters11.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#mmAccountOwnerTransactionIdentification
	 * References5Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#mmAccountOwnerTransactionIdentification
	 * References11Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#mmAccountOwnerTransactionIdentification
	 * References19Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#mmAccountOwnerTransactionIdentification
	 * References21Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#mmAccountOwnerTransactionIdentification
	 * References27Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#mmAccountOwnerTransactionIdentification
	 * References33Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters3.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters6.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#mmAccountOwnerTransactionIdentification
	 * References1.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#mmAccountOwnerTransactionIdentification
	 * References6Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#mmAccountOwnerTransactionIdentification
	 * References2.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#mmAccountOwnerTransactionIdentification
	 * References10Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#mmAccountOwnerTransactionIdentification
	 * References7.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#mmAccountOwnerTransactionIdentification
	 * References8.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#mmAccountOwnerTransactionIdentification
	 * References9.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#mmAccountOwnerTransactionIdentification
	 * References13.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation3.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation4.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation7.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation8.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification1.mmAccountOwnerTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification8.mmAccountOwnerTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification9.mmAccountOwnerTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification11.mmAccountOwnerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification15.mmAccountOwnerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification17.mmAccountOwnerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification10.mmAccountOwnerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification12.mmAccountOwnerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications2.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications7.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications9.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications13.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications16.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications22.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmAccountOwnerTransactionIdentification
	 * Transaction7.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmAccountOwnerTransactionIdentification
	 * Transaction8.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmAccountOwnerTransactionIdentification
	 * Transaction9.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmAccountOwnerTransactionIdentification
	 * Transaction10.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmAccountOwnerTransactionIdentification
	 * Transaction14.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmAccountOwnerTransactionIdentification
	 * Transaction12.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmAccountOwnerTransactionIdentification
	 * Transaction15.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmAccountOwnerTransactionIdentification
	 * Transaction16.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmAccountOwnerTransactionIdentification
	 * Transaction20.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmAccountOwnerTransactionIdentification
	 * Transaction19.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmAccountOwnerTransactionIdentification
	 * Transaction23.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmAccountOwnerTransactionIdentification
	 * Transaction22.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmAccountOwnerTransactionIdentification
	 * Transaction28.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmAccountOwnerTransactionIdentification
	 * Transaction27.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmAccountOwnerTransactionIdentification
	 * Transaction30.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmAccountOwnerTransactionIdentification
	 * Transaction31.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmAccountOwnerTransactionIdentification
	 * Transaction6.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmAccountOwnerTransactionIdentification
	 * Transaction11.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmAccountOwnerTransactionIdentification
	 * Transaction13.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmAccountOwnerTransactionIdentification
	 * Transaction17.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmAccountOwnerTransactionIdentification
	 * Transaction18.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmAccountOwnerTransactionIdentification
	 * Transaction21.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmAccountOwnerTransactionIdentification
	 * Transaction29.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmAccountOwnerTransactionIdentification
	 * Transaction32.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmAccountOwnerTransactionIdentification
	 * Identification2.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmAccountOwnerTransactionIdentification
	 * TransactionReferences3.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters2.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters7.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications1.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails8.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails18.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails4.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails17.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmAccountOwnerTransactionIdentification
	 * Identification7.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications4#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications4.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications11.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#mmAccountOwnerTransactionIdentification
	 * TransactionDetails11.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmAccountOwnerTransactionIdentification
	 * Identification6.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters5.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters8.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications6#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications6.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails9.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails21.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails10.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails22.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails23.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails29.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#mmAccountOwnerTransactionIdentification
	 * TransactionIdentification2.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#mmAccountOwnerTransactionIdentification
	 * TransactionIdentification3.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications18.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications20.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmAccountOwnerTransactionIdentification
	 * Identification5.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmAccountOwnerTransactionIdentification
	 * Identification8.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmAccountOwnerTransactionIdentification
	 * Identification11.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmAccountOwnerTransactionIdentification
	 * Identification13.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#mmAccountOwnerTransactionIdentification
	 * TransactionDetails15.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications8#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications8.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications14.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications17.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications23.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmAccountOwnerTransactionIdentification
	 * Identification9.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications5#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications5.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications12.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#mmAccountOwnerTransactionIdentification
	 * References14.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmAccountOwnerTransactionIdentification
	 * IntraBalanceMovement1.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmAccountOwnerTransactionIdentification
	 * IntraBalancePending2.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmAccountOwnerTransactionIdentification
	 * Transaction25.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#mmAccountOwnerTransactionIdentification
	 * References36Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmAccountOwnerTransactionIdentification
	 * References35Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications24.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmAccountOwnerTransactionIdentification
	 * Identification3.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters16.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmAccountOwnerTransactionIdentification
	 * Transaction34.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications25.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#mmAccountOwnerTransactionIdentification
	 * TransactionDetails64.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmAccountOwnerTransactionIdentification
	 * Transaction35.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmAccountOwnerTransactionIdentification
	 * Transaction36.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails35.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails36.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation9.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#mmAccountOwnerTransactionIdentification
	 * References16.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications26.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails41.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmAccountOwnerTransactionIdentification
	 * Transaction38.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#mmAccountOwnerTransactionIdentification
	 * TransactionDetails65.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation10.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails42.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#mmAccountOwnerTransactionIdentification
	 * References17.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmAccountOwnerTransactionIdentification
	 * Transaction39.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmAccountOwnerTransactionIdentification
	 * Transaction37.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmAccountOwnerTransactionIdentification
	 * Transaction41.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmAccountOwnerTransactionIdentification
	 * Transaction40.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmAccountOwnerTransactionIdentification
	 * Transaction43.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmAccountOwnerTransactionIdentification
	 * Transaction42.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation11.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails49.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmAccountOwnerTransactionIdentification
	 * Transaction47.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmAccountOwnerTransactionIdentification
	 * TransactionDetails76.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmAccountOwnerTransactionIdentification
	 * Transaction45.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmAccountOwnerTransactionIdentification
	 * Transaction46.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#mmAccountOwnerTransactionIdentification
	 * TransactionIdentification6.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications29.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification19.mmAccountOwnerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications31.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications33.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters10.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters11.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters21.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails54.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications30.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications32.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmAccountOwnerTransactionIdentification
	 * Identification15.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmAccountOwnerTransactionIdentification
	 * References42Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmAccountOwnerTransactionIdentification
	 * References18.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications35#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications35.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation12.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmAccountOwnerTransactionIdentification
	 * Transaction49.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters14.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications39.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters12.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails61.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#mmAccountOwnerTransactionIdentification
	 * TransactionIdentification7.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications37.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmAccountOwnerTransactionIdentification
	 * AdditionalParameters25.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications34.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmAccountOwnerTransactionIdentification
	 * SettlementTypeAndIdentification24.mmAccountOwnerTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#mmAccountOwnerTransactionIdentification
	 * TransactionDetails85.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#mmAccountOwnerTransactionIdentification
	 * TransactionIdentifications38.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails60.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmAccountOwnerTransactionIdentification
	 * Identification24.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmAccountOwnerTransactionIdentification
	 * Transaction50.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#mmAccountOwnerTransactionIdentification
	 * References51Choice.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmAccountOwnerTransactionIdentification
	 * Transaction48.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#mmAccountOwnerTransactionIdentification
	 * References21.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmAccountOwnerTransactionIdentification
	 * Transaction53.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails68.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters17.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation13.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmAccountOwnerTransactionIdentification
	 * Transaction54.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmAccountOwnerTransactionIdentification
	 * Transaction52.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters19.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmAccountOwnerTransactionIdentification
	 * SecuritiesTradeDetails69.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#mmAccountOwnerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters20.
	 * mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#mmAccountOwnerTransactionIdentification
	 * AdditionalInformation14.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmAccountOwnerTransactionIdentification
	 * Transaction57.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmAccountOwnerTransactionIdentification
	 * Transaction56.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmAccountOwnerTransactionIdentification
	 * Transaction55.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#mmAccountOwnerTransactionIdentification
	 * TransactionDetails101.mmAccountOwnerTransactionIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAccountOwnerTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications3.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications10.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications15.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications19.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails43.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters3.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters7.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters8.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters9.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters10.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters11.mmAccountOwnerTransactionIdentification, com.tools20022.repository.choice.References5Choice.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References11Choice.mmAccountOwnerTransactionIdentification, com.tools20022.repository.choice.References19Choice.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References21Choice.mmAccountOwnerTransactionIdentification, com.tools20022.repository.choice.References27Choice.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References33Choice.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.References1.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References6Choice.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.References2.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References10Choice.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.References7.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References8.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.References9.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References13.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation3.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation4.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation7.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation8.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification1.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification8.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification9.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification15.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification10.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications2.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications7.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications9.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications13.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications16.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications22.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction7.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction9.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction14.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction15.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction20.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction23.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction28.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction30.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction6.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction13.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction18.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction29.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification2.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences3.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications1.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails18.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification7.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications4.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications11.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails11.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification6.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications6.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails9.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails21.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails22.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails29.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification2.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification3.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications18.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications20.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification5.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification8.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Identification11.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification13.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails15.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications8.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications14.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications17.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications23.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification9.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications5.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications12.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References14.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.IntraBalanceMovement1.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.IntraBalancePending2.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction25.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References36Choice.mmAccountOwnerTransactionIdentification, com.tools20022.repository.choice.References35Choice.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications24.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification3.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters16.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction34.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications25.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails64.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction36.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails36.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation9.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.References16.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications26.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails41.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction38.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails65.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalInformation10.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.References17.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction39.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction37.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction41.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction43.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction42.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation11.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction47.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails76.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction45.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction46.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification6.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications29.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications31.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications33.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters21.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails54.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications30.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications32.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification15.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.choice.References42Choice.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.References18.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications35.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation12.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications39.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification7.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications37.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters25.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications34.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification24.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails85.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications38.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails60.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Identification24.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction50.mmAccountOwnerTransactionIdentification, com.tools20022.repository.choice.References51Choice.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.References21.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails68.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation13.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction54.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction52.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails69.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.AdditionalInformation14.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction57.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.Transaction56.mmAccountOwnerTransactionIdentification,
					com.tools20022.repository.msg.Transaction55.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails101.mmAccountOwnerTransactionIdentification);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text accountServicerTransactionIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications3#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications3.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications10.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications15.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications19.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#mmAccountServicerTransactionIdentification
	 * TransactionDetails41.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References1Choice#mmAccountServicerTransactionIdentification
	 * References1Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#mmAccountServicerTransactionIdentification
	 * TransactionDetails43.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#mmAccountServicerTransactionIdentification
	 * References12Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#mmAccountServicerTransactionIdentification
	 * References28Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#mmAccountServicerTransactionIdentification
	 * AdditionalParameters3.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#mmAccountServicerTransactionIdentification
	 * AdditionalParameters7.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmAccountServicerTransactionIdentification
	 * AdditionalParameters8.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmAccountServicerTransactionIdentification
	 * AdditionalParameters9.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmAccountServicerTransactionIdentification
	 * AdditionalParameters10.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmAccountServicerTransactionIdentification
	 * AdditionalParameters11.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#mmAccountServicerTransactionIdentification
	 * References5Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#mmAccountServicerTransactionIdentification
	 * References11Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#mmAccountServicerTransactionIdentification
	 * References19Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#mmAccountServicerTransactionIdentification
	 * References21Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#mmAccountServicerTransactionIdentification
	 * References27Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#mmAccountServicerTransactionIdentification
	 * References33Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters3.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters6.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#mmAccountServicerTransactionIdentification
	 * References14Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#mmAccountServicerTransactionIdentification
	 * References16Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#mmAccountServicerTransactionIdentification
	 * References25Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#mmAccountServicerTransactionIdentification
	 * References32Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#mmAccountServicerTransactionIdentification
	 * References1.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#mmAccountServicerTransactionIdentification
	 * References6Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#mmAccountServicerTransactionIdentification
	 * References2.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#mmAccountServicerTransactionIdentification
	 * References10Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#mmAccountServicerTransactionIdentification
	 * References7.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#mmAccountServicerTransactionIdentification
	 * References13Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#mmAccountServicerTransactionIdentification
	 * References8.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#mmAccountServicerTransactionIdentification
	 * References15Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#mmAccountServicerTransactionIdentification
	 * References9.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#mmAccountServicerTransactionIdentification
	 * References24Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#mmAccountServicerTransactionIdentification
	 * References13.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#mmAccountServicerTransactionIdentification
	 * References31Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification1.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification8.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification9.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification11.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification15.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification17.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification10.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification12.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications2.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications7.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications9.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications13.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications16.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications22.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmAccountServicerTransactionIdentification
	 * Transaction7.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmAccountServicerTransactionIdentification
	 * Transaction8.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmAccountServicerTransactionIdentification
	 * Transaction9.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmAccountServicerTransactionIdentification
	 * Transaction10.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmAccountServicerTransactionIdentification
	 * Transaction14.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmAccountServicerTransactionIdentification
	 * Transaction12.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmAccountServicerTransactionIdentification
	 * Transaction15.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmAccountServicerTransactionIdentification
	 * Transaction16.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmAccountServicerTransactionIdentification
	 * Transaction20.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmAccountServicerTransactionIdentification
	 * Transaction19.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmAccountServicerTransactionIdentification
	 * Transaction23.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmAccountServicerTransactionIdentification
	 * Transaction22.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmAccountServicerTransactionIdentification
	 * Transaction28.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmAccountServicerTransactionIdentification
	 * Transaction27.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmAccountServicerTransactionIdentification
	 * Transaction30.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmAccountServicerTransactionIdentification
	 * Transaction31.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmAccountServicerTransactionIdentification
	 * Transaction6.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmAccountServicerTransactionIdentification
	 * Transaction11.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmAccountServicerTransactionIdentification
	 * Transaction13.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmAccountServicerTransactionIdentification
	 * Transaction17.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmAccountServicerTransactionIdentification
	 * Transaction18.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmAccountServicerTransactionIdentification
	 * Transaction21.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmAccountServicerTransactionIdentification
	 * Transaction29.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmAccountServicerTransactionIdentification
	 * Transaction32.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmAccountServicerTransactionIdentification
	 * Identification2.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmAccountServicerReference
	 * TransactionReferences1.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmAccountServicerReference
	 * TransactionReferences2.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmAccountServicerReference
	 * TransactionReferences3.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmAccountServicerTransactionIdentification
	 * TransactionReferences3.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmAccountServicerReference
	 * ReportEntry4.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAccountServicerReference
	 * NotificationEntry1.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmAccountServicerReference
	 * StatementEntry1.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmAccountServicerReference
	 * PaymentTransactionInformation25.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmAccountServicerReference
	 * PaymentTransaction32.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmAccountServicerReference
	 * PaymentTransaction46.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmAccountServicerReference
	 * PaymentTransactionInformation26.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmAccountServicerReference
	 * PaymentTransaction33.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmAccountServicerReference
	 * PaymentTransaction43.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmAccountServicerReference
	 * PaymentTransactionInformation34.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmAccountServicerReference
	 * PaymentTransaction41.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmAccountServicerReference
	 * PaymentTransaction49.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters2.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters7.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications1.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#mmAccountServicerTransactionIdentification
	 * TransactionDetails13.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails4.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails17.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmAccountServicerTransactionIdentification
	 * Identification7.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications4#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications4.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications11.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#mmAccountServicerTransactionIdentification
	 * TransactionDetails11.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmAccountServicerTransactionIdentification
	 * Identification6.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#mmAccountServicerReference
	 * StatementResolutionEntry1.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters5.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters8.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications6#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications6.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#mmAccountServicerTransactionIdentification
	 * TransactionDetails21.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails10.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails22.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails23.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails29.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#mmAccountServicerTransactionIdentification
	 * TransactionIdentification2.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#mmAccountServicerTransactionIdentification
	 * TransactionIdentification3.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications18.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications20.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmAccountServicerTransactionIdentification
	 * Identification5.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmAccountServicerTransactionIdentification
	 * Identification8.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmAccountServicerTransactionIdentification
	 * Identification11.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmAccountServicerTransactionIdentification
	 * Identification13.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#mmAccountServicerTransactionIdentification
	 * TransactionDetails15.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications8#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications8.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications14.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications17.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications23.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmAccountServicerTransactionIdentification
	 * Identification9.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications5#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications5.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications12.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmAccountServicerReference
	 * StatementResolutionEntry2.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#mmAccountServicerTransactionIdentification
	 * References34Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#mmAccountServicerTransactionIdentification
	 * References14.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmAccountServicerTransactionIdentification
	 * IntraBalanceMovement1.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmAccountServicerTransactionIdentification
	 * IntraBalancePending2.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmAccountServicerTransactionIdentification
	 * Transaction25.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#mmAccountServicerTransactionIdentification
	 * References36Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmAccountServicerTransactionIdentification
	 * References35Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications24.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmAccountServicerTransactionIdentification
	 * Identification3.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmAccountServicerTransactionIdentification
	 * AdditionalParameters16.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmAccountServicerTransactionIdentification
	 * Transaction34.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications25.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#mmAccountServicerTransactionIdentification
	 * TransactionDetails64.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmAccountServicerTransactionIdentification
	 * Transaction35.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmAccountServicerTransactionIdentification
	 * Transaction36.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails35.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#mmAccountServicerTransactionIdentification
	 * References16.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications26.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmAccountServicerTransactionIdentification
	 * Transaction38.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#mmAccountServicerTransactionIdentification
	 * TransactionDetails65.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails42.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#mmAccountServicerTransactionIdentification
	 * References17.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmAccountServicerTransactionIdentification
	 * Transaction39.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmAccountServicerTransactionIdentification
	 * Transaction37.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmAccountServicerReference
	 * PaymentTransaction52.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAccountServicerReference
	 * ReportEntry7.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmAccountServicerReference
	 * PaymentTransaction57.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmAccountServicerTransactionIdentification
	 * Transaction41.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmAccountServicerTransactionIdentification
	 * Transaction40.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmAccountServicerReference
	 * PaymentTransaction59.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmAccountServicerTransactionIdentification
	 * Transaction43.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmAccountServicerTransactionIdentification
	 * Transaction42.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails49.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmAccountServicerTransactionIdentification
	 * Transaction47.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmAccountServicerTransactionIdentification
	 * TransactionDetails76.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmAccountServicerTransactionIdentification
	 * Transaction45.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmAccountServicerTransactionIdentification
	 * Transaction46.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#mmAccountServicerTransactionIdentification
	 * TransactionIdentification6.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications29.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification19.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications31.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications33.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters10.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters11.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmAccountServicerTransactionIdentification
	 * AdditionalParameters21.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications30.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications32.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmAccountServicerTransactionIdentification
	 * References46Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmAccountServicerTransactionIdentification
	 * Identification15.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmAccountServicerTransactionIdentification
	 * References41Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmAccountServicerTransactionIdentification
	 * References47Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmAccountServicerTransactionIdentification
	 * References42Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmAccountServicerTransactionIdentification
	 * References18.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmAccountServicerReference
	 * PaymentTransaction63.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmAccountServicerReference
	 * PaymentTransaction68.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmAccountServicerReference
	 * ReportEntry8.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmAccountServicerReference
	 * PaymentTransaction69.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications35#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications35.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmAccountServicerTransactionIdentification
	 * Transaction49.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters14.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications39.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters12.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails61.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#mmAccountServicerTransactionIdentification
	 * TransactionIdentification7.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications37.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmAccountServicerTransactionIdentification
	 * AdditionalParameters25.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications34.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmAccountServicerTransactionIdentification
	 * SettlementTypeAndIdentification24.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#mmAccountServicerTransactionIdentification
	 * TransactionDetails85.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#mmAccountServicerTransactionIdentification
	 * TransactionIdentifications38.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#mmAccountServicerTransactionIdentification
	 * References58Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmAccountServicerTransactionIdentification
	 * Identification24.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmAccountServicerTransactionIdentification
	 * Transaction50.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#mmAccountServicerTransactionIdentification
	 * References50Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#mmAccountServicerTransactionIdentification
	 * References51Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmAccountServicerTransactionIdentification
	 * Transaction48.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#mmAccountServicerTransactionIdentification
	 * References21.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#mmAccountServicerTransactionIdentification
	 * References54Choice.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmAccountServicerReference
	 * PaymentTransaction80.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmAccountServicerReference
	 * PaymentTransaction83.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmAccountServicerReference
	 * PaymentTransaction82.mmAccountServicerReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmAccountServicerTransactionIdentification
	 * Transaction53.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails68.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters17.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmAccountServicerTransactionIdentification
	 * Transaction54.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmAccountServicerTransactionIdentification
	 * Transaction52.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters19.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmAccountServicerTransactionIdentification
	 * SecuritiesTradeDetails69.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#mmAccountServicerTransactionIdentification
	 * TransactionTypeAndAdditionalParameters20.
	 * mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmAccountServicerTransactionIdentification
	 * Transaction57.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmAccountServicerTransactionIdentification
	 * Transaction56.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmAccountServicerTransactionIdentification
	 * Transaction55.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#mmAccountServicerTransactionIdentification
	 * TransactionDetails101.mmAccountServicerTransactionIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAccountServicerTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications3.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications10.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications15.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications19.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References1Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails43.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References12Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References28Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters3.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters7.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters8.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters9.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters10.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters11.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References5Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References11Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References19Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References21Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References27Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References33Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References14Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References16Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References25Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References32Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References1.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References6Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References2.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References10Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References7.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References13Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References8.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References15Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References9.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References24Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References13.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References31Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification1.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification8.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification9.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification15.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification10.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications2.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications7.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications9.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications13.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications16.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications22.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction7.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction9.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction14.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction15.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction20.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction23.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction28.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction30.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction6.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction13.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction18.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction29.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification2.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences1.mmAccountServicerReference, com.tools20022.repository.msg.TransactionReferences2.mmAccountServicerReference,
					com.tools20022.repository.msg.TransactionReferences3.mmAccountServicerReference, com.tools20022.repository.msg.TransactionReferences3.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.ReportEntry4.mmAccountServicerReference, com.tools20022.repository.msg.NotificationEntry1.mmAccountServicerReference,
					com.tools20022.repository.msg.StatementEntry1.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransactionInformation25.mmAccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction32.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransaction46.mmAccountServicerReference,
					com.tools20022.repository.msg.PaymentTransactionInformation26.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransaction33.mmAccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction43.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransactionInformation34.mmAccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction41.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransaction49.mmAccountServicerReference,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications1.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails13.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails4.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification7.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications4.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications11.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails11.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification6.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.StatementResolutionEntry1.mmAccountServicerReference, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications6.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails21.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails10.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails23.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification2.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification3.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications18.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications20.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification5.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification8.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification11.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification13.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails15.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications8.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications14.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications17.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications23.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification9.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications5.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications12.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.StatementResolutionEntry2.mmAccountServicerReference,
					com.tools20022.repository.choice.References34Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References14.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.IntraBalanceMovement1.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.IntraBalancePending2.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction25.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References36Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References35Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications24.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification3.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters16.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction34.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications25.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails64.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction35.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction36.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails35.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.References16.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications26.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction38.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails65.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References17.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction39.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction37.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction52.mmAccountServicerReference, com.tools20022.repository.msg.ReportEntry7.mmAccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction57.mmAccountServicerReference, com.tools20022.repository.msg.Transaction41.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction59.mmAccountServicerReference,
					com.tools20022.repository.msg.Transaction43.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction42.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction47.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails76.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction45.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction46.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification6.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications29.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications31.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications33.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters21.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications30.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications32.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References46Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Identification15.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References41Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References47Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References42Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References18.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction63.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransaction68.mmAccountServicerReference,
					com.tools20022.repository.msg.ReportEntry8.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransaction69.mmAccountServicerReference,
					com.tools20022.repository.msg.TransactionIdentifications35.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction49.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications39.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification7.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications37.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters25.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications34.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails85.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications38.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References58Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Identification24.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction50.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References50Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.choice.References51Choice.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.References21.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.choice.References54Choice.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction80.mmAccountServicerReference,
					com.tools20022.repository.msg.PaymentTransaction83.mmAccountServicerReference, com.tools20022.repository.msg.PaymentTransaction82.mmAccountServicerReference,
					com.tools20022.repository.msg.Transaction53.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails68.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction54.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction52.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction57.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.Transaction56.mmAccountServicerTransactionIdentification,
					com.tools20022.repository.msg.Transaction55.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionDetails101.mmAccountServicerTransactionIdentification);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TrueFalseIndicator reversalIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmReversalIndicator
	 * ReportEntry1.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmReversalIndicator
	 * ReportEntry2.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmReversalIndicator
	 * ReportEntry3.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmReversalIndicator
	 * ReportEntry4.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmReversalIndicator
	 * NotificationEntry1.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmReversalIndicator
	 * StatementEntry1.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmReversalIndicator
	 * ReportEntry7.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmReversalIndicator
	 * ReportEntry8.mmReversalIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmReversalIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry1.mmReversalIndicator, com.tools20022.repository.msg.ReportEntry2.mmReversalIndicator,
					com.tools20022.repository.msg.ReportEntry3.mmReversalIndicator, com.tools20022.repository.msg.ReportEntry4.mmReversalIndicator, com.tools20022.repository.msg.NotificationEntry1.mmReversalIndicator,
					com.tools20022.repository.msg.StatementEntry1.mmReversalIndicator, com.tools20022.repository.msg.ReportEntry7.mmReversalIndicator, com.tools20022.repository.msg.ReportEntry8.mmReversalIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected ISODateTime valueDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmSettlementDate
	 * LiquidityCreditTransfer1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#mmSettlementDate
	 * LiquidityDebitTransfer1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#mmTransferValueDate
	 * PaymentCommonDetails2.mmTransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#mmTransferValueDate
	 * PaymentCommonDetails3.mmTransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmTransferValueDate
	 * PaymentDetails6.mmTransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmTransferValueDate
	 * PaymentCommonDetails4.mmTransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmTransferValueDate
	 * PaymentDetails7.mmTransferValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#mmValueDate
	 * ReportEntry1.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#mmValueDate
	 * ReportEntry2.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmValueDate
	 * ReportEntry3.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmValueDate
	 * ReportEntry4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmValueDate
	 * NotificationEntry1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmValueDate
	 * StatementEntry1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmDelayedDebitDate
	 * CashAccountCharacteristics1.mmDelayedDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmEffectiveSettlementDate
	 * IntraBalanceMovement2.mmEffectiveSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmValueDate
	 * ReportEntry7.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDelayedDebitDate
	 * CashAccountCharacteristics2.mmDelayedDebitDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmValueDate
	 * ReportEntry8.mmValueDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityCreditTransfer1.mmSettlementDate, com.tools20022.repository.msg.LiquidityDebitTransfer1.mmSettlementDate,
					com.tools20022.repository.msg.PaymentCommonDetails2.mmTransferValueDate, com.tools20022.repository.msg.PaymentCommonDetails3.mmTransferValueDate, com.tools20022.repository.msg.PaymentDetails6.mmTransferValueDate,
					com.tools20022.repository.msg.PaymentCommonDetails4.mmTransferValueDate, com.tools20022.repository.msg.PaymentDetails7.mmTransferValueDate, com.tools20022.repository.msg.ReportEntry1.mmValueDate,
					com.tools20022.repository.msg.ReportEntry2.mmValueDate, com.tools20022.repository.msg.ReportEntry3.mmValueDate, com.tools20022.repository.msg.ReportEntry4.mmValueDate,
					com.tools20022.repository.msg.NotificationEntry1.mmValueDate, com.tools20022.repository.msg.StatementEntry1.mmValueDate, com.tools20022.repository.msg.CashAccountCharacteristics1.mmDelayedDebitDate,
					com.tools20022.repository.msg.IntraBalanceMovement2.mmEffectiveSettlementDate, com.tools20022.repository.msg.ReportEntry7.mmValueDate, com.tools20022.repository.msg.CashAccountCharacteristics2.mmDelayedDebitDate,
					com.tools20022.repository.msg.ReportEntry8.mmValueDate);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected BankTransaction bankTransactionCode;
	/**
	 * Type of underlying transaction resulting in the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmRelatedEntry
	 * BankTransaction.mmRelatedEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation5#mmOriginalBankTransactionCode
	 * ReturnReasonInformation5.mmOriginalBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmBankTransactionCode
	 * EntryTransaction1.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmBankTransactionCode
	 * ReportEntry1.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation10#mmOriginalBankTransactionCode
	 * ReturnReasonInformation10.mmOriginalBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmBankTransactionCode
	 * EntryTransaction2.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmBankTransactionCode
	 * ReportEntry2.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmBankTransactionCode
	 * EntryTransaction3.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmBankTransactionCode
	 * ReportEntry3.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmBankTransactionCode
	 * EntryTransaction4.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmBankTransactionCode
	 * ReportEntry4.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmBankTransactionCode
	 * NotificationEntry1.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmBankTransactionCode
	 * StatementEntry1.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmBankTransactionCode
	 * ReportEntry7.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmBankTransactionCode
	 * EntryTransaction7.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmBankTransactionCode
	 * ReportEntry8.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmBankTransactionCode
	 * BillingServiceIdentification3.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmBankTransactionCode
	 * EntryTransaction8.mmBankTransactionCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmBankTransactionCode = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReturnReasonInformation5.mmOriginalBankTransactionCode, com.tools20022.repository.msg.EntryTransaction1.mmBankTransactionCode,
					com.tools20022.repository.msg.ReportEntry1.mmBankTransactionCode, com.tools20022.repository.msg.ReturnReasonInformation10.mmOriginalBankTransactionCode,
					com.tools20022.repository.msg.EntryTransaction2.mmBankTransactionCode, com.tools20022.repository.msg.ReportEntry2.mmBankTransactionCode, com.tools20022.repository.msg.EntryTransaction3.mmBankTransactionCode,
					com.tools20022.repository.msg.ReportEntry3.mmBankTransactionCode, com.tools20022.repository.msg.EntryTransaction4.mmBankTransactionCode, com.tools20022.repository.msg.ReportEntry4.mmBankTransactionCode,
					com.tools20022.repository.msg.NotificationEntry1.mmBankTransactionCode, com.tools20022.repository.msg.StatementEntry1.mmBankTransactionCode, com.tools20022.repository.msg.ReportEntry7.mmBankTransactionCode,
					com.tools20022.repository.msg.EntryTransaction7.mmBankTransactionCode, com.tools20022.repository.msg.ReportEntry8.mmBankTransactionCode, com.tools20022.repository.msg.BillingServiceIdentification3.mmBankTransactionCode,
					com.tools20022.repository.msg.EntryTransaction8.mmBankTransactionCode);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankTransactionCode";
			definition = "Type of underlying transaction resulting in the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmRelatedEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
		}
	};
	protected YesNoIndicator commissionWaiverIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmCommissionWaiverIndicator
	 * ReportEntry1.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry2#mmCommissionWaiverIndicator
	 * ReportEntry2.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmCommissionWaiverIndicator
	 * ReportEntry3.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmCommissionWaiverIndicator
	 * ReportEntry4.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmCommissionWaiverIndicator
	 * NotificationEntry1.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmCommissionWaiverIndicator
	 * StatementEntry1.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmCommissionWaiverIndicator
	 * ReportEntry7.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmCommissionWaiverIndicator
	 * ReportEntry8.mmCommissionWaiverIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCommissionWaiverIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry1.mmCommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry2.mmCommissionWaiverIndicator,
					com.tools20022.repository.msg.ReportEntry3.mmCommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry4.mmCommissionWaiverIndicator,
					com.tools20022.repository.msg.NotificationEntry1.mmCommissionWaiverIndicator, com.tools20022.repository.msg.StatementEntry1.mmCommissionWaiverIndicator,
					com.tools20022.repository.msg.ReportEntry7.mmCommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry8.mmCommissionWaiverIndicator);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Role> role;
	/**
	 * Specifies the role played by a party or a system in the context of an
	 * entry in an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Role#mmEntry
	 * Role.mmEntry}</li>
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
	public static final MMBusinessAssociationEnd mmRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Specifies the role played by a party or a system in the context of an entry in an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.mmEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * Posting of an item to an account, that results in an increase or a
	 * decrease to the balance of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#mmEntry
	 * Account.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Entry
	 * Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmSafekeepingAccount
	 * Transaction25.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transaction25.mmSafekeepingAccount);
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Posting of an item to an account, that results in an increase or a decrease to the balance of the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Balance> balance;
	/**
	 * Amount that is the result of the sum of the entries from or to an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmBalanceEntry
	 * Balance.mmBalanceEntry}</li>
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
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Amount that is the result of the sum of the entries from or to an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmBalanceEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected EntryCode entryType;
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
	public static final MMBusinessAttribute mmEntryType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Entry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryType";
			definition = "Specifies the type of an entry in a report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Entry";
				definition = "Posting to an account that results in an increase or decrease to a balance.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.mmEntry, com.tools20022.repository.entity.Account.mmEntry, com.tools20022.repository.entity.Balance.mmBalanceEntry,
						com.tools20022.repository.entity.BankTransaction.mmRelatedEntry);
				subType_lazy = () -> Arrays.asList(CashEntry.mmObject(), SecuritiesEntry.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Entry.mmCreditDebitIndicator, com.tools20022.repository.entity.Entry.mmEntryDate, com.tools20022.repository.entity.Entry.mmIdentification,
						com.tools20022.repository.entity.Entry.mmAccountOwnerTransactionIdentification, com.tools20022.repository.entity.Entry.mmAccountServicerTransactionIdentification,
						com.tools20022.repository.entity.Entry.mmReversalIndicator, com.tools20022.repository.entity.Entry.mmValueDate, com.tools20022.repository.entity.Entry.mmBankTransactionCode,
						com.tools20022.repository.entity.Entry.mmCommissionWaiverIndicator, com.tools20022.repository.entity.Entry.mmRole, com.tools20022.repository.entity.Entry.mmAccount, com.tools20022.repository.entity.Entry.mmBalance,
						com.tools20022.repository.entity.Entry.mmEntryType);
				derivationComponent_lazy = () -> Arrays.asList(EntryTransaction1.mmObject(), EntryTransaction2.mmObject(), EntryTransaction3.mmObject(), EntryTransaction4.mmObject(), UnderlyingStatementEntry1.mmObject(),
						EntryTransaction7.mmObject(), EntryTransaction8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public ISODateTime getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(ISODateTime entryDate) {
		this.entryDate = entryDate;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Max35Text getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public void setAccountOwnerTransactionIdentification(Max35Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = accountOwnerTransactionIdentification;
	}

	public Max35Text getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(Max35Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
	}

	public TrueFalseIndicator getReversalIndicator() {
		return reversalIndicator;
	}

	public void setReversalIndicator(TrueFalseIndicator reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODateTime valueDate) {
		this.valueDate = valueDate;
	}

	public BankTransaction getBankTransactionCode() {
		return bankTransactionCode;
	}

	public void setBankTransactionCode(com.tools20022.repository.entity.BankTransaction bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
	}

	public YesNoIndicator getCommissionWaiverIndicator() {
		return commissionWaiverIndicator;
	}

	public void setCommissionWaiverIndicator(YesNoIndicator commissionWaiverIndicator) {
		this.commissionWaiverIndicator = commissionWaiverIndicator;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<com.tools20022.repository.entity.Role> role) {
		this.role = role;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = account;
	}

	public List<Balance> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.entity.Balance> balance) {
		this.balance = balance;
	}

	public EntryCode getEntryType() {
		return entryType;
	}

	public void setEntryType(EntryCode entryType) {
		this.entryType = entryType;
	}
}