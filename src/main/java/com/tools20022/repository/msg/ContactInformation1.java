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
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.PhoneAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Communication device number or electronic address used for communication.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactInformation1#mmName
 * ContactInformation1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactInformation1#mmFaxNumber
 * ContactInformation1.mmFaxNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactInformation1#mmTelephoneNumber
 * ContactInformation1.mmTelephoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactInformation1#mmEmailAddress
 * ContactInformation1.mmEmailAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
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
 * "ContactInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Communication device number or electronic address used for communication."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ContactInformation1", propOrder = {"name", "faxNumber", "telephoneNumber", "emailAddress"})
public class ContactInformation1 {

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
	 * {@linkplain com.tools20022.repository.msg.ContactInformation1
	 * ContactInformation1}</li>
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
			componentContext_lazy = () -> ContactInformation1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ContactInformation1
	 * ContactInformation1}</li>
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
			componentContext_lazy = () -> ContactInformation1.mmObject();
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
	protected PhoneNumber telephoneNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ContactInformation1
	 * ContactInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TelNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a phone number, as defined by telecom services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTelephoneNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> ContactInformation1.mmObject();
			isDerived = false;
			xmlTag = "TelNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelephoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
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
	 * {@linkplain com.tools20022.repository.msg.ContactInformation1
	 * ContactInformation1}</li>
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
			componentContext_lazy = () -> ContactInformation1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(ContactInformation1.mmName, ContactInformation1.mmFaxNumber, ContactInformation1.mmTelephoneNumber, ContactInformation1.mmEmailAddress);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactInformation1";
				definition = "Communication device number or electronic address used for communication.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nm")
	public Max350Text getName() {
		return name;
	}

	public void setName(Max350Text name) {
		this.name = name;
	}

	@XmlElement(name = "FaxNb")
	public PhoneNumber getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = faxNumber;
	}

	@XmlElement(name = "TelNb")
	public PhoneNumber getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(PhoneNumber telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	@XmlElement(name = "EmailAdr")
	public Max256Text getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
	}
}