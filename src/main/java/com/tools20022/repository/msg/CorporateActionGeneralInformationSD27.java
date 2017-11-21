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
import com.tools20022.repository.codeset.DTCCSubEventType5Code;
import com.tools20022.repository.codeset.EventGroup2Code;
import com.tools20022.repository.codeset.ExtendedEventType4Code;
import com.tools20022.repository.datatype.Max10NumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action general
 * information details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27#mmPlaceAndName
 * CorporateActionGeneralInformationSD27.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27#mmEventGroup
 * CorporateActionGeneralInformationSD27.mmEventGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27#mmEventType
 * CorporateActionGeneralInformationSD27.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27#mmSubEventType
 * CorporateActionGeneralInformationSD27.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27#mmRedemptionIdentification
 * CorporateActionGeneralInformationSD27.mmRedemptionIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformationSD27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD25
 * CorporateActionGeneralInformationSD25}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionGeneralInformationSD27", propOrder = {"placeAndName", "eventGroup", "eventType", "subEventType", "redemptionIdentification"})
public class CorporateActionGeneralInformationSD27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27
	 * CorporateActionGeneralInformationSD27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD25#mmPlaceAndName
	 * CorporateActionGeneralInformationSD25.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD27.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD25.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected EventGroup2Code eventGroup;
	/**
	 * DTC processing domain/ category for event types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventGroup2Code
	 * EventGroup2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27
	 * CorporateActionGeneralInformationSD27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTC processing domain/ category for event types."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD25#mmEventGroup
	 * CorporateActionGeneralInformationSD25.mmEventGroup}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventGroup = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD27.mmObject();
			isDerived = false;
			xmlTag = "EvtGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventGroup";
			definition = "DTC processing domain/ category for event types.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD25.mmEventGroup;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventGroup2Code.mmObject();
		}
	};
	protected ExtendedEventType4Code eventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action event type name. Used in place for the events that cannot be
	 * classified by ISO code and mapped to OTHR or when two or more distinct
	 * events (in DTCC model) use same ISO code and there are no additional data
	 * elements that distinguish those two or more events.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code
	 * ExtendedEventType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27
	 * CorporateActionGeneralInformationSD27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two  or more distinct events (in DTCC model)  use same ISO code and there are no additional data elements that distinguish those two or more events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD25#mmEventType
	 * CorporateActionGeneralInformationSD25.mmEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD27.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two  or more distinct events (in DTCC model)  use same ISO code and there are no additional data elements that distinguish those two or more events.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD25.mmEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType4Code.mmObject();
		}
	};
	protected DTCCSubEventType5Code subEventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action sub event type name further defines the event type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27
	 * CorporateActionGeneralInformationSD27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD25#mmSubEventType
	 * CorporateActionGeneralInformationSD25.mmSubEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD27.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. ";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD25.mmSubEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType5Code.mmObject();
		}
	};
	protected Max10NumericText redemptionIdentification;
	/**
	 * Unique number systemically assigned to all Lottery and Non-Lottery events
	 * announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/
	 * Particinant Browser System(PBS) function.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10NumericText
	 * Max10NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD27
	 * CorporateActionGeneralInformationSD27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD25#mmRedemptionIdentification
	 * CorporateActionGeneralInformationSD25.mmRedemptionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD27.mmObject();
			isDerived = false;
			xmlTag = "RedId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionIdentification";
			definition = "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function. ";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD25.mmRedemptionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD27.mmPlaceAndName, CorporateActionGeneralInformationSD27.mmEventGroup, CorporateActionGeneralInformationSD27.mmEventType,
						CorporateActionGeneralInformationSD27.mmSubEventType, CorporateActionGeneralInformationSD27.mmRedemptionIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionGeneralInformationSD27";
				definition = "Provides additional information regarding corporate action general information details.";
				previousVersion_lazy = () -> CorporateActionGeneralInformationSD25.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "EvtGrp")
	public EventGroup2Code getEventGroup() {
		return eventGroup;
	}

	public void setEventGroup(EventGroup2Code eventGroup) {
		this.eventGroup = eventGroup;
	}

	@XmlElement(name = "EvtTp")
	public ExtendedEventType4Code getEventType() {
		return eventType;
	}

	public void setEventType(ExtendedEventType4Code eventType) {
		this.eventType = eventType;
	}

	@XmlElement(name = "SubEvtTp")
	public DTCCSubEventType5Code getSubEventType() {
		return subEventType;
	}

	public void setSubEventType(DTCCSubEventType5Code subEventType) {
		this.subEventType = subEventType;
	}

	@XmlElement(name = "RedId")
	public Max10NumericText getRedemptionIdentification() {
		return redemptionIdentification;
	}

	public void setRedemptionIdentification(Max10NumericText redemptionIdentification) {
		this.redemptionIdentification = redemptionIdentification;
	}
}