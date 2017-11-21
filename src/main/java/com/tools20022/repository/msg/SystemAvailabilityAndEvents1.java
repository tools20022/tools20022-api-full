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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmSystemCurrency
 * SystemAvailabilityAndEvents1.mmSystemCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmSessionPeriod
 * SystemAvailabilityAndEvents1.mmSessionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmEvent
 * SystemAvailabilityAndEvents1.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmClosureInformation
 * SystemAvailabilityAndEvents1.mmClosureInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.System System}</li>
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
 * "SystemAvailabilityAndEvents1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details about the system availability and the related system events that might impact the availability."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SystemAvailabilityAndEvents1", propOrder = {"systemCurrency", "sessionPeriod", "event", "closureInformation"})
public class SystemAvailabilityAndEvents1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode systemCurrency;
	/**
	 * Currency which may be processed by the system. A system may process
	 * transactions in a single currency or in multiple currencies.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
	 * SystemAvailabilityAndEvents1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TransactionAdministrator.mmCurrency;
			componentContext_lazy = () -> SystemAvailabilityAndEvents1.mmObject();
			isDerived = false;
			xmlTag = "SysCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCurrency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected TimePeriodDetails sessionPeriod;
	/**
	 * Time window of system activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TimePeriodDetails
	 * TimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmAvailableSessionPeriod
	 * SystemAvailability.mmAvailableSessionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
	 * SystemAvailabilityAndEvents1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSessionPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemAvailability.mmAvailableSessionPeriod;
			componentContext_lazy = () -> SystemAvailabilityAndEvents1.mmObject();
			isDerived = false;
			xmlTag = "SsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionPeriod";
			definition = "Time window of system activity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TimePeriodDetails.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemEvent2> event;
	/**
	 * Detailed information about an event occurring on a system, whether
	 * planned, such as the cut-off time for a specific type of eligible
	 * transfer, or unplanned (an unsolicited failure), as stipulated in the
	 * specifications of the system.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
	 * SystemAvailabilityAndEvents1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEvent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SystemEventInformation.mmObject();
			componentContext_lazy = () -> SystemAvailabilityAndEvents1.mmObject();
			isDerived = false;
			xmlTag = "Evt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Event";
			definition = "Detailed information about an event occurring on a system, whether planned, such as the cut-off time for a specific type of eligible transfer, or unplanned (an unsolicited failure), as stipulated in the specifications of the system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemEvent2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemClosure1> closureInformation;
	/**
	 * Information regarding the closure time of a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemClosure1
	 * SystemClosure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
	 * SystemAvailabilityAndEvents1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosureInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SystemStatus.mmObject();
			componentContext_lazy = () -> SystemAvailabilityAndEvents1.mmObject();
			isDerived = false;
			xmlTag = "ClsrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureInformation";
			definition = "Information regarding the closure time of a system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemClosure1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SystemAvailabilityAndEvents1.mmSystemCurrency, SystemAvailabilityAndEvents1.mmSessionPeriod, SystemAvailabilityAndEvents1.mmEvent, SystemAvailabilityAndEvents1.mmClosureInformation);
				trace_lazy = () -> System.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemAvailabilityAndEvents1";
				definition = "Specifies the details about the system availability and the related system events that might impact the availability.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SysCcy")
	public ActiveCurrencyCode getSystemCurrency() {
		return systemCurrency;
	}

	public void setSystemCurrency(ActiveCurrencyCode systemCurrency) {
		this.systemCurrency = systemCurrency;
	}

	@XmlElement(name = "SsnPrd")
	public TimePeriodDetails getSessionPeriod() {
		return sessionPeriod;
	}

	public void setSessionPeriod(com.tools20022.repository.msg.TimePeriodDetails sessionPeriod) {
		this.sessionPeriod = sessionPeriod;
	}

	@XmlElement(name = "Evt")
	public List<SystemEvent2> getEvent() {
		return event;
	}

	public void setEvent(List<com.tools20022.repository.msg.SystemEvent2> event) {
		this.event = event;
	}

	@XmlElement(name = "ClsrInf")
	public List<SystemClosure1> getClosureInformation() {
		return closureInformation;
	}

	public void setClosureInformation(List<com.tools20022.repository.msg.SystemClosure1> closureInformation) {
		this.closureInformation = closureInformation;
	}
}