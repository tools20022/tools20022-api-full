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
import com.tools20022.repository.choice.SystemEventType2Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmScheduleEventType
 * ScheduleChangeEntry1.mmScheduleEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmScheduleEventIdentification
 * ScheduleChangeEntry1.mmScheduleEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmEventFrequency
 * ScheduleChangeEntry1.mmEventFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmEventPreviousFrequency
 * ScheduleChangeEntry1.mmEventPreviousFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmEventTime
 * ScheduleChangeEntry1.mmEventTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmEventPreviousTime
 * ScheduleChangeEntry1.mmEventPreviousTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmEventDuration
 * ScheduleChangeEntry1.mmEventDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmEventPreviousDuration
 * ScheduleChangeEntry1.mmEventPreviousDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1#mmChangeType
 * ScheduleChangeEntry1.mmChangeType}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ScheduleChangeEntry1", propOrder = {"scheduleEventType", "scheduleEventIdentification", "eventFrequency", "eventPreviousFrequency", "eventTime", "eventPreviousTime", "eventDuration", "eventPreviousDuration", "changeType"})
public class ScheduleChangeEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SchdlEvtTp", required = true)
	protected SystemEventType2Choice scheduleEventType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmScheduleEventType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "SchdlEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduleEventType";
			definition = "Type of the scheduled event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemEventType2Choice.mmObject();
		}
	};
	@XmlElement(name = "SchdlEvtId")
	protected Exact1NumericText scheduleEventIdentification;
	/**
	 * 
	 <p>
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
	 * definition} = "Identificaiton of the scheduled event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmScheduleEventIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "SchdlEvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduleEventIdentification";
			definition = "Identificaiton of the scheduled event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact1NumericText.mmObject();
		}
	};
	@XmlElement(name = "EvtFrqcy")
	protected Max4Text eventFrequency;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmEventFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventFrequency";
			definition = "New frequency of the scheduled event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	@XmlElement(name = "EvtPrvsFrqcy")
	protected Max4Text eventPreviousFrequency;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmEventPreviousFrequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtPrvsFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventPreviousFrequency";
			definition = "Frequency of the scheduled event before change.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	@XmlElement(name = "EvtTm")
	protected ISOTime eventTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmEventTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTime";
			definition = "New scheduled time of the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	@XmlElement(name = "EvtPrvsTm")
	protected ISOTime eventPreviousTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmEventPreviousTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtPrvsTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventPreviousTime";
			definition = "Scheduled time of the event before change.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	@XmlElement(name = "EvtDrtn")
	protected Max3NumericText eventDuration;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmEventDuration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtDrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventDuration";
			definition = "Minimum duration of event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "EvtPrvsDrtn")
	protected Max3NumericText eventPreviousDuration;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmEventPreviousDuration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "EvtPrvsDrtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventPreviousDuration";
			definition = "Set earlier duration of event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "ChngTp", required = true)
	protected Max35Text changeType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmChangeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeEntry1.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Type of schedule modification (i.e. event cancelled, new event).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ScheduleChangeEntry1.mmScheduleEventType, com.tools20022.repository.msg.ScheduleChangeEntry1.mmScheduleEventIdentification,
						com.tools20022.repository.msg.ScheduleChangeEntry1.mmEventFrequency, com.tools20022.repository.msg.ScheduleChangeEntry1.mmEventPreviousFrequency, com.tools20022.repository.msg.ScheduleChangeEntry1.mmEventTime,
						com.tools20022.repository.msg.ScheduleChangeEntry1.mmEventPreviousTime, com.tools20022.repository.msg.ScheduleChangeEntry1.mmEventDuration, com.tools20022.repository.msg.ScheduleChangeEntry1.mmEventPreviousDuration,
						com.tools20022.repository.msg.ScheduleChangeEntry1.mmChangeType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ScheduleChangeEntry1";
				definition = "Details about the schedule change.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemEventType2Choice getScheduleEventType() {
		return scheduleEventType;
	}

	public ScheduleChangeEntry1 setScheduleEventType(SystemEventType2Choice scheduleEventType) {
		this.scheduleEventType = Objects.requireNonNull(scheduleEventType);
		return this;
	}

	public Optional<Exact1NumericText> getScheduleEventIdentification() {
		return scheduleEventIdentification == null ? Optional.empty() : Optional.of(scheduleEventIdentification);
	}

	public ScheduleChangeEntry1 setScheduleEventIdentification(Exact1NumericText scheduleEventIdentification) {
		this.scheduleEventIdentification = scheduleEventIdentification;
		return this;
	}

	public Optional<Max4Text> getEventFrequency() {
		return eventFrequency == null ? Optional.empty() : Optional.of(eventFrequency);
	}

	public ScheduleChangeEntry1 setEventFrequency(Max4Text eventFrequency) {
		this.eventFrequency = eventFrequency;
		return this;
	}

	public Optional<Max4Text> getEventPreviousFrequency() {
		return eventPreviousFrequency == null ? Optional.empty() : Optional.of(eventPreviousFrequency);
	}

	public ScheduleChangeEntry1 setEventPreviousFrequency(Max4Text eventPreviousFrequency) {
		this.eventPreviousFrequency = eventPreviousFrequency;
		return this;
	}

	public Optional<ISOTime> getEventTime() {
		return eventTime == null ? Optional.empty() : Optional.of(eventTime);
	}

	public ScheduleChangeEntry1 setEventTime(ISOTime eventTime) {
		this.eventTime = eventTime;
		return this;
	}

	public Optional<ISOTime> getEventPreviousTime() {
		return eventPreviousTime == null ? Optional.empty() : Optional.of(eventPreviousTime);
	}

	public ScheduleChangeEntry1 setEventPreviousTime(ISOTime eventPreviousTime) {
		this.eventPreviousTime = eventPreviousTime;
		return this;
	}

	public Optional<Max3NumericText> getEventDuration() {
		return eventDuration == null ? Optional.empty() : Optional.of(eventDuration);
	}

	public ScheduleChangeEntry1 setEventDuration(Max3NumericText eventDuration) {
		this.eventDuration = eventDuration;
		return this;
	}

	public Optional<Max3NumericText> getEventPreviousDuration() {
		return eventPreviousDuration == null ? Optional.empty() : Optional.of(eventPreviousDuration);
	}

	public ScheduleChangeEntry1 setEventPreviousDuration(Max3NumericText eventPreviousDuration) {
		this.eventPreviousDuration = eventPreviousDuration;
		return this;
	}

	public Max35Text getChangeType() {
		return changeType;
	}

	public ScheduleChangeEntry1 setChangeType(Max35Text changeType) {
		this.changeType = Objects.requireNonNull(changeType);
		return this;
	}
}