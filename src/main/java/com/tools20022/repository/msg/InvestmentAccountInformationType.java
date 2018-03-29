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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Select the type(s) of information to be retrieved about a registered
 * investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmInvestmentAccount
 * InvestmentAccountInformationType.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmAccountParties
 * InvestmentAccountInformationType.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmIntermediaries
 * InvestmentAccountInformationType.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmInvestmentPlan
 * InvestmentAccountInformationType.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmCashSettlement
 * InvestmentAccountInformationType.mmCashSettlement}</li>
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
 * "InvestmentAccountInformationType"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Select the type(s) of information to be retrieved about a registered investment account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountInformationType", propOrder = {"investmentAccount", "accountParties", "intermediaries", "investmentPlan", "cashSettlement"})
public class InvestmentAccountInformationType {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvstmtAcct", required = true)
	protected YesNoIndicator investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the core investment account information must be selected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator> mmInvestmentAccount = new MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Indicates if the core investment account information must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentAccountInformationType obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(InvestmentAccountInformationType obj, YesNoIndicator value) {
			obj.setInvestmentAccount(value);
		}
	};
	@XmlElement(name = "AcctPties", required = true)
	protected YesNoIndicator accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the information about account parties must be selected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator> mmAccountParties = new MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Indicates if the information about account parties must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentAccountInformationType obj) {
			return obj.getAccountParties();
		}

		@Override
		public void setValue(InvestmentAccountInformationType obj, YesNoIndicator value) {
			obj.setAccountParties(value);
		}
	};
	@XmlElement(name = "Intrmies", required = true)
	protected YesNoIndicator intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the information about the intermediaries must be selected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator> mmIntermediaries = new MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Indicates if the information about the intermediaries must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentAccountInformationType obj) {
			return obj.getIntermediaries();
		}

		@Override
		public void setValue(InvestmentAccountInformationType obj, YesNoIndicator value) {
			obj.setIntermediaries(value);
		}
	};
	@XmlElement(name = "InvstmtPlan", required = true)
	protected YesNoIndicator investmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the information about the investment plan(s) must be selected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator> mmInvestmentPlan = new MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPlan";
			definition = "Indicates if the information about the investment plan(s) must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentAccountInformationType obj) {
			return obj.getInvestmentPlan();
		}

		@Override
		public void setValue(InvestmentAccountInformationType obj, YesNoIndicator value) {
			obj.setInvestmentPlan(value);
		}
	};
	@XmlElement(name = "CshSttlm", required = true)
	protected YesNoIndicator cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the cash settlement information must be selected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator> mmCashSettlement = new MMMessageAttribute<InvestmentAccountInformationType, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Indicates if the cash settlement information must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentAccountInformationType obj) {
			return obj.getCashSettlement();
		}

		@Override
		public void setValue(InvestmentAccountInformationType obj, YesNoIndicator value) {
			obj.setCashSettlement(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountInformationType.mmInvestmentAccount, com.tools20022.repository.msg.InvestmentAccountInformationType.mmAccountParties,
						com.tools20022.repository.msg.InvestmentAccountInformationType.mmIntermediaries, com.tools20022.repository.msg.InvestmentAccountInformationType.mmInvestmentPlan,
						com.tools20022.repository.msg.InvestmentAccountInformationType.mmCashSettlement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentAccountInformationType";
				definition = "Select the type(s) of information to be retrieved about a registered investment account.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getInvestmentAccount() {
		return investmentAccount;
	}

	public InvestmentAccountInformationType setInvestmentAccount(YesNoIndicator investmentAccount) {
		this.investmentAccount = Objects.requireNonNull(investmentAccount);
		return this;
	}

	public YesNoIndicator getAccountParties() {
		return accountParties;
	}

	public InvestmentAccountInformationType setAccountParties(YesNoIndicator accountParties) {
		this.accountParties = Objects.requireNonNull(accountParties);
		return this;
	}

	public YesNoIndicator getIntermediaries() {
		return intermediaries;
	}

	public InvestmentAccountInformationType setIntermediaries(YesNoIndicator intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public YesNoIndicator getInvestmentPlan() {
		return investmentPlan;
	}

	public InvestmentAccountInformationType setInvestmentPlan(YesNoIndicator investmentPlan) {
		this.investmentPlan = Objects.requireNonNull(investmentPlan);
		return this;
	}

	public YesNoIndicator getCashSettlement() {
		return cashSettlement;
	}

	public InvestmentAccountInformationType setCashSettlement(YesNoIndicator cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}
}