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
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCustomerProfile2;
import com.tools20022.repository.msg.TransactionVerificationResult5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Customer involved in a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer5#mmProfile
 * ATMCustomer5.mmProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomer5#mmAuthenticationResult
 * ATMCustomer5.mmAuthenticationResult}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardholderRole
 * CardholderRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCustomer5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer involved in a transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCustomer5", propOrder = {"profile", "authenticationResult"})
public class ATMCustomer5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prfl")
	protected ATMCustomerProfile2 profile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomerProfile2
	 * ATMCustomerProfile2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer5 ATMCustomer5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prfl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Profile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Profile of the customer selected to perform the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCustomer5, Optional<ATMCustomerProfile2>> mmProfile = new MMMessageAssociationEnd<ATMCustomer5, Optional<ATMCustomerProfile2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomer5.mmObject();
			isDerived = false;
			xmlTag = "Prfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Profile";
			definition = "Profile of the customer selected to perform the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCustomerProfile2.mmObject();
		}

		@Override
		public Optional<ATMCustomerProfile2> getValue(ATMCustomer5 obj) {
			return obj.getProfile();
		}

		@Override
		public void setValue(ATMCustomer5 obj, Optional<ATMCustomerProfile2> value) {
			obj.setProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnRslt")
	protected List<TransactionVerificationResult5> authenticationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5
	 * TransactionVerificationResult5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer5 ATMCustomer5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the customer authentication for this transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCustomer5, List<TransactionVerificationResult5>> mmAuthenticationResult = new MMMessageAssociationEnd<ATMCustomer5, List<TransactionVerificationResult5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomer5.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationResult";
			definition = "Result of the customer authentication for this transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionVerificationResult5.mmObject();
		}

		@Override
		public List<TransactionVerificationResult5> getValue(ATMCustomer5 obj) {
			return obj.getAuthenticationResult();
		}

		@Override
		public void setValue(ATMCustomer5 obj, List<TransactionVerificationResult5> value) {
			obj.setAuthenticationResult(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCustomer5.mmProfile, com.tools20022.repository.msg.ATMCustomer5.mmAuthenticationResult);
				trace_lazy = () -> CardholderRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCustomer5";
				definition = "Customer involved in a transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMCustomerProfile2> getProfile() {
		return profile == null ? Optional.empty() : Optional.of(profile);
	}

	public ATMCustomer5 setProfile(ATMCustomerProfile2 profile) {
		this.profile = profile;
		return this;
	}

	public List<TransactionVerificationResult5> getAuthenticationResult() {
		return authenticationResult == null ? authenticationResult = new ArrayList<>() : authenticationResult;
	}

	public ATMCustomer5 setAuthenticationResult(List<TransactionVerificationResult5> authenticationResult) {
		this.authenticationResult = Objects.requireNonNull(authenticationResult);
		return this;
	}
}