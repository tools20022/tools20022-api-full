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
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.PhoneAddress;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PostalAddress18;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Communication information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#mmPostalAddress
 * CommunicationAddress5.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationAddress5#mmEmail
 * CommunicationAddress5.mmEmail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#mmURLAddress
 * CommunicationAddress5.mmURLAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationAddress5#mmPhone
 * CommunicationAddress5.mmPhone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#mmCustomerService
 * CommunicationAddress5.mmCustomerService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#mmAdditionalContactInformation
 * CommunicationAddress5.mmAdditionalContactInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
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
 * "CommunicationAddress5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Communication information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationAddress9
 * CommunicationAddress9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3
 * CommunicationAddress3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommunicationAddress5", propOrder = {"postalAddress", "email", "uRLAddress", "phone", "customerService", "additionalContactInformation"})
public class CommunicationAddress5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PstlAdr")
	protected PostalAddress18 postalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress18
	 * PostalAddress18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5
	 * CommunicationAddress5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address of the entity."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress9#mmPostalAddress
	 * CommunicationAddress9.mmPostalAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommunicationAddress5, Optional<PostalAddress18>> mmPostalAddress = new MMMessageAssociationEnd<CommunicationAddress5, Optional<PostalAddress18>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationAddress5.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Postal address of the entity.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationAddress9.mmPostalAddress);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress18.mmObject();
		}

		@Override
		public Optional<PostalAddress18> getValue(CommunicationAddress5 obj) {
			return obj.getPostalAddress();
		}

		@Override
		public void setValue(CommunicationAddress5 obj, Optional<PostalAddress18> value) {
			obj.setPostalAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Email")
	protected Max256Text email;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmEmailAddress
	 * ElectronicAddress.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5
	 * CommunicationAddress5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Email"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress9#mmEmail
	 * CommunicationAddress9.mmEmail}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmEmail
	 * CommunicationAddress3.mmEmail}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationAddress5, Optional<Max256Text>> mmEmail = new MMMessageAttribute<CommunicationAddress5, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationAddress5.mmObject();
			isDerived = false;
			xmlTag = "Email";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			definition = "Address for electronic mail (e-mail).";
			nextVersions_lazy = () -> Arrays.asList(CommunicationAddress9.mmEmail);
			previousVersion_lazy = () -> CommunicationAddress3.mmEmail;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(CommunicationAddress5 obj) {
			return obj.getEmail();
		}

		@Override
		public void setValue(CommunicationAddress5 obj, Optional<Max256Text> value) {
			obj.setEmail(value.orElse(null));
		}
	};
	@XmlElement(name = "URLAdr")
	protected Max256Text uRLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5
	 * CommunicationAddress5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address for the Universal Resource Locator (URL), for example used over the www (HTTP) service."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress9#mmURLAddress
	 * CommunicationAddress9.mmURLAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmURLAddress
	 * CommunicationAddress3.mmURLAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationAddress5, Optional<Max256Text>> mmURLAddress = new MMMessageAttribute<CommunicationAddress5, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationAddress5.mmObject();
			isDerived = false;
			xmlTag = "URLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URLAddress";
			definition = "Address for the Universal Resource Locator (URL), for example used over the www (HTTP) service.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationAddress9.mmURLAddress);
			previousVersion_lazy = () -> CommunicationAddress3.mmURLAddress;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(CommunicationAddress5 obj) {
			return obj.getURLAddress();
		}

		@Override
		public void setValue(CommunicationAddress5 obj, Optional<Max256Text> value) {
			obj.setURLAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Phne")
	protected PhoneNumber phone;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmPhoneNumber
	 * PhoneAddress.mmPhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5
	 * CommunicationAddress5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Phne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a phone number, as defined by telecom services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress9#mmPhone
	 * CommunicationAddress9.mmPhone}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmPhone
	 * CommunicationAddress3.mmPhone}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationAddress5, Optional<PhoneNumber>> mmPhone = new MMMessageAttribute<CommunicationAddress5, Optional<PhoneNumber>>() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationAddress5.mmObject();
			isDerived = false;
			xmlTag = "Phne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationAddress9.mmPhone);
			previousVersion_lazy = () -> CommunicationAddress3.mmPhone;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public Optional<PhoneNumber> getValue(CommunicationAddress5 obj) {
			return obj.getPhone();
		}

		@Override
		public void setValue(CommunicationAddress5 obj, Optional<PhoneNumber> value) {
			obj.setPhone(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrSvc")
	protected PhoneNumber customerService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmPhoneNumber
	 * PhoneAddress.mmPhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5
	 * CommunicationAddress5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Phone number of the customer service."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress9#mmCustomerService
	 * CommunicationAddress9.mmCustomerService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationAddress5, Optional<PhoneNumber>> mmCustomerService = new MMMessageAttribute<CommunicationAddress5, Optional<PhoneNumber>>() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationAddress5.mmObject();
			isDerived = false;
			xmlTag = "CstmrSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerService";
			definition = "Phone number of the customer service.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationAddress9.mmCustomerService);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public Optional<PhoneNumber> getValue(CommunicationAddress5 obj) {
			return obj.getCustomerService();
		}

		@Override
		public void setValue(CommunicationAddress5 obj, Optional<PhoneNumber> value) {
			obj.setCustomerService(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCtctInf")
	protected Max256Text additionalContactInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5
	 * CommunicationAddress5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCtctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalContactInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information used to facilitate contact with the card acceptor, for instance sales agent name, dispute manager name."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress9#mmAdditionalContactInformation
	 * CommunicationAddress9.mmAdditionalContactInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CommunicationAddress5, Optional<Max256Text>> mmAdditionalContactInformation = new MMMessageAttribute<CommunicationAddress5, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommunicationAddress5.mmObject();
			isDerived = false;
			xmlTag = "AddtlCtctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalContactInformation";
			definition = "Additional information used to facilitate contact with the card acceptor, for instance sales agent name, dispute manager name.";
			nextVersions_lazy = () -> Arrays.asList(CommunicationAddress9.mmAdditionalContactInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(CommunicationAddress5 obj) {
			return obj.getAdditionalContactInformation();
		}

		@Override
		public void setValue(CommunicationAddress5 obj, Optional<Max256Text> value) {
			obj.setAdditionalContactInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommunicationAddress5.mmPostalAddress, com.tools20022.repository.msg.CommunicationAddress5.mmEmail,
						com.tools20022.repository.msg.CommunicationAddress5.mmURLAddress, com.tools20022.repository.msg.CommunicationAddress5.mmPhone, com.tools20022.repository.msg.CommunicationAddress5.mmCustomerService,
						com.tools20022.repository.msg.CommunicationAddress5.mmAdditionalContactInformation);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationAddress5";
				definition = "Communication information.";
				nextVersions_lazy = () -> Arrays.asList(CommunicationAddress9.mmObject());
				previousVersion_lazy = () -> CommunicationAddress3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PostalAddress18> getPostalAddress() {
		return postalAddress == null ? Optional.empty() : Optional.of(postalAddress);
	}

	public CommunicationAddress5 setPostalAddress(PostalAddress18 postalAddress) {
		this.postalAddress = postalAddress;
		return this;
	}

	public Optional<Max256Text> getEmail() {
		return email == null ? Optional.empty() : Optional.of(email);
	}

	public CommunicationAddress5 setEmail(Max256Text email) {
		this.email = email;
		return this;
	}

	public Optional<Max256Text> getURLAddress() {
		return uRLAddress == null ? Optional.empty() : Optional.of(uRLAddress);
	}

	public CommunicationAddress5 setURLAddress(Max256Text uRLAddress) {
		this.uRLAddress = uRLAddress;
		return this;
	}

	public Optional<PhoneNumber> getPhone() {
		return phone == null ? Optional.empty() : Optional.of(phone);
	}

	public CommunicationAddress5 setPhone(PhoneNumber phone) {
		this.phone = phone;
		return this;
	}

	public Optional<PhoneNumber> getCustomerService() {
		return customerService == null ? Optional.empty() : Optional.of(customerService);
	}

	public CommunicationAddress5 setCustomerService(PhoneNumber customerService) {
		this.customerService = customerService;
		return this;
	}

	public Optional<Max256Text> getAdditionalContactInformation() {
		return additionalContactInformation == null ? Optional.empty() : Optional.of(additionalContactInformation);
	}

	public CommunicationAddress5 setAdditionalContactInformation(Max256Text additionalContactInformation) {
		this.additionalContactInformation = additionalContactInformation;
		return this;
	}
}