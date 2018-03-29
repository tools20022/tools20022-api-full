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
import com.tools20022.repository.codeset.LocationCategory3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.entity.SystemName;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification32;
import com.tools20022.repository.msg.PointOfInteractionCapabilities6;
import com.tools20022.repository.msg.PointOfInteractionComponent7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Point of interaction (POI) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmIdentification
 * PointOfInteraction7.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmSystemName
 * PointOfInteraction7.mmSystemName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmGroupIdentification
 * PointOfInteraction7.mmGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmCapabilities
 * PointOfInteraction7.mmCapabilities}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmTimeZone
 * PointOfInteraction7.mmTimeZone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmTerminalIntegration
 * PointOfInteraction7.mmTerminalIntegration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmComponent
 * PointOfInteraction7.mmComponent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PointOfInteraction7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Point of interaction (POI) performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction8
 * PointOfInteraction8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
 * PointOfInteraction5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteraction7", propOrder = {"identification", "systemName", "groupIdentification", "capabilities", "timeZone", "terminalIntegration", "component"})
public class PointOfInteraction7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification32 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) for the acquirer or its agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmIdentification
	 * PointOfInteraction8.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmIdentification
	 * PointOfInteraction5.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction7, GenericIdentification32> mmIdentification = new MMMessageAssociationEnd<PointOfInteraction7, GenericIdentification32>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the POI (Point Of Interaction) for the acquirer or its agent.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmIdentification);
			previousVersion_lazy = () -> PointOfInteraction5.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public GenericIdentification32 getValue(PointOfInteraction7 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PointOfInteraction7 obj, GenericIdentification32 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "SysNm")
	protected Max70Text systemName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemName#mmName
	 * SystemName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common name assigned by the acquirer to the POI (Point Of Interaction) system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmSystemName
	 * PointOfInteraction8.mmSystemName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmSystemName
	 * PointOfInteraction5.mmSystemName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction7, Optional<Max70Text>> mmSystemName = new MMMessageAttribute<PointOfInteraction7, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> SystemName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
			isDerived = false;
			xmlTag = "SysNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemName";
			definition = "Common name assigned by the acquirer to the POI (Point Of Interaction) system.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmSystemName);
			previousVersion_lazy = () -> PointOfInteraction5.mmSystemName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PointOfInteraction7 obj) {
			return obj.getSystemName();
		}

		@Override
		public void setValue(PointOfInteraction7 obj, Optional<Max70Text> value) {
			obj.setSystemName(value.orElse(null));
		}
	};
	@XmlElement(name = "GrpId")
	protected Max35Text groupIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI (Point Of Interaction) terminals performing some categories of transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmGroupIdentification
	 * PointOfInteraction8.mmGroupIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmGroupIdentification
	 * PointOfInteraction5.mmGroupIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction7, Optional<Max35Text>> mmGroupIdentification = new MMMessageAttribute<PointOfInteraction7, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI (Point Of Interaction) terminals performing some categories of transactions.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmGroupIdentification);
			previousVersion_lazy = () -> PointOfInteraction5.mmGroupIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PointOfInteraction7 obj) {
			return obj.getGroupIdentification();
		}

		@Override
		public void setValue(PointOfInteraction7 obj, Optional<Max35Text> value) {
			obj.setGroupIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Cpblties")
	protected PointOfInteractionCapabilities6 capabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the POI (Point Of Interaction) performing the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmCapabilities
	 * PointOfInteraction8.mmCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmCapabilities
	 * PointOfInteraction5.mmCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction7, Optional<PointOfInteractionCapabilities6>> mmCapabilities = new MMMessageAssociationEnd<PointOfInteraction7, Optional<PointOfInteractionCapabilities6>>() {
		{
			businessComponentTrace_lazy = () -> PointOfInteraction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
			isDerived = false;
			xmlTag = "Cpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capabilities";
			definition = "Capabilities of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmCapabilities);
			previousVersion_lazy = () -> PointOfInteraction5.mmCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionCapabilities6.mmObject();
		}

		@Override
		public Optional<PointOfInteractionCapabilities6> getValue(PointOfInteraction7 obj) {
			return obj.getCapabilities();
		}

		@Override
		public void setValue(PointOfInteraction7 obj, Optional<PointOfInteractionCapabilities6> value) {
			obj.setCapabilities(value.orElse(null));
		}
	};
	@XmlElement(name = "TmZone")
	protected Max70Text timeZone;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time zone name as defined by IANA (Internet Assigned Numbers Authority) in the time zone data base. America/Chicago or Europe/Paris are examples of time zone names."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmTimeZone
	 * PointOfInteraction8.mmTimeZone}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmTimeZone
	 * PointOfInteraction5.mmTimeZone}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction7, Optional<Max70Text>> mmTimeZone = new MMMessageAttribute<PointOfInteraction7, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
			isDerived = false;
			xmlTag = "TmZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZone";
			definition = "Time zone name as defined by IANA (Internet Assigned Numbers Authority) in the time zone data base. America/Chicago or Europe/Paris are examples of time zone names.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmTimeZone);
			previousVersion_lazy = () -> PointOfInteraction5.mmTimeZone;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PointOfInteraction7 obj) {
			return obj.getTimeZone();
		}

		@Override
		public void setValue(PointOfInteraction7 obj, Optional<Max70Text> value) {
			obj.setTimeZone(value.orElse(null));
		}
	};
	@XmlElement(name = "TermnlIntgtn")
	protected LocationCategory3Code terminalIntegration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlIntgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalIntegration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of integration of the POI terminal in the sale environment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmTerminalIntegration
	 * PointOfInteraction8.mmTerminalIntegration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmTerminalIntegration
	 * PointOfInteraction5.mmTerminalIntegration}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction7, Optional<LocationCategory3Code>> mmTerminalIntegration = new MMMessageAttribute<PointOfInteraction7, Optional<LocationCategory3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
			isDerived = false;
			xmlTag = "TermnlIntgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalIntegration";
			definition = "Indicates the type of integration of the POI terminal in the sale environment.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmTerminalIntegration);
			previousVersion_lazy = () -> PointOfInteraction5.mmTerminalIntegration;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LocationCategory3Code.mmObject();
		}

		@Override
		public Optional<LocationCategory3Code> getValue(PointOfInteraction7 obj) {
			return obj.getTerminalIntegration();
		}

		@Override
		public void setValue(PointOfInteraction7 obj, Optional<LocationCategory3Code> value) {
			obj.setTerminalIntegration(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmpnt")
	protected List<PointOfInteractionComponent7> component;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
	 * PointOfInteraction.mmComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
	 * PointOfInteraction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Component"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a component of the POI (Point Of Interaction) performing the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmComponent
	 * PointOfInteraction8.mmComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmComponent
	 * PointOfInteraction5.mmComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction7, List<PointOfInteractionComponent7>> mmComponent = new MMMessageAssociationEnd<PointOfInteraction7, List<PointOfInteractionComponent7>>() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction7.mmObject();
			isDerived = false;
			xmlTag = "Cmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Component";
			definition = "Data related to a component of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmComponent);
			previousVersion_lazy = () -> PointOfInteraction5.mmComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionComponent7.mmObject();
		}

		@Override
		public List<PointOfInteractionComponent7> getValue(PointOfInteraction7 obj) {
			return obj.getComponent();
		}

		@Override
		public void setValue(PointOfInteraction7 obj, List<PointOfInteractionComponent7> value) {
			obj.setComponent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmIdentification, com.tools20022.repository.msg.PointOfInteraction7.mmSystemName,
						com.tools20022.repository.msg.PointOfInteraction7.mmGroupIdentification, com.tools20022.repository.msg.PointOfInteraction7.mmCapabilities, com.tools20022.repository.msg.PointOfInteraction7.mmTimeZone,
						com.tools20022.repository.msg.PointOfInteraction7.mmTerminalIntegration, com.tools20022.repository.msg.PointOfInteraction7.mmComponent);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction7";
				definition = "Point of interaction (POI) performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteraction8.mmObject());
				previousVersion_lazy = () -> PointOfInteraction5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification32 getIdentification() {
		return identification;
	}

	public PointOfInteraction7 setIdentification(GenericIdentification32 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max70Text> getSystemName() {
		return systemName == null ? Optional.empty() : Optional.of(systemName);
	}

	public PointOfInteraction7 setSystemName(Max70Text systemName) {
		this.systemName = systemName;
		return this;
	}

	public Optional<Max35Text> getGroupIdentification() {
		return groupIdentification == null ? Optional.empty() : Optional.of(groupIdentification);
	}

	public PointOfInteraction7 setGroupIdentification(Max35Text groupIdentification) {
		this.groupIdentification = groupIdentification;
		return this;
	}

	public Optional<PointOfInteractionCapabilities6> getCapabilities() {
		return capabilities == null ? Optional.empty() : Optional.of(capabilities);
	}

	public PointOfInteraction7 setCapabilities(PointOfInteractionCapabilities6 capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	public Optional<Max70Text> getTimeZone() {
		return timeZone == null ? Optional.empty() : Optional.of(timeZone);
	}

	public PointOfInteraction7 setTimeZone(Max70Text timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public Optional<LocationCategory3Code> getTerminalIntegration() {
		return terminalIntegration == null ? Optional.empty() : Optional.of(terminalIntegration);
	}

	public PointOfInteraction7 setTerminalIntegration(LocationCategory3Code terminalIntegration) {
		this.terminalIntegration = terminalIntegration;
		return this;
	}

	public List<PointOfInteractionComponent7> getComponent() {
		return component == null ? component = new ArrayList<>() : component;
	}

	public PointOfInteraction7 setComponent(List<PointOfInteractionComponent7> component) {
		this.component = Objects.requireNonNull(component);
		return this;
	}
}