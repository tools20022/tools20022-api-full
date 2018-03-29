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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemClosure2;
import com.tools20022.repository.msg.SystemEvent2;
import com.tools20022.repository.msg.TimePeriod1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details about the system availability and the related system
 * events that might impact the availability.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2#mmSystemCurrency
 * SystemAvailabilityAndEvents2.mmSystemCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2#mmSessionPeriod
 * SystemAvailabilityAndEvents2.mmSessionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2#mmEvent
 * SystemAvailabilityAndEvents2.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2#mmClosureInformation
 * SystemAvailabilityAndEvents2.mmClosureInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.System System}</li>
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
 * "SystemAvailabilityAndEvents2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details about the system availability and the related system events that might impact the availability."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
 * SystemAvailabilityAndEvents1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemAvailabilityAndEvents2", propOrder = {"systemCurrency", "sessionPeriod", "event", "closureInformation"})
public class SystemAvailabilityAndEvents2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysCcy")
	protected ActiveCurrencyCode systemCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrency
	 * TransactionAdministrator.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2
	 * SystemAvailabilityAndEvents2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmSystemCurrency
	 * SystemAvailabilityAndEvents1.mmSystemCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemAvailabilityAndEvents2, Optional<ActiveCurrencyCode>> mmSystemCurrency = new MMMessageAttribute<SystemAvailabilityAndEvents2, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> TransactionAdministrator.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmObject();
			isDerived = false;
			xmlTag = "SysCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCurrency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			previousVersion_lazy = () -> SystemAvailabilityAndEvents1.mmSystemCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(SystemAvailabilityAndEvents2 obj) {
			return obj.getSystemCurrency();
		}

		@Override
		public void setValue(SystemAvailabilityAndEvents2 obj, Optional<ActiveCurrencyCode> value) {
			obj.setSystemCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "SsnPrd")
	protected TimePeriod1 sessionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TimePeriod1
	 * TimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmAvailableSessionPeriod
	 * SystemAvailability.mmAvailableSessionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2
	 * SystemAvailabilityAndEvents2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SsnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SessionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time window of system activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmSessionPeriod
	 * SystemAvailabilityAndEvents1.mmSessionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemAvailabilityAndEvents2, Optional<TimePeriod1>> mmSessionPeriod = new MMMessageAttribute<SystemAvailabilityAndEvents2, Optional<TimePeriod1>>() {
		{
			businessElementTrace_lazy = () -> SystemAvailability.mmAvailableSessionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmObject();
			isDerived = false;
			xmlTag = "SsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionPeriod";
			definition = "Time window of system activity.";
			previousVersion_lazy = () -> SystemAvailabilityAndEvents1.mmSessionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TimePeriod1.mmObject();
		}

		@Override
		public Optional<TimePeriod1> getValue(SystemAvailabilityAndEvents2 obj) {
			return obj.getSessionPeriod();
		}

		@Override
		public void setValue(SystemAvailabilityAndEvents2 obj, Optional<TimePeriod1> value) {
			obj.setSessionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Evt")
	protected List<SystemEvent2> event;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemEvent2
	 * SystemEvent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2
	 * SystemAvailabilityAndEvents2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Evt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about an event occurring on a system, whether planned, such as the cut-off time for a specific type of eligible transfer, or unplanned (an unsolicited failure), as stipulated in the specifications of the system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmEvent
	 * SystemAvailabilityAndEvents1.mmEvent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemAvailabilityAndEvents2, List<SystemEvent2>> mmEvent = new MMMessageAssociationEnd<SystemAvailabilityAndEvents2, List<SystemEvent2>>() {
		{
			businessComponentTrace_lazy = () -> SystemEventInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmObject();
			isDerived = false;
			xmlTag = "Evt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Event";
			definition = "Detailed information about an event occurring on a system, whether planned, such as the cut-off time for a specific type of eligible transfer, or unplanned (an unsolicited failure), as stipulated in the specifications of the system.";
			previousVersion_lazy = () -> SystemAvailabilityAndEvents1.mmEvent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemEvent2.mmObject();
		}

		@Override
		public List<SystemEvent2> getValue(SystemAvailabilityAndEvents2 obj) {
			return obj.getEvent();
		}

		@Override
		public void setValue(SystemAvailabilityAndEvents2 obj, List<SystemEvent2> value) {
			obj.setEvent(value);
		}
	};
	@XmlElement(name = "ClsrInf")
	protected List<SystemClosure2> closureInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemClosure2
	 * SystemClosure2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2
	 * SystemAvailabilityAndEvents2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information regarding the closure time of a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmClosureInformation
	 * SystemAvailabilityAndEvents1.mmClosureInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemAvailabilityAndEvents2, List<SystemClosure2>> mmClosureInformation = new MMMessageAssociationEnd<SystemAvailabilityAndEvents2, List<SystemClosure2>>() {
		{
			businessComponentTrace_lazy = () -> SystemStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmObject();
			isDerived = false;
			xmlTag = "ClsrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureInformation";
			definition = "Information regarding the closure time of a system.";
			previousVersion_lazy = () -> SystemAvailabilityAndEvents1.mmClosureInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemClosure2.mmObject();
		}

		@Override
		public List<SystemClosure2> getValue(SystemAvailabilityAndEvents2 obj) {
			return obj.getClosureInformation();
		}

		@Override
		public void setValue(SystemAvailabilityAndEvents2 obj, List<SystemClosure2> value) {
			obj.setClosureInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmSystemCurrency, com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmSessionPeriod,
						com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmEvent, com.tools20022.repository.msg.SystemAvailabilityAndEvents2.mmClosureInformation);
				trace_lazy = () -> System.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemAvailabilityAndEvents2";
				definition = "Specifies the details about the system availability and the related system events that might impact the availability.";
				previousVersion_lazy = () -> SystemAvailabilityAndEvents1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyCode> getSystemCurrency() {
		return systemCurrency == null ? Optional.empty() : Optional.of(systemCurrency);
	}

	public SystemAvailabilityAndEvents2 setSystemCurrency(ActiveCurrencyCode systemCurrency) {
		this.systemCurrency = systemCurrency;
		return this;
	}

	public Optional<TimePeriod1> getSessionPeriod() {
		return sessionPeriod == null ? Optional.empty() : Optional.of(sessionPeriod);
	}

	public SystemAvailabilityAndEvents2 setSessionPeriod(TimePeriod1 sessionPeriod) {
		this.sessionPeriod = sessionPeriod;
		return this;
	}

	public List<SystemEvent2> getEvent() {
		return event == null ? event = new ArrayList<>() : event;
	}

	public SystemAvailabilityAndEvents2 setEvent(List<SystemEvent2> event) {
		this.event = Objects.requireNonNull(event);
		return this;
	}

	public List<SystemClosure2> getClosureInformation() {
		return closureInformation == null ? closureInformation = new ArrayList<>() : closureInformation;
	}

	public SystemAvailabilityAndEvents2 setClosureInformation(List<SystemClosure2> closureInformation) {
		this.closureInformation = Objects.requireNonNull(closureInformation);
		return this;
	}
}