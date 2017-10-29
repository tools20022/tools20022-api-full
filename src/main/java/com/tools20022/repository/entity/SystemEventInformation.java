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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SystemEventTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.ParticipantAndStatus1;
import com.tools20022.repository.msg.ServiceAvailability1;
import com.tools20022.repository.msg.SystemEvent1;
import com.tools20022.repository.msg.SystemEvent2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.SystemEventInformation#Type
 * SystemEventInformation.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemEventInformation#Time
 * SystemEventInformation.Time}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#System
 * SystemEventInformation.System}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#Event System.Event}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1#Event
 * SystemAvailabilityAndEventsDetails1.Event}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#Event
 * SystemAvailabilityAndEvents1.Event}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CutOff1#CutOffUpdateIdentification
 * CutOff1.CutOffUpdateIdentification}</li>
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
	/**
	 * Nature of the event that has occurred.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.SystemEventType1Choice#Code
	 * SystemEventType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice#Code
	 * SystemEventType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice#Proprietary
	 * SystemEventType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent1#Type
	 * SystemEvent1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#Type
	 * SystemEvent2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceAvailability1#AvailabilityStatus
	 * ServiceAvailability1.AvailabilityStatus}</li>
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SystemEventType1Choice.Code, com.tools20022.repository.choice.SystemEventType2Choice.Code,
					com.tools20022.repository.choice.SystemEventType2Choice.Proprietary, com.tools20022.repository.msg.SystemEvent1.Type, com.tools20022.repository.msg.SystemEvent2.Type,
					com.tools20022.repository.msg.ServiceAvailability1.AvailabilityStatus);
			elementContext_lazy = () -> SystemEventInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the event that has occurred.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SystemEventTypeCode.mmObject();
		}
	};
	/**
	 * Date and time at which the event occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent1#ScheduledTime
	 * SystemEvent1.ScheduledTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent1#EffectiveTime
	 * SystemEvent1.EffectiveTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#ScheduledTime
	 * SystemEvent2.ScheduledTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#EffectiveTime
	 * SystemEvent2.EffectiveTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#StartTime
	 * SystemEvent2.StartTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#EndTime
	 * SystemEvent2.EndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestorDetails1#DateTimeStamp
	 * RequestorDetails1.DateTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResponderDetails1#DateTimeStamp
	 * ResponderDetails1.DateTimeStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#CutOffTime
	 * CutOff1.CutOffTime}</li>
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
	public static final MMBusinessAttribute Time = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemEvent1.ScheduledTime, com.tools20022.repository.msg.SystemEvent1.EffectiveTime, com.tools20022.repository.msg.SystemEvent2.ScheduledTime,
					com.tools20022.repository.msg.SystemEvent2.EffectiveTime, com.tools20022.repository.msg.SystemEvent2.StartTime, com.tools20022.repository.msg.SystemEvent2.EndTime,
					com.tools20022.repository.msg.RequestorDetails1.DateTimeStamp, com.tools20022.repository.msg.ResponderDetails1.DateTimeStamp, com.tools20022.repository.msg.CutOff1.CutOffTime);
			elementContext_lazy = () -> SystemEventInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Time";
			definition = "Date and time at which the event occurred.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * System for which event information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#Event
	 * System.Event}</li>
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
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemEventInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which event information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Event;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemEventInformation";
				definition = "Detailed information about an event occurring on a system, whether planned, for example, cut-off time for a specific type of eligible transfer, or unplanned, for example, an unsolicited failure, as stipulated in the specifications of the system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.Event);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1.Event, com.tools20022.repository.msg.SystemAvailabilityAndEvents1.Event,
						com.tools20022.repository.msg.CutOff1.CutOffUpdateIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemEventInformation.Type, com.tools20022.repository.entity.SystemEventInformation.Time, com.tools20022.repository.entity.SystemEventInformation.System);
				derivationComponent_lazy = () -> Arrays.asList(SystemEvent1.mmObject(), SystemEvent2.mmObject(), ParticipantAndStatus1.mmObject(), ServiceAvailability1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}