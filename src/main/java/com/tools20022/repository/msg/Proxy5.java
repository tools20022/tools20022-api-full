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
import com.tools20022.repository.codeset.ProxyType2Code;
import com.tools20022.repository.entity.ProxyAppointment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the elements that identify a proxy appointed to represent a party
 * authorised to vote at a shareholders meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Proxy5#mmProxyType
 * Proxy5.mmProxyType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proxy5#mmPreassignedProxy
 * Proxy5.mmPreassignedProxy}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProxyAppointment
 * ProxyAppointment}</li>
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
 * "Proxy5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Proxy3 Proxy3}</li>
 * </ul>
 */
public class Proxy5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ProxyType2Code> proxyType;
	/**
	 * Specifies the type of proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyType2Code
	 * ProxyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointment#mmProxyType
	 * ProxyAppointment.mmProxyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy5
	 * Proxy5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Proxy3#mmProxyType
	 * Proxy3.mmProxyType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProxyType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmProxyType;
			componentContext_lazy = () -> Proxy5.mmObject();
			isDerived = false;
			xmlTag = "PrxyTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyType";
			definition = "Specifies the type of proxy.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Proxy3.mmProxyType;
			maxOccurs = 2;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyType2Code.mmObject();
		}
	};
	protected IndividualPerson25 preassignedProxy;
	/**
	 * Identifies an authorized proxy that has been assigned by the issuer of
	 * the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson25
	 * IndividualPerson25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proxy5
	 * Proxy5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrssgndPrxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreassignedProxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an authorized proxy that has been assigned by the issuer of the meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Proxy3#mmPreassignedProxy
	 * Proxy3.mmPreassignedProxy}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreassignedProxy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Proxy5.mmObject();
			isDerived = false;
			xmlTag = "PrssgndPrxy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreassignedProxy";
			definition = "Identifies an authorized proxy that has been assigned by the issuer of the meeting.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Proxy3.mmPreassignedProxy;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson25.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Proxy5.mmProxyType, com.tools20022.repository.msg.Proxy5.mmPreassignedProxy);
				trace_lazy = () -> ProxyAppointment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Proxy5";
				definition = "Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting.";
				previousVersion_lazy = () -> Proxy3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ProxyType2Code> getProxyType() {
		return proxyType;
	}

	public void setProxyType(List<ProxyType2Code> proxyType) {
		this.proxyType = proxyType;
	}

	public IndividualPerson25 getPreassignedProxy() {
		return preassignedProxy;
	}

	public void setPreassignedProxy(com.tools20022.repository.msg.IndividualPerson25 preassignedProxy) {
		this.preassignedProxy = preassignedProxy;
	}
}