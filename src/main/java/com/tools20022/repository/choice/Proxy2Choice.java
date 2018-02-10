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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ProxyNotAllowedCode;
import com.tools20022.repository.entity.ProxyAppointmentCondition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProxyAppointmentInformation3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of proxy allowance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Proxy2Choice#mmProxy
 * Proxy2Choice.mmProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Proxy2Choice#mmProxyNotAllowed
 * Proxy2Choice.mmProxyNotAllowed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
 * ProxyAppointmentCondition}</li>
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
 * "Proxy2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of proxy allowance."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.choice.Proxy1Choice
 * Proxy1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Proxy2Choice", propOrder = {"proxy", "proxyNotAllowed"})
public class Proxy2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prxy", required = true)
	protected ProxyAppointmentInformation3 proxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
	 * ProxyAppointmentInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Proxy2Choice Proxy2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the elements required to assign a proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Proxy1Choice#mmProxy
	 * Proxy1Choice.mmProxy}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxy = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ProxyAppointmentCondition.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.Proxy2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Specifies the elements required to assign a proxy.";
			previousVersion_lazy = () -> Proxy1Choice.mmProxy;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProxyAppointmentInformation3.mmObject();
		}
	};
	@XmlElement(name = "PrxyNotAllwd", required = true)
	protected ProxyNotAllowedCode proxyNotAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyNotAllowedCode
	 * ProxyNotAllowedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Proxy2Choice Proxy2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyNotAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that no proxy is allowed for a meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Proxy1Choice#mmProxyNotAllowed
	 * Proxy1Choice.mmProxyNotAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProxyNotAllowed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Proxy2Choice.mmObject();
			isDerived = false;
			xmlTag = "PrxyNotAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyNotAllowed";
			definition = "Indicates that no proxy is allowed for a meeting.";
			previousVersion_lazy = () -> Proxy1Choice.mmProxyNotAllowed;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyNotAllowedCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Proxy2Choice.mmProxy, com.tools20022.repository.choice.Proxy2Choice.mmProxyNotAllowed);
				trace_lazy = () -> ProxyAppointmentCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Proxy2Choice";
				definition = "Choice of proxy allowance.";
				previousVersion_lazy = () -> Proxy1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ProxyAppointmentInformation3 getProxy() {
		return proxy;
	}

	public Proxy2Choice setProxy(ProxyAppointmentInformation3 proxy) {
		this.proxy = Objects.requireNonNull(proxy);
		return this;
	}

	public ProxyNotAllowedCode getProxyNotAllowed() {
		return proxyNotAllowed;
	}

	public Proxy2Choice setProxyNotAllowed(ProxyNotAllowedCode proxyNotAllowed) {
		this.proxyNotAllowed = Objects.requireNonNull(proxyNotAllowed);
		return this;
	}
}