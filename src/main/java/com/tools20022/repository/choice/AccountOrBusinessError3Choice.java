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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount35;
import com.tools20022.repository.msg.ErrorHandling4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between account details or a business error when the requested data
 * cannot be retrieved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError3Choice#mmAccount
 * AccountOrBusinessError3Choice.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError3Choice#mmBusinessError
 * AccountOrBusinessError3Choice.mmBusinessError}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOrBusinessError3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between account details or a business error when the requested data cannot be retrieved."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError2Choice
 * AccountOrBusinessError2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountOrBusinessError3Choice", propOrder = {"account", "businessError"})
public class AccountOrBusinessError3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acct", required = true)
	protected CashAccount35 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount35
	 * CashAccount35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError3Choice
	 * AccountOrBusinessError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError2Choice#mmAccount
	 * AccountOrBusinessError2Choice.mmAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountOrBusinessError3Choice, CashAccount35> mmAccount = new MMMessageAssociationEnd<AccountOrBusinessError3Choice, CashAccount35>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountOrBusinessError3Choice.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Requested information on the account.";
			previousVersion_lazy = () -> AccountOrBusinessError2Choice.mmAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount35.mmObject();
		}

		@Override
		public CashAccount35 getValue(AccountOrBusinessError3Choice obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountOrBusinessError3Choice obj, CashAccount35 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected List<ErrorHandling4> businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling4
	 * ErrorHandling4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError3Choice
	 * AccountOrBusinessError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError2Choice#mmBusinessError
	 * AccountOrBusinessError2Choice.mmBusinessError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountOrBusinessError3Choice, List<ErrorHandling4>> mmBusinessError = new MMMessageAssociationEnd<AccountOrBusinessError3Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountOrBusinessError3Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			previousVersion_lazy = () -> AccountOrBusinessError2Choice.mmBusinessError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(AccountOrBusinessError3Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(AccountOrBusinessError3Choice obj, List<ErrorHandling4> value) {
			obj.setBusinessError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountOrBusinessError3Choice.mmAccount, com.tools20022.repository.choice.AccountOrBusinessError3Choice.mmBusinessError);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOrBusinessError3Choice";
				definition = "Choice between account details or a business error when the requested data cannot be retrieved.";
				previousVersion_lazy = () -> AccountOrBusinessError2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount35 getAccount() {
		return account;
	}

	public AccountOrBusinessError3Choice setAccount(CashAccount35 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public List<ErrorHandling4> getBusinessError() {
		return businessError == null ? businessError = new ArrayList<>() : businessError;
	}

	public AccountOrBusinessError3Choice setBusinessError(List<ErrorHandling4> businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}