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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
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
 * Information on the conditions to fulfill to appoint a proxy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmAuthorisedProxy
 * ProxyParameters.mmAuthorisedProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentInformation
 * ProxyParameters.mmProxyAppointmentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentDeadline
 * ProxyParameters.mmProxyAppointmentDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentElectronicDeadline
 * ProxyParameters.mmProxyAppointmentElectronicDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentMarketDeadline
 * ProxyParameters.mmProxyAppointmentMarketDeadline}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProxyParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information on the conditions to fulfill to appoint a proxy."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProxyParameters", propOrder = {"authorisedProxy", "proxyAppointmentInformation", "proxyAppointmentDeadline", "proxyAppointmentElectronicDeadline", "proxyAppointmentMarketDeadline"})
public class ProxyParameters {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthrsdPrxy")
	protected List<com.tools20022.repository.msg.Proxy> authorisedProxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Proxy Proxy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters
	 * ProxyParameters}</li>
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
			businessComponentTrace_lazy = () -> ProxyAppointmentCondition.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyParameters.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdPrxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedProxy";
			definition = "Specifies the proxy persons which are authorised by the issuer.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Proxy.mmObject();
		}
	};
	@XmlElement(name = "PrxyAppntmntInf")
	protected Max350Text proxyAppointmentInformation;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters
	 * ProxyParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAppntmntInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how to register a proxy."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProxyAppointmentInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyParameters.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentInformation";
			definition = "Indicates how to register a proxy.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PrxyAppntmntDdln")
	protected ISODateTime proxyAppointmentDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters
	 * ProxyParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAppntmntDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProxyAppointmentDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyParameters.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentDeadline";
			definition = "Date by which the information on proxy assignment must be received by the intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PrxyAppntmntElctrncDdln")
	protected ISODateTime proxyAppointmentElectronicDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters
	 * ProxyParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAppntmntElctrncDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentElectronicDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the intermediary (STP mode)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProxyAppointmentElectronicDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyParameters.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntElctrncDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentElectronicDeadline";
			definition = "Date by which the information on proxy assignment must be received by the intermediary (STP mode).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PrxyAppntmntMktDdln")
	protected ISODateTime proxyAppointmentMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters
	 * ProxyParameters}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAppntmntMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProxyAppointmentMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyParameters.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentMarketDeadline";
			definition = "Date by which the information on proxy assignment must be received by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyParameters.mmAuthorisedProxy, com.tools20022.repository.msg.ProxyParameters.mmProxyAppointmentInformation,
						com.tools20022.repository.msg.ProxyParameters.mmProxyAppointmentDeadline, com.tools20022.repository.msg.ProxyParameters.mmProxyAppointmentElectronicDeadline,
						com.tools20022.repository.msg.ProxyParameters.mmProxyAppointmentMarketDeadline);
				trace_lazy = () -> ProxyAppointmentCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ProxyParameters";
				definition = "Information on the conditions to fulfill to appoint a proxy.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Proxy> getAuthorisedProxy() {
		return authorisedProxy == null ? authorisedProxy = new ArrayList<>() : authorisedProxy;
	}

	public ProxyParameters setAuthorisedProxy(List<com.tools20022.repository.msg.Proxy> authorisedProxy) {
		this.authorisedProxy = Objects.requireNonNull(authorisedProxy);
		return this;
	}

	public Optional<Max350Text> getProxyAppointmentInformation() {
		return proxyAppointmentInformation == null ? Optional.empty() : Optional.of(proxyAppointmentInformation);
	}

	public ProxyParameters setProxyAppointmentInformation(Max350Text proxyAppointmentInformation) {
		this.proxyAppointmentInformation = proxyAppointmentInformation;
		return this;
	}

	public Optional<ISODateTime> getProxyAppointmentDeadline() {
		return proxyAppointmentDeadline == null ? Optional.empty() : Optional.of(proxyAppointmentDeadline);
	}

	public ProxyParameters setProxyAppointmentDeadline(ISODateTime proxyAppointmentDeadline) {
		this.proxyAppointmentDeadline = proxyAppointmentDeadline;
		return this;
	}

	public Optional<ISODateTime> getProxyAppointmentElectronicDeadline() {
		return proxyAppointmentElectronicDeadline == null ? Optional.empty() : Optional.of(proxyAppointmentElectronicDeadline);
	}

	public ProxyParameters setProxyAppointmentElectronicDeadline(ISODateTime proxyAppointmentElectronicDeadline) {
		this.proxyAppointmentElectronicDeadline = proxyAppointmentElectronicDeadline;
		return this;
	}

	public Optional<ISODateTime> getProxyAppointmentMarketDeadline() {
		return proxyAppointmentMarketDeadline == null ? Optional.empty() : Optional.of(proxyAppointmentMarketDeadline);
	}

	public ProxyParameters setProxyAppointmentMarketDeadline(ISODateTime proxyAppointmentMarketDeadline) {
		this.proxyAppointmentMarketDeadline = proxyAppointmentMarketDeadline;
		return this;
	}
}