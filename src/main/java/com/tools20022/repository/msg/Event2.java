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
import com.tools20022.repository.area.admi.SystemEventNotificationV02;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max1000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on an event that happened in a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Event2#mmEventCode
 * Event2.mmEventCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Event2#mmEventParameter
 * Event2.mmEventParameter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Event2#mmEventDescription
 * Event2.mmEventDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Event2#mmEventTime
 * Event2.mmEventTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventNotificationV02#mmEventInformation
 * SystemEventNotificationV02.mmEventInformation}</li>
 * </ul>
 * </li>
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
 * "Event2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on an event that happened in a system."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Event1 Event1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Event2", propOrder = {"eventCode", "eventParameter", "eventDescription", "eventTime"})
public class Event2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max4AlphaNumericText eventCode;
	/**
	 * Proprietary code used to specify an event that occurred in a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Event2
	 * Event2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary code used to specify an event that occurred in a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Event1#mmEventCode
	 * Event1.mmEventCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Event2.mmObject();
			isDerived = false;
			xmlTag = "EvtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventCode";
			definition = "Proprietary code used to specify an event that occurred in a system.";
			previousVersion_lazy = () -> Event1.mmEventCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected List<Max35Text> eventParameter;
	/**
	 * Describes the parameters of an event which occurred in a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Event2
	 * Event2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the parameters of an event which occurred in a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Event1#mmEventParameter
	 * Event1.mmEventParameter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventParameter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Event2.mmObject();
			isDerived = false;
			xmlTag = "EvtParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventParameter";
			definition = "Describes the parameters of an event which occurred in a system.";
			previousVersion_lazy = () -> Event1.mmEventParameter;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max1000Text eventDescription;
	/**
	 * Free text used to describe an event which occurred in a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1000Text
	 * Max1000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Event2
	 * Event2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free text used to describe an event which occurred in a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Event1#mmEventDescription
	 * Event1.mmEventDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Event2.mmObject();
			isDerived = false;
			xmlTag = "EvtDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventDescription";
			definition = "Free text used to describe an event which occurred in a system.";
			previousVersion_lazy = () -> Event1.mmEventDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1000Text.mmObject();
		}
	};
	protected ISODateTime eventTime;
	/**
	 * Date and time at which the event occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Event2
	 * Event2}</li>
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
	 * definition} = "Date and time at which the event occurred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Event1#mmEventTime
	 * Event1.mmEventTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Event2.mmObject();
			isDerived = false;
			xmlTag = "EvtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTime";
			definition = "Date and time at which the event occurred.";
			previousVersion_lazy = () -> Event1.mmEventTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Event2.mmEventCode, Event2.mmEventParameter, Event2.mmEventDescription, Event2.mmEventTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(SystemEventNotificationV02.mmEventInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Event2";
				definition = "Provides information on an event that happened in a system.";
				previousVersion_lazy = () -> Event1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "EvtCd", required = true)
	public Max4AlphaNumericText getEventCode() {
		return eventCode;
	}

	public void setEventCode(Max4AlphaNumericText eventCode) {
		this.eventCode = eventCode;
	}

	@XmlElement(name = "EvtParam")
	public List<Max35Text> getEventParameter() {
		return eventParameter;
	}

	public void setEventParameter(List<Max35Text> eventParameter) {
		this.eventParameter = eventParameter;
	}

	@XmlElement(name = "EvtDesc")
	public Max1000Text getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(Max1000Text eventDescription) {
		this.eventDescription = eventDescription;
	}

	@XmlElement(name = "EvtTm")
	public ISODateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(ISODateTime eventTime) {
		this.eventTime = eventTime;
	}
}