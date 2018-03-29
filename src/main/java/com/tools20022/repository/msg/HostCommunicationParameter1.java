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
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CryptographicKey1;
import com.tools20022.repository.msg.NetworkParameters1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration parameters to communicate with a host.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1#mmHostIdentification
 * HostCommunicationParameter1.mmHostIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1#mmAddress
 * HostCommunicationParameter1.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1#mmKey
 * HostCommunicationParameter1.mmKey}</li>
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
 * "HostCommunicationParameter1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters to communicate with a host."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.HostCommunicationParameter2
 * HostCommunicationParameter2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "HostCommunicationParameter1", propOrder = {"hostIdentification", "address", "key"})
public class HostCommunicationParameter1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HstId", required = true)
	protected Max35Text hostIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1
	 * HostCommunicationParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the host."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HostCommunicationParameter1, Max35Text> mmHostIdentification = new MMMessageAttribute<HostCommunicationParameter1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter1.mmObject();
			isDerived = false;
			xmlTag = "HstId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostIdentification";
			definition = "Identification of the host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(HostCommunicationParameter1 obj) {
			return obj.getHostIdentification();
		}

		@Override
		public void setValue(HostCommunicationParameter1 obj, Max35Text value) {
			obj.setHostIdentification(value);
		}
	};
	@XmlElement(name = "Adr")
	protected NetworkParameters1 address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmNetworkAccess
	 * TerminalManagementSystem.mmNetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1
	 * HostCommunicationParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Network parameters of the host."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostCommunicationParameter1, Optional<NetworkParameters1>> mmAddress = new MMMessageAssociationEnd<HostCommunicationParameter1, Optional<NetworkParameters1>>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementSystem.mmNetworkAccess;
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter1.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Network parameters of the host.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters1.mmObject();
		}

		@Override
		public Optional<NetworkParameters1> getValue(HostCommunicationParameter1 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(HostCommunicationParameter1 obj, Optional<NetworkParameters1> value) {
			obj.setAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Key")
	protected List<CryptographicKey1> key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey1
	 * CryptographicKey1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1
	 * HostCommunicationParameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic key used to communicate with the host."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostCommunicationParameter1, List<CryptographicKey1>> mmKey = new MMMessageAssociationEnd<HostCommunicationParameter1, List<CryptographicKey1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter1.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic key used to communicate with the host.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CryptographicKey1.mmObject();
		}

		@Override
		public List<CryptographicKey1> getValue(HostCommunicationParameter1 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(HostCommunicationParameter1 obj, List<CryptographicKey1> value) {
			obj.setKey(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HostCommunicationParameter1.mmHostIdentification, com.tools20022.repository.msg.HostCommunicationParameter1.mmAddress,
						com.tools20022.repository.msg.HostCommunicationParameter1.mmKey);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HostCommunicationParameter1";
				definition = "Configuration parameters to communicate with a host.";
				nextVersions_lazy = () -> Arrays.asList(HostCommunicationParameter2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getHostIdentification() {
		return hostIdentification;
	}

	public HostCommunicationParameter1 setHostIdentification(Max35Text hostIdentification) {
		this.hostIdentification = Objects.requireNonNull(hostIdentification);
		return this;
	}

	public Optional<NetworkParameters1> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public HostCommunicationParameter1 setAddress(NetworkParameters1 address) {
		this.address = address;
		return this;
	}

	public List<CryptographicKey1> getKey() {
		return key == null ? key = new ArrayList<>() : key;
	}

	public HostCommunicationParameter1 setKey(List<CryptographicKey1> key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}
}