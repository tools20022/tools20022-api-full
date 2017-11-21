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
import com.tools20022.repository.choice.AddressType1Choice;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.PhoneAddress;
import com.tools20022.repository.entity.PostalAddress;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmAddressType
 * CommunicationAddress6.mmAddressType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmEmail
 * CommunicationAddress6.mmEmail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmPhone
 * CommunicationAddress6.mmPhone}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmMobile
 * CommunicationAddress6.mmMobile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmFaxNumber
 * CommunicationAddress6.mmFaxNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmTelexAddress
 * CommunicationAddress6.mmTelexAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmURLAddress
 * CommunicationAddress6.mmURLAddress}</li>
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
 * "CommunicationAddress6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Communication device number or electronic address used for communication."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3
 * CommunicationAddress3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CommunicationAddress6", propOrder = {"addressType", "email", "phone", "mobile", "faxNumber", "telexAddress", "URLAddress"})
public class CommunicationAddress6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AddressType1Choice addressType;
	/**
	 * Type of communication address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AddressType1Choice
	 * AddressType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmAddressType
	 * PostalAddress.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of communication address."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddressType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmAddressType;
			componentContext_lazy = () -> CommunicationAddress6.mmObject();
			isDerived = false;
			xmlTag = "AdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressType";
			definition = "Type of communication address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AddressType1Choice.mmObject();
		}
	};
	protected Max256Text email;
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
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmEmail
	 * CommunicationAddress3.mmEmail}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmail = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> CommunicationAddress6.mmObject();
			isDerived = false;
			xmlTag = "Email";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			definition = "Address for electronic mail (e-mail).";
			previousVersion_lazy = () -> CommunicationAddress3.mmEmail;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected PhoneNumber phone;
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
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmPhone
	 * CommunicationAddress3.mmPhone}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhone = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> CommunicationAddress6.mmObject();
			isDerived = false;
			xmlTag = "Phne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			previousVersion_lazy = () -> CommunicationAddress3.mmPhone;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}
	};
	protected PhoneNumber mobile;
	/**
	 * Collection of information that identifies a mobile phone number, as
	 * defined by telecom services.
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
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmMobileNumber
	 * PhoneAddress.mmMobileNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mob"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mobile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a mobile phone number, as defined by telecom services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmMobile
	 * CommunicationAddress3.mmMobile}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMobile = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmMobileNumber;
			componentContext_lazy = () -> CommunicationAddress6.mmObject();
			isDerived = false;
			xmlTag = "Mob";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mobile";
			definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.";
			previousVersion_lazy = () -> CommunicationAddress3.mmMobile;
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
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmFaxNumber
	 * CommunicationAddress3.mmFaxNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFaxNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmFaxNumber;
			componentContext_lazy = () -> CommunicationAddress6.mmObject();
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			previousVersion_lazy = () -> CommunicationAddress3.mmFaxNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}
	};
	protected Max35Text telexAddress;
	/**
	 * Address for a telex machine.
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
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmTelexAddress
	 * ElectronicAddress.mmTelexAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TlxAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelexAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for a telex machine."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmTelexAddress
	 * CommunicationAddress3.mmTelexAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTelexAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmTelexAddress;
			componentContext_lazy = () -> CommunicationAddress6.mmObject();
			isDerived = false;
			xmlTag = "TlxAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelexAddress";
			definition = "Address for a telex machine.";
			previousVersion_lazy = () -> CommunicationAddress3.mmTelexAddress;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max256Text uRLAddress;
	/**
	 * Address for the Universal Resource Locator (URL), for example, used over
	 * the www (HTTP) service.
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
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
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
	 * "Address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmURLAddress
	 * CommunicationAddress3.mmURLAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmURLAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> CommunicationAddress6.mmObject();
			isDerived = false;
			xmlTag = "URLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URLAddress";
			definition = "Address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service.";
			previousVersion_lazy = () -> CommunicationAddress3.mmURLAddress;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CommunicationAddress6.mmAddressType, CommunicationAddress6.mmEmail, CommunicationAddress6.mmPhone, CommunicationAddress6.mmMobile, CommunicationAddress6.mmFaxNumber,
						CommunicationAddress6.mmTelexAddress, CommunicationAddress6.mmURLAddress);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationAddress6";
				definition = "Communication device number or electronic address used for communication.";
				previousVersion_lazy = () -> CommunicationAddress3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AdrTp")
	public AddressType1Choice getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType1Choice addressType) {
		this.addressType = addressType;
	}

	@XmlElement(name = "Email")
	public Max256Text getEmail() {
		return email;
	}

	public void setEmail(Max256Text email) {
		this.email = email;
	}

	@XmlElement(name = "Phne")
	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	@XmlElement(name = "Mob")
	public PhoneNumber getMobile() {
		return mobile;
	}

	public void setMobile(PhoneNumber mobile) {
		this.mobile = mobile;
	}

	@XmlElement(name = "FaxNb")
	public PhoneNumber getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = faxNumber;
	}

	@XmlElement(name = "TlxAdr")
	public Max35Text getTelexAddress() {
		return telexAddress;
	}

	public void setTelexAddress(Max35Text telexAddress) {
		this.telexAddress = telexAddress;
	}

	@XmlElement(name = "URLAdr")
	public Max256Text getURLAddress() {
		return uRLAddress;
	}

	public void setURLAddress(Max256Text uRLAddress) {
		this.uRLAddress = uRLAddress;
	}
}