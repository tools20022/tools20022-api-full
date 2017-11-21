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
import com.tools20022.repository.codeset.EventCompletenessStatus1Code;
import com.tools20022.repository.codeset.EventConfirmationStatus1Code;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The process of notifying of an upcoming corporate action. It provides
 * corporate action details including the different options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1#mmEventCompletenessStatus
 * CorporateActionEventStatus1.mmEventCompletenessStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1#mmEventConfirmationStatus
 * CorporateActionEventStatus1.mmEventConfirmationStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
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
 * "CorporateActionEventStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The process of notifying of an upcoming corporate action. It provides corporate action details including the different options."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionEventStatus1", propOrder = {"eventCompletenessStatus", "eventConfirmationStatus"})
public class CorporateActionEventStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected EventCompletenessStatus1Code eventCompletenessStatus;
	/**
	 * Indicates whether the details provided about an event are complete or
	 * incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventCompletenessStatus1Code
	 * EventCompletenessStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmProcessingStatus
	 * CorporateActionStatus.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1
	 * CorporateActionEventStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtCmpltnsSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventCompletenessStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the details provided about an event are complete or incomplete."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventCompletenessStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmProcessingStatus;
			componentContext_lazy = () -> CorporateActionEventStatus1.mmObject();
			isDerived = false;
			xmlTag = "EvtCmpltnsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventCompletenessStatus";
			definition = "Indicates whether the details provided about an event are complete or incomplete.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventCompletenessStatus1Code.mmObject();
		}
	};
	protected EventConfirmationStatus1Code eventConfirmationStatus;
	/**
	 * Indicates the status of the occurrence of an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventConfirmationStatus1Code
	 * EventConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmProcessingStatus
	 * CorporateActionStatus.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1
	 * CorporateActionEventStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtConfSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of the occurrence of an event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventConfirmationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmProcessingStatus;
			componentContext_lazy = () -> CorporateActionEventStatus1.mmObject();
			isDerived = false;
			xmlTag = "EvtConfSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventConfirmationStatus";
			definition = "Indicates the status of the occurrence of an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventConfirmationStatus1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionEventStatus1.mmEventCompletenessStatus, CorporateActionEventStatus1.mmEventConfirmationStatus);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStatus1";
				definition = "The process of notifying of an upcoming corporate action. It provides corporate action details including the different options.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "EvtCmpltnsSts", required = true)
	public EventCompletenessStatus1Code getEventCompletenessStatus() {
		return eventCompletenessStatus;
	}

	public void setEventCompletenessStatus(EventCompletenessStatus1Code eventCompletenessStatus) {
		this.eventCompletenessStatus = eventCompletenessStatus;
	}

	@XmlElement(name = "EvtConfSts", required = true)
	public EventConfirmationStatus1Code getEventConfirmationStatus() {
		return eventConfirmationStatus;
	}

	public void setEventConfirmationStatus(EventConfirmationStatus1Code eventConfirmationStatus) {
		this.eventConfirmationStatus = eventConfirmationStatus;
	}
}