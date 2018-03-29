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
import com.tools20022.repository.codeset.DataSetCategory10Code;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification71;
import com.tools20022.repository.msg.MessageItemCondition1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration parameters of the TMS protocol between a POI and a terminal
 * manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmActionType
 * TMSProtocolParameters3.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmTerminalManagerIdentification
 * TMSProtocolParameters3.mmTerminalManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmMaintenanceService
 * TMSProtocolParameters3.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmVersion
 * TMSProtocolParameters3.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmApplicationIdentification
 * TMSProtocolParameters3.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmHostIdentification
 * TMSProtocolParameters3.mmHostIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmPOIIdentification
 * TMSProtocolParameters3.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmInitiatingPartyIdentification
 * TMSProtocolParameters3.mmInitiatingPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmRecipientPartyIdentification
 * TMSProtocolParameters3.mmRecipientPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmFileTransfer
 * TMSProtocolParameters3.mmFileTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3#mmMessageItem
 * TMSProtocolParameters3.mmMessageItem}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TMSProtocolParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration parameters of the TMS protocol between a POI and a terminal manager."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
 * TMSProtocolParameters2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TMSProtocolParameters3", propOrder = {"actionType", "terminalManagerIdentification", "maintenanceService", "version", "applicationIdentification", "hostIdentification", "pOIIdentification", "initiatingPartyIdentification",
		"recipientPartyIdentification", "fileTransfer", "messageItem"})
public class TMSProtocolParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction3Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmActionType
	 * TMSProtocolParameters2.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, TerminalManagementAction3Code> mmActionType = new MMMessageAttribute<TMSProtocolParameters3, TerminalManagementAction3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}

		@Override
		public TerminalManagementAction3Code getValue(TMSProtocolParameters3 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, TerminalManagementAction3Code value) {
			obj.setActionType(value);
		}
	};
	@XmlElement(name = "TermnlMgrId", required = true)
	protected GenericIdentification71 terminalManagerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71
	 * GenericIdentification71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlMgrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the master terminal manager or the terminal manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmTerminalManagerIdentification
	 * TMSProtocolParameters2.mmTerminalManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSProtocolParameters3, GenericIdentification71> mmTerminalManagerIdentification = new MMMessageAssociationEnd<TMSProtocolParameters3, GenericIdentification71>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the master terminal manager or the terminal manager.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmTerminalManagerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification71.mmObject();
		}

		@Override
		public GenericIdentification71 getValue(TMSProtocolParameters3 obj) {
			return obj.getTerminalManagerIdentification();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, GenericIdentification71 value) {
			obj.setTerminalManagerIdentification(value);
		}
	};
	@XmlElement(name = "MntncSvc", required = true)
	protected List<DataSetCategory10Code> maintenanceService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance services provided by the terminal manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmMaintenanceService
	 * TMSProtocolParameters2.mmMaintenanceService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, List<DataSetCategory10Code>> mmMaintenanceService = new MMMessageAttribute<TMSProtocolParameters3, List<DataSetCategory10Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance services provided by the terminal manager.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmMaintenanceService;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory10Code.mmObject();
		}

		@Override
		public List<DataSetCategory10Code> getValue(TMSProtocolParameters3 obj) {
			return obj.getMaintenanceService();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, List<DataSetCategory10Code> value) {
			obj.setMaintenanceService(value);
		}
	};
	@XmlElement(name = "Vrsn", required = true)
	protected Max256Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the TMS protocol parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmVersion
	 * TMSProtocolParameters2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, Max256Text> mmVersion = new MMMessageAttribute<TMSProtocolParameters3, Max256Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the TMS protocol parameters.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(TMSProtocolParameters3 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, Max256Text value) {
			obj.setVersion(value);
		}
	};
	@XmlElement(name = "ApplId")
	protected List<Max35Text> applicationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of applications which may be managed by the TM, partially or globally."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmApplicationIdentification
	 * TMSProtocolParameters2.mmApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, List<Max35Text>> mmApplicationIdentification = new MMMessageAttribute<TMSProtocolParameters3, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of applications which may be managed by the TM, partially or globally.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmApplicationIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(TMSProtocolParameters3 obj) {
			return obj.getApplicationIdentification();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, List<Max35Text> value) {
			obj.setApplicationIdentification(value);
		}
	};
	@XmlElement(name = "HstId", required = true)
	protected Max35Text hostIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the terminal manager host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmHostIdentification
	 * TMSProtocolParameters2.mmHostIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, Max35Text> mmHostIdentification = new MMMessageAttribute<TMSProtocolParameters3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "HstId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostIdentification";
			definition = "Identification of the terminal manager host.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmHostIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TMSProtocolParameters3 obj) {
			return obj.getHostIdentification();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, Max35Text value) {
			obj.setHostIdentification(value);
		}
	};
	@XmlElement(name = "POIId")
	protected Max35Text pOIIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New identification of the POI for the terminal manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmPOIIdentification
	 * TMSProtocolParameters2.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, Optional<Max35Text>> mmPOIIdentification = new MMMessageAttribute<TMSProtocolParameters3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "New identification of the POI for the terminal manager.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TMSProtocolParameters3 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, Optional<Max35Text> value) {
			obj.setPOIIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InitgPtyId")
	protected Max35Text initiatingPartyIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New identification of the initiating party to set in TMS messages with this terminal manager."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmInitiatingPartyIdentification
	 * TMSProtocolParameters2.mmInitiatingPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, Optional<Max35Text>> mmInitiatingPartyIdentification = new MMMessageAttribute<TMSProtocolParameters3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "InitgPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingPartyIdentification";
			definition = "New identification of the initiating party to set in TMS messages with this terminal manager.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmInitiatingPartyIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TMSProtocolParameters3 obj) {
			return obj.getInitiatingPartyIdentification();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, Optional<Max35Text> value) {
			obj.setInitiatingPartyIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptPtyId")
	protected Max35Text recipientPartyIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New identification of the recipient party to set in TMS messages with this terminal manager."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmRecipientPartyIdentification
	 * TMSProtocolParameters2.mmRecipientPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, Optional<Max35Text>> mmRecipientPartyIdentification = new MMMessageAttribute<TMSProtocolParameters3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "RcptPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientPartyIdentification";
			definition = "New identification of the recipient party to set in TMS messages with this terminal manager.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmRecipientPartyIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TMSProtocolParameters3 obj) {
			return obj.getRecipientPartyIdentification();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, Optional<Max35Text> value) {
			obj.setRecipientPartyIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FileTrf")
	protected TrueFalseIndicator fileTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FileTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters are exchanged per file transfer protocol rather than per message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmFileTransfer
	 * TMSProtocolParameters2.mmFileTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSProtocolParameters3, Optional<TrueFalseIndicator>> mmFileTransfer = new MMMessageAttribute<TMSProtocolParameters3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "FileTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileTransfer";
			definition = "Configuration parameters are exchanged per file transfer protocol rather than per message.";
			previousVersion_lazy = () -> TMSProtocolParameters2.mmFileTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(TMSProtocolParameters3 obj) {
			return obj.getFileTransfer();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, Optional<TrueFalseIndicator> value) {
			obj.setFileTransfer(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgItm")
	protected List<MessageItemCondition1> messageItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters3
	 * TMSProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of a message item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSProtocolParameters3, List<MessageItemCondition1>> mmMessageItem = new MMMessageAssociationEnd<TMSProtocolParameters3, List<MessageItemCondition1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "MsgItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageItem";
			definition = "Configuration of a message item.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MessageItemCondition1.mmObject();
		}

		@Override
		public List<MessageItemCondition1> getValue(TMSProtocolParameters3 obj) {
			return obj.getMessageItem();
		}

		@Override
		public void setValue(TMSProtocolParameters3 obj, List<MessageItemCondition1> value) {
			obj.setMessageItem(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSProtocolParameters3.mmActionType, com.tools20022.repository.msg.TMSProtocolParameters3.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.TMSProtocolParameters3.mmMaintenanceService, com.tools20022.repository.msg.TMSProtocolParameters3.mmVersion,
						com.tools20022.repository.msg.TMSProtocolParameters3.mmApplicationIdentification, com.tools20022.repository.msg.TMSProtocolParameters3.mmHostIdentification,
						com.tools20022.repository.msg.TMSProtocolParameters3.mmPOIIdentification, com.tools20022.repository.msg.TMSProtocolParameters3.mmInitiatingPartyIdentification,
						com.tools20022.repository.msg.TMSProtocolParameters3.mmRecipientPartyIdentification, com.tools20022.repository.msg.TMSProtocolParameters3.mmFileTransfer,
						com.tools20022.repository.msg.TMSProtocolParameters3.mmMessageItem);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSProtocolParameters3";
				definition = "Configuration parameters of the TMS protocol between a POI and a terminal manager.";
				previousVersion_lazy = () -> TMSProtocolParameters2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public TMSProtocolParameters3 setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public GenericIdentification71 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public TMSProtocolParameters3 setTerminalManagerIdentification(GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = Objects.requireNonNull(terminalManagerIdentification);
		return this;
	}

	public List<DataSetCategory10Code> getMaintenanceService() {
		return maintenanceService == null ? maintenanceService = new ArrayList<>() : maintenanceService;
	}

	public TMSProtocolParameters3 setMaintenanceService(List<DataSetCategory10Code> maintenanceService) {
		this.maintenanceService = Objects.requireNonNull(maintenanceService);
		return this;
	}

	public Max256Text getVersion() {
		return version;
	}

	public TMSProtocolParameters3 setVersion(Max256Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification == null ? applicationIdentification = new ArrayList<>() : applicationIdentification;
	}

	public TMSProtocolParameters3 setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public Max35Text getHostIdentification() {
		return hostIdentification;
	}

	public TMSProtocolParameters3 setHostIdentification(Max35Text hostIdentification) {
		this.hostIdentification = Objects.requireNonNull(hostIdentification);
		return this;
	}

	public Optional<Max35Text> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public TMSProtocolParameters3 setPOIIdentification(Max35Text pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public Optional<Max35Text> getInitiatingPartyIdentification() {
		return initiatingPartyIdentification == null ? Optional.empty() : Optional.of(initiatingPartyIdentification);
	}

	public TMSProtocolParameters3 setInitiatingPartyIdentification(Max35Text initiatingPartyIdentification) {
		this.initiatingPartyIdentification = initiatingPartyIdentification;
		return this;
	}

	public Optional<Max35Text> getRecipientPartyIdentification() {
		return recipientPartyIdentification == null ? Optional.empty() : Optional.of(recipientPartyIdentification);
	}

	public TMSProtocolParameters3 setRecipientPartyIdentification(Max35Text recipientPartyIdentification) {
		this.recipientPartyIdentification = recipientPartyIdentification;
		return this;
	}

	public Optional<TrueFalseIndicator> getFileTransfer() {
		return fileTransfer == null ? Optional.empty() : Optional.of(fileTransfer);
	}

	public TMSProtocolParameters3 setFileTransfer(TrueFalseIndicator fileTransfer) {
		this.fileTransfer = fileTransfer;
		return this;
	}

	public List<MessageItemCondition1> getMessageItem() {
		return messageItem == null ? messageItem = new ArrayList<>() : messageItem;
	}

	public TMSProtocolParameters3 setMessageItem(List<MessageItemCondition1> messageItem) {
		this.messageItem = Objects.requireNonNull(messageItem);
		return this;
	}
}