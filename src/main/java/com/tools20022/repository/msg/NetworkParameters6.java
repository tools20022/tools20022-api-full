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
import com.tools20022.repository.codeset.NetworkType2Code;
import com.tools20022.repository.entity.NetworkAccess;
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
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters6#mmType
 * NetworkParameters6.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters6#mmAccess
 * NetworkParameters6.mmAccess}</li>
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
 * "NetworkParameters6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters to communicate with a host."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
 * NetworkParameters3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NetworkParameters6", propOrder = {"type", "access"})
public class NetworkParameters6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NetworkType2Code type;
	/**
	 * Type of proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkType2Code
	 * NetworkType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters6
	 * NetworkParameters6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of proxy."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetworkParameters6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NetworkType2Code.mmObject();
		}
	};
	protected NetworkParameters5 access;
	/**
	 * Access information to the proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmAccessCode
	 * NetworkAccess.mmAccessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters6
	 * NetworkParameters6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Access"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Access information to the proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmAccessCode
	 * NetworkParameters3.mmAccessCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccess = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmAccessCode;
			componentContext_lazy = () -> NetworkParameters6.mmObject();
			isDerived = false;
			xmlTag = "Accs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Access";
			definition = "Access information to the proxy.";
			previousVersion_lazy = () -> NetworkParameters3.mmAccessCode;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.NetworkParameters5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NetworkParameters6.mmType, NetworkParameters6.mmAccess);
				trace_lazy = () -> NetworkAccess.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkParameters6";
				definition = "Parameters to communicate with a host.";
				previousVersion_lazy = () -> NetworkParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public NetworkType2Code getType() {
		return type;
	}

	public void setType(NetworkType2Code type) {
		this.type = type;
	}

	@XmlElement(name = "Accs", required = true)
	public NetworkParameters5 getAccess() {
		return access;
	}

	public void setAccess(com.tools20022.repository.msg.NetworkParameters5 access) {
		this.access = access;
	}
}