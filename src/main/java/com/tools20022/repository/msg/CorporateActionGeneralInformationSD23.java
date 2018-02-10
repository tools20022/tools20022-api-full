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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCCSubEventType5Code;
import com.tools20022.repository.codeset.EventGroup1Code;
import com.tools20022.repository.codeset.ExtendedEventType4Code;
import com.tools20022.repository.datatype.Max10NumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmPlaceAndName
 * CorporateActionGeneralInformationSD23.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmEventGroup
 * CorporateActionGeneralInformationSD23.mmEventGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmEventType
 * CorporateActionGeneralInformationSD23.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmSubEventType
 * CorporateActionGeneralInformationSD23.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmEDSMessagingEligibilityFlag
 * CorporateActionGeneralInformationSD23.mmEDSMessagingEligibilityFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmRedemptionIdentification
 * CorporateActionGeneralInformationSD23.mmRedemptionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmDTCFCPElectionFlag
 * CorporateActionGeneralInformationSD23.mmDTCFCPElectionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23#mmAssetServicerProcessingFlag
 * CorporateActionGeneralInformationSD23.mmAssetServicerProcessingFlag}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD23
 * ConstraintEDSMessagingEligibilityRule.
 * forCorporateActionGeneralInformationSD23}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformationSD23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28
 * CorporateActionGeneralInformationSD28}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22
 * CorporateActionGeneralInformationSD22}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionGeneralInformationSD23", propOrder = {"placeAndName", "eventGroup", "eventType", "subEventType", "eDSMessagingEligibilityFlag", "redemptionIdentification", "dTCFCPElectionFlag", "assetServicerProcessingFlag"})
public class CorporateActionGeneralInformationSD23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmPlaceAndName
	 * CorporateActionGeneralInformationSD28.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmPlaceAndName
	 * CorporateActionGeneralInformationSD22.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmPlaceAndName);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "EvtGrp")
	protected EventGroup1Code eventGroup;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Group</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmEventGroup
	 * CorporateActionGeneralInformationSD28.mmEventGroup}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmEventGroup
	 * CorporateActionGeneralInformationSD22.mmEventGroup}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventGroup = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "EvtGrp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Group"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventGroup";
			definition = "DTC processing domain/ category for event types.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmEventGroup);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmEventGroup;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventGroup1Code.mmObject();
		}
	};
	@XmlElement(name = "EvtTp")
	protected ExtendedEventType4Code eventType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two or more distinct events (in DTCC model) use same ISO code and there are no additional data elements that distinguish those two or more events."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmEventType
	 * CorporateActionGeneralInformationSD28.mmEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmEventType
	 * CorporateActionGeneralInformationSD22.mmEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two or more distinct events (in DTCC model) use same ISO code and there are no additional data elements that distinguish those two or more events.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmEventType);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType4Code.mmObject();
		}
	};
	@XmlElement(name = "SubEvtTp")
	protected DTCCSubEventType5Code subEventType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Sub Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmSubEventType
	 * CorporateActionGeneralInformationSD28.mmSubEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmSubEventType
	 * CorporateActionGeneralInformationSD22.mmSubEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Sub Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmSubEventType);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmSubEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType5Code.mmObject();
		}
	};
	@XmlElement(name = "EDSMsggElgbltyFlg")
	protected YesNoIndicator eDSMessagingEligibilityFlag;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmEDSMessagingEligibilityFlag
	 * CorporateActionGeneralInformationSD28.mmEDSMessagingEligibilityFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmEDSMessagingEligibilityFlag
	 * CorporateActionGeneralInformationSD22.mmEDSMessagingEligibilityFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEDSMessagingEligibilityFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "EDSMsggElgbltyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityFlag";
			definition = "Indicates whether the event is eligible for EDS (Elective Dividend Services) ISO20022 messaging.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmEDSMessagingEligibilityFlag);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmEDSMessagingEligibilityFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RedId")
	protected Max10NumericText redemptionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
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
	 * "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmRedemptionIdentification
	 * CorporateActionGeneralInformationSD28.mmRedemptionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmRedemptionIdentification
	 * CorporateActionGeneralInformationSD22.mmRedemptionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "RedId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionIdentification";
			definition = "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmRedemptionIdentification);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmRedemptionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}
	};
	@XmlElement(name = "DTCFCPElctnFlg")
	protected YesNoIndicator dTCFCPElectionFlag;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmDTCFCPElectionFlag
	 * CorporateActionGeneralInformationSD28.mmDTCFCPElectionFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmDTCFCPElectionFlag
	 * CorporateActionGeneralInformationSD22.mmDTCFCPElectionFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCFCPElectionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "DTCFCPElctnFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFCPElectionFlag";
			definition = "Identifies events that offer instruction processing specific to foreign currency payment (FCP) elections.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmDTCFCPElectionFlag);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmDTCFCPElectionFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "AsstSvcrPrcgFlg")
	protected YesNoIndicator assetServicerProcessingFlag;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD23
	 * CorporateActionGeneralInformationSD23}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD28#mmAssetServicerProcessingFlag
	 * CorporateActionGeneralInformationSD28.mmAssetServicerProcessingFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD22#mmAssetServicerProcessingFlag
	 * CorporateActionGeneralInformationSD22.mmAssetServicerProcessingFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssetServicerProcessingFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmObject();
			isDerived = false;
			xmlTag = "AsstSvcrPrcgFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetServicerProcessingFlag";
			definition = "Indicates whether the event is being processed by DTC.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmAssetServicerProcessingFlag);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmAssetServicerProcessingFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmEventGroup,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmSubEventType,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmEDSMessagingEligibilityFlag, com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmRedemptionIdentification,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmDTCFCPElectionFlag, com.tools20022.repository.msg.CorporateActionGeneralInformationSD23.mmAssetServicerProcessingFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD23);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionGeneralInformationSD23";
				definition = "Provides additional information regarding corporate action general information details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD28.mmObject());
				previousVersion_lazy = () -> CorporateActionGeneralInformationSD22.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionGeneralInformationSD23 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<EventGroup1Code> getEventGroup() {
		return eventGroup == null ? Optional.empty() : Optional.of(eventGroup);
	}

	public CorporateActionGeneralInformationSD23 setEventGroup(EventGroup1Code eventGroup) {
		this.eventGroup = eventGroup;
		return this;
	}

	public Optional<ExtendedEventType4Code> getEventType() {
		return eventType == null ? Optional.empty() : Optional.of(eventType);
	}

	public CorporateActionGeneralInformationSD23 setEventType(ExtendedEventType4Code eventType) {
		this.eventType = eventType;
		return this;
	}

	public Optional<DTCCSubEventType5Code> getSubEventType() {
		return subEventType == null ? Optional.empty() : Optional.of(subEventType);
	}

	public CorporateActionGeneralInformationSD23 setSubEventType(DTCCSubEventType5Code subEventType) {
		this.subEventType = subEventType;
		return this;
	}

	public Optional<YesNoIndicator> getEDSMessagingEligibilityFlag() {
		return eDSMessagingEligibilityFlag == null ? Optional.empty() : Optional.of(eDSMessagingEligibilityFlag);
	}

	public CorporateActionGeneralInformationSD23 setEDSMessagingEligibilityFlag(YesNoIndicator eDSMessagingEligibilityFlag) {
		this.eDSMessagingEligibilityFlag = eDSMessagingEligibilityFlag;
		return this;
	}

	public Optional<Max10NumericText> getRedemptionIdentification() {
		return redemptionIdentification == null ? Optional.empty() : Optional.of(redemptionIdentification);
	}

	public CorporateActionGeneralInformationSD23 setRedemptionIdentification(Max10NumericText redemptionIdentification) {
		this.redemptionIdentification = redemptionIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getDTCFCPElectionFlag() {
		return dTCFCPElectionFlag == null ? Optional.empty() : Optional.of(dTCFCPElectionFlag);
	}

	public CorporateActionGeneralInformationSD23 setDTCFCPElectionFlag(YesNoIndicator dTCFCPElectionFlag) {
		this.dTCFCPElectionFlag = dTCFCPElectionFlag;
		return this;
	}

	public Optional<YesNoIndicator> getAssetServicerProcessingFlag() {
		return assetServicerProcessingFlag == null ? Optional.empty() : Optional.of(assetServicerProcessingFlag);
	}

	public CorporateActionGeneralInformationSD23 setAssetServicerProcessingFlag(YesNoIndicator assetServicerProcessingFlag) {
		this.assetServicerProcessingFlag = assetServicerProcessingFlag;
		return this;
	}
}