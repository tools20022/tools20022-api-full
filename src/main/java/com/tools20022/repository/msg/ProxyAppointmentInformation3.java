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
import com.tools20022.repository.choice.DateFormat29Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.entity.ProxyAppointmentCondition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Proxy5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates how a proxy is registered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmRegistrationMethod
 * ProxyAppointmentInformation3.mmRegistrationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmDeadline
 * ProxyAppointmentInformation3.mmDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmSTPDeadline
 * ProxyAppointmentInformation3.mmSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmMarketDeadline
 * ProxyAppointmentInformation3.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmAuthorisedProxy
 * ProxyAppointmentInformation3.mmAuthorisedProxy}</li>
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
 * "ProxyAppointmentInformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates how a proxy is registered."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2
 * ProxyAppointmentInformation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProxyAppointmentInformation3", propOrder = {"registrationMethod", "deadline", "sTPDeadline", "marketDeadline", "authorisedProxy"})
public class ProxyAppointmentInformation3 {

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
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
	 * ProxyAppointmentInformation3}</li>
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
	 * definition} = "Specifies how to register the proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmRegistrationMethod
	 * ProxyAppointmentInformation2.mmRegistrationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProxyAppointmentInformation3, Optional<Max350Text>> mmRegistrationMethod = new MMMessageAttribute<ProxyAppointmentInformation3, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> ProxyAppointmentCondition.mmRegistrationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation3.mmObject();
			isDerived = false;
			xmlTag = "RegnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationMethod";
			definition = "Specifies how to register the proxy.";
			previousVersion_lazy = () -> ProxyAppointmentInformation2.mmRegistrationMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(ProxyAppointmentInformation3 obj) {
			return obj.getRegistrationMethod();
		}

		@Override
		public void setValue(ProxyAppointmentInformation3 obj, Optional<Max350Text> value) {
			obj.setRegistrationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "Ddln")
	protected DateFormat29Choice deadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
	 * ProxyAppointmentInformation3}</li>
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
	 * "Date by which the information on the proxy assignment must be received by the intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmDeadline
	 * ProxyAppointmentInformation2.mmDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProxyAppointmentInformation3, Optional<DateFormat29Choice>> mmDeadline = new MMMessageAttribute<ProxyAppointmentInformation3, Optional<DateFormat29Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation3.mmObject();
			isDerived = false;
			xmlTag = "Ddln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deadline";
			definition = "Date by which the information on the proxy assignment must be received by the intermediary.";
			previousVersion_lazy = () -> ProxyAppointmentInformation2.mmDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(ProxyAppointmentInformation3 obj) {
			return obj.getDeadline();
		}

		@Override
		public void setValue(ProxyAppointmentInformation3 obj, Optional<DateFormat29Choice> value) {
			obj.setDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "STPDdln")
	protected DateFormat29Choice sTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
	 * ProxyAppointmentInformation3}</li>
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
	 * "Date by which the information on the proxy assignment must be received by the intermediary (STP mode)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmSTPDeadline
	 * ProxyAppointmentInformation2.mmSTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProxyAppointmentInformation3, Optional<DateFormat29Choice>> mmSTPDeadline = new MMMessageAttribute<ProxyAppointmentInformation3, Optional<DateFormat29Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation3.mmObject();
			isDerived = false;
			xmlTag = "STPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the information on the proxy assignment must be received by the intermediary (STP mode).";
			previousVersion_lazy = () -> ProxyAppointmentInformation2.mmSTPDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(ProxyAppointmentInformation3 obj) {
			return obj.getSTPDeadline();
		}

		@Override
		public void setValue(ProxyAppointmentInformation3 obj, Optional<DateFormat29Choice> value) {
			obj.setSTPDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "MktDdln")
	protected DateFormat29Choice marketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
	 * ProxyAppointmentInformation3}</li>
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
	 * "Date by which the information on the proxy assignment must be received by the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmMarketDeadline
	 * ProxyAppointmentInformation2.mmMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProxyAppointmentInformation3, Optional<DateFormat29Choice>> mmMarketDeadline = new MMMessageAttribute<ProxyAppointmentInformation3, Optional<DateFormat29Choice>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation3.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the information on the proxy assignment must be received by the issuer.";
			previousVersion_lazy = () -> ProxyAppointmentInformation2.mmMarketDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}

		@Override
		public Optional<DateFormat29Choice> getValue(ProxyAppointmentInformation3 obj) {
			return obj.getMarketDeadline();
		}

		@Override
		public void setValue(ProxyAppointmentInformation3 obj, Optional<DateFormat29Choice> value) {
			obj.setMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthrsdPrxy")
	protected List<Proxy5> authorisedProxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Proxy5 Proxy5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
	 * ProxyAppointmentInformation3}</li>
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
	 * "Specifies the proxy person that is authorised by the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmAuthorisedProxy
	 * ProxyAppointmentInformation2.mmAuthorisedProxy}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProxyAppointmentInformation3, List<Proxy5>> mmAuthorisedProxy = new MMMessageAssociationEnd<ProxyAppointmentInformation3, List<Proxy5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation3.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdPrxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedProxy";
			definition = "Specifies the proxy person that is authorised by the issuer.";
			previousVersion_lazy = () -> ProxyAppointmentInformation2.mmAuthorisedProxy;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Proxy5.mmObject();
		}

		@Override
		public List<Proxy5> getValue(ProxyAppointmentInformation3 obj) {
			return obj.getAuthorisedProxy();
		}

		@Override
		public void setValue(ProxyAppointmentInformation3 obj, List<Proxy5> value) {
			obj.setAuthorisedProxy(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation3.mmRegistrationMethod, com.tools20022.repository.msg.ProxyAppointmentInformation3.mmDeadline,
						com.tools20022.repository.msg.ProxyAppointmentInformation3.mmSTPDeadline, com.tools20022.repository.msg.ProxyAppointmentInformation3.mmMarketDeadline,
						com.tools20022.repository.msg.ProxyAppointmentInformation3.mmAuthorisedProxy);
				trace_lazy = () -> ProxyAppointmentCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointmentInformation3";
				definition = "Indicates how a proxy is registered.";
				previousVersion_lazy = () -> ProxyAppointmentInformation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getRegistrationMethod() {
		return registrationMethod == null ? Optional.empty() : Optional.of(registrationMethod);
	}

	public ProxyAppointmentInformation3 setRegistrationMethod(Max350Text registrationMethod) {
		this.registrationMethod = registrationMethod;
		return this;
	}

	public Optional<DateFormat29Choice> getDeadline() {
		return deadline == null ? Optional.empty() : Optional.of(deadline);
	}

	public ProxyAppointmentInformation3 setDeadline(DateFormat29Choice deadline) {
		this.deadline = deadline;
		return this;
	}

	public Optional<DateFormat29Choice> getSTPDeadline() {
		return sTPDeadline == null ? Optional.empty() : Optional.of(sTPDeadline);
	}

	public ProxyAppointmentInformation3 setSTPDeadline(DateFormat29Choice sTPDeadline) {
		this.sTPDeadline = sTPDeadline;
		return this;
	}

	public Optional<DateFormat29Choice> getMarketDeadline() {
		return marketDeadline == null ? Optional.empty() : Optional.of(marketDeadline);
	}

	public ProxyAppointmentInformation3 setMarketDeadline(DateFormat29Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
		return this;
	}

	public List<Proxy5> getAuthorisedProxy() {
		return authorisedProxy == null ? authorisedProxy = new ArrayList<>() : authorisedProxy;
	}

	public ProxyAppointmentInformation3 setAuthorisedProxy(List<Proxy5> authorisedProxy) {
		this.authorisedProxy = Objects.requireNonNull(authorisedProxy);
		return this;
	}
}