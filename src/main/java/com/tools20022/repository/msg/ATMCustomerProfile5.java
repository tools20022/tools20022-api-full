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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMService17;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Profile of the customer with the allowed services and restrictions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5#mmProfileReference
 * ATMCustomerProfile5.mmProfileReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5#mmCustomerIdentification
 * ATMCustomerProfile5.mmCustomerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5#mmProfileDescription
 * ATMCustomerProfile5.mmProfileDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5#mmAllowedServices
 * ATMCustomerProfile5.mmAllowedServices}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCustomerProfile5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Profile of the customer with the allowed services and restrictions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCustomerProfile5", propOrder = {"profileReference", "customerIdentification", "profileDescription", "allowedServices"})
public class ATMCustomerProfile5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrflRef")
	protected Max35Text profileReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5
	 * ATMCustomerProfile5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrflRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the customer profile."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCustomerProfile5, Optional<Max35Text>> mmProfileReference = new MMMessageAttribute<ATMCustomerProfile5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile5.mmObject();
			isDerived = false;
			xmlTag = "PrflRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileReference";
			definition = "Reference of the customer profile.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMCustomerProfile5 obj) {
			return obj.getProfileReference();
		}

		@Override
		public void setValue(ATMCustomerProfile5 obj, Optional<Max35Text> value) {
			obj.setProfileReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrId")
	protected Max35Text customerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5
	 * ATMCustomerProfile5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the customer for the bank."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCustomerProfile5, Optional<Max35Text>> mmCustomerIdentification = new MMMessageAttribute<ATMCustomerProfile5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile5.mmObject();
			isDerived = false;
			xmlTag = "CstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentification";
			definition = "Identification of the customer for the bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMCustomerProfile5 obj) {
			return obj.getCustomerIdentification();
		}

		@Override
		public void setValue(ATMCustomerProfile5 obj, Optional<Max35Text> value) {
			obj.setCustomerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrflDesc")
	protected Max70Text profileDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5
	 * ATMCustomerProfile5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrflDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the customer's profile in plaintext."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCustomerProfile5, Optional<Max70Text>> mmProfileDescription = new MMMessageAttribute<ATMCustomerProfile5, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile5.mmObject();
			isDerived = false;
			xmlTag = "PrflDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileDescription";
			definition = "Description of the customer's profile in plaintext.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(ATMCustomerProfile5 obj) {
			return obj.getProfileDescription();
		}

		@Override
		public void setValue(ATMCustomerProfile5 obj, Optional<Max70Text> value) {
			obj.setProfileDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "AllwdSvcs")
	protected List<ATMService17> allowedServices;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMService17
	 * ATMService17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5
	 * ATMCustomerProfile5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwdSvcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services allowed for the customer's profile."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCustomerProfile5, List<ATMService17>> mmAllowedServices = new MMMessageAssociationEnd<ATMCustomerProfile5, List<ATMService17>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile5.mmObject();
			isDerived = false;
			xmlTag = "AllwdSvcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowedServices";
			definition = "Services allowed for the customer's profile.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMService17.mmObject();
		}

		@Override
		public List<ATMService17> getValue(ATMCustomerProfile5 obj) {
			return obj.getAllowedServices();
		}

		@Override
		public void setValue(ATMCustomerProfile5 obj, List<ATMService17> value) {
			obj.setAllowedServices(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCustomerProfile5.mmProfileReference, com.tools20022.repository.msg.ATMCustomerProfile5.mmCustomerIdentification,
						com.tools20022.repository.msg.ATMCustomerProfile5.mmProfileDescription, com.tools20022.repository.msg.ATMCustomerProfile5.mmAllowedServices);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCustomerProfile5";
				definition = "Profile of the customer with the allowed services and restrictions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getProfileReference() {
		return profileReference == null ? Optional.empty() : Optional.of(profileReference);
	}

	public ATMCustomerProfile5 setProfileReference(Max35Text profileReference) {
		this.profileReference = profileReference;
		return this;
	}

	public Optional<Max35Text> getCustomerIdentification() {
		return customerIdentification == null ? Optional.empty() : Optional.of(customerIdentification);
	}

	public ATMCustomerProfile5 setCustomerIdentification(Max35Text customerIdentification) {
		this.customerIdentification = customerIdentification;
		return this;
	}

	public Optional<Max70Text> getProfileDescription() {
		return profileDescription == null ? Optional.empty() : Optional.of(profileDescription);
	}

	public ATMCustomerProfile5 setProfileDescription(Max70Text profileDescription) {
		this.profileDescription = profileDescription;
		return this;
	}

	public List<ATMService17> getAllowedServices() {
		return allowedServices == null ? allowedServices = new ArrayList<>() : allowedServices;
	}

	public ATMCustomerProfile5 setAllowedServices(List<ATMService17> allowedServices) {
		this.allowedServices = Objects.requireNonNull(allowedServices);
		return this;
	}
}