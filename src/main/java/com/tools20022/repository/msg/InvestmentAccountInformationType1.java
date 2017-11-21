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
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1#mmInvestmentAccount
 * InvestmentAccountInformationType1.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1#mmAccountParties
 * InvestmentAccountInformationType1.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1#mmIntermediaries
 * InvestmentAccountInformationType1.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1#mmInvestmentPlan
 * InvestmentAccountInformationType1.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1#mmCashSettlement
 * InvestmentAccountInformationType1.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1#mmServiceLevelAgreement
 * InvestmentAccountInformationType1.mmServiceLevelAgreement}</li>
 * </ul>
 * </li>
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
 * "InvestmentAccountInformationType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Select the type(s) of information to be retrieved about a registered investment account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestmentAccountInformationType1", propOrder = {"investmentAccount", "accountParties", "intermediaries", "investmentPlan", "cashSettlement", "serviceLevelAgreement"})
public class InvestmentAccountInformationType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator investmentAccount;
	/**
	 * Indicates if the core investment account information must be selected.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1
	 * InvestmentAccountInformationType1}</li>
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
	public static final MMMessageAttribute mmInvestmentAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Indicates if the core investment account information must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator accountParties;
	/**
	 * Indicates if the information about account parties must be selected.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1
	 * InvestmentAccountInformationType1}</li>
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
	public static final MMMessageAttribute mmAccountParties = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType1.mmObject();
			isDerived = false;
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Indicates if the information about account parties must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator intermediaries;
	/**
	 * Indicates if the information about the intermediaries must be selected.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1
	 * InvestmentAccountInformationType1}</li>
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
	public static final MMMessageAttribute mmIntermediaries = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType1.mmObject();
			isDerived = false;
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Indicates if the information about the intermediaries must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator investmentPlan;
	/**
	 * Indicates if the information about the investment plan(s) must be
	 * selected.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1
	 * InvestmentAccountInformationType1}</li>
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
	public static final MMMessageAttribute mmInvestmentPlan = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPlan";
			definition = "Indicates if the information about the investment plan(s) must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cashSettlement;
	/**
	 * Indicates if the cash settlement information must be selected.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1
	 * InvestmentAccountInformationType1}</li>
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
	public static final MMMessageAttribute mmCashSettlement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType1.mmObject();
			isDerived = false;
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Indicates if the cash settlement information must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator serviceLevelAgreement;
	/**
	 * Indicates if the Service Level Agreement information must be selected.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType1
	 * InvestmentAccountInformationType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the Service Level Agreement information must be selected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceLevelAgreement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType1.mmObject();
			isDerived = false;
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Indicates if the Service Level Agreement information must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentAccountInformationType1.mmInvestmentAccount, InvestmentAccountInformationType1.mmAccountParties, InvestmentAccountInformationType1.mmIntermediaries,
						InvestmentAccountInformationType1.mmInvestmentPlan, InvestmentAccountInformationType1.mmCashSettlement, InvestmentAccountInformationType1.mmServiceLevelAgreement);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountInformationType1";
				definition = "Select the type(s) of information to be retrieved about a registered investment account.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InvstmtAcct", required = true)
	public YesNoIndicator getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(YesNoIndicator investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	@XmlElement(name = "AcctPties", required = true)
	public YesNoIndicator getAccountParties() {
		return accountParties;
	}

	public void setAccountParties(YesNoIndicator accountParties) {
		this.accountParties = accountParties;
	}

	@XmlElement(name = "Intrmies", required = true)
	public YesNoIndicator getIntermediaries() {
		return intermediaries;
	}

	public void setIntermediaries(YesNoIndicator intermediaries) {
		this.intermediaries = intermediaries;
	}

	@XmlElement(name = "InvstmtPlan", required = true)
	public YesNoIndicator getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(YesNoIndicator investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	@XmlElement(name = "CshSttlm", required = true)
	public YesNoIndicator getCashSettlement() {
		return cashSettlement;
	}

	public void setCashSettlement(YesNoIndicator cashSettlement) {
		this.cashSettlement = cashSettlement;
	}

	@XmlElement(name = "SvcLvlAgrmt", required = true)
	public YesNoIndicator getServiceLevelAgreement() {
		return serviceLevelAgreement;
	}

	public void setServiceLevelAgreement(YesNoIndicator serviceLevelAgreement) {
		this.serviceLevelAgreement = serviceLevelAgreement;
	}
}