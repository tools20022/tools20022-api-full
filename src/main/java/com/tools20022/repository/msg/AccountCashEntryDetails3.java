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
import com.tools20022.repository.choice.AccountIdentification1Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.CashAccountType2Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.EntryStatus1Code;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountIdentification
 * AccountCashEntryDetails3.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountCurrency
 * AccountCashEntryDetails3.mmAccountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountType
 * AccountCashEntryDetails3.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryReference
 * AccountCashEntryDetails3.mmEntryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryAmount
 * AccountCashEntryDetails3.mmEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryDate
 * AccountCashEntryDetails3.mmEntryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryStatus
 * AccountCashEntryDetails3.mmEntryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountOwner
 * AccountCashEntryDetails3.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountServicer
 * AccountCashEntryDetails3.mmAccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountCashEntryDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountCashEntryDetails3", propOrder = {"accountIdentification", "accountCurrency", "accountType", "entryReference", "entryAmount", "entryDate", "entryStatus", "accountOwner", "accountServicer"})
public class AccountCashEntryDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected AccountIdentification1Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice
	 * AccountIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
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
	public static final MMMessageAttribute<AccountCashEntryDetails3, AccountIdentification1Choice> mmAccountIdentification = new MMMessageAttribute<AccountCashEntryDetails3, AccountIdentification1Choice>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification1Choice.mmObject();
		}

		@Override
		public AccountIdentification1Choice getValue(AccountCashEntryDetails3 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, AccountIdentification1Choice value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctCcy")
	protected CurrencyCode accountCurrency;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<CurrencyCode>> mmAccountCurrency = new MMMessageAttribute<AccountCashEntryDetails3, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
			isDerived = false;
			xmlTag = "AcctCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCurrency";
			definition = "Medium of exchange of value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(AccountCashEntryDetails3 obj) {
			return obj.getAccountCurrency();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<CurrencyCode> value) {
			obj.setAccountCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTp")
	protected CashAccountType2Code accountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountType
	 * CashAccount.mmCashAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<CashAccountType2Code>> mmAccountType = new MMMessageAttribute<AccountCashEntryDetails3, Optional<CashAccountType2Code>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Specifies the nature, or use, of the cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CashAccountType2Code.mmObject();
		}

		@Override
		public Optional<CashAccountType2Code> getValue(AccountCashEntryDetails3 obj) {
			return obj.getAccountType();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<CashAccountType2Code> value) {
			obj.setAccountType(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryRef")
	protected Max35Text entryReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmIdentification
	 * Entry.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an entry, as assigned by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<Max35Text>> mmEntryReference = new MMMessageAttribute<AccountCashEntryDetails3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
			isDerived = false;
			xmlTag = "NtryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryReference";
			definition = "Unique and unambiguous identifier for an entry, as assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AccountCashEntryDetails3 obj) {
			return obj.getEntryReference();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<Max35Text> value) {
			obj.setEntryReference(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryAmt")
	protected CurrencyAndAmount entryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
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
	 * definition} = "Amount of money in the cash entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<CurrencyAndAmount>> mmEntryAmount = new MMMessageAttribute<AccountCashEntryDetails3, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
			isDerived = false;
			xmlTag = "NtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmount";
			definition = "Amount of money in the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(AccountCashEntryDetails3 obj) {
			return obj.getEntryAmount();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<CurrencyAndAmount> value) {
			obj.setEntryAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryDt")
	protected DateAndDateTimeChoice entryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
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
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<DateAndDateTimeChoice>> mmEntryDate = new MMMessageAttribute<AccountCashEntryDetails3, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
			isDerived = false;
			xmlTag = "NtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(AccountCashEntryDetails3 obj) {
			return obj.getEntryDate();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setEntryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NtrySts")
	protected EntryStatus1Code entryStatus;
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
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
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
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<EntryStatus1Code>> mmEntryStatus = new MMMessageAttribute<AccountCashEntryDetails3, Optional<EntryStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmEntryStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
			isDerived = false;
			xmlTag = "NtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EntryStatus1Code.mmObject();
		}

		@Override
		public Optional<EntryStatus1Code> getValue(AccountCashEntryDetails3 obj) {
			return obj.getEntryStatus();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<EntryStatus1Code> value) {
			obj.setEntryStatus(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
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
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<AnyBICIdentifier>> mmAccountOwner = new MMMessageAttribute<AccountCashEntryDetails3, Optional<AnyBICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
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
		public Optional<AnyBICIdentifier> getValue(AccountCashEntryDetails3 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<AnyBICIdentifier> value) {
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3
	 * AccountCashEntryDetails3}</li>
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
	public static final MMMessageAttribute<AccountCashEntryDetails3, Optional<BICIdentifier>> mmAccountServicer = new MMMessageAttribute<AccountCashEntryDetails3, Optional<BICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryDetails3.mmObject();
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
		public Optional<BICIdentifier> getValue(AccountCashEntryDetails3 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(AccountCashEntryDetails3 obj, Optional<BICIdentifier> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntryDetails3.mmAccountIdentification, com.tools20022.repository.msg.AccountCashEntryDetails3.mmAccountCurrency,
						com.tools20022.repository.msg.AccountCashEntryDetails3.mmAccountType, com.tools20022.repository.msg.AccountCashEntryDetails3.mmEntryReference, com.tools20022.repository.msg.AccountCashEntryDetails3.mmEntryAmount,
						com.tools20022.repository.msg.AccountCashEntryDetails3.mmEntryDate, com.tools20022.repository.msg.AccountCashEntryDetails3.mmEntryStatus, com.tools20022.repository.msg.AccountCashEntryDetails3.mmAccountOwner,
						com.tools20022.repository.msg.AccountCashEntryDetails3.mmAccountServicer);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AccountCashEntryDetails3";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification1Choice getAccountIdentification() {
		return accountIdentification;
	}

	public AccountCashEntryDetails3 setAccountIdentification(AccountIdentification1Choice accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Optional<CurrencyCode> getAccountCurrency() {
		return accountCurrency == null ? Optional.empty() : Optional.of(accountCurrency);
	}

	public AccountCashEntryDetails3 setAccountCurrency(CurrencyCode accountCurrency) {
		this.accountCurrency = accountCurrency;
		return this;
	}

	public Optional<CashAccountType2Code> getAccountType() {
		return accountType == null ? Optional.empty() : Optional.of(accountType);
	}

	public AccountCashEntryDetails3 setAccountType(CashAccountType2Code accountType) {
		this.accountType = accountType;
		return this;
	}

	public Optional<Max35Text> getEntryReference() {
		return entryReference == null ? Optional.empty() : Optional.of(entryReference);
	}

	public AccountCashEntryDetails3 setEntryReference(Max35Text entryReference) {
		this.entryReference = entryReference;
		return this;
	}

	public Optional<CurrencyAndAmount> getEntryAmount() {
		return entryAmount == null ? Optional.empty() : Optional.of(entryAmount);
	}

	public AccountCashEntryDetails3 setEntryAmount(CurrencyAndAmount entryAmount) {
		this.entryAmount = entryAmount;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getEntryDate() {
		return entryDate == null ? Optional.empty() : Optional.of(entryDate);
	}

	public AccountCashEntryDetails3 setEntryDate(DateAndDateTimeChoice entryDate) {
		this.entryDate = entryDate;
		return this;
	}

	public Optional<EntryStatus1Code> getEntryStatus() {
		return entryStatus == null ? Optional.empty() : Optional.of(entryStatus);
	}

	public AccountCashEntryDetails3 setEntryStatus(EntryStatus1Code entryStatus) {
		this.entryStatus = entryStatus;
		return this;
	}

	public Optional<AnyBICIdentifier> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public AccountCashEntryDetails3 setAccountOwner(AnyBICIdentifier accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<BICIdentifier> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public AccountCashEntryDetails3 setAccountServicer(BICIdentifier accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}