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
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.NetworkAccess;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmPrimaryAddress
 * NetworkParameters1.mmPrimaryAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmPrimaryPortNumber
 * NetworkParameters1.mmPrimaryPortNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmSecondaryAddress
 * NetworkParameters1.mmSecondaryAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmSecondaryPortNumber
 * NetworkParameters1.mmSecondaryPortNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters1#mmUserName
 * NetworkParameters1.mmUserName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmAccessCode
 * NetworkParameters1.mmAccessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmClientCertificate
 * NetworkParameters1.mmClientCertificate}</li>
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
 * "NetworkParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters to communicate with a host."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters2
 * NetworkParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters3
 * NetworkParameters3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NetworkParameters1", propOrder = {"primaryAddress", "primaryPortNumber", "secondaryAddress", "secondaryPortNumber", "userName", "accessCode", "clientCertificate"})
public class NetworkParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text primaryAddress;
	/**
	 * IP address or host name of the primary host.
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
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmHostIPAddress
	 * NetworkAccess.mmHostIPAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "IP address or host name of the primary host."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrimaryAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmHostIPAddress;
			componentContext_lazy = () -> NetworkParameters1.mmObject();
			isDerived = false;
			xmlTag = "PmryAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryAddress";
			definition = "IP address or host name of the primary host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number primaryPortNumber;
	/**
	 * Port number of the primary host.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmHostPortNumber
	 * NetworkAccess.mmHostPortNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryPortNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPortNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Port number of the primary host."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrimaryPortNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmHostPortNumber;
			componentContext_lazy = () -> NetworkParameters1.mmObject();
			isDerived = false;
			xmlTag = "PmryPortNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPortNumber";
			definition = "Port number of the primary host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max35Text secondaryAddress;
	/**
	 * IP address or host name of the secondary host.
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
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmHostIPAddress
	 * NetworkAccess.mmHostIPAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "IP address or host name of the secondary host."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmHostIPAddress;
			componentContext_lazy = () -> NetworkParameters1.mmObject();
			isDerived = false;
			xmlTag = "ScndryAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryAddress";
			definition = "IP address or host name of the secondary host.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number secondaryPortNumber;
	/**
	 * Port number of the secondary host.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmHostPortNumber
	 * NetworkAccess.mmHostPortNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryPortNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryPortNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Port number of the secondary host."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryPortNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmHostPortNumber;
			componentContext_lazy = () -> NetworkParameters1.mmObject();
			isDerived = false;
			xmlTag = "ScndryPortNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryPortNumber";
			definition = "Port number of the secondary host.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmUserName
	 * NetworkParameters3.mmUserName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUserName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmUserName;
			componentContext_lazy = () -> NetworkParameters1.mmObject();
			isDerived = false;
			xmlTag = "UsrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserName";
			definition = "User name identifying the client.";
			nextVersions_lazy = () -> Arrays.asList(NetworkParameters3.mmUserName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text accessCode;
	/**
	 * Password authenticating the client.
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
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmAccessCode
	 * NetworkAccess.mmAccessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmAccessCode
	 * NetworkParameters3.mmAccessCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccessCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmAccessCode;
			componentContext_lazy = () -> NetworkParameters1.mmObject();
			isDerived = false;
			xmlTag = "AccsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessCode";
			definition = "Password authenticating the client.";
			nextVersions_lazy = () -> Arrays.asList(NetworkParameters3.mmAccessCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max3000Binary clientCertificate;
	/**
	 * Client certificate chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmClientCertificate
	 * NetworkAccess.mmClientCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
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
	 * definition} = "Client certificate chain."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientCertificate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmClientCertificate;
			componentContext_lazy = () -> NetworkParameters1.mmObject();
			isDerived = false;
			xmlTag = "ClntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificate";
			definition = "Client certificate chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NetworkParameters1.mmPrimaryAddress, NetworkParameters1.mmPrimaryPortNumber, NetworkParameters1.mmSecondaryAddress, NetworkParameters1.mmSecondaryPortNumber,
						NetworkParameters1.mmUserName, NetworkParameters1.mmAccessCode, NetworkParameters1.mmClientCertificate);
				trace_lazy = () -> NetworkAccess.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkParameters1";
				definition = "Configuration parameters to communicate with a host.";
				nextVersions_lazy = () -> Arrays.asList(NetworkParameters2.mmObject(), NetworkParameters3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmryAdr", required = true)
	public Max35Text getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(Max35Text primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	@XmlElement(name = "PmryPortNb", required = true)
	public Number getPrimaryPortNumber() {
		return primaryPortNumber;
	}

	public void setPrimaryPortNumber(Number primaryPortNumber) {
		this.primaryPortNumber = primaryPortNumber;
	}

	@XmlElement(name = "ScndryAdr")
	public Max35Text getSecondaryAddress() {
		return secondaryAddress;
	}

	public void setSecondaryAddress(Max35Text secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	@XmlElement(name = "ScndryPortNb")
	public Number getSecondaryPortNumber() {
		return secondaryPortNumber;
	}

	public void setSecondaryPortNumber(Number secondaryPortNumber) {
		this.secondaryPortNumber = secondaryPortNumber;
	}

	@XmlElement(name = "UsrNm")
	public Max35Text getUserName() {
		return userName;
	}

	public void setUserName(Max35Text userName) {
		this.userName = userName;
	}

	@XmlElement(name = "AccsCd")
	public Max35Text getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(Max35Text accessCode) {
		this.accessCode = accessCode;
	}

	@XmlElement(name = "ClntCert")
	public Max3000Binary getClientCertificate() {
		return clientCertificate;
	}

	public void setClientCertificate(Max3000Binary clientCertificate) {
		this.clientCertificate = clientCertificate;
	}
}