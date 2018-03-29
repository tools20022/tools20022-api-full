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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice;
import com.tools20022.repository.choice.AmountRangeChoice;
import com.tools20022.repository.choice.DateAndDateTimeSearchChoice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.EntryStatus1Code;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a cash entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmAccountIdentification
 * AccountCashEntrySearch2.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmEntryAmount
 * AccountCashEntrySearch2.mmEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmEntryAmountCurrency
 * AccountCashEntrySearch2.mmEntryAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmCreditDebitIndicator
 * AccountCashEntrySearch2.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmEntryStatus
 * AccountCashEntrySearch2.mmEntryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmEntryDate
 * AccountCashEntrySearch2.mmEntryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmAccountOwner
 * AccountCashEntrySearch2.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmAccountServicer
 * AccountCashEntrySearch2.mmAccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule#forAccountCashEntrySearch2
 * ConstraintEntryAmountCreditDebitIndicator1Rule.forAccountCashEntrySearch2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator2Rule#forAccountCashEntrySearch2
 * ConstraintEntryAmountCreditDebitIndicator2Rule.forAccountCashEntrySearch2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountCashEntrySearch2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a cash entry."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountCashEntrySearch2", propOrder = {"accountIdentification", "entryAmount", "entryAmountCurrency", "creditDebitIndicator", "entryStatus", "entryDate", "accountOwner", "accountServicer"})
public class AccountCashEntrySearch2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected List<AccountIdentificationSearchCriteriaChoice> accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice
	 * AccountIdentificationSearchCriteriaChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, List<AccountIdentificationSearchCriteriaChoice>> mmAccountIdentification = new MMMessageAttribute<AccountCashEntrySearch2, List<AccountIdentificationSearchCriteriaChoice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationSearchCriteriaChoice.mmObject();
		}

		@Override
		public List<AccountIdentificationSearchCriteriaChoice> getValue(AccountCashEntrySearch2 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, List<AccountIdentificationSearchCriteriaChoice> value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "NtryAmt")
	protected List<AmountRangeChoice> entryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountRangeChoice
	 * AmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entry amount(s) on which the query is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, List<AmountRangeChoice>> mmEntryAmount = new MMMessageAttribute<AccountCashEntrySearch2, List<AmountRangeChoice>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "NtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmount";
			definition = "Specifies the entry amount(s) on which the query is performed.";
			minOccurs = 0;
			complexType_lazy = () -> AmountRangeChoice.mmObject();
		}

		@Override
		public List<AmountRangeChoice> getValue(AccountCashEntrySearch2 obj) {
			return obj.getEntryAmount();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, List<AmountRangeChoice> value) {
			obj.setEntryAmount(value);
		}
	};
	@XmlElement(name = "NtryAmtCcy")
	protected List<CurrencyCode> entryAmountCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryAmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the entry amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, List<CurrencyCode>> mmEntryAmountCurrency = new MMMessageAttribute<AccountCashEntrySearch2, List<CurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "NtryAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountCurrency";
			definition = "Currency of the entry amount.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public List<CurrencyCode> getValue(AccountCashEntrySearch2 obj) {
			return obj.getEntryAmountCurrency();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, List<CurrencyCode> value) {
			obj.setEntryAmountCurrency(value);
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmCreditDebitIndicator
	 * Entry.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether an entry is a credit or a debit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<AccountCashEntrySearch2, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(AccountCashEntrySearch2 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NtrySts")
	protected List<EntryStatus1Code> entryStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatus1Code
	 * EntryStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmEntryStatus
	 * AccountStatus.mmEntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, List<EntryStatus1Code>> mmEntryStatus = new MMMessageAttribute<AccountCashEntrySearch2, List<EntryStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmEntryStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "NtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			minOccurs = 0;
			simpleType_lazy = () -> EntryStatus1Code.mmObject();
		}

		@Override
		public List<EntryStatus1Code> getValue(AccountCashEntrySearch2 obj) {
			return obj.getEntryStatus();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, List<EntryStatus1Code> value) {
			obj.setEntryStatus(value);
		}
	};
	@XmlElement(name = "NtryDt")
	protected List<DateAndDateTimeSearchChoice> entryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
	 * DateAndDateTimeSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which an entry is posted to an account on the account servicer's books."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, List<DateAndDateTimeSearchChoice>> mmEntryDate = new MMMessageAttribute<AccountCashEntrySearch2, List<DateAndDateTimeSearchChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "NtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}

		@Override
		public List<DateAndDateTimeSearchChoice> getValue(AccountCashEntrySearch2 obj) {
			return obj.getEntryDate();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, List<DateAndDateTimeSearchChoice> value) {
			obj.setEntryDate(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected AnyBICIdentifier accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, Optional<AnyBICIdentifier>> mmAccountOwner = new MMMessageAttribute<AccountCashEntrySearch2, Optional<AnyBICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public Optional<AnyBICIdentifier> getValue(AccountCashEntrySearch2 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, Optional<AnyBICIdentifier> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BICIdentifier accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2
	 * AccountCashEntrySearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntrySearch2, Optional<BICIdentifier>> mmAccountServicer = new MMMessageAttribute<AccountCashEntrySearch2, Optional<BICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntrySearch2.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}

		@Override
		public Optional<BICIdentifier> getValue(AccountCashEntrySearch2 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(AccountCashEntrySearch2 obj, Optional<BICIdentifier> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.mmAccountIdentification, com.tools20022.repository.msg.AccountCashEntrySearch2.mmEntryAmount,
						com.tools20022.repository.msg.AccountCashEntrySearch2.mmEntryAmountCurrency, com.tools20022.repository.msg.AccountCashEntrySearch2.mmCreditDebitIndicator,
						com.tools20022.repository.msg.AccountCashEntrySearch2.mmEntryStatus, com.tools20022.repository.msg.AccountCashEntrySearch2.mmEntryDate, com.tools20022.repository.msg.AccountCashEntrySearch2.mmAccountOwner,
						com.tools20022.repository.msg.AccountCashEntrySearch2.mmAccountServicer);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule.forAccountCashEntrySearch2,
						com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator2Rule.forAccountCashEntrySearch2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AccountCashEntrySearch2";
				definition = "Defines the criteria used to search for a cash entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentificationSearchCriteriaChoice> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public AccountCashEntrySearch2 setAccountIdentification(List<AccountIdentificationSearchCriteriaChoice> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public List<AmountRangeChoice> getEntryAmount() {
		return entryAmount == null ? entryAmount = new ArrayList<>() : entryAmount;
	}

	public AccountCashEntrySearch2 setEntryAmount(List<AmountRangeChoice> entryAmount) {
		this.entryAmount = Objects.requireNonNull(entryAmount);
		return this;
	}

	public List<CurrencyCode> getEntryAmountCurrency() {
		return entryAmountCurrency == null ? entryAmountCurrency = new ArrayList<>() : entryAmountCurrency;
	}

	public AccountCashEntrySearch2 setEntryAmountCurrency(List<CurrencyCode> entryAmountCurrency) {
		this.entryAmountCurrency = Objects.requireNonNull(entryAmountCurrency);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public AccountCashEntrySearch2 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public List<EntryStatus1Code> getEntryStatus() {
		return entryStatus == null ? entryStatus = new ArrayList<>() : entryStatus;
	}

	public AccountCashEntrySearch2 setEntryStatus(List<EntryStatus1Code> entryStatus) {
		this.entryStatus = Objects.requireNonNull(entryStatus);
		return this;
	}

	public List<DateAndDateTimeSearchChoice> getEntryDate() {
		return entryDate == null ? entryDate = new ArrayList<>() : entryDate;
	}

	public AccountCashEntrySearch2 setEntryDate(List<DateAndDateTimeSearchChoice> entryDate) {
		this.entryDate = Objects.requireNonNull(entryDate);
		return this;
	}

	public Optional<AnyBICIdentifier> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public AccountCashEntrySearch2 setAccountOwner(AnyBICIdentifier accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<BICIdentifier> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public AccountCashEntrySearch2 setAccountServicer(BICIdentifier accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}