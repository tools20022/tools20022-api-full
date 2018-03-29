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
import com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice;
import com.tools20022.repository.choice.CashAccountType2Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.CashBalance9;
import com.tools20022.repository.msg.PartyIdentification125;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6#mmAccountIdentification
 * CashAccountSearchCriteria6.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6#mmType
 * CashAccountSearchCriteria6.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6#mmCurrency
 * CashAccountSearchCriteria6.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6#mmBalance
 * CashAccountSearchCriteria6.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6#mmAccountOwner
 * CashAccountSearchCriteria6.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6#mmAccountServicer
 * CashAccountSearchCriteria6.mmAccountServicer}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline#forCashAccountSearchCriteria6
 * ConstraintCashAccountIdentificationGuideline.forCashAccountSearchCriteria6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountSearchCriteria6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for an account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5
 * CashAccountSearchCriteria5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountSearchCriteria6", propOrder = {"accountIdentification", "type", "currency", "balance", "accountOwner", "accountServicer"})
public class CashAccountSearchCriteria6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected List<AccountIdentificationSearchCriteria2Choice> accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6
	 * CashAccountSearchCriteria6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmAccountIdentification
	 * CashAccountSearchCriteria5.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountSearchCriteria6, List<AccountIdentificationSearchCriteria2Choice>> mmAccountIdentification = new MMMessageAssociationEnd<CashAccountSearchCriteria6, List<AccountIdentificationSearchCriteria2Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> CashAccountSearchCriteria5.mmAccountIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}

		@Override
		public List<AccountIdentificationSearchCriteria2Choice> getValue(CashAccountSearchCriteria6 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(CashAccountSearchCriteria6 obj, List<AccountIdentificationSearchCriteria2Choice> value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "Tp")
	protected List<CashAccountType2Choice> type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice
	 * CashAccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountType
	 * CashAccount.mmCashAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6
	 * CashAccountSearchCriteria6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmType
	 * CashAccountSearchCriteria5.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountSearchCriteria6, List<CashAccountType2Choice>> mmType = new MMMessageAttribute<CashAccountSearchCriteria6, List<CashAccountType2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature, or use, of the cash account.";
			previousVersion_lazy = () -> CashAccountSearchCriteria5.mmType;
			minOccurs = 0;
			complexType_lazy = () -> CashAccountType2Choice.mmObject();
		}

		@Override
		public List<CashAccountType2Choice> getValue(CashAccountSearchCriteria6 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CashAccountSearchCriteria6 obj, List<CashAccountType2Choice> value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Ccy")
	protected List<ActiveOrHistoricCurrencyCode> currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6
	 * CashAccountSearchCriteria6}</li>
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
	 * definition} = "Specifies the currency of the cash account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmCurrency
	 * CashAccountSearchCriteria5.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountSearchCriteria6, List<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<CashAccountSearchCriteria6, List<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Specifies the currency of the cash account.";
			previousVersion_lazy = () -> CashAccountSearchCriteria5.mmCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyCode> getValue(CashAccountSearchCriteria6 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CashAccountSearchCriteria6 obj, List<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "Bal")
	protected List<CashBalance9> balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalance9
	 * CashBalance9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6
	 * CashAccountSearchCriteria6}</li>
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
	 * definition} = "Balance of the account which is being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmBalance
	 * CashAccountSearchCriteria5.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountSearchCriteria6, List<CashBalance9>> mmBalance = new MMMessageAssociationEnd<CashAccountSearchCriteria6, List<CashBalance9>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance of the account which is being queried.";
			previousVersion_lazy = () -> CashAccountSearchCriteria5.mmBalance;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalance9.mmObject();
		}

		@Override
		public List<CashBalance9> getValue(CashAccountSearchCriteria6 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(CashAccountSearchCriteria6 obj, List<CashBalance9> value) {
			obj.setBalance(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification125 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6
	 * CashAccountSearchCriteria6}</li>
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
	 * definition} = "Owner of the account which is being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmAccountOwner
	 * CashAccountSearchCriteria5.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountSearchCriteria6, Optional<PartyIdentification125>> mmAccountOwner = new MMMessageAssociationEnd<CashAccountSearchCriteria6, Optional<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			previousVersion_lazy = () -> CashAccountSearchCriteria5.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(CashAccountSearchCriteria6 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CashAccountSearchCriteria6 obj, Optional<PartyIdentification125> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6
	 * CashAccountSearchCriteria6}</li>
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
	 * definition} = "Servicer of the account which is being queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmAccountServicer
	 * CashAccountSearchCriteria5.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountSearchCriteria6, Optional<BranchAndFinancialInstitutionIdentification5>> mmAccountServicer = new MMMessageAssociationEnd<CashAccountSearchCriteria6, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountSearchCriteria6.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Servicer of the account which is being queried.";
			previousVersion_lazy = () -> CashAccountSearchCriteria5.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CashAccountSearchCriteria6 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(CashAccountSearchCriteria6 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountSearchCriteria6.mmAccountIdentification, com.tools20022.repository.msg.CashAccountSearchCriteria6.mmType,
						com.tools20022.repository.msg.CashAccountSearchCriteria6.mmCurrency, com.tools20022.repository.msg.CashAccountSearchCriteria6.mmBalance, com.tools20022.repository.msg.CashAccountSearchCriteria6.mmAccountOwner,
						com.tools20022.repository.msg.CashAccountSearchCriteria6.mmAccountServicer);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline.forCashAccountSearchCriteria6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountSearchCriteria6";
				definition = "Defines the criteria used to search for an account.";
				previousVersion_lazy = () -> CashAccountSearchCriteria5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentificationSearchCriteria2Choice> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public CashAccountSearchCriteria6 setAccountIdentification(List<AccountIdentificationSearchCriteria2Choice> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public List<CashAccountType2Choice> getType() {
		return type == null ? type = new ArrayList<>() : type;
	}

	public CashAccountSearchCriteria6 setType(List<CashAccountType2Choice> type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? currency = new ArrayList<>() : currency;
	}

	public CashAccountSearchCriteria6 setCurrency(List<ActiveOrHistoricCurrencyCode> currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public List<CashBalance9> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public CashAccountSearchCriteria6 setBalance(List<CashBalance9> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public Optional<PartyIdentification125> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CashAccountSearchCriteria6 setAccountOwner(PartyIdentification125 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CashAccountSearchCriteria6 setAccountServicer(BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}