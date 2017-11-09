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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SystemEventType2Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.SystemEventInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details on an event occurring in a system, whether planned or
 * unplanned as stipulated in the specifications of the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmType
 * SystemEvent2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmScheduledTime
 * SystemEvent2.mmScheduledTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmEffectiveTime
 * SystemEvent2.mmEffectiveTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmStartTime
 * SystemEvent2.mmStartTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmEndTime
 * SystemEvent2.mmEndTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemEventInformation
 * SystemEventInformation}</li>
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
 * "SystemEvent2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on an event occurring in a system, whether planned or unplanned as stipulated in the specifications of the system."
 * </li>
 * </ul>
 */
public class SystemEvent2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemEventType2Choice type;
	/**
	 * Nature of the event that has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice
	 * SystemEventType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmType
	 * SystemEventInformation.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the event that has occurred."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmType;
			componentContext_lazy = () -> SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Nature of the event that has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemEventType2Choice.mmObject();
		}
	};
	protected ISODateTime scheduledTime;
	/**
	 * Date and time at which the event is foreseen to occur.
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
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchdldTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduledTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the event is foreseen to occur. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmScheduledTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "SchdldTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledTime";
			definition = "Date and time at which the event is foreseen to occur. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime effectiveTime;
	/**
	 * Date and time at which the event effectively takes place.
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
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the event effectively takes place. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "FctvTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveTime";
			definition = "Date and time at which the event effectively takes place. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime startTime;
	/**
	 * Time at which the event starts.
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
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time at which the event starts."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "StartTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartTime";
			definition = "Time at which the event starts.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime endTime;
	/**
	 * Time at which the event ends.
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
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time at which the event ends."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "EndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndTime";
			definition = "Time at which the event ends.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SystemEvent2.mmType, SystemEvent2.mmScheduledTime, SystemEvent2.mmEffectiveTime, SystemEvent2.mmStartTime, SystemEvent2.mmEndTime);
				trace_lazy = () -> SystemEventInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemEvent2";
				definition = "Provides details on an event occurring in a system, whether planned or unplanned as stipulated in the specifications of the system.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemEventType2Choice getType() {
		return type;
	}

	public void setType(SystemEventType2Choice type) {
		this.type = type;
	}

	public ISODateTime getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(ISODateTime scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public ISODateTime getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(ISODateTime effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public ISODateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(ISODateTime startTime) {
		this.startTime = startTime;
	}

	public ISODateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(ISODateTime endTime) {
		this.endTime = endTime;
	}
}