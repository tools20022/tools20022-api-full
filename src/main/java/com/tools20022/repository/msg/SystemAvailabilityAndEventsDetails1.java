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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.SystemAvailability;
import com.tools20022.repository.entity.SystemEventInformation;
import com.tools20022.repository.entity.TransactionAdministrator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemClosureDetails;
import com.tools20022.repository.msg.SystemEvent1;
import com.tools20022.repository.msg.TimePeriodDetails;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing, netting, reconciliation, trading and/or settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1#mmSystemCurrency
 * SystemAvailabilityAndEventsDetails1.mmSystemCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1#mmSessionPeriod
 * SystemAvailabilityAndEventsDetails1.mmSessionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1#mmEvent
 * SystemAvailabilityAndEventsDetails1.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1#mmClosureInformation
 * SystemAvailabilityAndEventsDetails1.mmClosureInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemAvailabilityAndEventsDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemAvailabilityAndEventsDetails1", propOrder = {"systemCurrency", "sessionPeriod", "event", "closureInformation"})
public class SystemAvailabilityAndEventsDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysCcy", required = true)
	protected CurrencyCode systemCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrency
	 * TransactionAdministrator.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1
	 * SystemAvailabilityAndEventsDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemAvailabilityAndEventsDetails1, CurrencyCode> mmSystemCurrency = new MMMessageAttribute<SystemAvailabilityAndEventsDetails1, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> TransactionAdministrator.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmObject();
			isDerived = false;
			xmlTag = "SysCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCurrency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(SystemAvailabilityAndEventsDetails1 obj) {
			return obj.getSystemCurrency();
		}

		@Override
		public void setValue(SystemAvailabilityAndEventsDetails1 obj, CurrencyCode value) {
			obj.setSystemCurrency(value);
		}
	};
	@XmlElement(name = "SsnPrd")
	protected TimePeriodDetails sessionPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1
	 * SystemAvailabilityAndEventsDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SsnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SessionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time window of system activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemAvailabilityAndEventsDetails1, Optional<TimePeriodDetails>> mmSessionPeriod = new MMMessageAttribute<SystemAvailabilityAndEventsDetails1, Optional<TimePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> SystemAvailability.mmAvailableSessionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmObject();
			isDerived = false;
			xmlTag = "SsnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionPeriod";
			definition = "Time window of system activity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TimePeriodDetails.mmObject();
		}

		@Override
		public Optional<TimePeriodDetails> getValue(SystemAvailabilityAndEventsDetails1 obj) {
			return obj.getSessionPeriod();
		}

		@Override
		public void setValue(SystemAvailabilityAndEventsDetails1 obj, Optional<TimePeriodDetails> value) {
			obj.setSessionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Evt")
	protected List<SystemEvent1> event;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemEvent1
	 * SystemEvent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1
	 * SystemAvailabilityAndEventsDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Evt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about an event occurring on a system, whether planned, eg, cut-off time for a specific type of eligible transfer, or unplanned, eg, an unsolicited failure, as stipulated in the specifications of the system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemAvailabilityAndEventsDetails1, List<SystemEvent1>> mmEvent = new MMMessageAssociationEnd<SystemAvailabilityAndEventsDetails1, List<SystemEvent1>>() {
		{
			businessComponentTrace_lazy = () -> SystemEventInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmObject();
			isDerived = false;
			xmlTag = "Evt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Event";
			definition = "Detailed information about an event occurring on a system, whether planned, eg, cut-off time for a specific type of eligible transfer, or unplanned, eg, an unsolicited failure, as stipulated in the specifications of the system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemEvent1.mmObject();
		}

		@Override
		public List<SystemEvent1> getValue(SystemAvailabilityAndEventsDetails1 obj) {
			return obj.getEvent();
		}

		@Override
		public void setValue(SystemAvailabilityAndEventsDetails1 obj, List<SystemEvent1> value) {
			obj.setEvent(value);
		}
	};
	@XmlElement(name = "ClsrInf")
	protected List<SystemClosureDetails> closureInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemClosureDetails
	 * SystemClosureDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1
	 * SystemAvailabilityAndEventsDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about inactivity of a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemAvailabilityAndEventsDetails1, List<SystemClosureDetails>> mmClosureInformation = new MMMessageAssociationEnd<SystemAvailabilityAndEventsDetails1, List<SystemClosureDetails>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClsrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureInformation";
			definition = "Information about inactivity of a system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemClosureDetails.mmObject();
		}

		@Override
		public List<SystemClosureDetails> getValue(SystemAvailabilityAndEventsDetails1 obj) {
			return obj.getClosureInformation();
		}

		@Override
		public void setValue(SystemAvailabilityAndEventsDetails1 obj, List<SystemClosureDetails> value) {
			obj.setClosureInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmSystemCurrency, com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmSessionPeriod,
						com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmEvent, com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.mmClosureInformation);
				trace_lazy = () -> System.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SystemAvailabilityAndEventsDetails1";
				definition = "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getSystemCurrency() {
		return systemCurrency;
	}

	public SystemAvailabilityAndEventsDetails1 setSystemCurrency(CurrencyCode systemCurrency) {
		this.systemCurrency = Objects.requireNonNull(systemCurrency);
		return this;
	}

	public Optional<TimePeriodDetails> getSessionPeriod() {
		return sessionPeriod == null ? Optional.empty() : Optional.of(sessionPeriod);
	}

	public SystemAvailabilityAndEventsDetails1 setSessionPeriod(TimePeriodDetails sessionPeriod) {
		this.sessionPeriod = sessionPeriod;
		return this;
	}

	public List<SystemEvent1> getEvent() {
		return event == null ? event = new ArrayList<>() : event;
	}

	public SystemAvailabilityAndEventsDetails1 setEvent(List<SystemEvent1> event) {
		this.event = Objects.requireNonNull(event);
		return this;
	}

	public List<SystemClosureDetails> getClosureInformation() {
		return closureInformation == null ? closureInformation = new ArrayList<>() : closureInformation;
	}

	public SystemAvailabilityAndEventsDetails1 setClosureInformation(List<SystemClosureDetails> closureInformation) {
		this.closureInformation = Objects.requireNonNull(closureInformation);
		return this;
	}
}