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
import com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code;
import com.tools20022.repository.codeset.DTCCSubEventType3Code;
import com.tools20022.repository.codeset.EventGroup1Code;
import com.tools20022.repository.codeset.ExtendedEventType2Code;
import com.tools20022.repository.datatype.Max10NumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmPlaceAndName
 * CorporateActionGeneralInformationSD13.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmEventGroup
 * CorporateActionGeneralInformationSD13.mmEventGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmEventType
 * CorporateActionGeneralInformationSD13.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmSubEventType
 * CorporateActionGeneralInformationSD13.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmDTCMandatoryVoluntaryEventType
 * CorporateActionGeneralInformationSD13.mmDTCMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmDeclaredMandatoryVoluntaryEventType
 * CorporateActionGeneralInformationSD13.mmDeclaredMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmEDSMessagingEligibilityFlag
 * CorporateActionGeneralInformationSD13.mmEDSMessagingEligibilityFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmRedemptionIdentification
 * CorporateActionGeneralInformationSD13.mmRedemptionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmDTCFCPElectionFlag
 * CorporateActionGeneralInformationSD13.mmDTCFCPElectionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmAssetServicerProcessingFlag
 * CorporateActionGeneralInformationSD13.mmAssetServicerProcessingFlag}</li>
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
 * "CorporateActionGeneralInformationSD13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
 * CorporateActionGeneralInformationSD11}</li>
 * </ul>
 */
public class CorporateActionGeneralInformationSD13 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmPlaceAndName
	 * CorporateActionGeneralInformationSD11.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected EventGroup1Code eventGroup;
	/**
	 * DTC processing domain/ category for event types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventGroup1Code
	 * EventGroup1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmEventGroup
	 * CorporateActionGeneralInformationSD11.mmEventGroup}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventGroup = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "EvtGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventGroup";
			definition = "DTC processing domain/ category for event types.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmEventGroup;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventGroup1Code.mmObject();
		}
	};
	protected ExtendedEventType2Code eventType;
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
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType2Code
	 * ExtendedEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmEventType
	 * CorporateActionGeneralInformationSD11.mmEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two  or more distinct events (in DTCC model)  use same ISO code and there are no additional data elements that distinguish those two or more events.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType2Code.mmObject();
		}
	};
	protected DTCCSubEventType3Code subEventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action sub event type name further defines the event type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
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
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmSubEventType
	 * CorporateActionGeneralInformationSD11.mmSubEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmSubEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType3Code.mmObject();
		}
	};
	protected CorporateActionMandatoryVoluntary1Code dTCMandatoryVoluntaryEventType;
	/**
	 * Specifies the nature of the event with regard to how it is being
	 * supported by DTC (The Depository Trust Corporation) the custodian:
	 * whether the event is mandatory, voluntary, or mandatory with options and
	 * eligible for DTC processing. This classification is necessary for the
	 * event types that have additional DTC only options. For an example: a MAND
	 * event, where the issuer declared only one option may be eligible for
	 * special DTC options (services like Dividend Reinvestment, Foreign
	 * Currency Payment, etc) in this case it will be announced as MAND by the
	 * issuer and CHOS by DTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code
	 * CorporateActionMandatoryVoluntary1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCMndtryVlntryEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCMandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the event with regard to how it is being supported by DTC (The Depository Trust Corporation)  the custodian: whether the event is mandatory, voluntary, or mandatory with options and eligible for DTC processing. This classification is necessary for the event types that have additional DTC only options. For an example: a MAND event, where the issuer declared only one option may be eligible for special DTC options (services like Dividend Reinvestment, Foreign Currency Payment, etc)  in this case it will be announced as MAND by the issuer and CHOS by DTC. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmDTCMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformationSD11.mmDTCMandatoryVoluntaryEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCMandatoryVoluntaryEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "DTCMndtryVlntryEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCMandatoryVoluntaryEventType";
			definition = "Specifies the nature of the event with regard to how it is being supported by DTC (The Depository Trust Corporation)  the custodian: whether the event is mandatory, voluntary, or mandatory with options and eligible for DTC processing. This classification is necessary for the event types that have additional DTC only options. For an example: a MAND event, where the issuer declared only one option may be eligible for special DTC options (services like Dividend Reinvestment, Foreign Currency Payment, etc)  in this case it will be announced as MAND by the issuer and CHOS by DTC. ";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmDTCMandatoryVoluntaryEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntary1Code.mmObject();
		}
	};
	protected CorporateActionMandatoryVoluntary1Code declaredMandatoryVoluntaryEventType;
	/**
	 * Specifies the nature of the event as announced by the agent or issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code
	 * CorporateActionMandatoryVoluntary1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdMndtryVlntryEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredMandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the event as announced by the agent or issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmDeclaredMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformationSD11.
	 * mmDeclaredMandatoryVoluntaryEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredMandatoryVoluntaryEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "DclrdMndtryVlntryEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredMandatoryVoluntaryEventType";
			definition = "Specifies the nature of the event as announced by the agent or issuer.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmDeclaredMandatoryVoluntaryEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntary1Code.mmObject();
		}
	};
	protected YesNoIndicator eDSMessagingEligibilityFlag;
	/**
	 * Indicates whether the event is eligible for EDS (Elective Dividend
	 * Services) ISO20022 messaging.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EDSMsggElgbltyFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event is eligible for EDS (Elective Dividend Services) ISO20022 messaging."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmEDSMessagingEligibilityFlag
	 * CorporateActionGeneralInformationSD11.mmEDSMessagingEligibilityFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEDSMessagingEligibilityFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "EDSMsggElgbltyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityFlag";
			definition = "Indicates whether the event is eligible for EDS (Elective Dividend Services) ISO20022 messaging.";
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmEDSMessagingEligibilityFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "RedId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionIdentification";
			definition = "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}
	};
	protected YesNoIndicator dTCFCPElectionFlag;
	/**
	 * Identifies events that offer instruction processing specific to foreign
	 * currency payment (FCP) elections.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFCPElctnFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCFCPElectionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies events that offer instruction processing specific to foreign currency payment (FCP) elections."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCFCPElectionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "DTCFCPElctnFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFCPElectionFlag";
			definition = "Identifies events that offer instruction processing specific to foreign currency payment (FCP) elections.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator assetServicerProcessingFlag;
	/**
	 * Indicates whether the event is being processed by DTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
	 * CorporateActionGeneralInformationSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstSvcrPrcgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetServicerProcessingFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the event is being processed by DTC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssetServicerProcessingFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD13.mmObject();
			isDerived = false;
			xmlTag = "AsstSvcrPrcgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetServicerProcessingFlag";
			definition = "Indicates whether the event is being processed by DTC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmPlaceAndName, CorporateActionGeneralInformationSD13.mmEventGroup, CorporateActionGeneralInformationSD13.mmEventType,
						CorporateActionGeneralInformationSD13.mmSubEventType, CorporateActionGeneralInformationSD13.mmDTCMandatoryVoluntaryEventType, CorporateActionGeneralInformationSD13.mmDeclaredMandatoryVoluntaryEventType,
						CorporateActionGeneralInformationSD13.mmEDSMessagingEligibilityFlag, CorporateActionGeneralInformationSD13.mmRedemptionIdentification, CorporateActionGeneralInformationSD13.mmDTCFCPElectionFlag,
						CorporateActionGeneralInformationSD13.mmAssetServicerProcessingFlag);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionGeneralInformationSD13";
				definition = "Provides additional information regarding corporate action general information details.";
				previousVersion_lazy = () -> CorporateActionGeneralInformationSD11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public EventGroup1Code getEventGroup() {
		return eventGroup;
	}

	public void setEventGroup(EventGroup1Code eventGroup) {
		this.eventGroup = eventGroup;
	}

	public ExtendedEventType2Code getEventType() {
		return eventType;
	}

	public void setEventType(ExtendedEventType2Code eventType) {
		this.eventType = eventType;
	}

	public DTCCSubEventType3Code getSubEventType() {
		return subEventType;
	}

	public void setSubEventType(DTCCSubEventType3Code subEventType) {
		this.subEventType = subEventType;
	}

	public CorporateActionMandatoryVoluntary1Code getDTCMandatoryVoluntaryEventType() {
		return dTCMandatoryVoluntaryEventType;
	}

	public void setDTCMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntary1Code dTCMandatoryVoluntaryEventType) {
		this.dTCMandatoryVoluntaryEventType = dTCMandatoryVoluntaryEventType;
	}

	public CorporateActionMandatoryVoluntary1Code getDeclaredMandatoryVoluntaryEventType() {
		return declaredMandatoryVoluntaryEventType;
	}

	public void setDeclaredMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntary1Code declaredMandatoryVoluntaryEventType) {
		this.declaredMandatoryVoluntaryEventType = declaredMandatoryVoluntaryEventType;
	}

	public YesNoIndicator getEDSMessagingEligibilityFlag() {
		return eDSMessagingEligibilityFlag;
	}

	public void setEDSMessagingEligibilityFlag(YesNoIndicator eDSMessagingEligibilityFlag) {
		this.eDSMessagingEligibilityFlag = eDSMessagingEligibilityFlag;
	}

	public Max10NumericText getRedemptionIdentification() {
		return redemptionIdentification;
	}

	public void setRedemptionIdentification(Max10NumericText redemptionIdentification) {
		this.redemptionIdentification = redemptionIdentification;
	}

	public YesNoIndicator getDTCFCPElectionFlag() {
		return dTCFCPElectionFlag;
	}

	public void setDTCFCPElectionFlag(YesNoIndicator dTCFCPElectionFlag) {
		this.dTCFCPElectionFlag = dTCFCPElectionFlag;
	}

	public YesNoIndicator getAssetServicerProcessingFlag() {
		return assetServicerProcessingFlag;
	}

	public void setAssetServicerProcessingFlag(YesNoIndicator assetServicerProcessingFlag) {
		this.assetServicerProcessingFlag = assetServicerProcessingFlag;
	}
}