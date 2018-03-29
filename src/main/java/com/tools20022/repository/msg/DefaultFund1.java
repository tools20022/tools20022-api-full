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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.DefaultFund;
import com.tools20022.repository.entity.DefaultFundContribution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Contribution1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information such as the default fund account identification or the
 * default fund amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFund1#mmDefaultFundAccount
 * DefaultFund1.mmDefaultFundAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFund1#mmTotalDefaultFundAmount
 * DefaultFund1.mmTotalDefaultFundAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DefaultFund1#mmContribution
 * DefaultFund1.mmContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFund1#mmIncreaseCoverageAmount
 * DefaultFund1.mmIncreaseCoverageAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DefaultFund
 * DefaultFund}</li>
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
 * "DefaultFund1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information such as the default fund account identification or the default fund amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DefaultFund1", propOrder = {"defaultFundAccount", "totalDefaultFundAmount", "contribution", "increaseCoverageAmount"})
public class DefaultFund1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DfltFndAcct", required = true)
	protected AccountIdentification4Choice defaultFundAccount;
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
	 * {@linkplain com.tools20022.repository.msg.DefaultFund1 DefaultFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltFndAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the central bank."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DefaultFund1, AccountIdentification4Choice> mmDefaultFundAccount = new MMMessageAttribute<DefaultFund1, AccountIdentification4Choice>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFund1.mmObject();
			isDerived = false;
			xmlTag = "DfltFndAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundAccount";
			definition = "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the central bank.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public AccountIdentification4Choice getValue(DefaultFund1 obj) {
			return obj.getDefaultFundAccount();
		}

		@Override
		public void setValue(DefaultFund1 obj, AccountIdentification4Choice value) {
			obj.setDefaultFundAccount(value);
		}
	};
	@XmlElement(name = "TtlDfltFndAmt", required = true)
	protected ActiveCurrencyAndAmount totalDefaultFundAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFund#mmTotalAmount
	 * DefaultFund.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFund1 DefaultFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDfltFndAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDefaultFundAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount required by the clearing member to participate to the default fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DefaultFund1, ActiveCurrencyAndAmount> mmTotalDefaultFundAmount = new MMMessageAttribute<DefaultFund1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> DefaultFund.mmTotalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFund1.mmObject();
			isDerived = false;
			xmlTag = "TtlDfltFndAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDefaultFundAmount";
			definition = "Total amount required by the clearing member to participate to the default fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(DefaultFund1 obj) {
			return obj.getTotalDefaultFundAmount();
		}

		@Override
		public void setValue(DefaultFund1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalDefaultFundAmount(value);
		}
	};
	@XmlElement(name = "Cntrbtn")
	protected List<Contribution1> contribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Contribution1
	 * Contribution1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFund#mmContribution
	 * DefaultFund.mmContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFund1 DefaultFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntrbtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the contribution to the default fund by trading venues/products."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultFund1, List<Contribution1>> mmContribution = new MMMessageAssociationEnd<DefaultFund1, List<Contribution1>>() {
		{
			businessElementTrace_lazy = () -> DefaultFund.mmContribution;
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFund1.mmObject();
			isDerived = false;
			xmlTag = "Cntrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contribution";
			definition = "Provides details about the contribution to the default fund by trading venues/products.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Contribution1.mmObject();
		}

		@Override
		public List<Contribution1> getValue(DefaultFund1 obj) {
			return obj.getContribution();
		}

		@Override
		public void setValue(DefaultFund1 obj, List<Contribution1> value) {
			obj.setContribution(value);
		}
	};
	@XmlElement(name = "IncrCvrgAmt")
	protected ActiveCurrencyAndAmount increaseCoverageAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmExcessOrDeficitAmount
	 * DefaultFundContribution.mmExcessOrDeficitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFund1 DefaultFund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrCvrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseCoverageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount that the clearing member will have to provide to cover a risk increase. This results from a risk management decision depending on central counterparty specific criteria."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DefaultFund1, Optional<ActiveCurrencyAndAmount>> mmIncreaseCoverageAmount = new MMMessageAttribute<DefaultFund1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> DefaultFundContribution.mmExcessOrDeficitAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFund1.mmObject();
			isDerived = false;
			xmlTag = "IncrCvrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverageAmount";
			definition = "Additional amount that the clearing member will have to provide to cover a risk increase. This results from a risk management decision depending on central counterparty specific criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(DefaultFund1 obj) {
			return obj.getIncreaseCoverageAmount();
		}

		@Override
		public void setValue(DefaultFund1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setIncreaseCoverageAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DefaultFund1.mmDefaultFundAccount, com.tools20022.repository.msg.DefaultFund1.mmTotalDefaultFundAmount,
						com.tools20022.repository.msg.DefaultFund1.mmContribution, com.tools20022.repository.msg.DefaultFund1.mmIncreaseCoverageAmount);
				trace_lazy = () -> DefaultFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DefaultFund1";
				definition = "Provides information such as the default fund account identification or the default fund amount.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification4Choice getDefaultFundAccount() {
		return defaultFundAccount;
	}

	public DefaultFund1 setDefaultFundAccount(AccountIdentification4Choice defaultFundAccount) {
		this.defaultFundAccount = Objects.requireNonNull(defaultFundAccount);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalDefaultFundAmount() {
		return totalDefaultFundAmount;
	}

	public DefaultFund1 setTotalDefaultFundAmount(ActiveCurrencyAndAmount totalDefaultFundAmount) {
		this.totalDefaultFundAmount = Objects.requireNonNull(totalDefaultFundAmount);
		return this;
	}

	public List<Contribution1> getContribution() {
		return contribution == null ? contribution = new ArrayList<>() : contribution;
	}

	public DefaultFund1 setContribution(List<Contribution1> contribution) {
		this.contribution = Objects.requireNonNull(contribution);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getIncreaseCoverageAmount() {
		return increaseCoverageAmount == null ? Optional.empty() : Optional.of(increaseCoverageAmount);
	}

	public DefaultFund1 setIncreaseCoverageAmount(ActiveCurrencyAndAmount increaseCoverageAmount) {
		this.increaseCoverageAmount = increaseCoverageAmount;
		return this;
	}
}