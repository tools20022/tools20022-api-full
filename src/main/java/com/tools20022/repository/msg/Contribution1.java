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
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the contribution account
 * identification or the requirement amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Contribution1#mmAccount
 * Contribution1.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Contribution1#mmRequiredAmount
 * Contribution1.mmRequiredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Contribution1#mmIncreaseCoverageAmount
 * Contribution1.mmIncreaseCoverageAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Contribution1#mmNonClearingMember
 * Contribution1.mmNonClearingMember}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
 * DefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Contribution1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the contribution account identification or the requirement amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Contribution1", propOrder = {"account", "requiredAmount", "increaseCoverageAmount", "nonClearingMember"})
public class Contribution1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountIdentification4Choice account;
	/**
	 * Segregation done by the central counterparty based on trading
	 * venues/products or other attributes.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Contribution1 Contribution1}</li>
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
	 * definition} =
	 * "Segregation done by the central counterparty based on trading venues/products or other attributes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> Contribution1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Segregation done by the central counterparty based on trading venues/products or other attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount requiredAmount;
	/**
	 * Total contribution required by the clearing member to participate to the
	 * default fund.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Contribution1 Contribution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total contribution required by the clearing member to participate to the default fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequiredAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DefaultFund.mmTotalAmount;
			componentContext_lazy = () -> Contribution1.mmObject();
			isDerived = false;
			xmlTag = "ReqrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredAmount";
			definition = "Total contribution required by the clearing member to participate to the default fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount increaseCoverageAmount;
	/**
	 * Additional amount that the clearing member will have to provide to cover
	 * a risk increase. This results from a risk management decision depending
	 * on central counterparty specific criteria.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Contribution1 Contribution1}</li>
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
	public static final MMMessageAttribute mmIncreaseCoverageAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DefaultFundContribution.mmExcessOrDeficitAmount;
			componentContext_lazy = () -> Contribution1.mmObject();
			isDerived = false;
			xmlTag = "IncrCvrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverageAmount";
			definition = "Additional amount that the clearing member will have to provide to cover a risk increase. This results from a risk management decision depending on central counterparty specific criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PartyIdentificationAndAccount31 nonClearingMember;
	/**
	 * Provides the identification for the non-clearing member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Contribution1 Contribution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification for the non-clearing member."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonClearingMember = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Contribution1.mmObject();
			isDerived = false;
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides the identification for the non-clearing member.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount31.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Contribution1.mmAccount, Contribution1.mmRequiredAmount, Contribution1.mmIncreaseCoverageAmount, Contribution1.mmNonClearingMember);
				trace_lazy = () -> DefaultFundContribution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Contribution1";
				definition = "Provides additional information such as the contribution account identification or the requirement amount.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Acct")
	public AccountIdentification4Choice getAccount() {
		return account;
	}

	public void setAccount(AccountIdentification4Choice account) {
		this.account = account;
	}

	@XmlElement(name = "ReqrdAmt", required = true)
	public ActiveCurrencyAndAmount getRequiredAmount() {
		return requiredAmount;
	}

	public void setRequiredAmount(ActiveCurrencyAndAmount requiredAmount) {
		this.requiredAmount = requiredAmount;
	}

	@XmlElement(name = "IncrCvrgAmt")
	public ActiveCurrencyAndAmount getIncreaseCoverageAmount() {
		return increaseCoverageAmount;
	}

	public void setIncreaseCoverageAmount(ActiveCurrencyAndAmount increaseCoverageAmount) {
		this.increaseCoverageAmount = increaseCoverageAmount;
	}

	@XmlElement(name = "NonClrMmb")
	public PartyIdentificationAndAccount31 getNonClearingMember() {
		return nonClearingMember;
	}

	public void setNonClearingMember(com.tools20022.repository.msg.PartyIdentificationAndAccount31 nonClearingMember) {
		this.nonClearingMember = nonClearingMember;
	}
}