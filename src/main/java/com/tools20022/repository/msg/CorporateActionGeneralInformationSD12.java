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
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmPlaceAndName
 * CorporateActionGeneralInformationSD12.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmEventGroup
 * CorporateActionGeneralInformationSD12.mmEventGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmEventType
 * CorporateActionGeneralInformationSD12.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmSubEventType
 * CorporateActionGeneralInformationSD12.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmEDSMessagingEligibilityFlag
 * CorporateActionGeneralInformationSD12.mmEDSMessagingEligibilityFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmRedemptionIdentification
 * CorporateActionGeneralInformationSD12.mmRedemptionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmDTCFCPElectionFlag
 * CorporateActionGeneralInformationSD12.mmDTCFCPElectionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12#mmAssetServicerProcessingFlag
 * CorporateActionGeneralInformationSD12.mmAssetServicerProcessingFlag}</li>
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
 * "CorporateActionGeneralInformationSD12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18
 * CorporateActionGeneralInformationSD18}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD10
 * CorporateActionGeneralInformationSD10}</li>
 * </ul>
 */
public class CorporateActionGeneralInformationSD12 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmPlaceAndName
	 * CorporateActionGeneralInformationSD18.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD10#mmPlaceAndName
	 * CorporateActionGeneralInformationSD10.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmPlaceAndName);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmPlaceAndName;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmEventGroup
	 * CorporateActionGeneralInformationSD18.mmEventGroup}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD10#mmEventGroup
	 * CorporateActionGeneralInformationSD10.mmEventGroup}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventGroup = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "EvtGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventGroup";
			definition = "DTC processing domain/ category for event types.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmEventGroup);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmEventGroup;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmEventType
	 * CorporateActionGeneralInformationSD18.mmEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD10#mmEventType
	 * CorporateActionGeneralInformationSD10.mmEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two  or more distinct events (in DTCC model)  use same ISO code and there are no additional data elements that distinguish those two or more events.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmEventType);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmEventType;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmSubEventType
	 * CorporateActionGeneralInformationSD18.mmSubEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD10#mmSubEventType
	 * CorporateActionGeneralInformationSD10.mmSubEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. ";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmSubEventType);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmSubEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType3Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmEDSMessagingEligibilityFlag
	 * CorporateActionGeneralInformationSD18.mmEDSMessagingEligibilityFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD10#mmEDSMessagingEligibilityFlag
	 * CorporateActionGeneralInformationSD10.mmEDSMessagingEligibilityFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEDSMessagingEligibilityFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "EDSMsggElgbltyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityFlag";
			definition = "Indicates whether the event is eligible for EDS (Elective Dividend Services) ISO20022 messaging.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmEDSMessagingEligibilityFlag);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmEDSMessagingEligibilityFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmRedemptionIdentification
	 * CorporateActionGeneralInformationSD18.mmRedemptionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "RedId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionIdentification";
			definition = "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function. ";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmRedemptionIdentification);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmDTCFCPElectionFlag
	 * CorporateActionGeneralInformationSD18.mmDTCFCPElectionFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCFCPElectionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "DTCFCPElctnFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFCPElectionFlag";
			definition = "Identifies events that offer instruction processing specific to foreign currency payment (FCP) elections.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmDTCFCPElectionFlag);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD18#mmAssetServicerProcessingFlag
	 * CorporateActionGeneralInformationSD18.mmAssetServicerProcessingFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssetServicerProcessingFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "AsstSvcrPrcgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetServicerProcessingFlag";
			definition = "Indicates whether the event is being processed by DTC.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmAssetServicerProcessingFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD12.mmPlaceAndName, CorporateActionGeneralInformationSD12.mmEventGroup, CorporateActionGeneralInformationSD12.mmEventType,
						CorporateActionGeneralInformationSD12.mmSubEventType, CorporateActionGeneralInformationSD12.mmEDSMessagingEligibilityFlag, CorporateActionGeneralInformationSD12.mmRedemptionIdentification,
						CorporateActionGeneralInformationSD12.mmDTCFCPElectionFlag, CorporateActionGeneralInformationSD12.mmAssetServicerProcessingFlag);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionGeneralInformationSD12";
				definition = "Provides additional information regarding corporate action general information details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmObject());
				previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmObject();
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