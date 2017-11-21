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
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information needed to contact a physical person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification4#mmName
 * ContactIdentification4.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmNamePrefix
 * ContactIdentification4.mmNamePrefix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmGivenName
 * ContactIdentification4.mmGivenName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification4#mmRole
 * ContactIdentification4.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmPhoneNumber
 * ContactIdentification4.mmPhoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmFaxNumber
 * ContactIdentification4.mmFaxNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmEmailAddress
 * ContactIdentification4.mmEmailAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
 * ContactPersonRole}</li>
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
 * "ContactIdentification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information needed to contact a physical person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ContactIdentification4", propOrder = {"name", "namePrefix", "givenName", "role", "phoneNumber", "faxNumber", "emailAddress"})
public class ContactIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text name;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> ContactIdentification4.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected NamePrefix1Code namePrefix;
	/**
	 * Specifies the terms used to formally address a person, eg, Ms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNamePrefix
	 * PersonName.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the terms used to formally address a person, eg, Ms."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNamePrefix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNamePrefix;
			componentContext_lazy = () -> ContactIdentification4.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person, eg, Ms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
	protected Max350Text givenName;
	/**
	 * First name of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGivenName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> ContactIdentification4.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text role;
	/**
	 * Role of the party in the activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of the party in the activity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRole = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RolePlayer.mmRole;
			componentContext_lazy = () -> ContactIdentification4.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Role of the party in the activity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PhoneNumber phoneNumber;
	/**
	 * Collection of information that identifies a phone number, as defined by
	 * telecom services.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhneNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a phone number, as defined by telecom services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhoneNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> ContactIdentification4.mmObject();
			isDerived = false;
			xmlTag = "PhneNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}
	};
	protected PhoneNumber faxNumber;
	/**
	 * Collection of information that identifies a FAX number, as defined by
	 * telecom services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmFaxNumber
	 * PhoneAddress.mmFaxNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaxNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a FAX number, as defined by telecom services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFaxNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmFaxNumber;
			componentContext_lazy = () -> ContactIdentification4.mmObject();
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}
	};
	protected Max256Text emailAddress;
	/**
	 * Address for electronic mail (e-mail).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4
	 * ContactIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmailAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmailAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> ContactIdentification4.mmObject();
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContactIdentification4.mmName, ContactIdentification4.mmNamePrefix, ContactIdentification4.mmGivenName, ContactIdentification4.mmRole, ContactIdentification4.mmPhoneNumber,
						ContactIdentification4.mmFaxNumber, ContactIdentification4.mmEmailAddress);
				trace_lazy = () -> ContactPersonRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactIdentification4";
				definition = "Information needed to contact a physical person.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nm", required = true)
	public Max350Text getName() {
		return name;
	}

	public void setName(Max350Text name) {
		this.name = name;
	}

	@XmlElement(name = "NmPrfx")
	public NamePrefix1Code getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = namePrefix;
	}

	@XmlElement(name = "GvnNm")
	public Max350Text getGivenName() {
		return givenName;
	}

	public void setGivenName(Max350Text givenName) {
		this.givenName = givenName;
	}

	@XmlElement(name = "Role")
	public Max35Text getRole() {
		return role;
	}

	public void setRole(Max35Text role) {
		this.role = role;
	}

	@XmlElement(name = "PhneNb")
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@XmlElement(name = "FaxNb")
	public PhoneNumber getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = faxNumber;
	}

	@XmlElement(name = "EmailAdr")
	public Max256Text getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
	}
}