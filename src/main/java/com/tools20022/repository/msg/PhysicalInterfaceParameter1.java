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
import com.tools20022.repository.codeset.POICommunicationType2Code;
import com.tools20022.repository.datatype.Max2KBinary;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.TerminalManagementSystem;
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
 * Configuration parameters for physical interface.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1#mmInterfaceName
 * PhysicalInterfaceParameter1.mmInterfaceName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1#mmInterfaceType
 * PhysicalInterfaceParameter1.mmInterfaceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1#mmUserName
 * PhysicalInterfaceParameter1.mmUserName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1#mmAccessCode
 * PhysicalInterfaceParameter1.mmAccessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1#mmSecurityProfile
 * PhysicalInterfaceParameter1.mmSecurityProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1#mmAdditionalParameters
 * PhysicalInterfaceParameter1.mmAdditionalParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
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
 * "PhysicalInterfaceParameter1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters for physical interface."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PhysicalInterfaceParameter1", propOrder = {"interfaceName", "interfaceType", "userName", "accessCode", "securityProfile", "additionalParameters"})
public class PhysicalInterfaceParameter1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IntrfcNm", required = true)
	protected Max35Text interfaceName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1
	 * PhysicalInterfaceParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrfcNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterfaceName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the interface."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PhysicalInterfaceParameter1, Max35Text> mmInterfaceName = new MMMessageAttribute<PhysicalInterfaceParameter1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmObject();
			isDerived = false;
			xmlTag = "IntrfcNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterfaceName";
			definition = "Identification of the interface.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PhysicalInterfaceParameter1 obj) {
			return obj.getInterfaceName();
		}

		@Override
		public void setValue(PhysicalInterfaceParameter1 obj, Max35Text value) {
			obj.setInterfaceName(value);
		}
	};
	@XmlElement(name = "IntrfcTp")
	protected POICommunicationType2Code interfaceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1
	 * PhysicalInterfaceParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrfcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterfaceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the physical link layer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PhysicalInterfaceParameter1, Optional<POICommunicationType2Code>> mmInterfaceType = new MMMessageAttribute<PhysicalInterfaceParameter1, Optional<POICommunicationType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmObject();
			isDerived = false;
			xmlTag = "IntrfcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterfaceType";
			definition = "Identification of the physical link layer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> POICommunicationType2Code.mmObject();
		}

		@Override
		public Optional<POICommunicationType2Code> getValue(PhysicalInterfaceParameter1 obj) {
			return obj.getInterfaceType();
		}

		@Override
		public void setValue(PhysicalInterfaceParameter1 obj, Optional<POICommunicationType2Code> value) {
			obj.setInterfaceType(value.orElse(null));
		}
	};
	@XmlElement(name = "UsrNm")
	protected Max35Text userName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1
	 * PhysicalInterfaceParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Optional user name to provide to use this interface."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max35Text>> mmUserName = new MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> PersonIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmObject();
			isDerived = false;
			xmlTag = "UsrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserName";
			definition = "Optional user name to provide to use this interface.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PhysicalInterfaceParameter1 obj) {
			return obj.getUserName();
		}

		@Override
		public void setValue(PhysicalInterfaceParameter1 obj, Optional<Max35Text> value) {
			obj.setUserName(value.orElse(null));
		}
	};
	@XmlElement(name = "AccsCd")
	protected Max35Binary accessCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1
	 * PhysicalInterfaceParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccessCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Optional access code to provide to use this interface."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max35Binary>> mmAccessCode = new MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max35Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmObject();
			isDerived = false;
			xmlTag = "AccsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessCode";
			definition = "Optional access code to provide to use this interface.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Optional<Max35Binary> getValue(PhysicalInterfaceParameter1 obj) {
			return obj.getAccessCode();
		}

		@Override
		public void setValue(PhysicalInterfaceParameter1 obj, Optional<Max35Binary> value) {
			obj.setAccessCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyPrfl")
	protected Max35Text securityProfile;
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
	 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1
	 * PhysicalInterfaceParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the optional security profile to use with this interface."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max35Text>> mmSecurityProfile = new MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmObject();
			isDerived = false;
			xmlTag = "SctyPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityProfile";
			definition = "Identification of the optional security profile to use with this interface.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PhysicalInterfaceParameter1 obj) {
			return obj.getSecurityProfile();
		}

		@Override
		public void setValue(PhysicalInterfaceParameter1 obj, Optional<Max35Text> value) {
			obj.setSecurityProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlParams")
	protected Max2KBinary additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2KBinary
	 * Max2KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1
	 * PhysicalInterfaceParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Any other parameters relevant for this interface."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max2KBinary>> mmAdditionalParameters = new MMMessageAttribute<PhysicalInterfaceParameter1, Optional<Max2KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmObject();
			isDerived = false;
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Any other parameters relevant for this interface.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2KBinary.mmObject();
		}

		@Override
		public Optional<Max2KBinary> getValue(PhysicalInterfaceParameter1 obj) {
			return obj.getAdditionalParameters();
		}

		@Override
		public void setValue(PhysicalInterfaceParameter1 obj, Optional<Max2KBinary> value) {
			obj.setAdditionalParameters(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmInterfaceName, com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmInterfaceType,
						com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmUserName, com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmAccessCode,
						com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmSecurityProfile, com.tools20022.repository.msg.PhysicalInterfaceParameter1.mmAdditionalParameters);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PhysicalInterfaceParameter1";
				definition = "Configuration parameters for physical interface.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getInterfaceName() {
		return interfaceName;
	}

	public PhysicalInterfaceParameter1 setInterfaceName(Max35Text interfaceName) {
		this.interfaceName = Objects.requireNonNull(interfaceName);
		return this;
	}

	public Optional<POICommunicationType2Code> getInterfaceType() {
		return interfaceType == null ? Optional.empty() : Optional.of(interfaceType);
	}

	public PhysicalInterfaceParameter1 setInterfaceType(POICommunicationType2Code interfaceType) {
		this.interfaceType = interfaceType;
		return this;
	}

	public Optional<Max35Text> getUserName() {
		return userName == null ? Optional.empty() : Optional.of(userName);
	}

	public PhysicalInterfaceParameter1 setUserName(Max35Text userName) {
		this.userName = userName;
		return this;
	}

	public Optional<Max35Binary> getAccessCode() {
		return accessCode == null ? Optional.empty() : Optional.of(accessCode);
	}

	public PhysicalInterfaceParameter1 setAccessCode(Max35Binary accessCode) {
		this.accessCode = accessCode;
		return this;
	}

	public Optional<Max35Text> getSecurityProfile() {
		return securityProfile == null ? Optional.empty() : Optional.of(securityProfile);
	}

	public PhysicalInterfaceParameter1 setSecurityProfile(Max35Text securityProfile) {
		this.securityProfile = securityProfile;
		return this;
	}

	public Optional<Max2KBinary> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public PhysicalInterfaceParameter1 setAdditionalParameters(Max2KBinary additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}
}