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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DailyFundTransfer1Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.FinancialInstitutionIdentification9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details about successor account for automated default funds transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1#mmAccountOwner
 * DefaultAccountDetails1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1#mmAccount
 * DefaultAccountDetails1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1#mmDailyFundTransfer
 * DefaultAccountDetails1.mmDailyFundTransfer}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DefaultAccountDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details about successor account for automated default funds transfer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DefaultAccountDetails1", propOrder = {"accountOwner", "account", "dailyFundTransfer"})
public class DefaultAccountDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr", required = true)
	protected FinancialInstitutionIdentification9 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
	 * FinancialInstitutionIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1
	 * DefaultAccountDetails1}</li>
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
	 * definition} = "Account owner identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultAccountDetails1, FinancialInstitutionIdentification9> mmAccountOwner = new MMMessageAssociationEnd<DefaultAccountDetails1, FinancialInstitutionIdentification9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Account owner identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification9.mmObject();
		}

		@Override
		public FinancialInstitutionIdentification9 getValue(DefaultAccountDetails1 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(DefaultAccountDetails1 obj, FinancialInstitutionIdentification9 value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "Acct", required = true)
	protected CashAccount24 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1
	 * DefaultAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultAccountDetails1, CashAccount24> mmAccount = new MMMessageAssociationEnd<DefaultAccountDetails1, CashAccount24>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public CashAccount24 getValue(DefaultAccountDetails1 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(DefaultAccountDetails1 obj, CashAccount24 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "DalyFndTrf")
	protected DailyFundTransfer1Choice dailyFundTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DailyFundTransfer1Choice
	 * DailyFundTransfer1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultAccountDetails1
	 * DefaultAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DalyFndTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DailyFundTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about time and event fund transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultAccountDetails1, Optional<DailyFundTransfer1Choice>> mmDailyFundTransfer = new MMMessageAssociationEnd<DefaultAccountDetails1, Optional<DailyFundTransfer1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "DalyFndTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DailyFundTransfer";
			definition = "Information about time and event fund transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DailyFundTransfer1Choice.mmObject();
		}

		@Override
		public Optional<DailyFundTransfer1Choice> getValue(DefaultAccountDetails1 obj) {
			return obj.getDailyFundTransfer();
		}

		@Override
		public void setValue(DefaultAccountDetails1 obj, Optional<DailyFundTransfer1Choice> value) {
			obj.setDailyFundTransfer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DefaultAccountDetails1.mmAccountOwner, com.tools20022.repository.msg.DefaultAccountDetails1.mmAccount,
						com.tools20022.repository.msg.DefaultAccountDetails1.mmDailyFundTransfer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DefaultAccountDetails1";
				definition = "Details about successor account for automated default funds transfer.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstitutionIdentification9 getAccountOwner() {
		return accountOwner;
	}

	public DefaultAccountDetails1 setAccountOwner(FinancialInstitutionIdentification9 accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public CashAccount24 getAccount() {
		return account;
	}

	public DefaultAccountDetails1 setAccount(CashAccount24 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<DailyFundTransfer1Choice> getDailyFundTransfer() {
		return dailyFundTransfer == null ? Optional.empty() : Optional.of(dailyFundTransfer);
	}

	public DefaultAccountDetails1 setDailyFundTransfer(DailyFundTransfer1Choice dailyFundTransfer) {
		this.dailyFundTransfer = dailyFundTransfer;
		return this;
	}
}