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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Customer involved in a withdrawal transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer6#mmProfile
 * ATMCustomer6.mmProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomer6#mmSelectedLanguage
 * ATMCustomer6.mmSelectedLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomer6#mmAuthenticationResult
 * ATMCustomer6.mmAuthenticationResult}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCustomer6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer involved in a withdrawal transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCustomer6", propOrder = {"profile", "selectedLanguage", "authenticationResult"})
public class ATMCustomer6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prfl")
	protected ATMCustomerProfile4 profile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomerProfile4
	 * ATMCustomerProfile4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer6 ATMCustomer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Profile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Profile of the customer selected to perform the service."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProfile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomer6.mmObject();
			isDerived = false;
			xmlTag = "Prfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Profile";
			definition = "Profile of the customer selected to perform the service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile4.mmObject();
		}
	};
	@XmlElement(name = "SelctdLang")
	protected LanguageCode selectedLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer6 ATMCustomer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctdLang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectedLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Language selected by the customer at the ATM for the customer session. Reference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectedLanguage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomer6.mmObject();
			isDerived = false;
			xmlTag = "SelctdLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedLanguage";
			definition = "Language selected by the customer at the ATM for the customer session. Reference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	@XmlElement(name = "AuthntcnRslt", required = true)
	protected List<com.tools20022.repository.msg.TransactionVerificationResult5> authenticationResult;
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
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer6 ATMCustomer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the customer authentication for this transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthenticationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomer6.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationResult";
			definition = "Result of the customer authentication for this transaction.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCustomer6.mmProfile, com.tools20022.repository.msg.ATMCustomer6.mmSelectedLanguage,
						com.tools20022.repository.msg.ATMCustomer6.mmAuthenticationResult);
				trace_lazy = () -> CardholderRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCustomer6";
				definition = "Customer involved in a withdrawal transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMCustomerProfile4> getProfile() {
		return profile == null ? Optional.empty() : Optional.of(profile);
	}

	public ATMCustomer6 setProfile(com.tools20022.repository.msg.ATMCustomerProfile4 profile) {
		this.profile = profile;
		return this;
	}

	public Optional<LanguageCode> getSelectedLanguage() {
		return selectedLanguage == null ? Optional.empty() : Optional.of(selectedLanguage);
	}

	public ATMCustomer6 setSelectedLanguage(LanguageCode selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
		return this;
	}

	public List<TransactionVerificationResult5> getAuthenticationResult() {
		return authenticationResult == null ? authenticationResult = new ArrayList<>() : authenticationResult;
	}

	public ATMCustomer6 setAuthenticationResult(List<com.tools20022.repository.msg.TransactionVerificationResult5> authenticationResult) {
		this.authenticationResult = Objects.requireNonNull(authenticationResult);
		return this;
	}
}