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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AccountIdentification31Choice;
import com.tools20022.repository.choice.PartyIdentification72Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ATMServiceType4Code;
import com.tools20022.repository.codeset.CardAccountType2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.AccountServicerRole;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection43;
import com.tools20022.repository.msg.ATMTransactionAmounts4;
import com.tools20022.repository.msg.ATMTransactionAmounts5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Customer account information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountType
 * CardAccount6.mmAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountName
 * CardAccount6.mmAccountName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmCurrency
 * CardAccount6.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountIdentifier
 * CardAccount6.mmAccountIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmCreditReference
 * CardAccount6.mmCreditReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmServicer
 * CardAccount6.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmBalance
 * CardAccount6.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount6#mmBalanceDisplayFlag
 * CardAccount6.mmBalanceDisplayFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount6#mmDefaultAccountIndicator
 * CardAccount6.mmDefaultAccountIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmAllowedServices
 * CardAccount6.mmAllowedServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount6#mmWithdrawalLimits
 * CardAccount6.mmWithdrawalLimits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmDepositLimits
 * CardAccount6.mmDepositLimits}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
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
 * "CardAccount6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer account information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CardAccount4
 * CardAccount4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardAccount6", propOrder = {"accountType", "accountName", "currency", "accountIdentifier", "creditReference", "servicer", "balance", "balanceDisplayFlag", "defaultAccountIndicator", "allowedServices", "withdrawalLimits",
		"depositLimits"})
public class CardAccount6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctTp")
	protected CardAccountType2Code accountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
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
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmSelectedAccountType
	 * CardAccount4.mmSelectedAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount6, Optional<CardAccountType2Code>> mmAccountType = new MMMessageAttribute<CardAccount6, Optional<CardAccountType2Code>>() {
		{
			businessElementTrace_lazy = () -> Account.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Type of cardholder account used for the transaction.";
			previousVersion_lazy = () -> CardAccount4.mmSelectedAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType2Code.mmObject();
		}

		@Override
		public Optional<CardAccountType2Code> getValue(CardAccount6 obj) {
			return obj.getAccountType();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<CardAccountType2Code> value) {
			obj.setAccountType(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctNm")
	protected Max70Text accountName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountName
	 * CardAccount4.mmAccountName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount6, Optional<Max70Text>> mmAccountName = new MMMessageAttribute<CardAccount6, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.";
			previousVersion_lazy = () -> CardAccount4.mmAccountName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CardAccount6 obj) {
			return obj.getAccountName();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<Max70Text> value) {
			obj.setAccountName(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the currency in which the account is held."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmCurrency
	 * CardAccount4.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount6, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<CardAccount6, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identification of the currency in which the account is held.";
			previousVersion_lazy = () -> CardAccount4.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CardAccount6 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctIdr")
	protected AccountIdentification31Choice accountIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice
	 * AccountIdentification31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the account, as assigned by the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountIdentifier
	 * CardAccount4.mmAccountIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount6, Optional<AccountIdentification31Choice>> mmAccountIdentifier = new MMMessageAssociationEnd<CardAccount6, Optional<AccountIdentification31Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "AcctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentifier";
			definition = "Unique identifier of the account, as assigned by the account servicer.";
			previousVersion_lazy = () -> CardAccount4.mmAccountIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification31Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification31Choice> getValue(CardAccount6 obj) {
			return obj.getAccountIdentifier();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<AccountIdentification31Choice> value) {
			obj.setAccountIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtRef")
	protected Max35Text creditReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Internal account reference in case of credit account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmCreditReference
	 * CardAccount4.mmCreditReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount6, Optional<Max35Text>> mmCreditReference = new MMMessageAttribute<CardAccount6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "CdtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditReference";
			definition = "Internal account reference in case of credit account.";
			previousVersion_lazy = () -> CardAccount4.mmCreditReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardAccount6 obj) {
			return obj.getCreditReference();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<Max35Text> value) {
			obj.setCreditReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Svcr")
	protected PartyIdentification72Choice servicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
	 * PartyIdentification72Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountServicerRole
	 * AccountServicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Servicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmServicer
	 * CardAccount4.mmServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount6, Optional<PartyIdentification72Choice>> mmServicer = new MMMessageAssociationEnd<CardAccount6, Optional<PartyIdentification72Choice>>() {
		{
			businessComponentTrace_lazy = () -> AccountServicerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			previousVersion_lazy = () -> CardAccount4.mmServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification72Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification72Choice> getValue(CardAccount6 obj) {
			return obj.getServicer();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<PartyIdentification72Choice> value) {
			obj.setServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "Bal")
	protected AmountAndDirection43 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection43
	 * AmountAndDirection43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmBalance
	 * CardAccount4.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount6, Optional<AmountAndDirection43>> mmBalance = new MMMessageAssociationEnd<CardAccount6, Optional<AmountAndDirection43>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance of the account.";
			previousVersion_lazy = () -> CardAccount4.mmBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection43.mmObject();
		}

		@Override
		public Optional<AmountAndDirection43> getValue(CardAccount6 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<AmountAndDirection43> value) {
			obj.setBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "BalDispFlg")
	protected TrueFalseIndicator balanceDisplayFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalDispFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceDisplayFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the balance must be displayed to the customer on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount6, Optional<TrueFalseIndicator>> mmBalanceDisplayFlag = new MMMessageAttribute<CardAccount6, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "BalDispFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceDisplayFlag";
			definition = "Indicates if the balance must be displayed to the customer on the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CardAccount6 obj) {
			return obj.getBalanceDisplayFlag();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<TrueFalseIndicator> value) {
			obj.setBalanceDisplayFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "DfltAcctInd")
	protected TrueFalseIndicator defaultAccountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this is the default account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount6, Optional<TrueFalseIndicator>> mmDefaultAccountIndicator = new MMMessageAttribute<CardAccount6, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "DfltAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAccountIndicator";
			definition = "Indicates if this is the default account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CardAccount6 obj) {
			return obj.getDefaultAccountIndicator();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<TrueFalseIndicator> value) {
			obj.setDefaultAccountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AllwdSvcs")
	protected List<ATMServiceType4Code> allowedServices;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwdSvcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services allowed on the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount6, List<ATMServiceType4Code>> mmAllowedServices = new MMMessageAttribute<CardAccount6, List<ATMServiceType4Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "AllwdSvcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowedServices";
			definition = "Services allowed on the account.";
			minOccurs = 0;
			simpleType_lazy = () -> ATMServiceType4Code.mmObject();
		}

		@Override
		public List<ATMServiceType4Code> getValue(CardAccount6 obj) {
			return obj.getAllowedServices();
		}

		@Override
		public void setValue(CardAccount6 obj, List<ATMServiceType4Code> value) {
			obj.setAllowedServices(value);
		}
	};
	@XmlElement(name = "WdrwlLmts")
	protected ATMTransactionAmounts4 withdrawalLimits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
	 * ATMTransactionAmounts4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlLmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalLimits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal limits for the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount6, Optional<ATMTransactionAmounts4>> mmWithdrawalLimits = new MMMessageAssociationEnd<CardAccount6, Optional<ATMTransactionAmounts4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "WdrwlLmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalLimits";
			definition = "Withdrawal limits for the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts4.mmObject();
		}

		@Override
		public Optional<ATMTransactionAmounts4> getValue(CardAccount6 obj) {
			return obj.getWithdrawalLimits();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<ATMTransactionAmounts4> value) {
			obj.setWithdrawalLimits(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstLmts")
	protected ATMTransactionAmounts5 depositLimits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts5
	 * ATMTransactionAmounts5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstLmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositLimits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit limits for the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount6, Optional<ATMTransactionAmounts5>> mmDepositLimits = new MMMessageAssociationEnd<CardAccount6, Optional<ATMTransactionAmounts5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount6.mmObject();
			isDerived = false;
			xmlTag = "DpstLmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositLimits";
			definition = "Deposit limits for the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts5.mmObject();
		}

		@Override
		public Optional<ATMTransactionAmounts5> getValue(CardAccount6 obj) {
			return obj.getDepositLimits();
		}

		@Override
		public void setValue(CardAccount6 obj, Optional<ATMTransactionAmounts5> value) {
			obj.setDepositLimits(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAccount6.mmAccountType, com.tools20022.repository.msg.CardAccount6.mmAccountName, com.tools20022.repository.msg.CardAccount6.mmCurrency,
						com.tools20022.repository.msg.CardAccount6.mmAccountIdentifier, com.tools20022.repository.msg.CardAccount6.mmCreditReference, com.tools20022.repository.msg.CardAccount6.mmServicer,
						com.tools20022.repository.msg.CardAccount6.mmBalance, com.tools20022.repository.msg.CardAccount6.mmBalanceDisplayFlag, com.tools20022.repository.msg.CardAccount6.mmDefaultAccountIndicator,
						com.tools20022.repository.msg.CardAccount6.mmAllowedServices, com.tools20022.repository.msg.CardAccount6.mmWithdrawalLimits, com.tools20022.repository.msg.CardAccount6.mmDepositLimits);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAccount6";
				definition = "Customer account information.";
				previousVersion_lazy = () -> CardAccount4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardAccountType2Code> getAccountType() {
		return accountType == null ? Optional.empty() : Optional.of(accountType);
	}

	public CardAccount6 setAccountType(CardAccountType2Code accountType) {
		this.accountType = accountType;
		return this;
	}

	public Optional<Max70Text> getAccountName() {
		return accountName == null ? Optional.empty() : Optional.of(accountName);
	}

	public CardAccount6 setAccountName(Max70Text accountName) {
		this.accountName = accountName;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public CardAccount6 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<AccountIdentification31Choice> getAccountIdentifier() {
		return accountIdentifier == null ? Optional.empty() : Optional.of(accountIdentifier);
	}

	public CardAccount6 setAccountIdentifier(AccountIdentification31Choice accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
		return this;
	}

	public Optional<Max35Text> getCreditReference() {
		return creditReference == null ? Optional.empty() : Optional.of(creditReference);
	}

	public CardAccount6 setCreditReference(Max35Text creditReference) {
		this.creditReference = creditReference;
		return this;
	}

	public Optional<PartyIdentification72Choice> getServicer() {
		return servicer == null ? Optional.empty() : Optional.of(servicer);
	}

	public CardAccount6 setServicer(PartyIdentification72Choice servicer) {
		this.servicer = servicer;
		return this;
	}

	public Optional<AmountAndDirection43> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CardAccount6 setBalance(AmountAndDirection43 balance) {
		this.balance = balance;
		return this;
	}

	public Optional<TrueFalseIndicator> getBalanceDisplayFlag() {
		return balanceDisplayFlag == null ? Optional.empty() : Optional.of(balanceDisplayFlag);
	}

	public CardAccount6 setBalanceDisplayFlag(TrueFalseIndicator balanceDisplayFlag) {
		this.balanceDisplayFlag = balanceDisplayFlag;
		return this;
	}

	public Optional<TrueFalseIndicator> getDefaultAccountIndicator() {
		return defaultAccountIndicator == null ? Optional.empty() : Optional.of(defaultAccountIndicator);
	}

	public CardAccount6 setDefaultAccountIndicator(TrueFalseIndicator defaultAccountIndicator) {
		this.defaultAccountIndicator = defaultAccountIndicator;
		return this;
	}

	public List<ATMServiceType4Code> getAllowedServices() {
		return allowedServices == null ? allowedServices = new ArrayList<>() : allowedServices;
	}

	public CardAccount6 setAllowedServices(List<ATMServiceType4Code> allowedServices) {
		this.allowedServices = Objects.requireNonNull(allowedServices);
		return this;
	}

	public Optional<ATMTransactionAmounts4> getWithdrawalLimits() {
		return withdrawalLimits == null ? Optional.empty() : Optional.of(withdrawalLimits);
	}

	public CardAccount6 setWithdrawalLimits(ATMTransactionAmounts4 withdrawalLimits) {
		this.withdrawalLimits = withdrawalLimits;
		return this;
	}

	public Optional<ATMTransactionAmounts5> getDepositLimits() {
		return depositLimits == null ? Optional.empty() : Optional.of(depositLimits);
	}

	public CardAccount6 setDepositLimits(ATMTransactionAmounts5 depositLimits) {
		this.depositLimits = depositLimits;
		return this;
	}
}