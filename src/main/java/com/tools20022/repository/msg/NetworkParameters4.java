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
import com.tools20022.repository.codeset.NetworkType1Code;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters4#mmNetworkType
 * NetworkParameters4.mmNetworkType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters4#mmAddressValue
 * NetworkParameters4.mmAddressValue}</li>
 * </ul>
 * </li>
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
 * "NetworkParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters to communicate with a host."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
 * NetworkParameters3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NetworkParameters4", propOrder = {"networkType", "addressValue"})
public class NetworkParameters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NetworkType1Code networkType;
	/**
	 * Type of communication network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkType1Code
	 * NetworkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters4
	 * NetworkParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtwkTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of communication network."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetworkType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetworkParameters4.mmObject();
			isDerived = false;
			xmlTag = "NtwkTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkType";
			definition = "Type of communication network.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NetworkType1Code.mmObject();
		}
	};
	protected Max70Text addressValue;
	/**
	 * Value of the address. The value of an internet protocol address contains
	 * the IP address or the DNS (Domain Name Server) address, followed by the
	 * character ':' and the port number if the default port is not used. The
	 * value of a public telephone address contains the phone number with
	 * possible prefix and extensions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters4
	 * NetworkParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the address. The value of an internet protocol address contains the IP address or the DNS (Domain Name Server) address, followed by the character ':' and the port number if the default port is not used. The value of a public telephone address contains the phone number with possible prefix and extensions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddressValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetworkParameters4.mmObject();
			isDerived = false;
			xmlTag = "AdrVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressValue";
			definition = "Value of the address. The value of an internet protocol address contains the IP address or the DNS (Domain Name Server) address, followed by the character ':' and the port number if the default port is not used. The value of a public telephone address contains the phone number with possible prefix and extensions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NetworkParameters4.mmNetworkType, NetworkParameters4.mmAddressValue);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkParameters4";
				definition = "Parameters to communicate with a host.";
				previousVersion_lazy = () -> NetworkParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NtwkTp", required = true)
	public NetworkType1Code getNetworkType() {
		return networkType;
	}

	public void setNetworkType(NetworkType1Code networkType) {
		this.networkType = networkType;
	}

	@XmlElement(name = "AdrVal", required = true)
	public Max70Text getAddressValue() {
		return addressValue;
	}

	public void setAddressValue(Max70Text addressValue) {
		this.addressValue = addressValue;
	}
}