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
import com.tools20022.repository.codeset.AccountChoiceMethod1Code;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CardAccountType3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection43;
import com.tools20022.repository.msg.ATMTransactionAmounts8;
import com.tools20022.repository.msg.NameAndAddress3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmAccountSequenceNumber
 * CardAccount10.mmAccountSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmSelectionMethod
 * CardAccount10.mmSelectionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmSelectedAccountType
 * CardAccount10.mmSelectedAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmAccountName
 * CardAccount10.mmAccountName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmAccountOwner
 * CardAccount10.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmCurrency
 * CardAccount10.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmAccountIdentifier
 * CardAccount10.mmAccountIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmCreditReference
 * CardAccount10.mmCreditReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmServicer
 * CardAccount10.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmBalance
 * CardAccount10.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmBalanceDisplayFlag
 * CardAccount10.mmBalanceDisplayFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmDefaultAccountIndicator
 * CardAccount10.mmDefaultAccountIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmLimits
 * CardAccount10.mmLimits}</li>
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
 * "CardAccount10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer account information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CardAccount9
 * CardAccount9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardAccount10", propOrder = {"accountSequenceNumber", "selectionMethod", "selectedAccountType", "accountName", "accountOwner", "currency", "accountIdentifier", "creditReference", "servicer", "balance",
		"balanceDisplayFlag", "defaultAccountIndicator", "limits"})
public class CardAccount10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctSeqNb")
	protected Number accountSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence number of the account data for multi-account deposit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmAccountSequenceNumber
	 * CardAccount9.mmAccountSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount10, Optional<Number>> mmAccountSequenceNumber = new MMMessageAttribute<CardAccount10, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSequenceNumber";
			definition = "Sequence number of the account data for multi-account deposit.";
			previousVersion_lazy = () -> CardAccount9.mmAccountSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardAccount10 obj) {
			return obj.getAccountSequenceNumber();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<Number> value) {
			obj.setAccountSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "SelctnMtd")
	protected AccountChoiceMethod1Code selectionMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used by the cardholder and the terminal for the choice of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmSelectionMethod
	 * CardAccount9.mmSelectionMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount10, Optional<AccountChoiceMethod1Code>> mmSelectionMethod = new MMMessageAttribute<CardAccount10, Optional<AccountChoiceMethod1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "SelctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectionMethod";
			definition = "Method used by the cardholder and the terminal for the choice of the account.";
			previousVersion_lazy = () -> CardAccount9.mmSelectionMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountChoiceMethod1Code.mmObject();
		}

		@Override
		public Optional<AccountChoiceMethod1Code> getValue(CardAccount10 obj) {
			return obj.getSelectionMethod();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<AccountChoiceMethod1Code> value) {
			obj.setSelectionMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "SelctdAcctTp")
	protected CardAccountType3Code selectedAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctdAcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectedAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmSelectedAccountType
	 * CardAccount9.mmSelectedAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount10, Optional<CardAccountType3Code>> mmSelectedAccountType = new MMMessageAttribute<CardAccount10, Optional<CardAccountType3Code>>() {
		{
			businessElementTrace_lazy = () -> Account.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "SelctdAcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			previousVersion_lazy = () -> CardAccount9.mmSelectedAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType3Code.mmObject();
		}

		@Override
		public Optional<CardAccountType3Code> getValue(CardAccount10 obj) {
			return obj.getSelectedAccountType();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<CardAccountType3Code> value) {
			obj.setSelectedAccountType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmAccountName
	 * CardAccount9.mmAccountName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount10, Optional<Max70Text>> mmAccountName = new MMMessageAttribute<CardAccount10, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.";
			previousVersion_lazy = () -> CardAccount9.mmAccountName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CardAccount10 obj) {
			return obj.getAccountName();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<Max70Text> value) {
			obj.setAccountName(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected NameAndAddress3 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress3
	 * NameAndAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountOwnerRole
	 * AccountOwnerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmAccountOwner
	 * CardAccount9.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount10, Optional<NameAndAddress3>> mmAccountOwner = new MMMessageAssociationEnd<CardAccount10, Optional<NameAndAddress3>>() {
		{
			businessComponentTrace_lazy = () -> AccountOwnerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> CardAccount9.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress3.mmObject();
		}

		@Override
		public Optional<NameAndAddress3> getValue(CardAccount10 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<NameAndAddress3> value) {
			obj.setAccountOwner(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmCurrency
	 * CardAccount9.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount10, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<CardAccount10, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identification of the currency in which the account is held.";
			previousVersion_lazy = () -> CardAccount9.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CardAccount10 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<ActiveCurrencyCode> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmAccountIdentifier
	 * CardAccount9.mmAccountIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount10, Optional<AccountIdentification31Choice>> mmAccountIdentifier = new MMMessageAssociationEnd<CardAccount10, Optional<AccountIdentification31Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "AcctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentifier";
			definition = "Unique identifier of the account, as assigned by the account servicer.";
			previousVersion_lazy = () -> CardAccount9.mmAccountIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification31Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification31Choice> getValue(CardAccount10 obj) {
			return obj.getAccountIdentifier();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<AccountIdentification31Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmCreditReference
	 * CardAccount9.mmCreditReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAccount10, Optional<Max35Text>> mmCreditReference = new MMMessageAttribute<CardAccount10, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "CdtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditReference";
			definition = "Internal account reference in case of credit account.";
			previousVersion_lazy = () -> CardAccount9.mmCreditReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardAccount10 obj) {
			return obj.getCreditReference();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmServicer
	 * CardAccount9.mmServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount10, Optional<PartyIdentification72Choice>> mmServicer = new MMMessageAssociationEnd<CardAccount10, Optional<PartyIdentification72Choice>>() {
		{
			businessComponentTrace_lazy = () -> AccountServicerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			previousVersion_lazy = () -> CardAccount9.mmServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification72Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification72Choice> getValue(CardAccount10 obj) {
			return obj.getServicer();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<PartyIdentification72Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount10, Optional<AmountAndDirection43>> mmBalance = new MMMessageAssociationEnd<CardAccount10, Optional<AmountAndDirection43>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection43.mmObject();
		}

		@Override
		public Optional<AmountAndDirection43> getValue(CardAccount10 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<AmountAndDirection43> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	public static final MMMessageAttribute<CardAccount10, Optional<TrueFalseIndicator>> mmBalanceDisplayFlag = new MMMessageAttribute<CardAccount10, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
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
		public Optional<TrueFalseIndicator> getValue(CardAccount10 obj) {
			return obj.getBalanceDisplayFlag();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<TrueFalseIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
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
	public static final MMMessageAttribute<CardAccount10, Optional<TrueFalseIndicator>> mmDefaultAccountIndicator = new MMMessageAttribute<CardAccount10, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
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
		public Optional<TrueFalseIndicator> getValue(CardAccount10 obj) {
			return obj.getDefaultAccountIndicator();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<TrueFalseIndicator> value) {
			obj.setDefaultAccountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Lmts")
	protected ATMTransactionAmounts8 limits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
	 * ATMTransactionAmounts8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit of amounts for the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAccount10, Optional<ATMTransactionAmounts8>> mmLimits = new MMMessageAssociationEnd<CardAccount10, Optional<ATMTransactionAmounts8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount10.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Limit of amounts for the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts8.mmObject();
		}

		@Override
		public Optional<ATMTransactionAmounts8> getValue(CardAccount10 obj) {
			return obj.getLimits();
		}

		@Override
		public void setValue(CardAccount10 obj, Optional<ATMTransactionAmounts8> value) {
			obj.setLimits(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAccount10.mmAccountSequenceNumber, com.tools20022.repository.msg.CardAccount10.mmSelectionMethod,
						com.tools20022.repository.msg.CardAccount10.mmSelectedAccountType, com.tools20022.repository.msg.CardAccount10.mmAccountName, com.tools20022.repository.msg.CardAccount10.mmAccountOwner,
						com.tools20022.repository.msg.CardAccount10.mmCurrency, com.tools20022.repository.msg.CardAccount10.mmAccountIdentifier, com.tools20022.repository.msg.CardAccount10.mmCreditReference,
						com.tools20022.repository.msg.CardAccount10.mmServicer, com.tools20022.repository.msg.CardAccount10.mmBalance, com.tools20022.repository.msg.CardAccount10.mmBalanceDisplayFlag,
						com.tools20022.repository.msg.CardAccount10.mmDefaultAccountIndicator, com.tools20022.repository.msg.CardAccount10.mmLimits);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAccount10";
				definition = "Customer account information.";
				previousVersion_lazy = () -> CardAccount9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getAccountSequenceNumber() {
		return accountSequenceNumber == null ? Optional.empty() : Optional.of(accountSequenceNumber);
	}

	public CardAccount10 setAccountSequenceNumber(Number accountSequenceNumber) {
		this.accountSequenceNumber = accountSequenceNumber;
		return this;
	}

	public Optional<AccountChoiceMethod1Code> getSelectionMethod() {
		return selectionMethod == null ? Optional.empty() : Optional.of(selectionMethod);
	}

	public CardAccount10 setSelectionMethod(AccountChoiceMethod1Code selectionMethod) {
		this.selectionMethod = selectionMethod;
		return this;
	}

	public Optional<CardAccountType3Code> getSelectedAccountType() {
		return selectedAccountType == null ? Optional.empty() : Optional.of(selectedAccountType);
	}

	public CardAccount10 setSelectedAccountType(CardAccountType3Code selectedAccountType) {
		this.selectedAccountType = selectedAccountType;
		return this;
	}

	public Optional<Max70Text> getAccountName() {
		return accountName == null ? Optional.empty() : Optional.of(accountName);
	}

	public CardAccount10 setAccountName(Max70Text accountName) {
		this.accountName = accountName;
		return this;
	}

	public Optional<NameAndAddress3> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CardAccount10 setAccountOwner(NameAndAddress3 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public CardAccount10 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<AccountIdentification31Choice> getAccountIdentifier() {
		return accountIdentifier == null ? Optional.empty() : Optional.of(accountIdentifier);
	}

	public CardAccount10 setAccountIdentifier(AccountIdentification31Choice accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
		return this;
	}

	public Optional<Max35Text> getCreditReference() {
		return creditReference == null ? Optional.empty() : Optional.of(creditReference);
	}

	public CardAccount10 setCreditReference(Max35Text creditReference) {
		this.creditReference = creditReference;
		return this;
	}

	public Optional<PartyIdentification72Choice> getServicer() {
		return servicer == null ? Optional.empty() : Optional.of(servicer);
	}

	public CardAccount10 setServicer(PartyIdentification72Choice servicer) {
		this.servicer = servicer;
		return this;
	}

	public Optional<AmountAndDirection43> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CardAccount10 setBalance(AmountAndDirection43 balance) {
		this.balance = balance;
		return this;
	}

	public Optional<TrueFalseIndicator> getBalanceDisplayFlag() {
		return balanceDisplayFlag == null ? Optional.empty() : Optional.of(balanceDisplayFlag);
	}

	public CardAccount10 setBalanceDisplayFlag(TrueFalseIndicator balanceDisplayFlag) {
		this.balanceDisplayFlag = balanceDisplayFlag;
		return this;
	}

	public Optional<TrueFalseIndicator> getDefaultAccountIndicator() {
		return defaultAccountIndicator == null ? Optional.empty() : Optional.of(defaultAccountIndicator);
	}

	public CardAccount10 setDefaultAccountIndicator(TrueFalseIndicator defaultAccountIndicator) {
		this.defaultAccountIndicator = defaultAccountIndicator;
		return this;
	}

	public Optional<ATMTransactionAmounts8> getLimits() {
		return limits == null ? Optional.empty() : Optional.of(limits);
	}

	public CardAccount10 setLimits(ATMTransactionAmounts8 limits) {
		this.limits = limits;
		return this;
	}
}