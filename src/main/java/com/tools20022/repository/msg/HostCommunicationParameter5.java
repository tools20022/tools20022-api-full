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
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.KEKIdentifier5;
import com.tools20022.repository.msg.NetworkParameters5;
import com.tools20022.repository.msg.PhysicalInterfaceParameter1;
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
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5#mmActionType
 * HostCommunicationParameter5.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5#mmHostIdentification
 * HostCommunicationParameter5.mmHostIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5#mmAddress
 * HostCommunicationParameter5.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5#mmKey
 * HostCommunicationParameter5.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5#mmNetworkServiceProvider
 * HostCommunicationParameter5.mmNetworkServiceProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5#mmPhysicalInterface
 * HostCommunicationParameter5.mmPhysicalInterface}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HostCommunicationParameter5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters to communicate with a host."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4
 * HostCommunicationParameter4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "HostCommunicationParameter5", propOrder = {"actionType", "hostIdentification", "address", "key", "networkServiceProvider", "physicalInterface"})
public class HostCommunicationParameter5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction3Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5
	 * HostCommunicationParameter5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#mmActionType
	 * HostCommunicationParameter4.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HostCommunicationParameter5, TerminalManagementAction3Code> mmActionType = new MMMessageAttribute<HostCommunicationParameter5, TerminalManagementAction3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter5.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			previousVersion_lazy = () -> HostCommunicationParameter4.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}

		@Override
		public TerminalManagementAction3Code getValue(HostCommunicationParameter5 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(HostCommunicationParameter5 obj, TerminalManagementAction3Code value) {
			obj.setActionType(value);
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5
	 * HostCommunicationParameter5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#mmHostIdentification
	 * HostCommunicationParameter4.mmHostIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HostCommunicationParameter5, Max35Text> mmHostIdentification = new MMMessageAttribute<HostCommunicationParameter5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter5.mmObject();
			isDerived = false;
			xmlTag = "HstId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostIdentification";
			definition = "Identification of the host.";
			previousVersion_lazy = () -> HostCommunicationParameter4.mmHostIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(HostCommunicationParameter5 obj) {
			return obj.getHostIdentification();
		}

		@Override
		public void setValue(HostCommunicationParameter5 obj, Max35Text value) {
			obj.setHostIdentification(value);
		}
	};
	@XmlElement(name = "Adr")
	protected NetworkParameters5 address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmNetworkAccess
	 * TerminalManagementSystem.mmNetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5
	 * HostCommunicationParameter5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Network parameters of the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#mmAddress
	 * HostCommunicationParameter4.mmAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostCommunicationParameter5, Optional<NetworkParameters5>> mmAddress = new MMMessageAssociationEnd<HostCommunicationParameter5, Optional<NetworkParameters5>>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementSystem.mmNetworkAccess;
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter5.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Network parameters of the host.";
			previousVersion_lazy = () -> HostCommunicationParameter4.mmAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters5.mmObject();
		}

		@Override
		public Optional<NetworkParameters5> getValue(HostCommunicationParameter5 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(HostCommunicationParameter5 obj, Optional<NetworkParameters5> value) {
			obj.setAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Key")
	protected List<KEKIdentifier5> key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier5
	 * KEKIdentifier5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5
	 * HostCommunicationParameter5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic key used to communicate with the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#mmKey
	 * HostCommunicationParameter4.mmKey}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostCommunicationParameter5, List<KEKIdentifier5>> mmKey = new MMMessageAssociationEnd<HostCommunicationParameter5, List<KEKIdentifier5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter5.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic key used to communicate with the host.";
			previousVersion_lazy = () -> HostCommunicationParameter4.mmKey;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KEKIdentifier5.mmObject();
		}

		@Override
		public List<KEKIdentifier5> getValue(HostCommunicationParameter5 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(HostCommunicationParameter5 obj, List<KEKIdentifier5> value) {
			obj.setKey(value);
		}
	};
	@XmlElement(name = "NtwkSvcPrvdr")
	protected NetworkParameters5 networkServiceProvider;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5
	 * HostCommunicationParameter5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtwkSvcPrvdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkServiceProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Access information to reach an intermediate network service provider."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#mmNetworkServiceProvider
	 * HostCommunicationParameter4.mmNetworkServiceProvider}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostCommunicationParameter5, Optional<NetworkParameters5>> mmNetworkServiceProvider = new MMMessageAssociationEnd<HostCommunicationParameter5, Optional<NetworkParameters5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter5.mmObject();
			isDerived = false;
			xmlTag = "NtwkSvcPrvdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkServiceProvider";
			definition = "Access information to reach an intermediate network service provider.";
			previousVersion_lazy = () -> HostCommunicationParameter4.mmNetworkServiceProvider;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters5.mmObject();
		}

		@Override
		public Optional<NetworkParameters5> getValue(HostCommunicationParameter5 obj) {
			return obj.getNetworkServiceProvider();
		}

		@Override
		public void setValue(HostCommunicationParameter5 obj, Optional<NetworkParameters5> value) {
			obj.setNetworkServiceProvider(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysIntrfc")
	protected PhysicalInterfaceParameter1 physicalInterface;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PhysicalInterfaceParameter1
	 * PhysicalInterfaceParameter1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter5
	 * HostCommunicationParameter5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysIntrfc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalInterface"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical Interface where the host is connected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostCommunicationParameter5, Optional<PhysicalInterfaceParameter1>> mmPhysicalInterface = new MMMessageAssociationEnd<HostCommunicationParameter5, Optional<PhysicalInterfaceParameter1>>() {
		{
			businessComponentTrace_lazy = () -> TerminalManagementSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter5.mmObject();
			isDerived = false;
			xmlTag = "PhysIntrfc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalInterface";
			definition = "Physical Interface where the host is connected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PhysicalInterfaceParameter1.mmObject();
		}

		@Override
		public Optional<PhysicalInterfaceParameter1> getValue(HostCommunicationParameter5 obj) {
			return obj.getPhysicalInterface();
		}

		@Override
		public void setValue(HostCommunicationParameter5 obj, Optional<PhysicalInterfaceParameter1> value) {
			obj.setPhysicalInterface(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HostCommunicationParameter5.mmActionType, com.tools20022.repository.msg.HostCommunicationParameter5.mmHostIdentification,
						com.tools20022.repository.msg.HostCommunicationParameter5.mmAddress, com.tools20022.repository.msg.HostCommunicationParameter5.mmKey,
						com.tools20022.repository.msg.HostCommunicationParameter5.mmNetworkServiceProvider, com.tools20022.repository.msg.HostCommunicationParameter5.mmPhysicalInterface);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HostCommunicationParameter5";
				definition = "Configuration parameters to communicate with a host.";
				previousVersion_lazy = () -> HostCommunicationParameter4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public HostCommunicationParameter5 setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Max35Text getHostIdentification() {
		return hostIdentification;
	}

	public HostCommunicationParameter5 setHostIdentification(Max35Text hostIdentification) {
		this.hostIdentification = Objects.requireNonNull(hostIdentification);
		return this;
	}

	public Optional<NetworkParameters5> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public HostCommunicationParameter5 setAddress(NetworkParameters5 address) {
		this.address = address;
		return this;
	}

	public List<KEKIdentifier5> getKey() {
		return key == null ? key = new ArrayList<>() : key;
	}

	public HostCommunicationParameter5 setKey(List<KEKIdentifier5> key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}

	public Optional<NetworkParameters5> getNetworkServiceProvider() {
		return networkServiceProvider == null ? Optional.empty() : Optional.of(networkServiceProvider);
	}

	public HostCommunicationParameter5 setNetworkServiceProvider(NetworkParameters5 networkServiceProvider) {
		this.networkServiceProvider = networkServiceProvider;
		return this;
	}

	public Optional<PhysicalInterfaceParameter1> getPhysicalInterface() {
		return physicalInterface == null ? Optional.empty() : Optional.of(physicalInterface);
	}

	public HostCommunicationParameter5 setPhysicalInterface(PhysicalInterfaceParameter1 physicalInterface) {
		this.physicalInterface = physicalInterface;
		return this;
	}
}