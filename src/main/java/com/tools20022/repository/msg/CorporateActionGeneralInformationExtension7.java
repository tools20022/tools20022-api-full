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
import com.tools20022.repository.choice.SecurityIdentification12Choice;
import com.tools20022.repository.codeset.DTCCSubEventType1Code;
import com.tools20022.repository.codeset.ExtendedEventType1Code;
import com.tools20022.repository.datatype.Max10Text;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action general
 * information in instruction status advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7#PlaceAndName
 * CorporateActionGeneralInformationExtension7.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7#EventType
 * CorporateActionGeneralInformationExtension7.EventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7#SubEventType
 * CorporateActionGeneralInformationExtension7.SubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7#EventSecurity
 * CorporateActionGeneralInformationExtension7.EventSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7#ParticipantName
 * CorporateActionGeneralInformationExtension7.ParticipantName}</li>
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
 * "CorporateActionGeneralInformationExtension7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information in instruction status advice."
 * </li>
 * </ul>
 */
public class CorporateActionGeneralInformationExtension7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7
	 * CorporateActionGeneralInformationExtension7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension7.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action event type name. Used in place for the events that cannot be
	 * classified by ISO Code and are marked as OTHR. Can be used in combination
	 * with DTCC sub event type (when provided) to identify the event. For an
	 * example: a distribution based on recapitalisation event will be presented
	 * as event type: OTHR in standard message. DTCC native event type would be
	 * Distribution (DIST) and DTCC sub event type would be Recapitalisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7
	 * CorporateActionGeneralInformationExtension7}</li>
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
	 * "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension7.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. ";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}
	};
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action sub event type name further defines the event type. For an
	 * example: a cash dividend event with currency election will be noted as
	 * event type: Cash Dividend (DVCA) and DTCC sub event type: Currency
	 * Election (CURR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7
	 * CorporateActionGeneralInformationExtension7}</li>
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
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election (CURR)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute SubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension7.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election (CURR).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DTCCSubEventType1Code.mmObject();
		}
	};
	/**
	 * Event (underlying) security identification and type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice
	 * SecurityIdentification12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7
	 * CorporateActionGeneralInformationExtension7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event (underlying) security identification and type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute EventSecurity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension7.mmObject();
			isDerived = false;
			xmlTag = "EvtScty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventSecurity";
			definition = "Event (underlying) security identification and type.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> SecurityIdentification12Choice.mmObject();
		}
	};
	/**
	 * Name of the participant at DTCC (The Depository Trust and Clearing
	 * Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7
	 * CorporateActionGeneralInformationExtension7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the participant at DTCC  (The Depository Trust and Clearing Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ParticipantName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension7.mmObject();
			isDerived = false;
			xmlTag = "PtcptNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantName";
			definition = "Name of the participant at DTCC  (The Depository Trust and Clearing Corporation).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7.PlaceAndName, com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7.EventType,
						com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7.SubEventType, com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7.EventSecurity,
						com.tools20022.repository.msg.CorporateActionGeneralInformationExtension7.ParticipantName);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionGeneralInformationExtension7";
				definition = "Provides additional information regarding corporate action general information in instruction status advice.";
			}
		});
		return mmObject_lazy.get();
	}
}