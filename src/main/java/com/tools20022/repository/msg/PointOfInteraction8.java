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
import com.tools20022.repository.msg.GenericIdentification53;
import com.tools20022.repository.msg.PointOfInteractionCapabilities6;
import com.tools20022.repository.msg.PointOfInteractionComponent8;
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
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmIdentification
 * PointOfInteraction8.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmSystemName
 * PointOfInteraction8.mmSystemName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmGroupIdentification
 * PointOfInteraction8.mmGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmCapabilities
 * PointOfInteraction8.mmCapabilities}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmTimeZone
 * PointOfInteraction8.mmTimeZone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmTerminalIntegration
 * PointOfInteraction8.mmTerminalIntegration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8#mmComponent
 * PointOfInteraction8.mmComponent}</li>
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
 * "PointOfInteraction8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Point of interaction (POI) performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7
 * PointOfInteraction7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteraction8", propOrder = {"identification", "systemName", "groupIdentification", "capabilities", "timeZone", "terminalIntegration", "component"})
public class PointOfInteraction8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification53 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8
	 * PointOfInteraction8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmIdentification
	 * PointOfInteraction7.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction8, GenericIdentification53> mmIdentification = new MMMessageAssociationEnd<PointOfInteraction8, GenericIdentification53>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction8.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the POI (Point Of Interaction) for the acquirer or its agent.";
			previousVersion_lazy = () -> PointOfInteraction7.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public GenericIdentification53 getValue(PointOfInteraction8 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PointOfInteraction8 obj, GenericIdentification53 value) {
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8
	 * PointOfInteraction8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmSystemName
	 * PointOfInteraction7.mmSystemName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction8, Optional<Max70Text>> mmSystemName = new MMMessageAttribute<PointOfInteraction8, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> SystemName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction8.mmObject();
			isDerived = false;
			xmlTag = "SysNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemName";
			definition = "Common name assigned by the acquirer to the POI (Point Of Interaction) system.";
			previousVersion_lazy = () -> PointOfInteraction7.mmSystemName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PointOfInteraction8 obj) {
			return obj.getSystemName();
		}

		@Override
		public void setValue(PointOfInteraction8 obj, Optional<Max70Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8
	 * PointOfInteraction8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmGroupIdentification
	 * PointOfInteraction7.mmGroupIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction8, Optional<Max35Text>> mmGroupIdentification = new MMMessageAttribute<PointOfInteraction8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction8.mmObject();
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI (Point Of Interaction) terminals performing some categories of transactions.";
			previousVersion_lazy = () -> PointOfInteraction7.mmGroupIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PointOfInteraction8 obj) {
			return obj.getGroupIdentification();
		}

		@Override
		public void setValue(PointOfInteraction8 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8
	 * PointOfInteraction8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmCapabilities
	 * PointOfInteraction7.mmCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction8, Optional<PointOfInteractionCapabilities6>> mmCapabilities = new MMMessageAssociationEnd<PointOfInteraction8, Optional<PointOfInteractionCapabilities6>>() {
		{
			businessComponentTrace_lazy = () -> PointOfInteraction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction8.mmObject();
			isDerived = false;
			xmlTag = "Cpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capabilities";
			definition = "Capabilities of the POI (Point Of Interaction) performing the transaction.";
			previousVersion_lazy = () -> PointOfInteraction7.mmCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionCapabilities6.mmObject();
		}

		@Override
		public Optional<PointOfInteractionCapabilities6> getValue(PointOfInteraction8 obj) {
			return obj.getCapabilities();
		}

		@Override
		public void setValue(PointOfInteraction8 obj, Optional<PointOfInteractionCapabilities6> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8
	 * PointOfInteraction8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmTimeZone
	 * PointOfInteraction7.mmTimeZone}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction8, Optional<Max70Text>> mmTimeZone = new MMMessageAttribute<PointOfInteraction8, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction8.mmObject();
			isDerived = false;
			xmlTag = "TmZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZone";
			definition = "Time zone name as defined by IANA (Internet Assigned Numbers Authority) in the time zone data base. America/Chicago or Europe/Paris are examples of time zone names.";
			previousVersion_lazy = () -> PointOfInteraction7.mmTimeZone;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PointOfInteraction8 obj) {
			return obj.getTimeZone();
		}

		@Override
		public void setValue(PointOfInteraction8 obj, Optional<Max70Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8
	 * PointOfInteraction8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmTerminalIntegration
	 * PointOfInteraction7.mmTerminalIntegration}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteraction8, Optional<LocationCategory3Code>> mmTerminalIntegration = new MMMessageAttribute<PointOfInteraction8, Optional<LocationCategory3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction8.mmObject();
			isDerived = false;
			xmlTag = "TermnlIntgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalIntegration";
			definition = "Indicates the type of integration of the POI terminal in the sale environment.";
			previousVersion_lazy = () -> PointOfInteraction7.mmTerminalIntegration;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LocationCategory3Code.mmObject();
		}

		@Override
		public Optional<LocationCategory3Code> getValue(PointOfInteraction8 obj) {
			return obj.getTerminalIntegration();
		}

		@Override
		public void setValue(PointOfInteraction8 obj, Optional<LocationCategory3Code> value) {
			obj.setTerminalIntegration(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmpnt")
	protected List<PointOfInteractionComponent8> component;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8
	 * PointOfInteractionComponent8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
	 * PointOfInteraction.mmComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction8
	 * PointOfInteraction8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmComponent
	 * PointOfInteraction7.mmComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteraction8, List<PointOfInteractionComponent8>> mmComponent = new MMMessageAssociationEnd<PointOfInteraction8, List<PointOfInteractionComponent8>>() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteraction8.mmObject();
			isDerived = false;
			xmlTag = "Cmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Component";
			definition = "Data related to a component of the POI (Point Of Interaction) performing the transaction.";
			previousVersion_lazy = () -> PointOfInteraction7.mmComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionComponent8.mmObject();
		}

		@Override
		public List<PointOfInteractionComponent8> getValue(PointOfInteraction8 obj) {
			return obj.getComponent();
		}

		@Override
		public void setValue(PointOfInteraction8 obj, List<PointOfInteractionComponent8> value) {
			obj.setComponent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction8.mmIdentification, com.tools20022.repository.msg.PointOfInteraction8.mmSystemName,
						com.tools20022.repository.msg.PointOfInteraction8.mmGroupIdentification, com.tools20022.repository.msg.PointOfInteraction8.mmCapabilities, com.tools20022.repository.msg.PointOfInteraction8.mmTimeZone,
						com.tools20022.repository.msg.PointOfInteraction8.mmTerminalIntegration, com.tools20022.repository.msg.PointOfInteraction8.mmComponent);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction8";
				definition = "Point of interaction (POI) performing the transaction.";
				previousVersion_lazy = () -> PointOfInteraction7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification53 getIdentification() {
		return identification;
	}

	public PointOfInteraction8 setIdentification(GenericIdentification53 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max70Text> getSystemName() {
		return systemName == null ? Optional.empty() : Optional.of(systemName);
	}

	public PointOfInteraction8 setSystemName(Max70Text systemName) {
		this.systemName = systemName;
		return this;
	}

	public Optional<Max35Text> getGroupIdentification() {
		return groupIdentification == null ? Optional.empty() : Optional.of(groupIdentification);
	}

	public PointOfInteraction8 setGroupIdentification(Max35Text groupIdentification) {
		this.groupIdentification = groupIdentification;
		return this;
	}

	public Optional<PointOfInteractionCapabilities6> getCapabilities() {
		return capabilities == null ? Optional.empty() : Optional.of(capabilities);
	}

	public PointOfInteraction8 setCapabilities(PointOfInteractionCapabilities6 capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	public Optional<Max70Text> getTimeZone() {
		return timeZone == null ? Optional.empty() : Optional.of(timeZone);
	}

	public PointOfInteraction8 setTimeZone(Max70Text timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public Optional<LocationCategory3Code> getTerminalIntegration() {
		return terminalIntegration == null ? Optional.empty() : Optional.of(terminalIntegration);
	}

	public PointOfInteraction8 setTerminalIntegration(LocationCategory3Code terminalIntegration) {
		this.terminalIntegration = terminalIntegration;
		return this;
	}

	public List<PointOfInteractionComponent8> getComponent() {
		return component == null ? component = new ArrayList<>() : component;
	}

	public PointOfInteraction8 setComponent(List<PointOfInteractionComponent8> component) {
		this.component = Objects.requireNonNull(component);
		return this;
	}
}