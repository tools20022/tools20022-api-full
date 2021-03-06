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
import com.tools20022.repository.codeset.DTCCSubEventType3Code;
import com.tools20022.repository.codeset.EventGroup1Code;
import com.tools20022.repository.codeset.ExtendedEventType2Code;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformationSD12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD12
 * ConstraintEDSMessagingEligibilityRule.
 * forCorporateActionGeneralInformationSD12}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionGeneralInformationSD12", propOrder = {"placeAndName", "eventGroup", "eventType", "subEventType", "eDSMessagingEligibilityFlag", "redemptionIdentification", "dTCFCPElectionFlag", "assetServicerProcessingFlag"})
public class CorporateActionGeneralInformationSD12 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
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

		@Override
		public Max350Text getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Max350Text value) {
			obj.setPlaceAndName(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtGrp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTC processing domain/ category for event types."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Group</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<EventGroup1Code>> mmEventGroup = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<EventGroup1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "EvtGrp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Group"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventGroup";
			definition = "DTC processing domain/ category for event types.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmEventGroup);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmEventGroup;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventGroup1Code.mmObject();
		}

		@Override
		public Optional<EventGroup1Code> getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getEventGroup();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Optional<EventGroup1Code> value) {
			obj.setEventGroup(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtTp")
	protected ExtendedEventType2Code eventType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two or more distinct events (in DTCC model) use same ISO code and there are no additional data elements that distinguish those two or more events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<ExtendedEventType2Code>> mmEventType = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<ExtendedEventType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two or more distinct events (in DTCC model) use same ISO code and there are no additional data elements that distinguish those two or more events.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmEventType);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType2Code.mmObject();
		}

		@Override
		public Optional<ExtendedEventType2Code> getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Optional<ExtendedEventType2Code> value) {
			obj.setEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "SubEvtTp")
	protected DTCCSubEventType3Code subEventType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Sub Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<DTCCSubEventType3Code>> mmSubEventType = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<DTCCSubEventType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Sub Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmSubEventType);
			previousVersion_lazy = () -> CorporateActionGeneralInformationSD10.mmSubEventType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType3Code.mmObject();
		}

		@Override
		public Optional<DTCCSubEventType3Code> getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getSubEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Optional<DTCCSubEventType3Code> value) {
			obj.setSubEventType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EDSMsggElgbltyFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event is eligible for EDS (Elective Dividend Services) ISO20022 messaging."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<YesNoIndicator>> mmEDSMessagingEligibilityFlag = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getEDSMessagingEligibilityFlag();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Optional<YesNoIndicator> value) {
			obj.setEDSMessagingEligibilityFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<Max10NumericText>> mmRedemptionIdentification = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<Max10NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
			isDerived = false;
			xmlTag = "RedId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionIdentification";
			definition = "Unique number systemically assigned to all Lottery and Non-Lottery events announced in DTC Redemptions (REDS) Participant Terminal System (PTS)/ Particinant Browser System(PBS) function.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD18.mmRedemptionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}

		@Override
		public Optional<Max10NumericText> getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getRedemptionIdentification();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Optional<Max10NumericText> value) {
			obj.setRedemptionIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFCPElctnFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCFCPElectionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies events that offer instruction processing specific to foreign currency payment (FCP) elections."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<YesNoIndicator>> mmDTCFCPElectionFlag = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getDTCFCPElectionFlag();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Optional<YesNoIndicator> value) {
			obj.setDTCFCPElectionFlag(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD12
	 * CorporateActionGeneralInformationSD12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstSvcrPrcgFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetServicerProcessingFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the event is being processed by DTC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<YesNoIndicator>> mmAssetServicerProcessingFlag = new MMMessageAttribute<CorporateActionGeneralInformationSD12, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionGeneralInformationSD12 obj) {
			return obj.getAssetServicerProcessingFlag();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD12 obj, Optional<YesNoIndicator> value) {
			obj.setAssetServicerProcessingFlag(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmEventGroup,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmSubEventType,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmEDSMessagingEligibilityFlag, com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmRedemptionIdentification,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmDTCFCPElectionFlag, com.tools20022.repository.msg.CorporateActionGeneralInformationSD12.mmAssetServicerProcessingFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD12);
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

	public CorporateActionGeneralInformationSD12 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<EventGroup1Code> getEventGroup() {
		return eventGroup == null ? Optional.empty() : Optional.of(eventGroup);
	}

	public CorporateActionGeneralInformationSD12 setEventGroup(EventGroup1Code eventGroup) {
		this.eventGroup = eventGroup;
		return this;
	}

	public Optional<ExtendedEventType2Code> getEventType() {
		return eventType == null ? Optional.empty() : Optional.of(eventType);
	}

	public CorporateActionGeneralInformationSD12 setEventType(ExtendedEventType2Code eventType) {
		this.eventType = eventType;
		return this;
	}

	public Optional<DTCCSubEventType3Code> getSubEventType() {
		return subEventType == null ? Optional.empty() : Optional.of(subEventType);
	}

	public CorporateActionGeneralInformationSD12 setSubEventType(DTCCSubEventType3Code subEventType) {
		this.subEventType = subEventType;
		return this;
	}

	public Optional<YesNoIndicator> getEDSMessagingEligibilityFlag() {
		return eDSMessagingEligibilityFlag == null ? Optional.empty() : Optional.of(eDSMessagingEligibilityFlag);
	}

	public CorporateActionGeneralInformationSD12 setEDSMessagingEligibilityFlag(YesNoIndicator eDSMessagingEligibilityFlag) {
		this.eDSMessagingEligibilityFlag = eDSMessagingEligibilityFlag;
		return this;
	}

	public Optional<Max10NumericText> getRedemptionIdentification() {
		return redemptionIdentification == null ? Optional.empty() : Optional.of(redemptionIdentification);
	}

	public CorporateActionGeneralInformationSD12 setRedemptionIdentification(Max10NumericText redemptionIdentification) {
		this.redemptionIdentification = redemptionIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getDTCFCPElectionFlag() {
		return dTCFCPElectionFlag == null ? Optional.empty() : Optional.of(dTCFCPElectionFlag);
	}

	public CorporateActionGeneralInformationSD12 setDTCFCPElectionFlag(YesNoIndicator dTCFCPElectionFlag) {
		this.dTCFCPElectionFlag = dTCFCPElectionFlag;
		return this;
	}

	public Optional<YesNoIndicator> getAssetServicerProcessingFlag() {
		return assetServicerProcessingFlag == null ? Optional.empty() : Optional.of(assetServicerProcessingFlag);
	}

	public CorporateActionGeneralInformationSD12 setAssetServicerProcessingFlag(YesNoIndicator assetServicerProcessingFlag) {
		this.assetServicerProcessingFlag = assetServicerProcessingFlag;
		return this;
	}
}