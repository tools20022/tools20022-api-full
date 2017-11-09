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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class ProxyParameters {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.Proxy> authorisedProxy;
	/**
	 * Specifies the proxy persons which are authorised by the issuer.
	 * <p>
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
			componentContext_lazy = () -> ProxyParameters.mmObject();
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
	protected Max350Text proxyAppointmentInformation;
	/**
	 * Indicates how to register a proxy.
	 * <p>
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
			componentContext_lazy = () -> ProxyParameters.mmObject();
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
	protected ISODateTime proxyAppointmentDeadline;
	/**
	 * Date by which the information on proxy assignment must be received by the
	 * intermediary.
	 * <p>
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
			componentContext_lazy = () -> ProxyParameters.mmObject();
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
	protected ISODateTime proxyAppointmentElectronicDeadline;
	/**
	 * Date by which the information on proxy assignment must be received by the
	 * intermediary (STP mode).
	 * <p>
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
			componentContext_lazy = () -> ProxyParameters.mmObject();
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
	protected ISODateTime proxyAppointmentMarketDeadline;
	/**
	 * Date by which the information on proxy assignment must be received by the
	 * issuer.
	 * <p>
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
			componentContext_lazy = () -> ProxyParameters.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(ProxyParameters.mmAuthorisedProxy, ProxyParameters.mmProxyAppointmentInformation, ProxyParameters.mmProxyAppointmentDeadline, ProxyParameters.mmProxyAppointmentElectronicDeadline,
						ProxyParameters.mmProxyAppointmentMarketDeadline);
				trace_lazy = () -> ProxyAppointmentCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ProxyParameters";
				definition = "Information on the conditions to fulfill to appoint a proxy.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Proxy> getAuthorisedProxy() {
		return authorisedProxy;
	}

	public void setAuthorisedProxy(List<com.tools20022.repository.msg.Proxy> authorisedProxy) {
		this.authorisedProxy = authorisedProxy;
	}

	public Max350Text getProxyAppointmentInformation() {
		return proxyAppointmentInformation;
	}

	public void setProxyAppointmentInformation(Max350Text proxyAppointmentInformation) {
		this.proxyAppointmentInformation = proxyAppointmentInformation;
	}

	public ISODateTime getProxyAppointmentDeadline() {
		return proxyAppointmentDeadline;
	}

	public void setProxyAppointmentDeadline(ISODateTime proxyAppointmentDeadline) {
		this.proxyAppointmentDeadline = proxyAppointmentDeadline;
	}

	public ISODateTime getProxyAppointmentElectronicDeadline() {
		return proxyAppointmentElectronicDeadline;
	}

	public void setProxyAppointmentElectronicDeadline(ISODateTime proxyAppointmentElectronicDeadline) {
		this.proxyAppointmentElectronicDeadline = proxyAppointmentElectronicDeadline;
	}

	public ISODateTime getProxyAppointmentMarketDeadline() {
		return proxyAppointmentMarketDeadline;
	}

	public void setProxyAppointmentMarketDeadline(ISODateTime proxyAppointmentMarketDeadline) {
		this.proxyAppointmentMarketDeadline = proxyAppointmentMarketDeadline;
	}
}