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
import com.tools20022.repository.choice.AccountIdentificationOrNameChoice;
import com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the beneficiary's account information for the settlement of a
 * purchase of goods or services.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTerms1#mmFinalAgent
 * SettlementTerms1.mmFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTerms1#mmBeneficiaryAccount
 * SettlementTerms1.mmBeneficiaryAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
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
 * "SettlementTerms1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the beneficiary's account information for the settlement of a purchase of goods or services."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementTerms1", propOrder = {"finalAgent", "beneficiaryAccount"})
public class SettlementTerms1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FnlAgt")
	protected FinancialInstitutionIdentification4Choice finalAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification4Choice
	 * FinancialInstitutionIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTerms1
	 * SettlementTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction on behalf of an account owner, and posts the transaction into the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTerms1, Optional<FinancialInstitutionIdentification4Choice>> mmFinalAgent = new MMMessageAssociationEnd<SettlementTerms1, Optional<FinancialInstitutionIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTerms1.mmObject();
			isDerived = false;
			xmlTag = "FnlAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgent";
			definition = "Financial institution that receives the payment transaction on behalf of an account owner, and posts the transaction into the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification4Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification4Choice> getValue(SettlementTerms1 obj) {
			return obj.getFinalAgent();
		}

		@Override
		public void setValue(SettlementTerms1 obj, Optional<FinancialInstitutionIdentification4Choice> value) {
			obj.setFinalAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfcryAcct", required = true)
	protected AccountIdentificationOrNameChoice beneficiaryAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationOrNameChoice
	 * AccountIdentificationOrNameChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTerms1
	 * SettlementTerms1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to be credited as a result of an instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTerms1, AccountIdentificationOrNameChoice> mmBeneficiaryAccount = new MMMessageAssociationEnd<SettlementTerms1, AccountIdentificationOrNameChoice>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTerms1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryAccount";
			definition = "Account to be credited as a result of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountIdentificationOrNameChoice.mmObject();
		}

		@Override
		public AccountIdentificationOrNameChoice getValue(SettlementTerms1 obj) {
			return obj.getBeneficiaryAccount();
		}

		@Override
		public void setValue(SettlementTerms1 obj, AccountIdentificationOrNameChoice value) {
			obj.setBeneficiaryAccount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTerms1.mmFinalAgent, com.tools20022.repository.msg.SettlementTerms1.mmBeneficiaryAccount);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementTerms1";
				definition = "Specifies the beneficiary's account information for the settlement of a purchase of goods or services.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstitutionIdentification4Choice> getFinalAgent() {
		return finalAgent == null ? Optional.empty() : Optional.of(finalAgent);
	}

	public SettlementTerms1 setFinalAgent(FinancialInstitutionIdentification4Choice finalAgent) {
		this.finalAgent = finalAgent;
		return this;
	}

	public AccountIdentificationOrNameChoice getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public SettlementTerms1 setBeneficiaryAccount(AccountIdentificationOrNameChoice beneficiaryAccount) {
		this.beneficiaryAccount = Objects.requireNonNull(beneficiaryAccount);
		return this;
	}
}