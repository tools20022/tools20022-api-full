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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.choice.AccountOrBusinessError3Choice;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on the account information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport21#mmAccountIdentification
 * AccountReport21.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport21#mmAccountOrError
 * AccountReport21.mmAccountOrError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountReport21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the account information or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.AccountReport17
 * AccountReport17}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountReport21", propOrder = {"accountIdentification", "accountOrError"})
public class AccountReport21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected AccountIdentification4Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport21
	 * AccountReport21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport17#mmAccountIdentification
	 * AccountReport17.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountReport21, AccountIdentification4Choice> mmAccountIdentification = new MMMessageAttribute<AccountReport21, AccountIdentification4Choice>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport21.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> AccountReport17.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public AccountIdentification4Choice getValue(AccountReport21 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountReport21 obj, AccountIdentification4Choice value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctOrErr", required = true)
	protected AccountOrBusinessError3Choice accountOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError3Choice
	 * AccountOrBusinessError3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport21
	 * AccountReport21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOrErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested information on the account or business error when information has not been found."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountReport17#mmAccountOrError
	 * AccountReport17.mmAccountOrError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountReport21, AccountOrBusinessError3Choice> mmAccountOrError = new MMMessageAssociationEnd<AccountReport21, AccountOrBusinessError3Choice>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountReport21.mmObject();
			isDerived = false;
			xmlTag = "AcctOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOrError";
			definition = "Requested information on the account or business error when information has not been found.";
			previousVersion_lazy = () -> AccountReport17.mmAccountOrError;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountOrBusinessError3Choice.mmObject();
		}

		@Override
		public AccountOrBusinessError3Choice getValue(AccountReport21 obj) {
			return obj.getAccountOrError();
		}

		@Override
		public void setValue(AccountReport21 obj, AccountOrBusinessError3Choice value) {
			obj.setAccountOrError(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport21.mmAccountIdentification, com.tools20022.repository.msg.AccountReport21.mmAccountOrError);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountReport21";
				definition = "Reports either on the account information or on a business error.";
				previousVersion_lazy = () -> AccountReport17.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification4Choice getAccountIdentification() {
		return accountIdentification;
	}

	public AccountReport21 setAccountIdentification(AccountIdentification4Choice accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public AccountOrBusinessError3Choice getAccountOrError() {
		return accountOrError;
	}

	public AccountReport21 setAccountOrError(AccountOrBusinessError3Choice accountOrError) {
		this.accountOrError = Objects.requireNonNull(accountOrError);
		return this;
	}
}