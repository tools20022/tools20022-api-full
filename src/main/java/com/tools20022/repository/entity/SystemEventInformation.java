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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.SystemEventType1Choice;
import com.tools20022.repository.choice.SystemEventType2Choice;
import com.tools20022.repository.codeset.SystemEventTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Detailed information about an event occurring on a system, whether planned,
 * for example, cut-off time for a specific type of eligible transfer, or
 * unplanned, for example, an unsolicited failure, as stipulated in the
 * specifications of the system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemEventInformation"
 * src="doc-files/SystemEventInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmType
 * SystemEventInformation.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
 * SystemEventInformation.mmTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmSystem
 * SystemEventInformation.mmSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmEvent
 * System.mmEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1#mmEvent
 * SystemAvailabilityAndEventsDetails1.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmEvent
 * SystemAvailabilityAndEvents1.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CutOff1#mmCutOffUpdateIdentification
 * CutOff1.mmCutOffUpdateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2#mmEvent
 * SystemAvailabilityAndEvents2.mmEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent1 SystemEvent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParticipantAndStatus1
 * ParticipantAndStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceAvailability1
 * ServiceAvailability1}</li>
 * </ul>
 * </li>
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
 * "SystemEventInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed information about an event occurring on a system, whether planned, for example, cut-off time for a specific type of eligible transfer, or unplanned, for example, an unsolicited failure, as stipulated in the specifications of the system."
 * </li>
 * </ul>
 */
public class SystemEventInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemEventTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SystemEventTypeCode
	 * SystemEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType1Choice#mmCode
	 * SystemEventType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice#mmCode
	 * SystemEventType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice#mmProprietary
	 * SystemEventType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent1#mmType
	 * SystemEvent1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmType
	 * SystemEvent2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceAvailability1#mmAvailabilityStatus
	 * ServiceAvailability1.mmAvailabilityStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the event that has occurred."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SystemEventType1Choice.mmCode, SystemEventType2Choice.mmCode, SystemEventType2Choice.mmProprietary, SystemEvent1.mmType, SystemEvent2.mmType, ServiceAvailability1.mmAvailabilityStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the event that has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SystemEventTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemEventInformation.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime time;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemEvent1#mmScheduledTime
	 * SystemEvent1.mmScheduledTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemEvent1#mmEffectiveTime
	 * SystemEvent1.mmEffectiveTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2#mmScheduledTime
	 * SystemEvent2.mmScheduledTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2#mmEffectiveTime
	 * SystemEvent2.mmEffectiveTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmStartTime
	 * SystemEvent2.mmStartTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmEndTime
	 * SystemEvent2.mmEndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestorDetails1#mmDateTimeStamp
	 * RequestorDetails1.mmDateTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponderDetails1#mmDateTimeStamp
	 * ResponderDetails1.mmDateTimeStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#mmCutOffTime
	 * CutOff1.mmCutOffTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Time"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the event occurred."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SystemEvent1.mmScheduledTime, SystemEvent1.mmEffectiveTime, SystemEvent2.mmScheduledTime, SystemEvent2.mmEffectiveTime, SystemEvent2.mmStartTime, SystemEvent2.mmEndTime,
					RequestorDetails1.mmDateTimeStamp, ResponderDetails1.mmDateTimeStamp, CutOff1.mmCutOffTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Time";
			definition = "Date and time at which the event occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemEventInformation.class.getMethod("getTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected System system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#mmEvent
	 * System.mmEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which event information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which event information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemEventInformation";
				definition = "Detailed information about an event occurring on a system, whether planned, for example, cut-off time for a specific type of eligible transfer, or unplanned, for example, an unsolicited failure, as stipulated in the specifications of the system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.mmEvent);
				derivationElement_lazy = () -> Arrays.asList(SystemAvailabilityAndEventsDetails1.mmEvent, SystemAvailabilityAndEvents1.mmEvent, CutOff1.mmCutOffUpdateIdentification, SystemAvailabilityAndEvents2.mmEvent);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemEventInformation.mmType, com.tools20022.repository.entity.SystemEventInformation.mmTime,
						com.tools20022.repository.entity.SystemEventInformation.mmSystem);
				derivationComponent_lazy = () -> Arrays.asList(SystemEvent1.mmObject(), SystemEvent2.mmObject(), ParticipantAndStatus1.mmObject(), ServiceAvailability1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemEventInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SystemEventTypeCode getType() {
		return type;
	}

	public SystemEventInformation setType(SystemEventTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ISODateTime getTime() {
		return time;
	}

	public SystemEventInformation setTime(ISODateTime time) {
		this.time = Objects.requireNonNull(time);
		return this;
	}

	public Optional<System> getSystem() {
		return system == null ? Optional.empty() : Optional.of(system);
	}

	public SystemEventInformation setSystem(com.tools20022.repository.entity.System system) {
		this.system = system;
		return this;
	}
}