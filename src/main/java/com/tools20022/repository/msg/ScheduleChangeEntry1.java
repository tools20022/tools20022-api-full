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
import com.tools20022.repository.choice.SystemEventType2Choice;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details about the schedule change.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#ScheduleEventType
 * ScheduleChangeEntry1.ScheduleEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#ScheduleEventIdentification
 * ScheduleChangeEntry1.ScheduleEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#EventFrequency
 * ScheduleChangeEntry1.EventFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#EventPreviousFrequency
 * ScheduleChangeEntry1.EventPreviousFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#EventTime
 * ScheduleChangeEntry1.EventTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#EventPreviousTime
 * ScheduleChangeEntry1.EventPreviousTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#EventDuration
 * ScheduleChangeEntry1.EventDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#EventPreviousDuration
 * ScheduleChangeEntry1.EventPreviousDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#ChangeType
 * ScheduleChangeEntry1.ChangeType}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ScheduleChangeEntry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details about the schedule change."</li>
 * </ul>
 */
public class ScheduleChangeEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of the scheduled event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice
	 * SystemEventType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchdlEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduleEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the scheduled event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ScheduleEventType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "SchdlEvtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduleEventType";
			definition = "Type of the scheduled event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemEventType2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identificaiton of the scheduled event
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact1NumericText
	 * Exact1NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchdlEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduleEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identificaiton of the scheduled event"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ScheduleEventIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "SchdlEvtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduleEventIdentification";
			definition = "Identificaiton of the scheduled event";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact1NumericText.mmObject();
		}
	};
	/**
	 * New frequency of the scheduled event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New frequency of the scheduled event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventFrequency";
			definition = "New frequency of the scheduled event.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	/**
	 * Frequency of the scheduled event before change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtPrvsFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventPreviousFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the scheduled event before change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventPreviousFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtPrvsFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventPreviousFrequency";
			definition = "Frequency of the scheduled event before change.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	/**
	 * New scheduled time of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New scheduled time of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTime";
			definition = "New scheduled time of the event.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	/**
	 * Scheduled time of the event before change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtPrvsTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventPreviousTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheduled time of the event before change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventPreviousTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtPrvsTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventPreviousTime";
			definition = "Scheduled time of the event before change.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	/**
	 * Minimum duration of event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtDrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventDuration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum duration of event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventDuration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtDrtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventDuration";
			definition = "Minimum duration of event.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Set earlier duration of event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtPrvsDrtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventPreviousDuration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set earlier duration of event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventPreviousDuration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtPrvsDrtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventPreviousDuration";
			definition = "Set earlier duration of event.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Type of schedule modification (i.e. event cancelled, new event).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of schedule modification (i.e. event cancelled, new event)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ChangeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Type of schedule modification (i.e. event cancelled, new event).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ScheduleChangeEntry1.ScheduleEventType, com.tools20022.repository.msg.ScheduleChangeEntry1.ScheduleEventIdentification,
						com.tools20022.repository.msg.ScheduleChangeEntry1.EventFrequency, com.tools20022.repository.msg.ScheduleChangeEntry1.EventPreviousFrequency, com.tools20022.repository.msg.ScheduleChangeEntry1.EventTime,
						com.tools20022.repository.msg.ScheduleChangeEntry1.EventPreviousTime, com.tools20022.repository.msg.ScheduleChangeEntry1.EventDuration, com.tools20022.repository.msg.ScheduleChangeEntry1.EventPreviousDuration,
						com.tools20022.repository.msg.ScheduleChangeEntry1.ChangeType);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ScheduleChangeEntry1";
				definition = "Details about the schedule change.";
			}
		});
		return mmObject_lazy.get();
	}
}