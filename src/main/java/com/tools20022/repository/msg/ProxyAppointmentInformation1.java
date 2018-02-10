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
import com.tools20022.repository.choice.DateFormat2Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.AssignedProxyRole;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.entity.ProxyAppointmentCondition;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates how to register a proxy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmRegistrationMethod
 * ProxyAppointmentInformation1.mmRegistrationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmDeadline
 * ProxyAppointmentInformation1.mmDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmSTPDeadline
 * ProxyAppointmentInformation1.mmSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmMarketDeadline
 * ProxyAppointmentInformation1.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmAuthorisedProxy
 * ProxyAppointmentInformation1.mmAuthorisedProxy}</li>
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
 * "ProxyAppointmentInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates how to register a proxy."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProxyAppointmentInformation1", propOrder = {"registrationMethod", "deadline", "sTPDeadline", "marketDeadline", "authorisedProxy"})
public class ProxyAppointmentInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RegnMtd")
	protected Max350Text registrationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmRegistrationMethod
	 * ProxyAppointmentCondition.mmRegistrationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1
	 * ProxyAppointmentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how to register a proxy."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProxyAppointmentCondition.mmRegistrationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation1.mmObject();
			isDerived = false;
			xmlTag = "RegnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationMethod";
			definition = "Indicates how to register a proxy.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "Ddln")
	protected DateFormat2Choice deadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1
	 * ProxyAppointmentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ddln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Ddln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deadline";
			definition = "Date by which the information on proxy assignment must be received by the intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "STPDdln")
	protected DateFormat2Choice sTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1
	 * ProxyAppointmentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "STPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the intermediary (STP mode)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSTPDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation1.mmObject();
			isDerived = false;
			xmlTag = "STPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the information on proxy assignment must be received by the intermediary (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "MktDdln")
	protected DateFormat2Choice marketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1
	 * ProxyAppointmentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation1.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the information on proxy assignment must be received by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "AuthrsdPrxy")
	protected List<com.tools20022.repository.msg.Proxy1> authorisedProxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Proxy1 Proxy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole
	 * AssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1
	 * ProxyAppointmentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrsdPrxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedProxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the proxy persons which are authorised by the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisedProxy = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AssignedProxyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation1.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdPrxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedProxy";
			definition = "Specifies the proxy persons which are authorised by the issuer.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Proxy1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation1.mmRegistrationMethod, com.tools20022.repository.msg.ProxyAppointmentInformation1.mmDeadline,
						com.tools20022.repository.msg.ProxyAppointmentInformation1.mmSTPDeadline, com.tools20022.repository.msg.ProxyAppointmentInformation1.mmMarketDeadline,
						com.tools20022.repository.msg.ProxyAppointmentInformation1.mmAuthorisedProxy);
				trace_lazy = () -> ProxyAppointmentCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointmentInformation1";
				definition = "Indicates how to register a proxy.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getRegistrationMethod() {
		return registrationMethod == null ? Optional.empty() : Optional.of(registrationMethod);
	}

	public ProxyAppointmentInformation1 setRegistrationMethod(Max350Text registrationMethod) {
		this.registrationMethod = registrationMethod;
		return this;
	}

	public Optional<DateFormat2Choice> getDeadline() {
		return deadline == null ? Optional.empty() : Optional.of(deadline);
	}

	public ProxyAppointmentInformation1 setDeadline(DateFormat2Choice deadline) {
		this.deadline = deadline;
		return this;
	}

	public Optional<DateFormat2Choice> getSTPDeadline() {
		return sTPDeadline == null ? Optional.empty() : Optional.of(sTPDeadline);
	}

	public ProxyAppointmentInformation1 setSTPDeadline(DateFormat2Choice sTPDeadline) {
		this.sTPDeadline = sTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getMarketDeadline() {
		return marketDeadline == null ? Optional.empty() : Optional.of(marketDeadline);
	}

	public ProxyAppointmentInformation1 setMarketDeadline(DateFormat2Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
		return this;
	}

	public List<Proxy1> getAuthorisedProxy() {
		return authorisedProxy == null ? authorisedProxy = new ArrayList<>() : authorisedProxy;
	}

	public ProxyAppointmentInformation1 setAuthorisedProxy(List<com.tools20022.repository.msg.Proxy1> authorisedProxy) {
		this.authorisedProxy = Objects.requireNonNull(authorisedProxy);
		return this;
	}
}