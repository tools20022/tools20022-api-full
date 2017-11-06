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
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.NetworkAccess;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class NetworkParameters5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.NetworkParameters4> address;
	/**
	 * Network addresses of the host.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Network addresses of the host.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmAddress;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetworkParameters4.mmObject();
		}
	};
	protected Max35Text userName;
	/**
	 * User name identifying the client.
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
	public static final MMMessageAttribute mmUserName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmUserName;
			componentContext_lazy = () -> NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "UsrNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserName";
			definition = "User name identifying the client.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmUserName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Binary accessCode;
	/**
	 * Password authenticating the client.
	 * <p>
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
	public static final MMMessageAttribute mmAccessCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmAccessCode;
			componentContext_lazy = () -> NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "AccsCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessCode";
			definition = "Password authenticating the client.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmAccessCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};
	protected List<Max10KBinary> serverCertificate;
	/**
	 * X.509 Certificate required to authenticate the server.
	 * <p>
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
	public static final MMMessageAttribute mmServerCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "SvrCert";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificate";
			definition = "X.509 Certificate required to authenticate the server.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmServerCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}
	};
	protected List<Max140Binary> serverCertificateIdentifier;
	/**
	 * Identification of the X.509 Certificates required to authenticate the
	 * server, for instance a digest of the certificate.
	 * <p>
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
	public static final MMMessageAttribute mmServerCertificateIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "SvrCertIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificateIdentifier";
			definition = "Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmServerCertificateIdentifier;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected List<Max10KBinary> clientCertificate;
	/**
	 * X.509 Certificate required to authenticate the client.
	 * <p>
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
	public static final MMMessageAttribute mmClientCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "ClntCert";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificate";
			definition = "X.509 Certificate required to authenticate the client.";
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}
	};
	protected Max35Text securityProfile;
	/**
	 * Identification of the set of security elements to access the host.
	 * <p>
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
	public static final MMMessageAttribute mmSecurityProfile = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetworkParameters5.mmObject();
			isDerived = false;
			xmlTag = "SctyPrfl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityProfile";
			definition = "Identification of the set of security elements to access the host.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetworkParameters5.mmAddress, com.tools20022.repository.msg.NetworkParameters5.mmUserName,
						com.tools20022.repository.msg.NetworkParameters5.mmAccessCode, com.tools20022.repository.msg.NetworkParameters5.mmServerCertificate, com.tools20022.repository.msg.NetworkParameters5.mmServerCertificateIdentifier,
						com.tools20022.repository.msg.NetworkParameters5.mmClientCertificate, com.tools20022.repository.msg.NetworkParameters5.mmSecurityProfile);
				trace_lazy = () -> NetworkAccess.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NetworkParameters5";
				definition = "Parameters to communicate with a host.";
				previousVersion_lazy = () -> NetworkParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<NetworkParameters4> getAddress() {
		return address;
	}

	public void setAddress(List<com.tools20022.repository.msg.NetworkParameters4> address) {
		this.address = address;
	}

	public Max35Text getUserName() {
		return userName;
	}

	public void setUserName(Max35Text userName) {
		this.userName = userName;
	}

	public Max35Binary getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(Max35Binary accessCode) {
		this.accessCode = accessCode;
	}

	public List<Max10KBinary> getServerCertificate() {
		return serverCertificate;
	}

	public void setServerCertificate(List<Max10KBinary> serverCertificate) {
		this.serverCertificate = serverCertificate;
	}

	public List<Max140Binary> getServerCertificateIdentifier() {
		return serverCertificateIdentifier;
	}

	public void setServerCertificateIdentifier(List<Max140Binary> serverCertificateIdentifier) {
		this.serverCertificateIdentifier = serverCertificateIdentifier;
	}

	public List<Max10KBinary> getClientCertificate() {
		return clientCertificate;
	}

	public void setClientCertificate(List<Max10KBinary> clientCertificate) {
		this.clientCertificate = clientCertificate;
	}

	public Max35Text getSecurityProfile() {
		return securityProfile;
	}

	public void setSecurityProfile(Max35Text securityProfile) {
		this.securityProfile = securityProfile;
	}
}