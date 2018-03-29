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
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.NetworkAccess;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NetworkParameters4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters to communicate with a host.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters5#mmAddress
 * NetworkParameters5.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters5#mmUserName
 * NetworkParameters5.mmUserName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmAccessCode
 * NetworkParameters5.mmAccessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmServerCertificate
 * NetworkParameters5.mmServerCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmServerCertificateIdentifier
 * NetworkParameters5.mmServerCertificateIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmClientCertificate
 * NetworkParameters5.mmClientCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmSecurityProfile
 * NetworkParameters5.mmSecurityProfile}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.NetworkAccess
 * NetworkAccess}</li>
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
 * "NetworkParameters5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters to communicate with a host."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
 * NetworkParameters3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetworkParameters5", propOrder = {"address", "userName", "accessCode", "serverCertificate", "serverCertificateIdentifier", "clientCertificate", "securityProfile"})
public class NetworkParameters5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Adr", required = true)
	protected List<NetworkParameters4> address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters4
	 * NetworkParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
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
	 * definition} = "Network addresses of the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmAddress
	 * NetworkParameters3.mmAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetworkParameters5, List<NetworkParameters4>> mmAddress = new MMMessageAssociationEnd<NetworkParameters5, List<NetworkParameters4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Network addresses of the host.";
			previousVersion_lazy = () -> NetworkParameters3.mmAddress;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NetworkParameters4.mmObject();
		}

		@Override
		public List<NetworkParameters4> getValue(NetworkParameters5 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(NetworkParameters5 obj, List<NetworkParameters4> value) {
			obj.setAddress(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmUserName
	 * NetworkAccess.mmUserName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
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
	 * definition} = "User name identifying the client."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmUserName
	 * NetworkParameters3.mmUserName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters5, Optional<Max35Text>> mmUserName = new MMMessageAttribute<NetworkParameters5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmUserName;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "UsrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserName";
			definition = "User name identifying the client.";
			previousVersion_lazy = () -> NetworkParameters3.mmUserName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(NetworkParameters5 obj) {
			return obj.getUserName();
		}

		@Override
		public void setValue(NetworkParameters5 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmAccessCode
	 * NetworkAccess.mmAccessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
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
	 * definition} = "Password authenticating the client."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmAccessCode
	 * NetworkParameters3.mmAccessCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters5, Optional<Max35Binary>> mmAccessCode = new MMMessageAttribute<NetworkParameters5, Optional<Max35Binary>>() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmAccessCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "AccsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessCode";
			definition = "Password authenticating the client.";
			previousVersion_lazy = () -> NetworkParameters3.mmAccessCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Optional<Max35Binary> getValue(NetworkParameters5 obj) {
			return obj.getAccessCode();
		}

		@Override
		public void setValue(NetworkParameters5 obj, Optional<Max35Binary> value) {
			obj.setAccessCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SvrCert")
	protected List<Max10KBinary> serverCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrCert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServerCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "X.509 Certificate required to authenticate the server."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmServerCertificate
	 * NetworkParameters3.mmServerCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters5, List<Max10KBinary>> mmServerCertificate = new MMMessageAttribute<NetworkParameters5, List<Max10KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "SvrCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificate";
			definition = "X.509 Certificate required to authenticate the server.";
			previousVersion_lazy = () -> NetworkParameters3.mmServerCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}

		@Override
		public List<Max10KBinary> getValue(NetworkParameters5 obj) {
			return obj.getServerCertificate();
		}

		@Override
		public void setValue(NetworkParameters5 obj, List<Max10KBinary> value) {
			obj.setServerCertificate(value);
		}
	};
	@XmlElement(name = "SvrCertIdr")
	protected List<Max140Binary> serverCertificateIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrCertIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServerCertificateIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmServerCertificateIdentifier
	 * NetworkParameters3.mmServerCertificateIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters5, List<Max140Binary>> mmServerCertificateIdentifier = new MMMessageAttribute<NetworkParameters5, List<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "SvrCertIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificateIdentifier";
			definition = "Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate.";
			previousVersion_lazy = () -> NetworkParameters3.mmServerCertificateIdentifier;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public List<Max140Binary> getValue(NetworkParameters5 obj) {
			return obj.getServerCertificateIdentifier();
		}

		@Override
		public void setValue(NetworkParameters5 obj, List<Max140Binary> value) {
			obj.setServerCertificateIdentifier(value);
		}
	};
	@XmlElement(name = "ClntCert")
	protected List<Max10KBinary> clientCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntCert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "X.509 Certificate required to authenticate the client."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters5, List<Max10KBinary>> mmClientCertificate = new MMMessageAttribute<NetworkParameters5, List<Max10KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "ClntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificate";
			definition = "X.509 Certificate required to authenticate the client.";
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}

		@Override
		public List<Max10KBinary> getValue(NetworkParameters5 obj) {
			return obj.getClientCertificate();
		}

		@Override
		public void setValue(NetworkParameters5 obj, List<Max10KBinary> value) {
			obj.setClientCertificate(value);
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
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
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
	 * "Identification of the set of security elements to access the host."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters5, Optional<Max35Text>> mmSecurityProfile = new MMMessageAttribute<NetworkParameters5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "SctyPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityProfile";
			definition = "Identification of the set of security elements to access the host.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(NetworkParameters5 obj) {
			return obj.getSecurityProfile();
		}

		@Override
		public void setValue(NetworkParameters5 obj, Optional<Max35Text> value) {
			obj.setSecurityProfile(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetworkParameters5.mmAddress, com.tools20022.repository.msg.NetworkParameters5.mmUserName,
						com.tools20022.repository.msg.NetworkParameters5.mmAccessCode, com.tools20022.repository.msg.NetworkParameters5.mmServerCertificate, com.tools20022.repository.msg.NetworkParameters5.mmServerCertificateIdentifier,
						com.tools20022.repository.msg.NetworkParameters5.mmClientCertificate, com.tools20022.repository.msg.NetworkParameters5.mmSecurityProfile);
				trace_lazy = () -> NetworkAccess.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkParameters5";
				definition = "Parameters to communicate with a host.";
				previousVersion_lazy = () -> NetworkParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<NetworkParameters4> getAddress() {
		return address == null ? address = new ArrayList<>() : address;
	}

	public NetworkParameters5 setAddress(List<NetworkParameters4> address) {
		this.address = Objects.requireNonNull(address);
		return this;
	}

	public Optional<Max35Text> getUserName() {
		return userName == null ? Optional.empty() : Optional.of(userName);
	}

	public NetworkParameters5 setUserName(Max35Text userName) {
		this.userName = userName;
		return this;
	}

	public Optional<Max35Binary> getAccessCode() {
		return accessCode == null ? Optional.empty() : Optional.of(accessCode);
	}

	public NetworkParameters5 setAccessCode(Max35Binary accessCode) {
		this.accessCode = accessCode;
		return this;
	}

	public List<Max10KBinary> getServerCertificate() {
		return serverCertificate == null ? serverCertificate = new ArrayList<>() : serverCertificate;
	}

	public NetworkParameters5 setServerCertificate(List<Max10KBinary> serverCertificate) {
		this.serverCertificate = Objects.requireNonNull(serverCertificate);
		return this;
	}

	public List<Max140Binary> getServerCertificateIdentifier() {
		return serverCertificateIdentifier == null ? serverCertificateIdentifier = new ArrayList<>() : serverCertificateIdentifier;
	}

	public NetworkParameters5 setServerCertificateIdentifier(List<Max140Binary> serverCertificateIdentifier) {
		this.serverCertificateIdentifier = Objects.requireNonNull(serverCertificateIdentifier);
		return this;
	}

	public List<Max10KBinary> getClientCertificate() {
		return clientCertificate == null ? clientCertificate = new ArrayList<>() : clientCertificate;
	}

	public NetworkParameters5 setClientCertificate(List<Max10KBinary> clientCertificate) {
		this.clientCertificate = Objects.requireNonNull(clientCertificate);
		return this;
	}

	public Optional<Max35Text> getSecurityProfile() {
		return securityProfile == null ? Optional.empty() : Optional.of(securityProfile);
	}

	public NetworkParameters5 setSecurityProfile(Max35Text securityProfile) {
		this.securityProfile = securityProfile;
		return this;
	}
}