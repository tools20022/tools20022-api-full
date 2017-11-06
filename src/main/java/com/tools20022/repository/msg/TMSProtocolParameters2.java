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
import com.tools20022.repository.codeset.DataSetCategory10Code;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmActionType
 * TMSProtocolParameters2.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmTerminalManagerIdentification
 * TMSProtocolParameters2.mmTerminalManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmMaintenanceService
 * TMSProtocolParameters2.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmVersion
 * TMSProtocolParameters2.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmApplicationIdentification
 * TMSProtocolParameters2.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmHostIdentification
 * TMSProtocolParameters2.mmHostIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmPOIIdentification
 * TMSProtocolParameters2.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmInitiatingPartyIdentification
 * TMSProtocolParameters2.mmInitiatingPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmRecipientPartyIdentification
 * TMSProtocolParameters2.mmRecipientPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2#mmFileTransfer
 * TMSProtocolParameters2.mmFileTransfer}</li>
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
 * "TMSProtocolParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration parameters of the TMS protocol between a POI and a terminal manager."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1
 * TMSProtocolParameters1}</li>
 * </ul>
 */
public class TMSProtocolParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction3Code actionType;
	/**
	 * Type of action for the configuration parameters.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmActionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	protected GenericIdentification71 terminalManagerIdentification;
	/**
	 * Identification of the master terminal manager or the terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71
	 * GenericIdentification71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmTerminalManagerIdentification
	 * TMSProtocolParameters1.mmTerminalManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminalManagerIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the master terminal manager or the terminal manager.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmTerminalManagerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification71.mmObject();
		}
	};
	protected List<DataSetCategory10Code> maintenanceService;
	/**
	 * Maintenance services provided by the terminal manager.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmMaintenanceService
	 * TMSProtocolParameters1.mmMaintenanceService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaintenanceService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance services provided by the terminal manager.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmMaintenanceService;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	protected Max256Text version;
	/**
	 * Version of the TMS protocol parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmVersion
	 * TMSProtocolParameters1.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the TMS protocol parameters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected List<Max35Text> applicationIdentification;
	/**
	 * Identification of applications which may be managed by the TM, partially
	 * or globally.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmApplicationIdentification
	 * TMSProtocolParameters1.mmApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of applications which may be managed by the TM, partially or globally.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmApplicationIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text hostIdentification;
	/**
	 * Identification of the terminal manager host.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "HstId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostIdentification";
			definition = "Identification of the terminal manager host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text pOIIdentification;
	/**
	 * New identification of the POI for the terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmPOIIdentification
	 * TMSProtocolParameters1.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "New identification of the POI for the terminal manager.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text initiatingPartyIdentification;
	/**
	 * New identification of the initiating party to set in TMS messages with
	 * this terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmInitiatingPartyIdentification
	 * TMSProtocolParameters1.mmInitiatingPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatingPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "InitgPtyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingPartyIdentification";
			definition = "New identification of the initiating party to set in TMS messages with this terminal manager.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmInitiatingPartyIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text recipientPartyIdentification;
	/**
	 * New identification of the recipient party to set in TMS messages with
	 * this terminal manager
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * "New identification of the recipient party to set in TMS messages with this terminal manager"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters1#mmRecipientPartyIdentification
	 * TMSProtocolParameters1.mmRecipientPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "RcptPtyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientPartyIdentification";
			definition = "New identification of the recipient party to set in TMS messages with this terminal manager";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters1.mmRecipientPartyIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TrueFalseIndicator fileTransfer;
	/**
	 * Configuration parameters are exchanged per file transfer protocol rather
	 * than per message.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmFileTransfer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "FileTrf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileTransfer";
			definition = "Configuration parameters are exchanged per file transfer protocol rather than per message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSProtocolParameters2.mmActionType, com.tools20022.repository.msg.TMSProtocolParameters2.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.TMSProtocolParameters2.mmMaintenanceService, com.tools20022.repository.msg.TMSProtocolParameters2.mmVersion,
						com.tools20022.repository.msg.TMSProtocolParameters2.mmApplicationIdentification, com.tools20022.repository.msg.TMSProtocolParameters2.mmHostIdentification,
						com.tools20022.repository.msg.TMSProtocolParameters2.mmPOIIdentification, com.tools20022.repository.msg.TMSProtocolParameters2.mmInitiatingPartyIdentification,
						com.tools20022.repository.msg.TMSProtocolParameters2.mmRecipientPartyIdentification, com.tools20022.repository.msg.TMSProtocolParameters2.mmFileTransfer);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TMSProtocolParameters2";
				definition = "Configuration parameters of the TMS protocol between a POI and a terminal manager.";
				previousVersion_lazy = () -> TMSProtocolParameters1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public void setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = actionType;
	}

	public GenericIdentification71 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public void setTerminalManagerIdentification(com.tools20022.repository.msg.GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = terminalManagerIdentification;
	}

	public List<DataSetCategory10Code> getMaintenanceService() {
		return maintenanceService;
	}

	public void setMaintenanceService(List<DataSetCategory10Code> maintenanceService) {
		this.maintenanceService = maintenanceService;
	}

	public Max256Text getVersion() {
		return version;
	}

	public void setVersion(Max256Text version) {
		this.version = version;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification;
	}

	public void setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = applicationIdentification;
	}

	public Max35Text getHostIdentification() {
		return hostIdentification;
	}

	public void setHostIdentification(Max35Text hostIdentification) {
		this.hostIdentification = hostIdentification;
	}

	public Max35Text getPOIIdentification() {
		return pOIIdentification;
	}

	public void setPOIIdentification(Max35Text pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
	}

	public Max35Text getInitiatingPartyIdentification() {
		return initiatingPartyIdentification;
	}

	public void setInitiatingPartyIdentification(Max35Text initiatingPartyIdentification) {
		this.initiatingPartyIdentification = initiatingPartyIdentification;
	}

	public Max35Text getRecipientPartyIdentification() {
		return recipientPartyIdentification;
	}

	public void setRecipientPartyIdentification(Max35Text recipientPartyIdentification) {
		this.recipientPartyIdentification = recipientPartyIdentification;
	}

	public TrueFalseIndicator getFileTransfer() {
		return fileTransfer;
	}

	public void setFileTransfer(TrueFalseIndicator fileTransfer) {
		this.fileTransfer = fileTransfer;
	}
}